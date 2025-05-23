/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.configuration.BuildConfigKt;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LLMProxy;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*     */ import com.intellij.openapi.project.ProjectUtil;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import java.nio.file.Path;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Dispatchers;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.StringSerializer;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.json.JsonBuilder;
/*     */ import kotlinx.serialization.json.JsonKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000î\001\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\024\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\004\n\002\020%\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\f\n\002\030\002\n\002\b\005\n\002\020#\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\b\030\000 \0012\0020\001:\004\001\001Bm\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\016\020\b\032\n\022\006\022\004\030\0010\n0\t\022\b\b\002\020\013\032\0020\f\022\006\020\r\032\0020\016\022\006\020\017\032\0020\020\022\"\020\021\032\036\b\001\022\004\022\0020\023\022\n\022\b\022\004\022\0020\f0\024\022\006\022\004\030\0010\0010\022¢\006\004\b\025\020\026J\016\020N\032\0020O2\006\020P\032\0020QJ%\020R\032\004\030\001HS\"\b\b\000\020S*\0020D2\f\020T\032\b\022\004\022\002HS0C¢\006\002\020UJ+\020V\032\0020O\"\b\b\000\020S*\0020D2\f\020T\032\b\022\004\022\002HS0C2\006\020W\032\002HS¢\006\002\020XJ$\020Y\032\004\030\00109\"\004\b\000\020Z2\f\020[\032\b\022\004\022\002HZ08H@¢\006\002\020\\J0\020Y\032\004\030\00109\"\004\b\000\020Z2\f\020]\032\b\022\004\022\002HZ0^2\n\020_\032\006\022\002\b\00308H@¢\006\002\020`J\034\020a\032\004\030\00109\"\004\b\000\020Z2\f\020[\032\b\022\004\022\002HZ08J(\020a\032\004\030\00109\"\004\b\000\020Z2\f\020]\032\b\022\004\022\002HZ0^2\n\020_\032\006\022\002\b\00308J\036\020b\032\0020O2\006\020[\032\002092\f\020c\032\b\022\004\022\002090dH\002J\026\020e\032\0020f2\006\020[\032\002092\006\020g\032\0020\fJ\022\020h\032\0020O2\n\020[\032\006\022\002\b\0030iJ$\020j\032\0020O2\016\020[\032\n\022\002\b\003\022\002\b\0030;2\f\020k\032\b\022\002\b\003\030\00108J&\020l\032\f\022\002\b\003\022\002\b\003\030\0010;\"\004\b\000\020Z2\f\020[\032\b\022\004\022\002HZ08H\002J\"\020j\032\0020O\"\004\b\000\020Z2\f\020[\032\b\022\004\022\002HZ0iH@¢\006\002\020mJ\026\020j\032\0020O2\006\020[\032\0020nH@¢\006\002\020oJ\026\020j\032\0020O2\006\020[\032\0020pH@¢\006\002\020qJ,\020r\032\0020O\"\004\b\000\020Z2\006\020s\032\0020t2\f\020[\032\b\022\004\022\002HZ0i2\006\020u\032\0020\007H\002J \020r\032\0020O2\006\020s\032\0020t2\006\020[\032\0020n2\006\020u\032\0020\007H\002J \020r\032\0020O2\006\020s\032\0020t2\006\020[\032\0020p2\006\020u\032\0020\007H\002J\016\020v\032\0020O2\006\020w\032\0020\007J\b\020x\032\004\030\0010\007J\026\020y\032\0020O2\006\020z\032\0020{H@¢\006\002\020|J)\020}\032\0020O2\006\020~\032\00202\007\020\001\032\0020\0072\007\020\001\032\0020\007H@¢\006\003\020\001J\020\020\001\032\0020OH@¢\006\003\020\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\027\020\030R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\031\020\032R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\033\020\034R\031\020\b\032\n\022\006\022\004\030\0010\n0\t¢\006\b\n\000\032\004\b\035\020\036R\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\037\020 R\021\020\r\032\0020\016¢\006\b\n\000\032\004\b!\020\"R\021\020\017\032\0020\020¢\006\b\n\000\032\004\b#\020$R/\020\021\032\036\b\001\022\004\022\0020\023\022\n\022\b\022\004\022\0020\f0\024\022\006\022\004\030\0010\0010\022¢\006\n\n\002\020'\032\004\b%\020&R\021\020(\032\0020)¢\006\b\n\000\032\004\b*\020+R\035\020,\032\004\030\0010\n8FX\002¢\006\f\n\004\b/\0200\032\004\b-\020.R\021\0201\032\00202¢\006\b\n\000\032\004\b3\0204R\016\0205\032\0020\001X\004¢\006\002\n\000R\036\0206\032\022\022\b\022\006\022\002\b\00308\022\004\022\0020907X\004¢\006\002\n\000R&\020:\032\032\022\b\022\006\022\002\b\00308\022\f\022\n\022\002\b\003\022\002\b\0030;07X\004¢\006\002\n\000R\022\020<\032\0060=j\002`>X\004¢\006\002\n\000R\024\020?\032\b\022\004\022\0020A0@X\004¢\006\002\n\000R \020B\032\024\022\b\022\006\022\002\b\0030C\022\006\022\004\030\0010D07X\004¢\006\002\n\000R\020\020E\032\004\030\0010\007X\016¢\006\002\n\000R\021\020F\032\0020G¢\006\b\n\000\032\004\bH\020IR\021\020J\032\0020K¢\006\b\n\000\032\004\bL\020M¨\006\001"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "", "service", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;", "openAIProxy", "Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;", "name", "", "shellExecutorAccess", "Lkotlin/Function0;", "Lcom/intellij/ml/llm/matterhorn/ShellExecutor;", "loadArtifactsFromDisk", "", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "humanInLoop", "Lcom/intellij/ml/llm/matterhorn/HumanInLoop;", "mustIgnore", "Lkotlin/Function2;", "Ljava/nio/file/Path;", "Lkotlin/coroutines/Continuation;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lcom/intellij/ml/llm/matterhorn/HumanInLoop;Lkotlin/jvm/functions/Function2;)V", "getService", "()Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;", "getOpenAIProxy", "()Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;", "getName", "()Ljava/lang/String;", "getShellExecutorAccess", "()Lkotlin/jvm/functions/Function0;", "getLoadArtifactsFromDisk", "()Z", "getPropertyProvider", "()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "getHumanInLoop", "()Lcom/intellij/ml/llm/matterhorn/HumanInLoop;", "getMustIgnore", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "shellExecutor", "getShellExecutor", "()Lcom/intellij/ml/llm/matterhorn/ShellExecutor;", "shellExecutor$delegate", "Lkotlin/Lazy;", "mediaStorage", "Lcom/intellij/ml/llm/matterhorn/MediaStorage;", "getMediaStorage", "()Lcom/intellij/ml/llm/matterhorn/MediaStorage;", "lock", "artifacts", "", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "Lcom/intellij/ml/llm/matterhorn/Artifactual;", "unfinishedArtifacts", "Lcom/intellij/ml/llm/matterhorn/UnfinishedArtifact;", "trajectoryLog", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "problemLog", "Lcom/intellij/ml/llm/matterhorn/MatterhornCachesJsonLog;", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext$Problem;", "userData", "Lcom/intellij/ml/llm/matterhorn/ExecutionContextUserDataKey;", "Lcom/intellij/ml/llm/matterhorn/CustomContext;", "currentActionName", "projectDir", "Lcom/intellij/openapi/vfs/VirtualFile;", "getProjectDir", "()Lcom/intellij/openapi/vfs/VirtualFile;", "listener", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListenerProxy;", "getListener", "()Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListenerProxy;", "addListener", "", "l", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListener;", "lookupContext", "T", "key", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContextUserDataKey;)Lcom/intellij/ml/llm/matterhorn/CustomContext;", "registerContext", "value", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContextUserDataKey;Lcom/intellij/ml/llm/matterhorn/CustomContext;)V", "lookupArtifact", "O", "artifact", "(Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "type", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "anchor", "(Lcom/intellij/ml/llm/matterhorn/ArtifactType;Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lookupArtifactInCaches", "accumulateDependenciesRecursively", "accumulator", "", "calculateTotalStatistics", "Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;", "recursive", "registerBuiltinArtifact", "Lcom/intellij/ml/llm/matterhorn/Artifact;", "registerArtifact", "currentArtifactId", "lookupUnfinishedArtifact", "(Lcom/intellij/ml/llm/matterhorn/Artifact;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/intellij/ml/llm/matterhorn/FailedArtifact;", "(Lcom/intellij/ml/llm/matterhorn/FailedArtifact;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/intellij/ml/llm/matterhorn/CancelledArtifact;", "(Lcom/intellij/ml/llm/matterhorn/CancelledArtifact;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serializeArtifact", "cache", "Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;", "fileName", "setCurrentActionName", "actionName", "getCurrentActionName", "logTrajectoryElement", "element", "Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;", "(Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logProblem", "severity", "Lcom/intellij/ml/llm/matterhorn/ProblemSeverity;", "context", "message", "(Lcom/intellij/ml/llm/matterhorn/ProblemSeverity;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "Problem", "core"})
/*     */ @SourceDebugExtension({"SMAP\nRootExecutionContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootExecutionContext.kt\ncom/intellij/ml/llm/matterhorn/RootExecutionContext\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,420:1\n14#2:421\n827#3:422\n855#3,2:423\n1863#3,2:425\n1#4:427\n*S KotlinDebug\n*F\n+ 1 RootExecutionContext.kt\ncom/intellij/ml/llm/matterhorn/RootExecutionContext\n*L\n194#1:421\n251#1:422\n251#1:423,2\n251#1:425,2\n*E\n"})
/*     */ public final class RootExecutionContext {
/*     */   @NotNull
/*     */   public final ArtifactRequestExecutorService getService() {
/*     */     return this.service;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final LLMProxy getOpenAIProxy() {
/*     */     return this.openAIProxy;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getName() {
/*     */     return this.name;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Function0<ShellExecutor> getShellExecutorAccess() {
/*     */     return this.shellExecutorAccess;
/*     */   }
/*     */   
/*     */   public final boolean getLoadArtifactsFromDisk() {
/*     */     return this.loadArtifactsFromDisk;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final MatterhornPropertyProvider getPropertyProvider() {
/*     */     return this.propertyProvider;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final HumanInLoop getHumanInLoop() {
/*     */     return this.humanInLoop;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Function2<Path, Continuation<? super Boolean>, Object> getMustIgnore() {
/*     */     return this.mustIgnore;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/RootExecutionContext$Companion;", "", "<init>", "()V", "json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "core"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final Json getJson() {
/*     */       return RootExecutionContext.json;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final ArtifactRequestExecutorService service;
/*     */   @NotNull
/*     */   private final LLMProxy openAIProxy;
/*     */   @NotNull
/*     */   private final String name;
/*     */   @NotNull
/*     */   private final Function0<ShellExecutor> shellExecutorAccess;
/*     */   private final boolean loadArtifactsFromDisk;
/*     */   @NotNull
/*     */   private final MatterhornPropertyProvider propertyProvider;
/*     */   @NotNull
/*     */   private final HumanInLoop humanInLoop;
/*     */   @NotNull
/*     */   private final Function2<Path, Continuation<? super Boolean>, Object> mustIgnore;
/*     */   @NotNull
/*     */   private final CoroutineScope scope;
/*     */   @NotNull
/*     */   private final Lazy shellExecutor$delegate;
/*     */   
/* 122 */   public RootExecutionContext(@NotNull ArtifactRequestExecutorService service, @NotNull LLMProxy openAIProxy, @NotNull String name, @NotNull Function0<ShellExecutor> shellExecutorAccess, boolean loadArtifactsFromDisk, @NotNull MatterhornPropertyProvider propertyProvider, @NotNull HumanInLoop humanInLoop, @NotNull Function2<Path, Continuation<? super Boolean>, Object> mustIgnore) { this.service = service;
/* 123 */     this.openAIProxy = openAIProxy;
/* 124 */     this.name = name;
/* 125 */     this.shellExecutorAccess = shellExecutorAccess;
/* 126 */     this.loadArtifactsFromDisk = loadArtifactsFromDisk;
/* 127 */     this.propertyProvider = propertyProvider;
/* 128 */     this.humanInLoop = humanInLoop;
/* 129 */     this.mustIgnore = mustIgnore;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 136 */     this.scope = CoroutineScopeKt.CoroutineScope((new CoroutineName("Root Junie Context")).plus((CoroutineContext)Dispatchers.getIO()).plus((CoroutineContext)SupervisorKt.SupervisorJob$default(null, 1, null)));
/*     */     
/* 138 */     this.shellExecutor$delegate = LazyKt.lazy(this::shellExecutor_delegate$lambda$0);
/* 139 */     this.mediaStorage = new MatterhornCachesMediaStorage(this.service.getCaches());
/*     */     
/* 141 */     this.lock = new Object();
/* 142 */     this.artifacts = new LinkedHashMap<>();
/* 143 */     this.unfinishedArtifacts = new LinkedHashMap<>();
/* 144 */     this.trajectoryLog = new StringBuilder();
/* 145 */     this.problemLog = new MatterhornCachesJsonLog<>(this.name + "-problems", Problem.Companion.serializer(), this.service.getCaches());
/* 146 */     this.userData = new LinkedHashMap<>();
/*     */ 
/*     */ 
/*     */     
/* 150 */     Intrinsics.checkNotNull(ProjectUtil.guessProjectDir(this.service.getProject())); this.projectDir = ProjectUtil.guessProjectDir(this.service.getProject());
/*     */     
/* 152 */     this.listener = new RootExecutionContextListenerProxy();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 160 */     RootExecutionContextFileLoggingService.Companion.getInstance().attachEventJsonLogger(this); } @NotNull private final MediaStorage mediaStorage; @NotNull private final Object lock; @NotNull private final Map<ArtifactId<?>, Artifactual> artifacts; @NotNull private final Map<ArtifactId<?>, UnfinishedArtifact<?, ?>> unfinishedArtifacts; @NotNull private final StringBuilder trajectoryLog; @NotNull
/*     */   private final MatterhornCachesJsonLog<Problem> problemLog; @NotNull
/*     */   private final Map<ExecutionContextUserDataKey<?>, CustomContext> userData; @Nullable
/*     */   private String currentActionName; @NotNull
/*     */   private final VirtualFile projectDir; @Nullable
/* 165 */   public final <T extends CustomContext> T lookupContext(@NotNull ExecutionContextUserDataKey key) { Intrinsics.checkNotNullParameter(key, "key"); synchronized (this.userData) { int $i$a$-synchronized-RootExecutionContext$lookupContext$1 = 0; CustomContext customContext = 
/* 166 */         this.userData.get(key); }  return (T)customContext; }
/*     */   @NotNull private final RootExecutionContextListenerProxy listener;
/*     */   @NotNull private static final Json json = JsonKt.Json$default(null, RootExecutionContext::json$lambda$29, 1, null);
/*     */   private static final Unit json$lambda$29(JsonBuilder $this$Json) { Intrinsics.checkNotNullParameter($this$Json, "$this$Json"); $this$Json.setEncodeDefaults(true); return Unit.INSTANCE; }
/*     */   @NotNull public final CoroutineScope getScope() { return this.scope; }
/* 171 */   @Nullable public final ShellExecutor getShellExecutor() { Lazy lazy = this.shellExecutor$delegate; return (ShellExecutor)lazy.getValue(); } private static final ShellExecutor shellExecutor_delegate$lambda$0(RootExecutionContext this$0) { return (ShellExecutor)this$0.shellExecutorAccess.invoke(); } @NotNull public final MediaStorage getMediaStorage() { return this.mediaStorage; } @NotNull public final VirtualFile getProjectDir() { return this.projectDir; } @NotNull public final RootExecutionContextListenerProxy getListener() { return this.listener; } public final void addListener(@NotNull RootExecutionContextListener l) { Intrinsics.checkNotNullParameter(l, "l"); l.onContextRegistering(this); this.listener.getListeners().add(l); } public final <T extends CustomContext> void registerContext(@NotNull ExecutionContextUserDataKey<?> key, @NotNull CustomContext value) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(value, "value"); synchronized (this.userData) { int $i$a$-synchronized-RootExecutionContext$registerContext$1 = 0;
/* 172 */       this.userData.put(key, value);
/* 173 */       Unit unit = Unit.INSTANCE; }
/*     */      }
/*     */    @Nullable
/*     */   public final <O> Object lookupArtifact(@NotNull ArtifactId artifact, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/RootExecutionContext$lookupArtifact$1
/*     */     //   4: ifeq -> 41
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext$lookupArtifact$1
/*     */     //   11: astore #12
/*     */     //   13: aload #12
/*     */     //   15: getfield label : I
/*     */     //   18: ldc_w -2147483648
/*     */     //   21: iand
/*     */     //   22: ifeq -> 41
/*     */     //   25: aload #12
/*     */     //   27: dup
/*     */     //   28: getfield label : I
/*     */     //   31: ldc_w -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 52
/*     */     //   41: new com/intellij/ml/llm/matterhorn/RootExecutionContext$lookupArtifact$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload_2
/*     */     //   47: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lkotlin/coroutines/Continuation;)V
/*     */     //   50: astore #12
/*     */     //   52: aload #12
/*     */     //   54: getfield result : Ljava/lang/Object;
/*     */     //   57: astore #11
/*     */     //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   62: astore #13
/*     */     //   64: aload #12
/*     */     //   66: getfield label : I
/*     */     //   69: tableswitch default -> 360, 0 -> 92, 1 -> 170
/*     */     //   92: aload #11
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_0
/*     */     //   98: aload_1
/*     */     //   99: invokevirtual lookupArtifactInCaches : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;)Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   102: astore_3
/*     */     //   103: aload_3
/*     */     //   104: dup
/*     */     //   105: ifnull -> 109
/*     */     //   108: areturn
/*     */     //   109: pop
/*     */     //   110: aload_0
/*     */     //   111: getfield loadArtifactsFromDisk : Z
/*     */     //   114: ifne -> 119
/*     */     //   117: aconst_null
/*     */     //   118: areturn
/*     */     //   119: invokestatic getIO : ()Lkotlinx/coroutines/CoroutineDispatcher;
/*     */     //   122: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   125: new com/intellij/ml/llm/matterhorn/RootExecutionContext$lookupArtifact$artifactText$1
/*     */     //   128: dup
/*     */     //   129: aload_0
/*     */     //   130: aload_1
/*     */     //   131: aconst_null
/*     */     //   132: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lkotlin/coroutines/Continuation;)V
/*     */     //   135: checkcast kotlin/jvm/functions/Function2
/*     */     //   138: aload #12
/*     */     //   140: aload #12
/*     */     //   142: aload_0
/*     */     //   143: putfield L$0 : Ljava/lang/Object;
/*     */     //   146: aload #12
/*     */     //   148: aload_1
/*     */     //   149: putfield L$1 : Ljava/lang/Object;
/*     */     //   152: aload #12
/*     */     //   154: iconst_1
/*     */     //   155: putfield label : I
/*     */     //   158: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   161: dup
/*     */     //   162: aload #13
/*     */     //   164: if_acmpne -> 195
/*     */     //   167: aload #13
/*     */     //   169: areturn
/*     */     //   170: aload #12
/*     */     //   172: getfield L$1 : Ljava/lang/Object;
/*     */     //   175: checkcast com/intellij/ml/llm/matterhorn/ArtifactId
/*     */     //   178: astore_1
/*     */     //   179: aload #12
/*     */     //   181: getfield L$0 : Ljava/lang/Object;
/*     */     //   184: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */     //   187: astore_0
/*     */     //   188: aload #11
/*     */     //   190: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   193: aload #11
/*     */     //   195: checkcast java/lang/String
/*     */     //   198: astore #4
/*     */     //   200: aload #4
/*     */     //   202: ifnull -> 358
/*     */     //   205: nop
/*     */     //   206: new com/intellij/ml/llm/matterhorn/ArtifactualDeserializer
/*     */     //   209: dup
/*     */     //   210: aload_1
/*     */     //   211: invokevirtual getType : ()Lcom/intellij/ml/llm/matterhorn/ArtifactType;
/*     */     //   214: invokevirtual getSerializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   217: invokespecial <init> : (Lkotlinx/serialization/KSerializer;)V
/*     */     //   220: astore #6
/*     */     //   222: getstatic kotlinx/serialization/json/Json.Default : Lkotlinx/serialization/json/Json$Default;
/*     */     //   225: aload #6
/*     */     //   227: checkcast kotlinx/serialization/DeserializationStrategy
/*     */     //   230: aload #4
/*     */     //   232: invokevirtual decodeFromString : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*     */     //   235: areturn
/*     */     //   236: astore #7
/*     */     //   238: nop
/*     */     //   239: getstatic kotlinx/serialization/json/Json.Default : Lkotlinx/serialization/json/Json$Default;
/*     */     //   242: getstatic com/intellij/ml/llm/matterhorn/FailedArtifact.Companion : Lcom/intellij/ml/llm/matterhorn/FailedArtifact$Companion;
/*     */     //   245: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   248: checkcast kotlinx/serialization/DeserializationStrategy
/*     */     //   251: aload #4
/*     */     //   253: invokevirtual decodeFromString : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*     */     //   256: checkcast com/intellij/ml/llm/matterhorn/FailedArtifact
/*     */     //   259: astore #8
/*     */     //   261: goto -> 305
/*     */     //   264: astore #9
/*     */     //   266: iconst_0
/*     */     //   267: istore #10
/*     */     //   269: ldc com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */     //   271: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   274: dup
/*     */     //   275: ldc_w 'getInstance(...)'
/*     */     //   278: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   281: aload #7
/*     */     //   283: checkcast java/lang/Throwable
/*     */     //   286: invokevirtual error : (Ljava/lang/Throwable;)V
/*     */     //   289: getstatic com/intellij/ml/llm/matterhorn/FailedDeserializationArtifactDeserializer.INSTANCE : Lcom/intellij/ml/llm/matterhorn/FailedDeserializationArtifactDeserializer;
/*     */     //   292: aload #4
/*     */     //   294: aload_1
/*     */     //   295: aload #7
/*     */     //   297: checkcast java/lang/Throwable
/*     */     //   300: invokevirtual decodeFromJson : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ArtifactId;Ljava/lang/Throwable;)Lcom/intellij/ml/llm/matterhorn/FailedArtifact;
/*     */     //   303: astore #8
/*     */     //   305: aload #8
/*     */     //   307: astore #5
/*     */     //   309: aload_0
/*     */     //   310: getfield lock : Ljava/lang/Object;
/*     */     //   313: astore #7
/*     */     //   315: aload #7
/*     */     //   317: monitorenter
/*     */     //   318: nop
/*     */     //   319: iconst_0
/*     */     //   320: istore #8
/*     */     //   322: aload_0
/*     */     //   323: getfield artifacts : Ljava/util/Map;
/*     */     //   326: aload_1
/*     */     //   327: aload #5
/*     */     //   329: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   334: pop
/*     */     //   335: nop
/*     */     //   336: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   339: astore #8
/*     */     //   341: aload #7
/*     */     //   343: monitorexit
/*     */     //   344: goto -> 355
/*     */     //   347: astore #8
/*     */     //   349: aload #7
/*     */     //   351: monitorexit
/*     */     //   352: aload #8
/*     */     //   354: athrow
/*     */     //   355: aload #5
/*     */     //   357: areturn
/*     */     //   358: aconst_null
/*     */     //   359: areturn
/*     */     //   360: new java/lang/IllegalStateException
/*     */     //   363: dup
/*     */     //   364: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   367: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   370: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #176	-> 62
/*     */     //   #177	-> 97
/*     */     //   #178	-> 103
/*     */     //   #180	-> 109
/*     */     //   #181	-> 117
/*     */     //   #183	-> 119
/*     */     //   #176	-> 167
/*     */     //   #186	-> 200
/*     */     //   #187	-> 205
/*     */     //   #188	-> 206
/*     */     //   #189	-> 222
/*     */     //   #190	-> 236
/*     */     //   #191	-> 238
/*     */     //   #192	-> 239
/*     */     //   #193	-> 264
/*     */     //   #194	-> 266
/*     */     //   #421	-> 269
/*     */     //   #194	-> 281
/*     */     //   #195	-> 289
/*     */     //   #187	-> 307
/*     */     //   #199	-> 309
/*     */     //   #200	-> 322
/*     */     //   #201	-> 335
/*     */     //   #199	-> 339
/*     */     //   #202	-> 355
/*     */     //   #204	-> 358
/*     */     //   #176	-> 360
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	73	0	this	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   188	48	0	this	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   236	45	0	this	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   281	54	0	this	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   97	73	1	artifact	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   179	57	1	artifact	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   236	45	1	artifact	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   281	54	1	artifact	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   103	6	3	cached	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   200	36	4	artifactText	Ljava/lang/String;
/*     */     //   236	25	4	artifactText	Ljava/lang/String;
/*     */     //   264	17	4	artifactText	Ljava/lang/String;
/*     */     //   281	24	4	artifactText	Ljava/lang/String;
/*     */     //   309	27	5	deserialized	Lcom/intellij/ml/llm/matterhorn/FailedArtifact;
/*     */     //   336	11	5	deserialized	Lcom/intellij/ml/llm/matterhorn/FailedArtifact;
/*     */     //   355	3	5	deserialized	Lcom/intellij/ml/llm/matterhorn/FailedArtifact;
/*     */     //   222	14	6	serializer	Lcom/intellij/ml/llm/matterhorn/ArtifactualDeserializer;
/*     */     //   238	23	7	e	Ljava/lang/Exception;
/*     */     //   264	17	7	e	Ljava/lang/Exception;
/*     */     //   281	24	7	e	Ljava/lang/Exception;
/*     */     //   269	12	10	$i$f$logger	I
/*     */     //   322	14	8	$i$a$-synchronized-RootExecutionContext$lookupArtifact$2	I
/*     */     //   0	371	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   52	308	12	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   59	301	11	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   205	236	236	java/lang/Exception
/*     */     //   238	261	264	java/lang/Throwable
/*     */     //   318	341	347	finally
/*     */     //   347	349	347	finally
/*     */   } @DebugMetadata(f = "RootExecutionContext.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.RootExecutionContext$lookupArtifact$artifactText$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\030\002\020\000\032\004\030\0010\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class RootExecutionContext$lookupArtifact$artifactText$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> { int label; RootExecutionContext$lookupArtifact$artifactText$1(ArtifactId<O> $artifact, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     } public final Object invokeSuspend(Object $result) {
/* 183 */       IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 184 */           return RootExecutionContext.this.getService().getCaches().load(CacheType.Artifact, this.$artifact.toFileName()); }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super RootExecutionContext$lookupArtifact$artifactText$1> $completion) {
/*     */       return (Continuation<Unit>)new RootExecutionContext$lookupArtifact$artifactText$1(this.$artifact, $completion);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((RootExecutionContext$lookupArtifact$artifactText$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final <O> Object lookupArtifact(@NotNull ArtifactType type, @NotNull ArtifactId anchor, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/RootExecutionContext$lookupArtifact$3
/*     */     //   4: ifeq -> 41
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext$lookupArtifact$3
/*     */     //   11: astore #8
/*     */     //   13: aload #8
/*     */     //   15: getfield label : I
/*     */     //   18: ldc_w -2147483648
/*     */     //   21: iand
/*     */     //   22: ifeq -> 41
/*     */     //   25: aload #8
/*     */     //   27: dup
/*     */     //   28: getfield label : I
/*     */     //   31: ldc_w -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 52
/*     */     //   41: new com/intellij/ml/llm/matterhorn/RootExecutionContext$lookupArtifact$3
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload_3
/*     */     //   47: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lkotlin/coroutines/Continuation;)V
/*     */     //   50: astore #8
/*     */     //   52: aload #8
/*     */     //   54: getfield result : Ljava/lang/Object;
/*     */     //   57: astore #7
/*     */     //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   62: astore #9
/*     */     //   64: aload #8
/*     */     //   66: getfield label : I
/*     */     //   69: tableswitch default -> 228, 0 -> 92, 1 -> 167
/*     */     //   92: aload #7
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_2
/*     */     //   98: aload_1
/*     */     //   99: invokevirtual changeType : (Lcom/intellij/ml/llm/matterhorn/ArtifactType;)Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   102: astore #4
/*     */     //   104: aload #4
/*     */     //   106: ifnull -> 226
/*     */     //   109: aload_0
/*     */     //   110: aload #4
/*     */     //   112: invokevirtual lookupArtifactInCaches : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;)Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   115: astore #5
/*     */     //   117: aload #5
/*     */     //   119: ifnull -> 125
/*     */     //   122: aload #5
/*     */     //   124: areturn
/*     */     //   125: aload_0
/*     */     //   126: aload #4
/*     */     //   128: aload #8
/*     */     //   130: aload #8
/*     */     //   132: aload_0
/*     */     //   133: putfield L$0 : Ljava/lang/Object;
/*     */     //   136: aload #8
/*     */     //   138: aload_1
/*     */     //   139: putfield L$1 : Ljava/lang/Object;
/*     */     //   142: aload #8
/*     */     //   144: aload #4
/*     */     //   146: putfield L$2 : Ljava/lang/Object;
/*     */     //   149: aload #8
/*     */     //   151: iconst_1
/*     */     //   152: putfield label : I
/*     */     //   155: invokevirtual lookupArtifact : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   158: dup
/*     */     //   159: aload #9
/*     */     //   161: if_acmpne -> 202
/*     */     //   164: aload #9
/*     */     //   166: areturn
/*     */     //   167: aload #8
/*     */     //   169: getfield L$2 : Ljava/lang/Object;
/*     */     //   172: checkcast com/intellij/ml/llm/matterhorn/ArtifactId
/*     */     //   175: astore #4
/*     */     //   177: aload #8
/*     */     //   179: getfield L$1 : Ljava/lang/Object;
/*     */     //   182: checkcast com/intellij/ml/llm/matterhorn/ArtifactType
/*     */     //   185: astore_1
/*     */     //   186: aload #8
/*     */     //   188: getfield L$0 : Ljava/lang/Object;
/*     */     //   191: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */     //   194: astore_0
/*     */     //   195: aload #7
/*     */     //   197: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   200: aload #7
/*     */     //   202: checkcast com/intellij/ml/llm/matterhorn/Artifactual
/*     */     //   205: astore #6
/*     */     //   207: aload #6
/*     */     //   209: ifnull -> 215
/*     */     //   212: aload #6
/*     */     //   214: areturn
/*     */     //   215: aload #4
/*     */     //   217: aload_1
/*     */     //   218: invokevirtual parentOfType : (Lcom/intellij/ml/llm/matterhorn/ArtifactType;)Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   221: astore #4
/*     */     //   223: goto -> 104
/*     */     //   226: aconst_null
/*     */     //   227: areturn
/*     */     //   228: new java/lang/IllegalStateException
/*     */     //   231: dup
/*     */     //   232: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   235: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   238: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #208	-> 62
/*     */     //   #209	-> 97
/*     */     //   #211	-> 104
/*     */     //   #212	-> 109
/*     */     //   #213	-> 117
/*     */     //   #214	-> 122
/*     */     //   #216	-> 125
/*     */     //   #208	-> 164
/*     */     //   #217	-> 207
/*     */     //   #218	-> 212
/*     */     //   #220	-> 215
/*     */     //   #223	-> 226
/*     */     //   #208	-> 228
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	70	0	this	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   195	33	0	this	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   97	70	1	type	Lcom/intellij/ml/llm/matterhorn/ArtifactType;
/*     */     //   186	42	1	type	Lcom/intellij/ml/llm/matterhorn/ArtifactType;
/*     */     //   97	7	2	anchor	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   104	63	4	relativePath	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   177	51	4	relativePath	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   117	8	5	cached	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   207	16	6	artifact	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   0	239	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   52	176	8	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   59	169	7	$result	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final <O> Artifactual lookupArtifactInCaches(@NotNull ArtifactId artifact) {
/* 228 */     Intrinsics.checkNotNullParameter(artifact, "artifact"); synchronized (this.lock) { int $i$a$-synchronized-RootExecutionContext$lookupArtifactInCaches$1 = 0; return this.artifacts.get(artifact); }
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final <O> Artifactual lookupArtifactInCaches(@NotNull ArtifactType type, @NotNull ArtifactId anchor) {
/* 235 */     Intrinsics.checkNotNullParameter(type, "type"); Intrinsics.checkNotNullParameter(anchor, "anchor"); synchronized (this.lock) { int $i$a$-synchronized-RootExecutionContext$lookupArtifactInCaches$2 = 0;
/* 236 */       ArtifactId relativePath = anchor.changeType(type);
/*     */       
/* 238 */       while (relativePath != null) {
/* 239 */         Artifactual cached = this.artifacts.get(relativePath);
/* 240 */         if (cached != null) {
/* 241 */           return cached;
/*     */         }
/* 243 */         relativePath = relativePath.parentOfType(type);
/*     */       } 
/*     */       return null; }
/*     */   
/*     */   }
/*     */   
/*     */   private final void accumulateDependenciesRecursively(Artifactual artifact, Set accumulator) {
/* 250 */     synchronized (this.lock) { int $i$a$-synchronized-RootExecutionContext$accumulateDependenciesRecursively$1 = 0;
/* 251 */       Iterable<ArtifactDependency> $this$filterNot$iv = artifact.getDependencies(); int $i$f$filterNot = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 422 */       Iterable<ArtifactDependency> iterable1 = $this$filterNot$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterNotTo = 0;
/* 423 */       for (ArtifactDependency element$iv$iv : iterable1) { ArtifactDependency it = element$iv$iv; int $i$a$-filterNot-RootExecutionContext$accumulateDependenciesRecursively$1$1 = 0; if (!it.getCached()) destination$iv$iv.add(element$iv$iv);  }
/* 424 */        $this$filterNot$iv = destination$iv$iv; int $i$f$forEach = 0;
/* 425 */       Iterator<ArtifactDependency> iterator = $this$filterNot$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); ArtifactDependency dependency = (ArtifactDependency)element$iv; int $i$a$-forEach-RootExecutionContext$accumulateDependenciesRecursively$1$2 = 0; Artifactual element = this.artifacts.get(dependency.getArtifact()); }  Unit unit = Unit.INSTANCE; }
/*     */      } @NotNull public final ArtifactStatistic calculateTotalStatistics(@NotNull Artifactual artifact, boolean recursive) { Intrinsics.checkNotNullParameter(artifact, "artifact"); Artifactual[] arrayOfArtifactual = new Artifactual[1]; arrayOfArtifactual[0] = artifact; Set<Artifactual> thisAndDependencies = SetsKt.mutableSetOf((Object[])arrayOfArtifactual); if (recursive)
/* 427 */       accumulateDependenciesRecursively(artifact, thisAndDependencies);  Set<Artifactual> set1 = thisAndDependencies; long l1 = 0L; for (Artifactual artifactual1 : set1) { Artifactual artifactual2 = artifactual1; long l8 = l1; int $i$a$-sumOfLong-RootExecutionContext$calculateTotalStatistics$totalArtifactTime$1 = 0; long l9 = artifactual2.getStatistics().getArtifactTime(); l1 = l8 + l9; }  long totalArtifactTime = l1; Set<Artifactual> set2 = thisAndDependencies; long l2 = 0L; for (Artifactual artifactual1 : set2) { Artifactual artifactual2 = artifactual1; long l8 = l2; int $i$a$-sumOfLong-RootExecutionContext$calculateTotalStatistics$totalModelTime$1 = 0; long l9 = artifactual2.getStatistics().getModelTime(); l2 = l8 + l9; }  long totalModelTime = l2; Set<Artifactual> set3 = thisAndDependencies; long l3 = 0L; for (Artifactual artifactual1 : set3) { Artifactual artifactual2 = artifactual1; long l8 = l3; int $i$a$-sumOfLong-RootExecutionContext$calculateTotalStatistics$totalModelCachedTime$1 = 0; long l9 = artifactual2.getStatistics().getModelCachedTime(); l3 = l8 + l9; }  long totalModelCachedTime = l3; Set<Artifactual> set4 = thisAndDependencies; int i = 0; for (Artifactual artifactual1 : set4) { Artifactual it = artifactual1; int k = i, $i$a$-sumOfInt-RootExecutionContext$calculateTotalStatistics$totalRequests$1 = 0; int m = it.getStatistics().getRequests(); i = k + m; }  int totalRequests = i; Set<Artifactual> set5; int j; Iterator<Artifactual> iterator; for (set5 = thisAndDependencies, j = 0, iterator = set5.iterator(); iterator.hasNext(); ) { Artifactual it = iterator.next(), artifactual1 = it; int k = j, $i$a$-sumOfInt-RootExecutionContext$calculateTotalStatistics$totalCachedRequests$1 = 0; int m = artifactual1.getStatistics().getCachedRequests(); j = k + m; }  int totalCachedRequests = j; Set<Artifactual> set6 = thisAndDependencies; long l4 = 0L; for (Artifactual artifactual1 : set6) { Artifactual artifactual2 = artifactual1; long l8 = l4; int $i$a$-sumOfLong-RootExecutionContext$calculateTotalStatistics$totalInputTokens$1 = 0; long l9 = artifactual2.getStatistics().getInputTokens(); l4 = l8 + l9; }  long totalInputTokens = l4; Set<Artifactual> set7 = thisAndDependencies; long l5 = 0L; for (Artifactual artifactual1 : set7) { Artifactual artifactual2 = artifactual1; long l8 = l5; int $i$a$-sumOfLong-RootExecutionContext$calculateTotalStatistics$totalOutputTokens$1 = 0; long l9 = artifactual2.getStatistics().getOutputTokens(); l5 = l8 + l9; }  long totalOutputTokens = l5; Set<Artifactual> set8 = thisAndDependencies; long l6 = 0L; for (Artifactual artifactual1 : set8) { Artifactual artifactual2 = artifactual1; long l8 = l6; int $i$a$-sumOfLong-RootExecutionContext$calculateTotalStatistics$totalCacheInputTokens$1 = 0; long l9 = artifactual2.getStatistics().getCacheInputTokens(); l6 = l8 + l9; }  long totalCacheInputTokens = l6; Set<Artifactual> set9 = thisAndDependencies; long l7 = 0L; for (Artifactual artifactual1 : set9) { Artifactual artifactual2 = artifactual1; long l8 = l7; int $i$a$-sumOfLong-RootExecutionContext$calculateTotalStatistics$totalCacheOutputTokens$1 = 0; long l9 = artifactual2.getStatistics().getCacheCreateInputTokens(); l7 = l8 + l9; }  long totalCacheOutputTokens = l7; Set<Artifactual> set10 = thisAndDependencies; double d1 = 0.0D; for (Artifactual artifactual1 : set10) { Artifactual artifactual2 = artifactual1; double d3 = d1; int $i$a$-sumOfDouble-RootExecutionContext$calculateTotalStatistics$totalMoney$1 = 0; double d4 = artifactual2.getStatistics().getCost(); d1 = d3 + d4; }  double totalMoney = d1; Set<Artifactual> set11 = thisAndDependencies; double d2 = 0.0D; for (Artifactual artifactual1 : set11) { Artifactual artifactual2 = artifactual1; double d3 = d2; int $i$a$-sumOfDouble-RootExecutionContext$calculateTotalStatistics$totalCachedMoney$1 = 0;
/*     */       double d4 = artifactual2.getStatistics().getCachedCost();
/*     */       d2 = d3 + d4; }
/*     */     
/*     */     double totalCachedMoney = d2;
/*     */     return new ArtifactStatistic(artifact.getStatistics().getTotalArtifactBuildTimeSeconds(), totalArtifactTime, totalModelTime, totalModelCachedTime, totalRequests, totalCachedRequests, totalInputTokens, totalOutputTokens, totalCacheInputTokens, totalCacheOutputTokens, totalMoney, totalCachedMoney); }
/*     */ 
/*     */   
/*     */   public final void registerBuiltinArtifact(@NotNull Artifact<?> artifact) {
/*     */     Intrinsics.checkNotNullParameter(artifact, "artifact");
/*     */     synchronized (this.lock) {
/*     */       int $i$a$-synchronized-RootExecutionContext$registerBuiltinArtifact$1 = 0;
/*     */       this.artifacts.put(artifact.getId(), artifact);
/*     */       Unit unit = Unit.INSTANCE;
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void registerArtifact(@NotNull UnfinishedArtifact<?, ?> artifact, @Nullable ArtifactId<?> currentArtifactId) {
/*     */     Intrinsics.checkNotNullParameter(artifact, "artifact");
/*     */     synchronized (this.lock) {
/*     */       int $i$a$-synchronized-RootExecutionContext$registerArtifact$isUpdate$1 = 0;
/*     */       $i$a$-synchronized-RootExecutionContext$registerArtifact$isUpdate$1 = (this.unfinishedArtifacts.put(artifact.getId(), artifact) != null) ? 1 : 0;
/*     */     } 
/*     */     int i = $i$a$-synchronized-RootExecutionContext$registerArtifact$isUpdate$1;
/*     */     if (i != 0) {
/*     */       this.listener.onUnfinishedArtifactUpdated(artifact);
/*     */     } else {
/*     */       this.listener.onUnfinishedArtifactCreated(artifact, currentArtifactId);
/*     */     } 
/*     */   }
/*     */   
/*     */   private final <O> UnfinishedArtifact<?, ?> lookupUnfinishedArtifact(ArtifactId artifact) {
/*     */     synchronized (this.lock) {
/*     */       int $i$a$-synchronized-RootExecutionContext$lookupUnfinishedArtifact$1 = 0;
/*     */       return this.unfinishedArtifacts.get(artifact);
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final <O> Object registerArtifact(@NotNull Artifact artifact, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/RootExecutionContext$registerArtifact$1
/*     */     //   4: ifeq -> 41
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext$registerArtifact$1
/*     */     //   11: astore #7
/*     */     //   13: aload #7
/*     */     //   15: getfield label : I
/*     */     //   18: ldc_w -2147483648
/*     */     //   21: iand
/*     */     //   22: ifeq -> 41
/*     */     //   25: aload #7
/*     */     //   27: dup
/*     */     //   28: getfield label : I
/*     */     //   31: ldc_w -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 52
/*     */     //   41: new com/intellij/ml/llm/matterhorn/RootExecutionContext$registerArtifact$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload_2
/*     */     //   47: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lkotlin/coroutines/Continuation;)V
/*     */     //   50: astore #7
/*     */     //   52: aload #7
/*     */     //   54: getfield result : Ljava/lang/Object;
/*     */     //   57: astore #6
/*     */     //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   62: astore #8
/*     */     //   64: aload #7
/*     */     //   66: getfield label : I
/*     */     //   69: tableswitch default -> 290, 0 -> 92, 1 -> 252
/*     */     //   92: aload #6
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_0
/*     */     //   98: aload_1
/*     */     //   99: invokevirtual getId : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   102: invokespecial lookupUnfinishedArtifact : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;)Lcom/intellij/ml/llm/matterhorn/UnfinishedArtifact;
/*     */     //   105: ifnull -> 112
/*     */     //   108: iconst_1
/*     */     //   109: goto -> 113
/*     */     //   112: iconst_0
/*     */     //   113: istore_3
/*     */     //   114: getstatic kotlin/_Assertions.ENABLED : Z
/*     */     //   117: ifeq -> 139
/*     */     //   120: iload_3
/*     */     //   121: ifne -> 139
/*     */     //   124: ldc_w 'Assertion failed'
/*     */     //   127: astore #4
/*     */     //   129: new java/lang/AssertionError
/*     */     //   132: dup
/*     */     //   133: aload #4
/*     */     //   135: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   138: athrow
/*     */     //   139: aload_0
/*     */     //   140: getfield lock : Ljava/lang/Object;
/*     */     //   143: astore #4
/*     */     //   145: aload #4
/*     */     //   147: monitorenter
/*     */     //   148: nop
/*     */     //   149: iconst_0
/*     */     //   150: istore #5
/*     */     //   152: aload_0
/*     */     //   153: getfield unfinishedArtifacts : Ljava/util/Map;
/*     */     //   156: aload_1
/*     */     //   157: invokevirtual getId : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   160: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   165: pop
/*     */     //   166: aload_0
/*     */     //   167: getfield artifacts : Ljava/util/Map;
/*     */     //   170: aload_1
/*     */     //   171: invokevirtual getId : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   174: aload_1
/*     */     //   175: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   180: pop
/*     */     //   181: nop
/*     */     //   182: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   185: astore #5
/*     */     //   187: aload #4
/*     */     //   189: monitorexit
/*     */     //   190: goto -> 201
/*     */     //   193: astore #5
/*     */     //   195: aload #4
/*     */     //   197: monitorexit
/*     */     //   198: aload #5
/*     */     //   200: athrow
/*     */     //   201: invokestatic getIO : ()Lkotlinx/coroutines/CoroutineDispatcher;
/*     */     //   204: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   207: new com/intellij/ml/llm/matterhorn/RootExecutionContext$registerArtifact$3
/*     */     //   210: dup
/*     */     //   211: aload_0
/*     */     //   212: aload_1
/*     */     //   213: aconst_null
/*     */     //   214: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lcom/intellij/ml/llm/matterhorn/Artifact;Lkotlin/coroutines/Continuation;)V
/*     */     //   217: checkcast kotlin/jvm/functions/Function2
/*     */     //   220: aload #7
/*     */     //   222: aload #7
/*     */     //   224: aload_0
/*     */     //   225: putfield L$0 : Ljava/lang/Object;
/*     */     //   228: aload #7
/*     */     //   230: aload_1
/*     */     //   231: putfield L$1 : Ljava/lang/Object;
/*     */     //   234: aload #7
/*     */     //   236: iconst_1
/*     */     //   237: putfield label : I
/*     */     //   240: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   243: dup
/*     */     //   244: aload #8
/*     */     //   246: if_acmpne -> 277
/*     */     //   249: aload #8
/*     */     //   251: areturn
/*     */     //   252: aload #7
/*     */     //   254: getfield L$1 : Ljava/lang/Object;
/*     */     //   257: checkcast com/intellij/ml/llm/matterhorn/Artifact
/*     */     //   260: astore_1
/*     */     //   261: aload #7
/*     */     //   263: getfield L$0 : Ljava/lang/Object;
/*     */     //   266: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */     //   269: astore_0
/*     */     //   270: aload #6
/*     */     //   272: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   275: aload #6
/*     */     //   277: pop
/*     */     //   278: aload_0
/*     */     //   279: getfield listener : Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListenerProxy;
/*     */     //   282: aload_1
/*     */     //   283: invokevirtual onArtifactFinished : (Lcom/intellij/ml/llm/matterhorn/Artifact;)V
/*     */     //   286: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   289: areturn
/*     */     //   290: new java/lang/IllegalStateException
/*     */     //   293: dup
/*     */     //   294: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   297: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   300: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #318	-> 62
/*     */     //   #319	-> 97
/*     */     //   #321	-> 139
/*     */     //   #322	-> 152
/*     */     //   #323	-> 166
/*     */     //   #324	-> 181
/*     */     //   #321	-> 185
/*     */     //   #326	-> 201
/*     */     //   #318	-> 249
/*     */     //   #330	-> 277
/*     */     //   #331	-> 286
/*     */     //   #318	-> 290
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	42	0	this	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   139	43	0	this	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   182	11	0	this	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   201	51	0	this	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   270	20	0	this	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   97	42	1	artifact	Lcom/intellij/ml/llm/matterhorn/Artifact;
/*     */     //   139	43	1	artifact	Lcom/intellij/ml/llm/matterhorn/Artifact;
/*     */     //   182	11	1	artifact	Lcom/intellij/ml/llm/matterhorn/Artifact;
/*     */     //   201	51	1	artifact	Lcom/intellij/ml/llm/matterhorn/Artifact;
/*     */     //   261	29	1	artifact	Lcom/intellij/ml/llm/matterhorn/Artifact;
/*     */     //   152	30	5	$i$a$-synchronized-RootExecutionContext$registerArtifact$2	I
/*     */     //   0	301	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   52	238	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   59	231	6	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   148	187	193	finally
/*     */     //   193	195	193	finally
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "RootExecutionContext.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.RootExecutionContext$registerArtifact$3")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class RootExecutionContext$registerArtifact$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     RootExecutionContext$registerArtifact$3(Artifact<O> $artifact, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           RootExecutionContext.this.serializeArtifact(RootExecutionContext.this.getService().getCaches(), this.$artifact, this.$artifact.getId().toFileName());
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super RootExecutionContext$registerArtifact$3> $completion) {
/*     */       return (Continuation<Unit>)new RootExecutionContext$registerArtifact$3(this.$artifact, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((RootExecutionContext$registerArtifact$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object registerArtifact(@NotNull FailedArtifact artifact, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokevirtual getId : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   5: invokespecial lookupUnfinishedArtifact : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;)Lcom/intellij/ml/llm/matterhorn/UnfinishedArtifact;
/*     */     //   8: ifnull -> 15
/*     */     //   11: iconst_1
/*     */     //   12: goto -> 16
/*     */     //   15: iconst_0
/*     */     //   16: istore_3
/*     */     //   17: getstatic kotlin/_Assertions.ENABLED : Z
/*     */     //   20: ifeq -> 42
/*     */     //   23: iload_3
/*     */     //   24: ifne -> 42
/*     */     //   27: ldc_w 'Assertion failed'
/*     */     //   30: astore #4
/*     */     //   32: new java/lang/AssertionError
/*     */     //   35: dup
/*     */     //   36: aload #4
/*     */     //   38: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   41: athrow
/*     */     //   42: aload_0
/*     */     //   43: getfield lock : Ljava/lang/Object;
/*     */     //   46: astore #4
/*     */     //   48: aload #4
/*     */     //   50: monitorenter
/*     */     //   51: nop
/*     */     //   52: iconst_0
/*     */     //   53: istore #5
/*     */     //   55: aload_0
/*     */     //   56: getfield unfinishedArtifacts : Ljava/util/Map;
/*     */     //   59: aload_1
/*     */     //   60: invokevirtual getId : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   63: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   68: pop
/*     */     //   69: aload_0
/*     */     //   70: getfield artifacts : Ljava/util/Map;
/*     */     //   73: aload_1
/*     */     //   74: invokevirtual getId : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   77: aload_1
/*     */     //   78: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   83: pop
/*     */     //   84: nop
/*     */     //   85: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   88: astore #5
/*     */     //   90: aload #4
/*     */     //   92: monitorexit
/*     */     //   93: goto -> 104
/*     */     //   96: astore #5
/*     */     //   98: aload #4
/*     */     //   100: monitorexit
/*     */     //   101: aload #5
/*     */     //   103: athrow
/*     */     //   104: aload_0
/*     */     //   105: getfield listener : Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListenerProxy;
/*     */     //   108: aload_1
/*     */     //   109: invokevirtual onArtifactFailed : (Lcom/intellij/ml/llm/matterhorn/FailedArtifact;)V
/*     */     //   112: aload_0
/*     */     //   113: aload_1
/*     */     //   114: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lcom/intellij/ml/llm/matterhorn/FailedArtifact;)Lkotlin/jvm/functions/Function0;
/*     */     //   119: aload_2
/*     */     //   120: invokestatic writeAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   123: dup
/*     */     //   124: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   127: if_acmpne -> 131
/*     */     //   130: areturn
/*     */     //   131: pop
/*     */     //   132: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   135: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #334	-> 0
/*     */     //   #336	-> 42
/*     */     //   #337	-> 55
/*     */     //   #338	-> 69
/*     */     //   #339	-> 84
/*     */     //   #336	-> 88
/*     */     //   #341	-> 104
/*     */     //   #343	-> 112
/*     */     //   #346	-> 135
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   55	30	5	$i$a$-synchronized-RootExecutionContext$registerArtifact$5	I
/*     */     //   0	136	0	this	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   0	136	1	artifact	Lcom/intellij/ml/llm/matterhorn/FailedArtifact;
/*     */     //   0	136	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   51	90	96	finally
/*     */     //   96	98	96	finally
/*     */   }
/*     */   
/*     */   private static final Unit registerArtifact$lambda$25(RootExecutionContext this$0, FailedArtifact $artifact) {
/*     */     this$0.serializeArtifact(this$0.service.getCaches(), $artifact, $artifact.getId().toFileName());
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object registerArtifact(@NotNull CancelledArtifact artifact, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokevirtual getId : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   5: invokespecial lookupUnfinishedArtifact : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;)Lcom/intellij/ml/llm/matterhorn/UnfinishedArtifact;
/*     */     //   8: ifnull -> 15
/*     */     //   11: iconst_1
/*     */     //   12: goto -> 16
/*     */     //   15: iconst_0
/*     */     //   16: istore_3
/*     */     //   17: getstatic kotlin/_Assertions.ENABLED : Z
/*     */     //   20: ifeq -> 42
/*     */     //   23: iload_3
/*     */     //   24: ifne -> 42
/*     */     //   27: ldc_w 'Assertion failed'
/*     */     //   30: astore #4
/*     */     //   32: new java/lang/AssertionError
/*     */     //   35: dup
/*     */     //   36: aload #4
/*     */     //   38: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   41: athrow
/*     */     //   42: aload_0
/*     */     //   43: getfield lock : Ljava/lang/Object;
/*     */     //   46: astore #4
/*     */     //   48: aload #4
/*     */     //   50: monitorenter
/*     */     //   51: nop
/*     */     //   52: iconst_0
/*     */     //   53: istore #5
/*     */     //   55: aload_0
/*     */     //   56: getfield unfinishedArtifacts : Ljava/util/Map;
/*     */     //   59: aload_1
/*     */     //   60: invokevirtual getId : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   63: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   68: pop
/*     */     //   69: aload_0
/*     */     //   70: getfield artifacts : Ljava/util/Map;
/*     */     //   73: aload_1
/*     */     //   74: invokevirtual getId : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   77: aload_1
/*     */     //   78: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   83: pop
/*     */     //   84: nop
/*     */     //   85: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   88: astore #5
/*     */     //   90: aload #4
/*     */     //   92: monitorexit
/*     */     //   93: goto -> 104
/*     */     //   96: astore #5
/*     */     //   98: aload #4
/*     */     //   100: monitorexit
/*     */     //   101: aload #5
/*     */     //   103: athrow
/*     */     //   104: aload_0
/*     */     //   105: getfield listener : Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListenerProxy;
/*     */     //   108: aload_1
/*     */     //   109: invokevirtual onArtifactCancelled : (Lcom/intellij/ml/llm/matterhorn/CancelledArtifact;)V
/*     */     //   112: aload_0
/*     */     //   113: aload_1
/*     */     //   114: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lcom/intellij/ml/llm/matterhorn/CancelledArtifact;)Lkotlin/jvm/functions/Function0;
/*     */     //   119: aload_2
/*     */     //   120: invokestatic writeAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   123: dup
/*     */     //   124: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   127: if_acmpne -> 131
/*     */     //   130: areturn
/*     */     //   131: pop
/*     */     //   132: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   135: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #349	-> 0
/*     */     //   #351	-> 42
/*     */     //   #352	-> 55
/*     */     //   #353	-> 69
/*     */     //   #354	-> 84
/*     */     //   #351	-> 88
/*     */     //   #356	-> 104
/*     */     //   #358	-> 112
/*     */     //   #361	-> 135
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   55	30	5	$i$a$-synchronized-RootExecutionContext$registerArtifact$8	I
/*     */     //   0	136	0	this	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   0	136	1	artifact	Lcom/intellij/ml/llm/matterhorn/CancelledArtifact;
/*     */     //   0	136	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   51	90	96	finally
/*     */     //   96	98	96	finally
/*     */   }
/*     */   
/*     */   private static final Unit registerArtifact$lambda$27(RootExecutionContext this$0, CancelledArtifact $artifact) {
/*     */     this$0.serializeArtifact(this$0.service.getCaches(), $artifact, $artifact.getId().toFileName());
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private final <O> void serializeArtifact(MatterhornCaches cache, Artifact<?> artifact, String fileName) {
/*     */     ArtifactSerializer serializer = new ArtifactSerializer(artifact.getId().getType().getSerializer());
/*     */     String text = Json.Default.encodeToString((SerializationStrategy)serializer, artifact);
/*     */     cache.save(CacheType.Artifact, fileName, text);
/*     */   }
/*     */   
/*     */   private final void serializeArtifact(MatterhornCaches cache, FailedArtifact artifact, String fileName) {
/*     */     KSerializer<FailedArtifact> serializer = FailedArtifact.Companion.serializer();
/*     */     String text = Json.Default.encodeToString((SerializationStrategy)serializer, artifact);
/*     */     cache.save(CacheType.Artifact, fileName, text);
/*     */   }
/*     */   
/*     */   private final void serializeArtifact(MatterhornCaches cache, CancelledArtifact artifact, String fileName) {
/*     */     KSerializer<CancelledArtifact> serializer = CancelledArtifact.Companion.serializer();
/*     */     String text = Json.Default.encodeToString((SerializationStrategy)serializer, artifact);
/*     */     cache.save(CacheType.Artifact, fileName, text);
/*     */   }
/*     */   
/*     */   public final void setCurrentActionName(@NotNull String actionName) {
/*     */     Intrinsics.checkNotNullParameter(actionName, "actionName");
/*     */     this.currentActionName = actionName;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String getCurrentActionName() {
/*     */     return this.currentActionName;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object logTrajectoryElement(@NotNull TrajectoryElement element, @NotNull Continuation $completion) {
/*     */     if (!BuildConfigKt.getConfig().getSaveCachesOnDisk())
/*     */       return Unit.INSTANCE; 
/*     */     synchronized (this.trajectoryLog) {
/*     */       int $i$a$-synchronized-RootExecutionContext$logTrajectoryElement$2 = 0;
/*     */       String line = LogginUtilsKt.trajectoryElementToString(json, element);
/*     */       Intrinsics.checkNotNullExpressionValue(this.trajectoryLog.append(line), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(this.trajectoryLog.append(line).append('\n'), "append(...)");
/*     */       StringBuilder stringBuilder = this.trajectoryLog.append(line).append('\n');
/*     */     } 
/*     */     if (BuildersKt.withContext((CoroutineContext)Dispatchers.getIO(), new RootExecutionContext$logTrajectoryElement$3(null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return BuildersKt.withContext((CoroutineContext)Dispatchers.getIO(), new RootExecutionContext$logTrajectoryElement$3(null), $completion); 
/*     */     BuildersKt.withContext((CoroutineContext)Dispatchers.getIO(), new RootExecutionContext$logTrajectoryElement$3(null), $completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "RootExecutionContext.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.RootExecutionContext$logTrajectoryElement$3")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class RootExecutionContext$logTrajectoryElement$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     RootExecutionContext$logTrajectoryElement$3(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           Intrinsics.checkNotNullExpressionValue(RootExecutionContext.this.trajectoryLog.toString(), "toString(...)");
/*     */           RootExecutionContext.this.getService().getCaches().save(CacheType.Trajectory, RootExecutionContext.this.getName() + ".jsonl", RootExecutionContext.this.trajectoryLog.toString());
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super RootExecutionContext$logTrajectoryElement$3> $completion) {
/*     */       return (Continuation<Unit>)new RootExecutionContext$logTrajectoryElement$3($completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((RootExecutionContext$logTrajectoryElement$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object logProblem(@NotNull ProblemSeverity severity, @NotNull String context, @NotNull String message, @NotNull Continuation<? super Unit> $completion) {
/*     */     if (!BuildConfigKt.getConfig().getSaveCachesOnDisk())
/*     */       return Unit.INSTANCE; 
/*     */     if (this.problemLog.log(new Problem(System.currentTimeMillis(), severity, context, message), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return this.problemLog.log(new Problem(System.currentTimeMillis(), severity, context, message), $completion); 
/*     */     this.problemLog.log(new Problem(System.currentTimeMillis(), severity, context, message), $completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object close(@NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/RootExecutionContext$close$1
/*     */     //   4: ifeq -> 38
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext$close$1
/*     */     //   11: astore_3
/*     */     //   12: aload_3
/*     */     //   13: getfield label : I
/*     */     //   16: ldc_w -2147483648
/*     */     //   19: iand
/*     */     //   20: ifeq -> 38
/*     */     //   23: aload_3
/*     */     //   24: dup
/*     */     //   25: getfield label : I
/*     */     //   28: ldc_w -2147483648
/*     */     //   31: isub
/*     */     //   32: putfield label : I
/*     */     //   35: goto -> 48
/*     */     //   38: new com/intellij/ml/llm/matterhorn/RootExecutionContext$close$1
/*     */     //   41: dup
/*     */     //   42: aload_0
/*     */     //   43: aload_1
/*     */     //   44: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lkotlin/coroutines/Continuation;)V
/*     */     //   47: astore_3
/*     */     //   48: aload_3
/*     */     //   49: getfield result : Ljava/lang/Object;
/*     */     //   52: astore_2
/*     */     //   53: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   56: astore #4
/*     */     //   58: aload_3
/*     */     //   59: getfield label : I
/*     */     //   62: tableswitch default -> 161, 0 -> 84, 1 -> 129
/*     */     //   84: aload_2
/*     */     //   85: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   88: aload_0
/*     */     //   89: getfield listener : Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListenerProxy;
/*     */     //   92: aload_0
/*     */     //   93: invokevirtual onContextClosed : (Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;)V
/*     */     //   96: aload_0
/*     */     //   97: invokevirtual getShellExecutor : ()Lcom/intellij/ml/llm/matterhorn/ShellExecutor;
/*     */     //   100: dup
/*     */     //   101: ifnull -> 146
/*     */     //   104: aload_3
/*     */     //   105: aload_3
/*     */     //   106: aload_0
/*     */     //   107: putfield L$0 : Ljava/lang/Object;
/*     */     //   110: aload_3
/*     */     //   111: iconst_1
/*     */     //   112: putfield label : I
/*     */     //   115: invokeinterface close : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   120: dup
/*     */     //   121: aload #4
/*     */     //   123: if_acmpne -> 142
/*     */     //   126: aload #4
/*     */     //   128: areturn
/*     */     //   129: aload_3
/*     */     //   130: getfield L$0 : Ljava/lang/Object;
/*     */     //   133: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */     //   136: astore_0
/*     */     //   137: aload_2
/*     */     //   138: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   141: aload_2
/*     */     //   142: pop
/*     */     //   143: goto -> 147
/*     */     //   146: pop
/*     */     //   147: aload_0
/*     */     //   148: getfield scope : Lkotlinx/coroutines/CoroutineScope;
/*     */     //   151: aconst_null
/*     */     //   152: iconst_1
/*     */     //   153: aconst_null
/*     */     //   154: invokestatic cancel$default : (Lkotlinx/coroutines/CoroutineScope;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
/*     */     //   157: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   160: areturn
/*     */     //   161: new java/lang/IllegalStateException
/*     */     //   164: dup
/*     */     //   165: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   168: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   171: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #409	-> 56
/*     */     //   #410	-> 88
/*     */     //   #412	-> 96
/*     */     //   #409	-> 126
/*     */     //   #412	-> 142
/*     */     //   #414	-> 147
/*     */     //   #415	-> 157
/*     */     //   #409	-> 161
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   88	41	0	this	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   137	24	0	this	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   0	172	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   48	113	3	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   53	108	2	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Serializable
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\t\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\t\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\003\030\000  2\0020\001:\002\037 B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\007¢\006\004\b\t\020\nBA\b\020\022\006\020\013\032\0020\f\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\007\022\b\020\r\032\004\030\0010\016¢\006\004\b\t\020\017J%\020\027\032\0020\0302\006\020\031\032\0020\0002\006\020\032\032\0020\0332\006\020\034\032\0020\035H\001¢\006\002\b\036R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\020\020\021R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\022\020\023R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\024\020\025R\021\020\b\032\0020\007¢\006\b\n\000\032\004\b\026\020\025¨\006!"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/RootExecutionContext$Problem;", "", "timestamp", "", "severity", "Lcom/intellij/ml/llm/matterhorn/ProblemSeverity;", "context", "", "message", "<init>", "(JLcom/intellij/ml/llm/matterhorn/ProblemSeverity;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJLcom/intellij/ml/llm/matterhorn/ProblemSeverity;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTimestamp", "()J", "getSeverity", "()Lcom/intellij/ml/llm/matterhorn/ProblemSeverity;", "getContext", "()Ljava/lang/String;", "getMessage", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*     */   private static final class Problem {
/*     */     @NotNull
/*     */     public static final Companion Companion = new Companion(null);
/*     */     private final long timestamp;
/*     */     @NotNull
/*     */     private final ProblemSeverity severity;
/*     */     @NotNull
/*     */     private final String context;
/*     */     @NotNull
/*     */     private final String message;
/*     */     @JvmField
/*     */     @NotNull
/*     */     private static final KSerializer<Object>[] $childSerializers;
/*     */     
/*     */     static {
/*     */       KSerializer[] arrayOfKSerializer = new KSerializer[4];
/*     */       arrayOfKSerializer[0] = null;
/*     */       arrayOfKSerializer[1] = EnumsKt.createSimpleEnumSerializer("com.intellij.ml.llm.matterhorn.ProblemSeverity", (Enum[])ProblemSeverity.values());
/*     */       arrayOfKSerializer[2] = null;
/*     */       arrayOfKSerializer[3] = null;
/*     */       $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */     }
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/RootExecutionContext$Problem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext$Problem;", "core"})
/*     */     public static final class Companion {
/*     */       private Companion() {}
/*     */       
/*     */       @NotNull
/*     */       public final KSerializer<RootExecutionContext.Problem> serializer() {
/*     */         return (KSerializer<RootExecutionContext.Problem>)RootExecutionContext.Problem.$serializer.INSTANCE;
/*     */       }
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String getMessage() {
/*     */       return this.message;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String getContext() {
/*     */       return this.context;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final ProblemSeverity getSeverity() {
/*     */       return this.severity;
/*     */     }
/*     */     
/*     */     public final long getTimestamp() {
/*     */       return this.timestamp;
/*     */     }
/*     */     
/*     */     public Problem(long timestamp, @NotNull ProblemSeverity severity, @NotNull String context, @NotNull String message) {
/*     */       this.timestamp = timestamp;
/*     */       this.severity = severity;
/*     */       this.context = context;
/*     */       this.message = message;
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "RootExecutionContext.kt", l = {412}, i = {0}, s = {"L$0"}, n = {"this"}, m = "close", c = "com.intellij.ml.llm.matterhorn.RootExecutionContext")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class RootExecutionContext$close$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     RootExecutionContext$close$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return RootExecutionContext.this.close((Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "RootExecutionContext.kt", l = {183}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "artifact"}, m = "lookupArtifact", c = "com.intellij.ml.llm.matterhorn.RootExecutionContext")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class RootExecutionContext$lookupArtifact$1<O> extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     RootExecutionContext$lookupArtifact$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return RootExecutionContext.this.lookupArtifact(null, (Continuation<? super Artifactual>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "RootExecutionContext.kt", l = {216}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"this", "type", "relativePath"}, m = "lookupArtifact", c = "com.intellij.ml.llm.matterhorn.RootExecutionContext")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class RootExecutionContext$lookupArtifact$3<O> extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int label;
/*     */     
/*     */     RootExecutionContext$lookupArtifact$3(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return RootExecutionContext.this.lookupArtifact(null, null, (Continuation<? super Artifactual>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "RootExecutionContext.kt", l = {326}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "artifact"}, m = "registerArtifact", c = "com.intellij.ml.llm.matterhorn.RootExecutionContext")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class RootExecutionContext$registerArtifact$1<O> extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     RootExecutionContext$registerArtifact$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return RootExecutionContext.this.registerArtifact((Artifact<?>)null, (Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\RootExecutionContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */