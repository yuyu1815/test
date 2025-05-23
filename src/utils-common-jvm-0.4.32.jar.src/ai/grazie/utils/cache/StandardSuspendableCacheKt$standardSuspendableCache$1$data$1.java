/*    */ package ai.grazie.utils.cache;
/*    */ 
/*    */ import java.util.Collection;
/*    */ import java.util.LinkedHashMap;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020&\n\000*\001\000\b\n\030\0002*\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\0020\001j\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\002`\003J\"\020\004\032\0020\0052\030\020\006\032\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\0020\007H\024¨\006\b"}, d2 = {"ai/grazie/utils/cache/StandardSuspendableCacheKt$standardSuspendableCache$1$data$1", "Ljava/util/LinkedHashMap;", "Lai/grazie/utils/cache/CacheValue$WithTime;", "Lkotlin/collections/LinkedHashMap;", "removeEldestEntry", "", "eldest", "", "utils-common"})
/*    */ public final class StandardSuspendableCacheKt$standardSuspendableCache$1$data$1 extends LinkedHashMap<Key, CacheValue.WithTime<Value>> {
/*    */   StandardSuspendableCacheKt$standardSuspendableCache$1$data$1(int $total, int $super_call_param$1) {
/* 13 */     super($super_call_param$1, 0.75F, false);
/*    */   } protected boolean removeEldestEntry(Map.Entry eldest) {
/* 15 */     Intrinsics.checkNotNullParameter(eldest, "eldest"); return (size() > this.$total);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\cache\StandardSuspendableCacheKt$standardSuspendableCache$1$data$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */