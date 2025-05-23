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
/*     */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*     */ import kotlinx.serialization.internal.StringSerializer;
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
/*     */ @Serializable
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\004\n\002\030\002\n\002\030\002\n\002\030\002\n\000\bw\030\000 \0052\0020\001:\004\002\003\004\005\001\003\006\007\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning;", "", "Success", "Failure", "Cancelled", "Companion", "Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Cancelled;", "Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Failure;", "Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Success;", "core"})
/*     */ public interface ArtifactReasoning
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = Companion.$$INSTANCE;
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning;", "core"})
/*     */   public static final class Companion
/*     */   {
/*     */     @NotNull
/*     */     public final KSerializer<ArtifactReasoning> serializer() {
/* 149 */       KClass[] arrayOfKClass = new KClass[3]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(ArtifactReasoning.Cancelled.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(ArtifactReasoning.Failure.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(ArtifactReasoning.Success.class); KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = (KSerializer)ArtifactReasoning.Cancelled.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)ArtifactReasoning.Failure.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)ArtifactReasoning.Success.$serializer.INSTANCE; return (KSerializer<ArtifactReasoning>)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.ArtifactReasoning", Reflection.getOrCreateKotlinClass(ArtifactReasoning.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*     */     } } @Serializable @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0362\0020\001:\002\035\036B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005B%\b\020\022\006\020\006\032\0020\007\022\b\020\002\032\004\030\0010\003\022\b\020\b\032\004\030\0010\t¢\006\004\b\004\020\nJ\t\020\r\032\0020\003HÆ\003J\023\020\016\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\022HÖ\003J\t\020\023\032\0020\007HÖ\001J\t\020\024\032\0020\003HÖ\001J%\020\025\032\0020\0262\006\020\027\032\0020\0002\006\020\030\032\0020\0312\006\020\032\032\0020\033H\001¢\006\002\b\034R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\f¨\006\037"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Success;", "Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning;", "reason", "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"}) public static final class Success implements ArtifactReasoning { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String reason; public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Success)) return false;  Success success = (Success)other; return !!Intrinsics.areEqual(this.reason, success.reason); } public int hashCode() { return this.reason.hashCode(); } @NotNull public String toString() { return "Success(reason=" + this.reason + ")"; } @NotNull public final Success copy(@NotNull String reason) { Intrinsics.checkNotNullParameter(reason, "reason"); return new Success(reason); } @NotNull public final String component1() { return this.reason; }
/*     */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Success$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Success;", "core"}) public static final class Companion { private Companion() {}
/* 152 */       @NotNull public final KSerializer<ArtifactReasoning.Success> serializer() { return (KSerializer<ArtifactReasoning.Success>)ArtifactReasoning.Success.$serializer.INSTANCE; } } @NotNull
/* 153 */     public final String getReason() { return this.reason; } public Success(@NotNull String reason) { this.reason = reason; } } @Serializable @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0372\0020\001:\002\036\037B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005B%\b\020\022\006\020\006\032\0020\007\022\b\020\002\032\004\030\0010\003\022\b\020\b\032\004\030\0010\t¢\006\004\b\004\020\nJ\t\020\r\032\0020\003HÆ\003J\023\020\016\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\022HÖ\003J\t\020\023\032\0020\007HÖ\001J\t\020\024\032\0020\025HÖ\001J%\020\026\032\0020\0272\006\020\030\032\0020\0002\006\020\031\032\0020\0322\006\020\033\032\0020\034H\001¢\006\002\b\035R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\f¨\006 "}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Failure;", "Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning;", "reason", "Lcom/intellij/ml/llm/matterhorn/FailureReason;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/FailureReason;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/FailureReason;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getReason", "()Lcom/intellij/ml/llm/matterhorn/FailureReason;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*     */   public static final class Failure implements ArtifactReasoning { @NotNull
/* 155 */     public static final Companion Companion = new Companion(null); @NotNull private final FailureReason reason; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer1 = new KSerializer[1]; KClass[] arrayOfKClass = new KClass[9]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(FailureReason.BadResponseException.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(FailureReason.ContextLengthExceeded.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(FailureReason.CostExceeded.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(FailureReason.CountryForbidden.class); arrayOfKClass[4] = Reflection.getOrCreateKotlinClass(FailureReason.FormatError.class); arrayOfKClass[5] = Reflection.getOrCreateKotlinClass(FailureReason.InferenceServerTimeout.class); arrayOfKClass[6] = Reflection.getOrCreateKotlinClass(FailureReason.PaymentRequired.class); arrayOfKClass[7] = Reflection.getOrCreateKotlinClass(FailureReason.ProblemsWithShell.class); arrayOfKClass[8] = Reflection.getOrCreateKotlinClass(FailureReason.UnexpectedException.class); KSerializer[] arrayOfKSerializer2 = new KSerializer[9]; arrayOfKSerializer2[0] = (KSerializer)FailureReason.BadResponseException.$serializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)FailureReason.ContextLengthExceeded.$serializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)FailureReason.CostExceeded.$serializer.INSTANCE; arrayOfKSerializer2[3] = (KSerializer)FailureReason.CountryForbidden.$serializer.INSTANCE; arrayOfKSerializer2[4] = (KSerializer)FailureReason.FormatError.$serializer.INSTANCE; arrayOfKSerializer2[5] = (KSerializer)FailureReason.InferenceServerTimeout.$serializer.INSTANCE; arrayOfKSerializer2[6] = (KSerializer)FailureReason.PaymentRequired.$serializer.INSTANCE; arrayOfKSerializer2[7] = (KSerializer)FailureReason.ProblemsWithShell.$serializer.INSTANCE; arrayOfKSerializer2[8] = (KSerializer)FailureReason.UnexpectedException.$serializer.INSTANCE; arrayOfKSerializer1[0] = (KSerializer)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.FailureReason", Reflection.getOrCreateKotlinClass(FailureReason.class), arrayOfKClass, arrayOfKSerializer2, new java.lang.annotation.Annotation[0]); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer1; } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Failure)) return false;  Failure failure = (Failure)other; return !!Intrinsics.areEqual(this.reason, failure.reason); } public int hashCode() { return this.reason.hashCode(); } @NotNull public String toString() { return "Failure(reason=" + this.reason + ")"; } @NotNull public final Failure copy(@NotNull FailureReason reason) { Intrinsics.checkNotNullParameter(reason, "reason"); return new Failure(reason); } @NotNull public final FailureReason component1() { return this.reason; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Failure$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Failure;", "core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<ArtifactReasoning.Failure> serializer() { return (KSerializer<ArtifactReasoning.Failure>)ArtifactReasoning.Failure.$serializer.INSTANCE; } } @NotNull
/* 156 */     public final FailureReason getReason() { return this.reason; } public Failure(@NotNull FailureReason reason) { this.reason = reason; } }
/*     */    @Serializable @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0362\0020\001:\002\035\036B\023\022\n\b\002\020\002\032\004\030\0010\003¢\006\004\b\004\020\005B%\b\020\022\006\020\006\032\0020\007\022\b\020\002\032\004\030\0010\003\022\b\020\b\032\004\030\0010\t¢\006\004\b\004\020\nJ\013\020\r\032\004\030\0010\003HÆ\003J\025\020\016\032\0020\0002\n\b\002\020\002\032\004\030\0010\003HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\022HÖ\003J\t\020\023\032\0020\007HÖ\001J\t\020\024\032\0020\003HÖ\001J%\020\025\032\0020\0262\006\020\027\032\0020\0002\006\020\030\032\0020\0312\006\020\032\032\0020\033H\001¢\006\002\b\034R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\013\020\f¨\006\037"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Cancelled;", "Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning;", "message", "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"}) public static final class Cancelled implements ArtifactReasoning {
/* 158 */     @NotNull public static final Companion Companion = new Companion(null); @Nullable private final String message; public Cancelled() { this((String)null, 1, (DefaultConstructorMarker)null); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Cancelled)) return false;  Cancelled cancelled = (Cancelled)other; return !!Intrinsics.areEqual(this.message, cancelled.message); } public int hashCode() { return (this.message == null) ? 0 : this.message.hashCode(); } @NotNull public String toString() { return "Cancelled(message=" + this.message + ")"; } @NotNull public final Cancelled copy(@Nullable String message) { return new Cancelled(message); } @Nullable public final String component1() { return this.message; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Cancelled$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Cancelled;", "core"}) public static final class Companion { @NotNull public final KSerializer<ArtifactReasoning.Cancelled> serializer() { return (KSerializer<ArtifactReasoning.Cancelled>)ArtifactReasoning.Cancelled.$serializer.INSTANCE; } private Companion() {} } @Nullable
/* 159 */     public final String getMessage() { return this.message; } public Cancelled(@Nullable String message) { this.message = message; }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ArtifactReasoning.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */