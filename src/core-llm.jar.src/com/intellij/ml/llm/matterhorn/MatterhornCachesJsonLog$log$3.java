/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "MatterhornCachesJsonLog.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.MatterhornCachesJsonLog$log$3")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class MatterhornCachesJsonLog$log$3
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   MatterhornCachesJsonLog$log$3(Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     StringBuilder stringBuilder;
/*    */     MatterhornCachesJsonLog<T> matterhornCachesJsonLog;
/* 32 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 33 */         stringBuilder = MatterhornCachesJsonLog.access$getContent$p(MatterhornCachesJsonLog.this); matterhornCachesJsonLog = MatterhornCachesJsonLog.this; synchronized (stringBuilder) { int $i$a$-synchronized-MatterhornCachesJsonLog$log$3$1 = 0;
/* 34 */           Intrinsics.checkNotNullExpressionValue(MatterhornCachesJsonLog.access$getContent$p(matterhornCachesJsonLog).toString(), "toString(...)"); matterhornCachesJsonLog.getCaches().save(CacheType.Logs, MatterhornCachesJsonLog.access$getLogFileName$p(matterhornCachesJsonLog), MatterhornCachesJsonLog.access$getContent$p(matterhornCachesJsonLog).toString());
/* 35 */           Unit unit = Unit.INSTANCE; }
/* 36 */          return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super MatterhornCachesJsonLog$log$3> $completion) {
/*    */     return (Continuation<Unit>)new MatterhornCachesJsonLog$log$3($completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((MatterhornCachesJsonLog$log$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\MatterhornCachesJsonLog$log$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */