/*     */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.jvm.internal.markers.KMappedMarker;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\b\002\n\002\020&\n\002\b\b\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\020\030\000*\006\b\000\020\001 \001*\006\b\001\020\002 \0012\016\022\004\022\002H\001\022\004\022\002H\0020\003B\025\022\006\020\004\032\0028\000\022\006\020\005\032\0028\001¢\006\002\020\006J\023\020\013\032\0020\f2\b\020\r\032\004\030\0010\016H\002J\b\020\017\032\0020\020H\026J\b\020\021\032\0020\022H\026R\026\020\004\032\0028\000X\004¢\006\n\n\002\020\t\032\004\b\007\020\bR\026\020\005\032\0028\001X\004¢\006\n\n\002\020\t\032\004\b\n\020\b¨\006\023"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/MapEntry;", "K", "V", "", "key", "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getKey", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getValue", "equals", "", "other", "", "hashCode", "", "toString", "", "runtime"})
/*     */ @StabilityInferred(parameters = 3)
/*     */ @SourceDebugExtension({"SMAP\nPersistentHashMapContentIterators.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashMapContentIterators.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/MapEntry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
/*     */ public class MapEntry<K, V>
/*     */   implements Map.Entry<K, V>, KMappedMarker
/*     */ {
/*     */   private final K key;
/*     */   private final V value;
/*     */   public static final int $stable;
/*     */   
/*     */   public MapEntry(Object key, Object value) {
/*  91 */     this.key = (K)key; this.value = (V)value; } public K getKey() { return this.key; } public V getValue() { return this.value; } public int hashCode() {
/*  92 */     getKey(); getValue(); return ((getKey() != null) ? getKey().hashCode() : 0) ^ ((getValue() != null) ? getValue().hashCode() : 0);
/*     */   } public boolean equals(@Nullable Object other) {
/*  94 */     Object object = (other instanceof Map.Entry) ? other : null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 186 */     int $i$a$-let-MapEntry$equals$1 = 0;
/*     */     (other instanceof Map.Entry) ? other : null;
/*     */     return (((other instanceof Map.Entry) ? other : null) != null) ? ((Intrinsics.areEqual(object.getKey(), getKey()) && Intrinsics.areEqual(object.getValue(), getValue()))) : false;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return (new StringBuilder()).append(getKey()).append('=').append(getValue()).toString();
/*     */   }
/*     */   
/*     */   public V setValue(Object newValue) {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableMap\MapEntry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */