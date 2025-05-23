/*    */ package ai.grazie.utils.cache;
/*    */ 
/*    */ import ai.grazie.utils.mpp.time.Time;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.LinkedHashMap;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\020\"\n\000\n\002\020$\n\002\b\002\030\000*\004\b\002\020\001*\004\b\003\020\0022\024\022\004\022\002H\001\022\n\022\b\022\004\022\002H\0020\0040\003B\r\022\006\020\005\032\0020\006¢\006\002\020\007J6\020\b\032\b\022\004\022\0028\0020\t2\030\020\n\032\024\022\004\022\0028\002\022\n\022\b\022\004\022\0028\0030\0040\0132\f\020\f\032\b\022\004\022\0028\0020\tH\026R\016\020\005\032\0020\006X\004¢\006\002\n\000¨\006\r"}, d2 = {"Lai/grazie/utils/cache/CacheCondition$MaxTime;", "Key", "Value", "Lai/grazie/utils/cache/CacheCondition;", "Lai/grazie/utils/cache/CacheValue$WithTime;", "maxMillis", "", "(I)V", "toFilterOut", "", "data", "", "previous", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nCacheCondition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheCondition.kt\nai/grazie/utils/cache/CacheCondition$MaxTime\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,36:1\n535#2:37\n520#2,6:38\n126#3:44\n153#3,3:45\n*S KotlinDebug\n*F\n+ 1 CacheCondition.kt\nai/grazie/utils/cache/CacheCondition$MaxTime\n*L\n22#1:37\n22#1:38,6\n22#1:44\n22#1:45,3\n*E\n"})
/*    */ public final class MaxTime<Key, Value> implements CacheCondition<Key, CacheValue.WithTime<Value>> {
/* 18 */   public MaxTime(int maxMillis) { this.maxMillis = maxMillis; } private final int maxMillis; @NotNull
/*    */   public Set<Key> toFilterOut(@NotNull Map<Object, Object> data, @NotNull Set previous) {
/* 20 */     Intrinsics.checkNotNullParameter(data, "data"); Intrinsics.checkNotNullParameter(previous, "previous"); long now = Time.INSTANCE.epochMillis$utils_common();
/* 21 */     long border = now - this.maxMillis;
/* 22 */     Map<Object, Object> $this$filter$iv = data; int $i$f$filter = 0;
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
/* 37 */     Map<Object, Object> map1 = $this$filter$iv, map2 = new LinkedHashMap<>(); int $i$f$filterTo = 0;
/* 38 */     for (Map.Entry element$iv$iv : map1.entrySet()) {
/* 39 */       Map.Entry it = element$iv$iv; int $i$a$-filter-CacheCondition$MaxTime$toFilterOut$1 = 0; if ((((CacheValue.WithTime)it.getValue()).getEpoch() < border)) {
/* 40 */         map2.put(element$iv$iv.getKey(), element$iv$iv.getValue());
/*    */       }
/*    */     } 
/* 43 */     $this$filter$iv = map2; int $i$f$map = 0;
/* 44 */     Map<Object, Object> $this$filterTo$iv$iv = $this$filter$iv; Collection destination$iv$iv = new ArrayList($this$filter$iv.size()); int $i$f$mapTo = 0;
/* 45 */     for (Map.Entry<Object, Object> item$iv$iv : $this$filterTo$iv$iv.entrySet()) {
/* 46 */       Map.Entry<Object, Object> entry1 = item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-CacheCondition$MaxTime$toFilterOut$2 = 0; collection.add(entry1.getKey());
/* 47 */     }  return CollectionsKt.toSet(destination$iv$iv);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\cache\CacheCondition$MaxTime.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */