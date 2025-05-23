/*    */ package ai.grazie.utils.json;
/*    */ 
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.json.JsonObject;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable(with = JSONObject.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\006\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\004\b\007\030\000 \0242\0020\001:\002\024\025B\031\b\026\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005¢\006\002\020\006B\027\b\002\022\006\020\007\032\0020\b\022\006\020\004\032\0020\005¢\006\002\020\tJ\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001H\002J\b\020\021\032\0020\022H\026J\b\020\023\032\0020\bH\026R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\n\020\013R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\r¨\006\026"}, d2 = {"Lai/grazie/utils/json/JSONObject;", "", "jsonObject", "Lkotlinx/serialization/json/JsonObject;", "json", "Lai/grazie/utils/json/JSON;", "(Lkotlinx/serialization/json/JsonObject;Lai/grazie/utils/json/JSON;)V", "content", "", "(Ljava/lang/String;Lai/grazie/utils/json/JSON;)V", "getContent", "()Ljava/lang/String;", "getJson", "()Lai/grazie/utils/json/JSON;", "equals", "", "other", "hashCode", "", "toString", "Companion", "Serializer", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nJSONObject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JSONObject.kt\nai/grazie/utils/json/JSONObject\n+ 2 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,74:1\n28#2:75\n*S KotlinDebug\n*F\n+ 1 JSONObject.kt\nai/grazie/utils/json/JSONObject\n*L\n20#1:75\n*E\n"})
/*    */ public final class JSONObject {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String content;
/*    */   @NotNull
/*    */   private final JSON json;
/*    */   
/* 19 */   private JSONObject(String content, JSON json) { this.content = content; this.json = json; } @NotNull public final String getContent() { return this.content; } @NotNull public final JSON getJson() { return this.json; }
/* 20 */   public JSONObject(@NotNull JsonObject jsonObject, @NotNull JSON json) { this(
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
/* 75 */         this_$iv.string((SerializationStrategy<? super JsonObject>)JsonObject.Companion.serializer(), jsonObject), json); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\033\020\003\032\0020\0042\006\020\005\032\0020\0062\b\b\002\020\007\032\0020\bH\002J\017\020\t\032\b\022\004\022\0020\0040\nHÆ\001¨\006\013"}, d2 = {"Lai/grazie/utils/json/JSONObject$Companion;", "", "()V", "invoke", "Lai/grazie/utils/json/JSONObject;", "content", "", "json", "Lai/grazie/utils/json/JSON;", "serializer", "Lkotlinx/serialization/KSerializer;", "utils-common"}) @SourceDebugExtension({"SMAP\nJSONObject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JSONObject.kt\nai/grazie/utils/json/JSONObject$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<JSONObject> serializer() { return JSONObject.Serializer.INSTANCE; } @NotNull public final JSONObject invoke(@NotNull String content, @NotNull JSON json) { Intrinsics.checkNotNullParameter(content, "content"); Intrinsics.checkNotNullParameter(json, "json"); try { JsonElement jsonElement = json.parseJsonElement(content); if (!(jsonElement instanceof JsonObject)) { int $i$a$-require-JSONObject$Companion$invoke$1 = 0; String str = "Expected JsonObject but actually it was " + Reflection.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName(); throw new IllegalArgumentException(str.toString()); }  } catch (CancellationException e) { throw e; } catch (Throwable e) { throw new IllegalArgumentException("Invalid JSON object received"); }  return new JSONObject(content, json, null); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\020\020\b\032\0020\0022\006\020\t\032\0020\nH\026J\030\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\002H\026R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\020"}, d2 = {"Lai/grazie/utils/json/JSONObject$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/json/JSONObject;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "utils-common"}) @SourceDebugExtension({"SMAP\nJSONObject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JSONObject.kt\nai/grazie/utils/json/JSONObject$Serializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"}) public static final class Serializer implements KSerializer<JSONObject> { @NotNull public static final Serializer INSTANCE = new Serializer(); @NotNull public JSONObject deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); if (!(decoder instanceof JsonDecoder)) { int $i$a$-require-JSONObject$Serializer$deserialize$1 = 0; String str = "This decoder is not a JsonDecoder. Cannot deserialize `JSONObject`."; throw new IllegalArgumentException(str.toString()); }  return JSONObject.Companion.invoke$default(JSONObject.Companion, ((JsonDecoder)decoder).decodeJsonElement().toString(), null, 2, null); } @NotNull private static final SerialDescriptor descriptor = JsonElement.Companion.serializer().getDescriptor(); @NotNull public SerialDescriptor getDescriptor() { return descriptor; } public void serialize(@NotNull Encoder encoder, @NotNull JSONObject value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); if (!(encoder instanceof JsonEncoder)) { int $i$a$-require-JSONObject$Serializer$serialize$1 = 0;
/*    */         String str = "This encoder is not a JsonEncoder. Cannot serialize `JSONObject`.";
/*    */         throw new IllegalArgumentException(str.toString()); }
/*    */       
/*    */       ((JsonEncoder)encoder).encodeJsonElement(value.getJson().parseJsonElement(value.getContent())); }
/*    */      }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (other == null || getClass() != other.getClass())
/*    */       return false; 
/*    */     (JSONObject)other;
/*    */     if (!Intrinsics.areEqual(this.content, ((JSONObject)other).content))
/*    */       return false; 
/*    */     if (!Intrinsics.areEqual(this.json, ((JSONObject)other).json))
/*    */       return false; 
/*    */     return true;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     int result = this.content.hashCode();
/*    */     result = 31 * result + this.json.hashCode();
/*    */     return result;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "JSONObject(content='" + this.content + "', json=" + this.json + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\json\JSONObject.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */