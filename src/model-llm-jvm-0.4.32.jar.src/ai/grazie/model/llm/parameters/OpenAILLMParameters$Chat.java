/*   */ package ai.grazie.model.llm.parameters;
/*   */ import ai.grazie.utils.attributes.Attributes;
/*   */ import kotlin.Metadata;
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/llm/parameters/OpenAILLMParameters$Chat;", "", "()V", "Temperature", "Lai/grazie/utils/attributes/Attributes$Key$Double;", "getTemperature", "()Lai/grazie/utils/attributes/Attributes$Key$Double;", "model-llm"})
/*   */ public final class Chat {
/*   */   @NotNull
/* 9 */   public static final Chat INSTANCE = new Chat(); @NotNull private static final Attributes.Key.Double Temperature = new Attributes.Key.Double("llm.openai.chat.temperature"); @NotNull public final Attributes.Key.Double getTemperature() { return Temperature; }
/*   */ 
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\parameters\OpenAILLMParameters$Chat.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */