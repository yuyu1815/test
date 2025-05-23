/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.runtime.Stable;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\r\b\007\030\000 \0172\0020\001:\001\017B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003¢\006\004\b\007\020\bR\023\020\002\032\0020\003¢\006\n\n\002\020\013\032\004\b\t\020\nR\023\020\004\032\0020\003¢\006\n\n\002\020\013\032\004\b\f\020\nR\023\020\005\032\0020\003¢\006\n\n\002\020\013\032\004\b\r\020\nR\023\020\006\032\0020\003¢\006\n\n\002\020\013\032\004\b\016\020\n¨\006\020"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/TooltipColors;", "", "background", "Landroidx/compose/ui/graphics/Color;", "content", "border", "shadow", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackground-0d7_KjU", "()J", "J", "getContent-0d7_KjU", "getBorder-0d7_KjU", "getShadow-0d7_KjU", "Companion", "ui"})
/*    */ @Stable
/*    */ public final class TooltipColors
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final long background;
/*    */   private final long content;
/*    */   private final long border;
/*    */   private final long shadow;
/*    */   public static final int $stable;
/*    */   
/*    */   private TooltipColors(long background, long content, long border, long shadow) {
/* 27 */     this.background = background;
/* 28 */     this.content = content;
/* 29 */     this.border = border;
/* 30 */     this.shadow = shadow; } public final long getShadow-0d7_KjU() { return this.shadow; }
/*    */ 
/*    */   
/*    */   public final long getBackground-0d7_KjU() {
/*    */     return this.background;
/*    */   }
/*    */   
/*    */   public final long getContent-0d7_KjU() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   public final long getBorder-0d7_KjU() {
/*    */     return this.border;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TooltipColors))
/*    */       return false; 
/*    */     TooltipColors tooltipColors = (TooltipColors)other;
/*    */     return !Color.equals-impl0(this.background, tooltipColors.background) ? false : (!Color.equals-impl0(this.content, tooltipColors.content) ? false : (!Color.equals-impl0(this.border, tooltipColors.border) ? false : (!!Color.equals-impl0(this.shadow, tooltipColors.shadow))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Color.hashCode-impl(this.background);
/*    */     result = result * 31 + Color.hashCode-impl(this.content);
/*    */     result = result * 31 + Color.hashCode-impl(this.border);
/*    */     return result * 31 + Color.hashCode-impl(this.shadow);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TooltipColors(background=" + Color.toString-impl(this.background) + ", content=" + Color.toString-impl(this.content) + ", border=" + Color.toString-impl(this.border) + ", shadow=" + Color.toString-impl(this.shadow) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/TooltipColors$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\TooltipColors.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */