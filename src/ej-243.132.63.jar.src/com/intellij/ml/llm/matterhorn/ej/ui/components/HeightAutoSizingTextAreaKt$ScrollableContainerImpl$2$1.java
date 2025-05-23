/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*     */ 
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.jewel.ui.component.styling.ScrollbarStyle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nHeightAutoSizingTextArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightAutoSizingTextArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$ScrollableContainerImpl$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n1#2:307\n*E\n"})
/*     */ final class HeightAutoSizingTextAreaKt$ScrollableContainerImpl$2$1
/*     */   implements MeasurePolicy
/*     */ {
/*     */   HeightAutoSizingTextAreaKt$ScrollableContainerImpl$2$1(ScrollbarStyle $scrollbarStyle) {}
/*     */   
/*     */   public final MeasureResult measure-3p2s80s(MeasureScope $this$Layout, List measurables, long incomingConstraints) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc '$this$Layout'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'measurables'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: checkcast java/lang/Iterable
/*     */     //   16: astore #8
/*     */     //   18: aload #8
/*     */     //   20: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   25: astore #9
/*     */     //   27: aload #9
/*     */     //   29: invokeinterface hasNext : ()Z
/*     */     //   34: ifeq -> 74
/*     */     //   37: aload #9
/*     */     //   39: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   44: astore #10
/*     */     //   46: aload #10
/*     */     //   48: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   51: astore #11
/*     */     //   53: iconst_0
/*     */     //   54: istore #12
/*     */     //   56: aload #11
/*     */     //   58: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*     */     //   61: ldc 'ID_VERTICAL_SCROLLBAR'
/*     */     //   63: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   66: ifeq -> 27
/*     */     //   69: aload #10
/*     */     //   71: goto -> 75
/*     */     //   74: aconst_null
/*     */     //   75: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   78: dup
/*     */     //   79: ifnonnull -> 96
/*     */     //   82: pop
/*     */     //   83: new java/lang/IllegalStateException
/*     */     //   86: dup
/*     */     //   87: ldc 'The vertical scrollbar is missing'
/*     */     //   89: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   92: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   95: athrow
/*     */     //   96: astore #5
/*     */     //   98: getstatic androidx/compose/ui/unit/Constraints.Companion : Landroidx/compose/ui/unit/Constraints$Companion;
/*     */     //   101: lload_3
/*     */     //   102: invokestatic getMaxHeight-impl : (J)I
/*     */     //   105: invokevirtual fixedHeight-OenEA2s : (I)J
/*     */     //   108: lstore #6
/*     */     //   110: aload #5
/*     */     //   112: lload #6
/*     */     //   114: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */     //   119: astore #8
/*     */     //   121: invokestatic getHostOs : ()Lorg/jetbrains/skiko/OS;
/*     */     //   124: getstatic org/jetbrains/skiko/OS.MacOS : Lorg/jetbrains/skiko/OS;
/*     */     //   127: if_acmpne -> 134
/*     */     //   130: iconst_1
/*     */     //   131: goto -> 135
/*     */     //   134: iconst_0
/*     */     //   135: istore #9
/*     */     //   137: aload_2
/*     */     //   138: checkcast java/lang/Iterable
/*     */     //   141: astore #13
/*     */     //   143: aload #13
/*     */     //   145: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   150: astore #14
/*     */     //   152: aload #14
/*     */     //   154: invokeinterface hasNext : ()Z
/*     */     //   159: ifeq -> 199
/*     */     //   162: aload #14
/*     */     //   164: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   169: astore #15
/*     */     //   171: aload #15
/*     */     //   173: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   176: astore #16
/*     */     //   178: iconst_0
/*     */     //   179: istore #17
/*     */     //   181: aload #16
/*     */     //   183: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*     */     //   186: ldc 'ID_CONTENT'
/*     */     //   188: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   191: ifeq -> 152
/*     */     //   194: aload #15
/*     */     //   196: goto -> 200
/*     */     //   199: aconst_null
/*     */     //   200: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   203: dup
/*     */     //   204: ifnonnull -> 221
/*     */     //   207: pop
/*     */     //   208: new java/lang/IllegalStateException
/*     */     //   211: dup
/*     */     //   212: ldc 'Content not provided'
/*     */     //   214: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   217: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   220: athrow
/*     */     //   221: astore #10
/*     */     //   223: aload_0
/*     */     //   224: getfield $scrollbarStyle : Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*     */     //   227: invokevirtual getScrollbarVisibility : ()Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;
/*     */     //   230: instanceof org/jetbrains/jewel/ui/component/styling/ScrollbarVisibility$AlwaysVisible
/*     */     //   233: istore #11
/*     */     //   235: iload #9
/*     */     //   237: ifeq -> 245
/*     */     //   240: iload #11
/*     */     //   242: ifeq -> 253
/*     */     //   245: aload #8
/*     */     //   247: invokevirtual getWidth : ()I
/*     */     //   250: goto -> 254
/*     */     //   253: iconst_0
/*     */     //   254: istore #12
/*     */     //   256: lload_3
/*     */     //   257: invokestatic getMaxWidth-impl : (J)I
/*     */     //   260: iload #12
/*     */     //   262: isub
/*     */     //   263: istore #13
/*     */     //   265: iload #13
/*     */     //   267: iload #13
/*     */     //   269: lload_3
/*     */     //   270: invokestatic getMinHeight-impl : (J)I
/*     */     //   273: lload_3
/*     */     //   274: invokestatic getMaxHeight-impl : (J)I
/*     */     //   277: invokestatic Constraints : (IIII)J
/*     */     //   280: lstore #14
/*     */     //   282: aload #10
/*     */     //   284: lload #14
/*     */     //   286: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */     //   291: astore #16
/*     */     //   293: aload #16
/*     */     //   295: invokevirtual getWidth : ()I
/*     */     //   298: iload #12
/*     */     //   300: iadd
/*     */     //   301: istore #17
/*     */     //   303: aload #16
/*     */     //   305: invokevirtual getHeight : ()I
/*     */     //   308: istore #18
/*     */     //   310: aload_1
/*     */     //   311: iload #17
/*     */     //   313: iload #18
/*     */     //   315: aconst_null
/*     */     //   316: aload #16
/*     */     //   318: aload #8
/*     */     //   320: iload #17
/*     */     //   322: <illegal opcode> invoke : (Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;I)Lkotlin/jvm/functions/Function1;
/*     */     //   327: iconst_4
/*     */     //   328: aconst_null
/*     */     //   329: invokestatic layout$default : (Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;
/*     */     //   332: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #180	-> 12
/*     */     //   #307	-> 53
/*     */     //   #180	-> 56
/*     */     //   #180	-> 66
/*     */     //   #180	-> 75
/*     */     //   #181	-> 87
/*     */     //   #180	-> 96
/*     */     //   #179	-> 96
/*     */     //   #183	-> 98
/*     */     //   #185	-> 110
/*     */     //   #184	-> 119
/*     */     //   #187	-> 121
/*     */     //   #189	-> 137
/*     */     //   #307	-> 178
/*     */     //   #189	-> 181
/*     */     //   #189	-> 191
/*     */     //   #189	-> 200
/*     */     //   #188	-> 221
/*     */     //   #191	-> 223
/*     */     //   #193	-> 235
/*     */     //   #196	-> 245
/*     */     //   #198	-> 253
/*     */     //   #193	-> 254
/*     */     //   #192	-> 254
/*     */     //   #201	-> 256
/*     */     //   #204	-> 265
/*     */     //   #205	-> 267
/*     */     //   #206	-> 269
/*     */     //   #207	-> 273
/*     */     //   #203	-> 277
/*     */     //   #202	-> 280
/*     */     //   #209	-> 282
/*     */     //   #210	-> 293
/*     */     //   #212	-> 303
/*     */     //   #214	-> 310
/*     */     //   #221	-> 332
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   56	10	12	$i$a$-find-HeightAutoSizingTextAreaKt$ScrollableContainerImpl$2$1$verticalScrollbarMeasurable$1	I
/*     */     //   53	13	11	it	Landroidx/compose/ui/layout/Measurable;
/*     */     //   181	10	17	$i$a$-find-HeightAutoSizingTextAreaKt$ScrollableContainerImpl$2$1$contentMeasurable$1	I
/*     */     //   178	13	16	it	Landroidx/compose/ui/layout/Measurable;
/*     */     //   98	235	5	verticalScrollbarMeasurable	Landroidx/compose/ui/layout/Measurable;
/*     */     //   110	223	6	verticalScrollbarConstraints	J
/*     */     //   121	212	8	verticalScrollbarPlaceable	Landroidx/compose/ui/layout/Placeable;
/*     */     //   137	196	9	isMacOs	Z
/*     */     //   223	110	10	contentMeasurable	Landroidx/compose/ui/layout/Measurable;
/*     */     //   235	98	11	isAlwaysVisible	Z
/*     */     //   256	77	12	vScrollbarWidth	I
/*     */     //   265	68	13	contentWidth	I
/*     */     //   282	51	14	contentConstraints	J
/*     */     //   293	40	16	contentPlaceable	Landroidx/compose/ui/layout/Placeable;
/*     */     //   303	30	17	width	I
/*     */     //   310	23	18	height	I
/*     */     //   0	333	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$ScrollableContainerImpl$2$1;
/*     */     //   0	333	1	$this$Layout	Landroidx/compose/ui/layout/MeasureScope;
/*     */     //   0	333	2	measurables	Ljava/util/List;
/*     */     //   0	333	3	incomingConstraints	J
/*     */   }
/*     */   
/*     */   private static final Unit measure_3p2s80s$lambda$2(Placeable $contentPlaceable, Placeable $verticalScrollbarPlaceable, int $width, Placeable.PlacementScope $this$layout) {
/* 215 */     Intrinsics.checkNotNullParameter($this$layout, "$this$layout"); $this$layout.placeRelative($contentPlaceable, 0, 0, 0.0F);
/* 216 */     $this$layout.placeRelative($verticalScrollbarPlaceable, 
/* 217 */         $width - $verticalScrollbarPlaceable.getWidth(), 
/* 218 */         0, 
/* 219 */         1.0F);
/*     */     
/* 221 */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\HeightAutoSizingTextAreaKt$ScrollableContainerImpl$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */