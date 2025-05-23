/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.markdown;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.intellij.markdown.MarkdownElementTypes;
/*     */ import org.intellij.markdown.ast.ASTNode;
/*     */ import org.intellij.markdown.ast.ASTNodeKt;
/*     */ import org.intellij.markdown.ast.visitors.Visitor;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J$\020\002\032\0020\0032\n\020\004\032\0060\005R\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026¨\006\013"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$Companion$createDefaultProviders$10", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$ProcessingProvider;", "processNode", "", "visitor", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$AnnotatedStringGeneratingVisitor;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator;", "markdownText", "", "node", "Lorg/intellij/markdown/ast/ASTNode;", "ej-ui"})
/*     */ public final class AnnotatedStringGenerator$Companion$createDefaultProviders$10
/*     */   implements AnnotatedStringGenerator.ProcessingProvider
/*     */ {
/*     */   public void processNode(AnnotatedStringGenerator.AnnotatedStringGeneratingVisitor visitor, String markdownText, ASTNode node) {
/* 249 */     Intrinsics.checkNotNullParameter(visitor, "visitor"); Intrinsics.checkNotNullParameter(markdownText, "markdownText"); Intrinsics.checkNotNullParameter(node, "node"); ListContext context = visitor.getCurrentListContext();
/* 250 */     if (Intrinsics.areEqual((context != null) ? context.getType() : null, MarkdownElementTypes.ORDERED_LIST)) {
/* 251 */       visitor.consumeText("" + context.getItemIndex() + ". ");
/* 252 */       int i = context.getItemIndex(); context.setItemIndex(i + 1);
/*     */     } else {
/* 254 */       visitor.consumeText("• ");
/*     */     } 
/* 256 */     ASTNodeKt.acceptChildren(node, (Visitor)visitor);
/* 257 */     visitor.consumeText("\n");
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\markdown\AnnotatedStringGenerator$Companion$createDefaultProviders$10.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */