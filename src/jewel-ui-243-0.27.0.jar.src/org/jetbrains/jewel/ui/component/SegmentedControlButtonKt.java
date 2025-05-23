/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.interaction.Interaction;
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.foundation.layout.Arrangement;
/*     */ import androidx.compose.foundation.layout.PaddingKt;
/*     */ import androidx.compose.foundation.layout.RowKt;
/*     */ import androidx.compose.foundation.layout.RowScope;
/*     */ import androidx.compose.foundation.layout.RowScopeInstance;
/*     */ import androidx.compose.foundation.layout.SizeKt;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.focus.FocusProperties;
/*     */ import androidx.compose.ui.graphics.Brush;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import androidx.compose.ui.text.TextStyle;
/*     */ import androidx.compose.ui.unit.DpSize;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.component.styling.SegmentedControlButtonStyle;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000B\n\000\n\002\020\002\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\032Q\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0032\006\020\005\032\0020\0032\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\b\b\002\020\f\032\0020\r2\b\b\002\020\016\032\0020\017H\001¢\006\002\020\020¨\006\021²\006\n\020\022\032\0020\023X\002²\006\n\020\024\032\0020\025X\002²\006\n\020\026\032\0020\025X\002²\006\n\020\027\032\0020\030X\002"}, d2 = {"SegmentedControlButton", "", "isActive", "", "isFocused", "enabled", "segmentedControlButtonData", "Lorg/jetbrains/jewel/ui/component/SegmentedControlButtonData;", "style", "Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlButtonStyle;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "modifier", "Landroidx/compose/ui/Modifier;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZZZLorg/jetbrains/jewel/ui/component/SegmentedControlButtonData;Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlButtonStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "ui", "buttonState", "Lorg/jetbrains/jewel/ui/component/SegmentedControlButtonState;", "backgroundColor", "Landroidx/compose/ui/graphics/Brush;", "borderColor", "contentColor", "Landroidx/compose/ui/graphics/Color;"})
/*     */ @SourceDebugExtension({"SMAP\nSegmentedControlButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedControlButton.kt\norg/jetbrains/jewel/ui/component/SegmentedControlButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,171:1\n1225#2,6:172\n1225#2,6:178\n1225#2,6:184\n1225#2,6:190\n1225#2,6:196\n71#3:202\n68#3,6:203\n74#3:237\n78#3:246\n79#4,6:209\n86#4,4:224\n90#4,2:234\n94#4:245\n368#5,9:215\n377#5:236\n378#5,2:243\n4034#6,6:228\n708#7:238\n696#7:239\n708#7:241\n696#7:242\n77#8:240\n81#9:247\n107#9,2:248\n81#9:250\n81#9:251\n81#9:252\n*S KotlinDebug\n*F\n+ 1 SegmentedControlButton.kt\norg/jetbrains/jewel/ui/component/SegmentedControlButtonKt\n*L\n53#1:172,6\n55#1:178,6\n64#1:184,6\n69#1:190,6\n90#1:196,6\n87#1:202\n87#1:203,6\n87#1:237\n87#1:246\n87#1:209,6\n87#1:224,4\n87#1:234,2\n87#1:245\n87#1:215,9\n87#1:236\n87#1:243,2\n87#1:228,6\n106#1:238\n106#1:239\n107#1:241\n107#1:242\n106#1:240\n55#1:247\n55#1:248,2\n84#1:250\n85#1:251\n103#1:252\n*E\n"})
/*     */ public final class SegmentedControlButtonKt {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void SegmentedControlButton(boolean isActive, boolean isFocused, boolean enabled, @NotNull SegmentedControlButtonData segmentedControlButtonData, @NotNull SegmentedControlButtonStyle style, @NotNull TextStyle textStyle, @Nullable Modifier modifier, @Nullable MutableInteractionSource interactionSource, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: ldc 'segmentedControlButtonData'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #4
/*     */     //   8: ldc 'style'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload #5
/*     */     //   15: ldc 'textStyle'
/*     */     //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   20: aload #8
/*     */     //   22: ldc 1007148549
/*     */     //   24: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   29: astore #8
/*     */     //   31: iload #9
/*     */     //   33: istore #11
/*     */     //   35: iload #10
/*     */     //   37: iconst_1
/*     */     //   38: iand
/*     */     //   39: ifeq -> 52
/*     */     //   42: iload #11
/*     */     //   44: bipush #6
/*     */     //   46: ior
/*     */     //   47: istore #11
/*     */     //   49: goto -> 81
/*     */     //   52: iload #9
/*     */     //   54: bipush #6
/*     */     //   56: iand
/*     */     //   57: ifne -> 81
/*     */     //   60: iload #11
/*     */     //   62: aload #8
/*     */     //   64: iload_0
/*     */     //   65: invokeinterface changed : (Z)Z
/*     */     //   70: ifeq -> 77
/*     */     //   73: iconst_4
/*     */     //   74: goto -> 78
/*     */     //   77: iconst_2
/*     */     //   78: ior
/*     */     //   79: istore #11
/*     */     //   81: iload #10
/*     */     //   83: iconst_2
/*     */     //   84: iand
/*     */     //   85: ifeq -> 98
/*     */     //   88: iload #11
/*     */     //   90: bipush #48
/*     */     //   92: ior
/*     */     //   93: istore #11
/*     */     //   95: goto -> 129
/*     */     //   98: iload #9
/*     */     //   100: bipush #48
/*     */     //   102: iand
/*     */     //   103: ifne -> 129
/*     */     //   106: iload #11
/*     */     //   108: aload #8
/*     */     //   110: iload_1
/*     */     //   111: invokeinterface changed : (Z)Z
/*     */     //   116: ifeq -> 124
/*     */     //   119: bipush #32
/*     */     //   121: goto -> 126
/*     */     //   124: bipush #16
/*     */     //   126: ior
/*     */     //   127: istore #11
/*     */     //   129: iload #10
/*     */     //   131: iconst_4
/*     */     //   132: iand
/*     */     //   133: ifeq -> 147
/*     */     //   136: iload #11
/*     */     //   138: sipush #384
/*     */     //   141: ior
/*     */     //   142: istore #11
/*     */     //   144: goto -> 181
/*     */     //   147: iload #9
/*     */     //   149: sipush #384
/*     */     //   152: iand
/*     */     //   153: ifne -> 181
/*     */     //   156: iload #11
/*     */     //   158: aload #8
/*     */     //   160: iload_2
/*     */     //   161: invokeinterface changed : (Z)Z
/*     */     //   166: ifeq -> 175
/*     */     //   169: sipush #256
/*     */     //   172: goto -> 178
/*     */     //   175: sipush #128
/*     */     //   178: ior
/*     */     //   179: istore #11
/*     */     //   181: iload #10
/*     */     //   183: bipush #8
/*     */     //   185: iand
/*     */     //   186: ifeq -> 200
/*     */     //   189: iload #11
/*     */     //   191: sipush #3072
/*     */     //   194: ior
/*     */     //   195: istore #11
/*     */     //   197: goto -> 234
/*     */     //   200: iload #9
/*     */     //   202: sipush #3072
/*     */     //   205: iand
/*     */     //   206: ifne -> 234
/*     */     //   209: iload #11
/*     */     //   211: aload #8
/*     */     //   213: aload_3
/*     */     //   214: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   219: ifeq -> 228
/*     */     //   222: sipush #2048
/*     */     //   225: goto -> 231
/*     */     //   228: sipush #1024
/*     */     //   231: ior
/*     */     //   232: istore #11
/*     */     //   234: iload #10
/*     */     //   236: bipush #16
/*     */     //   238: iand
/*     */     //   239: ifeq -> 253
/*     */     //   242: iload #11
/*     */     //   244: sipush #24576
/*     */     //   247: ior
/*     */     //   248: istore #11
/*     */     //   250: goto -> 288
/*     */     //   253: iload #9
/*     */     //   255: sipush #24576
/*     */     //   258: iand
/*     */     //   259: ifne -> 288
/*     */     //   262: iload #11
/*     */     //   264: aload #8
/*     */     //   266: aload #4
/*     */     //   268: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   273: ifeq -> 282
/*     */     //   276: sipush #16384
/*     */     //   279: goto -> 285
/*     */     //   282: sipush #8192
/*     */     //   285: ior
/*     */     //   286: istore #11
/*     */     //   288: iload #10
/*     */     //   290: bipush #32
/*     */     //   292: iand
/*     */     //   293: ifeq -> 306
/*     */     //   296: iload #11
/*     */     //   298: ldc 196608
/*     */     //   300: ior
/*     */     //   301: istore #11
/*     */     //   303: goto -> 338
/*     */     //   306: iload #9
/*     */     //   308: ldc 196608
/*     */     //   310: iand
/*     */     //   311: ifne -> 338
/*     */     //   314: iload #11
/*     */     //   316: aload #8
/*     */     //   318: aload #5
/*     */     //   320: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   325: ifeq -> 333
/*     */     //   328: ldc 131072
/*     */     //   330: goto -> 335
/*     */     //   333: ldc 65536
/*     */     //   335: ior
/*     */     //   336: istore #11
/*     */     //   338: iload #10
/*     */     //   340: bipush #64
/*     */     //   342: iand
/*     */     //   343: ifeq -> 356
/*     */     //   346: iload #11
/*     */     //   348: ldc 1572864
/*     */     //   350: ior
/*     */     //   351: istore #11
/*     */     //   353: goto -> 388
/*     */     //   356: iload #9
/*     */     //   358: ldc 1572864
/*     */     //   360: iand
/*     */     //   361: ifne -> 388
/*     */     //   364: iload #11
/*     */     //   366: aload #8
/*     */     //   368: aload #6
/*     */     //   370: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   375: ifeq -> 383
/*     */     //   378: ldc 1048576
/*     */     //   380: goto -> 385
/*     */     //   383: ldc 524288
/*     */     //   385: ior
/*     */     //   386: istore #11
/*     */     //   388: iload #10
/*     */     //   390: sipush #128
/*     */     //   393: iand
/*     */     //   394: ifeq -> 407
/*     */     //   397: iload #11
/*     */     //   399: ldc 12582912
/*     */     //   401: ior
/*     */     //   402: istore #11
/*     */     //   404: goto -> 439
/*     */     //   407: iload #9
/*     */     //   409: ldc 12582912
/*     */     //   411: iand
/*     */     //   412: ifne -> 439
/*     */     //   415: iload #11
/*     */     //   417: aload #8
/*     */     //   419: aload #7
/*     */     //   421: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   426: ifeq -> 434
/*     */     //   429: ldc 8388608
/*     */     //   431: goto -> 436
/*     */     //   434: ldc 4194304
/*     */     //   436: ior
/*     */     //   437: istore #11
/*     */     //   439: iload #11
/*     */     //   441: ldc 4793491
/*     */     //   443: iand
/*     */     //   444: ldc 4793490
/*     */     //   446: if_icmpne -> 459
/*     */     //   449: aload #8
/*     */     //   451: invokeinterface getSkipping : ()Z
/*     */     //   456: ifne -> 1961
/*     */     //   459: iload #10
/*     */     //   461: bipush #64
/*     */     //   463: iand
/*     */     //   464: ifeq -> 475
/*     */     //   467: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   470: checkcast androidx/compose/ui/Modifier
/*     */     //   473: astore #6
/*     */     //   475: iload #10
/*     */     //   477: sipush #128
/*     */     //   480: iand
/*     */     //   481: ifeq -> 569
/*     */     //   484: aload #8
/*     */     //   486: ldc -1289822558
/*     */     //   488: invokeinterface startReplaceGroup : (I)V
/*     */     //   493: aload #8
/*     */     //   495: astore #13
/*     */     //   497: iconst_0
/*     */     //   498: istore #14
/*     */     //   500: iconst_0
/*     */     //   501: istore #15
/*     */     //   503: aload #13
/*     */     //   505: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   510: astore #16
/*     */     //   512: iconst_0
/*     */     //   513: istore #17
/*     */     //   515: aload #16
/*     */     //   517: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   520: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   523: if_acmpne -> 548
/*     */     //   526: iconst_0
/*     */     //   527: istore #18
/*     */     //   529: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   532: astore #18
/*     */     //   534: aload #13
/*     */     //   536: aload #18
/*     */     //   538: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   543: aload #18
/*     */     //   545: goto -> 550
/*     */     //   548: aload #16
/*     */     //   550: nop
/*     */     //   551: nop
/*     */     //   552: nop
/*     */     //   553: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   556: astore #12
/*     */     //   558: aload #8
/*     */     //   560: invokeinterface endReplaceGroup : ()V
/*     */     //   565: aload #12
/*     */     //   567: astore #7
/*     */     //   569: invokestatic isTraceInProgress : ()Z
/*     */     //   572: ifeq -> 585
/*     */     //   575: ldc 1007148549
/*     */     //   577: iload #11
/*     */     //   579: iconst_m1
/*     */     //   580: ldc 'org.jetbrains.jewel.ui.component.SegmentedControlButton (SegmentedControlButton.kt:53)'
/*     */     //   582: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   585: aload #8
/*     */     //   587: ldc -1289820179
/*     */     //   589: invokeinterface startReplaceGroup : (I)V
/*     */     //   594: aload #8
/*     */     //   596: astore #14
/*     */     //   598: iconst_0
/*     */     //   599: istore #15
/*     */     //   601: nop
/*     */     //   602: iconst_0
/*     */     //   603: istore #16
/*     */     //   605: aload #14
/*     */     //   607: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   612: astore #17
/*     */     //   614: iconst_0
/*     */     //   615: istore #18
/*     */     //   617: aload #17
/*     */     //   619: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   622: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   625: if_acmpne -> 682
/*     */     //   628: iconst_0
/*     */     //   629: istore #19
/*     */     //   631: getstatic org/jetbrains/jewel/ui/component/SegmentedControlButtonState.Companion : Lorg/jetbrains/jewel/ui/component/SegmentedControlButtonState$Companion;
/*     */     //   634: astore #20
/*     */     //   636: aload_3
/*     */     //   637: invokevirtual getSelected : ()Z
/*     */     //   640: istore #21
/*     */     //   642: aload #20
/*     */     //   644: iload #21
/*     */     //   646: iload_2
/*     */     //   647: iconst_0
/*     */     //   648: iconst_0
/*     */     //   649: iload_0
/*     */     //   650: bipush #12
/*     */     //   652: aconst_null
/*     */     //   653: invokestatic of-Um8v6X4$default : (Lorg/jetbrains/jewel/ui/component/SegmentedControlButtonState$Companion;ZZZZZILjava/lang/Object;)J
/*     */     //   656: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/SegmentedControlButtonState;
/*     */     //   659: aconst_null
/*     */     //   660: iconst_2
/*     */     //   661: aconst_null
/*     */     //   662: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   665: nop
/*     */     //   666: astore #22
/*     */     //   668: aload #14
/*     */     //   670: aload #22
/*     */     //   672: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   677: aload #22
/*     */     //   679: goto -> 684
/*     */     //   682: aload #17
/*     */     //   684: nop
/*     */     //   685: nop
/*     */     //   686: nop
/*     */     //   687: checkcast androidx/compose/runtime/MutableState
/*     */     //   690: astore #13
/*     */     //   692: aload #8
/*     */     //   694: invokeinterface endReplaceGroup : ()V
/*     */     //   699: aload #13
/*     */     //   701: astore #12
/*     */     //   703: aload_3
/*     */     //   704: invokevirtual getSelected : ()Z
/*     */     //   707: istore #13
/*     */     //   709: aload #8
/*     */     //   711: ldc -1289812308
/*     */     //   713: invokeinterface startReplaceGroup : (I)V
/*     */     //   718: aload #8
/*     */     //   720: astore #14
/*     */     //   722: aload #8
/*     */     //   724: iload #13
/*     */     //   726: invokeinterface changed : (Z)Z
/*     */     //   731: iload #11
/*     */     //   733: sipush #896
/*     */     //   736: iand
/*     */     //   737: sipush #256
/*     */     //   740: if_icmpne -> 747
/*     */     //   743: iconst_1
/*     */     //   744: goto -> 748
/*     */     //   747: iconst_0
/*     */     //   748: ior
/*     */     //   749: iload #11
/*     */     //   751: bipush #14
/*     */     //   753: iand
/*     */     //   754: iconst_4
/*     */     //   755: if_icmpne -> 762
/*     */     //   758: iconst_1
/*     */     //   759: goto -> 763
/*     */     //   762: iconst_0
/*     */     //   763: ior
/*     */     //   764: istore #15
/*     */     //   766: iconst_0
/*     */     //   767: istore #16
/*     */     //   769: aload #14
/*     */     //   771: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   776: astore #17
/*     */     //   778: iconst_0
/*     */     //   779: istore #18
/*     */     //   781: iload #15
/*     */     //   783: ifne -> 797
/*     */     //   786: aload #17
/*     */     //   788: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   791: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   794: if_acmpne -> 852
/*     */     //   797: iconst_0
/*     */     //   798: istore #19
/*     */     //   800: aload #12
/*     */     //   802: aload #12
/*     */     //   804: invokestatic SegmentedControlButton$lambda$2 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   807: lstore #20
/*     */     //   809: aload_3
/*     */     //   810: invokevirtual getSelected : ()Z
/*     */     //   813: istore #22
/*     */     //   815: lload #20
/*     */     //   817: iload #22
/*     */     //   819: iload_2
/*     */     //   820: iconst_0
/*     */     //   821: iconst_0
/*     */     //   822: iload_0
/*     */     //   823: bipush #12
/*     */     //   825: aconst_null
/*     */     //   826: invokestatic copy-Um8v6X4$default : (JZZZZZILjava/lang/Object;)J
/*     */     //   829: invokestatic SegmentedControlButton$lambda$3 : (Landroidx/compose/runtime/MutableState;J)V
/*     */     //   832: nop
/*     */     //   833: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   836: astore #23
/*     */     //   838: aload #14
/*     */     //   840: aload #23
/*     */     //   842: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   847: aload #23
/*     */     //   849: goto -> 854
/*     */     //   852: aload #17
/*     */     //   854: nop
/*     */     //   855: nop
/*     */     //   856: nop
/*     */     //   857: pop
/*     */     //   858: aload #8
/*     */     //   860: invokeinterface endReplaceGroup : ()V
/*     */     //   865: aload #7
/*     */     //   867: aload #8
/*     */     //   869: ldc -1289804005
/*     */     //   871: invokeinterface startReplaceGroup : (I)V
/*     */     //   876: aload #8
/*     */     //   878: astore #14
/*     */     //   880: iload #11
/*     */     //   882: ldc 29360128
/*     */     //   884: iand
/*     */     //   885: ldc 8388608
/*     */     //   887: if_icmpne -> 894
/*     */     //   890: iconst_1
/*     */     //   891: goto -> 895
/*     */     //   894: iconst_0
/*     */     //   895: istore #15
/*     */     //   897: iconst_0
/*     */     //   898: istore #16
/*     */     //   900: aload #14
/*     */     //   902: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   907: astore #17
/*     */     //   909: iconst_0
/*     */     //   910: istore #18
/*     */     //   912: iload #15
/*     */     //   914: ifne -> 928
/*     */     //   917: aload #17
/*     */     //   919: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   922: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   925: if_acmpne -> 967
/*     */     //   928: astore #71
/*     */     //   930: iconst_0
/*     */     //   931: istore #19
/*     */     //   933: new org/jetbrains/jewel/ui/component/SegmentedControlButtonKt$SegmentedControlButton$3$1
/*     */     //   936: dup
/*     */     //   937: aload #7
/*     */     //   939: aload #12
/*     */     //   941: aconst_null
/*     */     //   942: invokespecial <init> : (Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*     */     //   945: checkcast kotlin/jvm/functions/Function2
/*     */     //   948: aload #71
/*     */     //   950: swap
/*     */     //   951: astore #20
/*     */     //   953: aload #14
/*     */     //   955: aload #20
/*     */     //   957: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   962: aload #20
/*     */     //   964: goto -> 969
/*     */     //   967: aload #17
/*     */     //   969: nop
/*     */     //   970: nop
/*     */     //   971: nop
/*     */     //   972: checkcast kotlin/jvm/functions/Function2
/*     */     //   975: astore #13
/*     */     //   977: aload #8
/*     */     //   979: invokeinterface endReplaceGroup : ()V
/*     */     //   984: aload #13
/*     */     //   986: aload #8
/*     */     //   988: bipush #14
/*     */     //   990: iload #11
/*     */     //   992: bipush #21
/*     */     //   994: ishr
/*     */     //   995: iand
/*     */     //   996: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   999: aload #4
/*     */     //   1001: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlButtonMetrics;
/*     */     //   1004: invokevirtual getCornerSize : ()Landroidx/compose/foundation/shape/CornerSize;
/*     */     //   1007: invokestatic RoundedCornerShape : (Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   1010: astore #13
/*     */     //   1012: aload #4
/*     */     //   1014: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlButtonColors;
/*     */     //   1017: astore #14
/*     */     //   1019: aload #14
/*     */     //   1021: aload #12
/*     */     //   1023: invokestatic SegmentedControlButton$lambda$2 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1026: iload_1
/*     */     //   1027: aload #8
/*     */     //   1029: bipush #112
/*     */     //   1031: iload #11
/*     */     //   1033: iand
/*     */     //   1034: invokevirtual backgroundFor-6xSfq1s : (JZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1037: astore #15
/*     */     //   1039: aload #14
/*     */     //   1041: aload #12
/*     */     //   1043: invokestatic SegmentedControlButton$lambda$2 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1046: iload_1
/*     */     //   1047: aload #8
/*     */     //   1049: bipush #112
/*     */     //   1051: iload #11
/*     */     //   1053: iand
/*     */     //   1054: invokevirtual borderFor-6xSfq1s : (JZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1057: astore #16
/*     */     //   1059: aload #6
/*     */     //   1061: aload #8
/*     */     //   1063: ldc -1289777137
/*     */     //   1065: invokeinterface startReplaceGroup : (I)V
/*     */     //   1070: aload #8
/*     */     //   1072: astore #19
/*     */     //   1074: iconst_0
/*     */     //   1075: istore #20
/*     */     //   1077: nop
/*     */     //   1078: iconst_0
/*     */     //   1079: istore #21
/*     */     //   1081: aload #19
/*     */     //   1083: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1088: astore #22
/*     */     //   1090: iconst_0
/*     */     //   1091: istore #23
/*     */     //   1093: aload #22
/*     */     //   1095: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1098: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1101: if_acmpne -> 1133
/*     */     //   1104: astore #71
/*     */     //   1106: iconst_0
/*     */     //   1107: istore #24
/*     */     //   1109: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   1114: aload #71
/*     */     //   1116: swap
/*     */     //   1117: astore #24
/*     */     //   1119: aload #19
/*     */     //   1121: aload #24
/*     */     //   1123: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1128: aload #24
/*     */     //   1130: goto -> 1135
/*     */     //   1133: aload #22
/*     */     //   1135: nop
/*     */     //   1136: nop
/*     */     //   1137: nop
/*     */     //   1138: checkcast kotlin/jvm/functions/Function1
/*     */     //   1141: astore #18
/*     */     //   1143: aload #8
/*     */     //   1145: invokeinterface endReplaceGroup : ()V
/*     */     //   1150: aload #18
/*     */     //   1152: invokestatic focusProperties : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   1155: astore #17
/*     */     //   1157: aload #12
/*     */     //   1159: invokestatic SegmentedControlButton$lambda$2 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1162: invokestatic isSelected-impl : (J)Z
/*     */     //   1165: istore #18
/*     */     //   1167: getstatic androidx/compose/ui/semantics/Role.Companion : Landroidx/compose/ui/semantics/Role$Companion;
/*     */     //   1170: invokevirtual getButton-o7Vup1c : ()I
/*     */     //   1173: istore #19
/*     */     //   1175: aload_3
/*     */     //   1176: invokevirtual getOnSelect : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1179: astore #20
/*     */     //   1181: aload #17
/*     */     //   1183: iload #18
/*     */     //   1185: aload #7
/*     */     //   1187: aconst_null
/*     */     //   1188: iload_2
/*     */     //   1189: iload #19
/*     */     //   1191: invokestatic box-impl : (I)Landroidx/compose/ui/semantics/Role;
/*     */     //   1194: aload #20
/*     */     //   1196: invokestatic selectable-O2vRcR0 : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;
/*     */     //   1199: aload #15
/*     */     //   1201: invokestatic SegmentedControlButton$lambda$6 : (Landroidx/compose/runtime/State;)Landroidx/compose/ui/graphics/Brush;
/*     */     //   1204: aload #13
/*     */     //   1206: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   1209: fconst_0
/*     */     //   1210: iconst_4
/*     */     //   1211: aconst_null
/*     */     //   1212: invokestatic background$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1215: getstatic org/jetbrains/jewel/foundation/Stroke$Alignment.Center : Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*     */     //   1218: aload #4
/*     */     //   1220: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlButtonMetrics;
/*     */     //   1223: invokevirtual getBorderWidth-D9Ej5fM : ()F
/*     */     //   1226: aload #16
/*     */     //   1228: invokestatic SegmentedControlButton$lambda$7 : (Landroidx/compose/runtime/State;)Landroidx/compose/ui/graphics/Brush;
/*     */     //   1231: aload #13
/*     */     //   1233: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   1236: fconst_0
/*     */     //   1237: bipush #16
/*     */     //   1239: aconst_null
/*     */     //   1240: invokestatic border-AkepmR4$default : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1243: astore #17
/*     */     //   1245: iconst_1
/*     */     //   1246: istore #19
/*     */     //   1248: sipush #384
/*     */     //   1251: istore #20
/*     */     //   1253: nop
/*     */     //   1254: iconst_0
/*     */     //   1255: istore #21
/*     */     //   1257: aload #8
/*     */     //   1259: ldc_w 733328855
/*     */     //   1262: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   1265: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1268: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1271: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   1274: astore #18
/*     */     //   1276: aload #18
/*     */     //   1278: iload #19
/*     */     //   1280: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1283: astore #22
/*     */     //   1285: bipush #112
/*     */     //   1287: iload #20
/*     */     //   1289: iconst_3
/*     */     //   1290: ishl
/*     */     //   1291: iand
/*     */     //   1292: istore #23
/*     */     //   1294: nop
/*     */     //   1295: iconst_0
/*     */     //   1296: istore #24
/*     */     //   1298: aload #8
/*     */     //   1300: ldc_w -1323940314
/*     */     //   1303: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1306: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1309: aload #8
/*     */     //   1311: iconst_0
/*     */     //   1312: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1315: istore #25
/*     */     //   1317: aload #8
/*     */     //   1319: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1324: astore #26
/*     */     //   1326: aload #8
/*     */     //   1328: aload #17
/*     */     //   1330: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1333: astore #27
/*     */     //   1335: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1338: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1341: astore #28
/*     */     //   1343: bipush #6
/*     */     //   1345: sipush #896
/*     */     //   1348: iload #23
/*     */     //   1350: bipush #6
/*     */     //   1352: ishl
/*     */     //   1353: iand
/*     */     //   1354: ior
/*     */     //   1355: istore #29
/*     */     //   1357: nop
/*     */     //   1358: iconst_0
/*     */     //   1359: istore #30
/*     */     //   1361: aload #8
/*     */     //   1363: ldc_w -692256719
/*     */     //   1366: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1369: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1372: aload #8
/*     */     //   1374: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1379: instanceof androidx/compose/runtime/Applier
/*     */     //   1382: ifne -> 1388
/*     */     //   1385: invokestatic invalidApplier : ()V
/*     */     //   1388: aload #8
/*     */     //   1390: invokeinterface startReusableNode : ()V
/*     */     //   1395: aload #8
/*     */     //   1397: invokeinterface getInserting : ()Z
/*     */     //   1402: ifeq -> 1417
/*     */     //   1405: aload #8
/*     */     //   1407: aload #28
/*     */     //   1409: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1414: goto -> 1424
/*     */     //   1417: aload #8
/*     */     //   1419: invokeinterface useNode : ()V
/*     */     //   1424: aload #8
/*     */     //   1426: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1429: astore #31
/*     */     //   1431: iconst_0
/*     */     //   1432: istore #32
/*     */     //   1434: aload #31
/*     */     //   1436: aload #22
/*     */     //   1438: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1441: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1444: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1447: aload #31
/*     */     //   1449: aload #26
/*     */     //   1451: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1454: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1457: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1460: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1463: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1466: astore #33
/*     */     //   1468: iconst_0
/*     */     //   1469: istore #34
/*     */     //   1471: aload #31
/*     */     //   1473: astore #35
/*     */     //   1475: iconst_0
/*     */     //   1476: istore #36
/*     */     //   1478: aload #35
/*     */     //   1480: invokeinterface getInserting : ()Z
/*     */     //   1485: ifne -> 1506
/*     */     //   1488: aload #35
/*     */     //   1490: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1495: iload #25
/*     */     //   1497: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1500: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1503: ifne -> 1532
/*     */     //   1506: aload #35
/*     */     //   1508: iload #25
/*     */     //   1510: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1513: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1518: aload #31
/*     */     //   1520: iload #25
/*     */     //   1522: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1525: aload #33
/*     */     //   1527: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1532: nop
/*     */     //   1533: nop
/*     */     //   1534: nop
/*     */     //   1535: aload #31
/*     */     //   1537: aload #27
/*     */     //   1539: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1542: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1545: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1548: nop
/*     */     //   1549: nop
/*     */     //   1550: aload #8
/*     */     //   1552: bipush #14
/*     */     //   1554: iload #29
/*     */     //   1556: bipush #6
/*     */     //   1558: ishr
/*     */     //   1559: iand
/*     */     //   1560: istore #37
/*     */     //   1562: astore #38
/*     */     //   1564: iconst_0
/*     */     //   1565: istore #39
/*     */     //   1567: aload #38
/*     */     //   1569: ldc_w -2146769399
/*     */     //   1572: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   1575: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1578: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   1581: aload #38
/*     */     //   1583: bipush #6
/*     */     //   1585: bipush #112
/*     */     //   1587: iload #20
/*     */     //   1589: bipush #6
/*     */     //   1591: ishr
/*     */     //   1592: iand
/*     */     //   1593: ior
/*     */     //   1594: istore #40
/*     */     //   1596: astore #41
/*     */     //   1598: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   1601: astore #42
/*     */     //   1603: iconst_0
/*     */     //   1604: istore #43
/*     */     //   1606: aload #14
/*     */     //   1608: aload #12
/*     */     //   1610: invokestatic SegmentedControlButton$lambda$2 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1613: aload #41
/*     */     //   1615: iconst_0
/*     */     //   1616: invokevirtual contentFor-OIjbplg : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1619: astore #44
/*     */     //   1621: iconst_2
/*     */     //   1622: anewarray androidx/compose/runtime/ProvidedValue
/*     */     //   1625: astore #45
/*     */     //   1627: aload #45
/*     */     //   1629: iconst_0
/*     */     //   1630: invokestatic getLocalContentColor : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   1633: aload #41
/*     */     //   1635: ldc_w -153400094
/*     */     //   1638: invokeinterface startReplaceGroup : (I)V
/*     */     //   1643: aload #44
/*     */     //   1645: invokestatic SegmentedControlButton$lambda$13$lambda$10 : (Landroidx/compose/runtime/State;)J
/*     */     //   1648: lstore #46
/*     */     //   1650: iconst_0
/*     */     //   1651: istore #48
/*     */     //   1653: lload #46
/*     */     //   1655: lstore #49
/*     */     //   1657: iconst_0
/*     */     //   1658: istore #51
/*     */     //   1660: lload #49
/*     */     //   1662: ldc2_w 16
/*     */     //   1665: lcmp
/*     */     //   1666: ifeq -> 1673
/*     */     //   1669: iconst_1
/*     */     //   1670: goto -> 1674
/*     */     //   1673: iconst_0
/*     */     //   1674: ifeq -> 1682
/*     */     //   1677: lload #46
/*     */     //   1679: goto -> 1751
/*     */     //   1682: astore #52
/*     */     //   1684: istore #53
/*     */     //   1686: astore #54
/*     */     //   1688: iconst_0
/*     */     //   1689: istore #55
/*     */     //   1691: invokestatic getLocalContentColor : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   1694: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   1697: astore #56
/*     */     //   1699: iconst_0
/*     */     //   1700: istore #57
/*     */     //   1702: iconst_0
/*     */     //   1703: istore #58
/*     */     //   1705: aload #41
/*     */     //   1707: ldc_w 2023513938
/*     */     //   1710: ldc_w 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   1713: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1716: aload #41
/*     */     //   1718: aload #56
/*     */     //   1720: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   1725: astore #59
/*     */     //   1727: aload #41
/*     */     //   1729: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1732: aload #59
/*     */     //   1734: checkcast androidx/compose/ui/graphics/Color
/*     */     //   1737: invokevirtual unbox-impl : ()J
/*     */     //   1740: lstore #60
/*     */     //   1742: aload #54
/*     */     //   1744: iload #53
/*     */     //   1746: aload #52
/*     */     //   1748: lload #60
/*     */     //   1750: nop
/*     */     //   1751: lstore #62
/*     */     //   1753: aload #41
/*     */     //   1755: invokeinterface endReplaceGroup : ()V
/*     */     //   1760: lload #62
/*     */     //   1762: invokestatic box-impl : (J)Landroidx/compose/ui/graphics/Color;
/*     */     //   1765: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   1768: aastore
/*     */     //   1769: aload #45
/*     */     //   1771: iconst_1
/*     */     //   1772: invokestatic getLocalTextStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   1775: aload #5
/*     */     //   1777: aload #44
/*     */     //   1779: invokestatic SegmentedControlButton$lambda$13$lambda$10 : (Landroidx/compose/runtime/State;)J
/*     */     //   1782: lstore #62
/*     */     //   1784: iconst_0
/*     */     //   1785: istore #64
/*     */     //   1787: lload #62
/*     */     //   1789: lstore #65
/*     */     //   1791: iconst_0
/*     */     //   1792: istore #67
/*     */     //   1794: lload #65
/*     */     //   1796: ldc2_w 16
/*     */     //   1799: lcmp
/*     */     //   1800: ifeq -> 1807
/*     */     //   1803: iconst_1
/*     */     //   1804: goto -> 1808
/*     */     //   1807: iconst_0
/*     */     //   1808: ifeq -> 1816
/*     */     //   1811: lload #62
/*     */     //   1813: goto -> 1845
/*     */     //   1816: astore #60
/*     */     //   1818: astore #52
/*     */     //   1820: istore #53
/*     */     //   1822: astore #54
/*     */     //   1824: iconst_0
/*     */     //   1825: istore #68
/*     */     //   1827: aload #5
/*     */     //   1829: invokevirtual getColor-0d7_KjU : ()J
/*     */     //   1832: lstore #69
/*     */     //   1834: aload #54
/*     */     //   1836: iload #53
/*     */     //   1838: aload #52
/*     */     //   1840: aload #60
/*     */     //   1842: lload #69
/*     */     //   1844: nop
/*     */     //   1845: lconst_0
/*     */     //   1846: aconst_null
/*     */     //   1847: aconst_null
/*     */     //   1848: aconst_null
/*     */     //   1849: aconst_null
/*     */     //   1850: aconst_null
/*     */     //   1851: lconst_0
/*     */     //   1852: aconst_null
/*     */     //   1853: aconst_null
/*     */     //   1854: aconst_null
/*     */     //   1855: lconst_0
/*     */     //   1856: aconst_null
/*     */     //   1857: aconst_null
/*     */     //   1858: aconst_null
/*     */     //   1859: iconst_0
/*     */     //   1860: iconst_0
/*     */     //   1861: lconst_0
/*     */     //   1862: aconst_null
/*     */     //   1863: aconst_null
/*     */     //   1864: aconst_null
/*     */     //   1865: iconst_0
/*     */     //   1866: iconst_0
/*     */     //   1867: aconst_null
/*     */     //   1868: ldc_w 16777214
/*     */     //   1871: aconst_null
/*     */     //   1872: invokestatic copy-p1EtxEg$default : (Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILjava/lang/Object;)Landroidx/compose/ui/text/TextStyle;
/*     */     //   1875: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   1878: aastore
/*     */     //   1879: aload #45
/*     */     //   1881: ldc_w 433473535
/*     */     //   1884: iconst_1
/*     */     //   1885: new org/jetbrains/jewel/ui/component/SegmentedControlButtonKt$SegmentedControlButton$5$3
/*     */     //   1888: dup
/*     */     //   1889: aload #4
/*     */     //   1891: aload_3
/*     */     //   1892: aload #12
/*     */     //   1894: invokespecial <init> : (Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlButtonStyle;Lorg/jetbrains/jewel/ui/component/SegmentedControlButtonData;Landroidx/compose/runtime/MutableState;)V
/*     */     //   1897: aload #41
/*     */     //   1899: bipush #54
/*     */     //   1901: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1904: checkcast kotlin/jvm/functions/Function2
/*     */     //   1907: aload #41
/*     */     //   1909: bipush #48
/*     */     //   1911: getstatic androidx/compose/runtime/ProvidedValue.$stable : I
/*     */     //   1914: ior
/*     */     //   1915: invokestatic CompositionLocalProvider : ([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1918: nop
/*     */     //   1919: aload #38
/*     */     //   1921: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1924: aload #8
/*     */     //   1926: invokeinterface endNode : ()V
/*     */     //   1931: aload #8
/*     */     //   1933: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1936: nop
/*     */     //   1937: aload #8
/*     */     //   1939: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1942: nop
/*     */     //   1943: aload #8
/*     */     //   1945: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1948: nop
/*     */     //   1949: invokestatic isTraceInProgress : ()Z
/*     */     //   1952: ifeq -> 1968
/*     */     //   1955: invokestatic traceEventEnd : ()V
/*     */     //   1958: goto -> 1968
/*     */     //   1961: aload #8
/*     */     //   1963: invokeinterface skipToGroupEnd : ()V
/*     */     //   1968: aload #8
/*     */     //   1970: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1975: dup
/*     */     //   1976: ifnull -> 2008
/*     */     //   1979: iload_0
/*     */     //   1980: iload_1
/*     */     //   1981: iload_2
/*     */     //   1982: aload_3
/*     */     //   1983: aload #4
/*     */     //   1985: aload #5
/*     */     //   1987: aload #6
/*     */     //   1989: aload #7
/*     */     //   1991: iload #9
/*     */     //   1993: iload #10
/*     */     //   1995: <illegal opcode> invoke : (ZZZLorg/jetbrains/jewel/ui/component/SegmentedControlButtonData;Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlButtonStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;II)Lkotlin/jvm/functions/Function2;
/*     */     //   2000: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   2005: goto -> 2009
/*     */     //   2008: pop
/*     */     //   2009: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #54	-> 20
/*     */     //   #52	-> 467
/*     */     //   #53	-> 484
/*     */     //   #172	-> 503
/*     */     //   #173	-> 515
/*     */     //   #174	-> 526
/*     */     //   #53	-> 529
/*     */     //   #174	-> 532
/*     */     //   #175	-> 534
/*     */     //   #176	-> 543
/*     */     //   #177	-> 548
/*     */     //   #173	-> 550
/*     */     //   #172	-> 551
/*     */     //   #172	-> 552
/*     */     //   #53	-> 553
/*     */     //   #54	-> 582
/*     */     //   #55	-> 601
/*     */     //   #178	-> 605
/*     */     //   #179	-> 617
/*     */     //   #180	-> 628
/*     */     //   #57	-> 631
/*     */     //   #58	-> 636
/*     */     //   #57	-> 642
/*     */     //   #58	-> 644
/*     */     //   #60	-> 646
/*     */     //   #57	-> 647
/*     */     //   #59	-> 649
/*     */     //   #57	-> 650
/*     */     //   #56	-> 659
/*     */     //   #62	-> 665
/*     */     //   #180	-> 666
/*     */     //   #181	-> 668
/*     */     //   #182	-> 677
/*     */     //   #183	-> 682
/*     */     //   #179	-> 684
/*     */     //   #178	-> 685
/*     */     //   #178	-> 686
/*     */     //   #55	-> 687
/*     */     //   #64	-> 703
/*     */     //   #184	-> 769
/*     */     //   #185	-> 781
/*     */     //   #186	-> 797
/*     */     //   #65	-> 800
/*     */     //   #66	-> 802
/*     */     //   #65	-> 829
/*     */     //   #67	-> 832
/*     */     //   #186	-> 836
/*     */     //   #187	-> 838
/*     */     //   #188	-> 847
/*     */     //   #189	-> 852
/*     */     //   #185	-> 854
/*     */     //   #184	-> 855
/*     */     //   #184	-> 856
/*     */     //   #69	-> 865
/*     */     //   #190	-> 900
/*     */     //   #191	-> 912
/*     */     //   #192	-> 928
/*     */     //   #69	-> 933
/*     */     //   #192	-> 951
/*     */     //   #193	-> 953
/*     */     //   #194	-> 962
/*     */     //   #195	-> 967
/*     */     //   #191	-> 969
/*     */     //   #190	-> 970
/*     */     //   #190	-> 971
/*     */     //   #69	-> 972
/*     */     //   #82	-> 999
/*     */     //   #83	-> 1012
/*     */     //   #84	-> 1019
/*     */     //   #85	-> 1039
/*     */     //   #89	-> 1059
/*     */     //   #90	-> 1077
/*     */     //   #196	-> 1081
/*     */     //   #197	-> 1093
/*     */     //   #198	-> 1104
/*     */     //   #198	-> 1117
/*     */     //   #199	-> 1119
/*     */     //   #200	-> 1128
/*     */     //   #201	-> 1133
/*     */     //   #197	-> 1135
/*     */     //   #196	-> 1136
/*     */     //   #196	-> 1137
/*     */     //   #90	-> 1138
/*     */     //   #92	-> 1157
/*     */     //   #96	-> 1167
/*     */     //   #97	-> 1175
/*     */     //   #90	-> 1181
/*     */     //   #92	-> 1183
/*     */     //   #93	-> 1185
/*     */     //   #95	-> 1187
/*     */     //   #94	-> 1188
/*     */     //   #96	-> 1189
/*     */     //   #97	-> 1194
/*     */     //   #91	-> 1196
/*     */     //   #99	-> 1199
/*     */     //   #100	-> 1215
/*     */     //   #101	-> 1245
/*     */     //   #87	-> 1253
/*     */     //   #202	-> 1265
/*     */     //   #203	-> 1268
/*     */     //   #207	-> 1276
/*     */     //   #208	-> 1294
/*     */     //   #209	-> 1306
/*     */     //   #210	-> 1312
/*     */     //   #211	-> 1319
/*     */     //   #212	-> 1328
/*     */     //   #214	-> 1335
/*     */     //   #213	-> 1357
/*     */     //   #215	-> 1369
/*     */     //   #216	-> 1372
/*     */     //   #217	-> 1390
/*     */     //   #218	-> 1395
/*     */     //   #219	-> 1407
/*     */     //   #221	-> 1419
/*     */     //   #223	-> 1424
/*     */     //   #224	-> 1434
/*     */     //   #225	-> 1447
/*     */     //   #227	-> 1460
/*     */     //   #228	-> 1471
/*     */     //   #229	-> 1478
/*     */     //   #230	-> 1506
/*     */     //   #231	-> 1518
/*     */     //   #233	-> 1532
/*     */     //   #228	-> 1533
/*     */     //   #233	-> 1534
/*     */     //   #234	-> 1535
/*     */     //   #235	-> 1548
/*     */     //   #223	-> 1549
/*     */     //   #236	-> 1550
/*     */     //   #237	-> 1575
/*     */     //   #103	-> 1606
/*     */     //   #106	-> 1621
/*     */     //   #238	-> 1653
/*     */     //   #239	-> 1660
/*     */     //   #238	-> 1674
/*     */     //   #106	-> 1691
/*     */     //   #240	-> 1713
/*     */     //   #106	-> 1734
/*     */     //   #238	-> 1750
/*     */     //   #106	-> 1751
/*     */     //   #107	-> 1772
/*     */     //   #241	-> 1787
/*     */     //   #242	-> 1794
/*     */     //   #241	-> 1808
/*     */     //   #107	-> 1827
/*     */     //   #241	-> 1844
/*     */     //   #107	-> 1845
/*     */     //   #106	-> 1879
/*     */     //   #108	-> 1881
/*     */     //   #105	-> 1915
/*     */     //   #118	-> 1918
/*     */     //   #237	-> 1919
/*     */     //   #236	-> 1924
/*     */     //   #243	-> 1926
/*     */     //   #215	-> 1933
/*     */     //   #244	-> 1936
/*     */     //   #209	-> 1939
/*     */     //   #245	-> 1942
/*     */     //   #202	-> 1945
/*     */     //   #246	-> 1948
/*     */     //   #119	-> 1961
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   529	3	18	$i$a$-cache-SegmentedControlButtonKt$SegmentedControlButton$1	I
/*     */     //   534	11	18	value$iv	Ljava/lang/Object;
/*     */     //   515	36	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   512	39	16	it$iv	Ljava/lang/Object;
/*     */     //   503	50	15	$i$f$cache	I
/*     */     //   500	53	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   500	53	14	invalid$iv	Z
/*     */     //   631	35	19	$i$a$-cache-SegmentedControlButtonKt$SegmentedControlButton$buttonState$2	I
/*     */     //   668	11	22	value$iv	Ljava/lang/Object;
/*     */     //   617	68	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   614	71	17	it$iv	Ljava/lang/Object;
/*     */     //   605	82	16	$i$f$cache	I
/*     */     //   602	85	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   602	85	15	invalid$iv	Z
/*     */     //   800	33	19	$i$a$-cache-SegmentedControlButtonKt$SegmentedControlButton$2	I
/*     */     //   838	11	23	value$iv	Ljava/lang/Object;
/*     */     //   781	74	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   778	77	17	it$iv	Ljava/lang/Object;
/*     */     //   769	88	16	$i$f$cache	I
/*     */     //   766	91	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   766	91	15	invalid$iv	Z
/*     */     //   933	15	19	$i$a$-cache-SegmentedControlButtonKt$SegmentedControlButton$3	I
/*     */     //   953	11	20	value$iv	Ljava/lang/Object;
/*     */     //   912	58	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   909	61	17	it$iv	Ljava/lang/Object;
/*     */     //   900	72	16	$i$f$cache	I
/*     */     //   897	75	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   897	75	15	invalid$iv	Z
/*     */     //   1109	5	24	$i$a$-cache-SegmentedControlButtonKt$SegmentedControlButton$4	I
/*     */     //   1119	11	24	value$iv	Ljava/lang/Object;
/*     */     //   1093	43	23	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1090	46	22	it$iv	Ljava/lang/Object;
/*     */     //   1081	57	21	$i$f$cache	I
/*     */     //   1078	60	19	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1078	60	20	invalid$iv	Z
/*     */     //   1705	29	58	$i$f$getCurrent	I
/*     */     //   1702	32	56	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   1702	32	57	$changed$iv	I
/*     */     //   1691	49	55	$i$a$-takeOrElse-DxMtmZc-SegmentedControlButtonKt$SegmentedControlButton$5$1	I
/*     */     //   1660	14	51	$i$f$isSpecified-8_81llA	I
/*     */     //   1657	17	49	$this$isSpecified$iv$iv	J
/*     */     //   1653	98	48	$i$f$takeOrElse-DxMtmZc	I
/*     */     //   1650	101	46	$this$takeOrElse_u2dDxMtmZc$iv	J
/*     */     //   1827	5	68	$i$a$-takeOrElse-DxMtmZc-SegmentedControlButtonKt$SegmentedControlButton$5$2	I
/*     */     //   1794	14	67	$i$f$isSpecified-8_81llA	I
/*     */     //   1791	17	65	$this$isSpecified$iv$iv	J
/*     */     //   1787	58	64	$i$f$takeOrElse-DxMtmZc	I
/*     */     //   1784	61	62	$this$takeOrElse_u2dDxMtmZc$iv	J
/*     */     //   1606	313	43	$i$a$-Box-SegmentedControlButtonKt$SegmentedControlButton$5	I
/*     */     //   1621	298	44	contentColor$delegate	Landroidx/compose/runtime/State;
/*     */     //   1603	316	42	$this$SegmentedControlButton_u24lambda_u2413	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   1603	316	41	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1603	316	40	$changed	I
/*     */     //   1567	357	39	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   1564	360	38	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1564	360	37	$changed$iv	I
/*     */     //   1478	55	36	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1475	58	35	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1471	64	34	$i$f$set-impl	I
/*     */     //   1468	67	33	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1434	115	32	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1431	118	31	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1361	576	30	$i$f$ReusableComposeNode	I
/*     */     //   1358	579	28	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1358	579	29	$changed$iv$iv$iv	I
/*     */     //   1298	645	24	$i$f$Layout	I
/*     */     //   1317	626	25	compositeKeyHash$iv$iv	I
/*     */     //   1326	617	26	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1335	608	27	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1295	648	23	$changed$iv$iv	I
/*     */     //   1257	692	21	$i$f$Box	I
/*     */     //   1285	664	22	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1254	695	17	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1276	673	18	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   1254	695	19	propagateMinConstraints$iv	Z
/*     */     //   1254	695	20	$changed$iv	I
/*     */     //   703	1255	12	buttonState$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   1012	946	13	shape	Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   1019	939	14	colors	Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlButtonColors;
/*     */     //   1039	919	15	backgroundColor$delegate	Landroidx/compose/runtime/State;
/*     */     //   1059	899	16	borderColor$delegate	Landroidx/compose/runtime/State;
/*     */     //   35	1975	11	$dirty	I
/*     */     //   0	2010	0	isActive	Z
/*     */     //   0	2010	1	isFocused	Z
/*     */     //   0	2010	2	enabled	Z
/*     */     //   0	2010	3	segmentedControlButtonData	Lorg/jetbrains/jewel/ui/component/SegmentedControlButtonData;
/*     */     //   0	2010	4	style	Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlButtonStyle;
/*     */     //   0	2010	5	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	2010	6	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	2010	7	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	2010	8	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	2010	9	$changed	I
/*     */   }
/*     */   
/*  55 */   private static final long SegmentedControlButton$lambda$2(MutableState $buttonState$delegate) { State state = (State)$buttonState$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 247 */       (SegmentedControlButtonState)state.getValue()).unbox-impl(); } private static final void SegmentedControlButton$lambda$3(MutableState $buttonState$delegate, long <set-?>) { MutableState mutableState = $buttonState$delegate; Object object1 = null, object2 = null; Object value$iv = SegmentedControlButtonState.box-impl(<set-?>); int $i$f$setValue = 0;
/* 248 */     mutableState.setValue(value$iv); } private static final Brush SegmentedControlButton$lambda$6(State $backgroundColor$delegate) { State state = $backgroundColor$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 250 */     return (Brush)state.getValue(); } @DebugMetadata(f = "SegmentedControlButton.kt", l = {70}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.SegmentedControlButtonKt$SegmentedControlButton$3$1") @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class SegmentedControlButtonKt$SegmentedControlButton$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/* 251 */     int label; SegmentedControlButtonKt$SegmentedControlButton$3$1(MutableInteractionSource $interactionSource, MutableState<SegmentedControlButtonState> $buttonState$delegate, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (this.$interactionSource.getInteractions().collect(new FlowCollector(this.$buttonState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { SegmentedControlButtonKt.SegmentedControlButton$lambda$3(this.$buttonState$delegate, SegmentedControlButtonState.copy-Um8v6X4$default(SegmentedControlButtonKt.SegmentedControlButton$lambda$2(this.$buttonState$delegate), false, false, true, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { SegmentedControlButtonKt.SegmentedControlButton$lambda$3(this.$buttonState$delegate, SegmentedControlButtonState.copy-Um8v6X4$default(SegmentedControlButtonKt.SegmentedControlButton$lambda$2(this.$buttonState$delegate), false, false, false, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { SegmentedControlButtonKt.SegmentedControlButton$lambda$3(this.$buttonState$delegate, SegmentedControlButtonState.copy-Um8v6X4$default(SegmentedControlButtonKt.SegmentedControlButton$lambda$2(this.$buttonState$delegate), false, false, false, true, false, 23, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { SegmentedControlButtonKt.SegmentedControlButton$lambda$3(this.$buttonState$delegate, SegmentedControlButtonState.copy-Um8v6X4$default(SegmentedControlButtonKt.SegmentedControlButton$lambda$2(this.$buttonState$delegate), false, false, false, false, false, 23, null)); }  return Unit.INSTANCE; } }(Continuation)this) == object) return object;  this.$interactionSource.getInteractions().collect(new FlowCollector(this.$buttonState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { SegmentedControlButtonKt.SegmentedControlButton$lambda$3(this.$buttonState$delegate, SegmentedControlButtonState.copy-Um8v6X4$default(SegmentedControlButtonKt.SegmentedControlButton$lambda$2(this.$buttonState$delegate), false, false, true, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { SegmentedControlButtonKt.SegmentedControlButton$lambda$3(this.$buttonState$delegate, SegmentedControlButtonState.copy-Um8v6X4$default(SegmentedControlButtonKt.SegmentedControlButton$lambda$2(this.$buttonState$delegate), false, false, false, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { SegmentedControlButtonKt.SegmentedControlButton$lambda$3(this.$buttonState$delegate, SegmentedControlButtonState.copy-Um8v6X4$default(SegmentedControlButtonKt.SegmentedControlButton$lambda$2(this.$buttonState$delegate), false, false, false, true, false, 23, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { SegmentedControlButtonKt.SegmentedControlButton$lambda$3(this.$buttonState$delegate, SegmentedControlButtonState.copy-Um8v6X4$default(SegmentedControlButtonKt.SegmentedControlButton$lambda$2(this.$buttonState$delegate), false, false, false, false, false, 23, null)); }  return Unit.INSTANCE; } }(Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super SegmentedControlButtonKt$SegmentedControlButton$3$1> $completion) { return (Continuation<Unit>)new SegmentedControlButtonKt$SegmentedControlButton$3$1(this.$interactionSource, this.$buttonState$delegate, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((SegmentedControlButtonKt$SegmentedControlButton$3$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } private static final Brush SegmentedControlButton$lambda$7(State $borderColor$delegate) { State state = $borderColor$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (Brush)state.getValue(); } private static final Unit SegmentedControlButton$lambda$9$lambda$8(FocusProperties $this$focusProperties) { Intrinsics.checkNotNullParameter($this$focusProperties, "$this$focusProperties"); $this$focusProperties.setCanFocus(false); return Unit.INSTANCE; }
/* 252 */   private static final long SegmentedControlButton$lambda$13$lambda$10(State $contentColor$delegate) { State state = $contentColor$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Color)state.getValue()).unbox-impl(); }
/*     */ 
/*     */   
/*     */   private static final Unit SegmentedControlButton$lambda$14(boolean $isActive, boolean $isFocused, boolean $enabled, SegmentedControlButtonData $segmentedControlButtonData, SegmentedControlButtonStyle $style, TextStyle $textStyle, Modifier $modifier, MutableInteractionSource $interactionSource, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     SegmentedControlButton($isActive, $isFocused, $enabled, $segmentedControlButtonData, $style, $textStyle, $modifier, $interactionSource, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nSegmentedControlButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedControlButton.kt\norg/jetbrains/jewel/ui/component/SegmentedControlButtonKt$SegmentedControlButton$5$3\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,171:1\n99#2,3:172\n102#2:203\n106#2:207\n79#3,6:175\n86#3,4:190\n90#3,2:200\n94#3:206\n368#4,9:181\n377#4:202\n378#4,2:204\n4034#5,6:194\n*S KotlinDebug\n*F\n+ 1 SegmentedControlButton.kt\norg/jetbrains/jewel/ui/component/SegmentedControlButtonKt$SegmentedControlButton$5$3\n*L\n109#1:172,3\n109#1:203\n109#1:207\n109#1:175,6\n109#1:190,4\n109#1:200,2\n109#1:206\n109#1:181,9\n109#1:202\n109#1:204,2\n109#1:194,6\n*E\n"})
/*     */   static final class SegmentedControlButtonKt$SegmentedControlButton$5$3 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*     */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(433473535, $changed, -1, "org.jetbrains.jewel.ui.component.SegmentedControlButton.<anonymous>.<anonymous> (SegmentedControlButton.kt:108)"); 
/*     */         Modifier modifier1 = PaddingKt.padding(SizeKt.defaultMinSize-VpY3zN4((Modifier)Modifier.Companion, DpSize.getWidth-D9Ej5fM(this.$style.getMetrics().getMinSize-MYxV2XQ()), DpSize.getHeight-D9Ej5fM(this.$style.getMetrics().getMinSize-MYxV2XQ())), this.$style.getMetrics().getSegmentedButtonPadding());
/*     */         Arrangement.Horizontal horizontal = (Arrangement.Horizontal)Arrangement.INSTANCE.getCenter();
/*     */         Alignment.Vertical vertical = Alignment.Companion.getCenterVertically();
/*     */         SegmentedControlButtonData segmentedControlButtonData = this.$segmentedControlButtonData;
/*     */         MutableState<SegmentedControlButtonState> mutableState = this.$buttonState$delegate;
/*     */         int $changed$iv = 432, $i$f$Row = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
/*     */         MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontal, vertical, $composer, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3);
/*     */         int $changed$iv$iv = 0x70 & $changed$iv << 3;
/*     */         int $i$f$Layout = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/*     */         int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/*     */         CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/*     */         Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*     */         Function0 function0 = ComposeUiNode.Companion.getConstructor();
/*     */         int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6;
/*     */         int $i$f$ReusableComposeNode = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/*     */         if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier))
/*     */           ComposablesKt.invalidApplier(); 
/*     */         $composer.startReusableNode();
/*     */         if ($composer.getInserting()) {
/*     */           $composer.createNode(function0);
/*     */         } else {
/*     */           $composer.useNode();
/*     */         } 
/*     */         Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer);
/*     */         int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/*     */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/*     */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */         Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash();
/*     */         int $i$f$set-impl = 0;
/*     */         Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv;
/*     */         int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/*     */         if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/*     */           $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/*     */           $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */         } 
/*     */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */         int i = 0xE & $changed$iv$iv$iv >> 6;
/*     */         Composer $composer$iv = $composer;
/*     */         int $i$a$-Layout-RowKt$Row$1$iv = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer$iv, -407840262, "C101@5126L9:Row.kt#2w3rfo");
/*     */         int j = 0x6 | 0x70 & $changed$iv >> 6;
/*     */         Composer composer1 = $composer$iv;
/*     */         RowScope $this$invoke_u24lambda_u240 = (RowScope)RowScopeInstance.INSTANCE;
/*     */         int $i$a$-Row-SegmentedControlButtonKt$SegmentedControlButton$5$3$1 = 0;
/*     */         segmentedControlButtonData.getContent().invoke(new SegmentedControlButtonScopeContainer(), SegmentedControlButtonState.box-impl(SegmentedControlButtonKt.SegmentedControlButton$lambda$2(mutableState)), composer1, Integer.valueOf(0));
/*     */         ComposerKt.sourceInformationMarkerEnd($composer$iv);
/*     */         $composer.endNode();
/*     */         ComposerKt.sourceInformationMarkerEnd($composer);
/*     */         ComposerKt.sourceInformationMarkerEnd($composer);
/*     */         ComposerKt.sourceInformationMarkerEnd($composer);
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd(); 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */     
/*     */     SegmentedControlButtonKt$SegmentedControlButton$5$3(SegmentedControlButtonStyle $style, SegmentedControlButtonData $segmentedControlButtonData, MutableState<SegmentedControlButtonState> $buttonState$delegate) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\SegmentedControlButtonKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */