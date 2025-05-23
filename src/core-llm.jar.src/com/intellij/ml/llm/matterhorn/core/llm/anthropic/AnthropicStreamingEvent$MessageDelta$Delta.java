/*    */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\t\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0352\0020\001:\002\034\035B\031\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005¢\006\004\b\006\020\007B/\b\020\022\006\020\b\032\0020\t\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\b\020\n\032\004\030\0010\013¢\006\004\b\006\020\fJ%\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032H\001¢\006\002\b\033R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\r\020\016\032\004\b\017\020\020R\036\020\004\032\004\030\0010\0058\006X\004¢\006\016\n\000\022\004\b\021\020\016\032\004\b\022\020\023¨\006\036"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageDelta$Delta;", "", "stopReason", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStopReason;", "stopSequence", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStopReason;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStopReason;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getStopReason$annotations", "()V", "getStopReason", "()Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStopReason;", "getStopSequence$annotations", "getStopSequence", "()Ljava/lang/String;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */ public final class Delta
/*    */ {
/*    */   @NotNull
/*    */   private final AnthropicStopReason stopReason;
/*    */   @Nullable
/*    */   private final String stopSequence;
/*    */   @NotNull
/* 38 */   public static final Companion Companion = new Companion(null); @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = AnthropicStopReason.Companion.serializer(); arrayOfKSerializer[1] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageDelta$Delta$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageDelta$Delta;", "core-llm"}) public static final class Companion { @NotNull public final KSerializer<AnthropicStreamingEvent.MessageDelta.Delta> serializer() { return (KSerializer<AnthropicStreamingEvent.MessageDelta.Delta>)AnthropicStreamingEvent.MessageDelta.Delta.$serializer.INSTANCE; } private Companion() {} } @Nullable
/* 39 */   public final String getStopSequence() { return this.stopSequence; } @NotNull public final AnthropicStopReason getStopReason() { return this.stopReason; } public Delta(@NotNull AnthropicStopReason stopReason, @Nullable String stopSequence) { this.stopReason = stopReason; this.stopSequence = stopSequence; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicStreamingEvent$MessageDelta$Delta.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */