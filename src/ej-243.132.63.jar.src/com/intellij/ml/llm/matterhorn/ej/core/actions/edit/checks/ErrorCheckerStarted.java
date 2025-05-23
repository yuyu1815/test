/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks;
/*    */ 
/*    */ @Serializable
/*    */ @SerialName("ErrorCheckerStarted")
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\005\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 %2\0020\0012\0020\002:\002$%B\017\022\006\020\003\032\0020\004¢\006\004\b\005\020\006B%\b\020\022\006\020\007\032\0020\b\022\b\020\003\032\004\030\0010\004\022\b\020\t\032\004\030\0010\n¢\006\004\b\005\020\013J\t\020\024\032\0020\004HÆ\003J\023\020\025\032\0020\0002\b\b\002\020\003\032\0020\004HÆ\001J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\031HÖ\003J\t\020\032\032\0020\bHÖ\001J\t\020\033\032\0020\004HÖ\001J%\020\034\032\0020\0352\006\020\036\032\0020\0002\006\020\037\032\0020 2\006\020!\032\0020\"H\001¢\006\002\b#R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\f\020\rR\024\020\016\032\0020\0048VX\004¢\006\006\032\004\b\017\020\rR\024\020\020\032\0020\0218VX\004¢\006\006\032\004\b\022\020\023¨\006&"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorCheckerStarted;", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEventSerializable;", "Lcom/intellij/ml/llm/matterhorn/PairedGroupEvent;", "name", "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getName", "()Ljava/lang/String;", "groupKey", "getGroupKey", "type", "Lcom/intellij/ml/llm/matterhorn/EventType;", "getType", "()Lcom/intellij/ml/llm/matterhorn/EventType;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ public final class ErrorCheckerStarted implements CustomArtifactEventSerializable, PairedGroupEvent {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @NotNull
/* 11 */   public SerializableEvent toSerializable() { return CustomArtifactEventSerializable.DefaultImpls.toSerializable(this); } @NotNull private final String name; @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorCheckerStarted$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorCheckerStarted;", "ej-core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<ErrorCheckerStarted> serializer() { return (KSerializer<ErrorCheckerStarted>)ErrorCheckerStarted.$serializer.INSTANCE; }
/*    */      }
/* 13 */   public ErrorCheckerStarted(@NotNull String name) { this.name = name; } @NotNull public final String getName() { return this.name; }
/*    */   @NotNull
/* 15 */   public String getGroupKey() { return "ErrorChecker"; } @NotNull
/*    */   public EventType getType() {
/* 17 */     return EventType.Start;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ErrorCheckerStarted copy(@NotNull String name) {
/*    */     Intrinsics.checkNotNullParameter(name, "name");
/*    */     return new ErrorCheckerStarted(name);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ErrorCheckerStarted(name=" + this.name + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.name.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ErrorCheckerStarted))
/*    */       return false; 
/*    */     ErrorCheckerStarted errorCheckerStarted = (ErrorCheckerStarted)other;
/*    */     return !!Intrinsics.areEqual(this.name, errorCheckerStarted.name);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\checks\ErrorCheckerStarted.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */