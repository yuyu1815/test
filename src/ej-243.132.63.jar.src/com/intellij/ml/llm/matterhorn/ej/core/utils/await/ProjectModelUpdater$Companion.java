/*    */ package com.intellij.ml.llm.matterhorn.ej.core.utils.await;
/*    */ import kotlin.Unit;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\026\020\t\032\0020\n2\006\020\013\032\0020\fH@¢\006\002\020\rR\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\b¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/utils/await/ProjectModelUpdater$Companion;", "", "<init>", "()V", "EP_NAME", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "Lcom/intellij/ml/llm/matterhorn/ej/core/utils/await/ProjectModelUpdater;", "getEP_NAME", "()Lcom/intellij/openapi/extensions/ExtensionPointName;", "updateProjectModelAndWait", "", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
/*    */ public final class Companion {
/*    */   @NotNull
/*  8 */   private static final ExtensionPointName<ProjectModelUpdater> EP_NAME = new ExtensionPointName("com.intellij.ml.llm.matterhorn.ej.core.utils.await.projectModelUpdater"); @NotNull public final ExtensionPointName<ProjectModelUpdater> getEP_NAME() { return EP_NAME; }
/*    */    @Nullable
/*    */   public final Object updateProjectModelAndWait(@NotNull Project project, @NotNull Continuation<? super Unit> $completion) {
/* 11 */     if ((ProjectModelUpdater)CollectionsKt.firstOrNull(EP_NAME.getExtensionList()) == null) (ProjectModelUpdater)CollectionsKt.firstOrNull(EP_NAME.getExtensionList());  ProjectModelUpdater updater = 
/* 12 */       new DefaultProjectModelUpdater(0L, 1, null);
/* 13 */     if (updater.updateProjectModelAndWait(project, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return updater.updateProjectModelAndWait(project, $completion);  updater.updateProjectModelAndWait(project, $completion); return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\cor\\utils\await\ProjectModelUpdater$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */