/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ 
/*    */ @DebugMetadata(f = "MatterhornCachesJsonLog.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.MatterhornCachesJsonLog$ensureLoaded$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ @SourceDebugExtension({"SMAP\nMatterhornCachesJsonLog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornCachesJsonLog.kt\ncom/intellij/ml/llm/matterhorn/MatterhornCachesJsonLog$ensureLoaded$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
/*    */ final class MatterhornCachesJsonLog$ensureLoaded$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     StringBuilder stringBuilder;
/*    */     MatterhornCachesJsonLog<T> matterhornCachesJsonLog;
/* 14 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 15 */         stringBuilder = MatterhornCachesJsonLog.access$getContent$p(MatterhornCachesJsonLog.this); matterhornCachesJsonLog = MatterhornCachesJsonLog.this; synchronized (stringBuilder) { int $i$a$-synchronized-MatterhornCachesJsonLog$ensureLoaded$2$1 = 0;
/* 16 */           if ((MatterhornCachesJsonLog.access$getContent$p(matterhornCachesJsonLog).length() == 0))
/* 17 */             if (matterhornCachesJsonLog.getCaches().load(CacheType.Logs, MatterhornCachesJsonLog.access$getLogFileName$p(matterhornCachesJsonLog)) != null) { String it = matterhornCachesJsonLog.getCaches().load(CacheType.Logs, MatterhornCachesJsonLog.access$getLogFileName$p(matterhornCachesJsonLog));
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
/* 40 */               int $i$a$-let-MatterhornCachesJsonLog$ensureLoaded$2$1$1 = 0;
/*    */               MatterhornCachesJsonLog.access$getContent$p(matterhornCachesJsonLog).append(it); }
/*    */             else
/*    */             { matterhornCachesJsonLog.getCaches().load(CacheType.Logs, MatterhornCachesJsonLog.access$getLogFileName$p(matterhornCachesJsonLog)); }
/*    */              
/*    */           Unit unit = Unit.INSTANCE; }
/*    */         
/*    */         return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   int label;
/*    */   
/*    */   MatterhornCachesJsonLog$ensureLoaded$2(Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super MatterhornCachesJsonLog$ensureLoaded$2> $completion) {
/*    */     return (Continuation<Unit>)new MatterhornCachesJsonLog$ensureLoaded$2($completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((MatterhornCachesJsonLog$ensureLoaded$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\MatterhornCachesJsonLog$ensureLoaded$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */