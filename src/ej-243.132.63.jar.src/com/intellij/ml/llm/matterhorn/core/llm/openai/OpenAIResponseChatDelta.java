/*     */ package com.intellij.ml.llm.matterhorn.core.llm.openai;
/*     */ 
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
/*     */ @Serializable
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\013\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B\037\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\003¢\006\004\b\005\020\006B/\b\020\022\006\020\007\032\0020\b\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\b\020\t\032\004\030\0010\n¢\006\004\b\005\020\013J\013\020\022\032\004\030\0010\003HÆ\003J\013\020\023\032\004\030\0010\003HÆ\003J!\020\024\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\n\b\002\020\004\032\004\030\0010\003HÆ\001J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\001HÖ\003J\t\020\030\032\0020\bHÖ\001J\t\020\031\032\0020\003HÖ\001J%\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 H\001¢\006\002\b!R\036\020\002\032\004\030\0010\0038\006X\004¢\006\016\n\000\022\004\b\f\020\r\032\004\b\016\020\017R\036\020\004\032\004\030\0010\0038\006X\004¢\006\016\n\000\022\004\b\020\020\r\032\004\b\021\020\017¨\006$"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChatDelta;", "", "role", "", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getRole$annotations", "()V", "getRole", "()Ljava/lang/String;", "getContent$annotations", "getContent", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*     */ public final class OpenAIResponseChatDelta
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @Nullable
/*     */   private final String role;
/*     */   @Nullable
/*     */   private final String content;
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChatDelta$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChatDelta;", "core-llm"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<OpenAIResponseChatDelta> serializer() {
/*  95 */       return (KSerializer<OpenAIResponseChatDelta>)OpenAIResponseChatDelta.$serializer.INSTANCE;
/*     */     } }
/*  97 */   public OpenAIResponseChatDelta(@Nullable String role, @Nullable String content) { this.role = role;
/*     */ 
/*     */     
/* 100 */     this.content = content; } @Nullable public final String getContent() { return this.content; }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final String getRole() {
/*     */     return this.role;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String component1() {
/*     */     return this.role;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String component2() {
/*     */     return this.content;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final OpenAIResponseChatDelta copy(@Nullable String role, @Nullable String content) {
/*     */     return new OpenAIResponseChatDelta(role, content);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "OpenAIResponseChatDelta(role=" + this.role + ", content=" + this.content + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = (this.role == null) ? 0 : this.role.hashCode();
/*     */     return result * 31 + ((this.content == null) ? 0 : this.content.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof OpenAIResponseChatDelta))
/*     */       return false; 
/*     */     OpenAIResponseChatDelta openAIResponseChatDelta = (OpenAIResponseChatDelta)other;
/*     */     return !Intrinsics.areEqual(this.role, openAIResponseChatDelta.role) ? false : (!!Intrinsics.areEqual(this.content, openAIResponseChatDelta.content));
/*     */   }
/*     */   
/*     */   public OpenAIResponseChatDelta() {
/*     */     this((String)null, (String)null, 3, (DefaultConstructorMarker)null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\openai\OpenAIResponseChatDelta.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */