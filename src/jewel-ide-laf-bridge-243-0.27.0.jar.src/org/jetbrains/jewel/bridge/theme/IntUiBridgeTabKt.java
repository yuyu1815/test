package org.jetbrains.jewel.bridge.theme;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jewel.ui.component.styling.TabStyle;

@Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\002\032\b\020\000\032\0020\001H\000\032\b\020\002\032\0020\001H\000¨\006\003"}, d2 = {"readDefaultTabStyle", "Lorg/jetbrains/jewel/ui/component/styling/TabStyle;", "readEditorTabStyle", "ide-laf-bridge"})
@SourceDebugExtension({"SMAP\nIntUiBridgeTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntUiBridgeTab.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeTabKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,125:1\n139#2:126\n125#2:127\n149#2:128\n149#2:129\n149#2:130\n139#2:131\n125#2:132\n149#2:133\n139#2:134\n125#2:135\n149#2:136\n149#2:137\n149#2:138\n139#2:139\n125#2:140\n149#2:141\n*S KotlinDebug\n*F\n+ 1 IntUiBridgeTab.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeTabKt\n*L\n49#1:126\n49#1:127\n49#1:128\n51#1:129\n52#1:130\n53#1:131\n53#1:132\n53#1:133\n102#1:134\n102#1:135\n102#1:136\n104#1:137\n105#1:138\n106#1:139\n106#1:140\n106#1:141\n*E\n"})
public final class IntUiBridgeTabKt {
  @NotNull
  public static final TabStyle readDefaultTabStyle() {
    // Byte code:
    //   0: invokestatic background : ()Ljava/awt/Color;
    //   3: dup
    //   4: ldc 'background(...)'
    //   6: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   9: invokestatic toComposeColor : (Ljava/awt/Color;)J
    //   12: lstore_0
    //   13: invokestatic underlinedTabBackground : ()Ljava/awt/Color;
    //   16: invokestatic toComposeColorOrUnspecified : (Ljava/awt/Color;)J
    //   19: lstore_2
    //   20: ldc 'TabbedPane.foreground'
    //   22: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
    //   25: lstore #4
    //   27: ldc 'TabbedPane.underlineColor'
    //   29: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
    //   32: lstore #6
    //   34: new org/jetbrains/jewel/ui/component/styling/TabColors
    //   37: dup
    //   38: lload_0
    //   39: lload_0
    //   40: lload_2
    //   41: invokestatic hoverBackground : ()Ljava/awt/Color;
    //   44: dup
    //   45: ldc 'hoverBackground(...)'
    //   47: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   50: invokestatic toComposeColor : (Ljava/awt/Color;)J
    //   53: lload_2
    //   54: lload #4
    //   56: ldc 'TabbedPane.disabledForeground'
    //   58: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
    //   61: lload #4
    //   63: lload #4
    //   65: lload #4
    //   67: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
    //   70: invokevirtual getUnspecified-0d7_KjU : ()J
    //   73: ldc 'TabbedPane.disabledUnderlineColor'
    //   75: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
    //   78: lload #6
    //   80: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
    //   83: invokevirtual getUnspecified-0d7_KjU : ()J
    //   86: lload #6
    //   88: aconst_null
    //   89: invokespecial <init> : (JJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   92: astore #8
    //   94: aload #8
    //   96: ldc 'TabbedPane.tabSelectionHeight'
    //   98: invokestatic retrieveIntAsDpOrUnspecified : (Ljava/lang/String;)F
    //   101: fstore #10
    //   103: iconst_0
    //   104: istore #11
    //   106: fload #10
    //   108: fstore #12
    //   110: iconst_0
    //   111: istore #13
    //   113: fload #12
    //   115: invokestatic isNaN : (F)Z
    //   118: ifne -> 125
    //   121: iconst_1
    //   122: goto -> 126
    //   125: iconst_0
    //   126: nop
    //   127: ifeq -> 135
    //   130: fload #10
    //   132: goto -> 160
    //   135: astore #21
    //   137: iconst_0
    //   138: istore #14
    //   140: iconst_2
    //   141: istore #15
    //   143: iconst_0
    //   144: istore #16
    //   146: iload #15
    //   148: i2f
    //   149: invokestatic constructor-impl : (F)F
    //   152: nop
    //   153: fstore #22
    //   155: aload #21
    //   157: fload #22
    //   159: nop
    //   160: fstore #9
    //   162: ldc 'TabbedPane.tabInsets'
    //   164: aconst_null
    //   165: iconst_2
    //   166: aconst_null
    //   167: invokestatic retrieveInsetsAsPaddingValues$default : (Ljava/lang/String;Landroidx/compose/foundation/layout/PaddingValues;ILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;
    //   170: astore #10
    //   172: iconst_4
    //   173: istore #12
    //   175: iconst_0
    //   176: istore #13
    //   178: iload #12
    //   180: i2f
    //   181: invokestatic constructor-impl : (F)F
    //   184: fstore #11
    //   186: iconst_4
    //   187: istore #13
    //   189: iconst_0
    //   190: istore #14
    //   192: iload #13
    //   194: i2f
    //   195: invokestatic constructor-impl : (F)F
    //   198: fstore #12
    //   200: ldc 'TabbedPane.tabHeight'
    //   202: invokestatic retrieveIntAsDpOrUnspecified : (Ljava/lang/String;)F
    //   205: fstore #14
    //   207: iconst_0
    //   208: istore #15
    //   210: fload #14
    //   212: fstore #16
    //   214: iconst_0
    //   215: istore #17
    //   217: fload #16
    //   219: invokestatic isNaN : (F)Z
    //   222: ifne -> 229
    //   225: iconst_1
    //   226: goto -> 230
    //   229: iconst_0
    //   230: nop
    //   231: ifeq -> 239
    //   234: fload #14
    //   236: goto -> 265
    //   239: astore #21
    //   241: iconst_0
    //   242: istore #18
    //   244: bipush #24
    //   246: istore #19
    //   248: iconst_0
    //   249: istore #20
    //   251: iload #19
    //   253: i2f
    //   254: invokestatic constructor-impl : (F)F
    //   257: nop
    //   258: fstore #22
    //   260: aload #21
    //   262: fload #22
    //   264: nop
    //   265: fstore #13
    //   267: new org/jetbrains/jewel/ui/component/styling/TabMetrics
    //   270: dup
    //   271: fload #9
    //   273: aload #10
    //   275: fload #13
    //   277: fload #12
    //   279: fload #11
    //   281: aconst_null
    //   282: invokespecial <init> : (FLandroidx/compose/foundation/layout/PaddingValues;FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   285: new org/jetbrains/jewel/ui/component/styling/TabIcons
    //   288: dup
    //   289: getstatic org/jetbrains/jewel/ui/icons/AllIconsKeys$General.INSTANCE : Lorg/jetbrains/jewel/ui/icons/AllIconsKeys$General;
    //   292: invokevirtual getCloseSmall : ()Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;
    //   295: checkcast org/jetbrains/jewel/ui/icon/IconKey
    //   298: invokespecial <init> : (Lorg/jetbrains/jewel/ui/icon/IconKey;)V
    //   301: new org/jetbrains/jewel/ui/component/styling/TabContentAlpha
    //   304: dup
    //   305: fconst_1
    //   306: fconst_1
    //   307: fconst_1
    //   308: fconst_1
    //   309: fconst_1
    //   310: fconst_1
    //   311: fconst_1
    //   312: fconst_1
    //   313: fconst_1
    //   314: fconst_1
    //   315: invokespecial <init> : (FFFFFFFFFF)V
    //   318: invokestatic isDark : ()Z
    //   321: invokestatic readScrollbarStyle : (Z)Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
    //   324: astore #23
    //   326: astore #24
    //   328: astore #25
    //   330: astore #26
    //   332: astore #27
    //   334: new org/jetbrains/jewel/ui/component/styling/TabStyle
    //   337: dup
    //   338: aload #27
    //   340: aload #26
    //   342: aload #25
    //   344: aload #24
    //   346: aload #23
    //   348: invokespecial <init> : (Lorg/jetbrains/jewel/ui/component/styling/TabColors;Lorg/jetbrains/jewel/ui/component/styling/TabMetrics;Lorg/jetbrains/jewel/ui/component/styling/TabIcons;Lorg/jetbrains/jewel/ui/component/styling/TabContentAlpha;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;)V
    //   351: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #21	-> 0
    //   #22	-> 13
    //   #23	-> 20
    //   #24	-> 27
    //   #27	-> 34
    //   #28	-> 38
    //   #29	-> 39
    //   #30	-> 40
    //   #31	-> 41
    //   #32	-> 53
    //   #33	-> 54
    //   #34	-> 56
    //   #35	-> 61
    //   #36	-> 63
    //   #37	-> 65
    //   #38	-> 67
    //   #39	-> 73
    //   #40	-> 78
    //   #41	-> 80
    //   #42	-> 86
    //   #27	-> 89
    //   #26	-> 92
    //   #45	-> 94
    //   #46	-> 94
    //   #49	-> 96
    //   #126	-> 106
    //   #127	-> 113
    //   #127	-> 126
    //   #126	-> 127
    //   #49	-> 140
    //   #128	-> 146
    //   #49	-> 152
    //   #126	-> 159
    //   #49	-> 160
    //   #50	-> 162
    //   #51	-> 172
    //   #129	-> 178
    //   #51	-> 184
    //   #52	-> 186
    //   #130	-> 192
    //   #52	-> 198
    //   #53	-> 200
    //   #131	-> 210
    //   #132	-> 217
    //   #132	-> 230
    //   #131	-> 231
    //   #53	-> 244
    //   #133	-> 251
    //   #53	-> 257
    //   #131	-> 264
    //   #53	-> 265
    //   #48	-> 267
    //   #49	-> 271
    //   #50	-> 273
    //   #53	-> 275
    //   #52	-> 277
    //   #51	-> 279
    //   #48	-> 282
    //   #55	-> 285
    //   #57	-> 301
    //   #58	-> 305
    //   #59	-> 306
    //   #60	-> 307
    //   #61	-> 308
    //   #62	-> 309
    //   #63	-> 310
    //   #64	-> 311
    //   #65	-> 312
    //   #66	-> 313
    //   #67	-> 314
    //   #57	-> 315
    //   #69	-> 318
    //   #45	-> 324
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   146	6	16	$i$f$getDp	I
    //   143	9	15	$this$dp$iv	I
    //   140	13	14	$i$a$-takeOrElse-D5KLDUw-IntUiBridgeTabKt$readDefaultTabStyle$1	I
    //   113	14	13	$i$f$isSpecified-0680j_4	I
    //   110	17	12	$this$isSpecified$iv$iv	F
    //   106	54	11	$i$f$takeOrElse-D5KLDUw	I
    //   103	57	10	$this$takeOrElse_u2dD5KLDUw$iv	F
    //   178	6	13	$i$f$getDp	I
    //   175	9	12	$this$dp$iv	I
    //   192	6	14	$i$f$getDp	I
    //   189	9	13	$this$dp$iv	I
    //   251	6	20	$i$f$getDp	I
    //   248	9	19	$this$dp$iv	I
    //   244	14	18	$i$a$-takeOrElse-D5KLDUw-IntUiBridgeTabKt$readDefaultTabStyle$2	I
    //   217	14	17	$i$f$isSpecified-0680j_4	I
    //   214	17	16	$this$isSpecified$iv$iv	F
    //   210	55	15	$i$f$takeOrElse-D5KLDUw	I
    //   207	58	14	$this$takeOrElse_u2dD5KLDUw$iv	F
    //   13	339	0	normalBackground	J
    //   20	332	2	selectedBackground	J
    //   27	325	4	normalContent	J
    //   34	318	6	selectedUnderline	J
    //   94	258	8	colors	Lorg/jetbrains/jewel/ui/component/styling/TabColors;
  }
  
  @NotNull
  public static final TabStyle readEditorTabStyle() {
    // Byte code:
    //   0: invokestatic background : ()Ljava/awt/Color;
    //   3: dup
    //   4: ldc 'background(...)'
    //   6: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   9: invokestatic toComposeColor : (Ljava/awt/Color;)J
    //   12: lstore_0
    //   13: invokestatic underlinedTabBackground : ()Ljava/awt/Color;
    //   16: invokestatic toComposeColorOrUnspecified : (Ljava/awt/Color;)J
    //   19: lstore_2
    //   20: ldc 'TabbedPane.foreground'
    //   22: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
    //   25: lstore #4
    //   27: ldc 'TabbedPane.underlineColor'
    //   29: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
    //   32: lstore #6
    //   34: new org/jetbrains/jewel/ui/component/styling/TabColors
    //   37: dup
    //   38: lload_0
    //   39: lload_0
    //   40: lload_2
    //   41: invokestatic hoverBackground : ()Ljava/awt/Color;
    //   44: dup
    //   45: ldc 'hoverBackground(...)'
    //   47: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   50: invokestatic toComposeColor : (Ljava/awt/Color;)J
    //   53: lload_2
    //   54: lload #4
    //   56: ldc 'TabbedPane.disabledForeground'
    //   58: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
    //   61: lload #4
    //   63: lload #4
    //   65: lload #4
    //   67: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
    //   70: invokevirtual getUnspecified-0d7_KjU : ()J
    //   73: ldc 'TabbedPane.disabledUnderlineColor'
    //   75: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
    //   78: lload #6
    //   80: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
    //   83: invokevirtual getUnspecified-0d7_KjU : ()J
    //   86: lload #6
    //   88: aconst_null
    //   89: invokespecial <init> : (JJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   92: astore #8
    //   94: aload #8
    //   96: ldc 'TabbedPane.tabSelectionHeight'
    //   98: invokestatic retrieveIntAsDpOrUnspecified : (Ljava/lang/String;)F
    //   101: fstore #10
    //   103: iconst_0
    //   104: istore #11
    //   106: fload #10
    //   108: fstore #12
    //   110: iconst_0
    //   111: istore #13
    //   113: fload #12
    //   115: invokestatic isNaN : (F)Z
    //   118: ifne -> 125
    //   121: iconst_1
    //   122: goto -> 126
    //   125: iconst_0
    //   126: nop
    //   127: ifeq -> 135
    //   130: fload #10
    //   132: goto -> 160
    //   135: astore #21
    //   137: iconst_0
    //   138: istore #14
    //   140: iconst_2
    //   141: istore #15
    //   143: iconst_0
    //   144: istore #16
    //   146: iload #15
    //   148: i2f
    //   149: invokestatic constructor-impl : (F)F
    //   152: nop
    //   153: fstore #22
    //   155: aload #21
    //   157: fload #22
    //   159: nop
    //   160: fstore #9
    //   162: ldc 'TabbedPane.tabInsets'
    //   164: aconst_null
    //   165: iconst_2
    //   166: aconst_null
    //   167: invokestatic retrieveInsetsAsPaddingValues$default : (Ljava/lang/String;Landroidx/compose/foundation/layout/PaddingValues;ILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;
    //   170: astore #10
    //   172: iconst_4
    //   173: istore #12
    //   175: iconst_0
    //   176: istore #13
    //   178: iload #12
    //   180: i2f
    //   181: invokestatic constructor-impl : (F)F
    //   184: fstore #11
    //   186: iconst_4
    //   187: istore #13
    //   189: iconst_0
    //   190: istore #14
    //   192: iload #13
    //   194: i2f
    //   195: invokestatic constructor-impl : (F)F
    //   198: fstore #12
    //   200: ldc 'TabbedPane.tabHeight'
    //   202: invokestatic retrieveIntAsDpOrUnspecified : (Ljava/lang/String;)F
    //   205: fstore #14
    //   207: iconst_0
    //   208: istore #15
    //   210: fload #14
    //   212: fstore #16
    //   214: iconst_0
    //   215: istore #17
    //   217: fload #16
    //   219: invokestatic isNaN : (F)Z
    //   222: ifne -> 229
    //   225: iconst_1
    //   226: goto -> 230
    //   229: iconst_0
    //   230: nop
    //   231: ifeq -> 239
    //   234: fload #14
    //   236: goto -> 265
    //   239: astore #21
    //   241: iconst_0
    //   242: istore #18
    //   244: bipush #24
    //   246: istore #19
    //   248: iconst_0
    //   249: istore #20
    //   251: iload #19
    //   253: i2f
    //   254: invokestatic constructor-impl : (F)F
    //   257: nop
    //   258: fstore #22
    //   260: aload #21
    //   262: fload #22
    //   264: nop
    //   265: fstore #13
    //   267: new org/jetbrains/jewel/ui/component/styling/TabMetrics
    //   270: dup
    //   271: fload #9
    //   273: aload #10
    //   275: fload #13
    //   277: fload #12
    //   279: fload #11
    //   281: aconst_null
    //   282: invokespecial <init> : (FLandroidx/compose/foundation/layout/PaddingValues;FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   285: new org/jetbrains/jewel/ui/component/styling/TabIcons
    //   288: dup
    //   289: getstatic org/jetbrains/jewel/ui/icons/AllIconsKeys$General.INSTANCE : Lorg/jetbrains/jewel/ui/icons/AllIconsKeys$General;
    //   292: invokevirtual getCloseSmall : ()Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;
    //   295: checkcast org/jetbrains/jewel/ui/icon/IconKey
    //   298: invokespecial <init> : (Lorg/jetbrains/jewel/ui/icon/IconKey;)V
    //   301: new org/jetbrains/jewel/ui/component/styling/TabContentAlpha
    //   304: dup
    //   305: ldc 0.7
    //   307: ldc 0.7
    //   309: fconst_1
    //   310: fconst_1
    //   311: fconst_1
    //   312: ldc 0.7
    //   314: ldc 0.7
    //   316: fconst_1
    //   317: fconst_1
    //   318: fconst_1
    //   319: invokespecial <init> : (FFFFFFFFFF)V
    //   322: invokestatic isDark : ()Z
    //   325: invokestatic readScrollbarStyle : (Z)Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
    //   328: astore #23
    //   330: astore #24
    //   332: astore #25
    //   334: astore #26
    //   336: astore #27
    //   338: new org/jetbrains/jewel/ui/component/styling/TabStyle
    //   341: dup
    //   342: aload #27
    //   344: aload #26
    //   346: aload #25
    //   348: aload #24
    //   350: aload #23
    //   352: invokespecial <init> : (Lorg/jetbrains/jewel/ui/component/styling/TabColors;Lorg/jetbrains/jewel/ui/component/styling/TabMetrics;Lorg/jetbrains/jewel/ui/component/styling/TabIcons;Lorg/jetbrains/jewel/ui/component/styling/TabContentAlpha;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;)V
    //   355: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #74	-> 0
    //   #75	-> 13
    //   #76	-> 20
    //   #77	-> 27
    //   #80	-> 34
    //   #81	-> 38
    //   #82	-> 39
    //   #83	-> 40
    //   #84	-> 41
    //   #85	-> 53
    //   #86	-> 54
    //   #87	-> 56
    //   #88	-> 61
    //   #89	-> 63
    //   #90	-> 65
    //   #91	-> 67
    //   #92	-> 73
    //   #93	-> 78
    //   #94	-> 80
    //   #95	-> 86
    //   #80	-> 89
    //   #79	-> 92
    //   #98	-> 94
    //   #99	-> 94
    //   #102	-> 96
    //   #134	-> 106
    //   #135	-> 113
    //   #135	-> 126
    //   #134	-> 127
    //   #102	-> 140
    //   #136	-> 146
    //   #102	-> 152
    //   #134	-> 159
    //   #102	-> 160
    //   #103	-> 162
    //   #104	-> 172
    //   #137	-> 178
    //   #104	-> 184
    //   #105	-> 186
    //   #138	-> 192
    //   #105	-> 198
    //   #106	-> 200
    //   #139	-> 210
    //   #140	-> 217
    //   #140	-> 230
    //   #139	-> 231
    //   #106	-> 244
    //   #141	-> 251
    //   #106	-> 257
    //   #139	-> 264
    //   #106	-> 265
    //   #101	-> 267
    //   #102	-> 271
    //   #103	-> 273
    //   #106	-> 275
    //   #105	-> 277
    //   #104	-> 279
    //   #101	-> 282
    //   #108	-> 285
    //   #110	-> 301
    //   #111	-> 305
    //   #112	-> 307
    //   #113	-> 309
    //   #114	-> 310
    //   #115	-> 311
    //   #116	-> 312
    //   #117	-> 314
    //   #118	-> 316
    //   #119	-> 317
    //   #120	-> 318
    //   #110	-> 319
    //   #122	-> 322
    //   #98	-> 328
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   146	6	16	$i$f$getDp	I
    //   143	9	15	$this$dp$iv	I
    //   140	13	14	$i$a$-takeOrElse-D5KLDUw-IntUiBridgeTabKt$readEditorTabStyle$1	I
    //   113	14	13	$i$f$isSpecified-0680j_4	I
    //   110	17	12	$this$isSpecified$iv$iv	F
    //   106	54	11	$i$f$takeOrElse-D5KLDUw	I
    //   103	57	10	$this$takeOrElse_u2dD5KLDUw$iv	F
    //   178	6	13	$i$f$getDp	I
    //   175	9	12	$this$dp$iv	I
    //   192	6	14	$i$f$getDp	I
    //   189	9	13	$this$dp$iv	I
    //   251	6	20	$i$f$getDp	I
    //   248	9	19	$this$dp$iv	I
    //   244	14	18	$i$a$-takeOrElse-D5KLDUw-IntUiBridgeTabKt$readEditorTabStyle$2	I
    //   217	14	17	$i$f$isSpecified-0680j_4	I
    //   214	17	16	$this$isSpecified$iv$iv	F
    //   210	55	15	$i$f$takeOrElse-D5KLDUw	I
    //   207	58	14	$this$takeOrElse_u2dD5KLDUw$iv	F
    //   13	343	0	normalBackground	J
    //   20	336	2	selectedBackground	J
    //   27	329	4	normalContent	J
    //   34	322	6	selectedUnderline	J
    //   94	262	8	colors	Lorg/jetbrains/jewel/ui/component/styling/TabColors;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\IntUiBridgeTabKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */