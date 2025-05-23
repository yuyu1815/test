/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;
/*    */ 
/*    */ import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.markers.KMutableMap;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020'\n\000\n\002\020%\n\002\030\002\n\002\b\n\b\002\030\000*\004\b\000\020\001*\004\b\001\020\0022\016\022\004\022\002H\001\022\004\022\002H\0020\0032\016\022\004\022\002H\001\022\004\022\002H\0020\004B5\022\030\020\005\032\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\0070\006\022\006\020\b\032\0028\000\022\f\020\t\032\b\022\004\022\0028\0010\007¢\006\002\020\nJ\025\020\016\032\0028\0012\006\020\017\032\0028\001H\026¢\006\002\020\020R\024\020\t\032\b\022\004\022\0028\0010\007X\016¢\006\002\n\000R \020\005\032\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\0070\006X\004¢\006\002\n\000R\024\020\013\032\0028\0018VX\004¢\006\006\032\004\b\f\020\r¨\006\021"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/MutableMapEntry;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/MapEntry;", "", "mutableMap", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "key", "links", "(Ljava/util/Map;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;)V", "value", "getValue", "()Ljava/lang/Object;", "setValue", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "runtime"})
/*    */ final class MutableMapEntry<K, V>
/*    */   extends MapEntry<K, V>
/*    */   implements Map.Entry<K, V>, KMutableMap.Entry
/*    */ {
/*    */   @NotNull
/*    */   private final Map<K, LinkedValue<V>> mutableMap;
/*    */   @NotNull
/*    */   private LinkedValue<V> links;
/*    */   
/*    */   public MutableMapEntry(@NotNull Map<K, LinkedValue<V>> mutableMap, Object key, @NotNull LinkedValue<V> links) {
/* 84 */     super(key, links.getValue()); this.mutableMap = mutableMap; this.links = links;
/*    */   } public V getValue() {
/* 86 */     return this.links.getValue();
/*    */   }
/*    */   public V setValue(Object newValue) {
/* 89 */     Object result = this.links.getValue();
/* 90 */     this.links = this.links.withValue((V)newValue);
/* 91 */     this.mutableMap.put(getKey(), this.links);
/* 92 */     return (V)result;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\persistentOrderedMap\MutableMapEntry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */