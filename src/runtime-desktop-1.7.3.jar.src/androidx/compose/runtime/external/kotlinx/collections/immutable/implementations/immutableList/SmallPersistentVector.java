/*     */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\021\n\002\020\000\n\002\b\003\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\006\n\002\020\036\n\002\b\004\n\002\030\002\n\002\b\006\n\002\020*\n\002\b\002\n\002\030\002\n\002\020\013\n\002\b\004\b\000\030\000 (*\004\b\000\020\0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003:\001(B\025\022\016\020\004\032\n\022\006\022\004\030\0010\0060\005¢\006\002\020\007J\033\020\r\032\b\022\004\022\0028\0000\0162\006\020\017\032\0028\000H\026¢\006\002\020\020J#\020\r\032\b\022\004\022\0028\0000\0162\006\020\021\032\0020\n2\006\020\017\032\0028\000H\026¢\006\002\020\022J$\020\023\032\b\022\004\022\0028\0000\0162\006\020\021\032\0020\n2\f\020\024\032\b\022\004\022\0028\0000\025H\026J\034\020\023\032\b\022\004\022\0028\0000\0162\f\020\026\032\b\022\004\022\0028\0000\025H\026J\035\020\027\032\n\022\006\022\004\030\0010\0060\0052\006\020\t\032\0020\nH\002¢\006\002\020\030J\016\020\031\032\b\022\004\022\0028\0000\032H\026J\026\020\033\032\0028\0002\006\020\021\032\0020\nH\002¢\006\002\020\034J\025\020\035\032\0020\n2\006\020\017\032\0028\000H\026¢\006\002\020\036J\025\020\037\032\0020\n2\006\020\017\032\0028\000H\026¢\006\002\020\036J\026\020 \032\b\022\004\022\0028\0000!2\006\020\021\032\0020\nH\026J\"\020\"\032\b\022\004\022\0028\0000\0162\022\020#\032\016\022\004\022\0028\000\022\004\022\0020%0$H\026J\026\020&\032\b\022\004\022\0028\0000\0162\006\020\021\032\0020\nH\026J#\020'\032\b\022\004\022\0028\0000\0162\006\020\021\032\0020\n2\006\020\017\032\0028\000H\026¢\006\002\020\022R\030\020\004\032\n\022\006\022\004\030\0010\0060\005X\004¢\006\004\n\002\020\bR\024\020\t\032\0020\n8VX\004¢\006\006\032\004\b\013\020\f¨\006)"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "buffer", "", "", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "size", "", "getSize", "()I", "add", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "element", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "index", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "addAll", "c", "", "elements", "bufferOfSize", "(I)[Ljava/lang/Object;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "listIterator", "", "removeAll", "predicate", "Lkotlin/Function1;", "", "removeAt", "set", "Companion", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nSmallPersistentVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmallPersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,161:1\n41#2:162\n41#2:163\n26#3:164\n*S KotlinDebug\n*F\n+ 1 SmallPersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector\n*L\n48#1:162\n91#1:163\n159#1:164\n*E\n"})
/*     */ public final class SmallPersistentVector<E> extends AbstractPersistentList<E> implements ImmutableList<E> {
/*     */   public SmallPersistentVector(@NotNull Object[] buffer) {
/*  15 */     this.buffer = buffer;
/*     */ 
/*     */     
/*  18 */     CommonFunctionsKt.assert((this.buffer.length <= 32));
/*     */   }
/*     */   
/*     */   public int getSize() {
/*  22 */     return this.buffer.length;
/*     */   }
/*     */   private final Object[] bufferOfSize(int size) {
/*  25 */     return new Object[size];
/*     */   }
/*     */   
/*     */   @NotNull
/*  29 */   public PersistentList<E> add(Object element) { if (size() < 32) {
/*  30 */       Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.buffer, size() + 1), "copyOf(...)"); Object[] newBuffer = Arrays.copyOf(this.buffer, size() + 1);
/*  31 */       newBuffer[size()] = element;
/*  32 */       return new SmallPersistentVector(newBuffer);
/*     */     } 
/*  34 */     Object[] tail = UtilsKt.presizedBufferWith(element);
/*  35 */     return new PersistentVector<>(this.buffer, tail, size() + 1, 0); }
/*     */   @NotNull public PersistentList<E> removeAll(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); Object[] newBuffer = this.buffer; int newSize = size(); boolean anyRemoved = false; int index, i; for (index = 0, i = size(); index < i; index++) { Object element = this.buffer[index]; if (((Boolean)predicate.invoke(element)).booleanValue()) { if (!anyRemoved) { Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.buffer, this.buffer.length), "copyOf(...)"); newBuffer = Arrays.copyOf(this.buffer, this.buffer.length); newSize = index; anyRemoved = true; }  }
/*     */       else if (anyRemoved) { newBuffer[newSize++] = element; }
/*     */        }
/*  39 */      index = newSize; Object[] arrayOfObject1 = newBuffer; boolean bool = false; return (index == size()) ? this : ((index == 0) ? EMPTY : new SmallPersistentVector(ArraysKt.copyOfRange(arrayOfObject1, bool, newSize))); } @NotNull public PersistentList<E> addAll(@NotNull Collection elements) { Intrinsics.checkNotNullParameter(elements, "elements"); if (size() + elements.size() <= 32) {
/*  40 */       Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.buffer, size() + elements.size()), "copyOf(...)"); Object[] newBuffer = Arrays.copyOf(this.buffer, size() + elements.size());
/*     */       
/*  42 */       int index = size();
/*  43 */       for (Object element : elements) {
/*  44 */         newBuffer[index++] = element;
/*     */       }
/*  46 */       return new SmallPersistentVector(newBuffer);
/*     */     } 
/*  48 */     PersistentList $this$mutate$iv = this; int $i$f$mutate = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 162 */     PersistentList.Builder builder = $this$mutate$iv.builder(); List it = (List)builder; int $i$a$-mutate-SmallPersistentVector$addAll$1 = 0; it.addAll(elements); return builder.build(); } @NotNull public PersistentList<E> addAll(int index, @NotNull Collection c) { Intrinsics.checkNotNullParameter(c, "c"); ListImplementation.checkPositionIndex$runtime(index, size()); if (size() + c.size() <= 32) { Object[] newBuffer = bufferOfSize(size() + c.size()); ArraysKt.copyInto$default(this.buffer, newBuffer, 0, 0, index, 6, null); ArraysKt.copyInto(this.buffer, newBuffer, index + c.size(), index, size()); int position = index; for (Object element : c)
/* 163 */         newBuffer[position++] = element;  return new SmallPersistentVector(newBuffer); }  PersistentList $this$mutate$iv = this; int $i$f$mutate = 0; PersistentList.Builder builder = $this$mutate$iv.builder(); List it = (List)builder; int $i$a$-mutate-SmallPersistentVector$addAll$2 = 0; it.addAll(index, c); return builder.build(); } @NotNull public PersistentList<E> add(int index, Object element) { ListImplementation.checkPositionIndex$runtime(index, size()); if (index == size()) return add((E)element);  if (size() < 32) { Object[] newBuffer = bufferOfSize(size() + 1); ArraysKt.copyInto$default(this.buffer, newBuffer, 0, 0, index, 6, null); ArraysKt.copyInto(this.buffer, newBuffer, index + 1, index, size()); newBuffer[index] = element; return new SmallPersistentVector(newBuffer); }  Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.buffer, this.buffer.length), "copyOf(...)"); Object[] root = Arrays.copyOf(this.buffer, this.buffer.length); ArraysKt.copyInto(this.buffer, root, index + 1, index, size() - 1); root[index] = element; Object[] tail = UtilsKt.presizedBufferWith(this.buffer[31]); return new PersistentVector<>(root, tail, size() + 1, 0); } @NotNull public PersistentList<E> removeAt(int index) { ListImplementation.checkElementIndex$runtime(index, size()); if (size() == 1) return EMPTY;  Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.buffer, size() - 1), "copyOf(...)"); Object[] newBuffer = Arrays.copyOf(this.buffer, size() - 1); ArraysKt.copyInto(this.buffer, newBuffer, index, index + 1, size()); return new SmallPersistentVector(newBuffer); } @NotNull public PersistentList.Builder<E> builder() { return new PersistentVectorBuilder<>(this, null, this.buffer, 0); }
/* 164 */   @NotNull private static final SmallPersistentVector EMPTY = new SmallPersistentVector(new Object[0]);
/*     */   
/*     */   public int indexOf(Object element) {
/*     */     return ArraysKt.indexOf(this.buffer, element);
/*     */   }
/*     */   
/*     */   public int lastIndexOf(Object element) {
/*     */     return ArraysKt.lastIndexOf(this.buffer, element);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public ListIterator<E> listIterator(int index) {
/*     */     ListImplementation.checkPositionIndex$runtime(index, size());
/*     */     return new BufferIterator<>((E[])this.buffer, index, size());
/*     */   }
/*     */   
/*     */   public E get(int index) {
/*     */     ListImplementation.checkElementIndex$runtime(index, size());
/*     */     return (E)this.buffer[index];
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public PersistentList<E> set(int index, Object element) {
/*     */     ListImplementation.checkElementIndex$runtime(index, size());
/*     */     Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.buffer, this.buffer.length), "copyOf(...)");
/*     */     Object[] newBuffer = Arrays.copyOf(this.buffer, this.buffer.length);
/*     */     newBuffer[index] = element;
/*     */     return new SmallPersistentVector(newBuffer);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\020\001\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\027\020\003\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", "", "getEMPTY", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", "runtime"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final SmallPersistentVector getEMPTY() {
/*     */       return SmallPersistentVector.EMPTY;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final Object[] buffer;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   static {
/*     */     int $i$f$emptyArray = 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableList\SmallPersistentVector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */