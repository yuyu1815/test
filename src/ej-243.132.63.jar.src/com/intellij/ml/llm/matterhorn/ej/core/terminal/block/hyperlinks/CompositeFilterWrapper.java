/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.hyperlinks;
/*    */ 
/*    */ import com.intellij.execution.filters.CompositeFilter;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import java.util.List;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020!\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\b\000\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\b\020\020\032\0020\013H\002J\024\020\021\032\0020\0132\f\020\022\032\b\022\004\022\0020\0130\nJ\b\020\023\032\0020\013H\002J\b\020\024\032\004\030\0010\017R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\032\020\b\032\016\022\n\022\b\022\004\022\0020\0130\n0\tX\004¢\006\002\n\000R\016\020\f\032\0020\rX\004¢\006\002\n\000R\020\020\016\032\004\030\0010\017X\016¢\006\002\n\000¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/hyperlinks/CompositeFilterWrapper;", "", "project", "Lcom/intellij/openapi/project/Project;", "disposable", "Lcom/intellij/openapi/Disposable;", "<init>", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/Disposable;)V", "filtersUpdatedListeners", "", "Lkotlin/Function0;", "", "filtersComputationInProgress", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cachedFilter", "Lcom/intellij/execution/filters/CompositeFilter;", "scheduleFiltersComputation", "addFiltersUpdatedListener", "listener", "fireFiltersUpdated", "getFilter", "ej-core"})
/*    */ public final class CompositeFilterWrapper {
/*    */   @NotNull
/*    */   private final Project project;
/*    */   @NotNull
/*    */   private final Disposable disposable;
/*    */   
/* 17 */   public CompositeFilterWrapper(@NotNull Project project, @NotNull Disposable disposable) { this.project = project; this.disposable = disposable;
/* 18 */     this.filtersUpdatedListeners = new CopyOnWriteArrayList<>();
/*    */     
/* 20 */     this.filtersComputationInProgress = new AtomicBoolean(false);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 25 */     ConsoleFilterProvider.FILTER_PROVIDERS.addChangeListener(this::_init_$lambda$0, 
/*    */ 
/*    */         
/* 28 */         this.disposable);
/* 29 */     scheduleFiltersComputation(); }
/*    */   @NotNull private final List<Function0<Unit>> filtersUpdatedListeners; @NotNull
/*    */   private final AtomicBoolean filtersComputationInProgress; @Nullable
/*    */   private volatile CompositeFilter cachedFilter; private static final void _init_$lambda$0(CompositeFilterWrapper this$0) { this$0.cachedFilter = null;
/* 33 */     this$0.scheduleFiltersComputation(); } private final void scheduleFiltersComputation() { if (this.filtersComputationInProgress.compareAndSet(false, true))
/*    */     {
/* 35 */       ReadAction.nonBlocking(this::scheduleFiltersComputation$lambda$1)
/* 36 */         .expireWith(this.disposable)
/* 37 */         .finishOnUiThread(ModalityState.defaultModalityState(), this::scheduleFiltersComputation$lambda$3::scheduleFiltersComputation$lambda$4)
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 43 */         .submit(AppExecutorUtil.getAppExecutorService()); }  } private static final List scheduleFiltersComputation$lambda$1(CompositeFilterWrapper this$0) { return ConsoleViewUtil.computeConsoleFilters(this$0.project, null, GlobalSearchScope.allScope(this$0.project)); } private static final void scheduleFiltersComputation$lambda$4(Function1 $tmp0, Object p0) { $tmp0.invoke(p0); } private static final Unit scheduleFiltersComputation$lambda$3(CompositeFilterWrapper this$0, List filters) { Intrinsics.checkNotNullParameter(filters, "filters"); this$0.filtersComputationInProgress.set(false); CompositeFilter compositeFilter1 = new CompositeFilter(this$0.project, filters), compositeFilter2 = compositeFilter1; CompositeFilterWrapper compositeFilterWrapper = this$0; int $i$a$-also-CompositeFilterWrapper$scheduleFiltersComputation$2$1 = 0; compositeFilter2.setForceUseAllFilters(true); compositeFilterWrapper.cachedFilter = compositeFilter1; this$0.fireFiltersUpdated(); return Unit.INSTANCE; }
/*    */ 
/*    */ 
/*    */   
/*    */   public final void addFiltersUpdatedListener(@NotNull Function0<Unit> listener) {
/* 48 */     Intrinsics.checkNotNullParameter(listener, "listener"); this.filtersUpdatedListeners.add(listener);
/*    */   }
/*    */   
/*    */   private final void fireFiltersUpdated() {
/* 52 */     for (Function0<Unit> listener : this.filtersUpdatedListeners) {
/* 53 */       listener.invoke();
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final CompositeFilter getFilter() {
/* 63 */     if (this.cachedFilter != null) { CompositeFilter it = this.cachedFilter; int $i$a$-let-CompositeFilterWrapper$getFilter$1 = 0; return it; }
/*    */ 
/*    */     
/* 66 */     scheduleFiltersComputation();
/* 67 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\hyperlinks\CompositeFilterWrapper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */