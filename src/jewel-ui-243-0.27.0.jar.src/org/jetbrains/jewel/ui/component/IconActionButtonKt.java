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
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.graphics.ColorFilter;
/*     */ import androidx.compose.ui.graphics.painter.Painter;
/*     */ import java.util.Arrays;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function4;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.component.styling.IconButtonStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.TooltipStyle;
/*     */ import org.jetbrains.jewel.ui.icon.IconKey;
/*     */ import org.jetbrains.jewel.ui.painter.PainterHint;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000n\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\021\n\002\b\007\n\002\030\002\n\002\b\004\032\001\020\000\032\0020\0012\006\020\002\032\0020\0032\b\020\004\032\004\030\0010\0052\f\020\006\032\b\022\004\022\0020\0010\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\0132\b\b\002\020\r\032\0020\0162\n\b\002\020\017\032\004\030\0010\0202\n\b\002\020\021\032\004\030\0010\0222\b\b\002\020\023\032\0020\0242\f\b\002\020\025\032\006\022\002\b\0030\026H\007¢\006\002\020\027\032¶\001\020\000\032\0020\0012\006\020\002\032\0020\0032\b\020\004\032\004\030\0010\0052\f\020\006\032\b\022\004\022\0020\0010\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\0132\b\b\002\020\r\032\0020\0162\n\b\002\020\017\032\004\030\0010\0202\n\b\002\020\021\032\004\030\0010\0222\b\b\002\020\030\032\0020\0312\b\b\002\020\032\032\0020\t2\b\b\002\020\033\032\0020\0342\b\b\002\020\023\032\0020\0242\f\b\002\020\025\032\006\022\002\b\0030\0262\021\020\035\032\r\022\004\022\0020\0010\007¢\006\002\b\036H\007¢\006\002\020\037\032\001\020\000\032\0020\0012\006\020\002\032\0020\0032\b\020\004\032\004\030\0010\0052\f\020 \032\b\022\004\022\0020\0220!2\f\020\006\032\b\022\004\022\0020\0010\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\0132\b\b\002\020\r\032\0020\0162\n\b\002\020\017\032\004\030\0010\0202\b\b\002\020\023\032\0020\0242\f\b\002\020\025\032\006\022\002\b\0030\026H\007¢\006\002\020\"\032¸\001\020\000\032\0020\0012\006\020\002\032\0020\0032\b\020\004\032\004\030\0010\0052\f\020 \032\b\022\004\022\0020\0220!2\f\020\006\032\b\022\004\022\0020\0010\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\0132\b\b\002\020\r\032\0020\0162\n\b\002\020\017\032\004\030\0010\0202\b\b\002\020\030\032\0020\0312\b\b\002\020\032\032\0020\t2\b\b\002\020\033\032\0020\0342\b\b\002\020\023\032\0020\0242\f\b\002\020\025\032\006\022\002\b\0030\0262\021\020\035\032\r\022\004\022\0020\0010\007¢\006\002\b\036H\007¢\006\002\020#\032u\020$\032\0020\0012\006\020\002\032\0020\0032\b\020\004\032\004\030\0010\0052\n\020\025\032\006\022\002\b\0030\0262\006\020\n\032\0020\0132\006\020\f\032\0020\0132\006\020\r\032\0020\0162\006\020\023\032\0020\0242\006\020\b\032\0020\t2\b\020\017\032\004\030\0010\0202\b\020\021\032\004\030\0010\0222\f\020\006\032\b\022\004\022\0020\0010\007H\003¢\006\002\020%\032y\020&\032\0020\0012\006\020\002\032\0020\0032\b\020\004\032\004\030\0010\0052\n\020\025\032\006\022\002\b\0030\0262\006\020\n\032\0020\0132\006\020\f\032\0020\0132\006\020\r\032\0020\0162\006\020\023\032\0020\0242\006\020\b\032\0020\t2\b\020\017\032\004\030\0010\0202\f\020 \032\b\022\004\022\0020\0220!2\f\020\006\032\b\022\004\022\0020\0010\007H\003¢\006\002\020'\032s\020&\032\0020\0012\006\020\002\032\0020\0032\b\020\004\032\004\030\0010\0052\n\020\025\032\006\022\002\b\0030\0262\006\020\n\032\0020\0132\006\020\f\032\0020\0132\006\020\r\032\0020\0162\006\020\023\032\0020\0242\006\020\b\032\0020\t2\b\020\017\032\004\030\0010\0202\006\020\021\032\0020\0222\f\020\006\032\b\022\004\022\0020\0010\007H\003¢\006\002\020%\032_\020\000\032\0020\0012\006\020(\032\0020)2\b\020\004\032\004\030\0010\0052\f\020\006\032\b\022\004\022\0020\0010\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\0132\b\b\002\020\r\032\0020\0162\b\b\002\020\023\032\0020\024H\007¢\006\002\020*\032\001\020\000\032\0020\0012\006\020(\032\0020)2\b\020\004\032\004\030\0010\0052\f\020\006\032\b\022\004\022\0020\0010\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\0132\b\b\002\020\r\032\0020\0162\b\b\002\020\030\032\0020\0312\b\b\002\020\032\032\0020\t2\b\b\002\020\033\032\0020\0342\b\b\002\020\023\032\0020\0242\021\020\035\032\r\022\004\022\0020\0010\007¢\006\002\b\036H\007¢\006\002\020+\032W\020&\032\0020\0012\006\020(\032\0020)2\b\020\004\032\004\030\0010\0052\006\020\n\032\0020\0132\006\020\f\032\0020\0132\006\020\r\032\0020\0162\006\020\023\032\0020\0242\b\b\002\020\b\032\0020\t2\f\020\006\032\b\022\004\022\0020\0010\007H\003¢\006\002\020,¨\006-"}, d2 = {"IconActionButton", "", "key", "Lorg/jetbrains/jewel/ui/icon/IconKey;", "contentDescription", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "focusable", "style", "Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "hint", "Lorg/jetbrains/jewel/ui/painter/PainterHint;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "iconClass", "Ljava/lang/Class;", "(Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/foundation/interaction/MutableInteractionSource;Ljava/lang/Class;Landroidx/compose/runtime/Composer;III)V", "tooltipStyle", "Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;", "tooltipModifier", "tooltipPlacement", "Landroidx/compose/foundation/TooltipPlacement;", "tooltip", "Landroidx/compose/runtime/Composable;", "(Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/painter/PainterHint;Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/TooltipPlacement;Landroidx/compose/foundation/interaction/MutableInteractionSource;Ljava/lang/Class;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "hints", "", "(Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;[Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/foundation/interaction/MutableInteractionSource;Ljava/lang/Class;Landroidx/compose/runtime/Composer;III)V", "(Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;[Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/TooltipPlacement;Landroidx/compose/foundation/interaction/MutableInteractionSource;Ljava/lang/Class;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "BaseIconActionButton", "(Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Ljava/lang/Class;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "CoreIconActionButton", "(Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Ljava/lang/Class;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorFilter;[Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/TooltipPlacement;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ui"})
/*     */ @SourceDebugExtension({"SMAP\nIconActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconActionButton.kt\norg/jetbrains/jewel/ui/component/IconActionButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,302:1\n1225#2,6:303\n1225#2,6:310\n1225#2,6:316\n1225#2,6:323\n1225#2,6:329\n1225#2,6:336\n149#3:309\n149#3:322\n149#3:335\n*S KotlinDebug\n*F\n+ 1 IconActionButton.kt\norg/jetbrains/jewel/ui/component/IconActionButtonKt\n*L\n46#1:303,6\n78#1:310,6\n110#1:316,6\n142#1:323,6\n255#1:329,6\n272#1:336,6\n77#1:309\n141#1:322\n271#1:335\n*E\n"})
/*     */ public final class IconActionButtonKt
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void IconActionButton(@NotNull IconKey key, @Nullable String contentDescription, @NotNull Function0 onClick, @Nullable Modifier modifier, boolean enabled, boolean focusable, @Nullable IconButtonStyle style, @Nullable ColorFilter colorFilter, @Nullable PainterHint hint, @Nullable MutableInteractionSource interactionSource, @Nullable Class iconClass, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'key'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'onClick'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload #11
/*     */     //   14: ldc 1041542864
/*     */     //   16: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   21: astore #11
/*     */     //   23: iload #12
/*     */     //   25: istore #15
/*     */     //   27: iload #13
/*     */     //   29: istore #16
/*     */     //   31: iload #14
/*     */     //   33: iconst_1
/*     */     //   34: iand
/*     */     //   35: ifeq -> 48
/*     */     //   38: iload #15
/*     */     //   40: bipush #6
/*     */     //   42: ior
/*     */     //   43: istore #15
/*     */     //   45: goto -> 96
/*     */     //   48: iload #12
/*     */     //   50: bipush #6
/*     */     //   52: iand
/*     */     //   53: ifne -> 96
/*     */     //   56: iload #15
/*     */     //   58: iload #12
/*     */     //   60: bipush #8
/*     */     //   62: iand
/*     */     //   63: ifne -> 77
/*     */     //   66: aload #11
/*     */     //   68: aload_0
/*     */     //   69: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   74: goto -> 85
/*     */     //   77: aload #11
/*     */     //   79: aload_0
/*     */     //   80: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   85: ifeq -> 92
/*     */     //   88: iconst_4
/*     */     //   89: goto -> 93
/*     */     //   92: iconst_2
/*     */     //   93: ior
/*     */     //   94: istore #15
/*     */     //   96: iload #14
/*     */     //   98: iconst_2
/*     */     //   99: iand
/*     */     //   100: ifeq -> 113
/*     */     //   103: iload #15
/*     */     //   105: bipush #48
/*     */     //   107: ior
/*     */     //   108: istore #15
/*     */     //   110: goto -> 144
/*     */     //   113: iload #12
/*     */     //   115: bipush #48
/*     */     //   117: iand
/*     */     //   118: ifne -> 144
/*     */     //   121: iload #15
/*     */     //   123: aload #11
/*     */     //   125: aload_1
/*     */     //   126: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   131: ifeq -> 139
/*     */     //   134: bipush #32
/*     */     //   136: goto -> 141
/*     */     //   139: bipush #16
/*     */     //   141: ior
/*     */     //   142: istore #15
/*     */     //   144: iload #14
/*     */     //   146: iconst_4
/*     */     //   147: iand
/*     */     //   148: ifeq -> 162
/*     */     //   151: iload #15
/*     */     //   153: sipush #384
/*     */     //   156: ior
/*     */     //   157: istore #15
/*     */     //   159: goto -> 196
/*     */     //   162: iload #12
/*     */     //   164: sipush #384
/*     */     //   167: iand
/*     */     //   168: ifne -> 196
/*     */     //   171: iload #15
/*     */     //   173: aload #11
/*     */     //   175: aload_2
/*     */     //   176: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   181: ifeq -> 190
/*     */     //   184: sipush #256
/*     */     //   187: goto -> 193
/*     */     //   190: sipush #128
/*     */     //   193: ior
/*     */     //   194: istore #15
/*     */     //   196: iload #14
/*     */     //   198: bipush #8
/*     */     //   200: iand
/*     */     //   201: ifeq -> 215
/*     */     //   204: iload #15
/*     */     //   206: sipush #3072
/*     */     //   209: ior
/*     */     //   210: istore #15
/*     */     //   212: goto -> 249
/*     */     //   215: iload #12
/*     */     //   217: sipush #3072
/*     */     //   220: iand
/*     */     //   221: ifne -> 249
/*     */     //   224: iload #15
/*     */     //   226: aload #11
/*     */     //   228: aload_3
/*     */     //   229: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   234: ifeq -> 243
/*     */     //   237: sipush #2048
/*     */     //   240: goto -> 246
/*     */     //   243: sipush #1024
/*     */     //   246: ior
/*     */     //   247: istore #15
/*     */     //   249: iload #14
/*     */     //   251: bipush #16
/*     */     //   253: iand
/*     */     //   254: ifeq -> 268
/*     */     //   257: iload #15
/*     */     //   259: sipush #24576
/*     */     //   262: ior
/*     */     //   263: istore #15
/*     */     //   265: goto -> 303
/*     */     //   268: iload #12
/*     */     //   270: sipush #24576
/*     */     //   273: iand
/*     */     //   274: ifne -> 303
/*     */     //   277: iload #15
/*     */     //   279: aload #11
/*     */     //   281: iload #4
/*     */     //   283: invokeinterface changed : (Z)Z
/*     */     //   288: ifeq -> 297
/*     */     //   291: sipush #16384
/*     */     //   294: goto -> 300
/*     */     //   297: sipush #8192
/*     */     //   300: ior
/*     */     //   301: istore #15
/*     */     //   303: iload #14
/*     */     //   305: bipush #32
/*     */     //   307: iand
/*     */     //   308: ifeq -> 321
/*     */     //   311: iload #15
/*     */     //   313: ldc 196608
/*     */     //   315: ior
/*     */     //   316: istore #15
/*     */     //   318: goto -> 353
/*     */     //   321: iload #12
/*     */     //   323: ldc 196608
/*     */     //   325: iand
/*     */     //   326: ifne -> 353
/*     */     //   329: iload #15
/*     */     //   331: aload #11
/*     */     //   333: iload #5
/*     */     //   335: invokeinterface changed : (Z)Z
/*     */     //   340: ifeq -> 348
/*     */     //   343: ldc 131072
/*     */     //   345: goto -> 350
/*     */     //   348: ldc 65536
/*     */     //   350: ior
/*     */     //   351: istore #15
/*     */     //   353: iload #12
/*     */     //   355: ldc 1572864
/*     */     //   357: iand
/*     */     //   358: ifne -> 393
/*     */     //   361: iload #15
/*     */     //   363: iload #14
/*     */     //   365: bipush #64
/*     */     //   367: iand
/*     */     //   368: ifne -> 388
/*     */     //   371: aload #11
/*     */     //   373: aload #6
/*     */     //   375: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   380: ifeq -> 388
/*     */     //   383: ldc 1048576
/*     */     //   385: goto -> 390
/*     */     //   388: ldc 524288
/*     */     //   390: ior
/*     */     //   391: istore #15
/*     */     //   393: iload #14
/*     */     //   395: sipush #128
/*     */     //   398: iand
/*     */     //   399: ifeq -> 412
/*     */     //   402: iload #15
/*     */     //   404: ldc 12582912
/*     */     //   406: ior
/*     */     //   407: istore #15
/*     */     //   409: goto -> 444
/*     */     //   412: iload #12
/*     */     //   414: ldc 12582912
/*     */     //   416: iand
/*     */     //   417: ifne -> 444
/*     */     //   420: iload #15
/*     */     //   422: aload #11
/*     */     //   424: aload #7
/*     */     //   426: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   431: ifeq -> 439
/*     */     //   434: ldc 8388608
/*     */     //   436: goto -> 441
/*     */     //   439: ldc 4194304
/*     */     //   441: ior
/*     */     //   442: istore #15
/*     */     //   444: iload #14
/*     */     //   446: sipush #256
/*     */     //   449: iand
/*     */     //   450: ifeq -> 463
/*     */     //   453: iload #15
/*     */     //   455: ldc 100663296
/*     */     //   457: ior
/*     */     //   458: istore #15
/*     */     //   460: goto -> 495
/*     */     //   463: iload #12
/*     */     //   465: ldc 100663296
/*     */     //   467: iand
/*     */     //   468: ifne -> 495
/*     */     //   471: iload #15
/*     */     //   473: aload #11
/*     */     //   475: aload #8
/*     */     //   477: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   482: ifeq -> 490
/*     */     //   485: ldc 67108864
/*     */     //   487: goto -> 492
/*     */     //   490: ldc 33554432
/*     */     //   492: ior
/*     */     //   493: istore #15
/*     */     //   495: iload #14
/*     */     //   497: sipush #512
/*     */     //   500: iand
/*     */     //   501: ifeq -> 514
/*     */     //   504: iload #15
/*     */     //   506: ldc 805306368
/*     */     //   508: ior
/*     */     //   509: istore #15
/*     */     //   511: goto -> 546
/*     */     //   514: iload #12
/*     */     //   516: ldc 805306368
/*     */     //   518: iand
/*     */     //   519: ifne -> 546
/*     */     //   522: iload #15
/*     */     //   524: aload #11
/*     */     //   526: aload #9
/*     */     //   528: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   533: ifeq -> 541
/*     */     //   536: ldc 536870912
/*     */     //   538: goto -> 543
/*     */     //   541: ldc 268435456
/*     */     //   543: ior
/*     */     //   544: istore #15
/*     */     //   546: iload #13
/*     */     //   548: bipush #6
/*     */     //   550: iand
/*     */     //   551: ifne -> 585
/*     */     //   554: iload #16
/*     */     //   556: iload #14
/*     */     //   558: sipush #1024
/*     */     //   561: iand
/*     */     //   562: ifne -> 581
/*     */     //   565: aload #11
/*     */     //   567: aload #10
/*     */     //   569: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   574: ifeq -> 581
/*     */     //   577: iconst_4
/*     */     //   578: goto -> 582
/*     */     //   581: iconst_2
/*     */     //   582: ior
/*     */     //   583: istore #16
/*     */     //   585: iload #15
/*     */     //   587: ldc 306783379
/*     */     //   589: iand
/*     */     //   590: ldc 306783378
/*     */     //   592: if_icmpne -> 613
/*     */     //   595: iload #16
/*     */     //   597: iconst_3
/*     */     //   598: iand
/*     */     //   599: iconst_2
/*     */     //   600: if_icmpne -> 613
/*     */     //   603: aload #11
/*     */     //   605: invokeinterface getSkipping : ()Z
/*     */     //   610: ifne -> 1029
/*     */     //   613: aload #11
/*     */     //   615: invokeinterface startDefaults : ()V
/*     */     //   620: iload #12
/*     */     //   622: iconst_1
/*     */     //   623: iand
/*     */     //   624: ifeq -> 637
/*     */     //   627: aload #11
/*     */     //   629: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   634: ifeq -> 844
/*     */     //   637: iload #14
/*     */     //   639: bipush #8
/*     */     //   641: iand
/*     */     //   642: ifeq -> 652
/*     */     //   645: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   648: checkcast androidx/compose/ui/Modifier
/*     */     //   651: astore_3
/*     */     //   652: iload #14
/*     */     //   654: bipush #16
/*     */     //   656: iand
/*     */     //   657: ifeq -> 663
/*     */     //   660: iconst_1
/*     */     //   661: istore #4
/*     */     //   663: iload #14
/*     */     //   665: bipush #32
/*     */     //   667: iand
/*     */     //   668: ifeq -> 674
/*     */     //   671: iconst_1
/*     */     //   672: istore #5
/*     */     //   674: iload #14
/*     */     //   676: bipush #64
/*     */     //   678: iand
/*     */     //   679: ifeq -> 701
/*     */     //   682: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   685: aload #11
/*     */     //   687: bipush #6
/*     */     //   689: invokestatic getIconButtonStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   692: astore #6
/*     */     //   694: iload #15
/*     */     //   696: ldc -3670017
/*     */     //   698: iand
/*     */     //   699: istore #15
/*     */     //   701: iload #14
/*     */     //   703: sipush #128
/*     */     //   706: iand
/*     */     //   707: ifeq -> 713
/*     */     //   710: aconst_null
/*     */     //   711: astore #7
/*     */     //   713: iload #14
/*     */     //   715: sipush #256
/*     */     //   718: iand
/*     */     //   719: ifeq -> 725
/*     */     //   722: aconst_null
/*     */     //   723: astore #8
/*     */     //   725: iload #14
/*     */     //   727: sipush #512
/*     */     //   730: iand
/*     */     //   731: ifeq -> 819
/*     */     //   734: aload #11
/*     */     //   736: ldc 2017534950
/*     */     //   738: invokeinterface startReplaceGroup : (I)V
/*     */     //   743: aload #11
/*     */     //   745: astore #18
/*     */     //   747: iconst_0
/*     */     //   748: istore #19
/*     */     //   750: iconst_0
/*     */     //   751: istore #20
/*     */     //   753: aload #18
/*     */     //   755: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   760: astore #21
/*     */     //   762: iconst_0
/*     */     //   763: istore #22
/*     */     //   765: aload #21
/*     */     //   767: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   770: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   773: if_acmpne -> 798
/*     */     //   776: iconst_0
/*     */     //   777: istore #23
/*     */     //   779: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   782: astore #23
/*     */     //   784: aload #18
/*     */     //   786: aload #23
/*     */     //   788: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   793: aload #23
/*     */     //   795: goto -> 800
/*     */     //   798: aload #21
/*     */     //   800: nop
/*     */     //   801: nop
/*     */     //   802: nop
/*     */     //   803: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   806: astore #17
/*     */     //   808: aload #11
/*     */     //   810: invokeinterface endReplaceGroup : ()V
/*     */     //   815: aload #17
/*     */     //   817: astore #9
/*     */     //   819: iload #14
/*     */     //   821: sipush #1024
/*     */     //   824: iand
/*     */     //   825: ifeq -> 882
/*     */     //   828: aload_0
/*     */     //   829: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   832: astore #10
/*     */     //   834: iload #16
/*     */     //   836: bipush #-15
/*     */     //   838: iand
/*     */     //   839: istore #16
/*     */     //   841: goto -> 882
/*     */     //   844: aload #11
/*     */     //   846: invokeinterface skipToGroupEnd : ()V
/*     */     //   851: iload #14
/*     */     //   853: bipush #64
/*     */     //   855: iand
/*     */     //   856: ifeq -> 866
/*     */     //   859: iload #15
/*     */     //   861: ldc -3670017
/*     */     //   863: iand
/*     */     //   864: istore #15
/*     */     //   866: iload #14
/*     */     //   868: sipush #1024
/*     */     //   871: iand
/*     */     //   872: ifeq -> 882
/*     */     //   875: iload #16
/*     */     //   877: bipush #-15
/*     */     //   879: iand
/*     */     //   880: istore #16
/*     */     //   882: aload #11
/*     */     //   884: invokeinterface endDefaults : ()V
/*     */     //   889: invokestatic isTraceInProgress : ()Z
/*     */     //   892: ifeq -> 906
/*     */     //   895: ldc 1041542864
/*     */     //   897: iload #15
/*     */     //   899: iload #16
/*     */     //   901: ldc 'org.jetbrains.jewel.ui.component.IconActionButton (IconActionButton.kt:47)'
/*     */     //   903: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   906: aload_0
/*     */     //   907: aload_1
/*     */     //   908: aload #10
/*     */     //   910: iload #4
/*     */     //   912: iload #5
/*     */     //   914: aload #6
/*     */     //   916: aload #9
/*     */     //   918: aload_3
/*     */     //   919: aload #7
/*     */     //   921: aload #8
/*     */     //   923: aload_2
/*     */     //   924: aload #11
/*     */     //   926: bipush #14
/*     */     //   928: iload #15
/*     */     //   930: iand
/*     */     //   931: bipush #112
/*     */     //   933: iload #15
/*     */     //   935: iand
/*     */     //   936: ior
/*     */     //   937: sipush #896
/*     */     //   940: iload #16
/*     */     //   942: bipush #6
/*     */     //   944: ishl
/*     */     //   945: iand
/*     */     //   946: ior
/*     */     //   947: sipush #7168
/*     */     //   950: iload #15
/*     */     //   952: iconst_3
/*     */     //   953: ishr
/*     */     //   954: iand
/*     */     //   955: ior
/*     */     //   956: ldc 57344
/*     */     //   958: iload #15
/*     */     //   960: iconst_3
/*     */     //   961: ishr
/*     */     //   962: iand
/*     */     //   963: ior
/*     */     //   964: ldc 458752
/*     */     //   966: iload #15
/*     */     //   968: iconst_3
/*     */     //   969: ishr
/*     */     //   970: iand
/*     */     //   971: ior
/*     */     //   972: ldc 3670016
/*     */     //   974: iload #15
/*     */     //   976: bipush #9
/*     */     //   978: ishr
/*     */     //   979: iand
/*     */     //   980: ior
/*     */     //   981: ldc 29360128
/*     */     //   983: iload #15
/*     */     //   985: bipush #12
/*     */     //   987: ishl
/*     */     //   988: iand
/*     */     //   989: ior
/*     */     //   990: ldc 234881024
/*     */     //   992: iload #15
/*     */     //   994: iconst_3
/*     */     //   995: ishl
/*     */     //   996: iand
/*     */     //   997: ior
/*     */     //   998: ldc 1879048192
/*     */     //   1000: iload #15
/*     */     //   1002: iconst_3
/*     */     //   1003: ishl
/*     */     //   1004: iand
/*     */     //   1005: ior
/*     */     //   1006: bipush #14
/*     */     //   1008: iload #15
/*     */     //   1010: bipush #6
/*     */     //   1012: ishr
/*     */     //   1013: iand
/*     */     //   1014: invokestatic BaseIconActionButton : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Ljava/lang/Class;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1017: invokestatic isTraceInProgress : ()Z
/*     */     //   1020: ifeq -> 1036
/*     */     //   1023: invokestatic traceEventEnd : ()V
/*     */     //   1026: goto -> 1036
/*     */     //   1029: aload #11
/*     */     //   1031: invokeinterface skipToGroupEnd : ()V
/*     */     //   1036: aload #11
/*     */     //   1038: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1043: dup
/*     */     //   1044: ifnull -> 1084
/*     */     //   1047: aload_0
/*     */     //   1048: aload_1
/*     */     //   1049: aload_2
/*     */     //   1050: aload_3
/*     */     //   1051: iload #4
/*     */     //   1053: iload #5
/*     */     //   1055: aload #6
/*     */     //   1057: aload #7
/*     */     //   1059: aload #8
/*     */     //   1061: aload #9
/*     */     //   1063: aload #10
/*     */     //   1065: iload #12
/*     */     //   1067: iload #13
/*     */     //   1069: iload #14
/*     */     //   1071: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/foundation/interaction/MutableInteractionSource;Ljava/lang/Class;III)Lkotlin/jvm/functions/Function2;
/*     */     //   1076: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1081: goto -> 1085
/*     */     //   1084: pop
/*     */     //   1085: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #48	-> 12
/*     */     //   #40	-> 645
/*     */     //   #41	-> 660
/*     */     //   #42	-> 671
/*     */     //   #43	-> 682
/*     */     //   #44	-> 710
/*     */     //   #45	-> 722
/*     */     //   #46	-> 734
/*     */     //   #303	-> 753
/*     */     //   #304	-> 765
/*     */     //   #305	-> 776
/*     */     //   #46	-> 779
/*     */     //   #305	-> 782
/*     */     //   #306	-> 784
/*     */     //   #307	-> 793
/*     */     //   #308	-> 798
/*     */     //   #304	-> 800
/*     */     //   #303	-> 801
/*     */     //   #303	-> 802
/*     */     //   #46	-> 803
/*     */     //   #47	-> 828
/*     */     //   #48	-> 903
/*     */     //   #50	-> 906
/*     */     //   #51	-> 907
/*     */     //   #52	-> 908
/*     */     //   #53	-> 910
/*     */     //   #54	-> 912
/*     */     //   #55	-> 914
/*     */     //   #56	-> 916
/*     */     //   #57	-> 918
/*     */     //   #58	-> 919
/*     */     //   #59	-> 921
/*     */     //   #60	-> 923
/*     */     //   #49	-> 1014
/*     */     //   #62	-> 1029
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   779	3	23	$i$a$-cache-IconActionButtonKt$IconActionButton$1	I
/*     */     //   784	11	23	value$iv	Ljava/lang/Object;
/*     */     //   765	36	22	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   762	39	21	it$iv	Ljava/lang/Object;
/*     */     //   753	50	20	$i$f$cache	I
/*     */     //   750	53	18	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   750	53	19	invalid$iv	Z
/*     */     //   27	1059	15	$dirty	I
/*     */     //   31	1055	16	$dirty1	I
/*     */     //   0	1086	0	key	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   0	1086	1	contentDescription	Ljava/lang/String;
/*     */     //   0	1086	2	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1086	3	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1086	4	enabled	Z
/*     */     //   0	1086	5	focusable	Z
/*     */     //   0	1086	6	style	Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   0	1086	7	colorFilter	Landroidx/compose/ui/graphics/ColorFilter;
/*     */     //   0	1086	8	hint	Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   0	1086	9	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1086	10	iconClass	Ljava/lang/Class;
/*     */     //   0	1086	11	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1086	12	$changed	I
/*     */     //   0	1086	13	$changed1	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
/*     */   public static final void IconActionButton(@NotNull IconKey key, @Nullable String contentDescription, @NotNull Function0 onClick, @Nullable Modifier modifier, boolean enabled, boolean focusable, @Nullable IconButtonStyle style, @Nullable ColorFilter colorFilter, @Nullable PainterHint hint, @Nullable TooltipStyle tooltipStyle, @Nullable Modifier tooltipModifier, @Nullable TooltipPlacement tooltipPlacement, @Nullable MutableInteractionSource interactionSource, @Nullable Class iconClass, @NotNull Function2 tooltip, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'key'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'onClick'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload #14
/*     */     //   14: ldc 'tooltip'
/*     */     //   16: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   19: aload #15
/*     */     //   21: ldc -1278809350
/*     */     //   23: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   28: astore #15
/*     */     //   30: iload #16
/*     */     //   32: istore #19
/*     */     //   34: iload #17
/*     */     //   36: istore #20
/*     */     //   38: iload #18
/*     */     //   40: iconst_1
/*     */     //   41: iand
/*     */     //   42: ifeq -> 55
/*     */     //   45: iload #19
/*     */     //   47: bipush #6
/*     */     //   49: ior
/*     */     //   50: istore #19
/*     */     //   52: goto -> 103
/*     */     //   55: iload #16
/*     */     //   57: bipush #6
/*     */     //   59: iand
/*     */     //   60: ifne -> 103
/*     */     //   63: iload #19
/*     */     //   65: iload #16
/*     */     //   67: bipush #8
/*     */     //   69: iand
/*     */     //   70: ifne -> 84
/*     */     //   73: aload #15
/*     */     //   75: aload_0
/*     */     //   76: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   81: goto -> 92
/*     */     //   84: aload #15
/*     */     //   86: aload_0
/*     */     //   87: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   92: ifeq -> 99
/*     */     //   95: iconst_4
/*     */     //   96: goto -> 100
/*     */     //   99: iconst_2
/*     */     //   100: ior
/*     */     //   101: istore #19
/*     */     //   103: iload #18
/*     */     //   105: iconst_2
/*     */     //   106: iand
/*     */     //   107: ifeq -> 120
/*     */     //   110: iload #19
/*     */     //   112: bipush #48
/*     */     //   114: ior
/*     */     //   115: istore #19
/*     */     //   117: goto -> 151
/*     */     //   120: iload #16
/*     */     //   122: bipush #48
/*     */     //   124: iand
/*     */     //   125: ifne -> 151
/*     */     //   128: iload #19
/*     */     //   130: aload #15
/*     */     //   132: aload_1
/*     */     //   133: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   138: ifeq -> 146
/*     */     //   141: bipush #32
/*     */     //   143: goto -> 148
/*     */     //   146: bipush #16
/*     */     //   148: ior
/*     */     //   149: istore #19
/*     */     //   151: iload #18
/*     */     //   153: iconst_4
/*     */     //   154: iand
/*     */     //   155: ifeq -> 169
/*     */     //   158: iload #19
/*     */     //   160: sipush #384
/*     */     //   163: ior
/*     */     //   164: istore #19
/*     */     //   166: goto -> 203
/*     */     //   169: iload #16
/*     */     //   171: sipush #384
/*     */     //   174: iand
/*     */     //   175: ifne -> 203
/*     */     //   178: iload #19
/*     */     //   180: aload #15
/*     */     //   182: aload_2
/*     */     //   183: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   188: ifeq -> 197
/*     */     //   191: sipush #256
/*     */     //   194: goto -> 200
/*     */     //   197: sipush #128
/*     */     //   200: ior
/*     */     //   201: istore #19
/*     */     //   203: iload #18
/*     */     //   205: bipush #8
/*     */     //   207: iand
/*     */     //   208: ifeq -> 222
/*     */     //   211: iload #19
/*     */     //   213: sipush #3072
/*     */     //   216: ior
/*     */     //   217: istore #19
/*     */     //   219: goto -> 256
/*     */     //   222: iload #16
/*     */     //   224: sipush #3072
/*     */     //   227: iand
/*     */     //   228: ifne -> 256
/*     */     //   231: iload #19
/*     */     //   233: aload #15
/*     */     //   235: aload_3
/*     */     //   236: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   241: ifeq -> 250
/*     */     //   244: sipush #2048
/*     */     //   247: goto -> 253
/*     */     //   250: sipush #1024
/*     */     //   253: ior
/*     */     //   254: istore #19
/*     */     //   256: iload #18
/*     */     //   258: bipush #16
/*     */     //   260: iand
/*     */     //   261: ifeq -> 275
/*     */     //   264: iload #19
/*     */     //   266: sipush #24576
/*     */     //   269: ior
/*     */     //   270: istore #19
/*     */     //   272: goto -> 310
/*     */     //   275: iload #16
/*     */     //   277: sipush #24576
/*     */     //   280: iand
/*     */     //   281: ifne -> 310
/*     */     //   284: iload #19
/*     */     //   286: aload #15
/*     */     //   288: iload #4
/*     */     //   290: invokeinterface changed : (Z)Z
/*     */     //   295: ifeq -> 304
/*     */     //   298: sipush #16384
/*     */     //   301: goto -> 307
/*     */     //   304: sipush #8192
/*     */     //   307: ior
/*     */     //   308: istore #19
/*     */     //   310: iload #18
/*     */     //   312: bipush #32
/*     */     //   314: iand
/*     */     //   315: ifeq -> 328
/*     */     //   318: iload #19
/*     */     //   320: ldc 196608
/*     */     //   322: ior
/*     */     //   323: istore #19
/*     */     //   325: goto -> 360
/*     */     //   328: iload #16
/*     */     //   330: ldc 196608
/*     */     //   332: iand
/*     */     //   333: ifne -> 360
/*     */     //   336: iload #19
/*     */     //   338: aload #15
/*     */     //   340: iload #5
/*     */     //   342: invokeinterface changed : (Z)Z
/*     */     //   347: ifeq -> 355
/*     */     //   350: ldc 131072
/*     */     //   352: goto -> 357
/*     */     //   355: ldc 65536
/*     */     //   357: ior
/*     */     //   358: istore #19
/*     */     //   360: iload #16
/*     */     //   362: ldc 1572864
/*     */     //   364: iand
/*     */     //   365: ifne -> 400
/*     */     //   368: iload #19
/*     */     //   370: iload #18
/*     */     //   372: bipush #64
/*     */     //   374: iand
/*     */     //   375: ifne -> 395
/*     */     //   378: aload #15
/*     */     //   380: aload #6
/*     */     //   382: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   387: ifeq -> 395
/*     */     //   390: ldc 1048576
/*     */     //   392: goto -> 397
/*     */     //   395: ldc 524288
/*     */     //   397: ior
/*     */     //   398: istore #19
/*     */     //   400: iload #18
/*     */     //   402: sipush #128
/*     */     //   405: iand
/*     */     //   406: ifeq -> 419
/*     */     //   409: iload #19
/*     */     //   411: ldc 12582912
/*     */     //   413: ior
/*     */     //   414: istore #19
/*     */     //   416: goto -> 451
/*     */     //   419: iload #16
/*     */     //   421: ldc 12582912
/*     */     //   423: iand
/*     */     //   424: ifne -> 451
/*     */     //   427: iload #19
/*     */     //   429: aload #15
/*     */     //   431: aload #7
/*     */     //   433: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   438: ifeq -> 446
/*     */     //   441: ldc 8388608
/*     */     //   443: goto -> 448
/*     */     //   446: ldc 4194304
/*     */     //   448: ior
/*     */     //   449: istore #19
/*     */     //   451: iload #18
/*     */     //   453: sipush #256
/*     */     //   456: iand
/*     */     //   457: ifeq -> 470
/*     */     //   460: iload #19
/*     */     //   462: ldc 100663296
/*     */     //   464: ior
/*     */     //   465: istore #19
/*     */     //   467: goto -> 502
/*     */     //   470: iload #16
/*     */     //   472: ldc 100663296
/*     */     //   474: iand
/*     */     //   475: ifne -> 502
/*     */     //   478: iload #19
/*     */     //   480: aload #15
/*     */     //   482: aload #8
/*     */     //   484: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   489: ifeq -> 497
/*     */     //   492: ldc 67108864
/*     */     //   494: goto -> 499
/*     */     //   497: ldc 33554432
/*     */     //   499: ior
/*     */     //   500: istore #19
/*     */     //   502: iload #16
/*     */     //   504: ldc 805306368
/*     */     //   506: iand
/*     */     //   507: ifne -> 543
/*     */     //   510: iload #19
/*     */     //   512: iload #18
/*     */     //   514: sipush #512
/*     */     //   517: iand
/*     */     //   518: ifne -> 538
/*     */     //   521: aload #15
/*     */     //   523: aload #9
/*     */     //   525: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   530: ifeq -> 538
/*     */     //   533: ldc 536870912
/*     */     //   535: goto -> 540
/*     */     //   538: ldc 268435456
/*     */     //   540: ior
/*     */     //   541: istore #19
/*     */     //   543: iload #18
/*     */     //   545: sipush #1024
/*     */     //   548: iand
/*     */     //   549: ifeq -> 562
/*     */     //   552: iload #20
/*     */     //   554: bipush #6
/*     */     //   556: ior
/*     */     //   557: istore #20
/*     */     //   559: goto -> 592
/*     */     //   562: iload #17
/*     */     //   564: bipush #6
/*     */     //   566: iand
/*     */     //   567: ifne -> 592
/*     */     //   570: iload #20
/*     */     //   572: aload #15
/*     */     //   574: aload #10
/*     */     //   576: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   581: ifeq -> 588
/*     */     //   584: iconst_4
/*     */     //   585: goto -> 589
/*     */     //   588: iconst_2
/*     */     //   589: ior
/*     */     //   590: istore #20
/*     */     //   592: iload #17
/*     */     //   594: bipush #48
/*     */     //   596: iand
/*     */     //   597: ifne -> 633
/*     */     //   600: iload #20
/*     */     //   602: iload #18
/*     */     //   604: sipush #2048
/*     */     //   607: iand
/*     */     //   608: ifne -> 628
/*     */     //   611: aload #15
/*     */     //   613: aload #11
/*     */     //   615: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   620: ifeq -> 628
/*     */     //   623: bipush #32
/*     */     //   625: goto -> 630
/*     */     //   628: bipush #16
/*     */     //   630: ior
/*     */     //   631: istore #20
/*     */     //   633: iload #18
/*     */     //   635: sipush #4096
/*     */     //   638: iand
/*     */     //   639: ifeq -> 653
/*     */     //   642: iload #20
/*     */     //   644: sipush #384
/*     */     //   647: ior
/*     */     //   648: istore #20
/*     */     //   650: goto -> 688
/*     */     //   653: iload #17
/*     */     //   655: sipush #384
/*     */     //   658: iand
/*     */     //   659: ifne -> 688
/*     */     //   662: iload #20
/*     */     //   664: aload #15
/*     */     //   666: aload #12
/*     */     //   668: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   673: ifeq -> 682
/*     */     //   676: sipush #256
/*     */     //   679: goto -> 685
/*     */     //   682: sipush #128
/*     */     //   685: ior
/*     */     //   686: istore #20
/*     */     //   688: iload #17
/*     */     //   690: sipush #3072
/*     */     //   693: iand
/*     */     //   694: ifne -> 732
/*     */     //   697: iload #20
/*     */     //   699: iload #18
/*     */     //   701: sipush #8192
/*     */     //   704: iand
/*     */     //   705: ifne -> 726
/*     */     //   708: aload #15
/*     */     //   710: aload #13
/*     */     //   712: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   717: ifeq -> 726
/*     */     //   720: sipush #2048
/*     */     //   723: goto -> 729
/*     */     //   726: sipush #1024
/*     */     //   729: ior
/*     */     //   730: istore #20
/*     */     //   732: iload #18
/*     */     //   734: sipush #16384
/*     */     //   737: iand
/*     */     //   738: ifeq -> 752
/*     */     //   741: iload #20
/*     */     //   743: sipush #24576
/*     */     //   746: ior
/*     */     //   747: istore #20
/*     */     //   749: goto -> 787
/*     */     //   752: iload #17
/*     */     //   754: sipush #24576
/*     */     //   757: iand
/*     */     //   758: ifne -> 787
/*     */     //   761: iload #20
/*     */     //   763: aload #15
/*     */     //   765: aload #14
/*     */     //   767: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   772: ifeq -> 781
/*     */     //   775: sipush #16384
/*     */     //   778: goto -> 784
/*     */     //   781: sipush #8192
/*     */     //   784: ior
/*     */     //   785: istore #20
/*     */     //   787: iload #19
/*     */     //   789: ldc 306783379
/*     */     //   791: iand
/*     */     //   792: ldc 306783378
/*     */     //   794: if_icmpne -> 819
/*     */     //   797: iload #20
/*     */     //   799: sipush #9363
/*     */     //   802: iand
/*     */     //   803: sipush #9362
/*     */     //   806: if_icmpne -> 819
/*     */     //   809: aload #15
/*     */     //   811: invokeinterface getSkipping : ()Z
/*     */     //   816: ifne -> 1358
/*     */     //   819: aload #15
/*     */     //   821: invokeinterface startDefaults : ()V
/*     */     //   826: iload #16
/*     */     //   828: iconst_1
/*     */     //   829: iand
/*     */     //   830: ifeq -> 843
/*     */     //   833: aload #15
/*     */     //   835: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   840: ifeq -> 1158
/*     */     //   843: iload #18
/*     */     //   845: bipush #8
/*     */     //   847: iand
/*     */     //   848: ifeq -> 858
/*     */     //   851: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   854: checkcast androidx/compose/ui/Modifier
/*     */     //   857: astore_3
/*     */     //   858: iload #18
/*     */     //   860: bipush #16
/*     */     //   862: iand
/*     */     //   863: ifeq -> 869
/*     */     //   866: iconst_1
/*     */     //   867: istore #4
/*     */     //   869: iload #18
/*     */     //   871: bipush #32
/*     */     //   873: iand
/*     */     //   874: ifeq -> 880
/*     */     //   877: iconst_1
/*     */     //   878: istore #5
/*     */     //   880: iload #18
/*     */     //   882: bipush #64
/*     */     //   884: iand
/*     */     //   885: ifeq -> 907
/*     */     //   888: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   891: aload #15
/*     */     //   893: bipush #6
/*     */     //   895: invokestatic getIconButtonStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   898: astore #6
/*     */     //   900: iload #19
/*     */     //   902: ldc -3670017
/*     */     //   904: iand
/*     */     //   905: istore #19
/*     */     //   907: iload #18
/*     */     //   909: sipush #128
/*     */     //   912: iand
/*     */     //   913: ifeq -> 919
/*     */     //   916: aconst_null
/*     */     //   917: astore #7
/*     */     //   919: iload #18
/*     */     //   921: sipush #256
/*     */     //   924: iand
/*     */     //   925: ifeq -> 931
/*     */     //   928: aconst_null
/*     */     //   929: astore #8
/*     */     //   931: iload #18
/*     */     //   933: sipush #512
/*     */     //   936: iand
/*     */     //   937: ifeq -> 959
/*     */     //   940: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   943: aload #15
/*     */     //   945: bipush #6
/*     */     //   947: invokestatic getTooltipStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;
/*     */     //   950: astore #9
/*     */     //   952: iload #19
/*     */     //   954: ldc -1879048193
/*     */     //   956: iand
/*     */     //   957: istore #19
/*     */     //   959: iload #18
/*     */     //   961: sipush #1024
/*     */     //   964: iand
/*     */     //   965: ifeq -> 976
/*     */     //   968: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   971: checkcast androidx/compose/ui/Modifier
/*     */     //   974: astore #10
/*     */     //   976: iload #18
/*     */     //   978: sipush #2048
/*     */     //   981: iand
/*     */     //   982: ifeq -> 1037
/*     */     //   985: new org/jetbrains/jewel/ui/component/FixedCursorPoint
/*     */     //   988: dup
/*     */     //   989: iconst_0
/*     */     //   990: istore #21
/*     */     //   992: iconst_0
/*     */     //   993: istore #22
/*     */     //   995: iload #21
/*     */     //   997: i2f
/*     */     //   998: invokestatic constructor-impl : (F)F
/*     */     //   1001: bipush #16
/*     */     //   1003: istore #21
/*     */     //   1005: iconst_0
/*     */     //   1006: istore #22
/*     */     //   1008: iload #21
/*     */     //   1010: i2f
/*     */     //   1011: invokestatic constructor-impl : (F)F
/*     */     //   1014: invokestatic DpOffset-YgX7TsA : (FF)J
/*     */     //   1017: aconst_null
/*     */     //   1018: fconst_0
/*     */     //   1019: bipush #6
/*     */     //   1021: aconst_null
/*     */     //   1022: invokespecial <init> : (JLandroidx/compose/ui/Alignment;FILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   1025: checkcast androidx/compose/foundation/TooltipPlacement
/*     */     //   1028: astore #11
/*     */     //   1030: iload #20
/*     */     //   1032: bipush #-113
/*     */     //   1034: iand
/*     */     //   1035: istore #20
/*     */     //   1037: iload #18
/*     */     //   1039: sipush #4096
/*     */     //   1042: iand
/*     */     //   1043: ifeq -> 1132
/*     */     //   1046: aload #15
/*     */     //   1048: ldc_w 2017568262
/*     */     //   1051: invokeinterface startReplaceGroup : (I)V
/*     */     //   1056: aload #15
/*     */     //   1058: astore #22
/*     */     //   1060: iconst_0
/*     */     //   1061: istore #23
/*     */     //   1063: iconst_0
/*     */     //   1064: istore #24
/*     */     //   1066: aload #22
/*     */     //   1068: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1073: astore #25
/*     */     //   1075: iconst_0
/*     */     //   1076: istore #26
/*     */     //   1078: aload #25
/*     */     //   1080: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1083: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1086: if_acmpne -> 1111
/*     */     //   1089: iconst_0
/*     */     //   1090: istore #27
/*     */     //   1092: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   1095: astore #27
/*     */     //   1097: aload #22
/*     */     //   1099: aload #27
/*     */     //   1101: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1106: aload #27
/*     */     //   1108: goto -> 1113
/*     */     //   1111: aload #25
/*     */     //   1113: nop
/*     */     //   1114: nop
/*     */     //   1115: nop
/*     */     //   1116: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   1119: astore #21
/*     */     //   1121: aload #15
/*     */     //   1123: invokeinterface endReplaceGroup : ()V
/*     */     //   1128: aload #21
/*     */     //   1130: astore #12
/*     */     //   1132: iload #18
/*     */     //   1134: sipush #8192
/*     */     //   1137: iand
/*     */     //   1138: ifeq -> 1229
/*     */     //   1141: aload_0
/*     */     //   1142: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   1145: astore #13
/*     */     //   1147: iload #20
/*     */     //   1149: sipush #-7169
/*     */     //   1152: iand
/*     */     //   1153: istore #20
/*     */     //   1155: goto -> 1229
/*     */     //   1158: aload #15
/*     */     //   1160: invokeinterface skipToGroupEnd : ()V
/*     */     //   1165: iload #18
/*     */     //   1167: bipush #64
/*     */     //   1169: iand
/*     */     //   1170: ifeq -> 1180
/*     */     //   1173: iload #19
/*     */     //   1175: ldc -3670017
/*     */     //   1177: iand
/*     */     //   1178: istore #19
/*     */     //   1180: iload #18
/*     */     //   1182: sipush #512
/*     */     //   1185: iand
/*     */     //   1186: ifeq -> 1196
/*     */     //   1189: iload #19
/*     */     //   1191: ldc -1879048193
/*     */     //   1193: iand
/*     */     //   1194: istore #19
/*     */     //   1196: iload #18
/*     */     //   1198: sipush #2048
/*     */     //   1201: iand
/*     */     //   1202: ifeq -> 1212
/*     */     //   1205: iload #20
/*     */     //   1207: bipush #-113
/*     */     //   1209: iand
/*     */     //   1210: istore #20
/*     */     //   1212: iload #18
/*     */     //   1214: sipush #8192
/*     */     //   1217: iand
/*     */     //   1218: ifeq -> 1229
/*     */     //   1221: iload #20
/*     */     //   1223: sipush #-7169
/*     */     //   1226: iand
/*     */     //   1227: istore #20
/*     */     //   1229: aload #15
/*     */     //   1231: invokeinterface endDefaults : ()V
/*     */     //   1236: invokestatic isTraceInProgress : ()Z
/*     */     //   1239: ifeq -> 1254
/*     */     //   1242: ldc -1278809350
/*     */     //   1244: iload #19
/*     */     //   1246: iload #20
/*     */     //   1248: ldc_w 'org.jetbrains.jewel.ui.component.IconActionButton (IconActionButton.kt:80)'
/*     */     //   1251: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   1254: aload #14
/*     */     //   1256: aload #10
/*     */     //   1258: iconst_0
/*     */     //   1259: aload #9
/*     */     //   1261: aload #11
/*     */     //   1263: ldc_w -710290579
/*     */     //   1266: iconst_1
/*     */     //   1267: new org/jetbrains/jewel/ui/component/IconActionButtonKt$IconActionButton$4
/*     */     //   1270: dup
/*     */     //   1271: aload_0
/*     */     //   1272: aload_1
/*     */     //   1273: aload #13
/*     */     //   1275: iload #4
/*     */     //   1277: iload #5
/*     */     //   1279: aload #6
/*     */     //   1281: aload #12
/*     */     //   1283: aload_3
/*     */     //   1284: aload #7
/*     */     //   1286: aload #8
/*     */     //   1288: aload_2
/*     */     //   1289: invokespecial <init> : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Ljava/lang/Class;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;)V
/*     */     //   1292: aload #15
/*     */     //   1294: bipush #54
/*     */     //   1296: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1299: checkcast kotlin/jvm/functions/Function2
/*     */     //   1302: aload #15
/*     */     //   1304: ldc 196608
/*     */     //   1306: bipush #14
/*     */     //   1308: iload #20
/*     */     //   1310: bipush #12
/*     */     //   1312: ishr
/*     */     //   1313: iand
/*     */     //   1314: ior
/*     */     //   1315: bipush #112
/*     */     //   1317: iload #20
/*     */     //   1319: iconst_3
/*     */     //   1320: ishl
/*     */     //   1321: iand
/*     */     //   1322: ior
/*     */     //   1323: sipush #7168
/*     */     //   1326: iload #19
/*     */     //   1328: bipush #18
/*     */     //   1330: ishr
/*     */     //   1331: iand
/*     */     //   1332: ior
/*     */     //   1333: ldc 57344
/*     */     //   1335: iload #20
/*     */     //   1337: bipush #9
/*     */     //   1339: ishl
/*     */     //   1340: iand
/*     */     //   1341: ior
/*     */     //   1342: iconst_4
/*     */     //   1343: invokestatic Tooltip : (Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/foundation/TooltipPlacement;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1346: invokestatic isTraceInProgress : ()Z
/*     */     //   1349: ifeq -> 1365
/*     */     //   1352: invokestatic traceEventEnd : ()V
/*     */     //   1355: goto -> 1365
/*     */     //   1358: aload #15
/*     */     //   1360: invokeinterface skipToGroupEnd : ()V
/*     */     //   1365: aload #15
/*     */     //   1367: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1372: dup
/*     */     //   1373: ifnull -> 1421
/*     */     //   1376: aload_0
/*     */     //   1377: aload_1
/*     */     //   1378: aload_2
/*     */     //   1379: aload_3
/*     */     //   1380: iload #4
/*     */     //   1382: iload #5
/*     */     //   1384: aload #6
/*     */     //   1386: aload #7
/*     */     //   1388: aload #8
/*     */     //   1390: aload #9
/*     */     //   1392: aload #10
/*     */     //   1394: aload #11
/*     */     //   1396: aload #12
/*     */     //   1398: aload #13
/*     */     //   1400: aload #14
/*     */     //   1402: iload #16
/*     */     //   1404: iload #17
/*     */     //   1406: iload #18
/*     */     //   1408: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/painter/PainterHint;Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/TooltipPlacement;Landroidx/compose/foundation/interaction/MutableInteractionSource;Ljava/lang/Class;Lkotlin/jvm/functions/Function2;III)Lkotlin/jvm/functions/Function2;
/*     */     //   1413: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1418: goto -> 1422
/*     */     //   1421: pop
/*     */     //   1422: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #81	-> 19
/*     */     //   #69	-> 851
/*     */     //   #70	-> 866
/*     */     //   #71	-> 877
/*     */     //   #72	-> 888
/*     */     //   #73	-> 916
/*     */     //   #74	-> 928
/*     */     //   #75	-> 940
/*     */     //   #76	-> 968
/*     */     //   #77	-> 985
/*     */     //   #309	-> 995
/*     */     //   #77	-> 1001
/*     */     //   #309	-> 1008
/*     */     //   #77	-> 1014
/*     */     //   #78	-> 1046
/*     */     //   #310	-> 1066
/*     */     //   #311	-> 1078
/*     */     //   #312	-> 1089
/*     */     //   #78	-> 1092
/*     */     //   #312	-> 1095
/*     */     //   #313	-> 1097
/*     */     //   #314	-> 1106
/*     */     //   #315	-> 1111
/*     */     //   #311	-> 1113
/*     */     //   #310	-> 1114
/*     */     //   #310	-> 1115
/*     */     //   #78	-> 1116
/*     */     //   #79	-> 1141
/*     */     //   #81	-> 1251
/*     */     //   #82	-> 1254
/*     */     //   #97	-> 1358
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   995	6	22	$i$f$getDp	I
/*     */     //   992	9	21	$this$dp$iv	I
/*     */     //   1008	6	22	$i$f$getDp	I
/*     */     //   1005	9	21	$this$dp$iv	I
/*     */     //   1092	3	27	$i$a$-cache-IconActionButtonKt$IconActionButton$3	I
/*     */     //   1097	11	27	value$iv	Ljava/lang/Object;
/*     */     //   1078	36	26	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1075	39	25	it$iv	Ljava/lang/Object;
/*     */     //   1066	50	24	$i$f$cache	I
/*     */     //   1063	53	22	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1063	53	23	invalid$iv	Z
/*     */     //   34	1389	19	$dirty	I
/*     */     //   38	1385	20	$dirty1	I
/*     */     //   0	1423	0	key	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   0	1423	1	contentDescription	Ljava/lang/String;
/*     */     //   0	1423	2	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1423	3	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1423	4	enabled	Z
/*     */     //   0	1423	5	focusable	Z
/*     */     //   0	1423	6	style	Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   0	1423	7	colorFilter	Landroidx/compose/ui/graphics/ColorFilter;
/*     */     //   0	1423	8	hint	Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   0	1423	9	tooltipStyle	Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;
/*     */     //   0	1423	10	tooltipModifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1423	11	tooltipPlacement	Landroidx/compose/foundation/TooltipPlacement;
/*     */     //   0	1423	12	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1423	13	iconClass	Ljava/lang/Class;
/*     */     //   0	1423	14	tooltip	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1423	15	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1423	16	$changed	I
/*     */     //   0	1423	17	$changed1	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class IconActionButtonKt$IconActionButton$4
/*     */     implements Function2<Composer, Integer, Unit>
/*     */   {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*  83 */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-710290579, $changed, -1, "org.jetbrains.jewel.ui.component.IconActionButton.<anonymous> (IconActionButton.kt:82)");  IconActionButtonKt.BaseIconActionButton(
/*  84 */             this.$key, 
/*  85 */             this.$contentDescription, 
/*  86 */             this.$iconClass, 
/*  87 */             this.$enabled, 
/*  88 */             this.$focusable, 
/*  89 */             this.$style, 
/*  90 */             this.$interactionSource, 
/*  91 */             this.$modifier, 
/*  92 */             this.$colorFilter, 
/*  93 */             this.$hint, 
/*  94 */             this.$onClick, $composer, 0, 0); if (ComposerKt.isTraceInProgress())
/*  95 */           ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
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
/*     */     IconActionButtonKt$IconActionButton$4(IconKey $key, String $contentDescription, Class<?> $iconClass, boolean $enabled, boolean $focusable, IconButtonStyle $style, MutableInteractionSource $interactionSource, Modifier $modifier, ColorFilter $colorFilter, PainterHint $hint, Function0<Unit> $onClick) {}
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
/*     */   public static final void IconActionButton(@NotNull IconKey key, @Nullable String contentDescription, @NotNull PainterHint[] hints, @NotNull Function0 onClick, @Nullable Modifier modifier, boolean enabled, boolean focusable, @Nullable IconButtonStyle style, @Nullable ColorFilter colorFilter, @Nullable MutableInteractionSource interactionSource, @Nullable Class iconClass, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'key'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc_w 'hints'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload_3
/*     */     //   14: ldc 'onClick'
/*     */     //   16: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   19: aload #11
/*     */     //   21: ldc_w -1962133123
/*     */     //   24: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   29: astore #11
/*     */     //   31: iload #12
/*     */     //   33: istore #15
/*     */     //   35: iload #13
/*     */     //   37: istore #16
/*     */     //   39: iload #14
/*     */     //   41: iconst_1
/*     */     //   42: iand
/*     */     //   43: ifeq -> 56
/*     */     //   46: iload #15
/*     */     //   48: bipush #6
/*     */     //   50: ior
/*     */     //   51: istore #15
/*     */     //   53: goto -> 104
/*     */     //   56: iload #12
/*     */     //   58: bipush #6
/*     */     //   60: iand
/*     */     //   61: ifne -> 104
/*     */     //   64: iload #15
/*     */     //   66: iload #12
/*     */     //   68: bipush #8
/*     */     //   70: iand
/*     */     //   71: ifne -> 85
/*     */     //   74: aload #11
/*     */     //   76: aload_0
/*     */     //   77: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   82: goto -> 93
/*     */     //   85: aload #11
/*     */     //   87: aload_0
/*     */     //   88: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   93: ifeq -> 100
/*     */     //   96: iconst_4
/*     */     //   97: goto -> 101
/*     */     //   100: iconst_2
/*     */     //   101: ior
/*     */     //   102: istore #15
/*     */     //   104: iload #14
/*     */     //   106: iconst_2
/*     */     //   107: iand
/*     */     //   108: ifeq -> 121
/*     */     //   111: iload #15
/*     */     //   113: bipush #48
/*     */     //   115: ior
/*     */     //   116: istore #15
/*     */     //   118: goto -> 152
/*     */     //   121: iload #12
/*     */     //   123: bipush #48
/*     */     //   125: iand
/*     */     //   126: ifne -> 152
/*     */     //   129: iload #15
/*     */     //   131: aload #11
/*     */     //   133: aload_1
/*     */     //   134: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   139: ifeq -> 147
/*     */     //   142: bipush #32
/*     */     //   144: goto -> 149
/*     */     //   147: bipush #16
/*     */     //   149: ior
/*     */     //   150: istore #15
/*     */     //   152: iload #14
/*     */     //   154: iconst_4
/*     */     //   155: iand
/*     */     //   156: ifeq -> 170
/*     */     //   159: iload #15
/*     */     //   161: sipush #384
/*     */     //   164: ior
/*     */     //   165: istore #15
/*     */     //   167: goto -> 204
/*     */     //   170: iload #12
/*     */     //   172: sipush #384
/*     */     //   175: iand
/*     */     //   176: ifne -> 204
/*     */     //   179: iload #15
/*     */     //   181: aload #11
/*     */     //   183: aload_2
/*     */     //   184: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   189: ifeq -> 198
/*     */     //   192: sipush #256
/*     */     //   195: goto -> 201
/*     */     //   198: sipush #128
/*     */     //   201: ior
/*     */     //   202: istore #15
/*     */     //   204: iload #14
/*     */     //   206: bipush #8
/*     */     //   208: iand
/*     */     //   209: ifeq -> 223
/*     */     //   212: iload #15
/*     */     //   214: sipush #3072
/*     */     //   217: ior
/*     */     //   218: istore #15
/*     */     //   220: goto -> 257
/*     */     //   223: iload #12
/*     */     //   225: sipush #3072
/*     */     //   228: iand
/*     */     //   229: ifne -> 257
/*     */     //   232: iload #15
/*     */     //   234: aload #11
/*     */     //   236: aload_3
/*     */     //   237: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   242: ifeq -> 251
/*     */     //   245: sipush #2048
/*     */     //   248: goto -> 254
/*     */     //   251: sipush #1024
/*     */     //   254: ior
/*     */     //   255: istore #15
/*     */     //   257: iload #14
/*     */     //   259: bipush #16
/*     */     //   261: iand
/*     */     //   262: ifeq -> 276
/*     */     //   265: iload #15
/*     */     //   267: sipush #24576
/*     */     //   270: ior
/*     */     //   271: istore #15
/*     */     //   273: goto -> 311
/*     */     //   276: iload #12
/*     */     //   278: sipush #24576
/*     */     //   281: iand
/*     */     //   282: ifne -> 311
/*     */     //   285: iload #15
/*     */     //   287: aload #11
/*     */     //   289: aload #4
/*     */     //   291: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   296: ifeq -> 305
/*     */     //   299: sipush #16384
/*     */     //   302: goto -> 308
/*     */     //   305: sipush #8192
/*     */     //   308: ior
/*     */     //   309: istore #15
/*     */     //   311: iload #14
/*     */     //   313: bipush #32
/*     */     //   315: iand
/*     */     //   316: ifeq -> 329
/*     */     //   319: iload #15
/*     */     //   321: ldc 196608
/*     */     //   323: ior
/*     */     //   324: istore #15
/*     */     //   326: goto -> 361
/*     */     //   329: iload #12
/*     */     //   331: ldc 196608
/*     */     //   333: iand
/*     */     //   334: ifne -> 361
/*     */     //   337: iload #15
/*     */     //   339: aload #11
/*     */     //   341: iload #5
/*     */     //   343: invokeinterface changed : (Z)Z
/*     */     //   348: ifeq -> 356
/*     */     //   351: ldc 131072
/*     */     //   353: goto -> 358
/*     */     //   356: ldc 65536
/*     */     //   358: ior
/*     */     //   359: istore #15
/*     */     //   361: iload #14
/*     */     //   363: bipush #64
/*     */     //   365: iand
/*     */     //   366: ifeq -> 379
/*     */     //   369: iload #15
/*     */     //   371: ldc 1572864
/*     */     //   373: ior
/*     */     //   374: istore #15
/*     */     //   376: goto -> 411
/*     */     //   379: iload #12
/*     */     //   381: ldc 1572864
/*     */     //   383: iand
/*     */     //   384: ifne -> 411
/*     */     //   387: iload #15
/*     */     //   389: aload #11
/*     */     //   391: iload #6
/*     */     //   393: invokeinterface changed : (Z)Z
/*     */     //   398: ifeq -> 406
/*     */     //   401: ldc 1048576
/*     */     //   403: goto -> 408
/*     */     //   406: ldc 524288
/*     */     //   408: ior
/*     */     //   409: istore #15
/*     */     //   411: iload #12
/*     */     //   413: ldc 12582912
/*     */     //   415: iand
/*     */     //   416: ifne -> 452
/*     */     //   419: iload #15
/*     */     //   421: iload #14
/*     */     //   423: sipush #128
/*     */     //   426: iand
/*     */     //   427: ifne -> 447
/*     */     //   430: aload #11
/*     */     //   432: aload #7
/*     */     //   434: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   439: ifeq -> 447
/*     */     //   442: ldc 8388608
/*     */     //   444: goto -> 449
/*     */     //   447: ldc 4194304
/*     */     //   449: ior
/*     */     //   450: istore #15
/*     */     //   452: iload #14
/*     */     //   454: sipush #256
/*     */     //   457: iand
/*     */     //   458: ifeq -> 471
/*     */     //   461: iload #15
/*     */     //   463: ldc 100663296
/*     */     //   465: ior
/*     */     //   466: istore #15
/*     */     //   468: goto -> 503
/*     */     //   471: iload #12
/*     */     //   473: ldc 100663296
/*     */     //   475: iand
/*     */     //   476: ifne -> 503
/*     */     //   479: iload #15
/*     */     //   481: aload #11
/*     */     //   483: aload #8
/*     */     //   485: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   490: ifeq -> 498
/*     */     //   493: ldc 67108864
/*     */     //   495: goto -> 500
/*     */     //   498: ldc 33554432
/*     */     //   500: ior
/*     */     //   501: istore #15
/*     */     //   503: iload #14
/*     */     //   505: sipush #512
/*     */     //   508: iand
/*     */     //   509: ifeq -> 522
/*     */     //   512: iload #15
/*     */     //   514: ldc 805306368
/*     */     //   516: ior
/*     */     //   517: istore #15
/*     */     //   519: goto -> 554
/*     */     //   522: iload #12
/*     */     //   524: ldc 805306368
/*     */     //   526: iand
/*     */     //   527: ifne -> 554
/*     */     //   530: iload #15
/*     */     //   532: aload #11
/*     */     //   534: aload #9
/*     */     //   536: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   541: ifeq -> 549
/*     */     //   544: ldc 536870912
/*     */     //   546: goto -> 551
/*     */     //   549: ldc 268435456
/*     */     //   551: ior
/*     */     //   552: istore #15
/*     */     //   554: iload #13
/*     */     //   556: bipush #6
/*     */     //   558: iand
/*     */     //   559: ifne -> 593
/*     */     //   562: iload #16
/*     */     //   564: iload #14
/*     */     //   566: sipush #1024
/*     */     //   569: iand
/*     */     //   570: ifne -> 589
/*     */     //   573: aload #11
/*     */     //   575: aload #10
/*     */     //   577: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   582: ifeq -> 589
/*     */     //   585: iconst_4
/*     */     //   586: goto -> 590
/*     */     //   589: iconst_2
/*     */     //   590: ior
/*     */     //   591: istore #16
/*     */     //   593: iload #15
/*     */     //   595: ldc 306783379
/*     */     //   597: iand
/*     */     //   598: ldc 306783378
/*     */     //   600: if_icmpne -> 621
/*     */     //   603: iload #16
/*     */     //   605: iconst_3
/*     */     //   606: iand
/*     */     //   607: iconst_2
/*     */     //   608: if_icmpne -> 621
/*     */     //   611: aload #11
/*     */     //   613: invokeinterface getSkipping : ()Z
/*     */     //   618: ifne -> 1035
/*     */     //   621: aload #11
/*     */     //   623: invokeinterface startDefaults : ()V
/*     */     //   628: iload #12
/*     */     //   630: iconst_1
/*     */     //   631: iand
/*     */     //   632: ifeq -> 645
/*     */     //   635: aload #11
/*     */     //   637: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   642: ifeq -> 844
/*     */     //   645: iload #14
/*     */     //   647: bipush #16
/*     */     //   649: iand
/*     */     //   650: ifeq -> 661
/*     */     //   653: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   656: checkcast androidx/compose/ui/Modifier
/*     */     //   659: astore #4
/*     */     //   661: iload #14
/*     */     //   663: bipush #32
/*     */     //   665: iand
/*     */     //   666: ifeq -> 672
/*     */     //   669: iconst_1
/*     */     //   670: istore #5
/*     */     //   672: iload #14
/*     */     //   674: bipush #64
/*     */     //   676: iand
/*     */     //   677: ifeq -> 683
/*     */     //   680: iconst_1
/*     */     //   681: istore #6
/*     */     //   683: iload #14
/*     */     //   685: sipush #128
/*     */     //   688: iand
/*     */     //   689: ifeq -> 712
/*     */     //   692: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   695: aload #11
/*     */     //   697: bipush #6
/*     */     //   699: invokestatic getIconButtonStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   702: astore #7
/*     */     //   704: iload #15
/*     */     //   706: ldc_w -29360129
/*     */     //   709: iand
/*     */     //   710: istore #15
/*     */     //   712: iload #14
/*     */     //   714: sipush #256
/*     */     //   717: iand
/*     */     //   718: ifeq -> 724
/*     */     //   721: aconst_null
/*     */     //   722: astore #8
/*     */     //   724: iload #14
/*     */     //   726: sipush #512
/*     */     //   729: iand
/*     */     //   730: ifeq -> 819
/*     */     //   733: aload #11
/*     */     //   735: ldc_w 2017602022
/*     */     //   738: invokeinterface startReplaceGroup : (I)V
/*     */     //   743: aload #11
/*     */     //   745: astore #18
/*     */     //   747: iconst_0
/*     */     //   748: istore #19
/*     */     //   750: iconst_0
/*     */     //   751: istore #20
/*     */     //   753: aload #18
/*     */     //   755: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   760: astore #21
/*     */     //   762: iconst_0
/*     */     //   763: istore #22
/*     */     //   765: aload #21
/*     */     //   767: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   770: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   773: if_acmpne -> 798
/*     */     //   776: iconst_0
/*     */     //   777: istore #23
/*     */     //   779: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   782: astore #23
/*     */     //   784: aload #18
/*     */     //   786: aload #23
/*     */     //   788: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   793: aload #23
/*     */     //   795: goto -> 800
/*     */     //   798: aload #21
/*     */     //   800: nop
/*     */     //   801: nop
/*     */     //   802: nop
/*     */     //   803: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   806: astore #17
/*     */     //   808: aload #11
/*     */     //   810: invokeinterface endReplaceGroup : ()V
/*     */     //   815: aload #17
/*     */     //   817: astore #9
/*     */     //   819: iload #14
/*     */     //   821: sipush #1024
/*     */     //   824: iand
/*     */     //   825: ifeq -> 884
/*     */     //   828: aload_0
/*     */     //   829: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   832: astore #10
/*     */     //   834: iload #16
/*     */     //   836: bipush #-15
/*     */     //   838: iand
/*     */     //   839: istore #16
/*     */     //   841: goto -> 884
/*     */     //   844: aload #11
/*     */     //   846: invokeinterface skipToGroupEnd : ()V
/*     */     //   851: iload #14
/*     */     //   853: sipush #128
/*     */     //   856: iand
/*     */     //   857: ifeq -> 868
/*     */     //   860: iload #15
/*     */     //   862: ldc_w -29360129
/*     */     //   865: iand
/*     */     //   866: istore #15
/*     */     //   868: iload #14
/*     */     //   870: sipush #1024
/*     */     //   873: iand
/*     */     //   874: ifeq -> 884
/*     */     //   877: iload #16
/*     */     //   879: bipush #-15
/*     */     //   881: iand
/*     */     //   882: istore #16
/*     */     //   884: aload #11
/*     */     //   886: invokeinterface endDefaults : ()V
/*     */     //   891: invokestatic isTraceInProgress : ()Z
/*     */     //   894: ifeq -> 910
/*     */     //   897: ldc_w -1962133123
/*     */     //   900: iload #15
/*     */     //   902: iload #16
/*     */     //   904: ldc_w 'org.jetbrains.jewel.ui.component.IconActionButton (IconActionButton.kt:111)'
/*     */     //   907: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   910: aload_0
/*     */     //   911: aload_1
/*     */     //   912: aload #10
/*     */     //   914: iload #5
/*     */     //   916: iload #6
/*     */     //   918: aload #7
/*     */     //   920: aload #9
/*     */     //   922: aload #4
/*     */     //   924: aload #8
/*     */     //   926: aload_2
/*     */     //   927: aload_3
/*     */     //   928: aload #11
/*     */     //   930: bipush #14
/*     */     //   932: iload #15
/*     */     //   934: iand
/*     */     //   935: bipush #112
/*     */     //   937: iload #15
/*     */     //   939: iand
/*     */     //   940: ior
/*     */     //   941: sipush #896
/*     */     //   944: iload #16
/*     */     //   946: bipush #6
/*     */     //   948: ishl
/*     */     //   949: iand
/*     */     //   950: ior
/*     */     //   951: sipush #7168
/*     */     //   954: iload #15
/*     */     //   956: bipush #6
/*     */     //   958: ishr
/*     */     //   959: iand
/*     */     //   960: ior
/*     */     //   961: ldc 57344
/*     */     //   963: iload #15
/*     */     //   965: bipush #6
/*     */     //   967: ishr
/*     */     //   968: iand
/*     */     //   969: ior
/*     */     //   970: ldc 458752
/*     */     //   972: iload #15
/*     */     //   974: bipush #6
/*     */     //   976: ishr
/*     */     //   977: iand
/*     */     //   978: ior
/*     */     //   979: ldc 3670016
/*     */     //   981: iload #15
/*     */     //   983: bipush #9
/*     */     //   985: ishr
/*     */     //   986: iand
/*     */     //   987: ior
/*     */     //   988: ldc 29360128
/*     */     //   990: iload #15
/*     */     //   992: bipush #9
/*     */     //   994: ishl
/*     */     //   995: iand
/*     */     //   996: ior
/*     */     //   997: ldc 234881024
/*     */     //   999: iload #15
/*     */     //   1001: iand
/*     */     //   1002: ior
/*     */     //   1003: ldc 1879048192
/*     */     //   1005: iload #15
/*     */     //   1007: bipush #21
/*     */     //   1009: ishl
/*     */     //   1010: iand
/*     */     //   1011: ior
/*     */     //   1012: bipush #14
/*     */     //   1014: iload #15
/*     */     //   1016: bipush #9
/*     */     //   1018: ishr
/*     */     //   1019: iand
/*     */     //   1020: invokestatic CoreIconActionButton : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Ljava/lang/Class;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorFilter;[Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1023: invokestatic isTraceInProgress : ()Z
/*     */     //   1026: ifeq -> 1042
/*     */     //   1029: invokestatic traceEventEnd : ()V
/*     */     //   1032: goto -> 1042
/*     */     //   1035: aload #11
/*     */     //   1037: invokeinterface skipToGroupEnd : ()V
/*     */     //   1042: aload #11
/*     */     //   1044: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1049: dup
/*     */     //   1050: ifnull -> 1090
/*     */     //   1053: aload_0
/*     */     //   1054: aload_1
/*     */     //   1055: aload_2
/*     */     //   1056: aload_3
/*     */     //   1057: aload #4
/*     */     //   1059: iload #5
/*     */     //   1061: iload #6
/*     */     //   1063: aload #7
/*     */     //   1065: aload #8
/*     */     //   1067: aload #9
/*     */     //   1069: aload #10
/*     */     //   1071: iload #12
/*     */     //   1073: iload #13
/*     */     //   1075: iload #14
/*     */     //   1077: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;[Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/foundation/interaction/MutableInteractionSource;Ljava/lang/Class;III)Lkotlin/jvm/functions/Function2;
/*     */     //   1082: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1087: goto -> 1091
/*     */     //   1090: pop
/*     */     //   1091: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #112	-> 19
/*     */     //   #105	-> 653
/*     */     //   #106	-> 669
/*     */     //   #107	-> 680
/*     */     //   #108	-> 692
/*     */     //   #109	-> 721
/*     */     //   #110	-> 733
/*     */     //   #316	-> 753
/*     */     //   #317	-> 765
/*     */     //   #318	-> 776
/*     */     //   #110	-> 779
/*     */     //   #318	-> 782
/*     */     //   #319	-> 784
/*     */     //   #320	-> 793
/*     */     //   #321	-> 798
/*     */     //   #317	-> 800
/*     */     //   #316	-> 801
/*     */     //   #316	-> 802
/*     */     //   #110	-> 803
/*     */     //   #111	-> 828
/*     */     //   #112	-> 907
/*     */     //   #114	-> 910
/*     */     //   #115	-> 911
/*     */     //   #116	-> 912
/*     */     //   #117	-> 914
/*     */     //   #118	-> 916
/*     */     //   #119	-> 918
/*     */     //   #120	-> 920
/*     */     //   #121	-> 922
/*     */     //   #122	-> 924
/*     */     //   #123	-> 926
/*     */     //   #124	-> 927
/*     */     //   #113	-> 1020
/*     */     //   #126	-> 1035
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   779	3	23	$i$a$-cache-IconActionButtonKt$IconActionButton$6	I
/*     */     //   784	11	23	value$iv	Ljava/lang/Object;
/*     */     //   765	36	22	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   762	39	21	it$iv	Ljava/lang/Object;
/*     */     //   753	50	20	$i$f$cache	I
/*     */     //   750	53	18	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   750	53	19	invalid$iv	Z
/*     */     //   35	1057	15	$dirty	I
/*     */     //   39	1053	16	$dirty1	I
/*     */     //   0	1092	0	key	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   0	1092	1	contentDescription	Ljava/lang/String;
/*     */     //   0	1092	2	hints	[Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   0	1092	3	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1092	4	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1092	5	enabled	Z
/*     */     //   0	1092	6	focusable	Z
/*     */     //   0	1092	7	style	Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   0	1092	8	colorFilter	Landroidx/compose/ui/graphics/ColorFilter;
/*     */     //   0	1092	9	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1092	10	iconClass	Ljava/lang/Class;
/*     */     //   0	1092	11	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1092	12	$changed	I
/*     */     //   0	1092	13	$changed1	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
/*     */   public static final void IconActionButton(@NotNull IconKey key, @Nullable String contentDescription, @NotNull PainterHint[] hints, @NotNull Function0 onClick, @Nullable Modifier modifier, boolean enabled, boolean focusable, @Nullable IconButtonStyle style, @Nullable ColorFilter colorFilter, @Nullable TooltipStyle tooltipStyle, @Nullable Modifier tooltipModifier, @Nullable TooltipPlacement tooltipPlacement, @Nullable MutableInteractionSource interactionSource, @Nullable Class iconClass, @NotNull Function2 tooltip, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'key'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc_w 'hints'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload_3
/*     */     //   14: ldc 'onClick'
/*     */     //   16: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   19: aload #14
/*     */     //   21: ldc 'tooltip'
/*     */     //   23: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   26: aload #15
/*     */     //   28: ldc_w 1017221165
/*     */     //   31: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   36: astore #15
/*     */     //   38: iload #16
/*     */     //   40: istore #19
/*     */     //   42: iload #17
/*     */     //   44: istore #20
/*     */     //   46: iload #18
/*     */     //   48: iconst_1
/*     */     //   49: iand
/*     */     //   50: ifeq -> 63
/*     */     //   53: iload #19
/*     */     //   55: bipush #6
/*     */     //   57: ior
/*     */     //   58: istore #19
/*     */     //   60: goto -> 111
/*     */     //   63: iload #16
/*     */     //   65: bipush #6
/*     */     //   67: iand
/*     */     //   68: ifne -> 111
/*     */     //   71: iload #19
/*     */     //   73: iload #16
/*     */     //   75: bipush #8
/*     */     //   77: iand
/*     */     //   78: ifne -> 92
/*     */     //   81: aload #15
/*     */     //   83: aload_0
/*     */     //   84: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   89: goto -> 100
/*     */     //   92: aload #15
/*     */     //   94: aload_0
/*     */     //   95: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   100: ifeq -> 107
/*     */     //   103: iconst_4
/*     */     //   104: goto -> 108
/*     */     //   107: iconst_2
/*     */     //   108: ior
/*     */     //   109: istore #19
/*     */     //   111: iload #18
/*     */     //   113: iconst_2
/*     */     //   114: iand
/*     */     //   115: ifeq -> 128
/*     */     //   118: iload #19
/*     */     //   120: bipush #48
/*     */     //   122: ior
/*     */     //   123: istore #19
/*     */     //   125: goto -> 159
/*     */     //   128: iload #16
/*     */     //   130: bipush #48
/*     */     //   132: iand
/*     */     //   133: ifne -> 159
/*     */     //   136: iload #19
/*     */     //   138: aload #15
/*     */     //   140: aload_1
/*     */     //   141: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   146: ifeq -> 154
/*     */     //   149: bipush #32
/*     */     //   151: goto -> 156
/*     */     //   154: bipush #16
/*     */     //   156: ior
/*     */     //   157: istore #19
/*     */     //   159: iload #18
/*     */     //   161: iconst_4
/*     */     //   162: iand
/*     */     //   163: ifeq -> 177
/*     */     //   166: iload #19
/*     */     //   168: sipush #384
/*     */     //   171: ior
/*     */     //   172: istore #19
/*     */     //   174: goto -> 211
/*     */     //   177: iload #16
/*     */     //   179: sipush #384
/*     */     //   182: iand
/*     */     //   183: ifne -> 211
/*     */     //   186: iload #19
/*     */     //   188: aload #15
/*     */     //   190: aload_2
/*     */     //   191: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   196: ifeq -> 205
/*     */     //   199: sipush #256
/*     */     //   202: goto -> 208
/*     */     //   205: sipush #128
/*     */     //   208: ior
/*     */     //   209: istore #19
/*     */     //   211: iload #18
/*     */     //   213: bipush #8
/*     */     //   215: iand
/*     */     //   216: ifeq -> 230
/*     */     //   219: iload #19
/*     */     //   221: sipush #3072
/*     */     //   224: ior
/*     */     //   225: istore #19
/*     */     //   227: goto -> 264
/*     */     //   230: iload #16
/*     */     //   232: sipush #3072
/*     */     //   235: iand
/*     */     //   236: ifne -> 264
/*     */     //   239: iload #19
/*     */     //   241: aload #15
/*     */     //   243: aload_3
/*     */     //   244: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   249: ifeq -> 258
/*     */     //   252: sipush #2048
/*     */     //   255: goto -> 261
/*     */     //   258: sipush #1024
/*     */     //   261: ior
/*     */     //   262: istore #19
/*     */     //   264: iload #18
/*     */     //   266: bipush #16
/*     */     //   268: iand
/*     */     //   269: ifeq -> 283
/*     */     //   272: iload #19
/*     */     //   274: sipush #24576
/*     */     //   277: ior
/*     */     //   278: istore #19
/*     */     //   280: goto -> 318
/*     */     //   283: iload #16
/*     */     //   285: sipush #24576
/*     */     //   288: iand
/*     */     //   289: ifne -> 318
/*     */     //   292: iload #19
/*     */     //   294: aload #15
/*     */     //   296: aload #4
/*     */     //   298: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   303: ifeq -> 312
/*     */     //   306: sipush #16384
/*     */     //   309: goto -> 315
/*     */     //   312: sipush #8192
/*     */     //   315: ior
/*     */     //   316: istore #19
/*     */     //   318: iload #18
/*     */     //   320: bipush #32
/*     */     //   322: iand
/*     */     //   323: ifeq -> 336
/*     */     //   326: iload #19
/*     */     //   328: ldc 196608
/*     */     //   330: ior
/*     */     //   331: istore #19
/*     */     //   333: goto -> 368
/*     */     //   336: iload #16
/*     */     //   338: ldc 196608
/*     */     //   340: iand
/*     */     //   341: ifne -> 368
/*     */     //   344: iload #19
/*     */     //   346: aload #15
/*     */     //   348: iload #5
/*     */     //   350: invokeinterface changed : (Z)Z
/*     */     //   355: ifeq -> 363
/*     */     //   358: ldc 131072
/*     */     //   360: goto -> 365
/*     */     //   363: ldc 65536
/*     */     //   365: ior
/*     */     //   366: istore #19
/*     */     //   368: iload #18
/*     */     //   370: bipush #64
/*     */     //   372: iand
/*     */     //   373: ifeq -> 386
/*     */     //   376: iload #19
/*     */     //   378: ldc 1572864
/*     */     //   380: ior
/*     */     //   381: istore #19
/*     */     //   383: goto -> 418
/*     */     //   386: iload #16
/*     */     //   388: ldc 1572864
/*     */     //   390: iand
/*     */     //   391: ifne -> 418
/*     */     //   394: iload #19
/*     */     //   396: aload #15
/*     */     //   398: iload #6
/*     */     //   400: invokeinterface changed : (Z)Z
/*     */     //   405: ifeq -> 413
/*     */     //   408: ldc 1048576
/*     */     //   410: goto -> 415
/*     */     //   413: ldc 524288
/*     */     //   415: ior
/*     */     //   416: istore #19
/*     */     //   418: iload #16
/*     */     //   420: ldc 12582912
/*     */     //   422: iand
/*     */     //   423: ifne -> 459
/*     */     //   426: iload #19
/*     */     //   428: iload #18
/*     */     //   430: sipush #128
/*     */     //   433: iand
/*     */     //   434: ifne -> 454
/*     */     //   437: aload #15
/*     */     //   439: aload #7
/*     */     //   441: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   446: ifeq -> 454
/*     */     //   449: ldc 8388608
/*     */     //   451: goto -> 456
/*     */     //   454: ldc 4194304
/*     */     //   456: ior
/*     */     //   457: istore #19
/*     */     //   459: iload #18
/*     */     //   461: sipush #256
/*     */     //   464: iand
/*     */     //   465: ifeq -> 478
/*     */     //   468: iload #19
/*     */     //   470: ldc 100663296
/*     */     //   472: ior
/*     */     //   473: istore #19
/*     */     //   475: goto -> 510
/*     */     //   478: iload #16
/*     */     //   480: ldc 100663296
/*     */     //   482: iand
/*     */     //   483: ifne -> 510
/*     */     //   486: iload #19
/*     */     //   488: aload #15
/*     */     //   490: aload #8
/*     */     //   492: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   497: ifeq -> 505
/*     */     //   500: ldc 67108864
/*     */     //   502: goto -> 507
/*     */     //   505: ldc 33554432
/*     */     //   507: ior
/*     */     //   508: istore #19
/*     */     //   510: iload #16
/*     */     //   512: ldc 805306368
/*     */     //   514: iand
/*     */     //   515: ifne -> 551
/*     */     //   518: iload #19
/*     */     //   520: iload #18
/*     */     //   522: sipush #512
/*     */     //   525: iand
/*     */     //   526: ifne -> 546
/*     */     //   529: aload #15
/*     */     //   531: aload #9
/*     */     //   533: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   538: ifeq -> 546
/*     */     //   541: ldc 536870912
/*     */     //   543: goto -> 548
/*     */     //   546: ldc 268435456
/*     */     //   548: ior
/*     */     //   549: istore #19
/*     */     //   551: iload #18
/*     */     //   553: sipush #1024
/*     */     //   556: iand
/*     */     //   557: ifeq -> 570
/*     */     //   560: iload #20
/*     */     //   562: bipush #6
/*     */     //   564: ior
/*     */     //   565: istore #20
/*     */     //   567: goto -> 600
/*     */     //   570: iload #17
/*     */     //   572: bipush #6
/*     */     //   574: iand
/*     */     //   575: ifne -> 600
/*     */     //   578: iload #20
/*     */     //   580: aload #15
/*     */     //   582: aload #10
/*     */     //   584: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   589: ifeq -> 596
/*     */     //   592: iconst_4
/*     */     //   593: goto -> 597
/*     */     //   596: iconst_2
/*     */     //   597: ior
/*     */     //   598: istore #20
/*     */     //   600: iload #17
/*     */     //   602: bipush #48
/*     */     //   604: iand
/*     */     //   605: ifne -> 641
/*     */     //   608: iload #20
/*     */     //   610: iload #18
/*     */     //   612: sipush #2048
/*     */     //   615: iand
/*     */     //   616: ifne -> 636
/*     */     //   619: aload #15
/*     */     //   621: aload #11
/*     */     //   623: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   628: ifeq -> 636
/*     */     //   631: bipush #32
/*     */     //   633: goto -> 638
/*     */     //   636: bipush #16
/*     */     //   638: ior
/*     */     //   639: istore #20
/*     */     //   641: iload #18
/*     */     //   643: sipush #4096
/*     */     //   646: iand
/*     */     //   647: ifeq -> 661
/*     */     //   650: iload #20
/*     */     //   652: sipush #384
/*     */     //   655: ior
/*     */     //   656: istore #20
/*     */     //   658: goto -> 696
/*     */     //   661: iload #17
/*     */     //   663: sipush #384
/*     */     //   666: iand
/*     */     //   667: ifne -> 696
/*     */     //   670: iload #20
/*     */     //   672: aload #15
/*     */     //   674: aload #12
/*     */     //   676: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   681: ifeq -> 690
/*     */     //   684: sipush #256
/*     */     //   687: goto -> 693
/*     */     //   690: sipush #128
/*     */     //   693: ior
/*     */     //   694: istore #20
/*     */     //   696: iload #17
/*     */     //   698: sipush #3072
/*     */     //   701: iand
/*     */     //   702: ifne -> 740
/*     */     //   705: iload #20
/*     */     //   707: iload #18
/*     */     //   709: sipush #8192
/*     */     //   712: iand
/*     */     //   713: ifne -> 734
/*     */     //   716: aload #15
/*     */     //   718: aload #13
/*     */     //   720: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   725: ifeq -> 734
/*     */     //   728: sipush #2048
/*     */     //   731: goto -> 737
/*     */     //   734: sipush #1024
/*     */     //   737: ior
/*     */     //   738: istore #20
/*     */     //   740: iload #18
/*     */     //   742: sipush #16384
/*     */     //   745: iand
/*     */     //   746: ifeq -> 760
/*     */     //   749: iload #20
/*     */     //   751: sipush #24576
/*     */     //   754: ior
/*     */     //   755: istore #20
/*     */     //   757: goto -> 795
/*     */     //   760: iload #17
/*     */     //   762: sipush #24576
/*     */     //   765: iand
/*     */     //   766: ifne -> 795
/*     */     //   769: iload #20
/*     */     //   771: aload #15
/*     */     //   773: aload #14
/*     */     //   775: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   780: ifeq -> 789
/*     */     //   783: sipush #16384
/*     */     //   786: goto -> 792
/*     */     //   789: sipush #8192
/*     */     //   792: ior
/*     */     //   793: istore #20
/*     */     //   795: iload #19
/*     */     //   797: ldc 306783379
/*     */     //   799: iand
/*     */     //   800: ldc 306783378
/*     */     //   802: if_icmpne -> 827
/*     */     //   805: iload #20
/*     */     //   807: sipush #9363
/*     */     //   810: iand
/*     */     //   811: sipush #9362
/*     */     //   814: if_icmpne -> 827
/*     */     //   817: aload #15
/*     */     //   819: invokeinterface getSkipping : ()Z
/*     */     //   824: ifne -> 1360
/*     */     //   827: aload #15
/*     */     //   829: invokeinterface startDefaults : ()V
/*     */     //   834: iload #16
/*     */     //   836: iconst_1
/*     */     //   837: iand
/*     */     //   838: ifeq -> 851
/*     */     //   841: aload #15
/*     */     //   843: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   848: ifeq -> 1157
/*     */     //   851: iload #18
/*     */     //   853: bipush #16
/*     */     //   855: iand
/*     */     //   856: ifeq -> 867
/*     */     //   859: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   862: checkcast androidx/compose/ui/Modifier
/*     */     //   865: astore #4
/*     */     //   867: iload #18
/*     */     //   869: bipush #32
/*     */     //   871: iand
/*     */     //   872: ifeq -> 878
/*     */     //   875: iconst_1
/*     */     //   876: istore #5
/*     */     //   878: iload #18
/*     */     //   880: bipush #64
/*     */     //   882: iand
/*     */     //   883: ifeq -> 889
/*     */     //   886: iconst_1
/*     */     //   887: istore #6
/*     */     //   889: iload #18
/*     */     //   891: sipush #128
/*     */     //   894: iand
/*     */     //   895: ifeq -> 918
/*     */     //   898: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   901: aload #15
/*     */     //   903: bipush #6
/*     */     //   905: invokestatic getIconButtonStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   908: astore #7
/*     */     //   910: iload #19
/*     */     //   912: ldc_w -29360129
/*     */     //   915: iand
/*     */     //   916: istore #19
/*     */     //   918: iload #18
/*     */     //   920: sipush #256
/*     */     //   923: iand
/*     */     //   924: ifeq -> 930
/*     */     //   927: aconst_null
/*     */     //   928: astore #8
/*     */     //   930: iload #18
/*     */     //   932: sipush #512
/*     */     //   935: iand
/*     */     //   936: ifeq -> 958
/*     */     //   939: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   942: aload #15
/*     */     //   944: bipush #6
/*     */     //   946: invokestatic getTooltipStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;
/*     */     //   949: astore #9
/*     */     //   951: iload #19
/*     */     //   953: ldc -1879048193
/*     */     //   955: iand
/*     */     //   956: istore #19
/*     */     //   958: iload #18
/*     */     //   960: sipush #1024
/*     */     //   963: iand
/*     */     //   964: ifeq -> 975
/*     */     //   967: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   970: checkcast androidx/compose/ui/Modifier
/*     */     //   973: astore #10
/*     */     //   975: iload #18
/*     */     //   977: sipush #2048
/*     */     //   980: iand
/*     */     //   981: ifeq -> 1036
/*     */     //   984: new org/jetbrains/jewel/ui/component/FixedCursorPoint
/*     */     //   987: dup
/*     */     //   988: iconst_0
/*     */     //   989: istore #21
/*     */     //   991: iconst_0
/*     */     //   992: istore #22
/*     */     //   994: iload #21
/*     */     //   996: i2f
/*     */     //   997: invokestatic constructor-impl : (F)F
/*     */     //   1000: bipush #16
/*     */     //   1002: istore #21
/*     */     //   1004: iconst_0
/*     */     //   1005: istore #22
/*     */     //   1007: iload #21
/*     */     //   1009: i2f
/*     */     //   1010: invokestatic constructor-impl : (F)F
/*     */     //   1013: invokestatic DpOffset-YgX7TsA : (FF)J
/*     */     //   1016: aconst_null
/*     */     //   1017: fconst_0
/*     */     //   1018: bipush #6
/*     */     //   1020: aconst_null
/*     */     //   1021: invokespecial <init> : (JLandroidx/compose/ui/Alignment;FILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   1024: checkcast androidx/compose/foundation/TooltipPlacement
/*     */     //   1027: astore #11
/*     */     //   1029: iload #20
/*     */     //   1031: bipush #-113
/*     */     //   1033: iand
/*     */     //   1034: istore #20
/*     */     //   1036: iload #18
/*     */     //   1038: sipush #4096
/*     */     //   1041: iand
/*     */     //   1042: ifeq -> 1131
/*     */     //   1045: aload #15
/*     */     //   1047: ldc_w 2017635398
/*     */     //   1050: invokeinterface startReplaceGroup : (I)V
/*     */     //   1055: aload #15
/*     */     //   1057: astore #22
/*     */     //   1059: iconst_0
/*     */     //   1060: istore #23
/*     */     //   1062: iconst_0
/*     */     //   1063: istore #24
/*     */     //   1065: aload #22
/*     */     //   1067: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1072: astore #25
/*     */     //   1074: iconst_0
/*     */     //   1075: istore #26
/*     */     //   1077: aload #25
/*     */     //   1079: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1082: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1085: if_acmpne -> 1110
/*     */     //   1088: iconst_0
/*     */     //   1089: istore #27
/*     */     //   1091: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   1094: astore #27
/*     */     //   1096: aload #22
/*     */     //   1098: aload #27
/*     */     //   1100: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1105: aload #27
/*     */     //   1107: goto -> 1112
/*     */     //   1110: aload #25
/*     */     //   1112: nop
/*     */     //   1113: nop
/*     */     //   1114: nop
/*     */     //   1115: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   1118: astore #21
/*     */     //   1120: aload #15
/*     */     //   1122: invokeinterface endReplaceGroup : ()V
/*     */     //   1127: aload #21
/*     */     //   1129: astore #12
/*     */     //   1131: iload #18
/*     */     //   1133: sipush #8192
/*     */     //   1136: iand
/*     */     //   1137: ifeq -> 1230
/*     */     //   1140: aload_0
/*     */     //   1141: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   1144: astore #13
/*     */     //   1146: iload #20
/*     */     //   1148: sipush #-7169
/*     */     //   1151: iand
/*     */     //   1152: istore #20
/*     */     //   1154: goto -> 1230
/*     */     //   1157: aload #15
/*     */     //   1159: invokeinterface skipToGroupEnd : ()V
/*     */     //   1164: iload #18
/*     */     //   1166: sipush #128
/*     */     //   1169: iand
/*     */     //   1170: ifeq -> 1181
/*     */     //   1173: iload #19
/*     */     //   1175: ldc_w -29360129
/*     */     //   1178: iand
/*     */     //   1179: istore #19
/*     */     //   1181: iload #18
/*     */     //   1183: sipush #512
/*     */     //   1186: iand
/*     */     //   1187: ifeq -> 1197
/*     */     //   1190: iload #19
/*     */     //   1192: ldc -1879048193
/*     */     //   1194: iand
/*     */     //   1195: istore #19
/*     */     //   1197: iload #18
/*     */     //   1199: sipush #2048
/*     */     //   1202: iand
/*     */     //   1203: ifeq -> 1213
/*     */     //   1206: iload #20
/*     */     //   1208: bipush #-113
/*     */     //   1210: iand
/*     */     //   1211: istore #20
/*     */     //   1213: iload #18
/*     */     //   1215: sipush #8192
/*     */     //   1218: iand
/*     */     //   1219: ifeq -> 1230
/*     */     //   1222: iload #20
/*     */     //   1224: sipush #-7169
/*     */     //   1227: iand
/*     */     //   1228: istore #20
/*     */     //   1230: aload #15
/*     */     //   1232: invokeinterface endDefaults : ()V
/*     */     //   1237: invokestatic isTraceInProgress : ()Z
/*     */     //   1240: ifeq -> 1256
/*     */     //   1243: ldc_w 1017221165
/*     */     //   1246: iload #19
/*     */     //   1248: iload #20
/*     */     //   1250: ldc_w 'org.jetbrains.jewel.ui.component.IconActionButton (IconActionButton.kt:144)'
/*     */     //   1253: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   1256: aload #14
/*     */     //   1258: aload #10
/*     */     //   1260: iconst_0
/*     */     //   1261: aload #9
/*     */     //   1263: aload #11
/*     */     //   1265: ldc_w 455903968
/*     */     //   1268: iconst_1
/*     */     //   1269: new org/jetbrains/jewel/ui/component/IconActionButtonKt$IconActionButton$9
/*     */     //   1272: dup
/*     */     //   1273: aload_0
/*     */     //   1274: aload_1
/*     */     //   1275: aload #13
/*     */     //   1277: iload #5
/*     */     //   1279: iload #6
/*     */     //   1281: aload #7
/*     */     //   1283: aload #12
/*     */     //   1285: aload #4
/*     */     //   1287: aload #8
/*     */     //   1289: aload_2
/*     */     //   1290: aload_3
/*     */     //   1291: invokespecial <init> : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Ljava/lang/Class;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorFilter;[Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;)V
/*     */     //   1294: aload #15
/*     */     //   1296: bipush #54
/*     */     //   1298: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1301: checkcast kotlin/jvm/functions/Function2
/*     */     //   1304: aload #15
/*     */     //   1306: ldc 196608
/*     */     //   1308: bipush #14
/*     */     //   1310: iload #20
/*     */     //   1312: bipush #12
/*     */     //   1314: ishr
/*     */     //   1315: iand
/*     */     //   1316: ior
/*     */     //   1317: bipush #112
/*     */     //   1319: iload #20
/*     */     //   1321: iconst_3
/*     */     //   1322: ishl
/*     */     //   1323: iand
/*     */     //   1324: ior
/*     */     //   1325: sipush #7168
/*     */     //   1328: iload #19
/*     */     //   1330: bipush #18
/*     */     //   1332: ishr
/*     */     //   1333: iand
/*     */     //   1334: ior
/*     */     //   1335: ldc 57344
/*     */     //   1337: iload #20
/*     */     //   1339: bipush #9
/*     */     //   1341: ishl
/*     */     //   1342: iand
/*     */     //   1343: ior
/*     */     //   1344: iconst_4
/*     */     //   1345: invokestatic Tooltip : (Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/foundation/TooltipPlacement;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1348: invokestatic isTraceInProgress : ()Z
/*     */     //   1351: ifeq -> 1367
/*     */     //   1354: invokestatic traceEventEnd : ()V
/*     */     //   1357: goto -> 1367
/*     */     //   1360: aload #15
/*     */     //   1362: invokeinterface skipToGroupEnd : ()V
/*     */     //   1367: aload #15
/*     */     //   1369: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1374: dup
/*     */     //   1375: ifnull -> 1423
/*     */     //   1378: aload_0
/*     */     //   1379: aload_1
/*     */     //   1380: aload_2
/*     */     //   1381: aload_3
/*     */     //   1382: aload #4
/*     */     //   1384: iload #5
/*     */     //   1386: iload #6
/*     */     //   1388: aload #7
/*     */     //   1390: aload #8
/*     */     //   1392: aload #9
/*     */     //   1394: aload #10
/*     */     //   1396: aload #11
/*     */     //   1398: aload #12
/*     */     //   1400: aload #13
/*     */     //   1402: aload #14
/*     */     //   1404: iload #16
/*     */     //   1406: iload #17
/*     */     //   1408: iload #18
/*     */     //   1410: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;[Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/TooltipPlacement;Landroidx/compose/foundation/interaction/MutableInteractionSource;Ljava/lang/Class;Lkotlin/jvm/functions/Function2;III)Lkotlin/jvm/functions/Function2;
/*     */     //   1415: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1420: goto -> 1424
/*     */     //   1423: pop
/*     */     //   1424: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #145	-> 26
/*     */     //   #134	-> 859
/*     */     //   #135	-> 875
/*     */     //   #136	-> 886
/*     */     //   #137	-> 898
/*     */     //   #138	-> 927
/*     */     //   #139	-> 939
/*     */     //   #140	-> 967
/*     */     //   #141	-> 984
/*     */     //   #322	-> 994
/*     */     //   #141	-> 1000
/*     */     //   #322	-> 1007
/*     */     //   #141	-> 1013
/*     */     //   #142	-> 1045
/*     */     //   #323	-> 1065
/*     */     //   #324	-> 1077
/*     */     //   #325	-> 1088
/*     */     //   #142	-> 1091
/*     */     //   #325	-> 1094
/*     */     //   #326	-> 1096
/*     */     //   #327	-> 1105
/*     */     //   #328	-> 1110
/*     */     //   #324	-> 1112
/*     */     //   #323	-> 1113
/*     */     //   #323	-> 1114
/*     */     //   #142	-> 1115
/*     */     //   #143	-> 1140
/*     */     //   #145	-> 1253
/*     */     //   #146	-> 1256
/*     */     //   #161	-> 1360
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   994	6	22	$i$f$getDp	I
/*     */     //   991	9	21	$this$dp$iv	I
/*     */     //   1007	6	22	$i$f$getDp	I
/*     */     //   1004	9	21	$this$dp$iv	I
/*     */     //   1091	3	27	$i$a$-cache-IconActionButtonKt$IconActionButton$8	I
/*     */     //   1096	11	27	value$iv	Ljava/lang/Object;
/*     */     //   1077	36	26	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1074	39	25	it$iv	Ljava/lang/Object;
/*     */     //   1065	50	24	$i$f$cache	I
/*     */     //   1062	53	22	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1062	53	23	invalid$iv	Z
/*     */     //   42	1383	19	$dirty	I
/*     */     //   46	1379	20	$dirty1	I
/*     */     //   0	1425	0	key	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   0	1425	1	contentDescription	Ljava/lang/String;
/*     */     //   0	1425	2	hints	[Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   0	1425	3	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1425	4	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1425	5	enabled	Z
/*     */     //   0	1425	6	focusable	Z
/*     */     //   0	1425	7	style	Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   0	1425	8	colorFilter	Landroidx/compose/ui/graphics/ColorFilter;
/*     */     //   0	1425	9	tooltipStyle	Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;
/*     */     //   0	1425	10	tooltipModifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1425	11	tooltipPlacement	Landroidx/compose/foundation/TooltipPlacement;
/*     */     //   0	1425	12	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1425	13	iconClass	Ljava/lang/Class;
/*     */     //   0	1425	14	tooltip	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1425	15	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1425	16	$changed	I
/*     */     //   0	1425	17	$changed1	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class IconActionButtonKt$IconActionButton$9
/*     */     implements Function2<Composer, Integer, Unit>
/*     */   {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/* 147 */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(455903968, $changed, -1, "org.jetbrains.jewel.ui.component.IconActionButton.<anonymous> (IconActionButton.kt:146)");  IconActionButtonKt.CoreIconActionButton(
/* 148 */             this.$key, 
/*     */             
/* 150 */             this.$contentDescription, 
/* 151 */             this.$iconClass, 
/* 152 */             this.$enabled, 
/* 153 */             this.$focusable, 
/* 154 */             this.$style, 
/* 155 */             this.$interactionSource, this.$modifier, 
/* 156 */             this.$colorFilter, 
/* 157 */             this.$hints, 
/* 158 */             this.$onClick, $composer, 0, 0); if (ComposerKt.isTraceInProgress())
/* 159 */           ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
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
/*     */ 
/*     */     
/*     */     IconActionButtonKt$IconActionButton$9(IconKey $key, String $contentDescription, Class<?> $iconClass, boolean $enabled, boolean $focusable, IconButtonStyle $style, MutableInteractionSource $interactionSource, Modifier $modifier, ColorFilter $colorFilter, PainterHint[] $hints, Function0<Unit> $onClick) {}
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
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   private static final void BaseIconActionButton(IconKey key, String contentDescription, Class<?> iconClass, boolean enabled, boolean focusable, IconButtonStyle style, MutableInteractionSource interactionSource, Modifier modifier, ColorFilter colorFilter, PainterHint hint, Function0<Unit> onClick, Composer $composer, int $changed, int $changed1) {
/*     */     // Byte code:
/*     */     //   0: aload #11
/*     */     //   2: ldc_w 1439476083
/*     */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   10: astore #11
/*     */     //   12: iload #12
/*     */     //   14: istore #14
/*     */     //   16: iload #13
/*     */     //   18: istore #15
/*     */     //   20: iload #12
/*     */     //   22: bipush #6
/*     */     //   24: iand
/*     */     //   25: ifne -> 68
/*     */     //   28: iload #14
/*     */     //   30: iload #12
/*     */     //   32: bipush #8
/*     */     //   34: iand
/*     */     //   35: ifne -> 49
/*     */     //   38: aload #11
/*     */     //   40: aload_0
/*     */     //   41: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   46: goto -> 57
/*     */     //   49: aload #11
/*     */     //   51: aload_0
/*     */     //   52: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   57: ifeq -> 64
/*     */     //   60: iconst_4
/*     */     //   61: goto -> 65
/*     */     //   64: iconst_2
/*     */     //   65: ior
/*     */     //   66: istore #14
/*     */     //   68: iload #12
/*     */     //   70: bipush #48
/*     */     //   72: iand
/*     */     //   73: ifne -> 99
/*     */     //   76: iload #14
/*     */     //   78: aload #11
/*     */     //   80: aload_1
/*     */     //   81: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   86: ifeq -> 94
/*     */     //   89: bipush #32
/*     */     //   91: goto -> 96
/*     */     //   94: bipush #16
/*     */     //   96: ior
/*     */     //   97: istore #14
/*     */     //   99: iload #12
/*     */     //   101: sipush #384
/*     */     //   104: iand
/*     */     //   105: ifne -> 133
/*     */     //   108: iload #14
/*     */     //   110: aload #11
/*     */     //   112: aload_2
/*     */     //   113: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   118: ifeq -> 127
/*     */     //   121: sipush #256
/*     */     //   124: goto -> 130
/*     */     //   127: sipush #128
/*     */     //   130: ior
/*     */     //   131: istore #14
/*     */     //   133: iload #12
/*     */     //   135: sipush #3072
/*     */     //   138: iand
/*     */     //   139: ifne -> 167
/*     */     //   142: iload #14
/*     */     //   144: aload #11
/*     */     //   146: iload_3
/*     */     //   147: invokeinterface changed : (Z)Z
/*     */     //   152: ifeq -> 161
/*     */     //   155: sipush #2048
/*     */     //   158: goto -> 164
/*     */     //   161: sipush #1024
/*     */     //   164: ior
/*     */     //   165: istore #14
/*     */     //   167: iload #12
/*     */     //   169: sipush #24576
/*     */     //   172: iand
/*     */     //   173: ifne -> 202
/*     */     //   176: iload #14
/*     */     //   178: aload #11
/*     */     //   180: iload #4
/*     */     //   182: invokeinterface changed : (Z)Z
/*     */     //   187: ifeq -> 196
/*     */     //   190: sipush #16384
/*     */     //   193: goto -> 199
/*     */     //   196: sipush #8192
/*     */     //   199: ior
/*     */     //   200: istore #14
/*     */     //   202: iload #12
/*     */     //   204: ldc 196608
/*     */     //   206: iand
/*     */     //   207: ifne -> 234
/*     */     //   210: iload #14
/*     */     //   212: aload #11
/*     */     //   214: aload #5
/*     */     //   216: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   221: ifeq -> 229
/*     */     //   224: ldc 131072
/*     */     //   226: goto -> 231
/*     */     //   229: ldc 65536
/*     */     //   231: ior
/*     */     //   232: istore #14
/*     */     //   234: iload #12
/*     */     //   236: ldc 1572864
/*     */     //   238: iand
/*     */     //   239: ifne -> 266
/*     */     //   242: iload #14
/*     */     //   244: aload #11
/*     */     //   246: aload #6
/*     */     //   248: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   253: ifeq -> 261
/*     */     //   256: ldc 1048576
/*     */     //   258: goto -> 263
/*     */     //   261: ldc 524288
/*     */     //   263: ior
/*     */     //   264: istore #14
/*     */     //   266: iload #12
/*     */     //   268: ldc 12582912
/*     */     //   270: iand
/*     */     //   271: ifne -> 298
/*     */     //   274: iload #14
/*     */     //   276: aload #11
/*     */     //   278: aload #7
/*     */     //   280: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   285: ifeq -> 293
/*     */     //   288: ldc 8388608
/*     */     //   290: goto -> 295
/*     */     //   293: ldc 4194304
/*     */     //   295: ior
/*     */     //   296: istore #14
/*     */     //   298: iload #12
/*     */     //   300: ldc 100663296
/*     */     //   302: iand
/*     */     //   303: ifne -> 330
/*     */     //   306: iload #14
/*     */     //   308: aload #11
/*     */     //   310: aload #8
/*     */     //   312: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   317: ifeq -> 325
/*     */     //   320: ldc 67108864
/*     */     //   322: goto -> 327
/*     */     //   325: ldc 33554432
/*     */     //   327: ior
/*     */     //   328: istore #14
/*     */     //   330: iload #12
/*     */     //   332: ldc 805306368
/*     */     //   334: iand
/*     */     //   335: ifne -> 362
/*     */     //   338: iload #14
/*     */     //   340: aload #11
/*     */     //   342: aload #9
/*     */     //   344: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   349: ifeq -> 357
/*     */     //   352: ldc 536870912
/*     */     //   354: goto -> 359
/*     */     //   357: ldc 268435456
/*     */     //   359: ior
/*     */     //   360: istore #14
/*     */     //   362: iload #13
/*     */     //   364: bipush #6
/*     */     //   366: iand
/*     */     //   367: ifne -> 392
/*     */     //   370: iload #15
/*     */     //   372: aload #11
/*     */     //   374: aload #10
/*     */     //   376: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   381: ifeq -> 388
/*     */     //   384: iconst_4
/*     */     //   385: goto -> 389
/*     */     //   388: iconst_2
/*     */     //   389: ior
/*     */     //   390: istore #15
/*     */     //   392: iload #14
/*     */     //   394: ldc 306783379
/*     */     //   396: iand
/*     */     //   397: ldc 306783378
/*     */     //   399: if_icmpne -> 420
/*     */     //   402: iload #15
/*     */     //   404: iconst_3
/*     */     //   405: iand
/*     */     //   406: iconst_2
/*     */     //   407: if_icmpne -> 420
/*     */     //   410: aload #11
/*     */     //   412: invokeinterface getSkipping : ()Z
/*     */     //   417: ifne -> 667
/*     */     //   420: invokestatic isTraceInProgress : ()Z
/*     */     //   423: ifeq -> 439
/*     */     //   426: ldc_w 1439476083
/*     */     //   429: iload #14
/*     */     //   431: iload #15
/*     */     //   433: ldc_w 'org.jetbrains.jewel.ui.component.BaseIconActionButton (IconActionButton.kt:175)'
/*     */     //   436: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   439: aload #9
/*     */     //   441: ifnull -> 553
/*     */     //   444: aload #11
/*     */     //   446: ldc_w -2137403964
/*     */     //   449: invokeinterface startReplaceGroup : (I)V
/*     */     //   454: aload_0
/*     */     //   455: aload_1
/*     */     //   456: aload_2
/*     */     //   457: iload_3
/*     */     //   458: iload #4
/*     */     //   460: aload #5
/*     */     //   462: aload #6
/*     */     //   464: aload #7
/*     */     //   466: aload #8
/*     */     //   468: aload #9
/*     */     //   470: aload #10
/*     */     //   472: aload #11
/*     */     //   474: bipush #14
/*     */     //   476: iload #14
/*     */     //   478: iand
/*     */     //   479: bipush #112
/*     */     //   481: iload #14
/*     */     //   483: iand
/*     */     //   484: ior
/*     */     //   485: sipush #896
/*     */     //   488: iload #14
/*     */     //   490: iand
/*     */     //   491: ior
/*     */     //   492: sipush #7168
/*     */     //   495: iload #14
/*     */     //   497: iand
/*     */     //   498: ior
/*     */     //   499: ldc 57344
/*     */     //   501: iload #14
/*     */     //   503: iand
/*     */     //   504: ior
/*     */     //   505: ldc 458752
/*     */     //   507: iload #14
/*     */     //   509: iand
/*     */     //   510: ior
/*     */     //   511: ldc 3670016
/*     */     //   513: iload #14
/*     */     //   515: iand
/*     */     //   516: ior
/*     */     //   517: ldc 29360128
/*     */     //   519: iload #14
/*     */     //   521: iand
/*     */     //   522: ior
/*     */     //   523: ldc 234881024
/*     */     //   525: iload #14
/*     */     //   527: iand
/*     */     //   528: ior
/*     */     //   529: ldc 1879048192
/*     */     //   531: iload #14
/*     */     //   533: iand
/*     */     //   534: ior
/*     */     //   535: bipush #14
/*     */     //   537: iload #15
/*     */     //   539: iand
/*     */     //   540: invokestatic CoreIconActionButton : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Ljava/lang/Class;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*     */     //   543: aload #11
/*     */     //   545: invokeinterface endReplaceGroup : ()V
/*     */     //   550: goto -> 655
/*     */     //   553: aload #11
/*     */     //   555: ldc_w -2136971173
/*     */     //   558: invokeinterface startReplaceGroup : (I)V
/*     */     //   563: aload_0
/*     */     //   564: aload_1
/*     */     //   565: aload_2
/*     */     //   566: iload_3
/*     */     //   567: iload #4
/*     */     //   569: aload #5
/*     */     //   571: aload #6
/*     */     //   573: aload #7
/*     */     //   575: aload #8
/*     */     //   577: iconst_0
/*     */     //   578: anewarray org/jetbrains/jewel/ui/painter/PainterHint
/*     */     //   581: aload #10
/*     */     //   583: aload #11
/*     */     //   585: bipush #14
/*     */     //   587: iload #14
/*     */     //   589: iand
/*     */     //   590: bipush #112
/*     */     //   592: iload #14
/*     */     //   594: iand
/*     */     //   595: ior
/*     */     //   596: sipush #896
/*     */     //   599: iload #14
/*     */     //   601: iand
/*     */     //   602: ior
/*     */     //   603: sipush #7168
/*     */     //   606: iload #14
/*     */     //   608: iand
/*     */     //   609: ior
/*     */     //   610: ldc 57344
/*     */     //   612: iload #14
/*     */     //   614: iand
/*     */     //   615: ior
/*     */     //   616: ldc 458752
/*     */     //   618: iload #14
/*     */     //   620: iand
/*     */     //   621: ior
/*     */     //   622: ldc 3670016
/*     */     //   624: iload #14
/*     */     //   626: iand
/*     */     //   627: ior
/*     */     //   628: ldc 29360128
/*     */     //   630: iload #14
/*     */     //   632: iand
/*     */     //   633: ior
/*     */     //   634: ldc 234881024
/*     */     //   636: iload #14
/*     */     //   638: iand
/*     */     //   639: ior
/*     */     //   640: bipush #14
/*     */     //   642: iload #15
/*     */     //   644: iand
/*     */     //   645: invokestatic CoreIconActionButton : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Ljava/lang/Class;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorFilter;[Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*     */     //   648: aload #11
/*     */     //   650: invokeinterface endReplaceGroup : ()V
/*     */     //   655: invokestatic isTraceInProgress : ()Z
/*     */     //   658: ifeq -> 674
/*     */     //   661: invokestatic traceEventEnd : ()V
/*     */     //   664: goto -> 674
/*     */     //   667: aload #11
/*     */     //   669: invokeinterface skipToGroupEnd : ()V
/*     */     //   674: aload #11
/*     */     //   676: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   681: dup
/*     */     //   682: ifnull -> 720
/*     */     //   685: aload_0
/*     */     //   686: aload_1
/*     */     //   687: aload_2
/*     */     //   688: iload_3
/*     */     //   689: iload #4
/*     */     //   691: aload #5
/*     */     //   693: aload #6
/*     */     //   695: aload #7
/*     */     //   697: aload #8
/*     */     //   699: aload #9
/*     */     //   701: aload #10
/*     */     //   703: iload #12
/*     */     //   705: iload #13
/*     */     //   707: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Ljava/lang/Class;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;II)Lkotlin/jvm/functions/Function2;
/*     */     //   712: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   717: goto -> 721
/*     */     //   720: pop
/*     */     //   721: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #176	-> 0
/*     */     //   #177	-> 439
/*     */     //   #179	-> 454
/*     */     //   #180	-> 455
/*     */     //   #181	-> 456
/*     */     //   #182	-> 457
/*     */     //   #183	-> 458
/*     */     //   #184	-> 460
/*     */     //   #185	-> 462
/*     */     //   #186	-> 464
/*     */     //   #187	-> 466
/*     */     //   #188	-> 468
/*     */     //   #189	-> 470
/*     */     //   #178	-> 540
/*     */     //   #177	-> 543
/*     */     //   #191	-> 553
/*     */     //   #193	-> 563
/*     */     //   #194	-> 564
/*     */     //   #195	-> 565
/*     */     //   #196	-> 566
/*     */     //   #197	-> 567
/*     */     //   #198	-> 569
/*     */     //   #199	-> 571
/*     */     //   #200	-> 573
/*     */     //   #201	-> 575
/*     */     //   #202	-> 577
/*     */     //   #203	-> 581
/*     */     //   #192	-> 645
/*     */     //   #191	-> 648
/*     */     //   #206	-> 667
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   16	706	14	$dirty	I
/*     */     //   20	702	15	$dirty1	I
/*     */     //   0	722	0	key	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   0	722	1	contentDescription	Ljava/lang/String;
/*     */     //   0	722	2	iconClass	Ljava/lang/Class;
/*     */     //   0	722	3	enabled	Z
/*     */     //   0	722	4	focusable	Z
/*     */     //   0	722	5	style	Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   0	722	6	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	722	7	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	722	8	colorFilter	Landroidx/compose/ui/graphics/ColorFilter;
/*     */     //   0	722	9	hint	Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   0	722	10	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	722	11	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	722	12	$changed	I
/*     */     //   0	722	13	$changed1	I
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
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   private static final void CoreIconActionButton(IconKey key, String contentDescription, Class<?> iconClass, boolean enabled, boolean focusable, IconButtonStyle style, MutableInteractionSource interactionSource, Modifier modifier, ColorFilter colorFilter, PainterHint[] hints, Function0<Unit> onClick, Composer $composer, int $changed, int $changed1) {
/*     */     // Byte code:
/*     */     //   0: aload #11
/*     */     //   2: ldc_w -961066118
/*     */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   10: astore #11
/*     */     //   12: iload #12
/*     */     //   14: istore #14
/*     */     //   16: iload #13
/*     */     //   18: istore #15
/*     */     //   20: iload #12
/*     */     //   22: bipush #6
/*     */     //   24: iand
/*     */     //   25: ifne -> 68
/*     */     //   28: iload #14
/*     */     //   30: iload #12
/*     */     //   32: bipush #8
/*     */     //   34: iand
/*     */     //   35: ifne -> 49
/*     */     //   38: aload #11
/*     */     //   40: aload_0
/*     */     //   41: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   46: goto -> 57
/*     */     //   49: aload #11
/*     */     //   51: aload_0
/*     */     //   52: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   57: ifeq -> 64
/*     */     //   60: iconst_4
/*     */     //   61: goto -> 65
/*     */     //   64: iconst_2
/*     */     //   65: ior
/*     */     //   66: istore #14
/*     */     //   68: iload #12
/*     */     //   70: bipush #48
/*     */     //   72: iand
/*     */     //   73: ifne -> 99
/*     */     //   76: iload #14
/*     */     //   78: aload #11
/*     */     //   80: aload_1
/*     */     //   81: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   86: ifeq -> 94
/*     */     //   89: bipush #32
/*     */     //   91: goto -> 96
/*     */     //   94: bipush #16
/*     */     //   96: ior
/*     */     //   97: istore #14
/*     */     //   99: iload #12
/*     */     //   101: sipush #384
/*     */     //   104: iand
/*     */     //   105: ifne -> 133
/*     */     //   108: iload #14
/*     */     //   110: aload #11
/*     */     //   112: aload_2
/*     */     //   113: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   118: ifeq -> 127
/*     */     //   121: sipush #256
/*     */     //   124: goto -> 130
/*     */     //   127: sipush #128
/*     */     //   130: ior
/*     */     //   131: istore #14
/*     */     //   133: iload #12
/*     */     //   135: sipush #3072
/*     */     //   138: iand
/*     */     //   139: ifne -> 167
/*     */     //   142: iload #14
/*     */     //   144: aload #11
/*     */     //   146: iload_3
/*     */     //   147: invokeinterface changed : (Z)Z
/*     */     //   152: ifeq -> 161
/*     */     //   155: sipush #2048
/*     */     //   158: goto -> 164
/*     */     //   161: sipush #1024
/*     */     //   164: ior
/*     */     //   165: istore #14
/*     */     //   167: iload #12
/*     */     //   169: sipush #24576
/*     */     //   172: iand
/*     */     //   173: ifne -> 202
/*     */     //   176: iload #14
/*     */     //   178: aload #11
/*     */     //   180: iload #4
/*     */     //   182: invokeinterface changed : (Z)Z
/*     */     //   187: ifeq -> 196
/*     */     //   190: sipush #16384
/*     */     //   193: goto -> 199
/*     */     //   196: sipush #8192
/*     */     //   199: ior
/*     */     //   200: istore #14
/*     */     //   202: iload #12
/*     */     //   204: ldc 196608
/*     */     //   206: iand
/*     */     //   207: ifne -> 234
/*     */     //   210: iload #14
/*     */     //   212: aload #11
/*     */     //   214: aload #5
/*     */     //   216: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   221: ifeq -> 229
/*     */     //   224: ldc 131072
/*     */     //   226: goto -> 231
/*     */     //   229: ldc 65536
/*     */     //   231: ior
/*     */     //   232: istore #14
/*     */     //   234: iload #12
/*     */     //   236: ldc 1572864
/*     */     //   238: iand
/*     */     //   239: ifne -> 266
/*     */     //   242: iload #14
/*     */     //   244: aload #11
/*     */     //   246: aload #6
/*     */     //   248: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   253: ifeq -> 261
/*     */     //   256: ldc 1048576
/*     */     //   258: goto -> 263
/*     */     //   261: ldc 524288
/*     */     //   263: ior
/*     */     //   264: istore #14
/*     */     //   266: iload #12
/*     */     //   268: ldc 12582912
/*     */     //   270: iand
/*     */     //   271: ifne -> 298
/*     */     //   274: iload #14
/*     */     //   276: aload #11
/*     */     //   278: aload #7
/*     */     //   280: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   285: ifeq -> 293
/*     */     //   288: ldc 8388608
/*     */     //   290: goto -> 295
/*     */     //   293: ldc 4194304
/*     */     //   295: ior
/*     */     //   296: istore #14
/*     */     //   298: iload #12
/*     */     //   300: ldc 100663296
/*     */     //   302: iand
/*     */     //   303: ifne -> 330
/*     */     //   306: iload #14
/*     */     //   308: aload #11
/*     */     //   310: aload #8
/*     */     //   312: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   317: ifeq -> 325
/*     */     //   320: ldc 67108864
/*     */     //   322: goto -> 327
/*     */     //   325: ldc 33554432
/*     */     //   327: ior
/*     */     //   328: istore #14
/*     */     //   330: iload #12
/*     */     //   332: ldc 805306368
/*     */     //   334: iand
/*     */     //   335: ifne -> 362
/*     */     //   338: iload #14
/*     */     //   340: aload #11
/*     */     //   342: aload #9
/*     */     //   344: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   349: ifeq -> 357
/*     */     //   352: ldc 536870912
/*     */     //   354: goto -> 359
/*     */     //   357: ldc 268435456
/*     */     //   359: ior
/*     */     //   360: istore #14
/*     */     //   362: iload #13
/*     */     //   364: bipush #6
/*     */     //   366: iand
/*     */     //   367: ifne -> 392
/*     */     //   370: iload #15
/*     */     //   372: aload #11
/*     */     //   374: aload #10
/*     */     //   376: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   381: ifeq -> 388
/*     */     //   384: iconst_4
/*     */     //   385: goto -> 389
/*     */     //   388: iconst_2
/*     */     //   389: ior
/*     */     //   390: istore #15
/*     */     //   392: iload #14
/*     */     //   394: ldc 306783379
/*     */     //   396: iand
/*     */     //   397: ldc 306783378
/*     */     //   399: if_icmpne -> 420
/*     */     //   402: iload #15
/*     */     //   404: iconst_3
/*     */     //   405: iand
/*     */     //   406: iconst_2
/*     */     //   407: if_icmpne -> 420
/*     */     //   410: aload #11
/*     */     //   412: invokeinterface getSkipping : ()Z
/*     */     //   417: ifne -> 547
/*     */     //   420: invokestatic isTraceInProgress : ()Z
/*     */     //   423: ifeq -> 439
/*     */     //   426: ldc_w -961066118
/*     */     //   429: iload #14
/*     */     //   431: iload #15
/*     */     //   433: ldc_w 'org.jetbrains.jewel.ui.component.CoreIconActionButton (IconActionButton.kt:220)'
/*     */     //   436: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   439: aload #10
/*     */     //   441: aload #7
/*     */     //   443: iload_3
/*     */     //   444: iload #4
/*     */     //   446: aload #5
/*     */     //   448: aload #6
/*     */     //   450: ldc_w 1660899011
/*     */     //   453: iconst_1
/*     */     //   454: new org/jetbrains/jewel/ui/component/IconActionButtonKt$CoreIconActionButton$1
/*     */     //   457: dup
/*     */     //   458: aload_0
/*     */     //   459: aload_1
/*     */     //   460: aload_2
/*     */     //   461: aload #8
/*     */     //   463: aload #9
/*     */     //   465: invokespecial <init> : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Ljava/lang/Class;Landroidx/compose/ui/graphics/ColorFilter;[Lorg/jetbrains/jewel/ui/painter/PainterHint;)V
/*     */     //   468: aload #11
/*     */     //   470: bipush #54
/*     */     //   472: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   475: checkcast kotlin/jvm/functions/Function4
/*     */     //   478: aload #11
/*     */     //   480: ldc 1572864
/*     */     //   482: bipush #14
/*     */     //   484: iload #15
/*     */     //   486: iand
/*     */     //   487: ior
/*     */     //   488: bipush #112
/*     */     //   490: iload #14
/*     */     //   492: bipush #18
/*     */     //   494: ishr
/*     */     //   495: iand
/*     */     //   496: ior
/*     */     //   497: sipush #896
/*     */     //   500: iload #14
/*     */     //   502: iconst_3
/*     */     //   503: ishr
/*     */     //   504: iand
/*     */     //   505: ior
/*     */     //   506: sipush #7168
/*     */     //   509: iload #14
/*     */     //   511: iconst_3
/*     */     //   512: ishr
/*     */     //   513: iand
/*     */     //   514: ior
/*     */     //   515: ldc 57344
/*     */     //   517: iload #14
/*     */     //   519: iconst_3
/*     */     //   520: ishr
/*     */     //   521: iand
/*     */     //   522: ior
/*     */     //   523: ldc 458752
/*     */     //   525: iload #14
/*     */     //   527: iconst_3
/*     */     //   528: ishr
/*     */     //   529: iand
/*     */     //   530: ior
/*     */     //   531: iconst_0
/*     */     //   532: invokestatic IconButton : (Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V
/*     */     //   535: invokestatic isTraceInProgress : ()Z
/*     */     //   538: ifeq -> 554
/*     */     //   541: invokestatic traceEventEnd : ()V
/*     */     //   544: goto -> 554
/*     */     //   547: aload #11
/*     */     //   549: invokeinterface skipToGroupEnd : ()V
/*     */     //   554: aload #11
/*     */     //   556: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   561: dup
/*     */     //   562: ifnull -> 600
/*     */     //   565: aload_0
/*     */     //   566: aload_1
/*     */     //   567: aload_2
/*     */     //   568: iload_3
/*     */     //   569: iload #4
/*     */     //   571: aload #5
/*     */     //   573: aload #6
/*     */     //   575: aload #7
/*     */     //   577: aload #8
/*     */     //   579: aload #9
/*     */     //   581: aload #10
/*     */     //   583: iload #12
/*     */     //   585: iload #13
/*     */     //   587: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Ljava/lang/Class;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorFilter;[Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;II)Lkotlin/jvm/functions/Function2;
/*     */     //   592: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   597: goto -> 601
/*     */     //   600: pop
/*     */     //   601: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #221	-> 0
/*     */     //   #222	-> 439
/*     */     //   #225	-> 547
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   16	586	14	$dirty	I
/*     */     //   20	582	15	$dirty1	I
/*     */     //   0	602	0	key	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   0	602	1	contentDescription	Ljava/lang/String;
/*     */     //   0	602	2	iconClass	Ljava/lang/Class;
/*     */     //   0	602	3	enabled	Z
/*     */     //   0	602	4	focusable	Z
/*     */     //   0	602	5	style	Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   0	602	6	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	602	7	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	602	8	colorFilter	Landroidx/compose/ui/graphics/ColorFilter;
/*     */     //   0	602	9	hints	[Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   0	602	10	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	602	11	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	602	12	$changed	I
/*     */     //   0	602	13	$changed1	I
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
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class IconActionButtonKt$CoreIconActionButton$1
/*     */     implements Function4<BoxScope, IconButtonState, Composer, Integer, Unit>
/*     */   {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke-KMTpdl8(BoxScope $this$IconButton, long it, Composer $composer, int $changed) {
/* 223 */       Intrinsics.checkNotNullParameter($this$IconButton, "$this$IconButton"); if (($changed & 0x81) != 128 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1660899011, $changed, -1, "org.jetbrains.jewel.ui.component.CoreIconActionButton.<anonymous> (IconActionButton.kt:222)");  IconKt.Icon(this.$key, this.$contentDescription, (Modifier)null, this.$iconClass, this.$colorFilter, Arrays.<PainterHint>copyOf(this.$hints, this.$hints.length), $composer, 0, 4); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*     */     
/*     */     }
/*     */     
/*     */     IconActionButtonKt$CoreIconActionButton$1(IconKey $key, String $contentDescription, Class<?> $iconClass, ColorFilter $colorFilter, PainterHint[] $hints) {}
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   private static final void CoreIconActionButton(IconKey key, String contentDescription, Class<?> iconClass, boolean enabled, boolean focusable, IconButtonStyle style, MutableInteractionSource interactionSource, Modifier modifier, ColorFilter colorFilter, PainterHint hint, Function0<Unit> onClick, Composer $composer, int $changed, int $changed1) {
/*     */     // Byte code:
/*     */     //   0: aload #11
/*     */     //   2: ldc_w -1469039295
/*     */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   10: astore #11
/*     */     //   12: iload #12
/*     */     //   14: istore #14
/*     */     //   16: iload #13
/*     */     //   18: istore #15
/*     */     //   20: iload #12
/*     */     //   22: bipush #6
/*     */     //   24: iand
/*     */     //   25: ifne -> 68
/*     */     //   28: iload #14
/*     */     //   30: iload #12
/*     */     //   32: bipush #8
/*     */     //   34: iand
/*     */     //   35: ifne -> 49
/*     */     //   38: aload #11
/*     */     //   40: aload_0
/*     */     //   41: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   46: goto -> 57
/*     */     //   49: aload #11
/*     */     //   51: aload_0
/*     */     //   52: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   57: ifeq -> 64
/*     */     //   60: iconst_4
/*     */     //   61: goto -> 65
/*     */     //   64: iconst_2
/*     */     //   65: ior
/*     */     //   66: istore #14
/*     */     //   68: iload #12
/*     */     //   70: bipush #48
/*     */     //   72: iand
/*     */     //   73: ifne -> 99
/*     */     //   76: iload #14
/*     */     //   78: aload #11
/*     */     //   80: aload_1
/*     */     //   81: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   86: ifeq -> 94
/*     */     //   89: bipush #32
/*     */     //   91: goto -> 96
/*     */     //   94: bipush #16
/*     */     //   96: ior
/*     */     //   97: istore #14
/*     */     //   99: iload #12
/*     */     //   101: sipush #384
/*     */     //   104: iand
/*     */     //   105: ifne -> 133
/*     */     //   108: iload #14
/*     */     //   110: aload #11
/*     */     //   112: aload_2
/*     */     //   113: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   118: ifeq -> 127
/*     */     //   121: sipush #256
/*     */     //   124: goto -> 130
/*     */     //   127: sipush #128
/*     */     //   130: ior
/*     */     //   131: istore #14
/*     */     //   133: iload #12
/*     */     //   135: sipush #3072
/*     */     //   138: iand
/*     */     //   139: ifne -> 167
/*     */     //   142: iload #14
/*     */     //   144: aload #11
/*     */     //   146: iload_3
/*     */     //   147: invokeinterface changed : (Z)Z
/*     */     //   152: ifeq -> 161
/*     */     //   155: sipush #2048
/*     */     //   158: goto -> 164
/*     */     //   161: sipush #1024
/*     */     //   164: ior
/*     */     //   165: istore #14
/*     */     //   167: iload #12
/*     */     //   169: sipush #24576
/*     */     //   172: iand
/*     */     //   173: ifne -> 202
/*     */     //   176: iload #14
/*     */     //   178: aload #11
/*     */     //   180: iload #4
/*     */     //   182: invokeinterface changed : (Z)Z
/*     */     //   187: ifeq -> 196
/*     */     //   190: sipush #16384
/*     */     //   193: goto -> 199
/*     */     //   196: sipush #8192
/*     */     //   199: ior
/*     */     //   200: istore #14
/*     */     //   202: iload #12
/*     */     //   204: ldc 196608
/*     */     //   206: iand
/*     */     //   207: ifne -> 234
/*     */     //   210: iload #14
/*     */     //   212: aload #11
/*     */     //   214: aload #5
/*     */     //   216: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   221: ifeq -> 229
/*     */     //   224: ldc 131072
/*     */     //   226: goto -> 231
/*     */     //   229: ldc 65536
/*     */     //   231: ior
/*     */     //   232: istore #14
/*     */     //   234: iload #12
/*     */     //   236: ldc 1572864
/*     */     //   238: iand
/*     */     //   239: ifne -> 266
/*     */     //   242: iload #14
/*     */     //   244: aload #11
/*     */     //   246: aload #6
/*     */     //   248: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   253: ifeq -> 261
/*     */     //   256: ldc 1048576
/*     */     //   258: goto -> 263
/*     */     //   261: ldc 524288
/*     */     //   263: ior
/*     */     //   264: istore #14
/*     */     //   266: iload #12
/*     */     //   268: ldc 12582912
/*     */     //   270: iand
/*     */     //   271: ifne -> 298
/*     */     //   274: iload #14
/*     */     //   276: aload #11
/*     */     //   278: aload #7
/*     */     //   280: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   285: ifeq -> 293
/*     */     //   288: ldc 8388608
/*     */     //   290: goto -> 295
/*     */     //   293: ldc 4194304
/*     */     //   295: ior
/*     */     //   296: istore #14
/*     */     //   298: iload #12
/*     */     //   300: ldc 100663296
/*     */     //   302: iand
/*     */     //   303: ifne -> 330
/*     */     //   306: iload #14
/*     */     //   308: aload #11
/*     */     //   310: aload #8
/*     */     //   312: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   317: ifeq -> 325
/*     */     //   320: ldc 67108864
/*     */     //   322: goto -> 327
/*     */     //   325: ldc 33554432
/*     */     //   327: ior
/*     */     //   328: istore #14
/*     */     //   330: iload #12
/*     */     //   332: ldc 805306368
/*     */     //   334: iand
/*     */     //   335: ifne -> 362
/*     */     //   338: iload #14
/*     */     //   340: aload #11
/*     */     //   342: aload #9
/*     */     //   344: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   349: ifeq -> 357
/*     */     //   352: ldc 536870912
/*     */     //   354: goto -> 359
/*     */     //   357: ldc 268435456
/*     */     //   359: ior
/*     */     //   360: istore #14
/*     */     //   362: iload #13
/*     */     //   364: bipush #6
/*     */     //   366: iand
/*     */     //   367: ifne -> 392
/*     */     //   370: iload #15
/*     */     //   372: aload #11
/*     */     //   374: aload #10
/*     */     //   376: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   381: ifeq -> 388
/*     */     //   384: iconst_4
/*     */     //   385: goto -> 389
/*     */     //   388: iconst_2
/*     */     //   389: ior
/*     */     //   390: istore #15
/*     */     //   392: iload #14
/*     */     //   394: ldc 306783379
/*     */     //   396: iand
/*     */     //   397: ldc 306783378
/*     */     //   399: if_icmpne -> 420
/*     */     //   402: iload #15
/*     */     //   404: iconst_3
/*     */     //   405: iand
/*     */     //   406: iconst_2
/*     */     //   407: if_icmpne -> 420
/*     */     //   410: aload #11
/*     */     //   412: invokeinterface getSkipping : ()Z
/*     */     //   417: ifne -> 547
/*     */     //   420: invokestatic isTraceInProgress : ()Z
/*     */     //   423: ifeq -> 439
/*     */     //   426: ldc_w -1469039295
/*     */     //   429: iload #14
/*     */     //   431: iload #15
/*     */     //   433: ldc_w 'org.jetbrains.jewel.ui.component.CoreIconActionButton (IconActionButton.kt:239)'
/*     */     //   436: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   439: aload #10
/*     */     //   441: aload #7
/*     */     //   443: iload_3
/*     */     //   444: iload #4
/*     */     //   446: aload #5
/*     */     //   448: aload #6
/*     */     //   450: ldc_w -1223629366
/*     */     //   453: iconst_1
/*     */     //   454: new org/jetbrains/jewel/ui/component/IconActionButtonKt$CoreIconActionButton$3
/*     */     //   457: dup
/*     */     //   458: aload_0
/*     */     //   459: aload_1
/*     */     //   460: aload_2
/*     */     //   461: aload #8
/*     */     //   463: aload #9
/*     */     //   465: invokespecial <init> : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Ljava/lang/Class;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/painter/PainterHint;)V
/*     */     //   468: aload #11
/*     */     //   470: bipush #54
/*     */     //   472: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   475: checkcast kotlin/jvm/functions/Function4
/*     */     //   478: aload #11
/*     */     //   480: ldc 1572864
/*     */     //   482: bipush #14
/*     */     //   484: iload #15
/*     */     //   486: iand
/*     */     //   487: ior
/*     */     //   488: bipush #112
/*     */     //   490: iload #14
/*     */     //   492: bipush #18
/*     */     //   494: ishr
/*     */     //   495: iand
/*     */     //   496: ior
/*     */     //   497: sipush #896
/*     */     //   500: iload #14
/*     */     //   502: iconst_3
/*     */     //   503: ishr
/*     */     //   504: iand
/*     */     //   505: ior
/*     */     //   506: sipush #7168
/*     */     //   509: iload #14
/*     */     //   511: iconst_3
/*     */     //   512: ishr
/*     */     //   513: iand
/*     */     //   514: ior
/*     */     //   515: ldc 57344
/*     */     //   517: iload #14
/*     */     //   519: iconst_3
/*     */     //   520: ishr
/*     */     //   521: iand
/*     */     //   522: ior
/*     */     //   523: ldc 458752
/*     */     //   525: iload #14
/*     */     //   527: iconst_3
/*     */     //   528: ishr
/*     */     //   529: iand
/*     */     //   530: ior
/*     */     //   531: iconst_0
/*     */     //   532: invokestatic IconButton : (Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V
/*     */     //   535: invokestatic isTraceInProgress : ()Z
/*     */     //   538: ifeq -> 554
/*     */     //   541: invokestatic traceEventEnd : ()V
/*     */     //   544: goto -> 554
/*     */     //   547: aload #11
/*     */     //   549: invokeinterface skipToGroupEnd : ()V
/*     */     //   554: aload #11
/*     */     //   556: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   561: dup
/*     */     //   562: ifnull -> 600
/*     */     //   565: aload_0
/*     */     //   566: aload_1
/*     */     //   567: aload_2
/*     */     //   568: iload_3
/*     */     //   569: iload #4
/*     */     //   571: aload #5
/*     */     //   573: aload #6
/*     */     //   575: aload #7
/*     */     //   577: aload #8
/*     */     //   579: aload #9
/*     */     //   581: aload #10
/*     */     //   583: iload #12
/*     */     //   585: iload #13
/*     */     //   587: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Ljava/lang/Class;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorFilter;Lorg/jetbrains/jewel/ui/painter/PainterHint;Lkotlin/jvm/functions/Function0;II)Lkotlin/jvm/functions/Function2;
/*     */     //   592: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   597: goto -> 601
/*     */     //   600: pop
/*     */     //   601: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #240	-> 0
/*     */     //   #241	-> 439
/*     */     //   #244	-> 547
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   16	586	14	$dirty	I
/*     */     //   20	582	15	$dirty1	I
/*     */     //   0	602	0	key	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   0	602	1	contentDescription	Ljava/lang/String;
/*     */     //   0	602	2	iconClass	Ljava/lang/Class;
/*     */     //   0	602	3	enabled	Z
/*     */     //   0	602	4	focusable	Z
/*     */     //   0	602	5	style	Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   0	602	6	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	602	7	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	602	8	colorFilter	Landroidx/compose/ui/graphics/ColorFilter;
/*     */     //   0	602	9	hint	Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   0	602	10	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	602	11	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	602	12	$changed	I
/*     */     //   0	602	13	$changed1	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class IconActionButtonKt$CoreIconActionButton$3
/*     */     implements Function4<BoxScope, IconButtonState, Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke-KMTpdl8(BoxScope $this$IconButton, long it, Composer $composer, int $changed) {
/* 242 */       Intrinsics.checkNotNullParameter($this$IconButton, "$this$IconButton"); if (($changed & 0x81) != 128 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1223629366, $changed, -1, "org.jetbrains.jewel.ui.component.CoreIconActionButton.<anonymous> (IconActionButton.kt:241)");  IconKt.Icon(this.$key, this.$contentDescription, (Modifier)null, this.$iconClass, this.$colorFilter, this.$hint, $composer, 0, 4); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*     */     
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     IconActionButtonKt$CoreIconActionButton$3(IconKey $key, String $contentDescription, Class<?> $iconClass, ColorFilter $colorFilter, PainterHint $hint) {}
/*     */   }
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void IconActionButton(@NotNull Painter painter, @Nullable String contentDescription, @NotNull Function0 onClick, @Nullable Modifier modifier, boolean enabled, boolean focusable, @Nullable IconButtonStyle style, @Nullable MutableInteractionSource interactionSource, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'painter'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_2
/*     */     //   8: ldc 'onClick'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload #8
/*     */     //   15: ldc_w -211023092
/*     */     //   18: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   23: astore #8
/*     */     //   25: iload #9
/*     */     //   27: istore #11
/*     */     //   29: iload #10
/*     */     //   31: iconst_1
/*     */     //   32: iand
/*     */     //   33: ifeq -> 46
/*     */     //   36: iload #11
/*     */     //   38: bipush #6
/*     */     //   40: ior
/*     */     //   41: istore #11
/*     */     //   43: goto -> 75
/*     */     //   46: iload #9
/*     */     //   48: bipush #6
/*     */     //   50: iand
/*     */     //   51: ifne -> 75
/*     */     //   54: iload #11
/*     */     //   56: aload #8
/*     */     //   58: aload_0
/*     */     //   59: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   64: ifeq -> 71
/*     */     //   67: iconst_4
/*     */     //   68: goto -> 72
/*     */     //   71: iconst_2
/*     */     //   72: ior
/*     */     //   73: istore #11
/*     */     //   75: iload #10
/*     */     //   77: iconst_2
/*     */     //   78: iand
/*     */     //   79: ifeq -> 92
/*     */     //   82: iload #11
/*     */     //   84: bipush #48
/*     */     //   86: ior
/*     */     //   87: istore #11
/*     */     //   89: goto -> 123
/*     */     //   92: iload #9
/*     */     //   94: bipush #48
/*     */     //   96: iand
/*     */     //   97: ifne -> 123
/*     */     //   100: iload #11
/*     */     //   102: aload #8
/*     */     //   104: aload_1
/*     */     //   105: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   110: ifeq -> 118
/*     */     //   113: bipush #32
/*     */     //   115: goto -> 120
/*     */     //   118: bipush #16
/*     */     //   120: ior
/*     */     //   121: istore #11
/*     */     //   123: iload #10
/*     */     //   125: iconst_4
/*     */     //   126: iand
/*     */     //   127: ifeq -> 141
/*     */     //   130: iload #11
/*     */     //   132: sipush #384
/*     */     //   135: ior
/*     */     //   136: istore #11
/*     */     //   138: goto -> 175
/*     */     //   141: iload #9
/*     */     //   143: sipush #384
/*     */     //   146: iand
/*     */     //   147: ifne -> 175
/*     */     //   150: iload #11
/*     */     //   152: aload #8
/*     */     //   154: aload_2
/*     */     //   155: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   160: ifeq -> 169
/*     */     //   163: sipush #256
/*     */     //   166: goto -> 172
/*     */     //   169: sipush #128
/*     */     //   172: ior
/*     */     //   173: istore #11
/*     */     //   175: iload #10
/*     */     //   177: bipush #8
/*     */     //   179: iand
/*     */     //   180: ifeq -> 194
/*     */     //   183: iload #11
/*     */     //   185: sipush #3072
/*     */     //   188: ior
/*     */     //   189: istore #11
/*     */     //   191: goto -> 228
/*     */     //   194: iload #9
/*     */     //   196: sipush #3072
/*     */     //   199: iand
/*     */     //   200: ifne -> 228
/*     */     //   203: iload #11
/*     */     //   205: aload #8
/*     */     //   207: aload_3
/*     */     //   208: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   213: ifeq -> 222
/*     */     //   216: sipush #2048
/*     */     //   219: goto -> 225
/*     */     //   222: sipush #1024
/*     */     //   225: ior
/*     */     //   226: istore #11
/*     */     //   228: iload #10
/*     */     //   230: bipush #16
/*     */     //   232: iand
/*     */     //   233: ifeq -> 247
/*     */     //   236: iload #11
/*     */     //   238: sipush #24576
/*     */     //   241: ior
/*     */     //   242: istore #11
/*     */     //   244: goto -> 282
/*     */     //   247: iload #9
/*     */     //   249: sipush #24576
/*     */     //   252: iand
/*     */     //   253: ifne -> 282
/*     */     //   256: iload #11
/*     */     //   258: aload #8
/*     */     //   260: iload #4
/*     */     //   262: invokeinterface changed : (Z)Z
/*     */     //   267: ifeq -> 276
/*     */     //   270: sipush #16384
/*     */     //   273: goto -> 279
/*     */     //   276: sipush #8192
/*     */     //   279: ior
/*     */     //   280: istore #11
/*     */     //   282: iload #10
/*     */     //   284: bipush #32
/*     */     //   286: iand
/*     */     //   287: ifeq -> 300
/*     */     //   290: iload #11
/*     */     //   292: ldc 196608
/*     */     //   294: ior
/*     */     //   295: istore #11
/*     */     //   297: goto -> 332
/*     */     //   300: iload #9
/*     */     //   302: ldc 196608
/*     */     //   304: iand
/*     */     //   305: ifne -> 332
/*     */     //   308: iload #11
/*     */     //   310: aload #8
/*     */     //   312: iload #5
/*     */     //   314: invokeinterface changed : (Z)Z
/*     */     //   319: ifeq -> 327
/*     */     //   322: ldc 131072
/*     */     //   324: goto -> 329
/*     */     //   327: ldc 65536
/*     */     //   329: ior
/*     */     //   330: istore #11
/*     */     //   332: iload #9
/*     */     //   334: ldc 1572864
/*     */     //   336: iand
/*     */     //   337: ifne -> 372
/*     */     //   340: iload #11
/*     */     //   342: iload #10
/*     */     //   344: bipush #64
/*     */     //   346: iand
/*     */     //   347: ifne -> 367
/*     */     //   350: aload #8
/*     */     //   352: aload #6
/*     */     //   354: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   359: ifeq -> 367
/*     */     //   362: ldc 1048576
/*     */     //   364: goto -> 369
/*     */     //   367: ldc 524288
/*     */     //   369: ior
/*     */     //   370: istore #11
/*     */     //   372: iload #10
/*     */     //   374: sipush #128
/*     */     //   377: iand
/*     */     //   378: ifeq -> 391
/*     */     //   381: iload #11
/*     */     //   383: ldc 12582912
/*     */     //   385: ior
/*     */     //   386: istore #11
/*     */     //   388: goto -> 423
/*     */     //   391: iload #9
/*     */     //   393: ldc 12582912
/*     */     //   395: iand
/*     */     //   396: ifne -> 423
/*     */     //   399: iload #11
/*     */     //   401: aload #8
/*     */     //   403: aload #7
/*     */     //   405: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   410: ifeq -> 418
/*     */     //   413: ldc 8388608
/*     */     //   415: goto -> 420
/*     */     //   418: ldc 4194304
/*     */     //   420: ior
/*     */     //   421: istore #11
/*     */     //   423: iload #11
/*     */     //   425: ldc_w 4793491
/*     */     //   428: iand
/*     */     //   429: ldc_w 4793490
/*     */     //   432: if_icmpne -> 445
/*     */     //   435: aload #8
/*     */     //   437: invokeinterface getSkipping : ()Z
/*     */     //   442: ifne -> 775
/*     */     //   445: aload #8
/*     */     //   447: invokeinterface startDefaults : ()V
/*     */     //   452: iload #9
/*     */     //   454: iconst_1
/*     */     //   455: iand
/*     */     //   456: ifeq -> 469
/*     */     //   459: aload #8
/*     */     //   461: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   466: ifeq -> 631
/*     */     //   469: iload #10
/*     */     //   471: bipush #8
/*     */     //   473: iand
/*     */     //   474: ifeq -> 484
/*     */     //   477: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   480: checkcast androidx/compose/ui/Modifier
/*     */     //   483: astore_3
/*     */     //   484: iload #10
/*     */     //   486: bipush #16
/*     */     //   488: iand
/*     */     //   489: ifeq -> 495
/*     */     //   492: iconst_1
/*     */     //   493: istore #4
/*     */     //   495: iload #10
/*     */     //   497: bipush #32
/*     */     //   499: iand
/*     */     //   500: ifeq -> 506
/*     */     //   503: iconst_1
/*     */     //   504: istore #5
/*     */     //   506: iload #10
/*     */     //   508: bipush #64
/*     */     //   510: iand
/*     */     //   511: ifeq -> 533
/*     */     //   514: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   517: aload #8
/*     */     //   519: bipush #6
/*     */     //   521: invokestatic getIconButtonStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   524: astore #6
/*     */     //   526: iload #11
/*     */     //   528: ldc -3670017
/*     */     //   530: iand
/*     */     //   531: istore #11
/*     */     //   533: iload #10
/*     */     //   535: sipush #128
/*     */     //   538: iand
/*     */     //   539: ifeq -> 653
/*     */     //   542: aload #8
/*     */     //   544: ldc_w 2017742406
/*     */     //   547: invokeinterface startReplaceGroup : (I)V
/*     */     //   552: aload #8
/*     */     //   554: astore #13
/*     */     //   556: iconst_0
/*     */     //   557: istore #14
/*     */     //   559: iconst_0
/*     */     //   560: istore #15
/*     */     //   562: aload #13
/*     */     //   564: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   569: astore #16
/*     */     //   571: iconst_0
/*     */     //   572: istore #17
/*     */     //   574: aload #16
/*     */     //   576: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   579: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   582: if_acmpne -> 607
/*     */     //   585: iconst_0
/*     */     //   586: istore #18
/*     */     //   588: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   591: astore #18
/*     */     //   593: aload #13
/*     */     //   595: aload #18
/*     */     //   597: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   602: aload #18
/*     */     //   604: goto -> 609
/*     */     //   607: aload #16
/*     */     //   609: nop
/*     */     //   610: nop
/*     */     //   611: nop
/*     */     //   612: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   615: astore #12
/*     */     //   617: aload #8
/*     */     //   619: invokeinterface endReplaceGroup : ()V
/*     */     //   624: aload #12
/*     */     //   626: astore #7
/*     */     //   628: goto -> 653
/*     */     //   631: aload #8
/*     */     //   633: invokeinterface skipToGroupEnd : ()V
/*     */     //   638: iload #10
/*     */     //   640: bipush #64
/*     */     //   642: iand
/*     */     //   643: ifeq -> 653
/*     */     //   646: iload #11
/*     */     //   648: ldc -3670017
/*     */     //   650: iand
/*     */     //   651: istore #11
/*     */     //   653: aload #8
/*     */     //   655: invokeinterface endDefaults : ()V
/*     */     //   660: invokestatic isTraceInProgress : ()Z
/*     */     //   663: ifeq -> 678
/*     */     //   666: ldc_w -211023092
/*     */     //   669: iload #11
/*     */     //   671: iconst_m1
/*     */     //   672: ldc_w 'org.jetbrains.jewel.ui.component.IconActionButton (IconActionButton.kt:255)'
/*     */     //   675: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   678: aload_0
/*     */     //   679: aload_1
/*     */     //   680: iload #4
/*     */     //   682: iload #5
/*     */     //   684: aload #6
/*     */     //   686: aload #7
/*     */     //   688: aload_3
/*     */     //   689: aload_2
/*     */     //   690: aload #8
/*     */     //   692: bipush #14
/*     */     //   694: iload #11
/*     */     //   696: iand
/*     */     //   697: bipush #112
/*     */     //   699: iload #11
/*     */     //   701: iand
/*     */     //   702: ior
/*     */     //   703: sipush #896
/*     */     //   706: iload #11
/*     */     //   708: bipush #6
/*     */     //   710: ishr
/*     */     //   711: iand
/*     */     //   712: ior
/*     */     //   713: sipush #7168
/*     */     //   716: iload #11
/*     */     //   718: bipush #6
/*     */     //   720: ishr
/*     */     //   721: iand
/*     */     //   722: ior
/*     */     //   723: ldc 57344
/*     */     //   725: iload #11
/*     */     //   727: bipush #6
/*     */     //   729: ishr
/*     */     //   730: iand
/*     */     //   731: ior
/*     */     //   732: ldc 458752
/*     */     //   734: iload #11
/*     */     //   736: bipush #6
/*     */     //   738: ishr
/*     */     //   739: iand
/*     */     //   740: ior
/*     */     //   741: ldc 3670016
/*     */     //   743: iload #11
/*     */     //   745: bipush #9
/*     */     //   747: ishl
/*     */     //   748: iand
/*     */     //   749: ior
/*     */     //   750: ldc 29360128
/*     */     //   752: iload #11
/*     */     //   754: bipush #15
/*     */     //   756: ishl
/*     */     //   757: iand
/*     */     //   758: ior
/*     */     //   759: iconst_0
/*     */     //   760: invokestatic CoreIconActionButton : (Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*     */     //   763: invokestatic isTraceInProgress : ()Z
/*     */     //   766: ifeq -> 782
/*     */     //   769: invokestatic traceEventEnd : ()V
/*     */     //   772: goto -> 782
/*     */     //   775: aload #8
/*     */     //   777: invokeinterface skipToGroupEnd : ()V
/*     */     //   782: aload #8
/*     */     //   784: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   789: dup
/*     */     //   790: ifnull -> 822
/*     */     //   793: aload_0
/*     */     //   794: aload_1
/*     */     //   795: aload_2
/*     */     //   796: aload_3
/*     */     //   797: iload #4
/*     */     //   799: iload #5
/*     */     //   801: aload #6
/*     */     //   803: aload #7
/*     */     //   805: iload #9
/*     */     //   807: iload #10
/*     */     //   809: <illegal opcode> invoke : (Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;II)Lkotlin/jvm/functions/Function2;
/*     */     //   814: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   819: goto -> 823
/*     */     //   822: pop
/*     */     //   823: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #256	-> 13
/*     */     //   #251	-> 477
/*     */     //   #252	-> 492
/*     */     //   #253	-> 503
/*     */     //   #254	-> 514
/*     */     //   #255	-> 542
/*     */     //   #329	-> 562
/*     */     //   #330	-> 574
/*     */     //   #331	-> 585
/*     */     //   #255	-> 588
/*     */     //   #331	-> 591
/*     */     //   #332	-> 593
/*     */     //   #333	-> 602
/*     */     //   #334	-> 607
/*     */     //   #330	-> 609
/*     */     //   #329	-> 610
/*     */     //   #329	-> 611
/*     */     //   #255	-> 612
/*     */     //   #256	-> 675
/*     */     //   #257	-> 678
/*     */     //   #258	-> 775
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   588	3	18	$i$a$-cache-IconActionButtonKt$IconActionButton$11	I
/*     */     //   593	11	18	value$iv	Ljava/lang/Object;
/*     */     //   574	36	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   571	39	16	it$iv	Ljava/lang/Object;
/*     */     //   562	50	15	$i$f$cache	I
/*     */     //   559	53	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   559	53	14	invalid$iv	Z
/*     */     //   29	795	11	$dirty	I
/*     */     //   0	824	0	painter	Landroidx/compose/ui/graphics/painter/Painter;
/*     */     //   0	824	1	contentDescription	Ljava/lang/String;
/*     */     //   0	824	2	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	824	3	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	824	4	enabled	Z
/*     */     //   0	824	5	focusable	Z
/*     */     //   0	824	6	style	Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   0	824	7	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	824	8	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	824	9	$changed	I
/*     */   }
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
/*     */   public static final void IconActionButton(@NotNull Painter painter, @Nullable String contentDescription, @NotNull Function0 onClick, @Nullable Modifier modifier, boolean enabled, boolean focusable, @Nullable IconButtonStyle style, @Nullable TooltipStyle tooltipStyle, @Nullable Modifier tooltipModifier, @Nullable TooltipPlacement tooltipPlacement, @Nullable MutableInteractionSource interactionSource, @NotNull Function2 tooltip, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'painter'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_2
/*     */     //   8: ldc 'onClick'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload #11
/*     */     //   15: ldc 'tooltip'
/*     */     //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   20: aload #12
/*     */     //   22: ldc_w 1310601814
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
/*     */     //   54: goto -> 86
/*     */     //   57: iload #13
/*     */     //   59: bipush #6
/*     */     //   61: iand
/*     */     //   62: ifne -> 86
/*     */     //   65: iload #16
/*     */     //   67: aload #12
/*     */     //   69: aload_0
/*     */     //   70: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   75: ifeq -> 82
/*     */     //   78: iconst_4
/*     */     //   79: goto -> 83
/*     */     //   82: iconst_2
/*     */     //   83: ior
/*     */     //   84: istore #16
/*     */     //   86: iload #15
/*     */     //   88: iconst_2
/*     */     //   89: iand
/*     */     //   90: ifeq -> 103
/*     */     //   93: iload #16
/*     */     //   95: bipush #48
/*     */     //   97: ior
/*     */     //   98: istore #16
/*     */     //   100: goto -> 134
/*     */     //   103: iload #13
/*     */     //   105: bipush #48
/*     */     //   107: iand
/*     */     //   108: ifne -> 134
/*     */     //   111: iload #16
/*     */     //   113: aload #12
/*     */     //   115: aload_1
/*     */     //   116: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   121: ifeq -> 129
/*     */     //   124: bipush #32
/*     */     //   126: goto -> 131
/*     */     //   129: bipush #16
/*     */     //   131: ior
/*     */     //   132: istore #16
/*     */     //   134: iload #15
/*     */     //   136: iconst_4
/*     */     //   137: iand
/*     */     //   138: ifeq -> 152
/*     */     //   141: iload #16
/*     */     //   143: sipush #384
/*     */     //   146: ior
/*     */     //   147: istore #16
/*     */     //   149: goto -> 186
/*     */     //   152: iload #13
/*     */     //   154: sipush #384
/*     */     //   157: iand
/*     */     //   158: ifne -> 186
/*     */     //   161: iload #16
/*     */     //   163: aload #12
/*     */     //   165: aload_2
/*     */     //   166: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   171: ifeq -> 180
/*     */     //   174: sipush #256
/*     */     //   177: goto -> 183
/*     */     //   180: sipush #128
/*     */     //   183: ior
/*     */     //   184: istore #16
/*     */     //   186: iload #15
/*     */     //   188: bipush #8
/*     */     //   190: iand
/*     */     //   191: ifeq -> 205
/*     */     //   194: iload #16
/*     */     //   196: sipush #3072
/*     */     //   199: ior
/*     */     //   200: istore #16
/*     */     //   202: goto -> 239
/*     */     //   205: iload #13
/*     */     //   207: sipush #3072
/*     */     //   210: iand
/*     */     //   211: ifne -> 239
/*     */     //   214: iload #16
/*     */     //   216: aload #12
/*     */     //   218: aload_3
/*     */     //   219: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   224: ifeq -> 233
/*     */     //   227: sipush #2048
/*     */     //   230: goto -> 236
/*     */     //   233: sipush #1024
/*     */     //   236: ior
/*     */     //   237: istore #16
/*     */     //   239: iload #15
/*     */     //   241: bipush #16
/*     */     //   243: iand
/*     */     //   244: ifeq -> 258
/*     */     //   247: iload #16
/*     */     //   249: sipush #24576
/*     */     //   252: ior
/*     */     //   253: istore #16
/*     */     //   255: goto -> 293
/*     */     //   258: iload #13
/*     */     //   260: sipush #24576
/*     */     //   263: iand
/*     */     //   264: ifne -> 293
/*     */     //   267: iload #16
/*     */     //   269: aload #12
/*     */     //   271: iload #4
/*     */     //   273: invokeinterface changed : (Z)Z
/*     */     //   278: ifeq -> 287
/*     */     //   281: sipush #16384
/*     */     //   284: goto -> 290
/*     */     //   287: sipush #8192
/*     */     //   290: ior
/*     */     //   291: istore #16
/*     */     //   293: iload #15
/*     */     //   295: bipush #32
/*     */     //   297: iand
/*     */     //   298: ifeq -> 311
/*     */     //   301: iload #16
/*     */     //   303: ldc 196608
/*     */     //   305: ior
/*     */     //   306: istore #16
/*     */     //   308: goto -> 343
/*     */     //   311: iload #13
/*     */     //   313: ldc 196608
/*     */     //   315: iand
/*     */     //   316: ifne -> 343
/*     */     //   319: iload #16
/*     */     //   321: aload #12
/*     */     //   323: iload #5
/*     */     //   325: invokeinterface changed : (Z)Z
/*     */     //   330: ifeq -> 338
/*     */     //   333: ldc 131072
/*     */     //   335: goto -> 340
/*     */     //   338: ldc 65536
/*     */     //   340: ior
/*     */     //   341: istore #16
/*     */     //   343: iload #13
/*     */     //   345: ldc 1572864
/*     */     //   347: iand
/*     */     //   348: ifne -> 383
/*     */     //   351: iload #16
/*     */     //   353: iload #15
/*     */     //   355: bipush #64
/*     */     //   357: iand
/*     */     //   358: ifne -> 378
/*     */     //   361: aload #12
/*     */     //   363: aload #6
/*     */     //   365: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   370: ifeq -> 378
/*     */     //   373: ldc 1048576
/*     */     //   375: goto -> 380
/*     */     //   378: ldc 524288
/*     */     //   380: ior
/*     */     //   381: istore #16
/*     */     //   383: iload #13
/*     */     //   385: ldc 12582912
/*     */     //   387: iand
/*     */     //   388: ifne -> 424
/*     */     //   391: iload #16
/*     */     //   393: iload #15
/*     */     //   395: sipush #128
/*     */     //   398: iand
/*     */     //   399: ifne -> 419
/*     */     //   402: aload #12
/*     */     //   404: aload #7
/*     */     //   406: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   411: ifeq -> 419
/*     */     //   414: ldc 8388608
/*     */     //   416: goto -> 421
/*     */     //   419: ldc 4194304
/*     */     //   421: ior
/*     */     //   422: istore #16
/*     */     //   424: iload #15
/*     */     //   426: sipush #256
/*     */     //   429: iand
/*     */     //   430: ifeq -> 443
/*     */     //   433: iload #16
/*     */     //   435: ldc 100663296
/*     */     //   437: ior
/*     */     //   438: istore #16
/*     */     //   440: goto -> 475
/*     */     //   443: iload #13
/*     */     //   445: ldc 100663296
/*     */     //   447: iand
/*     */     //   448: ifne -> 475
/*     */     //   451: iload #16
/*     */     //   453: aload #12
/*     */     //   455: aload #8
/*     */     //   457: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   462: ifeq -> 470
/*     */     //   465: ldc 67108864
/*     */     //   467: goto -> 472
/*     */     //   470: ldc 33554432
/*     */     //   472: ior
/*     */     //   473: istore #16
/*     */     //   475: iload #13
/*     */     //   477: ldc 805306368
/*     */     //   479: iand
/*     */     //   480: ifne -> 516
/*     */     //   483: iload #16
/*     */     //   485: iload #15
/*     */     //   487: sipush #512
/*     */     //   490: iand
/*     */     //   491: ifne -> 511
/*     */     //   494: aload #12
/*     */     //   496: aload #9
/*     */     //   498: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   503: ifeq -> 511
/*     */     //   506: ldc 536870912
/*     */     //   508: goto -> 513
/*     */     //   511: ldc 268435456
/*     */     //   513: ior
/*     */     //   514: istore #16
/*     */     //   516: iload #15
/*     */     //   518: sipush #1024
/*     */     //   521: iand
/*     */     //   522: ifeq -> 535
/*     */     //   525: iload #17
/*     */     //   527: bipush #6
/*     */     //   529: ior
/*     */     //   530: istore #17
/*     */     //   532: goto -> 565
/*     */     //   535: iload #14
/*     */     //   537: bipush #6
/*     */     //   539: iand
/*     */     //   540: ifne -> 565
/*     */     //   543: iload #17
/*     */     //   545: aload #12
/*     */     //   547: aload #10
/*     */     //   549: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   554: ifeq -> 561
/*     */     //   557: iconst_4
/*     */     //   558: goto -> 562
/*     */     //   561: iconst_2
/*     */     //   562: ior
/*     */     //   563: istore #17
/*     */     //   565: iload #15
/*     */     //   567: sipush #2048
/*     */     //   570: iand
/*     */     //   571: ifeq -> 584
/*     */     //   574: iload #17
/*     */     //   576: bipush #48
/*     */     //   578: ior
/*     */     //   579: istore #17
/*     */     //   581: goto -> 616
/*     */     //   584: iload #14
/*     */     //   586: bipush #48
/*     */     //   588: iand
/*     */     //   589: ifne -> 616
/*     */     //   592: iload #17
/*     */     //   594: aload #12
/*     */     //   596: aload #11
/*     */     //   598: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   603: ifeq -> 611
/*     */     //   606: bipush #32
/*     */     //   608: goto -> 613
/*     */     //   611: bipush #16
/*     */     //   613: ior
/*     */     //   614: istore #17
/*     */     //   616: iload #16
/*     */     //   618: ldc 306783379
/*     */     //   620: iand
/*     */     //   621: ldc 306783378
/*     */     //   623: if_icmpne -> 646
/*     */     //   626: iload #17
/*     */     //   628: bipush #19
/*     */     //   630: iand
/*     */     //   631: bipush #18
/*     */     //   633: if_icmpne -> 646
/*     */     //   636: aload #12
/*     */     //   638: invokeinterface getSkipping : ()Z
/*     */     //   643: ifne -> 1118
/*     */     //   646: aload #12
/*     */     //   648: invokeinterface startDefaults : ()V
/*     */     //   653: iload #13
/*     */     //   655: iconst_1
/*     */     //   656: iand
/*     */     //   657: ifeq -> 670
/*     */     //   660: aload #12
/*     */     //   662: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   667: ifeq -> 939
/*     */     //   670: iload #15
/*     */     //   672: bipush #8
/*     */     //   674: iand
/*     */     //   675: ifeq -> 685
/*     */     //   678: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   681: checkcast androidx/compose/ui/Modifier
/*     */     //   684: astore_3
/*     */     //   685: iload #15
/*     */     //   687: bipush #16
/*     */     //   689: iand
/*     */     //   690: ifeq -> 696
/*     */     //   693: iconst_1
/*     */     //   694: istore #4
/*     */     //   696: iload #15
/*     */     //   698: bipush #32
/*     */     //   700: iand
/*     */     //   701: ifeq -> 707
/*     */     //   704: iconst_1
/*     */     //   705: istore #5
/*     */     //   707: iload #15
/*     */     //   709: bipush #64
/*     */     //   711: iand
/*     */     //   712: ifeq -> 734
/*     */     //   715: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   718: aload #12
/*     */     //   720: bipush #6
/*     */     //   722: invokestatic getIconButtonStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   725: astore #6
/*     */     //   727: iload #16
/*     */     //   729: ldc -3670017
/*     */     //   731: iand
/*     */     //   732: istore #16
/*     */     //   734: iload #15
/*     */     //   736: sipush #128
/*     */     //   739: iand
/*     */     //   740: ifeq -> 763
/*     */     //   743: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   746: aload #12
/*     */     //   748: bipush #6
/*     */     //   750: invokestatic getTooltipStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;
/*     */     //   753: astore #7
/*     */     //   755: iload #16
/*     */     //   757: ldc_w -29360129
/*     */     //   760: iand
/*     */     //   761: istore #16
/*     */     //   763: iload #15
/*     */     //   765: sipush #256
/*     */     //   768: iand
/*     */     //   769: ifeq -> 780
/*     */     //   772: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   775: checkcast androidx/compose/ui/Modifier
/*     */     //   778: astore #8
/*     */     //   780: iload #15
/*     */     //   782: sipush #512
/*     */     //   785: iand
/*     */     //   786: ifeq -> 841
/*     */     //   789: new org/jetbrains/jewel/ui/component/FixedCursorPoint
/*     */     //   792: dup
/*     */     //   793: iconst_0
/*     */     //   794: istore #18
/*     */     //   796: iconst_0
/*     */     //   797: istore #19
/*     */     //   799: iload #18
/*     */     //   801: i2f
/*     */     //   802: invokestatic constructor-impl : (F)F
/*     */     //   805: bipush #16
/*     */     //   807: istore #18
/*     */     //   809: iconst_0
/*     */     //   810: istore #19
/*     */     //   812: iload #18
/*     */     //   814: i2f
/*     */     //   815: invokestatic constructor-impl : (F)F
/*     */     //   818: invokestatic DpOffset-YgX7TsA : (FF)J
/*     */     //   821: aconst_null
/*     */     //   822: fconst_0
/*     */     //   823: bipush #6
/*     */     //   825: aconst_null
/*     */     //   826: invokespecial <init> : (JLandroidx/compose/ui/Alignment;FILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   829: checkcast androidx/compose/foundation/TooltipPlacement
/*     */     //   832: astore #9
/*     */     //   834: iload #16
/*     */     //   836: ldc -1879048193
/*     */     //   838: iand
/*     */     //   839: istore #16
/*     */     //   841: iload #15
/*     */     //   843: sipush #1024
/*     */     //   846: iand
/*     */     //   847: ifeq -> 994
/*     */     //   850: aload #12
/*     */     //   852: ldc_w 2017764198
/*     */     //   855: invokeinterface startReplaceGroup : (I)V
/*     */     //   860: aload #12
/*     */     //   862: astore #19
/*     */     //   864: iconst_0
/*     */     //   865: istore #20
/*     */     //   867: iconst_0
/*     */     //   868: istore #21
/*     */     //   870: aload #19
/*     */     //   872: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   877: astore #22
/*     */     //   879: iconst_0
/*     */     //   880: istore #23
/*     */     //   882: aload #22
/*     */     //   884: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   887: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   890: if_acmpne -> 915
/*     */     //   893: iconst_0
/*     */     //   894: istore #24
/*     */     //   896: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   899: astore #24
/*     */     //   901: aload #19
/*     */     //   903: aload #24
/*     */     //   905: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   910: aload #24
/*     */     //   912: goto -> 917
/*     */     //   915: aload #22
/*     */     //   917: nop
/*     */     //   918: nop
/*     */     //   919: nop
/*     */     //   920: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   923: astore #18
/*     */     //   925: aload #12
/*     */     //   927: invokeinterface endReplaceGroup : ()V
/*     */     //   932: aload #18
/*     */     //   934: astore #10
/*     */     //   936: goto -> 994
/*     */     //   939: aload #12
/*     */     //   941: invokeinterface skipToGroupEnd : ()V
/*     */     //   946: iload #15
/*     */     //   948: bipush #64
/*     */     //   950: iand
/*     */     //   951: ifeq -> 961
/*     */     //   954: iload #16
/*     */     //   956: ldc -3670017
/*     */     //   958: iand
/*     */     //   959: istore #16
/*     */     //   961: iload #15
/*     */     //   963: sipush #128
/*     */     //   966: iand
/*     */     //   967: ifeq -> 978
/*     */     //   970: iload #16
/*     */     //   972: ldc_w -29360129
/*     */     //   975: iand
/*     */     //   976: istore #16
/*     */     //   978: iload #15
/*     */     //   980: sipush #512
/*     */     //   983: iand
/*     */     //   984: ifeq -> 994
/*     */     //   987: iload #16
/*     */     //   989: ldc -1879048193
/*     */     //   991: iand
/*     */     //   992: istore #16
/*     */     //   994: aload #12
/*     */     //   996: invokeinterface endDefaults : ()V
/*     */     //   1001: invokestatic isTraceInProgress : ()Z
/*     */     //   1004: ifeq -> 1020
/*     */     //   1007: ldc_w 1310601814
/*     */     //   1010: iload #16
/*     */     //   1012: iload #17
/*     */     //   1014: ldc_w 'org.jetbrains.jewel.ui.component.IconActionButton (IconActionButton.kt:273)'
/*     */     //   1017: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   1020: aload #11
/*     */     //   1022: aload #8
/*     */     //   1024: iconst_0
/*     */     //   1025: aload #7
/*     */     //   1027: aload #9
/*     */     //   1029: ldc_w 2119980553
/*     */     //   1032: iconst_1
/*     */     //   1033: new org/jetbrains/jewel/ui/component/IconActionButtonKt$IconActionButton$14
/*     */     //   1036: dup
/*     */     //   1037: aload_0
/*     */     //   1038: aload_1
/*     */     //   1039: iload #4
/*     */     //   1041: iload #5
/*     */     //   1043: aload #6
/*     */     //   1045: aload #10
/*     */     //   1047: aload_3
/*     */     //   1048: aload_2
/*     */     //   1049: invokespecial <init> : (Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;)V
/*     */     //   1052: aload #12
/*     */     //   1054: bipush #54
/*     */     //   1056: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1059: checkcast kotlin/jvm/functions/Function2
/*     */     //   1062: aload #12
/*     */     //   1064: ldc 196608
/*     */     //   1066: bipush #14
/*     */     //   1068: iload #17
/*     */     //   1070: iconst_3
/*     */     //   1071: ishr
/*     */     //   1072: iand
/*     */     //   1073: ior
/*     */     //   1074: bipush #112
/*     */     //   1076: iload #16
/*     */     //   1078: bipush #21
/*     */     //   1080: ishr
/*     */     //   1081: iand
/*     */     //   1082: ior
/*     */     //   1083: sipush #7168
/*     */     //   1086: iload #16
/*     */     //   1088: bipush #12
/*     */     //   1090: ishr
/*     */     //   1091: iand
/*     */     //   1092: ior
/*     */     //   1093: ldc 57344
/*     */     //   1095: iload #16
/*     */     //   1097: bipush #15
/*     */     //   1099: ishr
/*     */     //   1100: iand
/*     */     //   1101: ior
/*     */     //   1102: iconst_4
/*     */     //   1103: invokestatic Tooltip : (Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/foundation/TooltipPlacement;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1106: invokestatic isTraceInProgress : ()Z
/*     */     //   1109: ifeq -> 1125
/*     */     //   1112: invokestatic traceEventEnd : ()V
/*     */     //   1115: goto -> 1125
/*     */     //   1118: aload #12
/*     */     //   1120: invokeinterface skipToGroupEnd : ()V
/*     */     //   1125: aload #12
/*     */     //   1127: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1132: dup
/*     */     //   1133: ifnull -> 1175
/*     */     //   1136: aload_0
/*     */     //   1137: aload_1
/*     */     //   1138: aload_2
/*     */     //   1139: aload_3
/*     */     //   1140: iload #4
/*     */     //   1142: iload #5
/*     */     //   1144: aload #6
/*     */     //   1146: aload #7
/*     */     //   1148: aload #8
/*     */     //   1150: aload #9
/*     */     //   1152: aload #10
/*     */     //   1154: aload #11
/*     */     //   1156: iload #13
/*     */     //   1158: iload #14
/*     */     //   1160: iload #15
/*     */     //   1162: <illegal opcode> invoke : (Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/TooltipPlacement;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;III)Lkotlin/jvm/functions/Function2;
/*     */     //   1167: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1172: goto -> 1176
/*     */     //   1175: pop
/*     */     //   1176: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #274	-> 20
/*     */     //   #265	-> 678
/*     */     //   #266	-> 693
/*     */     //   #267	-> 704
/*     */     //   #268	-> 715
/*     */     //   #269	-> 743
/*     */     //   #270	-> 772
/*     */     //   #271	-> 789
/*     */     //   #335	-> 799
/*     */     //   #271	-> 805
/*     */     //   #335	-> 812
/*     */     //   #271	-> 818
/*     */     //   #272	-> 850
/*     */     //   #336	-> 870
/*     */     //   #337	-> 882
/*     */     //   #338	-> 893
/*     */     //   #272	-> 896
/*     */     //   #338	-> 899
/*     */     //   #339	-> 901
/*     */     //   #340	-> 910
/*     */     //   #341	-> 915
/*     */     //   #337	-> 917
/*     */     //   #336	-> 918
/*     */     //   #336	-> 919
/*     */     //   #272	-> 920
/*     */     //   #274	-> 1017
/*     */     //   #275	-> 1020
/*     */     //   #287	-> 1118
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   799	6	19	$i$f$getDp	I
/*     */     //   796	9	18	$this$dp$iv	I
/*     */     //   812	6	19	$i$f$getDp	I
/*     */     //   809	9	18	$this$dp$iv	I
/*     */     //   896	3	24	$i$a$-cache-IconActionButtonKt$IconActionButton$13	I
/*     */     //   901	11	24	value$iv	Ljava/lang/Object;
/*     */     //   882	36	23	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   879	39	22	it$iv	Ljava/lang/Object;
/*     */     //   870	50	21	$i$f$cache	I
/*     */     //   867	53	19	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   867	53	20	invalid$iv	Z
/*     */     //   36	1141	16	$dirty	I
/*     */     //   40	1137	17	$dirty1	I
/*     */     //   0	1177	0	painter	Landroidx/compose/ui/graphics/painter/Painter;
/*     */     //   0	1177	1	contentDescription	Ljava/lang/String;
/*     */     //   0	1177	2	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1177	3	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1177	4	enabled	Z
/*     */     //   0	1177	5	focusable	Z
/*     */     //   0	1177	6	style	Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   0	1177	7	tooltipStyle	Lorg/jetbrains/jewel/ui/component/styling/TooltipStyle;
/*     */     //   0	1177	8	tooltipModifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1177	9	tooltipPlacement	Landroidx/compose/foundation/TooltipPlacement;
/*     */     //   0	1177	10	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1177	11	tooltip	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1177	12	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1177	13	$changed	I
/*     */     //   0	1177	14	$changed1	I
/*     */   }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class IconActionButtonKt$IconActionButton$14
/*     */     implements Function2<Composer, Integer, Unit>
/*     */   {
/*     */     IconActionButtonKt$IconActionButton$14(Painter $painter, String $contentDescription, boolean $enabled, boolean $focusable, IconButtonStyle $style, MutableInteractionSource $interactionSource, Modifier $modifier, Function0<Unit> $onClick) {}
/*     */ 
/*     */     
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/* 276 */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(2119980553, $changed, -1, "org.jetbrains.jewel.ui.component.IconActionButton.<anonymous> (IconActionButton.kt:275)");  IconActionButtonKt.CoreIconActionButton(
/* 277 */             this.$painter, 
/*     */             
/* 279 */             this.$contentDescription, 
/* 280 */             this.$enabled, 
/* 281 */             this.$focusable, 
/* 282 */             this.$style, 
/* 283 */             this.$interactionSource, this.$modifier, 
/* 284 */             this.$onClick, $composer, 0, 0); if (ComposerKt.isTraceInProgress())
/* 285 */           ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*     */     
/*     */     }
/*     */   }
/*     */   @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") private static final void CoreIconActionButton(Painter painter, String contentDescription, boolean enabled, boolean focusable, IconButtonStyle style, MutableInteractionSource interactionSource, Modifier modifier, Function0 onClick, Composer $composer, int $changed, int paramInt1) { // Byte code:
/*     */     //   0: aload #8
/*     */     //   2: ldc_w -2120626809
/*     */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   10: astore #8
/*     */     //   12: iload #9
/*     */     //   14: istore #11
/*     */     //   16: iload #10
/*     */     //   18: iconst_1
/*     */     //   19: iand
/*     */     //   20: ifeq -> 33
/*     */     //   23: iload #11
/*     */     //   25: bipush #6
/*     */     //   27: ior
/*     */     //   28: istore #11
/*     */     //   30: goto -> 62
/*     */     //   33: iload #9
/*     */     //   35: bipush #6
/*     */     //   37: iand
/*     */     //   38: ifne -> 62
/*     */     //   41: iload #11
/*     */     //   43: aload #8
/*     */     //   45: aload_0
/*     */     //   46: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   51: ifeq -> 58
/*     */     //   54: iconst_4
/*     */     //   55: goto -> 59
/*     */     //   58: iconst_2
/*     */     //   59: ior
/*     */     //   60: istore #11
/*     */     //   62: iload #10
/*     */     //   64: iconst_2
/*     */     //   65: iand
/*     */     //   66: ifeq -> 79
/*     */     //   69: iload #11
/*     */     //   71: bipush #48
/*     */     //   73: ior
/*     */     //   74: istore #11
/*     */     //   76: goto -> 110
/*     */     //   79: iload #9
/*     */     //   81: bipush #48
/*     */     //   83: iand
/*     */     //   84: ifne -> 110
/*     */     //   87: iload #11
/*     */     //   89: aload #8
/*     */     //   91: aload_1
/*     */     //   92: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   97: ifeq -> 105
/*     */     //   100: bipush #32
/*     */     //   102: goto -> 107
/*     */     //   105: bipush #16
/*     */     //   107: ior
/*     */     //   108: istore #11
/*     */     //   110: iload #10
/*     */     //   112: iconst_4
/*     */     //   113: iand
/*     */     //   114: ifeq -> 128
/*     */     //   117: iload #11
/*     */     //   119: sipush #384
/*     */     //   122: ior
/*     */     //   123: istore #11
/*     */     //   125: goto -> 162
/*     */     //   128: iload #9
/*     */     //   130: sipush #384
/*     */     //   133: iand
/*     */     //   134: ifne -> 162
/*     */     //   137: iload #11
/*     */     //   139: aload #8
/*     */     //   141: iload_2
/*     */     //   142: invokeinterface changed : (Z)Z
/*     */     //   147: ifeq -> 156
/*     */     //   150: sipush #256
/*     */     //   153: goto -> 159
/*     */     //   156: sipush #128
/*     */     //   159: ior
/*     */     //   160: istore #11
/*     */     //   162: iload #10
/*     */     //   164: bipush #8
/*     */     //   166: iand
/*     */     //   167: ifeq -> 181
/*     */     //   170: iload #11
/*     */     //   172: sipush #3072
/*     */     //   175: ior
/*     */     //   176: istore #11
/*     */     //   178: goto -> 215
/*     */     //   181: iload #9
/*     */     //   183: sipush #3072
/*     */     //   186: iand
/*     */     //   187: ifne -> 215
/*     */     //   190: iload #11
/*     */     //   192: aload #8
/*     */     //   194: iload_3
/*     */     //   195: invokeinterface changed : (Z)Z
/*     */     //   200: ifeq -> 209
/*     */     //   203: sipush #2048
/*     */     //   206: goto -> 212
/*     */     //   209: sipush #1024
/*     */     //   212: ior
/*     */     //   213: istore #11
/*     */     //   215: iload #10
/*     */     //   217: bipush #16
/*     */     //   219: iand
/*     */     //   220: ifeq -> 234
/*     */     //   223: iload #11
/*     */     //   225: sipush #24576
/*     */     //   228: ior
/*     */     //   229: istore #11
/*     */     //   231: goto -> 269
/*     */     //   234: iload #9
/*     */     //   236: sipush #24576
/*     */     //   239: iand
/*     */     //   240: ifne -> 269
/*     */     //   243: iload #11
/*     */     //   245: aload #8
/*     */     //   247: aload #4
/*     */     //   249: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   254: ifeq -> 263
/*     */     //   257: sipush #16384
/*     */     //   260: goto -> 266
/*     */     //   263: sipush #8192
/*     */     //   266: ior
/*     */     //   267: istore #11
/*     */     //   269: iload #10
/*     */     //   271: bipush #32
/*     */     //   273: iand
/*     */     //   274: ifeq -> 287
/*     */     //   277: iload #11
/*     */     //   279: ldc 196608
/*     */     //   281: ior
/*     */     //   282: istore #11
/*     */     //   284: goto -> 319
/*     */     //   287: iload #9
/*     */     //   289: ldc 196608
/*     */     //   291: iand
/*     */     //   292: ifne -> 319
/*     */     //   295: iload #11
/*     */     //   297: aload #8
/*     */     //   299: aload #5
/*     */     //   301: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   306: ifeq -> 314
/*     */     //   309: ldc 131072
/*     */     //   311: goto -> 316
/*     */     //   314: ldc 65536
/*     */     //   316: ior
/*     */     //   317: istore #11
/*     */     //   319: iload #10
/*     */     //   321: bipush #64
/*     */     //   323: iand
/*     */     //   324: ifeq -> 337
/*     */     //   327: iload #11
/*     */     //   329: ldc 1572864
/*     */     //   331: ior
/*     */     //   332: istore #11
/*     */     //   334: goto -> 369
/*     */     //   337: iload #9
/*     */     //   339: ldc 1572864
/*     */     //   341: iand
/*     */     //   342: ifne -> 369
/*     */     //   345: iload #11
/*     */     //   347: aload #8
/*     */     //   349: aload #6
/*     */     //   351: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   356: ifeq -> 364
/*     */     //   359: ldc 1048576
/*     */     //   361: goto -> 366
/*     */     //   364: ldc 524288
/*     */     //   366: ior
/*     */     //   367: istore #11
/*     */     //   369: iload #10
/*     */     //   371: sipush #128
/*     */     //   374: iand
/*     */     //   375: ifeq -> 388
/*     */     //   378: iload #11
/*     */     //   380: ldc 12582912
/*     */     //   382: ior
/*     */     //   383: istore #11
/*     */     //   385: goto -> 420
/*     */     //   388: iload #9
/*     */     //   390: ldc 12582912
/*     */     //   392: iand
/*     */     //   393: ifne -> 420
/*     */     //   396: iload #11
/*     */     //   398: aload #8
/*     */     //   400: aload #7
/*     */     //   402: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   407: ifeq -> 415
/*     */     //   410: ldc 8388608
/*     */     //   412: goto -> 417
/*     */     //   415: ldc 4194304
/*     */     //   417: ior
/*     */     //   418: istore #11
/*     */     //   420: iload #11
/*     */     //   422: ldc_w 4793491
/*     */     //   425: iand
/*     */     //   426: ldc_w 4793490
/*     */     //   429: if_icmpne -> 442
/*     */     //   432: aload #8
/*     */     //   434: invokeinterface getSkipping : ()Z
/*     */     //   439: ifne -> 573
/*     */     //   442: iload #10
/*     */     //   444: bipush #64
/*     */     //   446: iand
/*     */     //   447: ifeq -> 458
/*     */     //   450: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   453: checkcast androidx/compose/ui/Modifier
/*     */     //   456: astore #6
/*     */     //   458: invokestatic isTraceInProgress : ()Z
/*     */     //   461: ifeq -> 476
/*     */     //   464: ldc_w -2120626809
/*     */     //   467: iload #11
/*     */     //   469: iconst_m1
/*     */     //   470: ldc_w 'org.jetbrains.jewel.ui.component.CoreIconActionButton (IconActionButton.kt:298)'
/*     */     //   473: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   476: aload #7
/*     */     //   478: aload #6
/*     */     //   480: iload_2
/*     */     //   481: iload_3
/*     */     //   482: aload #4
/*     */     //   484: aload #5
/*     */     //   486: ldc_w -337257520
/*     */     //   489: iconst_1
/*     */     //   490: new org/jetbrains/jewel/ui/component/IconActionButtonKt$CoreIconActionButton$5
/*     */     //   493: dup
/*     */     //   494: aload_0
/*     */     //   495: aload_1
/*     */     //   496: invokespecial <init> : (Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;)V
/*     */     //   499: aload #8
/*     */     //   501: bipush #54
/*     */     //   503: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   506: checkcast kotlin/jvm/functions/Function4
/*     */     //   509: aload #8
/*     */     //   511: ldc 1572864
/*     */     //   513: bipush #14
/*     */     //   515: iload #11
/*     */     //   517: bipush #21
/*     */     //   519: ishr
/*     */     //   520: iand
/*     */     //   521: ior
/*     */     //   522: bipush #112
/*     */     //   524: iload #11
/*     */     //   526: bipush #15
/*     */     //   528: ishr
/*     */     //   529: iand
/*     */     //   530: ior
/*     */     //   531: sipush #896
/*     */     //   534: iload #11
/*     */     //   536: iand
/*     */     //   537: ior
/*     */     //   538: sipush #7168
/*     */     //   541: iload #11
/*     */     //   543: iand
/*     */     //   544: ior
/*     */     //   545: ldc 57344
/*     */     //   547: iload #11
/*     */     //   549: iand
/*     */     //   550: ior
/*     */     //   551: ldc 458752
/*     */     //   553: iload #11
/*     */     //   555: iand
/*     */     //   556: ior
/*     */     //   557: iconst_0
/*     */     //   558: invokestatic IconButton : (Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V
/*     */     //   561: invokestatic isTraceInProgress : ()Z
/*     */     //   564: ifeq -> 580
/*     */     //   567: invokestatic traceEventEnd : ()V
/*     */     //   570: goto -> 580
/*     */     //   573: aload #8
/*     */     //   575: invokeinterface skipToGroupEnd : ()V
/*     */     //   580: aload #8
/*     */     //   582: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   587: dup
/*     */     //   588: ifnull -> 620
/*     */     //   591: aload_0
/*     */     //   592: aload_1
/*     */     //   593: iload_2
/*     */     //   594: iload_3
/*     */     //   595: aload #4
/*     */     //   597: aload #5
/*     */     //   599: aload #6
/*     */     //   601: aload #7
/*     */     //   603: iload #9
/*     */     //   605: iload #10
/*     */     //   607: <illegal opcode> invoke : (Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;II)Lkotlin/jvm/functions/Function2;
/*     */     //   612: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   617: goto -> 621
/*     */     //   620: pop
/*     */     //   621: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #299	-> 0
/*     */     //   #297	-> 450
/*     */     //   #299	-> 473
/*     */     //   #300	-> 476
/*     */     //   #301	-> 573
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   16	606	11	$dirty	I
/*     */     //   0	622	0	painter	Landroidx/compose/ui/graphics/painter/Painter;
/*     */     //   0	622	1	contentDescription	Ljava/lang/String;
/*     */     //   0	622	2	enabled	Z
/*     */     //   0	622	3	focusable	Z
/*     */     //   0	622	4	style	Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   0	622	5	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	622	6	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	622	7	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	622	8	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	622	9	$changed	I }
/*     */   private static final Unit IconActionButton$lambda$1(IconKey $key, String $contentDescription, Function0<Unit> $onClick, Modifier $modifier, boolean $enabled, boolean $focusable, IconButtonStyle $style, ColorFilter $colorFilter, PainterHint $hint, MutableInteractionSource $interactionSource, Class<?> $iconClass, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) { IconActionButton($key, $contentDescription, $onClick, $modifier, $enabled, $focusable, $style, $colorFilter, $hint, $interactionSource, $iconClass, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default); return Unit.INSTANCE; }
/*     */   private static final Unit IconActionButton$lambda$3(IconKey $key, String $contentDescription, Function0<Unit> $onClick, Modifier $modifier, boolean $enabled, boolean $focusable, IconButtonStyle $style, ColorFilter $colorFilter, PainterHint $hint, TooltipStyle $tooltipStyle, Modifier $tooltipModifier, TooltipPlacement $tooltipPlacement, MutableInteractionSource $interactionSource, Class<?> $iconClass, Function2<? super Composer, ? super Integer, Unit> $tooltip, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) { IconActionButton($key, $contentDescription, $onClick, $modifier, $enabled, $focusable, $style, $colorFilter, $hint, $tooltipStyle, $tooltipModifier, $tooltipPlacement, $interactionSource, $iconClass, $tooltip, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default); return Unit.INSTANCE; }
/*     */   private static final Unit IconActionButton$lambda$5(IconKey $key, String $contentDescription, PainterHint[] $hints, Function0<Unit> $onClick, Modifier $modifier, boolean $enabled, boolean $focusable, IconButtonStyle $style, ColorFilter $colorFilter, MutableInteractionSource $interactionSource, Class<?> $iconClass, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) { IconActionButton($key, $contentDescription, $hints, $onClick, $modifier, $enabled, $focusable, $style, $colorFilter, $interactionSource, $iconClass, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default); return Unit.INSTANCE; }
/*     */   private static final Unit IconActionButton$lambda$7(IconKey $key, String $contentDescription, PainterHint[] $hints, Function0<Unit> $onClick, Modifier $modifier, boolean $enabled, boolean $focusable, IconButtonStyle $style, ColorFilter $colorFilter, TooltipStyle $tooltipStyle, Modifier $tooltipModifier, TooltipPlacement $tooltipPlacement, MutableInteractionSource $interactionSource, Class<?> $iconClass, Function2<? super Composer, ? super Integer, Unit> $tooltip, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) { IconActionButton($key, $contentDescription, $hints, $onClick, $modifier, $enabled, $focusable, $style, $colorFilter, $tooltipStyle, $tooltipModifier, $tooltipPlacement, $interactionSource, $iconClass, $tooltip, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default); return Unit.INSTANCE; }
/*     */   private static final Unit BaseIconActionButton$lambda$8(IconKey $key, String $contentDescription, Class<?> $iconClass, boolean $enabled, boolean $focusable, IconButtonStyle $style, MutableInteractionSource $interactionSource, Modifier $modifier, ColorFilter $colorFilter, PainterHint $hint, Function0<Unit> $onClick, int $$changed, int $$changed1, Composer $composer, int $force) { BaseIconActionButton($key, $contentDescription, $iconClass, $enabled, $focusable, $style, $interactionSource, $modifier, $colorFilter, $hint, $onClick, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1)); return Unit.INSTANCE; }
/*     */   private static final Unit CoreIconActionButton$lambda$9(IconKey $key, String $contentDescription, Class<?> $iconClass, boolean $enabled, boolean $focusable, IconButtonStyle $style, MutableInteractionSource $interactionSource, Modifier $modifier, ColorFilter $colorFilter, PainterHint[] $hints, Function0<Unit> $onClick, int $$changed, int $$changed1, Composer $composer, int $force) { CoreIconActionButton($key, $contentDescription, $iconClass, $enabled, $focusable, $style, $interactionSource, $modifier, $colorFilter, $hints, $onClick, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1)); return Unit.INSTANCE; } private static final Unit CoreIconActionButton$lambda$10(IconKey $key, String $contentDescription, Class<?> $iconClass, boolean $enabled, boolean $focusable, IconButtonStyle $style, MutableInteractionSource $interactionSource, Modifier $modifier, ColorFilter $colorFilter, PainterHint $hint, Function0<Unit> $onClick, int $$changed, int $$changed1, Composer $composer, int $force) { CoreIconActionButton($key, $contentDescription, $iconClass, $enabled, $focusable, $style, $interactionSource, $modifier, $colorFilter, $hint, $onClick, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1)); return Unit.INSTANCE; } private static final Unit IconActionButton$lambda$12(Painter $painter, String $contentDescription, Function0<Unit> $onClick, Modifier $modifier, boolean $enabled, boolean $focusable, IconButtonStyle $style, MutableInteractionSource $interactionSource, int $$changed, int $$default, Composer $composer, int $force) { IconActionButton($painter, $contentDescription, $onClick, $modifier, $enabled, $focusable, $style, $interactionSource, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE; } private static final Unit IconActionButton$lambda$14(Painter $painter, String $contentDescription, Function0<Unit> $onClick, Modifier $modifier, boolean $enabled, boolean $focusable, IconButtonStyle $style, TooltipStyle $tooltipStyle, Modifier $tooltipModifier, TooltipPlacement $tooltipPlacement, MutableInteractionSource $interactionSource, Function2<? super Composer, ? super Integer, Unit> $tooltip, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) { IconActionButton($painter, $contentDescription, $onClick, $modifier, $enabled, $focusable, $style, $tooltipStyle, $tooltipModifier, $tooltipPlacement, $interactionSource, $tooltip, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default);
/*     */     return Unit.INSTANCE; } private static final Unit CoreIconActionButton$lambda$15(Painter $painter, String $contentDescription, boolean $enabled, boolean $focusable, IconButtonStyle $style, MutableInteractionSource $interactionSource, Modifier $modifier, Function0<Unit> $onClick, int $$changed, int $$default, Composer $composer, int $force) { CoreIconActionButton($painter, $contentDescription, $enabled, $focusable, $style, $interactionSource, $modifier, $onClick, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE; } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class IconActionButtonKt$CoreIconActionButton$5 implements Function4<BoxScope, IconButtonState, Composer, Integer, Unit>
/*     */   {
/* 300 */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke-KMTpdl8(BoxScope $this$IconButton, long it, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$IconButton, "$this$IconButton"); if (($changed & 0x81) != 128 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-337257520, $changed, -1, "org.jetbrains.jewel.ui.component.CoreIconActionButton.<anonymous> (IconActionButton.kt:299)");  IconKt.Icon-ww6aTOc(this.$painter, this.$contentDescription, (Modifier)null, 0L, $composer, 0, 12); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*     */        }
/*     */ 
/*     */     
/*     */     IconActionButtonKt$CoreIconActionButton$5(Painter $painter, String $contentDescription) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\IconActionButtonKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */