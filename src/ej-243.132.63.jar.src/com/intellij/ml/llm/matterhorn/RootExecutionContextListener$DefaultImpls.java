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
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ public final class DefaultImpls
/*     */ {
/*     */   public static void onUnfinishedArtifactCreated(@NotNull RootExecutionContextListener $this, @NotNull Artifactual artifact, @Nullable ArtifactId requester) {
/*  98 */     Intrinsics.checkNotNullParameter(artifact, "artifact");
/*  99 */   } public static void onUnfinishedArtifactUpdated(@NotNull RootExecutionContextListener $this, @NotNull Artifactual artifact) { Intrinsics.checkNotNullParameter(artifact, "artifact"); }
/* 100 */   public static void onArtifactFinished(@NotNull RootExecutionContextListener $this, @NotNull Artifact artifact) { Intrinsics.checkNotNullParameter(artifact, "artifact"); }
/* 101 */   public static void onArtifactCancelled(@NotNull RootExecutionContextListener $this, @NotNull CancelledArtifact artifact) { Intrinsics.checkNotNullParameter(artifact, "artifact"); } public static void onArtifactFailed(@NotNull RootExecutionContextListener $this, @NotNull FailedArtifact artifact) {
/* 102 */     Intrinsics.checkNotNullParameter(artifact, "artifact");
/*     */   }
/* 104 */   public static void onCancellation(@NotNull RootExecutionContextListener $this, @NotNull CancellationException e) { Intrinsics.checkNotNullParameter(e, "e"); } public static void onException(@NotNull RootExecutionContextListener $this, @NotNull Exception e, @NotNull ArtifactId artifactId) {
/* 105 */     Intrinsics.checkNotNullParameter(e, "e"); Intrinsics.checkNotNullParameter(artifactId, "artifactId");
/*     */   } public static void onTrajectoryElement(@NotNull RootExecutionContextListener $this, @NotNull TrajectoryElement element, @NotNull ExecutionContext context) {
/* 107 */     Intrinsics.checkNotNullParameter(element, "element"); Intrinsics.checkNotNullParameter(context, "context");
/*     */   }
/*     */ 
/*     */   
/*     */   public static void onCustomEvent(@NotNull RootExecutionContextListener $this, @NotNull CustomArtifactEvent event, @Nullable ArtifactId requester) {
/* 112 */     Intrinsics.checkNotNullParameter(event, "event");
/*     */   }
/*     */ 
/*     */   
/*     */   public static void onContextRegistering(@NotNull RootExecutionContextListener $this, @NotNull RootExecutionContext context) {
/* 117 */     Intrinsics.checkNotNullParameter(context, "context"); } public static void onContextClosed(@NotNull RootExecutionContextListener $this, @NotNull RootExecutionContext context) {
/* 118 */     Intrinsics.checkNotNullParameter(context, "context");
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\RootExecutionContextListener$DefaultImpls.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */