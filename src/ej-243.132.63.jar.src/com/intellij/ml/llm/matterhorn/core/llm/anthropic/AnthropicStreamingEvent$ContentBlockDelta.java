/*    */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SealedClassSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.IntSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @SerialName("content_block_delta")
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\006\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0312\0020\001:\002\030\031B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007B-\b\020\022\006\020\b\032\0020\003\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\t\032\004\030\0010\n¢\006\004\b\006\020\013J%\020\020\032\0020\0212\006\020\022\032\0020\0002\006\020\023\032\0020\0242\006\020\025\032\0020\026H\001¢\006\002\b\027R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$ContentBlockDelta;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent;", "index", "", "delta", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/ContentDelta;", "<init>", "(ILcom/intellij/ml/llm/matterhorn/core/llm/anthropic/ContentDelta;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILcom/intellij/ml/llm/matterhorn/core/llm/anthropic/ContentDelta;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIndex", "()I", "getDelta", "()Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/ContentDelta;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */ public final class ContentBlockDelta
/*    */   implements AnthropicStreamingEvent
/*    */ {
/*    */   private final int index;
/*    */   @NotNull
/*    */   private final ContentDelta delta;
/*    */   @NotNull
/* 50 */   public static final Companion Companion = new Companion(null); @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer1 = new KSerializer[2]; arrayOfKSerializer1[0] = null; KClass[] arrayOfKClass = new KClass[2]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(ContentDelta.InputJson.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(ContentDelta.Text.class); KSerializer[] arrayOfKSerializer2 = new KSerializer[2]; arrayOfKSerializer2[0] = (KSerializer)ContentDelta.InputJson.$serializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)ContentDelta.Text.$serializer.INSTANCE; arrayOfKSerializer1[1] = (KSerializer)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.core.llm.anthropic.ContentDelta", Reflection.getOrCreateKotlinClass(ContentDelta.class), arrayOfKClass, arrayOfKSerializer2, new java.lang.annotation.Annotation[0]); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer1; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$ContentBlockDelta$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$ContentBlockDelta;", "core-llm"}) public static final class Companion { @NotNull public final KSerializer<AnthropicStreamingEvent.ContentBlockDelta> serializer() { return (KSerializer<AnthropicStreamingEvent.ContentBlockDelta>)AnthropicStreamingEvent.ContentBlockDelta.$serializer.INSTANCE; } private Companion() {} } @NotNull
/* 51 */   public final ContentDelta getDelta() { return this.delta; } public final int getIndex() { return this.index; } public ContentBlockDelta(int index, @NotNull ContentDelta delta) { this.index = index; this.delta = delta; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicStreamingEvent$ContentBlockDelta.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */