/*     */ package com.intellij.ml.llm.matterhorn.ej.phpstorm.relevance.extractors;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.ExtractorUtilsKt;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.util.TextRange;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.util.PsiTreeUtilKt;
/*     */ import com.jetbrains.php.lang.psi.elements.PhpNamespace;
/*     */ import com.jetbrains.php.lang.psi.elements.PhpUse;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000$\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032\020\020\000\032\0020\0012\006\020\002\032\0020\003H\002\032$\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0060\0052\006\020\002\032\0020\0032\006\020\007\032\0020\bH\002\032$\020\t\032\016\022\004\022\0020\006\022\004\022\0020\0060\0052\006\020\007\032\0020\b2\006\020\002\032\0020\nH\002¨\006\013"}, d2 = {"shouldIncludeElement", "", "element", "Lcom/intellij/psi/PsiElement;", "extractElementRange", "Lkotlin/Pair;", "", "document", "Lcom/intellij/openapi/editor/Document;", "getPhpNamespaceRange", "Lcom/jetbrains/php/lang/psi/elements/PhpNamespace;", "ej-phpstorm"})
/*     */ public final class PhpElementProviderKt
/*     */ {
/*     */   private static final boolean shouldIncludeElement(PsiElement element) {
/*  99 */     boolean isExcludedPhpUse = (element instanceof PhpUse && ((PhpUse)element).isTraitImport());
/* 100 */     boolean isExcludedPhpNamespace = (element instanceof PhpNamespace && ((PhpNamespace)element).isBraced());
/* 101 */     return (!isExcludedPhpUse && !isExcludedPhpNamespace);
/*     */   }
/*     */   
/*     */   private static final Pair<Integer, Integer> extractElementRange(PsiElement element, Document document) {
/* 105 */     return 
/* 106 */       (element instanceof PhpNamespace) ? getPhpNamespaceRange(document, (PhpNamespace)element) : 
/* 107 */       ExtractorUtilsKt.getImportRange(document, element);
/*     */   }
/*     */ 
/*     */   
/*     */   private static final Pair<Integer, Integer> getPhpNamespaceRange(Document document, PhpNamespace element) {
/* 112 */     TextRange importTextRange = element.getTextRange();
/* 113 */     element.getStatements(); return ExtractorUtilsKt.getLineRange(document, importTextRange.getStartOffset(), (element.getStatements() != null) ? PsiTreeUtilKt.getStartOffset((PsiElement)element.getStatements()) : importTextRange.getEndOffset());
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\phpstorm\relevance\extractors\PhpElementProviderKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */