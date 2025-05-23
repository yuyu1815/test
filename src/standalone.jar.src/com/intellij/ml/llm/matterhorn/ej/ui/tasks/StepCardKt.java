package com.intellij.ml.llm.matterhorn.ej.ui.tasks;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\0004\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\032\001\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\034\020\004\032\030\022\004\022\0020\006\022\004\022\0020\0010\005¢\006\002\b\007¢\006\002\b\b2\034\020\t\032\030\022\004\022\0020\n\022\004\022\0020\0010\005¢\006\002\b\007¢\006\002\b\b2\b\b\002\020\013\032\0020\f2\036\b\002\020\r\032\030\022\004\022\0020\016\022\004\022\0020\0010\005¢\006\002\b\007¢\006\002\b\b2\036\b\002\020\017\032\030\022\004\022\0020\n\022\004\022\0020\0010\005¢\006\002\b\007¢\006\002\b\bH\007¢\006\002\020\020¨\006\021"}, d2 = {"StepCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "titleContent", "Landroidx/compose/foundation/layout/RowScope;", "titleContentHorizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "bodyContent", "Landroidx/compose/foundation/layout/ColumnScope;", "footerContent", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "standalone"})
@SourceDebugExtension({"SMAP\nStepCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepCard.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepCardKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,86:1\n149#2:87\n149#2:88\n149#2:164\n149#2:165\n149#2:237\n99#3:89\n96#3,6:90\n102#3:124\n99#3,3:201\n102#3:232\n106#3:236\n99#3,3:238\n102#3:269\n106#3:273\n106#3:281\n79#4,6:96\n86#4,4:111\n90#4,2:121\n79#4,6:131\n86#4,4:146\n90#4,2:156\n94#4:162\n79#4,6:172\n86#4,4:187\n90#4,2:197\n79#4,6:204\n86#4,4:219\n90#4,2:229\n94#4:235\n79#4,6:241\n86#4,4:256\n90#4,2:266\n94#4:272\n94#4:276\n94#4:280\n368#5,9:102\n377#5:123\n368#5,9:137\n377#5:158\n378#5,2:160\n368#5,9:178\n377#5:199\n368#5,9:210\n377#5:231\n378#5,2:233\n368#5,9:247\n377#5:268\n378#5,2:270\n378#5,2:274\n378#5,2:278\n4034#6,6:115\n4034#6,6:150\n4034#6,6:191\n4034#6,6:223\n4034#6,6:260\n71#7:125\n69#7,5:126\n74#7:159\n78#7:163\n86#8:166\n84#8,5:167\n89#8:200\n93#8:277\n*S KotlinDebug\n*F\n+ 1 StepCard.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepCardKt\n*L\n28#1:87\n37#1:88\n51#1:164\n59#1:165\n78#1:237\n32#1:89\n32#1:90,6\n32#1:124\n61#1:201,3\n61#1:232\n61#1:236\n73#1:238,3\n73#1:269\n73#1:273\n32#1:281\n32#1:96,6\n32#1:111,4\n32#1:121,2\n40#1:131,6\n40#1:146,4\n40#1:156,2\n40#1:162\n54#1:172,6\n54#1:187,4\n54#1:197,2\n61#1:204,6\n61#1:219,4\n61#1:229,2\n61#1:235\n73#1:241,6\n73#1:256,4\n73#1:266,2\n73#1:272\n54#1:276\n32#1:280\n32#1:102,9\n32#1:123\n40#1:137,9\n40#1:158\n40#1:160,2\n54#1:178,9\n54#1:199\n61#1:210,9\n61#1:231\n61#1:233,2\n73#1:247,9\n73#1:268\n73#1:270,2\n54#1:274,2\n32#1:278,2\n32#1:115,6\n40#1:150,6\n54#1:191,6\n61#1:223,6\n73#1:260,6\n40#1:125\n40#1:126,5\n40#1:159\n40#1:163\n54#1:166\n54#1:167,5\n54#1:200\n54#1:277\n*E\n"})
public final class StepCardKt {
  @Composable
  @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
  public static final void StepCard(@Nullable Modifier modifier, @NotNull Function3 icon, @NotNull Function3 titleContent, @Nullable Arrangement.HorizontalOrVertical titleContentHorizontalArrangement, @Nullable Function3 bodyContent, @Nullable Function3 footerContent, @Nullable Composer $composer, int $changed, int paramInt1) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'icon'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_2
    //   7: ldc 'titleContent'
    //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload #6
    //   14: ldc 557578473
    //   16: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
    //   21: astore #6
    //   23: iload #7
    //   25: istore #9
    //   27: iload #8
    //   29: iconst_1
    //   30: iand
    //   31: ifeq -> 44
    //   34: iload #9
    //   36: bipush #6
    //   38: ior
    //   39: istore #9
    //   41: goto -> 73
    //   44: iload #7
    //   46: bipush #6
    //   48: iand
    //   49: ifne -> 73
    //   52: iload #9
    //   54: aload #6
    //   56: aload_0
    //   57: invokeinterface changed : (Ljava/lang/Object;)Z
    //   62: ifeq -> 69
    //   65: iconst_4
    //   66: goto -> 70
    //   69: iconst_2
    //   70: ior
    //   71: istore #9
    //   73: iload #8
    //   75: iconst_2
    //   76: iand
    //   77: ifeq -> 90
    //   80: iload #9
    //   82: bipush #48
    //   84: ior
    //   85: istore #9
    //   87: goto -> 121
    //   90: iload #7
    //   92: bipush #48
    //   94: iand
    //   95: ifne -> 121
    //   98: iload #9
    //   100: aload #6
    //   102: aload_1
    //   103: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   108: ifeq -> 116
    //   111: bipush #32
    //   113: goto -> 118
    //   116: bipush #16
    //   118: ior
    //   119: istore #9
    //   121: iload #8
    //   123: iconst_4
    //   124: iand
    //   125: ifeq -> 139
    //   128: iload #9
    //   130: sipush #384
    //   133: ior
    //   134: istore #9
    //   136: goto -> 173
    //   139: iload #7
    //   141: sipush #384
    //   144: iand
    //   145: ifne -> 173
    //   148: iload #9
    //   150: aload #6
    //   152: aload_2
    //   153: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   158: ifeq -> 167
    //   161: sipush #256
    //   164: goto -> 170
    //   167: sipush #128
    //   170: ior
    //   171: istore #9
    //   173: iload #8
    //   175: bipush #8
    //   177: iand
    //   178: ifeq -> 192
    //   181: iload #9
    //   183: sipush #3072
    //   186: ior
    //   187: istore #9
    //   189: goto -> 226
    //   192: iload #7
    //   194: sipush #3072
    //   197: iand
    //   198: ifne -> 226
    //   201: iload #9
    //   203: aload #6
    //   205: aload_3
    //   206: invokeinterface changed : (Ljava/lang/Object;)Z
    //   211: ifeq -> 220
    //   214: sipush #2048
    //   217: goto -> 223
    //   220: sipush #1024
    //   223: ior
    //   224: istore #9
    //   226: iload #8
    //   228: bipush #16
    //   230: iand
    //   231: ifeq -> 245
    //   234: iload #9
    //   236: sipush #24576
    //   239: ior
    //   240: istore #9
    //   242: goto -> 280
    //   245: iload #7
    //   247: sipush #24576
    //   250: iand
    //   251: ifne -> 280
    //   254: iload #9
    //   256: aload #6
    //   258: aload #4
    //   260: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   265: ifeq -> 274
    //   268: sipush #16384
    //   271: goto -> 277
    //   274: sipush #8192
    //   277: ior
    //   278: istore #9
    //   280: iload #8
    //   282: bipush #32
    //   284: iand
    //   285: ifeq -> 298
    //   288: iload #9
    //   290: ldc 196608
    //   292: ior
    //   293: istore #9
    //   295: goto -> 330
    //   298: iload #7
    //   300: ldc 196608
    //   302: iand
    //   303: ifne -> 330
    //   306: iload #9
    //   308: aload #6
    //   310: aload #5
    //   312: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   317: ifeq -> 325
    //   320: ldc 131072
    //   322: goto -> 327
    //   325: ldc 65536
    //   327: ior
    //   328: istore #9
    //   330: iload #9
    //   332: ldc 74899
    //   334: iand
    //   335: ldc 74898
    //   337: if_icmpne -> 350
    //   340: aload #6
    //   342: invokeinterface getSkipping : ()Z
    //   347: ifne -> 2767
    //   350: iload #8
    //   352: iconst_1
    //   353: iand
    //   354: ifeq -> 364
    //   357: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   360: checkcast androidx/compose/ui/Modifier
    //   363: astore_0
    //   364: iload #8
    //   366: bipush #8
    //   368: iand
    //   369: ifeq -> 392
    //   372: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
    //   375: bipush #8
    //   377: istore #10
    //   379: iconst_0
    //   380: istore #11
    //   382: iload #10
    //   384: i2f
    //   385: invokestatic constructor-impl : (F)F
    //   388: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    //   391: astore_3
    //   392: iload #8
    //   394: bipush #16
    //   396: iand
    //   397: ifeq -> 408
    //   400: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/ComposableSingletons$StepCardKt.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/ComposableSingletons$StepCardKt;
    //   403: invokevirtual getLambda-1$standalone : ()Lkotlin/jvm/functions/Function3;
    //   406: astore #4
    //   408: iload #8
    //   410: bipush #32
    //   412: iand
    //   413: ifeq -> 424
    //   416: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/ComposableSingletons$StepCardKt.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/ComposableSingletons$StepCardKt;
    //   419: invokevirtual getLambda-2$standalone : ()Lkotlin/jvm/functions/Function3;
    //   422: astore #5
    //   424: invokestatic isTraceInProgress : ()Z
    //   427: ifeq -> 440
    //   430: ldc 557578473
    //   432: iload #9
    //   434: iconst_m1
    //   435: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.StepCard (StepCard.kt:30)'
    //   437: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   440: aload_0
    //   441: aload #6
    //   443: iconst_0
    //   444: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
    //   447: invokevirtual getBackgroundColor-0d7_KjU : ()J
    //   450: aconst_null
    //   451: iconst_2
    //   452: aconst_null
    //   453: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   456: bipush #8
    //   458: istore #10
    //   460: iconst_0
    //   461: istore #11
    //   463: iload #10
    //   465: i2f
    //   466: invokestatic constructor-impl : (F)F
    //   469: invokestatic padding-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
    //   472: astore #10
    //   474: iconst_0
    //   475: istore #13
    //   477: nop
    //   478: iconst_0
    //   479: istore #14
    //   481: aload #6
    //   483: ldc 693286680
    //   485: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
    //   487: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   490: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
    //   493: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    //   496: astore #11
    //   498: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   501: invokevirtual getTop : ()Landroidx/compose/ui/Alignment$Vertical;
    //   504: astore #12
    //   506: aload #11
    //   508: aload #12
    //   510: aload #6
    //   512: bipush #14
    //   514: iload #13
    //   516: iconst_3
    //   517: ishr
    //   518: iand
    //   519: bipush #112
    //   521: iload #13
    //   523: iconst_3
    //   524: ishr
    //   525: iand
    //   526: ior
    //   527: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    //   530: astore #15
    //   532: bipush #112
    //   534: iload #13
    //   536: iconst_3
    //   537: ishl
    //   538: iand
    //   539: istore #16
    //   541: nop
    //   542: iconst_0
    //   543: istore #17
    //   545: aload #6
    //   547: ldc -1323940314
    //   549: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   551: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   554: aload #6
    //   556: iconst_0
    //   557: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   560: istore #18
    //   562: aload #6
    //   564: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   569: astore #19
    //   571: aload #6
    //   573: aload #10
    //   575: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   578: astore #20
    //   580: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   583: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   586: astore #21
    //   588: bipush #6
    //   590: sipush #896
    //   593: iload #16
    //   595: bipush #6
    //   597: ishl
    //   598: iand
    //   599: ior
    //   600: istore #22
    //   602: nop
    //   603: iconst_0
    //   604: istore #23
    //   606: aload #6
    //   608: ldc -692256719
    //   610: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   612: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   615: aload #6
    //   617: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   622: instanceof androidx/compose/runtime/Applier
    //   625: ifne -> 631
    //   628: invokestatic invalidApplier : ()V
    //   631: aload #6
    //   633: invokeinterface startReusableNode : ()V
    //   638: aload #6
    //   640: invokeinterface getInserting : ()Z
    //   645: ifeq -> 660
    //   648: aload #6
    //   650: aload #21
    //   652: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   657: goto -> 667
    //   660: aload #6
    //   662: invokeinterface useNode : ()V
    //   667: aload #6
    //   669: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   672: astore #24
    //   674: iconst_0
    //   675: istore #25
    //   677: aload #24
    //   679: aload #15
    //   681: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   684: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   687: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   690: aload #24
    //   692: aload #19
    //   694: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   697: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   700: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   703: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   706: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   709: astore #26
    //   711: iconst_0
    //   712: istore #27
    //   714: aload #24
    //   716: astore #28
    //   718: iconst_0
    //   719: istore #29
    //   721: aload #28
    //   723: invokeinterface getInserting : ()Z
    //   728: ifne -> 749
    //   731: aload #28
    //   733: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   738: iload #18
    //   740: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   743: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   746: ifne -> 775
    //   749: aload #28
    //   751: iload #18
    //   753: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   756: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   761: aload #24
    //   763: iload #18
    //   765: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   768: aload #26
    //   770: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   775: nop
    //   776: nop
    //   777: nop
    //   778: aload #24
    //   780: aload #20
    //   782: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   785: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   788: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   791: nop
    //   792: nop
    //   793: aload #6
    //   795: bipush #14
    //   797: iload #22
    //   799: bipush #6
    //   801: ishr
    //   802: iand
    //   803: istore #30
    //   805: astore #31
    //   807: iconst_0
    //   808: istore #32
    //   810: aload #31
    //   812: ldc -407840262
    //   814: ldc 'C101@5126L9:Row.kt#2w3rfo'
    //   816: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   819: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
    //   822: aload #31
    //   824: bipush #6
    //   826: bipush #112
    //   828: iload #13
    //   830: bipush #6
    //   832: ishr
    //   833: iand
    //   834: ior
    //   835: istore #33
    //   837: astore #34
    //   839: checkcast androidx/compose/foundation/layout/RowScope
    //   842: astore #35
    //   844: iconst_0
    //   845: istore #36
    //   847: aload #35
    //   849: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   852: checkcast androidx/compose/ui/Modifier
    //   855: aload #34
    //   857: iconst_0
    //   858: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
    //   861: invokevirtual getTitleMinHeight-D9Ej5fM : ()F
    //   864: invokestatic size-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
    //   867: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   870: invokevirtual getTop : ()Landroidx/compose/ui/Alignment$Vertical;
    //   873: invokeinterface align : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/ui/Modifier;
    //   878: astore #37
    //   880: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   883: invokevirtual getCenter : ()Landroidx/compose/ui/Alignment;
    //   886: astore #38
    //   888: bipush #48
    //   890: istore #39
    //   892: nop
    //   893: iconst_0
    //   894: istore #40
    //   896: aload #34
    //   898: ldc_w 733328855
    //   901: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
    //   904: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   907: iconst_0
    //   908: istore #41
    //   910: aload #38
    //   912: iload #41
    //   914: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
    //   917: astore #42
    //   919: bipush #112
    //   921: iload #39
    //   923: iconst_3
    //   924: ishl
    //   925: iand
    //   926: istore #43
    //   928: nop
    //   929: iconst_0
    //   930: istore #44
    //   932: aload #34
    //   934: ldc -1323940314
    //   936: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   938: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   941: aload #34
    //   943: iconst_0
    //   944: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   947: istore #45
    //   949: aload #34
    //   951: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   956: astore #46
    //   958: aload #34
    //   960: aload #37
    //   962: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   965: astore #47
    //   967: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   970: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   973: astore #48
    //   975: bipush #6
    //   977: sipush #896
    //   980: iload #43
    //   982: bipush #6
    //   984: ishl
    //   985: iand
    //   986: ior
    //   987: istore #49
    //   989: nop
    //   990: iconst_0
    //   991: istore #50
    //   993: aload #34
    //   995: ldc -692256719
    //   997: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   999: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1002: aload #34
    //   1004: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   1009: instanceof androidx/compose/runtime/Applier
    //   1012: ifne -> 1018
    //   1015: invokestatic invalidApplier : ()V
    //   1018: aload #34
    //   1020: invokeinterface startReusableNode : ()V
    //   1025: aload #34
    //   1027: invokeinterface getInserting : ()Z
    //   1032: ifeq -> 1047
    //   1035: aload #34
    //   1037: aload #48
    //   1039: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   1044: goto -> 1054
    //   1047: aload #34
    //   1049: invokeinterface useNode : ()V
    //   1054: aload #34
    //   1056: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   1059: astore #51
    //   1061: iconst_0
    //   1062: istore #52
    //   1064: aload #51
    //   1066: aload #42
    //   1068: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1071: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   1074: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1077: aload #51
    //   1079: aload #46
    //   1081: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1084: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   1087: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1090: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1093: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   1096: astore #53
    //   1098: iconst_0
    //   1099: istore #54
    //   1101: aload #51
    //   1103: astore #55
    //   1105: iconst_0
    //   1106: istore #56
    //   1108: aload #55
    //   1110: invokeinterface getInserting : ()Z
    //   1115: ifne -> 1136
    //   1118: aload #55
    //   1120: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   1125: iload #45
    //   1127: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1130: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1133: ifne -> 1162
    //   1136: aload #55
    //   1138: iload #45
    //   1140: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1143: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   1148: aload #51
    //   1150: iload #45
    //   1152: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1155: aload #53
    //   1157: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1162: nop
    //   1163: nop
    //   1164: nop
    //   1165: aload #51
    //   1167: aload #47
    //   1169: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1172: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   1175: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1178: nop
    //   1179: nop
    //   1180: aload #34
    //   1182: bipush #14
    //   1184: iload #49
    //   1186: bipush #6
    //   1188: ishr
    //   1189: iand
    //   1190: istore #57
    //   1192: astore #58
    //   1194: iconst_0
    //   1195: istore #59
    //   1197: aload #58
    //   1199: ldc_w -2146769399
    //   1202: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
    //   1205: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1208: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
    //   1211: aload #58
    //   1213: bipush #6
    //   1215: bipush #112
    //   1217: iload #39
    //   1219: bipush #6
    //   1221: ishr
    //   1222: iand
    //   1223: ior
    //   1224: istore #60
    //   1226: astore #61
    //   1228: checkcast androidx/compose/foundation/layout/BoxScope
    //   1231: astore #62
    //   1233: iconst_0
    //   1234: istore #63
    //   1236: aload_1
    //   1237: aload #62
    //   1239: aload #61
    //   1241: bipush #14
    //   1243: iload #60
    //   1245: iand
    //   1246: bipush #112
    //   1248: iload #9
    //   1250: iand
    //   1251: ior
    //   1252: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1255: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1260: pop
    //   1261: nop
    //   1262: aload #58
    //   1264: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1267: aload #34
    //   1269: invokeinterface endNode : ()V
    //   1274: aload #34
    //   1276: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1279: nop
    //   1280: aload #34
    //   1282: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1285: nop
    //   1286: aload #34
    //   1288: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1291: nop
    //   1292: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   1295: checkcast androidx/compose/ui/Modifier
    //   1298: iconst_4
    //   1299: istore #37
    //   1301: iconst_0
    //   1302: istore #38
    //   1304: iload #37
    //   1306: i2f
    //   1307: invokestatic constructor-impl : (F)F
    //   1310: invokestatic width-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
    //   1313: aload #34
    //   1315: bipush #6
    //   1317: invokestatic Spacer : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    //   1320: aload #35
    //   1322: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   1325: checkcast androidx/compose/ui/Modifier
    //   1328: fconst_1
    //   1329: iconst_0
    //   1330: iconst_2
    //   1331: aconst_null
    //   1332: invokestatic weight$default : (Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   1335: astore #37
    //   1337: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
    //   1340: iconst_4
    //   1341: istore #38
    //   1343: iconst_0
    //   1344: istore #41
    //   1346: iload #38
    //   1348: i2f
    //   1349: invokestatic constructor-impl : (F)F
    //   1352: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    //   1355: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
    //   1358: astore #38
    //   1360: bipush #48
    //   1362: istore #39
    //   1364: nop
    //   1365: iconst_0
    //   1366: istore #40
    //   1368: aload #34
    //   1370: ldc_w -483455358
    //   1373: ldc_w 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
    //   1376: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1379: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   1382: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
    //   1385: astore #41
    //   1387: aload #38
    //   1389: aload #41
    //   1391: aload #34
    //   1393: bipush #14
    //   1395: iload #39
    //   1397: iconst_3
    //   1398: ishr
    //   1399: iand
    //   1400: bipush #112
    //   1402: iload #39
    //   1404: iconst_3
    //   1405: ishr
    //   1406: iand
    //   1407: ior
    //   1408: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    //   1411: astore #42
    //   1413: bipush #112
    //   1415: iload #39
    //   1417: iconst_3
    //   1418: ishl
    //   1419: iand
    //   1420: istore #43
    //   1422: nop
    //   1423: iconst_0
    //   1424: istore #44
    //   1426: aload #34
    //   1428: ldc -1323940314
    //   1430: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   1432: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1435: aload #34
    //   1437: iconst_0
    //   1438: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   1441: istore #45
    //   1443: aload #34
    //   1445: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   1450: astore #46
    //   1452: aload #34
    //   1454: aload #37
    //   1456: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   1459: astore #47
    //   1461: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1464: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   1467: astore #48
    //   1469: bipush #6
    //   1471: sipush #896
    //   1474: iload #43
    //   1476: bipush #6
    //   1478: ishl
    //   1479: iand
    //   1480: ior
    //   1481: istore #49
    //   1483: nop
    //   1484: iconst_0
    //   1485: istore #50
    //   1487: aload #34
    //   1489: ldc -692256719
    //   1491: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   1493: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1496: aload #34
    //   1498: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   1503: instanceof androidx/compose/runtime/Applier
    //   1506: ifne -> 1512
    //   1509: invokestatic invalidApplier : ()V
    //   1512: aload #34
    //   1514: invokeinterface startReusableNode : ()V
    //   1519: aload #34
    //   1521: invokeinterface getInserting : ()Z
    //   1526: ifeq -> 1541
    //   1529: aload #34
    //   1531: aload #48
    //   1533: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   1538: goto -> 1548
    //   1541: aload #34
    //   1543: invokeinterface useNode : ()V
    //   1548: aload #34
    //   1550: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   1553: astore #51
    //   1555: iconst_0
    //   1556: istore #52
    //   1558: aload #51
    //   1560: aload #42
    //   1562: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1565: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   1568: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1571: aload #51
    //   1573: aload #46
    //   1575: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1578: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   1581: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1584: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1587: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   1590: astore #53
    //   1592: iconst_0
    //   1593: istore #54
    //   1595: aload #51
    //   1597: astore #55
    //   1599: iconst_0
    //   1600: istore #56
    //   1602: aload #55
    //   1604: invokeinterface getInserting : ()Z
    //   1609: ifne -> 1630
    //   1612: aload #55
    //   1614: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   1619: iload #45
    //   1621: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1624: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1627: ifne -> 1656
    //   1630: aload #55
    //   1632: iload #45
    //   1634: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1637: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   1642: aload #51
    //   1644: iload #45
    //   1646: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1649: aload #53
    //   1651: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1656: nop
    //   1657: nop
    //   1658: nop
    //   1659: aload #51
    //   1661: aload #47
    //   1663: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1666: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   1669: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1672: nop
    //   1673: nop
    //   1674: aload #34
    //   1676: bipush #14
    //   1678: iload #49
    //   1680: bipush #6
    //   1682: ishr
    //   1683: iand
    //   1684: istore #57
    //   1686: astore #58
    //   1688: iconst_0
    //   1689: istore #59
    //   1691: aload #58
    //   1693: ldc_w -384784025
    //   1696: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
    //   1699: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1702: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
    //   1705: aload #58
    //   1707: bipush #6
    //   1709: bipush #112
    //   1711: iload #39
    //   1713: bipush #6
    //   1715: ishr
    //   1716: iand
    //   1717: ior
    //   1718: istore #60
    //   1720: astore #61
    //   1722: checkcast androidx/compose/foundation/layout/ColumnScope
    //   1725: astore #62
    //   1727: iconst_0
    //   1728: istore #63
    //   1730: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   1733: checkcast androidx/compose/ui/Modifier
    //   1736: fconst_0
    //   1737: iconst_1
    //   1738: aconst_null
    //   1739: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   1742: aload #61
    //   1744: iconst_0
    //   1745: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
    //   1748: invokevirtual getTitleMinHeight-D9Ej5fM : ()F
    //   1751: fconst_0
    //   1752: iconst_2
    //   1753: aconst_null
    //   1754: invokestatic heightIn-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   1757: astore #64
    //   1759: aload_3
    //   1760: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
    //   1763: astore #65
    //   1765: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   1768: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
    //   1771: astore #66
    //   1773: sipush #384
    //   1776: bipush #112
    //   1778: iload #9
    //   1780: bipush #6
    //   1782: ishr
    //   1783: iand
    //   1784: ior
    //   1785: istore #67
    //   1787: nop
    //   1788: iconst_0
    //   1789: istore #68
    //   1791: aload #61
    //   1793: ldc 693286680
    //   1795: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
    //   1797: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1800: aload #65
    //   1802: aload #66
    //   1804: aload #61
    //   1806: bipush #14
    //   1808: iload #67
    //   1810: iconst_3
    //   1811: ishr
    //   1812: iand
    //   1813: bipush #112
    //   1815: iload #67
    //   1817: iconst_3
    //   1818: ishr
    //   1819: iand
    //   1820: ior
    //   1821: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    //   1824: astore #69
    //   1826: bipush #112
    //   1828: iload #67
    //   1830: iconst_3
    //   1831: ishl
    //   1832: iand
    //   1833: istore #70
    //   1835: nop
    //   1836: iconst_0
    //   1837: istore #71
    //   1839: aload #61
    //   1841: ldc -1323940314
    //   1843: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   1845: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1848: aload #61
    //   1850: iconst_0
    //   1851: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   1854: istore #72
    //   1856: aload #61
    //   1858: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   1863: astore #73
    //   1865: aload #61
    //   1867: aload #64
    //   1869: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   1872: astore #74
    //   1874: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1877: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   1880: astore #75
    //   1882: bipush #6
    //   1884: sipush #896
    //   1887: iload #70
    //   1889: bipush #6
    //   1891: ishl
    //   1892: iand
    //   1893: ior
    //   1894: istore #76
    //   1896: nop
    //   1897: iconst_0
    //   1898: istore #77
    //   1900: aload #61
    //   1902: ldc -692256719
    //   1904: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   1906: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1909: aload #61
    //   1911: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   1916: instanceof androidx/compose/runtime/Applier
    //   1919: ifne -> 1925
    //   1922: invokestatic invalidApplier : ()V
    //   1925: aload #61
    //   1927: invokeinterface startReusableNode : ()V
    //   1932: aload #61
    //   1934: invokeinterface getInserting : ()Z
    //   1939: ifeq -> 1954
    //   1942: aload #61
    //   1944: aload #75
    //   1946: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   1951: goto -> 1961
    //   1954: aload #61
    //   1956: invokeinterface useNode : ()V
    //   1961: aload #61
    //   1963: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   1966: astore #78
    //   1968: iconst_0
    //   1969: istore #79
    //   1971: aload #78
    //   1973: aload #69
    //   1975: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1978: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   1981: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1984: aload #78
    //   1986: aload #73
    //   1988: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1991: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   1994: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1997: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   2000: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   2003: astore #80
    //   2005: iconst_0
    //   2006: istore #81
    //   2008: aload #78
    //   2010: astore #82
    //   2012: iconst_0
    //   2013: istore #83
    //   2015: aload #82
    //   2017: invokeinterface getInserting : ()Z
    //   2022: ifne -> 2043
    //   2025: aload #82
    //   2027: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   2032: iload #72
    //   2034: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2037: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2040: ifne -> 2069
    //   2043: aload #82
    //   2045: iload #72
    //   2047: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2050: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   2055: aload #78
    //   2057: iload #72
    //   2059: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2062: aload #80
    //   2064: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   2069: nop
    //   2070: nop
    //   2071: nop
    //   2072: aload #78
    //   2074: aload #74
    //   2076: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   2079: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   2082: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   2085: nop
    //   2086: nop
    //   2087: aload #61
    //   2089: bipush #14
    //   2091: iload #76
    //   2093: bipush #6
    //   2095: ishr
    //   2096: iand
    //   2097: istore #84
    //   2099: astore #85
    //   2101: iconst_0
    //   2102: istore #86
    //   2104: aload #85
    //   2106: ldc -407840262
    //   2108: ldc 'C101@5126L9:Row.kt#2w3rfo'
    //   2110: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   2113: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
    //   2116: aload #85
    //   2118: bipush #6
    //   2120: bipush #112
    //   2122: iload #67
    //   2124: bipush #6
    //   2126: ishr
    //   2127: iand
    //   2128: ior
    //   2129: istore #87
    //   2131: astore #88
    //   2133: checkcast androidx/compose/foundation/layout/RowScope
    //   2136: astore #89
    //   2138: iconst_0
    //   2139: istore #90
    //   2141: aload_2
    //   2142: aload #89
    //   2144: aload #88
    //   2146: bipush #14
    //   2148: iload #87
    //   2150: iand
    //   2151: bipush #112
    //   2153: iload #9
    //   2155: iconst_3
    //   2156: ishr
    //   2157: iand
    //   2158: ior
    //   2159: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2162: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2167: pop
    //   2168: nop
    //   2169: aload #85
    //   2171: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2174: aload #61
    //   2176: invokeinterface endNode : ()V
    //   2181: aload #61
    //   2183: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2186: nop
    //   2187: aload #61
    //   2189: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2192: nop
    //   2193: aload #61
    //   2195: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2198: nop
    //   2199: aload #4
    //   2201: aload #62
    //   2203: aload #61
    //   2205: bipush #14
    //   2207: iload #60
    //   2209: iand
    //   2210: bipush #112
    //   2212: iload #9
    //   2214: bipush #9
    //   2216: ishr
    //   2217: iand
    //   2218: ior
    //   2219: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2222: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2227: pop
    //   2228: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   2231: checkcast androidx/compose/ui/Modifier
    //   2234: fconst_0
    //   2235: iconst_1
    //   2236: aconst_null
    //   2237: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   2240: astore #64
    //   2242: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
    //   2245: bipush #8
    //   2247: istore #65
    //   2249: iconst_0
    //   2250: istore #66
    //   2252: iload #65
    //   2254: i2f
    //   2255: invokestatic constructor-impl : (F)F
    //   2258: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    //   2261: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
    //   2264: astore #65
    //   2266: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   2269: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
    //   2272: astore #66
    //   2274: sipush #438
    //   2277: istore #67
    //   2279: nop
    //   2280: iconst_0
    //   2281: istore #68
    //   2283: aload #61
    //   2285: ldc 693286680
    //   2287: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
    //   2289: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   2292: aload #65
    //   2294: aload #66
    //   2296: aload #61
    //   2298: bipush #14
    //   2300: iload #67
    //   2302: iconst_3
    //   2303: ishr
    //   2304: iand
    //   2305: bipush #112
    //   2307: iload #67
    //   2309: iconst_3
    //   2310: ishr
    //   2311: iand
    //   2312: ior
    //   2313: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    //   2316: astore #69
    //   2318: bipush #112
    //   2320: iload #67
    //   2322: iconst_3
    //   2323: ishl
    //   2324: iand
    //   2325: istore #70
    //   2327: nop
    //   2328: iconst_0
    //   2329: istore #71
    //   2331: aload #61
    //   2333: ldc -1323940314
    //   2335: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   2337: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   2340: aload #61
    //   2342: iconst_0
    //   2343: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   2346: istore #72
    //   2348: aload #61
    //   2350: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   2355: astore #73
    //   2357: aload #61
    //   2359: aload #64
    //   2361: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   2364: astore #74
    //   2366: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   2369: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   2372: astore #75
    //   2374: bipush #6
    //   2376: sipush #896
    //   2379: iload #70
    //   2381: bipush #6
    //   2383: ishl
    //   2384: iand
    //   2385: ior
    //   2386: istore #76
    //   2388: nop
    //   2389: iconst_0
    //   2390: istore #77
    //   2392: aload #61
    //   2394: ldc -692256719
    //   2396: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   2398: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   2401: aload #61
    //   2403: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   2408: instanceof androidx/compose/runtime/Applier
    //   2411: ifne -> 2417
    //   2414: invokestatic invalidApplier : ()V
    //   2417: aload #61
    //   2419: invokeinterface startReusableNode : ()V
    //   2424: aload #61
    //   2426: invokeinterface getInserting : ()Z
    //   2431: ifeq -> 2446
    //   2434: aload #61
    //   2436: aload #75
    //   2438: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   2443: goto -> 2453
    //   2446: aload #61
    //   2448: invokeinterface useNode : ()V
    //   2453: aload #61
    //   2455: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   2458: astore #78
    //   2460: iconst_0
    //   2461: istore #79
    //   2463: aload #78
    //   2465: aload #69
    //   2467: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   2470: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   2473: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   2476: aload #78
    //   2478: aload #73
    //   2480: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   2483: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   2486: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   2489: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   2492: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   2495: astore #80
    //   2497: iconst_0
    //   2498: istore #81
    //   2500: aload #78
    //   2502: astore #82
    //   2504: iconst_0
    //   2505: istore #83
    //   2507: aload #82
    //   2509: invokeinterface getInserting : ()Z
    //   2514: ifne -> 2535
    //   2517: aload #82
    //   2519: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   2524: iload #72
    //   2526: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2529: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   2532: ifne -> 2561
    //   2535: aload #82
    //   2537: iload #72
    //   2539: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2542: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   2547: aload #78
    //   2549: iload #72
    //   2551: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2554: aload #80
    //   2556: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   2561: nop
    //   2562: nop
    //   2563: nop
    //   2564: aload #78
    //   2566: aload #74
    //   2568: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   2571: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   2574: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   2577: nop
    //   2578: nop
    //   2579: aload #61
    //   2581: bipush #14
    //   2583: iload #76
    //   2585: bipush #6
    //   2587: ishr
    //   2588: iand
    //   2589: istore #84
    //   2591: astore #85
    //   2593: iconst_0
    //   2594: istore #86
    //   2596: aload #85
    //   2598: ldc -407840262
    //   2600: ldc 'C101@5126L9:Row.kt#2w3rfo'
    //   2602: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   2605: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
    //   2608: aload #85
    //   2610: bipush #6
    //   2612: bipush #112
    //   2614: iload #67
    //   2616: bipush #6
    //   2618: ishr
    //   2619: iand
    //   2620: ior
    //   2621: istore #87
    //   2623: astore #88
    //   2625: checkcast androidx/compose/foundation/layout/RowScope
    //   2628: astore #89
    //   2630: iconst_0
    //   2631: istore #90
    //   2633: aload #5
    //   2635: aload #89
    //   2637: aload #88
    //   2639: bipush #14
    //   2641: iload #87
    //   2643: iand
    //   2644: bipush #112
    //   2646: iload #9
    //   2648: bipush #12
    //   2650: ishr
    //   2651: iand
    //   2652: ior
    //   2653: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2656: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2661: pop
    //   2662: nop
    //   2663: aload #85
    //   2665: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2668: aload #61
    //   2670: invokeinterface endNode : ()V
    //   2675: aload #61
    //   2677: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2680: nop
    //   2681: aload #61
    //   2683: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2686: nop
    //   2687: aload #61
    //   2689: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2692: nop
    //   2693: nop
    //   2694: aload #58
    //   2696: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2699: aload #34
    //   2701: invokeinterface endNode : ()V
    //   2706: aload #34
    //   2708: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2711: nop
    //   2712: aload #34
    //   2714: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2717: nop
    //   2718: aload #34
    //   2720: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2723: nop
    //   2724: nop
    //   2725: aload #31
    //   2727: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2730: aload #6
    //   2732: invokeinterface endNode : ()V
    //   2737: aload #6
    //   2739: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2742: nop
    //   2743: aload #6
    //   2745: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2748: nop
    //   2749: aload #6
    //   2751: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2754: nop
    //   2755: invokestatic isTraceInProgress : ()Z
    //   2758: ifeq -> 2774
    //   2761: invokestatic traceEventEnd : ()V
    //   2764: goto -> 2774
    //   2767: aload #6
    //   2769: invokeinterface skipToGroupEnd : ()V
    //   2774: aload #6
    //   2776: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   2781: dup
    //   2782: ifnull -> 2810
    //   2785: aload_0
    //   2786: aload_1
    //   2787: aload_2
    //   2788: aload_3
    //   2789: aload #4
    //   2791: aload #5
    //   2793: iload #7
    //   2795: iload #8
    //   2797: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;II)Lkotlin/jvm/functions/Function2;
    //   2802: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   2807: goto -> 2811
    //   2810: pop
    //   2811: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #31	-> 12
    //   #25	-> 357
    //   #28	-> 372
    //   #87	-> 382
    //   #28	-> 388
    //   #31	-> 437
    //   #34	-> 440
    //   #35	-> 444
    //   #37	-> 456
    //   #88	-> 463
    //   #37	-> 469
    //   #32	-> 477
    //   #89	-> 487
    //   #90	-> 490
    //   #91	-> 498
    //   #94	-> 506
    //   #95	-> 541
    //   #96	-> 551
    //   #97	-> 557
    //   #98	-> 564
    //   #99	-> 573
    //   #101	-> 580
    //   #100	-> 602
    //   #102	-> 612
    //   #103	-> 615
    //   #104	-> 633
    //   #105	-> 638
    //   #106	-> 650
    //   #108	-> 662
    //   #110	-> 667
    //   #111	-> 677
    //   #112	-> 690
    //   #114	-> 703
    //   #115	-> 714
    //   #116	-> 721
    //   #117	-> 749
    //   #118	-> 761
    //   #120	-> 775
    //   #115	-> 776
    //   #120	-> 777
    //   #121	-> 778
    //   #122	-> 791
    //   #110	-> 792
    //   #123	-> 793
    //   #124	-> 816
    //   #42	-> 847
    //   #44	-> 858
    //   #45	-> 867
    //   #46	-> 880
    //   #40	-> 892
    //   #125	-> 904
    //   #126	-> 907
    //   #129	-> 910
    //   #130	-> 928
    //   #131	-> 938
    //   #132	-> 944
    //   #133	-> 951
    //   #134	-> 960
    //   #136	-> 967
    //   #135	-> 989
    //   #137	-> 999
    //   #138	-> 1002
    //   #139	-> 1020
    //   #140	-> 1025
    //   #141	-> 1037
    //   #143	-> 1049
    //   #145	-> 1054
    //   #146	-> 1064
    //   #147	-> 1077
    //   #149	-> 1090
    //   #150	-> 1101
    //   #151	-> 1108
    //   #152	-> 1136
    //   #153	-> 1148
    //   #155	-> 1162
    //   #150	-> 1163
    //   #155	-> 1164
    //   #156	-> 1165
    //   #157	-> 1178
    //   #145	-> 1179
    //   #158	-> 1180
    //   #159	-> 1205
    //   #48	-> 1236
    //   #49	-> 1261
    //   #159	-> 1262
    //   #158	-> 1267
    //   #160	-> 1269
    //   #137	-> 1276
    //   #161	-> 1279
    //   #131	-> 1282
    //   #162	-> 1285
    //   #125	-> 1288
    //   #163	-> 1291
    //   #51	-> 1292
    //   #164	-> 1304
    //   #51	-> 1310
    //   #56	-> 1320
    //   #58	-> 1328
    //   #59	-> 1337
    //   #165	-> 1346
    //   #59	-> 1352
    //   #54	-> 1364
    //   #166	-> 1376
    //   #167	-> 1379
    //   #170	-> 1387
    //   #171	-> 1422
    //   #172	-> 1432
    //   #173	-> 1438
    //   #174	-> 1445
    //   #175	-> 1454
    //   #177	-> 1461
    //   #176	-> 1483
    //   #178	-> 1493
    //   #179	-> 1496
    //   #180	-> 1514
    //   #181	-> 1519
    //   #182	-> 1531
    //   #184	-> 1543
    //   #186	-> 1548
    //   #187	-> 1558
    //   #188	-> 1571
    //   #190	-> 1584
    //   #191	-> 1595
    //   #192	-> 1602
    //   #193	-> 1630
    //   #194	-> 1642
    //   #196	-> 1656
    //   #191	-> 1657
    //   #196	-> 1658
    //   #197	-> 1659
    //   #198	-> 1672
    //   #186	-> 1673
    //   #199	-> 1674
    //   #200	-> 1699
    //   #63	-> 1730
    //   #64	-> 1736
    //   #66	-> 1745
    //   #67	-> 1759
    //   #68	-> 1765
    //   #61	-> 1787
    //   #201	-> 1797
    //   #202	-> 1800
    //   #203	-> 1835
    //   #204	-> 1845
    //   #205	-> 1851
    //   #206	-> 1858
    //   #207	-> 1867
    //   #209	-> 1874
    //   #208	-> 1896
    //   #210	-> 1906
    //   #211	-> 1909
    //   #212	-> 1927
    //   #213	-> 1932
    //   #214	-> 1944
    //   #216	-> 1956
    //   #218	-> 1961
    //   #219	-> 1971
    //   #220	-> 1984
    //   #222	-> 1997
    //   #223	-> 2008
    //   #224	-> 2015
    //   #225	-> 2043
    //   #226	-> 2055
    //   #228	-> 2069
    //   #223	-> 2070
    //   #228	-> 2071
    //   #229	-> 2072
    //   #230	-> 2085
    //   #218	-> 2086
    //   #231	-> 2087
    //   #232	-> 2110
    //   #70	-> 2141
    //   #71	-> 2168
    //   #232	-> 2169
    //   #231	-> 2174
    //   #233	-> 2176
    //   #210	-> 2183
    //   #234	-> 2186
    //   #204	-> 2189
    //   #235	-> 2192
    //   #201	-> 2195
    //   #236	-> 2198
    //   #72	-> 2199
    //   #75	-> 2228
    //   #77	-> 2234
    //   #78	-> 2242
    //   #237	-> 2252
    //   #78	-> 2258
    //   #79	-> 2266
    //   #73	-> 2279
    //   #238	-> 2289
    //   #239	-> 2292
    //   #240	-> 2327
    //   #241	-> 2337
    //   #242	-> 2343
    //   #243	-> 2350
    //   #244	-> 2359
    //   #246	-> 2366
    //   #245	-> 2388
    //   #247	-> 2398
    //   #248	-> 2401
    //   #249	-> 2419
    //   #250	-> 2424
    //   #251	-> 2436
    //   #253	-> 2448
    //   #255	-> 2453
    //   #256	-> 2463
    //   #257	-> 2476
    //   #259	-> 2489
    //   #260	-> 2500
    //   #261	-> 2507
    //   #262	-> 2535
    //   #263	-> 2547
    //   #265	-> 2561
    //   #260	-> 2562
    //   #265	-> 2563
    //   #266	-> 2564
    //   #267	-> 2577
    //   #255	-> 2578
    //   #268	-> 2579
    //   #269	-> 2602
    //   #81	-> 2633
    //   #82	-> 2662
    //   #269	-> 2663
    //   #268	-> 2668
    //   #270	-> 2670
    //   #247	-> 2677
    //   #271	-> 2680
    //   #241	-> 2683
    //   #272	-> 2686
    //   #238	-> 2689
    //   #273	-> 2692
    //   #83	-> 2693
    //   #200	-> 2694
    //   #199	-> 2699
    //   #274	-> 2701
    //   #178	-> 2708
    //   #275	-> 2711
    //   #172	-> 2714
    //   #276	-> 2717
    //   #166	-> 2720
    //   #277	-> 2723
    //   #84	-> 2724
    //   #124	-> 2725
    //   #123	-> 2730
    //   #278	-> 2732
    //   #102	-> 2739
    //   #279	-> 2742
    //   #96	-> 2745
    //   #280	-> 2748
    //   #89	-> 2751
    //   #281	-> 2754
    //   #85	-> 2767
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   382	6	11	$i$f$getDp	I
    //   379	9	10	$this$dp$iv	I
    //   463	6	11	$i$f$getDp	I
    //   460	9	10	$this$dp$iv	I
    //   1236	26	63	$i$a$-Box-StepCardKt$StepCard$1$1	I
    //   1233	29	62	$this$StepCard_u24lambda_u244_u24lambda_u240	Landroidx/compose/foundation/layout/BoxScope;
    //   1233	29	61	$composer	Landroidx/compose/runtime/Composer;
    //   1233	29	60	$changed	I
    //   1197	70	59	$i$a$-Layout-BoxKt$Box$1$iv	I
    //   1194	73	58	$composer$iv	Landroidx/compose/runtime/Composer;
    //   1194	73	57	$changed$iv	I
    //   1108	55	56	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   1105	58	55	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   1101	64	54	$i$f$set-impl	I
    //   1098	67	53	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   1064	115	52	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   1061	118	51	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   993	287	50	$i$f$ReusableComposeNode	I
    //   990	290	48	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   990	290	49	$changed$iv$iv$iv	I
    //   932	354	44	$i$f$Layout	I
    //   949	337	45	compositeKeyHash$iv$iv	I
    //   958	328	46	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   967	319	47	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   929	357	43	$changed$iv$iv	I
    //   896	396	40	$i$f$Box	I
    //   919	373	42	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   893	399	37	modifier$iv	Landroidx/compose/ui/Modifier;
    //   893	399	38	contentAlignment$iv	Landroidx/compose/ui/Alignment;
    //   910	382	41	propagateMinConstraints$iv	Z
    //   893	399	39	$changed$iv	I
    //   1304	6	38	$i$f$getDp	I
    //   1301	9	37	$this$dp$iv	I
    //   1346	6	41	$i$f$getDp	I
    //   1343	9	38	$this$dp$iv	I
    //   2141	28	90	$i$a$-Row-StepCardKt$StepCard$1$2$1	I
    //   2138	31	89	$this$StepCard_u24lambda_u244_u24lambda_u243_u24lambda_u241	Landroidx/compose/foundation/layout/RowScope;
    //   2138	31	88	$composer	Landroidx/compose/runtime/Composer;
    //   2138	31	87	$changed	I
    //   2104	70	86	$i$a$-Layout-RowKt$Row$1$iv	I
    //   2101	73	85	$composer$iv	Landroidx/compose/runtime/Composer;
    //   2101	73	84	$changed$iv	I
    //   2015	55	83	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   2012	58	82	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   2008	64	81	$i$f$set-impl	I
    //   2005	67	80	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   1971	115	79	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   1968	118	78	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   1900	287	77	$i$f$ReusableComposeNode	I
    //   1897	290	75	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   1897	290	76	$changed$iv$iv$iv	I
    //   1839	354	71	$i$f$Layout	I
    //   1856	337	72	compositeKeyHash$iv$iv	I
    //   1865	328	73	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   1874	319	74	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   1836	357	70	$changed$iv$iv	I
    //   1791	408	68	$i$f$Row	I
    //   1826	373	69	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   1788	411	64	modifier$iv	Landroidx/compose/ui/Modifier;
    //   1788	411	65	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    //   1788	411	66	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
    //   1788	411	67	$changed$iv	I
    //   2252	6	66	$i$f$getDp	I
    //   2249	9	65	$this$dp$iv	I
    //   2633	30	90	$i$a$-Row-StepCardKt$StepCard$1$2$2	I
    //   2630	33	89	$this$StepCard_u24lambda_u244_u24lambda_u243_u24lambda_u242	Landroidx/compose/foundation/layout/RowScope;
    //   2630	33	88	$composer	Landroidx/compose/runtime/Composer;
    //   2630	33	87	$changed	I
    //   2596	72	86	$i$a$-Layout-RowKt$Row$1$iv	I
    //   2593	75	85	$composer$iv	Landroidx/compose/runtime/Composer;
    //   2593	75	84	$changed$iv	I
    //   2507	55	83	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   2504	58	82	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   2500	64	81	$i$f$set-impl	I
    //   2497	67	80	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   2463	115	79	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   2460	118	78	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   2392	289	77	$i$f$ReusableComposeNode	I
    //   2389	292	75	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   2389	292	76	$changed$iv$iv$iv	I
    //   2331	356	71	$i$f$Layout	I
    //   2348	339	72	compositeKeyHash$iv$iv	I
    //   2357	330	73	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   2366	321	74	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   2328	359	70	$changed$iv$iv	I
    //   2283	410	68	$i$f$Row	I
    //   2318	375	69	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   2280	413	64	modifier$iv	Landroidx/compose/ui/Modifier;
    //   2280	413	65	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    //   2280	413	66	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
    //   2280	413	67	$changed$iv	I
    //   1730	964	63	$i$a$-Column-StepCardKt$StepCard$1$2	I
    //   1727	967	62	$this$StepCard_u24lambda_u244_u24lambda_u243	Landroidx/compose/foundation/layout/ColumnScope;
    //   1727	967	61	$composer	Landroidx/compose/runtime/Composer;
    //   1727	967	60	$changed	I
    //   1691	1008	59	$i$a$-Layout-ColumnKt$Column$1$iv	I
    //   1688	1011	58	$composer$iv	Landroidx/compose/runtime/Composer;
    //   1688	1011	57	$changed$iv	I
    //   1602	55	56	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   1599	58	55	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   1595	64	54	$i$f$set-impl	I
    //   1592	67	53	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   1558	115	52	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   1555	118	51	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   1487	1225	50	$i$f$ReusableComposeNode	I
    //   1484	1228	48	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   1484	1228	49	$changed$iv$iv$iv	I
    //   1426	1292	44	$i$f$Layout	I
    //   1443	1275	45	compositeKeyHash$iv$iv	I
    //   1452	1266	46	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   1461	1257	47	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   1423	1295	43	$changed$iv$iv	I
    //   1368	1356	40	$i$f$Column	I
    //   1413	1311	42	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   1365	1359	37	modifier$iv	Landroidx/compose/ui/Modifier;
    //   1365	1359	38	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
    //   1387	1337	41	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
    //   1365	1359	39	$changed$iv	I
    //   847	1878	36	$i$a$-Row-StepCardKt$StepCard$1	I
    //   844	1881	35	$this$StepCard_u24lambda_u244	Landroidx/compose/foundation/layout/RowScope;
    //   844	1881	34	$composer	Landroidx/compose/runtime/Composer;
    //   844	1881	33	$changed	I
    //   810	1920	32	$i$a$-Layout-RowKt$Row$1$iv	I
    //   807	1923	31	$composer$iv	Landroidx/compose/runtime/Composer;
    //   807	1923	30	$changed$iv	I
    //   721	55	29	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   718	58	28	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   714	64	27	$i$f$set-impl	I
    //   711	67	26	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   677	115	25	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   674	118	24	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   606	2137	23	$i$f$ReusableComposeNode	I
    //   603	2140	21	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   603	2140	22	$changed$iv$iv$iv	I
    //   545	2204	17	$i$f$Layout	I
    //   562	2187	18	compositeKeyHash$iv$iv	I
    //   571	2178	19	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   580	2169	20	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   542	2207	16	$changed$iv$iv	I
    //   481	2274	14	$i$f$Row	I
    //   532	2223	15	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   478	2277	10	modifier$iv	Landroidx/compose/ui/Modifier;
    //   498	2257	11	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    //   506	2249	12	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
    //   478	2277	13	$changed$iv	I
    //   27	2785	9	$dirty	I
    //   0	2812	0	modifier	Landroidx/compose/ui/Modifier;
    //   0	2812	1	icon	Lkotlin/jvm/functions/Function3;
    //   0	2812	2	titleContent	Lkotlin/jvm/functions/Function3;
    //   0	2812	3	titleContentHorizontalArrangement	Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    //   0	2812	4	bodyContent	Lkotlin/jvm/functions/Function3;
    //   0	2812	5	footerContent	Lkotlin/jvm/functions/Function3;
    //   0	2812	6	$composer	Landroidx/compose/runtime/Composer;
    //   0	2812	7	$changed	I
  }
  
  private static final Unit StepCard$lambda$5(Modifier $modifier, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> $icon, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> $titleContent, Arrangement.HorizontalOrVertical $titleContentHorizontalArrangement, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> $bodyContent, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> $footerContent, int $$changed, int $$default, Composer $composer, int $force) {
    StepCard($modifier, $icon, $titleContent, $titleContentHorizontalArrangement, $bodyContent, $footerContent, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
    return Unit.INSTANCE;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\StepCardKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */