/*    */ package ai.grazie.utils.data;
/*    */ 
/*    */ import java.util.Collection;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import java.util.function.BiFunction;
/*    */ import java.util.function.Function;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.MapsKt;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.markers.KMappedMarker;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.json.JsonElement;
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
/*    */ @Serializable(with = DataHolderSerializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020$\n\002\020\016\n\002\030\002\n\002\b\005\n\002\020\"\n\002\020&\n\002\b\005\n\002\020\b\n\002\b\003\n\002\020\036\n\002\b\003\n\002\020\013\n\002\b\005\n\002\020\000\n\002\b\005\b\007\030\000 \"2\016\022\004\022\0020\002\022\004\022\0020\0030\001:\001\"B\035\b\000\022\024\b\002\020\004\032\016\022\004\022\0020\002\022\004\022\0020\0030\001¢\006\002\020\005J\021\020\027\032\0020\0302\006\020\031\032\0020\002H\001J\021\020\032\032\0020\0302\006\020\033\032\0020\003H\001J\023\020\034\032\0020\0302\b\020\035\032\004\030\0010\036H\002J\023\020\037\032\004\030\0010\0032\006\020\031\032\0020\002H\003J\b\020 \032\0020\020H\026J\t\020!\032\0020\030H\001R \020\004\032\016\022\004\022\0020\002\022\004\022\0020\0030\001X\004¢\006\b\n\000\032\004\b\006\020\007R$\020\b\032\024\022\020\022\016\022\004\022\0020\002\022\004\022\0020\0030\n0\tX\005¢\006\006\032\004\b\013\020\fR\030\020\r\032\b\022\004\022\0020\0020\tX\005¢\006\006\032\004\b\016\020\fR\022\020\017\032\0020\020X\005¢\006\006\032\004\b\021\020\022R\030\020\023\032\b\022\004\022\0020\0030\024X\005¢\006\006\032\004\b\025\020\026¨\006#"}, d2 = {"Lai/grazie/utils/data/DataHolder;", "", "", "Lkotlinx/serialization/json/JsonElement;", "data", "(Ljava/util/Map;)V", "getData$utils_common", "()Ljava/util/Map;", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "containsKey", "", "key", "containsValue", "value", "equals", "other", "", "get", "hashCode", "isEmpty", "Companion", "utils-common"})
/*    */ public final class DataHolder
/*    */   implements Map<String, JsonElement>, KMappedMarker
/*    */ {
/*    */   public DataHolder(@NotNull Map<String, JsonElement> data) {
/* 45 */     this.data = data; } @NotNull public final Map<String, JsonElement> getData$utils_common() { return this.data; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\037\020\007\032\0020\0042\027\020\b\032\023\022\004\022\0020\n\022\004\022\0020\0130\t¢\006\002\b\fJ\017\020\r\032\b\022\004\022\0020\0040\016HÆ\001R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\017"}, d2 = {"Lai/grazie/utils/data/DataHolder$Companion;", "", "()V", "empty", "Lai/grazie/utils/data/DataHolder;", "getEmpty", "()Lai/grazie/utils/data/DataHolder;", "build", "builder", "Lkotlin/Function1;", "Lai/grazie/utils/data/DataHolderBuilder;", "", "Lkotlin/ExtensionFunctionType;", "serializer", "Lkotlinx/serialization/KSerializer;", "utils-common"}) public static final class Companion { @NotNull
/* 46 */     public final KSerializer<DataHolder> serializer() { return DataHolderSerializer.INSTANCE; } private Companion() {} @NotNull
/* 47 */     public final DataHolder getEmpty() { return DataHolder.empty; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final DataHolder build(@NotNull Function1 builder) {
/* 56 */       Intrinsics.checkNotNullParameter(builder, "builder"); DataHolderBuilder dataHolderBuilder = new DataHolderBuilder(); builder.invoke(dataHolderBuilder); return dataHolderBuilder.build$utils_common();
/*    */     } } @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final Map<String, JsonElement> data; @NotNull
/*    */   private static final DataHolder empty = new DataHolder(MapsKt.emptyMap()); public boolean equals(@Nullable Object other) {
/* 61 */     if (this == other) return true; 
/* 62 */     if (!(other instanceof DataHolder)) return false; 
/* 63 */     return Intrinsics.areEqual(this.data, ((DataHolder)other).data);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 67 */     return this.data.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Set<Map.Entry<String, JsonElement>> getEntries() {
/*    */     return this.data.entrySet();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Set<String> getKeys() {
/*    */     return this.data.keySet();
/*    */   }
/*    */   
/*    */   public int getSize() {
/*    */     return this.data.size();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Collection<JsonElement> getValues() {
/*    */     return this.data.values();
/*    */   }
/*    */   
/*    */   public boolean containsKey(@NotNull String key) {
/*    */     Intrinsics.checkNotNullParameter(key, "key");
/*    */     return this.data.containsKey(key);
/*    */   }
/*    */   
/*    */   public boolean containsValue(@NotNull JsonElement value) {
/*    */     Intrinsics.checkNotNullParameter(value, "value");
/*    */     return this.data.containsValue(value);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public JsonElement get(@NotNull String key) {
/*    */     Intrinsics.checkNotNullParameter(key, "key");
/*    */     return this.data.get(key);
/*    */   }
/*    */   
/*    */   public boolean isEmpty() {
/*    */     return this.data.isEmpty();
/*    */   }
/*    */   
/*    */   public void clear() {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public JsonElement compute(String p0, BiFunction p1) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public JsonElement computeIfAbsent(String p0, Function p1) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public JsonElement computeIfPresent(String p0, BiFunction p1) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public JsonElement merge(String p0, JsonElement p1, BiFunction p2) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public JsonElement put(String key, JsonElement value) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public void putAll(Map from) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public JsonElement putIfAbsent(String p0, JsonElement p1) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public JsonElement remove(Object key) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public boolean remove(Object key, Object value) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public boolean replace(String p0, JsonElement p1, JsonElement p2) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public JsonElement replace(String p0, JsonElement p1) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public void replaceAll(BiFunction p0) {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */   
/*    */   public DataHolder() {
/*    */     this(null, 1, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\data\DataHolder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */