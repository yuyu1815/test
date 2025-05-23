/*    */ package ai.grazie.model.llm.prompt;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\t\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\r\032\b\022\004\022\0020\0040\016HÆ\001R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\f\020\006¨\006\017"}, d2 = {"Lai/grazie/model/llm/prompt/LLMPromptID$Companion;", "", "()V", "LEGACY", "Lai/grazie/model/llm/prompt/LLMPromptID;", "getLEGACY", "()Lai/grazie/model/llm/prompt/LLMPromptID;", "TASK", "getTASK", "TEST", "getTEST", "UNKNOWN", "getUNKNOWN", "serializer", "Lkotlinx/serialization/KSerializer;", "model-llm"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<LLMPromptID> serializer() {
/* 17 */     return (KSerializer<LLMPromptID>)LLMPromptID.Serializer.INSTANCE; } @NotNull
/* 18 */   public final LLMPromptID getTASK() { return LLMPromptID.access$getTASK$cp(); } @NotNull
/* 19 */   public final LLMPromptID getTEST() { return LLMPromptID.access$getTEST$cp(); } @NotNull
/* 20 */   public final LLMPromptID getUNKNOWN() { return LLMPromptID.access$getUNKNOWN$cp(); } @NotNull
/* 21 */   public final LLMPromptID getLEGACY() { return LLMPromptID.access$getLEGACY$cp(); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\prompt\LLMPromptID$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */