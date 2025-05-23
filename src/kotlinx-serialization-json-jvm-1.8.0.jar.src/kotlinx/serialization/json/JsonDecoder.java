/*    */ package kotlinx.serialization.json;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.SubclassOptInRequired;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.ExperimentalSerializationApi;
/*    */ import kotlinx.serialization.SealedSerializationApi;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\bg\030\0002\0020\0012\0020\002J\b\020\007\032\0020\bH&R\022\020\003\032\0020\004X¦\004¢\006\006\032\004\b\005\020\006¨\006\tÀ\006\003"}, d2 = {"Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "decodeJsonElement", "Lkotlinx/serialization/json/JsonElement;", "kotlinx-serialization-json"})
/*    */ @SubclassOptInRequired(markerClass = {SealedSerializationApi.class})
/*    */ public interface JsonDecoder
/*    */   extends Decoder, CompositeDecoder
/*    */ {
/*    */   @NotNull
/*    */   Json getJson();
/*    */   
/*    */   @NotNull
/*    */   JsonElement decodeJsonElement();
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls
/*    */   {
/*    */     @Deprecated
/*    */     public static <T> T decodeSerializableValue(@NotNull JsonDecoder $this, @NotNull DeserializationStrategy deserializer) {
/* 54 */       Intrinsics.checkNotNullParameter(deserializer, "deserializer"); return (T)$this.decodeSerializableValue(deserializer); } @ExperimentalSerializationApi @Deprecated @Nullable public static <T> T decodeNullableSerializableValue(@NotNull JsonDecoder $this, @NotNull DeserializationStrategy deserializer) { Intrinsics.checkNotNullParameter(deserializer, "deserializer"); return (T)$this.decodeNullableSerializableValue(deserializer); } @ExperimentalSerializationApi @Deprecated public static boolean decodeSequentially(@NotNull JsonDecoder $this) { return $this.decodeSequentially(); } @Deprecated public static int decodeCollectionSize(@NotNull JsonDecoder $this, @NotNull SerialDescriptor descriptor) { Intrinsics.checkNotNullParameter(descriptor, "descriptor"); return $this.decodeCollectionSize(descriptor); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\JsonDecoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */