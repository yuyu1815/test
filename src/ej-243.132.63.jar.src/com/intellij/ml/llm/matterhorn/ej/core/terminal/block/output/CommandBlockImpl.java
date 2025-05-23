/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\020\b\n\002\b\026\n\002\020\013\n\002\b\t\n\002\020\000\n\002\b\003\b\b\030\0002\0020\001B5\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\b\020\005\032\004\030\0010\003\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\004\b\n\020\013J\013\020\"\032\004\030\0010\003HÆ\003J\013\020#\032\004\030\0010\003HÆ\003J\013\020$\032\004\030\0010\003HÆ\003J\t\020%\032\0020\007HÆ\003J\t\020&\032\0020\tHÂ\003JA\020'\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\n\b\002\020\004\032\004\030\0010\0032\n\b\002\020\005\032\004\030\0010\0032\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tHÆ\001J\023\020(\032\0020 2\b\020)\032\004\030\0010*HÖ\003J\t\020+\032\0020\tHÖ\001J\t\020,\032\0020\003HÖ\001R\026\020\002\032\004\030\0010\003X\004¢\006\b\n\000\032\004\b\f\020\rR\026\020\004\032\004\030\0010\003X\004¢\006\b\n\000\032\004\b\016\020\rR\026\020\005\032\004\030\0010\003X\004¢\006\b\n\000\032\004\b\017\020\rR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\020\020\021R\016\020\b\032\0020\tX\004¢\006\002\n\000R\024\020\022\032\0020\t8VX\004¢\006\006\032\004\b\023\020\024R\024\020\025\032\0020\t8VX\004¢\006\006\032\004\b\026\020\024R\024\020\027\032\0020\t8VX\004¢\006\006\032\004\b\030\020\024R\024\020\031\032\0020\t8VX\004¢\006\006\032\004\b\032\020\024R\032\020\033\032\0020\tX\016¢\006\016\n\000\032\004\b\034\020\024\"\004\b\035\020\036R\024\020\037\032\0020 8VX\004¢\006\006\032\004\b\037\020!¨\006-"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlockImpl;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;", "command", "", "prompt", "rightPrompt", "range", "Lcom/intellij/openapi/editor/RangeMarker;", "commandAndRightPromptLength", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/openapi/editor/RangeMarker;I)V", "getCommand", "()Ljava/lang/String;", "getPrompt", "getRightPrompt", "getRange", "()Lcom/intellij/openapi/editor/RangeMarker;", "startOffset", "getStartOffset", "()I", "endOffset", "getEndOffset", "commandStartOffset", "getCommandStartOffset", "outputStartOffset", "getOutputStartOffset", "trimmedLinesCount", "getTrimmedLinesCount", "setTrimmedLinesCount", "(I)V", "isFinalized", "", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "ej-core"})
/*    */ public final class CommandBlockImpl implements CommandBlock { @Nullable
/*    */   private final String command; @Nullable
/*    */   private final String prompt; @Nullable
/*    */   private final String rightPrompt; @NotNull
/*    */   private final RangeMarker range; private final int commandAndRightPromptLength;
/*    */   private int trimmedLinesCount;
/*    */   
/*  9 */   public CommandBlockImpl(@Nullable String command, @Nullable String prompt, @Nullable String rightPrompt, @NotNull RangeMarker range, int commandAndRightPromptLength) { this.command = command;
/* 10 */     this.prompt = prompt;
/* 11 */     this.rightPrompt = rightPrompt;
/* 12 */     this.range = range;
/* 13 */     this.commandAndRightPromptLength = commandAndRightPromptLength; }
/*    */   @Nullable public String getCommand() { return this.command; }
/*    */   @Nullable
/* 16 */   public String getPrompt() { return this.prompt; } public int getStartOffset() { return this.range.getStartOffset(); }
/*    */   @Nullable public String getRightPrompt() { return this.rightPrompt; }
/*    */   @NotNull
/* 19 */   public final RangeMarker getRange() { return this.range; } public int getEndOffset() { return this.range.getEndOffset(); }
/*    */   
/*    */   public int getCommandStartOffset() {
/* 22 */     if (getPrompt() == null) getPrompt();  return getPrompt() + "".length();
/*    */   }
/*    */   
/*    */   public int getOutputStartOffset() {
/* 26 */     return getCommandStartOffset() + ((this.commandAndRightPromptLength > 0) ? (this.commandAndRightPromptLength + 1) : 0);
/*    */   }
/* 28 */   public int getTrimmedLinesCount() { return this.trimmedLinesCount; } public void setTrimmedLinesCount(int <set-?>) { this.trimmedLinesCount = <set-?>; }
/*    */   
/*    */   public boolean isFinalized() {
/* 31 */     return !this.range.isGreedyToRight();
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component1() {
/*    */     return this.command;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component2() {
/*    */     return this.prompt;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component3() {
/*    */     return this.rightPrompt;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final RangeMarker component4() {
/*    */     return this.range;
/*    */   }
/*    */   
/*    */   private final int component5() {
/*    */     return this.commandAndRightPromptLength;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CommandBlockImpl copy(@Nullable String command, @Nullable String prompt, @Nullable String rightPrompt, @NotNull RangeMarker range, int commandAndRightPromptLength) {
/*    */     Intrinsics.checkNotNullParameter(range, "range");
/*    */     return new CommandBlockImpl(command, prompt, rightPrompt, range, commandAndRightPromptLength);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "CommandBlockImpl(command=" + this.command + ", prompt=" + this.prompt + ", rightPrompt=" + this.rightPrompt + ", range=" + this.range + ", commandAndRightPromptLength=" + this.commandAndRightPromptLength + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = (this.command == null) ? 0 : this.command.hashCode();
/*    */     result = result * 31 + ((this.prompt == null) ? 0 : this.prompt.hashCode());
/*    */     result = result * 31 + ((this.rightPrompt == null) ? 0 : this.rightPrompt.hashCode());
/*    */     result = result * 31 + this.range.hashCode();
/*    */     return result * 31 + Integer.hashCode(this.commandAndRightPromptLength);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof CommandBlockImpl))
/*    */       return false; 
/*    */     CommandBlockImpl commandBlockImpl = (CommandBlockImpl)other;
/*    */     return !Intrinsics.areEqual(this.command, commandBlockImpl.command) ? false : (!Intrinsics.areEqual(this.prompt, commandBlockImpl.prompt) ? false : (!Intrinsics.areEqual(this.rightPrompt, commandBlockImpl.rightPrompt) ? false : (!Intrinsics.areEqual(this.range, commandBlockImpl.range) ? false : (!(this.commandAndRightPromptLength != commandBlockImpl.commandAndRightPromptLength)))));
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\CommandBlockImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */