/*     */ package kotlinx.serialization.cbor.internal;
/*     */ 
/*     */ import kotlin.ULongArray;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\t\n\002\030\002\n\002\b\006\n\002\020\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\004\n\002\020\006\n\000\n\002\020\007\n\002\b\002\n\002\020\005\n\000\n\002\020\n\n\000\n\002\020\f\n\002\b\002\n\002\020\t\n\000\n\002\020\001\n\002\b\b\b\020\030\0002\0020\0012\0020\002B\027\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006¢\006\004\b\007\020\bJ\020\020\"\032\0020#2\006\020\017\032\0020\016H\004J\031\020(\032\0020#2\b\020)\032\004\030\0010\034H\024¢\006\004\b*\020 J\020\020+\032\0020,2\006\020-\032\0020.H\026J\020\020/\032\0020#2\006\020-\032\0020.H\026J\020\0200\032\0020\0162\006\020-\032\0020.H\026J\036\0201\032\020\022\004\022\00203\022\006\022\004\030\0010\034022\006\020-\032\0020.H\002J \0204\032\022\022\006\022\004\030\00103\022\006\022\004\030\0010\034022\006\020-\032\0020.H\002J!\0205\032\002H6\"\004\b\000\02062\f\0207\032\b\022\004\022\002H608H\026¢\006\002\0209J\b\020:\032\00203H\026J\b\020;\032\0020\022H\026J\b\020<\032\0020=H\026J\b\020>\032\0020?H\026J\b\020@\032\0020\022H\026J\b\020A\032\0020BH\026J\b\020C\032\0020DH\026J\b\020E\032\0020FH\026J\b\020G\032\0020\016H\026J\b\020H\032\0020IH\026J\n\020J\032\004\030\0010KH\026J\020\020L\032\0020\0162\006\020M\032\0020.H\026J\b\020N\032\0020\022H\002J)\020O\032\0020#2\006\020-\032\0020.2\006\020P\032\0020\0162\b\020\033\032\004\030\0010\034H\002¢\006\004\bQ\020RR\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\t\020\nR\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\013\020\fR\036\020\017\032\0020\0162\006\020\r\032\0020\016@BX\016¢\006\b\n\000\032\004\b\020\020\021R\036\020\023\032\0020\0222\006\020\r\032\0020\022@BX\016¢\006\b\n\000\032\004\b\024\020\025R\016\020\026\032\0020\016X\016¢\006\002\n\000R\032\020\027\032\0020\022X\016¢\006\016\n\000\032\004\b\030\020\025\"\004\b\031\020\032R\036\020\033\032\004\030\0010\034X\016¢\006\020\n\002\020!\032\004\b\035\020\036\"\004\b\037\020 R\024\020$\032\0020%8VX\004¢\006\006\032\004\b&\020'¨\006S"}, d2 = {"Lkotlinx/serialization/cbor/internal/CborReader;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "Lkotlinx/serialization/cbor/CborDecoder;", "cbor", "Lkotlinx/serialization/cbor/Cbor;", "parser", "Lkotlinx/serialization/cbor/internal/CborParser;", "<init>", "(Lkotlinx/serialization/cbor/Cbor;Lkotlinx/serialization/cbor/internal/CborParser;)V", "getCbor", "()Lkotlinx/serialization/cbor/Cbor;", "getParser", "()Lkotlinx/serialization/cbor/internal/CborParser;", "value", "", "size", "getSize", "()I", "", "finiteMode", "getFiniteMode", "()Z", "readProperties", "decodeByteArrayAsByteString", "getDecodeByteArrayAsByteString", "setDecodeByteArrayAsByteString", "(Z)V", "tags", "Lkotlin/ULongArray;", "getTags-2g2roS4", "()[J", "setTags-uLth9ew", "([J)V", "[J", "setSize", "", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "skipBeginToken", "objectTags", "skipBeginToken-uLth9ew", "beginStructure", "Lkotlinx/serialization/encoding/CompositeDecoder;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "endStructure", "decodeElementIndex", "decodeElementNameWithTags", "Lkotlin/Pair;", "", "decodeElementNameWithTagsLenient", "decodeSerializableValue", "T", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "decodeString", "decodeNotNullMark", "decodeDouble", "", "decodeFloat", "", "decodeBoolean", "decodeByte", "", "decodeShort", "", "decodeChar", "", "decodeInt", "decodeLong", "", "decodeNull", "", "decodeEnum", "enumDescriptor", "isDone", "verifyKeyTags", "index", "verifyKeyTags-rjbGhUI", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I[J)V", "kotlinx-serialization-cbor"})
/*     */ @SourceDebugExtension({"SMAP\nDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Decoder.kt\nkotlinx/serialization/cbor/internal/CborReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,621:1\n1#2:622\n*E\n"})
/*     */ public class CborReader extends AbstractDecoder implements CborDecoder {
/*     */   @NotNull
/*     */   private final Cbor cbor;
/*     */   @NotNull
/*     */   private final CborParser parser;
/*     */   private int size;
/*     */   
/*  15 */   public CborReader(@NotNull Cbor cbor, @NotNull CborParser parser) { this.cbor = cbor; this.parser = parser;
/*     */ 
/*     */     
/*  18 */     this.size = -1; } private boolean finiteMode; private int readProperties; private boolean decodeByteArrayAsByteString; @Nullable private long[] tags; @NotNull public Cbor getCbor() { return this.cbor; } @NotNull protected final CborParser getParser() { return this.parser; } protected final int getSize() { return this.size; }
/*     */    protected final boolean getFiniteMode() {
/*  20 */     return this.finiteMode;
/*     */   }
/*     */   
/*     */   protected final boolean getDecodeByteArrayAsByteString() {
/*  24 */     return this.decodeByteArrayAsByteString; } protected final void setDecodeByteArrayAsByteString(boolean <set-?>) { this.decodeByteArrayAsByteString = <set-?>; } @Nullable
/*  25 */   protected final long[] getTags-2g2roS4() { return this.tags; } protected final void setTags-uLth9ew(@Nullable long[] <set-?>) { this.tags = <set-?>; }
/*     */   
/*     */   protected final void setSize(int size) {
/*  28 */     if (size >= 0) {
/*  29 */       this.finiteMode = true;
/*  30 */       this.size = size;
/*     */     } 
/*     */   }
/*     */   @NotNull
/*     */   public SerializersModule getSerializersModule() {
/*  35 */     return getCbor().getSerializersModule();
/*     */   } protected void skipBeginToken-uLth9ew(@Nullable long[] objectTags) {
/*  37 */     setSize(this.parser.startMap-uLth9ew(objectTags));
/*     */   }
/*     */   
/*     */   @NotNull
/*  41 */   public CompositeDecoder beginStructure(@NotNull SerialDescriptor descriptor) { Intrinsics.checkNotNullParameter(descriptor, "descriptor");
/*     */     
/*  43 */     SerialKind serialKind = descriptor.getKind();
/*  44 */     CborReader re = EncodingKt.hasArrayTag(descriptor) ? new CborListReader(getCbor(), this.parser) : ((Intrinsics.areEqual(serialKind, StructureKind.LIST.INSTANCE) || serialKind instanceof kotlinx.serialization.descriptors.PolymorphicKind) ? new CborListReader(getCbor(), this.parser) : (
/*  45 */       Intrinsics.areEqual(serialKind, StructureKind.MAP.INSTANCE) ? new CborMapReader(getCbor(), this.parser) : 
/*  46 */       new CborReader(getCbor(), this.parser)));
/*     */     
/*  48 */     long[] objectTags = getCbor().getConfiguration().getVerifyObjectTags() ? EncodingKt.getObjectTags(descriptor) : null;
/*  49 */     long[] arrayOfLong1 = this.tags;
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
/* 622 */     CborReader cborReader1 = re; int $i$a$-let-CborReader$beginStructure$1 = 0; LongSpreadBuilder longSpreadBuilder = new LongSpreadBuilder(2); longSpreadBuilder.addSpread(arrayOfLong1); longSpreadBuilder.addSpread(objectTags); re.skipBeginToken-uLth9ew((this.tags != null) ? ((objectTags == null) ? arrayOfLong1 : longSpreadBuilder.toArray()) : objectTags); return (CompositeDecoder)re; } public int decodeElementIndex(@NotNull SerialDescriptor descriptor) { long[] arrayOfLong1; Intrinsics.checkNotNullParameter(descriptor, "descriptor"); int knownIndex = 0; while (true) { if (isDone()) return -1;  Pair<String, ULongArray> pair1 = decodeElementNameWithTagsLenient(descriptor); String str1 = (String)pair1.component1(); (ULongArray)pair1.component2(); arrayOfLong1 = ((ULongArray)pair1.component2() != null) ? ((ULongArray)pair1.component2()).unbox-impl() : null; int k = this.readProperties; this.readProperties = k + 1; String it = str1; int $i$a$-let-CborReader$decodeElementIndex$index$index$1 = 0;
/*     */       j = (str1 != null) ? descriptor.getElementIndex(it) : -3;
/*     */       if (j == -3) {
/*     */         this.parser.skipElement-uLth9ew(arrayOfLong1);
/*     */         continue;
/*     */       } 
/*     */       break; }
/*     */     
/*     */     verifyKeyTags-rjbGhUI(descriptor, j, arrayOfLong1);
/*     */     knownIndex = j;
/*     */     if (isDone())
/*     */       return -1; 
/*     */     Pair<String, ULongArray> pair = decodeElementNameWithTags(descriptor);
/*     */     String elemName = (String)pair.component1();
/*     */     (ULongArray)pair.component2();
/*     */     long[] tags = ((ULongArray)pair.component2() != null) ? ((ULongArray)pair.component2()).unbox-impl() : null;
/*     */     int i = this.readProperties;
/*     */     this.readProperties = i + 1;
/*     */     int j = i = DecoderKt.access$getElementIndexOrThrow(descriptor, elemName), $i$a$-also-CborReader$decodeElementIndex$index$1 = 0;
/*     */     verifyKeyTags-rjbGhUI(descriptor, j, tags);
/*     */     int index = getCbor().getConfiguration().getIgnoreUnknownKeys() ? knownIndex : i;
/*     */     this.decodeByteArrayAsByteString = EncodingKt.isByteString(descriptor, index);
/*     */     this.tags = getCbor().getConfiguration().getVerifyValueTags() ? EncodingKt.getValueTags(descriptor, index) : null;
/*     */     return index; }
/*     */ 
/*     */   
/*     */   public void endStructure(@NotNull SerialDescriptor descriptor) {
/*     */     Intrinsics.checkNotNullParameter(descriptor, "descriptor");
/*     */     if (!this.finiteMode)
/*     */       this.parser.end(); 
/*     */   }
/*     */   
/*     */   private final Pair<String, ULongArray> decodeElementNameWithTags(SerialDescriptor descriptor) {
/*     */     Triple<String, Long, ULongArray> triple = this.parser.nextTaggedStringOrNumber();
/*     */     String elemName = (String)triple.component1();
/*     */     Long cborLabel = (Long)triple.component2();
/*     */     (ULongArray)triple.component3();
/*     */     long[] tags = ((ULongArray)triple.component3() != null) ? ((ULongArray)triple.component3()).unbox-impl() : null;
/*     */     if (elemName == null && cborLabel != null)
/*     */       if (DecoderKt.access$getElementNameForCborLabel(descriptor, cborLabel.longValue()) == null) {
/*     */         DecoderKt.access$getElementNameForCborLabel(descriptor, cborLabel.longValue());
/*     */         throw new CborDecodingException("CborLabel unknown: " + cborLabel + " for " + descriptor);
/*     */       }  
/*     */     if (elemName == null)
/*     */       throw new CborDecodingException("Expected (tagged) string or number, got nothing for " + descriptor); 
/*     */     return TuplesKt.to(elemName, (tags != null) ? ULongArray.box-impl(tags) : null);
/*     */   }
/*     */   
/*     */   private final Pair<String, ULongArray> decodeElementNameWithTagsLenient(SerialDescriptor descriptor) {
/*     */     Triple<String, Long, ULongArray> triple = this.parser.nextTaggedStringOrNumber();
/*     */     String elemName = (String)triple.component1();
/*     */     Long cborLabel = (Long)triple.component2();
/*     */     (ULongArray)triple.component3();
/*     */     long[] tags = ((ULongArray)triple.component3() != null) ? ((ULongArray)triple.component3()).unbox-impl() : null;
/*     */     if (elemName == null && cborLabel != null)
/*     */       elemName = DecoderKt.access$getElementNameForCborLabel(descriptor, cborLabel.longValue()); 
/*     */     return TuplesKt.to(elemName, (tags != null) ? ULongArray.box-impl(tags) : null);
/*     */   }
/*     */   
/*     */   public <T> T decodeSerializableValue(@NotNull DeserializationStrategy deserializer) {
/*     */     Intrinsics.checkNotNullParameter(deserializer, "deserializer");
/*     */     this.decodeByteArrayAsByteString = (this.decodeByteArrayAsByteString || EncodingKt.isInlineByteString(deserializer.getDescriptor()));
/*     */     return ((this.decodeByteArrayAsByteString || getCbor().getConfiguration().getAlwaysUseByteString()) && Intrinsics.areEqual(deserializer.getDescriptor(), BuiltinSerializersKt.ByteArraySerializer().getDescriptor())) ? (T)this.parser.nextByteString-uLth9ew(this.tags) : (T)super.decodeSerializableValue(deserializer);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String decodeString() {
/*     */     return this.parser.nextString-uLth9ew(this.tags);
/*     */   }
/*     */   
/*     */   public boolean decodeNotNullMark() {
/*     */     return !this.parser.isNull();
/*     */   }
/*     */   
/*     */   public double decodeDouble() {
/*     */     return this.parser.nextDouble-uLth9ew(this.tags);
/*     */   }
/*     */   
/*     */   public float decodeFloat() {
/*     */     return this.parser.nextFloat-uLth9ew(this.tags);
/*     */   }
/*     */   
/*     */   public boolean decodeBoolean() {
/*     */     return this.parser.nextBoolean-uLth9ew(this.tags);
/*     */   }
/*     */   
/*     */   public byte decodeByte() {
/*     */     return (byte)(int)this.parser.nextNumber-uLth9ew(this.tags);
/*     */   }
/*     */   
/*     */   public short decodeShort() {
/*     */     return (short)(int)this.parser.nextNumber-uLth9ew(this.tags);
/*     */   }
/*     */   
/*     */   public char decodeChar() {
/*     */     return (char)(int)this.parser.nextNumber-uLth9ew(this.tags);
/*     */   }
/*     */   
/*     */   public int decodeInt() {
/*     */     return (int)this.parser.nextNumber-uLth9ew(this.tags);
/*     */   }
/*     */   
/*     */   public long decodeLong() {
/*     */     return this.parser.nextNumber-uLth9ew(this.tags);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Void decodeNull() {
/*     */     return this.parser.nextNull-uLth9ew(this.tags);
/*     */   }
/*     */   
/*     */   public int decodeEnum(@NotNull SerialDescriptor enumDescriptor) {
/*     */     Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
/*     */     return DecoderKt.access$getElementIndexOrThrow(enumDescriptor, this.parser.nextString-uLth9ew(this.tags));
/*     */   }
/*     */   
/*     */   private final boolean isDone() {
/*     */     return ((!this.finiteMode && this.parser.isEnd()) || (this.finiteMode && this.readProperties >= this.size));
/*     */   }
/*     */   
/*     */   private final void verifyKeyTags-rjbGhUI(SerialDescriptor descriptor, int index, long[] tags) {
/*     */     if (getCbor().getConfiguration().getVerifyKeyTags()) {
/*     */       long[] keyTags = EncodingKt.getKeyTags(descriptor, index);
/*     */       int $i$a$-let-CborReader$verifyKeyTags$1 = 0;
/*     */       this.parser.verifyTagsAndThrow-EOCRwWE$kotlinx_serialization_cbor(keyTags, tags);
/*     */       EncodingKt.getKeyTags(descriptor, index);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-cbor-jvm-1.8.0.jar!\kotlinx\serialization\cbor\internal\CborReader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */