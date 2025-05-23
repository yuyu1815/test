/*    */ package ai.grazie.utils.mpp;@Serializable(with = UUID.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\020\022\n\002\b\003\n\002\020\016\n\002\b\007\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\004\b\b\030\000 \0272\0020\001:\002\027\030B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\017\032\0020\003HÆ\003J\023\020\020\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\001HÖ\003J\t\020\024\032\0020\025HÖ\001J\t\020\026\032\0020\nHÖ\001R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\007\020\bR\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\013\020\fR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016¨\006\031"}, d2 = {"Lai/grazie/utils/mpp/UUID;", "", "uuid", "Ljava/util/UUID;", "(Ljava/util/UUID;)V", "bytes", "", "getBytes", "()[B", "text", "", "getText", "()Ljava/lang/String;", "getUuid", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "Serializer", "utils-common"})
/*    */ public final class UUID { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final java.util.UUID uuid;
/*    */   @NotNull
/*    */   private final String text;
/*    */   @NotNull
/*    */   private final byte[] bytes;
/*    */   
/* 11 */   public UUID(@NotNull java.util.UUID uuid) { this.uuid = uuid;
/* 12 */     Intrinsics.checkNotNullExpressionValue(this.uuid.toString(), "uuid.toString()"); this.text = this.uuid.toString();
/* 13 */     ByteBuffer byteBuffer1 = ByteBuffer.wrap(new byte[16]), byteBuffer2 = byteBuffer1; UUID uUID = 
/*    */ 
/*    */       
/* 16 */       this; int $i$a$-also-UUID$bytes$1 = 0; byteBuffer2.putLong(this.uuid.getMostSignificantBits()); byteBuffer2.putLong(this.uuid.getLeastSignificantBits()); Intrinsics.checkNotNullExpressionValue(byteBuffer1.array(), "wrap(ByteArray(16)).also…ficantBits)\n    }.array()"); uUID.bytes = byteBuffer1.array(); } @NotNull public final java.util.UUID getUuid() { return this.uuid; } @NotNull public final String getText() { return this.text; } @NotNull public final byte[] getBytes() { return this.bytes; } @NotNull public final java.util.UUID component1() { return this.uuid; } @NotNull public final UUID copy(@NotNull java.util.UUID uuid) { Intrinsics.checkNotNullParameter(uuid, "uuid"); return new UUID(uuid); } @NotNull public String toString() { return "UUID(uuid=" + this.uuid + ")"; } public int hashCode() { return this.uuid.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof UUID)) return false;  UUID uUID = (UUID)other; return !!Intrinsics.areEqual(this.uuid, uUID.uuid); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\022\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\020\t\n\002\030\002\n\002\020 \n\002\020\005\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\016\020\007\032\0020\0042\006\020\b\032\0020\tJ\006\020\n\032\0020\004J\017\020\013\032\b\022\004\022\0020\0040\fHÆ\001J\032\020\r\032\0020\016*\0020\0172\f\020\005\032\b\022\004\022\0020\0210\020H\002¨\006\022"}, d2 = {"Lai/grazie/utils/mpp/UUID$Companion;", "", "()V", "ofBytes", "Lai/grazie/utils/mpp/UUID;", "bytes", "", "ofText", "text", "", "random", "serializer", "Lkotlinx/serialization/KSerializer;", "of", "", "Lkotlin/Long$Companion;", "", "", "utils-common"}) public static final class Companion
/*    */   {
/* 18 */     @NotNull public final KSerializer<UUID> serializer() { return UUID.Serializer.INSTANCE; } private Companion() {} @NotNull
/*    */     public final UUID random() {
/* 20 */       Intrinsics.checkNotNullExpressionValue(java.util.UUID.randomUUID(), "randomUUID()"); return new UUID(java.util.UUID.randomUUID());
/*    */     }
/*    */     @NotNull
/*    */     public final UUID ofText(@NotNull String text) {
/* 24 */       Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullExpressionValue(java.util.UUID.fromString(text), "fromString(text)"); return new UUID(java.util.UUID.fromString(text));
/*    */     }
/*    */     @NotNull
/*    */     public final UUID ofBytes(@NotNull byte[] bytes) {
/* 28 */       Intrinsics.checkNotNullParameter(bytes, "bytes"); return new UUID(new java.util.UUID(of(LongCompanionObject.INSTANCE, ArraysKt.take(bytes, 8)), of(LongCompanionObject.INSTANCE, CollectionsKt.take(ArraysKt.drop(bytes, 8), 8))));
/*    */     }
/*    */     
/*    */     private final long of(LongCompanionObject $this$of, List bytes) {
/* 32 */       ByteBuffer buffer = ByteBuffer.allocate(8);
/* 33 */       buffer.put(CollectionsKt.toByteArray(bytes));
/* 34 */       buffer.flip();
/*    */       
/* 36 */       return buffer.getLong();
/*    */     } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\020\020\b\032\0020\0022\006\020\t\032\0020\nH\026J\030\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\002H\026R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007¨\006\020"}, d2 = {"Lai/grazie/utils/mpp/UUID$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/mpp/UUID;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "utils-common"})
/*    */   public static final class Serializer implements KSerializer<UUID> { @NotNull
/*    */     public static final Serializer INSTANCE = new Serializer(); @NotNull
/*    */     public UUID deserialize(@NotNull Decoder decoder) {
/* 41 */       Intrinsics.checkNotNullParameter(decoder, "decoder"); return UUID.Companion.ofText(decoder.decodeString());
/*    */     } @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/* 44 */       return SerialDescriptorsKt.PrimitiveSerialDescriptor("UUID", (PrimitiveKind)PrimitiveKind.STRING.INSTANCE);
/*    */     }
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull UUID value) {
/* 47 */       Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); encoder.encodeString(value.getText());
/*    */     } }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\UUID.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */