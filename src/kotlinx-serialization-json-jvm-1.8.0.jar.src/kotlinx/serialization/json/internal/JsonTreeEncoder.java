/*     */ package kotlinx.serialization.json.internal;
/*     */ 
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.json.JsonElement;
/*     */ import kotlinx.serialization.json.JsonObject;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\003\n\002\020%\n\002\020\016\n\002\b\007\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\004\b\022\030\0002\0020\001B#\022\006\020\002\032\0020\003\022\022\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\005¢\006\004\b\b\020\tJ\030\020\017\032\0020\0072\006\020\020\032\0020\f2\006\020\021\032\0020\006H\026J?\020\022\032\0020\007\"\b\b\000\020\023*\0020\0242\006\020\025\032\0020\0262\006\020\027\032\0020\0302\f\020\031\032\b\022\004\022\002H\0230\0322\b\020\033\032\004\030\001H\023H\026¢\006\002\020\034J\b\020\035\032\0020\006H\026R \020\n\032\016\022\004\022\0020\f\022\004\022\0020\0060\013X\004¢\006\b\n\000\032\004\b\r\020\016¨\006\036"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeEncoder;", "Lkotlinx/serialization/json/internal/AbstractJsonTreeEncoder;", "json", "Lkotlinx/serialization/json/Json;", "nodeConsumer", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;)V", "content", "", "", "getContent", "()Ljava/util/Map;", "putElement", "key", "element", "encodeNullableSerializableElement", "T", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "index", "", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "value", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "getCurrent", "kotlinx-serialization-json"})
/*     */ class JsonTreeEncoder
/*     */   extends AbstractJsonTreeEncoder
/*     */ {
/*     */   @NotNull
/*     */   private final Map<String, JsonElement> content;
/*     */   
/*     */   public JsonTreeEncoder(@NotNull Json json, @NotNull Function1 nodeConsumer) {
/* 211 */     super(json, nodeConsumer, (DefaultConstructorMarker)null);
/*     */     
/* 213 */     this.content = new LinkedHashMap<>(); } @NotNull protected final Map<String, JsonElement> getContent() { return this.content; }
/*     */   
/*     */   public void putElement(@NotNull String key, @NotNull JsonElement element) {
/* 216 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(element, "element"); this.content.put(key, element);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <T> void encodeNullableSerializableElement(@NotNull SerialDescriptor descriptor, int index, @NotNull SerializationStrategy serializer, @Nullable Object value) {
/* 225 */     Intrinsics.checkNotNullParameter(descriptor, "descriptor"); Intrinsics.checkNotNullParameter(serializer, "serializer"); if (value != null || this.configuration.getExplicitNulls()) super
/* 226 */         .encodeNullableSerializableElement(descriptor, index, serializer, value); 
/*     */   }
/*     */   @NotNull
/*     */   public JsonElement getCurrent() {
/* 230 */     return (JsonElement)new JsonObject(this.content);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\JsonTreeEncoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */