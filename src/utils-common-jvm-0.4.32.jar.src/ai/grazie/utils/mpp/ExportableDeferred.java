/*    */ package ai.grazie.utils.mpp;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.Deferred;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\007\030\000*\006\b\000\020\001 \0012\0020\002B\035\b\000\022\006\020\003\032\0020\004\022\f\020\005\032\b\022\004\022\0028\0000\006¢\006\002\020\007R\032\020\b\032\b\022\004\022\0028\0000\tX\004¢\006\b\n\000\032\004\b\n\020\013R\024\020\005\032\b\022\004\022\0028\0000\006X\004¢\006\002\n\000¨\006\f"}, d2 = {"Lai/grazie/utils/mpp/ExportableDeferred;", "T", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "function", "Lai/grazie/utils/mpp/ExportableSuspendingFunction;", "(Lkotlinx/coroutines/CoroutineScope;Lai/grazie/utils/mpp/ExportableSuspendingFunction;)V", "deferred", "Lkotlinx/coroutines/Deferred;", "getDeferred$utils_common", "()Lkotlinx/coroutines/Deferred;", "utils-common"})
/*    */ public final class ExportableDeferred<T>
/*    */ {
/*    */   @NotNull
/*    */   private final ExportableSuspendingFunction<T> function;
/*    */   @NotNull
/*    */   private final Deferred<T> deferred;
/*    */   
/*    */   public ExportableDeferred(@NotNull CoroutineScope scope, @NotNull ExportableSuspendingFunction<T> function) {
/* 27 */     this.function = function;
/*    */     
/* 29 */     this.deferred = BuildersKt.async$default(scope, null, null, new ExportableDeferred$deferred$1(null), 3, null); } @NotNull public final Deferred<T> getDeferred$utils_common() { return this.deferred; } @DebugMetadata(f = "Coroutines.kt", l = {29}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.mpp.ExportableDeferred$deferred$1") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\002\n\002\030\002\020\000\032\002H\001\"\006\b\000\020\001 \001*\0020\002H@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}) static final class ExportableDeferred$deferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> { public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; return (CoroutinesKtJVM.invokeAndAwait(ExportableDeferred.this.function, (Continuation)this) == object) ? object : CoroutinesKtJVM.invokeAndAwait(ExportableDeferred.this.function, (Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */     
/*    */     int label;
/*    */     
/*    */     ExportableDeferred$deferred$1(Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super ExportableDeferred$deferred$1> $completion) {
/*    */       return (Continuation<Unit>)new ExportableDeferred$deferred$1($completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((ExportableDeferred$deferred$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\ExportableDeferred.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */