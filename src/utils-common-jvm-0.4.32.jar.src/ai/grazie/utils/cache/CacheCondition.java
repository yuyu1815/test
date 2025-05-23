/*    */ package ai.grazie.utils.cache;@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\020\"\n\000\n\002\020$\n\002\b\005\b`\030\000*\004\b\000\020\001*\004\b\001\020\0022\0020\003:\003\t\n\013J0\020\004\032\b\022\004\022\0028\0000\0052\022\020\006\032\016\022\004\022\0028\000\022\004\022\0028\0010\0072\f\020\b\032\b\022\004\022\0028\0000\005H&ø\001\000\002\006\n\004\b!0\001¨\006\fÀ\006\001"}, d2 = {"Lai/grazie/utils/cache/CacheCondition;", "Key", "Value", "", "toFilterOut", "", "data", "", "previous", "Aggregated", "MaxItem", "MaxTime", "utils-common"})
/*    */ public interface CacheCondition<Key, Value> { @NotNull
/*    */   Set<Key> toFilterOut(@NotNull Map<Key, ? extends Value> paramMap, @NotNull Set<? extends Key> paramSet);
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\020\"\n\000\n\002\020$\n\002\b\002\030\000*\004\b\002\020\001*\004\b\003\020\0022\024\022\004\022\002H\001\022\n\022\b\022\004\022\002H\0020\0040\003B\r\022\006\020\005\032\0020\006¢\006\002\020\007J6\020\b\032\b\022\004\022\0028\0020\t2\030\020\n\032\024\022\004\022\0028\002\022\n\022\b\022\004\022\0028\0030\0040\0132\f\020\f\032\b\022\004\022\0028\0020\tH\026R\016\020\005\032\0020\006X\004¢\006\002\n\000¨\006\r"}, d2 = {"Lai/grazie/utils/cache/CacheCondition$MaxItem;", "Key", "Value", "Lai/grazie/utils/cache/CacheCondition;", "Lai/grazie/utils/cache/CacheValue$WithTime;", "maxItems", "", "(I)V", "toFilterOut", "", "data", "", "previous", "utils-common"})
/*    */   @SourceDebugExtension({"SMAP\nCacheCondition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheCondition.kt\nai/grazie/utils/cache/CacheCondition$MaxItem\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n535#2:37\n520#2,6:38\n1053#3:44\n1557#3:45\n1628#3,3:46\n*S KotlinDebug\n*F\n+ 1 CacheCondition.kt\nai/grazie/utils/cache/CacheCondition$MaxItem\n*L\n14#1:37\n14#1:38,6\n14#1:44\n14#1:45\n14#1:46,3\n*E\n"})
/*    */   public static final class MaxItem<Key, Value> implements CacheCondition<Key, CacheValue.WithTime<Value>> { public MaxItem(int maxItems) {
/*  8 */       this.maxItems = maxItems;
/*    */     } private final int maxItems; @NotNull
/*    */     public Set<Key> toFilterOut(@NotNull Map data, @NotNull Set previous) {
/* 11 */       Intrinsics.checkNotNullParameter(data, "data"); Intrinsics.checkNotNullParameter(previous, "previous"); int toFilterOutNum = data.size() - previous.size() - this.maxItems;
/* 12 */       if (toFilterOutNum <= 0) return SetsKt.emptySet();
/*    */       
/* 14 */       Map $this$filter$iv = data; int $i$f$filter = 0;
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
/* 37 */       Map map1 = $this$filter$iv; Map<Object, Object> map = new LinkedHashMap<>(); int $i$f$filterTo = 0;
/* 38 */       for (Map.Entry element$iv$iv : map1.entrySet()) {
/* 39 */         Map.Entry it = element$iv$iv; int $i$a$-filter-CacheCondition$MaxItem$toFilterOut$1 = 0; if (!previous.contains(it.getKey())) {
/* 40 */           map.put(element$iv$iv.getKey(), element$iv$iv.getValue());
/*    */         }
/*    */       } 
/* 43 */       Iterable<Map.Entry<Object, Object>> $this$sortedBy$iv = map.entrySet(); int $i$f$sortedBy = 0;
/* 44 */       Iterable $this$map$iv = CollectionsKt.take(CollectionsKt.sortedWith($this$sortedBy$iv, new CacheCondition$MaxItem$toFilterOut$$inlined$sortedBy$1()), toFilterOutNum); int $i$f$map = 0;
/* 45 */       Iterable iterable1 = $this$map$iv; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 46 */       for (Object item$iv$iv : iterable1) {
/* 47 */         Map.Entry entry = (Map.Entry)item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-CacheCondition$MaxItem$toFilterOut$3 = 0; collection.add(entry.getKey());
/* 48 */       }  return CollectionsKt.toSet(destination$iv$iv);
/*    */     } }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\020\"\n\000\n\002\020$\n\002\b\002\030\000*\004\b\002\020\001*\004\b\003\020\0022\024\022\004\022\002H\001\022\n\022\b\022\004\022\002H\0020\0040\003B\r\022\006\020\005\032\0020\006¢\006\002\020\007J6\020\b\032\b\022\004\022\0028\0020\t2\030\020\n\032\024\022\004\022\0028\002\022\n\022\b\022\004\022\0028\0030\0040\0132\f\020\f\032\b\022\004\022\0028\0020\tH\026R\016\020\005\032\0020\006X\004¢\006\002\n\000¨\006\r"}, d2 = {"Lai/grazie/utils/cache/CacheCondition$MaxTime;", "Key", "Value", "Lai/grazie/utils/cache/CacheCondition;", "Lai/grazie/utils/cache/CacheValue$WithTime;", "maxMillis", "", "(I)V", "toFilterOut", "", "data", "", "previous", "utils-common"})
/*    */   @SourceDebugExtension({"SMAP\nCacheCondition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheCondition.kt\nai/grazie/utils/cache/CacheCondition$MaxTime\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,36:1\n535#2:37\n520#2,6:38\n126#3:44\n153#3,3:45\n*S KotlinDebug\n*F\n+ 1 CacheCondition.kt\nai/grazie/utils/cache/CacheCondition$MaxTime\n*L\n22#1:37\n22#1:38,6\n22#1:44\n22#1:45,3\n*E\n"})
/*    */   public static final class MaxTime<Key, Value> implements CacheCondition<Key, CacheValue.WithTime<Value>> {
/*    */     private final int maxMillis;
/*    */     
/*    */     public MaxTime(int maxMillis) {
/*    */       this.maxMillis = maxMillis;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public Set<Key> toFilterOut(@NotNull Map<Object, Object> data, @NotNull Set previous) {
/*    */       Intrinsics.checkNotNullParameter(data, "data");
/*    */       Intrinsics.checkNotNullParameter(previous, "previous");
/*    */       long now = Time.INSTANCE.epochMillis$utils_common();
/*    */       long border = now - this.maxMillis;
/*    */       Map<Object, Object> $this$filter$iv = data;
/*    */       int $i$f$filter = 0;
/*    */       Map<Object, Object> map1 = $this$filter$iv, map2 = new LinkedHashMap<>();
/*    */       int $i$f$filterTo = 0;
/*    */       for (Map.Entry element$iv$iv : map1.entrySet()) {
/*    */         Map.Entry it = element$iv$iv;
/*    */         int $i$a$-filter-CacheCondition$MaxTime$toFilterOut$1 = 0;
/*    */         if ((((CacheValue.WithTime)it.getValue()).getEpoch() < border))
/*    */           map2.put(element$iv$iv.getKey(), element$iv$iv.getValue()); 
/*    */       } 
/*    */       $this$filter$iv = map2;
/*    */       int $i$f$map = 0;
/*    */       Map<Object, Object> $this$filterTo$iv$iv = $this$filter$iv;
/*    */       Collection destination$iv$iv = new ArrayList($this$filter$iv.size());
/*    */       int $i$f$mapTo = 0;
/*    */       for (Map.Entry<Object, Object> item$iv$iv : $this$filterTo$iv$iv.entrySet()) {
/*    */         Map.Entry<Object, Object> entry1 = item$iv$iv;
/*    */         Collection collection = destination$iv$iv;
/*    */         int $i$a$-map-CacheCondition$MaxTime$toFilterOut$2 = 0;
/*    */         collection.add(entry1.getKey());
/*    */       } 
/*    */       return CollectionsKt.toSet(destination$iv$iv);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020 \n\002\b\002\n\002\020\"\n\000\n\002\020$\n\002\b\002\030\000*\004\b\002\020\001*\004\b\003\020\0022\016\022\004\022\002H\001\022\004\022\002H\0020\003B\037\022\030\020\004\032\024\022\020\022\016\022\004\022\0028\002\022\004\022\0028\0030\0030\005¢\006\002\020\006J0\020\007\032\b\022\004\022\0028\0020\b2\022\020\t\032\016\022\004\022\0028\002\022\004\022\0028\0030\n2\f\020\013\032\b\022\004\022\0028\0020\bH\026R \020\004\032\024\022\020\022\016\022\004\022\0028\002\022\004\022\0028\0030\0030\005X\004¢\006\002\n\000¨\006\f"}, d2 = {"Lai/grazie/utils/cache/CacheCondition$Aggregated;", "Key", "Value", "Lai/grazie/utils/cache/CacheCondition;", "conditions", "", "(Ljava/util/List;)V", "toFilterOut", "", "data", "", "previous", "utils-common"})
/*    */   public static final class Aggregated<Key, Value> implements CacheCondition<Key, Value> {
/*    */     @NotNull
/*    */     private final List<CacheCondition<Key, Value>> conditions;
/*    */     
/*    */     public Aggregated(@NotNull List<CacheCondition<Key, Value>> conditions) {
/*    */       this.conditions = conditions;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public Set<Key> toFilterOut(@NotNull Map data, @NotNull Set previous) {
/*    */       Intrinsics.checkNotNullParameter(data, "data");
/*    */       Intrinsics.checkNotNullParameter(previous, "previous");
/*    */       Set<Key> current = CollectionsKt.toMutableSet(previous);
/*    */       for (CacheCondition<Key, Value> condition : this.conditions)
/*    */         current.addAll(condition.toFilterOut(data, current)); 
/*    */       return current;
/*    */     }
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\cache\CacheCondition.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */