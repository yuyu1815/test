/*    */ package com.intellij.ml.llm.matterhorn.ej.core.debug;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.run.docker.DockerFileExtraction;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.run.docker.ProjectDockerFileExtractor;
/*    */ import com.intellij.notification.Notification;
/*    */ import com.intellij.notification.NotificationType;
/*    */ import com.intellij.notification.Notifications;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ 
/*    */ @DebugMetadata(f = "CreateDockerfileFromEnvironmentAction.kt", l = {21}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.debug.CreateDockerfileFromEnvironmentAction$actionPerformed$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class CreateDockerfileFromEnvironmentAction$actionPerformed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */   public final Object invokeSuspend(Object $result) {
/* 20 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 21 */         this.label = 1; if (DockerFileExtraction.INSTANCE.createDockerFileAndNotify$ej_core(this.$project, this.$dockerFileExtractor, CreateDockerfileFromEnvironmentAction$actionPerformed$1::invokeSuspend$lambda$0, (Continuation)this) == object) return object;  DockerFileExtraction.INSTANCE.createDockerFileAndNotify$ej_core(this.$project, this.$dockerFileExtractor, CreateDockerfileFromEnvironmentAction$actionPerformed$1::invokeSuspend$lambda$0, (Continuation)this);
/*    */ 
/*    */         
/* 24 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   int label;
/*    */   
/*    */   CreateDockerfileFromEnvironmentAction$actionPerformed$1(Project $project, ProjectDockerFileExtractor $dockerFileExtractor, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super CreateDockerfileFromEnvironmentAction$actionPerformed$1> $completion) {
/*    */     return (Continuation<Unit>)new CreateDockerfileFromEnvironmentAction$actionPerformed$1(this.$project, this.$dockerFileExtractor, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((CreateDockerfileFromEnvironmentAction$actionPerformed$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */   
/*    */   private static final Unit invokeSuspend$lambda$0(String it, NotificationType type) {
/*    */     Notifications.Bus.notify(new Notification("matterhorn", it, type));
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\debug\CreateDockerfileFromEnvironmentAction$actionPerformed$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */