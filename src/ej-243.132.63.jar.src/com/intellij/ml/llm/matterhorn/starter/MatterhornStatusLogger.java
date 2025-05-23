/*    */ package com.intellij.ml.llm.matterhorn.starter;
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactEvent;
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactStatus;
/*    */ import com.intellij.ml.llm.matterhorn.Artifactual;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.json.Json;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007J\034\020\b\032\0020\0052\006\020\t\032\0020\n2\f\020\013\032\b\022\002\b\003\030\0010\fJ\016\020\r\032\0020\0052\006\020\t\032\0020\nJ\022\020\016\032\0020\0052\n\020\t\032\006\022\002\b\0030\017J\016\020\020\032\0020\0052\006\020\t\032\0020\021J\016\020\022\032\0020\0052\006\020\t\032\0020\023J\022\020\024\032\0020\0052\n\020\025\032\0060\026j\002`\027J\036\020\030\032\0020\0052\n\020\025\032\0060\031j\002`\0322\n\020\t\032\006\022\002\b\0030\f¨\006\033"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/starter/MatterhornStatusLogger;", "", "<init>", "()V", "log", "", "event", "", "artifactCreated", "artifact", "Lcom/intellij/ml/llm/matterhorn/Artifactual;", "requester", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "artifactUpdated", "artifactFinished", "Lcom/intellij/ml/llm/matterhorn/Artifact;", "artifactCancelled", "Lcom/intellij/ml/llm/matterhorn/CancelledArtifact;", "artifactFailed", "Lcom/intellij/ml/llm/matterhorn/FailedArtifact;", "onCancellation", "e", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "onException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "matterhorn"})
/*    */ @SourceDebugExtension({"SMAP\nMatterhornStatusLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornStatusLogger.kt\ncom/intellij/ml/llm/matterhorn/starter/MatterhornStatusLogger\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,85:1\n205#2:86\n205#2:87\n205#2:88\n205#2:89\n205#2:90\n205#2:91\n205#2:92\n*S KotlinDebug\n*F\n+ 1 MatterhornStatusLogger.kt\ncom/intellij/ml/llm/matterhorn/starter/MatterhornStatusLogger\n*L\n21#1:86\n26#1:87\n31#1:88\n36#1:89\n41#1:90\n50#1:91\n51#1:92\n*E\n"})
/*    */ public final class MatterhornStatusLogger {
/*    */   @NotNull
/*    */   public static final MatterhornStatusLogger INSTANCE = new MatterhornStatusLogger();
/*    */   
/*    */   public final void log(@NotNull String event) {
/* 17 */     Intrinsics.checkNotNullParameter(event, "event"); System.out.println("[Matterhorn] " + event);
/*    */   }
/*    */   
/* 20 */   public final void artifactCreated(@NotNull Artifactual artifact, @Nullable ArtifactId requester) { Intrinsics.checkNotNullParameter(artifact, "artifact"); ArtifactEvent event = new ArtifactEvent(ArtifactStatus.CREATED, artifact, requester, null, 8, null);
/* 21 */     Json this_$iv = (Json)Json.Default; int $i$f$encodeToString = 0;
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
/* 86 */     this_$iv.getSerializersModule(); log(this_$iv.encodeToString((SerializationStrategy)ArtifactEvent.Companion.serializer(), event)); } public final void artifactUpdated(@NotNull Artifactual artifact) { Intrinsics.checkNotNullParameter(artifact, "artifact"); ArtifactEvent event = new ArtifactEvent(ArtifactStatus.UPDATED, artifact, null, null, 12, null); Json this_$iv = (Json)Json.Default; int $i$f$encodeToString = 0;
/* 87 */     this_$iv.getSerializersModule(); log(this_$iv.encodeToString((SerializationStrategy)ArtifactEvent.Companion.serializer(), event)); } public final void artifactFinished(@NotNull Artifact artifact) { Intrinsics.checkNotNullParameter(artifact, "artifact"); ArtifactEvent event = new ArtifactEvent(ArtifactStatus.FINISHED, (Artifactual)artifact, null, null, 12, null); Json this_$iv = (Json)Json.Default; int $i$f$encodeToString = 0;
/* 88 */     this_$iv.getSerializersModule(); log(this_$iv.encodeToString((SerializationStrategy)ArtifactEvent.Companion.serializer(), event)); } public final void artifactCancelled(@NotNull CancelledArtifact artifact) { Intrinsics.checkNotNullParameter(artifact, "artifact"); ArtifactEvent event = new ArtifactEvent(ArtifactStatus.CANCELLED, (Artifactual)artifact, null, null, 12, null); Json this_$iv = (Json)Json.Default; int $i$f$encodeToString = 0;
/* 89 */     this_$iv.getSerializersModule(); log(this_$iv.encodeToString((SerializationStrategy)ArtifactEvent.Companion.serializer(), event)); } public final void artifactFailed(@NotNull FailedArtifact artifact) { Intrinsics.checkNotNullParameter(artifact, "artifact"); ArtifactEvent event = new ArtifactEvent(ArtifactStatus.FAILED, (Artifactual)artifact, null, artifact.getReasoning().getReason().getMessage(), 4, null); Json this_$iv = (Json)Json.Default; int $i$f$encodeToString = 0;
/* 90 */     this_$iv.getSerializersModule(); log(this_$iv.encodeToString((SerializationStrategy)ArtifactEvent.Companion.serializer(), event)); } public final void onException(@NotNull Exception e, @NotNull ArtifactId artifact) { Intrinsics.checkNotNullParameter(e, "e"); Intrinsics.checkNotNullParameter(artifact, "artifact"); Exception exception = e; if (exception instanceof CannotOpenProjectException)
/* 91 */     { Json json = (Json)Json.Default; Object value$iv = e; int $i$f$encodeToString = 0; json.getSerializersModule(); log("Generation failed. Can not open project: " + json.encodeToString((SerializationStrategy)CannotOpenProjectException.Companion.serializer(), value$iv)); }
/* 92 */     else if (exception instanceof ValidateProjectException) { Json this_$iv = (Json)Json.Default; Object value$iv = e; int $i$f$encodeToString = 0; this_$iv.getSerializersModule(); log("Generation failed. Project validation failed: " + this_$iv.encodeToString((SerializationStrategy)ValidateProjectException.Companion.serializer(), value$iv)); }
/*    */     else
/*    */     { log("Generation failed. Artifact: " + artifact.toFileName() + ", exception: " + e + ","); }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void onCancellation(@NotNull CancellationException e) {
/*    */     Intrinsics.checkNotNullParameter(e, "e");
/*    */     log("Generation cancelled, exception: " + e);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\starter\MatterhornStatusLogger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */