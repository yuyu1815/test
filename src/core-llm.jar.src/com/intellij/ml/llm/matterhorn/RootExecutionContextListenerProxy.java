/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.CancellationException;
/*     */ import java.util.concurrent.CopyOnWriteArrayList;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000|\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\020 \n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\000 ,2\0020\001:\001,B\007¢\006\004\b\002\020\003J,\020\b\032\0020\t\"\004\b\000\020\n*\b\022\004\022\002H\n0\0132\022\020\f\032\016\022\004\022\002H\n\022\004\022\0020\t0\rH\002J\036\020\016\032\0020\t2\006\020\017\032\0020\0202\f\020\021\032\b\022\002\b\003\030\0010\022H\026J\020\020\023\032\0020\t2\006\020\017\032\0020\020H\026J\024\020\024\032\0020\t2\n\020\017\032\006\022\002\b\0030\025H\026J\020\020\026\032\0020\t2\006\020\017\032\0020\027H\026J\020\020\030\032\0020\t2\006\020\017\032\0020\031H\026J\024\020\032\032\0020\t2\n\020\033\032\0060\034j\002`\035H\026J \020\036\032\0020\t2\n\020\033\032\0060\037j\002` 2\n\020!\032\006\022\002\b\0030\022H\026J\030\020\"\032\0020\t2\006\020#\032\0020$2\006\020%\032\0020&H\026J\036\020'\032\0020\t2\006\020(\032\0020)2\f\020\021\032\b\022\002\b\003\030\0010\022H\026J\020\020*\032\0020\t2\006\020%\032\0020+H\026R\027\020\004\032\b\022\004\022\0020\0010\005¢\006\b\n\000\032\004\b\006\020\007¨\006-"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListenerProxy;", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListener;", "<init>", "()V", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getListeners", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "forEachSafe", "", "T", "", "op", "Lkotlin/Function1;", "onUnfinishedArtifactCreated", "artifact", "Lcom/intellij/ml/llm/matterhorn/Artifactual;", "requester", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "onUnfinishedArtifactUpdated", "onArtifactFinished", "Lcom/intellij/ml/llm/matterhorn/Artifact;", "onArtifactCancelled", "Lcom/intellij/ml/llm/matterhorn/CancelledArtifact;", "onArtifactFailed", "Lcom/intellij/ml/llm/matterhorn/FailedArtifact;", "onCancellation", "e", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "onException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "artifactId", "onTrajectoryElement", "element", "Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "onCustomEvent", "event", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;", "onContextClosed", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "Companion", "core"})
/*     */ @SourceDebugExtension({"SMAP\nRootExecutionContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootExecutionContext.kt\ncom/intellij/ml/llm/matterhorn/RootExecutionContextListenerProxy\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,420:1\n14#2:421\n*S KotlinDebug\n*F\n+ 1 RootExecutionContext.kt\ncom/intellij/ml/llm/matterhorn/RootExecutionContextListenerProxy\n*L\n38#1:421\n*E\n"})
/*     */ public final class RootExecutionContextListenerProxy
/*     */   implements RootExecutionContextListener
/*     */ {
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListenerProxy$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "core"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */   }
/*     */   
/*     */   public void onContextRegistering(@NotNull RootExecutionContext context) {
/*  36 */     RootExecutionContextListener.DefaultImpls.onContextRegistering(this, context);
/*     */   } @NotNull
/*  38 */   public static final Companion Companion = new Companion(null); static { int $i$f$logger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 421 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(RootExecutionContextListenerProxy.class), "getInstance(...)"); } @NotNull private static final Logger logger = Logger.getInstance(RootExecutionContextListenerProxy.class);
/*     */   @NotNull
/*     */   private final CopyOnWriteArrayList<RootExecutionContextListener> listeners = new CopyOnWriteArrayList<>();
/*     */   
/*     */   @NotNull
/*     */   public final CopyOnWriteArrayList<RootExecutionContextListener> getListeners() {
/*     */     return this.listeners;
/*     */   }
/*     */   
/*     */   private final <T> void forEachSafe(List $this$forEachSafe, Function1 op) {
/*     */     for (Object element : $this$forEachSafe) {
/*     */       try {
/*     */         op.invoke(element);
/*     */       } catch (Exception e) {
/*     */         logger.error(e);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void onUnfinishedArtifactCreated(@NotNull Artifactual artifact, @Nullable ArtifactId requester) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'artifact'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: aload_0
/*     */     //   8: getfield listeners : Ljava/util/concurrent/CopyOnWriteArrayList;
/*     */     //   11: checkcast java/util/List
/*     */     //   14: aload_1
/*     */     //   15: aload_2
/*     */     //   16: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/Artifactual;Lcom/intellij/ml/llm/matterhorn/ArtifactId;)Lkotlin/jvm/functions/Function1;
/*     */     //   21: invokespecial forEachSafe : (Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
/*     */     //   24: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #54	-> 6
/*     */     //   #55	-> 24
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	25	0	this	Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListenerProxy;
/*     */     //   0	25	1	artifact	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   0	25	2	requester	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */   }
/*     */   
/*     */   private static final Unit onUnfinishedArtifactCreated$lambda$0(Artifactual $artifact, ArtifactId<?> $requester, RootExecutionContextListener it) {
/*     */     it.onUnfinishedArtifactCreated($artifact, $requester);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   public void onUnfinishedArtifactUpdated(@NotNull Artifactual artifact) {
/*     */     Intrinsics.checkNotNullParameter(artifact, "artifact");
/*     */     forEachSafe(this.listeners, artifact::onUnfinishedArtifactUpdated$lambda$1);
/*     */   }
/*     */   
/*     */   private static final Unit onUnfinishedArtifactUpdated$lambda$1(Artifactual $artifact, RootExecutionContextListener it) {
/*     */     it.onUnfinishedArtifactUpdated($artifact);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   public void onArtifactFinished(@NotNull Artifact artifact) {
/*     */     Intrinsics.checkNotNullParameter(artifact, "artifact");
/*     */     forEachSafe(this.listeners, artifact::onArtifactFinished$lambda$2);
/*     */   }
/*     */   
/*     */   private static final Unit onArtifactFinished$lambda$2(Artifact<?> $artifact, RootExecutionContextListener it) {
/*     */     it.onArtifactFinished($artifact);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   public void onArtifactCancelled(@NotNull CancelledArtifact artifact) {
/*     */     Intrinsics.checkNotNullParameter(artifact, "artifact");
/*     */     forEachSafe(this.listeners, artifact::onArtifactCancelled$lambda$3);
/*     */   }
/*     */   
/*     */   private static final Unit onArtifactCancelled$lambda$3(CancelledArtifact $artifact, RootExecutionContextListener it) {
/*     */     it.onArtifactCancelled($artifact);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   public void onArtifactFailed(@NotNull FailedArtifact artifact) {
/*     */     Intrinsics.checkNotNullParameter(artifact, "artifact");
/*     */     forEachSafe(this.listeners, artifact::onArtifactFailed$lambda$4);
/*     */   }
/*     */   
/*     */   private static final Unit onArtifactFailed$lambda$4(FailedArtifact $artifact, RootExecutionContextListener it) {
/*     */     it.onArtifactFailed($artifact);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   public void onCancellation(@NotNull CancellationException e) {
/*     */     Intrinsics.checkNotNullParameter(e, "e");
/*     */     forEachSafe(this.listeners, e::onCancellation$lambda$5);
/*     */   }
/*     */   
/*     */   private static final Unit onCancellation$lambda$5(CancellationException $e, RootExecutionContextListener it) {
/*     */     it.onCancellation($e);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   public void onException(@NotNull Exception e, @NotNull ArtifactId artifactId) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'e'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'artifactId'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_0
/*     */     //   13: aload_0
/*     */     //   14: getfield listeners : Ljava/util/concurrent/CopyOnWriteArrayList;
/*     */     //   17: checkcast java/util/List
/*     */     //   20: aload_1
/*     */     //   21: aload_2
/*     */     //   22: <illegal opcode> invoke : (Ljava/lang/Exception;Lcom/intellij/ml/llm/matterhorn/ArtifactId;)Lkotlin/jvm/functions/Function1;
/*     */     //   27: invokespecial forEachSafe : (Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
/*     */     //   30: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #78	-> 12
/*     */     //   #79	-> 30
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	31	0	this	Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListenerProxy;
/*     */     //   0	31	1	e	Ljava/lang/Exception;
/*     */     //   0	31	2	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */   }
/*     */   
/*     */   private static final Unit onException$lambda$6(Exception $e, ArtifactId<?> $artifactId, RootExecutionContextListener it) {
/*     */     it.onException($e, $artifactId);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   public void onTrajectoryElement(@NotNull TrajectoryElement element, @NotNull ExecutionContext context) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'element'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'context'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_0
/*     */     //   13: aload_0
/*     */     //   14: getfield listeners : Ljava/util/concurrent/CopyOnWriteArrayList;
/*     */     //   17: checkcast java/util/List
/*     */     //   20: aload_1
/*     */     //   21: aload_2
/*     */     //   22: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)Lkotlin/jvm/functions/Function1;
/*     */     //   27: invokespecial forEachSafe : (Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
/*     */     //   30: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #82	-> 12
/*     */     //   #83	-> 30
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	31	0	this	Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListenerProxy;
/*     */     //   0	31	1	element	Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;
/*     */     //   0	31	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */   }
/*     */   
/*     */   private static final Unit onTrajectoryElement$lambda$7(TrajectoryElement $element, ExecutionContext $context, RootExecutionContextListener it) {
/*     */     it.onTrajectoryElement($element, $context);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   public void onCustomEvent(@NotNull CustomArtifactEvent event, @Nullable ArtifactId requester) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'event'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: aload_0
/*     */     //   8: getfield listeners : Ljava/util/concurrent/CopyOnWriteArrayList;
/*     */     //   11: checkcast java/util/List
/*     */     //   14: aload_1
/*     */     //   15: aload_2
/*     */     //   16: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;Lcom/intellij/ml/llm/matterhorn/ArtifactId;)Lkotlin/jvm/functions/Function1;
/*     */     //   21: invokespecial forEachSafe : (Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
/*     */     //   24: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #89	-> 6
/*     */     //   #90	-> 24
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	25	0	this	Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListenerProxy;
/*     */     //   0	25	1	event	Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;
/*     */     //   0	25	2	requester	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */   }
/*     */   
/*     */   private static final Unit onCustomEvent$lambda$8(CustomArtifactEvent $event, ArtifactId<?> $requester, RootExecutionContextListener it) {
/*     */     it.onCustomEvent($event, $requester);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   public void onContextClosed(@NotNull RootExecutionContext context) {
/*     */     Intrinsics.checkNotNullParameter(context, "context");
/*     */     forEachSafe(this.listeners, context::onContextClosed$lambda$9);
/*     */   }
/*     */   
/*     */   private static final Unit onContextClosed$lambda$9(RootExecutionContext $context, RootExecutionContextListener it) {
/*     */     it.onContextClosed($context);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\RootExecutionContextListenerProxy.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */