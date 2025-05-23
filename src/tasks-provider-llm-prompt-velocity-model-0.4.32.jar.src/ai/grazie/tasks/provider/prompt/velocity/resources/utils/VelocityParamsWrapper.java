/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.utils;@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\003\n\002\020 \n\002\b\b\n\002\020\013\n\000\n\002\020\b\n\000\n\002\020\006\n\002\b\t\bf\030\0002\0020\001J\021\020\n\032\0020\0002\006\020\013\032\0020\003H¦\002J\016\020\f\032\b\022\004\022\0020\0000\007H&J\016\020\r\032\b\022\004\022\0020\0000\007H\026J\b\020\016\032\0020\003H&J\b\020\017\032\0020\020H&J\b\020\021\032\0020\022H&J\b\020\023\032\0020\024H&J\b\020\025\032\0020\020H&J\b\020\026\032\0020\020H\026J\020\020\027\032\0020\0032\006\020\030\032\0020\001H\026J\b\020\031\032\0020\020H&J\b\020\032\032\0020\020H\026J\020\020\033\032\0020\0032\006\020\030\032\0020\003H\026J\b\020\034\032\0020\003H&R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\030\020\006\032\b\022\004\022\0020\0030\007X¦\004¢\006\006\032\004\b\b\020\tø\001\000\002\006\n\004\b!0\001¨\006\035À\006\001"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/utils/VelocityParamsWrapper;", "", "velocityName", "", "getVelocityName", "()Ljava/lang/String;", "path", "", "getPath", "()Ljava/util/List;", "get", "field", "asArray", "asReversedArray", "asString", "asBool", "", "asInt", "", "asDouble", "", "isNull", "isNotNull", "orDefault", "default", "isEmpty", "isNotEmpty", "ifEmpty", "toString", "tasks-provider-llm-prompt-velocity-model"})
/*    */ @SourceDebugExtension({"SMAP\nVelocityParamsWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityParamsWrapper.kt\nai/grazie/tasks/provider/prompt/velocity/resources/utils/VelocityParamsWrapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
/*    */ public interface VelocityParamsWrapper { @NotNull
/*    */   String getVelocityName();
/*    */   @NotNull
/*    */   List<String> getPath();
/*    */   
/*    */   @NotNull
/*    */   default List<VelocityParamsWrapper> asReversedArray() {
/* 10 */     return CollectionsKt.reversed(asArray());
/*    */   } @NotNull
/*    */   VelocityParamsWrapper get(@NotNull String paramString); @NotNull
/*    */   List<VelocityParamsWrapper> asArray(); @NotNull
/*    */   String asString(); boolean asBool(); int asInt(); double asDouble();
/*    */   boolean isNull();
/*    */   default boolean isNotNull() {
/* 17 */     return !isNull(); } @NotNull
/* 18 */   default String orDefault(@NotNull Object default) { Intrinsics.checkNotNullParameter(default, "default"); return isNull() ? default.toString() : toString(); }
/*    */    boolean isEmpty();
/* 20 */   default boolean isNotEmpty() { return !isEmpty(); } @NotNull
/* 21 */   default String ifEmpty(@NotNull String default) { Intrinsics.checkNotNullParameter(default, "default"); CharSequence charSequence = toString();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 29 */     int $i$a$-ifEmpty-VelocityParamsWrapper$ifEmpty$1 = 0;
/*    */     return ((charSequence.length() == 0)) ? default : (String)charSequence; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   String toString(); }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resource\\utils\VelocityParamsWrapper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */