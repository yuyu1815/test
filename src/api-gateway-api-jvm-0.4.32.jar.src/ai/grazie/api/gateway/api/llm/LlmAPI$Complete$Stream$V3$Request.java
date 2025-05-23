/*     */ package ai.grazie.api.gateway.api.llm;
/*     */ 
/*     */ import ai.grazie.model.llm.profile.LLMProfileID;
/*     */ import ai.grazie.model.llm.profile.OpenAIProfileIDs;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\017\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 )2\0020\001:\002()BA\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\b\022\b\020\t\032\004\030\0010\n\022\b\020\013\032\004\030\0010\f¢\006\002\020\rB-\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\005\022\b\b\002\020\007\032\0020\b\022\n\b\002\020\t\032\004\030\0010\n¢\006\002\020\016J\t\020\026\032\0020\005HÆ\003J\t\020\027\032\0020\005HÆ\003J\t\020\030\032\0020\bHÆ\003J\013\020\031\032\004\030\0010\nHÆ\003J3\020\032\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\b2\n\b\002\020\t\032\004\030\0010\nHÆ\001J\023\020\033\032\0020\0342\b\020\035\032\004\030\0010\001HÖ\003J\t\020\036\032\0020\003HÖ\001J\t\020\037\032\0020\005HÖ\001J&\020 \032\0020!2\006\020\"\032\0020\0002\006\020#\032\0020$2\006\020%\032\0020&HÁ\001¢\006\002\b'R\023\020\t\032\004\030\0010\n¢\006\b\n\000\032\004\b\017\020\020R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\021\020\022R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\023\020\024R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\025\020\022¨\006*"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V3$Request;", "", "seen1", "", "prompt", "", "postfix", "profile", "Lai/grazie/model/llm/profile/LLMProfileID;", "parameters", "Lai/grazie/utils/attributes/Attributes;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/utils/attributes/Attributes;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/utils/attributes/Attributes;)V", "getParameters", "()Lai/grazie/utils/attributes/Attributes;", "getPostfix", "()Ljava/lang/String;", "getProfile", "()Lai/grazie/model/llm/profile/LLMProfileID;", "getPrompt", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */ public final class Request
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final String prompt;
/*     */   @NotNull
/*     */   private final String postfix;
/*     */   @NotNull
/*     */   private final LLMProfileID profile;
/*     */   @Nullable
/*     */   private final Attributes parameters;
/*     */   
/*     */   public Request(@NotNull String prompt, @NotNull String postfix, @NotNull LLMProfileID profile, @Nullable Attributes parameters) {
/* 162 */     this.prompt = prompt;
/* 163 */     this.postfix = postfix;
/* 164 */     this.profile = profile;
/* 165 */     this.parameters = parameters; } @Nullable public final Attributes getParameters() { return this.parameters; }
/*     */ 
/*     */   
/*     */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/llm/LlmAPI.Complete.Stream.V3.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V3$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*     */   public static final class $serializer implements GeneratedSerializer<Request> {
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
/*     */       KSerializer[] arrayOfKSerializer = new KSerializer[4];
/*     */       arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*     */       arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE;
/*     */       arrayOfKSerializer[2] = (KSerializer)LLMProfileID.Serializer.INSTANCE;
/*     */       arrayOfKSerializer[3] = BuiltinSerializersKt.getNullable((KSerializer)Attributes$.serializer.INSTANCE);
/*     */       return (KSerializer<?>[])arrayOfKSerializer;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public LlmAPI.Complete.Stream.V3.Request deserialize(@NotNull Decoder decoder) {
/*     */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       boolean bool = true;
/*     */       int i = 0;
/*     */       String str1 = null, str2 = null;
/*     */       LLMProfileID lLMProfileID = null;
/*     */       Attributes attributes = null;
/*     */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */       if (compositeDecoder.decodeSequentially()) {
/*     */         str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*     */         i |= 0x1;
/*     */         str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*     */         i |= 0x2;
/*     */         lLMProfileID = (LLMProfileID)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)LLMProfileID.Serializer.INSTANCE, lLMProfileID);
/*     */         i |= 0x4;
/*     */         attributes = (Attributes)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)Attributes$.serializer.INSTANCE, attributes);
/*     */         i |= 0x8;
/*     */       } else {
/*     */         while (bool) {
/*     */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */           switch (j) {
/*     */             case -1:
/*     */               bool = false;
/*     */               continue;
/*     */             case 0:
/*     */               str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*     */               i |= 0x1;
/*     */               continue;
/*     */             case 1:
/*     */               str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*     */               i |= 0x2;
/*     */               continue;
/*     */             case 2:
/*     */               lLMProfileID = (LLMProfileID)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)LLMProfileID.Serializer.INSTANCE, lLMProfileID);
/*     */               i |= 0x4;
/*     */               continue;
/*     */             case 3:
/*     */               attributes = (Attributes)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)Attributes$.serializer.INSTANCE, attributes);
/*     */               i |= 0x8;
/*     */               continue;
/*     */           } 
/*     */           throw new UnknownFieldException(j);
/*     */         } 
/*     */       } 
/*     */       compositeDecoder.endStructure(serialDescriptor);
/*     */       return new LlmAPI.Complete.Stream.V3.Request(i, str1, str2, lLMProfileID, attributes, null);
/*     */     }
/*     */     
/*     */     public void serialize(@NotNull Encoder encoder, @NotNull LlmAPI.Complete.Stream.V3.Request value) {
/*     */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */       Intrinsics.checkNotNullParameter(value, "value");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */       LlmAPI.Complete.Stream.V3.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */       compositeEncoder.endStructure(serialDescriptor);
/*     */     }
/*     */     
/*     */     static {
/*     */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.llm.LlmAPI.Complete.Stream.V3.Request", INSTANCE, 4);
/*     */       pluginGeneratedSerialDescriptor.addElement("prompt", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("postfix", true);
/*     */       pluginGeneratedSerialDescriptor.addElement("profile", true);
/*     */       pluginGeneratedSerialDescriptor.addElement("parameters", true);
/*     */       descriptor = pluginGeneratedSerialDescriptor;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V3$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V3$Request;", "api-gateway-api"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<LlmAPI.Complete.Stream.V3.Request> serializer() {
/*     */       return (KSerializer<LlmAPI.Complete.Stream.V3.Request>)LlmAPI.Complete.Stream.V3.Request.$serializer.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getPrompt() {
/*     */     return this.prompt;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getPostfix() {
/*     */     return this.postfix;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final LLMProfileID getProfile() {
/*     */     return this.profile;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.prompt;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.postfix;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final LLMProfileID component3() {
/*     */     return this.profile;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Attributes component4() {
/*     */     return this.parameters;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Request copy(@NotNull String prompt, @NotNull String postfix, @NotNull LLMProfileID profile, @Nullable Attributes parameters) {
/*     */     Intrinsics.checkNotNullParameter(prompt, "prompt");
/*     */     Intrinsics.checkNotNullParameter(postfix, "postfix");
/*     */     Intrinsics.checkNotNullParameter(profile, "profile");
/*     */     return new Request(prompt, postfix, profile, parameters);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "Request(prompt=" + this.prompt + ", postfix=" + this.postfix + ", profile=" + this.profile + ", parameters=" + this.parameters + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.prompt.hashCode();
/*     */     result = result * 31 + this.postfix.hashCode();
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
/*     */     return !Intrinsics.areEqual(this.prompt, request.prompt) ? false : (!Intrinsics.areEqual(this.postfix, request.postfix) ? false : (!Intrinsics.areEqual(this.profile, request.profile) ? false : (!!Intrinsics.areEqual(this.parameters, request.parameters))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\llm\LlmAPI$Complete$Stream$V3$Request.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */