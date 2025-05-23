/*    */ package kotlinx.serialization.cbor;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.SubclassOptInRequired;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.ExperimentalSerializationApi;
/*    */ import kotlinx.serialization.SealedSerializationApi;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @ExperimentalSerializationApi
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\bg\030\0002\0020\001R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005¨\006\006À\006\003"}, d2 = {"Lkotlinx/serialization/cbor/CborEncoder;", "Lkotlinx/serialization/encoding/Encoder;", "cbor", "Lkotlinx/serialization/cbor/Cbor;", "getCbor", "()Lkotlinx/serialization/cbor/Cbor;", "kotlinx-serialization-cbor"})
/*    */ @SubclassOptInRequired(markerClass = {SealedSerializationApi.class})
/*    */ public interface CborEncoder extends Encoder {
/*    */   @NotNull
/*    */   Cbor getCbor();
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls {
/*    */     @ExperimentalSerializationApi
/*    */     @Deprecated
/*    */     public static void encodeNotNullMark(@NotNull CborEncoder $this) {
/* 27 */       $this.encodeNotNullMark(); } @Deprecated @NotNull public static CompositeEncoder beginCollection(@NotNull CborEncoder $this, @NotNull SerialDescriptor descriptor, int collectionSize) { Intrinsics.checkNotNullParameter(descriptor, "descriptor"); return $this.beginCollection(descriptor, collectionSize); } @Deprecated public static <T> void encodeSerializableValue(@NotNull CborEncoder $this, @NotNull SerializationStrategy serializer, Object value) { Intrinsics.checkNotNullParameter(serializer, "serializer"); $this.encodeSerializableValue(serializer, value); } @ExperimentalSerializationApi @Deprecated public static <T> void encodeNullableSerializableValue(@NotNull CborEncoder $this, @NotNull SerializationStrategy serializer, @Nullable Object value) { Intrinsics.checkNotNullParameter(serializer, "serializer"); $this.encodeNullableSerializableValue(serializer, value); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-cbor-jvm-1.8.0.jar!\kotlinx\serialization\cbor\CborEncoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */