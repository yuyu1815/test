/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.gestures.DragScope;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ 
/*     */ @DebugMetadata(f = "Slider.kt", l = {167, 169}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.SliderKt$Slider$3$gestureEndAction$1$1$1")
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class SliderKt$Slider$3$gestureEndAction$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */   int label;
/*     */   
/*     */   SliderKt$Slider$3$gestureEndAction$1$1$1(boolean $canAnimate, SliderDraggableState $draggableState, float $current, float $target, float $velocity, Function0<Unit> $onValueChangeFinished, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     // Byte code:
/*     */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   3: astore_2
/*     */     //   4: aload_0
/*     */     //   5: getfield label : I
/*     */     //   8: tableswitch default -> 170, 0 -> 36, 1 -> 85, 2 -> 142
/*     */     //   36: aload_1
/*     */     //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   40: aload_0
/*     */     //   41: getfield $canAnimate : Z
/*     */     //   44: ifeq -> 94
/*     */     //   47: aload_0
/*     */     //   48: getfield $draggableState : Lorg/jetbrains/jewel/ui/component/SliderDraggableState;
/*     */     //   51: checkcast androidx/compose/foundation/gestures/DraggableState
/*     */     //   54: aload_0
/*     */     //   55: getfield $current : F
/*     */     //   58: aload_0
/*     */     //   59: getfield $target : F
/*     */     //   62: aload_0
/*     */     //   63: getfield $velocity : F
/*     */     //   66: aload_0
/*     */     //   67: checkcast kotlin/coroutines/Continuation
/*     */     //   70: aload_0
/*     */     //   71: iconst_1
/*     */     //   72: putfield label : I
/*     */     //   75: invokestatic access$animateToTarget : (Landroidx/compose/foundation/gestures/DraggableState;FFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   78: dup
/*     */     //   79: aload_2
/*     */     //   80: if_acmpne -> 90
/*     */     //   83: aload_2
/*     */     //   84: areturn
/*     */     //   85: aload_1
/*     */     //   86: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   89: aload_1
/*     */     //   90: pop
/*     */     //   91: goto -> 148
/*     */     //   94: aload_0
/*     */     //   95: getfield $draggableState : Lorg/jetbrains/jewel/ui/component/SliderDraggableState;
/*     */     //   98: checkcast androidx/compose/foundation/gestures/DraggableState
/*     */     //   101: aconst_null
/*     */     //   102: new org/jetbrains/jewel/ui/component/SliderKt$Slider$3$gestureEndAction$1$1$1$1
/*     */     //   105: dup
/*     */     //   106: aload_0
/*     */     //   107: getfield $target : F
/*     */     //   110: aload_0
/*     */     //   111: getfield $current : F
/*     */     //   114: aconst_null
/*     */     //   115: invokespecial <init> : (FFLkotlin/coroutines/Continuation;)V
/*     */     //   118: checkcast kotlin/jvm/functions/Function2
/*     */     //   121: aload_0
/*     */     //   122: checkcast kotlin/coroutines/Continuation
/*     */     //   125: iconst_1
/*     */     //   126: aconst_null
/*     */     //   127: aload_0
/*     */     //   128: iconst_2
/*     */     //   129: putfield label : I
/*     */     //   132: invokestatic drag$default : (Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   135: dup
/*     */     //   136: aload_2
/*     */     //   137: if_acmpne -> 147
/*     */     //   140: aload_2
/*     */     //   141: areturn
/*     */     //   142: aload_1
/*     */     //   143: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   146: aload_1
/*     */     //   147: pop
/*     */     //   148: aload_0
/*     */     //   149: getfield $onValueChangeFinished : Lkotlin/jvm/functions/Function0;
/*     */     //   152: dup
/*     */     //   153: ifnull -> 165
/*     */     //   156: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   161: pop
/*     */     //   162: goto -> 166
/*     */     //   165: pop
/*     */     //   166: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   169: areturn
/*     */     //   170: new java/lang/IllegalStateException
/*     */     //   173: dup
/*     */     //   174: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   176: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   179: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #165	-> 3
/*     */     //   #166	-> 40
/*     */     //   #167	-> 47
/*     */     //   #165	-> 83
/*     */     //   #167	-> 90
/*     */     //   #169	-> 94
/*     */     //   #165	-> 140
/*     */     //   #171	-> 147
/*     */     //   #172	-> 166
/*     */     //   #165	-> 170
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	180	0	this	Lorg/jetbrains/jewel/ui/component/SliderKt$Slider$3$gestureEndAction$1$1$1;
/*     */     //   40	130	1	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super SliderKt$Slider$3$gestureEndAction$1$1$1> $completion) {
/*     */     return (Continuation<Unit>)new SliderKt$Slider$3$gestureEndAction$1$1$1(this.$canAnimate, this.$draggableState, this.$current, this.$target, this.$velocity, this.$onValueChangeFinished, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((SliderKt$Slider$3$gestureEndAction$1$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\SliderKt$Slider$3$gestureEndAction$1$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */