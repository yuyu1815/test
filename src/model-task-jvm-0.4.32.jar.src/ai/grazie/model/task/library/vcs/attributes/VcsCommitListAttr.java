/*    */ package ai.grazie.model.task.library.vcs.attributes;
/*    */ 
/*    */ import ai.grazie.model.task.library.vcs.VcsCommit;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.internal.ArrayListSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\002\b\005\b\007\030\0002\016\022\n\022\b\022\004\022\0020\0030\0020\001B\r\022\006\020\004\032\0020\005¢\006\002\020\006J\026\020\007\032\b\022\004\022\0020\0030\0022\006\020\b\032\0020\005H\024J\026\020\t\032\0020\0052\f\020\b\032\b\022\004\022\0020\0030\002H\024¨\006\n"}, d2 = {"Lai/grazie/model/task/library/vcs/attributes/VcsCommitListAttr;", "Lai/grazie/utils/attributes/AttributeDescriptor$Json;", "", "Lai/grazie/model/task/library/vcs/VcsCommit;", "name", "", "(Ljava/lang/String;)V", "fromJson", "value", "toJson", "model-task"})
/*    */ @SourceDebugExtension({"SMAP\nVcsContextsAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VcsContextsAttributes.kt\nai/grazie/model/task/library/vcs/attributes/VcsCommitListAttr\n+ 2 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,20:1\n70#2:21\n28#2:22\n*S KotlinDebug\n*F\n+ 1 VcsContextsAttributes.kt\nai/grazie/model/task/library/vcs/attributes/VcsCommitListAttr\n*L\n17#1:21\n18#1:22\n*E\n"})
/*    */ public final class VcsCommitListAttr extends AttributeDescriptor.Json<List<? extends VcsCommit>> {
/* 16 */   public VcsCommitListAttr(@NotNull String name) { super(name, false); } @NotNull
/* 17 */   protected List<VcsCommit> fromJson(@NotNull String value) { Intrinsics.checkNotNullParameter(value, "value"); JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$parse = 0; return 
/*    */ 
/*    */ 
/*    */       
/* 21 */       (List<VcsCommit>)this_$iv.parse((DeserializationStrategy)new ArrayListSerializer(VcsCommit.Companion.serializer()), value); } @NotNull protected String toJson(@NotNull List value) { Intrinsics.checkNotNullParameter(value, "value"); JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0;
/* 22 */     return this_$iv.string((SerializationStrategy)new ArrayListSerializer(VcsCommit.Companion.serializer()), value); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\vcs\attributes\VcsCommitListAttr.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */