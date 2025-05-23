/*    */ package kotlinx.serialization.json;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\bg\030\0002\0020\0012\0020\002J\020\020\007\032\0020\b2\006\020\t\032\0020\nH&R\022\020\003\032\0020\004X¦\004¢\006\006\032\004\b\005\020\006¨\006\013À\006\003"}, d2 = {"Lkotlinx/serialization/json/JsonEncoder;", "Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "encodeJsonElement", "", "element", "Lkotlinx/serialization/json/JsonElement;", "kotlinx-serialization-json"})
/*    */ @SubclassOptInRequired(markerClass = {SealedSerializationApi.class})
/*    */ public interface JsonEncoder
/*    */   extends Encoder, CompositeEncoder
/*    */ {
/*    */   @NotNull
/*    */   Json getJson();
/*    */   
/*    */   void encodeJsonElement(@NotNull JsonElement paramJsonElement);
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls
/*    */   {
/*    */     @ExperimentalSerializationApi
/*    */     @Deprecated
/*    */     public static void encodeNotNullMark(@NotNull JsonEncoder $this) {
/* 53 */       $this.encodeNotNullMark(); } @Deprecated @NotNull public static CompositeEncoder beginCollection(@NotNull JsonEncoder $this, @NotNull SerialDescriptor descriptor, int collectionSize) { Intrinsics.checkNotNullParameter(descriptor, "descriptor"); return $this.beginCollection(descriptor, collectionSize); } @Deprecated public static <T> void encodeSerializableValue(@NotNull JsonEncoder $this, @NotNull SerializationStrategy serializer, Object value) { Intrinsics.checkNotNullParameter(serializer, "serializer"); $this.encodeSerializableValue(serializer, value); } @ExperimentalSerializationApi @Deprecated public static <T> void encodeNullableSerializableValue(@NotNull JsonEncoder $this, @NotNull SerializationStrategy serializer, @Nullable Object value) { Intrinsics.checkNotNullParameter(serializer, "serializer"); $this.encodeNullableSerializableValue(serializer, value); } @ExperimentalSerializationApi @Deprecated public static boolean shouldEncodeElementDefault(@NotNull JsonEncoder $this, @NotNull SerialDescriptor descriptor, int index) { Intrinsics.checkNotNullParameter(descriptor, "descriptor"); return $this.shouldEncodeElementDefault(descriptor, index); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\JsonEncoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */