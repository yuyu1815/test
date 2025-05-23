/*     */ package ai.grazie.api.gateway.api.indexing;
/*     */ 
/*     */ import ai.grazie.code.indexing.model.IndexDescriptor;
/*     */ import ai.grazie.code.indexing.model.IndexDescriptor$;
/*     */ import ai.grazie.code.indexing.model.index.ItemToIndex;
/*     */ import ai.grazie.code.indexing.model.index.ItemToIndex$;
/*     */ import ai.grazie.code.indexing.model.request.IndexDescriptorRequest;
/*     */ import ai.grazie.code.indexing.model.request.VerboseAvailableRequest;
/*     */ import ai.grazie.code.indexing.model.snapshot.Snapshot;
/*     */ import ai.grazie.code.indexing.model.snapshot.Snapshot$;
/*     */ import ai.grazie.model.cloud.HttpMethod;
/*     */ import ai.grazie.model.cloud.TypeInfo;
/*     */ import ai.grazie.model.cloud.TypedApi;
/*     */ import java.util.List;
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
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.ArrayListSerializer;
/*     */ import kotlinx.serialization.internal.BooleanSerializer;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.LongSerializer;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\002\023\024B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020¨\006\025"}, d2 = {"Lai/grazie/api/gateway/api/indexing/IndexingAPI$Index$IndexChunks;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/indexing/IndexingAPI$Index$IndexChunks$Request;", "Lai/grazie/api/gateway/api/indexing/IndexingAPI$Index$IndexChunks$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Request", "Response", "api-gateway-api"})
/*     */ @SourceDebugExtension({"SMAP\nIndexingAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IndexingAPI.kt\nai/grazie/api/gateway/api/indexing/IndexingAPI$Index$IndexChunks\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,150:1\n19#2,2:151\n19#2,2:153\n*S KotlinDebug\n*F\n+ 1 IndexingAPI.kt\nai/grazie/api/gateway/api/indexing/IndexingAPI$Index$IndexChunks\n*L\n88#1:151,2\n89#1:153,2\n*E\n"})
/*     */ public final class IndexChunks
/*     */   implements TypedApi<IndexingAPI.Index.IndexChunks.Request, IndexingAPI.Index.IndexChunks.Response>
/*     */ {
/*     */   @NotNull
/*     */   private static final TypeInfo<Request> requestType;
/*     */   @NotNull
/*     */   private static final TypeInfo<Response> responseType;
/*     */   @NotNull
/*  88 */   public static final IndexChunks INSTANCE = new IndexChunks(); @NotNull public TypeInfo<Request> getRequestType() { return requestType; } static { int $i$f$typeInfo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 151 */     KType kType$iv = Reflection.typeOf(Request.class);
/* 152 */     requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0;
/* 153 */     kType$iv = Reflection.typeOf(Response.class);
/* 154 */     responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); }
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
/*     */   private static final String path = "/indexing/index-chunks";
/*     */   
/*     */   @NotNull
/*     */   public String getPath() {
/*     */     return path;
/*     */   }
/*     */   
/*     */   @Serializable
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\\\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\024\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 22\0020\0012\0020\002:\00212BO\b\021\022\006\020\003\032\0020\004\022\b\020\005\032\004\030\0010\006\022\b\020\007\032\004\030\0010\b\022\016\020\t\032\n\022\004\022\0020\013\030\0010\n\022\b\020\f\032\004\030\0010\r\022\006\020\016\032\0020\017\022\b\020\020\032\004\030\0010\021¢\006\002\020\022B5\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\f\020\t\032\b\022\004\022\0020\0130\n\022\006\020\f\032\0020\r\022\b\b\002\020\016\032\0020\017¢\006\002\020\023J\t\020\036\032\0020\006HÆ\003J\t\020\037\032\0020\bHÆ\003J\017\020 \032\b\022\004\022\0020\0130\nHÆ\003J\t\020!\032\0020\rHÆ\003J\t\020\"\032\0020\017HÆ\003JA\020#\032\0020\0002\b\b\002\020\005\032\0020\0062\b\b\002\020\007\032\0020\b2\016\b\002\020\t\032\b\022\004\022\0020\0130\n2\b\b\002\020\f\032\0020\r2\b\b\002\020\016\032\0020\017HÆ\001J\023\020$\032\0020\0172\b\020%\032\004\030\0010&HÖ\003J\t\020'\032\0020\004HÖ\001J\t\020(\032\0020\bHÖ\001J&\020)\032\0020*2\006\020+\032\0020\0002\006\020,\032\0020-2\006\020.\032\0020/HÁ\001¢\006\002\b0R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\024\020\025R\027\020\t\032\b\022\004\022\0020\0130\n¢\006\b\n\000\032\004\b\026\020\027R\024\020\f\032\0020\rX\004¢\006\b\n\000\032\004\b\030\020\031R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\032\020\033R\024\020\016\032\0020\017X\004¢\006\b\n\000\032\004\b\034\020\035¨\0063"}, d2 = {"Lai/grazie/api/gateway/api/indexing/IndexingAPI$Index$IndexChunks$Request;", "Lai/grazie/code/indexing/model/request/IndexDescriptorRequest;", "Lai/grazie/code/indexing/model/request/VerboseAvailableRequest;", "seen1", "", "snapshot", "Lai/grazie/code/indexing/model/snapshot/Snapshot;", "cluster", "", "data", "", "Lai/grazie/code/indexing/model/index/ItemToIndex;", "descriptor", "Lai/grazie/code/indexing/model/IndexDescriptor;", "verbose", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/code/indexing/model/snapshot/Snapshot;Ljava/lang/String;Ljava/util/List;Lai/grazie/code/indexing/model/IndexDescriptor;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/code/indexing/model/snapshot/Snapshot;Ljava/lang/String;Ljava/util/List;Lai/grazie/code/indexing/model/IndexDescriptor;Z)V", "getCluster", "()Ljava/lang/String;", "getData", "()Ljava/util/List;", "getDescriptor", "()Lai/grazie/code/indexing/model/IndexDescriptor;", "getSnapshot", "()Lai/grazie/code/indexing/model/snapshot/Snapshot;", "getVerbose", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */   public static final class Request implements IndexDescriptorRequest, VerboseAvailableRequest {
/*     */     @NotNull
/*     */     public static final Companion Companion = new Companion(null);
/*     */     @NotNull
/*     */     private final Snapshot snapshot;
/*     */     @NotNull
/*     */     private final String cluster;
/*     */     @NotNull
/*     */     private final List<ItemToIndex> data;
/*     */     @NotNull
/*     */     private final IndexDescriptor descriptor;
/*     */     private final boolean verbose;
/*     */     @JvmField
/*     */     @NotNull
/*     */     private static final KSerializer<Object>[] $childSerializers;
/*     */     
/*     */     public Request(@NotNull Snapshot snapshot, @NotNull String cluster, @NotNull List<ItemToIndex> data, @NotNull IndexDescriptor descriptor, boolean verbose) {
/*     */       this.snapshot = snapshot;
/*     */       this.cluster = cluster;
/*     */       this.data = data;
/*     */       this.descriptor = descriptor;
/*     */       this.verbose = verbose;
/*     */     }
/*     */     
/*     */     static {
/*     */       KSerializer[] arrayOfKSerializer = new KSerializer[5];
/*     */       arrayOfKSerializer[0] = null;
/*     */       arrayOfKSerializer[1] = null;
/*     */       arrayOfKSerializer[2] = (KSerializer)new ArrayListSerializer((KSerializer)ItemToIndex$.serializer.INSTANCE);
/*     */       arrayOfKSerializer[3] = null;
/*     */       arrayOfKSerializer[4] = null;
/*     */       $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */     }
/*     */     
/*     */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/indexing/IndexingAPI.Index.IndexChunks.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/indexing/IndexingAPI$Index$IndexChunks$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
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
/*     */         KSerializer[] arrayOfKSerializer1 = (KSerializer[])IndexingAPI.Index.IndexChunks.Request.$childSerializers, arrayOfKSerializer2 = new KSerializer[5];
/*     */         arrayOfKSerializer2[0] = (KSerializer)Snapshot$.serializer.INSTANCE;
/*     */         arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE;
/*     */         arrayOfKSerializer2[2] = arrayOfKSerializer1[2];
/*     */         arrayOfKSerializer2[3] = (KSerializer)IndexDescriptor$.serializer.INSTANCE;
/*     */         arrayOfKSerializer2[4] = (KSerializer)BooleanSerializer.INSTANCE;
/*     */         return (KSerializer<?>[])arrayOfKSerializer2;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public IndexingAPI.Index.IndexChunks.Request deserialize(@NotNull Decoder decoder) {
/*     */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         boolean bool = true;
/*     */         int i = 0;
/*     */         Snapshot snapshot = null;
/*     */         String str = null;
/*     */         List list = null;
/*     */         IndexDescriptor indexDescriptor = null;
/*     */         boolean bool1 = false;
/*     */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */         KSerializer[] arrayOfKSerializer = (KSerializer[])IndexingAPI.Index.IndexChunks.Request.$childSerializers;
/*     */         if (compositeDecoder.decodeSequentially()) {
/*     */           snapshot = (Snapshot)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Snapshot$.serializer.INSTANCE, snapshot);
/*     */           i |= 0x1;
/*     */           str = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*     */           i |= 0x2;
/*     */           list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], list);
/*     */           i |= 0x4;
/*     */           indexDescriptor = (IndexDescriptor)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)IndexDescriptor$.serializer.INSTANCE, indexDescriptor);
/*     */           i |= 0x8;
/*     */           bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 4);
/*     */           i |= 0x10;
/*     */         } else {
/*     */           while (bool) {
/*     */             int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */             switch (j) {
/*     */               case -1:
/*     */                 bool = false;
/*     */                 continue;
/*     */               case 0:
/*     */                 snapshot = (Snapshot)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Snapshot$.serializer.INSTANCE, snapshot);
/*     */                 i |= 0x1;
/*     */                 continue;
/*     */               case 1:
/*     */                 str = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*     */                 i |= 0x2;
/*     */                 continue;
/*     */               case 2:
/*     */                 list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], list);
/*     */                 i |= 0x4;
/*     */                 continue;
/*     */               case 3:
/*     */                 indexDescriptor = (IndexDescriptor)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)IndexDescriptor$.serializer.INSTANCE, indexDescriptor);
/*     */                 i |= 0x8;
/*     */                 continue;
/*     */               case 4:
/*     */                 bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 4);
/*     */                 i |= 0x10;
/*     */                 continue;
/*     */             } 
/*     */             throw new UnknownFieldException(j);
/*     */           } 
/*     */         } 
/*     */         compositeDecoder.endStructure(serialDescriptor);
/*     */         return new IndexingAPI.Index.IndexChunks.Request(i, snapshot, str, list, indexDescriptor, bool1, null);
/*     */       }
/*     */       
/*     */       public void serialize(@NotNull Encoder encoder, @NotNull IndexingAPI.Index.IndexChunks.Request value) {
/*     */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */         Intrinsics.checkNotNullParameter(value, "value");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */         IndexingAPI.Index.IndexChunks.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */         compositeEncoder.endStructure(serialDescriptor);
/*     */       }
/*     */       
/*     */       static {
/*     */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.indexing.IndexingAPI.Index.IndexChunks.Request", INSTANCE, 5);
/*     */         pluginGeneratedSerialDescriptor.addElement("snapshot", false);
/*     */         pluginGeneratedSerialDescriptor.addElement("cluster", false);
/*     */         pluginGeneratedSerialDescriptor.addElement("data", false);
/*     */         pluginGeneratedSerialDescriptor.addElement("descriptor", false);
/*     */         pluginGeneratedSerialDescriptor.addElement("verbose", true);
/*     */         descriptor = pluginGeneratedSerialDescriptor;
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/indexing/IndexingAPI$Index$IndexChunks$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/indexing/IndexingAPI$Index$IndexChunks$Request;", "api-gateway-api"})
/*     */     public static final class Companion {
/*     */       private Companion() {}
/*     */       
/*     */       @NotNull
/*     */       public final KSerializer<IndexingAPI.Index.IndexChunks.Request> serializer() {
/*     */         return (KSerializer<IndexingAPI.Index.IndexChunks.Request>)IndexingAPI.Index.IndexChunks.Request.$serializer.INSTANCE;
/*     */       }
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Snapshot getSnapshot() {
/*     */       return this.snapshot;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String getCluster() {
/*     */       return this.cluster;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final List<ItemToIndex> getData() {
/*     */       return this.data;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public IndexDescriptor getDescriptor() {
/*     */       return this.descriptor;
/*     */     }
/*     */     
/*     */     public boolean getVerbose() {
/*     */       return this.verbose;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Snapshot component1() {
/*     */       return this.snapshot;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String component2() {
/*     */       return this.cluster;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final List<ItemToIndex> component3() {
/*     */       return this.data;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final IndexDescriptor component4() {
/*     */       return this.descriptor;
/*     */     }
/*     */     
/*     */     public final boolean component5() {
/*     */       return this.verbose;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Request copy(@NotNull Snapshot snapshot, @NotNull String cluster, @NotNull List<ItemToIndex> data, @NotNull IndexDescriptor descriptor, boolean verbose) {
/*     */       Intrinsics.checkNotNullParameter(snapshot, "snapshot");
/*     */       Intrinsics.checkNotNullParameter(cluster, "cluster");
/*     */       Intrinsics.checkNotNullParameter(data, "data");
/*     */       Intrinsics.checkNotNullParameter(descriptor, "descriptor");
/*     */       return new Request(snapshot, cluster, data, descriptor, verbose);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "Request(snapshot=" + this.snapshot + ", cluster=" + this.cluster + ", data=" + this.data + ", descriptor=" + this.descriptor + ", verbose=" + this.verbose + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = this.snapshot.hashCode();
/*     */       result = result * 31 + this.cluster.hashCode();
/*     */       result = result * 31 + this.data.hashCode();
/*     */       result = result * 31 + this.descriptor.hashCode();
/*     */       return result * 31 + Boolean.hashCode(this.verbose);
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof Request))
/*     */         return false; 
/*     */       Request request = (Request)other;
/*     */       return !Intrinsics.areEqual(this.snapshot, request.snapshot) ? false : (!Intrinsics.areEqual(this.cluster, request.cluster) ? false : (!Intrinsics.areEqual(this.data, request.data) ? false : (!Intrinsics.areEqual(this.descriptor, request.descriptor) ? false : (!(this.verbose != request.verbose)))));
/*     */     }
/*     */   }
/*     */   
/*     */   @Serializable
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\t\n\000\n\002\020 \n\002\020\016\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \"2\0020\001:\002!\"B1\b\021\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\016\020\006\032\n\022\004\022\0020\b\030\0010\007\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B\033\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007¢\006\002\020\fJ\t\020\021\032\0020\005HÆ\003J\017\020\022\032\b\022\004\022\0020\b0\007HÆ\003J#\020\023\032\0020\0002\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\007HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\001HÖ\003J\t\020\027\032\0020\003HÖ\001J\t\020\030\032\0020\bHÖ\001J&\020\031\032\0020\0322\006\020\033\032\0020\0002\006\020\034\032\0020\0352\006\020\036\032\0020\037HÁ\001¢\006\002\b R\027\020\006\032\b\022\004\022\0020\b0\007¢\006\b\n\000\032\004\b\r\020\016R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\017\020\020¨\006#"}, d2 = {"Lai/grazie/api/gateway/api/indexing/IndexingAPI$Index$IndexChunks$Response;", "", "seen1", "", "vectorFetchingTime", "", "chunkSample", "", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(JLjava/util/List;)V", "getChunkSample", "()Ljava/util/List;", "getVectorFetchingTime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */   public static final class Response {
/*     */     @NotNull
/*     */     public static final Companion Companion = new Companion(null);
/*     */     private final long vectorFetchingTime;
/*     */     @NotNull
/*     */     private final List<String> chunkSample;
/*     */     @JvmField
/*     */     @NotNull
/*     */     private static final KSerializer<Object>[] $childSerializers;
/*     */     
/*     */     public Response(long vectorFetchingTime, @NotNull List<String> chunkSample) {
/*     */       this.vectorFetchingTime = vectorFetchingTime;
/*     */       this.chunkSample = chunkSample;
/*     */     }
/*     */     
/*     */     static {
/*     */       KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*     */       arrayOfKSerializer[0] = null;
/*     */       arrayOfKSerializer[1] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE);
/*     */       $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */     }
/*     */     
/*     */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/indexing/IndexingAPI.Index.IndexChunks.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/indexing/IndexingAPI$Index$IndexChunks$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
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
/*     */         KSerializer[] arrayOfKSerializer1 = (KSerializer[])IndexingAPI.Index.IndexChunks.Response.$childSerializers, arrayOfKSerializer2 = new KSerializer[2];
/*     */         arrayOfKSerializer2[0] = (KSerializer)LongSerializer.INSTANCE;
/*     */         arrayOfKSerializer2[1] = arrayOfKSerializer1[1];
/*     */         return (KSerializer<?>[])arrayOfKSerializer2;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public IndexingAPI.Index.IndexChunks.Response deserialize(@NotNull Decoder decoder) {
/*     */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         boolean bool = true;
/*     */         int i = 0;
/*     */         long l = 0L;
/*     */         List list = null;
/*     */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */         KSerializer[] arrayOfKSerializer = (KSerializer[])IndexingAPI.Index.IndexChunks.Response.$childSerializers;
/*     */         if (compositeDecoder.decodeSequentially()) {
/*     */           l = compositeDecoder.decodeLongElement(serialDescriptor, 0);
/*     */           i |= 0x1;
/*     */           list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list);
/*     */           i |= 0x2;
/*     */         } else {
/*     */           while (bool) {
/*     */             int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */             switch (j) {
/*     */               case -1:
/*     */                 bool = false;
/*     */                 continue;
/*     */               case 0:
/*     */                 l = compositeDecoder.decodeLongElement(serialDescriptor, 0);
/*     */                 i |= 0x1;
/*     */                 continue;
/*     */               case 1:
/*     */                 list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list);
/*     */                 i |= 0x2;
/*     */                 continue;
/*     */             } 
/*     */             throw new UnknownFieldException(j);
/*     */           } 
/*     */         } 
/*     */         compositeDecoder.endStructure(serialDescriptor);
/*     */         return new IndexingAPI.Index.IndexChunks.Response(i, l, list, null);
/*     */       }
/*     */       
/*     */       public void serialize(@NotNull Encoder encoder, @NotNull IndexingAPI.Index.IndexChunks.Response value) {
/*     */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */         Intrinsics.checkNotNullParameter(value, "value");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */         IndexingAPI.Index.IndexChunks.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */         compositeEncoder.endStructure(serialDescriptor);
/*     */       }
/*     */       
/*     */       static {
/*     */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.indexing.IndexingAPI.Index.IndexChunks.Response", INSTANCE, 2);
/*     */         pluginGeneratedSerialDescriptor.addElement("vectorFetchingTime", false);
/*     */         pluginGeneratedSerialDescriptor.addElement("chunkSample", false);
/*     */         descriptor = pluginGeneratedSerialDescriptor;
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/indexing/IndexingAPI$Index$IndexChunks$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/indexing/IndexingAPI$Index$IndexChunks$Response;", "api-gateway-api"})
/*     */     public static final class Companion {
/*     */       private Companion() {}
/*     */       
/*     */       @NotNull
/*     */       public final KSerializer<IndexingAPI.Index.IndexChunks.Response> serializer() {
/*     */         return (KSerializer<IndexingAPI.Index.IndexChunks.Response>)IndexingAPI.Index.IndexChunks.Response.$serializer.INSTANCE;
/*     */       }
/*     */     }
/*     */     
/*     */     public final long getVectorFetchingTime() {
/*     */       return this.vectorFetchingTime;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final List<String> getChunkSample() {
/*     */       return this.chunkSample;
/*     */     }
/*     */     
/*     */     public final long component1() {
/*     */       return this.vectorFetchingTime;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final List<String> component2() {
/*     */       return this.chunkSample;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Response copy(long vectorFetchingTime, @NotNull List<String> chunkSample) {
/*     */       Intrinsics.checkNotNullParameter(chunkSample, "chunkSample");
/*     */       return new Response(vectorFetchingTime, chunkSample);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "Response(vectorFetchingTime=" + this.vectorFetchingTime + ", chunkSample=" + this.chunkSample + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = Long.hashCode(this.vectorFetchingTime);
/*     */       return result * 31 + this.chunkSample.hashCode();
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof Response))
/*     */         return false; 
/*     */       Response response = (Response)other;
/*     */       return (this.vectorFetchingTime != response.vectorFetchingTime) ? false : (!!Intrinsics.areEqual(this.chunkSample, response.chunkSample));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\indexing\IndexingAPI$Index$IndexChunks.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */