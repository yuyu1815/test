/*    */ package ai.grazie.model.llm.parameters;
/*    */ import ai.grazie.model.llm.annotation.ExperimentalConfigurationOption;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import java.util.Set;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\"\n\002\b\004\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007R\035\020\b\032\b\022\004\022\0020\0040\t¢\006\016\n\000\022\004\b\n\020\002\032\004\b\013\020\f¨\006\r"}, d2 = {"Lai/grazie/model/llm/parameters/LLMConfigurationOptions;", "", "()V", "Reproduce", "Lai/grazie/utils/attributes/Attributes$Key$Bool;", "getReproduce$annotations", "getReproduce", "()Lai/grazie/utils/attributes/Attributes$Key$Bool;", "allKeys", "", "getAllKeys$annotations", "getAllKeys", "()Ljava/util/Set;", "model-llm"})
/*    */ public final class LLMConfigurationOptions {
/*    */   @NotNull
/* 10 */   public static final LLMConfigurationOptions INSTANCE = new LLMConfigurationOptions(); @NotNull private static final Attributes.Key.Bool Reproduce = new Attributes.Key.Bool("llm.configuration-options.reproduce"); @NotNull public final Attributes.Key.Bool getReproduce() { return Reproduce; }
/*    */   
/*    */   @NotNull
/* 13 */   private static final Set<Attributes.Key.Bool> allKeys = SetsKt.setOf(
/* 14 */       Reproduce);
/*    */   
/*    */   @NotNull
/*    */   public final Set<Attributes.Key.Bool> getAllKeys() {
/*    */     return allKeys;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\parameters\LLMConfigurationOptions.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */