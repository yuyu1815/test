/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.layout.PaddingValues;
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.DpOffset;
/*     */ import androidx.compose.ui.unit.IntOffsetKt;
/*     */ import androidx.compose.ui.unit.IntRect;
/*     */ import androidx.compose.ui.unit.IntSize;
/*     */ import androidx.compose.ui.unit.LayoutDirection;
/*     */ import androidx.compose.ui.window.PopupPositionProvider;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\f\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\004\b\n\020\013J/\020\025\032\0020\0262\006\020\027\032\0020\0302\006\020\031\032\0020\0322\006\020\033\032\0020\0342\006\020\035\032\0020\032H\026¢\006\004\b\036\020\037J\020\020 \032\0020\003HÆ\003¢\006\004\b!\020\rJ\t\020\"\032\0020\005HÆ\003J\t\020#\032\0020\007HÆ\003J\t\020$\032\0020\tHÆ\003J8\020%\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tHÆ\001¢\006\004\b&\020'J\023\020(\032\0020)2\b\020*\032\004\030\0010+HÖ\003J\t\020,\032\0020-HÖ\001J\t\020.\032\0020/HÖ\001R\023\020\002\032\0020\003¢\006\n\n\002\020\016\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\017\020\020R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\021\020\022R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\023\020\024¨\0060"}, d2 = {"Lorg/jetbrains/jewel/ui/component/AnchorVerticalMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "contentOffset", "Landroidx/compose/ui/unit/DpOffset;", "contentMargin", "Landroidx/compose/foundation/layout/PaddingValues;", "alignment", "Landroidx/compose/ui/Alignment$Horizontal;", "density", "Landroidx/compose/ui/unit/Density;", "<init>", "(JLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContentOffset-RKDOV3M", "()J", "J", "getContentMargin", "()Landroidx/compose/foundation/layout/PaddingValues;", "getAlignment", "()Landroidx/compose/ui/Alignment$Horizontal;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "calculatePosition", "Landroidx/compose/ui/unit/IntOffset;", "anchorBounds", "Landroidx/compose/ui/unit/IntRect;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "component1", "component1-RKDOV3M", "component2", "component3", "component4", "copy", "copy-uVxBXkw", "(JLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/unit/Density;)Lorg/jetbrains/jewel/ui/component/AnchorVerticalMenuPositionProvider;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui"})
/*     */ @Immutable
/*     */ @SourceDebugExtension({"SMAP\nPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Popup.kt\norg/jetbrains/jewel/ui/component/AnchorVerticalMenuPositionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,193:1\n1#2:194\n*E\n"})
/*     */ public final class AnchorVerticalMenuPositionProvider
/*     */   implements PopupPositionProvider
/*     */ {
/*     */   private final long contentOffset;
/*     */   @NotNull
/*     */   private final PaddingValues contentMargin;
/*     */   @NotNull
/*     */   private final Alignment.Horizontal alignment;
/*     */   @NotNull
/*     */   private final Density density;
/*     */   public static final int $stable;
/*     */   
/*     */   public final long getContentOffset-RKDOV3M() {
/*     */     return this.contentOffset;
/*     */   }
/*     */   
/*     */   private AnchorVerticalMenuPositionProvider(long contentOffset, PaddingValues contentMargin, Alignment.Horizontal alignment, Density density) {
/*  66 */     this.contentOffset = contentOffset;
/*  67 */     this.contentMargin = contentMargin;
/*  68 */     this.alignment = alignment;
/*  69 */     this.density = density; } @NotNull public final Density getDensity() { return this.density; }
/*     */   
/*     */   @NotNull
/*     */   public final PaddingValues getContentMargin() {
/*     */     return this.contentMargin;
/*     */   }
/*     */   
/*     */   public long calculatePosition-llwVHH4(@NotNull IntRect anchorBounds, long windowSize, @NotNull LayoutDirection layoutDirection, long popupContentSize) {
/*  77 */     Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds"); Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); Density $this$calculatePosition_llwVHH4_u24lambda_u240 = this.density;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 194 */     int $i$a$-with-AnchorVerticalMenuPositionProvider$calculatePosition$topMargin$1 = 0; int topMargin = $this$calculatePosition_llwVHH4_u24lambda_u240.roundToPx-0680j_4(this.contentMargin.calculateTopPadding-D9Ej5fM()); Density $this$calculatePosition_llwVHH4_u24lambda_u241 = this.density; int $i$a$-with-AnchorVerticalMenuPositionProvider$calculatePosition$bottomMargin$1 = 0; int bottomMargin = $this$calculatePosition_llwVHH4_u24lambda_u241.roundToPx-0680j_4(this.contentMargin.calculateBottomPadding-D9Ej5fM()); Density $this$calculatePosition_llwVHH4_u24lambda_u242 = this.density; int $i$a$-with-AnchorVerticalMenuPositionProvider$calculatePosition$leftMargin$1 = 0; int leftMargin = $this$calculatePosition_llwVHH4_u24lambda_u242.roundToPx-0680j_4(this.contentMargin.calculateLeftPadding-u2uoSUM(layoutDirection)); Density $this$calculatePosition_llwVHH4_u24lambda_u243 = this.density; int $i$a$-with-AnchorVerticalMenuPositionProvider$calculatePosition$rightMargin$1 = 0; int rightMargin = $this$calculatePosition_llwVHH4_u24lambda_u243.roundToPx-0680j_4(this.contentMargin.calculateRightPadding-u2uoSUM(layoutDirection)); IntRect windowSpaceBounds = new IntRect(leftMargin, topMargin, IntSize.getWidth-impl(windowSize) - rightMargin, IntSize.getHeight-impl(windowSize) - bottomMargin); Density $this$calculatePosition_llwVHH4_u24lambda_u244 = this.density; int $i$a$-with-AnchorVerticalMenuPositionProvider$calculatePosition$contentOffsetX$1 = 0; int contentOffsetX = $this$calculatePosition_llwVHH4_u24lambda_u244.roundToPx-0680j_4(DpOffset.getX-D9Ej5fM(this.contentOffset)) * ((layoutDirection == LayoutDirection.Ltr) ? 1 : -1); Density $this$calculatePosition_llwVHH4_u24lambda_u245 = this.density; int $i$a$-with-AnchorVerticalMenuPositionProvider$calculatePosition$contentOffsetY$1 = 0;
/*     */     int contentOffsetY = $this$calculatePosition_llwVHH4_u24lambda_u245.roundToPx-0680j_4(DpOffset.getY-D9Ej5fM(this.contentOffset));
/*     */     int x = anchorBounds.getLeft() + this.alignment.align(IntSize.getWidth-impl(popupContentSize), anchorBounds.getWidth(), layoutDirection) + contentOffsetX;
/*     */     int aboveSpacing = anchorBounds.getTop() - contentOffsetY - topMargin;
/*     */     int belowSpacing = IntSize.getHeight-impl(windowSize) - anchorBounds.getBottom() - contentOffsetY - bottomMargin;
/*     */     int y = (belowSpacing > IntSize.getHeight-impl(popupContentSize) || belowSpacing >= aboveSpacing) ? (anchorBounds.getBottom() + contentOffsetY) : (anchorBounds.getTop() - contentOffsetY - IntSize.getHeight-impl(popupContentSize));
/*     */     IntRect popupBounds = PopupKt.constrainedIn(new IntRect(x, y, x + IntSize.getWidth-impl(popupContentSize), y + IntSize.getHeight-impl(popupContentSize)), windowSpaceBounds);
/*     */     return IntOffsetKt.IntOffset(popupBounds.getLeft(), popupBounds.getTop());
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Alignment.Horizontal getAlignment() {
/*     */     return this.alignment;
/*     */   }
/*     */   
/*     */   public final long component1-RKDOV3M() {
/*     */     return this.contentOffset;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PaddingValues component2() {
/*     */     return this.contentMargin;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Alignment.Horizontal component3() {
/*     */     return this.alignment;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Density component4() {
/*     */     return this.density;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final AnchorVerticalMenuPositionProvider copy-uVxBXkw(long contentOffset, @NotNull PaddingValues contentMargin, @NotNull Alignment.Horizontal alignment, @NotNull Density density) {
/*     */     Intrinsics.checkNotNullParameter(contentMargin, "contentMargin");
/*     */     Intrinsics.checkNotNullParameter(alignment, "alignment");
/*     */     Intrinsics.checkNotNullParameter(density, "density");
/*     */     return new AnchorVerticalMenuPositionProvider(contentOffset, contentMargin, alignment, density, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "AnchorVerticalMenuPositionProvider(contentOffset=" + DpOffset.toString-impl(this.contentOffset) + ", contentMargin=" + this.contentMargin + ", alignment=" + this.alignment + ", density=" + this.density + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = DpOffset.hashCode-impl(this.contentOffset);
/*     */     result = result * 31 + this.contentMargin.hashCode();
/*     */     result = result * 31 + this.alignment.hashCode();
/*     */     return result * 31 + this.density.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof AnchorVerticalMenuPositionProvider))
/*     */       return false; 
/*     */     AnchorVerticalMenuPositionProvider anchorVerticalMenuPositionProvider = (AnchorVerticalMenuPositionProvider)other;
/*     */     return !DpOffset.equals-impl0(this.contentOffset, anchorVerticalMenuPositionProvider.contentOffset) ? false : (!Intrinsics.areEqual(this.contentMargin, anchorVerticalMenuPositionProvider.contentMargin) ? false : (!Intrinsics.areEqual(this.alignment, anchorVerticalMenuPositionProvider.alignment) ? false : (!!Intrinsics.areEqual(this.density, anchorVerticalMenuPositionProvider.density))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\AnchorVerticalMenuPositionProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */