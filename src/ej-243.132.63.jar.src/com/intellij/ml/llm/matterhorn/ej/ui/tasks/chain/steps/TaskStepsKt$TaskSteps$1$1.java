/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*    */ 
/*    */ import androidx.compose.foundation.lazy.LazyListState;
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import androidx.compose.runtime.SnapshotStateKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
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
/*    */ @DebugMetadata(f = "TaskSteps.kt", l = {61}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.TaskStepsKt$TaskSteps$1$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class TaskStepsKt$TaskSteps$1$1
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   TaskStepsKt$TaskSteps$1$1(LazyListState $lazyListState, MutableState<Boolean> $isProgrammaticScroll$delegate, MutableState<Boolean> $autoScrollEnabled$delegate, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 59 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         
/* 61 */         this.label = 1; if (SnapshotStateKt.snapshotFlow(this.$lazyListState::invokeSuspend$lambda$0).collect(new FlowCollector(this.$lazyListState, this.$isProgrammaticScroll$delegate, this.$autoScrollEnabled$delegate) { public final Object emit(boolean isScrolling, Continuation $completion) { // Byte code:
/*    */                 //   0: iload_1
/*    */                 //   1: ifeq -> 25
/*    */                 //   4: aload_0
/*    */                 //   5: getfield $isProgrammaticScroll$delegate : Landroidx/compose/runtime/MutableState;
/*    */                 //   8: invokestatic access$TaskSteps$lambda$8 : (Landroidx/compose/runtime/MutableState;)Z
/*    */                 //   11: ifne -> 25
/*    */                 //   14: aload_0
/*    */                 //   15: getfield $autoScrollEnabled$delegate : Landroidx/compose/runtime/MutableState;
/*    */                 //   18: iconst_0
/*    */                 //   19: invokestatic access$TaskSteps$lambda$6 : (Landroidx/compose/runtime/MutableState;Z)V
/*    */                 //   22: goto -> 110
/*    */                 //   25: aload_0
/*    */                 //   26: getfield $lazyListState : Landroidx/compose/foundation/lazy/LazyListState;
/*    */                 //   29: invokevirtual getLayoutInfo : ()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;
/*    */                 //   32: invokeinterface getVisibleItemsInfo : ()Ljava/util/List;
/*    */                 //   37: invokestatic lastOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*    */                 //   40: checkcast androidx/compose/foundation/lazy/LazyListItemInfo
/*    */                 //   43: dup
/*    */                 //   44: ifnull -> 58
/*    */                 //   47: invokeinterface getIndex : ()I
/*    */                 //   52: invokestatic boxInt : (I)Ljava/lang/Integer;
/*    */                 //   55: goto -> 60
/*    */                 //   58: pop
/*    */                 //   59: aconst_null
/*    */                 //   60: astore_3
/*    */                 //   61: aload_0
/*    */                 //   62: getfield $lazyListState : Landroidx/compose/foundation/lazy/LazyListState;
/*    */                 //   65: invokevirtual getLayoutInfo : ()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;
/*    */                 //   68: invokeinterface getTotalItemsCount : ()I
/*    */                 //   73: istore #4
/*    */                 //   75: aload_0
/*    */                 //   76: getfield $autoScrollEnabled$delegate : Landroidx/compose/runtime/MutableState;
/*    */                 //   79: aload_3
/*    */                 //   80: iload #4
/*    */                 //   82: iconst_1
/*    */                 //   83: isub
/*    */                 //   84: istore #5
/*    */                 //   86: dup
/*    */                 //   87: ifnonnull -> 94
/*    */                 //   90: pop
/*    */                 //   91: goto -> 106
/*    */                 //   94: invokevirtual intValue : ()I
/*    */                 //   97: iload #5
/*    */                 //   99: if_icmpne -> 106
/*    */                 //   102: iconst_1
/*    */                 //   103: goto -> 107
/*    */                 //   106: iconst_0
/*    */                 //   107: invokestatic access$TaskSteps$lambda$6 : (Landroidx/compose/runtime/MutableState;Z)V
/*    */                 //   110: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */                 //   113: areturn
/*    */                 // Line number table:
/*    */                 //   Java source line number -> byte code offset
/*    */                 //   #62	-> 0
/*    */                 //   #63	-> 14
/*    */                 //   #65	-> 25
/*    */                 //   #66	-> 61
/*    */                 //   #67	-> 75
/*    */                 //   #69	-> 110
/*    */                 // Local variable table:
/*    */                 //   start	length	slot	name	descriptor
/*    */                 //   61	49	3	lastVisible	Ljava/lang/Integer;
/*    */                 //   75	35	4	totalItems	I
/*    */                 //   0	114	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TaskStepsKt$TaskSteps$1$1$2;
/*    */                 //   0	114	1	isScrolling	Z
/* 61 */                 //   0	114	2	$completion	Lkotlin/coroutines/Continuation; } }(Continuation)this) == object) return object;  SnapshotStateKt.snapshotFlow(this.$lazyListState::invokeSuspend$lambda$0).collect(new FlowCollector(this.$lazyListState, this.$isProgrammaticScroll$delegate, this.$autoScrollEnabled$delegate) { public final Object emit(boolean isScrolling, Continuation $completion) { // Byte code:
/*    */                 //   0: iload_1
/*    */                 //   1: ifeq -> 25
/*    */                 //   4: aload_0
/*    */                 //   5: getfield $isProgrammaticScroll$delegate : Landroidx/compose/runtime/MutableState;
/*    */                 //   8: invokestatic access$TaskSteps$lambda$8 : (Landroidx/compose/runtime/MutableState;)Z
/*    */                 //   11: ifne -> 25
/*    */                 //   14: aload_0
/*    */                 //   15: getfield $autoScrollEnabled$delegate : Landroidx/compose/runtime/MutableState;
/*    */                 //   18: iconst_0
/*    */                 //   19: invokestatic access$TaskSteps$lambda$6 : (Landroidx/compose/runtime/MutableState;Z)V
/*    */                 //   22: goto -> 110
/*    */                 //   25: aload_0
/*    */                 //   26: getfield $lazyListState : Landroidx/compose/foundation/lazy/LazyListState;
/*    */                 //   29: invokevirtual getLayoutInfo : ()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;
/*    */                 //   32: invokeinterface getVisibleItemsInfo : ()Ljava/util/List;
/*    */                 //   37: invokestatic lastOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*    */                 //   40: checkcast androidx/compose/foundation/lazy/LazyListItemInfo
/*    */                 //   43: dup
/*    */                 //   44: ifnull -> 58
/*    */                 //   47: invokeinterface getIndex : ()I
/*    */                 //   52: invokestatic boxInt : (I)Ljava/lang/Integer;
/*    */                 //   55: goto -> 60
/*    */                 //   58: pop
/*    */                 //   59: aconst_null
/*    */                 //   60: astore_3
/*    */                 //   61: aload_0
/*    */                 //   62: getfield $lazyListState : Landroidx/compose/foundation/lazy/LazyListState;
/*    */                 //   65: invokevirtual getLayoutInfo : ()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;
/*    */                 //   68: invokeinterface getTotalItemsCount : ()I
/*    */                 //   73: istore #4
/*    */                 //   75: aload_0
/*    */                 //   76: getfield $autoScrollEnabled$delegate : Landroidx/compose/runtime/MutableState;
/*    */                 //   79: aload_3
/*    */                 //   80: iload #4
/*    */                 //   82: iconst_1
/*    */                 //   83: isub
/*    */                 //   84: istore #5
/*    */                 //   86: dup
/*    */                 //   87: ifnonnull -> 94
/*    */                 //   90: pop
/*    */                 //   91: goto -> 106
/*    */                 //   94: invokevirtual intValue : ()I
/*    */                 //   97: iload #5
/*    */                 //   99: if_icmpne -> 106
/*    */                 //   102: iconst_1
/*    */                 //   103: goto -> 107
/*    */                 //   106: iconst_0
/*    */                 //   107: invokestatic access$TaskSteps$lambda$6 : (Landroidx/compose/runtime/MutableState;Z)V
/*    */                 //   110: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */                 //   113: areturn
/*    */                 // Line number table:
/*    */                 //   Java source line number -> byte code offset
/*    */                 //   #62	-> 0
/*    */                 //   #63	-> 14
/*    */                 //   #65	-> 25
/*    */                 //   #66	-> 61
/*    */                 //   #67	-> 75
/*    */                 //   #69	-> 110
/*    */                 // Local variable table:
/*    */                 //   start	length	slot	name	descriptor
/*    */                 //   61	49	3	lastVisible	Ljava/lang/Integer;
/*    */                 //   75	35	4	totalItems	I
/*    */                 //   0	114	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TaskStepsKt$TaskSteps$1$1$2;
/*    */                 //   0	114	1	isScrolling	Z
/* 61 */                 //   0	114	2	$completion	Lkotlin/coroutines/Continuation; } }(Continuation)this);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 70 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super TaskStepsKt$TaskSteps$1$1> $completion) {
/*    */     return (Continuation<Unit>)new TaskStepsKt$TaskSteps$1$1(this.$lazyListState, this.$isProgrammaticScroll$delegate, this.$autoScrollEnabled$delegate, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((TaskStepsKt$TaskSteps$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */   
/*    */   private static final boolean invokeSuspend$lambda$0(LazyListState $lazyListState) {
/*    */     return $lazyListState.isScrollInProgress();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\TaskStepsKt$TaskSteps$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */