/*     */ package androidx.collection;
/*     */ 
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\003\n\002\020\021\n\002\b\t\n\002\020\002\n\002\b\t\n\002\020\013\n\002\b\007\030\000*\004\b\000\020\0012\0020\002B\021\b\007\022\b\b\002\020\003\032\0020\004¢\006\002\020\005J\023\020\021\032\0020\0222\006\020\023\032\0028\000¢\006\002\020\024J\023\020\025\032\0020\0222\006\020\023\032\0028\000¢\006\002\020\024J\006\020\026\032\0020\022J\b\020\027\032\0020\022H\002J\026\020\030\032\0028\0002\006\020\031\032\0020\004H\002¢\006\002\020\032J\006\020\033\032\0020\034J\013\020\035\032\0028\000¢\006\002\020\fJ\013\020\036\032\0028\000¢\006\002\020\fJ\016\020\037\032\0020\0222\006\020 \032\0020\004J\016\020!\032\0020\0222\006\020 \032\0020\004J\006\020\"\032\0020\004R\016\020\006\032\0020\004X\016¢\006\002\n\000R\030\020\007\032\n\022\006\022\004\030\0018\0000\bX\016¢\006\004\n\002\020\tR\021\020\n\032\0028\0008F¢\006\006\032\004\b\013\020\fR\016\020\r\032\0020\004X\016¢\006\002\n\000R\021\020\016\032\0028\0008F¢\006\006\032\004\b\017\020\fR\016\020\020\032\0020\004X\016¢\006\002\n\000¨\006#"}, d2 = {"Landroidx/collection/CircularArray;", "E", "", "minCapacity", "", "(I)V", "capacityBitmask", "elements", "", "[Ljava/lang/Object;", "first", "getFirst", "()Ljava/lang/Object;", "head", "last", "getLast", "tail", "addFirst", "", "element", "(Ljava/lang/Object;)V", "addLast", "clear", "doubleCapacity", "get", "index", "(I)Ljava/lang/Object;", "isEmpty", "", "popFirst", "popLast", "removeFromEnd", "count", "removeFromStart", "size", "collection"})
/*     */ @SourceDebugExtension({"SMAP\nCircularArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,270:1\n1#2:271\n26#3:272\n26#3:273\n26#3:274\n26#3:275\n26#3:276\n26#3:277\n26#3:278\n*S KotlinDebug\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n*L\n104#1:272\n122#1:273\n152#1:274\n187#1:275\n221#1:276\n235#1:277\n249#1:278\n*E\n"})
/*     */ public final class CircularArray<E> {
/*     */   @NotNull
/*     */   private E[] elements;
/*     */   private int head;
/*     */   private int tail;
/*     */   private int capacityBitmask;
/*     */   
/*     */   private final void doubleCapacity() {
/*     */     int n = this.elements.length;
/*     */     int r = n - this.head;
/*     */     int newCapacity = n << 1;
/*     */     if (newCapacity < 0)
/*     */       throw new RuntimeException("Max array capacity exceeded"); 
/*     */     Object[] a = new Object[newCapacity];
/*     */     ArraysKt.copyInto((Object[])this.elements, a, 0, this.head, n);
/*     */     ArraysKt.copyInto((Object[])this.elements, a, r, 0, this.head);
/*     */     this.elements = (E[])a;
/*     */     this.head = 0;
/*     */     this.tail = n;
/*     */     this.capacityBitmask = newCapacity - 1;
/*     */   }
/*     */   
/*     */   public final void addFirst(Object element) {
/*     */     this.head = this.head - 1 & this.capacityBitmask;
/*     */     this.elements[this.head] = (E)element;
/*     */     if (this.head == this.tail)
/*     */       doubleCapacity(); 
/*     */   }
/*     */   
/*     */   @JvmOverloads
/*  38 */   public CircularArray(int minCapacity) { if (!((minCapacity >= 1) ? 1 : 0))
/*     */     
/*     */     { 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 271 */       int $i$a$-require-CircularArray$1 = 0; String str = "capacity must be >= 1"; throw new IllegalArgumentException(str.toString()); }  if (!((minCapacity <= 1073741824) ? 1 : 0)) { int $i$a$-require-CircularArray$2 = 0; String str = "capacity must be <= 2^30"; throw new IllegalArgumentException(str.toString()); }  int arrayCapacity = (Integer.bitCount(minCapacity) != 1) ? (Integer.highestOneBit(minCapacity - 1) << 1) : minCapacity; this.capacityBitmask = arrayCapacity - 1; this.elements = (E[])new Object[arrayCapacity]; }
/* 272 */   public final void addLast(Object element) { this.elements[this.tail] = (E)element; this.tail = this.tail + 1 & this.capacityBitmask; if (this.tail == this.head) doubleCapacity();  } public final E popFirst() { if (this.head == this.tail) { CollectionPlatformUtils this_$iv = CollectionPlatformUtils.INSTANCE; int $i$f$createIndexOutOfBoundsException$collection = 0; throw new ArrayIndexOutOfBoundsException(); }
/* 273 */      Object result = this.elements[this.head]; this.elements[this.head] = null; this.head = this.head + 1 & this.capacityBitmask; return (E)result; } public final E popLast() { if (this.head == this.tail) { CollectionPlatformUtils this_$iv = CollectionPlatformUtils.INSTANCE; int $i$f$createIndexOutOfBoundsException$collection = 0; throw new ArrayIndexOutOfBoundsException(); }  int t = this.tail - 1 & this.capacityBitmask; Object result = this.elements[t]; this.elements[t] = null; this.tail = t; return (E)result; } public final void clear() { removeFromStart(size()); }
/* 274 */   public final void removeFromStart(int count) { if (count <= 0) return;  if (count > size()) { CollectionPlatformUtils this_$iv = CollectionPlatformUtils.INSTANCE; int $i$f$createIndexOutOfBoundsException$collection = 0; throw new ArrayIndexOutOfBoundsException(); }  int numOfElements = count; int end = this.elements.length; if (numOfElements < end - this.head) end = this.head + numOfElements;  for (int i = this.head, j = end; i < j; i++) this.elements[i] = null;  int removed = end - this.head; numOfElements -= removed; this.head = this.head + removed & this.capacityBitmask; if (numOfElements > 0) { for (int k = 0, m = numOfElements; k < m; k++) this.elements[k] = null;  this.head = numOfElements; }  } public final void removeFromEnd(int count) { if (count <= 0)
/* 275 */       return;  if (count > size()) { CollectionPlatformUtils this_$iv = CollectionPlatformUtils.INSTANCE; int $i$f$createIndexOutOfBoundsException$collection = 0; throw new ArrayIndexOutOfBoundsException(); }  int numOfElements = count; int start = 0; if (numOfElements < this.tail) start = this.tail - numOfElements;  for (int i = start, j = this.tail; i < j; i++) this.elements[i] = null;  int removed = this.tail - start; numOfElements -= removed; this.tail -= removed; if (numOfElements > 0) { this.tail = this.elements.length; int newTail = this.tail - numOfElements; for (int k = newTail, m = this.tail; k < m; k++)
/* 276 */         this.elements[k] = null;  this.tail = newTail; }  } public final E getFirst() { if (this.head == this.tail) { CollectionPlatformUtils this_$iv = CollectionPlatformUtils.INSTANCE; int $i$f$createIndexOutOfBoundsException$collection = 0; throw new ArrayIndexOutOfBoundsException(); }
/* 277 */      Intrinsics.checkNotNull(this.elements[this.head]); return this.elements[this.head]; } public final E getLast() { if (this.head == this.tail) { CollectionPlatformUtils this_$iv = CollectionPlatformUtils.INSTANCE; int $i$f$createIndexOutOfBoundsException$collection = 0; throw new ArrayIndexOutOfBoundsException(); }
/* 278 */      Intrinsics.checkNotNull(this.elements[this.tail - 1 & this.capacityBitmask]); return this.elements[this.tail - 1 & this.capacityBitmask]; } public final E get(int index) { if (index < 0 || index >= size()) { CollectionPlatformUtils this_$iv = CollectionPlatformUtils.INSTANCE; int $i$f$createIndexOutOfBoundsException$collection = 0; throw new ArrayIndexOutOfBoundsException(); }
/*     */     
/*     */     Intrinsics.checkNotNull(this.elements[this.head + index & this.capacityBitmask]);
/*     */     return this.elements[this.head + index & this.capacityBitmask]; }
/*     */ 
/*     */   
/*     */   public final int size() {
/*     */     return this.tail - this.head & this.capacityBitmask;
/*     */   }
/*     */   
/*     */   public final boolean isEmpty() {
/*     */     return (this.head == this.tail);
/*     */   }
/*     */   
/*     */   @JvmOverloads
/*     */   public CircularArray() {
/*     */     this(0, 1, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\CircularArray.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */