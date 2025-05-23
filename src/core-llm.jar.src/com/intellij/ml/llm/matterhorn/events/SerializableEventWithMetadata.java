/*    */ package com.intellij.ml.llm.matterhorn.events;
/*    */ @Serializable
/*    */ @SerialName("EventWithMetadata")
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\t\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007B-\b\020\022\006\020\b\032\0020\t\022\b\020\002\032\004\030\0010\003\022\006\020\004\032\0020\005\022\b\020\n\032\004\030\0010\013¢\006\004\b\006\020\fJ\t\020\021\032\0020\003HÆ\003J\t\020\022\032\0020\005HÆ\003J\035\020\023\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\001HÖ\003J\t\020\027\032\0020\tHÖ\001J\t\020\030\032\0020\031HÖ\001J%\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 H\001¢\006\002\b!R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\017\020\020¨\006$"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/events/SerializableEventWithMetadata;", "", "event", "Lcom/intellij/ml/llm/matterhorn/events/SerializableEvent;", "timestampMs", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/events/SerializableEvent;J)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/events/SerializableEvent;JLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getEvent", "()Lcom/intellij/ml/llm/matterhorn/events/SerializableEvent;", "getTimestampMs", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*    */ public final class SerializableEventWithMetadata {
/*    */   @NotNull
/*  7 */   public static final Companion Companion = new Companion(null); @NotNull private final SerializableEvent event; private final long timestampMs; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)new PolymorphicSerializer(Reflection.getOrCreateKotlinClass(SerializableEvent.class), new java.lang.annotation.Annotation[0]); arrayOfKSerializer[1] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/events/SerializableEventWithMetadata$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/events/SerializableEventWithMetadata;", "core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<SerializableEventWithMetadata> serializer() { return (KSerializer<SerializableEventWithMetadata>)SerializableEventWithMetadata.$serializer.INSTANCE; }
/*    */      }
/*    */ 
/*    */   
/* 11 */   public SerializableEventWithMetadata(@NotNull SerializableEvent event, long timestampMs) { this.event = event;
/* 12 */     this.timestampMs = timestampMs; } @NotNull public final SerializableEvent getEvent() { return this.event; } public final long getTimestampMs() { return this.timestampMs; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final SerializableEvent component1() {
/*    */     return this.event;
/*    */   }
/*    */   
/*    */   public final long component2() {
/*    */     return this.timestampMs;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SerializableEventWithMetadata copy(@NotNull SerializableEvent event, long timestampMs) {
/*    */     Intrinsics.checkNotNullParameter(event, "event");
/*    */     return new SerializableEventWithMetadata(event, timestampMs);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SerializableEventWithMetadata(event=" + this.event + ", timestampMs=" + this.timestampMs + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.event.hashCode();
/*    */     return result * 31 + Long.hashCode(this.timestampMs);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SerializableEventWithMetadata))
/*    */       return false; 
/*    */     SerializableEventWithMetadata serializableEventWithMetadata = (SerializableEventWithMetadata)other;
/*    */     return !Intrinsics.areEqual(this.event, serializableEventWithMetadata.event) ? false : (!(this.timestampMs != serializableEventWithMetadata.timestampMs));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\events\SerializableEventWithMetadata.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */