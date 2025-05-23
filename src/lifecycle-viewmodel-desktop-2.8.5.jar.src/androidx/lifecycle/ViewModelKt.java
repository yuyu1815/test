/*     */ package androidx.lifecycle;
/*     */ 
/*     */ import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
/*     */ import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScopeKt;
/*     */ import androidx.lifecycle.viewmodel.internal.SynchronizedObject;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\"\016\020\000\032\0020\001X\004¢\006\002\n\000\"\025\020\002\032\0020\003*\0020\0048F¢\006\006\032\004\b\005\020\006¨\006\007"}, d2 = {"VIEW_MODEL_SCOPE_LOCK", "Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/lifecycle/ViewModel;", "getViewModelScope", "(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;", "lifecycle-viewmodel"})
/*     */ @SourceDebugExtension({"SMAP\nViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModel.kt\nandroidx/lifecycle/ViewModelKt\n+ 2 SynchronizedObject.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObjectKt\n+ 3 SynchronizedObject.jvm.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObject_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,228:1\n36#2,2:229\n23#3:231\n1#4:232\n*S KotlinDebug\n*F\n+ 1 ViewModel.kt\nandroidx/lifecycle/ViewModelKt\n*L\n222#1:229,2\n222#1:231\n*E\n"})
/*     */ public final class ViewModelKt
/*     */ {
/*     */   @NotNull
/*     */   public static final CoroutineScope getViewModelScope(@NotNull ViewModel $this$viewModelScope) {
/* 222 */     Intrinsics.checkNotNullParameter($this$viewModelScope, "<this>"); SynchronizedObject lock$iv = VIEW_MODEL_SCOPE_LOCK; int $i$f$synchronized = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 230 */     int $i$f$synchronizedImpl = 0;
/* 231 */     synchronized (lock$iv) { int $i$a$-synchronized-ViewModelKt$viewModelScope$1 = 0; if ((CloseableCoroutineScope)$this$viewModelScope.<AutoCloseable>getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY") == null) {
/* 232 */         (CloseableCoroutineScope)$this$viewModelScope.<AutoCloseable>getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY"); CloseableCoroutineScope closeableCoroutineScope1 = CloseableCoroutineScopeKt.createViewModelScope(), scope = closeableCoroutineScope1; int $i$a$-also-ViewModelKt$viewModelScope$1$1 = 0;
/*     */         $this$viewModelScope.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", (AutoCloseable)scope);
/*     */       } 
/*     */       CloseableCoroutineScope closeableCoroutineScope = closeableCoroutineScope1; }
/*     */     
/*     */     return (CoroutineScope)closeableCoroutineScope;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final SynchronizedObject VIEW_MODEL_SCOPE_LOCK = new SynchronizedObject();
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-viewmodel-desktop-2.8.5.jar!\androidx\lifecycle\ViewModelKt.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */