/*    */ package ai.grazie.api.gateway.api.trf;
/*    */ 
/*    */ import ai.grazie.model.cloud.HttpMethod;
/*    */ import ai.grazie.model.cloud.TypeInfo;
/*    */ import ai.grazie.model.cloud.TypedApi;
/*    */ import ai.grazie.sum.Format;
/*    */ import ai.grazie.sum.SentenceWithSummaries;
/*    */ import ai.grazie.sum.SentenceWithSummaries$;
/*    */ import java.util.List;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.reflect.KType;
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
/*    */ import kotlinx.serialization.internal.ArrayListSerializer;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.IntSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\002\023\024B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020¨\006\025"}, d2 = {"Lai/grazie/api/gateway/api/trf/SumAPI$Summarize$WithCache$V1;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/trf/SumAPI$Summarize$WithCache$V1$Request;", "Lai/grazie/api/gateway/api/trf/SumAPI$Summarize$WithCache$V1$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Request", "Response", "api-gateway-api"})
/*    */ @SourceDebugExtension({"SMAP\nSumAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SumAPI.kt\nai/grazie/api/gateway/api/trf/SumAPI$Summarize$WithCache$V1\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,69:1\n19#2,2:70\n19#2,2:72\n*S KotlinDebug\n*F\n+ 1 SumAPI.kt\nai/grazie/api/gateway/api/trf/SumAPI$Summarize$WithCache$V1\n*L\n50#1:70,2\n51#1:72,2\n*E\n"})
/*    */ public final class V1
/*    */   implements TypedApi<SumAPI.Summarize.WithCache.V1.Request, SumAPI.Summarize.WithCache.V1.Response> {
/*    */   @NotNull
/*    */   private static final TypeInfo<Request> requestType;
/*    */   @NotNull
/*    */   private static final TypeInfo<Response> responseType;
/*    */   @NotNull
/* 50 */   public static final V1 INSTANCE = new V1(); @NotNull public TypeInfo<Request> getRequestType() { return requestType; } static { int $i$f$typeInfo = 0;
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
/* 70 */     KType kType$iv = Reflection.typeOf(Request.class);
/* 71 */     requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0;
/* 72 */     kType$iv = Reflection.typeOf(Response.class);
/* 73 */     responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public TypeInfo<Response> getResponseType() {
/*    */     return responseType;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private static final HttpMethod httpMethod = HttpMethod.Post;
/*    */   
/*    */   @NotNull
/*    */   public HttpMethod getHttpMethod() {
/*    */     return httpMethod;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private static final String path = "/trf/sum/summarize-with-cache";
/*    */   
/*    */   @NotNull
/*    */   public String getPath() {
/*    */     return path;
/*    */   }
/*    */   
/*    */   @Serializable
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020 \n\002\020\016\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\021\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 ,2\0020\001:\002+,BG\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b\022\b\020\t\032\004\030\0010\003\022\b\020\n\032\004\030\0010\003\022\b\020\013\032\004\030\0010\f¢\006\002\020\rB7\022\f\020\004\032\b\022\004\022\0020\0060\005\022\n\b\002\020\007\032\004\030\0010\b\022\n\b\002\020\t\032\004\030\0010\003\022\n\b\002\020\n\032\004\030\0010\003¢\006\002\020\016J\017\020\027\032\b\022\004\022\0020\0060\005HÆ\003J\013\020\030\032\004\030\0010\bHÆ\003J\020\020\031\032\004\030\0010\003HÆ\003¢\006\002\020\022J\020\020\032\032\004\030\0010\003HÆ\003¢\006\002\020\022JB\020\033\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\n\b\002\020\007\032\004\030\0010\b2\n\b\002\020\t\032\004\030\0010\0032\n\b\002\020\n\032\004\030\0010\003HÆ\001¢\006\002\020\034J\023\020\035\032\0020\0362\b\020\037\032\004\030\0010 HÖ\003J\t\020!\032\0020\003HÖ\001J\t\020\"\032\0020\006HÖ\001J&\020#\032\0020$2\006\020%\032\0020\0002\006\020&\032\0020'2\006\020(\032\0020)HÁ\001¢\006\002\b*R\026\020\007\032\004\030\0010\bX\004¢\006\b\n\000\032\004\b\017\020\020R\030\020\n\032\004\030\0010\003X\004¢\006\n\n\002\020\023\032\004\b\021\020\022R\030\020\t\032\004\030\0010\003X\004¢\006\n\n\002\020\023\032\004\b\024\020\022R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\025\020\026¨\006-"}, d2 = {"Lai/grazie/api/gateway/api/trf/SumAPI$Summarize$WithCache$V1$Request;", "Lai/grazie/api/gateway/api/trf/SumAPI$Summarize$SummarizeRequest;", "seen1", "", "texts", "", "", "format", "Lai/grazie/sum/Format;", "minimumBPE", "maximumBPE", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lai/grazie/sum/Format;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Lai/grazie/sum/Format;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getFormat", "()Lai/grazie/sum/Format;", "getMaximumBPE", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinimumBPE", "getTexts", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Lai/grazie/sum/Format;Ljava/lang/Integer;Ljava/lang/Integer;)Lai/grazie/api/gateway/api/trf/SumAPI$Summarize$WithCache$V1$Request;", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */   public static final class Request implements SumAPI.Summarize.SummarizeRequest {
/*    */     @NotNull
/*    */     public static final Companion Companion = new Companion(null);
/*    */     @NotNull
/*    */     private final List<String> texts;
/*    */     @Nullable
/*    */     private final Format format;
/*    */     @Nullable
/*    */     private final Integer minimumBPE;
/*    */     @Nullable
/*    */     private final Integer maximumBPE;
/*    */     @JvmField
/*    */     @NotNull
/*    */     private static final KSerializer<Object>[] $childSerializers;
/*    */     
/*    */     public Request(@NotNull List<String> texts, @Nullable Format format, @Nullable Integer minimumBPE, @Nullable Integer maximumBPE) {
/*    */       this.texts = texts;
/*    */       this.format = format;
/*    */       this.minimumBPE = minimumBPE;
/*    */       this.maximumBPE = maximumBPE;
/*    */     }
/*    */     
/*    */     static {
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[4];
/*    */       arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE);
/*    */       arrayOfKSerializer[1] = Format.Companion.serializer();
/*    */       arrayOfKSerializer[2] = null;
/*    */       arrayOfKSerializer[3] = null;
/*    */       $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/trf/SumAPI.Summarize.WithCache.V1.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/trf/SumAPI$Summarize$WithCache$V1$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*    */     public static final class $serializer implements GeneratedSerializer<Request> {
/*    */       @NotNull
/*    */       public static final $serializer INSTANCE = new $serializer();
/*    */       
/*    */       @NotNull
/*    */       public KSerializer<?>[] typeParametersSerializers() {
/*    */         return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public SerialDescriptor getDescriptor() {
/*    */         return (SerialDescriptor)descriptor;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public KSerializer<?>[] childSerializers() {
/*    */         KSerializer[] arrayOfKSerializer1 = (KSerializer[])SumAPI.Summarize.WithCache.V1.Request.$childSerializers, arrayOfKSerializer2 = new KSerializer[4];
/*    */         arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*    */         arrayOfKSerializer2[1] = BuiltinSerializersKt.getNullable(arrayOfKSerializer1[1]);
/*    */         arrayOfKSerializer2[2] = BuiltinSerializersKt.getNullable((KSerializer)IntSerializer.INSTANCE);
/*    */         arrayOfKSerializer2[3] = BuiltinSerializersKt.getNullable((KSerializer)IntSerializer.INSTANCE);
/*    */         return (KSerializer<?>[])arrayOfKSerializer2;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public SumAPI.Summarize.WithCache.V1.Request deserialize(@NotNull Decoder decoder) {
/*    */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         boolean bool = true;
/*    */         int i = 0;
/*    */         List list = null;
/*    */         Format format = null;
/*    */         Integer integer1 = null, integer2 = null;
/*    */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */         KSerializer[] arrayOfKSerializer = (KSerializer[])SumAPI.Summarize.WithCache.V1.Request.$childSerializers;
/*    */         if (compositeDecoder.decodeSequentially()) {
/*    */           list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list);
/*    */           i |= 0x1;
/*    */           format = (Format)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], format);
/*    */           i |= 0x2;
/*    */           integer1 = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)IntSerializer.INSTANCE, integer1);
/*    */           i |= 0x4;
/*    */           integer2 = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)IntSerializer.INSTANCE, integer2);
/*    */           i |= 0x8;
/*    */         } else {
/*    */           while (bool) {
/*    */             int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */             switch (j) {
/*    */               case -1:
/*    */                 bool = false;
/*    */                 continue;
/*    */               case 0:
/*    */                 list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list);
/*    */                 i |= 0x1;
/*    */                 continue;
/*    */               case 1:
/*    */                 format = (Format)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], format);
/*    */                 i |= 0x2;
/*    */                 continue;
/*    */               case 2:
/*    */                 integer1 = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)IntSerializer.INSTANCE, integer1);
/*    */                 i |= 0x4;
/*    */                 continue;
/*    */               case 3:
/*    */                 integer2 = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)IntSerializer.INSTANCE, integer2);
/*    */                 i |= 0x8;
/*    */                 continue;
/*    */             } 
/*    */             throw new UnknownFieldException(j);
/*    */           } 
/*    */         } 
/*    */         compositeDecoder.endStructure(serialDescriptor);
/*    */         return new SumAPI.Summarize.WithCache.V1.Request(i, list, format, integer1, integer2, null);
/*    */       }
/*    */       
/*    */       public void serialize(@NotNull Encoder encoder, @NotNull SumAPI.Summarize.WithCache.V1.Request value) {
/*    */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */         Intrinsics.checkNotNullParameter(value, "value");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */         SumAPI.Summarize.WithCache.V1.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*    */         compositeEncoder.endStructure(serialDescriptor);
/*    */       }
/*    */       
/*    */       static {
/*    */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.trf.SumAPI.Summarize.WithCache.V1.Request", INSTANCE, 4);
/*    */         pluginGeneratedSerialDescriptor.addElement("texts", false);
/*    */         pluginGeneratedSerialDescriptor.addElement("format", true);
/*    */         pluginGeneratedSerialDescriptor.addElement("minimumBPE", true);
/*    */         pluginGeneratedSerialDescriptor.addElement("maximumBPE", true);
/*    */         descriptor = pluginGeneratedSerialDescriptor;
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/trf/SumAPI$Summarize$WithCache$V1$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/trf/SumAPI$Summarize$WithCache$V1$Request;", "api-gateway-api"})
/*    */     public static final class Companion {
/*    */       private Companion() {}
/*    */       
/*    */       @NotNull
/*    */       public final KSerializer<SumAPI.Summarize.WithCache.V1.Request> serializer() {
/*    */         return (KSerializer<SumAPI.Summarize.WithCache.V1.Request>)SumAPI.Summarize.WithCache.V1.Request.$serializer.INSTANCE;
/*    */       }
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final List<String> getTexts() {
/*    */       return this.texts;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public Format getFormat() {
/*    */       return this.format;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public Integer getMinimumBPE() {
/*    */       return this.minimumBPE;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public Integer getMaximumBPE() {
/*    */       return this.maximumBPE;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final List<String> component1() {
/*    */       return this.texts;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Format component2() {
/*    */       return this.format;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Integer component3() {
/*    */       return this.minimumBPE;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Integer component4() {
/*    */       return this.maximumBPE;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Request copy(@NotNull List<String> texts, @Nullable Format format, @Nullable Integer minimumBPE, @Nullable Integer maximumBPE) {
/*    */       Intrinsics.checkNotNullParameter(texts, "texts");
/*    */       return new Request(texts, format, minimumBPE, maximumBPE);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Request(texts=" + this.texts + ", format=" + this.format + ", minimumBPE=" + this.minimumBPE + ", maximumBPE=" + this.maximumBPE + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = this.texts.hashCode();
/*    */       result = result * 31 + ((this.format == null) ? 0 : this.format.hashCode());
/*    */       result = result * 31 + ((this.minimumBPE == null) ? 0 : this.minimumBPE.hashCode());
/*    */       return result * 31 + ((this.maximumBPE == null) ? 0 : this.maximumBPE.hashCode());
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Request))
/*    */         return false; 
/*    */       Request request = (Request)other;
/*    */       return !Intrinsics.areEqual(this.texts, request.texts) ? false : ((this.format != request.format) ? false : (!Intrinsics.areEqual(this.minimumBPE, request.minimumBPE) ? false : (!!Intrinsics.areEqual(this.maximumBPE, request.maximumBPE))));
/*    */     }
/*    */   }
/*    */   
/*    */   @Serializable
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0362\0020\001:\002\035\036B)\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\023\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\nJ\017\020\r\032\b\022\004\022\0020\0060\005HÆ\003J\031\020\016\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\024HÖ\001J&\020\025\032\0020\0262\006\020\027\032\0020\0002\006\020\030\032\0020\0312\006\020\032\032\0020\033HÁ\001¢\006\002\b\034R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\037"}, d2 = {"Lai/grazie/api/gateway/api/trf/SumAPI$Summarize$WithCache$V1$Response;", "", "seen1", "", "summaries", "", "Lai/grazie/sum/SentenceWithSummaries;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getSummaries", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */   public static final class Response {
/*    */     @NotNull
/*    */     public static final Companion Companion = new Companion(null);
/*    */     @NotNull
/*    */     private final List<SentenceWithSummaries> summaries;
/*    */     @JvmField
/*    */     @NotNull
/*    */     private static final KSerializer<Object>[] $childSerializers;
/*    */     
/*    */     public Response(@NotNull List<SentenceWithSummaries> summaries) {
/*    */       this.summaries = summaries;
/*    */     }
/*    */     
/*    */     static {
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*    */       arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)SentenceWithSummaries$.serializer.INSTANCE);
/*    */       $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/trf/SumAPI.Summarize.WithCache.V1.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/trf/SumAPI$Summarize$WithCache$V1$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*    */     public static final class $serializer implements GeneratedSerializer<Response> {
/*    */       @NotNull
/*    */       public static final $serializer INSTANCE = new $serializer();
/*    */       
/*    */       @NotNull
/*    */       public KSerializer<?>[] typeParametersSerializers() {
/*    */         return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public SerialDescriptor getDescriptor() {
/*    */         return (SerialDescriptor)descriptor;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public KSerializer<?>[] childSerializers() {
/*    */         KSerializer[] arrayOfKSerializer1 = (KSerializer[])SumAPI.Summarize.WithCache.V1.Response.$childSerializers, arrayOfKSerializer2 = new KSerializer[1];
/*    */         arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*    */         return (KSerializer<?>[])arrayOfKSerializer2;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public SumAPI.Summarize.WithCache.V1.Response deserialize(@NotNull Decoder decoder) {
/*    */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         boolean bool = true;
/*    */         int i = 0;
/*    */         List list = null;
/*    */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */         KSerializer[] arrayOfKSerializer = (KSerializer[])SumAPI.Summarize.WithCache.V1.Response.$childSerializers;
/*    */         if (compositeDecoder.decodeSequentially()) {
/*    */           list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list);
/*    */           i |= 0x1;
/*    */         } else {
/*    */           while (bool) {
/*    */             int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */             switch (j) {
/*    */               case -1:
/*    */                 bool = false;
/*    */                 continue;
/*    */               case 0:
/*    */                 list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list);
/*    */                 i |= 0x1;
/*    */                 continue;
/*    */             } 
/*    */             throw new UnknownFieldException(j);
/*    */           } 
/*    */         } 
/*    */         compositeDecoder.endStructure(serialDescriptor);
/*    */         return new SumAPI.Summarize.WithCache.V1.Response(i, list, null);
/*    */       }
/*    */       
/*    */       public void serialize(@NotNull Encoder encoder, @NotNull SumAPI.Summarize.WithCache.V1.Response value) {
/*    */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */         Intrinsics.checkNotNullParameter(value, "value");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */         SumAPI.Summarize.WithCache.V1.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*    */         compositeEncoder.endStructure(serialDescriptor);
/*    */       }
/*    */       
/*    */       static {
/*    */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.trf.SumAPI.Summarize.WithCache.V1.Response", INSTANCE, 1);
/*    */         pluginGeneratedSerialDescriptor.addElement("summaries", false);
/*    */         descriptor = pluginGeneratedSerialDescriptor;
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/trf/SumAPI$Summarize$WithCache$V1$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/trf/SumAPI$Summarize$WithCache$V1$Response;", "api-gateway-api"})
/*    */     public static final class Companion {
/*    */       private Companion() {}
/*    */       
/*    */       @NotNull
/*    */       public final KSerializer<SumAPI.Summarize.WithCache.V1.Response> serializer() {
/*    */         return (KSerializer<SumAPI.Summarize.WithCache.V1.Response>)SumAPI.Summarize.WithCache.V1.Response.$serializer.INSTANCE;
/*    */       }
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final List<SentenceWithSummaries> getSummaries() {
/*    */       return this.summaries;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final List<SentenceWithSummaries> component1() {
/*    */       return this.summaries;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Response copy(@NotNull List<SentenceWithSummaries> summaries) {
/*    */       Intrinsics.checkNotNullParameter(summaries, "summaries");
/*    */       return new Response(summaries);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Response(summaries=" + this.summaries + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return this.summaries.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Response))
/*    */         return false; 
/*    */       Response response = (Response)other;
/*    */       return !!Intrinsics.areEqual(this.summaries, response.summaries);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\trf\SumAPI$Summarize$WithCache$V1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */