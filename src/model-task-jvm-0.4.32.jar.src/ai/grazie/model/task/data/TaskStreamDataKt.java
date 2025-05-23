/*    */ package ai.grazie.model.task.data;
/*    */ 
/*    */ import ai.grazie.model.llm.data.stream.LLMStreamData;
/*    */ import ai.grazie.model.llm.data.stream.LLMStreamFunctionCall;
/*    */ import ai.grazie.model.llm.data.stream.LLMStreamQuotaMetaData;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\032\f\020\000\032\004\030\0010\001*\0020\002¨\006\003"}, d2 = {"toTaskStreamData", "Lai/grazie/model/task/data/TaskStreamData;", "Lai/grazie/model/llm/data/stream/LLMStreamData;", "model-task"})
/*    */ public final class TaskStreamDataKt
/*    */ {
/*    */   @Nullable
/*    */   public static final TaskStreamData toTaskStreamData(@NotNull LLMStreamData $this$toTaskStreamData) {
/* 71 */     Intrinsics.checkNotNullParameter($this$toTaskStreamData, "<this>"); LLMStreamData lLMStreamData = $this$toTaskStreamData;
/*    */ 
/*    */ 
/*    */     
/* 75 */     if (lLMStreamData instanceof ai.grazie.model.llm.data.stream.LLMStreamTokensData) throw new IllegalStateException(("Unexpected data type: " + $this$toTaskStreamData).toString());
/*    */     
/* 77 */     if (lLMStreamData instanceof ai.grazie.model.llm.data.stream.LLMStreamUnknownMetaData) {  } else { throw new NoWhenBranchMatchedException(); }
/*    */     
/*    */     return (lLMStreamData instanceof LLMStreamQuotaMetaData) ? new TaskStreamQuotaMetaData(((LLMStreamQuotaMetaData)$this$toTaskStreamData).getUpdated(), ((LLMStreamQuotaMetaData)$this$toTaskStreamData).getSpent()) : ((lLMStreamData instanceof ai.grazie.model.llm.data.stream.LLMStreamText) ? new TaskStreamText($this$toTaskStreamData.getContent()) : ((lLMStreamData instanceof LLMStreamFunctionCall) ? new TaskStreamFunctionCall(((LLMStreamFunctionCall)$this$toTaskStreamData).getName(), $this$toTaskStreamData.getContent()) : ((lLMStreamData instanceof ai.grazie.model.llm.data.stream.LLMStreamFinishMetaData) ? null : (TaskStreamData)"JD-Core does not support Kotlin")));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\data\TaskStreamDataKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */