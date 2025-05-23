/*    */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SealedClassSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicContent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicContent;", "core-llm"})
/*    */ public final class Companion {
/*    */   @NotNull
/*    */   public final KSerializer<AnthropicContent> serializer() {
/* 14 */     KClass[] arrayOfKClass = new KClass[6]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(AnthropicImageContent.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(AnthropicRedactedThinkingContent.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(AnthropicTextContent.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(AnthropicThinkingContent.class); arrayOfKClass[4] = Reflection.getOrCreateKotlinClass(AnthropicToolContent.class); arrayOfKClass[5] = Reflection.getOrCreateKotlinClass(AnthropicToolResultContent.class); KSerializer[] arrayOfKSerializer = new KSerializer[6]; arrayOfKSerializer[0] = (KSerializer)AnthropicImageContent.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)AnthropicRedactedThinkingContent.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)AnthropicTextContent.$serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)AnthropicThinkingContent.$serializer.INSTANCE; arrayOfKSerializer[4] = (KSerializer)AnthropicToolContent.$serializer.INSTANCE; arrayOfKSerializer[5] = (KSerializer)AnthropicToolResultContent.$serializer.INSTANCE; return (KSerializer<AnthropicContent>)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.core.llm.anthropic.AnthropicContent", Reflection.getOrCreateKotlinClass(AnthropicContent.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicContent$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */