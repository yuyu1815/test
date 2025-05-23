/*    */ package com.intellij.ml.llm.matterhorn;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\bf\030\0002\0020\001R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/PairedGroupEvent;", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEventSerializable;", "groupKey", "", "getGroupKey", "()Ljava/lang/String;", "type", "Lcom/intellij/ml/llm/matterhorn/EventType;", "getType", "()Lcom/intellij/ml/llm/matterhorn/EventType;", "core"})
/*    */ public interface PairedGroupEvent extends CustomArtifactEventSerializable { @NotNull
/*    */   String getGroupKey();
/*    */   
/*    */   @NotNull
/*    */   EventType getType();
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls {
/*    */     @NotNull
/*    */     public static SerializableEvent toSerializable(@NotNull PairedGroupEvent $this) {
/* 12 */       return CustomArtifactEventSerializable.DefaultImpls.toSerializable($this);
/*    */     }
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\PairedGroupEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */