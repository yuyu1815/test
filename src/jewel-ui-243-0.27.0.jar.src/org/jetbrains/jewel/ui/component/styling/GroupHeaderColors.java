/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\007\b\007\030\000 \t2\0020\001:\001\tB\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\023\020\002\032\0020\003¢\006\n\n\002\020\b\032\004\b\006\020\007¨\006\n"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/GroupHeaderColors;", "", "divider", "Landroidx/compose/ui/graphics/Color;", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDivider-0d7_KjU", "()J", "J", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class GroupHeaderColors {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final long divider;
/*    */   public static final int $stable;
/*    */   
/* 18 */   private GroupHeaderColors(long divider) { this.divider = divider; } public final long getDivider-0d7_KjU() { return this.divider; }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof GroupHeaderColors))
/*    */       return false; 
/*    */     GroupHeaderColors groupHeaderColors = (GroupHeaderColors)other;
/*    */     return !!Color.equals-impl0(this.divider, groupHeaderColors.divider);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return Color.hashCode-impl(this.divider);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "GroupHeaderColors(divider=" + Color.toString-impl(this.divider) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/GroupHeaderColors$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\GroupHeaderColors.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */