/*    */ package ai.grazie.model.llm.chat.function;
/*    */ 
/*    */ import ai.grazie.utils.json.JSONObject;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001¨\006\t"}, d2 = {"Lai/grazie/model/llm/chat/function/LLMFunctionParameters$Companion;", "", "()V", "fromJsonString", "Lai/grazie/model/llm/chat/function/LLMFunctionParameters;", "json", "", "serializer", "Lkotlinx/serialization/KSerializer;", "model-llm"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<LLMFunctionParameters> serializer() {
/* 27 */     return LLMFunctionParameters.FunctionParametersSerializer.INSTANCE; } @NotNull
/* 28 */   public final LLMFunctionParameters fromJsonString(@NotNull String json) { Intrinsics.checkNotNullParameter(json, "json"); return new LLMFunctionParameters(JSONObject.Companion.invoke$default(JSONObject.Companion, json, null, 2, null)); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\function\LLMFunctionParameters$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */