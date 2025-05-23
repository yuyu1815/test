/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.utils;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\005¨\006\007"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/utils/VelocityJsonEscapingTool;", "", "<init>", "()V", "escape", "", "text", "tasks-provider-llm-prompt-velocity-model"})
/*    */ @SourceDebugExtension({"SMAP\nVelocityJsonEscapingTool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityJsonEscapingTool.kt\nai/grazie/tasks/provider/prompt/velocity/resources/utils/VelocityJsonEscapingTool\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n*L\n1#1,11:1\n113#2:12\n*S KotlinDebug\n*F\n+ 1 VelocityJsonEscapingTool.kt\nai/grazie/tasks/provider/prompt/velocity/resources/utils/VelocityJsonEscapingTool\n*L\n8#1:12\n*E\n"})
/*    */ public final class VelocityJsonEscapingTool {
/*    */   @NotNull
/*    */   public final String escape(@NotNull String text) {
/*  8 */     Intrinsics.checkNotNullParameter(text, "text"); StringFormat $this$encodeToString$iv = (StringFormat)Json.Default; int $i$f$encodeToString = 0;
/*    */ 
/*    */ 
/*    */     
/* 12 */     $this$encodeToString$iv.getSerializersModule(); return StringsKt.removeSurrounding($this$encodeToString$iv.encodeToString((SerializationStrategy)StringSerializer.INSTANCE, text), "\"");
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final VelocityJsonEscapingTool INSTANCE = new VelocityJsonEscapingTool();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resource\\utils\VelocityJsonEscapingTool.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */