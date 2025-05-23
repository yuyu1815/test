/*    */ package com.intellij.ml.llm.matterhorn.ej.core;
/*    */ import com.intellij.ml.llm.matterhorn.CustomArtifactEventSerializable;
/*    */ import com.intellij.ml.llm.matterhorn.events.SerializableEvent;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @SerialName("StepMetaInfoAppearedEvent")
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\006\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0322\0020\001:\002\031\032B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007B/\b\020\022\006\020\b\032\0020\t\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\b\020\n\032\004\030\0010\013¢\006\004\b\006\020\fJ%\020\021\032\0020\0222\006\020\023\032\0020\0002\006\020\024\032\0020\0252\006\020\026\032\0020\027H\001¢\006\002\b\030R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\017\020\020¨\006\033"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/StepMetaInfoAppearedEvent;", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEventSerializable;", "stepName", "", "stepType", "Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "<init>", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getStepName", "()Ljava/lang/String;", "getStepType", "()Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ public final class StepMetaInfoAppearedEvent implements CustomArtifactEventSerializable {
/*    */   @NotNull
/* 23 */   public static final Companion Companion = new Companion(null); @NotNull private final String stepName; @NotNull private final StepType stepType; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = EnumsKt.createSimpleEnumSerializer("com.intellij.ml.llm.matterhorn.ej.core.StepType", (Enum[])StepType.values()); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @NotNull public SerializableEvent toSerializable() { return CustomArtifactEventSerializable.DefaultImpls.toSerializable(this); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/StepMetaInfoAppearedEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/StepMetaInfoAppearedEvent;", "ej-core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<StepMetaInfoAppearedEvent> serializer() { return (KSerializer<StepMetaInfoAppearedEvent>)StepMetaInfoAppearedEvent.$serializer.INSTANCE; } }
/*    */    @NotNull
/* 25 */   public final StepType getStepType() { return this.stepType; } @NotNull public final String getStepName() { return this.stepName; } public StepMetaInfoAppearedEvent(@NotNull String stepName, @NotNull StepType stepType) { this.stepName = stepName; this.stepType = stepType; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\StepMetaInfoAppearedEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */