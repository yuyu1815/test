/*    */ package ai.grazie.model.task.library.code.attributes;
/*    */ 
/*    */ import ai.grazie.model.task.library.code.CodeCompleteMetadata;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\b\007\030\0002\b\022\004\022\0020\0020\001B\r\022\006\020\003\032\0020\004¢\006\002\020\005J\020\020\006\032\0020\0022\006\020\007\032\0020\004H\024J\020\020\b\032\0020\0042\006\020\007\032\0020\002H\024¨\006\t"}, d2 = {"Lai/grazie/model/task/library/code/attributes/CodeCompleteMetadataAttr;", "Lai/grazie/utils/attributes/AttributeDescriptor$Json;", "Lai/grazie/model/task/library/code/CodeCompleteMetadata;", "name", "", "(Ljava/lang/String;)V", "fromJson", "value", "toJson", "model-task"})
/*    */ @SourceDebugExtension({"SMAP\nCodeCompletionAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CodeCompletionAttributes.kt\nai/grazie/model/task/library/code/attributes/CodeCompleteMetadataAttr\n+ 2 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,46:1\n28#2:47\n70#2:48\n*S KotlinDebug\n*F\n+ 1 CodeCompletionAttributes.kt\nai/grazie/model/task/library/code/attributes/CodeCompleteMetadataAttr\n*L\n35#1:47\n39#1:48\n*E\n"})
/*    */ public final class CodeCompleteMetadataAttr
/*    */   extends AttributeDescriptor.Json<CodeCompleteMetadata>
/*    */ {
/*    */   public CodeCompleteMetadataAttr(@NotNull String name) {
/* 33 */     super(name, false);
/*    */   } @NotNull
/* 35 */   protected String toJson(@NotNull CodeCompleteMetadata value) { Intrinsics.checkNotNullParameter(value, "value"); JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0; return 
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
/* 47 */       this_$iv.string((SerializationStrategy)CodeCompleteMetadata.Companion.serializer(), value); } @NotNull protected CodeCompleteMetadata fromJson(@NotNull String value) { Intrinsics.checkNotNullParameter(value, "value"); JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$parse = 0;
/* 48 */     return (CodeCompleteMetadata)this_$iv.parse((DeserializationStrategy)CodeCompleteMetadata.Companion.serializer(), value); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\code\attributes\CodeCompleteMetadataAttr.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */