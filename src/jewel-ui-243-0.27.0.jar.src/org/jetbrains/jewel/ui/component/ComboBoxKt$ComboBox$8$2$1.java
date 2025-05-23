/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.ui.focus.FocusRequester;
/*     */ import androidx.compose.ui.input.pointer.PointerInputScope;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
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
/*     */ @DebugMetadata(f = "ComboBox.kt", l = {122}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.ComboBoxKt$ComboBox$8$2$1")
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"})
/*     */ final class ComboBoxKt$ComboBox$8$2$1
/*     */   extends SuspendLambda
/*     */   implements Function2<PointerInputScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   ComboBoxKt$ComboBox$8$2$1(FocusRequester $comboBoxFocusRequester, MutableState<Boolean> $popupExpanded$delegate, Function1<Boolean, Unit> $onPopupStateChange, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     // Byte code:
/*     */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   3: astore_3
/*     */     //   4: aload_0
/*     */     //   5: getfield label : I
/*     */     //   8: tableswitch default -> 104, 0 -> 32, 1 -> 94
/*     */     //   32: aload_1
/*     */     //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   36: aload_0
/*     */     //   37: getfield L$0 : Ljava/lang/Object;
/*     */     //   40: checkcast androidx/compose/ui/input/pointer/PointerInputScope
/*     */     //   43: astore_2
/*     */     //   44: aload_2
/*     */     //   45: aload_0
/*     */     //   46: getfield $comboBoxFocusRequester : Landroidx/compose/ui/focus/FocusRequester;
/*     */     //   49: aload_0
/*     */     //   50: getfield $popupExpanded$delegate : Landroidx/compose/runtime/MutableState;
/*     */     //   53: aload_0
/*     */     //   54: getfield $onPopupStateChange : Lkotlin/jvm/functions/Function1;
/*     */     //   57: <illegal opcode> invoke : (Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
/*     */     //   62: aload_0
/*     */     //   63: getfield $onPopupStateChange : Lkotlin/jvm/functions/Function1;
/*     */     //   66: aload_0
/*     */     //   67: getfield $popupExpanded$delegate : Landroidx/compose/runtime/MutableState;
/*     */     //   70: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function0;
/*     */     //   75: aload_0
/*     */     //   76: checkcast kotlin/coroutines/Continuation
/*     */     //   79: aload_0
/*     */     //   80: iconst_1
/*     */     //   81: putfield label : I
/*     */     //   84: invokestatic detectPressAndCancel : (Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   87: dup
/*     */     //   88: aload_3
/*     */     //   89: if_acmpne -> 99
/*     */     //   92: aload_3
/*     */     //   93: areturn
/*     */     //   94: aload_1
/*     */     //   95: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   98: aload_1
/*     */     //   99: pop
/*     */     //   100: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   103: areturn
/*     */     //   104: new java/lang/IllegalStateException
/*     */     //   107: dup
/*     */     //   108: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   110: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   113: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #121	-> 3
/*     */     //   #122	-> 44
/*     */     //   #121	-> 92
/*     */     //   #129	-> 99
/*     */     //   #121	-> 104
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   44	43	2	$this$pointerInput	Landroidx/compose/ui/input/pointer/PointerInputScope;
/*     */     //   0	114	0	this	Lorg/jetbrains/jewel/ui/component/ComboBoxKt$ComboBox$8$2$1;
/*     */     //   36	68	1	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super ComboBoxKt$ComboBox$8$2$1> $completion) {
/*     */     ComboBoxKt$ComboBox$8$2$1 comboBoxKt$ComboBox$8$2$1 = new ComboBoxKt$ComboBox$8$2$1(this.$comboBoxFocusRequester, this.$popupExpanded$delegate, this.$onPopupStateChange, $completion);
/*     */     comboBoxKt$ComboBox$8$2$1.L$0 = value;
/*     */     return (Continuation<Unit>)comboBoxKt$ComboBox$8$2$1;
/*     */   }
/*     */   
/*     */   public final Object invoke(PointerInputScope p1, Continuation<?> p2) {
/*     */     return ((ComboBoxKt$ComboBox$8$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */   
/*     */   private static final Unit invokeSuspend$lambda$0(FocusRequester $comboBoxFocusRequester, MutableState $popupExpanded$delegate, Function1 $onPopupStateChange) {
/* 124 */     ComboBoxKt.access$ComboBox_xYaah8o$setPopupExpanded($onPopupStateChange, $popupExpanded$delegate, !ComboBoxKt.access$ComboBox_xYaah8o$lambda$8($popupExpanded$delegate));
/* 125 */     $comboBoxFocusRequester.requestFocus();
/* 126 */     return Unit.INSTANCE; } private static final Unit invokeSuspend$lambda$1(Function1 $onPopupStateChange, MutableState $popupExpanded$delegate) {
/* 127 */     ComboBoxKt.access$ComboBox_xYaah8o$setPopupExpanded($onPopupStateChange, $popupExpanded$delegate, false); return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ComboBoxKt$ComboBox$8$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */