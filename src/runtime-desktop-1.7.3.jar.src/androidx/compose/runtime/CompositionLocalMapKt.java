/*     */ package androidx.compose.runtime;
/*     */ 
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
/*     */ import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000<\n\000\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020%\n\002\020\000\n\002\030\002\n\002\020\002\n\002\b\003\0323\020\000\032\0020\0012\022\020\002\032\016\022\n\b\001\022\006\022\002\b\0030\0040\0032\006\020\005\032\0020\0012\b\b\002\020\006\032\0020\001H\000¢\006\002\020\007\032 \020\b\032\0020\t\"\004\b\000\020\n*\0020\0012\f\020\013\032\b\022\004\022\002H\n0\fH\000\032@\020\r\032\0020\001*\0020\0012.\020\016\032*\022 \022\036\022\f\022\n\022\006\022\004\030\0010\0210\f\022\f\022\n\022\006\022\004\030\0010\0210\0220\020\022\004\022\0020\0230\017H\bø\001\000\032%\020\024\032\002H\n\"\004\b\000\020\n*\0020\0012\f\020\013\032\b\022\004\022\002H\n0\fH\000¢\006\002\020\025\002\007\n\005\b20\001¨\006\026"}, d2 = {"updateCompositionMap", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "values", "", "Landroidx/compose/runtime/ProvidedValue;", "parentScope", "previous", "([Landroidx/compose/runtime/ProvidedValue;Landroidx/compose/runtime/PersistentCompositionLocalMap;Landroidx/compose/runtime/PersistentCompositionLocalMap;)Landroidx/compose/runtime/PersistentCompositionLocalMap;", "contains", "", "T", "key", "Landroidx/compose/runtime/CompositionLocal;", "mutate", "mutator", "Lkotlin/Function1;", "", "", "Landroidx/compose/runtime/ValueHolder;", "", "read", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "runtime"})
/*     */ @SourceDebugExtension({"SMAP\nCompositionLocalMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocalMap.kt\nandroidx/compose/runtime/CompositionLocalMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"})
/*     */ public final class CompositionLocalMapKt
/*     */ {
/*     */   @NotNull
/*     */   public static final PersistentCompositionLocalMap mutate(@NotNull PersistentCompositionLocalMap $this$mutate, @NotNull Function1 mutator) {
/*  82 */     Intrinsics.checkNotNullParameter($this$mutate, "<this>"); Intrinsics.checkNotNullParameter(mutator, "mutator"); int $i$f$mutate = 0; PersistentCompositionLocalMap.Builder builder = $this$mutate.builder(); mutator.invoke(builder); return builder.build();
/*     */   }
/*     */   
/*     */   public static final <T> boolean contains(@NotNull PersistentCompositionLocalMap $this$contains, @NotNull CompositionLocal key) {
/*  86 */     Intrinsics.checkNotNullParameter($this$contains, "<this>"); Intrinsics.checkNotNullParameter(key, "key"); return $this$contains.containsKey(key);
/*     */   }
/*     */ 
/*     */   
/*     */   public static final <T> T read(@NotNull PersistentCompositionLocalMap $this$read, @NotNull CompositionLocal<T> key) {
/*  91 */     Intrinsics.checkNotNullParameter($this$read, "<this>"); Intrinsics.checkNotNullParameter(key, "key"); Map map = (Map)$this$read; if (map.get(key) == null) { map.get(key);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 114 */       int $i$a$-getOrElse-CompositionLocalMapKt$read$1 = 0; }
/*     */     
/*     */     return key.getDefaultValueHolder$runtime().readValue($this$read);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final PersistentCompositionLocalMap updateCompositionMap(@NotNull ProvidedValue[] values, @NotNull PersistentCompositionLocalMap parentScope, @NotNull PersistentCompositionLocalMap previous) {
/*     */     Intrinsics.checkNotNullParameter(values, "values");
/*     */     Intrinsics.checkNotNullParameter(parentScope, "parentScope");
/*     */     Intrinsics.checkNotNullParameter(previous, "previous");
/*     */     PersistentCompositionLocalMap.Builder builder = (PersistentCompositionLocalMap.Builder)PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf().builder();
/*     */     PersistentMap map = previous;
/*     */     for (int index = 0, i = values.length; index < i; index++) {
/*     */       ProvidedValue<?> provided = values[index];
/*     */       Intrinsics.checkNotNull(provided.getCompositionLocal(), "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
/*     */       ProvidableCompositionLocal<?> local = (ProvidableCompositionLocal)provided.getCompositionLocal();
/*     */       if (provided.getCanOverride() || !contains(parentScope, local)) {
/*     */         ValueHolder<?> previousState = (ValueHolder)map.get(local);
/*     */         Intrinsics.checkNotNull(provided, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
/*     */         ValueHolder<?> newState = local.updatedStateOf$runtime(provided, previousState);
/*     */         ((Map<ProvidableCompositionLocal<?>, ValueHolder<?>>)builder).put(local, newState);
/*     */       } 
/*     */     } 
/*     */     return builder.build();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\CompositionLocalMapKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */