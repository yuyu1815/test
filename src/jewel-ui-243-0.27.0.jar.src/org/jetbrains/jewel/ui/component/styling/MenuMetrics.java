/*     */ package org.jetbrains.jewel.ui.component.styling;
/*     */ 
/*     */ import androidx.compose.foundation.layout.PaddingValues;
/*     */ import androidx.compose.foundation.shape.CornerSize;
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import androidx.compose.ui.unit.DpOffset;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.foundation.GenerateDataFunctions;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @GenerateDataFunctions
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\024\b\007\030\000 \"2\0020\001:\001\"BG\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n\022\006\020\013\032\0020\n\022\006\020\f\032\0020\r\022\006\020\016\032\0020\017¢\006\004\b\020\020\021R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\022\020\023R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\024\020\025R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\026\020\025R\023\020\007\032\0020\b¢\006\n\n\002\020\031\032\004\b\027\020\030R\023\020\t\032\0020\n¢\006\n\n\002\020\034\032\004\b\032\020\033R\023\020\013\032\0020\n¢\006\n\n\002\020\034\032\004\b\035\020\033R\021\020\f\032\0020\r¢\006\b\n\000\032\004\b\036\020\037R\021\020\016\032\0020\017¢\006\b\n\000\032\004\b \020!¨\006#"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/MenuMetrics;", "", "cornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "menuMargin", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "offset", "Landroidx/compose/ui/unit/DpOffset;", "shadowSize", "Landroidx/compose/ui/unit/Dp;", "borderWidth", "itemMetrics", "Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;", "submenuMetrics", "Lorg/jetbrains/jewel/ui/component/styling/SubmenuMetrics;", "<init>", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/PaddingValues;JFFLorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;Lorg/jetbrains/jewel/ui/component/styling/SubmenuMetrics;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCornerSize", "()Landroidx/compose/foundation/shape/CornerSize;", "getMenuMargin", "()Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "getOffset-RKDOV3M", "()J", "J", "getShadowSize-D9Ej5fM", "()F", "F", "getBorderWidth-D9Ej5fM", "getItemMetrics", "()Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;", "getSubmenuMetrics", "()Lorg/jetbrains/jewel/ui/component/styling/SubmenuMetrics;", "Companion", "ui"})
/*     */ @Stable
/*     */ public final class MenuMetrics
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final CornerSize cornerSize;
/*     */   @NotNull
/*     */   private final PaddingValues menuMargin;
/*     */   @NotNull
/*     */   private final PaddingValues contentPadding;
/*     */   private final long offset;
/*     */   private final float shadowSize;
/*     */   private final float borderWidth;
/*     */   @NotNull
/*     */   private final MenuItemMetrics itemMetrics;
/*     */   @NotNull
/*     */   private final SubmenuMetrics submenuMetrics;
/*     */   public static final int $stable;
/*     */   
/*     */   private MenuMetrics(CornerSize cornerSize, PaddingValues menuMargin, PaddingValues contentPadding, long offset, float shadowSize, float borderWidth, MenuItemMetrics itemMetrics, SubmenuMetrics submenuMetrics) {
/* 124 */     this.cornerSize = cornerSize;
/* 125 */     this.menuMargin = menuMargin;
/* 126 */     this.contentPadding = contentPadding;
/* 127 */     this.offset = offset;
/* 128 */     this.shadowSize = shadowSize;
/* 129 */     this.borderWidth = borderWidth;
/* 130 */     this.itemMetrics = itemMetrics;
/* 131 */     this.submenuMetrics = submenuMetrics; } @NotNull public final SubmenuMetrics getSubmenuMetrics() { return this.submenuMetrics; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final CornerSize getCornerSize() {
/*     */     return this.cornerSize;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PaddingValues getMenuMargin() {
/*     */     return this.menuMargin;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PaddingValues getContentPadding() {
/*     */     return this.contentPadding;
/*     */   }
/*     */   
/*     */   public final long getOffset-RKDOV3M() {
/*     */     return this.offset;
/*     */   }
/*     */   
/*     */   public final float getShadowSize-D9Ej5fM() {
/*     */     return this.shadowSize;
/*     */   }
/*     */   
/*     */   public final float getBorderWidth-D9Ej5fM() {
/*     */     return this.borderWidth;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final MenuItemMetrics getItemMetrics() {
/*     */     return this.itemMetrics;
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof MenuMetrics))
/*     */       return false; 
/*     */     MenuMetrics menuMetrics = (MenuMetrics)other;
/*     */     return !Intrinsics.areEqual(this.cornerSize, menuMetrics.cornerSize) ? false : (!Intrinsics.areEqual(this.menuMargin, menuMetrics.menuMargin) ? false : (!Intrinsics.areEqual(this.contentPadding, menuMetrics.contentPadding) ? false : (!DpOffset.equals-impl0(this.offset, menuMetrics.offset) ? false : (!Dp.equals-impl0(this.shadowSize, menuMetrics.shadowSize) ? false : (!Dp.equals-impl0(this.borderWidth, menuMetrics.borderWidth) ? false : (!Intrinsics.areEqual(this.itemMetrics, menuMetrics.itemMetrics) ? false : (!!Intrinsics.areEqual(this.submenuMetrics, menuMetrics.submenuMetrics))))))));
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.cornerSize.hashCode();
/*     */     result = result * 31 + this.menuMargin.hashCode();
/*     */     result = result * 31 + this.contentPadding.hashCode();
/*     */     result = result * 31 + DpOffset.hashCode-impl(this.offset);
/*     */     result = result * 31 + Dp.hashCode-impl(this.shadowSize);
/*     */     result = result * 31 + Dp.hashCode-impl(this.borderWidth);
/*     */     result = result * 31 + this.itemMetrics.hashCode();
/*     */     return result * 31 + this.submenuMetrics.hashCode();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "MenuMetrics(cornerSize=" + this.cornerSize + ", menuMargin=" + this.menuMargin + ", contentPadding=" + this.contentPadding + ", offset=" + DpOffset.toString-impl(this.offset) + ", shadowSize=" + Dp.toString-impl(this.shadowSize) + ", borderWidth=" + Dp.toString-impl(this.borderWidth) + ", itemMetrics=" + this.itemMetrics + ", submenuMetrics=" + this.submenuMetrics + ")";
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/MenuMetrics$Companion;", "", "<init>", "()V", "ui"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\MenuMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */