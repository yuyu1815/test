/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;
/*    */ 
/*    */ import java.util.Arrays;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.ArraysKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\036\n\000\n\002\020\b\n\002\b\b\n\002\020\021\n\002\020\000\n\002\b\f\n\002\030\002\n\002\b\004\032\030\020\006\032\0020\0012\006\020\007\032\0020\0012\006\020\b\032\0020\001H\000\032E\020\t\032\n\022\006\022\004\030\0010\0130\n\"\004\b\000\020\f\"\004\b\001\020\r*\n\022\006\022\004\030\0010\0130\n2\006\020\016\032\0020\0012\006\020\017\032\002H\f2\006\020\020\032\002H\rH\002¢\006\002\020\021\032)\020\022\032\n\022\006\022\004\030\0010\0130\n*\n\022\006\022\004\030\0010\0130\n2\006\020\016\032\0020\001H\002¢\006\002\020\023\032)\020\024\032\n\022\006\022\004\030\0010\0130\n*\n\022\006\022\004\030\0010\0130\n2\006\020\025\032\0020\001H\002¢\006\002\020\023\032A\020\026\032\n\022\006\022\004\030\0010\0130\n*\n\022\006\022\004\030\0010\0130\n2\006\020\016\032\0020\0012\006\020\025\032\0020\0012\016\020\027\032\n\022\002\b\003\022\002\b\0030\030H\002¢\006\002\020\031\032M\020\032\032\n\022\006\022\004\030\0010\0130\n\"\004\b\000\020\f\"\004\b\001\020\r*\n\022\006\022\004\030\0010\0130\n2\006\020\025\032\0020\0012\006\020\016\032\0020\0012\006\020\017\032\002H\f2\006\020\020\032\002H\rH\002¢\006\002\020\033\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\016\020\003\032\0020\001XT¢\006\002\n\000\"\016\020\004\032\0020\001XT¢\006\002\n\000\"\016\020\005\032\0020\001XT¢\006\002\n\000¨\006\034"}, d2 = {"ENTRY_SIZE", "", "LOG_MAX_BRANCHING_FACTOR", "MAX_BRANCHING_FACTOR", "MAX_BRANCHING_FACTOR_MINUS_ONE", "MAX_SHIFT", "indexSegment", "index", "shift", "insertEntryAtIndex", "", "", "K", "V", "keyIndex", "key", "value", "([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "removeEntryAtIndex", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "removeNodeAtIndex", "nodeIndex", "replaceEntryWithNode", "newNode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)[Ljava/lang/Object;", "replaceNodeWithEntry", "([Ljava/lang/Object;IILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "runtime"})
/*    */ public final class TrieNodeKt
/*    */ {
/*    */   public static final int MAX_BRANCHING_FACTOR = 32;
/*    */   public static final int LOG_MAX_BRANCHING_FACTOR = 5;
/*    */   public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 31;
/*    */   public static final int ENTRY_SIZE = 2;
/*    */   public static final int MAX_SHIFT = 30;
/*    */   
/*    */   public static final int indexSegment(int index, int shift) {
/* 28 */     return index >> shift & 0x1F;
/*    */   }
/*    */   private static final <K, V> Object[] insertEntryAtIndex(Object[] $this$insertEntryAtIndex, int keyIndex, Object key, Object value) {
/* 31 */     Object[] newBuffer = new Object[$this$insertEntryAtIndex.length + 2];
/* 32 */     ArraysKt.copyInto$default($this$insertEntryAtIndex, newBuffer, 0, 0, keyIndex, 6, null);
/* 33 */     ArraysKt.copyInto($this$insertEntryAtIndex, newBuffer, keyIndex + 2, keyIndex, $this$insertEntryAtIndex.length);
/* 34 */     newBuffer[keyIndex] = key;
/* 35 */     newBuffer[keyIndex + 1] = value;
/* 36 */     return newBuffer;
/*    */   }
/*    */   
/*    */   private static final Object[] replaceEntryWithNode(Object[] $this$replaceEntryWithNode, int keyIndex, int nodeIndex, TrieNode newNode) {
/* 40 */     int newNodeIndex = nodeIndex - 2;
/* 41 */     Object[] newBuffer = new Object[$this$replaceEntryWithNode.length - 2 + 1];
/* 42 */     ArraysKt.copyInto$default($this$replaceEntryWithNode, newBuffer, 0, 0, keyIndex, 6, null);
/* 43 */     ArraysKt.copyInto($this$replaceEntryWithNode, newBuffer, keyIndex, keyIndex + 2, nodeIndex);
/* 44 */     newBuffer[newNodeIndex] = newNode;
/* 45 */     ArraysKt.copyInto($this$replaceEntryWithNode, newBuffer, newNodeIndex + 1, nodeIndex, $this$replaceEntryWithNode.length);
/* 46 */     return newBuffer;
/*    */   }
/*    */   
/*    */   private static final <K, V> Object[] replaceNodeWithEntry(Object[] $this$replaceNodeWithEntry, int nodeIndex, int keyIndex, Object key, Object value) {
/* 50 */     Intrinsics.checkNotNullExpressionValue(Arrays.copyOf($this$replaceNodeWithEntry, $this$replaceNodeWithEntry.length + 1), "copyOf(...)"); Object[] newBuffer = Arrays.copyOf($this$replaceNodeWithEntry, $this$replaceNodeWithEntry.length + 1);
/* 51 */     ArraysKt.copyInto(newBuffer, newBuffer, nodeIndex + 2, nodeIndex + 1, $this$replaceNodeWithEntry.length);
/* 52 */     ArraysKt.copyInto(newBuffer, newBuffer, keyIndex + 2, keyIndex, nodeIndex);
/* 53 */     newBuffer[keyIndex] = key;
/* 54 */     newBuffer[keyIndex + 1] = value;
/* 55 */     return newBuffer;
/*    */   }
/*    */   
/*    */   private static final Object[] removeEntryAtIndex(Object[] $this$removeEntryAtIndex, int keyIndex) {
/* 59 */     Object[] newBuffer = new Object[$this$removeEntryAtIndex.length - 2];
/* 60 */     ArraysKt.copyInto$default($this$removeEntryAtIndex, newBuffer, 0, 0, keyIndex, 6, null);
/* 61 */     ArraysKt.copyInto($this$removeEntryAtIndex, newBuffer, keyIndex, keyIndex + 2, $this$removeEntryAtIndex.length);
/* 62 */     return newBuffer;
/*    */   }
/*    */   
/*    */   private static final Object[] removeNodeAtIndex(Object[] $this$removeNodeAtIndex, int nodeIndex) {
/* 66 */     Object[] newBuffer = new Object[$this$removeNodeAtIndex.length - 1];
/* 67 */     ArraysKt.copyInto$default($this$removeNodeAtIndex, newBuffer, 0, 0, nodeIndex, 6, null);
/* 68 */     ArraysKt.copyInto($this$removeNodeAtIndex, newBuffer, nodeIndex, nodeIndex + 1, $this$removeNodeAtIndex.length);
/* 69 */     return newBuffer;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableMap\TrieNodeKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */