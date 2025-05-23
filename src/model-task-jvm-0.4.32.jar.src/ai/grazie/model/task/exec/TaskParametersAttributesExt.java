/*    */ package ai.grazie.model.task.exec;
/*    */ 
/*    */ import ai.grazie.model.llm.chat.v5.LLMChat;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import ai.grazie.utils.attributes.AttributesBuilder;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.SerializationStrategy;
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
/*    */ @Deprecated(message = "In favor of OptLLMChatAttr methods")
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\024\020\003\032\0020\004*\0020\0052\b\020\006\032\004\030\0010\007J\f\020\b\032\004\030\0010\007*\0020\t¨\006\n"}, d2 = {"Lai/grazie/model/task/exec/TaskParametersAttributesExt;", "", "()V", "chatHistoryOpt", "", "Lai/grazie/utils/attributes/AttributesBuilder;", "value", "Lai/grazie/model/llm/chat/v5/LLMChat;", "getChatHistory", "Lai/grazie/model/task/exec/TaskParameters;", "model-task"})
/*    */ @SourceDebugExtension({"SMAP\nTaskParametersAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskParametersAttributes.kt\nai/grazie/model/task/exec/TaskParametersAttributesExt\n+ 2 TaskParametersAttributes.kt\nai/grazie/model/task/exec/TaskParametersAttributesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,54:1\n53#2:55\n1#3:56\n1#3:58\n28#4:57\n70#4:59\n*S KotlinDebug\n*F\n+ 1 TaskParametersAttributes.kt\nai/grazie/model/task/exec/TaskParametersAttributesExt\n*L\n37#1:55\n37#1:56\n37#1:57\n41#1:59\n*E\n"})
/*    */ public final class TaskParametersAttributesExt
/*    */ {
/*    */   @NotNull
/*    */   public static final TaskParametersAttributesExt INSTANCE = new TaskParametersAttributesExt();
/*    */   
/*    */   public final void chatHistoryOpt(@NotNull AttributesBuilder $this$chatHistoryOpt, @Nullable LLMChat value) {
/* 37 */     Intrinsics.checkNotNullParameter($this$chatHistoryOpt, "<this>"); AttributesBuilder attributesBuilder1 = $this$chatHistoryOpt; Attributes.Key.Json key$iv = TaskParametersAttributes.Chat.History.INSTANCE.getKey(); int $i$f$optObj = 0;
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
/* 55 */     LLMChat lLMChat = value;
/* 56 */     String str1 = key$iv.getFqdn(); AttributesBuilder attributesBuilder2 = attributesBuilder1; int $i$a$-let-TaskParametersAttributesKt$optObj$1$iv = 0; JSON this_$iv$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0;
/* 57 */     String str2 = this_$iv$iv.string((SerializationStrategy)LLMChat.Companion.serializer(), lLMChat); attributesBuilder1.optJson(key$iv.getFqdn(), (value != null) ? str2 : null); } @Nullable public final LLMChat getChatHistory(@NotNull TaskParameters $this$getChatHistory) { Intrinsics.checkNotNullParameter($this$getChatHistory, "<this>"); Attributes.Value.Json it = $this$getChatHistory.getAttributes().getJson(TaskParametersAttributes.Chat.History.INSTANCE.getKey());
/* 58 */     int $i$a$-let-TaskParametersAttributesExt$getChatHistory$1 = 0; JSON jSON = (JSON)JSON.Default.INSTANCE; String value$iv = it.getValue(); int $i$f$parse = 0; $this$getChatHistory.getAttributes().getJson(TaskParametersAttributes.Chat.History.INSTANCE.getKey());
/* 59 */     return ($this$getChatHistory.getAttributes().getJson(TaskParametersAttributes.Chat.History.INSTANCE.getKey()) != null) ? (LLMChat)jSON.parse((DeserializationStrategy)LLMChat.Companion.serializer(), value$iv) : null; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\exec\TaskParametersAttributesExt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */