/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie.activity;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ 
/*    */ @DebugMetadata(f = "CompoundOpHandle.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.activity.CompoundOpHandle$awaitOpResult$firstErr$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001\"\006\b\000\020\002 \001*\022\022\016\022\f\022\004\022\002H\002\022\002\b\0030\0040\003H\n"}, d2 = {"<anonymous>", "", "Err", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;"})
/*    */ @SourceDebugExtension({"SMAP\nCompoundOpHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompoundOpHandle.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/activity/CompoundOpHandle$awaitOpResult$firstErr$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,34:1\n1863#2,2:35\n*S KotlinDebug\n*F\n+ 1 CompoundOpHandle.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/activity/CompoundOpHandle$awaitOpResult$firstErr$1\n*L\n15#1:35,2\n*E\n"})
/*    */ final class CompoundOpHandle$awaitOpResult$firstErr$1 extends SuspendLambda implements Function2<ProducerScope<? super OpResult<? extends Err, ?>>, Continuation<? super Unit>, Object> {
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     ProducerScope<? super OpResult<? extends Err, ?>> $this$channelFlow;
/*    */     Iterable $this$forEach$iv;
/*    */     int $i$f$forEach;
/*    */     Iterator iterator;
/* 14 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$channelFlow = (ProducerScope)this.L$0;
/* 15 */         $this$forEach$iv = CompoundOpHandle.access$getHandles$p(CompoundOpHandle.this); $i$f$forEach = 0;
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
/* 35 */         iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); OpHandle<? extends Err> handle = (OpHandle)element$iv; int $i$a$-forEach-CompoundOpHandle$awaitOpResult$firstErr$1$1 = 0;
/*    */           BuildersKt.launch$default((CoroutineScope)$this$channelFlow, null, null, new CompoundOpHandle$awaitOpResult$firstErr$1$1$1(handle, $this$channelFlow, null), 3, null); }
/*    */         
/*    */         return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   int label;
/*    */   
/*    */   CompoundOpHandle$awaitOpResult$firstErr$1(Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super CompoundOpHandle$awaitOpResult$firstErr$1> $completion) {
/*    */     CompoundOpHandle$awaitOpResult$firstErr$1 compoundOpHandle$awaitOpResult$firstErr$1 = new CompoundOpHandle$awaitOpResult$firstErr$1($completion);
/*    */     compoundOpHandle$awaitOpResult$firstErr$1.L$0 = value;
/*    */     return (Continuation<Unit>)compoundOpHandle$awaitOpResult$firstErr$1;
/*    */   }
/*    */   
/*    */   public final Object invoke(ProducerScope p1, Continuation<?> p2) {
/*    */     return ((CompoundOpHandle$awaitOpResult$firstErr$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\activity\CompoundOpHandle$awaitOpResult$firstErr$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */