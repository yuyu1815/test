/*     */ package ai.grazie.api.gateway.api.llm;
/*     */ 
/*     */ import ai.grazie.model.llm.profile.LLMProfileID;
/*     */ import ai.grazie.model.llm.prompt.LLMPromptID;
/*     */ import ai.grazie.utils.attributes.Attributes;
/*     */ import ai.grazie.utils.attributes.Attributes$;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
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
/*     */ @Serializable
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\022\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 .2\0020\001:\002-.BK\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\007\022\b\020\t\032\004\030\0010\n\022\b\020\013\032\004\030\0010\f\022\b\020\r\032\004\030\0010\016¢\006\002\020\017B5\022\b\b\002\020\004\032\0020\005\022\006\020\006\032\0020\007\022\b\b\002\020\b\032\0020\007\022\006\020\t\032\0020\n\022\n\b\002\020\013\032\004\030\0010\f¢\006\002\020\020J\t\020\032\032\0020\005HÆ\003J\t\020\033\032\0020\007HÆ\003J\t\020\034\032\0020\007HÆ\003J\t\020\035\032\0020\nHÆ\003J\013\020\036\032\004\030\0010\fHÆ\003J=\020\037\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020\t\032\0020\n2\n\b\002\020\013\032\004\030\0010\fHÆ\001J\023\020 \032\0020!2\b\020\"\032\004\030\0010\001HÖ\003J\t\020#\032\0020\003HÖ\001J\t\020$\032\0020\007HÖ\001J&\020%\032\0020&2\006\020'\032\0020\0002\006\020(\032\0020)2\006\020*\032\0020+HÁ\001¢\006\002\b,R\023\020\013\032\004\030\0010\f¢\006\b\n\000\032\004\b\021\020\022R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\023\020\024R\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\025\020\026R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\027\020\030R\021\020\b\032\0020\007¢\006\b\n\000\032\004\b\031\020\024¨\006/"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V7$Request;", "", "seen1", "", "prompt", "Lai/grazie/model/llm/prompt/LLMPromptID;", "prefix", "", "suffix", "profile", "Lai/grazie/model/llm/profile/LLMProfileID;", "parameters", "Lai/grazie/utils/attributes/Attributes;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/llm/prompt/LLMPromptID;Ljava/lang/String;Ljava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/utils/attributes/Attributes;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/llm/prompt/LLMPromptID;Ljava/lang/String;Ljava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/utils/attributes/Attributes;)V", "getParameters", "()Lai/grazie/utils/attributes/Attributes;", "getPrefix", "()Ljava/lang/String;", "getProfile", "()Lai/grazie/model/llm/profile/LLMProfileID;", "getPrompt", "()Lai/grazie/model/llm/prompt/LLMPromptID;", "getSuffix", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */ public final class Request
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final LLMPromptID prompt;
/*     */   @NotNull
/*     */   private final String prefix;
/*     */   @NotNull
/*     */   private final String suffix;
/*     */   @NotNull
/*     */   private final LLMProfileID profile;
/*     */   @Nullable
/*     */   private final Attributes parameters;
/*     */   
/*     */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/llm/LlmAPI.Complete.Stream.V7.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V7$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*     */   public static final class $serializer
/*     */     implements GeneratedSerializer<Request>
/*     */   {
/*     */     @NotNull
/*     */     public static final $serializer INSTANCE = new $serializer();
/*     */     
/*     */     @NotNull
/*     */     public KSerializer<?>[] typeParametersSerializers() {
/*     */       return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public SerialDescriptor getDescriptor() {
/*     */       return (SerialDescriptor)descriptor;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public KSerializer<?>[] childSerializers() {
/*     */       KSerializer[] arrayOfKSerializer = new KSerializer[5];
/*     */       arrayOfKSerializer[0] = (KSerializer)LLMPromptID.Serializer.INSTANCE;
/*     */       arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE;
/*     */       arrayOfKSerializer[2] = (KSerializer)StringSerializer.INSTANCE;
/*     */       arrayOfKSerializer[3] = (KSerializer)LLMProfileID.Serializer.INSTANCE;
/*     */       arrayOfKSerializer[4] = BuiltinSerializersKt.getNullable((KSerializer)Attributes$.serializer.INSTANCE);
/*     */       return (KSerializer<?>[])arrayOfKSerializer;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public LlmAPI.Complete.Stream.V7.Request deserialize(@NotNull Decoder decoder) {
/*     */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       boolean bool = true;
/*     */       int i = 0;
/*     */       LLMPromptID lLMPromptID = null;
/*     */       String str1 = null, str2 = null;
/*     */       LLMProfileID lLMProfileID = null;
/*     */       Attributes attributes = null;
/*     */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */       if (compositeDecoder.decodeSequentially()) {
/*     */         lLMPromptID = (LLMPromptID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LLMPromptID.Serializer.INSTANCE, lLMPromptID);
/*     */         i |= 0x1;
/*     */         str1 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*     */         i |= 0x2;
/*     */         str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*     */         i |= 0x4;
/*     */         lLMProfileID = (LLMProfileID)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)LLMProfileID.Serializer.INSTANCE, lLMProfileID);
/*     */         i |= 0x8;
/*     */         attributes = (Attributes)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)Attributes$.serializer.INSTANCE, attributes);
/*     */         i |= 0x10;
/*     */       } else {
/*     */         while (bool) {
/*     */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */           switch (j) {
/*     */             case -1:
/*     */               bool = false;
/*     */               continue;
/*     */             case 0:
/*     */               lLMPromptID = (LLMPromptID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LLMPromptID.Serializer.INSTANCE, lLMPromptID);
/*     */               i |= 0x1;
/*     */               continue;
/*     */             case 1:
/*     */               str1 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*     */               i |= 0x2;
/*     */               continue;
/*     */             case 2:
/*     */               str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*     */               i |= 0x4;
/*     */               continue;
/*     */             case 3:
/*     */               lLMProfileID = (LLMProfileID)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)LLMProfileID.Serializer.INSTANCE, lLMProfileID);
/*     */               i |= 0x8;
/*     */               continue;
/*     */             case 4:
/*     */               attributes = (Attributes)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)Attributes$.serializer.INSTANCE, attributes);
/*     */               i |= 0x10;
/*     */               continue;
/*     */           } 
/*     */           throw new UnknownFieldException(j);
/*     */         } 
/*     */       } 
/*     */       compositeDecoder.endStructure(serialDescriptor);
/*     */       return new LlmAPI.Complete.Stream.V7.Request(i, lLMPromptID, str1, str2, lLMProfileID, attributes, null);
/*     */     }
/*     */     
/*     */     public void serialize(@NotNull Encoder encoder, @NotNull LlmAPI.Complete.Stream.V7.Request value) {
/*     */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */       Intrinsics.checkNotNullParameter(value, "value");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */       LlmAPI.Complete.Stream.V7.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */       compositeEncoder.endStructure(serialDescriptor);
/*     */     }
/*     */     
/*     */     static {
/*     */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.llm.LlmAPI.Complete.Stream.V7.Request", INSTANCE, 5);
/*     */       pluginGeneratedSerialDescriptor.addElement("prompt", true);
/*     */       pluginGeneratedSerialDescriptor.addElement("prefix", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("suffix", true);
/*     */       pluginGeneratedSerialDescriptor.addElement("profile", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("parameters", true);
/*     */       descriptor = pluginGeneratedSerialDescriptor;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V7$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V7$Request;", "api-gateway-api"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<LlmAPI.Complete.Stream.V7.Request> serializer() {
/*     */       return (KSerializer<LlmAPI.Complete.Stream.V7.Request>)LlmAPI.Complete.Stream.V7.Request.$serializer.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final LLMPromptID getPrompt() {
/*     */     return this.prompt;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getPrefix() {
/*     */     return this.prefix;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getSuffix() {
/*     */     return this.suffix;
/*     */   }
/*     */   
/*     */   public Request(@NotNull LLMPromptID prompt, @NotNull String prefix, @NotNull String suffix, @NotNull LLMProfileID profile, @Nullable Attributes parameters) {
/* 211 */     this.prompt = prompt;
/* 212 */     this.prefix = prefix; this.suffix = suffix;
/* 213 */     this.profile = profile; this.parameters = parameters; } @NotNull public final LLMProfileID getProfile() { return this.profile; } @Nullable public final Attributes getParameters() { return this.parameters; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final LLMPromptID component1() {
/*     */     return this.prompt;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.prefix;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component3() {
/*     */     return this.suffix;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final LLMProfileID component4() {
/*     */     return this.profile;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Attributes component5() {
/*     */     return this.parameters;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Request copy(@NotNull LLMPromptID prompt, @NotNull String prefix, @NotNull String suffix, @NotNull LLMProfileID profile, @Nullable Attributes parameters) {
/*     */     Intrinsics.checkNotNullParameter(prompt, "prompt");
/*     */     Intrinsics.checkNotNullParameter(prefix, "prefix");
/*     */     Intrinsics.checkNotNullParameter(suffix, "suffix");
/*     */     Intrinsics.checkNotNullParameter(profile, "profile");
/*     */     return new Request(prompt, prefix, suffix, profile, parameters);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "Request(prompt=" + this.prompt + ", prefix=" + this.prefix + ", suffix=" + this.suffix + ", profile=" + this.profile + ", parameters=" + this.parameters + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.prompt.hashCode();
/*     */     result = result * 31 + this.prefix.hashCode();
/*     */     result = result * 31 + this.suffix.hashCode();
/*     */     result = result * 31 + this.profile.hashCode();
/*     */     return result * 31 + ((this.parameters == null) ? 0 : this.parameters.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof Request))
/*     */       return false; 
/*     */     Request request = (Request)other;
/*     */     return !Intrinsics.areEqual(this.prompt, request.prompt) ? false : (!Intrinsics.areEqual(this.prefix, request.prefix) ? false : (!Intrinsics.areEqual(this.suffix, request.suffix) ? false : (!Intrinsics.areEqual(this.profile, request.profile) ? false : (!!Intrinsics.areEqual(this.parameters, request.parameters)))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\llm\LlmAPI$Complete$Stream$V7$Request.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */