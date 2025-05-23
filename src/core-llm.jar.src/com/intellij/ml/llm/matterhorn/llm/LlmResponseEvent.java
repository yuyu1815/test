/*    */ package com.intellij.ml.llm.matterhorn.llm;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.EventType;
/*    */ import com.intellij.ml.llm.matterhorn.PairedGroupEvent;
/*    */ import com.intellij.ml.llm.matterhorn.events.UUIDSerializer;
/*    */ import java.util.UUID;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @SerialName("LlmResponseEvent")
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\006\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 #2\0020\0012\0020\002:\002\"#B\027\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006¢\006\004\b\007\020\bB/\b\020\022\006\020\t\032\0020\n\022\b\020\003\032\004\030\0010\004\022\b\020\005\032\004\030\0010\006\022\b\020\013\032\004\030\0010\f¢\006\004\b\007\020\rJ%\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 H\001¢\006\002\b!R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\016\020\017R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\020\020\021R\024\020\022\032\0020\0238VX\004¢\006\006\032\004\b\024\020\025R\024\020\026\032\0020\0278VX\004¢\006\006\032\004\b\030\020\031¨\006$"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/LlmResponseEvent;", "Lcom/intellij/ml/llm/matterhorn/llm/LlmEvent;", "Lcom/intellij/ml/llm/matterhorn/PairedGroupEvent;", "answer", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "id", "Ljava/util/UUID;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;Ljava/util/UUID;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/llm/AIAnswer;Ljava/util/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAnswer", "()Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "getId", "()Ljava/util/UUID;", "groupKey", "", "getGroupKey", "()Ljava/lang/String;", "type", "Lcom/intellij/ml/llm/matterhorn/EventType;", "getType", "()Lcom/intellij/ml/llm/matterhorn/EventType;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*    */ public final class LlmResponseEvent implements LlmEvent, PairedGroupEvent {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @NotNull
/* 28 */   public SerializableEvent toSerializable() { return LlmEvent.DefaultImpls.toSerializable(this); } @NotNull private final AIAnswer answer; @NotNull private final UUID id; @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/LlmResponseEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/LlmResponseEvent;", "core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<LlmResponseEvent> serializer() { return (KSerializer<LlmResponseEvent>)LlmResponseEvent.$serializer.INSTANCE; }
/*    */      }
/* 30 */   public LlmResponseEvent(@NotNull AIAnswer answer, @NotNull UUID id) { this.answer = answer; this.id = id; } @NotNull public final AIAnswer getAnswer() { return this.answer; } @NotNull public final UUID getId() { return this.id; }
/*    */   @NotNull
/* 32 */   public String getGroupKey() { return "llm"; } @NotNull
/*    */   public EventType getType() {
/* 34 */     return EventType.End;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\llm\LlmResponseEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */