/*    */ package ai.grazie.model.llm.chat.function;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\n\002\020\021\n\002\b\004\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\016\032\b\022\004\022\0020\0040\017HÆ\001R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\034\020\t\032\b\022\004\022\0020\0040\nX\004¢\006\n\n\002\020\r\032\004\b\013\020\f¨\006\020"}, d2 = {"Lai/grazie/model/llm/chat/function/LLMFunctionCall$Companion;", "", "()V", "Auto", "Lai/grazie/model/llm/chat/function/LLMFunctionCall;", "getAuto", "()Lai/grazie/model/llm/chat/function/LLMFunctionCall;", "None", "getNone", "defaults", "", "getDefaults$model_llm", "()[Lai/grazie/model/llm/chat/function/LLMFunctionCall;", "[Lai/grazie/model/llm/chat/function/LLMFunctionCall;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-llm"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<LLMFunctionCall> serializer() {
/* 37 */     return LLMFunctionCall.LLMFunctionCallSerializer.INSTANCE; } @NotNull
/* 38 */   public final LLMFunctionCall getAuto() { return LLMFunctionCall.access$getAuto$cp(); } @NotNull
/* 39 */   public final LLMFunctionCall getNone() { return LLMFunctionCall.access$getNone$cp(); } @NotNull
/*    */   public final LLMFunctionCall[] getDefaults$model_llm() {
/* 41 */     return LLMFunctionCall.access$getDefaults$cp();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\function\LLMFunctionCall$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */