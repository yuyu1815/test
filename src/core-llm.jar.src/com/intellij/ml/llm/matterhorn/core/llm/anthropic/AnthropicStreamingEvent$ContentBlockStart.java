/*    */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
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
/*    */ import kotlinx.serialization.json.JsonObject;
/*    */ import kotlinx.serialization.json.JsonObjectSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @SerialName("content_block_start")
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\b\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0332\0020\001:\002\032\033B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007B-\b\020\022\006\020\b\032\0020\003\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\t\032\004\030\0010\n¢\006\004\b\006\020\013J%\020\022\032\0020\0232\006\020\024\032\0020\0002\006\020\025\032\0020\0262\006\020\027\032\0020\030H\001¢\006\002\b\031R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\016\020\017\032\004\b\020\020\021¨\006\034"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$ContentBlockStart;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent;", "index", "", "contentBlock", "Lkotlinx/serialization/json/JsonObject;", "<init>", "(ILkotlinx/serialization/json/JsonObject;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIndex", "()I", "getContentBlock$annotations", "()V", "getContentBlock", "()Lkotlinx/serialization/json/JsonObject;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */ public final class ContentBlockStart
/*    */   implements AnthropicStreamingEvent
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final int index;
/*    */   @NotNull
/*    */   private final JsonObject contentBlock;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$ContentBlockStart$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$ContentBlockStart;", "core-llm"})
/*    */   public static final class Companion
/*    */   {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<AnthropicStreamingEvent.ContentBlockStart> serializer() {
/* 47 */       return (KSerializer<AnthropicStreamingEvent.ContentBlockStart>)AnthropicStreamingEvent.ContentBlockStart.$serializer.INSTANCE; } } @NotNull
/* 48 */   public final JsonObject getContentBlock() { return this.contentBlock; } public final int getIndex() { return this.index; } public ContentBlockStart(int index, @NotNull JsonObject contentBlock) { this.index = index; this.contentBlock = contentBlock; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicStreamingEvent$ContentBlockStart.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */