/*    */ package com.intellij.ml.llm.matterhorn.ej.core.services.search;
/*    */ 
/*    */ import com.intellij.psi.PsiDirectory;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\016\n\002\030\002\n\002\030\002\n\002\b\003\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\b\032\0020\t2\006\020\n\032\0020\013H\026J\022\020\f\032\f0\r¢\006\002\b\016¢\006\002\b\017H\026J\026\020\020\032\0020\t*\0020\0032\b\020\021\032\004\030\0010\003H\002R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/DirectoryFilter;", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;", "directory", "Lcom/intellij/psi/PsiDirectory;", "<init>", "(Lcom/intellij/psi/PsiDirectory;)V", "getDirectory", "()Lcom/intellij/psi/PsiDirectory;", "checkFile", "", "candidate", "Lcom/intellij/psi/PsiFile;", "getFilterText", "", "Lorg/jetbrains/annotations/NotNull;", "Lcom/intellij/openapi/util/NlsSafe;", "isAncestor", "subDir", "ej-core"})
/*    */ public final class DirectoryFilter implements SearchResultsFilter {
/*    */   @NotNull
/*    */   private final PsiDirectory directory;
/*    */   
/* 11 */   public DirectoryFilter(@NotNull PsiDirectory directory) { this.directory = directory; } @NotNull public final PsiDirectory getDirectory() { return this.directory; }
/* 12 */   public boolean checkFile(@NotNull PsiFile candidate) { Intrinsics.checkNotNullParameter(candidate, "candidate"); return isAncestor(this.directory, candidate.getContainingDirectory()); } @NotNull
/*    */   public String getFilterText() {
/* 14 */     Intrinsics.checkNotNullExpressionValue(this.directory.getVirtualFile().getPresentableUrl(), "getPresentableUrl(...)"); return this.directory.getVirtualFile().getPresentableUrl();
/*    */   } private final boolean isAncestor(PsiDirectory $this$isAncestor, PsiDirectory subDir) {
/* 16 */     PsiDirectory psiDirectory = subDir;
/* 17 */     return (psiDirectory == null) ? false : (
/* 18 */       Intrinsics.areEqual(psiDirectory, $this$isAncestor) ? true : 
/* 19 */       isAncestor($this$isAncestor, subDir.getParent()));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\services\search\DirectoryFilter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */