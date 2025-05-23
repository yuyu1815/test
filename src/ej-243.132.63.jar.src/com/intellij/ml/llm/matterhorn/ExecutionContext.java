/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
/*     */ import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Deferred;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\002\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\020\n\002\030\002\n\002\030\002\n\000\n\002\020%\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\003\n\002\020 \n\002\b\006\n\002\030\002\n\000\n\002\020\t\n\002\b\002\n\002\020\b\n\002\b\006\n\002\020\006\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\020\036\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\007\n\002\030\002\n\002\b\n\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\003\030\0002\0020\001:\002¢\001B?\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\000\022\016\020\005\032\n\022\002\b\003\022\002\b\0030\006\022\b\020\007\032\004\030\0010\b\022\n\b\002\020\t\032\004\030\0010\n¢\006\004\b\013\020\fJ \020I\032\0020\0002\016\020\005\032\n\022\002\b\003\022\002\b\0030\0062\b\020\007\032\004\030\0010\bJ\020\020I\032\0020\0002\b\020J\032\004\030\0010\nJ\006\020K\032\0020LJF\020M\032\0020N\"\004\b\000\020O2\f\020P\032\b\022\004\022\002HO0Q2\"\020R\032\036\b\001\022\004\022\002HO\022\n\022\b\022\004\022\0020N0T\022\006\022\004\030\0010\0010SH@¢\006\002\020UJ\016\020V\032\0020N2\006\020W\032\0020XJ4\020Y\032\b\022\004\022\002H[0Z\"\004\b\000\020[2\f\020,\032\b\022\004\022\002H[0\0372\n\b\002\020\007\032\004\030\0010\bH@¢\006\002\020\\J@\020Y\032\b\022\004\022\002H[0Z\"\004\b\000\020]\"\004\b\001\020[2\022\020\005\032\016\022\004\022\002H]\022\004\022\002H[0\0062\n\b\002\020\007\032\004\030\0010\bH@¢\006\002\020^JJ\020_\032\022\022\004\022\002H]\022\004\022\002H[0`R\0020\000\"\004\b\000\020]\"\004\b\001\020[2\006\020a\032\0020b2\022\020\005\032\016\022\004\022\002H]\022\004\022\002H[0\0062\n\b\002\020\007\032\004\030\0010\bJ*\020-\032\n\022\004\022\002H[\030\0010Z\"\004\b\000\020[2\f\020c\032\b\022\004\022\002H[0\037H@¢\006\002\020dJ*\020-\032\n\022\004\022\002H[\030\0010Z\"\004\b\000\020[2\f\020e\032\b\022\004\022\002H[0fH@¢\006\002\020gJ$\020h\032\b\022\004\022\0020i042\006\020j\032\0020k2\006\020l\032\0020mH@¢\006\002\020nJ\026\020o\032\0020i2\006\020\005\032\0020pH@¢\006\002\020qJ \020h\032\0020\n2\006\020\005\032\0020p2\b\b\002\020r\032\0020sH@¢\006\002\020tJ\026\020u\032\0020N2\006\020v\032\0020mH@¢\006\002\020wJ$\020x\032\0020N2\006\020y\032\0020\n2\f\020z\032\b\022\004\022\0020{04H@¢\006\002\020|J\020\020}\032\0020N2\006\020~\032\0020 H\002J\035\020\032\0020N2\f\020z\032\b\022\004\022\0020{04H@¢\006\003\020\001J\030\020\001\032\0020N2\006\020y\032\0020\nH@¢\006\003\020\001J#\020\001\032\0020N2\007\020\001\032\0020=2\b\020\001\032\0030\001H@¢\006\003\020\001J#\020\001\032\0020N2\b\020\001\032\0030\0012\007\020\001\032\0020\nH@¢\006\003\020\001J\023\020\001\032\0020N2\b\020\001\032\0030\001H\002J\037\020\001\032\0020N2\r\020\001\032\b\022\004\022\0020i04H@¢\006\003\020\001J\020\020\001\032\0020NH@¢\006\003\020\001J\032\020\001\032\0020N2\b\020\001\032\0030\001H@¢\006\003\020\001J(\020\001\032\004\030\001HO\"\b\b\000\020O*\0020#2\r\020\001\032\b\022\004\022\002HO0\"¢\006\003\020\001J/\020\001\032\0020N\"\b\b\000\020O*\0020#2\r\020\001\032\b\022\004\022\002HO0\"2\007\020\001\032\002HO¢\006\003\020\001J#\020\001\032\0020N\"\004\b\000\020[2\f\020,\032\b\022\004\022\002H[0\037H@¢\006\002\020dJ\031\020\001\032\0020N2\007\020,\032\0030 \001H@¢\006\003\020¡\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016R\023\020\004\032\004\030\0010\000¢\006\b\n\000\032\004\b\017\020\020R\031\020\005\032\n\022\002\b\003\022\002\b\0030\006¢\006\b\n\000\032\004\b\021\020\022R\023\020\007\032\004\030\0010\b¢\006\b\n\000\032\004\b\023\020\024R\034\020\t\032\004\030\0010\nX\016¢\006\016\n\000\032\004\b\025\020\026\"\004\b\027\020\030R\016\020\031\032\0020\001X\004¢\006\002\n\000R\022\020\032\032\0060\033j\002`\034X\004¢\006\002\n\000R\036\020\035\032\022\022\b\022\006\022\002\b\0030\037\022\004\022\0020 0\036X\004¢\006\002\n\000R \020!\032\024\022\b\022\006\022\002\b\0030\"\022\006\022\004\030\0010#0\036X\004¢\006\002\n\000R\021\020$\032\0020%8F¢\006\006\032\004\b&\020'R\021\020(\032\0020)8F¢\006\006\032\004\b*\020+R\033\020,\032\f\022\b\b\001\022\004\030\0010\0010\0378F¢\006\006\032\004\b-\020.R\021\020/\032\002008F¢\006\006\032\004\b1\0202R\027\0203\032\b\022\004\022\0020 048F¢\006\006\032\004\b5\0206R\032\0207\032\0020\nX\016¢\006\016\n\000\032\004\b8\020\026\"\004\b9\020\030R\016\020:\032\0020;X\004¢\006\002\n\000R\016\020<\032\0020=X\016¢\006\002\n\000R\016\020>\032\0020=X\016¢\006\002\n\000R\016\020?\032\0020@X\016¢\006\002\n\000R\016\020A\032\0020@X\016¢\006\002\n\000R\016\020B\032\0020=X\016¢\006\002\n\000R\016\020C\032\0020=X\016¢\006\002\n\000R\016\020D\032\0020=X\016¢\006\002\n\000R\016\020E\032\0020=X\016¢\006\002\n\000R\016\020F\032\0020GX\016¢\006\002\n\000R\016\020H\032\0020GX\016¢\006\002\n\000¨\006£\001"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "", "root", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "parent", "request", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;", "source", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;", "generationDirectory", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;Ljava/lang/String;)V", "getRoot", "()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "getParent", "()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "getRequest", "()Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;", "getSource", "()Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;", "getGenerationDirectory", "()Ljava/lang/String;", "setGenerationDirectory", "(Ljava/lang/String;)V", "lock", "grazieLog", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "artifactDependencies", "", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "Lcom/intellij/ml/llm/matterhorn/ArtifactDependency;", "userData", "Lcom/intellij/ml/llm/matterhorn/ExecutionContextUserDataKey;", "Lcom/intellij/ml/llm/matterhorn/CustomContext;", "service", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;", "getService", "()Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;", "project", "Lcom/intellij/openapi/project/Project;", "getProject", "()Lcom/intellij/openapi/project/Project;", "artifact", "getArtifact", "()Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "statistics", "Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;", "getStatistics", "()Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;", "dependencies", "", "getDependencies", "()Ljava/util/List;", "title", "getTitle", "setTitle", "ownTimeStopwatch", "Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;", "ownModelTime", "", "ownModelCachedTime", "ownRequests", "", "ownCachedRequests", "ownInputTokens", "ownOutputTokens", "ownCacheInputTokens", "ownCacheCreateInputTokens", "ownMoney", "", "ownCachedMoney", "createChildContext", "workingDirectory", "getCurrentWorkingProjectDir", "Lcom/intellij/openapi/vfs/VirtualFile;", "parallelProcess", "", "T", "collection", "", "processor", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", "customArtifactEvent", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;", "getOrCreateArtifact", "Lcom/intellij/ml/llm/matterhorn/Artifact;", "O", "(Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "I", "(Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrCreateCancellableArtifact", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact;", "supervisorScope", "Lkotlinx/coroutines/CoroutineScope;", "artifactId", "(Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "artifactType", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "(Lcom/intellij/ml/llm/matterhorn/ArtifactType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendToGrazie", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "chat", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "(Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendToGrazieRaw", "Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;", "(Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "allowToolUse", "", "(Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logModelParameters", "parameters", "(Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logHeadMessage", "content", "tools", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornTool;", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addDependency", "dependency", "logTools", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logSystemMessage", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logResponseTime", "time", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContextElement;", "(JLcom/intellij/ml/llm/matterhorn/ExecutionContextElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logProblem", "severity", "Lcom/intellij/ml/llm/matterhorn/ProblemSeverity;", "message", "(Lcom/intellij/ml/llm/matterhorn/ProblemSeverity;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logImagePart", "part", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageImagePart;", "logChatMessages", "messages", "flushArtifactRequestResponseLog", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logTrajectoryElement", "element", "Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;", "(Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lookupContext", "key", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContextUserDataKey;)Lcom/intellij/ml/llm/matterhorn/CustomContext;", "registerContext", "value", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContextUserDataKey;Lcom/intellij/ml/llm/matterhorn/CustomContext;)V", "dumpSourceCode", "dumpArtifactTextRepresentation", "Lcom/intellij/ml/llm/matterhorn/Artifactual;", "(Lcom/intellij/ml/llm/matterhorn/Artifactual;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CancellableArtifact", "core"})
/*     */ @SourceDebugExtension({"SMAP\nExecutionContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExecutionContext.kt\ncom/intellij/ml/llm/matterhorn/ExecutionContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Stopwatch.kt\ncom/intellij/ml/llm/matterhorn/helpers/Stopwatch\n+ 4 ArtifactRequestExecutorService.kt\ncom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorServiceKt\n+ 5 KtUtils.kt\ncom/intellij/util/KotlinUtils\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,468:1\n1#2:469\n54#3,6:470\n54#3,4:477\n54#3,6:483\n117#4:476\n19#5:481\n19#5:482\n1557#6:489\n1628#6,2:490\n1557#6:492\n1628#6,3:493\n1630#6:496\n*S KotlinDebug\n*F\n+ 1 ExecutionContext.kt\ncom/intellij/ml/llm/matterhorn/ExecutionContext\n*L\n99#1:470,6\n119#1:477,4\n204#1:483,6\n115#1:476\n185#1:481\n197#1:482\n247#1:489\n247#1:490,2\n256#1:492\n256#1:493,3\n247#1:496\n*E\n"})
/*     */ public final class ExecutionContext {
/*     */   @NotNull
/*     */   private final RootExecutionContext root;
/*     */   @Nullable
/*     */   private final ExecutionContext parent;
/*     */   @NotNull
/*     */   private final ArtifactRequest<?, ?> request;
/*     */   @Nullable
/*     */   private final ProjectFileStructure source;
/*     */   @Nullable
/*     */   private String generationDirectory;
/*     */   @NotNull
/*     */   private final Object lock;
/*     */   @NotNull
/*     */   private final StringBuilder grazieLog;
/*     */   @NotNull
/*     */   private final Map<ArtifactId<?>, ArtifactDependency> artifactDependencies;
/*     */   @NotNull
/*     */   private final Map<ExecutionContextUserDataKey<?>, CustomContext> userData;
/*     */   @NotNull
/*     */   private String title;
/*     */   
/*  40 */   public ExecutionContext(@NotNull RootExecutionContext root, @Nullable ExecutionContext parent, @NotNull ArtifactRequest<?, ?> request, @Nullable ProjectFileStructure source, @Nullable String generationDirectory) { this.root = root;
/*  41 */     this.parent = parent;
/*  42 */     this.request = request;
/*  43 */     this.source = source;
/*  44 */     this.generationDirectory = generationDirectory;
/*     */     
/*  46 */     this.lock = new Object();
/*  47 */     this.grazieLog = new StringBuilder();
/*  48 */     this.artifactDependencies = new LinkedHashMap<>();
/*  49 */     this.userData = new LinkedHashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  71 */     this.title = "";
/*     */     
/*  73 */     this.ownTimeStopwatch = new Stopwatch(true); }
/*     */   @NotNull private final Stopwatch ownTimeStopwatch;
/*     */   private long ownModelTime;
/*     */   private long ownModelCachedTime;
/*     */   private int ownRequests;
/*     */   private int ownCachedRequests;
/*     */   private long ownInputTokens;
/*     */   private long ownOutputTokens;
/*     */   private long ownCacheInputTokens;
/*     */   private long ownCacheCreateInputTokens;
/*     */   private double ownMoney;
/*     */   private double ownCachedMoney;
/*     */   @NotNull public final RootExecutionContext getRoot() { return this.root; }
/*  86 */   @Nullable public final ExecutionContext getParent() { return this.parent; } @NotNull public final ArtifactRequest<?, ?> getRequest() { return this.request; } @Nullable public final ProjectFileStructure getSource() { return this.source; } @Nullable public final String getGenerationDirectory() { return this.generationDirectory; } public final void setGenerationDirectory(@Nullable String <set-?>) { this.generationDirectory = <set-?>; } @NotNull public final ArtifactRequestExecutorService getService() { return this.root.getService(); } @NotNull public final Project getProject() { return this.root.getService().getProject(); } @NotNull public final ArtifactId<? extends Object> getArtifact() { return (ArtifactId)this.request.getArtifact(); } @NotNull public final ArtifactStatistic getStatistics() { return new ArtifactStatistic(this.ownTimeStopwatch.elapsedTimeSeconds(), this.ownTimeStopwatch.elapsedTimeMillis(), this.ownModelTime, this.ownModelCachedTime, this.ownRequests, this.ownCachedRequests, this.ownInputTokens, this.ownOutputTokens, this.ownCacheInputTokens, this.ownCacheCreateInputTokens, this.ownMoney, this.ownCachedMoney); } @NotNull public final List<ArtifactDependency> getDependencies() { return CollectionsKt.toList(this.artifactDependencies.values()); } @NotNull public final String getTitle() { return this.title; } public final void setTitle(@NotNull String <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.title = <set-?>; } @NotNull public final ExecutionContext createChildContext(@NotNull ArtifactRequest<?, ?> request, @Nullable ProjectFileStructure source) { Intrinsics.checkNotNullParameter(request, "request"); return new ExecutionContext(this.root, this, request, (source != null) ? source.copy() : null, this.generationDirectory); }
/*     */   
/*     */   @NotNull
/*  89 */   public final ExecutionContext createChildContext(@Nullable String workingDirectory) { return new ExecutionContext(this.root, this, this.request, (this.source != null) ? this.source.copy() : null, workingDirectory); } @NotNull public final VirtualFile getCurrentWorkingProjectDir() { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   4: invokestatic guessProjectDir : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   7: dup
/*     */     //   8: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   11: astore_1
/*     */     //   12: aload_0
/*     */     //   13: getfield generationDirectory : Ljava/lang/String;
/*     */     //   16: astore_2
/*     */     //   17: aload_2
/*     */     //   18: ifnull -> 89
/*     */     //   21: aload_2
/*     */     //   22: astore #4
/*     */     //   24: aload #4
/*     */     //   26: astore #5
/*     */     //   28: iconst_0
/*     */     //   29: istore #6
/*     */     //   31: aload #5
/*     */     //   33: checkcast java/lang/CharSequence
/*     */     //   36: invokeinterface length : ()I
/*     */     //   41: ifle -> 48
/*     */     //   44: iconst_1
/*     */     //   45: goto -> 49
/*     */     //   48: iconst_0
/*     */     //   49: nop
/*     */     //   50: ifeq -> 58
/*     */     //   53: aload #4
/*     */     //   55: goto -> 59
/*     */     //   58: aconst_null
/*     */     //   59: astore_3
/*     */     //   60: aload_3
/*     */     //   61: ifnull -> 89
/*     */     //   64: aload_3
/*     */     //   65: astore #6
/*     */     //   67: iconst_0
/*     */     //   68: istore #7
/*     */     //   70: aload_1
/*     */     //   71: aload #6
/*     */     //   73: invokestatic findOrCreateDirectory : (Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/String;)Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   76: nop
/*     */     //   77: astore #4
/*     */     //   79: aload #4
/*     */     //   81: ifnull -> 89
/*     */     //   84: aload #4
/*     */     //   86: goto -> 90
/*     */     //   89: aload_1
/*     */     //   90: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #92	-> 0
/*     */     //   #93	-> 12
/*     */     //   #94	-> 12
/*     */     //   #93	-> 12
/*     */     //   #469	-> 28
/*     */     //   #93	-> 31
/*     */     //   #93	-> 49
/*     */     //   #93	-> 50
/*     */     //   #93	-> 59
/*     */     //   #94	-> 60
/*     */     //   #93	-> 64
/*     */     //   #94	-> 65
/*     */     //   #469	-> 67
/*     */     //   #94	-> 70
/*     */     //   #94	-> 76
/*     */     //   #94	-> 77
/*     */     //   #93	-> 77
/*     */     //   #95	-> 89
/*     */     //   #93	-> 90
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   31	19	6	$i$a$-takeIf-ExecutionContext$getCurrentWorkingProjectDir$1	I
/*     */     //   28	22	5	it	Ljava/lang/String;
/*     */     //   70	6	7	$i$a$-let-ExecutionContext$getCurrentWorkingProjectDir$2	I
/*     */     //   67	9	6	it	Ljava/lang/String;
/*     */     //   12	79	1	projectDir	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   0	91	0	this	Lcom/intellij/ml/llm/matterhorn/ExecutionContext; } @Nullable public final <T> Object parallelProcess(@NotNull Collection collection, @NotNull Function2 processor, @NotNull Continuation $completion) { // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ExecutionContext$parallelProcess$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext$parallelProcess$1
/*     */     //   11: astore #10
/*     */     //   13: aload #10
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #10
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ExecutionContext$parallelProcess$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #10
/*     */     //   50: aload #10
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #9
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #11
/*     */     //   62: aload #10
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 215, 0 -> 88, 1 -> 164
/*     */     //   88: aload #9
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: getfield ownTimeStopwatch : Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;
/*     */     //   97: astore #4
/*     */     //   99: iconst_0
/*     */     //   100: istore #5
/*     */     //   102: aload #4
/*     */     //   104: invokevirtual isRunning : ()Z
/*     */     //   107: istore #6
/*     */     //   109: aload #4
/*     */     //   111: invokevirtual stop : ()V
/*     */     //   114: iconst_0
/*     */     //   115: istore #7
/*     */     //   117: new com/intellij/ml/llm/matterhorn/ExecutionContext$parallelProcess$2$1
/*     */     //   120: dup
/*     */     //   121: aload_1
/*     */     //   122: aload_2
/*     */     //   123: aconst_null
/*     */     //   124: invokespecial <init> : (Ljava/util/Collection;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
/*     */     //   127: checkcast kotlin/jvm/functions/Function2
/*     */     //   130: aload #10
/*     */     //   132: aload #10
/*     */     //   134: aload #4
/*     */     //   136: putfield L$0 : Ljava/lang/Object;
/*     */     //   139: aload #10
/*     */     //   141: iload #6
/*     */     //   143: putfield Z$0 : Z
/*     */     //   146: aload #10
/*     */     //   148: iconst_1
/*     */     //   149: putfield label : I
/*     */     //   152: invokestatic coroutineScope : (Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   155: dup
/*     */     //   156: aload #11
/*     */     //   158: if_acmpne -> 194
/*     */     //   161: aload #11
/*     */     //   163: areturn
/*     */     //   164: iconst_0
/*     */     //   165: istore #5
/*     */     //   167: iconst_0
/*     */     //   168: istore #7
/*     */     //   170: aload #10
/*     */     //   172: getfield Z$0 : Z
/*     */     //   175: istore #6
/*     */     //   177: aload #10
/*     */     //   179: getfield L$0 : Ljava/lang/Object;
/*     */     //   182: checkcast com/intellij/ml/llm/matterhorn/helpers/Stopwatch
/*     */     //   185: astore #4
/*     */     //   187: aload #9
/*     */     //   189: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   192: aload #9
/*     */     //   194: checkcast java/util/List
/*     */     //   197: nop
/*     */     //   198: astore #8
/*     */     //   200: iload #6
/*     */     //   202: ifeq -> 210
/*     */     //   205: aload #4
/*     */     //   207: invokevirtual start : ()V
/*     */     //   210: nop
/*     */     //   211: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   214: areturn
/*     */     //   215: new java/lang/IllegalStateException
/*     */     //   218: dup
/*     */     //   219: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   222: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   225: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #98	-> 60
/*     */     //   #99	-> 93
/*     */     //   #470	-> 102
/*     */     //   #471	-> 109
/*     */     //   #473	-> 114
/*     */     //   #100	-> 117
/*     */     //   #98	-> 161
/*     */     //   #106	-> 197
/*     */     //   #473	-> 198
/*     */     //   #474	-> 200
/*     */     //   #475	-> 210
/*     */     //   #108	-> 211
/*     */     //   #98	-> 215
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	6	0	this	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   93	62	1	collection	Ljava/util/Collection;
/*     */     //   93	62	2	processor	Lkotlin/jvm/functions/Function2;
/*     */     //   99	65	4	this_$iv	Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;
/*     */     //   187	11	4	this_$iv	Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;
/*     */     //   198	12	4	this_$iv	Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;
/*     */     //   109	55	6	wasRunning$iv	Z
/*     */     //   177	21	6	wasRunning$iv	Z
/*     */     //   198	12	6	wasRunning$iv	Z
/*     */     //   200	11	8	result$iv	Ljava/lang/Object;
/*     */     //   117	47	7	$i$a$-runWithPause-ExecutionContext$parallelProcess$2	I
/*     */     //   102	62	5	$i$f$runWithPause	I
/*     */     //   0	226	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	165	10	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	158	9	$result	Ljava/lang/Object;
/*     */     //   170	28	7	$i$a$-runWithPause-ExecutionContext$parallelProcess$2	I
/*     */     //   167	44	5	$i$f$runWithPause	I }
/*     */   @DebugMetadata(f = "ExecutionContext.kt", l = {105}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ExecutionContext$parallelProcess$2$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\020\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H\n"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}) @SourceDebugExtension({"SMAP\nExecutionContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExecutionContext.kt\ncom/intellij/ml/llm/matterhorn/ExecutionContext$parallelProcess$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,468:1\n1557#2:469\n1628#2,3:470\n*S KotlinDebug\n*F\n+ 1 ExecutionContext.kt\ncom/intellij/ml/llm/matterhorn/ExecutionContext$parallelProcess$2$1\n*L\n101#1:469\n101#1:470,3\n*E\n"})
/*     */   static final class ExecutionContext$parallelProcess$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Unit>>, Object> { int label;
/*     */     ExecutionContext$parallelProcess$2$1(Collection<T> $collection, Function2<T, Continuation<? super Unit>, Object> $processor, Continuation $completion) { super(2, $completion); }
/*     */     public final Object invokeSuspend(Object $result) { CoroutineScope $this$coroutineScope;
/*     */       Collection<T> collection1;
/*     */       Function2<T, Continuation<? super Unit>, Object> function2;
/*     */       int $i$f$map;
/*     */       Collection<T> collection2;
/*     */       Collection<Deferred> destination$iv$iv;
/*     */       int $i$f$mapTo;
/* 100 */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$coroutineScope = (CoroutineScope)this.L$0;
/* 101 */           collection1 = this.$collection; function2 = this.$processor; $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 469 */           collection2 = collection1; destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection1, 10)); $i$f$mapTo = 0;
/* 470 */           for (T item$iv$iv : collection2) {
/* 471 */             Object object1 = item$iv$iv; Collection<Deferred> collection = destination$iv$iv; int $i$a$-map-ExecutionContext$parallelProcess$2$1$1 = 0; collection.add(BuildersKt.async$default($this$coroutineScope, (CoroutineContext)Dispatchers.getDefault(), null, new ExecutionContext$parallelProcess$2$1$1$1(function2, (T)object1, null), 2, null));
/* 472 */           }  this.label = 1; if (AwaitKt.awaitAll(destination$iv$iv, (Continuation)this) == object) return object;  return AwaitKt.awaitAll(destination$iv$iv, (Continuation)this);
/*     */         case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super ExecutionContext$parallelProcess$2$1> $completion) { ExecutionContext$parallelProcess$2$1 executionContext$parallelProcess$2$1 = new ExecutionContext$parallelProcess$2$1(this.$collection, this.$processor, $completion); executionContext$parallelProcess$2$1.L$0 = value; return (Continuation<Unit>)executionContext$parallelProcess$2$1; }
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((ExecutionContext$parallelProcess$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/*     */   public final void sendEvent(@NotNull CustomArtifactEvent customArtifactEvent) { Intrinsics.checkNotNullParameter(customArtifactEvent, "customArtifactEvent"); this.root.getListener().onCustomEvent(customArtifactEvent, getArtifact()); }
/* 476 */   @Nullable public final <O> Object getOrCreateArtifact(@NotNull ArtifactId<?> artifact, @Nullable ProjectFileStructure source, @NotNull Continuation<? super Artifact<?>> $completion) { Object input$iv = Unit.INSTANCE; int $i$f$artifactRequest = 0; if (source == null); return (new ArtifactRequest<>(artifact, input$iv, (KSerializer)UnitSerializer.INSTANCE)).getOrCreateArtifact((ArtifactRequest<?, ?>)source, this.source, $completion); }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final <I, O> Object getOrCreateArtifact(@NotNull ArtifactRequest request, @Nullable ProjectFileStructure source, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ExecutionContext$getOrCreateArtifact$2
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext$getOrCreateArtifact$2
/*     */     //   11: astore #11
/*     */     //   13: aload #11
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #11
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ExecutionContext$getOrCreateArtifact$2
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #11
/*     */     //   50: aload #11
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #10
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #12
/*     */     //   62: aload #11
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 282, 0 -> 88, 1 -> 153
/*     */     //   88: aload #10
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: getfield ownTimeStopwatch : Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;
/*     */     //   97: astore #4
/*     */     //   99: iconst_0
/*     */     //   100: istore #5
/*     */     //   102: aload #4
/*     */     //   104: invokevirtual isRunning : ()Z
/*     */     //   107: pop
/*     */     //   108: aload #4
/*     */     //   110: invokevirtual stop : ()V
/*     */     //   113: iconst_0
/*     */     //   114: istore #6
/*     */     //   116: aload_0
/*     */     //   117: invokevirtual getService : ()Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   120: aload_1
/*     */     //   121: aload_2
/*     */     //   122: aload_0
/*     */     //   123: aconst_null
/*     */     //   124: aload #11
/*     */     //   126: bipush #8
/*     */     //   128: aconst_null
/*     */     //   129: aload #11
/*     */     //   131: aload_0
/*     */     //   132: putfield L$0 : Ljava/lang/Object;
/*     */     //   135: aload #11
/*     */     //   137: iconst_1
/*     */     //   138: putfield label : I
/*     */     //   141: invokestatic getOrCreateArtifact$default : (Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   144: dup
/*     */     //   145: aload #12
/*     */     //   147: if_acmpne -> 175
/*     */     //   150: aload #12
/*     */     //   152: areturn
/*     */     //   153: iconst_0
/*     */     //   154: istore #5
/*     */     //   156: iconst_0
/*     */     //   157: istore #6
/*     */     //   159: aload #11
/*     */     //   161: getfield L$0 : Ljava/lang/Object;
/*     */     //   164: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   167: astore_0
/*     */     //   168: aload #10
/*     */     //   170: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   173: aload #10
/*     */     //   175: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$ArtifactResult
/*     */     //   178: astore #7
/*     */     //   180: aload_0
/*     */     //   181: getfield lock : Ljava/lang/Object;
/*     */     //   184: astore #8
/*     */     //   186: aload #8
/*     */     //   188: monitorenter
/*     */     //   189: nop
/*     */     //   190: iconst_0
/*     */     //   191: istore #9
/*     */     //   193: aload_0
/*     */     //   194: new com/intellij/ml/llm/matterhorn/ArtifactDependency
/*     */     //   197: dup
/*     */     //   198: aload #7
/*     */     //   200: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   203: invokeinterface getId : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   208: aload #7
/*     */     //   210: invokevirtual getCached : ()Z
/*     */     //   213: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Z)V
/*     */     //   216: invokespecial addDependency : (Lcom/intellij/ml/llm/matterhorn/ArtifactDependency;)V
/*     */     //   219: nop
/*     */     //   220: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   223: astore #9
/*     */     //   225: aload #8
/*     */     //   227: monitorexit
/*     */     //   228: goto -> 239
/*     */     //   231: astore #9
/*     */     //   233: aload #8
/*     */     //   235: monitorexit
/*     */     //   236: aload #9
/*     */     //   238: athrow
/*     */     //   239: aload #7
/*     */     //   241: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   244: instanceof com/intellij/ml/llm/matterhorn/FailedArtifact
/*     */     //   247: ifeq -> 266
/*     */     //   250: new com/intellij/ml/llm/matterhorn/FailedDependencyException
/*     */     //   253: dup
/*     */     //   254: aload #7
/*     */     //   256: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   259: checkcast com/intellij/ml/llm/matterhorn/FailedArtifact
/*     */     //   262: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/FailedArtifact;)V
/*     */     //   265: athrow
/*     */     //   266: aload #7
/*     */     //   268: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   271: dup
/*     */     //   272: ldc_w 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.Artifact<O of com.intellij.ml.llm.matterhorn.ExecutionContext.getOrCreateArtifact>'
/*     */     //   275: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   278: checkcast com/intellij/ml/llm/matterhorn/Artifact
/*     */     //   281: areturn
/*     */     //   282: new java/lang/IllegalStateException
/*     */     //   285: dup
/*     */     //   286: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   289: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   292: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #118	-> 60
/*     */     //   #119	-> 93
/*     */     //   #477	-> 102
/*     */     //   #478	-> 108
/*     */     //   #480	-> 113
/*     */     //   #121	-> 116
/*     */     //   #118	-> 150
/*     */     //   #122	-> 180
/*     */     //   #123	-> 193
/*     */     //   #124	-> 219
/*     */     //   #122	-> 223
/*     */     //   #126	-> 239
/*     */     //   #127	-> 250
/*     */     //   #130	-> 266
/*     */     //   #118	-> 282
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	60	0	this	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   168	51	0	this	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   93	51	1	request	Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   93	51	2	source	Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;
/*     */     //   99	14	4	this_$iv	Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;
/*     */     //   180	51	7	artifactResult	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$ArtifactResult;
/*     */     //   239	43	7	artifactResult	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$ArtifactResult;
/*     */     //   193	27	9	$i$a$-synchronized-ExecutionContext$getOrCreateArtifact$3$1	I
/*     */     //   116	37	6	$i$a$-runWithPause-ExecutionContext$getOrCreateArtifact$3	I
/*     */     //   102	51	5	$i$f$runWithPause	I
/*     */     //   0	293	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	232	11	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	225	10	$result	Ljava/lang/Object;
/*     */     //   159	123	6	$i$a$-runWithPause-ExecutionContext$getOrCreateArtifact$3	I
/*     */     //   156	126	5	$i$f$runWithPause	I
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   189	225	231	finally
/*     */     //   231	233	231	finally
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\b\004\030\000*\004\b\000\020\001*\004\b\001\020\0022\0020\003B3\022\022\020\004\032\016\022\004\022\0028\000\022\004\022\0028\0010\005\022\b\020\006\032\004\030\0010\007\022\f\020\b\032\b\022\004\022\0020\n0\t¢\006\004\b\013\020\fJ\016\020\017\032\0020\020H@¢\006\002\020\021J\024\020\022\032\b\022\004\022\0028\0010\023H@¢\006\002\020\021R\032\020\004\032\016\022\004\022\0028\000\022\004\022\0028\0010\005X\004¢\006\002\n\000R\020\020\006\032\004\030\0010\007X\004¢\006\002\n\000R\024\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\002\n\000R\016\020\r\032\0020\016X\016¢\006\002\n\000¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact;", "I", "O", "", "request", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;", "source", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;", "deferredArtifact", "Lkotlinx/coroutines/Deferred;", "Lcom/intellij/ml/llm/matterhorn/Artifactual;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;Lkotlinx/coroutines/Deferred;)V", "allowResume", "", "cancelAndJoin", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "Lcom/intellij/ml/llm/matterhorn/Artifact;", "core"})
/*     */   @SourceDebugExtension({"SMAP\nExecutionContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExecutionContext.kt\ncom/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact\n+ 2 Stopwatch.kt\ncom/intellij/ml/llm/matterhorn/helpers/Stopwatch\n*L\n1#1,468:1\n54#2,4:469\n*S KotlinDebug\n*F\n+ 1 ExecutionContext.kt\ncom/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact\n*L\n148#1:469,4\n*E\n"})
/*     */   public final class CancellableArtifact<I, O> {
/*     */     @NotNull
/*     */     private final ArtifactRequest<I, O> request;
/*     */     @Nullable
/*     */     private final ProjectFileStructure source;
/*     */     @NotNull
/*     */     private final Deferred<Artifactual> deferredArtifact;
/*     */     private volatile boolean allowResume;
/*     */     
/*     */     public CancellableArtifact(@Nullable ArtifactRequest<I, O> request, @NotNull ProjectFileStructure source, Deferred<Artifactual> deferredArtifact) {
/*     */       this.request = request;
/*     */       this.source = source;
/*     */       this.deferredArtifact = deferredArtifact;
/*     */       this.allowResume = true;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object cancelAndJoin(@NotNull Continuation $completion) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: instanceof com/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact$cancelAndJoin$1
/*     */       //   4: ifeq -> 39
/*     */       //   7: aload_1
/*     */       //   8: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact$cancelAndJoin$1
/*     */       //   11: astore #7
/*     */       //   13: aload #7
/*     */       //   15: getfield label : I
/*     */       //   18: ldc -2147483648
/*     */       //   20: iand
/*     */       //   21: ifeq -> 39
/*     */       //   24: aload #7
/*     */       //   26: dup
/*     */       //   27: getfield label : I
/*     */       //   30: ldc -2147483648
/*     */       //   32: isub
/*     */       //   33: putfield label : I
/*     */       //   36: goto -> 50
/*     */       //   39: new com/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact$cancelAndJoin$1
/*     */       //   42: dup
/*     */       //   43: aload_0
/*     */       //   44: aload_1
/*     */       //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact;Lkotlin/coroutines/Continuation;)V
/*     */       //   48: astore #7
/*     */       //   50: aload #7
/*     */       //   52: getfield result : Ljava/lang/Object;
/*     */       //   55: astore #6
/*     */       //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   60: astore #8
/*     */       //   62: aload #7
/*     */       //   64: getfield label : I
/*     */       //   67: tableswitch default -> 214, 0 -> 88, 1 -> 131
/*     */       //   88: aload #6
/*     */       //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   93: aload_0
/*     */       //   94: iconst_0
/*     */       //   95: putfield allowResume : Z
/*     */       //   98: aload_0
/*     */       //   99: getfield deferredArtifact : Lkotlinx/coroutines/Deferred;
/*     */       //   102: checkcast kotlinx/coroutines/Job
/*     */       //   105: aload #7
/*     */       //   107: aload #7
/*     */       //   109: aload_0
/*     */       //   110: putfield L$0 : Ljava/lang/Object;
/*     */       //   113: aload #7
/*     */       //   115: iconst_1
/*     */       //   116: putfield label : I
/*     */       //   119: invokestatic cancelAndJoin : (Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   122: dup
/*     */       //   123: aload #8
/*     */       //   125: if_acmpne -> 147
/*     */       //   128: aload #8
/*     */       //   130: areturn
/*     */       //   131: aload #7
/*     */       //   133: getfield L$0 : Ljava/lang/Object;
/*     */       //   136: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact
/*     */       //   139: astore_0
/*     */       //   140: aload #6
/*     */       //   142: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   145: aload #6
/*     */       //   147: pop
/*     */       //   148: aload_0
/*     */       //   149: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */       //   152: invokestatic access$getLock$p : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)Ljava/lang/Object;
/*     */       //   155: astore_2
/*     */       //   156: aload_0
/*     */       //   157: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */       //   160: astore_3
/*     */       //   161: aload_2
/*     */       //   162: astore #4
/*     */       //   164: aload #4
/*     */       //   166: monitorenter
/*     */       //   167: nop
/*     */       //   168: iconst_0
/*     */       //   169: istore #5
/*     */       //   171: aload_3
/*     */       //   172: new com/intellij/ml/llm/matterhorn/ArtifactDependency
/*     */       //   175: dup
/*     */       //   176: aload_0
/*     */       //   177: getfield request : Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */       //   180: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */       //   183: iconst_0
/*     */       //   184: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Z)V
/*     */       //   187: invokestatic access$addDependency : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/ArtifactDependency;)V
/*     */       //   190: nop
/*     */       //   191: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   194: astore #5
/*     */       //   196: aload #4
/*     */       //   198: monitorexit
/*     */       //   199: goto -> 210
/*     */       //   202: astore #5
/*     */       //   204: aload #4
/*     */       //   206: monitorexit
/*     */       //   207: aload #5
/*     */       //   209: athrow
/*     */       //   210: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   213: areturn
/*     */       //   214: new java/lang/IllegalStateException
/*     */       //   217: dup
/*     */       //   218: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   220: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   223: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #139	-> 60
/*     */       //   #140	-> 93
/*     */       //   #141	-> 98
/*     */       //   #139	-> 128
/*     */       //   #142	-> 147
/*     */       //   #143	-> 171
/*     */       //   #144	-> 190
/*     */       //   #142	-> 194
/*     */       //   #145	-> 210
/*     */       //   #139	-> 214
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   93	38	0	this	Lcom/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact;
/*     */       //   140	50	0	this	Lcom/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact;
/*     */       //   171	20	5	$i$a$-synchronized-ExecutionContext$CancellableArtifact$cancelAndJoin$2	I
/*     */       //   0	224	1	$completion	Lkotlin/coroutines/Continuation;
/*     */       //   50	164	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */       //   57	157	6	$result	Ljava/lang/Object;
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   167	196	202	finally
/*     */       //   202	204	202	finally
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object get(@NotNull Continuation $completion) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: instanceof com/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact$get$1
/*     */       //   4: ifeq -> 39
/*     */       //   7: aload_1
/*     */       //   8: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact$get$1
/*     */       //   11: astore #11
/*     */       //   13: aload #11
/*     */       //   15: getfield label : I
/*     */       //   18: ldc -2147483648
/*     */       //   20: iand
/*     */       //   21: ifeq -> 39
/*     */       //   24: aload #11
/*     */       //   26: dup
/*     */       //   27: getfield label : I
/*     */       //   30: ldc -2147483648
/*     */       //   32: isub
/*     */       //   33: putfield label : I
/*     */       //   36: goto -> 50
/*     */       //   39: new com/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact$get$1
/*     */       //   42: dup
/*     */       //   43: aload_0
/*     */       //   44: aload_1
/*     */       //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact;Lkotlin/coroutines/Continuation;)V
/*     */       //   48: astore #11
/*     */       //   50: aload #11
/*     */       //   52: getfield result : Ljava/lang/Object;
/*     */       //   55: astore #10
/*     */       //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   60: astore #12
/*     */       //   62: aload #11
/*     */       //   64: getfield label : I
/*     */       //   67: tableswitch default -> 487, 0 -> 92, 1 -> 163, 2 -> 266
/*     */       //   92: aload #10
/*     */       //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   97: aload_0
/*     */       //   98: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */       //   101: invokestatic access$getOwnTimeStopwatch$p : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;
/*     */       //   104: astore_2
/*     */       //   105: aload_0
/*     */       //   106: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */       //   109: astore_3
/*     */       //   110: iconst_0
/*     */       //   111: istore #4
/*     */       //   113: aload_2
/*     */       //   114: invokevirtual isRunning : ()Z
/*     */       //   117: pop
/*     */       //   118: aload_2
/*     */       //   119: invokevirtual stop : ()V
/*     */       //   122: iconst_0
/*     */       //   123: istore #5
/*     */       //   125: aload_0
/*     */       //   126: getfield deferredArtifact : Lkotlinx/coroutines/Deferred;
/*     */       //   129: aload #11
/*     */       //   131: aload #11
/*     */       //   133: aload_0
/*     */       //   134: putfield L$0 : Ljava/lang/Object;
/*     */       //   137: aload #11
/*     */       //   139: aload_3
/*     */       //   140: putfield L$1 : Ljava/lang/Object;
/*     */       //   143: aload #11
/*     */       //   145: iconst_1
/*     */       //   146: putfield label : I
/*     */       //   149: invokeinterface await : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   154: dup
/*     */       //   155: aload #12
/*     */       //   157: if_acmpne -> 194
/*     */       //   160: aload #12
/*     */       //   162: areturn
/*     */       //   163: iconst_0
/*     */       //   164: istore #4
/*     */       //   166: iconst_0
/*     */       //   167: istore #5
/*     */       //   169: aload #11
/*     */       //   171: getfield L$1 : Ljava/lang/Object;
/*     */       //   174: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */       //   177: astore_3
/*     */       //   178: aload #11
/*     */       //   180: getfield L$0 : Ljava/lang/Object;
/*     */       //   183: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact
/*     */       //   186: astore_0
/*     */       //   187: aload #10
/*     */       //   189: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   192: aload #10
/*     */       //   194: checkcast com/intellij/ml/llm/matterhorn/Artifactual
/*     */       //   197: astore #7
/*     */       //   199: iconst_0
/*     */       //   200: istore #8
/*     */       //   202: aload_0
/*     */       //   203: getfield allowResume : Z
/*     */       //   206: ifeq -> 297
/*     */       //   209: aload #7
/*     */       //   211: instanceof com/intellij/ml/llm/matterhorn/CancelledArtifact
/*     */       //   214: ifeq -> 297
/*     */       //   217: aload_3
/*     */       //   218: invokevirtual getService : ()Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */       //   221: aload_0
/*     */       //   222: getfield request : Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */       //   225: aload_0
/*     */       //   226: getfield source : Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;
/*     */       //   229: aload_3
/*     */       //   230: aconst_null
/*     */       //   231: aload #11
/*     */       //   233: bipush #8
/*     */       //   235: aconst_null
/*     */       //   236: aload #11
/*     */       //   238: aload_3
/*     */       //   239: putfield L$0 : Ljava/lang/Object;
/*     */       //   242: aload #11
/*     */       //   244: aconst_null
/*     */       //   245: putfield L$1 : Ljava/lang/Object;
/*     */       //   248: aload #11
/*     */       //   250: iconst_2
/*     */       //   251: putfield label : I
/*     */       //   254: invokestatic getOrCreateArtifact$default : (Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */       //   257: dup
/*     */       //   258: aload #12
/*     */       //   260: if_acmpne -> 291
/*     */       //   263: aload #12
/*     */       //   265: areturn
/*     */       //   266: iconst_0
/*     */       //   267: istore #4
/*     */       //   269: iconst_0
/*     */       //   270: istore #5
/*     */       //   272: iconst_0
/*     */       //   273: istore #8
/*     */       //   275: aload #11
/*     */       //   277: getfield L$0 : Ljava/lang/Object;
/*     */       //   280: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */       //   283: astore_3
/*     */       //   284: aload #10
/*     */       //   286: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   289: aload #10
/*     */       //   291: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$ArtifactResult
/*     */       //   294: goto -> 309
/*     */       //   297: new com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$ArtifactResult
/*     */       //   300: dup
/*     */       //   301: aload #7
/*     */       //   303: iconst_0
/*     */       //   304: iconst_2
/*     */       //   305: aconst_null
/*     */       //   306: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/Artifactual;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */       //   309: nop
/*     */       //   310: astore #9
/*     */       //   312: aload_3
/*     */       //   313: invokestatic access$getLock$p : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)Ljava/lang/Object;
/*     */       //   316: astore #7
/*     */       //   318: aload #7
/*     */       //   320: monitorenter
/*     */       //   321: nop
/*     */       //   322: iconst_0
/*     */       //   323: istore #8
/*     */       //   325: aload_3
/*     */       //   326: new com/intellij/ml/llm/matterhorn/ArtifactDependency
/*     */       //   329: dup
/*     */       //   330: aload #9
/*     */       //   332: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */       //   335: invokeinterface getId : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */       //   340: aload #9
/*     */       //   342: invokevirtual getCached : ()Z
/*     */       //   345: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Z)V
/*     */       //   348: invokestatic access$addDependency : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/ArtifactDependency;)V
/*     */       //   351: nop
/*     */       //   352: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   355: astore #8
/*     */       //   357: aload #7
/*     */       //   359: monitorexit
/*     */       //   360: goto -> 371
/*     */       //   363: astore #8
/*     */       //   365: aload #7
/*     */       //   367: monitorexit
/*     */       //   368: aload #8
/*     */       //   370: athrow
/*     */       //   371: aload #9
/*     */       //   373: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */       //   376: astore #6
/*     */       //   378: aload #6
/*     */       //   380: instanceof com/intellij/ml/llm/matterhorn/CancelledArtifact
/*     */       //   383: ifeq -> 408
/*     */       //   386: new java/util/concurrent/CancellationException
/*     */       //   389: dup
/*     */       //   390: aload #9
/*     */       //   392: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */       //   395: checkcast com/intellij/ml/llm/matterhorn/CancelledArtifact
/*     */       //   398: invokevirtual getReasoning : ()Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Cancelled;
/*     */       //   401: invokevirtual getMessage : ()Ljava/lang/String;
/*     */       //   404: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   407: athrow
/*     */       //   408: aload #6
/*     */       //   410: instanceof com/intellij/ml/llm/matterhorn/FailedArtifact
/*     */       //   413: ifeq -> 432
/*     */       //   416: new com/intellij/ml/llm/matterhorn/FailedDependencyException
/*     */       //   419: dup
/*     */       //   420: aload #9
/*     */       //   422: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */       //   425: checkcast com/intellij/ml/llm/matterhorn/FailedArtifact
/*     */       //   428: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/FailedArtifact;)V
/*     */       //   431: athrow
/*     */       //   432: aload #6
/*     */       //   434: instanceof com/intellij/ml/llm/matterhorn/Artifact
/*     */       //   437: ifeq -> 457
/*     */       //   440: aload #9
/*     */       //   442: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */       //   445: dup
/*     */       //   446: ldc 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.Artifact<O of com.intellij.ml.llm.matterhorn.ExecutionContext.CancellableArtifact>'
/*     */       //   448: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   451: checkcast com/intellij/ml/llm/matterhorn/Artifact
/*     */       //   454: goto -> 486
/*     */       //   457: new java/lang/IllegalStateException
/*     */       //   460: dup
/*     */       //   461: aload #9
/*     */       //   463: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */       //   466: invokevirtual getClass : ()Ljava/lang/Class;
/*     */       //   469: invokestatic getOrCreateKotlinClass : (Ljava/lang/Class;)Lkotlin/reflect/KClass;
/*     */       //   472: invokeinterface getSimpleName : ()Ljava/lang/String;
/*     */       //   477: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   482: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   485: athrow
/*     */       //   486: areturn
/*     */       //   487: new java/lang/IllegalStateException
/*     */       //   490: dup
/*     */       //   491: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   493: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   496: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #147	-> 60
/*     */       //   #148	-> 97
/*     */       //   #469	-> 113
/*     */       //   #470	-> 118
/*     */       //   #472	-> 122
/*     */       //   #149	-> 125
/*     */       //   #147	-> 160
/*     */       //   #150	-> 202
/*     */       //   #151	-> 217
/*     */       //   #147	-> 263
/*     */       //   #151	-> 291
/*     */       //   #153	-> 297
/*     */       //   #149	-> 309
/*     */       //   #149	-> 310
/*     */       //   #155	-> 312
/*     */       //   #156	-> 325
/*     */       //   #157	-> 351
/*     */       //   #155	-> 355
/*     */       //   #159	-> 371
/*     */       //   #160	-> 378
/*     */       //   #161	-> 408
/*     */       //   #162	-> 432
/*     */       //   #163	-> 457
/*     */       //   #159	-> 486
/*     */       //   #147	-> 487
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   97	66	0	this	Lcom/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact;
/*     */       //   187	70	0	this	Lcom/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact;
/*     */       //   110	12	2	this_$iv	Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;
/*     */       //   199	18	7	it	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */       //   297	12	7	it	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */       //   312	51	9	artifactResult	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$ArtifactResult;
/*     */       //   371	116	9	artifactResult	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$ArtifactResult;
/*     */       //   202	64	8	$i$a$-let-ExecutionContext$CancellableArtifact$get$2$artifactResult$1	I
/*     */       //   325	27	8	$i$a$-synchronized-ExecutionContext$CancellableArtifact$get$2$1	I
/*     */       //   125	38	5	$i$a$-runWithPause-ExecutionContext$CancellableArtifact$get$2	I
/*     */       //   113	50	4	$i$f$runWithPause	I
/*     */       //   0	497	1	$completion	Lkotlin/coroutines/Continuation;
/*     */       //   50	437	11	$continuation	Lkotlin/coroutines/Continuation;
/*     */       //   57	430	10	$result	Ljava/lang/Object;
/*     */       //   169	97	5	$i$a$-runWithPause-ExecutionContext$CancellableArtifact$get$2	I
/*     */       //   166	100	4	$i$f$runWithPause	I
/*     */       //   275	34	8	$i$a$-let-ExecutionContext$CancellableArtifact$get$2$artifactResult$1	I
/*     */       //   272	215	5	$i$a$-runWithPause-ExecutionContext$CancellableArtifact$get$2	I
/*     */       //   269	218	4	$i$f$runWithPause	I
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   321	357	363	finally
/*     */       //   363	365	363	finally
/*     */     }
/*     */     
/*     */     @DebugMetadata(f = "ExecutionContext.kt", l = {141}, i = {0}, s = {"L$0"}, n = {"this"}, m = "cancelAndJoin", c = "com.intellij.ml.llm.matterhorn.ExecutionContext$CancellableArtifact")
/*     */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */     static final class ExecutionContext$CancellableArtifact$cancelAndJoin$1 extends ContinuationImpl {
/*     */       Object L$0;
/*     */       int label;
/*     */       
/*     */       ExecutionContext$CancellableArtifact$cancelAndJoin$1(Continuation $completion) {
/*     */         super($completion);
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Object invokeSuspend(@NotNull Object $result) {
/*     */         this.result = $result;
/*     */         this.label |= Integer.MIN_VALUE;
/*     */         return ExecutionContext.CancellableArtifact.this.cancelAndJoin((Continuation<? super Unit>)this);
/*     */       }
/*     */     }
/*     */     
/*     */     @DebugMetadata(f = "ExecutionContext.kt", l = {149, 151}, i = {0}, s = {"L$0"}, n = {"this"}, m = "get", c = "com.intellij.ml.llm.matterhorn.ExecutionContext$CancellableArtifact")
/*     */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */     static final class ExecutionContext$CancellableArtifact$get$1 extends ContinuationImpl {
/*     */       Object L$0;
/*     */       Object L$1;
/*     */       int label;
/*     */       
/*     */       ExecutionContext$CancellableArtifact$get$1(Continuation $completion) {
/*     */         super($completion);
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Object invokeSuspend(@NotNull Object $result) {
/*     */         this.result = $result;
/*     */         this.label |= Integer.MIN_VALUE;
/*     */         return ExecutionContext.CancellableArtifact.this.get((Continuation<? super Artifact<O>>)this);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final <I, O> CancellableArtifact<I, O> getOrCreateCancellableArtifact(@NotNull CoroutineScope supervisorScope, @NotNull ArtifactRequest<I, O> request, @Nullable ProjectFileStructure source) {
/*     */     Intrinsics.checkNotNullParameter(supervisorScope, "supervisorScope");
/*     */     Intrinsics.checkNotNullParameter(request, "request");
/*     */     Deferred<? extends Artifactual> deferred = BuildersKt.async$default(supervisorScope, null, CoroutineStart.UNDISPATCHED, new ExecutionContext$getOrCreateCancellableArtifact$deferred$1(request, source, supervisorScope, null), 1, null);
/*     */     return new CancellableArtifact<>(request, source, deferred);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ExecutionContext.kt", l = {171}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ExecutionContext$getOrCreateCancellableArtifact$deferred$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/Artifactual;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class ExecutionContext$getOrCreateCancellableArtifact$deferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Artifactual>, Object> {
/*     */     int label;
/*     */     
/*     */     ExecutionContext$getOrCreateCancellableArtifact$deferred$1(ArtifactRequest<I, O> $request, ProjectFileStructure $source, CoroutineScope $supervisorScope, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (ExecutionContext.this.getService().<I, O>getOrCreateArtifact(this.$request, this.$source, ExecutionContext.this, this.$supervisorScope, (Continuation<? super ArtifactRequestExecutorService.ArtifactResult>)this) == object)
/*     */             return object; 
/*     */           return ((ArtifactRequestExecutorService.ArtifactResult)ExecutionContext.this.getService().<I, O>getOrCreateArtifact(this.$request, this.$source, ExecutionContext.this, this.$supervisorScope, (Continuation<? super ArtifactRequestExecutorService.ArtifactResult>)this)).getArtifact();
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return ((ArtifactRequestExecutorService.ArtifactResult)SYNTHETIC_LOCAL_VARIABLE_1).getArtifact();
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super ExecutionContext$getOrCreateCancellableArtifact$deferred$1> $completion) {
/*     */       return (Continuation<Unit>)new ExecutionContext$getOrCreateCancellableArtifact$deferred$1(this.$request, this.$source, this.$supervisorScope, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((ExecutionContext$getOrCreateCancellableArtifact$deferred$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final <O> Object getArtifact(@NotNull ArtifactId artifactId, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ExecutionContext$getArtifact$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext$getArtifact$1
/*     */     //   11: astore #8
/*     */     //   13: aload #8
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #8
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ExecutionContext$getArtifact$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #8
/*     */     //   50: aload #8
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #7
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #9
/*     */     //   62: aload #8
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 228, 0 -> 88, 1 -> 125
/*     */     //   88: aload #7
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: invokevirtual getService : ()Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   97: aload_1
/*     */     //   98: aload_0
/*     */     //   99: aload #8
/*     */     //   101: aload #8
/*     */     //   103: aload_0
/*     */     //   104: putfield L$0 : Ljava/lang/Object;
/*     */     //   107: aload #8
/*     */     //   109: iconst_1
/*     */     //   110: putfield label : I
/*     */     //   113: invokevirtual getArtifact : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   116: dup
/*     */     //   117: aload #9
/*     */     //   119: if_acmpne -> 141
/*     */     //   122: aload #9
/*     */     //   124: areturn
/*     */     //   125: aload #8
/*     */     //   127: getfield L$0 : Ljava/lang/Object;
/*     */     //   130: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   133: astore_0
/*     */     //   134: aload #7
/*     */     //   136: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   139: aload #7
/*     */     //   141: checkcast com/intellij/ml/llm/matterhorn/Artifactual
/*     */     //   144: astore_3
/*     */     //   145: aload_3
/*     */     //   146: ifnull -> 207
/*     */     //   149: aload_3
/*     */     //   150: instanceof com/intellij/ml/llm/matterhorn/FailedArtifact
/*     */     //   153: ifne -> 207
/*     */     //   156: aload_0
/*     */     //   157: getfield lock : Ljava/lang/Object;
/*     */     //   160: astore #5
/*     */     //   162: aload #5
/*     */     //   164: monitorenter
/*     */     //   165: nop
/*     */     //   166: iconst_0
/*     */     //   167: istore #6
/*     */     //   169: aload_0
/*     */     //   170: new com/intellij/ml/llm/matterhorn/ArtifactDependency
/*     */     //   173: dup
/*     */     //   174: aload_3
/*     */     //   175: invokeinterface getId : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   180: iconst_1
/*     */     //   181: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Z)V
/*     */     //   184: invokespecial addDependency : (Lcom/intellij/ml/llm/matterhorn/ArtifactDependency;)V
/*     */     //   187: nop
/*     */     //   188: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   191: astore #6
/*     */     //   193: aload #5
/*     */     //   195: monitorexit
/*     */     //   196: goto -> 207
/*     */     //   199: astore #6
/*     */     //   201: aload #5
/*     */     //   203: monitorexit
/*     */     //   204: aload #6
/*     */     //   206: athrow
/*     */     //   207: aload_3
/*     */     //   208: astore #4
/*     */     //   210: iconst_0
/*     */     //   211: istore #5
/*     */     //   213: aload #4
/*     */     //   215: dup
/*     */     //   216: instanceof com/intellij/ml/llm/matterhorn/Artifact
/*     */     //   219: ifne -> 224
/*     */     //   222: pop
/*     */     //   223: aconst_null
/*     */     //   224: checkcast com/intellij/ml/llm/matterhorn/Artifact
/*     */     //   227: areturn
/*     */     //   228: new java/lang/IllegalStateException
/*     */     //   231: dup
/*     */     //   232: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   235: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   238: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #176	-> 60
/*     */     //   #177	-> 93
/*     */     //   #176	-> 122
/*     */     //   #179	-> 145
/*     */     //   #180	-> 156
/*     */     //   #181	-> 169
/*     */     //   #182	-> 187
/*     */     //   #180	-> 191
/*     */     //   #185	-> 207
/*     */     //   #481	-> 213
/*     */     //   #185	-> 227
/*     */     //   #176	-> 228
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	32	0	this	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   134	53	0	this	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   93	23	1	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   145	43	3	artifact	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   188	11	3	artifact	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   207	3	3	artifact	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   210	14	4	$this$asSafely$iv	Ljava/lang/Object;
/*     */     //   169	19	6	$i$a$-synchronized-ExecutionContext$getArtifact$2	I
/*     */     //   213	14	5	$i$f$asSafely	I
/*     */     //   0	239	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	178	8	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	171	7	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   165	193	199	finally
/*     */     //   199	201	199	finally
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final <O> Object getArtifact(@NotNull ArtifactType artifactType, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ExecutionContext$getArtifact$3
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext$getArtifact$3
/*     */     //   11: astore #8
/*     */     //   13: aload #8
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #8
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ExecutionContext$getArtifact$3
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #8
/*     */     //   50: aload #8
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #7
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #9
/*     */     //   62: aload #8
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 228, 0 -> 88, 1 -> 125
/*     */     //   88: aload #7
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: invokevirtual getService : ()Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   97: aload_1
/*     */     //   98: aload_0
/*     */     //   99: aload #8
/*     */     //   101: aload #8
/*     */     //   103: aload_0
/*     */     //   104: putfield L$0 : Ljava/lang/Object;
/*     */     //   107: aload #8
/*     */     //   109: iconst_1
/*     */     //   110: putfield label : I
/*     */     //   113: invokevirtual getArtifact : (Lcom/intellij/ml/llm/matterhorn/ArtifactType;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   116: dup
/*     */     //   117: aload #9
/*     */     //   119: if_acmpne -> 141
/*     */     //   122: aload #9
/*     */     //   124: areturn
/*     */     //   125: aload #8
/*     */     //   127: getfield L$0 : Ljava/lang/Object;
/*     */     //   130: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   133: astore_0
/*     */     //   134: aload #7
/*     */     //   136: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   139: aload #7
/*     */     //   141: checkcast com/intellij/ml/llm/matterhorn/Artifactual
/*     */     //   144: astore_3
/*     */     //   145: aload_3
/*     */     //   146: ifnull -> 207
/*     */     //   149: aload_3
/*     */     //   150: instanceof com/intellij/ml/llm/matterhorn/FailedArtifact
/*     */     //   153: ifne -> 207
/*     */     //   156: aload_0
/*     */     //   157: getfield lock : Ljava/lang/Object;
/*     */     //   160: astore #5
/*     */     //   162: aload #5
/*     */     //   164: monitorenter
/*     */     //   165: nop
/*     */     //   166: iconst_0
/*     */     //   167: istore #6
/*     */     //   169: aload_0
/*     */     //   170: new com/intellij/ml/llm/matterhorn/ArtifactDependency
/*     */     //   173: dup
/*     */     //   174: aload_3
/*     */     //   175: invokeinterface getId : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   180: iconst_1
/*     */     //   181: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Z)V
/*     */     //   184: invokespecial addDependency : (Lcom/intellij/ml/llm/matterhorn/ArtifactDependency;)V
/*     */     //   187: nop
/*     */     //   188: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   191: astore #6
/*     */     //   193: aload #5
/*     */     //   195: monitorexit
/*     */     //   196: goto -> 207
/*     */     //   199: astore #6
/*     */     //   201: aload #5
/*     */     //   203: monitorexit
/*     */     //   204: aload #6
/*     */     //   206: athrow
/*     */     //   207: aload_3
/*     */     //   208: astore #4
/*     */     //   210: iconst_0
/*     */     //   211: istore #5
/*     */     //   213: aload #4
/*     */     //   215: dup
/*     */     //   216: instanceof com/intellij/ml/llm/matterhorn/Artifact
/*     */     //   219: ifne -> 224
/*     */     //   222: pop
/*     */     //   223: aconst_null
/*     */     //   224: checkcast com/intellij/ml/llm/matterhorn/Artifact
/*     */     //   227: areturn
/*     */     //   228: new java/lang/IllegalStateException
/*     */     //   231: dup
/*     */     //   232: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   235: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   238: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #188	-> 60
/*     */     //   #189	-> 93
/*     */     //   #188	-> 122
/*     */     //   #191	-> 145
/*     */     //   #192	-> 156
/*     */     //   #193	-> 169
/*     */     //   #194	-> 187
/*     */     //   #192	-> 191
/*     */     //   #197	-> 207
/*     */     //   #482	-> 213
/*     */     //   #197	-> 227
/*     */     //   #188	-> 228
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	32	0	this	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   134	53	0	this	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   93	23	1	artifactType	Lcom/intellij/ml/llm/matterhorn/ArtifactType;
/*     */     //   145	43	3	artifact	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   188	11	3	artifact	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   207	3	3	artifact	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   210	14	4	$this$asSafely$iv	Ljava/lang/Object;
/*     */     //   169	19	6	$i$a$-synchronized-ExecutionContext$getArtifact$4	I
/*     */     //   213	14	5	$i$f$asSafely	I
/*     */     //   0	239	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	178	8	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	171	7	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   165	193	199	finally
/*     */     //   199	201	199	finally
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object sendToGrazie(@NotNull MatterhornChat chat, @NotNull ModelParameters modelParameters, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ExecutionContext$sendToGrazie$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext$sendToGrazie$1
/*     */     //   11: astore #28
/*     */     //   13: aload #28
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #28
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ExecutionContext$sendToGrazie$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #28
/*     */     //   50: aload #28
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #27
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #32
/*     */     //   62: aload #28
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 1009, 0 -> 96, 1 -> 140, 2 -> 271, 3 -> 556
/*     */     //   96: aload #27
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: aload_0
/*     */     //   102: aload #28
/*     */     //   104: aload #28
/*     */     //   106: aload_0
/*     */     //   107: putfield L$0 : Ljava/lang/Object;
/*     */     //   110: aload #28
/*     */     //   112: aload_1
/*     */     //   113: putfield L$1 : Ljava/lang/Object;
/*     */     //   116: aload #28
/*     */     //   118: aload_2
/*     */     //   119: putfield L$2 : Ljava/lang/Object;
/*     */     //   122: aload #28
/*     */     //   124: iconst_1
/*     */     //   125: putfield label : I
/*     */     //   128: invokevirtual flushArtifactRequestResponseLog : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   131: dup
/*     */     //   132: aload #32
/*     */     //   134: if_acmpne -> 174
/*     */     //   137: aload #32
/*     */     //   139: areturn
/*     */     //   140: aload #28
/*     */     //   142: getfield L$2 : Ljava/lang/Object;
/*     */     //   145: checkcast com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*     */     //   148: astore_2
/*     */     //   149: aload #28
/*     */     //   151: getfield L$1 : Ljava/lang/Object;
/*     */     //   154: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*     */     //   157: astore_1
/*     */     //   158: aload #28
/*     */     //   160: getfield L$0 : Ljava/lang/Object;
/*     */     //   163: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   166: astore_0
/*     */     //   167: aload #27
/*     */     //   169: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   172: aload #27
/*     */     //   174: pop
/*     */     //   175: new com/intellij/ml/llm/matterhorn/ExecutionContextElement
/*     */     //   178: dup
/*     */     //   179: invokespecial <init> : ()V
/*     */     //   182: astore #4
/*     */     //   184: aload_0
/*     */     //   185: getfield ownTimeStopwatch : Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;
/*     */     //   188: astore #6
/*     */     //   190: iconst_0
/*     */     //   191: istore #7
/*     */     //   193: aload #6
/*     */     //   195: invokevirtual isRunning : ()Z
/*     */     //   198: istore #8
/*     */     //   200: aload #6
/*     */     //   202: invokevirtual stop : ()V
/*     */     //   205: iconst_0
/*     */     //   206: istore #9
/*     */     //   208: new com/intellij/ml/llm/matterhorn/ExecutionContext$sendToGrazie$choices$1$result$1
/*     */     //   211: dup
/*     */     //   212: aload #4
/*     */     //   214: aload_0
/*     */     //   215: aload_1
/*     */     //   216: aload_2
/*     */     //   217: aconst_null
/*     */     //   218: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ExecutionContextElement;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/coroutines/Continuation;)V
/*     */     //   221: checkcast kotlin/jvm/functions/Function2
/*     */     //   224: aload #28
/*     */     //   226: aload #28
/*     */     //   228: aload_0
/*     */     //   229: putfield L$0 : Ljava/lang/Object;
/*     */     //   232: aload #28
/*     */     //   234: aload #4
/*     */     //   236: putfield L$1 : Ljava/lang/Object;
/*     */     //   239: aload #28
/*     */     //   241: aload #6
/*     */     //   243: putfield L$2 : Ljava/lang/Object;
/*     */     //   246: aload #28
/*     */     //   248: iload #8
/*     */     //   250: putfield Z$0 : Z
/*     */     //   253: aload #28
/*     */     //   255: iconst_2
/*     */     //   256: putfield label : I
/*     */     //   259: invokestatic coroutineScope : (Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   262: dup
/*     */     //   263: aload #32
/*     */     //   265: if_acmpne -> 320
/*     */     //   268: aload #32
/*     */     //   270: areturn
/*     */     //   271: iconst_0
/*     */     //   272: istore #7
/*     */     //   274: iconst_0
/*     */     //   275: istore #9
/*     */     //   277: aload #28
/*     */     //   279: getfield Z$0 : Z
/*     */     //   282: istore #8
/*     */     //   284: aload #28
/*     */     //   286: getfield L$2 : Ljava/lang/Object;
/*     */     //   289: checkcast com/intellij/ml/llm/matterhorn/helpers/Stopwatch
/*     */     //   292: astore #6
/*     */     //   294: aload #28
/*     */     //   296: getfield L$1 : Ljava/lang/Object;
/*     */     //   299: checkcast com/intellij/ml/llm/matterhorn/ExecutionContextElement
/*     */     //   302: astore #4
/*     */     //   304: aload #28
/*     */     //   306: getfield L$0 : Ljava/lang/Object;
/*     */     //   309: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   312: astore_0
/*     */     //   313: aload #27
/*     */     //   315: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   318: aload #27
/*     */     //   320: checkcast com/intellij/ml/llm/matterhorn/llm/AIAnswer
/*     */     //   323: astore #10
/*     */     //   325: aload_0
/*     */     //   326: getfield lock : Ljava/lang/Object;
/*     */     //   329: astore #12
/*     */     //   331: aload #12
/*     */     //   333: monitorenter
/*     */     //   334: nop
/*     */     //   335: iconst_0
/*     */     //   336: istore #13
/*     */     //   338: aload_0
/*     */     //   339: aload_0
/*     */     //   340: getfield ownInputTokens : J
/*     */     //   343: aload #10
/*     */     //   345: invokevirtual getInputTokens : ()J
/*     */     //   348: ladd
/*     */     //   349: putfield ownInputTokens : J
/*     */     //   352: aload_0
/*     */     //   353: aload_0
/*     */     //   354: getfield ownOutputTokens : J
/*     */     //   357: aload #10
/*     */     //   359: invokevirtual getOutputTokens : ()J
/*     */     //   362: ladd
/*     */     //   363: putfield ownOutputTokens : J
/*     */     //   366: aload_0
/*     */     //   367: aload_0
/*     */     //   368: getfield ownCacheInputTokens : J
/*     */     //   371: aload #10
/*     */     //   373: invokevirtual getCacheInputTokens : ()J
/*     */     //   376: ladd
/*     */     //   377: putfield ownCacheInputTokens : J
/*     */     //   380: aload_0
/*     */     //   381: aload_0
/*     */     //   382: getfield ownCacheCreateInputTokens : J
/*     */     //   385: aload #10
/*     */     //   387: invokevirtual getCacheCreateInputTokens : ()J
/*     */     //   390: ladd
/*     */     //   391: putfield ownCacheCreateInputTokens : J
/*     */     //   394: aload #10
/*     */     //   396: invokevirtual getCached : ()Z
/*     */     //   399: ifeq -> 443
/*     */     //   402: aload_0
/*     */     //   403: aload_0
/*     */     //   404: getfield ownModelCachedTime : J
/*     */     //   407: aload #10
/*     */     //   409: invokevirtual getTime : ()J
/*     */     //   412: ladd
/*     */     //   413: putfield ownModelCachedTime : J
/*     */     //   416: aload_0
/*     */     //   417: aload_0
/*     */     //   418: getfield ownCachedMoney : D
/*     */     //   421: aload #10
/*     */     //   423: invokevirtual getCost : ()D
/*     */     //   426: dadd
/*     */     //   427: putfield ownCachedMoney : D
/*     */     //   430: aload_0
/*     */     //   431: aload_0
/*     */     //   432: getfield ownCachedRequests : I
/*     */     //   435: iconst_1
/*     */     //   436: iadd
/*     */     //   437: putfield ownCachedRequests : I
/*     */     //   440: goto -> 481
/*     */     //   443: aload_0
/*     */     //   444: aload_0
/*     */     //   445: getfield ownModelTime : J
/*     */     //   448: aload #10
/*     */     //   450: invokevirtual getTime : ()J
/*     */     //   453: ladd
/*     */     //   454: putfield ownModelTime : J
/*     */     //   457: aload_0
/*     */     //   458: aload_0
/*     */     //   459: getfield ownMoney : D
/*     */     //   462: aload #10
/*     */     //   464: invokevirtual getCost : ()D
/*     */     //   467: dadd
/*     */     //   468: putfield ownMoney : D
/*     */     //   471: aload_0
/*     */     //   472: aload_0
/*     */     //   473: getfield ownRequests : I
/*     */     //   476: iconst_1
/*     */     //   477: iadd
/*     */     //   478: putfield ownRequests : I
/*     */     //   481: nop
/*     */     //   482: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   485: astore #13
/*     */     //   487: aload #12
/*     */     //   489: monitorexit
/*     */     //   490: goto -> 501
/*     */     //   493: astore #13
/*     */     //   495: aload #12
/*     */     //   497: monitorexit
/*     */     //   498: aload #13
/*     */     //   500: athrow
/*     */     //   501: aload_0
/*     */     //   502: aload #10
/*     */     //   504: invokevirtual getTime : ()J
/*     */     //   507: aload #4
/*     */     //   509: aload #28
/*     */     //   511: aload #28
/*     */     //   513: aload_0
/*     */     //   514: putfield L$0 : Ljava/lang/Object;
/*     */     //   517: aload #28
/*     */     //   519: aload #6
/*     */     //   521: putfield L$1 : Ljava/lang/Object;
/*     */     //   524: aload #28
/*     */     //   526: aload #10
/*     */     //   528: putfield L$2 : Ljava/lang/Object;
/*     */     //   531: aload #28
/*     */     //   533: iload #8
/*     */     //   535: putfield Z$0 : Z
/*     */     //   538: aload #28
/*     */     //   540: iconst_3
/*     */     //   541: putfield label : I
/*     */     //   544: invokespecial logResponseTime : (JLcom/intellij/ml/llm/matterhorn/ExecutionContextElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   547: dup
/*     */     //   548: aload #32
/*     */     //   550: if_acmpne -> 605
/*     */     //   553: aload #32
/*     */     //   555: areturn
/*     */     //   556: iconst_0
/*     */     //   557: istore #7
/*     */     //   559: iconst_0
/*     */     //   560: istore #9
/*     */     //   562: aload #28
/*     */     //   564: getfield Z$0 : Z
/*     */     //   567: istore #8
/*     */     //   569: aload #28
/*     */     //   571: getfield L$2 : Ljava/lang/Object;
/*     */     //   574: checkcast com/intellij/ml/llm/matterhorn/llm/AIAnswer
/*     */     //   577: astore #10
/*     */     //   579: aload #28
/*     */     //   581: getfield L$1 : Ljava/lang/Object;
/*     */     //   584: checkcast com/intellij/ml/llm/matterhorn/helpers/Stopwatch
/*     */     //   587: astore #6
/*     */     //   589: aload #28
/*     */     //   591: getfield L$0 : Ljava/lang/Object;
/*     */     //   594: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   597: astore_0
/*     */     //   598: aload #27
/*     */     //   600: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   603: aload #27
/*     */     //   605: pop
/*     */     //   606: aload_0
/*     */     //   607: getstatic com/intellij/ml/llm/matterhorn/CostContext.Companion : Lcom/intellij/ml/llm/matterhorn/CostContext$Companion;
/*     */     //   610: invokevirtual getCOST_CONTEXT_KEY : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContextUserDataKey;
/*     */     //   613: invokevirtual lookupContext : (Lcom/intellij/ml/llm/matterhorn/ExecutionContextUserDataKey;)Lcom/intellij/ml/llm/matterhorn/CustomContext;
/*     */     //   616: checkcast com/intellij/ml/llm/matterhorn/CostContext
/*     */     //   619: dup
/*     */     //   620: ifnull -> 634
/*     */     //   623: aload #10
/*     */     //   625: invokevirtual getCost : ()D
/*     */     //   628: invokevirtual updateTotalCostAndCheckLimit : (D)V
/*     */     //   631: goto -> 635
/*     */     //   634: pop
/*     */     //   635: aload #10
/*     */     //   637: invokevirtual getContentChoices : ()Ljava/util/List;
/*     */     //   640: astore #14
/*     */     //   642: iload #8
/*     */     //   644: ifeq -> 652
/*     */     //   647: aload #6
/*     */     //   649: invokevirtual start : ()V
/*     */     //   652: aload #14
/*     */     //   654: astore #5
/*     */     //   656: aload #5
/*     */     //   658: checkcast java/lang/Iterable
/*     */     //   661: astore #6
/*     */     //   663: iconst_0
/*     */     //   664: istore #7
/*     */     //   666: aload #6
/*     */     //   668: astore #8
/*     */     //   670: new java/util/ArrayList
/*     */     //   673: dup
/*     */     //   674: aload #6
/*     */     //   676: bipush #10
/*     */     //   678: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   681: invokespecial <init> : (I)V
/*     */     //   684: checkcast java/util/Collection
/*     */     //   687: astore #9
/*     */     //   689: iconst_0
/*     */     //   690: istore #10
/*     */     //   692: aload #8
/*     */     //   694: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   699: astore #11
/*     */     //   701: aload #11
/*     */     //   703: invokeinterface hasNext : ()Z
/*     */     //   708: ifeq -> 1002
/*     */     //   711: aload #11
/*     */     //   713: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   718: astore #12
/*     */     //   720: aload #9
/*     */     //   722: aload #12
/*     */     //   724: checkcast com/intellij/ml/llm/matterhorn/llm/AIAnswerChoice
/*     */     //   727: astore #13
/*     */     //   729: astore #26
/*     */     //   731: iconst_0
/*     */     //   732: istore #14
/*     */     //   734: aload #13
/*     */     //   736: astore #15
/*     */     //   738: aload #15
/*     */     //   740: instanceof com/intellij/ml/llm/matterhorn/llm/AIContentAnswerChoice
/*     */     //   743: ifeq -> 792
/*     */     //   746: new com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   749: dup
/*     */     //   750: getstatic com/intellij/ml/llm/matterhorn/utils/TagParsingUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/utils/TagParsingUtils;
/*     */     //   753: aload #13
/*     */     //   755: checkcast com/intellij/ml/llm/matterhorn/llm/AIContentAnswerChoice
/*     */     //   758: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   761: invokevirtual fixXMLTags : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   764: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.Assistant : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   767: aload #13
/*     */     //   769: checkcast com/intellij/ml/llm/matterhorn/llm/AIContentAnswerChoice
/*     */     //   772: invokevirtual getLogits : ()Ljava/util/List;
/*     */     //   775: aload #13
/*     */     //   777: checkcast com/intellij/ml/llm/matterhorn/llm/AIContentAnswerChoice
/*     */     //   780: invokevirtual getId : ()Ljava/lang/String;
/*     */     //   783: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Ljava/util/List;Ljava/lang/String;)V
/*     */     //   786: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   789: goto -> 989
/*     */     //   792: aload #15
/*     */     //   794: instanceof com/intellij/ml/llm/matterhorn/llm/AIToolUseAnswerChoice
/*     */     //   797: ifeq -> 981
/*     */     //   800: aload #13
/*     */     //   802: checkcast com/intellij/ml/llm/matterhorn/llm/AIToolUseAnswerChoice
/*     */     //   805: invokevirtual getUsages : ()Ljava/util/List;
/*     */     //   808: checkcast java/lang/Iterable
/*     */     //   811: astore #16
/*     */     //   813: iconst_0
/*     */     //   814: istore #17
/*     */     //   816: aload #16
/*     */     //   818: astore #18
/*     */     //   820: new java/util/ArrayList
/*     */     //   823: dup
/*     */     //   824: aload #16
/*     */     //   826: bipush #10
/*     */     //   828: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   831: invokespecial <init> : (I)V
/*     */     //   834: checkcast java/util/Collection
/*     */     //   837: astore #19
/*     */     //   839: iconst_0
/*     */     //   840: istore #20
/*     */     //   842: aload #18
/*     */     //   844: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   849: astore #21
/*     */     //   851: aload #21
/*     */     //   853: invokeinterface hasNext : ()Z
/*     */     //   858: ifeq -> 934
/*     */     //   861: aload #21
/*     */     //   863: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   868: astore #22
/*     */     //   870: aload #19
/*     */     //   872: aload #22
/*     */     //   874: checkcast com/intellij/ml/llm/matterhorn/llm/AIToolUsage
/*     */     //   877: astore #23
/*     */     //   879: astore #24
/*     */     //   881: iconst_0
/*     */     //   882: istore #25
/*     */     //   884: new com/intellij/ml/llm/matterhorn/llm/MatterhornToolUse
/*     */     //   887: dup
/*     */     //   888: aload #23
/*     */     //   890: invokevirtual getToolId : ()Ljava/lang/String;
/*     */     //   893: dup
/*     */     //   894: ifnonnull -> 900
/*     */     //   897: pop
/*     */     //   898: ldc ''
/*     */     //   900: aload #23
/*     */     //   902: invokevirtual getToolName : ()Ljava/lang/String;
/*     */     //   905: aload #23
/*     */     //   907: invokevirtual getToolParams : ()Ljava/util/Map;
/*     */     //   910: dup
/*     */     //   911: ifnonnull -> 918
/*     */     //   914: pop
/*     */     //   915: invokestatic emptyMap : ()Ljava/util/Map;
/*     */     //   918: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
/*     */     //   921: nop
/*     */     //   922: aload #24
/*     */     //   924: swap
/*     */     //   925: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   930: pop
/*     */     //   931: goto -> 851
/*     */     //   934: aload #19
/*     */     //   936: checkcast java/util/List
/*     */     //   939: nop
/*     */     //   940: aload #13
/*     */     //   942: checkcast com/intellij/ml/llm/matterhorn/llm/AIToolUseAnswerChoice
/*     */     //   945: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   948: aload #13
/*     */     //   950: checkcast com/intellij/ml/llm/matterhorn/llm/AIToolUseAnswerChoice
/*     */     //   953: invokevirtual getId : ()Ljava/lang/String;
/*     */     //   956: astore #29
/*     */     //   958: astore #30
/*     */     //   960: astore #31
/*     */     //   962: new com/intellij/ml/llm/matterhorn/llm/MatterhornAssistantChatMessageWithToolUses
/*     */     //   965: dup
/*     */     //   966: aload #31
/*     */     //   968: aload #30
/*     */     //   970: aload #29
/*     */     //   972: invokespecial <init> : (Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   975: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   978: goto -> 989
/*     */     //   981: new kotlin/NoWhenBranchMatchedException
/*     */     //   984: dup
/*     */     //   985: invokespecial <init> : ()V
/*     */     //   988: athrow
/*     */     //   989: nop
/*     */     //   990: aload #26
/*     */     //   992: swap
/*     */     //   993: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   998: pop
/*     */     //   999: goto -> 701
/*     */     //   1002: aload #9
/*     */     //   1004: checkcast java/util/List
/*     */     //   1007: nop
/*     */     //   1008: areturn
/*     */     //   1009: new java/lang/IllegalStateException
/*     */     //   1012: dup
/*     */     //   1013: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   1016: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1019: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #201	-> 60
/*     */     //   #202	-> 101
/*     */     //   #201	-> 137
/*     */     //   #203	-> 174
/*     */     //   #204	-> 184
/*     */     //   #483	-> 193
/*     */     //   #484	-> 200
/*     */     //   #486	-> 205
/*     */     //   #205	-> 208
/*     */     //   #201	-> 268
/*     */     //   #224	-> 325
/*     */     //   #225	-> 338
/*     */     //   #226	-> 352
/*     */     //   #227	-> 366
/*     */     //   #228	-> 380
/*     */     //   #230	-> 394
/*     */     //   #231	-> 402
/*     */     //   #232	-> 416
/*     */     //   #233	-> 430
/*     */     //   #236	-> 443
/*     */     //   #237	-> 457
/*     */     //   #238	-> 471
/*     */     //   #240	-> 481
/*     */     //   #224	-> 485
/*     */     //   #242	-> 501
/*     */     //   #201	-> 553
/*     */     //   #243	-> 605
/*     */     //   #244	-> 635
/*     */     //   #486	-> 640
/*     */     //   #487	-> 642
/*     */     //   #488	-> 652
/*     */     //   #204	-> 654
/*     */     //   #247	-> 656
/*     */     //   #489	-> 666
/*     */     //   #490	-> 692
/*     */     //   #491	-> 720
/*     */     //   #248	-> 734
/*     */     //   #249	-> 738
/*     */     //   #250	-> 750
/*     */     //   #251	-> 764
/*     */     //   #252	-> 767
/*     */     //   #253	-> 775
/*     */     //   #249	-> 783
/*     */     //   #255	-> 792
/*     */     //   #256	-> 800
/*     */     //   #492	-> 816
/*     */     //   #493	-> 842
/*     */     //   #494	-> 870
/*     */     //   #257	-> 884
/*     */     //   #258	-> 888
/*     */     //   #259	-> 900
/*     */     //   #260	-> 905
/*     */     //   #257	-> 918
/*     */     //   #261	-> 921
/*     */     //   #494	-> 925
/*     */     //   #495	-> 934
/*     */     //   #492	-> 939
/*     */     //   #263	-> 940
/*     */     //   #264	-> 948
/*     */     //   #255	-> 956
/*     */     //   #248	-> 981
/*     */     //   #266	-> 989
/*     */     //   #491	-> 993
/*     */     //   #496	-> 1002
/*     */     //   #489	-> 1007
/*     */     //   #247	-> 1008
/*     */     //   #201	-> 1009
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	39	0	this	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   167	104	0	this	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   313	180	0	this	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   501	55	0	this	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   598	21	0	this	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   101	39	1	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*     */     //   158	104	1	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*     */     //   101	39	2	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   149	113	2	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   184	87	4	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContextElement;
/*     */     //   304	189	4	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContextElement;
/*     */     //   501	46	4	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContextElement;
/*     */     //   656	7	5	choices	Ljava/util/List;
/*     */     //   190	81	6	this_$iv	Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;
/*     */     //   294	199	6	this_$iv	Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;
/*     */     //   501	55	6	this_$iv	Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;
/*     */     //   589	51	6	this_$iv	Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;
/*     */     //   640	12	6	this_$iv	Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;
/*     */     //   663	26	6	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   200	71	8	wasRunning$iv	Z
/*     */     //   284	209	8	wasRunning$iv	Z
/*     */     //   501	55	8	wasRunning$iv	Z
/*     */     //   569	71	8	wasRunning$iv	Z
/*     */     //   640	12	8	wasRunning$iv	Z
/*     */     //   689	12	8	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   689	292	9	destination$iv$iv	Ljava/util/Collection;
/*     */     //   989	15	9	destination$iv$iv	Ljava/util/Collection;
/*     */     //   325	168	10	result	Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;
/*     */     //   501	55	10	result	Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;
/*     */     //   579	61	10	result	Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;
/*     */     //   720	11	12	item$iv$iv	Ljava/lang/Object;
/*     */     //   731	52	13	choice	Lcom/intellij/ml/llm/matterhorn/llm/AIAnswerChoice;
/*     */     //   792	164	13	choice	Lcom/intellij/ml/llm/matterhorn/llm/AIAnswerChoice;
/*     */     //   642	12	14	result$iv	Ljava/lang/Object;
/*     */     //   813	26	16	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   839	12	18	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   839	97	19	destination$iv$iv	Ljava/util/Collection;
/*     */     //   870	11	22	item$iv$iv	Ljava/lang/Object;
/*     */     //   881	33	23	it	Lcom/intellij/ml/llm/matterhorn/llm/AIToolUsage;
/*     */     //   338	144	13	$i$a$-synchronized-ExecutionContext$sendToGrazie$choices$1$1	I
/*     */     //   208	63	9	$i$a$-runWithPause-ExecutionContext$sendToGrazie$choices$1	I
/*     */     //   193	78	7	$i$f$runWithPause	I
/*     */     //   884	38	25	$i$a$-map-ExecutionContext$sendToGrazie$2$1	I
/*     */     //   842	94	20	$i$f$mapTo	I
/*     */     //   816	124	17	$i$f$map	I
/*     */     //   734	256	14	$i$a$-map-ExecutionContext$sendToGrazie$2	I
/*     */     //   692	312	10	$i$f$mapTo	I
/*     */     //   666	342	7	$i$f$map	I
/*     */     //   0	1020	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	959	28	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	952	27	$result	Ljava/lang/Object;
/*     */     //   277	279	9	$i$a$-runWithPause-ExecutionContext$sendToGrazie$choices$1	I
/*     */     //   274	282	7	$i$f$runWithPause	I
/*     */     //   562	78	9	$i$a$-runWithPause-ExecutionContext$sendToGrazie$choices$1	I
/*     */     //   559	95	7	$i$f$runWithPause	I
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   334	487	493	finally
/*     */     //   493	495	493	finally
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ExecutionContext.kt", l = {206}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ExecutionContext$sendToGrazie$choices$1$result$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class ExecutionContext$sendToGrazie$choices$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AIAnswer>, Object> {
/*     */     int label;
/*     */     
/*     */     ExecutionContext$sendToGrazie$choices$1$result$1(ExecutionContext $receiver, MatterhornChat $chat, ModelParameters $modelParameters, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (BuildersKt.withContext((CoroutineContext)this.$context, new Function2<CoroutineScope, Continuation<? super AIAnswer>, Object>(this.$chat, this.$modelParameters, null) {
/*     */                 int label;
/*     */                 
/*     */                 public final Object invokeSuspend(Object $result) {
/*     */                   CoroutineScope $this$withContext;
/*     */                   Deferred job;
/*     */                   Job delayJob;
/*     */                   Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                   switch (this.label) {
/*     */                     case 0:
/*     */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                       $this$withContext = (CoroutineScope)this.L$0;
/*     */                       job = BuildersKt.async$default($this$withContext, null, null, new ExecutionContext$sendToGrazie$choices$1$result$1$1$job$1(this.$chat, this.$modelParameters, null), 3, null);
/*     */                       delayJob = BuildersKt.launch$default($this$withContext, null, null, new ExecutionContext$sendToGrazie$choices$1$result$1$1$delayJob$1(null), 3, null);
/*     */                       job.invokeOnCompletion(delayJob::invokeSuspend$lambda$0);
/*     */                       this.label = 1;
/*     */                       if (job.await((Continuation)this) == object)
/*     */                         return object; 
/*     */                       return job.await((Continuation)this);
/*     */                     case 1:
/*     */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                       return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */                   } 
/*     */                   throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                 }
/*     */                 
/*     */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                   Function2<CoroutineScope, Continuation<? super AIAnswer>, Object> function2 = new Function2<>(ExecutionContext.this, this.$chat, this.$modelParameters, $completion);
/*     */                   function2.L$0 = value;
/*     */                   return (Continuation)function2;
/*     */                 }
/*     */                 
/*     */                 public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                 }
/*     */                 
/*     */                 @DebugMetadata(f = "ExecutionContext.kt", l = {208}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ExecutionContext$sendToGrazie$choices$1$result$1$1$job$1")
/*     */                 @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */                 static final class ExecutionContext$sendToGrazie$choices$1$result$1$1$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AIAnswer>, Object> {
/*     */                   int label;
/*     */                   
/*     */                   ExecutionContext$sendToGrazie$choices$1$result$1$1$job$1(MatterhornChat $chat, ModelParameters $modelParameters, Continuation $completion) {
/*     */                     super(2, $completion);
/*     */                   }
/*     */                   
/*     */                   public final Object invokeSuspend(Object $result) {
/*     */                     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                     switch (this.label) {
/*     */                       case 0:
/*     */                         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                         this.label = 1;
/*     */                         if (ExecutionContext.this.getRoot().getOpenAIProxy().sendChat(this.$chat, this.$modelParameters, ExecutionContext.this::invokeSuspend$lambda$0, (Continuation)this) == object)
/*     */                           return object; 
/*     */                         return ExecutionContext.this.getRoot().getOpenAIProxy().sendChat(this.$chat, this.$modelParameters, ExecutionContext.this::invokeSuspend$lambda$0, (Continuation)this);
/*     */                       case 1:
/*     */                         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                         return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */                     } 
/*     */                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                   }
/*     */                   
/*     */                   public final Continuation<Unit> create(Object value, Continuation<? super ExecutionContext$sendToGrazie$choices$1$result$1$1$job$1> $completion) {
/*     */                     return (Continuation<Unit>)new ExecutionContext$sendToGrazie$choices$1$result$1$1$job$1(this.$chat, this.$modelParameters, $completion);
/*     */                   }
/*     */                   
/*     */                   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */                     return ((ExecutionContext$sendToGrazie$choices$1$result$1$1$job$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                   }
/*     */                   
/*     */                   private static final Unit invokeSuspend$lambda$0(ExecutionContext this$0, CustomArtifactEvent it) {
/*     */                     ExecutionContext.this.getRoot().getListener().onCustomEvent(it, ExecutionContext.this.getArtifact());
/*     */                     return Unit.INSTANCE;
/*     */                   }
/*     */                 }
/*     */                 
/*     */                 @DebugMetadata(f = "ExecutionContext.kt", l = {215}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ExecutionContext$sendToGrazie$choices$1$result$1$1$delayJob$1")
/*     */                 @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */                 static final class ExecutionContext$sendToGrazie$choices$1$result$1$1$delayJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */                   int label;
/*     */                   
/*     */                   ExecutionContext$sendToGrazie$choices$1$result$1$1$delayJob$1(Continuation $completion) {
/*     */                     super(2, $completion);
/*     */                   }
/*     */                   
/*     */                   public final Object invokeSuspend(Object $result) {
/*     */                     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                     switch (this.label) {
/*     */                       case 0:
/*     */                         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                         this.label = 1;
/*     */                         if (DelayKt.delay(60000L, (Continuation)this) == object)
/*     */                           return object; 
/*     */                         DelayKt.delay(60000L, (Continuation)this);
/*     */                         ExecutionContext.this.sendEvent((CustomArtifactEvent)LongDelayDetected.INSTANCE);
/*     */                         return Unit.INSTANCE;
/*     */                       case 1:
/*     */                         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                         ExecutionContext.this.sendEvent((CustomArtifactEvent)LongDelayDetected.INSTANCE);
/*     */                         return Unit.INSTANCE;
/*     */                     } 
/*     */                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                   }
/*     */                   
/*     */                   public final Continuation<Unit> create(Object value, Continuation<? super ExecutionContext$sendToGrazie$choices$1$result$1$1$delayJob$1> $completion) {
/*     */                     return (Continuation<Unit>)new ExecutionContext$sendToGrazie$choices$1$result$1$1$delayJob$1($completion);
/*     */                   }
/*     */                   
/*     */                   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */                     return ((ExecutionContext$sendToGrazie$choices$1$result$1$1$delayJob$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                   }
/*     */                 }
/*     */                 
/*     */                 private static final Unit invokeSuspend$lambda$0(Job $delayJob, Throwable it) {
/*     */                   Job.DefaultImpls.cancel$default($delayJob, null, 1, null);
/*     */                   return Unit.INSTANCE;
/*     */                 }
/*     */               }(Continuation)this) == object)
/*     */             return object; 
/*     */           return BuildersKt.withContext((CoroutineContext)this.$context, new Function2<CoroutineScope, Continuation<? super AIAnswer>, Object>(this.$chat, this.$modelParameters, null) {
/*     */                 int label;
/*     */                 
/*     */                 public final Object invokeSuspend(Object $result) {
/*     */                   CoroutineScope $this$withContext;
/*     */                   Deferred job;
/*     */                   Job delayJob;
/*     */                   Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                   switch (this.label) {
/*     */                     case 0:
/*     */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                       $this$withContext = (CoroutineScope)this.L$0;
/*     */                       job = BuildersKt.async$default($this$withContext, null, null, new ExecutionContext$sendToGrazie$choices$1$result$1$1$job$1(this.$chat, this.$modelParameters, null), 3, null);
/*     */                       delayJob = BuildersKt.launch$default($this$withContext, null, null, new ExecutionContext$sendToGrazie$choices$1$result$1$1$delayJob$1(null), 3, null);
/*     */                       job.invokeOnCompletion(delayJob::invokeSuspend$lambda$0);
/*     */                       this.label = 1;
/*     */                       if (job.await((Continuation)this) == object)
/*     */                         return object; 
/*     */                       return job.await((Continuation)this);
/*     */                     case 1:
/*     */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                       return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */                   } 
/*     */                   throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                 }
/*     */                 
/*     */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                   Function2<CoroutineScope, Continuation<? super AIAnswer>, Object> function2 = new Function2<>(ExecutionContext.this, this.$chat, this.$modelParameters, $completion);
/*     */                   function2.L$0 = value;
/*     */                   return (Continuation)function2;
/*     */                 }
/*     */                 
/*     */                 public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                 }
/*     */                 
/*     */                 @DebugMetadata(f = "ExecutionContext.kt", l = {208}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ExecutionContext$sendToGrazie$choices$1$result$1$1$job$1")
/*     */                 @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */                 static final class ExecutionContext$sendToGrazie$choices$1$result$1$1$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AIAnswer>, Object> {
/*     */                   int label;
/*     */                   
/*     */                   ExecutionContext$sendToGrazie$choices$1$result$1$1$job$1(MatterhornChat $chat, ModelParameters $modelParameters, Continuation $completion) {
/*     */                     super(2, $completion);
/*     */                   }
/*     */                   
/*     */                   public final Object invokeSuspend(Object $result) {
/*     */                     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                     switch (this.label) {
/*     */                       case 0:
/*     */                         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                         this.label = 1;
/*     */                         if (ExecutionContext.this.getRoot().getOpenAIProxy().sendChat(this.$chat, this.$modelParameters, ExecutionContext.this::invokeSuspend$lambda$0, (Continuation)this) == object)
/*     */                           return object; 
/*     */                         return ExecutionContext.this.getRoot().getOpenAIProxy().sendChat(this.$chat, this.$modelParameters, ExecutionContext.this::invokeSuspend$lambda$0, (Continuation)this);
/*     */                       case 1:
/*     */                         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                         return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */                     } 
/*     */                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                   }
/*     */                   
/*     */                   public final Continuation<Unit> create(Object value, Continuation<? super ExecutionContext$sendToGrazie$choices$1$result$1$1$job$1> $completion) {
/*     */                     return (Continuation<Unit>)new ExecutionContext$sendToGrazie$choices$1$result$1$1$job$1(this.$chat, this.$modelParameters, $completion);
/*     */                   }
/*     */                   
/*     */                   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */                     return ((ExecutionContext$sendToGrazie$choices$1$result$1$1$job$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                   }
/*     */                   
/*     */                   private static final Unit invokeSuspend$lambda$0(ExecutionContext this$0, CustomArtifactEvent it) {
/*     */                     ExecutionContext.this.getRoot().getListener().onCustomEvent(it, ExecutionContext.this.getArtifact());
/*     */                     return Unit.INSTANCE;
/*     */                   }
/*     */                 }
/*     */                 
/*     */                 @DebugMetadata(f = "ExecutionContext.kt", l = {215}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ExecutionContext$sendToGrazie$choices$1$result$1$1$delayJob$1")
/*     */                 @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */                 static final class ExecutionContext$sendToGrazie$choices$1$result$1$1$delayJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */                   int label;
/*     */                   
/*     */                   ExecutionContext$sendToGrazie$choices$1$result$1$1$delayJob$1(Continuation $completion) {
/*     */                     super(2, $completion);
/*     */                   }
/*     */                   
/*     */                   public final Object invokeSuspend(Object $result) {
/*     */                     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                     switch (this.label) {
/*     */                       case 0:
/*     */                         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                         this.label = 1;
/*     */                         if (DelayKt.delay(60000L, (Continuation)this) == object)
/*     */                           return object; 
/*     */                         DelayKt.delay(60000L, (Continuation)this);
/*     */                         ExecutionContext.this.sendEvent((CustomArtifactEvent)LongDelayDetected.INSTANCE);
/*     */                         return Unit.INSTANCE;
/*     */                       case 1:
/*     */                         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                         ExecutionContext.this.sendEvent((CustomArtifactEvent)LongDelayDetected.INSTANCE);
/*     */                         return Unit.INSTANCE;
/*     */                     } 
/*     */                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                   }
/*     */                   
/*     */                   public final Continuation<Unit> create(Object value, Continuation<? super ExecutionContext$sendToGrazie$choices$1$result$1$1$delayJob$1> $completion) {
/*     */                     return (Continuation<Unit>)new ExecutionContext$sendToGrazie$choices$1$result$1$1$delayJob$1($completion);
/*     */                   }
/*     */                   
/*     */                   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */                     return ((ExecutionContext$sendToGrazie$choices$1$result$1$1$delayJob$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                   }
/*     */                 }
/*     */                 
/*     */                 private static final Unit invokeSuspend$lambda$0(Job $delayJob, Throwable it) {
/*     */                   Job.DefaultImpls.cancel$default($delayJob, null, 1, null);
/*     */                   return Unit.INSTANCE;
/*     */                 }
/*     */               }(Continuation)this);
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super ExecutionContext$sendToGrazie$choices$1$result$1> $completion) {
/*     */       return (Continuation<Unit>)new ExecutionContext$sendToGrazie$choices$1$result$1(ExecutionContext.this, this.$chat, this.$modelParameters, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((ExecutionContext$sendToGrazie$choices$1$result$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object sendToGrazieRaw(@NotNull GrazieRequest request, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ExecutionContext$sendToGrazieRaw$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext$sendToGrazieRaw$1
/*     */     //   11: astore #5
/*     */     //   13: aload #5
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #5
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ExecutionContext$sendToGrazieRaw$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #5
/*     */     //   50: aload #5
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #4
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #6
/*     */     //   62: aload #5
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 139, 0 -> 88, 1 -> 117
/*     */     //   88: aload #4
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_1
/*     */     //   94: aload_0
/*     */     //   95: aload #5
/*     */     //   97: aload #5
/*     */     //   99: iconst_1
/*     */     //   100: putfield label : I
/*     */     //   103: invokeinterface execute : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   108: dup
/*     */     //   109: aload #6
/*     */     //   111: if_acmpne -> 124
/*     */     //   114: aload #6
/*     */     //   116: areturn
/*     */     //   117: aload #4
/*     */     //   119: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   122: aload #4
/*     */     //   124: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*     */     //   127: invokevirtual getMessages : ()Ljava/util/List;
/*     */     //   130: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   133: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   136: astore_3
/*     */     //   137: aload_3
/*     */     //   138: areturn
/*     */     //   139: new java/lang/IllegalStateException
/*     */     //   142: dup
/*     */     //   143: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   146: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   149: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #270	-> 60
/*     */     //   #271	-> 93
/*     */     //   #270	-> 114
/*     */     //   #271	-> 124
/*     */     //   #272	-> 137
/*     */     //   #270	-> 139
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	15	0	this	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   93	15	1	request	Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;
/*     */     //   137	2	3	result	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   0	150	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	89	5	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	82	4	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object sendToGrazie(@NotNull GrazieRequest request, boolean allowToolUse, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ExecutionContext$sendToGrazie$3
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext$sendToGrazie$3
/*     */     //   11: astore #6
/*     */     //   13: aload #6
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #6
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ExecutionContext$sendToGrazie$3
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #6
/*     */     //   50: aload #6
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #5
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #7
/*     */     //   62: aload #6
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 217, 0 -> 88, 1 -> 121
/*     */     //   88: aload #5
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: aload_1
/*     */     //   95: aload #6
/*     */     //   97: aload #6
/*     */     //   99: iload_2
/*     */     //   100: putfield Z$0 : Z
/*     */     //   103: aload #6
/*     */     //   105: iconst_1
/*     */     //   106: putfield label : I
/*     */     //   109: invokevirtual sendToGrazieRaw : (Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   112: dup
/*     */     //   113: aload #7
/*     */     //   115: if_acmpne -> 134
/*     */     //   118: aload #7
/*     */     //   120: areturn
/*     */     //   121: aload #6
/*     */     //   123: getfield Z$0 : Z
/*     */     //   126: istore_2
/*     */     //   127: aload #5
/*     */     //   129: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   132: aload #5
/*     */     //   134: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   137: astore #4
/*     */     //   139: aload #4
/*     */     //   141: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   144: ifeq -> 156
/*     */     //   147: aload #4
/*     */     //   149: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   152: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   155: areturn
/*     */     //   156: aload #4
/*     */     //   158: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornAssistantChatMessageWithToolUses
/*     */     //   161: ifeq -> 191
/*     */     //   164: iload_2
/*     */     //   165: ifeq -> 179
/*     */     //   168: aload #4
/*     */     //   170: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornAssistantChatMessageWithToolUses
/*     */     //   173: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   176: goto -> 190
/*     */     //   179: new java/lang/InternalError
/*     */     //   182: dup
/*     */     //   183: ldc_w 'ToolUse is unexpected here'
/*     */     //   186: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   189: athrow
/*     */     //   190: areturn
/*     */     //   191: new java/lang/InternalError
/*     */     //   194: dup
/*     */     //   195: aload #4
/*     */     //   197: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   200: invokestatic getOrCreateKotlinClass : (Ljava/lang/Class;)Lkotlin/reflect/KClass;
/*     */     //   203: invokeinterface getSimpleName : ()Ljava/lang/String;
/*     */     //   208: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   213: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   216: athrow
/*     */     //   217: new java/lang/IllegalStateException
/*     */     //   220: dup
/*     */     //   221: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   224: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   227: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #275	-> 60
/*     */     //   #276	-> 93
/*     */     //   #275	-> 118
/*     */     //   #277	-> 139
/*     */     //   #278	-> 147
/*     */     //   #280	-> 156
/*     */     //   #281	-> 164
/*     */     //   #283	-> 191
/*     */     //   #275	-> 217
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	19	0	this	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   93	19	1	request	Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;
/*     */     //   93	28	2	allowToolUse	Z
/*     */     //   127	90	2	allowToolUse	Z
/*     */     //   139	78	4	result	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   0	228	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	167	6	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	160	5	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object logModelParameters(@NotNull ModelParameters parameters, @NotNull Continuation<? super Unit> $completion) {
/*     */     synchronized (this.lock) {
/*     */       int $i$a$-synchronized-ExecutionContext$logModelParameters$2 = 0;
/*     */       Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("\n# PARAMETERS:"), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("\n# PARAMETERS:").append('\n'), "append(...)");
/*     */       this.grazieLog.append("\n# PARAMETERS:").append('\n');
/*     */       Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("model=" + parameters.getModel().getName()), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("model=" + parameters.getModel().getName()).append('\n'), "append(...)");
/*     */       this.grazieLog.append("model=" + parameters.getModel().getName()).append('\n');
/*     */       Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("temperature=" + parameters.getTemperature()), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("temperature=" + parameters.getTemperature()).append('\n'), "append(...)");
/*     */       this.grazieLog.append("temperature=" + parameters.getTemperature()).append('\n');
/*     */       Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("n=" + parameters.getNumberOfSuggestions()), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("n=" + parameters.getNumberOfSuggestions()).append('\n'), "append(...)");
/*     */       this.grazieLog.append("n=" + parameters.getNumberOfSuggestions()).append('\n');
/*     */       Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("seed=" + parameters.getSeed()), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("seed=" + parameters.getSeed()).append('\n'), "append(...)");
/*     */       StringBuilder stringBuilder = this.grazieLog.append("seed=" + parameters.getSeed()).append('\n');
/*     */     } 
/*     */     if (flushArtifactRequestResponseLog($completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return flushArtifactRequestResponseLog($completion); 
/*     */     flushArtifactRequestResponseLog($completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object logHeadMessage(@NotNull String content, @NotNull List tools, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ExecutionContext$logHeadMessage$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext$logHeadMessage$1
/*     */     //   11: astore #5
/*     */     //   13: aload #5
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #5
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ExecutionContext$logHeadMessage$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #5
/*     */     //   50: aload #5
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #4
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #6
/*     */     //   62: aload #5
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 203, 0 -> 92, 1 -> 131, 2 -> 191
/*     */     //   92: aload #4
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_0
/*     */     //   98: aload_1
/*     */     //   99: aload #5
/*     */     //   101: aload #5
/*     */     //   103: aload_0
/*     */     //   104: putfield L$0 : Ljava/lang/Object;
/*     */     //   107: aload #5
/*     */     //   109: aload_2
/*     */     //   110: putfield L$1 : Ljava/lang/Object;
/*     */     //   113: aload #5
/*     */     //   115: iconst_1
/*     */     //   116: putfield label : I
/*     */     //   119: invokespecial logSystemMessage : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   122: dup
/*     */     //   123: aload #6
/*     */     //   125: if_acmpne -> 156
/*     */     //   128: aload #6
/*     */     //   130: areturn
/*     */     //   131: aload #5
/*     */     //   133: getfield L$1 : Ljava/lang/Object;
/*     */     //   136: checkcast java/util/List
/*     */     //   139: astore_2
/*     */     //   140: aload #5
/*     */     //   142: getfield L$0 : Ljava/lang/Object;
/*     */     //   145: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   148: astore_0
/*     */     //   149: aload #4
/*     */     //   151: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   154: aload #4
/*     */     //   156: pop
/*     */     //   157: aload_0
/*     */     //   158: aload_2
/*     */     //   159: aload #5
/*     */     //   161: aload #5
/*     */     //   163: aconst_null
/*     */     //   164: putfield L$0 : Ljava/lang/Object;
/*     */     //   167: aload #5
/*     */     //   169: aconst_null
/*     */     //   170: putfield L$1 : Ljava/lang/Object;
/*     */     //   173: aload #5
/*     */     //   175: iconst_2
/*     */     //   176: putfield label : I
/*     */     //   179: invokespecial logTools : (Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   182: dup
/*     */     //   183: aload #6
/*     */     //   185: if_acmpne -> 198
/*     */     //   188: aload #6
/*     */     //   190: areturn
/*     */     //   191: aload #4
/*     */     //   193: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   196: aload #4
/*     */     //   198: pop
/*     */     //   199: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   202: areturn
/*     */     //   203: new java/lang/IllegalStateException
/*     */     //   206: dup
/*     */     //   207: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   210: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   213: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #297	-> 60
/*     */     //   #298	-> 97
/*     */     //   #297	-> 128
/*     */     //   #299	-> 156
/*     */     //   #297	-> 188
/*     */     //   #300	-> 198
/*     */     //   #297	-> 203
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	34	0	this	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   149	33	0	this	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   97	25	1	content	Ljava/lang/String;
/*     */     //   97	34	2	tools	Ljava/util/List;
/*     */     //   140	42	2	tools	Ljava/util/List;
/*     */     //   0	214	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	153	5	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	146	4	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private final void addDependency(ArtifactDependency dependency) {
/*     */     if (!this.artifactDependencies.containsKey(dependency.getArtifact()))
/*     */       this.artifactDependencies.put(dependency.getArtifact(), dependency); 
/*     */   }
/*     */   
/*     */   private final Object logTools(List tools, Continuation<? super Unit> $completion) {
/*     */     if (tools.isEmpty())
/*     */       return Unit.INSTANCE; 
/*     */     synchronized (this.lock) {
/*     */       int $i$a$-synchronized-ExecutionContext$logTools$2 = 0;
/*     */       String toolMessage = CollectionsKt.joinToString$default(tools, "\n\n", null, null, 0, null, ExecutionContext::logTools$lambda$13$lambda$12, 30, null);
/*     */       Intrinsics.checkNotNullExpressionValue(this.grazieLog.append('\n'), "append(...)");
/*     */       this.grazieLog.append('\n');
/*     */       Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("# TOOLS:"), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("# TOOLS:").append('\n'), "append(...)");
/*     */       this.grazieLog.append("# TOOLS:").append('\n');
/*     */       Intrinsics.checkNotNullExpressionValue(this.grazieLog.append(toolMessage), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(this.grazieLog.append(toolMessage).append('\n'), "append(...)");
/*     */       StringBuilder stringBuilder = this.grazieLog.append(toolMessage).append('\n');
/*     */     } 
/*     */     if (flushArtifactRequestResponseLog($completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return flushArtifactRequestResponseLog($completion); 
/*     */     flushArtifactRequestResponseLog($completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final CharSequence logTools$lambda$13$lambda$12(MatterhornTool it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return it.toString();
/*     */   }
/*     */   
/*     */   private final Object logSystemMessage(String content, Continuation<? super Unit> $completion) {
/*     */     synchronized (this.lock) {
/*     */       int $i$a$-synchronized-ExecutionContext$logSystemMessage$2 = 0;
/*     */       Intrinsics.checkNotNullExpressionValue(this.grazieLog.append('\n'), "append(...)");
/*     */       this.grazieLog.append('\n');
/*     */       Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("# SYSTEM:"), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("# SYSTEM:").append('\n'), "append(...)");
/*     */       this.grazieLog.append("# SYSTEM:").append('\n');
/*     */       Intrinsics.checkNotNullExpressionValue(this.grazieLog.append(content), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(this.grazieLog.append(content).append('\n'), "append(...)");
/*     */       StringBuilder stringBuilder = this.grazieLog.append(content).append('\n');
/*     */     } 
/*     */     if (flushArtifactRequestResponseLog($completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return flushArtifactRequestResponseLog($completion); 
/*     */     flushArtifactRequestResponseLog($completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private final Object logResponseTime(long time, ExecutionContextElement context, Continuation<? super Unit> $completion) {
/*     */     synchronized (this.lock) {
/*     */       int $i$a$-synchronized-ExecutionContext$logResponseTime$2 = 0;
/*     */       Intrinsics.checkNotNullExpressionValue(this.grazieLog.append('\n'), "append(...)");
/*     */       this.grazieLog.append('\n');
/*     */       Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("# LLM TRACE IDS:"), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("# LLM TRACE IDS:").append('\n'), "append(...)");
/*     */       this.grazieLog.append("# LLM TRACE IDS:").append('\n');
/*     */       Intrinsics.checkNotNullExpressionValue(this.grazieLog.append(CollectionsKt.joinToString$default(context.getTraceIds(), ", ", null, null, 0, null, null, 62, null)), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(this.grazieLog.append(CollectionsKt.joinToString$default(context.getTraceIds(), ", ", null, null, 0, null, null, 62, null)).append('\n'), "append(...)");
/*     */       this.grazieLog.append(CollectionsKt.joinToString$default(context.getTraceIds(), ", ", null, null, 0, null, null, 62, null)).append('\n');
/*     */       Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("# LLM RESPONSE TIME:"), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("# LLM RESPONSE TIME:").append('\n'), "append(...)");
/*     */       this.grazieLog.append("# LLM RESPONSE TIME:").append('\n');
/*     */       StringBuilder stringBuilder2 = this.grazieLog;
/*     */       String str1 = "%.2f";
/*     */       Object[] arrayOfObject = new Object[1];
/*     */       arrayOfObject[0] = Boxing.boxDouble(time / 1000.0D);
/*     */       arrayOfObject = arrayOfObject;
/*     */       Intrinsics.checkNotNullExpressionValue(String.format(str1, Arrays.copyOf(arrayOfObject, arrayOfObject.length)), "format(...)");
/*     */       String str2 = String.format(str1, Arrays.copyOf(arrayOfObject, arrayOfObject.length)) + " seconds";
/*     */       Intrinsics.checkNotNullExpressionValue(stringBuilder2.append(str2), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(stringBuilder2.append(str2).append('\n'), "append(...)");
/*     */       StringBuilder stringBuilder1 = stringBuilder2.append(str2).append('\n');
/*     */     } 
/*     */     if (flushArtifactRequestResponseLog($completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return flushArtifactRequestResponseLog($completion); 
/*     */     flushArtifactRequestResponseLog($completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object logProblem(@NotNull ProblemSeverity severity, @NotNull String message, @NotNull Continuation<? super Unit> $completion) {
/*     */     if (this.root.logProblem(severity, getArtifact().getName(), message, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return this.root.logProblem(severity, getArtifact().getName(), message, $completion); 
/*     */     this.root.logProblem(severity, getArtifact().getName(), message, $completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private final void logImagePart(MatterhornChatMessageImagePart part) {
/*     */     Intrinsics.checkNotNullExpressionValue(this.grazieLog.append(part.toMarkdown()), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(this.grazieLog.append(part.toMarkdown()).append('\n'), "append(...)");
/*     */     this.grazieLog.append(part.toMarkdown()).append('\n');
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object logChatMessages(@NotNull List messages, @NotNull Continuation<? super Unit> $completion) {
/*     */     synchronized (this.lock) {
/*     */       int $i$a$-synchronized-ExecutionContext$logChatMessages$2 = 0;
/*     */       for (MatterhornChatElement message : messages) {
/*     */         Intrinsics.checkNotNullExpressionValue(this.grazieLog.append('\n'), "append(...)");
/*     */         this.grazieLog.append('\n');
/*     */         Intrinsics.checkNotNullExpressionValue(this.grazieLog.append('\n'), "append(...)");
/*     */         this.grazieLog.append('\n');
/*     */         Intrinsics.checkNotNullExpressionValue(message.getKind().toString().toUpperCase(Locale.ROOT), "toUpperCase(...)");
/*     */         Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("# " + message.getKind().toString().toUpperCase(Locale.ROOT) + ":"), "append(...)");
/*     */         Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("# " + message.getKind().toString().toUpperCase(Locale.ROOT) + ":").append('\n'), "append(...)");
/*     */         this.grazieLog.append("# " + message.getKind().toString().toUpperCase(Locale.ROOT) + ":").append('\n');
/*     */         MatterhornChatElement matterhornChatElement1 = message;
/*     */         Intrinsics.checkNotNullExpressionValue(this.grazieLog.append(((MatterhornChatMessage)message).getContent()), "append(...)");
/*     */         Intrinsics.checkNotNullExpressionValue(this.grazieLog.append(((MatterhornChatMessage)message).getContent()).append('\n'), "append(...)");
/*     */         for (MatterhornChatMessagePart part : ((MatterhornMultiPartChatMessage)message).getParts()) {
/*     */           logImagePart((MatterhornChatMessageImagePart)part);
/*     */           Intrinsics.checkNotNullExpressionValue(this.grazieLog.append(part.getRepresentation()), "append(...)");
/*     */           Intrinsics.checkNotNullExpressionValue(this.grazieLog.append(part.getRepresentation()).append('\n'), "append(...)");
/*     */           (part instanceof MatterhornChatMessageImagePart) ? Unit.INSTANCE : this.grazieLog.append(part.getRepresentation()).append('\n');
/*     */         } 
/*     */         if ((((MatterhornUserChatMessageWithToolResults)message).getContent().length() > 0)) {
/*     */           Intrinsics.checkNotNullExpressionValue(this.grazieLog.append(((MatterhornUserChatMessageWithToolResults)message).getContent()), "append(...)");
/*     */           Intrinsics.checkNotNullExpressionValue(this.grazieLog.append(((MatterhornUserChatMessageWithToolResults)message).getContent()).append('\n'), "append(...)");
/*     */           Intrinsics.checkNotNullExpressionValue(this.grazieLog.append(((MatterhornUserChatMessageWithToolResults)message).getContent()).append('\n').append('\n'), "append(...)");
/*     */           this.grazieLog.append(((MatterhornUserChatMessageWithToolResults)message).getContent()).append('\n').append('\n');
/*     */         } 
/*     */         for (MatterhornToolResult result : ((MatterhornUserChatMessageWithToolResults)message).getToolResults()) {
/*     */           String str1 = result.getContent(), str2 = str1;
/*     */           int $i$a$-takeUnless-ExecutionContext$logChatMessages$2$1 = 0;
/*     */           Object object = !((str2.length() == 0) ? 1 : 0) ? str1 : null;
/*     */           int $i$a$-let-ExecutionContext$logChatMessages$2$2 = 0;
/*     */           Intrinsics.checkNotNullExpressionValue(this.grazieLog.append((String)object), "append(...)");
/*     */           Intrinsics.checkNotNullExpressionValue(this.grazieLog.append((String)object).append('\n'), "append(...)");
/*     */           !((str2.length() == 0) ? 1 : 0) ? str1 : null;
/*     */           ((!((str2.length() == 0) ? 1 : 0) ? str1 : null) != null) ? this.grazieLog.append((String)object).append('\n') : null;
/*     */           MatterhornChatMessageImagePart it = result.getImage();
/*     */           int $i$a$-let-ExecutionContext$logChatMessages$2$3 = 0;
/*     */           logImagePart(it);
/*     */           result.getImage();
/*     */           Intrinsics.checkNotNullExpressionValue(this.grazieLog.append('\n'), "append(...)");
/*     */           this.grazieLog.append('\n');
/*     */           Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("tool_use_id: " + result.getId()), "append(...)");
/*     */           Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("tool_use_id: " + result.getId()).append('\n'), "append(...)");
/*     */           this.grazieLog.append("tool_use_id: " + result.getId()).append('\n');
/*     */           Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("is_error: " + result.isError()), "append(...)");
/*     */           Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("is_error: " + result.isError()).append('\n'), "append(...)");
/*     */           this.grazieLog.append("is_error: " + result.isError()).append('\n');
/*     */         } 
/*     */         if (matterhornChatElement1 instanceof MatterhornAssistantChatMessageWithToolUses) {
/*     */           if ((((MatterhornAssistantChatMessageWithToolUses)message).getContent().length() > 0)) {
/*     */             Intrinsics.checkNotNullExpressionValue(this.grazieLog.append(((MatterhornAssistantChatMessageWithToolUses)message).getContent()), "append(...)");
/*     */             Intrinsics.checkNotNullExpressionValue(this.grazieLog.append(((MatterhornAssistantChatMessageWithToolUses)message).getContent()).append('\n'), "append(...)");
/*     */             Intrinsics.checkNotNullExpressionValue(this.grazieLog.append(((MatterhornAssistantChatMessageWithToolUses)message).getContent()).append('\n').append('\n'), "append(...)");
/*     */             this.grazieLog.append(((MatterhornAssistantChatMessageWithToolUses)message).getContent()).append('\n').append('\n');
/*     */           } 
/*     */           for (MatterhornToolUse usage : ((MatterhornAssistantChatMessageWithToolUses)message).getToolUses()) {
/*     */             Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("tool_id: " + usage.getId()), "append(...)");
/*     */             Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("tool_id: " + usage.getId()).append('\n'), "append(...)");
/*     */             this.grazieLog.append("tool_id: " + usage.getId()).append('\n');
/*     */             Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("tool_name: " + usage.getName()), "append(...)");
/*     */             Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("tool_name: " + usage.getName()).append('\n'), "append(...)");
/*     */             this.grazieLog.append("tool_name: " + usage.getName()).append('\n');
/*     */             Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("tool_input: " + usage.getInput()), "append(...)");
/*     */             Intrinsics.checkNotNullExpressionValue(this.grazieLog.append("tool_input: " + usage.getInput()).append('\n'), "append(...)");
/*     */             this.grazieLog.append("tool_input: " + usage.getInput()).append('\n');
/*     */           } 
/*     */         } else {
/*     */           throw new NoWhenBranchMatchedException();
/*     */         } 
/*     */         (matterhornChatElement1 instanceof MatterhornChatMessage) ? this.grazieLog.append(((MatterhornChatMessage)message).getContent()).append('\n') : ((matterhornChatElement1 instanceof MatterhornMultiPartChatMessage) ? Unit.INSTANCE : ((matterhornChatElement1 instanceof MatterhornUserChatMessageWithToolResults) ? Unit.INSTANCE : "JD-Core does not support Kotlin"));
/*     */       } 
/*     */       Unit unit = Unit.INSTANCE;
/*     */     } 
/*     */     if (flushArtifactRequestResponseLog($completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return flushArtifactRequestResponseLog($completion); 
/*     */     flushArtifactRequestResponseLog($completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object flushArtifactRequestResponseLog(@NotNull Continuation $completion) {
/*     */     if (BuildersKt.withContext((CoroutineContext)Dispatchers.getIO(), new ExecutionContext$flushArtifactRequestResponseLog$2(null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return BuildersKt.withContext((CoroutineContext)Dispatchers.getIO(), new ExecutionContext$flushArtifactRequestResponseLog$2(null), $completion); 
/*     */     BuildersKt.withContext((CoroutineContext)Dispatchers.getIO(), new ExecutionContext$flushArtifactRequestResponseLog$2(null), $completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ExecutionContext.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ExecutionContext$flushArtifactRequestResponseLog$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class ExecutionContext$flushArtifactRequestResponseLog$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     ExecutionContext$flushArtifactRequestResponseLog$2(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       String text;
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           Intrinsics.checkNotNullExpressionValue(ExecutionContext.this.grazieLog.toString(), "toString(...)");
/*     */           text = ExecutionContext.this.grazieLog.toString();
/*     */           ExecutionContext.this.getRoot().getService().getCaches().save(CacheType.Logs, ExecutionContext.this.getArtifact().toFileName() + ".log.md", text);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super ExecutionContext$flushArtifactRequestResponseLog$2> $completion) {
/*     */       return (Continuation<Unit>)new ExecutionContext$flushArtifactRequestResponseLog$2($completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((ExecutionContext$flushArtifactRequestResponseLog$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object logTrajectoryElement(@NotNull TrajectoryElement element, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ExecutionContext$logTrajectoryElement$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext$logTrajectoryElement$1
/*     */     //   11: astore #4
/*     */     //   13: aload #4
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #4
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ExecutionContext$logTrajectoryElement$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #4
/*     */     //   50: aload #4
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore_3
/*     */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   59: astore #5
/*     */     //   61: aload #4
/*     */     //   63: getfield label : I
/*     */     //   66: tableswitch default -> 169, 0 -> 88, 1 -> 129
/*     */     //   88: aload_3
/*     */     //   89: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   92: aload_0
/*     */     //   93: getfield root : Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   96: aload_1
/*     */     //   97: aload #4
/*     */     //   99: aload #4
/*     */     //   101: aload_0
/*     */     //   102: putfield L$0 : Ljava/lang/Object;
/*     */     //   105: aload #4
/*     */     //   107: aload_1
/*     */     //   108: putfield L$1 : Ljava/lang/Object;
/*     */     //   111: aload #4
/*     */     //   113: iconst_1
/*     */     //   114: putfield label : I
/*     */     //   117: invokevirtual logTrajectoryElement : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   120: dup
/*     */     //   121: aload #5
/*     */     //   123: if_acmpne -> 152
/*     */     //   126: aload #5
/*     */     //   128: areturn
/*     */     //   129: aload #4
/*     */     //   131: getfield L$1 : Ljava/lang/Object;
/*     */     //   134: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElement
/*     */     //   137: astore_1
/*     */     //   138: aload #4
/*     */     //   140: getfield L$0 : Ljava/lang/Object;
/*     */     //   143: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   146: astore_0
/*     */     //   147: aload_3
/*     */     //   148: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   151: aload_3
/*     */     //   152: pop
/*     */     //   153: aload_0
/*     */     //   154: getfield root : Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   157: invokevirtual getListener : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListenerProxy;
/*     */     //   160: aload_1
/*     */     //   161: aload_0
/*     */     //   162: invokevirtual onTrajectoryElement : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)V
/*     */     //   165: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   168: areturn
/*     */     //   169: new java/lang/IllegalStateException
/*     */     //   172: dup
/*     */     //   173: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   176: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   179: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #402	-> 59
/*     */     //   #403	-> 92
/*     */     //   #402	-> 126
/*     */     //   #404	-> 152
/*     */     //   #405	-> 165
/*     */     //   #402	-> 169
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   92	37	0	this	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   147	22	0	this	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   92	37	1	element	Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;
/*     */     //   138	31	1	element	Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;
/*     */     //   0	180	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	119	4	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   56	113	3	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final <T extends CustomContext> T lookupContext(@NotNull ExecutionContextUserDataKey<T> key) {
/*     */     Intrinsics.checkNotNullParameter(key, "key");
/*     */     Intrinsics.checkNotNull(this.userData.get(key), "null cannot be cast to non-null type T of com.intellij.ml.llm.matterhorn.ExecutionContext.lookupContext");
/*     */     return this.userData.containsKey(key) ? (T)this.userData.get(key) : ((this.parent != null) ? this.parent.<T>lookupContext(key) : this.root.<T>lookupContext(key));
/*     */   }
/*     */   
/*     */   public final <T extends CustomContext> void registerContext(@NotNull ExecutionContextUserDataKey<?> key, @NotNull CustomContext value) {
/*     */     Intrinsics.checkNotNullParameter(key, "key");
/*     */     Intrinsics.checkNotNullParameter(value, "value");
/*     */     this.userData.put(key, value);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final <O> Object dumpSourceCode(@NotNull ArtifactId<O> artifact, @NotNull Continuation $completion) {
/*     */     if (BuildersKt.withContext((CoroutineContext)Dispatchers.getIO(), new ExecutionContext$dumpSourceCode$2(artifact, null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return BuildersKt.withContext((CoroutineContext)Dispatchers.getIO(), new ExecutionContext$dumpSourceCode$2(artifact, null), $completion); 
/*     */     BuildersKt.withContext((CoroutineContext)Dispatchers.getIO(), new ExecutionContext$dumpSourceCode$2(artifact, null), $completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ExecutionContext.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ExecutionContext$dumpSourceCode$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   @SourceDebugExtension({"SMAP\nExecutionContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExecutionContext.kt\ncom/intellij/ml/llm/matterhorn/ExecutionContext$dumpSourceCode$2\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,468:1\n205#2:469\n*S KotlinDebug\n*F\n+ 1 ExecutionContext.kt\ncom/intellij/ml/llm/matterhorn/ExecutionContext$dumpSourceCode$2\n*L\n434#1:469\n*E\n"})
/*     */   static final class ExecutionContext$dumpSourceCode$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     ExecutionContext$dumpSourceCode$2(ArtifactId<O> $artifact, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       String content;
/*     */       Json json;
/*     */       String fileName;
/*     */       Object value$iv;
/*     */       int $i$f$encodeToString;
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           json = (Json)Json.Default;
/*     */           value$iv = ExecutionContext.this.getSource();
/*     */           $i$f$encodeToString = 0;
/*     */           json.getSerializersModule();
/*     */           content = json.encodeToString((SerializationStrategy)BuiltinSerializersKt.getNullable(ProjectFileStructure.Companion.serializer()), value$iv);
/*     */           fileName = this.$artifact.toFileName();
/*     */           ExecutionContext.this.getRoot().getService().getCaches().save(CacheType.Sources, fileName, content);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super ExecutionContext$dumpSourceCode$2> $completion) {
/*     */       return (Continuation<Unit>)new ExecutionContext$dumpSourceCode$2(this.$artifact, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((ExecutionContext$dumpSourceCode$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object dumpArtifactTextRepresentation(@NotNull Artifactual artifact, @NotNull Continuation $completion) {
/*     */     if (BuildersKt.withContext((CoroutineContext)Dispatchers.getIO(), new ExecutionContext$dumpArtifactTextRepresentation$2(artifact, null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return BuildersKt.withContext((CoroutineContext)Dispatchers.getIO(), new ExecutionContext$dumpArtifactTextRepresentation$2(artifact, null), $completion); 
/*     */     BuildersKt.withContext((CoroutineContext)Dispatchers.getIO(), new ExecutionContext$dumpArtifactTextRepresentation$2(artifact, null), $completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ExecutionContext.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ExecutionContext$dumpArtifactTextRepresentation$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class ExecutionContext$dumpArtifactTextRepresentation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     ExecutionContext$dumpArtifactTextRepresentation$2(Artifactual $artifact, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       MatterhornCaches caches;
/*     */       String path, representation;
/*     */       Artifactual artifactual;
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           caches = ExecutionContext.this.getRoot().getService().getCaches();
/*     */           path = this.$artifact.getId().toFileName();
/*     */           artifactual = this.$artifact;
/*     */           if (artifactual instanceof CancelledArtifact) {
/*     */             if (((CancelledArtifact)this.$artifact).getReasoning().getMessage() == null)
/*     */               ((CancelledArtifact)this.$artifact).getReasoning().getMessage(); 
/*     */           } else if (artifactual instanceof UnfinishedArtifact) {
/*     */           
/*     */           } else {
/*     */             throw new NoWhenBranchMatchedException();
/*     */           } 
/*     */           representation = (artifactual instanceof Artifact) ? String.valueOf(((Artifact)this.$artifact).getContent()) : ((artifactual instanceof FailedArtifact) ? ((FailedArtifact)this.$artifact).getReasoning().getReason().getMessage() : "JD-Core does not support Kotlin");
/*     */           if (representation != null)
/*     */             caches.save(CacheType.Presentations, path, representation); 
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super ExecutionContext$dumpArtifactTextRepresentation$2> $completion) {
/*     */       return (Continuation<Unit>)new ExecutionContext$dumpArtifactTextRepresentation$2(this.$artifact, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((ExecutionContext$dumpArtifactTextRepresentation$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ExecutionContext.kt", l = {177}, i = {0}, s = {"L$0"}, n = {"this"}, m = "getArtifact", c = "com.intellij.ml.llm.matterhorn.ExecutionContext")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ExecutionContext$getArtifact$1<O> extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     ExecutionContext$getArtifact$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ExecutionContext.this.getArtifact((ArtifactId<?>)null, (Continuation<? super Artifact<?>>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ExecutionContext.kt", l = {189}, i = {0}, s = {"L$0"}, n = {"this"}, m = "getArtifact", c = "com.intellij.ml.llm.matterhorn.ExecutionContext")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ExecutionContext$getArtifact$3<O> extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     ExecutionContext$getArtifact$3(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ExecutionContext.this.getArtifact((ArtifactType<?>)null, (Continuation<? super Artifact<?>>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ExecutionContext.kt", l = {121}, i = {0}, s = {"L$0"}, n = {"this"}, m = "getOrCreateArtifact", c = "com.intellij.ml.llm.matterhorn.ExecutionContext")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ExecutionContext$getOrCreateArtifact$2<I, O> extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     ExecutionContext$getOrCreateArtifact$2(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ExecutionContext.this.getOrCreateArtifact((ArtifactRequest<?, ?>)null, (ProjectFileStructure)null, (Continuation<? super Artifact<?>>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ExecutionContext.kt", l = {298, 299}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "tools"}, m = "logHeadMessage", c = "com.intellij.ml.llm.matterhorn.ExecutionContext")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ExecutionContext$logHeadMessage$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     ExecutionContext$logHeadMessage$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ExecutionContext.this.logHeadMessage(null, null, (Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ExecutionContext.kt", l = {403}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "element"}, m = "logTrajectoryElement", c = "com.intellij.ml.llm.matterhorn.ExecutionContext")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ExecutionContext$logTrajectoryElement$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     ExecutionContext$logTrajectoryElement$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ExecutionContext.this.logTrajectoryElement(null, (Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ExecutionContext.kt", l = {100}, i = {0, 0}, s = {"L$0", "Z$0"}, n = {"this_$iv", "wasRunning$iv"}, m = "parallelProcess", c = "com.intellij.ml.llm.matterhorn.ExecutionContext")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ExecutionContext$parallelProcess$1<T> extends ContinuationImpl {
/*     */     Object L$0;
/*     */     boolean Z$0;
/*     */     int label;
/*     */     
/*     */     ExecutionContext$parallelProcess$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ExecutionContext.this.parallelProcess(null, null, (Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ExecutionContext.kt", l = {202, 205, 242}, i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "Z$0"}, n = {"this", "chat", "modelParameters", "this", "context", "this_$iv", "wasRunning$iv", "this", "this_$iv", "result", "wasRunning$iv"}, m = "sendToGrazie", c = "com.intellij.ml.llm.matterhorn.ExecutionContext")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ExecutionContext$sendToGrazie$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     boolean Z$0;
/*     */     int label;
/*     */     
/*     */     ExecutionContext$sendToGrazie$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ExecutionContext.this.sendToGrazie((MatterhornChat)null, (ModelParameters)null, (Continuation<? super List<? extends MatterhornChatElement>>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ExecutionContext.kt", l = {276}, i = {0}, s = {"Z$0"}, n = {"allowToolUse"}, m = "sendToGrazie", c = "com.intellij.ml.llm.matterhorn.ExecutionContext")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ExecutionContext$sendToGrazie$3 extends ContinuationImpl {
/*     */     boolean Z$0;
/*     */     int label;
/*     */     
/*     */     ExecutionContext$sendToGrazie$3(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ExecutionContext.this.sendToGrazie((GrazieRequest)null, false, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ExecutionContext.kt", l = {271}, i = {}, s = {}, n = {}, m = "sendToGrazieRaw", c = "com.intellij.ml.llm.matterhorn.ExecutionContext")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ExecutionContext$sendToGrazieRaw$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     ExecutionContext$sendToGrazieRaw$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ExecutionContext.this.sendToGrazieRaw(null, (Continuation<? super MatterhornChatElement>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ExecutionContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */