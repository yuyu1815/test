/*     */ package ai.grazie.utils.cache;
/*     */ 
/*     */ import ai.grazie.utils.mpp.time.Time;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\000\n\002\030\002\n\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\007*\002\000\003\b\n\030\0002\016\022\004\022\0028\000\022\004\022\0028\0010\001J\b\020\005\032\0020\006H\026J\035\020\007\032\n\022\004\022\0028\001\030\0010\b2\006\020\t\032\0028\000H\026¢\006\002\020\nJ+\020\013\032\b\022\004\022\0028\0010\b2\006\020\t\032\0028\0002\016\020\f\032\n\022\006\022\004\030\0018\0010\rH\026¢\006\002\020\016J\025\020\017\032\0020\0062\006\020\t\032\0028\000H\026¢\006\002\020\020J\037\020\021\032\0020\0062\006\020\t\032\0028\0002\b\020\022\032\004\030\0018\001H\026¢\006\002\020\023R\034\020\002\032\016\022\004\022\0028\000\022\004\022\0028\0010\003X\004¢\006\004\n\002\020\004¨\006\024"}, d2 = {"ai/grazie/utils/cache/StandardCacheKt$standardCache$1", "Lai/grazie/utils/cache/CacheWithNulls;", "data", "ai/grazie/utils/cache/StandardCacheKt$standardCache$1$data$1", "Lai/grazie/utils/cache/StandardCacheKt$standardCache$1$data$1;", "clear", "", "get", "Lai/grazie/utils/cache/Wrapper;", "key", "(Ljava/lang/Object;)Lai/grazie/utils/cache/Wrapper;", "getOrPut", "loader", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Lai/grazie/utils/cache/Wrapper;", "invalidate", "(Ljava/lang/Object;)V", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "utils-common"})
/*     */ public final class StandardCacheKt$standardCache$1
/*     */   implements CacheWithNulls<Key, Value>
/*     */ {
/*     */   private final StandardCacheKt$standardCache$1$data$1 data;
/*     */   
/*     */   StandardCacheKt$standardCache$1(int $total, Integer $maxMillis) {
/*  52 */     int i = Math.max(16, $total / 4); this.data = new StandardCacheKt$standardCache$1$data$1($total, i); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020&\n\000*\001\000\b\n\030\0002*\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\0020\001j\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\002`\003J\"\020\004\032\0020\0052\030\020\006\032\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\0020\007H\024¨\006\b"}, d2 = {"ai/grazie/utils/cache/StandardCacheKt$standardCache$1$data$1", "Ljava/util/LinkedHashMap;", "Lai/grazie/utils/cache/CacheValue$WithTime;", "Lkotlin/collections/LinkedHashMap;", "removeEldestEntry", "", "eldest", "", "utils-common"}) public static final class StandardCacheKt$standardCache$1$data$1 extends LinkedHashMap<Key, CacheValue.WithTime<Value>> { StandardCacheKt$standardCache$1$data$1(int $total, int $super_call_param$1) { super($super_call_param$1, 0.75F, false); }
/*     */      protected boolean removeEldestEntry(Map.Entry eldest) {
/*  54 */       Intrinsics.checkNotNullParameter(eldest, "eldest"); return (size() > this.$total);
/*     */     } }
/*     */ 
/*     */   
/*     */   public Wrapper<Value> get(Object key) {
/*  59 */     Intrinsics.checkNotNullParameter(key, "key"); synchronized (this) { int $i$a$-synchronized-StandardCacheKt$standardCache$1$get$1 = 0;
/*  60 */       CacheValue.WithTime<Value> withTime = this.data.get(key); Intrinsics.checkNotNullExpressionValue(withTime, "data[key]"); Wrapper<Value> wrapper = (withTime != null) ? CacheValueKt.<Value>toWrapper(withTime) : null; }
/*     */     
/*     */     return wrapper;
/*     */   }
/*     */   public void put(Object key, Object value) {
/*  65 */     Intrinsics.checkNotNullParameter(key, "key"); Integer integer = this.$maxMillis; synchronized (this) { int $i$a$-synchronized-StandardCacheKt$standardCache$1$put$1 = 0;
/*  66 */       this.data.remove(key);
/*  67 */       this.data.put(key, new CacheValue.WithTime.Default(value, 0L, 2, null));
/*     */       
/*  69 */       if (integer != null) {
/*  70 */         long now = Time.INSTANCE.epochMillis$utils_common();
/*  71 */         long border = now - integer.intValue();
/*     */         
/*  73 */         Iterator<Map.Entry> iterator = this.data.entrySet().iterator();
/*  74 */         while (iterator.hasNext() && (
/*  75 */           (CacheValue.WithTime)((Map.Entry)iterator.next()).getValue()).getEpoch() < border) {
/*  76 */           iterator.remove();
/*     */         }
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  83 */       Unit unit = Unit.INSTANCE; }
/*     */   
/*     */   }
/*     */   public void invalidate(Object key) {
/*  87 */     Intrinsics.checkNotNullParameter(key, "key"); synchronized (this) { int $i$a$-synchronized-StandardCacheKt$standardCache$1$invalidate$1 = 0; CacheValue.WithTime<Value> withTime = 
/*  88 */         this.data.remove(key); }
/*     */   
/*     */   }
/*     */   
/*     */   public void clear() {
/*  93 */     synchronized (this) { int $i$a$-synchronized-StandardCacheKt$standardCache$1$clear$1 = 0;
/*  94 */       this.data.clear();
/*  95 */       Unit unit = Unit.INSTANCE; }
/*     */   
/*     */   }
/*     */   public Wrapper<Value> getOrPut(Object key, Function0 loader) {
/*  99 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(loader, "loader"); synchronized (this) { int $i$a$-synchronized-StandardCacheKt$standardCache$1$getOrPut$1 = 0;
/* 100 */       Wrapper<Value> value = get((Key)key);
/* 101 */       if (value == null) {
/* 102 */         put((Key)key, (Value)loader.invoke());
/*     */       }
/* 104 */       Intrinsics.checkNotNull(get((Key)key)); Wrapper<Value> wrapper1 = get((Key)key); }
/*     */     
/*     */     return wrapper1;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\cache\StandardCacheKt$standardCache$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */