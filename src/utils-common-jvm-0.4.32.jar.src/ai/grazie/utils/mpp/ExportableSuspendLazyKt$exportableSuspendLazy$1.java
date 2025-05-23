/*    */ package ai.grazie.utils.mpp;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "ExportableSuspendLazy.kt", l = {27}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.mpp.ExportableSuspendLazyKt$exportableSuspendLazy$1")
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\004\n\002\b\002\020\000\032\002H\001\"\004\b\000\020\001H@"}, d2 = {"<anonymous>", "T"})
/*    */ final class ExportableSuspendLazyKt$exportableSuspendLazy$1
/*    */   extends SuspendLambda
/*    */   implements Function1<Continuation<? super T>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   ExportableSuspendLazyKt$exportableSuspendLazy$1(Function1<Continuation<? super T>, Object> $block, Continuation $completion) {
/*    */     super(1, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 27 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; return (this.$block.invoke(this) == object) ? object : this.$block.invoke(this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Continuation<? super ExportableSuspendLazyKt$exportableSuspendLazy$1> $completion) {
/*    */     return (Continuation<Unit>)new ExportableSuspendLazyKt$exportableSuspendLazy$1(this.$block, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(Continuation<?> p1) {
/*    */     return ((ExportableSuspendLazyKt$exportableSuspendLazy$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\ExportableSuspendLazyKt$exportableSuspendLazy$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */