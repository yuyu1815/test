/*     */ package androidx.compose.runtime.snapshots;
/*     */ 
/*     */ import java.util.ConcurrentModificationException;
/*     */ import java.util.ListIterator;
/*     */ import kotlin.KotlinNothingValueException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.jvm.internal.markers.KMutableListIterator;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\000\n\002\020+\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\007\n\002\020\002\n\002\b\003\n\002\020\013\n\002\b\n\b\002\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\033\022\f\020\003\032\b\022\004\022\0028\0000\004\022\006\020\005\032\0020\006¢\006\002\020\007J\025\020\r\032\0020\0162\006\020\017\032\0028\000H\026¢\006\002\020\020J\t\020\021\032\0020\022H\002J\b\020\023\032\0020\022H\026J\016\020\024\032\0028\000H\002¢\006\002\020\025J\b\020\026\032\0020\006H\026J\r\020\027\032\0028\000H\026¢\006\002\020\025J\b\020\030\032\0020\006H\026J\b\020\031\032\0020\016H\026J\025\020\032\032\0020\0162\006\020\017\032\0028\000H\026¢\006\002\020\020J\b\020\033\032\0020\016H\002R\016\020\b\032\0020\006X\016¢\006\002\n\000R\016\020\t\032\0020\006X\016¢\006\002\n\000R\027\020\003\032\b\022\004\022\0028\0000\004¢\006\b\n\000\032\004\b\n\020\013R\016\020\f\032\0020\006X\016¢\006\002\n\000¨\006\034"}, d2 = {"Landroidx/compose/runtime/snapshots/StateListIterator;", "T", "", "list", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "offset", "", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;I)V", "index", "lastRequested", "getList", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "structure", "add", "", "element", "(Ljava/lang/Object;)V", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "previous", "previousIndex", "remove", "set", "validateModification", "runtime"})
/*     */ @SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/StateListIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,498:1\n1#2:499\n*E\n"})
/*     */ final class StateListIterator<T>
/*     */   implements ListIterator<T>, KMutableListIterator
/*     */ {
/*     */   @NotNull
/*     */   private final SnapshotStateList<T> list;
/*     */   private int index;
/*     */   private int lastRequested;
/*     */   private int structure;
/*     */   
/*     */   public StateListIterator(@NotNull SnapshotStateList<T> list, int offset) {
/* 279 */     this.list = list;
/*     */ 
/*     */     
/* 282 */     this.index = offset - 1;
/* 283 */     this.lastRequested = -1;
/* 284 */     this.structure = this.list.getStructure$runtime();
/*     */   } @NotNull
/* 286 */   public final SnapshotStateList<T> getList() { return this.list; } public boolean hasPrevious() { return (this.index >= 0); }
/*     */    public int nextIndex() {
/* 288 */     return this.index + 1;
/*     */   }
/*     */   
/* 291 */   public T previous() { validateModification();
/* 292 */     SnapshotStateListKt.access$validateRange(this.index, this.list.size());
/* 293 */     this.lastRequested = this.index;
/* 294 */     T t = this.list.get(this.index); Object it = t;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 499 */     int $i$a$-also-StateListIterator$previous$1 = 0; int i = this.index; this.index = i + -1; return t; } public T next() { validateModification(); int newIndex = this.index + 1; this.lastRequested = newIndex; SnapshotStateListKt.access$validateRange(newIndex, this.list.size()); T t = this.list.get(newIndex); Object it = t; int $i$a$-also-StateListIterator$next$1 = 0;
/*     */     this.index = newIndex;
/*     */     return t; }
/*     */ 
/*     */   
/*     */   public int previousIndex() {
/*     */     return this.index;
/*     */   }
/*     */   
/*     */   public void add(Object element) {
/*     */     validateModification();
/*     */     this.list.add(this.index + 1, (T)element);
/*     */     this.lastRequested = -1;
/*     */     int i = this.index;
/*     */     this.index = i + 1;
/*     */     this.structure = this.list.getStructure$runtime();
/*     */   }
/*     */   
/*     */   public boolean hasNext() {
/*     */     return (this.index < this.list.size() - 1);
/*     */   }
/*     */   
/*     */   public void remove() {
/*     */     validateModification();
/*     */     this.list.remove(this.index);
/*     */     int i = this.index;
/*     */     this.index = i + -1;
/*     */     this.lastRequested = -1;
/*     */     this.structure = this.list.getStructure$runtime();
/*     */   }
/*     */   
/*     */   public void set(Object element) {
/*     */     validateModification();
/*     */     if (this.lastRequested < 0) {
/*     */       SnapshotStateListKt.access$invalidIteratorSet();
/*     */       throw new KotlinNothingValueException();
/*     */     } 
/*     */     this.list.set(this.lastRequested, (T)element);
/*     */     this.structure = this.list.getStructure$runtime();
/*     */   }
/*     */   
/*     */   private final void validateModification() {
/*     */     if (this.list.getStructure$runtime() != this.structure)
/*     */       throw new ConcurrentModificationException(); 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\snapshots\StateListIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */