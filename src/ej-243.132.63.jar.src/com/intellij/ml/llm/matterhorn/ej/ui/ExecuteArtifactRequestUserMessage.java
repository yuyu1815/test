/*     */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import com.intellij.ml.llm.matterhorn.Artifact;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequest;
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.MatterhornServiceScope;
/*     */ import com.intellij.ml.llm.matterhorn.ProjectFileStructure;
/*     */ import com.intellij.ml.llm.matterhorn.RootExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.RootExecutionContextListener;
/*     */ import com.intellij.ml.llm.matterhorn.ShellExecutor;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.BlockTerminalShellExecutor;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.BlockTerminalShellExecutorKt;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LLMProxy;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.openapi.wm.ToolWindow;
/*     */ import com.intellij.openapi.wm.ToolWindowManager;
/*     */ import java.nio.file.Path;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.CancellationException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.JobKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000d\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\030\n\002\030\002\n\002\b\002\b\007\030\000 6*\004\b\000\020\001*\004\b\001\020\0022\0020\003:\0016B\001\022\006\020\004\032\0020\005\022\022\020\006\032\016\022\004\022\0028\000\022\004\022\0028\0010\007\022\020\020\b\032\f\022\b\022\006\022\002\b\0030\n0\t\022\b\020\013\032\004\030\0010\f\022\006\020\r\032\0020\016\022\b\b\002\020\017\032\0020\020\022\n\b\002\020\021\032\004\030\0010\022\022\b\b\002\020\023\032\0020\020\022\n\b\002\020\024\032\004\030\0010\025\022#\b\002\020\026\032\035\022\023\022\0210\030¢\006\f\b\031\022\b\b\032\022\004\b\b(\033\022\004\022\0020\0340\027¢\006\004\b\035\020\036J\024\0202\032\b\022\004\022\0028\0010\nH@¢\006\002\0203J\016\0204\032\00205H@¢\006\002\0203R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\037\020 R\035\020\006\032\016\022\004\022\0028\000\022\004\022\0028\0010\007¢\006\b\n\000\032\004\b!\020\"R\033\020\b\032\f\022\b\022\006\022\002\b\0030\n0\t¢\006\b\n\000\032\004\b#\020$R\023\020\013\032\004\030\0010\f¢\006\b\n\000\032\004\b%\020&R\021\020\r\032\0020\016¢\006\b\n\000\032\004\b'\020(R\021\020\017\032\0020\020¢\006\b\n\000\032\004\b)\020*R\023\020\021\032\004\030\0010\022¢\006\b\n\000\032\004\b+\020,R\021\020\023\032\0020\020¢\006\b\n\000\032\004\b-\020*R\023\020\024\032\004\030\0010\025¢\006\b\n\000\032\004\b.\020/R,\020\026\032\035\022\023\022\0210\030¢\006\f\b\031\022\b\b\032\022\004\b\b(\033\022\004\022\0020\0340\027¢\006\b\n\000\032\004\b0\0201¨\0067"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage;", "I", "O", "", "project", "Lcom/intellij/openapi/project/Project;", "request", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;", "builtins", "", "Lcom/intellij/ml/llm/matterhorn/Artifact;", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "currentActionName", "", "initShell", "", "listener", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListener;", "loadArtifactsFromDisk", "proxy", "Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;", "configureContext", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "Lkotlin/ParameterName;", "name", "context", "", "<init>", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Ljava/util/List;Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/String;ZLcom/intellij/ml/llm/matterhorn/RootExecutionContextListener;ZLcom/intellij/ml/llm/matterhorn/llm/LLMProxy;Lkotlin/jvm/functions/Function1;)V", "getProject", "()Lcom/intellij/openapi/project/Project;", "getRequest", "()Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;", "getBuiltins", "()Ljava/util/List;", "getFile", "()Lcom/intellij/openapi/vfs/VirtualFile;", "getCurrentActionName", "()Ljava/lang/String;", "getInitShell", "()Z", "getListener", "()Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListener;", "getLoadArtifactsFromDisk", "getProxy", "()Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;", "getConfigureContext", "()Lkotlin/jvm/functions/Function1;", "executeMessage", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeObsoleteArtifactIfNeeded", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "Companion", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nResolveIssueAgentAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResolveIssueAgentAction.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,197:1\n31#2,2:198\n31#2,2:201\n31#2,2:203\n1#3:200\n*S KotlinDebug\n*F\n+ 1 ResolveIssueAgentAction.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage\n*L\n122#1:198,2\n167#1:201,2\n180#1:203,2\n*E\n"})
/*     */ public final class ExecuteArtifactRequestUserMessage<I, O>
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final ArtifactRequest<I, O> request;
/*     */   @NotNull
/*     */   private final List<Artifact<?>> builtins;
/*     */   @Nullable
/*     */   private final VirtualFile file;
/*     */   @NotNull
/*     */   private final String currentActionName;
/*     */   private final boolean initShell;
/*     */   @Nullable
/*     */   private final RootExecutionContextListener listener;
/*     */   private final boolean loadArtifactsFromDisk;
/*     */   @Nullable
/*     */   private final LLMProxy proxy;
/*     */   @NotNull
/*     */   private final Function1<ExecutionContext, Unit> configureContext;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   @NotNull
/*     */   public final Project getProject() {
/*     */     return this.project;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ArtifactRequest<I, O> getRequest() {
/*     */     return this.request;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<Artifact<?>> getBuiltins() {
/*     */     return this.builtins;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final VirtualFile getFile() {
/*     */     return this.file;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getCurrentActionName() {
/*     */     return this.currentActionName;
/*     */   }
/*     */   
/*     */   public final boolean getInitShell() {
/*     */     return this.initShell;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final RootExecutionContextListener getListener() {
/*     */     return this.listener;
/*     */   }
/*     */   
/*     */   public final boolean getLoadArtifactsFromDisk() {
/*     */     return this.loadArtifactsFromDisk;
/*     */   }
/*     */   
/*     */   public ExecuteArtifactRequestUserMessage(@NotNull Project project, @NotNull ArtifactRequest<I, O> request, @NotNull List<Artifact<?>> builtins, @Nullable VirtualFile file, @NotNull String currentActionName, boolean initShell, @Nullable RootExecutionContextListener listener, boolean loadArtifactsFromDisk, @Nullable LLMProxy proxy, @NotNull Function1<ExecutionContext, Unit> configureContext) {
/* 108 */     this.project = project;
/* 109 */     this.request = request;
/* 110 */     this.builtins = builtins;
/* 111 */     this.file = file;
/* 112 */     this.currentActionName = currentActionName;
/* 113 */     this.initShell = initShell;
/* 114 */     this.listener = listener;
/* 115 */     this.loadArtifactsFromDisk = loadArtifactsFromDisk;
/* 116 */     this.proxy = proxy;
/* 117 */     this.configureContext = configureContext; } @Nullable public final LLMProxy getProxy() { return this.proxy; } @NotNull public final Function1<ExecutionContext, Unit> getConfigureContext() { return this.configureContext; } private static final Unit _init_$lambda$0(ExecutionContext it) { Intrinsics.checkNotNullParameter(it, "it"); return Unit.INSTANCE; }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Object executeMessage(@NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage$executeMessage$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage$executeMessage$1
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
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage$executeMessage$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #11
/*     */     //   50: aload #11
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #10
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #12
/*     */     //   62: aload #11
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 630, 0 -> 104, 1 -> 136, 2 -> 407, 3 -> 496, 4 -> 548, 5 -> 606
/*     */     //   104: aload #10
/*     */     //   106: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   109: aload_0
/*     */     //   110: aload #11
/*     */     //   112: aload #11
/*     */     //   114: aload_0
/*     */     //   115: putfield L$0 : Ljava/lang/Object;
/*     */     //   118: aload #11
/*     */     //   120: iconst_1
/*     */     //   121: putfield label : I
/*     */     //   124: invokespecial removeObsoleteArtifactIfNeeded : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   127: dup
/*     */     //   128: aload #12
/*     */     //   130: if_acmpne -> 152
/*     */     //   133: aload #12
/*     */     //   135: areturn
/*     */     //   136: aload #11
/*     */     //   138: getfield L$0 : Ljava/lang/Object;
/*     */     //   141: checkcast com/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage
/*     */     //   144: astore_0
/*     */     //   145: aload #10
/*     */     //   147: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   150: aload #10
/*     */     //   152: pop
/*     */     //   153: aload_0
/*     */     //   154: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   157: checkcast com/intellij/openapi/components/ComponentManager
/*     */     //   160: astore_3
/*     */     //   161: iconst_0
/*     */     //   162: istore #4
/*     */     //   164: ldc com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   166: astore #5
/*     */     //   168: aload_3
/*     */     //   169: aload #5
/*     */     //   171: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*     */     //   176: dup
/*     */     //   177: ifnonnull -> 188
/*     */     //   180: pop
/*     */     //   181: aload_3
/*     */     //   182: aload #5
/*     */     //   184: invokestatic serviceNotFoundError : (Lcom/intellij/openapi/components/ComponentManager;Ljava/lang/Class;)Ljava/lang/IllegalStateException;
/*     */     //   187: athrow
/*     */     //   188: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   191: astore_2
/*     */     //   192: aload_0
/*     */     //   193: getfield proxy : Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;
/*     */     //   196: dup
/*     */     //   197: ifnonnull -> 208
/*     */     //   200: pop
/*     */     //   201: getstatic com/intellij/ml/llm/matterhorn/core/llm/MatterhornLLMProxyProvider.INSTANCE : Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornLLMProxyProvider;
/*     */     //   204: aload_2
/*     */     //   205: invokevirtual createLLMProxy : (Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;)Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;
/*     */     //   208: astore_3
/*     */     //   209: aload_0
/*     */     //   210: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage;)Lkotlin/jvm/functions/Function0;
/*     */     //   215: astore #4
/*     */     //   217: aload_0
/*     */     //   218: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   221: invokestatic obtainAIIgnoreChecker : (Lcom/intellij/openapi/project/Project;)Lkotlin/jvm/functions/Function1;
/*     */     //   224: astore #5
/*     */     //   226: new com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */     //   229: dup
/*     */     //   230: aload_2
/*     */     //   231: aload_3
/*     */     //   232: aload_0
/*     */     //   233: getfield request : Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   236: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   239: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   242: aload #4
/*     */     //   244: aload_0
/*     */     //   245: getfield loadArtifactsFromDisk : Z
/*     */     //   248: getstatic com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService.Companion : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$Companion;
/*     */     //   251: invokevirtual getInstance : ()Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*     */     //   254: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   257: getstatic com/intellij/ml/llm/matterhorn/HumanInLoop.Companion : Lcom/intellij/ml/llm/matterhorn/HumanInLoop$Companion;
/*     */     //   260: invokevirtual getALLOW_ALL : ()Lcom/intellij/ml/llm/matterhorn/HumanInLoop;
/*     */     //   263: new com/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage$executeMessage$context$1
/*     */     //   266: dup
/*     */     //   267: aload #5
/*     */     //   269: aconst_null
/*     */     //   270: invokespecial <init> : (Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
/*     */     //   273: checkcast kotlin/jvm/functions/Function2
/*     */     //   276: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lcom/intellij/ml/llm/matterhorn/HumanInLoop;Lkotlin/jvm/functions/Function2;)V
/*     */     //   279: astore #6
/*     */     //   281: nop
/*     */     //   282: aload #6
/*     */     //   284: aload_0
/*     */     //   285: getfield currentActionName : Ljava/lang/String;
/*     */     //   288: invokevirtual setCurrentActionName : (Ljava/lang/String;)V
/*     */     //   291: aload_0
/*     */     //   292: getfield listener : Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListener;
/*     */     //   295: dup
/*     */     //   296: ifnull -> 316
/*     */     //   299: pop
/*     */     //   300: iconst_0
/*     */     //   301: istore #9
/*     */     //   303: aload #6
/*     */     //   305: aload_0
/*     */     //   306: getfield listener : Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListener;
/*     */     //   309: invokevirtual addListener : (Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListener;)V
/*     */     //   312: nop
/*     */     //   313: goto -> 318
/*     */     //   316: pop
/*     */     //   317: nop
/*     */     //   318: aload_0
/*     */     //   319: getfield builtins : Ljava/util/List;
/*     */     //   322: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   327: astore #7
/*     */     //   329: aload #7
/*     */     //   331: invokeinterface hasNext : ()Z
/*     */     //   336: ifeq -> 361
/*     */     //   339: aload #7
/*     */     //   341: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   346: checkcast com/intellij/ml/llm/matterhorn/Artifact
/*     */     //   349: astore #8
/*     */     //   351: aload #6
/*     */     //   353: aload #8
/*     */     //   355: invokevirtual registerBuiltinArtifact : (Lcom/intellij/ml/llm/matterhorn/Artifact;)V
/*     */     //   358: goto -> 329
/*     */     //   361: getstatic com/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage.Companion : Lcom/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage$Companion;
/*     */     //   364: aload_0
/*     */     //   365: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   368: aload_0
/*     */     //   369: getfield file : Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   372: aload #6
/*     */     //   374: aload #11
/*     */     //   376: aload #11
/*     */     //   378: aload_0
/*     */     //   379: putfield L$0 : Ljava/lang/Object;
/*     */     //   382: aload #11
/*     */     //   384: aload #6
/*     */     //   386: putfield L$1 : Ljava/lang/Object;
/*     */     //   389: aload #11
/*     */     //   391: iconst_2
/*     */     //   392: putfield label : I
/*     */     //   395: invokevirtual resetToolWindow : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/vfs/VirtualFile;Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   398: dup
/*     */     //   399: aload #12
/*     */     //   401: if_acmpne -> 434
/*     */     //   404: aload #12
/*     */     //   406: areturn
/*     */     //   407: aload #11
/*     */     //   409: getfield L$1 : Ljava/lang/Object;
/*     */     //   412: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */     //   415: astore #6
/*     */     //   417: aload #11
/*     */     //   419: getfield L$0 : Ljava/lang/Object;
/*     */     //   422: checkcast com/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage
/*     */     //   425: astore_0
/*     */     //   426: nop
/*     */     //   427: aload #10
/*     */     //   429: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   432: aload #10
/*     */     //   434: pop
/*     */     //   435: aload_0
/*     */     //   436: getfield request : Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   439: astore #7
/*     */     //   441: invokestatic getDefault : ()Lkotlinx/coroutines/CoroutineDispatcher;
/*     */     //   444: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   447: new com/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage$executeMessage$3
/*     */     //   450: dup
/*     */     //   451: aload #6
/*     */     //   453: aload #7
/*     */     //   455: aload_0
/*     */     //   456: aconst_null
/*     */     //   457: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage;Lkotlin/coroutines/Continuation;)V
/*     */     //   460: checkcast kotlin/jvm/functions/Function2
/*     */     //   463: aload #11
/*     */     //   465: aload #11
/*     */     //   467: aload #6
/*     */     //   469: putfield L$0 : Ljava/lang/Object;
/*     */     //   472: aload #11
/*     */     //   474: aconst_null
/*     */     //   475: putfield L$1 : Ljava/lang/Object;
/*     */     //   478: aload #11
/*     */     //   480: iconst_3
/*     */     //   481: putfield label : I
/*     */     //   484: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   487: dup
/*     */     //   488: aload #12
/*     */     //   490: if_acmpne -> 514
/*     */     //   493: aload #12
/*     */     //   495: areturn
/*     */     //   496: aload #11
/*     */     //   498: getfield L$0 : Ljava/lang/Object;
/*     */     //   501: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */     //   504: astore #6
/*     */     //   506: nop
/*     */     //   507: aload #10
/*     */     //   509: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   512: aload #10
/*     */     //   514: checkcast com/intellij/ml/llm/matterhorn/Artifact
/*     */     //   517: astore #7
/*     */     //   519: aload #6
/*     */     //   521: aload #11
/*     */     //   523: aload #11
/*     */     //   525: aload #7
/*     */     //   527: putfield L$0 : Ljava/lang/Object;
/*     */     //   530: aload #11
/*     */     //   532: iconst_4
/*     */     //   533: putfield label : I
/*     */     //   536: invokevirtual close : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   539: dup
/*     */     //   540: aload #12
/*     */     //   542: if_acmpne -> 565
/*     */     //   545: aload #12
/*     */     //   547: areturn
/*     */     //   548: aload #11
/*     */     //   550: getfield L$0 : Ljava/lang/Object;
/*     */     //   553: checkcast com/intellij/ml/llm/matterhorn/Artifact
/*     */     //   556: astore #7
/*     */     //   558: aload #10
/*     */     //   560: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   563: aload #10
/*     */     //   565: pop
/*     */     //   566: goto -> 627
/*     */     //   569: astore #8
/*     */     //   571: aload #6
/*     */     //   573: aload #11
/*     */     //   575: aload #11
/*     */     //   577: aload #8
/*     */     //   579: putfield L$0 : Ljava/lang/Object;
/*     */     //   582: aload #11
/*     */     //   584: aconst_null
/*     */     //   585: putfield L$1 : Ljava/lang/Object;
/*     */     //   588: aload #11
/*     */     //   590: iconst_5
/*     */     //   591: putfield label : I
/*     */     //   594: invokevirtual close : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   597: dup
/*     */     //   598: aload #12
/*     */     //   600: if_acmpne -> 623
/*     */     //   603: aload #12
/*     */     //   605: areturn
/*     */     //   606: aload #11
/*     */     //   608: getfield L$0 : Ljava/lang/Object;
/*     */     //   611: checkcast java/lang/Throwable
/*     */     //   614: astore #8
/*     */     //   616: aload #10
/*     */     //   618: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   621: aload #10
/*     */     //   623: pop
/*     */     //   624: aload #8
/*     */     //   626: athrow
/*     */     //   627: aload #7
/*     */     //   629: areturn
/*     */     //   630: new java/lang/IllegalStateException
/*     */     //   633: dup
/*     */     //   634: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   637: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   640: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #119	-> 60
/*     */     //   #120	-> 109
/*     */     //   #119	-> 133
/*     */     //   #122	-> 152
/*     */     //   #198	-> 164
/*     */     //   #199	-> 168
/*     */     //   #122	-> 188
/*     */     //   #123	-> 192
/*     */     //   #124	-> 209
/*     */     //   #125	-> 217
/*     */     //   #126	-> 226
/*     */     //   #127	-> 230
/*     */     //   #128	-> 231
/*     */     //   #129	-> 232
/*     */     //   #130	-> 242
/*     */     //   #131	-> 244
/*     */     //   #132	-> 248
/*     */     //   #133	-> 257
/*     */     //   #126	-> 263
/*     */     //   #136	-> 281
/*     */     //   #137	-> 282
/*     */     //   #138	-> 291
/*     */     //   #200	-> 300
/*     */     //   #138	-> 303
/*     */     //   #138	-> 312
/*     */     //   #138	-> 316
/*     */     //   #140	-> 318
/*     */     //   #141	-> 351
/*     */     //   #143	-> 361
/*     */     //   #119	-> 404
/*     */     //   #145	-> 434
/*     */     //   #146	-> 441
/*     */     //   #119	-> 493
/*     */     //   #162	-> 514
/*     */     //   #119	-> 545
/*     */     //   #163	-> 565
/*     */     //   #162	-> 569
/*     */     //   #119	-> 603
/*     */     //   #136	-> 623
/*     */     //   #119	-> 630
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   109	27	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage;
/*     */     //   145	43	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage;
/*     */     //   188	124	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage;
/*     */     //   312	1	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage;
/*     */     //   313	94	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage;
/*     */     //   426	61	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage;
/*     */     //   192	39	2	service	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   161	27	3	$this$service$iv	Lcom/intellij/openapi/components/ComponentManager;
/*     */     //   209	23	3	llmProxy	Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;
/*     */     //   217	27	4	executor	Lkotlin/jvm/functions/Function0;
/*     */     //   168	20	5	serviceClass$iv	Ljava/lang/Class;
/*     */     //   226	55	5	checker	Lkotlin/jvm/functions/Function1;
/*     */     //   281	31	6	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   312	1	6	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   313	94	6	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   417	79	6	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   506	33	6	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   569	28	6	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   441	46	7	request	Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   351	7	8	builtin	Lcom/intellij/ml/llm/matterhorn/Artifact;
/*     */     //   164	24	4	$i$f$service	I
/*     */     //   303	9	9	$i$a$-let-ExecuteArtifactRequestUserMessage$executeMessage$2	I
/*     */     //   0	641	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	580	11	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	573	10	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   281	398	569	finally
/*     */     //   426	487	569	finally
/*     */     //   506	519	569	finally
/*     */     //   569	571	569	finally
/*     */   }
/* 124 */   private static final BlockTerminalShellExecutor executeMessage$lambda$1(ExecuteArtifactRequestUserMessage this$0) { return this$0.initShell ? BlockTerminalShellExecutorKt.launchBlockTerminalShellExecutor$default(MatterhornServiceScope.Companion.getScope(this$0.project), this$0.project, null, null, 12, null) : null; } @DebugMetadata(f = "ResolveIssueAgentAction.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.ExecuteArtifactRequestUserMessage$executeMessage$context$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\013\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", "Ljava/nio/file/Path;"})
/*     */   static final class ExecuteArtifactRequestUserMessage$executeMessage$context$1 extends SuspendLambda implements Function2<Path, Continuation<? super Boolean>, Object> { int label; ExecuteArtifactRequestUserMessage$executeMessage$context$1(Function1<Path, Boolean> $checker, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     } public final Continuation<Unit> create(Object value, Continuation<? super ExecuteArtifactRequestUserMessage$executeMessage$context$1> $completion) {
/*     */       ExecuteArtifactRequestUserMessage$executeMessage$context$1 executeArtifactRequestUserMessage$executeMessage$context$1 = new ExecuteArtifactRequestUserMessage$executeMessage$context$1(this.$checker, $completion);
/*     */       executeArtifactRequestUserMessage$executeMessage$context$1.L$0 = value;
/*     */       return (Continuation<Unit>)executeArtifactRequestUserMessage$executeMessage$context$1;
/*     */     } public final Object invokeSuspend(Object $result) {
/*     */       Path it;
/* 134 */       IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (Path)this.L$0; return this.$checker.invoke(it); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     public final Object invoke(Path p1, Continuation<?> p2) {
/*     */       return ((ExecuteArtifactRequestUserMessage$executeMessage$context$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     } }
/*     */   @DebugMetadata(f = "ResolveIssueAgentAction.kt", l = {151}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.ExecuteArtifactRequestUserMessage$executeMessage$3")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\000\n\002\030\002\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\0020\003H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/Artifact;", "O", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class ExecuteArtifactRequestUserMessage$executeMessage$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Artifact<O>>, Object> { int label;
/*     */     ExecuteArtifactRequestUserMessage$executeMessage$3(ArtifactRequest<I, O> $request, ExecuteArtifactRequestUserMessage<I, O> $receiver, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     public final Object invokeSuspend(Object $result) {
/* 146 */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           try {
/* 148 */             ProjectFileStructure source = new ProjectFileStructure();
/* 149 */             ExecutionContext executionContext = new ExecutionContext(this.$context, null, this.$request, source, null, 16, null);
/* 150 */             ExecuteArtifactRequestUserMessage.this.getConfigureContext().invoke(executionContext);
/* 151 */             this.label = 1; if (executionContext.getOrCreateArtifact(this.$request, source, (Continuation)this) == object) return object;  return executionContext.getOrCreateArtifact(this.$request, source, (Continuation)this);
/* 152 */           } catch (CancellationException e) {
/* 153 */             this.$context.getListener().onCancellation(e);
/* 154 */             throw e;
/* 155 */           } catch (Exception e) {
/* 156 */             this.$context.getListener().onException(e, this.$request.getArtifact());
/* 157 */             throw e;
/*     */           } 
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super ExecuteArtifactRequestUserMessage$executeMessage$3> $completion) {
/*     */       return (Continuation<Unit>)new ExecuteArtifactRequestUserMessage$executeMessage$3(this.$request, ExecuteArtifactRequestUserMessage.this, $completion);
/*     */     }
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((ExecuteArtifactRequestUserMessage$executeMessage$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     } }
/*     */   private final Object removeObsoleteArtifactIfNeeded(Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage$removeObsoleteArtifactIfNeeded$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage$removeObsoleteArtifactIfNeeded$1
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
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage$removeObsoleteArtifactIfNeeded$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #10
/*     */     //   50: aload #10
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #9
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #11
/*     */     //   62: aload #10
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 350, 0 -> 88, 1 -> 248
/*     */     //   88: aload #9
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   97: checkcast com/intellij/openapi/components/ComponentManager
/*     */     //   100: astore_3
/*     */     //   101: iconst_0
/*     */     //   102: istore #4
/*     */     //   104: ldc com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   106: astore #5
/*     */     //   108: aload_3
/*     */     //   109: aload #5
/*     */     //   111: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*     */     //   116: dup
/*     */     //   117: ifnonnull -> 128
/*     */     //   120: pop
/*     */     //   121: aload_3
/*     */     //   122: aload #5
/*     */     //   124: invokestatic serviceNotFoundError : (Lcom/intellij/openapi/components/ComponentManager;Ljava/lang/Class;)Ljava/lang/IllegalStateException;
/*     */     //   127: athrow
/*     */     //   128: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   131: astore_2
/*     */     //   132: aload_0
/*     */     //   133: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   136: invokestatic obtainAIIgnoreChecker : (Lcom/intellij/openapi/project/Project;)Lkotlin/jvm/functions/Function1;
/*     */     //   139: astore_3
/*     */     //   140: new com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */     //   143: dup
/*     */     //   144: aload_2
/*     */     //   145: new com/intellij/ml/llm/matterhorn/llm/EmptyLLMProxy
/*     */     //   148: dup
/*     */     //   149: invokespecial <init> : ()V
/*     */     //   152: checkcast com/intellij/ml/llm/matterhorn/llm/LLMProxy
/*     */     //   155: aload_0
/*     */     //   156: getfield request : Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   159: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   162: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   165: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function0;
/*     */     //   170: iconst_0
/*     */     //   171: getstatic com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService.Companion : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$Companion;
/*     */     //   174: invokevirtual getInstance : ()Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*     */     //   177: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   180: getstatic com/intellij/ml/llm/matterhorn/HumanInLoop.Companion : Lcom/intellij/ml/llm/matterhorn/HumanInLoop$Companion;
/*     */     //   183: invokevirtual getALLOW_ALL : ()Lcom/intellij/ml/llm/matterhorn/HumanInLoop;
/*     */     //   186: new com/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage$removeObsoleteArtifactIfNeeded$context$2
/*     */     //   189: dup
/*     */     //   190: aload_3
/*     */     //   191: aconst_null
/*     */     //   192: invokespecial <init> : (Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
/*     */     //   195: checkcast kotlin/jvm/functions/Function2
/*     */     //   198: bipush #16
/*     */     //   200: aconst_null
/*     */     //   201: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lcom/intellij/ml/llm/matterhorn/HumanInLoop;Lkotlin/jvm/functions/Function2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   204: astore #4
/*     */     //   206: aload #4
/*     */     //   208: aload_0
/*     */     //   209: getfield request : Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   212: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   215: aload #10
/*     */     //   217: aload #10
/*     */     //   219: aload_0
/*     */     //   220: putfield L$0 : Ljava/lang/Object;
/*     */     //   223: aload #10
/*     */     //   225: aload #4
/*     */     //   227: putfield L$1 : Ljava/lang/Object;
/*     */     //   230: aload #10
/*     */     //   232: iconst_1
/*     */     //   233: putfield label : I
/*     */     //   236: invokevirtual lookupArtifact : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   239: dup
/*     */     //   240: aload #11
/*     */     //   242: if_acmpne -> 274
/*     */     //   245: aload #11
/*     */     //   247: areturn
/*     */     //   248: aload #10
/*     */     //   250: getfield L$1 : Ljava/lang/Object;
/*     */     //   253: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */     //   256: astore #4
/*     */     //   258: aload #10
/*     */     //   260: getfield L$0 : Ljava/lang/Object;
/*     */     //   263: checkcast com/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage
/*     */     //   266: astore_0
/*     */     //   267: aload #9
/*     */     //   269: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   272: aload #9
/*     */     //   274: ifnull -> 347
/*     */     //   277: aload_0
/*     */     //   278: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   281: checkcast com/intellij/openapi/components/ComponentManager
/*     */     //   284: astore #6
/*     */     //   286: iconst_0
/*     */     //   287: istore #7
/*     */     //   289: ldc com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   291: astore #8
/*     */     //   293: aload #6
/*     */     //   295: aload #8
/*     */     //   297: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*     */     //   302: dup
/*     */     //   303: ifnonnull -> 315
/*     */     //   306: pop
/*     */     //   307: aload #6
/*     */     //   309: aload #8
/*     */     //   311: invokestatic serviceNotFoundError : (Lcom/intellij/openapi/components/ComponentManager;Ljava/lang/Class;)Ljava/lang/IllegalStateException;
/*     */     //   314: athrow
/*     */     //   315: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   318: invokevirtual getCaches : ()Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;
/*     */     //   321: astore #5
/*     */     //   323: aload_0
/*     */     //   324: getfield request : Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   327: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   330: invokevirtual toFileName : ()Ljava/lang/String;
/*     */     //   333: astore #6
/*     */     //   335: aload #5
/*     */     //   337: getstatic com/intellij/ml/llm/matterhorn/CacheType.Artifact : Lcom/intellij/ml/llm/matterhorn/CacheType;
/*     */     //   340: aload #6
/*     */     //   342: invokeinterface remove : (Lcom/intellij/ml/llm/matterhorn/CacheType;Ljava/lang/String;)V
/*     */     //   347: aload #4
/*     */     //   349: areturn
/*     */     //   350: new java/lang/IllegalStateException
/*     */     //   353: dup
/*     */     //   354: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   357: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   360: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #166	-> 60
/*     */     //   #167	-> 93
/*     */     //   #201	-> 104
/*     */     //   #202	-> 108
/*     */     //   #167	-> 128
/*     */     //   #169	-> 132
/*     */     //   #170	-> 140
/*     */     //   #171	-> 144
/*     */     //   #172	-> 145
/*     */     //   #173	-> 155
/*     */     //   #170	-> 170
/*     */     //   #175	-> 171
/*     */     //   #176	-> 180
/*     */     //   #170	-> 186
/*     */     //   #179	-> 206
/*     */     //   #166	-> 245
/*     */     //   #179	-> 274
/*     */     //   #180	-> 277
/*     */     //   #203	-> 289
/*     */     //   #204	-> 293
/*     */     //   #180	-> 318
/*     */     //   #181	-> 323
/*     */     //   #182	-> 335
/*     */     //   #184	-> 347
/*     */     //   #166	-> 350
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	155	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage;
/*     */     //   267	48	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage;
/*     */     //   315	20	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage;
/*     */     //   132	13	2	service	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   101	27	3	$this$service$iv	Lcom/intellij/openapi/components/ComponentManager;
/*     */     //   140	66	3	checker	Lkotlin/jvm/functions/Function1;
/*     */     //   206	42	4	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   258	57	4	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   315	35	4	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   108	20	5	serviceClass$iv	Ljava/lang/Class;
/*     */     //   323	24	5	cache	Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;
/*     */     //   286	29	6	$this$service$iv	Lcom/intellij/openapi/components/ComponentManager;
/*     */     //   335	12	6	fileName	Ljava/lang/String;
/*     */     //   293	22	8	serviceClass$iv	Ljava/lang/Class;
/*     */     //   104	24	4	$i$f$service	I
/*     */     //   289	26	7	$i$f$service	I
/*     */     //   0	361	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	300	10	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	293	9	$result	Ljava/lang/Object;
/*     */   }
/* 174 */   private static final ShellExecutor removeObsoleteArtifactIfNeeded$lambda$3() { return null; } @DebugMetadata(f = "ResolveIssueAgentAction.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.ExecuteArtifactRequestUserMessage$removeObsoleteArtifactIfNeeded$context$2") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\013\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", "Ljava/nio/file/Path;"})
/*     */   static final class ExecuteArtifactRequestUserMessage$removeObsoleteArtifactIfNeeded$context$2 extends SuspendLambda implements Function2<Path, Continuation<? super Boolean>, Object> { int label; ExecuteArtifactRequestUserMessage$removeObsoleteArtifactIfNeeded$context$2(Function1<Path, Boolean> $checker, Continuation $completion) { super(2, $completion); }
/*     */     public final Object invokeSuspend(Object $result) { Path it;
/* 177 */       IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (Path)this.L$0; return this.$checker.invoke(it); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */      public final Continuation<Unit> create(Object value, Continuation<? super ExecuteArtifactRequestUserMessage$removeObsoleteArtifactIfNeeded$context$2> $completion) {
/*     */       ExecuteArtifactRequestUserMessage$removeObsoleteArtifactIfNeeded$context$2 executeArtifactRequestUserMessage$removeObsoleteArtifactIfNeeded$context$2 = new ExecuteArtifactRequestUserMessage$removeObsoleteArtifactIfNeeded$context$2(this.$checker, $completion);
/*     */       executeArtifactRequestUserMessage$removeObsoleteArtifactIfNeeded$context$2.L$0 = value;
/*     */       return (Continuation<Unit>)executeArtifactRequestUserMessage$removeObsoleteArtifactIfNeeded$context$2;
/*     */     } public final Object invoke(Path p1, Continuation<?> p2) {
/*     */       return ((ExecuteArtifactRequestUserMessage$removeObsoleteArtifactIfNeeded$context$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     } }
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J(\020\004\032\0020\0052\006\020\006\032\0020\0072\b\020\b\032\004\030\0010\t2\006\020\n\032\0020\013H@¢\006\002\020\f¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/ExecuteArtifactRequestUserMessage$Companion;", "", "<init>", "()V", "resetToolWindow", "", "project", "Lcom/intellij/openapi/project/Project;", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "context", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/vfs/VirtualFile;Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-ui"})
/*     */   public static final class Companion { private Companion() {}
/*     */     @Nullable
/*     */     public final Object resetToolWindow(@NotNull Project project, @Nullable VirtualFile file, @NotNull RootExecutionContext context, @NotNull Continuation $completion) {
/* 189 */       ToolWindow toolWindow = ToolWindowManager.Companion.getInstance(project).getToolWindow("Matterhorn");
/* 190 */       if (toolWindow != null) {
/* 191 */         MatterhornToolWindowPanel toolWindowPanel = (MatterhornToolWindowPanel)toolWindow.getContentManager().getContents()[0].getUserData(MatterhornToolWindowFactoryKt.getMATTERHORN_KEY());
/* 192 */         if (toolWindowPanel != null) { toolWindowPanel.updatePanel(context, JobKt.getJob($completion.getContext()), file); } else {  }
/*     */       
/* 194 */       }  return Unit.INSTANCE;
/*     */     } }
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "ResolveIssueAgentAction.kt", l = {120, 143, 146, 162, 162}, i = {0, 1, 1, 2}, s = {"L$0", "L$0", "L$1", "L$0"}, n = {"this", "this", "context", "context"}, m = "executeMessage", c = "com.intellij.ml.llm.matterhorn.ej.ui.ExecuteArtifactRequestUserMessage")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ExecuteArtifactRequestUserMessage$executeMessage$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     ExecuteArtifactRequestUserMessage$executeMessage$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ExecuteArtifactRequestUserMessage.this.executeMessage((Continuation<? super Artifact<O>>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ResolveIssueAgentAction.kt", l = {179}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "context"}, m = "removeObsoleteArtifactIfNeeded", c = "com.intellij.ml.llm.matterhorn.ej.ui.ExecuteArtifactRequestUserMessage")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ExecuteArtifactRequestUserMessage$removeObsoleteArtifactIfNeeded$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     ExecuteArtifactRequestUserMessage$removeObsoleteArtifactIfNeeded$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ExecuteArtifactRequestUserMessage.this.removeObsoleteArtifactIfNeeded((Continuation)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\ExecuteArtifactRequestUserMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */