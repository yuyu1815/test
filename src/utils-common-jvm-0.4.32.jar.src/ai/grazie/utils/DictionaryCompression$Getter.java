/*    */ package ai.grazie.utils;
/*    */ 
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable(with = DictionaryCompression.Getter.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\005\n\002\030\002\n\002\b\005\b\007\030\000 \r*\b\b\001\020\001*\0020\0022\0020\002:\002\r\016B\r\022\006\020\003\032\0020\004¢\006\002\020\005J\033\020\b\032\004\030\0018\0012\f\020\t\032\b\022\004\022\0028\0010\n¢\006\002\020\013J\031\020\f\032\0028\0012\f\020\t\032\b\022\004\022\0028\0010\n¢\006\002\020\013R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\006\020\007¨\006\017"}, d2 = {"Lai/grazie/utils/DictionaryCompression$Getter;", "T", "", "id", "", "(I)V", "getId", "()I", "get", "dictionary", "Lai/grazie/utils/DictionaryCompression;", "(Lai/grazie/utils/DictionaryCompression;)Ljava/lang/Object;", "getOrFail", "Companion", "Serializer", "utils-common"})
/*    */ public final class Getter<T> {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final int id;
/*    */   
/* 12 */   public Getter(int id) { this.id = id; } public final int getId() { return this.id; } @Nullable
/* 13 */   public final T get(@NotNull DictionaryCompression dictionary) { Intrinsics.checkNotNullParameter(dictionary, "dictionary"); return (T)CollectionsKt.getOrNull(DictionaryCompression.access$getValues$p(dictionary), this.id); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J)\020\003\032\016\022\n\022\b\022\004\022\002H\0060\0050\004\"\004\b\002\020\0062\f\020\007\032\b\022\004\022\002H\0060\004HÆ\001¨\006\b"}, d2 = {"Lai/grazie/utils/DictionaryCompression$Getter$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/DictionaryCompression$Getter;", "T0", "typeSerial0", "utils-common"}) public static final class Companion {
/* 14 */     private Companion() {} @NotNull public final <T0> KSerializer<DictionaryCompression.Getter<T0>> serializer(@NotNull KSerializer typeSerial0) { Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0"); return DictionaryCompression.Getter.Serializer.INSTANCE; } } @NotNull public final T getOrFail(@NotNull DictionaryCompression<T> dictionary) { Intrinsics.checkNotNullParameter(dictionary, "dictionary"); if (get(dictionary) == null) { get(dictionary); throw new IllegalStateException(("Can't find " + this.id).toString()); }  return get(dictionary); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÀ\002\030\0002\f\022\b\022\006\022\002\b\0030\0020\001B\007\b\002¢\006\002\020\003J\024\020\b\032\006\022\002\b\0030\0022\006\020\t\032\0020\nH\026J\034\020\013\032\0020\f2\006\020\r\032\0020\0162\n\020\017\032\006\022\002\b\0030\002H\026R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007¨\006\020"}, d2 = {"Lai/grazie/utils/DictionaryCompression$Getter$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/DictionaryCompression$Getter;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "utils-common"})
/*    */   public static final class Serializer implements KSerializer<Getter<?>> { @NotNull
/*    */     public static final Serializer INSTANCE = new Serializer(); @NotNull
/* 17 */     public DictionaryCompression.Getter<?> deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); return new DictionaryCompression.Getter(decoder.decodeInt()); }
/*    */      @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/* 20 */       return SerialDescriptorsKt.PrimitiveSerialDescriptor("Getter", (PrimitiveKind)PrimitiveKind.INT.INSTANCE);
/*    */     }
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull DictionaryCompression.Getter value) {
/* 23 */       Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); encoder.encodeInt(value.getId());
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\DictionaryCompression$Getter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */