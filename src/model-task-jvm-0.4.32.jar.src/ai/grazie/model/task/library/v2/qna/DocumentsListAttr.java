/*    */ package ai.grazie.model.task.library.v2.qna;
/*    */ 
/*    */ import ai.grazie.utils.json.JSON;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\002\b\005\b\007\030\0002\016\022\n\022\b\022\004\022\0020\0030\0020\001B\r\022\006\020\004\032\0020\005¢\006\002\020\006J\026\020\007\032\b\022\004\022\0020\0030\0022\006\020\b\032\0020\005H\024J\026\020\t\032\0020\0052\f\020\b\032\b\022\004\022\0020\0030\002H\024¨\006\n"}, d2 = {"Lai/grazie/model/task/library/v2/qna/DocumentsListAttr;", "Lai/grazie/utils/attributes/AttributeDescriptor$Json;", "", "Lai/grazie/model/task/library/v2/qna/ProcessedQADocument;", "name", "", "(Ljava/lang/String;)V", "fromJson", "value", "toJson", "model-task"})
/*    */ @SourceDebugExtension({"SMAP\nQnaAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QnaAttributes.kt\nai/grazie/model/task/library/v2/qna/DocumentsListAttr\n+ 2 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,12:1\n28#2:13\n70#2:14\n*S KotlinDebug\n*F\n+ 1 QnaAttributes.kt\nai/grazie/model/task/library/v2/qna/DocumentsListAttr\n*L\n9#1:13\n10#1:14\n*E\n"})
/*    */ public final class DocumentsListAttr extends AttributeDescriptor.Json<List<? extends ProcessedQADocument>> {
/*  8 */   public DocumentsListAttr(@NotNull String name) { super(name, false); } @NotNull
/*  9 */   protected String toJson(@NotNull List value) { Intrinsics.checkNotNullParameter(value, "value"); JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0; return 
/*    */ 
/*    */ 
/*    */       
/* 13 */       this_$iv.string((SerializationStrategy)new ArrayListSerializer(ProcessedQADocument.Companion.serializer()), value); } @NotNull protected List<ProcessedQADocument> fromJson(@NotNull String value) { Intrinsics.checkNotNullParameter(value, "value"); JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$parse = 0;
/* 14 */     return (List<ProcessedQADocument>)this_$iv.parse((DeserializationStrategy)new ArrayListSerializer(ProcessedQADocument.Companion.serializer()), value); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\qna\DocumentsListAttr.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */