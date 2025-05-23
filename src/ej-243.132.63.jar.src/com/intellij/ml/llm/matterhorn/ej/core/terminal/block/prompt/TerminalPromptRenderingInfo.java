/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\002\b\020\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B7\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005\022\b\b\002\020\007\032\0020\003\022\016\b\002\020\b\032\b\022\004\022\0020\0060\005¢\006\004\b\t\020\nJ\t\020\021\032\0020\003HÆ\003J\017\020\022\032\b\022\004\022\0020\0060\005HÆ\003J\t\020\023\032\0020\003HÆ\003J\017\020\024\032\b\022\004\022\0020\0060\005HÆ\003J=\020\025\032\0020\0002\b\b\002\020\002\032\0020\0032\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\b\b\002\020\007\032\0020\0032\016\b\002\020\b\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\001HÖ\003J\t\020\031\032\0020\032HÖ\001J\t\020\033\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\r\020\016R\021\020\007\032\0020\003¢\006\b\n\000\032\004\b\017\020\fR\027\020\b\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\020\020\016¨\006\034"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderingInfo;", "", "text", "", "highlightings", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo;", "rightText", "rightHighlightings", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getText", "()Ljava/lang/String;", "getHighlightings", "()Ljava/util/List;", "getRightText", "getRightHighlightings", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ej-core"})
/*    */ @Internal
/*    */ public final class TerminalPromptRenderingInfo {
/*    */   @NotNull
/*    */   private final String text;
/*    */   @NotNull
/*    */   private final List<HighlightingInfo> highlightings;
/*    */   
/* 10 */   public TerminalPromptRenderingInfo(@NotNull String text, @NotNull List<HighlightingInfo> highlightings, @NotNull String rightText, @NotNull List<HighlightingInfo> rightHighlightings) { this.text = text;
/* 11 */     this.highlightings = highlightings;
/* 12 */     this.rightText = rightText;
/* 13 */     this.rightHighlightings = rightHighlightings; } @NotNull private final String rightText; @NotNull private final List<HighlightingInfo> rightHighlightings; @NotNull public final String getText() { return this.text; } @NotNull public final List<HighlightingInfo> getRightHighlightings() { return this.rightHighlightings; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final List<HighlightingInfo> getHighlightings() {
/*    */     return this.highlightings;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getRightText() {
/*    */     return this.rightText;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<HighlightingInfo> component2() {
/*    */     return this.highlightings;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.rightText;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<HighlightingInfo> component4() {
/*    */     return this.rightHighlightings;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TerminalPromptRenderingInfo copy(@NotNull String text, @NotNull List<HighlightingInfo> highlightings, @NotNull String rightText, @NotNull List<HighlightingInfo> rightHighlightings) {
/*    */     Intrinsics.checkNotNullParameter(text, "text");
/*    */     Intrinsics.checkNotNullParameter(highlightings, "highlightings");
/*    */     Intrinsics.checkNotNullParameter(rightText, "rightText");
/*    */     Intrinsics.checkNotNullParameter(rightHighlightings, "rightHighlightings");
/*    */     return new TerminalPromptRenderingInfo(text, highlightings, rightText, rightHighlightings);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TerminalPromptRenderingInfo(text=" + this.text + ", highlightings=" + this.highlightings + ", rightText=" + this.rightText + ", rightHighlightings=" + this.rightHighlightings + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.text.hashCode();
/*    */     result = result * 31 + this.highlightings.hashCode();
/*    */     result = result * 31 + this.rightText.hashCode();
/*    */     return result * 31 + this.rightHighlightings.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TerminalPromptRenderingInfo))
/*    */       return false; 
/*    */     TerminalPromptRenderingInfo terminalPromptRenderingInfo = (TerminalPromptRenderingInfo)other;
/*    */     return !Intrinsics.areEqual(this.text, terminalPromptRenderingInfo.text) ? false : (!Intrinsics.areEqual(this.highlightings, terminalPromptRenderingInfo.highlightings) ? false : (!Intrinsics.areEqual(this.rightText, terminalPromptRenderingInfo.rightText) ? false : (!!Intrinsics.areEqual(this.rightHighlightings, terminalPromptRenderingInfo.rightHighlightings))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\TerminalPromptRenderingInfo.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */