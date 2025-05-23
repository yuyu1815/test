/*    */ package com.intellij.ml.llm.matterhorn.starter;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.Artifact;
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactId;
/*    */ import com.intellij.ml.llm.matterhorn.Artifactual;
/*    */ import com.intellij.ml.llm.matterhorn.CancelledArtifact;
/*    */ import com.intellij.ml.llm.matterhorn.CustomArtifactEvent;
/*    */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*    */ import com.intellij.ml.llm.matterhorn.FailedArtifact;
/*    */ import com.intellij.ml.llm.matterhorn.RootExecutionContext;
/*    */ import com.intellij.ml.llm.matterhorn.RootExecutionContextListener;
/*    */ import com.intellij.ml.llm.matterhorn.TrajectoryElement;
/*    */ import java.util.concurrent.CancellationException;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\032\n\020\000\032\0020\001*\0020\002¨\006\003"}, d2 = {"asRootExecutionContextListener", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListener;", "Lcom/intellij/ml/llm/matterhorn/starter/MatterhornStatusLogger;", "matterhorn"})
/*    */ public final class MatterhornStatusLoggerKt
/*    */ {
/*    */   @NotNull
/*    */   public static final RootExecutionContextListener asRootExecutionContextListener(@NotNull MatterhornStatusLogger $this$asRootExecutionContextListener) {
/* 57 */     Intrinsics.checkNotNullParameter($this$asRootExecutionContextListener, "<this>"); return new MatterhornStatusLoggerKt$asRootExecutionContextListener$1(); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000I\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\036\020\002\032\0020\0032\006\020\004\032\0020\0052\f\020\006\032\b\022\002\b\003\030\0010\007H\026J\020\020\b\032\0020\0032\006\020\004\032\0020\005H\026J\024\020\t\032\0020\0032\n\020\004\032\006\022\002\b\0030\nH\026J\020\020\013\032\0020\0032\006\020\004\032\0020\fH\026J\020\020\r\032\0020\0032\006\020\004\032\0020\016H\026J\024\020\017\032\0020\0032\n\020\020\032\0060\021j\002`\022H\026J \020\023\032\0020\0032\n\020\020\032\0060\024j\002`\0252\n\020\026\032\006\022\002\b\0030\007H\026¨\006\027"}, d2 = {"com/intellij/ml/llm/matterhorn/starter/MatterhornStatusLoggerKt$asRootExecutionContextListener$1", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListener;", "onUnfinishedArtifactCreated", "", "artifact", "Lcom/intellij/ml/llm/matterhorn/Artifactual;", "requester", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "onUnfinishedArtifactUpdated", "onArtifactFinished", "Lcom/intellij/ml/llm/matterhorn/Artifact;", "onArtifactCancelled", "Lcom/intellij/ml/llm/matterhorn/CancelledArtifact;", "onArtifactFailed", "Lcom/intellij/ml/llm/matterhorn/FailedArtifact;", "onCancellation", "e", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "onException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "artifactId", "matterhorn"}) public static final class MatterhornStatusLoggerKt$asRootExecutionContextListener$1 implements RootExecutionContextListener { public void onTrajectoryElement(TrajectoryElement element, ExecutionContext context) { RootExecutionContextListener.DefaultImpls.onTrajectoryElement(this, element, context); } public void onCustomEvent(CustomArtifactEvent event, ArtifactId requester) { RootExecutionContextListener.DefaultImpls.onCustomEvent(this, event, requester); } public void onContextRegistering(RootExecutionContext context) { RootExecutionContextListener.DefaultImpls.onContextRegistering(this, context); } public void onContextClosed(RootExecutionContext context) { RootExecutionContextListener.DefaultImpls.onContextClosed(this, context); }
/*    */      public void onUnfinishedArtifactCreated(Artifactual artifact, ArtifactId<?> requester) {
/* 59 */       Intrinsics.checkNotNullParameter(artifact, "artifact"); MatterhornStatusLogger.INSTANCE.artifactCreated(artifact, requester);
/*    */     }
/*    */     
/*    */     public void onUnfinishedArtifactUpdated(Artifactual artifact) {
/* 63 */       Intrinsics.checkNotNullParameter(artifact, "artifact"); MatterhornStatusLogger.INSTANCE.artifactUpdated(artifact);
/*    */     }
/*    */     
/*    */     public void onArtifactFinished(Artifact<?> artifact) {
/* 67 */       Intrinsics.checkNotNullParameter(artifact, "artifact"); MatterhornStatusLogger.INSTANCE.artifactFinished(artifact);
/*    */     }
/*    */     
/*    */     public void onArtifactCancelled(CancelledArtifact artifact) {
/* 71 */       Intrinsics.checkNotNullParameter(artifact, "artifact"); MatterhornStatusLogger.INSTANCE.artifactCancelled(artifact);
/*    */     }
/*    */     
/*    */     public void onArtifactFailed(FailedArtifact artifact) {
/* 75 */       Intrinsics.checkNotNullParameter(artifact, "artifact"); MatterhornStatusLogger.INSTANCE.artifactFailed(artifact);
/*    */     }
/*    */     
/*    */     public void onCancellation(CancellationException e) {
/* 79 */       Intrinsics.checkNotNullParameter(e, "e"); MatterhornStatusLogger.INSTANCE.onCancellation(e);
/*    */     }
/*    */     
/*    */     public void onException(Exception e, ArtifactId<?> artifactId) {
/* 83 */       Intrinsics.checkNotNullParameter(e, "e"); Intrinsics.checkNotNullParameter(artifactId, "artifactId"); MatterhornStatusLogger.INSTANCE.onException(e, artifactId);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\starter\MatterhornStatusLoggerKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */