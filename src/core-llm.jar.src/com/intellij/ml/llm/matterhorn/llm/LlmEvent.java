/*    */ package com.intellij.ml.llm.matterhorn.llm;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.CustomArtifactEventSerializable;
/*    */ import com.intellij.ml.llm.matterhorn.events.SerializableEvent;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\bv\030\0002\0020\001\001\004\002\003\004\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/LlmEvent;", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEventSerializable;", "Lcom/intellij/ml/llm/matterhorn/llm/LlmRequestEvent;", "Lcom/intellij/ml/llm/matterhorn/llm/LlmRequestFailed;", "Lcom/intellij/ml/llm/matterhorn/llm/LlmResponseEvent;", "Lcom/intellij/ml/llm/matterhorn/llm/LongDelayDetected;", "core"})
/*    */ public interface LlmEvent
/*    */   extends CustomArtifactEventSerializable
/*    */ {
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls {
/*    */     @NotNull
/*    */     public static SerializableEvent toSerializable(@NotNull LlmEvent $this) {
/* 16 */       return CustomArtifactEventSerializable.DefaultImpls.toSerializable($this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\llm\LlmEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */