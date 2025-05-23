/*    */ package com.intellij.ml.llm.matterhorn.events;@Serializable @SerialName("SerializableEventSerializationError") @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007B/\b\020\022\006\020\b\032\0020\t\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\b\020\n\032\004\030\0010\013¢\006\004\b\006\020\fJ\t\020\021\032\0020\003HÆ\003J\t\020\022\032\0020\005HÆ\003J\035\020\023\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\027HÖ\003J\t\020\030\032\0020\tHÖ\001J\t\020\031\032\0020\003HÖ\001J%\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 H\001¢\006\002\b!R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\017\020\020¨\006$"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/events/SerializableEventSerializationError;", "Lcom/intellij/ml/llm/matterhorn/events/SerializableEvent;", "eventClassName", "", "error", "Lcom/intellij/ml/llm/matterhorn/events/SerializableThrowable;", "<init>", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/events/SerializableThrowable;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/intellij/ml/llm/matterhorn/events/SerializableThrowable;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getEventClassName", "()Ljava/lang/String;", "getError", "()Lcom/intellij/ml/llm/matterhorn/events/SerializableThrowable;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"}) public final class SerializableEventSerializationError implements SerializableEvent { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final String eventClassName; @NotNull
/*    */   private final SerializableThrowable error; @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/events/SerializableEventSerializationError$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/events/SerializableEventSerializationError;", "core"})
/*    */   public static final class Companion { @NotNull
/*  6 */     public final KSerializer<SerializableEventSerializationError> serializer() { return (KSerializer<SerializableEventSerializationError>)SerializableEventSerializationError.$serializer.INSTANCE; }
/*    */     
/*    */     private Companion() {} }
/*    */   
/*    */   public SerializableEventSerializationError(@NotNull String eventClassName, @NotNull SerializableThrowable error) {
/* 11 */     this.eventClassName = eventClassName;
/* 12 */     this.error = error; } @NotNull public final String getEventClassName() { return this.eventClassName; } @NotNull public final SerializableThrowable getError() { return this.error; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.eventClassName;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SerializableThrowable component2() {
/*    */     return this.error;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SerializableEventSerializationError copy(@NotNull String eventClassName, @NotNull SerializableThrowable error) {
/*    */     Intrinsics.checkNotNullParameter(eventClassName, "eventClassName");
/*    */     Intrinsics.checkNotNullParameter(error, "error");
/*    */     return new SerializableEventSerializationError(eventClassName, error);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SerializableEventSerializationError(eventClassName=" + this.eventClassName + ", error=" + this.error + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.eventClassName.hashCode();
/*    */     return result * 31 + this.error.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SerializableEventSerializationError))
/*    */       return false; 
/*    */     SerializableEventSerializationError serializableEventSerializationError = (SerializableEventSerializationError)other;
/*    */     return !Intrinsics.areEqual(this.eventClassName, serializableEventSerializationError.eventClassName) ? false : (!!Intrinsics.areEqual(this.error, serializableEventSerializationError.error));
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\events\SerializableEventSerializationError.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */