/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.create;
/*     */ 
/*     */ import androidx.compose.foundation.lazy.LazyListState;
/*     */ import androidx.compose.foundation.text.input.TextFieldState;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.JuniePreconditionChecker;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.LiveTaskChain;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.RecentTaskChain;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.RecentTaskChainService;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskService;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskEntity;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.statistics.CompositeUiAction;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.explorer.TaskExplorerTabs;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.explorer.Tip;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.AttachedFilesViewModel;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.PromptMode;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.PromptOwnerViewModel;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.vm.ViewModel;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LLMProxy;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import java.io.InputStream;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.collections.immutable.ImmutableCollection;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Dispatchers;
/*     */ import kotlinx.coroutines.flow.Flow;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import kotlinx.coroutines.flow.FlowKt;
/*     */ import kotlinx.coroutines.flow.MutableStateFlow;
/*     */ import kotlinx.coroutines.flow.StateFlow;
/*     */ import kotlinx.coroutines.flow.StateFlowKt;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.internal.ArrayListSerializer;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.json.JvmStreamsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyListState;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000´\001\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\002\020\036\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\021\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\006\b\007\030\000 V2\0020\0012\0020\002:\001VBe\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n\022\022\020\013\032\016\022\004\022\0020\r\022\004\022\0020\0160\f\022\022\020\017\032\016\022\n\022\b\022\004\022\0020\0220\0210\020\022\006\020\023\032\0020\024\022\f\020\025\032\b\022\004\022\0020\0270\026¢\006\004\b\030\020\031J\020\020G\032\0020\0162\006\020H\032\0020\027H\026J\016\020I\032\0020\0162\006\020J\032\0020KJ\034\020L\032\b\022\004\022\0020M002\006\020N\032\0020O2\006\020P\032\0020QJ\016\020R\032\0020\0162\006\020S\032\0020\001J\020\020T\032\0020\0162\006\020U\032\0020\rH\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\032\020\033R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\034\020\035R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\036\020\037R\035\020\013\032\016\022\004\022\0020\r\022\004\022\0020\0160\f¢\006\b\n\000\032\004\b \020!R\035\020\017\032\016\022\n\022\b\022\004\022\0020\0220\0210\020¢\006\b\n\000\032\004\b\"\020#R\021\020\023\032\0020\024¢\006\b\n\000\032\004\b$\020%R\027\020\025\032\b\022\004\022\0020\0270\026¢\006\b\n\000\032\004\b&\020'R\024\020(\032\b\022\004\022\0020*0)X\004¢\006\002\n\000R\027\020+\032\b\022\004\022\0020*0,¢\006\b\n\000\032\004\b-\020.R\035\020/\032\016\022\n\022\b\022\004\022\00201000)¢\006\b\n\000\032\004\b2\0203R\024\0204\032\00205X\004¢\006\b\n\000\032\004\b6\0207R\021\0208\032\00209¢\006\b\n\000\032\004\b:\020;R\027\020<\032\b\022\004\022\0020=0\026¢\006\b\n\000\032\004\b>\020'R\026\020?\032\n\022\006\022\004\030\0010@0)X\004¢\006\002\n\000R\031\020A\032\n\022\006\022\004\030\0010@0,¢\006\b\n\000\032\004\bB\020.R\024\020C\032\0020DX\004¢\006\b\n\000\032\004\bE\020F¨\006W"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptOwnerViewModel;", "llmProxy", "Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;", "taskService", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService;", "project", "Lcom/intellij/openapi/project/Project;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "onOpenTaskPage", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskChain;", "", "checkForJunieProblems", "Lkotlin/Function0;", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "promptMode", "Landroidx/compose/runtime/MutableState;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService;Lcom/intellij/openapi/project/Project;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Landroidx/compose/runtime/MutableState;)V", "getLlmProxy", "()Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;", "getTaskService", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService;", "getProject", "()Lcom/intellij/openapi/project/Project;", "getOnOpenTaskPage", "()Lkotlin/jvm/functions/Function1;", "getCheckForJunieProblems", "()Lkotlin/jvm/functions/Function0;", "getPropertyProvider", "()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "getPromptMode", "()Landroidx/compose/runtime/MutableState;", "_recentTasks", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/RecentTaskLoadState;", "recentTasks", "Lkotlinx/coroutines/flow/StateFlow;", "getRecentTasks", "()Lkotlinx/coroutines/flow/StateFlow;", "tips", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/Tip;", "getTips", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "textState", "Landroidx/compose/foundation/text/input/TextFieldState;", "getTextState", "()Landroidx/compose/foundation/text/input/TextFieldState;", "taskListState", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;", "getTaskListState", "()Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;", "taskExplorerSelectedTab", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/TaskExplorerTabs;", "getTaskExplorerSelectedTab", "errorInfo", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo;", "errorFlow", "getErrorFlow", "attachedFiles", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;", "getAttachedFiles", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;", "submitTask", "mode", "openTaskPage", "taskChainId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "getTaskContextActions", "Landroidx/compose/foundation/ContextMenuItem;", "task", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/SortedRecentTaskChain;", "recentTaskCount", "", "checkStartAgain", "currentPageModel", "copyDescriptionAndFiles", "liveTaskChain", "Companion", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nNewTaskViewModelImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewTaskViewModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,293:1\n14#2:294\n*S KotlinDebug\n*F\n+ 1 NewTaskViewModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl\n*L\n75#1:294\n*E\n"})
/*     */ public final class NewTaskViewModelImpl extends ViewModel implements PromptOwnerViewModel {
/*  65 */   public boolean getPerplexityModeEnabled() { return PromptOwnerViewModel.DefaultImpls.getPerplexityModeEnabled(this); } @NotNull
/*  66 */   public final LLMProxy getLlmProxy() { return this.llmProxy; } @NotNull public final TaskService getTaskService() { return this.taskService; } @NotNull
/*  67 */   public Project getProject() { return this.project; }
/*     */   @NotNull
/*  69 */   public final Function1<LiveTaskChain, Unit> getOnOpenTaskPage() { return this.onOpenTaskPage; } @NotNull
/*  70 */   public final Function0<Collection<JuniePreconditionChecker.JunieProblem>> getCheckForJunieProblems() { return this.checkForJunieProblems; } @NotNull
/*  71 */   public final MatterhornPropertyProvider getPropertyProvider() { return this.propertyProvider; } @NotNull
/*  72 */   public final MutableState<PromptMode> getPromptMode() { return this.promptMode; } public NewTaskViewModelImpl(@NotNull LLMProxy llmProxy, @NotNull TaskService taskService, @NotNull Project project, @NotNull CoroutineScope scope, @NotNull Function1<LiveTaskChain, Unit> onOpenTaskPage, @NotNull Function0<Collection<JuniePreconditionChecker.JunieProblem>> checkForJunieProblems, @NotNull MatterhornPropertyProvider propertyProvider, @NotNull MutableState<PromptMode> promptMode) {
/*  73 */     super(scope, "Initial screen"); this.llmProxy = llmProxy; this.taskService = taskService; this.project = project;
/*     */     this.onOpenTaskPage = onOpenTaskPage;
/*     */     this.checkForJunieProblems = checkForJunieProblems;
/*     */     this.propertyProvider = propertyProvider;
/*     */     this.promptMode = promptMode;
/*  78 */     this._recentTasks = StateFlowKt.MutableStateFlow(RecentTaskLoadState.Loading.INSTANCE);
/*  79 */     this.recentTasks = FlowKt.asStateFlow(this._recentTasks);
/*     */     
/*  81 */     this.tips = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
/*     */ 
/*     */     
/*  84 */     BuildersKt.launch$default(getScope(), (CoroutineContext)Dispatchers.getIO(), null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { int label; public final Object invokeSuspend(Object $result) { InputStream inputStream; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */ 
/*     */ 
/*     */                 
/*  88 */                 inputStream = NewTaskViewModelImpl.class.getClassLoader().getResourceAsStream("data/example-prompts.json");
/*  89 */                 if (inputStream != null) { InputStream it = inputStream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/* 294 */                   int $i$a$-let-NewTaskViewModelImpl$1$1 = 0; Json $this$decodeFromStream$iv = (Json)Json.Default; int $i$f$decodeFromStream = 0;
/* 295 */                   $this$decodeFromStream$iv.getSerializersModule(); List list = (List)JvmStreamsKt.decodeFromStream($this$decodeFromStream$iv, (DeserializationStrategy)new ArrayListSerializer(Tip.Companion.serializer()), it);
/*     */                   if (list != null) {
/*     */                     List list1 = list;
/*     */                     NewTaskViewModelImpl newTaskViewModelImpl = NewTaskViewModelImpl.this;
/*     */                     List list2 = list1;
/*     */                     int $i$a$-let-NewTaskViewModelImpl$1$2 = 0;
/*     */                     newTaskViewModelImpl.getTips().setValue(list2);
/*     */                   }  }
/*     */                 
/*     */                 NewTaskViewModelImpl.logger.warn("Failed to load tips from data/example-prompts.json");
/*     */                 return Unit.INSTANCE; }
/*     */             
/*     */             throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */ 
/*     */           
/*     */           public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */             return (Continuation)new Function2<>(NewTaskViewModelImpl.this, $completion);
/*     */           }
/*     */           
/*     */           public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */             return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */           } }
/*     */         2, null);
/*     */     this.textState = new TextFieldState(null, 0L, 3, null);
/*     */     this.taskListState = new SelectableLazyListState(new LazyListState(0, 0, 3, null));
/*     */     this.taskExplorerSelectedTab = SnapshotStateKt.mutableStateOf$default(TaskExplorerTabs.History, null, 2, null);
/*     */     this.errorInfo = StateFlowKt.MutableStateFlow(null);
/*     */     this.errorFlow = (StateFlow<ErrorInfo>)this.errorInfo;
/*     */     if (getProject().getBasePath() == null)
/*     */       getProject().getBasePath(); 
/*     */     super((Project)scope, (CoroutineScope)getProject().getBasePath(), "", ExtensionsKt.persistentListOf(), this.llmProxy.getImagesSupported(), true);
/*     */     ((NewTaskViewModelImpl)new AttachedFilesViewModel()).attachedFiles = new AttachedFilesViewModel();
/*     */     BuildersKt.launch$default(getScope(), null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) {
/*     */           int label;
/*     */           
/*     */           public final Object invokeSuspend(Object $result) {
/*     */             Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */             switch (this.label) {
/*     */               case 0:
/*     */                 ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                 this.label = 1;
/*     */                 if (RecentTaskChainService.Companion.getInstance(NewTaskViewModelImpl.this.getProject()).getRecentTaskChains((Continuation)this) == object)
/*     */                   return object; 
/*     */                 this.label = 2;
/*     */                 if (FlowKt.filterNotNull((Flow)RecentTaskChainService.Companion.getInstance(NewTaskViewModelImpl.this.getProject()).getRecentTaskChains((Continuation)this)).collect(new FlowCollector() {
/*     */                       public final Object emit(ImmutableCollection taskChains, Continuation $completion) {
/*     */                         // Byte code:
/*     */                         //   0: aload_2
/*     */                         //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1$emit$1
/*     */                         //   4: ifeq -> 39
/*     */                         //   7: aload_2
/*     */                         //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1$emit$1
/*     */                         //   11: astore #18
/*     */                         //   13: aload #18
/*     */                         //   15: getfield label : I
/*     */                         //   18: ldc -2147483648
/*     */                         //   20: iand
/*     */                         //   21: ifeq -> 39
/*     */                         //   24: aload #18
/*     */                         //   26: dup
/*     */                         //   27: getfield label : I
/*     */                         //   30: ldc -2147483648
/*     */                         //   32: isub
/*     */                         //   33: putfield label : I
/*     */                         //   36: goto -> 50
/*     */                         //   39: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1$emit$1
/*     */                         //   42: dup
/*     */                         //   43: aload_0
/*     */                         //   44: aload_2
/*     */                         //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1;Lkotlin/coroutines/Continuation;)V
/*     */                         //   48: astore #18
/*     */                         //   50: aload #18
/*     */                         //   52: getfield result : Ljava/lang/Object;
/*     */                         //   55: astore #17
/*     */                         //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                         //   60: astore #19
/*     */                         //   62: aload #18
/*     */                         //   64: getfield label : I
/*     */                         //   67: tableswitch default -> 386, 0 -> 88, 1 -> 330
/*     */                         //   88: aload #17
/*     */                         //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                         //   93: new kotlin/jvm/internal/Ref$ObjectRef
/*     */                         //   96: dup
/*     */                         //   97: invokespecial <init> : ()V
/*     */                         //   100: astore_3
/*     */                         //   101: aload_1
/*     */                         //   102: checkcast java/lang/Iterable
/*     */                         //   105: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1$emit$$inlined$compareByDescending$1
/*     */                         //   108: dup
/*     */                         //   109: invokespecial <init> : ()V
/*     */                         //   112: checkcast java/util/Comparator
/*     */                         //   115: invokestatic sortedWith : (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
/*     */                         //   118: checkcast java/lang/Iterable
/*     */                         //   121: astore #5
/*     */                         //   123: iconst_0
/*     */                         //   124: istore #6
/*     */                         //   126: aload #5
/*     */                         //   128: astore #7
/*     */                         //   130: new java/util/ArrayList
/*     */                         //   133: dup
/*     */                         //   134: aload #5
/*     */                         //   136: bipush #10
/*     */                         //   138: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */                         //   141: invokespecial <init> : (I)V
/*     */                         //   144: checkcast java/util/Collection
/*     */                         //   147: astore #8
/*     */                         //   149: iconst_0
/*     */                         //   150: istore #9
/*     */                         //   152: aload #7
/*     */                         //   154: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */                         //   159: astore #10
/*     */                         //   161: aload #10
/*     */                         //   163: invokeinterface hasNext : ()Z
/*     */                         //   168: ifeq -> 262
/*     */                         //   171: aload #10
/*     */                         //   173: invokeinterface next : ()Ljava/lang/Object;
/*     */                         //   178: astore #11
/*     */                         //   180: aload #8
/*     */                         //   182: aload #11
/*     */                         //   184: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain
/*     */                         //   187: astore #12
/*     */                         //   189: astore #16
/*     */                         //   191: iconst_0
/*     */                         //   192: istore #13
/*     */                         //   194: aload #12
/*     */                         //   196: invokestatic prettyDate : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;)Ljava/lang/String;
/*     */                         //   199: astore #14
/*     */                         //   201: aconst_null
/*     */                         //   202: astore #15
/*     */                         //   204: aload_3
/*     */                         //   205: getfield element : Ljava/lang/Object;
/*     */                         //   208: ifnull -> 223
/*     */                         //   211: aload #14
/*     */                         //   213: aload_3
/*     */                         //   214: getfield element : Ljava/lang/Object;
/*     */                         //   217: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */                         //   220: ifne -> 236
/*     */                         //   223: aload_3
/*     */                         //   224: aload #14
/*     */                         //   226: putfield element : Ljava/lang/Object;
/*     */                         //   229: aload #14
/*     */                         //   231: astore #15
/*     */                         //   233: goto -> 239
/*     */                         //   236: aconst_null
/*     */                         //   237: astore #15
/*     */                         //   239: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/SortedRecentTaskChain
/*     */                         //   242: dup
/*     */                         //   243: aload #12
/*     */                         //   245: aload #15
/*     */                         //   247: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;Ljava/lang/String;)V
/*     */                         //   250: aload #16
/*     */                         //   252: swap
/*     */                         //   253: invokeinterface add : (Ljava/lang/Object;)Z
/*     */                         //   258: pop
/*     */                         //   259: goto -> 161
/*     */                         //   262: aload #8
/*     */                         //   264: checkcast java/util/List
/*     */                         //   267: nop
/*     */                         //   268: astore #4
/*     */                         //   270: aload_0
/*     */                         //   271: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
/*     */                         //   274: invokestatic access$get_recentTasks$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */                         //   277: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/RecentTaskLoadState$Ready
/*     */                         //   280: dup
/*     */                         //   281: aload #4
/*     */                         //   283: checkcast java/lang/Iterable
/*     */                         //   286: invokestatic toImmutableList : (Ljava/lang/Iterable;)Lkotlinx/collections/immutable/ImmutableList;
/*     */                         //   289: checkcast java/util/List
/*     */                         //   292: invokespecial <init> : (Ljava/util/List;)V
/*     */                         //   295: aload #18
/*     */                         //   297: aload #18
/*     */                         //   299: aload_0
/*     */                         //   300: putfield L$0 : Ljava/lang/Object;
/*     */                         //   303: aload #18
/*     */                         //   305: aload #4
/*     */                         //   307: putfield L$1 : Ljava/lang/Object;
/*     */                         //   310: aload #18
/*     */                         //   312: iconst_1
/*     */                         //   313: putfield label : I
/*     */                         //   316: invokeinterface emit : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                         //   321: dup
/*     */                         //   322: aload #19
/*     */                         //   324: if_acmpne -> 356
/*     */                         //   327: aload #19
/*     */                         //   329: areturn
/*     */                         //   330: aload #18
/*     */                         //   332: getfield L$1 : Ljava/lang/Object;
/*     */                         //   335: checkcast java/util/List
/*     */                         //   338: astore #4
/*     */                         //   340: aload #18
/*     */                         //   342: getfield L$0 : Ljava/lang/Object;
/*     */                         //   345: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1
/*     */                         //   348: astore_0
/*     */                         //   349: aload #17
/*     */                         //   351: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                         //   354: aload #17
/*     */                         //   356: pop
/*     */                         //   357: aload #4
/*     */                         //   359: invokeinterface isEmpty : ()Z
/*     */                         //   364: ifeq -> 382
/*     */                         //   367: aload_0
/*     */                         //   368: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
/*     */                         //   371: invokevirtual getTaskExplorerSelectedTab : ()Landroidx/compose/runtime/MutableState;
/*     */                         //   374: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/TaskExplorerTabs.Favorites : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/TaskExplorerTabs;
/*     */                         //   377: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */                         //   382: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                         //   385: areturn
/*     */                         //   386: new java/lang/IllegalStateException
/*     */                         //   389: dup
/*     */                         //   390: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                         //   392: invokespecial <init> : (Ljava/lang/String;)V
/*     */                         //   395: athrow
/*     */                         // Line number table:
/*     */                         //   Java source line number -> byte code offset
/*     */                         //   #117	-> 60
/*     */                         //   #118	-> 93
/*     */                         //   #119	-> 101
/*     */                         //   #119	-> 115
/*     */                         //   #294	-> 126
/*     */                         //   #295	-> 152
/*     */                         //   #296	-> 180
/*     */                         //   #120	-> 194
/*     */                         //   #121	-> 201
/*     */                         //   #123	-> 204
/*     */                         //   #124	-> 223
/*     */                         //   #125	-> 229
/*     */                         //   #127	-> 236
/*     */                         //   #129	-> 239
/*     */                         //   #296	-> 253
/*     */                         //   #297	-> 262
/*     */                         //   #294	-> 267
/*     */                         //   #119	-> 268
/*     */                         //   #131	-> 270
/*     */                         //   #117	-> 327
/*     */                         //   #132	-> 356
/*     */                         //   #133	-> 367
/*     */                         //   #135	-> 382
/*     */                         //   #117	-> 386
/*     */                         // Local variable table:
/*     */                         //   start	length	slot	name	descriptor
/*     */                         //   93	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1;
/*     */                         //   115	215	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1;
/*     */                         //   349	33	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1;
/*     */                         //   93	12	1	taskChains	Lkotlinx/collections/immutable/ImmutableCollection;
/*     */                         //   101	14	3	prettyDate	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                         //   115	135	3	prettyDate	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                         //   250	12	3	prettyDate	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                         //   270	60	4	sortedRecentTaskChains	Ljava/util/List;
/*     */                         //   340	27	4	sortedRecentTaskChains	Ljava/util/List;
/*     */                         //   123	26	5	$this$map$iv	Ljava/lang/Iterable;
/*     */                         //   149	12	7	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */                         //   149	115	8	destination$iv$iv	Ljava/util/Collection;
/*     */                         //   180	11	11	item$iv$iv	Ljava/lang/Object;
/*     */                         //   191	59	12	task	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;
/*     */                         //   201	35	14	nextDate	Ljava/lang/String;
/*     */                         //   239	11	15	newPrettyDate	Ljava/lang/String;
/*     */                         //   194	56	13	$i$a$-map-NewTaskViewModelImpl$2$1$sortedRecentTaskChains$2	I
/*     */                         //   152	112	9	$i$f$mapTo	I
/*     */                         //   126	142	6	$i$f$map	I
/*     */                         //   0	396	2	$completion	Lkotlin/coroutines/Continuation;
/*     */                         //   50	336	18	$continuation	Lkotlin/coroutines/Continuation;
/*     */                         //   57	329	17	$result	Ljava/lang/Object;
/*     */                       }
/*     */                       
/*     */                       @DebugMetadata(f = "NewTaskViewModelImpl.kt", l = {131}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "sortedRecentTaskChains"}, m = "emit", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.NewTaskViewModelImpl$2$1")
/*     */                       @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */                       static final class NewTaskViewModelImpl$2$1$emit$1 extends ContinuationImpl {
/*     */                         Object L$0;
/*     */                         Object L$1;
/*     */                         int label;
/*     */                         
/*     */                         public final Object invokeSuspend(Object $result) {
/*     */                           this.result = $result;
/*     */                           this.label |= Integer.MIN_VALUE;
/*     */                           return NewTaskViewModelImpl.null.null.this.emit((ImmutableCollection<RecentTaskChain>)null, (Continuation<? super Unit>)this);
/*     */                         }
/*     */                       }
/*     */                     }(Continuation)this) == object)
/*     */                   return object; 
/*     */                 FlowKt.filterNotNull((Flow)RecentTaskChainService.Companion.getInstance(NewTaskViewModelImpl.this.getProject()).getRecentTaskChains((Continuation)this)).collect(new FlowCollector() {
/*     */                       public final Object emit(ImmutableCollection taskChains, Continuation $completion) {
/*     */                         // Byte code:
/*     */                         //   0: aload_2
/*     */                         //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1$emit$1
/*     */                         //   4: ifeq -> 39
/*     */                         //   7: aload_2
/*     */                         //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1$emit$1
/*     */                         //   11: astore #18
/*     */                         //   13: aload #18
/*     */                         //   15: getfield label : I
/*     */                         //   18: ldc -2147483648
/*     */                         //   20: iand
/*     */                         //   21: ifeq -> 39
/*     */                         //   24: aload #18
/*     */                         //   26: dup
/*     */                         //   27: getfield label : I
/*     */                         //   30: ldc -2147483648
/*     */                         //   32: isub
/*     */                         //   33: putfield label : I
/*     */                         //   36: goto -> 50
/*     */                         //   39: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1$emit$1
/*     */                         //   42: dup
/*     */                         //   43: aload_0
/*     */                         //   44: aload_2
/*     */                         //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1;Lkotlin/coroutines/Continuation;)V
/*     */                         //   48: astore #18
/*     */                         //   50: aload #18
/*     */                         //   52: getfield result : Ljava/lang/Object;
/*     */                         //   55: astore #17
/*     */                         //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                         //   60: astore #19
/*     */                         //   62: aload #18
/*     */                         //   64: getfield label : I
/*     */                         //   67: tableswitch default -> 386, 0 -> 88, 1 -> 330
/*     */                         //   88: aload #17
/*     */                         //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                         //   93: new kotlin/jvm/internal/Ref$ObjectRef
/*     */                         //   96: dup
/*     */                         //   97: invokespecial <init> : ()V
/*     */                         //   100: astore_3
/*     */                         //   101: aload_1
/*     */                         //   102: checkcast java/lang/Iterable
/*     */                         //   105: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1$emit$$inlined$compareByDescending$1
/*     */                         //   108: dup
/*     */                         //   109: invokespecial <init> : ()V
/*     */                         //   112: checkcast java/util/Comparator
/*     */                         //   115: invokestatic sortedWith : (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
/*     */                         //   118: checkcast java/lang/Iterable
/*     */                         //   121: astore #5
/*     */                         //   123: iconst_0
/*     */                         //   124: istore #6
/*     */                         //   126: aload #5
/*     */                         //   128: astore #7
/*     */                         //   130: new java/util/ArrayList
/*     */                         //   133: dup
/*     */                         //   134: aload #5
/*     */                         //   136: bipush #10
/*     */                         //   138: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */                         //   141: invokespecial <init> : (I)V
/*     */                         //   144: checkcast java/util/Collection
/*     */                         //   147: astore #8
/*     */                         //   149: iconst_0
/*     */                         //   150: istore #9
/*     */                         //   152: aload #7
/*     */                         //   154: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */                         //   159: astore #10
/*     */                         //   161: aload #10
/*     */                         //   163: invokeinterface hasNext : ()Z
/*     */                         //   168: ifeq -> 262
/*     */                         //   171: aload #10
/*     */                         //   173: invokeinterface next : ()Ljava/lang/Object;
/*     */                         //   178: astore #11
/*     */                         //   180: aload #8
/*     */                         //   182: aload #11
/*     */                         //   184: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain
/*     */                         //   187: astore #12
/*     */                         //   189: astore #16
/*     */                         //   191: iconst_0
/*     */                         //   192: istore #13
/*     */                         //   194: aload #12
/*     */                         //   196: invokestatic prettyDate : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;)Ljava/lang/String;
/*     */                         //   199: astore #14
/*     */                         //   201: aconst_null
/*     */                         //   202: astore #15
/*     */                         //   204: aload_3
/*     */                         //   205: getfield element : Ljava/lang/Object;
/*     */                         //   208: ifnull -> 223
/*     */                         //   211: aload #14
/*     */                         //   213: aload_3
/*     */                         //   214: getfield element : Ljava/lang/Object;
/*     */                         //   217: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */                         //   220: ifne -> 236
/*     */                         //   223: aload_3
/*     */                         //   224: aload #14
/*     */                         //   226: putfield element : Ljava/lang/Object;
/*     */                         //   229: aload #14
/*     */                         //   231: astore #15
/*     */                         //   233: goto -> 239
/*     */                         //   236: aconst_null
/*     */                         //   237: astore #15
/*     */                         //   239: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/SortedRecentTaskChain
/*     */                         //   242: dup
/*     */                         //   243: aload #12
/*     */                         //   245: aload #15
/*     */                         //   247: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;Ljava/lang/String;)V
/*     */                         //   250: aload #16
/*     */                         //   252: swap
/*     */                         //   253: invokeinterface add : (Ljava/lang/Object;)Z
/*     */                         //   258: pop
/*     */                         //   259: goto -> 161
/*     */                         //   262: aload #8
/*     */                         //   264: checkcast java/util/List
/*     */                         //   267: nop
/*     */                         //   268: astore #4
/*     */                         //   270: aload_0
/*     */                         //   271: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
/*     */                         //   274: invokestatic access$get_recentTasks$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */                         //   277: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/RecentTaskLoadState$Ready
/*     */                         //   280: dup
/*     */                         //   281: aload #4
/*     */                         //   283: checkcast java/lang/Iterable
/*     */                         //   286: invokestatic toImmutableList : (Ljava/lang/Iterable;)Lkotlinx/collections/immutable/ImmutableList;
/*     */                         //   289: checkcast java/util/List
/*     */                         //   292: invokespecial <init> : (Ljava/util/List;)V
/*     */                         //   295: aload #18
/*     */                         //   297: aload #18
/*     */                         //   299: aload_0
/*     */                         //   300: putfield L$0 : Ljava/lang/Object;
/*     */                         //   303: aload #18
/*     */                         //   305: aload #4
/*     */                         //   307: putfield L$1 : Ljava/lang/Object;
/*     */                         //   310: aload #18
/*     */                         //   312: iconst_1
/*     */                         //   313: putfield label : I
/*     */                         //   316: invokeinterface emit : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                         //   321: dup
/*     */                         //   322: aload #19
/*     */                         //   324: if_acmpne -> 356
/*     */                         //   327: aload #19
/*     */                         //   329: areturn
/*     */                         //   330: aload #18
/*     */                         //   332: getfield L$1 : Ljava/lang/Object;
/*     */                         //   335: checkcast java/util/List
/*     */                         //   338: astore #4
/*     */                         //   340: aload #18
/*     */                         //   342: getfield L$0 : Ljava/lang/Object;
/*     */                         //   345: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1
/*     */                         //   348: astore_0
/*     */                         //   349: aload #17
/*     */                         //   351: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                         //   354: aload #17
/*     */                         //   356: pop
/*     */                         //   357: aload #4
/*     */                         //   359: invokeinterface isEmpty : ()Z
/*     */                         //   364: ifeq -> 382
/*     */                         //   367: aload_0
/*     */                         //   368: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
/*     */                         //   371: invokevirtual getTaskExplorerSelectedTab : ()Landroidx/compose/runtime/MutableState;
/*     */                         //   374: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/TaskExplorerTabs.Favorites : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/TaskExplorerTabs;
/*     */                         //   377: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */                         //   382: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                         //   385: areturn
/*     */                         //   386: new java/lang/IllegalStateException
/*     */                         //   389: dup
/*     */                         //   390: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                         //   392: invokespecial <init> : (Ljava/lang/String;)V
/*     */                         //   395: athrow
/*     */                         // Line number table:
/*     */                         //   Java source line number -> byte code offset
/*     */                         //   #117	-> 60
/*     */                         //   #118	-> 93
/*     */                         //   #119	-> 101
/*     */                         //   #119	-> 115
/*     */                         //   #294	-> 126
/*     */                         //   #295	-> 152
/*     */                         //   #296	-> 180
/*     */                         //   #120	-> 194
/*     */                         //   #121	-> 201
/*     */                         //   #123	-> 204
/*     */                         //   #124	-> 223
/*     */                         //   #125	-> 229
/*     */                         //   #127	-> 236
/*     */                         //   #129	-> 239
/*     */                         //   #296	-> 253
/*     */                         //   #297	-> 262
/*     */                         //   #294	-> 267
/*     */                         //   #119	-> 268
/*     */                         //   #131	-> 270
/*     */                         //   #117	-> 327
/*     */                         //   #132	-> 356
/*     */                         //   #133	-> 367
/*     */                         //   #135	-> 382
/*     */                         //   #117	-> 386
/*     */                         // Local variable table:
/*     */                         //   start	length	slot	name	descriptor
/*     */                         //   93	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1;
/*     */                         //   115	215	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1;
/*     */                         //   349	33	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1;
/*     */                         //   93	12	1	taskChains	Lkotlinx/collections/immutable/ImmutableCollection;
/*     */                         //   101	14	3	prettyDate	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                         //   115	135	3	prettyDate	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                         //   250	12	3	prettyDate	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                         //   270	60	4	sortedRecentTaskChains	Ljava/util/List;
/*     */                         //   340	27	4	sortedRecentTaskChains	Ljava/util/List;
/*     */                         //   123	26	5	$this$map$iv	Ljava/lang/Iterable;
/*     */                         //   149	12	7	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */                         //   149	115	8	destination$iv$iv	Ljava/util/Collection;
/*     */                         //   180	11	11	item$iv$iv	Ljava/lang/Object;
/*     */                         //   191	59	12	task	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;
/*     */                         //   201	35	14	nextDate	Ljava/lang/String;
/*     */                         //   239	11	15	newPrettyDate	Ljava/lang/String;
/*     */                         //   194	56	13	$i$a$-map-NewTaskViewModelImpl$2$1$sortedRecentTaskChains$2	I
/*     */                         //   152	112	9	$i$f$mapTo	I
/*     */                         //   126	142	6	$i$f$map	I
/*     */                         //   0	396	2	$completion	Lkotlin/coroutines/Continuation;
/*     */                         //   50	336	18	$continuation	Lkotlin/coroutines/Continuation;
/*     */                         //   57	329	17	$result	Ljava/lang/Object;
/*     */                       }
/*     */                       
/*     */                       @DebugMetadata(f = "NewTaskViewModelImpl.kt", l = {131}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "sortedRecentTaskChains"}, m = "emit", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.NewTaskViewModelImpl$2$1")
/*     */                       @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */                       static final class NewTaskViewModelImpl$2$1$emit$1 extends ContinuationImpl {
/*     */                         Object L$0;
/*     */                         Object L$1;
/*     */                         int label;
/*     */                         
/*     */                         public final Object invokeSuspend(Object $result) {
/*     */                           this.result = $result;
/*     */                           this.label |= Integer.MIN_VALUE;
/*     */                           return NewTaskViewModelImpl.null.null.this.emit((ImmutableCollection<RecentTaskChain>)null, (Continuation<? super Unit>)this);
/*     */                         }
/*     */                       }
/*     */                     }(Continuation)this);
/*     */                 return Unit.INSTANCE;
/*     */               case 1:
/*     */                 ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                 this.label = 2;
/*     */                 if (FlowKt.filterNotNull((Flow)SYNTHETIC_LOCAL_VARIABLE_1).collect(new FlowCollector() {
/*     */                       public final Object emit(ImmutableCollection taskChains, Continuation $completion) {
/*     */                         // Byte code:
/*     */                         //   0: aload_2
/*     */                         //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1$emit$1
/*     */                         //   4: ifeq -> 39
/*     */                         //   7: aload_2
/*     */                         //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1$emit$1
/*     */                         //   11: astore #18
/*     */                         //   13: aload #18
/*     */                         //   15: getfield label : I
/*     */                         //   18: ldc -2147483648
/*     */                         //   20: iand
/*     */                         //   21: ifeq -> 39
/*     */                         //   24: aload #18
/*     */                         //   26: dup
/*     */                         //   27: getfield label : I
/*     */                         //   30: ldc -2147483648
/*     */                         //   32: isub
/*     */                         //   33: putfield label : I
/*     */                         //   36: goto -> 50
/*     */                         //   39: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1$emit$1
/*     */                         //   42: dup
/*     */                         //   43: aload_0
/*     */                         //   44: aload_2
/*     */                         //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1;Lkotlin/coroutines/Continuation;)V
/*     */                         //   48: astore #18
/*     */                         //   50: aload #18
/*     */                         //   52: getfield result : Ljava/lang/Object;
/*     */                         //   55: astore #17
/*     */                         //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                         //   60: astore #19
/*     */                         //   62: aload #18
/*     */                         //   64: getfield label : I
/*     */                         //   67: tableswitch default -> 386, 0 -> 88, 1 -> 330
/*     */                         //   88: aload #17
/*     */                         //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                         //   93: new kotlin/jvm/internal/Ref$ObjectRef
/*     */                         //   96: dup
/*     */                         //   97: invokespecial <init> : ()V
/*     */                         //   100: astore_3
/*     */                         //   101: aload_1
/*     */                         //   102: checkcast java/lang/Iterable
/*     */                         //   105: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1$emit$$inlined$compareByDescending$1
/*     */                         //   108: dup
/*     */                         //   109: invokespecial <init> : ()V
/*     */                         //   112: checkcast java/util/Comparator
/*     */                         //   115: invokestatic sortedWith : (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
/*     */                         //   118: checkcast java/lang/Iterable
/*     */                         //   121: astore #5
/*     */                         //   123: iconst_0
/*     */                         //   124: istore #6
/*     */                         //   126: aload #5
/*     */                         //   128: astore #7
/*     */                         //   130: new java/util/ArrayList
/*     */                         //   133: dup
/*     */                         //   134: aload #5
/*     */                         //   136: bipush #10
/*     */                         //   138: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */                         //   141: invokespecial <init> : (I)V
/*     */                         //   144: checkcast java/util/Collection
/*     */                         //   147: astore #8
/*     */                         //   149: iconst_0
/*     */                         //   150: istore #9
/*     */                         //   152: aload #7
/*     */                         //   154: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */                         //   159: astore #10
/*     */                         //   161: aload #10
/*     */                         //   163: invokeinterface hasNext : ()Z
/*     */                         //   168: ifeq -> 262
/*     */                         //   171: aload #10
/*     */                         //   173: invokeinterface next : ()Ljava/lang/Object;
/*     */                         //   178: astore #11
/*     */                         //   180: aload #8
/*     */                         //   182: aload #11
/*     */                         //   184: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain
/*     */                         //   187: astore #12
/*     */                         //   189: astore #16
/*     */                         //   191: iconst_0
/*     */                         //   192: istore #13
/*     */                         //   194: aload #12
/*     */                         //   196: invokestatic prettyDate : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;)Ljava/lang/String;
/*     */                         //   199: astore #14
/*     */                         //   201: aconst_null
/*     */                         //   202: astore #15
/*     */                         //   204: aload_3
/*     */                         //   205: getfield element : Ljava/lang/Object;
/*     */                         //   208: ifnull -> 223
/*     */                         //   211: aload #14
/*     */                         //   213: aload_3
/*     */                         //   214: getfield element : Ljava/lang/Object;
/*     */                         //   217: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */                         //   220: ifne -> 236
/*     */                         //   223: aload_3
/*     */                         //   224: aload #14
/*     */                         //   226: putfield element : Ljava/lang/Object;
/*     */                         //   229: aload #14
/*     */                         //   231: astore #15
/*     */                         //   233: goto -> 239
/*     */                         //   236: aconst_null
/*     */                         //   237: astore #15
/*     */                         //   239: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/SortedRecentTaskChain
/*     */                         //   242: dup
/*     */                         //   243: aload #12
/*     */                         //   245: aload #15
/*     */                         //   247: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;Ljava/lang/String;)V
/*     */                         //   250: aload #16
/*     */                         //   252: swap
/*     */                         //   253: invokeinterface add : (Ljava/lang/Object;)Z
/*     */                         //   258: pop
/*     */                         //   259: goto -> 161
/*     */                         //   262: aload #8
/*     */                         //   264: checkcast java/util/List
/*     */                         //   267: nop
/*     */                         //   268: astore #4
/*     */                         //   270: aload_0
/*     */                         //   271: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
/*     */                         //   274: invokestatic access$get_recentTasks$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */                         //   277: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/RecentTaskLoadState$Ready
/*     */                         //   280: dup
/*     */                         //   281: aload #4
/*     */                         //   283: checkcast java/lang/Iterable
/*     */                         //   286: invokestatic toImmutableList : (Ljava/lang/Iterable;)Lkotlinx/collections/immutable/ImmutableList;
/*     */                         //   289: checkcast java/util/List
/*     */                         //   292: invokespecial <init> : (Ljava/util/List;)V
/*     */                         //   295: aload #18
/*     */                         //   297: aload #18
/*     */                         //   299: aload_0
/*     */                         //   300: putfield L$0 : Ljava/lang/Object;
/*     */                         //   303: aload #18
/*     */                         //   305: aload #4
/*     */                         //   307: putfield L$1 : Ljava/lang/Object;
/*     */                         //   310: aload #18
/*     */                         //   312: iconst_1
/*     */                         //   313: putfield label : I
/*     */                         //   316: invokeinterface emit : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                         //   321: dup
/*     */                         //   322: aload #19
/*     */                         //   324: if_acmpne -> 356
/*     */                         //   327: aload #19
/*     */                         //   329: areturn
/*     */                         //   330: aload #18
/*     */                         //   332: getfield L$1 : Ljava/lang/Object;
/*     */                         //   335: checkcast java/util/List
/*     */                         //   338: astore #4
/*     */                         //   340: aload #18
/*     */                         //   342: getfield L$0 : Ljava/lang/Object;
/*     */                         //   345: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1
/*     */                         //   348: astore_0
/*     */                         //   349: aload #17
/*     */                         //   351: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                         //   354: aload #17
/*     */                         //   356: pop
/*     */                         //   357: aload #4
/*     */                         //   359: invokeinterface isEmpty : ()Z
/*     */                         //   364: ifeq -> 382
/*     */                         //   367: aload_0
/*     */                         //   368: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
/*     */                         //   371: invokevirtual getTaskExplorerSelectedTab : ()Landroidx/compose/runtime/MutableState;
/*     */                         //   374: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/TaskExplorerTabs.Favorites : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/TaskExplorerTabs;
/*     */                         //   377: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */                         //   382: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                         //   385: areturn
/*     */                         //   386: new java/lang/IllegalStateException
/*     */                         //   389: dup
/*     */                         //   390: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                         //   392: invokespecial <init> : (Ljava/lang/String;)V
/*     */                         //   395: athrow
/*     */                         // Line number table:
/*     */                         //   Java source line number -> byte code offset
/*     */                         //   #117	-> 60
/*     */                         //   #118	-> 93
/*     */                         //   #119	-> 101
/*     */                         //   #119	-> 115
/*     */                         //   #294	-> 126
/*     */                         //   #295	-> 152
/*     */                         //   #296	-> 180
/*     */                         //   #120	-> 194
/*     */                         //   #121	-> 201
/*     */                         //   #123	-> 204
/*     */                         //   #124	-> 223
/*     */                         //   #125	-> 229
/*     */                         //   #127	-> 236
/*     */                         //   #129	-> 239
/*     */                         //   #296	-> 253
/*     */                         //   #297	-> 262
/*     */                         //   #294	-> 267
/*     */                         //   #119	-> 268
/*     */                         //   #131	-> 270
/*     */                         //   #117	-> 327
/*     */                         //   #132	-> 356
/*     */                         //   #133	-> 367
/*     */                         //   #135	-> 382
/*     */                         //   #117	-> 386
/*     */                         // Local variable table:
/*     */                         //   start	length	slot	name	descriptor
/*     */                         //   93	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1;
/*     */                         //   115	215	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1;
/*     */                         //   349	33	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1;
/*     */                         //   93	12	1	taskChains	Lkotlinx/collections/immutable/ImmutableCollection;
/*     */                         //   101	14	3	prettyDate	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                         //   115	135	3	prettyDate	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                         //   250	12	3	prettyDate	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                         //   270	60	4	sortedRecentTaskChains	Ljava/util/List;
/*     */                         //   340	27	4	sortedRecentTaskChains	Ljava/util/List;
/*     */                         //   123	26	5	$this$map$iv	Ljava/lang/Iterable;
/*     */                         //   149	12	7	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */                         //   149	115	8	destination$iv$iv	Ljava/util/Collection;
/*     */                         //   180	11	11	item$iv$iv	Ljava/lang/Object;
/*     */                         //   191	59	12	task	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;
/*     */                         //   201	35	14	nextDate	Ljava/lang/String;
/*     */                         //   239	11	15	newPrettyDate	Ljava/lang/String;
/*     */                         //   194	56	13	$i$a$-map-NewTaskViewModelImpl$2$1$sortedRecentTaskChains$2	I
/*     */                         //   152	112	9	$i$f$mapTo	I
/*     */                         //   126	142	6	$i$f$map	I
/*     */                         //   0	396	2	$completion	Lkotlin/coroutines/Continuation;
/*     */                         //   50	336	18	$continuation	Lkotlin/coroutines/Continuation;
/*     */                         //   57	329	17	$result	Ljava/lang/Object;
/*     */                       }
/*     */                       
/*     */                       @DebugMetadata(f = "NewTaskViewModelImpl.kt", l = {131}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "sortedRecentTaskChains"}, m = "emit", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.NewTaskViewModelImpl$2$1")
/*     */                       @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */                       static final class NewTaskViewModelImpl$2$1$emit$1 extends ContinuationImpl {
/*     */                         Object L$0;
/*     */                         Object L$1;
/*     */                         int label;
/*     */                         
/*     */                         public final Object invokeSuspend(Object $result) {
/*     */                           this.result = $result;
/*     */                           this.label |= Integer.MIN_VALUE;
/*     */                           return NewTaskViewModelImpl.null.null.this.emit((ImmutableCollection<RecentTaskChain>)null, (Continuation<? super Unit>)this);
/*     */                         }
/*     */                       }
/*     */                     }(Continuation)this) == object)
/*     */                   return object; 
/*     */                 FlowKt.filterNotNull((Flow)SYNTHETIC_LOCAL_VARIABLE_1).collect(new FlowCollector() {
/*     */                       public final Object emit(ImmutableCollection taskChains, Continuation $completion) {
/*     */                         // Byte code:
/*     */                         //   0: aload_2
/*     */                         //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1$emit$1
/*     */                         //   4: ifeq -> 39
/*     */                         //   7: aload_2
/*     */                         //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1$emit$1
/*     */                         //   11: astore #18
/*     */                         //   13: aload #18
/*     */                         //   15: getfield label : I
/*     */                         //   18: ldc -2147483648
/*     */                         //   20: iand
/*     */                         //   21: ifeq -> 39
/*     */                         //   24: aload #18
/*     */                         //   26: dup
/*     */                         //   27: getfield label : I
/*     */                         //   30: ldc -2147483648
/*     */                         //   32: isub
/*     */                         //   33: putfield label : I
/*     */                         //   36: goto -> 50
/*     */                         //   39: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1$emit$1
/*     */                         //   42: dup
/*     */                         //   43: aload_0
/*     */                         //   44: aload_2
/*     */                         //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1;Lkotlin/coroutines/Continuation;)V
/*     */                         //   48: astore #18
/*     */                         //   50: aload #18
/*     */                         //   52: getfield result : Ljava/lang/Object;
/*     */                         //   55: astore #17
/*     */                         //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                         //   60: astore #19
/*     */                         //   62: aload #18
/*     */                         //   64: getfield label : I
/*     */                         //   67: tableswitch default -> 386, 0 -> 88, 1 -> 330
/*     */                         //   88: aload #17
/*     */                         //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                         //   93: new kotlin/jvm/internal/Ref$ObjectRef
/*     */                         //   96: dup
/*     */                         //   97: invokespecial <init> : ()V
/*     */                         //   100: astore_3
/*     */                         //   101: aload_1
/*     */                         //   102: checkcast java/lang/Iterable
/*     */                         //   105: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1$emit$$inlined$compareByDescending$1
/*     */                         //   108: dup
/*     */                         //   109: invokespecial <init> : ()V
/*     */                         //   112: checkcast java/util/Comparator
/*     */                         //   115: invokestatic sortedWith : (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
/*     */                         //   118: checkcast java/lang/Iterable
/*     */                         //   121: astore #5
/*     */                         //   123: iconst_0
/*     */                         //   124: istore #6
/*     */                         //   126: aload #5
/*     */                         //   128: astore #7
/*     */                         //   130: new java/util/ArrayList
/*     */                         //   133: dup
/*     */                         //   134: aload #5
/*     */                         //   136: bipush #10
/*     */                         //   138: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */                         //   141: invokespecial <init> : (I)V
/*     */                         //   144: checkcast java/util/Collection
/*     */                         //   147: astore #8
/*     */                         //   149: iconst_0
/*     */                         //   150: istore #9
/*     */                         //   152: aload #7
/*     */                         //   154: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */                         //   159: astore #10
/*     */                         //   161: aload #10
/*     */                         //   163: invokeinterface hasNext : ()Z
/*     */                         //   168: ifeq -> 262
/*     */                         //   171: aload #10
/*     */                         //   173: invokeinterface next : ()Ljava/lang/Object;
/*     */                         //   178: astore #11
/*     */                         //   180: aload #8
/*     */                         //   182: aload #11
/*     */                         //   184: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain
/*     */                         //   187: astore #12
/*     */                         //   189: astore #16
/*     */                         //   191: iconst_0
/*     */                         //   192: istore #13
/*     */                         //   194: aload #12
/*     */                         //   196: invokestatic prettyDate : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;)Ljava/lang/String;
/*     */                         //   199: astore #14
/*     */                         //   201: aconst_null
/*     */                         //   202: astore #15
/*     */                         //   204: aload_3
/*     */                         //   205: getfield element : Ljava/lang/Object;
/*     */                         //   208: ifnull -> 223
/*     */                         //   211: aload #14
/*     */                         //   213: aload_3
/*     */                         //   214: getfield element : Ljava/lang/Object;
/*     */                         //   217: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */                         //   220: ifne -> 236
/*     */                         //   223: aload_3
/*     */                         //   224: aload #14
/*     */                         //   226: putfield element : Ljava/lang/Object;
/*     */                         //   229: aload #14
/*     */                         //   231: astore #15
/*     */                         //   233: goto -> 239
/*     */                         //   236: aconst_null
/*     */                         //   237: astore #15
/*     */                         //   239: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/SortedRecentTaskChain
/*     */                         //   242: dup
/*     */                         //   243: aload #12
/*     */                         //   245: aload #15
/*     */                         //   247: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;Ljava/lang/String;)V
/*     */                         //   250: aload #16
/*     */                         //   252: swap
/*     */                         //   253: invokeinterface add : (Ljava/lang/Object;)Z
/*     */                         //   258: pop
/*     */                         //   259: goto -> 161
/*     */                         //   262: aload #8
/*     */                         //   264: checkcast java/util/List
/*     */                         //   267: nop
/*     */                         //   268: astore #4
/*     */                         //   270: aload_0
/*     */                         //   271: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
/*     */                         //   274: invokestatic access$get_recentTasks$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */                         //   277: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/RecentTaskLoadState$Ready
/*     */                         //   280: dup
/*     */                         //   281: aload #4
/*     */                         //   283: checkcast java/lang/Iterable
/*     */                         //   286: invokestatic toImmutableList : (Ljava/lang/Iterable;)Lkotlinx/collections/immutable/ImmutableList;
/*     */                         //   289: checkcast java/util/List
/*     */                         //   292: invokespecial <init> : (Ljava/util/List;)V
/*     */                         //   295: aload #18
/*     */                         //   297: aload #18
/*     */                         //   299: aload_0
/*     */                         //   300: putfield L$0 : Ljava/lang/Object;
/*     */                         //   303: aload #18
/*     */                         //   305: aload #4
/*     */                         //   307: putfield L$1 : Ljava/lang/Object;
/*     */                         //   310: aload #18
/*     */                         //   312: iconst_1
/*     */                         //   313: putfield label : I
/*     */                         //   316: invokeinterface emit : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                         //   321: dup
/*     */                         //   322: aload #19
/*     */                         //   324: if_acmpne -> 356
/*     */                         //   327: aload #19
/*     */                         //   329: areturn
/*     */                         //   330: aload #18
/*     */                         //   332: getfield L$1 : Ljava/lang/Object;
/*     */                         //   335: checkcast java/util/List
/*     */                         //   338: astore #4
/*     */                         //   340: aload #18
/*     */                         //   342: getfield L$0 : Ljava/lang/Object;
/*     */                         //   345: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1
/*     */                         //   348: astore_0
/*     */                         //   349: aload #17
/*     */                         //   351: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                         //   354: aload #17
/*     */                         //   356: pop
/*     */                         //   357: aload #4
/*     */                         //   359: invokeinterface isEmpty : ()Z
/*     */                         //   364: ifeq -> 382
/*     */                         //   367: aload_0
/*     */                         //   368: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
/*     */                         //   371: invokevirtual getTaskExplorerSelectedTab : ()Landroidx/compose/runtime/MutableState;
/*     */                         //   374: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/TaskExplorerTabs.Favorites : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/TaskExplorerTabs;
/*     */                         //   377: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */                         //   382: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                         //   385: areturn
/*     */                         //   386: new java/lang/IllegalStateException
/*     */                         //   389: dup
/*     */                         //   390: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                         //   392: invokespecial <init> : (Ljava/lang/String;)V
/*     */                         //   395: athrow
/*     */                         // Line number table:
/*     */                         //   Java source line number -> byte code offset
/*     */                         //   #117	-> 60
/*     */                         //   #118	-> 93
/*     */                         //   #119	-> 101
/*     */                         //   #119	-> 115
/*     */                         //   #294	-> 126
/*     */                         //   #295	-> 152
/*     */                         //   #296	-> 180
/*     */                         //   #120	-> 194
/*     */                         //   #121	-> 201
/*     */                         //   #123	-> 204
/*     */                         //   #124	-> 223
/*     */                         //   #125	-> 229
/*     */                         //   #127	-> 236
/*     */                         //   #129	-> 239
/*     */                         //   #296	-> 253
/*     */                         //   #297	-> 262
/*     */                         //   #294	-> 267
/*     */                         //   #119	-> 268
/*     */                         //   #131	-> 270
/*     */                         //   #117	-> 327
/*     */                         //   #132	-> 356
/*     */                         //   #133	-> 367
/*     */                         //   #135	-> 382
/*     */                         //   #117	-> 386
/*     */                         // Local variable table:
/*     */                         //   start	length	slot	name	descriptor
/*     */                         //   93	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1;
/*     */                         //   115	215	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1;
/*     */                         //   349	33	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1;
/*     */                         //   93	12	1	taskChains	Lkotlinx/collections/immutable/ImmutableCollection;
/*     */                         //   101	14	3	prettyDate	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                         //   115	135	3	prettyDate	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                         //   250	12	3	prettyDate	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                         //   270	60	4	sortedRecentTaskChains	Ljava/util/List;
/*     */                         //   340	27	4	sortedRecentTaskChains	Ljava/util/List;
/*     */                         //   123	26	5	$this$map$iv	Ljava/lang/Iterable;
/*     */                         //   149	12	7	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */                         //   149	115	8	destination$iv$iv	Ljava/util/Collection;
/*     */                         //   180	11	11	item$iv$iv	Ljava/lang/Object;
/*     */                         //   191	59	12	task	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;
/*     */                         //   201	35	14	nextDate	Ljava/lang/String;
/*     */                         //   239	11	15	newPrettyDate	Ljava/lang/String;
/*     */                         //   194	56	13	$i$a$-map-NewTaskViewModelImpl$2$1$sortedRecentTaskChains$2	I
/*     */                         //   152	112	9	$i$f$mapTo	I
/*     */                         //   126	142	6	$i$f$map	I
/*     */                         //   0	396	2	$completion	Lkotlin/coroutines/Continuation;
/*     */                         //   50	336	18	$continuation	Lkotlin/coroutines/Continuation;
/*     */                         //   57	329	17	$result	Ljava/lang/Object;
/*     */                       }
/*     */                       
/*     */                       @DebugMetadata(f = "NewTaskViewModelImpl.kt", l = {131}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "sortedRecentTaskChains"}, m = "emit", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.NewTaskViewModelImpl$2$1")
/*     */                       @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */                       static final class NewTaskViewModelImpl$2$1$emit$1 extends ContinuationImpl {
/*     */                         Object L$0;
/*     */                         Object L$1;
/*     */                         int label;
/*     */                         
/*     */                         public final Object invokeSuspend(Object $result) {
/*     */                           this.result = $result;
/*     */                           this.label |= Integer.MIN_VALUE;
/*     */                           return NewTaskViewModelImpl.null.null.this.emit((ImmutableCollection<RecentTaskChain>)null, (Continuation<? super Unit>)this);
/*     */                         }
/*     */                       }
/*     */                     }(Continuation)this);
/*     */                 return Unit.INSTANCE;
/*     */               case 2:
/*     */                 ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                 return Unit.INSTANCE;
/*     */             } 
/*     */             throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */           }
/*     */           
/*     */           public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */             return (Continuation)new Function2<>(NewTaskViewModelImpl.this, $completion);
/*     */           }
/*     */           
/*     */           public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */             return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */           }
/*     */         }3, null);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "ej-ui"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final LLMProxy llmProxy;
/*     */   @NotNull
/*     */   private final TaskService taskService;
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final Function1<LiveTaskChain, Unit> onOpenTaskPage;
/*     */   @NotNull
/*     */   private final Function0<Collection<JuniePreconditionChecker.JunieProblem>> checkForJunieProblems;
/*     */   @NotNull
/*     */   private final MatterhornPropertyProvider propertyProvider;
/*     */   @NotNull
/*     */   private final MutableState<PromptMode> promptMode;
/*     */   @NotNull
/*     */   private final MutableStateFlow<RecentTaskLoadState> _recentTasks;
/*     */   @NotNull
/*     */   private final StateFlow<RecentTaskLoadState> recentTasks;
/*     */   @NotNull
/*     */   private final MutableStateFlow<List<Tip>> tips;
/*     */   @NotNull
/*     */   private final TextFieldState textState;
/*     */   @NotNull
/*     */   private final SelectableLazyListState taskListState;
/*     */   @NotNull
/*     */   private final MutableState<TaskExplorerTabs> taskExplorerSelectedTab;
/*     */   @NotNull
/*     */   private final MutableStateFlow<ErrorInfo> errorInfo;
/*     */   @NotNull
/*     */   private final StateFlow<ErrorInfo> errorFlow;
/*     */   @NotNull
/*     */   private final AttachedFilesViewModel attachedFiles;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   static {
/*     */     int $i$f$logger = 0;
/*     */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(NewTaskViewModelImpl.class), "getInstance(...)");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final StateFlow<RecentTaskLoadState> getRecentTasks() {
/*     */     return this.recentTasks;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final MutableStateFlow<List<Tip>> getTips() {
/*     */     return this.tips;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public TextFieldState getTextState() {
/*     */     return this.textState;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final SelectableLazyListState getTaskListState() {
/*     */     return this.taskListState;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final MutableState<TaskExplorerTabs> getTaskExplorerSelectedTab() {
/*     */     return this.taskExplorerSelectedTab;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final StateFlow<ErrorInfo> getErrorFlow() {
/*     */     return this.errorFlow;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public AttachedFilesViewModel getAttachedFiles() {
/*     */     return this.attachedFiles;
/*     */   }
/*     */   
/*     */   public void submitTask(@NotNull PromptMode mode) {
/*     */     Intrinsics.checkNotNullParameter(mode, "mode");
/*     */     if (!((Collection)this.checkForJunieProblems.invoke()).isEmpty())
/*     */       return; 
/*     */     BuildersKt.launch$default(getScope(), null, null, new NewTaskViewModelImpl$submitTask$1(mode, null), 3, null);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "NewTaskViewModelImpl.kt", l = {143, 149, 152, 156, 173, 174}, i = {4, 5}, s = {"L$0", "L$0"}, n = {"taskChainId", "liveTaskChain"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.NewTaskViewModelImpl$submitTask$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   @SourceDebugExtension({"SMAP\nNewTaskViewModelImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewTaskViewModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$submitTask$1\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,293:1\n40#2,3:294\n1557#3:297\n1628#3,3:298\n*S KotlinDebug\n*F\n+ 1 NewTaskViewModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$submitTask$1\n*L\n149#1:294,3\n178#1:297\n178#1:298,3\n*E\n"})
/*     */   static final class NewTaskViewModelImpl$submitTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     NewTaskViewModelImpl$submitTask$1(PromptMode $mode, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #22
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 704, 0 -> 52, 1 -> 86, 2 -> 228, 3 -> 277, 4 -> 324, 5 -> 440, 6 -> 670
/*     */       //   52: aload_1
/*     */       //   53: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   56: invokestatic getConfig : ()Lcom/intellij/ml/llm/matterhorn/configuration/Env;
/*     */       //   59: invokevirtual getHasEAPLicenseAgreement : ()Z
/*     */       //   62: ifeq -> 98
/*     */       //   65: aload_0
/*     */       //   66: checkcast kotlin/coroutines/Continuation
/*     */       //   69: aload_0
/*     */       //   70: iconst_1
/*     */       //   71: putfield label : I
/*     */       //   74: invokestatic checkAgreements : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   77: dup
/*     */       //   78: aload #22
/*     */       //   80: if_acmpne -> 91
/*     */       //   83: aload #22
/*     */       //   85: areturn
/*     */       //   86: aload_1
/*     */       //   87: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   90: aload_1
/*     */       //   91: ifnull -> 98
/*     */       //   94: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   97: areturn
/*     */       //   98: getstatic com/intellij/ml/llm/matterhorn/ej/ui/statistics/CompositeUiAction.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/statistics/CompositeUiAction;
/*     */       //   101: iconst_0
/*     */       //   102: invokevirtual logSubmitTask : (Z)V
/*     */       //   105: aload_0
/*     */       //   106: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
/*     */       //   109: invokevirtual getLlmProxy : ()Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;
/*     */       //   112: instanceof com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy
/*     */       //   115: ifeq -> 362
/*     */       //   118: iconst_0
/*     */       //   119: istore #4
/*     */       //   121: ldc com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService
/*     */       //   123: astore #5
/*     */       //   125: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */       //   128: aload #5
/*     */       //   130: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*     */       //   135: dup
/*     */       //   136: ifnonnull -> 203
/*     */       //   139: pop
/*     */       //   140: new java/lang/RuntimeException
/*     */       //   143: dup
/*     */       //   144: new java/lang/StringBuilder
/*     */       //   147: dup
/*     */       //   148: invokespecial <init> : ()V
/*     */       //   151: ldc 'Cannot find service '
/*     */       //   153: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   156: aload #5
/*     */       //   158: invokevirtual getName : ()Ljava/lang/String;
/*     */       //   161: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   164: ldc ' (classloader='
/*     */       //   166: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   169: aload #5
/*     */       //   171: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
/*     */       //   174: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */       //   177: ldc ', client='
/*     */       //   179: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   182: getstatic com/intellij/codeWithMe/ClientId.Companion : Lcom/intellij/codeWithMe/ClientId$Companion;
/*     */       //   185: invokevirtual getCurrentOrNull : ()Lcom/intellij/codeWithMe/ClientId;
/*     */       //   188: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */       //   191: bipush #41
/*     */       //   193: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */       //   196: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   199: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   202: athrow
/*     */       //   203: nop
/*     */       //   204: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService
/*     */       //   207: aload_0
/*     */       //   208: checkcast kotlin/coroutines/Continuation
/*     */       //   211: aload_0
/*     */       //   212: iconst_2
/*     */       //   213: putfield label : I
/*     */       //   216: invokevirtual getAccessToken : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   219: dup
/*     */       //   220: aload #22
/*     */       //   222: if_acmpne -> 233
/*     */       //   225: aload #22
/*     */       //   227: areturn
/*     */       //   228: aload_1
/*     */       //   229: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   232: aload_1
/*     */       //   233: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken
/*     */       //   236: astore_3
/*     */       //   237: aload_3
/*     */       //   238: ifnonnull -> 358
/*     */       //   241: nop
/*     */       //   242: getstatic com/intellij/ml/llm/matterhorn/llm/ModelParameters.Companion : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters$Companion;
/*     */       //   245: ldc 'SubmitNewTask'
/*     */       //   247: getstatic com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService.Companion : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$Companion;
/*     */       //   250: invokevirtual getInstance : ()Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*     */       //   253: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   256: aload_0
/*     */       //   257: checkcast kotlin/coroutines/Continuation
/*     */       //   260: aload_0
/*     */       //   261: iconst_3
/*     */       //   262: putfield label : I
/*     */       //   265: invokevirtual getDefaultModel : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   268: dup
/*     */       //   269: aload #22
/*     */       //   271: if_acmpne -> 283
/*     */       //   274: aload #22
/*     */       //   276: areturn
/*     */       //   277: nop
/*     */       //   278: aload_1
/*     */       //   279: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   282: aload_1
/*     */       //   283: checkcast com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*     */       //   286: astore #4
/*     */       //   288: aload #4
/*     */       //   290: invokevirtual getModel : ()Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */       //   293: invokevirtual getProvider : ()Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;
/*     */       //   296: aload_0
/*     */       //   297: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
/*     */       //   300: invokevirtual getPropertyProvider : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   303: aload_0
/*     */       //   304: checkcast kotlin/coroutines/Continuation
/*     */       //   307: aload_0
/*     */       //   308: iconst_4
/*     */       //   309: putfield label : I
/*     */       //   312: invokestatic getKey : (Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   315: dup
/*     */       //   316: aload #22
/*     */       //   318: if_acmpne -> 330
/*     */       //   321: aload #22
/*     */       //   323: areturn
/*     */       //   324: nop
/*     */       //   325: aload_1
/*     */       //   326: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   329: aload_1
/*     */       //   330: pop
/*     */       //   331: iconst_0
/*     */       //   332: istore #4
/*     */       //   334: goto -> 353
/*     */       //   337: astore #5
/*     */       //   339: invokestatic access$getLogger$cp : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   342: aload #5
/*     */       //   344: checkcast java/lang/Throwable
/*     */       //   347: invokevirtual warn : (Ljava/lang/Throwable;)V
/*     */       //   350: iconst_1
/*     */       //   351: istore #4
/*     */       //   353: iload #4
/*     */       //   355: goto -> 363
/*     */       //   358: iconst_0
/*     */       //   359: goto -> 363
/*     */       //   362: iconst_0
/*     */       //   363: istore_2
/*     */       //   364: iload_2
/*     */       //   365: ifeq -> 397
/*     */       //   368: aload_0
/*     */       //   369: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
/*     */       //   372: invokestatic access$getErrorInfo$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   375: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo
/*     */       //   378: dup
/*     */       //   379: ldc 'LLM key or provider is not configured.'
/*     */       //   381: ldc 'Settings...'
/*     */       //   383: aconst_null
/*     */       //   384: iconst_4
/*     */       //   385: aconst_null
/*     */       //   386: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */       //   389: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */       //   394: goto -> 700
/*     */       //   397: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId$Companion;
/*     */       //   400: invokevirtual new : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */       //   403: astore_3
/*     */       //   404: aload_0
/*     */       //   405: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
/*     */       //   408: invokevirtual getTaskService : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService;
/*     */       //   411: aload_3
/*     */       //   412: aload_0
/*     */       //   413: checkcast kotlin/coroutines/Continuation
/*     */       //   416: aload_0
/*     */       //   417: aload_3
/*     */       //   418: putfield L$0 : Ljava/lang/Object;
/*     */       //   421: aload_0
/*     */       //   422: iconst_5
/*     */       //   423: putfield label : I
/*     */       //   426: invokeinterface observeTaskChain : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   431: dup
/*     */       //   432: aload #22
/*     */       //   434: if_acmpne -> 453
/*     */       //   437: aload #22
/*     */       //   439: areturn
/*     */       //   440: aload_0
/*     */       //   441: getfield L$0 : Ljava/lang/Object;
/*     */       //   444: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId
/*     */       //   447: astore_3
/*     */       //   448: aload_1
/*     */       //   449: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   452: aload_1
/*     */       //   453: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskChain
/*     */       //   456: astore #4
/*     */       //   458: aload_0
/*     */       //   459: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
/*     */       //   462: invokevirtual getTaskService : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService;
/*     */       //   465: aload_3
/*     */       //   466: aload_0
/*     */       //   467: getfield $mode : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;
/*     */       //   470: invokestatic toTaskType : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;)Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;
/*     */       //   473: aload_0
/*     */       //   474: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
/*     */       //   477: invokevirtual getTextState : ()Landroidx/compose/foundation/text/input/TextFieldState;
/*     */       //   480: invokevirtual getText : ()Ljava/lang/CharSequence;
/*     */       //   483: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   486: aload_0
/*     */       //   487: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
/*     */       //   490: invokevirtual getAttachedFiles : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;
/*     */       //   493: invokevirtual getAttachedFiles : ()Lkotlinx/coroutines/flow/StateFlow;
/*     */       //   496: invokeinterface getValue : ()Ljava/lang/Object;
/*     */       //   501: checkcast java/lang/Iterable
/*     */       //   504: astore #5
/*     */       //   506: astore #17
/*     */       //   508: astore #16
/*     */       //   510: astore #15
/*     */       //   512: astore #14
/*     */       //   514: iconst_0
/*     */       //   515: istore #6
/*     */       //   517: aload #5
/*     */       //   519: astore #7
/*     */       //   521: new java/util/ArrayList
/*     */       //   524: dup
/*     */       //   525: aload #5
/*     */       //   527: bipush #10
/*     */       //   529: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */       //   532: invokespecial <init> : (I)V
/*     */       //   535: checkcast java/util/Collection
/*     */       //   538: astore #8
/*     */       //   540: iconst_0
/*     */       //   541: istore #9
/*     */       //   543: aload #7
/*     */       //   545: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   550: astore #10
/*     */       //   552: aload #10
/*     */       //   554: invokeinterface hasNext : ()Z
/*     */       //   559: ifeq -> 602
/*     */       //   562: aload #10
/*     */       //   564: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   569: astore #11
/*     */       //   571: aload #8
/*     */       //   573: aload #11
/*     */       //   575: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFile
/*     */       //   578: astore #12
/*     */       //   580: astore #18
/*     */       //   582: iconst_0
/*     */       //   583: istore #13
/*     */       //   585: aload #12
/*     */       //   587: invokevirtual getPath : ()Ljava/nio/file/Path;
/*     */       //   590: aload #18
/*     */       //   592: swap
/*     */       //   593: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   598: pop
/*     */       //   599: goto -> 552
/*     */       //   602: aload #8
/*     */       //   604: checkcast java/util/List
/*     */       //   607: nop
/*     */       //   608: astore #18
/*     */       //   610: aload #14
/*     */       //   612: aload #15
/*     */       //   614: aload #16
/*     */       //   616: aload #17
/*     */       //   618: aload #18
/*     */       //   620: astore #19
/*     */       //   622: astore #20
/*     */       //   624: astore #21
/*     */       //   626: new com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/ExplicitTaskContext
/*     */       //   629: dup
/*     */       //   630: aload #21
/*     */       //   632: aload #20
/*     */       //   634: aload #19
/*     */       //   636: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;Ljava/lang/String;Ljava/util/List;)V
/*     */       //   639: aconst_null
/*     */       //   640: aload_0
/*     */       //   641: checkcast kotlin/coroutines/Continuation
/*     */       //   644: aload_0
/*     */       //   645: aload #4
/*     */       //   647: putfield L$0 : Ljava/lang/Object;
/*     */       //   650: aload_0
/*     */       //   651: bipush #6
/*     */       //   653: putfield label : I
/*     */       //   656: invokeinterface start : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/ExplicitTaskContext;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   661: dup
/*     */       //   662: aload #22
/*     */       //   664: if_acmpne -> 684
/*     */       //   667: aload #22
/*     */       //   669: areturn
/*     */       //   670: aload_0
/*     */       //   671: getfield L$0 : Ljava/lang/Object;
/*     */       //   674: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskChain
/*     */       //   677: astore #4
/*     */       //   679: aload_1
/*     */       //   680: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   683: aload_1
/*     */       //   684: pop
/*     */       //   685: aload_0
/*     */       //   686: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
/*     */       //   689: invokevirtual getOnOpenTaskPage : ()Lkotlin/jvm/functions/Function1;
/*     */       //   692: aload #4
/*     */       //   694: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   699: pop
/*     */       //   700: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   703: areturn
/*     */       //   704: new java/lang/IllegalStateException
/*     */       //   707: dup
/*     */       //   708: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   711: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   714: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #141	-> 3
/*     */       //   #142	-> 56
/*     */       //   #143	-> 65
/*     */       //   #141	-> 83
/*     */       //   #143	-> 91
/*     */       //   #146	-> 98
/*     */       //   #148	-> 105
/*     */       //   #149	-> 118
/*     */       //   #294	-> 121
/*     */       //   #295	-> 125
/*     */       //   #296	-> 140
/*     */       //   #295	-> 203
/*     */       //   #149	-> 211
/*     */       //   #141	-> 225
/*     */       //   #150	-> 237
/*     */       //   #151	-> 241
/*     */       //   #152	-> 242
/*     */       //   #153	-> 245
/*     */       //   #154	-> 247
/*     */       //   #152	-> 260
/*     */       //   #141	-> 274
/*     */       //   #156	-> 288
/*     */       //   #141	-> 321
/*     */       //   #157	-> 330
/*     */       //   #158	-> 337
/*     */       //   #159	-> 339
/*     */       //   #160	-> 350
/*     */       //   #163	-> 358
/*     */       //   #166	-> 362
/*     */       //   #148	-> 363
/*     */       //   #169	-> 364
/*     */       //   #170	-> 368
/*     */       //   #172	-> 397
/*     */       //   #173	-> 404
/*     */       //   #141	-> 437
/*     */       //   #174	-> 458
/*     */       //   #175	-> 465
/*     */       //   #176	-> 466
/*     */       //   #177	-> 473
/*     */       //   #178	-> 486
/*     */       //   #297	-> 517
/*     */       //   #298	-> 543
/*     */       //   #299	-> 571
/*     */       //   #178	-> 585
/*     */       //   #299	-> 593
/*     */       //   #300	-> 602
/*     */       //   #297	-> 607
/*     */       //   #175	-> 620
/*     */       //   #180	-> 639
/*     */       //   #174	-> 644
/*     */       //   #141	-> 667
/*     */       //   #182	-> 684
/*     */       //   #185	-> 700
/*     */       //   #141	-> 704
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   364	4	2	requiresSetup	Z
/*     */       //   237	4	3	accessToken	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;
/*     */       //   404	36	3	taskChainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */       //   448	18	3	taskChainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */       //   288	27	4	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */       //   458	212	4	liveTaskChain	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskChain;
/*     */       //   679	21	4	liveTaskChain	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskChain;
/*     */       //   125	79	5	serviceClass$iv	Ljava/lang/Class;
/*     */       //   339	14	5	e	Ljava/lang/Exception;
/*     */       //   514	26	5	$this$map$iv	Ljava/lang/Iterable;
/*     */       //   540	12	7	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */       //   540	64	8	destination$iv$iv	Ljava/util/Collection;
/*     */       //   571	28	11	item$iv$iv	Ljava/lang/Object;
/*     */       //   582	8	12	it	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFile;
/*     */       //   121	83	4	$i$f$service	I
/*     */       //   585	5	13	$i$a$-map-NewTaskViewModelImpl$submitTask$1$1	I
/*     */       //   543	61	9	$i$f$mapTo	I
/*     */       //   517	91	6	$i$f$map	I
/*     */       //   0	715	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$submitTask$1;
/*     */       //   56	648	1	$result	Ljava/lang/Object;
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   241	268	337	java/lang/Exception
/*     */       //   277	315	337	java/lang/Exception
/*     */       //   324	334	337	java/lang/Exception
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super NewTaskViewModelImpl$submitTask$1> $completion) {
/*     */       return (Continuation<Unit>)new NewTaskViewModelImpl$submitTask$1(this.$mode, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((NewTaskViewModelImpl$submitTask$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   public final void openTaskPage(@NotNull TaskChainId taskChainId) {
/*     */     Intrinsics.checkNotNullParameter(taskChainId, "taskChainId");
/*     */     BuildersKt.launch$default(getScope(), null, null, new NewTaskViewModelImpl$openTaskPage$1(taskChainId, null), 3, null);
/*     */     CompositeUiAction.INSTANCE.logTaskReopenFromHistory(taskChainId);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "NewTaskViewModelImpl.kt", l = {190}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.NewTaskViewModelImpl$openTaskPage$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class NewTaskViewModelImpl$openTaskPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     NewTaskViewModelImpl$openTaskPage$1(TaskChainId $taskChainId, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       LiveTaskChain liveTaskChain;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (NewTaskViewModelImpl.this.getTaskService().observeTaskChain(this.$taskChainId, (Continuation)this) == object)
/*     */             return object; 
/*     */           liveTaskChain = (LiveTaskChain)NewTaskViewModelImpl.this.getTaskService().observeTaskChain(this.$taskChainId, (Continuation)this);
/*     */           NewTaskViewModelImpl.this.getOnOpenTaskPage().invoke(liveTaskChain);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           liveTaskChain = (LiveTaskChain)SYNTHETIC_LOCAL_VARIABLE_1;
/*     */           NewTaskViewModelImpl.this.getOnOpenTaskPage().invoke(liveTaskChain);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super NewTaskViewModelImpl$openTaskPage$1> $completion) {
/*     */       return (Continuation<Unit>)new NewTaskViewModelImpl$openTaskPage$1(this.$taskChainId, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((NewTaskViewModelImpl$openTaskPage$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<ContextMenuItem> getTaskContextActions(@NotNull SortedRecentTaskChain task, int recentTaskCount) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'task'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: new java/util/ArrayList
/*     */     //   10: dup
/*     */     //   11: invokespecial <init> : ()V
/*     */     //   14: checkcast java/util/List
/*     */     //   17: astore_3
/*     */     //   18: aload_1
/*     */     //   19: invokevirtual getChain : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;
/*     */     //   22: invokevirtual getState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   25: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Running : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   28: if_acmpne -> 58
/*     */     //   31: aload_3
/*     */     //   32: new androidx/compose/foundation/ContextMenuItem
/*     */     //   35: dup
/*     */     //   36: ldc_w 'Stop'
/*     */     //   39: aload_0
/*     */     //   40: aload_1
/*     */     //   41: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/SortedRecentTaskChain;)Lkotlin/jvm/functions/Function0;
/*     */     //   46: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*     */     //   49: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   54: pop
/*     */     //   55: goto -> 182
/*     */     //   58: aload_3
/*     */     //   59: new androidx/compose/foundation/ContextMenuItem
/*     */     //   62: dup
/*     */     //   63: ldc_w 'Start again'
/*     */     //   66: aload_0
/*     */     //   67: aload_1
/*     */     //   68: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/SortedRecentTaskChain;)Lkotlin/jvm/functions/Function0;
/*     */     //   73: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*     */     //   76: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   81: pop
/*     */     //   82: aload_1
/*     */     //   83: invokevirtual getChain : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;
/*     */     //   86: invokevirtual getState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   89: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Finished : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   92: if_acmpne -> 119
/*     */     //   95: aload_3
/*     */     //   96: new androidx/compose/foundation/ContextMenuItem
/*     */     //   99: dup
/*     */     //   100: ldc_w 'Rollback'
/*     */     //   103: aload_0
/*     */     //   104: aload_1
/*     */     //   105: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/SortedRecentTaskChain;)Lkotlin/jvm/functions/Function0;
/*     */     //   110: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*     */     //   113: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   118: pop
/*     */     //   119: aload_3
/*     */     //   120: getstatic org/jetbrains/jewel/ui/component/ContextMenuDivider.INSTANCE : Lorg/jetbrains/jewel/ui/component/ContextMenuDivider;
/*     */     //   123: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   128: pop
/*     */     //   129: aload_3
/*     */     //   130: new androidx/compose/foundation/ContextMenuItem
/*     */     //   133: dup
/*     */     //   134: ldc_w 'Delete'
/*     */     //   137: aload_0
/*     */     //   138: aload_1
/*     */     //   139: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/SortedRecentTaskChain;)Lkotlin/jvm/functions/Function0;
/*     */     //   144: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*     */     //   147: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   152: pop
/*     */     //   153: iload_2
/*     */     //   154: iconst_1
/*     */     //   155: if_icmple -> 182
/*     */     //   158: aload_3
/*     */     //   159: new androidx/compose/foundation/ContextMenuItem
/*     */     //   162: dup
/*     */     //   163: ldc_w 'Delete All'
/*     */     //   166: aload_0
/*     */     //   167: aload_1
/*     */     //   168: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/SortedRecentTaskChain;)Lkotlin/jvm/functions/Function0;
/*     */     //   173: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*     */     //   176: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   181: pop
/*     */     //   182: aload_3
/*     */     //   183: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #197	-> 7
/*     */     //   #197	-> 17
/*     */     //   #199	-> 18
/*     */     //   #200	-> 31
/*     */     //   #207	-> 58
/*     */     //   #214	-> 82
/*     */     //   #218	-> 95
/*     */     //   #226	-> 119
/*     */     //   #228	-> 129
/*     */     //   #235	-> 153
/*     */     //   #236	-> 158
/*     */     //   #245	-> 182
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   18	166	3	actions	Ljava/util/List;
/*     */     //   0	184	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
/*     */     //   0	184	1	task	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/SortedRecentTaskChain;
/*     */     //   0	184	2	recentTaskCount	I
/*     */   }
/*     */   
/*     */   private static final Unit getTaskContextActions$lambda$0(NewTaskViewModelImpl this$0, SortedRecentTaskChain $task) {
/*     */     BuildersKt.launch$default(this$0.getScope(), null, null, new NewTaskViewModelImpl$getTaskContextActions$1$1($task, null), 3, null);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "NewTaskViewModelImpl.kt", l = {202}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.NewTaskViewModelImpl$getTaskContextActions$1$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class NewTaskViewModelImpl$getTaskContextActions$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     NewTaskViewModelImpl$getTaskContextActions$1$1(SortedRecentTaskChain $task, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (NewTaskViewModelImpl.this.getTaskService().stop(this.$task.getChain().getTaskChainId(), (Continuation)this) == object)
/*     */             return object; 
/*     */           NewTaskViewModelImpl.this.getTaskService().stop(this.$task.getChain().getTaskChainId(), (Continuation)this);
/*     */           CompositeUiAction.INSTANCE.logStopTaskMenuClicked(this.$task.getChain().getTaskChainId());
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           CompositeUiAction.INSTANCE.logStopTaskMenuClicked(this.$task.getChain().getTaskChainId());
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super NewTaskViewModelImpl$getTaskContextActions$1$1> $completion) {
/*     */       return (Continuation<Unit>)new NewTaskViewModelImpl$getTaskContextActions$1$1(this.$task, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((NewTaskViewModelImpl$getTaskContextActions$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Unit getTaskContextActions$lambda$1(NewTaskViewModelImpl this$0, SortedRecentTaskChain $task) {
/*     */     BuildersKt.launch$default(this$0.getScope(), null, null, new NewTaskViewModelImpl$getTaskContextActions$2$1($task, null), 3, null);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "NewTaskViewModelImpl.kt", l = {209}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.NewTaskViewModelImpl$getTaskContextActions$2$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class NewTaskViewModelImpl$getTaskContextActions$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     NewTaskViewModelImpl$getTaskContextActions$2$1(SortedRecentTaskChain $task, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       NewTaskViewModelImpl newTaskViewModelImpl;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.L$0 = newTaskViewModelImpl = NewTaskViewModelImpl.this;
/*     */           this.label = 1;
/*     */           if (NewTaskViewModelImpl.this.getTaskService().observeTaskChain(this.$task.getChain().getTaskChainId(), (Continuation)this) == object)
/*     */             return object; 
/*     */           newTaskViewModelImpl.copyDescriptionAndFiles((LiveTaskChain)NewTaskViewModelImpl.this.getTaskService().observeTaskChain(this.$task.getChain().getTaskChainId(), (Continuation)this));
/*     */           CompositeUiAction.INSTANCE.logStartAgainTaskMenuClicked(this.$task.getChain().getTaskChainId());
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           newTaskViewModelImpl = (NewTaskViewModelImpl)this.L$0;
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           newTaskViewModelImpl.copyDescriptionAndFiles((LiveTaskChain)SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           CompositeUiAction.INSTANCE.logStartAgainTaskMenuClicked(this.$task.getChain().getTaskChainId());
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super NewTaskViewModelImpl$getTaskContextActions$2$1> $completion) {
/*     */       return (Continuation<Unit>)new NewTaskViewModelImpl$getTaskContextActions$2$1(this.$task, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((NewTaskViewModelImpl$getTaskContextActions$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Unit getTaskContextActions$lambda$2(NewTaskViewModelImpl this$0, SortedRecentTaskChain $task) {
/*     */     BuildersKt.launch$default(this$0.getScope(), null, null, new NewTaskViewModelImpl$getTaskContextActions$3$1($task, null), 3, null);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "NewTaskViewModelImpl.kt", l = {220}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.NewTaskViewModelImpl$getTaskContextActions$3$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class NewTaskViewModelImpl$getTaskContextActions$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     NewTaskViewModelImpl$getTaskContextActions$3$1(SortedRecentTaskChain $task, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (NewTaskViewModelImpl.this.getTaskService().declineStartingFrom(this.$task.getChain().getTaskChainId(), null, (Continuation)this) == object)
/*     */             return object; 
/*     */           NewTaskViewModelImpl.this.getTaskService().declineStartingFrom(this.$task.getChain().getTaskChainId(), null, (Continuation)this);
/*     */           CompositeUiAction.INSTANCE.logRollbackTaskMenuClicked(this.$task.getChain().getTaskChainId());
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           CompositeUiAction.INSTANCE.logRollbackTaskMenuClicked(this.$task.getChain().getTaskChainId());
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super NewTaskViewModelImpl$getTaskContextActions$3$1> $completion) {
/*     */       return (Continuation<Unit>)new NewTaskViewModelImpl$getTaskContextActions$3$1(this.$task, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((NewTaskViewModelImpl$getTaskContextActions$3$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Unit getTaskContextActions$lambda$3(NewTaskViewModelImpl this$0, SortedRecentTaskChain $task) {
/*     */     BuildersKt.launch$default(this$0.getScope(), null, null, new NewTaskViewModelImpl$getTaskContextActions$4$1($task, null), 3, null);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "NewTaskViewModelImpl.kt", l = {230}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.NewTaskViewModelImpl$getTaskContextActions$4$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class NewTaskViewModelImpl$getTaskContextActions$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     NewTaskViewModelImpl$getTaskContextActions$4$1(SortedRecentTaskChain $task, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (RecentTaskChainService.Companion.getInstance(NewTaskViewModelImpl.this.getProject()).removeTask(this.$task.getChain().getTaskChainId(), (Continuation)this) == object)
/*     */             return object; 
/*     */           RecentTaskChainService.Companion.getInstance(NewTaskViewModelImpl.this.getProject()).removeTask(this.$task.getChain().getTaskChainId(), (Continuation)this);
/*     */           CompositeUiAction.INSTANCE.logDeleteTaskMenuClicked(this.$task.getChain().getTaskChainId());
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           CompositeUiAction.INSTANCE.logDeleteTaskMenuClicked(this.$task.getChain().getTaskChainId());
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super NewTaskViewModelImpl$getTaskContextActions$4$1> $completion) {
/*     */       return (Continuation<Unit>)new NewTaskViewModelImpl$getTaskContextActions$4$1(this.$task, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((NewTaskViewModelImpl$getTaskContextActions$4$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Unit getTaskContextActions$lambda$4(NewTaskViewModelImpl this$0, SortedRecentTaskChain $task) {
/*     */     BuildersKt.launch$default(this$0.getScope(), null, null, new NewTaskViewModelImpl$getTaskContextActions$5$1($task, null), 3, null);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "NewTaskViewModelImpl.kt", l = {238}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.NewTaskViewModelImpl$getTaskContextActions$5$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class NewTaskViewModelImpl$getTaskContextActions$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     NewTaskViewModelImpl$getTaskContextActions$5$1(SortedRecentTaskChain $task, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (RecentTaskChainService.Companion.getInstance(NewTaskViewModelImpl.this.getProject()).removeAllTasks((Continuation)this) == object)
/*     */             return object; 
/*     */           RecentTaskChainService.Companion.getInstance(NewTaskViewModelImpl.this.getProject()).removeAllTasks((Continuation)this);
/*     */           CompositeUiAction.INSTANCE.logDeleteAllTaskMenuClicked(this.$task.getChain().getTaskChainId());
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           CompositeUiAction.INSTANCE.logDeleteAllTaskMenuClicked(this.$task.getChain().getTaskChainId());
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super NewTaskViewModelImpl$getTaskContextActions$5$1> $completion) {
/*     */       return (Continuation<Unit>)new NewTaskViewModelImpl$getTaskContextActions$5$1(this.$task, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((NewTaskViewModelImpl$getTaskContextActions$5$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   public final void checkStartAgain(@NotNull ViewModel currentPageModel) {
/*     */     Intrinsics.checkNotNullParameter(currentPageModel, "currentPageModel");
/*     */     if (currentPageModel instanceof TaskChainDetailsViewModel && ((TaskChainDetailsViewModel)currentPageModel).getStartAgain())
/*     */       copyDescriptionAndFiles(((TaskChainDetailsViewModel)currentPageModel).getLiveTaskChain()); 
/*     */   }
/*     */   
/*     */   private final void copyDescriptionAndFiles(LiveTaskChain liveTaskChain) {
/*     */     TaskEntity firstTask = ((LiveTaskSnapshot)CollectionsKt.first((List)liveTaskChain.getTasks().getValue())).getTask();
/*     */     TextFieldStateKt.setTextAndPlaceCursorAtEnd(getTextState(), firstTask.getDescription());
/*     */     getAttachedFiles().clearFiles();
/*     */     getAttachedFiles().selectContextFiles(firstTask.getExplicitlySelectedContextFiles());
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final Logger logger = Logger.getInstance(NewTaskViewModelImpl.class);
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\create\NewTaskViewModelImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */