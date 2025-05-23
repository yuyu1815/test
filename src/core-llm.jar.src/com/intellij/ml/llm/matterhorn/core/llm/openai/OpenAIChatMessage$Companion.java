/*   */ package com.intellij.ml.llm.matterhorn.core.llm.openai;
/*   */ import kotlin.Metadata;
/*   */ import kotlinx.serialization.KSerializer;
/*   */ 
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIChatMessage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIChatMessage;", "core-llm"})
/*   */ public final class Companion {
/*   */   @NotNull
/*   */   public final KSerializer<OpenAIChatMessage> serializer() {
/* 9 */     return (KSerializer<OpenAIChatMessage>)OpenAIChatMessage.$serializer.INSTANCE;
/*   */   }
/*   */   
/*   */   private Companion() {}
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\openai\OpenAIChatMessage$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */