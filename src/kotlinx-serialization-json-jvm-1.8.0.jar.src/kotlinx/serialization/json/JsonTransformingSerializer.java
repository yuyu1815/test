/*    */ package kotlinx.serialization.json;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.json.internal.TreeJsonEncoderKt;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\000\n\002\020\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b&\030\000*\b\b\000\020\001*\0020\0022\b\022\004\022\002H\0010\003B\025\022\f\020\004\032\b\022\004\022\0028\0000\003¢\006\004\b\005\020\006J\033\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0028\000¢\006\002\020\020J\023\020\021\032\0028\0002\006\020\022\032\0020\023¢\006\002\020\024J\020\020\025\032\0020\0262\006\020\027\032\0020\026H\024J\020\020\030\032\0020\0262\006\020\027\032\0020\026H\024R\024\020\004\032\b\022\004\022\0028\0000\003X\004¢\006\002\n\000R\024\020\007\032\0020\b8VX\004¢\006\006\032\004\b\t\020\n¨\006\031"}, d2 = {"Lkotlinx/serialization/json/JsonTransformingSerializer;", "T", "", "Lkotlinx/serialization/KSerializer;", "tSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "transformDeserialize", "Lkotlinx/serialization/json/JsonElement;", "element", "transformSerialize", "kotlinx-serialization-json"})
/*    */ public abstract class JsonTransformingSerializer<T>
/*    */   implements KSerializer<T>
/*    */ {
/*    */   @NotNull
/*    */   private final KSerializer<T> tSerializer;
/*    */   
/*    */   public JsonTransformingSerializer(@NotNull KSerializer<T> tSerializer) {
/* 56 */     this.tSerializer = tSerializer;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public SerialDescriptor getDescriptor() {
/* 66 */     return this.tSerializer.getDescriptor();
/*    */   }
/*    */   public final void serialize(@NotNull Encoder encoder, @NotNull Object value) {
/* 69 */     Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); JsonEncoder output = JsonElementSerializersKt.asJsonEncoder(encoder);
/* 70 */     JsonElement element = TreeJsonEncoderKt.writeJson(output.getJson(), value, (SerializationStrategy)this.tSerializer);
/* 71 */     element = transformSerialize(element);
/* 72 */     output.encodeJsonElement(element);
/*    */   }
/*    */   @NotNull
/*    */   public final T deserialize(@NotNull Decoder decoder) {
/* 76 */     Intrinsics.checkNotNullParameter(decoder, "decoder"); JsonDecoder input = JsonElementSerializersKt.asJsonDecoder(decoder);
/* 77 */     JsonElement element = input.decodeJsonElement();
/* 78 */     return input.getJson().decodeFromJsonElement((DeserializationStrategy<? extends T>)this.tSerializer, transformDeserialize(element));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   protected JsonElement transformDeserialize(@NotNull JsonElement element) {
/* 89 */     Intrinsics.checkNotNullParameter(element, "element"); return element;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   protected JsonElement transformSerialize(@NotNull JsonElement element) {
/* 98 */     Intrinsics.checkNotNullParameter(element, "element"); return element;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\JsonTransformingSerializer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */