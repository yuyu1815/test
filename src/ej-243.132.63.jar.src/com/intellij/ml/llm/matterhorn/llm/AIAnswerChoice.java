/*   */ package com.intellij.ml.llm.matterhorn.llm;@Serializable @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\003\n\002\020 \n\002\020\006\n\002\b\005\n\002\030\002\n\002\030\002\n\000\bw\030\000 \r2\0020\001:\001\rR\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\032\020\006\032\n\022\004\022\0020\b\030\0010\007X¦\004¢\006\006\032\004\b\t\020\nR\024\020\013\032\004\030\0010\003X¦\004¢\006\006\032\004\b\f\020\005\001\002\016\017¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/AIAnswerChoice;", "", "content", "", "getContent", "()Ljava/lang/String;", "logits", "", "", "getLogits", "()Ljava/util/List;", "id", "getId", "Companion", "Lcom/intellij/ml/llm/matterhorn/llm/AIContentAnswerChoice;", "Lcom/intellij/ml/llm/matterhorn/llm/AIToolUseAnswerChoice;", "core"})
/*   */ public interface AIAnswerChoice { @NotNull
/*   */   public static final Companion Companion = Companion.$$INSTANCE; @NotNull
/*   */   String getContent(); @Nullable
/*   */   List<Double> getLogits(); @Nullable
/*   */   String getId(); @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/AIAnswerChoice$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswerChoice;", "core"})
/*   */   public static final class Companion { @NotNull
/* 8 */     public final KSerializer<AIAnswerChoice> serializer() { KClass[] arrayOfKClass = new KClass[2]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(AIContentAnswerChoice.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(AIToolUseAnswerChoice.class); KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)AIContentAnswerChoice.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)AIToolUseAnswerChoice.$serializer.INSTANCE; return (KSerializer<AIAnswerChoice>)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.llm.AIAnswerChoice", Reflection.getOrCreateKotlinClass(AIAnswerChoice.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]); }
/*   */      }
/*   */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\llm\AIAnswerChoice.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */