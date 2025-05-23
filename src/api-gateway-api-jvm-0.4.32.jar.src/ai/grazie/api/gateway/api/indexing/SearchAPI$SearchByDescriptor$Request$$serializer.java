/*    */ package ai.grazie.api.gateway.api.indexing;
/*    */ 
/*    */ import ai.grazie.code.indexing.model.IndexDescriptor;
/*    */ import ai.grazie.code.indexing.model.IndexDescriptor$;
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
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.DoubleSerializer;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.IntSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/indexing/SearchAPI.SearchByDescriptor.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/indexing/SearchAPI$SearchByDescriptor$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*    */ public final class $serializer
/*    */   implements GeneratedSerializer<SearchAPI.SearchByDescriptor.Request>
/*    */ {
/*    */   @NotNull
/* 73 */   public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[6]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)Snapshot$.serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)IntSerializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)DoubleSerializer.INSTANCE; arrayOfKSerializer[4] = (KSerializer)IndexDescriptor$.serializer.INSTANCE; arrayOfKSerializer[5] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public SearchAPI.SearchByDescriptor.Request deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str1 = null; Snapshot snapshot = null; int j = 0; double d = 0.0D; IndexDescriptor indexDescriptor = null; String str2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; snapshot = (Snapshot)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Snapshot$.serializer.INSTANCE, snapshot); i |= 0x2; j = compositeDecoder.decodeIntElement(serialDescriptor, 2); i |= 0x4; d = compositeDecoder.decodeDoubleElement(serialDescriptor, 3); i |= 0x8; indexDescriptor = (IndexDescriptor)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)IndexDescriptor$.serializer.INSTANCE, indexDescriptor); i |= 0x10; str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy)StringSerializer.INSTANCE, str2); i |= 0x20; } else { while (bool) { int k = compositeDecoder.decodeElementIndex(serialDescriptor); switch (k) { case -1: bool = false; continue;case 0: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: snapshot = (Snapshot)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Snapshot$.serializer.INSTANCE, snapshot); i |= 0x2; continue;case 2: j = compositeDecoder.decodeIntElement(serialDescriptor, 2); i |= 0x4; continue;case 3: d = compositeDecoder.decodeDoubleElement(serialDescriptor, 3); i |= 0x8; continue;case 4: indexDescriptor = (IndexDescriptor)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)IndexDescriptor$.serializer.INSTANCE, indexDescriptor); i |= 0x10; continue;case 5: str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy)StringSerializer.INSTANCE, str2); i |= 0x20; continue; }  throw new UnknownFieldException(k); }  }  compositeDecoder.endStructure(serialDescriptor); return new SearchAPI.SearchByDescriptor.Request(i, str1, snapshot, j, d, indexDescriptor, str2, null); } public void serialize(@NotNull Encoder encoder, @NotNull SearchAPI.SearchByDescriptor.Request value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); SearchAPI.SearchByDescriptor.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.indexing.SearchAPI.SearchByDescriptor.Request", INSTANCE, 6); pluginGeneratedSerialDescriptor.addElement("text", false); pluginGeneratedSerialDescriptor.addElement("snapshot", false); pluginGeneratedSerialDescriptor.addElement("maxResults", false); pluginGeneratedSerialDescriptor.addElement("minScore", false); pluginGeneratedSerialDescriptor.addElement("descriptor", false); pluginGeneratedSerialDescriptor.addElement("pathFilter", true); descriptor = pluginGeneratedSerialDescriptor; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\indexing\SearchAPI$SearchByDescriptor$Request$$serializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */