/*    */ package com.intellij.ml.llm.matterhorn.ej.core;
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @SerialName("ActionRequestBuildingStarted")
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\004\n\002\030\002\n\002\b\004\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0362\0020\0012\0020\002:\002\035\036B\017\022\006\020\003\032\0020\004¢\006\004\b\005\020\006B#\b\020\022\006\020\007\032\0020\004\022\006\020\003\032\0020\004\022\b\020\b\032\004\030\0010\t¢\006\004\b\005\020\nJ%\020\025\032\0020\0262\006\020\027\032\0020\0002\006\020\030\032\0020\0312\006\020\032\032\0020\033H\001¢\006\002\b\034R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\013\020\fR\024\020\r\032\0020\0168VX\004¢\006\006\032\004\b\017\020\020R\024\020\021\032\0020\0228VX\004¢\006\006\032\004\b\023\020\024¨\006\037"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/ActionRequestBuildingStarted;", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEventSerializable;", "Lcom/intellij/ml/llm/matterhorn/PairedGroupEvent;", "attemptNumber", "", "<init>", "(I)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAttemptNumber", "()I", "groupKey", "", "getGroupKey", "()Ljava/lang/String;", "type", "Lcom/intellij/ml/llm/matterhorn/EventType;", "getType", "()Lcom/intellij/ml/llm/matterhorn/EventType;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ public final class ActionRequestBuildingStarted implements CustomArtifactEventSerializable, PairedGroupEvent {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @NotNull
/* 12 */   public SerializableEvent toSerializable() { return CustomArtifactEventSerializable.DefaultImpls.toSerializable(this); } private final int attemptNumber; @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/ActionRequestBuildingStarted$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/ActionRequestBuildingStarted;", "ej-core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<ActionRequestBuildingStarted> serializer() { return (KSerializer<ActionRequestBuildingStarted>)ActionRequestBuildingStarted.$serializer.INSTANCE; }
/*    */      }
/* 14 */   public ActionRequestBuildingStarted(int attemptNumber) { this.attemptNumber = attemptNumber; } public final int getAttemptNumber() { return this.attemptNumber; }
/*    */   @NotNull
/* 16 */   public String getGroupKey() { return "actionRequest"; } @NotNull
/*    */   public EventType getType() {
/* 18 */     return EventType.Start;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\ActionRequestBuildingStarted.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */