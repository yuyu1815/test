/*    */ package com.intellij.ml.llm.matterhorn.activation.platform;
/*    */ 
/*    */ import java.util.Map;
/*    */ import java.util.concurrent.ConcurrentHashMap;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.JvmClassMappingKt;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.MutablePropertyReference0;
/*    */ import kotlin.jvm.internal.MutablePropertyReference0Impl;
/*    */ import kotlin.jvm.internal.PropertyReference0;
/*    */ import kotlin.jvm.internal.PropertyReference0Impl;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.coroutines.flow.Flow;
/*    */ import kotlinx.coroutines.flow.FlowKt;
/*    */ import kotlinx.coroutines.flow.MutableStateFlow;
/*    */ import kotlinx.coroutines.flow.StateFlowKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020%\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÂ\002\030\0002\0020\001:\001\016B\t\b\002¢\006\004\b\002\020\003J$\020\b\032\b\022\004\022\002H\n0\t\"\b\b\000\020\n*\0020\0012\f\020\013\032\b\022\004\022\002H\n0\fJ$\020\r\032\b\022\004\022\002H\n0\t\"\b\b\000\020\n*\0020\0012\f\020\013\032\b\022\004\022\002H\n0\fR\"\020\004\032\026\022\b\022\006\022\002\b\0030\006\022\b\022\006\022\002\b\0030\0070\005X\004¢\006\002\n\000¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceMockSupportRegistry;", "", "<init>", "()V", "mockSupportMap", "", "Ljava/lang/Class;", "Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceMockSupportRegistry$MockSupportImpl;", "getRegisteredMutableMockSupportFor", "Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceMockSupport;", "T", "serviceSupport", "Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport;", "getOrCreateMockSupportFor", "MockSupportImpl", "platform"})
/*    */ @SourceDebugExtension({"SMAP\nAiaServiceMockSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiaServiceMockSupport.kt\ncom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceMockSupportRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
/*    */ final class AiaServiceMockSupportRegistry
/*    */ {
/*    */   @NotNull
/* 35 */   public static final AiaServiceMockSupportRegistry INSTANCE = new AiaServiceMockSupportRegistry(); @NotNull private static final Map<Class<?>, MockSupportImpl<?>> mockSupportMap = new ConcurrentHashMap<>();
/*    */   @NotNull
/*    */   public final <T> AiaServiceMockSupport<T> getRegisteredMutableMockSupportFor(@NotNull AiaServiceSupport serviceSupport) {
/* 38 */     Intrinsics.checkNotNullParameter(serviceSupport, "serviceSupport"); Class clazz = JvmClassMappingKt.getJavaClass(serviceSupport.getKeyClass());
/*    */     
/* 40 */     if (mockSupportMap.get(clazz) == null) { mockSupportMap.get(clazz);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 74 */       int $i$a$-requireNotNull-AiaServiceMockSupportRegistry$getRegisteredMutableMockSupportFor$1 = 0;
/*    */       String str = "No mock support for " + clazz.getSimpleName() + " registered";
/*    */       throw new IllegalArgumentException(str.toString()); }
/*    */     
/*    */     Intrinsics.checkNotNull(mockSupportMap.get(clazz), "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.activation.platform.AiaServiceMockSupport<T of com.intellij.ml.llm.matterhorn.activation.platform.AiaServiceMockSupportRegistry.getRegisteredMutableMockSupportFor>");
/*    */     return (AiaServiceMockSupport)mockSupportMap.get(clazz);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final <T> AiaServiceMockSupport<T> getOrCreateMockSupportFor(@NotNull AiaServiceSupport serviceSupport) {
/*    */     Intrinsics.checkNotNullParameter(serviceSupport, "serviceSupport");
/*    */     Intrinsics.checkNotNull(mockSupportMap.computeIfAbsent(JvmClassMappingKt.getJavaClass(serviceSupport.getKeyClass()), serviceSupport::getOrCreateMockSupportFor$lambda$1::getOrCreateMockSupportFor$lambda$2), "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.activation.platform.AiaServiceMockSupport<T of com.intellij.ml.llm.matterhorn.activation.platform.AiaServiceMockSupportRegistry.getOrCreateMockSupportFor>");
/*    */     return (AiaServiceMockSupport)mockSupportMap.computeIfAbsent(JvmClassMappingKt.getJavaClass(serviceSupport.getKeyClass()), serviceSupport::getOrCreateMockSupportFor$lambda$1::getOrCreateMockSupportFor$lambda$2);
/*    */   }
/*    */   
/*    */   private static final MockSupportImpl getOrCreateMockSupportFor$lambda$2(Function1 $tmp0, Object p0) {
/*    */     return (MockSupportImpl)$tmp0.invoke(p0);
/*    */   }
/*    */   
/*    */   private static final MockSupportImpl getOrCreateMockSupportFor$lambda$1(AiaServiceSupport<?> $serviceSupport, Class it) {
/*    */     Intrinsics.checkNotNullParameter(it, "it");
/*    */     return new MockSupportImpl($serviceSupport);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\007\n\002\030\002\n\000\030\000*\b\b\000\020\001*\0020\0022\b\022\004\022\002H\0010\003B\025\022\f\020\004\032\b\022\004\022\0028\0000\005¢\006\004\b\006\020\007J\r\020\027\032\0028\000H\026¢\006\002\020\017J\016\020\030\032\0028\000H@¢\006\002\020\031J\016\020\032\032\b\022\004\022\0028\0000\033H\026R\024\020\004\032\b\022\004\022\0028\0000\005X\004¢\006\002\n\000R\026\020\b\032\n\022\006\022\004\030\0018\0000\tX\004¢\006\002\n\000R/\020\013\032\004\030\0018\0002\b\020\n\032\004\030\0018\0008V@VX\002¢\006\022\032\004\b\016\020\017\"\004\b\020\020\021*\004\b\f\020\rR#\020\022\032\n\022\006\b\001\022\0028\0000\0238VX\002¢\006\f\032\004\b\025\020\026*\004\b\024\020\r¨\006\034"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceMockSupportRegistry$MockSupportImpl;", "T", "", "Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceMockSupport;", "serviceSupport", "Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport;)V", "_mockServiceStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "<set-?>", "mockService", "getMockService$delegate", "(Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceMockSupportRegistry$MockSupportImpl;)Ljava/lang/Object;", "getMockService", "()Ljava/lang/Object;", "setMockService", "(Ljava/lang/Object;)V", "keyClass", "Lkotlin/reflect/KClass;", "getKeyClass$delegate", "getKeyClass", "()Lkotlin/reflect/KClass;", "syncInstance", "instance", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "instanceFlow", "Lkotlinx/coroutines/flow/Flow;", "platform"})
/*    */   public static final class MockSupportImpl<T> implements AiaServiceMockSupport<T> {
/*    */     @NotNull
/*    */     private final AiaServiceSupport<T> serviceSupport;
/*    */     @NotNull
/*    */     private final MutableStateFlow<T> _mockServiceStateFlow;
/*    */     
/*    */     public MockSupportImpl(@NotNull AiaServiceSupport<T> serviceSupport) {
/*    */       this.serviceSupport = serviceSupport;
/*    */       this._mockServiceStateFlow = StateFlowKt.MutableStateFlow(null);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public T getMockService() {
/*    */       return (T)this._mockServiceStateFlow.getValue();
/*    */     }
/*    */     
/*    */     public void setMockService(@Nullable Object <set-?>) {
/*    */       this._mockServiceStateFlow.setValue(<set-?>);
/*    */     }
/*    */     
/*    */     private static Object getMockService$delegate(MockSupportImpl <this>) {
/*    */       return Reflection.mutableProperty0((MutablePropertyReference0)new MutablePropertyReference0Impl(<this>._mockServiceStateFlow, MutableStateFlow.class, "value", "getValue()Ljava/lang/Object;", 0));
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public KClass<? extends T> getKeyClass() {
/*    */       return this.serviceSupport.getKeyClass();
/*    */     }
/*    */     
/*    */     private static Object getKeyClass$delegate(MockSupportImpl <this>) {
/*    */       return Reflection.property0((PropertyReference0)new PropertyReference0Impl(<this>.serviceSupport, AiaServiceSupport.class, "keyClass", "getKeyClass()Lkotlin/reflect/KClass;", 0));
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public T syncInstance() {
/*    */       if (getMockService() == null)
/*    */         getMockService(); 
/*    */       return this.serviceSupport.syncInstance();
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public Object instance(@NotNull Continuation<? super T> $completion) {
/*    */       if (getMockService() == null) {
/*    */         getMockService();
/*    */         return this.serviceSupport.instance($completion);
/*    */       } 
/*    */       return getMockService();
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public Flow<T> instanceFlow() {
/*    */       return FlowKt.combine((Flow)this._mockServiceStateFlow, this.serviceSupport.instanceFlow(), new AiaServiceMockSupportRegistry$MockSupportImpl$instanceFlow$1(null));
/*    */     }
/*    */     
/*    */     @DebugMetadata(f = "AiaServiceMockSupport.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.platform.AiaServiceMockSupportRegistry$MockSupportImpl$instanceFlow$1")
/*    */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\002\b\002\n\002\020\000\n\002\b\002\020\000\032\002H\001\"\b\b\000\020\001*\0020\0022\b\020\003\032\004\030\001H\0012\006\020\004\032\002H\001H\n"}, d2 = {"<anonymous>", "T", "", "mockInstance", "realInstance"})
/*    */     static final class AiaServiceMockSupportRegistry$MockSupportImpl$instanceFlow$1 extends SuspendLambda implements Function3<T, T, Continuation<? super T>, Object> {
/*    */       int label;
/*    */       
/*    */       AiaServiceMockSupportRegistry$MockSupportImpl$instanceFlow$1(Continuation $completion) {
/*    */         super(3, $completion);
/*    */       }
/*    */       
/*    */       public final Object invokeSuspend(Object $result) {
/*    */         Object mockInstance, realInstance;
/*    */         IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */         switch (this.label) {
/*    */           case 0:
/*    */             ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */             mockInstance = this.L$0;
/*    */             realInstance = this.L$1;
/*    */             if (mockInstance == null);
/*    */             return realInstance;
/*    */         } 
/*    */         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */       }
/*    */       
/*    */       public final Object invoke(Object p1, Object p2, Continuation<? super AiaServiceMockSupportRegistry$MockSupportImpl$instanceFlow$1> p3) {
/*    */         AiaServiceMockSupportRegistry$MockSupportImpl$instanceFlow$1 aiaServiceMockSupportRegistry$MockSupportImpl$instanceFlow$1 = new AiaServiceMockSupportRegistry$MockSupportImpl$instanceFlow$1(p3);
/*    */         aiaServiceMockSupportRegistry$MockSupportImpl$instanceFlow$1.L$0 = p1;
/*    */         aiaServiceMockSupportRegistry$MockSupportImpl$instanceFlow$1.L$1 = p2;
/*    */         return aiaServiceMockSupportRegistry$MockSupportImpl$instanceFlow$1.invokeSuspend(Unit.INSTANCE);
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\platform\AiaServiceMockSupportRegistry.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */