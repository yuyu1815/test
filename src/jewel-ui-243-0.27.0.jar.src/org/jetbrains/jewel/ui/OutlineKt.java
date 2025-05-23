/*    */ package org.jetbrains.jewel.ui;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.graphics.Shape;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.foundation.OutlineColors;
/*    */ import org.jetbrains.jewel.foundation.Stroke;
/*    */ import org.jetbrains.jewel.foundation.state.FocusableComponentState;
/*    */ import org.jetbrains.jewel.foundation.theme.JewelTheme;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\0002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\003\032A\020\000\032\0020\001*\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\tH\007¢\006\004\b\013\020\f\032A\020\000\032\0020\001*\0020\0012\006\020\r\032\0020\0162\006\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\tH\007¢\006\004\b\013\020\017\032?\020\020\032\0020\001*\0020\0012\006\020\002\032\0020\0032\006\020\020\032\0020\0212\006\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tH\007¢\006\004\b\022\020\023¨\006\024"}, d2 = {"focusOutline", "Landroidx/compose/ui/Modifier;", "state", "Lorg/jetbrains/jewel/foundation/state/FocusableComponentState;", "outlineShape", "Landroidx/compose/ui/graphics/Shape;", "alignment", "Lorg/jetbrains/jewel/foundation/Stroke$Alignment;", "outlineWidth", "Landroidx/compose/ui/unit/Dp;", "expand", "focusOutline-AGcomas", "(Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/state/FocusableComponentState;Landroidx/compose/ui/graphics/Shape;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "showOutline", "", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "outline", "Lorg/jetbrains/jewel/ui/Outline;", "outline-HYR8e34", "(Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/state/FocusableComponentState;Lorg/jetbrains/jewel/ui/Outline;Landroidx/compose/ui/graphics/Shape;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "ui"})
/*    */ @SourceDebugExtension({"SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\norg/jetbrains/jewel/ui/OutlineKt\n+ 2 ModifierExtensions.kt\norg/jetbrains/jewel/ui/util/ModifierExtensionsKt\n*L\n1#1,75:1\n10#2:76\n10#2:77\n*S KotlinDebug\n*F\n+ 1 Outline.kt\norg/jetbrains/jewel/ui/OutlineKt\n*L\n47#1:76\n63#1:77\n*E\n"})
/*    */ public final class OutlineKt
/*    */ {
/*    */   @Composable
/*    */   @NotNull
/*    */   public static final Modifier focusOutline-AGcomas(@NotNull Modifier $this$focusOutline_u2dAGcomas, @NotNull FocusableComponentState state, @NotNull Shape outlineShape, @Nullable Stroke.Alignment alignment, float outlineWidth, float expand, @Nullable Composer $composer, int $changed, int paramInt1) {
/* 32 */     Intrinsics.checkNotNullParameter($this$focusOutline_u2dAGcomas, "$this$focusOutline"); Intrinsics.checkNotNullParameter(state, "state"); Intrinsics.checkNotNullParameter(outlineShape, "outlineShape"); $composer.startReplaceGroup(-1603694363); if ((paramInt1 & 0x4) != 0) alignment = Stroke.Alignment.Outside;  if ((paramInt1 & 0x8) != 0)
/* 33 */       outlineWidth = JewelTheme.Companion.getGlobalMetrics($composer, 6).getOutlineWidth-D9Ej5fM();  if ((paramInt1 & 0x10) != 0)
/* 34 */       expand = Dp.Companion.getUnspecified-D9Ej5fM();  if (ComposerKt.isTraceInProgress())
/* 35 */       ComposerKt.traceEventStart(-1603694363, $changed, -1, "org.jetbrains.jewel.ui.focusOutline (Outline.kt:34)");  Modifier modifier = focusOutline-AGcomas($this$focusOutline_u2dAGcomas, state.isFocused(), outlineShape, alignment, outlineWidth, expand, $composer, 0xE & $changed | 0x380 & $changed | 0x1C00 & $changed | 0xE000 & $changed | 0x70000 & $changed, 0); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return modifier;
/*    */   }
/*    */   
/*    */   @Composable
/*    */   @NotNull
/*    */   public static final Modifier focusOutline-AGcomas(@NotNull Modifier $this$focusOutline_u2dAGcomas, boolean showOutline, @NotNull Shape outlineShape, @Nullable Stroke.Alignment alignment, float outlineWidth, float expand, @Nullable Composer $composer, int $changed, int paramInt1) {
/* 41 */     Intrinsics.checkNotNullParameter($this$focusOutline_u2dAGcomas, "$this$focusOutline"); Intrinsics.checkNotNullParameter(outlineShape, "outlineShape"); $composer.startReplaceGroup(719519783); if ((paramInt1 & 0x4) != 0) alignment = Stroke.Alignment.Outside;  if ((paramInt1 & 0x8) != 0)
/* 42 */       outlineWidth = JewelTheme.Companion.getGlobalMetrics($composer, 6).getOutlineWidth-D9Ej5fM();  if ((paramInt1 & 0x10) != 0)
/* 43 */       expand = Dp.Companion.getUnspecified-D9Ej5fM();  if (ComposerKt.isTraceInProgress())
/* 44 */       ComposerKt.traceEventStart(719519783, $changed, -1, "org.jetbrains.jewel.ui.focusOutline (Outline.kt:43)"); 
/* 45 */     OutlineColors outlineColors = JewelTheme.Companion.getGlobalColors($composer, 6).getOutlines();
/*    */     
/* 47 */     Modifier $this$thenIf$iv = $this$focusOutline_u2dAGcomas; int $i$f$thenIf = 0;
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
/* 76 */     if (showOutline) { Modifier $this$focusOutline_AGcomas_u24lambda_u240 = $this$thenIf$iv; int $i$a$-thenIf-OutlineKt$focusOutline$1 = 0; long outlineColor = outlineColors.getFocused-0d7_KjU(); }  Modifier modifier1 = $this$thenIf$iv; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return modifier1; } @Composable @NotNull public static final Modifier outline-HYR8e34(@NotNull Modifier $this$outline_u2dHYR8e34, @NotNull FocusableComponentState state, @NotNull Outline outline, @NotNull Shape outlineShape, @Nullable Stroke.Alignment alignment, float outlineWidth, @Nullable Composer $composer, int $changed, int paramInt1) { Intrinsics.checkNotNullParameter($this$outline_u2dHYR8e34, "$this$outline"); Intrinsics.checkNotNullParameter(state, "state"); Intrinsics.checkNotNullParameter(outline, "outline"); Intrinsics.checkNotNullParameter(outlineShape, "outlineShape"); $composer.startReplaceGroup(1729317863); if ((paramInt1 & 0x8) != 0) alignment = Stroke.Alignment.Outside;  if ((paramInt1 & 0x10) != 0) outlineWidth = JewelTheme.Companion.getGlobalMetrics($composer, 6).getOutlineWidth-D9Ej5fM();  if (ComposerKt.isTraceInProgress())
/* 77 */       ComposerKt.traceEventStart(1729317863, $changed, -1, "org.jetbrains.jewel.ui.outline (Outline.kt:59)");  OutlineColors outlineColors = JewelTheme.Companion.getGlobalColors($composer, 6).getOutlines(); Modifier modifier2 = $this$outline_u2dHYR8e34; boolean precondition$iv = (outline != Outline.None); int $i$f$thenIf = 0; if (precondition$iv) { Modifier $this$outline_HYR8e34_u24lambda_u241 = modifier2; int $i$a$-thenIf-OutlineKt$outline$1 = 0; if (outline == Outline.Warning) {  } else { throw new IllegalStateException(("State " + state + " says it has an outline, but doesn't really").toString()); }  }  Modifier modifier1 = modifier2;
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */     return modifier1; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\OutlineKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */