/*    */ package ai.grazie.model.task.data;
/*    */ 
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\027\020\003\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lai/grazie/model/task/data/TaskExecutionMetadataAttributes;", "", "()V", "llmPromptTaskDebugInfo", "Lai/grazie/utils/attributes/AttributeDescriptor$Json;", "Lai/grazie/model/task/data/LlmPromptTaskDebugInfo;", "getLlmPromptTaskDebugInfo", "()Lai/grazie/utils/attributes/AttributeDescriptor$Json;", "model-task"})
/*    */ public final class TaskExecutionMetadataAttributes
/*    */ {
/*    */   @NotNull
/* 23 */   public static final TaskExecutionMetadataAttributes INSTANCE = new TaskExecutionMetadataAttributes(); @NotNull private static final AttributeDescriptor.Json<LlmPromptTaskDebugInfo> llmPromptTaskDebugInfo = new TaskExecutionMetadataAttributes$llmPromptTaskDebugInfo$1(); @NotNull public final AttributeDescriptor.Json<LlmPromptTaskDebugInfo> getLlmPromptTaskDebugInfo() { return llmPromptTaskDebugInfo; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\002*\001\000\b\n\030\0002\b\022\004\022\0020\0020\001J\020\020\003\032\0020\0022\006\020\004\032\0020\005H\024J\020\020\006\032\0020\0052\006\020\004\032\0020\002H\024¨\006\007"}, d2 = {"ai/grazie/model/task/data/TaskExecutionMetadataAttributes$llmPromptTaskDebugInfo$1", "Lai/grazie/utils/attributes/AttributeDescriptor$Json;", "Lai/grazie/model/task/data/LlmPromptTaskDebugInfo;", "fromJson", "value", "", "toJson", "model-task"}) @SourceDebugExtension({"SMAP\nLlmPromptTaskDebugInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LlmPromptTaskDebugInfo.kt\nai/grazie/model/task/data/TaskExecutionMetadataAttributes$llmPromptTaskDebugInfo$1\n+ 2 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,33:1\n28#2:34\n*S KotlinDebug\n*F\n+ 1 LlmPromptTaskDebugInfo.kt\nai/grazie/model/task/data/TaskExecutionMetadataAttributes$llmPromptTaskDebugInfo$1\n*L\n25#1:34\n*E\n"}) public static final class TaskExecutionMetadataAttributes$llmPromptTaskDebugInfo$1 extends AttributeDescriptor.Json<LlmPromptTaskDebugInfo> { TaskExecutionMetadataAttributes$llmPromptTaskDebugInfo$1() { super("llmPromptTaskDebugInfo", true); }
/*    */      protected String toJson(LlmPromptTaskDebugInfo value) {
/* 25 */       Intrinsics.checkNotNullParameter(value, "value"); JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0; return 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 34 */         this_$iv.string((SerializationStrategy)LlmPromptTaskDebugInfo.Companion.serializer(), value);
/*    */     }
/*    */     
/*    */     protected LlmPromptTaskDebugInfo fromJson(String value) {
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       return (LlmPromptTaskDebugInfo)JSON.Default.INSTANCE.parse((DeserializationStrategy)LlmPromptTaskDebugInfo.Companion.serializer(), value);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\data\TaskExecutionMetadataAttributes.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */