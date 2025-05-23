/*     */ package ai.grazie.api.gateway.api.gec;
/*     */ 
/*     */ import ai.grazie.gec.model.CorrectionServiceType;
/*     */ import ai.grazie.gec.model.problem.SentenceWithProblems;
/*     */ import ai.grazie.gec.model.problem.SentenceWithProblems$;
/*     */ import ai.grazie.gec.model.request.SentenceWithExclusions;
/*     */ import ai.grazie.gec.model.request.SentenceWithExclusions$;
/*     */ import ai.grazie.gec.model.settings.UserSettings;
/*     */ import ai.grazie.gec.model.settings.UserSettings$;
/*     */ import ai.grazie.model.cloud.HttpMethod;
/*     */ import ai.grazie.model.cloud.TypeInfo;
/*     */ import ai.grazie.model.cloud.TypedApi;
/*     */ import ai.grazie.nlp.langs.Language;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KType;
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
/*     */ import kotlinx.serialization.internal.ArrayListSerializer;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.LinkedHashSetSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\002\023\024B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020¨\006\025"}, d2 = {"Lai/grazie/api/gateway/api/gec/GecAPI$Correct$V4;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/gec/GecAPI$Correct$V4$Request;", "Lai/grazie/api/gateway/api/gec/GecAPI$Correct$V4$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Request", "Response", "api-gateway-api"})
/*     */ @SourceDebugExtension({"SMAP\nGecAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GecAPI.kt\nai/grazie/api/gateway/api/gec/GecAPI$Correct$V4\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,155:1\n19#2,2:156\n19#2,2:158\n*S KotlinDebug\n*F\n+ 1 GecAPI.kt\nai/grazie/api/gateway/api/gec/GecAPI$Correct$V4\n*L\n61#1:156,2\n62#1:158,2\n*E\n"})
/*     */ public final class V4
/*     */   implements TypedApi<GecAPI.Correct.V4.Request, GecAPI.Correct.V4.Response>
/*     */ {
/*     */   @NotNull
/*     */   private static final TypeInfo<Request> requestType;
/*     */   @NotNull
/*     */   private static final TypeInfo<Response> responseType;
/*     */   @NotNull
/*  61 */   public static final V4 INSTANCE = new V4(); @NotNull public TypeInfo<Request> getRequestType() { return requestType; } static { int $i$f$typeInfo = 0;
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
/* 156 */     KType kType$iv = Reflection.typeOf(Request.class);
/* 157 */     requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0;
/* 158 */     kType$iv = Reflection.typeOf(Response.class);
/* 159 */     responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public TypeInfo<Response> getResponseType() {
/*     */     return responseType;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final HttpMethod httpMethod = HttpMethod.Post;
/*     */   
/*     */   @NotNull
/*     */   public HttpMethod getHttpMethod() {
/*     */     return httpMethod;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final String path = "/gec/correct/v4";
/*     */   
/*     */   @NotNull
/*     */   public String getPath() {
/*     */     return path;
/*     */   }
/*     */   
/*     */   @Serializable
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\\\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\"\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\020\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 .2\0020\001:\002-.BM\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\016\020\006\032\n\022\004\022\0020\b\030\0010\007\022\016\020\t\032\n\022\004\022\0020\013\030\0010\n\022\b\020\f\032\004\030\0010\r\022\b\020\016\032\004\030\0010\017¢\006\002\020\020B9\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007\022\020\b\002\020\t\032\n\022\004\022\0020\013\030\0010\n\022\n\b\002\020\f\032\004\030\0010\r¢\006\002\020\021J\t\020\032\032\0020\005HÆ\003J\017\020\033\032\b\022\004\022\0020\b0\007HÆ\003J\021\020\034\032\n\022\004\022\0020\013\030\0010\nHÆ\003J\013\020\035\032\004\030\0010\rHÆ\003JA\020\036\032\0020\0002\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\0072\020\b\002\020\t\032\n\022\004\022\0020\013\030\0010\n2\n\b\002\020\f\032\004\030\0010\rHÆ\001J\023\020\037\032\0020 2\b\020!\032\004\030\0010\001HÖ\003J\t\020\"\032\0020\003HÖ\001J\t\020#\032\0020$HÖ\001J&\020%\032\0020&2\006\020'\032\0020\0002\006\020(\032\0020)2\006\020*\032\0020+HÁ\001¢\006\002\b,R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\022\020\023R\027\020\006\032\b\022\004\022\0020\b0\007¢\006\b\n\000\032\004\b\024\020\025R\031\020\t\032\n\022\004\022\0020\013\030\0010\n¢\006\b\n\000\032\004\b\026\020\027R\023\020\f\032\004\030\0010\r¢\006\b\n\000\032\004\b\030\020\031¨\006/"}, d2 = {"Lai/grazie/api/gateway/api/gec/GecAPI$Correct$V4$Request;", "", "seen1", "", "lang", "Lai/grazie/nlp/langs/Language;", "sentences", "", "Lai/grazie/gec/model/request/SentenceWithExclusions;", "services", "", "Lai/grazie/gec/model/CorrectionServiceType;", "userSettings", "Lai/grazie/gec/model/settings/UserSettings;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/nlp/langs/Language;Ljava/util/List;Ljava/util/Set;Lai/grazie/gec/model/settings/UserSettings;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/nlp/langs/Language;Ljava/util/List;Ljava/util/Set;Lai/grazie/gec/model/settings/UserSettings;)V", "getLang", "()Lai/grazie/nlp/langs/Language;", "getSentences", "()Ljava/util/List;", "getServices", "()Ljava/util/Set;", "getUserSettings", "()Lai/grazie/gec/model/settings/UserSettings;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */   public static final class Request {
/*     */     @NotNull
/*     */     public static final Companion Companion = new Companion(null);
/*     */     @NotNull
/*     */     private final Language lang;
/*     */     @NotNull
/*     */     private final List<SentenceWithExclusions> sentences;
/*     */     @Nullable
/*     */     private final Set<CorrectionServiceType> services;
/*     */     @Nullable
/*     */     private final UserSettings userSettings;
/*     */     @JvmField
/*     */     @NotNull
/*     */     private static final KSerializer<Object>[] $childSerializers;
/*     */     
/*     */     public Request(@NotNull Language lang, @NotNull List<SentenceWithExclusions> sentences, @Nullable Set<CorrectionServiceType> services, @Nullable UserSettings userSettings) {
/*     */       this.lang = lang;
/*     */       this.sentences = sentences;
/*     */       this.services = services;
/*     */       this.userSettings = userSettings;
/*     */     }
/*     */     
/*     */     static {
/*     */       KSerializer[] arrayOfKSerializer = new KSerializer[4];
/*     */       arrayOfKSerializer[0] = null;
/*     */       arrayOfKSerializer[1] = (KSerializer)new ArrayListSerializer((KSerializer)SentenceWithExclusions$.serializer.INSTANCE);
/*     */       arrayOfKSerializer[2] = (KSerializer)new LinkedHashSetSerializer((KSerializer)CorrectionServiceType.Serializer.INSTANCE);
/*     */       arrayOfKSerializer[3] = null;
/*     */       $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */     }
/*     */     
/*     */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/gec/GecAPI.Correct.V4.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/gec/GecAPI$Correct$V4$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*     */     public static final class $serializer implements GeneratedSerializer<Request> {
/*     */       @NotNull
/*     */       public static final $serializer INSTANCE = new $serializer();
/*     */       
/*     */       @NotNull
/*     */       public KSerializer<?>[] typeParametersSerializers() {
/*     */         return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public SerialDescriptor getDescriptor() {
/*     */         return (SerialDescriptor)descriptor;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public KSerializer<?>[] childSerializers() {
/*     */         KSerializer[] arrayOfKSerializer1 = (KSerializer[])GecAPI.Correct.V4.Request.$childSerializers, arrayOfKSerializer2 = new KSerializer[4];
/*     */         arrayOfKSerializer2[0] = (KSerializer)Language.Serializer.INSTANCE;
/*     */         arrayOfKSerializer2[1] = arrayOfKSerializer1[1];
/*     */         arrayOfKSerializer2[2] = BuiltinSerializersKt.getNullable(arrayOfKSerializer1[2]);
/*     */         arrayOfKSerializer2[3] = BuiltinSerializersKt.getNullable((KSerializer)UserSettings$.serializer.INSTANCE);
/*     */         return (KSerializer<?>[])arrayOfKSerializer2;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public GecAPI.Correct.V4.Request deserialize(@NotNull Decoder decoder) {
/*     */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         boolean bool = true;
/*     */         int i = 0;
/*     */         Language language = null;
/*     */         List list = null;
/*     */         Set set = null;
/*     */         UserSettings userSettings = null;
/*     */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */         KSerializer[] arrayOfKSerializer = (KSerializer[])GecAPI.Correct.V4.Request.$childSerializers;
/*     */         if (compositeDecoder.decodeSequentially()) {
/*     */           language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Language.Serializer.INSTANCE, language);
/*     */           i |= 0x1;
/*     */           list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list);
/*     */           i |= 0x2;
/*     */           set = (Set)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], set);
/*     */           i |= 0x4;
/*     */           userSettings = (UserSettings)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)UserSettings$.serializer.INSTANCE, userSettings);
/*     */           i |= 0x8;
/*     */         } else {
/*     */           while (bool) {
/*     */             int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */             switch (j) {
/*     */               case -1:
/*     */                 bool = false;
/*     */                 continue;
/*     */               case 0:
/*     */                 language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Language.Serializer.INSTANCE, language);
/*     */                 i |= 0x1;
/*     */                 continue;
/*     */               case 1:
/*     */                 list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list);
/*     */                 i |= 0x2;
/*     */                 continue;
/*     */               case 2:
/*     */                 set = (Set)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], set);
/*     */                 i |= 0x4;
/*     */                 continue;
/*     */               case 3:
/*     */                 userSettings = (UserSettings)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)UserSettings$.serializer.INSTANCE, userSettings);
/*     */                 i |= 0x8;
/*     */                 continue;
/*     */             } 
/*     */             throw new UnknownFieldException(j);
/*     */           } 
/*     */         } 
/*     */         compositeDecoder.endStructure(serialDescriptor);
/*     */         return new GecAPI.Correct.V4.Request(i, language, list, set, userSettings, null);
/*     */       }
/*     */       
/*     */       public void serialize(@NotNull Encoder encoder, @NotNull GecAPI.Correct.V4.Request value) {
/*     */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */         Intrinsics.checkNotNullParameter(value, "value");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */         GecAPI.Correct.V4.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */         compositeEncoder.endStructure(serialDescriptor);
/*     */       }
/*     */       
/*     */       static {
/*     */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.gec.GecAPI.Correct.V4.Request", INSTANCE, 4);
/*     */         pluginGeneratedSerialDescriptor.addElement("lang", false);
/*     */         pluginGeneratedSerialDescriptor.addElement("sentences", false);
/*     */         pluginGeneratedSerialDescriptor.addElement("services", true);
/*     */         pluginGeneratedSerialDescriptor.addElement("userSettings", true);
/*     */         descriptor = pluginGeneratedSerialDescriptor;
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/gec/GecAPI$Correct$V4$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/gec/GecAPI$Correct$V4$Request;", "api-gateway-api"})
/*     */     public static final class Companion {
/*     */       private Companion() {}
/*     */       
/*     */       @NotNull
/*     */       public final KSerializer<GecAPI.Correct.V4.Request> serializer() {
/*     */         return (KSerializer<GecAPI.Correct.V4.Request>)GecAPI.Correct.V4.Request.$serializer.INSTANCE;
/*     */       }
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Language getLang() {
/*     */       return this.lang;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final List<SentenceWithExclusions> getSentences() {
/*     */       return this.sentences;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Set<CorrectionServiceType> getServices() {
/*     */       return this.services;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final UserSettings getUserSettings() {
/*     */       return this.userSettings;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Language component1() {
/*     */       return this.lang;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final List<SentenceWithExclusions> component2() {
/*     */       return this.sentences;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Set<CorrectionServiceType> component3() {
/*     */       return this.services;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final UserSettings component4() {
/*     */       return this.userSettings;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Request copy(@NotNull Language lang, @NotNull List<SentenceWithExclusions> sentences, @Nullable Set<? extends CorrectionServiceType> services, @Nullable UserSettings userSettings) {
/*     */       Intrinsics.checkNotNullParameter(lang, "lang");
/*     */       Intrinsics.checkNotNullParameter(sentences, "sentences");
/*     */       return new Request(lang, sentences, services, userSettings);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "Request(lang=" + this.lang + ", sentences=" + this.sentences + ", services=" + this.services + ", userSettings=" + this.userSettings + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = this.lang.hashCode();
/*     */       result = result * 31 + this.sentences.hashCode();
/*     */       result = result * 31 + ((this.services == null) ? 0 : this.services.hashCode());
/*     */       return result * 31 + ((this.userSettings == null) ? 0 : this.userSettings.hashCode());
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof Request))
/*     */         return false; 
/*     */       Request request = (Request)other;
/*     */       return (this.lang != request.lang) ? false : (!Intrinsics.areEqual(this.sentences, request.sentences) ? false : (!Intrinsics.areEqual(this.services, request.services) ? false : (!!Intrinsics.areEqual(this.userSettings, request.userSettings))));
/*     */     }
/*     */   }
/*     */   
/*     */   @Serializable
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0362\0020\001:\002\035\036B)\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\023\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\nJ\017\020\r\032\b\022\004\022\0020\0060\005HÆ\003J\031\020\016\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\024HÖ\001J&\020\025\032\0020\0262\006\020\027\032\0020\0002\006\020\030\032\0020\0312\006\020\032\032\0020\033HÁ\001¢\006\002\b\034R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\037"}, d2 = {"Lai/grazie/api/gateway/api/gec/GecAPI$Correct$V4$Response;", "", "seen1", "", "corrections", "", "Lai/grazie/gec/model/problem/SentenceWithProblems;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getCorrections", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */   public static final class Response {
/*     */     @NotNull
/*     */     public static final Companion Companion = new Companion(null);
/*     */     @NotNull
/*     */     private final List<SentenceWithProblems> corrections;
/*     */     @JvmField
/*     */     @NotNull
/*     */     private static final KSerializer<Object>[] $childSerializers;
/*     */     
/*     */     public Response(@NotNull List<SentenceWithProblems> corrections) {
/*     */       this.corrections = corrections;
/*     */     }
/*     */     
/*     */     static {
/*     */       KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*     */       arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)SentenceWithProblems$.serializer.INSTANCE);
/*     */       $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */     }
/*     */     
/*     */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/gec/GecAPI.Correct.V4.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/gec/GecAPI$Correct$V4$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*     */     public static final class $serializer implements GeneratedSerializer<Response> {
/*     */       @NotNull
/*     */       public static final $serializer INSTANCE = new $serializer();
/*     */       
/*     */       @NotNull
/*     */       public KSerializer<?>[] typeParametersSerializers() {
/*     */         return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public SerialDescriptor getDescriptor() {
/*     */         return (SerialDescriptor)descriptor;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public KSerializer<?>[] childSerializers() {
/*     */         KSerializer[] arrayOfKSerializer1 = (KSerializer[])GecAPI.Correct.V4.Response.$childSerializers, arrayOfKSerializer2 = new KSerializer[1];
/*     */         arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*     */         return (KSerializer<?>[])arrayOfKSerializer2;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public GecAPI.Correct.V4.Response deserialize(@NotNull Decoder decoder) {
/*     */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         boolean bool = true;
/*     */         int i = 0;
/*     */         List list = null;
/*     */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */         KSerializer[] arrayOfKSerializer = (KSerializer[])GecAPI.Correct.V4.Response.$childSerializers;
/*     */         if (compositeDecoder.decodeSequentially()) {
/*     */           list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list);
/*     */           i |= 0x1;
/*     */         } else {
/*     */           while (bool) {
/*     */             int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */             switch (j) {
/*     */               case -1:
/*     */                 bool = false;
/*     */                 continue;
/*     */               case 0:
/*     */                 list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list);
/*     */                 i |= 0x1;
/*     */                 continue;
/*     */             } 
/*     */             throw new UnknownFieldException(j);
/*     */           } 
/*     */         } 
/*     */         compositeDecoder.endStructure(serialDescriptor);
/*     */         return new GecAPI.Correct.V4.Response(i, list, null);
/*     */       }
/*     */       
/*     */       public void serialize(@NotNull Encoder encoder, @NotNull GecAPI.Correct.V4.Response value) {
/*     */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */         Intrinsics.checkNotNullParameter(value, "value");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */         GecAPI.Correct.V4.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */         compositeEncoder.endStructure(serialDescriptor);
/*     */       }
/*     */       
/*     */       static {
/*     */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.gec.GecAPI.Correct.V4.Response", INSTANCE, 1);
/*     */         pluginGeneratedSerialDescriptor.addElement("corrections", false);
/*     */         descriptor = pluginGeneratedSerialDescriptor;
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/gec/GecAPI$Correct$V4$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/gec/GecAPI$Correct$V4$Response;", "api-gateway-api"})
/*     */     public static final class Companion {
/*     */       private Companion() {}
/*     */       
/*     */       @NotNull
/*     */       public final KSerializer<GecAPI.Correct.V4.Response> serializer() {
/*     */         return (KSerializer<GecAPI.Correct.V4.Response>)GecAPI.Correct.V4.Response.$serializer.INSTANCE;
/*     */       }
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final List<SentenceWithProblems> getCorrections() {
/*     */       return this.corrections;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final List<SentenceWithProblems> component1() {
/*     */       return this.corrections;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Response copy(@NotNull List<SentenceWithProblems> corrections) {
/*     */       Intrinsics.checkNotNullParameter(corrections, "corrections");
/*     */       return new Response(corrections);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "Response(corrections=" + this.corrections + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       return this.corrections.hashCode();
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof Response))
/*     */         return false; 
/*     */       Response response = (Response)other;
/*     */       return !!Intrinsics.areEqual(this.corrections, response.corrections);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\gec\GecAPI$Correct$V4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */