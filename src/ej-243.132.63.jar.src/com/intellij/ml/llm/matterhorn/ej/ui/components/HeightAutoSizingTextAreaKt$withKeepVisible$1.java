/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*     */ 
/*     */ import androidx.compose.foundation.gestures.ForEachGestureKt;
/*     */ import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
/*     */ import androidx.compose.ui.input.pointer.PointerInputScope;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.Boxing;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.DelayKt;
/*     */ import kotlinx.coroutines.Job;
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
/*     */ @DebugMetadata(f = "HeightAutoSizingTextArea.kt", l = {232}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.components.HeightAutoSizingTextAreaKt$withKeepVisible$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"})
/*     */ final class HeightAutoSizingTextAreaKt$withKeepVisible$1
/*     */   extends SuspendLambda
/*     */   implements Function2<PointerInputScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   HeightAutoSizingTextAreaKt$withKeepVisible$1(Function1<Boolean, Unit> $onKeepVisibleChange, CoroutineScope $scope, long $lingerDuration, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     PointerInputScope $this$pointerInput;
/*     */     Ref.ObjectRef<Job> delayJob;
/* 230 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$pointerInput = (PointerInputScope)this.L$0;
/* 231 */         delayJob = new Ref.ObjectRef();
/* 232 */         this.label = 1; if (ForEachGestureKt.awaitEachGesture($this$pointerInput, new Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object>(delayJob, this.$onKeepVisibleChange, this.$scope, this.$lingerDuration, null) { int label; public final Object invokeSuspend(Object $result) { // Byte code:
/*     */                 //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                 //   3: astore #4
/*     */                 //   5: aload_0
/*     */                 //   6: getfield label : I
/*     */                 //   9: tableswitch default -> 173, 0 -> 32, 1 -> 69
/*     */                 //   32: aload_1
/*     */                 //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                 //   36: aload_0
/*     */                 //   37: getfield L$0 : Ljava/lang/Object;
/*     */                 //   40: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
/*     */                 //   43: astore_2
/*     */                 //   44: aload_2
/*     */                 //   45: aconst_null
/*     */                 //   46: aload_0
/*     */                 //   47: checkcast kotlin/coroutines/Continuation
/*     */                 //   50: iconst_1
/*     */                 //   51: aconst_null
/*     */                 //   52: aload_0
/*     */                 //   53: iconst_1
/*     */                 //   54: putfield label : I
/*     */                 //   57: invokestatic awaitPointerEvent$default : (Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */                 //   60: dup
/*     */                 //   61: aload #4
/*     */                 //   63: if_acmpne -> 74
/*     */                 //   66: aload #4
/*     */                 //   68: areturn
/*     */                 //   69: aload_1
/*     */                 //   70: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                 //   73: aload_1
/*     */                 //   74: checkcast androidx/compose/ui/input/pointer/PointerEvent
/*     */                 //   77: astore_3
/*     */                 //   78: aload_3
/*     */                 //   79: invokevirtual getType-7fucELk : ()I
/*     */                 //   82: getstatic androidx/compose/ui/input/pointer/PointerEventType.Companion : Landroidx/compose/ui/input/pointer/PointerEventType$Companion;
/*     */                 //   85: invokevirtual getMove-7fucELk : ()I
/*     */                 //   88: invokestatic equals-impl0 : (II)Z
/*     */                 //   91: ifeq -> 169
/*     */                 //   94: aload_0
/*     */                 //   95: getfield $delayJob : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                 //   98: getfield element : Ljava/lang/Object;
/*     */                 //   101: checkcast kotlinx/coroutines/Job
/*     */                 //   104: dup
/*     */                 //   105: ifnull -> 117
/*     */                 //   108: aconst_null
/*     */                 //   109: iconst_1
/*     */                 //   110: aconst_null
/*     */                 //   111: invokestatic cancel$default : (Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
/*     */                 //   114: goto -> 118
/*     */                 //   117: pop
/*     */                 //   118: aload_0
/*     */                 //   119: getfield $onKeepVisibleChange : Lkotlin/jvm/functions/Function1;
/*     */                 //   122: iconst_1
/*     */                 //   123: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */                 //   126: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */                 //   131: pop
/*     */                 //   132: aload_0
/*     */                 //   133: getfield $delayJob : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                 //   136: aload_0
/*     */                 //   137: getfield $scope : Lkotlinx/coroutines/CoroutineScope;
/*     */                 //   140: aconst_null
/*     */                 //   141: aconst_null
/*     */                 //   142: new com/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$withKeepVisible$1$1$1
/*     */                 //   145: dup
/*     */                 //   146: aload_0
/*     */                 //   147: getfield $lingerDuration : J
/*     */                 //   150: aload_0
/*     */                 //   151: getfield $onKeepVisibleChange : Lkotlin/jvm/functions/Function1;
/*     */                 //   154: aconst_null
/*     */                 //   155: invokespecial <init> : (JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
/*     */                 //   158: checkcast kotlin/jvm/functions/Function2
/*     */                 //   161: iconst_3
/*     */                 //   162: aconst_null
/*     */                 //   163: invokestatic launch$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
/*     */                 //   166: putfield element : Ljava/lang/Object;
/*     */                 //   169: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                 //   172: areturn
/*     */                 //   173: new java/lang/IllegalStateException
/*     */                 //   176: dup
/*     */                 //   177: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                 //   179: invokespecial <init> : (Ljava/lang/String;)V
/*     */                 //   182: athrow
/*     */                 // Line number table:
/*     */                 //   Java source line number -> byte code offset
/*     */                 //   #232	-> 3
/*     */                 //   #233	-> 44
/*     */                 //   #232	-> 66
/*     */                 //   #234	-> 78
/*     */                 //   #235	-> 94
/*     */                 //   #236	-> 118
/*     */                 //   #237	-> 132
/*     */                 //   #238	-> 136
/*     */                 //   #237	-> 166
/*     */                 //   #243	-> 169
/*     */                 //   #232	-> 173
/*     */                 // Local variable table:
/*     */                 //   start	length	slot	name	descriptor
/*     */                 //   44	16	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*     */                 //   78	16	3	event	Landroidx/compose/ui/input/pointer/PointerEvent;
/*     */                 //   0	183	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$withKeepVisible$1$1;
/* 232 */                 //   36	137	1	$result	Ljava/lang/Object; } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$delayJob, this.$onKeepVisibleChange, this.$scope, this.$lingerDuration, $completion); function2.L$0 = value; return (Continuation)function2; } public final Object invoke(AwaitPointerEventScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this) == object) return object;  ForEachGestureKt.awaitEachGesture($this$pointerInput, new Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object>(delayJob, this.$onKeepVisibleChange, this.$scope, this.$lingerDuration, null) { int label; public final Object invokeSuspend(Object $result) { // Byte code:
/*     */                 //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                 //   3: astore #4
/*     */                 //   5: aload_0
/*     */                 //   6: getfield label : I
/*     */                 //   9: tableswitch default -> 173, 0 -> 32, 1 -> 69
/*     */                 //   32: aload_1
/*     */                 //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                 //   36: aload_0
/*     */                 //   37: getfield L$0 : Ljava/lang/Object;
/*     */                 //   40: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
/*     */                 //   43: astore_2
/*     */                 //   44: aload_2
/*     */                 //   45: aconst_null
/*     */                 //   46: aload_0
/*     */                 //   47: checkcast kotlin/coroutines/Continuation
/*     */                 //   50: iconst_1
/*     */                 //   51: aconst_null
/*     */                 //   52: aload_0
/*     */                 //   53: iconst_1
/*     */                 //   54: putfield label : I
/*     */                 //   57: invokestatic awaitPointerEvent$default : (Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */                 //   60: dup
/*     */                 //   61: aload #4
/*     */                 //   63: if_acmpne -> 74
/*     */                 //   66: aload #4
/*     */                 //   68: areturn
/*     */                 //   69: aload_1
/*     */                 //   70: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                 //   73: aload_1
/*     */                 //   74: checkcast androidx/compose/ui/input/pointer/PointerEvent
/*     */                 //   77: astore_3
/*     */                 //   78: aload_3
/*     */                 //   79: invokevirtual getType-7fucELk : ()I
/*     */                 //   82: getstatic androidx/compose/ui/input/pointer/PointerEventType.Companion : Landroidx/compose/ui/input/pointer/PointerEventType$Companion;
/*     */                 //   85: invokevirtual getMove-7fucELk : ()I
/*     */                 //   88: invokestatic equals-impl0 : (II)Z
/*     */                 //   91: ifeq -> 169
/*     */                 //   94: aload_0
/*     */                 //   95: getfield $delayJob : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                 //   98: getfield element : Ljava/lang/Object;
/*     */                 //   101: checkcast kotlinx/coroutines/Job
/*     */                 //   104: dup
/*     */                 //   105: ifnull -> 117
/*     */                 //   108: aconst_null
/*     */                 //   109: iconst_1
/*     */                 //   110: aconst_null
/*     */                 //   111: invokestatic cancel$default : (Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
/*     */                 //   114: goto -> 118
/*     */                 //   117: pop
/*     */                 //   118: aload_0
/*     */                 //   119: getfield $onKeepVisibleChange : Lkotlin/jvm/functions/Function1;
/*     */                 //   122: iconst_1
/*     */                 //   123: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */                 //   126: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */                 //   131: pop
/*     */                 //   132: aload_0
/*     */                 //   133: getfield $delayJob : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                 //   136: aload_0
/*     */                 //   137: getfield $scope : Lkotlinx/coroutines/CoroutineScope;
/*     */                 //   140: aconst_null
/*     */                 //   141: aconst_null
/*     */                 //   142: new com/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$withKeepVisible$1$1$1
/*     */                 //   145: dup
/*     */                 //   146: aload_0
/*     */                 //   147: getfield $lingerDuration : J
/*     */                 //   150: aload_0
/*     */                 //   151: getfield $onKeepVisibleChange : Lkotlin/jvm/functions/Function1;
/*     */                 //   154: aconst_null
/*     */                 //   155: invokespecial <init> : (JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
/*     */                 //   158: checkcast kotlin/jvm/functions/Function2
/*     */                 //   161: iconst_3
/*     */                 //   162: aconst_null
/*     */                 //   163: invokestatic launch$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
/*     */                 //   166: putfield element : Ljava/lang/Object;
/*     */                 //   169: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                 //   172: areturn
/*     */                 //   173: new java/lang/IllegalStateException
/*     */                 //   176: dup
/*     */                 //   177: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                 //   179: invokespecial <init> : (Ljava/lang/String;)V
/*     */                 //   182: athrow
/*     */                 // Line number table:
/*     */                 //   Java source line number -> byte code offset
/*     */                 //   #232	-> 3
/*     */                 //   #233	-> 44
/*     */                 //   #232	-> 66
/*     */                 //   #234	-> 78
/*     */                 //   #235	-> 94
/*     */                 //   #236	-> 118
/*     */                 //   #237	-> 132
/*     */                 //   #238	-> 136
/*     */                 //   #237	-> 166
/*     */                 //   #243	-> 169
/*     */                 //   #232	-> 173
/*     */                 // Local variable table:
/*     */                 //   start	length	slot	name	descriptor
/*     */                 //   44	16	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*     */                 //   78	16	3	event	Landroidx/compose/ui/input/pointer/PointerEvent;
/*     */                 //   0	183	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$withKeepVisible$1$1;
/* 232 */                 //   36	137	1	$result	Ljava/lang/Object; } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$delayJob, this.$onKeepVisibleChange, this.$scope, this.$lingerDuration, $completion); function2.L$0 = value; return (Continuation)function2; } public final Object invoke(AwaitPointerEventScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this);
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
/* 244 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super HeightAutoSizingTextAreaKt$withKeepVisible$1> $completion) {
/*     */     HeightAutoSizingTextAreaKt$withKeepVisible$1 heightAutoSizingTextAreaKt$withKeepVisible$1 = new HeightAutoSizingTextAreaKt$withKeepVisible$1(this.$onKeepVisibleChange, this.$scope, this.$lingerDuration, $completion);
/*     */     heightAutoSizingTextAreaKt$withKeepVisible$1.L$0 = value;
/*     */     return (Continuation<Unit>)heightAutoSizingTextAreaKt$withKeepVisible$1;
/*     */   }
/*     */   
/*     */   public final Object invoke(PointerInputScope p1, Continuation<?> p2) {
/*     */     return ((HeightAutoSizingTextAreaKt$withKeepVisible$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\HeightAutoSizingTextAreaKt$withKeepVisible$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */