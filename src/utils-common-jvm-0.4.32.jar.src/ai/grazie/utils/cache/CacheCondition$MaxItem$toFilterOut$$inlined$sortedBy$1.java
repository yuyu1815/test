/*     */ package ai.grazie.utils.cache;
/*     */ 
/*     */ import java.util.Comparator;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.comparisons.ComparisonsKt;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CacheCondition.kt\nai/grazie/utils/cache/CacheCondition$MaxItem\n*L\n1#1,102:1\n14#2:103\n*E\n"})
/*     */ public final class CacheCondition$MaxItem$toFilterOut$$inlined$sortedBy$1<T>
/*     */   implements Comparator
/*     */ {
/*     */   public final int compare(Object a, Object b) {
/* 102 */     Map.Entry it = (Map.Entry)a; int $i$a$-sortedBy-CacheCondition$MaxItem$toFilterOut$2 = 0; it = (Map.Entry)b; Long long_ = 
/* 103 */       Long.valueOf(((CacheValue.WithTime)it.getValue()).getEpoch()); $i$a$-sortedBy-CacheCondition$MaxItem$toFilterOut$2 = 0; return ComparisonsKt.compareValues(long_, Long.valueOf(((CacheValue.WithTime)it.getValue()).getEpoch()));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\cache\CacheCondition$MaxItem$toFilterOut$$inlined$sortedBy$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */