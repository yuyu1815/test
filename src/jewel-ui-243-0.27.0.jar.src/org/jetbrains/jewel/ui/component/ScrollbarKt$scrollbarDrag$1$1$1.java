/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.gestures.ForEachGestureKt;
/*     */ import androidx.compose.foundation.interaction.DragInteraction;
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
/*     */ import androidx.compose.ui.input.pointer.PointerEventKt;
/*     */ import androidx.compose.ui.input.pointer.PointerInputChange;
/*     */ import androidx.compose.ui.input.pointer.PointerInputScope;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
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
/*     */ @DebugMetadata(f = "Scrollbar.kt", l = {467}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.ScrollbarKt$scrollbarDrag$1$1$1")
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"})
/*     */ final class ScrollbarKt$scrollbarDrag$1$1$1
/*     */   extends SuspendLambda
/*     */   implements Function2<PointerInputScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   ScrollbarKt$scrollbarDrag$1$1$1(State<MutableInteractionSource> $currentInteractionSource$delegate, State<MutableState<DragInteraction.Start>> $currentDraggedInteraction$delegate, State<SliderAdapter> $currentSliderAdapter$delegate, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     PointerInputScope $this$pointerInput;
/* 466 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$pointerInput = (PointerInputScope)this.L$0;
/* 467 */         this.label = 1; if (ForEachGestureKt.awaitEachGesture($this$pointerInput, new Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object>(this.$currentInteractionSource$delegate, this.$currentDraggedInteraction$delegate, this.$currentSliderAdapter$delegate, null) { int label; public final Object invokeSuspend(Object $result) { // Byte code:
/*     */                 //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                 //   3: astore #7
/*     */                 //   5: aload_0
/*     */                 //   6: getfield label : I
/*     */                 //   9: tableswitch default -> 279, 0 -> 36, 1 -> 79, 2 -> 188
/*     */                 //   36: aload_1
/*     */                 //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                 //   40: aload_0
/*     */                 //   41: getfield L$0 : Ljava/lang/Object;
/*     */                 //   44: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
/*     */                 //   47: astore_2
/*     */                 //   48: aload_2
/*     */                 //   49: iconst_0
/*     */                 //   50: aconst_null
/*     */                 //   51: aload_0
/*     */                 //   52: checkcast kotlin/coroutines/Continuation
/*     */                 //   55: iconst_2
/*     */                 //   56: aconst_null
/*     */                 //   57: aload_0
/*     */                 //   58: aload_2
/*     */                 //   59: putfield L$0 : Ljava/lang/Object;
/*     */                 //   62: aload_0
/*     */                 //   63: iconst_1
/*     */                 //   64: putfield label : I
/*     */                 //   67: invokestatic awaitFirstDown$default : (Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */                 //   70: dup
/*     */                 //   71: aload #7
/*     */                 //   73: if_acmpne -> 92
/*     */                 //   76: aload #7
/*     */                 //   78: areturn
/*     */                 //   79: aload_0
/*     */                 //   80: getfield L$0 : Ljava/lang/Object;
/*     */                 //   83: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
/*     */                 //   86: astore_2
/*     */                 //   87: aload_1
/*     */                 //   88: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                 //   91: aload_1
/*     */                 //   92: checkcast androidx/compose/ui/input/pointer/PointerInputChange
/*     */                 //   95: astore_3
/*     */                 //   96: new androidx/compose/foundation/interaction/DragInteraction$Start
/*     */                 //   99: dup
/*     */                 //   100: invokespecial <init> : ()V
/*     */                 //   103: astore #4
/*     */                 //   105: aload_0
/*     */                 //   106: getfield $currentInteractionSource$delegate : Landroidx/compose/runtime/State;
/*     */                 //   109: invokestatic access$invoke$lambda$0 : (Landroidx/compose/runtime/State;)Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */                 //   112: aload #4
/*     */                 //   114: checkcast androidx/compose/foundation/interaction/Interaction
/*     */                 //   117: invokeinterface tryEmit : (Landroidx/compose/foundation/interaction/Interaction;)Z
/*     */                 //   122: pop
/*     */                 //   123: aload_0
/*     */                 //   124: getfield $currentDraggedInteraction$delegate : Landroidx/compose/runtime/State;
/*     */                 //   127: invokestatic access$invoke$lambda$1 : (Landroidx/compose/runtime/State;)Landroidx/compose/runtime/MutableState;
/*     */                 //   130: aload #4
/*     */                 //   132: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */                 //   137: aload_0
/*     */                 //   138: getfield $currentSliderAdapter$delegate : Landroidx/compose/runtime/State;
/*     */                 //   141: invokestatic access$invoke$lambda$2 : (Landroidx/compose/runtime/State;)Lorg/jetbrains/jewel/ui/component/SliderAdapter;
/*     */                 //   144: invokevirtual onDragStarted : ()V
/*     */                 //   147: aload_2
/*     */                 //   148: aload_3
/*     */                 //   149: invokevirtual getId-J3iCeTQ : ()J
/*     */                 //   152: aload_0
/*     */                 //   153: getfield $currentSliderAdapter$delegate : Landroidx/compose/runtime/State;
/*     */                 //   156: <illegal opcode> invoke : (Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function1;
/*     */                 //   161: aload_0
/*     */                 //   162: checkcast kotlin/coroutines/Continuation
/*     */                 //   165: aload_0
/*     */                 //   166: aload #4
/*     */                 //   168: putfield L$0 : Ljava/lang/Object;
/*     */                 //   171: aload_0
/*     */                 //   172: iconst_2
/*     */                 //   173: putfield label : I
/*     */                 //   176: invokestatic drag-jO51t88 : (Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                 //   179: dup
/*     */                 //   180: aload #7
/*     */                 //   182: if_acmpne -> 202
/*     */                 //   185: aload #7
/*     */                 //   187: areturn
/*     */                 //   188: aload_0
/*     */                 //   189: getfield L$0 : Ljava/lang/Object;
/*     */                 //   192: checkcast androidx/compose/foundation/interaction/DragInteraction$Start
/*     */                 //   195: astore #4
/*     */                 //   197: aload_1
/*     */                 //   198: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                 //   201: aload_1
/*     */                 //   202: checkcast java/lang/Boolean
/*     */                 //   205: invokevirtual booleanValue : ()Z
/*     */                 //   208: istore #5
/*     */                 //   210: iload #5
/*     */                 //   212: ifeq -> 230
/*     */                 //   215: new androidx/compose/foundation/interaction/DragInteraction$Stop
/*     */                 //   218: dup
/*     */                 //   219: aload #4
/*     */                 //   221: invokespecial <init> : (Landroidx/compose/foundation/interaction/DragInteraction$Start;)V
/*     */                 //   224: checkcast androidx/compose/foundation/interaction/DragInteraction
/*     */                 //   227: goto -> 242
/*     */                 //   230: new androidx/compose/foundation/interaction/DragInteraction$Cancel
/*     */                 //   233: dup
/*     */                 //   234: aload #4
/*     */                 //   236: invokespecial <init> : (Landroidx/compose/foundation/interaction/DragInteraction$Start;)V
/*     */                 //   239: checkcast androidx/compose/foundation/interaction/DragInteraction
/*     */                 //   242: astore #6
/*     */                 //   244: aload_0
/*     */                 //   245: getfield $currentInteractionSource$delegate : Landroidx/compose/runtime/State;
/*     */                 //   248: invokestatic access$invoke$lambda$0 : (Landroidx/compose/runtime/State;)Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */                 //   251: aload #6
/*     */                 //   253: checkcast androidx/compose/foundation/interaction/Interaction
/*     */                 //   256: invokeinterface tryEmit : (Landroidx/compose/foundation/interaction/Interaction;)Z
/*     */                 //   261: pop
/*     */                 //   262: aload_0
/*     */                 //   263: getfield $currentDraggedInteraction$delegate : Landroidx/compose/runtime/State;
/*     */                 //   266: invokestatic access$invoke$lambda$1 : (Landroidx/compose/runtime/State;)Landroidx/compose/runtime/MutableState;
/*     */                 //   269: aconst_null
/*     */                 //   270: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */                 //   275: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                 //   278: areturn
/*     */                 //   279: new java/lang/IllegalStateException
/*     */                 //   282: dup
/*     */                 //   283: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                 //   285: invokespecial <init> : (Ljava/lang/String;)V
/*     */                 //   288: athrow
/*     */                 // Line number table:
/*     */                 //   Java source line number -> byte code offset
/*     */                 //   #467	-> 3
/*     */                 //   #468	-> 48
/*     */                 //   #467	-> 76
/*     */                 //   #469	-> 96
/*     */                 //   #470	-> 105
/*     */                 //   #471	-> 123
/*     */                 //   #472	-> 137
/*     */                 //   #474	-> 147
/*     */                 //   #467	-> 185
/*     */                 //   #474	-> 202
/*     */                 //   #473	-> 208
/*     */                 //   #479	-> 210
/*     */                 //   #480	-> 215
/*     */                 //   #482	-> 230
/*     */                 //   #479	-> 242
/*     */                 //   #478	-> 242
/*     */                 //   #484	-> 244
/*     */                 //   #485	-> 262
/*     */                 //   #486	-> 275
/*     */                 //   #467	-> 279
/*     */                 // Local variable table:
/*     */                 //   start	length	slot	name	descriptor
/*     */                 //   48	31	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*     */                 //   87	92	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*     */                 //   96	83	3	down	Landroidx/compose/ui/input/pointer/PointerInputChange;
/*     */                 //   105	83	4	interaction	Landroidx/compose/foundation/interaction/DragInteraction$Start;
/*     */                 //   197	33	4	interaction	Landroidx/compose/foundation/interaction/DragInteraction$Start;
/*     */                 //   230	12	4	interaction	Landroidx/compose/foundation/interaction/DragInteraction$Start;
/*     */                 //   210	5	5	isSuccess	Z
/*     */                 //   244	35	6	finishInteraction	Landroidx/compose/foundation/interaction/DragInteraction;
/*     */                 //   0	289	0	this	Lorg/jetbrains/jewel/ui/component/ScrollbarKt$scrollbarDrag$1$1$1$1;
/*     */                 //   40	239	1	$result	Ljava/lang/Object; } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                 Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$currentInteractionSource$delegate, this.$currentDraggedInteraction$delegate, this.$currentSliderAdapter$delegate, $completion);
/*     */                 function2.L$0 = value;
/*     */                 return (Continuation)function2;
/*     */               }
/*     */               public final Object invoke(AwaitPointerEventScope p1, Continuation<?> p2) {
/*     */                 return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */               }
/* 475 */               private static final Unit invokeSuspend$lambda$0(State $currentSliderAdapter$delegate, PointerInputChange change) { ScrollbarKt$scrollbarDrag$1.access$invoke$lambda$2($currentSliderAdapter$delegate).onDragDelta-k-4lQ0M(PointerEventKt.positionChange(change));
/* 476 */                 change.consume();
/* 477 */                 return Unit.INSTANCE; } }(Continuation)this) == object) return object;  ForEachGestureKt.awaitEachGesture($this$pointerInput, new Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object>(this.$currentInteractionSource$delegate, this.$currentDraggedInteraction$delegate, this.$currentSliderAdapter$delegate, null) { int label; private static final Unit invokeSuspend$lambda$0(State $currentSliderAdapter$delegate, PointerInputChange change) { ScrollbarKt$scrollbarDrag$1.access$invoke$lambda$2($currentSliderAdapter$delegate).onDragDelta-k-4lQ0M(PointerEventKt.positionChange(change)); change.consume(); return Unit.INSTANCE; } public final Object invokeSuspend(Object $result) {
/*     */                 // Byte code:
/*     */                 //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                 //   3: astore #7
/*     */                 //   5: aload_0
/*     */                 //   6: getfield label : I
/*     */                 //   9: tableswitch default -> 279, 0 -> 36, 1 -> 79, 2 -> 188
/*     */                 //   36: aload_1
/*     */                 //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                 //   40: aload_0
/*     */                 //   41: getfield L$0 : Ljava/lang/Object;
/*     */                 //   44: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
/*     */                 //   47: astore_2
/*     */                 //   48: aload_2
/*     */                 //   49: iconst_0
/*     */                 //   50: aconst_null
/*     */                 //   51: aload_0
/*     */                 //   52: checkcast kotlin/coroutines/Continuation
/*     */                 //   55: iconst_2
/*     */                 //   56: aconst_null
/*     */                 //   57: aload_0
/*     */                 //   58: aload_2
/*     */                 //   59: putfield L$0 : Ljava/lang/Object;
/*     */                 //   62: aload_0
/*     */                 //   63: iconst_1
/*     */                 //   64: putfield label : I
/*     */                 //   67: invokestatic awaitFirstDown$default : (Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */                 //   70: dup
/*     */                 //   71: aload #7
/*     */                 //   73: if_acmpne -> 92
/*     */                 //   76: aload #7
/*     */                 //   78: areturn
/*     */                 //   79: aload_0
/*     */                 //   80: getfield L$0 : Ljava/lang/Object;
/*     */                 //   83: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
/*     */                 //   86: astore_2
/*     */                 //   87: aload_1
/*     */                 //   88: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                 //   91: aload_1
/*     */                 //   92: checkcast androidx/compose/ui/input/pointer/PointerInputChange
/*     */                 //   95: astore_3
/*     */                 //   96: new androidx/compose/foundation/interaction/DragInteraction$Start
/*     */                 //   99: dup
/*     */                 //   100: invokespecial <init> : ()V
/*     */                 //   103: astore #4
/*     */                 //   105: aload_0
/*     */                 //   106: getfield $currentInteractionSource$delegate : Landroidx/compose/runtime/State;
/*     */                 //   109: invokestatic access$invoke$lambda$0 : (Landroidx/compose/runtime/State;)Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */                 //   112: aload #4
/*     */                 //   114: checkcast androidx/compose/foundation/interaction/Interaction
/*     */                 //   117: invokeinterface tryEmit : (Landroidx/compose/foundation/interaction/Interaction;)Z
/*     */                 //   122: pop
/*     */                 //   123: aload_0
/*     */                 //   124: getfield $currentDraggedInteraction$delegate : Landroidx/compose/runtime/State;
/*     */                 //   127: invokestatic access$invoke$lambda$1 : (Landroidx/compose/runtime/State;)Landroidx/compose/runtime/MutableState;
/*     */                 //   130: aload #4
/*     */                 //   132: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */                 //   137: aload_0
/*     */                 //   138: getfield $currentSliderAdapter$delegate : Landroidx/compose/runtime/State;
/*     */                 //   141: invokestatic access$invoke$lambda$2 : (Landroidx/compose/runtime/State;)Lorg/jetbrains/jewel/ui/component/SliderAdapter;
/*     */                 //   144: invokevirtual onDragStarted : ()V
/*     */                 //   147: aload_2
/*     */                 //   148: aload_3
/*     */                 //   149: invokevirtual getId-J3iCeTQ : ()J
/*     */                 //   152: aload_0
/*     */                 //   153: getfield $currentSliderAdapter$delegate : Landroidx/compose/runtime/State;
/*     */                 //   156: <illegal opcode> invoke : (Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function1;
/*     */                 //   161: aload_0
/*     */                 //   162: checkcast kotlin/coroutines/Continuation
/*     */                 //   165: aload_0
/*     */                 //   166: aload #4
/*     */                 //   168: putfield L$0 : Ljava/lang/Object;
/*     */                 //   171: aload_0
/*     */                 //   172: iconst_2
/*     */                 //   173: putfield label : I
/*     */                 //   176: invokestatic drag-jO51t88 : (Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                 //   179: dup
/*     */                 //   180: aload #7
/*     */                 //   182: if_acmpne -> 202
/*     */                 //   185: aload #7
/*     */                 //   187: areturn
/*     */                 //   188: aload_0
/*     */                 //   189: getfield L$0 : Ljava/lang/Object;
/*     */                 //   192: checkcast androidx/compose/foundation/interaction/DragInteraction$Start
/*     */                 //   195: astore #4
/*     */                 //   197: aload_1
/*     */                 //   198: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                 //   201: aload_1
/*     */                 //   202: checkcast java/lang/Boolean
/*     */                 //   205: invokevirtual booleanValue : ()Z
/*     */                 //   208: istore #5
/*     */                 //   210: iload #5
/*     */                 //   212: ifeq -> 230
/*     */                 //   215: new androidx/compose/foundation/interaction/DragInteraction$Stop
/*     */                 //   218: dup
/*     */                 //   219: aload #4
/*     */                 //   221: invokespecial <init> : (Landroidx/compose/foundation/interaction/DragInteraction$Start;)V
/*     */                 //   224: checkcast androidx/compose/foundation/interaction/DragInteraction
/*     */                 //   227: goto -> 242
/*     */                 //   230: new androidx/compose/foundation/interaction/DragInteraction$Cancel
/*     */                 //   233: dup
/*     */                 //   234: aload #4
/*     */                 //   236: invokespecial <init> : (Landroidx/compose/foundation/interaction/DragInteraction$Start;)V
/*     */                 //   239: checkcast androidx/compose/foundation/interaction/DragInteraction
/*     */                 //   242: astore #6
/*     */                 //   244: aload_0
/*     */                 //   245: getfield $currentInteractionSource$delegate : Landroidx/compose/runtime/State;
/*     */                 //   248: invokestatic access$invoke$lambda$0 : (Landroidx/compose/runtime/State;)Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */                 //   251: aload #6
/*     */                 //   253: checkcast androidx/compose/foundation/interaction/Interaction
/*     */                 //   256: invokeinterface tryEmit : (Landroidx/compose/foundation/interaction/Interaction;)Z
/*     */                 //   261: pop
/*     */                 //   262: aload_0
/*     */                 //   263: getfield $currentDraggedInteraction$delegate : Landroidx/compose/runtime/State;
/*     */                 //   266: invokestatic access$invoke$lambda$1 : (Landroidx/compose/runtime/State;)Landroidx/compose/runtime/MutableState;
/*     */                 //   269: aconst_null
/*     */                 //   270: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */                 //   275: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                 //   278: areturn
/*     */                 //   279: new java/lang/IllegalStateException
/*     */                 //   282: dup
/*     */                 //   283: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                 //   285: invokespecial <init> : (Ljava/lang/String;)V
/*     */                 //   288: athrow
/*     */                 // Line number table:
/*     */                 //   Java source line number -> byte code offset
/*     */                 //   #467	-> 3
/*     */                 //   #468	-> 48
/*     */                 //   #467	-> 76
/*     */                 //   #469	-> 96
/*     */                 //   #470	-> 105
/*     */                 //   #471	-> 123
/*     */                 //   #472	-> 137
/*     */                 //   #474	-> 147
/*     */                 //   #467	-> 185
/*     */                 //   #474	-> 202
/*     */                 //   #473	-> 208
/*     */                 //   #479	-> 210
/*     */                 //   #480	-> 215
/*     */                 //   #482	-> 230
/*     */                 //   #479	-> 242
/*     */                 //   #478	-> 242
/*     */                 //   #484	-> 244
/*     */                 //   #485	-> 262
/*     */                 //   #486	-> 275
/*     */                 //   #467	-> 279
/*     */                 // Local variable table:
/*     */                 //   start	length	slot	name	descriptor
/*     */                 //   48	31	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*     */                 //   87	92	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*     */                 //   96	83	3	down	Landroidx/compose/ui/input/pointer/PointerInputChange;
/*     */                 //   105	83	4	interaction	Landroidx/compose/foundation/interaction/DragInteraction$Start;
/*     */                 //   197	33	4	interaction	Landroidx/compose/foundation/interaction/DragInteraction$Start;
/*     */                 //   230	12	4	interaction	Landroidx/compose/foundation/interaction/DragInteraction$Start;
/*     */                 //   210	5	5	isSuccess	Z
/*     */                 //   244	35	6	finishInteraction	Landroidx/compose/foundation/interaction/DragInteraction;
/*     */                 //   0	289	0	this	Lorg/jetbrains/jewel/ui/component/ScrollbarKt$scrollbarDrag$1$1$1$1;
/*     */                 //   40	239	1	$result	Ljava/lang/Object;
/*     */               } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                 Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$currentInteractionSource$delegate, this.$currentDraggedInteraction$delegate, this.$currentSliderAdapter$delegate, $completion);
/*     */                 function2.L$0 = value;
/*     */                 return (Continuation)function2;
/*     */               } public final Object invoke(AwaitPointerEventScope p1, Continuation<?> p2) {
/*     */                 return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */               } }
/*     */             (Continuation)this);
/* 487 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super ScrollbarKt$scrollbarDrag$1$1$1> $completion) {
/*     */     ScrollbarKt$scrollbarDrag$1$1$1 scrollbarKt$scrollbarDrag$1$1$1 = new ScrollbarKt$scrollbarDrag$1$1$1(this.$currentInteractionSource$delegate, this.$currentDraggedInteraction$delegate, this.$currentSliderAdapter$delegate, $completion);
/*     */     scrollbarKt$scrollbarDrag$1$1$1.L$0 = value;
/*     */     return (Continuation<Unit>)scrollbarKt$scrollbarDrag$1$1$1;
/*     */   }
/*     */   
/*     */   public final Object invoke(PointerInputScope p1, Continuation<?> p2) {
/*     */     return ((ScrollbarKt$scrollbarDrag$1$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ScrollbarKt$scrollbarDrag$1$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */