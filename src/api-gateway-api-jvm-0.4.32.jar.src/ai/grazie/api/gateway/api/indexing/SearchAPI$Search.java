/*     */ package ai.grazie.api.gateway.api.indexing;
/*     */ 
/*     */ import ai.grazie.code.indexing.model.ExperimentalIndices;
/*     */ import ai.grazie.code.indexing.model.IndexAlias;
/*     */ import ai.grazie.code.indexing.model.ProductionIndices;
/*     */ import ai.grazie.code.indexing.model.search.SearchResponse;
/*     */ import ai.grazie.code.indexing.model.search.SearchResponse$;
/*     */ import ai.grazie.model.cloud.HttpMethod;
/*     */ import ai.grazie.model.cloud.TypeInfo;
/*     */ import ai.grazie.model.cloud.TypedApi;
/*     */ import java.lang.annotation.Annotation;
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
/*     */ import kotlin.reflect.KClass;
/*     */ import kotlin.reflect.KType;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SealedClassSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.BooleanSerializer;
/*     */ import kotlinx.serialization.internal.DoubleSerializer;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.IntSerializer;
/*     */ import kotlinx.serialization.internal.ObjectSerializer;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\002\023\024B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020¨\006\025"}, d2 = {"Lai/grazie/api/gateway/api/indexing/SearchAPI$Search;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/indexing/SearchAPI$Search$Request;", "Lai/grazie/api/gateway/api/indexing/SearchAPI$Search$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Request", "Response", "api-gateway-api"})
/*     */ @SourceDebugExtension({"SMAP\nSearchAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchAPI.kt\nai/grazie/api/gateway/api/indexing/SearchAPI$Search\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,139:1\n19#2,2:140\n19#2,2:142\n*S KotlinDebug\n*F\n+ 1 SearchAPI.kt\nai/grazie/api/gateway/api/indexing/SearchAPI$Search\n*L\n116#1:140,2\n117#1:142,2\n*E\n"})
/*     */ public final class Search
/*     */   implements TypedApi<SearchAPI.Search.Request, SearchAPI.Search.Response>
/*     */ {
/*     */   @NotNull
/*     */   private static final TypeInfo<Request> requestType;
/*     */   @NotNull
/*     */   private static final TypeInfo<Response> responseType;
/*     */   @NotNull
/* 116 */   public static final Search INSTANCE = new Search(); @NotNull public TypeInfo<Request> getRequestType() { return requestType; } static { int $i$f$typeInfo = 0;
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
/* 140 */     KType kType$iv = Reflection.typeOf(Request.class);
/* 141 */     requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0;
/* 142 */     kType$iv = Reflection.typeOf(Response.class);
/* 143 */     responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); }
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
/*     */   private static final String path = "/indexing/search";
/*     */   
/*     */   @NotNull
/*     */   public String getPath() {
/*     */     return path;
/*     */   }
/*     */   
/*     */   @Serializable
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\020\006\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\002\b\035\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 72\0020\001:\00267Bc\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\007\022\b\020\t\032\004\030\0010\007\022\006\020\n\032\0020\003\022\006\020\013\032\0020\f\022\b\020\r\032\004\030\0010\007\022\006\020\016\032\0020\017\022\b\020\020\032\004\030\0010\021¢\006\002\020\022BU\022\b\b\002\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\007\022\n\b\002\020\t\032\004\030\0010\007\022\b\b\002\020\n\032\0020\003\022\b\b\002\020\013\032\0020\f\022\n\b\002\020\r\032\004\030\0010\007\022\b\b\002\020\016\032\0020\017¢\006\002\020\023J\t\020!\032\0020\005HÆ\003J\t\020\"\032\0020\007HÆ\003J\t\020#\032\0020\007HÆ\003J\013\020$\032\004\030\0010\007HÆ\003J\t\020%\032\0020\003HÆ\003J\t\020&\032\0020\fHÆ\003J\013\020'\032\004\030\0010\007HÆ\003J\t\020(\032\0020\017HÆ\003J]\020)\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\n\b\002\020\t\032\004\030\0010\0072\b\b\002\020\n\032\0020\0032\b\b\002\020\013\032\0020\f2\n\b\002\020\r\032\004\030\0010\0072\b\b\002\020\016\032\0020\017HÆ\001J\023\020*\032\0020\0172\b\020+\032\004\030\0010\001HÖ\003J\t\020,\032\0020\003HÖ\001J\t\020-\032\0020\007HÖ\001J&\020.\032\0020/2\006\0200\032\0020\0002\006\0201\032\002022\006\0203\032\00204HÁ\001¢\006\002\b5R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\024\020\025R\021\020\016\032\0020\017¢\006\b\n\000\032\004\b\026\020\027R\021\020\n\032\0020\003¢\006\b\n\000\032\004\b\030\020\031R\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\032\020\033R\023\020\r\032\004\030\0010\007¢\006\b\n\000\032\004\b\034\020\035R\021\020\b\032\0020\007¢\006\b\n\000\032\004\b\036\020\035R\023\020\t\032\004\030\0010\007¢\006\b\n\000\032\004\b\037\020\035R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b \020\035¨\0068"}, d2 = {"Lai/grazie/api/gateway/api/indexing/SearchAPI$Search$Request;", "", "seen1", "", "index", "Lai/grazie/code/indexing/model/IndexAlias;", "text", "", "repository", "revision", "maxResults", "minScore", "", "pathFilter", "logAllowed", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/code/indexing/model/IndexAlias;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/code/indexing/model/IndexAlias;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Z)V", "getIndex", "()Lai/grazie/code/indexing/model/IndexAlias;", "getLogAllowed", "()Z", "getMaxResults", "()I", "getMinScore", "()D", "getPathFilter", "()Ljava/lang/String;", "getRepository", "getRevision", "getText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */   public static final class Request {
/*     */     @NotNull
/*     */     public static final Companion Companion = new Companion(null);
/*     */     @NotNull
/*     */     private final IndexAlias index;
/*     */     @NotNull
/*     */     private final String text;
/*     */     @NotNull
/*     */     private final String repository;
/*     */     @Nullable
/*     */     private final String revision;
/*     */     private final int maxResults;
/*     */     private final double minScore;
/*     */     @Nullable
/*     */     private final String pathFilter;
/*     */     private final boolean logAllowed;
/*     */     @JvmField
/*     */     @NotNull
/*     */     private static final KSerializer<Object>[] $childSerializers;
/*     */     
/*     */     public Request(@NotNull IndexAlias index, @NotNull String text, @NotNull String repository, @Nullable String revision, int maxResults, double minScore, @Nullable String pathFilter, boolean logAllowed) {
/*     */       this.index = index;
/*     */       this.text = text;
/*     */       this.repository = repository;
/*     */       this.revision = revision;
/*     */       this.maxResults = maxResults;
/*     */       this.minScore = minScore;
/*     */       this.pathFilter = pathFilter;
/*     */       this.logAllowed = logAllowed;
/*     */     }
/*     */     
/*     */     static {
/*     */       KSerializer[] arrayOfKSerializer1 = new KSerializer[8];
/*     */       KClass[] arrayOfKClass = new KClass[4];
/*     */       arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(ExperimentalIndices.Raptor.class);
/*     */       arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(ProductionIndices.CodeBlocks.class);
/*     */       arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(ProductionIndices.Files.class);
/*     */       arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(ProductionIndices.Symbols.class);
/*     */       KSerializer[] arrayOfKSerializer2 = new KSerializer[4];
/*     */       Annotation[] arrayOfAnnotation2 = new Annotation[1];
/*     */       arrayOfAnnotation2[0] = (Annotation)new SearchAPI$Repository$GetRepositories$Request$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("name");
/*     */       arrayOfKSerializer2[0] = (KSerializer)new ObjectSerializer("ai.grazie.code.indexing.model.ExperimentalIndices.Raptor", ExperimentalIndices.Raptor.INSTANCE, arrayOfAnnotation2);
/*     */       arrayOfAnnotation2 = new Annotation[1];
/*     */       arrayOfAnnotation2[0] = (Annotation)new SearchAPI$Repository$GetRepositories$Request$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("name");
/*     */       arrayOfKSerializer2[1] = (KSerializer)new ObjectSerializer("ai.grazie.code.indexing.model.ProductionIndices.CodeBlocks", ProductionIndices.CodeBlocks.INSTANCE, arrayOfAnnotation2);
/*     */       arrayOfAnnotation2 = new Annotation[1];
/*     */       arrayOfAnnotation2[0] = (Annotation)new SearchAPI$Repository$GetRepositories$Request$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("name");
/*     */       arrayOfKSerializer2[2] = (KSerializer)new ObjectSerializer("ai.grazie.code.indexing.model.ProductionIndices.Files", ProductionIndices.Files.INSTANCE, arrayOfAnnotation2);
/*     */       arrayOfAnnotation2 = new Annotation[1];
/*     */       arrayOfAnnotation2[0] = (Annotation)new SearchAPI$Repository$GetRepositories$Request$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("name");
/*     */       arrayOfKSerializer2[3] = (KSerializer)new ObjectSerializer("ai.grazie.code.indexing.model.ProductionIndices.Symbols", ProductionIndices.Symbols.INSTANCE, arrayOfAnnotation2);
/*     */       Annotation[] arrayOfAnnotation1 = new Annotation[1];
/*     */       arrayOfAnnotation1[0] = (Annotation)new SearchAPI$Repository$GetRepositories$Request$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("name");
/*     */       arrayOfKSerializer1[0] = (KSerializer)new SealedClassSerializer("ai.grazie.code.indexing.model.IndexAlias", Reflection.getOrCreateKotlinClass(IndexAlias.class), arrayOfKClass, arrayOfKSerializer2, arrayOfAnnotation1);
/*     */       arrayOfKSerializer1[1] = null;
/*     */       arrayOfKSerializer1[2] = null;
/*     */       arrayOfKSerializer1[3] = null;
/*     */       arrayOfKSerializer1[4] = null;
/*     */       arrayOfKSerializer1[5] = null;
/*     */       arrayOfKSerializer1[6] = null;
/*     */       arrayOfKSerializer1[7] = null;
/*     */       $childSerializers = (KSerializer<Object>[])arrayOfKSerializer1;
/*     */     }
/*     */     
/*     */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/indexing/SearchAPI.Search.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/indexing/SearchAPI$Search$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
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
/*     */         KSerializer[] arrayOfKSerializer1 = (KSerializer[])SearchAPI.Search.Request.$childSerializers, arrayOfKSerializer2 = new KSerializer[8];
/*     */         arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*     */         arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE;
/*     */         arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE;
/*     */         arrayOfKSerializer2[3] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*     */         arrayOfKSerializer2[4] = (KSerializer)IntSerializer.INSTANCE;
/*     */         arrayOfKSerializer2[5] = (KSerializer)DoubleSerializer.INSTANCE;
/*     */         arrayOfKSerializer2[6] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*     */         arrayOfKSerializer2[7] = (KSerializer)BooleanSerializer.INSTANCE;
/*     */         return (KSerializer<?>[])arrayOfKSerializer2;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public SearchAPI.Search.Request deserialize(@NotNull Decoder decoder) {
/*     */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         boolean bool = true;
/*     */         int i = 0;
/*     */         IndexAlias indexAlias = null;
/*     */         String str1 = null, str2 = null, str3 = null;
/*     */         int j = 0;
/*     */         double d = 0.0D;
/*     */         String str4 = null;
/*     */         boolean bool1 = false;
/*     */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */         KSerializer[] arrayOfKSerializer = (KSerializer[])SearchAPI.Search.Request.$childSerializers;
/*     */         if (compositeDecoder.decodeSequentially()) {
/*     */           indexAlias = (IndexAlias)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], indexAlias);
/*     */           i |= 0x1;
/*     */           str1 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*     */           i |= 0x2;
/*     */           str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*     */           i |= 0x4;
/*     */           str3 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, str3);
/*     */           i |= 0x8;
/*     */           j = compositeDecoder.decodeIntElement(serialDescriptor, 4);
/*     */           i |= 0x10;
/*     */           d = compositeDecoder.decodeDoubleElement(serialDescriptor, 5);
/*     */           i |= 0x20;
/*     */           str4 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 6, (DeserializationStrategy)StringSerializer.INSTANCE, str4);
/*     */           i |= 0x40;
/*     */           bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 7);
/*     */           i |= 0x80;
/*     */         } else {
/*     */           while (bool) {
/*     */             int k = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */             switch (k) {
/*     */               case -1:
/*     */                 bool = false;
/*     */                 continue;
/*     */               case 0:
/*     */                 indexAlias = (IndexAlias)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], indexAlias);
/*     */                 i |= 0x1;
/*     */                 continue;
/*     */               case 1:
/*     */                 str1 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*     */                 i |= 0x2;
/*     */                 continue;
/*     */               case 2:
/*     */                 str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*     */                 i |= 0x4;
/*     */                 continue;
/*     */               case 3:
/*     */                 str3 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, str3);
/*     */                 i |= 0x8;
/*     */                 continue;
/*     */               case 4:
/*     */                 j = compositeDecoder.decodeIntElement(serialDescriptor, 4);
/*     */                 i |= 0x10;
/*     */                 continue;
/*     */               case 5:
/*     */                 d = compositeDecoder.decodeDoubleElement(serialDescriptor, 5);
/*     */                 i |= 0x20;
/*     */                 continue;
/*     */               case 6:
/*     */                 str4 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 6, (DeserializationStrategy)StringSerializer.INSTANCE, str4);
/*     */                 i |= 0x40;
/*     */                 continue;
/*     */               case 7:
/*     */                 bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 7);
/*     */                 i |= 0x80;
/*     */                 continue;
/*     */             } 
/*     */             throw new UnknownFieldException(k);
/*     */           } 
/*     */         } 
/*     */         compositeDecoder.endStructure(serialDescriptor);
/*     */         return new SearchAPI.Search.Request(i, indexAlias, str1, str2, str3, j, d, str4, bool1, null);
/*     */       }
/*     */       
/*     */       public void serialize(@NotNull Encoder encoder, @NotNull SearchAPI.Search.Request value) {
/*     */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */         Intrinsics.checkNotNullParameter(value, "value");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */         SearchAPI.Search.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */         compositeEncoder.endStructure(serialDescriptor);
/*     */       }
/*     */       
/*     */       static {
/*     */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.indexing.SearchAPI.Search.Request", INSTANCE, 8);
/*     */         pluginGeneratedSerialDescriptor.addElement("index", true);
/*     */         pluginGeneratedSerialDescriptor.addElement("text", false);
/*     */         pluginGeneratedSerialDescriptor.addElement("repository", false);
/*     */         pluginGeneratedSerialDescriptor.addElement("revision", true);
/*     */         pluginGeneratedSerialDescriptor.addElement("maxResults", true);
/*     */         pluginGeneratedSerialDescriptor.addElement("minScore", true);
/*     */         pluginGeneratedSerialDescriptor.addElement("pathFilter", true);
/*     */         pluginGeneratedSerialDescriptor.addElement("logAllowed", true);
/*     */         descriptor = pluginGeneratedSerialDescriptor;
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/indexing/SearchAPI$Search$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/indexing/SearchAPI$Search$Request;", "api-gateway-api"})
/*     */     public static final class Companion {
/*     */       private Companion() {}
/*     */       
/*     */       @NotNull
/*     */       public final KSerializer<SearchAPI.Search.Request> serializer() {
/*     */         return (KSerializer<SearchAPI.Search.Request>)SearchAPI.Search.Request.$serializer.INSTANCE;
/*     */       }
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final IndexAlias getIndex() {
/*     */       return this.index;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String getText() {
/*     */       return this.text;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String getRepository() {
/*     */       return this.repository;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final String getRevision() {
/*     */       return this.revision;
/*     */     }
/*     */     
/*     */     public final int getMaxResults() {
/*     */       return this.maxResults;
/*     */     }
/*     */     
/*     */     public final double getMinScore() {
/*     */       return this.minScore;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final String getPathFilter() {
/*     */       return this.pathFilter;
/*     */     }
/*     */     
/*     */     public final boolean getLogAllowed() {
/*     */       return this.logAllowed;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final IndexAlias component1() {
/*     */       return this.index;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String component2() {
/*     */       return this.text;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String component3() {
/*     */       return this.repository;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final String component4() {
/*     */       return this.revision;
/*     */     }
/*     */     
/*     */     public final int component5() {
/*     */       return this.maxResults;
/*     */     }
/*     */     
/*     */     public final double component6() {
/*     */       return this.minScore;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final String component7() {
/*     */       return this.pathFilter;
/*     */     }
/*     */     
/*     */     public final boolean component8() {
/*     */       return this.logAllowed;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Request copy(@NotNull IndexAlias index, @NotNull String text, @NotNull String repository, @Nullable String revision, int maxResults, double minScore, @Nullable String pathFilter, boolean logAllowed) {
/*     */       Intrinsics.checkNotNullParameter(index, "index");
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       Intrinsics.checkNotNullParameter(repository, "repository");
/*     */       return new Request(index, text, repository, revision, maxResults, minScore, pathFilter, logAllowed);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "Request(index=" + this.index + ", text=" + this.text + ", repository=" + this.repository + ", revision=" + this.revision + ", maxResults=" + this.maxResults + ", minScore=" + this.minScore + ", pathFilter=" + this.pathFilter + ", logAllowed=" + this.logAllowed + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = this.index.hashCode();
/*     */       result = result * 31 + this.text.hashCode();
/*     */       result = result * 31 + this.repository.hashCode();
/*     */       result = result * 31 + ((this.revision == null) ? 0 : this.revision.hashCode());
/*     */       result = result * 31 + Integer.hashCode(this.maxResults);
/*     */       result = result * 31 + Double.hashCode(this.minScore);
/*     */       result = result * 31 + ((this.pathFilter == null) ? 0 : this.pathFilter.hashCode());
/*     */       return result * 31 + Boolean.hashCode(this.logAllowed);
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof Request))
/*     */         return false; 
/*     */       Request request = (Request)other;
/*     */       return !Intrinsics.areEqual(this.index, request.index) ? false : (!Intrinsics.areEqual(this.text, request.text) ? false : (!Intrinsics.areEqual(this.repository, request.repository) ? false : (!Intrinsics.areEqual(this.revision, request.revision) ? false : ((this.maxResults != request.maxResults) ? false : ((Double.compare(this.minScore, request.minScore) != 0) ? false : (!Intrinsics.areEqual(this.pathFilter, request.pathFilter) ? false : (!(this.logAllowed != request.logAllowed))))))));
/*     */     }
/*     */   }
/*     */   
/*     */   @Serializable
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\023HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\036"}, d2 = {"Lai/grazie/api/gateway/api/indexing/SearchAPI$Search$Response;", "", "seen1", "", "searchResponse", "Lai/grazie/code/indexing/model/search/SearchResponse;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/code/indexing/model/search/SearchResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/code/indexing/model/search/SearchResponse;)V", "getSearchResponse", "()Lai/grazie/code/indexing/model/search/SearchResponse;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */   public static final class Response {
/*     */     @NotNull
/*     */     public static final Companion Companion = new Companion(null);
/*     */     @NotNull
/*     */     private final SearchResponse searchResponse;
/*     */     
/*     */     public Response(@NotNull SearchResponse searchResponse) {
/*     */       this.searchResponse = searchResponse;
/*     */     }
/*     */     
/*     */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/indexing/SearchAPI.Search.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/indexing/SearchAPI$Search$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
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
/*     */         KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*     */         arrayOfKSerializer[0] = (KSerializer)SearchResponse$.serializer.INSTANCE;
/*     */         return (KSerializer<?>[])arrayOfKSerializer;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public SearchAPI.Search.Response deserialize(@NotNull Decoder decoder) {
/*     */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         boolean bool = true;
/*     */         int i = 0;
/*     */         SearchResponse searchResponse = null;
/*     */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */         if (compositeDecoder.decodeSequentially()) {
/*     */           searchResponse = (SearchResponse)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)SearchResponse$.serializer.INSTANCE, searchResponse);
/*     */           i |= 0x1;
/*     */         } else {
/*     */           while (bool) {
/*     */             int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */             switch (j) {
/*     */               case -1:
/*     */                 bool = false;
/*     */                 continue;
/*     */               case 0:
/*     */                 searchResponse = (SearchResponse)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)SearchResponse$.serializer.INSTANCE, searchResponse);
/*     */                 i |= 0x1;
/*     */                 continue;
/*     */             } 
/*     */             throw new UnknownFieldException(j);
/*     */           } 
/*     */         } 
/*     */         compositeDecoder.endStructure(serialDescriptor);
/*     */         return new SearchAPI.Search.Response(i, searchResponse, null);
/*     */       }
/*     */       
/*     */       public void serialize(@NotNull Encoder encoder, @NotNull SearchAPI.Search.Response value) {
/*     */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */         Intrinsics.checkNotNullParameter(value, "value");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */         SearchAPI.Search.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */         compositeEncoder.endStructure(serialDescriptor);
/*     */       }
/*     */       
/*     */       static {
/*     */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.indexing.SearchAPI.Search.Response", INSTANCE, 1);
/*     */         pluginGeneratedSerialDescriptor.addElement("searchResponse", false);
/*     */         descriptor = pluginGeneratedSerialDescriptor;
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/indexing/SearchAPI$Search$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/indexing/SearchAPI$Search$Response;", "api-gateway-api"})
/*     */     public static final class Companion {
/*     */       private Companion() {}
/*     */       
/*     */       @NotNull
/*     */       public final KSerializer<SearchAPI.Search.Response> serializer() {
/*     */         return (KSerializer<SearchAPI.Search.Response>)SearchAPI.Search.Response.$serializer.INSTANCE;
/*     */       }
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final SearchResponse getSearchResponse() {
/*     */       return this.searchResponse;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final SearchResponse component1() {
/*     */       return this.searchResponse;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Response copy(@NotNull SearchResponse searchResponse) {
/*     */       Intrinsics.checkNotNullParameter(searchResponse, "searchResponse");
/*     */       return new Response(searchResponse);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "Response(searchResponse=" + this.searchResponse + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       return this.searchResponse.hashCode();
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof Response))
/*     */         return false; 
/*     */       Response response = (Response)other;
/*     */       return !!Intrinsics.areEqual(this.searchResponse, response.searchResponse);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\indexing\SearchAPI$Search.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */