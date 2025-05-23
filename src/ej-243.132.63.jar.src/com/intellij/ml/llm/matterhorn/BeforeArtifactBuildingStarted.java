/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.events.SerializableEvent;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SerialName;
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
/*     */ @SerialName("BeforeArtifactBuildingStarted")
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\004\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 '2\0020\0012\0020\002:\002&'B\021\022\b\020\003\032\004\030\0010\004¢\006\004\b\005\020\006B%\b\020\022\006\020\007\032\0020\b\022\b\020\003\032\004\030\0010\004\022\b\020\t\032\004\030\0010\n¢\006\004\b\005\020\013J\013\020\026\032\004\030\0010\004HÆ\003J\025\020\027\032\0020\0002\n\b\002\020\003\032\004\030\0010\004HÆ\001J\023\020\030\032\0020\0312\b\020\032\032\004\030\0010\033HÖ\003J\t\020\034\032\0020\bHÖ\001J\t\020\035\032\0020\017HÖ\001J%\020\036\032\0020\0372\006\020 \032\0020\0002\006\020!\032\0020\"2\006\020#\032\0020$H\001¢\006\002\b%R\023\020\003\032\004\030\0010\004¢\006\b\n\000\032\004\b\f\020\rR\024\020\016\032\0020\0178VX\004¢\006\006\032\004\b\020\020\021R\024\020\022\032\0020\0238VX\004¢\006\006\032\004\b\024\020\025¨\006("}, d2 = {"Lcom/intellij/ml/llm/matterhorn/BeforeArtifactBuildingStarted;", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEventSerializable;", "Lcom/intellij/ml/llm/matterhorn/PairedGroupEvent;", "requestId", "Lcom/intellij/ml/llm/matterhorn/SerializableArtifactId;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/SerializableArtifactId;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/SerializableArtifactId;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getRequestId", "()Lcom/intellij/ml/llm/matterhorn/SerializableArtifactId;", "groupKey", "", "getGroupKey", "()Ljava/lang/String;", "type", "Lcom/intellij/ml/llm/matterhorn/EventType;", "getType", "()Lcom/intellij/ml/llm/matterhorn/EventType;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*     */ public final class BeforeArtifactBuildingStarted
/*     */   implements CustomArtifactEventSerializable, PairedGroupEvent
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @Nullable
/*     */   private final SerializableArtifactId requestId;
/*     */   
/*     */   @NotNull
/*     */   public SerializableEvent toSerializable() {
/* 360 */     return CustomArtifactEventSerializable.DefaultImpls.toSerializable(this); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/BeforeArtifactBuildingStarted$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/BeforeArtifactBuildingStarted;", "core"}) public static final class Companion { @NotNull public final KSerializer<BeforeArtifactBuildingStarted> serializer() { return (KSerializer<BeforeArtifactBuildingStarted>)BeforeArtifactBuildingStarted.$serializer.INSTANCE; }
/*     */      private Companion() {} } public BeforeArtifactBuildingStarted(@Nullable SerializableArtifactId requestId) {
/* 362 */     this.requestId = requestId; } @Nullable public final SerializableArtifactId getRequestId() { return this.requestId; }
/*     */   
/*     */   @NotNull
/* 365 */   public String getGroupKey() { return "ArtifactBuilding"; } @NotNull
/*     */   public EventType getType() {
/* 367 */     return EventType.Start;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final SerializableArtifactId component1() {
/*     */     return this.requestId;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final BeforeArtifactBuildingStarted copy(@Nullable SerializableArtifactId requestId) {
/*     */     return new BeforeArtifactBuildingStarted(requestId);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "BeforeArtifactBuildingStarted(requestId=" + this.requestId + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return (this.requestId == null) ? 0 : this.requestId.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof BeforeArtifactBuildingStarted))
/*     */       return false; 
/*     */     BeforeArtifactBuildingStarted beforeArtifactBuildingStarted = (BeforeArtifactBuildingStarted)other;
/*     */     return !!Intrinsics.areEqual(this.requestId, beforeArtifactBuildingStarted.requestId);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\BeforeArtifactBuildingStarted.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */