/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\030\002\n\002\b\023\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B9\022\n\020\002\032\0060\003j\002`\004\022\006\020\005\032\0020\003\022\b\b\002\020\006\032\0020\003\022\b\b\002\020\007\032\0020\003\022\b\b\002\020\b\032\0020\003¢\006\004\b\t\020\nJ\r\020\021\032\0060\003j\002`\004HÆ\003J\t\020\022\032\0020\003HÆ\003J\t\020\023\032\0020\003HÆ\003J\t\020\024\032\0020\003HÆ\003J\t\020\025\032\0020\003HÆ\003J?\020\026\032\0020\0002\f\b\002\020\002\032\0060\003j\002`\0042\b\b\002\020\005\032\0020\0032\b\b\002\020\006\032\0020\0032\b\b\002\020\007\032\0020\0032\b\b\002\020\b\032\0020\003HÆ\001J\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\001HÖ\003J\t\020\032\032\0020\003HÖ\001J\t\020\033\032\0020\034HÖ\001R\025\020\002\032\0060\003j\002`\004¢\006\b\n\000\032\004\b\013\020\fR\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\r\020\fR\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\016\020\fR\021\020\007\032\0020\003¢\006\b\n\000\032\004\b\017\020\fR\021\020\b\032\0020\003¢\006\b\n\000\032\004\b\020\020\f¨\006\035"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/PrintBlock;", "", "startLine", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/OneBasedIndex;", "window", "topMargin", "bottomMargin", "minWindow", "<init>", "(IIIII)V", "getStartLine", "()I", "getWindow", "getTopMargin", "getBottomMargin", "getMinWindow", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "ej-core"})
/*    */ public final class PrintBlock
/*    */ {
/*    */   private final int startLine;
/*    */   private final int window;
/*    */   private final int topMargin;
/*    */   private final int bottomMargin;
/*    */   private final int minWindow;
/*    */   
/*    */   public PrintBlock(int startLine, int window, int topMargin, int bottomMargin, int minWindow) {
/* 68 */     this.startLine = startLine;
/* 69 */     this.window = window;
/* 70 */     this.topMargin = topMargin;
/* 71 */     this.bottomMargin = bottomMargin;
/* 72 */     this.minWindow = minWindow; } public final int getMinWindow() { return this.minWindow; }
/*    */ 
/*    */   
/*    */   public final int getStartLine() {
/*    */     return this.startLine;
/*    */   }
/*    */   
/*    */   public final int getWindow() {
/*    */     return this.window;
/*    */   }
/*    */   
/*    */   public final int getTopMargin() {
/*    */     return this.topMargin;
/*    */   }
/*    */   
/*    */   public final int getBottomMargin() {
/*    */     return this.bottomMargin;
/*    */   }
/*    */   
/*    */   public final int component1() {
/*    */     return this.startLine;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.window;
/*    */   }
/*    */   
/*    */   public final int component3() {
/*    */     return this.topMargin;
/*    */   }
/*    */   
/*    */   public final int component4() {
/*    */     return this.bottomMargin;
/*    */   }
/*    */   
/*    */   public final int component5() {
/*    */     return this.minWindow;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final PrintBlock copy(int startLine, int window, int topMargin, int bottomMargin, int minWindow) {
/*    */     return new PrintBlock(startLine, window, topMargin, bottomMargin, minWindow);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "PrintBlock(startLine=" + this.startLine + ", window=" + this.window + ", topMargin=" + this.topMargin + ", bottomMargin=" + this.bottomMargin + ", minWindow=" + this.minWindow + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Integer.hashCode(this.startLine);
/*    */     result = result * 31 + Integer.hashCode(this.window);
/*    */     result = result * 31 + Integer.hashCode(this.topMargin);
/*    */     result = result * 31 + Integer.hashCode(this.bottomMargin);
/*    */     return result * 31 + Integer.hashCode(this.minWindow);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof PrintBlock))
/*    */       return false; 
/*    */     PrintBlock printBlock = (PrintBlock)other;
/*    */     return (this.startLine != printBlock.startLine) ? false : ((this.window != printBlock.window) ? false : ((this.topMargin != printBlock.topMargin) ? false : ((this.bottomMargin != printBlock.bottomMargin) ? false : (!(this.minWindow != printBlock.minWindow)))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\PrintBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */