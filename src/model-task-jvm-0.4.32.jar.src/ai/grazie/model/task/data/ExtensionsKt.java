/*    */ package ai.grazie.model.task.data;
/*    */ import ai.grazie.model.task.data.v3.TaskStreamData;
/*    */ import ai.grazie.model.task.data.v3.TaskStreamExecutionMetadata;
/*    */ import ai.grazie.model.task.data.v3.TaskStreamFunctionCall;
/*    */ import ai.grazie.model.task.data.v3.TaskStreamQuotaMetaData;
/*    */ import kotlin.NoWhenBranchMatchedException;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\002\030\002\n\002\b\002\032\n\020\000\032\0020\001*\0020\002\032\n\020\003\032\0020\002*\0020\001¨\006\004"}, d2 = {"toTaskStreamData", "Lai/grazie/model/task/data/TaskStreamData;", "Lai/grazie/model/task/data/v3/TaskStreamData;", "toTaskStreamDataV3", "model-task"})
/*    */ public final class ExtensionsKt {
/*    */   @NotNull
/*    */   public static final TaskStreamData toTaskStreamDataV3(@NotNull TaskStreamData $this$toTaskStreamDataV3) {
/* 14 */     Intrinsics.checkNotNullParameter($this$toTaskStreamDataV3, "<this>"); TaskStreamData taskStreamData = $this$toTaskStreamDataV3;
/*    */ 
/*    */ 
/*    */     
/* 18 */     if (taskStreamData instanceof TaskStreamText) {  } else { throw new NoWhenBranchMatchedException(); }
/*    */     
/*    */     return (taskStreamData instanceof TaskStreamFunctionCall) ? (TaskStreamData)new TaskStreamFunctionCall(((TaskStreamFunctionCall)$this$toTaskStreamDataV3).getName(), $this$toTaskStreamDataV3.getContent()) : ((taskStreamData instanceof TaskStreamExecutionMetadata) ? (TaskStreamData)new TaskStreamExecutionMetadata(ai.grazie.utils.attributes.ExtensionsKt.toDataHolder(((TaskStreamExecutionMetadata)$this$toTaskStreamDataV3).getAttributes())) : ((taskStreamData instanceof TaskStreamQuotaMetaData) ? (TaskStreamData)new TaskStreamQuotaMetaData(((TaskStreamQuotaMetaData)$this$toTaskStreamDataV3).getUpdated(), ((TaskStreamQuotaMetaData)$this$toTaskStreamDataV3).getSpent()) : (TaskStreamData)"JD-Core does not support Kotlin"));
/*    */   } @NotNull
/*    */   public static final TaskStreamData toTaskStreamData(@NotNull TaskStreamData $this$toTaskStreamData) {
/* 23 */     Intrinsics.checkNotNullParameter($this$toTaskStreamData, "<this>"); TaskStreamData taskStreamData = $this$toTaskStreamData;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 29 */     if (taskStreamData instanceof ai.grazie.model.task.data.v3.TaskStreamText) {  } else { throw new NoWhenBranchMatchedException(); }
/*    */     
/*    */     return (taskStreamData instanceof TaskStreamFunctionCall) ? new TaskStreamFunctionCall(((TaskStreamFunctionCall)$this$toTaskStreamData).getName(), $this$toTaskStreamData.getContent()) : ((taskStreamData instanceof TaskStreamExecutionMetadata) ? new TaskStreamExecutionMetadata(ai.grazie.utils.data.ExtensionsKt.toAttributes(((TaskStreamExecutionMetadata)$this$toTaskStreamData).getAttributes())) : ((taskStreamData instanceof ai.grazie.model.task.data.v3.TaskStreamFinishMetadata) ? new TaskStreamText($this$toTaskStreamData.getContent()) : ((taskStreamData instanceof TaskStreamQuotaMetaData) ? new TaskStreamQuotaMetaData(((TaskStreamQuotaMetaData)$this$toTaskStreamData).getUpdated(), ((TaskStreamQuotaMetaData)$this$toTaskStreamData).getSpent()) : ((taskStreamData instanceof ai.grazie.model.task.data.v3.TaskStreamUnknownData) ? new TaskStreamText($this$toTaskStreamData.getContent()) : (TaskStreamData)"JD-Core does not support Kotlin"))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\data\ExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */