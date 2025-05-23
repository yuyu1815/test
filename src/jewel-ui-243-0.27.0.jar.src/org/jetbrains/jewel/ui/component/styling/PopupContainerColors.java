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
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\013\b\007\030\000 \r2\0020\001:\001\rB\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003¢\006\004\b\006\020\007R\023\020\002\032\0020\003¢\006\n\n\002\020\n\032\004\b\b\020\tR\023\020\004\032\0020\003¢\006\n\n\002\020\n\032\004\b\013\020\tR\023\020\005\032\0020\003¢\006\n\n\002\020\n\032\004\b\f\020\t¨\006\016"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/PopupContainerColors;", "", "background", "Landroidx/compose/ui/graphics/Color;", "border", "shadow", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackground-0d7_KjU", "()J", "J", "getBorder-0d7_KjU", "getShadow-0d7_KjU", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class PopupContainerColors
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final long background;
/*    */   private final long border;
/*    */   private final long shadow;
/*    */   public static final int $stable;
/*    */   
/*    */   private PopupContainerColors(long background, long border, long shadow) {
/* 26 */     this.background = background; this.border = border; this.shadow = shadow; } public final long getBackground-0d7_KjU() { return this.background; } public final long getBorder-0d7_KjU() { return this.border; } public final long getShadow-0d7_KjU() { return this.shadow; }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof PopupContainerColors))
/*    */       return false; 
/*    */     PopupContainerColors popupContainerColors = (PopupContainerColors)other;
/*    */     return !Color.equals-impl0(this.background, popupContainerColors.background) ? false : (!Color.equals-impl0(this.border, popupContainerColors.border) ? false : (!!Color.equals-impl0(this.shadow, popupContainerColors.shadow)));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Color.hashCode-impl(this.background);
/*    */     result = result * 31 + Color.hashCode-impl(this.border);
/*    */     return result * 31 + Color.hashCode-impl(this.shadow);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "PopupContainerColors(background=" + Color.toString-impl(this.background) + ", border=" + Color.toString-impl(this.border) + ", shadow=" + Color.toString-impl(this.shadow) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/PopupContainerColors$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\PopupContainerColors.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */