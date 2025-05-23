/*    */ package ai.grazie.gec.model.request;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020\021\n\002\030\002\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\004\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 (2\0020\001:\002'(B3\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\016\020\006\032\n\022\004\022\0020\b\030\0010\007\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B\035\022\006\020\004\032\0020\005\022\016\b\002\020\006\032\b\022\004\022\0020\b0\007¢\006\002\020\fJ\t\020\022\032\0020\005HÆ\003J\024\020\023\032\b\022\004\022\0020\b0\007HÆ\003¢\006\002\020\016J(\020\024\032\0020\0002\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\007HÆ\001¢\006\002\020\025J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\001H\002J\b\020\031\032\0020\003H\026J\b\020\032\032\004\030\0010\005J\016\020\033\032\0020\0342\006\020\035\032\0020\034J\t\020\036\032\0020\005HÖ\001J&\020\037\032\0020 2\006\020!\032\0020\0002\006\020\"\032\0020#2\006\020$\032\0020%HÁ\001¢\006\002\b&R\031\020\006\032\b\022\004\022\0020\b0\007¢\006\n\n\002\020\017\032\004\b\r\020\016R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\020\020\021¨\006)"}, d2 = {"Lai/grazie/gec/model/request/SentenceWithExclusions;", "", "seen1", "", "sentence", "", "exclusions", "", "Lai/grazie/gec/model/request/Exclusion;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;[Lai/grazie/gec/model/request/Exclusion;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;[Lai/grazie/gec/model/request/Exclusion;)V", "getExclusions", "()[Lai/grazie/gec/model/request/Exclusion;", "[Lai/grazie/gec/model/request/Exclusion;", "getSentence", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;[Lai/grazie/gec/model/request/Exclusion;)Lai/grazie/gec/model/request/SentenceWithExclusions;", "equals", "", "other", "hashCode", "stubExclusions", "stubbedToOriginal", "Lai/grazie/text/TextRange;", "range", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_gec", "$serializer", "Companion", "model-gec"})
/*    */ @SourceDebugExtension({"SMAP\nSentenceWithExclusions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceWithExclusions.kt\nai/grazie/gec/model/request/SentenceWithExclusions\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,45:1\n6560#2:46\n11158#2:47\n11493#2,3:48\n*S KotlinDebug\n*F\n+ 1 SentenceWithExclusions.kt\nai/grazie/gec/model/request/SentenceWithExclusions\n*L\n19#1:46\n28#1:47\n28#1:48,3\n*E\n"})
/*    */ public final class SentenceWithExclusions {
/*    */   @NotNull
/* 11 */   public static final Companion Companion = new Companion(null); @NotNull private final String sentence; @NotNull private final Exclusion[] exclusions; @JvmField
/*    */   @NotNull
/* 13 */   private static final KSerializer<Object>[] $childSerializers; public SentenceWithExclusions(@NotNull String sentence, @NotNull Exclusion[] exclusions) { this.sentence = sentence; this.exclusions = exclusions; } static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(Exclusion.class), (KSerializer)Exclusion.$serializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @NotNull public final String getSentence() { return this.sentence; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/request/SentenceWithExclusions.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/request/SentenceWithExclusions;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"}) public static final class $serializer implements GeneratedSerializer<SentenceWithExclusions> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])SentenceWithExclusions.$childSerializers, arrayOfKSerializer2 = new KSerializer[2]; arrayOfKSerializer2[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[1] = arrayOfKSerializer1[1]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public SentenceWithExclusions deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str = null; Exclusion[] arrayOfExclusion = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])SentenceWithExclusions.$childSerializers; if (compositeDecoder.decodeSequentially()) { str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; arrayOfExclusion = (Exclusion[])compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], arrayOfExclusion); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: arrayOfExclusion = (Exclusion[])compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], arrayOfExclusion); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new SentenceWithExclusions(i, str, arrayOfExclusion, null); } public void serialize(@NotNull Encoder encoder, @NotNull SentenceWithExclusions value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); SentenceWithExclusions.write$Self$model_gec(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gec.model.request.SentenceWithExclusions", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("sentence", false); pluginGeneratedSerialDescriptor.addElement("exclusions", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gec/model/request/SentenceWithExclusions$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/request/SentenceWithExclusions;", "model-gec"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<SentenceWithExclusions> serializer() { return (KSerializer<SentenceWithExclusions>)SentenceWithExclusions.$serializer.INSTANCE; } } @NotNull public final Exclusion[] getExclusions() { return this.exclusions; }
/*    */   
/*    */   @Nullable
/* 16 */   public final String stubExclusions() { if ((this.exclusions.length == 0)) return null;
/*    */     
/* 18 */     StringBuilder stubbed = new StringBuilder(this.sentence);
/* 19 */     Exclusion[] arrayOfExclusion = this.exclusions; int $i$f$sortedByDescending = 0;
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
/* 46 */     for (Exclusion ex : ArraysKt.sortedWith((Object[])arrayOfExclusion, new SentenceWithExclusions$stubExclusions$$inlined$sortedByDescending$1()))
/* 47 */       stubbed.insert(ex.getOffset(), (ex.getKind() == Exclusion.Kind.Unknown) ? 34 : 88);  return stubbed.toString(); } private static final int stubbedToOriginal$toOriginal(SentenceWithExclusions this$0, int offsetInStubbed) { int result = offsetInStubbed; Exclusion[] arrayOfExclusion1 = this$0.exclusions; int $i$f$map = 0; Exclusion[] arrayOfExclusion2 = arrayOfExclusion1; Collection<Integer> destination$iv$iv = new ArrayList(arrayOfExclusion1.length); int $i$f$mapTo = 0; byte b; int i;
/* 48 */     for (b = 0, i = arrayOfExclusion2.length; b < i; ) { Object item$iv$iv = arrayOfExclusion2[b];
/* 49 */       Object object1 = item$iv$iv; Collection<Integer> collection = destination$iv$iv; int $i$a$-map-SentenceWithExclusions$stubbedToOriginal$toOriginal$1 = 0; collection.add(Integer.valueOf(object1.getOffset())); }
/* 50 */      for (Iterator<Number> iterator = CollectionsKt.sorted(destination$iv$iv).iterator(); iterator.hasNext(); ) {
/*    */       int offset = ((Number)iterator.next()).intValue();
/*    */       if (offset < result)
/*    */         result--; 
/*    */     } 
/*    */     return result; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final TextRange stubbedToOriginal(@NotNull TextRange range) {
/*    */     Intrinsics.checkNotNullParameter(range, "range");
/*    */     return new TextRange(stubbedToOriginal$toOriginal(this, range.getStart()), stubbedToOriginal$toOriginal(this, range.getEndExclusive()));
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SentenceWithExclusions))
/*    */       return false; 
/*    */     return (Intrinsics.areEqual(this.sentence, ((SentenceWithExclusions)other).sentence) && Arrays.equals((Object[])this.exclusions, (Object[])((SentenceWithExclusions)other).exclusions));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return 31 * this.sentence.hashCode() + Arrays.hashCode((Object[])this.exclusions);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.sentence;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Exclusion[] component2() {
/*    */     return this.exclusions;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SentenceWithExclusions copy(@NotNull String sentence, @NotNull Exclusion[] exclusions) {
/*    */     Intrinsics.checkNotNullParameter(sentence, "sentence");
/*    */     Intrinsics.checkNotNullParameter(exclusions, "exclusions");
/*    */     return new SentenceWithExclusions(sentence, exclusions);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SentenceWithExclusions(sentence=" + this.sentence + ", exclusions=" + Arrays.toString((Object[])this.exclusions) + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\request\SentenceWithExclusions.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */