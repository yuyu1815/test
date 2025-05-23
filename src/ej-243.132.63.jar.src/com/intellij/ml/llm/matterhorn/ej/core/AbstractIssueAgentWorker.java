/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutor;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactResponse;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactType;
/*     */ import com.intellij.ml.llm.matterhorn.CacheType;
/*     */ import com.intellij.ml.llm.matterhorn.CustomArtifactEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.ActionRequest;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.history_processors.CompressHistoryProcessorResponse;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.run.ExecutionSession;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.summarization.TaskSummarizer;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.summarization.TaskSummaryCreatedEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskResult;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*     */ import com.intellij.openapi.util.SystemInfo;
/*     */ import java.nio.file.Path;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin._Assertions;
/*     */ import kotlin.collections.SetsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineName;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.SupervisorKt;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \001\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\002\n\002\020#\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\004\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b&\030\000 <2\016\022\004\022\0020\002\022\004\022\0020\0030\001:\002;<B\007¢\006\004\b\004\020\005J\016\020\006\032\b\022\004\022\0020\b0\007H&J\026\020\t\032\0020\n2\006\020\013\032\0020\fH@¢\006\002\020\rJ$\020\016\032\b\022\004\022\0020\0030\0172\006\020\020\032\0020\0022\006\020\021\032\0020\022H@¢\006\002\020\023J\016\020\024\032\b\022\004\022\0020\0250\007H\026J\036\020\026\032\0020\0272\006\020\030\032\0020\0272\006\020\021\032\0020\022H@¢\006\002\020\031J\036\020\032\032\0020\0332\006\020\034\032\0020\0332\f\020\035\032\b\022\004\022\0020\0330\036H\002J\030\020\037\032\0020 2\006\020\020\032\0020\0022\006\020\021\032\0020\022H\002J\036\020!\032\0020\"2\006\020\021\032\0020\0222\006\020#\032\0020\027H@¢\006\002\020$J\036\020%\032\0020\0032\006\020\021\032\0020\0222\006\020#\032\0020\027H@¢\006\002\020$J\030\020&\032\0020'2\006\020(\032\0020'2\006\020)\032\0020*H\024J(\020+\032\0020,2\006\020\020\032\0020\0022\b\020-\032\004\030\0010.2\006\020\021\032\0020\022H@¢\006\002\020/J\030\0200\032\0020 2\006\0201\032\002022\006\020\021\032\0020\022H\024J&\0203\032\0020 2\006\0204\032\002052\006\0206\032\002072\006\020\021\032\0020,H@¢\006\002\0208J\b\0209\032\0020:H\024¨\006="}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker;", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;", "<init>", "()V", "getSingleStepArtifactType", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentResponse;", "getAgentParameters", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "(Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produceArtifact", "Lcom/intellij/ml/llm/matterhorn/ArtifactResponse;", "input", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCompressHistoryProcessorArtifactType", "Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessorResponse;", "compressAgentState", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "agentState", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createUniqueName", "", "name", "uniqueNames", "", "produceName", "", "getResult", "Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker$ResultContent;", "state", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prepareResult", "getNextStepNumber", "", "index", "action", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "initEnvironment", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "sessionHistory", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveExitStatus", "status", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentExitStatus;", "setupCommandExecutor", "executor", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;", "executionDir", "Ljava/nio/file/Path;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;Ljava/nio/file/Path;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStepResultType", "Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "ResultContent", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nAbstractIssueAgentWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractIssueAgentWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker\n+ 2 ArtifactRequestExecutorService.kt\ncom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorServiceKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,366:1\n117#2:367\n117#2:370\n14#3:368\n1#4:369\n*S KotlinDebug\n*F\n+ 1 AbstractIssueAgentWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker\n*L\n103#1:367\n192#1:370\n106#1:368\n*E\n"})
/*     */ public abstract class AbstractIssueAgentWorker
/*     */   implements ArtifactRequestExecutor<AgentIssue, TaskResult>
/*     */ {
/*     */   @Nullable
/*     */   public final Object getAgentParameters(@NotNull MatterhornPropertyProvider propertyProvider, @NotNull Continuation<? super AgentParameters> $completion) {
/*  73 */     ArtifactRequestExecutor stepArtifactExecutor = getSingleStepArtifactType().getExecutor();
/*  74 */     boolean bool = stepArtifactExecutor instanceof AbstractIssueSingleStepAgentWorker; if (_Assertions.ENABLED && !bool) { String str = "Assertion failed"; throw new AssertionError(str); }
/*  75 */      Intrinsics.checkNotNull(stepArtifactExecutor, "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueSingleStepAgentWorker"); return ((AbstractIssueSingleStepAgentWorker)stepArtifactExecutor).getAgentParameters(propertyProvider, $completion);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public ArtifactType<CompressHistoryProcessorResponse> getCompressHistoryProcessorArtifactType() {
/* 180 */     return AgentArtifactTypes.INSTANCE.getCompressHistoryProcessorArtifactType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Object compressAgentState(AgentState agentState, ExecutionContext context, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker$compressAgentState$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker$compressAgentState$1
/*     */     //   11: astore #9
/*     */     //   13: aload #9
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #9
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker$compressAgentState$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #9
/*     */     //   50: aload #9
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #8
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #10
/*     */     //   62: aload #9
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 280, 0 -> 88, 1 -> 203
/*     */     //   88: aload #8
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: new com/intellij/ml/llm/matterhorn/ej/core/AgentState
/*     */     //   96: dup
/*     */     //   97: aload_1
/*     */     //   98: invokevirtual getIssue : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;
/*     */     //   101: aload_1
/*     */     //   102: invokevirtual getObservations : ()Ljava/util/List;
/*     */     //   105: aconst_null
/*     */     //   106: aconst_null
/*     */     //   107: aconst_null
/*     */     //   108: aconst_null
/*     */     //   109: aload_1
/*     */     //   110: invokevirtual getIdeInitialState : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   113: aconst_null
/*     */     //   114: aload_1
/*     */     //   115: invokevirtual getExplicitlySelectedContextFiles : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   118: aconst_null
/*     */     //   119: aconst_null
/*     */     //   120: sipush #1724
/*     */     //   123: aconst_null
/*     */     //   124: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   127: astore #4
/*     */     //   129: aload_2
/*     */     //   130: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   133: aload_2
/*     */     //   134: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   137: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   140: aload_0
/*     */     //   141: invokevirtual getCompressHistoryProcessorArtifactType : ()Lcom/intellij/ml/llm/matterhorn/ArtifactType;
/*     */     //   144: invokevirtual childOfType : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ArtifactType;)Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   147: astore #5
/*     */     //   149: iconst_0
/*     */     //   150: istore #7
/*     */     //   152: new com/intellij/ml/llm/matterhorn/ArtifactRequest
/*     */     //   155: dup
/*     */     //   156: aload #5
/*     */     //   158: aload #4
/*     */     //   160: getstatic com/intellij/ml/llm/matterhorn/ej/core/AgentState.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState$Companion;
/*     */     //   163: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   166: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;)V
/*     */     //   169: astore #6
/*     */     //   171: aload_2
/*     */     //   172: aload #6
/*     */     //   174: aconst_null
/*     */     //   175: aload #9
/*     */     //   177: iconst_2
/*     */     //   178: aconst_null
/*     */     //   179: aload #9
/*     */     //   181: aload_1
/*     */     //   182: putfield L$0 : Ljava/lang/Object;
/*     */     //   185: aload #9
/*     */     //   187: iconst_1
/*     */     //   188: putfield label : I
/*     */     //   191: invokestatic getOrCreateArtifact$default : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   194: dup
/*     */     //   195: aload #10
/*     */     //   197: if_acmpne -> 219
/*     */     //   200: aload #10
/*     */     //   202: areturn
/*     */     //   203: aload #9
/*     */     //   205: getfield L$0 : Ljava/lang/Object;
/*     */     //   208: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentState
/*     */     //   211: astore_1
/*     */     //   212: aload #8
/*     */     //   214: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   217: aload #8
/*     */     //   219: checkcast com/intellij/ml/llm/matterhorn/Artifact
/*     */     //   222: invokevirtual getContent : ()Ljava/lang/Object;
/*     */     //   225: checkcast com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessorResponse
/*     */     //   228: astore #7
/*     */     //   230: aload #7
/*     */     //   232: invokevirtual getUpdatedObservations : ()Ljava/util/List;
/*     */     //   235: checkcast java/util/Collection
/*     */     //   238: invokeinterface isEmpty : ()Z
/*     */     //   243: ifne -> 250
/*     */     //   246: iconst_1
/*     */     //   247: goto -> 251
/*     */     //   250: iconst_0
/*     */     //   251: ifeq -> 278
/*     */     //   254: aload_1
/*     */     //   255: aconst_null
/*     */     //   256: aload #7
/*     */     //   258: invokevirtual getUpdatedObservations : ()Ljava/util/List;
/*     */     //   261: aconst_null
/*     */     //   262: aconst_null
/*     */     //   263: aconst_null
/*     */     //   264: aconst_null
/*     */     //   265: aconst_null
/*     */     //   266: aconst_null
/*     */     //   267: aconst_null
/*     */     //   268: aconst_null
/*     */     //   269: aconst_null
/*     */     //   270: sipush #1789
/*     */     //   273: aconst_null
/*     */     //   274: invokestatic copy$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   277: areturn
/*     */     //   278: aload_1
/*     */     //   279: areturn
/*     */     //   280: new java/lang/IllegalStateException
/*     */     //   283: dup
/*     */     //   284: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   287: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   290: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #183	-> 60
/*     */     //   #184	-> 93
/*     */     //   #185	-> 97
/*     */     //   #186	-> 101
/*     */     //   #184	-> 105
/*     */     //   #187	-> 109
/*     */     //   #184	-> 113
/*     */     //   #188	-> 114
/*     */     //   #184	-> 118
/*     */     //   #191	-> 129
/*     */     //   #192	-> 149
/*     */     //   #370	-> 152
/*     */     //   #192	-> 169
/*     */     //   #193	-> 171
/*     */     //   #183	-> 200
/*     */     //   #193	-> 219
/*     */     //   #195	-> 230
/*     */     //   #195	-> 251
/*     */     //   #196	-> 254
/*     */     //   #197	-> 256
/*     */     //   #196	-> 261
/*     */     //   #198	-> 267
/*     */     //   #196	-> 268
/*     */     //   #201	-> 278
/*     */     //   #183	-> 280
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	56	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker;
/*     */     //   93	110	1	agentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   212	68	1	agentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   93	76	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   169	25	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   129	40	4	stateUpd	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   149	20	5	compressStepId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   171	23	6	compressHistoryArtifactRequest	Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   230	50	7	compressHistoryArtifact	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessorResponse;
/*     */     //   152	17	7	$i$f$artifactRequest	I
/*     */     //   0	291	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	230	9	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	223	8	$result	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final String createUniqueName(String name, Set<String> uniqueNames) {
/* 205 */     if (uniqueNames.add(name)) {
/* 206 */       return name;
/*     */     }
/* 208 */     int i = 1;
/*     */     while (true) {
/* 210 */       String newName = name + "(" + name + ")";
/* 211 */       if (uniqueNames.add(newName)) {
/* 212 */         return newName;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private final void produceName(AgentIssue input, ExecutionContext context)
/*     */   {
/* 220 */     BuildersKt.launch$default(context.getRoot().getScope(), SupervisorKt.SupervisorJob$default(null, 1, null).plus((CoroutineContext)new CoroutineName("TaskSummaryCreation")), null, new AbstractIssueAgentWorker$produceName$1(context, input, null), 2, null); } @DebugMetadata(f = "AbstractIssueAgentWorker.kt", l = {221}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueAgentWorker$produceName$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class AbstractIssueAgentWorker$produceName$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label; AbstractIssueAgentWorker$produceName$1(ExecutionContext $context, AgentIssue $input, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { String taskSummary; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 221 */           this.label = 1; if (TaskSummarizer.INSTANCE.summarizeTask(this.$context, this.$input, (Continuation)this) == object) return object;  taskSummary = (String)TaskSummarizer.INSTANCE.summarizeTask(this.$context, this.$input, (Continuation)this);
/* 222 */           this.$context.sendEvent((CustomArtifactEvent)new TaskSummaryCreatedEvent(taskSummary));
/* 223 */           return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); taskSummary = (String)SYNTHETIC_LOCAL_VARIABLE_1; this.$context.sendEvent((CustomArtifactEvent)new TaskSummaryCreatedEvent(taskSummary)); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super AbstractIssueAgentWorker$produceName$1> $completion) { return (Continuation<Unit>)new AbstractIssueAgentWorker$produceName$1(this.$context, this.$input, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((AbstractIssueAgentWorker$produceName$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/*     */    @DebugMetadata(f = "AbstractIssueAgentWorker.kt", l = {81, 83, 84, 85, 94, 105, 149, 176}, i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "I$0"}, n = {"$this", "input", "context", "previousTasksInfo", "$this", "input", "context", "previousTasksInfo", "executionAgentContext", "$this", "input", "context", "previousTasksInfo", "executionAgentContext", "ideInitialState", "$this", "input", "context", "previousTasksInfo", "executionAgentContext", "ideInitialState", "explicitlySelectedContextFiles", "$this", "input", "context", "executionAgentContext", "ideInitialState", "explicitlySelectedContextFiles", "agentParameters", "$this", "input", "context", "executionAgentContext", "ideInitialState", "explicitlySelectedContextFiles", "agentParameters", "agentState", "uniqueNames", "stepName", "step"}, m = "produceArtifact$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueAgentWorker") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class AbstractIssueAgentWorker$produceArtifact$1 extends ContinuationImpl { Object L$0; Object L$1; Object L$2; Object L$3; Object L$4; Object L$5; Object L$6; Object L$7; Object L$8; Object L$9; int I$0; int label; AbstractIssueAgentWorker$produceArtifact$1(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result; this.label |= Integer.MIN_VALUE; return AbstractIssueAgentWorker.produceArtifact$suspendImpl(AbstractIssueAgentWorker.this, null, null, (Continuation<? super ArtifactResponse<TaskResult>>)this); } } @DebugMetadata(f = "AbstractIssueAgentWorker.kt", l = {237, 238}, i = {0, 0, 0, 0, 1, 1, 1, 1, 1}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4"}, n = {"this", "context", "state", "agentContext", "this", "context", "state", "agentContext", "result"}, m = "prepareResult", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueAgentWorker") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class AbstractIssueAgentWorker$prepareResult$1 extends ContinuationImpl {
/*     */     Object L$0; Object L$1; Object L$2; Object L$3; Object L$4; int label; AbstractIssueAgentWorker$prepareResult$1(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result; this.label |= Integer.MIN_VALUE; return AbstractIssueAgentWorker.this.prepareResult(null, null, (Continuation<? super TaskResult>)this); }
/* 226 */   } @DebugMetadata(f = "AbstractIssueAgentWorker.kt", l = {266, 269}, i = {0, 0, 0, 1}, s = {"L$0", "L$1", "L$2", "L$0"}, n = {"this", "agentContext", "executionAgentContext", "executionAgentContext"}, m = "initEnvironment", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueAgentWorker") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class AbstractIssueAgentWorker$initEnvironment$1 extends ContinuationImpl { Object L$0; Object L$1; Object L$2; int label; AbstractIssueAgentWorker$initEnvironment$1(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result; this.label |= Integer.MIN_VALUE; return AbstractIssueAgentWorker.this.initEnvironment(null, null, null, (Continuation)this); } } @DebugMetadata(f = "AbstractIssueAgentWorker.kt", l = {229}, i = {}, s = {}, n = {}, m = "getResult$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueAgentWorker") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class AbstractIssueAgentWorker$getResult$1 extends ContinuationImpl { int label; AbstractIssueAgentWorker$getResult$1(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result; this.label |= Integer.MIN_VALUE; return AbstractIssueAgentWorker.getResult$suspendImpl(AbstractIssueAgentWorker.this, null, null, (Continuation<? super AbstractIssueAgentWorker.ResultContent>)this); } } @DebugMetadata(f = "AbstractIssueAgentWorker.kt", l = {193}, i = {0}, s = {"L$0"}, n = {"agentState"}, m = "compressAgentState", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueAgentWorker") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class AbstractIssueAgentWorker$compressAgentState$1 extends ContinuationImpl { Object L$0; int label; AbstractIssueAgentWorker$compressAgentState$1(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result; this.label |= Integer.MIN_VALUE; return AbstractIssueAgentWorker.this.compressAgentState(null, null, (Continuation)this); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\031\022\b\020\002\032\004\030\0010\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006J\013\020\n\032\004\030\0010\003HÆ\003J\t\020\013\032\0020\003HÆ\003J\037\020\f\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\b\b\002\020\004\032\0020\003HÆ\001J\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\001HÖ\003J\t\020\020\032\0020\021HÖ\001J\t\020\022\032\0020\003HÖ\001R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\t\020\b¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker$ResultContent;", "", "title", "", "output", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getOutput", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ej-core"}) public static final class ResultContent { @Nullable private final String title; public ResultContent(@Nullable String title, @NotNull String output) { this.title = title; this.output = output; } @NotNull private final String output; @Nullable public final String getTitle() { return this.title; } @NotNull public final String getOutput() { return this.output; } @Nullable
/*     */     public final String component1() { return this.title; } @NotNull
/*     */     public final String component2() {
/*     */       return this.output;
/*     */     } @NotNull
/*     */     public final ResultContent copy(@Nullable String title, @NotNull String output) {
/*     */       Intrinsics.checkNotNullParameter(output, "output");
/*     */       return new ResultContent(title, output);
/*     */     } @NotNull
/*     */     public String toString() {
/*     */       return "ResultContent(title=" + this.title + ", output=" + this.output + ")";
/*     */     } public int hashCode() {
/*     */       result = (this.title == null) ? 0 : this.title.hashCode();
/*     */       return result * 31 + this.output.hashCode();
/*     */     } public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof ResultContent))
/*     */         return false; 
/*     */       ResultContent resultContent = (ResultContent)other;
/*     */       return !Intrinsics.areEqual(this.title, resultContent.title) ? false : (!!Intrinsics.areEqual(this.output, resultContent.output));
/*     */     } } @Nullable
/*     */   protected final Object prepareResult(@NotNull ExecutionContext context, @NotNull AgentState state, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker$prepareResult$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker$prepareResult$1
/*     */     //   11: astore #9
/*     */     //   13: aload #9
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #9
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker$prepareResult$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #9
/*     */     //   50: aload #9
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #8
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #10
/*     */     //   62: aload #9
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 371, 0 -> 92, 1 -> 151, 2 -> 257
/*     */     //   92: aload #8
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_1
/*     */     //   98: invokestatic getExecutionAgentContext : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   101: astore #4
/*     */     //   103: aload_0
/*     */     //   104: aload_1
/*     */     //   105: aload_2
/*     */     //   106: aload #9
/*     */     //   108: aload #9
/*     */     //   110: aload_0
/*     */     //   111: putfield L$0 : Ljava/lang/Object;
/*     */     //   114: aload #9
/*     */     //   116: aload_1
/*     */     //   117: putfield L$1 : Ljava/lang/Object;
/*     */     //   120: aload #9
/*     */     //   122: aload_2
/*     */     //   123: putfield L$2 : Ljava/lang/Object;
/*     */     //   126: aload #9
/*     */     //   128: aload #4
/*     */     //   130: putfield L$3 : Ljava/lang/Object;
/*     */     //   133: aload #9
/*     */     //   135: iconst_1
/*     */     //   136: putfield label : I
/*     */     //   139: invokevirtual getResult : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   142: dup
/*     */     //   143: aload #10
/*     */     //   145: if_acmpne -> 195
/*     */     //   148: aload #10
/*     */     //   150: areturn
/*     */     //   151: aload #9
/*     */     //   153: getfield L$3 : Ljava/lang/Object;
/*     */     //   156: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   159: astore #4
/*     */     //   161: aload #9
/*     */     //   163: getfield L$2 : Ljava/lang/Object;
/*     */     //   166: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentState
/*     */     //   169: astore_2
/*     */     //   170: aload #9
/*     */     //   172: getfield L$1 : Ljava/lang/Object;
/*     */     //   175: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   178: astore_1
/*     */     //   179: aload #9
/*     */     //   181: getfield L$0 : Ljava/lang/Object;
/*     */     //   184: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker
/*     */     //   187: astore_0
/*     */     //   188: aload #8
/*     */     //   190: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   193: aload #8
/*     */     //   195: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker$ResultContent
/*     */     //   198: astore #5
/*     */     //   200: aload #4
/*     */     //   202: iconst_0
/*     */     //   203: aload #9
/*     */     //   205: iconst_1
/*     */     //   206: aconst_null
/*     */     //   207: aload #9
/*     */     //   209: aload_0
/*     */     //   210: putfield L$0 : Ljava/lang/Object;
/*     */     //   213: aload #9
/*     */     //   215: aload_1
/*     */     //   216: putfield L$1 : Ljava/lang/Object;
/*     */     //   219: aload #9
/*     */     //   221: aload_2
/*     */     //   222: putfield L$2 : Ljava/lang/Object;
/*     */     //   225: aload #9
/*     */     //   227: aload #4
/*     */     //   229: putfield L$3 : Ljava/lang/Object;
/*     */     //   232: aload #9
/*     */     //   234: aload #5
/*     */     //   236: putfield L$4 : Ljava/lang/Object;
/*     */     //   239: aload #9
/*     */     //   241: iconst_2
/*     */     //   242: putfield label : I
/*     */     //   245: invokestatic buildPatchForChanges$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   248: dup
/*     */     //   249: aload #10
/*     */     //   251: if_acmpne -> 311
/*     */     //   254: aload #10
/*     */     //   256: areturn
/*     */     //   257: aload #9
/*     */     //   259: getfield L$4 : Ljava/lang/Object;
/*     */     //   262: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker$ResultContent
/*     */     //   265: astore #5
/*     */     //   267: aload #9
/*     */     //   269: getfield L$3 : Ljava/lang/Object;
/*     */     //   272: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   275: astore #4
/*     */     //   277: aload #9
/*     */     //   279: getfield L$2 : Ljava/lang/Object;
/*     */     //   282: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentState
/*     */     //   285: astore_2
/*     */     //   286: aload #9
/*     */     //   288: getfield L$1 : Ljava/lang/Object;
/*     */     //   291: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   294: astore_1
/*     */     //   295: aload #9
/*     */     //   297: getfield L$0 : Ljava/lang/Object;
/*     */     //   300: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker
/*     */     //   303: astore_0
/*     */     //   304: aload #8
/*     */     //   306: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   309: aload #8
/*     */     //   311: checkcast java/lang/String
/*     */     //   314: astore #6
/*     */     //   316: new com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult
/*     */     //   319: dup
/*     */     //   320: aload #5
/*     */     //   322: invokevirtual getTitle : ()Ljava/lang/String;
/*     */     //   325: aload #5
/*     */     //   327: invokevirtual getOutput : ()Ljava/lang/String;
/*     */     //   330: aload_0
/*     */     //   331: invokevirtual getStepResultType : ()Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*     */     //   334: aload_2
/*     */     //   335: aload #6
/*     */     //   337: aload #4
/*     */     //   339: invokeinterface getSessionHistory : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */     //   344: invokevirtual snapshot : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;
/*     */     //   347: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;)V
/*     */     //   350: astore #7
/*     */     //   352: aload_1
/*     */     //   353: new com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResultCreatedEvent
/*     */     //   356: dup
/*     */     //   357: aload #7
/*     */     //   359: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;)V
/*     */     //   362: checkcast com/intellij/ml/llm/matterhorn/CustomArtifactEvent
/*     */     //   365: invokevirtual sendEvent : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)V
/*     */     //   368: aload #7
/*     */     //   370: areturn
/*     */     //   371: new java/lang/IllegalStateException
/*     */     //   374: dup
/*     */     //   375: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   378: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   381: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #231	-> 60
/*     */     //   #235	-> 97
/*     */     //   #237	-> 103
/*     */     //   #231	-> 148
/*     */     //   #238	-> 200
/*     */     //   #231	-> 254
/*     */     //   #240	-> 316
/*     */     //   #241	-> 320
/*     */     //   #242	-> 325
/*     */     //   #243	-> 330
/*     */     //   #244	-> 334
/*     */     //   #245	-> 335
/*     */     //   #246	-> 337
/*     */     //   #240	-> 347
/*     */     //   #248	-> 352
/*     */     //   #249	-> 368
/*     */     //   #231	-> 371
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	54	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker;
/*     */     //   188	69	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker;
/*     */     //   304	67	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker;
/*     */     //   97	54	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   179	78	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   295	76	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   97	54	2	state	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   170	87	2	state	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   286	85	2	state	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   103	48	4	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   161	96	4	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   277	94	4	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   200	57	5	result	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker$ResultContent;
/*     */     //   267	104	5	result	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker$ResultContent;
/*     */     //   316	55	6	patchContent	Ljava/lang/String;
/*     */     //   352	19	7	taskResult	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;
/*     */     //   0	382	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	321	9	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	314	8	$result	Ljava/lang/Object;
/*     */   }
/*     */   protected int getNextStepNumber(int index, @NotNull ActionRequest action) {
/* 252 */     Intrinsics.checkNotNullParameter(action, "action"); return index + 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Object initEnvironment(AgentIssue input, AgentSessionHistorySnapshot sessionHistory, ExecutionContext context, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker$initEnvironment$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker$initEnvironment$1
/*     */     //   13: astore #12
/*     */     //   15: aload #12
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #12
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker$initEnvironment$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #12
/*     */     //   53: aload #12
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #11
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #13
/*     */     //   65: aload #12
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 389, 0 -> 96, 1 -> 247, 2 -> 368
/*     */     //   96: aload #11
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: aload_3
/*     */     //   102: getstatic com/intellij/ml/llm/matterhorn/ej/core/AgentContext.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/AgentContext$Companion;
/*     */     //   105: invokevirtual getKEY : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContextUserDataKey;
/*     */     //   108: invokevirtual lookupContext : (Lcom/intellij/ml/llm/matterhorn/ExecutionContextUserDataKey;)Lcom/intellij/ml/llm/matterhorn/CustomContext;
/*     */     //   111: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentContext
/*     */     //   114: dup
/*     */     //   115: ifnonnull -> 165
/*     */     //   118: pop
/*     */     //   119: new com/intellij/ml/llm/matterhorn/ej/core/AgentContext
/*     */     //   122: dup
/*     */     //   123: aload_1
/*     */     //   124: aload_3
/*     */     //   125: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   128: invokestatic guessProjectDir : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   131: dup
/*     */     //   132: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   135: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;Lcom/intellij/openapi/vfs/VirtualFile;)V
/*     */     //   138: astore #7
/*     */     //   140: aload #7
/*     */     //   142: astore #8
/*     */     //   144: iconst_0
/*     */     //   145: istore #9
/*     */     //   147: aload_3
/*     */     //   148: getstatic com/intellij/ml/llm/matterhorn/ej/core/AgentContext.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/AgentContext$Companion;
/*     */     //   151: invokevirtual getKEY : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContextUserDataKey;
/*     */     //   154: aload #8
/*     */     //   156: checkcast com/intellij/ml/llm/matterhorn/CustomContext
/*     */     //   159: invokevirtual registerContext : (Lcom/intellij/ml/llm/matterhorn/ExecutionContextUserDataKey;Lcom/intellij/ml/llm/matterhorn/CustomContext;)V
/*     */     //   162: nop
/*     */     //   163: aload #7
/*     */     //   165: astore #5
/*     */     //   167: aload_2
/*     */     //   168: ifnull -> 184
/*     */     //   171: aload #5
/*     */     //   173: new com/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory
/*     */     //   176: dup
/*     */     //   177: aload_2
/*     */     //   178: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;)V
/*     */     //   181: invokevirtual setSessionHistory : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;)V
/*     */     //   184: new com/intellij/ml/llm/matterhorn/ej/core/SimpleExecutionAgentContext
/*     */     //   187: dup
/*     */     //   188: aload #5
/*     */     //   190: aload_3
/*     */     //   191: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentContext;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)V
/*     */     //   194: astore #6
/*     */     //   196: aload #6
/*     */     //   198: invokevirtual getExecutionEnvironment : ()Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionEnvironment;
/*     */     //   201: astore #7
/*     */     //   203: aload #7
/*     */     //   205: aload #12
/*     */     //   207: aload #12
/*     */     //   209: aload_0
/*     */     //   210: putfield L$0 : Ljava/lang/Object;
/*     */     //   213: aload #12
/*     */     //   215: aload #5
/*     */     //   217: putfield L$1 : Ljava/lang/Object;
/*     */     //   220: aload #12
/*     */     //   222: aload #6
/*     */     //   224: putfield L$2 : Ljava/lang/Object;
/*     */     //   227: aload #12
/*     */     //   229: iconst_1
/*     */     //   230: putfield label : I
/*     */     //   233: invokeinterface getOrCreateSession : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   238: dup
/*     */     //   239: aload #13
/*     */     //   241: if_acmpne -> 283
/*     */     //   244: aload #13
/*     */     //   246: areturn
/*     */     //   247: aload #12
/*     */     //   249: getfield L$2 : Ljava/lang/Object;
/*     */     //   252: checkcast com/intellij/ml/llm/matterhorn/ej/core/SimpleExecutionAgentContext
/*     */     //   255: astore #6
/*     */     //   257: aload #12
/*     */     //   259: getfield L$1 : Ljava/lang/Object;
/*     */     //   262: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentContext
/*     */     //   265: astore #5
/*     */     //   267: aload #12
/*     */     //   269: getfield L$0 : Ljava/lang/Object;
/*     */     //   272: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker
/*     */     //   275: astore_0
/*     */     //   276: aload #11
/*     */     //   278: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   281: aload #11
/*     */     //   283: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*     */     //   286: aconst_null
/*     */     //   287: iconst_1
/*     */     //   288: aconst_null
/*     */     //   289: invokestatic unwrap$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/Result;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   292: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession
/*     */     //   295: astore #8
/*     */     //   297: aload #5
/*     */     //   299: invokevirtual getCurrentDir : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   302: invokevirtual toNioPath : ()Ljava/nio/file/Path;
/*     */     //   305: astore #10
/*     */     //   307: aload #10
/*     */     //   309: ldc_w 'toNioPath(...)'
/*     */     //   312: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   315: aload #10
/*     */     //   317: astore #9
/*     */     //   319: aload_0
/*     */     //   320: aload #8
/*     */     //   322: aload #9
/*     */     //   324: aload #6
/*     */     //   326: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   329: aload #12
/*     */     //   331: aload #12
/*     */     //   333: aload #6
/*     */     //   335: putfield L$0 : Ljava/lang/Object;
/*     */     //   338: aload #12
/*     */     //   340: aconst_null
/*     */     //   341: putfield L$1 : Ljava/lang/Object;
/*     */     //   344: aload #12
/*     */     //   346: aconst_null
/*     */     //   347: putfield L$2 : Ljava/lang/Object;
/*     */     //   350: aload #12
/*     */     //   352: iconst_2
/*     */     //   353: putfield label : I
/*     */     //   356: invokevirtual setupCommandExecutor : (Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;Ljava/nio/file/Path;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   359: dup
/*     */     //   360: aload #13
/*     */     //   362: if_acmpne -> 385
/*     */     //   365: aload #13
/*     */     //   367: areturn
/*     */     //   368: aload #12
/*     */     //   370: getfield L$0 : Ljava/lang/Object;
/*     */     //   373: checkcast com/intellij/ml/llm/matterhorn/ej/core/SimpleExecutionAgentContext
/*     */     //   376: astore #6
/*     */     //   378: aload #11
/*     */     //   380: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   383: aload #11
/*     */     //   385: pop
/*     */     //   386: aload #6
/*     */     //   388: areturn
/*     */     //   389: new java/lang/IllegalStateException
/*     */     //   392: dup
/*     */     //   393: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   396: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   399: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #254	-> 63
/*     */     //   #256	-> 101
/*     */     //   #257	-> 147
/*     */     //   #258	-> 162
/*     */     //   #256	-> 163
/*     */     //   #256	-> 165
/*     */     //   #255	-> 165
/*     */     //   #260	-> 167
/*     */     //   #261	-> 171
/*     */     //   #263	-> 184
/*     */     //   #264	-> 196
/*     */     //   #266	-> 203
/*     */     //   #254	-> 244
/*     */     //   #266	-> 283
/*     */     //   #267	-> 297
/*     */     //   #269	-> 319
/*     */     //   #254	-> 365
/*     */     //   #270	-> 385
/*     */     //   #254	-> 389
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	62	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker;
/*     */     //   163	2	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker;
/*     */     //   165	82	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker;
/*     */     //   276	83	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker;
/*     */     //   101	17	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;
/*     */     //   118	22	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;
/*     */     //   101	62	2	sessionHistory	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;
/*     */     //   163	2	2	sessionHistory	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;
/*     */     //   165	19	2	sessionHistory	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;
/*     */     //   101	62	3	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   163	2	3	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   165	31	3	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   167	80	5	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentContext;
/*     */     //   267	40	5	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentContext;
/*     */     //   196	51	6	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/SimpleExecutionAgentContext;
/*     */     //   257	111	6	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/SimpleExecutionAgentContext;
/*     */     //   378	11	6	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/SimpleExecutionAgentContext;
/*     */     //   203	35	7	executionEnvironment	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionEnvironment;
/*     */     //   144	19	8	it	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentContext;
/*     */     //   297	62	8	executionSession	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*     */     //   319	40	9	projectDir	Ljava/nio/file/Path;
/*     */     //   147	16	9	$i$a$-also-AbstractIssueAgentWorker$initEnvironment$agentContext$1	I
/*     */     //   0	400	4	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	336	12	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	329	11	$result	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void saveExitStatus(@NotNull AgentExitStatus status, @NotNull ExecutionContext context) {
/* 274 */     Intrinsics.checkNotNullParameter(status, "status"); Intrinsics.checkNotNullParameter(context, "context"); context.getRoot().getService().getCaches().saveSingle(CacheType.ExitStatus, status.toString());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   protected StepType getStepResultType() {
/* 287 */     return StepType.Report;
/*     */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\"\n\002\020\016\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker$Companion;", "", "<init>", "()V", "TERMINAL_ACTIONS", "", "", "getTERMINAL_ACTIONS", "()Ljava/util/Set;", "ej-core"})
/*     */   public static final class Companion { private Companion() {}
/*     */     @NotNull
/* 291 */     public final Set<String> getTERMINAL_ACTIONS() { return AbstractIssueAgentWorker.TERMINAL_ACTIONS; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private static final Set<String> TERMINAL_ACTIONS; static { String[] arrayOfString = new String[3]; arrayOfString[0] = "exit"; arrayOfString[1] = "submit"; arrayOfString[2] = "answer"; TERMINAL_ACTIONS = SetsKt.setOf((Object[])arrayOfString); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public abstract ArtifactType<AgentResponse> getSingleStepArtifactType();
/*     */   
/*     */   @Nullable
/*     */   public Object produceArtifact(@NotNull AgentIssue input, @NotNull ExecutionContext context, @NotNull Continuation<? super ArtifactResponse<TaskResult>> $completion) {
/*     */     return produceArtifact$suspendImpl(this, input, context, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected Object getResult(@NotNull ExecutionContext context, @NotNull AgentState state, @NotNull Continuation<? super ResultContent> $completion) {
/*     */     return getResult$suspendImpl(this, context, state, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected Object setupCommandExecutor(@NotNull ExecutionSession executor, @NotNull Path executionDir, @NotNull ExecutionAgentContext context, @NotNull Continuation<? super Unit> $completion) {
/*     */     return setupCommandExecutor$suspendImpl(this, executor, executionDir, context, $completion);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AbstractIssueAgentWorker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */