/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.TooltipPlacement;
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.ColorFilter;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function4;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.jvm.internal.SpreadBuilder;
/*     */ import kotlin.reflect.KProperty;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.component.styling.IconButtonStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.TooltipStyle;
/*     */ import org.jetbrains.jewel.ui.icon.IconKey;
/*     */ import org.jetbrains.jewel.ui.painter.PainterHint;
/*     */ import org.jetbrains.jewel.ui.painter.hints.DarkAndStrokeKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000j\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\021\n\002\b\b\n\002\030\002\032\001\020\000\032\0020\0012\006\020\002\032\0020\0032\b\020\004\032\004\030\0010\0052\006\020\006\032\0020\0072\f\020\b\032\b\022\004\022\0020\0010\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\0072\b\b\002\020\r\032\0020\0072\b\b\002\020\016\032\0020\0172\n\b\002\020\020\032\004\030\0010\0212\n\b\002\020\022\032\004\030\0010\0232\b\b\002\020\024\032\0020\0252\f\b\002\020\026\032\006\022\002\b\0030\027H\007¢\006\002\020\030\032¾\001\020\000\032\0020\0012\006\020\002\032\0020\0032\b\020\004\032\004\030\0010\0052\006\020\006\032\0020\0072\f\020\b\032\b\022\004\022\0020\0010\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\0072\b\b\002\020\r\032\0020\0072\b\b\002\020\016\032\0020\0172\n\b\002\020\020\032\004\030\0010\0212\n\b\002\020\022\032\004\030\0010\0232\b\b\002\020\031\032\0020\0322\b\b\002\020\033\032\0020\0132\b\b\002\020\034\032\0020\0352\b\b\002\020\024\032\0020\0252\f\b\002\020\026\032\006\022\002\b\0030\0272\021\020\036\032\r\022\004\022\0020\0010\t¢\006\002\b\037H\007¢\006\002\020 \032\001\020\000\032\0020\0012\006\020\002\032\0020\0032\b\020\004\032\004\030\0010\0052\006\020\006\032\0020\0072\f\020!\032\b\022\004\022\0020\0230\"2\f\020\b\032\b\022\004\022\0020\0010\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\0072\b\b\002\020\r\032\0020\0072\b\b\002\020\016\032\0020\0172\n\b\002\020\020\032\004\030\0010\0212\b\b\002\020\024\032\0020\0252\f\b\002\020\026\032\006\022\002\b\0030\027H\007¢\006\002\020#\032À\001\020\000\032\0020\0012\006\020\002\032\0020\0032\b\020\004\032\004\030\0010\0052\006\020\006\032\0020\0072\f\020!\032\b\022\004\022\0020\0230\"2\f\020\b\032\b\022\004\022\0020\0010\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\0072\b\b\002\020\r\032\0020\0072\b\b\002\020\016\032\0020\0172\n\b\002\020\020\032\004\030\0010\0212\b\b\002\020\031\032\0020\0322\b\b\002\020\033\032\0020\0132\b\b\002\020\034\032\0020\0352\b\b\002\020\024\032\0020\0252\f\b\002\020\026\032\006\022\002\b\0030\0272\021\020\036\032\r\022\004\022\0020\0010\t¢\006\002\b\037H\007¢\006\002\020$\032}\020%\032\0020\0012\006\020\002\032\0020\0032\b\020\004\032\004\030\0010\0052\n\020\026\032\006\022\002\b\0030\0272\006\020\006\032\0020\0072\006\020\f\032\0020\0072\006\020\r\032\0020\0072\006\020\016\032\0020\0172\006\020\024\032\0020\0252\006\020\n\032\0020\0132\b\020\020\032\004\030\0010\0212\b\020\022\032\004\030\0010\0232\f\020\b\032\b\022\004\022\0020\0010\tH\003¢\006\002\020&\032{\020'\032\0020\0012\006\020\002\032\0020\0032\b\020\004\032\004\030\0010\0052\n\020\026\032\006\022\002\b\0030\0272\006\020\006\032\0020\0072\006\020\f\032\0020\0072\006\020\r\032\0020\0072\006\020\016\032\0020\0172\006\020\024\032\0020\0252\006\020\n\032\0020\0132\b\020\020\032\004\030\0010\0212\006\020\022\032\0020\0232\f\020\b\032\b\022\004\022\0020\0010\tH\003¢\006\002\020&\032\001\020'\032\0020\0012\006\020\002\032\0020\0032\b\020\004\032\004\030\0010\0052\n\020\026\032\006\022\002\b\0030\0272\006\020\006\032\0020\0072\006\020\f\032\0020\0072\006\020\r\032\0020\0072\006\020\016\032\0020\0172\006\020\024\032\0020\0252\006\020\n\032\0020\0132\b\020\020\032\004\030\0010\0212\f\020!\032\b\022\004\022\0020\0230\"2\f\020\b\032\b\022\004\022\0020\0010\tH\003¢\006\002\020(¨\006)²\006\n\020*\032\0020+X\002²\006\n\020*\032\0020+X\002"}, d2 = {"SelectableIconActionButton", "", "key", "Lorg/jetbrains/jewel/ui/icon/IconKey;", "contentDescription", "", "selected", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "focusable", "style", "Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "extraHint", "Lorg/jetbrains/jewel/ui/painter/PainterHint;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "iconClass", "Ljava/lang/Class;", "(Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/foundation/interaction/MutableInteractionSource;Ljava/lang/Class;Landroidx/compose/runtime/Composer;III)V", "tooltipStyle", "Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;", "tooltipModifier", "tooltipPlacement", "Landroidx/compose/foundation/TooltipPlacement;", "tooltip", "Landroidx/compose/runtime/Composable;", "(Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/painter/PainterHint;Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/TooltipPlacement;Landroidx/compose/foundation/interaction/MutableInteractionSource;Ljava/lang/Class;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "extraHints", "", "(Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Z[Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/foundation/interaction/MutableInteractionSource;Ljava/lang/Class;Landroidx/compose/runtime/Composer;III)V", "(Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Z[Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/TooltipPlacement;Landroidx/compose/foundation/interaction/MutableInteractionSource;Ljava/lang/Class;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "BaseSelectableIconActionButton", "(Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Ljava/lang/Class;ZZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "CoreSelectableIconActionButton", "(Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Ljava/lang/Class;ZZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorFilter;[Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ui", "strokeColor", "Landroidx/compose/ui/graphics/Color;"})
/*     */ @SourceDebugExtension({"SMAP\nSelectableIconActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectableIconActionButton.kt\norg/jetbrains/jewel/ui/component/SelectableIconActionButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,258:1\n1225#2,6:259\n1225#2,6:266\n1225#2,6:272\n1225#2,6:279\n149#3:265\n149#3:278\n*S KotlinDebug\n*F\n+ 1 SelectableIconActionButton.kt\norg/jetbrains/jewel/ui/component/SelectableIconActionButtonKt\n*L\n33#1:259,6\n67#1:266,6\n101#1:272,6\n135#1:279,6\n66#1:265\n134#1:278\n*E\n"})
/*     */ public final class SelectableIconActionButtonKt
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void SelectableIconActionButton(@NotNull IconKey key, @Nullable String contentDescription, boolean selected, @NotNull Function0 onClick, @Nullable Modifier modifier, boolean enabled, boolean focusable, @Nullable IconButtonStyle style, @Nullable ColorFilter colorFilter, @Nullable PainterHint extraHint, @Nullable MutableInteractionSource interactionSource, @Nullable Class iconClass, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'key'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_3
/*     */     //   7: ldc 'onClick'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload #12
/*     */     //   14: ldc 1817127092
/*     */     //   16: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   21: astore #12
/*     */     //   23: iload #13
/*     */     //   25: istore #16
/*     */     //   27: iload #14
/*     */     //   29: istore #17
/*     */     //   31: iload #15
/*     */     //   33: iconst_1
/*     */     //   34: iand
/*     */     //   35: ifeq -> 48
/*     */     //   38: iload #16
/*     */     //   40: bipush #6
/*     */     //   42: ior
/*     */     //   43: istore #16
/*     */     //   45: goto -> 96
/*     */     //   48: iload #13
/*     */     //   50: bipush #6
/*     */     //   52: iand
/*     */     //   53: ifne -> 96
/*     */     //   56: iload #16
/*     */     //   58: iload #13
/*     */     //   60: bipush #8
/*     */     //   62: iand
/*     */     //   63: ifne -> 77
/*     */     //   66: aload #12
/*     */     //   68: aload_0
/*     */     //   69: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   74: goto -> 85
/*     */     //   77: aload #12
/*     */     //   79: aload_0
/*     */     //   80: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   85: ifeq -> 92
/*     */     //   88: iconst_4
/*     */     //   89: goto -> 93
/*     */     //   92: iconst_2
/*     */     //   93: ior
/*     */     //   94: istore #16
/*     */     //   96: iload #15
/*     */     //   98: iconst_2
/*     */     //   99: iand
/*     */     //   100: ifeq -> 113
/*     */     //   103: iload #16
/*     */     //   105: bipush #48
/*     */     //   107: ior
/*     */     //   108: istore #16
/*     */     //   110: goto -> 144
/*     */     //   113: iload #13
/*     */     //   115: bipush #48
/*     */     //   117: iand
/*     */     //   118: ifne -> 144
/*     */     //   121: iload #16
/*     */     //   123: aload #12
/*     */     //   125: aload_1
/*     */     //   126: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   131: ifeq -> 139
/*     */     //   134: bipush #32
/*     */     //   136: goto -> 141
/*     */     //   139: bipush #16
/*     */     //   141: ior
/*     */     //   142: istore #16
/*     */     //   144: iload #15
/*     */     //   146: iconst_4
/*     */     //   147: iand
/*     */     //   148: ifeq -> 162
/*     */     //   151: iload #16
/*     */     //   153: sipush #384
/*     */     //   156: ior
/*     */     //   157: istore #16
/*     */     //   159: goto -> 196
/*     */     //   162: iload #13
/*     */     //   164: sipush #384
/*     */     //   167: iand
/*     */     //   168: ifne -> 196
/*     */     //   171: iload #16
/*     */     //   173: aload #12
/*     */     //   175: iload_2
/*     */     //   176: invokeinterface changed : (Z)Z
/*     */     //   181: ifeq -> 190
/*     */     //   184: sipush #256
/*     */     //   187: goto -> 193
/*     */     //   190: sipush #128
/*     */     //   193: ior
/*     */     //   194: istore #16
/*     */     //   196: iload #15
/*     */     //   198: bipush #8
/*     */     //   200: iand
/*     */     //   201: ifeq -> 215
/*     */     //   204: iload #16
/*     */     //   206: sipush #3072
/*     */     //   209: ior
/*     */     //   210: istore #16
/*     */     //   212: goto -> 249
/*     */     //   215: iload #13
/*     */     //   217: sipush #3072
/*     */     //   220: iand
/*     */     //   221: ifne -> 249
/*     */     //   224: iload #16
/*     */     //   226: aload #12
/*     */     //   228: aload_3
/*     */     //   229: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   234: ifeq -> 243
/*     */     //   237: sipush #2048
/*     */     //   240: goto -> 246
/*     */     //   243: sipush #1024
/*     */     //   246: ior
/*     */     //   247: istore #16
/*     */     //   249: iload #15
/*     */     //   251: bipush #16
/*     */     //   253: iand
/*     */     //   254: ifeq -> 268
/*     */     //   257: iload #16
/*     */     //   259: sipush #24576
/*     */     //   262: ior
/*     */     //   263: istore #16
/*     */     //   265: goto -> 303
/*     */     //   268: iload #13
/*     */     //   270: sipush #24576
/*     */     //   273: iand
/*     */     //   274: ifne -> 303
/*     */     //   277: iload #16
/*     */     //   279: aload #12
/*     */     //   281: aload #4
/*     */     //   283: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   288: ifeq -> 297
/*     */     //   291: sipush #16384
/*     */     //   294: goto -> 300
/*     */     //   297: sipush #8192
/*     */     //   300: ior
/*     */     //   301: istore #16
/*     */     //   303: iload #15
/*     */     //   305: bipush #32
/*     */     //   307: iand
/*     */     //   308: ifeq -> 321
/*     */     //   311: iload #16
/*     */     //   313: ldc 196608
/*     */     //   315: ior
/*     */     //   316: istore #16
/*     */     //   318: goto -> 353
/*     */     //   321: iload #13
/*     */     //   323: ldc 196608
/*     */     //   325: iand
/*     */     //   326: ifne -> 353
/*     */     //   329: iload #16
/*     */     //   331: aload #12
/*     */     //   333: iload #5
/*     */     //   335: invokeinterface changed : (Z)Z
/*     */     //   340: ifeq -> 348
/*     */     //   343: ldc 131072
/*     */     //   345: goto -> 350
/*     */     //   348: ldc 65536
/*     */     //   350: ior
/*     */     //   351: istore #16
/*     */     //   353: iload #15
/*     */     //   355: bipush #64
/*     */     //   357: iand
/*     */     //   358: ifeq -> 371
/*     */     //   361: iload #16
/*     */     //   363: ldc 1572864
/*     */     //   365: ior
/*     */     //   366: istore #16
/*     */     //   368: goto -> 403
/*     */     //   371: iload #13
/*     */     //   373: ldc 1572864
/*     */     //   375: iand
/*     */     //   376: ifne -> 403
/*     */     //   379: iload #16
/*     */     //   381: aload #12
/*     */     //   383: iload #6
/*     */     //   385: invokeinterface changed : (Z)Z
/*     */     //   390: ifeq -> 398
/*     */     //   393: ldc 1048576
/*     */     //   395: goto -> 400
/*     */     //   398: ldc 524288
/*     */     //   400: ior
/*     */     //   401: istore #16
/*     */     //   403: iload #13
/*     */     //   405: ldc 12582912
/*     */     //   407: iand
/*     */     //   408: ifne -> 444
/*     */     //   411: iload #16
/*     */     //   413: iload #15
/*     */     //   415: sipush #128
/*     */     //   418: iand
/*     */     //   419: ifne -> 439
/*     */     //   422: aload #12
/*     */     //   424: aload #7
/*     */     //   426: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   431: ifeq -> 439
/*     */     //   434: ldc 8388608
/*     */     //   436: goto -> 441
/*     */     //   439: ldc 4194304
/*     */     //   441: ior
/*     */     //   442: istore #16
/*     */     //   444: iload #15
/*     */     //   446: sipush #256
/*     */     //   449: iand
/*     */     //   450: ifeq -> 463
/*     */     //   453: iload #16
/*     */     //   455: ldc 100663296
/*     */     //   457: ior
/*     */     //   458: istore #16
/*     */     //   460: goto -> 495
/*     */     //   463: iload #13
/*     */     //   465: ldc 100663296
/*     */     //   467: iand
/*     */     //   468: ifne -> 495
/*     */     //   471: iload #16
/*     */     //   473: aload #12
/*     */     //   475: aload #8
/*     */     //   477: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   482: ifeq -> 490
/*     */     //   485: ldc 67108864
/*     */     //   487: goto -> 492
/*     */     //   490: ldc 33554432
/*     */     //   492: ior
/*     */     //   493: istore #16
/*     */     //   495: iload #15
/*     */     //   497: sipush #512
/*     */     //   500: iand
/*     */     //   501: ifeq -> 514
/*     */     //   504: iload #16
/*     */     //   506: ldc 805306368
/*     */     //   508: ior
/*     */     //   509: istore #16
/*     */     //   511: goto -> 546
/*     */     //   514: iload #13
/*     */     //   516: ldc 805306368
/*     */     //   518: iand
/*     */     //   519: ifne -> 546
/*     */     //   522: iload #16
/*     */     //   524: aload #12
/*     */     //   526: aload #9
/*     */     //   528: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   533: ifeq -> 541
/*     */     //   536: ldc 536870912
/*     */     //   538: goto -> 543
/*     */     //   541: ldc 268435456
/*     */     //   543: ior
/*     */     //   544: istore #16
/*     */     //   546: iload #15
/*     */     //   548: sipush #1024
/*     */     //   551: iand
/*     */     //   552: ifeq -> 565
/*     */     //   555: iload #17
/*     */     //   557: bipush #6
/*     */     //   559: ior
/*     */     //   560: istore #17
/*     */     //   562: goto -> 595
/*     */     //   565: iload #14
/*     */     //   567: bipush #6
/*     */     //   569: iand
/*     */     //   570: ifne -> 595
/*     */     //   573: iload #17
/*     */     //   575: aload #12
/*     */     //   577: aload #10
/*     */     //   579: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   584: ifeq -> 591
/*     */     //   587: iconst_4
/*     */     //   588: goto -> 592
/*     */     //   591: iconst_2
/*     */     //   592: ior
/*     */     //   593: istore #17
/*     */     //   595: iload #14
/*     */     //   597: bipush #48
/*     */     //   599: iand
/*     */     //   600: ifne -> 636
/*     */     //   603: iload #17
/*     */     //   605: iload #15
/*     */     //   607: sipush #2048
/*     */     //   610: iand
/*     */     //   611: ifne -> 631
/*     */     //   614: aload #12
/*     */     //   616: aload #11
/*     */     //   618: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   623: ifeq -> 631
/*     */     //   626: bipush #32
/*     */     //   628: goto -> 633
/*     */     //   631: bipush #16
/*     */     //   633: ior
/*     */     //   634: istore #17
/*     */     //   636: iload #16
/*     */     //   638: ldc 306783379
/*     */     //   640: iand
/*     */     //   641: ldc 306783378
/*     */     //   643: if_icmpne -> 666
/*     */     //   646: iload #17
/*     */     //   648: bipush #19
/*     */     //   650: iand
/*     */     //   651: bipush #18
/*     */     //   653: if_icmpne -> 666
/*     */     //   656: aload #12
/*     */     //   658: invokeinterface getSkipping : ()Z
/*     */     //   663: ifne -> 1095
/*     */     //   666: aload #12
/*     */     //   668: invokeinterface startDefaults : ()V
/*     */     //   673: iload #13
/*     */     //   675: iconst_1
/*     */     //   676: iand
/*     */     //   677: ifeq -> 690
/*     */     //   680: aload #12
/*     */     //   682: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   687: ifeq -> 899
/*     */     //   690: iload #15
/*     */     //   692: bipush #16
/*     */     //   694: iand
/*     */     //   695: ifeq -> 706
/*     */     //   698: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   701: checkcast androidx/compose/ui/Modifier
/*     */     //   704: astore #4
/*     */     //   706: iload #15
/*     */     //   708: bipush #32
/*     */     //   710: iand
/*     */     //   711: ifeq -> 717
/*     */     //   714: iconst_1
/*     */     //   715: istore #5
/*     */     //   717: iload #15
/*     */     //   719: bipush #64
/*     */     //   721: iand
/*     */     //   722: ifeq -> 728
/*     */     //   725: iconst_1
/*     */     //   726: istore #6
/*     */     //   728: iload #15
/*     */     //   730: sipush #128
/*     */     //   733: iand
/*     */     //   734: ifeq -> 756
/*     */     //   737: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   740: aload #12
/*     */     //   742: bipush #6
/*     */     //   744: invokestatic getIconButtonStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   747: astore #7
/*     */     //   749: iload #16
/*     */     //   751: ldc -29360129
/*     */     //   753: iand
/*     */     //   754: istore #16
/*     */     //   756: iload #15
/*     */     //   758: sipush #256
/*     */     //   761: iand
/*     */     //   762: ifeq -> 768
/*     */     //   765: aconst_null
/*     */     //   766: astore #8
/*     */     //   768: iload #15
/*     */     //   770: sipush #512
/*     */     //   773: iand
/*     */     //   774: ifeq -> 780
/*     */     //   777: aconst_null
/*     */     //   778: astore #9
/*     */     //   780: iload #15
/*     */     //   782: sipush #1024
/*     */     //   785: iand
/*     */     //   786: ifeq -> 874
/*     */     //   789: aload #12
/*     */     //   791: ldc 1250388380
/*     */     //   793: invokeinterface startReplaceGroup : (I)V
/*     */     //   798: aload #12
/*     */     //   800: astore #19
/*     */     //   802: iconst_0
/*     */     //   803: istore #20
/*     */     //   805: iconst_0
/*     */     //   806: istore #21
/*     */     //   808: aload #19
/*     */     //   810: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   815: astore #22
/*     */     //   817: iconst_0
/*     */     //   818: istore #23
/*     */     //   820: aload #22
/*     */     //   822: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   825: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   828: if_acmpne -> 853
/*     */     //   831: iconst_0
/*     */     //   832: istore #24
/*     */     //   834: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   837: astore #24
/*     */     //   839: aload #19
/*     */     //   841: aload #24
/*     */     //   843: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   848: aload #24
/*     */     //   850: goto -> 855
/*     */     //   853: aload #22
/*     */     //   855: nop
/*     */     //   856: nop
/*     */     //   857: nop
/*     */     //   858: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   861: astore #18
/*     */     //   863: aload #12
/*     */     //   865: invokeinterface endReplaceGroup : ()V
/*     */     //   870: aload #18
/*     */     //   872: astore #10
/*     */     //   874: iload #15
/*     */     //   876: sipush #2048
/*     */     //   879: iand
/*     */     //   880: ifeq -> 938
/*     */     //   883: aload_0
/*     */     //   884: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   887: astore #11
/*     */     //   889: iload #17
/*     */     //   891: bipush #-113
/*     */     //   893: iand
/*     */     //   894: istore #17
/*     */     //   896: goto -> 938
/*     */     //   899: aload #12
/*     */     //   901: invokeinterface skipToGroupEnd : ()V
/*     */     //   906: iload #15
/*     */     //   908: sipush #128
/*     */     //   911: iand
/*     */     //   912: ifeq -> 922
/*     */     //   915: iload #16
/*     */     //   917: ldc -29360129
/*     */     //   919: iand
/*     */     //   920: istore #16
/*     */     //   922: iload #15
/*     */     //   924: sipush #2048
/*     */     //   927: iand
/*     */     //   928: ifeq -> 938
/*     */     //   931: iload #17
/*     */     //   933: bipush #-113
/*     */     //   935: iand
/*     */     //   936: istore #17
/*     */     //   938: aload #12
/*     */     //   940: invokeinterface endDefaults : ()V
/*     */     //   945: invokestatic isTraceInProgress : ()Z
/*     */     //   948: ifeq -> 962
/*     */     //   951: ldc 1817127092
/*     */     //   953: iload #16
/*     */     //   955: iload #17
/*     */     //   957: ldc 'org.jetbrains.jewel.ui.component.SelectableIconActionButton (SelectableIconActionButton.kt:34)'
/*     */     //   959: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   962: aload_0
/*     */     //   963: aload_1
/*     */     //   964: aload #11
/*     */     //   966: iload_2
/*     */     //   967: iload #5
/*     */     //   969: iload #6
/*     */     //   971: aload #7
/*     */     //   973: aload #10
/*     */     //   975: aload #4
/*     */     //   977: aload #8
/*     */     //   979: aload #9
/*     */     //   981: aload_3
/*     */     //   982: aload #12
/*     */     //   984: bipush #14
/*     */     //   986: iload #16
/*     */     //   988: iand
/*     */     //   989: bipush #112
/*     */     //   991: iload #16
/*     */     //   993: iand
/*     */     //   994: ior
/*     */     //   995: sipush #896
/*     */     //   998: iload #17
/*     */     //   1000: iconst_3
/*     */     //   1001: ishl
/*     */     //   1002: iand
/*     */     //   1003: ior
/*     */     //   1004: sipush #7168
/*     */     //   1007: iload #16
/*     */     //   1009: iconst_3
/*     */     //   1010: ishl
/*     */     //   1011: iand
/*     */     //   1012: ior
/*     */     //   1013: ldc 57344
/*     */     //   1015: iload #16
/*     */     //   1017: iconst_3
/*     */     //   1018: ishr
/*     */     //   1019: iand
/*     */     //   1020: ior
/*     */     //   1021: ldc 458752
/*     */     //   1023: iload #16
/*     */     //   1025: iconst_3
/*     */     //   1026: ishr
/*     */     //   1027: iand
/*     */     //   1028: ior
/*     */     //   1029: ldc 3670016
/*     */     //   1031: iload #16
/*     */     //   1033: iconst_3
/*     */     //   1034: ishr
/*     */     //   1035: iand
/*     */     //   1036: ior
/*     */     //   1037: ldc 29360128
/*     */     //   1039: iload #17
/*     */     //   1041: bipush #21
/*     */     //   1043: ishl
/*     */     //   1044: iand
/*     */     //   1045: ior
/*     */     //   1046: ldc 234881024
/*     */     //   1048: iload #16
/*     */     //   1050: bipush #12
/*     */     //   1052: ishl
/*     */     //   1053: iand
/*     */     //   1054: ior
/*     */     //   1055: ldc 1879048192
/*     */     //   1057: iload #16
/*     */     //   1059: iconst_3
/*     */     //   1060: ishl
/*     */     //   1061: iand
/*     */     //   1062: ior
/*     */     //   1063: bipush #14
/*     */     //   1065: iload #16
/*     */     //   1067: bipush #27
/*     */     //   1069: ishr
/*     */     //   1070: iand
/*     */     //   1071: bipush #112
/*     */     //   1073: iload #16
/*     */     //   1075: bipush #6
/*     */     //   1077: ishr
/*     */     //   1078: iand
/*     */     //   1079: ior
/*     */     //   1080: invokestatic BaseSelectableIconActionButton : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Ljava/lang/Class;ZZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1083: invokestatic isTraceInProgress : ()Z
/*     */     //   1086: ifeq -> 1102
/*     */     //   1089: invokestatic traceEventEnd : ()V
/*     */     //   1092: goto -> 1102
/*     */     //   1095: aload #12
/*     */     //   1097: invokeinterface skipToGroupEnd : ()V
/*     */     //   1102: aload #12
/*     */     //   1104: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1109: dup
/*     */     //   1110: ifnull -> 1152
/*     */     //   1113: aload_0
/*     */     //   1114: aload_1
/*     */     //   1115: iload_2
/*     */     //   1116: aload_3
/*     */     //   1117: aload #4
/*     */     //   1119: iload #5
/*     */     //   1121: iload #6
/*     */     //   1123: aload #7
/*     */     //   1125: aload #8
/*     */     //   1127: aload #9
/*     */     //   1129: aload #10
/*     */     //   1131: aload #11
/*     */     //   1133: iload #13
/*     */     //   1135: iload #14
/*     */     //   1137: iload #15
/*     */     //   1139: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/foundation/interaction/MutableInteractionSource;Ljava/lang/Class;III)Lkotlin/jvm/functions/Function2;
/*     */     //   1144: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1149: goto -> 1153
/*     */     //   1152: pop
/*     */     //   1153: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #35	-> 12
/*     */     //   #27	-> 698
/*     */     //   #28	-> 714
/*     */     //   #29	-> 725
/*     */     //   #30	-> 737
/*     */     //   #31	-> 765
/*     */     //   #32	-> 777
/*     */     //   #33	-> 789
/*     */     //   #259	-> 808
/*     */     //   #260	-> 820
/*     */     //   #261	-> 831
/*     */     //   #33	-> 834
/*     */     //   #261	-> 837
/*     */     //   #262	-> 839
/*     */     //   #263	-> 848
/*     */     //   #264	-> 853
/*     */     //   #260	-> 855
/*     */     //   #259	-> 856
/*     */     //   #259	-> 857
/*     */     //   #33	-> 858
/*     */     //   #34	-> 883
/*     */     //   #35	-> 959
/*     */     //   #37	-> 962
/*     */     //   #38	-> 963
/*     */     //   #39	-> 964
/*     */     //   #40	-> 966
/*     */     //   #41	-> 967
/*     */     //   #42	-> 969
/*     */     //   #43	-> 971
/*     */     //   #44	-> 973
/*     */     //   #45	-> 975
/*     */     //   #46	-> 977
/*     */     //   #47	-> 979
/*     */     //   #48	-> 981
/*     */     //   #36	-> 1080
/*     */     //   #50	-> 1095
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   834	3	24	$i$a$-cache-SelectableIconActionButtonKt$SelectableIconActionButton$1	I
/*     */     //   839	11	24	value$iv	Ljava/lang/Object;
/*     */     //   820	36	23	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   817	39	22	it$iv	Ljava/lang/Object;
/*     */     //   808	50	21	$i$f$cache	I
/*     */     //   805	53	19	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   805	53	20	invalid$iv	Z
/*     */     //   27	1127	16	$dirty	I
/*     */     //   31	1123	17	$dirty1	I
/*     */     //   0	1154	0	key	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   0	1154	1	contentDescription	Ljava/lang/String;
/*     */     //   0	1154	2	selected	Z
/*     */     //   0	1154	3	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1154	4	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1154	5	enabled	Z
/*     */     //   0	1154	6	focusable	Z
/*     */     //   0	1154	7	style	Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   0	1154	8	colorFilter	Landroidx/compose/ui/graphics/ColorFilter;
/*     */     //   0	1154	9	extraHint	Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   0	1154	10	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1154	11	iconClass	Ljava/lang/Class;
/*     */     //   0	1154	12	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1154	13	$changed	I
/*     */     //   0	1154	14	$changed1	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
/*     */   public static final void SelectableIconActionButton(@NotNull IconKey key, @Nullable String contentDescription, boolean selected, @NotNull Function0 onClick, @Nullable Modifier modifier, boolean enabled, boolean focusable, @Nullable IconButtonStyle style, @Nullable ColorFilter colorFilter, @Nullable PainterHint extraHint, @Nullable TooltipStyle tooltipStyle, @Nullable Modifier tooltipModifier, @Nullable TooltipPlacement tooltipPlacement, @Nullable MutableInteractionSource interactionSource, @Nullable Class iconClass, @NotNull Function2 tooltip, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'key'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_3
/*     */     //   7: ldc 'onClick'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload #15
/*     */     //   14: ldc 'tooltip'
/*     */     //   16: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   19: aload #16
/*     */     //   21: ldc 519830250
/*     */     //   23: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   28: astore #16
/*     */     //   30: iload #17
/*     */     //   32: istore #20
/*     */     //   34: iload #18
/*     */     //   36: istore #21
/*     */     //   38: iload #19
/*     */     //   40: iconst_1
/*     */     //   41: iand
/*     */     //   42: ifeq -> 55
/*     */     //   45: iload #20
/*     */     //   47: bipush #6
/*     */     //   49: ior
/*     */     //   50: istore #20
/*     */     //   52: goto -> 103
/*     */     //   55: iload #17
/*     */     //   57: bipush #6
/*     */     //   59: iand
/*     */     //   60: ifne -> 103
/*     */     //   63: iload #20
/*     */     //   65: iload #17
/*     */     //   67: bipush #8
/*     */     //   69: iand
/*     */     //   70: ifne -> 84
/*     */     //   73: aload #16
/*     */     //   75: aload_0
/*     */     //   76: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   81: goto -> 92
/*     */     //   84: aload #16
/*     */     //   86: aload_0
/*     */     //   87: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   92: ifeq -> 99
/*     */     //   95: iconst_4
/*     */     //   96: goto -> 100
/*     */     //   99: iconst_2
/*     */     //   100: ior
/*     */     //   101: istore #20
/*     */     //   103: iload #19
/*     */     //   105: iconst_2
/*     */     //   106: iand
/*     */     //   107: ifeq -> 120
/*     */     //   110: iload #20
/*     */     //   112: bipush #48
/*     */     //   114: ior
/*     */     //   115: istore #20
/*     */     //   117: goto -> 151
/*     */     //   120: iload #17
/*     */     //   122: bipush #48
/*     */     //   124: iand
/*     */     //   125: ifne -> 151
/*     */     //   128: iload #20
/*     */     //   130: aload #16
/*     */     //   132: aload_1
/*     */     //   133: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   138: ifeq -> 146
/*     */     //   141: bipush #32
/*     */     //   143: goto -> 148
/*     */     //   146: bipush #16
/*     */     //   148: ior
/*     */     //   149: istore #20
/*     */     //   151: iload #19
/*     */     //   153: iconst_4
/*     */     //   154: iand
/*     */     //   155: ifeq -> 169
/*     */     //   158: iload #20
/*     */     //   160: sipush #384
/*     */     //   163: ior
/*     */     //   164: istore #20
/*     */     //   166: goto -> 203
/*     */     //   169: iload #17
/*     */     //   171: sipush #384
/*     */     //   174: iand
/*     */     //   175: ifne -> 203
/*     */     //   178: iload #20
/*     */     //   180: aload #16
/*     */     //   182: iload_2
/*     */     //   183: invokeinterface changed : (Z)Z
/*     */     //   188: ifeq -> 197
/*     */     //   191: sipush #256
/*     */     //   194: goto -> 200
/*     */     //   197: sipush #128
/*     */     //   200: ior
/*     */     //   201: istore #20
/*     */     //   203: iload #19
/*     */     //   205: bipush #8
/*     */     //   207: iand
/*     */     //   208: ifeq -> 222
/*     */     //   211: iload #20
/*     */     //   213: sipush #3072
/*     */     //   216: ior
/*     */     //   217: istore #20
/*     */     //   219: goto -> 256
/*     */     //   222: iload #17
/*     */     //   224: sipush #3072
/*     */     //   227: iand
/*     */     //   228: ifne -> 256
/*     */     //   231: iload #20
/*     */     //   233: aload #16
/*     */     //   235: aload_3
/*     */     //   236: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   241: ifeq -> 250
/*     */     //   244: sipush #2048
/*     */     //   247: goto -> 253
/*     */     //   250: sipush #1024
/*     */     //   253: ior
/*     */     //   254: istore #20
/*     */     //   256: iload #19
/*     */     //   258: bipush #16
/*     */     //   260: iand
/*     */     //   261: ifeq -> 275
/*     */     //   264: iload #20
/*     */     //   266: sipush #24576
/*     */     //   269: ior
/*     */     //   270: istore #20
/*     */     //   272: goto -> 310
/*     */     //   275: iload #17
/*     */     //   277: sipush #24576
/*     */     //   280: iand
/*     */     //   281: ifne -> 310
/*     */     //   284: iload #20
/*     */     //   286: aload #16
/*     */     //   288: aload #4
/*     */     //   290: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   295: ifeq -> 304
/*     */     //   298: sipush #16384
/*     */     //   301: goto -> 307
/*     */     //   304: sipush #8192
/*     */     //   307: ior
/*     */     //   308: istore #20
/*     */     //   310: iload #19
/*     */     //   312: bipush #32
/*     */     //   314: iand
/*     */     //   315: ifeq -> 328
/*     */     //   318: iload #20
/*     */     //   320: ldc 196608
/*     */     //   322: ior
/*     */     //   323: istore #20
/*     */     //   325: goto -> 360
/*     */     //   328: iload #17
/*     */     //   330: ldc 196608
/*     */     //   332: iand
/*     */     //   333: ifne -> 360
/*     */     //   336: iload #20
/*     */     //   338: aload #16
/*     */     //   340: iload #5
/*     */     //   342: invokeinterface changed : (Z)Z
/*     */     //   347: ifeq -> 355
/*     */     //   350: ldc 131072
/*     */     //   352: goto -> 357
/*     */     //   355: ldc 65536
/*     */     //   357: ior
/*     */     //   358: istore #20
/*     */     //   360: iload #19
/*     */     //   362: bipush #64
/*     */     //   364: iand
/*     */     //   365: ifeq -> 378
/*     */     //   368: iload #20
/*     */     //   370: ldc 1572864
/*     */     //   372: ior
/*     */     //   373: istore #20
/*     */     //   375: goto -> 410
/*     */     //   378: iload #17
/*     */     //   380: ldc 1572864
/*     */     //   382: iand
/*     */     //   383: ifne -> 410
/*     */     //   386: iload #20
/*     */     //   388: aload #16
/*     */     //   390: iload #6
/*     */     //   392: invokeinterface changed : (Z)Z
/*     */     //   397: ifeq -> 405
/*     */     //   400: ldc 1048576
/*     */     //   402: goto -> 407
/*     */     //   405: ldc 524288
/*     */     //   407: ior
/*     */     //   408: istore #20
/*     */     //   410: iload #17
/*     */     //   412: ldc 12582912
/*     */     //   414: iand
/*     */     //   415: ifne -> 451
/*     */     //   418: iload #20
/*     */     //   420: iload #19
/*     */     //   422: sipush #128
/*     */     //   425: iand
/*     */     //   426: ifne -> 446
/*     */     //   429: aload #16
/*     */     //   431: aload #7
/*     */     //   433: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   438: ifeq -> 446
/*     */     //   441: ldc 8388608
/*     */     //   443: goto -> 448
/*     */     //   446: ldc 4194304
/*     */     //   448: ior
/*     */     //   449: istore #20
/*     */     //   451: iload #19
/*     */     //   453: sipush #256
/*     */     //   456: iand
/*     */     //   457: ifeq -> 470
/*     */     //   460: iload #20
/*     */     //   462: ldc 100663296
/*     */     //   464: ior
/*     */     //   465: istore #20
/*     */     //   467: goto -> 502
/*     */     //   470: iload #17
/*     */     //   472: ldc 100663296
/*     */     //   474: iand
/*     */     //   475: ifne -> 502
/*     */     //   478: iload #20
/*     */     //   480: aload #16
/*     */     //   482: aload #8
/*     */     //   484: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   489: ifeq -> 497
/*     */     //   492: ldc 67108864
/*     */     //   494: goto -> 499
/*     */     //   497: ldc 33554432
/*     */     //   499: ior
/*     */     //   500: istore #20
/*     */     //   502: iload #19
/*     */     //   504: sipush #512
/*     */     //   507: iand
/*     */     //   508: ifeq -> 521
/*     */     //   511: iload #20
/*     */     //   513: ldc 805306368
/*     */     //   515: ior
/*     */     //   516: istore #20
/*     */     //   518: goto -> 553
/*     */     //   521: iload #17
/*     */     //   523: ldc 805306368
/*     */     //   525: iand
/*     */     //   526: ifne -> 553
/*     */     //   529: iload #20
/*     */     //   531: aload #16
/*     */     //   533: aload #9
/*     */     //   535: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   540: ifeq -> 548
/*     */     //   543: ldc 536870912
/*     */     //   545: goto -> 550
/*     */     //   548: ldc 268435456
/*     */     //   550: ior
/*     */     //   551: istore #20
/*     */     //   553: iload #18
/*     */     //   555: bipush #6
/*     */     //   557: iand
/*     */     //   558: ifne -> 592
/*     */     //   561: iload #21
/*     */     //   563: iload #19
/*     */     //   565: sipush #1024
/*     */     //   568: iand
/*     */     //   569: ifne -> 588
/*     */     //   572: aload #16
/*     */     //   574: aload #10
/*     */     //   576: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   581: ifeq -> 588
/*     */     //   584: iconst_4
/*     */     //   585: goto -> 589
/*     */     //   588: iconst_2
/*     */     //   589: ior
/*     */     //   590: istore #21
/*     */     //   592: iload #19
/*     */     //   594: sipush #2048
/*     */     //   597: iand
/*     */     //   598: ifeq -> 611
/*     */     //   601: iload #21
/*     */     //   603: bipush #48
/*     */     //   605: ior
/*     */     //   606: istore #21
/*     */     //   608: goto -> 643
/*     */     //   611: iload #18
/*     */     //   613: bipush #48
/*     */     //   615: iand
/*     */     //   616: ifne -> 643
/*     */     //   619: iload #21
/*     */     //   621: aload #16
/*     */     //   623: aload #11
/*     */     //   625: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   630: ifeq -> 638
/*     */     //   633: bipush #32
/*     */     //   635: goto -> 640
/*     */     //   638: bipush #16
/*     */     //   640: ior
/*     */     //   641: istore #21
/*     */     //   643: iload #18
/*     */     //   645: sipush #384
/*     */     //   648: iand
/*     */     //   649: ifne -> 687
/*     */     //   652: iload #21
/*     */     //   654: iload #19
/*     */     //   656: sipush #4096
/*     */     //   659: iand
/*     */     //   660: ifne -> 681
/*     */     //   663: aload #16
/*     */     //   665: aload #12
/*     */     //   667: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   672: ifeq -> 681
/*     */     //   675: sipush #256
/*     */     //   678: goto -> 684
/*     */     //   681: sipush #128
/*     */     //   684: ior
/*     */     //   685: istore #21
/*     */     //   687: iload #19
/*     */     //   689: sipush #8192
/*     */     //   692: iand
/*     */     //   693: ifeq -> 707
/*     */     //   696: iload #21
/*     */     //   698: sipush #3072
/*     */     //   701: ior
/*     */     //   702: istore #21
/*     */     //   704: goto -> 742
/*     */     //   707: iload #18
/*     */     //   709: sipush #3072
/*     */     //   712: iand
/*     */     //   713: ifne -> 742
/*     */     //   716: iload #21
/*     */     //   718: aload #16
/*     */     //   720: aload #13
/*     */     //   722: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   727: ifeq -> 736
/*     */     //   730: sipush #2048
/*     */     //   733: goto -> 739
/*     */     //   736: sipush #1024
/*     */     //   739: ior
/*     */     //   740: istore #21
/*     */     //   742: iload #18
/*     */     //   744: sipush #24576
/*     */     //   747: iand
/*     */     //   748: ifne -> 786
/*     */     //   751: iload #21
/*     */     //   753: iload #19
/*     */     //   755: sipush #16384
/*     */     //   758: iand
/*     */     //   759: ifne -> 780
/*     */     //   762: aload #16
/*     */     //   764: aload #14
/*     */     //   766: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   771: ifeq -> 780
/*     */     //   774: sipush #16384
/*     */     //   777: goto -> 783
/*     */     //   780: sipush #8192
/*     */     //   783: ior
/*     */     //   784: istore #21
/*     */     //   786: iload #19
/*     */     //   788: ldc 32768
/*     */     //   790: iand
/*     */     //   791: ifeq -> 804
/*     */     //   794: iload #21
/*     */     //   796: ldc 196608
/*     */     //   798: ior
/*     */     //   799: istore #21
/*     */     //   801: goto -> 836
/*     */     //   804: iload #18
/*     */     //   806: ldc 196608
/*     */     //   808: iand
/*     */     //   809: ifne -> 836
/*     */     //   812: iload #21
/*     */     //   814: aload #16
/*     */     //   816: aload #15
/*     */     //   818: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   823: ifeq -> 831
/*     */     //   826: ldc 131072
/*     */     //   828: goto -> 833
/*     */     //   831: ldc 65536
/*     */     //   833: ior
/*     */     //   834: istore #21
/*     */     //   836: iload #20
/*     */     //   838: ldc 306783379
/*     */     //   840: iand
/*     */     //   841: ldc 306783378
/*     */     //   843: if_icmpne -> 866
/*     */     //   846: iload #21
/*     */     //   848: ldc 74899
/*     */     //   850: iand
/*     */     //   851: ldc 74898
/*     */     //   853: if_icmpne -> 866
/*     */     //   856: aload #16
/*     */     //   858: invokeinterface getSkipping : ()Z
/*     */     //   863: ifne -> 1410
/*     */     //   866: aload #16
/*     */     //   868: invokeinterface startDefaults : ()V
/*     */     //   873: iload #17
/*     */     //   875: iconst_1
/*     */     //   876: iand
/*     */     //   877: ifeq -> 890
/*     */     //   880: aload #16
/*     */     //   882: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   887: ifeq -> 1208
/*     */     //   890: iload #19
/*     */     //   892: bipush #16
/*     */     //   894: iand
/*     */     //   895: ifeq -> 906
/*     */     //   898: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   901: checkcast androidx/compose/ui/Modifier
/*     */     //   904: astore #4
/*     */     //   906: iload #19
/*     */     //   908: bipush #32
/*     */     //   910: iand
/*     */     //   911: ifeq -> 917
/*     */     //   914: iconst_1
/*     */     //   915: istore #5
/*     */     //   917: iload #19
/*     */     //   919: bipush #64
/*     */     //   921: iand
/*     */     //   922: ifeq -> 928
/*     */     //   925: iconst_1
/*     */     //   926: istore #6
/*     */     //   928: iload #19
/*     */     //   930: sipush #128
/*     */     //   933: iand
/*     */     //   934: ifeq -> 956
/*     */     //   937: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   940: aload #16
/*     */     //   942: bipush #6
/*     */     //   944: invokestatic getIconButtonStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   947: astore #7
/*     */     //   949: iload #20
/*     */     //   951: ldc -29360129
/*     */     //   953: iand
/*     */     //   954: istore #20
/*     */     //   956: iload #19
/*     */     //   958: sipush #256
/*     */     //   961: iand
/*     */     //   962: ifeq -> 968
/*     */     //   965: aconst_null
/*     */     //   966: astore #8
/*     */     //   968: iload #19
/*     */     //   970: sipush #512
/*     */     //   973: iand
/*     */     //   974: ifeq -> 980
/*     */     //   977: aconst_null
/*     */     //   978: astore #9
/*     */     //   980: iload #19
/*     */     //   982: sipush #1024
/*     */     //   985: iand
/*     */     //   986: ifeq -> 1008
/*     */     //   989: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   992: aload #16
/*     */     //   994: bipush #6
/*     */     //   996: invokestatic getTooltipStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;
/*     */     //   999: astore #10
/*     */     //   1001: iload #21
/*     */     //   1003: bipush #-15
/*     */     //   1005: iand
/*     */     //   1006: istore #21
/*     */     //   1008: iload #19
/*     */     //   1010: sipush #2048
/*     */     //   1013: iand
/*     */     //   1014: ifeq -> 1025
/*     */     //   1017: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1020: checkcast androidx/compose/ui/Modifier
/*     */     //   1023: astore #11
/*     */     //   1025: iload #19
/*     */     //   1027: sipush #4096
/*     */     //   1030: iand
/*     */     //   1031: ifeq -> 1087
/*     */     //   1034: new org/jetbrains/jewel/ui/component/FixedCursorPoint
/*     */     //   1037: dup
/*     */     //   1038: iconst_0
/*     */     //   1039: istore #22
/*     */     //   1041: iconst_0
/*     */     //   1042: istore #23
/*     */     //   1044: iload #22
/*     */     //   1046: i2f
/*     */     //   1047: invokestatic constructor-impl : (F)F
/*     */     //   1050: bipush #16
/*     */     //   1052: istore #22
/*     */     //   1054: iconst_0
/*     */     //   1055: istore #23
/*     */     //   1057: iload #22
/*     */     //   1059: i2f
/*     */     //   1060: invokestatic constructor-impl : (F)F
/*     */     //   1063: invokestatic DpOffset-YgX7TsA : (FF)J
/*     */     //   1066: aconst_null
/*     */     //   1067: fconst_0
/*     */     //   1068: bipush #6
/*     */     //   1070: aconst_null
/*     */     //   1071: invokespecial <init> : (JLandroidx/compose/ui/Alignment;FILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   1074: checkcast androidx/compose/foundation/TooltipPlacement
/*     */     //   1077: astore #12
/*     */     //   1079: iload #21
/*     */     //   1081: sipush #-897
/*     */     //   1084: iand
/*     */     //   1085: istore #21
/*     */     //   1087: iload #19
/*     */     //   1089: sipush #8192
/*     */     //   1092: iand
/*     */     //   1093: ifeq -> 1182
/*     */     //   1096: aload #16
/*     */     //   1098: ldc_w 1250419772
/*     */     //   1101: invokeinterface startReplaceGroup : (I)V
/*     */     //   1106: aload #16
/*     */     //   1108: astore #23
/*     */     //   1110: iconst_0
/*     */     //   1111: istore #24
/*     */     //   1113: iconst_0
/*     */     //   1114: istore #25
/*     */     //   1116: aload #23
/*     */     //   1118: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1123: astore #26
/*     */     //   1125: iconst_0
/*     */     //   1126: istore #27
/*     */     //   1128: aload #26
/*     */     //   1130: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1133: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1136: if_acmpne -> 1161
/*     */     //   1139: iconst_0
/*     */     //   1140: istore #28
/*     */     //   1142: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   1145: astore #28
/*     */     //   1147: aload #23
/*     */     //   1149: aload #28
/*     */     //   1151: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1156: aload #28
/*     */     //   1158: goto -> 1163
/*     */     //   1161: aload #26
/*     */     //   1163: nop
/*     */     //   1164: nop
/*     */     //   1165: nop
/*     */     //   1166: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   1169: astore #22
/*     */     //   1171: aload #16
/*     */     //   1173: invokeinterface endReplaceGroup : ()V
/*     */     //   1178: aload #22
/*     */     //   1180: astore #13
/*     */     //   1182: iload #19
/*     */     //   1184: sipush #16384
/*     */     //   1187: iand
/*     */     //   1188: ifeq -> 1281
/*     */     //   1191: aload_0
/*     */     //   1192: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   1195: astore #14
/*     */     //   1197: iload #21
/*     */     //   1199: ldc_w -57345
/*     */     //   1202: iand
/*     */     //   1203: istore #21
/*     */     //   1205: goto -> 1281
/*     */     //   1208: aload #16
/*     */     //   1210: invokeinterface skipToGroupEnd : ()V
/*     */     //   1215: iload #19
/*     */     //   1217: sipush #128
/*     */     //   1220: iand
/*     */     //   1221: ifeq -> 1231
/*     */     //   1224: iload #20
/*     */     //   1226: ldc -29360129
/*     */     //   1228: iand
/*     */     //   1229: istore #20
/*     */     //   1231: iload #19
/*     */     //   1233: sipush #1024
/*     */     //   1236: iand
/*     */     //   1237: ifeq -> 1247
/*     */     //   1240: iload #21
/*     */     //   1242: bipush #-15
/*     */     //   1244: iand
/*     */     //   1245: istore #21
/*     */     //   1247: iload #19
/*     */     //   1249: sipush #4096
/*     */     //   1252: iand
/*     */     //   1253: ifeq -> 1264
/*     */     //   1256: iload #21
/*     */     //   1258: sipush #-897
/*     */     //   1261: iand
/*     */     //   1262: istore #21
/*     */     //   1264: iload #19
/*     */     //   1266: sipush #16384
/*     */     //   1269: iand
/*     */     //   1270: ifeq -> 1281
/*     */     //   1273: iload #21
/*     */     //   1275: ldc_w -57345
/*     */     //   1278: iand
/*     */     //   1279: istore #21
/*     */     //   1281: aload #16
/*     */     //   1283: invokeinterface endDefaults : ()V
/*     */     //   1288: invokestatic isTraceInProgress : ()Z
/*     */     //   1291: ifeq -> 1306
/*     */     //   1294: ldc 519830250
/*     */     //   1296: iload #20
/*     */     //   1298: iload #21
/*     */     //   1300: ldc_w 'org.jetbrains.jewel.ui.component.SelectableIconActionButton (SelectableIconActionButton.kt:69)'
/*     */     //   1303: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   1306: aload #15
/*     */     //   1308: aload #11
/*     */     //   1310: iconst_0
/*     */     //   1311: aload #10
/*     */     //   1313: aload #12
/*     */     //   1315: ldc_w 1876330717
/*     */     //   1318: iconst_1
/*     */     //   1319: new org/jetbrains/jewel/ui/component/SelectableIconActionButtonKt$SelectableIconActionButton$4
/*     */     //   1322: dup
/*     */     //   1323: aload_0
/*     */     //   1324: aload_1
/*     */     //   1325: aload #14
/*     */     //   1327: iload_2
/*     */     //   1328: iload #5
/*     */     //   1330: iload #6
/*     */     //   1332: aload #7
/*     */     //   1334: aload #13
/*     */     //   1336: aload #4
/*     */     //   1338: aload #8
/*     */     //   1340: aload #9
/*     */     //   1342: aload_3
/*     */     //   1343: invokespecial <init> : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Ljava/lang/Class;ZZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;)V
/*     */     //   1346: aload #16
/*     */     //   1348: bipush #54
/*     */     //   1350: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1353: checkcast kotlin/jvm/functions/Function2
/*     */     //   1356: aload #16
/*     */     //   1358: ldc 196608
/*     */     //   1360: bipush #14
/*     */     //   1362: iload #21
/*     */     //   1364: bipush #15
/*     */     //   1366: ishr
/*     */     //   1367: iand
/*     */     //   1368: ior
/*     */     //   1369: bipush #112
/*     */     //   1371: iload #21
/*     */     //   1373: iand
/*     */     //   1374: ior
/*     */     //   1375: sipush #7168
/*     */     //   1378: iload #21
/*     */     //   1380: bipush #9
/*     */     //   1382: ishl
/*     */     //   1383: iand
/*     */     //   1384: ior
/*     */     //   1385: ldc 57344
/*     */     //   1387: iload #21
/*     */     //   1389: bipush #6
/*     */     //   1391: ishl
/*     */     //   1392: iand
/*     */     //   1393: ior
/*     */     //   1394: iconst_4
/*     */     //   1395: invokestatic Tooltip : (Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/foundation/TooltipPlacement;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1398: invokestatic isTraceInProgress : ()Z
/*     */     //   1401: ifeq -> 1417
/*     */     //   1404: invokestatic traceEventEnd : ()V
/*     */     //   1407: goto -> 1417
/*     */     //   1410: aload #16
/*     */     //   1412: invokeinterface skipToGroupEnd : ()V
/*     */     //   1417: aload #16
/*     */     //   1419: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1424: dup
/*     */     //   1425: ifnull -> 1475
/*     */     //   1428: aload_0
/*     */     //   1429: aload_1
/*     */     //   1430: iload_2
/*     */     //   1431: aload_3
/*     */     //   1432: aload #4
/*     */     //   1434: iload #5
/*     */     //   1436: iload #6
/*     */     //   1438: aload #7
/*     */     //   1440: aload #8
/*     */     //   1442: aload #9
/*     */     //   1444: aload #10
/*     */     //   1446: aload #11
/*     */     //   1448: aload #12
/*     */     //   1450: aload #13
/*     */     //   1452: aload #14
/*     */     //   1454: aload #15
/*     */     //   1456: iload #17
/*     */     //   1458: iload #18
/*     */     //   1460: iload #19
/*     */     //   1462: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/painter/PainterHint;Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/TooltipPlacement;Landroidx/compose/foundation/interaction/MutableInteractionSource;Ljava/lang/Class;Lkotlin/jvm/functions/Function2;III)Lkotlin/jvm/functions/Function2;
/*     */     //   1467: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1472: goto -> 1476
/*     */     //   1475: pop
/*     */     //   1476: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #70	-> 19
/*     */     //   #58	-> 898
/*     */     //   #59	-> 914
/*     */     //   #60	-> 925
/*     */     //   #61	-> 937
/*     */     //   #62	-> 965
/*     */     //   #63	-> 977
/*     */     //   #64	-> 989
/*     */     //   #65	-> 1017
/*     */     //   #66	-> 1034
/*     */     //   #265	-> 1044
/*     */     //   #66	-> 1050
/*     */     //   #265	-> 1057
/*     */     //   #66	-> 1063
/*     */     //   #67	-> 1096
/*     */     //   #266	-> 1116
/*     */     //   #267	-> 1128
/*     */     //   #268	-> 1139
/*     */     //   #67	-> 1142
/*     */     //   #268	-> 1145
/*     */     //   #269	-> 1147
/*     */     //   #270	-> 1156
/*     */     //   #271	-> 1161
/*     */     //   #267	-> 1163
/*     */     //   #266	-> 1164
/*     */     //   #266	-> 1165
/*     */     //   #67	-> 1166
/*     */     //   #68	-> 1191
/*     */     //   #70	-> 1303
/*     */     //   #71	-> 1306
/*     */     //   #87	-> 1410
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   1044	6	23	$i$f$getDp	I
/*     */     //   1041	9	22	$this$dp$iv	I
/*     */     //   1057	6	23	$i$f$getDp	I
/*     */     //   1054	9	22	$this$dp$iv	I
/*     */     //   1142	3	28	$i$a$-cache-SelectableIconActionButtonKt$SelectableIconActionButton$3	I
/*     */     //   1147	11	28	value$iv	Ljava/lang/Object;
/*     */     //   1128	36	27	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1125	39	26	it$iv	Ljava/lang/Object;
/*     */     //   1116	50	25	$i$f$cache	I
/*     */     //   1113	53	23	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1113	53	24	invalid$iv	Z
/*     */     //   34	1443	20	$dirty	I
/*     */     //   38	1439	21	$dirty1	I
/*     */     //   0	1477	0	key	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   0	1477	1	contentDescription	Ljava/lang/String;
/*     */     //   0	1477	2	selected	Z
/*     */     //   0	1477	3	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1477	4	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1477	5	enabled	Z
/*     */     //   0	1477	6	focusable	Z
/*     */     //   0	1477	7	style	Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   0	1477	8	colorFilter	Landroidx/compose/ui/graphics/ColorFilter;
/*     */     //   0	1477	9	extraHint	Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   0	1477	10	tooltipStyle	Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;
/*     */     //   0	1477	11	tooltipModifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1477	12	tooltipPlacement	Landroidx/compose/foundation/TooltipPlacement;
/*     */     //   0	1477	13	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1477	14	iconClass	Ljava/lang/Class;
/*     */     //   0	1477	15	tooltip	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1477	16	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1477	17	$changed	I
/*     */     //   0	1477	18	$changed1	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class SelectableIconActionButtonKt$SelectableIconActionButton$4
/*     */     implements Function2<Composer, Integer, Unit>
/*     */   {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*  72 */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1876330717, $changed, -1, "org.jetbrains.jewel.ui.component.SelectableIconActionButton.<anonymous> (SelectableIconActionButton.kt:71)");  SelectableIconActionButtonKt.BaseSelectableIconActionButton(
/*  73 */             this.$key, 
/*     */             
/*  75 */             this.$contentDescription, 
/*  76 */             this.$iconClass, 
/*  77 */             this.$selected, 
/*  78 */             this.$enabled, 
/*  79 */             this.$focusable, 
/*  80 */             this.$style, 
/*  81 */             this.$interactionSource, this.$modifier, 
/*  82 */             this.$colorFilter, 
/*  83 */             this.$extraHint, 
/*  84 */             this.$onClick, $composer, 0, 0); if (ComposerKt.isTraceInProgress())
/*  85 */           ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*     */     
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     SelectableIconActionButtonKt$SelectableIconActionButton$4(IconKey $key, String $contentDescription, Class<?> $iconClass, boolean $selected, boolean $enabled, boolean $focusable, IconButtonStyle $style, MutableInteractionSource $interactionSource, Modifier $modifier, ColorFilter $colorFilter, PainterHint $extraHint, Function0<Unit> $onClick) {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void SelectableIconActionButton(@NotNull IconKey key, @Nullable String contentDescription, boolean selected, @NotNull PainterHint[] extraHints, @NotNull Function0 onClick, @Nullable Modifier modifier, boolean enabled, boolean focusable, @Nullable IconButtonStyle style, @Nullable ColorFilter colorFilter, @Nullable MutableInteractionSource interactionSource, @Nullable Class iconClass, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'key'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_3
/*     */     //   7: ldc_w 'extraHints'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload #4
/*     */     //   15: ldc 'onClick'
/*     */     //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   20: aload #12
/*     */     //   22: ldc_w -718177631
/*     */     //   25: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   30: astore #12
/*     */     //   32: iload #13
/*     */     //   34: istore #16
/*     */     //   36: iload #14
/*     */     //   38: istore #17
/*     */     //   40: iload #15
/*     */     //   42: iconst_1
/*     */     //   43: iand
/*     */     //   44: ifeq -> 57
/*     */     //   47: iload #16
/*     */     //   49: bipush #6
/*     */     //   51: ior
/*     */     //   52: istore #16
/*     */     //   54: goto -> 105
/*     */     //   57: iload #13
/*     */     //   59: bipush #6
/*     */     //   61: iand
/*     */     //   62: ifne -> 105
/*     */     //   65: iload #16
/*     */     //   67: iload #13
/*     */     //   69: bipush #8
/*     */     //   71: iand
/*     */     //   72: ifne -> 86
/*     */     //   75: aload #12
/*     */     //   77: aload_0
/*     */     //   78: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   83: goto -> 94
/*     */     //   86: aload #12
/*     */     //   88: aload_0
/*     */     //   89: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   94: ifeq -> 101
/*     */     //   97: iconst_4
/*     */     //   98: goto -> 102
/*     */     //   101: iconst_2
/*     */     //   102: ior
/*     */     //   103: istore #16
/*     */     //   105: iload #15
/*     */     //   107: iconst_2
/*     */     //   108: iand
/*     */     //   109: ifeq -> 122
/*     */     //   112: iload #16
/*     */     //   114: bipush #48
/*     */     //   116: ior
/*     */     //   117: istore #16
/*     */     //   119: goto -> 153
/*     */     //   122: iload #13
/*     */     //   124: bipush #48
/*     */     //   126: iand
/*     */     //   127: ifne -> 153
/*     */     //   130: iload #16
/*     */     //   132: aload #12
/*     */     //   134: aload_1
/*     */     //   135: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   140: ifeq -> 148
/*     */     //   143: bipush #32
/*     */     //   145: goto -> 150
/*     */     //   148: bipush #16
/*     */     //   150: ior
/*     */     //   151: istore #16
/*     */     //   153: iload #15
/*     */     //   155: iconst_4
/*     */     //   156: iand
/*     */     //   157: ifeq -> 171
/*     */     //   160: iload #16
/*     */     //   162: sipush #384
/*     */     //   165: ior
/*     */     //   166: istore #16
/*     */     //   168: goto -> 205
/*     */     //   171: iload #13
/*     */     //   173: sipush #384
/*     */     //   176: iand
/*     */     //   177: ifne -> 205
/*     */     //   180: iload #16
/*     */     //   182: aload #12
/*     */     //   184: iload_2
/*     */     //   185: invokeinterface changed : (Z)Z
/*     */     //   190: ifeq -> 199
/*     */     //   193: sipush #256
/*     */     //   196: goto -> 202
/*     */     //   199: sipush #128
/*     */     //   202: ior
/*     */     //   203: istore #16
/*     */     //   205: iload #15
/*     */     //   207: bipush #8
/*     */     //   209: iand
/*     */     //   210: ifeq -> 224
/*     */     //   213: iload #16
/*     */     //   215: sipush #3072
/*     */     //   218: ior
/*     */     //   219: istore #16
/*     */     //   221: goto -> 258
/*     */     //   224: iload #13
/*     */     //   226: sipush #3072
/*     */     //   229: iand
/*     */     //   230: ifne -> 258
/*     */     //   233: iload #16
/*     */     //   235: aload #12
/*     */     //   237: aload_3
/*     */     //   238: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   243: ifeq -> 252
/*     */     //   246: sipush #2048
/*     */     //   249: goto -> 255
/*     */     //   252: sipush #1024
/*     */     //   255: ior
/*     */     //   256: istore #16
/*     */     //   258: iload #15
/*     */     //   260: bipush #16
/*     */     //   262: iand
/*     */     //   263: ifeq -> 277
/*     */     //   266: iload #16
/*     */     //   268: sipush #24576
/*     */     //   271: ior
/*     */     //   272: istore #16
/*     */     //   274: goto -> 312
/*     */     //   277: iload #13
/*     */     //   279: sipush #24576
/*     */     //   282: iand
/*     */     //   283: ifne -> 312
/*     */     //   286: iload #16
/*     */     //   288: aload #12
/*     */     //   290: aload #4
/*     */     //   292: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   297: ifeq -> 306
/*     */     //   300: sipush #16384
/*     */     //   303: goto -> 309
/*     */     //   306: sipush #8192
/*     */     //   309: ior
/*     */     //   310: istore #16
/*     */     //   312: iload #15
/*     */     //   314: bipush #32
/*     */     //   316: iand
/*     */     //   317: ifeq -> 330
/*     */     //   320: iload #16
/*     */     //   322: ldc 196608
/*     */     //   324: ior
/*     */     //   325: istore #16
/*     */     //   327: goto -> 362
/*     */     //   330: iload #13
/*     */     //   332: ldc 196608
/*     */     //   334: iand
/*     */     //   335: ifne -> 362
/*     */     //   338: iload #16
/*     */     //   340: aload #12
/*     */     //   342: aload #5
/*     */     //   344: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   349: ifeq -> 357
/*     */     //   352: ldc 131072
/*     */     //   354: goto -> 359
/*     */     //   357: ldc 65536
/*     */     //   359: ior
/*     */     //   360: istore #16
/*     */     //   362: iload #15
/*     */     //   364: bipush #64
/*     */     //   366: iand
/*     */     //   367: ifeq -> 380
/*     */     //   370: iload #16
/*     */     //   372: ldc 1572864
/*     */     //   374: ior
/*     */     //   375: istore #16
/*     */     //   377: goto -> 412
/*     */     //   380: iload #13
/*     */     //   382: ldc 1572864
/*     */     //   384: iand
/*     */     //   385: ifne -> 412
/*     */     //   388: iload #16
/*     */     //   390: aload #12
/*     */     //   392: iload #6
/*     */     //   394: invokeinterface changed : (Z)Z
/*     */     //   399: ifeq -> 407
/*     */     //   402: ldc 1048576
/*     */     //   404: goto -> 409
/*     */     //   407: ldc 524288
/*     */     //   409: ior
/*     */     //   410: istore #16
/*     */     //   412: iload #15
/*     */     //   414: sipush #128
/*     */     //   417: iand
/*     */     //   418: ifeq -> 431
/*     */     //   421: iload #16
/*     */     //   423: ldc 12582912
/*     */     //   425: ior
/*     */     //   426: istore #16
/*     */     //   428: goto -> 463
/*     */     //   431: iload #13
/*     */     //   433: ldc 12582912
/*     */     //   435: iand
/*     */     //   436: ifne -> 463
/*     */     //   439: iload #16
/*     */     //   441: aload #12
/*     */     //   443: iload #7
/*     */     //   445: invokeinterface changed : (Z)Z
/*     */     //   450: ifeq -> 458
/*     */     //   453: ldc 8388608
/*     */     //   455: goto -> 460
/*     */     //   458: ldc 4194304
/*     */     //   460: ior
/*     */     //   461: istore #16
/*     */     //   463: iload #13
/*     */     //   465: ldc 100663296
/*     */     //   467: iand
/*     */     //   468: ifne -> 504
/*     */     //   471: iload #16
/*     */     //   473: iload #15
/*     */     //   475: sipush #256
/*     */     //   478: iand
/*     */     //   479: ifne -> 499
/*     */     //   482: aload #12
/*     */     //   484: aload #8
/*     */     //   486: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   491: ifeq -> 499
/*     */     //   494: ldc 67108864
/*     */     //   496: goto -> 501
/*     */     //   499: ldc 33554432
/*     */     //   501: ior
/*     */     //   502: istore #16
/*     */     //   504: iload #15
/*     */     //   506: sipush #512
/*     */     //   509: iand
/*     */     //   510: ifeq -> 523
/*     */     //   513: iload #16
/*     */     //   515: ldc 805306368
/*     */     //   517: ior
/*     */     //   518: istore #16
/*     */     //   520: goto -> 555
/*     */     //   523: iload #13
/*     */     //   525: ldc 805306368
/*     */     //   527: iand
/*     */     //   528: ifne -> 555
/*     */     //   531: iload #16
/*     */     //   533: aload #12
/*     */     //   535: aload #9
/*     */     //   537: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   542: ifeq -> 550
/*     */     //   545: ldc 536870912
/*     */     //   547: goto -> 552
/*     */     //   550: ldc 268435456
/*     */     //   552: ior
/*     */     //   553: istore #16
/*     */     //   555: iload #15
/*     */     //   557: sipush #1024
/*     */     //   560: iand
/*     */     //   561: ifeq -> 574
/*     */     //   564: iload #17
/*     */     //   566: bipush #6
/*     */     //   568: ior
/*     */     //   569: istore #17
/*     */     //   571: goto -> 604
/*     */     //   574: iload #14
/*     */     //   576: bipush #6
/*     */     //   578: iand
/*     */     //   579: ifne -> 604
/*     */     //   582: iload #17
/*     */     //   584: aload #12
/*     */     //   586: aload #10
/*     */     //   588: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   593: ifeq -> 600
/*     */     //   596: iconst_4
/*     */     //   597: goto -> 601
/*     */     //   600: iconst_2
/*     */     //   601: ior
/*     */     //   602: istore #17
/*     */     //   604: iload #14
/*     */     //   606: bipush #48
/*     */     //   608: iand
/*     */     //   609: ifne -> 645
/*     */     //   612: iload #17
/*     */     //   614: iload #15
/*     */     //   616: sipush #2048
/*     */     //   619: iand
/*     */     //   620: ifne -> 640
/*     */     //   623: aload #12
/*     */     //   625: aload #11
/*     */     //   627: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   632: ifeq -> 640
/*     */     //   635: bipush #32
/*     */     //   637: goto -> 642
/*     */     //   640: bipush #16
/*     */     //   642: ior
/*     */     //   643: istore #17
/*     */     //   645: iload #16
/*     */     //   647: ldc 306783379
/*     */     //   649: iand
/*     */     //   650: ldc 306783378
/*     */     //   652: if_icmpne -> 675
/*     */     //   655: iload #17
/*     */     //   657: bipush #19
/*     */     //   659: iand
/*     */     //   660: bipush #18
/*     */     //   662: if_icmpne -> 675
/*     */     //   665: aload #12
/*     */     //   667: invokeinterface getSkipping : ()Z
/*     */     //   672: ifne -> 1099
/*     */     //   675: aload #12
/*     */     //   677: invokeinterface startDefaults : ()V
/*     */     //   682: iload #13
/*     */     //   684: iconst_1
/*     */     //   685: iand
/*     */     //   686: ifeq -> 699
/*     */     //   689: aload #12
/*     */     //   691: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   696: ifeq -> 899
/*     */     //   699: iload #15
/*     */     //   701: bipush #32
/*     */     //   703: iand
/*     */     //   704: ifeq -> 715
/*     */     //   707: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   710: checkcast androidx/compose/ui/Modifier
/*     */     //   713: astore #5
/*     */     //   715: iload #15
/*     */     //   717: bipush #64
/*     */     //   719: iand
/*     */     //   720: ifeq -> 726
/*     */     //   723: iconst_1
/*     */     //   724: istore #6
/*     */     //   726: iload #15
/*     */     //   728: sipush #128
/*     */     //   731: iand
/*     */     //   732: ifeq -> 738
/*     */     //   735: iconst_1
/*     */     //   736: istore #7
/*     */     //   738: iload #15
/*     */     //   740: sipush #256
/*     */     //   743: iand
/*     */     //   744: ifeq -> 767
/*     */     //   747: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   750: aload #12
/*     */     //   752: bipush #6
/*     */     //   754: invokestatic getIconButtonStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   757: astore #8
/*     */     //   759: iload #16
/*     */     //   761: ldc_w -234881025
/*     */     //   764: iand
/*     */     //   765: istore #16
/*     */     //   767: iload #15
/*     */     //   769: sipush #512
/*     */     //   772: iand
/*     */     //   773: ifeq -> 779
/*     */     //   776: aconst_null
/*     */     //   777: astore #9
/*     */     //   779: iload #15
/*     */     //   781: sipush #1024
/*     */     //   784: iand
/*     */     //   785: ifeq -> 874
/*     */     //   788: aload #12
/*     */     //   790: ldc_w 1250456444
/*     */     //   793: invokeinterface startReplaceGroup : (I)V
/*     */     //   798: aload #12
/*     */     //   800: astore #19
/*     */     //   802: iconst_0
/*     */     //   803: istore #20
/*     */     //   805: iconst_0
/*     */     //   806: istore #21
/*     */     //   808: aload #19
/*     */     //   810: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   815: astore #22
/*     */     //   817: iconst_0
/*     */     //   818: istore #23
/*     */     //   820: aload #22
/*     */     //   822: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   825: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   828: if_acmpne -> 853
/*     */     //   831: iconst_0
/*     */     //   832: istore #24
/*     */     //   834: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   837: astore #24
/*     */     //   839: aload #19
/*     */     //   841: aload #24
/*     */     //   843: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   848: aload #24
/*     */     //   850: goto -> 855
/*     */     //   853: aload #22
/*     */     //   855: nop
/*     */     //   856: nop
/*     */     //   857: nop
/*     */     //   858: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   861: astore #18
/*     */     //   863: aload #12
/*     */     //   865: invokeinterface endReplaceGroup : ()V
/*     */     //   870: aload #18
/*     */     //   872: astore #10
/*     */     //   874: iload #15
/*     */     //   876: sipush #2048
/*     */     //   879: iand
/*     */     //   880: ifeq -> 939
/*     */     //   883: aload_0
/*     */     //   884: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   887: astore #11
/*     */     //   889: iload #17
/*     */     //   891: bipush #-113
/*     */     //   893: iand
/*     */     //   894: istore #17
/*     */     //   896: goto -> 939
/*     */     //   899: aload #12
/*     */     //   901: invokeinterface skipToGroupEnd : ()V
/*     */     //   906: iload #15
/*     */     //   908: sipush #256
/*     */     //   911: iand
/*     */     //   912: ifeq -> 923
/*     */     //   915: iload #16
/*     */     //   917: ldc_w -234881025
/*     */     //   920: iand
/*     */     //   921: istore #16
/*     */     //   923: iload #15
/*     */     //   925: sipush #2048
/*     */     //   928: iand
/*     */     //   929: ifeq -> 939
/*     */     //   932: iload #17
/*     */     //   934: bipush #-113
/*     */     //   936: iand
/*     */     //   937: istore #17
/*     */     //   939: aload #12
/*     */     //   941: invokeinterface endDefaults : ()V
/*     */     //   946: invokestatic isTraceInProgress : ()Z
/*     */     //   949: ifeq -> 965
/*     */     //   952: ldc_w -718177631
/*     */     //   955: iload #16
/*     */     //   957: iload #17
/*     */     //   959: ldc_w 'org.jetbrains.jewel.ui.component.SelectableIconActionButton (SelectableIconActionButton.kt:102)'
/*     */     //   962: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   965: aload_0
/*     */     //   966: aload_1
/*     */     //   967: aload #11
/*     */     //   969: iload_2
/*     */     //   970: iload #6
/*     */     //   972: iload #7
/*     */     //   974: aload #8
/*     */     //   976: aload #10
/*     */     //   978: aload #5
/*     */     //   980: aload #9
/*     */     //   982: aload_3
/*     */     //   983: aload #4
/*     */     //   985: aload #12
/*     */     //   987: bipush #14
/*     */     //   989: iload #16
/*     */     //   991: iand
/*     */     //   992: bipush #112
/*     */     //   994: iload #16
/*     */     //   996: iand
/*     */     //   997: ior
/*     */     //   998: sipush #896
/*     */     //   1001: iload #17
/*     */     //   1003: iconst_3
/*     */     //   1004: ishl
/*     */     //   1005: iand
/*     */     //   1006: ior
/*     */     //   1007: sipush #7168
/*     */     //   1010: iload #16
/*     */     //   1012: iconst_3
/*     */     //   1013: ishl
/*     */     //   1014: iand
/*     */     //   1015: ior
/*     */     //   1016: ldc 57344
/*     */     //   1018: iload #16
/*     */     //   1020: bipush #6
/*     */     //   1022: ishr
/*     */     //   1023: iand
/*     */     //   1024: ior
/*     */     //   1025: ldc 458752
/*     */     //   1027: iload #16
/*     */     //   1029: bipush #6
/*     */     //   1031: ishr
/*     */     //   1032: iand
/*     */     //   1033: ior
/*     */     //   1034: ldc 3670016
/*     */     //   1036: iload #16
/*     */     //   1038: bipush #6
/*     */     //   1040: ishr
/*     */     //   1041: iand
/*     */     //   1042: ior
/*     */     //   1043: ldc 29360128
/*     */     //   1045: iload #17
/*     */     //   1047: bipush #21
/*     */     //   1049: ishl
/*     */     //   1050: iand
/*     */     //   1051: ior
/*     */     //   1052: ldc 234881024
/*     */     //   1054: iload #16
/*     */     //   1056: bipush #9
/*     */     //   1058: ishl
/*     */     //   1059: iand
/*     */     //   1060: ior
/*     */     //   1061: ldc 1879048192
/*     */     //   1063: iload #16
/*     */     //   1065: iand
/*     */     //   1066: ior
/*     */     //   1067: bipush #14
/*     */     //   1069: iload #16
/*     */     //   1071: bipush #9
/*     */     //   1073: ishr
/*     */     //   1074: iand
/*     */     //   1075: bipush #112
/*     */     //   1077: iload #16
/*     */     //   1079: bipush #9
/*     */     //   1081: ishr
/*     */     //   1082: iand
/*     */     //   1083: ior
/*     */     //   1084: invokestatic CoreSelectableIconActionButton : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Ljava/lang/Class;ZZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorFilter;[Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1087: invokestatic isTraceInProgress : ()Z
/*     */     //   1090: ifeq -> 1106
/*     */     //   1093: invokestatic traceEventEnd : ()V
/*     */     //   1096: goto -> 1106
/*     */     //   1099: aload #12
/*     */     //   1101: invokeinterface skipToGroupEnd : ()V
/*     */     //   1106: aload #12
/*     */     //   1108: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1113: dup
/*     */     //   1114: ifnull -> 1156
/*     */     //   1117: aload_0
/*     */     //   1118: aload_1
/*     */     //   1119: iload_2
/*     */     //   1120: aload_3
/*     */     //   1121: aload #4
/*     */     //   1123: aload #5
/*     */     //   1125: iload #6
/*     */     //   1127: iload #7
/*     */     //   1129: aload #8
/*     */     //   1131: aload #9
/*     */     //   1133: aload #10
/*     */     //   1135: aload #11
/*     */     //   1137: iload #13
/*     */     //   1139: iload #14
/*     */     //   1141: iload #15
/*     */     //   1143: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Z[Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/foundation/interaction/MutableInteractionSource;Ljava/lang/Class;III)Lkotlin/jvm/functions/Function2;
/*     */     //   1148: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1153: goto -> 1157
/*     */     //   1156: pop
/*     */     //   1157: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #103	-> 20
/*     */     //   #96	-> 707
/*     */     //   #97	-> 723
/*     */     //   #98	-> 735
/*     */     //   #99	-> 747
/*     */     //   #100	-> 776
/*     */     //   #101	-> 788
/*     */     //   #272	-> 808
/*     */     //   #273	-> 820
/*     */     //   #274	-> 831
/*     */     //   #101	-> 834
/*     */     //   #274	-> 837
/*     */     //   #275	-> 839
/*     */     //   #276	-> 848
/*     */     //   #277	-> 853
/*     */     //   #273	-> 855
/*     */     //   #272	-> 856
/*     */     //   #272	-> 857
/*     */     //   #101	-> 858
/*     */     //   #102	-> 883
/*     */     //   #103	-> 962
/*     */     //   #105	-> 965
/*     */     //   #106	-> 966
/*     */     //   #107	-> 967
/*     */     //   #108	-> 969
/*     */     //   #109	-> 970
/*     */     //   #110	-> 972
/*     */     //   #111	-> 974
/*     */     //   #112	-> 976
/*     */     //   #113	-> 978
/*     */     //   #114	-> 980
/*     */     //   #115	-> 982
/*     */     //   #116	-> 983
/*     */     //   #104	-> 1084
/*     */     //   #118	-> 1099
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   834	3	24	$i$a$-cache-SelectableIconActionButtonKt$SelectableIconActionButton$6	I
/*     */     //   839	11	24	value$iv	Ljava/lang/Object;
/*     */     //   820	36	23	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   817	39	22	it$iv	Ljava/lang/Object;
/*     */     //   808	50	21	$i$f$cache	I
/*     */     //   805	53	19	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   805	53	20	invalid$iv	Z
/*     */     //   36	1122	16	$dirty	I
/*     */     //   40	1118	17	$dirty1	I
/*     */     //   0	1158	0	key	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   0	1158	1	contentDescription	Ljava/lang/String;
/*     */     //   0	1158	2	selected	Z
/*     */     //   0	1158	3	extraHints	[Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   0	1158	4	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1158	5	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1158	6	enabled	Z
/*     */     //   0	1158	7	focusable	Z
/*     */     //   0	1158	8	style	Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   0	1158	9	colorFilter	Landroidx/compose/ui/graphics/ColorFilter;
/*     */     //   0	1158	10	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1158	11	iconClass	Ljava/lang/Class;
/*     */     //   0	1158	12	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1158	13	$changed	I
/*     */     //   0	1158	14	$changed1	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
/*     */   public static final void SelectableIconActionButton(@NotNull IconKey key, @Nullable String contentDescription, boolean selected, @NotNull PainterHint[] extraHints, @NotNull Function0 onClick, @Nullable Modifier modifier, boolean enabled, boolean focusable, @Nullable IconButtonStyle style, @Nullable ColorFilter colorFilter, @Nullable TooltipStyle tooltipStyle, @Nullable Modifier tooltipModifier, @Nullable TooltipPlacement tooltipPlacement, @Nullable MutableInteractionSource interactionSource, @Nullable Class iconClass, @NotNull Function2 tooltip, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'key'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_3
/*     */     //   7: ldc_w 'extraHints'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload #4
/*     */     //   15: ldc 'onClick'
/*     */     //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   20: aload #15
/*     */     //   22: ldc 'tooltip'
/*     */     //   24: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   27: aload #16
/*     */     //   29: ldc_w 95834333
/*     */     //   32: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   37: astore #16
/*     */     //   39: iload #17
/*     */     //   41: istore #20
/*     */     //   43: iload #18
/*     */     //   45: istore #21
/*     */     //   47: iload #19
/*     */     //   49: iconst_1
/*     */     //   50: iand
/*     */     //   51: ifeq -> 64
/*     */     //   54: iload #20
/*     */     //   56: bipush #6
/*     */     //   58: ior
/*     */     //   59: istore #20
/*     */     //   61: goto -> 112
/*     */     //   64: iload #17
/*     */     //   66: bipush #6
/*     */     //   68: iand
/*     */     //   69: ifne -> 112
/*     */     //   72: iload #20
/*     */     //   74: iload #17
/*     */     //   76: bipush #8
/*     */     //   78: iand
/*     */     //   79: ifne -> 93
/*     */     //   82: aload #16
/*     */     //   84: aload_0
/*     */     //   85: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   90: goto -> 101
/*     */     //   93: aload #16
/*     */     //   95: aload_0
/*     */     //   96: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   101: ifeq -> 108
/*     */     //   104: iconst_4
/*     */     //   105: goto -> 109
/*     */     //   108: iconst_2
/*     */     //   109: ior
/*     */     //   110: istore #20
/*     */     //   112: iload #19
/*     */     //   114: iconst_2
/*     */     //   115: iand
/*     */     //   116: ifeq -> 129
/*     */     //   119: iload #20
/*     */     //   121: bipush #48
/*     */     //   123: ior
/*     */     //   124: istore #20
/*     */     //   126: goto -> 160
/*     */     //   129: iload #17
/*     */     //   131: bipush #48
/*     */     //   133: iand
/*     */     //   134: ifne -> 160
/*     */     //   137: iload #20
/*     */     //   139: aload #16
/*     */     //   141: aload_1
/*     */     //   142: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   147: ifeq -> 155
/*     */     //   150: bipush #32
/*     */     //   152: goto -> 157
/*     */     //   155: bipush #16
/*     */     //   157: ior
/*     */     //   158: istore #20
/*     */     //   160: iload #19
/*     */     //   162: iconst_4
/*     */     //   163: iand
/*     */     //   164: ifeq -> 178
/*     */     //   167: iload #20
/*     */     //   169: sipush #384
/*     */     //   172: ior
/*     */     //   173: istore #20
/*     */     //   175: goto -> 212
/*     */     //   178: iload #17
/*     */     //   180: sipush #384
/*     */     //   183: iand
/*     */     //   184: ifne -> 212
/*     */     //   187: iload #20
/*     */     //   189: aload #16
/*     */     //   191: iload_2
/*     */     //   192: invokeinterface changed : (Z)Z
/*     */     //   197: ifeq -> 206
/*     */     //   200: sipush #256
/*     */     //   203: goto -> 209
/*     */     //   206: sipush #128
/*     */     //   209: ior
/*     */     //   210: istore #20
/*     */     //   212: iload #19
/*     */     //   214: bipush #8
/*     */     //   216: iand
/*     */     //   217: ifeq -> 231
/*     */     //   220: iload #20
/*     */     //   222: sipush #3072
/*     */     //   225: ior
/*     */     //   226: istore #20
/*     */     //   228: goto -> 265
/*     */     //   231: iload #17
/*     */     //   233: sipush #3072
/*     */     //   236: iand
/*     */     //   237: ifne -> 265
/*     */     //   240: iload #20
/*     */     //   242: aload #16
/*     */     //   244: aload_3
/*     */     //   245: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   250: ifeq -> 259
/*     */     //   253: sipush #2048
/*     */     //   256: goto -> 262
/*     */     //   259: sipush #1024
/*     */     //   262: ior
/*     */     //   263: istore #20
/*     */     //   265: iload #19
/*     */     //   267: bipush #16
/*     */     //   269: iand
/*     */     //   270: ifeq -> 284
/*     */     //   273: iload #20
/*     */     //   275: sipush #24576
/*     */     //   278: ior
/*     */     //   279: istore #20
/*     */     //   281: goto -> 319
/*     */     //   284: iload #17
/*     */     //   286: sipush #24576
/*     */     //   289: iand
/*     */     //   290: ifne -> 319
/*     */     //   293: iload #20
/*     */     //   295: aload #16
/*     */     //   297: aload #4
/*     */     //   299: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   304: ifeq -> 313
/*     */     //   307: sipush #16384
/*     */     //   310: goto -> 316
/*     */     //   313: sipush #8192
/*     */     //   316: ior
/*     */     //   317: istore #20
/*     */     //   319: iload #19
/*     */     //   321: bipush #32
/*     */     //   323: iand
/*     */     //   324: ifeq -> 337
/*     */     //   327: iload #20
/*     */     //   329: ldc 196608
/*     */     //   331: ior
/*     */     //   332: istore #20
/*     */     //   334: goto -> 369
/*     */     //   337: iload #17
/*     */     //   339: ldc 196608
/*     */     //   341: iand
/*     */     //   342: ifne -> 369
/*     */     //   345: iload #20
/*     */     //   347: aload #16
/*     */     //   349: aload #5
/*     */     //   351: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   356: ifeq -> 364
/*     */     //   359: ldc 131072
/*     */     //   361: goto -> 366
/*     */     //   364: ldc 65536
/*     */     //   366: ior
/*     */     //   367: istore #20
/*     */     //   369: iload #19
/*     */     //   371: bipush #64
/*     */     //   373: iand
/*     */     //   374: ifeq -> 387
/*     */     //   377: iload #20
/*     */     //   379: ldc 1572864
/*     */     //   381: ior
/*     */     //   382: istore #20
/*     */     //   384: goto -> 419
/*     */     //   387: iload #17
/*     */     //   389: ldc 1572864
/*     */     //   391: iand
/*     */     //   392: ifne -> 419
/*     */     //   395: iload #20
/*     */     //   397: aload #16
/*     */     //   399: iload #6
/*     */     //   401: invokeinterface changed : (Z)Z
/*     */     //   406: ifeq -> 414
/*     */     //   409: ldc 1048576
/*     */     //   411: goto -> 416
/*     */     //   414: ldc 524288
/*     */     //   416: ior
/*     */     //   417: istore #20
/*     */     //   419: iload #19
/*     */     //   421: sipush #128
/*     */     //   424: iand
/*     */     //   425: ifeq -> 438
/*     */     //   428: iload #20
/*     */     //   430: ldc 12582912
/*     */     //   432: ior
/*     */     //   433: istore #20
/*     */     //   435: goto -> 470
/*     */     //   438: iload #17
/*     */     //   440: ldc 12582912
/*     */     //   442: iand
/*     */     //   443: ifne -> 470
/*     */     //   446: iload #20
/*     */     //   448: aload #16
/*     */     //   450: iload #7
/*     */     //   452: invokeinterface changed : (Z)Z
/*     */     //   457: ifeq -> 465
/*     */     //   460: ldc 8388608
/*     */     //   462: goto -> 467
/*     */     //   465: ldc 4194304
/*     */     //   467: ior
/*     */     //   468: istore #20
/*     */     //   470: iload #17
/*     */     //   472: ldc 100663296
/*     */     //   474: iand
/*     */     //   475: ifne -> 511
/*     */     //   478: iload #20
/*     */     //   480: iload #19
/*     */     //   482: sipush #256
/*     */     //   485: iand
/*     */     //   486: ifne -> 506
/*     */     //   489: aload #16
/*     */     //   491: aload #8
/*     */     //   493: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   498: ifeq -> 506
/*     */     //   501: ldc 67108864
/*     */     //   503: goto -> 508
/*     */     //   506: ldc 33554432
/*     */     //   508: ior
/*     */     //   509: istore #20
/*     */     //   511: iload #19
/*     */     //   513: sipush #512
/*     */     //   516: iand
/*     */     //   517: ifeq -> 530
/*     */     //   520: iload #20
/*     */     //   522: ldc 805306368
/*     */     //   524: ior
/*     */     //   525: istore #20
/*     */     //   527: goto -> 562
/*     */     //   530: iload #17
/*     */     //   532: ldc 805306368
/*     */     //   534: iand
/*     */     //   535: ifne -> 562
/*     */     //   538: iload #20
/*     */     //   540: aload #16
/*     */     //   542: aload #9
/*     */     //   544: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   549: ifeq -> 557
/*     */     //   552: ldc 536870912
/*     */     //   554: goto -> 559
/*     */     //   557: ldc 268435456
/*     */     //   559: ior
/*     */     //   560: istore #20
/*     */     //   562: iload #18
/*     */     //   564: bipush #6
/*     */     //   566: iand
/*     */     //   567: ifne -> 601
/*     */     //   570: iload #21
/*     */     //   572: iload #19
/*     */     //   574: sipush #1024
/*     */     //   577: iand
/*     */     //   578: ifne -> 597
/*     */     //   581: aload #16
/*     */     //   583: aload #10
/*     */     //   585: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   590: ifeq -> 597
/*     */     //   593: iconst_4
/*     */     //   594: goto -> 598
/*     */     //   597: iconst_2
/*     */     //   598: ior
/*     */     //   599: istore #21
/*     */     //   601: iload #19
/*     */     //   603: sipush #2048
/*     */     //   606: iand
/*     */     //   607: ifeq -> 620
/*     */     //   610: iload #21
/*     */     //   612: bipush #48
/*     */     //   614: ior
/*     */     //   615: istore #21
/*     */     //   617: goto -> 652
/*     */     //   620: iload #18
/*     */     //   622: bipush #48
/*     */     //   624: iand
/*     */     //   625: ifne -> 652
/*     */     //   628: iload #21
/*     */     //   630: aload #16
/*     */     //   632: aload #11
/*     */     //   634: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   639: ifeq -> 647
/*     */     //   642: bipush #32
/*     */     //   644: goto -> 649
/*     */     //   647: bipush #16
/*     */     //   649: ior
/*     */     //   650: istore #21
/*     */     //   652: iload #18
/*     */     //   654: sipush #384
/*     */     //   657: iand
/*     */     //   658: ifne -> 696
/*     */     //   661: iload #21
/*     */     //   663: iload #19
/*     */     //   665: sipush #4096
/*     */     //   668: iand
/*     */     //   669: ifne -> 690
/*     */     //   672: aload #16
/*     */     //   674: aload #12
/*     */     //   676: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   681: ifeq -> 690
/*     */     //   684: sipush #256
/*     */     //   687: goto -> 693
/*     */     //   690: sipush #128
/*     */     //   693: ior
/*     */     //   694: istore #21
/*     */     //   696: iload #19
/*     */     //   698: sipush #8192
/*     */     //   701: iand
/*     */     //   702: ifeq -> 716
/*     */     //   705: iload #21
/*     */     //   707: sipush #3072
/*     */     //   710: ior
/*     */     //   711: istore #21
/*     */     //   713: goto -> 751
/*     */     //   716: iload #18
/*     */     //   718: sipush #3072
/*     */     //   721: iand
/*     */     //   722: ifne -> 751
/*     */     //   725: iload #21
/*     */     //   727: aload #16
/*     */     //   729: aload #13
/*     */     //   731: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   736: ifeq -> 745
/*     */     //   739: sipush #2048
/*     */     //   742: goto -> 748
/*     */     //   745: sipush #1024
/*     */     //   748: ior
/*     */     //   749: istore #21
/*     */     //   751: iload #18
/*     */     //   753: sipush #24576
/*     */     //   756: iand
/*     */     //   757: ifne -> 795
/*     */     //   760: iload #21
/*     */     //   762: iload #19
/*     */     //   764: sipush #16384
/*     */     //   767: iand
/*     */     //   768: ifne -> 789
/*     */     //   771: aload #16
/*     */     //   773: aload #14
/*     */     //   775: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   780: ifeq -> 789
/*     */     //   783: sipush #16384
/*     */     //   786: goto -> 792
/*     */     //   789: sipush #8192
/*     */     //   792: ior
/*     */     //   793: istore #21
/*     */     //   795: iload #19
/*     */     //   797: ldc 32768
/*     */     //   799: iand
/*     */     //   800: ifeq -> 813
/*     */     //   803: iload #21
/*     */     //   805: ldc 196608
/*     */     //   807: ior
/*     */     //   808: istore #21
/*     */     //   810: goto -> 845
/*     */     //   813: iload #18
/*     */     //   815: ldc 196608
/*     */     //   817: iand
/*     */     //   818: ifne -> 845
/*     */     //   821: iload #21
/*     */     //   823: aload #16
/*     */     //   825: aload #15
/*     */     //   827: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   832: ifeq -> 840
/*     */     //   835: ldc 131072
/*     */     //   837: goto -> 842
/*     */     //   840: ldc 65536
/*     */     //   842: ior
/*     */     //   843: istore #21
/*     */     //   845: iload #20
/*     */     //   847: ldc 306783379
/*     */     //   849: iand
/*     */     //   850: ldc 306783378
/*     */     //   852: if_icmpne -> 875
/*     */     //   855: iload #21
/*     */     //   857: ldc 74899
/*     */     //   859: iand
/*     */     //   860: ldc 74898
/*     */     //   862: if_icmpne -> 875
/*     */     //   865: aload #16
/*     */     //   867: invokeinterface getSkipping : ()Z
/*     */     //   872: ifne -> 1411
/*     */     //   875: aload #16
/*     */     //   877: invokeinterface startDefaults : ()V
/*     */     //   882: iload #17
/*     */     //   884: iconst_1
/*     */     //   885: iand
/*     */     //   886: ifeq -> 899
/*     */     //   889: aload #16
/*     */     //   891: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   896: ifeq -> 1207
/*     */     //   899: iload #19
/*     */     //   901: bipush #32
/*     */     //   903: iand
/*     */     //   904: ifeq -> 915
/*     */     //   907: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   910: checkcast androidx/compose/ui/Modifier
/*     */     //   913: astore #5
/*     */     //   915: iload #19
/*     */     //   917: bipush #64
/*     */     //   919: iand
/*     */     //   920: ifeq -> 926
/*     */     //   923: iconst_1
/*     */     //   924: istore #6
/*     */     //   926: iload #19
/*     */     //   928: sipush #128
/*     */     //   931: iand
/*     */     //   932: ifeq -> 938
/*     */     //   935: iconst_1
/*     */     //   936: istore #7
/*     */     //   938: iload #19
/*     */     //   940: sipush #256
/*     */     //   943: iand
/*     */     //   944: ifeq -> 967
/*     */     //   947: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   950: aload #16
/*     */     //   952: bipush #6
/*     */     //   954: invokestatic getIconButtonStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   957: astore #8
/*     */     //   959: iload #20
/*     */     //   961: ldc_w -234881025
/*     */     //   964: iand
/*     */     //   965: istore #20
/*     */     //   967: iload #19
/*     */     //   969: sipush #512
/*     */     //   972: iand
/*     */     //   973: ifeq -> 979
/*     */     //   976: aconst_null
/*     */     //   977: astore #9
/*     */     //   979: iload #19
/*     */     //   981: sipush #1024
/*     */     //   984: iand
/*     */     //   985: ifeq -> 1007
/*     */     //   988: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   991: aload #16
/*     */     //   993: bipush #6
/*     */     //   995: invokestatic getTooltipStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;
/*     */     //   998: astore #10
/*     */     //   1000: iload #21
/*     */     //   1002: bipush #-15
/*     */     //   1004: iand
/*     */     //   1005: istore #21
/*     */     //   1007: iload #19
/*     */     //   1009: sipush #2048
/*     */     //   1012: iand
/*     */     //   1013: ifeq -> 1024
/*     */     //   1016: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1019: checkcast androidx/compose/ui/Modifier
/*     */     //   1022: astore #11
/*     */     //   1024: iload #19
/*     */     //   1026: sipush #4096
/*     */     //   1029: iand
/*     */     //   1030: ifeq -> 1086
/*     */     //   1033: new org/jetbrains/jewel/ui/component/FixedCursorPoint
/*     */     //   1036: dup
/*     */     //   1037: iconst_0
/*     */     //   1038: istore #22
/*     */     //   1040: iconst_0
/*     */     //   1041: istore #23
/*     */     //   1043: iload #22
/*     */     //   1045: i2f
/*     */     //   1046: invokestatic constructor-impl : (F)F
/*     */     //   1049: bipush #16
/*     */     //   1051: istore #22
/*     */     //   1053: iconst_0
/*     */     //   1054: istore #23
/*     */     //   1056: iload #22
/*     */     //   1058: i2f
/*     */     //   1059: invokestatic constructor-impl : (F)F
/*     */     //   1062: invokestatic DpOffset-YgX7TsA : (FF)J
/*     */     //   1065: aconst_null
/*     */     //   1066: fconst_0
/*     */     //   1067: bipush #6
/*     */     //   1069: aconst_null
/*     */     //   1070: invokespecial <init> : (JLandroidx/compose/ui/Alignment;FILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   1073: checkcast androidx/compose/foundation/TooltipPlacement
/*     */     //   1076: astore #12
/*     */     //   1078: iload #21
/*     */     //   1080: sipush #-897
/*     */     //   1083: iand
/*     */     //   1084: istore #21
/*     */     //   1086: iload #19
/*     */     //   1088: sipush #8192
/*     */     //   1091: iand
/*     */     //   1092: ifeq -> 1181
/*     */     //   1095: aload #16
/*     */     //   1097: ldc_w 1250487868
/*     */     //   1100: invokeinterface startReplaceGroup : (I)V
/*     */     //   1105: aload #16
/*     */     //   1107: astore #23
/*     */     //   1109: iconst_0
/*     */     //   1110: istore #24
/*     */     //   1112: iconst_0
/*     */     //   1113: istore #25
/*     */     //   1115: aload #23
/*     */     //   1117: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1122: astore #26
/*     */     //   1124: iconst_0
/*     */     //   1125: istore #27
/*     */     //   1127: aload #26
/*     */     //   1129: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1132: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1135: if_acmpne -> 1160
/*     */     //   1138: iconst_0
/*     */     //   1139: istore #28
/*     */     //   1141: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   1144: astore #28
/*     */     //   1146: aload #23
/*     */     //   1148: aload #28
/*     */     //   1150: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1155: aload #28
/*     */     //   1157: goto -> 1162
/*     */     //   1160: aload #26
/*     */     //   1162: nop
/*     */     //   1163: nop
/*     */     //   1164: nop
/*     */     //   1165: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   1168: astore #22
/*     */     //   1170: aload #16
/*     */     //   1172: invokeinterface endReplaceGroup : ()V
/*     */     //   1177: aload #22
/*     */     //   1179: astore #13
/*     */     //   1181: iload #19
/*     */     //   1183: sipush #16384
/*     */     //   1186: iand
/*     */     //   1187: ifeq -> 1281
/*     */     //   1190: aload_0
/*     */     //   1191: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   1194: astore #14
/*     */     //   1196: iload #21
/*     */     //   1198: ldc_w -57345
/*     */     //   1201: iand
/*     */     //   1202: istore #21
/*     */     //   1204: goto -> 1281
/*     */     //   1207: aload #16
/*     */     //   1209: invokeinterface skipToGroupEnd : ()V
/*     */     //   1214: iload #19
/*     */     //   1216: sipush #256
/*     */     //   1219: iand
/*     */     //   1220: ifeq -> 1231
/*     */     //   1223: iload #20
/*     */     //   1225: ldc_w -234881025
/*     */     //   1228: iand
/*     */     //   1229: istore #20
/*     */     //   1231: iload #19
/*     */     //   1233: sipush #1024
/*     */     //   1236: iand
/*     */     //   1237: ifeq -> 1247
/*     */     //   1240: iload #21
/*     */     //   1242: bipush #-15
/*     */     //   1244: iand
/*     */     //   1245: istore #21
/*     */     //   1247: iload #19
/*     */     //   1249: sipush #4096
/*     */     //   1252: iand
/*     */     //   1253: ifeq -> 1264
/*     */     //   1256: iload #21
/*     */     //   1258: sipush #-897
/*     */     //   1261: iand
/*     */     //   1262: istore #21
/*     */     //   1264: iload #19
/*     */     //   1266: sipush #16384
/*     */     //   1269: iand
/*     */     //   1270: ifeq -> 1281
/*     */     //   1273: iload #21
/*     */     //   1275: ldc_w -57345
/*     */     //   1278: iand
/*     */     //   1279: istore #21
/*     */     //   1281: aload #16
/*     */     //   1283: invokeinterface endDefaults : ()V
/*     */     //   1288: invokestatic isTraceInProgress : ()Z
/*     */     //   1291: ifeq -> 1307
/*     */     //   1294: ldc_w 95834333
/*     */     //   1297: iload #20
/*     */     //   1299: iload #21
/*     */     //   1301: ldc_w 'org.jetbrains.jewel.ui.component.SelectableIconActionButton (SelectableIconActionButton.kt:137)'
/*     */     //   1304: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   1307: aload #15
/*     */     //   1309: aload #11
/*     */     //   1311: iconst_0
/*     */     //   1312: aload #10
/*     */     //   1314: aload #12
/*     */     //   1316: ldc_w -113045232
/*     */     //   1319: iconst_1
/*     */     //   1320: new org/jetbrains/jewel/ui/component/SelectableIconActionButtonKt$SelectableIconActionButton$9
/*     */     //   1323: dup
/*     */     //   1324: aload_0
/*     */     //   1325: aload_1
/*     */     //   1326: aload #14
/*     */     //   1328: iload_2
/*     */     //   1329: iload #6
/*     */     //   1331: iload #7
/*     */     //   1333: aload #8
/*     */     //   1335: aload #13
/*     */     //   1337: aload #5
/*     */     //   1339: aload #9
/*     */     //   1341: aload_3
/*     */     //   1342: aload #4
/*     */     //   1344: invokespecial <init> : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Ljava/lang/Class;ZZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorFilter;[Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;)V
/*     */     //   1347: aload #16
/*     */     //   1349: bipush #54
/*     */     //   1351: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1354: checkcast kotlin/jvm/functions/Function2
/*     */     //   1357: aload #16
/*     */     //   1359: ldc 196608
/*     */     //   1361: bipush #14
/*     */     //   1363: iload #21
/*     */     //   1365: bipush #15
/*     */     //   1367: ishr
/*     */     //   1368: iand
/*     */     //   1369: ior
/*     */     //   1370: bipush #112
/*     */     //   1372: iload #21
/*     */     //   1374: iand
/*     */     //   1375: ior
/*     */     //   1376: sipush #7168
/*     */     //   1379: iload #21
/*     */     //   1381: bipush #9
/*     */     //   1383: ishl
/*     */     //   1384: iand
/*     */     //   1385: ior
/*     */     //   1386: ldc 57344
/*     */     //   1388: iload #21
/*     */     //   1390: bipush #6
/*     */     //   1392: ishl
/*     */     //   1393: iand
/*     */     //   1394: ior
/*     */     //   1395: iconst_4
/*     */     //   1396: invokestatic Tooltip : (Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/foundation/TooltipPlacement;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1399: invokestatic isTraceInProgress : ()Z
/*     */     //   1402: ifeq -> 1418
/*     */     //   1405: invokestatic traceEventEnd : ()V
/*     */     //   1408: goto -> 1418
/*     */     //   1411: aload #16
/*     */     //   1413: invokeinterface skipToGroupEnd : ()V
/*     */     //   1418: aload #16
/*     */     //   1420: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1425: dup
/*     */     //   1426: ifnull -> 1476
/*     */     //   1429: aload_0
/*     */     //   1430: aload_1
/*     */     //   1431: iload_2
/*     */     //   1432: aload_3
/*     */     //   1433: aload #4
/*     */     //   1435: aload #5
/*     */     //   1437: iload #6
/*     */     //   1439: iload #7
/*     */     //   1441: aload #8
/*     */     //   1443: aload #9
/*     */     //   1445: aload #10
/*     */     //   1447: aload #11
/*     */     //   1449: aload #12
/*     */     //   1451: aload #13
/*     */     //   1453: aload #14
/*     */     //   1455: aload #15
/*     */     //   1457: iload #17
/*     */     //   1459: iload #18
/*     */     //   1461: iload #19
/*     */     //   1463: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Z[Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/TooltipPlacement;Landroidx/compose/foundation/interaction/MutableInteractionSource;Ljava/lang/Class;Lkotlin/jvm/functions/Function2;III)Lkotlin/jvm/functions/Function2;
/*     */     //   1468: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1473: goto -> 1477
/*     */     //   1476: pop
/*     */     //   1477: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #138	-> 27
/*     */     //   #127	-> 907
/*     */     //   #128	-> 923
/*     */     //   #129	-> 935
/*     */     //   #130	-> 947
/*     */     //   #131	-> 976
/*     */     //   #132	-> 988
/*     */     //   #133	-> 1016
/*     */     //   #134	-> 1033
/*     */     //   #278	-> 1043
/*     */     //   #134	-> 1049
/*     */     //   #278	-> 1056
/*     */     //   #134	-> 1062
/*     */     //   #135	-> 1095
/*     */     //   #279	-> 1115
/*     */     //   #280	-> 1127
/*     */     //   #281	-> 1138
/*     */     //   #135	-> 1141
/*     */     //   #281	-> 1144
/*     */     //   #282	-> 1146
/*     */     //   #283	-> 1155
/*     */     //   #284	-> 1160
/*     */     //   #280	-> 1162
/*     */     //   #279	-> 1163
/*     */     //   #279	-> 1164
/*     */     //   #135	-> 1165
/*     */     //   #136	-> 1190
/*     */     //   #138	-> 1304
/*     */     //   #139	-> 1307
/*     */     //   #155	-> 1411
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   1043	6	23	$i$f$getDp	I
/*     */     //   1040	9	22	$this$dp$iv	I
/*     */     //   1056	6	23	$i$f$getDp	I
/*     */     //   1053	9	22	$this$dp$iv	I
/*     */     //   1141	3	28	$i$a$-cache-SelectableIconActionButtonKt$SelectableIconActionButton$8	I
/*     */     //   1146	11	28	value$iv	Ljava/lang/Object;
/*     */     //   1127	36	27	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1124	39	26	it$iv	Ljava/lang/Object;
/*     */     //   1115	50	25	$i$f$cache	I
/*     */     //   1112	53	23	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1112	53	24	invalid$iv	Z
/*     */     //   43	1435	20	$dirty	I
/*     */     //   47	1431	21	$dirty1	I
/*     */     //   0	1478	0	key	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   0	1478	1	contentDescription	Ljava/lang/String;
/*     */     //   0	1478	2	selected	Z
/*     */     //   0	1478	3	extraHints	[Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   0	1478	4	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1478	5	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1478	6	enabled	Z
/*     */     //   0	1478	7	focusable	Z
/*     */     //   0	1478	8	style	Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   0	1478	9	colorFilter	Landroidx/compose/ui/graphics/ColorFilter;
/*     */     //   0	1478	10	tooltipStyle	Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;
/*     */     //   0	1478	11	tooltipModifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1478	12	tooltipPlacement	Landroidx/compose/foundation/TooltipPlacement;
/*     */     //   0	1478	13	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1478	14	iconClass	Ljava/lang/Class;
/*     */     //   0	1478	15	tooltip	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1478	16	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1478	17	$changed	I
/*     */     //   0	1478	18	$changed1	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class SelectableIconActionButtonKt$SelectableIconActionButton$9
/*     */     implements Function2<Composer, Integer, Unit>
/*     */   {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/* 140 */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-113045232, $changed, -1, "org.jetbrains.jewel.ui.component.SelectableIconActionButton.<anonymous> (SelectableIconActionButton.kt:139)");  SelectableIconActionButtonKt.CoreSelectableIconActionButton(
/* 141 */             this.$key, 
/*     */             
/* 143 */             this.$contentDescription, 
/* 144 */             this.$iconClass, 
/* 145 */             this.$selected, 
/* 146 */             this.$enabled, 
/* 147 */             this.$focusable, 
/* 148 */             this.$style, 
/* 149 */             this.$interactionSource, this.$modifier, 
/* 150 */             this.$colorFilter, 
/* 151 */             this.$extraHints, 
/* 152 */             this.$onClick, $composer, 0, 0); if (ComposerKt.isTraceInProgress())
/* 153 */           ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*     */     
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     SelectableIconActionButtonKt$SelectableIconActionButton$9(IconKey $key, String $contentDescription, Class<?> $iconClass, boolean $selected, boolean $enabled, boolean $focusable, IconButtonStyle $style, MutableInteractionSource $interactionSource, Modifier $modifier, ColorFilter $colorFilter, PainterHint[] $extraHints, Function0<Unit> $onClick) {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   private static final void BaseSelectableIconActionButton(IconKey key, String contentDescription, Class<?> iconClass, boolean selected, boolean enabled, boolean focusable, IconButtonStyle style, MutableInteractionSource interactionSource, Modifier modifier, ColorFilter colorFilter, PainterHint extraHint, Function0<Unit> onClick, Composer $composer, int $changed, int $changed1) {
/*     */     // Byte code:
/*     */     //   0: aload #12
/*     */     //   2: ldc_w -889634729
/*     */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   10: astore #12
/*     */     //   12: iload #13
/*     */     //   14: istore #15
/*     */     //   16: iload #14
/*     */     //   18: istore #16
/*     */     //   20: iload #13
/*     */     //   22: bipush #6
/*     */     //   24: iand
/*     */     //   25: ifne -> 68
/*     */     //   28: iload #15
/*     */     //   30: iload #13
/*     */     //   32: bipush #8
/*     */     //   34: iand
/*     */     //   35: ifne -> 49
/*     */     //   38: aload #12
/*     */     //   40: aload_0
/*     */     //   41: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   46: goto -> 57
/*     */     //   49: aload #12
/*     */     //   51: aload_0
/*     */     //   52: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   57: ifeq -> 64
/*     */     //   60: iconst_4
/*     */     //   61: goto -> 65
/*     */     //   64: iconst_2
/*     */     //   65: ior
/*     */     //   66: istore #15
/*     */     //   68: iload #13
/*     */     //   70: bipush #48
/*     */     //   72: iand
/*     */     //   73: ifne -> 99
/*     */     //   76: iload #15
/*     */     //   78: aload #12
/*     */     //   80: aload_1
/*     */     //   81: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   86: ifeq -> 94
/*     */     //   89: bipush #32
/*     */     //   91: goto -> 96
/*     */     //   94: bipush #16
/*     */     //   96: ior
/*     */     //   97: istore #15
/*     */     //   99: iload #13
/*     */     //   101: sipush #384
/*     */     //   104: iand
/*     */     //   105: ifne -> 133
/*     */     //   108: iload #15
/*     */     //   110: aload #12
/*     */     //   112: aload_2
/*     */     //   113: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   118: ifeq -> 127
/*     */     //   121: sipush #256
/*     */     //   124: goto -> 130
/*     */     //   127: sipush #128
/*     */     //   130: ior
/*     */     //   131: istore #15
/*     */     //   133: iload #13
/*     */     //   135: sipush #3072
/*     */     //   138: iand
/*     */     //   139: ifne -> 167
/*     */     //   142: iload #15
/*     */     //   144: aload #12
/*     */     //   146: iload_3
/*     */     //   147: invokeinterface changed : (Z)Z
/*     */     //   152: ifeq -> 161
/*     */     //   155: sipush #2048
/*     */     //   158: goto -> 164
/*     */     //   161: sipush #1024
/*     */     //   164: ior
/*     */     //   165: istore #15
/*     */     //   167: iload #13
/*     */     //   169: sipush #24576
/*     */     //   172: iand
/*     */     //   173: ifne -> 202
/*     */     //   176: iload #15
/*     */     //   178: aload #12
/*     */     //   180: iload #4
/*     */     //   182: invokeinterface changed : (Z)Z
/*     */     //   187: ifeq -> 196
/*     */     //   190: sipush #16384
/*     */     //   193: goto -> 199
/*     */     //   196: sipush #8192
/*     */     //   199: ior
/*     */     //   200: istore #15
/*     */     //   202: iload #13
/*     */     //   204: ldc 196608
/*     */     //   206: iand
/*     */     //   207: ifne -> 234
/*     */     //   210: iload #15
/*     */     //   212: aload #12
/*     */     //   214: iload #5
/*     */     //   216: invokeinterface changed : (Z)Z
/*     */     //   221: ifeq -> 229
/*     */     //   224: ldc 131072
/*     */     //   226: goto -> 231
/*     */     //   229: ldc 65536
/*     */     //   231: ior
/*     */     //   232: istore #15
/*     */     //   234: iload #13
/*     */     //   236: ldc 1572864
/*     */     //   238: iand
/*     */     //   239: ifne -> 266
/*     */     //   242: iload #15
/*     */     //   244: aload #12
/*     */     //   246: aload #6
/*     */     //   248: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   253: ifeq -> 261
/*     */     //   256: ldc 1048576
/*     */     //   258: goto -> 263
/*     */     //   261: ldc 524288
/*     */     //   263: ior
/*     */     //   264: istore #15
/*     */     //   266: iload #13
/*     */     //   268: ldc 12582912
/*     */     //   270: iand
/*     */     //   271: ifne -> 298
/*     */     //   274: iload #15
/*     */     //   276: aload #12
/*     */     //   278: aload #7
/*     */     //   280: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   285: ifeq -> 293
/*     */     //   288: ldc 8388608
/*     */     //   290: goto -> 295
/*     */     //   293: ldc 4194304
/*     */     //   295: ior
/*     */     //   296: istore #15
/*     */     //   298: iload #13
/*     */     //   300: ldc 100663296
/*     */     //   302: iand
/*     */     //   303: ifne -> 330
/*     */     //   306: iload #15
/*     */     //   308: aload #12
/*     */     //   310: aload #8
/*     */     //   312: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   317: ifeq -> 325
/*     */     //   320: ldc 67108864
/*     */     //   322: goto -> 327
/*     */     //   325: ldc 33554432
/*     */     //   327: ior
/*     */     //   328: istore #15
/*     */     //   330: iload #13
/*     */     //   332: ldc 805306368
/*     */     //   334: iand
/*     */     //   335: ifne -> 362
/*     */     //   338: iload #15
/*     */     //   340: aload #12
/*     */     //   342: aload #9
/*     */     //   344: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   349: ifeq -> 357
/*     */     //   352: ldc 536870912
/*     */     //   354: goto -> 359
/*     */     //   357: ldc 268435456
/*     */     //   359: ior
/*     */     //   360: istore #15
/*     */     //   362: iload #14
/*     */     //   364: bipush #6
/*     */     //   366: iand
/*     */     //   367: ifne -> 392
/*     */     //   370: iload #16
/*     */     //   372: aload #12
/*     */     //   374: aload #10
/*     */     //   376: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   381: ifeq -> 388
/*     */     //   384: iconst_4
/*     */     //   385: goto -> 389
/*     */     //   388: iconst_2
/*     */     //   389: ior
/*     */     //   390: istore #16
/*     */     //   392: iload #14
/*     */     //   394: bipush #48
/*     */     //   396: iand
/*     */     //   397: ifne -> 424
/*     */     //   400: iload #16
/*     */     //   402: aload #12
/*     */     //   404: aload #11
/*     */     //   406: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   411: ifeq -> 419
/*     */     //   414: bipush #32
/*     */     //   416: goto -> 421
/*     */     //   419: bipush #16
/*     */     //   421: ior
/*     */     //   422: istore #16
/*     */     //   424: iload #15
/*     */     //   426: ldc 306783379
/*     */     //   428: iand
/*     */     //   429: ldc 306783378
/*     */     //   431: if_icmpne -> 454
/*     */     //   434: iload #16
/*     */     //   436: bipush #19
/*     */     //   438: iand
/*     */     //   439: bipush #18
/*     */     //   441: if_icmpne -> 454
/*     */     //   444: aload #12
/*     */     //   446: invokeinterface getSkipping : ()Z
/*     */     //   451: ifne -> 717
/*     */     //   454: invokestatic isTraceInProgress : ()Z
/*     */     //   457: ifeq -> 473
/*     */     //   460: ldc_w -889634729
/*     */     //   463: iload #15
/*     */     //   465: iload #16
/*     */     //   467: ldc_w 'org.jetbrains.jewel.ui.component.BaseSelectableIconActionButton (SelectableIconActionButton.kt:170)'
/*     */     //   470: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   473: aload #10
/*     */     //   475: ifnull -> 595
/*     */     //   478: aload #12
/*     */     //   480: ldc_w -450509255
/*     */     //   483: invokeinterface startReplaceGroup : (I)V
/*     */     //   488: aload_0
/*     */     //   489: aload_1
/*     */     //   490: aload_2
/*     */     //   491: iload_3
/*     */     //   492: iload #4
/*     */     //   494: iload #5
/*     */     //   496: aload #6
/*     */     //   498: aload #7
/*     */     //   500: aload #8
/*     */     //   502: aload #9
/*     */     //   504: aload #10
/*     */     //   506: aload #11
/*     */     //   508: aload #12
/*     */     //   510: bipush #14
/*     */     //   512: iload #15
/*     */     //   514: iand
/*     */     //   515: bipush #112
/*     */     //   517: iload #15
/*     */     //   519: iand
/*     */     //   520: ior
/*     */     //   521: sipush #896
/*     */     //   524: iload #15
/*     */     //   526: iand
/*     */     //   527: ior
/*     */     //   528: sipush #7168
/*     */     //   531: iload #15
/*     */     //   533: iand
/*     */     //   534: ior
/*     */     //   535: ldc 57344
/*     */     //   537: iload #15
/*     */     //   539: iand
/*     */     //   540: ior
/*     */     //   541: ldc 458752
/*     */     //   543: iload #15
/*     */     //   545: iand
/*     */     //   546: ior
/*     */     //   547: ldc 3670016
/*     */     //   549: iload #15
/*     */     //   551: iand
/*     */     //   552: ior
/*     */     //   553: ldc 29360128
/*     */     //   555: iload #15
/*     */     //   557: iand
/*     */     //   558: ior
/*     */     //   559: ldc 234881024
/*     */     //   561: iload #15
/*     */     //   563: iand
/*     */     //   564: ior
/*     */     //   565: ldc 1879048192
/*     */     //   567: iload #15
/*     */     //   569: iand
/*     */     //   570: ior
/*     */     //   571: bipush #14
/*     */     //   573: iload #16
/*     */     //   575: iand
/*     */     //   576: bipush #112
/*     */     //   578: iload #16
/*     */     //   580: iand
/*     */     //   581: ior
/*     */     //   582: invokestatic CoreSelectableIconActionButton : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Ljava/lang/Class;ZZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*     */     //   585: aload #12
/*     */     //   587: invokeinterface endReplaceGroup : ()V
/*     */     //   592: goto -> 705
/*     */     //   595: aload #12
/*     */     //   597: ldc_w -450024043
/*     */     //   600: invokeinterface startReplaceGroup : (I)V
/*     */     //   605: aload_0
/*     */     //   606: aload_1
/*     */     //   607: aload_2
/*     */     //   608: iload_3
/*     */     //   609: iload #4
/*     */     //   611: iload #5
/*     */     //   613: aload #6
/*     */     //   615: aload #7
/*     */     //   617: aload #8
/*     */     //   619: aload #9
/*     */     //   621: iconst_0
/*     */     //   622: anewarray org/jetbrains/jewel/ui/painter/PainterHint
/*     */     //   625: aload #11
/*     */     //   627: aload #12
/*     */     //   629: bipush #14
/*     */     //   631: iload #15
/*     */     //   633: iand
/*     */     //   634: bipush #112
/*     */     //   636: iload #15
/*     */     //   638: iand
/*     */     //   639: ior
/*     */     //   640: sipush #896
/*     */     //   643: iload #15
/*     */     //   645: iand
/*     */     //   646: ior
/*     */     //   647: sipush #7168
/*     */     //   650: iload #15
/*     */     //   652: iand
/*     */     //   653: ior
/*     */     //   654: ldc 57344
/*     */     //   656: iload #15
/*     */     //   658: iand
/*     */     //   659: ior
/*     */     //   660: ldc 458752
/*     */     //   662: iload #15
/*     */     //   664: iand
/*     */     //   665: ior
/*     */     //   666: ldc 3670016
/*     */     //   668: iload #15
/*     */     //   670: iand
/*     */     //   671: ior
/*     */     //   672: ldc 29360128
/*     */     //   674: iload #15
/*     */     //   676: iand
/*     */     //   677: ior
/*     */     //   678: ldc 234881024
/*     */     //   680: iload #15
/*     */     //   682: iand
/*     */     //   683: ior
/*     */     //   684: ldc 1879048192
/*     */     //   686: iload #15
/*     */     //   688: iand
/*     */     //   689: ior
/*     */     //   690: bipush #112
/*     */     //   692: iload #16
/*     */     //   694: iand
/*     */     //   695: invokestatic CoreSelectableIconActionButton : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Ljava/lang/Class;ZZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorFilter;[Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*     */     //   698: aload #12
/*     */     //   700: invokeinterface endReplaceGroup : ()V
/*     */     //   705: invokestatic isTraceInProgress : ()Z
/*     */     //   708: ifeq -> 724
/*     */     //   711: invokestatic traceEventEnd : ()V
/*     */     //   714: goto -> 724
/*     */     //   717: aload #12
/*     */     //   719: invokeinterface skipToGroupEnd : ()V
/*     */     //   724: aload #12
/*     */     //   726: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   731: dup
/*     */     //   732: ifnull -> 772
/*     */     //   735: aload_0
/*     */     //   736: aload_1
/*     */     //   737: aload_2
/*     */     //   738: iload_3
/*     */     //   739: iload #4
/*     */     //   741: iload #5
/*     */     //   743: aload #6
/*     */     //   745: aload #7
/*     */     //   747: aload #8
/*     */     //   749: aload #9
/*     */     //   751: aload #10
/*     */     //   753: aload #11
/*     */     //   755: iload #13
/*     */     //   757: iload #14
/*     */     //   759: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Ljava/lang/Class;ZZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;II)Lkotlin/jvm/functions/Function2;
/*     */     //   764: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   769: goto -> 773
/*     */     //   772: pop
/*     */     //   773: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #171	-> 0
/*     */     //   #172	-> 473
/*     */     //   #174	-> 488
/*     */     //   #175	-> 489
/*     */     //   #176	-> 490
/*     */     //   #177	-> 491
/*     */     //   #178	-> 492
/*     */     //   #179	-> 494
/*     */     //   #180	-> 496
/*     */     //   #181	-> 498
/*     */     //   #182	-> 500
/*     */     //   #183	-> 502
/*     */     //   #184	-> 504
/*     */     //   #185	-> 506
/*     */     //   #173	-> 582
/*     */     //   #172	-> 585
/*     */     //   #187	-> 595
/*     */     //   #189	-> 605
/*     */     //   #190	-> 606
/*     */     //   #191	-> 607
/*     */     //   #192	-> 608
/*     */     //   #193	-> 609
/*     */     //   #194	-> 611
/*     */     //   #195	-> 613
/*     */     //   #196	-> 615
/*     */     //   #197	-> 617
/*     */     //   #198	-> 619
/*     */     //   #199	-> 621
/*     */     //   #200	-> 625
/*     */     //   #188	-> 695
/*     */     //   #187	-> 698
/*     */     //   #203	-> 717
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   16	758	15	$dirty	I
/*     */     //   20	754	16	$dirty1	I
/*     */     //   0	774	0	key	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   0	774	1	contentDescription	Ljava/lang/String;
/*     */     //   0	774	2	iconClass	Ljava/lang/Class;
/*     */     //   0	774	3	selected	Z
/*     */     //   0	774	4	enabled	Z
/*     */     //   0	774	5	focusable	Z
/*     */     //   0	774	6	style	Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   0	774	7	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	774	8	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	774	9	colorFilter	Landroidx/compose/ui/graphics/ColorFilter;
/*     */     //   0	774	10	extraHint	Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   0	774	11	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	774	12	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	774	13	$changed	I
/*     */     //   0	774	14	$changed1	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   private static final void CoreSelectableIconActionButton(IconKey key, String contentDescription, Class<?> iconClass, boolean selected, boolean enabled, boolean focusable, IconButtonStyle style, MutableInteractionSource interactionSource, Modifier modifier, ColorFilter colorFilter, PainterHint extraHint, Function0<Unit> onClick, Composer $composer, int $changed, int $changed1) {
/*     */     // Byte code:
/*     */     //   0: aload #12
/*     */     //   2: ldc_w -1180945627
/*     */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   10: astore #12
/*     */     //   12: iload #13
/*     */     //   14: istore #15
/*     */     //   16: iload #14
/*     */     //   18: istore #16
/*     */     //   20: iload #13
/*     */     //   22: bipush #6
/*     */     //   24: iand
/*     */     //   25: ifne -> 68
/*     */     //   28: iload #15
/*     */     //   30: iload #13
/*     */     //   32: bipush #8
/*     */     //   34: iand
/*     */     //   35: ifne -> 49
/*     */     //   38: aload #12
/*     */     //   40: aload_0
/*     */     //   41: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   46: goto -> 57
/*     */     //   49: aload #12
/*     */     //   51: aload_0
/*     */     //   52: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   57: ifeq -> 64
/*     */     //   60: iconst_4
/*     */     //   61: goto -> 65
/*     */     //   64: iconst_2
/*     */     //   65: ior
/*     */     //   66: istore #15
/*     */     //   68: iload #13
/*     */     //   70: bipush #48
/*     */     //   72: iand
/*     */     //   73: ifne -> 99
/*     */     //   76: iload #15
/*     */     //   78: aload #12
/*     */     //   80: aload_1
/*     */     //   81: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   86: ifeq -> 94
/*     */     //   89: bipush #32
/*     */     //   91: goto -> 96
/*     */     //   94: bipush #16
/*     */     //   96: ior
/*     */     //   97: istore #15
/*     */     //   99: iload #13
/*     */     //   101: sipush #384
/*     */     //   104: iand
/*     */     //   105: ifne -> 133
/*     */     //   108: iload #15
/*     */     //   110: aload #12
/*     */     //   112: aload_2
/*     */     //   113: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   118: ifeq -> 127
/*     */     //   121: sipush #256
/*     */     //   124: goto -> 130
/*     */     //   127: sipush #128
/*     */     //   130: ior
/*     */     //   131: istore #15
/*     */     //   133: iload #13
/*     */     //   135: sipush #3072
/*     */     //   138: iand
/*     */     //   139: ifne -> 167
/*     */     //   142: iload #15
/*     */     //   144: aload #12
/*     */     //   146: iload_3
/*     */     //   147: invokeinterface changed : (Z)Z
/*     */     //   152: ifeq -> 161
/*     */     //   155: sipush #2048
/*     */     //   158: goto -> 164
/*     */     //   161: sipush #1024
/*     */     //   164: ior
/*     */     //   165: istore #15
/*     */     //   167: iload #13
/*     */     //   169: sipush #24576
/*     */     //   172: iand
/*     */     //   173: ifne -> 202
/*     */     //   176: iload #15
/*     */     //   178: aload #12
/*     */     //   180: iload #4
/*     */     //   182: invokeinterface changed : (Z)Z
/*     */     //   187: ifeq -> 196
/*     */     //   190: sipush #16384
/*     */     //   193: goto -> 199
/*     */     //   196: sipush #8192
/*     */     //   199: ior
/*     */     //   200: istore #15
/*     */     //   202: iload #13
/*     */     //   204: ldc 196608
/*     */     //   206: iand
/*     */     //   207: ifne -> 234
/*     */     //   210: iload #15
/*     */     //   212: aload #12
/*     */     //   214: iload #5
/*     */     //   216: invokeinterface changed : (Z)Z
/*     */     //   221: ifeq -> 229
/*     */     //   224: ldc 131072
/*     */     //   226: goto -> 231
/*     */     //   229: ldc 65536
/*     */     //   231: ior
/*     */     //   232: istore #15
/*     */     //   234: iload #13
/*     */     //   236: ldc 1572864
/*     */     //   238: iand
/*     */     //   239: ifne -> 266
/*     */     //   242: iload #15
/*     */     //   244: aload #12
/*     */     //   246: aload #6
/*     */     //   248: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   253: ifeq -> 261
/*     */     //   256: ldc 1048576
/*     */     //   258: goto -> 263
/*     */     //   261: ldc 524288
/*     */     //   263: ior
/*     */     //   264: istore #15
/*     */     //   266: iload #13
/*     */     //   268: ldc 12582912
/*     */     //   270: iand
/*     */     //   271: ifne -> 298
/*     */     //   274: iload #15
/*     */     //   276: aload #12
/*     */     //   278: aload #7
/*     */     //   280: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   285: ifeq -> 293
/*     */     //   288: ldc 8388608
/*     */     //   290: goto -> 295
/*     */     //   293: ldc 4194304
/*     */     //   295: ior
/*     */     //   296: istore #15
/*     */     //   298: iload #13
/*     */     //   300: ldc 100663296
/*     */     //   302: iand
/*     */     //   303: ifne -> 330
/*     */     //   306: iload #15
/*     */     //   308: aload #12
/*     */     //   310: aload #8
/*     */     //   312: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   317: ifeq -> 325
/*     */     //   320: ldc 67108864
/*     */     //   322: goto -> 327
/*     */     //   325: ldc 33554432
/*     */     //   327: ior
/*     */     //   328: istore #15
/*     */     //   330: iload #13
/*     */     //   332: ldc 805306368
/*     */     //   334: iand
/*     */     //   335: ifne -> 362
/*     */     //   338: iload #15
/*     */     //   340: aload #12
/*     */     //   342: aload #9
/*     */     //   344: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   349: ifeq -> 357
/*     */     //   352: ldc 536870912
/*     */     //   354: goto -> 359
/*     */     //   357: ldc 268435456
/*     */     //   359: ior
/*     */     //   360: istore #15
/*     */     //   362: iload #14
/*     */     //   364: bipush #6
/*     */     //   366: iand
/*     */     //   367: ifne -> 392
/*     */     //   370: iload #16
/*     */     //   372: aload #12
/*     */     //   374: aload #10
/*     */     //   376: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   381: ifeq -> 388
/*     */     //   384: iconst_4
/*     */     //   385: goto -> 389
/*     */     //   388: iconst_2
/*     */     //   389: ior
/*     */     //   390: istore #16
/*     */     //   392: iload #14
/*     */     //   394: bipush #48
/*     */     //   396: iand
/*     */     //   397: ifne -> 424
/*     */     //   400: iload #16
/*     */     //   402: aload #12
/*     */     //   404: aload #11
/*     */     //   406: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   411: ifeq -> 419
/*     */     //   414: bipush #32
/*     */     //   416: goto -> 421
/*     */     //   419: bipush #16
/*     */     //   421: ior
/*     */     //   422: istore #16
/*     */     //   424: iload #15
/*     */     //   426: ldc 306783379
/*     */     //   428: iand
/*     */     //   429: ldc 306783378
/*     */     //   431: if_icmpne -> 454
/*     */     //   434: iload #16
/*     */     //   436: bipush #19
/*     */     //   438: iand
/*     */     //   439: bipush #18
/*     */     //   441: if_icmpne -> 454
/*     */     //   444: aload #12
/*     */     //   446: invokeinterface getSkipping : ()Z
/*     */     //   451: ifne -> 594
/*     */     //   454: invokestatic isTraceInProgress : ()Z
/*     */     //   457: ifeq -> 473
/*     */     //   460: ldc_w -1180945627
/*     */     //   463: iload #15
/*     */     //   465: iload #16
/*     */     //   467: ldc_w 'org.jetbrains.jewel.ui.component.CoreSelectableIconActionButton (SelectableIconActionButton.kt:218)'
/*     */     //   470: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   473: iload_3
/*     */     //   474: aload #11
/*     */     //   476: aload #8
/*     */     //   478: iload #4
/*     */     //   480: iload #5
/*     */     //   482: aload #6
/*     */     //   484: aload #7
/*     */     //   486: ldc_w -373920927
/*     */     //   489: iconst_1
/*     */     //   490: new org/jetbrains/jewel/ui/component/SelectableIconActionButtonKt$CoreSelectableIconActionButton$1
/*     */     //   493: dup
/*     */     //   494: aload #6
/*     */     //   496: aload #10
/*     */     //   498: aload_0
/*     */     //   499: aload_1
/*     */     //   500: aload_2
/*     */     //   501: aload #9
/*     */     //   503: invokespecial <init> : (Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Lorg/jetbrains/jewel/ui/painter/PainterHint;Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Ljava/lang/Class;Landroidx/compose/ui/graphics/ColorFilter;)V
/*     */     //   506: aload #12
/*     */     //   508: bipush #54
/*     */     //   510: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   513: checkcast kotlin/jvm/functions/Function4
/*     */     //   516: aload #12
/*     */     //   518: ldc 12582912
/*     */     //   520: bipush #14
/*     */     //   522: iload #15
/*     */     //   524: bipush #9
/*     */     //   526: ishr
/*     */     //   527: iand
/*     */     //   528: ior
/*     */     //   529: bipush #112
/*     */     //   531: iload #16
/*     */     //   533: iand
/*     */     //   534: ior
/*     */     //   535: sipush #896
/*     */     //   538: iload #15
/*     */     //   540: bipush #18
/*     */     //   542: ishr
/*     */     //   543: iand
/*     */     //   544: ior
/*     */     //   545: sipush #7168
/*     */     //   548: iload #15
/*     */     //   550: iconst_3
/*     */     //   551: ishr
/*     */     //   552: iand
/*     */     //   553: ior
/*     */     //   554: ldc 57344
/*     */     //   556: iload #15
/*     */     //   558: iconst_3
/*     */     //   559: ishr
/*     */     //   560: iand
/*     */     //   561: ior
/*     */     //   562: ldc 458752
/*     */     //   564: iload #15
/*     */     //   566: iconst_3
/*     */     //   567: ishr
/*     */     //   568: iand
/*     */     //   569: ior
/*     */     //   570: ldc 3670016
/*     */     //   572: iload #15
/*     */     //   574: iconst_3
/*     */     //   575: ishr
/*     */     //   576: iand
/*     */     //   577: ior
/*     */     //   578: iconst_0
/*     */     //   579: invokestatic SelectableIconButton : (ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V
/*     */     //   582: invokestatic isTraceInProgress : ()Z
/*     */     //   585: ifeq -> 601
/*     */     //   588: invokestatic traceEventEnd : ()V
/*     */     //   591: goto -> 601
/*     */     //   594: aload #12
/*     */     //   596: invokeinterface skipToGroupEnd : ()V
/*     */     //   601: aload #12
/*     */     //   603: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   608: dup
/*     */     //   609: ifnull -> 649
/*     */     //   612: aload_0
/*     */     //   613: aload_1
/*     */     //   614: aload_2
/*     */     //   615: iload_3
/*     */     //   616: iload #4
/*     */     //   618: iload #5
/*     */     //   620: aload #6
/*     */     //   622: aload #7
/*     */     //   624: aload #8
/*     */     //   626: aload #9
/*     */     //   628: aload #10
/*     */     //   630: aload #11
/*     */     //   632: iload #13
/*     */     //   634: iload #14
/*     */     //   636: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Ljava/lang/Class;ZZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;II)Lkotlin/jvm/functions/Function2;
/*     */     //   641: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   646: goto -> 650
/*     */     //   649: pop
/*     */     //   650: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #219	-> 0
/*     */     //   #220	-> 473
/*     */     //   #230	-> 594
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   16	635	15	$dirty	I
/*     */     //   20	631	16	$dirty1	I
/*     */     //   0	651	0	key	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   0	651	1	contentDescription	Ljava/lang/String;
/*     */     //   0	651	2	iconClass	Ljava/lang/Class;
/*     */     //   0	651	3	selected	Z
/*     */     //   0	651	4	enabled	Z
/*     */     //   0	651	5	focusable	Z
/*     */     //   0	651	6	style	Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   0	651	7	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	651	8	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	651	9	colorFilter	Landroidx/compose/ui/graphics/ColorFilter;
/*     */     //   0	651	10	extraHint	Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   0	651	11	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	651	12	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	651	13	$changed	I
/*     */     //   0	651	14	$changed1	I
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nSelectableIconActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectableIconActionButton.kt\norg/jetbrains/jewel/ui/component/SelectableIconActionButtonKt$CoreSelectableIconActionButton$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,258:1\n81#2:259\n*S KotlinDebug\n*F\n+ 1 SelectableIconActionButton.kt\norg/jetbrains/jewel/ui/component/SelectableIconActionButtonKt$CoreSelectableIconActionButton$1\n*L\n221#1:259\n*E\n"})
/*     */   static final class SelectableIconActionButtonKt$CoreSelectableIconActionButton$1
/*     */     implements Function4<BoxScope, SelectableIconButtonState, Composer, Integer, Unit>
/*     */   {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke-3BuHSdA(BoxScope $this$SelectableIconButton, long it, Composer $composer, int $changed) {
/*     */       Intrinsics.checkNotNullParameter($this$SelectableIconButton, "$this$SelectableIconButton");
/*     */       int $dirty = $changed;
/*     */       if (($changed & 0x30) == 0) {
/*     */         $dirty |= $composer.changed(it) ? 32 : 16;
/*     */       }
/*     */       if (($dirty & 0x91) != 144 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress()) {
/*     */           ComposerKt.traceEventStart(-373920927, $dirty, -1, "org.jetbrains.jewel.ui.component.CoreSelectableIconActionButton.<anonymous> (SelectableIconActionButton.kt:220)");
/*     */         }
/*     */         State<Color> strokeColor$delegate = this.$style.getColors().selectableForegroundFor-eXKw-ig(it, $composer, 0xE & $dirty >> 3);
/*     */         PainterHint[] arrayOfPainterHint2 = new PainterHint[2];
/*     */         arrayOfPainterHint2[0] = DarkAndStrokeKt.Stroke-8_81llA(invoke_3BuHSdA$lambda$0(strokeColor$delegate));
/*     */         arrayOfPainterHint2[1] = this.$extraHint;
/*     */         PainterHint[] arrayOfPainterHint1 = arrayOfPainterHint2;
/*     */         IconKt.Icon(this.$key, this.$contentDescription, (Modifier)null, this.$iconClass, this.$colorFilter, arrayOfPainterHint1, $composer, 0, 4);
/*     */         if (ComposerKt.isTraceInProgress()) {
/*     */           ComposerKt.traceEventEnd();
/*     */         }
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     SelectableIconActionButtonKt$CoreSelectableIconActionButton$1(IconButtonStyle $style, PainterHint $extraHint, IconKey $key, String $contentDescription, Class<?> $iconClass, ColorFilter $colorFilter) {}
/*     */ 
/*     */ 
/*     */     
/*     */     private static final long invoke_3BuHSdA$lambda$0(State $strokeColor$delegate) {
/* 221 */       State state = $strokeColor$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 259 */         (Color)state.getValue()).unbox-impl(); } } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") private static final void CoreSelectableIconActionButton(IconKey key, String contentDescription, Class<?> iconClass, boolean selected, boolean enabled, boolean focusable, IconButtonStyle style, MutableInteractionSource interactionSource, Modifier modifier, ColorFilter colorFilter, PainterHint[] extraHints, Function0<Unit> onClick, Composer $composer, int $changed, int $changed1) { // Byte code:
/*     */     //   0: aload #12
/*     */     //   2: ldc_w 1436613022
/*     */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   10: astore #12
/*     */     //   12: iload #13
/*     */     //   14: istore #15
/*     */     //   16: iload #14
/*     */     //   18: istore #16
/*     */     //   20: iload #13
/*     */     //   22: bipush #6
/*     */     //   24: iand
/*     */     //   25: ifne -> 68
/*     */     //   28: iload #15
/*     */     //   30: iload #13
/*     */     //   32: bipush #8
/*     */     //   34: iand
/*     */     //   35: ifne -> 49
/*     */     //   38: aload #12
/*     */     //   40: aload_0
/*     */     //   41: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   46: goto -> 57
/*     */     //   49: aload #12
/*     */     //   51: aload_0
/*     */     //   52: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   57: ifeq -> 64
/*     */     //   60: iconst_4
/*     */     //   61: goto -> 65
/*     */     //   64: iconst_2
/*     */     //   65: ior
/*     */     //   66: istore #15
/*     */     //   68: iload #13
/*     */     //   70: bipush #48
/*     */     //   72: iand
/*     */     //   73: ifne -> 99
/*     */     //   76: iload #15
/*     */     //   78: aload #12
/*     */     //   80: aload_1
/*     */     //   81: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   86: ifeq -> 94
/*     */     //   89: bipush #32
/*     */     //   91: goto -> 96
/*     */     //   94: bipush #16
/*     */     //   96: ior
/*     */     //   97: istore #15
/*     */     //   99: iload #13
/*     */     //   101: sipush #384
/*     */     //   104: iand
/*     */     //   105: ifne -> 133
/*     */     //   108: iload #15
/*     */     //   110: aload #12
/*     */     //   112: aload_2
/*     */     //   113: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   118: ifeq -> 127
/*     */     //   121: sipush #256
/*     */     //   124: goto -> 130
/*     */     //   127: sipush #128
/*     */     //   130: ior
/*     */     //   131: istore #15
/*     */     //   133: iload #13
/*     */     //   135: sipush #3072
/*     */     //   138: iand
/*     */     //   139: ifne -> 167
/*     */     //   142: iload #15
/*     */     //   144: aload #12
/*     */     //   146: iload_3
/*     */     //   147: invokeinterface changed : (Z)Z
/*     */     //   152: ifeq -> 161
/*     */     //   155: sipush #2048
/*     */     //   158: goto -> 164
/*     */     //   161: sipush #1024
/*     */     //   164: ior
/*     */     //   165: istore #15
/*     */     //   167: iload #13
/*     */     //   169: sipush #24576
/*     */     //   172: iand
/*     */     //   173: ifne -> 202
/*     */     //   176: iload #15
/*     */     //   178: aload #12
/*     */     //   180: iload #4
/*     */     //   182: invokeinterface changed : (Z)Z
/*     */     //   187: ifeq -> 196
/*     */     //   190: sipush #16384
/*     */     //   193: goto -> 199
/*     */     //   196: sipush #8192
/*     */     //   199: ior
/*     */     //   200: istore #15
/*     */     //   202: iload #13
/*     */     //   204: ldc 196608
/*     */     //   206: iand
/*     */     //   207: ifne -> 234
/*     */     //   210: iload #15
/*     */     //   212: aload #12
/*     */     //   214: iload #5
/*     */     //   216: invokeinterface changed : (Z)Z
/*     */     //   221: ifeq -> 229
/*     */     //   224: ldc 131072
/*     */     //   226: goto -> 231
/*     */     //   229: ldc 65536
/*     */     //   231: ior
/*     */     //   232: istore #15
/*     */     //   234: iload #13
/*     */     //   236: ldc 1572864
/*     */     //   238: iand
/*     */     //   239: ifne -> 266
/*     */     //   242: iload #15
/*     */     //   244: aload #12
/*     */     //   246: aload #6
/*     */     //   248: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   253: ifeq -> 261
/*     */     //   256: ldc 1048576
/*     */     //   258: goto -> 263
/*     */     //   261: ldc 524288
/*     */     //   263: ior
/*     */     //   264: istore #15
/*     */     //   266: iload #13
/*     */     //   268: ldc 12582912
/*     */     //   270: iand
/*     */     //   271: ifne -> 298
/*     */     //   274: iload #15
/*     */     //   276: aload #12
/*     */     //   278: aload #7
/*     */     //   280: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   285: ifeq -> 293
/*     */     //   288: ldc 8388608
/*     */     //   290: goto -> 295
/*     */     //   293: ldc 4194304
/*     */     //   295: ior
/*     */     //   296: istore #15
/*     */     //   298: iload #13
/*     */     //   300: ldc 100663296
/*     */     //   302: iand
/*     */     //   303: ifne -> 330
/*     */     //   306: iload #15
/*     */     //   308: aload #12
/*     */     //   310: aload #8
/*     */     //   312: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   317: ifeq -> 325
/*     */     //   320: ldc 67108864
/*     */     //   322: goto -> 327
/*     */     //   325: ldc 33554432
/*     */     //   327: ior
/*     */     //   328: istore #15
/*     */     //   330: iload #13
/*     */     //   332: ldc 805306368
/*     */     //   334: iand
/*     */     //   335: ifne -> 362
/*     */     //   338: iload #15
/*     */     //   340: aload #12
/*     */     //   342: aload #9
/*     */     //   344: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   349: ifeq -> 357
/*     */     //   352: ldc 536870912
/*     */     //   354: goto -> 359
/*     */     //   357: ldc 268435456
/*     */     //   359: ior
/*     */     //   360: istore #15
/*     */     //   362: iload #14
/*     */     //   364: bipush #6
/*     */     //   366: iand
/*     */     //   367: ifne -> 392
/*     */     //   370: iload #16
/*     */     //   372: aload #12
/*     */     //   374: aload #10
/*     */     //   376: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   381: ifeq -> 388
/*     */     //   384: iconst_4
/*     */     //   385: goto -> 389
/*     */     //   388: iconst_2
/*     */     //   389: ior
/*     */     //   390: istore #16
/*     */     //   392: iload #14
/*     */     //   394: bipush #48
/*     */     //   396: iand
/*     */     //   397: ifne -> 424
/*     */     //   400: iload #16
/*     */     //   402: aload #12
/*     */     //   404: aload #11
/*     */     //   406: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   411: ifeq -> 419
/*     */     //   414: bipush #32
/*     */     //   416: goto -> 421
/*     */     //   419: bipush #16
/*     */     //   421: ior
/*     */     //   422: istore #16
/*     */     //   424: iload #15
/*     */     //   426: ldc 306783379
/*     */     //   428: iand
/*     */     //   429: ldc 306783378
/*     */     //   431: if_icmpne -> 454
/*     */     //   434: iload #16
/*     */     //   436: bipush #19
/*     */     //   438: iand
/*     */     //   439: bipush #18
/*     */     //   441: if_icmpne -> 454
/*     */     //   444: aload #12
/*     */     //   446: invokeinterface getSkipping : ()Z
/*     */     //   451: ifne -> 594
/*     */     //   454: invokestatic isTraceInProgress : ()Z
/*     */     //   457: ifeq -> 473
/*     */     //   460: ldc_w 1436613022
/*     */     //   463: iload #15
/*     */     //   465: iload #16
/*     */     //   467: ldc_w 'org.jetbrains.jewel.ui.component.CoreSelectableIconActionButton (SelectableIconActionButton.kt:245)'
/*     */     //   470: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   473: iload_3
/*     */     //   474: aload #11
/*     */     //   476: aload #8
/*     */     //   478: iload #4
/*     */     //   480: iload #5
/*     */     //   482: aload #6
/*     */     //   484: aload #7
/*     */     //   486: ldc_w 1391005402
/*     */     //   489: iconst_1
/*     */     //   490: new org/jetbrains/jewel/ui/component/SelectableIconActionButtonKt$CoreSelectableIconActionButton$3
/*     */     //   493: dup
/*     */     //   494: aload #6
/*     */     //   496: aload #10
/*     */     //   498: aload_0
/*     */     //   499: aload_1
/*     */     //   500: aload_2
/*     */     //   501: aload #9
/*     */     //   503: invokespecial <init> : (Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;[Lorg/jetbrains/jewel/ui/painter/PainterHint;Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Ljava/lang/Class;Landroidx/compose/ui/graphics/ColorFilter;)V
/*     */     //   506: aload #12
/*     */     //   508: bipush #54
/*     */     //   510: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   513: checkcast kotlin/jvm/functions/Function4
/*     */     //   516: aload #12
/*     */     //   518: ldc 12582912
/*     */     //   520: bipush #14
/*     */     //   522: iload #15
/*     */     //   524: bipush #9
/*     */     //   526: ishr
/*     */     //   527: iand
/*     */     //   528: ior
/*     */     //   529: bipush #112
/*     */     //   531: iload #16
/*     */     //   533: iand
/*     */     //   534: ior
/*     */     //   535: sipush #896
/*     */     //   538: iload #15
/*     */     //   540: bipush #18
/*     */     //   542: ishr
/*     */     //   543: iand
/*     */     //   544: ior
/*     */     //   545: sipush #7168
/*     */     //   548: iload #15
/*     */     //   550: iconst_3
/*     */     //   551: ishr
/*     */     //   552: iand
/*     */     //   553: ior
/*     */     //   554: ldc 57344
/*     */     //   556: iload #15
/*     */     //   558: iconst_3
/*     */     //   559: ishr
/*     */     //   560: iand
/*     */     //   561: ior
/*     */     //   562: ldc 458752
/*     */     //   564: iload #15
/*     */     //   566: iconst_3
/*     */     //   567: ishr
/*     */     //   568: iand
/*     */     //   569: ior
/*     */     //   570: ldc 3670016
/*     */     //   572: iload #15
/*     */     //   574: iconst_3
/*     */     //   575: ishr
/*     */     //   576: iand
/*     */     //   577: ior
/*     */     //   578: iconst_0
/*     */     //   579: invokestatic SelectableIconButton : (ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V
/*     */     //   582: invokestatic isTraceInProgress : ()Z
/*     */     //   585: ifeq -> 601
/*     */     //   588: invokestatic traceEventEnd : ()V
/*     */     //   591: goto -> 601
/*     */     //   594: aload #12
/*     */     //   596: invokeinterface skipToGroupEnd : ()V
/*     */     //   601: aload #12
/*     */     //   603: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   608: dup
/*     */     //   609: ifnull -> 649
/*     */     //   612: aload_0
/*     */     //   613: aload_1
/*     */     //   614: aload_2
/*     */     //   615: iload_3
/*     */     //   616: iload #4
/*     */     //   618: iload #5
/*     */     //   620: aload #6
/*     */     //   622: aload #7
/*     */     //   624: aload #8
/*     */     //   626: aload #9
/*     */     //   628: aload #10
/*     */     //   630: aload #11
/*     */     //   632: iload #13
/*     */     //   634: iload #14
/*     */     //   636: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Ljava/lang/Class;ZZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorFilter;[Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;II)Lkotlin/jvm/functions/Function2;
/*     */     //   641: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   646: goto -> 650
/*     */     //   649: pop
/*     */     //   650: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #246	-> 0
/*     */     //   #247	-> 473
/*     */     //   #257	-> 594
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   16	635	15	$dirty	I
/*     */     //   20	631	16	$dirty1	I
/*     */     //   0	651	0	key	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   0	651	1	contentDescription	Ljava/lang/String;
/*     */     //   0	651	2	iconClass	Ljava/lang/Class;
/*     */     //   0	651	3	selected	Z
/*     */     //   0	651	4	enabled	Z
/*     */     //   0	651	5	focusable	Z
/*     */     //   0	651	6	style	Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   0	651	7	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	651	8	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	651	9	colorFilter	Landroidx/compose/ui/graphics/ColorFilter;
/*     */     //   0	651	10	extraHints	[Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   0	651	11	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	651	12	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	651	13	$changed	I
/* 259 */     //   0	651	14	$changed1	I } private static final Unit SelectableIconActionButton$lambda$1(IconKey $key, String $contentDescription, boolean $selected, Function0<Unit> $onClick, Modifier $modifier, boolean $enabled, boolean $focusable, IconButtonStyle $style, ColorFilter $colorFilter, PainterHint $extraHint, MutableInteractionSource $interactionSource, Class<?> $iconClass, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) { SelectableIconActionButton($key, $contentDescription, $selected, $onClick, $modifier, $enabled, $focusable, $style, $colorFilter, $extraHint, $interactionSource, $iconClass, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default); return Unit.INSTANCE; } private static final Unit SelectableIconActionButton$lambda$3(IconKey $key, String $contentDescription, boolean $selected, Function0<Unit> $onClick, Modifier $modifier, boolean $enabled, boolean $focusable, IconButtonStyle $style, ColorFilter $colorFilter, PainterHint $extraHint, TooltipStyle $tooltipStyle, Modifier $tooltipModifier, TooltipPlacement $tooltipPlacement, MutableInteractionSource $interactionSource, Class<?> $iconClass, Function2<? super Composer, ? super Integer, Unit> $tooltip, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) { SelectableIconActionButton($key, $contentDescription, $selected, $onClick, $modifier, $enabled, $focusable, $style, $colorFilter, $extraHint, $tooltipStyle, $tooltipModifier, $tooltipPlacement, $interactionSource, $iconClass, $tooltip, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default); return Unit.INSTANCE; } private static final Unit SelectableIconActionButton$lambda$5(IconKey $key, String $contentDescription, boolean $selected, PainterHint[] $extraHints, Function0<Unit> $onClick, Modifier $modifier, boolean $enabled, boolean $focusable, IconButtonStyle $style, ColorFilter $colorFilter, MutableInteractionSource $interactionSource, Class<?> $iconClass, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) { SelectableIconActionButton($key, $contentDescription, $selected, $extraHints, $onClick, $modifier, $enabled, $focusable, $style, $colorFilter, $interactionSource, $iconClass, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default); return Unit.INSTANCE; } private static final Unit SelectableIconActionButton$lambda$7(IconKey $key, String $contentDescription, boolean $selected, PainterHint[] $extraHints, Function0<Unit> $onClick, Modifier $modifier, boolean $enabled, boolean $focusable, IconButtonStyle $style, ColorFilter $colorFilter, TooltipStyle $tooltipStyle, Modifier $tooltipModifier, TooltipPlacement $tooltipPlacement, MutableInteractionSource $interactionSource, Class<?> $iconClass, Function2<? super Composer, ? super Integer, Unit> $tooltip, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) { SelectableIconActionButton($key, $contentDescription, $selected, $extraHints, $onClick, $modifier, $enabled, $focusable, $style, $colorFilter, $tooltipStyle, $tooltipModifier, $tooltipPlacement, $interactionSource, $iconClass, $tooltip, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default); return Unit.INSTANCE; } private static final Unit BaseSelectableIconActionButton$lambda$8(IconKey $key, String $contentDescription, Class<?> $iconClass, boolean $selected, boolean $enabled, boolean $focusable, IconButtonStyle $style, MutableInteractionSource $interactionSource, Modifier $modifier, ColorFilter $colorFilter, PainterHint $extraHint, Function0<Unit> $onClick, int $$changed, int $$changed1, Composer $composer, int $force) { BaseSelectableIconActionButton($key, $contentDescription, $iconClass, $selected, $enabled, $focusable, $style, $interactionSource, $modifier, $colorFilter, $extraHint, $onClick, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1)); return Unit.INSTANCE; } private static final Unit CoreSelectableIconActionButton$lambda$9(IconKey $key, String $contentDescription, Class<?> $iconClass, boolean $selected, boolean $enabled, boolean $focusable, IconButtonStyle $style, MutableInteractionSource $interactionSource, Modifier $modifier, ColorFilter $colorFilter, PainterHint $extraHint, Function0<Unit> $onClick, int $$changed, int $$changed1, Composer $composer, int $force) { CoreSelectableIconActionButton($key, $contentDescription, $iconClass, $selected, $enabled, $focusable, $style, $interactionSource, $modifier, $colorFilter, $extraHint, $onClick, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1)); return Unit.INSTANCE; } private static final Unit CoreSelectableIconActionButton$lambda$10(IconKey $key, String $contentDescription, Class<?> $iconClass, boolean $selected, boolean $enabled, boolean $focusable, IconButtonStyle $style, MutableInteractionSource $interactionSource, Modifier $modifier, ColorFilter $colorFilter, PainterHint[] $extraHints, Function0<Unit> $onClick, int $$changed, int $$changed1, Composer $composer, int $force) { CoreSelectableIconActionButton($key, $contentDescription, $iconClass, $selected, $enabled, $focusable, $style, $interactionSource, $modifier, $colorFilter, $extraHints, $onClick, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1)); return Unit.INSTANCE; } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nSelectableIconActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectableIconActionButton.kt\norg/jetbrains/jewel/ui/component/SelectableIconActionButtonKt$CoreSelectableIconActionButton$3\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,258:1\n81#2:259\n*S KotlinDebug\n*F\n+ 1 SelectableIconActionButton.kt\norg/jetbrains/jewel/ui/component/SelectableIconActionButtonKt$CoreSelectableIconActionButton$3\n*L\n248#1:259\n*E\n"}) static final class SelectableIconActionButtonKt$CoreSelectableIconActionButton$3 implements Function4<BoxScope, SelectableIconButtonState, Composer, Integer, Unit> { private static final long invoke_3BuHSdA$lambda$0(State $strokeColor$delegate) { State state = $strokeColor$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Color)state.getValue()).unbox-impl(); }
/*     */ 
/*     */     
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke-3BuHSdA(BoxScope $this$SelectableIconButton, long it, Composer $composer, int $changed) {
/*     */       Intrinsics.checkNotNullParameter($this$SelectableIconButton, "$this$SelectableIconButton");
/*     */       int $dirty = $changed;
/*     */       if (($changed & 0x30) == 0)
/*     */         $dirty |= $composer.changed(it) ? 32 : 16; 
/*     */       if (($dirty & 0x91) != 144 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(1391005402, $dirty, -1, "org.jetbrains.jewel.ui.component.CoreSelectableIconActionButton.<anonymous> (SelectableIconActionButton.kt:247)"); 
/*     */         State<Color> strokeColor$delegate = this.$style.getColors().selectableForegroundFor-eXKw-ig(it, $composer, 0xE & $dirty >> 3);
/*     */         SpreadBuilder spreadBuilder = new SpreadBuilder(2);
/*     */         spreadBuilder.add(DarkAndStrokeKt.Stroke-8_81llA(invoke_3BuHSdA$lambda$0(strokeColor$delegate)));
/*     */         spreadBuilder.addSpread(this.$extraHints);
/*     */         PainterHint[] arrayOfPainterHint = (PainterHint[])spreadBuilder.toArray((Object[])new PainterHint[spreadBuilder.size()]);
/*     */         IconKt.Icon(this.$key, this.$contentDescription, (Modifier)null, this.$iconClass, this.$colorFilter, arrayOfPainterHint, $composer, 0, 4);
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd(); 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */     
/*     */     SelectableIconActionButtonKt$CoreSelectableIconActionButton$3(IconButtonStyle $style, PainterHint[] $extraHints, IconKey $key, String $contentDescription, Class<?> $iconClass, ColorFilter $colorFilter) {} }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\SelectableIconActionButtonKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */