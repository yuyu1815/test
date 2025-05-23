/*    */ package com.intellij.ml.llm.matterhorn.starter;
/*    */ import java.util.Map;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\030\000 \0332\0020\001:\001\033B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\020\020\021\032\0020\0222\006\020\023\032\0020\024H\026J\036\020\025\032\0020\0222\006\020\026\032\0020\0272\f\020\030\032\b\022\002\b\003\030\0010\031H\026J\020\020\032\032\0020\0222\006\020\023\032\0020\024H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\027\020\b\032\b\022\004\022\0020\n0\t¢\006\b\n\000\032\004\b\013\020\fR\021\020\r\032\0020\016¢\006\b\n\000\032\004\b\017\020\020¨\006\034"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/starter/KinetoRootExecutionContextListener;", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListener;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "caches", "Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;)V", "log", "Lcom/intellij/ml/llm/matterhorn/MatterhornCachesJsonLog;", "Lcom/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStats;", "getLog", "()Lcom/intellij/ml/llm/matterhorn/MatterhornCachesJsonLog;", "statsContext", "Lcom/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStatsContext;", "getStatsContext", "()Lcom/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStatsContext;", "onContextRegistering", "", "context", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "onCustomEvent", "event", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;", "requester", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "onContextClosed", "Companion", "matterhorn"})
/*    */ @SourceDebugExtension({"SMAP\nKinetoRootExecutionContextListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KinetoRootExecutionContextListener.kt\ncom/intellij/ml/llm/matterhorn/starter/KinetoRootExecutionContextListener\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,40:1\n216#2,2:41\n14#3:43\n*S KotlinDebug\n*F\n+ 1 KinetoRootExecutionContextListener.kt\ncom/intellij/ml/llm/matterhorn/starter/KinetoRootExecutionContextListener\n*L\n35#1:41,2\n12#1:43\n*E\n"})
/*    */ public final class KinetoRootExecutionContextListener implements RootExecutionContextListener {
/*    */   public KinetoRootExecutionContextListener(@NotNull CoroutineScope scope, @NotNull MatterhornCaches caches) {
/* 10 */     this.scope = scope;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 15 */     this.log = new MatterhornCachesJsonLog("ai-responses", KinetoLlmResponseStats.Companion.serializer(), caches);
/* 16 */     this.statsContext = new KinetoLlmResponseStatsContext();
/*    */   } public void onUnfinishedArtifactCreated(@NotNull Artifactual artifact, @Nullable ArtifactId requester) {
/*    */     RootExecutionContextListener.DefaultImpls.onUnfinishedArtifactCreated(this, artifact, requester);
/*    */   } public void onUnfinishedArtifactUpdated(@NotNull Artifactual artifact) {
/*    */     RootExecutionContextListener.DefaultImpls.onUnfinishedArtifactUpdated(this, artifact);
/*    */   } public void onArtifactFinished(@NotNull Artifact artifact) {
/*    */     RootExecutionContextListener.DefaultImpls.onArtifactFinished(this, artifact);
/*    */   } public void onArtifactCancelled(@NotNull CancelledArtifact artifact) {
/*    */     RootExecutionContextListener.DefaultImpls.onArtifactCancelled(this, artifact);
/*    */   } public void onArtifactFailed(@NotNull FailedArtifact artifact) {
/*    */     RootExecutionContextListener.DefaultImpls.onArtifactFailed(this, artifact);
/*    */   } public void onCancellation(@NotNull CancellationException e) {
/*    */     RootExecutionContextListener.DefaultImpls.onCancellation(this, e);
/*    */   } public void onException(@NotNull Exception e, @NotNull ArtifactId artifactId) {
/*    */     RootExecutionContextListener.DefaultImpls.onException(this, e, artifactId);
/*    */   } public void onTrajectoryElement(@NotNull TrajectoryElement element, @NotNull ExecutionContext context) {
/*    */     RootExecutionContextListener.DefaultImpls.onTrajectoryElement(this, element, context);
/*    */   }
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/starter/KinetoRootExecutionContextListener$Companion;", "", "<init>", "()V", "LOG", "Lcom/intellij/openapi/diagnostic/Logger;", "matterhorn"})
/*    */   public static final class Companion {
/*    */     private Companion() {} }
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final CoroutineScope scope; @NotNull
/*    */   private final MatterhornCachesJsonLog<KinetoLlmResponseStats> log; @NotNull
/*    */   private final KinetoLlmResponseStatsContext statsContext;
/*    */   static { int $i$f$logger = 0;
/* 43 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(KinetoRootExecutionContextListener.class), "getInstance(...)"); } @NotNull public final MatterhornCachesJsonLog<KinetoLlmResponseStats> getLog() { return this.log; } @NotNull public final KinetoLlmResponseStatsContext getStatsContext() { return this.statsContext; } public void onContextRegistering(@NotNull RootExecutionContext context) { Intrinsics.checkNotNullParameter(context, "context"); context.registerContext(KinetoLlmResponseStatsContext.Companion.getKEY(), this.statsContext); } @NotNull private static final Logger LOG = Logger.getInstance(KinetoRootExecutionContextListener.class);
/*    */   
/*    */   public void onCustomEvent(@NotNull CustomArtifactEvent event, @Nullable ArtifactId requester) {
/*    */     Intrinsics.checkNotNullParameter(event, "event");
/*    */     if (event instanceof LlmResponseEvent) {
/*    */       KinetoLlmResponseStats stats = new KinetoLlmResponseStats(((LlmResponseEvent)event).getAnswer(), (requester != null) ? requester.toString() : null);
/*    */       BuildersKt.launch$default(this.scope, null, null, new KinetoRootExecutionContextListener$onCustomEvent$1(stats, null), 3, null);
/*    */       this.statsContext.addStats(stats);
/*    */     } 
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "KinetoRootExecutionContextListener.kt", l = {27}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.starter.KinetoRootExecutionContextListener$onCustomEvent$1")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class KinetoRootExecutionContextListener$onCustomEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */     int label;
/*    */     
/*    */     KinetoRootExecutionContextListener$onCustomEvent$1(KinetoLlmResponseStats $stats, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           this.label = 1;
/*    */           if (KinetoRootExecutionContextListener.this.getLog().log(this.$stats, (Continuation)this) == object)
/*    */             return object; 
/*    */           KinetoRootExecutionContextListener.this.getLog().log(this.$stats, (Continuation)this);
/*    */           return Unit.INSTANCE;
/*    */         case 1:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           return Unit.INSTANCE;
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super KinetoRootExecutionContextListener$onCustomEvent$1> $completion) {
/*    */       return (Continuation<Unit>)new KinetoRootExecutionContextListener$onCustomEvent$1(this.$stats, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((KinetoRootExecutionContextListener$onCustomEvent$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */   
/*    */   public void onContextClosed(@NotNull RootExecutionContext context) {
/*    */     Intrinsics.checkNotNullParameter(context, "context");
/*    */     Map<String, KinetoLlmResponseStats> $this$forEach$iv = this.statsContext.calculateMaxStats();
/*    */     int $i$f$forEach = 0;
/*    */     Iterator<Map.Entry> iterator = $this$forEach$iv.entrySet().iterator();
/*    */     if (iterator.hasNext()) {
/*    */       Map.Entry element$iv = iterator.next(), entry1 = element$iv;
/*    */       int $i$a$-forEach-KinetoRootExecutionContextListener$onContextClosed$1 = 0;
/*    */       String llmName = (String)entry1.getKey();
/*    */       KinetoLlmResponseStats max = (KinetoLlmResponseStats)entry1.getValue();
/*    */       LOG.info("Max TPM for " + llmName + ": " + max);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\starter\KinetoRootExecutionContextListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */