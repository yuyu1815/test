/*    */ package ai.grazie.api.gateway.api.indexing;
/*    */ 
/*    */ import ai.grazie.code.indexing.model.IndexDescriptor;
/*    */ import ai.grazie.code.indexing.model.IndexDescriptor$;
/*    */ import ai.grazie.code.indexing.model.index.ItemToIndex;
/*    */ import ai.grazie.code.indexing.model.index.ItemToIndex$;
/*    */ import ai.grazie.code.indexing.model.request.IndexDescriptorRequest;
/*    */ import ai.grazie.code.indexing.model.request.VerboseAvailableRequest;
/*    */ import ai.grazie.code.indexing.model.snapshot.Snapshot;
/*    */ import ai.grazie.code.indexing.model.snapshot.Snapshot$;
/*    */ import java.util.List;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.ArrayListSerializer;
/*    */ import kotlinx.serialization.internal.BooleanSerializer;
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
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\\\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\024\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 22\0020\0012\0020\002:\00212BO\b\021\022\006\020\003\032\0020\004\022\b\020\005\032\004\030\0010\006\022\b\020\007\032\004\030\0010\b\022\016\020\t\032\n\022\004\022\0020\013\030\0010\n\022\b\020\f\032\004\030\0010\r\022\006\020\016\032\0020\017\022\b\020\020\032\004\030\0010\021¢\006\002\020\022B5\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\f\020\t\032\b\022\004\022\0020\0130\n\022\006\020\f\032\0020\r\022\b\b\002\020\016\032\0020\017¢\006\002\020\023J\t\020\036\032\0020\006HÆ\003J\t\020\037\032\0020\bHÆ\003J\017\020 \032\b\022\004\022\0020\0130\nHÆ\003J\t\020!\032\0020\rHÆ\003J\t\020\"\032\0020\017HÆ\003JA\020#\032\0020\0002\b\b\002\020\005\032\0020\0062\b\b\002\020\007\032\0020\b2\016\b\002\020\t\032\b\022\004\022\0020\0130\n2\b\b\002\020\f\032\0020\r2\b\b\002\020\016\032\0020\017HÆ\001J\023\020$\032\0020\0172\b\020%\032\004\030\0010&HÖ\003J\t\020'\032\0020\004HÖ\001J\t\020(\032\0020\bHÖ\001J&\020)\032\0020*2\006\020+\032\0020\0002\006\020,\032\0020-2\006\020.\032\0020/HÁ\001¢\006\002\b0R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\024\020\025R\027\020\t\032\b\022\004\022\0020\0130\n¢\006\b\n\000\032\004\b\026\020\027R\024\020\f\032\0020\rX\004¢\006\b\n\000\032\004\b\030\020\031R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\032\020\033R\024\020\016\032\0020\017X\004¢\006\b\n\000\032\004\b\034\020\035¨\0063"}, d2 = {"Lai/grazie/api/gateway/api/indexing/IndexingAPI$Index$IndexChunks$Request;", "Lai/grazie/code/indexing/model/request/IndexDescriptorRequest;", "Lai/grazie/code/indexing/model/request/VerboseAvailableRequest;", "seen1", "", "snapshot", "Lai/grazie/code/indexing/model/snapshot/Snapshot;", "cluster", "", "data", "", "Lai/grazie/code/indexing/model/index/ItemToIndex;", "descriptor", "Lai/grazie/code/indexing/model/IndexDescriptor;", "verbose", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/code/indexing/model/snapshot/Snapshot;Ljava/lang/String;Ljava/util/List;Lai/grazie/code/indexing/model/IndexDescriptor;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/code/indexing/model/snapshot/Snapshot;Ljava/lang/String;Ljava/util/List;Lai/grazie/code/indexing/model/IndexDescriptor;Z)V", "getCluster", "()Ljava/lang/String;", "getData", "()Ljava/util/List;", "getDescriptor", "()Lai/grazie/code/indexing/model/IndexDescriptor;", "getSnapshot", "()Lai/grazie/code/indexing/model/snapshot/Snapshot;", "getVerbose", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */ public final class Request
/*    */   implements IndexDescriptorRequest, VerboseAvailableRequest
/*    */ {
/*    */   @NotNull
/*    */   private final Snapshot snapshot;
/*    */   @NotNull
/*    */   private final String cluster;
/*    */   @NotNull
/*    */   private final List<ItemToIndex> data;
/*    */   @NotNull
/*    */   private final IndexDescriptor descriptor;
/*    */   private final boolean verbose;
/*    */   @JvmField
/*    */   @NotNull
/*    */   private static final KSerializer<Object>[] $childSerializers;
/*    */   @NotNull
/* 93 */   public static final Companion Companion = new Companion(null);
/*    */   public Request(@NotNull Snapshot snapshot, @NotNull String cluster, @NotNull List<ItemToIndex> data, @NotNull IndexDescriptor descriptor, boolean verbose) {
/* 95 */     this.snapshot = snapshot;
/* 96 */     this.cluster = cluster;
/* 97 */     this.data = data;
/* 98 */     this.descriptor = descriptor;
/* 99 */     this.verbose = verbose; } public boolean getVerbose() { return this.verbose; }
/*    */ 
/*    */   
/*    */   static {
/*    */     KSerializer[] arrayOfKSerializer = new KSerializer[5];
/*    */     arrayOfKSerializer[0] = null;
/*    */     arrayOfKSerializer[1] = null;
/*    */     arrayOfKSerializer[2] = (KSerializer)new ArrayListSerializer((KSerializer)ItemToIndex$.serializer.INSTANCE);
/*    */     arrayOfKSerializer[3] = null;
/*    */     arrayOfKSerializer[4] = null;
/*    */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/indexing/IndexingAPI.Index.IndexChunks.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/indexing/IndexingAPI$Index$IndexChunks$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
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
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])IndexingAPI.Index.IndexChunks.Request.$childSerializers, arrayOfKSerializer2 = new KSerializer[5];
/*    */       arrayOfKSerializer2[0] = (KSerializer)Snapshot$.serializer.INSTANCE;
/*    */       arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[2] = arrayOfKSerializer1[2];
/*    */       arrayOfKSerializer2[3] = (KSerializer)IndexDescriptor$.serializer.INSTANCE;
/*    */       arrayOfKSerializer2[4] = (KSerializer)BooleanSerializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public IndexingAPI.Index.IndexChunks.Request deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       Snapshot snapshot = null;
/*    */       String str = null;
/*    */       List list = null;
/*    */       IndexDescriptor indexDescriptor = null;
/*    */       boolean bool1 = false;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])IndexingAPI.Index.IndexChunks.Request.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         snapshot = (Snapshot)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Snapshot$.serializer.INSTANCE, snapshot);
/*    */         i |= 0x1;
/*    */         str = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */         i |= 0x2;
/*    */         list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], list);
/*    */         i |= 0x4;
/*    */         indexDescriptor = (IndexDescriptor)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)IndexDescriptor$.serializer.INSTANCE, indexDescriptor);
/*    */         i |= 0x8;
/*    */         bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 4);
/*    */         i |= 0x10;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               snapshot = (Snapshot)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Snapshot$.serializer.INSTANCE, snapshot);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               str = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], list);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               indexDescriptor = (IndexDescriptor)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)IndexDescriptor$.serializer.INSTANCE, indexDescriptor);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 4);
/*    */               i |= 0x10;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new IndexingAPI.Index.IndexChunks.Request(i, snapshot, str, list, indexDescriptor, bool1, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull IndexingAPI.Index.IndexChunks.Request value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       IndexingAPI.Index.IndexChunks.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.indexing.IndexingAPI.Index.IndexChunks.Request", INSTANCE, 5);
/*    */       pluginGeneratedSerialDescriptor.addElement("snapshot", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("cluster", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("data", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("descriptor", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("verbose", true);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/indexing/IndexingAPI$Index$IndexChunks$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/indexing/IndexingAPI$Index$IndexChunks$Request;", "api-gateway-api"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<IndexingAPI.Index.IndexChunks.Request> serializer() {
/*    */       return (KSerializer<IndexingAPI.Index.IndexChunks.Request>)IndexingAPI.Index.IndexChunks.Request.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Snapshot getSnapshot() {
/*    */     return this.snapshot;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getCluster() {
/*    */     return this.cluster;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<ItemToIndex> getData() {
/*    */     return this.data;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public IndexDescriptor getDescriptor() {
/*    */     return this.descriptor;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Snapshot component1() {
/*    */     return this.snapshot;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.cluster;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<ItemToIndex> component3() {
/*    */     return this.data;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final IndexDescriptor component4() {
/*    */     return this.descriptor;
/*    */   }
/*    */   
/*    */   public final boolean component5() {
/*    */     return this.verbose;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Request copy(@NotNull Snapshot snapshot, @NotNull String cluster, @NotNull List<ItemToIndex> data, @NotNull IndexDescriptor descriptor, boolean verbose) {
/*    */     Intrinsics.checkNotNullParameter(snapshot, "snapshot");
/*    */     Intrinsics.checkNotNullParameter(cluster, "cluster");
/*    */     Intrinsics.checkNotNullParameter(data, "data");
/*    */     Intrinsics.checkNotNullParameter(descriptor, "descriptor");
/*    */     return new Request(snapshot, cluster, data, descriptor, verbose);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Request(snapshot=" + this.snapshot + ", cluster=" + this.cluster + ", data=" + this.data + ", descriptor=" + this.descriptor + ", verbose=" + this.verbose + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.snapshot.hashCode();
/*    */     result = result * 31 + this.cluster.hashCode();
/*    */     result = result * 31 + this.data.hashCode();
/*    */     result = result * 31 + this.descriptor.hashCode();
/*    */     return result * 31 + Boolean.hashCode(this.verbose);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Request))
/*    */       return false; 
/*    */     Request request = (Request)other;
/*    */     return !Intrinsics.areEqual(this.snapshot, request.snapshot) ? false : (!Intrinsics.areEqual(this.cluster, request.cluster) ? false : (!Intrinsics.areEqual(this.data, request.data) ? false : (!Intrinsics.areEqual(this.descriptor, request.descriptor) ? false : (!(this.verbose != request.verbose)))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\indexing\IndexingAPI$Index$IndexChunks$Request.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */