/*     */ package androidx.collection;
/*     */ 
/*     */ import androidx.annotation.IntRange;
/*     */ import java.util.Arrays;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\005\n\002\020\002\n\002\b\002\n\002\020\t\n\002\020\013\n\002\b\002\n\002\020\026\n\002\b\021\030\0002\0020\001B\017\022\b\b\002\020\002\032\0020\003¢\006\002\020\004J\030\020\b\032\0020\t2\b\b\001\020\n\032\0020\0032\006\020\013\032\0020\fJ\016\020\b\032\0020\r2\006\020\013\032\0020\fJ\016\020\016\032\0020\r2\006\020\017\032\0020\001J\030\020\016\032\0020\r2\b\b\001\020\n\032\0020\0032\006\020\017\032\0020\001J\030\020\016\032\0020\r2\b\b\001\020\n\032\0020\0032\006\020\017\032\0020\020J\016\020\016\032\0020\r2\006\020\017\032\0020\020J\006\020\021\032\0020\tJ\016\020\022\032\0020\t2\006\020\005\032\0020\003J\021\020\023\032\0020\t2\006\020\017\032\0020\001H\002J\021\020\023\032\0020\t2\006\020\013\032\0020\fH\nJ\021\020\023\032\0020\t2\006\020\017\032\0020\020H\002J\021\020\024\032\0020\t2\006\020\017\032\0020\001H\002J\021\020\024\032\0020\t2\006\020\013\032\0020\fH\nJ\021\020\024\032\0020\t2\006\020\017\032\0020\020H\002J\016\020\025\032\0020\r2\006\020\013\032\0020\fJ\016\020\026\032\0020\r2\006\020\017\032\0020\001J\016\020\026\032\0020\r2\006\020\017\032\0020\020J\020\020\027\032\0020\f2\b\b\001\020\n\032\0020\003J\032\020\030\032\0020\t2\b\b\001\020\031\032\0020\0032\b\b\001\020\032\032\0020\003J\016\020\033\032\0020\r2\006\020\017\032\0020\001J\016\020\033\032\0020\r2\006\020\017\032\0020\020J\033\020\034\032\0020\f2\b\b\001\020\n\032\0020\0032\006\020\013\032\0020\fH\002J\006\020\035\032\0020\tJ\006\020\036\032\0020\tJ\020\020\037\032\0020\t2\b\b\002\020 \032\0020\003R\022\020\005\032\0020\0038Æ\002¢\006\006\032\004\b\006\020\007¨\006!"}, d2 = {"Landroidx/collection/MutableLongList;", "Landroidx/collection/LongList;", "initialCapacity", "", "(I)V", "capacity", "getCapacity", "()I", "add", "", "index", "element", "", "", "addAll", "elements", "", "clear", "ensureCapacity", "minusAssign", "plusAssign", "remove", "removeAll", "removeAt", "removeRange", "start", "end", "retainAll", "set", "sort", "sortDescending", "trim", "minCapacity", "collection"})
/*     */ @SourceDebugExtension({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/MutableLongList\n+ 2 LongList.kt\nandroidx/collection/LongList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,969:1\n549#1:970\n70#2:971\n253#2,6:974\n70#2:980\n70#2:981\n70#2:982\n70#2:989\n70#2:990\n13607#3,2:972\n1675#3,6:983\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/MutableLongList\n*L\n692#1:970\n753#1:971\n772#1:974,6\n783#1:980\n787#1:981\n834#1:982\n850#1:989\n869#1:990\n763#1:972,2\n836#1:983,6\n*E\n"})
/*     */ public final class MutableLongList
/*     */   extends LongList
/*     */ {
/*     */   public MutableLongList(int initialCapacity) {
/* 541 */     super(initialCapacity, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int getCapacity() {
/* 549 */     int $i$f$getCapacity = 0; return this.content.length;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean add(long element) {
/* 555 */     ensureCapacity(this._size + 1);
/* 556 */     this.content[this._size] = element;
/* 557 */     int i = this._size; this._size = i + 1;
/* 558 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void add(@IntRange(from = 0L) int index, long element) {
/* 567 */     if (!((0 <= index) ? ((index <= this._size) ? 1 : 0) : 0)) {
/* 568 */       throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
/*     */     }
/* 570 */     ensureCapacity(this._size + 1);
/* 571 */     long[] content = this.content;
/* 572 */     if (index != this._size) {
/* 573 */       ArraysKt.copyInto(content, 
/* 574 */           content, 
/* 575 */           index + 1, 
/* 576 */           index, 
/* 577 */           this._size);
/*     */     }
/*     */     
/* 580 */     content[index] = element;
/* 581 */     int i = this._size; this._size = i + 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean addAll(@IntRange(from = 0L) int index, @NotNull long[] elements) {
/* 594 */     Intrinsics.checkNotNullParameter(elements, "elements"); if (!((0 <= index) ? ((index <= this._size) ? 1 : 0) : 0)) {
/* 595 */       throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
/*     */     }
/* 597 */     if ((elements.length == 0)) return false; 
/* 598 */     ensureCapacity(this._size + elements.length);
/* 599 */     long[] content = this.content;
/* 600 */     if (index != this._size) {
/* 601 */       ArraysKt.copyInto(content, 
/* 602 */           content, 
/* 603 */           index + elements.length, 
/* 604 */           index, 
/* 605 */           this._size);
/*     */     }
/*     */     
/* 608 */     ArraysKt.copyInto$default(elements, content, index, 0, 0, 12, null);
/* 609 */     this._size += elements.length;
/* 610 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean addAll(@IntRange(from = 0L) int index, @NotNull LongList elements) {
/* 623 */     Intrinsics.checkNotNullParameter(elements, "elements"); if (!((0 <= index) ? ((index <= this._size) ? 1 : 0) : 0)) {
/* 624 */       throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
/*     */     }
/* 626 */     if (elements.isEmpty()) return false; 
/* 627 */     ensureCapacity(this._size + elements._size);
/* 628 */     long[] content = this.content;
/* 629 */     if (index != this._size) {
/* 630 */       ArraysKt.copyInto(content, 
/* 631 */           content, 
/* 632 */           index + elements._size, 
/* 633 */           index, 
/* 634 */           this._size);
/*     */     }
/*     */     
/* 637 */     ArraysKt.copyInto(elements.content, 
/* 638 */         content, 
/* 639 */         index, 
/* 640 */         0, 
/* 641 */         elements._size);
/*     */     
/* 643 */     this._size += elements._size;
/* 644 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean addAll(@NotNull LongList elements) {
/* 652 */     Intrinsics.checkNotNullParameter(elements, "elements"); return addAll(this._size, elements);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean addAll(@NotNull long[] elements) {
/* 660 */     Intrinsics.checkNotNullParameter(elements, "elements"); return addAll(this._size, elements);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void plusAssign(@NotNull LongList elements) {
/* 667 */     Intrinsics.checkNotNullParameter(elements, "elements"); addAll(this._size, elements);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void plusAssign(@NotNull long[] elements) {
/* 674 */     Intrinsics.checkNotNullParameter(elements, "elements"); addAll(this._size, elements);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void clear() {
/* 682 */     this._size = 0;
/*     */   }
/*     */   public final void ensureCapacity(int capacity) { long[] oldContent = this.content; if (oldContent.length < capacity) {
/*     */       int newSize = Math.max(capacity, oldContent.length * 3 / 2); Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(oldContent, newSize), "copyOf(this, newSize)"); this.content = Arrays.copyOf(oldContent, newSize);
/*     */     }  }
/*     */   public final void plusAssign(long element) { int $i$f$plusAssign = 0; add(element); }
/*     */   public final void minusAssign(long element) { int $i$f$minusAssign = 0; remove(element); } public final boolean remove(long element) { int index = indexOf(element); if (index >= 0) {
/*     */       removeAt(index); return true;
/*     */     } 
/* 691 */     return false; } public final void trim(int minCapacity) { int minSize = Math.max(minCapacity, this._size);
/* 692 */     MutableLongList this_$iv = this; int $i$f$getCapacity = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 970 */     if (this_$iv.content.length > minSize) { Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.content, minSize), "copyOf(this, newSize)"); this.content = Arrays.copyOf(this.content, minSize); }  }
/* 971 */   public final boolean removeAll(@NotNull long[] elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int initialSize = this._size; for (int i = 0, j = elements.length; i < j; i++) remove(elements[i]);  return (initialSize != this._size); } public final boolean removeAll(@NotNull LongList elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int initialSize = this._size; int i = 0; LongList this_$iv = elements; int $i$f$getLastIndex = 0, j = this_$iv._size - 1; if (i <= j)
/* 972 */       while (true) { remove(elements.get(i)); if (i != j) { i++; continue; }  break; }   return (initialSize != this._size); } public final void minusAssign(@NotNull long[] elements) { Intrinsics.checkNotNullParameter(elements, "elements"); long[] $this$forEach$iv = elements; int $i$f$forEach = 0; byte b = 0; int i = $this$forEach$iv.length; if (b < i) { long element$iv = $this$forEach$iv[b], element = element$iv; int $i$a$-forEach-MutableLongList$minusAssign$1 = 0; remove(element); }
/*     */      } public final void minusAssign(@NotNull LongList elements) { Intrinsics.checkNotNullParameter(elements, "elements"); LongList this_$iv = elements;
/*     */     int $i$f$forEach = 0;
/* 975 */     long[] content$iv = this_$iv.content;
/* 976 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i) {
/* 977 */       long element = content$iv[i$iv]; int $i$a$-forEach-MutableLongList$minusAssign$2 = 0; remove(element);
/*     */     }  } public final long removeAt(@IntRange(from = 0L) int index) { if (!((0 <= index) ? ((index < this._size) ? 1 : 0) : 0)) {
/*     */       LongList longList = this; int j = 0;
/* 980 */       throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + (longList._size - 1));
/* 981 */     }  long[] content = this.content; long item = content[index]; LongList this_$iv = this; int $i$f$getLastIndex = 0; if (index != this_$iv._size - 1)
/*     */       ArraysKt.copyInto(content, content, index, index + 1, this._size);  int i = this._size; this._size = i + -1; return item; } public final void removeRange(@IntRange(from = 0L) int start, @IntRange(from = 0L) int end) { if ((0 <= start) ? ((start <= this._size)) : false)
/*     */       if ((0 <= end) ? ((end <= this._size)) : false) { if (end < start)
/*     */           throw new IllegalArgumentException("Start (" + start + ") is more than end (" + end + ')');  if (end != start) { if (end < this._size)
/*     */             ArraysKt.copyInto(this.content, this.content, start, end, this._size);  this._size -= end - start; }
/*     */          return; }
/*     */         throw new IndexOutOfBoundsException("Start (" + start + ") and end (" + end + ") must be in 0.." + this._size); }
/*     */   public final boolean retainAll(@NotNull long[] elements) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'elements'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield _size : I
/*     */     //   10: istore_2
/*     */     //   11: aload_0
/*     */     //   12: getfield content : [J
/*     */     //   15: astore_3
/*     */     //   16: aload_0
/*     */     //   17: checkcast androidx/collection/LongList
/*     */     //   20: astore #5
/*     */     //   22: iconst_0
/*     */     //   23: istore #6
/*     */     //   25: aload #5
/*     */     //   27: getfield _size : I
/*     */     //   30: iconst_1
/*     */     //   31: isub
/*     */     //   32: istore #4
/*     */     //   34: iconst_m1
/*     */     //   35: iload #4
/*     */     //   37: if_icmpge -> 121
/*     */     //   40: aload_3
/*     */     //   41: iload #4
/*     */     //   43: laload
/*     */     //   44: lstore #5
/*     */     //   46: aload_1
/*     */     //   47: astore #7
/*     */     //   49: iconst_0
/*     */     //   50: istore #8
/*     */     //   52: iconst_0
/*     */     //   53: istore #9
/*     */     //   55: aload #7
/*     */     //   57: arraylength
/*     */     //   58: istore #10
/*     */     //   60: iload #9
/*     */     //   62: iload #10
/*     */     //   64: if_icmpge -> 104
/*     */     //   67: aload #7
/*     */     //   69: iload #9
/*     */     //   71: laload
/*     */     //   72: lstore #11
/*     */     //   74: iconst_0
/*     */     //   75: istore #13
/*     */     //   77: lload #11
/*     */     //   79: lload #5
/*     */     //   81: lcmp
/*     */     //   82: ifne -> 89
/*     */     //   85: iconst_1
/*     */     //   86: goto -> 90
/*     */     //   89: iconst_0
/*     */     //   90: ifeq -> 98
/*     */     //   93: iload #9
/*     */     //   95: goto -> 105
/*     */     //   98: iinc #9, 1
/*     */     //   101: goto -> 60
/*     */     //   104: iconst_m1
/*     */     //   105: ifge -> 115
/*     */     //   108: aload_0
/*     */     //   109: iload #4
/*     */     //   111: invokevirtual removeAt : (I)J
/*     */     //   114: pop2
/*     */     //   115: iinc #4, -1
/*     */     //   118: goto -> 34
/*     */     //   121: iload_2
/*     */     //   122: aload_0
/*     */     //   123: getfield _size : I
/*     */     //   126: if_icmpeq -> 133
/*     */     //   129: iconst_1
/*     */     //   130: goto -> 134
/*     */     //   133: iconst_0
/*     */     //   134: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #832	-> 6
/*     */     //   #833	-> 11
/*     */     //   #834	-> 16
/*     */     //   #982	-> 25
/*     */     //   #834	-> 32
/*     */     //   #835	-> 40
/*     */     //   #836	-> 46
/*     */     //   #983	-> 52
/*     */     //   #984	-> 67
/*     */     //   #836	-> 77
/*     */     //   #984	-> 90
/*     */     //   #985	-> 93
/*     */     //   #983	-> 98
/*     */     //   #988	-> 104
/*     */     //   #836	-> 105
/*     */     //   #837	-> 108
/*     */     //   #834	-> 115
/*     */     //   #840	-> 121
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   25	7	6	$i$f$getLastIndex	I
/*     */     //   22	10	5	this_$iv	Landroidx/collection/LongList;
/*     */     //   77	13	13	$i$a$-indexOfFirst-MutableLongList$retainAll$1	I
/*     */     //   74	16	11	it	J
/*     */     //   55	49	9	index$iv	I
/*     */     //   52	53	8	$i$f$indexOfFirst	I
/*     */     //   49	56	7	$this$indexOfFirst$iv	[J
/*     */     //   46	69	5	item	J
/*     */     //   34	87	4	i	I
/*     */     //   11	124	2	initialSize	I
/*     */     //   16	119	3	content	[J
/*     */     //   0	135	0	this	Landroidx/collection/MutableLongList;
/*     */     //   0	135	1	elements	[J }
/* 989 */   public final boolean retainAll(@NotNull LongList elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int initialSize = this._size; long[] content = this.content; int i; LongList this_$iv; int $i$f$getLastIndex; for (this_$iv = this, $i$f$getLastIndex = 0, i = this_$iv._size - 1; -1 < i; i--) { long item = content[i]; if (!elements.contains(item))
/* 990 */         removeAt(i);  }  return (initialSize != this._size); } public final long set(@IntRange(from = 0L) int index, long element) { if (!((0 <= index) ? ((index < this._size) ? 1 : 0) : 0)) { LongList this_$iv = this; int $i$f$getLastIndex = 0; throw new IndexOutOfBoundsException("set index " + index + " must be between 0 .. " + (this_$iv._size - 1)); }
/*     */     
/*     */     long[] content = this.content;
/*     */     long old = content[index];
/*     */     content[index] = element;
/*     */     return old; }
/*     */ 
/*     */   
/*     */   public final void sort() {
/*     */     ArraysKt.sort(this.content, 0, this._size);
/*     */   }
/*     */   
/*     */   public final void sortDescending() {
/*     */     ArraysKt.sortDescending(this.content, 0, this._size);
/*     */   }
/*     */   
/*     */   public MutableLongList() {
/*     */     this(0, 1, (DefaultConstructorMarker)null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\MutableLongList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */