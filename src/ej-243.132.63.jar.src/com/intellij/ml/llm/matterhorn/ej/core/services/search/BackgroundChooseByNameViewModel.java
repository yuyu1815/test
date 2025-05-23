/*    */ package com.intellij.ml.llm.matterhorn.ej.core.services.search;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\005\n\002\020\013\n\000\n\002\020\016\n\002\b\004\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\b\020\n\032\0020\003H\026J\b\020\013\032\0020\005H\026J\b\020\f\032\0020\rH\026J\020\020\016\032\0020\0172\006\020\020\032\0020\017H\026J\b\020\021\032\0020\rH\026J\b\020\022\032\0020\007H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/BackgroundChooseByNameViewModel;", "Lcom/intellij/ide/util/gotoByName/ChooseByNameViewModel;", "project", "Lcom/intellij/openapi/project/Project;", "model", "Lcom/intellij/ide/util/gotoByName/ChooseByNameModel;", "searchLimit", "", "<init>", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ide/util/gotoByName/ChooseByNameModel;I)V", "getProject", "getModel", "isSearchInAnyPlace", "", "transformPattern", "", "pattern", "canShowListForEmptyPattern", "getMaximumListSizeLimit", "ej-core"})
/*    */ public final class BackgroundChooseByNameViewModel implements ChooseByNameViewModel {
/*    */   @NotNull
/*    */   private final Project project;
/*    */   
/*  8 */   public BackgroundChooseByNameViewModel(@NotNull Project project, @NotNull ChooseByNameModel model, int searchLimit) { this.project = project;
/*  9 */     this.model = model;
/* 10 */     this.searchLimit = searchLimit; } @NotNull
/*    */   private final ChooseByNameModel model; private final int searchLimit; @NotNull
/* 12 */   public Project getProject() { return this.project; } @NotNull
/* 13 */   public ChooseByNameModel getModel() { return this.model; }
/* 14 */   public boolean isSearchInAnyPlace() { return true; } @NotNull
/* 15 */   public String transformPattern(@NotNull String pattern) { Intrinsics.checkNotNullParameter(pattern, "pattern"); return pattern; }
/* 16 */   public boolean canShowListForEmptyPattern() { return false; } public int getMaximumListSizeLimit() {
/* 17 */     return this.searchLimit;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\services\search\BackgroundChooseByNameViewModel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */