/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.interaction.Interaction;
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.focus.FocusProperties;
/*     */ import androidx.compose.ui.geometry.OffsetKt;
/*     */ import androidx.compose.ui.geometry.Size;
/*     */ import androidx.compose.ui.graphics.Brush;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.SolidColor;
/*     */ import androidx.compose.ui.graphics.StrokeCap;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawScope;
/*     */ import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
/*     */ import androidx.compose.ui.input.pointer.PointerButton_skikoKt;
/*     */ import androidx.compose.ui.input.pointer.PointerEvent;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import org.jetbrains.jewel.ui.component.styling.TabStyle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @SourceDebugExtension({"SMAP\nTabs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tabs.kt\norg/jetbrains/jewel/ui/component/TabsKt$TabImpl$4\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,269:1\n1225#2,6:270\n1225#2,6:276\n1225#2,6:282\n1225#2,6:320\n1225#2,6:326\n99#3,3:288\n102#3:319\n106#3:337\n79#4,6:291\n86#4,4:306\n90#4,2:316\n94#4:336\n368#5,9:297\n377#5:318\n378#5,2:334\n4034#6,6:310\n149#7:332\n149#7:333\n*S KotlinDebug\n*F\n+ 1 Tabs.kt\norg/jetbrains/jewel/ui/component/TabsKt$TabImpl$4\n*L\n149#1:270,6\n157#1:276,6\n172#1:282,6\n185#1:320,6\n186#1:326,6\n145#1:288,3\n145#1:319\n145#1:337\n145#1:291,6\n145#1:306,4\n145#1:316,2\n145#1:336\n145#1:297,9\n145#1:318\n145#1:334,2\n145#1:310,6\n211#1:332\n216#1:333\n*E\n"})
/*     */ final class TabsKt$TabImpl$4
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
/*     */     //   13: ifne -> 1444
/*     */     //   16: invokestatic isTraceInProgress : ()Z
/*     */     //   19: ifeq -> 31
/*     */     //   22: ldc 248291032
/*     */     //   24: iload_2
/*     */     //   25: iconst_m1
/*     */     //   26: ldc 'org.jetbrains.jewel.ui.component.TabImpl.<anonymous> (Tabs.kt:144)'
/*     */     //   28: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   31: aload_0
/*     */     //   32: getfield $modifier : Landroidx/compose/ui/Modifier;
/*     */     //   35: aload_0
/*     */     //   36: getfield $tabStyle : Lorg/jetbrains/jewel/ui/component/styling/TabStyle;
/*     */     //   39: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/TabMetrics;
/*     */     //   42: invokevirtual getTabHeight-D9Ej5fM : ()F
/*     */     //   45: invokestatic height-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   48: aload_0
/*     */     //   49: getfield $backgroundColor$delegate : Landroidx/compose/runtime/State;
/*     */     //   52: invokestatic access$TabImpl$lambda$16 : (Landroidx/compose/runtime/State;)J
/*     */     //   55: aconst_null
/*     */     //   56: iconst_2
/*     */     //   57: aconst_null
/*     */     //   58: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   61: aload_1
/*     */     //   62: ldc 848261066
/*     */     //   64: invokeinterface startReplaceGroup : (I)V
/*     */     //   69: aload_1
/*     */     //   70: astore #5
/*     */     //   72: iconst_0
/*     */     //   73: istore #6
/*     */     //   75: nop
/*     */     //   76: iconst_0
/*     */     //   77: istore #7
/*     */     //   79: aload #5
/*     */     //   81: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   86: astore #8
/*     */     //   88: iconst_0
/*     */     //   89: istore #9
/*     */     //   91: aload #8
/*     */     //   93: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   96: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   99: if_acmpne -> 131
/*     */     //   102: astore #45
/*     */     //   104: iconst_0
/*     */     //   105: istore #10
/*     */     //   107: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   112: aload #45
/*     */     //   114: swap
/*     */     //   115: astore #10
/*     */     //   117: aload #5
/*     */     //   119: aload #10
/*     */     //   121: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   126: aload #10
/*     */     //   128: goto -> 133
/*     */     //   131: aload #8
/*     */     //   133: nop
/*     */     //   134: nop
/*     */     //   135: nop
/*     */     //   136: checkcast kotlin/jvm/functions/Function1
/*     */     //   139: astore #4
/*     */     //   141: aload_1
/*     */     //   142: invokeinterface endReplaceGroup : ()V
/*     */     //   147: aload #4
/*     */     //   149: invokestatic focusProperties : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   152: astore_3
/*     */     //   153: aload_0
/*     */     //   154: getfield $tabData : Lorg/jetbrains/jewel/ui/component/TabData;
/*     */     //   157: invokevirtual getOnClick : ()Lkotlin/jvm/functions/Function0;
/*     */     //   160: astore #4
/*     */     //   162: aload_0
/*     */     //   163: getfield $tabData : Lorg/jetbrains/jewel/ui/component/TabData;
/*     */     //   166: invokevirtual getSelected : ()Z
/*     */     //   169: istore #5
/*     */     //   171: getstatic androidx/compose/ui/semantics/Role.Companion : Landroidx/compose/ui/semantics/Role$Companion;
/*     */     //   174: invokevirtual getTab-o7Vup1c : ()I
/*     */     //   177: istore #6
/*     */     //   179: aload_3
/*     */     //   180: iload #5
/*     */     //   182: aload_0
/*     */     //   183: getfield $interactionSource : Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   186: aconst_null
/*     */     //   187: iconst_0
/*     */     //   188: iload #6
/*     */     //   190: invokestatic box-impl : (I)Landroidx/compose/ui/semantics/Role;
/*     */     //   193: aload #4
/*     */     //   195: bipush #8
/*     */     //   197: aconst_null
/*     */     //   198: invokestatic selectable-O2vRcR0$default : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   201: aload_1
/*     */     //   202: ldc 848272095
/*     */     //   204: invokeinterface startReplaceGroup : (I)V
/*     */     //   209: aload_1
/*     */     //   210: astore #4
/*     */     //   212: aload_1
/*     */     //   213: aload_0
/*     */     //   214: getfield $lineThickness : F
/*     */     //   217: invokeinterface changed : (F)Z
/*     */     //   222: aload_1
/*     */     //   223: aload_0
/*     */     //   224: getfield $lineColor$delegate : Landroidx/compose/runtime/State;
/*     */     //   227: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   232: ior
/*     */     //   233: istore #5
/*     */     //   235: aload_0
/*     */     //   236: getfield $lineThickness : F
/*     */     //   239: fstore #6
/*     */     //   241: aload_0
/*     */     //   242: getfield $lineColor$delegate : Landroidx/compose/runtime/State;
/*     */     //   245: astore #7
/*     */     //   247: iconst_0
/*     */     //   248: istore #8
/*     */     //   250: aload #4
/*     */     //   252: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   257: astore #9
/*     */     //   259: iconst_0
/*     */     //   260: istore #10
/*     */     //   262: iload #5
/*     */     //   264: ifne -> 278
/*     */     //   267: aload #9
/*     */     //   269: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   272: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   275: if_acmpne -> 311
/*     */     //   278: astore #45
/*     */     //   280: iconst_0
/*     */     //   281: istore #11
/*     */     //   283: fload #6
/*     */     //   285: aload #7
/*     */     //   287: <illegal opcode> invoke : (FLandroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function1;
/*     */     //   292: aload #45
/*     */     //   294: swap
/*     */     //   295: astore #12
/*     */     //   297: aload #4
/*     */     //   299: aload #12
/*     */     //   301: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   306: aload #12
/*     */     //   308: goto -> 313
/*     */     //   311: aload #9
/*     */     //   313: nop
/*     */     //   314: nop
/*     */     //   315: nop
/*     */     //   316: checkcast kotlin/jvm/functions/Function1
/*     */     //   319: astore_3
/*     */     //   320: aload_1
/*     */     //   321: invokeinterface endReplaceGroup : ()V
/*     */     //   326: aload_3
/*     */     //   327: invokestatic drawBehind : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   330: aload_0
/*     */     //   331: getfield $tabStyle : Lorg/jetbrains/jewel/ui/component/styling/TabStyle;
/*     */     //   334: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/TabMetrics;
/*     */     //   337: invokevirtual getTabPadding : ()Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   340: invokestatic padding : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;
/*     */     //   343: getstatic androidx/compose/ui/input/pointer/PointerEventType.Companion : Landroidx/compose/ui/input/pointer/PointerEventType$Companion;
/*     */     //   346: invokevirtual getRelease-7fucELk : ()I
/*     */     //   349: aconst_null
/*     */     //   350: aload_1
/*     */     //   351: ldc 848293893
/*     */     //   353: invokeinterface startReplaceGroup : (I)V
/*     */     //   358: aload_1
/*     */     //   359: astore #4
/*     */     //   361: aload_1
/*     */     //   362: aload_0
/*     */     //   363: getfield $tabData : Lorg/jetbrains/jewel/ui/component/TabData;
/*     */     //   366: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   371: istore #5
/*     */     //   373: aload_0
/*     */     //   374: getfield $tabData : Lorg/jetbrains/jewel/ui/component/TabData;
/*     */     //   377: astore #6
/*     */     //   379: iconst_0
/*     */     //   380: istore #7
/*     */     //   382: aload #4
/*     */     //   384: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   389: astore #8
/*     */     //   391: iconst_0
/*     */     //   392: istore #9
/*     */     //   394: iload #5
/*     */     //   396: ifne -> 410
/*     */     //   399: aload #8
/*     */     //   401: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   404: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   407: if_acmpne -> 452
/*     */     //   410: astore #47
/*     */     //   412: istore #46
/*     */     //   414: astore #45
/*     */     //   416: iconst_0
/*     */     //   417: istore #10
/*     */     //   419: aload #6
/*     */     //   421: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/component/TabData;)Lkotlin/jvm/functions/Function2;
/*     */     //   426: astore #48
/*     */     //   428: aload #45
/*     */     //   430: iload #46
/*     */     //   432: aload #47
/*     */     //   434: aload #48
/*     */     //   436: astore #11
/*     */     //   438: aload #4
/*     */     //   440: aload #11
/*     */     //   442: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   447: aload #11
/*     */     //   449: goto -> 454
/*     */     //   452: aload #8
/*     */     //   454: nop
/*     */     //   455: nop
/*     */     //   456: nop
/*     */     //   457: checkcast kotlin/jvm/functions/Function2
/*     */     //   460: astore_3
/*     */     //   461: aload_1
/*     */     //   462: invokeinterface endReplaceGroup : ()V
/*     */     //   467: aload_3
/*     */     //   468: iconst_2
/*     */     //   469: aconst_null
/*     */     //   470: invokestatic onPointerEvent-88W8MhQ$default : (Landroidx/compose/ui/Modifier;ILandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   473: astore_3
/*     */     //   474: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   477: aload_0
/*     */     //   478: getfield $tabStyle : Lorg/jetbrains/jewel/ui/component/styling/TabStyle;
/*     */     //   481: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/TabMetrics;
/*     */     //   484: invokevirtual getCloseContentGap-D9Ej5fM : ()F
/*     */     //   487: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   490: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*     */     //   493: astore #4
/*     */     //   495: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   498: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   501: astore #5
/*     */     //   503: aload_0
/*     */     //   504: getfield $tabData : Lorg/jetbrains/jewel/ui/component/TabData;
/*     */     //   507: astore #6
/*     */     //   509: aload_0
/*     */     //   510: getfield $closeButtonState$delegate : Landroidx/compose/runtime/MutableState;
/*     */     //   513: astore #7
/*     */     //   515: aload_0
/*     */     //   516: getfield $tabStyle : Lorg/jetbrains/jewel/ui/component/styling/TabStyle;
/*     */     //   519: astore #8
/*     */     //   521: aload_0
/*     */     //   522: getfield $tabState$delegate : Landroidx/compose/runtime/MutableState;
/*     */     //   525: astore #9
/*     */     //   527: sipush #384
/*     */     //   530: istore #10
/*     */     //   532: iconst_0
/*     */     //   533: istore #11
/*     */     //   535: aload_1
/*     */     //   536: ldc_w 693286680
/*     */     //   539: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   542: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   545: aload #4
/*     */     //   547: aload #5
/*     */     //   549: aload_1
/*     */     //   550: bipush #14
/*     */     //   552: iload #10
/*     */     //   554: iconst_3
/*     */     //   555: ishr
/*     */     //   556: iand
/*     */     //   557: bipush #112
/*     */     //   559: iload #10
/*     */     //   561: iconst_3
/*     */     //   562: ishr
/*     */     //   563: iand
/*     */     //   564: ior
/*     */     //   565: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   568: astore #12
/*     */     //   570: bipush #112
/*     */     //   572: iload #10
/*     */     //   574: iconst_3
/*     */     //   575: ishl
/*     */     //   576: iand
/*     */     //   577: istore #13
/*     */     //   579: nop
/*     */     //   580: iconst_0
/*     */     //   581: istore #14
/*     */     //   583: aload_1
/*     */     //   584: ldc_w -1323940314
/*     */     //   587: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   590: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   593: aload_1
/*     */     //   594: iconst_0
/*     */     //   595: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   598: istore #15
/*     */     //   600: aload_1
/*     */     //   601: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   606: astore #16
/*     */     //   608: aload_1
/*     */     //   609: aload_3
/*     */     //   610: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   613: astore #17
/*     */     //   615: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   618: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   621: astore #18
/*     */     //   623: bipush #6
/*     */     //   625: sipush #896
/*     */     //   628: iload #13
/*     */     //   630: bipush #6
/*     */     //   632: ishl
/*     */     //   633: iand
/*     */     //   634: ior
/*     */     //   635: istore #19
/*     */     //   637: nop
/*     */     //   638: iconst_0
/*     */     //   639: istore #20
/*     */     //   641: aload_1
/*     */     //   642: ldc_w -692256719
/*     */     //   645: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   648: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   651: aload_1
/*     */     //   652: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   657: instanceof androidx/compose/runtime/Applier
/*     */     //   660: ifne -> 666
/*     */     //   663: invokestatic invalidApplier : ()V
/*     */     //   666: aload_1
/*     */     //   667: invokeinterface startReusableNode : ()V
/*     */     //   672: aload_1
/*     */     //   673: invokeinterface getInserting : ()Z
/*     */     //   678: ifeq -> 692
/*     */     //   681: aload_1
/*     */     //   682: aload #18
/*     */     //   684: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   689: goto -> 698
/*     */     //   692: aload_1
/*     */     //   693: invokeinterface useNode : ()V
/*     */     //   698: aload_1
/*     */     //   699: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   702: astore #21
/*     */     //   704: iconst_0
/*     */     //   705: istore #22
/*     */     //   707: aload #21
/*     */     //   709: aload #12
/*     */     //   711: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   714: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   717: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   720: aload #21
/*     */     //   722: aload #16
/*     */     //   724: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   727: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   730: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   733: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   736: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   739: astore #23
/*     */     //   741: iconst_0
/*     */     //   742: istore #24
/*     */     //   744: aload #21
/*     */     //   746: astore #25
/*     */     //   748: iconst_0
/*     */     //   749: istore #26
/*     */     //   751: aload #25
/*     */     //   753: invokeinterface getInserting : ()Z
/*     */     //   758: ifne -> 779
/*     */     //   761: aload #25
/*     */     //   763: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   768: iload #15
/*     */     //   770: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   773: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   776: ifne -> 805
/*     */     //   779: aload #25
/*     */     //   781: iload #15
/*     */     //   783: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   786: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   791: aload #21
/*     */     //   793: iload #15
/*     */     //   795: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   798: aload #23
/*     */     //   800: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   805: nop
/*     */     //   806: nop
/*     */     //   807: nop
/*     */     //   808: aload #21
/*     */     //   810: aload #17
/*     */     //   812: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   815: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   818: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   821: nop
/*     */     //   822: nop
/*     */     //   823: aload_1
/*     */     //   824: bipush #14
/*     */     //   826: iload #19
/*     */     //   828: bipush #6
/*     */     //   830: ishr
/*     */     //   831: iand
/*     */     //   832: istore #27
/*     */     //   834: astore #28
/*     */     //   836: iconst_0
/*     */     //   837: istore #29
/*     */     //   839: aload #28
/*     */     //   841: ldc_w -407840262
/*     */     //   844: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   847: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   850: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   853: aload #28
/*     */     //   855: bipush #6
/*     */     //   857: bipush #112
/*     */     //   859: iload #10
/*     */     //   861: bipush #6
/*     */     //   863: ishr
/*     */     //   864: iand
/*     */     //   865: ior
/*     */     //   866: istore #30
/*     */     //   868: astore #31
/*     */     //   870: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   873: astore #32
/*     */     //   875: iconst_0
/*     */     //   876: istore #33
/*     */     //   878: aload #6
/*     */     //   880: invokevirtual getContent : ()Lkotlin/jvm/functions/Function4;
/*     */     //   883: new org/jetbrains/jewel/ui/component/TabContentScopeContainer
/*     */     //   886: dup
/*     */     //   887: invokespecial <init> : ()V
/*     */     //   890: aload #9
/*     */     //   892: invokestatic access$TabImpl$lambda$8 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   895: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/TabState;
/*     */     //   898: aload #31
/*     */     //   900: iconst_0
/*     */     //   901: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   904: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   909: pop
/*     */     //   910: aload #6
/*     */     //   912: astore #34
/*     */     //   914: aload #34
/*     */     //   916: instanceof org/jetbrains/jewel/ui/component/TabData$Default
/*     */     //   919: ifeq -> 933
/*     */     //   922: aload #6
/*     */     //   924: checkcast org/jetbrains/jewel/ui/component/TabData$Default
/*     */     //   927: invokevirtual getClosable : ()Z
/*     */     //   930: goto -> 990
/*     */     //   933: aload #34
/*     */     //   935: instanceof org/jetbrains/jewel/ui/component/TabData$Editor
/*     */     //   938: ifeq -> 982
/*     */     //   941: aload #6
/*     */     //   943: checkcast org/jetbrains/jewel/ui/component/TabData$Editor
/*     */     //   946: invokevirtual getClosable : ()Z
/*     */     //   949: ifeq -> 978
/*     */     //   952: aload #9
/*     */     //   954: invokestatic access$TabImpl$lambda$8 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   957: invokestatic isHovered-impl : (J)Z
/*     */     //   960: ifne -> 974
/*     */     //   963: aload #9
/*     */     //   965: invokestatic access$TabImpl$lambda$8 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   968: invokestatic isSelected-impl : (J)Z
/*     */     //   971: ifeq -> 978
/*     */     //   974: iconst_1
/*     */     //   975: goto -> 990
/*     */     //   978: iconst_0
/*     */     //   979: goto -> 990
/*     */     //   982: new kotlin/NoWhenBranchMatchedException
/*     */     //   985: dup
/*     */     //   986: invokespecial <init> : ()V
/*     */     //   989: athrow
/*     */     //   990: istore #35
/*     */     //   992: iload #35
/*     */     //   994: ifeq -> 1331
/*     */     //   997: aload #31
/*     */     //   999: ldc_w 107956748
/*     */     //   1002: invokeinterface startReplaceGroup : (I)V
/*     */     //   1007: aload #31
/*     */     //   1009: ldc_w -1797632644
/*     */     //   1012: invokeinterface startReplaceGroup : (I)V
/*     */     //   1017: aload #31
/*     */     //   1019: astore #36
/*     */     //   1021: iconst_0
/*     */     //   1022: istore #37
/*     */     //   1024: nop
/*     */     //   1025: iconst_0
/*     */     //   1026: istore #38
/*     */     //   1028: aload #36
/*     */     //   1030: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1035: astore #39
/*     */     //   1037: iconst_0
/*     */     //   1038: istore #40
/*     */     //   1040: aload #39
/*     */     //   1042: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1045: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1048: if_acmpne -> 1073
/*     */     //   1051: iconst_0
/*     */     //   1052: istore #41
/*     */     //   1054: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   1057: astore #41
/*     */     //   1059: aload #36
/*     */     //   1061: aload #41
/*     */     //   1063: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1068: aload #41
/*     */     //   1070: goto -> 1075
/*     */     //   1073: aload #39
/*     */     //   1075: nop
/*     */     //   1076: nop
/*     */     //   1077: nop
/*     */     //   1078: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   1081: astore #42
/*     */     //   1083: aload #31
/*     */     //   1085: invokeinterface endReplaceGroup : ()V
/*     */     //   1090: aload #42
/*     */     //   1092: astore #34
/*     */     //   1094: aload #34
/*     */     //   1096: aload #31
/*     */     //   1098: ldc_w -1797628671
/*     */     //   1101: invokeinterface startReplaceGroup : (I)V
/*     */     //   1106: aload #31
/*     */     //   1108: astore #36
/*     */     //   1110: aload #31
/*     */     //   1112: aload #7
/*     */     //   1114: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1119: istore #37
/*     */     //   1121: iconst_0
/*     */     //   1122: istore #38
/*     */     //   1124: aload #36
/*     */     //   1126: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1131: astore #39
/*     */     //   1133: iconst_0
/*     */     //   1134: istore #40
/*     */     //   1136: iload #37
/*     */     //   1138: ifne -> 1152
/*     */     //   1141: aload #39
/*     */     //   1143: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1146: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1149: if_acmpne -> 1191
/*     */     //   1152: astore #43
/*     */     //   1154: iconst_0
/*     */     //   1155: istore #41
/*     */     //   1157: new org/jetbrains/jewel/ui/component/TabsKt$TabImpl$4$4$1$1
/*     */     //   1160: dup
/*     */     //   1161: aload #34
/*     */     //   1163: aload #7
/*     */     //   1165: aconst_null
/*     */     //   1166: invokespecial <init> : (Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*     */     //   1169: checkcast kotlin/jvm/functions/Function2
/*     */     //   1172: aload #43
/*     */     //   1174: swap
/*     */     //   1175: astore #44
/*     */     //   1177: aload #36
/*     */     //   1179: aload #44
/*     */     //   1181: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1186: aload #44
/*     */     //   1188: goto -> 1193
/*     */     //   1191: aload #39
/*     */     //   1193: nop
/*     */     //   1194: nop
/*     */     //   1195: nop
/*     */     //   1196: checkcast kotlin/jvm/functions/Function2
/*     */     //   1199: astore #42
/*     */     //   1201: aload #31
/*     */     //   1203: invokeinterface endReplaceGroup : ()V
/*     */     //   1208: aload #42
/*     */     //   1210: aload #31
/*     */     //   1212: bipush #6
/*     */     //   1214: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1217: aload #8
/*     */     //   1219: invokevirtual getIcons : ()Lorg/jetbrains/jewel/ui/component/styling/TabIcons;
/*     */     //   1222: invokevirtual getClose : ()Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   1225: astore #42
/*     */     //   1227: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1230: astore #37
/*     */     //   1232: aload #6
/*     */     //   1234: invokevirtual getOnClose : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1237: astore #38
/*     */     //   1239: getstatic androidx/compose/ui/semantics/Role.Companion : Landroidx/compose/ui/semantics/Role$Companion;
/*     */     //   1242: invokevirtual getButton-o7Vup1c : ()I
/*     */     //   1245: istore #39
/*     */     //   1247: aload #37
/*     */     //   1249: checkcast androidx/compose/ui/Modifier
/*     */     //   1252: aload #34
/*     */     //   1254: aconst_null
/*     */     //   1255: iconst_0
/*     */     //   1256: aconst_null
/*     */     //   1257: iload #39
/*     */     //   1259: invokestatic box-impl : (I)Landroidx/compose/ui/semantics/Role;
/*     */     //   1262: aload #38
/*     */     //   1264: bipush #12
/*     */     //   1266: aconst_null
/*     */     //   1267: invokestatic clickable-O2vRcR0$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1270: bipush #16
/*     */     //   1272: istore #37
/*     */     //   1274: iconst_0
/*     */     //   1275: istore #38
/*     */     //   1277: iload #37
/*     */     //   1279: i2f
/*     */     //   1280: invokestatic constructor-impl : (F)F
/*     */     //   1283: invokestatic size-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   1286: astore #36
/*     */     //   1288: aload #7
/*     */     //   1290: invokestatic access$TabImpl$lambda$13 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1293: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/ButtonState;
/*     */     //   1296: invokestatic Stateful : (Lorg/jetbrains/jewel/foundation/state/InteractiveComponentState;)Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   1299: astore #37
/*     */     //   1301: aload #42
/*     */     //   1303: ldc_w 'Close tab'
/*     */     //   1306: aload #36
/*     */     //   1308: aconst_null
/*     */     //   1309: lconst_0
/*     */     //   1310: aload #37
/*     */     //   1312: aload #31
/*     */     //   1314: bipush #48
/*     */     //   1316: bipush #24
/*     */     //   1318: invokestatic Icon-FHprtrg : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;JLorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1321: aload #31
/*     */     //   1323: invokeinterface endReplaceGroup : ()V
/*     */     //   1328: goto -> 1405
/*     */     //   1331: aload #6
/*     */     //   1333: invokevirtual getClosable : ()Z
/*     */     //   1336: ifeq -> 1388
/*     */     //   1339: aload #31
/*     */     //   1341: ldc_w 109463441
/*     */     //   1344: invokeinterface startReplaceGroup : (I)V
/*     */     //   1349: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1352: checkcast androidx/compose/ui/Modifier
/*     */     //   1355: bipush #16
/*     */     //   1357: istore #34
/*     */     //   1359: iconst_0
/*     */     //   1360: istore #42
/*     */     //   1362: iload #34
/*     */     //   1364: i2f
/*     */     //   1365: invokestatic constructor-impl : (F)F
/*     */     //   1368: invokestatic size-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   1371: aload #31
/*     */     //   1373: bipush #6
/*     */     //   1375: invokestatic Spacer : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1378: aload #31
/*     */     //   1380: invokeinterface endReplaceGroup : ()V
/*     */     //   1385: goto -> 1405
/*     */     //   1388: aload #31
/*     */     //   1390: ldc_w 109521101
/*     */     //   1393: invokeinterface startReplaceGroup : (I)V
/*     */     //   1398: aload #31
/*     */     //   1400: invokeinterface endReplaceGroup : ()V
/*     */     //   1405: nop
/*     */     //   1406: aload #28
/*     */     //   1408: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1411: aload_1
/*     */     //   1412: invokeinterface endNode : ()V
/*     */     //   1417: aload_1
/*     */     //   1418: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1421: nop
/*     */     //   1422: aload_1
/*     */     //   1423: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1426: nop
/*     */     //   1427: aload_1
/*     */     //   1428: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1431: nop
/*     */     //   1432: invokestatic isTraceInProgress : ()Z
/*     */     //   1435: ifeq -> 1450
/*     */     //   1438: invokestatic traceEventEnd : ()V
/*     */     //   1441: goto -> 1450
/*     */     //   1444: aload_1
/*     */     //   1445: invokeinterface skipToGroupEnd : ()V
/*     */     //   1450: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #145	-> 0
/*     */     //   #146	-> 31
/*     */     //   #147	-> 35
/*     */     //   #148	-> 48
/*     */     //   #149	-> 75
/*     */     //   #270	-> 79
/*     */     //   #271	-> 91
/*     */     //   #272	-> 102
/*     */     //   #272	-> 115
/*     */     //   #273	-> 117
/*     */     //   #274	-> 126
/*     */     //   #275	-> 131
/*     */     //   #271	-> 133
/*     */     //   #270	-> 134
/*     */     //   #270	-> 135
/*     */     //   #149	-> 136
/*     */     //   #151	-> 153
/*     */     //   #152	-> 162
/*     */     //   #155	-> 171
/*     */     //   #149	-> 179
/*     */     //   #152	-> 180
/*     */     //   #153	-> 182
/*     */     //   #154	-> 186
/*     */     //   #150	-> 187
/*     */     //   #155	-> 188
/*     */     //   #151	-> 193
/*     */     //   #150	-> 195
/*     */     //   #157	-> 235
/*     */     //   #276	-> 250
/*     */     //   #277	-> 262
/*     */     //   #278	-> 278
/*     */     //   #157	-> 283
/*     */     //   #278	-> 295
/*     */     //   #279	-> 297
/*     */     //   #280	-> 306
/*     */     //   #281	-> 311
/*     */     //   #277	-> 313
/*     */     //   #276	-> 314
/*     */     //   #276	-> 315
/*     */     //   #157	-> 316
/*     */     //   #171	-> 330
/*     */     //   #172	-> 343
/*     */     //   #282	-> 382
/*     */     //   #283	-> 394
/*     */     //   #284	-> 410
/*     */     //   #172	-> 419
/*     */     //   #284	-> 436
/*     */     //   #285	-> 438
/*     */     //   #286	-> 447
/*     */     //   #287	-> 452
/*     */     //   #283	-> 454
/*     */     //   #282	-> 455
/*     */     //   #282	-> 456
/*     */     //   #172	-> 457
/*     */     //   #173	-> 474
/*     */     //   #174	-> 495
/*     */     //   #145	-> 503
/*     */     //   #288	-> 542
/*     */     //   #289	-> 545
/*     */     //   #290	-> 579
/*     */     //   #291	-> 590
/*     */     //   #292	-> 595
/*     */     //   #293	-> 601
/*     */     //   #294	-> 609
/*     */     //   #296	-> 615
/*     */     //   #295	-> 637
/*     */     //   #297	-> 648
/*     */     //   #298	-> 651
/*     */     //   #299	-> 667
/*     */     //   #300	-> 672
/*     */     //   #301	-> 682
/*     */     //   #303	-> 693
/*     */     //   #305	-> 698
/*     */     //   #306	-> 707
/*     */     //   #307	-> 720
/*     */     //   #309	-> 733
/*     */     //   #310	-> 744
/*     */     //   #311	-> 751
/*     */     //   #312	-> 779
/*     */     //   #313	-> 791
/*     */     //   #315	-> 805
/*     */     //   #310	-> 806
/*     */     //   #315	-> 807
/*     */     //   #316	-> 808
/*     */     //   #317	-> 821
/*     */     //   #305	-> 822
/*     */     //   #318	-> 823
/*     */     //   #319	-> 847
/*     */     //   #176	-> 878
/*     */     //   #179	-> 910
/*     */     //   #180	-> 914
/*     */     //   #181	-> 933
/*     */     //   #179	-> 982
/*     */     //   #178	-> 990
/*     */     //   #184	-> 992
/*     */     //   #185	-> 1024
/*     */     //   #320	-> 1028
/*     */     //   #321	-> 1040
/*     */     //   #322	-> 1051
/*     */     //   #185	-> 1054
/*     */     //   #322	-> 1057
/*     */     //   #323	-> 1059
/*     */     //   #324	-> 1068
/*     */     //   #325	-> 1073
/*     */     //   #321	-> 1075
/*     */     //   #320	-> 1076
/*     */     //   #320	-> 1077
/*     */     //   #185	-> 1078
/*     */     //   #186	-> 1094
/*     */     //   #326	-> 1124
/*     */     //   #327	-> 1136
/*     */     //   #328	-> 1152
/*     */     //   #186	-> 1157
/*     */     //   #328	-> 1175
/*     */     //   #329	-> 1177
/*     */     //   #330	-> 1186
/*     */     //   #331	-> 1191
/*     */     //   #327	-> 1193
/*     */     //   #326	-> 1194
/*     */     //   #326	-> 1195
/*     */     //   #186	-> 1196
/*     */     //   #203	-> 1217
/*     */     //   #205	-> 1227
/*     */     //   #208	-> 1232
/*     */     //   #209	-> 1239
/*     */     //   #205	-> 1247
/*     */     //   #206	-> 1252
/*     */     //   #207	-> 1254
/*     */     //   #205	-> 1255
/*     */     //   #209	-> 1257
/*     */     //   #208	-> 1262
/*     */     //   #205	-> 1264
/*     */     //   #211	-> 1270
/*     */     //   #332	-> 1277
/*     */     //   #211	-> 1283
/*     */     //   #213	-> 1288
/*     */     //   #203	-> 1301
/*     */     //   #212	-> 1303
/*     */     //   #211	-> 1306
/*     */     //   #213	-> 1310
/*     */     //   #202	-> 1318
/*     */     //   #184	-> 1321
/*     */     //   #215	-> 1331
/*     */     //   #216	-> 1349
/*     */     //   #333	-> 1362
/*     */     //   #216	-> 1368
/*     */     //   #215	-> 1378
/*     */     //   #217	-> 1388
/*     */     //   #218	-> 1405
/*     */     //   #319	-> 1406
/*     */     //   #318	-> 1411
/*     */     //   #334	-> 1412
/*     */     //   #297	-> 1418
/*     */     //   #335	-> 1421
/*     */     //   #291	-> 1423
/*     */     //   #336	-> 1426
/*     */     //   #288	-> 1428
/*     */     //   #337	-> 1431
/*     */     //   #218	-> 1444
/*     */     //   #219	-> 1450
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   107	5	10	$i$a$-cache-TabsKt$TabImpl$4$1	I
/*     */     //   117	11	10	value$iv	Ljava/lang/Object;
/*     */     //   91	43	9	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   88	46	8	it$iv	Ljava/lang/Object;
/*     */     //   79	57	7	$i$f$cache	I
/*     */     //   76	60	5	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   76	60	6	invalid$iv	Z
/*     */     //   283	9	11	$i$a$-cache-TabsKt$TabImpl$4$2	I
/*     */     //   297	11	12	value$iv	Ljava/lang/Object;
/*     */     //   262	52	10	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   259	55	9	it$iv	Ljava/lang/Object;
/*     */     //   250	66	8	$i$f$cache	I
/*     */     //   247	69	4	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   247	69	5	invalid$iv	Z
/*     */     //   419	7	10	$i$a$-cache-TabsKt$TabImpl$4$3	I
/*     */     //   438	11	11	value$iv	Ljava/lang/Object;
/*     */     //   394	61	9	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   391	64	8	it$iv	Ljava/lang/Object;
/*     */     //   382	75	7	$i$f$cache	I
/*     */     //   379	78	4	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   379	78	5	invalid$iv	Z
/*     */     //   1054	3	41	$i$a$-cache-TabsKt$TabImpl$4$4$closeActionInteractionSource$1	I
/*     */     //   1059	11	41	value$iv	Ljava/lang/Object;
/*     */     //   1040	36	40	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1037	39	39	it$iv	Ljava/lang/Object;
/*     */     //   1028	50	38	$i$f$cache	I
/*     */     //   1025	53	36	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1025	53	37	invalid$iv	Z
/*     */     //   1157	15	41	$i$a$-cache-TabsKt$TabImpl$4$4$1	I
/*     */     //   1177	11	44	value$iv	Ljava/lang/Object;
/*     */     //   1136	58	40	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1133	61	39	it$iv	Ljava/lang/Object;
/*     */     //   1124	72	38	$i$f$cache	I
/*     */     //   1121	75	36	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1121	75	37	invalid$iv	Z
/*     */     //   1277	6	38	$i$f$getDp	I
/*     */     //   1274	9	37	$this$dp$iv	I
/*     */     //   1094	227	34	closeActionInteractionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   1362	6	42	$i$f$getDp	I
/*     */     //   1359	9	34	$this$dp$iv	I
/*     */     //   878	528	33	$i$a$-Row-TabsKt$TabImpl$4$4	I
/*     */     //   992	414	35	showCloseIcon	Z
/*     */     //   875	531	32	$this$invoke_u24lambda_u248	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   875	531	31	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   875	531	30	$changed	I
/*     */     //   839	572	29	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   836	575	28	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   836	575	27	$changed$iv	I
/*     */     //   751	55	26	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   748	58	25	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   744	64	24	$i$f$set-impl	I
/*     */     //   741	67	23	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   707	115	22	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   704	118	21	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   641	781	20	$i$f$ReusableComposeNode	I
/*     */     //   638	784	18	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   638	784	19	$changed$iv$iv$iv	I
/*     */     //   583	844	14	$i$f$Layout	I
/*     */     //   600	827	15	compositeKeyHash$iv$iv	I
/*     */     //   608	819	16	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   615	812	17	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   580	847	13	$changed$iv$iv	I
/*     */     //   535	897	11	$i$f$Row	I
/*     */     //   570	862	12	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   532	900	3	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   532	900	4	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   532	900	5	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   532	900	10	$changed$iv	I
/*     */     //   0	1451	0	this	Lorg/jetbrains/jewel/ui/component/TabsKt$TabImpl$4;
/*     */     //   0	1451	1	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1451	2	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit invoke$lambda$1$lambda$0(FocusProperties $this$focusProperties) {
/* 149 */     Intrinsics.checkNotNullParameter($this$focusProperties, "$this$focusProperties"); $this$focusProperties.setCanFocus(false); return Unit.INSTANCE;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Unit invoke$lambda$3$lambda$2(float $lineThickness, State $lineColor$delegate, DrawScope $this$drawBehind) {
/* 158 */     Intrinsics.checkNotNullParameter($this$drawBehind, "$this$drawBehind"); float strokeThickness = $this$drawBehind.toPx-0680j_4($lineThickness);
/* 159 */     float startY = Size.getHeight-impl($this$drawBehind.getSize-NH-jbRc()) - strokeThickness / 2.0F;
/* 160 */     float endX = Size.getWidth-impl($this$drawBehind.getSize-NH-jbRc());
/* 161 */     float capDxFix = strokeThickness / 2.0F;
/*     */     
/* 163 */     DrawScope.drawLine-1RTmtNc$default($this$drawBehind, 
/* 164 */         (Brush)new SolidColor(TabsKt.access$TabImpl$lambda$15($lineColor$delegate), null), 
/* 165 */         OffsetKt.Offset(false + capDxFix, startY), 
/* 166 */         OffsetKt.Offset(endX - capDxFix, startY), 
/* 167 */         strokeThickness, 
/* 168 */         StrokeCap.Companion.getRound-KaPHkGw(), null, 0.0F, null, 0, 480, null);
/*     */     
/* 170 */     return Unit.INSTANCE;
/*     */   } private static final Unit invoke$lambda$5$lambda$4(TabData $tabData, AwaitPointerEventScope $this$onPointerEvent, PointerEvent it) {
/* 172 */     Intrinsics.checkNotNullParameter($this$onPointerEvent, "$this$onPointerEvent"); Intrinsics.checkNotNullParameter(it, "it"); if (PointerButton_skikoKt.isTertiary-_2OYLqQ(it.getButton-RaE_XpY())) $tabData.getOnClose().invoke();  return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   TabsKt$TabImpl$4(Modifier $modifier, TabStyle $tabStyle, TabData $tabData, MutableInteractionSource $interactionSource, float $lineThickness, State<Color> $lineColor$delegate, State<Color> $backgroundColor$delegate, MutableState<ButtonState> $closeButtonState$delegate, MutableState<TabState> $tabState$delegate) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\TabsKt$TabImpl$4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */