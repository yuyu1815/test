/*    */ package ai.grazie.utils.json;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.json.JsonDecoder;
/*    */ import kotlinx.serialization.json.JsonElement;
/*    */ import kotlinx.serialization.json.JsonEncoder;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\020\020\b\032\0020\0022\006\020\t\032\0020\nH\026J\030\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\002H\026R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\020"}, d2 = {"Lai/grazie/utils/json/JSONObject$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/json/JSONObject;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nJSONObject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JSONObject.kt\nai/grazie/utils/json/JSONObject$Serializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/*    */ public final class Serializer
/*    */   implements KSerializer<JSONObject>
/*    */ {
/*    */   @NotNull
/* 38 */   public static final Serializer INSTANCE = new Serializer(); @NotNull private static final SerialDescriptor descriptor = JsonElement.Companion.serializer().getDescriptor(); @NotNull public SerialDescriptor getDescriptor() { return descriptor; }
/*    */   
/*    */   @NotNull
/* 41 */   public JSONObject deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); if (!(decoder instanceof JsonDecoder))
/*    */     
/*    */     { 
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
/* 75 */       int $i$a$-require-JSONObject$Serializer$deserialize$1 = 0; String str = "This decoder is not a JsonDecoder. Cannot deserialize `JSONObject`."; throw new IllegalArgumentException(str.toString()); }  return JSONObject.Companion.invoke$default(JSONObject.Companion, ((JsonDecoder)decoder).decodeJsonElement().toString(), null, 2, null); } public void serialize(@NotNull Encoder encoder, @NotNull JSONObject value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); if (!(encoder instanceof JsonEncoder)) { int $i$a$-require-JSONObject$Serializer$serialize$1 = 0;
/*    */       String str = "This encoder is not a JsonEncoder. Cannot serialize `JSONObject`.";
/*    */       throw new IllegalArgumentException(str.toString()); }
/*    */     
/*    */     ((JsonEncoder)encoder).encodeJsonElement(value.getJson().parseJsonElement(value.getContent())); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\json\JSONObject$Serializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */