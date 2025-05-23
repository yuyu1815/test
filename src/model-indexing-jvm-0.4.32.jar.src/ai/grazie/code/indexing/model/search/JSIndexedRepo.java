/*    */ package ai.grazie.code.indexing.model.search;
/*    */ import ai.grazie.code.indexing.model.snapshot.JSSnapshotMetadata;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020\021\n\002\030\002\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 $2\0020\001:\002#$B3\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\016\020\006\032\n\022\004\022\0020\b\030\0010\007\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B\033\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007¢\006\002\020\fJ\t\020\022\032\0020\005HÆ\003J\024\020\023\032\b\022\004\022\0020\b0\007HÆ\003¢\006\002\020\020J(\020\024\032\0020\0002\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\007HÆ\001¢\006\002\020\025J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\001H\002J\b\020\031\032\0020\003H\026J\t\020\032\032\0020\005HÖ\001J&\020\033\032\0020\0342\006\020\035\032\0020\0002\006\020\036\032\0020\0372\006\020 \032\0020!HÁ\001¢\006\002\b\"R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\r\020\016R\031\020\006\032\b\022\004\022\0020\b0\007¢\006\n\n\002\020\021\032\004\b\017\020\020¨\006%"}, d2 = {"Lai/grazie/code/indexing/model/search/JSIndexedRepo;", "", "seen1", "", "repository", "", "snapshots", "", "Lai/grazie/code/indexing/model/snapshot/JSSnapshotMetadata;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;[Lai/grazie/code/indexing/model/snapshot/JSSnapshotMetadata;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;[Lai/grazie/code/indexing/model/snapshot/JSSnapshotMetadata;)V", "getRepository", "()Ljava/lang/String;", "getSnapshots", "()[Lai/grazie/code/indexing/model/snapshot/JSSnapshotMetadata;", "[Lai/grazie/code/indexing/model/snapshot/JSSnapshotMetadata;", "component1", "component2", "copy", "(Ljava/lang/String;[Lai/grazie/code/indexing/model/snapshot/JSSnapshotMetadata;)Lai/grazie/code/indexing/model/search/JSIndexedRepo;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_indexing", "$serializer", "Companion", "model-indexing"})
/*    */ public final class JSIndexedRepo {
/*    */   @NotNull
/* 13 */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull private final String repository; @NotNull private final JSSnapshotMetadata[] snapshots; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = null;
/*    */     arrayOfKSerializer[1] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(JSSnapshotMetadata.class), (KSerializer)JSSnapshotMetadata$.serializer.INSTANCE);
/* 16 */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } public JSIndexedRepo(@NotNull String repository, @NotNull JSSnapshotMetadata[] snapshots) { this.repository = repository;
/* 17 */     this.snapshots = snapshots; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/code/indexing/model/search/JSIndexedRepo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/code/indexing/model/search/JSIndexedRepo;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-indexing"}) public static final class $serializer implements GeneratedSerializer<JSIndexedRepo> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])JSIndexedRepo.$childSerializers, arrayOfKSerializer2 = new KSerializer[2]; arrayOfKSerializer2[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[1] = arrayOfKSerializer1[1]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public JSIndexedRepo deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str = null; JSSnapshotMetadata[] arrayOfJSSnapshotMetadata = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])JSIndexedRepo.$childSerializers; if (compositeDecoder.decodeSequentially()) { str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; arrayOfJSSnapshotMetadata = (JSSnapshotMetadata[])compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], arrayOfJSSnapshotMetadata); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: arrayOfJSSnapshotMetadata = (JSSnapshotMetadata[])compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], arrayOfJSSnapshotMetadata); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new JSIndexedRepo(i, str, arrayOfJSSnapshotMetadata, null); } public void serialize(@NotNull Encoder encoder, @NotNull JSIndexedRepo value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); JSIndexedRepo.write$Self$model_indexing(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.code.indexing.model.search.JSIndexedRepo", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("repository", false); pluginGeneratedSerialDescriptor.addElement("snapshots", false); descriptor = pluginGeneratedSerialDescriptor; } } @NotNull public final JSSnapshotMetadata[] getSnapshots() { return this.snapshots; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/code/indexing/model/search/JSIndexedRepo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/code/indexing/model/search/JSIndexedRepo;", "model-indexing"}) public static final class Companion {
/*    */     private Companion() {} @NotNull public final KSerializer<JSIndexedRepo> serializer() { return (KSerializer<JSIndexedRepo>)JSIndexedRepo.$serializer.INSTANCE; } }
/*    */   @NotNull public final String getRepository() { return this.repository; }
/* 20 */   public boolean equals(@Nullable Object other) { if (this == other) return true; 
/* 21 */     if (other == null || getClass() != other.getClass()) return false;
/*    */     
/* 23 */     (JSIndexedRepo)other;
/*    */     
/* 25 */     if (!Intrinsics.areEqual(this.repository, ((JSIndexedRepo)other).repository)) return false; 
/* 26 */     if (!Arrays.equals((Object[])this.snapshots, (Object[])((JSIndexedRepo)other).snapshots)) return false;
/*    */     
/* 28 */     return true; }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 32 */     int result = this.repository.hashCode();
/* 33 */     result = 31 * result + Arrays.hashCode((Object[])this.snapshots);
/* 34 */     return result;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.repository;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final JSSnapshotMetadata[] component2() {
/*    */     return this.snapshots;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final JSIndexedRepo copy(@NotNull String repository, @NotNull JSSnapshotMetadata[] snapshots) {
/*    */     Intrinsics.checkNotNullParameter(repository, "repository");
/*    */     Intrinsics.checkNotNullParameter(snapshots, "snapshots");
/*    */     return new JSIndexedRepo(repository, snapshots);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "JSIndexedRepo(repository=" + this.repository + ", snapshots=" + Arrays.toString((Object[])this.snapshots) + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\search\JSIndexedRepo.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */