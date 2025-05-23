/*     */ package androidx.compose.runtime.snapshots;
/*     */ 
/*     */ import java.util.Collection;
/*     */ import java.util.ConcurrentModificationException;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.ListIterator;
/*     */ import kotlin.KotlinNothingValueException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.IntIterator;
/*     */ import kotlin.jvm.internal.CollectionToArray;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.jvm.internal.markers.KMutableList;
/*     */ import kotlin.jvm.internal.markers.KMutableListIterator;
/*     */ import kotlin.ranges.RangesKt;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\000\n\002\020!\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\013\n\002\020\013\n\002\b\002\n\002\020\002\n\002\b\004\n\002\020\036\n\002\b\t\n\002\020)\n\002\b\002\n\002\020+\n\002\b\t\b\002\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B#\022\f\020\003\032\b\022\004\022\0028\0000\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\006¢\006\002\020\bJ\025\020\021\032\0020\0222\006\020\023\032\0028\000H\026¢\006\002\020\024J\035\020\021\032\0020\0252\006\020\026\032\0020\0062\006\020\023\032\0028\000H\026¢\006\002\020\027J\036\020\030\032\0020\0222\006\020\026\032\0020\0062\f\020\031\032\b\022\004\022\0028\0000\032H\026J\026\020\030\032\0020\0222\f\020\031\032\b\022\004\022\0028\0000\032H\026J\b\020\033\032\0020\025H\026J\026\020\034\032\0020\0222\006\020\023\032\0028\000H\002¢\006\002\020\024J\026\020\035\032\0020\0222\f\020\031\032\b\022\004\022\0028\0000\032H\026J\026\020\036\032\0028\0002\006\020\026\032\0020\006H\002¢\006\002\020\037J\025\020 \032\0020\0062\006\020\023\032\0028\000H\026¢\006\002\020!J\b\020\"\032\0020\022H\026J\017\020#\032\b\022\004\022\0028\0000$H\002J\025\020%\032\0020\0062\006\020\023\032\0028\000H\026¢\006\002\020!J\016\020&\032\b\022\004\022\0028\0000'H\026J\026\020&\032\b\022\004\022\0028\0000'2\006\020\026\032\0020\006H\026J\025\020(\032\0020\0222\006\020\023\032\0028\000H\026¢\006\002\020\024J\026\020)\032\0020\0222\f\020\031\032\b\022\004\022\0028\0000\032H\026J\025\020*\032\0028\0002\006\020\026\032\0020\006H\026¢\006\002\020\037J\026\020+\032\0020\0222\f\020\031\032\b\022\004\022\0028\0000\032H\026J\036\020,\032\0028\0002\006\020\026\032\0020\0062\006\020\023\032\0028\000H\002¢\006\002\020-J\036\020.\032\b\022\004\022\0028\0000\0022\006\020\005\032\0020\0062\006\020\007\032\0020\006H\026J\b\020/\032\0020\025H\002R\016\020\t\032\0020\006X\004¢\006\002\n\000R\027\020\003\032\b\022\004\022\0028\0000\004¢\006\b\n\000\032\004\b\n\020\013R\036\020\r\032\0020\0062\006\020\f\032\0020\006@RX\016¢\006\b\n\000\032\004\b\016\020\017R\016\020\020\032\0020\006X\016¢\006\002\n\000¨\0060"}, d2 = {"Landroidx/compose/runtime/snapshots/SubList;", "T", "", "parentList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "fromIndex", "", "toIndex", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;II)V", "offset", "getParentList", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "<set-?>", "size", "getSize", "()I", "structure", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "validateModification", "runtime"})
/*     */ @SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,498:1\n1726#2,3:499\n1855#2,2:502\n33#3,7:504\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SubList\n*L\n350#1:499,3\n359#1:502,2\n485#1:504,7\n*E\n"})
/*     */ final class SubList<T>
/*     */   implements List<T>, KMutableList
/*     */ {
/*     */   @NotNull
/*     */   private final SnapshotStateList<T> parentList;
/*     */   private final int offset;
/*     */   private int structure;
/*     */   private int size;
/*     */   
/*     */   public SubList(@NotNull SnapshotStateList<T> parentList, int fromIndex, int toIndex) {
/* 340 */     this.parentList = parentList;
/*     */ 
/*     */ 
/*     */     
/* 344 */     this.offset = fromIndex;
/* 345 */     this.structure = this.parentList.getStructure$runtime();
/* 346 */     this.size = toIndex - fromIndex; } public int getSize() { return this.size; }
/*     */   @NotNull
/*     */   public final SnapshotStateList<T> getParentList() { return this.parentList; } public boolean contains(Object element) {
/* 349 */     return (indexOf(element) >= 0); } public boolean containsAll(@NotNull Collection elements) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'elements'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: checkcast java/lang/Iterable
/*     */     //   10: astore_2
/*     */     //   11: iconst_0
/*     */     //   12: istore_3
/*     */     //   13: aload_2
/*     */     //   14: checkcast java/util/Collection
/*     */     //   17: invokeinterface isEmpty : ()Z
/*     */     //   22: ifeq -> 29
/*     */     //   25: iconst_1
/*     */     //   26: goto -> 77
/*     */     //   29: aload_2
/*     */     //   30: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   35: astore #4
/*     */     //   37: aload #4
/*     */     //   39: invokeinterface hasNext : ()Z
/*     */     //   44: ifeq -> 76
/*     */     //   47: aload #4
/*     */     //   49: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   54: astore #5
/*     */     //   56: aload #5
/*     */     //   58: astore #6
/*     */     //   60: iconst_0
/*     */     //   61: istore #7
/*     */     //   63: aload_0
/*     */     //   64: aload #6
/*     */     //   66: invokevirtual contains : (Ljava/lang/Object;)Z
/*     */     //   69: ifne -> 37
/*     */     //   72: iconst_0
/*     */     //   73: goto -> 77
/*     */     //   76: iconst_1
/*     */     //   77: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #350	-> 6
/*     */     //   #499	-> 13
/*     */     //   #500	-> 29
/*     */     //   #350	-> 63
/*     */     //   #500	-> 69
/*     */     //   #501	-> 76
/*     */     //   #350	-> 77
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   63	6	7	$i$a$-all-SubList$containsAll$1	I
/*     */     //   60	9	6	it	Ljava/lang/Object;
/*     */     //   56	20	5	element$iv	Ljava/lang/Object;
/*     */     //   13	64	3	$i$f$all	I
/*     */     //   11	66	2	$this$all$iv	Ljava/lang/Iterable;
/*     */     //   0	78	0	this	Landroidx/compose/runtime/snapshots/SubList;
/*     */     //   0	78	1	elements	Ljava/util/Collection;
/*     */   } public T get(int index) {
/* 352 */     validateModification();
/* 353 */     SnapshotStateListKt.access$validateRange(index, size());
/* 354 */     return this.parentList.get(this.offset + index);
/*     */   }
/*     */   
/*     */   public int indexOf(Object element) {
/* 358 */     validateModification();
/* 359 */     Iterable $this$forEach$iv = (Iterable)RangesKt.until(this.offset, this.offset + size()); int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 502 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { int element$iv = ((IntIterator)iterator).nextInt(), it = element$iv, $i$a$-forEach-SubList$indexOf$1 = 0;
/*     */       if (Intrinsics.areEqual(element, this.parentList.get(it)))
/*     */         return it - this.offset;  }
/*     */     
/*     */     return -1;
/*     */   }
/*     */   
/*     */   public boolean isEmpty() {
/*     */     return (size() == 0);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Iterator<T> iterator() {
/*     */     return listIterator();
/*     */   }
/*     */   
/*     */   public int lastIndexOf(Object element) {
/*     */     validateModification();
/*     */     int index = this.offset + size() - 1;
/*     */     while (index >= this.offset) {
/*     */       if (Intrinsics.areEqual(element, this.parentList.get(index)))
/*     */         return index - this.offset; 
/*     */       index--;
/*     */     } 
/*     */     return -1;
/*     */   }
/*     */   
/*     */   public boolean add(Object element) {
/*     */     validateModification();
/*     */     this.parentList.add(this.offset + size(), (T)element);
/*     */     int i = size();
/*     */     this.size = i + 1;
/*     */     this.structure = this.parentList.getStructure$runtime();
/*     */     return true;
/*     */   }
/*     */   
/*     */   public void add(int index, Object element) {
/*     */     validateModification();
/*     */     this.parentList.add(this.offset + index, (T)element);
/*     */     int i = size();
/*     */     this.size = i + 1;
/*     */     this.structure = this.parentList.getStructure$runtime();
/*     */   }
/*     */   
/*     */   public boolean addAll(int index, @NotNull Collection<? extends T> elements) {
/*     */     Intrinsics.checkNotNullParameter(elements, "elements");
/*     */     validateModification();
/*     */     boolean result = this.parentList.addAll(index + this.offset, elements);
/*     */     if (result) {
/*     */       this.size = size() + elements.size();
/*     */       this.structure = this.parentList.getStructure$runtime();
/*     */     } 
/*     */     return result;
/*     */   }
/*     */   
/*     */   public boolean addAll(@NotNull Collection<? extends T> elements) {
/*     */     Intrinsics.checkNotNullParameter(elements, "elements");
/*     */     return addAll(size(), elements);
/*     */   }
/*     */   
/*     */   public void clear() {
/*     */     if (size() > 0) {
/*     */       validateModification();
/*     */       this.parentList.removeRange(this.offset, this.offset + size());
/*     */       this.size = 0;
/*     */       this.structure = this.parentList.getStructure$runtime();
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public ListIterator<T> listIterator() {
/*     */     return listIterator(0);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public ListIterator<T> listIterator(int index) {
/*     */     validateModification();
/*     */     Ref.IntRef current = new Ref.IntRef();
/*     */     current.element = index - 1;
/*     */     return new SubList$listIterator$1(this);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000#\n\000\n\002\020+\n\000\n\002\020\001\n\002\b\003\n\002\020\013\n\002\b\004\n\002\020\b\n\002\b\005*\001\000\b\n\030\0002\b\022\004\022\0028\0000\001J\025\020\002\032\0020\0032\006\020\004\032\0028\000H\026¢\006\002\020\005J\t\020\006\032\0020\007H\002J\b\020\b\032\0020\007H\026J\016\020\t\032\0028\000H\002¢\006\002\020\nJ\b\020\013\032\0020\fH\026J\r\020\r\032\0028\000H\026¢\006\002\020\nJ\b\020\016\032\0020\fH\026J\b\020\017\032\0020\003H\026J\025\020\020\032\0020\0032\006\020\004\032\0028\000H\026¢\006\002\020\005¨\006\021"}, d2 = {"androidx/compose/runtime/snapshots/SubList$listIterator$1", "", "add", "", "element", "(Ljava/lang/Object;)Ljava/lang/Void;", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "", "previous", "previousIndex", "remove", "set", "runtime"})
/*     */   public static final class SubList$listIterator$1 implements ListIterator<T>, KMutableListIterator {
/*     */     SubList$listIterator$1(SubList<T> $receiver) {}
/*     */     
/*     */     public boolean hasPrevious() {
/*     */       return (this.$current.element >= 0);
/*     */     }
/*     */     
/*     */     public int nextIndex() {
/*     */       return this.$current.element + 1;
/*     */     }
/*     */     
/*     */     public T previous() {
/*     */       int oldCurrent = this.$current.element;
/*     */       SnapshotStateListKt.access$validateRange(oldCurrent, SubList.this.size());
/*     */       this.$current.element = oldCurrent - 1;
/*     */       return SubList.this.get(oldCurrent);
/*     */     }
/*     */     
/*     */     public int previousIndex() {
/*     */       return this.$current.element;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public Void add(Object element) {
/*     */       SnapshotStateListKt.access$modificationError();
/*     */       throw new KotlinNothingValueException();
/*     */     }
/*     */     
/*     */     public boolean hasNext() {
/*     */       return (this.$current.element < SubList.this.size() - 1);
/*     */     }
/*     */     
/*     */     public T next() {
/*     */       int newCurrent = this.$current.element + 1;
/*     */       SnapshotStateListKt.access$validateRange(newCurrent, SubList.this.size());
/*     */       this.$current.element = newCurrent;
/*     */       return SubList.this.get(newCurrent);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public Void remove() {
/*     */       SnapshotStateListKt.access$modificationError();
/*     */       throw new KotlinNothingValueException();
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public Void set(Object element) {
/*     */       SnapshotStateListKt.access$modificationError();
/*     */       throw new KotlinNothingValueException();
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean remove(Object element) {
/*     */     int index = indexOf(element);
/*     */     remove(index);
/*     */     return (index >= 0);
/*     */   }
/*     */   
/*     */   public boolean removeAll(@NotNull Collection elements) {
/*     */     Intrinsics.checkNotNullParameter(elements, "elements");
/*     */     boolean removed = false;
/*     */     for (Object element : elements)
/*     */       removed = (remove(element) || removed); 
/*     */     return removed;
/*     */   }
/*     */   
/*     */   public T removeAt(int index) {
/*     */     validateModification();
/*     */     T t = this.parentList.remove(this.offset + index);
/*     */     Object it = t;
/*     */     int $i$a$-also-SubList$removeAt$1 = 0;
/*     */     int i = size();
/*     */     this.size = i + -1;
/*     */     this.structure = this.parentList.getStructure$runtime();
/*     */     return t;
/*     */   }
/*     */   
/*     */   public boolean retainAll(@NotNull Collection<? extends T> elements) {
/*     */     Intrinsics.checkNotNullParameter(elements, "elements");
/*     */     validateModification();
/*     */     int removed = this.parentList.retainAllInRange$runtime(elements, this.offset, this.offset + size());
/*     */     if (removed > 0) {
/*     */       this.structure = this.parentList.getStructure$runtime();
/*     */       this.size = size() - removed;
/*     */     } 
/*     */     return (removed > 0);
/*     */   }
/*     */   
/*     */   public T set(int index, Object element) {
/*     */     SnapshotStateListKt.access$validateRange(index, size());
/*     */     validateModification();
/*     */     Object result = this.parentList.set(index + this.offset, (T)element);
/*     */     this.structure = this.parentList.getStructure$runtime();
/*     */     return (T)result;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public List<T> subList(int fromIndex, int toIndex) {
/*     */     // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: iload_1
/*     */     //   2: if_icmpgt -> 18
/*     */     //   5: iload_1
/*     */     //   6: iload_2
/*     */     //   7: if_icmpgt -> 14
/*     */     //   10: iconst_1
/*     */     //   11: goto -> 19
/*     */     //   14: iconst_0
/*     */     //   15: goto -> 19
/*     */     //   18: iconst_0
/*     */     //   19: ifeq -> 34
/*     */     //   22: iload_2
/*     */     //   23: aload_0
/*     */     //   24: invokevirtual size : ()I
/*     */     //   27: if_icmpgt -> 34
/*     */     //   30: iconst_1
/*     */     //   31: goto -> 35
/*     */     //   34: iconst_0
/*     */     //   35: istore_3
/*     */     //   36: iconst_0
/*     */     //   37: istore #4
/*     */     //   39: nop
/*     */     //   40: iload_3
/*     */     //   41: ifne -> 52
/*     */     //   44: iconst_0
/*     */     //   45: istore #5
/*     */     //   47: ldc 'fromIndex or toIndex are out of bounds'
/*     */     //   49: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*     */     //   52: nop
/*     */     //   53: aload_0
/*     */     //   54: invokespecial validateModification : ()V
/*     */     //   57: new androidx/compose/runtime/snapshots/SubList
/*     */     //   60: dup
/*     */     //   61: aload_0
/*     */     //   62: getfield parentList : Landroidx/compose/runtime/snapshots/SnapshotStateList;
/*     */     //   65: iload_1
/*     */     //   66: aload_0
/*     */     //   67: getfield offset : I
/*     */     //   70: iadd
/*     */     //   71: iload_2
/*     */     //   72: aload_0
/*     */     //   73: getfield offset : I
/*     */     //   76: iadd
/*     */     //   77: invokespecial <init> : (Landroidx/compose/runtime/snapshots/SnapshotStateList;II)V
/*     */     //   80: checkcast java/util/List
/*     */     //   83: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #485	-> 0
/*     */     //   #504	-> 39
/*     */     //   #507	-> 40
/*     */     //   #508	-> 44
/*     */     //   #486	-> 47
/*     */     //   #508	-> 49
/*     */     //   #510	-> 52
/*     */     //   #488	-> 53
/*     */     //   #489	-> 57
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   47	2	5	$i$a$-requirePrecondition-SubList$subList$1	I
/*     */     //   39	14	4	$i$f$requirePrecondition	I
/*     */     //   36	17	3	value$iv	Z
/*     */     //   0	84	0	this	Landroidx/compose/runtime/snapshots/SubList;
/*     */     //   0	84	1	fromIndex	I
/*     */     //   0	84	2	toIndex	I
/*     */   }
/*     */   
/*     */   private final void validateModification() {
/*     */     if (this.parentList.getStructure$runtime() != this.structure)
/*     */       throw new ConcurrentModificationException(); 
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


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\snapshots\SubList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */