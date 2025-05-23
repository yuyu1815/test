/*    */ package ai.grazie.api.gateway.api.indexing;
/*    */ 
/*    */ import ai.grazie.code.indexing.model.ExperimentalIndices;
/*    */ import ai.grazie.code.indexing.model.IndexAlias;
/*    */ import ai.grazie.code.indexing.model.ProductionIndices;
/*    */ import ai.grazie.model.cloud.paging.IterablePage;
/*    */ import java.lang.annotation.Annotation;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SealedClassSerializer;
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
/*    */ import kotlinx.serialization.internal.ObjectSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import kotlinx.serialization.json.JsonClassDiscriminator;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\r\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 &2\0020\001:\002%&B=\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\006\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB)\022\f\020\004\032\b\022\004\022\0020\0060\005\022\n\b\002\020\007\032\004\030\0010\006\022\b\b\002\020\b\032\0020\t¢\006\002\020\rJ\017\020\024\032\b\022\004\022\0020\0060\005HÆ\003J\013\020\025\032\004\030\0010\006HÆ\003J\t\020\026\032\0020\tHÆ\003J/\020\027\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\n\b\002\020\007\032\004\030\0010\0062\b\b\002\020\b\032\0020\tHÆ\001J\023\020\030\032\0020\0312\b\020\032\032\004\030\0010\001HÖ\003J\t\020\033\032\0020\003HÖ\001J\t\020\034\032\0020\006HÖ\001J&\020\035\032\0020\0362\006\020\037\032\0020\0002\006\020 \032\0020!2\006\020\"\032\0020#HÁ\001¢\006\002\b$R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\016\020\017R\023\020\007\032\004\030\0010\006¢\006\b\n\000\032\004\b\020\020\021R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\022\020\023¨\006'"}, d2 = {"Lai/grazie/api/gateway/api/indexing/SearchAPI$Repository$GetRepositories$Request;", "", "seen1", "", "repositories", "Lai/grazie/model/cloud/paging/IterablePage;", "", "query", "index", "Lai/grazie/code/indexing/model/IndexAlias;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/paging/IterablePage;Ljava/lang/String;Lai/grazie/code/indexing/model/IndexAlias;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/cloud/paging/IterablePage;Ljava/lang/String;Lai/grazie/code/indexing/model/IndexAlias;)V", "getIndex", "()Lai/grazie/code/indexing/model/IndexAlias;", "getQuery", "()Ljava/lang/String;", "getRepositories", "()Lai/grazie/model/cloud/paging/IterablePage;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */ public final class Request
/*    */ {
/*    */   @NotNull
/*    */   private final IterablePage<String> repositories;
/*    */   @Nullable
/*    */   private final String query;
/*    */   @NotNull
/*    */   private final IndexAlias index;
/*    */   @NotNull
/* 53 */   public static final Companion Companion = new Companion(null); @JvmField
/*    */   @NotNull
/* 55 */   private static final KSerializer<Object>[] $childSerializers; public Request(@NotNull IterablePage<String> repositories, @Nullable String query, @NotNull IndexAlias index) { this.repositories = repositories;
/* 56 */     this.query = query;
/* 57 */     this.index = index; } @NotNull public final IndexAlias getIndex() { return this.index; }
/*    */ 
/*    */   
/*    */   static {
/*    */     KSerializer[] arrayOfKSerializer1 = new KSerializer[3];
/*    */     arrayOfKSerializer1[0] = IterablePage.Companion.serializer((KSerializer)StringSerializer.INSTANCE);
/*    */     arrayOfKSerializer1[1] = null;
/*    */     KClass[] arrayOfKClass = new KClass[4];
/*    */     arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(ExperimentalIndices.Raptor.class);
/*    */     arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(ProductionIndices.CodeBlocks.class);
/*    */     arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(ProductionIndices.Files.class);
/*    */     arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(ProductionIndices.Symbols.class);
/*    */     KSerializer[] arrayOfKSerializer2 = new KSerializer[4];
/*    */     Annotation[] arrayOfAnnotation2 = new Annotation[1];
/*    */     arrayOfAnnotation2[0] = (Annotation)new SearchAPI$Repository$GetRepositories$Request$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("name");
/*    */     arrayOfKSerializer2[0] = (KSerializer)new ObjectSerializer("ai.grazie.code.indexing.model.ExperimentalIndices.Raptor", ExperimentalIndices.Raptor.INSTANCE, arrayOfAnnotation2);
/*    */     arrayOfAnnotation2 = new Annotation[1];
/*    */     arrayOfAnnotation2[0] = (Annotation)new SearchAPI$Repository$GetRepositories$Request$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("name");
/*    */     arrayOfKSerializer2[1] = (KSerializer)new ObjectSerializer("ai.grazie.code.indexing.model.ProductionIndices.CodeBlocks", ProductionIndices.CodeBlocks.INSTANCE, arrayOfAnnotation2);
/*    */     arrayOfAnnotation2 = new Annotation[1];
/*    */     arrayOfAnnotation2[0] = (Annotation)new SearchAPI$Repository$GetRepositories$Request$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("name");
/*    */     arrayOfKSerializer2[2] = (KSerializer)new ObjectSerializer("ai.grazie.code.indexing.model.ProductionIndices.Files", ProductionIndices.Files.INSTANCE, arrayOfAnnotation2);
/*    */     arrayOfAnnotation2 = new Annotation[1];
/*    */     arrayOfAnnotation2[0] = (Annotation)new SearchAPI$Repository$GetRepositories$Request$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("name");
/*    */     arrayOfKSerializer2[3] = (KSerializer)new ObjectSerializer("ai.grazie.code.indexing.model.ProductionIndices.Symbols", ProductionIndices.Symbols.INSTANCE, arrayOfAnnotation2);
/*    */     Annotation[] arrayOfAnnotation1 = new Annotation[1];
/*    */     arrayOfAnnotation1[0] = (Annotation)new SearchAPI$Repository$GetRepositories$Request$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("name");
/*    */     arrayOfKSerializer1[2] = (KSerializer)new SealedClassSerializer("ai.grazie.code.indexing.model.IndexAlias", Reflection.getOrCreateKotlinClass(IndexAlias.class), arrayOfKClass, arrayOfKSerializer2, arrayOfAnnotation1);
/*    */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer1;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/indexing/SearchAPI.Repository.GetRepositories.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/indexing/SearchAPI$Repository$GetRepositories$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*    */   public static final class $serializer implements GeneratedSerializer<Request> {
/*    */     @NotNull
/*    */     public static final $serializer INSTANCE = new $serializer();
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] typeParametersSerializers() {
/*    */       return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/*    */       return (SerialDescriptor)descriptor;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] childSerializers() {
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])SearchAPI.Repository.GetRepositories.Request.$childSerializers, arrayOfKSerializer2 = new KSerializer[3];
/*    */       arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*    */       arrayOfKSerializer2[1] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       arrayOfKSerializer2[2] = arrayOfKSerializer1[2];
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SearchAPI.Repository.GetRepositories.Request deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       IterablePage iterablePage = null;
/*    */       String str = null;
/*    */       IndexAlias indexAlias = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])SearchAPI.Repository.GetRepositories.Request.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         iterablePage = (IterablePage)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], iterablePage);
/*    */         i |= 0x1;
/*    */         str = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str);
/*    */         i |= 0x2;
/*    */         indexAlias = (IndexAlias)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], indexAlias);
/*    */         i |= 0x4;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               iterablePage = (IterablePage)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], iterablePage);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               str = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               indexAlias = (IndexAlias)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], indexAlias);
/*    */               i |= 0x4;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new SearchAPI.Repository.GetRepositories.Request(i, iterablePage, str, indexAlias, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull SearchAPI.Repository.GetRepositories.Request value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       SearchAPI.Repository.GetRepositories.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.indexing.SearchAPI.Repository.GetRepositories.Request", INSTANCE, 3);
/*    */       pluginGeneratedSerialDescriptor.addElement("repositories", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("query", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("index", true);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/indexing/SearchAPI$Repository$GetRepositories$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/indexing/SearchAPI$Repository$GetRepositories$Request;", "api-gateway-api"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<SearchAPI.Repository.GetRepositories.Request> serializer() {
/*    */       return (KSerializer<SearchAPI.Repository.GetRepositories.Request>)SearchAPI.Repository.GetRepositories.Request.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final IterablePage<String> getRepositories() {
/*    */     return this.repositories;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getQuery() {
/*    */     return this.query;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final IterablePage<String> component1() {
/*    */     return this.repositories;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component2() {
/*    */     return this.query;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final IndexAlias component3() {
/*    */     return this.index;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Request copy(@NotNull IterablePage<String> repositories, @Nullable String query, @NotNull IndexAlias index) {
/*    */     Intrinsics.checkNotNullParameter(repositories, "repositories");
/*    */     Intrinsics.checkNotNullParameter(index, "index");
/*    */     return new Request(repositories, query, index);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Request(repositories=" + this.repositories + ", query=" + this.query + ", index=" + this.index + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.repositories.hashCode();
/*    */     result = result * 31 + ((this.query == null) ? 0 : this.query.hashCode());
/*    */     return result * 31 + this.index.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Request))
/*    */       return false; 
/*    */     Request request = (Request)other;
/*    */     return !Intrinsics.areEqual(this.repositories, request.repositories) ? false : (!Intrinsics.areEqual(this.query, request.query) ? false : (!!Intrinsics.areEqual(this.index, request.index)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\indexing\SearchAPI$Repository$GetRepositories$Request.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */