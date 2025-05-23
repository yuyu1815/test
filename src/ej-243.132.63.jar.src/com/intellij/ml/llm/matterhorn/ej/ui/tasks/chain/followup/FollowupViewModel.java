/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.followup;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskService;
/*    */ import java.util.Collection;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\036\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\b\007\030\0002\0020\0012\0020\002BC\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n\022\006\020\013\032\0020\f\022\022\020\r\032\016\022\n\022\b\022\004\022\0020\0200\0170\016¢\006\004\b\021\020\022J\020\020\037\032\0020 2\006\020!\032\0020\"H\026R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\023\020\024R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\025\020\026R\016\020\t\032\0020\nX\004¢\006\002\n\000R\016\020\013\032\0020\fX\004¢\006\002\n\000R\032\020\r\032\016\022\n\022\b\022\004\022\0020\0200\0170\016X\004¢\006\002\n\000R\024\020\027\032\0020\030X\004¢\006\b\n\000\032\004\b\031\020\032R\024\020\033\032\0020\034X\004¢\006\b\n\000\032\004\b\035\020\036¨\006#"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/followup/FollowupViewModel;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptOwnerViewModel;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "project", "Lcom/intellij/openapi/project/Project;", "llmProxy", "Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;", "liveTaskChain", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskChain;", "taskService", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService;", "checkForJunieProblems", "Lkotlin/Function0;", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskChain;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService;Lkotlin/jvm/functions/Function0;)V", "getProject", "()Lcom/intellij/openapi/project/Project;", "getLlmProxy", "()Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;", "textState", "Landroidx/compose/foundation/text/input/TextFieldState;", "getTextState", "()Landroidx/compose/foundation/text/input/TextFieldState;", "attachedFiles", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;", "getAttachedFiles", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;", "submitTask", "", "mode", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nFollowupViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FollowupViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/followup/FollowupViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n543#2,6:74\n*S KotlinDebug\n*F\n+ 1 FollowupViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/followup/FollowupViewModel\n*L\n50#1:74,6\n*E\n"})
/*    */ public final class FollowupViewModel extends ViewModel implements PromptOwnerViewModel {
/*    */   @NotNull
/*    */   private final Project project;
/*    */   @NotNull
/*    */   private final LLMProxy llmProxy;
/*    */   @NotNull
/*    */   private final LiveTaskChain liveTaskChain;
/*    */   @NotNull
/*    */   private final TaskService taskService;
/*    */   
/* 23 */   public boolean getPerplexityModeEnabled() { return PromptOwnerViewModel.DefaultImpls.getPerplexityModeEnabled(this); } @NotNull private final Function0<Collection<JuniePreconditionChecker.JunieProblem>> checkForJunieProblems; @NotNull private final TextFieldState textState; @NotNull
/*    */   private final AttachedFilesViewModel attachedFiles; public static final int $stable = 8; @NotNull
/* 25 */   public Project getProject() { return this.project; } @NotNull
/* 26 */   public final LLMProxy getLlmProxy() { return this.llmProxy; }
/*    */ 
/*    */   
/*    */   public FollowupViewModel(@NotNull CoroutineScope scope, @NotNull Project project, @NotNull LLMProxy llmProxy, @NotNull LiveTaskChain liveTaskChain, @NotNull TaskService taskService, @NotNull Function0<Collection<JuniePreconditionChecker.JunieProblem>> checkForJunieProblems) {
/* 30 */     super(scope, "FollowupViewModel"); this.project = project; this.llmProxy = llmProxy; this.liveTaskChain = liveTaskChain; this.taskService = taskService;
/*    */     this.checkForJunieProblems = checkForJunieProblems;
/* 32 */     this.textState = new TextFieldState(null, 0L, 3, null);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 37 */     if (getProject().getBasePath() == null) getProject().getBasePath();  super((Project)scope, (CoroutineScope)getProject().getBasePath(), "", 
/* 38 */         ExtensionsKt.persistentListOf(), 
/* 39 */         this.llmProxy.getImagesSupported(), 
/* 40 */         true);
/*    */     ((FollowupViewModel)new AttachedFilesViewModel()).attachedFiles = new AttachedFilesViewModel();
/*    */   } @NotNull public TextFieldState getTextState() { return this.textState; } @NotNull public AttachedFilesViewModel getAttachedFiles() { return this.attachedFiles; } public void submitTask(@NotNull PromptMode mode) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'mode'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: getfield checkForJunieProblems : Lkotlin/jvm/functions/Function0;
/*    */     //   10: invokeinterface invoke : ()Ljava/lang/Object;
/*    */     //   15: checkcast java/util/Collection
/*    */     //   18: invokeinterface isEmpty : ()Z
/*    */     //   23: ifne -> 30
/*    */     //   26: iconst_1
/*    */     //   27: goto -> 31
/*    */     //   30: iconst_0
/*    */     //   31: ifeq -> 35
/*    */     //   34: return
/*    */     //   35: getstatic com/intellij/ml/llm/matterhorn/ej/ui/statistics/CompositeUiAction.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/statistics/CompositeUiAction;
/*    */     //   38: iconst_1
/*    */     //   39: invokevirtual logSubmitTask : (Z)V
/*    */     //   42: aload_0
/*    */     //   43: invokevirtual getTextState : ()Landroidx/compose/foundation/text/input/TextFieldState;
/*    */     //   46: invokevirtual getText : ()Ljava/lang/CharSequence;
/*    */     //   49: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   52: astore_2
/*    */     //   53: aload_0
/*    */     //   54: getfield liveTaskChain : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskChain;
/*    */     //   57: invokeinterface getChain : ()Lkotlinx/coroutines/flow/StateFlow;
/*    */     //   62: invokeinterface getValue : ()Ljava/lang/Object;
/*    */     //   67: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity
/*    */     //   70: astore_3
/*    */     //   71: aload_0
/*    */     //   72: getfield liveTaskChain : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskChain;
/*    */     //   75: invokeinterface getTasks : ()Lkotlinx/coroutines/flow/StateFlow;
/*    */     //   80: invokeinterface getValue : ()Ljava/lang/Object;
/*    */     //   85: checkcast kotlinx/collections/immutable/PersistentList
/*    */     //   88: astore #4
/*    */     //   90: aload #4
/*    */     //   92: checkcast java/util/List
/*    */     //   95: astore #6
/*    */     //   97: iconst_0
/*    */     //   98: istore #7
/*    */     //   100: aload #6
/*    */     //   102: aload #6
/*    */     //   104: invokeinterface size : ()I
/*    */     //   109: invokeinterface listIterator : (I)Ljava/util/ListIterator;
/*    */     //   114: astore #8
/*    */     //   116: aload #8
/*    */     //   118: invokeinterface hasPrevious : ()Z
/*    */     //   123: ifeq -> 169
/*    */     //   126: aload #8
/*    */     //   128: invokeinterface previous : ()Ljava/lang/Object;
/*    */     //   133: astore #9
/*    */     //   135: aload #9
/*    */     //   137: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot
/*    */     //   140: astore #10
/*    */     //   142: iconst_0
/*    */     //   143: istore #11
/*    */     //   145: aload #10
/*    */     //   147: invokevirtual getTask : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*    */     //   150: invokevirtual getFinalAgentState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*    */     //   153: ifnull -> 160
/*    */     //   156: iconst_1
/*    */     //   157: goto -> 161
/*    */     //   160: iconst_0
/*    */     //   161: ifeq -> 116
/*    */     //   164: aload #9
/*    */     //   166: goto -> 170
/*    */     //   169: aconst_null
/*    */     //   170: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot
/*    */     //   173: astore #5
/*    */     //   175: aload #5
/*    */     //   177: dup
/*    */     //   178: ifnull -> 221
/*    */     //   181: astore #8
/*    */     //   183: iconst_0
/*    */     //   184: istore #9
/*    */     //   186: new com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo
/*    */     //   189: dup
/*    */     //   190: aload #5
/*    */     //   192: invokevirtual getTask : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*    */     //   195: invokevirtual getFinalAgentState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*    */     //   198: aload #5
/*    */     //   200: invokevirtual getTask : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*    */     //   203: invokevirtual getPatch : ()Ljava/lang/String;
/*    */     //   206: aload #5
/*    */     //   208: invokevirtual getTask : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*    */     //   211: invokevirtual getSessionHistory : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;
/*    */     //   214: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;)V
/*    */     //   217: nop
/*    */     //   218: goto -> 223
/*    */     //   221: pop
/*    */     //   222: aconst_null
/*    */     //   223: astore #6
/*    */     //   225: getstatic com/intellij/ml/llm/matterhorn/MatterhornServiceScope.Companion : Lcom/intellij/ml/llm/matterhorn/MatterhornServiceScope$Companion;
/*    */     //   228: aload_0
/*    */     //   229: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   232: invokevirtual getScope : (Lcom/intellij/openapi/project/Project;)Lkotlinx/coroutines/CoroutineScope;
/*    */     //   235: aconst_null
/*    */     //   236: aconst_null
/*    */     //   237: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/followup/FollowupViewModel$submitTask$1
/*    */     //   240: dup
/*    */     //   241: aload_0
/*    */     //   242: aload_3
/*    */     //   243: aload_1
/*    */     //   244: aload_2
/*    */     //   245: aload #6
/*    */     //   247: aconst_null
/*    */     //   248: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/followup/FollowupViewModel;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;Lkotlin/coroutines/Continuation;)V
/*    */     //   251: checkcast kotlin/jvm/functions/Function2
/*    */     //   254: iconst_3
/*    */     //   255: aconst_null
/*    */     //   256: invokestatic launch$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
/*    */     //   259: pop
/*    */     //   260: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #44	-> 6
/*    */     //   #44	-> 31
/*    */     //   #45	-> 35
/*    */     //   #46	-> 42
/*    */     //   #47	-> 53
/*    */     //   #49	-> 71
/*    */     //   #50	-> 90
/*    */     //   #74	-> 100
/*    */     //   #75	-> 116
/*    */     //   #76	-> 126
/*    */     //   #77	-> 135
/*    */     //   #50	-> 145
/*    */     //   #77	-> 161
/*    */     //   #79	-> 169
/*    */     //   #50	-> 170
/*    */     //   #52	-> 175
/*    */     //   #53	-> 186
/*    */     //   #54	-> 190
/*    */     //   #55	-> 198
/*    */     //   #56	-> 206
/*    */     //   #53	-> 214
/*    */     //   #57	-> 217
/*    */     //   #52	-> 218
/*    */     //   #52	-> 221
/*    */     //   #60	-> 225
/*    */     //   #71	-> 260
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   145	16	11	$i$a$-lastOrNull-FollowupViewModel$submitTask$lastFinishedTask$1	I
/*    */     //   142	19	10	snapshot	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;
/*    */     //   135	34	9	element$iv	Ljava/lang/Object;
/*    */     //   100	70	7	$i$f$lastOrNull	I
/*    */     //   116	54	8	iterator$iv	Ljava/util/ListIterator;
/*    */     //   97	73	6	$this$lastOrNull$iv	Ljava/util/List;
/*    */     //   186	32	9	$i$a$-let-FollowupViewModel$submitTask$previousTasksInfo$1	I
/*    */     //   183	35	8	it	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;
/*    */     //   53	208	2	followupText	Ljava/lang/String;
/*    */     //   71	190	3	chainEntity	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*    */     //   90	171	4	tasks	Lkotlinx/collections/immutable/PersistentList;
/*    */     //   175	86	5	lastFinishedTask	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;
/*    */     //   225	36	6	previousTasksInfo	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;
/*    */     //   0	261	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/followup/FollowupViewModel;
/*    */     //   0	261	1	mode	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode; }
/*    */   @DebugMetadata(f = "FollowupViewModel.kt", l = {61}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.followup.FollowupViewModel$submitTask$1")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   @SourceDebugExtension({"SMAP\nFollowupViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FollowupViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/followup/FollowupViewModel$submitTask$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n1557#2:74\n1628#2,3:75\n*S KotlinDebug\n*F\n+ 1 FollowupViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/followup/FollowupViewModel$submitTask$1\n*L\n66#1:74\n66#1:75,3\n*E\n"})
/*    */   static final class FollowupViewModel$submitTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label;
/*    */     FollowupViewModel$submitTask$1(TaskChainEntity $chainEntity, PromptMode $mode, String $followupText, PreviousTasksInfo $previousTasksInfo, Continuation $completion) { super(2, $completion); }
/*    */     public final Object invokeSuspend(Object $result) { Iterable iterable1;
/*    */       int $i$f$map;
/*    */       Iterable iterable2;
/*    */       Collection<Path> destination$iv$iv;
/*    */       int $i$f$mapTo;
/*    */       TaskService taskService;
/*    */       TaskChainId taskChainId;
/*    */       IssueType issueType1;
/*    */       String str1;
/*    */       List list1, list2;
/*    */       String str2;
/*    */       IssueType issueType2;
/* 60 */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 66 */           iterable1 = (Iterable)FollowupViewModel.this.getAttachedFiles().getAttachedFiles().getValue(); str1 = this.$followupText; issueType1 = PromptOwnerViewModelKt.toTaskType(this.$mode); taskChainId = this.$chainEntity.getId(); taskService = FollowupViewModel.this.taskService; $i$f$map = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 74 */           iterable2 = iterable1; destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable1, 10)); $i$f$mapTo = 0;
/* 75 */           for (Object item$iv$iv : iterable2) {
/* 76 */             AttachedFile attachedFile = (AttachedFile)item$iv$iv; Collection<Path> collection = destination$iv$iv; int $i$a$-map-FollowupViewModel$submitTask$1$1 = 0; collection.add(attachedFile.getPath());
/* 77 */           }  list1 = (List)destination$iv$iv;
/*    */           list2 = list1;
/*    */           str2 = str1;
/*    */           issueType2 = issueType1;
/*    */           this.label = 1;
/*    */           if (taskService.start(taskChainId, new ExplicitTaskContext(issueType2, str2, list2), this.$previousTasksInfo, (Continuation)this) == object)
/*    */             return object; 
/*    */           taskService.start(taskChainId, new ExplicitTaskContext(issueType2, str2, list2), this.$previousTasksInfo, (Continuation)this);
/*    */           return Unit.INSTANCE;
/*    */         case 1:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           return Unit.INSTANCE; }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super FollowupViewModel$submitTask$1> $completion) {
/*    */       return (Continuation<Unit>)new FollowupViewModel$submitTask$1(this.$chainEntity, this.$mode, this.$followupText, this.$previousTasksInfo, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((FollowupViewModel$submitTask$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\followup\FollowupViewModel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */