/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.Artifact;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactId;
/*     */ import com.intellij.ml.llm.matterhorn.Artifactual;
/*     */ import com.intellij.ml.llm.matterhorn.CancelledArtifact;
/*     */ import com.intellij.ml.llm.matterhorn.CustomArtifactEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.FailedArtifact;
/*     */ import com.intellij.ml.llm.matterhorn.MatterhornServiceScope;
/*     */ import com.intellij.ml.llm.matterhorn.RootExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.RootExecutionContextListener;
/*     */ import com.intellij.ml.llm.matterhorn.TrajectoryElement;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import java.util.concurrent.CancellationException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000U\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\036\020\002\032\0020\0032\006\020\004\032\0020\0052\f\020\006\032\b\022\002\b\003\030\0010\007H\026J\020\020\b\032\0020\0032\006\020\004\032\0020\005H\026J\024\020\t\032\0020\0032\n\020\004\032\006\022\002\b\0030\nH\026J\020\020\013\032\0020\0032\006\020\004\032\0020\fH\026J\020\020\r\032\0020\0032\006\020\004\032\0020\016H\026J\024\020\017\032\0020\0032\n\020\020\032\0060\021j\002`\022H\026J \020\023\032\0020\0032\n\020\020\032\0060\024j\002`\0252\n\020\026\032\006\022\002\b\0030\007H\026J\030\020\027\032\0020\0032\006\020\030\032\0020\0312\006\020\032\032\0020\033H\026¨\006\034"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$1", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListener;", "onUnfinishedArtifactCreated", "", "artifact", "Lcom/intellij/ml/llm/matterhorn/Artifactual;", "requester", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "onUnfinishedArtifactUpdated", "onArtifactFinished", "Lcom/intellij/ml/llm/matterhorn/Artifact;", "onArtifactCancelled", "Lcom/intellij/ml/llm/matterhorn/CancelledArtifact;", "onArtifactFailed", "Lcom/intellij/ml/llm/matterhorn/FailedArtifact;", "onCancellation", "e", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "onException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "artifactId", "onTrajectoryElement", "element", "Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nAbstractMultiAgentWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMultiAgentWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$1\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,214:1\n14#2:215\n14#2:216\n*S KotlinDebug\n*F\n+ 1 AbstractMultiAgentWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$1\n*L\n129#1:215\n133#1:216\n*E\n"})
/*     */ public final class null
/*     */   implements RootExecutionContextListener
/*     */ {
/*     */   null(String $name, ExecutionContext $originalContext) {}
/*     */   
/*     */   public void onCustomEvent(CustomArtifactEvent event, ArtifactId requester) {
/* 107 */     RootExecutionContextListener.DefaultImpls.onCustomEvent(this, event, requester); } public void onContextRegistering(RootExecutionContext context) { RootExecutionContextListener.DefaultImpls.onContextRegistering(this, context); } public void onContextClosed(RootExecutionContext context) { RootExecutionContextListener.DefaultImpls.onContextClosed(this, context); }
/*     */    public void onUnfinishedArtifactCreated(Artifactual artifact, ArtifactId requester) {
/* 109 */     Intrinsics.checkNotNullParameter(artifact, "artifact"); System.out.println("[" + this.$name + "] Artifact created: " + artifact.getId());
/*     */   }
/*     */   
/*     */   public void onUnfinishedArtifactUpdated(Artifactual artifact) {
/* 113 */     Intrinsics.checkNotNullParameter(artifact, "artifact"); System.out.println("[" + this.$name + "] Artifact updated: " + artifact.getId());
/*     */   }
/*     */   
/*     */   public void onArtifactFinished(Artifact artifact) {
/* 117 */     Intrinsics.checkNotNullParameter(artifact, "artifact"); System.out.println("[" + this.$name + "] Artifact finished: " + artifact.getId());
/*     */   }
/*     */   
/*     */   public void onArtifactCancelled(CancelledArtifact artifact) {
/* 121 */     Intrinsics.checkNotNullParameter(artifact, "artifact"); System.out.println("[" + this.$name + "] Artifact cancelled: " + artifact.getId());
/*     */   }
/*     */   
/*     */   public void onArtifactFailed(FailedArtifact artifact) {
/* 125 */     Intrinsics.checkNotNullParameter(artifact, "artifact"); System.out.println("[" + this.$name + "] Artifact failed: " + artifact.getId());
/*     */   }
/*     */   
/*     */   public void onCancellation(CancellationException e) {
/* 129 */     Intrinsics.checkNotNullParameter(e, "e"); int $i$f$logger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 215 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(MatterhornForkedLocalExecutor.class), "getInstance(...)"); Logger.getInstance(MatterhornForkedLocalExecutor.class).info("[" + this.$name + "] Cancelled"); } public void onException(Exception e, ArtifactId artifactId) { Intrinsics.checkNotNullParameter(e, "e"); Intrinsics.checkNotNullParameter(artifactId, "artifactId"); int $i$f$logger = 0;
/* 216 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(MatterhornForkedLocalExecutor.class), "getInstance(...)"); Logger.getInstance(MatterhornForkedLocalExecutor.class).info("[" + this.$name + "] Artifact exception: " + artifactId, e); }
/*     */ 
/*     */   
/*     */   public void onTrajectoryElement(TrajectoryElement element, ExecutionContext context) {
/*     */     Intrinsics.checkNotNullParameter(element, "element");
/*     */     Intrinsics.checkNotNullParameter(context, "context");
/*     */     BuildersKt.launch$default(MatterhornServiceScope.Companion.getScope(this.$originalContext.getProject()), null, null, new MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$1$onTrajectoryElement$1(this.$originalContext, element, this.$name, null), 3, null);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractMultiAgentWorker.kt", l = {138}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$1$onTrajectoryElement$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$1$onTrajectoryElement$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$1$onTrajectoryElement$1(ExecutionContext $originalContext, TrajectoryElement $element, String $name, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (this.$originalContext.logTrajectoryElement(this.$element.withId(this.$name), (Continuation)this) == object)
/*     */             return object; 
/*     */           this.$originalContext.logTrajectoryElement(this.$element.withId(this.$name), (Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$1$onTrajectoryElement$1> $completion) {
/*     */       return (Continuation<Unit>)new MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$1$onTrajectoryElement$1(this.$originalContext, this.$element, this.$name, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$1$onTrajectoryElement$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */