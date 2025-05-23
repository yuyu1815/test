/*     */ package kotlinx.serialization.json;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.PublishedApi;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.ExperimentalSerializationApi;
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
/*     */ @JsonDslMarker
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020!\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\020\036\n\000\n\002\030\002\n\000\b\007\030\0002\0020\001B\t\b\001¢\006\004\b\002\020\003J\016\020\007\032\0020\b2\006\020\t\032\0020\006J\026\020\n\032\0020\b2\f\020\013\032\b\022\004\022\0020\0060\fH\007J\b\020\r\032\0020\016H\001R\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000¨\006\017"}, d2 = {"Lkotlinx/serialization/json/JsonArrayBuilder;", "", "<init>", "()V", "content", "", "Lkotlinx/serialization/json/JsonElement;", "add", "", "element", "addAll", "elements", "", "build", "Lkotlinx/serialization/json/JsonArray;", "kotlinx-serialization-json"})
/*     */ public final class JsonArrayBuilder
/*     */ {
/*     */   @NotNull
/* 128 */   private final List<JsonElement> content = new ArrayList<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean add(@NotNull JsonElement element) {
/* 136 */     Intrinsics.checkNotNullParameter(element, "element"); this.content.add(element);
/* 137 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ExperimentalSerializationApi
/*     */   public final boolean addAll(@NotNull Collection<? extends JsonElement> elements) {
/* 147 */     Intrinsics.checkNotNullParameter(elements, "elements"); return this.content.addAll(elements); } @PublishedApi
/*     */   @NotNull
/*     */   public final JsonArray build() {
/* 150 */     return new JsonArray(this.content);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\JsonArrayBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */