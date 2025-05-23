/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;
/*    */ 
/*    */ import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import kotlin.Metadata;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\b\000\030\000*\006\b\000\020\001 \001*\006\b\001\020\002 \0012\024\022\004\022\002H\001\022\004\022\002H\002\022\004\022\002H\0010\003B\005¢\006\002\020\004J\016\020\005\032\0028\000H\002¢\006\002\020\006¨\006\007"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeKeysIterator;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "()V", "next", "()Ljava/lang/Object;", "runtime"})
/*    */ @StabilityInferred(parameters = 4)
/*    */ public final class TrieNodeKeysIterator<K, V>
/*    */   extends TrieNodeBaseIterator<K, V, K>
/*    */ {
/*    */   public static final int $stable;
/*    */   
/*    */   public K next() {
/* 66 */     CommonFunctionsKt.assert(hasNextKey());
/* 67 */     setIndex(getIndex() + 2);
/*    */     
/* 69 */     return (K)getBuffer()[getIndex() - 2];
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableMap\TrieNodeKeysIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */