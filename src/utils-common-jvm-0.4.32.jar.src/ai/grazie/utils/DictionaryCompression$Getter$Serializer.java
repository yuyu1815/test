/*    */ package ai.grazie.utils;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.PrimitiveKind;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptorsKt;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÀ\002\030\0002\f\022\b\022\006\022\002\b\0030\0020\001B\007\b\002¢\006\002\020\003J\024\020\b\032\006\022\002\b\0030\0022\006\020\t\032\0020\nH\026J\034\020\013\032\0020\f2\006\020\r\032\0020\0162\n\020\017\032\006\022\002\b\0030\002H\026R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007¨\006\020"}, d2 = {"Lai/grazie/utils/DictionaryCompression$Getter$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/DictionaryCompression$Getter;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "utils-common"})
/*    */ public final class Serializer implements KSerializer<DictionaryCompression.Getter<?>> {
/*    */   @NotNull
/*    */   public DictionaryCompression.Getter<?> deserialize(@NotNull Decoder decoder) {
/* 17 */     Intrinsics.checkNotNullParameter(decoder, "decoder"); return new DictionaryCompression.Getter(decoder.decodeInt()); } @NotNull
/*    */   public static final Serializer INSTANCE = new Serializer(); @NotNull
/*    */   public SerialDescriptor getDescriptor() {
/* 20 */     return SerialDescriptorsKt.PrimitiveSerialDescriptor("Getter", (PrimitiveKind)PrimitiveKind.INT.INSTANCE);
/*    */   }
/*    */   public void serialize(@NotNull Encoder encoder, @NotNull DictionaryCompression.Getter value) {
/* 23 */     Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); encoder.encodeInt(value.getId());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\DictionaryCompression$Getter$Serializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */