/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import com.intellij.openapi.util.TextRange;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.ApiStatus.Internal;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\020\013\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\003\"\030\020\000\032\0020\001*\0020\0028@X\004¢\006\006\032\004\b\003\020\004\"\030\020\005\032\0020\001*\0020\0028@X\004¢\006\006\032\004\b\006\020\004\"\025\020\007\032\0020\001*\0020\0028G¢\006\006\032\004\b\b\020\004\"\030\020\t\032\0020\n*\0020\0028@X\004¢\006\006\032\004\b\013\020\f¨\006\r"}, d2 = {"withPrompt", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;", "getWithPrompt", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;)Z", "withCommand", "getWithCommand", "withOutput", "getWithOutput", "textRange", "Lcom/intellij/openapi/util/TextRange;", "getTextRange", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;)Lcom/intellij/openapi/util/TextRange;", "ej-core"})
/*    */ public final class CommandBlockImplKt
/*    */ {
/*    */   public static final boolean getWithPrompt(@NotNull CommandBlock $this$withPrompt) {
/* 35 */     Intrinsics.checkNotNullParameter($this$withPrompt, "<this>"); CharSequence charSequence = $this$withPrompt.getPrompt(); return !((charSequence == null || charSequence.length() == 0) ? 1 : 0);
/*    */   }
/*    */   public static final boolean getWithCommand(@NotNull CommandBlock $this$withCommand) {
/* 38 */     Intrinsics.checkNotNullParameter($this$withCommand, "<this>"); CharSequence charSequence = $this$withCommand.getCommand(); return !((charSequence == null || charSequence.length() == 0) ? 1 : 0);
/*    */   }
/*    */   
/*    */   @Internal
/*    */   public static final boolean getWithOutput(@NotNull CommandBlock $this$withOutput) {
/* 43 */     Intrinsics.checkNotNullParameter($this$withOutput, "<this>"); return ($this$withOutput.getOutputStartOffset() <= $this$withOutput.getEndOffset() && $this$withOutput.getStartOffset() != $this$withOutput.getEndOffset());
/*    */   } @NotNull
/*    */   public static final TextRange getTextRange(@NotNull CommandBlock $this$textRange) {
/* 46 */     Intrinsics.checkNotNullParameter($this$textRange, "<this>"); return new TextRange($this$textRange.getStartOffset(), $this$textRange.getEndOffset());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\CommandBlockImplKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */