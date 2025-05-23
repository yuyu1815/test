package org.jetbrains.jewel.bridge.theme;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jewel.ui.component.styling.PopupContainerStyle;

@Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\032\b\020\000\032\0020\001H\000¨\006\002"}, d2 = {"readPopupContainerStyle", "Lorg/jetbrains/jewel/ui/component/styling/PopupContainerStyle;", "ide-laf-bridge"})
@SourceDebugExtension({"SMAP\nIntUiBridgePopupContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntUiBridgePopupContainer.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgePopupContainerKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,43:1\n708#2:44\n696#2:45\n149#3:46\n149#3:47\n139#3:48\n125#3:49\n149#3:50\n*S KotlinDebug\n*F\n+ 1 IntUiBridgePopupContainer.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgePopupContainerKt\n*L\n23#1:44\n23#1:45\n37#1:46\n38#1:47\n39#1:48\n39#1:49\n39#1:50\n*E\n"})
public final class IntUiBridgePopupContainerKt {
  @NotNull
  public static final PopupContainerStyle readPopupContainerStyle() {
    // Byte code:
    //   0: ldc 'PopupMenu.background'
    //   2: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
    //   5: ldc 'Popup.borderColor'
    //   7: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
    //   10: lstore_1
    //   11: iconst_0
    //   12: istore_3
    //   13: lload_1
    //   14: lstore #4
    //   16: iconst_0
    //   17: istore #6
    //   19: lload #4
    //   21: ldc2_w 16
    //   24: lcmp
    //   25: ifeq -> 32
    //   28: iconst_1
    //   29: goto -> 33
    //   32: iconst_0
    //   33: ifeq -> 40
    //   36: lload_1
    //   37: goto -> 57
    //   40: lstore #8
    //   42: iconst_0
    //   43: istore #7
    //   45: ldc 'Popup.Border.color'
    //   47: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
    //   50: lstore #10
    //   52: lload #8
    //   54: lload #10
    //   56: nop
    //   57: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
    //   60: invokevirtual getBlack-0d7_KjU : ()J
    //   63: ldc 0.6
    //   65: fconst_0
    //   66: fconst_0
    //   67: fconst_0
    //   68: bipush #14
    //   70: aconst_null
    //   71: invokestatic copy-wmQWz5c$default : (JFFFFILjava/lang/Object;)J
    //   74: aconst_null
    //   75: astore #19
    //   77: lstore #20
    //   79: lstore #22
    //   81: lstore #24
    //   83: new org/jetbrains/jewel/ui/component/styling/PopupContainerColors
    //   86: dup
    //   87: lload #24
    //   89: lload #22
    //   91: lload #20
    //   93: aload #19
    //   95: invokespecial <init> : (JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   98: astore_0
    //   99: invokestatic isDark : ()Z
    //   102: aload_0
    //   103: getstatic com/intellij/ide/ui/laf/intellij/IdeaPopupMenuUI.CORNER_RADIUS : Lcom/intellij/util/ui/JBValue;
    //   106: dup
    //   107: ldc 'CORNER_RADIUS'
    //   109: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   112: invokestatic getDp : (Lcom/intellij/util/ui/JBValue;)F
    //   115: invokestatic CornerSize-0680j_4 : (F)Landroidx/compose/foundation/shape/CornerSize;
    //   118: fconst_0
    //   119: fconst_0
    //   120: iconst_3
    //   121: aconst_null
    //   122: invokestatic PaddingValues-YgX7TsA$default : (FFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;
    //   125: fconst_0
    //   126: fconst_0
    //   127: iconst_3
    //   128: aconst_null
    //   129: invokestatic PaddingValues-YgX7TsA$default : (FFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;
    //   132: iconst_0
    //   133: istore_1
    //   134: iconst_0
    //   135: istore_2
    //   136: iload_1
    //   137: i2f
    //   138: invokestatic constructor-impl : (F)F
    //   141: iconst_2
    //   142: istore_1
    //   143: iconst_0
    //   144: istore_2
    //   145: iload_1
    //   146: i2f
    //   147: invokestatic constructor-impl : (F)F
    //   150: invokestatic DpOffset-YgX7TsA : (FF)J
    //   153: bipush #12
    //   155: istore_1
    //   156: iconst_0
    //   157: istore_2
    //   158: iload_1
    //   159: i2f
    //   160: invokestatic constructor-impl : (F)F
    //   163: ldc 'Popup.borderWidth'
    //   165: invokestatic retrieveIntAsDpOrUnspecified : (Ljava/lang/String;)F
    //   168: fstore_1
    //   169: iconst_0
    //   170: istore_2
    //   171: fload_1
    //   172: fstore_3
    //   173: iconst_0
    //   174: istore #4
    //   176: fload_3
    //   177: invokestatic isNaN : (F)Z
    //   180: ifne -> 187
    //   183: iconst_1
    //   184: goto -> 188
    //   187: iconst_0
    //   188: nop
    //   189: ifeq -> 196
    //   192: fload_1
    //   193: goto -> 245
    //   196: fstore #17
    //   198: lstore #15
    //   200: astore #14
    //   202: astore #13
    //   204: astore #12
    //   206: astore #9
    //   208: istore #8
    //   210: iconst_0
    //   211: istore #5
    //   213: iconst_1
    //   214: istore #6
    //   216: iconst_0
    //   217: istore #7
    //   219: iload #6
    //   221: i2f
    //   222: invokestatic constructor-impl : (F)F
    //   225: nop
    //   226: fstore #18
    //   228: iload #8
    //   230: aload #9
    //   232: aload #12
    //   234: aload #13
    //   236: aload #14
    //   238: lload #15
    //   240: fload #17
    //   242: fload #18
    //   244: nop
    //   245: aconst_null
    //   246: astore #26
    //   248: fstore #27
    //   250: fstore #28
    //   252: lstore #29
    //   254: astore #31
    //   256: astore #32
    //   258: astore #33
    //   260: new org/jetbrains/jewel/ui/component/styling/PopupContainerMetrics
    //   263: dup
    //   264: aload #33
    //   266: aload #32
    //   268: aload #31
    //   270: lload #29
    //   272: fload #28
    //   274: fload #27
    //   276: aload #26
    //   278: invokespecial <init> : (Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/PaddingValues;JFFLkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   281: astore #34
    //   283: astore #35
    //   285: istore #36
    //   287: new org/jetbrains/jewel/ui/component/styling/PopupContainerStyle
    //   290: dup
    //   291: iload #36
    //   293: aload #35
    //   295: aload #34
    //   297: invokespecial <init> : (ZLorg/jetbrains/jewel/ui/component/styling/PopupContainerColors;Lorg/jetbrains/jewel/ui/component/styling/PopupContainerMetrics;)V
    //   300: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #20	-> 0
    //   #21	-> 0
    //   #23	-> 5
    //   #44	-> 13
    //   #45	-> 19
    //   #44	-> 33
    //   #24	-> 45
    //   #44	-> 56
    //   #26	-> 57
    //   #20	-> 75
    //   #19	-> 98
    //   #29	-> 99
    //   #30	-> 99
    //   #31	-> 102
    //   #33	-> 103
    //   #34	-> 103
    //   #35	-> 118
    //   #36	-> 125
    //   #37	-> 132
    //   #46	-> 136
    //   #37	-> 141
    //   #46	-> 145
    //   #37	-> 150
    //   #38	-> 153
    //   #47	-> 158
    //   #39	-> 163
    //   #48	-> 171
    //   #49	-> 176
    //   #49	-> 188
    //   #48	-> 189
    //   #39	-> 213
    //   #50	-> 219
    //   #39	-> 225
    //   #48	-> 244
    //   #33	-> 246
    //   #29	-> 281
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   45	5	7	$i$a$-takeOrElse-DxMtmZc-IntUiBridgePopupContainerKt$readPopupContainerStyle$colors$1	I
    //   19	14	6	$i$f$isSpecified-8_81llA	I
    //   16	17	4	$this$isSpecified$iv$iv	J
    //   13	44	3	$i$f$takeOrElse-DxMtmZc	I
    //   11	46	1	$this$takeOrElse_u2dDxMtmZc$iv	J
    //   136	5	2	$i$f$getDp	I
    //   134	7	1	$this$dp$iv	I
    //   145	5	2	$i$f$getDp	I
    //   143	7	1	$this$dp$iv	I
    //   158	5	2	$i$f$getDp	I
    //   156	7	1	$this$dp$iv	I
    //   219	6	7	$i$f$getDp	I
    //   216	9	6	$this$dp$iv	I
    //   213	13	5	$i$a$-takeOrElse-D5KLDUw-IntUiBridgePopupContainerKt$readPopupContainerStyle$1	I
    //   176	13	4	$i$f$isSpecified-0680j_4	I
    //   173	16	3	$this$isSpecified$iv$iv	F
    //   171	74	2	$i$f$takeOrElse-D5KLDUw	I
    //   169	76	1	$this$takeOrElse_u2dD5KLDUw$iv	F
    //   99	202	0	colors	Lorg/jetbrains/jewel/ui/component/styling/PopupContainerColors;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\IntUiBridgePopupContainerKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */