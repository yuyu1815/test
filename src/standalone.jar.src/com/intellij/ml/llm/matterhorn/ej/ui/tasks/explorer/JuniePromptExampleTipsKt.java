/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.explorer;
/*     */ 
/*     */ import androidx.compose.animation.AnimatedVisibilityScope;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.snapshots.SnapshotStateMap;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.ExamplePromptChipStyle;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\0004\n\000\n\002\020\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\020\013\032O\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\0032\022\020\005\032\016\022\004\022\0020\007\022\004\022\0020\0010\0062\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\rH\007¢\006\004\b\016\020\017\032)\020\020\032\0020\0012\006\020\021\032\0020\0072\b\b\002\020\n\032\0020\0132\b\b\002\020\022\032\0020\tH\007¢\006\002\020\023¨\006\024²\006\n\020\025\032\0020\026X\002"}, d2 = {"JuniePromptExampleTips", "", "tips", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/Tip;", "onTipClick", "Lkotlin/Function1;", "", "examplePromptChipStyle", "Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipStyle;", "modifier", "Landroidx/compose/ui/Modifier;", "animationDuration", "Lkotlin/time/Duration;", "JuniePromptExampleTips-Zb7fWow", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipStyle;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "JunieExamplePromptChip", "text", "style", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipStyle;Landroidx/compose/runtime/Composer;II)V", "standalone", "isHovering", ""})
/*     */ @SourceDebugExtension({"SMAP\nJuniePromptExampleTips.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JuniePromptExampleTips.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/JuniePromptExampleTipsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,123:1\n1225#2,6:124\n1225#2,6:130\n1225#2,6:179\n1225#2,6:185\n149#3:136\n149#3:137\n86#4:138\n84#4,5:139\n89#4:172\n93#4:178\n79#5,6:144\n86#5,4:159\n90#5,2:169\n94#5:177\n79#5,6:194\n86#5,4:209\n90#5,2:219\n94#5:225\n368#6,9:150\n377#6:171\n378#6,2:175\n368#6,9:200\n377#6:221\n378#6,2:223\n4034#7,6:163\n4034#7,6:213\n1863#8,2:173\n99#9,3:191\n102#9:222\n106#9:226\n81#10:227\n107#10,2:228\n*S KotlinDebug\n*F\n+ 1 JuniePromptExampleTips.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/JuniePromptExampleTipsKt\n*L\n50#1:124,6\n51#1:130,6\n92#1:179,6\n102#1:185,6\n62#1:136\n63#1:137\n58#1:138\n58#1:139,5\n58#1:172\n58#1:178\n58#1:144,6\n58#1:159,4\n58#1:169,2\n58#1:177\n95#1:194,6\n95#1:209,4\n95#1:219,2\n95#1:225\n58#1:150,9\n58#1:171\n58#1:175,2\n95#1:200,9\n95#1:221\n95#1:223,2\n58#1:163,6\n95#1:213,6\n65#1:173,2\n95#1:191,3\n95#1:222\n95#1:226\n92#1:227\n92#1:228,2\n*E\n"})
/*     */ public final class JuniePromptExampleTipsKt {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void JuniePromptExampleTips-Zb7fWow(@NotNull List tips, @NotNull Function1 onTipClick, @Nullable ExamplePromptChipStyle examplePromptChipStyle, @Nullable Modifier modifier, long animationDuration, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'tips'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'onTipClick'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload #6
/*     */     //   14: ldc -396819937
/*     */     //   16: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   21: astore #6
/*     */     //   23: iload #7
/*     */     //   25: istore #9
/*     */     //   27: iload #8
/*     */     //   29: iconst_1
/*     */     //   30: iand
/*     */     //   31: ifeq -> 44
/*     */     //   34: iload #9
/*     */     //   36: bipush #6
/*     */     //   38: ior
/*     */     //   39: istore #9
/*     */     //   41: goto -> 73
/*     */     //   44: iload #7
/*     */     //   46: bipush #6
/*     */     //   48: iand
/*     */     //   49: ifne -> 73
/*     */     //   52: iload #9
/*     */     //   54: aload #6
/*     */     //   56: aload_0
/*     */     //   57: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   62: ifeq -> 69
/*     */     //   65: iconst_4
/*     */     //   66: goto -> 70
/*     */     //   69: iconst_2
/*     */     //   70: ior
/*     */     //   71: istore #9
/*     */     //   73: iload #8
/*     */     //   75: iconst_2
/*     */     //   76: iand
/*     */     //   77: ifeq -> 90
/*     */     //   80: iload #9
/*     */     //   82: bipush #48
/*     */     //   84: ior
/*     */     //   85: istore #9
/*     */     //   87: goto -> 121
/*     */     //   90: iload #7
/*     */     //   92: bipush #48
/*     */     //   94: iand
/*     */     //   95: ifne -> 121
/*     */     //   98: iload #9
/*     */     //   100: aload #6
/*     */     //   102: aload_1
/*     */     //   103: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   108: ifeq -> 116
/*     */     //   111: bipush #32
/*     */     //   113: goto -> 118
/*     */     //   116: bipush #16
/*     */     //   118: ior
/*     */     //   119: istore #9
/*     */     //   121: iload #7
/*     */     //   123: sipush #384
/*     */     //   126: iand
/*     */     //   127: ifne -> 162
/*     */     //   130: iload #9
/*     */     //   132: iload #8
/*     */     //   134: iconst_4
/*     */     //   135: iand
/*     */     //   136: ifne -> 156
/*     */     //   139: aload #6
/*     */     //   141: aload_2
/*     */     //   142: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   147: ifeq -> 156
/*     */     //   150: sipush #256
/*     */     //   153: goto -> 159
/*     */     //   156: sipush #128
/*     */     //   159: ior
/*     */     //   160: istore #9
/*     */     //   162: iload #8
/*     */     //   164: bipush #8
/*     */     //   166: iand
/*     */     //   167: ifeq -> 181
/*     */     //   170: iload #9
/*     */     //   172: sipush #3072
/*     */     //   175: ior
/*     */     //   176: istore #9
/*     */     //   178: goto -> 215
/*     */     //   181: iload #7
/*     */     //   183: sipush #3072
/*     */     //   186: iand
/*     */     //   187: ifne -> 215
/*     */     //   190: iload #9
/*     */     //   192: aload #6
/*     */     //   194: aload_3
/*     */     //   195: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   200: ifeq -> 209
/*     */     //   203: sipush #2048
/*     */     //   206: goto -> 212
/*     */     //   209: sipush #1024
/*     */     //   212: ior
/*     */     //   213: istore #9
/*     */     //   215: iload #7
/*     */     //   217: sipush #24576
/*     */     //   220: iand
/*     */     //   221: ifne -> 258
/*     */     //   224: iload #9
/*     */     //   226: iload #8
/*     */     //   228: bipush #16
/*     */     //   230: iand
/*     */     //   231: ifne -> 252
/*     */     //   234: aload #6
/*     */     //   236: lload #4
/*     */     //   238: invokeinterface changed : (J)Z
/*     */     //   243: ifeq -> 252
/*     */     //   246: sipush #16384
/*     */     //   249: goto -> 255
/*     */     //   252: sipush #8192
/*     */     //   255: ior
/*     */     //   256: istore #9
/*     */     //   258: iload #9
/*     */     //   260: sipush #9363
/*     */     //   263: iand
/*     */     //   264: sipush #9362
/*     */     //   267: if_icmpne -> 280
/*     */     //   270: aload #6
/*     */     //   272: invokeinterface getSkipping : ()Z
/*     */     //   277: ifne -> 1315
/*     */     //   280: aload #6
/*     */     //   282: invokeinterface startDefaults : ()V
/*     */     //   287: iload #7
/*     */     //   289: iconst_1
/*     */     //   290: iand
/*     */     //   291: ifeq -> 304
/*     */     //   294: aload #6
/*     */     //   296: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   301: ifeq -> 378
/*     */     //   304: iload #8
/*     */     //   306: iconst_4
/*     */     //   307: iand
/*     */     //   308: ifeq -> 330
/*     */     //   311: getstatic com/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipStyle.Companion : Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipStyle$Companion;
/*     */     //   314: aload #6
/*     */     //   316: bipush #6
/*     */     //   318: invokevirtual getCurrent : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipStyle;
/*     */     //   321: astore_2
/*     */     //   322: iload #9
/*     */     //   324: sipush #-897
/*     */     //   327: iand
/*     */     //   328: istore #9
/*     */     //   330: iload #8
/*     */     //   332: bipush #8
/*     */     //   334: iand
/*     */     //   335: ifeq -> 345
/*     */     //   338: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   341: checkcast androidx/compose/ui/Modifier
/*     */     //   344: astore_3
/*     */     //   345: iload #8
/*     */     //   347: bipush #16
/*     */     //   349: iand
/*     */     //   350: ifeq -> 415
/*     */     //   353: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
/*     */     //   356: pop
/*     */     //   357: sipush #150
/*     */     //   360: getstatic kotlin/time/DurationUnit.MILLISECONDS : Lkotlin/time/DurationUnit;
/*     */     //   363: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
/*     */     //   366: lstore #4
/*     */     //   368: iload #9
/*     */     //   370: ldc -57345
/*     */     //   372: iand
/*     */     //   373: istore #9
/*     */     //   375: goto -> 415
/*     */     //   378: aload #6
/*     */     //   380: invokeinterface skipToGroupEnd : ()V
/*     */     //   385: iload #8
/*     */     //   387: iconst_4
/*     */     //   388: iand
/*     */     //   389: ifeq -> 400
/*     */     //   392: iload #9
/*     */     //   394: sipush #-897
/*     */     //   397: iand
/*     */     //   398: istore #9
/*     */     //   400: iload #8
/*     */     //   402: bipush #16
/*     */     //   404: iand
/*     */     //   405: ifeq -> 415
/*     */     //   408: iload #9
/*     */     //   410: ldc -57345
/*     */     //   412: iand
/*     */     //   413: istore #9
/*     */     //   415: aload #6
/*     */     //   417: invokeinterface endDefaults : ()V
/*     */     //   422: invokestatic isTraceInProgress : ()Z
/*     */     //   425: ifeq -> 438
/*     */     //   428: ldc -396819937
/*     */     //   430: iload #9
/*     */     //   432: iconst_m1
/*     */     //   433: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.explorer.JuniePromptExampleTips (JuniePromptExampleTips.kt:48)'
/*     */     //   435: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   438: aload #6
/*     */     //   440: ldc 1943375743
/*     */     //   442: invokeinterface startReplaceGroup : (I)V
/*     */     //   447: aload #6
/*     */     //   449: astore #12
/*     */     //   451: aload #6
/*     */     //   453: aload_0
/*     */     //   454: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   459: istore #13
/*     */     //   461: iconst_0
/*     */     //   462: istore #14
/*     */     //   464: aload #12
/*     */     //   466: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   471: astore #15
/*     */     //   473: iconst_0
/*     */     //   474: istore #16
/*     */     //   476: iload #13
/*     */     //   478: ifne -> 492
/*     */     //   481: aload #15
/*     */     //   483: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   486: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   489: if_acmpne -> 514
/*     */     //   492: iconst_0
/*     */     //   493: istore #17
/*     */     //   495: invokestatic mutableStateMapOf : ()Landroidx/compose/runtime/snapshots/SnapshotStateMap;
/*     */     //   498: astore #17
/*     */     //   500: aload #12
/*     */     //   502: aload #17
/*     */     //   504: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   509: aload #17
/*     */     //   511: goto -> 516
/*     */     //   514: aload #15
/*     */     //   516: nop
/*     */     //   517: nop
/*     */     //   518: nop
/*     */     //   519: checkcast androidx/compose/runtime/snapshots/SnapshotStateMap
/*     */     //   522: astore #11
/*     */     //   524: aload #6
/*     */     //   526: invokeinterface endReplaceGroup : ()V
/*     */     //   531: aload #11
/*     */     //   533: astore #10
/*     */     //   535: aload_0
/*     */     //   536: aload #6
/*     */     //   538: ldc 1943377826
/*     */     //   540: invokeinterface startReplaceGroup : (I)V
/*     */     //   545: aload #6
/*     */     //   547: astore #12
/*     */     //   549: aload #6
/*     */     //   551: aload_0
/*     */     //   552: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   557: iload #9
/*     */     //   559: ldc 57344
/*     */     //   561: iand
/*     */     //   562: sipush #24576
/*     */     //   565: ixor
/*     */     //   566: sipush #16384
/*     */     //   569: if_icmple -> 584
/*     */     //   572: aload #6
/*     */     //   574: lload #4
/*     */     //   576: invokeinterface changed : (J)Z
/*     */     //   581: ifne -> 596
/*     */     //   584: iload #9
/*     */     //   586: sipush #24576
/*     */     //   589: iand
/*     */     //   590: sipush #16384
/*     */     //   593: if_icmpne -> 600
/*     */     //   596: iconst_1
/*     */     //   597: goto -> 601
/*     */     //   600: iconst_0
/*     */     //   601: ior
/*     */     //   602: aload #6
/*     */     //   604: aload #10
/*     */     //   606: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   611: ior
/*     */     //   612: istore #13
/*     */     //   614: iconst_0
/*     */     //   615: istore #14
/*     */     //   617: aload #12
/*     */     //   619: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   624: astore #15
/*     */     //   626: iconst_0
/*     */     //   627: istore #16
/*     */     //   629: iload #13
/*     */     //   631: ifne -> 645
/*     */     //   634: aload #15
/*     */     //   636: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   639: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   642: if_acmpne -> 685
/*     */     //   645: astore #44
/*     */     //   647: iconst_0
/*     */     //   648: istore #17
/*     */     //   650: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/JuniePromptExampleTipsKt$JuniePromptExampleTips$1$1
/*     */     //   653: dup
/*     */     //   654: aload_0
/*     */     //   655: lload #4
/*     */     //   657: aload #10
/*     */     //   659: aconst_null
/*     */     //   660: invokespecial <init> : (Ljava/util/List;JLandroidx/compose/runtime/snapshots/SnapshotStateMap;Lkotlin/coroutines/Continuation;)V
/*     */     //   663: checkcast kotlin/jvm/functions/Function2
/*     */     //   666: aload #44
/*     */     //   668: swap
/*     */     //   669: astore #18
/*     */     //   671: aload #12
/*     */     //   673: aload #18
/*     */     //   675: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   680: aload #18
/*     */     //   682: goto -> 687
/*     */     //   685: aload #15
/*     */     //   687: nop
/*     */     //   688: nop
/*     */     //   689: nop
/*     */     //   690: checkcast kotlin/jvm/functions/Function2
/*     */     //   693: astore #11
/*     */     //   695: aload #6
/*     */     //   697: invokeinterface endReplaceGroup : ()V
/*     */     //   702: aload #11
/*     */     //   704: aload #6
/*     */     //   706: bipush #14
/*     */     //   708: iload #9
/*     */     //   710: iand
/*     */     //   711: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   714: aload_3
/*     */     //   715: fconst_0
/*     */     //   716: iconst_1
/*     */     //   717: aconst_null
/*     */     //   718: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   721: fconst_0
/*     */     //   722: iconst_4
/*     */     //   723: istore #11
/*     */     //   725: iconst_0
/*     */     //   726: istore #12
/*     */     //   728: iload #11
/*     */     //   730: i2f
/*     */     //   731: invokestatic constructor-impl : (F)F
/*     */     //   734: iconst_1
/*     */     //   735: aconst_null
/*     */     //   736: invokestatic padding-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   739: astore #11
/*     */     //   741: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   744: iconst_4
/*     */     //   745: istore #12
/*     */     //   747: iconst_0
/*     */     //   748: istore #13
/*     */     //   750: iload #12
/*     */     //   752: i2f
/*     */     //   753: invokestatic constructor-impl : (F)F
/*     */     //   756: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   759: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
/*     */     //   762: astore #12
/*     */     //   764: bipush #48
/*     */     //   766: istore #14
/*     */     //   768: nop
/*     */     //   769: iconst_0
/*     */     //   770: istore #15
/*     */     //   772: aload #6
/*     */     //   774: ldc -483455358
/*     */     //   776: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   778: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   781: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   784: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   787: astore #13
/*     */     //   789: aload #12
/*     */     //   791: aload #13
/*     */     //   793: aload #6
/*     */     //   795: bipush #14
/*     */     //   797: iload #14
/*     */     //   799: iconst_3
/*     */     //   800: ishr
/*     */     //   801: iand
/*     */     //   802: bipush #112
/*     */     //   804: iload #14
/*     */     //   806: iconst_3
/*     */     //   807: ishr
/*     */     //   808: iand
/*     */     //   809: ior
/*     */     //   810: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   813: astore #16
/*     */     //   815: bipush #112
/*     */     //   817: iload #14
/*     */     //   819: iconst_3
/*     */     //   820: ishl
/*     */     //   821: iand
/*     */     //   822: istore #17
/*     */     //   824: nop
/*     */     //   825: iconst_0
/*     */     //   826: istore #18
/*     */     //   828: aload #6
/*     */     //   830: ldc -1323940314
/*     */     //   832: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   834: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   837: aload #6
/*     */     //   839: iconst_0
/*     */     //   840: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   843: istore #19
/*     */     //   845: aload #6
/*     */     //   847: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   852: astore #20
/*     */     //   854: aload #6
/*     */     //   856: aload #11
/*     */     //   858: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   861: astore #21
/*     */     //   863: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   866: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   869: astore #22
/*     */     //   871: bipush #6
/*     */     //   873: sipush #896
/*     */     //   876: iload #17
/*     */     //   878: bipush #6
/*     */     //   880: ishl
/*     */     //   881: iand
/*     */     //   882: ior
/*     */     //   883: istore #23
/*     */     //   885: nop
/*     */     //   886: iconst_0
/*     */     //   887: istore #24
/*     */     //   889: aload #6
/*     */     //   891: ldc -692256719
/*     */     //   893: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   895: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   898: aload #6
/*     */     //   900: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   905: instanceof androidx/compose/runtime/Applier
/*     */     //   908: ifne -> 914
/*     */     //   911: invokestatic invalidApplier : ()V
/*     */     //   914: aload #6
/*     */     //   916: invokeinterface startReusableNode : ()V
/*     */     //   921: aload #6
/*     */     //   923: invokeinterface getInserting : ()Z
/*     */     //   928: ifeq -> 943
/*     */     //   931: aload #6
/*     */     //   933: aload #22
/*     */     //   935: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   940: goto -> 950
/*     */     //   943: aload #6
/*     */     //   945: invokeinterface useNode : ()V
/*     */     //   950: aload #6
/*     */     //   952: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   955: astore #25
/*     */     //   957: iconst_0
/*     */     //   958: istore #26
/*     */     //   960: aload #25
/*     */     //   962: aload #16
/*     */     //   964: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   967: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   970: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   973: aload #25
/*     */     //   975: aload #20
/*     */     //   977: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   980: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   983: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   986: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   989: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   992: astore #27
/*     */     //   994: iconst_0
/*     */     //   995: istore #28
/*     */     //   997: aload #25
/*     */     //   999: astore #29
/*     */     //   1001: iconst_0
/*     */     //   1002: istore #30
/*     */     //   1004: aload #29
/*     */     //   1006: invokeinterface getInserting : ()Z
/*     */     //   1011: ifne -> 1032
/*     */     //   1014: aload #29
/*     */     //   1016: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1021: iload #19
/*     */     //   1023: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1026: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1029: ifne -> 1058
/*     */     //   1032: aload #29
/*     */     //   1034: iload #19
/*     */     //   1036: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1039: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1044: aload #25
/*     */     //   1046: iload #19
/*     */     //   1048: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1051: aload #27
/*     */     //   1053: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1058: nop
/*     */     //   1059: nop
/*     */     //   1060: nop
/*     */     //   1061: aload #25
/*     */     //   1063: aload #21
/*     */     //   1065: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1068: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1071: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1074: nop
/*     */     //   1075: nop
/*     */     //   1076: aload #6
/*     */     //   1078: bipush #14
/*     */     //   1080: iload #23
/*     */     //   1082: bipush #6
/*     */     //   1084: ishr
/*     */     //   1085: iand
/*     */     //   1086: istore #31
/*     */     //   1088: astore #32
/*     */     //   1090: iconst_0
/*     */     //   1091: istore #33
/*     */     //   1093: aload #32
/*     */     //   1095: ldc_w -384784025
/*     */     //   1098: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   1101: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1104: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   1107: aload #32
/*     */     //   1109: bipush #6
/*     */     //   1111: bipush #112
/*     */     //   1113: iload #14
/*     */     //   1115: bipush #6
/*     */     //   1117: ishr
/*     */     //   1118: iand
/*     */     //   1119: ior
/*     */     //   1120: istore #34
/*     */     //   1122: astore #35
/*     */     //   1124: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   1127: astore #36
/*     */     //   1129: iconst_0
/*     */     //   1130: istore #37
/*     */     //   1132: aload #35
/*     */     //   1134: ldc_w -575155206
/*     */     //   1137: invokeinterface startReplaceGroup : (I)V
/*     */     //   1142: aload_0
/*     */     //   1143: checkcast java/lang/Iterable
/*     */     //   1146: astore #38
/*     */     //   1148: iconst_0
/*     */     //   1149: istore #39
/*     */     //   1151: aload #38
/*     */     //   1153: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   1158: astore #40
/*     */     //   1160: aload #40
/*     */     //   1162: invokeinterface hasNext : ()Z
/*     */     //   1167: ifeq -> 1264
/*     */     //   1170: aload #40
/*     */     //   1172: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   1177: astore #41
/*     */     //   1179: aload #41
/*     */     //   1181: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/Tip
/*     */     //   1184: astore #42
/*     */     //   1186: iconst_0
/*     */     //   1187: istore #43
/*     */     //   1189: aload #36
/*     */     //   1191: aload #10
/*     */     //   1193: aload #42
/*     */     //   1195: invokevirtual getPrompt : ()Ljava/lang/String;
/*     */     //   1198: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1201: iconst_1
/*     */     //   1202: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   1205: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1208: aconst_null
/*     */     //   1209: aconst_null
/*     */     //   1210: fconst_0
/*     */     //   1211: iconst_3
/*     */     //   1212: aconst_null
/*     */     //   1213: invokestatic fadeIn$default : (Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;
/*     */     //   1216: aconst_null
/*     */     //   1217: aconst_null
/*     */     //   1218: ldc_w 28645453
/*     */     //   1221: iconst_1
/*     */     //   1222: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/JuniePromptExampleTipsKt$JuniePromptExampleTips$2$1$1
/*     */     //   1225: dup
/*     */     //   1226: aload #42
/*     */     //   1228: aload_1
/*     */     //   1229: aload_2
/*     */     //   1230: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/Tip;Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipStyle;)V
/*     */     //   1233: aload #35
/*     */     //   1235: bipush #54
/*     */     //   1237: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1240: checkcast kotlin/jvm/functions/Function3
/*     */     //   1243: aload #35
/*     */     //   1245: ldc_w 1575936
/*     */     //   1248: bipush #14
/*     */     //   1250: iload #34
/*     */     //   1252: iand
/*     */     //   1253: ior
/*     */     //   1254: bipush #26
/*     */     //   1256: invokestatic AnimatedVisibility : (Landroidx/compose/foundation/layout/ColumnScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1259: nop
/*     */     //   1260: nop
/*     */     //   1261: goto -> 1160
/*     */     //   1264: nop
/*     */     //   1265: aload #35
/*     */     //   1267: invokeinterface endReplaceGroup : ()V
/*     */     //   1272: nop
/*     */     //   1273: aload #32
/*     */     //   1275: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1278: aload #6
/*     */     //   1280: invokeinterface endNode : ()V
/*     */     //   1285: aload #6
/*     */     //   1287: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1290: nop
/*     */     //   1291: aload #6
/*     */     //   1293: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1296: nop
/*     */     //   1297: aload #6
/*     */     //   1299: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1302: nop
/*     */     //   1303: invokestatic isTraceInProgress : ()Z
/*     */     //   1306: ifeq -> 1322
/*     */     //   1309: invokestatic traceEventEnd : ()V
/*     */     //   1312: goto -> 1322
/*     */     //   1315: aload #6
/*     */     //   1317: invokeinterface skipToGroupEnd : ()V
/*     */     //   1322: aload #6
/*     */     //   1324: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1329: dup
/*     */     //   1330: ifnull -> 1356
/*     */     //   1333: aload_0
/*     */     //   1334: aload_1
/*     */     //   1335: aload_2
/*     */     //   1336: aload_3
/*     */     //   1337: lload #4
/*     */     //   1339: iload #7
/*     */     //   1341: iload #8
/*     */     //   1343: <illegal opcode> invoke : (Ljava/util/List;Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipStyle;Landroidx/compose/ui/Modifier;JII)Lkotlin/jvm/functions/Function2;
/*     */     //   1348: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1353: goto -> 1357
/*     */     //   1356: pop
/*     */     //   1357: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #49	-> 12
/*     */     //   #46	-> 311
/*     */     //   #47	-> 338
/*     */     //   #48	-> 353
/*     */     //   #49	-> 435
/*     */     //   #50	-> 453
/*     */     //   #124	-> 464
/*     */     //   #125	-> 476
/*     */     //   #126	-> 492
/*     */     //   #50	-> 495
/*     */     //   #126	-> 498
/*     */     //   #127	-> 500
/*     */     //   #128	-> 509
/*     */     //   #129	-> 514
/*     */     //   #125	-> 516
/*     */     //   #124	-> 517
/*     */     //   #124	-> 518
/*     */     //   #50	-> 519
/*     */     //   #51	-> 535
/*     */     //   #130	-> 617
/*     */     //   #131	-> 629
/*     */     //   #132	-> 645
/*     */     //   #51	-> 650
/*     */     //   #132	-> 669
/*     */     //   #133	-> 671
/*     */     //   #134	-> 680
/*     */     //   #135	-> 685
/*     */     //   #131	-> 687
/*     */     //   #130	-> 688
/*     */     //   #130	-> 689
/*     */     //   #51	-> 690
/*     */     //   #60	-> 714
/*     */     //   #61	-> 715
/*     */     //   #62	-> 721
/*     */     //   #136	-> 728
/*     */     //   #62	-> 734
/*     */     //   #63	-> 741
/*     */     //   #137	-> 750
/*     */     //   #63	-> 756
/*     */     //   #58	-> 768
/*     */     //   #138	-> 778
/*     */     //   #139	-> 781
/*     */     //   #142	-> 789
/*     */     //   #143	-> 824
/*     */     //   #144	-> 834
/*     */     //   #145	-> 840
/*     */     //   #146	-> 847
/*     */     //   #147	-> 856
/*     */     //   #149	-> 863
/*     */     //   #148	-> 885
/*     */     //   #150	-> 895
/*     */     //   #151	-> 898
/*     */     //   #152	-> 916
/*     */     //   #153	-> 921
/*     */     //   #154	-> 933
/*     */     //   #156	-> 945
/*     */     //   #158	-> 950
/*     */     //   #159	-> 960
/*     */     //   #160	-> 973
/*     */     //   #162	-> 986
/*     */     //   #163	-> 997
/*     */     //   #164	-> 1004
/*     */     //   #165	-> 1032
/*     */     //   #166	-> 1044
/*     */     //   #168	-> 1058
/*     */     //   #163	-> 1059
/*     */     //   #168	-> 1060
/*     */     //   #169	-> 1061
/*     */     //   #170	-> 1074
/*     */     //   #158	-> 1075
/*     */     //   #171	-> 1076
/*     */     //   #172	-> 1101
/*     */     //   #65	-> 1142
/*     */     //   #173	-> 1151
/*     */     //   #66	-> 1189
/*     */     //   #67	-> 1191
/*     */     //   #68	-> 1209
/*     */     //   #69	-> 1218
/*     */     //   #66	-> 1256
/*     */     //   #82	-> 1259
/*     */     //   #173	-> 1260
/*     */     //   #174	-> 1264
/*     */     //   #83	-> 1272
/*     */     //   #172	-> 1273
/*     */     //   #171	-> 1278
/*     */     //   #175	-> 1280
/*     */     //   #150	-> 1287
/*     */     //   #176	-> 1290
/*     */     //   #144	-> 1293
/*     */     //   #177	-> 1296
/*     */     //   #138	-> 1299
/*     */     //   #178	-> 1302
/*     */     //   #84	-> 1315
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   495	3	17	$i$a$-cache-JuniePromptExampleTipsKt$JuniePromptExampleTips$visibilityMap$1	I
/*     */     //   500	11	17	value$iv	Ljava/lang/Object;
/*     */     //   476	41	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   473	44	15	it$iv	Ljava/lang/Object;
/*     */     //   464	55	14	$i$f$cache	I
/*     */     //   461	58	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   461	58	13	invalid$iv	Z
/*     */     //   650	16	17	$i$a$-cache-JuniePromptExampleTipsKt$JuniePromptExampleTips$1	I
/*     */     //   671	11	18	value$iv	Ljava/lang/Object;
/*     */     //   629	59	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   626	62	15	it$iv	Ljava/lang/Object;
/*     */     //   617	73	14	$i$f$cache	I
/*     */     //   614	76	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   614	76	13	invalid$iv	Z
/*     */     //   728	6	12	$i$f$getDp	I
/*     */     //   725	9	11	$this$dp$iv	I
/*     */     //   750	6	13	$i$f$getDp	I
/*     */     //   747	9	12	$this$dp$iv	I
/*     */     //   1189	71	43	$i$a$-forEach-JuniePromptExampleTipsKt$JuniePromptExampleTips$2$1	I
/*     */     //   1186	74	42	tip	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/Tip;
/*     */     //   1179	82	41	element$iv	Ljava/lang/Object;
/*     */     //   1151	114	39	$i$f$forEach	I
/*     */     //   1148	117	38	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   1132	141	37	$i$a$-Column-JuniePromptExampleTipsKt$JuniePromptExampleTips$2	I
/*     */     //   1129	144	36	$this$JuniePromptExampleTips_Zb7fWow_u24lambda_u243	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   1129	144	35	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1129	144	34	$changed	I
/*     */     //   1093	185	33	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   1090	188	32	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1090	188	31	$changed$iv	I
/*     */     //   1004	55	30	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1001	58	29	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   997	64	28	$i$f$set-impl	I
/*     */     //   994	67	27	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   960	115	26	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   957	118	25	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   889	402	24	$i$f$ReusableComposeNode	I
/*     */     //   886	405	22	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   886	405	23	$changed$iv$iv$iv	I
/*     */     //   828	469	18	$i$f$Layout	I
/*     */     //   845	452	19	compositeKeyHash$iv$iv	I
/*     */     //   854	443	20	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   863	434	21	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   825	472	17	$changed$iv$iv	I
/*     */     //   772	531	15	$i$f$Column	I
/*     */     //   815	488	16	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   769	534	11	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   769	534	12	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   789	514	13	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   769	534	14	$changed$iv	I
/*     */     //   535	777	10	visibilityMap	Landroidx/compose/runtime/snapshots/SnapshotStateMap;
/*     */     //   27	1331	9	$dirty	I
/*     */     //   0	1358	0	tips	Ljava/util/List;
/*     */     //   0	1358	1	onTipClick	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1358	2	examplePromptChipStyle	Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipStyle;
/*     */     //   0	1358	3	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1358	4	animationDuration	J
/*     */     //   0	1358	6	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1358	7	$changed	I
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JuniePromptExampleTips.kt", l = {53}, i = {0, 0}, s = {"L$2", "I$0"}, n = {"tip", "index$iv"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.explorer.JuniePromptExampleTipsKt$JuniePromptExampleTips$1$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   @SourceDebugExtension({"SMAP\nJuniePromptExampleTips.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JuniePromptExampleTips.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/JuniePromptExampleTipsKt$JuniePromptExampleTips$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n1872#2,3:124\n*S KotlinDebug\n*F\n+ 1 JuniePromptExampleTips.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/JuniePromptExampleTipsKt$JuniePromptExampleTips$1$1\n*L\n52#1:124,3\n*E\n"})
/*     */   static final class JuniePromptExampleTipsKt$JuniePromptExampleTips$1$1
/*     */     extends SuspendLambda
/*     */     implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     long J$0;
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int I$0;
/*     */     int label;
/*     */     
/*     */     JuniePromptExampleTipsKt$JuniePromptExampleTips$1$1(List<Tip> $tips, long $animationDuration, SnapshotStateMap<String, Boolean> $visibilityMap, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #14
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 249, 0 -> 32, 1 -> 170
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield $tips : Ljava/util/List;
/*     */       //   40: checkcast java/lang/Iterable
/*     */       //   43: astore_2
/*     */       //   44: aload_0
/*     */       //   45: getfield $animationDuration : J
/*     */       //   48: lstore_3
/*     */       //   49: aload_0
/*     */       //   50: getfield $visibilityMap : Landroidx/compose/runtime/snapshots/SnapshotStateMap;
/*     */       //   53: astore #5
/*     */       //   55: iconst_0
/*     */       //   56: istore #6
/*     */       //   58: iconst_0
/*     */       //   59: istore #7
/*     */       //   61: aload_2
/*     */       //   62: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   67: astore #8
/*     */       //   69: aload #8
/*     */       //   71: invokeinterface hasNext : ()Z
/*     */       //   76: ifeq -> 244
/*     */       //   79: aload #8
/*     */       //   81: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   86: astore #9
/*     */       //   88: iload #7
/*     */       //   90: iinc #7, 1
/*     */       //   93: istore #10
/*     */       //   95: iload #10
/*     */       //   97: ifge -> 103
/*     */       //   100: invokestatic throwIndexOverflow : ()V
/*     */       //   103: iload #10
/*     */       //   105: aload #9
/*     */       //   107: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/Tip
/*     */       //   110: astore #11
/*     */       //   112: istore #12
/*     */       //   114: iconst_0
/*     */       //   115: istore #13
/*     */       //   117: iload #12
/*     */       //   119: ifeq -> 220
/*     */       //   122: lload_3
/*     */       //   123: aload_0
/*     */       //   124: aload_0
/*     */       //   125: aload #5
/*     */       //   127: putfield L$0 : Ljava/lang/Object;
/*     */       //   130: aload_0
/*     */       //   131: aload #8
/*     */       //   133: putfield L$1 : Ljava/lang/Object;
/*     */       //   136: aload_0
/*     */       //   137: aload #11
/*     */       //   139: putfield L$2 : Ljava/lang/Object;
/*     */       //   142: aload_0
/*     */       //   143: lload_3
/*     */       //   144: putfield J$0 : J
/*     */       //   147: aload_0
/*     */       //   148: iload #7
/*     */       //   150: putfield I$0 : I
/*     */       //   153: aload_0
/*     */       //   154: iconst_1
/*     */       //   155: putfield label : I
/*     */       //   158: invokestatic delay-VtjQ1oo : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   161: dup
/*     */       //   162: aload #14
/*     */       //   164: if_acmpne -> 219
/*     */       //   167: aload #14
/*     */       //   169: areturn
/*     */       //   170: iconst_0
/*     */       //   171: istore #6
/*     */       //   173: iconst_0
/*     */       //   174: istore #13
/*     */       //   176: aload_0
/*     */       //   177: getfield I$0 : I
/*     */       //   180: istore #7
/*     */       //   182: aload_0
/*     */       //   183: getfield J$0 : J
/*     */       //   186: lstore_3
/*     */       //   187: aload_0
/*     */       //   188: getfield L$2 : Ljava/lang/Object;
/*     */       //   191: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/Tip
/*     */       //   194: astore #11
/*     */       //   196: aload_0
/*     */       //   197: getfield L$1 : Ljava/lang/Object;
/*     */       //   200: checkcast java/util/Iterator
/*     */       //   203: astore #8
/*     */       //   205: aload_0
/*     */       //   206: getfield L$0 : Ljava/lang/Object;
/*     */       //   209: checkcast androidx/compose/runtime/snapshots/SnapshotStateMap
/*     */       //   212: astore #5
/*     */       //   214: aload_1
/*     */       //   215: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   218: aload_1
/*     */       //   219: pop
/*     */       //   220: aload #5
/*     */       //   222: checkcast java/util/Map
/*     */       //   225: aload #11
/*     */       //   227: invokevirtual getPrompt : ()Ljava/lang/String;
/*     */       //   230: iconst_1
/*     */       //   231: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */       //   234: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   239: pop
/*     */       //   240: nop
/*     */       //   241: goto -> 69
/*     */       //   244: nop
/*     */       //   245: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   248: areturn
/*     */       //   249: new java/lang/IllegalStateException
/*     */       //   252: dup
/*     */       //   253: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   255: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   258: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #51	-> 3
/*     */       //   #52	-> 36
/*     */       //   #124	-> 58
/*     */       //   #125	-> 61
/*     */       //   #125	-> 105
/*     */       //   #53	-> 117
/*     */       //   #51	-> 167
/*     */       //   #54	-> 219
/*     */       //   #55	-> 240
/*     */       //   #125	-> 241
/*     */       //   #126	-> 244
/*     */       //   #56	-> 245
/*     */       //   #51	-> 249
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   55	14	2	$this$forEachIndexed$iv	Ljava/lang/Iterable;
/*     */       //   61	42	7	index$iv	I
/*     */       //   103	67	7	index$iv	I
/*     */       //   182	63	7	index$iv	I
/*     */       //   88	15	9	item$iv	Ljava/lang/Object;
/*     */       //   103	11	9	item$iv	Ljava/lang/Object;
/*     */       //   114	56	11	tip	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/Tip;
/*     */       //   196	45	11	tip	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/Tip;
/*     */       //   114	47	12	index	I
/*     */       //   117	53	13	$i$a$-forEachIndexed-JuniePromptExampleTipsKt$JuniePromptExampleTips$1$1$1	I
/*     */       //   58	112	6	$i$f$forEachIndexed	I
/*     */       //   0	259	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/JuniePromptExampleTipsKt$JuniePromptExampleTips$1$1;
/*     */       //   36	213	1	$result	Ljava/lang/Object;
/*     */       //   176	65	13	$i$a$-forEachIndexed-JuniePromptExampleTipsKt$JuniePromptExampleTips$1$1$1	I
/*     */       //   173	72	6	$i$f$forEachIndexed	I
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super JuniePromptExampleTipsKt$JuniePromptExampleTips$1$1> $completion) {
/*     */       return (Continuation<Unit>)new JuniePromptExampleTipsKt$JuniePromptExampleTips$1$1(this.$tips, this.$animationDuration, this.$visibilityMap, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((JuniePromptExampleTipsKt$JuniePromptExampleTips$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nJuniePromptExampleTips.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JuniePromptExampleTips.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/JuniePromptExampleTipsKt$JuniePromptExampleTips$2$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,123:1\n1225#2,6:124\n1225#2,6:130\n*S KotlinDebug\n*F\n+ 1 JuniePromptExampleTips.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/JuniePromptExampleTipsKt$JuniePromptExampleTips$2$1$1\n*L\n75#1:124,6\n77#1:130,6\n*E\n"})
/*     */   static final class JuniePromptExampleTipsKt$JuniePromptExampleTips$2$1$1 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(AnimatedVisibilityScope $this$AnimatedVisibility, Composer $composer, int $changed) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc '$this$AnimatedVisibility'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: invokestatic isTraceInProgress : ()Z
/*     */       //   9: ifeq -> 21
/*     */       //   12: ldc 28645453
/*     */       //   14: iload_3
/*     */       //   15: iconst_m1
/*     */       //   16: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.explorer.JuniePromptExampleTips.<anonymous>.<anonymous>.<anonymous> (JuniePromptExampleTips.kt:69)'
/*     */       //   18: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   21: aload_0
/*     */       //   22: getfield $tip : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/Tip;
/*     */       //   25: invokevirtual getDisplayText : ()Ljava/lang/String;
/*     */       //   28: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   31: checkcast androidx/compose/ui/Modifier
/*     */       //   34: aload_2
/*     */       //   35: ldc -772240035
/*     */       //   37: invokeinterface startReplaceGroup : (I)V
/*     */       //   42: aload_2
/*     */       //   43: astore #5
/*     */       //   45: iconst_0
/*     */       //   46: istore #6
/*     */       //   48: nop
/*     */       //   49: iconst_0
/*     */       //   50: istore #7
/*     */       //   52: aload #5
/*     */       //   54: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   59: astore #8
/*     */       //   61: iconst_0
/*     */       //   62: istore #9
/*     */       //   64: aload #8
/*     */       //   66: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   69: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   72: if_acmpne -> 109
/*     */       //   75: astore #15
/*     */       //   77: astore #14
/*     */       //   79: iconst_0
/*     */       //   80: istore #10
/*     */       //   82: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */       //   85: astore #16
/*     */       //   87: aload #14
/*     */       //   89: aload #15
/*     */       //   91: aload #16
/*     */       //   93: astore #10
/*     */       //   95: aload #5
/*     */       //   97: aload #10
/*     */       //   99: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   104: aload #10
/*     */       //   106: goto -> 111
/*     */       //   109: aload #8
/*     */       //   111: nop
/*     */       //   112: nop
/*     */       //   113: nop
/*     */       //   114: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */       //   117: astore #4
/*     */       //   119: aload_2
/*     */       //   120: invokeinterface endReplaceGroup : ()V
/*     */       //   125: aload #4
/*     */       //   127: aconst_null
/*     */       //   128: iconst_0
/*     */       //   129: aconst_null
/*     */       //   130: aconst_null
/*     */       //   131: aload_2
/*     */       //   132: ldc -772236784
/*     */       //   134: invokeinterface startReplaceGroup : (I)V
/*     */       //   139: aload_2
/*     */       //   140: astore #5
/*     */       //   142: aload_2
/*     */       //   143: aload_0
/*     */       //   144: getfield $onTipClick : Lkotlin/jvm/functions/Function1;
/*     */       //   147: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   152: aload_2
/*     */       //   153: aload_0
/*     */       //   154: getfield $tip : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/Tip;
/*     */       //   157: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   162: ior
/*     */       //   163: istore #6
/*     */       //   165: aload_0
/*     */       //   166: getfield $onTipClick : Lkotlin/jvm/functions/Function1;
/*     */       //   169: astore #7
/*     */       //   171: aload_0
/*     */       //   172: getfield $tip : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/Tip;
/*     */       //   175: astore #8
/*     */       //   177: iconst_0
/*     */       //   178: istore #9
/*     */       //   180: aload #5
/*     */       //   182: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   187: astore #10
/*     */       //   189: iconst_0
/*     */       //   190: istore #11
/*     */       //   192: iload #6
/*     */       //   194: ifne -> 208
/*     */       //   197: aload #10
/*     */       //   199: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   202: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   205: if_acmpne -> 268
/*     */       //   208: astore #20
/*     */       //   210: astore #19
/*     */       //   212: istore #18
/*     */       //   214: astore #17
/*     */       //   216: astore #16
/*     */       //   218: astore #15
/*     */       //   220: astore #14
/*     */       //   222: iconst_0
/*     */       //   223: istore #12
/*     */       //   225: aload #7
/*     */       //   227: aload #8
/*     */       //   229: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/Tip;)Lkotlin/jvm/functions/Function0;
/*     */       //   234: astore #21
/*     */       //   236: aload #14
/*     */       //   238: aload #15
/*     */       //   240: aload #16
/*     */       //   242: aload #17
/*     */       //   244: iload #18
/*     */       //   246: aload #19
/*     */       //   248: aload #20
/*     */       //   250: aload #21
/*     */       //   252: astore #13
/*     */       //   254: aload #5
/*     */       //   256: aload #13
/*     */       //   258: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   263: aload #13
/*     */       //   265: goto -> 270
/*     */       //   268: aload #10
/*     */       //   270: nop
/*     */       //   271: nop
/*     */       //   272: nop
/*     */       //   273: checkcast kotlin/jvm/functions/Function0
/*     */       //   276: astore #4
/*     */       //   278: aload_2
/*     */       //   279: invokeinterface endReplaceGroup : ()V
/*     */       //   284: aload #4
/*     */       //   286: bipush #28
/*     */       //   288: aconst_null
/*     */       //   289: invokestatic clickable-O2vRcR0$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */       //   292: aload_0
/*     */       //   293: getfield $examplePromptChipStyle : Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipStyle;
/*     */       //   296: aload_2
/*     */       //   297: iconst_0
/*     */       //   298: iconst_0
/*     */       //   299: invokestatic JunieExamplePromptChip : (Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipStyle;Landroidx/compose/runtime/Composer;II)V
/*     */       //   302: invokestatic isTraceInProgress : ()Z
/*     */       //   305: ifeq -> 311
/*     */       //   308: invokestatic traceEventEnd : ()V
/*     */       //   311: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #70	-> 18
/*     */       //   #71	-> 21
/*     */       //   #73	-> 28
/*     */       //   #75	-> 48
/*     */       //   #124	-> 52
/*     */       //   #125	-> 64
/*     */       //   #126	-> 75
/*     */       //   #75	-> 82
/*     */       //   #126	-> 93
/*     */       //   #127	-> 95
/*     */       //   #128	-> 104
/*     */       //   #129	-> 109
/*     */       //   #125	-> 111
/*     */       //   #124	-> 112
/*     */       //   #124	-> 113
/*     */       //   #75	-> 114
/*     */       //   #76	-> 127
/*     */       //   #74	-> 128
/*     */       //   #77	-> 165
/*     */       //   #130	-> 180
/*     */       //   #131	-> 192
/*     */       //   #132	-> 208
/*     */       //   #77	-> 225
/*     */       //   #132	-> 252
/*     */       //   #133	-> 254
/*     */       //   #134	-> 263
/*     */       //   #135	-> 268
/*     */       //   #131	-> 270
/*     */       //   #130	-> 271
/*     */       //   #130	-> 272
/*     */       //   #77	-> 273
/*     */       //   #74	-> 286
/*     */       //   #79	-> 292
/*     */       //   #70	-> 299
/*     */       //   #81	-> 311
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   82	3	10	$i$a$-cache-JuniePromptExampleTipsKt$JuniePromptExampleTips$2$1$1$1	I
/*     */       //   95	11	10	value$iv	Ljava/lang/Object;
/*     */       //   64	48	9	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   61	51	8	it$iv	Ljava/lang/Object;
/*     */       //   52	62	7	$i$f$cache	I
/*     */       //   49	65	5	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   49	65	6	invalid$iv	Z
/*     */       //   225	9	12	$i$a$-cache-JuniePromptExampleTipsKt$JuniePromptExampleTips$2$1$1$2	I
/*     */       //   254	11	13	value$iv	Ljava/lang/Object;
/*     */       //   192	79	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   189	82	10	it$iv	Ljava/lang/Object;
/*     */       //   180	93	9	$i$f$cache	I
/*     */       //   177	96	5	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   177	96	6	invalid$iv	Z
/*     */       //   0	312	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/JuniePromptExampleTipsKt$JuniePromptExampleTips$2$1$1;
/*     */       //   0	312	1	$this$AnimatedVisibility	Landroidx/compose/animation/AnimatedVisibilityScope;
/*     */       //   0	312	2	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	312	3	$changed	I
/*     */     }
/*     */     
/*     */     private static final Unit invoke$lambda$2$lambda$1(Function1 $onTipClick, Tip $tip) {
/*  77 */       $onTipClick.invoke($tip.getPrompt()); return Unit.INSTANCE;
/*     */     }
/*     */     JuniePromptExampleTipsKt$JuniePromptExampleTips$2$1$1(Tip $tip, Function1<String, Unit> $onTipClick, ExamplePromptChipStyle $examplePromptChipStyle) {}
/*     */   }
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void JunieExamplePromptChip(@NotNull String text, @Nullable Modifier modifier, @Nullable ExamplePromptChipStyle style, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'text'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_3
/*     */     //   8: ldc_w 1161214549
/*     */     //   11: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   16: astore_3
/*     */     //   17: iload #4
/*     */     //   19: istore #6
/*     */     //   21: iload #5
/*     */     //   23: iconst_1
/*     */     //   24: iand
/*     */     //   25: ifeq -> 38
/*     */     //   28: iload #6
/*     */     //   30: bipush #6
/*     */     //   32: ior
/*     */     //   33: istore #6
/*     */     //   35: goto -> 66
/*     */     //   38: iload #4
/*     */     //   40: bipush #6
/*     */     //   42: iand
/*     */     //   43: ifne -> 66
/*     */     //   46: iload #6
/*     */     //   48: aload_3
/*     */     //   49: aload_0
/*     */     //   50: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   55: ifeq -> 62
/*     */     //   58: iconst_4
/*     */     //   59: goto -> 63
/*     */     //   62: iconst_2
/*     */     //   63: ior
/*     */     //   64: istore #6
/*     */     //   66: iload #5
/*     */     //   68: iconst_2
/*     */     //   69: iand
/*     */     //   70: ifeq -> 83
/*     */     //   73: iload #6
/*     */     //   75: bipush #48
/*     */     //   77: ior
/*     */     //   78: istore #6
/*     */     //   80: goto -> 113
/*     */     //   83: iload #4
/*     */     //   85: bipush #48
/*     */     //   87: iand
/*     */     //   88: ifne -> 113
/*     */     //   91: iload #6
/*     */     //   93: aload_3
/*     */     //   94: aload_1
/*     */     //   95: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   100: ifeq -> 108
/*     */     //   103: bipush #32
/*     */     //   105: goto -> 110
/*     */     //   108: bipush #16
/*     */     //   110: ior
/*     */     //   111: istore #6
/*     */     //   113: iload #4
/*     */     //   115: sipush #384
/*     */     //   118: iand
/*     */     //   119: ifne -> 153
/*     */     //   122: iload #6
/*     */     //   124: iload #5
/*     */     //   126: iconst_4
/*     */     //   127: iand
/*     */     //   128: ifne -> 147
/*     */     //   131: aload_3
/*     */     //   132: aload_2
/*     */     //   133: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   138: ifeq -> 147
/*     */     //   141: sipush #256
/*     */     //   144: goto -> 150
/*     */     //   147: sipush #128
/*     */     //   150: ior
/*     */     //   151: istore #6
/*     */     //   153: iload #6
/*     */     //   155: sipush #147
/*     */     //   158: iand
/*     */     //   159: sipush #146
/*     */     //   162: if_icmpne -> 174
/*     */     //   165: aload_3
/*     */     //   166: invokeinterface getSkipping : ()Z
/*     */     //   171: ifne -> 1119
/*     */     //   174: aload_3
/*     */     //   175: invokeinterface startDefaults : ()V
/*     */     //   180: iload #4
/*     */     //   182: iconst_1
/*     */     //   183: iand
/*     */     //   184: ifeq -> 196
/*     */     //   187: aload_3
/*     */     //   188: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   193: ifeq -> 238
/*     */     //   196: iload #5
/*     */     //   198: iconst_2
/*     */     //   199: iand
/*     */     //   200: ifeq -> 210
/*     */     //   203: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   206: checkcast androidx/compose/ui/Modifier
/*     */     //   209: astore_1
/*     */     //   210: iload #5
/*     */     //   212: iconst_4
/*     */     //   213: iand
/*     */     //   214: ifeq -> 259
/*     */     //   217: getstatic com/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipStyle.Companion : Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipStyle$Companion;
/*     */     //   220: aload_3
/*     */     //   221: bipush #6
/*     */     //   223: invokevirtual getCurrent : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipStyle;
/*     */     //   226: astore_2
/*     */     //   227: iload #6
/*     */     //   229: sipush #-897
/*     */     //   232: iand
/*     */     //   233: istore #6
/*     */     //   235: goto -> 259
/*     */     //   238: aload_3
/*     */     //   239: invokeinterface skipToGroupEnd : ()V
/*     */     //   244: iload #5
/*     */     //   246: iconst_4
/*     */     //   247: iand
/*     */     //   248: ifeq -> 259
/*     */     //   251: iload #6
/*     */     //   253: sipush #-897
/*     */     //   256: iand
/*     */     //   257: istore #6
/*     */     //   259: aload_3
/*     */     //   260: invokeinterface endDefaults : ()V
/*     */     //   265: invokestatic isTraceInProgress : ()Z
/*     */     //   268: ifeq -> 283
/*     */     //   271: ldc_w 1161214549
/*     */     //   274: iload #6
/*     */     //   276: iconst_m1
/*     */     //   277: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.explorer.JunieExamplePromptChip (JuniePromptExampleTips.kt:90)'
/*     */     //   280: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   283: aload_3
/*     */     //   284: ldc_w 137995735
/*     */     //   287: invokeinterface startReplaceGroup : (I)V
/*     */     //   292: aload_3
/*     */     //   293: astore #9
/*     */     //   295: iconst_0
/*     */     //   296: istore #10
/*     */     //   298: nop
/*     */     //   299: iconst_0
/*     */     //   300: istore #11
/*     */     //   302: aload #9
/*     */     //   304: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   309: astore #12
/*     */     //   311: iconst_0
/*     */     //   312: istore #13
/*     */     //   314: aload #12
/*     */     //   316: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   319: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   322: if_acmpne -> 354
/*     */     //   325: iconst_0
/*     */     //   326: istore #14
/*     */     //   328: iconst_0
/*     */     //   329: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   332: aconst_null
/*     */     //   333: iconst_2
/*     */     //   334: aconst_null
/*     */     //   335: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   338: astore #14
/*     */     //   340: aload #9
/*     */     //   342: aload #14
/*     */     //   344: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   349: aload #14
/*     */     //   351: goto -> 356
/*     */     //   354: aload #12
/*     */     //   356: nop
/*     */     //   357: nop
/*     */     //   358: nop
/*     */     //   359: checkcast androidx/compose/runtime/MutableState
/*     */     //   362: astore #8
/*     */     //   364: aload_3
/*     */     //   365: invokeinterface endReplaceGroup : ()V
/*     */     //   370: aload #8
/*     */     //   372: astore #7
/*     */     //   374: aload #7
/*     */     //   376: invokestatic JunieExamplePromptChip$lambda$6 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   379: ifeq -> 392
/*     */     //   382: aload_2
/*     */     //   383: invokevirtual getColors : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipColors;
/*     */     //   386: invokevirtual getHoverBackground-0d7_KjU : ()J
/*     */     //   389: goto -> 399
/*     */     //   392: aload_2
/*     */     //   393: invokevirtual getColors : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipColors;
/*     */     //   396: invokevirtual getIdleBackground-0d7_KjU : ()J
/*     */     //   399: lstore #8
/*     */     //   401: aload #7
/*     */     //   403: invokestatic JunieExamplePromptChip$lambda$6 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   406: ifeq -> 419
/*     */     //   409: aload_2
/*     */     //   410: invokevirtual getColors : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipColors;
/*     */     //   413: invokevirtual getHoverText-0d7_KjU : ()J
/*     */     //   416: goto -> 426
/*     */     //   419: aload_2
/*     */     //   420: invokevirtual getColors : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipColors;
/*     */     //   423: invokevirtual getIdleText-0d7_KjU : ()J
/*     */     //   426: lstore #10
/*     */     //   428: aload_1
/*     */     //   429: fconst_0
/*     */     //   430: iconst_1
/*     */     //   431: aconst_null
/*     */     //   432: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   435: aload_2
/*     */     //   436: invokevirtual getMetrics : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipMetrics;
/*     */     //   439: invokevirtual getHeight-D9Ej5fM : ()F
/*     */     //   442: invokestatic height-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   445: lload #8
/*     */     //   447: aload_2
/*     */     //   448: invokevirtual getMetrics : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipMetrics;
/*     */     //   451: invokevirtual getCornerRadius-D9Ej5fM : ()F
/*     */     //   454: invokestatic RoundedCornerShape-0680j_4 : (F)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   457: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   460: invokestatic background-bw27NRU : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*     */     //   463: aload_2
/*     */     //   464: invokevirtual getMetrics : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipMetrics;
/*     */     //   467: invokevirtual getHorizontalPadding-D9Ej5fM : ()F
/*     */     //   470: aload_2
/*     */     //   471: invokevirtual getMetrics : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipMetrics;
/*     */     //   474: invokevirtual getVerticalPadding-D9Ej5fM : ()F
/*     */     //   477: invokestatic padding-VpY3zN4 : (Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;
/*     */     //   480: aload_3
/*     */     //   481: ldc_w 138011816
/*     */     //   484: invokeinterface startReplaceGroup : (I)V
/*     */     //   489: aload_3
/*     */     //   490: astore #14
/*     */     //   492: iconst_0
/*     */     //   493: istore #15
/*     */     //   495: nop
/*     */     //   496: iconst_0
/*     */     //   497: istore #16
/*     */     //   499: aload #14
/*     */     //   501: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   506: astore #17
/*     */     //   508: iconst_0
/*     */     //   509: istore #18
/*     */     //   511: aload #17
/*     */     //   513: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   516: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   519: if_acmpne -> 553
/*     */     //   522: astore #44
/*     */     //   524: iconst_0
/*     */     //   525: istore #19
/*     */     //   527: aload #7
/*     */     //   529: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   534: aload #44
/*     */     //   536: swap
/*     */     //   537: astore #20
/*     */     //   539: aload #14
/*     */     //   541: aload #20
/*     */     //   543: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   548: aload #20
/*     */     //   550: goto -> 555
/*     */     //   553: aload #17
/*     */     //   555: nop
/*     */     //   556: nop
/*     */     //   557: nop
/*     */     //   558: checkcast kotlin/jvm/functions/Function1
/*     */     //   561: astore #13
/*     */     //   563: aload_3
/*     */     //   564: invokeinterface endReplaceGroup : ()V
/*     */     //   569: aload #13
/*     */     //   571: invokestatic onHover : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   574: astore #12
/*     */     //   576: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   579: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   582: astore #13
/*     */     //   584: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   587: invokevirtual getSpaceBetween : ()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   590: astore #14
/*     */     //   592: sipush #432
/*     */     //   595: istore #15
/*     */     //   597: nop
/*     */     //   598: iconst_0
/*     */     //   599: istore #16
/*     */     //   601: aload_3
/*     */     //   602: ldc_w 693286680
/*     */     //   605: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   608: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   611: aload #14
/*     */     //   613: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*     */     //   616: aload #13
/*     */     //   618: aload_3
/*     */     //   619: bipush #14
/*     */     //   621: iload #15
/*     */     //   623: iconst_3
/*     */     //   624: ishr
/*     */     //   625: iand
/*     */     //   626: bipush #112
/*     */     //   628: iload #15
/*     */     //   630: iconst_3
/*     */     //   631: ishr
/*     */     //   632: iand
/*     */     //   633: ior
/*     */     //   634: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   637: astore #17
/*     */     //   639: bipush #112
/*     */     //   641: iload #15
/*     */     //   643: iconst_3
/*     */     //   644: ishl
/*     */     //   645: iand
/*     */     //   646: istore #18
/*     */     //   648: nop
/*     */     //   649: iconst_0
/*     */     //   650: istore #19
/*     */     //   652: aload_3
/*     */     //   653: ldc -1323940314
/*     */     //   655: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   657: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   660: aload_3
/*     */     //   661: iconst_0
/*     */     //   662: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   665: istore #20
/*     */     //   667: aload_3
/*     */     //   668: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   673: astore #21
/*     */     //   675: aload_3
/*     */     //   676: aload #12
/*     */     //   678: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   681: astore #22
/*     */     //   683: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   686: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   689: astore #23
/*     */     //   691: bipush #6
/*     */     //   693: sipush #896
/*     */     //   696: iload #18
/*     */     //   698: bipush #6
/*     */     //   700: ishl
/*     */     //   701: iand
/*     */     //   702: ior
/*     */     //   703: istore #24
/*     */     //   705: nop
/*     */     //   706: iconst_0
/*     */     //   707: istore #25
/*     */     //   709: aload_3
/*     */     //   710: ldc -692256719
/*     */     //   712: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   714: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   717: aload_3
/*     */     //   718: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   723: instanceof androidx/compose/runtime/Applier
/*     */     //   726: ifne -> 732
/*     */     //   729: invokestatic invalidApplier : ()V
/*     */     //   732: aload_3
/*     */     //   733: invokeinterface startReusableNode : ()V
/*     */     //   738: aload_3
/*     */     //   739: invokeinterface getInserting : ()Z
/*     */     //   744: ifeq -> 758
/*     */     //   747: aload_3
/*     */     //   748: aload #23
/*     */     //   750: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   755: goto -> 764
/*     */     //   758: aload_3
/*     */     //   759: invokeinterface useNode : ()V
/*     */     //   764: aload_3
/*     */     //   765: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   768: astore #26
/*     */     //   770: iconst_0
/*     */     //   771: istore #27
/*     */     //   773: aload #26
/*     */     //   775: aload #17
/*     */     //   777: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   780: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   783: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   786: aload #26
/*     */     //   788: aload #21
/*     */     //   790: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   793: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   796: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   799: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   802: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   805: astore #28
/*     */     //   807: iconst_0
/*     */     //   808: istore #29
/*     */     //   810: aload #26
/*     */     //   812: astore #30
/*     */     //   814: iconst_0
/*     */     //   815: istore #31
/*     */     //   817: aload #30
/*     */     //   819: invokeinterface getInserting : ()Z
/*     */     //   824: ifne -> 845
/*     */     //   827: aload #30
/*     */     //   829: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   834: iload #20
/*     */     //   836: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   839: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   842: ifne -> 871
/*     */     //   845: aload #30
/*     */     //   847: iload #20
/*     */     //   849: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   852: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   857: aload #26
/*     */     //   859: iload #20
/*     */     //   861: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   864: aload #28
/*     */     //   866: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   871: nop
/*     */     //   872: nop
/*     */     //   873: nop
/*     */     //   874: aload #26
/*     */     //   876: aload #22
/*     */     //   878: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   881: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   884: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   887: nop
/*     */     //   888: nop
/*     */     //   889: aload_3
/*     */     //   890: bipush #14
/*     */     //   892: iload #24
/*     */     //   894: bipush #6
/*     */     //   896: ishr
/*     */     //   897: iand
/*     */     //   898: istore #32
/*     */     //   900: astore #33
/*     */     //   902: iconst_0
/*     */     //   903: istore #34
/*     */     //   905: aload #33
/*     */     //   907: ldc_w -407840262
/*     */     //   910: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   913: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   916: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   919: aload #33
/*     */     //   921: bipush #6
/*     */     //   923: bipush #112
/*     */     //   925: iload #15
/*     */     //   927: bipush #6
/*     */     //   929: ishr
/*     */     //   930: iand
/*     */     //   931: ior
/*     */     //   932: istore #35
/*     */     //   934: astore #36
/*     */     //   936: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   939: astore #37
/*     */     //   941: iconst_0
/*     */     //   942: istore #38
/*     */     //   944: aload #37
/*     */     //   946: aload_1
/*     */     //   947: fconst_1
/*     */     //   948: iconst_0
/*     */     //   949: iconst_2
/*     */     //   950: aconst_null
/*     */     //   951: invokestatic weight$default : (Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   954: astore #39
/*     */     //   956: getstatic androidx/compose/ui/text/style/TextOverflow.Companion : Landroidx/compose/ui/text/style/TextOverflow$Companion;
/*     */     //   959: invokevirtual getEllipsis-gIe3tQ8 : ()I
/*     */     //   962: istore #40
/*     */     //   964: aload_0
/*     */     //   965: aload #39
/*     */     //   967: lload #10
/*     */     //   969: lconst_0
/*     */     //   970: aconst_null
/*     */     //   971: aconst_null
/*     */     //   972: aconst_null
/*     */     //   973: lconst_0
/*     */     //   974: aconst_null
/*     */     //   975: iconst_0
/*     */     //   976: lconst_0
/*     */     //   977: iload #40
/*     */     //   979: iconst_0
/*     */     //   980: iconst_0
/*     */     //   981: aconst_null
/*     */     //   982: aconst_null
/*     */     //   983: aload #36
/*     */     //   985: bipush #14
/*     */     //   987: iload #6
/*     */     //   989: iand
/*     */     //   990: sipush #432
/*     */     //   993: ldc_w 59384
/*     */     //   996: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   999: aload #36
/*     */     //   1001: ldc_w -1182017911
/*     */     //   1004: invokeinterface startReplaceGroup : (I)V
/*     */     //   1009: aload #7
/*     */     //   1011: invokestatic JunieExamplePromptChip$lambda$6 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   1014: ifeq -> 1073
/*     */     //   1017: aload_2
/*     */     //   1018: invokevirtual getIconKey : ()Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   1021: astore #39
/*     */     //   1023: aload_2
/*     */     //   1024: invokevirtual getColors : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipColors;
/*     */     //   1027: invokevirtual getIconColor-0d7_KjU : ()J
/*     */     //   1030: lstore #41
/*     */     //   1032: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1035: checkcast androidx/compose/ui/Modifier
/*     */     //   1038: aload_2
/*     */     //   1039: invokevirtual getMetrics : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipMetrics;
/*     */     //   1042: invokevirtual getIconSize-D9Ej5fM : ()F
/*     */     //   1045: invokestatic size-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   1048: astore #43
/*     */     //   1050: aload #39
/*     */     //   1052: ldc_w 'Right arrow'
/*     */     //   1055: aload #43
/*     */     //   1057: aconst_null
/*     */     //   1058: lload #41
/*     */     //   1060: iconst_0
/*     */     //   1061: anewarray org/jetbrains/jewel/ui/painter/PainterHint
/*     */     //   1064: aload #36
/*     */     //   1066: bipush #48
/*     */     //   1068: bipush #8
/*     */     //   1070: invokestatic Icon-FHprtrg : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1073: aload #36
/*     */     //   1075: invokeinterface endReplaceGroup : ()V
/*     */     //   1080: nop
/*     */     //   1081: aload #33
/*     */     //   1083: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1086: aload_3
/*     */     //   1087: invokeinterface endNode : ()V
/*     */     //   1092: aload_3
/*     */     //   1093: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1096: nop
/*     */     //   1097: aload_3
/*     */     //   1098: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1101: nop
/*     */     //   1102: aload_3
/*     */     //   1103: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1106: nop
/*     */     //   1107: invokestatic isTraceInProgress : ()Z
/*     */     //   1110: ifeq -> 1125
/*     */     //   1113: invokestatic traceEventEnd : ()V
/*     */     //   1116: goto -> 1125
/*     */     //   1119: aload_3
/*     */     //   1120: invokeinterface skipToGroupEnd : ()V
/*     */     //   1125: aload_3
/*     */     //   1126: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1131: dup
/*     */     //   1132: ifnull -> 1155
/*     */     //   1135: aload_0
/*     */     //   1136: aload_1
/*     */     //   1137: aload_2
/*     */     //   1138: iload #4
/*     */     //   1140: iload #5
/*     */     //   1142: <illegal opcode> invoke : (Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipStyle;II)Lkotlin/jvm/functions/Function2;
/*     */     //   1147: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1152: goto -> 1156
/*     */     //   1155: pop
/*     */     //   1156: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #91	-> 7
/*     */     //   #89	-> 203
/*     */     //   #90	-> 217
/*     */     //   #91	-> 280
/*     */     //   #92	-> 298
/*     */     //   #179	-> 302
/*     */     //   #180	-> 314
/*     */     //   #181	-> 325
/*     */     //   #92	-> 328
/*     */     //   #181	-> 338
/*     */     //   #182	-> 340
/*     */     //   #183	-> 349
/*     */     //   #184	-> 354
/*     */     //   #180	-> 356
/*     */     //   #179	-> 357
/*     */     //   #179	-> 358
/*     */     //   #92	-> 359
/*     */     //   #93	-> 374
/*     */     //   #94	-> 401
/*     */     //   #97	-> 428
/*     */     //   #98	-> 429
/*     */     //   #99	-> 435
/*     */     //   #100	-> 445
/*     */     //   #101	-> 463
/*     */     //   #102	-> 495
/*     */     //   #185	-> 499
/*     */     //   #186	-> 511
/*     */     //   #187	-> 522
/*     */     //   #102	-> 527
/*     */     //   #187	-> 537
/*     */     //   #188	-> 539
/*     */     //   #189	-> 548
/*     */     //   #190	-> 553
/*     */     //   #186	-> 555
/*     */     //   #185	-> 556
/*     */     //   #185	-> 557
/*     */     //   #102	-> 558
/*     */     //   #103	-> 576
/*     */     //   #104	-> 584
/*     */     //   #95	-> 597
/*     */     //   #191	-> 608
/*     */     //   #192	-> 611
/*     */     //   #193	-> 648
/*     */     //   #194	-> 657
/*     */     //   #195	-> 662
/*     */     //   #196	-> 668
/*     */     //   #197	-> 676
/*     */     //   #199	-> 683
/*     */     //   #198	-> 705
/*     */     //   #200	-> 714
/*     */     //   #201	-> 717
/*     */     //   #202	-> 733
/*     */     //   #203	-> 738
/*     */     //   #204	-> 748
/*     */     //   #206	-> 759
/*     */     //   #208	-> 764
/*     */     //   #209	-> 773
/*     */     //   #210	-> 786
/*     */     //   #212	-> 799
/*     */     //   #213	-> 810
/*     */     //   #214	-> 817
/*     */     //   #215	-> 845
/*     */     //   #216	-> 857
/*     */     //   #218	-> 871
/*     */     //   #213	-> 872
/*     */     //   #218	-> 873
/*     */     //   #219	-> 874
/*     */     //   #220	-> 887
/*     */     //   #208	-> 888
/*     */     //   #221	-> 889
/*     */     //   #222	-> 913
/*     */     //   #107	-> 944
/*     */     //   #110	-> 956
/*     */     //   #108	-> 964
/*     */     //   #107	-> 965
/*     */     //   #109	-> 967
/*     */     //   #110	-> 977
/*     */     //   #111	-> 979
/*     */     //   #106	-> 996
/*     */     //   #113	-> 1009
/*     */     //   #115	-> 1017
/*     */     //   #117	-> 1023
/*     */     //   #118	-> 1032
/*     */     //   #115	-> 1050
/*     */     //   #116	-> 1052
/*     */     //   #118	-> 1055
/*     */     //   #117	-> 1058
/*     */     //   #114	-> 1070
/*     */     //   #121	-> 1080
/*     */     //   #222	-> 1081
/*     */     //   #221	-> 1086
/*     */     //   #223	-> 1087
/*     */     //   #200	-> 1093
/*     */     //   #224	-> 1096
/*     */     //   #194	-> 1098
/*     */     //   #225	-> 1101
/*     */     //   #191	-> 1103
/*     */     //   #226	-> 1106
/*     */     //   #122	-> 1119
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   328	10	14	$i$a$-cache-JuniePromptExampleTipsKt$JunieExamplePromptChip$isHovering$2	I
/*     */     //   340	11	14	value$iv	Ljava/lang/Object;
/*     */     //   314	43	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   311	46	12	it$iv	Ljava/lang/Object;
/*     */     //   302	57	11	$i$f$cache	I
/*     */     //   299	60	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   299	60	10	invalid$iv	Z
/*     */     //   527	7	19	$i$a$-cache-JuniePromptExampleTipsKt$JunieExamplePromptChip$1	I
/*     */     //   539	11	20	value$iv	Ljava/lang/Object;
/*     */     //   511	45	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   508	48	17	it$iv	Ljava/lang/Object;
/*     */     //   499	59	16	$i$f$cache	I
/*     */     //   496	62	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   496	62	15	invalid$iv	Z
/*     */     //   944	137	38	$i$a$-Row-JuniePromptExampleTipsKt$JunieExamplePromptChip$2	I
/*     */     //   941	140	37	$this$JunieExamplePromptChip_u24lambda_u2410	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   941	140	36	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   941	140	35	$changed	I
/*     */     //   905	181	34	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   902	184	33	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   902	184	32	$changed$iv	I
/*     */     //   817	55	31	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   814	58	30	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   810	64	29	$i$f$set-impl	I
/*     */     //   807	67	28	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   773	115	27	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   770	118	26	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   709	388	25	$i$f$ReusableComposeNode	I
/*     */     //   706	391	23	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   706	391	24	$changed$iv$iv$iv	I
/*     */     //   652	450	19	$i$f$Layout	I
/*     */     //   667	435	20	compositeKeyHash$iv$iv	I
/*     */     //   675	427	21	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   683	419	22	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   649	453	18	$changed$iv$iv	I
/*     */     //   601	506	16	$i$f$Row	I
/*     */     //   639	468	17	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   598	509	15	$changed$iv	I
/*     */     //   374	742	7	isHovering$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   401	715	8	backgroundColor	J
/*     */     //   428	688	10	textColor	J
/*     */     //   21	1136	6	$dirty	I
/*     */     //   0	1157	0	text	Ljava/lang/String;
/*     */     //   0	1157	1	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1157	2	style	Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/ExamplePromptChipStyle;
/*     */     //   0	1157	3	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1157	4	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit JuniePromptExampleTips_Zb7fWow$lambda$4(List<Tip> $tips, Function1<? super String, Unit> $onTipClick, ExamplePromptChipStyle $examplePromptChipStyle, Modifier $modifier, long $animationDuration, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     JuniePromptExampleTips-Zb7fWow($tips, $onTipClick, $examplePromptChipStyle, $modifier, $animationDuration, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*  92 */   private static final boolean JunieExamplePromptChip$lambda$6(MutableState $isHovering$delegate) { State state = (State)$isHovering$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 227 */       (Boolean)state.getValue()).booleanValue(); } private static final void JunieExamplePromptChip$lambda$7(MutableState $isHovering$delegate, boolean <set-?>) { MutableState mutableState = $isHovering$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 228 */     mutableState.setValue(value$iv); }
/*     */ 
/*     */   
/*     */   private static final Unit JunieExamplePromptChip$lambda$9$lambda$8(MutableState<Boolean> $isHovering$delegate, boolean it) {
/*     */     JunieExamplePromptChip$lambda$7($isHovering$delegate, it);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit JunieExamplePromptChip$lambda$11(String $text, Modifier $modifier, ExamplePromptChipStyle $style, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     JunieExamplePromptChip($text, $modifier, $style, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\explorer\JuniePromptExampleTipsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */