/*    */ package androidx.compose.ui.text;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import java.util.Map;
/*    */ import java.util.WeakHashMap;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\b\000\030\000*\b\b\000\020\001*\0020\002*\004\b\001\020\0032\016\022\004\022\002H\001\022\004\022\002H\0030\004B\005¢\006\002\020\005J)\020\b\032\0028\0012\006\020\t\032\0028\0002\022\020\n\032\016\022\004\022\0028\000\022\004\022\0028\0010\013H\026¢\006\002\020\fR\032\020\006\032\016\022\004\022\0028\000\022\004\022\0028\0010\007X\004¢\006\002\n\000¨\006\r"}, d2 = {"Landroidx/compose/ui/text/WeakKeysCache;", "K", "", "V", "Landroidx/compose/ui/text/Cache;", "()V", "cache", "Ljava/util/WeakHashMap;", "get", "key", "loader", "Lkotlin/Function1;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ui-text"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nCache.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cache.jvm.kt\nandroidx/compose/ui/text/WeakKeysCache\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,26:1\n372#2,7:27\n*S KotlinDebug\n*F\n+ 1 Cache.jvm.kt\nandroidx/compose/ui/text/WeakKeysCache\n*L\n24#1:27,7\n*E\n"})
/*    */ public final class WeakKeysCache<K, V>
/*    */   implements Cache<K, V>
/*    */ {
/*    */   @NotNull
/* 21 */   private final WeakHashMap<K, V> cache = new WeakHashMap<>();
/*    */   
/*    */   public V get(@NotNull Object key, @NotNull Function1 loader) {
/* 24 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(loader, "loader"); Map<K, V> $this$getOrPut$iv = this.cache; int $i$f$getOrPut = 0;
/*    */ 
/*    */     
/* 27 */     Object value$iv = $this$getOrPut$iv.get(key);
/* 28 */     if (value$iv == null) {
/* 29 */       int $i$a$-getOrPut-WeakKeysCache$get$1 = 0; Object answer$iv = loader.invoke(key);
/* 30 */       $this$getOrPut$iv.put((K)key, (V)answer$iv);
/*    */     } 
/*    */     
/* 33 */     return (V)value$iv;
/*    */   }
/*    */   
/*    */   public static final int $stable = 8;
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\WeakKeysCache.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */