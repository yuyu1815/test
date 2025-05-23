/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.markdown;
/*     */ 
/*     */ import androidx.compose.ui.text.AnnotatedString;
/*     */ import androidx.compose.ui.text.SpanStyle;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.intellij.markdown.IElementType;
/*     */ import org.intellij.markdown.ast.ASTNode;
/*     */ import org.intellij.markdown.ast.ASTNodeKt;
/*     */ import org.intellij.markdown.ast.ASTUtilKt;
/*     */ import org.intellij.markdown.ast.visitors.RecursiveVisitor;
/*     */ import org.intellij.markdown.ast.visitors.Visitor;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020!\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\020\r\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\002\b\004\n\002\020\016\n\002\b\002\n\002\020\013\n\000\b\004\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\016\020\t\032\0020\n2\006\020\013\032\0020\fJ\006\020\r\032\0020\nJ\b\020\016\032\004\030\0010\bJ\020\020\017\032\0020\n2\006\020\020\032\0020\021H\026J\016\020\022\032\0020\n2\006\020\020\032\0020\021J\016\020\023\032\0020\n2\006\020\024\032\0020\025J\036\020\026\032\0020\n2\006\020\027\032\0020\0302\006\020\031\032\0020\0322\006\020\033\032\0020\032J\006\020\034\032\0020\032J&\020\035\032\0020\n2\006\020\036\032\0020\0372\006\020 \032\0020\0372\006\020\031\032\0020\0322\006\020\033\032\0020\032J\006\020!\032\0020\"R\016\020\002\032\0020\003X\004¢\006\002\n\000R\024\020\006\032\b\022\004\022\0020\b0\007X\004¢\006\002\n\000¨\006#"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$AnnotatedStringGeneratingVisitor;", "Lorg/intellij/markdown/ast/visitors/RecursiveVisitor;", "builder", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator;Landroidx/compose/ui/text/AnnotatedString$Builder;)V", "listContextStack", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/ListContext;", "pushListContext", "", "type", "Lorg/intellij/markdown/IElementType;", "popListContext", "getCurrentListContext", "visitNode", "node", "Lorg/intellij/markdown/ast/ASTNode;", "visitLeaf", "consumeText", "text", "", "addStyle", "style", "Landroidx/compose/ui/text/SpanStyle;", "start", "", "end", "getCurrentOffset", "addStringAnnotation", "tag", "", "annotation", "isEmpty", "", "ej-ui"})
/*     */ public final class AnnotatedStringGeneratingVisitor
/*     */   extends RecursiveVisitor
/*     */ {
/*     */   @NotNull
/*     */   private final AnnotatedString.Builder builder;
/*     */   @NotNull
/*     */   private final List<ListContext> listContextStack;
/*     */   
/*     */   public AnnotatedStringGeneratingVisitor(AnnotatedString.Builder builder) {
/*  55 */     this.builder = builder;
/*     */ 
/*     */     
/*  58 */     this.listContextStack = new ArrayList<>();
/*     */   }
/*     */   public final void pushListContext(@NotNull IElementType type) {
/*  61 */     Intrinsics.checkNotNullParameter(type, "type"); this.listContextStack.add(new ListContext(type, 0, 2, null));
/*     */   }
/*     */   
/*     */   public final void popListContext() {
/*  65 */     if (!this.listContextStack.isEmpty())
/*  66 */       this.listContextStack.remove(this.listContextStack.size() - 1); 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final ListContext getCurrentListContext() {
/*  71 */     return (ListContext)CollectionsKt.lastOrNull(this.listContextStack);
/*     */   }
/*     */   
/*     */   public void visitNode(@NotNull ASTNode node) {
/*  75 */     Intrinsics.checkNotNullParameter(node, "node"); if ((AnnotatedStringGenerator.ProcessingProvider)AnnotatedStringGenerator.access$getProviders$p(AnnotatedStringGenerator.this).get(node.getType()) != null) { ((AnnotatedStringGenerator.ProcessingProvider)AnnotatedStringGenerator.access$getProviders$p(AnnotatedStringGenerator.this).get(node.getType())).processNode(this, AnnotatedStringGenerator.access$getMarkdownText$p(AnnotatedStringGenerator.this), node); } else { (AnnotatedStringGenerator.ProcessingProvider)AnnotatedStringGenerator.access$getProviders$p(AnnotatedStringGenerator.this).get(node.getType());
/*  76 */       if (!node.getChildren().isEmpty()) {
/*  77 */         ASTNodeKt.acceptChildren(node, (Visitor)this);
/*     */       } else {
/*     */         
/*  80 */         visitLeaf(node);
/*     */       }  }
/*     */   
/*     */   }
/*     */   
/*     */   public final void visitLeaf(@NotNull ASTNode node) {
/*  86 */     Intrinsics.checkNotNullParameter(node, "node"); CharSequence text = ASTUtilKt.getTextInNode(node, AnnotatedStringGenerator.access$getMarkdownText$p(AnnotatedStringGenerator.this));
/*  87 */     consumeText(text);
/*     */   }
/*     */   
/*     */   public final void consumeText(@NotNull CharSequence text) {
/*  91 */     Intrinsics.checkNotNullParameter(text, "text"); this.builder.append(text);
/*     */   }
/*     */   
/*     */   public final void addStyle(@NotNull SpanStyle style, int start, int end) {
/*  95 */     Intrinsics.checkNotNullParameter(style, "style"); this.builder.addStyle(style, start, end);
/*     */   }
/*     */   
/*     */   public final int getCurrentOffset() {
/*  99 */     return this.builder.getLength();
/*     */   }
/*     */   
/*     */   public final void addStringAnnotation(@NotNull String tag, @NotNull String annotation, int start, int end) {
/* 103 */     Intrinsics.checkNotNullParameter(tag, "tag"); Intrinsics.checkNotNullParameter(annotation, "annotation"); this.builder.addStringAnnotation(tag, annotation, start, end);
/*     */   }
/*     */   public final boolean isEmpty() {
/* 106 */     return (this.builder.getLength() == 0);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\markdown\AnnotatedStringGenerator$AnnotatedStringGeneratingVisitor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */