/*     */ package androidx.compose.runtime.snapshots;
/*     */ 
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.CollectionToArray;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.markers.KMutableSet;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\b\003\n\002\020#\n\000\n\002\030\002\n\002\b\004\n\002\020\b\n\002\b\003\n\002\020\002\n\000\n\002\020\013\n\000\b\"\030\000*\004\b\000\020\001*\004\b\001\020\002*\004\b\002\020\0032\b\022\004\022\002H\0030\004B\031\022\022\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006¢\006\002\020\007J\b\020\016\032\0020\017H\026J\b\020\020\032\0020\021H\026R\035\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006¢\006\b\n\000\032\004\b\b\020\tR\024\020\n\032\0020\0138VX\004¢\006\006\032\004\b\f\020\r¨\006\022"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotMapSet;", "K", "V", "E", "", "map", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V", "getMap", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "size", "", "getSize", "()I", "clear", "", "isEmpty", "", "runtime"})
/*     */ abstract class SnapshotMapSet<K, V, E>
/*     */   implements Set<E>, KMutableSet
/*     */ {
/*     */   @NotNull
/*     */   private final SnapshotStateMap<K, V> map;
/*     */   
/*     */   public SnapshotMapSet(@NotNull SnapshotStateMap<K, V> map) {
/* 198 */     this.map = map; } @NotNull public final SnapshotStateMap<K, V> getMap() { return this.map; }
/*     */   
/* 200 */   public int getSize() { return this.map.size(); }
/* 201 */   public void clear() { this.map.clear(); } public boolean isEmpty() {
/* 202 */     return this.map.isEmpty();
/*     */   }
/*     */   
/*     */   public <T> T[] toArray(Object[] array) {
/*     */     Intrinsics.checkNotNullParameter(array, "array");
/*     */     return (T[])CollectionToArray.toArray(this, array);
/*     */   }
/*     */   
/*     */   public Object[] toArray() {
/*     */     return CollectionToArray.toArray(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\snapshots\SnapshotMapSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */