package com.intellij.ml.llm.matterhorn.ej.ui.markdown;

import kotlin.Metadata;
import org.intellij.markdown.ast.ASTNode;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\bf\030\0002\0020\001J$\020\002\032\0020\0032\n\020\004\032\0060\005R\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH&¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$ProcessingProvider;", "", "processNode", "", "visitor", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$AnnotatedStringGeneratingVisitor;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator;", "markdownText", "", "node", "Lorg/intellij/markdown/ast/ASTNode;", "ej-ui"})
public interface ProcessingProvider {
  void processNode(@NotNull AnnotatedStringGenerator.AnnotatedStringGeneratingVisitor paramAnnotatedStringGeneratingVisitor, @NotNull String paramString, @NotNull ASTNode paramASTNode);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\markdown\AnnotatedStringGenerator$ProcessingProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */