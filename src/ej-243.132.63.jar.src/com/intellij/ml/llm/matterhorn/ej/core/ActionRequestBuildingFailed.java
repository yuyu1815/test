/*    */ package com.intellij.ml.llm.matterhorn.ej.core;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.events.SerializableThrowable;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @SerialName("ActionRequestBuildingFailed")
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\006\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \"2\0020\0012\0020\002:\002!\"B\033\022\006\020\003\032\0020\004\022\n\b\002\020\005\032\004\030\0010\006¢\006\004\b\007\020\bB-\b\020\022\006\020\t\032\0020\004\022\006\020\003\032\0020\004\022\b\020\005\032\004\030\0010\006\022\b\020\n\032\004\030\0010\013¢\006\004\b\007\020\fJ%\020\031\032\0020\0322\006\020\033\032\0020\0002\006\020\034\032\0020\0352\006\020\036\032\0020\037H\001¢\006\002\b R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\r\020\016R\023\020\005\032\004\030\0010\006¢\006\b\n\000\032\004\b\017\020\020R\024\020\021\032\0020\0228VX\004¢\006\006\032\004\b\023\020\024R\024\020\025\032\0020\0268VX\004¢\006\006\032\004\b\027\020\030¨\006#"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/ActionRequestBuildingFailed;", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEventSerializable;", "Lcom/intellij/ml/llm/matterhorn/PairedGroupEvent;", "attemptNumber", "", "serializableThrowable", "Lcom/intellij/ml/llm/matterhorn/events/SerializableThrowable;", "<init>", "(ILcom/intellij/ml/llm/matterhorn/events/SerializableThrowable;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILcom/intellij/ml/llm/matterhorn/events/SerializableThrowable;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAttemptNumber", "()I", "getSerializableThrowable", "()Lcom/intellij/ml/llm/matterhorn/events/SerializableThrowable;", "groupKey", "", "getGroupKey", "()Ljava/lang/String;", "type", "Lcom/intellij/ml/llm/matterhorn/EventType;", "getType", "()Lcom/intellij/ml/llm/matterhorn/EventType;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ public final class ActionRequestBuildingFailed implements CustomArtifactEventSerializable, PairedGroupEvent {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @NotNull
/* 21 */   public SerializableEvent toSerializable() { return CustomArtifactEventSerializable.DefaultImpls.toSerializable(this); } private final int attemptNumber; @Nullable private final SerializableThrowable serializableThrowable; @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/ActionRequestBuildingFailed$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/ActionRequestBuildingFailed;", "ej-core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<ActionRequestBuildingFailed> serializer() { return (KSerializer<ActionRequestBuildingFailed>)ActionRequestBuildingFailed.$serializer.INSTANCE; }
/*    */      }
/* 23 */   public ActionRequestBuildingFailed(int attemptNumber, @Nullable SerializableThrowable serializableThrowable) { this.attemptNumber = attemptNumber; this.serializableThrowable = serializableThrowable; } public final int getAttemptNumber() { return this.attemptNumber; } @Nullable public final SerializableThrowable getSerializableThrowable() { return this.serializableThrowable; }
/*    */   @NotNull
/* 25 */   public String getGroupKey() { return "actionRequest"; } @NotNull
/*    */   public EventType getType() {
/* 27 */     return EventType.End;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\ActionRequestBuildingFailed.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */