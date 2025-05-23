/*    */ package ai.grazie.model.auth.v5;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ 
/*    */ @DebugMetadata(f = "Extensions.kt", l = {16}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.model.auth.v5.ExtensionsKt$withServiceToken$2")
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\002\n\002\030\002\020\000\032\002H\001\"\004\b\000\020\001*\0020\002H@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class ExtensionsKt$withServiceToken$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     CoroutineScope $this$withContext;
/* 15 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$withContext = (CoroutineScope)this.L$0;
/* 16 */         this.label = 1; if (this.$block.invoke($this$withContext, this) == object) return object;  return this.$block.invoke($this$withContext, this);
/*    */       case 1:
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         return SYNTHETIC_LOCAL_VARIABLE_1; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   int label;
/*    */   
/*    */   ExtensionsKt$withServiceToken$2(Function2<CoroutineScope, Continuation<? super T>, Object> $block, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super ExtensionsKt$withServiceToken$2> $completion) {
/*    */     ExtensionsKt$withServiceToken$2 extensionsKt$withServiceToken$2 = new ExtensionsKt$withServiceToken$2(this.$block, $completion);
/*    */     extensionsKt$withServiceToken$2.L$0 = value;
/*    */     return (Continuation<Unit>)extensionsKt$withServiceToken$2;
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((ExtensionsKt$withServiceToken$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-auth-jvm-0.4.32.jar!\ai\grazie\model\auth\v5\ExtensionsKt$withServiceToken$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */