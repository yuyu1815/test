/*     */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.util.Iterator;
/*     */ import java.util.NoSuchElementException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.markers.KMappedMarker;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\b\003\n\002\020(\n\000\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\006\n\002\020\b\n\002\b\005\n\002\020\002\n\002\b\007\b \030\000*\004\b\000\020\001*\004\b\001\020\002*\004\b\002\020\0032\b\022\004\022\002H\0030\004B9\022\022\020\005\032\016\022\004\022\0028\000\022\004\022\0028\0010\006\022\036\020\007\032\032\022\026\022\024\022\004\022\0028\000\022\004\022\0028\001\022\004\022\0028\0020\t0\b¢\006\002\020\nJ\b\020\030\032\0020\031H\002J\r\020\032\032\0028\000H\004¢\006\002\020\033J\b\020\034\032\0020\031H\002J\t\020\013\032\0020\fH\002J\020\020\035\032\0020\0232\006\020\036\032\0020\023H\002J\016\020\037\032\0028\002H\002¢\006\002\020\033R\030\020\013\032\0020\f8\002@\002X\016¢\006\b\n\000\022\004\b\r\020\016R.\020\007\032\032\022\026\022\024\022\004\022\0028\000\022\004\022\0028\001\022\004\022\0028\0020\t0\bX\004¢\006\n\n\002\020\021\032\004\b\017\020\020R\032\020\022\032\0020\023X\016¢\006\016\n\000\032\004\b\024\020\025\"\004\b\026\020\027¨\006 "}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBaseIterator;", "K", "V", "T", "", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "path", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;)V", "hasNext", "", "getHasNext$annotations", "()V", "getPath", "()[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "pathLastIndex", "", "getPathLastIndex", "()I", "setPathLastIndex", "(I)V", "checkHasNext", "", "currentKey", "()Ljava/lang/Object;", "ensureNextEntryIsReady", "moveToNextNodeWithData", "pathIndex", "next", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public abstract class PersistentHashMapBaseIterator<K, V, T>
/*     */   implements Iterator<T>, KMappedMarker
/*     */ {
/*     */   @NotNull
/*     */   private final TrieNodeBaseIterator<K, V, T>[] path;
/*     */   private int pathLastIndex;
/*     */   private boolean hasNext;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public PersistentHashMapBaseIterator(@NotNull TrieNode node, @NotNull TrieNodeBaseIterator[] path) {
/* 102 */     this.path = (TrieNodeBaseIterator<K, V, T>[])path;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 108 */     this.hasNext = true;
/*     */ 
/*     */     
/* 111 */     this.path[0].reset(node.getBuffer$runtime(), 2 * node.entryCount$runtime());
/* 112 */     this.pathLastIndex = 0;
/* 113 */     ensureNextEntryIsReady();
/*     */   } @NotNull
/*     */   protected final TrieNodeBaseIterator<K, V, T>[] getPath() {
/*     */     return this.path;
/* 117 */   } private final int moveToNextNodeWithData(int pathIndex) { if (this.path[pathIndex].hasNextKey()) {
/* 118 */       return pathIndex;
/*     */     }
/* 120 */     if (this.path[pathIndex].hasNextNode()) {
/* 121 */       TrieNode<? extends K, ? extends V> node = this.path[pathIndex].currentNode();
/* 122 */       if (pathIndex == 6) {
/* 123 */         this.path[pathIndex + 1].reset(node.getBuffer$runtime(), (node.getBuffer$runtime()).length);
/*     */       } else {
/* 125 */         this.path[pathIndex + 1].reset(node.getBuffer$runtime(), 2 * node.entryCount$runtime());
/*     */       } 
/* 127 */       return moveToNextNodeWithData(pathIndex + 1);
/*     */     } 
/* 129 */     return -1; }
/*     */   protected final int getPathLastIndex() { return this.pathLastIndex; } protected final void setPathLastIndex(int <set-?>) {
/*     */     this.pathLastIndex = <set-?>;
/*     */   } private final void ensureNextEntryIsReady() {
/* 133 */     if (this.path[this.pathLastIndex].hasNextKey()) {
/*     */       return;
/*     */     }
/* 136 */     for (int i = this.pathLastIndex; -1 < i; i--) {
/* 137 */       int result = moveToNextNodeWithData(i);
/*     */       
/* 139 */       if (result == -1 && this.path[i].hasNextNode()) {
/* 140 */         this.path[i].moveToNextNode();
/* 141 */         result = moveToNextNodeWithData(i);
/*     */       } 
/* 143 */       if (result != -1) {
/* 144 */         this.pathLastIndex = result;
/*     */         return;
/*     */       } 
/* 147 */       if (i > 0) {
/* 148 */         this.path[i - 1].moveToNextNode();
/*     */       }
/* 150 */       this.path[i].reset(TrieNode.Companion.getEMPTY$runtime().getBuffer$runtime(), 0);
/*     */     } 
/* 152 */     this.hasNext = false;
/*     */   }
/*     */   
/*     */   protected final K currentKey() {
/* 156 */     checkHasNext();
/* 157 */     return this.path[this.pathLastIndex].currentKey();
/*     */   }
/*     */   
/*     */   public boolean hasNext() {
/* 161 */     return this.hasNext;
/*     */   }
/*     */   
/*     */   public T next() {
/* 165 */     checkHasNext();
/* 166 */     Object result = this.path[this.pathLastIndex].next();
/* 167 */     ensureNextEntryIsReady();
/* 168 */     return (T)result;
/*     */   }
/*     */   
/*     */   private final void checkHasNext() {
/* 172 */     if (!hasNext())
/* 173 */       throw new NoSuchElementException(); 
/*     */   }
/*     */   
/*     */   public void remove() {
/*     */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableMap\PersistentHashMapBaseIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */