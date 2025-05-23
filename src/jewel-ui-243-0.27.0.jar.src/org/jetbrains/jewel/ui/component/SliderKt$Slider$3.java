/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.gestures.DragScope;
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.foundation.layout.BoxWithConstraintsScope;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.MutableFloatState;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.focus.FocusRequester;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.Boxing;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.FunctionReferenceImpl;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.ranges.ClosedFloatingPointRange;
/*     */ import kotlin.ranges.RangesKt;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.jewel.ui.component.styling.SliderStyle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\norg/jetbrains/jewel/ui/component/SliderKt$Slider$3\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,707:1\n77#2:708\n481#3:709\n480#3,4:710\n484#3,2:717\n488#3:723\n1225#4,3:714\n1228#4,3:720\n1225#4,6:724\n1225#4,6:730\n1225#4,6:736\n1225#4,6:742\n1225#4,6:748\n1225#4,6:754\n480#5:719\n*S KotlinDebug\n*F\n+ 1 Slider.kt\norg/jetbrains/jewel/ui/component/SliderKt$Slider$3\n*L\n133#1:708\n142#1:709\n142#1:710,4\n142#1:717,2\n142#1:723\n142#1:714,3\n142#1:720,3\n143#1:724,6\n144#1:730,6\n147#1:736,6\n156#1:742,6\n160#1:748,6\n196#1:754,6\n142#1:719\n*E\n"})
/*     */ final class SliderKt$Slider$3
/*     */   implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(BoxWithConstraintsScope $this$BoxWithConstraints, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc '$this$BoxWithConstraints'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: iload_3
/*     */     //   7: istore #4
/*     */     //   9: iload_3
/*     */     //   10: bipush #6
/*     */     //   12: iand
/*     */     //   13: ifne -> 36
/*     */     //   16: iload #4
/*     */     //   18: aload_2
/*     */     //   19: aload_1
/*     */     //   20: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   25: ifeq -> 32
/*     */     //   28: iconst_4
/*     */     //   29: goto -> 33
/*     */     //   32: iconst_2
/*     */     //   33: ior
/*     */     //   34: istore #4
/*     */     //   36: iload #4
/*     */     //   38: bipush #19
/*     */     //   40: iand
/*     */     //   41: bipush #18
/*     */     //   43: if_icmpne -> 55
/*     */     //   46: aload_2
/*     */     //   47: invokeinterface getSkipping : ()Z
/*     */     //   52: ifne -> 1453
/*     */     //   55: invokestatic isTraceInProgress : ()Z
/*     */     //   58: ifeq -> 71
/*     */     //   61: ldc 477427455
/*     */     //   63: iload #4
/*     */     //   65: iconst_m1
/*     */     //   66: ldc 'org.jetbrains.jewel.ui.component.Slider.<anonymous> (Slider.kt:128)'
/*     */     //   68: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   71: aload_1
/*     */     //   72: invokeinterface getConstraints-msEJaDk : ()J
/*     */     //   77: invokestatic getMaxWidth-impl : (J)I
/*     */     //   80: i2f
/*     */     //   81: fstore #5
/*     */     //   83: new kotlin/jvm/internal/Ref$FloatRef
/*     */     //   86: dup
/*     */     //   87: invokespecial <init> : ()V
/*     */     //   90: astore #6
/*     */     //   92: new kotlin/jvm/internal/Ref$FloatRef
/*     */     //   95: dup
/*     */     //   96: invokespecial <init> : ()V
/*     */     //   99: astore #7
/*     */     //   101: invokestatic getLocalDensity : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   104: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   107: astore #8
/*     */     //   109: iconst_0
/*     */     //   110: istore #9
/*     */     //   112: iconst_0
/*     */     //   113: istore #10
/*     */     //   115: aload_2
/*     */     //   116: ldc 2023513938
/*     */     //   118: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   120: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   123: aload_2
/*     */     //   124: aload #8
/*     */     //   126: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   131: astore #11
/*     */     //   133: aload_2
/*     */     //   134: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   137: aload #11
/*     */     //   139: astore #8
/*     */     //   141: aload_0
/*     */     //   142: getfield $thumbSize : J
/*     */     //   145: lstore #9
/*     */     //   147: aload #8
/*     */     //   149: checkcast androidx/compose/ui/unit/Density
/*     */     //   152: astore #11
/*     */     //   154: iconst_0
/*     */     //   155: istore #12
/*     */     //   157: aload #6
/*     */     //   159: fload #5
/*     */     //   161: aload #11
/*     */     //   163: lload #9
/*     */     //   165: invokestatic getWidth-D9Ej5fM : (J)F
/*     */     //   168: invokeinterface toPx-0680j_4 : (F)F
/*     */     //   173: fsub
/*     */     //   174: fconst_0
/*     */     //   175: invokestatic max : (FF)F
/*     */     //   178: putfield element : F
/*     */     //   181: aload #7
/*     */     //   183: aload #11
/*     */     //   185: lload #9
/*     */     //   187: invokestatic getWidth-D9Ej5fM : (J)F
/*     */     //   190: invokeinterface toPx-0680j_4 : (F)F
/*     */     //   195: aload #6
/*     */     //   197: getfield element : F
/*     */     //   200: invokestatic min : (FF)F
/*     */     //   203: putfield element : F
/*     */     //   206: nop
/*     */     //   207: iconst_0
/*     */     //   208: istore #10
/*     */     //   210: nop
/*     */     //   211: iconst_0
/*     */     //   212: istore #11
/*     */     //   214: aload_2
/*     */     //   215: ldc 773894976
/*     */     //   217: ldc 'CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp'
/*     */     //   219: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   222: aload_2
/*     */     //   223: astore #12
/*     */     //   225: aload_2
/*     */     //   226: ldc -954370320
/*     */     //   228: ldc 'CC(remember):Effects.kt#9igjgp'
/*     */     //   230: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   233: aload_2
/*     */     //   234: astore #13
/*     */     //   236: iconst_0
/*     */     //   237: istore #14
/*     */     //   239: iconst_0
/*     */     //   240: istore #15
/*     */     //   242: aload #13
/*     */     //   244: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   249: astore #16
/*     */     //   251: iconst_0
/*     */     //   252: istore #17
/*     */     //   254: aload #16
/*     */     //   256: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   259: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   262: if_acmpne -> 309
/*     */     //   265: iconst_0
/*     */     //   266: istore #18
/*     */     //   268: iconst_0
/*     */     //   269: istore #19
/*     */     //   271: getstatic kotlin/coroutines/EmptyCoroutineContext.INSTANCE : Lkotlin/coroutines/EmptyCoroutineContext;
/*     */     //   274: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   277: aload #12
/*     */     //   279: invokestatic createCompositionCoroutineScope : (Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;
/*     */     //   282: astore #35
/*     */     //   284: new androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*     */     //   287: dup
/*     */     //   288: aload #35
/*     */     //   290: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;)V
/*     */     //   293: astore #19
/*     */     //   295: aload #13
/*     */     //   297: aload #19
/*     */     //   299: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   304: aload #19
/*     */     //   306: goto -> 311
/*     */     //   309: aload #16
/*     */     //   311: nop
/*     */     //   312: nop
/*     */     //   313: nop
/*     */     //   314: checkcast androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*     */     //   317: astore #20
/*     */     //   319: aload_2
/*     */     //   320: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   323: aload #20
/*     */     //   325: astore #21
/*     */     //   327: aload #21
/*     */     //   329: invokevirtual getCoroutineScope : ()Lkotlinx/coroutines/CoroutineScope;
/*     */     //   332: astore #20
/*     */     //   334: aload_2
/*     */     //   335: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   338: aload #20
/*     */     //   340: nop
/*     */     //   341: astore #8
/*     */     //   343: aload_2
/*     */     //   344: ldc 1210089908
/*     */     //   346: invokeinterface startReplaceGroup : (I)V
/*     */     //   351: aload_2
/*     */     //   352: astore #11
/*     */     //   354: iconst_0
/*     */     //   355: istore #12
/*     */     //   357: aload_0
/*     */     //   358: getfield $value : F
/*     */     //   361: fstore #13
/*     */     //   363: aload_0
/*     */     //   364: getfield $valueRange : Lkotlin/ranges/ClosedFloatingPointRange;
/*     */     //   367: astore #14
/*     */     //   369: iconst_0
/*     */     //   370: istore #15
/*     */     //   372: aload #11
/*     */     //   374: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   379: astore #16
/*     */     //   381: iconst_0
/*     */     //   382: istore #17
/*     */     //   384: aload #16
/*     */     //   386: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   389: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   392: if_acmpne -> 428
/*     */     //   395: iconst_0
/*     */     //   396: istore #18
/*     */     //   398: aload #14
/*     */     //   400: aload #7
/*     */     //   402: aload #6
/*     */     //   404: fload #13
/*     */     //   406: invokestatic invoke$scaleToOffset : (Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F
/*     */     //   409: invokestatic mutableFloatStateOf : (F)Landroidx/compose/runtime/MutableFloatState;
/*     */     //   412: astore #19
/*     */     //   414: aload #11
/*     */     //   416: aload #19
/*     */     //   418: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   423: aload #19
/*     */     //   425: goto -> 430
/*     */     //   428: aload #16
/*     */     //   430: nop
/*     */     //   431: nop
/*     */     //   432: nop
/*     */     //   433: checkcast androidx/compose/runtime/MutableFloatState
/*     */     //   436: astore #10
/*     */     //   438: aload_2
/*     */     //   439: invokeinterface endReplaceGroup : ()V
/*     */     //   444: aload #10
/*     */     //   446: astore #9
/*     */     //   448: aload_2
/*     */     //   449: ldc 1210092482
/*     */     //   451: invokeinterface startReplaceGroup : (I)V
/*     */     //   456: aload_2
/*     */     //   457: astore #12
/*     */     //   459: iconst_0
/*     */     //   460: istore #13
/*     */     //   462: nop
/*     */     //   463: iconst_0
/*     */     //   464: istore #14
/*     */     //   466: aload #12
/*     */     //   468: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   473: astore #15
/*     */     //   475: iconst_0
/*     */     //   476: istore #16
/*     */     //   478: aload #15
/*     */     //   480: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   483: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   486: if_acmpne -> 512
/*     */     //   489: iconst_0
/*     */     //   490: istore #17
/*     */     //   492: fconst_0
/*     */     //   493: invokestatic mutableFloatStateOf : (F)Landroidx/compose/runtime/MutableFloatState;
/*     */     //   496: astore #17
/*     */     //   498: aload #12
/*     */     //   500: aload #17
/*     */     //   502: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   507: aload #17
/*     */     //   509: goto -> 514
/*     */     //   512: aload #15
/*     */     //   514: nop
/*     */     //   515: nop
/*     */     //   516: nop
/*     */     //   517: checkcast androidx/compose/runtime/MutableFloatState
/*     */     //   520: astore #11
/*     */     //   522: aload_2
/*     */     //   523: invokeinterface endReplaceGroup : ()V
/*     */     //   528: aload #11
/*     */     //   530: astore #10
/*     */     //   532: aload_2
/*     */     //   533: ldc 1210095394
/*     */     //   535: invokeinterface startReplaceGroup : (I)V
/*     */     //   540: aload_2
/*     */     //   541: astore #13
/*     */     //   543: aload_2
/*     */     //   544: aload #7
/*     */     //   546: getfield element : F
/*     */     //   549: invokeinterface changed : (F)Z
/*     */     //   554: aload_2
/*     */     //   555: aload #6
/*     */     //   557: getfield element : F
/*     */     //   560: invokeinterface changed : (F)Z
/*     */     //   565: ior
/*     */     //   566: aload_2
/*     */     //   567: aload_0
/*     */     //   568: getfield $valueRange : Lkotlin/ranges/ClosedFloatingPointRange;
/*     */     //   571: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   576: ior
/*     */     //   577: istore #14
/*     */     //   579: aload_0
/*     */     //   580: getfield $onValueChangeState : Landroidx/compose/runtime/State;
/*     */     //   583: astore #15
/*     */     //   585: aload_0
/*     */     //   586: getfield $valueRange : Lkotlin/ranges/ClosedFloatingPointRange;
/*     */     //   589: astore #16
/*     */     //   591: iconst_0
/*     */     //   592: istore #17
/*     */     //   594: aload #13
/*     */     //   596: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   601: astore #18
/*     */     //   603: iconst_0
/*     */     //   604: istore #19
/*     */     //   606: iload #14
/*     */     //   608: ifne -> 622
/*     */     //   611: aload #18
/*     */     //   613: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   616: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   619: if_acmpne -> 666
/*     */     //   622: iconst_0
/*     */     //   623: istore #20
/*     */     //   625: new org/jetbrains/jewel/ui/component/SliderDraggableState
/*     */     //   628: dup
/*     */     //   629: aload #9
/*     */     //   631: aload #10
/*     */     //   633: aload #7
/*     */     //   635: aload #6
/*     */     //   637: aload #15
/*     */     //   639: aload #16
/*     */     //   641: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableFloatState;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/runtime/State;Lkotlin/ranges/ClosedFloatingPointRange;)Lkotlin/jvm/functions/Function1;
/*     */     //   646: invokespecial <init> : (Lkotlin/jvm/functions/Function1;)V
/*     */     //   649: nop
/*     */     //   650: astore #21
/*     */     //   652: aload #13
/*     */     //   654: aload #21
/*     */     //   656: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   661: aload #21
/*     */     //   663: goto -> 668
/*     */     //   666: aload #18
/*     */     //   668: nop
/*     */     //   669: nop
/*     */     //   670: nop
/*     */     //   671: checkcast org/jetbrains/jewel/ui/component/SliderDraggableState
/*     */     //   674: astore #12
/*     */     //   676: aload_2
/*     */     //   677: invokeinterface endReplaceGroup : ()V
/*     */     //   682: aload #12
/*     */     //   684: astore #11
/*     */     //   686: aload_2
/*     */     //   687: ldc 1210109485
/*     */     //   689: invokeinterface startReplaceGroup : (I)V
/*     */     //   694: aload_2
/*     */     //   695: astore #13
/*     */     //   697: aload_2
/*     */     //   698: aload_0
/*     */     //   699: getfield $valueRange : Lkotlin/ranges/ClosedFloatingPointRange;
/*     */     //   702: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   707: aload_2
/*     */     //   708: aload #7
/*     */     //   710: getfield element : F
/*     */     //   713: invokeinterface changed : (F)Z
/*     */     //   718: ior
/*     */     //   719: aload_2
/*     */     //   720: aload #6
/*     */     //   722: getfield element : F
/*     */     //   725: invokeinterface changed : (F)Z
/*     */     //   730: ior
/*     */     //   731: istore #14
/*     */     //   733: aload_0
/*     */     //   734: getfield $valueRange : Lkotlin/ranges/ClosedFloatingPointRange;
/*     */     //   737: astore #15
/*     */     //   739: iconst_0
/*     */     //   740: istore #16
/*     */     //   742: aload #13
/*     */     //   744: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   749: astore #17
/*     */     //   751: iconst_0
/*     */     //   752: istore #18
/*     */     //   754: iload #14
/*     */     //   756: ifne -> 770
/*     */     //   759: aload #17
/*     */     //   761: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   764: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   767: if_acmpne -> 805
/*     */     //   770: iconst_0
/*     */     //   771: istore #19
/*     */     //   773: new org/jetbrains/jewel/ui/component/SliderKt$Slider$3$2$1
/*     */     //   776: dup
/*     */     //   777: aload #15
/*     */     //   779: aload #7
/*     */     //   781: aload #6
/*     */     //   783: invokespecial <init> : (Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;)V
/*     */     //   786: checkcast kotlin/reflect/KFunction
/*     */     //   789: astore #20
/*     */     //   791: aload #13
/*     */     //   793: aload #20
/*     */     //   795: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   800: aload #20
/*     */     //   802: goto -> 807
/*     */     //   805: aload #17
/*     */     //   807: nop
/*     */     //   808: nop
/*     */     //   809: nop
/*     */     //   810: checkcast kotlin/reflect/KFunction
/*     */     //   813: astore #12
/*     */     //   815: aload_2
/*     */     //   816: invokeinterface endReplaceGroup : ()V
/*     */     //   821: aload #12
/*     */     //   823: checkcast kotlin/jvm/functions/Function1
/*     */     //   826: aload_0
/*     */     //   827: getfield $valueRange : Lkotlin/ranges/ClosedFloatingPointRange;
/*     */     //   830: aload #7
/*     */     //   832: getfield element : F
/*     */     //   835: aload #6
/*     */     //   837: getfield element : F
/*     */     //   840: invokestatic rangeTo : (FF)Lkotlin/ranges/ClosedFloatingPointRange;
/*     */     //   843: aload #9
/*     */     //   845: checkcast androidx/compose/runtime/MutableState
/*     */     //   848: aload_0
/*     */     //   849: getfield $value : F
/*     */     //   852: aload_2
/*     */     //   853: sipush #3072
/*     */     //   856: invokestatic access$CorrectValueSideEffect : (Lkotlin/jvm/functions/Function1;Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/MutableState;FLandroidx/compose/runtime/Composer;I)V
/*     */     //   859: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   862: aload_2
/*     */     //   863: bipush #6
/*     */     //   865: invokevirtual isSwingCompatMode : (Landroidx/compose/runtime/Composer;I)Z
/*     */     //   868: ifne -> 875
/*     */     //   871: iconst_1
/*     */     //   872: goto -> 876
/*     */     //   875: iconst_0
/*     */     //   876: istore #12
/*     */     //   878: aload_2
/*     */     //   879: ldc_w 1210116667
/*     */     //   882: invokeinterface startReplaceGroup : (I)V
/*     */     //   887: aload_2
/*     */     //   888: astore #15
/*     */     //   890: aload_2
/*     */     //   891: aload_0
/*     */     //   892: getfield $tickFractions : Ljava/util/List;
/*     */     //   895: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   900: aload_2
/*     */     //   901: aload #7
/*     */     //   903: getfield element : F
/*     */     //   906: invokeinterface changed : (F)Z
/*     */     //   911: ior
/*     */     //   912: aload_2
/*     */     //   913: aload #6
/*     */     //   915: getfield element : F
/*     */     //   918: invokeinterface changed : (F)Z
/*     */     //   923: ior
/*     */     //   924: aload_2
/*     */     //   925: aload #8
/*     */     //   927: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   932: ior
/*     */     //   933: aload_2
/*     */     //   934: iload #12
/*     */     //   936: invokeinterface changed : (Z)Z
/*     */     //   941: ior
/*     */     //   942: aload_2
/*     */     //   943: aload #11
/*     */     //   945: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   950: ior
/*     */     //   951: aload_2
/*     */     //   952: aload_0
/*     */     //   953: getfield $onValueChangeFinished : Lkotlin/jvm/functions/Function0;
/*     */     //   956: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   961: ior
/*     */     //   962: istore #16
/*     */     //   964: aload_0
/*     */     //   965: getfield $tickFractions : Ljava/util/List;
/*     */     //   968: astore #17
/*     */     //   970: aload_0
/*     */     //   971: getfield $focusRequester : Landroidx/compose/ui/focus/FocusRequester;
/*     */     //   974: astore #18
/*     */     //   976: aload_0
/*     */     //   977: getfield $onValueChangeFinished : Lkotlin/jvm/functions/Function0;
/*     */     //   980: astore #19
/*     */     //   982: iconst_0
/*     */     //   983: istore #20
/*     */     //   985: aload #15
/*     */     //   987: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   992: astore #21
/*     */     //   994: iconst_0
/*     */     //   995: istore #22
/*     */     //   997: iload #16
/*     */     //   999: ifne -> 1013
/*     */     //   1002: aload #21
/*     */     //   1004: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1007: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1010: if_acmpne -> 1055
/*     */     //   1013: iconst_0
/*     */     //   1014: istore #23
/*     */     //   1016: aload #9
/*     */     //   1018: aload #17
/*     */     //   1020: aload #7
/*     */     //   1022: aload #6
/*     */     //   1024: aload #18
/*     */     //   1026: aload #8
/*     */     //   1028: aload #11
/*     */     //   1030: aload #19
/*     */     //   1032: iload #12
/*     */     //   1034: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableFloatState;Ljava/util/List;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/ui/focus/FocusRequester;Lkotlinx/coroutines/CoroutineScope;Lorg/jetbrains/jewel/ui/component/SliderDraggableState;Lkotlin/jvm/functions/Function0;Z)Lkotlin/jvm/functions/Function1;
/*     */     //   1039: astore #24
/*     */     //   1041: aload #15
/*     */     //   1043: aload #24
/*     */     //   1045: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1050: aload #24
/*     */     //   1052: goto -> 1057
/*     */     //   1055: aload #21
/*     */     //   1057: nop
/*     */     //   1058: nop
/*     */     //   1059: nop
/*     */     //   1060: checkcast kotlin/jvm/functions/Function1
/*     */     //   1063: astore #14
/*     */     //   1065: aload_2
/*     */     //   1066: invokeinterface endReplaceGroup : ()V
/*     */     //   1071: aload #14
/*     */     //   1073: aload_2
/*     */     //   1074: iconst_0
/*     */     //   1075: invokestatic rememberUpdatedState : (Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1078: astore #13
/*     */     //   1080: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1083: checkcast androidx/compose/ui/Modifier
/*     */     //   1086: aload #11
/*     */     //   1088: checkcast androidx/compose/foundation/gestures/DraggableState
/*     */     //   1091: aload_0
/*     */     //   1092: getfield $interactionSource : Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   1095: fload #5
/*     */     //   1097: aload_0
/*     */     //   1098: getfield $isRtl : Z
/*     */     //   1101: aload #9
/*     */     //   1103: checkcast androidx/compose/runtime/State
/*     */     //   1106: aload #13
/*     */     //   1108: aload #10
/*     */     //   1110: checkcast androidx/compose/runtime/MutableState
/*     */     //   1113: aload_0
/*     */     //   1114: getfield $enabled : Z
/*     */     //   1117: invokestatic access$sliderTapModifier : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/interaction/MutableInteractionSource;FZLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Z)Landroidx/compose/ui/Modifier;
/*     */     //   1120: astore #14
/*     */     //   1122: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1125: astore #16
/*     */     //   1127: getstatic androidx/compose/foundation/gestures/Orientation.Horizontal : Landroidx/compose/foundation/gestures/Orientation;
/*     */     //   1130: astore #17
/*     */     //   1132: aload #11
/*     */     //   1134: invokevirtual isDragging : ()Z
/*     */     //   1137: istore #18
/*     */     //   1139: aload #16
/*     */     //   1141: checkcast androidx/compose/ui/Modifier
/*     */     //   1144: aload #11
/*     */     //   1146: checkcast androidx/compose/foundation/gestures/DraggableState
/*     */     //   1149: aload #17
/*     */     //   1151: aload_0
/*     */     //   1152: getfield $enabled : Z
/*     */     //   1155: aload_0
/*     */     //   1156: getfield $interactionSource : Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   1159: iload #18
/*     */     //   1161: aconst_null
/*     */     //   1162: aload_2
/*     */     //   1163: ldc_w 1210161813
/*     */     //   1166: invokeinterface startReplaceGroup : (I)V
/*     */     //   1171: aload_2
/*     */     //   1172: astore #20
/*     */     //   1174: aload_2
/*     */     //   1175: aload #13
/*     */     //   1177: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1182: istore #21
/*     */     //   1184: nop
/*     */     //   1185: iconst_0
/*     */     //   1186: istore #22
/*     */     //   1188: aload #20
/*     */     //   1190: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1195: astore #23
/*     */     //   1197: iconst_0
/*     */     //   1198: istore #24
/*     */     //   1200: iload #21
/*     */     //   1202: ifne -> 1216
/*     */     //   1205: aload #23
/*     */     //   1207: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1210: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1213: if_acmpne -> 1280
/*     */     //   1216: astore #33
/*     */     //   1218: istore #32
/*     */     //   1220: astore #31
/*     */     //   1222: istore #30
/*     */     //   1224: astore #29
/*     */     //   1226: astore #28
/*     */     //   1228: astore #27
/*     */     //   1230: iconst_0
/*     */     //   1231: istore #25
/*     */     //   1233: new org/jetbrains/jewel/ui/component/SliderKt$Slider$3$drag$1$1
/*     */     //   1236: dup
/*     */     //   1237: aload #13
/*     */     //   1239: aconst_null
/*     */     //   1240: invokespecial <init> : (Landroidx/compose/runtime/State;Lkotlin/coroutines/Continuation;)V
/*     */     //   1243: checkcast kotlin/jvm/functions/Function3
/*     */     //   1246: astore #34
/*     */     //   1248: aload #27
/*     */     //   1250: aload #28
/*     */     //   1252: aload #29
/*     */     //   1254: iload #30
/*     */     //   1256: aload #31
/*     */     //   1258: iload #32
/*     */     //   1260: aload #33
/*     */     //   1262: aload #34
/*     */     //   1264: astore #26
/*     */     //   1266: aload #20
/*     */     //   1268: aload #26
/*     */     //   1270: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1275: aload #26
/*     */     //   1277: goto -> 1282
/*     */     //   1280: aload #23
/*     */     //   1282: nop
/*     */     //   1283: nop
/*     */     //   1284: nop
/*     */     //   1285: checkcast kotlin/jvm/functions/Function3
/*     */     //   1288: astore #19
/*     */     //   1290: aload_2
/*     */     //   1291: invokeinterface endReplaceGroup : ()V
/*     */     //   1296: aload #19
/*     */     //   1298: aload_0
/*     */     //   1299: getfield $isRtl : Z
/*     */     //   1302: bipush #32
/*     */     //   1304: aconst_null
/*     */     //   1305: invokestatic draggable$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1308: astore #15
/*     */     //   1310: aload_0
/*     */     //   1311: getfield $value : F
/*     */     //   1314: aload_0
/*     */     //   1315: getfield $valueRange : Lkotlin/ranges/ClosedFloatingPointRange;
/*     */     //   1318: invokeinterface getStart : ()Ljava/lang/Comparable;
/*     */     //   1323: checkcast java/lang/Number
/*     */     //   1326: invokevirtual floatValue : ()F
/*     */     //   1329: aload_0
/*     */     //   1330: getfield $valueRange : Lkotlin/ranges/ClosedFloatingPointRange;
/*     */     //   1333: invokeinterface getEndInclusive : ()Ljava/lang/Comparable;
/*     */     //   1338: checkcast java/lang/Number
/*     */     //   1341: invokevirtual floatValue : ()F
/*     */     //   1344: invokestatic coerceIn : (FFF)F
/*     */     //   1347: fstore #16
/*     */     //   1349: aload_0
/*     */     //   1350: getfield $valueRange : Lkotlin/ranges/ClosedFloatingPointRange;
/*     */     //   1353: invokeinterface getStart : ()Ljava/lang/Comparable;
/*     */     //   1358: checkcast java/lang/Number
/*     */     //   1361: invokevirtual floatValue : ()F
/*     */     //   1364: aload_0
/*     */     //   1365: getfield $valueRange : Lkotlin/ranges/ClosedFloatingPointRange;
/*     */     //   1368: invokeinterface getEndInclusive : ()Ljava/lang/Comparable;
/*     */     //   1373: checkcast java/lang/Number
/*     */     //   1376: invokevirtual floatValue : ()F
/*     */     //   1379: fload #16
/*     */     //   1381: invokestatic access$calcFraction : (FFF)F
/*     */     //   1384: fstore #17
/*     */     //   1386: aload #6
/*     */     //   1388: getfield element : F
/*     */     //   1391: aload #7
/*     */     //   1393: getfield element : F
/*     */     //   1396: fsub
/*     */     //   1397: fstore #18
/*     */     //   1399: aload #14
/*     */     //   1401: aload #15
/*     */     //   1403: invokeinterface then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1408: astore #19
/*     */     //   1410: aload_0
/*     */     //   1411: getfield $enabled : Z
/*     */     //   1414: fload #17
/*     */     //   1416: aload_0
/*     */     //   1417: getfield $tickFractions : Ljava/util/List;
/*     */     //   1420: aload_0
/*     */     //   1421: getfield $style : Lorg/jetbrains/jewel/ui/component/styling/SliderStyle;
/*     */     //   1424: fload #18
/*     */     //   1426: aload_0
/*     */     //   1427: getfield $minHeight : F
/*     */     //   1430: aload_0
/*     */     //   1431: getfield $interactionSource : Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   1434: aload #19
/*     */     //   1436: aload_2
/*     */     //   1437: iconst_0
/*     */     //   1438: invokestatic access$SliderImpl-PfoAEA0 : (ZFLjava/util/List;Lorg/jetbrains/jewel/ui/component/styling/SliderStyle;FFLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1441: invokestatic isTraceInProgress : ()Z
/*     */     //   1444: ifeq -> 1459
/*     */     //   1447: invokestatic traceEventEnd : ()V
/*     */     //   1450: goto -> 1459
/*     */     //   1453: aload_2
/*     */     //   1454: invokeinterface skipToGroupEnd : ()V
/*     */     //   1459: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #129	-> 36
/*     */     //   #130	-> 83
/*     */     //   #131	-> 92
/*     */     //   #133	-> 101
/*     */     //   #708	-> 120
/*     */     //   #133	-> 141
/*     */     //   #134	-> 157
/*     */     //   #134	-> 178
/*     */     //   #135	-> 181
/*     */     //   #135	-> 203
/*     */     //   #136	-> 206
/*     */     //   #133	-> 207
/*     */     //   #142	-> 210
/*     */     //   #709	-> 219
/*     */     //   #710	-> 222
/*     */     //   #712	-> 223
/*     */     //   #713	-> 230
/*     */     //   #714	-> 242
/*     */     //   #715	-> 254
/*     */     //   #716	-> 265
/*     */     //   #717	-> 268
/*     */     //   #718	-> 268
/*     */     //   #719	-> 271
/*     */     //   #718	-> 274
/*     */     //   #717	-> 282
/*     */     //   #716	-> 293
/*     */     //   #720	-> 295
/*     */     //   #721	-> 304
/*     */     //   #722	-> 309
/*     */     //   #715	-> 311
/*     */     //   #714	-> 312
/*     */     //   #714	-> 313
/*     */     //   #713	-> 314
/*     */     //   #723	-> 327
/*     */     //   #709	-> 335
/*     */     //   #723	-> 340
/*     */     //   #142	-> 341
/*     */     //   #143	-> 357
/*     */     //   #724	-> 372
/*     */     //   #725	-> 384
/*     */     //   #726	-> 395
/*     */     //   #143	-> 398
/*     */     //   #726	-> 412
/*     */     //   #727	-> 414
/*     */     //   #728	-> 423
/*     */     //   #729	-> 428
/*     */     //   #725	-> 430
/*     */     //   #724	-> 431
/*     */     //   #724	-> 432
/*     */     //   #143	-> 433
/*     */     //   #144	-> 462
/*     */     //   #730	-> 466
/*     */     //   #731	-> 478
/*     */     //   #732	-> 489
/*     */     //   #144	-> 492
/*     */     //   #732	-> 496
/*     */     //   #733	-> 498
/*     */     //   #734	-> 507
/*     */     //   #735	-> 512
/*     */     //   #731	-> 514
/*     */     //   #730	-> 515
/*     */     //   #730	-> 516
/*     */     //   #144	-> 517
/*     */     //   #147	-> 544
/*     */     //   #736	-> 594
/*     */     //   #737	-> 606
/*     */     //   #738	-> 622
/*     */     //   #148	-> 625
/*     */     //   #153	-> 649
/*     */     //   #738	-> 650
/*     */     //   #739	-> 652
/*     */     //   #740	-> 661
/*     */     //   #741	-> 666
/*     */     //   #737	-> 668
/*     */     //   #736	-> 669
/*     */     //   #736	-> 670
/*     */     //   #147	-> 671
/*     */     //   #146	-> 684
/*     */     //   #156	-> 733
/*     */     //   #742	-> 742
/*     */     //   #743	-> 754
/*     */     //   #744	-> 770
/*     */     //   #156	-> 773
/*     */     //   #744	-> 789
/*     */     //   #745	-> 791
/*     */     //   #746	-> 800
/*     */     //   #747	-> 805
/*     */     //   #743	-> 807
/*     */     //   #742	-> 808
/*     */     //   #742	-> 809
/*     */     //   #156	-> 810
/*     */     //   #158	-> 859
/*     */     //   #160	-> 964
/*     */     //   #748	-> 985
/*     */     //   #749	-> 997
/*     */     //   #750	-> 1013
/*     */     //   #160	-> 1016
/*     */     //   #750	-> 1039
/*     */     //   #751	-> 1041
/*     */     //   #752	-> 1050
/*     */     //   #753	-> 1055
/*     */     //   #749	-> 1057
/*     */     //   #748	-> 1058
/*     */     //   #748	-> 1059
/*     */     //   #160	-> 1060
/*     */     //   #159	-> 1078
/*     */     //   #179	-> 1080
/*     */     //   #180	-> 1086
/*     */     //   #181	-> 1091
/*     */     //   #182	-> 1095
/*     */     //   #183	-> 1097
/*     */     //   #184	-> 1101
/*     */     //   #185	-> 1106
/*     */     //   #186	-> 1108
/*     */     //   #187	-> 1113
/*     */     //   #179	-> 1117
/*     */     //   #178	-> 1120
/*     */     //   #191	-> 1122
/*     */     //   #192	-> 1127
/*     */     //   #197	-> 1132
/*     */     //   #191	-> 1139
/*     */     //   #198	-> 1144
/*     */     //   #192	-> 1149
/*     */     //   #194	-> 1151
/*     */     //   #195	-> 1155
/*     */     //   #197	-> 1159
/*     */     //   #191	-> 1161
/*     */     //   #196	-> 1184
/*     */     //   #754	-> 1188
/*     */     //   #755	-> 1200
/*     */     //   #756	-> 1216
/*     */     //   #196	-> 1233
/*     */     //   #756	-> 1264
/*     */     //   #757	-> 1266
/*     */     //   #758	-> 1275
/*     */     //   #759	-> 1280
/*     */     //   #755	-> 1282
/*     */     //   #754	-> 1283
/*     */     //   #754	-> 1284
/*     */     //   #196	-> 1285
/*     */     //   #193	-> 1298
/*     */     //   #191	-> 1302
/*     */     //   #190	-> 1308
/*     */     //   #201	-> 1310
/*     */     //   #202	-> 1349
/*     */     //   #209	-> 1386
/*     */     //   #211	-> 1399
/*     */     //   #204	-> 1410
/*     */     //   #205	-> 1414
/*     */     //   #206	-> 1416
/*     */     //   #207	-> 1420
/*     */     //   #209	-> 1424
/*     */     //   #208	-> 1426
/*     */     //   #210	-> 1430
/*     */     //   #211	-> 1434
/*     */     //   #203	-> 1438
/*     */     //   #212	-> 1453
/*     */     //   #213	-> 1459
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   115	24	10	$i$f$getCurrent	I
/*     */     //   112	27	8	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   112	27	9	$changed$iv	I
/*     */     //   157	50	12	$i$a$-with-SliderKt$Slider$3$1	I
/*     */     //   154	53	11	$this$invoke_u24lambda_u240	Landroidx/compose/ui/unit/Density;
/*     */     //   271	3	19	$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1	I
/*     */     //   268	25	18	$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv	I
/*     */     //   295	11	19	value$iv$iv	Ljava/lang/Object;
/*     */     //   254	58	17	$i$a$-let-ComposerKt$cache$1$iv$iv	I
/*     */     //   251	61	16	it$iv$iv	Ljava/lang/Object;
/*     */     //   242	72	15	$i$f$cache	I
/*     */     //   239	75	13	$this$cache$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   239	75	14	invalid$iv$iv	Z
/*     */     //   214	127	11	$i$f$rememberCoroutineScope	I
/*     */     //   225	116	12	composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   327	14	21	wrapper$iv	Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
/*     */     //   211	130	10	$changed$iv	I
/*     */     //   398	14	18	$i$a$-cache-SliderKt$Slider$3$rawOffset$1	I
/*     */     //   414	11	19	value$iv	Ljava/lang/Object;
/*     */     //   384	47	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   381	50	16	it$iv	Ljava/lang/Object;
/*     */     //   372	61	15	$i$f$cache	I
/*     */     //   369	64	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   369	64	12	invalid$iv	Z
/*     */     //   492	4	17	$i$a$-cache-SliderKt$Slider$3$pressOffset$1	I
/*     */     //   498	11	17	value$iv	Ljava/lang/Object;
/*     */     //   478	37	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   475	40	15	it$iv	Ljava/lang/Object;
/*     */     //   466	51	14	$i$f$cache	I
/*     */     //   463	54	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   463	54	13	invalid$iv	Z
/*     */     //   625	25	20	$i$a$-cache-SliderKt$Slider$3$draggableState$1	I
/*     */     //   652	11	21	value$iv	Ljava/lang/Object;
/*     */     //   606	63	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   603	66	18	it$iv	Ljava/lang/Object;
/*     */     //   594	77	17	$i$f$cache	I
/*     */     //   591	80	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   591	80	14	invalid$iv	Z
/*     */     //   773	16	19	$i$a$-cache-SliderKt$Slider$3$2	I
/*     */     //   791	11	20	value$iv	Ljava/lang/Object;
/*     */     //   754	54	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   751	57	17	it$iv	Ljava/lang/Object;
/*     */     //   742	68	16	$i$f$cache	I
/*     */     //   739	71	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   739	71	14	invalid$iv	Z
/*     */     //   1016	23	23	$i$a$-cache-SliderKt$Slider$3$gestureEndAction$1	I
/*     */     //   1041	11	24	value$iv	Ljava/lang/Object;
/*     */     //   997	61	22	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   994	64	21	it$iv	Ljava/lang/Object;
/*     */     //   985	75	20	$i$f$cache	I
/*     */     //   982	78	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   982	78	16	invalid$iv	Z
/*     */     //   1233	13	25	$i$a$-cache-SliderKt$Slider$3$drag$1	I
/*     */     //   1266	11	26	value$iv	Ljava/lang/Object;
/*     */     //   1200	83	24	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1197	86	23	it$iv	Ljava/lang/Object;
/*     */     //   1188	97	22	$i$f$cache	I
/*     */     //   1185	100	20	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1185	100	21	invalid$iv	Z
/*     */     //   83	1367	5	widthPx	F
/*     */     //   92	1358	6	maxPx	Lkotlin/jvm/internal/Ref$FloatRef;
/*     */     //   101	1349	7	minPx	Lkotlin/jvm/internal/Ref$FloatRef;
/*     */     //   343	1107	8	scope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   448	1002	9	rawOffset	Landroidx/compose/runtime/MutableFloatState;
/*     */     //   532	918	10	pressOffset	Landroidx/compose/runtime/MutableFloatState;
/*     */     //   686	764	11	draggableState	Lorg/jetbrains/jewel/ui/component/SliderDraggableState;
/*     */     //   878	572	12	canAnimate	Z
/*     */     //   1080	370	13	gestureEndAction	Landroidx/compose/runtime/State;
/*     */     //   1122	328	14	press	Landroidx/compose/ui/Modifier;
/*     */     //   1310	140	15	drag	Landroidx/compose/ui/Modifier;
/*     */     //   1349	101	16	coerced	F
/*     */     //   1386	64	17	fraction	F
/*     */     //   9	1451	4	$dirty	I
/*     */     //   0	1460	0	this	Lorg/jetbrains/jewel/ui/component/SliderKt$Slider$3;
/*     */     //   0	1460	1	$this$BoxWithConstraints	Landroidx/compose/foundation/layout/BoxWithConstraintsScope;
/*     */     //   0	1460	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1460	3	$changed	I
/*     */   }
/*     */   
/*     */   private static final float invoke$scaleToUserValue(Ref.FloatRef minPx, Ref.FloatRef maxPx, ClosedFloatingPointRange $valueRange, float offset) {
/* 138 */     return SliderKt.access$scale(minPx.element, maxPx.element, offset, ((Number)$valueRange.getStart()).floatValue(), ((Number)$valueRange.getEndInclusive()).floatValue());
/*     */   } private static final float invoke$scaleToOffset(ClosedFloatingPointRange $valueRange, Ref.FloatRef minPx, Ref.FloatRef maxPx, float userValue) {
/* 140 */     return SliderKt.access$scale(((Number)$valueRange.getStart()).floatValue(), ((Number)$valueRange.getEndInclusive()).floatValue(), userValue, minPx.element, maxPx.element);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Unit invoke$lambda$4$lambda$3(MutableFloatState $rawOffset, MutableFloatState $pressOffset, Ref.FloatRef $minPx, Ref.FloatRef $maxPx, State $onValueChangeState, ClosedFloatingPointRange<Float> $valueRange, float it) {
/* 149 */     $rawOffset.setFloatValue($rawOffset.getFloatValue() + it + $pressOffset.getFloatValue());
/* 150 */     $pressOffset.setFloatValue(0.0F);
/* 151 */     float offsetInTrack = RangesKt.coerceIn($rawOffset.getFloatValue(), $minPx.element, $maxPx.element);
/* 152 */     ((Function1)$onValueChangeState.getValue()).invoke(Float.valueOf(invoke$scaleToUserValue($minPx, $maxPx, $valueRange, offsetInTrack)));
/* 153 */     return Unit.INSTANCE;
/*     */   }
/*     */   SliderKt$Slider$3(ClosedFloatingPointRange<Float> $valueRange, float $value, List<Float> $tickFractions, Function0<Unit> $onValueChangeFinished, MutableInteractionSource $interactionSource, boolean $isRtl, boolean $enabled, SliderStyle $style, float $minHeight, long $thumbSize, State<Function1<Float, Unit>> $onValueChangeState, FocusRequester $focusRequester) {}
/*     */   @DebugMetadata(f = "Slider.kt", l = {167, 169}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.SliderKt$Slider$3$gestureEndAction$1$1$1")
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class SliderKt$Slider$3$gestureEndAction$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     SliderKt$Slider$3$gestureEndAction$1$1$1(boolean $canAnimate, SliderDraggableState $draggableState, float $current, float $target, float $velocity, Function0<Unit> $onValueChangeFinished, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore_2
/*     */       //   4: aload_0
/*     */       //   5: getfield label : I
/*     */       //   8: tableswitch default -> 170, 0 -> 36, 1 -> 85, 2 -> 142
/*     */       //   36: aload_1
/*     */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   40: aload_0
/*     */       //   41: getfield $canAnimate : Z
/*     */       //   44: ifeq -> 94
/*     */       //   47: aload_0
/*     */       //   48: getfield $draggableState : Lorg/jetbrains/jewel/ui/component/SliderDraggableState;
/*     */       //   51: checkcast androidx/compose/foundation/gestures/DraggableState
/*     */       //   54: aload_0
/*     */       //   55: getfield $current : F
/*     */       //   58: aload_0
/*     */       //   59: getfield $target : F
/*     */       //   62: aload_0
/*     */       //   63: getfield $velocity : F
/*     */       //   66: aload_0
/*     */       //   67: checkcast kotlin/coroutines/Continuation
/*     */       //   70: aload_0
/*     */       //   71: iconst_1
/*     */       //   72: putfield label : I
/*     */       //   75: invokestatic access$animateToTarget : (Landroidx/compose/foundation/gestures/DraggableState;FFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   78: dup
/*     */       //   79: aload_2
/*     */       //   80: if_acmpne -> 90
/*     */       //   83: aload_2
/*     */       //   84: areturn
/*     */       //   85: aload_1
/*     */       //   86: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   89: aload_1
/*     */       //   90: pop
/*     */       //   91: goto -> 148
/*     */       //   94: aload_0
/*     */       //   95: getfield $draggableState : Lorg/jetbrains/jewel/ui/component/SliderDraggableState;
/*     */       //   98: checkcast androidx/compose/foundation/gestures/DraggableState
/*     */       //   101: aconst_null
/*     */       //   102: new org/jetbrains/jewel/ui/component/SliderKt$Slider$3$gestureEndAction$1$1$1$1
/*     */       //   105: dup
/*     */       //   106: aload_0
/*     */       //   107: getfield $target : F
/*     */       //   110: aload_0
/*     */       //   111: getfield $current : F
/*     */       //   114: aconst_null
/*     */       //   115: invokespecial <init> : (FFLkotlin/coroutines/Continuation;)V
/*     */       //   118: checkcast kotlin/jvm/functions/Function2
/*     */       //   121: aload_0
/*     */       //   122: checkcast kotlin/coroutines/Continuation
/*     */       //   125: iconst_1
/*     */       //   126: aconst_null
/*     */       //   127: aload_0
/*     */       //   128: iconst_2
/*     */       //   129: putfield label : I
/*     */       //   132: invokestatic drag$default : (Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */       //   135: dup
/*     */       //   136: aload_2
/*     */       //   137: if_acmpne -> 147
/*     */       //   140: aload_2
/*     */       //   141: areturn
/*     */       //   142: aload_1
/*     */       //   143: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   146: aload_1
/*     */       //   147: pop
/*     */       //   148: aload_0
/*     */       //   149: getfield $onValueChangeFinished : Lkotlin/jvm/functions/Function0;
/*     */       //   152: dup
/*     */       //   153: ifnull -> 165
/*     */       //   156: invokeinterface invoke : ()Ljava/lang/Object;
/*     */       //   161: pop
/*     */       //   162: goto -> 166
/*     */       //   165: pop
/*     */       //   166: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   169: areturn
/*     */       //   170: new java/lang/IllegalStateException
/*     */       //   173: dup
/*     */       //   174: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   176: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   179: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #165	-> 3
/*     */       //   #166	-> 40
/*     */       //   #167	-> 47
/*     */       //   #165	-> 83
/*     */       //   #167	-> 90
/*     */       //   #169	-> 94
/*     */       //   #165	-> 140
/*     */       //   #171	-> 147
/*     */       //   #172	-> 166
/*     */       //   #165	-> 170
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	180	0	this	Lorg/jetbrains/jewel/ui/component/SliderKt$Slider$3$gestureEndAction$1$1$1;
/*     */       //   40	130	1	$result	Ljava/lang/Object; } public final Continuation<Unit> create(Object value, Continuation<? super SliderKt$Slider$3$gestureEndAction$1$1$1> $completion) { return (Continuation<Unit>)new SliderKt$Slider$3$gestureEndAction$1$1$1(this.$canAnimate, this.$draggableState, this.$current, this.$target, this.$velocity, this.$onValueChangeFinished, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((SliderKt$Slider$3$gestureEndAction$1$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } private static final Unit invoke$lambda$7$lambda$6(MutableFloatState $rawOffset, List $tickFractions, Ref.FloatRef $minPx, Ref.FloatRef $maxPx, FocusRequester $focusRequester, CoroutineScope $scope, SliderDraggableState $draggableState, Function0<Unit> $onValueChangeFinished, boolean $canAnimate, float velocity) {
/* 161 */     float current = $rawOffset.getFloatValue();
/* 162 */     float target = SliderKt.access$snapValueToTick(current, $tickFractions, $minPx.element, $maxPx.element);
/* 163 */     $focusRequester.requestFocus();
/* 164 */     if (!((current == target) ? 1 : 0)) {
/* 165 */       BuildersKt.launch$default($scope, null, null, new SliderKt$Slider$3$gestureEndAction$1$1$1($canAnimate, $draggableState, current, target, velocity, $onValueChangeFinished, null), 3, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 173 */     else if (!$draggableState.isDragging()) {
/*     */       
/* 175 */       if ($onValueChangeFinished != null) { $onValueChangeFinished.invoke(); } else {  }
/*     */     
/* 177 */     }  return Unit.INSTANCE;
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
/*     */   @DebugMetadata(f = "Slider.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.SliderKt$Slider$3$drag$1$1")
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020\007\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "velocity", ""})
/*     */   static final class SliderKt$Slider$3$drag$1$1
/*     */     extends SuspendLambda
/*     */     implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object>
/*     */   {
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       float velocity;
/* 196 */       IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); velocity = this.F$0; ((Function1)this.$gestureEndAction.getValue()).invoke(Boxing.boxFloat(velocity)); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     int label;
/*     */     
/*     */     SliderKt$Slider$3$drag$1$1(State<Function1<Float, Unit>> $gestureEndAction, Continuation $completion) {
/*     */       super(3, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, float p2, Continuation<? super SliderKt$Slider$3$drag$1$1> p3) {
/*     */       SliderKt$Slider$3$drag$1$1 sliderKt$Slider$3$drag$1$1 = new SliderKt$Slider$3$drag$1$1(this.$gestureEndAction, p3);
/*     */       sliderKt$Slider$3$drag$1$1.F$0 = p2;
/*     */       return sliderKt$Slider$3$drag$1$1.invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\SliderKt$Slider$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */