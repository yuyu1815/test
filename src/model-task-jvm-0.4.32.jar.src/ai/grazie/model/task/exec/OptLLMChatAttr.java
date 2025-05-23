/*    */ package ai.grazie.model.task.exec;
/*    */ 
/*    */ import ai.grazie.model.llm.chat.v5.LLMChat;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\b\007\030\0002\n\022\006\022\004\030\0010\0020\001B\r\022\006\020\003\032\0020\004¢\006\002\020\005J\020\020\006\032\0020\0022\006\020\007\032\0020\004H\024J\020\020\b\032\0020\0042\006\020\007\032\0020\002H\024¨\006\t"}, d2 = {"Lai/grazie/model/task/exec/OptLLMChatAttr;", "Lai/grazie/utils/attributes/AttributeDescriptor$Json;", "Lai/grazie/model/llm/chat/v5/LLMChat;", "name", "", "(Ljava/lang/String;)V", "fromJson", "value", "toJson", "model-task"})
/*    */ @SourceDebugExtension({"SMAP\nTaskParametersAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskParametersAttributes.kt\nai/grazie/model/task/exec/OptLLMChatAttr\n+ 2 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,54:1\n70#2:55\n28#2:56\n*S KotlinDebug\n*F\n+ 1 TaskParametersAttributes.kt\nai/grazie/model/task/exec/OptLLMChatAttr\n*L\n26#1:55\n30#1:56\n*E\n"})
/*    */ public final class OptLLMChatAttr
/*    */   extends AttributeDescriptor.Json<LLMChat>
/*    */ {
/*    */   public OptLLMChatAttr(@NotNull String name) {
/* 24 */     super(name, true);
/*    */   } @NotNull
/* 26 */   protected LLMChat fromJson(@NotNull String value) { Intrinsics.checkNotNullParameter(value, "value"); JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$parse = 0; return 
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
/* 55 */       (LLMChat)this_$iv.parse((DeserializationStrategy)LLMChat.Companion.serializer(), value); } @NotNull protected String toJson(@NotNull LLMChat value) { Intrinsics.checkNotNullParameter(value, "value"); JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0;
/* 56 */     return this_$iv.string((SerializationStrategy)LLMChat.Companion.serializer(), value); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\exec\OptLLMChatAttr.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */