package org.jetbrains.jewel.bridge.theme;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jewel.ui.component.styling.LazyTreeStyle;

@Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\032\b\020\000\032\0020\001H\000¨\006\002"}, d2 = {"readLazyTreeStyle", "Lorg/jetbrains/jewel/ui/component/styling/LazyTreeStyle;", "ide-laf-bridge"})
@SourceDebugExtension({"SMAP\nIntUiBridgeLazyTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntUiBridgeLazyTree.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeLazyTreeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,62:1\n139#2:63\n125#2:64\n149#2:65\n139#2:66\n125#2:67\n149#2:68\n149#2:70\n149#2:71\n139#2:73\n125#2:74\n149#2:75\n149#2:76\n51#3:69\n72#3:72\n*S KotlinDebug\n*F\n+ 1 IntUiBridgeLazyTree.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeLazyTreeKt\n*L\n36#1:63\n36#1:64\n36#1:65\n37#1:66\n37#1:67\n37#1:68\n46#1:70\n47#1:71\n50#1:73\n50#1:74\n50#1:75\n51#1:76\n43#1:69\n48#1:72\n*E\n"})
public final class IntUiBridgeLazyTreeKt {
  @NotNull
  public static final LazyTreeStyle readLazyTreeStyle() {
    // Byte code:
    //   0: ldc 'Tree.foreground'
    //   2: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
    //   5: lstore_0
    //   6: ldc 'Tree.selectionForeground'
    //   8: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
    //   11: lstore_2
    //   12: ldc 'Tree.selectionBackground'
    //   14: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
    //   17: lstore #4
    //   19: ldc 'Tree.selectionInactiveBackground'
    //   21: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
    //   24: lstore #6
    //   26: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
    //   29: invokevirtual getTransparent-0d7_KjU : ()J
    //   32: lstore #9
    //   34: new org/jetbrains/jewel/ui/component/styling/SimpleListItemColors
    //   37: dup
    //   38: lconst_0
    //   39: lload #9
    //   41: lload #6
    //   43: lload #4
    //   45: lload_0
    //   46: lload_0
    //   47: lload_2
    //   48: lload_2
    //   49: iconst_1
    //   50: aconst_null
    //   51: invokespecial <init> : (JJJJJJJJILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   54: astore #8
    //   56: ldc 'Tree.leftChildIndent'
    //   58: invokestatic retrieveIntAsDpOrUnspecified : (Ljava/lang/String;)F
    //   61: fstore #10
    //   63: iconst_0
    //   64: istore #11
    //   66: fload #10
    //   68: fstore #12
    //   70: iconst_0
    //   71: istore #13
    //   73: fload #12
    //   75: invokestatic isNaN : (F)Z
    //   78: ifne -> 85
    //   81: iconst_1
    //   82: goto -> 86
    //   85: iconst_0
    //   86: nop
    //   87: ifeq -> 95
    //   90: fload #10
    //   92: goto -> 113
    //   95: iconst_0
    //   96: istore #14
    //   98: bipush #7
    //   100: istore #15
    //   102: iconst_0
    //   103: istore #16
    //   105: iload #15
    //   107: i2f
    //   108: invokestatic constructor-impl : (F)F
    //   111: nop
    //   112: nop
    //   113: fstore #9
    //   115: ldc 'Tree.rightChildIndent'
    //   117: invokestatic retrieveIntAsDpOrUnspecified : (Ljava/lang/String;)F
    //   120: fstore #11
    //   122: iconst_0
    //   123: istore #12
    //   125: fload #11
    //   127: fstore #13
    //   129: iconst_0
    //   130: istore #14
    //   132: fload #13
    //   134: invokestatic isNaN : (F)Z
    //   137: ifne -> 144
    //   140: iconst_1
    //   141: goto -> 145
    //   144: iconst_0
    //   145: nop
    //   146: ifeq -> 154
    //   149: fload #11
    //   151: goto -> 172
    //   154: iconst_0
    //   155: istore #15
    //   157: bipush #11
    //   159: istore #16
    //   161: iconst_0
    //   162: istore #17
    //   164: iload #16
    //   166: i2f
    //   167: invokestatic constructor-impl : (F)F
    //   170: nop
    //   171: nop
    //   172: fstore #10
    //   174: aload #8
    //   176: iconst_0
    //   177: istore #12
    //   179: fload #9
    //   181: fload #10
    //   183: fadd
    //   184: invokestatic constructor-impl : (F)F
    //   187: fstore #11
    //   189: new org/jetbrains/jewel/ui/component/styling/SimpleListItemMetrics
    //   192: dup
    //   193: bipush #12
    //   195: istore #13
    //   197: iconst_0
    //   198: istore #14
    //   200: iload #13
    //   202: i2f
    //   203: invokestatic constructor-impl : (F)F
    //   206: fconst_0
    //   207: iconst_2
    //   208: aconst_null
    //   209: invokestatic PaddingValues-YgX7TsA$default : (FFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;
    //   212: iconst_4
    //   213: istore #13
    //   215: iconst_0
    //   216: istore #14
    //   218: iload #13
    //   220: i2f
    //   221: invokestatic constructor-impl : (F)F
    //   224: invokestatic PaddingValues-0680j_4 : (F)Landroidx/compose/foundation/layout/PaddingValues;
    //   227: getstatic com/intellij/util/ui/JBUI$CurrentTheme$Tree.ARC : Lcom/intellij/util/ui/JBValue;
    //   230: dup
    //   231: ldc 'ARC'
    //   233: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   236: invokestatic getDp : (Lcom/intellij/util/ui/JBValue;)F
    //   239: fstore #13
    //   241: iconst_2
    //   242: istore #14
    //   244: iconst_0
    //   245: istore #15
    //   247: fload #13
    //   249: iload #14
    //   251: i2f
    //   252: fdiv
    //   253: invokestatic constructor-impl : (F)F
    //   256: invokestatic CornerSize-0680j_4 : (F)Landroidx/compose/foundation/shape/CornerSize;
    //   259: invokespecial <init> : (Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/shape/CornerSize;)V
    //   262: astore #12
    //   264: ldc 'Tree.rowHeight'
    //   266: invokestatic retrieveIntAsDpOrUnspecified : (Ljava/lang/String;)F
    //   269: fstore #14
    //   271: iconst_0
    //   272: istore #15
    //   274: fload #14
    //   276: fstore #16
    //   278: iconst_0
    //   279: istore #17
    //   281: fload #16
    //   283: invokestatic isNaN : (F)Z
    //   286: ifne -> 293
    //   289: iconst_1
    //   290: goto -> 294
    //   293: iconst_0
    //   294: nop
    //   295: ifeq -> 303
    //   298: fload #14
    //   300: goto -> 329
    //   303: astore #21
    //   305: iconst_0
    //   306: istore #18
    //   308: bipush #24
    //   310: istore #19
    //   312: iconst_0
    //   313: istore #20
    //   315: iload #19
    //   317: i2f
    //   318: invokestatic constructor-impl : (F)F
    //   321: nop
    //   322: fstore #22
    //   324: aload #21
    //   326: fload #22
    //   328: nop
    //   329: fstore #13
    //   331: iconst_2
    //   332: istore #15
    //   334: iconst_0
    //   335: istore #16
    //   337: iload #15
    //   339: i2f
    //   340: invokestatic constructor-impl : (F)F
    //   343: fstore #14
    //   345: new org/jetbrains/jewel/ui/component/styling/LazyTreeMetrics
    //   348: dup
    //   349: fload #11
    //   351: fload #13
    //   353: fload #14
    //   355: aload #12
    //   357: aconst_null
    //   358: invokespecial <init> : (FFFLorg/jetbrains/jewel/ui/component/styling/SimpleListItemMetrics;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   361: new org/jetbrains/jewel/ui/component/styling/LazyTreeIcons
    //   364: dup
    //   365: getstatic org/jetbrains/jewel/ui/icons/AllIconsKeys$General.INSTANCE : Lorg/jetbrains/jewel/ui/icons/AllIconsKeys$General;
    //   368: invokevirtual getChevronRight : ()Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;
    //   371: checkcast org/jetbrains/jewel/ui/icon/IconKey
    //   374: getstatic org/jetbrains/jewel/ui/icons/AllIconsKeys$General.INSTANCE : Lorg/jetbrains/jewel/ui/icons/AllIconsKeys$General;
    //   377: invokevirtual getChevronDown : ()Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;
    //   380: checkcast org/jetbrains/jewel/ui/icon/IconKey
    //   383: getstatic org/jetbrains/jewel/ui/icons/AllIconsKeys$General.INSTANCE : Lorg/jetbrains/jewel/ui/icons/AllIconsKeys$General;
    //   386: invokevirtual getChevronRight : ()Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;
    //   389: checkcast org/jetbrains/jewel/ui/icon/IconKey
    //   392: getstatic org/jetbrains/jewel/ui/icons/AllIconsKeys$General.INSTANCE : Lorg/jetbrains/jewel/ui/icons/AllIconsKeys$General;
    //   395: invokevirtual getChevronDown : ()Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;
    //   398: checkcast org/jetbrains/jewel/ui/icon/IconKey
    //   401: invokespecial <init> : (Lorg/jetbrains/jewel/ui/icon/IconKey;Lorg/jetbrains/jewel/ui/icon/IconKey;Lorg/jetbrains/jewel/ui/icon/IconKey;Lorg/jetbrains/jewel/ui/icon/IconKey;)V
    //   404: astore #23
    //   406: astore #24
    //   408: astore #25
    //   410: new org/jetbrains/jewel/ui/component/styling/LazyTreeStyle
    //   413: dup
    //   414: aload #25
    //   416: aload #24
    //   418: aload #23
    //   420: invokespecial <init> : (Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemColors;Lorg/jetbrains/jewel/ui/component/styling/LazyTreeMetrics;Lorg/jetbrains/jewel/ui/component/styling/LazyTreeIcons;)V
    //   423: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #20	-> 0
    //   #21	-> 6
    //   #22	-> 12
    //   #23	-> 19
    //   #31	-> 26
    //   #26	-> 34
    //   #31	-> 39
    //   #32	-> 41
    //   #33	-> 43
    //   #27	-> 45
    //   #28	-> 46
    //   #29	-> 47
    //   #30	-> 48
    //   #26	-> 49
    //   #25	-> 54
    //   #36	-> 56
    //   #63	-> 66
    //   #64	-> 73
    //   #64	-> 86
    //   #63	-> 87
    //   #36	-> 98
    //   #65	-> 105
    //   #36	-> 111
    //   #63	-> 112
    //   #36	-> 113
    //   #37	-> 115
    //   #66	-> 125
    //   #67	-> 132
    //   #67	-> 145
    //   #66	-> 146
    //   #37	-> 157
    //   #68	-> 164
    //   #37	-> 170
    //   #66	-> 171
    //   #37	-> 172
    //   #39	-> 174
    //   #40	-> 174
    //   #43	-> 176
    //   #69	-> 179
    //   #43	-> 187
    //   #45	-> 189
    //   #46	-> 193
    //   #70	-> 200
    //   #46	-> 206
    //   #47	-> 212
    //   #71	-> 218
    //   #47	-> 224
    //   #48	-> 227
    //   #72	-> 247
    //   #48	-> 256
    //   #45	-> 259
    //   #50	-> 264
    //   #73	-> 274
    //   #74	-> 281
    //   #74	-> 294
    //   #73	-> 295
    //   #50	-> 308
    //   #75	-> 315
    //   #50	-> 321
    //   #73	-> 328
    //   #50	-> 329
    //   #51	-> 331
    //   #76	-> 337
    //   #51	-> 343
    //   #42	-> 345
    //   #43	-> 349
    //   #50	-> 351
    //   #51	-> 353
    //   #45	-> 355
    //   #42	-> 358
    //   #54	-> 361
    //   #55	-> 365
    //   #56	-> 374
    //   #57	-> 383
    //   #58	-> 392
    //   #54	-> 401
    //   #39	-> 404
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   105	6	16	$i$f$getDp	I
    //   102	9	15	$this$dp$iv	I
    //   98	14	14	$i$a$-takeOrElse-D5KLDUw-IntUiBridgeLazyTreeKt$readLazyTreeStyle$leftIndent$1	I
    //   73	14	13	$i$f$isSpecified-0680j_4	I
    //   70	17	12	$this$isSpecified$iv$iv	F
    //   66	47	11	$i$f$takeOrElse-D5KLDUw	I
    //   63	50	10	$this$takeOrElse_u2dD5KLDUw$iv	F
    //   164	6	17	$i$f$getDp	I
    //   161	9	16	$this$dp$iv	I
    //   157	14	15	$i$a$-takeOrElse-D5KLDUw-IntUiBridgeLazyTreeKt$readLazyTreeStyle$rightIndent$1	I
    //   132	14	14	$i$f$isSpecified-0680j_4	I
    //   129	17	13	$this$isSpecified$iv$iv	F
    //   125	47	12	$i$f$takeOrElse-D5KLDUw	I
    //   122	50	11	$this$takeOrElse_u2dD5KLDUw$iv	F
    //   179	8	12	$i$f$plus-5rwHm24	I
    //   200	6	14	$i$f$getDp	I
    //   197	9	13	$this$dp$iv	I
    //   218	6	14	$i$f$getDp	I
    //   215	9	13	$this$dp$iv	I
    //   247	9	15	$i$f$div-u2uoSUM	I
    //   244	12	13	arg0$iv	F
    //   244	12	14	other$iv	I
    //   315	6	20	$i$f$getDp	I
    //   312	9	19	$this$dp$iv	I
    //   308	14	18	$i$a$-takeOrElse-D5KLDUw-IntUiBridgeLazyTreeKt$readLazyTreeStyle$1	I
    //   281	14	17	$i$f$isSpecified-0680j_4	I
    //   278	17	16	$this$isSpecified$iv$iv	F
    //   274	55	15	$i$f$takeOrElse-D5KLDUw	I
    //   271	58	14	$this$takeOrElse_u2dD5KLDUw$iv	F
    //   337	6	16	$i$f$getDp	I
    //   334	9	15	$this$dp$iv	I
    //   6	418	0	normalContent	J
    //   12	412	2	selectedContent	J
    //   19	405	4	selectedElementBackground	J
    //   26	398	6	inactiveSelectedElementBackground	J
    //   56	368	8	colors	Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemColors;
    //   115	309	9	leftIndent	F
    //   174	250	10	rightIndent	F
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\IntUiBridgeLazyTreeKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */