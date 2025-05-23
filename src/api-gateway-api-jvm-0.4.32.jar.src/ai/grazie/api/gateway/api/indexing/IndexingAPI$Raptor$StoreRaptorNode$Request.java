/*     */ package ai.grazie.api.gateway.api.indexing;
/*     */ 
/*     */ import ai.grazie.code.indexing.model.IndexDescriptor;
/*     */ import ai.grazie.code.indexing.model.IndexDescriptor$;
/*     */ import ai.grazie.code.indexing.model.raptor.RaptorNode;
/*     */ import ai.grazie.code.indexing.model.raptor.RaptorNode$;
/*     */ import ai.grazie.code.indexing.model.request.IndexDescriptorRequest;
/*     */ import ai.grazie.code.indexing.model.snapshot.Snapshot;
/*     */ import ai.grazie.code.indexing.model.snapshot.Snapshot$;
/*     */ import java.util.List;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\021\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 -2\0020\001:\002,-BE\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\016\020\b\032\n\022\004\022\0020\n\030\0010\t\022\006\020\013\032\0020\f\022\b\020\r\032\004\030\0010\016¢\006\002\020\017B+\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\f\020\b\032\b\022\004\022\0020\n0\t\022\006\020\013\032\0020\f¢\006\002\020\020J\t\020\031\032\0020\005HÆ\003J\t\020\032\032\0020\007HÆ\003J\017\020\033\032\b\022\004\022\0020\n0\tHÆ\003J\t\020\034\032\0020\fHÆ\003J7\020\035\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\016\b\002\020\b\032\b\022\004\022\0020\n0\t2\b\b\002\020\013\032\0020\fHÆ\001J\023\020\036\032\0020\f2\b\020\037\032\004\030\0010 HÖ\003J\t\020!\032\0020\003HÖ\001J\t\020\"\032\0020#HÖ\001J&\020$\032\0020%2\006\020&\032\0020\0002\006\020'\032\0020(2\006\020)\032\0020*HÁ\001¢\006\002\b+R\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\021\020\022R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\023\020\024R\027\020\b\032\b\022\004\022\0020\n0\t¢\006\b\n\000\032\004\b\025\020\026R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\027\020\030¨\006."}, d2 = {"Lai/grazie/api/gateway/api/indexing/IndexingAPI$Raptor$StoreRaptorNode$Request;", "Lai/grazie/code/indexing/model/request/IndexDescriptorRequest;", "seen1", "", "descriptor", "Lai/grazie/code/indexing/model/IndexDescriptor;", "snapshot", "Lai/grazie/code/indexing/model/snapshot/Snapshot;", "nodes", "", "Lai/grazie/code/indexing/model/raptor/RaptorNode;", "buildVectors", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/code/indexing/model/IndexDescriptor;Lai/grazie/code/indexing/model/snapshot/Snapshot;Ljava/util/List;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/code/indexing/model/IndexDescriptor;Lai/grazie/code/indexing/model/snapshot/Snapshot;Ljava/util/List;Z)V", "getBuildVectors", "()Z", "getDescriptor", "()Lai/grazie/code/indexing/model/IndexDescriptor;", "getNodes", "()Ljava/util/List;", "getSnapshot", "()Lai/grazie/code/indexing/model/snapshot/Snapshot;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */ public final class Request
/*     */   implements IndexDescriptorRequest
/*     */ {
/*     */   @NotNull
/*     */   private final IndexDescriptor descriptor;
/*     */   @NotNull
/*     */   private final Snapshot snapshot;
/*     */   @NotNull
/*     */   private final List<RaptorNode> nodes;
/*     */   private final boolean buildVectors;
/*     */   @JvmField
/*     */   @NotNull
/*     */   private static final KSerializer<Object>[] $childSerializers;
/*     */   @NotNull
/* 137 */   public static final Companion Companion = new Companion(null);
/*     */   public Request(@NotNull IndexDescriptor descriptor, @NotNull Snapshot snapshot, @NotNull List<RaptorNode> nodes, boolean buildVectors) {
/* 139 */     this.descriptor = descriptor;
/* 140 */     this.snapshot = snapshot;
/* 141 */     this.nodes = nodes;
/* 142 */     this.buildVectors = buildVectors; } public final boolean getBuildVectors() { return this.buildVectors; }
/*     */ 
/*     */   
/*     */   static {
/*     */     KSerializer[] arrayOfKSerializer = new KSerializer[4];
/*     */     arrayOfKSerializer[0] = null;
/*     */     arrayOfKSerializer[1] = null;
/*     */     arrayOfKSerializer[2] = (KSerializer)new ArrayListSerializer((KSerializer)RaptorNode$.serializer.INSTANCE);
/*     */     arrayOfKSerializer[3] = null;
/*     */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */   }
/*     */   
/*     */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/indexing/IndexingAPI.Raptor.StoreRaptorNode.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/indexing/IndexingAPI$Raptor$StoreRaptorNode$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
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
/*     */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])IndexingAPI.Raptor.StoreRaptorNode.Request.$childSerializers, arrayOfKSerializer2 = new KSerializer[4];
/*     */       arrayOfKSerializer2[0] = (KSerializer)IndexDescriptor$.serializer.INSTANCE;
/*     */       arrayOfKSerializer2[1] = (KSerializer)Snapshot$.serializer.INSTANCE;
/*     */       arrayOfKSerializer2[2] = arrayOfKSerializer1[2];
/*     */       arrayOfKSerializer2[3] = (KSerializer)BooleanSerializer.INSTANCE;
/*     */       return (KSerializer<?>[])arrayOfKSerializer2;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public IndexingAPI.Raptor.StoreRaptorNode.Request deserialize(@NotNull Decoder decoder) {
/*     */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       boolean bool = true;
/*     */       int i = 0;
/*     */       IndexDescriptor indexDescriptor = null;
/*     */       Snapshot snapshot = null;
/*     */       List list = null;
/*     */       boolean bool1 = false;
/*     */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */       KSerializer[] arrayOfKSerializer = (KSerializer[])IndexingAPI.Raptor.StoreRaptorNode.Request.$childSerializers;
/*     */       if (compositeDecoder.decodeSequentially()) {
/*     */         indexDescriptor = (IndexDescriptor)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)IndexDescriptor$.serializer.INSTANCE, indexDescriptor);
/*     */         i |= 0x1;
/*     */         snapshot = (Snapshot)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Snapshot$.serializer.INSTANCE, snapshot);
/*     */         i |= 0x2;
/*     */         list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], list);
/*     */         i |= 0x4;
/*     */         bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 3);
/*     */         i |= 0x8;
/*     */       } else {
/*     */         while (bool) {
/*     */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */           switch (j) {
/*     */             case -1:
/*     */               bool = false;
/*     */               continue;
/*     */             case 0:
/*     */               indexDescriptor = (IndexDescriptor)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)IndexDescriptor$.serializer.INSTANCE, indexDescriptor);
/*     */               i |= 0x1;
/*     */               continue;
/*     */             case 1:
/*     */               snapshot = (Snapshot)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Snapshot$.serializer.INSTANCE, snapshot);
/*     */               i |= 0x2;
/*     */               continue;
/*     */             case 2:
/*     */               list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], list);
/*     */               i |= 0x4;
/*     */               continue;
/*     */             case 3:
/*     */               bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 3);
/*     */               i |= 0x8;
/*     */               continue;
/*     */           } 
/*     */           throw new UnknownFieldException(j);
/*     */         } 
/*     */       } 
/*     */       compositeDecoder.endStructure(serialDescriptor);
/*     */       return new IndexingAPI.Raptor.StoreRaptorNode.Request(i, indexDescriptor, snapshot, list, bool1, null);
/*     */     }
/*     */     
/*     */     public void serialize(@NotNull Encoder encoder, @NotNull IndexingAPI.Raptor.StoreRaptorNode.Request value) {
/*     */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */       Intrinsics.checkNotNullParameter(value, "value");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */       IndexingAPI.Raptor.StoreRaptorNode.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */       compositeEncoder.endStructure(serialDescriptor);
/*     */     }
/*     */     
/*     */     static {
/*     */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.indexing.IndexingAPI.Raptor.StoreRaptorNode.Request", INSTANCE, 4);
/*     */       pluginGeneratedSerialDescriptor.addElement("descriptor", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("snapshot", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("nodes", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("buildVectors", false);
/*     */       descriptor = pluginGeneratedSerialDescriptor;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/indexing/IndexingAPI$Raptor$StoreRaptorNode$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/indexing/IndexingAPI$Raptor$StoreRaptorNode$Request;", "api-gateway-api"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<IndexingAPI.Raptor.StoreRaptorNode.Request> serializer() {
/*     */       return (KSerializer<IndexingAPI.Raptor.StoreRaptorNode.Request>)IndexingAPI.Raptor.StoreRaptorNode.Request.$serializer.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public IndexDescriptor getDescriptor() {
/*     */     return this.descriptor;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Snapshot getSnapshot() {
/*     */     return this.snapshot;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<RaptorNode> getNodes() {
/*     */     return this.nodes;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final IndexDescriptor component1() {
/*     */     return this.descriptor;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Snapshot component2() {
/*     */     return this.snapshot;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<RaptorNode> component3() {
/*     */     return this.nodes;
/*     */   }
/*     */   
/*     */   public final boolean component4() {
/*     */     return this.buildVectors;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Request copy(@NotNull IndexDescriptor descriptor, @NotNull Snapshot snapshot, @NotNull List<RaptorNode> nodes, boolean buildVectors) {
/*     */     Intrinsics.checkNotNullParameter(descriptor, "descriptor");
/*     */     Intrinsics.checkNotNullParameter(snapshot, "snapshot");
/*     */     Intrinsics.checkNotNullParameter(nodes, "nodes");
/*     */     return new Request(descriptor, snapshot, nodes, buildVectors);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "Request(descriptor=" + this.descriptor + ", snapshot=" + this.snapshot + ", nodes=" + this.nodes + ", buildVectors=" + this.buildVectors + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.descriptor.hashCode();
/*     */     result = result * 31 + this.snapshot.hashCode();
/*     */     result = result * 31 + this.nodes.hashCode();
/*     */     return result * 31 + Boolean.hashCode(this.buildVectors);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof Request))
/*     */       return false; 
/*     */     Request request = (Request)other;
/*     */     return !Intrinsics.areEqual(this.descriptor, request.descriptor) ? false : (!Intrinsics.areEqual(this.snapshot, request.snapshot) ? false : (!Intrinsics.areEqual(this.nodes, request.nodes) ? false : (!(this.buildVectors != request.buildVectors))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\indexing\IndexingAPI$Raptor$StoreRaptorNode$Request.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */