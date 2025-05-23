/*    */ package ai.grazie.qa;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\021\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 %2\0020\001:\002$%B3\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B\035\022\f\020\004\032\b\022\004\022\0020\0060\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\fJ\024\020\022\032\b\022\004\022\0020\0060\005HÆ\003¢\006\002\020\016J\013\020\023\032\004\030\0010\bHÆ\003J*\020\024\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\n\b\002\020\007\032\004\030\0010\bHÆ\001¢\006\002\020\025J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\001H\002J\b\020\031\032\0020\003H\026J\t\020\032\032\0020\033HÖ\001J&\020\034\032\0020\0352\006\020\036\032\0020\0002\006\020\037\032\0020 2\006\020!\032\0020\"HÁ\001¢\006\002\b#R\031\020\004\032\b\022\004\022\0020\0060\005¢\006\n\n\002\020\017\032\004\b\r\020\016R\023\020\007\032\004\030\0010\b¢\006\b\n\000\032\004\b\020\020\021¨\006&"}, d2 = {"Lai/grazie/qa/QAAnswers;", "", "seen1", "", "documents", "", "Lai/grazie/qa/QADocument;", "summaryWithRefs", "Lai/grazie/qa/QASummary;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(I[Lai/grazie/qa/QADocument;Lai/grazie/qa/QASummary;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "([Lai/grazie/qa/QADocument;Lai/grazie/qa/QASummary;)V", "getDocuments", "()[Lai/grazie/qa/QADocument;", "[Lai/grazie/qa/QADocument;", "getSummaryWithRefs", "()Lai/grazie/qa/QASummary;", "component1", "component2", "copy", "([Lai/grazie/qa/QADocument;Lai/grazie/qa/QASummary;)Lai/grazie/qa/QAAnswers;", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_qa", "$serializer", "Companion", "model-qa"})
/*    */ public final class QAAnswers {
/*    */   @NotNull
/*  9 */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull private final QADocument[] documents; @Nullable private final QASummary summaryWithRefs; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(QADocument.class), (KSerializer)QADocument.$serializer.INSTANCE);
/*    */     arrayOfKSerializer[1] = null;
/* 12 */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } public QAAnswers(@NotNull QADocument[] documents, @Nullable QASummary summaryWithRefs) { this.documents = documents;
/* 13 */     this.summaryWithRefs = summaryWithRefs; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/qa/QAAnswers.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/qa/QAAnswers;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-qa"}) public static final class $serializer implements GeneratedSerializer<QAAnswers> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])QAAnswers.$childSerializers, arrayOfKSerializer2 = new KSerializer[2]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = BuiltinSerializersKt.getNullable((KSerializer)QASummary.$serializer.INSTANCE); return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public QAAnswers deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; QADocument[] arrayOfQADocument = null; QASummary qASummary = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])QAAnswers.$childSerializers; if (compositeDecoder.decodeSequentially()) { arrayOfQADocument = (QADocument[])compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], arrayOfQADocument); i |= 0x1; qASummary = (QASummary)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)QASummary.$serializer.INSTANCE, qASummary); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: arrayOfQADocument = (QADocument[])compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], arrayOfQADocument); i |= 0x1; continue;case 1: qASummary = (QASummary)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)QASummary.$serializer.INSTANCE, qASummary); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new QAAnswers(i, arrayOfQADocument, qASummary, null); } public void serialize(@NotNull Encoder encoder, @NotNull QAAnswers value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); QAAnswers.write$Self$model_qa(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.qa.QAAnswers", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("documents", false); pluginGeneratedSerialDescriptor.addElement("summaryWithRefs", false); descriptor = pluginGeneratedSerialDescriptor; } } @Nullable public final QASummary getSummaryWithRefs() { return this.summaryWithRefs; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/qa/QAAnswers$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/qa/QAAnswers;", "model-qa"}) public static final class Companion {
/*    */     private Companion() {} @NotNull public final KSerializer<QAAnswers> serializer() { return (KSerializer<QAAnswers>)QAAnswers.$serializer.INSTANCE; } }
/*    */   @NotNull public final QADocument[] getDocuments() { return this.documents; }
/* 16 */   public boolean equals(@Nullable Object other) { if (this == other) return true; 
/* 17 */     if (other == null || getClass() != other.getClass()) return false;
/*    */     
/* 19 */     (QAAnswers)other;
/*    */     
/* 21 */     if (!Arrays.equals((Object[])this.documents, (Object[])((QAAnswers)other).documents)) return false; 
/* 22 */     return Intrinsics.areEqual(this.summaryWithRefs, ((QAAnswers)other).summaryWithRefs); }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 26 */     int result = Arrays.hashCode((Object[])this.documents);
/* 27 */     result = 31 * result + ((this.summaryWithRefs != null) ? this.summaryWithRefs.hashCode() : 0);
/* 28 */     return result;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final QADocument[] component1() {
/*    */     return this.documents;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final QASummary component2() {
/*    */     return this.summaryWithRefs;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final QAAnswers copy(@NotNull QADocument[] documents, @Nullable QASummary summaryWithRefs) {
/*    */     Intrinsics.checkNotNullParameter(documents, "documents");
/*    */     return new QAAnswers(documents, summaryWithRefs);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "QAAnswers(documents=" + Arrays.toString((Object[])this.documents) + ", summaryWithRefs=" + this.summaryWithRefs + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-qa-jvm-0.4.32.jar!\ai\grazie\qa\QAAnswers.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */