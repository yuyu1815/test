/*    */ package com.intellij.ml.llm.matterhorn.utils;
/*    */ 
/*    */ import com.intellij.openapi.progress.CoroutinesKt;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ 
/*    */ @DebugMetadata(f = "Coroutines.kt", l = {24}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.utils.CoroutinesKt$edtWriteAction$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\003\n\002\030\002\020\000\032\f\b\002 \002*\004\030\001H\001H\001\"\004\b\000\020\001*\0020\003H\n"}, d2 = {"<anonymous>", "T", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class CoroutinesKt$edtWriteAction$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
/*    */   int label;
/*    */   
/*    */   CoroutinesKt$edtWriteAction$2(Function0<T> $action, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super CoroutinesKt$edtWriteAction$2> $completion) {
/*    */     return (Continuation<Unit>)new CoroutinesKt$edtWriteAction$2(this.$action, $completion);
/*    */   }
/*    */   
/* 23 */   public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 24 */         this.label = 1; if (CoroutinesKt.blockingContext(this.$action::invokeSuspend$lambda$1, (Continuation)this) == object) return object;  return CoroutinesKt.blockingContext(this.$action::invokeSuspend$lambda$1, (Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/* 25 */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((CoroutinesKt$edtWriteAction$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } private static final Object invokeSuspend$lambda$1$lambda$0(Function0 $tmp0) { return $tmp0.invoke(); } private static final Object invokeSuspend$lambda$1(Function0 $action) { return ApplicationManager.getApplication().runWriteAction($action::invokeSuspend$lambda$1$lambda$0); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhor\\utils\CoroutinesKt$edtWriteAction$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */