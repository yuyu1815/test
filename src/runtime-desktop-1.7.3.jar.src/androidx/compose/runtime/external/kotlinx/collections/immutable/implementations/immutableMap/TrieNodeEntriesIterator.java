/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;
/*    */ 
/*    */ import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020&\n\002\b\003\b\000\030\000*\006\b\000\020\001 \001*\006\b\001\020\002 \0012 \022\004\022\002H\001\022\004\022\002H\002\022\020\022\016\022\004\022\002H\001\022\004\022\002H\0020\0040\003B\005¢\006\002\020\005J\025\020\006\032\016\022\004\022\0028\000\022\004\022\0028\0010\004H\002¨\006\007"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeEntriesIterator;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "", "()V", "next", "runtime"})
/*    */ @StabilityInferred(parameters = 4)
/*    */ public final class TrieNodeEntriesIterator<K, V>
/*    */   extends TrieNodeBaseIterator<K, V, Map.Entry<? extends K, ? extends V>>
/*    */ {
/*    */   public static final int $stable;
/*    */   
/*    */   @NotNull
/*    */   public Map.Entry<K, V> next() {
/* 84 */     CommonFunctionsKt.assert(hasNextKey());
/* 85 */     setIndex(getIndex() + 2);
/*    */     
/* 87 */     return new MapEntry<>((K)getBuffer()[getIndex() - 2], (V)getBuffer()[getIndex() - 1]);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableMap\TrieNodeEntriesIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */