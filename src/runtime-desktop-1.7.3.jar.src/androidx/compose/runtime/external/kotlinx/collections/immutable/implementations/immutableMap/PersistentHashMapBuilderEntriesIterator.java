/*     */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.markers.KMutableIterator;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\b\002\n\002\020)\n\002\020'\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\020\002\n\002\b\005\b\000\030\000*\004\b\000\020\001*\004\b\001\020\0022\024\022\020\022\016\022\004\022\002H\001\022\004\022\002H\0020\0040\003B\031\022\022\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006¢\006\002\020\007J\t\020\n\032\0020\013H\002J\025\020\f\032\016\022\004\022\0028\000\022\004\022\0028\0010\004H\002J\b\020\r\032\0020\016H\026J\033\020\017\032\0020\0162\006\020\020\032\0028\0002\006\020\021\032\0028\001¢\006\002\020\022R,\020\b\032 \022\004\022\0028\000\022\004\022\0028\001\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\0040\tX\004¢\006\002\n\000¨\006\023"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderEntriesIterator;", "K", "V", "", "", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)V", "base", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderBaseIterator;", "hasNext", "", "next", "remove", "", "setValue", "key", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;)V", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class PersistentHashMapBuilderEntriesIterator<K, V>
/*     */   implements Iterator<Map.Entry<K, V>>, KMutableIterator
/*     */ {
/*     */   @NotNull
/*     */   private final PersistentHashMapBuilderBaseIterator<K, V, Map.Entry<K, V>> base;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public PersistentHashMapBuilderEntriesIterator(@NotNull PersistentHashMapBuilder<K, V> builder) {
/*     */     TrieNodeBaseIterator[] arrayOfTrieNodeBaseIterator1;
/*     */     PersistentHashMapBuilderEntriesIterator persistentHashMapBuilderEntriesIterator;
/*     */     PersistentHashMapBuilder<K, V> persistentHashMapBuilder1;
/* 133 */     for (byte b = 0; b < 8; ) { byte b1 = b; arrayOfTrieNodeBaseIterator1[b1] = new TrieNodeMutableEntriesIterator<>(this); b++; }  TrieNodeBaseIterator[] arrayOfTrieNodeBaseIterator2 = arrayOfTrieNodeBaseIterator1; PersistentHashMapBuilder<K, V> persistentHashMapBuilder2 = persistentHashMapBuilder1; persistentHashMapBuilderEntriesIterator.base = new PersistentHashMapBuilderBaseIterator<>(persistentHashMapBuilder2, (TrieNodeBaseIterator<K, V, Map.Entry<K, V>>[])arrayOfTrieNodeBaseIterator2);
/*     */   }
/*     */   
/* 136 */   public boolean hasNext() { return this.base.hasNext(); } @NotNull
/* 137 */   public Map.Entry<K, V> next() { return this.base.next(); } public void remove() {
/* 138 */     this.base.remove();
/*     */   } public final void setValue(Object key, Object newValue) {
/* 140 */     this.base.setValue((K)key, (V)newValue);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableMap\PersistentHashMapBuilderEntriesIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */