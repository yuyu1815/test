/*     */ package androidx.collection;
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\003\n\002\020\025\n\002\b\b\n\002\020\002\n\002\b\007\n\002\020\013\n\002\b\007\030\0002\0020\001B\021\b\007\022\b\b\002\020\002\032\0020\003¢\006\002\020\004J\016\020\017\032\0020\0202\006\020\021\032\0020\003J\016\020\022\032\0020\0202\006\020\021\032\0020\003J\006\020\023\032\0020\020J\b\020\024\032\0020\020H\002J\021\020\025\032\0020\0032\006\020\026\032\0020\003H\002J\006\020\027\032\0020\030J\006\020\031\032\0020\003J\006\020\032\032\0020\003J\016\020\033\032\0020\0202\006\020\034\032\0020\003J\016\020\035\032\0020\0202\006\020\034\032\0020\003J\006\020\036\032\0020\003R\016\020\005\032\0020\003X\016¢\006\002\n\000R\016\020\006\032\0020\007X\016¢\006\002\n\000R\021\020\b\032\0020\0038F¢\006\006\032\004\b\t\020\nR\016\020\013\032\0020\003X\016¢\006\002\n\000R\021\020\f\032\0020\0038F¢\006\006\032\004\b\r\020\nR\016\020\016\032\0020\003X\016¢\006\002\n\000¨\006\037"}, d2 = {"Landroidx/collection/CircularIntArray;", "", "minCapacity", "", "(I)V", "capacityBitmask", "elements", "", "first", "getFirst", "()I", "head", "last", "getLast", "tail", "addFirst", "", "element", "addLast", "clear", "doubleCapacity", "get", "index", "isEmpty", "", "popFirst", "popLast", "removeFromEnd", "count", "removeFromStart", "size", "collection"})
/*     */ @SourceDebugExtension({"SMAP\nCircularIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,213:1\n1#2:214\n26#3:215\n26#3:216\n26#3:217\n26#3:218\n26#3:219\n26#3:220\n26#3:221\n*S KotlinDebug\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n*L\n100#1:215\n113#1:216\n139#1:217\n156#1:218\n169#1:219\n181#1:220\n193#1:221\n*E\n"})
/*     */ public final class CircularIntArray { @NotNull
/*     */   private int[] elements; private int head; private int tail; private int capacityBitmask;
/*     */   
/*     */   private final void doubleCapacity() {
/*     */     int n = this.elements.length;
/*     */     int r = n - this.head;
/*     */     int newCapacity = n << 1;
/*     */     if (newCapacity < 0)
/*     */       throw new RuntimeException("Max array capacity exceeded"); 
/*     */     int[] a = new int[newCapacity];
/*     */     ArraysKt.copyInto(this.elements, a, 0, this.head, n);
/*     */     ArraysKt.copyInto(this.elements, a, r, 0, this.head);
/*     */     this.elements = a;
/*     */     this.head = 0;
/*     */     this.tail = n;
/*     */     this.capacityBitmask = newCapacity - 1;
/*     */   }
/*     */   
/*     */   public final void addFirst(int element) {
/*     */     this.head = this.head - 1 & this.capacityBitmask;
/*     */     this.elements[this.head] = element;
/*     */     if (this.head == this.tail)
/*     */       doubleCapacity(); 
/*     */   }
/*     */   
/*     */   public final void addLast(int element) {
/*     */     this.elements[this.tail] = element;
/*     */     this.tail = this.tail + 1 & this.capacityBitmask;
/*     */     if (this.tail == this.head)
/*     */       doubleCapacity(); 
/*     */   }
/*     */   
/*     */   @JvmOverloads
/*  37 */   public CircularIntArray(int minCapacity) { if (!((minCapacity >= 1) ? 1 : 0))
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
/* 214 */       int $i$a$-require-CircularIntArray$1 = 0; String str = "capacity must be >= 1"; throw new IllegalArgumentException(str.toString()); }  if (!((minCapacity <= 1073741824) ? 1 : 0)) { int $i$a$-require-CircularIntArray$2 = 0; String str = "capacity must be <= 2^30"; throw new IllegalArgumentException(str.toString()); }
/* 215 */      int arrayCapacity = (Integer.bitCount(minCapacity) != 1) ? (Integer.highestOneBit(minCapacity - 1) << 1) : minCapacity; this.capacityBitmask = arrayCapacity - 1; this.elements = new int[arrayCapacity]; } public final int popFirst() { if (this.head == this.tail) { CollectionPlatformUtils this_$iv = CollectionPlatformUtils.INSTANCE; int $i$f$createIndexOutOfBoundsException$collection = 0; throw new ArrayIndexOutOfBoundsException(); }
/* 216 */      int result = this.elements[this.head]; this.head = this.head + 1 & this.capacityBitmask; return result; } public final int popLast() { if (this.head == this.tail) { CollectionPlatformUtils this_$iv = CollectionPlatformUtils.INSTANCE; int $i$f$createIndexOutOfBoundsException$collection = 0; throw new ArrayIndexOutOfBoundsException(); }  int t = this.tail - 1 & this.capacityBitmask; int result = this.elements[t]; this.tail = t; return result; } public final void clear() { this.tail = this.head; }
/* 217 */   public final void removeFromStart(int count) { if (count <= 0) return;  if (count > size()) { CollectionPlatformUtils this_$iv = CollectionPlatformUtils.INSTANCE; int $i$f$createIndexOutOfBoundsException$collection = 0; throw new ArrayIndexOutOfBoundsException(); }  this.head = this.head + count & this.capacityBitmask; } public final void removeFromEnd(int count) { if (count <= 0)
/* 218 */       return;  if (count > size()) { CollectionPlatformUtils this_$iv = CollectionPlatformUtils.INSTANCE; int $i$f$createIndexOutOfBoundsException$collection = 0; throw new ArrayIndexOutOfBoundsException(); }
/* 219 */      this.tail = this.tail - count & this.capacityBitmask; } public final int getFirst() { if (this.head == this.tail) { CollectionPlatformUtils this_$iv = CollectionPlatformUtils.INSTANCE; int $i$f$createIndexOutOfBoundsException$collection = 0; throw new ArrayIndexOutOfBoundsException(); }
/* 220 */      return this.elements[this.head]; } public final int getLast() { if (this.head == this.tail) { CollectionPlatformUtils this_$iv = CollectionPlatformUtils.INSTANCE; int $i$f$createIndexOutOfBoundsException$collection = 0; throw new ArrayIndexOutOfBoundsException(); }
/* 221 */      return this.elements[this.tail - 1 & this.capacityBitmask]; } public final int get(int index) { if (index < 0 || index >= size()) { CollectionPlatformUtils this_$iv = CollectionPlatformUtils.INSTANCE; int $i$f$createIndexOutOfBoundsException$collection = 0; throw new ArrayIndexOutOfBoundsException(); }
/*     */     
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
/*     */   public CircularIntArray() {
/*     */     this(0, 1, null);
/*     */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\CircularIntArray.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */