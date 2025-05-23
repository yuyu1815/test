/*     */ package kotlinx.serialization.json.internal;
/*     */ 
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.json.JsonElement;
/*     */ import kotlinx.serialization.json.JsonElementKt;
/*     */ import kotlinx.serialization.json.JsonObject;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020 \n\002\020\016\n\000\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\002\n\000\b\002\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\030\020\020\032\0020\f2\006\020\021\032\0020\0222\006\020\023\032\0020\016H\024J\020\020\024\032\0020\0162\006\020\021\032\0020\022H\026J\020\020\025\032\0020\0262\006\020\027\032\0020\fH\024J\020\020\030\032\0020\0312\006\020\021\032\0020\022H\026R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\b\020\tR\024\020\n\032\b\022\004\022\0020\f0\013X\004¢\006\002\n\000R\016\020\r\032\0020\016X\004¢\006\002\n\000R\016\020\017\032\0020\016X\016¢\006\002\n\000¨\006\032"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeMapDecoder;", "Lkotlinx/serialization/json/internal/JsonTreeDecoder;", "json", "Lkotlinx/serialization/json/Json;", "value", "Lkotlinx/serialization/json/JsonObject;", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonObject;)V", "getValue", "()Lkotlinx/serialization/json/JsonObject;", "keys", "", "", "size", "", "position", "elementName", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "index", "decodeElementIndex", "currentElement", "Lkotlinx/serialization/json/JsonElement;", "tag", "endStructure", "", "kotlinx-serialization-json"})
/*     */ final class JsonTreeMapDecoder
/*     */   extends JsonTreeDecoder
/*     */ {
/*     */   @NotNull
/*     */   private final JsonObject value;
/*     */   @NotNull
/*     */   private final List<String> keys;
/*     */   private final int size;
/*     */   private int position;
/*     */   
/*     */   public JsonTreeMapDecoder(@NotNull Json json, @NotNull JsonObject value) {
/* 297 */     super(json, value, null, null, 12, null); this.value = value;
/* 298 */     this.keys = CollectionsKt.toList(getValue().keySet());
/* 299 */     this.size = this.keys.size() * 2;
/* 300 */     this.position = -1;
/*     */   }
/*     */   @NotNull
/* 303 */   protected String elementName(@NotNull SerialDescriptor descriptor, int index) { Intrinsics.checkNotNullParameter(descriptor, "descriptor"); int i = index / 2;
/* 304 */     return this.keys.get(i); } @NotNull
/*     */   public JsonObject getValue() {
/*     */     return this.value;
/*     */   } public int decodeElementIndex(@NotNull SerialDescriptor descriptor) {
/* 308 */     Intrinsics.checkNotNullParameter(descriptor, "descriptor"); if (this.position < this.size - 1) {
/* 309 */       int i = this.position; this.position = i + 1;
/* 310 */       return this.position;
/*     */     } 
/* 312 */     return -1;
/*     */   }
/*     */   @NotNull
/*     */   protected JsonElement currentElement(@NotNull String tag) {
/* 316 */     Intrinsics.checkNotNullParameter(tag, "tag"); return (this.position % 2 == 0) ? (JsonElement)JsonElementKt.JsonPrimitive(tag) : (JsonElement)MapsKt.getValue((Map)getValue(), tag);
/*     */   }
/*     */ 
/*     */   
/*     */   public void endStructure(@NotNull SerialDescriptor descriptor) {
/* 321 */     Intrinsics.checkNotNullParameter(descriptor, "descriptor");
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\JsonTreeMapDecoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */