/*    */ package ai.grazie.model.task.library.v2.vcs;
/*    */ 
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import java.util.List;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\002\b\005\b\007\030\0002\016\022\n\022\b\022\004\022\0020\0030\0020\001B\r\022\006\020\004\032\0020\005¢\006\002\020\006J\026\020\007\032\b\022\004\022\0020\0030\0022\006\020\b\032\0020\005H\024J\026\020\t\032\0020\0052\f\020\b\032\b\022\004\022\0020\0030\002H\024¨\006\n"}, d2 = {"Lai/grazie/model/task/library/v2/vcs/VcsConflictsListAttr;", "Lai/grazie/utils/attributes/AttributeDescriptor$Json;", "", "Lai/grazie/model/task/library/v2/vcs/MergeConflictRanges;", "name", "", "(Ljava/lang/String;)V", "fromJson", "value", "toJson", "model-task"})
/*    */ @SourceDebugExtension({"SMAP\nVcsContexts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VcsContexts.kt\nai/grazie/model/task/library/v2/vcs/VcsConflictsListAttr\n+ 2 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,28:1\n70#2:29\n28#2:30\n*S KotlinDebug\n*F\n+ 1 VcsContexts.kt\nai/grazie/model/task/library/v2/vcs/VcsConflictsListAttr\n*L\n10#1:29\n11#1:30\n*E\n"})
/*    */ public final class VcsConflictsListAttr extends AttributeDescriptor.Json<List<? extends MergeConflictRanges>> {
/*  9 */   public VcsConflictsListAttr(@NotNull String name) { super(name, false); } @NotNull
/* 10 */   protected List<MergeConflictRanges> fromJson(@NotNull String value) { Intrinsics.checkNotNullParameter(value, "value"); JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$parse = 0; return 
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
/* 29 */       (List<MergeConflictRanges>)this_$iv.parse((DeserializationStrategy)new ArrayListSerializer(MergeConflictRanges.Companion.serializer()), value); } @NotNull protected String toJson(@NotNull List value) { Intrinsics.checkNotNullParameter(value, "value"); JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0;
/* 30 */     return this_$iv.string((SerializationStrategy)new ArrayListSerializer(MergeConflictRanges.Companion.serializer()), value); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\vcs\VcsConflictsListAttr.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */