/*     */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.util.ConcurrentModificationException;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.TypeIntrinsics;
/*     */ import kotlin.jvm.internal.markers.KMutableIterator;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\b\003\n\002\020)\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\013\n\000\n\002\020\002\n\002\b\007\n\002\030\002\n\002\b\007\b\020\030\000*\004\b\000\020\001*\004\b\001\020\002*\004\b\002\020\0032\b\022\004\022\002H\0030\0042\024\022\004\022\002H\001\022\004\022\002H\002\022\004\022\002H\0030\005B9\022\022\020\006\032\016\022\004\022\0028\000\022\004\022\0028\0010\007\022\036\020\b\032\032\022\026\022\024\022\004\022\0028\000\022\004\022\0028\001\022\004\022\0028\0020\n0\t¢\006\002\020\013J\b\020\022\032\0020\023H\002J\b\020\024\032\0020\023H\002J\016\020\025\032\0028\002H\002¢\006\002\020\026J\b\020\027\032\0020\023H\026J5\020\030\032\0020\0232\006\020\031\032\0020\r2\016\020\032\032\n\022\002\b\003\022\002\b\0030\0332\006\020\034\032\0028\0002\006\020\035\032\0020\rH\002¢\006\002\020\036J\033\020\037\032\0020\0232\006\020\034\032\0028\0002\006\020 \032\0028\001¢\006\002\020!R\032\020\006\032\016\022\004\022\0028\000\022\004\022\0028\0010\007X\004¢\006\002\n\000R\016\020\f\032\0020\rX\016¢\006\002\n\000R\022\020\016\032\004\030\0018\000X\016¢\006\004\n\002\020\017R\016\020\020\032\0020\021X\016¢\006\002\n\000¨\006\""}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderBaseIterator;", "K", "V", "T", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBaseIterator;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "path", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;)V", "expectedModCount", "", "lastIteratedKey", "Ljava/lang/Object;", "nextWasInvoked", "", "checkForComodification", "", "checkNextWasInvoked", "next", "()Ljava/lang/Object;", "remove", "resetPath", "keyHash", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "key", "pathIndex", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Ljava/lang/Object;I)V", "setValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;)V", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public class PersistentHashMapBuilderBaseIterator<K, V, T>
/*     */   extends PersistentHashMapBaseIterator<K, V, T>
/*     */   implements Iterator<T>, KMutableIterator
/*     */ {
/*     */   @NotNull
/*     */   private final PersistentHashMapBuilder<K, V> builder;
/*     */   @Nullable
/*     */   private K lastIteratedKey;
/*     */   private boolean nextWasInvoked;
/*     */   private int expectedModCount;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public PersistentHashMapBuilderBaseIterator(@NotNull PersistentHashMapBuilder<K, V> builder, @NotNull TrieNodeBaseIterator[] path) {
/*  41 */     super(builder.getNode$runtime(), (TrieNodeBaseIterator<K, V, T>[])path);
/*     */     
/*     */     this.builder = builder;
/*     */     
/*  45 */     this.expectedModCount = this.builder.getModCount$runtime();
/*     */   }
/*     */   public T next() {
/*  48 */     checkForComodification();
/*  49 */     this.lastIteratedKey = currentKey();
/*  50 */     this.nextWasInvoked = true;
/*  51 */     return super.next();
/*     */   }
/*     */   
/*     */   public void remove() {
/*  55 */     checkNextWasInvoked();
/*  56 */     if (hasNext()) {
/*  57 */       Object currentKey = currentKey();
/*     */       
/*  59 */       Map map = (Map)this.builder; K k = this.lastIteratedKey; TypeIntrinsics.asMutableMap(map).remove(k);
/*  60 */       resetPath((currentKey != null) ? currentKey.hashCode() : 0, this.builder.getNode$runtime(), (K)currentKey, 0);
/*     */     } else {
/*  62 */       Map map = (Map)this.builder; K k = this.lastIteratedKey; TypeIntrinsics.asMutableMap(map).remove(k);
/*     */     } 
/*     */     
/*  65 */     this.lastIteratedKey = null;
/*  66 */     this.nextWasInvoked = false;
/*  67 */     this.expectedModCount = this.builder.getModCount$runtime();
/*     */   }
/*     */   
/*     */   public final void setValue(Object key, Object newValue) {
/*  71 */     if (!this.builder.containsKey((K)key))
/*     */       return; 
/*  73 */     if (hasNext()) {
/*  74 */       Object currentKey = currentKey();
/*     */       
/*  76 */       ((Map)this.builder).put(key, newValue);
/*  77 */       resetPath((currentKey != null) ? currentKey.hashCode() : 0, this.builder.getNode$runtime(), (K)currentKey, 0);
/*     */     } else {
/*  79 */       ((Map)this.builder).put(key, newValue);
/*     */     } 
/*     */     
/*  82 */     this.expectedModCount = this.builder.getModCount$runtime();
/*     */   }
/*     */   
/*     */   private final void resetPath(int keyHash, TrieNode node, Object key, int pathIndex) {
/*  86 */     int shift = pathIndex * 5;
/*     */     
/*  88 */     if (shift > 30) {
/*  89 */       getPath()[pathIndex].reset(node.getBuffer$runtime(), (node.getBuffer$runtime()).length, 0);
/*  90 */       while (!Intrinsics.areEqual(getPath()[pathIndex].currentKey(), key)) {
/*  91 */         getPath()[pathIndex].moveToNextKey();
/*     */       }
/*  93 */       setPathLastIndex(pathIndex);
/*     */       
/*     */       return;
/*     */     } 
/*  97 */     int keyPositionMask = 1 << TrieNodeKt.indexSegment(keyHash, shift);
/*     */     
/*  99 */     if (node.hasEntryAt$runtime(keyPositionMask)) {
/* 100 */       int keyIndex = node.entryKeyIndex$runtime(keyPositionMask);
/*     */ 
/*     */ 
/*     */       
/* 104 */       getPath()[pathIndex].reset(node.getBuffer$runtime(), 2 * node.entryCount$runtime(), keyIndex);
/* 105 */       setPathLastIndex(pathIndex);
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 111 */     int nodeIndex = node.nodeIndex$runtime(keyPositionMask);
/* 112 */     TrieNode<?, ?> targetNode = node.nodeAtIndex$runtime(nodeIndex);
/* 113 */     getPath()[pathIndex].reset(node.getBuffer$runtime(), 2 * node.entryCount$runtime(), nodeIndex);
/* 114 */     resetPath(keyHash, targetNode, (K)key, pathIndex + 1);
/*     */   }
/*     */   
/*     */   private final void checkNextWasInvoked() {
/* 118 */     if (!this.nextWasInvoked)
/* 119 */       throw new IllegalStateException(); 
/*     */   }
/*     */   
/*     */   private final void checkForComodification() {
/* 123 */     if (this.builder.getModCount$runtime() != this.expectedModCount)
/* 124 */       throw new ConcurrentModificationException(); 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableMap\PersistentHashMapBuilderBaseIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */