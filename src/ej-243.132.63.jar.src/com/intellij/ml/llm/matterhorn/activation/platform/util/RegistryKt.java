/*    */ package com.intellij.ml.llm.matterhorn.activation.platform.util;
/*    */ 
/*    */ import com.intellij.openapi.util.registry.RegistryValue;
/*    */ import kotlin.coroutines.Continuation;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\030\n\000\n\002\030\002\n\002\020\013\n\002\030\002\n\000\n\002\020\016\n\002\b\003\032\020\020\000\032\b\022\004\022\0020\0020\001*\0020\003\032\020\020\004\032\b\022\004\022\0020\0050\001*\0020\003\032\020\020\006\032\b\022\004\022\0020\0030\001*\0020\003\032\022\020\007\032\b\022\004\022\0020\0030\001*\0020\003H\002¨\006\b"}, d2 = {"asBooleanFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/intellij/openapi/util/registry/RegistryValue;", "asStringFlow", "", "valueFlow", "valueChangedEvents", "platform"})
/*    */ @SourceDebugExtension({"SMAP\nregistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 registry.kt\ncom/intellij/ml/llm/matterhorn/activation/platform/util/RegistryKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,38:1\n49#2:39\n51#2:43\n49#2:44\n51#2:48\n46#3:40\n51#3:42\n46#3:45\n51#3:47\n105#4:41\n105#4:46\n*S KotlinDebug\n*F\n+ 1 registry.kt\ncom/intellij/ml/llm/matterhorn/activation/platform/util/RegistryKt\n*L\n10#1:39\n10#1:43\n11#1:44\n11#1:48\n10#1:40\n10#1:42\n11#1:45\n11#1:47\n10#1:41\n11#1:46\n*E\n"})
/*    */ public final class RegistryKt {
/*    */   @NotNull
/* 10 */   public static final Flow<Boolean> asBooleanFlow(@NotNull RegistryValue $this$asBooleanFlow) { Intrinsics.checkNotNullParameter($this$asBooleanFlow, "<this>"); Flow<RegistryValue> $this$map$iv = valueFlow($this$asBooleanFlow); int $i$f$map = 0;
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
/* 39 */     Flow<RegistryValue> $this$unsafeTransform$iv$iv = $this$map$iv; int $i$f$unsafeTransform = 0;
/* 40 */     int $i$f$unsafeFlow = 0;
/* 41 */     return new RegistryKt$asBooleanFlow$$inlined$map$1($this$unsafeTransform$iv$iv); } @NotNull public static final Flow<String> asStringFlow(@NotNull RegistryValue $this$asStringFlow) { Intrinsics.checkNotNullParameter($this$asStringFlow, "<this>");
/*    */     Flow<RegistryValue> $this$map$iv = valueFlow($this$asStringFlow);
/*    */     int $i$f$map = 0;
/* 44 */     Flow<RegistryValue> $this$unsafeTransform$iv$iv = $this$map$iv; int $i$f$unsafeTransform = 0;
/* 45 */     int $i$f$unsafeFlow = 0;
/* 46 */     return new RegistryKt$asStringFlow$$inlined$map$1($this$unsafeTransform$iv$iv); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final Flow<RegistryValue> valueFlow(@NotNull RegistryValue $this$valueFlow) {
/*    */     Intrinsics.checkNotNullParameter($this$valueFlow, "<this>");
/*    */     return FlowKt.distinctUntilChangedBy(FlowKt.onStart(valueChangedEvents($this$valueFlow), new RegistryKt$valueFlow$1($this$valueFlow, null)), RegistryKt::valueFlow$lambda$2);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "registry.kt", l = {23}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.platform.util.RegistryKt$valueFlow$1")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/intellij/openapi/util/registry/RegistryValue;"})
/*    */   static final class RegistryKt$valueFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super RegistryValue>, Continuation<? super Unit>, Object> {
/*    */     int label;
/*    */     
/*    */     RegistryKt$valueFlow$1(RegistryValue $receiver, Continuation $completion) {
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
/*    */           if ($this$onStart.emit(this.$this_valueFlow, (Continuation)this) == object)
/*    */             return object; 
/*    */           $this$onStart.emit(this.$this_valueFlow, (Continuation)this);
/*    */           return Unit.INSTANCE;
/*    */         case 1:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           return Unit.INSTANCE;
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super RegistryKt$valueFlow$1> $completion) {
/*    */       RegistryKt$valueFlow$1 registryKt$valueFlow$1 = new RegistryKt$valueFlow$1(this.$this_valueFlow, $completion);
/*    */       registryKt$valueFlow$1.L$0 = value;
/*    */       return (Continuation<Unit>)registryKt$valueFlow$1;
/*    */     }
/*    */     
/*    */     public final Object invoke(FlowCollector p1, Continuation<?> p2) {
/*    */       return ((RegistryKt$valueFlow$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */   
/*    */   private static final String valueFlow$lambda$2(RegistryValue it) {
/*    */     Intrinsics.checkNotNullParameter(it, "it");
/*    */     return it.asString();
/*    */   }
/*    */   
/*    */   private static final Flow<RegistryValue> valueChangedEvents(RegistryValue $this$valueChangedEvents) {
/*    */     return FlowKt.conflate(FlowKt.callbackFlow(new RegistryKt$valueChangedEvents$1($this$valueChangedEvents, null)));
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "registry.kt", l = {35}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.platform.util.RegistryKt$valueChangedEvents$1")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/intellij/openapi/util/registry/RegistryValue;"})
/*    */   static final class RegistryKt$valueChangedEvents$1 extends SuspendLambda implements Function2<ProducerScope<? super RegistryValue>, Continuation<? super Unit>, Object> {
/*    */     int label;
/*    */     
/*    */     RegistryKt$valueChangedEvents$1(RegistryValue $receiver, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       ProducerScope<? super RegistryValue> $this$callbackFlow;
/*    */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           $this$callbackFlow = (ProducerScope)this.L$0;
/*    */           this.$this_valueChangedEvents.addListener(new RegistryValueListener($this$callbackFlow) {
/*    */                 public void afterValueChanged(RegistryValue value) {
/*    */                   Intrinsics.checkNotNullParameter(value, "value");
/*    */                   this.$$this$callbackFlow.trySend-JP2dKIU(value);
/*    */                 }
/*    */               }(CoroutineScope)$this$callbackFlow);
/*    */           this.label = 1;
/*    */           if (ProduceKt.awaitClose($this$callbackFlow, RegistryKt$valueChangedEvents$1::invokeSuspend$lambda$0, (Continuation)this) == object)
/*    */             return object; 
/*    */           ProduceKt.awaitClose($this$callbackFlow, RegistryKt$valueChangedEvents$1::invokeSuspend$lambda$0, (Continuation)this);
/*    */           return Unit.INSTANCE;
/*    */         case 1:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           return Unit.INSTANCE;
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super RegistryKt$valueChangedEvents$1> $completion) {
/*    */       RegistryKt$valueChangedEvents$1 registryKt$valueChangedEvents$1 = new RegistryKt$valueChangedEvents$1(this.$this_valueChangedEvents, $completion);
/*    */       registryKt$valueChangedEvents$1.L$0 = value;
/*    */       return (Continuation<Unit>)registryKt$valueChangedEvents$1;
/*    */     }
/*    */     
/*    */     public final Object invoke(ProducerScope p1, Continuation<?> p2) {
/*    */       return ((RegistryKt$valueChangedEvents$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */     
/*    */     private static final Unit invokeSuspend$lambda$0() {
/*    */       return Unit.INSTANCE;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\platfor\\util\RegistryKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */