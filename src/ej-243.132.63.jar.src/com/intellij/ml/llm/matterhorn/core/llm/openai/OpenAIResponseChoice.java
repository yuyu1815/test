/*    */ package com.intellij.ml.llm.matterhorn.core.llm.openai;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Serializable(with = OpenAIResponseChoiceDeserializer.class)
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\020\t\n\002\b\003\n\002\030\002\n\002\b\004\bg\030\000 \n2\0020\001:\001\nR\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\024\020\006\032\004\030\0010\007X¦\004¢\006\006\032\004\b\b\020\t¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChoice;", "", "index", "", "getIndex", "()J", "finishDetails", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/FinishDetails;", "getFinishDetails", "()Lcom/intellij/ml/llm/matterhorn/core/llm/openai/FinishDetails;", "Companion", "core-llm"})
/*    */ public interface OpenAIResponseChoice
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   long getIndex();
/*    */   
/*    */   @Nullable
/*    */   FinishDetails getFinishDetails();
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChoice$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChoice;", "core-llm"})
/*    */   public static final class Companion
/*    */   {
/*    */     @NotNull
/*    */     public final KSerializer<OpenAIResponseChoice> serializer() {
/* 29 */       return (KSerializer<OpenAIResponseChoice>)new OpenAIResponseChoiceDeserializer();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\openai\OpenAIResponseChoice.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */