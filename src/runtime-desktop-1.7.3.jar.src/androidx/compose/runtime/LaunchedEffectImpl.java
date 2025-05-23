/*     */ package androidx.compose.runtime;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.CoroutineScopeKt;
/*     */ import kotlinx.coroutines.Job;
/*     */ import kotlinx.coroutines.JobKt;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\020\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\006\b\000\030\0002\0020\001B6\022\006\020\002\032\0020\003\022'\020\004\032#\b\001\022\004\022\0020\006\022\n\022\b\022\004\022\0020\b0\007\022\006\022\004\030\0010\t0\005¢\006\002\b\n¢\006\002\020\013J\b\020\020\032\0020\bH\026J\b\020\021\032\0020\bH\026J\b\020\022\032\0020\bH\026R\020\020\f\032\004\030\0010\rX\016¢\006\002\n\000R\016\020\016\032\0020\006X\004¢\006\002\n\000R1\020\004\032#\b\001\022\004\022\0020\006\022\n\022\b\022\004\022\0020\b0\007\022\006\022\004\030\0010\t0\005¢\006\002\b\nX\004¢\006\004\n\002\020\017¨\006\023"}, d2 = {"Landroidx/compose/runtime/LaunchedEffectImpl;", "Landroidx/compose/runtime/RememberObserver;", "parentCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "task", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "job", "Lkotlinx/coroutines/Job;", "scope", "Lkotlin/jvm/functions/Function2;", "onAbandoned", "onForgotten", "onRemembered", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class LaunchedEffectImpl
/*     */   implements RememberObserver
/*     */ {
/*     */   @NotNull
/*     */   private final Function2<CoroutineScope, Continuation<? super Unit>, Object> task;
/*     */   @NotNull
/*     */   private final CoroutineScope scope;
/*     */   @Nullable
/*     */   private Job job;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public LaunchedEffectImpl(@NotNull CoroutineContext parentCoroutineContext, @NotNull Function2<CoroutineScope, Continuation<? super Unit>, Object> task) {
/* 282 */     this.task = task;
/*     */     
/* 284 */     this.scope = CoroutineScopeKt.CoroutineScope(parentCoroutineContext);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onRemembered() {
/* 289 */     if (this.job != null) { JobKt.cancel$default(this.job, "Old job was still running!", null, 2, null); } else {  }
/* 290 */      this.job = BuildersKt.launch$default(this.scope, null, null, this.task, 3, null);
/*     */   }
/*     */   
/*     */   public void onForgotten() {
/* 294 */     if (this.job != null) { this.job.cancel(new LeftCompositionCancellationException()); } else {  }
/* 295 */      this.job = null;
/*     */   }
/*     */   
/*     */   public void onAbandoned() {
/* 299 */     if (this.job != null) { this.job.cancel(new LeftCompositionCancellationException()); } else {  }
/* 300 */      this.job = null;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\LaunchedEffectImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */