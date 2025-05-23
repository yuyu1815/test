/*     */ package androidx.compose.runtime.snapshots;
/*     */ 
/*     */ import java.util.ConcurrentModificationException;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020(\n\002\020&\n\002\b\013\n\002\020\b\n\002\b\b\n\002\020\002\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\003\b\"\030\000*\004\b\000\020\001*\004\b\001\020\0022\0020\003B3\022\022\020\004\032\016\022\004\022\0028\000\022\004\022\0028\0010\005\022\030\020\006\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\b0\007¢\006\002\020\tJ\b\020\034\032\0020\035H\004J\006\020\036\032\0020\037J%\020 \032\002H!\"\004\b\002\020!2\f\020\"\032\b\022\004\022\002H!0#H\bø\001\000¢\006\002\020$J\006\020%\032\0020\035R(\020\n\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\bX\016¢\006\016\n\000\032\004\b\013\020\f\"\004\b\r\020\016R#\020\006\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\b0\007¢\006\b\n\000\032\004\b\017\020\020R\035\020\004\032\016\022\004\022\0028\000\022\004\022\0028\0010\005¢\006\b\n\000\032\004\b\021\020\022R\032\020\023\032\0020\024X\016¢\006\016\n\000\032\004\b\025\020\026\"\004\b\027\020\030R(\020\031\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\bX\016¢\006\016\n\000\032\004\b\032\020\f\"\004\b\033\020\016\002\007\n\005\b20\001¨\006&"}, d2 = {"Landroidx/compose/runtime/snapshots/StateMapMutableIterator;", "K", "V", "", "map", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "iterator", "", "", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;Ljava/util/Iterator;)V", "current", "getCurrent", "()Ljava/util/Map$Entry;", "setCurrent", "(Ljava/util/Map$Entry;)V", "getIterator", "()Ljava/util/Iterator;", "getMap", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "modification", "", "getModification", "()I", "setModification", "(I)V", "next", "getNext", "setNext", "advance", "", "hasNext", "", "modify", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "remove", "runtime"})
/*     */ @SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,373:1\n318#1,4:374\n1#2:378\n1#2:379\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n*L\n299#1:374,4\n299#1:378\n*E\n"})
/*     */ abstract class StateMapMutableIterator<K, V>
/*     */ {
/*     */   @NotNull
/*     */   private final SnapshotStateMap<K, V> map;
/*     */   @NotNull
/*     */   private final Iterator<Map.Entry<K, V>> iterator;
/*     */   private int modification;
/*     */   @Nullable
/*     */   private Map.Entry<? extends K, ? extends V> current;
/*     */   @Nullable
/*     */   private Map.Entry<? extends K, ? extends V> next;
/*     */   
/*     */   @NotNull
/*     */   public final SnapshotStateMap<K, V> getMap() {
/*     */     return this.map;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Iterator<Map.Entry<K, V>> getIterator() {
/*     */     return this.iterator;
/*     */   }
/*     */   
/*     */   protected final int getModification() {
/*     */     return this.modification;
/*     */   }
/*     */   
/*     */   protected final void setModification(int <set-?>) {
/*     */     this.modification = <set-?>;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected final Map.Entry<K, V> getCurrent() {
/*     */     return (Map.Entry)this.current;
/*     */   }
/*     */   
/*     */   protected final void setCurrent(@Nullable Map.Entry<? extends K, ? extends V> <set-?>) {
/*     */     this.current = <set-?>;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected final Map.Entry<K, V> getNext() {
/*     */     return (Map.Entry)this.next;
/*     */   }
/*     */   
/*     */   public StateMapMutableIterator(@NotNull SnapshotStateMap<K, V> map, @NotNull Iterator<Map.Entry<K, V>> iterator) {
/* 290 */     this.map = map;
/* 291 */     this.iterator = iterator;
/*     */     
/* 293 */     this.modification = this.map.getModification$runtime();
/*     */ 
/*     */ 
/*     */     
/* 297 */     advance();
/*     */   } protected final void setNext(@Nullable Map.Entry<? extends K, ? extends V> <set-?>) { this.next = <set-?>; } public final void remove() {
/* 299 */     StateMapMutableIterator this_$iv = this; int $i$f$modify = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 374 */     if (this_$iv.getMap().getModification$runtime() != access$getModification(this_$iv)) {
/* 375 */       throw new ConcurrentModificationException();
/*     */     }
/* 377 */     int $i$a$-modify-StateMapMutableIterator$remove$1 = 0; Map.Entry<? extends K, ? extends V> value = this.current; if (value != null) { this.map.remove(value.getKey()); this.current = null; } else { throw new IllegalStateException(); }  Unit unit = Unit.INSTANCE; Object it$iv = unit;
/* 378 */     int $i$a$-also-StateMapMutableIterator$modify$1$iv = 0; access$setModification(this_$iv, this_$iv.getMap().getModification$runtime()); } protected final <T> T modify(@NotNull Function0 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$modify = 0; if (getMap().getModification$runtime() != access$getModification(this))
/* 379 */       throw new ConcurrentModificationException();  Object object1 = block.invoke(), it = object1; int $i$a$-also-StateMapMutableIterator$modify$1 = 0;
/*     */     access$setModification(this, getMap().getModification$runtime());
/*     */     return (T)object1; }
/*     */ 
/*     */   
/*     */   public final boolean hasNext() {
/*     */     return (this.next != null);
/*     */   }
/*     */   
/*     */   protected final void advance() {
/*     */     this.current = this.next;
/*     */     this.next = this.iterator.hasNext() ? this.iterator.next() : null;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\snapshots\StateMapMutableIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */