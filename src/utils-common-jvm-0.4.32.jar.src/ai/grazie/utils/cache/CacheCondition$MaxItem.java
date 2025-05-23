/*    */ package ai.grazie.utils.cache;
/*    */ import java.util.Map;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\020\"\n\000\n\002\020$\n\002\b\002\030\000*\004\b\002\020\001*\004\b\003\020\0022\024\022\004\022\002H\001\022\n\022\b\022\004\022\002H\0020\0040\003B\r\022\006\020\005\032\0020\006¢\006\002\020\007J6\020\b\032\b\022\004\022\0028\0020\t2\030\020\n\032\024\022\004\022\0028\002\022\n\022\b\022\004\022\0028\0030\0040\0132\f\020\f\032\b\022\004\022\0028\0020\tH\026R\016\020\005\032\0020\006X\004¢\006\002\n\000¨\006\r"}, d2 = {"Lai/grazie/utils/cache/CacheCondition$MaxItem;", "Key", "Value", "Lai/grazie/utils/cache/CacheCondition;", "Lai/grazie/utils/cache/CacheValue$WithTime;", "maxItems", "", "(I)V", "toFilterOut", "", "data", "", "previous", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nCacheCondition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheCondition.kt\nai/grazie/utils/cache/CacheCondition$MaxItem\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n535#2:37\n520#2,6:38\n1053#3:44\n1557#3:45\n1628#3,3:46\n*S KotlinDebug\n*F\n+ 1 CacheCondition.kt\nai/grazie/utils/cache/CacheCondition$MaxItem\n*L\n14#1:37\n14#1:38,6\n14#1:44\n14#1:45\n14#1:46,3\n*E\n"})
/*    */ public final class MaxItem<Key, Value> implements CacheCondition<Key, CacheValue.WithTime<Value>> {
/*    */   public MaxItem(int maxItems) {
/*  8 */     this.maxItems = maxItems;
/*    */   } private final int maxItems; @NotNull
/*    */   public Set<Key> toFilterOut(@NotNull Map data, @NotNull Set previous) {
/* 11 */     Intrinsics.checkNotNullParameter(data, "data"); Intrinsics.checkNotNullParameter(previous, "previous"); int toFilterOutNum = data.size() - previous.size() - this.maxItems;
/* 12 */     if (toFilterOutNum <= 0) return SetsKt.emptySet();
/*    */     
/* 14 */     Map $this$filter$iv = data; int $i$f$filter = 0;
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
/* 37 */     Map map1 = $this$filter$iv; Map<Object, Object> map = new LinkedHashMap<>(); int $i$f$filterTo = 0;
/* 38 */     for (Map.Entry element$iv$iv : map1.entrySet()) {
/* 39 */       Map.Entry it = element$iv$iv; int $i$a$-filter-CacheCondition$MaxItem$toFilterOut$1 = 0; if (!previous.contains(it.getKey())) {
/* 40 */         map.put(element$iv$iv.getKey(), element$iv$iv.getValue());
/*    */       }
/*    */     } 
/* 43 */     Iterable<Map.Entry<Object, Object>> $this$sortedBy$iv = map.entrySet(); int $i$f$sortedBy = 0;
/* 44 */     Iterable $this$map$iv = CollectionsKt.take(CollectionsKt.sortedWith($this$sortedBy$iv, new CacheCondition$MaxItem$toFilterOut$$inlined$sortedBy$1()), toFilterOutNum); int $i$f$map = 0;
/* 45 */     Iterable iterable1 = $this$map$iv; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 46 */     for (Object item$iv$iv : iterable1) {
/* 47 */       Map.Entry entry = (Map.Entry)item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-CacheCondition$MaxItem$toFilterOut$3 = 0; collection.add(entry.getKey());
/* 48 */     }  return CollectionsKt.toSet(destination$iv$iv);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\cache\CacheCondition$MaxItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */