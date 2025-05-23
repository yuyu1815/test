/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*     */ 
/*     */ import androidx.compose.animation.AnimatedVisibilityScope;
/*     */ import androidx.compose.animation.EnterTransition;
/*     */ import androidx.compose.animation.ExitTransition;
/*     */ import androidx.compose.foundation.layout.SizeKt;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.DelayKt;
/*     */ import kotlinx.coroutines.Job;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.icon.IconKey;
/*     */ import org.jetbrains.jewel.ui.icon.IntelliJIconKey;
/*     */ import org.jetbrains.jewel.ui.icons.AllIconsKeys;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\0008\n\000\n\002\020\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\032M\020\000\032\0020\0012\006\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0010\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\rH\007¢\006\004\b\016\020\017¨\006\020²\006\n\020\021\032\0020\003X\002²\006\f\020\022\032\004\030\0010\023X\002²\006\n\020\024\032\0020\025X\002"}, d2 = {"CopyTextToClipboardButton", "", "visible", "", "onCopyClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "feedbackDuration", "Lkotlin/time/Duration;", "enterTransition", "Landroidx/compose/animation/EnterTransition;", "exitTransition", "Landroidx/compose/animation/ExitTransition;", "CopyTextToClipboardButton-SBKQj6I", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/runtime/Composer;II)V", "ej-ui", "isCopyFeedbackVisible", "flashJob", "Lkotlinx/coroutines/Job;", "iconColor", "Landroidx/compose/ui/graphics/Color;"})
/*     */ @SourceDebugExtension({"SMAP\nCopyTextToClipboardButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyTextToClipboardButton.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/CopyTextToClipboardButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,86:1\n1225#2,6:87\n1225#2,6:93\n1225#2,3:104\n1228#2,3:110\n481#3:99\n480#3,4:100\n484#3,2:107\n488#3:113\n480#4:109\n81#5:114\n107#5,2:115\n81#5:117\n107#5,2:118\n81#5:120\n*S KotlinDebug\n*F\n+ 1 CopyTextToClipboardButton.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/CopyTextToClipboardButtonKt\n*L\n45#1:87,6\n46#1:93,6\n53#1:104,3\n53#1:110,3\n53#1:99\n53#1:100,4\n53#1:107,2\n53#1:113\n53#1:109\n45#1:114\n45#1:115,2\n46#1:117\n46#1:118,2\n47#1:120\n*E\n"})
/*     */ public final class CopyTextToClipboardButtonKt {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void CopyTextToClipboardButton-SBKQj6I(boolean visible, @NotNull Function0 onCopyClicked, @Nullable Modifier modifier, long feedbackDuration, @Nullable EnterTransition enterTransition, @Nullable ExitTransition exitTransition, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'onCopyClicked'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #7
/*     */     //   8: ldc -399329090
/*     */     //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   15: astore #7
/*     */     //   17: iload #8
/*     */     //   19: istore #10
/*     */     //   21: iload #9
/*     */     //   23: iconst_1
/*     */     //   24: iand
/*     */     //   25: ifeq -> 38
/*     */     //   28: iload #10
/*     */     //   30: bipush #6
/*     */     //   32: ior
/*     */     //   33: istore #10
/*     */     //   35: goto -> 67
/*     */     //   38: iload #8
/*     */     //   40: bipush #6
/*     */     //   42: iand
/*     */     //   43: ifne -> 67
/*     */     //   46: iload #10
/*     */     //   48: aload #7
/*     */     //   50: iload_0
/*     */     //   51: invokeinterface changed : (Z)Z
/*     */     //   56: ifeq -> 63
/*     */     //   59: iconst_4
/*     */     //   60: goto -> 64
/*     */     //   63: iconst_2
/*     */     //   64: ior
/*     */     //   65: istore #10
/*     */     //   67: iload #9
/*     */     //   69: iconst_2
/*     */     //   70: iand
/*     */     //   71: ifeq -> 84
/*     */     //   74: iload #10
/*     */     //   76: bipush #48
/*     */     //   78: ior
/*     */     //   79: istore #10
/*     */     //   81: goto -> 115
/*     */     //   84: iload #8
/*     */     //   86: bipush #48
/*     */     //   88: iand
/*     */     //   89: ifne -> 115
/*     */     //   92: iload #10
/*     */     //   94: aload #7
/*     */     //   96: aload_1
/*     */     //   97: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   102: ifeq -> 110
/*     */     //   105: bipush #32
/*     */     //   107: goto -> 112
/*     */     //   110: bipush #16
/*     */     //   112: ior
/*     */     //   113: istore #10
/*     */     //   115: iload #9
/*     */     //   117: iconst_4
/*     */     //   118: iand
/*     */     //   119: ifeq -> 133
/*     */     //   122: iload #10
/*     */     //   124: sipush #384
/*     */     //   127: ior
/*     */     //   128: istore #10
/*     */     //   130: goto -> 167
/*     */     //   133: iload #8
/*     */     //   135: sipush #384
/*     */     //   138: iand
/*     */     //   139: ifne -> 167
/*     */     //   142: iload #10
/*     */     //   144: aload #7
/*     */     //   146: aload_2
/*     */     //   147: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   152: ifeq -> 161
/*     */     //   155: sipush #256
/*     */     //   158: goto -> 164
/*     */     //   161: sipush #128
/*     */     //   164: ior
/*     */     //   165: istore #10
/*     */     //   167: iload #8
/*     */     //   169: sipush #3072
/*     */     //   172: iand
/*     */     //   173: ifne -> 209
/*     */     //   176: iload #10
/*     */     //   178: iload #9
/*     */     //   180: bipush #8
/*     */     //   182: iand
/*     */     //   183: ifne -> 203
/*     */     //   186: aload #7
/*     */     //   188: lload_3
/*     */     //   189: invokeinterface changed : (J)Z
/*     */     //   194: ifeq -> 203
/*     */     //   197: sipush #2048
/*     */     //   200: goto -> 206
/*     */     //   203: sipush #1024
/*     */     //   206: ior
/*     */     //   207: istore #10
/*     */     //   209: iload #9
/*     */     //   211: bipush #16
/*     */     //   213: iand
/*     */     //   214: ifeq -> 228
/*     */     //   217: iload #10
/*     */     //   219: sipush #24576
/*     */     //   222: ior
/*     */     //   223: istore #10
/*     */     //   225: goto -> 263
/*     */     //   228: iload #8
/*     */     //   230: sipush #24576
/*     */     //   233: iand
/*     */     //   234: ifne -> 263
/*     */     //   237: iload #10
/*     */     //   239: aload #7
/*     */     //   241: aload #5
/*     */     //   243: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   248: ifeq -> 257
/*     */     //   251: sipush #16384
/*     */     //   254: goto -> 260
/*     */     //   257: sipush #8192
/*     */     //   260: ior
/*     */     //   261: istore #10
/*     */     //   263: iload #9
/*     */     //   265: bipush #32
/*     */     //   267: iand
/*     */     //   268: ifeq -> 281
/*     */     //   271: iload #10
/*     */     //   273: ldc 196608
/*     */     //   275: ior
/*     */     //   276: istore #10
/*     */     //   278: goto -> 313
/*     */     //   281: iload #8
/*     */     //   283: ldc 196608
/*     */     //   285: iand
/*     */     //   286: ifne -> 313
/*     */     //   289: iload #10
/*     */     //   291: aload #7
/*     */     //   293: aload #6
/*     */     //   295: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   300: ifeq -> 308
/*     */     //   303: ldc 131072
/*     */     //   305: goto -> 310
/*     */     //   308: ldc 65536
/*     */     //   310: ior
/*     */     //   311: istore #10
/*     */     //   313: iload #10
/*     */     //   315: ldc 74899
/*     */     //   317: iand
/*     */     //   318: ldc 74898
/*     */     //   320: if_icmpne -> 333
/*     */     //   323: aload #7
/*     */     //   325: invokeinterface getSkipping : ()Z
/*     */     //   330: ifne -> 952
/*     */     //   333: aload #7
/*     */     //   335: invokeinterface startDefaults : ()V
/*     */     //   340: iload #8
/*     */     //   342: iconst_1
/*     */     //   343: iand
/*     */     //   344: ifeq -> 357
/*     */     //   347: aload #7
/*     */     //   349: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   354: ifeq -> 436
/*     */     //   357: iload #9
/*     */     //   359: iconst_4
/*     */     //   360: iand
/*     */     //   361: ifeq -> 371
/*     */     //   364: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   367: checkcast androidx/compose/ui/Modifier
/*     */     //   370: astore_2
/*     */     //   371: iload #9
/*     */     //   373: bipush #8
/*     */     //   375: iand
/*     */     //   376: ifeq -> 399
/*     */     //   379: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
/*     */     //   382: pop
/*     */     //   383: iconst_1
/*     */     //   384: getstatic kotlin/time/DurationUnit.SECONDS : Lkotlin/time/DurationUnit;
/*     */     //   387: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
/*     */     //   390: lstore_3
/*     */     //   391: iload #10
/*     */     //   393: sipush #-7169
/*     */     //   396: iand
/*     */     //   397: istore #10
/*     */     //   399: iload #9
/*     */     //   401: bipush #16
/*     */     //   403: iand
/*     */     //   404: ifeq -> 416
/*     */     //   407: aconst_null
/*     */     //   408: fconst_0
/*     */     //   409: iconst_3
/*     */     //   410: aconst_null
/*     */     //   411: invokestatic fadeIn$default : (Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;
/*     */     //   414: astore #5
/*     */     //   416: iload #9
/*     */     //   418: bipush #32
/*     */     //   420: iand
/*     */     //   421: ifeq -> 459
/*     */     //   424: aconst_null
/*     */     //   425: fconst_0
/*     */     //   426: iconst_3
/*     */     //   427: aconst_null
/*     */     //   428: invokestatic fadeOut$default : (Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;
/*     */     //   431: astore #6
/*     */     //   433: goto -> 459
/*     */     //   436: aload #7
/*     */     //   438: invokeinterface skipToGroupEnd : ()V
/*     */     //   443: iload #9
/*     */     //   445: bipush #8
/*     */     //   447: iand
/*     */     //   448: ifeq -> 459
/*     */     //   451: iload #10
/*     */     //   453: sipush #-7169
/*     */     //   456: iand
/*     */     //   457: istore #10
/*     */     //   459: aload #7
/*     */     //   461: invokeinterface endDefaults : ()V
/*     */     //   466: invokestatic isTraceInProgress : ()Z
/*     */     //   469: ifeq -> 482
/*     */     //   472: ldc -399329090
/*     */     //   474: iload #10
/*     */     //   476: iconst_m1
/*     */     //   477: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.CopyTextToClipboardButton (CopyTextToClipboardButton.kt:43)'
/*     */     //   479: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   482: aload #7
/*     */     //   484: ldc 462103530
/*     */     //   486: invokeinterface startReplaceGroup : (I)V
/*     */     //   491: aload #7
/*     */     //   493: astore #13
/*     */     //   495: iconst_0
/*     */     //   496: istore #14
/*     */     //   498: nop
/*     */     //   499: iconst_0
/*     */     //   500: istore #15
/*     */     //   502: aload #13
/*     */     //   504: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   509: astore #16
/*     */     //   511: iconst_0
/*     */     //   512: istore #17
/*     */     //   514: aload #16
/*     */     //   516: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   519: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   522: if_acmpne -> 554
/*     */     //   525: iconst_0
/*     */     //   526: istore #18
/*     */     //   528: iconst_0
/*     */     //   529: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   532: aconst_null
/*     */     //   533: iconst_2
/*     */     //   534: aconst_null
/*     */     //   535: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   538: astore #18
/*     */     //   540: aload #13
/*     */     //   542: aload #18
/*     */     //   544: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   549: aload #18
/*     */     //   551: goto -> 556
/*     */     //   554: aload #16
/*     */     //   556: nop
/*     */     //   557: nop
/*     */     //   558: nop
/*     */     //   559: checkcast androidx/compose/runtime/MutableState
/*     */     //   562: astore #12
/*     */     //   564: aload #7
/*     */     //   566: invokeinterface endReplaceGroup : ()V
/*     */     //   571: aload #12
/*     */     //   573: astore #11
/*     */     //   575: aload #7
/*     */     //   577: ldc 462105417
/*     */     //   579: invokeinterface startReplaceGroup : (I)V
/*     */     //   584: aload #7
/*     */     //   586: astore #14
/*     */     //   588: iconst_0
/*     */     //   589: istore #15
/*     */     //   591: nop
/*     */     //   592: iconst_0
/*     */     //   593: istore #16
/*     */     //   595: aload #14
/*     */     //   597: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   602: astore #17
/*     */     //   604: iconst_0
/*     */     //   605: istore #18
/*     */     //   607: aload #17
/*     */     //   609: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   612: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   615: if_acmpne -> 644
/*     */     //   618: iconst_0
/*     */     //   619: istore #19
/*     */     //   621: aconst_null
/*     */     //   622: aconst_null
/*     */     //   623: iconst_2
/*     */     //   624: aconst_null
/*     */     //   625: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   628: astore #19
/*     */     //   630: aload #14
/*     */     //   632: aload #19
/*     */     //   634: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   639: aload #19
/*     */     //   641: goto -> 646
/*     */     //   644: aload #17
/*     */     //   646: nop
/*     */     //   647: nop
/*     */     //   648: nop
/*     */     //   649: checkcast androidx/compose/runtime/MutableState
/*     */     //   652: astore #13
/*     */     //   654: aload #7
/*     */     //   656: invokeinterface endReplaceGroup : ()V
/*     */     //   661: aload #13
/*     */     //   663: astore #12
/*     */     //   665: aload #7
/*     */     //   667: ldc 462108439
/*     */     //   669: invokeinterface startReplaceGroup : (I)V
/*     */     //   674: nop
/*     */     //   675: aload #11
/*     */     //   677: invokestatic CopyTextToClipboardButton_SBKQj6I$lambda$1 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   680: ifeq -> 695
/*     */     //   683: aload #7
/*     */     //   685: iconst_0
/*     */     //   686: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   689: invokevirtual getOnboardingDotsColor-0d7_KjU : ()J
/*     */     //   692: goto -> 701
/*     */     //   695: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
/*     */     //   698: invokevirtual getUnspecified-0d7_KjU : ()J
/*     */     //   701: lstore #14
/*     */     //   703: aload #7
/*     */     //   705: invokeinterface endReplaceGroup : ()V
/*     */     //   710: lload #14
/*     */     //   712: aconst_null
/*     */     //   713: aconst_null
/*     */     //   714: aconst_null
/*     */     //   715: aload #7
/*     */     //   717: iconst_0
/*     */     //   718: bipush #14
/*     */     //   720: invokestatic animateColorAsState-euL9pac : (JLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*     */     //   723: astore #13
/*     */     //   725: iconst_0
/*     */     //   726: istore #16
/*     */     //   728: nop
/*     */     //   729: iconst_0
/*     */     //   730: istore #17
/*     */     //   732: aload #7
/*     */     //   734: ldc 773894976
/*     */     //   736: ldc 'CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp'
/*     */     //   738: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   741: aload #7
/*     */     //   743: astore #18
/*     */     //   745: aload #7
/*     */     //   747: ldc -954370320
/*     */     //   749: ldc 'CC(remember):Effects.kt#9igjgp'
/*     */     //   751: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   754: aload #7
/*     */     //   756: astore #19
/*     */     //   758: iconst_0
/*     */     //   759: istore #20
/*     */     //   761: iconst_0
/*     */     //   762: istore #21
/*     */     //   764: aload #19
/*     */     //   766: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   771: astore #22
/*     */     //   773: iconst_0
/*     */     //   774: istore #23
/*     */     //   776: aload #22
/*     */     //   778: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   781: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   784: if_acmpne -> 831
/*     */     //   787: iconst_0
/*     */     //   788: istore #24
/*     */     //   790: iconst_0
/*     */     //   791: istore #25
/*     */     //   793: getstatic kotlin/coroutines/EmptyCoroutineContext.INSTANCE : Lkotlin/coroutines/EmptyCoroutineContext;
/*     */     //   796: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   799: aload #18
/*     */     //   801: invokestatic createCompositionCoroutineScope : (Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;
/*     */     //   804: astore #28
/*     */     //   806: new androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*     */     //   809: dup
/*     */     //   810: aload #28
/*     */     //   812: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;)V
/*     */     //   815: astore #25
/*     */     //   817: aload #19
/*     */     //   819: aload #25
/*     */     //   821: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   826: aload #25
/*     */     //   828: goto -> 833
/*     */     //   831: aload #22
/*     */     //   833: nop
/*     */     //   834: nop
/*     */     //   835: nop
/*     */     //   836: checkcast androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*     */     //   839: astore #26
/*     */     //   841: aload #7
/*     */     //   843: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   846: aload #26
/*     */     //   848: astore #27
/*     */     //   850: aload #27
/*     */     //   852: invokevirtual getCoroutineScope : ()Lkotlinx/coroutines/CoroutineScope;
/*     */     //   855: astore #26
/*     */     //   857: aload #7
/*     */     //   859: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   862: aload #26
/*     */     //   864: nop
/*     */     //   865: astore #14
/*     */     //   867: iload_0
/*     */     //   868: aconst_null
/*     */     //   869: aload #5
/*     */     //   871: aload #6
/*     */     //   873: aconst_null
/*     */     //   874: ldc 1486856086
/*     */     //   876: iconst_1
/*     */     //   877: new com/intellij/ml/llm/matterhorn/ej/ui/components/CopyTextToClipboardButtonKt$CopyTextToClipboardButton$1
/*     */     //   880: dup
/*     */     //   881: aload_2
/*     */     //   882: aload #14
/*     */     //   884: lload_3
/*     */     //   885: aload_1
/*     */     //   886: aload #12
/*     */     //   888: aload #11
/*     */     //   890: aload #13
/*     */     //   892: invokespecial <init> : (Landroidx/compose/ui/Modifier;Lkotlinx/coroutines/CoroutineScope;JLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/State;)V
/*     */     //   895: aload #7
/*     */     //   897: bipush #54
/*     */     //   899: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   902: checkcast kotlin/jvm/functions/Function3
/*     */     //   905: aload #7
/*     */     //   907: ldc 196608
/*     */     //   909: bipush #14
/*     */     //   911: iload #10
/*     */     //   913: iand
/*     */     //   914: ior
/*     */     //   915: sipush #896
/*     */     //   918: iload #10
/*     */     //   920: bipush #6
/*     */     //   922: ishr
/*     */     //   923: iand
/*     */     //   924: ior
/*     */     //   925: sipush #7168
/*     */     //   928: iload #10
/*     */     //   930: bipush #6
/*     */     //   932: ishr
/*     */     //   933: iand
/*     */     //   934: ior
/*     */     //   935: bipush #18
/*     */     //   937: invokestatic AnimatedVisibility : (ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   940: invokestatic isTraceInProgress : ()Z
/*     */     //   943: ifeq -> 959
/*     */     //   946: invokestatic traceEventEnd : ()V
/*     */     //   949: goto -> 959
/*     */     //   952: aload #7
/*     */     //   954: invokeinterface skipToGroupEnd : ()V
/*     */     //   959: aload #7
/*     */     //   961: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   966: dup
/*     */     //   967: ifnull -> 995
/*     */     //   970: iload_0
/*     */     //   971: aload_1
/*     */     //   972: aload_2
/*     */     //   973: lload_3
/*     */     //   974: aload #5
/*     */     //   976: aload #6
/*     */     //   978: iload #8
/*     */     //   980: iload #9
/*     */     //   982: <illegal opcode> invoke : (ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;II)Lkotlin/jvm/functions/Function2;
/*     */     //   987: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   992: goto -> 996
/*     */     //   995: pop
/*     */     //   996: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #44	-> 6
/*     */     //   #40	-> 364
/*     */     //   #41	-> 379
/*     */     //   #42	-> 407
/*     */     //   #43	-> 424
/*     */     //   #44	-> 479
/*     */     //   #45	-> 498
/*     */     //   #87	-> 502
/*     */     //   #88	-> 514
/*     */     //   #89	-> 525
/*     */     //   #45	-> 528
/*     */     //   #89	-> 538
/*     */     //   #90	-> 540
/*     */     //   #91	-> 549
/*     */     //   #92	-> 554
/*     */     //   #88	-> 556
/*     */     //   #87	-> 557
/*     */     //   #87	-> 558
/*     */     //   #45	-> 559
/*     */     //   #46	-> 591
/*     */     //   #93	-> 595
/*     */     //   #94	-> 607
/*     */     //   #95	-> 618
/*     */     //   #46	-> 621
/*     */     //   #95	-> 628
/*     */     //   #96	-> 630
/*     */     //   #97	-> 639
/*     */     //   #98	-> 644
/*     */     //   #94	-> 646
/*     */     //   #93	-> 647
/*     */     //   #93	-> 648
/*     */     //   #46	-> 649
/*     */     //   #48	-> 674
/*     */     //   #49	-> 675
/*     */     //   #50	-> 695
/*     */     //   #48	-> 701
/*     */     //   #47	-> 720
/*     */     //   #53	-> 728
/*     */     //   #99	-> 738
/*     */     //   #100	-> 741
/*     */     //   #102	-> 743
/*     */     //   #103	-> 751
/*     */     //   #104	-> 764
/*     */     //   #105	-> 776
/*     */     //   #106	-> 787
/*     */     //   #107	-> 790
/*     */     //   #108	-> 790
/*     */     //   #109	-> 793
/*     */     //   #108	-> 796
/*     */     //   #107	-> 804
/*     */     //   #106	-> 815
/*     */     //   #110	-> 817
/*     */     //   #111	-> 826
/*     */     //   #112	-> 831
/*     */     //   #105	-> 833
/*     */     //   #104	-> 834
/*     */     //   #104	-> 835
/*     */     //   #103	-> 836
/*     */     //   #113	-> 850
/*     */     //   #99	-> 859
/*     */     //   #113	-> 864
/*     */     //   #53	-> 865
/*     */     //   #55	-> 867
/*     */     //   #56	-> 869
/*     */     //   #57	-> 871
/*     */     //   #58	-> 874
/*     */     //   #54	-> 937
/*     */     //   #86	-> 952
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   528	10	18	$i$a$-cache-CopyTextToClipboardButtonKt$CopyTextToClipboardButton$isCopyFeedbackVisible$2	I
/*     */     //   540	11	18	value$iv	Ljava/lang/Object;
/*     */     //   514	43	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   511	46	16	it$iv	Ljava/lang/Object;
/*     */     //   502	57	15	$i$f$cache	I
/*     */     //   499	60	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   499	60	14	invalid$iv	Z
/*     */     //   621	7	19	$i$a$-cache-CopyTextToClipboardButtonKt$CopyTextToClipboardButton$flashJob$2	I
/*     */     //   630	11	19	value$iv	Ljava/lang/Object;
/*     */     //   607	40	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   604	43	17	it$iv	Ljava/lang/Object;
/*     */     //   595	54	16	$i$f$cache	I
/*     */     //   592	57	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   592	57	15	invalid$iv	Z
/*     */     //   793	3	25	$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1	I
/*     */     //   790	25	24	$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv	I
/*     */     //   817	11	25	value$iv$iv	Ljava/lang/Object;
/*     */     //   776	58	23	$i$a$-let-ComposerKt$cache$1$iv$iv	I
/*     */     //   773	61	22	it$iv$iv	Ljava/lang/Object;
/*     */     //   764	72	21	$i$f$cache	I
/*     */     //   761	75	19	$this$cache$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   761	75	20	invalid$iv$iv	Z
/*     */     //   732	133	17	$i$f$rememberCoroutineScope	I
/*     */     //   745	120	18	composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   850	15	27	wrapper$iv	Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
/*     */     //   729	136	16	$changed$iv	I
/*     */     //   575	374	11	isCopyFeedbackVisible$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   665	284	12	flashJob$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   725	224	13	iconColor$delegate	Landroidx/compose/runtime/State;
/*     */     //   867	82	14	scope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   21	976	10	$dirty	I
/*     */     //   0	997	0	visible	Z
/*     */     //   0	997	1	onCopyClicked	Lkotlin/jvm/functions/Function0;
/*     */     //   0	997	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	997	3	feedbackDuration	J
/*     */     //   0	997	5	enterTransition	Landroidx/compose/animation/EnterTransition;
/*     */     //   0	997	6	exitTransition	Landroidx/compose/animation/ExitTransition;
/*     */     //   0	997	7	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	997	8	$changed	I
/*     */   }
/*     */   
/*  45 */   private static final boolean CopyTextToClipboardButton_SBKQj6I$lambda$1(MutableState $isCopyFeedbackVisible$delegate) { State state = (State)$isCopyFeedbackVisible$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 114 */       (Boolean)state.getValue()).booleanValue(); } private static final void CopyTextToClipboardButton_SBKQj6I$lambda$2(MutableState $isCopyFeedbackVisible$delegate, boolean <set-?>) { MutableState mutableState = $isCopyFeedbackVisible$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 115 */     mutableState.setValue(value$iv); } private static final Job CopyTextToClipboardButton_SBKQj6I$lambda$4(MutableState $flashJob$delegate) { State state = (State)$flashJob$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 117 */     return (Job)state.getValue(); } private static final void CopyTextToClipboardButton_SBKQj6I$lambda$5(MutableState $flashJob$delegate, Job <set-?>) { MutableState mutableState = $flashJob$delegate; Object object = null; KProperty property$iv = null; int $i$f$setValue = 0;
/* 118 */     mutableState.setValue(<set-?>); } private static final long CopyTextToClipboardButton_SBKQj6I$lambda$6(State $iconColor$delegate) { State state = $iconColor$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 120 */     return ((Color)state.getValue()).unbox-impl(); }
/*     */ 
/*     */   
/*     */   private static final Unit CopyTextToClipboardButton_SBKQj6I$lambda$7(boolean $visible, Function0<Unit> $onCopyClicked, Modifier $modifier, long $feedbackDuration, EnterTransition $enterTransition, ExitTransition $exitTransition, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     CopyTextToClipboardButton-SBKQj6I($visible, $onCopyClicked, $modifier, $feedbackDuration, $enterTransition, $exitTransition, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nCopyTextToClipboardButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyTextToClipboardButton.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/CopyTextToClipboardButtonKt$CopyTextToClipboardButton$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,86:1\n149#2:87\n149#2:88\n1225#3,6:89\n71#4:95\n68#4,6:96\n74#4:130\n78#4:134\n79#5,6:102\n86#5,4:117\n90#5,2:127\n94#5:133\n368#6,9:108\n377#6:129\n378#6,2:131\n4034#7,6:121\n*S KotlinDebug\n*F\n+ 1 CopyTextToClipboardButton.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/CopyTextToClipboardButtonKt$CopyTextToClipboardButton$1\n*L\n61#1:87\n62#1:88\n63#1:89,6\n59#1:95\n59#1:96,6\n59#1:130\n59#1:134\n59#1:102,6\n59#1:117,4\n59#1:127,2\n59#1:133\n59#1:108,9\n59#1:129\n59#1:131,2\n59#1:121,6\n*E\n"})
/*     */   static final class CopyTextToClipboardButtonKt$CopyTextToClipboardButton$1 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(AnimatedVisibilityScope $this$AnimatedVisibility, Composer $composer, int $changed) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc '$this$AnimatedVisibility'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: invokestatic isTraceInProgress : ()Z
/*     */       //   9: ifeq -> 21
/*     */       //   12: ldc 1486856086
/*     */       //   14: iload_3
/*     */       //   15: iconst_m1
/*     */       //   16: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.CopyTextToClipboardButton.<anonymous> (CopyTextToClipboardButton.kt:58)'
/*     */       //   18: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   21: aload_0
/*     */       //   22: getfield $modifier : Landroidx/compose/ui/Modifier;
/*     */       //   25: fconst_0
/*     */       //   26: fconst_0
/*     */       //   27: bipush #12
/*     */       //   29: istore #4
/*     */       //   31: iconst_0
/*     */       //   32: istore #5
/*     */       //   34: iload #4
/*     */       //   36: i2f
/*     */       //   37: invokestatic constructor-impl : (F)F
/*     */       //   40: fconst_0
/*     */       //   41: bipush #11
/*     */       //   43: aconst_null
/*     */       //   44: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */       //   47: bipush #6
/*     */       //   49: istore #4
/*     */       //   51: iconst_0
/*     */       //   52: istore #5
/*     */       //   54: iload #4
/*     */       //   56: i2f
/*     */       //   57: invokestatic constructor-impl : (F)F
/*     */       //   60: invokestatic RoundedCornerShape-0680j_4 : (F)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */       //   63: checkcast androidx/compose/ui/graphics/Shape
/*     */       //   66: invokestatic clip : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*     */       //   69: iconst_0
/*     */       //   70: aconst_null
/*     */       //   71: aconst_null
/*     */       //   72: aload_2
/*     */       //   73: ldc -701829714
/*     */       //   75: invokeinterface startReplaceGroup : (I)V
/*     */       //   80: aload_2
/*     */       //   81: astore #5
/*     */       //   83: aload_2
/*     */       //   84: aload_0
/*     */       //   85: getfield $scope : Lkotlinx/coroutines/CoroutineScope;
/*     */       //   88: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   93: aload_2
/*     */       //   94: aload_0
/*     */       //   95: getfield $feedbackDuration : J
/*     */       //   98: invokeinterface changed : (J)Z
/*     */       //   103: ior
/*     */       //   104: aload_2
/*     */       //   105: aload_0
/*     */       //   106: getfield $onCopyClicked : Lkotlin/jvm/functions/Function0;
/*     */       //   109: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   114: ior
/*     */       //   115: istore #6
/*     */       //   117: aload_0
/*     */       //   118: getfield $scope : Lkotlinx/coroutines/CoroutineScope;
/*     */       //   121: astore #7
/*     */       //   123: aload_0
/*     */       //   124: getfield $onCopyClicked : Lkotlin/jvm/functions/Function0;
/*     */       //   127: astore #8
/*     */       //   129: aload_0
/*     */       //   130: getfield $flashJob$delegate : Landroidx/compose/runtime/MutableState;
/*     */       //   133: astore #9
/*     */       //   135: aload_0
/*     */       //   136: getfield $feedbackDuration : J
/*     */       //   139: lstore #10
/*     */       //   141: aload_0
/*     */       //   142: getfield $isCopyFeedbackVisible$delegate : Landroidx/compose/runtime/MutableState;
/*     */       //   145: astore #12
/*     */       //   147: iconst_0
/*     */       //   148: istore #13
/*     */       //   150: aload #5
/*     */       //   152: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   157: astore #14
/*     */       //   159: iconst_0
/*     */       //   160: istore #15
/*     */       //   162: iload #6
/*     */       //   164: ifne -> 178
/*     */       //   167: aload #14
/*     */       //   169: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   172: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   175: if_acmpne -> 232
/*     */       //   178: astore #35
/*     */       //   180: astore #34
/*     */       //   182: istore #33
/*     */       //   184: astore #32
/*     */       //   186: iconst_0
/*     */       //   187: istore #16
/*     */       //   189: aload #7
/*     */       //   191: aload #8
/*     */       //   193: aload #9
/*     */       //   195: lload #10
/*     */       //   197: aload #12
/*     */       //   199: <illegal opcode> invoke : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;JLandroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function0;
/*     */       //   204: astore #36
/*     */       //   206: aload #32
/*     */       //   208: iload #33
/*     */       //   210: aload #34
/*     */       //   212: aload #35
/*     */       //   214: aload #36
/*     */       //   216: astore #17
/*     */       //   218: aload #5
/*     */       //   220: aload #17
/*     */       //   222: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   227: aload #17
/*     */       //   229: goto -> 234
/*     */       //   232: aload #14
/*     */       //   234: nop
/*     */       //   235: nop
/*     */       //   236: nop
/*     */       //   237: checkcast kotlin/jvm/functions/Function0
/*     */       //   240: astore #4
/*     */       //   242: aload_2
/*     */       //   243: invokeinterface endReplaceGroup : ()V
/*     */       //   248: aload #4
/*     */       //   250: bipush #7
/*     */       //   252: aconst_null
/*     */       //   253: invokestatic clickable-XHw0xAI$default : (Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */       //   256: astore #4
/*     */       //   258: aload_0
/*     */       //   259: getfield $iconColor$delegate : Landroidx/compose/runtime/State;
/*     */       //   262: astore #7
/*     */       //   264: iconst_0
/*     */       //   265: istore #8
/*     */       //   267: iconst_0
/*     */       //   268: istore #9
/*     */       //   270: aload_2
/*     */       //   271: ldc 733328855
/*     */       //   273: ldc 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */       //   275: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   278: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */       //   281: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */       //   284: astore #5
/*     */       //   286: iconst_0
/*     */       //   287: istore #6
/*     */       //   289: aload #5
/*     */       //   291: iload #6
/*     */       //   293: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   296: astore #10
/*     */       //   298: bipush #112
/*     */       //   300: iload #8
/*     */       //   302: iconst_3
/*     */       //   303: ishl
/*     */       //   304: iand
/*     */       //   305: istore #11
/*     */       //   307: nop
/*     */       //   308: iconst_0
/*     */       //   309: istore #12
/*     */       //   311: aload_2
/*     */       //   312: ldc -1323940314
/*     */       //   314: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */       //   316: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   319: aload_2
/*     */       //   320: iconst_0
/*     */       //   321: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */       //   324: istore #13
/*     */       //   326: aload_2
/*     */       //   327: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   332: astore #14
/*     */       //   334: aload_2
/*     */       //   335: aload #4
/*     */       //   337: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */       //   340: astore #15
/*     */       //   342: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   345: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */       //   348: astore #16
/*     */       //   350: bipush #6
/*     */       //   352: sipush #896
/*     */       //   355: iload #11
/*     */       //   357: bipush #6
/*     */       //   359: ishl
/*     */       //   360: iand
/*     */       //   361: ior
/*     */       //   362: istore #17
/*     */       //   364: nop
/*     */       //   365: iconst_0
/*     */       //   366: istore #18
/*     */       //   368: aload_2
/*     */       //   369: ldc -692256719
/*     */       //   371: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */       //   373: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   376: aload_2
/*     */       //   377: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */       //   382: instanceof androidx/compose/runtime/Applier
/*     */       //   385: ifne -> 391
/*     */       //   388: invokestatic invalidApplier : ()V
/*     */       //   391: aload_2
/*     */       //   392: invokeinterface startReusableNode : ()V
/*     */       //   397: aload_2
/*     */       //   398: invokeinterface getInserting : ()Z
/*     */       //   403: ifeq -> 417
/*     */       //   406: aload_2
/*     */       //   407: aload #16
/*     */       //   409: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */       //   414: goto -> 423
/*     */       //   417: aload_2
/*     */       //   418: invokeinterface useNode : ()V
/*     */       //   423: aload_2
/*     */       //   424: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */       //   427: astore #19
/*     */       //   429: iconst_0
/*     */       //   430: istore #20
/*     */       //   432: aload #19
/*     */       //   434: aload #10
/*     */       //   436: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   439: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */       //   442: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   445: aload #19
/*     */       //   447: aload #14
/*     */       //   449: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   452: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */       //   455: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   458: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   461: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */       //   464: astore #21
/*     */       //   466: iconst_0
/*     */       //   467: istore #22
/*     */       //   469: aload #19
/*     */       //   471: astore #23
/*     */       //   473: iconst_0
/*     */       //   474: istore #24
/*     */       //   476: aload #23
/*     */       //   478: invokeinterface getInserting : ()Z
/*     */       //   483: ifne -> 504
/*     */       //   486: aload #23
/*     */       //   488: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   493: iload #13
/*     */       //   495: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   498: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   501: ifne -> 530
/*     */       //   504: aload #23
/*     */       //   506: iload #13
/*     */       //   508: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   511: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   516: aload #19
/*     */       //   518: iload #13
/*     */       //   520: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   523: aload #21
/*     */       //   525: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   530: nop
/*     */       //   531: nop
/*     */       //   532: nop
/*     */       //   533: aload #19
/*     */       //   535: aload #15
/*     */       //   537: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   540: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */       //   543: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   546: nop
/*     */       //   547: nop
/*     */       //   548: aload_2
/*     */       //   549: bipush #14
/*     */       //   551: iload #17
/*     */       //   553: bipush #6
/*     */       //   555: ishr
/*     */       //   556: iand
/*     */       //   557: istore #25
/*     */       //   559: astore #26
/*     */       //   561: iconst_0
/*     */       //   562: istore #27
/*     */       //   564: aload #26
/*     */       //   566: ldc_w -2146769399
/*     */       //   569: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */       //   572: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   575: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */       //   578: aload #26
/*     */       //   580: bipush #6
/*     */       //   582: bipush #112
/*     */       //   584: iload #8
/*     */       //   586: bipush #6
/*     */       //   588: ishr
/*     */       //   589: iand
/*     */       //   590: ior
/*     */       //   591: istore #28
/*     */       //   593: astore #29
/*     */       //   595: checkcast androidx/compose/foundation/layout/BoxScope
/*     */       //   598: astore #30
/*     */       //   600: iconst_0
/*     */       //   601: istore #31
/*     */       //   603: getstatic com/intellij/ml/llm/matterhorn/ej/ui/components/ComposableSingletons$CopyTextToClipboardButtonKt.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/components/ComposableSingletons$CopyTextToClipboardButtonKt;
/*     */       //   606: invokevirtual getLambda-1$ej_ui : ()Lkotlin/jvm/functions/Function2;
/*     */       //   609: aconst_null
/*     */       //   610: iconst_0
/*     */       //   611: aconst_null
/*     */       //   612: aconst_null
/*     */       //   613: ldc_w 298552850
/*     */       //   616: iconst_1
/*     */       //   617: new com/intellij/ml/llm/matterhorn/ej/ui/components/CopyTextToClipboardButtonKt$CopyTextToClipboardButton$1$2$1
/*     */       //   620: dup
/*     */       //   621: aload #7
/*     */       //   623: invokespecial <init> : (Landroidx/compose/runtime/State;)V
/*     */       //   626: aload #29
/*     */       //   628: bipush #54
/*     */       //   630: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */       //   633: checkcast kotlin/jvm/functions/Function2
/*     */       //   636: aload #29
/*     */       //   638: ldc_w 196614
/*     */       //   641: bipush #30
/*     */       //   643: invokestatic JunieTooltip : (Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/foundation/TooltipPlacement;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */       //   646: nop
/*     */       //   647: aload #26
/*     */       //   649: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   652: aload_2
/*     */       //   653: invokeinterface endNode : ()V
/*     */       //   658: aload_2
/*     */       //   659: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   662: nop
/*     */       //   663: aload_2
/*     */       //   664: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   667: nop
/*     */       //   668: aload_2
/*     */       //   669: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   672: nop
/*     */       //   673: invokestatic isTraceInProgress : ()Z
/*     */       //   676: ifeq -> 682
/*     */       //   679: invokestatic traceEventEnd : ()V
/*     */       //   682: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #59	-> 18
/*     */       //   #60	-> 21
/*     */       //   #61	-> 25
/*     */       //   #87	-> 34
/*     */       //   #61	-> 40
/*     */       //   #62	-> 47
/*     */       //   #88	-> 54
/*     */       //   #62	-> 60
/*     */       //   #63	-> 69
/*     */       //   #89	-> 150
/*     */       //   #90	-> 162
/*     */       //   #91	-> 178
/*     */       //   #63	-> 189
/*     */       //   #91	-> 216
/*     */       //   #92	-> 218
/*     */       //   #93	-> 227
/*     */       //   #94	-> 232
/*     */       //   #90	-> 234
/*     */       //   #89	-> 235
/*     */       //   #89	-> 236
/*     */       //   #63	-> 237
/*     */       //   #59	-> 258
/*     */       //   #95	-> 275
/*     */       //   #96	-> 278
/*     */       //   #97	-> 286
/*     */       //   #100	-> 289
/*     */       //   #101	-> 307
/*     */       //   #102	-> 316
/*     */       //   #103	-> 321
/*     */       //   #104	-> 327
/*     */       //   #105	-> 335
/*     */       //   #107	-> 342
/*     */       //   #106	-> 364
/*     */       //   #108	-> 373
/*     */       //   #109	-> 376
/*     */       //   #110	-> 392
/*     */       //   #111	-> 397
/*     */       //   #112	-> 407
/*     */       //   #114	-> 418
/*     */       //   #116	-> 423
/*     */       //   #117	-> 432
/*     */       //   #118	-> 445
/*     */       //   #120	-> 458
/*     */       //   #121	-> 469
/*     */       //   #122	-> 476
/*     */       //   #123	-> 504
/*     */       //   #124	-> 516
/*     */       //   #126	-> 530
/*     */       //   #121	-> 531
/*     */       //   #126	-> 532
/*     */       //   #127	-> 533
/*     */       //   #128	-> 546
/*     */       //   #116	-> 547
/*     */       //   #129	-> 548
/*     */       //   #130	-> 572
/*     */       //   #75	-> 613
/*     */       //   #73	-> 643
/*     */       //   #84	-> 646
/*     */       //   #130	-> 647
/*     */       //   #129	-> 652
/*     */       //   #131	-> 653
/*     */       //   #108	-> 659
/*     */       //   #132	-> 662
/*     */       //   #102	-> 664
/*     */       //   #133	-> 667
/*     */       //   #95	-> 669
/*     */       //   #134	-> 672
/*     */       //   #85	-> 682
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   34	6	5	$i$f$getDp	I
/*     */       //   31	9	4	$this$dp$iv	I
/*     */       //   54	6	5	$i$f$getDp	I
/*     */       //   51	9	4	$this$dp$iv	I
/*     */       //   189	15	16	$i$a$-cache-CopyTextToClipboardButtonKt$CopyTextToClipboardButton$1$1	I
/*     */       //   218	11	17	value$iv	Ljava/lang/Object;
/*     */       //   162	73	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   159	76	14	it$iv	Ljava/lang/Object;
/*     */       //   150	87	13	$i$f$cache	I
/*     */       //   147	90	5	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   147	90	6	invalid$iv	Z
/*     */       //   603	44	31	$i$a$-Box-CopyTextToClipboardButtonKt$CopyTextToClipboardButton$1$2	I
/*     */       //   600	47	30	$this$invoke_u24lambda_u242	Landroidx/compose/foundation/layout/BoxScope;
/*     */       //   600	47	29	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   600	47	28	$changed	I
/*     */       //   564	88	27	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */       //   561	91	26	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */       //   561	91	25	$changed$iv	I
/*     */       //   476	55	24	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */       //   473	58	23	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   469	64	22	$i$f$set-impl	I
/*     */       //   466	67	21	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */       //   432	115	20	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */       //   429	118	19	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   368	295	18	$i$f$ReusableComposeNode	I
/*     */       //   365	298	16	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */       //   365	298	17	$changed$iv$iv$iv	I
/*     */       //   311	357	12	$i$f$Layout	I
/*     */       //   326	342	13	compositeKeyHash$iv$iv	I
/*     */       //   334	334	14	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   342	326	15	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */       //   308	360	11	$changed$iv$iv	I
/*     */       //   270	403	9	$i$f$Box	I
/*     */       //   298	375	10	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   267	406	4	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */       //   286	387	5	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */       //   289	384	6	propagateMinConstraints$iv	Z
/*     */       //   267	406	8	$changed$iv	I
/*     */       //   0	683	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/CopyTextToClipboardButtonKt$CopyTextToClipboardButton$1;
/*     */       //   0	683	1	$this$AnimatedVisibility	Landroidx/compose/animation/AnimatedVisibilityScope;
/*     */       //   0	683	2	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	683	3	$changed	I
/*     */     }
/*     */     
/*     */     private static final Unit invoke$lambda$1$lambda$0(CoroutineScope $scope, Function0 $onCopyClicked, MutableState $flashJob$delegate, long $feedbackDuration, MutableState<Boolean> $isCopyFeedbackVisible$delegate) {
/*     */       if (CopyTextToClipboardButtonKt.CopyTextToClipboardButton_SBKQj6I$lambda$4($flashJob$delegate) != null) {
/*     */         Job.DefaultImpls.cancel$default(CopyTextToClipboardButtonKt.CopyTextToClipboardButton_SBKQj6I$lambda$4($flashJob$delegate), null, 1, null);
/*     */       } else {
/*     */         CopyTextToClipboardButtonKt.CopyTextToClipboardButton_SBKQj6I$lambda$4($flashJob$delegate);
/*     */       } 
/*     */       CopyTextToClipboardButtonKt.CopyTextToClipboardButton_SBKQj6I$lambda$5($flashJob$delegate, BuildersKt.launch$default($scope, null, null, new CopyTextToClipboardButtonKt$CopyTextToClipboardButton$1$1$1$1($feedbackDuration, $isCopyFeedbackVisible$delegate, null), 3, null));
/*     */       CopyTextToClipboardButtonKt.CopyTextToClipboardButton_SBKQj6I$lambda$2($isCopyFeedbackVisible$delegate, true);
/*     */       $onCopyClicked.invoke();
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     CopyTextToClipboardButtonKt$CopyTextToClipboardButton$1(Modifier $modifier, CoroutineScope $scope, long $feedbackDuration, Function0<Unit> $onCopyClicked, MutableState<Job> $flashJob$delegate, MutableState<Boolean> $isCopyFeedbackVisible$delegate, State<Color> $iconColor$delegate) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\CopyTextToClipboardButtonKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */