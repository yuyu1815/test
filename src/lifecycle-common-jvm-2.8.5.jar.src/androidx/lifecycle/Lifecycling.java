/*     */ package androidx.lifecycle;
/*     */ 
/*     */ import androidx.annotation.RestrictTo;
/*     */ import java.lang.reflect.Constructor;
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\002\n\002\020%\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\030\002\n\002\b\006\n\002\020\016\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J \020\r\032\0020\f2\016\020\016\032\n\022\006\b\001\022\0020\f0\0132\006\020\017\032\0020\001H\002J\036\020\020\032\f\022\006\b\001\022\0020\f\030\0010\0132\n\020\021\032\006\022\002\b\0030\bH\002J\020\020\022\032\0020\0232\006\020\024\032\0020\023H\007J\024\020\025\032\0020\0042\n\020\021\032\006\022\002\b\0030\bH\002J\026\020\026\032\0020\0272\f\020\021\032\b\022\002\b\003\030\0010\bH\002J\020\020\030\032\0020\0312\006\020\017\032\0020\001H\007J\024\020\032\032\0020\0042\n\020\021\032\006\022\002\b\0030\bH\002R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000R\036\020\006\032\022\022\b\022\006\022\002\b\0030\b\022\004\022\0020\0040\007X\004¢\006\002\n\000R,\020\t\032 \022\b\022\006\022\002\b\0030\b\022\022\022\020\022\f\022\n\022\006\b\001\022\0020\f0\0130\n0\007X\004¢\006\002\n\000¨\006\033"}, d2 = {"Landroidx/lifecycle/Lifecycling;", "", "()V", "GENERATED_CALLBACK", "", "REFLECTIVE_CALLBACK", "callbackCache", "", "Ljava/lang/Class;", "classToAdapters", "", "Ljava/lang/reflect/Constructor;", "Landroidx/lifecycle/GeneratedAdapter;", "createGeneratedAdapter", "constructor", "object", "generatedConstructor", "klass", "getAdapterName", "", "className", "getObserverConstructorType", "isLifecycleParent", "", "lifecycleEventObserver", "Landroidx/lifecycle/LifecycleEventObserver;", "resolveObserverCallbackType", "lifecycle-common"})
/*     */ @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/*     */ public final class Lifecycling
/*     */ {
/*     */   @NotNull
/*  29 */   public static final Lifecycling INSTANCE = new Lifecycling(); private static final int REFLECTIVE_CALLBACK = 1; @NotNull private static final Map<Class<?>, Integer> callbackCache = new HashMap<>(); private static final int GENERATED_CALLBACK = 2;
/*     */   @NotNull
/*  31 */   private static final Map<Class<?>, List<Constructor<? extends GeneratedAdapter>>> classToAdapters = new HashMap<>();
/*     */   
/*     */   @JvmStatic
/*     */   @NotNull
/*     */   public static final LifecycleEventObserver lifecycleEventObserver(@NotNull Object object) {
/*  36 */     Intrinsics.checkNotNullParameter(object, "object"); boolean isLifecycleEventObserver = object instanceof LifecycleEventObserver;
/*  37 */     boolean isDefaultLifecycleObserver = object instanceof DefaultLifecycleObserver;
/*  38 */     if (isLifecycleEventObserver && isDefaultLifecycleObserver) {
/*  39 */       return new DefaultLifecycleObserverAdapter(
/*  40 */           (DefaultLifecycleObserver)object, 
/*  41 */           (LifecycleEventObserver)object);
/*     */     }
/*     */     
/*  44 */     if (isDefaultLifecycleObserver) {
/*  45 */       return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver)object, null);
/*     */     }
/*  47 */     if (isLifecycleEventObserver) {
/*  48 */       return (LifecycleEventObserver)object;
/*     */     }
/*  50 */     Class<?> klass = object.getClass();
/*  51 */     int type = INSTANCE.getObserverConstructorType(klass);
/*  52 */     if (type == 2) {
/*  53 */       Intrinsics.checkNotNull(classToAdapters.get(klass)); List<Constructor<? extends GeneratedAdapter>> constructors = classToAdapters.get(klass);
/*  54 */       if (constructors.size() == 1) {
/*  55 */         GeneratedAdapter generatedAdapter = INSTANCE.createGeneratedAdapter(
/*  56 */             constructors.get(0), object);
/*     */         
/*  58 */         return new SingleGeneratedAdapterObserver(generatedAdapter);
/*     */       }  byte b; int i; GeneratedAdapter[] arrayOfGeneratedAdapter1;
/*  60 */       for (b = 0, i = constructors.size(), arrayOfGeneratedAdapter1 = new GeneratedAdapter[i]; b < i; ) { byte b1 = b; arrayOfGeneratedAdapter1[b1] = 
/*  61 */           INSTANCE.createGeneratedAdapter(constructors.get(b1), object); b++; }
/*     */        GeneratedAdapter[] adapters = arrayOfGeneratedAdapter1;
/*  63 */       return new CompositeGeneratedAdaptersObserver(adapters);
/*     */     } 
/*  65 */     return new ReflectiveGenericLifecycleObserver(object);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private final GeneratedAdapter createGeneratedAdapter(Constructor constructor, Object object) {
/*     */     GeneratedAdapter generatedAdapter;
/*     */     
/*  73 */     try { Object[] arrayOfObject = new Object[1]; arrayOfObject[0] = object; Intrinsics.checkNotNullExpressionValue(constructor.newInstance(arrayOfObject), "{\n            constructo…tance(`object`)\n        }"); generatedAdapter = (GeneratedAdapter)constructor.newInstance(arrayOfObject); }
/*  74 */     catch (IllegalAccessException e)
/*  75 */     { throw new RuntimeException((Throwable)e); }
/*  76 */     catch (InstantiationException e)
/*  77 */     { throw new RuntimeException((Throwable)e); }
/*  78 */     catch (InvocationTargetException e)
/*  79 */     { throw new RuntimeException((Throwable)e); }  return generatedAdapter;
/*     */   }
/*     */ 
/*     */   
/*     */   private final Constructor<? extends GeneratedAdapter> generatedConstructor(Class klass) {
/*     */     Constructor constructor;
/*     */     
/*  86 */     try { Package aPackage = klass.getPackage();
/*  87 */       String name = klass.getCanonicalName();
/*  88 */       String fullPackage = (aPackage != null) ? aPackage.getName() : "";
/*     */ 
/*     */       
/*  91 */       Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
/*  92 */       Intrinsics.checkNotNullExpressionValue(name, "name"); Intrinsics.checkNotNullExpressionValue(name.substring(fullPackage.length() + 1), "this as java.lang.String).substring(startIndex)"); String str1 = ((((CharSequence)fullPackage).length() == 0)) ? name : name.substring(fullPackage.length() + 1); Intrinsics.checkNotNullExpressionValue(str1, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)"); String adapterName = getAdapterName(str1);
/*     */ 
/*     */       
/*  95 */       Class<?> clazz1 = Class.forName(
/*  96 */           ((((CharSequence)fullPackage).length() == 0)) ? adapterName : (fullPackage + '.' + adapterName)); Intrinsics.checkNotNull(clazz1, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>"); Class<?> aClass = clazz1;
/*     */       
/*  98 */       Class[] arrayOfClass = new Class[1]; arrayOfClass[0] = klass; Constructor<?> constructor1 = aClass.getDeclaredConstructor(arrayOfClass);
/*  99 */       if (!constructor1.isAccessible()) {
/* 100 */         constructor1.setAccessible(true);
/*     */       }
/* 102 */       constructor = constructor1; }
/* 103 */     catch (ClassNotFoundException e)
/* 104 */     { constructor = null; }
/* 105 */     catch (NoSuchMethodException e)
/*     */     
/* 107 */     { throw new RuntimeException((Throwable)e); }  return constructor;
/*     */   }
/*     */ 
/*     */   
/*     */   private final int getObserverConstructorType(Class<?> klass) {
/* 112 */     Integer callbackCache = Lifecycling.callbackCache.get(klass);
/* 113 */     if (callbackCache != null) {
/* 114 */       return callbackCache.intValue();
/*     */     }
/* 116 */     int type = resolveObserverCallbackType(klass); Integer integer1 = Integer.valueOf(type);
/* 117 */     Lifecycling.callbackCache.put(klass, integer1);
/* 118 */     return type;
/*     */   }
/*     */ 
/*     */   
/*     */   private final int resolveObserverCallbackType(Class<?> klass) {
/* 123 */     if (klass.getCanonicalName() == null) {
/* 124 */       return 1;
/*     */     }
/* 126 */     Constructor<? extends GeneratedAdapter> constructor = generatedConstructor(klass);
/* 127 */     if (constructor != null) {
/* 128 */       classToAdapters.put(klass, CollectionsKt.listOf(constructor));
/* 129 */       return 2;
/*     */     } 
/*     */     
/* 132 */     boolean hasLifecycleMethods = ClassesInfoCache.sInstance.hasLifecycleMethods(klass);
/* 133 */     if (hasLifecycleMethods) {
/* 134 */       return 1;
/*     */     }
/* 136 */     Class<?> superclass = klass.getSuperclass();
/* 137 */     List<Constructor<? extends GeneratedAdapter>> adapterConstructors = null;
/* 138 */     if (isLifecycleParent(superclass)) {
/* 139 */       Intrinsics.checkNotNullExpressionValue(superclass, "superclass"); if (getObserverConstructorType(superclass) == 1) {
/* 140 */         return 1;
/*     */       }
/*     */       
/* 143 */       Intrinsics.checkNotNull(classToAdapters.get(superclass)); adapterConstructors = new ArrayList<>(classToAdapters.get(superclass));
/*     */     } 
/*     */     
/* 146 */     Intrinsics.checkNotNullExpressionValue(klass.getInterfaces(), "klass.interfaces"); Class[] arrayOfClass; byte b; int i; for (arrayOfClass = klass.getInterfaces(), b = 0, i = arrayOfClass.length; b < i; ) { Class<?> intrface = arrayOfClass[b];
/* 147 */       if (isLifecycleParent(intrface)) {
/*     */ 
/*     */         
/* 150 */         Intrinsics.checkNotNullExpressionValue(intrface, "intrface"); if (getObserverConstructorType(intrface) == 1) {
/* 151 */           return 1;
/*     */         }
/* 153 */         if (adapterConstructors == null) {
/* 154 */           adapterConstructors = new ArrayList<>();
/*     */         }
/* 156 */         Intrinsics.checkNotNull(classToAdapters.get(intrface)); adapterConstructors.addAll(classToAdapters.get(intrface));
/*     */       }  b++; }
/* 158 */      if (adapterConstructors != null) {
/* 159 */       classToAdapters.put(klass, adapterConstructors);
/* 160 */       return 2;
/*     */     } 
/* 162 */     return 1;
/*     */   }
/*     */   
/*     */   private final boolean isLifecycleParent(Class<?> klass) {
/* 166 */     return (klass != null && LifecycleObserver.class.isAssignableFrom(klass));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @JvmStatic
/*     */   @NotNull
/*     */   public static final String getAdapterName(@NotNull String className) {
/* 174 */     Intrinsics.checkNotNullParameter(className, "className"); return StringsKt.replace$default(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-common-jvm-2.8.5.jar!\androidx\lifecycle\Lifecycling.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */