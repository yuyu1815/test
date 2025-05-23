/*    */ package ai.grazie.utils;@Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\005\n\002\030\002\n\002\b\r\n\002\020\013\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\b\b\030\000 )2\0020\001:\002()B9\b\021\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003\022\006\020\007\032\0020\003\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB%\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003\022\006\020\007\032\0020\003¢\006\002\020\013J\t\020\021\032\0020\003HÆ\003J\t\020\022\032\0020\003HÆ\003J\t\020\023\032\0020\003HÆ\003J\t\020\024\032\0020\003HÆ\003J1\020\025\032\0020\0002\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0032\b\b\002\020\006\032\0020\0032\b\b\002\020\007\032\0020\003HÆ\001J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\001HÖ\003J\t\020\031\032\0020\003HÖ\001J\006\020\032\032\0020\033J\006\020\034\032\0020\033J\t\020\035\032\0020\033HÖ\001J&\020\036\032\0020\0372\006\020 \032\0020\0002\006\020!\032\0020\"2\006\020#\032\0020$HÁ\001¢\006\002\b%J\024\020&\032\0020\033*\0020\0332\006\020'\032\0020\003H\002R\021\020\007\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\016\020\rR\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\017\020\rR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\020\020\r¨\006*"}, d2 = {"Lai/grazie/utils/Color;", "", "seen1", "", "r", "g", "b", "alpha", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(IIII)V", "getAlpha", "()I", "getB", "getG", "getR", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toAlphaPercent", "", "toHex", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$utils_common", "withLeadingZeroes", "size", "$serializer", "Companion", "utils-common"})
/*    */ public final class Color { @NotNull
/*    */   public static final Companion Companion = new Companion(null); private final int r; private final int g;
/*    */   private final int b;
/*    */   private final int alpha;
/*    */   
/*  8 */   public Color(int r, int g, int b, int alpha) { this.r = r; this.g = g; this.b = b; this.alpha = alpha; } public final int getR() { return this.r; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/utils/Color.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/utils/Color;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "utils-common"}) public static final class $serializer implements GeneratedSerializer<Color> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = (KSerializer)IntSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)IntSerializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)IntSerializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)IntSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public Color deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0, j = 0, k = 0, m = 0, n = 0; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { j = compositeDecoder.decodeIntElement(serialDescriptor, 0); i |= 0x1; k = compositeDecoder.decodeIntElement(serialDescriptor, 1); i |= 0x2; m = compositeDecoder.decodeIntElement(serialDescriptor, 2); i |= 0x4; n = compositeDecoder.decodeIntElement(serialDescriptor, 3); i |= 0x8; } else { while (bool) { int i1 = compositeDecoder.decodeElementIndex(serialDescriptor); switch (i1) { case -1: bool = false; continue;case 0: j = compositeDecoder.decodeIntElement(serialDescriptor, 0); i |= 0x1; continue;case 1: k = compositeDecoder.decodeIntElement(serialDescriptor, 1); i |= 0x2; continue;case 2: m = compositeDecoder.decodeIntElement(serialDescriptor, 2); i |= 0x4; continue;case 3: n = compositeDecoder.decodeIntElement(serialDescriptor, 3); i |= 0x8; continue; }  throw new UnknownFieldException(i1); }  }  compositeDecoder.endStructure(serialDescriptor); return new Color(i, j, k, m, n, null); } public void serialize(@NotNull Encoder encoder, @NotNull Color value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); Color.write$Self$utils_common(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.utils.Color", INSTANCE, 4); pluginGeneratedSerialDescriptor.addElement("r", false); pluginGeneratedSerialDescriptor.addElement("g", false); pluginGeneratedSerialDescriptor.addElement("b", false); pluginGeneratedSerialDescriptor.addElement("alpha", false); descriptor = pluginGeneratedSerialDescriptor; } } public final int getG() { return this.g; } public final int getB() { return this.b; } public final int getAlpha() { return this.alpha; }
/*    */   @NotNull
/* 10 */   public final String toHex() { Intrinsics.checkNotNullExpressionValue(Integer.toString(this.r, CharsKt.checkRadix(16)), "toString(...)"); Intrinsics.checkNotNullExpressionValue(Integer.toString(this.g, CharsKt.checkRadix(16)), "toString(...)"); Intrinsics.checkNotNullExpressionValue(Integer.toString(this.b, CharsKt.checkRadix(16)), "toString(...)"); Intrinsics.checkNotNullExpressionValue(("#" + withLeadingZeroes(Integer.toString(this.r, CharsKt.checkRadix(16)), 2) + withLeadingZeroes(Integer.toString(this.g, CharsKt.checkRadix(16)), 2) + withLeadingZeroes(Integer.toString(this.b, CharsKt.checkRadix(16)), 2)).toUpperCase(Locale.ROOT), "toUpperCase(...)"); return ("#" + withLeadingZeroes(Integer.toString(this.r, CharsKt.checkRadix(16)), 2) + withLeadingZeroes(Integer.toString(this.g, CharsKt.checkRadix(16)), 2) + withLeadingZeroes(Integer.toString(this.b, CharsKt.checkRadix(16)), 2)).toUpperCase(Locale.ROOT); }
/*    */   @NotNull
/* 12 */   public final String toAlphaPercent() { return String.valueOf(this.alpha / 'ÿ'); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001¨\006\t"}, d2 = {"Lai/grazie/utils/Color$Companion;", "", "()V", "ofHex", "Lai/grazie/utils/Color;", "hex", "", "serializer", "Lkotlinx/serialization/KSerializer;", "utils-common"}) @SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nai/grazie/utils/Color$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,25:1\n1#2:26\n1557#3:27\n1628#3,3:28\n*S KotlinDebug\n*F\n+ 1 Color.kt\nai/grazie/utils/Color$Companion\n*L\n18#1:27\n18#1:28,3\n*E\n"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/* 14 */     public final KSerializer<Color> serializer() { return (KSerializer<Color>)Color.$serializer.INSTANCE; } @NotNull
/*    */     public final Color ofHex(@NotNull String hex) {
/* 16 */       Intrinsics.checkNotNullParameter(hex, "hex"); String trimmed = TextKt.dropPrefix(hex, "#");
/* 17 */       if (!((trimmed.length() == 6) ? 1 : 0)) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 26 */         int $i$a$-require-Color$Companion$ofHex$1 = 0; String str = "HEX color string should have 6, not " + trimmed.length() + " symbols"; throw new IllegalArgumentException(str.toString());
/* 27 */       }  Iterable $this$map$iv = StringsKt.chunked(trimmed, 2); int $i$f$map = 0; Iterable iterable1 = $this$map$iv; Collection<Integer> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 28 */       for (Object item$iv$iv : iterable1) {
/* 29 */         String str = (String)item$iv$iv; Collection<Integer> collection = destination$iv$iv; int $i$a$-map-Color$Companion$ofHex$2 = 0; collection.add(Integer.valueOf(Integer.parseInt(str, CharsKt.checkRadix(16))));
/* 30 */       }  List<Number> list = (List)destination$iv$iv;
/*    */       int r = ((Number)list.get(0)).intValue(), g = ((Number)list.get(1)).intValue(), b = ((Number)list.get(2)).intValue();
/*    */       return new Color(r, g, b, 255);
/*    */     } }
/*    */ 
/*    */   
/*    */   private final String withLeadingZeroes(String $this$withLeadingZeroes, int size) {
/*    */     return StringsKt.repeat("0", size - $this$withLeadingZeroes.length()) + StringsKt.repeat("0", size - $this$withLeadingZeroes.length());
/*    */   }
/*    */   
/*    */   public final int component1() {
/*    */     return this.r;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.g;
/*    */   }
/*    */   
/*    */   public final int component3() {
/*    */     return this.b;
/*    */   }
/*    */   
/*    */   public final int component4() {
/*    */     return this.alpha;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Color copy(int r, int g, int b, int alpha) {
/*    */     return new Color(r, g, b, alpha);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Color(r=" + this.r + ", g=" + this.g + ", b=" + this.b + ", alpha=" + this.alpha + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Integer.hashCode(this.r);
/*    */     result = result * 31 + Integer.hashCode(this.g);
/*    */     result = result * 31 + Integer.hashCode(this.b);
/*    */     return result * 31 + Integer.hashCode(this.alpha);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Color))
/*    */       return false; 
/*    */     Color color = (Color)other;
/*    */     return (this.r != color.r) ? false : ((this.g != color.g) ? false : ((this.b != color.b) ? false : (!(this.alpha != color.alpha))));
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\Color.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */