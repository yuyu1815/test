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
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "Coroutines.kt", l = {29}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.mpp.ExportableDeferred$deferred$1")
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\002\n\002\030\002\020\000\032\002H\001\"\006\b\000\020\001 \001*\0020\002H@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class ExportableDeferred$deferred$1
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super T>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   ExportableDeferred$deferred$1(Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 29 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; return (CoroutinesKtJVM.invokeAndAwait(ExportableDeferred.access$getFunction$p(ExportableDeferred.this), (Continuation)this) == object) ? object : CoroutinesKtJVM.invokeAndAwait(ExportableDeferred.access$getFunction$p(ExportableDeferred.this), (Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super ExportableDeferred$deferred$1> $completion) {
/*    */     return (Continuation<Unit>)new ExportableDeferred$deferred$1($completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((ExportableDeferred$deferred$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\ExportableDeferred$deferred$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */