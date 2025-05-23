/*    */ package kotlinx.serialization.cbor;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.SubclassOptInRequired;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.ExperimentalSerializationApi;
/*    */ import kotlinx.serialization.SealedSerializationApi;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @ExperimentalSerializationApi
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\bg\030\0002\0020\001R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005¨\006\006À\006\003"}, d2 = {"Lkotlinx/serialization/cbor/CborDecoder;", "Lkotlinx/serialization/encoding/Decoder;", "cbor", "Lkotlinx/serialization/cbor/Cbor;", "getCbor", "()Lkotlinx/serialization/cbor/Cbor;", "kotlinx-serialization-cbor"})
/*    */ @SubclassOptInRequired(markerClass = {SealedSerializationApi.class})
/*    */ public interface CborDecoder
/*    */   extends Decoder
/*    */ {
/*    */   @NotNull
/*    */   Cbor getCbor();
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls
/*    */   {
/*    */     @Deprecated
/*    */     public static <T> T decodeSerializableValue(@NotNull CborDecoder $this, @NotNull DeserializationStrategy deserializer) {
/* 27 */       Intrinsics.checkNotNullParameter(deserializer, "deserializer"); return (T)$this.decodeSerializableValue(deserializer); } @ExperimentalSerializationApi @Deprecated @Nullable public static <T> T decodeNullableSerializableValue(@NotNull CborDecoder $this, @NotNull DeserializationStrategy deserializer) { Intrinsics.checkNotNullParameter(deserializer, "deserializer"); return (T)$this.decodeNullableSerializableValue(deserializer); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-cbor-jvm-1.8.0.jar!\kotlinx\serialization\cbor\CborDecoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */