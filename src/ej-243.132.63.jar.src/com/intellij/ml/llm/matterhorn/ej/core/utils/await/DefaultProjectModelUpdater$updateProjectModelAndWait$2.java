/*    */ package com.intellij.ml.llm.matterhorn.ej.core.utils.await;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.actions.MatterhornActivityKey;
/*    */ import com.intellij.openapi.externalSystem.autoimport.ExternalSystemProjectTracker;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.platform.backend.observation.ActivityKey;
/*    */ import com.intellij.platform.backend.observation.TrackingUtil;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ 
/*    */ @DebugMetadata(f = "DefaultProjectModelUpdater.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.utils.await.DefaultProjectModelUpdater$updateProjectModelAndWait$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class DefaultProjectModelUpdater$updateProjectModelAndWait$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */   public final Object invokeSuspend(Object $result) {
/* 20 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 21 */         TrackingUtil.trackActivityBlocking(this.$project, (ActivityKey)MatterhornActivityKey.INSTANCE, this.$project::invokeSuspend$lambda$0);
/*    */ 
/*    */         
/* 24 */         return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   int label;
/*    */   
/*    */   DefaultProjectModelUpdater$updateProjectModelAndWait$2(Project $project, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super DefaultProjectModelUpdater$updateProjectModelAndWait$2> $completion) {
/*    */     return (Continuation<Unit>)new DefaultProjectModelUpdater$updateProjectModelAndWait$2(this.$project, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((DefaultProjectModelUpdater$updateProjectModelAndWait$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */   
/*    */   private static final Unit invokeSuspend$lambda$0(Project $project) {
/*    */     ExternalSystemProjectTracker.Companion.getInstance($project).scheduleProjectRefresh();
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\cor\\utils\await\DefaultProjectModelUpdater$updateProjectModelAndWait$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */