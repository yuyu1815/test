/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.events.SerializableEvent;
/*    */ import kotlin.Metadata;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\bf\030\0002\0020\0012\0020\002J\b\020\003\032\0020\002H\026¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/CustomArtifactEventSerializable;", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;", "Lcom/intellij/ml/llm/matterhorn/events/SerializableEvent;", "toSerializable", "core"})
/*    */ public interface CustomArtifactEventSerializable
/*    */   extends CustomArtifactEvent, SerializableEvent
/*    */ {
/*    */   @NotNull
/*    */   SerializableEvent toSerializable();
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls
/*    */   {
/*    */     @NotNull
/*    */     public static SerializableEvent toSerializable(@NotNull CustomArtifactEventSerializable $this) {
/* 38 */       return $this;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\CustomArtifactEventSerializable.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */