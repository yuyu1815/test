/*   */ package com.intellij.ml.llm.matterhorn;
/*   */ 
/*   */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*   */ final class ProjectFileStructureFilter$Companion$ALL$1 implements ProjectFileStructureFilter {
/* 5 */   public final boolean acceptForStructure(ProjectStructureItem it) { Intrinsics.checkNotNullParameter(it, "it"); return true; } public static final ProjectFileStructureFilter$Companion$ALL$1 INSTANCE = new ProjectFileStructureFilter$Companion$ALL$1(); public boolean acceptForSource(ProjectStructureItem item) { return ProjectFileStructureFilter.DefaultImpls.acceptForSource(this, item); }
/*   */ 
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ProjectFileStructureFilter$Companion$ALL$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */