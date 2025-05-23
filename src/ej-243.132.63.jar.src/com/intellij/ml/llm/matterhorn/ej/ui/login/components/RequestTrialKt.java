package com.intellij.ml.llm.matterhorn.ej.ui.login.components;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.intellij.ml.llm.matterhorn.ej.ui.login.states.MissingAIPLicense;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000 \n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\004\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\032a\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0010\0032\f\020\004\032\b\022\004\022\0020\0010\0032\f\020\005\032\b\022\004\022\0020\0010\0032\f\020\006\032\b\022\004\022\0020\0010\0032\006\020\007\032\0020\b2\n\b\002\020\t\032\004\030\0010\b2\006\020\n\032\0020\013H\001¢\006\002\020\f¨\006\r"}, d2 = {"RequestTrial", "", "onTrialRequest", "Lkotlin/Function0;", "onOpenTermsOfService", "onBuyLicense", "onRetry", "username", "", "error", "refreshState", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState;Landroidx/compose/runtime/Composer;II)V", "ej-ui"})
@SourceDebugExtension({"SMAP\nRequestTrial.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestTrial.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/components/RequestTrialKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,72:1\n1225#2,6:73\n149#3:79\n149#3:115\n149#3:198\n86#4:80\n84#4,5:81\n89#4:114\n86#4:153\n82#4,7:154\n89#4:189\n93#4:193\n93#4:241\n79#5,6:86\n86#5,4:101\n90#5,2:111\n79#5,6:124\n86#5,4:139\n90#5,2:149\n79#5,6:161\n86#5,4:176\n90#5,2:186\n94#5:192\n94#5:196\n79#5,6:205\n86#5,4:220\n90#5,2:230\n94#5:236\n94#5:240\n368#6,9:92\n377#6:113\n368#6,9:130\n377#6:151\n368#6,9:167\n377#6:188\n378#6,2:190\n378#6,2:194\n368#6,9:211\n377#6:232\n378#6,2:234\n378#6,2:238\n4034#7,6:105\n4034#7,6:143\n4034#7,6:180\n4034#7,6:224\n99#8:116\n95#8,7:117\n102#8:152\n106#8:197\n99#8:199\n97#8,5:200\n102#8:233\n106#8:237\n*S KotlinDebug\n*F\n+ 1 RequestTrial.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/components/RequestTrialKt\n*L\n34#1:73,6\n37#1:79\n41#1:115\n54#1:198\n35#1:80\n35#1:81,5\n35#1:114\n45#1:153\n45#1:154,7\n45#1:189\n45#1:193\n35#1:241\n35#1:86,6\n35#1:101,4\n35#1:111,2\n40#1:124,6\n40#1:139,4\n40#1:149,2\n45#1:161,6\n45#1:176,4\n45#1:186,2\n45#1:192\n40#1:196\n54#1:205,6\n54#1:220,4\n54#1:230,2\n54#1:236\n35#1:240\n35#1:92,9\n35#1:113\n40#1:130,9\n40#1:151\n45#1:167,9\n45#1:188\n45#1:190,2\n40#1:194,2\n54#1:211,9\n54#1:232\n54#1:234,2\n35#1:238,2\n35#1:105,6\n40#1:143,6\n45#1:180,6\n54#1:224,6\n40#1:116\n40#1:117,7\n40#1:152\n40#1:197\n54#1:199\n54#1:200,5\n54#1:233\n54#1:237\n*E\n"})
public final class RequestTrialKt {
  @Composable
  @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
  public static final void RequestTrial(@NotNull Function0 onTrialRequest, @NotNull Function0 onOpenTermsOfService, @NotNull Function0 onBuyLicense, @NotNull Function0 onRetry, @NotNull String username, @Nullable String error, @NotNull MissingAIPLicense.RefreshState refreshState, @Nullable Composer $composer, int $changed, int paramInt1) {
    // Byte code:
    //   0: aload_0
    //   1: ldc 'onTrialRequest'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ldc 'onOpenTermsOfService'
    //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_2
    //   13: ldc 'onBuyLicense'
    //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   18: aload_3
    //   19: ldc 'onRetry'
    //   21: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   24: aload #4
    //   26: ldc 'username'
    //   28: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   31: aload #6
    //   33: ldc 'refreshState'
    //   35: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   38: aload #7
    //   40: ldc 1455564890
    //   42: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
    //   47: astore #7
    //   49: iload #8
    //   51: istore #10
    //   53: iload #9
    //   55: iconst_1
    //   56: iand
    //   57: ifeq -> 70
    //   60: iload #10
    //   62: bipush #6
    //   64: ior
    //   65: istore #10
    //   67: goto -> 99
    //   70: iload #8
    //   72: bipush #6
    //   74: iand
    //   75: ifne -> 99
    //   78: iload #10
    //   80: aload #7
    //   82: aload_0
    //   83: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   88: ifeq -> 95
    //   91: iconst_4
    //   92: goto -> 96
    //   95: iconst_2
    //   96: ior
    //   97: istore #10
    //   99: iload #9
    //   101: iconst_2
    //   102: iand
    //   103: ifeq -> 116
    //   106: iload #10
    //   108: bipush #48
    //   110: ior
    //   111: istore #10
    //   113: goto -> 147
    //   116: iload #8
    //   118: bipush #48
    //   120: iand
    //   121: ifne -> 147
    //   124: iload #10
    //   126: aload #7
    //   128: aload_1
    //   129: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   134: ifeq -> 142
    //   137: bipush #32
    //   139: goto -> 144
    //   142: bipush #16
    //   144: ior
    //   145: istore #10
    //   147: iload #9
    //   149: iconst_4
    //   150: iand
    //   151: ifeq -> 165
    //   154: iload #10
    //   156: sipush #384
    //   159: ior
    //   160: istore #10
    //   162: goto -> 199
    //   165: iload #8
    //   167: sipush #384
    //   170: iand
    //   171: ifne -> 199
    //   174: iload #10
    //   176: aload #7
    //   178: aload_2
    //   179: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   184: ifeq -> 193
    //   187: sipush #256
    //   190: goto -> 196
    //   193: sipush #128
    //   196: ior
    //   197: istore #10
    //   199: iload #9
    //   201: bipush #8
    //   203: iand
    //   204: ifeq -> 218
    //   207: iload #10
    //   209: sipush #3072
    //   212: ior
    //   213: istore #10
    //   215: goto -> 252
    //   218: iload #8
    //   220: sipush #3072
    //   223: iand
    //   224: ifne -> 252
    //   227: iload #10
    //   229: aload #7
    //   231: aload_3
    //   232: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   237: ifeq -> 246
    //   240: sipush #2048
    //   243: goto -> 249
    //   246: sipush #1024
    //   249: ior
    //   250: istore #10
    //   252: iload #9
    //   254: bipush #16
    //   256: iand
    //   257: ifeq -> 271
    //   260: iload #10
    //   262: sipush #24576
    //   265: ior
    //   266: istore #10
    //   268: goto -> 306
    //   271: iload #8
    //   273: sipush #24576
    //   276: iand
    //   277: ifne -> 306
    //   280: iload #10
    //   282: aload #7
    //   284: aload #4
    //   286: invokeinterface changed : (Ljava/lang/Object;)Z
    //   291: ifeq -> 300
    //   294: sipush #16384
    //   297: goto -> 303
    //   300: sipush #8192
    //   303: ior
    //   304: istore #10
    //   306: iload #9
    //   308: bipush #32
    //   310: iand
    //   311: ifeq -> 324
    //   314: iload #10
    //   316: ldc 196608
    //   318: ior
    //   319: istore #10
    //   321: goto -> 356
    //   324: iload #8
    //   326: ldc 196608
    //   328: iand
    //   329: ifne -> 356
    //   332: iload #10
    //   334: aload #7
    //   336: aload #5
    //   338: invokeinterface changed : (Ljava/lang/Object;)Z
    //   343: ifeq -> 351
    //   346: ldc 131072
    //   348: goto -> 353
    //   351: ldc 65536
    //   353: ior
    //   354: istore #10
    //   356: iload #9
    //   358: bipush #64
    //   360: iand
    //   361: ifeq -> 374
    //   364: iload #10
    //   366: ldc 1572864
    //   368: ior
    //   369: istore #10
    //   371: goto -> 406
    //   374: iload #8
    //   376: ldc 1572864
    //   378: iand
    //   379: ifne -> 406
    //   382: iload #10
    //   384: aload #7
    //   386: aload #6
    //   388: invokeinterface changed : (Ljava/lang/Object;)Z
    //   393: ifeq -> 401
    //   396: ldc 1048576
    //   398: goto -> 403
    //   401: ldc 524288
    //   403: ior
    //   404: istore #10
    //   406: iload #10
    //   408: ldc 599187
    //   410: iand
    //   411: ldc 599186
    //   413: if_icmpne -> 426
    //   416: aload #7
    //   418: invokeinterface getSkipping : ()Z
    //   423: ifne -> 2696
    //   426: iload #9
    //   428: bipush #32
    //   430: iand
    //   431: ifeq -> 437
    //   434: aconst_null
    //   435: astore #5
    //   437: invokestatic isTraceInProgress : ()Z
    //   440: ifeq -> 453
    //   443: ldc 1455564890
    //   445: iload #10
    //   447: iconst_m1
    //   448: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.login.components.RequestTrial (RequestTrial.kt:32)'
    //   450: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   453: aload #7
    //   455: ldc 1040572484
    //   457: invokeinterface startReplaceGroup : (I)V
    //   462: aload #7
    //   464: astore #13
    //   466: iconst_0
    //   467: istore #14
    //   469: nop
    //   470: iconst_0
    //   471: istore #15
    //   473: aload #13
    //   475: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   480: astore #16
    //   482: iconst_0
    //   483: istore #17
    //   485: aload #16
    //   487: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
    //   490: invokevirtual getEmpty : ()Ljava/lang/Object;
    //   493: if_acmpne -> 517
    //   496: iconst_0
    //   497: istore #18
    //   499: ldc 'Start Free Trial'
    //   501: astore #18
    //   503: aload #13
    //   505: aload #18
    //   507: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   512: aload #18
    //   514: goto -> 519
    //   517: aload #16
    //   519: nop
    //   520: nop
    //   521: nop
    //   522: checkcast java/lang/String
    //   525: astore #12
    //   527: aload #7
    //   529: invokeinterface endReplaceGroup : ()V
    //   534: aload #12
    //   536: astore #11
    //   538: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   541: checkcast androidx/compose/ui/Modifier
    //   544: fconst_0
    //   545: invokestatic getActivationMinHeight : ()F
    //   548: iconst_1
    //   549: aconst_null
    //   550: invokestatic defaultMinSize-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   553: astore #12
    //   555: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
    //   558: bipush #16
    //   560: istore #13
    //   562: iconst_0
    //   563: istore #14
    //   565: iload #13
    //   567: i2f
    //   568: invokestatic constructor-impl : (F)F
    //   571: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    //   574: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
    //   577: astore #13
    //   579: bipush #54
    //   581: istore #15
    //   583: nop
    //   584: iconst_0
    //   585: istore #16
    //   587: aload #7
    //   589: ldc -483455358
    //   591: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
    //   593: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   596: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   599: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
    //   602: astore #14
    //   604: aload #13
    //   606: aload #14
    //   608: aload #7
    //   610: bipush #14
    //   612: iload #15
    //   614: iconst_3
    //   615: ishr
    //   616: iand
    //   617: bipush #112
    //   619: iload #15
    //   621: iconst_3
    //   622: ishr
    //   623: iand
    //   624: ior
    //   625: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    //   628: astore #17
    //   630: bipush #112
    //   632: iload #15
    //   634: iconst_3
    //   635: ishl
    //   636: iand
    //   637: istore #18
    //   639: nop
    //   640: iconst_0
    //   641: istore #19
    //   643: aload #7
    //   645: ldc -1323940314
    //   647: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   649: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   652: aload #7
    //   654: iconst_0
    //   655: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   658: istore #20
    //   660: aload #7
    //   662: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   667: astore #21
    //   669: aload #7
    //   671: aload #12
    //   673: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   676: astore #22
    //   678: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   681: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   684: astore #23
    //   686: bipush #6
    //   688: sipush #896
    //   691: iload #18
    //   693: bipush #6
    //   695: ishl
    //   696: iand
    //   697: ior
    //   698: istore #24
    //   700: nop
    //   701: iconst_0
    //   702: istore #25
    //   704: aload #7
    //   706: ldc -692256719
    //   708: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   710: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   713: aload #7
    //   715: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   720: instanceof androidx/compose/runtime/Applier
    //   723: ifne -> 729
    //   726: invokestatic invalidApplier : ()V
    //   729: aload #7
    //   731: invokeinterface startReusableNode : ()V
    //   736: aload #7
    //   738: invokeinterface getInserting : ()Z
    //   743: ifeq -> 758
    //   746: aload #7
    //   748: aload #23
    //   750: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   755: goto -> 765
    //   758: aload #7
    //   760: invokeinterface useNode : ()V
    //   765: aload #7
    //   767: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   770: astore #26
    //   772: iconst_0
    //   773: istore #27
    //   775: aload #26
    //   777: aload #17
    //   779: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   782: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   785: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   788: aload #26
    //   790: aload #21
    //   792: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   795: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   798: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   801: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   804: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   807: astore #28
    //   809: iconst_0
    //   810: istore #29
    //   812: aload #26
    //   814: astore #30
    //   816: iconst_0
    //   817: istore #31
    //   819: aload #30
    //   821: invokeinterface getInserting : ()Z
    //   826: ifne -> 847
    //   829: aload #30
    //   831: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   836: iload #20
    //   838: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   841: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   844: ifne -> 873
    //   847: aload #30
    //   849: iload #20
    //   851: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   854: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   859: aload #26
    //   861: iload #20
    //   863: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   866: aload #28
    //   868: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   873: nop
    //   874: nop
    //   875: nop
    //   876: aload #26
    //   878: aload #22
    //   880: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   883: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   886: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   889: nop
    //   890: nop
    //   891: aload #7
    //   893: bipush #14
    //   895: iload #24
    //   897: bipush #6
    //   899: ishr
    //   900: iand
    //   901: istore #32
    //   903: astore #33
    //   905: iconst_0
    //   906: istore #34
    //   908: aload #33
    //   910: ldc -384784025
    //   912: ldc 'C88@4444L9:Column.kt#2w3rfo'
    //   914: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   917: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
    //   920: aload #33
    //   922: bipush #6
    //   924: bipush #112
    //   926: iload #15
    //   928: bipush #6
    //   930: ishr
    //   931: iand
    //   932: ior
    //   933: istore #35
    //   935: astore #36
    //   937: checkcast androidx/compose/foundation/layout/ColumnScope
    //   940: astore #37
    //   942: iconst_0
    //   943: istore #38
    //   945: aload #4
    //   947: invokestatic getConfig : ()Lcom/intellij/ml/llm/matterhorn/configuration/Env;
    //   950: invokevirtual getTrialDays : ()I
    //   953: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   958: lconst_0
    //   959: aload #36
    //   961: iconst_0
    //   962: iconst_2
    //   963: invokestatic Title-iJQMabo : (Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)V
    //   966: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
    //   969: bipush #16
    //   971: istore #39
    //   973: iconst_0
    //   974: istore #40
    //   976: iload #39
    //   978: i2f
    //   979: invokestatic constructor-impl : (F)F
    //   982: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    //   985: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
    //   988: astore #39
    //   990: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   993: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
    //   996: astore #40
    //   998: sipush #432
    //   1001: istore #41
    //   1003: nop
    //   1004: iconst_0
    //   1005: istore #42
    //   1007: aload #36
    //   1009: ldc_w 693286680
    //   1012: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
    //   1015: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1018: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   1021: checkcast androidx/compose/ui/Modifier
    //   1024: astore #43
    //   1026: aload #39
    //   1028: aload #40
    //   1030: aload #36
    //   1032: bipush #14
    //   1034: iload #41
    //   1036: iconst_3
    //   1037: ishr
    //   1038: iand
    //   1039: bipush #112
    //   1041: iload #41
    //   1043: iconst_3
    //   1044: ishr
    //   1045: iand
    //   1046: ior
    //   1047: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    //   1050: astore #44
    //   1052: bipush #112
    //   1054: iload #41
    //   1056: iconst_3
    //   1057: ishl
    //   1058: iand
    //   1059: istore #45
    //   1061: nop
    //   1062: iconst_0
    //   1063: istore #46
    //   1065: aload #36
    //   1067: ldc -1323940314
    //   1069: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   1071: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1074: aload #36
    //   1076: iconst_0
    //   1077: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   1080: istore #47
    //   1082: aload #36
    //   1084: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   1089: astore #48
    //   1091: aload #36
    //   1093: aload #43
    //   1095: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   1098: astore #49
    //   1100: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1103: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   1106: astore #50
    //   1108: bipush #6
    //   1110: sipush #896
    //   1113: iload #45
    //   1115: bipush #6
    //   1117: ishl
    //   1118: iand
    //   1119: ior
    //   1120: istore #51
    //   1122: nop
    //   1123: iconst_0
    //   1124: istore #52
    //   1126: aload #36
    //   1128: ldc -692256719
    //   1130: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   1132: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1135: aload #36
    //   1137: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   1142: instanceof androidx/compose/runtime/Applier
    //   1145: ifne -> 1151
    //   1148: invokestatic invalidApplier : ()V
    //   1151: aload #36
    //   1153: invokeinterface startReusableNode : ()V
    //   1158: aload #36
    //   1160: invokeinterface getInserting : ()Z
    //   1165: ifeq -> 1180
    //   1168: aload #36
    //   1170: aload #50
    //   1172: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   1177: goto -> 1187
    //   1180: aload #36
    //   1182: invokeinterface useNode : ()V
    //   1187: aload #36
    //   1189: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   1192: astore #53
    //   1194: iconst_0
    //   1195: istore #54
    //   1197: aload #53
    //   1199: aload #44
    //   1201: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1204: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   1207: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1210: aload #53
    //   1212: aload #48
    //   1214: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1217: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   1220: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1223: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1226: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   1229: astore #55
    //   1231: iconst_0
    //   1232: istore #56
    //   1234: aload #53
    //   1236: astore #57
    //   1238: iconst_0
    //   1239: istore #58
    //   1241: aload #57
    //   1243: invokeinterface getInserting : ()Z
    //   1248: ifne -> 1269
    //   1251: aload #57
    //   1253: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   1258: iload #47
    //   1260: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1263: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1266: ifne -> 1295
    //   1269: aload #57
    //   1271: iload #47
    //   1273: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1276: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   1281: aload #53
    //   1283: iload #47
    //   1285: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1288: aload #55
    //   1290: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1295: nop
    //   1296: nop
    //   1297: nop
    //   1298: aload #53
    //   1300: aload #49
    //   1302: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1305: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   1308: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1311: nop
    //   1312: nop
    //   1313: aload #36
    //   1315: bipush #14
    //   1317: iload #51
    //   1319: bipush #6
    //   1321: ishr
    //   1322: iand
    //   1323: istore #59
    //   1325: astore #60
    //   1327: iconst_0
    //   1328: istore #61
    //   1330: aload #60
    //   1332: ldc_w -407840262
    //   1335: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
    //   1338: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1341: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
    //   1344: aload #60
    //   1346: bipush #6
    //   1348: bipush #112
    //   1350: iload #41
    //   1352: bipush #6
    //   1354: ishr
    //   1355: iand
    //   1356: ior
    //   1357: istore #62
    //   1359: astore #63
    //   1361: checkcast androidx/compose/foundation/layout/RowScope
    //   1364: astore #64
    //   1366: iconst_0
    //   1367: istore #65
    //   1369: aload #11
    //   1371: aconst_null
    //   1372: iconst_0
    //   1373: aload_0
    //   1374: aconst_null
    //   1375: aload #63
    //   1377: bipush #6
    //   1379: sipush #7168
    //   1382: iload #10
    //   1384: bipush #9
    //   1386: ishl
    //   1387: iand
    //   1388: ior
    //   1389: bipush #22
    //   1391: invokestatic Button : (Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    //   1394: iconst_0
    //   1395: istore #66
    //   1397: nop
    //   1398: iconst_0
    //   1399: istore #67
    //   1401: aload #63
    //   1403: ldc -483455358
    //   1405: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
    //   1407: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1410: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   1413: checkcast androidx/compose/ui/Modifier
    //   1416: astore #68
    //   1418: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
    //   1421: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
    //   1424: astore #69
    //   1426: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   1429: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
    //   1432: astore #70
    //   1434: aload #69
    //   1436: aload #70
    //   1438: aload #63
    //   1440: bipush #14
    //   1442: iload #66
    //   1444: iconst_3
    //   1445: ishr
    //   1446: iand
    //   1447: bipush #112
    //   1449: iload #66
    //   1451: iconst_3
    //   1452: ishr
    //   1453: iand
    //   1454: ior
    //   1455: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    //   1458: astore #71
    //   1460: bipush #112
    //   1462: iload #66
    //   1464: iconst_3
    //   1465: ishl
    //   1466: iand
    //   1467: istore #72
    //   1469: nop
    //   1470: iconst_0
    //   1471: istore #73
    //   1473: aload #63
    //   1475: ldc -1323940314
    //   1477: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   1479: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1482: aload #63
    //   1484: iconst_0
    //   1485: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   1488: istore #74
    //   1490: aload #63
    //   1492: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   1497: astore #75
    //   1499: aload #63
    //   1501: aload #68
    //   1503: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   1506: astore #76
    //   1508: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1511: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   1514: astore #77
    //   1516: bipush #6
    //   1518: sipush #896
    //   1521: iload #72
    //   1523: bipush #6
    //   1525: ishl
    //   1526: iand
    //   1527: ior
    //   1528: istore #78
    //   1530: nop
    //   1531: iconst_0
    //   1532: istore #79
    //   1534: aload #63
    //   1536: ldc -692256719
    //   1538: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   1540: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1543: aload #63
    //   1545: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   1550: instanceof androidx/compose/runtime/Applier
    //   1553: ifne -> 1559
    //   1556: invokestatic invalidApplier : ()V
    //   1559: aload #63
    //   1561: invokeinterface startReusableNode : ()V
    //   1566: aload #63
    //   1568: invokeinterface getInserting : ()Z
    //   1573: ifeq -> 1588
    //   1576: aload #63
    //   1578: aload #77
    //   1580: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   1585: goto -> 1595
    //   1588: aload #63
    //   1590: invokeinterface useNode : ()V
    //   1595: aload #63
    //   1597: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   1600: astore #80
    //   1602: iconst_0
    //   1603: istore #81
    //   1605: aload #80
    //   1607: aload #71
    //   1609: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1612: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   1615: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1618: aload #80
    //   1620: aload #75
    //   1622: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1625: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   1628: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1631: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1634: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   1637: astore #82
    //   1639: iconst_0
    //   1640: istore #83
    //   1642: aload #80
    //   1644: astore #84
    //   1646: iconst_0
    //   1647: istore #85
    //   1649: aload #84
    //   1651: invokeinterface getInserting : ()Z
    //   1656: ifne -> 1677
    //   1659: aload #84
    //   1661: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   1666: iload #74
    //   1668: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1671: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1674: ifne -> 1703
    //   1677: aload #84
    //   1679: iload #74
    //   1681: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1684: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   1689: aload #80
    //   1691: iload #74
    //   1693: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1696: aload #82
    //   1698: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1703: nop
    //   1704: nop
    //   1705: nop
    //   1706: aload #80
    //   1708: aload #76
    //   1710: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1713: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   1716: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1719: nop
    //   1720: nop
    //   1721: aload #63
    //   1723: bipush #14
    //   1725: iload #78
    //   1727: bipush #6
    //   1729: ishr
    //   1730: iand
    //   1731: istore #86
    //   1733: astore #87
    //   1735: iconst_0
    //   1736: istore #88
    //   1738: aload #87
    //   1740: ldc -384784025
    //   1742: ldc 'C88@4444L9:Column.kt#2w3rfo'
    //   1744: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1747: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
    //   1750: aload #87
    //   1752: bipush #6
    //   1754: bipush #112
    //   1756: iload #66
    //   1758: bipush #6
    //   1760: ishr
    //   1761: iand
    //   1762: ior
    //   1763: istore #89
    //   1765: astore #90
    //   1767: checkcast androidx/compose/foundation/layout/ColumnScope
    //   1770: astore #91
    //   1772: iconst_0
    //   1773: istore #92
    //   1775: aload #91
    //   1777: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   1780: checkcast androidx/compose/ui/Modifier
    //   1783: fconst_1
    //   1784: iconst_0
    //   1785: invokeinterface weight : (Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;
    //   1790: astore #93
    //   1792: aload #11
    //   1794: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   1799: astore #94
    //   1801: aload #90
    //   1803: iconst_0
    //   1804: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
    //   1807: aload #90
    //   1809: getstatic com/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData.$stable : I
    //   1812: invokevirtual getInactiveTextColor : (Landroidx/compose/runtime/Composer;I)J
    //   1815: lstore #95
    //   1817: aload #94
    //   1819: aload #93
    //   1821: lload #95
    //   1823: lconst_0
    //   1824: aconst_null
    //   1825: aconst_null
    //   1826: aconst_null
    //   1827: lconst_0
    //   1828: aconst_null
    //   1829: iconst_0
    //   1830: lconst_0
    //   1831: iconst_0
    //   1832: iconst_0
    //   1833: iconst_0
    //   1834: aconst_null
    //   1835: aconst_null
    //   1836: aload #90
    //   1838: iconst_0
    //   1839: iconst_0
    //   1840: ldc_w 65528
    //   1843: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
    //   1846: ldc_w 'JetBrains AI Terms of Service'
    //   1849: aload_1
    //   1850: aconst_null
    //   1851: iconst_0
    //   1852: aconst_null
    //   1853: iconst_0
    //   1854: aconst_null
    //   1855: aconst_null
    //   1856: aload #90
    //   1858: bipush #6
    //   1860: bipush #112
    //   1862: iload #10
    //   1864: iand
    //   1865: ior
    //   1866: sipush #252
    //   1869: invokestatic Link-kye4rC8 : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/runtime/Composer;II)V
    //   1872: nop
    //   1873: aload #87
    //   1875: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1878: aload #63
    //   1880: invokeinterface endNode : ()V
    //   1885: aload #63
    //   1887: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1890: nop
    //   1891: aload #63
    //   1893: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1896: nop
    //   1897: aload #63
    //   1899: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1902: nop
    //   1903: nop
    //   1904: aload #60
    //   1906: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1909: aload #36
    //   1911: invokeinterface endNode : ()V
    //   1916: aload #36
    //   1918: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1921: nop
    //   1922: aload #36
    //   1924: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1927: nop
    //   1928: aload #36
    //   1930: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1933: nop
    //   1934: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   1937: checkcast androidx/compose/ui/Modifier
    //   1940: fconst_0
    //   1941: iconst_4
    //   1942: istore #43
    //   1944: iconst_0
    //   1945: istore #39
    //   1947: iload #43
    //   1949: i2f
    //   1950: invokestatic constructor-impl : (F)F
    //   1953: fconst_0
    //   1954: fconst_0
    //   1955: bipush #13
    //   1957: aconst_null
    //   1958: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   1961: astore #43
    //   1963: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
    //   1966: bipush #16
    //   1968: istore #39
    //   1970: iconst_0
    //   1971: istore #40
    //   1973: iload #39
    //   1975: i2f
    //   1976: invokestatic constructor-impl : (F)F
    //   1979: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    //   1982: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
    //   1985: astore #39
    //   1987: bipush #54
    //   1989: istore #41
    //   1991: iconst_0
    //   1992: istore #42
    //   1994: aload #36
    //   1996: ldc_w 693286680
    //   1999: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
    //   2002: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   2005: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   2008: invokevirtual getTop : ()Landroidx/compose/ui/Alignment$Vertical;
    //   2011: astore #40
    //   2013: aload #39
    //   2015: aload #40
    //   2017: aload #36
    //   2019: bipush #14
    //   2021: iload #41
    //   2023: iconst_3
    //   2024: ishr
    //   2025: iand
    //   2026: bipush #112
    //   2028: iload #41
    //   2030: iconst_3
    //   2031: ishr
    //   2032: iand
    //   2033: ior
    //   2034: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    //   2037: astore #44
    //   2039: bipush #112
    //   2041: iload #41
    //   2043: iconst_3
    //   2044: ishl
    //   2045: iand
    //   2046: istore #45
    //   2048: nop
    //   2049: iconst_0
    //   2050: istore #46
    //   2052: aload #36
    //   2054: ldc -1323940314
    //   2056: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   2058: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   2061: aload #36
    //   2063: iconst_0
    //   2064: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   2067: istore #47
    //   2069: aload #36
    //   2071: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   2076: astore #48
    //   2078: aload #36
    //   2080: aload #43
    //   2082: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   2085: astore #49
    //   2087: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   2090: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   2093: astore #50
    //   2095: bipush #6
    //   2097: sipush #896
    //   2100: iload #45
    //   2102: bipush #6
    //   2104: ishl
    //   2105: iand
    //   2106: ior
    //   2107: istore #51
    //   2109: nop
    //   2110: iconst_0
    //   2111: istore #52
    //   2113: aload #36
    //   2115: ldc -692256719
    //   2117: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   2119: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   2122: aload #36
    //   2124: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   2129: instanceof androidx/compose/runtime/Applier
    //   2132: ifne -> 2138
    //   2135: invokestatic invalidApplier : ()V
    //   2138: aload #36
    //   2140: invokeinterface startReusableNode : ()V
    //   2145: aload #36
    //   2147: invokeinterface getInserting : ()Z
    //   2152: ifeq -> 2167
    //   2155: aload #36
    //   2157: aload #50
    //   2159: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   2164: goto -> 2174
    //   2167: aload #36
    //   2169: invokeinterface useNode : ()V
    //   2174: aload #36
    //   2176: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   2179: astore #53
    //   2181: iconst_0
    //   2182: istore #54
    //   2184: aload #53
    //   2186: aload #44
    //   2188: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   2191: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   2194: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   2197: aload #53
    //   2199: aload #48
    //   2201: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   2204: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   2207: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   2210: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   2213: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   2216: astore #55
    //   2218: iconst_0
    //   2219: istore #56
    //   2221: aload #53
    //   2223: astore #57
    //   2225: iconst_0
    //   2226: istore #58
    //   2228: aload #57
    //   2230: invokeinterface getInserting : ()Z
    //   2235: ifne -> 2256
    //   2238: aload #57
    //   2240: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   2245: iload #47
    //   2247: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2250: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2253: ifne -> 2282
    //   2256: aload #57
    //   2258: iload #47
    //   2260: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2263: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   2268: aload #53
    //   2270: iload #47
    //   2272: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2275: aload #55
    //   2277: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   2282: nop
    //   2283: nop
    //   2284: nop
    //   2285: aload #53
    //   2287: aload #49
    //   2289: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   2292: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   2295: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   2298: nop
    //   2299: nop
    //   2300: aload #36
    //   2302: bipush #14
    //   2304: iload #51
    //   2306: bipush #6
    //   2308: ishr
    //   2309: iand
    //   2310: istore #59
    //   2312: astore #60
    //   2314: iconst_0
    //   2315: istore #61
    //   2317: aload #60
    //   2319: ldc_w -407840262
    //   2322: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
    //   2325: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   2328: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
    //   2331: aload #60
    //   2333: bipush #6
    //   2335: bipush #112
    //   2337: iload #41
    //   2339: bipush #6
    //   2341: ishr
    //   2342: iand
    //   2343: ior
    //   2344: istore #62
    //   2346: astore #63
    //   2348: checkcast androidx/compose/foundation/layout/RowScope
    //   2351: astore #64
    //   2353: iconst_0
    //   2354: istore #65
    //   2356: ldc_w 'Buy License...'
    //   2359: aload_2
    //   2360: aconst_null
    //   2361: iconst_0
    //   2362: aconst_null
    //   2363: iconst_0
    //   2364: aconst_null
    //   2365: aconst_null
    //   2366: aload #63
    //   2368: bipush #6
    //   2370: bipush #112
    //   2372: iload #10
    //   2374: iconst_3
    //   2375: ishr
    //   2376: iand
    //   2377: ior
    //   2378: sipush #252
    //   2381: invokestatic Link-kye4rC8 : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/runtime/Composer;II)V
    //   2384: aload #6
    //   2386: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Progress.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Progress;
    //   2389: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2392: ifeq -> 2426
    //   2395: aload #63
    //   2397: ldc_w -1258142771
    //   2400: invokeinterface startReplaceGroup : (I)V
    //   2405: aconst_null
    //   2406: lconst_0
    //   2407: aconst_null
    //   2408: aload #63
    //   2410: iconst_0
    //   2411: bipush #7
    //   2413: invokestatic JunieCircularProgressIndicator-3IgeMak : (Landroidx/compose/ui/Modifier;JLjava/lang/String;Landroidx/compose/runtime/Composer;II)V
    //   2416: aload #63
    //   2418: invokeinterface endReplaceGroup : ()V
    //   2423: goto -> 2472
    //   2426: aload #63
    //   2428: ldc_w -1258087002
    //   2431: invokeinterface startReplaceGroup : (I)V
    //   2436: ldc_w 'Retry'
    //   2439: aload_3
    //   2440: aconst_null
    //   2441: iconst_0
    //   2442: aconst_null
    //   2443: iconst_0
    //   2444: aconst_null
    //   2445: aconst_null
    //   2446: aload #63
    //   2448: bipush #6
    //   2450: bipush #112
    //   2452: iload #10
    //   2454: bipush #6
    //   2456: ishr
    //   2457: iand
    //   2458: ior
    //   2459: sipush #252
    //   2462: invokestatic Link-kye4rC8 : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/runtime/Composer;II)V
    //   2465: aload #63
    //   2467: invokeinterface endReplaceGroup : ()V
    //   2472: nop
    //   2473: aload #60
    //   2475: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2478: aload #36
    //   2480: invokeinterface endNode : ()V
    //   2485: aload #36
    //   2487: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2490: nop
    //   2491: aload #36
    //   2493: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2496: nop
    //   2497: aload #36
    //   2499: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2502: nop
    //   2503: aload #36
    //   2505: ldc_w 367324023
    //   2508: invokeinterface startReplaceGroup : (I)V
    //   2513: aload #5
    //   2515: ifnonnull -> 2526
    //   2518: aload #6
    //   2520: instanceof com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Error
    //   2523: ifeq -> 2646
    //   2526: aload #5
    //   2528: ifnull -> 2573
    //   2531: aload #36
    //   2533: ldc_w -1497764142
    //   2536: invokeinterface startReplaceGroup : (I)V
    //   2541: aconst_null
    //   2542: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo
    //   2545: dup
    //   2546: aload #5
    //   2548: aconst_null
    //   2549: aconst_null
    //   2550: bipush #6
    //   2552: aconst_null
    //   2553: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   2556: aload #36
    //   2558: iconst_0
    //   2559: iconst_1
    //   2560: invokestatic ErrorComponent : (Landroidx/compose/ui/Modifier;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo;Landroidx/compose/runtime/Composer;II)V
    //   2563: aload #36
    //   2565: invokeinterface endReplaceGroup : ()V
    //   2570: goto -> 2646
    //   2573: aload #6
    //   2575: instanceof com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Error
    //   2578: ifeq -> 2629
    //   2581: aload #36
    //   2583: ldc_w -1497624797
    //   2586: invokeinterface startReplaceGroup : (I)V
    //   2591: aconst_null
    //   2592: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo
    //   2595: dup
    //   2596: aload #6
    //   2598: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Error
    //   2601: invokevirtual getMessage : ()Ljava/lang/String;
    //   2604: aconst_null
    //   2605: aconst_null
    //   2606: bipush #6
    //   2608: aconst_null
    //   2609: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   2612: aload #36
    //   2614: iconst_0
    //   2615: iconst_1
    //   2616: invokestatic ErrorComponent : (Landroidx/compose/ui/Modifier;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo;Landroidx/compose/runtime/Composer;II)V
    //   2619: aload #36
    //   2621: invokeinterface endReplaceGroup : ()V
    //   2626: goto -> 2646
    //   2629: aload #36
    //   2631: ldc_w -1497537346
    //   2634: invokeinterface startReplaceGroup : (I)V
    //   2639: aload #36
    //   2641: invokeinterface endReplaceGroup : ()V
    //   2646: aload #36
    //   2648: invokeinterface endReplaceGroup : ()V
    //   2653: nop
    //   2654: aload #33
    //   2656: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2659: aload #7
    //   2661: invokeinterface endNode : ()V
    //   2666: aload #7
    //   2668: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2671: nop
    //   2672: aload #7
    //   2674: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2677: nop
    //   2678: aload #7
    //   2680: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2683: nop
    //   2684: invokestatic isTraceInProgress : ()Z
    //   2687: ifeq -> 2703
    //   2690: invokestatic traceEventEnd : ()V
    //   2693: goto -> 2703
    //   2696: aload #7
    //   2698: invokeinterface skipToGroupEnd : ()V
    //   2703: aload #7
    //   2705: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   2710: dup
    //   2711: ifnull -> 2741
    //   2714: aload_0
    //   2715: aload_1
    //   2716: aload_2
    //   2717: aload_3
    //   2718: aload #4
    //   2720: aload #5
    //   2722: aload #6
    //   2724: iload #8
    //   2726: iload #9
    //   2728: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState;II)Lkotlin/jvm/functions/Function2;
    //   2733: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   2738: goto -> 2742
    //   2741: pop
    //   2742: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #33	-> 38
    //   #31	-> 434
    //   #33	-> 450
    //   #34	-> 469
    //   #73	-> 473
    //   #74	-> 485
    //   #75	-> 496
    //   #34	-> 499
    //   #75	-> 501
    //   #76	-> 503
    //   #77	-> 512
    //   #78	-> 517
    //   #74	-> 519
    //   #73	-> 520
    //   #73	-> 521
    //   #34	-> 522
    //   #36	-> 538
    //   #37	-> 555
    //   #79	-> 565
    //   #37	-> 571
    //   #35	-> 583
    //   #80	-> 593
    //   #81	-> 596
    //   #84	-> 604
    //   #85	-> 639
    //   #86	-> 649
    //   #87	-> 655
    //   #88	-> 662
    //   #89	-> 671
    //   #91	-> 678
    //   #90	-> 700
    //   #92	-> 710
    //   #93	-> 713
    //   #94	-> 731
    //   #95	-> 736
    //   #96	-> 748
    //   #98	-> 760
    //   #100	-> 765
    //   #101	-> 775
    //   #102	-> 788
    //   #104	-> 801
    //   #105	-> 812
    //   #106	-> 819
    //   #107	-> 847
    //   #108	-> 859
    //   #110	-> 873
    //   #105	-> 874
    //   #110	-> 875
    //   #111	-> 876
    //   #112	-> 889
    //   #100	-> 890
    //   #113	-> 891
    //   #114	-> 914
    //   #39	-> 945
    //   #41	-> 966
    //   #115	-> 976
    //   #41	-> 982
    //   #42	-> 990
    //   #40	-> 1003
    //   #116	-> 1015
    //   #117	-> 1018
    //   #122	-> 1026
    //   #123	-> 1061
    //   #124	-> 1071
    //   #125	-> 1077
    //   #126	-> 1084
    //   #127	-> 1093
    //   #129	-> 1100
    //   #128	-> 1122
    //   #130	-> 1132
    //   #131	-> 1135
    //   #132	-> 1153
    //   #133	-> 1158
    //   #134	-> 1170
    //   #136	-> 1182
    //   #138	-> 1187
    //   #139	-> 1197
    //   #140	-> 1210
    //   #142	-> 1223
    //   #143	-> 1234
    //   #144	-> 1241
    //   #145	-> 1269
    //   #146	-> 1281
    //   #148	-> 1295
    //   #143	-> 1296
    //   #148	-> 1297
    //   #149	-> 1298
    //   #150	-> 1311
    //   #138	-> 1312
    //   #151	-> 1313
    //   #152	-> 1338
    //   #44	-> 1369
    //   #45	-> 1397
    //   #153	-> 1407
    //   #154	-> 1410
    //   #155	-> 1418
    //   #156	-> 1426
    //   #159	-> 1434
    //   #160	-> 1469
    //   #161	-> 1479
    //   #162	-> 1485
    //   #163	-> 1492
    //   #164	-> 1501
    //   #166	-> 1508
    //   #165	-> 1530
    //   #167	-> 1540
    //   #168	-> 1543
    //   #169	-> 1561
    //   #170	-> 1566
    //   #171	-> 1578
    //   #173	-> 1590
    //   #175	-> 1595
    //   #176	-> 1605
    //   #177	-> 1618
    //   #179	-> 1631
    //   #180	-> 1642
    //   #181	-> 1649
    //   #182	-> 1677
    //   #183	-> 1689
    //   #185	-> 1703
    //   #180	-> 1704
    //   #185	-> 1705
    //   #186	-> 1706
    //   #187	-> 1719
    //   #175	-> 1720
    //   #188	-> 1721
    //   #189	-> 1744
    //   #47	-> 1775
    //   #48	-> 1792
    //   #49	-> 1804
    //   #48	-> 1817
    //   #47	-> 1819
    //   #49	-> 1821
    //   #46	-> 1843
    //   #51	-> 1846
    //   #52	-> 1872
    //   #189	-> 1873
    //   #188	-> 1878
    //   #190	-> 1880
    //   #167	-> 1887
    //   #191	-> 1890
    //   #161	-> 1893
    //   #192	-> 1896
    //   #153	-> 1899
    //   #193	-> 1902
    //   #53	-> 1903
    //   #152	-> 1904
    //   #151	-> 1909
    //   #194	-> 1911
    //   #130	-> 1918
    //   #195	-> 1921
    //   #124	-> 1924
    //   #196	-> 1927
    //   #116	-> 1930
    //   #197	-> 1933
    //   #54	-> 1934
    //   #198	-> 1947
    //   #54	-> 1953
    //   #198	-> 1973
    //   #54	-> 1979
    //   #199	-> 2002
    //   #200	-> 2005
    //   #203	-> 2013
    //   #204	-> 2048
    //   #205	-> 2058
    //   #206	-> 2064
    //   #207	-> 2071
    //   #208	-> 2080
    //   #210	-> 2087
    //   #209	-> 2109
    //   #211	-> 2119
    //   #212	-> 2122
    //   #213	-> 2140
    //   #214	-> 2145
    //   #215	-> 2157
    //   #217	-> 2169
    //   #219	-> 2174
    //   #220	-> 2184
    //   #221	-> 2197
    //   #223	-> 2210
    //   #224	-> 2221
    //   #225	-> 2228
    //   #226	-> 2256
    //   #227	-> 2268
    //   #229	-> 2282
    //   #224	-> 2283
    //   #229	-> 2284
    //   #230	-> 2285
    //   #231	-> 2298
    //   #219	-> 2299
    //   #232	-> 2300
    //   #233	-> 2325
    //   #55	-> 2356
    //   #56	-> 2384
    //   #57	-> 2413
    //   #56	-> 2416
    //   #58	-> 2426
    //   #59	-> 2436
    //   #58	-> 2465
    //   #61	-> 2472
    //   #233	-> 2473
    //   #232	-> 2478
    //   #234	-> 2480
    //   #211	-> 2487
    //   #235	-> 2490
    //   #205	-> 2493
    //   #236	-> 2496
    //   #199	-> 2499
    //   #237	-> 2502
    //   #62	-> 2513
    //   #63	-> 2526
    //   #64	-> 2542
    //   #63	-> 2563
    //   #65	-> 2573
    //   #66	-> 2592
    //   #65	-> 2619
    //   #67	-> 2629
    //   #70	-> 2653
    //   #114	-> 2654
    //   #113	-> 2659
    //   #238	-> 2661
    //   #92	-> 2668
    //   #239	-> 2671
    //   #86	-> 2674
    //   #240	-> 2677
    //   #80	-> 2680
    //   #241	-> 2683
    //   #71	-> 2696
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   499	2	18	$i$a$-cache-RequestTrialKt$RequestTrial$buttonText$1	I
    //   503	11	18	value$iv	Ljava/lang/Object;
    //   485	35	17	$i$a$-let-ComposerKt$cache$1$iv	I
    //   482	38	16	it$iv	Ljava/lang/Object;
    //   473	49	15	$i$f$cache	I
    //   470	52	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
    //   470	52	14	invalid$iv	Z
    //   565	6	14	$i$f$getDp	I
    //   562	9	13	$this$dp$iv	I
    //   976	6	40	$i$f$getDp	I
    //   973	9	39	$this$dp$iv	I
    //   1775	98	92	$i$a$-Column-RequestTrialKt$RequestTrial$1$1$1	I
    //   1772	101	91	$this$RequestTrial_u24lambda_u244_u24lambda_u242_u24lambda_u241	Landroidx/compose/foundation/layout/ColumnScope;
    //   1772	101	90	$composer	Landroidx/compose/runtime/Composer;
    //   1772	101	89	$changed	I
    //   1738	140	88	$i$a$-Layout-ColumnKt$Column$1$iv	I
    //   1735	143	87	$composer$iv	Landroidx/compose/runtime/Composer;
    //   1735	143	86	$changed$iv	I
    //   1649	55	85	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   1646	58	84	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   1642	64	83	$i$f$set-impl	I
    //   1639	67	82	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   1605	115	81	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   1602	118	80	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   1534	357	79	$i$f$ReusableComposeNode	I
    //   1531	360	77	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   1531	360	78	$changed$iv$iv$iv	I
    //   1473	424	73	$i$f$Layout	I
    //   1490	407	74	compositeKeyHash$iv$iv	I
    //   1499	398	75	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   1508	389	76	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   1470	427	72	$changed$iv$iv	I
    //   1401	502	67	$i$f$Column	I
    //   1460	443	71	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   1418	485	68	modifier$iv	Landroidx/compose/ui/Modifier;
    //   1426	477	69	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
    //   1434	469	70	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
    //   1398	505	66	$changed$iv	I
    //   1369	535	65	$i$a$-Row-RequestTrialKt$RequestTrial$1$1	I
    //   1366	538	64	$this$RequestTrial_u24lambda_u244_u24lambda_u242	Landroidx/compose/foundation/layout/RowScope;
    //   1366	538	63	$composer	Landroidx/compose/runtime/Composer;
    //   1366	538	62	$changed	I
    //   1330	579	61	$i$a$-Layout-RowKt$Row$1$iv	I
    //   1327	582	60	$composer$iv	Landroidx/compose/runtime/Composer;
    //   1327	582	59	$changed$iv	I
    //   1241	55	58	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   1238	58	57	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   1234	64	56	$i$f$set-impl	I
    //   1231	67	55	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   1197	115	54	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   1194	118	53	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   1126	796	52	$i$f$ReusableComposeNode	I
    //   1123	799	50	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   1123	799	51	$changed$iv$iv$iv	I
    //   1065	863	46	$i$f$Layout	I
    //   1082	846	47	compositeKeyHash$iv$iv	I
    //   1091	837	48	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   1100	828	49	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   1062	866	45	$changed$iv$iv	I
    //   1007	927	42	$i$f$Row	I
    //   1052	882	44	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   1026	908	43	modifier$iv	Landroidx/compose/ui/Modifier;
    //   1004	930	39	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    //   1004	930	40	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
    //   1004	930	41	$changed$iv	I
    //   1947	6	39	$i$f$getDp	I
    //   1944	9	43	$this$dp$iv	I
    //   1973	6	40	$i$f$getDp	I
    //   1970	9	39	$this$dp$iv	I
    //   2356	117	65	$i$a$-Row-RequestTrialKt$RequestTrial$1$2	I
    //   2353	120	64	$this$RequestTrial_u24lambda_u244_u24lambda_u243	Landroidx/compose/foundation/layout/RowScope;
    //   2353	120	63	$composer	Landroidx/compose/runtime/Composer;
    //   2353	120	62	$changed	I
    //   2317	161	61	$i$a$-Layout-RowKt$Row$1$iv	I
    //   2314	164	60	$composer$iv	Landroidx/compose/runtime/Composer;
    //   2314	164	59	$changed$iv	I
    //   2228	55	58	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   2225	58	57	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   2221	64	56	$i$f$set-impl	I
    //   2218	67	55	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   2184	115	54	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   2181	118	53	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   2113	378	52	$i$f$ReusableComposeNode	I
    //   2110	381	50	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   2110	381	51	$changed$iv$iv$iv	I
    //   2052	445	46	$i$f$Layout	I
    //   2069	428	47	compositeKeyHash$iv$iv	I
    //   2078	419	48	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   2087	410	49	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   2049	448	45	$changed$iv$iv	I
    //   1994	509	42	$i$f$Row	I
    //   2039	464	44	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   1991	512	43	modifier$iv	Landroidx/compose/ui/Modifier;
    //   1991	512	39	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    //   2013	490	40	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
    //   1991	512	41	$changed$iv	I
    //   945	1709	38	$i$a$-Column-RequestTrialKt$RequestTrial$1	I
    //   942	1712	37	$this$RequestTrial_u24lambda_u244	Landroidx/compose/foundation/layout/ColumnScope;
    //   942	1712	36	$composer	Landroidx/compose/runtime/Composer;
    //   942	1712	35	$changed	I
    //   908	1751	34	$i$a$-Layout-ColumnKt$Column$1$iv	I
    //   905	1754	33	$composer$iv	Landroidx/compose/runtime/Composer;
    //   905	1754	32	$changed$iv	I
    //   819	55	31	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   816	58	30	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   812	64	29	$i$f$set-impl	I
    //   809	67	28	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   775	115	27	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   772	118	26	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   704	1968	25	$i$f$ReusableComposeNode	I
    //   701	1971	23	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   701	1971	24	$changed$iv$iv$iv	I
    //   643	2035	19	$i$f$Layout	I
    //   660	2018	20	compositeKeyHash$iv$iv	I
    //   669	2009	21	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   678	2000	22	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   640	2038	18	$changed$iv$iv	I
    //   587	2097	16	$i$f$Column	I
    //   630	2054	17	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   584	2100	12	modifier$iv	Landroidx/compose/ui/Modifier;
    //   584	2100	13	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
    //   604	2080	14	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
    //   584	2100	15	$changed$iv	I
    //   538	2155	11	buttonText	Ljava/lang/String;
    //   53	2690	10	$dirty	I
    //   0	2743	0	onTrialRequest	Lkotlin/jvm/functions/Function0;
    //   0	2743	1	onOpenTermsOfService	Lkotlin/jvm/functions/Function0;
    //   0	2743	2	onBuyLicense	Lkotlin/jvm/functions/Function0;
    //   0	2743	3	onRetry	Lkotlin/jvm/functions/Function0;
    //   0	2743	4	username	Ljava/lang/String;
    //   0	2743	5	error	Ljava/lang/String;
    //   0	2743	6	refreshState	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState;
    //   0	2743	7	$composer	Landroidx/compose/runtime/Composer;
    //   0	2743	8	$changed	I
  }
  
  private static final Unit RequestTrial$lambda$5(Function0<Unit> $onTrialRequest, Function0<Unit> $onOpenTermsOfService, Function0<Unit> $onBuyLicense, Function0<Unit> $onRetry, String $username, String $error, MissingAIPLicense.RefreshState $refreshState, int $$changed, int $$default, Composer $composer, int $force) {
    RequestTrial($onTrialRequest, $onOpenTermsOfService, $onBuyLicense, $onRetry, $username, $error, $refreshState, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
    return Unit.INSTANCE;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\components\RequestTrialKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */