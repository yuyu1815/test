/*     */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.util.ConcurrentModificationException;
/*     */ import java.util.ListIterator;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.markers.KMutableListIterator;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\000\n\002\020+\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\002\b\f\b\000\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003B\033\022\f\020\004\032\b\022\004\022\0028\0000\005\022\006\020\006\032\0020\007¢\006\002\020\bJ\025\020\r\032\0020\0162\006\020\017\032\0028\000H\026¢\006\002\020\020J\b\020\021\032\0020\016H\002J\b\020\022\032\0020\016H\002J\016\020\023\032\0028\000H\002¢\006\002\020\024J\r\020\025\032\0028\000H\026¢\006\002\020\024J\b\020\026\032\0020\016H\026J\b\020\027\032\0020\016H\002J\025\020\030\032\0020\0162\006\020\017\032\0028\000H\026¢\006\002\020\020J\b\020\031\032\0020\016H\002R\024\020\004\032\b\022\004\022\0028\0000\005X\004¢\006\002\n\000R\016\020\t\032\0020\007X\016¢\006\002\n\000R\016\020\n\032\0020\007X\016¢\006\002\n\000R\026\020\013\032\n\022\004\022\0028\000\030\0010\fX\016¢\006\002\n\000¨\006\032"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorMutableIterator;", "T", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "index", "", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;I)V", "expectedModCount", "lastIteratedIndex", "trieIterator", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/TrieIterator;", "add", "", "element", "(Ljava/lang/Object;)V", "checkForComodification", "checkHasIterated", "next", "()Ljava/lang/Object;", "previous", "remove", "reset", "set", "setupTrieIterator", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class PersistentVectorMutableIterator<T> extends AbstractListIterator<T> implements ListIterator<T>, KMutableListIterator {
/*     */   @NotNull
/*     */   private final PersistentVectorBuilder<T> builder;
/*     */   private int expectedModCount;
/*     */   
/*     */   public PersistentVectorMutableIterator(@NotNull PersistentVectorBuilder<T> builder, int index) {
/*  18 */     super(index, builder.size());
/*     */ 
/*     */     
/*     */     this.builder = builder;
/*     */ 
/*     */     
/*  24 */     this.expectedModCount = this.builder.getModCount$runtime();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  35 */     this.lastIteratedIndex = -1;
/*     */ 
/*     */     
/*  38 */     setupTrieIterator();
/*     */   } @Nullable
/*     */   private TrieIterator<? extends T> trieIterator; private int lastIteratedIndex; public static final int $stable = 8; public T previous() {
/*     */     TrieIterator<? extends T> trieIterator;
/*  42 */     checkForComodification();
/*  43 */     checkHasPrevious$runtime();
/*     */     
/*  45 */     this.lastIteratedIndex = getIndex() - 1;
/*     */ 
/*     */     
/*  48 */     if (this.trieIterator == null) { setIndex(getIndex() + -1); return (T)this.builder.getTail$runtime()[getIndex()]; }
/*  49 */      if (getIndex() > trieIterator.getSize()) {
/*     */       
/*  51 */       setIndex(getIndex() + -1); return (T)this.builder.getTail$runtime()[getIndex() - trieIterator.getSize()];
/*     */     } 
/*  53 */     int i = getIndex(); setIndex(i + -1);
/*  54 */     return trieIterator.previous();
/*     */   }
/*     */   public T next() {
/*     */     TrieIterator<? extends T> trieIterator;
/*  58 */     checkForComodification();
/*  59 */     checkHasNext$runtime();
/*     */     
/*  61 */     this.lastIteratedIndex = getIndex();
/*     */ 
/*     */     
/*  64 */     if (this.trieIterator == null) { int j = getIndex(); setIndex(j + 1); return (T)this.builder.getTail$runtime()[j]; }
/*  65 */      if (trieIterator.hasNext()) {
/*  66 */       int j = getIndex(); setIndex(j + 1);
/*  67 */       return trieIterator.next();
/*     */     } 
/*     */     
/*  70 */     int i = getIndex(); setIndex(i + 1); return (T)this.builder.getTail$runtime()[i - trieIterator.getSize()];
/*     */   }
/*     */   
/*     */   private final void reset() {
/*  74 */     setSize(this.builder.size());
/*  75 */     this.expectedModCount = this.builder.getModCount$runtime();
/*  76 */     this.lastIteratedIndex = -1;
/*     */     
/*  78 */     setupTrieIterator();
/*     */   }
/*     */   
/*     */   private final void setupTrieIterator() {
/*  82 */     Object[] root = this.builder.getRoot$runtime();
/*  83 */     if (root == null) {
/*  84 */       this.trieIterator = null;
/*     */       
/*     */       return;
/*     */     } 
/*  88 */     int trieSize = UtilsKt.rootSize(this.builder.size());
/*  89 */     int trieIndex = RangesKt.coerceAtMost(getIndex(), trieSize);
/*  90 */     int trieHeight = this.builder.getRootShift$runtime() / 5 + 1;
/*  91 */     if (this.trieIterator == null) {
/*  92 */       this.trieIterator = new TrieIterator<>(root, trieIndex, trieSize, trieHeight);
/*     */     } else {
/*  94 */       Intrinsics.checkNotNull(this.trieIterator); this.trieIterator.reset$runtime(root, trieIndex, trieSize, trieHeight);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void add(Object element) {
/*  99 */     checkForComodification();
/*     */     
/* 101 */     this.builder.add(getIndex(), (T)element);
/* 102 */     int i = getIndex(); setIndex(i + 1);
/* 103 */     reset();
/*     */   }
/*     */   
/*     */   public void remove() {
/* 107 */     checkForComodification();
/* 108 */     checkHasIterated();
/*     */     
/* 110 */     this.builder.remove(this.lastIteratedIndex);
/* 111 */     if (this.lastIteratedIndex < getIndex()) setIndex(this.lastIteratedIndex); 
/* 112 */     reset();
/*     */   }
/*     */   
/*     */   public void set(Object element) {
/* 116 */     checkForComodification();
/* 117 */     checkHasIterated();
/*     */     
/* 119 */     this.builder.set(this.lastIteratedIndex, (T)element);
/*     */     
/* 121 */     this.expectedModCount = this.builder.getModCount$runtime();
/* 122 */     setupTrieIterator();
/*     */   }
/*     */   
/*     */   private final void checkForComodification() {
/* 126 */     if (this.expectedModCount != this.builder.getModCount$runtime())
/* 127 */       throw new ConcurrentModificationException(); 
/*     */   }
/*     */   
/*     */   private final void checkHasIterated() {
/* 131 */     if (this.lastIteratedIndex == -1)
/* 132 */       throw new IllegalStateException(); 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableList\PersistentVectorMutableIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */