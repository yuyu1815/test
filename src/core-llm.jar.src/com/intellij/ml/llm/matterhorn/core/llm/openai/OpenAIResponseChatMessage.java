/*    */ package com.intellij.ml.llm.matterhorn.core.llm.openai;
/*    */ 
/*    */ import java.util.List;
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
/*    */ import kotlinx.serialization.internal.ArrayListSerializer;
/*    */ import kotlinx.serialization.internal.DoubleSerializer;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import kotlinx.serialization.internal.StringSerializer;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\020 \n\002\020\006\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\017\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 *2\0020\001:\002)*B-\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\020\b\002\020\005\032\n\022\004\022\0020\007\030\0010\006¢\006\004\b\b\020\tB?\b\020\022\006\020\n\032\0020\013\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\016\020\005\032\n\022\004\022\0020\007\030\0010\006\022\b\020\f\032\004\030\0010\r¢\006\004\b\b\020\016J\013\020\030\032\004\030\0010\003HÆ\003J\013\020\031\032\004\030\0010\003HÆ\003J\021\020\032\032\n\022\004\022\0020\007\030\0010\006HÆ\003J3\020\033\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\n\b\002\020\004\032\004\030\0010\0032\020\b\002\020\005\032\n\022\004\022\0020\007\030\0010\006HÆ\001J\023\020\034\032\0020\0352\b\020\036\032\004\030\0010\001HÖ\003J\t\020\037\032\0020\013HÖ\001J\t\020 \032\0020\003HÖ\001J%\020!\032\0020\"2\006\020#\032\0020\0002\006\020$\032\0020%2\006\020&\032\0020'H\001¢\006\002\b(R\036\020\002\032\004\030\0010\0038\006X\004¢\006\016\n\000\022\004\b\017\020\020\032\004\b\021\020\022R\036\020\004\032\004\030\0010\0038\006X\004¢\006\016\n\000\022\004\b\023\020\020\032\004\b\024\020\022R$\020\005\032\n\022\004\022\0020\007\030\0010\0068\006X\004¢\006\016\n\000\022\004\b\025\020\020\032\004\b\026\020\027¨\006+"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChatMessage;", "", "role", "", "content", "logits", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getRole$annotations", "()V", "getRole", "()Ljava/lang/String;", "getContent$annotations", "getContent", "getLogits$annotations", "getLogits", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */ public final class OpenAIResponseChatMessage
/*    */ {
/*    */   @Nullable
/*    */   private final String role;
/*    */   @Nullable
/*    */   private final String content;
/*    */   @NotNull
/* 71 */   public static final Companion Companion = new Companion(null); @Nullable private final List<Double> logits; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = (KSerializer)new ArrayListSerializer((KSerializer)DoubleSerializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChatMessage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChatMessage;", "core-llm"}) public static final class Companion { @NotNull public final KSerializer<OpenAIResponseChatMessage> serializer() { return (KSerializer<OpenAIResponseChatMessage>)OpenAIResponseChatMessage.$serializer.INSTANCE; }
/*    */      private Companion() {} } public OpenAIResponseChatMessage(@Nullable String role, @Nullable String content, @Nullable List<Double> logits) {
/* 73 */     this.role = role;
/*    */ 
/*    */     
/* 76 */     this.content = content;
/*    */ 
/*    */     
/* 79 */     this.logits = logits; } @Nullable public final List<Double> getLogits() { return this.logits; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final String getRole() {
/*    */     return this.role;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getContent() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component1() {
/*    */     return this.role;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component2() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final List<Double> component3() {
/*    */     return this.logits;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final OpenAIResponseChatMessage copy(@Nullable String role, @Nullable String content, @Nullable List<Double> logits) {
/*    */     return new OpenAIResponseChatMessage(role, content, logits);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "OpenAIResponseChatMessage(role=" + this.role + ", content=" + this.content + ", logits=" + this.logits + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = (this.role == null) ? 0 : this.role.hashCode();
/*    */     result = result * 31 + ((this.content == null) ? 0 : this.content.hashCode());
/*    */     return result * 31 + ((this.logits == null) ? 0 : this.logits.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof OpenAIResponseChatMessage))
/*    */       return false; 
/*    */     OpenAIResponseChatMessage openAIResponseChatMessage = (OpenAIResponseChatMessage)other;
/*    */     return !Intrinsics.areEqual(this.role, openAIResponseChatMessage.role) ? false : (!Intrinsics.areEqual(this.content, openAIResponseChatMessage.content) ? false : (!!Intrinsics.areEqual(this.logits, openAIResponseChatMessage.logits)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\openai\OpenAIResponseChatMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */