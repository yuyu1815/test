/*     */ package androidx.lifecycle;
/*     */ 
/*     */ import androidx.annotation.Nullable;
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.lang.reflect.Method;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Deprecated
/*     */ final class ClassesInfoCache
/*     */ {
/*  39 */   static ClassesInfoCache sInstance = new ClassesInfoCache();
/*     */   
/*     */   private static final int CALL_TYPE_NO_ARG = 0;
/*     */   
/*     */   private static final int CALL_TYPE_PROVIDER = 1;
/*     */   private static final int CALL_TYPE_PROVIDER_WITH_EVENT = 2;
/*  45 */   private final Map<Class<?>, CallbackInfo> mCallbackMap = new HashMap<>();
/*  46 */   private final Map<Class<?>, Boolean> mHasLifecycleMethods = new HashMap<>();
/*     */   
/*     */   boolean hasLifecycleMethods(Class<?> klass) {
/*  49 */     Boolean hasLifecycleMethods = this.mHasLifecycleMethods.get(klass);
/*  50 */     if (hasLifecycleMethods != null) {
/*  51 */       return hasLifecycleMethods.booleanValue();
/*     */     }
/*     */     
/*  54 */     Method[] methods = getDeclaredMethods(klass);
/*  55 */     for (Method method : methods) {
/*  56 */       OnLifecycleEvent annotation = method.<OnLifecycleEvent>getAnnotation(OnLifecycleEvent.class);
/*  57 */       if (annotation != null) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  64 */         createInfo(klass, methods);
/*  65 */         return true;
/*     */       } 
/*     */     } 
/*  68 */     this.mHasLifecycleMethods.put(klass, Boolean.valueOf(false));
/*  69 */     return false;
/*     */   }
/*     */   
/*     */   private Method[] getDeclaredMethods(Class<?> klass) {
/*     */     try {
/*  74 */       return klass.getDeclaredMethods();
/*  75 */     } catch (NoClassDefFoundError e) {
/*  76 */       throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   CallbackInfo getInfo(Class<?> klass) {
/*  85 */     CallbackInfo existing = this.mCallbackMap.get(klass);
/*  86 */     if (existing != null) {
/*  87 */       return existing;
/*     */     }
/*  89 */     existing = createInfo(klass, null);
/*  90 */     return existing;
/*     */   }
/*     */ 
/*     */   
/*     */   private void verifyAndPutHandler(Map<MethodReference, Lifecycle.Event> handlers, MethodReference newHandler, Lifecycle.Event newEvent, Class<?> klass) {
/*  95 */     Lifecycle.Event event = handlers.get(newHandler);
/*  96 */     if (event != null && newEvent != event) {
/*  97 */       Method method = newHandler.mMethod;
/*  98 */       throw new IllegalArgumentException("Method " + method
/*  99 */           .getName() + " in " + klass.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event + ", new value " + newEvent);
/*     */     } 
/*     */ 
/*     */     
/* 103 */     if (event == null) {
/* 104 */       handlers.put(newHandler, newEvent);
/*     */     }
/*     */   }
/*     */   
/*     */   private CallbackInfo createInfo(Class<?> klass, @Nullable Method[] declaredMethods) {
/* 109 */     Class<?> superclass = klass.getSuperclass();
/* 110 */     Map<MethodReference, Lifecycle.Event> handlerToEvent = new HashMap<>();
/* 111 */     if (superclass != null) {
/* 112 */       CallbackInfo superInfo = getInfo(superclass);
/* 113 */       if (superInfo != null) {
/* 114 */         handlerToEvent.putAll(superInfo.mHandlerToEvent);
/*     */       }
/*     */     } 
/*     */     
/* 118 */     Class<?>[] interfaces = klass.getInterfaces();
/* 119 */     for (Class<?> intrfc : interfaces) {
/* 120 */       for (Map.Entry<MethodReference, Lifecycle.Event> entry : (getInfo(intrfc)).mHandlerToEvent
/* 121 */         .entrySet()) {
/* 122 */         verifyAndPutHandler(handlerToEvent, entry.getKey(), entry.getValue(), klass);
/*     */       }
/*     */     } 
/*     */     
/* 126 */     Method[] methods = (declaredMethods != null) ? declaredMethods : getDeclaredMethods(klass);
/* 127 */     boolean hasLifecycleMethods = false;
/* 128 */     for (Method method : methods) {
/* 129 */       OnLifecycleEvent annotation = method.<OnLifecycleEvent>getAnnotation(OnLifecycleEvent.class);
/* 130 */       if (annotation != null) {
/*     */ 
/*     */         
/* 133 */         hasLifecycleMethods = true;
/* 134 */         Class<?>[] params = method.getParameterTypes();
/* 135 */         int callType = 0;
/* 136 */         if (params.length > 0) {
/* 137 */           callType = 1;
/* 138 */           if (!LifecycleOwner.class.isAssignableFrom(params[0])) {
/* 139 */             throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
/*     */           }
/*     */         } 
/*     */         
/* 143 */         Lifecycle.Event event = annotation.value();
/*     */         
/* 145 */         if (params.length > 1) {
/* 146 */           callType = 2;
/* 147 */           if (!Lifecycle.Event.class.isAssignableFrom(params[1])) {
/* 148 */             throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
/*     */           }
/*     */           
/* 151 */           if (event != Lifecycle.Event.ON_ANY) {
/* 152 */             throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
/*     */           }
/*     */         } 
/*     */         
/* 156 */         if (params.length > 2) {
/* 157 */           throw new IllegalArgumentException("cannot have more than 2 params");
/*     */         }
/* 159 */         MethodReference methodReference = new MethodReference(callType, method);
/* 160 */         verifyAndPutHandler(handlerToEvent, methodReference, event, klass);
/*     */       } 
/* 162 */     }  CallbackInfo info = new CallbackInfo(handlerToEvent);
/* 163 */     this.mCallbackMap.put(klass, info);
/* 164 */     this.mHasLifecycleMethods.put(klass, Boolean.valueOf(hasLifecycleMethods));
/* 165 */     return info;
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   static class CallbackInfo
/*     */   {
/*     */     final Map<Lifecycle.Event, List<ClassesInfoCache.MethodReference>> mEventToHandlers;
/*     */     final Map<ClassesInfoCache.MethodReference, Lifecycle.Event> mHandlerToEvent;
/*     */     
/*     */     CallbackInfo(Map<ClassesInfoCache.MethodReference, Lifecycle.Event> handlerToEvent) {
/* 175 */       this.mHandlerToEvent = handlerToEvent;
/* 176 */       this.mEventToHandlers = new HashMap<>();
/* 177 */       for (Map.Entry<ClassesInfoCache.MethodReference, Lifecycle.Event> entry : handlerToEvent.entrySet()) {
/* 178 */         Lifecycle.Event event = entry.getValue();
/* 179 */         List<ClassesInfoCache.MethodReference> methodReferences = this.mEventToHandlers.get(event);
/* 180 */         if (methodReferences == null) {
/* 181 */           methodReferences = new ArrayList<>();
/* 182 */           this.mEventToHandlers.put(event, methodReferences);
/*     */         } 
/* 184 */         methodReferences.add(entry.getKey());
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     void invokeCallbacks(LifecycleOwner source, Lifecycle.Event event, Object target) {
/* 190 */       invokeMethodsForEvent(this.mEventToHandlers.get(event), source, event, target);
/* 191 */       invokeMethodsForEvent(this.mEventToHandlers.get(Lifecycle.Event.ON_ANY), source, event, target);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     private static void invokeMethodsForEvent(List<ClassesInfoCache.MethodReference> handlers, LifecycleOwner source, Lifecycle.Event event, Object mWrapped) {
/* 197 */       if (handlers != null) {
/* 198 */         for (int i = handlers.size() - 1; i >= 0; i--) {
/* 199 */           ((ClassesInfoCache.MethodReference)handlers.get(i)).invokeCallback(source, event, mWrapped);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   static final class MethodReference
/*     */   {
/*     */     final int mCallType;
/*     */     final Method mMethod;
/*     */     
/*     */     MethodReference(int callType, Method method) {
/* 212 */       this.mCallType = callType;
/* 213 */       this.mMethod = method;
/* 214 */       this.mMethod.setAccessible(true);
/*     */     }
/*     */ 
/*     */     
/*     */     void invokeCallback(LifecycleOwner source, Lifecycle.Event event, Object target) {
/*     */       try {
/* 220 */         switch (this.mCallType) {
/*     */           case 0:
/* 222 */             this.mMethod.invoke(target, new Object[0]);
/*     */             break;
/*     */           case 1:
/* 225 */             this.mMethod.invoke(target, new Object[] { source });
/*     */             break;
/*     */           case 2:
/* 228 */             this.mMethod.invoke(target, new Object[] { source, event });
/*     */             break;
/*     */         } 
/* 231 */       } catch (InvocationTargetException e) {
/* 232 */         throw new RuntimeException("Failed to call observer method", e.getCause());
/* 233 */       } catch (IllegalAccessException e) {
/* 234 */         throw new RuntimeException(e);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object o) {
/* 240 */       if (this == o) {
/* 241 */         return true;
/*     */       }
/* 243 */       if (!(o instanceof MethodReference)) {
/* 244 */         return false;
/*     */       }
/*     */       
/* 247 */       MethodReference that = (MethodReference)o;
/* 248 */       return (this.mCallType == that.mCallType && this.mMethod.getName().equals(that.mMethod.getName()));
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 253 */       return 31 * this.mCallType + this.mMethod.getName().hashCode();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-common-jvm-2.8.5.jar!\androidx\lifecycle\ClassesInfoCache.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */