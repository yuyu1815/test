package org.jetbrains.jewel.ui.component;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jewel.ui.Orientation;
import org.jetbrains.jewel.ui.component.styling.DividerStyle;

@Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000*\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\032I\020\000\032\0020\0012\006\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\t2\b\b\002\020\013\032\0020\fH\007¢\006\004\b\r\020\016¨\006\017"}, d2 = {"Divider", "", "orientation", "Lorg/jetbrains/jewel/ui/Orientation;", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "thickness", "Landroidx/compose/ui/unit/Dp;", "startIndent", "style", "Lorg/jetbrains/jewel/ui/component/styling/DividerStyle;", "Divider-RLL6an4", "(Lorg/jetbrains/jewel/ui/Orientation;Landroidx/compose/ui/Modifier;JFFLorg/jetbrains/jewel/ui/component/styling/DividerStyle;Landroidx/compose/runtime/Composer;II)V", "ui"})
@SourceDebugExtension({"SMAP\nDivider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Divider.kt\norg/jetbrains/jewel/ui/component/DividerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 ModifierExtensions.kt\norg/jetbrains/jewel/ui/util/ModifierExtensionsKt\n*L\n1#1,44:1\n139#2:45\n125#2:46\n139#2:50\n125#2:51\n708#3:47\n696#3:48\n10#4:49\n*S KotlinDebug\n*F\n+ 1 Divider.kt\norg/jetbrains/jewel/ui/component/DividerKt\n*L\n29#1:45\n29#1:46\n39#1:50\n39#1:51\n36#1:47\n36#1:48\n39#1:49\n*E\n"})
public final class DividerKt {
  @Composable
  @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
  public static final void Divider-RLL6an4(@NotNull Orientation orientation, @Nullable Modifier modifier, long color, float thickness, float startIndent, @Nullable DividerStyle style, @Nullable Composer $composer, int $changed, int paramInt1) {
    // Byte code:
    //   0: aload_0
    //   1: ldc 'orientation'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload #7
    //   8: ldc -2030380112
    //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
    //   15: astore #7
    //   17: iload #8
    //   19: istore #10
    //   21: iload #9
    //   23: iconst_1
    //   24: iand
    //   25: ifeq -> 38
    //   28: iload #10
    //   30: bipush #6
    //   32: ior
    //   33: istore #10
    //   35: goto -> 67
    //   38: iload #8
    //   40: bipush #6
    //   42: iand
    //   43: ifne -> 67
    //   46: iload #10
    //   48: aload #7
    //   50: aload_0
    //   51: invokeinterface changed : (Ljava/lang/Object;)Z
    //   56: ifeq -> 63
    //   59: iconst_4
    //   60: goto -> 64
    //   63: iconst_2
    //   64: ior
    //   65: istore #10
    //   67: iload #9
    //   69: iconst_2
    //   70: iand
    //   71: ifeq -> 84
    //   74: iload #10
    //   76: bipush #48
    //   78: ior
    //   79: istore #10
    //   81: goto -> 115
    //   84: iload #8
    //   86: bipush #48
    //   88: iand
    //   89: ifne -> 115
    //   92: iload #10
    //   94: aload #7
    //   96: aload_1
    //   97: invokeinterface changed : (Ljava/lang/Object;)Z
    //   102: ifeq -> 110
    //   105: bipush #32
    //   107: goto -> 112
    //   110: bipush #16
    //   112: ior
    //   113: istore #10
    //   115: iload #9
    //   117: iconst_4
    //   118: iand
    //   119: ifeq -> 133
    //   122: iload #10
    //   124: sipush #384
    //   127: ior
    //   128: istore #10
    //   130: goto -> 167
    //   133: iload #8
    //   135: sipush #384
    //   138: iand
    //   139: ifne -> 167
    //   142: iload #10
    //   144: aload #7
    //   146: lload_2
    //   147: invokeinterface changed : (J)Z
    //   152: ifeq -> 161
    //   155: sipush #256
    //   158: goto -> 164
    //   161: sipush #128
    //   164: ior
    //   165: istore #10
    //   167: iload #9
    //   169: bipush #8
    //   171: iand
    //   172: ifeq -> 186
    //   175: iload #10
    //   177: sipush #3072
    //   180: ior
    //   181: istore #10
    //   183: goto -> 221
    //   186: iload #8
    //   188: sipush #3072
    //   191: iand
    //   192: ifne -> 221
    //   195: iload #10
    //   197: aload #7
    //   199: fload #4
    //   201: invokeinterface changed : (F)Z
    //   206: ifeq -> 215
    //   209: sipush #2048
    //   212: goto -> 218
    //   215: sipush #1024
    //   218: ior
    //   219: istore #10
    //   221: iload #9
    //   223: bipush #16
    //   225: iand
    //   226: ifeq -> 240
    //   229: iload #10
    //   231: sipush #24576
    //   234: ior
    //   235: istore #10
    //   237: goto -> 275
    //   240: iload #8
    //   242: sipush #24576
    //   245: iand
    //   246: ifne -> 275
    //   249: iload #10
    //   251: aload #7
    //   253: fload #5
    //   255: invokeinterface changed : (F)Z
    //   260: ifeq -> 269
    //   263: sipush #16384
    //   266: goto -> 272
    //   269: sipush #8192
    //   272: ior
    //   273: istore #10
    //   275: iload #8
    //   277: ldc 196608
    //   279: iand
    //   280: ifne -> 315
    //   283: iload #10
    //   285: iload #9
    //   287: bipush #32
    //   289: iand
    //   290: ifne -> 310
    //   293: aload #7
    //   295: aload #6
    //   297: invokeinterface changed : (Ljava/lang/Object;)Z
    //   302: ifeq -> 310
    //   305: ldc 131072
    //   307: goto -> 312
    //   310: ldc 65536
    //   312: ior
    //   313: istore #10
    //   315: iload #10
    //   317: ldc 74899
    //   319: iand
    //   320: ldc 74898
    //   322: if_icmpne -> 335
    //   325: aload #7
    //   327: invokeinterface getSkipping : ()Z
    //   332: ifne -> 807
    //   335: aload #7
    //   337: invokeinterface startDefaults : ()V
    //   342: iload #8
    //   344: iconst_1
    //   345: iand
    //   346: ifeq -> 359
    //   349: aload #7
    //   351: invokeinterface getDefaultsInvalid : ()Z
    //   356: ifeq -> 449
    //   359: iload #9
    //   361: iconst_2
    //   362: iand
    //   363: ifeq -> 373
    //   366: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   369: checkcast androidx/compose/ui/Modifier
    //   372: astore_1
    //   373: iload #9
    //   375: iconst_4
    //   376: iand
    //   377: ifeq -> 387
    //   380: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
    //   383: invokevirtual getUnspecified-0d7_KjU : ()J
    //   386: lstore_2
    //   387: iload #9
    //   389: bipush #8
    //   391: iand
    //   392: ifeq -> 403
    //   395: getstatic androidx/compose/ui/unit/Dp.Companion : Landroidx/compose/ui/unit/Dp$Companion;
    //   398: invokevirtual getUnspecified-D9Ej5fM : ()F
    //   401: fstore #4
    //   403: iload #9
    //   405: bipush #16
    //   407: iand
    //   408: ifeq -> 419
    //   411: getstatic androidx/compose/ui/unit/Dp.Companion : Landroidx/compose/ui/unit/Dp$Companion;
    //   414: invokevirtual getUnspecified-D9Ej5fM : ()F
    //   417: fstore #5
    //   419: iload #9
    //   421: bipush #32
    //   423: iand
    //   424: ifeq -> 471
    //   427: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
    //   430: aload #7
    //   432: bipush #6
    //   434: invokestatic getDividerStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/DividerStyle;
    //   437: astore #6
    //   439: iload #10
    //   441: ldc -458753
    //   443: iand
    //   444: istore #10
    //   446: goto -> 471
    //   449: aload #7
    //   451: invokeinterface skipToGroupEnd : ()V
    //   456: iload #9
    //   458: bipush #32
    //   460: iand
    //   461: ifeq -> 471
    //   464: iload #10
    //   466: ldc -458753
    //   468: iand
    //   469: istore #10
    //   471: aload #7
    //   473: invokeinterface endDefaults : ()V
    //   478: invokestatic isTraceInProgress : ()Z
    //   481: ifeq -> 494
    //   484: ldc -2030380112
    //   486: iload #10
    //   488: iconst_m1
    //   489: ldc 'org.jetbrains.jewel.ui.component.Divider (Divider.kt:27)'
    //   491: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   494: fload #4
    //   496: fstore #12
    //   498: iconst_0
    //   499: istore #13
    //   501: fload #12
    //   503: fstore #14
    //   505: iconst_0
    //   506: istore #15
    //   508: fload #14
    //   510: invokestatic isNaN : (F)Z
    //   513: ifne -> 520
    //   516: iconst_1
    //   517: goto -> 521
    //   520: iconst_0
    //   521: nop
    //   522: ifeq -> 530
    //   525: fload #12
    //   527: goto -> 542
    //   530: iconst_0
    //   531: istore #16
    //   533: aload #6
    //   535: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/DividerMetrics;
    //   538: invokevirtual getThickness-D9Ej5fM : ()F
    //   541: nop
    //   542: fstore #11
    //   544: aload_0
    //   545: getstatic org/jetbrains/jewel/ui/component/DividerKt$WhenMappings.$EnumSwitchMapping$0 : [I
    //   548: swap
    //   549: invokevirtual ordinal : ()I
    //   552: iaload
    //   553: tableswitch default -> 604, 1 -> 576, 2 -> 590
    //   576: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   579: checkcast androidx/compose/ui/Modifier
    //   582: fload #11
    //   584: invokestatic height-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
    //   587: goto -> 612
    //   590: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   593: checkcast androidx/compose/ui/Modifier
    //   596: fload #11
    //   598: invokestatic width-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
    //   601: goto -> 612
    //   604: new kotlin/NoWhenBranchMatchedException
    //   607: dup
    //   608: invokespecial <init> : ()V
    //   611: athrow
    //   612: astore #12
    //   614: lload_2
    //   615: lstore #15
    //   617: iconst_0
    //   618: istore #17
    //   620: lload #15
    //   622: lstore #18
    //   624: iconst_0
    //   625: istore #20
    //   627: lload #18
    //   629: ldc2_w 16
    //   632: lcmp
    //   633: ifeq -> 640
    //   636: iconst_1
    //   637: goto -> 641
    //   640: iconst_0
    //   641: ifeq -> 649
    //   644: lload #15
    //   646: goto -> 658
    //   649: iconst_0
    //   650: istore #21
    //   652: aload #6
    //   654: invokevirtual getColor-0d7_KjU : ()J
    //   657: nop
    //   658: lstore #13
    //   660: aload_1
    //   661: astore #15
    //   663: fload #5
    //   665: fconst_0
    //   666: fcmpg
    //   667: ifne -> 674
    //   670: iconst_1
    //   671: goto -> 675
    //   674: iconst_0
    //   675: ifne -> 682
    //   678: iconst_1
    //   679: goto -> 683
    //   682: iconst_0
    //   683: istore #16
    //   685: iconst_0
    //   686: istore #17
    //   688: iload #16
    //   690: ifeq -> 772
    //   693: aload #15
    //   695: astore #18
    //   697: iconst_0
    //   698: istore #19
    //   700: aload #18
    //   702: fload #5
    //   704: fstore #20
    //   706: iconst_0
    //   707: istore #21
    //   709: fload #20
    //   711: fstore #22
    //   713: iconst_0
    //   714: istore #23
    //   716: fload #22
    //   718: invokestatic isNaN : (F)Z
    //   721: ifne -> 728
    //   724: iconst_1
    //   725: goto -> 729
    //   728: iconst_0
    //   729: nop
    //   730: ifeq -> 738
    //   733: fload #20
    //   735: goto -> 760
    //   738: astore #24
    //   740: iconst_0
    //   741: istore #25
    //   743: aload #6
    //   745: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/DividerMetrics;
    //   748: invokevirtual getStartIndent-D9Ej5fM : ()F
    //   751: invokestatic box-impl : (F)Landroidx/compose/ui/unit/Dp;
    //   754: aload #24
    //   756: swap
    //   757: invokevirtual unbox-impl : ()F
    //   760: fconst_0
    //   761: fconst_0
    //   762: fconst_0
    //   763: bipush #14
    //   765: aconst_null
    //   766: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   769: goto -> 774
    //   772: aload #15
    //   774: aload #12
    //   776: invokeinterface then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   781: lload #13
    //   783: aconst_null
    //   784: iconst_2
    //   785: aconst_null
    //   786: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   789: aload #7
    //   791: iconst_0
    //   792: invokestatic Box : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    //   795: invokestatic isTraceInProgress : ()Z
    //   798: ifeq -> 814
    //   801: invokestatic traceEventEnd : ()V
    //   804: goto -> 814
    //   807: aload #7
    //   809: invokeinterface skipToGroupEnd : ()V
    //   814: aload #7
    //   816: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   821: dup
    //   822: ifnull -> 851
    //   825: aload_0
    //   826: aload_1
    //   827: lload_2
    //   828: fload #4
    //   830: fload #5
    //   832: aload #6
    //   834: iload #8
    //   836: iload #9
    //   838: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/Orientation;Landroidx/compose/ui/Modifier;JFFLorg/jetbrains/jewel/ui/component/styling/DividerStyle;II)Lkotlin/jvm/functions/Function2;
    //   843: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   848: goto -> 852
    //   851: pop
    //   852: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #28	-> 6
    //   #23	-> 366
    //   #24	-> 380
    //   #25	-> 395
    //   #26	-> 411
    //   #27	-> 427
    //   #28	-> 491
    //   #29	-> 494
    //   #45	-> 501
    //   #46	-> 508
    //   #46	-> 521
    //   #45	-> 522
    //   #29	-> 533
    //   #45	-> 541
    //   #29	-> 542
    //   #31	-> 544
    //   #32	-> 576
    //   #33	-> 590
    //   #31	-> 604
    //   #30	-> 612
    //   #36	-> 614
    //   #47	-> 620
    //   #48	-> 627
    //   #47	-> 641
    //   #36	-> 652
    //   #47	-> 657
    //   #36	-> 658
    //   #38	-> 660
    //   #39	-> 663
    //   #49	-> 688
    //   #39	-> 700
    //   #50	-> 709
    //   #51	-> 716
    //   #51	-> 729
    //   #50	-> 730
    //   #39	-> 743
    //   #50	-> 757
    //   #39	-> 760
    //   #49	-> 769
    //   #40	-> 774
    //   #41	-> 781
    //   #37	-> 792
    //   #43	-> 807
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   533	8	16	$i$a$-takeOrElse-D5KLDUw-DividerKt$Divider$actualThickness$1	I
    //   508	14	15	$i$f$isSpecified-0680j_4	I
    //   505	17	14	$this$isSpecified$iv$iv	F
    //   501	41	13	$i$f$takeOrElse-D5KLDUw	I
    //   498	44	12	$this$takeOrElse_u2dD5KLDUw$iv	F
    //   652	5	21	$i$a$-takeOrElse-DxMtmZc-DividerKt$Divider$lineColor$1	I
    //   627	14	20	$i$f$isSpecified-8_81llA	I
    //   624	17	18	$this$isSpecified$iv$iv	J
    //   620	38	17	$i$f$takeOrElse-DxMtmZc	I
    //   617	41	15	$this$takeOrElse_u2dDxMtmZc$iv	J
    //   743	8	25	$i$a$-takeOrElse-D5KLDUw-DividerKt$Divider$1$1	I
    //   716	14	23	$i$f$isSpecified-0680j_4	I
    //   713	17	22	$this$isSpecified$iv$iv	F
    //   709	51	21	$i$f$takeOrElse-D5KLDUw	I
    //   706	54	20	$this$takeOrElse_u2dD5KLDUw$iv	F
    //   700	69	19	$i$a$-thenIf-DividerKt$Divider$1	I
    //   697	72	18	$this$Divider_RLL6an4_u24lambda_u243	Landroidx/compose/ui/Modifier;
    //   688	86	17	$i$f$thenIf	I
    //   685	89	15	$this$thenIf$iv	Landroidx/compose/ui/Modifier;
    //   685	89	16	precondition$iv	Z
    //   544	260	11	actualThickness	F
    //   614	190	12	orientationModifier	Landroidx/compose/ui/Modifier;
    //   660	144	13	lineColor	J
    //   21	832	10	$dirty	I
    //   0	853	0	orientation	Lorg/jetbrains/jewel/ui/Orientation;
    //   0	853	1	modifier	Landroidx/compose/ui/Modifier;
    //   0	853	2	color	J
    //   0	853	4	thickness	F
    //   0	853	5	startIndent	F
    //   0	853	6	style	Lorg/jetbrains/jewel/ui/component/styling/DividerStyle;
    //   0	853	7	$composer	Landroidx/compose/runtime/Composer;
    //   0	853	8	$changed	I
  }
  
  private static final Unit Divider_RLL6an4$lambda$4(Orientation $orientation, Modifier $modifier, long $color, float $thickness, float $startIndent, DividerStyle $style, int $$changed, int $$default, Composer $composer, int $force) {
    Divider-RLL6an4($orientation, $modifier, $color, $thickness, $startIndent, $style, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
    return Unit.INSTANCE;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\DividerKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */