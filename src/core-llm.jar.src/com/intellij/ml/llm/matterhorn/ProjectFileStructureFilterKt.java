/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\"\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\000\0325\020\000\032\0020\001*\0020\0022#\b\004\020\003\032\035\022\023\022\0210\005¢\006\f\b\006\022\b\b\007\022\004\b\b(\b\022\004\022\0020\t0\004H\bø\001\000\002\007\n\005\b20\001¨\006\n"}, d2 = {"withoutHiddenFolders", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureFilter;", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureFilter$Companion;", "filter", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureItem;", "Lkotlin/ParameterName;", "name", "item", "", "core"})
/*    */ public final class ProjectFileStructureFilterKt
/*    */ {
/*    */   @NotNull
/*    */   public static final ProjectFileStructureFilter withoutHiddenFolders(@NotNull ProjectFileStructureFilter.Companion $this$withoutHiddenFolders, @NotNull Function1<? super ProjectStructureItem, Boolean> filter) {
/* 17 */     Intrinsics.checkNotNullParameter($this$withoutHiddenFolders, "<this>"); Intrinsics.checkNotNullParameter(filter, "filter"); int $i$f$withoutHiddenFolders = 0; return new ProjectFileStructureFilterKt$withoutHiddenFolders$1($this$withoutHiddenFolders, filter); } @Metadata(mv = {2, 1, 0}, k = 3, xi = 176) public static final class ProjectFileStructureFilterKt$withoutHiddenFolders$1 implements ProjectFileStructureFilter { public final boolean acceptForStructure(ProjectStructureItem it) { Intrinsics.checkNotNullParameter(it, "it"); return (!this.$this_withoutHiddenFolders.isHiddenFolder(it) && ((Boolean)this.$filter.invoke(it)).booleanValue()); } public ProjectFileStructureFilterKt$withoutHiddenFolders$1(ProjectFileStructureFilter.Companion $receiver, Function1<ProjectStructureItem, Boolean> $filter) {} public boolean acceptForSource(ProjectStructureItem item) { return ProjectFileStructureFilter.DefaultImpls.acceptForSource(this, item); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ProjectFileStructureFilterKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */