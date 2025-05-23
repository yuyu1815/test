/*     */ package ai.grazie.text;
/*     */ 
/*     */ @Serializable
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\016\n\002\020\016\n\002\b\002\n\002\020\021\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 22\0020\001:\00212B)\b\021\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\025\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003¢\006\002\020\tJ\t\020\021\032\0020\003HÆ\003J\t\020\022\032\0020\003HÆ\003J\021\020\023\032\0020\0242\006\020\025\032\0020\000H\002J\021\020\023\032\0020\0242\006\020\026\032\0020\003H\002J\035\020\027\032\0020\0002\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\003HÆ\001J\016\020\030\032\0020\0242\006\020\031\032\0020\000J\023\020\032\032\0020\0242\b\020\031\032\004\030\0010\001HÖ\003J\t\020\033\032\0020\003HÖ\001J\016\020\034\032\0020\0002\006\020\031\032\0020\000J\016\020\035\032\0020\0242\006\020\031\032\0020\000J\006\020\036\032\0020\024J\006\020\037\032\0020\024J\016\020 \032\0020\0002\006\020!\032\0020\003J\016\020\"\032\0020#2\006\020$\032\0020#J\031\020%\032\b\022\004\022\0020\0000&2\006\020\031\032\0020\000¢\006\002\020'J\t\020(\032\0020#HÖ\001J&\020)\032\0020*2\006\020+\032\0020\0002\006\020,\032\0020-2\006\020.\032\0020/HÁ\001¢\006\002\b0R\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\f\032\0020\0038F¢\006\006\032\004\b\r\020\013R\021\020\016\032\0020\0038F¢\006\006\032\004\b\017\020\013R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\020\020\013¨\0063"}, d2 = {"Lai/grazie/text/TextRange;", "", "seen1", "", "start", "endExclusive", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(II)V", "getEndExclusive", "()I", "endInclusive", "getEndInclusive", "length", "getLength", "getStart", "component1", "component2", "contains", "", "range", "position", "copy", "covers", "other", "equals", "hashCode", "intersect", "intersects", "isEmpty", "isNotEmpty", "shift", "value", "substring", "", "text", "subtract", "", "(Lai/grazie/text/TextRange;)[Lai/grazie/text/TextRange;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_text", "$serializer", "Companion", "model-text"})
/*     */ @SourceDebugExtension({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nai/grazie/text/TextRange\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,97:1\n3829#2:98\n4344#2,2:99\n37#3:101\n36#3,3:102\n37#3:105\n36#3,3:106\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nai/grazie/text/TextRange\n*L\n63#1:98\n63#1:99,2\n63#1:101\n63#1:102,3\n79#1:105\n79#1:106,3\n*E\n"})
/*     */ public final class TextRange {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final int start;
/*     */   private final int endExclusive;
/*     */   
/*  12 */   public TextRange(int start, int endExclusive) { this.start = start; this.endExclusive = endExclusive; } public final int getStart() { return this.start; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/text/TextRange.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/text/TextRange;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-text"}) public static final class $serializer implements GeneratedSerializer<TextRange> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)IntSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)IntSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public TextRange deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0, j = 0, k = 0; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { j = compositeDecoder.decodeIntElement(serialDescriptor, 0); i |= 0x1; k = compositeDecoder.decodeIntElement(serialDescriptor, 1); i |= 0x2; } else { while (bool) { int m = compositeDecoder.decodeElementIndex(serialDescriptor); switch (m) { case -1: bool = false; continue;case 0: j = compositeDecoder.decodeIntElement(serialDescriptor, 0); i |= 0x1; continue;case 1: k = compositeDecoder.decodeIntElement(serialDescriptor, 1); i |= 0x2; continue; }  throw new UnknownFieldException(m); }  }  compositeDecoder.endStructure(serialDescriptor); return new TextRange(i, j, k, null); } public void serialize(@NotNull Encoder encoder, @NotNull TextRange value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); TextRange.write$Self$model_text(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.text.TextRange", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("start", false); pluginGeneratedSerialDescriptor.addElement("endExclusive", false); descriptor = pluginGeneratedSerialDescriptor; } } public final int getEndExclusive() { return this.endExclusive; }
/*     */    public final int getEndInclusive() {
/*  14 */     return this.endExclusive - 1;
/*     */   }
/*     */   public final int getLength() {
/*  17 */     return this.endExclusive - this.start;
/*     */   }
/*  19 */   public final boolean isEmpty() { return (this.start >= this.endExclusive); }
/*  20 */   public final boolean isNotEmpty() { return !isEmpty(); }
/*     */   @NotNull
/*  22 */   public final TextRange shift(int value) { return new TextRange(this.start + value, this.endExclusive + value); } @NotNull
/*     */   public final String substring(@NotNull String text) {
/*  24 */     Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullExpressionValue(text.substring(this.start, Math.min(this.endExclusive, text.length())), "substring(...)"); return text.substring(this.start, Math.min(this.endExclusive, text.length()));
/*     */   }
/*     */   
/*     */   public final boolean contains(int position) {
/*  28 */     int i = this.start; return (position < this.endExclusive) ? ((i <= position)) : false;
/*     */   }
/*     */ 
/*     */   
/*     */   public final boolean contains(@NotNull TextRange range) {
/*  33 */     Intrinsics.checkNotNullParameter(range, "range"); return (range.start >= this.start && range.endExclusive <= this.endExclusive);
/*     */   }
/*     */   
/*     */   public final boolean intersects(@NotNull TextRange other) {
/*  37 */     Intrinsics.checkNotNullParameter(other, "other"); return (this.endExclusive > other.start && other.endExclusive > this.start);
/*     */   }
/*     */   @NotNull
/*     */   public final TextRange intersect(@NotNull TextRange other) {
/*  41 */     Intrinsics.checkNotNullParameter(other, "other"); return new TextRange(Math.max(this.start, other.start), Math.min(this.endExclusive, other.endExclusive));
/*     */   }
/*     */   
/*     */   public final boolean covers(@NotNull TextRange other) {
/*  45 */     Intrinsics.checkNotNullParameter(other, "other"); return (this.endExclusive >= other.endExclusive && this.start <= other.start);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final TextRange[] subtract(@NotNull TextRange other) {
/*  54 */     Intrinsics.checkNotNullParameter(other, "other"); if (!intersects(other)) { TextRange[] arrayOfTextRange1 = new TextRange[1]; arrayOfTextRange1[0] = this; return arrayOfTextRange1; }
/*     */     
/*  56 */     if (other.isEmpty()) { TextRange[] arrayOfTextRange1 = new TextRange[1]; arrayOfTextRange1[0] = this; return arrayOfTextRange1; }
/*  57 */      if (isEmpty()) { TextRange[] arrayOfTextRange1 = new TextRange[1]; arrayOfTextRange1[0] = this; return arrayOfTextRange1; }
/*     */     
/*  59 */     if (other.contains(this)) return new TextRange[0]; 
/*  60 */     if (contains(other))
/*     */     
/*  62 */     { TextRange[] arrayOfTextRange1 = new TextRange[2]; arrayOfTextRange1[0] = new TextRange(this.start, other.start); arrayOfTextRange1[1] = new TextRange(other.endExclusive, this.endExclusive); arrayOfTextRange1 = arrayOfTextRange1;
/*  63 */       int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  98 */       TextRange[] arrayOfTextRange2 = arrayOfTextRange1; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0; byte b1; int k;
/*  99 */       for (b1 = 0, k = arrayOfTextRange2.length; b1 < k; ) { Object element$iv$iv = arrayOfTextRange2[b1], object1 = element$iv$iv; int $i$a$-filter-TextRange$subtract$1 = 0; if (object1.isNotEmpty()) destination$iv$iv.add(element$iv$iv);  }
/* 100 */        List list = (List)destination$iv$iv;
/*     */       int j = 0;
/* 102 */       Collection collection = list;
/*     */       
/* 104 */       return (TextRange[])collection.toArray((Object[])new TextRange[0]); }  TextRange intersection = intersect(other); if (intersection.isEmpty())
/*     */       return new TextRange[0];  ArrayList<TextRange> result = new ArrayList(); TextRange[] arrayOfTextRange; byte b; int i; for (arrayOfTextRange = subtract(intersection), b = 0, i = arrayOfTextRange.length; b < i; ) { TextRange value = arrayOfTextRange[b]; TextRange previous = (TextRange)CollectionsKt.lastOrNull(result); if (previous == null || previous.endExclusive != value.start) { result.add(value); } else { CollectionsKt.removeLast(result); result.add(new TextRange(previous.start, value.endExclusive)); }  b++; }
/* 106 */      Collection<TextRange> $this$toTypedArray$iv = result; int $i$f$toTypedArray = 0; Collection<TextRange> thisCollection$iv = $this$toTypedArray$iv;
/*     */     
/* 108 */     return thisCollection$iv.<TextRange>toArray(new TextRange[0]);
/*     */   }
/*     */   
/*     */   public final int component1() {
/*     */     return this.start;
/*     */   }
/*     */   
/*     */   public final int component2() {
/*     */     return this.endExclusive;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TextRange copy(int start, int endExclusive) {
/*     */     return new TextRange(start, endExclusive);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "TextRange(start=" + this.start + ", endExclusive=" + this.endExclusive + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = Integer.hashCode(this.start);
/*     */     return result * 31 + Integer.hashCode(this.endExclusive);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof TextRange))
/*     */       return false; 
/*     */     TextRange textRange = (TextRange)other;
/*     */     return (this.start != textRange.start) ? false : (!(this.endExclusive != textRange.endExclusive));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\021\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\033\020\003\032\004\030\0010\0042\f\020\005\032\b\022\004\022\0020\0040\006¢\006\002\020\007J\021\020\b\032\0020\0042\006\020\t\032\0020\nH\002J\017\020\013\032\b\022\004\022\0020\0040\fHÆ\001¨\006\r"}, d2 = {"Lai/grazie/text/TextRange$Companion;", "", "()V", "covering", "Lai/grazie/text/TextRange;", "ranges", "", "([Lai/grazie/text/TextRange;)Lai/grazie/text/TextRange;", "invoke", "range", "Lkotlin/ranges/IntRange;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-text"})
/*     */   @SourceDebugExtension({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nai/grazie/text/TextRange$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<TextRange> serializer() {
/*     */       return (KSerializer<TextRange>)TextRange.$serializer.INSTANCE;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final TextRange invoke(@NotNull IntRange range) {
/*     */       Intrinsics.checkNotNullParameter(range, "range");
/*     */       return new TextRange(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final TextRange covering(@NotNull TextRange[] ranges) {
/*     */       Intrinsics.checkNotNullParameter(ranges, "ranges");
/*     */       if ((ranges.length == 0))
/*     */         return null; 
/*     */       TextRange[] arrayOfTextRange = ranges;
/*     */       if ((arrayOfTextRange.length == 0))
/*     */         throw new NoSuchElementException(); 
/*     */       TextRange textRange1 = arrayOfTextRange[0];
/*     */       int $i$a$-minOf-TextRange$Companion$covering$1 = 0;
/*     */       int j = textRange1.getStart();
/*     */       $i$a$-minOf-TextRange$Companion$covering$1 = 1;
/*     */       int k = ArraysKt.getLastIndex((Object[])arrayOfTextRange);
/*     */       if ($i$a$-minOf-TextRange$Companion$covering$1 <= k)
/*     */         while (true) {
/*     */           TextRange textRange = arrayOfTextRange[$i$a$-minOf-TextRange$Companion$covering$1];
/*     */           int i4 = 0;
/*     */           int i3 = textRange.getStart();
/*     */           if (j > i3)
/*     */             j = i3; 
/*     */           if ($i$a$-minOf-TextRange$Companion$covering$1 != k) {
/*     */             $i$a$-minOf-TextRange$Companion$covering$1++;
/*     */             continue;
/*     */           } 
/*     */           break;
/*     */         }  
/*     */       arrayOfTextRange = ranges;
/*     */       int m = j;
/*     */       if ((arrayOfTextRange.length == 0))
/*     */         throw new NoSuchElementException(); 
/*     */       TextRange it = arrayOfTextRange[0];
/*     */       int $i$a$-maxOf-TextRange$Companion$covering$2 = 0;
/*     */       int i = it.getEndExclusive();
/*     */       $i$a$-maxOf-TextRange$Companion$covering$2 = 1;
/*     */       k = ArraysKt.getLastIndex((Object[])arrayOfTextRange);
/*     */       if ($i$a$-maxOf-TextRange$Companion$covering$2 <= k)
/*     */         while (true) {
/*     */           TextRange textRange = arrayOfTextRange[$i$a$-maxOf-TextRange$Companion$covering$2];
/*     */           int i4 = 0;
/*     */           int i3 = textRange.getEndExclusive();
/*     */           if (i < i3)
/*     */             i = i3; 
/*     */           if ($i$a$-maxOf-TextRange$Companion$covering$2 != k) {
/*     */             $i$a$-maxOf-TextRange$Companion$covering$2++;
/*     */             continue;
/*     */           } 
/*     */           break;
/*     */         }  
/*     */       int n = i, i1 = n, i2 = m;
/*     */       return new TextRange(i2, i1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-text-jvm-0.4.32.jar!\ai\grazie\text\TextRange.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */