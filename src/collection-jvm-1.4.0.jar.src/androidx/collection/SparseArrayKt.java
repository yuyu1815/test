/*    */ package androidx.collection;
/*    */ 
/*    */ import java.util.Iterator;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.IntIterator;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.markers.KMappedMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000@\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\007\n\002\020(\n\000\032!\020\006\032\0020\007\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\006\020\b\032\0020\001H\n\032T\020\t\032\0020\n\"\004\b\000\020\002*\b\022\004\022\002H\0020\00326\020\013\0322\022\023\022\0210\001¢\006\f\b\r\022\b\b\016\022\004\b\b(\b\022\023\022\021H\002¢\006\f\b\r\022\b\b\016\022\004\b\b(\017\022\004\022\0020\n0\fH\bø\001\000\032.\020\020\032\002H\002\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\006\020\b\032\0020\0012\006\020\021\032\002H\002H\b¢\006\002\020\022\0327\020\023\032\002H\002\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\006\020\b\032\0020\0012\f\020\021\032\b\022\004\022\002H\0020\024H\bø\001\000¢\006\002\020\025\032\031\020\026\032\0020\007\"\004\b\000\020\002*\b\022\004\022\002H\0020\003H\b\032\026\020\027\032\0020\030\"\004\b\000\020\002*\b\022\004\022\002H\0020\003\032-\020\031\032\b\022\004\022\002H\0020\003\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\f\020\032\032\b\022\004\022\002H\0020\003H\002\032-\020\033\032\0020\007\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\006\020\b\032\0020\0012\006\020\017\032\002H\002H\007¢\006\002\020\034\032.\020\035\032\0020\n\"\004\b\000\020\002*\b\022\004\022\002H\0020\0032\006\020\b\032\0020\0012\006\020\017\032\002H\002H\n¢\006\002\020\036\032\034\020\037\032\b\022\004\022\002H\0020 \"\004\b\000\020\002*\b\022\004\022\002H\0020\003\"\"\020\000\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0038Æ\002¢\006\006\032\004\b\004\020\005\002\007\n\005\b20\001¨\006!"}, d2 = {"size", "", "T", "Landroidx/collection/SparseArrayCompat;", "getSize", "(Landroidx/collection/SparseArrayCompat;)I", "contains", "", "key", "forEach", "", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "getOrDefault", "defaultValue", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Ljava/lang/Object;", "getOrElse", "Lkotlin/Function0;", "(Landroidx/collection/SparseArrayCompat;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNotEmpty", "keyIterator", "Lkotlin/collections/IntIterator;", "plus", "other", "remove", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Z", "set", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)V", "valueIterator", "", "collection"})
/*    */ public final class SparseArrayKt
/*    */ {
/*    */   public static final <T> int getSize(@NotNull SparseArrayCompat $this$size) {
/* 22 */     Intrinsics.checkNotNullParameter($this$size, "<this>"); int $i$f$getSize = 0; return $this$size.size();
/*    */   }
/*    */   
/*    */   public static final <T> boolean contains(@NotNull SparseArrayCompat $this$contains, int key) {
/* 26 */     Intrinsics.checkNotNullParameter($this$contains, "<this>"); int $i$f$contains = 0; return $this$contains.containsKey(key);
/*    */   }
/*    */   
/*    */   public static final <T> void set(@NotNull SparseArrayCompat<Object> $this$set, int key, Object value) {
/* 30 */     Intrinsics.checkNotNullParameter($this$set, "<this>"); int $i$f$set = 0; $this$set.put(key, value);
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final <T> SparseArrayCompat<T> plus(@NotNull SparseArrayCompat $this$plus, @NotNull SparseArrayCompat other) {
/* 36 */     Intrinsics.checkNotNullParameter($this$plus, "<this>"); Intrinsics.checkNotNullParameter(other, "other"); SparseArrayCompat<T> new = new SparseArrayCompat($this$plus.size() + other.size());
/* 37 */     new.putAll($this$plus);
/* 38 */     new.putAll(other);
/* 39 */     return new;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static final <T> T getOrDefault(@NotNull SparseArrayCompat<T> $this$getOrDefault, int key, Object defaultValue) {
/* 45 */     Intrinsics.checkNotNullParameter($this$getOrDefault, "<this>"); int $i$f$getOrDefault = 0; return $this$getOrDefault.get(key, (T)defaultValue);
/*    */   }
/*    */   
/*    */   public static final <T> T getOrElse(@NotNull SparseArrayCompat $this$getOrElse, int key, @NotNull Function0 defaultValue) {
/* 49 */     Intrinsics.checkNotNullParameter($this$getOrElse, "<this>"); Intrinsics.checkNotNullParameter(defaultValue, "defaultValue"); int $i$f$getOrElse = 0; if ($this$getOrElse.get(key) == null) $this$getOrElse.get(key);  return (T)defaultValue.invoke();
/*    */   }
/*    */   
/*    */   public static final <T> boolean isNotEmpty(@NotNull SparseArrayCompat $this$isNotEmpty) {
/* 53 */     Intrinsics.checkNotNullParameter($this$isNotEmpty, "<this>"); int $i$f$isNotEmpty = 0; return !$this$isNotEmpty.isEmpty();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final <T> void forEach(@NotNull SparseArrayCompat $this$forEach, @NotNull Function2 action) {
/* 62 */     Intrinsics.checkNotNullParameter($this$forEach, "<this>"); Intrinsics.checkNotNullParameter(action, "action"); for (int $i$f$forEach = 0, index = 0, i = $this$forEach.size(); index < i; index++)
/* 63 */       action.invoke(Integer.valueOf($this$forEach.keyAt(index)), $this$forEach.valueAt(index)); 
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final <T> IntIterator keyIterator(@NotNull SparseArrayCompat<T> $this$keyIterator) {
/* 68 */     Intrinsics.checkNotNullParameter($this$keyIterator, "<this>"); return new SparseArrayKt$keyIterator$1($this$keyIterator); } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\005\n\002\020\013\n\002\b\002*\001\000\b\n\030\0002\0020\001J\t\020\b\032\0020\tH\002J\b\020\n\032\0020\003H\026R\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\004\020\005\"\004\b\006\020\007¨\006\013"}, d2 = {"androidx/collection/SparseArrayKt$keyIterator$1", "Lkotlin/collections/IntIterator;", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "nextInt", "collection"})
/* 69 */   public static final class SparseArrayKt$keyIterator$1 extends IntIterator { private int index; SparseArrayKt$keyIterator$1(SparseArrayCompat<T> $receiver) {} public final int getIndex() { return this.index; } public final void setIndex(int <set-?>) { this.index = <set-?>; }
/* 70 */     public boolean hasNext() { return (this.index < this.$this_keyIterator.size()); } public int nextInt() {
/* 71 */       int i = this.index; this.index = i + 1; return this.$this_keyIterator.keyAt(i);
/*    */     } }
/*    */   
/*    */   @NotNull
/* 75 */   public static final <T> Iterator<T> valueIterator(@NotNull SparseArrayCompat<T> $this$valueIterator) { Intrinsics.checkNotNullParameter($this$valueIterator, "<this>"); return new SparseArrayKt$valueIterator$1($this$valueIterator); } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\020(\n\000\n\002\020\b\n\002\b\005\n\002\020\013\n\002\b\003*\001\000\b\n\030\0002\b\022\004\022\0028\0000\001J\t\020\b\032\0020\tH\002J\016\020\n\032\0028\000H\002¢\006\002\020\013R\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\004\020\005\"\004\b\006\020\007¨\006\f"}, d2 = {"androidx/collection/SparseArrayKt$valueIterator$1", "", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "()Ljava/lang/Object;", "collection"})
/* 76 */   public static final class SparseArrayKt$valueIterator$1 implements Iterator<T>, KMappedMarker { private int index; public final int getIndex() { return this.index; } SparseArrayKt$valueIterator$1(SparseArrayCompat<T> $receiver) {} public final void setIndex(int <set-?>) { this.index = <set-?>; }
/* 77 */     public boolean hasNext() { return (this.index < this.$this_valueIterator.size()); } public T next() {
/* 78 */       int i = this.index; this.index = i + 1; return this.$this_valueIterator.valueAt(i);
/*    */     }
/*    */     
/*    */     public void remove() {
/*    */       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\SparseArrayKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */