/*     */ package androidx.compose.runtime;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.TestOnly;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000.\n\000\n\002\020\002\n\000\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\n\002\020\000\n\000\032\b\020\000\032\0020\001H\007\032\036\020\002\032\030\022\024\022\022\022\b\022\0060\005j\002`\006\022\004\022\0020\0070\0040\003H\007\032\020\020\b\032\0020\0012\006\020\t\032\0020\nH\007\032\020\020\013\032\0020\0012\006\020\f\032\0020\rH\007¨\006\016"}, d2 = {"clearCompositionErrors", "", "currentCompositionErrors", "", "Lkotlin/Pair;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "invalidateGroupsWithKey", "key", "", "simulateHotReload", "context", "", "runtime"})
/*     */ @SourceDebugExtension({"SMAP\nHotReloader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HotReloader.kt\nandroidx/compose/runtime/HotReloaderKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1549#2:104\n1620#2,3:105\n*S KotlinDebug\n*F\n+ 1 HotReloader.kt\nandroidx/compose/runtime/HotReloaderKt\n*L\n95#1:104\n95#1:105,3\n*E\n"})
/*     */ public final class HotReloaderKt
/*     */ {
/*     */   @TestOnly
/*     */   public static final void simulateHotReload(@NotNull Object context) {
/*  71 */     Intrinsics.checkNotNullParameter(context, "context"); HotReloader.Companion.simulateHotReload$runtime(context);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @TestOnly
/*     */   public static final void invalidateGroupsWithKey(int key) {
/*  81 */     HotReloader.Companion.invalidateGroupsWithKey$runtime(key);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @TestOnly
/*     */   @NotNull
/*     */   public static final List<Pair<Exception, Boolean>> currentCompositionErrors() {
/*  94 */     List<RecomposerErrorInfo> list1 = HotReloader.Companion.getCurrentErrors$runtime();
/*  95 */     int $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 104 */     List<RecomposerErrorInfo> list2 = list1; Collection<Pair> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0;
/* 105 */     for (RecomposerErrorInfo item$iv$iv : list2) {
/* 106 */       RecomposerErrorInfo recomposerErrorInfo1 = item$iv$iv; Collection<Pair> collection = destination$iv$iv; int $i$a$-map-HotReloaderKt$currentCompositionErrors$1 = 0; collection.add(TuplesKt.to(recomposerErrorInfo1.getCause(), Boolean.valueOf(recomposerErrorInfo1.getRecoverable())));
/* 107 */     }  return (List)destination$iv$iv;
/*     */   }
/*     */   
/*     */   @TestOnly
/*     */   public static final void clearCompositionErrors() {
/*     */     HotReloader.Companion.clearErrors$runtime();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\HotReloaderKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */