/*    */ package com.intellij.ml.llm.matterhorn.llm;
/*    */ 
/*    */ import java.util.UUID;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @SerialName("LlmRequestEvent")
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\n\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 *2\0020\0012\0020\002:\002)*B'\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n¢\006\004\b\013\020\fBA\b\020\022\006\020\r\032\0020\b\022\b\020\003\032\004\030\0010\004\022\b\020\005\032\004\030\0010\006\022\006\020\007\032\0020\b\022\b\020\t\032\004\030\0010\n\022\b\020\016\032\004\030\0010\017¢\006\004\b\013\020\020J%\020!\032\0020\"2\006\020#\032\0020\0002\006\020$\032\0020%2\006\020&\032\0020'H\001¢\006\002\b(R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\021\020\022R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\023\020\024R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\025\020\026R\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\027\020\030R\024\020\031\032\0020\0328VX\004¢\006\006\032\004\b\033\020\034R\024\020\035\032\0020\0368VX\004¢\006\006\032\004\b\037\020 ¨\006+"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/LlmRequestEvent;", "Lcom/intellij/ml/llm/matterhorn/llm/LlmEvent;", "Lcom/intellij/ml/llm/matterhorn/PairedGroupEvent;", "chat", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "attemptNumber", "", "id", "Ljava/util/UUID;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;ILjava/util/UUID;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;ILjava/util/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getChat", "()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "getModelParameters", "()Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "getAttemptNumber", "()I", "getId", "()Ljava/util/UUID;", "groupKey", "", "getGroupKey", "()Ljava/lang/String;", "type", "Lcom/intellij/ml/llm/matterhorn/EventType;", "getType", "()Lcom/intellij/ml/llm/matterhorn/EventType;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*    */ public final class LlmRequestEvent implements LlmEvent, PairedGroupEvent {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final MatterhornChat chat;
/*    */   
/*    */   @NotNull
/* 18 */   public SerializableEvent toSerializable() { return LlmEvent.DefaultImpls.toSerializable(this); } @NotNull private final ModelParameters modelParameters; private final int attemptNumber; @NotNull private final UUID id; @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/LlmRequestEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/LlmRequestEvent;", "core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<LlmRequestEvent> serializer() { return (KSerializer<LlmRequestEvent>)LlmRequestEvent.$serializer.INSTANCE; }
/*    */      }
/* 20 */   public LlmRequestEvent(@NotNull MatterhornChat chat, @NotNull ModelParameters modelParameters, int attemptNumber, @NotNull UUID id) { this.chat = chat; this.modelParameters = modelParameters; this.attemptNumber = attemptNumber; this.id = id; } @NotNull public final MatterhornChat getChat() { return this.chat; } @NotNull public final ModelParameters getModelParameters() { return this.modelParameters; } public final int getAttemptNumber() { return this.attemptNumber; } @NotNull public final UUID getId() { return this.id; }
/*    */   
/*    */   @NotNull
/* 23 */   public String getGroupKey() { return "llm"; } @NotNull
/*    */   public EventType getType() {
/* 25 */     return EventType.Start;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\llm\LlmRequestEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */