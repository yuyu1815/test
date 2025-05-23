/*    */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.UnknownFieldException;
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
/*    */ @SerialName("base64")
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\013\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 $2\0020\001:\002#$B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006B/\b\020\022\006\020\007\032\0020\b\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\b\020\t\032\004\030\0010\n¢\006\004\b\005\020\013J\t\020\022\032\0020\003HÆ\003J\t\020\023\032\0020\003HÆ\003J\035\020\024\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003HÆ\001J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\030HÖ\003J\t\020\031\032\0020\bHÖ\001J\t\020\032\032\0020\003HÖ\001J%\020\033\032\0020\0342\006\020\035\032\0020\0002\006\020\036\032\0020\0372\006\020 \032\0020!H\001¢\006\002\b\"R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\f\020\r\032\004\b\016\020\017R\034\020\004\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\020\020\r\032\004\b\021\020\017¨\006%"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/Base64AnthropicSource;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicSource;", "mediaType", "", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMediaType$annotations", "()V", "getMediaType", "()Ljava/lang/String;", "getData$annotations", "getData", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */ public final class Base64AnthropicSource
/*    */   implements AnthropicSource {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String mediaType;
/*    */   @NotNull
/*    */   private final String data;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/Base64AnthropicSource$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/Base64AnthropicSource;", "core-llm"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<Base64AnthropicSource> serializer() {
/* 43 */       return (KSerializer<Base64AnthropicSource>)Base64AnthropicSource.$serializer.INSTANCE;
/*    */     } }
/*    */   
/* 46 */   public Base64AnthropicSource(@NotNull String mediaType, @NotNull String data) { this.mediaType = mediaType;
/* 47 */     this.data = data; } @NotNull public final String getData() { return this.data; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String getMediaType() {
/*    */     return this.mediaType;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.mediaType;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.data;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Base64AnthropicSource copy(@NotNull String mediaType, @NotNull String data) {
/*    */     Intrinsics.checkNotNullParameter(mediaType, "mediaType");
/*    */     Intrinsics.checkNotNullParameter(data, "data");
/*    */     return new Base64AnthropicSource(mediaType, data);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Base64AnthropicSource(mediaType=" + this.mediaType + ", data=" + this.data + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.mediaType.hashCode();
/*    */     return result * 31 + this.data.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Base64AnthropicSource))
/*    */       return false; 
/*    */     Base64AnthropicSource base64AnthropicSource = (Base64AnthropicSource)other;
/*    */     return !Intrinsics.areEqual(this.mediaType, base64AnthropicSource.mediaType) ? false : (!!Intrinsics.areEqual(this.data, base64AnthropicSource.data));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\Base64AnthropicSource.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */