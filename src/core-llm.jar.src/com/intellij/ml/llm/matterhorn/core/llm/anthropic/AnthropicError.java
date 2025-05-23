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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\006\n\002\020\b\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 &2\0020\001:\002%&B/\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\n\b\002\020\005\032\004\030\0010\003\022\n\b\002\020\006\032\004\030\0010\003¢\006\004\b\007\020\bBC\b\020\022\006\020\t\032\0020\n\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\b\020\005\032\004\030\0010\003\022\b\020\006\032\004\030\0010\003\022\b\020\013\032\004\030\0010\f¢\006\004\b\007\020\rJ\t\020\023\032\0020\003HÆ\003J\t\020\024\032\0020\003HÆ\003J\013\020\025\032\004\030\0010\003HÆ\003J\013\020\026\032\004\030\0010\003HÆ\003J5\020\027\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\n\b\002\020\005\032\004\030\0010\0032\n\b\002\020\006\032\004\030\0010\003HÆ\001J\023\020\030\032\0020\0312\b\020\032\032\004\030\0010\001HÖ\003J\t\020\033\032\0020\nHÖ\001J\t\020\034\032\0020\003HÖ\001J%\020\035\032\0020\0362\006\020\037\032\0020\0002\006\020 \032\0020!2\006\020\"\032\0020#H\001¢\006\002\b$R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\016\020\017R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\020\020\017R\023\020\005\032\004\030\0010\003¢\006\b\n\000\032\004\b\021\020\017R\023\020\006\032\004\030\0010\003¢\006\b\n\000\032\004\b\022\020\017¨\006'"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicError;", "", "message", "", "type", "param", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMessage", "()Ljava/lang/String;", "getType", "getParam", "getCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */ public final class AnthropicError
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String message;
/*    */   @NotNull
/*    */   private final String type;
/*    */   @Nullable
/*    */   private final String param;
/*    */   @Nullable
/*    */   private final String code;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicError$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicError;", "core-llm"})
/*    */   public static final class Companion
/*    */   {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<AnthropicError> serializer() {
/* 66 */       return (KSerializer<AnthropicError>)AnthropicError.$serializer.INSTANCE;
/*    */     } }
/* 68 */   public AnthropicError(@NotNull String message, @NotNull String type, @Nullable String param, @Nullable String code) { this.message = message;
/* 69 */     this.type = type;
/* 70 */     this.param = param;
/* 71 */     this.code = code; } @Nullable public final String getCode() { return this.code; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String getMessage() {
/*    */     return this.message;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getType() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getParam() {
/*    */     return this.param;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.message;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component3() {
/*    */     return this.param;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component4() {
/*    */     return this.code;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AnthropicError copy(@NotNull String message, @NotNull String type, @Nullable String param, @Nullable String code) {
/*    */     Intrinsics.checkNotNullParameter(message, "message");
/*    */     Intrinsics.checkNotNullParameter(type, "type");
/*    */     return new AnthropicError(message, type, param, code);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AnthropicError(message=" + this.message + ", type=" + this.type + ", param=" + this.param + ", code=" + this.code + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.message.hashCode();
/*    */     result = result * 31 + this.type.hashCode();
/*    */     result = result * 31 + ((this.param == null) ? 0 : this.param.hashCode());
/*    */     return result * 31 + ((this.code == null) ? 0 : this.code.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AnthropicError))
/*    */       return false; 
/*    */     AnthropicError anthropicError = (AnthropicError)other;
/*    */     return !Intrinsics.areEqual(this.message, anthropicError.message) ? false : (!Intrinsics.areEqual(this.type, anthropicError.type) ? false : (!Intrinsics.areEqual(this.param, anthropicError.param) ? false : (!!Intrinsics.areEqual(this.code, anthropicError.code))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicError.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */