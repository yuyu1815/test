/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.foundation.GenerateDataFunctions;
/*    */ 
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\t\b\007\030\000 \0132\0020\001:\001\013B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006R\023\020\002\032\0020\003¢\006\n\n\002\020\t\032\004\b\007\020\bR\023\020\004\032\0020\003¢\006\n\n\002\020\t\032\004\b\n\020\b¨\006\f"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/GroupHeaderMetrics;", "", "dividerThickness", "Landroidx/compose/ui/unit/Dp;", "indent", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDividerThickness-D9Ej5fM", "()F", "F", "getIndent-D9Ej5fM", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class GroupHeaderMetrics
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final float dividerThickness;
/*    */   private final float indent;
/*    */   public static final int $stable;
/*    */   
/*    */   private GroupHeaderMetrics(float dividerThickness, float indent) {
/* 24 */     this.dividerThickness = dividerThickness; this.indent = indent; } public final float getDividerThickness-D9Ej5fM() { return this.dividerThickness; } public final float getIndent-D9Ej5fM() { return this.indent; }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof GroupHeaderMetrics))
/*    */       return false; 
/*    */     GroupHeaderMetrics groupHeaderMetrics = (GroupHeaderMetrics)other;
/*    */     return !Dp.equals-impl0(this.dividerThickness, groupHeaderMetrics.dividerThickness) ? false : (!!Dp.equals-impl0(this.indent, groupHeaderMetrics.indent));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Dp.hashCode-impl(this.dividerThickness);
/*    */     return result * 31 + Dp.hashCode-impl(this.indent);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "GroupHeaderMetrics(dividerThickness=" + Dp.toString-impl(this.dividerThickness) + ", indent=" + Dp.toString-impl(this.indent) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/GroupHeaderMetrics$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\GroupHeaderMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */