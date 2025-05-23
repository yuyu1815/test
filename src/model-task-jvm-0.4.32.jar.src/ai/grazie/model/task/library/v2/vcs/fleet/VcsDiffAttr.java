/*    */ package ai.grazie.model.task.library.v2.vcs.fleet;
/*    */ 
/*    */ import ai.grazie.utils.json.JSON;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\020 \n\002\020\016\n\002\b\006\b\007\030\0002\016\022\n\022\b\022\004\022\0020\0030\0020\001B\r\022\006\020\004\032\0020\003¢\006\002\020\005J\026\020\006\032\b\022\004\022\0020\0030\0022\006\020\007\032\0020\003H\024J\026\020\b\032\0020\0032\f\020\007\032\b\022\004\022\0020\0030\002H\024¨\006\t"}, d2 = {"Lai/grazie/model/task/library/v2/vcs/fleet/VcsDiffAttr;", "Lai/grazie/utils/attributes/AttributeDescriptor$Json;", "", "", "name", "(Ljava/lang/String;)V", "fromJson", "value", "toJson", "model-task"})
/*    */ @SourceDebugExtension({"SMAP\nFleetVcsContextsAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetVcsContextsAttributes.kt\nai/grazie/model/task/library/v2/vcs/fleet/VcsDiffAttr\n+ 2 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,18:1\n70#2:19\n28#2:20\n*S KotlinDebug\n*F\n+ 1 FleetVcsContextsAttributes.kt\nai/grazie/model/task/library/v2/vcs/fleet/VcsDiffAttr\n*L\n9#1:19\n10#1:20\n*E\n"})
/*    */ public final class VcsDiffAttr extends AttributeDescriptor.Json<List<? extends String>> {
/*  8 */   public VcsDiffAttr(@NotNull String name) { super(name, false); } @NotNull
/*  9 */   protected List<String> fromJson(@NotNull String value) { Intrinsics.checkNotNullParameter(value, "value"); JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$parse = 0; return 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 19 */       (List<String>)this_$iv.parse((DeserializationStrategy)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE), value); } @NotNull protected String toJson(@NotNull List value) { Intrinsics.checkNotNullParameter(value, "value"); JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0;
/* 20 */     return this_$iv.string((SerializationStrategy)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE), value); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\vcs\fleet\VcsDiffAttr.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */