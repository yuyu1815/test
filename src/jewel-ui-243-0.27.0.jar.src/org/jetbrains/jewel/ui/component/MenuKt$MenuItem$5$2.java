/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import org.jetbrains.jewel.ui.component.styling.MenuItemColors;
/*     */ import org.jetbrains.jewel.ui.component.styling.MenuItemMetrics;
/*     */ import org.jetbrains.jewel.ui.component.styling.MenuStyle;
/*     */ import org.jetbrains.jewel.ui.icon.IconKey;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\norg/jetbrains/jewel/ui/component/MenuKt$MenuItem$5$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,706:1\n149#2:707\n99#3,3:708\n102#3:739\n106#3:789\n79#4,6:711\n86#4,4:726\n90#4,2:736\n79#4,6:747\n86#4,4:762\n90#4,2:772\n94#4:778\n94#4:788\n368#5,9:717\n377#5:738\n368#5,9:753\n377#5:774\n378#5,2:776\n378#5,2:786\n4034#6,6:730\n4034#6,6:766\n71#7:740\n68#7,6:741\n74#7:775\n78#7:779\n1225#8,6:780\n81#9:790\n*S KotlinDebug\n*F\n+ 1 Menu.kt\norg/jetbrains/jewel/ui/component/MenuKt$MenuItem$5$2\n*L\n409#1:707\n403#1:708,3\n403#1:739\n403#1:789\n403#1:711,6\n403#1:726,4\n403#1:736,2\n421#1:747,6\n421#1:762,4\n421#1:772,2\n421#1:778\n403#1:788\n403#1:717,9\n403#1:738\n421#1:753,9\n421#1:774\n421#1:776,2\n403#1:786,2\n403#1:730,6\n421#1:766,6\n421#1:740\n421#1:741,6\n421#1:775\n421#1:779\n425#1:780,6\n401#1:790\n*E\n"})
/*     */ final class MenuKt$MenuItem$5$2
/*     */   implements Function2<Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: iload_2
/*     */     //   1: iconst_3
/*     */     //   2: iand
/*     */     //   3: iconst_2
/*     */     //   4: if_icmpne -> 16
/*     */     //   7: aload_1
/*     */     //   8: invokeinterface getSkipping : ()Z
/*     */     //   13: ifne -> 1383
/*     */     //   16: invokestatic isTraceInProgress : ()Z
/*     */     //   19: ifeq -> 31
/*     */     //   22: ldc 2016063468
/*     */     //   24: iload_2
/*     */     //   25: iconst_m1
/*     */     //   26: ldc 'org.jetbrains.jewel.ui.component.MenuItem.<anonymous>.<anonymous> (Menu.kt:400)'
/*     */     //   28: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   31: aload_0
/*     */     //   32: getfield $itemColors : Lorg/jetbrains/jewel/ui/component/styling/MenuItemColors;
/*     */     //   35: aload_0
/*     */     //   36: getfield $itemState$delegate : Landroidx/compose/runtime/MutableState;
/*     */     //   39: invokestatic access$MenuItem$lambda$37 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   42: aload_1
/*     */     //   43: iconst_0
/*     */     //   44: invokevirtual backgroundFor-VIR8D2g : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   47: astore_3
/*     */     //   48: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   51: checkcast androidx/compose/ui/Modifier
/*     */     //   54: fconst_0
/*     */     //   55: iconst_1
/*     */     //   56: aconst_null
/*     */     //   57: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   60: fconst_0
/*     */     //   61: aload_0
/*     */     //   62: getfield $itemMetrics : Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;
/*     */     //   65: invokevirtual getMinHeight-D9Ej5fM : ()F
/*     */     //   68: iconst_1
/*     */     //   69: aconst_null
/*     */     //   70: invokestatic defaultMinSize-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   73: aload_0
/*     */     //   74: getfield $itemMetrics : Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;
/*     */     //   77: aload_3
/*     */     //   78: invokestatic invoke$lambda$0 : (Landroidx/compose/runtime/State;)J
/*     */     //   81: invokestatic access$drawItemBackground-mxwnekA : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;J)Landroidx/compose/ui/Modifier;
/*     */     //   84: aload_0
/*     */     //   85: getfield $itemMetrics : Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;
/*     */     //   88: invokevirtual getContentPadding : ()Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   91: invokestatic padding : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;
/*     */     //   94: astore #4
/*     */     //   96: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   99: iconst_4
/*     */     //   100: istore #5
/*     */     //   102: iconst_0
/*     */     //   103: istore #6
/*     */     //   105: iload #5
/*     */     //   107: i2f
/*     */     //   108: invokestatic constructor-impl : (F)F
/*     */     //   111: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   114: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*     */     //   117: astore #5
/*     */     //   119: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   122: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   125: astore #6
/*     */     //   127: aload_0
/*     */     //   128: getfield $canShowIcon : Z
/*     */     //   131: istore #7
/*     */     //   133: aload_0
/*     */     //   134: getfield $style : Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;
/*     */     //   137: astore #8
/*     */     //   139: aload_0
/*     */     //   140: getfield $iconKey : Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   143: astore #9
/*     */     //   145: aload_0
/*     */     //   146: getfield $canShowKeybinding : Z
/*     */     //   149: istore #10
/*     */     //   151: aload_0
/*     */     //   152: getfield $keybinding : Ljava/util/Set;
/*     */     //   155: astore #11
/*     */     //   157: aload_0
/*     */     //   158: getfield $itemColors : Lorg/jetbrains/jewel/ui/component/styling/MenuItemColors;
/*     */     //   161: astore #12
/*     */     //   163: aload_0
/*     */     //   164: getfield $content : Lkotlin/jvm/functions/Function2;
/*     */     //   167: astore #13
/*     */     //   169: aload_0
/*     */     //   170: getfield $itemState$delegate : Landroidx/compose/runtime/MutableState;
/*     */     //   173: astore #14
/*     */     //   175: sipush #432
/*     */     //   178: istore #15
/*     */     //   180: iconst_0
/*     */     //   181: istore #16
/*     */     //   183: aload_1
/*     */     //   184: ldc 693286680
/*     */     //   186: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   188: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   191: aload #5
/*     */     //   193: aload #6
/*     */     //   195: aload_1
/*     */     //   196: bipush #14
/*     */     //   198: iload #15
/*     */     //   200: iconst_3
/*     */     //   201: ishr
/*     */     //   202: iand
/*     */     //   203: bipush #112
/*     */     //   205: iload #15
/*     */     //   207: iconst_3
/*     */     //   208: ishr
/*     */     //   209: iand
/*     */     //   210: ior
/*     */     //   211: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   214: astore #17
/*     */     //   216: bipush #112
/*     */     //   218: iload #15
/*     */     //   220: iconst_3
/*     */     //   221: ishl
/*     */     //   222: iand
/*     */     //   223: istore #18
/*     */     //   225: nop
/*     */     //   226: iconst_0
/*     */     //   227: istore #19
/*     */     //   229: aload_1
/*     */     //   230: ldc -1323940314
/*     */     //   232: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   234: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   237: aload_1
/*     */     //   238: iconst_0
/*     */     //   239: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   242: istore #20
/*     */     //   244: aload_1
/*     */     //   245: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   250: astore #21
/*     */     //   252: aload_1
/*     */     //   253: aload #4
/*     */     //   255: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   258: astore #22
/*     */     //   260: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   263: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   266: astore #23
/*     */     //   268: bipush #6
/*     */     //   270: sipush #896
/*     */     //   273: iload #18
/*     */     //   275: bipush #6
/*     */     //   277: ishl
/*     */     //   278: iand
/*     */     //   279: ior
/*     */     //   280: istore #24
/*     */     //   282: nop
/*     */     //   283: iconst_0
/*     */     //   284: istore #25
/*     */     //   286: aload_1
/*     */     //   287: ldc -692256719
/*     */     //   289: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   291: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   294: aload_1
/*     */     //   295: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   300: instanceof androidx/compose/runtime/Applier
/*     */     //   303: ifne -> 309
/*     */     //   306: invokestatic invalidApplier : ()V
/*     */     //   309: aload_1
/*     */     //   310: invokeinterface startReusableNode : ()V
/*     */     //   315: aload_1
/*     */     //   316: invokeinterface getInserting : ()Z
/*     */     //   321: ifeq -> 335
/*     */     //   324: aload_1
/*     */     //   325: aload #23
/*     */     //   327: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   332: goto -> 341
/*     */     //   335: aload_1
/*     */     //   336: invokeinterface useNode : ()V
/*     */     //   341: aload_1
/*     */     //   342: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   345: astore #26
/*     */     //   347: iconst_0
/*     */     //   348: istore #27
/*     */     //   350: aload #26
/*     */     //   352: aload #17
/*     */     //   354: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   357: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   360: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   363: aload #26
/*     */     //   365: aload #21
/*     */     //   367: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   370: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   373: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   376: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   379: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   382: astore #28
/*     */     //   384: iconst_0
/*     */     //   385: istore #29
/*     */     //   387: aload #26
/*     */     //   389: astore #30
/*     */     //   391: iconst_0
/*     */     //   392: istore #31
/*     */     //   394: aload #30
/*     */     //   396: invokeinterface getInserting : ()Z
/*     */     //   401: ifne -> 422
/*     */     //   404: aload #30
/*     */     //   406: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   411: iload #20
/*     */     //   413: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   416: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   419: ifne -> 448
/*     */     //   422: aload #30
/*     */     //   424: iload #20
/*     */     //   426: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   429: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   434: aload #26
/*     */     //   436: iload #20
/*     */     //   438: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   441: aload #28
/*     */     //   443: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   448: nop
/*     */     //   449: nop
/*     */     //   450: nop
/*     */     //   451: aload #26
/*     */     //   453: aload #22
/*     */     //   455: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   458: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   461: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   464: nop
/*     */     //   465: nop
/*     */     //   466: aload_1
/*     */     //   467: bipush #14
/*     */     //   469: iload #24
/*     */     //   471: bipush #6
/*     */     //   473: ishr
/*     */     //   474: iand
/*     */     //   475: istore #32
/*     */     //   477: astore #33
/*     */     //   479: iconst_0
/*     */     //   480: istore #34
/*     */     //   482: aload #33
/*     */     //   484: ldc_w -407840262
/*     */     //   487: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   490: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   493: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   496: aload #33
/*     */     //   498: bipush #6
/*     */     //   500: bipush #112
/*     */     //   502: iload #15
/*     */     //   504: bipush #6
/*     */     //   506: ishr
/*     */     //   507: iand
/*     */     //   508: ior
/*     */     //   509: istore #35
/*     */     //   511: astore #36
/*     */     //   513: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   516: astore #37
/*     */     //   518: iconst_0
/*     */     //   519: istore #38
/*     */     //   521: aload #36
/*     */     //   523: ldc_w -182433379
/*     */     //   526: invokeinterface startReplaceGroup : (I)V
/*     */     //   531: iload #7
/*     */     //   533: ifeq -> 628
/*     */     //   536: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   539: checkcast androidx/compose/ui/Modifier
/*     */     //   542: aload #8
/*     */     //   544: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/MenuMetrics;
/*     */     //   547: invokevirtual getItemMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;
/*     */     //   550: invokevirtual getIconSize-D9Ej5fM : ()F
/*     */     //   553: invokestatic size-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   556: astore #39
/*     */     //   558: aload #9
/*     */     //   560: ifnull -> 603
/*     */     //   563: aload #36
/*     */     //   565: ldc_w -1360327362
/*     */     //   568: invokeinterface startReplaceGroup : (I)V
/*     */     //   573: aload #9
/*     */     //   575: aconst_null
/*     */     //   576: aload #39
/*     */     //   578: aconst_null
/*     */     //   579: lconst_0
/*     */     //   580: iconst_0
/*     */     //   581: anewarray org/jetbrains/jewel/ui/painter/PainterHint
/*     */     //   584: aload #36
/*     */     //   586: bipush #48
/*     */     //   588: bipush #24
/*     */     //   590: invokestatic Icon-FHprtrg : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V
/*     */     //   593: aload #36
/*     */     //   595: invokeinterface endReplaceGroup : ()V
/*     */     //   600: goto -> 628
/*     */     //   603: aload #36
/*     */     //   605: ldc_w -1360204695
/*     */     //   608: invokeinterface startReplaceGroup : (I)V
/*     */     //   613: aload #39
/*     */     //   615: aload #36
/*     */     //   617: iconst_0
/*     */     //   618: invokestatic Box : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   621: aload #36
/*     */     //   623: invokeinterface endReplaceGroup : ()V
/*     */     //   628: aload #36
/*     */     //   630: invokeinterface endReplaceGroup : ()V
/*     */     //   635: aload #37
/*     */     //   637: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   640: checkcast androidx/compose/ui/Modifier
/*     */     //   643: fconst_1
/*     */     //   644: iconst_1
/*     */     //   645: invokeinterface weight : (Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;
/*     */     //   650: astore #39
/*     */     //   652: iconst_0
/*     */     //   653: istore #40
/*     */     //   655: iconst_0
/*     */     //   656: istore #41
/*     */     //   658: aload #36
/*     */     //   660: ldc_w 733328855
/*     */     //   663: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   666: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   669: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   672: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   675: astore #42
/*     */     //   677: iconst_0
/*     */     //   678: istore #43
/*     */     //   680: aload #42
/*     */     //   682: iload #43
/*     */     //   684: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   687: astore #44
/*     */     //   689: bipush #112
/*     */     //   691: iload #40
/*     */     //   693: iconst_3
/*     */     //   694: ishl
/*     */     //   695: iand
/*     */     //   696: istore #45
/*     */     //   698: nop
/*     */     //   699: iconst_0
/*     */     //   700: istore #46
/*     */     //   702: aload #36
/*     */     //   704: ldc -1323940314
/*     */     //   706: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   708: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   711: aload #36
/*     */     //   713: iconst_0
/*     */     //   714: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   717: istore #47
/*     */     //   719: aload #36
/*     */     //   721: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   726: astore #48
/*     */     //   728: aload #36
/*     */     //   730: aload #39
/*     */     //   732: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   735: astore #49
/*     */     //   737: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   740: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   743: astore #50
/*     */     //   745: bipush #6
/*     */     //   747: sipush #896
/*     */     //   750: iload #45
/*     */     //   752: bipush #6
/*     */     //   754: ishl
/*     */     //   755: iand
/*     */     //   756: ior
/*     */     //   757: istore #51
/*     */     //   759: nop
/*     */     //   760: iconst_0
/*     */     //   761: istore #52
/*     */     //   763: aload #36
/*     */     //   765: ldc -692256719
/*     */     //   767: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   769: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   772: aload #36
/*     */     //   774: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   779: instanceof androidx/compose/runtime/Applier
/*     */     //   782: ifne -> 788
/*     */     //   785: invokestatic invalidApplier : ()V
/*     */     //   788: aload #36
/*     */     //   790: invokeinterface startReusableNode : ()V
/*     */     //   795: aload #36
/*     */     //   797: invokeinterface getInserting : ()Z
/*     */     //   802: ifeq -> 817
/*     */     //   805: aload #36
/*     */     //   807: aload #50
/*     */     //   809: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   814: goto -> 824
/*     */     //   817: aload #36
/*     */     //   819: invokeinterface useNode : ()V
/*     */     //   824: aload #36
/*     */     //   826: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   829: astore #53
/*     */     //   831: iconst_0
/*     */     //   832: istore #54
/*     */     //   834: aload #53
/*     */     //   836: aload #44
/*     */     //   838: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   841: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   844: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   847: aload #53
/*     */     //   849: aload #48
/*     */     //   851: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   854: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   857: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   860: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   863: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   866: astore #55
/*     */     //   868: iconst_0
/*     */     //   869: istore #56
/*     */     //   871: aload #53
/*     */     //   873: astore #57
/*     */     //   875: iconst_0
/*     */     //   876: istore #58
/*     */     //   878: aload #57
/*     */     //   880: invokeinterface getInserting : ()Z
/*     */     //   885: ifne -> 906
/*     */     //   888: aload #57
/*     */     //   890: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   895: iload #47
/*     */     //   897: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   900: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   903: ifne -> 932
/*     */     //   906: aload #57
/*     */     //   908: iload #47
/*     */     //   910: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   913: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   918: aload #53
/*     */     //   920: iload #47
/*     */     //   922: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   925: aload #55
/*     */     //   927: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   932: nop
/*     */     //   933: nop
/*     */     //   934: nop
/*     */     //   935: aload #53
/*     */     //   937: aload #49
/*     */     //   939: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   942: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   945: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   948: nop
/*     */     //   949: nop
/*     */     //   950: aload #36
/*     */     //   952: bipush #14
/*     */     //   954: iload #51
/*     */     //   956: bipush #6
/*     */     //   958: ishr
/*     */     //   959: iand
/*     */     //   960: istore #59
/*     */     //   962: astore #60
/*     */     //   964: iconst_0
/*     */     //   965: istore #61
/*     */     //   967: aload #60
/*     */     //   969: ldc_w -2146769399
/*     */     //   972: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   975: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   978: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   981: aload #60
/*     */     //   983: bipush #6
/*     */     //   985: bipush #112
/*     */     //   987: iload #40
/*     */     //   989: bipush #6
/*     */     //   991: ishr
/*     */     //   992: iand
/*     */     //   993: ior
/*     */     //   994: istore #62
/*     */     //   996: astore #63
/*     */     //   998: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   1001: astore #64
/*     */     //   1003: iconst_0
/*     */     //   1004: istore #65
/*     */     //   1006: aload #13
/*     */     //   1008: aload #63
/*     */     //   1010: iconst_0
/*     */     //   1011: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1014: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1019: pop
/*     */     //   1020: aload #60
/*     */     //   1022: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1025: aload #36
/*     */     //   1027: invokeinterface endNode : ()V
/*     */     //   1032: aload #36
/*     */     //   1034: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1037: nop
/*     */     //   1038: aload #36
/*     */     //   1040: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1043: nop
/*     */     //   1044: aload #36
/*     */     //   1046: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1049: nop
/*     */     //   1050: aload #36
/*     */     //   1052: ldc_w -182418353
/*     */     //   1055: invokeinterface startReplaceGroup : (I)V
/*     */     //   1060: iload #10
/*     */     //   1062: ifeq -> 1337
/*     */     //   1065: aload #36
/*     */     //   1067: ldc_w -182415854
/*     */     //   1070: invokeinterface startReplaceGroup : (I)V
/*     */     //   1075: aload #36
/*     */     //   1077: astore #43
/*     */     //   1079: aload #36
/*     */     //   1081: aload #11
/*     */     //   1083: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1088: istore #40
/*     */     //   1090: iconst_0
/*     */     //   1091: istore #41
/*     */     //   1093: aload #43
/*     */     //   1095: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1100: astore #44
/*     */     //   1102: iconst_0
/*     */     //   1103: istore #45
/*     */     //   1105: iload #40
/*     */     //   1107: ifne -> 1121
/*     */     //   1110: aload #44
/*     */     //   1112: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1115: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1118: if_acmpne -> 1239
/*     */     //   1121: iconst_0
/*     */     //   1122: istore #46
/*     */     //   1124: invokestatic getHostOs : ()Lorg/jetbrains/skiko/OS;
/*     */     //   1127: invokevirtual isMacOS : ()Z
/*     */     //   1130: ifeq -> 1179
/*     */     //   1133: aload #11
/*     */     //   1135: dup
/*     */     //   1136: ifnull -> 1166
/*     */     //   1139: checkcast java/lang/Iterable
/*     */     //   1142: ldc_w ' '
/*     */     //   1145: checkcast java/lang/CharSequence
/*     */     //   1148: aconst_null
/*     */     //   1149: aconst_null
/*     */     //   1150: iconst_0
/*     */     //   1151: aconst_null
/*     */     //   1152: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   1157: bipush #30
/*     */     //   1159: aconst_null
/*     */     //   1160: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   1163: goto -> 1168
/*     */     //   1166: pop
/*     */     //   1167: aconst_null
/*     */     //   1168: dup
/*     */     //   1169: ifnonnull -> 1222
/*     */     //   1172: pop
/*     */     //   1173: ldc_w ''
/*     */     //   1176: goto -> 1222
/*     */     //   1179: aload #11
/*     */     //   1181: dup
/*     */     //   1182: ifnull -> 1212
/*     */     //   1185: checkcast java/lang/Iterable
/*     */     //   1188: ldc_w ' + '
/*     */     //   1191: checkcast java/lang/CharSequence
/*     */     //   1194: aconst_null
/*     */     //   1195: aconst_null
/*     */     //   1196: iconst_0
/*     */     //   1197: aconst_null
/*     */     //   1198: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   1203: bipush #30
/*     */     //   1205: aconst_null
/*     */     //   1206: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   1209: goto -> 1214
/*     */     //   1212: pop
/*     */     //   1213: aconst_null
/*     */     //   1214: dup
/*     */     //   1215: ifnonnull -> 1222
/*     */     //   1218: pop
/*     */     //   1219: ldc_w ''
/*     */     //   1222: nop
/*     */     //   1223: astore #47
/*     */     //   1225: aload #43
/*     */     //   1227: aload #47
/*     */     //   1229: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1234: aload #47
/*     */     //   1236: goto -> 1241
/*     */     //   1239: aload #44
/*     */     //   1241: nop
/*     */     //   1242: nop
/*     */     //   1243: nop
/*     */     //   1244: checkcast java/lang/String
/*     */     //   1247: astore #42
/*     */     //   1249: aload #36
/*     */     //   1251: invokeinterface endReplaceGroup : ()V
/*     */     //   1256: aload #42
/*     */     //   1258: astore #39
/*     */     //   1260: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1263: checkcast androidx/compose/ui/Modifier
/*     */     //   1266: aload #8
/*     */     //   1268: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/MenuMetrics;
/*     */     //   1271: invokevirtual getItemMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;
/*     */     //   1274: invokevirtual getKeybindingsPadding : ()Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   1277: invokestatic padding : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;
/*     */     //   1280: astore #42
/*     */     //   1282: aload #12
/*     */     //   1284: aload #14
/*     */     //   1286: invokestatic access$MenuItem$lambda$37 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1289: aload #36
/*     */     //   1291: iconst_0
/*     */     //   1292: invokevirtual keybindingTintFor-VIR8D2g : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1295: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   1300: checkcast androidx/compose/ui/graphics/Color
/*     */     //   1303: invokevirtual unbox-impl : ()J
/*     */     //   1306: lstore #66
/*     */     //   1308: aload #39
/*     */     //   1310: aload #42
/*     */     //   1312: lload #66
/*     */     //   1314: lconst_0
/*     */     //   1315: aconst_null
/*     */     //   1316: aconst_null
/*     */     //   1317: aconst_null
/*     */     //   1318: lconst_0
/*     */     //   1319: aconst_null
/*     */     //   1320: iconst_0
/*     */     //   1321: lconst_0
/*     */     //   1322: iconst_0
/*     */     //   1323: iconst_0
/*     */     //   1324: iconst_0
/*     */     //   1325: aconst_null
/*     */     //   1326: aconst_null
/*     */     //   1327: aload #36
/*     */     //   1329: iconst_0
/*     */     //   1330: iconst_0
/*     */     //   1331: ldc_w 65528
/*     */     //   1334: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1337: aload #36
/*     */     //   1339: invokeinterface endReplaceGroup : ()V
/*     */     //   1344: nop
/*     */     //   1345: aload #33
/*     */     //   1347: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1350: aload_1
/*     */     //   1351: invokeinterface endNode : ()V
/*     */     //   1356: aload_1
/*     */     //   1357: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1360: nop
/*     */     //   1361: aload_1
/*     */     //   1362: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1365: nop
/*     */     //   1366: aload_1
/*     */     //   1367: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1370: nop
/*     */     //   1371: invokestatic isTraceInProgress : ()Z
/*     */     //   1374: ifeq -> 1389
/*     */     //   1377: invokestatic traceEventEnd : ()V
/*     */     //   1380: goto -> 1389
/*     */     //   1383: aload_1
/*     */     //   1384: invokeinterface skipToGroupEnd : ()V
/*     */     //   1389: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #401	-> 0
/*     */     //   #405	-> 48
/*     */     //   #406	-> 60
/*     */     //   #407	-> 73
/*     */     //   #408	-> 84
/*     */     //   #409	-> 96
/*     */     //   #707	-> 105
/*     */     //   #409	-> 111
/*     */     //   #410	-> 119
/*     */     //   #403	-> 127
/*     */     //   #708	-> 188
/*     */     //   #709	-> 191
/*     */     //   #710	-> 225
/*     */     //   #711	-> 234
/*     */     //   #712	-> 239
/*     */     //   #713	-> 245
/*     */     //   #714	-> 253
/*     */     //   #716	-> 260
/*     */     //   #715	-> 282
/*     */     //   #717	-> 291
/*     */     //   #718	-> 294
/*     */     //   #719	-> 310
/*     */     //   #720	-> 315
/*     */     //   #721	-> 325
/*     */     //   #723	-> 336
/*     */     //   #725	-> 341
/*     */     //   #726	-> 350
/*     */     //   #727	-> 363
/*     */     //   #729	-> 376
/*     */     //   #730	-> 387
/*     */     //   #731	-> 394
/*     */     //   #732	-> 422
/*     */     //   #733	-> 434
/*     */     //   #735	-> 448
/*     */     //   #730	-> 449
/*     */     //   #735	-> 450
/*     */     //   #736	-> 451
/*     */     //   #737	-> 464
/*     */     //   #725	-> 465
/*     */     //   #738	-> 466
/*     */     //   #739	-> 490
/*     */     //   #412	-> 531
/*     */     //   #413	-> 536
/*     */     //   #414	-> 558
/*     */     //   #415	-> 573
/*     */     //   #414	-> 593
/*     */     //   #416	-> 603
/*     */     //   #417	-> 613
/*     */     //   #416	-> 621
/*     */     //   #421	-> 635
/*     */     //   #740	-> 666
/*     */     //   #741	-> 669
/*     */     //   #742	-> 677
/*     */     //   #745	-> 680
/*     */     //   #746	-> 698
/*     */     //   #747	-> 708
/*     */     //   #748	-> 714
/*     */     //   #749	-> 721
/*     */     //   #750	-> 730
/*     */     //   #752	-> 737
/*     */     //   #751	-> 759
/*     */     //   #753	-> 769
/*     */     //   #754	-> 772
/*     */     //   #755	-> 790
/*     */     //   #756	-> 795
/*     */     //   #757	-> 807
/*     */     //   #759	-> 819
/*     */     //   #761	-> 824
/*     */     //   #762	-> 834
/*     */     //   #763	-> 847
/*     */     //   #765	-> 860
/*     */     //   #766	-> 871
/*     */     //   #767	-> 878
/*     */     //   #768	-> 906
/*     */     //   #769	-> 918
/*     */     //   #771	-> 932
/*     */     //   #766	-> 933
/*     */     //   #771	-> 934
/*     */     //   #772	-> 935
/*     */     //   #773	-> 948
/*     */     //   #761	-> 949
/*     */     //   #774	-> 950
/*     */     //   #775	-> 975
/*     */     //   #421	-> 1006
/*     */     //   #775	-> 1020
/*     */     //   #774	-> 1025
/*     */     //   #776	-> 1027
/*     */     //   #753	-> 1034
/*     */     //   #777	-> 1037
/*     */     //   #747	-> 1040
/*     */     //   #778	-> 1043
/*     */     //   #740	-> 1046
/*     */     //   #779	-> 1049
/*     */     //   #423	-> 1060
/*     */     //   #425	-> 1081
/*     */     //   #780	-> 1093
/*     */     //   #781	-> 1105
/*     */     //   #782	-> 1121
/*     */     //   #426	-> 1124
/*     */     //   #427	-> 1133
/*     */     //   #429	-> 1179
/*     */     //   #430	-> 1222
/*     */     //   #782	-> 1223
/*     */     //   #783	-> 1225
/*     */     //   #784	-> 1234
/*     */     //   #785	-> 1239
/*     */     //   #781	-> 1241
/*     */     //   #780	-> 1242
/*     */     //   #780	-> 1243
/*     */     //   #425	-> 1244
/*     */     //   #424	-> 1258
/*     */     //   #433	-> 1260
/*     */     //   #435	-> 1282
/*     */     //   #434	-> 1308
/*     */     //   #433	-> 1310
/*     */     //   #435	-> 1312
/*     */     //   #432	-> 1334
/*     */     //   #438	-> 1344
/*     */     //   #739	-> 1345
/*     */     //   #738	-> 1350
/*     */     //   #786	-> 1351
/*     */     //   #717	-> 1357
/*     */     //   #787	-> 1360
/*     */     //   #711	-> 1362
/*     */     //   #788	-> 1365
/*     */     //   #708	-> 1367
/*     */     //   #789	-> 1370
/*     */     //   #438	-> 1383
/*     */     //   #439	-> 1389
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   105	6	6	$i$f$getDp	I
/*     */     //   102	9	5	$this$dp$iv	I
/*     */     //   558	70	39	iconModifier	Landroidx/compose/ui/Modifier;
/*     */     //   1006	14	65	$i$a$-Box-MenuKt$MenuItem$5$2$1$1	I
/*     */     //   1003	17	64	$this$invoke_u24lambda_u245_u24lambda_u241	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   1003	17	63	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1003	17	62	$changed	I
/*     */     //   967	58	61	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   964	61	60	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   964	61	59	$changed$iv	I
/*     */     //   878	55	58	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   875	58	57	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   871	64	56	$i$f$set-impl	I
/*     */     //   868	67	55	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   834	115	54	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   831	118	53	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   763	275	52	$i$f$ReusableComposeNode	I
/*     */     //   760	278	50	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   760	278	51	$changed$iv$iv$iv	I
/*     */     //   702	342	46	$i$f$Layout	I
/*     */     //   719	325	47	compositeKeyHash$iv$iv	I
/*     */     //   728	316	48	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   737	307	49	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   699	345	45	$changed$iv$iv	I
/*     */     //   658	392	41	$i$f$Box	I
/*     */     //   689	361	44	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   655	395	39	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   677	373	42	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   680	370	43	propagateMinConstraints$iv	Z
/*     */     //   655	395	40	$changed$iv	I
/*     */     //   1124	99	46	$i$a$-cache-MenuKt$MenuItem$5$2$1$keybindingText$1	I
/*     */     //   1225	11	47	value$iv	Ljava/lang/Object;
/*     */     //   1105	137	45	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1102	140	44	it$iv	Ljava/lang/Object;
/*     */     //   1093	151	41	$i$f$cache	I
/*     */     //   1090	154	43	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1090	154	40	invalid$iv	Z
/*     */     //   1260	77	39	keybindingText	Ljava/lang/String;
/*     */     //   521	824	38	$i$a$-Row-MenuKt$MenuItem$5$2$1	I
/*     */     //   518	827	37	$this$invoke_u24lambda_u245	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   518	827	36	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   518	827	35	$changed	I
/*     */     //   482	868	34	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   479	871	33	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   479	871	32	$changed$iv	I
/*     */     //   394	55	31	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   391	58	30	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   387	64	29	$i$f$set-impl	I
/*     */     //   384	67	28	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   350	115	27	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   347	118	26	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   286	1075	25	$i$f$ReusableComposeNode	I
/*     */     //   283	1078	23	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   283	1078	24	$changed$iv$iv$iv	I
/*     */     //   229	1137	19	$i$f$Layout	I
/*     */     //   244	1122	20	compositeKeyHash$iv$iv	I
/*     */     //   252	1114	21	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   260	1106	22	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   226	1140	18	$changed$iv$iv	I
/*     */     //   183	1188	16	$i$f$Row	I
/*     */     //   216	1155	17	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   180	1191	4	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   180	1191	5	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   180	1191	6	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   180	1191	15	$changed$iv	I
/*     */     //   48	1332	3	backgroundColor$delegate	Landroidx/compose/runtime/State;
/*     */     //   0	1390	0	this	Lorg/jetbrains/jewel/ui/component/MenuKt$MenuItem$5$2;
/*     */     //   0	1390	1	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1390	2	$changed	I
/*     */   }
/*     */   
/*     */   private static final long invoke$lambda$0(State $backgroundColor$delegate) {
/* 401 */     State state = $backgroundColor$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 790 */       (Color)state.getValue()).unbox-impl();
/*     */   }
/*     */   
/*     */   private static final CharSequence invoke$lambda$5$lambda$4$lambda$2(String it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return it;
/*     */   }
/*     */   
/*     */   private static final CharSequence invoke$lambda$5$lambda$4$lambda$3(String it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return it;
/*     */   }
/*     */   
/*     */   MenuKt$MenuItem$5$2(MenuItemColors $itemColors, MenuItemMetrics $itemMetrics, MutableState<MenuItemState> $itemState$delegate, boolean $canShowIcon, MenuStyle $style, IconKey $iconKey, boolean $canShowKeybinding, Set<String> $keybinding, Function2<Composer, Integer, Unit> $content) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\MenuKt$MenuItem$5$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */