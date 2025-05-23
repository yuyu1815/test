/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*     */ 
/*     */ import androidx.compose.foundation.layout.Arrangement;
/*     */ import androidx.compose.foundation.layout.BoxKt;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.layout.BoxScopeInstance;
/*     */ import androidx.compose.foundation.layout.RowKt;
/*     */ import androidx.compose.foundation.layout.RowScope;
/*     */ import androidx.compose.foundation.layout.RowScopeInstance;
/*     */ import androidx.compose.foundation.layout.SizeKt;
/*     */ import androidx.compose.foundation.lazy.LazyItemScope;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.AttachedFile;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import org.jetbrains.jewel.ui.component.TextKt;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nJunieFilePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieFilePicker.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$7$1$1$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,234:1\n1225#2,6:235\n1225#2,6:242\n1225#2,6:248\n149#3:241\n149#3:254\n149#3:255\n99#4,3:256\n102#4:287\n106#4:291\n79#5,6:259\n86#5,4:274\n90#5,2:284\n94#5:290\n368#6,9:265\n377#6:286\n378#6,2:288\n4034#7,6:278\n81#8:292\n107#8,2:293\n*S KotlinDebug\n*F\n+ 1 JunieFilePicker.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$7$1$1$1$1\n*L\n169#1:235,6\n177#1:242,6\n180#1:248,6\n175#1:241\n184#1:254\n186#1:255\n170#1:256,3\n170#1:287\n170#1:291\n170#1:259,6\n170#1:274,4\n170#1:284,2\n170#1:290\n170#1:265,9\n170#1:286\n170#1:288,2\n170#1:278,6\n169#1:292\n169#1:293,2\n*E\n"})
/*     */ final class JunieFilePickerKt$JunieFilePickerDialog$2$7$1$1$1$1
/*     */   implements Function3<LazyItemScope, Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(LazyItemScope $this$item, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc '$this$item'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: iload_3
/*     */     //   7: bipush #17
/*     */     //   9: iand
/*     */     //   10: bipush #16
/*     */     //   12: if_icmpne -> 24
/*     */     //   15: aload_2
/*     */     //   16: invokeinterface getSkipping : ()Z
/*     */     //   21: ifne -> 969
/*     */     //   24: invokestatic isTraceInProgress : ()Z
/*     */     //   27: ifeq -> 39
/*     */     //   30: ldc -1476751354
/*     */     //   32: iload_3
/*     */     //   33: iconst_m1
/*     */     //   34: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.JunieFilePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JunieFilePicker.kt:168)'
/*     */     //   36: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   39: aload_2
/*     */     //   40: ldc 1661244618
/*     */     //   42: invokeinterface startReplaceGroup : (I)V
/*     */     //   47: aload_2
/*     */     //   48: astore #6
/*     */     //   50: iconst_0
/*     */     //   51: istore #7
/*     */     //   53: iconst_0
/*     */     //   54: istore #8
/*     */     //   56: aload #6
/*     */     //   58: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   63: astore #9
/*     */     //   65: iconst_0
/*     */     //   66: istore #10
/*     */     //   68: aload #9
/*     */     //   70: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   73: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   76: if_acmpne -> 108
/*     */     //   79: iconst_0
/*     */     //   80: istore #11
/*     */     //   82: iconst_0
/*     */     //   83: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   86: aconst_null
/*     */     //   87: iconst_2
/*     */     //   88: aconst_null
/*     */     //   89: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   92: astore #11
/*     */     //   94: aload #6
/*     */     //   96: aload #11
/*     */     //   98: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   103: aload #11
/*     */     //   105: goto -> 110
/*     */     //   108: aload #9
/*     */     //   110: nop
/*     */     //   111: nop
/*     */     //   112: nop
/*     */     //   113: checkcast androidx/compose/runtime/MutableState
/*     */     //   116: astore #5
/*     */     //   118: aload_2
/*     */     //   119: invokeinterface endReplaceGroup : ()V
/*     */     //   124: aload #5
/*     */     //   126: astore #4
/*     */     //   128: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   131: checkcast androidx/compose/ui/Modifier
/*     */     //   134: aload_0
/*     */     //   135: getfield $dialogWidthDp : F
/*     */     //   138: invokestatic width-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   141: aload #4
/*     */     //   143: invokestatic invoke$lambda$1 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   146: ifeq -> 156
/*     */     //   149: aload_0
/*     */     //   150: getfield $hoveredItemBackground : J
/*     */     //   153: goto -> 162
/*     */     //   156: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
/*     */     //   159: invokevirtual getUnspecified-0d7_KjU : ()J
/*     */     //   162: bipush #6
/*     */     //   164: istore #6
/*     */     //   166: iconst_0
/*     */     //   167: istore #7
/*     */     //   169: iload #6
/*     */     //   171: i2f
/*     */     //   172: invokestatic constructor-impl : (F)F
/*     */     //   175: invokestatic RoundedCornerShape-0680j_4 : (F)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   178: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   181: invokestatic background-bw27NRU : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*     */     //   184: aload_2
/*     */     //   185: ldc 1661255390
/*     */     //   187: invokeinterface startReplaceGroup : (I)V
/*     */     //   192: aload_2
/*     */     //   193: astore #7
/*     */     //   195: iconst_0
/*     */     //   196: istore #8
/*     */     //   198: nop
/*     */     //   199: iconst_0
/*     */     //   200: istore #9
/*     */     //   202: aload #7
/*     */     //   204: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   209: astore #10
/*     */     //   211: iconst_0
/*     */     //   212: istore #11
/*     */     //   214: aload #10
/*     */     //   216: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   219: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   222: if_acmpne -> 256
/*     */     //   225: astore #34
/*     */     //   227: iconst_0
/*     */     //   228: istore #12
/*     */     //   230: aload #4
/*     */     //   232: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   237: aload #34
/*     */     //   239: swap
/*     */     //   240: astore #13
/*     */     //   242: aload #7
/*     */     //   244: aload #13
/*     */     //   246: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   251: aload #13
/*     */     //   253: goto -> 258
/*     */     //   256: aload #10
/*     */     //   258: nop
/*     */     //   259: nop
/*     */     //   260: nop
/*     */     //   261: checkcast kotlin/jvm/functions/Function1
/*     */     //   264: astore #6
/*     */     //   266: aload_2
/*     */     //   267: invokeinterface endReplaceGroup : ()V
/*     */     //   272: aload #6
/*     */     //   274: invokestatic onHover : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   277: iconst_0
/*     */     //   278: aconst_null
/*     */     //   279: aconst_null
/*     */     //   280: aconst_null
/*     */     //   281: aconst_null
/*     */     //   282: aload_2
/*     */     //   283: ldc 1661258043
/*     */     //   285: invokeinterface startReplaceGroup : (I)V
/*     */     //   290: aload_2
/*     */     //   291: astore #7
/*     */     //   293: aload_2
/*     */     //   294: aload_0
/*     */     //   295: getfield $onFileChosen : Lkotlin/jvm/functions/Function1;
/*     */     //   298: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   303: aload_2
/*     */     //   304: aload_0
/*     */     //   305: getfield $fileListEntry : Lcom/intellij/ml/llm/matterhorn/ej/ui/components/FileListEntry;
/*     */     //   308: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   313: ior
/*     */     //   314: aload_2
/*     */     //   315: aload_0
/*     */     //   316: getfield $onCloseRequest : Lkotlin/jvm/functions/Function0;
/*     */     //   319: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   324: ior
/*     */     //   325: istore #8
/*     */     //   327: aload_0
/*     */     //   328: getfield $onFileChosen : Lkotlin/jvm/functions/Function1;
/*     */     //   331: astore #9
/*     */     //   333: aload_0
/*     */     //   334: getfield $fileListEntry : Lcom/intellij/ml/llm/matterhorn/ej/ui/components/FileListEntry;
/*     */     //   337: astore #10
/*     */     //   339: aload_0
/*     */     //   340: getfield $onCloseRequest : Lkotlin/jvm/functions/Function0;
/*     */     //   343: astore #11
/*     */     //   345: iconst_0
/*     */     //   346: istore #12
/*     */     //   348: aload #7
/*     */     //   350: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   355: astore #13
/*     */     //   357: iconst_0
/*     */     //   358: istore #14
/*     */     //   360: iload #8
/*     */     //   362: ifne -> 376
/*     */     //   365: aload #13
/*     */     //   367: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   370: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   373: if_acmpne -> 434
/*     */     //   376: astore #39
/*     */     //   378: astore #38
/*     */     //   380: astore #37
/*     */     //   382: astore #36
/*     */     //   384: istore #35
/*     */     //   386: astore #34
/*     */     //   388: iconst_0
/*     */     //   389: istore #15
/*     */     //   391: aload #9
/*     */     //   393: aload #10
/*     */     //   395: aload #11
/*     */     //   397: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/ej/ui/components/FileListEntry;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;
/*     */     //   402: astore #40
/*     */     //   404: aload #34
/*     */     //   406: iload #35
/*     */     //   408: aload #36
/*     */     //   410: aload #37
/*     */     //   412: aload #38
/*     */     //   414: aload #39
/*     */     //   416: aload #40
/*     */     //   418: astore #16
/*     */     //   420: aload #7
/*     */     //   422: aload #16
/*     */     //   424: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   429: aload #16
/*     */     //   431: goto -> 436
/*     */     //   434: aload #13
/*     */     //   436: nop
/*     */     //   437: nop
/*     */     //   438: nop
/*     */     //   439: checkcast kotlin/jvm/functions/Function0
/*     */     //   442: astore #6
/*     */     //   444: aload_2
/*     */     //   445: invokeinterface endReplaceGroup : ()V
/*     */     //   450: aload #6
/*     */     //   452: bipush #31
/*     */     //   454: aconst_null
/*     */     //   455: invokestatic onClick$default : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/PointerMatcher;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   458: iconst_4
/*     */     //   459: istore #6
/*     */     //   461: iconst_0
/*     */     //   462: istore #7
/*     */     //   464: iload #6
/*     */     //   466: i2f
/*     */     //   467: invokestatic constructor-impl : (F)F
/*     */     //   470: invokestatic padding-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   473: astore #5
/*     */     //   475: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   478: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   481: astore #6
/*     */     //   483: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   486: bipush #16
/*     */     //   488: istore #8
/*     */     //   490: iconst_0
/*     */     //   491: istore #9
/*     */     //   493: iload #8
/*     */     //   495: i2f
/*     */     //   496: invokestatic constructor-impl : (F)F
/*     */     //   499: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   502: astore #7
/*     */     //   504: aload_0
/*     */     //   505: getfield $fileListEntry : Lcom/intellij/ml/llm/matterhorn/ej/ui/components/FileListEntry;
/*     */     //   508: astore #8
/*     */     //   510: sipush #432
/*     */     //   513: istore #9
/*     */     //   515: iconst_0
/*     */     //   516: istore #10
/*     */     //   518: aload_2
/*     */     //   519: ldc 693286680
/*     */     //   521: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   523: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   526: aload #7
/*     */     //   528: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*     */     //   531: aload #6
/*     */     //   533: aload_2
/*     */     //   534: bipush #14
/*     */     //   536: iload #9
/*     */     //   538: iconst_3
/*     */     //   539: ishr
/*     */     //   540: iand
/*     */     //   541: bipush #112
/*     */     //   543: iload #9
/*     */     //   545: iconst_3
/*     */     //   546: ishr
/*     */     //   547: iand
/*     */     //   548: ior
/*     */     //   549: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   552: astore #11
/*     */     //   554: bipush #112
/*     */     //   556: iload #9
/*     */     //   558: iconst_3
/*     */     //   559: ishl
/*     */     //   560: iand
/*     */     //   561: istore #12
/*     */     //   563: nop
/*     */     //   564: iconst_0
/*     */     //   565: istore #13
/*     */     //   567: aload_2
/*     */     //   568: ldc -1323940314
/*     */     //   570: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   572: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   575: aload_2
/*     */     //   576: iconst_0
/*     */     //   577: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   580: istore #14
/*     */     //   582: aload_2
/*     */     //   583: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   588: astore #15
/*     */     //   590: aload_2
/*     */     //   591: aload #5
/*     */     //   593: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   596: astore #16
/*     */     //   598: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   601: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   604: astore #17
/*     */     //   606: bipush #6
/*     */     //   608: sipush #896
/*     */     //   611: iload #12
/*     */     //   613: bipush #6
/*     */     //   615: ishl
/*     */     //   616: iand
/*     */     //   617: ior
/*     */     //   618: istore #18
/*     */     //   620: nop
/*     */     //   621: iconst_0
/*     */     //   622: istore #19
/*     */     //   624: aload_2
/*     */     //   625: ldc_w -692256719
/*     */     //   628: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   631: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   634: aload_2
/*     */     //   635: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   640: instanceof androidx/compose/runtime/Applier
/*     */     //   643: ifne -> 649
/*     */     //   646: invokestatic invalidApplier : ()V
/*     */     //   649: aload_2
/*     */     //   650: invokeinterface startReusableNode : ()V
/*     */     //   655: aload_2
/*     */     //   656: invokeinterface getInserting : ()Z
/*     */     //   661: ifeq -> 675
/*     */     //   664: aload_2
/*     */     //   665: aload #17
/*     */     //   667: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   672: goto -> 681
/*     */     //   675: aload_2
/*     */     //   676: invokeinterface useNode : ()V
/*     */     //   681: aload_2
/*     */     //   682: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   685: astore #20
/*     */     //   687: iconst_0
/*     */     //   688: istore #21
/*     */     //   690: aload #20
/*     */     //   692: aload #11
/*     */     //   694: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   697: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   700: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   703: aload #20
/*     */     //   705: aload #15
/*     */     //   707: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   710: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   713: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   716: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   719: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   722: astore #22
/*     */     //   724: iconst_0
/*     */     //   725: istore #23
/*     */     //   727: aload #20
/*     */     //   729: astore #24
/*     */     //   731: iconst_0
/*     */     //   732: istore #25
/*     */     //   734: aload #24
/*     */     //   736: invokeinterface getInserting : ()Z
/*     */     //   741: ifne -> 762
/*     */     //   744: aload #24
/*     */     //   746: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   751: iload #14
/*     */     //   753: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   756: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   759: ifne -> 788
/*     */     //   762: aload #24
/*     */     //   764: iload #14
/*     */     //   766: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   769: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   774: aload #20
/*     */     //   776: iload #14
/*     */     //   778: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   781: aload #22
/*     */     //   783: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   788: nop
/*     */     //   789: nop
/*     */     //   790: nop
/*     */     //   791: aload #20
/*     */     //   793: aload #16
/*     */     //   795: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   798: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   801: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   804: nop
/*     */     //   805: nop
/*     */     //   806: aload_2
/*     */     //   807: bipush #14
/*     */     //   809: iload #18
/*     */     //   811: bipush #6
/*     */     //   813: ishr
/*     */     //   814: iand
/*     */     //   815: istore #26
/*     */     //   817: astore #27
/*     */     //   819: iconst_0
/*     */     //   820: istore #28
/*     */     //   822: aload #27
/*     */     //   824: ldc_w -407840262
/*     */     //   827: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   830: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   833: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   836: aload #27
/*     */     //   838: bipush #6
/*     */     //   840: bipush #112
/*     */     //   842: iload #9
/*     */     //   844: bipush #6
/*     */     //   846: ishr
/*     */     //   847: iand
/*     */     //   848: ior
/*     */     //   849: istore #29
/*     */     //   851: astore #30
/*     */     //   853: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   856: astore #31
/*     */     //   858: iconst_0
/*     */     //   859: istore #32
/*     */     //   861: aload #30
/*     */     //   863: iconst_0
/*     */     //   864: invokestatic rememberJunieTooltipStyle : (Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;
/*     */     //   867: astore #33
/*     */     //   869: ldc_w 593999682
/*     */     //   872: iconst_1
/*     */     //   873: new com/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$7$1$1$1$1$3$1
/*     */     //   876: dup
/*     */     //   877: aload #8
/*     */     //   879: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/components/FileListEntry;)V
/*     */     //   882: aload #30
/*     */     //   884: bipush #54
/*     */     //   886: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   889: checkcast kotlin/jvm/functions/Function2
/*     */     //   892: aconst_null
/*     */     //   893: iconst_0
/*     */     //   894: aload #33
/*     */     //   896: aconst_null
/*     */     //   897: ldc_w 378470621
/*     */     //   900: iconst_1
/*     */     //   901: new com/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$7$1$1$1$1$3$2
/*     */     //   904: dup
/*     */     //   905: aload #8
/*     */     //   907: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/components/FileListEntry;)V
/*     */     //   910: aload #30
/*     */     //   912: bipush #54
/*     */     //   914: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   917: checkcast kotlin/jvm/functions/Function2
/*     */     //   920: aload #30
/*     */     //   922: ldc_w 196614
/*     */     //   925: bipush #22
/*     */     //   927: invokestatic Tooltip : (Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/foundation/TooltipPlacement;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   930: nop
/*     */     //   931: aload #27
/*     */     //   933: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   936: aload_2
/*     */     //   937: invokeinterface endNode : ()V
/*     */     //   942: aload_2
/*     */     //   943: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   946: nop
/*     */     //   947: aload_2
/*     */     //   948: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   951: nop
/*     */     //   952: aload_2
/*     */     //   953: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   956: nop
/*     */     //   957: invokestatic isTraceInProgress : ()Z
/*     */     //   960: ifeq -> 975
/*     */     //   963: invokestatic traceEventEnd : ()V
/*     */     //   966: goto -> 975
/*     */     //   969: aload_2
/*     */     //   970: invokeinterface skipToGroupEnd : ()V
/*     */     //   975: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #169	-> 6
/*     */     //   #235	-> 56
/*     */     //   #236	-> 68
/*     */     //   #237	-> 79
/*     */     //   #169	-> 82
/*     */     //   #237	-> 92
/*     */     //   #238	-> 94
/*     */     //   #239	-> 103
/*     */     //   #240	-> 108
/*     */     //   #236	-> 110
/*     */     //   #235	-> 111
/*     */     //   #235	-> 112
/*     */     //   #169	-> 113
/*     */     //   #171	-> 128
/*     */     //   #172	-> 134
/*     */     //   #174	-> 141
/*     */     //   #175	-> 162
/*     */     //   #241	-> 169
/*     */     //   #175	-> 175
/*     */     //   #173	-> 181
/*     */     //   #177	-> 198
/*     */     //   #242	-> 202
/*     */     //   #243	-> 214
/*     */     //   #244	-> 225
/*     */     //   #177	-> 230
/*     */     //   #244	-> 240
/*     */     //   #245	-> 242
/*     */     //   #246	-> 251
/*     */     //   #247	-> 256
/*     */     //   #243	-> 258
/*     */     //   #242	-> 259
/*     */     //   #242	-> 260
/*     */     //   #177	-> 261
/*     */     //   #180	-> 277
/*     */     //   #248	-> 348
/*     */     //   #249	-> 360
/*     */     //   #250	-> 376
/*     */     //   #180	-> 391
/*     */     //   #250	-> 418
/*     */     //   #251	-> 420
/*     */     //   #252	-> 429
/*     */     //   #253	-> 434
/*     */     //   #249	-> 436
/*     */     //   #248	-> 437
/*     */     //   #248	-> 438
/*     */     //   #180	-> 439
/*     */     //   #184	-> 458
/*     */     //   #254	-> 464
/*     */     //   #184	-> 470
/*     */     //   #185	-> 475
/*     */     //   #186	-> 483
/*     */     //   #255	-> 493
/*     */     //   #186	-> 499
/*     */     //   #170	-> 504
/*     */     //   #256	-> 523
/*     */     //   #257	-> 526
/*     */     //   #258	-> 563
/*     */     //   #259	-> 572
/*     */     //   #260	-> 577
/*     */     //   #261	-> 583
/*     */     //   #262	-> 591
/*     */     //   #264	-> 598
/*     */     //   #263	-> 620
/*     */     //   #265	-> 631
/*     */     //   #266	-> 634
/*     */     //   #267	-> 650
/*     */     //   #268	-> 655
/*     */     //   #269	-> 665
/*     */     //   #271	-> 676
/*     */     //   #273	-> 681
/*     */     //   #274	-> 690
/*     */     //   #275	-> 703
/*     */     //   #277	-> 716
/*     */     //   #278	-> 727
/*     */     //   #279	-> 734
/*     */     //   #280	-> 762
/*     */     //   #281	-> 774
/*     */     //   #283	-> 788
/*     */     //   #278	-> 789
/*     */     //   #283	-> 790
/*     */     //   #284	-> 791
/*     */     //   #285	-> 804
/*     */     //   #273	-> 805
/*     */     //   #286	-> 806
/*     */     //   #287	-> 830
/*     */     //   #189	-> 864
/*     */     //   #190	-> 869
/*     */     //   #189	-> 894
/*     */     //   #191	-> 897
/*     */     //   #188	-> 927
/*     */     //   #201	-> 930
/*     */     //   #287	-> 931
/*     */     //   #286	-> 936
/*     */     //   #288	-> 937
/*     */     //   #265	-> 943
/*     */     //   #289	-> 946
/*     */     //   #259	-> 948
/*     */     //   #290	-> 951
/*     */     //   #256	-> 953
/*     */     //   #291	-> 956
/*     */     //   #201	-> 969
/*     */     //   #202	-> 975
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   82	10	11	$i$a$-cache-JunieFilePickerKt$JunieFilePickerDialog$2$7$1$1$1$1$itemHovered$2	I
/*     */     //   94	11	11	value$iv	Ljava/lang/Object;
/*     */     //   68	43	10	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   65	46	9	it$iv	Ljava/lang/Object;
/*     */     //   56	57	8	$i$f$cache	I
/*     */     //   53	60	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   53	60	7	invalid$iv	Z
/*     */     //   169	6	7	$i$f$getDp	I
/*     */     //   166	9	6	$this$dp$iv	I
/*     */     //   230	7	12	$i$a$-cache-JunieFilePickerKt$JunieFilePickerDialog$2$7$1$1$1$1$1	I
/*     */     //   242	11	13	value$iv	Ljava/lang/Object;
/*     */     //   214	45	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   211	48	10	it$iv	Ljava/lang/Object;
/*     */     //   202	59	9	$i$f$cache	I
/*     */     //   199	62	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   199	62	8	invalid$iv	Z
/*     */     //   391	11	15	$i$a$-cache-JunieFilePickerKt$JunieFilePickerDialog$2$7$1$1$1$1$2	I
/*     */     //   420	11	16	value$iv	Ljava/lang/Object;
/*     */     //   360	77	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   357	80	13	it$iv	Ljava/lang/Object;
/*     */     //   348	91	12	$i$f$cache	I
/*     */     //   345	94	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   345	94	8	invalid$iv	Z
/*     */     //   464	6	7	$i$f$getDp	I
/*     */     //   461	9	6	$this$dp$iv	I
/*     */     //   493	6	9	$i$f$getDp	I
/*     */     //   490	9	8	$this$dp$iv	I
/*     */     //   861	70	32	$i$a$-Row-JunieFilePickerKt$JunieFilePickerDialog$2$7$1$1$1$1$3	I
/*     */     //   858	73	31	$this$invoke_u24lambda_u247	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   858	73	30	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   858	73	29	$changed	I
/*     */     //   822	114	28	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   819	117	27	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   819	117	26	$changed$iv	I
/*     */     //   734	55	25	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   731	58	24	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   727	64	23	$i$f$set-impl	I
/*     */     //   724	67	22	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   690	115	21	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   687	118	20	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   624	323	19	$i$f$ReusableComposeNode	I
/*     */     //   621	326	17	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   621	326	18	$changed$iv$iv$iv	I
/*     */     //   567	385	13	$i$f$Layout	I
/*     */     //   582	370	14	compositeKeyHash$iv$iv	I
/*     */     //   590	362	15	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   598	354	16	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   564	388	12	$changed$iv$iv	I
/*     */     //   518	439	10	$i$f$Row	I
/*     */     //   554	403	11	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   515	442	9	$changed$iv	I
/*     */     //   128	838	4	itemHovered$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   0	976	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$7$1$1$1$1;
/*     */     //   0	976	1	$this$item	Landroidx/compose/foundation/lazy/LazyItemScope;
/*     */     //   0	976	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	976	3	$changed	I
/*     */   }
/*     */   
/*     */   private static final boolean invoke$lambda$1(MutableState $itemHovered$delegate) {
/* 169 */     State state = (State)$itemHovered$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
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
/* 292 */       (Boolean)state.getValue()).booleanValue(); } private static final void invoke$lambda$2(MutableState $itemHovered$delegate, boolean <set-?>) { MutableState mutableState = $itemHovered$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 293 */     mutableState.setValue(value$iv); }
/*     */ 
/*     */   
/*     */   private static final Unit invoke$lambda$4$lambda$3(MutableState<Boolean> $itemHovered$delegate, boolean it) {
/*     */     invoke$lambda$2($itemHovered$delegate, it);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit invoke$lambda$6$lambda$5(Function1 $onFileChosen, FileListEntry $fileListEntry, Function0 $onCloseRequest) {
/*     */     $onFileChosen.invoke(new AttachedFile($fileListEntry.getFileName(), $fileListEntry.getFilePath()));
/*     */     $onCloseRequest.invoke();
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   JunieFilePickerKt$JunieFilePickerDialog$2$7$1$1$1$1(float $dialogWidthDp, long $hoveredItemBackground, Function1<AttachedFile, Unit> $onFileChosen, FileListEntry $fileListEntry, Function0<Unit> $onCloseRequest) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\JunieFilePickerKt$JunieFilePickerDialog$2$7$1$1$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */