/*    */ package com.intellij.ml.llm.matterhorn.ej.android;
/*    */ import com.google.common.util.concurrent.ListenableFuture;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlinx.coroutines.guava.ListenableFutureKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\026\020\004\032\0020\0052\006\020\006\032\0020\007H@¢\006\002\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/android/AndroidProjectModelUpdater;", "Lcom/intellij/ml/llm/matterhorn/ej/core/utils/await/ProjectModelUpdater;", "<init>", "()V", "updateProjectModelAndWait", "", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-android"})
/*    */ public final class AndroidProjectModelUpdater implements ProjectModelUpdater {
/*    */   @Nullable
/*    */   public Object updateProjectModelAndWait(@NotNull Project project, @NotNull Continuation $completion) {
/* 11 */     ListenableFuture future = ProjectSystemService.Companion.getInstance(project).getProjectSystem().getSyncManager()
/* 12 */       .syncProject(ProjectSystemSyncManager.SyncReason.USER_REQUEST);
/* 13 */     if (ListenableFutureKt.await(future, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return ListenableFutureKt.await(future, $completion);  ListenableFutureKt.await(future, $completion); return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\android\AndroidProjectModelUpdater.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */