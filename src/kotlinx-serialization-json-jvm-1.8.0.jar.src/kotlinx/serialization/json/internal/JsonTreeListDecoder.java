/*     */ package kotlinx.serialization.json.internal;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.json.JsonArray;
/*     */ import kotlinx.serialization.json.JsonElement;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\b\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\002\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\030\020\r\032\0020\0162\006\020\017\032\0020\0202\006\020\021\032\0020\013H\024J\020\020\022\032\0020\0232\006\020\024\032\0020\016H\024J\020\020\025\032\0020\0132\006\020\017\032\0020\020H\026R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\b\020\tR\016\020\n\032\0020\013X\004¢\006\002\n\000R\016\020\f\032\0020\013X\016¢\006\002\n\000¨\006\026"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeListDecoder;", "Lkotlinx/serialization/json/internal/AbstractJsonTreeDecoder;", "json", "Lkotlinx/serialization/json/Json;", "value", "Lkotlinx/serialization/json/JsonArray;", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonArray;)V", "getValue", "()Lkotlinx/serialization/json/JsonArray;", "size", "", "currentIndex", "elementName", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "index", "currentElement", "Lkotlinx/serialization/json/JsonElement;", "tag", "decodeElementIndex", "kotlinx-serialization-json"})
/*     */ final class JsonTreeListDecoder
/*     */   extends AbstractJsonTreeDecoder
/*     */ {
/*     */   @NotNull
/*     */   private final JsonArray value;
/*     */   private final int size;
/*     */   private int currentIndex;
/*     */   
/*     */   @NotNull
/*     */   public JsonArray getValue() {
/*     */     return this.value;
/*     */   }
/*     */   
/*     */   public JsonTreeListDecoder(@NotNull Json json, @NotNull JsonArray value) {
/* 324 */     super(json, (JsonElement)value, null, 4, null); this.value = value;
/* 325 */     this.size = getValue().size();
/* 326 */     this.currentIndex = -1; } @NotNull
/*     */   protected String elementName(@NotNull SerialDescriptor descriptor, int index) {
/* 328 */     Intrinsics.checkNotNullParameter(descriptor, "descriptor"); return String.valueOf(index);
/*     */   } @NotNull
/*     */   protected JsonElement currentElement(@NotNull String tag) {
/* 331 */     Intrinsics.checkNotNullParameter(tag, "tag"); return getValue().get(Integer.parseInt(tag));
/*     */   }
/*     */   
/*     */   public int decodeElementIndex(@NotNull SerialDescriptor descriptor) {
/* 335 */     Intrinsics.checkNotNullParameter(descriptor, "descriptor"); if (this.currentIndex < this.size - 1) {
/* 336 */       int i = this.currentIndex; this.currentIndex = i + 1;
/* 337 */       return this.currentIndex;
/*     */     } 
/* 339 */     return -1;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\JsonTreeListDecoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */