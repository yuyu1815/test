package org.jetbrains.jewel.bridge.theme;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jewel.ui.component.styling.MenuStyle;

@Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\032\b\020\000\032\0020\001H\000¨\006\002"}, d2 = {"readMenuStyle", "Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;", "ide-laf-bridge"})
@SourceDebugExtension({"SMAP\nIntUiBridgeMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntUiBridgeMenu.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeMenuKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,101:1\n708#2:102\n696#2:103\n149#3:104\n149#3:105\n139#3:106\n125#3:107\n149#3:108\n149#3:109\n149#3:110\n149#3:111\n139#3:112\n125#3:113\n149#3:114\n139#3:115\n125#3:116\n149#3:117\n139#3:118\n125#3:119\n149#3:120\n139#3:121\n125#3:122\n149#3:123\n149#3:124\n149#3:125\n149#3:126\n*S KotlinDebug\n*F\n+ 1 IntUiBridgeMenu.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeMenuKt\n*L\n36#1:102\n36#1:103\n74#1:104\n75#1:105\n76#1:106\n76#1:107\n76#1:108\n79#1:109\n81#1:110\n82#1:111\n86#1:112\n86#1:113\n86#1:114\n88#1:115\n88#1:116\n88#1:117\n91#1:118\n91#1:119\n91#1:120\n92#1:121\n92#1:122\n92#1:123\n93#1:124\n94#1:125\n96#1:126\n*E\n"})
public final class IntUiBridgeMenuKt {
  @NotNull
  public static final MenuStyle readMenuStyle() {
    // Byte code:
    //   0: ldc 'MenuItem.selectionBackground'
    //   2: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
    //   5: lstore_0
    //   6: ldc 'MenuItem.selectionForeground'
    //   8: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
    //   11: lstore_2
    //   12: ldc 'MenuItem.acceleratorForeground'
    //   14: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
    //   17: lstore #4
    //   19: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
    //   22: invokevirtual getUnspecified-0d7_KjU : ()J
    //   25: lstore #6
    //   27: ldc 'PopupMenu.background'
    //   29: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
    //   32: ldc 'Popup.borderColor'
    //   34: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
    //   37: lstore #9
    //   39: iconst_0
    //   40: istore #11
    //   42: lload #9
    //   44: lstore #12
    //   46: iconst_0
    //   47: istore #14
    //   49: lload #12
    //   51: ldc2_w 16
    //   54: lcmp
    //   55: ifeq -> 62
    //   58: iconst_1
    //   59: goto -> 63
    //   62: iconst_0
    //   63: ifeq -> 71
    //   66: lload #9
    //   68: goto -> 88
    //   71: lstore #23
    //   73: iconst_0
    //   74: istore #15
    //   76: ldc 'Popup.Border.color'
    //   78: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
    //   81: lstore #25
    //   83: lload #23
    //   85: lload #25
    //   87: nop
    //   88: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
    //   91: invokevirtual getBlack-0d7_KjU : ()J
    //   94: ldc 0.6
    //   96: fconst_0
    //   97: fconst_0
    //   98: fconst_0
    //   99: bipush #14
    //   101: aconst_null
    //   102: invokestatic copy-wmQWz5c$default : (JFFFFILjava/lang/Object;)J
    //   105: new org/jetbrains/jewel/ui/component/styling/MenuItemColors
    //   108: dup
    //   109: ldc 'MenuItem.background'
    //   111: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
    //   114: ldc 'MenuItem.disabledBackground'
    //   116: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
    //   119: lload_0
    //   120: lload_0
    //   121: lload_0
    //   122: ldc 'PopupMenu.foreground'
    //   124: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
    //   127: ldc 'PopupMenu.disabledForeground'
    //   129: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
    //   132: lload_2
    //   133: lload_2
    //   134: lload_2
    //   135: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
    //   138: invokevirtual getUnspecified-0d7_KjU : ()J
    //   141: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
    //   144: invokevirtual getUnspecified-0d7_KjU : ()J
    //   147: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
    //   150: invokevirtual getUnspecified-0d7_KjU : ()J
    //   153: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
    //   156: invokevirtual getUnspecified-0d7_KjU : ()J
    //   159: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
    //   162: invokevirtual getUnspecified-0d7_KjU : ()J
    //   165: lload #4
    //   167: lload #4
    //   169: lload #6
    //   171: lload #6
    //   173: lload #6
    //   175: ldc 'Menu.separatorColor'
    //   177: invokestatic retrieveColorOrUnspecified : (Ljava/lang/String;)J
    //   180: aconst_null
    //   181: invokespecial <init> : (JJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   184: aconst_null
    //   185: astore #36
    //   187: astore #37
    //   189: lstore #38
    //   191: lstore #40
    //   193: lstore #42
    //   195: new org/jetbrains/jewel/ui/component/styling/MenuColors
    //   198: dup
    //   199: lload #42
    //   201: lload #40
    //   203: lload #38
    //   205: aload #37
    //   207: aload #36
    //   209: invokespecial <init> : (JJJLorg/jetbrains/jewel/ui/component/styling/MenuItemColors;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   212: astore #8
    //   214: invokestatic isDark : ()Z
    //   217: aload #8
    //   219: getstatic com/intellij/ide/ui/laf/intellij/IdeaPopupMenuUI.CORNER_RADIUS : Lcom/intellij/util/ui/JBValue;
    //   222: dup
    //   223: ldc 'CORNER_RADIUS'
    //   225: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   228: invokestatic getDp : (Lcom/intellij/util/ui/JBValue;)F
    //   231: invokestatic CornerSize-0680j_4 : (F)Landroidx/compose/foundation/shape/CornerSize;
    //   234: fconst_0
    //   235: fconst_0
    //   236: iconst_3
    //   237: aconst_null
    //   238: invokestatic PaddingValues-YgX7TsA$default : (FFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;
    //   241: fconst_0
    //   242: fconst_0
    //   243: iconst_3
    //   244: aconst_null
    //   245: invokestatic PaddingValues-YgX7TsA$default : (FFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;
    //   248: iconst_0
    //   249: istore #9
    //   251: iconst_0
    //   252: istore #10
    //   254: iload #9
    //   256: i2f
    //   257: invokestatic constructor-impl : (F)F
    //   260: iconst_2
    //   261: istore #9
    //   263: iconst_0
    //   264: istore #10
    //   266: iload #9
    //   268: i2f
    //   269: invokestatic constructor-impl : (F)F
    //   272: invokestatic DpOffset-YgX7TsA : (FF)J
    //   275: bipush #12
    //   277: istore #9
    //   279: iconst_0
    //   280: istore #10
    //   282: iload #9
    //   284: i2f
    //   285: invokestatic constructor-impl : (F)F
    //   288: ldc 'Popup.borderWidth'
    //   290: invokestatic retrieveIntAsDpOrUnspecified : (Ljava/lang/String;)F
    //   293: fstore #9
    //   295: iconst_0
    //   296: istore #10
    //   298: fload #9
    //   300: fstore #11
    //   302: iconst_0
    //   303: istore #12
    //   305: fload #11
    //   307: invokestatic isNaN : (F)Z
    //   310: ifne -> 317
    //   313: iconst_1
    //   314: goto -> 318
    //   317: iconst_0
    //   318: nop
    //   319: ifeq -> 327
    //   322: fload #9
    //   324: goto -> 376
    //   327: fstore #32
    //   329: lstore #30
    //   331: astore #29
    //   333: astore #28
    //   335: astore #27
    //   337: astore #24
    //   339: istore #23
    //   341: iconst_0
    //   342: istore #13
    //   344: iconst_1
    //   345: istore #14
    //   347: iconst_0
    //   348: istore #15
    //   350: iload #14
    //   352: i2f
    //   353: invokestatic constructor-impl : (F)F
    //   356: nop
    //   357: fstore #33
    //   359: iload #23
    //   361: aload #24
    //   363: aload #27
    //   365: aload #28
    //   367: aload #29
    //   369: lload #30
    //   371: fload #32
    //   373: fload #33
    //   375: nop
    //   376: iconst_0
    //   377: istore #10
    //   379: iconst_0
    //   380: istore #11
    //   382: iload #10
    //   384: i2f
    //   385: invokestatic constructor-impl : (F)F
    //   388: invokestatic CornerSize-0680j_4 : (F)Landroidx/compose/foundation/shape/CornerSize;
    //   391: astore #9
    //   393: fconst_0
    //   394: fconst_0
    //   395: iconst_3
    //   396: aconst_null
    //   397: invokestatic PaddingValues-YgX7TsA$default : (FFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;
    //   400: astore #10
    //   402: bipush #14
    //   404: istore #12
    //   406: iconst_0
    //   407: istore #13
    //   409: iload #12
    //   411: i2f
    //   412: invokestatic constructor-impl : (F)F
    //   415: iconst_4
    //   416: istore #12
    //   418: iconst_0
    //   419: istore #13
    //   421: iload #12
    //   423: i2f
    //   424: invokestatic constructor-impl : (F)F
    //   427: invokestatic PaddingValues-YgX7TsA : (FF)Landroidx/compose/foundation/layout/PaddingValues;
    //   430: astore #11
    //   432: bipush #36
    //   434: istore #13
    //   436: iconst_0
    //   437: istore #14
    //   439: iload #13
    //   441: i2f
    //   442: invokestatic constructor-impl : (F)F
    //   445: fconst_0
    //   446: fconst_0
    //   447: fconst_0
    //   448: bipush #14
    //   450: aconst_null
    //   451: invokestatic PaddingValues-a9UjIt4$default : (FFFFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;
    //   454: astore #12
    //   456: ldc 'PopupMenuSeparator.withToEdge'
    //   458: invokestatic retrieveIntAsDpOrUnspecified : (Ljava/lang/String;)F
    //   461: fstore #14
    //   463: iconst_0
    //   464: istore #15
    //   466: fload #14
    //   468: fstore #16
    //   470: iconst_0
    //   471: istore #17
    //   473: fload #16
    //   475: invokestatic isNaN : (F)Z
    //   478: ifne -> 485
    //   481: iconst_1
    //   482: goto -> 486
    //   485: iconst_0
    //   486: nop
    //   487: ifeq -> 495
    //   490: fload #14
    //   492: goto -> 548
    //   495: fstore #33
    //   497: fstore #32
    //   499: lstore #30
    //   501: astore #29
    //   503: astore #28
    //   505: astore #27
    //   507: astore #24
    //   509: istore #23
    //   511: iconst_0
    //   512: istore #18
    //   514: iconst_1
    //   515: istore #19
    //   517: iconst_0
    //   518: istore #20
    //   520: iload #19
    //   522: i2f
    //   523: invokestatic constructor-impl : (F)F
    //   526: nop
    //   527: fstore #34
    //   529: iload #23
    //   531: aload #24
    //   533: aload #27
    //   535: aload #28
    //   537: aload #29
    //   539: lload #30
    //   541: fload #32
    //   543: fload #33
    //   545: fload #34
    //   547: nop
    //   548: ldc 'PopupMenuSeparator.stripeIndent'
    //   550: invokestatic retrieveIntAsDpOrUnspecified : (Ljava/lang/String;)F
    //   553: fstore #14
    //   555: iconst_0
    //   556: istore #15
    //   558: fload #14
    //   560: fstore #16
    //   562: iconst_0
    //   563: istore #17
    //   565: fload #16
    //   567: invokestatic isNaN : (F)Z
    //   570: ifne -> 577
    //   573: iconst_1
    //   574: goto -> 578
    //   577: iconst_0
    //   578: nop
    //   579: ifeq -> 587
    //   582: fload #14
    //   584: goto -> 644
    //   587: fstore #34
    //   589: fstore #33
    //   591: fstore #32
    //   593: lstore #30
    //   595: astore #29
    //   597: astore #28
    //   599: astore #27
    //   601: astore #24
    //   603: istore #23
    //   605: iconst_0
    //   606: istore #18
    //   608: iconst_1
    //   609: istore #19
    //   611: iconst_0
    //   612: istore #20
    //   614: iload #19
    //   616: i2f
    //   617: invokestatic constructor-impl : (F)F
    //   620: nop
    //   621: fstore #35
    //   623: iload #23
    //   625: aload #24
    //   627: aload #27
    //   629: aload #28
    //   631: aload #29
    //   633: lload #30
    //   635: fload #32
    //   637: fload #33
    //   639: fload #34
    //   641: fload #35
    //   643: nop
    //   644: invokestatic PaddingValues-YgX7TsA : (FF)Landroidx/compose/foundation/layout/PaddingValues;
    //   647: astore #13
    //   649: ldc 'PopupMenuSeparator.stripeWidth'
    //   651: invokestatic retrieveIntAsDpOrUnspecified : (Ljava/lang/String;)F
    //   654: fstore #15
    //   656: iconst_0
    //   657: istore #16
    //   659: fload #15
    //   661: fstore #17
    //   663: iconst_0
    //   664: istore #18
    //   666: fload #17
    //   668: invokestatic isNaN : (F)Z
    //   671: ifne -> 678
    //   674: iconst_1
    //   675: goto -> 679
    //   678: iconst_0
    //   679: nop
    //   680: ifeq -> 688
    //   683: fload #15
    //   685: goto -> 741
    //   688: fstore #33
    //   690: fstore #32
    //   692: lstore #30
    //   694: astore #29
    //   696: astore #28
    //   698: astore #27
    //   700: astore #24
    //   702: istore #23
    //   704: iconst_0
    //   705: istore #19
    //   707: iconst_1
    //   708: istore #20
    //   710: iconst_0
    //   711: istore #21
    //   713: iload #20
    //   715: i2f
    //   716: invokestatic constructor-impl : (F)F
    //   719: nop
    //   720: fstore #34
    //   722: iload #23
    //   724: aload #24
    //   726: aload #27
    //   728: aload #28
    //   730: aload #29
    //   732: lload #30
    //   734: fload #32
    //   736: fload #33
    //   738: fload #34
    //   740: nop
    //   741: fstore #14
    //   743: ldc 'PopupMenuSeparator.height'
    //   745: invokestatic retrieveIntAsDpOrUnspecified : (Ljava/lang/String;)F
    //   748: fstore #16
    //   750: iconst_0
    //   751: istore #17
    //   753: fload #16
    //   755: fstore #18
    //   757: iconst_0
    //   758: istore #19
    //   760: fload #18
    //   762: invokestatic isNaN : (F)Z
    //   765: ifne -> 772
    //   768: iconst_1
    //   769: goto -> 773
    //   772: iconst_0
    //   773: nop
    //   774: ifeq -> 782
    //   777: fload #16
    //   779: goto -> 835
    //   782: fstore #33
    //   784: fstore #32
    //   786: lstore #30
    //   788: astore #29
    //   790: astore #28
    //   792: astore #27
    //   794: astore #24
    //   796: istore #23
    //   798: iconst_0
    //   799: istore #20
    //   801: iconst_3
    //   802: istore #21
    //   804: iconst_0
    //   805: istore #22
    //   807: iload #21
    //   809: i2f
    //   810: invokestatic constructor-impl : (F)F
    //   813: nop
    //   814: fstore #34
    //   816: iload #23
    //   818: aload #24
    //   820: aload #27
    //   822: aload #28
    //   824: aload #29
    //   826: lload #30
    //   828: fload #32
    //   830: fload #33
    //   832: fload #34
    //   834: nop
    //   835: fstore #15
    //   837: bipush #16
    //   839: istore #17
    //   841: iconst_0
    //   842: istore #18
    //   844: iload #17
    //   846: i2f
    //   847: invokestatic constructor-impl : (F)F
    //   850: fstore #16
    //   852: invokestatic isNewUiTheme : ()Z
    //   855: ifeq -> 875
    //   858: invokestatic rowHeight : ()I
    //   861: istore #18
    //   863: iconst_0
    //   864: istore #19
    //   866: iload #18
    //   868: i2f
    //   869: invokestatic constructor-impl : (F)F
    //   872: goto -> 881
    //   875: getstatic androidx/compose/ui/unit/Dp.Companion : Landroidx/compose/ui/unit/Dp$Companion;
    //   878: invokevirtual getUnspecified-D9Ej5fM : ()F
    //   881: fstore #17
    //   883: new org/jetbrains/jewel/ui/component/styling/MenuItemMetrics
    //   886: dup
    //   887: aload #9
    //   889: aload #10
    //   891: aload #11
    //   893: aload #13
    //   895: aload #12
    //   897: fload #14
    //   899: fload #15
    //   901: fload #16
    //   903: fload #17
    //   905: aconst_null
    //   906: invokespecial <init> : (Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/PaddingValues;FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   909: new org/jetbrains/jewel/ui/component/styling/SubmenuMetrics
    //   912: dup
    //   913: iconst_0
    //   914: istore #9
    //   916: iconst_0
    //   917: istore #10
    //   919: iload #9
    //   921: i2f
    //   922: invokestatic constructor-impl : (F)F
    //   925: bipush #-8
    //   927: istore #9
    //   929: iconst_0
    //   930: istore #10
    //   932: iload #9
    //   934: i2f
    //   935: invokestatic constructor-impl : (F)F
    //   938: invokestatic DpOffset-YgX7TsA : (FF)J
    //   941: aconst_null
    //   942: invokespecial <init> : (JLkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   945: aconst_null
    //   946: astore #44
    //   948: astore #45
    //   950: astore #46
    //   952: fstore #47
    //   954: fstore #48
    //   956: lstore #49
    //   958: astore #51
    //   960: astore #52
    //   962: astore #53
    //   964: new org/jetbrains/jewel/ui/component/styling/MenuMetrics
    //   967: dup
    //   968: aload #53
    //   970: aload #52
    //   972: aload #51
    //   974: lload #49
    //   976: fload #48
    //   978: fload #47
    //   980: aload #46
    //   982: aload #45
    //   984: aload #44
    //   986: invokespecial <init> : (Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/PaddingValues;JFFLorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;Lorg/jetbrains/jewel/ui/component/styling/SubmenuMetrics;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   989: new org/jetbrains/jewel/ui/component/styling/MenuIcons
    //   992: dup
    //   993: getstatic org/jetbrains/jewel/ui/icons/AllIconsKeys$General.INSTANCE : Lorg/jetbrains/jewel/ui/icons/AllIconsKeys$General;
    //   996: invokevirtual getChevronRight : ()Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;
    //   999: checkcast org/jetbrains/jewel/ui/icon/IconKey
    //   1002: invokespecial <init> : (Lorg/jetbrains/jewel/ui/icon/IconKey;)V
    //   1005: astore #54
    //   1007: astore #55
    //   1009: astore #56
    //   1011: istore #57
    //   1013: new org/jetbrains/jewel/ui/component/styling/MenuStyle
    //   1016: dup
    //   1017: iload #57
    //   1019: aload #56
    //   1021: aload #55
    //   1023: aload #54
    //   1025: invokespecial <init> : (ZLorg/jetbrains/jewel/ui/component/styling/MenuColors;Lorg/jetbrains/jewel/ui/component/styling/MenuMetrics;Lorg/jetbrains/jewel/ui/component/styling/MenuIcons;)V
    //   1028: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #27	-> 0
    //   #28	-> 6
    //   #29	-> 12
    //   #30	-> 19
    //   #33	-> 27
    //   #34	-> 27
    //   #36	-> 32
    //   #102	-> 42
    //   #103	-> 49
    //   #102	-> 63
    //   #37	-> 76
    //   #102	-> 87
    //   #39	-> 88
    //   #41	-> 105
    //   #42	-> 109
    //   #43	-> 114
    //   #44	-> 119
    //   #45	-> 120
    //   #46	-> 121
    //   #47	-> 122
    //   #48	-> 127
    //   #49	-> 132
    //   #50	-> 133
    //   #51	-> 134
    //   #52	-> 135
    //   #53	-> 141
    //   #54	-> 147
    //   #55	-> 153
    //   #56	-> 159
    //   #57	-> 165
    //   #58	-> 167
    //   #59	-> 169
    //   #60	-> 171
    //   #61	-> 173
    //   #62	-> 175
    //   #41	-> 181
    //   #33	-> 185
    //   #32	-> 212
    //   #66	-> 214
    //   #67	-> 214
    //   #68	-> 217
    //   #70	-> 219
    //   #71	-> 219
    //   #72	-> 234
    //   #73	-> 241
    //   #74	-> 248
    //   #104	-> 254
    //   #74	-> 260
    //   #104	-> 266
    //   #74	-> 272
    //   #75	-> 275
    //   #105	-> 282
    //   #76	-> 288
    //   #106	-> 298
    //   #107	-> 305
    //   #107	-> 318
    //   #106	-> 319
    //   #76	-> 344
    //   #108	-> 350
    //   #76	-> 356
    //   #106	-> 375
    //   #79	-> 376
    //   #109	-> 382
    //   #79	-> 388
    //   #80	-> 393
    //   #81	-> 402
    //   #110	-> 409
    //   #81	-> 415
    //   #110	-> 421
    //   #81	-> 427
    //   #82	-> 432
    //   #111	-> 439
    //   #82	-> 445
    //   #86	-> 456
    //   #112	-> 466
    //   #113	-> 473
    //   #113	-> 486
    //   #112	-> 487
    //   #86	-> 514
    //   #114	-> 520
    //   #86	-> 526
    //   #112	-> 547
    //   #88	-> 548
    //   #115	-> 558
    //   #116	-> 565
    //   #116	-> 578
    //   #115	-> 579
    //   #88	-> 608
    //   #117	-> 614
    //   #88	-> 620
    //   #115	-> 643
    //   #84	-> 644
    //   #91	-> 649
    //   #118	-> 659
    //   #119	-> 666
    //   #119	-> 679
    //   #118	-> 680
    //   #91	-> 707
    //   #120	-> 713
    //   #91	-> 719
    //   #118	-> 740
    //   #91	-> 741
    //   #92	-> 743
    //   #121	-> 753
    //   #122	-> 760
    //   #122	-> 773
    //   #121	-> 774
    //   #92	-> 801
    //   #123	-> 807
    //   #92	-> 813
    //   #121	-> 834
    //   #92	-> 835
    //   #93	-> 837
    //   #124	-> 844
    //   #93	-> 850
    //   #94	-> 852
    //   #125	-> 866
    //   #94	-> 875
    //   #78	-> 883
    //   #79	-> 887
    //   #80	-> 889
    //   #81	-> 891
    //   #84	-> 893
    //   #82	-> 895
    //   #91	-> 897
    //   #92	-> 899
    //   #93	-> 901
    //   #94	-> 903
    //   #78	-> 906
    //   #96	-> 909
    //   #126	-> 919
    //   #96	-> 925
    //   #126	-> 932
    //   #96	-> 938
    //   #70	-> 946
    //   #98	-> 989
    //   #66	-> 1005
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   76	5	15	$i$a$-takeOrElse-DxMtmZc-IntUiBridgeMenuKt$readMenuStyle$colors$1	I
    //   49	14	14	$i$f$isSpecified-8_81llA	I
    //   46	17	12	$this$isSpecified$iv$iv	J
    //   42	46	11	$i$f$takeOrElse-DxMtmZc	I
    //   39	49	9	$this$takeOrElse_u2dDxMtmZc$iv	J
    //   254	6	10	$i$f$getDp	I
    //   251	9	9	$this$dp$iv	I
    //   266	6	10	$i$f$getDp	I
    //   263	9	9	$this$dp$iv	I
    //   282	6	10	$i$f$getDp	I
    //   279	9	9	$this$dp$iv	I
    //   350	6	15	$i$f$getDp	I
    //   347	9	14	$this$dp$iv	I
    //   344	13	13	$i$a$-takeOrElse-D5KLDUw-IntUiBridgeMenuKt$readMenuStyle$1	I
    //   305	14	12	$i$f$isSpecified-0680j_4	I
    //   302	17	11	$this$isSpecified$iv$iv	F
    //   298	78	10	$i$f$takeOrElse-D5KLDUw	I
    //   295	81	9	$this$takeOrElse_u2dD5KLDUw$iv	F
    //   382	6	11	$i$f$getDp	I
    //   379	9	10	$this$dp$iv	I
    //   409	6	13	$i$f$getDp	I
    //   406	9	12	$this$dp$iv	I
    //   421	6	13	$i$f$getDp	I
    //   418	9	12	$this$dp$iv	I
    //   439	6	14	$i$f$getDp	I
    //   436	9	13	$this$dp$iv	I
    //   520	6	20	$i$f$getDp	I
    //   517	9	19	$this$dp$iv	I
    //   514	13	18	$i$a$-takeOrElse-D5KLDUw-IntUiBridgeMenuKt$readMenuStyle$2	I
    //   473	14	17	$i$f$isSpecified-0680j_4	I
    //   470	17	16	$this$isSpecified$iv$iv	F
    //   466	82	15	$i$f$takeOrElse-D5KLDUw	I
    //   463	85	14	$this$takeOrElse_u2dD5KLDUw$iv	F
    //   614	6	20	$i$f$getDp	I
    //   611	9	19	$this$dp$iv	I
    //   608	13	18	$i$a$-takeOrElse-D5KLDUw-IntUiBridgeMenuKt$readMenuStyle$3	I
    //   565	14	17	$i$f$isSpecified-0680j_4	I
    //   562	17	16	$this$isSpecified$iv$iv	F
    //   558	86	15	$i$f$takeOrElse-D5KLDUw	I
    //   555	89	14	$this$takeOrElse_u2dD5KLDUw$iv	F
    //   713	6	21	$i$f$getDp	I
    //   710	9	20	$this$dp$iv	I
    //   707	13	19	$i$a$-takeOrElse-D5KLDUw-IntUiBridgeMenuKt$readMenuStyle$4	I
    //   666	14	18	$i$f$isSpecified-0680j_4	I
    //   663	17	17	$this$isSpecified$iv$iv	F
    //   659	82	16	$i$f$takeOrElse-D5KLDUw	I
    //   656	85	15	$this$takeOrElse_u2dD5KLDUw$iv	F
    //   807	6	22	$i$f$getDp	I
    //   804	9	21	$this$dp$iv	I
    //   801	13	20	$i$a$-takeOrElse-D5KLDUw-IntUiBridgeMenuKt$readMenuStyle$5	I
    //   760	14	19	$i$f$isSpecified-0680j_4	I
    //   757	17	18	$this$isSpecified$iv$iv	F
    //   753	82	17	$i$f$takeOrElse-D5KLDUw	I
    //   750	85	16	$this$takeOrElse_u2dD5KLDUw$iv	F
    //   844	6	18	$i$f$getDp	I
    //   841	9	17	$this$dp$iv	I
    //   866	6	19	$i$f$getDp	I
    //   863	9	18	$this$dp$iv	I
    //   919	6	10	$i$f$getDp	I
    //   916	9	9	$this$dp$iv	I
    //   932	6	10	$i$f$getDp	I
    //   929	9	9	$this$dp$iv	I
    //   6	1023	0	backgroundSelected	J
    //   12	1017	2	foregroundSelected	J
    //   19	1010	4	keybindingTint	J
    //   27	1002	6	keybindingTintSelected	J
    //   214	815	8	colors	Lorg/jetbrains/jewel/ui/component/styling/MenuColors;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\IntUiBridgeMenuKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */