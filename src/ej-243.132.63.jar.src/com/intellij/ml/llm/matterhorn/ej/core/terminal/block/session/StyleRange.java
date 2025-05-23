/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session;
/*    */ 
/*    */ import com.jediterm.terminal.TextStyle;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006¢\006\004\b\007\020\bJ\t\020\016\032\0020\003HÆ\003J\t\020\017\032\0020\003HÆ\003J\t\020\020\032\0020\006HÆ\003J'\020\021\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\006HÆ\001J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\001HÖ\003J\t\020\025\032\0020\003HÖ\001J\t\020\026\032\0020\027HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\013\020\nR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\f\020\r¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StyleRange;", "", "startOffset", "", "endOffset", "style", "Lcom/jediterm/terminal/TextStyle;", "<init>", "(IILcom/jediterm/terminal/TextStyle;)V", "getStartOffset", "()I", "getEndOffset", "getStyle", "()Lcom/jediterm/terminal/TextStyle;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "ej-core"})
/*    */ public final class StyleRange
/*    */ {
/*    */   private final int startOffset;
/*    */   private final int endOffset;
/*    */   @NotNull
/*    */   private final TextStyle style;
/*    */   
/*    */   public StyleRange(int startOffset, int endOffset, @NotNull TextStyle style) {
/* 99 */     this.startOffset = startOffset; this.endOffset = endOffset; this.style = style; } public final int getStartOffset() { return this.startOffset; } public final int getEndOffset() { return this.endOffset; } @NotNull public final TextStyle getStyle() { return this.style; }
/*    */ 
/*    */   
/*    */   public final int component1() {
/*    */     return this.startOffset;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.endOffset;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TextStyle component3() {
/*    */     return this.style;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final StyleRange copy(int startOffset, int endOffset, @NotNull TextStyle style) {
/*    */     Intrinsics.checkNotNullParameter(style, "style");
/*    */     return new StyleRange(startOffset, endOffset, style);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "StyleRange(startOffset=" + this.startOffset + ", endOffset=" + this.endOffset + ", style=" + this.style + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Integer.hashCode(this.startOffset);
/*    */     result = result * 31 + Integer.hashCode(this.endOffset);
/*    */     return result * 31 + this.style.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof StyleRange))
/*    */       return false; 
/*    */     StyleRange styleRange = (StyleRange)other;
/*    */     return (this.startOffset != styleRange.startOffset) ? false : ((this.endOffset != styleRange.endOffset) ? false : (!!Intrinsics.areEqual(this.style, styleRange.style)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\StyleRange.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */