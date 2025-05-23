/*    */ package ai.grazie.code.indexing.model.search;
/*    */ import ai.grazie.code.indexing.model.IndexDescriptor;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\021\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\017\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 )2\0020\001:\002()B=\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b\022\b\020\t\032\004\030\0010\n\022\b\020\013\032\004\030\0010\f¢\006\002\020\rB#\022\f\020\004\032\b\022\004\022\0020\0060\005\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n¢\006\002\020\016J\024\020\026\032\b\022\004\022\0020\0060\005HÆ\003¢\006\002\020\022J\t\020\027\032\0020\bHÆ\003J\t\020\030\032\0020\nHÆ\003J2\020\031\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\nHÆ\001¢\006\002\020\032J\023\020\033\032\0020\0342\b\020\035\032\004\030\0010\001H\002J\b\020\036\032\0020\003H\026J\t\020\037\032\0020\nHÖ\001J&\020 \032\0020!2\006\020\"\032\0020\0002\006\020#\032\0020$2\006\020%\032\0020&HÁ\001¢\006\002\b'R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\017\020\020R\031\020\004\032\b\022\004\022\0020\0060\005¢\006\n\n\002\020\023\032\004\b\021\020\022R\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\024\020\025¨\006*"}, d2 = {"Lai/grazie/code/indexing/model/search/JSSearchResponse;", "", "seen1", "", "res", "", "Lai/grazie/code/indexing/model/search/SearchResultWithType;", "indexDescriptor", "Lai/grazie/code/indexing/model/IndexDescriptor;", "revision", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(I[Lai/grazie/code/indexing/model/search/SearchResultWithType;Lai/grazie/code/indexing/model/IndexDescriptor;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "([Lai/grazie/code/indexing/model/search/SearchResultWithType;Lai/grazie/code/indexing/model/IndexDescriptor;Ljava/lang/String;)V", "getIndexDescriptor", "()Lai/grazie/code/indexing/model/IndexDescriptor;", "getRes", "()[Lai/grazie/code/indexing/model/search/SearchResultWithType;", "[Lai/grazie/code/indexing/model/search/SearchResultWithType;", "getRevision", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "([Lai/grazie/code/indexing/model/search/SearchResultWithType;Lai/grazie/code/indexing/model/IndexDescriptor;Ljava/lang/String;)Lai/grazie/code/indexing/model/search/JSSearchResponse;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_indexing", "$serializer", "Companion", "model-indexing"})
/*    */ public final class JSSearchResponse {
/*    */   @NotNull
/* 15 */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull private final SearchResultWithType[] res; @NotNull private final IndexDescriptor indexDescriptor; @NotNull private final String revision; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(SearchResultWithType.class), (KSerializer)SearchResultWithType.$serializer.INSTANCE); arrayOfKSerializer[1] = null;
/*    */     arrayOfKSerializer[2] = null;
/* 18 */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } public JSSearchResponse(@NotNull SearchResultWithType[] res, @NotNull IndexDescriptor indexDescriptor, @NotNull String revision) { this.res = res;
/* 19 */     this.indexDescriptor = indexDescriptor;
/* 20 */     this.revision = revision; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/code/indexing/model/search/JSSearchResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/code/indexing/model/search/JSSearchResponse;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-indexing"}) public static final class $serializer implements GeneratedSerializer<JSSearchResponse> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])JSSearchResponse.$childSerializers, arrayOfKSerializer2 = new KSerializer[3]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = (KSerializer)IndexDescriptor$.serializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public JSSearchResponse deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; SearchResultWithType[] arrayOfSearchResultWithType = null; IndexDescriptor indexDescriptor = null; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])JSSearchResponse.$childSerializers; if (compositeDecoder.decodeSequentially()) { arrayOfSearchResultWithType = (SearchResultWithType[])compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], arrayOfSearchResultWithType); i |= 0x1; indexDescriptor = (IndexDescriptor)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)IndexDescriptor$.serializer.INSTANCE, indexDescriptor); i |= 0x2; str = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: arrayOfSearchResultWithType = (SearchResultWithType[])compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], arrayOfSearchResultWithType); i |= 0x1; continue;case 1: indexDescriptor = (IndexDescriptor)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)IndexDescriptor$.serializer.INSTANCE, indexDescriptor); i |= 0x2; continue;case 2: str = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new JSSearchResponse(i, arrayOfSearchResultWithType, indexDescriptor, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull JSSearchResponse value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); JSSearchResponse.write$Self$model_indexing(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.code.indexing.model.search.JSSearchResponse", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("res", false); pluginGeneratedSerialDescriptor.addElement("indexDescriptor", false); pluginGeneratedSerialDescriptor.addElement("revision", false); descriptor = pluginGeneratedSerialDescriptor; } } @NotNull public final String getRevision() { return this.revision; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/code/indexing/model/search/JSSearchResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/code/indexing/model/search/JSSearchResponse;", "model-indexing"}) public static final class Companion {
/*    */     private Companion() {} @NotNull public final KSerializer<JSSearchResponse> serializer() { return (KSerializer<JSSearchResponse>)JSSearchResponse.$serializer.INSTANCE; } } @NotNull public final SearchResultWithType[] getRes() { return this.res; }
/*    */   @NotNull public final IndexDescriptor getIndexDescriptor() { return this.indexDescriptor; }
/* 23 */   public boolean equals(@Nullable Object other) { if (this == other) return true; 
/* 24 */     if (other == null || getClass() != other.getClass()) return false;
/*    */     
/* 26 */     (JSSearchResponse)other;
/*    */     
/* 28 */     if (!Arrays.equals((Object[])this.res, (Object[])((JSSearchResponse)other).res)) return false; 
/* 29 */     if (!Intrinsics.areEqual(this.indexDescriptor, ((JSSearchResponse)other).indexDescriptor)) return false; 
/* 30 */     if (!Intrinsics.areEqual(this.revision, ((JSSearchResponse)other).revision)) return false;
/*    */     
/* 32 */     return true; }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 36 */     int result = Arrays.hashCode((Object[])this.res);
/* 37 */     result = 31 * result + this.indexDescriptor.hashCode();
/* 38 */     result = 31 * result + this.revision.hashCode();
/* 39 */     return result;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SearchResultWithType[] component1() {
/*    */     return this.res;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final IndexDescriptor component2() {
/*    */     return this.indexDescriptor;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.revision;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final JSSearchResponse copy(@NotNull SearchResultWithType[] res, @NotNull IndexDescriptor indexDescriptor, @NotNull String revision) {
/*    */     Intrinsics.checkNotNullParameter(res, "res");
/*    */     Intrinsics.checkNotNullParameter(indexDescriptor, "indexDescriptor");
/*    */     Intrinsics.checkNotNullParameter(revision, "revision");
/*    */     return new JSSearchResponse(res, indexDescriptor, revision);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "JSSearchResponse(res=" + Arrays.toString((Object[])this.res) + ", indexDescriptor=" + this.indexDescriptor + ", revision=" + this.revision + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\search\JSSearchResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */