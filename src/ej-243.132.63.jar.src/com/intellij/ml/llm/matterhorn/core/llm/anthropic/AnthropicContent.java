/*    */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;@Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\bw\030\000 \b2\0020\001:\001\bR\034\020\002\032\004\030\0010\0038&X§\004¢\006\f\022\004\b\004\020\005\032\004\b\006\020\007\001\006\t\n\013\f\r\016¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicContent;", "", "cache", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;", "getCache$annotations", "()V", "getCache", "()Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;", "Companion", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicImageContent;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicRedactedThinkingContent;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicTextContent;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicThinkingContent;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolContent;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolResultContent;", "core-llm"})
/*    */ public interface AnthropicContent {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   @Nullable
/*    */   AnthropicCacheControl getCache();
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicContent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicContent;", "core-llm"})
/*    */   public static final class Companion {
/*    */     @NotNull
/*    */     public final KSerializer<AnthropicContent> serializer() {
/* 14 */       KClass[] arrayOfKClass = new KClass[6]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(AnthropicImageContent.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(AnthropicRedactedThinkingContent.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(AnthropicTextContent.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(AnthropicThinkingContent.class); arrayOfKClass[4] = Reflection.getOrCreateKotlinClass(AnthropicToolContent.class); arrayOfKClass[5] = Reflection.getOrCreateKotlinClass(AnthropicToolResultContent.class); KSerializer[] arrayOfKSerializer = new KSerializer[6]; arrayOfKSerializer[0] = (KSerializer)AnthropicImageContent.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)AnthropicRedactedThinkingContent.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)AnthropicTextContent.$serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)AnthropicThinkingContent.$serializer.INSTANCE; arrayOfKSerializer[4] = (KSerializer)AnthropicToolContent.$serializer.INSTANCE; arrayOfKSerializer[5] = (KSerializer)AnthropicToolResultContent.$serializer.INSTANCE; return (KSerializer<AnthropicContent>)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.core.llm.anthropic.AnthropicContent", Reflection.getOrCreateKotlinClass(AnthropicContent.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicContent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */