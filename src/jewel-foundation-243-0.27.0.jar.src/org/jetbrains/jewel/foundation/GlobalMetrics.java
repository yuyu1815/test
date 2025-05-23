/*    */ package org.jetbrains.jewel.foundation;
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\t\b\007\030\000 \0132\0020\001:\001\013B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006R\023\020\002\032\0020\003¢\006\n\n\002\020\t\032\004\b\007\020\bR\023\020\004\032\0020\003¢\006\n\n\002\020\t\032\004\b\n\020\b¨\006\f"}, d2 = {"Lorg/jetbrains/jewel/foundation/GlobalMetrics;", "", "outlineWidth", "Landroidx/compose/ui/unit/Dp;", "rowHeight", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getOutlineWidth-D9Ej5fM", "()F", "F", "getRowHeight-D9Ej5fM", "Companion", "foundation"})
/*    */ @Immutable
/*    */ public final class GlobalMetrics {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final float outlineWidth;
/*    */   
/* 10 */   private GlobalMetrics(float outlineWidth, float rowHeight) { this.outlineWidth = outlineWidth; this.rowHeight = rowHeight; } private final float rowHeight; public static final int $stable; public final float getOutlineWidth-D9Ej5fM() { return this.outlineWidth; } public final float getRowHeight-D9Ej5fM() { return this.rowHeight; }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof GlobalMetrics))
/*    */       return false; 
/*    */     GlobalMetrics globalMetrics = (GlobalMetrics)other;
/*    */     return !Dp.equals-impl0(this.outlineWidth, globalMetrics.outlineWidth) ? false : (!!Dp.equals-impl0(this.rowHeight, globalMetrics.rowHeight));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Dp.hashCode-impl(this.outlineWidth);
/*    */     return result * 31 + Dp.hashCode-impl(this.rowHeight);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "GlobalMetrics(outlineWidth=" + Dp.toString-impl(this.outlineWidth) + ", rowHeight=" + Dp.toString-impl(this.rowHeight) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/foundation/GlobalMetrics$Companion;", "", "<init>", "()V", "foundation"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\GlobalMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */