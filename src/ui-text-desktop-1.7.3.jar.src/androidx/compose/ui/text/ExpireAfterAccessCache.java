/*    */ package androidx.compose.ui.text;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import java.util.ArrayList;
/*    */ import java.util.HashMap;
/*    */ import java.util.Iterator;
/*    */ import java.util.LinkedHashMap;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.FunctionReferenceImpl;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.skiko.Actuals_jvmKt;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\t\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\007\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\004\n\002\030\002\n\002\b\002\b\000\030\000*\004\b\000\020\001*\004\b\001\020\0022\016\022\004\022\002H\001\022\004\022\002H\0020\003B\035\022\006\020\004\032\0020\005\022\016\b\002\020\006\032\b\022\004\022\0020\0050\007¢\006\002\020\bJ\020\020\027\032\0020\0302\006\020\031\032\0020\005H\002J)\020\032\032\0028\0012\006\020\033\032\0028\0002\022\020\034\032\016\022\004\022\0028\000\022\004\022\0028\0010\035H\026¢\006\002\020\036R0\020\t\032\036\022\004\022\0028\000\022\004\022\0020\0050\nj\016\022\004\022\0028\000\022\004\022\0020\005`\013X\004¢\006\b\n\000\032\004\b\f\020\rR\027\020\006\032\b\022\004\022\0020\0050\007¢\006\b\n\000\032\004\b\016\020\017R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\020\020\021R0\020\022\032\036\022\004\022\0028\000\022\004\022\0028\0010\023j\016\022\004\022\0028\000\022\004\022\0028\001`\024X\004¢\006\b\n\000\032\004\b\025\020\026¨\006\037"}, d2 = {"Landroidx/compose/ui/text/ExpireAfterAccessCache;", "K", "V", "Landroidx/compose/ui/text/Cache;", "expireAfterNanos", "", "currentNanos", "Lkotlin/Function0;", "(JLkotlin/jvm/functions/Function0;)V", "accessTime", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "getAccessTime$ui_text", "()Ljava/util/LinkedHashMap;", "getCurrentNanos", "()Lkotlin/jvm/functions/Function0;", "getExpireAfterNanos", "()J", "map", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getMap$ui_text", "()Ljava/util/HashMap;", "checkEvicted", "", "now", "get", "key", "loader", "Lkotlin/Function1;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ui-text"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nCache.skiko.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cache.skiko.kt\nandroidx/compose/ui/text/ExpireAfterAccessCache\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n372#2,7:64\n959#3,7:71\n1855#3,2:78\n*S KotlinDebug\n*F\n+ 1 Cache.skiko.kt\nandroidx/compose/ui/text/ExpireAfterAccessCache\n*L\n44#1:64,7\n55#1:71,7\n57#1:78,2\n*E\n"})
/*    */ public final class ExpireAfterAccessCache<K, V>
/*    */   implements Cache<K, V>
/*    */ {
/*    */   private final long expireAfterNanos;
/*    */   @NotNull
/*    */   private final Function0<Long> currentNanos;
/*    */   @NotNull
/*    */   private final HashMap<K, V> map;
/*    */   @NotNull
/*    */   private final LinkedHashMap<K, Long> accessTime;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   public ExpireAfterAccessCache(long expireAfterNanos, @NotNull Function0<Long> currentNanos) {
/* 36 */     this.expireAfterNanos = expireAfterNanos;
/* 37 */     this.currentNanos = currentNanos;
/*    */     
/* 39 */     this.map = new HashMap<>();
/* 40 */     this.accessTime = new LinkedHashMap<>(); } public final long getExpireAfterNanos() { return this.expireAfterNanos; } @NotNull public final LinkedHashMap<K, Long> getAccessTime$ui_text() { return this.accessTime; }
/*    */   @NotNull public final Function0<Long> getCurrentNanos() { return this.currentNanos; }
/*    */   @NotNull
/* 43 */   public final HashMap<K, V> getMap$ui_text() { return this.map; } public V get(Object key, @NotNull Function1 loader) { Intrinsics.checkNotNullParameter(loader, "loader"); this.accessTime.remove(key);
/* 44 */     Map<K, V> $this$getOrPut$iv = this.map; int $i$f$getOrPut = 0;
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
/* 64 */     Object value$iv = $this$getOrPut$iv.get(key);
/* 65 */     if (value$iv == null) {
/* 66 */       int $i$a$-getOrPut-ExpireAfterAccessCache$get$1 = 0; Object answer$iv = loader.invoke(key);
/* 67 */       $this$getOrPut$iv.put((K)key, (V)answer$iv);
/*    */     } 
/*    */     
/* 70 */     Object object1 = value$iv; Object it = object1; int $i$a$-also-ExpireAfterAccessCache$get$2 = 0; long now = ((Number)this.currentNanos.invoke()).longValue(); Long long_ = Long.valueOf(now); this.accessTime.put((K)key, long_); checkEvicted(now); return (V)object1; } private final void checkEvicted(long now) { long expireTime = now - this.expireAfterNanos; Intrinsics.checkNotNullExpressionValue(this.accessTime.keySet(), "<get-keys>(...)"); Iterable<K> $this$takeWhile$iv = this.accessTime.keySet(); int $i$f$takeWhile = 0;
/* 71 */     ArrayList<Object> list$iv = new ArrayList();
/* 72 */     for (K item$iv : $this$takeWhile$iv) {
/* 73 */       Object it = item$iv; int $i$a$-takeWhile-ExpireAfterAccessCache$checkEvicted$1 = 0; Intrinsics.checkNotNull(this.accessTime.get(it)); if (!((this.accessTime.get(it).longValue() < expireTime) ? 1 : 0))
/*    */         break; 
/* 75 */       list$iv.add(item$iv);
/*    */     } 
/* 77 */     $this$takeWhile$iv = list$iv; int $i$f$forEach = 0;
/* 78 */     Iterator<K> iterator = $this$takeWhile$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(), it = element$iv; int $i$a$-forEach-ExpireAfterAccessCache$checkEvicted$2 = 0;
/*    */       this.map.remove(it);
/*    */       this.accessTime.remove(it); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\ExpireAfterAccessCache.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */