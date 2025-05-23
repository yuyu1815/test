/*     */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;
/*     */ 
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.AbstractSet;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\007\n\002\020\b\n\002\b\007\n\002\020\036\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\n\002\020(\n\002\b\003\n\002\030\002\n\002\b\003\b\000\030\000 '*\004\b\000\020\0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003:\001'B-\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\022\020\007\032\016\022\004\022\0028\000\022\004\022\0020\t0\b¢\006\002\020\nJ\033\020\024\032\b\022\004\022\0028\0000\0032\006\020\025\032\0028\000H\026¢\006\002\020\026J\034\020\027\032\b\022\004\022\0028\0000\0032\f\020\030\032\b\022\004\022\0028\0000\031H\026J\016\020\032\032\b\022\004\022\0028\0000\033H\026J\016\020\034\032\b\022\004\022\0028\0000\003H\026J\026\020\035\032\0020\0362\006\020\025\032\0028\000H\002¢\006\002\020\037J\017\020 \032\b\022\004\022\0028\0000!H\002J\033\020\"\032\b\022\004\022\0028\0000\0032\006\020\025\032\0028\000H\026¢\006\002\020\026J\"\020#\032\b\022\004\022\0028\0000\0032\022\020$\032\016\022\004\022\0028\000\022\004\022\0020\0360%H\026J\034\020#\032\b\022\004\022\0028\0000\0032\f\020\030\032\b\022\004\022\0028\0000\031H\026J\034\020&\032\b\022\004\022\0028\0000\0032\f\020\030\032\b\022\004\022\0028\0000\031H\026R\026\020\004\032\004\030\0010\005X\004¢\006\b\n\000\032\004\b\013\020\fR \020\007\032\016\022\004\022\0028\000\022\004\022\0020\t0\bX\004¢\006\b\n\000\032\004\b\r\020\016R\026\020\006\032\004\030\0010\005X\004¢\006\b\n\000\032\004\b\017\020\fR\024\020\020\032\0020\0218VX\004¢\006\006\032\004\b\022\020\023¨\006("}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "E", "Lkotlin/collections/AbstractSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "firstElement", "", "lastElement", "hashMap", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;)V", "getFirstElement$runtime", "()Ljava/lang/Object;", "getHashMap$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "getLastElement$runtime", "size", "", "getSize", "()I", "add", "element", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "addAll", "elements", "", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "clear", "contains", "", "(Ljava/lang/Object;)Z", "iterator", "", "remove", "removeAll", "predicate", "Lkotlin/Function1;", "retainAll", "Companion", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nPersistentOrderedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,109:1\n31#2:110\n31#2:111\n31#2:112\n31#2:113\n*S KotlinDebug\n*F\n+ 1 PersistentOrderedSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet\n*L\n56#1:110\n81#1:111\n85#1:112\n89#1:113\n*E\n"})
/*     */ public final class PersistentOrderedSet<E> extends AbstractSet<E> implements PersistentSet<E> {
/*     */   @Nullable
/*  27 */   public final Object getFirstElement$runtime() { return this.firstElement; } @Nullable
/*  28 */   public final Object getLastElement$runtime() { return this.lastElement; } @NotNull
/*  29 */   public final PersistentHashMap<E, Links> getHashMap$runtime() { return this.hashMap; } public PersistentOrderedSet(@Nullable Object firstElement, @Nullable Object lastElement, @NotNull PersistentHashMap<E, Links> hashMap) { this.firstElement = firstElement; this.lastElement = lastElement; this.hashMap = hashMap; }
/*     */   
/*     */   public int getSize() {
/*  32 */     return this.hashMap.size();
/*     */   } public boolean contains(Object element) {
/*  34 */     return this.hashMap.containsKey(element);
/*     */   }
/*     */   @NotNull
/*  37 */   public PersistentSet<E> add(Object element) { if (this.hashMap.containsKey(element)) {
/*  38 */       return this;
/*     */     }
/*  40 */     if (isEmpty()) {
/*  41 */       PersistentHashMap<E, Links> persistentHashMap = this.hashMap.put(element, new Links());
/*  42 */       return new PersistentOrderedSet(element, element, persistentHashMap);
/*     */     } 
/*     */     
/*  45 */     Object lastElement = this.lastElement;
/*  46 */     Intrinsics.checkNotNull(this.hashMap.get(lastElement)); Links lastLinks = (Links)this.hashMap.get(lastElement);
/*     */ 
/*     */     
/*  49 */     PersistentHashMap<E, Links> newMap = this.hashMap
/*  50 */       .put(lastElement, lastLinks.withNext(element))
/*  51 */       .put(element, new Links(lastElement));
/*  52 */     return new PersistentOrderedSet(this.firstElement, element, newMap); }
/*     */   @NotNull public PersistentSet<E> remove(Object element) { Links links; if ((Links)this.hashMap.get(element) == null) { (Links)this.hashMap.get(element); return this; }
/*     */      PersistentHashMap<E, Links> newMap = this.hashMap.remove(element); if (links.getHasPrevious()) { Intrinsics.checkNotNull(((Map)newMap).get(links.getPrevious())); Links previousLinks = (Links)((Map)newMap).get(links.getPrevious()); newMap = newMap.put(links.getPrevious(), previousLinks.withNext(links.getNext())); }
/*     */      if (links.getHasNext()) { Intrinsics.checkNotNull(((Map)newMap).get(links.getNext())); Links nextLinks = (Links)((Map)newMap).get(links.getNext()); newMap = newMap.put(links.getNext(), nextLinks.withPrevious(links.getPrevious())); }
/*  56 */      Object newFirstElement = !links.getHasPrevious() ? links.getNext() : this.firstElement; Object newLastElement = !links.getHasNext() ? links.getPrevious() : this.lastElement; return new PersistentOrderedSet(newFirstElement, newLastElement, newMap); } @NotNull public PersistentSet<E> addAll(@NotNull Collection elements) { Intrinsics.checkNotNullParameter(elements, "elements"); PersistentSet $this$mutate$iv = this; int $i$f$mutate = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 110 */     PersistentSet.Builder builder = $this$mutate$iv.builder(); Set it = (Set)builder; int $i$a$-mutate-PersistentOrderedSet$addAll$1 = 0; it.addAll(elements); return builder.build(); } @NotNull public PersistentSet<E> removeAll(@NotNull Collection<?> elements) { Intrinsics.checkNotNullParameter(elements, "elements"); PersistentSet $this$mutate$iv = this; int $i$f$mutate = 0;
/* 111 */     PersistentSet.Builder builder = $this$mutate$iv.builder(); Set it = (Set)builder; int $i$a$-mutate-PersistentOrderedSet$removeAll$1 = 0; it.removeAll(elements); return builder.build(); } @NotNull public PersistentSet<E> removeAll(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); PersistentSet $this$mutate$iv = this; int $i$f$mutate = 0;
/* 112 */     PersistentSet.Builder builder = $this$mutate$iv.builder(); Set it = (Set)builder; int $i$a$-mutate-PersistentOrderedSet$removeAll$2 = 0; CollectionsKt.removeAll(it, predicate); return builder.build(); } @NotNull public PersistentSet<E> retainAll(@NotNull Collection<?> elements) { Intrinsics.checkNotNullParameter(elements, "elements"); PersistentSet $this$mutate$iv = this; int $i$f$mutate = 0;
/* 113 */     PersistentSet.Builder builder = $this$mutate$iv.builder(); Set it = (Set)builder; int $i$a$-mutate-PersistentOrderedSet$retainAll$1 = 0; it.retainAll(elements); return builder.build(); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public PersistentSet<E> clear() {
/*     */     return Companion.emptyOf$runtime();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Iterator<E> iterator() {
/*     */     return new PersistentOrderedSetIterator<>(this.firstElement, (Map<E, Links>)this.hashMap);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public PersistentSet.Builder<E> builder() {
/*     */     return new PersistentOrderedSetBuilder<>(this);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\020\001\n\000\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\031\020\006\032\b\022\004\022\002H\b0\007\"\004\b\001\020\bH\000¢\006\002\b\tR\024\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000¨\006\n"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "", "emptyOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "E", "emptyOf$runtime", "runtime"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final <E> PersistentSet<E> emptyOf$runtime() {
/*     */       return PersistentOrderedSet.EMPTY;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @Nullable
/*     */   private final Object firstElement;
/*     */   @Nullable
/*     */   private final Object lastElement;
/*     */   @NotNull
/*     */   private final PersistentHashMap<E, Links> hashMap;
/*     */   public static final int $stable = 8;
/*     */   @NotNull
/*     */   private static final PersistentOrderedSet EMPTY = new PersistentOrderedSet(EndOfChain.INSTANCE, EndOfChain.INSTANCE, PersistentHashMap.Companion.emptyOf$runtime());
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\persistentOrderedSet\PersistentOrderedSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */