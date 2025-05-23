package com.intellij.ml.llm.matterhorn.ej.ui.lockscreen;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.intellij.ml.llm.matterhorn.ej.core.JuniePreconditionChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\032\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\002\032%\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0060\005H\007¢\006\002\020\007¨\006\b"}, d2 = {"LockScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "problems", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem;", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "ej-ui"})
@SourceDebugExtension({"SMAP\nLockScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockScreen.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/lockscreen/LockScreenKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,28:1\n149#2:29\n149#2:66\n86#3:30\n83#3,6:31\n89#3:65\n86#3:67\n83#3,6:68\n89#3:102\n93#3:108\n93#3:112\n79#4,6:37\n86#4,4:52\n90#4,2:62\n79#4,6:74\n86#4,4:89\n90#4,2:99\n94#4:107\n94#4:111\n368#5,9:43\n377#5:64\n368#5,9:80\n377#5:101\n378#5,2:105\n378#5,2:109\n4034#6,6:56\n4034#6,6:93\n1863#7,2:103\n*S KotlinDebug\n*F\n+ 1 LockScreen.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/lockscreen/LockScreenKt\n*L\n19#1:29\n22#1:66\n17#1:30\n17#1:31,6\n17#1:65\n22#1:67\n22#1:68,6\n22#1:102\n22#1:108\n17#1:112\n17#1:37,6\n17#1:52,4\n17#1:62,2\n22#1:74,6\n22#1:89,4\n22#1:99,2\n22#1:107\n17#1:111\n17#1:43,9\n17#1:64\n22#1:80,9\n22#1:101\n22#1:105,2\n17#1:109,2\n17#1:56,6\n22#1:93,6\n23#1:103,2\n*E\n"})
public final class LockScreenKt {
  @Composable
  @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
  public static final void LockScreen(@Nullable Modifier modifier, @NotNull List problems, @Nullable Composer $composer, int $changed, int paramInt1) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'problems'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_2
    //   7: ldc 1823153733
    //   9: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
    //   14: astore_2
    //   15: iload_3
    //   16: istore #5
    //   18: iload #4
    //   20: iconst_1
    //   21: iand
    //   22: ifeq -> 35
    //   25: iload #5
    //   27: bipush #6
    //   29: ior
    //   30: istore #5
    //   32: goto -> 62
    //   35: iload_3
    //   36: bipush #6
    //   38: iand
    //   39: ifne -> 62
    //   42: iload #5
    //   44: aload_2
    //   45: aload_0
    //   46: invokeinterface changed : (Ljava/lang/Object;)Z
    //   51: ifeq -> 58
    //   54: iconst_4
    //   55: goto -> 59
    //   58: iconst_2
    //   59: ior
    //   60: istore #5
    //   62: iload #4
    //   64: iconst_2
    //   65: iand
    //   66: ifeq -> 79
    //   69: iload #5
    //   71: bipush #48
    //   73: ior
    //   74: istore #5
    //   76: goto -> 108
    //   79: iload_3
    //   80: bipush #48
    //   82: iand
    //   83: ifne -> 108
    //   86: iload #5
    //   88: aload_2
    //   89: aload_1
    //   90: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   95: ifeq -> 103
    //   98: bipush #32
    //   100: goto -> 105
    //   103: bipush #16
    //   105: ior
    //   106: istore #5
    //   108: iload #5
    //   110: bipush #19
    //   112: iand
    //   113: bipush #18
    //   115: if_icmpne -> 127
    //   118: aload_2
    //   119: invokeinterface getSkipping : ()Z
    //   124: ifne -> 1186
    //   127: iload #4
    //   129: iconst_1
    //   130: iand
    //   131: ifeq -> 141
    //   134: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   137: checkcast androidx/compose/ui/Modifier
    //   140: astore_0
    //   141: invokestatic isTraceInProgress : ()Z
    //   144: ifeq -> 157
    //   147: ldc 1823153733
    //   149: iload #5
    //   151: iconst_m1
    //   152: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.lockscreen.LockScreen (LockScreen.kt:15)'
    //   154: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   157: aload_0
    //   158: aload_2
    //   159: iconst_0
    //   160: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
    //   163: invokevirtual getBackgroundColor-0d7_KjU : ()J
    //   166: aconst_null
    //   167: iconst_2
    //   168: aconst_null
    //   169: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   172: astore #6
    //   174: bipush #32
    //   176: istore #8
    //   178: iconst_0
    //   179: istore #9
    //   181: iload #8
    //   183: i2f
    //   184: invokestatic constructor-impl : (F)F
    //   187: fstore #7
    //   189: bipush #32
    //   191: istore #9
    //   193: iconst_0
    //   194: istore #10
    //   196: iload #9
    //   198: i2f
    //   199: invokestatic constructor-impl : (F)F
    //   202: fstore #8
    //   204: bipush #42
    //   206: istore #10
    //   208: iconst_0
    //   209: istore #11
    //   211: iload #10
    //   213: i2f
    //   214: invokestatic constructor-impl : (F)F
    //   217: fstore #9
    //   219: bipush #40
    //   221: istore #11
    //   223: iconst_0
    //   224: istore #12
    //   226: iload #11
    //   228: i2f
    //   229: invokestatic constructor-impl : (F)F
    //   232: fstore #10
    //   234: aload #6
    //   236: fload #7
    //   238: fload #9
    //   240: fload #8
    //   242: fload #10
    //   244: invokestatic padding-qDBjuR0 : (Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;
    //   247: astore #6
    //   249: iconst_0
    //   250: istore #9
    //   252: nop
    //   253: iconst_0
    //   254: istore #10
    //   256: aload_2
    //   257: ldc -483455358
    //   259: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
    //   261: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   264: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
    //   267: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
    //   270: astore #7
    //   272: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   275: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
    //   278: astore #8
    //   280: aload #7
    //   282: aload #8
    //   284: aload_2
    //   285: bipush #14
    //   287: iload #9
    //   289: iconst_3
    //   290: ishr
    //   291: iand
    //   292: bipush #112
    //   294: iload #9
    //   296: iconst_3
    //   297: ishr
    //   298: iand
    //   299: ior
    //   300: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    //   303: astore #11
    //   305: bipush #112
    //   307: iload #9
    //   309: iconst_3
    //   310: ishl
    //   311: iand
    //   312: istore #12
    //   314: nop
    //   315: iconst_0
    //   316: istore #13
    //   318: aload_2
    //   319: ldc -1323940314
    //   321: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   323: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   326: aload_2
    //   327: iconst_0
    //   328: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   331: istore #14
    //   333: aload_2
    //   334: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   339: astore #15
    //   341: aload_2
    //   342: aload #6
    //   344: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   347: astore #16
    //   349: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   352: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   355: astore #17
    //   357: bipush #6
    //   359: sipush #896
    //   362: iload #12
    //   364: bipush #6
    //   366: ishl
    //   367: iand
    //   368: ior
    //   369: istore #18
    //   371: nop
    //   372: iconst_0
    //   373: istore #19
    //   375: aload_2
    //   376: ldc -692256719
    //   378: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   380: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   383: aload_2
    //   384: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   389: instanceof androidx/compose/runtime/Applier
    //   392: ifne -> 398
    //   395: invokestatic invalidApplier : ()V
    //   398: aload_2
    //   399: invokeinterface startReusableNode : ()V
    //   404: aload_2
    //   405: invokeinterface getInserting : ()Z
    //   410: ifeq -> 424
    //   413: aload_2
    //   414: aload #17
    //   416: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   421: goto -> 430
    //   424: aload_2
    //   425: invokeinterface useNode : ()V
    //   430: aload_2
    //   431: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   434: astore #20
    //   436: iconst_0
    //   437: istore #21
    //   439: aload #20
    //   441: aload #11
    //   443: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   446: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   449: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   452: aload #20
    //   454: aload #15
    //   456: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   459: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   462: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   465: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   468: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   471: astore #22
    //   473: iconst_0
    //   474: istore #23
    //   476: aload #20
    //   478: astore #24
    //   480: iconst_0
    //   481: istore #25
    //   483: aload #24
    //   485: invokeinterface getInserting : ()Z
    //   490: ifne -> 511
    //   493: aload #24
    //   495: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   500: iload #14
    //   502: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   505: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   508: ifne -> 537
    //   511: aload #24
    //   513: iload #14
    //   515: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   518: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   523: aload #20
    //   525: iload #14
    //   527: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   530: aload #22
    //   532: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   537: nop
    //   538: nop
    //   539: nop
    //   540: aload #20
    //   542: aload #16
    //   544: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   547: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   550: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   553: nop
    //   554: nop
    //   555: aload_2
    //   556: bipush #14
    //   558: iload #18
    //   560: bipush #6
    //   562: ishr
    //   563: iand
    //   564: istore #26
    //   566: astore #27
    //   568: iconst_0
    //   569: istore #28
    //   571: aload #27
    //   573: ldc -384784025
    //   575: ldc 'C88@4444L9:Column.kt#2w3rfo'
    //   577: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   580: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
    //   583: aload #27
    //   585: bipush #6
    //   587: bipush #112
    //   589: iload #9
    //   591: bipush #6
    //   593: ishr
    //   594: iand
    //   595: ior
    //   596: istore #29
    //   598: astore #30
    //   600: checkcast androidx/compose/foundation/layout/ColumnScope
    //   603: astore #31
    //   605: iconst_0
    //   606: istore #32
    //   608: aconst_null
    //   609: aconst_null
    //   610: aload #30
    //   612: iconst_0
    //   613: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
    //   616: aload #30
    //   618: getstatic com/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData.$stable : I
    //   621: invokevirtual getInactiveTextColor : (Landroidx/compose/runtime/Composer;I)J
    //   624: aload #30
    //   626: iconst_0
    //   627: iconst_3
    //   628: invokestatic JunieLogo-FNF3uiM : (Landroidx/compose/ui/Modifier;Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)V
    //   631: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   634: checkcast androidx/compose/ui/Modifier
    //   637: fconst_0
    //   638: bipush #20
    //   640: istore #33
    //   642: iconst_0
    //   643: istore #34
    //   645: iload #33
    //   647: i2f
    //   648: invokestatic constructor-impl : (F)F
    //   651: fconst_0
    //   652: fconst_0
    //   653: bipush #13
    //   655: aconst_null
    //   656: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   659: astore #33
    //   661: bipush #6
    //   663: istore #35
    //   665: iconst_0
    //   666: istore #36
    //   668: aload #30
    //   670: ldc -483455358
    //   672: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
    //   674: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   677: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
    //   680: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
    //   683: astore #34
    //   685: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   688: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
    //   691: astore #37
    //   693: aload #34
    //   695: aload #37
    //   697: aload #30
    //   699: bipush #14
    //   701: iload #35
    //   703: iconst_3
    //   704: ishr
    //   705: iand
    //   706: bipush #112
    //   708: iload #35
    //   710: iconst_3
    //   711: ishr
    //   712: iand
    //   713: ior
    //   714: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    //   717: astore #38
    //   719: bipush #112
    //   721: iload #35
    //   723: iconst_3
    //   724: ishl
    //   725: iand
    //   726: istore #39
    //   728: nop
    //   729: iconst_0
    //   730: istore #40
    //   732: aload #30
    //   734: ldc -1323940314
    //   736: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   738: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   741: aload #30
    //   743: iconst_0
    //   744: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   747: istore #41
    //   749: aload #30
    //   751: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   756: astore #42
    //   758: aload #30
    //   760: aload #33
    //   762: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   765: astore #43
    //   767: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   770: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   773: astore #44
    //   775: bipush #6
    //   777: sipush #896
    //   780: iload #39
    //   782: bipush #6
    //   784: ishl
    //   785: iand
    //   786: ior
    //   787: istore #45
    //   789: nop
    //   790: iconst_0
    //   791: istore #46
    //   793: aload #30
    //   795: ldc -692256719
    //   797: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   799: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   802: aload #30
    //   804: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   809: instanceof androidx/compose/runtime/Applier
    //   812: ifne -> 818
    //   815: invokestatic invalidApplier : ()V
    //   818: aload #30
    //   820: invokeinterface startReusableNode : ()V
    //   825: aload #30
    //   827: invokeinterface getInserting : ()Z
    //   832: ifeq -> 847
    //   835: aload #30
    //   837: aload #44
    //   839: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   844: goto -> 854
    //   847: aload #30
    //   849: invokeinterface useNode : ()V
    //   854: aload #30
    //   856: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   859: astore #47
    //   861: iconst_0
    //   862: istore #48
    //   864: aload #47
    //   866: aload #38
    //   868: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   871: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   874: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   877: aload #47
    //   879: aload #42
    //   881: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   884: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   887: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   890: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   893: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   896: astore #49
    //   898: iconst_0
    //   899: istore #50
    //   901: aload #47
    //   903: astore #51
    //   905: iconst_0
    //   906: istore #52
    //   908: aload #51
    //   910: invokeinterface getInserting : ()Z
    //   915: ifne -> 936
    //   918: aload #51
    //   920: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   925: iload #41
    //   927: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   930: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   933: ifne -> 962
    //   936: aload #51
    //   938: iload #41
    //   940: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   943: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   948: aload #47
    //   950: iload #41
    //   952: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   955: aload #49
    //   957: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   962: nop
    //   963: nop
    //   964: nop
    //   965: aload #47
    //   967: aload #43
    //   969: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   972: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   975: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   978: nop
    //   979: nop
    //   980: aload #30
    //   982: bipush #14
    //   984: iload #45
    //   986: bipush #6
    //   988: ishr
    //   989: iand
    //   990: istore #53
    //   992: astore #54
    //   994: iconst_0
    //   995: istore #55
    //   997: aload #54
    //   999: ldc -384784025
    //   1001: ldc 'C88@4444L9:Column.kt#2w3rfo'
    //   1003: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1006: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
    //   1009: aload #54
    //   1011: bipush #6
    //   1013: bipush #112
    //   1015: iload #35
    //   1017: bipush #6
    //   1019: ishr
    //   1020: iand
    //   1021: ior
    //   1022: istore #56
    //   1024: astore #57
    //   1026: checkcast androidx/compose/foundation/layout/ColumnScope
    //   1029: astore #58
    //   1031: iconst_0
    //   1032: istore #59
    //   1034: aload #57
    //   1036: ldc -121581349
    //   1038: invokeinterface startReplaceGroup : (I)V
    //   1043: aload_1
    //   1044: checkcast java/lang/Iterable
    //   1047: astore #60
    //   1049: iconst_0
    //   1050: istore #61
    //   1052: aload #60
    //   1054: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1059: astore #62
    //   1061: aload #62
    //   1063: invokeinterface hasNext : ()Z
    //   1068: ifeq -> 1108
    //   1071: aload #62
    //   1073: invokeinterface next : ()Ljava/lang/Object;
    //   1078: astore #63
    //   1080: aload #63
    //   1082: checkcast com/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem
    //   1085: astore #64
    //   1087: iconst_0
    //   1088: istore #65
    //   1090: aconst_null
    //   1091: aload #64
    //   1093: invokevirtual getText : ()Ljava/lang/String;
    //   1096: aload #57
    //   1098: iconst_0
    //   1099: iconst_1
    //   1100: invokestatic JuniePreconditionBanner : (Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V
    //   1103: nop
    //   1104: nop
    //   1105: goto -> 1061
    //   1108: nop
    //   1109: aload #57
    //   1111: invokeinterface endReplaceGroup : ()V
    //   1116: nop
    //   1117: aload #54
    //   1119: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1122: aload #30
    //   1124: invokeinterface endNode : ()V
    //   1129: aload #30
    //   1131: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1134: nop
    //   1135: aload #30
    //   1137: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1140: nop
    //   1141: aload #30
    //   1143: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1146: nop
    //   1147: nop
    //   1148: aload #27
    //   1150: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1153: aload_2
    //   1154: invokeinterface endNode : ()V
    //   1159: aload_2
    //   1160: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1163: nop
    //   1164: aload_2
    //   1165: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1168: nop
    //   1169: aload_2
    //   1170: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1173: nop
    //   1174: invokestatic isTraceInProgress : ()Z
    //   1177: ifeq -> 1192
    //   1180: invokestatic traceEventEnd : ()V
    //   1183: goto -> 1192
    //   1186: aload_2
    //   1187: invokeinterface skipToGroupEnd : ()V
    //   1192: aload_2
    //   1193: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   1198: dup
    //   1199: ifnull -> 1220
    //   1202: aload_0
    //   1203: aload_1
    //   1204: iload_3
    //   1205: iload #4
    //   1207: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Ljava/util/List;II)Lkotlin/jvm/functions/Function2;
    //   1212: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   1217: goto -> 1221
    //   1220: pop
    //   1221: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #16	-> 6
    //   #18	-> 157
    //   #19	-> 174
    //   #29	-> 181
    //   #19	-> 187
    //   #29	-> 196
    //   #19	-> 202
    //   #29	-> 211
    //   #19	-> 217
    //   #29	-> 226
    //   #19	-> 232
    //   #18	-> 234
    //   #19	-> 236
    //   #17	-> 252
    //   #30	-> 261
    //   #31	-> 264
    //   #32	-> 272
    //   #35	-> 280
    //   #36	-> 314
    //   #37	-> 323
    //   #38	-> 328
    //   #39	-> 334
    //   #40	-> 342
    //   #42	-> 349
    //   #41	-> 371
    //   #43	-> 380
    //   #44	-> 383
    //   #45	-> 399
    //   #46	-> 404
    //   #47	-> 414
    //   #49	-> 425
    //   #51	-> 430
    //   #52	-> 439
    //   #53	-> 452
    //   #55	-> 465
    //   #56	-> 476
    //   #57	-> 483
    //   #58	-> 511
    //   #59	-> 523
    //   #61	-> 537
    //   #56	-> 538
    //   #61	-> 539
    //   #62	-> 540
    //   #63	-> 553
    //   #51	-> 554
    //   #64	-> 555
    //   #65	-> 577
    //   #21	-> 613
    //   #22	-> 631
    //   #66	-> 645
    //   #22	-> 651
    //   #67	-> 674
    //   #68	-> 677
    //   #69	-> 685
    //   #72	-> 693
    //   #73	-> 728
    //   #74	-> 738
    //   #75	-> 744
    //   #76	-> 751
    //   #77	-> 760
    //   #79	-> 767
    //   #78	-> 789
    //   #80	-> 799
    //   #81	-> 802
    //   #82	-> 820
    //   #83	-> 825
    //   #84	-> 837
    //   #86	-> 849
    //   #88	-> 854
    //   #89	-> 864
    //   #90	-> 877
    //   #92	-> 890
    //   #93	-> 901
    //   #94	-> 908
    //   #95	-> 936
    //   #96	-> 948
    //   #98	-> 962
    //   #93	-> 963
    //   #98	-> 964
    //   #99	-> 965
    //   #100	-> 978
    //   #88	-> 979
    //   #101	-> 980
    //   #102	-> 1003
    //   #23	-> 1043
    //   #103	-> 1052
    //   #24	-> 1091
    //   #25	-> 1103
    //   #103	-> 1104
    //   #104	-> 1108
    //   #26	-> 1116
    //   #102	-> 1117
    //   #101	-> 1122
    //   #105	-> 1124
    //   #80	-> 1131
    //   #106	-> 1134
    //   #74	-> 1137
    //   #107	-> 1140
    //   #67	-> 1143
    //   #108	-> 1146
    //   #27	-> 1147
    //   #65	-> 1148
    //   #64	-> 1153
    //   #109	-> 1154
    //   #43	-> 1160
    //   #110	-> 1163
    //   #37	-> 1165
    //   #111	-> 1168
    //   #30	-> 1170
    //   #112	-> 1173
    //   #28	-> 1186
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   181	6	9	$i$f$getDp	I
    //   178	9	8	$this$dp$iv	I
    //   196	6	10	$i$f$getDp	I
    //   193	9	9	$this$dp$iv	I
    //   211	6	11	$i$f$getDp	I
    //   208	9	10	$this$dp$iv	I
    //   226	6	12	$i$f$getDp	I
    //   223	9	11	$this$dp$iv	I
    //   645	6	34	$i$f$getDp	I
    //   642	9	33	$this$dp$iv	I
    //   1090	14	65	$i$a$-forEach-LockScreenKt$LockScreen$1$1$1	I
    //   1087	17	64	problem	Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem;
    //   1080	25	63	element$iv	Ljava/lang/Object;
    //   1052	57	61	$i$f$forEach	I
    //   1049	60	60	$this$forEach$iv	Ljava/lang/Iterable;
    //   1034	83	59	$i$a$-Column-LockScreenKt$LockScreen$1$1	I
    //   1031	86	58	$this$LockScreen_u24lambda_u242_u24lambda_u241	Landroidx/compose/foundation/layout/ColumnScope;
    //   1031	86	57	$composer	Landroidx/compose/runtime/Composer;
    //   1031	86	56	$changed	I
    //   997	125	55	$i$a$-Layout-ColumnKt$Column$1$iv	I
    //   994	128	54	$composer$iv	Landroidx/compose/runtime/Composer;
    //   994	128	53	$changed$iv	I
    //   908	55	52	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   905	58	51	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   901	64	50	$i$f$set-impl	I
    //   898	67	49	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   864	115	48	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   861	118	47	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   793	342	46	$i$f$ReusableComposeNode	I
    //   790	345	44	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   790	345	45	$changed$iv$iv$iv	I
    //   732	409	40	$i$f$Layout	I
    //   749	392	41	compositeKeyHash$iv$iv	I
    //   758	383	42	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   767	374	43	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   729	412	39	$changed$iv$iv	I
    //   668	479	36	$i$f$Column	I
    //   719	428	38	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   665	482	33	modifier$iv	Landroidx/compose/ui/Modifier;
    //   685	462	34	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
    //   693	454	37	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
    //   665	482	35	$changed$iv	I
    //   608	540	32	$i$a$-Column-LockScreenKt$LockScreen$1	I
    //   605	543	31	$this$LockScreen_u24lambda_u242	Landroidx/compose/foundation/layout/ColumnScope;
    //   605	543	30	$composer	Landroidx/compose/runtime/Composer;
    //   605	543	29	$changed	I
    //   571	582	28	$i$a$-Layout-ColumnKt$Column$1$iv	I
    //   568	585	27	$composer$iv	Landroidx/compose/runtime/Composer;
    //   568	585	26	$changed$iv	I
    //   483	55	25	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   480	58	24	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   476	64	23	$i$f$set-impl	I
    //   473	67	22	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   439	115	21	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   436	118	20	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   375	789	19	$i$f$ReusableComposeNode	I
    //   372	792	17	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   372	792	18	$changed$iv$iv$iv	I
    //   318	851	13	$i$f$Layout	I
    //   333	836	14	compositeKeyHash$iv$iv	I
    //   341	828	15	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   349	820	16	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   315	854	12	$changed$iv$iv	I
    //   256	918	10	$i$f$Column	I
    //   305	869	11	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   253	921	6	modifier$iv	Landroidx/compose/ui/Modifier;
    //   272	902	7	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
    //   280	894	8	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
    //   253	921	9	$changed$iv	I
    //   18	1204	5	$dirty	I
    //   0	1222	0	modifier	Landroidx/compose/ui/Modifier;
    //   0	1222	1	problems	Ljava/util/List;
    //   0	1222	2	$composer	Landroidx/compose/runtime/Composer;
    //   0	1222	3	$changed	I
  }
  
  private static final Unit LockScreen$lambda$3(Modifier $modifier, List<JuniePreconditionChecker.JunieProblem> $problems, int $$changed, int $$default, Composer $composer, int $force) {
    LockScreen($modifier, $problems, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
    return Unit.INSTANCE;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\lockscreen\LockScreenKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */