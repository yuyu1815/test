/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.TextWithHighlightings;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\r\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005¢\006\004\b\007\020\bJ\t\020\016\032\0020\003HÆ\003J\t\020\017\032\0020\005HÆ\003J\t\020\020\032\0020\005HÆ\003J'\020\021\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\005HÆ\001J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\001HÖ\003J\t\020\025\032\0020\005HÖ\001J\t\020\026\032\0020\027HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\013\020\fR\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\r\020\f¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/ShellPromptRenderer$ExpandedPromptInfo;", "", "content", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithHighlightings;", "cursorX", "", "cursorY", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithHighlightings;II)V", "getContent", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithHighlightings;", "getCursorX", "()I", "getCursorY", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "ej-core"})
/*     */ final class ExpandedPromptInfo
/*     */ {
/*     */   @NotNull
/*     */   private final TextWithHighlightings content;
/*     */   private final int cursorX;
/*     */   private final int cursorY;
/*     */   
/*     */   public ExpandedPromptInfo(@NotNull TextWithHighlightings content, int cursorX, int cursorY) {
/* 172 */     this.content = content; this.cursorX = cursorX; this.cursorY = cursorY; } @NotNull public final TextWithHighlightings getContent() { return this.content; } public final int getCursorX() { return this.cursorX; } public final int getCursorY() { return this.cursorY; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final TextWithHighlightings component1() {
/*     */     return this.content;
/*     */   }
/*     */   
/*     */   public final int component2() {
/*     */     return this.cursorX;
/*     */   }
/*     */   
/*     */   public final int component3() {
/*     */     return this.cursorY;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ExpandedPromptInfo copy(@NotNull TextWithHighlightings content, int cursorX, int cursorY) {
/*     */     Intrinsics.checkNotNullParameter(content, "content");
/*     */     return new ExpandedPromptInfo(content, cursorX, cursorY);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "ExpandedPromptInfo(content=" + this.content + ", cursorX=" + this.cursorX + ", cursorY=" + this.cursorY + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.content.hashCode();
/*     */     result = result * 31 + Integer.hashCode(this.cursorX);
/*     */     return result * 31 + Integer.hashCode(this.cursorY);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof ExpandedPromptInfo))
/*     */       return false; 
/*     */     ExpandedPromptInfo expandedPromptInfo = (ExpandedPromptInfo)other;
/*     */     return !Intrinsics.areEqual(this.content, expandedPromptInfo.content) ? false : ((this.cursorX != expandedPromptInfo.cursorX) ? false : (!(this.cursorY != expandedPromptInfo.cursorY)));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\ShellPromptRenderer$ExpandedPromptInfo.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */