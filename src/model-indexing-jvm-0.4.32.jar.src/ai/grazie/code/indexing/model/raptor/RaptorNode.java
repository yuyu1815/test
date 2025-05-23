/*    */ package ai.grazie.code.indexing.model.raptor;
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\037\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 72\0020\001:\00267BS\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\006\020\007\032\0020\b\022\b\020\t\032\004\030\0010\n\022\b\020\013\032\004\030\0010\n\022\b\020\f\032\004\030\0010\r\022\b\020\016\032\004\030\0010\017¢\006\002\020\020BC\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\b\b\002\020\007\032\0020\b\022\n\b\002\020\t\032\004\030\0010\n\022\n\b\002\020\013\032\004\030\0010\n\022\n\b\002\020\f\032\004\030\0010\r¢\006\002\020\021J\t\020\036\032\0020\005HÆ\003J\t\020\037\032\0020\005HÆ\003J\t\020 \032\0020\bHÆ\003J\026\020!\032\004\030\0010\nHÆ\003ø\001\001ø\001\000¢\006\002\b\"J\026\020#\032\004\030\0010\nHÆ\003ø\001\001ø\001\000¢\006\002\b$J\013\020%\032\004\030\0010\rHÆ\003JS\020&\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\b2\n\b\002\020\t\032\004\030\0010\n2\n\b\002\020\013\032\004\030\0010\n2\n\b\002\020\f\032\004\030\0010\rHÆ\001ø\001\000¢\006\002\b'J\023\020(\032\0020\b2\b\020)\032\004\030\0010\001HÖ\003J\t\020*\032\0020\003HÖ\001J\006\020+\032\0020\000J\t\020,\032\0020\005HÖ\001J\016\020-\032\0020\0002\006\020\f\032\0020\rJ&\020.\032\0020/2\006\0200\032\0020\0002\006\0201\032\002022\006\0203\032\00204HÁ\001¢\006\002\b5R\031\020\013\032\004\030\0010\nø\001\000ø\001\001¢\006\b\n\000\032\004\b\022\020\023R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\007\020\024R\021\020\025\032\0020\b8F¢\006\006\032\004\b\025\020\024R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\026\020\027R\031\020\t\032\004\030\0010\nø\001\000ø\001\001¢\006\b\n\000\032\004\b\030\020\023R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\031\020\027R\023\020\f\032\004\030\0010\r¢\006\b\n\000\032\004\b\032\020\033R\021\020\034\032\0020\r8F¢\006\006\032\004\b\035\020\033\002\013\n\005\b¡\0360\001\n\002\b!¨\0068"}, d2 = {"Lai/grazie/code/indexing/model/raptor/RaptorNode;", "", "seen1", "", "path", "", "summary", "isDirectory", "", "startOffset", "Lkotlin/UInt;", "endOffset", "vector", "Lai/grazie/emb/TextEmbedding;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ZLkotlin/UInt;Lkotlin/UInt;Lai/grazie/emb/TextEmbedding;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/UInt;Lkotlin/UInt;Lai/grazie/emb/TextEmbedding;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEndOffset-0hXNFcg", "()Lkotlin/UInt;", "()Z", "isEmbedded", "getPath", "()Ljava/lang/String;", "getStartOffset-0hXNFcg", "getSummary", "getVector", "()Lai/grazie/emb/TextEmbedding;", "vectorUnsafe", "getVectorUnsafe", "component1", "component2", "component3", "component4", "component4-0hXNFcg", "component5", "component5-0hXNFcg", "component6", "copy", "copy-lC-D03Q", "equals", "other", "hashCode", "stripVector", "toString", "withVector", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_indexing", "$serializer", "Companion", "model-indexing"})
/*    */ public final class RaptorNode {
/*    */   @NotNull
/*  6 */   public static final Companion Companion = new Companion(null); @NotNull private final String path; @NotNull private final String summary; private final boolean isDirectory; @Nullable private final UInt startOffset; @Nullable private final UInt endOffset; @Nullable private final TextEmbedding vector; @JvmField
/*    */   @NotNull
/*  8 */   private static final KSerializer<Object>[] $childSerializers; private RaptorNode(String path, String summary, boolean isDirectory, UInt startOffset, UInt endOffset, TextEmbedding vector) { this.path = path;
/*  9 */     this.summary = summary;
/* 10 */     this.isDirectory = isDirectory;
/* 11 */     this.startOffset = startOffset;
/* 12 */     this.endOffset = endOffset;
/* 13 */     this.vector = vector; } private RaptorNode(int seen1, String path, String summary, boolean isDirectory, UInt startOffset, UInt endOffset, TextEmbedding vector, SerializationConstructorMarker serializationConstructorMarker) { this.path = path; this.summary = summary; if ((seen1 & 0x4) == 0) { this.isDirectory = true; } else { this.isDirectory = isDirectory; }  if ((seen1 & 0x8) == 0) { this.startOffset = null; } else { this.startOffset = startOffset; }  if ((seen1 & 0x10) == 0) { this.endOffset = null; } else { this.endOffset = endOffset; }  if ((seen1 & 0x20) == 0) { this.vector = null; } else { this.vector = vector; }  } static { KSerializer[] arrayOfKSerializer = new KSerializer[6]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = null; arrayOfKSerializer[4] = null; arrayOfKSerializer[5] = (KSerializer)new PolymorphicSerializer(Reflection.getOrCreateKotlinClass(TextEmbedding.class), new java.lang.annotation.Annotation[0]); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/code/indexing/model/raptor/RaptorNode.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/code/indexing/model/raptor/RaptorNode;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-indexing"}) public static final class $serializer implements GeneratedSerializer<RaptorNode> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])RaptorNode.$childSerializers, arrayOfKSerializer2 = new KSerializer[6]; arrayOfKSerializer2[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)BooleanSerializer.INSTANCE; arrayOfKSerializer2[3] = BuiltinSerializersKt.getNullable((KSerializer)UIntSerializer.INSTANCE); arrayOfKSerializer2[4] = BuiltinSerializersKt.getNullable((KSerializer)UIntSerializer.INSTANCE); arrayOfKSerializer2[5] = BuiltinSerializersKt.getNullable(arrayOfKSerializer1[5]); return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public RaptorNode deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str1 = null, str2 = null; boolean bool1 = false; UInt uInt1 = null, uInt2 = null; TextEmbedding textEmbedding = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])RaptorNode.$childSerializers; if (compositeDecoder.decodeSequentially()) { str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 2); i |= 0x4; uInt1 = (UInt)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)UIntSerializer.INSTANCE, uInt1); i |= 0x8; uInt2 = (UInt)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)UIntSerializer.INSTANCE, uInt2); i |= 0x10; textEmbedding = (TextEmbedding)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy)arrayOfKSerializer[5], textEmbedding); i |= 0x20; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue;case 2: bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 2); i |= 0x4; continue;case 3: uInt1 = (UInt)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)UIntSerializer.INSTANCE, uInt1); i |= 0x8; continue;case 4: uInt2 = (UInt)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)UIntSerializer.INSTANCE, uInt2); i |= 0x10; continue;case 5: textEmbedding = (TextEmbedding)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy)arrayOfKSerializer[5], textEmbedding); i |= 0x20; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new RaptorNode(i, str1, str2, bool1, uInt1, uInt2, textEmbedding, null, null); } public void serialize(@NotNull Encoder encoder, @NotNull RaptorNode value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); RaptorNode.write$Self$model_indexing(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.code.indexing.model.raptor.RaptorNode", INSTANCE, 6); pluginGeneratedSerialDescriptor.addElement("path", false); pluginGeneratedSerialDescriptor.addElement("summary", false); pluginGeneratedSerialDescriptor.addElement("isDirectory", true); pluginGeneratedSerialDescriptor.addElement("startOffset", true); pluginGeneratedSerialDescriptor.addElement("endOffset", true); pluginGeneratedSerialDescriptor.addElement("vector", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/code/indexing/model/raptor/RaptorNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/code/indexing/model/raptor/RaptorNode;", "model-indexing"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<RaptorNode> serializer() { return (KSerializer<RaptorNode>)RaptorNode.$serializer.INSTANCE; } } @NotNull public final String getPath() { return this.path; } @Nullable public final TextEmbedding getVector() { return this.vector; }
/*    */   @NotNull public final String getSummary() { return this.summary; }
/*    */   public final boolean isDirectory() { return this.isDirectory; }
/* 16 */   @Nullable public final UInt getStartOffset-0hXNFcg() { return this.startOffset; } @Nullable public final UInt getEndOffset-0hXNFcg() { return this.endOffset; } public final boolean isEmbedded() { return (this.vector != null); }
/*    */   @NotNull
/* 18 */   public final TextEmbedding getVectorUnsafe() { if (this.vector == null) throw new IllegalStateException(("vector is not initialized for " + this.path).toString());  return this.vector; }
/*    */   @NotNull
/* 20 */   public final RaptorNode withVector(@NotNull TextEmbedding vector) { Intrinsics.checkNotNullParameter(vector, "vector"); return copy-lC-D03Q$default(this, null, null, false, null, null, vector, 31, null); } @NotNull
/* 21 */   public final RaptorNode stripVector() { return copy-lC-D03Q$default(this, null, null, false, null, null, null, 31, null); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.path;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.summary;
/*    */   }
/*    */   
/*    */   public final boolean component3() {
/*    */     return this.isDirectory;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final UInt component4-0hXNFcg() {
/*    */     return this.startOffset;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final UInt component5-0hXNFcg() {
/*    */     return this.endOffset;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final TextEmbedding component6() {
/*    */     return this.vector;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final RaptorNode copy-lC-D03Q(@NotNull String path, @NotNull String summary, boolean isDirectory, @Nullable UInt startOffset, @Nullable UInt endOffset, @Nullable TextEmbedding vector) {
/*    */     Intrinsics.checkNotNullParameter(path, "path");
/*    */     Intrinsics.checkNotNullParameter(summary, "summary");
/*    */     return new RaptorNode(path, summary, isDirectory, startOffset, endOffset, vector, null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "RaptorNode(path=" + this.path + ", summary=" + this.summary + ", isDirectory=" + this.isDirectory + ", startOffset=" + this.startOffset + ", endOffset=" + this.endOffset + ", vector=" + this.vector + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.path.hashCode();
/*    */     result = result * 31 + this.summary.hashCode();
/*    */     result = result * 31 + Boolean.hashCode(this.isDirectory);
/*    */     result = result * 31 + ((this.startOffset == null) ? 0 : UInt.hashCode-impl(this.startOffset.unbox-impl()));
/*    */     result = result * 31 + ((this.endOffset == null) ? 0 : UInt.hashCode-impl(this.endOffset.unbox-impl()));
/*    */     return result * 31 + ((this.vector == null) ? 0 : this.vector.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof RaptorNode))
/*    */       return false; 
/*    */     RaptorNode raptorNode = (RaptorNode)other;
/*    */     return !Intrinsics.areEqual(this.path, raptorNode.path) ? false : (!Intrinsics.areEqual(this.summary, raptorNode.summary) ? false : ((this.isDirectory != raptorNode.isDirectory) ? false : (!Intrinsics.areEqual(this.startOffset, raptorNode.startOffset) ? false : (!Intrinsics.areEqual(this.endOffset, raptorNode.endOffset) ? false : (!!Intrinsics.areEqual(this.vector, raptorNode.vector))))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\raptor\RaptorNode.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */