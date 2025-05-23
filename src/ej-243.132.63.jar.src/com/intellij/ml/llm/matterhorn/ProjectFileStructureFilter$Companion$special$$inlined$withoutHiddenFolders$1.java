/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ @SourceDebugExtension({"SMAP\nProjectFileStructureFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectFileStructureFilter.kt\ncom/intellij/ml/llm/matterhorn/ProjectFileStructureFilterKt$withoutHiddenFolders$1\n+ 2 ProjectFileStructureFilter.kt\ncom/intellij/ml/llm/matterhorn/ProjectFileStructureFilter$Companion\n*L\n1#1,17:1\n6#2:18\n*E\n"})
/*    */ public final class ProjectFileStructureFilter$Companion$special$$inlined$withoutHiddenFolders$1
/*    */   implements ProjectFileStructureFilter
/*    */ {
/*    */   public ProjectFileStructureFilter$Companion$special$$inlined$withoutHiddenFolders$1(ProjectFileStructureFilter.Companion $receiver) {}
/*    */   
/*    */   public final boolean acceptForStructure(ProjectStructureItem it) {
/* 17 */     Intrinsics.checkNotNullParameter(it, "it"); if (!this.$this_withoutHiddenFolders.isHiddenFolder(it)) { ProjectStructureItem projectStructureItem = it; int $i$a$-withoutHiddenFolders-ProjectFileStructureFilter$Companion$WITHOUT_HIDDEN_FOLDERS$1 = 0; if (true); }  return false; } public boolean acceptForSource(ProjectStructureItem item) { return ProjectFileStructureFilter.DefaultImpls.acceptForSource(this, item); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ProjectFileStructureFilter$Companion$special$$inlined$withoutHiddenFolders$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */