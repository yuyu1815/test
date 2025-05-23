/*    */ package ai.grazie.api.gateway.api.indexing;
/*    */ 
/*    */ import ai.grazie.code.indexing.model.IndexDescriptor;
/*    */ import ai.grazie.code.indexing.model.IndexDescriptor$;
/*    */ import ai.grazie.code.indexing.model.cluster.FileClusterDTO;
/*    */ import ai.grazie.code.indexing.model.cluster.FileClusterDTO$;
/*    */ import ai.grazie.code.indexing.model.snapshot.Snapshot;
/*    */ import ai.grazie.code.indexing.model.snapshot.Snapshot$;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/indexing/IndexingAPI.Clusters.StoreCluster.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/indexing/IndexingAPI$Clusters$StoreCluster$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*    */ public final class $serializer
/*    */   implements GeneratedSerializer<IndexingAPI.Clusters.StoreCluster.Request>
/*    */ {
/*    */   @NotNull
/* 57 */   public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = (KSerializer)Snapshot$.serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)FileClusterDTO$.serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)IndexDescriptor$.serializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public IndexingAPI.Clusters.StoreCluster.Request deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; Snapshot snapshot = null; FileClusterDTO fileClusterDTO = null; IndexDescriptor indexDescriptor = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { snapshot = (Snapshot)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Snapshot$.serializer.INSTANCE, snapshot); i |= 0x1; fileClusterDTO = (FileClusterDTO)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)FileClusterDTO$.serializer.INSTANCE, fileClusterDTO); i |= 0x2; indexDescriptor = (IndexDescriptor)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)IndexDescriptor$.serializer.INSTANCE, indexDescriptor); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: snapshot = (Snapshot)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Snapshot$.serializer.INSTANCE, snapshot); i |= 0x1; continue;case 1: fileClusterDTO = (FileClusterDTO)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)FileClusterDTO$.serializer.INSTANCE, fileClusterDTO); i |= 0x2; continue;case 2: indexDescriptor = (IndexDescriptor)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)IndexDescriptor$.serializer.INSTANCE, indexDescriptor); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new IndexingAPI.Clusters.StoreCluster.Request(i, snapshot, fileClusterDTO, indexDescriptor, null); } public void serialize(@NotNull Encoder encoder, @NotNull IndexingAPI.Clusters.StoreCluster.Request value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); IndexingAPI.Clusters.StoreCluster.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.indexing.IndexingAPI.Clusters.StoreCluster.Request", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("snapshot", false); pluginGeneratedSerialDescriptor.addElement("cluster", false); pluginGeneratedSerialDescriptor.addElement("descriptor", false); descriptor = pluginGeneratedSerialDescriptor; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\indexing\IndexingAPI$Clusters$StoreCluster$Request$$serializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */