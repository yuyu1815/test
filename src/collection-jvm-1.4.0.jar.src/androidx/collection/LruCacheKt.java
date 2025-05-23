/*     */ package androidx.collection;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function4;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000:\n\000\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\020\013\n\002\b\003\n\002\020\002\n\000\032û\001\020\000\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\b\b\000\020\002*\0020\004\"\b\b\001\020\003*\0020\0042\006\020\005\032\0020\00628\b\006\020\007\0322\022\023\022\021H\002¢\006\f\b\t\022\b\b\n\022\004\b\b(\013\022\023\022\021H\003¢\006\f\b\t\022\b\b\n\022\004\b\b(\f\022\004\022\0020\0060\b2%\b\006\020\r\032\037\022\023\022\021H\002¢\006\f\b\t\022\b\b\n\022\004\b\b(\013\022\006\022\004\030\001H\0030\0162d\b\006\020\017\032^\022\023\022\0210\021¢\006\f\b\t\022\b\b\n\022\004\b\b(\022\022\023\022\021H\002¢\006\f\b\t\022\b\b\n\022\004\b\b(\013\022\023\022\021H\003¢\006\f\b\t\022\b\b\n\022\004\b\b(\023\022\025\022\023\030\001H\003¢\006\f\b\t\022\b\b\n\022\004\b\b(\024\022\004\022\0020\0250\020H\bø\001\000\002\007\n\005\b20\001¨\006\026"}, d2 = {"lruCache", "Landroidx/collection/LruCache;", "K", "V", "", "maxSize", "", "sizeOf", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "key", "value", "create", "Lkotlin/Function1;", "onEntryRemoved", "Lkotlin/Function4;", "", "evicted", "oldValue", "newValue", "", "collection"})
/*     */ public final class LruCacheKt
/*     */ {
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 176, d1 = {"\000\020\n\000\n\002\020\b\n\000\n\002\020\000\n\002\b\005\020\000\032\0020\001\"\b\b\000\020\002*\0020\003\"\b\b\001\020\004*\0020\0032\006\020\005\032\002H\0022\006\020\006\032\002H\004H\n¢\006\004\b\007\020\b"}, d2 = {"<anonymous>", "", "K", "", "V", "<anonymous parameter 0>", "<anonymous parameter 1>", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Integer;"})
/*     */   @SourceDebugExtension({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCacheKt$lruCache$1\n*L\n1#1,355:1\n*E\n"})
/*     */   public static final class LruCacheKt$lruCache$1
/*     */     extends Lambda
/*     */     implements Function2<K, V, Integer>
/*     */   {
/*     */     public static final LruCacheKt$lruCache$1 INSTANCE = new LruCacheKt$lruCache$1();
/*     */     
/*     */     public LruCacheKt$lruCache$1() {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Integer invoke(@NotNull K param1K, @NotNull V param1V) {
/* 341 */       Intrinsics.checkNotNullParameter(param1K, "<anonymous parameter 0>"); Intrinsics.checkNotNullParameter(param1V, "<anonymous parameter 1>"); return Integer.valueOf(1); } } @Metadata(mv = {1, 8, 0}, k = 3, xi = 176, d1 = {"\000\f\n\002\b\003\n\002\020\000\n\002\b\003\020\000\032\004\030\001H\001\"\b\b\000\020\002*\0020\003\"\b\b\001\020\001*\0020\0032\006\020\004\032\002H\002H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "V", "K", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}) @SourceDebugExtension({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCacheKt$lruCache$2\n*L\n1#1,355:1\n*E\n"})
/*     */   public static final class LruCacheKt$lruCache$2 extends Lambda implements Function1<K, V> { public static final LruCacheKt$lruCache$2 INSTANCE = new LruCacheKt$lruCache$2(); @Nullable
/* 343 */     public final V invoke(@NotNull Object it) { Intrinsics.checkNotNullParameter(it, "it"); return null; } public LruCacheKt$lruCache$2() { super(1); } }
/*     */    @Metadata(mv = {1, 8, 0}, k = 3, xi = 176, d1 = {"\000\030\n\000\n\002\020\002\n\000\n\002\020\000\n\002\b\002\n\002\020\013\n\002\b\005\020\000\032\0020\001\"\b\b\000\020\002*\0020\003\"\b\b\001\020\004*\0020\0032\006\020\005\032\0020\0062\006\020\007\032\002H\0022\006\020\b\032\002H\0042\b\020\t\032\004\030\001H\004H\n¢\006\004\b\n\020\013"}, d2 = {"<anonymous>", "", "K", "", "V", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "invoke", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V"}) @SourceDebugExtension({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCacheKt$lruCache$3\n*L\n1#1,355:1\n*E\n"}) public static final class LruCacheKt$lruCache$3 extends Lambda implements Function4<Boolean, K, V, V, Unit> {
/* 345 */     public static final LruCacheKt$lruCache$3 INSTANCE = new LruCacheKt$lruCache$3(); public LruCacheKt$lruCache$3() { super(4); } public final void invoke(boolean param1Boolean, @NotNull K param1K, @NotNull V param1V1, @Nullable V param1V2) { Intrinsics.checkNotNullParameter(param1K, "<anonymous parameter 1>"); Intrinsics.checkNotNullParameter(param1V1, "<anonymous parameter 2>"); } }
/*     */   @NotNull
/* 347 */   public static final <K, V> LruCache<K, V> lruCache(int maxSize, @NotNull Function2<? super K, ? super V, Integer> sizeOf, @NotNull Function1<? super K, ? extends V> create, @NotNull Function4<? super Boolean, ? super K, ? super V, ? super V, Unit> onEntryRemoved) { Intrinsics.checkNotNullParameter(sizeOf, "sizeOf"); Intrinsics.checkNotNullParameter(create, "create"); Intrinsics.checkNotNullParameter(onEntryRemoved, "onEntryRemoved"); int $i$f$lruCache = 0; return new LruCacheKt$lruCache$4(maxSize, sizeOf, create, onEntryRemoved); } @Metadata(mv = {1, 8, 0}, k = 1, xi = 176, d1 = {"\000#\n\000\n\002\030\002\n\002\b\004\n\002\020\002\n\000\n\002\020\013\n\002\b\004\n\002\020\b\n\002\b\003*\001\000\b\n\030\0002\016\022\004\022\0028\000\022\004\022\0028\0010\001J\027\020\002\032\004\030\0018\0012\006\020\003\032\0028\000H\024¢\006\002\020\004J/\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\003\032\0028\0002\006\020\t\032\0028\0012\b\020\n\032\004\030\0018\001H\024¢\006\002\020\013J\035\020\f\032\0020\r2\006\020\003\032\0028\0002\006\020\016\032\0028\001H\024¢\006\002\020\017¨\006\020"}, d2 = {"androidx/collection/LruCacheKt$lruCache$4", "Landroidx/collection/LruCache;", "create", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "entryRemoved", "", "evicted", "", "oldValue", "newValue", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "sizeOf", "", "value", "(Ljava/lang/Object;Ljava/lang/Object;)I", "collection"}) @SourceDebugExtension({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCacheKt$lruCache$4\n*L\n1#1,355:1\n*E\n"}) public static final class LruCacheKt$lruCache$4 extends LruCache<K, V> { public LruCacheKt$lruCache$4(int $maxSize, Function2<K, V, Integer> $sizeOf, Function1<K, V> $create, Function4<Boolean, K, V, V, Unit> $onEntryRemoved) { super($maxSize); }
/* 348 */     protected int sizeOf(@NotNull Object key, @NotNull Object value) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(value, "value"); return ((Number)this.$sizeOf.invoke(key, value)).intValue(); } @Nullable
/* 349 */     protected V create(@NotNull Object key) { Intrinsics.checkNotNullParameter(key, "key"); return (V)this.$create.invoke(key); }
/*     */      protected void entryRemoved(boolean evicted, @NotNull Object key, @NotNull Object oldValue, @Nullable Object newValue) {
/* 351 */       Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(oldValue, "oldValue"); this.$onEntryRemoved.invoke(Boolean.valueOf(evicted), key, oldValue, newValue);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\LruCacheKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */