/*    */ package com.intellij.ml.llm.matterhorn.ej.core.services;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.services.search.AbstractProjectSearcher;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.NoWhenBranchMatchedException;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\030\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH\002¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$Companion;", "", "<init>", "()V", "getSearcher", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractProjectSearcher;", "project", "Lcom/intellij/openapi/project/Project;", "searchType", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$SearchType;", "ej-core"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   private final AbstractProjectSearcher getSearcher(Project project, ProjectSearchEverywhereService.SearchType searchType) {
/* 26 */     switch (WhenMappings.$EnumSwitchMapping$0[searchType.ordinal()]) { case 1: case 2: case 3: case 4: case 5:  }  throw new NoWhenBranchMatchedException();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\services\ProjectSearchEverywhereService$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */