/*    */ package androidx.compose.runtime.internal;
/*    */ 
/*    */ import androidx.compose.runtime.PersistentCompositionLocalMap;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Pair;
/*    */ import kotlin.collections.MapsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000$\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\030\002\n\002\020\000\n\002\030\002\n\002\b\002\032\b\020\000\032\0020\001H\000\032Y\020\000\032\0020\0022J\020\003\032&\022\"\b\001\022\036\022\f\022\n\022\006\022\004\030\0010\0070\006\022\f\022\n\022\006\022\004\030\0010\0070\b0\0050\004\"\036\022\f\022\n\022\006\022\004\030\0010\0070\006\022\f\022\n\022\006\022\004\030\0010\0070\b0\005H\000¢\006\002\020\t¨\006\n"}, d2 = {"persistentCompositionLocalHashMapOf", "Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "pairs", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/ValueHolder;", "([Lkotlin/Pair;)Landroidx/compose/runtime/PersistentCompositionLocalMap;", "runtime"})
/*    */ @SourceDebugExtension({"SMAP\nPersistentCompositionLocalMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentCompositionLocalMap.kt\nandroidx/compose/runtime/internal/PersistentCompositionLocalMapKt\n+ 2 CompositionLocalMap.kt\nandroidx/compose/runtime/CompositionLocalMapKt\n*L\n1#1,85:1\n82#2:86\n*S KotlinDebug\n*F\n+ 1 PersistentCompositionLocalMap.kt\nandroidx/compose/runtime/internal/PersistentCompositionLocalMapKt\n*L\n84#1:86\n*E\n"})
/*    */ public final class PersistentCompositionLocalMapKt
/*    */ {
/*    */   @NotNull
/*    */   public static final PersistentCompositionLocalHashMap persistentCompositionLocalHashMapOf() {
/* 80 */     return PersistentCompositionLocalHashMap.Companion.getEmpty();
/*    */   }
/*    */   @NotNull
/*    */   public static final PersistentCompositionLocalMap persistentCompositionLocalHashMapOf(@NotNull Pair... pairs) {
/* 84 */     Intrinsics.checkNotNullParameter(pairs, "pairs"); PersistentCompositionLocalMap $this$mutate$iv = PersistentCompositionLocalHashMap.Companion.getEmpty(); int $i$f$mutate = 0;
/*    */     
/* 86 */     PersistentCompositionLocalMap.Builder builder = $this$mutate$iv.builder(); Map it = (Map)builder; int $i$a$-mutate-PersistentCompositionLocalMapKt$persistentCompositionLocalHashMapOf$1 = 0; MapsKt.putAll(it, pairs); return builder.build();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\internal\PersistentCompositionLocalMapKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */