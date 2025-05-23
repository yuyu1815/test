/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.TooltipPlacement;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.window.PopupPositionProvider;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.foundation.ExperimentalJewelApi;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ExperimentalJewelApi
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\007\030\0002\0020\001B%\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007¢\006\004\b\b\020\tJ\027\020\f\032\0020\r2\006\020\016\032\0020\017H\027¢\006\004\b\020\020\021R\020\020\002\032\0020\003X\004¢\006\004\n\002\020\nR\016\020\004\032\0020\005X\004¢\006\002\n\000R\020\020\006\032\0020\007X\004¢\006\004\n\002\020\013¨\006\022"}, d2 = {"Lorg/jetbrains/jewel/ui/component/FixedCursorPoint;", "Landroidx/compose/foundation/TooltipPlacement;", "offset", "Landroidx/compose/ui/unit/DpOffset;", "alignment", "Landroidx/compose/ui/Alignment;", "windowMargin", "Landroidx/compose/ui/unit/Dp;", "<init>", "(JLandroidx/compose/ui/Alignment;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "F", "positionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "cursorPosition", "Landroidx/compose/ui/geometry/Offset;", "positionProvider-9KIMszo", "(JLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/window/PopupPositionProvider;", "ui"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ @SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\norg/jetbrains/jewel/ui/component/FixedCursorPoint\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,146:1\n149#2:147\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\norg/jetbrains/jewel/ui/component/FixedCursorPoint\n*L\n101#1:147\n*E\n"})
/*     */ public final class FixedCursorPoint
/*     */   implements TooltipPlacement
/*     */ {
/*     */   private final long offset;
/*     */   @NotNull
/*     */   private final Alignment alignment;
/*     */   private final float windowMargin;
/*     */   public static final int $stable;
/*     */   
/*     */   private FixedCursorPoint(long offset, Alignment alignment, float windowMargin) {
/*  99 */     this.offset = offset;
/* 100 */     this.alignment = alignment;
/* 101 */     this.windowMargin = windowMargin;
/*     */   } @Composable
/*     */   @NotNull
/*     */   public PopupPositionProvider positionProvider-9KIMszo(long cursorPosition, @Nullable Composer $composer, int $changed) {
/* 105 */     $composer.startReplaceGroup(-957384388); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-957384388, $changed, -1, "org.jetbrains.jewel.ui.component.FixedCursorPoint.positionProvider (Tooltip.kt:104)");  PopupPositionProvider popupPositionProvider = TooltipKt.rememberPopupPositionProviderAtFixedPosition-7KAyTs4(
/* 106 */         cursorPosition, 
/* 107 */         this.offset, 
/* 108 */         this.alignment, 
/* 109 */         this.windowMargin, $composer, 0xE & $changed, 0);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return popupPositionProvider;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\FixedCursorPoint.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */