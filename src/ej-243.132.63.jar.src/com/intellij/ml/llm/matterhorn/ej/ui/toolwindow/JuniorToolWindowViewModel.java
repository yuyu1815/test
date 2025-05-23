/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.toolwindow;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.JuniePreconditionChecker;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.vm.ViewModel;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000¨\001\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\036\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\004\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\007\030\0002\0020\001B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\004\b\n\020\013J\b\0200\032\00201H\002J\023\0202\032\b\022\004\022\0020\02403H\000¢\006\002\b4J\033\0205\032\002062\f\020\035\032\b\022\004\022\0020\0370\036H\000¢\006\002\b7J\025\0208\032\002092\006\020:\032\0020;H\000¢\006\002\b<J\030\020=\032\0020>2\006\020?\032\0020\001H@¢\006\004\b@\020AJ\b\020B\032\004\030\0010CJ\006\020D\032\0020>J\020\020E\032\0020F2\006\020G\032\0020HH\002R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017R\016\020\b\032\0020\tX\004¢\006\002\n\000R\016\020\020\032\0020\021X\004¢\006\002\n\000R\027\020\022\032\b\022\004\022\0020\0240\023¢\006\b\n\000\032\004\b\025\020\026R\032\020\027\032\016\022\n\022\b\022\004\022\0020\0240\0230\030X\004¢\006\002\n\000R\035\020\031\032\016\022\n\022\b\022\004\022\0020\0240\0230\032¢\006\b\n\000\032\004\b\033\020\034R \020\035\032\b\022\004\022\0020\0370\036X\016¢\006\016\n\000\032\004\b \020!\"\004\b\"\020#R\021\020$\032\0020%¢\006\b\n\000\032\004\b&\020'R\031\020(\032\n\022\006\022\004\030\0010)0\032¢\006\b\n\000\032\004\b*\020\034R\016\020+\032\0020,X\004¢\006\002\n\000R\026\020-\032\n\022\006\022\004\030\0010\0010\030X\004¢\006\002\n\000R\031\020.\032\n\022\006\022\004\030\0010\0010\032¢\006\b\n\000\032\004\b/\020\034¨\006I"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;", "project", "Lcom/intellij/openapi/project/Project;", "taskService", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "<init>", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService;Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;)V", "getProject", "()Lcom/intellij/openapi/project/Project;", "getTaskService", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService;", "preconditionChecker", "Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker;", "junieFatalIssues", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem;", "getJunieFatalIssues", "()Ljava/util/List;", "_junieProblems", "Lkotlinx/coroutines/flow/MutableStateFlow;", "junieProblems", "Lkotlinx/coroutines/flow/StateFlow;", "getJunieProblems", "()Lkotlinx/coroutines/flow/StateFlow;", "promptMode", "Landroidx/compose/runtime/MutableState;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;", "getPromptMode", "()Landroidx/compose/runtime/MutableState;", "setPromptMode", "(Landroidx/compose/runtime/MutableState;)V", "llmProxy", "Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;", "getLlmProxy", "()Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;", "quotaWarning", "Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;", "getQuotaWarning", "navigationMutex", "Lkotlinx/coroutines/sync/Mutex;", "_currentPage", "currentPage", "getCurrentPage", "initialize", "Lkotlinx/coroutines/Job;", "refreshJunieProblems", "", "refreshJunieProblems$ej_ui", "createNewTaskPage", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;", "createNewTaskPage$ej_ui", "createTaskDetailsPage", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;", "liveTaskChain", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskChain;", "createTaskDetailsPage$ej_ui", "switchToPage", "", "page", "switchToPage$ej_ui", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ingrazzioLogout", "", "openJBAAccountSetting", "createGrazieActivationPageVm", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationPageVm;", "loginVm", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm;", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nJuniorToolWindowViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JuniorToolWindowViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 4 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 5 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,213:1\n31#2,2:214\n226#3,5:216\n116#4,10:221\n40#5,3:231\n*S KotlinDebug\n*F\n+ 1 JuniorToolWindowViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel\n*L\n59#1:214,2\n90#1:216,5\n151#1:221,10\n157#1:231,3\n*E\n"})
/*     */ public final class JuniorToolWindowViewModel extends ViewModel {
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final TaskService taskService;
/*     */   @NotNull
/*     */   private final MatterhornPropertyProvider propertyProvider;
/*     */   @NotNull
/*     */   private final JuniePreconditionChecker preconditionChecker;
/*     */   @NotNull
/*     */   private final List<JuniePreconditionChecker.JunieProblem> junieFatalIssues;
/*     */   @NotNull
/*     */   private final MutableStateFlow<List<JuniePreconditionChecker.JunieProblem>> _junieProblems;
/*     */   @NotNull
/*     */   private final StateFlow<List<JuniePreconditionChecker.JunieProblem>> junieProblems;
/*     */   @NotNull
/*     */   private MutableState<PromptMode> promptMode;
/*     */   @NotNull
/*     */   private final LLMProxy llmProxy;
/*     */   @NotNull
/*     */   private final StateFlow<GrazieQuotaWarning> quotaWarning;
/*     */   @NotNull
/*     */   private final Mutex navigationMutex;
/*     */   @NotNull
/*     */   private final MutableStateFlow<ViewModel> _currentPage;
/*     */   @NotNull
/*     */   private final StateFlow<ViewModel> currentPage;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   @NotNull
/*  43 */   public final Project getProject() { return this.project; } @NotNull
/*  44 */   public final TaskService getTaskService() { return this.taskService; }
/*     */   @NotNull public final List<JuniePreconditionChecker.JunieProblem> getJunieFatalIssues() { return this.junieFatalIssues; }
/*     */   @NotNull public final StateFlow<List<JuniePreconditionChecker.JunieProblem>> getJunieProblems() { return this.junieProblems; }
/*  47 */   @NotNull public final MutableState<PromptMode> getPromptMode() { return this.promptMode; } public final void setPromptMode(@NotNull MutableState<PromptMode> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.promptMode = <set-?>; } @NotNull public final LLMProxy getLlmProxy() { return this.llmProxy; } public JuniorToolWindowViewModel(@NotNull Project project, @NotNull TaskService taskService, @NotNull CoroutineScope coroutineScope, @NotNull MatterhornPropertyProvider propertyProvider) { super(coroutineScope, "Junior tool window"); this.project = project; this.taskService = taskService;
/*     */     this.propertyProvider = propertyProvider;
/*  49 */     this.preconditionChecker = JuniorToolWindowViewModelKt.access$preconditionChecker(this.project);
/*  50 */     this.junieFatalIssues = this.preconditionChecker.checkJunieAvailable(this.project);
/*     */     
/*  52 */     this._junieProblems = StateFlowKt.MutableStateFlow(this.preconditionChecker.canRunJunie(this.project));
/*  53 */     this.junieProblems = (StateFlow<List<JuniePreconditionChecker.JunieProblem>>)this._junieProblems;
/*     */     
/*  55 */     this.promptMode = SnapshotStateKt.mutableStateOf$default(PromptMode.Agent, null, 2, null);
/*     */     
/*  57 */     this.llmProxy = JuniePluginLLMProxyProvider.INSTANCE.createLLMProxy(this.project);
/*     */     
/*  59 */     ComponentManager $this$service$iv = (ComponentManager)this.project; int $i$f$service = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 214 */     Class<JunieGrazieQuota> serviceClass$iv = JunieGrazieQuota.class;
/* 215 */     if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  ((JuniorToolWindowViewModel)$this$service$iv.getService(serviceClass$iv)).quotaWarning = ((JunieGrazieQuota)$this$service$iv.getService(serviceClass$iv)).getQuotaWarning(); this.navigationMutex = MutexKt.Mutex$default(false, 1, null); this._currentPage = StateFlowKt.MutableStateFlow(null); this.currentPage = (StateFlow<ViewModel>)this._currentPage; initialize(); }
/*     */   @NotNull public final StateFlow<GrazieQuotaWarning> getQuotaWarning() { return this.quotaWarning; } @NotNull public final StateFlow<ViewModel> getCurrentPage() { return this.currentPage; } private final Job initialize() { return BuildersKt.launch$default(getScope(), null, null, new JuniorToolWindowViewModel$initialize$1(null), 3, null); } @DebugMetadata(f = "JuniorToolWindowViewModel.kt", l = {75, 77, 85}, i = {0}, s = {"L$0"}, n = {"activationVm"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.JuniorToolWindowViewModel$initialize$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class JuniorToolWindowViewModel$initialize$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     Object L$0; int label; JuniorToolWindowViewModel$initialize$1(Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #4
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 260, 0 -> 40, 1 -> 122, 2 -> 185, 3 -> 250
/*     */       //   40: aload_1
/*     */       //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   44: aload_0
/*     */       //   45: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*     */       //   48: invokevirtual getLlmProxy : ()Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;
/*     */       //   51: instanceof com/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieLLMProxy
/*     */       //   54: ifeq -> 194
/*     */       //   57: new com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm
/*     */       //   60: dup
/*     */       //   61: aload_0
/*     */       //   62: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*     */       //   65: invokevirtual getScope : ()Lkotlinx/coroutines/CoroutineScope;
/*     */       //   68: aload_0
/*     */       //   69: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*     */       //   72: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*     */       //   75: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/openapi/project/Project;)V
/*     */       //   78: astore_2
/*     */       //   79: aload_0
/*     */       //   80: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*     */       //   83: aload_2
/*     */       //   84: invokestatic access$createGrazieActivationPageVm : (Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm;)Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationPageVm;
/*     */       //   87: astore_3
/*     */       //   88: aload_0
/*     */       //   89: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*     */       //   92: aload_3
/*     */       //   93: checkcast com/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel
/*     */       //   96: aload_0
/*     */       //   97: checkcast kotlin/coroutines/Continuation
/*     */       //   100: aload_0
/*     */       //   101: aload_2
/*     */       //   102: putfield L$0 : Ljava/lang/Object;
/*     */       //   105: aload_0
/*     */       //   106: iconst_1
/*     */       //   107: putfield label : I
/*     */       //   110: invokevirtual switchToPage$ej_ui : (Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   113: dup
/*     */       //   114: aload #4
/*     */       //   116: if_acmpne -> 135
/*     */       //   119: aload #4
/*     */       //   121: areturn
/*     */       //   122: aload_0
/*     */       //   123: getfield L$0 : Ljava/lang/Object;
/*     */       //   126: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm
/*     */       //   129: astore_2
/*     */       //   130: aload_1
/*     */       //   131: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   134: aload_1
/*     */       //   135: pop
/*     */       //   136: aload_2
/*     */       //   137: invokevirtual getState : ()Lkotlinx/coroutines/flow/StateFlow;
/*     */       //   140: checkcast kotlinx/coroutines/flow/Flow
/*     */       //   143: new com/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel$initialize$1$1
/*     */       //   146: dup
/*     */       //   147: aload_0
/*     */       //   148: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*     */       //   151: aload_2
/*     */       //   152: aconst_null
/*     */       //   153: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm;Lkotlin/coroutines/Continuation;)V
/*     */       //   156: checkcast kotlin/jvm/functions/Function2
/*     */       //   159: aload_0
/*     */       //   160: checkcast kotlin/coroutines/Continuation
/*     */       //   163: aload_0
/*     */       //   164: aconst_null
/*     */       //   165: putfield L$0 : Ljava/lang/Object;
/*     */       //   168: aload_0
/*     */       //   169: iconst_2
/*     */       //   170: putfield label : I
/*     */       //   173: invokestatic collectLatest : (Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   176: dup
/*     */       //   177: aload #4
/*     */       //   179: if_acmpne -> 190
/*     */       //   182: aload #4
/*     */       //   184: areturn
/*     */       //   185: aload_1
/*     */       //   186: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   189: aload_1
/*     */       //   190: pop
/*     */       //   191: goto -> 256
/*     */       //   194: aload_0
/*     */       //   195: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*     */       //   198: new com/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl
/*     */       //   201: dup
/*     */       //   202: aload_0
/*     */       //   203: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*     */       //   206: invokevirtual getScope : ()Lkotlinx/coroutines/CoroutineScope;
/*     */       //   209: aload_0
/*     */       //   210: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*     */       //   213: invokestatic access$getPropertyProvider$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;)Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   216: aload_0
/*     */       //   217: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*     */       //   220: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*     */       //   223: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lcom/intellij/openapi/project/Project;)V
/*     */       //   226: checkcast com/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel
/*     */       //   229: aload_0
/*     */       //   230: checkcast kotlin/coroutines/Continuation
/*     */       //   233: aload_0
/*     */       //   234: iconst_3
/*     */       //   235: putfield label : I
/*     */       //   238: invokevirtual switchToPage$ej_ui : (Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   241: dup
/*     */       //   242: aload #4
/*     */       //   244: if_acmpne -> 255
/*     */       //   247: aload #4
/*     */       //   249: areturn
/*     */       //   250: aload_1
/*     */       //   251: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   254: aload_1
/*     */       //   255: pop
/*     */       //   256: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   259: areturn
/*     */       //   260: new java/lang/IllegalStateException
/*     */       //   263: dup
/*     */       //   264: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   266: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   269: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #71	-> 3
/*     */       //   #72	-> 44
/*     */       //   #73	-> 57
/*     */       //   #74	-> 79
/*     */       //   #75	-> 88
/*     */       //   #71	-> 119
/*     */       //   #77	-> 135
/*     */       //   #71	-> 182
/*     */       //   #77	-> 190
/*     */       //   #85	-> 194
/*     */       //   #71	-> 247
/*     */       //   #87	-> 255
/*     */       //   #71	-> 260
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   79	43	2	activationVm	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm;
/*     */       //   130	46	2	activationVm	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm;
/*     */       //   88	25	3	activationPage	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationPageVm;
/*     */       //   0	270	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel$initialize$1;
/* 217 */       //   44	216	1	$result	Ljava/lang/Object; } public final Continuation<Unit> create(Object value, Continuation<? super JuniorToolWindowViewModel$initialize$1> $completion) { return (Continuation<Unit>)new JuniorToolWindowViewModel$initialize$1($completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((JuniorToolWindowViewModel$initialize$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } @NotNull public final Collection<JuniePreconditionChecker.JunieProblem> refreshJunieProblems$ej_ui() { MutableStateFlow<List<JuniePreconditionChecker.JunieProblem>> $this$update$iv = this._junieProblems; int $i$f$update = 0; while (true) { Object prevValue$iv = $this$update$iv.getValue();
/* 218 */       List it = (List)prevValue$iv; int $i$a$-update-JuniorToolWindowViewModel$refreshJunieProblems$1 = 0; Object nextValue$iv = this.preconditionChecker.canRunJunie(this.project);
/* 219 */       if ($this$update$iv.compareAndSet(prevValue$iv, nextValue$iv)) if (BuildConfigKt.getConfig().getHasEAPLicenseAgreement()) BuildersKt.launch$default(getScope(), null, null, new JuniorToolWindowViewModel$refreshJunieProblems$2(null), 3, null);   }  } @DebugMetadata(f = "JuniorToolWindowViewModel.kt", l = {94}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.JuniorToolWindowViewModel$refreshJunieProblems$2") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) @SourceDebugExtension({"SMAP\nJuniorToolWindowViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JuniorToolWindowViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel$refreshJunieProblems$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,213:1\n226#2,5:214\n*S KotlinDebug\n*F\n+ 1 JuniorToolWindowViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel$refreshJunieProblems$2\n*L\n95#1:214,5\n*E\n"}) static final class JuniorToolWindowViewModel$refreshJunieProblems$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label; JuniorToolWindowViewModel$refreshJunieProblems$2(Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #10
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 159, 0 -> 32, 1 -> 57
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: checkcast kotlin/coroutines/Continuation
/*     */       //   40: aload_0
/*     */       //   41: iconst_1
/*     */       //   42: putfield label : I
/*     */       //   45: invokestatic checkAgreements : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   48: dup
/*     */       //   49: aload #10
/*     */       //   51: if_acmpne -> 62
/*     */       //   54: aload #10
/*     */       //   56: areturn
/*     */       //   57: aload_1
/*     */       //   58: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   61: aload_1
/*     */       //   62: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo
/*     */       //   65: dup
/*     */       //   66: ifnull -> 153
/*     */       //   69: astore_2
/*     */       //   70: aload_0
/*     */       //   71: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*     */       //   74: astore_3
/*     */       //   75: iconst_0
/*     */       //   76: istore #4
/*     */       //   78: aload_3
/*     */       //   79: invokestatic access$get_junieProblems$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   82: astore #5
/*     */       //   84: iconst_0
/*     */       //   85: istore #6
/*     */       //   87: nop
/*     */       //   88: aload #5
/*     */       //   90: invokeinterface getValue : ()Ljava/lang/Object;
/*     */       //   95: astore #7
/*     */       //   97: aload #7
/*     */       //   99: checkcast java/util/List
/*     */       //   102: pop
/*     */       //   103: iconst_0
/*     */       //   104: istore #9
/*     */       //   106: new com/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem
/*     */       //   109: dup
/*     */       //   110: ldc 'Read and accept our User Licence Agreement'
/*     */       //   112: ldc 'Accept'
/*     */       //   114: new com/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel$refreshJunieProblems$2$1$1$1
/*     */       //   117: dup
/*     */       //   118: aconst_null
/*     */       //   119: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */       //   122: checkcast kotlin/jvm/functions/Function1
/*     */       //   125: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
/*     */       //   128: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */       //   131: nop
/*     */       //   132: astore #8
/*     */       //   134: aload #5
/*     */       //   136: aload #7
/*     */       //   138: aload #8
/*     */       //   140: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   145: ifeq -> 87
/*     */       //   148: nop
/*     */       //   149: nop
/*     */       //   150: goto -> 155
/*     */       //   153: pop
/*     */       //   154: nop
/*     */       //   155: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   158: areturn
/*     */       //   159: new java/lang/IllegalStateException
/*     */       //   162: dup
/*     */       //   163: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   165: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   168: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #93	-> 3
/*     */       //   #94	-> 36
/*     */       //   #93	-> 54
/*     */       //   #94	-> 62
/*     */       //   #95	-> 78
/*     */       //   #214	-> 87
/*     */       //   #215	-> 88
/*     */       //   #216	-> 97
/*     */       //   #97	-> 106
/*     */       //   #98	-> 110
/*     */       //   #99	-> 112
/*     */       //   #96	-> 114
/*     */       //   #97	-> 125
/*     */       //   #96	-> 128
/*     */       //   #102	-> 131
/*     */       //   #216	-> 132
/*     */       //   #217	-> 134
/*     */       //   #218	-> 148
/*     */       //   #104	-> 149
/*     */       //   #94	-> 150
/*     */       //   #94	-> 153
/*     */       //   #105	-> 155
/*     */       //   #93	-> 159
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   84	65	5	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   97	52	7	prevValue$iv	Ljava/lang/Object;
/*     */       //   134	15	8	nextValue$iv	Ljava/lang/Object;
/*     */       //   106	26	9	$i$a$-update-JuniorToolWindowViewModel$refreshJunieProblems$2$1$1	I
/*     */       //   87	62	6	$i$f$update	I
/*     */       //   78	72	4	$i$a$-let-JuniorToolWindowViewModel$refreshJunieProblems$2$1	I
/*     */       //   0	169	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel$refreshJunieProblems$2;
/*     */       //   36	123	1	$result	Ljava/lang/Object; }
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super JuniorToolWindowViewModel$refreshJunieProblems$2> $completion) { return (Continuation<Unit>)new JuniorToolWindowViewModel$refreshJunieProblems$2($completion); }
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((JuniorToolWindowViewModel$refreshJunieProblems$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/*     */   @NotNull public final NewTaskViewModelImpl createNewTaskPage$ej_ui(@NotNull MutableState promptMode) { Intrinsics.checkNotNullParameter(promptMode, "promptMode"); return new NewTaskViewModelImpl(this.llmProxy, this.taskService, this.project, getScope(), this::createNewTaskPage$lambda$1, new JuniorToolWindowViewModel$createNewTaskPage$2(this), this.propertyProvider, promptMode); }
/*     */   private static final Unit createNewTaskPage$lambda$1(JuniorToolWindowViewModel this$0, LiveTaskChain liveTaskChain) { Intrinsics.checkNotNullParameter(liveTaskChain, "liveTaskChain"); BuildersKt.launch$default(this$0.getScope(), null, null, new JuniorToolWindowViewModel$createNewTaskPage$1$1(liveTaskChain, null), 3, null); return Unit.INSTANCE; }
/*     */   @DebugMetadata(f = "JuniorToolWindowViewModel.kt", l = {118}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.JuniorToolWindowViewModel$createNewTaskPage$1$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class JuniorToolWindowViewModel$createNewTaskPage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     JuniorToolWindowViewModel$createNewTaskPage$1$1(LiveTaskChain $liveTaskChain, Continuation $completion) { super(2, $completion); }
/*     */     public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (JuniorToolWindowViewModel.this.switchToPage$ej_ui((ViewModel)JuniorToolWindowViewModel.this.createTaskDetailsPage$ej_ui(this.$liveTaskChain), (Continuation<? super Unit>)this) == object) return object;  JuniorToolWindowViewModel.this.switchToPage$ej_ui((ViewModel)JuniorToolWindowViewModel.this.createTaskDetailsPage$ej_ui(this.$liveTaskChain), (Continuation<? super Unit>)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super JuniorToolWindowViewModel$createNewTaskPage$1$1> $completion) { return (Continuation<Unit>)new JuniorToolWindowViewModel$createNewTaskPage$1$1(this.$liveTaskChain, $completion); }
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((JuniorToolWindowViewModel$createNewTaskPage$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/* 231 */   @Nullable public final String ingrazzioLogout() { int $i$f$service = 0; Class<IngrazzioAuthService> serviceClass$iv = IngrazzioAuthService.class;
/* 232 */     if (ApplicationManager.getApplication().getService(serviceClass$iv) == null) { ApplicationManager.getApplication().getService(serviceClass$iv);
/* 233 */       throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ')'); }
/*     */     
/*     */     IngrazzioAuthService authService = (IngrazzioAuthService)ApplicationManager.getApplication().getService(serviceClass$iv);
/*     */     try {
/*     */       if (authService.getShouldUseJbaAccount()) {
/*     */         openJBAAccountSetting();
/*     */       } else {
/*     */         authService.clearAccessToken();
/*     */         BuildersKt.launch$default(getScope(), null, null, new JuniorToolWindowViewModel$ingrazzioLogout$1(null), 3, null);
/*     */       } 
/*     */     } catch (Exception e) {
/*     */       return e.getMessage();
/*     */     } 
/*     */     return "You have been logged out from Junie!"; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final TaskChainDetailsViewModel createTaskDetailsPage$ej_ui(@NotNull LiveTaskChain liveTaskChain) {
/*     */     Intrinsics.checkNotNullParameter(liveTaskChain, "liveTaskChain");
/*     */     return new TaskChainDetailsViewModel(this.project, this.llmProxy, this.taskService, this::createTaskDetailsPage$lambda$2, liveTaskChain, getScope(), new JuniorToolWindowViewModel$createTaskDetailsPage$2(this), this.promptMode);
/*     */   }
/*     */   
/*     */   private static final Unit createTaskDetailsPage$lambda$2(JuniorToolWindowViewModel this$0) {
/*     */     ViewModel currentPage = (ViewModel)this$0.currentPage.getValue();
/*     */     if (currentPage != null) {
/*     */       NewTaskViewModelImpl newTaskPage = this$0.createNewTaskPage$ej_ui(this$0.promptMode);
/*     */       newTaskPage.checkStartAgain(currentPage);
/*     */       BuildersKt.launch$default(this$0.getScope(), null, null, new JuniorToolWindowViewModel$createTaskDetailsPage$1$1(newTaskPage, null), 3, null);
/*     */     } 
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JuniorToolWindowViewModel.kt", l = {140}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.JuniorToolWindowViewModel$createTaskDetailsPage$1$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class JuniorToolWindowViewModel$createTaskDetailsPage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     JuniorToolWindowViewModel$createTaskDetailsPage$1$1(NewTaskViewModelImpl $newTaskPage, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (JuniorToolWindowViewModel.this.switchToPage$ej_ui((ViewModel)this.$newTaskPage, (Continuation<? super Unit>)this) == object)
/*     */             return object; 
/*     */           JuniorToolWindowViewModel.this.switchToPage$ej_ui((ViewModel)this.$newTaskPage, (Continuation<? super Unit>)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super JuniorToolWindowViewModel$createTaskDetailsPage$1$1> $completion) {
/*     */       return (Continuation<Unit>)new JuniorToolWindowViewModel$createTaskDetailsPage$1$1(this.$newTaskPage, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((JuniorToolWindowViewModel$createTaskDetailsPage$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object switchToPage$ej_ui(@NotNull ViewModel page, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel$switchToPage$1
/*     */     //   4: ifeq -> 41
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel$switchToPage$1
/*     */     //   11: astore #10
/*     */     //   13: aload #10
/*     */     //   15: getfield label : I
/*     */     //   18: ldc_w -2147483648
/*     */     //   21: iand
/*     */     //   22: ifeq -> 41
/*     */     //   25: aload #10
/*     */     //   27: dup
/*     */     //   28: getfield label : I
/*     */     //   31: ldc_w -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 52
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel$switchToPage$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload_2
/*     */     //   47: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;Lkotlin/coroutines/Continuation;)V
/*     */     //   50: astore #10
/*     */     //   52: aload #10
/*     */     //   54: getfield result : Ljava/lang/Object;
/*     */     //   57: astore #9
/*     */     //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   62: astore #11
/*     */     //   64: aload #10
/*     */     //   66: getfield label : I
/*     */     //   69: tableswitch default -> 264, 0 -> 92, 1 -> 152
/*     */     //   92: aload #9
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_0
/*     */     //   98: getfield navigationMutex : Lkotlinx/coroutines/sync/Mutex;
/*     */     //   101: astore_3
/*     */     //   102: aconst_null
/*     */     //   103: astore #4
/*     */     //   105: iconst_0
/*     */     //   106: istore #5
/*     */     //   108: nop
/*     */     //   109: aload_3
/*     */     //   110: aload #4
/*     */     //   112: aload #10
/*     */     //   114: aload #10
/*     */     //   116: aload_0
/*     */     //   117: putfield L$0 : Ljava/lang/Object;
/*     */     //   120: aload #10
/*     */     //   122: aload_1
/*     */     //   123: putfield L$1 : Ljava/lang/Object;
/*     */     //   126: aload #10
/*     */     //   128: aload_3
/*     */     //   129: putfield L$2 : Ljava/lang/Object;
/*     */     //   132: aload #10
/*     */     //   134: iconst_1
/*     */     //   135: putfield label : I
/*     */     //   138: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   143: dup
/*     */     //   144: aload #11
/*     */     //   146: if_acmpne -> 192
/*     */     //   149: aload #11
/*     */     //   151: areturn
/*     */     //   152: iconst_0
/*     */     //   153: istore #5
/*     */     //   155: aconst_null
/*     */     //   156: astore #4
/*     */     //   158: aload #10
/*     */     //   160: getfield L$2 : Ljava/lang/Object;
/*     */     //   163: checkcast kotlinx/coroutines/sync/Mutex
/*     */     //   166: astore_3
/*     */     //   167: aload #10
/*     */     //   169: getfield L$1 : Ljava/lang/Object;
/*     */     //   172: checkcast com/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel
/*     */     //   175: astore_1
/*     */     //   176: aload #10
/*     */     //   178: getfield L$0 : Ljava/lang/Object;
/*     */     //   181: checkcast com/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel
/*     */     //   184: astore_0
/*     */     //   185: aload #9
/*     */     //   187: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   190: aload #9
/*     */     //   192: pop
/*     */     //   193: nop
/*     */     //   194: iconst_0
/*     */     //   195: istore #6
/*     */     //   197: aload_0
/*     */     //   198: getfield _currentPage : Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   201: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   206: checkcast com/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel
/*     */     //   209: dup
/*     */     //   210: ifnull -> 219
/*     */     //   213: invokevirtual closeVM : ()V
/*     */     //   216: goto -> 220
/*     */     //   219: pop
/*     */     //   220: aload_0
/*     */     //   221: getfield _currentPage : Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   224: aload_1
/*     */     //   225: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */     //   230: nop
/*     */     //   231: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   234: astore #7
/*     */     //   236: aload_3
/*     */     //   237: aload #4
/*     */     //   239: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */     //   244: goto -> 260
/*     */     //   247: astore #8
/*     */     //   249: aload_3
/*     */     //   250: aload #4
/*     */     //   252: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */     //   257: aload #8
/*     */     //   259: athrow
/*     */     //   260: aload #7
/*     */     //   262: nop
/*     */     //   263: areturn
/*     */     //   264: new java/lang/IllegalStateException
/*     */     //   267: dup
/*     */     //   268: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   271: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   274: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #151	-> 62
/*     */     //   #151	-> 97
/*     */     //   #221	-> 102
/*     */     //   #222	-> 108
/*     */     //   #225	-> 109
/*     */     //   #151	-> 149
/*     */     //   #226	-> 192
/*     */     //   #227	-> 194
/*     */     //   #152	-> 197
/*     */     //   #153	-> 220
/*     */     //   #154	-> 230
/*     */     //   #227	-> 234
/*     */     //   #229	-> 236
/*     */     //   #230	-> 244
/*     */     //   #229	-> 247
/*     */     //   #226	-> 262
/*     */     //   #154	-> 263
/*     */     //   #151	-> 264
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	55	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*     */     //   185	45	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*     */     //   97	55	1	page	Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;
/*     */     //   176	54	1	page	Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;
/*     */     //   102	50	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   167	64	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   231	13	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   247	16	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   105	47	4	owner$iv	Ljava/lang/Object;
/*     */     //   167	64	4	owner$iv	Ljava/lang/Object;
/*     */     //   231	13	4	owner$iv	Ljava/lang/Object;
/*     */     //   247	16	4	owner$iv	Ljava/lang/Object;
/*     */     //   197	34	6	$i$a$-withLock$default-JuniorToolWindowViewModel$switchToPage$2	I
/*     */     //   108	44	5	$i$f$withLock	I
/*     */     //   0	275	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   52	212	10	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   59	205	9	$result	Ljava/lang/Object;
/*     */     //   155	108	5	$i$f$withLock	I
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   193	236	247	finally
/*     */     //   247	249	247	finally
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JuniorToolWindowViewModel.kt", l = {164}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.JuniorToolWindowViewModel$ingrazzioLogout$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class JuniorToolWindowViewModel$ingrazzioLogout$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     JuniorToolWindowViewModel$ingrazzioLogout$1(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (JuniorToolWindowViewModel.this.switchToPage$ej_ui((ViewModel)new StartLoadingViewModelImpl(JuniorToolWindowViewModel.this.getScope(), JuniorToolWindowViewModel.this.propertyProvider, JuniorToolWindowViewModel.this.getProject()), (Continuation<? super Unit>)this) == object)
/*     */             return object; 
/*     */           JuniorToolWindowViewModel.this.switchToPage$ej_ui((ViewModel)new StartLoadingViewModelImpl(JuniorToolWindowViewModel.this.getScope(), JuniorToolWindowViewModel.this.propertyProvider, JuniorToolWindowViewModel.this.getProject()), (Continuation<? super Unit>)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super JuniorToolWindowViewModel$ingrazzioLogout$1> $completion) {
/*     */       return (Continuation<Unit>)new JuniorToolWindowViewModel$ingrazzioLogout$1($completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((JuniorToolWindowViewModel$ingrazzioLogout$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   public final void openJBAAccountSetting() {
/*     */     AnAction action;
/*     */     ActionManager actionManager = ActionManager.getInstance();
/*     */     if (actionManager.getAction("Register") == null) {
/*     */       actionManager.getAction("Register");
/*     */       JuniorToolWindowViewModel $this$openJBAAccountSetting_u24lambda_u244 = this;
/*     */       int $i$a$-run-JuniorToolWindowViewModel$openJBAAccountSetting$action$1 = 0;
/*     */       String message = "Unable to open JBA account!.\nPlease logout manually:.\nSelect Help | Register from the main menu or click Options Menu | Manage License on the Welcome screen to open the Licenses dialog";
/*     */       throw new IllegalStateException(message.toString());
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(AnActionEvent.createEvent(action, SimpleDataContext.getProjectContext(this.project), null, "MainMenu", (ActionUiKind)ActionUiKind.POPUP, null), "createEvent(...)");
/*     */     AnActionEvent event = AnActionEvent.createEvent(action, SimpleDataContext.getProjectContext(this.project), null, "MainMenu", (ActionUiKind)ActionUiKind.POPUP, null);
/*     */     action.actionPerformed(event);
/*     */   }
/*     */   
/*     */   private final GrazieActivationPageVm createGrazieActivationPageVm(GrazieActivationVm loginVm) {
/*     */     return new GrazieActivationPageVm(loginVm, getScope());
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JuniorToolWindowViewModel.kt", l = {218}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"this", "page", "$this$withLock_u24default$iv"}, m = "switchToPage$ej_ui", c = "com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.JuniorToolWindowViewModel")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class JuniorToolWindowViewModel$switchToPage$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int label;
/*     */     
/*     */     JuniorToolWindowViewModel$switchToPage$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return JuniorToolWindowViewModel.this.switchToPage$ej_ui(null, (Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\toolwindow\JuniorToolWindowViewModel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */