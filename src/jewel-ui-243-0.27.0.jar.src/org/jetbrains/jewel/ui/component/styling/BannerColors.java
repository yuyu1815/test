/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.foundation.GenerateDataFunctions;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\t\b\007\030\000 \0132\0020\001:\001\013B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006R\023\020\002\032\0020\003¢\006\n\n\002\020\t\032\004\b\007\020\bR\023\020\004\032\0020\003¢\006\n\n\002\020\t\032\004\b\n\020\b¨\006\f"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/BannerColors;", "", "background", "Landroidx/compose/ui/graphics/Color;", "border", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackground-0d7_KjU", "()J", "J", "getBorder-0d7_KjU", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class BannerColors
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final long background;
/*    */   private final long border;
/*    */   public static final int $stable;
/*    */   
/*    */   private BannerColors(long background, long border) {
/* 30 */     this.background = background; this.border = border; } public final long getBackground-0d7_KjU() { return this.background; } public final long getBorder-0d7_KjU() { return this.border; }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof BannerColors))
/*    */       return false; 
/*    */     BannerColors bannerColors = (BannerColors)other;
/*    */     return !Color.equals-impl0(this.background, bannerColors.background) ? false : (!!Color.equals-impl0(this.border, bannerColors.border));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Color.hashCode-impl(this.background);
/*    */     return result * 31 + Color.hashCode-impl(this.border);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "BannerColors(background=" + Color.toString-impl(this.background) + ", border=" + Color.toString-impl(this.border) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/BannerColors$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\BannerColors.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */