/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;
/*    */ 
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020'\n\000\n\002\030\002\n\002\b\013\b\002\030\000*\004\b\000\020\001*\004\b\001\020\0022\016\022\004\022\002H\001\022\004\022\002H\0020\0032\016\022\004\022\002H\001\022\004\022\002H\0020\004B)\022\022\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006\022\006\020\007\032\0028\000\022\006\020\b\032\0028\001¢\006\002\020\tJ\025\020\f\032\0028\0012\006\020\017\032\0028\001H\026¢\006\002\020\020R\032\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006X\004¢\006\002\n\000R\034\020\b\032\0028\001X\016¢\006\020\n\002\020\016\032\004\b\n\020\013\"\004\b\f\020\r¨\006\021"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/MutableMapEntry;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/MapEntry;", "", "parentIterator", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderEntriesIterator;", "key", "value", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderEntriesIterator;Ljava/lang/Object;Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "runtime"})
/*    */ final class MutableMapEntry<K, V>
/*    */   extends MapEntry<K, V>
/*    */   implements Map.Entry<K, V>, KMutableMap.Entry
/*    */ {
/*    */   @NotNull
/*    */   private final PersistentHashMapBuilderEntriesIterator<K, V> parentIterator;
/*    */   private V value;
/*    */   
/*    */   public V getValue() {
/* 26 */     return this.value; } public void setValue(Object <set-?>) { this.value = (V)<set-?>; }
/* 27 */   public MutableMapEntry(@NotNull PersistentHashMapBuilderEntriesIterator<K, V> parentIterator, Object key, Object value) { super((K)key, (V)value);
/*    */     this.parentIterator = parentIterator;
/*    */     this.value = (V)value; } public V setValue(Object newValue) {
/* 30 */     Object result = getValue();
/* 31 */     setValue((V)newValue);
/* 32 */     this.parentIterator.setValue(getKey(), (V)newValue);
/* 33 */     return (V)result;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableMap\MutableMapEntry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */