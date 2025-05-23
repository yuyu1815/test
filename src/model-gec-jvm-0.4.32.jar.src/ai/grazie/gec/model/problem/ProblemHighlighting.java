/*    */ package ai.grazie.gec.model.problem;
/*    */ import ai.grazie.text.TextRange;
/*    */ import java.util.Arrays;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\021\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\013\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B9\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\016\020\007\032\n\022\004\022\0020\006\030\0010\005\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB#\022\f\020\004\032\b\022\004\022\0020\0060\005\022\016\b\002\020\007\032\b\022\004\022\0020\0060\005¢\006\002\020\013J\024\020\020\032\b\022\004\022\0020\0060\005HÆ\003¢\006\002\020\rJ\024\020\021\032\b\022\004\022\0020\0060\005HÆ\003¢\006\002\020\rJ.\020\022\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\016\b\002\020\007\032\b\022\004\022\0020\0060\005HÆ\001¢\006\002\020\023J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\001H\002J\b\020\027\032\0020\003H\026J\t\020\030\032\0020\031HÖ\001J&\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 HÁ\001¢\006\002\b!R\031\020\004\032\b\022\004\022\0020\0060\005¢\006\n\n\002\020\016\032\004\b\f\020\rR\031\020\007\032\b\022\004\022\0020\0060\005¢\006\n\n\002\020\016\032\004\b\017\020\r¨\006$"}, d2 = {"Lai/grazie/gec/model/problem/ProblemHighlighting;", "", "seen1", "", "always", "", "Lai/grazie/text/TextRange;", "onHover", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(I[Lai/grazie/text/TextRange;[Lai/grazie/text/TextRange;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "([Lai/grazie/text/TextRange;[Lai/grazie/text/TextRange;)V", "getAlways", "()[Lai/grazie/text/TextRange;", "[Lai/grazie/text/TextRange;", "getOnHover", "component1", "component2", "copy", "([Lai/grazie/text/TextRange;[Lai/grazie/text/TextRange;)Lai/grazie/gec/model/problem/ProblemHighlighting;", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_gec", "$serializer", "Companion", "model-gec"})
/*    */ public final class ProblemHighlighting {
/*    */   @NotNull
/* 14 */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull private final TextRange[] always; @NotNull private final TextRange[] onHover; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(TextRange.class), (KSerializer)TextRange$.serializer.INSTANCE);
/*    */     arrayOfKSerializer[1] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(TextRange.class), (KSerializer)TextRange$.serializer.INSTANCE);
/* 17 */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } public ProblemHighlighting(@NotNull TextRange[] always, @NotNull TextRange[] onHover) { this.always = always;
/* 18 */     this.onHover = onHover; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/problem/ProblemHighlighting.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/problem/ProblemHighlighting;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"}) public static final class $serializer implements GeneratedSerializer<ProblemHighlighting> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])ProblemHighlighting.$childSerializers, arrayOfKSerializer2 = new KSerializer[2]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = arrayOfKSerializer1[1]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public ProblemHighlighting deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; TextRange[] arrayOfTextRange1 = null, arrayOfTextRange2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])ProblemHighlighting.$childSerializers; if (compositeDecoder.decodeSequentially()) { arrayOfTextRange1 = (TextRange[])compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], arrayOfTextRange1); i |= 0x1; arrayOfTextRange2 = (TextRange[])compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], arrayOfTextRange2); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: arrayOfTextRange1 = (TextRange[])compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], arrayOfTextRange1); i |= 0x1; continue;case 1: arrayOfTextRange2 = (TextRange[])compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], arrayOfTextRange2); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new ProblemHighlighting(i, arrayOfTextRange1, arrayOfTextRange2, null); } public void serialize(@NotNull Encoder encoder, @NotNull ProblemHighlighting value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); ProblemHighlighting.write$Self$model_gec(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gec.model.problem.ProblemHighlighting", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("always", false); pluginGeneratedSerialDescriptor.addElement("onHover", true); descriptor = pluginGeneratedSerialDescriptor; } } @NotNull public final TextRange[] getOnHover() { return this.onHover; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gec/model/problem/ProblemHighlighting$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/problem/ProblemHighlighting;", "model-gec"}) public static final class Companion {
/*    */     private Companion() {} @NotNull public final KSerializer<ProblemHighlighting> serializer() { return (KSerializer<ProblemHighlighting>)ProblemHighlighting.$serializer.INSTANCE; } }
/*    */   @NotNull
/*    */   public final TextRange[] getAlways() { return this.always; }
/* 22 */   public boolean equals(@Nullable Object other) { if (this == other) return true; 
/* 23 */     if (other == null || getClass() != other.getClass()) return false;
/*    */     
/* 25 */     (ProblemHighlighting)other;
/*    */     
/* 27 */     if (!Arrays.equals((Object[])this.always, (Object[])((ProblemHighlighting)other).always)) return false; 
/* 28 */     return Arrays.equals((Object[])this.onHover, (Object[])((ProblemHighlighting)other).onHover); }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 32 */     int result = Arrays.hashCode((Object[])this.always);
/* 33 */     result = 31 * result + Arrays.hashCode((Object[])this.onHover);
/* 34 */     return result;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TextRange[] component1() {
/*    */     return this.always;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TextRange[] component2() {
/*    */     return this.onHover;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ProblemHighlighting copy(@NotNull TextRange[] always, @NotNull TextRange[] onHover) {
/*    */     Intrinsics.checkNotNullParameter(always, "always");
/*    */     Intrinsics.checkNotNullParameter(onHover, "onHover");
/*    */     return new ProblemHighlighting(always, onHover);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ProblemHighlighting(always=" + Arrays.toString((Object[])this.always) + ", onHover=" + Arrays.toString((Object[])this.onHover) + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\problem\ProblemHighlighting.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */