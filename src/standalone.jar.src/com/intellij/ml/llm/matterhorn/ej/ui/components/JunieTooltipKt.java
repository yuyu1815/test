/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*    */ import androidx.compose.foundation.TooltipPlacement;
/*    */ import androidx.compose.foundation.shape.CornerSize;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableInferredTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.time.DurationKt;
/*    */ import kotlin.time.DurationUnit;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.foundation.theme.JewelTheme;
/*    */ import org.jetbrains.jewel.ui.component.styling.TooltipStyle;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000.\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\0323\020\000\032\0020\0012\021\020\002\032\r\022\004\022\0020\0010\003¢\006\002\b\0042\021\020\005\032\r\022\004\022\0020\0010\003¢\006\002\b\004H\007¢\006\002\020\006\032[\020\007\032\0020\0012\021\020\002\032\r\022\004\022\0020\0010\003¢\006\002\b\0042\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\r2\b\b\002\020\016\032\0020\0172\021\020\005\032\r\022\004\022\0020\0010\003¢\006\002\b\004H\007¢\006\002\020\020\032\r\020\021\032\0020\rH\007¢\006\002\020\022¨\006\023"}, d2 = {"BraveModeTooltip", "", "tooltip", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "JunieTooltip", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "style", "Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;", "tooltipPlacement", "Landroidx/compose/foundation/TooltipPlacement;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/foundation/TooltipPlacement;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "rememberJunieTooltipStyle", "(Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;", "standalone"})
/*    */ @SourceDebugExtension({"SMAP\nJunieTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieTooltip.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieTooltipKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,56:1\n1225#2,6:57\n*S KotlinDebug\n*F\n+ 1 JunieTooltip.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieTooltipKt\n*L\n41#1:57,6\n*E\n"})
/*    */ public final class JunieTooltipKt {
/*    */   @Composable
/*    */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
/*    */   public static final void BraveModeTooltip(@NotNull Function2<? super Composer, ? super Integer, Unit> tooltip, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer $composer, int $changed) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'tooltip'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: ldc 'content'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_2
/*    */     //   13: ldc -324280903
/*    */     //   15: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   20: astore_2
/*    */     //   21: iload_3
/*    */     //   22: istore #4
/*    */     //   24: iload_3
/*    */     //   25: bipush #6
/*    */     //   27: iand
/*    */     //   28: ifne -> 51
/*    */     //   31: iload #4
/*    */     //   33: aload_2
/*    */     //   34: aload_0
/*    */     //   35: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   40: ifeq -> 47
/*    */     //   43: iconst_4
/*    */     //   44: goto -> 48
/*    */     //   47: iconst_2
/*    */     //   48: ior
/*    */     //   49: istore #4
/*    */     //   51: iload_3
/*    */     //   52: bipush #48
/*    */     //   54: iand
/*    */     //   55: ifne -> 80
/*    */     //   58: iload #4
/*    */     //   60: aload_2
/*    */     //   61: aload_1
/*    */     //   62: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   67: ifeq -> 75
/*    */     //   70: bipush #32
/*    */     //   72: goto -> 77
/*    */     //   75: bipush #16
/*    */     //   77: ior
/*    */     //   78: istore #4
/*    */     //   80: iload #4
/*    */     //   82: bipush #19
/*    */     //   84: iand
/*    */     //   85: bipush #18
/*    */     //   87: if_icmpne -> 99
/*    */     //   90: aload_2
/*    */     //   91: invokeinterface getSkipping : ()Z
/*    */     //   96: ifne -> 153
/*    */     //   99: invokestatic isTraceInProgress : ()Z
/*    */     //   102: ifeq -> 115
/*    */     //   105: ldc -324280903
/*    */     //   107: iload #4
/*    */     //   109: iconst_m1
/*    */     //   110: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.BraveModeTooltip (JunieTooltip.kt:19)'
/*    */     //   112: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   115: aload_0
/*    */     //   116: aconst_null
/*    */     //   117: iconst_0
/*    */     //   118: aconst_null
/*    */     //   119: aconst_null
/*    */     //   120: aload_1
/*    */     //   121: aload_2
/*    */     //   122: bipush #14
/*    */     //   124: iload #4
/*    */     //   126: iand
/*    */     //   127: ldc 458752
/*    */     //   129: iload #4
/*    */     //   131: bipush #12
/*    */     //   133: ishl
/*    */     //   134: iand
/*    */     //   135: ior
/*    */     //   136: bipush #30
/*    */     //   138: invokestatic JunieTooltip : (Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/foundation/TooltipPlacement;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*    */     //   141: invokestatic isTraceInProgress : ()Z
/*    */     //   144: ifeq -> 159
/*    */     //   147: invokestatic traceEventEnd : ()V
/*    */     //   150: goto -> 159
/*    */     //   153: aload_2
/*    */     //   154: invokeinterface skipToGroupEnd : ()V
/*    */     //   159: aload_2
/*    */     //   160: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   165: dup
/*    */     //   166: ifnull -> 185
/*    */     //   169: aload_0
/*    */     //   170: aload_1
/*    */     //   171: iload_3
/*    */     //   172: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;I)Lkotlin/jvm/functions/Function2;
/*    */     //   177: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   182: goto -> 186
/*    */     //   185: pop
/*    */     //   186: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 12
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   24	163	4	$dirty	I
/*    */     //   0	187	0	tooltip	Lkotlin/jvm/functions/Function2;
/*    */     //   0	187	1	content	Lkotlin/jvm/functions/Function2;
/*    */     //   0	187	2	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	187	3	$changed	I
/*    */   }
/*    */   
/*    */   @Composable
/*    */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
/*    */   public static final void JunieTooltip(@NotNull Function2 tooltip, @Nullable Modifier modifier, boolean enabled, @Nullable TooltipStyle style, @Nullable TooltipPlacement tooltipPlacement, @NotNull Function2 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'tooltip'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload #5
/*    */     //   8: ldc 'content'
/*    */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   13: aload #6
/*    */     //   15: ldc -1700809146
/*    */     //   17: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   22: astore #6
/*    */     //   24: iload #7
/*    */     //   26: istore #9
/*    */     //   28: iload #8
/*    */     //   30: iconst_1
/*    */     //   31: iand
/*    */     //   32: ifeq -> 45
/*    */     //   35: iload #9
/*    */     //   37: bipush #6
/*    */     //   39: ior
/*    */     //   40: istore #9
/*    */     //   42: goto -> 74
/*    */     //   45: iload #7
/*    */     //   47: bipush #6
/*    */     //   49: iand
/*    */     //   50: ifne -> 74
/*    */     //   53: iload #9
/*    */     //   55: aload #6
/*    */     //   57: aload_0
/*    */     //   58: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   63: ifeq -> 70
/*    */     //   66: iconst_4
/*    */     //   67: goto -> 71
/*    */     //   70: iconst_2
/*    */     //   71: ior
/*    */     //   72: istore #9
/*    */     //   74: iload #8
/*    */     //   76: iconst_2
/*    */     //   77: iand
/*    */     //   78: ifeq -> 91
/*    */     //   81: iload #9
/*    */     //   83: bipush #48
/*    */     //   85: ior
/*    */     //   86: istore #9
/*    */     //   88: goto -> 122
/*    */     //   91: iload #7
/*    */     //   93: bipush #48
/*    */     //   95: iand
/*    */     //   96: ifne -> 122
/*    */     //   99: iload #9
/*    */     //   101: aload #6
/*    */     //   103: aload_1
/*    */     //   104: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   109: ifeq -> 117
/*    */     //   112: bipush #32
/*    */     //   114: goto -> 119
/*    */     //   117: bipush #16
/*    */     //   119: ior
/*    */     //   120: istore #9
/*    */     //   122: iload #8
/*    */     //   124: iconst_4
/*    */     //   125: iand
/*    */     //   126: ifeq -> 140
/*    */     //   129: iload #9
/*    */     //   131: sipush #384
/*    */     //   134: ior
/*    */     //   135: istore #9
/*    */     //   137: goto -> 174
/*    */     //   140: iload #7
/*    */     //   142: sipush #384
/*    */     //   145: iand
/*    */     //   146: ifne -> 174
/*    */     //   149: iload #9
/*    */     //   151: aload #6
/*    */     //   153: iload_2
/*    */     //   154: invokeinterface changed : (Z)Z
/*    */     //   159: ifeq -> 168
/*    */     //   162: sipush #256
/*    */     //   165: goto -> 171
/*    */     //   168: sipush #128
/*    */     //   171: ior
/*    */     //   172: istore #9
/*    */     //   174: iload #7
/*    */     //   176: sipush #3072
/*    */     //   179: iand
/*    */     //   180: ifne -> 216
/*    */     //   183: iload #9
/*    */     //   185: iload #8
/*    */     //   187: bipush #8
/*    */     //   189: iand
/*    */     //   190: ifne -> 210
/*    */     //   193: aload #6
/*    */     //   195: aload_3
/*    */     //   196: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   201: ifeq -> 210
/*    */     //   204: sipush #2048
/*    */     //   207: goto -> 213
/*    */     //   210: sipush #1024
/*    */     //   213: ior
/*    */     //   214: istore #9
/*    */     //   216: iload #7
/*    */     //   218: sipush #24576
/*    */     //   221: iand
/*    */     //   222: ifne -> 259
/*    */     //   225: iload #9
/*    */     //   227: iload #8
/*    */     //   229: bipush #16
/*    */     //   231: iand
/*    */     //   232: ifne -> 253
/*    */     //   235: aload #6
/*    */     //   237: aload #4
/*    */     //   239: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   244: ifeq -> 253
/*    */     //   247: sipush #16384
/*    */     //   250: goto -> 256
/*    */     //   253: sipush #8192
/*    */     //   256: ior
/*    */     //   257: istore #9
/*    */     //   259: iload #8
/*    */     //   261: bipush #32
/*    */     //   263: iand
/*    */     //   264: ifeq -> 277
/*    */     //   267: iload #9
/*    */     //   269: ldc 196608
/*    */     //   271: ior
/*    */     //   272: istore #9
/*    */     //   274: goto -> 309
/*    */     //   277: iload #7
/*    */     //   279: ldc 196608
/*    */     //   281: iand
/*    */     //   282: ifne -> 309
/*    */     //   285: iload #9
/*    */     //   287: aload #6
/*    */     //   289: aload #5
/*    */     //   291: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   296: ifeq -> 304
/*    */     //   299: ldc 131072
/*    */     //   301: goto -> 306
/*    */     //   304: ldc 65536
/*    */     //   306: ior
/*    */     //   307: istore #9
/*    */     //   309: iload #9
/*    */     //   311: ldc 74899
/*    */     //   313: iand
/*    */     //   314: ldc 74898
/*    */     //   316: if_icmpne -> 329
/*    */     //   319: aload #6
/*    */     //   321: invokeinterface getSkipping : ()Z
/*    */     //   326: ifne -> 556
/*    */     //   329: aload #6
/*    */     //   331: invokeinterface startDefaults : ()V
/*    */     //   336: iload #7
/*    */     //   338: iconst_1
/*    */     //   339: iand
/*    */     //   340: ifeq -> 353
/*    */     //   343: aload #6
/*    */     //   345: invokeinterface getDefaultsInvalid : ()Z
/*    */     //   350: ifeq -> 430
/*    */     //   353: iload #8
/*    */     //   355: iconst_2
/*    */     //   356: iand
/*    */     //   357: ifeq -> 367
/*    */     //   360: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   363: checkcast androidx/compose/ui/Modifier
/*    */     //   366: astore_1
/*    */     //   367: iload #8
/*    */     //   369: iconst_4
/*    */     //   370: iand
/*    */     //   371: ifeq -> 376
/*    */     //   374: iconst_1
/*    */     //   375: istore_2
/*    */     //   376: iload #8
/*    */     //   378: bipush #8
/*    */     //   380: iand
/*    */     //   381: ifeq -> 403
/*    */     //   384: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*    */     //   387: aload #6
/*    */     //   389: bipush #6
/*    */     //   391: invokestatic getTooltipStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;
/*    */     //   394: astore_3
/*    */     //   395: iload #9
/*    */     //   397: sipush #-7169
/*    */     //   400: iand
/*    */     //   401: istore #9
/*    */     //   403: iload #8
/*    */     //   405: bipush #16
/*    */     //   407: iand
/*    */     //   408: ifeq -> 468
/*    */     //   411: aload_3
/*    */     //   412: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/TooltipMetrics;
/*    */     //   415: invokevirtual getPlacement : ()Landroidx/compose/foundation/TooltipPlacement;
/*    */     //   418: astore #4
/*    */     //   420: iload #9
/*    */     //   422: ldc -57345
/*    */     //   424: iand
/*    */     //   425: istore #9
/*    */     //   427: goto -> 468
/*    */     //   430: aload #6
/*    */     //   432: invokeinterface skipToGroupEnd : ()V
/*    */     //   437: iload #8
/*    */     //   439: bipush #8
/*    */     //   441: iand
/*    */     //   442: ifeq -> 453
/*    */     //   445: iload #9
/*    */     //   447: sipush #-7169
/*    */     //   450: iand
/*    */     //   451: istore #9
/*    */     //   453: iload #8
/*    */     //   455: bipush #16
/*    */     //   457: iand
/*    */     //   458: ifeq -> 468
/*    */     //   461: iload #9
/*    */     //   463: ldc -57345
/*    */     //   465: iand
/*    */     //   466: istore #9
/*    */     //   468: aload #6
/*    */     //   470: invokeinterface endDefaults : ()V
/*    */     //   475: invokestatic isTraceInProgress : ()Z
/*    */     //   478: ifeq -> 491
/*    */     //   481: ldc -1700809146
/*    */     //   483: iload #9
/*    */     //   485: iconst_m1
/*    */     //   486: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.JunieTooltip (JunieTooltip.kt:30)'
/*    */     //   488: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   491: aload #6
/*    */     //   493: iconst_0
/*    */     //   494: invokestatic rememberJunieTooltipStyle : (Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;
/*    */     //   497: astore #10
/*    */     //   499: aload_0
/*    */     //   500: aload_1
/*    */     //   501: iload_2
/*    */     //   502: aload #10
/*    */     //   504: aload #4
/*    */     //   506: aload #5
/*    */     //   508: aload #6
/*    */     //   510: bipush #14
/*    */     //   512: iload #9
/*    */     //   514: iand
/*    */     //   515: bipush #112
/*    */     //   517: iload #9
/*    */     //   519: iand
/*    */     //   520: ior
/*    */     //   521: sipush #896
/*    */     //   524: iload #9
/*    */     //   526: iand
/*    */     //   527: ior
/*    */     //   528: ldc 57344
/*    */     //   530: iload #9
/*    */     //   532: iand
/*    */     //   533: ior
/*    */     //   534: ldc 458752
/*    */     //   536: iload #9
/*    */     //   538: iand
/*    */     //   539: ior
/*    */     //   540: iconst_0
/*    */     //   541: invokestatic Tooltip : (Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/foundation/TooltipPlacement;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*    */     //   544: invokestatic isTraceInProgress : ()Z
/*    */     //   547: ifeq -> 563
/*    */     //   550: invokestatic traceEventEnd : ()V
/*    */     //   553: goto -> 563
/*    */     //   556: aload #6
/*    */     //   558: invokeinterface skipToGroupEnd : ()V
/*    */     //   563: aload #6
/*    */     //   565: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   570: dup
/*    */     //   571: ifnull -> 599
/*    */     //   574: aload_0
/*    */     //   575: aload_1
/*    */     //   576: iload_2
/*    */     //   577: aload_3
/*    */     //   578: aload #4
/*    */     //   580: aload #5
/*    */     //   582: iload #7
/*    */     //   584: iload #8
/*    */     //   586: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/foundation/TooltipPlacement;Lkotlin/jvm/functions/Function2;II)Lkotlin/jvm/functions/Function2;
/*    */     //   591: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   596: goto -> 600
/*    */     //   599: pop
/*    */     //   600: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #31	-> 13
/*    */     //   #26	-> 360
/*    */     //   #27	-> 374
/*    */     //   #28	-> 384
/*    */     //   #29	-> 411
/*    */     //   #31	-> 488
/*    */     //   #32	-> 494
/*    */     //   #33	-> 499
/*    */     //   #34	-> 556
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   499	54	10	junieTooltipStyle	Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;
/*    */     //   28	573	9	$dirty	I
/*    */     //   0	601	0	tooltip	Lkotlin/jvm/functions/Function2;
/*    */     //   0	601	1	modifier	Landroidx/compose/ui/Modifier;
/*    */     //   0	601	2	enabled	Z
/*    */     //   0	601	3	style	Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;
/*    */     //   0	601	4	tooltipPlacement	Landroidx/compose/foundation/TooltipPlacement;
/*    */     //   0	601	5	content	Lkotlin/jvm/functions/Function2;
/*    */     //   0	601	6	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	601	7	$changed	I
/*    */   }
/*    */   
/*    */   @Composable
/*    */   @NotNull
/*    */   public static final TooltipStyle rememberJunieTooltipStyle(@Nullable Composer $composer, int $changed) {
/* 38 */     $composer.startReplaceGroup(-1541822475); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1541822475, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.rememberJunieTooltipStyle (JunieTooltip.kt:37)"); 
/* 39 */     TooltipStyle jewelTooltipStyle = JewelThemeKt.getTooltipStyle(JewelTheme.Companion, $composer, 6); $composer.startReplaceGroup(-1839574639); Composer composer = $composer;
/*    */     
/* 41 */     boolean invalid$iv = $composer.changed(jewelTooltipStyle); int $i$f$cache = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 57 */     Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 58 */     if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
/* 59 */       int $i$a$-cache-JunieTooltipKt$rememberJunieTooltipStyle$junieTooltipStyle$1 = 0; PaddingValues paddingValues = jewelTooltipStyle.getMetrics().getContentPadding(); long l = DurationKt.toDuration(100, DurationUnit.MILLISECONDS); float f1 = jewelTooltipStyle.getMetrics().getBorderWidth-D9Ej5fM(); float f2 = jewelTooltipStyle.getMetrics().getShadowSize-D9Ej5fM(); CornerSize cornerSize = jewelTooltipStyle.getMetrics().getCornerSize();
/*    */       TooltipPlacement tooltipPlacement = jewelTooltipStyle.getMetrics().getPlacement();
/*    */     } 
/* 62 */     TooltipStyle tooltipStyle1 = (TooltipStyle)it$iv;
/*    */     $composer.endReplaceGroup();
/*    */     TooltipStyle junieTooltipStyle = tooltipStyle1;
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */     return junieTooltipStyle;
/*    */   }
/*    */   
/*    */   private static final Unit BraveModeTooltip$lambda$0(Function2<? super Composer, ? super Integer, Unit> $tooltip, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, Composer $composer, int $force) {
/*    */     BraveModeTooltip($tooltip, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit JunieTooltip$lambda$1(Function2<? super Composer, ? super Integer, Unit> $tooltip, Modifier $modifier, boolean $enabled, TooltipStyle $style, TooltipPlacement $tooltipPlacement, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*    */     JunieTooltip($tooltip, $modifier, $enabled, $style, $tooltipPlacement, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\JunieTooltipKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */