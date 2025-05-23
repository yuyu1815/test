/*     */ package ai.grazie.api.gateway.api.indexing;
/*     */ 
/*     */ import ai.grazie.code.indexing.model.IndexDescriptor;
/*     */ import ai.grazie.code.indexing.model.IndexDescriptor$;
/*     */ import ai.grazie.code.indexing.model.cluster.FileClusterDTO;
/*     */ import ai.grazie.code.indexing.model.cluster.FileClusterDTO$;
/*     */ import ai.grazie.code.indexing.model.request.IndexDescriptorRequest;
/*     */ import ai.grazie.code.indexing.model.snapshot.Snapshot;
/*     */ import ai.grazie.code.indexing.model.snapshot.Snapshot$;
/*     */ import ai.grazie.model.cloud.HttpMethod;
/*     */ import ai.grazie.model.cloud.TypeInfo;
/*     */ import ai.grazie.model.cloud.TypedApi;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.Unit;
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
/*     */ import kotlinx.serialization.internal.BooleanSerializer;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\002\023\024B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020¨\006\025"}, d2 = {"Lai/grazie/api/gateway/api/indexing/IndexingAPI$Clusters$StoreCluster;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/indexing/IndexingAPI$Clusters$StoreCluster$Request;", "", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Request", "Response", "api-gateway-api"})
/*     */ @SourceDebugExtension({"SMAP\nIndexingAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IndexingAPI.kt\nai/grazie/api/gateway/api/indexing/IndexingAPI$Clusters$StoreCluster\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,150:1\n19#2,2:151\n19#2,2:153\n*S KotlinDebug\n*F\n+ 1 IndexingAPI.kt\nai/grazie/api/gateway/api/indexing/IndexingAPI$Clusters$StoreCluster\n*L\n54#1:151,2\n55#1:153,2\n*E\n"})
/*     */ public final class StoreCluster
/*     */   implements TypedApi<IndexingAPI.Clusters.StoreCluster.Request, Unit>
/*     */ {
/*     */   @NotNull
/*  51 */   public static final StoreCluster INSTANCE = new StoreCluster(); @NotNull private static final HttpMethod httpMethod = HttpMethod.Post; @NotNull public HttpMethod getHttpMethod() { return httpMethod; } @NotNull
/*  52 */   private static final String path = "/indexing/cluster"; @NotNull private static final TypeInfo<Request> requestType; @NotNull public String getPath() { return path; } @NotNull
/*     */   private static final TypeInfo<Unit> responseType; @NotNull
/*  54 */   public TypeInfo<Request> getRequestType() { return requestType; } static { int $i$f$typeInfo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 153 */     kType$iv = Reflection.typeOf(Unit.class);
/* 154 */     responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Unit.class)); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public TypeInfo<Unit> getResponseType() {
/*     */     return responseType;
/*     */   }
/*     */   
/*     */   @Serializable
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\r\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 (2\0020\001:\002'(B7\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB\035\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\002\020\rJ\t\020\024\032\0020\005HÆ\003J\t\020\025\032\0020\007HÆ\003J\t\020\026\032\0020\tHÆ\003J'\020\027\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tHÆ\001J\023\020\030\032\0020\0312\b\020\032\032\004\030\0010\033HÖ\003J\t\020\034\032\0020\003HÖ\001J\t\020\035\032\0020\036HÖ\001J&\020\037\032\0020 2\006\020!\032\0020\0002\006\020\"\032\0020#2\006\020$\032\0020%HÁ\001¢\006\002\b&R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017R\024\020\b\032\0020\tX\004¢\006\b\n\000\032\004\b\020\020\021R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\022\020\023¨\006)"}, d2 = {"Lai/grazie/api/gateway/api/indexing/IndexingAPI$Clusters$StoreCluster$Request;", "Lai/grazie/code/indexing/model/request/IndexDescriptorRequest;", "seen1", "", "snapshot", "Lai/grazie/code/indexing/model/snapshot/Snapshot;", "cluster", "Lai/grazie/code/indexing/model/cluster/FileClusterDTO;", "descriptor", "Lai/grazie/code/indexing/model/IndexDescriptor;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/code/indexing/model/snapshot/Snapshot;Lai/grazie/code/indexing/model/cluster/FileClusterDTO;Lai/grazie/code/indexing/model/IndexDescriptor;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/code/indexing/model/snapshot/Snapshot;Lai/grazie/code/indexing/model/cluster/FileClusterDTO;Lai/grazie/code/indexing/model/IndexDescriptor;)V", "getCluster", "()Lai/grazie/code/indexing/model/cluster/FileClusterDTO;", "getDescriptor", "()Lai/grazie/code/indexing/model/IndexDescriptor;", "getSnapshot", "()Lai/grazie/code/indexing/model/snapshot/Snapshot;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */   public static final class Request implements IndexDescriptorRequest {
/*     */     @NotNull
/*     */     public static final Companion Companion = new Companion(null);
/*     */     @NotNull
/*     */     private final Snapshot snapshot;
/*     */     @NotNull
/*     */     private final FileClusterDTO cluster;
/*     */     @NotNull
/*     */     private final IndexDescriptor descriptor;
/*     */     
/*     */     public Request(@NotNull Snapshot snapshot, @NotNull FileClusterDTO cluster, @NotNull IndexDescriptor descriptor) {
/*     */       this.snapshot = snapshot;
/*     */       this.cluster = cluster;
/*     */       this.descriptor = descriptor;
/*     */     }
/*     */     
/*     */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/indexing/IndexingAPI.Clusters.StoreCluster.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/indexing/IndexingAPI$Clusters$StoreCluster$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
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
/*     */         KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*     */         arrayOfKSerializer[0] = (KSerializer)Snapshot$.serializer.INSTANCE;
/*     */         arrayOfKSerializer[1] = (KSerializer)FileClusterDTO$.serializer.INSTANCE;
/*     */         arrayOfKSerializer[2] = (KSerializer)IndexDescriptor$.serializer.INSTANCE;
/*     */         return (KSerializer<?>[])arrayOfKSerializer;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public IndexingAPI.Clusters.StoreCluster.Request deserialize(@NotNull Decoder decoder) {
/*     */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         boolean bool = true;
/*     */         int i = 0;
/*     */         Snapshot snapshot = null;
/*     */         FileClusterDTO fileClusterDTO = null;
/*     */         IndexDescriptor indexDescriptor = null;
/*     */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */         if (compositeDecoder.decodeSequentially()) {
/*     */           snapshot = (Snapshot)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Snapshot$.serializer.INSTANCE, snapshot);
/*     */           i |= 0x1;
/*     */           fileClusterDTO = (FileClusterDTO)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)FileClusterDTO$.serializer.INSTANCE, fileClusterDTO);
/*     */           i |= 0x2;
/*     */           indexDescriptor = (IndexDescriptor)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)IndexDescriptor$.serializer.INSTANCE, indexDescriptor);
/*     */           i |= 0x4;
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
/*     */                 fileClusterDTO = (FileClusterDTO)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)FileClusterDTO$.serializer.INSTANCE, fileClusterDTO);
/*     */                 i |= 0x2;
/*     */                 continue;
/*     */               case 2:
/*     */                 indexDescriptor = (IndexDescriptor)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)IndexDescriptor$.serializer.INSTANCE, indexDescriptor);
/*     */                 i |= 0x4;
/*     */                 continue;
/*     */             } 
/*     */             throw new UnknownFieldException(j);
/*     */           } 
/*     */         } 
/*     */         compositeDecoder.endStructure(serialDescriptor);
/*     */         return new IndexingAPI.Clusters.StoreCluster.Request(i, snapshot, fileClusterDTO, indexDescriptor, null);
/*     */       }
/*     */       
/*     */       public void serialize(@NotNull Encoder encoder, @NotNull IndexingAPI.Clusters.StoreCluster.Request value) {
/*     */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */         Intrinsics.checkNotNullParameter(value, "value");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */         IndexingAPI.Clusters.StoreCluster.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */         compositeEncoder.endStructure(serialDescriptor);
/*     */       }
/*     */       
/*     */       static {
/*     */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.indexing.IndexingAPI.Clusters.StoreCluster.Request", INSTANCE, 3);
/*     */         pluginGeneratedSerialDescriptor.addElement("snapshot", false);
/*     */         pluginGeneratedSerialDescriptor.addElement("cluster", false);
/*     */         pluginGeneratedSerialDescriptor.addElement("descriptor", false);
/*     */         descriptor = pluginGeneratedSerialDescriptor;
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/indexing/IndexingAPI$Clusters$StoreCluster$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/indexing/IndexingAPI$Clusters$StoreCluster$Request;", "api-gateway-api"})
/*     */     public static final class Companion {
/*     */       private Companion() {}
/*     */       
/*     */       @NotNull
/*     */       public final KSerializer<IndexingAPI.Clusters.StoreCluster.Request> serializer() {
/*     */         return (KSerializer<IndexingAPI.Clusters.StoreCluster.Request>)IndexingAPI.Clusters.StoreCluster.Request.$serializer.INSTANCE;
/*     */       }
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Snapshot getSnapshot() {
/*     */       return this.snapshot;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final FileClusterDTO getCluster() {
/*     */       return this.cluster;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public IndexDescriptor getDescriptor() {
/*     */       return this.descriptor;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Snapshot component1() {
/*     */       return this.snapshot;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final FileClusterDTO component2() {
/*     */       return this.cluster;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final IndexDescriptor component3() {
/*     */       return this.descriptor;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Request copy(@NotNull Snapshot snapshot, @NotNull FileClusterDTO cluster, @NotNull IndexDescriptor descriptor) {
/*     */       Intrinsics.checkNotNullParameter(snapshot, "snapshot");
/*     */       Intrinsics.checkNotNullParameter(cluster, "cluster");
/*     */       Intrinsics.checkNotNullParameter(descriptor, "descriptor");
/*     */       return new Request(snapshot, cluster, descriptor);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "Request(snapshot=" + this.snapshot + ", cluster=" + this.cluster + ", descriptor=" + this.descriptor + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = this.snapshot.hashCode();
/*     */       result = result * 31 + this.cluster.hashCode();
/*     */       return result * 31 + this.descriptor.hashCode();
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof Request))
/*     */         return false; 
/*     */       Request request = (Request)other;
/*     */       return !Intrinsics.areEqual(this.snapshot, request.snapshot) ? false : (!Intrinsics.areEqual(this.cluster, request.cluster) ? false : (!!Intrinsics.areEqual(this.descriptor, request.descriptor)));
/*     */     }
/*     */   }
/*     */   
/*     */   @Serializable
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\n\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0342\0020\001:\002\033\034B!\b\021\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0052\b\020\017\032\004\030\0010\001HÖ\003J\t\020\020\032\0020\003HÖ\001J\t\020\021\032\0020\022HÖ\001J&\020\023\032\0020\0242\006\020\025\032\0020\0002\006\020\026\032\0020\0272\006\020\030\032\0020\031HÁ\001¢\006\002\b\032R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\035"}, d2 = {"Lai/grazie/api/gateway/api/indexing/IndexingAPI$Clusters$StoreCluster$Response;", "", "seen1", "", "success", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Z)V", "getSuccess", "()Z", "component1", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */   public static final class Response {
/*     */     @NotNull
/*     */     public static final Companion Companion = new Companion(null);
/*     */     private final boolean success;
/*     */     
/*     */     public Response(boolean success) {
/*     */       this.success = success;
/*     */     }
/*     */     
/*     */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/indexing/IndexingAPI.Clusters.StoreCluster.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/indexing/IndexingAPI$Clusters$StoreCluster$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
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
/*     */         arrayOfKSerializer[0] = (KSerializer)BooleanSerializer.INSTANCE;
/*     */         return (KSerializer<?>[])arrayOfKSerializer;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public IndexingAPI.Clusters.StoreCluster.Response deserialize(@NotNull Decoder decoder) {
/*     */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         boolean bool = true;
/*     */         int i = 0;
/*     */         boolean bool1 = false;
/*     */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */         if (compositeDecoder.decodeSequentially()) {
/*     */           bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 0);
/*     */           i |= 0x1;
/*     */         } else {
/*     */           while (bool) {
/*     */             int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */             switch (j) {
/*     */               case -1:
/*     */                 bool = false;
/*     */                 continue;
/*     */               case 0:
/*     */                 bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 0);
/*     */                 i |= 0x1;
/*     */                 continue;
/*     */             } 
/*     */             throw new UnknownFieldException(j);
/*     */           } 
/*     */         } 
/*     */         compositeDecoder.endStructure(serialDescriptor);
/*     */         return new IndexingAPI.Clusters.StoreCluster.Response(i, bool1, null);
/*     */       }
/*     */       
/*     */       public void serialize(@NotNull Encoder encoder, @NotNull IndexingAPI.Clusters.StoreCluster.Response value) {
/*     */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */         Intrinsics.checkNotNullParameter(value, "value");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */         IndexingAPI.Clusters.StoreCluster.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */         compositeEncoder.endStructure(serialDescriptor);
/*     */       }
/*     */       
/*     */       static {
/*     */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.indexing.IndexingAPI.Clusters.StoreCluster.Response", INSTANCE, 1);
/*     */         pluginGeneratedSerialDescriptor.addElement("success", false);
/*     */         descriptor = pluginGeneratedSerialDescriptor;
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/indexing/IndexingAPI$Clusters$StoreCluster$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/indexing/IndexingAPI$Clusters$StoreCluster$Response;", "api-gateway-api"})
/*     */     public static final class Companion {
/*     */       private Companion() {}
/*     */       
/*     */       @NotNull
/*     */       public final KSerializer<IndexingAPI.Clusters.StoreCluster.Response> serializer() {
/*     */         return (KSerializer<IndexingAPI.Clusters.StoreCluster.Response>)IndexingAPI.Clusters.StoreCluster.Response.$serializer.INSTANCE;
/*     */       }
/*     */     }
/*     */     
/*     */     public final boolean getSuccess() {
/*     */       return this.success;
/*     */     }
/*     */     
/*     */     public final boolean component1() {
/*     */       return this.success;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Response copy(boolean success) {
/*     */       return new Response(success);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "Response(success=" + this.success + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       return Boolean.hashCode(this.success);
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof Response))
/*     */         return false; 
/*     */       Response response = (Response)other;
/*     */       return !(this.success != response.success);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\indexing\IndexingAPI$Clusters$StoreCluster.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */