/*    */ package ai.grazie.utils;
/*    */ 
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable(with = Hash.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\006\n\002\020\013\n\002\b\003\n\002\020\016\n\002\b\004\b\b\030\000 \0202\0020\001:\002\020\021B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\007\032\0020\003HÆ\003J\023\020\b\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\001HÖ\003J\t\020\f\032\0020\003HÖ\001J\006\020\r\032\0020\016J\t\020\017\032\0020\016HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\022"}, d2 = {"Lai/grazie/utils/Hash;", "", "hash", "", "(I)V", "getHash", "()I", "component1", "copy", "equals", "", "other", "hashCode", "text", "", "toString", "Companion", "Serializer", "utils-common"})
/*    */ public final class Hash {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final int hash;
/*    */   
/* 12 */   public Hash(int hash) { this.hash = hash; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/utils/Hash$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/Hash;", "utils-common"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<Hash> serializer() { return Hash.Serializer.INSTANCE; } } public final int getHash() { return this.hash; } @NotNull
/* 13 */   public final String text() { Intrinsics.checkNotNullExpressionValue(Integer.toString(this.hash, CharsKt.checkRadix(16)), "toString(...)"); return Integer.toString(this.hash, CharsKt.checkRadix(16)); }
/*    */   public final int component1() { return this.hash; }
/*    */   @NotNull public final Hash copy(int hash) { return new Hash(hash); } @NotNull public String toString() { return "Hash(hash=" + this.hash + ")"; } public int hashCode() { return Integer.hashCode(this.hash); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Hash)) return false;  Hash hash = (Hash)other; return !(this.hash != hash.hash); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\020\020\b\032\0020\0022\006\020\t\032\0020\nH\026J\030\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\002H\026R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007¨\006\020"}, d2 = {"Lai/grazie/utils/Hash$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/Hash;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "utils-common"}) public static final class Serializer implements KSerializer<Hash>
/*    */   {
/* 17 */     @NotNull public Hash deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); return new Hash(decoder.decodeInt()); } @NotNull
/*    */     public static final Serializer INSTANCE = new Serializer(); @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/* 20 */       return SerialDescriptorsKt.PrimitiveSerialDescriptor("Hash", (PrimitiveKind)PrimitiveKind.INT.INSTANCE);
/*    */     }
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull Hash value) {
/* 23 */       Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); encoder.encodeInt(value.getHash());
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\Hash.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */