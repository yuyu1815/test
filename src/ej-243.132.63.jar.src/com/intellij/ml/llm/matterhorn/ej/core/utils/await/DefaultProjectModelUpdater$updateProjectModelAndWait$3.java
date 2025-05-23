/*    */ package com.intellij.ml.llm.matterhorn.ej.core.utils.await;
/*    */ 
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.platform.backend.observation.Observation;
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
/*    */ @DebugMetadata(f = "DefaultProjectModelUpdater.kt", l = {29}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.utils.await.DefaultProjectModelUpdater$updateProjectModelAndWait$3")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\013\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class DefaultProjectModelUpdater$updateProjectModelAndWait$3
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Boolean>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   DefaultProjectModelUpdater$updateProjectModelAndWait$3(Project $project, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 28 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 29 */         this.label = 1; if (Observation.INSTANCE.awaitConfiguration(this.$project, DefaultProjectModelUpdater$updateProjectModelAndWait$3::invokeSuspend$lambda$0, (Continuation)this) == object) return object;  return Observation.INSTANCE.awaitConfiguration(this.$project, DefaultProjectModelUpdater$updateProjectModelAndWait$3::invokeSuspend$lambda$0, (Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } private static final Unit invokeSuspend$lambda$0(String it) { DefaultProjectModelUpdater.Companion.getLogger().debug(it); return Unit.INSTANCE; }
/*    */ 
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super DefaultProjectModelUpdater$updateProjectModelAndWait$3> $completion) {
/*    */     return (Continuation<Unit>)new DefaultProjectModelUpdater$updateProjectModelAndWait$3(this.$project, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((DefaultProjectModelUpdater$updateProjectModelAndWait$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\cor\\utils\await\DefaultProjectModelUpdater$updateProjectModelAndWait$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */