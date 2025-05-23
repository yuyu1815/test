/*    */ package com.intellij.ml.llm.matterhorn.llm;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\n\b\002\030\000 \n2\b\022\004\022\0020\0000\001:\001\nB\t\b\002¢\006\004\b\002\020\003j\002\b\004j\002\b\005j\002\b\006j\002\b\007j\002\b\bj\002\b\t¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;", "", "<init>", "(Ljava/lang/String;I)V", "OpenAI", "Anthropic", "Nebius", "DeepSeek", "Google", "ServerMode", "Companion", "core"})
/*    */ public enum LlmProvider {
/*    */   @NotNull
/*    */   public static final Companion Companion;
/*    */   @NotNull
/*    */   private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;", "core"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<LlmProvider> serializer() {
/*    */       return get$cachedSerializer();
/*    */     }
/*    */   }
/*    */   
/* 22 */   OpenAI,
/* 23 */   Anthropic,
/* 24 */   Nebius,
/* 25 */   DeepSeek,
/* 26 */   Google,
/* 27 */   ServerMode; static { Companion = new Companion(null);
/* 28 */     $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, () -> EnumsKt.createSimpleEnumSerializer("com.intellij.ml.llm.matterhorn.llm.LlmProvider", (Enum[])values())); } @NotNull public static EnumEntries<LlmProvider> getEntries() { return $ENTRIES; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\llm\LlmProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */