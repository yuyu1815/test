/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.markdown;
/*     */ 
/*     */ import androidx.compose.ui.text.SpanStyle;
/*     */ import androidx.compose.ui.text.font.FontStyle;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J$\020\002\032\0020\0032\n\020\004\032\0060\005R\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026¨\006\013"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$Companion$createDefaultProviders$11", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$ProcessingProvider;", "processNode", "", "visitor", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$AnnotatedStringGeneratingVisitor;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator;", "markdownText", "", "node", "Lorg/intellij/markdown/ast/ASTNode;", "ej-ui"})
/*     */ public final class AnnotatedStringGenerator$Companion$createDefaultProviders$11
/*     */   implements AnnotatedStringGenerator.ProcessingProvider
/*     */ {
/*     */   public void processNode(AnnotatedStringGenerator.AnnotatedStringGeneratingVisitor visitor, String markdownText, ASTNode node) {
/* 264 */     Intrinsics.checkNotNullParameter(visitor, "visitor"); Intrinsics.checkNotNullParameter(markdownText, "markdownText"); Intrinsics.checkNotNullParameter(node, "node"); visitor.consumeText("> ");
/* 265 */     int start = visitor.getCurrentOffset();
/* 266 */     ASTNodeKt.acceptChildren(node, (Visitor)visitor);
/* 267 */     int end = visitor.getCurrentOffset();
/* 268 */     visitor.addStyle(new SpanStyle(0L, 0L, null, FontStyle.box-impl(FontStyle.Companion.getItalic-_-LCdwA()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65527, null), start, end);
/* 269 */     visitor.consumeText("\n\n");
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\markdown\AnnotatedStringGenerator$Companion$createDefaultProviders$11.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */