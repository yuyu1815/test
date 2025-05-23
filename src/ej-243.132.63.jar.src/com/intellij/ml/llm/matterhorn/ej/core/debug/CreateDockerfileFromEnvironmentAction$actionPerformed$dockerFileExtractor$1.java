/*    */ package com.intellij.ml.llm.matterhorn.ej.core.debug;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.ElectricJuniorSupportProvider;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.run.docker.ProjectDockerFileExtractor;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ 
/*    */ @DebugMetadata(f = "CreateDockerfileFromEnvironmentAction.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.debug.CreateDockerfileFromEnvironmentAction$actionPerformed$dockerFileExtractor$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/ProjectDockerFileExtractor;", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class CreateDockerfileFromEnvironmentAction$actionPerformed$dockerFileExtractor$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ProjectDockerFileExtractor>, Object> {
/*    */   public final Object invokeSuspend(Object $result) {
/* 16 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         
/* 18 */         return ElectricJuniorSupportProvider.Companion.getSupport(this.$project).getProjectDockerFileExtractor(); }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   int label;
/*    */   
/*    */   CreateDockerfileFromEnvironmentAction$actionPerformed$dockerFileExtractor$1(Project $project, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super CreateDockerfileFromEnvironmentAction$actionPerformed$dockerFileExtractor$1> $completion) {
/*    */     return (Continuation<Unit>)new CreateDockerfileFromEnvironmentAction$actionPerformed$dockerFileExtractor$1(this.$project, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((CreateDockerfileFromEnvironmentAction$actionPerformed$dockerFileExtractor$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\debug\CreateDockerfileFromEnvironmentAction$actionPerformed$dockerFileExtractor$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */