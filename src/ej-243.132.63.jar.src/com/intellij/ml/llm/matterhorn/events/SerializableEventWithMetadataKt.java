/*    */ package com.intellij.ml.llm.matterhorn.events;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.datetime.Clock;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\032\n\020\000\032\0020\001*\0020\002¨\006\003"}, d2 = {"withMetadata", "Lcom/intellij/ml/llm/matterhorn/events/SerializableEventWithMetadata;", "Lcom/intellij/ml/llm/matterhorn/events/SerializableEvent;", "core"})
/*    */ public final class SerializableEventWithMetadataKt
/*    */ {
/*    */   @NotNull
/*    */   public static final SerializableEventWithMetadata withMetadata(@NotNull SerializableEvent $this$withMetadata) {
/* 17 */     Intrinsics.checkNotNullParameter($this$withMetadata, "<this>"); return new SerializableEventWithMetadata($this$withMetadata, Clock.System.INSTANCE.now().toEpochMilliseconds());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\events\SerializableEventWithMetadataKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */