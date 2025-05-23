/*     */ package org.jetbrains.jewel.ui.component;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @SourceDebugExtension({"SMAP\nScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableContainer.kt\norg/jetbrains/jewel/ui/component/ScrollableContainerKt$ScrollableContainerImpl$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,560:1\n1#2:561\n*E\n"})
/*     */ final class ScrollableContainerKt$ScrollableContainerImpl$2$1
/*     */   implements MeasurePolicy
/*     */ {
/*     */   ScrollableContainerKt$ScrollableContainerImpl$2$1(ScrollbarStyle $scrollbarStyle) {}
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
/*     */     //   16: astore #7
/*     */     //   18: aload #7
/*     */     //   20: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   25: astore #8
/*     */     //   27: aload #8
/*     */     //   29: invokeinterface hasNext : ()Z
/*     */     //   34: ifeq -> 74
/*     */     //   37: aload #8
/*     */     //   39: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   44: astore #9
/*     */     //   46: aload #9
/*     */     //   48: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   51: astore #10
/*     */     //   53: iconst_0
/*     */     //   54: istore #11
/*     */     //   56: aload #10
/*     */     //   58: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*     */     //   61: ldc 'VerticallyScrollableContainer_verticalScrollbar'
/*     */     //   63: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   66: ifeq -> 27
/*     */     //   69: aload #9
/*     */     //   71: goto -> 75
/*     */     //   74: aconst_null
/*     */     //   75: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   78: astore #5
/*     */     //   80: aload_2
/*     */     //   81: checkcast java/lang/Iterable
/*     */     //   84: astore #8
/*     */     //   86: aload #8
/*     */     //   88: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   93: astore #9
/*     */     //   95: aload #9
/*     */     //   97: invokeinterface hasNext : ()Z
/*     */     //   102: ifeq -> 142
/*     */     //   105: aload #9
/*     */     //   107: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   112: astore #10
/*     */     //   114: aload #10
/*     */     //   116: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   119: astore #11
/*     */     //   121: iconst_0
/*     */     //   122: istore #12
/*     */     //   124: aload #11
/*     */     //   126: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*     */     //   129: ldc 'VerticallyScrollableContainer_horizontalScrollbar'
/*     */     //   131: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   134: ifeq -> 95
/*     */     //   137: aload #10
/*     */     //   139: goto -> 143
/*     */     //   142: aconst_null
/*     */     //   143: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   146: astore #6
/*     */     //   148: aload #5
/*     */     //   150: ifnull -> 179
/*     */     //   153: aload #6
/*     */     //   155: ifnull -> 179
/*     */     //   158: aload_1
/*     */     //   159: aload_0
/*     */     //   160: getfield $scrollbarStyle : Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*     */     //   163: invokevirtual getScrollbarVisibility : ()Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;
/*     */     //   166: invokeinterface getTrackThicknessExpanded-D9Ej5fM : ()F
/*     */     //   171: invokeinterface roundToPx-0680j_4 : (F)I
/*     */     //   176: goto -> 180
/*     */     //   179: iconst_0
/*     */     //   180: istore #7
/*     */     //   182: aload #5
/*     */     //   184: ifnull -> 214
/*     */     //   187: getstatic androidx/compose/ui/unit/Constraints.Companion : Landroidx/compose/ui/unit/Constraints$Companion;
/*     */     //   190: lload_3
/*     */     //   191: invokestatic getMaxHeight-impl : (J)I
/*     */     //   194: iload #7
/*     */     //   196: isub
/*     */     //   197: invokevirtual fixedHeight-OenEA2s : (I)J
/*     */     //   200: lstore #9
/*     */     //   202: aload #5
/*     */     //   204: lload #9
/*     */     //   206: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */     //   211: goto -> 215
/*     */     //   214: aconst_null
/*     */     //   215: astore #8
/*     */     //   217: aload #6
/*     */     //   219: ifnull -> 249
/*     */     //   222: getstatic androidx/compose/ui/unit/Constraints.Companion : Landroidx/compose/ui/unit/Constraints$Companion;
/*     */     //   225: lload_3
/*     */     //   226: invokestatic getMaxWidth-impl : (J)I
/*     */     //   229: iload #7
/*     */     //   231: isub
/*     */     //   232: invokevirtual fixedWidth-OenEA2s : (I)J
/*     */     //   235: lstore #10
/*     */     //   237: aload #6
/*     */     //   239: lload #10
/*     */     //   241: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */     //   246: goto -> 250
/*     */     //   249: aconst_null
/*     */     //   250: astore #9
/*     */     //   252: invokestatic getHostOs : ()Lorg/jetbrains/skiko/OS;
/*     */     //   255: getstatic org/jetbrains/skiko/OS.MacOS : Lorg/jetbrains/skiko/OS;
/*     */     //   258: if_acmpne -> 265
/*     */     //   261: iconst_1
/*     */     //   262: goto -> 266
/*     */     //   265: iconst_0
/*     */     //   266: istore #10
/*     */     //   268: aload_2
/*     */     //   269: checkcast java/lang/Iterable
/*     */     //   272: astore #14
/*     */     //   274: aload #14
/*     */     //   276: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   281: astore #15
/*     */     //   283: aload #15
/*     */     //   285: invokeinterface hasNext : ()Z
/*     */     //   290: ifeq -> 330
/*     */     //   293: aload #15
/*     */     //   295: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   300: astore #16
/*     */     //   302: aload #16
/*     */     //   304: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   307: astore #17
/*     */     //   309: iconst_0
/*     */     //   310: istore #18
/*     */     //   312: aload #17
/*     */     //   314: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*     */     //   317: ldc 'VerticallyScrollableContainer_content'
/*     */     //   319: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   322: ifeq -> 283
/*     */     //   325: aload #16
/*     */     //   327: goto -> 331
/*     */     //   330: aconst_null
/*     */     //   331: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   334: dup
/*     */     //   335: ifnonnull -> 352
/*     */     //   338: pop
/*     */     //   339: new java/lang/IllegalStateException
/*     */     //   342: dup
/*     */     //   343: ldc 'Content not provided'
/*     */     //   345: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   348: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   351: athrow
/*     */     //   352: astore #11
/*     */     //   354: aload_0
/*     */     //   355: getfield $scrollbarStyle : Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*     */     //   358: iload #10
/*     */     //   360: lload_3
/*     */     //   361: aload #8
/*     */     //   363: aload #9
/*     */     //   365: invokestatic access$computeContentConstraints-L1NQ6kE : (Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;ZJLandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;)J
/*     */     //   368: lstore #12
/*     */     //   370: aload #11
/*     */     //   372: lload #12
/*     */     //   374: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */     //   379: astore #14
/*     */     //   381: aload_0
/*     */     //   382: getfield $scrollbarStyle : Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*     */     //   385: invokevirtual getScrollbarVisibility : ()Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;
/*     */     //   388: instanceof org/jetbrains/jewel/ui/component/styling/ScrollbarVisibility$AlwaysVisible
/*     */     //   391: istore #15
/*     */     //   393: nop
/*     */     //   394: iload #10
/*     */     //   396: ifne -> 403
/*     */     //   399: iconst_0
/*     */     //   400: goto -> 426
/*     */     //   403: iload #15
/*     */     //   405: ifeq -> 425
/*     */     //   408: aload #8
/*     */     //   410: dup
/*     */     //   411: ifnull -> 420
/*     */     //   414: invokevirtual getWidth : ()I
/*     */     //   417: goto -> 426
/*     */     //   420: pop
/*     */     //   421: iconst_0
/*     */     //   422: goto -> 426
/*     */     //   425: iconst_0
/*     */     //   426: istore #16
/*     */     //   428: aload #14
/*     */     //   430: invokevirtual getWidth : ()I
/*     */     //   433: iload #16
/*     */     //   435: iadd
/*     */     //   436: istore #17
/*     */     //   438: nop
/*     */     //   439: iload #10
/*     */     //   441: ifne -> 448
/*     */     //   444: iconst_0
/*     */     //   445: goto -> 471
/*     */     //   448: iload #15
/*     */     //   450: ifeq -> 470
/*     */     //   453: aload #9
/*     */     //   455: dup
/*     */     //   456: ifnull -> 465
/*     */     //   459: invokevirtual getHeight : ()I
/*     */     //   462: goto -> 471
/*     */     //   465: pop
/*     */     //   466: iconst_0
/*     */     //   467: goto -> 471
/*     */     //   470: iconst_0
/*     */     //   471: istore #18
/*     */     //   473: aload #14
/*     */     //   475: invokevirtual getHeight : ()I
/*     */     //   478: iload #18
/*     */     //   480: iadd
/*     */     //   481: istore #19
/*     */     //   483: aload_1
/*     */     //   484: iload #17
/*     */     //   486: iload #19
/*     */     //   488: aconst_null
/*     */     //   489: aload #14
/*     */     //   491: aload #8
/*     */     //   493: iload #17
/*     */     //   495: aload #9
/*     */     //   497: iload #19
/*     */     //   499: <illegal opcode> invoke : (Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ILandroidx/compose/ui/layout/Placeable;I)Lkotlin/jvm/functions/Function1;
/*     */     //   504: iconst_4
/*     */     //   505: aconst_null
/*     */     //   506: invokestatic layout$default : (Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;
/*     */     //   509: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #432	-> 12
/*     */     //   #561	-> 53
/*     */     //   #432	-> 56
/*     */     //   #432	-> 66
/*     */     //   #432	-> 75
/*     */     //   #433	-> 80
/*     */     //   #561	-> 121
/*     */     //   #433	-> 124
/*     */     //   #433	-> 134
/*     */     //   #433	-> 143
/*     */     //   #437	-> 148
/*     */     //   #438	-> 158
/*     */     //   #439	-> 179
/*     */     //   #437	-> 180
/*     */     //   #436	-> 180
/*     */     //   #442	-> 182
/*     */     //   #444	-> 187
/*     */     //   #443	-> 200
/*     */     //   #445	-> 202
/*     */     //   #446	-> 214
/*     */     //   #442	-> 215
/*     */     //   #441	-> 215
/*     */     //   #449	-> 217
/*     */     //   #451	-> 222
/*     */     //   #450	-> 235
/*     */     //   #452	-> 237
/*     */     //   #453	-> 249
/*     */     //   #449	-> 250
/*     */     //   #448	-> 250
/*     */     //   #455	-> 252
/*     */     //   #456	-> 268
/*     */     //   #561	-> 309
/*     */     //   #456	-> 312
/*     */     //   #456	-> 322
/*     */     //   #456	-> 331
/*     */     //   #459	-> 354
/*     */     //   #460	-> 358
/*     */     //   #461	-> 360
/*     */     //   #462	-> 361
/*     */     //   #463	-> 363
/*     */     //   #458	-> 365
/*     */     //   #457	-> 368
/*     */     //   #465	-> 370
/*     */     //   #467	-> 381
/*     */     //   #469	-> 393
/*     */     //   #470	-> 394
/*     */     //   #471	-> 403
/*     */     //   #472	-> 425
/*     */     //   #469	-> 426
/*     */     //   #468	-> 426
/*     */     //   #474	-> 428
/*     */     //   #477	-> 438
/*     */     //   #478	-> 439
/*     */     //   #479	-> 448
/*     */     //   #480	-> 470
/*     */     //   #477	-> 471
/*     */     //   #476	-> 471
/*     */     //   #482	-> 473
/*     */     //   #484	-> 483
/*     */     //   #492	-> 509
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   56	10	11	$i$a$-find-ScrollableContainerKt$ScrollableContainerImpl$2$1$verticalScrollbarMeasurable$1	I
/*     */     //   53	13	10	it	Landroidx/compose/ui/layout/Measurable;
/*     */     //   124	10	12	$i$a$-find-ScrollableContainerKt$ScrollableContainerImpl$2$1$horizontalScrollbarMeasurable$1	I
/*     */     //   121	13	11	it	Landroidx/compose/ui/layout/Measurable;
/*     */     //   202	9	9	verticalScrollbarConstraints	J
/*     */     //   237	9	10	horizontalScrollbarConstraints	J
/*     */     //   312	10	18	$i$a$-find-ScrollableContainerKt$ScrollableContainerImpl$2$1$contentMeasurable$1	I
/*     */     //   309	13	17	it	Landroidx/compose/ui/layout/Measurable;
/*     */     //   80	430	5	verticalScrollbarMeasurable	Landroidx/compose/ui/layout/Measurable;
/*     */     //   148	362	6	horizontalScrollbarMeasurable	Landroidx/compose/ui/layout/Measurable;
/*     */     //   182	328	7	sizeOffsetWhenBothVisible	I
/*     */     //   217	293	8	verticalScrollbarPlaceable	Landroidx/compose/ui/layout/Placeable;
/*     */     //   252	258	9	horizontalScrollbarPlaceable	Landroidx/compose/ui/layout/Placeable;
/*     */     //   268	242	10	isMacOs	Z
/*     */     //   354	156	11	contentMeasurable	Landroidx/compose/ui/layout/Measurable;
/*     */     //   370	140	12	contentConstraints	J
/*     */     //   381	129	14	contentPlaceable	Landroidx/compose/ui/layout/Placeable;
/*     */     //   393	117	15	isAlwaysVisible	Z
/*     */     //   428	82	16	vScrollbarWidth	I
/*     */     //   438	72	17	width	I
/*     */     //   473	37	18	hScrollbarHeight	I
/*     */     //   483	27	19	height	I
/*     */     //   0	510	0	this	Lorg/jetbrains/jewel/ui/component/ScrollableContainerKt$ScrollableContainerImpl$2$1;
/*     */     //   0	510	1	$this$Layout	Landroidx/compose/ui/layout/MeasureScope;
/*     */     //   0	510	2	measurables	Ljava/util/List;
/*     */     //   0	510	3	incomingConstraints	J
/*     */   }
/*     */   
/*     */   private static final Unit measure_3p2s80s$lambda$3(Placeable $contentPlaceable, Placeable $verticalScrollbarPlaceable, int $width, Placeable $horizontalScrollbarPlaceable, int $height, Placeable.PlacementScope $this$layout) {
/* 485 */     Intrinsics.checkNotNullParameter($this$layout, "$this$layout"); $this$layout.placeRelative($contentPlaceable, 0, 0, 0.0F);
/* 486 */     if ($verticalScrollbarPlaceable != null) { $this$layout.placeRelative($verticalScrollbarPlaceable, $width - $verticalScrollbarPlaceable.getWidth(), 0, 1.0F); } else {  }
/* 487 */      if ($horizontalScrollbarPlaceable != null) { $this$layout.placeRelative($horizontalScrollbarPlaceable, 
/* 488 */           0, 
/* 489 */           $height - $horizontalScrollbarPlaceable.getHeight(), 
/* 490 */           1.0F); }
/*     */     else {  }
/* 492 */      return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ScrollableContainerKt$ScrollableContainerImpl$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */