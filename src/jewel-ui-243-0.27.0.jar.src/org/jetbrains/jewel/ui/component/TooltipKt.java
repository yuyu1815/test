/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.BorderKt;
/*     */ import androidx.compose.foundation.TooltipPlacement;
/*     */ import androidx.compose.foundation.layout.BoxKt;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.layout.BoxScopeInstance;
/*     */ import androidx.compose.foundation.layout.PaddingKt;
/*     */ import androidx.compose.foundation.shape.RoundedCornerShapeKt;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.Shape;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.foundation.ExperimentalJewelApi;
/*     */ import org.jetbrains.jewel.foundation.theme.JewelThemeKt;
/*     */ import org.jetbrains.jewel.ui.component.styling.TooltipStyle;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000L\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\032[\020\000\032\0020\0012\021\020\002\032\r\022\004\022\0020\0010\003¢\006\002\b\0042\b\b\002\020\005\032\0020\0062\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\021\020\r\032\r\022\004\022\0020\0010\003¢\006\002\b\004H\007¢\006\002\020\016\032(\020\017\032\0020\0012\006\020\t\032\0020\n2\021\020\002\032\r\022\004\022\0020\0010\003¢\006\002\b\004H\003¢\006\002\020\020\0325\020\021\032\0020\0222\006\020\023\032\0020\0242\b\b\002\020\025\032\0020\0262\b\b\002\020\027\032\0020\0302\b\b\002\020\031\032\0020\032H\007¢\006\004\b\033\020\034¨\006\035"}, d2 = {"Tooltip", "", "tooltip", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "style", "Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;", "tooltipPlacement", "Landroidx/compose/foundation/TooltipPlacement;", "content", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/foundation/TooltipPlacement;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TooltipImpl", "(Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "rememberPopupPositionProviderAtFixedPosition", "Landroidx/compose/ui/window/PopupPositionProvider;", "positionPx", "Landroidx/compose/ui/geometry/Offset;", "offset", "Landroidx/compose/ui/unit/DpOffset;", "alignment", "Landroidx/compose/ui/Alignment;", "windowMargin", "Landroidx/compose/ui/unit/Dp;", "rememberPopupPositionProviderAtFixedPosition-7KAyTs4", "(JJLandroidx/compose/ui/Alignment;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/window/PopupPositionProvider;", "ui"})
/*     */ @SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\norg/jetbrains/jewel/ui/component/TooltipKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,146:1\n77#2:147\n77#2:149\n149#3:148\n1225#4,6:150\n1225#4,6:156\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\norg/jetbrains/jewel/ui/component/TooltipKt\n*L\n66#1:147\n130#1:149\n128#1:148\n134#1:150,6\n136#1:156,6\n*E\n"})
/*     */ public final class TooltipKt {
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
/*     */   public static final void Tooltip(@NotNull Function2 tooltip, @Nullable Modifier modifier, boolean enabled, @Nullable TooltipStyle style, @Nullable TooltipPlacement tooltipPlacement, @NotNull Function2 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'tooltip'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #5
/*     */     //   8: ldc 'content'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload #6
/*     */     //   15: ldc 840207043
/*     */     //   17: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   22: astore #6
/*     */     //   24: iload #7
/*     */     //   26: istore #9
/*     */     //   28: iload #8
/*     */     //   30: iconst_1
/*     */     //   31: iand
/*     */     //   32: ifeq -> 45
/*     */     //   35: iload #9
/*     */     //   37: bipush #6
/*     */     //   39: ior
/*     */     //   40: istore #9
/*     */     //   42: goto -> 74
/*     */     //   45: iload #7
/*     */     //   47: bipush #6
/*     */     //   49: iand
/*     */     //   50: ifne -> 74
/*     */     //   53: iload #9
/*     */     //   55: aload #6
/*     */     //   57: aload_0
/*     */     //   58: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   63: ifeq -> 70
/*     */     //   66: iconst_4
/*     */     //   67: goto -> 71
/*     */     //   70: iconst_2
/*     */     //   71: ior
/*     */     //   72: istore #9
/*     */     //   74: iload #8
/*     */     //   76: iconst_2
/*     */     //   77: iand
/*     */     //   78: ifeq -> 91
/*     */     //   81: iload #9
/*     */     //   83: bipush #48
/*     */     //   85: ior
/*     */     //   86: istore #9
/*     */     //   88: goto -> 122
/*     */     //   91: iload #7
/*     */     //   93: bipush #48
/*     */     //   95: iand
/*     */     //   96: ifne -> 122
/*     */     //   99: iload #9
/*     */     //   101: aload #6
/*     */     //   103: aload_1
/*     */     //   104: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   109: ifeq -> 117
/*     */     //   112: bipush #32
/*     */     //   114: goto -> 119
/*     */     //   117: bipush #16
/*     */     //   119: ior
/*     */     //   120: istore #9
/*     */     //   122: iload #8
/*     */     //   124: iconst_4
/*     */     //   125: iand
/*     */     //   126: ifeq -> 140
/*     */     //   129: iload #9
/*     */     //   131: sipush #384
/*     */     //   134: ior
/*     */     //   135: istore #9
/*     */     //   137: goto -> 174
/*     */     //   140: iload #7
/*     */     //   142: sipush #384
/*     */     //   145: iand
/*     */     //   146: ifne -> 174
/*     */     //   149: iload #9
/*     */     //   151: aload #6
/*     */     //   153: iload_2
/*     */     //   154: invokeinterface changed : (Z)Z
/*     */     //   159: ifeq -> 168
/*     */     //   162: sipush #256
/*     */     //   165: goto -> 171
/*     */     //   168: sipush #128
/*     */     //   171: ior
/*     */     //   172: istore #9
/*     */     //   174: iload #7
/*     */     //   176: sipush #3072
/*     */     //   179: iand
/*     */     //   180: ifne -> 216
/*     */     //   183: iload #9
/*     */     //   185: iload #8
/*     */     //   187: bipush #8
/*     */     //   189: iand
/*     */     //   190: ifne -> 210
/*     */     //   193: aload #6
/*     */     //   195: aload_3
/*     */     //   196: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   201: ifeq -> 210
/*     */     //   204: sipush #2048
/*     */     //   207: goto -> 213
/*     */     //   210: sipush #1024
/*     */     //   213: ior
/*     */     //   214: istore #9
/*     */     //   216: iload #7
/*     */     //   218: sipush #24576
/*     */     //   221: iand
/*     */     //   222: ifne -> 259
/*     */     //   225: iload #9
/*     */     //   227: iload #8
/*     */     //   229: bipush #16
/*     */     //   231: iand
/*     */     //   232: ifne -> 253
/*     */     //   235: aload #6
/*     */     //   237: aload #4
/*     */     //   239: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   244: ifeq -> 253
/*     */     //   247: sipush #16384
/*     */     //   250: goto -> 256
/*     */     //   253: sipush #8192
/*     */     //   256: ior
/*     */     //   257: istore #9
/*     */     //   259: iload #8
/*     */     //   261: bipush #32
/*     */     //   263: iand
/*     */     //   264: ifeq -> 277
/*     */     //   267: iload #9
/*     */     //   269: ldc 196608
/*     */     //   271: ior
/*     */     //   272: istore #9
/*     */     //   274: goto -> 309
/*     */     //   277: iload #7
/*     */     //   279: ldc 196608
/*     */     //   281: iand
/*     */     //   282: ifne -> 309
/*     */     //   285: iload #9
/*     */     //   287: aload #6
/*     */     //   289: aload #5
/*     */     //   291: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   296: ifeq -> 304
/*     */     //   299: ldc 131072
/*     */     //   301: goto -> 306
/*     */     //   304: ldc 65536
/*     */     //   306: ior
/*     */     //   307: istore #9
/*     */     //   309: iload #9
/*     */     //   311: ldc 74899
/*     */     //   313: iand
/*     */     //   314: ldc 74898
/*     */     //   316: if_icmpne -> 329
/*     */     //   319: aload #6
/*     */     //   321: invokeinterface getSkipping : ()Z
/*     */     //   326: ifne -> 573
/*     */     //   329: aload #6
/*     */     //   331: invokeinterface startDefaults : ()V
/*     */     //   336: iload #7
/*     */     //   338: iconst_1
/*     */     //   339: iand
/*     */     //   340: ifeq -> 353
/*     */     //   343: aload #6
/*     */     //   345: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   350: ifeq -> 430
/*     */     //   353: iload #8
/*     */     //   355: iconst_2
/*     */     //   356: iand
/*     */     //   357: ifeq -> 367
/*     */     //   360: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   363: checkcast androidx/compose/ui/Modifier
/*     */     //   366: astore_1
/*     */     //   367: iload #8
/*     */     //   369: iconst_4
/*     */     //   370: iand
/*     */     //   371: ifeq -> 376
/*     */     //   374: iconst_1
/*     */     //   375: istore_2
/*     */     //   376: iload #8
/*     */     //   378: bipush #8
/*     */     //   380: iand
/*     */     //   381: ifeq -> 403
/*     */     //   384: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   387: aload #6
/*     */     //   389: bipush #6
/*     */     //   391: invokestatic getTooltipStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;
/*     */     //   394: astore_3
/*     */     //   395: iload #9
/*     */     //   397: sipush #-7169
/*     */     //   400: iand
/*     */     //   401: istore #9
/*     */     //   403: iload #8
/*     */     //   405: bipush #16
/*     */     //   407: iand
/*     */     //   408: ifeq -> 468
/*     */     //   411: aload_3
/*     */     //   412: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/TooltipMetrics;
/*     */     //   415: invokevirtual getPlacement : ()Landroidx/compose/foundation/TooltipPlacement;
/*     */     //   418: astore #4
/*     */     //   420: iload #9
/*     */     //   422: ldc -57345
/*     */     //   424: iand
/*     */     //   425: istore #9
/*     */     //   427: goto -> 468
/*     */     //   430: aload #6
/*     */     //   432: invokeinterface skipToGroupEnd : ()V
/*     */     //   437: iload #8
/*     */     //   439: bipush #8
/*     */     //   441: iand
/*     */     //   442: ifeq -> 453
/*     */     //   445: iload #9
/*     */     //   447: sipush #-7169
/*     */     //   450: iand
/*     */     //   451: istore #9
/*     */     //   453: iload #8
/*     */     //   455: bipush #16
/*     */     //   457: iand
/*     */     //   458: ifeq -> 468
/*     */     //   461: iload #9
/*     */     //   463: ldc -57345
/*     */     //   465: iand
/*     */     //   466: istore #9
/*     */     //   468: aload #6
/*     */     //   470: invokeinterface endDefaults : ()V
/*     */     //   475: invokestatic isTraceInProgress : ()Z
/*     */     //   478: ifeq -> 491
/*     */     //   481: ldc 840207043
/*     */     //   483: iload #9
/*     */     //   485: iconst_m1
/*     */     //   486: ldc 'org.jetbrains.jewel.ui.component.Tooltip (Tooltip.kt:51)'
/*     */     //   488: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   491: ldc -758886690
/*     */     //   493: iconst_1
/*     */     //   494: new org/jetbrains/jewel/ui/component/TooltipKt$Tooltip$1
/*     */     //   497: dup
/*     */     //   498: iload_2
/*     */     //   499: aload_3
/*     */     //   500: aload_0
/*     */     //   501: invokespecial <init> : (ZLorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Lkotlin/jvm/functions/Function2;)V
/*     */     //   504: aload #6
/*     */     //   506: bipush #54
/*     */     //   508: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   511: checkcast kotlin/jvm/functions/Function2
/*     */     //   514: aload_1
/*     */     //   515: aload_3
/*     */     //   516: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/TooltipMetrics;
/*     */     //   519: invokevirtual getShowDelay-UwyO8pc : ()J
/*     */     //   522: invokestatic getInWholeMilliseconds-impl : (J)J
/*     */     //   525: l2i
/*     */     //   526: aload #4
/*     */     //   528: aload #5
/*     */     //   530: aload #6
/*     */     //   532: bipush #6
/*     */     //   534: bipush #112
/*     */     //   536: iload #9
/*     */     //   538: iand
/*     */     //   539: ior
/*     */     //   540: sipush #7168
/*     */     //   543: iload #9
/*     */     //   545: iconst_3
/*     */     //   546: ishr
/*     */     //   547: iand
/*     */     //   548: ior
/*     */     //   549: ldc 57344
/*     */     //   551: iload #9
/*     */     //   553: iconst_3
/*     */     //   554: ishr
/*     */     //   555: iand
/*     */     //   556: ior
/*     */     //   557: iconst_0
/*     */     //   558: invokestatic TooltipArea : (Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ILandroidx/compose/foundation/TooltipPlacement;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   561: invokestatic isTraceInProgress : ()Z
/*     */     //   564: ifeq -> 580
/*     */     //   567: invokestatic traceEventEnd : ()V
/*     */     //   570: goto -> 580
/*     */     //   573: aload #6
/*     */     //   575: invokeinterface skipToGroupEnd : ()V
/*     */     //   580: aload #6
/*     */     //   582: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   587: dup
/*     */     //   588: ifnull -> 616
/*     */     //   591: aload_0
/*     */     //   592: aload_1
/*     */     //   593: iload_2
/*     */     //   594: aload_3
/*     */     //   595: aload #4
/*     */     //   597: aload #5
/*     */     //   599: iload #7
/*     */     //   601: iload #8
/*     */     //   603: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/foundation/TooltipPlacement;Lkotlin/jvm/functions/Function2;II)Lkotlin/jvm/functions/Function2;
/*     */     //   608: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   613: goto -> 617
/*     */     //   616: pop
/*     */     //   617: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #52	-> 13
/*     */     //   #47	-> 360
/*     */     //   #48	-> 374
/*     */     //   #49	-> 384
/*     */     //   #50	-> 411
/*     */     //   #52	-> 488
/*     */     //   #54	-> 491
/*     */     //   #55	-> 514
/*     */     //   #56	-> 515
/*     */     //   #57	-> 526
/*     */     //   #58	-> 528
/*     */     //   #53	-> 558
/*     */     //   #60	-> 573
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   28	590	9	$dirty	I
/*     */     //   0	618	0	tooltip	Lkotlin/jvm/functions/Function2;
/*     */     //   0	618	1	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	618	2	enabled	Z
/*     */     //   0	618	3	style	Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;
/*     */     //   0	618	4	tooltipPlacement	Landroidx/compose/foundation/TooltipPlacement;
/*     */     //   0	618	5	content	Lkotlin/jvm/functions/Function2;
/*     */     //   0	618	6	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	618	7	$changed	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\norg/jetbrains/jewel/ui/component/TooltipKt$Tooltip$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,146:1\n71#2:147\n67#2,7:148\n74#2:183\n78#2:187\n79#3,6:155\n86#3,4:170\n90#3,2:180\n94#3:186\n368#4,9:161\n377#4:182\n378#4,2:184\n4034#5,6:174\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\norg/jetbrains/jewel/ui/component/TooltipKt$Tooltip$1\n*L\n54#1:147\n54#1:148,7\n54#1:183\n54#1:187\n54#1:155,6\n54#1:170,4\n54#1:180,2\n54#1:186\n54#1:161,9\n54#1:182\n54#1:184,2\n54#1:174,6\n*E\n"})
/*     */   static final class TooltipKt$Tooltip$1 implements Function2<Composer, Integer, Unit> { TooltipKt$Tooltip$1(boolean $enabled, TooltipStyle $style, Function2<Composer, Integer, Unit> $tooltip) {}
/*     */     
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*  54 */     public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-758886690, $changed, -1, "org.jetbrains.jewel.ui.component.Tooltip.<anonymous> (Tooltip.kt:53)");  if (this.$enabled) { $composer.startReplaceGroup(-1609173921); TooltipKt.TooltipImpl(this.$style, this.$tooltip, $composer, 0); $composer.endReplaceGroup(); } else { $composer.startReplaceGroup(-1609172886); int $changed$iv = 0, $i$f$Box = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 147 */           ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/* 148 */           Modifier modifier$iv = (Modifier)Modifier.Companion;
/* 149 */           Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
/* 150 */           boolean propagateMinConstraints$iv = false;
/*     */ 
/*     */           
/* 153 */           MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/* 154 */           int $i$f$Layout = 0;
/* 155 */           ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 156 */           int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 157 */           CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/* 158 */           Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
/*     */           
/* 160 */           Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 161 */           ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 162 */           if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 163 */             .startReusableNode();
/* 164 */           if ($composer.getInserting()) { $composer
/* 165 */               .createNode(function0); } else { $composer
/*     */               
/* 167 */               .useNode(); }
/*     */           
/* 169 */           Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 170 */           Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 171 */           Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */           
/* 173 */           Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 174 */           Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 175 */           if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 176 */             $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 177 */             $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */           } 
/*     */           
/* 180 */           Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */           
/* 182 */           int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/* 183 */           ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-TooltipKt$Tooltip$1$1 = 0; ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 184 */           $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 185 */           ComposerKt.sourceInformationMarkerEnd($composer);
/* 186 */           ComposerKt.sourceInformationMarkerEnd($composer); $composer.endReplaceGroup(); }  if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } } @Composable @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]") private static final void TooltipImpl(TooltipStyle style, Function2<? super Composer, ? super Integer, Unit> tooltip, Composer $composer, int $changed) { // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc 1133546025
/*     */     //   3: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   8: astore_2
/*     */     //   9: iload_3
/*     */     //   10: istore #4
/*     */     //   12: iload_3
/*     */     //   13: bipush #6
/*     */     //   15: iand
/*     */     //   16: ifne -> 39
/*     */     //   19: iload #4
/*     */     //   21: aload_2
/*     */     //   22: aload_0
/*     */     //   23: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   28: ifeq -> 35
/*     */     //   31: iconst_4
/*     */     //   32: goto -> 36
/*     */     //   35: iconst_2
/*     */     //   36: ior
/*     */     //   37: istore #4
/*     */     //   39: iload_3
/*     */     //   40: bipush #48
/*     */     //   42: iand
/*     */     //   43: ifne -> 68
/*     */     //   46: iload #4
/*     */     //   48: aload_2
/*     */     //   49: aload_1
/*     */     //   50: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   55: ifeq -> 63
/*     */     //   58: bipush #32
/*     */     //   60: goto -> 65
/*     */     //   63: bipush #16
/*     */     //   65: ior
/*     */     //   66: istore #4
/*     */     //   68: iload #4
/*     */     //   70: bipush #19
/*     */     //   72: iand
/*     */     //   73: bipush #18
/*     */     //   75: if_icmpne -> 87
/*     */     //   78: aload_2
/*     */     //   79: invokeinterface getSkipping : ()Z
/*     */     //   84: ifne -> 261
/*     */     //   87: invokestatic isTraceInProgress : ()Z
/*     */     //   90: ifeq -> 103
/*     */     //   93: ldc 1133546025
/*     */     //   95: iload #4
/*     */     //   97: iconst_m1
/*     */     //   98: ldc 'org.jetbrains.jewel.ui.component.TooltipImpl (Tooltip.kt:62)'
/*     */     //   100: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   103: iconst_2
/*     */     //   104: anewarray androidx/compose/runtime/ProvidedValue
/*     */     //   107: astore #5
/*     */     //   109: aload #5
/*     */     //   111: iconst_0
/*     */     //   112: invokestatic getLocalContentColor : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   115: aload_0
/*     */     //   116: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/TooltipColors;
/*     */     //   119: invokevirtual getContent-0d7_KjU : ()J
/*     */     //   122: invokestatic box-impl : (J)Landroidx/compose/ui/graphics/Color;
/*     */     //   125: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   128: aastore
/*     */     //   129: aload #5
/*     */     //   131: iconst_1
/*     */     //   132: invokestatic getLocalTextStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   135: invokestatic getLocalTextStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   138: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   141: astore #6
/*     */     //   143: iconst_0
/*     */     //   144: istore #7
/*     */     //   146: iconst_0
/*     */     //   147: istore #8
/*     */     //   149: aload_2
/*     */     //   150: ldc 2023513938
/*     */     //   152: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   154: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   157: aload_2
/*     */     //   158: aload #6
/*     */     //   160: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   165: astore #9
/*     */     //   167: aload_2
/*     */     //   168: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   171: aload #9
/*     */     //   173: checkcast androidx/compose/ui/text/TextStyle
/*     */     //   176: aload_0
/*     */     //   177: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/TooltipColors;
/*     */     //   180: invokevirtual getContent-0d7_KjU : ()J
/*     */     //   183: lconst_0
/*     */     //   184: aconst_null
/*     */     //   185: aconst_null
/*     */     //   186: aconst_null
/*     */     //   187: aconst_null
/*     */     //   188: aconst_null
/*     */     //   189: lconst_0
/*     */     //   190: aconst_null
/*     */     //   191: aconst_null
/*     */     //   192: aconst_null
/*     */     //   193: lconst_0
/*     */     //   194: aconst_null
/*     */     //   195: aconst_null
/*     */     //   196: aconst_null
/*     */     //   197: iconst_0
/*     */     //   198: iconst_0
/*     */     //   199: lconst_0
/*     */     //   200: aconst_null
/*     */     //   201: aconst_null
/*     */     //   202: aconst_null
/*     */     //   203: iconst_0
/*     */     //   204: iconst_0
/*     */     //   205: aconst_null
/*     */     //   206: ldc 16777214
/*     */     //   208: aconst_null
/*     */     //   209: invokestatic copy-p1EtxEg$default : (Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILjava/lang/Object;)Landroidx/compose/ui/text/TextStyle;
/*     */     //   212: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   215: aastore
/*     */     //   216: aload #5
/*     */     //   218: ldc 548187497
/*     */     //   220: iconst_1
/*     */     //   221: new org/jetbrains/jewel/ui/component/TooltipKt$TooltipImpl$1
/*     */     //   224: dup
/*     */     //   225: aload_0
/*     */     //   226: aload_1
/*     */     //   227: invokespecial <init> : (Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Lkotlin/jvm/functions/Function2;)V
/*     */     //   230: aload_2
/*     */     //   231: bipush #54
/*     */     //   233: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   236: checkcast kotlin/jvm/functions/Function2
/*     */     //   239: aload_2
/*     */     //   240: bipush #48
/*     */     //   242: getstatic androidx/compose/runtime/ProvidedValue.$stable : I
/*     */     //   245: ior
/*     */     //   246: invokestatic CompositionLocalProvider : ([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   249: invokestatic isTraceInProgress : ()Z
/*     */     //   252: ifeq -> 267
/*     */     //   255: invokestatic traceEventEnd : ()V
/*     */     //   258: goto -> 267
/*     */     //   261: aload_2
/*     */     //   262: invokeinterface skipToGroupEnd : ()V
/*     */     //   267: aload_2
/*     */     //   268: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   273: dup
/*     */     //   274: ifnull -> 293
/*     */     //   277: aload_0
/*     */     //   278: aload_1
/*     */     //   279: iload_3
/*     */     //   280: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Lkotlin/jvm/functions/Function2;I)Lkotlin/jvm/functions/Function2;
/*     */     //   285: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   290: goto -> 294
/*     */     //   293: pop
/*     */     //   294: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #63	-> 0
/*     */     //   #65	-> 103
/*     */     //   #66	-> 132
/*     */     //   #147	-> 154
/*     */     //   #66	-> 176
/*     */     //   #65	-> 216
/*     */     //   #67	-> 218
/*     */     //   #64	-> 246
/*     */     //   #87	-> 261
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   149	24	8	$i$f$getCurrent	I
/*     */     //   146	27	6	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   146	27	7	$changed$iv	I
/*     */     //   12	283	4	$dirty	I
/*     */     //   0	295	0	style	Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;
/*     */     //   0	295	1	tooltip	Lkotlin/jvm/functions/Function2;
/*     */     //   0	295	2	$composer	Landroidx/compose/runtime/Composer;
/* 186 */     //   0	295	3	$changed	I } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\norg/jetbrains/jewel/ui/component/TooltipKt$TooltipImpl$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,146:1\n71#2:147\n68#2,6:148\n74#2:182\n78#2:186\n79#3,6:154\n86#3,4:169\n90#3,2:179\n94#3:185\n368#4,9:160\n377#4:181\n378#4,2:183\n4034#5,6:173\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\norg/jetbrains/jewel/ui/component/TooltipKt$TooltipImpl$1\n*L\n68#1:147\n68#1:148,6\n68#1:182\n68#1:186\n68#1:154,6\n68#1:169,4\n68#1:179,2\n68#1:185\n68#1:160,9\n68#1:181\n68#1:183,2\n68#1:173,6\n*E\n"}) static final class TooltipKt$TooltipImpl$1 implements Function2<Composer, Integer, Unit> { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(548187497, $changed, -1, "org.jetbrains.jewel.ui.component.TooltipImpl.<anonymous> (Tooltip.kt:67)");  Modifier modifier1 = PaddingKt.padding(BorderKt.border-xT4_qwU(BackgroundKt.background-bw27NRU(ShadowKt.shadow-s4CzXII$default((Modifier)Modifier.Companion, this.$style.getMetrics().getShadowSize-D9Ej5fM(), (Shape)RoundedCornerShapeKt.RoundedCornerShape(this.$style.getMetrics().getCornerSize()), false, this.$style.getColors().getShadow-0d7_KjU(), Color.Companion.getTransparent-0d7_KjU(), 4, null), this.$style.getColors().getBackground-0d7_KjU(), (Shape)RoundedCornerShapeKt.RoundedCornerShape(this.$style.getMetrics().getCornerSize())), this.$style.getMetrics().getBorderWidth-D9Ej5fM(), this.$style.getColors().getBorder-0d7_KjU(), (Shape)RoundedCornerShapeKt.RoundedCornerShape(this.$style.getMetrics().getCornerSize())), this.$style.getMetrics().getContentPadding()); TooltipStyle tooltipStyle = this.$style; Function2<Composer, Integer, Unit> function2 = this.$tooltip; int $changed$iv = 0, $i$f$Box = 0; ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo"); Alignment contentAlignment$iv = Alignment.Companion.getTopStart(); boolean propagateMinConstraints$iv = false; MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3; int $i$f$Layout = 0; ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"); int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0); CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap(); Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1); Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0; ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"); if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer.startReusableNode(); if ($composer.getInserting()) { $composer.createNode(function0); } else { $composer.useNode(); }  Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0; Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy()); Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals()); Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0; Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0; if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) { $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv)); $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv); }  Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier()); int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0; ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-TooltipKt$TooltipImpl$1$1 = 0; JewelThemeKt.OverrideDarkMode(ColorExtensionsKt.isDark-8_81llA(tooltipStyle.getColors().getBackground-0d7_KjU()), (Function2)ComposableLambdaKt.rememberComposableLambda(-1805973808, true, new TooltipKt$TooltipImpl$1$1$1(function2), composer1, 54), composer1, 48); ComposerKt.sourceInformationMarkerEnd($composer$iv); $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*     */       else
/*     */       { $composer.skipToGroupEnd(); }
/*     */        }
/*     */ 
/*     */     
/*     */     TooltipKt$TooltipImpl$1(TooltipStyle $style, Function2<Composer, Integer, Unit> $tooltip) {} }
/*     */ 
/*     */   
/*     */   @ExperimentalJewelApi
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final PopupPositionProvider rememberPopupPositionProviderAtFixedPosition-7KAyTs4(long positionPx, long offset, @Nullable Alignment alignment, float windowMargin, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload #6
/*     */     //   2: ldc_w 91784263
/*     */     //   5: invokeinterface startReplaceGroup : (I)V
/*     */     //   10: iload #8
/*     */     //   12: iconst_2
/*     */     //   13: iand
/*     */     //   14: ifeq -> 24
/*     */     //   17: getstatic androidx/compose/ui/unit/DpOffset.Companion : Landroidx/compose/ui/unit/DpOffset$Companion;
/*     */     //   20: invokevirtual getZero-RKDOV3M : ()J
/*     */     //   23: lstore_2
/*     */     //   24: iload #8
/*     */     //   26: iconst_4
/*     */     //   27: iand
/*     */     //   28: ifeq -> 39
/*     */     //   31: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   34: invokevirtual getBottomEnd : ()Landroidx/compose/ui/Alignment;
/*     */     //   37: astore #4
/*     */     //   39: iload #8
/*     */     //   41: bipush #8
/*     */     //   43: iand
/*     */     //   44: ifeq -> 61
/*     */     //   47: iconst_4
/*     */     //   48: istore #9
/*     */     //   50: iconst_0
/*     */     //   51: istore #10
/*     */     //   53: iload #9
/*     */     //   55: i2f
/*     */     //   56: invokestatic constructor-impl : (F)F
/*     */     //   59: fstore #5
/*     */     //   61: invokestatic isTraceInProgress : ()Z
/*     */     //   64: ifeq -> 79
/*     */     //   67: ldc_w 91784263
/*     */     //   70: iload #7
/*     */     //   72: iconst_m1
/*     */     //   73: ldc_w 'org.jetbrains.jewel.ui.component.rememberPopupPositionProviderAtFixedPosition (Tooltip.kt:129)'
/*     */     //   76: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   79: invokestatic getLocalDensity : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   82: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   85: astore #11
/*     */     //   87: iconst_0
/*     */     //   88: istore #12
/*     */     //   90: iconst_0
/*     */     //   91: istore #13
/*     */     //   93: aload #6
/*     */     //   95: ldc 2023513938
/*     */     //   97: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   99: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   102: aload #6
/*     */     //   104: aload #11
/*     */     //   106: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   111: astore #14
/*     */     //   113: aload #6
/*     */     //   115: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   118: aload #14
/*     */     //   120: checkcast androidx/compose/ui/unit/Density
/*     */     //   123: astore #12
/*     */     //   125: iconst_0
/*     */     //   126: istore #13
/*     */     //   128: aload #12
/*     */     //   130: lload_2
/*     */     //   131: invokestatic getX-D9Ej5fM : (J)F
/*     */     //   134: invokeinterface toPx-0680j_4 : (F)F
/*     */     //   139: aload #12
/*     */     //   141: lload_2
/*     */     //   142: invokestatic getY-D9Ej5fM : (J)F
/*     */     //   145: invokeinterface toPx-0680j_4 : (F)F
/*     */     //   150: invokestatic Offset : (FF)J
/*     */     //   153: lstore #14
/*     */     //   155: aload #12
/*     */     //   157: fload #5
/*     */     //   159: invokeinterface roundToPx-0680j_4 : (F)I
/*     */     //   164: istore #16
/*     */     //   166: aload #6
/*     */     //   168: ldc_w 771066309
/*     */     //   171: invokeinterface startReplaceGroup : (I)V
/*     */     //   176: aload #6
/*     */     //   178: astore #17
/*     */     //   180: iconst_0
/*     */     //   181: istore #18
/*     */     //   183: nop
/*     */     //   184: iconst_0
/*     */     //   185: istore #19
/*     */     //   187: aload #17
/*     */     //   189: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   194: astore #20
/*     */     //   196: iconst_0
/*     */     //   197: istore #21
/*     */     //   199: aload #20
/*     */     //   201: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   204: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   207: if_acmpne -> 233
/*     */     //   210: iconst_0
/*     */     //   211: istore #22
/*     */     //   213: lload_0
/*     */     //   214: invokestatic box-impl : (J)Landroidx/compose/ui/geometry/Offset;
/*     */     //   217: astore #23
/*     */     //   219: aload #17
/*     */     //   221: aload #23
/*     */     //   223: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   228: aload #23
/*     */     //   230: goto -> 235
/*     */     //   233: aload #20
/*     */     //   235: nop
/*     */     //   236: nop
/*     */     //   237: nop
/*     */     //   238: checkcast androidx/compose/ui/geometry/Offset
/*     */     //   241: invokevirtual unbox-impl : ()J
/*     */     //   244: lstore #24
/*     */     //   246: aload #6
/*     */     //   248: invokeinterface endReplaceGroup : ()V
/*     */     //   253: lload #24
/*     */     //   255: lstore #26
/*     */     //   257: aload #6
/*     */     //   259: ldc_w 771067672
/*     */     //   262: invokeinterface startReplaceGroup : (I)V
/*     */     //   267: aload #6
/*     */     //   269: astore #17
/*     */     //   271: aload #6
/*     */     //   273: lload #14
/*     */     //   275: invokeinterface changed : (J)Z
/*     */     //   280: iload #7
/*     */     //   282: sipush #896
/*     */     //   285: iand
/*     */     //   286: sipush #384
/*     */     //   289: ixor
/*     */     //   290: sipush #256
/*     */     //   293: if_icmple -> 308
/*     */     //   296: aload #6
/*     */     //   298: aload #4
/*     */     //   300: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   305: ifne -> 320
/*     */     //   308: iload #7
/*     */     //   310: sipush #384
/*     */     //   313: iand
/*     */     //   314: sipush #256
/*     */     //   317: if_icmpne -> 324
/*     */     //   320: iconst_1
/*     */     //   321: goto -> 325
/*     */     //   324: iconst_0
/*     */     //   325: ior
/*     */     //   326: aload #6
/*     */     //   328: iload #16
/*     */     //   330: invokeinterface changed : (I)Z
/*     */     //   335: ior
/*     */     //   336: istore #18
/*     */     //   338: iconst_0
/*     */     //   339: istore #19
/*     */     //   341: aload #17
/*     */     //   343: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   348: astore #20
/*     */     //   350: iconst_0
/*     */     //   351: istore #21
/*     */     //   353: iload #18
/*     */     //   355: ifne -> 369
/*     */     //   358: aload #20
/*     */     //   360: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   363: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   366: if_acmpne -> 406
/*     */     //   369: iconst_0
/*     */     //   370: istore #22
/*     */     //   372: new androidx/compose/ui/window/PopupPositionProviderAtPosition
/*     */     //   375: dup
/*     */     //   376: lload #26
/*     */     //   378: iconst_1
/*     */     //   379: lload #14
/*     */     //   381: aload #4
/*     */     //   383: iload #16
/*     */     //   385: aconst_null
/*     */     //   386: invokespecial <init> : (JZJLandroidx/compose/ui/Alignment;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   389: nop
/*     */     //   390: astore #23
/*     */     //   392: aload #17
/*     */     //   394: aload #23
/*     */     //   396: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   401: aload #23
/*     */     //   403: goto -> 408
/*     */     //   406: aload #20
/*     */     //   408: nop
/*     */     //   409: nop
/*     */     //   410: nop
/*     */     //   411: checkcast androidx/compose/ui/window/PopupPositionProviderAtPosition
/*     */     //   414: astore #28
/*     */     //   416: aload #6
/*     */     //   418: invokeinterface endReplaceGroup : ()V
/*     */     //   423: aload #28
/*     */     //   425: nop
/*     */     //   426: nop
/*     */     //   427: astore #9
/*     */     //   429: invokestatic isTraceInProgress : ()Z
/*     */     //   432: ifeq -> 438
/*     */     //   435: invokestatic traceEventEnd : ()V
/*     */     //   438: aload #6
/*     */     //   440: invokeinterface endReplaceGroup : ()V
/*     */     //   445: aload #9
/*     */     //   447: checkcast androidx/compose/ui/window/PopupPositionProvider
/*     */     //   450: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #126	-> 17
/*     */     //   #127	-> 31
/*     */     //   #128	-> 47
/*     */     //   #148	-> 53
/*     */     //   #130	-> 76
/*     */     //   #149	-> 99
/*     */     //   #130	-> 120
/*     */     //   #131	-> 128
/*     */     //   #132	-> 155
/*     */     //   #134	-> 183
/*     */     //   #150	-> 187
/*     */     //   #151	-> 199
/*     */     //   #152	-> 210
/*     */     //   #134	-> 213
/*     */     //   #152	-> 217
/*     */     //   #153	-> 219
/*     */     //   #154	-> 228
/*     */     //   #155	-> 233
/*     */     //   #151	-> 235
/*     */     //   #150	-> 236
/*     */     //   #150	-> 237
/*     */     //   #134	-> 238
/*     */     //   #136	-> 273
/*     */     //   #156	-> 341
/*     */     //   #157	-> 353
/*     */     //   #158	-> 369
/*     */     //   #137	-> 372
/*     */     //   #138	-> 376
/*     */     //   #139	-> 378
/*     */     //   #140	-> 379
/*     */     //   #141	-> 381
/*     */     //   #142	-> 383
/*     */     //   #137	-> 386
/*     */     //   #143	-> 389
/*     */     //   #158	-> 390
/*     */     //   #159	-> 392
/*     */     //   #160	-> 401
/*     */     //   #161	-> 406
/*     */     //   #157	-> 408
/*     */     //   #156	-> 409
/*     */     //   #156	-> 410
/*     */     //   #136	-> 411
/*     */     //   #144	-> 425
/*     */     //   #130	-> 426
/*     */     //   #130	-> 427
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   53	6	10	$i$f$getDp	I
/*     */     //   50	9	9	$this$dp$iv	I
/*     */     //   93	27	13	$i$f$getCurrent	I
/*     */     //   90	30	11	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   90	30	12	$changed$iv	I
/*     */     //   213	1	22	$i$a$-cache-TooltipKt$rememberPopupPositionProviderAtFixedPosition$1$initialPosition$1	I
/*     */     //   219	11	23	value$iv	Ljava/lang/Object;
/*     */     //   199	37	21	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   196	40	20	it$iv	Ljava/lang/Object;
/*     */     //   187	51	19	$i$f$cache	I
/*     */     //   184	54	17	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   184	54	18	invalid$iv	Z
/*     */     //   372	18	22	$i$a$-cache-TooltipKt$rememberPopupPositionProviderAtFixedPosition$1$1	I
/*     */     //   392	11	23	value$iv	Ljava/lang/Object;
/*     */     //   353	56	21	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   350	59	20	it$iv	Ljava/lang/Object;
/*     */     //   341	70	19	$i$f$cache	I
/*     */     //   338	73	17	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   338	73	18	invalid$iv	Z
/*     */     //   128	298	13	$i$a$-with-TooltipKt$rememberPopupPositionProviderAtFixedPosition$1	I
/*     */     //   155	271	14	offsetPx	J
/*     */     //   166	260	16	windowMarginPx	I
/*     */     //   257	169	26	initialPosition	J
/*     */     //   125	301	12	$this$rememberPopupPositionProviderAtFixedPosition_7KAyTs4_u24lambda_u244	Landroidx/compose/ui/unit/Density;
/*     */     //   0	451	0	positionPx	J
/*     */     //   0	451	2	offset	J
/*     */     //   0	451	4	alignment	Landroidx/compose/ui/Alignment;
/*     */     //   0	451	5	windowMargin	F
/*     */     //   0	451	6	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	451	7	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit Tooltip$lambda$0(Function2<? super Composer, ? super Integer, Unit> $tooltip, Modifier $modifier, boolean $enabled, TooltipStyle $style, TooltipPlacement $tooltipPlacement, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     Tooltip($tooltip, $modifier, $enabled, $style, $tooltipPlacement, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit TooltipImpl$lambda$1(TooltipStyle $style, Function2<? super Composer, ? super Integer, Unit> $tooltip, int $$changed, Composer $composer, int $force) {
/*     */     TooltipImpl($style, $tooltip, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\TooltipKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */