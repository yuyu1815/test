/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.ranges.IntRange;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */ final class ScrollbarKt$verticalMeasurePolicy$1
/*     */   implements MeasurePolicy
/*     */ {
/*     */   ScrollbarKt$verticalMeasurePolicy$1(Function1<Integer, Unit> $setContainerSize, SliderAdapter $sliderAdapter, int $thumbThickness) {}
/*     */   
/*     */   public final MeasureResult measure-3p2s80s(MeasureScope $this$MeasurePolicy, List measurables, long constraints) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc '$this$MeasurePolicy'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'measurables'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_0
/*     */     //   13: getfield $setContainerSize : Lkotlin/jvm/functions/Function1;
/*     */     //   16: lload_3
/*     */     //   17: invokestatic getMaxHeight-impl : (J)I
/*     */     //   20: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   23: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   28: pop
/*     */     //   29: aload_0
/*     */     //   30: getfield $sliderAdapter : Lorg/jetbrains/jewel/ui/component/SliderAdapter;
/*     */     //   33: invokestatic access$getThumbPixelRange : (Lorg/jetbrains/jewel/ui/component/SliderAdapter;)Lkotlin/ranges/IntRange;
/*     */     //   36: astore #5
/*     */     //   38: aload_2
/*     */     //   39: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   42: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   45: getstatic androidx/compose/ui/unit/Constraints.Companion : Landroidx/compose/ui/unit/Constraints$Companion;
/*     */     //   48: lload_3
/*     */     //   49: aload_0
/*     */     //   50: getfield $thumbThickness : I
/*     */     //   53: invokestatic constrainWidth-K40F9xA : (JI)I
/*     */     //   56: aload #5
/*     */     //   58: invokestatic access$getSize : (Lkotlin/ranges/IntRange;)I
/*     */     //   61: invokevirtual fixed-JhjzzOo : (II)J
/*     */     //   64: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */     //   69: astore #6
/*     */     //   71: aload_1
/*     */     //   72: aload #6
/*     */     //   74: invokevirtual getWidth : ()I
/*     */     //   77: lload_3
/*     */     //   78: invokestatic getMaxHeight-impl : (J)I
/*     */     //   81: aconst_null
/*     */     //   82: aload #6
/*     */     //   84: aload #5
/*     */     //   86: <illegal opcode> invoke : (Landroidx/compose/ui/layout/Placeable;Lkotlin/ranges/IntRange;)Lkotlin/jvm/functions/Function1;
/*     */     //   91: iconst_4
/*     */     //   92: aconst_null
/*     */     //   93: invokestatic layout$default : (Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;
/*     */     //   96: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #438	-> 12
/*     */     //   #439	-> 29
/*     */     //   #441	-> 38
/*     */     //   #440	-> 69
/*     */     //   #442	-> 71
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   38	59	5	pixelRange	Lkotlin/ranges/IntRange;
/*     */     //   71	26	6	placeable	Landroidx/compose/ui/layout/Placeable;
/*     */     //   0	97	0	this	Lorg/jetbrains/jewel/ui/component/ScrollbarKt$verticalMeasurePolicy$1;
/*     */     //   0	97	1	$this$MeasurePolicy	Landroidx/compose/ui/layout/MeasureScope;
/*     */     //   0	97	2	measurables	Ljava/util/List;
/*     */     //   0	97	3	constraints	J
/*     */   }
/*     */   
/*     */   private static final Unit measure_3p2s80s$lambda$0(Placeable $placeable, IntRange $pixelRange, Placeable.PlacementScope $this$layout) {
/* 442 */     Intrinsics.checkNotNullParameter($this$layout, "$this$layout"); Placeable.PlacementScope.place$default($this$layout, $placeable, 0, $pixelRange.getFirst(), 0.0F, 4, null); return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ScrollbarKt$verticalMeasurePolicy$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */