/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.followup;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.PromptMode;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.NoWhenBranchMatchedException;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000&\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\b\002\0325\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\f\020\b\032\b\022\004\022\0020\n0\tH\001¢\006\002\020\013¨\006\f"}, d2 = {"FollowUp", "", "modifier", "Landroidx/compose/ui/Modifier;", "model", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/followup/FollowupViewModel;", "sendEnabled", "", "promptMode", "Landroidx/compose/runtime/MutableState;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;", "(Landroidx/compose/ui/Modifier;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/followup/FollowupViewModel;ZLandroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;II)V", "ej-ui"})
/*    */ @SourceDebugExtension({"SMAP\nFollowUp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FollowUp.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/followup/FollowUpKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,41:1\n86#2:42\n83#2,6:43\n89#2:77\n93#2:94\n79#3,6:49\n86#3,4:64\n90#3,2:74\n94#3:93\n368#4,9:55\n377#4:76\n378#4,2:91\n4034#5,6:68\n149#6:78\n1225#7,6:79\n1225#7,6:85\n*S KotlinDebug\n*F\n+ 1 FollowUp.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/followup/FollowUpKt\n*L\n21#1:42\n21#1:43,6\n21#1:77\n21#1:94\n21#1:49,6\n21#1:64,4\n21#1:74,2\n21#1:93\n21#1:55,9\n21#1:76\n21#1:91,2\n21#1:68,6\n24#1:78\n31#1:79,6\n38#1:85,6\n*E\n"})
/*    */ public final class FollowUpKt
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public static final void FollowUp(@Nullable Modifier modifier, @NotNull FollowupViewModel model, boolean sendEnabled, @NotNull MutableState promptMode, @Nullable Composer $composer, int $changed, int paramInt1) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'model'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_3
/*    */     //   7: ldc 'promptMode'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload #4
/*    */     //   14: ldc -762404728
/*    */     //   16: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   21: astore #4
/*    */     //   23: iload #5
/*    */     //   25: istore #7
/*    */     //   27: iload #6
/*    */     //   29: iconst_1
/*    */     //   30: iand
/*    */     //   31: ifeq -> 44
/*    */     //   34: iload #7
/*    */     //   36: bipush #6
/*    */     //   38: ior
/*    */     //   39: istore #7
/*    */     //   41: goto -> 73
/*    */     //   44: iload #5
/*    */     //   46: bipush #6
/*    */     //   48: iand
/*    */     //   49: ifne -> 73
/*    */     //   52: iload #7
/*    */     //   54: aload #4
/*    */     //   56: aload_0
/*    */     //   57: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   62: ifeq -> 69
/*    */     //   65: iconst_4
/*    */     //   66: goto -> 70
/*    */     //   69: iconst_2
/*    */     //   70: ior
/*    */     //   71: istore #7
/*    */     //   73: iload #6
/*    */     //   75: iconst_2
/*    */     //   76: iand
/*    */     //   77: ifeq -> 90
/*    */     //   80: iload #7
/*    */     //   82: bipush #48
/*    */     //   84: ior
/*    */     //   85: istore #7
/*    */     //   87: goto -> 121
/*    */     //   90: iload #5
/*    */     //   92: bipush #48
/*    */     //   94: iand
/*    */     //   95: ifne -> 121
/*    */     //   98: iload #7
/*    */     //   100: aload #4
/*    */     //   102: aload_1
/*    */     //   103: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   108: ifeq -> 116
/*    */     //   111: bipush #32
/*    */     //   113: goto -> 118
/*    */     //   116: bipush #16
/*    */     //   118: ior
/*    */     //   119: istore #7
/*    */     //   121: iload #6
/*    */     //   123: iconst_4
/*    */     //   124: iand
/*    */     //   125: ifeq -> 139
/*    */     //   128: iload #7
/*    */     //   130: sipush #384
/*    */     //   133: ior
/*    */     //   134: istore #7
/*    */     //   136: goto -> 173
/*    */     //   139: iload #5
/*    */     //   141: sipush #384
/*    */     //   144: iand
/*    */     //   145: ifne -> 173
/*    */     //   148: iload #7
/*    */     //   150: aload #4
/*    */     //   152: iload_2
/*    */     //   153: invokeinterface changed : (Z)Z
/*    */     //   158: ifeq -> 167
/*    */     //   161: sipush #256
/*    */     //   164: goto -> 170
/*    */     //   167: sipush #128
/*    */     //   170: ior
/*    */     //   171: istore #7
/*    */     //   173: iload #6
/*    */     //   175: bipush #8
/*    */     //   177: iand
/*    */     //   178: ifeq -> 192
/*    */     //   181: iload #7
/*    */     //   183: sipush #3072
/*    */     //   186: ior
/*    */     //   187: istore #7
/*    */     //   189: goto -> 226
/*    */     //   192: iload #5
/*    */     //   194: sipush #3072
/*    */     //   197: iand
/*    */     //   198: ifne -> 226
/*    */     //   201: iload #7
/*    */     //   203: aload #4
/*    */     //   205: aload_3
/*    */     //   206: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   211: ifeq -> 220
/*    */     //   214: sipush #2048
/*    */     //   217: goto -> 223
/*    */     //   220: sipush #1024
/*    */     //   223: ior
/*    */     //   224: istore #7
/*    */     //   226: iload #7
/*    */     //   228: sipush #1171
/*    */     //   231: iand
/*    */     //   232: sipush #1170
/*    */     //   235: if_icmpne -> 248
/*    */     //   238: aload #4
/*    */     //   240: invokeinterface getSkipping : ()Z
/*    */     //   245: ifne -> 1065
/*    */     //   248: iload #6
/*    */     //   250: iconst_1
/*    */     //   251: iand
/*    */     //   252: ifeq -> 262
/*    */     //   255: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   258: checkcast androidx/compose/ui/Modifier
/*    */     //   261: astore_0
/*    */     //   262: invokestatic isTraceInProgress : ()Z
/*    */     //   265: ifeq -> 278
/*    */     //   268: ldc -762404728
/*    */     //   270: iload #7
/*    */     //   272: iconst_m1
/*    */     //   273: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.followup.FollowUp (FollowUp.kt:19)'
/*    */     //   275: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   278: aload_0
/*    */     //   279: astore #8
/*    */     //   281: bipush #14
/*    */     //   283: iload #7
/*    */     //   285: iand
/*    */     //   286: istore #11
/*    */     //   288: iconst_0
/*    */     //   289: istore #12
/*    */     //   291: aload #4
/*    */     //   293: ldc -483455358
/*    */     //   295: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*    */     //   297: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   300: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*    */     //   303: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*    */     //   306: astore #9
/*    */     //   308: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   311: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*    */     //   314: astore #10
/*    */     //   316: aload #9
/*    */     //   318: aload #10
/*    */     //   320: aload #4
/*    */     //   322: bipush #14
/*    */     //   324: iload #11
/*    */     //   326: iconst_3
/*    */     //   327: ishr
/*    */     //   328: iand
/*    */     //   329: bipush #112
/*    */     //   331: iload #11
/*    */     //   333: iconst_3
/*    */     //   334: ishr
/*    */     //   335: iand
/*    */     //   336: ior
/*    */     //   337: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   340: astore #13
/*    */     //   342: bipush #112
/*    */     //   344: iload #11
/*    */     //   346: iconst_3
/*    */     //   347: ishl
/*    */     //   348: iand
/*    */     //   349: istore #14
/*    */     //   351: nop
/*    */     //   352: iconst_0
/*    */     //   353: istore #15
/*    */     //   355: aload #4
/*    */     //   357: ldc -1323940314
/*    */     //   359: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */     //   361: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   364: aload #4
/*    */     //   366: iconst_0
/*    */     //   367: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */     //   370: istore #16
/*    */     //   372: aload #4
/*    */     //   374: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   379: astore #17
/*    */     //   381: aload #4
/*    */     //   383: aload #8
/*    */     //   385: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   388: astore #18
/*    */     //   390: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   393: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */     //   396: astore #19
/*    */     //   398: bipush #6
/*    */     //   400: sipush #896
/*    */     //   403: iload #14
/*    */     //   405: bipush #6
/*    */     //   407: ishl
/*    */     //   408: iand
/*    */     //   409: ior
/*    */     //   410: istore #20
/*    */     //   412: nop
/*    */     //   413: iconst_0
/*    */     //   414: istore #21
/*    */     //   416: aload #4
/*    */     //   418: ldc -692256719
/*    */     //   420: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */     //   422: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   425: aload #4
/*    */     //   427: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */     //   432: instanceof androidx/compose/runtime/Applier
/*    */     //   435: ifne -> 441
/*    */     //   438: invokestatic invalidApplier : ()V
/*    */     //   441: aload #4
/*    */     //   443: invokeinterface startReusableNode : ()V
/*    */     //   448: aload #4
/*    */     //   450: invokeinterface getInserting : ()Z
/*    */     //   455: ifeq -> 470
/*    */     //   458: aload #4
/*    */     //   460: aload #19
/*    */     //   462: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   467: goto -> 477
/*    */     //   470: aload #4
/*    */     //   472: invokeinterface useNode : ()V
/*    */     //   477: aload #4
/*    */     //   479: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */     //   482: astore #22
/*    */     //   484: iconst_0
/*    */     //   485: istore #23
/*    */     //   487: aload #22
/*    */     //   489: aload #13
/*    */     //   491: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   494: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */     //   497: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   500: aload #22
/*    */     //   502: aload #17
/*    */     //   504: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   507: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */     //   510: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   513: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   516: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */     //   519: astore #24
/*    */     //   521: iconst_0
/*    */     //   522: istore #25
/*    */     //   524: aload #22
/*    */     //   526: astore #26
/*    */     //   528: iconst_0
/*    */     //   529: istore #27
/*    */     //   531: aload #26
/*    */     //   533: invokeinterface getInserting : ()Z
/*    */     //   538: ifne -> 559
/*    */     //   541: aload #26
/*    */     //   543: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   548: iload #16
/*    */     //   550: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   553: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   556: ifne -> 585
/*    */     //   559: aload #26
/*    */     //   561: iload #16
/*    */     //   563: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   566: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   571: aload #22
/*    */     //   573: iload #16
/*    */     //   575: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   578: aload #24
/*    */     //   580: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   585: nop
/*    */     //   586: nop
/*    */     //   587: nop
/*    */     //   588: aload #22
/*    */     //   590: aload #18
/*    */     //   592: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   595: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */     //   598: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   601: nop
/*    */     //   602: nop
/*    */     //   603: aload #4
/*    */     //   605: bipush #14
/*    */     //   607: iload #20
/*    */     //   609: bipush #6
/*    */     //   611: ishr
/*    */     //   612: iand
/*    */     //   613: istore #28
/*    */     //   615: astore #29
/*    */     //   617: iconst_0
/*    */     //   618: istore #30
/*    */     //   620: aload #29
/*    */     //   622: ldc -384784025
/*    */     //   624: ldc 'C88@4444L9:Column.kt#2w3rfo'
/*    */     //   626: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   629: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*    */     //   632: aload #29
/*    */     //   634: bipush #6
/*    */     //   636: bipush #112
/*    */     //   638: iload #11
/*    */     //   640: bipush #6
/*    */     //   642: ishr
/*    */     //   643: iand
/*    */     //   644: ior
/*    */     //   645: istore #31
/*    */     //   647: astore #32
/*    */     //   649: checkcast androidx/compose/foundation/layout/ColumnScope
/*    */     //   652: astore #33
/*    */     //   654: iconst_0
/*    */     //   655: istore #34
/*    */     //   657: ldc 'Follow up'
/*    */     //   659: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   662: checkcast androidx/compose/ui/Modifier
/*    */     //   665: iconst_5
/*    */     //   666: istore #35
/*    */     //   668: iconst_0
/*    */     //   669: istore #36
/*    */     //   671: iload #35
/*    */     //   673: i2f
/*    */     //   674: invokestatic constructor-impl : (F)F
/*    */     //   677: bipush #10
/*    */     //   679: istore #35
/*    */     //   681: iconst_0
/*    */     //   682: istore #36
/*    */     //   684: iload #35
/*    */     //   686: i2f
/*    */     //   687: invokestatic constructor-impl : (F)F
/*    */     //   690: fconst_0
/*    */     //   691: bipush #10
/*    */     //   693: istore #35
/*    */     //   695: iconst_0
/*    */     //   696: istore #36
/*    */     //   698: iload #35
/*    */     //   700: i2f
/*    */     //   701: invokestatic constructor-impl : (F)F
/*    */     //   704: iconst_4
/*    */     //   705: aconst_null
/*    */     //   706: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   709: aload #32
/*    */     //   711: iconst_0
/*    */     //   712: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*    */     //   715: aload #32
/*    */     //   717: getstatic com/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData.$stable : I
/*    */     //   720: invokevirtual getInactiveTextColor : (Landroidx/compose/runtime/Composer;I)J
/*    */     //   723: lconst_0
/*    */     //   724: aconst_null
/*    */     //   725: aconst_null
/*    */     //   726: aconst_null
/*    */     //   727: lconst_0
/*    */     //   728: aconst_null
/*    */     //   729: iconst_0
/*    */     //   730: lconst_0
/*    */     //   731: iconst_0
/*    */     //   732: iconst_0
/*    */     //   733: iconst_0
/*    */     //   734: aconst_null
/*    */     //   735: aconst_null
/*    */     //   736: aload #32
/*    */     //   738: bipush #54
/*    */     //   740: iconst_0
/*    */     //   741: ldc 65528
/*    */     //   743: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*    */     //   746: aconst_null
/*    */     //   747: iload_2
/*    */     //   748: aload_1
/*    */     //   749: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptOwnerViewModel
/*    */     //   752: aload #32
/*    */     //   754: ldc 245351699
/*    */     //   756: invokeinterface startReplaceGroup : (I)V
/*    */     //   761: aload #32
/*    */     //   763: astore #36
/*    */     //   765: iconst_0
/*    */     //   766: istore #37
/*    */     //   768: nop
/*    */     //   769: iconst_0
/*    */     //   770: istore #38
/*    */     //   772: aload #36
/*    */     //   774: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   779: astore #39
/*    */     //   781: iconst_0
/*    */     //   782: istore #40
/*    */     //   784: aload #39
/*    */     //   786: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   789: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   792: if_acmpne -> 835
/*    */     //   795: astore #41
/*    */     //   797: istore #42
/*    */     //   799: astore #43
/*    */     //   801: iconst_0
/*    */     //   802: istore #44
/*    */     //   804: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */     //   809: astore #45
/*    */     //   811: aload #43
/*    */     //   813: iload #42
/*    */     //   815: aload #41
/*    */     //   817: aload #45
/*    */     //   819: astore #44
/*    */     //   821: aload #36
/*    */     //   823: aload #44
/*    */     //   825: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   830: aload #44
/*    */     //   832: goto -> 837
/*    */     //   835: aload #39
/*    */     //   837: nop
/*    */     //   838: nop
/*    */     //   839: nop
/*    */     //   840: checkcast kotlin/jvm/functions/Function1
/*    */     //   843: astore #35
/*    */     //   845: aload #32
/*    */     //   847: invokeinterface endReplaceGroup : ()V
/*    */     //   852: aload #35
/*    */     //   854: aload_3
/*    */     //   855: invokeinterface getValue : ()Ljava/lang/Object;
/*    */     //   860: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode
/*    */     //   863: aload #32
/*    */     //   865: ldc_w 245359268
/*    */     //   868: invokeinterface startReplaceGroup : (I)V
/*    */     //   873: aload #32
/*    */     //   875: astore #36
/*    */     //   877: iload #7
/*    */     //   879: sipush #7168
/*    */     //   882: iand
/*    */     //   883: sipush #2048
/*    */     //   886: if_icmpne -> 893
/*    */     //   889: iconst_1
/*    */     //   890: goto -> 894
/*    */     //   893: iconst_0
/*    */     //   894: istore #37
/*    */     //   896: nop
/*    */     //   897: iconst_0
/*    */     //   898: istore #38
/*    */     //   900: aload #36
/*    */     //   902: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   907: astore #39
/*    */     //   909: iconst_0
/*    */     //   910: istore #40
/*    */     //   912: iload #37
/*    */     //   914: ifne -> 928
/*    */     //   917: aload #39
/*    */     //   919: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   922: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   925: if_acmpne -> 977
/*    */     //   928: astore #46
/*    */     //   930: astore #45
/*    */     //   932: astore #41
/*    */     //   934: istore #42
/*    */     //   936: astore #43
/*    */     //   938: iconst_0
/*    */     //   939: istore #44
/*    */     //   941: aload_3
/*    */     //   942: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*    */     //   947: astore #47
/*    */     //   949: aload #43
/*    */     //   951: iload #42
/*    */     //   953: aload #41
/*    */     //   955: aload #45
/*    */     //   957: aload #46
/*    */     //   959: aload #47
/*    */     //   961: astore #48
/*    */     //   963: aload #36
/*    */     //   965: aload #48
/*    */     //   967: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   972: aload #48
/*    */     //   974: goto -> 979
/*    */     //   977: aload #39
/*    */     //   979: nop
/*    */     //   980: nop
/*    */     //   981: nop
/*    */     //   982: checkcast kotlin/jvm/functions/Function1
/*    */     //   985: astore #35
/*    */     //   987: aload #32
/*    */     //   989: invokeinterface endReplaceGroup : ()V
/*    */     //   994: aload #35
/*    */     //   996: aload #32
/*    */     //   998: sipush #3072
/*    */     //   1001: bipush #112
/*    */     //   1003: iload #7
/*    */     //   1005: iconst_3
/*    */     //   1006: ishr
/*    */     //   1007: iand
/*    */     //   1008: ior
/*    */     //   1009: sipush #896
/*    */     //   1012: iload #7
/*    */     //   1014: iconst_3
/*    */     //   1015: ishl
/*    */     //   1016: iand
/*    */     //   1017: ior
/*    */     //   1018: iconst_1
/*    */     //   1019: invokestatic PromptArea : (Landroidx/compose/ui/Modifier;ZLcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptOwnerViewModel;Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
/*    */     //   1022: nop
/*    */     //   1023: aload #29
/*    */     //   1025: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1028: aload #4
/*    */     //   1030: invokeinterface endNode : ()V
/*    */     //   1035: aload #4
/*    */     //   1037: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1040: nop
/*    */     //   1041: aload #4
/*    */     //   1043: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1046: nop
/*    */     //   1047: aload #4
/*    */     //   1049: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1052: nop
/*    */     //   1053: invokestatic isTraceInProgress : ()Z
/*    */     //   1056: ifeq -> 1072
/*    */     //   1059: invokestatic traceEventEnd : ()V
/*    */     //   1062: goto -> 1072
/*    */     //   1065: aload #4
/*    */     //   1067: invokeinterface skipToGroupEnd : ()V
/*    */     //   1072: aload #4
/*    */     //   1074: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   1079: dup
/*    */     //   1080: ifnull -> 1104
/*    */     //   1083: aload_0
/*    */     //   1084: aload_1
/*    */     //   1085: iload_2
/*    */     //   1086: aload_3
/*    */     //   1087: iload #5
/*    */     //   1089: iload #6
/*    */     //   1091: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/followup/FollowupViewModel;ZLandroidx/compose/runtime/MutableState;II)Lkotlin/jvm/functions/Function2;
/*    */     //   1096: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   1101: goto -> 1105
/*    */     //   1104: pop
/*    */     //   1105: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 12
/*    */     //   #16	-> 255
/*    */     //   #20	-> 275
/*    */     //   #21	-> 278
/*    */     //   #42	-> 297
/*    */     //   #43	-> 300
/*    */     //   #44	-> 308
/*    */     //   #47	-> 316
/*    */     //   #48	-> 351
/*    */     //   #49	-> 361
/*    */     //   #50	-> 367
/*    */     //   #51	-> 374
/*    */     //   #52	-> 383
/*    */     //   #54	-> 390
/*    */     //   #53	-> 412
/*    */     //   #55	-> 422
/*    */     //   #56	-> 425
/*    */     //   #57	-> 443
/*    */     //   #58	-> 448
/*    */     //   #59	-> 460
/*    */     //   #61	-> 472
/*    */     //   #63	-> 477
/*    */     //   #64	-> 487
/*    */     //   #65	-> 500
/*    */     //   #67	-> 513
/*    */     //   #68	-> 524
/*    */     //   #69	-> 531
/*    */     //   #70	-> 559
/*    */     //   #71	-> 571
/*    */     //   #73	-> 585
/*    */     //   #68	-> 586
/*    */     //   #73	-> 587
/*    */     //   #74	-> 588
/*    */     //   #75	-> 601
/*    */     //   #63	-> 602
/*    */     //   #76	-> 603
/*    */     //   #77	-> 626
/*    */     //   #23	-> 657
/*    */     //   #24	-> 659
/*    */     //   #78	-> 671
/*    */     //   #24	-> 677
/*    */     //   #78	-> 684
/*    */     //   #24	-> 690
/*    */     //   #78	-> 698
/*    */     //   #24	-> 704
/*    */     //   #25	-> 712
/*    */     //   #22	-> 743
/*    */     //   #29	-> 747
/*    */     //   #30	-> 748
/*    */     //   #31	-> 768
/*    */     //   #79	-> 772
/*    */     //   #80	-> 784
/*    */     //   #81	-> 795
/*    */     //   #81	-> 819
/*    */     //   #82	-> 821
/*    */     //   #83	-> 830
/*    */     //   #84	-> 835
/*    */     //   #80	-> 837
/*    */     //   #79	-> 838
/*    */     //   #79	-> 839
/*    */     //   #31	-> 840
/*    */     //   #37	-> 854
/*    */     //   #38	-> 896
/*    */     //   #85	-> 900
/*    */     //   #86	-> 912
/*    */     //   #87	-> 928
/*    */     //   #38	-> 941
/*    */     //   #87	-> 961
/*    */     //   #88	-> 963
/*    */     //   #89	-> 972
/*    */     //   #90	-> 977
/*    */     //   #86	-> 979
/*    */     //   #85	-> 980
/*    */     //   #85	-> 981
/*    */     //   #38	-> 982
/*    */     //   #28	-> 1019
/*    */     //   #40	-> 1022
/*    */     //   #77	-> 1023
/*    */     //   #76	-> 1028
/*    */     //   #91	-> 1030
/*    */     //   #55	-> 1037
/*    */     //   #92	-> 1040
/*    */     //   #49	-> 1043
/*    */     //   #93	-> 1046
/*    */     //   #42	-> 1049
/*    */     //   #94	-> 1052
/*    */     //   #41	-> 1065
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   671	6	36	$i$f$getDp	I
/*    */     //   668	9	35	$this$dp$iv	I
/*    */     //   684	6	36	$i$f$getDp	I
/*    */     //   681	9	35	$this$dp$iv	I
/*    */     //   698	6	36	$i$f$getDp	I
/*    */     //   695	9	35	$this$dp$iv	I
/*    */     //   804	5	44	$i$a$-cache-FollowUpKt$FollowUp$1$1	I
/*    */     //   821	11	44	value$iv	Ljava/lang/Object;
/*    */     //   784	54	40	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   781	57	39	it$iv	Ljava/lang/Object;
/*    */     //   772	68	38	$i$f$cache	I
/*    */     //   769	71	36	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   769	71	37	invalid$iv	Z
/*    */     //   941	6	44	$i$a$-cache-FollowUpKt$FollowUp$1$2	I
/*    */     //   963	11	48	value$iv	Ljava/lang/Object;
/*    */     //   912	68	40	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   909	71	39	it$iv	Ljava/lang/Object;
/*    */     //   900	82	38	$i$f$cache	I
/*    */     //   897	85	36	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   897	85	37	invalid$iv	Z
/*    */     //   657	366	34	$i$a$-Column-FollowUpKt$FollowUp$1	I
/*    */     //   654	369	33	$this$FollowUp_u24lambda_u244	Landroidx/compose/foundation/layout/ColumnScope;
/*    */     //   654	369	32	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   654	369	31	$changed	I
/*    */     //   620	408	30	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*    */     //   617	411	29	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   617	411	28	$changed$iv	I
/*    */     //   531	55	27	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */     //   528	58	26	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   524	64	25	$i$f$set-impl	I
/*    */     //   521	67	24	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */     //   487	115	23	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */     //   484	118	22	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   416	625	21	$i$f$ReusableComposeNode	I
/*    */     //   413	628	19	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */     //   413	628	20	$changed$iv$iv$iv	I
/*    */     //   355	692	15	$i$f$Layout	I
/*    */     //   372	675	16	compositeKeyHash$iv$iv	I
/*    */     //   381	666	17	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   390	657	18	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */     //   352	695	14	$changed$iv$iv	I
/*    */     //   291	762	12	$i$f$Column	I
/*    */     //   342	711	13	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   288	765	8	modifier$iv	Landroidx/compose/ui/Modifier;
/*    */     //   308	745	9	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*    */     //   316	737	10	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*    */     //   288	765	11	$changed$iv	I
/*    */     //   27	1079	7	$dirty	I
/*    */     //   0	1106	0	modifier	Landroidx/compose/ui/Modifier;
/*    */     //   0	1106	1	model	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/followup/FollowupViewModel;
/*    */     //   0	1106	2	sendEnabled	Z
/*    */     //   0	1106	3	promptMode	Landroidx/compose/runtime/MutableState;
/*    */     //   0	1106	4	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	1106	5	$changed	I
/*    */   }
/*    */   
/*    */   private static final String FollowUp$lambda$4$lambda$1$lambda$0(PromptMode promptMode) {
/* 32 */     Intrinsics.checkNotNullParameter(promptMode, "promptMode"); switch (WhenMappings.$EnumSwitchMapping$0[promptMode.ordinal()]) { case 1: case 2:  }  throw new NoWhenBranchMatchedException();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static final Unit FollowUp$lambda$4$lambda$3$lambda$2(MutableState $promptMode, PromptMode it) {
/* 38 */     Intrinsics.checkNotNullParameter(it, "it"); $promptMode.setValue(it); return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit FollowUp$lambda$5(Modifier $modifier, FollowupViewModel $model, boolean $sendEnabled, MutableState<PromptMode> $promptMode, int $$changed, int $$default, Composer $composer, int $force) {
/*    */     FollowUp($modifier, $model, $sendEnabled, $promptMode, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\followup\FollowUpKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */