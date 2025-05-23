/*    */ package ai.grazie.model.task.library.vcs.attributes;
/*    */ 
/*    */ import ai.grazie.model.task.library.vcs.VcsLog;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\b\007\030\0002\b\022\004\022\0020\0020\001B\r\022\006\020\003\032\0020\004¢\006\002\020\005J\020\020\006\032\0020\0022\006\020\007\032\0020\004H\024J\020\020\b\032\0020\0042\006\020\007\032\0020\002H\024¨\006\t"}, d2 = {"Lai/grazie/model/task/library/vcs/attributes/VcsLogAttr;", "Lai/grazie/utils/attributes/AttributeDescriptor$Json;", "Lai/grazie/model/task/library/vcs/VcsLog;", "name", "", "(Ljava/lang/String;)V", "fromJson", "value", "toJson", "model-task"})
/*    */ @SourceDebugExtension({"SMAP\nVcsContextsAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VcsContextsAttributes.kt\nai/grazie/model/task/library/vcs/attributes/VcsLogAttr\n+ 2 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,20:1\n70#2:21\n28#2:22\n*S KotlinDebug\n*F\n+ 1 VcsContextsAttributes.kt\nai/grazie/model/task/library/vcs/attributes/VcsLogAttr\n*L\n11#1:21\n12#1:22\n*E\n"})
/*    */ public final class VcsLogAttr extends AttributeDescriptor.Json<VcsLog> {
/* 10 */   public VcsLogAttr(@NotNull String name) { super(name, false); } @NotNull
/* 11 */   protected VcsLog fromJson(@NotNull String value) { Intrinsics.checkNotNullParameter(value, "value"); JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$parse = 0; return 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 21 */       (VcsLog)this_$iv.parse((DeserializationStrategy)VcsLog.Companion.serializer(), value); } @NotNull protected String toJson(@NotNull VcsLog value) { Intrinsics.checkNotNullParameter(value, "value"); JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0;
/* 22 */     return this_$iv.string((SerializationStrategy)VcsLog.Companion.serializer(), value); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\vcs\attributes\VcsLogAttr.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */