/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie.data;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.flow.Flow;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
/*    */ 
/*    */ @DebugMetadata(f = "StateLazy.kt", l = {50}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.data.StateLazyImpl$1$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\020\013\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "hasSubscribers", ""})
/*    */ final class null extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
/*    */   int label;
/*    */   
/*    */   null(StateLazyImpl<T> $receiver, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     // Byte code:
/*    */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   3: astore_3
/*    */     //   4: aload_0
/*    */     //   5: getfield label : I
/*    */     //   8: tableswitch default -> 94, 0 -> 32, 1 -> 84
/*    */     //   32: aload_1
/*    */     //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   36: aload_0
/*    */     //   37: getfield Z$0 : Z
/*    */     //   40: istore_2
/*    */     //   41: iload_2
/*    */     //   42: ifeq -> 90
/*    */     //   45: aload_0
/*    */     //   46: getfield $flow : Lkotlinx/coroutines/flow/Flow;
/*    */     //   49: new com/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazyImpl$1$2$1
/*    */     //   52: dup
/*    */     //   53: aload_0
/*    */     //   54: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazyImpl;
/*    */     //   57: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazyImpl;)V
/*    */     //   60: checkcast kotlinx/coroutines/flow/FlowCollector
/*    */     //   63: aload_0
/*    */     //   64: checkcast kotlin/coroutines/Continuation
/*    */     //   67: aload_0
/*    */     //   68: iconst_1
/*    */     //   69: putfield label : I
/*    */     //   72: invokeinterface collect : (Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   77: dup
/*    */     //   78: aload_3
/*    */     //   79: if_acmpne -> 89
/*    */     //   82: aload_3
/*    */     //   83: areturn
/*    */     //   84: aload_1
/*    */     //   85: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   88: aload_1
/*    */     //   89: pop
/*    */     //   90: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   93: areturn
/*    */     //   94: new java/lang/IllegalStateException
/*    */     //   97: dup
/*    */     //   98: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   100: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   103: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #48	-> 3
/*    */     //   #49	-> 41
/*    */     //   #50	-> 45
/*    */     //   #48	-> 82
/*    */     //   #54	-> 89
/*    */     //   #48	-> 94
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   41	4	2	hasSubscribers	Z
/*    */     //   0	104	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazyImpl$1$2;
/*    */     //   36	58	1	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*    */     Object object = new Object(this.$flow, StateLazyImpl.this, $completion);
/*    */     object.Z$0 = ((Boolean)value).booleanValue();
/*    */     return (Continuation<Unit>)object;
/*    */   }
/*    */   
/*    */   public final Object invoke(boolean p1, Continuation<?> p2) {
/*    */     return ((null)create(Boolean.valueOf(p1), p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\data\StateLazyImpl$1$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */