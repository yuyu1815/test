/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.MagicApiIntrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.internal.UnitSerializer;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000,\n\000\n\002\020\016\n\002\b\n\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\t\n\002\020\022\n\002\b\004\0328\020\013\032\b\022\004\022\002H\r0\f\"\004\b\000\020\r*\0020\0162\f\020\017\032\b\022\004\022\002H\r0\0202\n\b\002\020\021\032\004\030\0010\022H@¢\006\002\020\023\032H\020\013\032\b\022\004\022\002H\r0\f\"\004\b\000\020\r\"\006\b\001\020\024\030\001*\0020\0162\f\020\017\032\b\022\004\022\002H\r0\0202\006\020\025\032\002H\0242\n\b\002\020\021\032\004\030\0010\022HH¢\006\002\020\026\032P\020\013\032\b\022\004\022\002H\r0\f\"\004\b\000\020\r\"\006\b\001\020\024\030\001*\0020\0162\006\020\027\032\0020\0012\f\020\017\032\b\022\004\022\002H\r0\0202\006\020\025\032\002H\0242\n\b\002\020\021\032\004\030\0010\022HH¢\006\002\020\030\0328\020\031\032\b\022\004\022\002H\r0\f\"\004\b\000\020\r*\0020\0162\f\020\017\032\b\022\004\022\002H\r0\0202\n\b\002\020\021\032\004\030\0010\022H@¢\006\002\020\023\032H\020\031\032\b\022\004\022\002H\r0\f\"\004\b\000\020\r\"\006\b\001\020\024\030\001*\0020\0162\f\020\017\032\b\022\004\022\002H\r0\0202\006\020\025\032\002H\0242\n\b\002\020\021\032\004\030\0010\022HH¢\006\002\020\026\032\036\020\032\032\0020\001*\0020\0162\006\020\033\032\0020\0342\n\b\002\020\035\032\004\030\0010\001\032\022\020\036\032\0020\034*\0020\0162\006\020\037\032\0020\001\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\016\020\003\032\0020\001XT¢\006\002\n\000\"\016\020\004\032\0020\001XT¢\006\002\n\000\"\016\020\005\032\0020\001XT¢\006\002\n\000\"\016\020\006\032\0020\001XT¢\006\002\n\000\"\016\020\007\032\0020\001XT¢\006\002\n\000\"\016\020\b\032\0020\001XT¢\006\002\n\000\"\016\020\t\032\0020\001XT¢\006\002\n\000\"\016\020\n\032\0020\001XT¢\006\002\n\000¨\006 "}, d2 = {"commonDashSeparator", "", "COMMAND_TAG", "THOUGHT_TAG", "THOUGHT_PLAN_TAG", "THOUGHT_PREV_STEP_TAG", "THOUGHT_NEXT_STEP_TAG", "EDIT_TAG", "EDIT_FILE_PATH_TAG", "EDIT_SEARCH_TAG", "EDIT_REPLACE_TAG", "getOrCreateChildArtifact", "Lcom/intellij/ml/llm/matterhorn/Artifact;", "O", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "artifactType", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "source", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/ArtifactType;Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "I", "input", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/ArtifactType;Ljava/lang/Object;Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "name", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ArtifactType;Ljava/lang/Object;Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrCreateArtifact", "saveMediaFile", "content", "", "originalFilePath", "findMediaFile", "mediaContentId", "core"})
/*     */ @SourceDebugExtension({"SMAP\nExecutionContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExecutionContext.kt\ncom/intellij/ml/llm/matterhorn/ExecutionContextKt\n+ 2 ArtifactRequestExecutorService.kt\ncom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorServiceKt\n*L\n1#1,468:1\n460#1:471\n117#2:469\n117#2:470\n117#2:472\n117#2:473\n*S KotlinDebug\n*F\n+ 1 ExecutionContext.kt\ncom/intellij/ml/llm/matterhorn/ExecutionContextKt\n*L\n459#1:471\n457#1:469\n458#1:470\n459#1:472\n460#1:473\n*E\n"})
/*     */ public final class ExecutionContextKt
/*     */ {
/*     */   @NotNull
/*     */   public static final String commonDashSeparator = "\n----------------------------\n";
/*     */   @NotNull
/*     */   public static final String COMMAND_TAG = "COMMAND";
/*     */   @NotNull
/*     */   public static final String THOUGHT_TAG = "THOUGHT";
/*     */   @NotNull
/*     */   public static final String THOUGHT_PLAN_TAG = "PLAN";
/*     */   @NotNull
/*     */   public static final String THOUGHT_PREV_STEP_TAG = "PREVIOUS_STEP";
/*     */   @NotNull
/*     */   public static final String THOUGHT_NEXT_STEP_TAG = "NEXT_STEP";
/*     */   @NotNull
/*     */   public static final String EDIT_TAG = "EDIT";
/*     */   @NotNull
/*     */   public static final String EDIT_FILE_PATH_TAG = "FILE_PATH";
/*     */   @NotNull
/*     */   public static final String EDIT_SEARCH_TAG = "SEARCH";
/*     */   @NotNull
/*     */   public static final String EDIT_REPLACE_TAG = "REPLACE";
/*     */   
/*     */   @Nullable
/*     */   public static final <O> Object getOrCreateChildArtifact(@NotNull ExecutionContext $this$getOrCreateChildArtifact, @NotNull ArtifactType<?> artifactType, @Nullable ProjectFileStructure source, @NotNull Continuation<? super Artifact<?>> $completion) {
/* 456 */     return $this$getOrCreateChildArtifact.getOrCreateArtifact($this$getOrCreateChildArtifact.getArtifact().childOfType(artifactType), source, $completion);
/*     */   } @Nullable
/*     */   public static final <O> Object getOrCreateArtifact(@NotNull ExecutionContext $this$getOrCreateArtifact, @NotNull ArtifactType<?> artifactType, @Nullable ProjectFileStructure source, @NotNull Continuation<? super Artifact<?>> $completion) {
/* 459 */     ExecutionContext executionContext = $this$getOrCreateArtifact; Object input$iv = Unit.INSTANCE; int $i$f$getOrCreateArtifact = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 471 */     ArtifactId<?> artifact$iv$iv = executionContext.getArtifact().changeType(artifactType); int $i$f$artifactRequest = 0; return executionContext.getOrCreateArtifact(
/* 472 */         new ArtifactRequest<>(artifact$iv$iv, input$iv, (KSerializer<?>)UnitSerializer.INSTANCE), source, $completion);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final String saveMediaFile(@NotNull ExecutionContext $this$saveMediaFile, @NotNull byte[] content, @Nullable String originalFilePath) {
/*     */     Intrinsics.checkNotNullParameter($this$saveMediaFile, "<this>");
/*     */     Intrinsics.checkNotNullParameter(content, "content");
/*     */     return $this$saveMediaFile.getRoot().getMediaStorage().store(content, originalFilePath);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final byte[] findMediaFile(@NotNull ExecutionContext $this$findMediaFile, @NotNull String mediaContentId) {
/*     */     Intrinsics.checkNotNullParameter($this$findMediaFile, "<this>");
/*     */     Intrinsics.checkNotNullParameter(mediaContentId, "mediaContentId");
/*     */     return MediaStorageKt.getOrThrow($this$findMediaFile.getRoot().getMediaStorage(), mediaContentId);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ExecutionContextKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */