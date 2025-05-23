/*    */ package ai.grazie.api.gateway.client.api.task;
/*    */ 
/*    */ import ai.grazie.api.gateway.api.task.TaskAPI;
/*    */ import ai.grazie.model.cloud.HeaderCollection;
/*    */ import ai.grazie.model.task.data.v3.TaskStreamData;
/*    */ import ai.grazie.model.task.data.v3.TaskStreamExecutionMetadata;
/*    */ import ai.grazie.model.task.data.v3.TaskStreamFinishMetadata;
/*    */ import ai.grazie.model.task.data.v3.TaskStreamFunctionCall;
/*    */ import ai.grazie.model.task.data.v3.TaskStreamQuotaMetaData;
/*    */ import ai.grazie.model.task.data.v3.TaskStreamText;
/*    */ import ai.grazie.model.task.id.TaskTag;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.NoWhenBranchMatchedException;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\034\n\000\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\032\024\020\000\032\0020\001*\0020\0022\b\020\003\032\004\030\0010\004\032\n\020\005\032\0020\006*\0020\007¨\006\b"}, d2 = {"addTaskTag", "", "Lai/grazie/model/cloud/HeaderCollection;", "taskTag", "Lai/grazie/model/task/id/TaskTag;", "toStreamData", "Lai/grazie/model/task/data/v3/TaskStreamData;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V4$TaskData;", "api-gateway-client"})
/*    */ public final class TasksAPIClientKt
/*    */ {
/*    */   @NotNull
/*    */   public static final TaskStreamData toStreamData(@NotNull TaskAPI.Stream.V4.TaskData $this$toStreamData) {
/* 38 */     Intrinsics.checkNotNullParameter($this$toStreamData, "<this>"); TaskAPI.Stream.V4.TaskData taskData = $this$toStreamData;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 44 */     if (taskData instanceof TaskAPI.Stream.V4.TaskData.UnknownMetadata) {  } else { throw new NoWhenBranchMatchedException(); }
/*    */     
/*    */     return (taskData instanceof TaskAPI.Stream.V4.TaskData.Content) ? (TaskStreamData)new TaskStreamText($this$toStreamData.getContent()) : ((taskData instanceof TaskAPI.Stream.V4.TaskData.QuotaMetadata) ? (TaskStreamData)new TaskStreamQuotaMetaData(((TaskAPI.Stream.V4.TaskData.QuotaMetadata)$this$toStreamData).getUpdated(), ((TaskAPI.Stream.V4.TaskData.QuotaMetadata)$this$toStreamData).getSpent()) : ((taskData instanceof TaskAPI.Stream.V4.TaskData.ExecutionMetadata) ? (TaskStreamData)new TaskStreamExecutionMetadata(((TaskAPI.Stream.V4.TaskData.ExecutionMetadata)$this$toStreamData).getAttributes()) : ((taskData instanceof TaskAPI.Stream.V4.TaskData.FunctionCall) ? (TaskStreamData)new TaskStreamFunctionCall(((TaskAPI.Stream.V4.TaskData.FunctionCall)$this$toStreamData).getName(), $this$toStreamData.getContent()) : ((taskData instanceof TaskAPI.Stream.V4.TaskData.FinishMetadata) ? (TaskStreamData)new TaskStreamFinishMetadata(((TaskAPI.Stream.V4.TaskData.FinishMetadata)$this$toStreamData).getReason()) : (TaskStreamData)"JD-Core does not support Kotlin"))));
/*    */   } public static final void addTaskTag(@NotNull HeaderCollection $this$addTaskTag, @Nullable TaskTag taskTag) {
/* 48 */     Intrinsics.checkNotNullParameter($this$addTaskTag, "<this>"); if (taskTag != null && !Intrinsics.areEqual(taskTag, TaskTag.Companion.getDefault()))
/* 49 */       $this$addTaskTag.add("Grazie-Task-Tag", taskTag.getTag()); 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\task\TasksAPIClientKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */