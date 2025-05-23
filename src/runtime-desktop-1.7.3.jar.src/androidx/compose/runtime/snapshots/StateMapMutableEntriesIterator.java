/*     */ package androidx.compose.runtime.snapshots;
/*     */ 
/*     */ import java.util.ConcurrentModificationException;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.jvm.internal.markers.KMutableIterator;
/*     */ import kotlin.jvm.internal.markers.KMutableMap;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020)\n\002\020'\n\000\n\002\030\002\n\000\n\002\020(\n\002\020&\n\002\b\003\b\002\030\000*\004\b\000\020\001*\004\b\001\020\0022\016\022\004\022\002H\001\022\004\022\002H\0020\0032\024\022\020\022\016\022\004\022\002H\001\022\004\022\002H\0020\0050\004B3\022\022\020\006\032\016\022\004\022\0028\000\022\004\022\0028\0010\007\022\030\020\b\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\n0\t¢\006\002\020\013J\025\020\f\032\016\022\004\022\0028\000\022\004\022\0028\0010\005H\002¨\006\r"}, d2 = {"Landroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator;", "K", "V", "Landroidx/compose/runtime/snapshots/StateMapMutableIterator;", "", "", "map", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "iterator", "", "", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;Ljava/util/Iterator;)V", "next", "runtime"})
/*     */ final class StateMapMutableEntriesIterator<K, V>
/*     */   extends StateMapMutableIterator<K, V>
/*     */   implements Iterator<Map.Entry<K, V>>, KMutableIterator
/*     */ {
/*     */   public StateMapMutableEntriesIterator(@NotNull SnapshotStateMap<K, V> map, @NotNull Iterator<? extends Map.Entry<? extends K, ? extends V>> iterator) {
/* 328 */     super(map, iterator); } @NotNull
/*     */   public Map.Entry<K, V> next() {
/* 330 */     advance();
/* 331 */     if (getCurrent() != null) {
/* 332 */       return new StateMapMutableEntriesIterator$next$1();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 343 */     throw new IllegalStateException();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\r\n\000\n\002\020'\n\002\b\013*\001\000\b\n\030\0002\016\022\004\022\0028\000\022\004\022\0028\0010\001J\025\020\b\032\0028\0012\006\020\n\032\0028\001H\026¢\006\002\020\013R\026\020\002\032\0028\000X\004¢\006\n\n\002\020\005\032\004\b\003\020\004R\034\020\006\032\0028\001X\016¢\006\020\n\002\020\005\032\004\b\007\020\004\"\004\b\b\020\t¨\006\f"}, d2 = {"androidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1", "", "key", "getKey", "()Ljava/lang/Object;", "Ljava/lang/Object;", "value", "getValue", "setValue", "(Ljava/lang/Object;)V", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "runtime"})
/*     */   @SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1\n+ 2 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,373:1\n318#2,4:374\n1#3:378\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1\n*L\n335#1:374,4\n335#1:378\n*E\n"})
/*     */   public static final class StateMapMutableEntriesIterator$next$1 implements Map.Entry<K, V>, KMutableMap.Entry {
/*     */     private final K key;
/*     */     private V value;
/*     */     
/*     */     StateMapMutableEntriesIterator$next$1() {
/*     */       Intrinsics.checkNotNull($receiver.getCurrent());
/*     */       this.key = (K)$receiver.getCurrent().getKey();
/*     */       Intrinsics.checkNotNull($receiver.getCurrent());
/*     */       this.value = (V)$receiver.getCurrent().getValue();
/*     */     }
/*     */     
/*     */     public K getKey() {
/*     */       return this.key;
/*     */     }
/*     */     
/*     */     public V getValue() {
/*     */       return this.value;
/*     */     }
/*     */     
/*     */     public void setValue(Object <set-?>) {
/*     */       this.value = (V)<set-?>;
/*     */     }
/*     */     
/*     */     public V setValue(Object newValue) {
/*     */       StateMapMutableEntriesIterator<K, V> stateMapMutableEntriesIterator1 = StateMapMutableEntriesIterator.this, stateMapMutableEntriesIterator2 = StateMapMutableEntriesIterator.this;
/*     */       int $i$f$modify = 0;
/* 374 */       if (stateMapMutableEntriesIterator1.getMap().getModification$runtime() != StateMapMutableIterator.access$getModification(stateMapMutableEntriesIterator1)) {
/* 375 */         throw new ConcurrentModificationException();
/*     */       }
/* 377 */       int $i$a$-modify-StateMapMutableEntriesIterator$next$1$setValue$1 = 0;
/*     */       Object result = getValue();
/*     */       stateMapMutableEntriesIterator2.getMap().put(getKey(), newValue);
/*     */       setValue((V)newValue);
/*     */       return (V)result;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\snapshots\StateMapMutableEntriesIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */