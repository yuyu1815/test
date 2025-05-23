/*     */ package kotlinx.serialization.json;
/*     */ 
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.function.BiFunction;
/*     */ import java.util.function.Function;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.markers.KMappedMarker;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.json.internal.StringOpsKt;
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
/*     */ @Serializable(with = JsonObjectSerializer.class)
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\020$\n\002\020\016\n\002\b\004\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\b\n\002\020\"\n\002\020&\n\002\b\b\n\002\020\036\n\002\b\004\b\007\030\000 \"2\0020\0012\016\022\004\022\0020\003\022\004\022\0020\0010\002:\001\"B\033\022\022\020\004\032\016\022\004\022\0020\003\022\004\022\0020\0010\002¢\006\004\b\005\020\006J\023\020\007\032\0020\b2\b\020\t\032\004\030\0010\nH\002J\b\020\013\032\0020\fH\026J\b\020\r\032\0020\003H\026J\021\020\016\032\0020\b2\006\020\017\032\0020\003H\001J\021\020\020\032\0020\b2\006\020\021\032\0020\001H\001J\023\020\022\032\004\030\0010\0012\006\020\017\032\0020\003H\003J\t\020\023\032\0020\bH\001R\032\020\004\032\016\022\004\022\0020\003\022\004\022\0020\0010\002X\004¢\006\002\n\000R$\020\024\032\024\022\020\022\016\022\004\022\0020\003\022\004\022\0020\0010\0260\025X\005¢\006\006\032\004\b\027\020\030R\030\020\031\032\b\022\004\022\0020\0030\025X\005¢\006\006\032\004\b\032\020\030R\022\020\033\032\0020\fX\005¢\006\006\032\004\b\034\020\035R\030\020\036\032\b\022\004\022\0020\0010\037X\005¢\006\006\032\004\b \020!¨\006#"}, d2 = {"Lkotlinx/serialization/json/JsonObject;", "Lkotlinx/serialization/json/JsonElement;", "", "", "content", "<init>", "(Ljava/util/Map;)V", "equals", "", "other", "", "hashCode", "", "toString", "containsKey", "key", "containsValue", "value", "get", "isEmpty", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "size", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "Companion", "kotlinx-serialization-json"})
/*     */ public final class JsonObject
/*     */   extends JsonElement
/*     */   implements Map<String, JsonElement>, KMappedMarker
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final Map<String, JsonElement> content;
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lkotlinx/serialization/json/JsonObject$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonObject;", "kotlinx-serialization-json"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<JsonObject> serializer() {
/* 190 */       return JsonObjectSerializer.INSTANCE;
/*     */     }
/*     */   }
/* 193 */   public JsonObject(@NotNull Map<String, JsonElement> content) { super(null);
/* 194 */     this.content = content; } public boolean equals(@Nullable Object other) { return Intrinsics.areEqual(this.content, other); }
/* 195 */   public int hashCode() { return this.content.hashCode(); }
/*     */   @NotNull
/* 197 */   public String toString() { return CollectionsKt.joinToString$default(this.content.entrySet(), 
/* 198 */         ",", 
/* 199 */         "{", 
/* 200 */         "}", 0, null, JsonObject::toString$lambda$1, 24, null); } private static final CharSequence toString$lambda$1(Map.Entry paramEntry) {
/* 201 */     Intrinsics.checkNotNullParameter(paramEntry, "<destruct>"); String k = (String)paramEntry.getKey(); JsonElement v = (JsonElement)paramEntry.getValue();
/* 202 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$toString_u24lambda_u241_u24lambda_u240 = stringBuilder1; int $i$a$-buildString-JsonObject$toString$1$1 = 0;
/* 203 */     StringOpsKt.printQuoted($this$toString_u24lambda_u241_u24lambda_u240, k);
/* 204 */     $this$toString_u24lambda_u241_u24lambda_u240.append(':');
/* 205 */     $this$toString_u24lambda_u241_u24lambda_u240.append(v);
/*     */     return stringBuilder1.toString();
/*     */   }
/*     */   
/*     */   public boolean isEmpty() {
/*     */     return this.content.isEmpty();
/*     */   }
/*     */   
/*     */   public boolean containsKey(@NotNull String key) {
/*     */     Intrinsics.checkNotNullParameter(key, "key");
/*     */     return this.content.containsKey(key);
/*     */   }
/*     */   
/*     */   public boolean containsValue(@NotNull JsonElement value) {
/*     */     Intrinsics.checkNotNullParameter(value, "value");
/*     */     return this.content.containsValue(value);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public JsonElement get(@NotNull String key) {
/*     */     Intrinsics.checkNotNullParameter(key, "key");
/*     */     return this.content.get(key);
/*     */   }
/*     */   
/*     */   public int getSize() {
/*     */     return this.content.size();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Set<String> getKeys() {
/*     */     return this.content.keySet();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Collection<JsonElement> getValues() {
/*     */     return this.content.values();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Set<Map.Entry<String, JsonElement>> getEntries() {
/*     */     return this.content.entrySet();
/*     */   }
/*     */   
/*     */   public JsonElement put(String key, JsonElement value) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public JsonElement remove(Object key) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public boolean remove(Object key, Object value) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public void putAll(Map from) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public void clear() {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public void replaceAll(BiFunction p0) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public JsonElement putIfAbsent(String p0, JsonElement p1) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public boolean replace(String p0, JsonElement p1, JsonElement p2) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public JsonElement replace(String p0, JsonElement p1) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public JsonElement computeIfAbsent(String p0, Function p1) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public JsonElement computeIfPresent(String p0, BiFunction p1) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public JsonElement compute(String p0, BiFunction p1) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */   
/*     */   public JsonElement merge(String p0, JsonElement p1, BiFunction p2) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\JsonObject.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */