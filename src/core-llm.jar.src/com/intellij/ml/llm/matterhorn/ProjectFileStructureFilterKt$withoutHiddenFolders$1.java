/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 176)
/*    */ public final class ProjectFileStructureFilterKt$withoutHiddenFolders$1
/*    */   implements ProjectFileStructureFilter
/*    */ {
/*    */   public ProjectFileStructureFilterKt$withoutHiddenFolders$1(ProjectFileStructureFilter.Companion $receiver, Function1<ProjectStructureItem, Boolean> $filter) {}
/*    */   
/*    */   public final boolean acceptForStructure(ProjectStructureItem it) {
/* 17 */     Intrinsics.checkNotNullParameter(it, "it"); return (!this.$this_withoutHiddenFolders.isHiddenFolder(it) && ((Boolean)this.$filter.invoke(it)).booleanValue()); } public boolean acceptForSource(ProjectStructureItem item) { return ProjectFileStructureFilter.DefaultImpls.acceptForSource(this, item); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ProjectFileStructureFilterKt$withoutHiddenFolders$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */