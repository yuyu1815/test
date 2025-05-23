/*    */ package androidx.lifecycle.viewmodel.internal;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.JobKt;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\020\002\n\000\b\000\030\0002\0020\0012\0020\002B\017\b\026\022\006\020\003\032\0020\002¢\006\002\020\004B\r\022\006\020\005\032\0020\006¢\006\002\020\007J\b\020\n\032\0020\013H\026R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\b\020\t¨\006\f"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "Ljava/lang/AutoCloseable;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "close", "", "lifecycle-viewmodel"})
/*    */ public final class CloseableCoroutineScope
/*    */   implements AutoCloseable, CoroutineScope
/*    */ {
/*    */   @NotNull
/*    */   private final CoroutineContext coroutineContext;
/*    */   
/*    */   public CloseableCoroutineScope(@NotNull CoroutineContext coroutineContext) {
/* 76 */     this.coroutineContext = coroutineContext; } @NotNull public CoroutineContext getCoroutineContext() { return this.coroutineContext; }
/*    */   
/*    */   public CloseableCoroutineScope(@NotNull CoroutineScope coroutineScope) {
/* 79 */     this(coroutineScope.getCoroutineContext());
/*    */   } public void close() {
/* 81 */     JobKt.cancel$default(getCoroutineContext(), null, 1, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-viewmodel-desktop-2.8.5.jar!\androidx\lifecycle\viewmodel\internal\CloseableCoroutineScope.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */