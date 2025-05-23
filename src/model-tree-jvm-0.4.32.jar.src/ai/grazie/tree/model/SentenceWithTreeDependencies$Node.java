/*    */ package ai.grazie.tree.model;
/*    */ 
/*    */ import ai.grazie.text.TextRange;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\016\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 '2\0020\001:\002&'BA\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\007\022\b\020\t\032\004\030\0010\007\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB%\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\007\022\006\020\t\032\0020\007¢\006\002\020\rJ\t\020\024\032\0020\005HÆ\003J\t\020\025\032\0020\007HÆ\003J\t\020\026\032\0020\007HÆ\003J\t\020\027\032\0020\007HÆ\003J1\020\030\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020\t\032\0020\007HÆ\001J\023\020\031\032\0020\0322\b\020\033\032\004\030\0010\001HÖ\003J\t\020\034\032\0020\003HÖ\001J\t\020\035\032\0020\007HÖ\001J&\020\036\032\0020\0372\006\020 \032\0020\0002\006\020!\032\0020\"2\006\020#\032\0020$HÁ\001¢\006\002\b%R\021\020\t\032\0020\007¢\006\b\n\000\032\004\b\016\020\017R\021\020\b\032\0020\007¢\006\b\n\000\032\004\b\020\020\017R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\021\020\017R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\022\020\023¨\006("}, d2 = {"Lai/grazie/tree/model/SentenceWithTreeDependencies$Node;", "", "seen1", "", "range", "Lai/grazie/text/TextRange;", "id", "", "headId", "dependency", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/text/TextRange;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/text/TextRange;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDependency", "()Ljava/lang/String;", "getHeadId", "getId", "getRange", "()Lai/grazie/text/TextRange;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_tree", "$serializer", "Companion", "model-tree"})
/*    */ public final class Node {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final TextRange range;
/*    */   @NotNull
/*    */   private final String id;
/*    */   @NotNull
/*    */   private final String headId;
/*    */   @NotNull
/*    */   private final String dependency;
/*    */   
/* 24 */   public Node(@NotNull TextRange range, @NotNull String id, @NotNull String headId, @NotNull String dependency) { this.range = range; this.id = id; this.headId = headId; this.dependency = dependency; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/tree/model/SentenceWithTreeDependencies.Node.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/tree/model/SentenceWithTreeDependencies$Node;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-tree"}) public static final class $serializer implements GeneratedSerializer<Node> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = (KSerializer)TextRange$.serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public SentenceWithTreeDependencies.Node deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; TextRange textRange = null; String str1 = null, str2 = null, str3 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { textRange = (TextRange)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TextRange$.serializer.INSTANCE, textRange); i |= 0x1; str1 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; str3 = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: textRange = (TextRange)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TextRange$.serializer.INSTANCE, textRange); i |= 0x1; continue;case 1: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue;case 2: str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; continue;case 3: str3 = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new SentenceWithTreeDependencies.Node(i, textRange, str1, str2, str3, null); } public void serialize(@NotNull Encoder encoder, @NotNull SentenceWithTreeDependencies.Node value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); SentenceWithTreeDependencies.Node.write$Self$model_tree(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.tree.model.SentenceWithTreeDependencies.Node", INSTANCE, 4); pluginGeneratedSerialDescriptor.addElement("range", false); pluginGeneratedSerialDescriptor.addElement("id", false); pluginGeneratedSerialDescriptor.addElement("headId", false); pluginGeneratedSerialDescriptor.addElement("dependency", false); descriptor = pluginGeneratedSerialDescriptor; } } @NotNull public final TextRange getRange() { return this.range; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/tree/model/SentenceWithTreeDependencies$Node$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/tree/model/SentenceWithTreeDependencies$Node;", "model-tree"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<SentenceWithTreeDependencies.Node> serializer() { return (KSerializer<SentenceWithTreeDependencies.Node>)SentenceWithTreeDependencies.Node.$serializer.INSTANCE; } } @NotNull public final String getId() { return this.id; } @NotNull public final String getHeadId() { return this.headId; } @NotNull public final String getDependency() { return this.dependency; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final TextRange component1() {
/*    */     return this.range;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.headId;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component4() {
/*    */     return this.dependency;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Node copy(@NotNull TextRange range, @NotNull String id, @NotNull String headId, @NotNull String dependency) {
/*    */     Intrinsics.checkNotNullParameter(range, "range");
/*    */     Intrinsics.checkNotNullParameter(id, "id");
/*    */     Intrinsics.checkNotNullParameter(headId, "headId");
/*    */     Intrinsics.checkNotNullParameter(dependency, "dependency");
/*    */     return new Node(range, id, headId, dependency);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Node(range=" + this.range + ", id=" + this.id + ", headId=" + this.headId + ", dependency=" + this.dependency + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.range.hashCode();
/*    */     result = result * 31 + this.id.hashCode();
/*    */     result = result * 31 + this.headId.hashCode();
/*    */     return result * 31 + this.dependency.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Node))
/*    */       return false; 
/*    */     Node node = (Node)other;
/*    */     return !Intrinsics.areEqual(this.range, node.range) ? false : (!Intrinsics.areEqual(this.id, node.id) ? false : (!Intrinsics.areEqual(this.headId, node.headId) ? false : (!!Intrinsics.areEqual(this.dependency, node.dependency))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-tree-jvm-0.4.32.jar!\ai\grazie\tree\model\SentenceWithTreeDependencies$Node.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */