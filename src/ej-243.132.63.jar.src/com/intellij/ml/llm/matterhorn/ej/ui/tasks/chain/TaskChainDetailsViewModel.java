/*      */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain;
/*      */ 
/*      */ import androidx.compose.foundation.ScrollState;
/*      */ import androidx.compose.foundation.lazy.LazyListState;
/*      */ import androidx.compose.runtime.MutableState;
/*      */ import com.intellij.diff.DiffContentFactory;
/*      */ import com.intellij.diff.contents.DiffContent;
/*      */ import com.intellij.diff.contents.DocumentContent;
/*      */ import com.intellij.lang.Language;
/*      */ import com.intellij.ml.llm.matterhorn.HumanInLoopResponse;
/*      */ import com.intellij.ml.llm.matterhorn.ej.core.HumanInLoopRequest;
/*      */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.FileChange;
/*      */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.LiveTaskChain;
/*      */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.LiveTaskSnapshot;
/*      */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.ProgressEntity;
/*      */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskService;
/*      */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainEntity;
/*      */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskId;
/*      */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.followup.FollowupViewModel;
/*      */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskRecapModel;
/*      */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskStep;
/*      */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.PromptMode;
/*      */ import com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.OnShowDiff;
/*      */ import com.intellij.ml.llm.matterhorn.llm.LLMProxy;
/*      */ import com.intellij.openapi.application.CoroutinesKt;
/*      */ import com.intellij.openapi.fileEditor.FileEditorManager;
/*      */ import com.intellij.openapi.project.Project;
/*      */ import com.intellij.openapi.project.ProjectUtil;
/*      */ import com.intellij.openapi.vcs.AbstractVcs;
/*      */ import com.intellij.openapi.vcs.ProjectLevelVcsManager;
/*      */ import com.intellij.openapi.vfs.VfsUtil;
/*      */ import com.intellij.openapi.vfs.VirtualFile;
/*      */ import java.nio.file.Path;
/*      */ import java.util.Collection;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import kotlin.KotlinNothingValueException;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.ResultKt;
/*      */ import kotlin.Unit;
/*      */ import kotlin.collections.CollectionsKt;
/*      */ import kotlin.coroutines.Continuation;
/*      */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*      */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*      */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*      */ import kotlin.jvm.functions.Function0;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.functions.Function2;
/*      */ import kotlin.jvm.internal.FunctionReferenceImpl;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.reflect.KFunction;
/*      */ import kotlinx.collections.immutable.PersistentList;
/*      */ import kotlinx.coroutines.BuildersKt;
/*      */ import kotlinx.coroutines.CoroutineScope;
/*      */ import kotlinx.coroutines.Dispatchers;
/*      */ import kotlinx.coroutines.Job;
/*      */ import kotlinx.coroutines.flow.Flow;
/*      */ import kotlinx.coroutines.flow.FlowCollector;
/*      */ import kotlinx.coroutines.flow.MutableStateFlow;
/*      */ import kotlinx.coroutines.flow.StateFlow;
/*      */ import org.intellij.plugins.markdown.settings.MarkdownSettings;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ 
/*      */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000Â\001\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\036\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\013\n\002\020\013\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020$\n\002\020\b\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\007\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\r\n\002\030\002\n\002\b\005\b\007\030\000 p2\0020\001:\001pB_\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\f\020\b\032\b\022\004\022\0020\n0\t\022\006\020\013\032\0020\f\022\006\020\r\032\0020\016\022\022\020\017\032\016\022\n\022\b\022\004\022\0020\0210\0200\t\022\f\020\022\032\b\022\004\022\0020\0240\023¢\006\004\b\025\020\026J\006\020K\032\0020\nJ\006\020L\032\0020\nJ\006\020M\032\0020\nJ\026\020N\032\0020\n2\006\020O\032\0020P2\006\020Q\032\0020PJ\016\020R\032\0020\n2\006\020S\032\0020TJ\006\020U\032\0020\nJ\006\020\037\032\0020\nJ\006\020V\032\0020\nJ\020\020W\032\0020\n2\006\020X\032\0020 H\002J\006\020Y\032\0020\nJ\006\020Z\032\0020\nJ\006\020[\032\0020\nJ\030\020\\\032\0020\n2\006\020]\032\0020^H@¢\006\004\b_\020`J\030\020a\032\0020\n2\006\020]\032\0020^H@¢\006\004\bb\020`J\030\020c\032\0020\n2\006\020]\032\0020^H@¢\006\004\bd\020`J\030\020e\032\0020 2\006\020]\032\0020^H@¢\006\004\bf\020`J\r\020g\032\0020 H\000¢\006\002\bhJ\030\020i\032\0020\n2\006\020]\032\0020^H@¢\006\004\bj\020`J\022\020k\032\004\030\0010l2\006\020]\032\0020^H\002J\035\020m\032\0020\n2\006\020]\032\0020^2\006\020n\032\0020 H\000¢\006\002\boR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\027\020\030R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\031\020\032R\016\020\006\032\0020\007X\004¢\006\002\n\000R\024\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\002\n\000R\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\033\020\034R\032\020\017\032\016\022\n\022\b\022\004\022\0020\0210\0200\tX\004¢\006\002\n\000R\027\020\022\032\b\022\004\022\0020\0240\023¢\006\b\n\000\032\004\b\035\020\036R\032\020\037\032\0020 X\016¢\006\016\n\000\032\004\b!\020\"\"\004\b#\020$R\032\020%\032\0020&X\016¢\006\016\n\000\032\004\b'\020(\"\004\b)\020*R\032\020+\032\0020,X\016¢\006\016\n\000\032\004\b-\020.\"\004\b/\0200R\026\0201\032\n\022\006\022\004\030\0010302X\004¢\006\002\n\000R\031\0204\032\n\022\006\022\004\030\0010305¢\006\b\n\000\032\004\b6\0207R\024\0208\032\b\022\004\022\0020:09X\004¢\006\002\n\000R\027\020;\032\b\022\004\022\0020 05¢\006\b\n\000\032\004\b<\0207R#\020=\032\024\022\020\022\016\022\004\022\0020?\022\004\022\0020@0>02¢\006\b\n\000\032\004\bA\020BR\035\020C\032\016\022\n\022\b\022\004\022\0020E0D05¢\006\b\n\000\032\004\bF\0207R\021\020G\032\0020H¢\006\b\n\000\032\004\bI\020J¨\006q"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;", "project", "Lcom/intellij/openapi/project/Project;", "llmProxy", "Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;", "taskService", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService;", "openNewTaskPage", "Lkotlin/Function0;", "", "liveTaskChain", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskChain;", "parent", "Lkotlinx/coroutines/CoroutineScope;", "checkForJunieProblems", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem;", "promptMode", "Landroidx/compose/runtime/MutableState;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;", "<init>", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService;Lkotlin/jvm/functions/Function0;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskChain;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;)V", "getProject", "()Lcom/intellij/openapi/project/Project;", "getLlmProxy", "()Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;", "getLiveTaskChain", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskChain;", "getPromptMode", "()Landroidx/compose/runtime/MutableState;", "startAgain", "", "getStartAgain", "()Z", "setStartAgain", "(Z)V", "rightLazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "getRightLazyListState", "()Landroidx/compose/foundation/lazy/LazyListState;", "setRightLazyListState", "(Landroidx/compose/foundation/lazy/LazyListState;)V", "leftListState", "Landroidx/compose/foundation/ScrollState;", "getLeftListState", "()Landroidx/compose/foundation/ScrollState;", "setLeftListState", "(Landroidx/compose/foundation/ScrollState;)V", "_followupVm", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/followup/FollowupViewModel;", "followupModel", "Lkotlinx/coroutines/flow/StateFlow;", "getFollowupModel", "()Lkotlinx/coroutines/flow/StateFlow;", "chainDataFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/LiveTaskChainData;", "hasChanges", "getHasChanges", "stepMapFlow", "", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskRecapModel;", "getStepMapFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "unifiedStepList", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep;", "getUnifiedStepList", "taskHeader", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderViewModel;", "getTaskHeader", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderViewModel;", "openMainPage", "stop", "done", "openMarkdownInEditor", "fileName", "", "rawMarkdown", "declineStartingFrom", "taskId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;", "declineAll", "runTerminalCommand", "reactToHumanInLoopRequest", "confirmed", "skipTerminalCommand", "stopTerminalCommand", "reportIssue", "locateFile", "change", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;", "locateFile$ej_ui", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "revertChange", "revertChange$ej_ui", "deleteFile", "deleteFile$ej_ui", "checkFileOnVcs", "checkFileOnVcs$ej_ui", "checkProjectUnderVCS", "checkProjectUnderVCS$ej_ui", "addFileToVCS", "addFileToVCS$ej_ui", "getFile", "Lcom/intellij/openapi/vfs/VirtualFile;", "showDiff", "wantEditable", "showDiff$ej_ui", "Companion", "ej-ui"})
/*      */ @StabilityInferred(parameters = 0)
/*      */ @SourceDebugExtension({"SMAP\nTaskChainDetailsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskChainDetailsViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1064:1\n49#2:1065\n51#2:1069\n49#2:1070\n51#2:1074\n46#3:1066\n51#3:1068\n46#3:1071\n51#3:1073\n105#4:1067\n105#4:1072\n1#5:1075\n*S KotlinDebug\n*F\n+ 1 TaskChainDetailsViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel\n*L\n132#1:1065\n132#1:1069\n137#1:1070\n137#1:1074\n132#1:1066\n132#1:1068\n137#1:1071\n137#1:1073\n132#1:1067\n137#1:1072\n*E\n"})
/*      */ public final class TaskChainDetailsViewModel extends ViewModel {
/*      */   @NotNull
/*      */   public static final Companion Companion = new Companion(null);
/*      */   @NotNull
/*      */   private final Project project;
/*      */   @NotNull
/*      */   private final LLMProxy llmProxy;
/*      */   @NotNull
/*      */   private final TaskService taskService;
/*      */   @NotNull
/*      */   private final Function0<Unit> openNewTaskPage;
/*      */   @NotNull
/*      */   private final LiveTaskChain liveTaskChain;
/*      */   @NotNull
/*      */   private final Function0<Collection<JuniePreconditionChecker.JunieProblem>> checkForJunieProblems;
/*      */   @NotNull
/*      */   private final MutableState<PromptMode> promptMode;
/*      */   private boolean startAgain;
/*      */   @NotNull
/*      */   private LazyListState rightLazyListState;
/*      */   @NotNull
/*      */   private ScrollState leftListState;
/*      */   @NotNull
/*      */   private final MutableStateFlow<FollowupViewModel> _followupVm;
/*      */   @NotNull
/*      */   private final StateFlow<FollowupViewModel> followupModel;
/*      */   @NotNull
/*      */   private final Flow<LiveTaskChainData> chainDataFlow;
/*      */   @NotNull
/*      */   private final StateFlow<Boolean> hasChanges;
/*      */   @NotNull
/*      */   private final MutableStateFlow<Map<Integer, TaskRecapModel>> stepMapFlow;
/*      */   @NotNull
/*      */   private final StateFlow<List<TaskStep>> unifiedStepList;
/*      */   @NotNull
/*      */   private final TaskHeaderViewModel taskHeader;
/*      */   public static final int $stable = 8;
/*      */   @NotNull
/*      */   public static final String WORKING_PROGRESS_INDICATION = "Working";
/*      */   
/*      */   @NotNull
/*  109 */   public final Project getProject() { return this.project; } @NotNull
/*  110 */   public final LLMProxy getLlmProxy() { return this.llmProxy; }
/*      */    @NotNull
/*      */   public final LiveTaskChain getLiveTaskChain() {
/*  113 */     return this.liveTaskChain;
/*      */   }
/*      */   @NotNull
/*  116 */   public final MutableState<PromptMode> getPromptMode() { return this.promptMode; }
/*  117 */   public TaskChainDetailsViewModel(@NotNull Project project, @NotNull LLMProxy llmProxy, @NotNull TaskService taskService, @NotNull Function0<Unit> openNewTaskPage, @NotNull LiveTaskChain liveTaskChain, @NotNull CoroutineScope parent, @NotNull Function0<Collection<JuniePreconditionChecker.JunieProblem>> checkForJunieProblems, @NotNull MutableState<PromptMode> promptMode) { super(parent, "Task view model"); this.project = project;
/*      */     this.llmProxy = llmProxy;
/*      */     this.taskService = taskService;
/*      */     this.openNewTaskPage = openNewTaskPage;
/*      */     this.liveTaskChain = liveTaskChain;
/*      */     this.checkForJunieProblems = checkForJunieProblems;
/*      */     this.promptMode = promptMode;
/*  124 */     this.rightLazyListState = new LazyListState(0, 0, 3, null);
/*  125 */     this.leftListState = new ScrollState(0);
/*      */     
/*  127 */     this._followupVm = StateFlowKt.MutableStateFlow(null);
/*  128 */     this.followupModel = (StateFlow<FollowupViewModel>)this._followupVm;
/*      */     
/*  130 */     this.chainDataFlow = TaskChainDetailsViewModelKt.access$getChainData(this.liveTaskChain);
/*      */     
/*  132 */     Flow<LiveTaskChainData> flow1 = this.chainDataFlow; int $i$f$map = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1065 */     Flow<LiveTaskChainData> flow2 = flow1; int $i$f$unsafeTransform = 0;
/* 1066 */     int $i$f$unsafeFlow = 0;
/* 1067 */     this.hasChanges = FlowKt.stateIn(new TaskChainDetailsViewModel$special$$inlined$map$1(flow2), getScope(), SharingStarted.Companion.getEagerly(), Boolean.valueOf(false)); this.stepMapFlow = StateFlowKt.MutableStateFlow(MapsKt.emptyMap());
/*      */     Flow $this$map$iv = (Flow)this.stepMapFlow;
/*      */     $i$f$map = 0;
/* 1070 */     Flow $this$unsafeTransform$iv$iv = $this$map$iv; $i$f$unsafeTransform = 0;
/* 1071 */     $i$f$unsafeFlow = 0;
/* 1072 */     this.unifiedStepList = FlowKt.stateIn(new TaskChainDetailsViewModel$special$$inlined$map$2($this$unsafeTransform$iv$iv), parent, SharingStarted.Companion.getEagerly(), CollectionsKt.emptyList()); BuildersKt.launch$default(getScope(), null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { int label; public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (TaskChainDetailsViewModel.this.chainDataFlow.collect(new FlowCollector() { public final Object emit(LiveTaskChainData chainData, Continuation $completion) { PersistentList<LiveTaskSnapshot> persistentList = chainData.getTasks(); TaskChainEntity taskChainEntity = chainData.getChain(); Project project = TaskChainDetailsViewModel.this.getProject(); LLMProxy lLMProxy = TaskChainDetailsViewModel.this.getLlmProxy(); KFunction kFunction1 = (KFunction)new TaskChainDetailsViewModel$1$1$steps$1(TaskChainDetailsViewModel.this); KFunction kFunction2 = (KFunction)new TaskChainDetailsViewModel$1$1$steps$2(TaskChainDetailsViewModel.this); CoroutineScope coroutineScope = TaskChainDetailsViewModel.this.getScope(); boolean bool = chainData.getHasChanges(); HumanInLoopRequest humanInLoopRequest = chainData.getHumanInLoopRequest(); KFunction kFunction3 = (chainData.getCurrentJob() != null) ? (KFunction)new TaskChainDetailsViewModel$1$1$steps$3(TaskChainDetailsViewModel.this) : null; ProgressEntity progressEntity = chainData.getProgress(); TaskChainDetailsViewModel$1$1$steps$4 taskChainDetailsViewModel$1$1$steps$4 = new TaskChainDetailsViewModel$1$1$steps$4(); List<TaskStep> steps = TaskChainDetailsViewModelKt.produceStepVMs(lLMProxy, persistentList, taskChainEntity, project, (Function0<Unit>)kFunction1, (Function1<? super TaskId, Unit>)kFunction2, coroutineScope, bool, humanInLoopRequest, (Function0<Unit>)kFunction3, progressEntity, taskChainDetailsViewModel$1$1$steps$4, new TaskChainDetailsViewModel$1$1$steps$5(null), new TaskChainDetailsViewModel$1$1$steps$6(null), new TaskChainDetailsViewModel$1$1$steps$7(null), TaskChainDetailsViewModel.this::emit$lambda$0, new TaskChainDetailsViewModel$1$1$steps$9(null), new TaskChainDetailsViewModel$1$1$steps$10(null)); Map<Integer, TaskRecapModel> recap = TaskChainDetailsViewModelKt.collectRecap(steps); if (TaskChainDetailsViewModel.this.getStepMapFlow().emit(recap, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return TaskChainDetailsViewModel.this.getStepMapFlow().emit(recap, $completion);  TaskChainDetailsViewModel.this.getStepMapFlow().emit(recap, $completion); return Unit.INSTANCE; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel$1$1$steps$4", "Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/OnShowDiff;", "showDiff", "", "change", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;", "wantEditable", "", "ej-ui"}) public static final class TaskChainDetailsViewModel$1$1$steps$4 implements OnShowDiff {
/*      */                         public void showDiff(FileChange change, boolean wantEditable) { Intrinsics.checkNotNullParameter(change, "change"); TaskChainDetailsViewModel.this.showDiff$ej_ui(change, wantEditable); } } @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {172}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$1$1$steps$5") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;"}) static final class TaskChainDetailsViewModel$1$1$steps$5 extends SuspendLambda implements Function2<FileChange, Continuation<? super Unit>, Object> {
/*      */                         int label; TaskChainDetailsViewModel$1$1$steps$5(Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { FileChange it; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (FileChange)this.L$0; this.label = 1; if (TaskChainDetailsViewModel.this.deleteFile$ej_ui(it, (Continuation<? super Unit>)this) == object) return object;  TaskChainDetailsViewModel.this.deleteFile$ej_ui(it, (Continuation<? super Unit>)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModel$1$1$steps$5> $completion) { TaskChainDetailsViewModel$1$1$steps$5 taskChainDetailsViewModel$1$1$steps$5 = new TaskChainDetailsViewModel$1$1$steps$5($completion); taskChainDetailsViewModel$1$1$steps$5.L$0 = value; return (Continuation<Unit>)taskChainDetailsViewModel$1$1$steps$5; } public final Object invoke(FileChange p1, Continuation<?> p2) { return ((TaskChainDetailsViewModel$1$1$steps$5)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {173}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$1$1$steps$6") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;"}) static final class TaskChainDetailsViewModel$1$1$steps$6 extends SuspendLambda implements Function2<FileChange, Continuation<? super Unit>, Object> {
/* 1075 */                         int label; TaskChainDetailsViewModel$1$1$steps$6(Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { FileChange it; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (FileChange)this.L$0; this.label = 1; if (TaskChainDetailsViewModel.this.locateFile$ej_ui(it, (Continuation<? super Unit>)this) == object) return object;  TaskChainDetailsViewModel.this.locateFile$ej_ui(it, (Continuation<? super Unit>)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModel$1$1$steps$6> $completion) { TaskChainDetailsViewModel$1$1$steps$6 taskChainDetailsViewModel$1$1$steps$6 = new TaskChainDetailsViewModel$1$1$steps$6($completion); taskChainDetailsViewModel$1$1$steps$6.L$0 = value; return (Continuation<Unit>)taskChainDetailsViewModel$1$1$steps$6; } public final Object invoke(FileChange p1, Continuation<?> p2) { return ((TaskChainDetailsViewModel$1$1$steps$6)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {174}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$1$1$steps$7") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;"}) static final class TaskChainDetailsViewModel$1$1$steps$7 extends SuspendLambda implements Function2<FileChange, Continuation<? super Unit>, Object> { int label; TaskChainDetailsViewModel$1$1$steps$7(Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { FileChange it; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (FileChange)this.L$0; this.label = 1; if (TaskChainDetailsViewModel.this.revertChange$ej_ui(it, (Continuation<? super Unit>)this) == object) return object;  TaskChainDetailsViewModel.this.revertChange$ej_ui(it, (Continuation<? super Unit>)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModel$1$1$steps$7> $completion) { TaskChainDetailsViewModel$1$1$steps$7 taskChainDetailsViewModel$1$1$steps$7 = new TaskChainDetailsViewModel$1$1$steps$7($completion); taskChainDetailsViewModel$1$1$steps$7.L$0 = value; return (Continuation<Unit>)taskChainDetailsViewModel$1$1$steps$7; } public final Object invoke(FileChange p1, Continuation<?> p2) { return ((TaskChainDetailsViewModel$1$1$steps$7)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {175}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$1$1$steps$9") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "change", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;"}) static final class TaskChainDetailsViewModel$1$1$steps$9 extends SuspendLambda implements Function2<FileChange, Continuation<? super Unit>, Object> { int label; TaskChainDetailsViewModel$1$1$steps$9(Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { FileChange change; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); change = (FileChange)this.L$0; this.label = 1; if (TaskChainDetailsViewModel.this.addFileToVCS$ej_ui(change, (Continuation<? super Unit>)this) == object) return object;  TaskChainDetailsViewModel.this.addFileToVCS$ej_ui(change, (Continuation<? super Unit>)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModel$1$1$steps$9> $completion) { TaskChainDetailsViewModel$1$1$steps$9 taskChainDetailsViewModel$1$1$steps$9 = new TaskChainDetailsViewModel$1$1$steps$9($completion); taskChainDetailsViewModel$1$1$steps$9.L$0 = value; return (Continuation<Unit>)taskChainDetailsViewModel$1$1$steps$9; } public final Object invoke(FileChange p1, Continuation<?> p2) { return ((TaskChainDetailsViewModel$1$1$steps$9)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } private static final Unit emit$lambda$0(TaskChainDetailsViewModel this$0, String fileName, String rawMarkdown) { Intrinsics.checkNotNullParameter(fileName, "fileName"); Intrinsics.checkNotNullParameter(rawMarkdown, "rawMarkdown"); TaskChainDetailsViewModel.this.openMarkdownInEditor(fileName, rawMarkdown); return Unit.INSTANCE; } @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {177}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$1$1$steps$10") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\013\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;"}) static final class TaskChainDetailsViewModel$1$1$steps$10 extends SuspendLambda implements Function2<FileChange, Continuation<? super Boolean>, Object> { int label; TaskChainDetailsViewModel$1$1$steps$10(Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { FileChange it; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (FileChange)this.L$0; this.label = 1; return (TaskChainDetailsViewModel.this.checkFileOnVcs$ej_ui(it, (Continuation<? super Boolean>)this) == object) ? object : TaskChainDetailsViewModel.this.checkFileOnVcs$ej_ui(it, (Continuation<? super Boolean>)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModel$1$1$steps$10> $completion) { TaskChainDetailsViewModel$1$1$steps$10 taskChainDetailsViewModel$1$1$steps$10 = new TaskChainDetailsViewModel$1$1$steps$10($completion); taskChainDetailsViewModel$1$1$steps$10.L$0 = value; return (Continuation<Unit>)taskChainDetailsViewModel$1$1$steps$10; } public final Object invoke(FileChange p1, Continuation<?> p2) { return ((TaskChainDetailsViewModel$1$1$steps$10)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } }(Continuation)this) == object) return object;  TaskChainDetailsViewModel.this.chainDataFlow.collect(new FlowCollector() { public final Object emit(LiveTaskChainData chainData, Continuation $completion) { PersistentList<LiveTaskSnapshot> persistentList = chainData.getTasks(); TaskChainEntity taskChainEntity = chainData.getChain(); Project project = TaskChainDetailsViewModel.this.getProject(); LLMProxy lLMProxy = TaskChainDetailsViewModel.this.getLlmProxy(); KFunction kFunction1 = (KFunction)new TaskChainDetailsViewModel$1$1$steps$1(TaskChainDetailsViewModel.this); KFunction kFunction2 = (KFunction)new TaskChainDetailsViewModel$1$1$steps$2(TaskChainDetailsViewModel.this); CoroutineScope coroutineScope = TaskChainDetailsViewModel.this.getScope(); boolean bool = chainData.getHasChanges(); HumanInLoopRequest humanInLoopRequest = chainData.getHumanInLoopRequest(); KFunction kFunction3 = (chainData.getCurrentJob() != null) ? (KFunction)new TaskChainDetailsViewModel$1$1$steps$3(TaskChainDetailsViewModel.this) : null; ProgressEntity progressEntity = chainData.getProgress(); TaskChainDetailsViewModel$1$1$steps$4 taskChainDetailsViewModel$1$1$steps$4 = new TaskChainDetailsViewModel$1$1$steps$4(); List<TaskStep> steps = TaskChainDetailsViewModelKt.produceStepVMs(lLMProxy, persistentList, taskChainEntity, project, (Function0<Unit>)kFunction1, (Function1<? super TaskId, Unit>)kFunction2, coroutineScope, bool, humanInLoopRequest, (Function0<Unit>)kFunction3, progressEntity, taskChainDetailsViewModel$1$1$steps$4, new TaskChainDetailsViewModel$1$1$steps$5(null), new TaskChainDetailsViewModel$1$1$steps$6(null), new TaskChainDetailsViewModel$1$1$steps$7(null), TaskChainDetailsViewModel.this::emit$lambda$0, new TaskChainDetailsViewModel$1$1$steps$9(null), new TaskChainDetailsViewModel$1$1$steps$10(null)); Map<Integer, TaskRecapModel> recap = TaskChainDetailsViewModelKt.collectRecap(steps); if (TaskChainDetailsViewModel.this.getStepMapFlow().emit(recap, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return TaskChainDetailsViewModel.this.getStepMapFlow().emit(recap, $completion);  TaskChainDetailsViewModel.this.getStepMapFlow().emit(recap, $completion); return Unit.INSTANCE; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel$1$1$steps$4", "Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/OnShowDiff;", "showDiff", "", "change", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;", "wantEditable", "", "ej-ui"}) public static final class TaskChainDetailsViewModel$1$1$steps$4 implements OnShowDiff { public void showDiff(FileChange change, boolean wantEditable) { Intrinsics.checkNotNullParameter(change, "change"); TaskChainDetailsViewModel.this.showDiff$ej_ui(change, wantEditable); } } @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {172}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$1$1$steps$5") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;"}) static final class TaskChainDetailsViewModel$1$1$steps$5 extends SuspendLambda implements Function2<FileChange, Continuation<? super Unit>, Object> { int label; TaskChainDetailsViewModel$1$1$steps$5(Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { FileChange it; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (FileChange)this.L$0; this.label = 1; if (TaskChainDetailsViewModel.this.deleteFile$ej_ui(it, (Continuation<? super Unit>)this) == object) return object;  TaskChainDetailsViewModel.this.deleteFile$ej_ui(it, (Continuation<? super Unit>)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModel$1$1$steps$5> $completion) { TaskChainDetailsViewModel$1$1$steps$5 taskChainDetailsViewModel$1$1$steps$5 = new TaskChainDetailsViewModel$1$1$steps$5($completion); taskChainDetailsViewModel$1$1$steps$5.L$0 = value; return (Continuation<Unit>)taskChainDetailsViewModel$1$1$steps$5; } public final Object invoke(FileChange p1, Continuation<?> p2) { return ((TaskChainDetailsViewModel$1$1$steps$5)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {173}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$1$1$steps$6") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;"}) static final class TaskChainDetailsViewModel$1$1$steps$6 extends SuspendLambda implements Function2<FileChange, Continuation<? super Unit>, Object> { int label; TaskChainDetailsViewModel$1$1$steps$6(Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { FileChange it; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (FileChange)this.L$0; this.label = 1; if (TaskChainDetailsViewModel.this.locateFile$ej_ui(it, (Continuation<? super Unit>)this) == object) return object;  TaskChainDetailsViewModel.this.locateFile$ej_ui(it, (Continuation<? super Unit>)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModel$1$1$steps$6> $completion) { TaskChainDetailsViewModel$1$1$steps$6 taskChainDetailsViewModel$1$1$steps$6 = new TaskChainDetailsViewModel$1$1$steps$6($completion); taskChainDetailsViewModel$1$1$steps$6.L$0 = value; return (Continuation<Unit>)taskChainDetailsViewModel$1$1$steps$6; } public final Object invoke(FileChange p1, Continuation<?> p2) { return ((TaskChainDetailsViewModel$1$1$steps$6)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {174}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$1$1$steps$7") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;"}) static final class TaskChainDetailsViewModel$1$1$steps$7 extends SuspendLambda implements Function2<FileChange, Continuation<? super Unit>, Object> { int label; TaskChainDetailsViewModel$1$1$steps$7(Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { FileChange it; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (FileChange)this.L$0; this.label = 1; if (TaskChainDetailsViewModel.this.revertChange$ej_ui(it, (Continuation<? super Unit>)this) == object) return object;  TaskChainDetailsViewModel.this.revertChange$ej_ui(it, (Continuation<? super Unit>)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModel$1$1$steps$7> $completion) { TaskChainDetailsViewModel$1$1$steps$7 taskChainDetailsViewModel$1$1$steps$7 = new TaskChainDetailsViewModel$1$1$steps$7($completion); taskChainDetailsViewModel$1$1$steps$7.L$0 = value; return (Continuation<Unit>)taskChainDetailsViewModel$1$1$steps$7; } public final Object invoke(FileChange p1, Continuation<?> p2) { return ((TaskChainDetailsViewModel$1$1$steps$7)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {175}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$1$1$steps$9") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "change", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;"}) static final class TaskChainDetailsViewModel$1$1$steps$9 extends SuspendLambda implements Function2<FileChange, Continuation<? super Unit>, Object> { int label; TaskChainDetailsViewModel$1$1$steps$9(Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { FileChange change; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); change = (FileChange)this.L$0; this.label = 1; if (TaskChainDetailsViewModel.this.addFileToVCS$ej_ui(change, (Continuation<? super Unit>)this) == object) return object;  TaskChainDetailsViewModel.this.addFileToVCS$ej_ui(change, (Continuation<? super Unit>)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModel$1$1$steps$9> $completion) { TaskChainDetailsViewModel$1$1$steps$9 taskChainDetailsViewModel$1$1$steps$9 = new TaskChainDetailsViewModel$1$1$steps$9($completion); taskChainDetailsViewModel$1$1$steps$9.L$0 = value; return (Continuation<Unit>)taskChainDetailsViewModel$1$1$steps$9; } public final Object invoke(FileChange p1, Continuation<?> p2) { return ((TaskChainDetailsViewModel$1$1$steps$9)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } private static final Unit emit$lambda$0(TaskChainDetailsViewModel this$0, String fileName, String rawMarkdown) { Intrinsics.checkNotNullParameter(fileName, "fileName"); Intrinsics.checkNotNullParameter(rawMarkdown, "rawMarkdown"); TaskChainDetailsViewModel.this.openMarkdownInEditor(fileName, rawMarkdown); return Unit.INSTANCE; } @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {177}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$1$1$steps$10") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\013\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;"}) static final class TaskChainDetailsViewModel$1$1$steps$10 extends SuspendLambda implements Function2<FileChange, Continuation<? super Boolean>, Object> { int label; TaskChainDetailsViewModel$1$1$steps$10(Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { FileChange it; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (FileChange)this.L$0; this.label = 1; return (TaskChainDetailsViewModel.this.checkFileOnVcs$ej_ui(it, (Continuation<? super Boolean>)this) == object) ? object : TaskChainDetailsViewModel.this.checkFileOnVcs$ej_ui(it, (Continuation<? super Boolean>)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModel$1$1$steps$10> $completion) { TaskChainDetailsViewModel$1$1$steps$10 taskChainDetailsViewModel$1$1$steps$10 = new TaskChainDetailsViewModel$1$1$steps$10($completion); taskChainDetailsViewModel$1$1$steps$10.L$0 = value; return (Continuation<Unit>)taskChainDetailsViewModel$1$1$steps$10; } public final Object invoke(FileChange p1, Continuation<?> p2) { return ((TaskChainDetailsViewModel$1$1$steps$10)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } }(Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(TaskChainDetailsViewModel.this, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }3, null); this.taskHeader = new TaskHeaderViewModel(getScope(), this, this.hasChanges); BuildersKt.launch$default(getScope(), null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { int label; public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (TaskChainDetailsViewModel.this.getLiveTaskChain().getChain().collect(new FlowCollector() { public final Object emit(TaskChainEntity value, Continuation $completion) { if (value.getState().isTerminal()) { CoroutineScope coroutineScope = TaskChainDetailsViewModel.this.getScope(); LLMProxy lLMProxy = TaskChainDetailsViewModel.this.getLlmProxy(); Project project = TaskChainDetailsViewModel.this.getProject(); LiveTaskChain liveTaskChain = TaskChainDetailsViewModel.this.getLiveTaskChain(); TaskService taskService = TaskChainDetailsViewModel.this.taskService; Function0 function0 = TaskChainDetailsViewModel.this.checkForJunieProblems; TaskChainDetailsViewModel.this._followupVm.setValue(new FollowupViewModel(coroutineScope, project, lLMProxy, liveTaskChain, taskService, function0)); } else { if ((FollowupViewModel)TaskChainDetailsViewModel.this._followupVm.getValue() != null) { ((FollowupViewModel)TaskChainDetailsViewModel.this._followupVm.getValue()).closeVM(); } else { (FollowupViewModel)TaskChainDetailsViewModel.this._followupVm.getValue(); }  TaskChainDetailsViewModel.this._followupVm.setValue(null); }  return Unit.INSTANCE; } }(Continuation)this) == object) return object;  TaskChainDetailsViewModel.this.getLiveTaskChain().getChain().collect(new FlowCollector() { public final Object emit(TaskChainEntity value, Continuation $completion) { if (value.getState().isTerminal()) { CoroutineScope coroutineScope = TaskChainDetailsViewModel.this.getScope(); LLMProxy lLMProxy = TaskChainDetailsViewModel.this.getLlmProxy(); Project project = TaskChainDetailsViewModel.this.getProject(); LiveTaskChain liveTaskChain = TaskChainDetailsViewModel.this.getLiveTaskChain(); TaskService taskService = TaskChainDetailsViewModel.this.taskService; Function0 function0 = TaskChainDetailsViewModel.this.checkForJunieProblems; TaskChainDetailsViewModel.this._followupVm.setValue(new FollowupViewModel(coroutineScope, project, lLMProxy, liveTaskChain, taskService, function0)); } else { if ((FollowupViewModel)TaskChainDetailsViewModel.this._followupVm.getValue() != null) { ((FollowupViewModel)TaskChainDetailsViewModel.this._followupVm.getValue()).closeVM(); } else { (FollowupViewModel)TaskChainDetailsViewModel.this._followupVm.getValue(); }  TaskChainDetailsViewModel.this._followupVm.setValue(null); }  return Unit.INSTANCE; } }(Continuation)this); throw new KotlinNothingValueException();case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); throw new KotlinNothingValueException(); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(TaskChainDetailsViewModel.this, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }3, null); } private final void reactToHumanInLoopRequest(boolean confirmed) { HumanInLoopRequest humanInLoopRequest = (HumanInLoopRequest)this.liveTaskChain.getHumanInLoopRequest().getValue(); if (!((humanInLoopRequest != null) ? 1 : 0)) { int $i$a$-require-TaskChainDetailsViewModel$reactToHumanInLoopRequest$1 = 0;
/*      */       String str = "Human in loop must not be null while calling runTerminalCommand";
/*      */       throw new IllegalArgumentException(str.toString()); }
/*      */     
/*      */     TaskChainEntity chain = (TaskChainEntity)this.liveTaskChain.getChain().getValue();
/*      */     TaskChainId taskChainId = chain.getId();
/*      */     LiveTaskSnapshot lastTask = (LiveTaskSnapshot)CollectionsKt.last((List)this.liveTaskChain.getTasks().getValue());
/*      */     TaskId taskId = lastTask.getTask().getId();
/*      */     CompositeUiAction.INSTANCE.logAskConfirmationAnswered(confirmed, taskChainId, taskId);
/*      */     BuildersKt.launch$default(getScope(), null, null, new TaskChainDetailsViewModel$reactToHumanInLoopRequest$2(confirmed, this, null), 3, null); }
/*      */ 
/*      */   
/*      */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel$Companion;", "", "<init>", "()V", "WORKING_PROGRESS_INDICATION", "", "ej-ui"})
/*      */   public static final class Companion {
/*      */     private Companion() {}
/*      */   }
/*      */   
/*      */   public final boolean getStartAgain() {
/*      */     return this.startAgain;
/*      */   }
/*      */   
/*      */   public final void setStartAgain(boolean <set-?>) {
/*      */     this.startAgain = <set-?>;
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final LazyListState getRightLazyListState() {
/*      */     return this.rightLazyListState;
/*      */   }
/*      */   
/*      */   public final void setRightLazyListState(@NotNull LazyListState <set-?>) {
/*      */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*      */     this.rightLazyListState = <set-?>;
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final ScrollState getLeftListState() {
/*      */     return this.leftListState;
/*      */   }
/*      */   
/*      */   public final void setLeftListState(@NotNull ScrollState <set-?>) {
/*      */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*      */     this.leftListState = <set-?>;
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final StateFlow<FollowupViewModel> getFollowupModel() {
/*      */     return this.followupModel;
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final StateFlow<Boolean> getHasChanges() {
/*      */     return this.hasChanges;
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final MutableStateFlow<Map<Integer, TaskRecapModel>> getStepMapFlow() {
/*      */     return this.stepMapFlow;
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final StateFlow<List<TaskStep>> getUnifiedStepList() {
/*      */     return this.unifiedStepList;
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final TaskHeaderViewModel getTaskHeader() {
/*      */     return this.taskHeader;
/*      */   }
/*      */   
/*      */   public final void openMainPage() {
/*      */     this.openNewTaskPage.invoke();
/*      */   }
/*      */   
/*      */   public final void stop() {
/*      */     BuildersKt.launch$default(getScope(), null, null, new TaskChainDetailsViewModel$stop$1(null), 3, null);
/*      */   }
/*      */   
/*      */   @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {231}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$stop$1")
/*      */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*      */   static final class TaskChainDetailsViewModel$stop$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*      */     int label;
/*      */     
/*      */     TaskChainDetailsViewModel$stop$1(Continuation $completion) {
/*      */       super(2, $completion);
/*      */     }
/*      */     
/*      */     public final Object invokeSuspend(Object $result) {
/*      */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*      */       switch (this.label) {
/*      */         case 0:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           this.label = 1;
/*      */           if (TaskChainDetailsViewModel.this.taskService.stop(((TaskChainEntity)TaskChainDetailsViewModel.this.getLiveTaskChain().getChain().getValue()).getId(), (Continuation)this) == object)
/*      */             return object; 
/*      */           TaskChainDetailsViewModel.this.taskService.stop(((TaskChainEntity)TaskChainDetailsViewModel.this.getLiveTaskChain().getChain().getValue()).getId(), (Continuation)this);
/*      */           return Unit.INSTANCE;
/*      */         case 1:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           return Unit.INSTANCE;
/*      */       } 
/*      */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*      */     }
/*      */     
/*      */     public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModel$stop$1> $completion) {
/*      */       return (Continuation<Unit>)new TaskChainDetailsViewModel$stop$1($completion);
/*      */     }
/*      */     
/*      */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*      */       return ((TaskChainDetailsViewModel$stop$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */     }
/*      */   }
/*      */   
/*      */   public final void done() {
/*      */     BuildersKt.launch$default(MatterhornServiceScope.Companion.getScope(this.project), null, null, new TaskChainDetailsViewModel$done$1(null), 3, null);
/*      */     openMainPage();
/*      */   }
/*      */   
/*      */   @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {237}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$done$1")
/*      */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*      */   static final class TaskChainDetailsViewModel$done$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*      */     int label;
/*      */     
/*      */     TaskChainDetailsViewModel$done$1(Continuation $completion) {
/*      */       super(2, $completion);
/*      */     }
/*      */     
/*      */     public final Object invokeSuspend(Object $result) {
/*      */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*      */       switch (this.label) {
/*      */         case 0:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           this.label = 1;
/*      */           if (TaskChainDetailsViewModel.this.taskService.done(((TaskChainEntity)TaskChainDetailsViewModel.this.getLiveTaskChain().getChain().getValue()).getId(), (Continuation)this) == object)
/*      */             return object; 
/*      */           TaskChainDetailsViewModel.this.taskService.done(((TaskChainEntity)TaskChainDetailsViewModel.this.getLiveTaskChain().getChain().getValue()).getId(), (Continuation)this);
/*      */           return Unit.INSTANCE;
/*      */         case 1:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           return Unit.INSTANCE;
/*      */       } 
/*      */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*      */     }
/*      */     
/*      */     public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModel$done$1> $completion) {
/*      */       return (Continuation<Unit>)new TaskChainDetailsViewModel$done$1($completion);
/*      */     }
/*      */     
/*      */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*      */       return ((TaskChainDetailsViewModel$done$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */     }
/*      */   }
/*      */   
/*      */   public final void openMarkdownInEditor(@NotNull String fileName, @NotNull String rawMarkdown) {
/*      */     VirtualFile scratchFile;
/*      */     Intrinsics.checkNotNullParameter(fileName, "fileName");
/*      */     Intrinsics.checkNotNullParameter(rawMarkdown, "rawMarkdown");
/*      */     String fixedFileName = UtilsKt.toSafeFileName$default(StringsKt.removeSuffix(fileName, ".md"), 0, 1, null) + ".md";
/*      */     Intrinsics.checkNotNull(Language.findLanguageByID("Markdown"));
/*      */     if (ScratchRootType.getInstance().createScratchFile(this.project, fixedFileName, Language.findLanguageByID("Markdown"), rawMarkdown, ScratchFileService.Option.create_new_always) == null) {
/*      */       ScratchRootType.getInstance().createScratchFile(this.project, fixedFileName, Language.findLanguageByID("Markdown"), rawMarkdown, ScratchFileService.Option.create_new_always);
/*      */       return;
/*      */     } 
/*      */     FileEditorManager fileEditorManager = FileEditorManager.getInstance(this.project);
/*      */     EditorHistoryManager historyManager = EditorHistoryManager.Companion.getInstance(this.project);
/*      */     MarkdownSettings markdownSettings = MarkdownSettings.Companion.getInstance(this.project);
/*      */     TextEditorWithPreview.Layout originalLayout = markdownSettings.getSplitLayout();
/*      */     markdownSettings.setSplitLayout(TextEditorWithPreview.Layout.SHOW_PREVIEW);
/*      */     fileEditorManager.closeFile(scratchFile);
/*      */     historyManager.removeFile(scratchFile);
/*      */     fileEditorManager.openFile(scratchFile, true);
/*      */     markdownSettings.setSplitLayout(originalLayout);
/*      */   }
/*      */   
/*      */   public final void declineStartingFrom(@NotNull TaskId taskId) {
/*      */     Intrinsics.checkNotNullParameter(taskId, "taskId");
/*      */     BuildersKt.launch$default(MatterhornServiceScope.Companion.getScope(this.project), null, null, new TaskChainDetailsViewModel$declineStartingFrom$1(taskId, null), 3, null);
/*      */   }
/*      */   
/*      */   @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {286}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$declineStartingFrom$1")
/*      */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*      */   static final class TaskChainDetailsViewModel$declineStartingFrom$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*      */     int label;
/*      */     
/*      */     TaskChainDetailsViewModel$declineStartingFrom$1(TaskId $taskId, Continuation $completion) {
/*      */       super(2, $completion);
/*      */     }
/*      */     
/*      */     public final Object invokeSuspend(Object $result) {
/*      */       // Byte code:
/*      */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*      */       //   3: astore_3
/*      */       //   4: aload_0
/*      */       //   5: getfield label : I
/*      */       //   8: tableswitch default -> 118, 0 -> 32, 1 -> 91
/*      */       //   32: aload_1
/*      */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */       //   36: aload_0
/*      */       //   37: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;
/*      */       //   40: invokestatic access$getTaskService$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;)Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService;
/*      */       //   43: aload_0
/*      */       //   44: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;
/*      */       //   47: invokevirtual getLiveTaskChain : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskChain;
/*      */       //   50: invokeinterface getChain : ()Lkotlinx/coroutines/flow/StateFlow;
/*      */       //   55: invokeinterface getValue : ()Ljava/lang/Object;
/*      */       //   60: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity
/*      */       //   63: invokevirtual getId : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*      */       //   66: aload_0
/*      */       //   67: getfield $taskId : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*      */       //   70: aload_0
/*      */       //   71: checkcast kotlin/coroutines/Continuation
/*      */       //   74: aload_0
/*      */       //   75: iconst_1
/*      */       //   76: putfield label : I
/*      */       //   79: invokeinterface declineStartingFrom : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */       //   84: dup
/*      */       //   85: aload_3
/*      */       //   86: if_acmpne -> 96
/*      */       //   89: aload_3
/*      */       //   90: areturn
/*      */       //   91: aload_1
/*      */       //   92: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */       //   95: aload_1
/*      */       //   96: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService$DeclineStatus
/*      */       //   99: astore_2
/*      */       //   100: aload_2
/*      */       //   101: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService$DeclineStatus.NOTHING_LEFT : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService$DeclineStatus;
/*      */       //   104: if_acmpne -> 114
/*      */       //   107: aload_0
/*      */       //   108: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;
/*      */       //   111: invokevirtual openMainPage : ()V
/*      */       //   114: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */       //   117: areturn
/*      */       //   118: new java/lang/IllegalStateException
/*      */       //   121: dup
/*      */       //   122: ldc 'call to 'resume' before 'invoke' with coroutine'
/*      */       //   124: invokespecial <init> : (Ljava/lang/String;)V
/*      */       //   127: athrow
/*      */       // Line number table:
/*      */       //   Java source line number -> byte code offset
/*      */       //   #285	-> 3
/*      */       //   #286	-> 36
/*      */       //   #285	-> 89
/*      */       //   #287	-> 100
/*      */       //   #288	-> 107
/*      */       //   #290	-> 114
/*      */       //   #285	-> 118
/*      */       // Local variable table:
/*      */       //   start	length	slot	name	descriptor
/*      */       //   100	7	2	result	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService$DeclineStatus;
/*      */       //   0	128	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel$declineStartingFrom$1;
/*      */       //   36	82	1	$result	Ljava/lang/Object;
/*      */     }
/*      */     
/*      */     public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModel$declineStartingFrom$1> $completion) {
/*      */       return (Continuation<Unit>)new TaskChainDetailsViewModel$declineStartingFrom$1(this.$taskId, $completion);
/*      */     }
/*      */     
/*      */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*      */       return ((TaskChainDetailsViewModel$declineStartingFrom$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */     }
/*      */   }
/*      */   
/*      */   public final void declineAll() {
/*      */     BuildersKt.launch$default(MatterhornServiceScope.Companion.getScope(this.project), null, null, new TaskChainDetailsViewModel$declineAll$1(null), 3, null);
/*      */     openMainPage();
/*      */   }
/*      */   
/*      */   @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {295}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$declineAll$1")
/*      */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*      */   static final class TaskChainDetailsViewModel$declineAll$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*      */     int label;
/*      */     
/*      */     TaskChainDetailsViewModel$declineAll$1(Continuation $completion) {
/*      */       super(2, $completion);
/*      */     }
/*      */     
/*      */     public final Object invokeSuspend(Object $result) {
/*      */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*      */       switch (this.label) {
/*      */         case 0:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           this.label = 1;
/*      */           if (TaskChainDetailsViewModel.this.taskService.declineStartingFrom(((TaskChainEntity)TaskChainDetailsViewModel.this.getLiveTaskChain().getChain().getValue()).getId(), null, (Continuation)this) == object)
/*      */             return object; 
/*      */           TaskChainDetailsViewModel.this.taskService.declineStartingFrom(((TaskChainEntity)TaskChainDetailsViewModel.this.getLiveTaskChain().getChain().getValue()).getId(), null, (Continuation)this);
/*      */           return Unit.INSTANCE;
/*      */         case 1:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           return Unit.INSTANCE;
/*      */       } 
/*      */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*      */     }
/*      */     
/*      */     public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModel$declineAll$1> $completion) {
/*      */       return (Continuation<Unit>)new TaskChainDetailsViewModel$declineAll$1($completion);
/*      */     }
/*      */     
/*      */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*      */       return ((TaskChainDetailsViewModel$declineAll$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */     }
/*      */   }
/*      */   
/*      */   public final void startAgain() {
/*      */     this.startAgain = true;
/*      */     openMainPage();
/*      */   }
/*      */   
/*      */   public final void runTerminalCommand() {
/*      */     reactToHumanInLoopRequest(true);
/*      */   }
/*      */   
/*      */   @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {322, 323}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$reactToHumanInLoopRequest$2")
/*      */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*      */   static final class TaskChainDetailsViewModel$reactToHumanInLoopRequest$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*      */     int label;
/*      */     
/*      */     TaskChainDetailsViewModel$reactToHumanInLoopRequest$2(boolean $confirmed, TaskChainDetailsViewModel $receiver, Continuation $completion) {
/*      */       super(2, $completion);
/*      */     }
/*      */     
/*      */     public final Object invokeSuspend(Object $result) {
/*      */       HumanInLoopRequest humanInLoopRequest;
/*      */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*      */       switch (this.label) {
/*      */         case 0:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           humanInLoopRequest = this.$humanInLoopRequest;
/*      */           if (((humanInLoopRequest instanceof ActionApprovalRequest) ? humanInLoopRequest : null) == null) {
/*      */             (humanInLoopRequest instanceof ActionApprovalRequest) ? humanInLoopRequest : null;
/*      */             throw new IllegalStateException(("Expected ActionApprovalRequest, got " + Reflection.getOrCreateKotlinClass(this.$humanInLoopRequest.getClass()).getSimpleName() + " instead.").toString());
/*      */           } 
/*      */           (humanInLoopRequest instanceof ActionApprovalRequest) ? humanInLoopRequest : null;
/*      */           this.label = 1;
/*      */           if (((ActionApprovalRequest)this.$humanInLoopRequest).getReaction().invoke(this.$confirmed ? HumanInLoopResponse.Agree.INSTANCE : HumanInLoopResponse.Disagree.INSTANCE, this) == object)
/*      */             return object; 
/*      */           ((ActionApprovalRequest)this.$humanInLoopRequest).getReaction().invoke(this.$confirmed ? HumanInLoopResponse.Agree.INSTANCE : HumanInLoopResponse.Disagree.INSTANCE, this);
/*      */           this.label = 2;
/*      */           if (TaskService.Companion.getInstance(TaskChainDetailsViewModel.this.getProject()).continueTask(((TaskChainEntity)TaskChainDetailsViewModel.this.getLiveTaskChain().getChain().getValue()).getId(), (Continuation)this) == object)
/*      */             return object; 
/*      */           TaskService.Companion.getInstance(TaskChainDetailsViewModel.this.getProject()).continueTask(((TaskChainEntity)TaskChainDetailsViewModel.this.getLiveTaskChain().getChain().getValue()).getId(), (Continuation)this);
/*      */           return Unit.INSTANCE;
/*      */         case 1:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           this.label = 2;
/*      */           if (TaskService.Companion.getInstance(TaskChainDetailsViewModel.this.getProject()).continueTask(((TaskChainEntity)TaskChainDetailsViewModel.this.getLiveTaskChain().getChain().getValue()).getId(), (Continuation)this) == object)
/*      */             return object; 
/*      */           TaskService.Companion.getInstance(TaskChainDetailsViewModel.this.getProject()).continueTask(((TaskChainEntity)TaskChainDetailsViewModel.this.getLiveTaskChain().getChain().getValue()).getId(), (Continuation)this);
/*      */           return Unit.INSTANCE;
/*      */         case 2:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           return Unit.INSTANCE;
/*      */       } 
/*      */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*      */     }
/*      */     
/*      */     public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModel$reactToHumanInLoopRequest$2> $completion) {
/*      */       return (Continuation<Unit>)new TaskChainDetailsViewModel$reactToHumanInLoopRequest$2(this.$confirmed, TaskChainDetailsViewModel.this, $completion);
/*      */     }
/*      */     
/*      */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*      */       return ((TaskChainDetailsViewModel$reactToHumanInLoopRequest$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */     }
/*      */   }
/*      */   
/*      */   public final void skipTerminalCommand() {
/*      */     reactToHumanInLoopRequest(false);
/*      */   }
/*      */   
/*      */   public final void stopTerminalCommand() {
/*      */     Job currentJob = (Job)this.liveTaskChain.getCurrentJob().getValue();
/*      */     if (currentJob != null) {
/*      */       if (currentJob.isActive())
/*      */         JobKt.cancel$default(currentJob, "Cancelled by the user", null, 2, null); 
/*      */       ((LiveTaskSnapshot)CollectionsKt.lastOrNull((List)this.liveTaskChain.getTasks().getValue())).getTask();
/*      */       TaskId taskId = ((LiveTaskSnapshot)CollectionsKt.lastOrNull((List)this.liveTaskChain.getTasks().getValue()) != null && ((LiveTaskSnapshot)CollectionsKt.lastOrNull((List)this.liveTaskChain.getTasks().getValue())).getTask() != null) ? ((LiveTaskSnapshot)CollectionsKt.lastOrNull((List)this.liveTaskChain.getTasks().getValue())).getTask().getId() : null;
/*      */       if (taskId != null)
/*      */         CompositeUiAction.INSTANCE.logCancelStepTaskButtonClicked(((TaskChainEntity)this.liveTaskChain.getChain().getValue()).getId(), taskId); 
/*      */     } 
/*      */   }
/*      */   
/*      */   public final void reportIssue() {
/*      */     BuildersKt.launch$default(getScope(), null, null, new TaskChainDetailsViewModel$reportIssue$1(null), 3, null);
/*      */   }
/*      */   
/*      */   @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {347}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$reportIssue$1")
/*      */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*      */   static final class TaskChainDetailsViewModel$reportIssue$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*      */     int label;
/*      */     
/*      */     TaskChainDetailsViewModel$reportIssue$1(Continuation $completion) {
/*      */       super(2, $completion);
/*      */     }
/*      */     
/*      */     public final Object invokeSuspend(Object $result) {
/*      */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*      */       switch (this.label) {
/*      */         case 0:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           this.label = 1;
/*      */           if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) {
/*      */                 int label;
/*      */                 
/*      */                 public final Object invokeSuspend(Object $result) {
/*      */                   IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*      */                   switch (this.label) {
/*      */                     case 0:
/*      */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */                       (new JunieFeedbackDialog(TaskChainDetailsViewModel.this.getProject())).show();
/*      */                       return Unit.INSTANCE;
/*      */                   } 
/*      */                   throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*      */                 }
/*      */                 
/*      */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*      */                   return (Continuation)new Function2<>(TaskChainDetailsViewModel.this, $completion);
/*      */                 }
/*      */                 
/*      */                 public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*      */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */                 }
/*      */               }(Continuation)this) == object)
/*      */             return object; 
/*      */           BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) {
/*      */                 int label;
/*      */                 
/*      */                 public final Object invokeSuspend(Object $result) {
/*      */                   IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*      */                   switch (this.label) {
/*      */                     case 0:
/*      */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */                       (new JunieFeedbackDialog(TaskChainDetailsViewModel.this.getProject())).show();
/*      */                       return Unit.INSTANCE;
/*      */                   } 
/*      */                   throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*      */                 }
/*      */                 
/*      */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*      */                   return (Continuation)new Function2<>(TaskChainDetailsViewModel.this, $completion);
/*      */                 }
/*      */                 
/*      */                 public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*      */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */                 }
/*      */               }(Continuation)this);
/*      */           return Unit.INSTANCE;
/*      */         case 1:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           return Unit.INSTANCE;
/*      */       } 
/*      */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*      */     }
/*      */     
/*      */     public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModel$reportIssue$1> $completion) {
/*      */       return (Continuation<Unit>)new TaskChainDetailsViewModel$reportIssue$1($completion);
/*      */     }
/*      */     
/*      */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*      */       return ((TaskChainDetailsViewModel$reportIssue$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */     }
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final Object locateFile$ej_ui(@NotNull FileChange change, @NotNull Continuation $completion) {
/*      */     if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new TaskChainDetailsViewModel$locateFile$2(change, null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*      */       return BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new TaskChainDetailsViewModel$locateFile$2(change, null), $completion); 
/*      */     BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new TaskChainDetailsViewModel$locateFile$2(change, null), $completion);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$locateFile$2")
/*      */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*      */   static final class TaskChainDetailsViewModel$locateFile$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*      */     int label;
/*      */     
/*      */     TaskChainDetailsViewModel$locateFile$2(FileChange $change, Continuation $completion) {
/*      */       super(2, $completion);
/*      */     }
/*      */     
/*      */     public final Object invokeSuspend(Object $result) {
/*      */       VirtualFile file;
/*      */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*      */       switch (this.label) {
/*      */         case 0:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           Intrinsics.checkNotNull(ProjectUtil.guessProjectDir(TaskChainDetailsViewModel.this.getProject()));
/*      */           if (VfsUtil.findFile(ProjectUtil.guessProjectDir(TaskChainDetailsViewModel.this.getProject()).toNioPath().resolve(this.$change.getPath()), false) == null) {
/*      */             VfsUtil.findFile(ProjectUtil.guessProjectDir(TaskChainDetailsViewModel.this.getProject()).toNioPath().resolve(this.$change.getPath()), false);
/*      */             return Unit.INSTANCE;
/*      */           } 
/*      */           FileEditorManager.getInstance(TaskChainDetailsViewModel.this.getProject()).openFile(file, true);
/*      */           return Unit.INSTANCE;
/*      */       } 
/*      */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*      */     }
/*      */     
/*      */     public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModel$locateFile$2> $completion) {
/*      */       return (Continuation<Unit>)new TaskChainDetailsViewModel$locateFile$2(this.$change, $completion);
/*      */     }
/*      */     
/*      */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*      */       return ((TaskChainDetailsViewModel$locateFile$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */     }
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final Object revertChange$ej_ui(@NotNull FileChange change, @NotNull Continuation $completion) {
/*      */     if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new TaskChainDetailsViewModel$revertChange$2(this, null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*      */       return BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new TaskChainDetailsViewModel$revertChange$2(this, null), $completion); 
/*      */     BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new TaskChainDetailsViewModel$revertChange$2(this, null), $completion);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {363}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$revertChange$2")
/*      */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*      */   static final class TaskChainDetailsViewModel$revertChange$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*      */     int label;
/*      */     
/*      */     TaskChainDetailsViewModel$revertChange$2(TaskChainDetailsViewModel $receiver, Continuation $completion) {
/*      */       super(2, $completion);
/*      */     }
/*      */     
/*      */     public final Object invokeSuspend(Object $result) {
/*      */       // Byte code:
/*      */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*      */       //   3: astore #4
/*      */       //   5: aload_0
/*      */       //   6: getfield label : I
/*      */       //   9: tableswitch default -> 169, 0 -> 32, 1 -> 77
/*      */       //   32: aload_1
/*      */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */       //   36: aload_0
/*      */       //   37: getfield $change : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;
/*      */       //   40: invokevirtual getInitialContent : ()Ljava/lang/String;
/*      */       //   43: astore_2
/*      */       //   44: aload_2
/*      */       //   45: ifnonnull -> 86
/*      */       //   48: aload_0
/*      */       //   49: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;
/*      */       //   52: aload_0
/*      */       //   53: getfield $change : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;
/*      */       //   56: aload_0
/*      */       //   57: checkcast kotlin/coroutines/Continuation
/*      */       //   60: aload_0
/*      */       //   61: iconst_1
/*      */       //   62: putfield label : I
/*      */       //   65: invokevirtual deleteFile$ej_ui : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */       //   68: dup
/*      */       //   69: aload #4
/*      */       //   71: if_acmpne -> 82
/*      */       //   74: aload #4
/*      */       //   76: areturn
/*      */       //   77: aload_1
/*      */       //   78: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */       //   81: aload_1
/*      */       //   82: pop
/*      */       //   83: goto -> 165
/*      */       //   86: aload_0
/*      */       //   87: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;
/*      */       //   90: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*      */       //   93: invokestatic guessProjectDir : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/vfs/VirtualFile;
/*      */       //   96: dup
/*      */       //   97: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*      */       //   100: invokevirtual toNioPath : ()Ljava/nio/file/Path;
/*      */       //   103: aload_0
/*      */       //   104: getfield $change : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;
/*      */       //   107: invokevirtual getPath : ()Ljava/nio/file/Path;
/*      */       //   110: invokeinterface resolve : (Ljava/nio/file/Path;)Ljava/nio/file/Path;
/*      */       //   115: iconst_0
/*      */       //   116: invokestatic findFile : (Ljava/nio/file/Path;Z)Lcom/intellij/openapi/vfs/VirtualFile;
/*      */       //   119: dup
/*      */       //   120: ifnonnull -> 128
/*      */       //   123: pop
/*      */       //   124: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */       //   127: areturn
/*      */       //   128: astore_3
/*      */       //   129: aload_0
/*      */       //   130: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;
/*      */       //   133: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*      */       //   136: invokestatic writeCommandAction : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/command/WriteCommandAction$Builder;
/*      */       //   139: ldc 'command.revert.name'
/*      */       //   141: iconst_0
/*      */       //   142: anewarray java/lang/Object
/*      */       //   145: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*      */       //   148: invokeinterface withName : (Ljava/lang/String;)Lcom/intellij/openapi/command/WriteCommandAction$Builder;
/*      */       //   153: aload_3
/*      */       //   154: aload_2
/*      */       //   155: <illegal opcode> run : (Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/String;)Lcom/intellij/util/ThrowableRunnable;
/*      */       //   160: invokeinterface run : (Lcom/intellij/util/ThrowableRunnable;)V
/*      */       //   165: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */       //   168: areturn
/*      */       //   169: new java/lang/IllegalStateException
/*      */       //   172: dup
/*      */       //   173: ldc 'call to 'resume' before 'invoke' with coroutine'
/*      */       //   175: invokespecial <init> : (Ljava/lang/String;)V
/*      */       //   178: athrow
/*      */       // Line number table:
/*      */       //   Java source line number -> byte code offset
/*      */       //   #360	-> 3
/*      */       //   #361	-> 36
/*      */       //   #362	-> 44
/*      */       //   #363	-> 48
/*      */       //   #360	-> 74
/*      */       //   #363	-> 82
/*      */       //   #366	-> 86
/*      */       //   #365	-> 128
/*      */       //   #369	-> 129
/*      */       //   #370	-> 139
/*      */       //   #371	-> 153
/*      */       //   #375	-> 165
/*      */       //   #360	-> 169
/*      */       // Local variable table:
/*      */       //   start	length	slot	name	descriptor
/*      */       //   44	4	2	initialContent	Ljava/lang/String;
/*      */       //   86	37	2	initialContent	Ljava/lang/String;
/*      */       //   128	37	2	initialContent	Ljava/lang/String;
/*      */       //   129	36	3	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*      */       //   0	179	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel$revertChange$2;
/*      */       //   36	133	1	$result	Ljava/lang/Object;
/*      */     }
/*      */     
/*      */     public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModel$revertChange$2> $completion) {
/*      */       return (Continuation<Unit>)new TaskChainDetailsViewModel$revertChange$2(TaskChainDetailsViewModel.this, $completion);
/*      */     }
/*      */     
/*      */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*      */       return ((TaskChainDetailsViewModel$revertChange$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */     }
/*      */     
/*      */     private static final void invokeSuspend$lambda$0(VirtualFile $file, String $initialContent) {
/*      */       String str = $initialContent;
/*      */       Intrinsics.checkNotNullExpressionValue($file.getCharset(), "getCharset(...)");
/*      */       Intrinsics.checkNotNullExpressionValue(str.getBytes($file.getCharset()), "getBytes(...)");
/*      */       $file.setBinaryContent(str.getBytes($file.getCharset()));
/*      */     }
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final Object deleteFile$ej_ui(@NotNull FileChange change, @NotNull Continuation $completion) {
/*      */     if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new TaskChainDetailsViewModel$deleteFile$2(this, null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*      */       return BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new TaskChainDetailsViewModel$deleteFile$2(this, null), $completion); 
/*      */     BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new TaskChainDetailsViewModel$deleteFile$2(this, null), $completion);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$deleteFile$2")
/*      */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*      */   static final class TaskChainDetailsViewModel$deleteFile$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*      */     int label;
/*      */     
/*      */     TaskChainDetailsViewModel$deleteFile$2(TaskChainDetailsViewModel $receiver, Continuation $completion) {
/*      */       super(2, $completion);
/*      */     }
/*      */     
/*      */     public final Object invokeSuspend(Object $result) {
/*      */       VirtualFile file;
/*      */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*      */       switch (this.label) {
/*      */         case 0:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           if (this.$change.getInitialContent() != null)
/*      */             return Unit.INSTANCE; 
/*      */           Intrinsics.checkNotNull(ProjectUtil.guessProjectDir(TaskChainDetailsViewModel.this.getProject()));
/*      */           if (VfsUtil.findFile(ProjectUtil.guessProjectDir(TaskChainDetailsViewModel.this.getProject()).toNioPath().resolve(this.$change.getPath()), false) == null) {
/*      */             VfsUtil.findFile(ProjectUtil.guessProjectDir(TaskChainDetailsViewModel.this.getProject()).toNioPath().resolve(this.$change.getPath()), false);
/*      */             return Unit.INSTANCE;
/*      */           } 
/*      */           WriteCommandAction.runWriteCommandAction(TaskChainDetailsViewModel.this.getProject(), file::invokeSuspend$lambda$0);
/*      */           return Unit.INSTANCE;
/*      */       } 
/*      */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*      */     }
/*      */     
/*      */     public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModel$deleteFile$2> $completion) {
/*      */       return (Continuation<Unit>)new TaskChainDetailsViewModel$deleteFile$2(TaskChainDetailsViewModel.this, $completion);
/*      */     }
/*      */     
/*      */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*      */       return ((TaskChainDetailsViewModel$deleteFile$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */     }
/*      */     
/*      */     private static final void invokeSuspend$lambda$0(VirtualFile $file) {
/*      */       $file.delete(null);
/*      */     }
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final Object checkFileOnVcs$ej_ui(@NotNull FileChange change, @NotNull Continuation $completion) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: aload_1
/*      */     //   2: invokespecial getFile : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;)Lcom/intellij/openapi/vfs/VirtualFile;
/*      */     //   5: dup
/*      */     //   6: ifnonnull -> 15
/*      */     //   9: pop
/*      */     //   10: iconst_0
/*      */     //   11: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*      */     //   14: areturn
/*      */     //   15: astore_3
/*      */     //   16: aload_0
/*      */     //   17: aload_3
/*      */     //   18: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;Lcom/intellij/openapi/vfs/VirtualFile;)Lkotlin/jvm/functions/Function0;
/*      */     //   23: aload_2
/*      */     //   24: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */     //   27: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #390	-> 0
/*      */     //   #391	-> 16
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   16	12	3	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*      */     //   0	28	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;
/*      */     //   0	28	1	change	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;
/*      */     //   0	28	2	$completion	Lkotlin/coroutines/Continuation;
/*      */   }
/*      */   
/*      */   private static final boolean checkFileOnVcs$lambda$5(TaskChainDetailsViewModel this$0, VirtualFile $file) {
/*      */     Intrinsics.checkNotNullExpressionValue(FileStatusManager.getInstance(this$0.project).getStatus($file), "getStatus(...)");
/*      */     FileStatus status = FileStatusManager.getInstance(this$0.project).getStatus($file);
/*      */     return (ProjectLevelVcsManager.getInstance(this$0.project).getVcsFor($file) != null && !Intrinsics.areEqual(status, FileStatus.UNKNOWN));
/*      */   }
/*      */   
/*      */   public final boolean checkProjectUnderVCS$ej_ui() {
/*      */     Intrinsics.checkNotNullExpressionValue(ProjectLevelVcsManager.getInstance(this.project).getAllActiveVcss(), "getAllActiveVcss(...)");
/*      */     return !((((Object[])ProjectLevelVcsManager.getInstance(this.project).getAllActiveVcss()).length == 0) ? 1 : 0);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final Object addFileToVCS$ej_ui(@NotNull FileChange change, @NotNull Continuation $completion) {
/*      */     // Byte code:
/*      */     //   0: aload_2
/*      */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel$addFileToVCS$1
/*      */     //   4: ifeq -> 41
/*      */     //   7: aload_2
/*      */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel$addFileToVCS$1
/*      */     //   11: astore #6
/*      */     //   13: aload #6
/*      */     //   15: getfield label : I
/*      */     //   18: ldc_w -2147483648
/*      */     //   21: iand
/*      */     //   22: ifeq -> 41
/*      */     //   25: aload #6
/*      */     //   27: dup
/*      */     //   28: getfield label : I
/*      */     //   31: ldc_w -2147483648
/*      */     //   34: isub
/*      */     //   35: putfield label : I
/*      */     //   38: goto -> 52
/*      */     //   41: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel$addFileToVCS$1
/*      */     //   44: dup
/*      */     //   45: aload_0
/*      */     //   46: aload_2
/*      */     //   47: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;Lkotlin/coroutines/Continuation;)V
/*      */     //   50: astore #6
/*      */     //   52: aload #6
/*      */     //   54: getfield result : Ljava/lang/Object;
/*      */     //   57: astore #5
/*      */     //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*      */     //   62: astore #7
/*      */     //   64: aload #6
/*      */     //   66: getfield label : I
/*      */     //   69: tableswitch default -> 237, 0 -> 96, 1 -> 149, 2 -> 225
/*      */     //   96: aload #5
/*      */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */     //   101: aload_0
/*      */     //   102: aload_1
/*      */     //   103: invokespecial getFile : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;)Lcom/intellij/openapi/vfs/VirtualFile;
/*      */     //   106: dup
/*      */     //   107: ifnonnull -> 115
/*      */     //   110: pop
/*      */     //   111: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */     //   114: areturn
/*      */     //   115: astore_3
/*      */     //   116: aload_0
/*      */     //   117: aload_3
/*      */     //   118: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;Lcom/intellij/openapi/vfs/VirtualFile;)Lkotlin/jvm/functions/Function0;
/*      */     //   123: aload #6
/*      */     //   125: aload #6
/*      */     //   127: aload_3
/*      */     //   128: putfield L$0 : Ljava/lang/Object;
/*      */     //   131: aload #6
/*      */     //   133: iconst_1
/*      */     //   134: putfield label : I
/*      */     //   137: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */     //   140: dup
/*      */     //   141: aload #7
/*      */     //   143: if_acmpne -> 165
/*      */     //   146: aload #7
/*      */     //   148: areturn
/*      */     //   149: aload #6
/*      */     //   151: getfield L$0 : Ljava/lang/Object;
/*      */     //   154: checkcast com/intellij/openapi/vfs/VirtualFile
/*      */     //   157: astore_3
/*      */     //   158: aload #5
/*      */     //   160: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */     //   163: aload #5
/*      */     //   165: checkcast com/intellij/openapi/vcs/checkin/CheckinEnvironment
/*      */     //   168: dup
/*      */     //   169: ifnonnull -> 177
/*      */     //   172: pop
/*      */     //   173: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */     //   176: areturn
/*      */     //   177: astore #4
/*      */     //   179: invokestatic getIO : ()Lkotlinx/coroutines/CoroutineDispatcher;
/*      */     //   182: checkcast kotlin/coroutines/CoroutineContext
/*      */     //   185: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel$addFileToVCS$2
/*      */     //   188: dup
/*      */     //   189: aload #4
/*      */     //   191: aload_3
/*      */     //   192: aconst_null
/*      */     //   193: invokespecial <init> : (Lcom/intellij/openapi/vcs/checkin/CheckinEnvironment;Lcom/intellij/openapi/vfs/VirtualFile;Lkotlin/coroutines/Continuation;)V
/*      */     //   196: checkcast kotlin/jvm/functions/Function2
/*      */     //   199: aload #6
/*      */     //   201: aload #6
/*      */     //   203: aconst_null
/*      */     //   204: putfield L$0 : Ljava/lang/Object;
/*      */     //   207: aload #6
/*      */     //   209: iconst_2
/*      */     //   210: putfield label : I
/*      */     //   213: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */     //   216: dup
/*      */     //   217: aload #7
/*      */     //   219: if_acmpne -> 232
/*      */     //   222: aload #7
/*      */     //   224: areturn
/*      */     //   225: aload #5
/*      */     //   227: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */     //   230: aload #5
/*      */     //   232: pop
/*      */     //   233: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */     //   236: areturn
/*      */     //   237: new java/lang/IllegalStateException
/*      */     //   240: dup
/*      */     //   241: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*      */     //   244: invokespecial <init> : (Ljava/lang/String;)V
/*      */     //   247: athrow
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #404	-> 62
/*      */     //   #405	-> 101
/*      */     //   #406	-> 116
/*      */     //   #404	-> 146
/*      */     //   #406	-> 165
/*      */     //   #409	-> 173
/*      */     //   #406	-> 177
/*      */     //   #411	-> 179
/*      */     //   #404	-> 222
/*      */     //   #414	-> 232
/*      */     //   #404	-> 237
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   101	9	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;
/*      */     //   115	25	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;
/*      */     //   101	5	1	change	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;
/*      */     //   116	33	3	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*      */     //   158	14	3	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*      */     //   177	39	3	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*      */     //   179	37	4	checkinEnvironment	Lcom/intellij/openapi/vcs/checkin/CheckinEnvironment;
/*      */     //   0	248	2	$completion	Lkotlin/coroutines/Continuation;
/*      */     //   52	185	6	$continuation	Lkotlin/coroutines/Continuation;
/*      */     //   59	178	5	$result	Ljava/lang/Object;
/*      */   }
/*      */   
/*      */   private static final CheckinEnvironment addFileToVCS$lambda$6(TaskChainDetailsViewModel this$0, VirtualFile $file) {
/*      */     AbstractVcs vcs;
/*      */     if (ProjectLevelVcsManager.getInstance(this$0.project).getVcsFor($file) == null) {
/*      */       ProjectLevelVcsManager.getInstance(this$0.project).getVcsFor($file);
/*      */       return null;
/*      */     } 
/*      */     if (vcs.getCheckinEnvironment() == null) {
/*      */       vcs.getCheckinEnvironment();
/*      */       return null;
/*      */     } 
/*      */     return vcs.getCheckinEnvironment();
/*      */   }
/*      */   
/*      */   @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$addFileToVCS$2")
/*      */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\030\n\000\n\002\020!\n\002\030\002\n\000\n\002\030\002\n\002\020 \n\002\030\002\020\000\0322\022\f\022\n \003*\004\030\0010\0020\002\030\001 \003*\027\022\f\022\n \003*\004\030\0010\0020\002\030\0010\005¢\006\002\b\0040\001¢\006\002\b\004*\0020\006H\n"}, d2 = {"<anonymous>", "", "Lcom/intellij/openapi/vcs/VcsException;", "kotlin.jvm.PlatformType", "Lorg/jetbrains/annotations/Nullable;", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*      */   static final class TaskChainDetailsViewModel$addFileToVCS$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<VcsException>>, Object> {
/*      */     int label;
/*      */     
/*      */     TaskChainDetailsViewModel$addFileToVCS$2(CheckinEnvironment $checkinEnvironment, VirtualFile $file, Continuation $completion) {
/*      */       super(2, $completion);
/*      */     }
/*      */     
/*      */     public final Object invokeSuspend(Object $result) {
/*      */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*      */       switch (this.label) {
/*      */         case 0:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           return this.$checkinEnvironment.scheduleUnversionedFilesForAddition(CollectionsKt.listOf(this.$file));
/*      */       } 
/*      */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*      */     }
/*      */     
/*      */     public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModel$addFileToVCS$2> $completion) {
/*      */       return (Continuation<Unit>)new TaskChainDetailsViewModel$addFileToVCS$2(this.$checkinEnvironment, this.$file, $completion);
/*      */     }
/*      */     
/*      */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*      */       return ((TaskChainDetailsViewModel$addFileToVCS$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */     }
/*      */   }
/*      */   
/*      */   private final VirtualFile getFile(FileChange change) {
/*      */     VirtualFile file;
/*      */     Intrinsics.checkNotNull(ProjectUtil.guessProjectDir(this.project));
/*      */     Path fullPath = ProjectUtil.guessProjectDir(this.project).toNioPath().resolve(change.getPath());
/*      */     if (VfsUtil.findFile(fullPath, false) == null) {
/*      */       VfsUtil.findFile(fullPath, false);
/*      */       return null;
/*      */     } 
/*      */     return file;
/*      */   }
/*      */   
/*      */   public final void showDiff$ej_ui(@NotNull FileChange change, boolean wantEditable) {
/*      */     Intrinsics.checkNotNullParameter(change, "change");
/*      */     Intrinsics.checkNotNullExpressionValue(DiffContentFactory.getInstance(), "getInstance(...)");
/*      */     DiffContentFactory contentFactory = DiffContentFactory.getInstance();
/*      */     Intrinsics.checkNotNull(ProjectUtil.guessProjectDir(this.project));
/*      */     VirtualFile file = VfsUtil.findFile(ProjectUtil.guessProjectDir(this.project).toNioPath().resolve(change.getPath()), false);
/*      */     if (change.getInitialContent() == null)
/*      */       change.getInitialContent(); 
/*      */     Intrinsics.checkNotNullExpressionValue(this.project.create((Project)change.getInitialContent(), "", file), "create(...)");
/*      */     DocumentContent initialContent = this.project.create((Project)change.getInitialContent(), "", file);
/*      */     DiffContent diffContent1 = contentFactory.create(this.project, file);
/*      */     Intrinsics.checkNotNull(diffContent1);
/*      */     if (change.getNewContent() == null)
/*      */       change.getNewContent(); 
/*      */     DocumentContent documentContent1 = this.project.create((Project)change.getNewContent(), "", file);
/*      */     Intrinsics.checkNotNull(documentContent1);
/*      */     DiffContent newContent = (wantEditable && file != null && file.isValid()) ? diffContent1 : (DiffContent)documentContent1;
/*      */     SimpleDiffRequest request = new SimpleDiffRequest("Diff for File: " + change.getPath().getFileName(), (DiffContent)initialContent, newContent, "Initial Content", "New Content");
/*      */     DiffManager.getInstance().showDiff(this.project, (DiffRequest)request);
/*      */   }
/*      */   
/*      */   @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {406, 411}, i = {0}, s = {"L$0"}, n = {"file"}, m = "addFileToVCS$ej_ui", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel")
/*      */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*      */   static final class TaskChainDetailsViewModel$addFileToVCS$1 extends ContinuationImpl {
/*      */     Object L$0;
/*      */     int label;
/*      */     
/*      */     TaskChainDetailsViewModel$addFileToVCS$1(Continuation $completion) {
/*      */       super($completion);
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public final Object invokeSuspend(@NotNull Object $result) {
/*      */       this.result = $result;
/*      */       this.label |= Integer.MIN_VALUE;
/*      */       return TaskChainDetailsViewModel.this.addFileToVCS$ej_ui(null, (Continuation<? super Unit>)this);
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\TaskChainDetailsViewModel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */