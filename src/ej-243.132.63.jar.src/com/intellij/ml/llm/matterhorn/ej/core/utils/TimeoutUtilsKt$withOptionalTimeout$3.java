/*    */ package com.intellij.ml.llm.matterhorn.ej.core.utils;
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
/*    */ @DebugMetadata(f = "TimeoutUtils.kt", l = {19}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.utils.TimeoutUtilsKt$withOptionalTimeout$3")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\002\n\002\030\002\020\000\032\002H\001\"\004\b\000\020\001*\0020\002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class TimeoutUtilsKt$withOptionalTimeout$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
/*    */   int label;
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     CoroutineScope $this$withTimeout;
/* 19 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$withTimeout = (CoroutineScope)this.L$0; this.label = 1; return (this.$block.invoke($this$withTimeout, this) == object) ? object : this.$block.invoke($this$withTimeout, this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   TimeoutUtilsKt$withOptionalTimeout$3(Function2<CoroutineScope, Continuation<? super T>, Object> $block, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super TimeoutUtilsKt$withOptionalTimeout$3> $completion) {
/*    */     TimeoutUtilsKt$withOptionalTimeout$3 timeoutUtilsKt$withOptionalTimeout$3 = new TimeoutUtilsKt$withOptionalTimeout$3(this.$block, $completion);
/*    */     timeoutUtilsKt$withOptionalTimeout$3.L$0 = value;
/*    */     return (Continuation<Unit>)timeoutUtilsKt$withOptionalTimeout$3;
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((TimeoutUtilsKt$withOptionalTimeout$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\cor\\utils\TimeoutUtilsKt$withOptionalTimeout$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */