/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;
/*    */ import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import java.util.Iterator;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.markers.KMappedMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\b\003\n\002\020(\n\002\b\002\n\002\020\021\n\002\020\000\n\002\b\005\n\002\020\b\n\002\b\b\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\020\002\n\002\b\005\b \030\000*\006\b\000\020\001 \001*\006\b\001\020\002 \001*\006\b\002\020\003 \0012\b\022\004\022\002H\0030\004B\005¢\006\002\020\005J\013\020\024\032\0028\000¢\006\002\020\025J\026\020\026\032\022\022\006\b\001\022\0028\000\022\006\b\001\022\0028\0010\027J\t\020\030\032\0020\031H\002J\006\020\032\032\0020\031J\006\020\033\032\0020\031J\006\020\034\032\0020\035J\006\020\036\032\0020\035J#\020\037\032\0020\0352\016\020\t\032\n\022\006\022\004\030\0010\b0\0072\006\020\r\032\0020\016¢\006\002\020 J+\020\037\032\0020\0352\016\020\t\032\n\022\006\022\004\030\0010\b0\0072\006\020\r\032\0020\0162\006\020\017\032\0020\016¢\006\002\020!R0\020\t\032\n\022\006\022\004\030\0010\b0\0072\016\020\006\032\n\022\006\022\004\030\0010\b0\007@BX\016¢\006\n\n\002\020\f\032\004\b\n\020\013R\016\020\r\032\0020\016X\016¢\006\002\n\000R\032\020\017\032\0020\016X\016¢\006\016\n\000\032\004\b\020\020\021\"\004\b\022\020\023¨\006\""}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "K", "V", "T", "", "()V", "<set-?>", "", "", "buffer", "getBuffer", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "dataSize", "", "index", "getIndex", "()I", "setIndex", "(I)V", "currentKey", "()Ljava/lang/Object;", "currentNode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "hasNext", "", "hasNextKey", "hasNextNode", "moveToNextKey", "", "moveToNextNode", "reset", "([Ljava/lang/Object;I)V", "([Ljava/lang/Object;II)V", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public abstract class TrieNodeBaseIterator<K, V, T> implements Iterator<T>, KMappedMarker {
/*    */   @NotNull
/* 13 */   private Object[] buffer = TrieNode.Companion.getEMPTY$runtime().getBuffer$runtime(); private int dataSize; @NotNull protected final Object[] getBuffer() { return this.buffer; }
/*    */    private int index; public static final int $stable = 8;
/*    */   protected final int getIndex() {
/* 16 */     return this.index; } protected final void setIndex(int <set-?>) { this.index = <set-?>; }
/*    */   
/*    */   public final void reset(@NotNull Object[] buffer, int dataSize, int index) {
/* 19 */     Intrinsics.checkNotNullParameter(buffer, "buffer"); this.buffer = buffer;
/* 20 */     this.dataSize = dataSize;
/* 21 */     this.index = index;
/*    */   }
/*    */   
/*    */   public final void reset(@NotNull Object[] buffer, int dataSize) {
/* 25 */     Intrinsics.checkNotNullParameter(buffer, "buffer"); reset(buffer, dataSize, 0);
/*    */   }
/*    */   
/*    */   public final boolean hasNextKey() {
/* 29 */     return (this.index < this.dataSize);
/*    */   }
/*    */   
/*    */   public final K currentKey() {
/* 33 */     CommonFunctionsKt.assert(hasNextKey());
/*    */     
/* 35 */     return (K)this.buffer[this.index];
/*    */   }
/*    */   
/*    */   public final void moveToNextKey() {
/* 39 */     CommonFunctionsKt.assert(hasNextKey());
/* 40 */     this.index += 2;
/*    */   }
/*    */   
/*    */   public final boolean hasNextNode() {
/* 44 */     CommonFunctionsKt.assert((this.index >= this.dataSize));
/* 45 */     return (this.index < this.buffer.length);
/*    */   }
/*    */   @NotNull
/*    */   public final TrieNode<? extends K, ? extends V> currentNode() {
/* 49 */     CommonFunctionsKt.assert(hasNextNode());
/*    */     
/* 51 */     Intrinsics.checkNotNull(this.buffer[this.index], "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>"); return (TrieNode<? extends K, ? extends V>)this.buffer[this.index];
/*    */   }
/*    */   
/*    */   public final void moveToNextNode() {
/* 55 */     CommonFunctionsKt.assert(hasNextNode());
/* 56 */     int i = this.index; this.index = i + 1;
/*    */   }
/*    */   
/*    */   public boolean hasNext() {
/* 60 */     return hasNextKey();
/*    */   }
/*    */   
/*    */   public void remove() {
/*    */     throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableMap\TrieNodeBaseIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */