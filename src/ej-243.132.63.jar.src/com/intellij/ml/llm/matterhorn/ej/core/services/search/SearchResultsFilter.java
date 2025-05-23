package com.intellij.ml.llm.matterhorn.ej.core.services.search;

import com.intellij.psi.PsiFile;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\016\n\000\bf\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H&J\b\020\006\032\0020\007H&¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;", "", "checkFile", "", "candidate", "Lcom/intellij/psi/PsiFile;", "getFilterText", "", "ej-core"})
public interface SearchResultsFilter {
  boolean checkFile(@NotNull PsiFile paramPsiFile);
  
  @NotNull
  String getFilterText();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\services\search\SearchResultsFilter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */