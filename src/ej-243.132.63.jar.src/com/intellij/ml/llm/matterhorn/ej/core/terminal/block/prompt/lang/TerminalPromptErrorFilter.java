/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.lang;
/*    */ import com.intellij.codeInsight.highlighting.HighlightErrorFilter;
/*    */ import com.intellij.psi.PsiErrorElement;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/lang/TerminalPromptErrorFilter;", "Lcom/intellij/codeInsight/highlighting/HighlightErrorFilter;", "<init>", "()V", "shouldHighlightErrorElement", "", "element", "Lcom/intellij/psi/PsiErrorElement;", "ej-core"})
/*    */ public final class TerminalPromptErrorFilter extends HighlightErrorFilter {
/*    */   public boolean shouldHighlightErrorElement(@NotNull PsiErrorElement element) {
/* 10 */     Intrinsics.checkNotNullParameter(element, "element"); return !(element.getContainingFile() instanceof TerminalPromptPsiFile);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\lang\TerminalPromptErrorFilter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */