/*     */ package androidx.compose.runtime.tooling;
/*     */ 
/*     */ import androidx.compose.runtime.Composition;
/*     */ import androidx.compose.runtime.CompositionImpl;
/*     */ import androidx.compose.runtime.CompositionKt;
/*     */ import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
/*     */ import androidx.compose.runtime.RecomposeScope;
/*     */ import androidx.compose.runtime.RecomposeScopeImpl;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\032\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\032\026\020\000\032\004\030\0010\001*\0020\0022\006\020\003\032\0020\004H\007\032\024\020\000\032\0020\001*\0020\0052\006\020\003\032\0020\006H\007¨\006\007"}, d2 = {"observe", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "Landroidx/compose/runtime/Composition;", "observer", "Landroidx/compose/runtime/tooling/CompositionObserver;", "Landroidx/compose/runtime/RecomposeScope;", "Landroidx/compose/runtime/tooling/RecomposeScopeObserver;", "runtime"})
/*     */ public final class CompositionObserverKt
/*     */ {
/*     */   @ExperimentalComposeRuntimeApi
/*     */   @Nullable
/*     */   public static final CompositionObserverHandle observe(@NotNull Composition $this$observe, @NotNull CompositionObserver observer) {
/* 115 */     Intrinsics.checkNotNullParameter($this$observe, "<this>"); Intrinsics.checkNotNullParameter(observer, "observer"); (CompositionImpl)CompositionKt.getCompositionService($this$observe, CompositionKt.getCompositionImplServiceKey()); return ((CompositionImpl)CompositionKt.getCompositionService($this$observe, CompositionKt.getCompositionImplServiceKey()) != null) ? ((CompositionImpl)CompositionKt.getCompositionService($this$observe, CompositionKt.getCompositionImplServiceKey())).observe$runtime(observer) : null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ExperimentalComposeRuntimeApi
/*     */   @NotNull
/*     */   public static final CompositionObserverHandle observe(@NotNull RecomposeScope $this$observe, @NotNull RecomposeScopeObserver observer) {
/* 126 */     Intrinsics.checkNotNullParameter($this$observe, "<this>"); Intrinsics.checkNotNullParameter(observer, "observer"); return ((RecomposeScopeImpl)$this$observe).observe$runtime(observer);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\tooling\CompositionObserverKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */