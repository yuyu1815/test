/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.reflect.KClass;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SealedClassSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Serializable
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0372\0020\001:\002\036\037B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005B%\b\020\022\006\020\006\032\0020\007\022\b\020\002\032\004\030\0010\003\022\b\020\b\032\004\030\0010\t¢\006\004\b\004\020\nJ\t\020\r\032\0020\003HÆ\003J\023\020\016\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\022HÖ\003J\t\020\023\032\0020\007HÖ\001J\t\020\024\032\0020\025HÖ\001J%\020\026\032\0020\0272\006\020\030\032\0020\0002\006\020\031\032\0020\0322\006\020\033\032\0020\034H\001¢\006\002\b\035R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\f¨\006 "}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Failure;", "Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning;", "reason", "Lcom/intellij/ml/llm/matterhorn/FailureReason;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/FailureReason;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/FailureReason;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getReason", "()Lcom/intellij/ml/llm/matterhorn/FailureReason;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*     */ public final class Failure
/*     */   implements ArtifactReasoning
/*     */ {
/*     */   @NotNull
/* 155 */   public static final Companion Companion = new Companion(null); @NotNull private final FailureReason reason; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer1 = new KSerializer[1]; KClass[] arrayOfKClass = new KClass[9]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(FailureReason.BadResponseException.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(FailureReason.ContextLengthExceeded.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(FailureReason.CostExceeded.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(FailureReason.CountryForbidden.class); arrayOfKClass[4] = Reflection.getOrCreateKotlinClass(FailureReason.FormatError.class); arrayOfKClass[5] = Reflection.getOrCreateKotlinClass(FailureReason.InferenceServerTimeout.class); arrayOfKClass[6] = Reflection.getOrCreateKotlinClass(FailureReason.PaymentRequired.class); arrayOfKClass[7] = Reflection.getOrCreateKotlinClass(FailureReason.ProblemsWithShell.class); arrayOfKClass[8] = Reflection.getOrCreateKotlinClass(FailureReason.UnexpectedException.class); KSerializer[] arrayOfKSerializer2 = new KSerializer[9]; arrayOfKSerializer2[0] = (KSerializer)FailureReason.BadResponseException.$serializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)FailureReason.ContextLengthExceeded.$serializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)FailureReason.CostExceeded.$serializer.INSTANCE; arrayOfKSerializer2[3] = (KSerializer)FailureReason.CountryForbidden.$serializer.INSTANCE; arrayOfKSerializer2[4] = (KSerializer)FailureReason.FormatError.$serializer.INSTANCE; arrayOfKSerializer2[5] = (KSerializer)FailureReason.InferenceServerTimeout.$serializer.INSTANCE; arrayOfKSerializer2[6] = (KSerializer)FailureReason.PaymentRequired.$serializer.INSTANCE; arrayOfKSerializer2[7] = (KSerializer)FailureReason.ProblemsWithShell.$serializer.INSTANCE; arrayOfKSerializer2[8] = (KSerializer)FailureReason.UnexpectedException.$serializer.INSTANCE; arrayOfKSerializer1[0] = (KSerializer)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.FailureReason", Reflection.getOrCreateKotlinClass(FailureReason.class), arrayOfKClass, arrayOfKSerializer2, new java.lang.annotation.Annotation[0]); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer1; } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Failure)) return false;  Failure failure = (Failure)other; return !!Intrinsics.areEqual(this.reason, failure.reason); } public int hashCode() { return this.reason.hashCode(); } @NotNull public String toString() { return "Failure(reason=" + this.reason + ")"; } @NotNull public final Failure copy(@NotNull FailureReason reason) { Intrinsics.checkNotNullParameter(reason, "reason"); return new Failure(reason); } @NotNull public final FailureReason component1() { return this.reason; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Failure$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Failure;", "core"}) public static final class Companion { @NotNull public final KSerializer<ArtifactReasoning.Failure> serializer() { return (KSerializer<ArtifactReasoning.Failure>)ArtifactReasoning.Failure.$serializer.INSTANCE; } private Companion() {} } @NotNull
/* 156 */   public final FailureReason getReason() { return this.reason; } public Failure(@NotNull FailureReason reason) { this.reason = reason; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ArtifactReasoning$Failure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */