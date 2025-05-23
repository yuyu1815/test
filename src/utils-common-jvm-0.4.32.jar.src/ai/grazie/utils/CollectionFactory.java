/*    */ package ai.grazie.utils;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020%\n\002\020\b\n\002\b\004\n\002\020!\n\002\b\004\n\002\020#\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\022\020\003\032\016\022\004\022\0020\005\022\004\022\0020\0050\004J\032\020\003\032\016\022\004\022\0020\005\022\004\022\0020\0050\0042\006\020\006\032\0020\005J\030\020\007\032\016\022\004\022\0020\005\022\004\022\002H\b0\004\"\004\b\000\020\bJ \020\007\032\016\022\004\022\0020\005\022\004\022\002H\b0\004\"\004\b\000\020\b2\006\020\006\032\0020\005J\f\020\t\032\b\022\004\022\0020\0050\nJ\024\020\t\032\b\022\004\022\0020\0050\n2\006\020\006\032\0020\005J\030\020\013\032\016\022\004\022\002H\f\022\004\022\0020\0050\004\"\004\b\000\020\fJ \020\013\032\016\022\004\022\002H\f\022\004\022\0020\0050\004\"\004\b\000\020\f2\006\020\006\032\0020\005J\036\020\r\032\016\022\004\022\002H\f\022\004\022\002H\b0\004\"\004\b\000\020\f\"\004\b\001\020\bJ&\020\r\032\016\022\004\022\002H\f\022\004\022\002H\b0\004\"\004\b\000\020\f\"\004\b\001\020\b2\006\020\006\032\0020\005J\022\020\016\032\b\022\004\022\002H\b0\017\"\004\b\000\020\b¨\006\020"}, d2 = {"Lai/grazie/utils/CollectionFactory;", "", "()V", "smallMemoryFootPrintIntIntMap", "", "", "expected", "smallMemoryFootprintIntKeyMap", "V", "smallMemoryFootprintIntList", "", "smallMemoryFootprintIntValueMap", "K", "smallMemoryFootprintMap", "smallMemoryFootprintSet", "", "utils-common"})
/*    */ public final class CollectionFactory {
/*    */   @NotNull
/*    */   public final <V> Set<V> smallMemoryFootprintSet() {
/* 10 */     return (Set<V>)new ObjectOpenHashSet();
/*    */   } @NotNull
/*    */   public static final CollectionFactory INSTANCE = new CollectionFactory(); @NotNull
/*    */   public final <K, V> Map<K, V> smallMemoryFootprintMap() {
/* 14 */     return (Map<K, V>)new Object2ObjectOpenHashMap();
/*    */   }
/*    */   @NotNull
/*    */   public final <K, V> Map<K, V> smallMemoryFootprintMap(int expected) {
/* 18 */     return (Map<K, V>)new Object2ObjectOpenHashMap(expected);
/*    */   }
/*    */   @NotNull
/*    */   public final List<Integer> smallMemoryFootprintIntList() {
/* 22 */     return (List<Integer>)new IntArrayList();
/*    */   } @NotNull
/*    */   public final List<Integer> smallMemoryFootprintIntList(int expected) {
/* 25 */     return (List<Integer>)new IntArrayList(expected);
/*    */   }
/*    */   @NotNull
/*    */   public final <K> Map<K, Integer> smallMemoryFootprintIntValueMap() {
/* 29 */     return (Map<K, Integer>)new Object2IntOpenHashMap();
/*    */   }
/*    */   @NotNull
/*    */   public final <K> Map<K, Integer> smallMemoryFootprintIntValueMap(int expected) {
/* 33 */     return (Map<K, Integer>)new Object2IntOpenHashMap(expected);
/*    */   }
/*    */   @NotNull
/*    */   public final <V> Map<Integer, V> smallMemoryFootprintIntKeyMap() {
/* 37 */     return (Map<Integer, V>)new Int2ObjectOpenHashMap();
/*    */   }
/*    */   @NotNull
/*    */   public final <V> Map<Integer, V> smallMemoryFootprintIntKeyMap(int expected) {
/* 41 */     return (Map<Integer, V>)new Int2ObjectOpenHashMap(expected);
/*    */   }
/*    */   @NotNull
/*    */   public final Map<Integer, Integer> smallMemoryFootPrintIntIntMap() {
/* 45 */     return (Map<Integer, Integer>)new Int2IntOpenHashMap();
/*    */   } @NotNull
/*    */   public final Map<Integer, Integer> smallMemoryFootPrintIntIntMap(int expected) {
/* 48 */     return (Map<Integer, Integer>)new Int2IntOpenHashMap(expected);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\CollectionFactory.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */