/*    */ package com.intellij.ml.llm.matterhorn.ej.core.services.search;
/*    */ 
/*    */ import com.intellij.psi.PsiFile;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\013\n\002\b\002\n\002\020\016\n\002\030\002\n\002\030\002\n\000\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\b\032\0020\t2\006\020\n\032\0020\003H\026J\022\020\013\032\f0\f¢\006\002\b\r¢\006\002\b\016H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileFilter;", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;", "file", "Lcom/intellij/psi/PsiFile;", "<init>", "(Lcom/intellij/psi/PsiFile;)V", "getFile", "()Lcom/intellij/psi/PsiFile;", "checkFile", "", "candidate", "getFilterText", "", "Lorg/jetbrains/annotations/NotNull;", "Lcom/intellij/openapi/util/NlsSafe;", "ej-core"})
/*    */ public final class FileFilter
/*    */   implements SearchResultsFilter
/*    */ {
/*    */   @NotNull
/*    */   private final PsiFile file;
/*    */   
/*    */   public FileFilter(@NotNull PsiFile file) {
/* 23 */     this.file = file; } @NotNull public final PsiFile getFile() { return this.file; }
/* 24 */   public boolean checkFile(@NotNull PsiFile candidate) { Intrinsics.checkNotNullParameter(candidate, "candidate"); return Intrinsics.areEqual(candidate, this.file); } @NotNull
/*    */   public String getFilterText() {
/* 26 */     Intrinsics.checkNotNullExpressionValue(this.file.getVirtualFile().getPresentableUrl(), "getPresentableUrl(...)"); return this.file.getVirtualFile().getPresentableUrl();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\services\search\FileFilter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */