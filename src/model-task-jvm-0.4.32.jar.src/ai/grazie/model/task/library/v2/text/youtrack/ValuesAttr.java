/*    */ package ai.grazie.model.task.library.v2.text.youtrack;
/*    */ 
/*    */ import ai.grazie.utils.json.JSON;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\020\021\n\002\030\002\n\000\n\002\020\016\n\002\b\007\b\007\030\0002\016\022\n\022\b\022\004\022\0020\0030\0020\001B\r\022\006\020\004\032\0020\005¢\006\002\020\006J\033\020\007\032\b\022\004\022\0020\0030\0022\006\020\b\032\0020\005H\024¢\006\002\020\tJ\033\020\n\032\0020\0052\f\020\b\032\b\022\004\022\0020\0030\002H\024¢\006\002\020\013¨\006\f"}, d2 = {"Lai/grazie/model/task/library/v2/text/youtrack/ValuesAttr;", "Lai/grazie/utils/attributes/AttributeDescriptor$Json;", "", "Lai/grazie/model/task/library/v2/text/youtrack/FieldValue;", "name", "", "(Ljava/lang/String;)V", "fromJson", "value", "(Ljava/lang/String;)[Lai/grazie/model/task/library/v2/text/youtrack/FieldValue;", "toJson", "([Lai/grazie/model/task/library/v2/text/youtrack/FieldValue;)Ljava/lang/String;", "model-task"})
/*    */ @SourceDebugExtension({"SMAP\nAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Attributes.kt\nai/grazie/model/task/library/v2/text/youtrack/ValuesAttr\n+ 2 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,28:1\n28#2:29\n70#2:30\n*S KotlinDebug\n*F\n+ 1 Attributes.kt\nai/grazie/model/task/library/v2/text/youtrack/ValuesAttr\n*L\n10#1:29\n14#1:30\n*E\n"})
/*    */ public final class ValuesAttr extends AttributeDescriptor.Json<FieldValue[]> {
/*  8 */   public ValuesAttr(@NotNull String name) { super(name, false); }
/*    */   @NotNull
/* 10 */   protected String toJson(@NotNull FieldValue[] value) { Intrinsics.checkNotNullParameter(value, "value"); JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0; return 
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
/* 29 */       this_$iv.string((SerializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(FieldValue.class), FieldValue.Companion.serializer()), value); } @NotNull protected FieldValue[] fromJson(@NotNull String value) { Intrinsics.checkNotNullParameter(value, "value"); JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$parse = 0;
/* 30 */     return (FieldValue[])this_$iv.parse((DeserializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(FieldValue.class), FieldValue.Companion.serializer()), value); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\text\youtrack\ValuesAttr.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */