/*    */ package com.intellij.ml.llm.matterhorn.ej.core.utils;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.utils.await.ProjectModelUpdater;
/*    */ import com.intellij.openapi.editor.Document;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\026\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tJ\026\020\n\032\0020\0132\006\020\006\032\0020\007H@¢\006\002\020\f¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/utils/AwaitUtils;", "", "<init>", "()V", "shouldWait", "", "project", "Lcom/intellij/openapi/project/Project;", "document", "Lcom/intellij/openapi/editor/Document;", "awaitProjectUpdate", "", "(Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
/*    */ public final class AwaitUtils {
/*    */   public final boolean shouldWait(@NotNull Project project, @NotNull Document document) {
/* 11 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(document, "document"); return ProjectUpdateTrigger.Companion.shouldTriggerUpdate(project, document);
/*    */   } @NotNull
/*    */   public static final AwaitUtils INSTANCE = new AwaitUtils(); @Nullable
/*    */   public final Object awaitProjectUpdate(@NotNull Project project, @NotNull Continuation $completion) {
/* 15 */     if (ProjectModelUpdater.Companion.updateProjectModelAndWait(project, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return ProjectModelUpdater.Companion.updateProjectModelAndWait(project, $completion);  ProjectModelUpdater.Companion.updateProjectModelAndWait(project, $completion); return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\cor\\utils\AwaitUtils.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */