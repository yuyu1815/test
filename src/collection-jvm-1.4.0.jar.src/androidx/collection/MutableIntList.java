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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\005\n\002\020\013\n\000\n\002\020\002\n\002\b\003\n\002\020\025\n\002\b\021\030\0002\0020\001B\017\022\b\b\002\020\002\032\0020\003¢\006\002\020\004J\016\020\b\032\0020\t2\006\020\n\032\0020\003J\030\020\b\032\0020\0132\b\b\001\020\f\032\0020\0032\006\020\n\032\0020\003J\016\020\r\032\0020\t2\006\020\016\032\0020\001J\030\020\r\032\0020\t2\b\b\001\020\f\032\0020\0032\006\020\016\032\0020\001J\030\020\r\032\0020\t2\b\b\001\020\f\032\0020\0032\006\020\016\032\0020\017J\016\020\r\032\0020\t2\006\020\016\032\0020\017J\006\020\020\032\0020\013J\016\020\021\032\0020\0132\006\020\005\032\0020\003J\021\020\022\032\0020\0132\006\020\016\032\0020\001H\002J\021\020\022\032\0020\0132\006\020\n\032\0020\003H\nJ\021\020\022\032\0020\0132\006\020\016\032\0020\017H\002J\021\020\023\032\0020\0132\006\020\016\032\0020\001H\002J\021\020\023\032\0020\0132\006\020\n\032\0020\003H\nJ\021\020\023\032\0020\0132\006\020\016\032\0020\017H\002J\016\020\024\032\0020\t2\006\020\n\032\0020\003J\016\020\025\032\0020\t2\006\020\016\032\0020\001J\016\020\025\032\0020\t2\006\020\016\032\0020\017J\020\020\026\032\0020\0032\b\b\001\020\f\032\0020\003J\032\020\027\032\0020\0132\b\b\001\020\030\032\0020\0032\b\b\001\020\031\032\0020\003J\016\020\032\032\0020\t2\006\020\016\032\0020\001J\016\020\032\032\0020\t2\006\020\016\032\0020\017J\033\020\033\032\0020\0032\b\b\001\020\f\032\0020\0032\006\020\n\032\0020\003H\002J\006\020\034\032\0020\013J\006\020\035\032\0020\013J\020\020\036\032\0020\0132\b\b\002\020\037\032\0020\003R\022\020\005\032\0020\0038Æ\002¢\006\006\032\004\b\006\020\007¨\006 "}, d2 = {"Landroidx/collection/MutableIntList;", "Landroidx/collection/IntList;", "initialCapacity", "", "(I)V", "capacity", "getCapacity", "()I", "add", "", "element", "", "index", "addAll", "elements", "", "clear", "ensureCapacity", "minusAssign", "plusAssign", "remove", "removeAll", "removeAt", "removeRange", "start", "end", "retainAll", "set", "sort", "sortDescending", "trim", "minCapacity", "collection"})
/*     */ @SourceDebugExtension({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n+ 2 IntList.kt\nandroidx/collection/IntList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,969:1\n549#1:970\n70#2:971\n253#2,6:974\n70#2:980\n70#2:981\n70#2:982\n70#2:989\n70#2:990\n13600#3,2:972\n1663#3,6:983\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n*L\n692#1:970\n753#1:971\n772#1:974,6\n783#1:980\n787#1:981\n834#1:982\n850#1:989\n869#1:990\n763#1:972,2\n836#1:983,6\n*E\n"})
/*     */ public final class MutableIntList
/*     */   extends IntList
/*     */ {
/*     */   public MutableIntList(int initialCapacity) {
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
/*     */   public final boolean add(int element) {
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
/*     */   public final void add(@IntRange(from = 0L) int index, int element) {
/* 567 */     if (!((0 <= index) ? ((index <= this._size) ? 1 : 0) : 0)) {
/* 568 */       throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
/*     */     }
/* 570 */     ensureCapacity(this._size + 1);
/* 571 */     int[] content = this.content;
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
/*     */   public final boolean addAll(@IntRange(from = 0L) int index, @NotNull int[] elements) {
/* 594 */     Intrinsics.checkNotNullParameter(elements, "elements"); if (!((0 <= index) ? ((index <= this._size) ? 1 : 0) : 0)) {
/* 595 */       throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
/*     */     }
/* 597 */     if ((elements.length == 0)) return false; 
/* 598 */     ensureCapacity(this._size + elements.length);
/* 599 */     int[] content = this.content;
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
/*     */   public final boolean addAll(@IntRange(from = 0L) int index, @NotNull IntList elements) {
/* 623 */     Intrinsics.checkNotNullParameter(elements, "elements"); if (!((0 <= index) ? ((index <= this._size) ? 1 : 0) : 0)) {
/* 624 */       throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
/*     */     }
/* 626 */     if (elements.isEmpty()) return false; 
/* 627 */     ensureCapacity(this._size + elements._size);
/* 628 */     int[] content = this.content;
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
/*     */   public final boolean addAll(@NotNull IntList elements) {
/* 652 */     Intrinsics.checkNotNullParameter(elements, "elements"); return addAll(this._size, elements);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean addAll(@NotNull int[] elements) {
/* 660 */     Intrinsics.checkNotNullParameter(elements, "elements"); return addAll(this._size, elements);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void plusAssign(@NotNull IntList elements) {
/* 667 */     Intrinsics.checkNotNullParameter(elements, "elements"); addAll(this._size, elements);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void plusAssign(@NotNull int[] elements) {
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
/*     */   public final void ensureCapacity(int capacity) { int[] oldContent = this.content; if (oldContent.length < capacity) {
/*     */       int newSize = Math.max(capacity, oldContent.length * 3 / 2); Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(oldContent, newSize), "copyOf(this, newSize)"); this.content = Arrays.copyOf(oldContent, newSize);
/*     */     }  }
/*     */   public final void plusAssign(int element) { int $i$f$plusAssign = 0; add(element); }
/*     */   public final void minusAssign(int element) { int $i$f$minusAssign = 0; remove(element); } public final boolean remove(int element) { int index = indexOf(element); if (index >= 0) {
/*     */       removeAt(index); return true;
/*     */     } 
/* 691 */     return false; } public final void trim(int minCapacity) { int minSize = Math.max(minCapacity, this._size);
/* 692 */     MutableIntList this_$iv = this; int $i$f$getCapacity = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 971 */   public final boolean removeAll(@NotNull int[] elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int initialSize = this._size; for (int i = 0, j = elements.length; i < j; i++) remove(elements[i]);  return (initialSize != this._size); } public final boolean removeAll(@NotNull IntList elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int initialSize = this._size; int i = 0; IntList this_$iv = elements; int $i$f$getLastIndex = 0, j = this_$iv._size - 1; if (i <= j)
/* 972 */       while (true) { remove(elements.get(i)); if (i != j) { i++; continue; }  break; }   return (initialSize != this._size); } public final void minusAssign(@NotNull int[] elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int $this$forEach$iv[] = elements, $i$f$forEach = 0; byte b = 0; int i = $this$forEach$iv.length; if (b < i) { int element$iv = $this$forEach$iv[b], element = element$iv, $i$a$-forEach-MutableIntList$minusAssign$1 = 0; remove(element); }
/*     */      } public final void minusAssign(@NotNull IntList elements) { Intrinsics.checkNotNullParameter(elements, "elements"); IntList this_$iv = elements;
/*     */     int $i$f$forEach = 0;
/* 975 */     int[] content$iv = this_$iv.content;
/* 976 */     int i$iv = 0, i = this_$iv._size; if (i$iv < i) {
/* 977 */       int element = content$iv[i$iv], $i$a$-forEach-MutableIntList$minusAssign$2 = 0; remove(element);
/*     */     }  } public final int removeAt(@IntRange(from = 0L) int index) { if (!((0 <= index) ? ((index < this._size) ? 1 : 0) : 0)) {
/*     */       IntList intList = this; int j = 0;
/* 980 */       throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + (intList._size - 1));
/* 981 */     }  int[] content = this.content; int item = content[index]; IntList this_$iv = this; int $i$f$getLastIndex = 0; if (index != this_$iv._size - 1)
/*     */       ArraysKt.copyInto(content, content, index, index + 1, this._size);  int i = this._size; this._size = i + -1; return item; } public final void removeRange(@IntRange(from = 0L) int start, @IntRange(from = 0L) int end) { if ((0 <= start) ? ((start <= this._size)) : false)
/*     */       if ((0 <= end) ? ((end <= this._size)) : false) { if (end < start)
/*     */           throw new IllegalArgumentException("Start (" + start + ") is more than end (" + end + ')');  if (end != start) { if (end < this._size)
/*     */             ArraysKt.copyInto(this.content, this.content, start, end, this._size);  this._size -= end - start; }
/*     */          return; }
/*     */         throw new IndexOutOfBoundsException("Start (" + start + ") and end (" + end + ") must be in 0.." + this._size); }
/*     */   public final boolean retainAll(@NotNull int[] elements) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'elements'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield _size : I
/*     */     //   10: istore_2
/*     */     //   11: aload_0
/*     */     //   12: getfield content : [I
/*     */     //   15: astore_3
/*     */     //   16: aload_0
/*     */     //   17: checkcast androidx/collection/IntList
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
/*     */     //   37: if_icmpge -> 120
/*     */     //   40: aload_3
/*     */     //   41: iload #4
/*     */     //   43: iaload
/*     */     //   44: istore #5
/*     */     //   46: aload_1
/*     */     //   47: astore #6
/*     */     //   49: iconst_0
/*     */     //   50: istore #7
/*     */     //   52: iconst_0
/*     */     //   53: istore #8
/*     */     //   55: aload #6
/*     */     //   57: arraylength
/*     */     //   58: istore #9
/*     */     //   60: iload #8
/*     */     //   62: iload #9
/*     */     //   64: if_icmpge -> 103
/*     */     //   67: aload #6
/*     */     //   69: iload #8
/*     */     //   71: iaload
/*     */     //   72: istore #10
/*     */     //   74: iconst_0
/*     */     //   75: istore #11
/*     */     //   77: iload #10
/*     */     //   79: iload #5
/*     */     //   81: if_icmpne -> 88
/*     */     //   84: iconst_1
/*     */     //   85: goto -> 89
/*     */     //   88: iconst_0
/*     */     //   89: ifeq -> 97
/*     */     //   92: iload #8
/*     */     //   94: goto -> 104
/*     */     //   97: iinc #8, 1
/*     */     //   100: goto -> 60
/*     */     //   103: iconst_m1
/*     */     //   104: ifge -> 114
/*     */     //   107: aload_0
/*     */     //   108: iload #4
/*     */     //   110: invokevirtual removeAt : (I)I
/*     */     //   113: pop
/*     */     //   114: iinc #4, -1
/*     */     //   117: goto -> 34
/*     */     //   120: iload_2
/*     */     //   121: aload_0
/*     */     //   122: getfield _size : I
/*     */     //   125: if_icmpeq -> 132
/*     */     //   128: iconst_1
/*     */     //   129: goto -> 133
/*     */     //   132: iconst_0
/*     */     //   133: ireturn
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
/*     */     //   #984	-> 89
/*     */     //   #985	-> 92
/*     */     //   #983	-> 97
/*     */     //   #988	-> 103
/*     */     //   #836	-> 104
/*     */     //   #837	-> 107
/*     */     //   #834	-> 114
/*     */     //   #840	-> 120
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   25	7	6	$i$f$getLastIndex	I
/*     */     //   22	10	5	this_$iv	Landroidx/collection/IntList;
/*     */     //   77	12	11	$i$a$-indexOfFirst-MutableIntList$retainAll$1	I
/*     */     //   74	15	10	it	I
/*     */     //   55	48	8	index$iv	I
/*     */     //   52	52	7	$i$f$indexOfFirst	I
/*     */     //   49	55	6	$this$indexOfFirst$iv	[I
/*     */     //   46	68	5	item	I
/*     */     //   34	86	4	i	I
/*     */     //   11	123	2	initialSize	I
/*     */     //   16	118	3	content	[I
/*     */     //   0	134	0	this	Landroidx/collection/MutableIntList;
/*     */     //   0	134	1	elements	[I }
/* 989 */   public final boolean retainAll(@NotNull IntList elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int initialSize = this._size; int[] content = this.content; int i; IntList this_$iv; int $i$f$getLastIndex; for (this_$iv = this, $i$f$getLastIndex = 0, i = this_$iv._size - 1; -1 < i; i--) { int item = content[i]; if (!elements.contains(item))
/* 990 */         removeAt(i);  }  return (initialSize != this._size); } public final int set(@IntRange(from = 0L) int index, int element) { if (!((0 <= index) ? ((index < this._size) ? 1 : 0) : 0)) { IntList this_$iv = this; int $i$f$getLastIndex = 0; throw new IndexOutOfBoundsException("set index " + index + " must be between 0 .. " + (this_$iv._size - 1)); }
/*     */     
/*     */     int[] content = this.content;
/*     */     int old = content[index];
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
/*     */   public MutableIntList() {
/*     */     this(0, 1, (DefaultConstructorMarker)null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\MutableIntList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */