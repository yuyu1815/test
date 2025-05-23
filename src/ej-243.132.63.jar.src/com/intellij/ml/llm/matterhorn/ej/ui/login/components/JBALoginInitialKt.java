/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.login.components;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.login.states.JbaUnauthenticated;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.FunctionReferenceImpl;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\032!\020\000\032\0020\0012\006\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\005H\001¢\006\002\020\006¨\006\007"}, d2 = {"JBALoginInitial", "", "state", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated;", "error", "", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "ej-ui"})
/*    */ @SourceDebugExtension({"SMAP\nJBALoginInitial.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JBALoginInitial.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/components/JBALoginInitialKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,41:1\n149#2:42\n149#2:78\n149#2:79\n86#3:43\n84#3,5:44\n89#3:77\n93#3:137\n79#4,6:49\n86#4,4:64\n90#4,2:74\n79#4,6:83\n86#4,4:98\n90#4,2:108\n94#4:126\n94#4:136\n368#5,9:55\n377#5:76\n368#5,9:89\n377#5:110\n378#5,2:124\n378#5,2:134\n4034#6,6:68\n4034#6,6:102\n99#7,3:80\n102#7:111\n106#7:127\n1225#8,6:112\n1225#8,6:118\n1225#8,6:128\n*S KotlinDebug\n*F\n+ 1 JBALoginInitial.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/components/JBALoginInitialKt\n*L\n23#1:42\n27#1:78\n28#1:79\n21#1:43\n21#1:44,5\n21#1:77\n21#1:137\n21#1:49,6\n21#1:64,4\n21#1:74,2\n26#1:83,6\n26#1:98,4\n26#1:108,2\n26#1:126\n21#1:136\n21#1:55,9\n21#1:76\n26#1:89,9\n26#1:110\n26#1:124,2\n21#1:134,2\n21#1:68,6\n26#1:102,6\n26#1:80,3\n26#1:111\n26#1:127\n31#1:112,6\n32#1:118,6\n37#1:128,6\n*E\n"})
/*    */ public final class JBALoginInitialKt {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public static final void JBALoginInitial(@NotNull JbaUnauthenticated state, @Nullable String error, @Nullable Composer $composer, int $changed, int paramInt1) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'state'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc -162889884
/*    */     //   9: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   14: astore_2
/*    */     //   15: iload_3
/*    */     //   16: istore #5
/*    */     //   18: iload #4
/*    */     //   20: iconst_1
/*    */     //   21: iand
/*    */     //   22: ifeq -> 35
/*    */     //   25: iload #5
/*    */     //   27: bipush #6
/*    */     //   29: ior
/*    */     //   30: istore #5
/*    */     //   32: goto -> 62
/*    */     //   35: iload_3
/*    */     //   36: bipush #6
/*    */     //   38: iand
/*    */     //   39: ifne -> 62
/*    */     //   42: iload #5
/*    */     //   44: aload_2
/*    */     //   45: aload_0
/*    */     //   46: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   51: ifeq -> 58
/*    */     //   54: iconst_4
/*    */     //   55: goto -> 59
/*    */     //   58: iconst_2
/*    */     //   59: ior
/*    */     //   60: istore #5
/*    */     //   62: iload #4
/*    */     //   64: iconst_2
/*    */     //   65: iand
/*    */     //   66: ifeq -> 79
/*    */     //   69: iload #5
/*    */     //   71: bipush #48
/*    */     //   73: ior
/*    */     //   74: istore #5
/*    */     //   76: goto -> 108
/*    */     //   79: iload_3
/*    */     //   80: bipush #48
/*    */     //   82: iand
/*    */     //   83: ifne -> 108
/*    */     //   86: iload #5
/*    */     //   88: aload_2
/*    */     //   89: aload_1
/*    */     //   90: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   95: ifeq -> 103
/*    */     //   98: bipush #32
/*    */     //   100: goto -> 105
/*    */     //   103: bipush #16
/*    */     //   105: ior
/*    */     //   106: istore #5
/*    */     //   108: iload #5
/*    */     //   110: bipush #19
/*    */     //   112: iand
/*    */     //   113: bipush #18
/*    */     //   115: if_icmpne -> 127
/*    */     //   118: aload_2
/*    */     //   119: invokeinterface getSkipping : ()Z
/*    */     //   124: ifne -> 1478
/*    */     //   127: iload #4
/*    */     //   129: iconst_2
/*    */     //   130: iand
/*    */     //   131: ifeq -> 136
/*    */     //   134: aconst_null
/*    */     //   135: astore_1
/*    */     //   136: invokestatic isTraceInProgress : ()Z
/*    */     //   139: ifeq -> 152
/*    */     //   142: ldc -162889884
/*    */     //   144: iload #5
/*    */     //   146: iconst_m1
/*    */     //   147: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.login.components.JBALoginInitial (JBALoginInitial.kt:19)'
/*    */     //   149: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   152: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   155: checkcast androidx/compose/ui/Modifier
/*    */     //   158: fconst_0
/*    */     //   159: invokestatic getActivationMinHeight : ()F
/*    */     //   162: iconst_1
/*    */     //   163: aconst_null
/*    */     //   164: invokestatic defaultMinSize-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   167: astore #6
/*    */     //   169: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*    */     //   172: bipush #16
/*    */     //   174: istore #7
/*    */     //   176: iconst_0
/*    */     //   177: istore #8
/*    */     //   179: iload #7
/*    */     //   181: i2f
/*    */     //   182: invokestatic constructor-impl : (F)F
/*    */     //   185: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*    */     //   188: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
/*    */     //   191: astore #7
/*    */     //   193: bipush #54
/*    */     //   195: istore #9
/*    */     //   197: nop
/*    */     //   198: iconst_0
/*    */     //   199: istore #10
/*    */     //   201: aload_2
/*    */     //   202: ldc -483455358
/*    */     //   204: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*    */     //   206: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   209: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   212: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*    */     //   215: astore #8
/*    */     //   217: aload #7
/*    */     //   219: aload #8
/*    */     //   221: aload_2
/*    */     //   222: bipush #14
/*    */     //   224: iload #9
/*    */     //   226: iconst_3
/*    */     //   227: ishr
/*    */     //   228: iand
/*    */     //   229: bipush #112
/*    */     //   231: iload #9
/*    */     //   233: iconst_3
/*    */     //   234: ishr
/*    */     //   235: iand
/*    */     //   236: ior
/*    */     //   237: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   240: astore #11
/*    */     //   242: bipush #112
/*    */     //   244: iload #9
/*    */     //   246: iconst_3
/*    */     //   247: ishl
/*    */     //   248: iand
/*    */     //   249: istore #12
/*    */     //   251: nop
/*    */     //   252: iconst_0
/*    */     //   253: istore #13
/*    */     //   255: aload_2
/*    */     //   256: ldc -1323940314
/*    */     //   258: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */     //   260: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   263: aload_2
/*    */     //   264: iconst_0
/*    */     //   265: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */     //   268: istore #14
/*    */     //   270: aload_2
/*    */     //   271: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   276: astore #15
/*    */     //   278: aload_2
/*    */     //   279: aload #6
/*    */     //   281: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   284: astore #16
/*    */     //   286: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   289: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */     //   292: astore #17
/*    */     //   294: bipush #6
/*    */     //   296: sipush #896
/*    */     //   299: iload #12
/*    */     //   301: bipush #6
/*    */     //   303: ishl
/*    */     //   304: iand
/*    */     //   305: ior
/*    */     //   306: istore #18
/*    */     //   308: nop
/*    */     //   309: iconst_0
/*    */     //   310: istore #19
/*    */     //   312: aload_2
/*    */     //   313: ldc -692256719
/*    */     //   315: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */     //   317: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   320: aload_2
/*    */     //   321: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */     //   326: instanceof androidx/compose/runtime/Applier
/*    */     //   329: ifne -> 335
/*    */     //   332: invokestatic invalidApplier : ()V
/*    */     //   335: aload_2
/*    */     //   336: invokeinterface startReusableNode : ()V
/*    */     //   341: aload_2
/*    */     //   342: invokeinterface getInserting : ()Z
/*    */     //   347: ifeq -> 361
/*    */     //   350: aload_2
/*    */     //   351: aload #17
/*    */     //   353: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   358: goto -> 367
/*    */     //   361: aload_2
/*    */     //   362: invokeinterface useNode : ()V
/*    */     //   367: aload_2
/*    */     //   368: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */     //   371: astore #20
/*    */     //   373: iconst_0
/*    */     //   374: istore #21
/*    */     //   376: aload #20
/*    */     //   378: aload #11
/*    */     //   380: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   383: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */     //   386: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   389: aload #20
/*    */     //   391: aload #15
/*    */     //   393: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   396: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */     //   399: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   402: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   405: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */     //   408: astore #22
/*    */     //   410: iconst_0
/*    */     //   411: istore #23
/*    */     //   413: aload #20
/*    */     //   415: astore #24
/*    */     //   417: iconst_0
/*    */     //   418: istore #25
/*    */     //   420: aload #24
/*    */     //   422: invokeinterface getInserting : ()Z
/*    */     //   427: ifne -> 448
/*    */     //   430: aload #24
/*    */     //   432: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   437: iload #14
/*    */     //   439: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   442: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   445: ifne -> 474
/*    */     //   448: aload #24
/*    */     //   450: iload #14
/*    */     //   452: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   455: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   460: aload #20
/*    */     //   462: iload #14
/*    */     //   464: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   467: aload #22
/*    */     //   469: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   474: nop
/*    */     //   475: nop
/*    */     //   476: nop
/*    */     //   477: aload #20
/*    */     //   479: aload #16
/*    */     //   481: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   484: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */     //   487: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   490: nop
/*    */     //   491: nop
/*    */     //   492: aload_2
/*    */     //   493: bipush #14
/*    */     //   495: iload #18
/*    */     //   497: bipush #6
/*    */     //   499: ishr
/*    */     //   500: iand
/*    */     //   501: istore #26
/*    */     //   503: astore #27
/*    */     //   505: iconst_0
/*    */     //   506: istore #28
/*    */     //   508: aload #27
/*    */     //   510: ldc -384784025
/*    */     //   512: ldc 'C88@4444L9:Column.kt#2w3rfo'
/*    */     //   514: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   517: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*    */     //   520: aload #27
/*    */     //   522: bipush #6
/*    */     //   524: bipush #112
/*    */     //   526: iload #9
/*    */     //   528: bipush #6
/*    */     //   530: ishr
/*    */     //   531: iand
/*    */     //   532: ior
/*    */     //   533: istore #29
/*    */     //   535: astore #30
/*    */     //   537: checkcast androidx/compose/foundation/layout/ColumnScope
/*    */     //   540: astore #31
/*    */     //   542: iconst_0
/*    */     //   543: istore #32
/*    */     //   545: aconst_null
/*    */     //   546: lconst_0
/*    */     //   547: aload #30
/*    */     //   549: iconst_0
/*    */     //   550: iconst_3
/*    */     //   551: invokestatic Title-iJQMabo : (Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)V
/*    */     //   554: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   557: checkcast androidx/compose/ui/Modifier
/*    */     //   560: bipush #30
/*    */     //   562: istore #33
/*    */     //   564: iconst_0
/*    */     //   565: istore #34
/*    */     //   567: iload #33
/*    */     //   569: i2f
/*    */     //   570: invokestatic constructor-impl : (F)F
/*    */     //   573: invokestatic height-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*    */     //   576: astore #33
/*    */     //   578: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*    */     //   581: bipush #16
/*    */     //   583: istore #34
/*    */     //   585: iconst_0
/*    */     //   586: istore #35
/*    */     //   588: iload #34
/*    */     //   590: i2f
/*    */     //   591: invokestatic constructor-impl : (F)F
/*    */     //   594: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*    */     //   597: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*    */     //   600: astore #34
/*    */     //   602: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   605: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*    */     //   608: astore #35
/*    */     //   610: sipush #438
/*    */     //   613: istore #36
/*    */     //   615: nop
/*    */     //   616: iconst_0
/*    */     //   617: istore #37
/*    */     //   619: aload #30
/*    */     //   621: ldc 693286680
/*    */     //   623: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*    */     //   625: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   628: aload #34
/*    */     //   630: aload #35
/*    */     //   632: aload #30
/*    */     //   634: bipush #14
/*    */     //   636: iload #36
/*    */     //   638: iconst_3
/*    */     //   639: ishr
/*    */     //   640: iand
/*    */     //   641: bipush #112
/*    */     //   643: iload #36
/*    */     //   645: iconst_3
/*    */     //   646: ishr
/*    */     //   647: iand
/*    */     //   648: ior
/*    */     //   649: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   652: astore #38
/*    */     //   654: bipush #112
/*    */     //   656: iload #36
/*    */     //   658: iconst_3
/*    */     //   659: ishl
/*    */     //   660: iand
/*    */     //   661: istore #39
/*    */     //   663: nop
/*    */     //   664: iconst_0
/*    */     //   665: istore #40
/*    */     //   667: aload #30
/*    */     //   669: ldc -1323940314
/*    */     //   671: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */     //   673: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   676: aload #30
/*    */     //   678: iconst_0
/*    */     //   679: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */     //   682: istore #41
/*    */     //   684: aload #30
/*    */     //   686: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   691: astore #42
/*    */     //   693: aload #30
/*    */     //   695: aload #33
/*    */     //   697: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   700: astore #43
/*    */     //   702: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   705: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */     //   708: astore #44
/*    */     //   710: bipush #6
/*    */     //   712: sipush #896
/*    */     //   715: iload #39
/*    */     //   717: bipush #6
/*    */     //   719: ishl
/*    */     //   720: iand
/*    */     //   721: ior
/*    */     //   722: istore #45
/*    */     //   724: nop
/*    */     //   725: iconst_0
/*    */     //   726: istore #46
/*    */     //   728: aload #30
/*    */     //   730: ldc -692256719
/*    */     //   732: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */     //   734: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   737: aload #30
/*    */     //   739: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */     //   744: instanceof androidx/compose/runtime/Applier
/*    */     //   747: ifne -> 753
/*    */     //   750: invokestatic invalidApplier : ()V
/*    */     //   753: aload #30
/*    */     //   755: invokeinterface startReusableNode : ()V
/*    */     //   760: aload #30
/*    */     //   762: invokeinterface getInserting : ()Z
/*    */     //   767: ifeq -> 782
/*    */     //   770: aload #30
/*    */     //   772: aload #44
/*    */     //   774: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   779: goto -> 789
/*    */     //   782: aload #30
/*    */     //   784: invokeinterface useNode : ()V
/*    */     //   789: aload #30
/*    */     //   791: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */     //   794: astore #47
/*    */     //   796: iconst_0
/*    */     //   797: istore #48
/*    */     //   799: aload #47
/*    */     //   801: aload #38
/*    */     //   803: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   806: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */     //   809: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   812: aload #47
/*    */     //   814: aload #42
/*    */     //   816: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   819: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */     //   822: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   825: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   828: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */     //   831: astore #49
/*    */     //   833: iconst_0
/*    */     //   834: istore #50
/*    */     //   836: aload #47
/*    */     //   838: astore #51
/*    */     //   840: iconst_0
/*    */     //   841: istore #52
/*    */     //   843: aload #51
/*    */     //   845: invokeinterface getInserting : ()Z
/*    */     //   850: ifne -> 871
/*    */     //   853: aload #51
/*    */     //   855: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   860: iload #41
/*    */     //   862: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   865: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   868: ifne -> 897
/*    */     //   871: aload #51
/*    */     //   873: iload #41
/*    */     //   875: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   878: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   883: aload #47
/*    */     //   885: iload #41
/*    */     //   887: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   890: aload #49
/*    */     //   892: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   897: nop
/*    */     //   898: nop
/*    */     //   899: nop
/*    */     //   900: aload #47
/*    */     //   902: aload #43
/*    */     //   904: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   907: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */     //   910: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   913: nop
/*    */     //   914: nop
/*    */     //   915: aload #30
/*    */     //   917: bipush #14
/*    */     //   919: iload #45
/*    */     //   921: bipush #6
/*    */     //   923: ishr
/*    */     //   924: iand
/*    */     //   925: istore #53
/*    */     //   927: astore #54
/*    */     //   929: iconst_0
/*    */     //   930: istore #55
/*    */     //   932: aload #54
/*    */     //   934: ldc -407840262
/*    */     //   936: ldc 'C101@5126L9:Row.kt#2w3rfo'
/*    */     //   938: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   941: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*    */     //   944: aload #54
/*    */     //   946: bipush #6
/*    */     //   948: bipush #112
/*    */     //   950: iload #36
/*    */     //   952: bipush #6
/*    */     //   954: ishr
/*    */     //   955: iand
/*    */     //   956: ior
/*    */     //   957: istore #56
/*    */     //   959: astore #57
/*    */     //   961: checkcast androidx/compose/foundation/layout/RowScope
/*    */     //   964: astore #58
/*    */     //   966: iconst_0
/*    */     //   967: istore #59
/*    */     //   969: ldc_w 'Login with JetBrains Account'
/*    */     //   972: aconst_null
/*    */     //   973: iconst_0
/*    */     //   974: aload #57
/*    */     //   976: ldc_w -248202224
/*    */     //   979: invokeinterface startReplaceGroup : (I)V
/*    */     //   984: aload #57
/*    */     //   986: astore #60
/*    */     //   988: aload_2
/*    */     //   989: aload_0
/*    */     //   990: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   995: istore #61
/*    */     //   997: iconst_0
/*    */     //   998: istore #62
/*    */     //   1000: aload #60
/*    */     //   1002: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   1007: astore #63
/*    */     //   1009: iconst_0
/*    */     //   1010: istore #64
/*    */     //   1012: iload #61
/*    */     //   1014: ifne -> 1028
/*    */     //   1017: aload #63
/*    */     //   1019: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   1022: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   1025: if_acmpne -> 1074
/*    */     //   1028: istore #65
/*    */     //   1030: astore #66
/*    */     //   1032: astore #67
/*    */     //   1034: iconst_0
/*    */     //   1035: istore #68
/*    */     //   1037: new com/intellij/ml/llm/matterhorn/ej/ui/login/components/JBALoginInitialKt$JBALoginInitial$1$1$1$1
/*    */     //   1040: dup
/*    */     //   1041: aload_0
/*    */     //   1042: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   1045: checkcast kotlin/reflect/KFunction
/*    */     //   1048: astore #69
/*    */     //   1050: aload #67
/*    */     //   1052: aload #66
/*    */     //   1054: iload #65
/*    */     //   1056: aload #69
/*    */     //   1058: astore #70
/*    */     //   1060: aload #60
/*    */     //   1062: aload #70
/*    */     //   1064: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   1069: aload #70
/*    */     //   1071: goto -> 1076
/*    */     //   1074: aload #63
/*    */     //   1076: nop
/*    */     //   1077: nop
/*    */     //   1078: nop
/*    */     //   1079: checkcast kotlin/reflect/KFunction
/*    */     //   1082: astore #71
/*    */     //   1084: aload #57
/*    */     //   1086: invokeinterface endReplaceGroup : ()V
/*    */     //   1091: aload #71
/*    */     //   1093: checkcast kotlin/jvm/functions/Function0
/*    */     //   1096: aconst_null
/*    */     //   1097: aload #57
/*    */     //   1099: bipush #6
/*    */     //   1101: bipush #22
/*    */     //   1103: invokestatic Button : (Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*    */     //   1106: ldc_w 'Register...'
/*    */     //   1109: aload #57
/*    */     //   1111: ldc_w -248200397
/*    */     //   1114: invokeinterface startReplaceGroup : (I)V
/*    */     //   1119: aload #57
/*    */     //   1121: astore #60
/*    */     //   1123: aload_2
/*    */     //   1124: aload_0
/*    */     //   1125: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   1130: istore #61
/*    */     //   1132: iconst_0
/*    */     //   1133: istore #62
/*    */     //   1135: aload #60
/*    */     //   1137: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   1142: astore #63
/*    */     //   1144: iconst_0
/*    */     //   1145: istore #64
/*    */     //   1147: iload #61
/*    */     //   1149: ifne -> 1163
/*    */     //   1152: aload #63
/*    */     //   1154: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   1157: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   1160: if_acmpne -> 1198
/*    */     //   1163: astore #67
/*    */     //   1165: iconst_0
/*    */     //   1166: istore #68
/*    */     //   1168: new com/intellij/ml/llm/matterhorn/ej/ui/login/components/JBALoginInitialKt$JBALoginInitial$1$1$2$1
/*    */     //   1171: dup
/*    */     //   1172: aload_0
/*    */     //   1173: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   1176: checkcast kotlin/reflect/KFunction
/*    */     //   1179: aload #67
/*    */     //   1181: swap
/*    */     //   1182: astore #70
/*    */     //   1184: aload #60
/*    */     //   1186: aload #70
/*    */     //   1188: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   1193: aload #70
/*    */     //   1195: goto -> 1200
/*    */     //   1198: aload #63
/*    */     //   1200: nop
/*    */     //   1201: nop
/*    */     //   1202: nop
/*    */     //   1203: checkcast kotlin/reflect/KFunction
/*    */     //   1206: astore #71
/*    */     //   1208: aload #57
/*    */     //   1210: invokeinterface endReplaceGroup : ()V
/*    */     //   1215: aload #71
/*    */     //   1217: checkcast kotlin/jvm/functions/Function0
/*    */     //   1220: aconst_null
/*    */     //   1221: iconst_0
/*    */     //   1222: aconst_null
/*    */     //   1223: iconst_0
/*    */     //   1224: aconst_null
/*    */     //   1225: aconst_null
/*    */     //   1226: aload #57
/*    */     //   1228: bipush #6
/*    */     //   1230: sipush #252
/*    */     //   1233: invokestatic Link-kye4rC8 : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/runtime/Composer;II)V
/*    */     //   1236: nop
/*    */     //   1237: aload #54
/*    */     //   1239: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1242: aload #30
/*    */     //   1244: invokeinterface endNode : ()V
/*    */     //   1249: aload #30
/*    */     //   1251: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1254: nop
/*    */     //   1255: aload #30
/*    */     //   1257: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1260: nop
/*    */     //   1261: aload #30
/*    */     //   1263: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1266: nop
/*    */     //   1267: aload #30
/*    */     //   1269: ldc_w 1221784672
/*    */     //   1272: invokeinterface startReplaceGroup : (I)V
/*    */     //   1277: aload_1
/*    */     //   1278: ifnull -> 1302
/*    */     //   1281: aconst_null
/*    */     //   1282: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo
/*    */     //   1285: dup
/*    */     //   1286: aload_1
/*    */     //   1287: aconst_null
/*    */     //   1288: aconst_null
/*    */     //   1289: bipush #6
/*    */     //   1291: aconst_null
/*    */     //   1292: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   1295: aload #30
/*    */     //   1297: iconst_0
/*    */     //   1298: iconst_1
/*    */     //   1299: invokestatic ErrorComponent : (Landroidx/compose/ui/Modifier;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo;Landroidx/compose/runtime/Composer;II)V
/*    */     //   1302: aload #30
/*    */     //   1304: invokeinterface endReplaceGroup : ()V
/*    */     //   1309: ldc_w 'Need help?'
/*    */     //   1312: aload #30
/*    */     //   1314: ldc_w 1221788820
/*    */     //   1317: invokeinterface startReplaceGroup : (I)V
/*    */     //   1322: aload #30
/*    */     //   1324: astore #34
/*    */     //   1326: aload_2
/*    */     //   1327: aload_0
/*    */     //   1328: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   1333: istore #35
/*    */     //   1335: iconst_0
/*    */     //   1336: istore #36
/*    */     //   1338: aload #34
/*    */     //   1340: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   1345: astore #37
/*    */     //   1347: iconst_0
/*    */     //   1348: istore #38
/*    */     //   1350: iload #35
/*    */     //   1352: ifne -> 1366
/*    */     //   1355: aload #37
/*    */     //   1357: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   1360: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   1363: if_acmpne -> 1401
/*    */     //   1366: astore #72
/*    */     //   1368: iconst_0
/*    */     //   1369: istore #39
/*    */     //   1371: new com/intellij/ml/llm/matterhorn/ej/ui/login/components/JBALoginInitialKt$JBALoginInitial$1$2$1
/*    */     //   1374: dup
/*    */     //   1375: aload_0
/*    */     //   1376: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   1379: checkcast kotlin/reflect/KFunction
/*    */     //   1382: aload #72
/*    */     //   1384: swap
/*    */     //   1385: astore #40
/*    */     //   1387: aload #34
/*    */     //   1389: aload #40
/*    */     //   1391: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   1396: aload #40
/*    */     //   1398: goto -> 1403
/*    */     //   1401: aload #37
/*    */     //   1403: nop
/*    */     //   1404: nop
/*    */     //   1405: nop
/*    */     //   1406: checkcast kotlin/reflect/KFunction
/*    */     //   1409: astore #33
/*    */     //   1411: aload #30
/*    */     //   1413: invokeinterface endReplaceGroup : ()V
/*    */     //   1418: aload #33
/*    */     //   1420: checkcast kotlin/jvm/functions/Function0
/*    */     //   1423: aconst_null
/*    */     //   1424: iconst_0
/*    */     //   1425: aconst_null
/*    */     //   1426: iconst_0
/*    */     //   1427: aconst_null
/*    */     //   1428: aconst_null
/*    */     //   1429: aload #30
/*    */     //   1431: bipush #6
/*    */     //   1433: sipush #252
/*    */     //   1436: invokestatic Link-kye4rC8 : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/runtime/Composer;II)V
/*    */     //   1439: nop
/*    */     //   1440: aload #27
/*    */     //   1442: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1445: aload_2
/*    */     //   1446: invokeinterface endNode : ()V
/*    */     //   1451: aload_2
/*    */     //   1452: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1455: nop
/*    */     //   1456: aload_2
/*    */     //   1457: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1460: nop
/*    */     //   1461: aload_2
/*    */     //   1462: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1465: nop
/*    */     //   1466: invokestatic isTraceInProgress : ()Z
/*    */     //   1469: ifeq -> 1484
/*    */     //   1472: invokestatic traceEventEnd : ()V
/*    */     //   1475: goto -> 1484
/*    */     //   1478: aload_2
/*    */     //   1479: invokeinterface skipToGroupEnd : ()V
/*    */     //   1484: aload_2
/*    */     //   1485: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   1490: dup
/*    */     //   1491: ifnull -> 1512
/*    */     //   1494: aload_0
/*    */     //   1495: aload_1
/*    */     //   1496: iload_3
/*    */     //   1497: iload #4
/*    */     //   1499: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated;Ljava/lang/String;II)Lkotlin/jvm/functions/Function2;
/*    */     //   1504: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   1509: goto -> 1513
/*    */     //   1512: pop
/*    */     //   1513: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 6
/*    */     //   #22	-> 152
/*    */     //   #23	-> 169
/*    */     //   #42	-> 179
/*    */     //   #23	-> 185
/*    */     //   #21	-> 197
/*    */     //   #43	-> 206
/*    */     //   #44	-> 209
/*    */     //   #47	-> 217
/*    */     //   #48	-> 251
/*    */     //   #49	-> 260
/*    */     //   #50	-> 265
/*    */     //   #51	-> 271
/*    */     //   #52	-> 279
/*    */     //   #54	-> 286
/*    */     //   #53	-> 308
/*    */     //   #55	-> 317
/*    */     //   #56	-> 320
/*    */     //   #57	-> 336
/*    */     //   #58	-> 341
/*    */     //   #59	-> 351
/*    */     //   #61	-> 362
/*    */     //   #63	-> 367
/*    */     //   #64	-> 376
/*    */     //   #65	-> 389
/*    */     //   #67	-> 402
/*    */     //   #68	-> 413
/*    */     //   #69	-> 420
/*    */     //   #70	-> 448
/*    */     //   #71	-> 460
/*    */     //   #73	-> 474
/*    */     //   #68	-> 475
/*    */     //   #73	-> 476
/*    */     //   #74	-> 477
/*    */     //   #75	-> 490
/*    */     //   #63	-> 491
/*    */     //   #76	-> 492
/*    */     //   #77	-> 514
/*    */     //   #25	-> 551
/*    */     //   #27	-> 554
/*    */     //   #78	-> 567
/*    */     //   #27	-> 573
/*    */     //   #28	-> 578
/*    */     //   #79	-> 588
/*    */     //   #28	-> 594
/*    */     //   #29	-> 602
/*    */     //   #26	-> 615
/*    */     //   #80	-> 625
/*    */     //   #81	-> 628
/*    */     //   #82	-> 663
/*    */     //   #83	-> 673
/*    */     //   #84	-> 679
/*    */     //   #85	-> 686
/*    */     //   #86	-> 695
/*    */     //   #88	-> 702
/*    */     //   #87	-> 724
/*    */     //   #89	-> 734
/*    */     //   #90	-> 737
/*    */     //   #91	-> 755
/*    */     //   #92	-> 760
/*    */     //   #93	-> 772
/*    */     //   #95	-> 784
/*    */     //   #97	-> 789
/*    */     //   #98	-> 799
/*    */     //   #99	-> 812
/*    */     //   #101	-> 825
/*    */     //   #102	-> 836
/*    */     //   #103	-> 843
/*    */     //   #104	-> 871
/*    */     //   #105	-> 883
/*    */     //   #107	-> 897
/*    */     //   #102	-> 898
/*    */     //   #107	-> 899
/*    */     //   #108	-> 900
/*    */     //   #109	-> 913
/*    */     //   #97	-> 914
/*    */     //   #110	-> 915
/*    */     //   #111	-> 938
/*    */     //   #31	-> 969
/*    */     //   #112	-> 1000
/*    */     //   #113	-> 1012
/*    */     //   #114	-> 1028
/*    */     //   #31	-> 1037
/*    */     //   #114	-> 1058
/*    */     //   #115	-> 1060
/*    */     //   #116	-> 1069
/*    */     //   #117	-> 1074
/*    */     //   #113	-> 1076
/*    */     //   #112	-> 1077
/*    */     //   #112	-> 1078
/*    */     //   #31	-> 1079
/*    */     //   #32	-> 1106
/*    */     //   #118	-> 1135
/*    */     //   #119	-> 1147
/*    */     //   #120	-> 1163
/*    */     //   #32	-> 1168
/*    */     //   #120	-> 1182
/*    */     //   #121	-> 1184
/*    */     //   #122	-> 1193
/*    */     //   #123	-> 1198
/*    */     //   #119	-> 1200
/*    */     //   #118	-> 1201
/*    */     //   #118	-> 1202
/*    */     //   #32	-> 1203
/*    */     //   #33	-> 1236
/*    */     //   #111	-> 1237
/*    */     //   #110	-> 1242
/*    */     //   #124	-> 1244
/*    */     //   #89	-> 1251
/*    */     //   #125	-> 1254
/*    */     //   #83	-> 1257
/*    */     //   #126	-> 1260
/*    */     //   #80	-> 1263
/*    */     //   #127	-> 1266
/*    */     //   #34	-> 1277
/*    */     //   #35	-> 1282
/*    */     //   #37	-> 1309
/*    */     //   #128	-> 1338
/*    */     //   #129	-> 1350
/*    */     //   #130	-> 1366
/*    */     //   #37	-> 1371
/*    */     //   #130	-> 1385
/*    */     //   #131	-> 1387
/*    */     //   #132	-> 1396
/*    */     //   #133	-> 1401
/*    */     //   #129	-> 1403
/*    */     //   #128	-> 1404
/*    */     //   #128	-> 1405
/*    */     //   #37	-> 1406
/*    */     //   #38	-> 1439
/*    */     //   #77	-> 1440
/*    */     //   #76	-> 1445
/*    */     //   #134	-> 1446
/*    */     //   #55	-> 1452
/*    */     //   #135	-> 1455
/*    */     //   #49	-> 1457
/*    */     //   #136	-> 1460
/*    */     //   #43	-> 1462
/*    */     //   #137	-> 1465
/*    */     //   #39	-> 1478
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   179	6	8	$i$f$getDp	I
/*    */     //   176	9	7	$this$dp$iv	I
/*    */     //   567	6	34	$i$f$getDp	I
/*    */     //   564	9	33	$this$dp$iv	I
/*    */     //   588	6	35	$i$f$getDp	I
/*    */     //   585	9	34	$this$dp$iv	I
/*    */     //   1037	11	68	$i$a$-cache-JBALoginInitialKt$JBALoginInitial$1$1$1	I
/*    */     //   1060	11	70	value$iv	Ljava/lang/Object;
/*    */     //   1012	65	64	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   1009	68	63	it$iv	Ljava/lang/Object;
/*    */     //   1000	79	62	$i$f$cache	I
/*    */     //   997	82	60	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   997	82	61	invalid$iv	Z
/*    */     //   1168	11	68	$i$a$-cache-JBALoginInitialKt$JBALoginInitial$1$1$2	I
/*    */     //   1184	11	70	value$iv	Ljava/lang/Object;
/*    */     //   1147	54	64	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   1144	57	63	it$iv	Ljava/lang/Object;
/*    */     //   1135	68	62	$i$f$cache	I
/*    */     //   1132	71	60	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1132	71	61	invalid$iv	Z
/*    */     //   969	268	59	$i$a$-Row-JBALoginInitialKt$JBALoginInitial$1$1	I
/*    */     //   966	271	58	$this$JBALoginInitial_u24lambda_u244_u24lambda_u242	Landroidx/compose/foundation/layout/RowScope;
/*    */     //   966	271	57	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   966	271	56	$changed	I
/*    */     //   932	310	55	$i$a$-Layout-RowKt$Row$1$iv	I
/*    */     //   929	313	54	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   929	313	53	$changed$iv	I
/*    */     //   843	55	52	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */     //   840	58	51	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   836	64	50	$i$f$set-impl	I
/*    */     //   833	67	49	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */     //   799	115	48	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */     //   796	118	47	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   728	527	46	$i$f$ReusableComposeNode	I
/*    */     //   725	530	44	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */     //   725	530	45	$changed$iv$iv$iv	I
/*    */     //   667	594	40	$i$f$Layout	I
/*    */     //   684	577	41	compositeKeyHash$iv$iv	I
/*    */     //   693	568	42	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   702	559	43	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */     //   664	597	39	$changed$iv$iv	I
/*    */     //   619	648	37	$i$f$Row	I
/*    */     //   654	613	38	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   616	651	33	modifier$iv	Landroidx/compose/ui/Modifier;
/*    */     //   616	651	34	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*    */     //   616	651	35	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*    */     //   616	651	36	$changed$iv	I
/*    */     //   1371	11	39	$i$a$-cache-JBALoginInitialKt$JBALoginInitial$1$2	I
/*    */     //   1387	11	40	value$iv	Ljava/lang/Object;
/*    */     //   1350	54	38	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   1347	57	37	it$iv	Ljava/lang/Object;
/*    */     //   1338	68	36	$i$f$cache	I
/*    */     //   1335	71	34	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1335	71	35	invalid$iv	Z
/*    */     //   545	895	32	$i$a$-Column-JBALoginInitialKt$JBALoginInitial$1	I
/*    */     //   542	898	31	$this$JBALoginInitial_u24lambda_u244	Landroidx/compose/foundation/layout/ColumnScope;
/*    */     //   542	898	30	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   542	898	29	$changed	I
/*    */     //   508	937	28	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*    */     //   505	940	27	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   505	940	26	$changed$iv	I
/*    */     //   420	55	25	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */     //   417	58	24	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   413	64	23	$i$f$set-impl	I
/*    */     //   410	67	22	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */     //   376	115	21	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */     //   373	118	20	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   312	1144	19	$i$f$ReusableComposeNode	I
/*    */     //   309	1147	17	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */     //   309	1147	18	$changed$iv$iv$iv	I
/*    */     //   255	1206	13	$i$f$Layout	I
/*    */     //   270	1191	14	compositeKeyHash$iv$iv	I
/*    */     //   278	1183	15	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   286	1175	16	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */     //   252	1209	12	$changed$iv$iv	I
/*    */     //   201	1265	10	$i$f$Column	I
/*    */     //   242	1224	11	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   198	1268	6	modifier$iv	Landroidx/compose/ui/Modifier;
/*    */     //   198	1268	7	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*    */     //   217	1249	8	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*    */     //   198	1268	9	$changed$iv	I
/*    */     //   18	1496	5	$dirty	I
/*    */     //   0	1514	0	state	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/JbaUnauthenticated;
/*    */     //   0	1514	1	error	Ljava/lang/String;
/*    */     //   0	1514	2	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	1514	3	$changed	I
/*    */   }
/*    */   
/*    */   private static final Unit JBALoginInitial$lambda$5(JbaUnauthenticated $state, String $error, int $$changed, int $$default, Composer $composer, int $force) {
/*    */     JBALoginInitial($state, $error, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\components\JBALoginInitialKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */