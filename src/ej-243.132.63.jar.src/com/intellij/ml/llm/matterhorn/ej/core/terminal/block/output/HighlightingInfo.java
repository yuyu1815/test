/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.ApiStatus.Internal;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\016\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006¢\006\004\b\007\020\bJ\t\020\020\032\0020\003HÆ\003J\t\020\021\032\0020\003HÆ\003J\t\020\022\032\0020\006HÆ\003J'\020\023\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\006HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\001HÖ\003J\t\020\027\032\0020\003HÖ\001J\t\020\030\032\0020\031HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\013\020\nR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\f\020\rR\021\020\016\032\0020\0038F¢\006\006\032\004\b\017\020\n¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo;", "", "startOffset", "", "endOffset", "textAttributesProvider", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;", "<init>", "(IILcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;)V", "getStartOffset", "()I", "getEndOffset", "getTextAttributesProvider", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;", "length", "getLength", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "ej-core"})
/*    */ @Internal
/*    */ public final class HighlightingInfo {
/*    */   private final int startOffset;
/*    */   private final int endOffset;
/*    */   @NotNull
/*    */   private final TextAttributesProvider textAttributesProvider;
/*    */   
/*    */   public HighlightingInfo(int startOffset, int endOffset, @NotNull TextAttributesProvider textAttributesProvider) {
/* 18 */     this.startOffset = startOffset; this.endOffset = endOffset; this.textAttributesProvider = textAttributesProvider;
/*    */     
/* 20 */     if (!((this.startOffset <= this.endOffset) ? 1 : 0)) { String str = "Check failed."; throw new IllegalStateException(str.toString()); }
/*    */   
/*    */   } public final int getLength() {
/* 23 */     return this.endOffset - this.startOffset;
/*    */   }
/*    */   
/*    */   public final int getStartOffset() {
/*    */     return this.startOffset;
/*    */   }
/*    */   
/*    */   public final int getEndOffset() {
/*    */     return this.endOffset;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TextAttributesProvider getTextAttributesProvider() {
/*    */     return this.textAttributesProvider;
/*    */   }
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
/*    */   public final TextAttributesProvider component3() {
/*    */     return this.textAttributesProvider;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final HighlightingInfo copy(int startOffset, int endOffset, @NotNull TextAttributesProvider textAttributesProvider) {
/*    */     Intrinsics.checkNotNullParameter(textAttributesProvider, "textAttributesProvider");
/*    */     return new HighlightingInfo(startOffset, endOffset, textAttributesProvider);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "HighlightingInfo(startOffset=" + this.startOffset + ", endOffset=" + this.endOffset + ", textAttributesProvider=" + this.textAttributesProvider + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Integer.hashCode(this.startOffset);
/*    */     result = result * 31 + Integer.hashCode(this.endOffset);
/*    */     return result * 31 + this.textAttributesProvider.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof HighlightingInfo))
/*    */       return false; 
/*    */     HighlightingInfo highlightingInfo = (HighlightingInfo)other;
/*    */     return (this.startOffset != highlightingInfo.startOffset) ? false : ((this.endOffset != highlightingInfo.endOffset) ? false : (!!Intrinsics.areEqual(this.textAttributesProvider, highlightingInfo.textAttributesProvider)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\HighlightingInfo.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */