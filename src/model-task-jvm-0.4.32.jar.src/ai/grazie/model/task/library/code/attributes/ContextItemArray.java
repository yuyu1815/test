/*    */ package ai.grazie.model.task.library.code.attributes;
/*    */ 
/*    */ import ai.grazie.model.jet.v2.ContextItem;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.internal.ReferenceArraySerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\020\021\n\002\030\002\n\000\n\002\020\016\n\002\b\007\b\007\030\0002\016\022\n\022\b\022\004\022\0020\0030\0020\001B\r\022\006\020\004\032\0020\005¢\006\002\020\006J\033\020\007\032\b\022\004\022\0020\0030\0022\006\020\b\032\0020\005H\024¢\006\002\020\tJ\033\020\n\032\0020\0052\f\020\b\032\b\022\004\022\0020\0030\002H\024¢\006\002\020\013¨\006\f"}, d2 = {"Lai/grazie/model/task/library/code/attributes/ContextItemArray;", "Lai/grazie/utils/attributes/AttributeDescriptor$Json;", "", "Lai/grazie/model/jet/v2/ContextItem;", "name", "", "(Ljava/lang/String;)V", "fromJson", "value", "(Ljava/lang/String;)[Lai/grazie/model/jet/v2/ContextItem;", "toJson", "([Lai/grazie/model/jet/v2/ContextItem;)Ljava/lang/String;", "model-task"})
/*    */ @SourceDebugExtension({"SMAP\nCodeCompletionAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CodeCompletionAttributes.kt\nai/grazie/model/task/library/code/attributes/ContextItemArray\n+ 2 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,46:1\n28#2:47\n70#2:48\n*S KotlinDebug\n*F\n+ 1 CodeCompletionAttributes.kt\nai/grazie/model/task/library/code/attributes/ContextItemArray\n*L\n24#1:47\n28#1:48\n*E\n"})
/*    */ public final class ContextItemArray
/*    */   extends AttributeDescriptor.Json<ContextItem[]>
/*    */ {
/*    */   public ContextItemArray(@NotNull String name) {
/* 22 */     super(name, false);
/*    */   } @NotNull
/* 24 */   protected String toJson(@NotNull ContextItem[] value) { Intrinsics.checkNotNullParameter(value, "value"); JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0; return 
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
/* 47 */       this_$iv.string((SerializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(ContextItem.class), ContextItem.Companion.serializer()), value); } @NotNull protected ContextItem[] fromJson(@NotNull String value) { Intrinsics.checkNotNullParameter(value, "value"); JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$parse = 0;
/* 48 */     return (ContextItem[])this_$iv.parse((DeserializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(ContextItem.class), ContextItem.Companion.serializer()), value); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\code\attributes\ContextItemArray.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */