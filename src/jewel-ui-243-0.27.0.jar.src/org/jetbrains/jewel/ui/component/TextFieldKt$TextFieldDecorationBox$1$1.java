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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\norg/jetbrains/jewel/ui/component/TextFieldKt$TextFieldDecorationBox$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,345:1\n1#2:346\n618#3,12:347\n*S KotlinDebug\n*F\n+ 1 TextField.kt\norg/jetbrains/jewel/ui/component/TextFieldKt$TextFieldDecorationBox$1$1\n*L\n262#1:347,12\n*E\n"})
/*     */ final class TextFieldKt$TextFieldDecorationBox$1$1
/*     */   implements MeasurePolicy
/*     */ {
/*     */   public static final TextFieldKt$TextFieldDecorationBox$1$1 INSTANCE = new TextFieldKt$TextFieldDecorationBox$1$1();
/*     */   
/*     */   public final MeasureResult measure-3p2s80s(MeasureScope $this$Layout, List measurables, long incomingConstraints) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc '$this$Layout'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'measurables'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: iconst_0
/*     */     //   13: istore #5
/*     */     //   15: lload_3
/*     */     //   16: iconst_0
/*     */     //   17: iconst_0
/*     */     //   18: iconst_0
/*     */     //   19: iconst_0
/*     */     //   20: bipush #10
/*     */     //   22: aconst_null
/*     */     //   23: invokestatic copy-Zbe2FdA$default : (JIIIIILjava/lang/Object;)J
/*     */     //   26: lstore #6
/*     */     //   28: aload_2
/*     */     //   29: checkcast java/lang/Iterable
/*     */     //   32: astore #11
/*     */     //   34: aload #11
/*     */     //   36: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   41: astore #12
/*     */     //   43: aload #12
/*     */     //   45: invokeinterface hasNext : ()Z
/*     */     //   50: ifeq -> 90
/*     */     //   53: aload #12
/*     */     //   55: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   60: astore #13
/*     */     //   62: aload #13
/*     */     //   64: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   67: astore #14
/*     */     //   69: iconst_0
/*     */     //   70: istore #15
/*     */     //   72: aload #14
/*     */     //   74: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*     */     //   77: ldc 'Trailing'
/*     */     //   79: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   82: ifeq -> 43
/*     */     //   85: aload #13
/*     */     //   87: goto -> 91
/*     */     //   90: aconst_null
/*     */     //   91: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   94: dup
/*     */     //   95: ifnull -> 108
/*     */     //   98: lload #6
/*     */     //   100: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */     //   105: goto -> 110
/*     */     //   108: pop
/*     */     //   109: aconst_null
/*     */     //   110: astore #8
/*     */     //   112: aload_2
/*     */     //   113: checkcast java/lang/Iterable
/*     */     //   116: astore #12
/*     */     //   118: aload #12
/*     */     //   120: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   125: astore #13
/*     */     //   127: aload #13
/*     */     //   129: invokeinterface hasNext : ()Z
/*     */     //   134: ifeq -> 174
/*     */     //   137: aload #13
/*     */     //   139: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   144: astore #14
/*     */     //   146: aload #14
/*     */     //   148: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   151: astore #15
/*     */     //   153: iconst_0
/*     */     //   154: istore #16
/*     */     //   156: aload #15
/*     */     //   158: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*     */     //   161: ldc 'Leading'
/*     */     //   163: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   166: ifeq -> 127
/*     */     //   169: aload #14
/*     */     //   171: goto -> 175
/*     */     //   174: aconst_null
/*     */     //   175: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   178: dup
/*     */     //   179: ifnull -> 192
/*     */     //   182: lload #6
/*     */     //   184: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */     //   189: goto -> 194
/*     */     //   192: pop
/*     */     //   193: aconst_null
/*     */     //   194: astore #9
/*     */     //   196: iload #5
/*     */     //   198: aload #8
/*     */     //   200: dup
/*     */     //   201: ifnull -> 210
/*     */     //   204: invokevirtual getWidth : ()I
/*     */     //   207: goto -> 212
/*     */     //   210: pop
/*     */     //   211: iconst_0
/*     */     //   212: iadd
/*     */     //   213: istore #5
/*     */     //   215: iload #5
/*     */     //   217: aload #9
/*     */     //   219: dup
/*     */     //   220: ifnull -> 229
/*     */     //   223: invokevirtual getWidth : ()I
/*     */     //   226: goto -> 231
/*     */     //   229: pop
/*     */     //   230: iconst_0
/*     */     //   231: iadd
/*     */     //   232: istore #5
/*     */     //   234: lload_3
/*     */     //   235: iload #5
/*     */     //   237: ineg
/*     */     //   238: iconst_0
/*     */     //   239: iconst_2
/*     */     //   240: aconst_null
/*     */     //   241: invokestatic offset-NN6Ew-U$default : (JIIILjava/lang/Object;)J
/*     */     //   244: iconst_0
/*     */     //   245: iconst_0
/*     */     //   246: iconst_0
/*     */     //   247: iconst_0
/*     */     //   248: bipush #11
/*     */     //   250: aconst_null
/*     */     //   251: invokestatic copy-Zbe2FdA$default : (JIIIIILjava/lang/Object;)J
/*     */     //   254: lstore #10
/*     */     //   256: aload_2
/*     */     //   257: checkcast java/lang/Iterable
/*     */     //   260: astore #13
/*     */     //   262: iconst_0
/*     */     //   263: istore #14
/*     */     //   265: aconst_null
/*     */     //   266: astore #15
/*     */     //   268: iconst_0
/*     */     //   269: istore #16
/*     */     //   271: aload #13
/*     */     //   273: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   278: astore #17
/*     */     //   280: aload #17
/*     */     //   282: invokeinterface hasNext : ()Z
/*     */     //   287: ifeq -> 347
/*     */     //   290: aload #17
/*     */     //   292: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   297: astore #18
/*     */     //   299: aload #18
/*     */     //   301: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   304: astore #19
/*     */     //   306: iconst_0
/*     */     //   307: istore #20
/*     */     //   309: aload #19
/*     */     //   311: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*     */     //   314: ldc 'TextField'
/*     */     //   316: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   319: ifeq -> 280
/*     */     //   322: iload #16
/*     */     //   324: ifeq -> 337
/*     */     //   327: new java/lang/IllegalArgumentException
/*     */     //   330: dup
/*     */     //   331: ldc 'Collection contains more than one matching element.'
/*     */     //   333: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   336: athrow
/*     */     //   337: aload #18
/*     */     //   339: astore #15
/*     */     //   341: iconst_1
/*     */     //   342: istore #16
/*     */     //   344: goto -> 280
/*     */     //   347: iload #16
/*     */     //   349: ifne -> 362
/*     */     //   352: new java/util/NoSuchElementException
/*     */     //   355: dup
/*     */     //   356: ldc 'Collection contains no element matching the predicate.'
/*     */     //   358: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   361: athrow
/*     */     //   362: aload #15
/*     */     //   364: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   367: lload #10
/*     */     //   369: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */     //   374: astore #12
/*     */     //   376: lload #10
/*     */     //   378: iconst_0
/*     */     //   379: aload #12
/*     */     //   381: invokevirtual getWidth : ()I
/*     */     //   384: iconst_0
/*     */     //   385: aload #12
/*     */     //   387: invokevirtual getHeight : ()I
/*     */     //   390: iconst_4
/*     */     //   391: aconst_null
/*     */     //   392: invokestatic copy-Zbe2FdA$default : (JIIIIILjava/lang/Object;)J
/*     */     //   395: lstore #13
/*     */     //   397: aload_2
/*     */     //   398: checkcast java/lang/Iterable
/*     */     //   401: astore #18
/*     */     //   403: aload #18
/*     */     //   405: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   410: astore #19
/*     */     //   412: aload #19
/*     */     //   414: invokeinterface hasNext : ()Z
/*     */     //   419: ifeq -> 459
/*     */     //   422: aload #19
/*     */     //   424: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   429: astore #20
/*     */     //   431: aload #20
/*     */     //   433: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   436: astore #21
/*     */     //   438: iconst_0
/*     */     //   439: istore #22
/*     */     //   441: aload #21
/*     */     //   443: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*     */     //   446: ldc 'Placeholder'
/*     */     //   448: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   451: ifeq -> 412
/*     */     //   454: aload #20
/*     */     //   456: goto -> 460
/*     */     //   459: aconst_null
/*     */     //   460: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   463: dup
/*     */     //   464: ifnull -> 477
/*     */     //   467: lload #13
/*     */     //   469: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */     //   474: goto -> 479
/*     */     //   477: pop
/*     */     //   478: aconst_null
/*     */     //   479: astore #15
/*     */     //   481: aload #9
/*     */     //   483: aload #8
/*     */     //   485: aload #12
/*     */     //   487: lload_3
/*     */     //   488: invokestatic access$calculateWidth--hBUhpc : (Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)I
/*     */     //   491: istore #16
/*     */     //   493: aload #9
/*     */     //   495: aload #8
/*     */     //   497: aload #12
/*     */     //   499: lload_3
/*     */     //   500: invokestatic access$calculateHeight--hBUhpc : (Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)I
/*     */     //   503: istore #17
/*     */     //   505: aload_1
/*     */     //   506: iload #16
/*     */     //   508: iload #17
/*     */     //   510: aconst_null
/*     */     //   511: iload #17
/*     */     //   513: iload #16
/*     */     //   515: aload #9
/*     */     //   517: aload #8
/*     */     //   519: aload #12
/*     */     //   521: aload #15
/*     */     //   523: <illegal opcode> invoke : (IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;)Lkotlin/jvm/functions/Function1;
/*     */     //   528: iconst_4
/*     */     //   529: aconst_null
/*     */     //   530: invokestatic layout$default : (Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;
/*     */     //   533: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #250	-> 12
/*     */     //   #251	-> 15
/*     */     //   #254	-> 28
/*     */     //   #346	-> 69
/*     */     //   #254	-> 72
/*     */     //   #254	-> 82
/*     */     //   #254	-> 91
/*     */     //   #256	-> 112
/*     */     //   #346	-> 153
/*     */     //   #256	-> 156
/*     */     //   #256	-> 166
/*     */     //   #256	-> 175
/*     */     //   #257	-> 196
/*     */     //   #258	-> 215
/*     */     //   #261	-> 234
/*     */     //   #260	-> 254
/*     */     //   #262	-> 256
/*     */     //   #347	-> 265
/*     */     //   #348	-> 268
/*     */     //   #349	-> 271
/*     */     //   #350	-> 299
/*     */     //   #262	-> 309
/*     */     //   #350	-> 319
/*     */     //   #351	-> 322
/*     */     //   #352	-> 337
/*     */     //   #353	-> 341
/*     */     //   #356	-> 347
/*     */     //   #358	-> 362
/*     */     //   #262	-> 367
/*     */     //   #266	-> 376
/*     */     //   #267	-> 378
/*     */     //   #268	-> 379
/*     */     //   #266	-> 384
/*     */     //   #269	-> 385
/*     */     //   #266	-> 390
/*     */     //   #265	-> 395
/*     */     //   #271	-> 397
/*     */     //   #346	-> 438
/*     */     //   #271	-> 441
/*     */     //   #271	-> 451
/*     */     //   #271	-> 460
/*     */     //   #273	-> 481
/*     */     //   #274	-> 493
/*     */     //   #276	-> 505
/*     */     //   #285	-> 533
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   72	10	15	$i$a$-find-TextFieldKt$TextFieldDecorationBox$1$1$trailingPlaceable$1	I
/*     */     //   69	13	14	it	Landroidx/compose/ui/layout/Measurable;
/*     */     //   156	10	16	$i$a$-find-TextFieldKt$TextFieldDecorationBox$1$1$leadingPlaceable$1	I
/*     */     //   153	13	15	it	Landroidx/compose/ui/layout/Measurable;
/*     */     //   309	10	20	$i$a$-single-TextFieldKt$TextFieldDecorationBox$1$1$textFieldPlaceable$1	I
/*     */     //   306	13	19	it	Landroidx/compose/ui/layout/Measurable;
/*     */     //   299	45	18	element$iv	Ljava/lang/Object;
/*     */     //   265	99	14	$i$f$single	I
/*     */     //   268	96	15	single$iv	Ljava/lang/Object;
/*     */     //   271	93	16	found$iv	Z
/*     */     //   262	102	13	$this$single$iv	Ljava/lang/Iterable;
/*     */     //   441	10	22	$i$a$-find-TextFieldKt$TextFieldDecorationBox$1$1$placeholderPlaceable$1	I
/*     */     //   438	13	21	it	Landroidx/compose/ui/layout/Measurable;
/*     */     //   15	519	5	occupiedSpaceHorizontally	I
/*     */     //   28	506	6	iconConstraints	J
/*     */     //   112	422	8	trailingPlaceable	Landroidx/compose/ui/layout/Placeable;
/*     */     //   196	338	9	leadingPlaceable	Landroidx/compose/ui/layout/Placeable;
/*     */     //   256	278	10	textFieldConstraints	J
/*     */     //   376	158	12	textFieldPlaceable	Landroidx/compose/ui/layout/Placeable;
/*     */     //   397	137	13	placeholderConstraints	J
/*     */     //   481	53	15	placeholderPlaceable	Landroidx/compose/ui/layout/Placeable;
/*     */     //   493	41	16	width	I
/*     */     //   505	29	17	height	I
/*     */     //   0	534	0	this	Lorg/jetbrains/jewel/ui/component/TextFieldKt$TextFieldDecorationBox$1$1;
/*     */     //   0	534	1	$this$Layout	Landroidx/compose/ui/layout/MeasureScope;
/*     */     //   0	534	2	measurables	Ljava/util/List;
/*     */     //   0	534	3	incomingConstraints	J
/*     */   }
/*     */   
/*     */   private static final Unit measure_3p2s80s$lambda$4(int $height, int $width, Placeable $leadingPlaceable, Placeable $trailingPlaceable, Placeable $textFieldPlaceable, Placeable $placeholderPlaceable, Placeable.PlacementScope $this$layout) {
/* 277 */     Intrinsics.checkNotNullParameter($this$layout, "$this$layout"); TextFieldKt.access$place($this$layout, 
/* 278 */         $height, 
/* 279 */         $width, 
/* 280 */         $leadingPlaceable, 
/* 281 */         $trailingPlaceable, 
/* 282 */         $textFieldPlaceable, 
/* 283 */         $placeholderPlaceable);
/*     */     
/* 285 */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\TextFieldKt$TextFieldDecorationBox$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */