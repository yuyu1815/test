/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import java.util.concurrent.CancellationException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000d\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J\036\020\002\032\0020\0032\006\020\004\032\0020\0052\f\020\006\032\b\022\002\b\003\030\0010\007H\026J\020\020\b\032\0020\0032\006\020\004\032\0020\005H\026J\024\020\t\032\0020\0032\n\020\004\032\006\022\002\b\0030\nH\026J\020\020\013\032\0020\0032\006\020\004\032\0020\fH\026J\020\020\r\032\0020\0032\006\020\004\032\0020\016H\026J\024\020\017\032\0020\0032\n\020\020\032\0060\021j\002`\022H\026J \020\023\032\0020\0032\n\020\020\032\0060\024j\002`\0252\n\020\026\032\006\022\002\b\0030\007H\026J\030\020\027\032\0020\0032\006\020\030\032\0020\0312\006\020\032\032\0020\033H\026J\036\020\034\032\0020\0032\006\020\035\032\0020\0362\f\020\006\032\b\022\002\b\003\030\0010\007H\026J\020\020\037\032\0020\0032\006\020\032\032\0020 H\026J\020\020!\032\0020\0032\006\020\032\032\0020 H\026¨\006\""}, d2 = {"Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListener;", "", "onUnfinishedArtifactCreated", "", "artifact", "Lcom/intellij/ml/llm/matterhorn/Artifactual;", "requester", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "onUnfinishedArtifactUpdated", "onArtifactFinished", "Lcom/intellij/ml/llm/matterhorn/Artifact;", "onArtifactCancelled", "Lcom/intellij/ml/llm/matterhorn/CancelledArtifact;", "onArtifactFailed", "Lcom/intellij/ml/llm/matterhorn/FailedArtifact;", "onCancellation", "e", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "onException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "artifactId", "onTrajectoryElement", "element", "Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "onCustomEvent", "event", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;", "onContextRegistering", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "onContextClosed", "core"})
/*     */ public interface RootExecutionContextListener
/*     */ {
/*     */   void onUnfinishedArtifactCreated(@NotNull Artifactual paramArtifactual, @Nullable ArtifactId<?> paramArtifactId);
/*     */   
/*     */   void onUnfinishedArtifactUpdated(@NotNull Artifactual paramArtifactual);
/*     */   
/*     */   void onArtifactFinished(@NotNull Artifact<?> paramArtifact);
/*     */   
/*     */   void onArtifactCancelled(@NotNull CancelledArtifact paramCancelledArtifact);
/*     */   
/*     */   void onArtifactFailed(@NotNull FailedArtifact paramFailedArtifact);
/*     */   
/*     */   void onCancellation(@NotNull CancellationException paramCancellationException);
/*     */   
/*     */   void onException(@NotNull Exception paramException, @NotNull ArtifactId<?> paramArtifactId);
/*     */   
/*     */   void onTrajectoryElement(@NotNull TrajectoryElement paramTrajectoryElement, @NotNull ExecutionContext paramExecutionContext);
/*     */   
/*     */   void onCustomEvent(@NotNull CustomArtifactEvent paramCustomArtifactEvent, @Nullable ArtifactId<?> paramArtifactId);
/*     */   
/*     */   void onContextRegistering(@NotNull RootExecutionContext paramRootExecutionContext);
/*     */   
/*     */   void onContextClosed(@NotNull RootExecutionContext paramRootExecutionContext);
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   public static final class DefaultImpls
/*     */   {
/*     */     public static void onUnfinishedArtifactCreated(@NotNull RootExecutionContextListener $this, @NotNull Artifactual artifact, @Nullable ArtifactId requester) {
/*  98 */       Intrinsics.checkNotNullParameter(artifact, "artifact");
/*  99 */     } public static void onUnfinishedArtifactUpdated(@NotNull RootExecutionContextListener $this, @NotNull Artifactual artifact) { Intrinsics.checkNotNullParameter(artifact, "artifact"); }
/* 100 */     public static void onArtifactFinished(@NotNull RootExecutionContextListener $this, @NotNull Artifact artifact) { Intrinsics.checkNotNullParameter(artifact, "artifact"); }
/* 101 */     public static void onArtifactCancelled(@NotNull RootExecutionContextListener $this, @NotNull CancelledArtifact artifact) { Intrinsics.checkNotNullParameter(artifact, "artifact"); } public static void onArtifactFailed(@NotNull RootExecutionContextListener $this, @NotNull FailedArtifact artifact) {
/* 102 */       Intrinsics.checkNotNullParameter(artifact, "artifact");
/*     */     }
/* 104 */     public static void onCancellation(@NotNull RootExecutionContextListener $this, @NotNull CancellationException e) { Intrinsics.checkNotNullParameter(e, "e"); } public static void onException(@NotNull RootExecutionContextListener $this, @NotNull Exception e, @NotNull ArtifactId artifactId) {
/* 105 */       Intrinsics.checkNotNullParameter(e, "e"); Intrinsics.checkNotNullParameter(artifactId, "artifactId");
/*     */     } public static void onTrajectoryElement(@NotNull RootExecutionContextListener $this, @NotNull TrajectoryElement element, @NotNull ExecutionContext context) {
/* 107 */       Intrinsics.checkNotNullParameter(element, "element"); Intrinsics.checkNotNullParameter(context, "context");
/*     */     }
/*     */ 
/*     */     
/*     */     public static void onCustomEvent(@NotNull RootExecutionContextListener $this, @NotNull CustomArtifactEvent event, @Nullable ArtifactId requester) {
/* 112 */       Intrinsics.checkNotNullParameter(event, "event");
/*     */     }
/*     */ 
/*     */     
/*     */     public static void onContextRegistering(@NotNull RootExecutionContextListener $this, @NotNull RootExecutionContext context) {
/* 117 */       Intrinsics.checkNotNullParameter(context, "context"); } public static void onContextClosed(@NotNull RootExecutionContextListener $this, @NotNull RootExecutionContext context) {
/* 118 */       Intrinsics.checkNotNullParameter(context, "context");
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\RootExecutionContextListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */