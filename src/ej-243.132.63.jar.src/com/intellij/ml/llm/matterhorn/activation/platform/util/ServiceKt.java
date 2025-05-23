/*    */ package com.intellij.ml.llm.matterhorn.activation.platform.util;
/*    */ import com.intellij.ide.plugins.IdeaPluginDescriptor;
/*    */ import com.intellij.openapi.components.ComponentManager;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlinx.coroutines.channels.ProducerScope;
/*    */ import kotlinx.coroutines.flow.Flow;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\"\n\002\b\002\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\032*\020\000\032\002H\001\"\b\b\000\020\001*\0020\002*\0020\0032\f\020\004\032\b\022\004\022\002H\0010\005H@¢\006\002\020\006\032\037\020\007\032\b\022\004\022\002H\0010\b\"\n\b\000\020\001\030\001*\0020\002*\0020\003H\b\032*\020\007\032\b\022\004\022\002H\0010\b\"\b\b\000\020\001*\0020\002*\0020\0032\f\020\004\032\b\022\004\022\002H\0010\005H\007\032\016\020\t\032\b\022\004\022\0020\n0\bH\000¨\006\013"}, d2 = {"getServiceAsync", "T", "", "Lcom/intellij/openapi/components/ComponentManager;", "serviceInterface", "Ljava/lang/Class;", "(Lcom/intellij/openapi/components/ComponentManager;Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dynamicPluginServiceFlow", "Lkotlinx/coroutines/flow/Flow;", "dynamicPluginEvents", "Lcom/intellij/ide/plugins/IdeaPluginDescriptor;", "platform"})
/*    */ @SourceDebugExtension({"SMAP\nservice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 service.kt\ncom/intellij/ml/llm/matterhorn/activation/platform/util/ServiceKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,47:1\n49#2:48\n51#2:52\n49#2:53\n51#2:57\n46#3:49\n51#3:51\n46#3:54\n51#3:56\n105#4:50\n105#4:55\n*S KotlinDebug\n*F\n+ 1 service.kt\ncom/intellij/ml/llm/matterhorn/activation/platform/util/ServiceKt\n*L\n26#1:48\n26#1:52\n28#1:53\n28#1:57\n26#1:49\n26#1:51\n28#1:54\n28#1:56\n26#1:50\n28#1:55\n*E\n"})
/*    */ public final class ServiceKt {
/*    */   @Experimental
/*    */   @Nullable
/*    */   public static final <T> Object getServiceAsync(@NotNull ComponentManager $this$getServiceAsync, @NotNull Class serviceInterface, @NotNull Continuation $completion) {
/* 15 */     Intrinsics.checkNotNull($this$getServiceAsync, "null cannot be cast to non-null type com.intellij.openapi.components.ComponentManagerEx"); return ((ComponentManagerEx)$this$getServiceAsync).getServiceAsync(serviceInterface, $completion);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Experimental
/*    */   @NotNull
/*    */   public static final <T> Flow<T> dynamicPluginServiceFlow(@NotNull ComponentManager $this$dynamicPluginServiceFlow, @NotNull Class serviceInterface) {
/* 25 */     Intrinsics.checkNotNullParameter($this$dynamicPluginServiceFlow, "<this>"); Intrinsics.checkNotNullParameter(serviceInterface, "serviceInterface"); Flow<IdeaPluginDescriptor> flow1 = dynamicPluginEvents();
/* 26 */     int $i$f$map = 0;
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
/* 48 */     Flow<IdeaPluginDescriptor> flow2 = flow1; int $i$f$unsafeTransform = 0;
/* 49 */     int $i$f$unsafeFlow = 0;
/* 50 */     Flow $this$map$iv = FlowKt.onStart(new ServiceKt$dynamicPluginServiceFlow$$inlined$map$1(flow2), new ServiceKt$dynamicPluginServiceFlow$2(null));
/*    */     
/*    */     $i$f$map = 0;
/* 53 */     Flow $this$unsafeTransform$iv$iv = $this$map$iv; $i$f$unsafeTransform = 0;
/* 54 */     $i$f$unsafeFlow = 0;
/* 55 */     return FlowKt.conflate(new ServiceKt$dynamicPluginServiceFlow$$inlined$map$2($this$unsafeTransform$iv$iv, $this$dynamicPluginServiceFlow, serviceInterface));
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "service.kt", l = {27}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.platform.util.ServiceKt$dynamicPluginServiceFlow$2")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0010\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;"})
/*    */   static final class ServiceKt$dynamicPluginServiceFlow$2 extends SuspendLambda implements Function2<FlowCollector<? super Unit>, Continuation<? super Unit>, Object> {
/*    */     int label;
/*    */     
/*    */     ServiceKt$dynamicPluginServiceFlow$2(Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       FlowCollector $this$onStart;
/*    */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           $this$onStart = (FlowCollector)this.L$0;
/*    */           this.label = 1;
/*    */           if ($this$onStart.emit(Unit.INSTANCE, (Continuation)this) == object)
/*    */             return object; 
/*    */           $this$onStart.emit(Unit.INSTANCE, (Continuation)this);
/*    */           return Unit.INSTANCE;
/*    */         case 1:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           return Unit.INSTANCE;
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super ServiceKt$dynamicPluginServiceFlow$2> $completion) {
/*    */       ServiceKt$dynamicPluginServiceFlow$2 serviceKt$dynamicPluginServiceFlow$2 = new ServiceKt$dynamicPluginServiceFlow$2($completion);
/*    */       serviceKt$dynamicPluginServiceFlow$2.L$0 = value;
/*    */       return (Continuation<Unit>)serviceKt$dynamicPluginServiceFlow$2;
/*    */     }
/*    */     
/*    */     public final Object invoke(FlowCollector p1, Continuation<?> p2) {
/*    */       return ((ServiceKt$dynamicPluginServiceFlow$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Flow<IdeaPluginDescriptor> dynamicPluginEvents() {
/*    */     return FlowKt.callbackFlow(new ServiceKt$dynamicPluginEvents$1(null));
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "service.kt", l = {44}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.platform.util.ServiceKt$dynamicPluginEvents$1")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/intellij/ide/plugins/IdeaPluginDescriptor;"})
/*    */   static final class ServiceKt$dynamicPluginEvents$1 extends SuspendLambda implements Function2<ProducerScope<? super IdeaPluginDescriptor>, Continuation<? super Unit>, Object> {
/*    */     int label;
/*    */     
/*    */     ServiceKt$dynamicPluginEvents$1(Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       ProducerScope<? super IdeaPluginDescriptor> $this$callbackFlow;
/*    */       SimpleMessageBusConnection connection;
/*    */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           $this$callbackFlow = (ProducerScope)this.L$0;
/*    */           connection = ApplicationManager.getApplication().getMessageBus().connect((CoroutineScope)$this$callbackFlow);
/*    */           connection.subscribe(DynamicPluginListener.TOPIC, new DynamicPluginListener($this$callbackFlow) {
/*    */                 public void pluginLoaded(IdeaPluginDescriptor pluginDescriptor) {
/*    */                   Intrinsics.checkNotNullParameter(pluginDescriptor, "pluginDescriptor");
/*    */                   onEvent(pluginDescriptor);
/*    */                 }
/*    */                 
/*    */                 public void pluginUnloaded(IdeaPluginDescriptor pluginDescriptor, boolean isUpdate) {
/*    */                   Intrinsics.checkNotNullParameter(pluginDescriptor, "pluginDescriptor");
/*    */                   onEvent(pluginDescriptor);
/*    */                 }
/*    */                 
/*    */                 private final void onEvent(IdeaPluginDescriptor pluginDescriptor) {
/*    */                   this.$$this$callbackFlow.trySend-JP2dKIU(pluginDescriptor);
/*    */                 }
/*    */               });
/*    */           this.label = 1;
/*    */           if (ProduceKt.awaitClose($this$callbackFlow, connection::invokeSuspend$lambda$0, (Continuation)this) == object)
/*    */             return object; 
/*    */           ProduceKt.awaitClose($this$callbackFlow, connection::invokeSuspend$lambda$0, (Continuation)this);
/*    */           return Unit.INSTANCE;
/*    */         case 1:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           return Unit.INSTANCE;
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super ServiceKt$dynamicPluginEvents$1> $completion) {
/*    */       ServiceKt$dynamicPluginEvents$1 serviceKt$dynamicPluginEvents$1 = new ServiceKt$dynamicPluginEvents$1($completion);
/*    */       serviceKt$dynamicPluginEvents$1.L$0 = value;
/*    */       return (Continuation<Unit>)serviceKt$dynamicPluginEvents$1;
/*    */     }
/*    */     
/*    */     public final Object invoke(ProducerScope p1, Continuation<?> p2) {
/*    */       return ((ServiceKt$dynamicPluginEvents$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */     
/*    */     private static final Unit invokeSuspend$lambda$0(SimpleMessageBusConnection $connection) {
/*    */       $connection.disconnect();
/*    */       return Unit.INSTANCE;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\platfor\\util\ServiceKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */