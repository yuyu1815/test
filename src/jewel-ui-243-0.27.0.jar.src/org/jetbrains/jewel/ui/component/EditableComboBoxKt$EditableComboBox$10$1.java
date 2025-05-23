/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.foundation.text.input.TextFieldState;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.ui.focus.FocusRequester;
/*     */ import androidx.compose.ui.focus.FocusState;
/*     */ import androidx.compose.ui.text.TextStyle;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.jewel.ui.component.styling.ComboBoxStyle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @SourceDebugExtension({"SMAP\nEditableComboBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditableComboBox.kt\norg/jetbrains/jewel/ui/component/EditableComboBoxKt$EditableComboBox$10$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,400:1\n1225#2,6:401\n1225#2,6:443\n1225#2,6:449\n1225#2,6:455\n1225#2,6:461\n1225#2,6:467\n99#3:407\n96#3,6:408\n102#3:442\n106#3:476\n79#4,6:414\n86#4,4:429\n90#4,2:439\n94#4:475\n368#5,9:420\n377#5:441\n378#5,2:473\n4034#6,6:433\n*S KotlinDebug\n*F\n+ 1 EditableComboBox.kt\norg/jetbrains/jewel/ui/component/EditableComboBoxKt$EditableComboBox$10$1\n*L\n163#1:401,6\n183#1:443,6\n184#1:449,6\n185#1:455,6\n193#1:461,6\n194#1:467,6\n161#1:407\n161#1:408,6\n161#1:442\n161#1:476\n161#1:414,6\n161#1:429,4\n161#1:439,2\n161#1:475\n161#1:420,9\n161#1:441\n161#1:473,2\n161#1:433,6\n*E\n"})
/*     */ final class EditableComboBoxKt$EditableComboBox$10$1
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
/*     */     //   13: ifne -> 1390
/*     */     //   16: invokestatic isTraceInProgress : ()Z
/*     */     //   19: ifeq -> 31
/*     */     //   22: ldc 1562002875
/*     */     //   24: iload_2
/*     */     //   25: iconst_m1
/*     */     //   26: ldc 'org.jetbrains.jewel.ui.component.EditableComboBox.<anonymous>.<anonymous> (EditableComboBox.kt:160)'
/*     */     //   28: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   31: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   34: checkcast androidx/compose/ui/Modifier
/*     */     //   37: aload_1
/*     */     //   38: ldc -1224362974
/*     */     //   40: invokeinterface startReplaceGroup : (I)V
/*     */     //   45: aload_1
/*     */     //   46: astore #4
/*     */     //   48: aload_1
/*     */     //   49: aload_0
/*     */     //   50: getfield $onPopupStateChange : Lkotlin/jvm/functions/Function1;
/*     */     //   53: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   58: istore #5
/*     */     //   60: aload_0
/*     */     //   61: getfield $comboBoxState$delegate : Landroidx/compose/runtime/MutableState;
/*     */     //   64: astore #6
/*     */     //   66: aload_0
/*     */     //   67: getfield $onPopupStateChange : Lkotlin/jvm/functions/Function1;
/*     */     //   70: astore #7
/*     */     //   72: aload_0
/*     */     //   73: getfield $popupExpanded$delegate : Landroidx/compose/runtime/MutableState;
/*     */     //   76: astore #8
/*     */     //   78: iconst_0
/*     */     //   79: istore #9
/*     */     //   81: aload #4
/*     */     //   83: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   88: astore #10
/*     */     //   90: iconst_0
/*     */     //   91: istore #11
/*     */     //   93: iload #5
/*     */     //   95: ifne -> 109
/*     */     //   98: aload #10
/*     */     //   100: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   103: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   106: if_acmpne -> 144
/*     */     //   109: astore #71
/*     */     //   111: iconst_0
/*     */     //   112: istore #12
/*     */     //   114: aload #6
/*     */     //   116: aload #7
/*     */     //   118: aload #8
/*     */     //   120: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   125: aload #71
/*     */     //   127: swap
/*     */     //   128: astore #13
/*     */     //   130: aload #4
/*     */     //   132: aload #13
/*     */     //   134: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   139: aload #13
/*     */     //   141: goto -> 146
/*     */     //   144: aload #10
/*     */     //   146: nop
/*     */     //   147: nop
/*     */     //   148: nop
/*     */     //   149: checkcast kotlin/jvm/functions/Function1
/*     */     //   152: astore_3
/*     */     //   153: aload_1
/*     */     //   154: invokeinterface endReplaceGroup : ()V
/*     */     //   159: aload_3
/*     */     //   160: invokestatic onFocusChanged : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   163: astore_3
/*     */     //   164: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   167: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   170: astore #5
/*     */     //   172: aload_0
/*     */     //   173: getfield $isEnabled : Z
/*     */     //   176: istore #6
/*     */     //   178: aload_0
/*     */     //   179: getfield $inputTextFieldState : Landroidx/compose/foundation/text/input/TextFieldState;
/*     */     //   182: astore #7
/*     */     //   184: aload_0
/*     */     //   185: getfield $textFieldFocusRequester : Landroidx/compose/ui/focus/FocusRequester;
/*     */     //   188: astore #8
/*     */     //   190: aload_0
/*     */     //   191: getfield $style : Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;
/*     */     //   194: astore #9
/*     */     //   196: aload_0
/*     */     //   197: getfield $textStyle : Landroidx/compose/ui/text/TextStyle;
/*     */     //   200: astore #10
/*     */     //   202: aload_0
/*     */     //   203: getfield $textFieldInteractionSource : Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   206: astore #11
/*     */     //   208: aload_0
/*     */     //   209: getfield $onArrowDownPress : Lkotlin/jvm/functions/Function0;
/*     */     //   212: astore #12
/*     */     //   214: aload_0
/*     */     //   215: getfield $onArrowUpPress : Lkotlin/jvm/functions/Function0;
/*     */     //   218: astore #13
/*     */     //   220: aload_0
/*     */     //   221: getfield $onEnterPress : Lkotlin/jvm/functions/Function0;
/*     */     //   224: astore #14
/*     */     //   226: aload_0
/*     */     //   227: getfield $interactionSource : Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   230: astore #15
/*     */     //   232: aload_0
/*     */     //   233: getfield $onPressWhenEnabled : Lkotlin/jvm/functions/Function0;
/*     */     //   236: astore #16
/*     */     //   238: aload_0
/*     */     //   239: getfield $comboBoxState$delegate : Landroidx/compose/runtime/MutableState;
/*     */     //   242: astore #17
/*     */     //   244: aload_0
/*     */     //   245: getfield $popupExpanded$delegate : Landroidx/compose/runtime/MutableState;
/*     */     //   248: astore #18
/*     */     //   250: aload_0
/*     */     //   251: getfield $textFieldHovered$delegate : Landroidx/compose/runtime/MutableState;
/*     */     //   254: astore #19
/*     */     //   256: aload_0
/*     */     //   257: getfield $chevronHovered$delegate : Landroidx/compose/runtime/MutableState;
/*     */     //   260: astore #20
/*     */     //   262: sipush #384
/*     */     //   265: istore #21
/*     */     //   267: iconst_0
/*     */     //   268: istore #22
/*     */     //   270: aload_1
/*     */     //   271: ldc 693286680
/*     */     //   273: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   275: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   278: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   281: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   284: astore #4
/*     */     //   286: aload #4
/*     */     //   288: aload #5
/*     */     //   290: aload_1
/*     */     //   291: bipush #14
/*     */     //   293: iload #21
/*     */     //   295: iconst_3
/*     */     //   296: ishr
/*     */     //   297: iand
/*     */     //   298: bipush #112
/*     */     //   300: iload #21
/*     */     //   302: iconst_3
/*     */     //   303: ishr
/*     */     //   304: iand
/*     */     //   305: ior
/*     */     //   306: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   309: astore #23
/*     */     //   311: bipush #112
/*     */     //   313: iload #21
/*     */     //   315: iconst_3
/*     */     //   316: ishl
/*     */     //   317: iand
/*     */     //   318: istore #24
/*     */     //   320: nop
/*     */     //   321: iconst_0
/*     */     //   322: istore #25
/*     */     //   324: aload_1
/*     */     //   325: ldc -1323940314
/*     */     //   327: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   329: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   332: aload_1
/*     */     //   333: iconst_0
/*     */     //   334: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   337: istore #26
/*     */     //   339: aload_1
/*     */     //   340: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   345: astore #27
/*     */     //   347: aload_1
/*     */     //   348: aload_3
/*     */     //   349: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   352: astore #28
/*     */     //   354: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   357: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   360: astore #29
/*     */     //   362: bipush #6
/*     */     //   364: sipush #896
/*     */     //   367: iload #24
/*     */     //   369: bipush #6
/*     */     //   371: ishl
/*     */     //   372: iand
/*     */     //   373: ior
/*     */     //   374: istore #30
/*     */     //   376: nop
/*     */     //   377: iconst_0
/*     */     //   378: istore #31
/*     */     //   380: aload_1
/*     */     //   381: ldc -692256719
/*     */     //   383: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   385: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   388: aload_1
/*     */     //   389: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   394: instanceof androidx/compose/runtime/Applier
/*     */     //   397: ifne -> 403
/*     */     //   400: invokestatic invalidApplier : ()V
/*     */     //   403: aload_1
/*     */     //   404: invokeinterface startReusableNode : ()V
/*     */     //   409: aload_1
/*     */     //   410: invokeinterface getInserting : ()Z
/*     */     //   415: ifeq -> 429
/*     */     //   418: aload_1
/*     */     //   419: aload #29
/*     */     //   421: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   426: goto -> 435
/*     */     //   429: aload_1
/*     */     //   430: invokeinterface useNode : ()V
/*     */     //   435: aload_1
/*     */     //   436: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   439: astore #32
/*     */     //   441: iconst_0
/*     */     //   442: istore #33
/*     */     //   444: aload #32
/*     */     //   446: aload #23
/*     */     //   448: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   451: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   454: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   457: aload #32
/*     */     //   459: aload #27
/*     */     //   461: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   464: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   467: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   470: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   473: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   476: astore #34
/*     */     //   478: iconst_0
/*     */     //   479: istore #35
/*     */     //   481: aload #32
/*     */     //   483: astore #36
/*     */     //   485: iconst_0
/*     */     //   486: istore #37
/*     */     //   488: aload #36
/*     */     //   490: invokeinterface getInserting : ()Z
/*     */     //   495: ifne -> 516
/*     */     //   498: aload #36
/*     */     //   500: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   505: iload #26
/*     */     //   507: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   510: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   513: ifne -> 542
/*     */     //   516: aload #36
/*     */     //   518: iload #26
/*     */     //   520: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   523: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   528: aload #32
/*     */     //   530: iload #26
/*     */     //   532: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   535: aload #34
/*     */     //   537: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   542: nop
/*     */     //   543: nop
/*     */     //   544: nop
/*     */     //   545: aload #32
/*     */     //   547: aload #28
/*     */     //   549: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   552: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   555: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   558: nop
/*     */     //   559: nop
/*     */     //   560: aload_1
/*     */     //   561: bipush #14
/*     */     //   563: iload #30
/*     */     //   565: bipush #6
/*     */     //   567: ishr
/*     */     //   568: iand
/*     */     //   569: istore #38
/*     */     //   571: astore #39
/*     */     //   573: iconst_0
/*     */     //   574: istore #40
/*     */     //   576: aload #39
/*     */     //   578: ldc_w -407840262
/*     */     //   581: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   584: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   587: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   590: aload #39
/*     */     //   592: bipush #6
/*     */     //   594: bipush #112
/*     */     //   596: iload #21
/*     */     //   598: bipush #6
/*     */     //   600: ishr
/*     */     //   601: iand
/*     */     //   602: ior
/*     */     //   603: istore #41
/*     */     //   605: astore #42
/*     */     //   607: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   610: astore #43
/*     */     //   612: iconst_0
/*     */     //   613: istore #44
/*     */     //   615: aload #17
/*     */     //   617: invokestatic access$EditableComboBox$lambda$23 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   620: invokestatic isFocused-impl : (J)Z
/*     */     //   623: istore #45
/*     */     //   625: aload #18
/*     */     //   627: invokestatic access$EditableComboBox$lambda$10 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   630: istore #46
/*     */     //   632: aload #43
/*     */     //   634: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   637: checkcast androidx/compose/ui/Modifier
/*     */     //   640: fconst_0
/*     */     //   641: iconst_1
/*     */     //   642: aconst_null
/*     */     //   643: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   646: fconst_1
/*     */     //   647: iconst_0
/*     */     //   648: iconst_2
/*     */     //   649: aconst_null
/*     */     //   650: invokestatic weight$default : (Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   653: iload #6
/*     */     //   655: aload #7
/*     */     //   657: iload #45
/*     */     //   659: aload #8
/*     */     //   661: aload #9
/*     */     //   663: iload #46
/*     */     //   665: aload #10
/*     */     //   667: aload #11
/*     */     //   669: aload #12
/*     */     //   671: aload #13
/*     */     //   673: aload #14
/*     */     //   675: aload #42
/*     */     //   677: ldc_w 455822354
/*     */     //   680: invokeinterface startReplaceGroup : (I)V
/*     */     //   685: aload #42
/*     */     //   687: astore #47
/*     */     //   689: iconst_0
/*     */     //   690: istore #48
/*     */     //   692: nop
/*     */     //   693: iconst_0
/*     */     //   694: istore #49
/*     */     //   696: aload #47
/*     */     //   698: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   703: astore #50
/*     */     //   705: iconst_0
/*     */     //   706: istore #51
/*     */     //   708: aload #50
/*     */     //   710: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   713: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   716: if_acmpne -> 797
/*     */     //   719: astore #52
/*     */     //   721: astore #53
/*     */     //   723: astore #54
/*     */     //   725: astore #55
/*     */     //   727: astore #56
/*     */     //   729: istore #57
/*     */     //   731: astore #58
/*     */     //   733: astore #59
/*     */     //   735: istore #60
/*     */     //   737: astore #61
/*     */     //   739: istore #62
/*     */     //   741: astore #63
/*     */     //   743: iconst_0
/*     */     //   744: istore #64
/*     */     //   746: aload #18
/*     */     //   748: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   753: astore #65
/*     */     //   755: aload #63
/*     */     //   757: iload #62
/*     */     //   759: aload #61
/*     */     //   761: iload #60
/*     */     //   763: aload #59
/*     */     //   765: aload #58
/*     */     //   767: iload #57
/*     */     //   769: aload #56
/*     */     //   771: aload #55
/*     */     //   773: aload #54
/*     */     //   775: aload #53
/*     */     //   777: aload #52
/*     */     //   779: aload #65
/*     */     //   781: astore #66
/*     */     //   783: aload #47
/*     */     //   785: aload #66
/*     */     //   787: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   792: aload #66
/*     */     //   794: goto -> 799
/*     */     //   797: aload #50
/*     */     //   799: nop
/*     */     //   800: nop
/*     */     //   801: nop
/*     */     //   802: checkcast kotlin/jvm/functions/Function1
/*     */     //   805: astore #67
/*     */     //   807: aload #42
/*     */     //   809: invokeinterface endReplaceGroup : ()V
/*     */     //   814: aload #67
/*     */     //   816: aload #42
/*     */     //   818: ldc_w 455824368
/*     */     //   821: invokeinterface startReplaceGroup : (I)V
/*     */     //   826: aload #42
/*     */     //   828: astore #47
/*     */     //   830: iconst_0
/*     */     //   831: istore #48
/*     */     //   833: nop
/*     */     //   834: iconst_0
/*     */     //   835: istore #49
/*     */     //   837: aload #47
/*     */     //   839: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   844: astore #50
/*     */     //   846: iconst_0
/*     */     //   847: istore #51
/*     */     //   849: aload #50
/*     */     //   851: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   854: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   857: if_acmpne -> 942
/*     */     //   860: astore #65
/*     */     //   862: astore #52
/*     */     //   864: astore #53
/*     */     //   866: astore #54
/*     */     //   868: astore #55
/*     */     //   870: astore #56
/*     */     //   872: istore #57
/*     */     //   874: astore #58
/*     */     //   876: astore #59
/*     */     //   878: istore #60
/*     */     //   880: astore #61
/*     */     //   882: istore #62
/*     */     //   884: astore #63
/*     */     //   886: iconst_0
/*     */     //   887: istore #64
/*     */     //   889: aload #17
/*     */     //   891: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   896: astore #68
/*     */     //   898: aload #63
/*     */     //   900: iload #62
/*     */     //   902: aload #61
/*     */     //   904: iload #60
/*     */     //   906: aload #59
/*     */     //   908: aload #58
/*     */     //   910: iload #57
/*     */     //   912: aload #56
/*     */     //   914: aload #55
/*     */     //   916: aload #54
/*     */     //   918: aload #53
/*     */     //   920: aload #52
/*     */     //   922: aload #65
/*     */     //   924: aload #68
/*     */     //   926: astore #66
/*     */     //   928: aload #47
/*     */     //   930: aload #66
/*     */     //   932: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   937: aload #66
/*     */     //   939: goto -> 944
/*     */     //   942: aload #50
/*     */     //   944: nop
/*     */     //   945: nop
/*     */     //   946: nop
/*     */     //   947: checkcast kotlin/jvm/functions/Function1
/*     */     //   950: astore #67
/*     */     //   952: aload #42
/*     */     //   954: invokeinterface endReplaceGroup : ()V
/*     */     //   959: aload #67
/*     */     //   961: aload #42
/*     */     //   963: ldc_w 455827285
/*     */     //   966: invokeinterface startReplaceGroup : (I)V
/*     */     //   971: aload #42
/*     */     //   973: astore #47
/*     */     //   975: iconst_0
/*     */     //   976: istore #48
/*     */     //   978: nop
/*     */     //   979: iconst_0
/*     */     //   980: istore #49
/*     */     //   982: aload #47
/*     */     //   984: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   989: astore #50
/*     */     //   991: iconst_0
/*     */     //   992: istore #51
/*     */     //   994: aload #50
/*     */     //   996: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   999: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1002: if_acmpne -> 1091
/*     */     //   1005: astore #68
/*     */     //   1007: astore #65
/*     */     //   1009: astore #52
/*     */     //   1011: astore #53
/*     */     //   1013: astore #54
/*     */     //   1015: astore #55
/*     */     //   1017: astore #56
/*     */     //   1019: istore #57
/*     */     //   1021: astore #58
/*     */     //   1023: astore #59
/*     */     //   1025: istore #60
/*     */     //   1027: astore #61
/*     */     //   1029: istore #62
/*     */     //   1031: astore #63
/*     */     //   1033: iconst_0
/*     */     //   1034: istore #64
/*     */     //   1036: aload #19
/*     */     //   1038: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   1043: astore #69
/*     */     //   1045: aload #63
/*     */     //   1047: iload #62
/*     */     //   1049: aload #61
/*     */     //   1051: iload #60
/*     */     //   1053: aload #59
/*     */     //   1055: aload #58
/*     */     //   1057: iload #57
/*     */     //   1059: aload #56
/*     */     //   1061: aload #55
/*     */     //   1063: aload #54
/*     */     //   1065: aload #53
/*     */     //   1067: aload #52
/*     */     //   1069: aload #65
/*     */     //   1071: aload #68
/*     */     //   1073: aload #69
/*     */     //   1075: astore #66
/*     */     //   1077: aload #47
/*     */     //   1079: aload #66
/*     */     //   1081: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1086: aload #66
/*     */     //   1088: goto -> 1093
/*     */     //   1091: aload #50
/*     */     //   1093: nop
/*     */     //   1094: nop
/*     */     //   1095: nop
/*     */     //   1096: checkcast kotlin/jvm/functions/Function1
/*     */     //   1099: astore #67
/*     */     //   1101: aload #42
/*     */     //   1103: invokeinterface endReplaceGroup : ()V
/*     */     //   1108: aload #67
/*     */     //   1110: aload #42
/*     */     //   1112: ldc_w 100687872
/*     */     //   1115: sipush #28032
/*     */     //   1118: invokestatic access$TextInput : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/text/input/TextFieldState;ZLandroidx/compose/ui/focus/FocusRequester;Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;ZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1121: iload #6
/*     */     //   1123: aload #9
/*     */     //   1125: aload #15
/*     */     //   1127: aload #42
/*     */     //   1129: ldc_w 455837299
/*     */     //   1132: invokeinterface startReplaceGroup : (I)V
/*     */     //   1137: aload #42
/*     */     //   1139: astore #46
/*     */     //   1141: iconst_0
/*     */     //   1142: istore #70
/*     */     //   1144: nop
/*     */     //   1145: iconst_0
/*     */     //   1146: istore #67
/*     */     //   1148: aload #46
/*     */     //   1150: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1155: astore #47
/*     */     //   1157: iconst_0
/*     */     //   1158: istore #48
/*     */     //   1160: aload #47
/*     */     //   1162: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1165: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1168: if_acmpne -> 1213
/*     */     //   1171: astore #61
/*     */     //   1173: astore #62
/*     */     //   1175: istore #63
/*     */     //   1177: iconst_0
/*     */     //   1178: istore #49
/*     */     //   1180: aload #20
/*     */     //   1182: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   1187: astore #60
/*     */     //   1189: iload #63
/*     */     //   1191: aload #62
/*     */     //   1193: aload #61
/*     */     //   1195: aload #60
/*     */     //   1197: astore #50
/*     */     //   1199: aload #46
/*     */     //   1201: aload #50
/*     */     //   1203: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1208: aload #50
/*     */     //   1210: goto -> 1215
/*     */     //   1213: aload #47
/*     */     //   1215: nop
/*     */     //   1216: nop
/*     */     //   1217: nop
/*     */     //   1218: checkcast kotlin/jvm/functions/Function1
/*     */     //   1221: astore #45
/*     */     //   1223: aload #42
/*     */     //   1225: invokeinterface endReplaceGroup : ()V
/*     */     //   1230: aload #45
/*     */     //   1232: aload #42
/*     */     //   1234: ldc_w 455839346
/*     */     //   1237: invokeinterface startReplaceGroup : (I)V
/*     */     //   1242: aload #42
/*     */     //   1244: astore #46
/*     */     //   1246: iconst_0
/*     */     //   1247: istore #70
/*     */     //   1249: nop
/*     */     //   1250: iconst_0
/*     */     //   1251: istore #67
/*     */     //   1253: aload #46
/*     */     //   1255: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1260: astore #47
/*     */     //   1262: iconst_0
/*     */     //   1263: istore #48
/*     */     //   1265: aload #47
/*     */     //   1267: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1270: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1273: if_acmpne -> 1322
/*     */     //   1276: astore #60
/*     */     //   1278: astore #61
/*     */     //   1280: astore #62
/*     */     //   1282: istore #63
/*     */     //   1284: iconst_0
/*     */     //   1285: istore #49
/*     */     //   1287: aload #18
/*     */     //   1289: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   1294: astore #59
/*     */     //   1296: iload #63
/*     */     //   1298: aload #62
/*     */     //   1300: aload #61
/*     */     //   1302: aload #60
/*     */     //   1304: aload #59
/*     */     //   1306: astore #50
/*     */     //   1308: aload #46
/*     */     //   1310: aload #50
/*     */     //   1312: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1317: aload #50
/*     */     //   1319: goto -> 1324
/*     */     //   1322: aload #47
/*     */     //   1324: nop
/*     */     //   1325: nop
/*     */     //   1326: nop
/*     */     //   1327: checkcast kotlin/jvm/functions/Function1
/*     */     //   1330: astore #45
/*     */     //   1332: aload #42
/*     */     //   1334: invokeinterface endReplaceGroup : ()V
/*     */     //   1339: aload #45
/*     */     //   1341: aload #16
/*     */     //   1343: aload #42
/*     */     //   1345: sipush #27648
/*     */     //   1348: invokestatic access$Chevron : (ZLorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1351: nop
/*     */     //   1352: aload #39
/*     */     //   1354: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1357: aload_1
/*     */     //   1358: invokeinterface endNode : ()V
/*     */     //   1363: aload_1
/*     */     //   1364: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1367: nop
/*     */     //   1368: aload_1
/*     */     //   1369: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1372: nop
/*     */     //   1373: aload_1
/*     */     //   1374: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1377: nop
/*     */     //   1378: invokestatic isTraceInProgress : ()Z
/*     */     //   1381: ifeq -> 1396
/*     */     //   1384: invokestatic traceEventEnd : ()V
/*     */     //   1387: goto -> 1396
/*     */     //   1390: aload_1
/*     */     //   1391: invokeinterface skipToGroupEnd : ()V
/*     */     //   1396: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #161	-> 0
/*     */     //   #163	-> 31
/*     */     //   #401	-> 81
/*     */     //   #402	-> 93
/*     */     //   #403	-> 109
/*     */     //   #163	-> 114
/*     */     //   #403	-> 128
/*     */     //   #404	-> 130
/*     */     //   #405	-> 139
/*     */     //   #406	-> 144
/*     */     //   #402	-> 146
/*     */     //   #401	-> 147
/*     */     //   #401	-> 148
/*     */     //   #163	-> 149
/*     */     //   #169	-> 164
/*     */     //   #161	-> 172
/*     */     //   #407	-> 275
/*     */     //   #408	-> 278
/*     */     //   #412	-> 286
/*     */     //   #413	-> 320
/*     */     //   #414	-> 329
/*     */     //   #415	-> 334
/*     */     //   #416	-> 340
/*     */     //   #417	-> 348
/*     */     //   #419	-> 354
/*     */     //   #418	-> 376
/*     */     //   #420	-> 385
/*     */     //   #421	-> 388
/*     */     //   #422	-> 404
/*     */     //   #423	-> 409
/*     */     //   #424	-> 419
/*     */     //   #426	-> 430
/*     */     //   #428	-> 435
/*     */     //   #429	-> 444
/*     */     //   #430	-> 457
/*     */     //   #432	-> 470
/*     */     //   #433	-> 481
/*     */     //   #434	-> 488
/*     */     //   #435	-> 516
/*     */     //   #436	-> 528
/*     */     //   #438	-> 542
/*     */     //   #433	-> 543
/*     */     //   #438	-> 544
/*     */     //   #439	-> 545
/*     */     //   #440	-> 558
/*     */     //   #428	-> 559
/*     */     //   #441	-> 560
/*     */     //   #442	-> 584
/*     */     //   #174	-> 615
/*     */     //   #177	-> 625
/*     */     //   #186	-> 632
/*     */     //   #172	-> 653
/*     */     //   #173	-> 655
/*     */     //   #174	-> 657
/*     */     //   #175	-> 659
/*     */     //   #176	-> 661
/*     */     //   #177	-> 663
/*     */     //   #178	-> 665
/*     */     //   #179	-> 667
/*     */     //   #180	-> 669
/*     */     //   #181	-> 671
/*     */     //   #182	-> 673
/*     */     //   #183	-> 692
/*     */     //   #443	-> 696
/*     */     //   #444	-> 708
/*     */     //   #445	-> 719
/*     */     //   #183	-> 746
/*     */     //   #445	-> 781
/*     */     //   #446	-> 783
/*     */     //   #447	-> 792
/*     */     //   #448	-> 797
/*     */     //   #444	-> 799
/*     */     //   #443	-> 800
/*     */     //   #443	-> 801
/*     */     //   #183	-> 802
/*     */     //   #184	-> 833
/*     */     //   #449	-> 837
/*     */     //   #450	-> 849
/*     */     //   #451	-> 860
/*     */     //   #184	-> 889
/*     */     //   #451	-> 926
/*     */     //   #452	-> 928
/*     */     //   #453	-> 937
/*     */     //   #454	-> 942
/*     */     //   #450	-> 944
/*     */     //   #449	-> 945
/*     */     //   #449	-> 946
/*     */     //   #184	-> 947
/*     */     //   #185	-> 978
/*     */     //   #455	-> 982
/*     */     //   #456	-> 994
/*     */     //   #457	-> 1005
/*     */     //   #185	-> 1036
/*     */     //   #457	-> 1075
/*     */     //   #458	-> 1077
/*     */     //   #459	-> 1086
/*     */     //   #460	-> 1091
/*     */     //   #456	-> 1093
/*     */     //   #455	-> 1094
/*     */     //   #455	-> 1095
/*     */     //   #185	-> 1096
/*     */     //   #171	-> 1118
/*     */     //   #190	-> 1121
/*     */     //   #191	-> 1123
/*     */     //   #192	-> 1125
/*     */     //   #193	-> 1144
/*     */     //   #461	-> 1148
/*     */     //   #462	-> 1160
/*     */     //   #463	-> 1171
/*     */     //   #193	-> 1180
/*     */     //   #463	-> 1197
/*     */     //   #464	-> 1199
/*     */     //   #465	-> 1208
/*     */     //   #466	-> 1213
/*     */     //   #462	-> 1215
/*     */     //   #461	-> 1216
/*     */     //   #461	-> 1217
/*     */     //   #193	-> 1218
/*     */     //   #194	-> 1249
/*     */     //   #467	-> 1253
/*     */     //   #468	-> 1265
/*     */     //   #469	-> 1276
/*     */     //   #194	-> 1287
/*     */     //   #469	-> 1306
/*     */     //   #470	-> 1308
/*     */     //   #471	-> 1317
/*     */     //   #472	-> 1322
/*     */     //   #468	-> 1324
/*     */     //   #467	-> 1325
/*     */     //   #467	-> 1326
/*     */     //   #194	-> 1327
/*     */     //   #195	-> 1341
/*     */     //   #189	-> 1348
/*     */     //   #197	-> 1351
/*     */     //   #442	-> 1352
/*     */     //   #441	-> 1357
/*     */     //   #473	-> 1358
/*     */     //   #420	-> 1364
/*     */     //   #474	-> 1367
/*     */     //   #414	-> 1369
/*     */     //   #475	-> 1372
/*     */     //   #407	-> 1374
/*     */     //   #476	-> 1377
/*     */     //   #197	-> 1390
/*     */     //   #198	-> 1396
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   114	11	12	$i$a$-cache-EditableComboBoxKt$EditableComboBox$10$1$1	I
/*     */     //   130	11	13	value$iv	Ljava/lang/Object;
/*     */     //   93	54	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   90	57	10	it$iv	Ljava/lang/Object;
/*     */     //   81	68	9	$i$f$cache	I
/*     */     //   78	71	4	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   78	71	5	invalid$iv	Z
/*     */     //   746	7	64	$i$a$-cache-EditableComboBoxKt$EditableComboBox$10$1$2$1	I
/*     */     //   783	11	66	value$iv	Ljava/lang/Object;
/*     */     //   708	92	51	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   705	95	50	it$iv	Ljava/lang/Object;
/*     */     //   696	106	49	$i$f$cache	I
/*     */     //   693	109	47	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   693	109	48	invalid$iv	Z
/*     */     //   889	7	64	$i$a$-cache-EditableComboBoxKt$EditableComboBox$10$1$2$2	I
/*     */     //   928	11	66	value$iv	Ljava/lang/Object;
/*     */     //   849	96	51	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   846	99	50	it$iv	Ljava/lang/Object;
/*     */     //   837	110	49	$i$f$cache	I
/*     */     //   834	113	47	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   834	113	48	invalid$iv	Z
/*     */     //   1036	7	64	$i$a$-cache-EditableComboBoxKt$EditableComboBox$10$1$2$3	I
/*     */     //   1077	11	66	value$iv	Ljava/lang/Object;
/*     */     //   994	100	51	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   991	103	50	it$iv	Ljava/lang/Object;
/*     */     //   982	114	49	$i$f$cache	I
/*     */     //   979	117	47	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   979	117	48	invalid$iv	Z
/*     */     //   1180	7	49	$i$a$-cache-EditableComboBoxKt$EditableComboBox$10$1$2$4	I
/*     */     //   1199	11	50	value$iv	Ljava/lang/Object;
/*     */     //   1160	56	48	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1157	59	47	it$iv	Ljava/lang/Object;
/*     */     //   1148	70	67	$i$f$cache	I
/*     */     //   1145	73	46	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1145	73	70	invalid$iv	Z
/*     */     //   1287	7	49	$i$a$-cache-EditableComboBoxKt$EditableComboBox$10$1$2$5	I
/*     */     //   1308	11	50	value$iv	Ljava/lang/Object;
/*     */     //   1265	60	48	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1262	63	47	it$iv	Ljava/lang/Object;
/*     */     //   1253	74	67	$i$f$cache	I
/*     */     //   1250	77	46	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1250	77	70	invalid$iv	Z
/*     */     //   615	737	44	$i$a$-Row-EditableComboBoxKt$EditableComboBox$10$1$2	I
/*     */     //   612	740	43	$this$invoke_u24lambda_u2412	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   612	740	42	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   612	740	41	$changed	I
/*     */     //   576	781	40	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   573	784	39	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   573	784	38	$changed$iv	I
/*     */     //   488	55	37	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   485	58	36	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   481	64	35	$i$f$set-impl	I
/*     */     //   478	67	34	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   444	115	33	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   441	118	32	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   380	988	31	$i$f$ReusableComposeNode	I
/*     */     //   377	991	29	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   377	991	30	$changed$iv$iv$iv	I
/*     */     //   324	1049	25	$i$f$Layout	I
/*     */     //   339	1034	26	compositeKeyHash$iv$iv	I
/*     */     //   347	1026	27	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   354	1019	28	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   321	1052	24	$changed$iv$iv	I
/*     */     //   270	1108	22	$i$f$Row	I
/*     */     //   311	1067	23	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   267	1111	3	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   286	1092	4	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   267	1111	5	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   267	1111	21	$changed$iv	I
/*     */     //   0	1397	0	this	Lorg/jetbrains/jewel/ui/component/EditableComboBoxKt$EditableComboBox$10$1;
/*     */     //   0	1397	1	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1397	2	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit invoke$lambda$1$lambda$0(MutableState $comboBoxState$delegate, Function1 $onPopupStateChange, MutableState $popupExpanded$delegate, FocusState it) {
/* 164 */     Intrinsics.checkNotNullParameter(it, "it"); EditableComboBoxKt.access$EditableComboBox$lambda$24($comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(EditableComboBoxKt.access$EditableComboBox$lambda$23($comboBoxState$delegate), false, it.isFocused(), false, false, false, 29, null));
/* 165 */     if (!it.isFocused()) {
/* 166 */       EditableComboBoxKt.access$EditableComboBox$setPopupExpanded($onPopupStateChange, $popupExpanded$delegate, false);
/*     */     }
/* 168 */     return Unit.INSTANCE;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Unit invoke$lambda$12$lambda$3$lambda$2(MutableState $popupExpanded$delegate, boolean it) {
/* 183 */     EditableComboBoxKt.access$EditableComboBox$lambda$11($popupExpanded$delegate, it); return Unit.INSTANCE;
/* 184 */   } private static final Unit invoke$lambda$12$lambda$5$lambda$4(MutableState $comboBoxState$delegate, boolean it) { EditableComboBoxKt.access$EditableComboBox$lambda$24($comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(EditableComboBoxKt.access$EditableComboBox$lambda$23($comboBoxState$delegate), false, it, false, false, false, 29, null)); return Unit.INSTANCE; } private static final Unit invoke$lambda$12$lambda$7$lambda$6(MutableState $textFieldHovered$delegate, boolean it) {
/* 185 */     EditableComboBoxKt.access$EditableComboBox$lambda$17($textFieldHovered$delegate, it); return Unit.INSTANCE;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Unit invoke$lambda$12$lambda$9$lambda$8(MutableState $chevronHovered$delegate, boolean it) {
/* 193 */     EditableComboBoxKt.access$EditableComboBox$lambda$14($chevronHovered$delegate, it); return Unit.INSTANCE; } private static final Unit invoke$lambda$12$lambda$11$lambda$10(MutableState $popupExpanded$delegate, boolean it) {
/* 194 */     EditableComboBoxKt.access$EditableComboBox$lambda$11($popupExpanded$delegate, it); return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   EditableComboBoxKt$EditableComboBox$10$1(Function1<Boolean, Unit> $onPopupStateChange, MutableState<ComboBoxState> $comboBoxState$delegate, MutableState<Boolean> $popupExpanded$delegate, boolean $isEnabled, TextFieldState $inputTextFieldState, FocusRequester $textFieldFocusRequester, ComboBoxStyle $style, TextStyle $textStyle, MutableInteractionSource $textFieldInteractionSource, Function0<Unit> $onArrowDownPress, Function0<Unit> $onArrowUpPress, Function0<Unit> $onEnterPress, MutableInteractionSource $interactionSource, Function0<Unit> $onPressWhenEnabled, MutableState<Boolean> $textFieldHovered$delegate, MutableState<Boolean> $chevronHovered$delegate) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\EditableComboBoxKt$EditableComboBox$10$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */