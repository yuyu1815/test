/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie.data;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.flow.Flow;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
/*    */ import kotlinx.coroutines.flow.FlowKt;
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
/*    */ @DebugMetadata(f = "StateLazy.kt", l = {48}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.data.StateLazyImpl$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ @SourceDebugExtension({"SMAP\nStateLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateLazy.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazyImpl$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,69:1\n49#2:70\n51#2:74\n46#3:71\n51#3:73\n105#4:72\n*S KotlinDebug\n*F\n+ 1 StateLazy.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazyImpl$1\n*L\n46#1:70\n46#1:74\n46#1:71\n46#1:73\n46#1:72\n*E\n"})
/*    */ final class null
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   null(Flow<T> $flow, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     Flow $this$map$iv;
/*    */     int $i$f$map;
/*    */     Flow $this$unsafeTransform$iv$iv;
/*    */     int $i$f$unsafeTransform, $i$f$unsafeFlow;
/* 45 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 46 */         $this$map$iv = (Flow)StateLazyImpl.access$getSubscriptionCount$p(StateLazyImpl.this); $i$f$map = 0;
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
/* 70 */         $this$unsafeTransform$iv$iv = $this$map$iv; $i$f$unsafeTransform = 0;
/* 71 */         $i$f$unsafeFlow = 0; this.label = 1;
/* 72 */         if (FlowKt.collectLatest(FlowKt.distinctUntilChanged(new StateLazyImpl$1$invokeSuspend$$inlined$map$1($this$unsafeTransform$iv$iv)), new Function2<Boolean, Continuation<? super Unit>, Object>(StateLazyImpl.this, null) { int label; public final Object invokeSuspend(Object $result) { // Byte code:
/*    */                 //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */                 //   3: astore_3
/*    */                 //   4: aload_0
/*    */                 //   5: getfield label : I
/*    */                 //   8: tableswitch default -> 94, 0 -> 32, 1 -> 84
/*    */                 //   32: aload_1
/*    */                 //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                 //   36: aload_0
/*    */                 //   37: getfield Z$0 : Z
/*    */                 //   40: istore_2
/*    */                 //   41: iload_2
/*    */                 //   42: ifeq -> 90
/*    */                 //   45: aload_0
/*    */                 //   46: getfield $flow : Lkotlinx/coroutines/flow/Flow;
/*    */                 //   49: new com/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazyImpl$1$2$1
/*    */                 //   52: dup
/*    */                 //   53: aload_0
/*    */                 //   54: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazyImpl;
/*    */                 //   57: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazyImpl;)V
/*    */                 //   60: checkcast kotlinx/coroutines/flow/FlowCollector
/*    */                 //   63: aload_0
/*    */                 //   64: checkcast kotlin/coroutines/Continuation
/*    */                 //   67: aload_0
/*    */                 //   68: iconst_1
/*    */                 //   69: putfield label : I
/*    */                 //   72: invokeinterface collect : (Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */                 //   77: dup
/*    */                 //   78: aload_3
/*    */                 //   79: if_acmpne -> 89
/*    */                 //   82: aload_3
/*    */                 //   83: areturn
/*    */                 //   84: aload_1
/*    */                 //   85: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                 //   88: aload_1
/*    */                 //   89: pop
/*    */                 //   90: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */                 //   93: areturn
/*    */                 //   94: new java/lang/IllegalStateException
/*    */                 //   97: dup
/*    */                 //   98: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */                 //   100: invokespecial <init> : (Ljava/lang/String;)V
/*    */                 //   103: athrow
/*    */                 // Line number table:
/*    */                 //   Java source line number -> byte code offset
/*    */                 //   #48	-> 3
/*    */                 //   #49	-> 41
/*    */                 //   #50	-> 45
/*    */                 //   #48	-> 82
/*    */                 //   #54	-> 89
/*    */                 //   #48	-> 94
/*    */                 // Local variable table:
/*    */                 //   start	length	slot	name	descriptor
/*    */                 //   41	4	2	hasSubscribers	Z
/*    */                 //   0	104	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazyImpl$1$2;
/* 72 */                 //   36	58	1	$result	Ljava/lang/Object; } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { Function2<Boolean, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$flow, StateLazyImpl.this, $completion); function2.Z$0 = ((Boolean)value).booleanValue(); return (Continuation)function2; } public final Object invoke(boolean p1, Continuation<?> p2) { return ((null)create(Boolean.valueOf(p1), p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this) == object) return object;  FlowKt.collectLatest(FlowKt.distinctUntilChanged(new StateLazyImpl$1$invokeSuspend$$inlined$map$1($this$unsafeTransform$iv$iv)), new Function2<Boolean, Continuation<? super Unit>, Object>(StateLazyImpl.this, null) {
/*    */               int label;
/*    */               
/*    */               public final Object invokeSuspend(Object $result) {
/*    */                 // Byte code:
/*    */                 //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */                 //   3: astore_3
/*    */                 //   4: aload_0
/*    */                 //   5: getfield label : I
/*    */                 //   8: tableswitch default -> 94, 0 -> 32, 1 -> 84
/*    */                 //   32: aload_1
/*    */                 //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                 //   36: aload_0
/*    */                 //   37: getfield Z$0 : Z
/*    */                 //   40: istore_2
/*    */                 //   41: iload_2
/*    */                 //   42: ifeq -> 90
/*    */                 //   45: aload_0
/*    */                 //   46: getfield $flow : Lkotlinx/coroutines/flow/Flow;
/*    */                 //   49: new com/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazyImpl$1$2$1
/*    */                 //   52: dup
/*    */                 //   53: aload_0
/*    */                 //   54: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazyImpl;
/*    */                 //   57: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazyImpl;)V
/*    */                 //   60: checkcast kotlinx/coroutines/flow/FlowCollector
/*    */                 //   63: aload_0
/*    */                 //   64: checkcast kotlin/coroutines/Continuation
/*    */                 //   67: aload_0
/*    */                 //   68: iconst_1
/*    */                 //   69: putfield label : I
/*    */                 //   72: invokeinterface collect : (Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */                 //   77: dup
/*    */                 //   78: aload_3
/*    */                 //   79: if_acmpne -> 89
/*    */                 //   82: aload_3
/*    */                 //   83: areturn
/*    */                 //   84: aload_1
/*    */                 //   85: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                 //   88: aload_1
/*    */                 //   89: pop
/*    */                 //   90: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */                 //   93: areturn
/*    */                 //   94: new java/lang/IllegalStateException
/*    */                 //   97: dup
/*    */                 //   98: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */                 //   100: invokespecial <init> : (Ljava/lang/String;)V
/*    */                 //   103: athrow
/*    */                 // Line number table:
/*    */                 //   Java source line number -> byte code offset
/*    */                 //   #48	-> 3
/*    */                 //   #49	-> 41
/*    */                 //   #50	-> 45
/*    */                 //   #48	-> 82
/*    */                 //   #54	-> 89
/*    */                 //   #48	-> 94
/*    */                 // Local variable table:
/*    */                 //   start	length	slot	name	descriptor
/*    */                 //   41	4	2	hasSubscribers	Z
/*    */                 //   0	104	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazyImpl$1$2;
/*    */                 //   36	58	1	$result	Ljava/lang/Object;
/*    */               }
/*    */               
/*    */               public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*    */                 Function2<Boolean, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$flow, StateLazyImpl.this, $completion);
/*    */                 function2.Z$0 = ((Boolean)value).booleanValue();
/*    */                 return (Continuation)function2;
/*    */               }
/*    */               
/*    */               public final Object invoke(boolean p1, Continuation<?> p2) {
/*    */                 return ((null)create(Boolean.valueOf(p1), p2)).invokeSuspend(Unit.INSTANCE);
/*    */               }
/*    */             }(Continuation)this);
/*    */         return Unit.INSTANCE;
/*    */       case 1:
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*    */     return (Continuation<Unit>)new Object(StateLazyImpl.this, this.$flow, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\data\StateLazyImpl$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */