/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B\037\022\n\020\002\032\0060\003j\002`\004\022\n\020\005\032\0060\003j\002`\004¢\006\004\b\006\020\007J\r\020\013\032\0060\003j\002`\004HÆ\003J\r\020\f\032\0060\003j\002`\004HÆ\003J%\020\r\032\0020\0002\f\b\002\020\002\032\0060\003j\002`\0042\f\b\002\020\005\032\0060\003j\002`\004HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\023HÖ\001R\025\020\002\032\0060\003j\002`\004¢\006\b\n\000\032\004\b\b\020\tR\025\020\005\032\0060\003j\002`\004¢\006\b\n\000\032\004\b\n\020\t¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LinesBlock;", "", "fromLine", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/OneBasedIndex;", "untilLine", "<init>", "(II)V", "getFromLine", "()I", "getUntilLine", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "ej-core"})
/*    */ public final class LinesBlock
/*    */ {
/*    */   private final int fromLine;
/*    */   private final int untilLine;
/*    */   
/*    */   public LinesBlock(int fromLine, int untilLine) {
/* 75 */     this.fromLine = fromLine; this.untilLine = untilLine; } public final int getFromLine() { return this.fromLine; } public final int getUntilLine() { return this.untilLine; }
/*    */ 
/*    */   
/*    */   public final int component1() {
/*    */     return this.fromLine;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.untilLine;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LinesBlock copy(int fromLine, int untilLine) {
/*    */     return new LinesBlock(fromLine, untilLine);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "LinesBlock(fromLine=" + this.fromLine + ", untilLine=" + this.untilLine + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Integer.hashCode(this.fromLine);
/*    */     return result * 31 + Integer.hashCode(this.untilLine);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof LinesBlock))
/*    */       return false; 
/*    */     LinesBlock linesBlock = (LinesBlock)other;
/*    */     return (this.fromLine != linesBlock.fromLine) ? false : (!(this.untilLine != linesBlock.untilLine));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\LinesBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */