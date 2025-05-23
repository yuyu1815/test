/*    */ package androidx.lifecycle.viewmodel.internal;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.NotImplementedError;
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import kotlin.coroutines.EmptyCoroutineContext;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.Dispatchers;
/*    */ import kotlinx.coroutines.SupervisorKt;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032\b\020\002\032\0020\003H\000\032\f\020\004\032\0020\003*\0020\005H\000\"\016\020\000\032\0020\001XT¢\006\002\n\000¨\006\006"}, d2 = {"VIEW_MODEL_SCOPE_KEY", "", "createViewModelScope", "Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "asCloseable", "Lkotlinx/coroutines/CoroutineScope;", "lifecycle-viewmodel"})
/*    */ public final class CloseableCoroutineScopeKt
/*    */ {
/*    */   @NotNull
/*    */   public static final String VIEW_MODEL_SCOPE_KEY = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY";
/*    */   
/*    */   @NotNull
/*    */   public static final CloseableCoroutineScope createViewModelScope() {
/*    */     CoroutineContext coroutineContext1;
/*    */     try {
/* 57 */       coroutineContext1 = (CoroutineContext)Dispatchers.getMain().getImmediate();
/* 58 */     } catch (NotImplementedError _) {
/*    */       
/* 60 */       coroutineContext1 = (CoroutineContext)EmptyCoroutineContext.INSTANCE;
/* 61 */     } catch (IllegalStateException _) {
/*    */       
/* 63 */       coroutineContext1 = (CoroutineContext)EmptyCoroutineContext.INSTANCE;
/*    */     }  CoroutineContext dispatcher = coroutineContext1;
/* 65 */     return new CloseableCoroutineScope(dispatcher.plus((CoroutineContext)SupervisorKt.SupervisorJob$default(null, 1, null)));
/*    */   }
/*    */   @NotNull
/*    */   public static final CloseableCoroutineScope asCloseable(@NotNull CoroutineScope $this$asCloseable) {
/* 69 */     Intrinsics.checkNotNullParameter($this$asCloseable, "<this>"); return new CloseableCoroutineScope($this$asCloseable);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-viewmodel-desktop-2.8.5.jar!\androidx\lifecycle\viewmodel\internal\CloseableCoroutineScopeKt.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */