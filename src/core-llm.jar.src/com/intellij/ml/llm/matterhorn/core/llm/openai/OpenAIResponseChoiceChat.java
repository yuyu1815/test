/*    */ package com.intellij.ml.llm.matterhorn.core.llm.openai;
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
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.LongSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\030\002\n\000\n\002\020\t\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\020\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 -2\0020\001:\002,-B#\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\007¢\006\004\b\b\020\tB7\b\020\022\006\020\n\032\0020\013\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\f\032\004\030\0010\r¢\006\004\b\b\020\016J\t\020\031\032\0020\003HÆ\003J\t\020\032\032\0020\005HÆ\003J\013\020\033\032\004\030\0010\007HÆ\003J)\020\034\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\007HÆ\001J\023\020\035\032\0020\0362\b\020\037\032\004\030\0010 HÖ\003J\t\020!\032\0020\013HÖ\001J\t\020\"\032\0020#HÖ\001J%\020$\032\0020%2\006\020&\032\0020\0002\006\020'\032\0020(2\006\020)\032\0020*H\001¢\006\002\b+R\034\020\002\032\0020\0038\026X\004¢\006\016\n\000\022\004\b\017\020\020\032\004\b\021\020\022R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\023\020\020\032\004\b\024\020\025R\036\020\006\032\004\030\0010\0078\026X\004¢\006\016\n\000\022\004\b\026\020\020\032\004\b\027\020\030¨\006."}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChoiceChat;", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChoice;", "index", "", "message", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChatMessage;", "finishDetails", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/FinishDetails;", "<init>", "(JLcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChatMessage;Lcom/intellij/ml/llm/matterhorn/core/llm/openai/FinishDetails;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJLcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChatMessage;Lcom/intellij/ml/llm/matterhorn/core/llm/openai/FinishDetails;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIndex$annotations", "()V", "getIndex", "()J", "getMessage$annotations", "getMessage", "()Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChatMessage;", "getFinishDetails$annotations", "getFinishDetails", "()Lcom/intellij/ml/llm/matterhorn/core/llm/openai/FinishDetails;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */ public final class OpenAIResponseChoiceChat
/*    */   implements OpenAIResponseChoice
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final long index;
/*    */   @NotNull
/*    */   private final OpenAIResponseChatMessage message;
/*    */   @Nullable
/*    */   private final FinishDetails finishDetails;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChoiceChat$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChoiceChat;", "core-llm"})
/*    */   public static final class Companion
/*    */   {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<OpenAIResponseChoiceChat> serializer() {
/* 59 */       return (KSerializer<OpenAIResponseChoiceChat>)OpenAIResponseChoiceChat.$serializer.INSTANCE;
/*    */     } }
/* 61 */   public OpenAIResponseChoiceChat(long index, @NotNull OpenAIResponseChatMessage message, @Nullable FinishDetails finishDetails) { this.index = index;
/*    */ 
/*    */     
/* 64 */     this.message = message;
/*    */ 
/*    */     
/* 67 */     this.finishDetails = finishDetails; } @Nullable public FinishDetails getFinishDetails() { return this.finishDetails; }
/*    */ 
/*    */   
/*    */   public long getIndex() {
/*    */     return this.index;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final OpenAIResponseChatMessage getMessage() {
/*    */     return this.message;
/*    */   }
/*    */   
/*    */   public final long component1() {
/*    */     return this.index;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final OpenAIResponseChatMessage component2() {
/*    */     return this.message;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final FinishDetails component3() {
/*    */     return this.finishDetails;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final OpenAIResponseChoiceChat copy(long index, @NotNull OpenAIResponseChatMessage message, @Nullable FinishDetails finishDetails) {
/*    */     Intrinsics.checkNotNullParameter(message, "message");
/*    */     return new OpenAIResponseChoiceChat(index, message, finishDetails);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "OpenAIResponseChoiceChat(index=" + this.index + ", message=" + this.message + ", finishDetails=" + this.finishDetails + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Long.hashCode(this.index);
/*    */     result = result * 31 + this.message.hashCode();
/*    */     return result * 31 + ((this.finishDetails == null) ? 0 : this.finishDetails.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof OpenAIResponseChoiceChat))
/*    */       return false; 
/*    */     OpenAIResponseChoiceChat openAIResponseChoiceChat = (OpenAIResponseChoiceChat)other;
/*    */     return (this.index != openAIResponseChoiceChat.index) ? false : (!Intrinsics.areEqual(this.message, openAIResponseChoiceChat.message) ? false : (!!Intrinsics.areEqual(this.finishDetails, openAIResponseChoiceChat.finishDetails)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\openai\OpenAIResponseChoiceChat.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */