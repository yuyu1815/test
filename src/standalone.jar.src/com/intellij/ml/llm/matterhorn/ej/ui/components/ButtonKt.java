/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*     */ 
/*     */ import androidx.compose.foundation.layout.RowScope;
/*     */ import androidx.compose.foundation.shape.CornerSize;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.graphics.Brush;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.component.styling.ButtonColors;
/*     */ import org.jetbrains.jewel.ui.component.styling.ButtonStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.IconButtonStyle;
/*     */ import org.jetbrains.jewel.ui.icon.IconKey;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\\\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\016\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\032\022\020\000\032\0020\001*\0020\0012\006\020\002\032\0020\003\032%\020\000\032\0020\004*\0020\0042\b\b\002\020\002\032\0020\0032\b\b\002\020\005\032\0020\006H\007¢\006\002\020\007\032\"\020\b\032\0020\t*\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\0132\006\020\r\032\0020\013\032?\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\0232\b\b\002\020\024\032\0020\0252\b\b\002\020\005\032\0020\0062\f\020\026\032\b\022\004\022\0020\0170\027H\007¢\006\002\020\030\0327\020\031\032\0020\0172\006\020\032\032\0020\0232\b\b\002\020\024\032\0020\0252\b\b\002\020\005\032\0020\0062\f\020\026\032\b\022\004\022\0020\0170\027H\007¢\006\002\020\033\032-\020\034\032\0020\0172\b\b\002\020\024\032\0020\0252\006\020\022\032\0020\0232\f\020\026\032\b\022\004\022\0020\0170\027H\007¢\006\002\020\035\032-\020\036\032\0020\0172\b\b\002\020\024\032\0020\0252\006\020\022\032\0020\0232\f\020\026\032\b\022\004\022\0020\0170\027H\007¢\006\002\020\035\032-\020\037\032\0020\0172\b\b\002\020\024\032\0020\0252\006\020\022\032\0020\0232\f\020\026\032\b\022\004\022\0020\0170\027H\007¢\006\002\020\035\032%\020 \032\0020\0172\b\b\002\020\024\032\0020\0252\f\020\026\032\b\022\004\022\0020\0170\027H\007¢\006\002\020!\032%\020\"\032\0020\0172\b\b\002\020\024\032\0020\0252\f\020\026\032\b\022\004\022\0020\0170\027H\007¢\006\002\020!\032%\020#\032\0020\0172\b\b\002\020\024\032\0020\0252\f\020\026\032\b\022\004\022\0020\0170\027H\007¢\006\002\020!\032%\020$\032\0020\0172\b\b\002\020\024\032\0020\0252\f\020\026\032\b\022\004\022\0020\0170\027H\007¢\006\002\020!\032Y\020\016\032\0020\0172\006\020\032\032\0020\0232\b\b\002\020\024\032\0020\0252\b\b\002\020\005\032\0020\0062\f\020\026\032\b\022\004\022\0020\0170\0272 \b\002\020%\032\032\022\004\022\0020'\022\004\022\0020\017\030\0010&¢\006\002\b(¢\006\002\b)H\007¢\006\002\020*¨\006+"}, d2 = {"withRoundedCornerShape", "Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;", "corner", "Landroidx/compose/foundation/shape/CornerSize;", "Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;", "primary", "", "(Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;Landroidx/compose/foundation/shape/CornerSize;ZLandroidx/compose/runtime/Composer;II)Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;", "copy", "Lorg/jetbrains/jewel/ui/component/styling/ButtonColors;", "background", "Landroidx/compose/ui/graphics/Brush;", "hovered", "pressed", "Button", "", "icon", "Lorg/jetbrains/jewel/ui/icon/IconKey;", "name", "", "modifier", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function0;", "(Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "DialogButton", "text", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "StopButton", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "DoneButton", "RestartButton", "RunCommandButton", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SkipButton", "ApproveEditButton", "DeclineEditButton", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "standalone"})
/*     */ @SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/ButtonKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,190:1\n149#2:191\n149#2:192\n*S KotlinDebug\n*F\n+ 1 Button.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/ButtonKt\n*L\n41#1:191\n100#1:192\n*E\n"})
/*     */ public final class ButtonKt {
/*     */   @NotNull
/*  28 */   public static final IconButtonStyle withRoundedCornerShape(@NotNull IconButtonStyle $this$withRoundedCornerShape, @NotNull CornerSize corner) { Intrinsics.checkNotNullParameter($this$withRoundedCornerShape, "<this>"); Intrinsics.checkNotNullParameter(corner, "corner"); return new IconButtonStyle(
/*  29 */         $this$withRoundedCornerShape.getColors(), 
/*     */         
/*  31 */         new IconButtonMetrics(
/*  32 */           corner, 
/*  33 */           $this$withRoundedCornerShape.getMetrics().getBorderWidth-D9Ej5fM(), 
/*  34 */           $this$withRoundedCornerShape.getMetrics().getPadding(), 
/*  35 */           $this$withRoundedCornerShape.getMetrics().getMinSize-MYxV2XQ(), null)); }
/*     */   @NotNull public static final ButtonColors copy(@NotNull ButtonColors $this$copy, @NotNull Brush background, @NotNull Brush hovered, @NotNull Brush pressed) { Intrinsics.checkNotNullParameter($this$copy, "<this>");
/*     */     Intrinsics.checkNotNullParameter(background, "background");
/*     */     Intrinsics.checkNotNullParameter(hovered, "hovered");
/*     */     Intrinsics.checkNotNullParameter(pressed, "pressed");
/*     */     return new ButtonColors(background, $this$copy.getBackgroundDisabled(), background, pressed, hovered, $this$copy.getContent-0d7_KjU(), $this$copy.getContentDisabled-0d7_KjU(), $this$copy.getContentFocused-0d7_KjU(), $this$copy.getContentPressed-0d7_KjU(), $this$copy.getContentHovered-0d7_KjU(), background, $this$copy.getBorderDisabled(), $this$copy.getBorderFocused(), pressed, hovered, null); }
/*     */   @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void Button(@NotNull IconKey icon, @NotNull String name, @Nullable Modifier modifier, boolean primary, @NotNull Function0 onClick, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'icon'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'name'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload #4
/*     */     //   14: ldc 'onClick'
/*     */     //   16: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   19: aload #5
/*     */     //   21: ldc -1879678713
/*     */     //   23: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   28: astore #5
/*     */     //   30: iload #6
/*     */     //   32: istore #8
/*     */     //   34: iload #7
/*     */     //   36: iconst_1
/*     */     //   37: iand
/*     */     //   38: ifeq -> 51
/*     */     //   41: iload #8
/*     */     //   43: bipush #6
/*     */     //   45: ior
/*     */     //   46: istore #8
/*     */     //   48: goto -> 80
/*     */     //   51: iload #6
/*     */     //   53: bipush #6
/*     */     //   55: iand
/*     */     //   56: ifne -> 80
/*     */     //   59: iload #8
/*     */     //   61: aload #5
/*     */     //   63: aload_0
/*     */     //   64: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   69: ifeq -> 76
/*     */     //   72: iconst_4
/*     */     //   73: goto -> 77
/*     */     //   76: iconst_2
/*     */     //   77: ior
/*     */     //   78: istore #8
/*     */     //   80: iload #7
/*     */     //   82: iconst_2
/*     */     //   83: iand
/*     */     //   84: ifeq -> 97
/*     */     //   87: iload #8
/*     */     //   89: bipush #48
/*     */     //   91: ior
/*     */     //   92: istore #8
/*     */     //   94: goto -> 128
/*     */     //   97: iload #6
/*     */     //   99: bipush #48
/*     */     //   101: iand
/*     */     //   102: ifne -> 128
/*     */     //   105: iload #8
/*     */     //   107: aload #5
/*     */     //   109: aload_1
/*     */     //   110: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   115: ifeq -> 123
/*     */     //   118: bipush #32
/*     */     //   120: goto -> 125
/*     */     //   123: bipush #16
/*     */     //   125: ior
/*     */     //   126: istore #8
/*     */     //   128: iload #7
/*     */     //   130: iconst_4
/*     */     //   131: iand
/*     */     //   132: ifeq -> 146
/*     */     //   135: iload #8
/*     */     //   137: sipush #384
/*     */     //   140: ior
/*     */     //   141: istore #8
/*     */     //   143: goto -> 180
/*     */     //   146: iload #6
/*     */     //   148: sipush #384
/*     */     //   151: iand
/*     */     //   152: ifne -> 180
/*     */     //   155: iload #8
/*     */     //   157: aload #5
/*     */     //   159: aload_2
/*     */     //   160: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   165: ifeq -> 174
/*     */     //   168: sipush #256
/*     */     //   171: goto -> 177
/*     */     //   174: sipush #128
/*     */     //   177: ior
/*     */     //   178: istore #8
/*     */     //   180: iload #7
/*     */     //   182: bipush #8
/*     */     //   184: iand
/*     */     //   185: ifeq -> 199
/*     */     //   188: iload #8
/*     */     //   190: sipush #3072
/*     */     //   193: ior
/*     */     //   194: istore #8
/*     */     //   196: goto -> 233
/*     */     //   199: iload #6
/*     */     //   201: sipush #3072
/*     */     //   204: iand
/*     */     //   205: ifne -> 233
/*     */     //   208: iload #8
/*     */     //   210: aload #5
/*     */     //   212: iload_3
/*     */     //   213: invokeinterface changed : (Z)Z
/*     */     //   218: ifeq -> 227
/*     */     //   221: sipush #2048
/*     */     //   224: goto -> 230
/*     */     //   227: sipush #1024
/*     */     //   230: ior
/*     */     //   231: istore #8
/*     */     //   233: iload #7
/*     */     //   235: bipush #16
/*     */     //   237: iand
/*     */     //   238: ifeq -> 252
/*     */     //   241: iload #8
/*     */     //   243: sipush #24576
/*     */     //   246: ior
/*     */     //   247: istore #8
/*     */     //   249: goto -> 287
/*     */     //   252: iload #6
/*     */     //   254: sipush #24576
/*     */     //   257: iand
/*     */     //   258: ifne -> 287
/*     */     //   261: iload #8
/*     */     //   263: aload #5
/*     */     //   265: aload #4
/*     */     //   267: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   272: ifeq -> 281
/*     */     //   275: sipush #16384
/*     */     //   278: goto -> 284
/*     */     //   281: sipush #8192
/*     */     //   284: ior
/*     */     //   285: istore #8
/*     */     //   287: iload #8
/*     */     //   289: sipush #9363
/*     */     //   292: iand
/*     */     //   293: sipush #9362
/*     */     //   296: if_icmpne -> 309
/*     */     //   299: aload #5
/*     */     //   301: invokeinterface getSkipping : ()Z
/*     */     //   306: ifne -> 431
/*     */     //   309: iload #7
/*     */     //   311: iconst_4
/*     */     //   312: iand
/*     */     //   313: ifeq -> 323
/*     */     //   316: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   319: checkcast androidx/compose/ui/Modifier
/*     */     //   322: astore_2
/*     */     //   323: iload #7
/*     */     //   325: bipush #8
/*     */     //   327: iand
/*     */     //   328: ifeq -> 333
/*     */     //   331: iconst_1
/*     */     //   332: istore_3
/*     */     //   333: invokestatic isTraceInProgress : ()Z
/*     */     //   336: ifeq -> 349
/*     */     //   339: ldc -1879678713
/*     */     //   341: iload #8
/*     */     //   343: iconst_m1
/*     */     //   344: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.Button (Button.kt:83)'
/*     */     //   346: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   349: aload_1
/*     */     //   350: aload_2
/*     */     //   351: iload_3
/*     */     //   352: aload #4
/*     */     //   354: ldc -1418801796
/*     */     //   356: iconst_1
/*     */     //   357: new com/intellij/ml/llm/matterhorn/ej/ui/components/ButtonKt$Button$1
/*     */     //   360: dup
/*     */     //   361: aload_0
/*     */     //   362: iload_3
/*     */     //   363: invokespecial <init> : (Lorg/jetbrains/jewel/ui/icon/IconKey;Z)V
/*     */     //   366: aload #5
/*     */     //   368: bipush #54
/*     */     //   370: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   373: checkcast kotlin/jvm/functions/Function3
/*     */     //   376: aload #5
/*     */     //   378: sipush #24576
/*     */     //   381: bipush #14
/*     */     //   383: iload #8
/*     */     //   385: iconst_3
/*     */     //   386: ishr
/*     */     //   387: iand
/*     */     //   388: ior
/*     */     //   389: bipush #112
/*     */     //   391: iload #8
/*     */     //   393: iconst_3
/*     */     //   394: ishr
/*     */     //   395: iand
/*     */     //   396: ior
/*     */     //   397: sipush #896
/*     */     //   400: iload #8
/*     */     //   402: iconst_3
/*     */     //   403: ishr
/*     */     //   404: iand
/*     */     //   405: ior
/*     */     //   406: sipush #7168
/*     */     //   409: iload #8
/*     */     //   411: iconst_3
/*     */     //   412: ishr
/*     */     //   413: iand
/*     */     //   414: ior
/*     */     //   415: iconst_0
/*     */     //   416: invokestatic Button : (Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   419: invokestatic isTraceInProgress : ()Z
/*     */     //   422: ifeq -> 438
/*     */     //   425: invokestatic traceEventEnd : ()V
/*     */     //   428: goto -> 438
/*     */     //   431: aload #5
/*     */     //   433: invokeinterface skipToGroupEnd : ()V
/*     */     //   438: aload #5
/*     */     //   440: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   445: dup
/*     */     //   446: ifnull -> 472
/*     */     //   449: aload_0
/*     */     //   450: aload_1
/*     */     //   451: aload_2
/*     */     //   452: iload_3
/*     */     //   453: aload #4
/*     */     //   455: iload #6
/*     */     //   457: iload #7
/*     */     //   459: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;II)Lkotlin/jvm/functions/Function2;
/*     */     //   464: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   469: goto -> 473
/*     */     //   472: pop
/*     */     //   473: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #84	-> 19
/*     */     //   #81	-> 316
/*     */     //   #82	-> 331
/*     */     //   #84	-> 346
/*     */     //   #85	-> 349
/*     */     //   #88	-> 431
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   34	440	8	$dirty	I
/*     */     //   0	474	0	icon	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   0	474	1	name	Ljava/lang/String;
/*     */     //   0	474	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	474	3	primary	Z
/*     */     //   0	474	4	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	474	5	$composer	Landroidx/compose/runtime/Composer;
/*  41 */     //   0	474	6	$changed	I } @Composable @NotNull public static final ButtonStyle withRoundedCornerShape(@NotNull ButtonStyle $this$withRoundedCornerShape, @Nullable CornerSize corner, boolean primary, @Nullable Composer $composer, int $changed, int paramInt1) { Intrinsics.checkNotNullParameter($this$withRoundedCornerShape, "<this>"); $composer.startReplaceGroup(-485147078); if ((paramInt1 & 0x1) != 0) { int $this$dp$iv = 14, $i$f$getDp = 0; corner = CornerSizeKt.CornerSize-0680j_4(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 191 */           Dp.constructor-impl($this$dp$iv)); }  if ((paramInt1 & 0x2) != 0) primary = true;  if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-485147078, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.withRoundedCornerShape (Button.kt:43)");  ButtonStyle buttonStyle = new ButtonStyle(copy($this$withRoundedCornerShape.getColors(), (Brush)new SolidColor(MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getButtonBackgroundColor-vNxB06k(primary), null), (Brush)new SolidColor(MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getButtonHoveredColor-vNxB06k(primary), null), (Brush)new SolidColor(MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getButtonPressedColor-vNxB06k(primary), null)), new ButtonMetrics(corner, $this$withRoundedCornerShape.getMetrics().getPadding(), $this$withRoundedCornerShape.getMetrics().getMinSize-MYxV2XQ(), $this$withRoundedCornerShape.getMetrics().getBorderWidth-D9Ej5fM(), $this$withRoundedCornerShape.getMetrics().getFocusOutlineExpand-D9Ej5fM(), null), $this$withRoundedCornerShape.getFocusOutlineAlignment()); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return buttonStyle; } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/ButtonKt$Button$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,190:1\n149#2:191\n*S KotlinDebug\n*F\n+ 1 Button.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/ButtonKt$Button$1\n*L\n86#1:191\n*E\n"}) static final class ButtonKt$Button$1 implements Function3<RowScope, Composer, Integer, Unit> { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(RowScope $this$Button, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$Button, "$this$Button"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1418801796, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.Button.<anonymous> (Button.kt:85)");  int $this$dp$iv = 6, $i$f$getDp = 0; IconKt.Icon-FHprtrg(this.$icon, "Button", PaddingKt.padding-qDBjuR0$default((Modifier)Modifier.Companion, 0.0F, 0.0F, Dp.constructor-impl($this$dp$iv), 0.0F, 11, null), null, MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getButtonTextColor-vNxB06k(this.$primary), new org.jetbrains.jewel.ui.painter.PainterHint[0], $composer, 432, 8);
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd();  }
/*     */       else
/*     */       { $composer.skipToGroupEnd(); }
/*     */        }
/*     */ 
/*     */     
/*     */     ButtonKt$Button$1(IconKey $icon, boolean $primary) {} }
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void DialogButton(@NotNull String text, @Nullable Modifier modifier, boolean primary, @NotNull Function0 onClick, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'text'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_3
/*     */     //   8: ldc 'onClick'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload #4
/*     */     //   15: ldc_w -1160740075
/*     */     //   18: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   23: astore #4
/*     */     //   25: iload #5
/*     */     //   27: istore #7
/*     */     //   29: iload #6
/*     */     //   31: iconst_1
/*     */     //   32: iand
/*     */     //   33: ifeq -> 46
/*     */     //   36: iload #7
/*     */     //   38: bipush #6
/*     */     //   40: ior
/*     */     //   41: istore #7
/*     */     //   43: goto -> 75
/*     */     //   46: iload #5
/*     */     //   48: bipush #6
/*     */     //   50: iand
/*     */     //   51: ifne -> 75
/*     */     //   54: iload #7
/*     */     //   56: aload #4
/*     */     //   58: aload_0
/*     */     //   59: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   64: ifeq -> 71
/*     */     //   67: iconst_4
/*     */     //   68: goto -> 72
/*     */     //   71: iconst_2
/*     */     //   72: ior
/*     */     //   73: istore #7
/*     */     //   75: iload #6
/*     */     //   77: iconst_2
/*     */     //   78: iand
/*     */     //   79: ifeq -> 92
/*     */     //   82: iload #7
/*     */     //   84: bipush #48
/*     */     //   86: ior
/*     */     //   87: istore #7
/*     */     //   89: goto -> 123
/*     */     //   92: iload #5
/*     */     //   94: bipush #48
/*     */     //   96: iand
/*     */     //   97: ifne -> 123
/*     */     //   100: iload #7
/*     */     //   102: aload #4
/*     */     //   104: aload_1
/*     */     //   105: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   110: ifeq -> 118
/*     */     //   113: bipush #32
/*     */     //   115: goto -> 120
/*     */     //   118: bipush #16
/*     */     //   120: ior
/*     */     //   121: istore #7
/*     */     //   123: iload #6
/*     */     //   125: iconst_4
/*     */     //   126: iand
/*     */     //   127: ifeq -> 141
/*     */     //   130: iload #7
/*     */     //   132: sipush #384
/*     */     //   135: ior
/*     */     //   136: istore #7
/*     */     //   138: goto -> 175
/*     */     //   141: iload #5
/*     */     //   143: sipush #384
/*     */     //   146: iand
/*     */     //   147: ifne -> 175
/*     */     //   150: iload #7
/*     */     //   152: aload #4
/*     */     //   154: iload_2
/*     */     //   155: invokeinterface changed : (Z)Z
/*     */     //   160: ifeq -> 169
/*     */     //   163: sipush #256
/*     */     //   166: goto -> 172
/*     */     //   169: sipush #128
/*     */     //   172: ior
/*     */     //   173: istore #7
/*     */     //   175: iload #6
/*     */     //   177: bipush #8
/*     */     //   179: iand
/*     */     //   180: ifeq -> 194
/*     */     //   183: iload #7
/*     */     //   185: sipush #3072
/*     */     //   188: ior
/*     */     //   189: istore #7
/*     */     //   191: goto -> 228
/*     */     //   194: iload #5
/*     */     //   196: sipush #3072
/*     */     //   199: iand
/*     */     //   200: ifne -> 228
/*     */     //   203: iload #7
/*     */     //   205: aload #4
/*     */     //   207: aload_3
/*     */     //   208: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   213: ifeq -> 222
/*     */     //   216: sipush #2048
/*     */     //   219: goto -> 225
/*     */     //   222: sipush #1024
/*     */     //   225: ior
/*     */     //   226: istore #7
/*     */     //   228: iload #7
/*     */     //   230: sipush #1171
/*     */     //   233: iand
/*     */     //   234: sipush #1170
/*     */     //   237: if_icmpne -> 250
/*     */     //   240: aload #4
/*     */     //   242: invokeinterface getSkipping : ()Z
/*     */     //   247: ifne -> 398
/*     */     //   250: iload #6
/*     */     //   252: iconst_2
/*     */     //   253: iand
/*     */     //   254: ifeq -> 264
/*     */     //   257: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   260: checkcast androidx/compose/ui/Modifier
/*     */     //   263: astore_1
/*     */     //   264: iload #6
/*     */     //   266: iconst_4
/*     */     //   267: iand
/*     */     //   268: ifeq -> 273
/*     */     //   271: iconst_1
/*     */     //   272: istore_2
/*     */     //   273: invokestatic isTraceInProgress : ()Z
/*     */     //   276: ifeq -> 291
/*     */     //   279: ldc_w -1160740075
/*     */     //   282: iload #7
/*     */     //   284: iconst_m1
/*     */     //   285: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.components.DialogButton (Button.kt:95)'
/*     */     //   288: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   291: aload_3
/*     */     //   292: aload_1
/*     */     //   293: iconst_0
/*     */     //   294: aconst_null
/*     */     //   295: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   298: aload #4
/*     */     //   300: bipush #6
/*     */     //   302: invokestatic getDefaultButtonStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;
/*     */     //   305: bipush #6
/*     */     //   307: istore #8
/*     */     //   309: iconst_0
/*     */     //   310: istore #9
/*     */     //   312: iload #8
/*     */     //   314: i2f
/*     */     //   315: invokestatic constructor-impl : (F)F
/*     */     //   318: invokestatic CornerSize-0680j_4 : (F)Landroidx/compose/foundation/shape/CornerSize;
/*     */     //   321: iload_2
/*     */     //   322: aload #4
/*     */     //   324: bipush #48
/*     */     //   326: sipush #896
/*     */     //   329: iload #7
/*     */     //   331: iand
/*     */     //   332: ior
/*     */     //   333: iconst_0
/*     */     //   334: invokestatic withRoundedCornerShape : (Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;Landroidx/compose/foundation/shape/CornerSize;ZLandroidx/compose/runtime/Composer;II)Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;
/*     */     //   337: aconst_null
/*     */     //   338: ldc_w 356562587
/*     */     //   341: iconst_1
/*     */     //   342: new com/intellij/ml/llm/matterhorn/ej/ui/components/ButtonKt$DialogButton$1
/*     */     //   345: dup
/*     */     //   346: iload_2
/*     */     //   347: aload_0
/*     */     //   348: invokespecial <init> : (ZLjava/lang/String;)V
/*     */     //   351: aload #4
/*     */     //   353: bipush #54
/*     */     //   355: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   358: checkcast kotlin/jvm/functions/Function3
/*     */     //   361: aload #4
/*     */     //   363: ldc_w 1572864
/*     */     //   366: bipush #14
/*     */     //   368: iload #7
/*     */     //   370: bipush #9
/*     */     //   372: ishr
/*     */     //   373: iand
/*     */     //   374: ior
/*     */     //   375: bipush #112
/*     */     //   377: iload #7
/*     */     //   379: iand
/*     */     //   380: ior
/*     */     //   381: bipush #44
/*     */     //   383: invokestatic DefaultButton : (Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   386: invokestatic isTraceInProgress : ()Z
/*     */     //   389: ifeq -> 405
/*     */     //   392: invokestatic traceEventEnd : ()V
/*     */     //   395: goto -> 405
/*     */     //   398: aload #4
/*     */     //   400: invokeinterface skipToGroupEnd : ()V
/*     */     //   405: aload #4
/*     */     //   407: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   412: dup
/*     */     //   413: ifnull -> 437
/*     */     //   416: aload_0
/*     */     //   417: aload_1
/*     */     //   418: iload_2
/*     */     //   419: aload_3
/*     */     //   420: iload #5
/*     */     //   422: iload #6
/*     */     //   424: <illegal opcode> invoke : (Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;II)Lkotlin/jvm/functions/Function2;
/*     */     //   429: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   434: goto -> 438
/*     */     //   437: pop
/*     */     //   438: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #96	-> 13
/*     */     //   #93	-> 257
/*     */     //   #94	-> 271
/*     */     //   #96	-> 288
/*     */     //   #98	-> 291
/*     */     //   #99	-> 292
/*     */     //   #100	-> 295
/*     */     //   #192	-> 312
/*     */     //   #100	-> 318
/*     */     //   #101	-> 338
/*     */     //   #97	-> 383
/*     */     //   #104	-> 398
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   312	6	9	$i$f$getDp	I
/*     */     //   309	9	8	$this$dp$iv	I
/*     */     //   29	410	7	$dirty	I
/*     */     //   0	439	0	text	Ljava/lang/String;
/*     */     //   0	439	1	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	439	2	primary	Z
/*     */     //   0	439	3	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	439	4	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	439	5	$changed	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ButtonKt$DialogButton$1 implements Function3<RowScope, Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(RowScope $this$DefaultButton, Composer $composer, int $changed) {
/*     */       Intrinsics.checkNotNullParameter($this$DefaultButton, "$this$DefaultButton");
/*     */       if (($changed & 0x11) != 16 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(356562587, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.DialogButton.<anonymous> (Button.kt:101)"); 
/*     */         int i = TextOverflow.Companion.getEllipsis-gIe3tQ8();
/*     */         long l = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getButtonTextColor-vNxB06k(this.$primary);
/*     */         TextKt.Text-bAzTDeA(this.$text, null, l, 0L, null, null, null, 0L, null, 0, 0L, i, false, 1, null, null, $composer, 0, 3120, 55290);
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd(); 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */     
/*     */     ButtonKt$DialogButton$1(boolean $primary, String $text) {}
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void StopButton(@Nullable Modifier modifier, @NotNull String name, @NotNull Function0 onClick, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'name'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'onClick'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_3
/*     */     //   13: ldc_w -1397195929
/*     */     //   16: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   21: astore_3
/*     */     //   22: iload #4
/*     */     //   24: istore #6
/*     */     //   26: iload #5
/*     */     //   28: iconst_1
/*     */     //   29: iand
/*     */     //   30: ifeq -> 43
/*     */     //   33: iload #6
/*     */     //   35: bipush #6
/*     */     //   37: ior
/*     */     //   38: istore #6
/*     */     //   40: goto -> 71
/*     */     //   43: iload #4
/*     */     //   45: bipush #6
/*     */     //   47: iand
/*     */     //   48: ifne -> 71
/*     */     //   51: iload #6
/*     */     //   53: aload_3
/*     */     //   54: aload_0
/*     */     //   55: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   60: ifeq -> 67
/*     */     //   63: iconst_4
/*     */     //   64: goto -> 68
/*     */     //   67: iconst_2
/*     */     //   68: ior
/*     */     //   69: istore #6
/*     */     //   71: iload #5
/*     */     //   73: iconst_2
/*     */     //   74: iand
/*     */     //   75: ifeq -> 88
/*     */     //   78: iload #6
/*     */     //   80: bipush #48
/*     */     //   82: ior
/*     */     //   83: istore #6
/*     */     //   85: goto -> 118
/*     */     //   88: iload #4
/*     */     //   90: bipush #48
/*     */     //   92: iand
/*     */     //   93: ifne -> 118
/*     */     //   96: iload #6
/*     */     //   98: aload_3
/*     */     //   99: aload_1
/*     */     //   100: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   105: ifeq -> 113
/*     */     //   108: bipush #32
/*     */     //   110: goto -> 115
/*     */     //   113: bipush #16
/*     */     //   115: ior
/*     */     //   116: istore #6
/*     */     //   118: iload #5
/*     */     //   120: iconst_4
/*     */     //   121: iand
/*     */     //   122: ifeq -> 136
/*     */     //   125: iload #6
/*     */     //   127: sipush #384
/*     */     //   130: ior
/*     */     //   131: istore #6
/*     */     //   133: goto -> 169
/*     */     //   136: iload #4
/*     */     //   138: sipush #384
/*     */     //   141: iand
/*     */     //   142: ifne -> 169
/*     */     //   145: iload #6
/*     */     //   147: aload_3
/*     */     //   148: aload_2
/*     */     //   149: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   154: ifeq -> 163
/*     */     //   157: sipush #256
/*     */     //   160: goto -> 166
/*     */     //   163: sipush #128
/*     */     //   166: ior
/*     */     //   167: istore #6
/*     */     //   169: iload #6
/*     */     //   171: sipush #147
/*     */     //   174: iand
/*     */     //   175: sipush #146
/*     */     //   178: if_icmpne -> 190
/*     */     //   181: aload_3
/*     */     //   182: invokeinterface getSkipping : ()Z
/*     */     //   187: ifne -> 287
/*     */     //   190: iload #5
/*     */     //   192: iconst_1
/*     */     //   193: iand
/*     */     //   194: ifeq -> 204
/*     */     //   197: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   200: checkcast androidx/compose/ui/Modifier
/*     */     //   203: astore_0
/*     */     //   204: invokestatic isTraceInProgress : ()Z
/*     */     //   207: ifeq -> 222
/*     */     //   210: ldc_w -1397195929
/*     */     //   213: iload #6
/*     */     //   215: iconst_m1
/*     */     //   216: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.components.StopButton (Button.kt:110)'
/*     */     //   219: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   222: aload_3
/*     */     //   223: iconst_0
/*     */     //   224: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   227: invokevirtual getResultIncorrect : ()Lorg/jetbrains/jewel/ui/icon/PathIconKey;
/*     */     //   230: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*     */     //   233: aload_1
/*     */     //   234: aload_0
/*     */     //   235: iconst_0
/*     */     //   236: aload_2
/*     */     //   237: aload_3
/*     */     //   238: sipush #3072
/*     */     //   241: getstatic org/jetbrains/jewel/ui/icon/PathIconKey.$stable : I
/*     */     //   244: ior
/*     */     //   245: bipush #112
/*     */     //   247: iload #6
/*     */     //   249: iand
/*     */     //   250: ior
/*     */     //   251: sipush #896
/*     */     //   254: iload #6
/*     */     //   256: bipush #6
/*     */     //   258: ishl
/*     */     //   259: iand
/*     */     //   260: ior
/*     */     //   261: ldc_w 57344
/*     */     //   264: iload #6
/*     */     //   266: bipush #6
/*     */     //   268: ishl
/*     */     //   269: iand
/*     */     //   270: ior
/*     */     //   271: iconst_0
/*     */     //   272: invokestatic Button : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*     */     //   275: invokestatic isTraceInProgress : ()Z
/*     */     //   278: ifeq -> 293
/*     */     //   281: invokestatic traceEventEnd : ()V
/*     */     //   284: goto -> 293
/*     */     //   287: aload_3
/*     */     //   288: invokeinterface skipToGroupEnd : ()V
/*     */     //   293: aload_3
/*     */     //   294: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   299: dup
/*     */     //   300: ifnull -> 323
/*     */     //   303: aload_0
/*     */     //   304: aload_1
/*     */     //   305: aload_2
/*     */     //   306: iload #4
/*     */     //   308: iload #5
/*     */     //   310: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;II)Lkotlin/jvm/functions/Function2;
/*     */     //   315: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   320: goto -> 324
/*     */     //   323: pop
/*     */     //   324: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #111	-> 12
/*     */     //   #108	-> 197
/*     */     //   #111	-> 219
/*     */     //   #112	-> 224
/*     */     //   #113	-> 287
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   26	299	6	$dirty	I
/*     */     //   0	325	0	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	325	1	name	Ljava/lang/String;
/*     */     //   0	325	2	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	325	3	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	325	4	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void DoneButton(@Nullable Modifier modifier, @NotNull String name, @NotNull Function0 onClick, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'name'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'onClick'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_3
/*     */     //   13: ldc_w 1236539111
/*     */     //   16: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   21: astore_3
/*     */     //   22: iload #4
/*     */     //   24: istore #6
/*     */     //   26: iload #5
/*     */     //   28: iconst_1
/*     */     //   29: iand
/*     */     //   30: ifeq -> 43
/*     */     //   33: iload #6
/*     */     //   35: bipush #6
/*     */     //   37: ior
/*     */     //   38: istore #6
/*     */     //   40: goto -> 71
/*     */     //   43: iload #4
/*     */     //   45: bipush #6
/*     */     //   47: iand
/*     */     //   48: ifne -> 71
/*     */     //   51: iload #6
/*     */     //   53: aload_3
/*     */     //   54: aload_0
/*     */     //   55: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   60: ifeq -> 67
/*     */     //   63: iconst_4
/*     */     //   64: goto -> 68
/*     */     //   67: iconst_2
/*     */     //   68: ior
/*     */     //   69: istore #6
/*     */     //   71: iload #5
/*     */     //   73: iconst_2
/*     */     //   74: iand
/*     */     //   75: ifeq -> 88
/*     */     //   78: iload #6
/*     */     //   80: bipush #48
/*     */     //   82: ior
/*     */     //   83: istore #6
/*     */     //   85: goto -> 118
/*     */     //   88: iload #4
/*     */     //   90: bipush #48
/*     */     //   92: iand
/*     */     //   93: ifne -> 118
/*     */     //   96: iload #6
/*     */     //   98: aload_3
/*     */     //   99: aload_1
/*     */     //   100: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   105: ifeq -> 113
/*     */     //   108: bipush #32
/*     */     //   110: goto -> 115
/*     */     //   113: bipush #16
/*     */     //   115: ior
/*     */     //   116: istore #6
/*     */     //   118: iload #5
/*     */     //   120: iconst_4
/*     */     //   121: iand
/*     */     //   122: ifeq -> 136
/*     */     //   125: iload #6
/*     */     //   127: sipush #384
/*     */     //   130: ior
/*     */     //   131: istore #6
/*     */     //   133: goto -> 169
/*     */     //   136: iload #4
/*     */     //   138: sipush #384
/*     */     //   141: iand
/*     */     //   142: ifne -> 169
/*     */     //   145: iload #6
/*     */     //   147: aload_3
/*     */     //   148: aload_2
/*     */     //   149: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   154: ifeq -> 163
/*     */     //   157: sipush #256
/*     */     //   160: goto -> 166
/*     */     //   163: sipush #128
/*     */     //   166: ior
/*     */     //   167: istore #6
/*     */     //   169: iload #6
/*     */     //   171: sipush #147
/*     */     //   174: iand
/*     */     //   175: sipush #146
/*     */     //   178: if_icmpne -> 190
/*     */     //   181: aload_3
/*     */     //   182: invokeinterface getSkipping : ()Z
/*     */     //   187: ifne -> 284
/*     */     //   190: iload #5
/*     */     //   192: iconst_1
/*     */     //   193: iand
/*     */     //   194: ifeq -> 204
/*     */     //   197: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   200: checkcast androidx/compose/ui/Modifier
/*     */     //   203: astore_0
/*     */     //   204: invokestatic isTraceInProgress : ()Z
/*     */     //   207: ifeq -> 222
/*     */     //   210: ldc_w 1236539111
/*     */     //   213: iload #6
/*     */     //   215: iconst_m1
/*     */     //   216: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.components.DoneButton (Button.kt:119)'
/*     */     //   219: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   222: aload_3
/*     */     //   223: iconst_0
/*     */     //   224: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   227: invokevirtual getDoneButtonIcon : ()Lorg/jetbrains/jewel/ui/icon/PathIconKey;
/*     */     //   230: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*     */     //   233: aload_1
/*     */     //   234: aload_0
/*     */     //   235: iconst_0
/*     */     //   236: aload_2
/*     */     //   237: aload_3
/*     */     //   238: getstatic org/jetbrains/jewel/ui/icon/PathIconKey.$stable : I
/*     */     //   241: bipush #112
/*     */     //   243: iload #6
/*     */     //   245: iand
/*     */     //   246: ior
/*     */     //   247: sipush #896
/*     */     //   250: iload #6
/*     */     //   252: bipush #6
/*     */     //   254: ishl
/*     */     //   255: iand
/*     */     //   256: ior
/*     */     //   257: ldc_w 57344
/*     */     //   260: iload #6
/*     */     //   262: bipush #6
/*     */     //   264: ishl
/*     */     //   265: iand
/*     */     //   266: ior
/*     */     //   267: bipush #8
/*     */     //   269: invokestatic Button : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*     */     //   272: invokestatic isTraceInProgress : ()Z
/*     */     //   275: ifeq -> 290
/*     */     //   278: invokestatic traceEventEnd : ()V
/*     */     //   281: goto -> 290
/*     */     //   284: aload_3
/*     */     //   285: invokeinterface skipToGroupEnd : ()V
/*     */     //   290: aload_3
/*     */     //   291: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   296: dup
/*     */     //   297: ifnull -> 320
/*     */     //   300: aload_0
/*     */     //   301: aload_1
/*     */     //   302: aload_2
/*     */     //   303: iload #4
/*     */     //   305: iload #5
/*     */     //   307: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;II)Lkotlin/jvm/functions/Function2;
/*     */     //   312: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   317: goto -> 321
/*     */     //   320: pop
/*     */     //   321: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #120	-> 12
/*     */     //   #117	-> 197
/*     */     //   #120	-> 219
/*     */     //   #121	-> 224
/*     */     //   #122	-> 284
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   26	296	6	$dirty	I
/*     */     //   0	322	0	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	322	1	name	Ljava/lang/String;
/*     */     //   0	322	2	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	322	3	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	322	4	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void RestartButton(@Nullable Modifier modifier, @NotNull String name, @NotNull Function0 onClick, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'name'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'onClick'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_3
/*     */     //   13: ldc_w 1342045784
/*     */     //   16: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   21: astore_3
/*     */     //   22: iload #4
/*     */     //   24: istore #6
/*     */     //   26: iload #5
/*     */     //   28: iconst_1
/*     */     //   29: iand
/*     */     //   30: ifeq -> 43
/*     */     //   33: iload #6
/*     */     //   35: bipush #6
/*     */     //   37: ior
/*     */     //   38: istore #6
/*     */     //   40: goto -> 71
/*     */     //   43: iload #4
/*     */     //   45: bipush #6
/*     */     //   47: iand
/*     */     //   48: ifne -> 71
/*     */     //   51: iload #6
/*     */     //   53: aload_3
/*     */     //   54: aload_0
/*     */     //   55: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   60: ifeq -> 67
/*     */     //   63: iconst_4
/*     */     //   64: goto -> 68
/*     */     //   67: iconst_2
/*     */     //   68: ior
/*     */     //   69: istore #6
/*     */     //   71: iload #5
/*     */     //   73: iconst_2
/*     */     //   74: iand
/*     */     //   75: ifeq -> 88
/*     */     //   78: iload #6
/*     */     //   80: bipush #48
/*     */     //   82: ior
/*     */     //   83: istore #6
/*     */     //   85: goto -> 118
/*     */     //   88: iload #4
/*     */     //   90: bipush #48
/*     */     //   92: iand
/*     */     //   93: ifne -> 118
/*     */     //   96: iload #6
/*     */     //   98: aload_3
/*     */     //   99: aload_1
/*     */     //   100: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   105: ifeq -> 113
/*     */     //   108: bipush #32
/*     */     //   110: goto -> 115
/*     */     //   113: bipush #16
/*     */     //   115: ior
/*     */     //   116: istore #6
/*     */     //   118: iload #5
/*     */     //   120: iconst_4
/*     */     //   121: iand
/*     */     //   122: ifeq -> 136
/*     */     //   125: iload #6
/*     */     //   127: sipush #384
/*     */     //   130: ior
/*     */     //   131: istore #6
/*     */     //   133: goto -> 169
/*     */     //   136: iload #4
/*     */     //   138: sipush #384
/*     */     //   141: iand
/*     */     //   142: ifne -> 169
/*     */     //   145: iload #6
/*     */     //   147: aload_3
/*     */     //   148: aload_2
/*     */     //   149: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   154: ifeq -> 163
/*     */     //   157: sipush #256
/*     */     //   160: goto -> 166
/*     */     //   163: sipush #128
/*     */     //   166: ior
/*     */     //   167: istore #6
/*     */     //   169: iload #6
/*     */     //   171: sipush #147
/*     */     //   174: iand
/*     */     //   175: sipush #146
/*     */     //   178: if_icmpne -> 190
/*     */     //   181: aload_3
/*     */     //   182: invokeinterface getSkipping : ()Z
/*     */     //   187: ifne -> 287
/*     */     //   190: iload #5
/*     */     //   192: iconst_1
/*     */     //   193: iand
/*     */     //   194: ifeq -> 204
/*     */     //   197: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   200: checkcast androidx/compose/ui/Modifier
/*     */     //   203: astore_0
/*     */     //   204: invokestatic isTraceInProgress : ()Z
/*     */     //   207: ifeq -> 222
/*     */     //   210: ldc_w 1342045784
/*     */     //   213: iload #6
/*     */     //   215: iconst_m1
/*     */     //   216: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.components.RestartButton (Button.kt:128)'
/*     */     //   219: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   222: aload_3
/*     */     //   223: iconst_0
/*     */     //   224: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   227: invokevirtual getRefreshIcon : ()Lorg/jetbrains/jewel/ui/icon/PathIconKey;
/*     */     //   230: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*     */     //   233: aload_1
/*     */     //   234: aload_0
/*     */     //   235: iconst_0
/*     */     //   236: aload_2
/*     */     //   237: aload_3
/*     */     //   238: sipush #3072
/*     */     //   241: getstatic org/jetbrains/jewel/ui/icon/PathIconKey.$stable : I
/*     */     //   244: ior
/*     */     //   245: bipush #112
/*     */     //   247: iload #6
/*     */     //   249: iand
/*     */     //   250: ior
/*     */     //   251: sipush #896
/*     */     //   254: iload #6
/*     */     //   256: bipush #6
/*     */     //   258: ishl
/*     */     //   259: iand
/*     */     //   260: ior
/*     */     //   261: ldc_w 57344
/*     */     //   264: iload #6
/*     */     //   266: bipush #6
/*     */     //   268: ishl
/*     */     //   269: iand
/*     */     //   270: ior
/*     */     //   271: iconst_0
/*     */     //   272: invokestatic Button : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*     */     //   275: invokestatic isTraceInProgress : ()Z
/*     */     //   278: ifeq -> 293
/*     */     //   281: invokestatic traceEventEnd : ()V
/*     */     //   284: goto -> 293
/*     */     //   287: aload_3
/*     */     //   288: invokeinterface skipToGroupEnd : ()V
/*     */     //   293: aload_3
/*     */     //   294: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   299: dup
/*     */     //   300: ifnull -> 323
/*     */     //   303: aload_0
/*     */     //   304: aload_1
/*     */     //   305: aload_2
/*     */     //   306: iload #4
/*     */     //   308: iload #5
/*     */     //   310: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;II)Lkotlin/jvm/functions/Function2;
/*     */     //   315: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   320: goto -> 324
/*     */     //   323: pop
/*     */     //   324: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #129	-> 12
/*     */     //   #126	-> 197
/*     */     //   #129	-> 219
/*     */     //   #130	-> 224
/*     */     //   #131	-> 287
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   26	299	6	$dirty	I
/*     */     //   0	325	0	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	325	1	name	Ljava/lang/String;
/*     */     //   0	325	2	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	325	3	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	325	4	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void RunCommandButton(@Nullable Modifier modifier, @NotNull Function0 onClick, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'onClick'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc_w 1902084646
/*     */     //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   15: astore_2
/*     */     //   16: iload_3
/*     */     //   17: istore #5
/*     */     //   19: iload #4
/*     */     //   21: iconst_1
/*     */     //   22: iand
/*     */     //   23: ifeq -> 36
/*     */     //   26: iload #5
/*     */     //   28: bipush #6
/*     */     //   30: ior
/*     */     //   31: istore #5
/*     */     //   33: goto -> 63
/*     */     //   36: iload_3
/*     */     //   37: bipush #6
/*     */     //   39: iand
/*     */     //   40: ifne -> 63
/*     */     //   43: iload #5
/*     */     //   45: aload_2
/*     */     //   46: aload_0
/*     */     //   47: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   52: ifeq -> 59
/*     */     //   55: iconst_4
/*     */     //   56: goto -> 60
/*     */     //   59: iconst_2
/*     */     //   60: ior
/*     */     //   61: istore #5
/*     */     //   63: iload #4
/*     */     //   65: iconst_2
/*     */     //   66: iand
/*     */     //   67: ifeq -> 80
/*     */     //   70: iload #5
/*     */     //   72: bipush #48
/*     */     //   74: ior
/*     */     //   75: istore #5
/*     */     //   77: goto -> 109
/*     */     //   80: iload_3
/*     */     //   81: bipush #48
/*     */     //   83: iand
/*     */     //   84: ifne -> 109
/*     */     //   87: iload #5
/*     */     //   89: aload_2
/*     */     //   90: aload_1
/*     */     //   91: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   96: ifeq -> 104
/*     */     //   99: bipush #32
/*     */     //   101: goto -> 106
/*     */     //   104: bipush #16
/*     */     //   106: ior
/*     */     //   107: istore #5
/*     */     //   109: iload #5
/*     */     //   111: bipush #19
/*     */     //   113: iand
/*     */     //   114: bipush #18
/*     */     //   116: if_icmpne -> 128
/*     */     //   119: aload_2
/*     */     //   120: invokeinterface getSkipping : ()Z
/*     */     //   125: ifne -> 221
/*     */     //   128: iload #4
/*     */     //   130: iconst_1
/*     */     //   131: iand
/*     */     //   132: ifeq -> 142
/*     */     //   135: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   138: checkcast androidx/compose/ui/Modifier
/*     */     //   141: astore_0
/*     */     //   142: invokestatic isTraceInProgress : ()Z
/*     */     //   145: ifeq -> 160
/*     */     //   148: ldc_w 1902084646
/*     */     //   151: iload #5
/*     */     //   153: iconst_m1
/*     */     //   154: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.components.RunCommandButton (Button.kt:136)'
/*     */     //   157: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   160: aload_2
/*     */     //   161: iconst_0
/*     */     //   162: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   165: invokevirtual getDoneButtonIcon : ()Lorg/jetbrains/jewel/ui/icon/PathIconKey;
/*     */     //   168: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*     */     //   171: ldc_w 'Run command'
/*     */     //   174: aload_0
/*     */     //   175: iconst_0
/*     */     //   176: aload_1
/*     */     //   177: aload_2
/*     */     //   178: bipush #48
/*     */     //   180: getstatic org/jetbrains/jewel/ui/icon/PathIconKey.$stable : I
/*     */     //   183: ior
/*     */     //   184: sipush #896
/*     */     //   187: iload #5
/*     */     //   189: bipush #6
/*     */     //   191: ishl
/*     */     //   192: iand
/*     */     //   193: ior
/*     */     //   194: ldc_w 57344
/*     */     //   197: iload #5
/*     */     //   199: bipush #9
/*     */     //   201: ishl
/*     */     //   202: iand
/*     */     //   203: ior
/*     */     //   204: bipush #8
/*     */     //   206: invokestatic Button : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*     */     //   209: invokestatic isTraceInProgress : ()Z
/*     */     //   212: ifeq -> 227
/*     */     //   215: invokestatic traceEventEnd : ()V
/*     */     //   218: goto -> 227
/*     */     //   221: aload_2
/*     */     //   222: invokeinterface skipToGroupEnd : ()V
/*     */     //   227: aload_2
/*     */     //   228: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   233: dup
/*     */     //   234: ifnull -> 255
/*     */     //   237: aload_0
/*     */     //   238: aload_1
/*     */     //   239: iload_3
/*     */     //   240: iload #4
/*     */     //   242: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;II)Lkotlin/jvm/functions/Function2;
/*     */     //   247: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   252: goto -> 256
/*     */     //   255: pop
/*     */     //   256: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #137	-> 6
/*     */     //   #135	-> 135
/*     */     //   #137	-> 157
/*     */     //   #138	-> 162
/*     */     //   #139	-> 221
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   19	238	5	$dirty	I
/*     */     //   0	257	0	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	257	1	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	257	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	257	3	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void SkipButton(@Nullable Modifier modifier, @NotNull Function0 onClick, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'onClick'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc_w 559147079
/*     */     //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   15: astore_2
/*     */     //   16: iload_3
/*     */     //   17: istore #5
/*     */     //   19: iload #4
/*     */     //   21: iconst_1
/*     */     //   22: iand
/*     */     //   23: ifeq -> 36
/*     */     //   26: iload #5
/*     */     //   28: bipush #6
/*     */     //   30: ior
/*     */     //   31: istore #5
/*     */     //   33: goto -> 63
/*     */     //   36: iload_3
/*     */     //   37: bipush #6
/*     */     //   39: iand
/*     */     //   40: ifne -> 63
/*     */     //   43: iload #5
/*     */     //   45: aload_2
/*     */     //   46: aload_0
/*     */     //   47: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   52: ifeq -> 59
/*     */     //   55: iconst_4
/*     */     //   56: goto -> 60
/*     */     //   59: iconst_2
/*     */     //   60: ior
/*     */     //   61: istore #5
/*     */     //   63: iload #4
/*     */     //   65: iconst_2
/*     */     //   66: iand
/*     */     //   67: ifeq -> 80
/*     */     //   70: iload #5
/*     */     //   72: bipush #48
/*     */     //   74: ior
/*     */     //   75: istore #5
/*     */     //   77: goto -> 109
/*     */     //   80: iload_3
/*     */     //   81: bipush #48
/*     */     //   83: iand
/*     */     //   84: ifne -> 109
/*     */     //   87: iload #5
/*     */     //   89: aload_2
/*     */     //   90: aload_1
/*     */     //   91: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   96: ifeq -> 104
/*     */     //   99: bipush #32
/*     */     //   101: goto -> 106
/*     */     //   104: bipush #16
/*     */     //   106: ior
/*     */     //   107: istore #5
/*     */     //   109: iload #5
/*     */     //   111: bipush #19
/*     */     //   113: iand
/*     */     //   114: bipush #18
/*     */     //   116: if_icmpne -> 128
/*     */     //   119: aload_2
/*     */     //   120: invokeinterface getSkipping : ()Z
/*     */     //   125: ifne -> 206
/*     */     //   128: iload #4
/*     */     //   130: iconst_1
/*     */     //   131: iand
/*     */     //   132: ifeq -> 142
/*     */     //   135: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   138: checkcast androidx/compose/ui/Modifier
/*     */     //   141: astore_0
/*     */     //   142: invokestatic isTraceInProgress : ()Z
/*     */     //   145: ifeq -> 160
/*     */     //   148: ldc_w 559147079
/*     */     //   151: iload #5
/*     */     //   153: iconst_m1
/*     */     //   154: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.components.SkipButton (Button.kt:144)'
/*     */     //   157: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   160: ldc_w 'Skip'
/*     */     //   163: aload_0
/*     */     //   164: iconst_0
/*     */     //   165: aload_1
/*     */     //   166: aconst_null
/*     */     //   167: aload_2
/*     */     //   168: sipush #390
/*     */     //   171: bipush #112
/*     */     //   173: iload #5
/*     */     //   175: iconst_3
/*     */     //   176: ishl
/*     */     //   177: iand
/*     */     //   178: ior
/*     */     //   179: sipush #7168
/*     */     //   182: iload #5
/*     */     //   184: bipush #6
/*     */     //   186: ishl
/*     */     //   187: iand
/*     */     //   188: ior
/*     */     //   189: bipush #16
/*     */     //   191: invokestatic Button : (Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   194: invokestatic isTraceInProgress : ()Z
/*     */     //   197: ifeq -> 212
/*     */     //   200: invokestatic traceEventEnd : ()V
/*     */     //   203: goto -> 212
/*     */     //   206: aload_2
/*     */     //   207: invokeinterface skipToGroupEnd : ()V
/*     */     //   212: aload_2
/*     */     //   213: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   218: dup
/*     */     //   219: ifnull -> 240
/*     */     //   222: aload_0
/*     */     //   223: aload_1
/*     */     //   224: iload_3
/*     */     //   225: iload #4
/*     */     //   227: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;II)Lkotlin/jvm/functions/Function2;
/*     */     //   232: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   237: goto -> 241
/*     */     //   240: pop
/*     */     //   241: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #145	-> 6
/*     */     //   #143	-> 135
/*     */     //   #145	-> 157
/*     */     //   #146	-> 160
/*     */     //   #147	-> 206
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   19	223	5	$dirty	I
/*     */     //   0	242	0	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	242	1	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	242	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	242	3	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void ApproveEditButton(@Nullable Modifier modifier, @NotNull Function0 onClick, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'onClick'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc_w -434663061
/*     */     //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   15: astore_2
/*     */     //   16: iload_3
/*     */     //   17: istore #5
/*     */     //   19: iload #4
/*     */     //   21: iconst_1
/*     */     //   22: iand
/*     */     //   23: ifeq -> 36
/*     */     //   26: iload #5
/*     */     //   28: bipush #6
/*     */     //   30: ior
/*     */     //   31: istore #5
/*     */     //   33: goto -> 63
/*     */     //   36: iload_3
/*     */     //   37: bipush #6
/*     */     //   39: iand
/*     */     //   40: ifne -> 63
/*     */     //   43: iload #5
/*     */     //   45: aload_2
/*     */     //   46: aload_0
/*     */     //   47: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   52: ifeq -> 59
/*     */     //   55: iconst_4
/*     */     //   56: goto -> 60
/*     */     //   59: iconst_2
/*     */     //   60: ior
/*     */     //   61: istore #5
/*     */     //   63: iload #4
/*     */     //   65: iconst_2
/*     */     //   66: iand
/*     */     //   67: ifeq -> 80
/*     */     //   70: iload #5
/*     */     //   72: bipush #48
/*     */     //   74: ior
/*     */     //   75: istore #5
/*     */     //   77: goto -> 109
/*     */     //   80: iload_3
/*     */     //   81: bipush #48
/*     */     //   83: iand
/*     */     //   84: ifne -> 109
/*     */     //   87: iload #5
/*     */     //   89: aload_2
/*     */     //   90: aload_1
/*     */     //   91: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   96: ifeq -> 104
/*     */     //   99: bipush #32
/*     */     //   101: goto -> 106
/*     */     //   104: bipush #16
/*     */     //   106: ior
/*     */     //   107: istore #5
/*     */     //   109: iload #5
/*     */     //   111: bipush #19
/*     */     //   113: iand
/*     */     //   114: bipush #18
/*     */     //   116: if_icmpne -> 128
/*     */     //   119: aload_2
/*     */     //   120: invokeinterface getSkipping : ()Z
/*     */     //   125: ifne -> 206
/*     */     //   128: iload #4
/*     */     //   130: iconst_1
/*     */     //   131: iand
/*     */     //   132: ifeq -> 142
/*     */     //   135: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   138: checkcast androidx/compose/ui/Modifier
/*     */     //   141: astore_0
/*     */     //   142: invokestatic isTraceInProgress : ()Z
/*     */     //   145: ifeq -> 160
/*     */     //   148: ldc_w -434663061
/*     */     //   151: iload #5
/*     */     //   153: iconst_m1
/*     */     //   154: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.components.ApproveEditButton (Button.kt:152)'
/*     */     //   157: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   160: ldc_w 'Approve'
/*     */     //   163: aload_0
/*     */     //   164: iconst_1
/*     */     //   165: aload_1
/*     */     //   166: aconst_null
/*     */     //   167: aload_2
/*     */     //   168: sipush #390
/*     */     //   171: bipush #112
/*     */     //   173: iload #5
/*     */     //   175: iconst_3
/*     */     //   176: ishl
/*     */     //   177: iand
/*     */     //   178: ior
/*     */     //   179: sipush #7168
/*     */     //   182: iload #5
/*     */     //   184: bipush #6
/*     */     //   186: ishl
/*     */     //   187: iand
/*     */     //   188: ior
/*     */     //   189: bipush #16
/*     */     //   191: invokestatic Button : (Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   194: invokestatic isTraceInProgress : ()Z
/*     */     //   197: ifeq -> 212
/*     */     //   200: invokestatic traceEventEnd : ()V
/*     */     //   203: goto -> 212
/*     */     //   206: aload_2
/*     */     //   207: invokeinterface skipToGroupEnd : ()V
/*     */     //   212: aload_2
/*     */     //   213: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   218: dup
/*     */     //   219: ifnull -> 240
/*     */     //   222: aload_0
/*     */     //   223: aload_1
/*     */     //   224: iload_3
/*     */     //   225: iload #4
/*     */     //   227: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;II)Lkotlin/jvm/functions/Function2;
/*     */     //   232: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   237: goto -> 241
/*     */     //   240: pop
/*     */     //   241: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #153	-> 6
/*     */     //   #151	-> 135
/*     */     //   #153	-> 157
/*     */     //   #154	-> 160
/*     */     //   #155	-> 206
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   19	223	5	$dirty	I
/*     */     //   0	242	0	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	242	1	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	242	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	242	3	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void DeclineEditButton(@Nullable Modifier modifier, @NotNull Function0 onClick, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'onClick'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc_w -1132347550
/*     */     //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   15: astore_2
/*     */     //   16: iload_3
/*     */     //   17: istore #5
/*     */     //   19: iload #4
/*     */     //   21: iconst_1
/*     */     //   22: iand
/*     */     //   23: ifeq -> 36
/*     */     //   26: iload #5
/*     */     //   28: bipush #6
/*     */     //   30: ior
/*     */     //   31: istore #5
/*     */     //   33: goto -> 63
/*     */     //   36: iload_3
/*     */     //   37: bipush #6
/*     */     //   39: iand
/*     */     //   40: ifne -> 63
/*     */     //   43: iload #5
/*     */     //   45: aload_2
/*     */     //   46: aload_0
/*     */     //   47: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   52: ifeq -> 59
/*     */     //   55: iconst_4
/*     */     //   56: goto -> 60
/*     */     //   59: iconst_2
/*     */     //   60: ior
/*     */     //   61: istore #5
/*     */     //   63: iload #4
/*     */     //   65: iconst_2
/*     */     //   66: iand
/*     */     //   67: ifeq -> 80
/*     */     //   70: iload #5
/*     */     //   72: bipush #48
/*     */     //   74: ior
/*     */     //   75: istore #5
/*     */     //   77: goto -> 109
/*     */     //   80: iload_3
/*     */     //   81: bipush #48
/*     */     //   83: iand
/*     */     //   84: ifne -> 109
/*     */     //   87: iload #5
/*     */     //   89: aload_2
/*     */     //   90: aload_1
/*     */     //   91: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   96: ifeq -> 104
/*     */     //   99: bipush #32
/*     */     //   101: goto -> 106
/*     */     //   104: bipush #16
/*     */     //   106: ior
/*     */     //   107: istore #5
/*     */     //   109: iload #5
/*     */     //   111: bipush #19
/*     */     //   113: iand
/*     */     //   114: bipush #18
/*     */     //   116: if_icmpne -> 128
/*     */     //   119: aload_2
/*     */     //   120: invokeinterface getSkipping : ()Z
/*     */     //   125: ifne -> 206
/*     */     //   128: iload #4
/*     */     //   130: iconst_1
/*     */     //   131: iand
/*     */     //   132: ifeq -> 142
/*     */     //   135: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   138: checkcast androidx/compose/ui/Modifier
/*     */     //   141: astore_0
/*     */     //   142: invokestatic isTraceInProgress : ()Z
/*     */     //   145: ifeq -> 160
/*     */     //   148: ldc_w -1132347550
/*     */     //   151: iload #5
/*     */     //   153: iconst_m1
/*     */     //   154: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.components.DeclineEditButton (Button.kt:160)'
/*     */     //   157: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   160: ldc_w 'Decline'
/*     */     //   163: aload_0
/*     */     //   164: iconst_0
/*     */     //   165: aload_1
/*     */     //   166: aconst_null
/*     */     //   167: aload_2
/*     */     //   168: sipush #390
/*     */     //   171: bipush #112
/*     */     //   173: iload #5
/*     */     //   175: iconst_3
/*     */     //   176: ishl
/*     */     //   177: iand
/*     */     //   178: ior
/*     */     //   179: sipush #7168
/*     */     //   182: iload #5
/*     */     //   184: bipush #6
/*     */     //   186: ishl
/*     */     //   187: iand
/*     */     //   188: ior
/*     */     //   189: bipush #16
/*     */     //   191: invokestatic Button : (Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   194: invokestatic isTraceInProgress : ()Z
/*     */     //   197: ifeq -> 212
/*     */     //   200: invokestatic traceEventEnd : ()V
/*     */     //   203: goto -> 212
/*     */     //   206: aload_2
/*     */     //   207: invokeinterface skipToGroupEnd : ()V
/*     */     //   212: aload_2
/*     */     //   213: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   218: dup
/*     */     //   219: ifnull -> 240
/*     */     //   222: aload_0
/*     */     //   223: aload_1
/*     */     //   224: iload_3
/*     */     //   225: iload #4
/*     */     //   227: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;II)Lkotlin/jvm/functions/Function2;
/*     */     //   232: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   237: goto -> 241
/*     */     //   240: pop
/*     */     //   241: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #161	-> 6
/*     */     //   #159	-> 135
/*     */     //   #161	-> 157
/*     */     //   #162	-> 160
/*     */     //   #163	-> 206
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   19	223	5	$dirty	I
/*     */     //   0	242	0	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	242	1	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	242	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	242	3	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   public static final void Button(@NotNull String text, @Nullable Modifier modifier, boolean primary, @NotNull Function0 onClick, @Nullable Function3 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'text'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_3
/*     */     //   8: ldc 'onClick'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload #5
/*     */     //   15: ldc_w 953142317
/*     */     //   18: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   23: astore #5
/*     */     //   25: iload #6
/*     */     //   27: istore #8
/*     */     //   29: iload #7
/*     */     //   31: iconst_1
/*     */     //   32: iand
/*     */     //   33: ifeq -> 46
/*     */     //   36: iload #8
/*     */     //   38: bipush #6
/*     */     //   40: ior
/*     */     //   41: istore #8
/*     */     //   43: goto -> 75
/*     */     //   46: iload #6
/*     */     //   48: bipush #6
/*     */     //   50: iand
/*     */     //   51: ifne -> 75
/*     */     //   54: iload #8
/*     */     //   56: aload #5
/*     */     //   58: aload_0
/*     */     //   59: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   64: ifeq -> 71
/*     */     //   67: iconst_4
/*     */     //   68: goto -> 72
/*     */     //   71: iconst_2
/*     */     //   72: ior
/*     */     //   73: istore #8
/*     */     //   75: iload #7
/*     */     //   77: iconst_2
/*     */     //   78: iand
/*     */     //   79: ifeq -> 92
/*     */     //   82: iload #8
/*     */     //   84: bipush #48
/*     */     //   86: ior
/*     */     //   87: istore #8
/*     */     //   89: goto -> 123
/*     */     //   92: iload #6
/*     */     //   94: bipush #48
/*     */     //   96: iand
/*     */     //   97: ifne -> 123
/*     */     //   100: iload #8
/*     */     //   102: aload #5
/*     */     //   104: aload_1
/*     */     //   105: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   110: ifeq -> 118
/*     */     //   113: bipush #32
/*     */     //   115: goto -> 120
/*     */     //   118: bipush #16
/*     */     //   120: ior
/*     */     //   121: istore #8
/*     */     //   123: iload #7
/*     */     //   125: iconst_4
/*     */     //   126: iand
/*     */     //   127: ifeq -> 141
/*     */     //   130: iload #8
/*     */     //   132: sipush #384
/*     */     //   135: ior
/*     */     //   136: istore #8
/*     */     //   138: goto -> 175
/*     */     //   141: iload #6
/*     */     //   143: sipush #384
/*     */     //   146: iand
/*     */     //   147: ifne -> 175
/*     */     //   150: iload #8
/*     */     //   152: aload #5
/*     */     //   154: iload_2
/*     */     //   155: invokeinterface changed : (Z)Z
/*     */     //   160: ifeq -> 169
/*     */     //   163: sipush #256
/*     */     //   166: goto -> 172
/*     */     //   169: sipush #128
/*     */     //   172: ior
/*     */     //   173: istore #8
/*     */     //   175: iload #7
/*     */     //   177: bipush #8
/*     */     //   179: iand
/*     */     //   180: ifeq -> 194
/*     */     //   183: iload #8
/*     */     //   185: sipush #3072
/*     */     //   188: ior
/*     */     //   189: istore #8
/*     */     //   191: goto -> 228
/*     */     //   194: iload #6
/*     */     //   196: sipush #3072
/*     */     //   199: iand
/*     */     //   200: ifne -> 228
/*     */     //   203: iload #8
/*     */     //   205: aload #5
/*     */     //   207: aload_3
/*     */     //   208: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   213: ifeq -> 222
/*     */     //   216: sipush #2048
/*     */     //   219: goto -> 225
/*     */     //   222: sipush #1024
/*     */     //   225: ior
/*     */     //   226: istore #8
/*     */     //   228: iload #7
/*     */     //   230: bipush #16
/*     */     //   232: iand
/*     */     //   233: ifeq -> 247
/*     */     //   236: iload #8
/*     */     //   238: sipush #24576
/*     */     //   241: ior
/*     */     //   242: istore #8
/*     */     //   244: goto -> 282
/*     */     //   247: iload #6
/*     */     //   249: sipush #24576
/*     */     //   252: iand
/*     */     //   253: ifne -> 282
/*     */     //   256: iload #8
/*     */     //   258: aload #5
/*     */     //   260: aload #4
/*     */     //   262: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   267: ifeq -> 276
/*     */     //   270: sipush #16384
/*     */     //   273: goto -> 279
/*     */     //   276: sipush #8192
/*     */     //   279: ior
/*     */     //   280: istore #8
/*     */     //   282: iload #8
/*     */     //   284: sipush #9363
/*     */     //   287: iand
/*     */     //   288: sipush #9362
/*     */     //   291: if_icmpne -> 304
/*     */     //   294: aload #5
/*     */     //   296: invokeinterface getSkipping : ()Z
/*     */     //   301: ifne -> 447
/*     */     //   304: iload #7
/*     */     //   306: iconst_2
/*     */     //   307: iand
/*     */     //   308: ifeq -> 318
/*     */     //   311: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   314: checkcast androidx/compose/ui/Modifier
/*     */     //   317: astore_1
/*     */     //   318: iload #7
/*     */     //   320: iconst_4
/*     */     //   321: iand
/*     */     //   322: ifeq -> 327
/*     */     //   325: iconst_1
/*     */     //   326: istore_2
/*     */     //   327: iload #7
/*     */     //   329: bipush #16
/*     */     //   331: iand
/*     */     //   332: ifeq -> 338
/*     */     //   335: aconst_null
/*     */     //   336: astore #4
/*     */     //   338: invokestatic isTraceInProgress : ()Z
/*     */     //   341: ifeq -> 356
/*     */     //   344: ldc_w 953142317
/*     */     //   347: iload #8
/*     */     //   349: iconst_m1
/*     */     //   350: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.components.Button (Button.kt:171)'
/*     */     //   353: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   356: aload_3
/*     */     //   357: aload_1
/*     */     //   358: iconst_0
/*     */     //   359: aconst_null
/*     */     //   360: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   363: aload #5
/*     */     //   365: bipush #6
/*     */     //   367: invokestatic getDefaultButtonStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;
/*     */     //   370: aconst_null
/*     */     //   371: iload_2
/*     */     //   372: aload #5
/*     */     //   374: sipush #896
/*     */     //   377: iload #8
/*     */     //   379: iand
/*     */     //   380: iconst_1
/*     */     //   381: invokestatic withRoundedCornerShape : (Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;Landroidx/compose/foundation/shape/CornerSize;ZLandroidx/compose/runtime/Composer;II)Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;
/*     */     //   384: aconst_null
/*     */     //   385: ldc_w 1313103155
/*     */     //   388: iconst_1
/*     */     //   389: new com/intellij/ml/llm/matterhorn/ej/ui/components/ButtonKt$Button$3
/*     */     //   392: dup
/*     */     //   393: aload #4
/*     */     //   395: iload_2
/*     */     //   396: aload_0
/*     */     //   397: invokespecial <init> : (Lkotlin/jvm/functions/Function3;ZLjava/lang/String;)V
/*     */     //   400: aload #5
/*     */     //   402: bipush #54
/*     */     //   404: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   407: checkcast kotlin/jvm/functions/Function3
/*     */     //   410: aload #5
/*     */     //   412: ldc_w 1572864
/*     */     //   415: bipush #14
/*     */     //   417: iload #8
/*     */     //   419: bipush #9
/*     */     //   421: ishr
/*     */     //   422: iand
/*     */     //   423: ior
/*     */     //   424: bipush #112
/*     */     //   426: iload #8
/*     */     //   428: iand
/*     */     //   429: ior
/*     */     //   430: bipush #44
/*     */     //   432: invokestatic DefaultButton : (Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   435: invokestatic isTraceInProgress : ()Z
/*     */     //   438: ifeq -> 454
/*     */     //   441: invokestatic traceEventEnd : ()V
/*     */     //   444: goto -> 454
/*     */     //   447: aload #5
/*     */     //   449: invokeinterface skipToGroupEnd : ()V
/*     */     //   454: aload #5
/*     */     //   456: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   461: dup
/*     */     //   462: ifnull -> 488
/*     */     //   465: aload_0
/*     */     //   466: aload_1
/*     */     //   467: iload_2
/*     */     //   468: aload_3
/*     */     //   469: aload #4
/*     */     //   471: iload #6
/*     */     //   473: iload #7
/*     */     //   475: <illegal opcode> invoke : (Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;II)Lkotlin/jvm/functions/Function2;
/*     */     //   480: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   485: goto -> 489
/*     */     //   488: pop
/*     */     //   489: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #172	-> 13
/*     */     //   #168	-> 311
/*     */     //   #169	-> 325
/*     */     //   #171	-> 335
/*     */     //   #172	-> 353
/*     */     //   #174	-> 356
/*     */     //   #175	-> 357
/*     */     //   #176	-> 360
/*     */     //   #177	-> 385
/*     */     //   #173	-> 432
/*     */     //   #189	-> 447
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   29	461	8	$dirty	I
/*     */     //   0	490	0	text	Ljava/lang/String;
/*     */     //   0	490	1	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	490	2	primary	Z
/*     */     //   0	490	3	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	490	4	content	Lkotlin/jvm/functions/Function3;
/*     */     //   0	490	5	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	490	6	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit Button$lambda$0(IconKey $icon, String $name, Modifier $modifier, boolean $primary, Function0<Unit> $onClick, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     Button($icon, $name, $modifier, $primary, $onClick, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit DialogButton$lambda$1(String $text, Modifier $modifier, boolean $primary, Function0<Unit> $onClick, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     DialogButton($text, $modifier, $primary, $onClick, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit StopButton$lambda$2(Modifier $modifier, String $name, Function0<Unit> $onClick, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     StopButton($modifier, $name, $onClick, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit DoneButton$lambda$3(Modifier $modifier, String $name, Function0<Unit> $onClick, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     DoneButton($modifier, $name, $onClick, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit RestartButton$lambda$4(Modifier $modifier, String $name, Function0<Unit> $onClick, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     RestartButton($modifier, $name, $onClick, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit RunCommandButton$lambda$5(Modifier $modifier, Function0<Unit> $onClick, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     RunCommandButton($modifier, $onClick, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit SkipButton$lambda$6(Modifier $modifier, Function0<Unit> $onClick, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     SkipButton($modifier, $onClick, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit ApproveEditButton$lambda$7(Modifier $modifier, Function0<Unit> $onClick, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     ApproveEditButton($modifier, $onClick, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit DeclineEditButton$lambda$8(Modifier $modifier, Function0<Unit> $onClick, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     DeclineEditButton($modifier, $onClick, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit Button$lambda$9(String $text, Modifier $modifier, boolean $primary, Function0<Unit> $onClick, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     Button($text, $modifier, $primary, $onClick, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ButtonKt$Button$3 implements Function3<RowScope, Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(RowScope $this$DefaultButton, Composer $composer, int $changed) {
/*     */       Intrinsics.checkNotNullParameter($this$DefaultButton, "$this$DefaultButton");
/*     */       int $dirty = $changed;
/*     */       if (($changed & 0x6) == 0)
/*     */         $dirty |= $composer.changed($this$DefaultButton) ? 4 : 2; 
/*     */       if (($dirty & 0x13) != 18 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(1313103155, $dirty, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.Button.<anonymous> (Button.kt:177)"); 
/*     */         $composer.startReplaceGroup(433197952);
/*     */         if (this.$content != null)
/*     */           this.$content.invoke($this$DefaultButton, $composer, Integer.valueOf(0xE & $dirty)); 
/*     */         $composer.endReplaceGroup();
/*     */         int i = TextOverflow.Companion.getEllipsis-gIe3tQ8();
/*     */         long l = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getButtonTextColor-vNxB06k(this.$primary);
/*     */         TextKt.Text-bAzTDeA(this.$text, null, l, 0L, null, null, null, 0L, null, 0, 0L, i, false, 1, null, null, $composer, 0, 3120, 55290);
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd(); 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */     
/*     */     ButtonKt$Button$3(Function3<RowScope, Composer, Integer, Unit> $content, boolean $primary, String $text) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\ButtonKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */