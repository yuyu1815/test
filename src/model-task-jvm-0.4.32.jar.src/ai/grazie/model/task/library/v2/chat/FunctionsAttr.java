/*    */ package ai.grazie.model.task.library.v2.chat;
/*    */ 
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.StringCompanionObject;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\020 \n\002\020\016\n\002\b\006\b\027\030\0002\016\022\n\022\b\022\004\022\0020\0030\0020\001B\r\022\006\020\004\032\0020\003¢\006\002\020\005J\026\020\006\032\b\022\004\022\0020\0030\0022\006\020\007\032\0020\003H\024J\026\020\b\032\0020\0032\f\020\007\032\b\022\004\022\0020\0030\002H\024¨\006\t"}, d2 = {"Lai/grazie/model/task/library/v2/chat/FunctionsAttr;", "Lai/grazie/utils/attributes/AttributeDescriptor$Json;", "", "", "name", "(Ljava/lang/String;)V", "fromJson", "value", "toJson", "model-task"})
/*    */ public class FunctionsAttr
/*    */   extends AttributeDescriptor.Json<List<? extends String>>
/*    */ {
/*    */   public FunctionsAttr(@NotNull String name) {
/* 31 */     super(name, false); } @NotNull
/*    */   protected List<String> fromJson(@NotNull String value) {
/* 33 */     Intrinsics.checkNotNullParameter(value, "value"); return (List<String>)JSON.Default.INSTANCE.parse((DeserializationStrategy)BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE)), value);
/*    */   }
/*    */   @NotNull
/*    */   protected String toJson(@NotNull List value) {
/* 37 */     Intrinsics.checkNotNullParameter(value, "value"); return JSON.Default.INSTANCE.string((SerializationStrategy)BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE)), value);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\chat\FunctionsAttr.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */