/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutor;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutorServiceKt;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactResponse;
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.TrajectoryElementAgent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.ActionRequest;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.ToolActionRequest;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.critique.CritiqueResponse;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatKt;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessage;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessageKind;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessagePart;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessageTextPart;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornMultiPartChatMessage;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornTool;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornUserChatMessageWithToolResults;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin._Assertions;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.serialization.json.JsonBuilder;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000¨\001\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\t\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\006\b&\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001B\007¢\006\004\b\004\020\005J\026\020\n\032\0020\0132\006\020\f\032\0020\rH@¢\006\002\020\016J\026\020\017\032\0020\0202\006\020\f\032\0020\rH@¢\006\002\020\016J>\020\021\032\0020\0222\006\020\023\032\0020\0242\006\020\025\032\0020\0072\f\020\026\032\b\022\004\022\0020\0300\0272\b\020\031\032\004\030\0010\0072\006\020\032\032\0020\007H@¢\006\002\020\033J$\020\034\032\b\022\004\022\0020\0030\0352\006\020\036\032\0020\0022\006\020\023\032\0020\024H@¢\006\002\020\037J$\020 \032\b\022\004\022\0020!0\0272\006\020\032\032\0020\0072\f\020\"\032\b\022\004\022\0020#0\027H\002J\"\020$\032\0020!2\b\020%\032\004\030\0010&2\006\020'\032\0020\0072\006\020(\032\0020\013H\002J$\020)\032\b\022\004\022\0020\0300\0272\006\020\023\032\0020*2\006\020+\032\0020\013H@¢\006\002\020,JN\020-\032\016\022\004\022\0020&\022\004\022\0020!0.2\006\020/\032\0020\0022\f\020\026\032\b\022\004\022\0020\0300\0272\f\0200\032\b\022\004\022\002010\0272\006\0202\032\0020*2\006\020\f\032\0020\rH@¢\006\002\0203J4\0204\032\b\022\004\022\002010\0272\006\0205\032\0020\0022\006\0206\032\0020\0072\006\020\023\032\0020\0242\006\0207\032\0020\013H@¢\006\002\0208J4\0209\032\0020!2\006\020\023\032\0020\0242\006\020:\032\0020;2\006\020/\032\0020\0022\f\020<\032\b\022\004\022\0020!0\027H@¢\006\002\020=J<\020>\032\0020?2\006\020\023\032\0020\0242\006\020:\032\0020;2\006\020/\032\0020\0022\f\020<\032\b\022\004\022\0020!0\0272\006\0207\032\0020\013H@¢\006\002\020@J(\020A\032\004\030\0010?2\006\020\023\032\0020\0242\006\0207\032\0020\0132\006\020:\032\0020;H@¢\006\002\020BJ\020\020C\032\0020\0072\006\020D\032\0020;H\002J\b\020E\032\0020FH\026J&\020G\032\0020\0072\006\020(\032\0020\0132\006\020\023\032\0020*2\006\020H\032\0020IH@¢\006\002\020JJ\020\020K\032\0020\0072\006\020L\032\0020\007H\024J\036\020M\032\0020\0072\006\020\036\032\0020\0022\006\020\023\032\0020\024H@¢\006\002\020\037J\034\020N\032\b\022\004\022\0020O0\0272\006\020\023\032\0020*H¦@¢\006\002\020PJ\034\020Q\032\b\022\004\022\0020O0\0272\006\020\023\032\0020*H¦@¢\006\002\020PJ\016\020R\032\0020\007H¦@¢\006\002\020SJ\030\020T\032\004\030\0010\0072\006\020\023\032\0020*H@¢\006\002\020PR\024\020\006\032\0020\007XD¢\006\b\n\000\032\004\b\b\020\t¨\006U"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentResponse;", "<init>", "()V", "agentName", "", "getAgentName", "()Ljava/lang/String;", "getAgentParameters", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "(Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrajectoryElementAgent", "Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;", "logHeadTrajectory", "", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "systemMessage", "tools", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornTool;", "demonstration", "issueDescription", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produceArtifact", "Lcom/intellij/ml/llm/matterhorn/ArtifactResponse;", "input", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createMessagesWithImages", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "images", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessagePart;", "getActionResultElement", "action", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "actionResult", "parameters", "getTools", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "params", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produceActionRequestWithReflection", "Lkotlin/Pair;", "currentState", "observationsProcessed", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;", "executionAgentContext", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Ljava/util/List;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processHistory", "state", "currentArtifactName", "agentParameters", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runCritic", "attempt", "", "optionsToRank", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;ILcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCritiqueResponse", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse;", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;ILcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCritiqueResponse", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "multiCommandWarning", "numCommands", "areBashCommandsAllowed", "", "getSystemMessage", "issue", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecommendedSteps", "createInitPlan", "getIssueDescriptionAndInstructions", "getAvailableActions", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHiddenActions", "getDemonstration", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGuidanceContext", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nAbstractIssueSingleStepAgentWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractIssueSingleStepAgentWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArtifactRequestExecutorService.kt\ncom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorServiceKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,820:1\n205#2:821\n774#3:822\n865#3,2:823\n1557#3:829\n1628#3,2:830\n1557#3:832\n1628#3,3:833\n1630#3:836\n3193#3,10:837\n1557#3:847\n1628#3,3:848\n1557#3:851\n1628#3,3:852\n1557#3:855\n1628#3,3:856\n1557#3:859\n1628#3,3:860\n2318#3,14:864\n774#3:879\n865#3,2:880\n774#3:882\n865#3,2:883\n117#4:825\n117#4:826\n117#4:827\n117#4:863\n117#4:878\n1#5:828\n*S KotlinDebug\n*F\n+ 1 AbstractIssueSingleStepAgentWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker\n*L\n195#1:821\n240#1:822\n240#1:823,2\n425#1:829\n425#1:830,2\n431#1:832\n431#1:833,3\n425#1:836\n450#1:837,10\n456#1:847\n456#1:848,3\n458#1:851\n458#1:852,3\n466#1:855\n466#1:856,3\n510#1:859\n510#1:860,3\n581#1:864,14\n680#1:879\n680#1:880,2\n729#1:882\n729#1:883,2\n245#1:825\n252#1:826\n327#1:827\n566#1:863\n596#1:878\n*E\n"})
/*     */ public abstract class AbstractIssueSingleStepAgentWorker
/*     */   implements ArtifactRequestExecutor<AgentState, AgentResponse>
/*     */ {
/*     */   @NotNull
/* 180 */   private final String agentName = "primary"; @NotNull public final String getAgentName() { return this.agentName; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Unit getTrajectoryElementAgent$lambda$0(JsonBuilder $this$Json) {
/* 192 */     Intrinsics.checkNotNullParameter($this$Json, "$this$Json"); $this$Json.setEncodeDefaults(true); return Unit.INSTANCE;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Object logHeadTrajectory(ExecutionContext context, String systemMessage, List tools, String demonstration, String issueDescription, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #6
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker$logHeadTrajectory$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #6
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker$logHeadTrajectory$1
/*     */     //   13: astore #11
/*     */     //   15: aload #11
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #11
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker$logHeadTrajectory$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #6
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #11
/*     */     //   53: aload #11
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #10
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #27
/*     */     //   65: aload #11
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 942, 0 -> 112, 1 -> 245, 2 -> 430, 3 -> 557, 4 -> 723, 5 -> 827, 6 -> 930
/*     */     //   112: aload #10
/*     */     //   114: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   117: nop
/*     */     //   118: aload_3
/*     */     //   119: invokeinterface isEmpty : ()Z
/*     */     //   124: ifeq -> 131
/*     */     //   127: aload_2
/*     */     //   128: goto -> 161
/*     */     //   131: aload_2
/*     */     //   132: aload_3
/*     */     //   133: checkcast java/lang/Iterable
/*     */     //   136: ldc '\\n\\n'
/*     */     //   138: checkcast java/lang/CharSequence
/*     */     //   141: aconst_null
/*     */     //   142: aconst_null
/*     */     //   143: iconst_0
/*     */     //   144: aconst_null
/*     */     //   145: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   150: bipush #30
/*     */     //   152: aconst_null
/*     */     //   153: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   156: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   161: astore #7
/*     */     //   163: aload_1
/*     */     //   164: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   167: invokevirtual getPropertyProvider : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   170: astore #8
/*     */     //   172: aload_1
/*     */     //   173: astore #9
/*     */     //   175: aload_0
/*     */     //   176: aload #8
/*     */     //   178: aload #11
/*     */     //   180: aload #11
/*     */     //   182: aload_0
/*     */     //   183: putfield L$0 : Ljava/lang/Object;
/*     */     //   186: aload #11
/*     */     //   188: aload_1
/*     */     //   189: putfield L$1 : Ljava/lang/Object;
/*     */     //   192: aload #11
/*     */     //   194: aload #4
/*     */     //   196: putfield L$2 : Ljava/lang/Object;
/*     */     //   199: aload #11
/*     */     //   201: aload #5
/*     */     //   203: putfield L$3 : Ljava/lang/Object;
/*     */     //   206: aload #11
/*     */     //   208: aload #7
/*     */     //   210: putfield L$4 : Ljava/lang/Object;
/*     */     //   213: aload #11
/*     */     //   215: aload #8
/*     */     //   217: putfield L$5 : Ljava/lang/Object;
/*     */     //   220: aload #11
/*     */     //   222: aload #9
/*     */     //   224: putfield L$6 : Ljava/lang/Object;
/*     */     //   227: aload #11
/*     */     //   229: iconst_1
/*     */     //   230: putfield label : I
/*     */     //   233: invokevirtual getTrajectoryElementAgent : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   236: dup
/*     */     //   237: aload #27
/*     */     //   239: if_acmpne -> 320
/*     */     //   242: aload #27
/*     */     //   244: areturn
/*     */     //   245: aload #11
/*     */     //   247: getfield L$6 : Ljava/lang/Object;
/*     */     //   250: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   253: astore #9
/*     */     //   255: aload #11
/*     */     //   257: getfield L$5 : Ljava/lang/Object;
/*     */     //   260: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   263: astore #8
/*     */     //   265: aload #11
/*     */     //   267: getfield L$4 : Ljava/lang/Object;
/*     */     //   270: checkcast java/lang/String
/*     */     //   273: astore #7
/*     */     //   275: aload #11
/*     */     //   277: getfield L$3 : Ljava/lang/Object;
/*     */     //   280: checkcast java/lang/String
/*     */     //   283: astore #5
/*     */     //   285: aload #11
/*     */     //   287: getfield L$2 : Ljava/lang/Object;
/*     */     //   290: checkcast java/lang/String
/*     */     //   293: astore #4
/*     */     //   295: aload #11
/*     */     //   297: getfield L$1 : Ljava/lang/Object;
/*     */     //   300: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   303: astore_1
/*     */     //   304: aload #11
/*     */     //   306: getfield L$0 : Ljava/lang/Object;
/*     */     //   309: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker
/*     */     //   312: astore_0
/*     */     //   313: aload #10
/*     */     //   315: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   318: aload #10
/*     */     //   320: aload #9
/*     */     //   322: swap
/*     */     //   323: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElementAgent
/*     */     //   326: aload #7
/*     */     //   328: ldc_w 'system'
/*     */     //   331: bipush #8
/*     */     //   333: aconst_null
/*     */     //   334: astore #12
/*     */     //   336: istore #13
/*     */     //   338: astore #14
/*     */     //   340: astore #15
/*     */     //   342: astore #16
/*     */     //   344: new com/intellij/ml/llm/matterhorn/UserTrajectoryElement
/*     */     //   347: dup
/*     */     //   348: aload #16
/*     */     //   350: aload #15
/*     */     //   352: aload #14
/*     */     //   354: iconst_0
/*     */     //   355: iload #13
/*     */     //   357: aload #12
/*     */     //   359: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   362: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElement
/*     */     //   365: aload #11
/*     */     //   367: aload #11
/*     */     //   369: aload_0
/*     */     //   370: putfield L$0 : Ljava/lang/Object;
/*     */     //   373: aload #11
/*     */     //   375: aload_1
/*     */     //   376: putfield L$1 : Ljava/lang/Object;
/*     */     //   379: aload #11
/*     */     //   381: aload #4
/*     */     //   383: putfield L$2 : Ljava/lang/Object;
/*     */     //   386: aload #11
/*     */     //   388: aload #5
/*     */     //   390: putfield L$3 : Ljava/lang/Object;
/*     */     //   393: aload #11
/*     */     //   395: aload #8
/*     */     //   397: putfield L$4 : Ljava/lang/Object;
/*     */     //   400: aload #11
/*     */     //   402: aconst_null
/*     */     //   403: putfield L$5 : Ljava/lang/Object;
/*     */     //   406: aload #11
/*     */     //   408: aconst_null
/*     */     //   409: putfield L$6 : Ljava/lang/Object;
/*     */     //   412: aload #11
/*     */     //   414: iconst_2
/*     */     //   415: putfield label : I
/*     */     //   418: invokevirtual logTrajectoryElement : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   421: dup
/*     */     //   422: aload #27
/*     */     //   424: if_acmpne -> 485
/*     */     //   427: aload #27
/*     */     //   429: areturn
/*     */     //   430: aload #11
/*     */     //   432: getfield L$4 : Ljava/lang/Object;
/*     */     //   435: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   438: astore #8
/*     */     //   440: aload #11
/*     */     //   442: getfield L$3 : Ljava/lang/Object;
/*     */     //   445: checkcast java/lang/String
/*     */     //   448: astore #5
/*     */     //   450: aload #11
/*     */     //   452: getfield L$2 : Ljava/lang/Object;
/*     */     //   455: checkcast java/lang/String
/*     */     //   458: astore #4
/*     */     //   460: aload #11
/*     */     //   462: getfield L$1 : Ljava/lang/Object;
/*     */     //   465: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   468: astore_1
/*     */     //   469: aload #11
/*     */     //   471: getfield L$0 : Ljava/lang/Object;
/*     */     //   474: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker
/*     */     //   477: astore_0
/*     */     //   478: aload #10
/*     */     //   480: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   483: aload #10
/*     */     //   485: pop
/*     */     //   486: aload #4
/*     */     //   488: ifnull -> 769
/*     */     //   491: aload_1
/*     */     //   492: astore #9
/*     */     //   494: aload_0
/*     */     //   495: aload #8
/*     */     //   497: aload #11
/*     */     //   499: aload #11
/*     */     //   501: aload_0
/*     */     //   502: putfield L$0 : Ljava/lang/Object;
/*     */     //   505: aload #11
/*     */     //   507: aload_1
/*     */     //   508: putfield L$1 : Ljava/lang/Object;
/*     */     //   511: aload #11
/*     */     //   513: aload #4
/*     */     //   515: putfield L$2 : Ljava/lang/Object;
/*     */     //   518: aload #11
/*     */     //   520: aload #5
/*     */     //   522: putfield L$3 : Ljava/lang/Object;
/*     */     //   525: aload #11
/*     */     //   527: aload #8
/*     */     //   529: putfield L$4 : Ljava/lang/Object;
/*     */     //   532: aload #11
/*     */     //   534: aload #9
/*     */     //   536: putfield L$5 : Ljava/lang/Object;
/*     */     //   539: aload #11
/*     */     //   541: iconst_3
/*     */     //   542: putfield label : I
/*     */     //   545: invokevirtual getTrajectoryElementAgent : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   548: dup
/*     */     //   549: aload #27
/*     */     //   551: if_acmpne -> 622
/*     */     //   554: aload #27
/*     */     //   556: areturn
/*     */     //   557: aload #11
/*     */     //   559: getfield L$5 : Ljava/lang/Object;
/*     */     //   562: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   565: astore #9
/*     */     //   567: aload #11
/*     */     //   569: getfield L$4 : Ljava/lang/Object;
/*     */     //   572: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   575: astore #8
/*     */     //   577: aload #11
/*     */     //   579: getfield L$3 : Ljava/lang/Object;
/*     */     //   582: checkcast java/lang/String
/*     */     //   585: astore #5
/*     */     //   587: aload #11
/*     */     //   589: getfield L$2 : Ljava/lang/Object;
/*     */     //   592: checkcast java/lang/String
/*     */     //   595: astore #4
/*     */     //   597: aload #11
/*     */     //   599: getfield L$1 : Ljava/lang/Object;
/*     */     //   602: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   605: astore_1
/*     */     //   606: aload #11
/*     */     //   608: getfield L$0 : Ljava/lang/Object;
/*     */     //   611: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker
/*     */     //   614: astore_0
/*     */     //   615: aload #10
/*     */     //   617: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   620: aload #10
/*     */     //   622: aload #9
/*     */     //   624: swap
/*     */     //   625: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElementAgent
/*     */     //   628: aload #4
/*     */     //   630: aconst_null
/*     */     //   631: nop
/*     */     //   632: iconst_4
/*     */     //   633: aconst_null
/*     */     //   634: astore #17
/*     */     //   636: istore #18
/*     */     //   638: astore #19
/*     */     //   640: astore #20
/*     */     //   642: astore #21
/*     */     //   644: new com/intellij/ml/llm/matterhorn/UserTrajectoryElement
/*     */     //   647: dup
/*     */     //   648: aload #21
/*     */     //   650: aload #20
/*     */     //   652: aload #19
/*     */     //   654: iconst_1
/*     */     //   655: iload #18
/*     */     //   657: aload #17
/*     */     //   659: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   662: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElement
/*     */     //   665: aload #11
/*     */     //   667: aload #11
/*     */     //   669: aload_0
/*     */     //   670: putfield L$0 : Ljava/lang/Object;
/*     */     //   673: aload #11
/*     */     //   675: aload_1
/*     */     //   676: putfield L$1 : Ljava/lang/Object;
/*     */     //   679: aload #11
/*     */     //   681: aload #5
/*     */     //   683: putfield L$2 : Ljava/lang/Object;
/*     */     //   686: aload #11
/*     */     //   688: aload #8
/*     */     //   690: putfield L$3 : Ljava/lang/Object;
/*     */     //   693: aload #11
/*     */     //   695: aconst_null
/*     */     //   696: putfield L$4 : Ljava/lang/Object;
/*     */     //   699: aload #11
/*     */     //   701: aconst_null
/*     */     //   702: putfield L$5 : Ljava/lang/Object;
/*     */     //   705: aload #11
/*     */     //   707: iconst_4
/*     */     //   708: putfield label : I
/*     */     //   711: invokevirtual logTrajectoryElement : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   714: dup
/*     */     //   715: aload #27
/*     */     //   717: if_acmpne -> 768
/*     */     //   720: aload #27
/*     */     //   722: areturn
/*     */     //   723: aload #11
/*     */     //   725: getfield L$3 : Ljava/lang/Object;
/*     */     //   728: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   731: astore #8
/*     */     //   733: aload #11
/*     */     //   735: getfield L$2 : Ljava/lang/Object;
/*     */     //   738: checkcast java/lang/String
/*     */     //   741: astore #5
/*     */     //   743: aload #11
/*     */     //   745: getfield L$1 : Ljava/lang/Object;
/*     */     //   748: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   751: astore_1
/*     */     //   752: aload #11
/*     */     //   754: getfield L$0 : Ljava/lang/Object;
/*     */     //   757: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker
/*     */     //   760: astore_0
/*     */     //   761: aload #10
/*     */     //   763: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   766: aload #10
/*     */     //   768: pop
/*     */     //   769: aload_1
/*     */     //   770: astore #9
/*     */     //   772: aload_0
/*     */     //   773: aload #8
/*     */     //   775: aload #11
/*     */     //   777: aload #11
/*     */     //   779: aload #5
/*     */     //   781: putfield L$0 : Ljava/lang/Object;
/*     */     //   784: aload #11
/*     */     //   786: aload #9
/*     */     //   788: putfield L$1 : Ljava/lang/Object;
/*     */     //   791: aload #11
/*     */     //   793: aconst_null
/*     */     //   794: putfield L$2 : Ljava/lang/Object;
/*     */     //   797: aload #11
/*     */     //   799: aconst_null
/*     */     //   800: putfield L$3 : Ljava/lang/Object;
/*     */     //   803: aload #11
/*     */     //   805: aconst_null
/*     */     //   806: putfield L$4 : Ljava/lang/Object;
/*     */     //   809: aload #11
/*     */     //   811: iconst_5
/*     */     //   812: putfield label : I
/*     */     //   815: invokevirtual getTrajectoryElementAgent : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   818: dup
/*     */     //   819: aload #27
/*     */     //   821: if_acmpne -> 854
/*     */     //   824: aload #27
/*     */     //   826: areturn
/*     */     //   827: aload #11
/*     */     //   829: getfield L$1 : Ljava/lang/Object;
/*     */     //   832: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   835: astore #9
/*     */     //   837: aload #11
/*     */     //   839: getfield L$0 : Ljava/lang/Object;
/*     */     //   842: checkcast java/lang/String
/*     */     //   845: astore #5
/*     */     //   847: aload #10
/*     */     //   849: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   852: aload #10
/*     */     //   854: aload #9
/*     */     //   856: swap
/*     */     //   857: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElementAgent
/*     */     //   860: aload #5
/*     */     //   862: aconst_null
/*     */     //   863: bipush #12
/*     */     //   865: aconst_null
/*     */     //   866: astore #22
/*     */     //   868: istore #23
/*     */     //   870: astore #24
/*     */     //   872: astore #25
/*     */     //   874: astore #26
/*     */     //   876: new com/intellij/ml/llm/matterhorn/UserTrajectoryElement
/*     */     //   879: dup
/*     */     //   880: aload #26
/*     */     //   882: aload #25
/*     */     //   884: aload #24
/*     */     //   886: iconst_0
/*     */     //   887: iload #23
/*     */     //   889: aload #22
/*     */     //   891: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   894: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElement
/*     */     //   897: aload #11
/*     */     //   899: aload #11
/*     */     //   901: aconst_null
/*     */     //   902: putfield L$0 : Ljava/lang/Object;
/*     */     //   905: aload #11
/*     */     //   907: aconst_null
/*     */     //   908: putfield L$1 : Ljava/lang/Object;
/*     */     //   911: aload #11
/*     */     //   913: bipush #6
/*     */     //   915: putfield label : I
/*     */     //   918: invokevirtual logTrajectoryElement : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   921: dup
/*     */     //   922: aload #27
/*     */     //   924: if_acmpne -> 937
/*     */     //   927: aload #27
/*     */     //   929: areturn
/*     */     //   930: aload #10
/*     */     //   932: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   935: aload #10
/*     */     //   937: pop
/*     */     //   938: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   941: areturn
/*     */     //   942: new java/lang/IllegalStateException
/*     */     //   945: dup
/*     */     //   946: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   948: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   951: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #199	-> 63
/*     */     //   #206	-> 117
/*     */     //   #207	-> 118
/*     */     //   #208	-> 131
/*     */     //   #206	-> 161
/*     */     //   #210	-> 163
/*     */     //   #211	-> 172
/*     */     //   #212	-> 173
/*     */     //   #213	-> 175
/*     */     //   #199	-> 242
/*     */     //   #214	-> 326
/*     */     //   #215	-> 328
/*     */     //   #212	-> 331
/*     */     //   #211	-> 367
/*     */     //   #199	-> 427
/*     */     //   #218	-> 485
/*     */     //   #219	-> 491
/*     */     //   #220	-> 492
/*     */     //   #221	-> 494
/*     */     //   #199	-> 554
/*     */     //   #222	-> 628
/*     */     //   #220	-> 630
/*     */     //   #223	-> 631
/*     */     //   #220	-> 632
/*     */     //   #219	-> 667
/*     */     //   #199	-> 720
/*     */     //   #226	-> 768
/*     */     //   #199	-> 824
/*     */     //   #226	-> 854
/*     */     //   #199	-> 927
/*     */     //   #227	-> 937
/*     */     //   #199	-> 942
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   117	128	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   313	117	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   478	79	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   615	108	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   761	57	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   117	128	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   304	126	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   469	88	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   606	117	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   752	66	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   117	14	2	systemMessage	Ljava/lang/String;
/*     */     //   131	30	2	systemMessage	Ljava/lang/String;
/*     */     //   117	14	3	tools	Ljava/util/List;
/*     */     //   131	30	3	tools	Ljava/util/List;
/*     */     //   117	128	4	demonstration	Ljava/lang/String;
/*     */     //   295	135	4	demonstration	Ljava/lang/String;
/*     */     //   460	97	4	demonstration	Ljava/lang/String;
/*     */     //   597	33	4	demonstration	Ljava/lang/String;
/*     */     //   117	128	5	issueDescription	Ljava/lang/String;
/*     */     //   285	145	5	issueDescription	Ljava/lang/String;
/*     */     //   450	107	5	issueDescription	Ljava/lang/String;
/*     */     //   587	136	5	issueDescription	Ljava/lang/String;
/*     */     //   743	84	5	issueDescription	Ljava/lang/String;
/*     */     //   847	39	5	issueDescription	Ljava/lang/String;
/*     */     //   163	82	7	systemLogMessage	Ljava/lang/String;
/*     */     //   275	53	7	systemLogMessage	Ljava/lang/String;
/*     */     //   172	73	8	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   265	165	8	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   440	117	8	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   577	146	8	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   733	85	8	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   0	952	6	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	889	11	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	882	10	$result	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final CharSequence logHeadTrajectory$lambda$1(MatterhornTool it) {
/* 208 */     Intrinsics.checkNotNullParameter(it, "it"); return it.toString();
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
/*     */   @DebugMetadata(f = "AbstractIssueSingleStepAgentWorker.kt", l = {357, 357, 354}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueSingleStepAgentWorker$produceArtifact$agentActionExecutionResult$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\016\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""})
/*     */   static final class AbstractIssueSingleStepAgentWorker$produceArtifact$agentActionExecutionResult$1
/*     */     extends SuspendLambda
/*     */     implements Function1<Continuation<? super String>, Object>
/*     */   {
/*     */     Object L$0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     Object L$1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     Object L$2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     Object L$3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     int label;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     AbstractIssueSingleStepAgentWorker$produceArtifact$agentActionExecutionResult$1(ExecutionAgentContext $executionAgentContext, AbstractIssueSingleStepAgentWorker $receiver, AgentParameters $parameters, Continuation $completion) {
/*     */       super(1, $completion);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #7
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 318, 0 -> 40, 1 -> 104, 2 -> 202, 3 -> 312
/*     */       //   40: aload_1
/*     */       //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   44: getstatic com/intellij/ml/llm/matterhorn/ej/core/AgentAction.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion;
/*     */       //   47: aload_0
/*     */       //   48: getfield $actionToExecute : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */       //   51: aload_0
/*     */       //   52: getfield $executionAgentContext : Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */       //   55: astore #4
/*     */       //   57: astore_3
/*     */       //   58: astore_2
/*     */       //   59: aload_0
/*     */       //   60: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */       //   63: aload_0
/*     */       //   64: getfield $executionAgentContext : Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */       //   67: aload_0
/*     */       //   68: checkcast kotlin/coroutines/Continuation
/*     */       //   71: aload_0
/*     */       //   72: aload_2
/*     */       //   73: putfield L$0 : Ljava/lang/Object;
/*     */       //   76: aload_0
/*     */       //   77: aload_3
/*     */       //   78: putfield L$1 : Ljava/lang/Object;
/*     */       //   81: aload_0
/*     */       //   82: aload #4
/*     */       //   84: putfield L$2 : Ljava/lang/Object;
/*     */       //   87: aload_0
/*     */       //   88: iconst_1
/*     */       //   89: putfield label : I
/*     */       //   92: invokevirtual getAvailableActions : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   95: dup
/*     */       //   96: aload #7
/*     */       //   98: if_acmpne -> 134
/*     */       //   101: aload #7
/*     */       //   103: areturn
/*     */       //   104: aload_0
/*     */       //   105: getfield L$2 : Ljava/lang/Object;
/*     */       //   108: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */       //   111: astore #4
/*     */       //   113: aload_0
/*     */       //   114: getfield L$1 : Ljava/lang/Object;
/*     */       //   117: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*     */       //   120: astore_3
/*     */       //   121: aload_0
/*     */       //   122: getfield L$0 : Ljava/lang/Object;
/*     */       //   125: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion
/*     */       //   128: astore_2
/*     */       //   129: aload_1
/*     */       //   130: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   133: aload_1
/*     */       //   134: astore #5
/*     */       //   136: aload_2
/*     */       //   137: aload_3
/*     */       //   138: aload #4
/*     */       //   140: aload #5
/*     */       //   142: checkcast java/util/Collection
/*     */       //   145: astore #5
/*     */       //   147: astore #4
/*     */       //   149: astore_3
/*     */       //   150: astore_2
/*     */       //   151: aload_0
/*     */       //   152: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */       //   155: aload_0
/*     */       //   156: getfield $executionAgentContext : Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */       //   159: aload_0
/*     */       //   160: checkcast kotlin/coroutines/Continuation
/*     */       //   163: aload_0
/*     */       //   164: aload_2
/*     */       //   165: putfield L$0 : Ljava/lang/Object;
/*     */       //   168: aload_0
/*     */       //   169: aload_3
/*     */       //   170: putfield L$1 : Ljava/lang/Object;
/*     */       //   173: aload_0
/*     */       //   174: aload #4
/*     */       //   176: putfield L$2 : Ljava/lang/Object;
/*     */       //   179: aload_0
/*     */       //   180: aload #5
/*     */       //   182: putfield L$3 : Ljava/lang/Object;
/*     */       //   185: aload_0
/*     */       //   186: iconst_2
/*     */       //   187: putfield label : I
/*     */       //   190: invokevirtual getHiddenActions : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   193: dup
/*     */       //   194: aload #7
/*     */       //   196: if_acmpne -> 241
/*     */       //   199: aload #7
/*     */       //   201: areturn
/*     */       //   202: aload_0
/*     */       //   203: getfield L$3 : Ljava/lang/Object;
/*     */       //   206: checkcast java/util/Collection
/*     */       //   209: astore #5
/*     */       //   211: aload_0
/*     */       //   212: getfield L$2 : Ljava/lang/Object;
/*     */       //   215: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */       //   218: astore #4
/*     */       //   220: aload_0
/*     */       //   221: getfield L$1 : Ljava/lang/Object;
/*     */       //   224: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*     */       //   227: astore_3
/*     */       //   228: aload_0
/*     */       //   229: getfield L$0 : Ljava/lang/Object;
/*     */       //   232: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion
/*     */       //   235: astore_2
/*     */       //   236: aload_1
/*     */       //   237: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   240: aload_1
/*     */       //   241: astore #6
/*     */       //   243: aload_2
/*     */       //   244: aload_3
/*     */       //   245: aload #4
/*     */       //   247: aload #5
/*     */       //   249: aload #6
/*     */       //   251: checkcast java/lang/Iterable
/*     */       //   254: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*     */       //   257: aload_0
/*     */       //   258: getfield $parameters : Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */       //   261: invokevirtual getMaxCommandOutputLineLength : ()Ljava/lang/Integer;
/*     */       //   264: aload_0
/*     */       //   265: getfield $parameters : Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */       //   268: invokevirtual getMaxCommandOutputLines : ()Ljava/lang/Integer;
/*     */       //   271: aload_0
/*     */       //   272: checkcast kotlin/coroutines/Continuation
/*     */       //   275: aload_0
/*     */       //   276: aconst_null
/*     */       //   277: putfield L$0 : Ljava/lang/Object;
/*     */       //   280: aload_0
/*     */       //   281: aconst_null
/*     */       //   282: putfield L$1 : Ljava/lang/Object;
/*     */       //   285: aload_0
/*     */       //   286: aconst_null
/*     */       //   287: putfield L$2 : Ljava/lang/Object;
/*     */       //   290: aload_0
/*     */       //   291: aconst_null
/*     */       //   292: putfield L$3 : Ljava/lang/Object;
/*     */       //   295: aload_0
/*     */       //   296: iconst_3
/*     */       //   297: putfield label : I
/*     */       //   300: invokevirtual executeActionRequest : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   303: dup
/*     */       //   304: aload #7
/*     */       //   306: if_acmpne -> 317
/*     */       //   309: aload #7
/*     */       //   311: areturn
/*     */       //   312: aload_1
/*     */       //   313: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   316: aload_1
/*     */       //   317: areturn
/*     */       //   318: new java/lang/IllegalStateException
/*     */       //   321: dup
/*     */       //   322: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   324: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   327: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #353	-> 3
/*     */       //   #354	-> 44
/*     */       //   #355	-> 47
/*     */       //   #356	-> 51
/*     */       //   #357	-> 59
/*     */       //   #353	-> 101
/*     */       //   #357	-> 134
/*     */       //   #353	-> 199
/*     */       //   #357	-> 241
/*     */       //   #358	-> 257
/*     */       //   #359	-> 264
/*     */       //   #354	-> 275
/*     */       //   #353	-> 309
/*     */       //   #360	-> 317
/*     */       //   #353	-> 318
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	328	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker$produceArtifact$agentActionExecutionResult$1;
/*     */       //   44	274	1	$result	Ljava/lang/Object;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final Continuation<Unit> create(Continuation<? super AbstractIssueSingleStepAgentWorker$produceArtifact$agentActionExecutionResult$1> $completion) {
/*     */       return (Continuation<Unit>)new AbstractIssueSingleStepAgentWorker$produceArtifact$agentActionExecutionResult$1(this.$executionAgentContext, AbstractIssueSingleStepAgentWorker.this, this.$parameters, $completion);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final Object invoke(Continuation<?> p1) {
/*     */       return ((AbstractIssueSingleStepAgentWorker$produceArtifact$agentActionExecutionResult$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*     */     }
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
/*     */   @DebugMetadata(f = "AbstractIssueSingleStepAgentWorker.kt", l = {379}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueSingleStepAgentWorker$produceArtifact$3")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class AbstractIssueSingleStepAgentWorker$produceArtifact$3
/*     */     extends SuspendLambda
/*     */     implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */   {
/*     */     int label;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     AbstractIssueSingleStepAgentWorker$produceArtifact$3(AgentResponse $response, ExecutionContext $context, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore_3
/*     */       //   4: aload_0
/*     */       //   5: getfield label : I
/*     */       //   8: tableswitch default -> 104, 0 -> 32, 1 -> 66
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: getstatic com/intellij/ml/llm/matterhorn/ej/core/summarization/StepSummarizer.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/summarization/StepSummarizer;
/*     */       //   39: aload_0
/*     */       //   40: getfield $response : Lcom/intellij/ml/llm/matterhorn/ej/core/AgentResponse;
/*     */       //   43: aload_0
/*     */       //   44: getfield $context : Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */       //   47: aload_0
/*     */       //   48: checkcast kotlin/coroutines/Continuation
/*     */       //   51: aload_0
/*     */       //   52: iconst_1
/*     */       //   53: putfield label : I
/*     */       //   56: invokevirtual createStepSummary : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentResponse;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   59: dup
/*     */       //   60: aload_3
/*     */       //   61: if_acmpne -> 71
/*     */       //   64: aload_3
/*     */       //   65: areturn
/*     */       //   66: aload_1
/*     */       //   67: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   70: aload_1
/*     */       //   71: checkcast java/lang/String
/*     */       //   74: astore_2
/*     */       //   75: aload_0
/*     */       //   76: getfield $context : Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */       //   79: new com/intellij/ml/llm/matterhorn/ej/core/StepSummaryCreatedEvent
/*     */       //   82: dup
/*     */       //   83: aload_2
/*     */       //   84: aload_0
/*     */       //   85: getfield $context : Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */       //   88: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */       //   91: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ArtifactId;)V
/*     */       //   94: checkcast com/intellij/ml/llm/matterhorn/CustomArtifactEvent
/*     */       //   97: invokevirtual sendEvent : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)V
/*     */       //   100: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   103: areturn
/*     */       //   104: new java/lang/IllegalStateException
/*     */       //   107: dup
/*     */       //   108: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   110: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   113: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #378	-> 3
/*     */       //   #379	-> 36
/*     */       //   #378	-> 64
/*     */       //   #380	-> 75
/*     */       //   #381	-> 79
/*     */       //   #382	-> 83
/*     */       //   #381	-> 91
/*     */       //   #380	-> 97
/*     */       //   #385	-> 100
/*     */       //   #378	-> 104
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   75	29	2	stepSummary	Ljava/lang/String;
/*     */       //   0	114	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker$produceArtifact$3;
/*     */       //   36	68	1	$result	Ljava/lang/Object;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super AbstractIssueSingleStepAgentWorker$produceArtifact$3> $completion) {
/*     */       return (Continuation<Unit>)new AbstractIssueSingleStepAgentWorker$produceArtifact$3(this.$response, this.$context, $completion);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((AbstractIssueSingleStepAgentWorker$produceArtifact$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
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
/*     */   private final List<MatterhornChatElement> createMessagesWithImages(String issueDescription, List images) {
/* 391 */     if (images.isEmpty()) {
/* 392 */       return CollectionsKt.listOf(MatterhornChatKt.toUserMessage(issueDescription));
/*     */     }
/* 394 */     List<MatterhornMultiPartChatMessage> result = new ArrayList();
/* 395 */     result.add(new MatterhornMultiPartChatMessage(CollectionsKt.plus(CollectionsKt.listOf(new MatterhornChatMessageTextPart(issueDescription)), CollectionsKt.first(images)), MatterhornChatMessageKind.User));
/*     */     
/* 397 */     for (MatterhornChatMessagePart image : CollectionsKt.drop(images, 1))
/* 398 */       result.add(new MatterhornMultiPartChatMessage(CollectionsKt.listOf(image), MatterhornChatMessageKind.User)); 
/* 399 */     return (List)result;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final MatterhornChatElement getActionResultElement(ActionRequest action, String actionResult, AgentParameters parameters) {
/* 408 */     boolean bool = action instanceof ToolActionRequest; if (_Assertions.ENABLED && !bool) { String str = "Assertion failed"; throw new AssertionError(str); }
/* 409 */      ToolActionRequest toolAction = (ToolActionRequest)action;
/* 410 */     String id = 
/* 411 */       ((((CharSequence)toolAction.getId()).length() == 0)) ? toolAction.getName() : 
/* 412 */       toolAction.getId();
/*     */     
/* 414 */     return (action == null) ? (MatterhornChatElement)new MatterhornChatMessage(actionResult, MatterhornChatMessageKind.User, null, null, 12, null) : ((parameters.getUseTools() == true) ? (MatterhornChatElement)new MatterhornUserChatMessageWithToolResults(
/* 415 */         id, 
/* 416 */         actionResult, 
/* 417 */         ArtifactRequestExecutorServiceKt.isErrorAction(actionResult)) : 
/*     */ 
/*     */ 
/*     */       
/* 421 */       (MatterhornChatElement)new MatterhornChatMessage(actionResult, MatterhornChatMessageKind.User, null, null, 12, null));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Object getTools(ExecutionAgentContext context, AgentParameters params, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker$getTools$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker$getTools$1
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
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker$getTools$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #28
/*     */     //   50: aload #28
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #27
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #36
/*     */     //   62: aload #28
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 479, 0 -> 88, 1 -> 123
/*     */     //   88: aload #27
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: nop
/*     */     //   94: aload_2
/*     */     //   95: invokevirtual getUseTools : ()Z
/*     */     //   98: ifeq -> 475
/*     */     //   101: aload_0
/*     */     //   102: aload_1
/*     */     //   103: aload #28
/*     */     //   105: aload #28
/*     */     //   107: iconst_1
/*     */     //   108: putfield label : I
/*     */     //   111: invokevirtual getAvailableActions : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   114: dup
/*     */     //   115: aload #36
/*     */     //   117: if_acmpne -> 130
/*     */     //   120: aload #36
/*     */     //   122: areturn
/*     */     //   123: aload #27
/*     */     //   125: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   128: aload #27
/*     */     //   130: checkcast java/lang/Iterable
/*     */     //   133: astore #4
/*     */     //   135: iconst_0
/*     */     //   136: istore #5
/*     */     //   138: aload #4
/*     */     //   140: astore #6
/*     */     //   142: new java/util/ArrayList
/*     */     //   145: dup
/*     */     //   146: aload #4
/*     */     //   148: bipush #10
/*     */     //   150: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   153: invokespecial <init> : (I)V
/*     */     //   156: checkcast java/util/Collection
/*     */     //   159: astore #7
/*     */     //   161: iconst_0
/*     */     //   162: istore #8
/*     */     //   164: aload #6
/*     */     //   166: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   171: astore #9
/*     */     //   173: aload #9
/*     */     //   175: invokeinterface hasNext : ()Z
/*     */     //   180: ifeq -> 466
/*     */     //   183: aload #9
/*     */     //   185: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   190: astore #10
/*     */     //   192: aload #7
/*     */     //   194: aload #10
/*     */     //   196: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentAction
/*     */     //   199: astore #11
/*     */     //   201: astore #26
/*     */     //   203: iconst_0
/*     */     //   204: istore #12
/*     */     //   206: aload #11
/*     */     //   208: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/tools/ToolAction
/*     */     //   211: ifeq -> 247
/*     */     //   214: new com/intellij/ml/llm/matterhorn/llm/MatterhornTool
/*     */     //   217: dup
/*     */     //   218: aload #11
/*     */     //   220: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   225: aload #11
/*     */     //   227: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/tools/ToolAction
/*     */     //   230: invokeinterface getType : ()Ljava/lang/String;
/*     */     //   235: aconst_null
/*     */     //   236: aconst_null
/*     */     //   237: aconst_null
/*     */     //   238: bipush #28
/*     */     //   240: aconst_null
/*     */     //   241: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   244: goto -> 453
/*     */     //   247: aload #11
/*     */     //   249: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   254: aconst_null
/*     */     //   255: aload #11
/*     */     //   257: invokeinterface getDocstring : ()Ljava/lang/String;
/*     */     //   262: aload #11
/*     */     //   264: invokeinterface getArguments : ()Ljava/util/List;
/*     */     //   269: checkcast java/lang/Iterable
/*     */     //   272: astore #13
/*     */     //   274: astore #14
/*     */     //   276: astore #15
/*     */     //   278: astore #16
/*     */     //   280: iconst_0
/*     */     //   281: istore #17
/*     */     //   283: aload #13
/*     */     //   285: astore #18
/*     */     //   287: new java/util/ArrayList
/*     */     //   290: dup
/*     */     //   291: aload #13
/*     */     //   293: bipush #10
/*     */     //   295: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   298: invokespecial <init> : (I)V
/*     */     //   301: checkcast java/util/Collection
/*     */     //   304: astore #19
/*     */     //   306: iconst_0
/*     */     //   307: istore #20
/*     */     //   309: aload #18
/*     */     //   311: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   316: astore #21
/*     */     //   318: aload #21
/*     */     //   320: invokeinterface hasNext : ()Z
/*     */     //   325: ifeq -> 398
/*     */     //   328: aload #21
/*     */     //   330: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   335: astore #22
/*     */     //   337: aload #19
/*     */     //   339: aload #22
/*     */     //   341: checkcast com/intellij/ml/llm/matterhorn/ej/core/Argument
/*     */     //   344: astore #23
/*     */     //   346: astore #24
/*     */     //   348: iconst_0
/*     */     //   349: istore #25
/*     */     //   351: new com/intellij/ml/llm/matterhorn/llm/MatterhornToolParam
/*     */     //   354: dup
/*     */     //   355: aload #23
/*     */     //   357: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   360: aload #23
/*     */     //   362: invokevirtual getType : ()Lcom/intellij/ml/llm/matterhorn/llm/ArgumentType;
/*     */     //   365: aload #23
/*     */     //   367: invokevirtual getDesc : ()Ljava/lang/String;
/*     */     //   370: aload #23
/*     */     //   372: invokevirtual getOptional : ()Z
/*     */     //   375: ifne -> 382
/*     */     //   378: iconst_1
/*     */     //   379: goto -> 383
/*     */     //   382: iconst_0
/*     */     //   383: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/ArgumentType;Ljava/lang/String;Z)V
/*     */     //   386: aload #24
/*     */     //   388: swap
/*     */     //   389: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   394: pop
/*     */     //   395: goto -> 318
/*     */     //   398: aload #19
/*     */     //   400: checkcast java/util/List
/*     */     //   403: nop
/*     */     //   404: astore #24
/*     */     //   406: aload #16
/*     */     //   408: aload #15
/*     */     //   410: aload #14
/*     */     //   412: aload #24
/*     */     //   414: aconst_null
/*     */     //   415: bipush #18
/*     */     //   417: aconst_null
/*     */     //   418: astore #29
/*     */     //   420: istore #30
/*     */     //   422: astore #31
/*     */     //   424: astore #32
/*     */     //   426: astore #33
/*     */     //   428: astore #34
/*     */     //   430: astore #35
/*     */     //   432: new com/intellij/ml/llm/matterhorn/llm/MatterhornTool
/*     */     //   435: dup
/*     */     //   436: aload #35
/*     */     //   438: aload #34
/*     */     //   440: aload #33
/*     */     //   442: aload #32
/*     */     //   444: aload #31
/*     */     //   446: iload #30
/*     */     //   448: aload #29
/*     */     //   450: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   453: nop
/*     */     //   454: aload #26
/*     */     //   456: swap
/*     */     //   457: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   462: pop
/*     */     //   463: goto -> 173
/*     */     //   466: aload #7
/*     */     //   468: checkcast java/util/List
/*     */     //   471: nop
/*     */     //   472: goto -> 478
/*     */     //   475: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   478: areturn
/*     */     //   479: new java/lang/IllegalStateException
/*     */     //   482: dup
/*     */     //   483: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   485: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   488: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #424	-> 60
/*     */     //   #424	-> 93
/*     */     //   #425	-> 94
/*     */     //   #424	-> 120
/*     */     //   #829	-> 138
/*     */     //   #830	-> 164
/*     */     //   #831	-> 192
/*     */     //   #426	-> 206
/*     */     //   #427	-> 208
/*     */     //   #428	-> 247
/*     */     //   #429	-> 247
/*     */     //   #428	-> 254
/*     */     //   #430	-> 255
/*     */     //   #431	-> 262
/*     */     //   #832	-> 283
/*     */     //   #833	-> 309
/*     */     //   #834	-> 337
/*     */     //   #431	-> 351
/*     */     //   #834	-> 389
/*     */     //   #835	-> 398
/*     */     //   #832	-> 403
/*     */     //   #428	-> 414
/*     */     //   #433	-> 453
/*     */     //   #831	-> 457
/*     */     //   #836	-> 466
/*     */     //   #829	-> 471
/*     */     //   #435	-> 475
/*     */     //   #436	-> 478
/*     */     //   #424	-> 479
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	21	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   93	21	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   93	21	2	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   135	26	4	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   161	12	6	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   161	307	7	destination$iv$iv	Ljava/util/Collection;
/*     */     //   192	11	10	item$iv$iv	Ljava/lang/Object;
/*     */     //   203	44	11	action	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;
/*     */     //   247	33	11	action	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;
/*     */     //   280	26	13	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   306	12	18	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   306	94	19	destination$iv$iv	Ljava/util/Collection;
/*     */     //   337	11	22	item$iv$iv	Ljava/lang/Object;
/*     */     //   348	34	23	it	Lcom/intellij/ml/llm/matterhorn/ej/core/Argument;
/*     */     //   351	35	25	$i$a$-map-AbstractIssueSingleStepAgentWorker$getTools$2$1	I
/*     */     //   309	91	20	$i$f$mapTo	I
/*     */     //   283	121	17	$i$f$map	I
/*     */     //   206	248	12	$i$a$-map-AbstractIssueSingleStepAgentWorker$getTools$2	I
/*     */     //   164	304	8	$i$f$mapTo	I
/*     */     //   138	334	5	$i$f$map	I
/*     */     //   0	489	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	429	28	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	422	27	$result	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Object produceActionRequestWithReflection(AgentState currentState, List tools, List observationsProcessed, ExecutionAgentContext executionAgentContext, MatterhornPropertyProvider propertyProvider, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #6
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker$produceActionRequestWithReflection$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #6
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker$produceActionRequestWithReflection$1
/*     */     //   13: astore #45
/*     */     //   15: aload #45
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #45
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker$produceActionRequestWithReflection$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #6
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #45
/*     */     //   53: aload #45
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #44
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #70
/*     */     //   65: aload #45
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 5601, 0 -> 148, 1 -> 249, 2 -> 1146, 3 -> 1380, 4 -> 1714, 5 -> 2020, 6 -> 2413, 7 -> 2721, 8 -> 3055, 9 -> 3370, 10 -> 3928, 11 -> 4408, 12 -> 4769, 13 -> 5031, 14 -> 5334, 15 -> 5548
/*     */     //   148: aload #44
/*     */     //   150: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   153: new java/util/ArrayList
/*     */     //   156: dup
/*     */     //   157: invokespecial <init> : ()V
/*     */     //   160: checkcast java/util/List
/*     */     //   163: astore #7
/*     */     //   165: new java/lang/Exception
/*     */     //   168: dup
/*     */     //   169: invokespecial <init> : ()V
/*     */     //   172: astore #8
/*     */     //   174: aload_0
/*     */     //   175: aload #5
/*     */     //   177: aload #45
/*     */     //   179: aload #45
/*     */     //   181: aload_0
/*     */     //   182: putfield L$0 : Ljava/lang/Object;
/*     */     //   185: aload #45
/*     */     //   187: aload_1
/*     */     //   188: putfield L$1 : Ljava/lang/Object;
/*     */     //   191: aload #45
/*     */     //   193: aload_2
/*     */     //   194: putfield L$2 : Ljava/lang/Object;
/*     */     //   197: aload #45
/*     */     //   199: aload_3
/*     */     //   200: putfield L$3 : Ljava/lang/Object;
/*     */     //   203: aload #45
/*     */     //   205: aload #4
/*     */     //   207: putfield L$4 : Ljava/lang/Object;
/*     */     //   210: aload #45
/*     */     //   212: aload #5
/*     */     //   214: putfield L$5 : Ljava/lang/Object;
/*     */     //   217: aload #45
/*     */     //   219: aload #7
/*     */     //   221: putfield L$6 : Ljava/lang/Object;
/*     */     //   224: aload #45
/*     */     //   226: aload #8
/*     */     //   228: putfield L$7 : Ljava/lang/Object;
/*     */     //   231: aload #45
/*     */     //   233: iconst_1
/*     */     //   234: putfield label : I
/*     */     //   237: invokevirtual getAgentParameters : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   240: dup
/*     */     //   241: aload #70
/*     */     //   243: if_acmpne -> 332
/*     */     //   246: aload #70
/*     */     //   248: areturn
/*     */     //   249: aload #45
/*     */     //   251: getfield L$7 : Ljava/lang/Object;
/*     */     //   254: checkcast java/lang/Exception
/*     */     //   257: astore #8
/*     */     //   259: aload #45
/*     */     //   261: getfield L$6 : Ljava/lang/Object;
/*     */     //   264: checkcast java/util/List
/*     */     //   267: astore #7
/*     */     //   269: aload #45
/*     */     //   271: getfield L$5 : Ljava/lang/Object;
/*     */     //   274: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   277: astore #5
/*     */     //   279: aload #45
/*     */     //   281: getfield L$4 : Ljava/lang/Object;
/*     */     //   284: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   287: astore #4
/*     */     //   289: aload #45
/*     */     //   291: getfield L$3 : Ljava/lang/Object;
/*     */     //   294: checkcast java/util/List
/*     */     //   297: astore_3
/*     */     //   298: aload #45
/*     */     //   300: getfield L$2 : Ljava/lang/Object;
/*     */     //   303: checkcast java/util/List
/*     */     //   306: astore_2
/*     */     //   307: aload #45
/*     */     //   309: getfield L$1 : Ljava/lang/Object;
/*     */     //   312: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentState
/*     */     //   315: astore_1
/*     */     //   316: aload #45
/*     */     //   318: getfield L$0 : Ljava/lang/Object;
/*     */     //   321: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker
/*     */     //   324: astore_0
/*     */     //   325: aload #44
/*     */     //   327: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   330: aload #44
/*     */     //   332: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*     */     //   335: astore #9
/*     */     //   337: aload_3
/*     */     //   338: checkcast java/lang/Iterable
/*     */     //   341: astore #11
/*     */     //   343: iconst_0
/*     */     //   344: istore #12
/*     */     //   346: new java/util/ArrayList
/*     */     //   349: dup
/*     */     //   350: invokespecial <init> : ()V
/*     */     //   353: astore #13
/*     */     //   355: new java/util/ArrayList
/*     */     //   358: dup
/*     */     //   359: invokespecial <init> : ()V
/*     */     //   362: astore #14
/*     */     //   364: aload #11
/*     */     //   366: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   371: astore #15
/*     */     //   373: aload #15
/*     */     //   375: invokeinterface hasNext : ()Z
/*     */     //   380: ifeq -> 462
/*     */     //   383: aload #15
/*     */     //   385: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   390: astore #16
/*     */     //   392: aload #16
/*     */     //   394: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   397: astore #17
/*     */     //   399: iconst_0
/*     */     //   400: istore #18
/*     */     //   402: aload #17
/*     */     //   404: invokevirtual getAction : ()Ljava/lang/String;
/*     */     //   407: ldc_w 'processed_issues'
/*     */     //   410: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   413: ifeq -> 436
/*     */     //   416: aload #17
/*     */     //   418: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   421: invokeinterface getKind : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   426: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.User : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   429: if_acmpne -> 436
/*     */     //   432: iconst_1
/*     */     //   433: goto -> 437
/*     */     //   436: iconst_0
/*     */     //   437: ifeq -> 451
/*     */     //   440: aload #13
/*     */     //   442: aload #16
/*     */     //   444: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   447: pop
/*     */     //   448: goto -> 373
/*     */     //   451: aload #14
/*     */     //   453: aload #16
/*     */     //   455: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   458: pop
/*     */     //   459: goto -> 373
/*     */     //   462: new kotlin/Pair
/*     */     //   465: dup
/*     */     //   466: aload #13
/*     */     //   468: aload #14
/*     */     //   470: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   473: astore #10
/*     */     //   475: aload #10
/*     */     //   477: invokevirtual component1 : ()Ljava/lang/Object;
/*     */     //   480: checkcast java/util/List
/*     */     //   483: astore #11
/*     */     //   485: aload #10
/*     */     //   487: invokevirtual component2 : ()Ljava/lang/Object;
/*     */     //   490: checkcast java/util/List
/*     */     //   493: astore #12
/*     */     //   495: iconst_0
/*     */     //   496: istore #13
/*     */     //   498: aload #9
/*     */     //   500: invokevirtual getNumReflections : ()I
/*     */     //   503: istore #14
/*     */     //   505: iload #13
/*     */     //   507: iload #14
/*     */     //   509: if_icmpge -> 5463
/*     */     //   512: aload #4
/*     */     //   514: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   519: new com/intellij/ml/llm/matterhorn/ej/core/ActionRequestBuildingStarted
/*     */     //   522: dup
/*     */     //   523: iload #13
/*     */     //   525: invokespecial <init> : (I)V
/*     */     //   528: checkcast com/intellij/ml/llm/matterhorn/CustomArtifactEvent
/*     */     //   531: invokevirtual sendEvent : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)V
/*     */     //   534: aload_1
/*     */     //   535: invokevirtual getIssue : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;
/*     */     //   538: invokevirtual getPreChatObservations : ()Ljava/util/List;
/*     */     //   541: checkcast java/lang/Iterable
/*     */     //   544: astore #16
/*     */     //   546: iconst_0
/*     */     //   547: istore #17
/*     */     //   549: aload #16
/*     */     //   551: astore #18
/*     */     //   553: new java/util/ArrayList
/*     */     //   556: dup
/*     */     //   557: aload #16
/*     */     //   559: bipush #10
/*     */     //   561: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   564: invokespecial <init> : (I)V
/*     */     //   567: checkcast java/util/Collection
/*     */     //   570: astore #19
/*     */     //   572: iconst_0
/*     */     //   573: istore #20
/*     */     //   575: aload #18
/*     */     //   577: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   582: astore #21
/*     */     //   584: aload #21
/*     */     //   586: invokeinterface hasNext : ()Z
/*     */     //   591: ifeq -> 637
/*     */     //   594: aload #21
/*     */     //   596: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   601: astore #22
/*     */     //   603: aload #19
/*     */     //   605: aload #22
/*     */     //   607: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   610: astore #23
/*     */     //   612: astore #35
/*     */     //   614: iconst_0
/*     */     //   615: istore #24
/*     */     //   617: aload #23
/*     */     //   619: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   622: astore #36
/*     */     //   624: aload #35
/*     */     //   626: aload #36
/*     */     //   628: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   633: pop
/*     */     //   634: goto -> 584
/*     */     //   637: aload #19
/*     */     //   639: checkcast java/util/List
/*     */     //   642: nop
/*     */     //   643: checkcast java/util/Collection
/*     */     //   646: aload_1
/*     */     //   647: invokevirtual getDemo : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   650: invokestatic listOfNotNull : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   653: checkcast java/lang/Iterable
/*     */     //   656: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   659: checkcast java/util/Collection
/*     */     //   662: aload #11
/*     */     //   664: checkcast java/lang/Iterable
/*     */     //   667: astore #16
/*     */     //   669: astore #35
/*     */     //   671: iconst_0
/*     */     //   672: istore #17
/*     */     //   674: aload #16
/*     */     //   676: astore #18
/*     */     //   678: new java/util/ArrayList
/*     */     //   681: dup
/*     */     //   682: aload #16
/*     */     //   684: bipush #10
/*     */     //   686: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   689: invokespecial <init> : (I)V
/*     */     //   692: checkcast java/util/Collection
/*     */     //   695: astore #19
/*     */     //   697: iconst_0
/*     */     //   698: istore #20
/*     */     //   700: aload #18
/*     */     //   702: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   707: astore #21
/*     */     //   709: aload #21
/*     */     //   711: invokeinterface hasNext : ()Z
/*     */     //   716: ifeq -> 762
/*     */     //   719: aload #21
/*     */     //   721: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   726: astore #22
/*     */     //   728: aload #19
/*     */     //   730: aload #22
/*     */     //   732: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   735: astore #23
/*     */     //   737: astore #36
/*     */     //   739: iconst_0
/*     */     //   740: istore #24
/*     */     //   742: aload #23
/*     */     //   744: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   747: astore #37
/*     */     //   749: aload #36
/*     */     //   751: aload #37
/*     */     //   753: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   758: pop
/*     */     //   759: goto -> 709
/*     */     //   762: aload #19
/*     */     //   764: checkcast java/util/List
/*     */     //   767: nop
/*     */     //   768: astore #36
/*     */     //   770: aload #35
/*     */     //   772: aload #36
/*     */     //   774: checkcast java/lang/Iterable
/*     */     //   777: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   780: checkcast java/util/Collection
/*     */     //   783: aload_1
/*     */     //   784: invokevirtual getIssueDescription : ()Ljava/util/List;
/*     */     //   787: checkcast java/lang/Iterable
/*     */     //   790: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   793: checkcast java/util/Collection
/*     */     //   796: iconst_5
/*     */     //   797: anewarray com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   800: astore #16
/*     */     //   802: aload #16
/*     */     //   804: iconst_0
/*     */     //   805: aload_1
/*     */     //   806: invokevirtual getGuidelines : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   809: aastore
/*     */     //   810: aload #16
/*     */     //   812: iconst_1
/*     */     //   813: aload_1
/*     */     //   814: invokevirtual getIdeInitialState : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   817: aastore
/*     */     //   818: aload #16
/*     */     //   820: iconst_2
/*     */     //   821: aload_1
/*     */     //   822: invokevirtual getExplicitlySelectedContextFiles : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   825: aastore
/*     */     //   826: aload #16
/*     */     //   828: iconst_3
/*     */     //   829: aload_1
/*     */     //   830: invokevirtual getRelevantSymbolsResponse : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   833: aastore
/*     */     //   834: aload #16
/*     */     //   836: iconst_4
/*     */     //   837: aload_1
/*     */     //   838: invokevirtual getProjectStr : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   841: aastore
/*     */     //   842: aload #16
/*     */     //   844: invokestatic listOfNotNull : ([Ljava/lang/Object;)Ljava/util/List;
/*     */     //   847: checkcast java/lang/Iterable
/*     */     //   850: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   853: checkcast java/util/Collection
/*     */     //   856: aload #12
/*     */     //   858: checkcast java/lang/Iterable
/*     */     //   861: astore #16
/*     */     //   863: astore #35
/*     */     //   865: iconst_0
/*     */     //   866: istore #17
/*     */     //   868: aload #16
/*     */     //   870: astore #18
/*     */     //   872: new java/util/ArrayList
/*     */     //   875: dup
/*     */     //   876: aload #16
/*     */     //   878: bipush #10
/*     */     //   880: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   883: invokespecial <init> : (I)V
/*     */     //   886: checkcast java/util/Collection
/*     */     //   889: astore #19
/*     */     //   891: iconst_0
/*     */     //   892: istore #20
/*     */     //   894: aload #18
/*     */     //   896: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   901: astore #21
/*     */     //   903: aload #21
/*     */     //   905: invokeinterface hasNext : ()Z
/*     */     //   910: ifeq -> 956
/*     */     //   913: aload #21
/*     */     //   915: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   920: astore #22
/*     */     //   922: aload #19
/*     */     //   924: aload #22
/*     */     //   926: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   929: astore #23
/*     */     //   931: astore #36
/*     */     //   933: iconst_0
/*     */     //   934: istore #24
/*     */     //   936: aload #23
/*     */     //   938: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   941: astore #37
/*     */     //   943: aload #36
/*     */     //   945: aload #37
/*     */     //   947: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   952: pop
/*     */     //   953: goto -> 903
/*     */     //   956: aload #19
/*     */     //   958: checkcast java/util/List
/*     */     //   961: nop
/*     */     //   962: astore #36
/*     */     //   964: aload #35
/*     */     //   966: aload #36
/*     */     //   968: checkcast java/lang/Iterable
/*     */     //   971: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   974: checkcast java/util/Collection
/*     */     //   977: aload #7
/*     */     //   979: checkcast java/lang/Iterable
/*     */     //   982: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   985: astore #15
/*     */     //   987: new com/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest
/*     */     //   990: dup
/*     */     //   991: aload_1
/*     */     //   992: invokevirtual getSystemMessage : ()Ljava/lang/String;
/*     */     //   995: dup
/*     */     //   996: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   999: aload #15
/*     */     //   1001: aload #9
/*     */     //   1003: invokevirtual getModelParameters : ()Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   1006: aload #9
/*     */     //   1008: invokevirtual getModelNumChoices : ()I
/*     */     //   1011: aload_2
/*     */     //   1012: new com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker$produceActionRequestWithReflection$request$1
/*     */     //   1015: dup
/*     */     //   1016: aload_0
/*     */     //   1017: iload #13
/*     */     //   1019: aload_1
/*     */     //   1020: aconst_null
/*     */     //   1021: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;ILcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Lkotlin/coroutines/Continuation;)V
/*     */     //   1024: checkcast kotlin/jvm/functions/Function3
/*     */     //   1027: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;ILjava/util/List;Lkotlin/jvm/functions/Function3;)V
/*     */     //   1030: astore #16
/*     */     //   1032: aload #4
/*     */     //   1034: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1039: astore #17
/*     */     //   1041: aload #16
/*     */     //   1043: aload #17
/*     */     //   1045: aload #45
/*     */     //   1047: aload #45
/*     */     //   1049: aload_0
/*     */     //   1050: putfield L$0 : Ljava/lang/Object;
/*     */     //   1053: aload #45
/*     */     //   1055: aload_1
/*     */     //   1056: putfield L$1 : Ljava/lang/Object;
/*     */     //   1059: aload #45
/*     */     //   1061: aload_2
/*     */     //   1062: putfield L$2 : Ljava/lang/Object;
/*     */     //   1065: aload #45
/*     */     //   1067: aload #4
/*     */     //   1069: putfield L$3 : Ljava/lang/Object;
/*     */     //   1072: aload #45
/*     */     //   1074: aload #5
/*     */     //   1076: putfield L$4 : Ljava/lang/Object;
/*     */     //   1079: aload #45
/*     */     //   1081: aload #7
/*     */     //   1083: putfield L$5 : Ljava/lang/Object;
/*     */     //   1086: aload #45
/*     */     //   1088: aload #9
/*     */     //   1090: putfield L$6 : Ljava/lang/Object;
/*     */     //   1093: aload #45
/*     */     //   1095: aload #11
/*     */     //   1097: putfield L$7 : Ljava/lang/Object;
/*     */     //   1100: aload #45
/*     */     //   1102: aload #12
/*     */     //   1104: putfield L$8 : Ljava/lang/Object;
/*     */     //   1107: aload #45
/*     */     //   1109: aload #17
/*     */     //   1111: putfield L$9 : Ljava/lang/Object;
/*     */     //   1114: aload #45
/*     */     //   1116: iload #13
/*     */     //   1118: putfield I$0 : I
/*     */     //   1121: aload #45
/*     */     //   1123: iload #14
/*     */     //   1125: putfield I$1 : I
/*     */     //   1128: aload #45
/*     */     //   1130: iconst_2
/*     */     //   1131: putfield label : I
/*     */     //   1134: invokevirtual execute : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1137: dup
/*     */     //   1138: aload #70
/*     */     //   1140: if_acmpne -> 1264
/*     */     //   1143: aload #70
/*     */     //   1145: areturn
/*     */     //   1146: aload #45
/*     */     //   1148: getfield I$1 : I
/*     */     //   1151: istore #14
/*     */     //   1153: aload #45
/*     */     //   1155: getfield I$0 : I
/*     */     //   1158: istore #13
/*     */     //   1160: aload #45
/*     */     //   1162: getfield L$9 : Ljava/lang/Object;
/*     */     //   1165: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   1168: astore #17
/*     */     //   1170: aload #45
/*     */     //   1172: getfield L$8 : Ljava/lang/Object;
/*     */     //   1175: checkcast java/util/List
/*     */     //   1178: astore #12
/*     */     //   1180: aload #45
/*     */     //   1182: getfield L$7 : Ljava/lang/Object;
/*     */     //   1185: checkcast java/util/List
/*     */     //   1188: astore #11
/*     */     //   1190: aload #45
/*     */     //   1192: getfield L$6 : Ljava/lang/Object;
/*     */     //   1195: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*     */     //   1198: astore #9
/*     */     //   1200: aload #45
/*     */     //   1202: getfield L$5 : Ljava/lang/Object;
/*     */     //   1205: checkcast java/util/List
/*     */     //   1208: astore #7
/*     */     //   1210: aload #45
/*     */     //   1212: getfield L$4 : Ljava/lang/Object;
/*     */     //   1215: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   1218: astore #5
/*     */     //   1220: aload #45
/*     */     //   1222: getfield L$3 : Ljava/lang/Object;
/*     */     //   1225: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   1228: astore #4
/*     */     //   1230: aload #45
/*     */     //   1232: getfield L$2 : Ljava/lang/Object;
/*     */     //   1235: checkcast java/util/List
/*     */     //   1238: astore_2
/*     */     //   1239: aload #45
/*     */     //   1241: getfield L$1 : Ljava/lang/Object;
/*     */     //   1244: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentState
/*     */     //   1247: astore_1
/*     */     //   1248: aload #45
/*     */     //   1250: getfield L$0 : Ljava/lang/Object;
/*     */     //   1253: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker
/*     */     //   1256: astore_0
/*     */     //   1257: aload #44
/*     */     //   1259: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1262: aload #44
/*     */     //   1264: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*     */     //   1267: astore #18
/*     */     //   1269: aload_0
/*     */     //   1270: aload #4
/*     */     //   1272: aload #45
/*     */     //   1274: aload #45
/*     */     //   1276: aload_0
/*     */     //   1277: putfield L$0 : Ljava/lang/Object;
/*     */     //   1280: aload #45
/*     */     //   1282: aload_1
/*     */     //   1283: putfield L$1 : Ljava/lang/Object;
/*     */     //   1286: aload #45
/*     */     //   1288: aload_2
/*     */     //   1289: putfield L$2 : Ljava/lang/Object;
/*     */     //   1292: aload #45
/*     */     //   1294: aload #4
/*     */     //   1296: putfield L$3 : Ljava/lang/Object;
/*     */     //   1299: aload #45
/*     */     //   1301: aload #5
/*     */     //   1303: putfield L$4 : Ljava/lang/Object;
/*     */     //   1306: aload #45
/*     */     //   1308: aload #7
/*     */     //   1310: putfield L$5 : Ljava/lang/Object;
/*     */     //   1313: aload #45
/*     */     //   1315: aload #9
/*     */     //   1317: putfield L$6 : Ljava/lang/Object;
/*     */     //   1320: aload #45
/*     */     //   1322: aload #11
/*     */     //   1324: putfield L$7 : Ljava/lang/Object;
/*     */     //   1327: aload #45
/*     */     //   1329: aload #12
/*     */     //   1331: putfield L$8 : Ljava/lang/Object;
/*     */     //   1334: aload #45
/*     */     //   1336: aload #17
/*     */     //   1338: putfield L$9 : Ljava/lang/Object;
/*     */     //   1341: aload #45
/*     */     //   1343: aload #18
/*     */     //   1345: putfield L$10 : Ljava/lang/Object;
/*     */     //   1348: aload #45
/*     */     //   1350: iload #13
/*     */     //   1352: putfield I$0 : I
/*     */     //   1355: aload #45
/*     */     //   1357: iload #14
/*     */     //   1359: putfield I$1 : I
/*     */     //   1362: aload #45
/*     */     //   1364: iconst_3
/*     */     //   1365: putfield label : I
/*     */     //   1368: invokevirtual getAvailableActions : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1371: dup
/*     */     //   1372: aload #70
/*     */     //   1374: if_acmpne -> 1508
/*     */     //   1377: aload #70
/*     */     //   1379: areturn
/*     */     //   1380: aload #45
/*     */     //   1382: getfield I$1 : I
/*     */     //   1385: istore #14
/*     */     //   1387: aload #45
/*     */     //   1389: getfield I$0 : I
/*     */     //   1392: istore #13
/*     */     //   1394: aload #45
/*     */     //   1396: getfield L$10 : Ljava/lang/Object;
/*     */     //   1399: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*     */     //   1402: astore #18
/*     */     //   1404: aload #45
/*     */     //   1406: getfield L$9 : Ljava/lang/Object;
/*     */     //   1409: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   1412: astore #17
/*     */     //   1414: aload #45
/*     */     //   1416: getfield L$8 : Ljava/lang/Object;
/*     */     //   1419: checkcast java/util/List
/*     */     //   1422: astore #12
/*     */     //   1424: aload #45
/*     */     //   1426: getfield L$7 : Ljava/lang/Object;
/*     */     //   1429: checkcast java/util/List
/*     */     //   1432: astore #11
/*     */     //   1434: aload #45
/*     */     //   1436: getfield L$6 : Ljava/lang/Object;
/*     */     //   1439: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*     */     //   1442: astore #9
/*     */     //   1444: aload #45
/*     */     //   1446: getfield L$5 : Ljava/lang/Object;
/*     */     //   1449: checkcast java/util/List
/*     */     //   1452: astore #7
/*     */     //   1454: aload #45
/*     */     //   1456: getfield L$4 : Ljava/lang/Object;
/*     */     //   1459: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   1462: astore #5
/*     */     //   1464: aload #45
/*     */     //   1466: getfield L$3 : Ljava/lang/Object;
/*     */     //   1469: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   1472: astore #4
/*     */     //   1474: aload #45
/*     */     //   1476: getfield L$2 : Ljava/lang/Object;
/*     */     //   1479: checkcast java/util/List
/*     */     //   1482: astore_2
/*     */     //   1483: aload #45
/*     */     //   1485: getfield L$1 : Ljava/lang/Object;
/*     */     //   1488: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentState
/*     */     //   1491: astore_1
/*     */     //   1492: aload #45
/*     */     //   1494: getfield L$0 : Ljava/lang/Object;
/*     */     //   1497: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker
/*     */     //   1500: astore_0
/*     */     //   1501: aload #44
/*     */     //   1503: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1506: aload #44
/*     */     //   1508: checkcast java/util/List
/*     */     //   1511: astore #19
/*     */     //   1513: nop
/*     */     //   1514: aload #9
/*     */     //   1516: invokevirtual getUseTools : ()Z
/*     */     //   1519: ifeq -> 1539
/*     */     //   1522: new com/intellij/ml/llm/matterhorn/ej/core/actions/ToolActionProvider
/*     */     //   1525: dup
/*     */     //   1526: aload #18
/*     */     //   1528: aload #19
/*     */     //   1530: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Ljava/util/List;)V
/*     */     //   1533: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider
/*     */     //   1536: goto -> 1553
/*     */     //   1539: new com/intellij/ml/llm/matterhorn/ej/core/actions/MessageActionProvider
/*     */     //   1542: dup
/*     */     //   1543: aload #18
/*     */     //   1545: aload #19
/*     */     //   1547: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Ljava/util/List;)V
/*     */     //   1550: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider
/*     */     //   1553: astore #20
/*     */     //   1555: aload #20
/*     */     //   1557: invokeinterface getActionString : ()Ljava/lang/String;
/*     */     //   1562: astore #21
/*     */     //   1564: new kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   1567: dup
/*     */     //   1568: invokespecial <init> : ()V
/*     */     //   1571: astore #22
/*     */     //   1573: nop
/*     */     //   1574: aload #22
/*     */     //   1576: astore #35
/*     */     //   1578: aload #20
/*     */     //   1580: aload #4
/*     */     //   1582: iconst_0
/*     */     //   1583: aload #45
/*     */     //   1585: aload #45
/*     */     //   1587: aload_0
/*     */     //   1588: putfield L$0 : Ljava/lang/Object;
/*     */     //   1591: aload #45
/*     */     //   1593: aload_1
/*     */     //   1594: putfield L$1 : Ljava/lang/Object;
/*     */     //   1597: aload #45
/*     */     //   1599: aload_2
/*     */     //   1600: putfield L$2 : Ljava/lang/Object;
/*     */     //   1603: aload #45
/*     */     //   1605: aload #4
/*     */     //   1607: putfield L$3 : Ljava/lang/Object;
/*     */     //   1610: aload #45
/*     */     //   1612: aload #5
/*     */     //   1614: putfield L$4 : Ljava/lang/Object;
/*     */     //   1617: aload #45
/*     */     //   1619: aload #7
/*     */     //   1621: putfield L$5 : Ljava/lang/Object;
/*     */     //   1624: aload #45
/*     */     //   1626: aload #9
/*     */     //   1628: putfield L$6 : Ljava/lang/Object;
/*     */     //   1631: aload #45
/*     */     //   1633: aload #11
/*     */     //   1635: putfield L$7 : Ljava/lang/Object;
/*     */     //   1638: aload #45
/*     */     //   1640: aload #12
/*     */     //   1642: putfield L$8 : Ljava/lang/Object;
/*     */     //   1645: aload #45
/*     */     //   1647: aload #17
/*     */     //   1649: putfield L$9 : Ljava/lang/Object;
/*     */     //   1652: aload #45
/*     */     //   1654: aload #20
/*     */     //   1656: putfield L$10 : Ljava/lang/Object;
/*     */     //   1659: aload #45
/*     */     //   1661: aload #21
/*     */     //   1663: putfield L$11 : Ljava/lang/Object;
/*     */     //   1666: aload #45
/*     */     //   1668: aload #22
/*     */     //   1670: putfield L$12 : Ljava/lang/Object;
/*     */     //   1673: aload #45
/*     */     //   1675: aload #35
/*     */     //   1677: putfield L$13 : Ljava/lang/Object;
/*     */     //   1680: aload #45
/*     */     //   1682: iload #13
/*     */     //   1684: putfield I$0 : I
/*     */     //   1687: aload #45
/*     */     //   1689: iload #14
/*     */     //   1691: putfield I$1 : I
/*     */     //   1694: aload #45
/*     */     //   1696: iconst_4
/*     */     //   1697: putfield label : I
/*     */     //   1700: invokeinterface getAction : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1705: dup
/*     */     //   1706: aload #70
/*     */     //   1708: if_acmpne -> 1873
/*     */     //   1711: aload #70
/*     */     //   1713: areturn
/*     */     //   1714: aload #45
/*     */     //   1716: getfield I$1 : I
/*     */     //   1719: istore #14
/*     */     //   1721: aload #45
/*     */     //   1723: getfield I$0 : I
/*     */     //   1726: istore #13
/*     */     //   1728: aload #45
/*     */     //   1730: getfield L$13 : Ljava/lang/Object;
/*     */     //   1733: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   1736: astore #35
/*     */     //   1738: aload #45
/*     */     //   1740: getfield L$12 : Ljava/lang/Object;
/*     */     //   1743: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   1746: astore #22
/*     */     //   1748: aload #45
/*     */     //   1750: getfield L$11 : Ljava/lang/Object;
/*     */     //   1753: checkcast java/lang/String
/*     */     //   1756: astore #21
/*     */     //   1758: aload #45
/*     */     //   1760: getfield L$10 : Ljava/lang/Object;
/*     */     //   1763: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider
/*     */     //   1766: astore #20
/*     */     //   1768: aload #45
/*     */     //   1770: getfield L$9 : Ljava/lang/Object;
/*     */     //   1773: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   1776: astore #17
/*     */     //   1778: aload #45
/*     */     //   1780: getfield L$8 : Ljava/lang/Object;
/*     */     //   1783: checkcast java/util/List
/*     */     //   1786: astore #12
/*     */     //   1788: aload #45
/*     */     //   1790: getfield L$7 : Ljava/lang/Object;
/*     */     //   1793: checkcast java/util/List
/*     */     //   1796: astore #11
/*     */     //   1798: aload #45
/*     */     //   1800: getfield L$6 : Ljava/lang/Object;
/*     */     //   1803: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*     */     //   1806: astore #9
/*     */     //   1808: aload #45
/*     */     //   1810: getfield L$5 : Ljava/lang/Object;
/*     */     //   1813: checkcast java/util/List
/*     */     //   1816: astore #7
/*     */     //   1818: aload #45
/*     */     //   1820: getfield L$4 : Ljava/lang/Object;
/*     */     //   1823: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   1826: astore #5
/*     */     //   1828: aload #45
/*     */     //   1830: getfield L$3 : Ljava/lang/Object;
/*     */     //   1833: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   1836: astore #4
/*     */     //   1838: aload #45
/*     */     //   1840: getfield L$2 : Ljava/lang/Object;
/*     */     //   1843: checkcast java/util/List
/*     */     //   1846: astore_2
/*     */     //   1847: aload #45
/*     */     //   1849: getfield L$1 : Ljava/lang/Object;
/*     */     //   1852: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentState
/*     */     //   1855: astore_1
/*     */     //   1856: aload #45
/*     */     //   1858: getfield L$0 : Ljava/lang/Object;
/*     */     //   1861: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker
/*     */     //   1864: astore_0
/*     */     //   1865: nop
/*     */     //   1866: aload #44
/*     */     //   1868: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1871: aload #44
/*     */     //   1873: astore #36
/*     */     //   1875: aload #35
/*     */     //   1877: aload #36
/*     */     //   1879: putfield element : Ljava/lang/Object;
/*     */     //   1882: aload_0
/*     */     //   1883: invokevirtual areBashCommandsAllowed : ()Z
/*     */     //   1886: ifne -> 2277
/*     */     //   1889: aload_0
/*     */     //   1890: aload #4
/*     */     //   1892: aload #45
/*     */     //   1894: aload #45
/*     */     //   1896: aload_0
/*     */     //   1897: putfield L$0 : Ljava/lang/Object;
/*     */     //   1900: aload #45
/*     */     //   1902: aload_1
/*     */     //   1903: putfield L$1 : Ljava/lang/Object;
/*     */     //   1906: aload #45
/*     */     //   1908: aload_2
/*     */     //   1909: putfield L$2 : Ljava/lang/Object;
/*     */     //   1912: aload #45
/*     */     //   1914: aload #4
/*     */     //   1916: putfield L$3 : Ljava/lang/Object;
/*     */     //   1919: aload #45
/*     */     //   1921: aload #5
/*     */     //   1923: putfield L$4 : Ljava/lang/Object;
/*     */     //   1926: aload #45
/*     */     //   1928: aload #7
/*     */     //   1930: putfield L$5 : Ljava/lang/Object;
/*     */     //   1933: aload #45
/*     */     //   1935: aload #9
/*     */     //   1937: putfield L$6 : Ljava/lang/Object;
/*     */     //   1940: aload #45
/*     */     //   1942: aload #11
/*     */     //   1944: putfield L$7 : Ljava/lang/Object;
/*     */     //   1947: aload #45
/*     */     //   1949: aload #12
/*     */     //   1951: putfield L$8 : Ljava/lang/Object;
/*     */     //   1954: aload #45
/*     */     //   1956: aload #17
/*     */     //   1958: putfield L$9 : Ljava/lang/Object;
/*     */     //   1961: aload #45
/*     */     //   1963: aload #20
/*     */     //   1965: putfield L$10 : Ljava/lang/Object;
/*     */     //   1968: aload #45
/*     */     //   1970: aload #21
/*     */     //   1972: putfield L$11 : Ljava/lang/Object;
/*     */     //   1975: aload #45
/*     */     //   1977: aload #22
/*     */     //   1979: putfield L$12 : Ljava/lang/Object;
/*     */     //   1982: aload #45
/*     */     //   1984: aconst_null
/*     */     //   1985: putfield L$13 : Ljava/lang/Object;
/*     */     //   1988: aload #45
/*     */     //   1990: iload #13
/*     */     //   1992: putfield I$0 : I
/*     */     //   1995: aload #45
/*     */     //   1997: iload #14
/*     */     //   1999: putfield I$1 : I
/*     */     //   2002: aload #45
/*     */     //   2004: iconst_5
/*     */     //   2005: putfield label : I
/*     */     //   2008: invokevirtual getAvailableActions : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   2011: dup
/*     */     //   2012: aload #70
/*     */     //   2014: if_acmpne -> 2169
/*     */     //   2017: aload #70
/*     */     //   2019: areturn
/*     */     //   2020: aload #45
/*     */     //   2022: getfield I$1 : I
/*     */     //   2025: istore #14
/*     */     //   2027: aload #45
/*     */     //   2029: getfield I$0 : I
/*     */     //   2032: istore #13
/*     */     //   2034: aload #45
/*     */     //   2036: getfield L$12 : Ljava/lang/Object;
/*     */     //   2039: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   2042: astore #22
/*     */     //   2044: aload #45
/*     */     //   2046: getfield L$11 : Ljava/lang/Object;
/*     */     //   2049: checkcast java/lang/String
/*     */     //   2052: astore #21
/*     */     //   2054: aload #45
/*     */     //   2056: getfield L$10 : Ljava/lang/Object;
/*     */     //   2059: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider
/*     */     //   2062: astore #20
/*     */     //   2064: aload #45
/*     */     //   2066: getfield L$9 : Ljava/lang/Object;
/*     */     //   2069: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   2072: astore #17
/*     */     //   2074: aload #45
/*     */     //   2076: getfield L$8 : Ljava/lang/Object;
/*     */     //   2079: checkcast java/util/List
/*     */     //   2082: astore #12
/*     */     //   2084: aload #45
/*     */     //   2086: getfield L$7 : Ljava/lang/Object;
/*     */     //   2089: checkcast java/util/List
/*     */     //   2092: astore #11
/*     */     //   2094: aload #45
/*     */     //   2096: getfield L$6 : Ljava/lang/Object;
/*     */     //   2099: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*     */     //   2102: astore #9
/*     */     //   2104: aload #45
/*     */     //   2106: getfield L$5 : Ljava/lang/Object;
/*     */     //   2109: checkcast java/util/List
/*     */     //   2112: astore #7
/*     */     //   2114: aload #45
/*     */     //   2116: getfield L$4 : Ljava/lang/Object;
/*     */     //   2119: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   2122: astore #5
/*     */     //   2124: aload #45
/*     */     //   2126: getfield L$3 : Ljava/lang/Object;
/*     */     //   2129: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   2132: astore #4
/*     */     //   2134: aload #45
/*     */     //   2136: getfield L$2 : Ljava/lang/Object;
/*     */     //   2139: checkcast java/util/List
/*     */     //   2142: astore_2
/*     */     //   2143: aload #45
/*     */     //   2145: getfield L$1 : Ljava/lang/Object;
/*     */     //   2148: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentState
/*     */     //   2151: astore_1
/*     */     //   2152: aload #45
/*     */     //   2154: getfield L$0 : Ljava/lang/Object;
/*     */     //   2157: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker
/*     */     //   2160: astore_0
/*     */     //   2161: nop
/*     */     //   2162: aload #44
/*     */     //   2164: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   2167: aload #44
/*     */     //   2169: checkcast java/lang/Iterable
/*     */     //   2172: astore #23
/*     */     //   2174: aload #23
/*     */     //   2176: astore #24
/*     */     //   2178: aload #24
/*     */     //   2180: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   2185: astore #25
/*     */     //   2187: aload #25
/*     */     //   2189: invokeinterface hasNext : ()Z
/*     */     //   2194: ifeq -> 2247
/*     */     //   2197: aload #25
/*     */     //   2199: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   2204: astore #26
/*     */     //   2206: aload #26
/*     */     //   2208: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentAction
/*     */     //   2211: astore #27
/*     */     //   2213: iconst_0
/*     */     //   2214: istore #28
/*     */     //   2216: aload #27
/*     */     //   2218: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   2223: aload #22
/*     */     //   2225: getfield element : Ljava/lang/Object;
/*     */     //   2228: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*     */     //   2231: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   2236: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   2239: ifeq -> 2187
/*     */     //   2242: aload #26
/*     */     //   2244: goto -> 2248
/*     */     //   2247: aconst_null
/*     */     //   2248: ifnonnull -> 2277
/*     */     //   2251: new java/lang/Exception
/*     */     //   2254: dup
/*     */     //   2255: aload #22
/*     */     //   2257: getfield element : Ljava/lang/Object;
/*     */     //   2260: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*     */     //   2263: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   2268: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   2273: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   2276: athrow
/*     */     //   2277: aload #20
/*     */     //   2279: aload #4
/*     */     //   2281: iconst_1
/*     */     //   2282: aload #45
/*     */     //   2284: aload #45
/*     */     //   2286: aload_0
/*     */     //   2287: putfield L$0 : Ljava/lang/Object;
/*     */     //   2290: aload #45
/*     */     //   2292: aload_1
/*     */     //   2293: putfield L$1 : Ljava/lang/Object;
/*     */     //   2296: aload #45
/*     */     //   2298: aload_2
/*     */     //   2299: putfield L$2 : Ljava/lang/Object;
/*     */     //   2302: aload #45
/*     */     //   2304: aload #4
/*     */     //   2306: putfield L$3 : Ljava/lang/Object;
/*     */     //   2309: aload #45
/*     */     //   2311: aload #5
/*     */     //   2313: putfield L$4 : Ljava/lang/Object;
/*     */     //   2316: aload #45
/*     */     //   2318: aload #7
/*     */     //   2320: putfield L$5 : Ljava/lang/Object;
/*     */     //   2323: aload #45
/*     */     //   2325: aload #9
/*     */     //   2327: putfield L$6 : Ljava/lang/Object;
/*     */     //   2330: aload #45
/*     */     //   2332: aload #11
/*     */     //   2334: putfield L$7 : Ljava/lang/Object;
/*     */     //   2337: aload #45
/*     */     //   2339: aload #12
/*     */     //   2341: putfield L$8 : Ljava/lang/Object;
/*     */     //   2344: aload #45
/*     */     //   2346: aload #17
/*     */     //   2348: putfield L$9 : Ljava/lang/Object;
/*     */     //   2351: aload #45
/*     */     //   2353: aload #20
/*     */     //   2355: putfield L$10 : Ljava/lang/Object;
/*     */     //   2358: aload #45
/*     */     //   2360: aload #21
/*     */     //   2362: putfield L$11 : Ljava/lang/Object;
/*     */     //   2365: aload #45
/*     */     //   2367: aload #22
/*     */     //   2369: putfield L$12 : Ljava/lang/Object;
/*     */     //   2372: aload #45
/*     */     //   2374: aconst_null
/*     */     //   2375: putfield L$13 : Ljava/lang/Object;
/*     */     //   2378: aload #45
/*     */     //   2380: iload #13
/*     */     //   2382: putfield I$0 : I
/*     */     //   2385: aload #45
/*     */     //   2387: iload #14
/*     */     //   2389: putfield I$1 : I
/*     */     //   2392: aload #45
/*     */     //   2394: bipush #6
/*     */     //   2396: putfield label : I
/*     */     //   2399: invokeinterface getAction : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   2404: dup
/*     */     //   2405: aload #70
/*     */     //   2407: if_acmpne -> 2562
/*     */     //   2410: aload #70
/*     */     //   2412: areturn
/*     */     //   2413: aload #45
/*     */     //   2415: getfield I$1 : I
/*     */     //   2418: istore #14
/*     */     //   2420: aload #45
/*     */     //   2422: getfield I$0 : I
/*     */     //   2425: istore #13
/*     */     //   2427: aload #45
/*     */     //   2429: getfield L$12 : Ljava/lang/Object;
/*     */     //   2432: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   2435: astore #22
/*     */     //   2437: aload #45
/*     */     //   2439: getfield L$11 : Ljava/lang/Object;
/*     */     //   2442: checkcast java/lang/String
/*     */     //   2445: astore #21
/*     */     //   2447: aload #45
/*     */     //   2449: getfield L$10 : Ljava/lang/Object;
/*     */     //   2452: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider
/*     */     //   2455: astore #20
/*     */     //   2457: aload #45
/*     */     //   2459: getfield L$9 : Ljava/lang/Object;
/*     */     //   2462: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   2465: astore #17
/*     */     //   2467: aload #45
/*     */     //   2469: getfield L$8 : Ljava/lang/Object;
/*     */     //   2472: checkcast java/util/List
/*     */     //   2475: astore #12
/*     */     //   2477: aload #45
/*     */     //   2479: getfield L$7 : Ljava/lang/Object;
/*     */     //   2482: checkcast java/util/List
/*     */     //   2485: astore #11
/*     */     //   2487: aload #45
/*     */     //   2489: getfield L$6 : Ljava/lang/Object;
/*     */     //   2492: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*     */     //   2495: astore #9
/*     */     //   2497: aload #45
/*     */     //   2499: getfield L$5 : Ljava/lang/Object;
/*     */     //   2502: checkcast java/util/List
/*     */     //   2505: astore #7
/*     */     //   2507: aload #45
/*     */     //   2509: getfield L$4 : Ljava/lang/Object;
/*     */     //   2512: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   2515: astore #5
/*     */     //   2517: aload #45
/*     */     //   2519: getfield L$3 : Ljava/lang/Object;
/*     */     //   2522: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   2525: astore #4
/*     */     //   2527: aload #45
/*     */     //   2529: getfield L$2 : Ljava/lang/Object;
/*     */     //   2532: checkcast java/util/List
/*     */     //   2535: astore_2
/*     */     //   2536: aload #45
/*     */     //   2538: getfield L$1 : Ljava/lang/Object;
/*     */     //   2541: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentState
/*     */     //   2544: astore_1
/*     */     //   2545: aload #45
/*     */     //   2547: getfield L$0 : Ljava/lang/Object;
/*     */     //   2550: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker
/*     */     //   2553: astore_0
/*     */     //   2554: nop
/*     */     //   2555: aload #44
/*     */     //   2557: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   2560: aload #44
/*     */     //   2562: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*     */     //   2565: astore #23
/*     */     //   2567: aload_0
/*     */     //   2568: aload #17
/*     */     //   2570: astore #36
/*     */     //   2572: astore #35
/*     */     //   2574: aload_0
/*     */     //   2575: aload #5
/*     */     //   2577: aload #45
/*     */     //   2579: aload #45
/*     */     //   2581: aload_0
/*     */     //   2582: putfield L$0 : Ljava/lang/Object;
/*     */     //   2585: aload #45
/*     */     //   2587: aload_1
/*     */     //   2588: putfield L$1 : Ljava/lang/Object;
/*     */     //   2591: aload #45
/*     */     //   2593: aload_2
/*     */     //   2594: putfield L$2 : Ljava/lang/Object;
/*     */     //   2597: aload #45
/*     */     //   2599: aload #4
/*     */     //   2601: putfield L$3 : Ljava/lang/Object;
/*     */     //   2604: aload #45
/*     */     //   2606: aload #5
/*     */     //   2608: putfield L$4 : Ljava/lang/Object;
/*     */     //   2611: aload #45
/*     */     //   2613: aload #7
/*     */     //   2615: putfield L$5 : Ljava/lang/Object;
/*     */     //   2618: aload #45
/*     */     //   2620: aload #9
/*     */     //   2622: putfield L$6 : Ljava/lang/Object;
/*     */     //   2625: aload #45
/*     */     //   2627: aload #11
/*     */     //   2629: putfield L$7 : Ljava/lang/Object;
/*     */     //   2632: aload #45
/*     */     //   2634: aload #12
/*     */     //   2636: putfield L$8 : Ljava/lang/Object;
/*     */     //   2639: aload #45
/*     */     //   2641: aload #17
/*     */     //   2643: putfield L$9 : Ljava/lang/Object;
/*     */     //   2646: aload #45
/*     */     //   2648: aload #20
/*     */     //   2650: putfield L$10 : Ljava/lang/Object;
/*     */     //   2653: aload #45
/*     */     //   2655: aload #21
/*     */     //   2657: putfield L$11 : Ljava/lang/Object;
/*     */     //   2660: aload #45
/*     */     //   2662: aload #22
/*     */     //   2664: putfield L$12 : Ljava/lang/Object;
/*     */     //   2667: aload #45
/*     */     //   2669: aload #23
/*     */     //   2671: putfield L$13 : Ljava/lang/Object;
/*     */     //   2674: aload #45
/*     */     //   2676: aload #35
/*     */     //   2678: putfield L$14 : Ljava/lang/Object;
/*     */     //   2681: aload #45
/*     */     //   2683: aload #36
/*     */     //   2685: putfield L$15 : Ljava/lang/Object;
/*     */     //   2688: aload #45
/*     */     //   2690: iload #13
/*     */     //   2692: putfield I$0 : I
/*     */     //   2695: aload #45
/*     */     //   2697: iload #14
/*     */     //   2699: putfield I$1 : I
/*     */     //   2702: aload #45
/*     */     //   2704: bipush #7
/*     */     //   2706: putfield label : I
/*     */     //   2709: invokevirtual getAgentParameters : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   2712: dup
/*     */     //   2713: aload #70
/*     */     //   2715: if_acmpne -> 2900
/*     */     //   2718: aload #70
/*     */     //   2720: areturn
/*     */     //   2721: aload #45
/*     */     //   2723: getfield I$1 : I
/*     */     //   2726: istore #14
/*     */     //   2728: aload #45
/*     */     //   2730: getfield I$0 : I
/*     */     //   2733: istore #13
/*     */     //   2735: aload #45
/*     */     //   2737: getfield L$15 : Ljava/lang/Object;
/*     */     //   2740: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   2743: astore #36
/*     */     //   2745: aload #45
/*     */     //   2747: getfield L$14 : Ljava/lang/Object;
/*     */     //   2750: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker
/*     */     //   2753: astore #35
/*     */     //   2755: aload #45
/*     */     //   2757: getfield L$13 : Ljava/lang/Object;
/*     */     //   2760: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*     */     //   2763: astore #23
/*     */     //   2765: aload #45
/*     */     //   2767: getfield L$12 : Ljava/lang/Object;
/*     */     //   2770: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   2773: astore #22
/*     */     //   2775: aload #45
/*     */     //   2777: getfield L$11 : Ljava/lang/Object;
/*     */     //   2780: checkcast java/lang/String
/*     */     //   2783: astore #21
/*     */     //   2785: aload #45
/*     */     //   2787: getfield L$10 : Ljava/lang/Object;
/*     */     //   2790: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider
/*     */     //   2793: astore #20
/*     */     //   2795: aload #45
/*     */     //   2797: getfield L$9 : Ljava/lang/Object;
/*     */     //   2800: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   2803: astore #17
/*     */     //   2805: aload #45
/*     */     //   2807: getfield L$8 : Ljava/lang/Object;
/*     */     //   2810: checkcast java/util/List
/*     */     //   2813: astore #12
/*     */     //   2815: aload #45
/*     */     //   2817: getfield L$7 : Ljava/lang/Object;
/*     */     //   2820: checkcast java/util/List
/*     */     //   2823: astore #11
/*     */     //   2825: aload #45
/*     */     //   2827: getfield L$6 : Ljava/lang/Object;
/*     */     //   2830: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*     */     //   2833: astore #9
/*     */     //   2835: aload #45
/*     */     //   2837: getfield L$5 : Ljava/lang/Object;
/*     */     //   2840: checkcast java/util/List
/*     */     //   2843: astore #7
/*     */     //   2845: aload #45
/*     */     //   2847: getfield L$4 : Ljava/lang/Object;
/*     */     //   2850: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   2853: astore #5
/*     */     //   2855: aload #45
/*     */     //   2857: getfield L$3 : Ljava/lang/Object;
/*     */     //   2860: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   2863: astore #4
/*     */     //   2865: aload #45
/*     */     //   2867: getfield L$2 : Ljava/lang/Object;
/*     */     //   2870: checkcast java/util/List
/*     */     //   2873: astore_2
/*     */     //   2874: aload #45
/*     */     //   2876: getfield L$1 : Ljava/lang/Object;
/*     */     //   2879: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentState
/*     */     //   2882: astore_1
/*     */     //   2883: aload #45
/*     */     //   2885: getfield L$0 : Ljava/lang/Object;
/*     */     //   2888: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker
/*     */     //   2891: astore_0
/*     */     //   2892: nop
/*     */     //   2893: aload #44
/*     */     //   2895: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   2898: aload #44
/*     */     //   2900: astore #37
/*     */     //   2902: aload #35
/*     */     //   2904: aload #36
/*     */     //   2906: aload #37
/*     */     //   2908: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*     */     //   2911: iload #13
/*     */     //   2913: aload #45
/*     */     //   2915: aload #45
/*     */     //   2917: aload_0
/*     */     //   2918: putfield L$0 : Ljava/lang/Object;
/*     */     //   2921: aload #45
/*     */     //   2923: aload_1
/*     */     //   2924: putfield L$1 : Ljava/lang/Object;
/*     */     //   2927: aload #45
/*     */     //   2929: aload_2
/*     */     //   2930: putfield L$2 : Ljava/lang/Object;
/*     */     //   2933: aload #45
/*     */     //   2935: aload #4
/*     */     //   2937: putfield L$3 : Ljava/lang/Object;
/*     */     //   2940: aload #45
/*     */     //   2942: aload #5
/*     */     //   2944: putfield L$4 : Ljava/lang/Object;
/*     */     //   2947: aload #45
/*     */     //   2949: aload #7
/*     */     //   2951: putfield L$5 : Ljava/lang/Object;
/*     */     //   2954: aload #45
/*     */     //   2956: aload #9
/*     */     //   2958: putfield L$6 : Ljava/lang/Object;
/*     */     //   2961: aload #45
/*     */     //   2963: aload #11
/*     */     //   2965: putfield L$7 : Ljava/lang/Object;
/*     */     //   2968: aload #45
/*     */     //   2970: aload #12
/*     */     //   2972: putfield L$8 : Ljava/lang/Object;
/*     */     //   2975: aload #45
/*     */     //   2977: aload #17
/*     */     //   2979: putfield L$9 : Ljava/lang/Object;
/*     */     //   2982: aload #45
/*     */     //   2984: aload #20
/*     */     //   2986: putfield L$10 : Ljava/lang/Object;
/*     */     //   2989: aload #45
/*     */     //   2991: aload #21
/*     */     //   2993: putfield L$11 : Ljava/lang/Object;
/*     */     //   2996: aload #45
/*     */     //   2998: aload #22
/*     */     //   3000: putfield L$12 : Ljava/lang/Object;
/*     */     //   3003: aload #45
/*     */     //   3005: aload #23
/*     */     //   3007: putfield L$13 : Ljava/lang/Object;
/*     */     //   3010: aload #45
/*     */     //   3012: aconst_null
/*     */     //   3013: putfield L$14 : Ljava/lang/Object;
/*     */     //   3016: aload #45
/*     */     //   3018: aconst_null
/*     */     //   3019: putfield L$15 : Ljava/lang/Object;
/*     */     //   3022: aload #45
/*     */     //   3024: iload #13
/*     */     //   3026: putfield I$0 : I
/*     */     //   3029: aload #45
/*     */     //   3031: iload #14
/*     */     //   3033: putfield I$1 : I
/*     */     //   3036: aload #45
/*     */     //   3038: bipush #8
/*     */     //   3040: putfield label : I
/*     */     //   3043: invokespecial getCritiqueResponse : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   3046: dup
/*     */     //   3047: aload #70
/*     */     //   3049: if_acmpne -> 3214
/*     */     //   3052: aload #70
/*     */     //   3054: areturn
/*     */     //   3055: aload #45
/*     */     //   3057: getfield I$1 : I
/*     */     //   3060: istore #14
/*     */     //   3062: aload #45
/*     */     //   3064: getfield I$0 : I
/*     */     //   3067: istore #13
/*     */     //   3069: aload #45
/*     */     //   3071: getfield L$13 : Ljava/lang/Object;
/*     */     //   3074: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*     */     //   3077: astore #23
/*     */     //   3079: aload #45
/*     */     //   3081: getfield L$12 : Ljava/lang/Object;
/*     */     //   3084: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   3087: astore #22
/*     */     //   3089: aload #45
/*     */     //   3091: getfield L$11 : Ljava/lang/Object;
/*     */     //   3094: checkcast java/lang/String
/*     */     //   3097: astore #21
/*     */     //   3099: aload #45
/*     */     //   3101: getfield L$10 : Ljava/lang/Object;
/*     */     //   3104: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider
/*     */     //   3107: astore #20
/*     */     //   3109: aload #45
/*     */     //   3111: getfield L$9 : Ljava/lang/Object;
/*     */     //   3114: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   3117: astore #17
/*     */     //   3119: aload #45
/*     */     //   3121: getfield L$8 : Ljava/lang/Object;
/*     */     //   3124: checkcast java/util/List
/*     */     //   3127: astore #12
/*     */     //   3129: aload #45
/*     */     //   3131: getfield L$7 : Ljava/lang/Object;
/*     */     //   3134: checkcast java/util/List
/*     */     //   3137: astore #11
/*     */     //   3139: aload #45
/*     */     //   3141: getfield L$6 : Ljava/lang/Object;
/*     */     //   3144: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*     */     //   3147: astore #9
/*     */     //   3149: aload #45
/*     */     //   3151: getfield L$5 : Ljava/lang/Object;
/*     */     //   3154: checkcast java/util/List
/*     */     //   3157: astore #7
/*     */     //   3159: aload #45
/*     */     //   3161: getfield L$4 : Ljava/lang/Object;
/*     */     //   3164: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   3167: astore #5
/*     */     //   3169: aload #45
/*     */     //   3171: getfield L$3 : Ljava/lang/Object;
/*     */     //   3174: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   3177: astore #4
/*     */     //   3179: aload #45
/*     */     //   3181: getfield L$2 : Ljava/lang/Object;
/*     */     //   3184: checkcast java/util/List
/*     */     //   3187: astore_2
/*     */     //   3188: aload #45
/*     */     //   3190: getfield L$1 : Ljava/lang/Object;
/*     */     //   3193: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentState
/*     */     //   3196: astore_1
/*     */     //   3197: aload #45
/*     */     //   3199: getfield L$0 : Ljava/lang/Object;
/*     */     //   3202: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker
/*     */     //   3205: astore_0
/*     */     //   3206: nop
/*     */     //   3207: aload #44
/*     */     //   3209: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   3212: aload #44
/*     */     //   3214: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse
/*     */     //   3217: astore #24
/*     */     //   3219: aload #17
/*     */     //   3221: astore #35
/*     */     //   3223: aload_0
/*     */     //   3224: aload #5
/*     */     //   3226: aload #45
/*     */     //   3228: aload #45
/*     */     //   3230: aload_0
/*     */     //   3231: putfield L$0 : Ljava/lang/Object;
/*     */     //   3234: aload #45
/*     */     //   3236: aload_1
/*     */     //   3237: putfield L$1 : Ljava/lang/Object;
/*     */     //   3240: aload #45
/*     */     //   3242: aload_2
/*     */     //   3243: putfield L$2 : Ljava/lang/Object;
/*     */     //   3246: aload #45
/*     */     //   3248: aload #4
/*     */     //   3250: putfield L$3 : Ljava/lang/Object;
/*     */     //   3253: aload #45
/*     */     //   3255: aload #5
/*     */     //   3257: putfield L$4 : Ljava/lang/Object;
/*     */     //   3260: aload #45
/*     */     //   3262: aload #7
/*     */     //   3264: putfield L$5 : Ljava/lang/Object;
/*     */     //   3267: aload #45
/*     */     //   3269: aload #9
/*     */     //   3271: putfield L$6 : Ljava/lang/Object;
/*     */     //   3274: aload #45
/*     */     //   3276: aload #11
/*     */     //   3278: putfield L$7 : Ljava/lang/Object;
/*     */     //   3281: aload #45
/*     */     //   3283: aload #12
/*     */     //   3285: putfield L$8 : Ljava/lang/Object;
/*     */     //   3288: aload #45
/*     */     //   3290: aload #17
/*     */     //   3292: putfield L$9 : Ljava/lang/Object;
/*     */     //   3295: aload #45
/*     */     //   3297: aload #20
/*     */     //   3299: putfield L$10 : Ljava/lang/Object;
/*     */     //   3302: aload #45
/*     */     //   3304: aload #21
/*     */     //   3306: putfield L$11 : Ljava/lang/Object;
/*     */     //   3309: aload #45
/*     */     //   3311: aload #22
/*     */     //   3313: putfield L$12 : Ljava/lang/Object;
/*     */     //   3316: aload #45
/*     */     //   3318: aload #23
/*     */     //   3320: putfield L$13 : Ljava/lang/Object;
/*     */     //   3323: aload #45
/*     */     //   3325: aload #24
/*     */     //   3327: putfield L$14 : Ljava/lang/Object;
/*     */     //   3330: aload #45
/*     */     //   3332: aload #35
/*     */     //   3334: putfield L$15 : Ljava/lang/Object;
/*     */     //   3337: aload #45
/*     */     //   3339: iload #13
/*     */     //   3341: putfield I$0 : I
/*     */     //   3344: aload #45
/*     */     //   3346: iload #14
/*     */     //   3348: putfield I$1 : I
/*     */     //   3351: aload #45
/*     */     //   3353: bipush #9
/*     */     //   3355: putfield label : I
/*     */     //   3358: invokevirtual getTrajectoryElementAgent : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   3361: dup
/*     */     //   3362: aload #70
/*     */     //   3364: if_acmpne -> 3549
/*     */     //   3367: aload #70
/*     */     //   3369: areturn
/*     */     //   3370: aload #45
/*     */     //   3372: getfield I$1 : I
/*     */     //   3375: istore #14
/*     */     //   3377: aload #45
/*     */     //   3379: getfield I$0 : I
/*     */     //   3382: istore #13
/*     */     //   3384: aload #45
/*     */     //   3386: getfield L$15 : Ljava/lang/Object;
/*     */     //   3389: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   3392: astore #35
/*     */     //   3394: aload #45
/*     */     //   3396: getfield L$14 : Ljava/lang/Object;
/*     */     //   3399: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse
/*     */     //   3402: astore #24
/*     */     //   3404: aload #45
/*     */     //   3406: getfield L$13 : Ljava/lang/Object;
/*     */     //   3409: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*     */     //   3412: astore #23
/*     */     //   3414: aload #45
/*     */     //   3416: getfield L$12 : Ljava/lang/Object;
/*     */     //   3419: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   3422: astore #22
/*     */     //   3424: aload #45
/*     */     //   3426: getfield L$11 : Ljava/lang/Object;
/*     */     //   3429: checkcast java/lang/String
/*     */     //   3432: astore #21
/*     */     //   3434: aload #45
/*     */     //   3436: getfield L$10 : Ljava/lang/Object;
/*     */     //   3439: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider
/*     */     //   3442: astore #20
/*     */     //   3444: aload #45
/*     */     //   3446: getfield L$9 : Ljava/lang/Object;
/*     */     //   3449: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   3452: astore #17
/*     */     //   3454: aload #45
/*     */     //   3456: getfield L$8 : Ljava/lang/Object;
/*     */     //   3459: checkcast java/util/List
/*     */     //   3462: astore #12
/*     */     //   3464: aload #45
/*     */     //   3466: getfield L$7 : Ljava/lang/Object;
/*     */     //   3469: checkcast java/util/List
/*     */     //   3472: astore #11
/*     */     //   3474: aload #45
/*     */     //   3476: getfield L$6 : Ljava/lang/Object;
/*     */     //   3479: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*     */     //   3482: astore #9
/*     */     //   3484: aload #45
/*     */     //   3486: getfield L$5 : Ljava/lang/Object;
/*     */     //   3489: checkcast java/util/List
/*     */     //   3492: astore #7
/*     */     //   3494: aload #45
/*     */     //   3496: getfield L$4 : Ljava/lang/Object;
/*     */     //   3499: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   3502: astore #5
/*     */     //   3504: aload #45
/*     */     //   3506: getfield L$3 : Ljava/lang/Object;
/*     */     //   3509: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   3512: astore #4
/*     */     //   3514: aload #45
/*     */     //   3516: getfield L$2 : Ljava/lang/Object;
/*     */     //   3519: checkcast java/util/List
/*     */     //   3522: astore_2
/*     */     //   3523: aload #45
/*     */     //   3525: getfield L$1 : Ljava/lang/Object;
/*     */     //   3528: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentState
/*     */     //   3531: astore_1
/*     */     //   3532: aload #45
/*     */     //   3534: getfield L$0 : Ljava/lang/Object;
/*     */     //   3537: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker
/*     */     //   3540: astore_0
/*     */     //   3541: nop
/*     */     //   3542: aload #44
/*     */     //   3544: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   3547: aload #44
/*     */     //   3549: astore #38
/*     */     //   3551: aload #35
/*     */     //   3553: aload #38
/*     */     //   3555: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElementAgent
/*     */     //   3558: aload #21
/*     */     //   3560: aload #23
/*     */     //   3562: invokeinterface getDescription : ()Ljava/lang/String;
/*     */     //   3567: aload #23
/*     */     //   3569: invokeinterface getTitle : ()Ljava/lang/String;
/*     */     //   3574: aload #24
/*     */     //   3576: dup
/*     */     //   3577: ifnull -> 3720
/*     */     //   3580: invokevirtual getCritiqueCandidates : ()Ljava/util/List;
/*     */     //   3583: astore #25
/*     */     //   3585: aload #25
/*     */     //   3587: dup
/*     */     //   3588: ifnull -> 3720
/*     */     //   3591: checkcast java/lang/Iterable
/*     */     //   3594: astore #26
/*     */     //   3596: astore #41
/*     */     //   3598: astore #40
/*     */     //   3600: astore #39
/*     */     //   3602: astore #38
/*     */     //   3604: astore #35
/*     */     //   3606: iconst_0
/*     */     //   3607: istore #27
/*     */     //   3609: aload #26
/*     */     //   3611: astore #28
/*     */     //   3613: new java/util/ArrayList
/*     */     //   3616: dup
/*     */     //   3617: aload #26
/*     */     //   3619: bipush #10
/*     */     //   3621: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   3624: invokespecial <init> : (I)V
/*     */     //   3627: checkcast java/util/Collection
/*     */     //   3630: astore #29
/*     */     //   3632: iconst_0
/*     */     //   3633: istore #30
/*     */     //   3635: aload #28
/*     */     //   3637: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   3642: astore #31
/*     */     //   3644: aload #31
/*     */     //   3646: invokeinterface hasNext : ()Z
/*     */     //   3651: ifeq -> 3697
/*     */     //   3654: aload #31
/*     */     //   3656: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   3661: astore #32
/*     */     //   3663: aload #29
/*     */     //   3665: aload #32
/*     */     //   3667: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   3670: astore #33
/*     */     //   3672: astore #42
/*     */     //   3674: iconst_0
/*     */     //   3675: istore #34
/*     */     //   3677: aload #33
/*     */     //   3679: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   3682: astore #43
/*     */     //   3684: aload #42
/*     */     //   3686: aload #43
/*     */     //   3688: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   3693: pop
/*     */     //   3694: goto -> 3644
/*     */     //   3697: aload #29
/*     */     //   3699: checkcast java/util/List
/*     */     //   3702: nop
/*     */     //   3703: astore #42
/*     */     //   3705: aload #35
/*     */     //   3707: aload #38
/*     */     //   3709: aload #39
/*     */     //   3711: aload #40
/*     */     //   3713: aload #41
/*     */     //   3715: aload #42
/*     */     //   3717: goto -> 3722
/*     */     //   3720: pop
/*     */     //   3721: aconst_null
/*     */     //   3722: aload #24
/*     */     //   3724: dup
/*     */     //   3725: ifnull -> 3734
/*     */     //   3728: invokevirtual getCritiqueRanks : ()Ljava/util/List;
/*     */     //   3731: goto -> 3736
/*     */     //   3734: pop
/*     */     //   3735: aconst_null
/*     */     //   3736: aconst_null
/*     */     //   3737: bipush #64
/*     */     //   3739: aconst_null
/*     */     //   3740: astore #46
/*     */     //   3742: istore #47
/*     */     //   3744: astore #48
/*     */     //   3746: astore #49
/*     */     //   3748: astore #50
/*     */     //   3750: astore #51
/*     */     //   3752: astore #52
/*     */     //   3754: astore #53
/*     */     //   3756: astore #54
/*     */     //   3758: new com/intellij/ml/llm/matterhorn/AssistantTrajectoryElement
/*     */     //   3761: dup
/*     */     //   3762: aload #54
/*     */     //   3764: aload #53
/*     */     //   3766: aload #52
/*     */     //   3768: aload #51
/*     */     //   3770: aload #50
/*     */     //   3772: aload #49
/*     */     //   3774: aload #48
/*     */     //   3776: iload #47
/*     */     //   3778: aload #46
/*     */     //   3780: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   3783: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElement
/*     */     //   3786: aload #45
/*     */     //   3788: aload #45
/*     */     //   3790: aload_0
/*     */     //   3791: putfield L$0 : Ljava/lang/Object;
/*     */     //   3794: aload #45
/*     */     //   3796: aload_1
/*     */     //   3797: putfield L$1 : Ljava/lang/Object;
/*     */     //   3800: aload #45
/*     */     //   3802: aload_2
/*     */     //   3803: putfield L$2 : Ljava/lang/Object;
/*     */     //   3806: aload #45
/*     */     //   3808: aload #4
/*     */     //   3810: putfield L$3 : Ljava/lang/Object;
/*     */     //   3813: aload #45
/*     */     //   3815: aload #5
/*     */     //   3817: putfield L$4 : Ljava/lang/Object;
/*     */     //   3820: aload #45
/*     */     //   3822: aload #7
/*     */     //   3824: putfield L$5 : Ljava/lang/Object;
/*     */     //   3827: aload #45
/*     */     //   3829: aload #9
/*     */     //   3831: putfield L$6 : Ljava/lang/Object;
/*     */     //   3834: aload #45
/*     */     //   3836: aload #11
/*     */     //   3838: putfield L$7 : Ljava/lang/Object;
/*     */     //   3841: aload #45
/*     */     //   3843: aload #12
/*     */     //   3845: putfield L$8 : Ljava/lang/Object;
/*     */     //   3848: aload #45
/*     */     //   3850: aload #17
/*     */     //   3852: putfield L$9 : Ljava/lang/Object;
/*     */     //   3855: aload #45
/*     */     //   3857: aload #20
/*     */     //   3859: putfield L$10 : Ljava/lang/Object;
/*     */     //   3862: aload #45
/*     */     //   3864: aload #21
/*     */     //   3866: putfield L$11 : Ljava/lang/Object;
/*     */     //   3869: aload #45
/*     */     //   3871: aload #22
/*     */     //   3873: putfield L$12 : Ljava/lang/Object;
/*     */     //   3876: aload #45
/*     */     //   3878: aload #23
/*     */     //   3880: putfield L$13 : Ljava/lang/Object;
/*     */     //   3883: aload #45
/*     */     //   3885: aconst_null
/*     */     //   3886: putfield L$14 : Ljava/lang/Object;
/*     */     //   3889: aload #45
/*     */     //   3891: aconst_null
/*     */     //   3892: putfield L$15 : Ljava/lang/Object;
/*     */     //   3895: aload #45
/*     */     //   3897: iload #13
/*     */     //   3899: putfield I$0 : I
/*     */     //   3902: aload #45
/*     */     //   3904: iload #14
/*     */     //   3906: putfield I$1 : I
/*     */     //   3909: aload #45
/*     */     //   3911: bipush #10
/*     */     //   3913: putfield label : I
/*     */     //   3916: invokevirtual logTrajectoryElement : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   3919: dup
/*     */     //   3920: aload #70
/*     */     //   3922: if_acmpne -> 4087
/*     */     //   3925: aload #70
/*     */     //   3927: areturn
/*     */     //   3928: aload #45
/*     */     //   3930: getfield I$1 : I
/*     */     //   3933: istore #14
/*     */     //   3935: aload #45
/*     */     //   3937: getfield I$0 : I
/*     */     //   3940: istore #13
/*     */     //   3942: aload #45
/*     */     //   3944: getfield L$13 : Ljava/lang/Object;
/*     */     //   3947: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*     */     //   3950: astore #23
/*     */     //   3952: aload #45
/*     */     //   3954: getfield L$12 : Ljava/lang/Object;
/*     */     //   3957: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   3960: astore #22
/*     */     //   3962: aload #45
/*     */     //   3964: getfield L$11 : Ljava/lang/Object;
/*     */     //   3967: checkcast java/lang/String
/*     */     //   3970: astore #21
/*     */     //   3972: aload #45
/*     */     //   3974: getfield L$10 : Ljava/lang/Object;
/*     */     //   3977: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider
/*     */     //   3980: astore #20
/*     */     //   3982: aload #45
/*     */     //   3984: getfield L$9 : Ljava/lang/Object;
/*     */     //   3987: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   3990: astore #17
/*     */     //   3992: aload #45
/*     */     //   3994: getfield L$8 : Ljava/lang/Object;
/*     */     //   3997: checkcast java/util/List
/*     */     //   4000: astore #12
/*     */     //   4002: aload #45
/*     */     //   4004: getfield L$7 : Ljava/lang/Object;
/*     */     //   4007: checkcast java/util/List
/*     */     //   4010: astore #11
/*     */     //   4012: aload #45
/*     */     //   4014: getfield L$6 : Ljava/lang/Object;
/*     */     //   4017: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*     */     //   4020: astore #9
/*     */     //   4022: aload #45
/*     */     //   4024: getfield L$5 : Ljava/lang/Object;
/*     */     //   4027: checkcast java/util/List
/*     */     //   4030: astore #7
/*     */     //   4032: aload #45
/*     */     //   4034: getfield L$4 : Ljava/lang/Object;
/*     */     //   4037: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   4040: astore #5
/*     */     //   4042: aload #45
/*     */     //   4044: getfield L$3 : Ljava/lang/Object;
/*     */     //   4047: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   4050: astore #4
/*     */     //   4052: aload #45
/*     */     //   4054: getfield L$2 : Ljava/lang/Object;
/*     */     //   4057: checkcast java/util/List
/*     */     //   4060: astore_2
/*     */     //   4061: aload #45
/*     */     //   4063: getfield L$1 : Ljava/lang/Object;
/*     */     //   4066: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentState
/*     */     //   4069: astore_1
/*     */     //   4070: aload #45
/*     */     //   4072: getfield L$0 : Ljava/lang/Object;
/*     */     //   4075: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker
/*     */     //   4078: astore_0
/*     */     //   4079: nop
/*     */     //   4080: aload #44
/*     */     //   4082: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   4085: aload #44
/*     */     //   4087: pop
/*     */     //   4088: aload #4
/*     */     //   4090: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   4095: new com/intellij/ml/llm/matterhorn/ej/core/ActionRequestBuildingFinished
/*     */     //   4098: dup
/*     */     //   4099: iload #13
/*     */     //   4101: aload #23
/*     */     //   4103: invokespecial <init> : (ILcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;)V
/*     */     //   4106: checkcast com/intellij/ml/llm/matterhorn/CustomArtifactEvent
/*     */     //   4109: invokevirtual sendEvent : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)V
/*     */     //   4112: new kotlin/Pair
/*     */     //   4115: dup
/*     */     //   4116: aload #23
/*     */     //   4118: aload #20
/*     */     //   4120: invokeinterface getObservation : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   4125: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   4128: areturn
/*     */     //   4129: astore #23
/*     */     //   4131: aload #4
/*     */     //   4133: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   4138: new com/intellij/ml/llm/matterhorn/ej/core/ActionRequestBuildingFailed
/*     */     //   4141: dup
/*     */     //   4142: iload #13
/*     */     //   4144: new com/intellij/ml/llm/matterhorn/events/SerializableThrowable
/*     */     //   4147: dup
/*     */     //   4148: aload #23
/*     */     //   4150: checkcast java/lang/Throwable
/*     */     //   4153: iconst_1
/*     */     //   4154: invokespecial <init> : (Ljava/lang/Throwable;Z)V
/*     */     //   4157: invokespecial <init> : (ILcom/intellij/ml/llm/matterhorn/events/SerializableThrowable;)V
/*     */     //   4160: checkcast com/intellij/ml/llm/matterhorn/CustomArtifactEvent
/*     */     //   4163: invokevirtual sendEvent : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)V
/*     */     //   4166: aload #23
/*     */     //   4168: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   4171: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   4176: astore #24
/*     */     //   4178: aload #7
/*     */     //   4180: checkcast java/util/Collection
/*     */     //   4183: aload #20
/*     */     //   4185: invokeinterface getObservation : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   4190: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   4195: pop
/*     */     //   4196: aload #7
/*     */     //   4198: checkcast java/util/Collection
/*     */     //   4201: aload_0
/*     */     //   4202: aload #22
/*     */     //   4204: getfield element : Ljava/lang/Object;
/*     */     //   4207: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*     */     //   4210: aload #24
/*     */     //   4212: aload #9
/*     */     //   4214: invokespecial getActionResultElement : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   4217: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   4222: pop
/*     */     //   4223: aload #22
/*     */     //   4225: getfield element : Ljava/lang/Object;
/*     */     //   4228: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*     */     //   4231: astore #26
/*     */     //   4233: aload #26
/*     */     //   4235: dup
/*     */     //   4236: ifnull -> 4252
/*     */     //   4239: invokeinterface getTitle : ()Ljava/lang/String;
/*     */     //   4244: astore #27
/*     */     //   4246: aload #27
/*     */     //   4248: dup
/*     */     //   4249: ifnonnull -> 4256
/*     */     //   4252: pop
/*     */     //   4253: ldc_w ''
/*     */     //   4256: astore #25
/*     */     //   4258: aload #17
/*     */     //   4260: astore #35
/*     */     //   4262: aload_0
/*     */     //   4263: aload #5
/*     */     //   4265: aload #45
/*     */     //   4267: aload #45
/*     */     //   4269: aload_0
/*     */     //   4270: putfield L$0 : Ljava/lang/Object;
/*     */     //   4273: aload #45
/*     */     //   4275: aload_1
/*     */     //   4276: putfield L$1 : Ljava/lang/Object;
/*     */     //   4279: aload #45
/*     */     //   4281: aload_2
/*     */     //   4282: putfield L$2 : Ljava/lang/Object;
/*     */     //   4285: aload #45
/*     */     //   4287: aload #4
/*     */     //   4289: putfield L$3 : Ljava/lang/Object;
/*     */     //   4292: aload #45
/*     */     //   4294: aload #5
/*     */     //   4296: putfield L$4 : Ljava/lang/Object;
/*     */     //   4299: aload #45
/*     */     //   4301: aload #7
/*     */     //   4303: putfield L$5 : Ljava/lang/Object;
/*     */     //   4306: aload #45
/*     */     //   4308: aload #9
/*     */     //   4310: putfield L$6 : Ljava/lang/Object;
/*     */     //   4313: aload #45
/*     */     //   4315: aload #11
/*     */     //   4317: putfield L$7 : Ljava/lang/Object;
/*     */     //   4320: aload #45
/*     */     //   4322: aload #12
/*     */     //   4324: putfield L$8 : Ljava/lang/Object;
/*     */     //   4327: aload #45
/*     */     //   4329: aload #17
/*     */     //   4331: putfield L$9 : Ljava/lang/Object;
/*     */     //   4334: aload #45
/*     */     //   4336: aload #21
/*     */     //   4338: putfield L$10 : Ljava/lang/Object;
/*     */     //   4341: aload #45
/*     */     //   4343: aload #23
/*     */     //   4345: putfield L$11 : Ljava/lang/Object;
/*     */     //   4348: aload #45
/*     */     //   4350: aload #24
/*     */     //   4352: putfield L$12 : Ljava/lang/Object;
/*     */     //   4355: aload #45
/*     */     //   4357: aload #25
/*     */     //   4359: putfield L$13 : Ljava/lang/Object;
/*     */     //   4362: aload #45
/*     */     //   4364: aload #35
/*     */     //   4366: putfield L$14 : Ljava/lang/Object;
/*     */     //   4369: aload #45
/*     */     //   4371: aconst_null
/*     */     //   4372: putfield L$15 : Ljava/lang/Object;
/*     */     //   4375: aload #45
/*     */     //   4377: iload #13
/*     */     //   4379: putfield I$0 : I
/*     */     //   4382: aload #45
/*     */     //   4384: iload #14
/*     */     //   4386: putfield I$1 : I
/*     */     //   4389: aload #45
/*     */     //   4391: bipush #11
/*     */     //   4393: putfield label : I
/*     */     //   4396: invokevirtual getTrajectoryElementAgent : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   4399: dup
/*     */     //   4400: aload #70
/*     */     //   4402: if_acmpne -> 4576
/*     */     //   4405: aload #70
/*     */     //   4407: areturn
/*     */     //   4408: aload #45
/*     */     //   4410: getfield I$1 : I
/*     */     //   4413: istore #14
/*     */     //   4415: aload #45
/*     */     //   4417: getfield I$0 : I
/*     */     //   4420: istore #13
/*     */     //   4422: aload #45
/*     */     //   4424: getfield L$14 : Ljava/lang/Object;
/*     */     //   4427: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   4430: astore #35
/*     */     //   4432: aload #45
/*     */     //   4434: getfield L$13 : Ljava/lang/Object;
/*     */     //   4437: checkcast java/lang/String
/*     */     //   4440: astore #25
/*     */     //   4442: aload #45
/*     */     //   4444: getfield L$12 : Ljava/lang/Object;
/*     */     //   4447: checkcast java/lang/String
/*     */     //   4450: astore #24
/*     */     //   4452: aload #45
/*     */     //   4454: getfield L$11 : Ljava/lang/Object;
/*     */     //   4457: checkcast java/lang/Exception
/*     */     //   4460: astore #23
/*     */     //   4462: aload #45
/*     */     //   4464: getfield L$10 : Ljava/lang/Object;
/*     */     //   4467: checkcast java/lang/String
/*     */     //   4470: astore #21
/*     */     //   4472: aload #45
/*     */     //   4474: getfield L$9 : Ljava/lang/Object;
/*     */     //   4477: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   4480: astore #17
/*     */     //   4482: aload #45
/*     */     //   4484: getfield L$8 : Ljava/lang/Object;
/*     */     //   4487: checkcast java/util/List
/*     */     //   4490: astore #12
/*     */     //   4492: aload #45
/*     */     //   4494: getfield L$7 : Ljava/lang/Object;
/*     */     //   4497: checkcast java/util/List
/*     */     //   4500: astore #11
/*     */     //   4502: aload #45
/*     */     //   4504: getfield L$6 : Ljava/lang/Object;
/*     */     //   4507: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*     */     //   4510: astore #9
/*     */     //   4512: aload #45
/*     */     //   4514: getfield L$5 : Ljava/lang/Object;
/*     */     //   4517: checkcast java/util/List
/*     */     //   4520: astore #7
/*     */     //   4522: aload #45
/*     */     //   4524: getfield L$4 : Ljava/lang/Object;
/*     */     //   4527: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   4530: astore #5
/*     */     //   4532: aload #45
/*     */     //   4534: getfield L$3 : Ljava/lang/Object;
/*     */     //   4537: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   4540: astore #4
/*     */     //   4542: aload #45
/*     */     //   4544: getfield L$2 : Ljava/lang/Object;
/*     */     //   4547: checkcast java/util/List
/*     */     //   4550: astore_2
/*     */     //   4551: aload #45
/*     */     //   4553: getfield L$1 : Ljava/lang/Object;
/*     */     //   4556: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentState
/*     */     //   4559: astore_1
/*     */     //   4560: aload #45
/*     */     //   4562: getfield L$0 : Ljava/lang/Object;
/*     */     //   4565: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker
/*     */     //   4568: astore_0
/*     */     //   4569: aload #44
/*     */     //   4571: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   4574: aload #44
/*     */     //   4576: astore #38
/*     */     //   4578: aload #35
/*     */     //   4580: aload #38
/*     */     //   4582: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElementAgent
/*     */     //   4585: aload #21
/*     */     //   4587: ldc_w ''
/*     */     //   4590: aload #25
/*     */     //   4592: aconst_null
/*     */     //   4593: aconst_null
/*     */     //   4594: invokestatic getASSISTANT_REFLECTION_ROLE : ()Ljava/lang/String;
/*     */     //   4597: astore #55
/*     */     //   4599: astore #56
/*     */     //   4601: astore #57
/*     */     //   4603: astore #58
/*     */     //   4605: astore #59
/*     */     //   4607: astore #60
/*     */     //   4609: astore #61
/*     */     //   4611: new com/intellij/ml/llm/matterhorn/AssistantTrajectoryElement
/*     */     //   4614: dup
/*     */     //   4615: aload #61
/*     */     //   4617: aload #60
/*     */     //   4619: aload #59
/*     */     //   4621: aload #58
/*     */     //   4623: aload #57
/*     */     //   4625: aload #56
/*     */     //   4627: aload #55
/*     */     //   4629: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V
/*     */     //   4632: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElement
/*     */     //   4635: aload #45
/*     */     //   4637: aload #45
/*     */     //   4639: aload_0
/*     */     //   4640: putfield L$0 : Ljava/lang/Object;
/*     */     //   4643: aload #45
/*     */     //   4645: aload_1
/*     */     //   4646: putfield L$1 : Ljava/lang/Object;
/*     */     //   4649: aload #45
/*     */     //   4651: aload_2
/*     */     //   4652: putfield L$2 : Ljava/lang/Object;
/*     */     //   4655: aload #45
/*     */     //   4657: aload #4
/*     */     //   4659: putfield L$3 : Ljava/lang/Object;
/*     */     //   4662: aload #45
/*     */     //   4664: aload #5
/*     */     //   4666: putfield L$4 : Ljava/lang/Object;
/*     */     //   4669: aload #45
/*     */     //   4671: aload #7
/*     */     //   4673: putfield L$5 : Ljava/lang/Object;
/*     */     //   4676: aload #45
/*     */     //   4678: aload #9
/*     */     //   4680: putfield L$6 : Ljava/lang/Object;
/*     */     //   4683: aload #45
/*     */     //   4685: aload #11
/*     */     //   4687: putfield L$7 : Ljava/lang/Object;
/*     */     //   4690: aload #45
/*     */     //   4692: aload #12
/*     */     //   4694: putfield L$8 : Ljava/lang/Object;
/*     */     //   4697: aload #45
/*     */     //   4699: aload #17
/*     */     //   4701: putfield L$9 : Ljava/lang/Object;
/*     */     //   4704: aload #45
/*     */     //   4706: aload #23
/*     */     //   4708: putfield L$10 : Ljava/lang/Object;
/*     */     //   4711: aload #45
/*     */     //   4713: aload #24
/*     */     //   4715: putfield L$11 : Ljava/lang/Object;
/*     */     //   4718: aload #45
/*     */     //   4720: aconst_null
/*     */     //   4721: putfield L$12 : Ljava/lang/Object;
/*     */     //   4724: aload #45
/*     */     //   4726: aconst_null
/*     */     //   4727: putfield L$13 : Ljava/lang/Object;
/*     */     //   4730: aload #45
/*     */     //   4732: aconst_null
/*     */     //   4733: putfield L$14 : Ljava/lang/Object;
/*     */     //   4736: aload #45
/*     */     //   4738: iload #13
/*     */     //   4740: putfield I$0 : I
/*     */     //   4743: aload #45
/*     */     //   4745: iload #14
/*     */     //   4747: putfield I$1 : I
/*     */     //   4750: aload #45
/*     */     //   4752: bipush #12
/*     */     //   4754: putfield label : I
/*     */     //   4757: invokevirtual logTrajectoryElement : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   4760: dup
/*     */     //   4761: aload #70
/*     */     //   4763: if_acmpne -> 4907
/*     */     //   4766: aload #70
/*     */     //   4768: areturn
/*     */     //   4769: aload #45
/*     */     //   4771: getfield I$1 : I
/*     */     //   4774: istore #14
/*     */     //   4776: aload #45
/*     */     //   4778: getfield I$0 : I
/*     */     //   4781: istore #13
/*     */     //   4783: aload #45
/*     */     //   4785: getfield L$11 : Ljava/lang/Object;
/*     */     //   4788: checkcast java/lang/String
/*     */     //   4791: astore #24
/*     */     //   4793: aload #45
/*     */     //   4795: getfield L$10 : Ljava/lang/Object;
/*     */     //   4798: checkcast java/lang/Exception
/*     */     //   4801: astore #23
/*     */     //   4803: aload #45
/*     */     //   4805: getfield L$9 : Ljava/lang/Object;
/*     */     //   4808: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   4811: astore #17
/*     */     //   4813: aload #45
/*     */     //   4815: getfield L$8 : Ljava/lang/Object;
/*     */     //   4818: checkcast java/util/List
/*     */     //   4821: astore #12
/*     */     //   4823: aload #45
/*     */     //   4825: getfield L$7 : Ljava/lang/Object;
/*     */     //   4828: checkcast java/util/List
/*     */     //   4831: astore #11
/*     */     //   4833: aload #45
/*     */     //   4835: getfield L$6 : Ljava/lang/Object;
/*     */     //   4838: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*     */     //   4841: astore #9
/*     */     //   4843: aload #45
/*     */     //   4845: getfield L$5 : Ljava/lang/Object;
/*     */     //   4848: checkcast java/util/List
/*     */     //   4851: astore #7
/*     */     //   4853: aload #45
/*     */     //   4855: getfield L$4 : Ljava/lang/Object;
/*     */     //   4858: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   4861: astore #5
/*     */     //   4863: aload #45
/*     */     //   4865: getfield L$3 : Ljava/lang/Object;
/*     */     //   4868: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   4871: astore #4
/*     */     //   4873: aload #45
/*     */     //   4875: getfield L$2 : Ljava/lang/Object;
/*     */     //   4878: checkcast java/util/List
/*     */     //   4881: astore_2
/*     */     //   4882: aload #45
/*     */     //   4884: getfield L$1 : Ljava/lang/Object;
/*     */     //   4887: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentState
/*     */     //   4890: astore_1
/*     */     //   4891: aload #45
/*     */     //   4893: getfield L$0 : Ljava/lang/Object;
/*     */     //   4896: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker
/*     */     //   4899: astore_0
/*     */     //   4900: aload #44
/*     */     //   4902: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   4905: aload #44
/*     */     //   4907: pop
/*     */     //   4908: aload #17
/*     */     //   4910: astore #35
/*     */     //   4912: aload_0
/*     */     //   4913: aload #5
/*     */     //   4915: aload #45
/*     */     //   4917: aload #45
/*     */     //   4919: aload_0
/*     */     //   4920: putfield L$0 : Ljava/lang/Object;
/*     */     //   4923: aload #45
/*     */     //   4925: aload_1
/*     */     //   4926: putfield L$1 : Ljava/lang/Object;
/*     */     //   4929: aload #45
/*     */     //   4931: aload_2
/*     */     //   4932: putfield L$2 : Ljava/lang/Object;
/*     */     //   4935: aload #45
/*     */     //   4937: aload #4
/*     */     //   4939: putfield L$3 : Ljava/lang/Object;
/*     */     //   4942: aload #45
/*     */     //   4944: aload #5
/*     */     //   4946: putfield L$4 : Ljava/lang/Object;
/*     */     //   4949: aload #45
/*     */     //   4951: aload #7
/*     */     //   4953: putfield L$5 : Ljava/lang/Object;
/*     */     //   4956: aload #45
/*     */     //   4958: aload #9
/*     */     //   4960: putfield L$6 : Ljava/lang/Object;
/*     */     //   4963: aload #45
/*     */     //   4965: aload #11
/*     */     //   4967: putfield L$7 : Ljava/lang/Object;
/*     */     //   4970: aload #45
/*     */     //   4972: aload #12
/*     */     //   4974: putfield L$8 : Ljava/lang/Object;
/*     */     //   4977: aload #45
/*     */     //   4979: aload #23
/*     */     //   4981: putfield L$9 : Ljava/lang/Object;
/*     */     //   4984: aload #45
/*     */     //   4986: aload #24
/*     */     //   4988: putfield L$10 : Ljava/lang/Object;
/*     */     //   4991: aload #45
/*     */     //   4993: aload #35
/*     */     //   4995: putfield L$11 : Ljava/lang/Object;
/*     */     //   4998: aload #45
/*     */     //   5000: iload #13
/*     */     //   5002: putfield I$0 : I
/*     */     //   5005: aload #45
/*     */     //   5007: iload #14
/*     */     //   5009: putfield I$1 : I
/*     */     //   5012: aload #45
/*     */     //   5014: bipush #13
/*     */     //   5016: putfield label : I
/*     */     //   5019: invokevirtual getTrajectoryElementAgent : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   5022: dup
/*     */     //   5023: aload #70
/*     */     //   5025: if_acmpne -> 5169
/*     */     //   5028: aload #70
/*     */     //   5030: areturn
/*     */     //   5031: aload #45
/*     */     //   5033: getfield I$1 : I
/*     */     //   5036: istore #14
/*     */     //   5038: aload #45
/*     */     //   5040: getfield I$0 : I
/*     */     //   5043: istore #13
/*     */     //   5045: aload #45
/*     */     //   5047: getfield L$11 : Ljava/lang/Object;
/*     */     //   5050: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   5053: astore #35
/*     */     //   5055: aload #45
/*     */     //   5057: getfield L$10 : Ljava/lang/Object;
/*     */     //   5060: checkcast java/lang/String
/*     */     //   5063: astore #24
/*     */     //   5065: aload #45
/*     */     //   5067: getfield L$9 : Ljava/lang/Object;
/*     */     //   5070: checkcast java/lang/Exception
/*     */     //   5073: astore #23
/*     */     //   5075: aload #45
/*     */     //   5077: getfield L$8 : Ljava/lang/Object;
/*     */     //   5080: checkcast java/util/List
/*     */     //   5083: astore #12
/*     */     //   5085: aload #45
/*     */     //   5087: getfield L$7 : Ljava/lang/Object;
/*     */     //   5090: checkcast java/util/List
/*     */     //   5093: astore #11
/*     */     //   5095: aload #45
/*     */     //   5097: getfield L$6 : Ljava/lang/Object;
/*     */     //   5100: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*     */     //   5103: astore #9
/*     */     //   5105: aload #45
/*     */     //   5107: getfield L$5 : Ljava/lang/Object;
/*     */     //   5110: checkcast java/util/List
/*     */     //   5113: astore #7
/*     */     //   5115: aload #45
/*     */     //   5117: getfield L$4 : Ljava/lang/Object;
/*     */     //   5120: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   5123: astore #5
/*     */     //   5125: aload #45
/*     */     //   5127: getfield L$3 : Ljava/lang/Object;
/*     */     //   5130: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   5133: astore #4
/*     */     //   5135: aload #45
/*     */     //   5137: getfield L$2 : Ljava/lang/Object;
/*     */     //   5140: checkcast java/util/List
/*     */     //   5143: astore_2
/*     */     //   5144: aload #45
/*     */     //   5146: getfield L$1 : Ljava/lang/Object;
/*     */     //   5149: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentState
/*     */     //   5152: astore_1
/*     */     //   5153: aload #45
/*     */     //   5155: getfield L$0 : Ljava/lang/Object;
/*     */     //   5158: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker
/*     */     //   5161: astore_0
/*     */     //   5162: aload #44
/*     */     //   5164: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   5167: aload #44
/*     */     //   5169: astore #38
/*     */     //   5171: aload #35
/*     */     //   5173: aload #38
/*     */     //   5175: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElementAgent
/*     */     //   5178: aload #24
/*     */     //   5180: invokestatic getUSER_REFLECTION_ROLE : ()Ljava/lang/String;
/*     */     //   5183: iconst_0
/*     */     //   5184: bipush #8
/*     */     //   5186: aconst_null
/*     */     //   5187: astore #62
/*     */     //   5189: istore #63
/*     */     //   5191: istore #64
/*     */     //   5193: astore #65
/*     */     //   5195: astore #66
/*     */     //   5197: astore #67
/*     */     //   5199: new com/intellij/ml/llm/matterhorn/UserTrajectoryElement
/*     */     //   5202: dup
/*     */     //   5203: aload #67
/*     */     //   5205: aload #66
/*     */     //   5207: aload #65
/*     */     //   5209: iconst_0
/*     */     //   5210: iload #63
/*     */     //   5212: aload #62
/*     */     //   5214: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   5217: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElement
/*     */     //   5220: aload #45
/*     */     //   5222: aload #45
/*     */     //   5224: aload_0
/*     */     //   5225: putfield L$0 : Ljava/lang/Object;
/*     */     //   5228: aload #45
/*     */     //   5230: aload_1
/*     */     //   5231: putfield L$1 : Ljava/lang/Object;
/*     */     //   5234: aload #45
/*     */     //   5236: aload_2
/*     */     //   5237: putfield L$2 : Ljava/lang/Object;
/*     */     //   5240: aload #45
/*     */     //   5242: aload #4
/*     */     //   5244: putfield L$3 : Ljava/lang/Object;
/*     */     //   5247: aload #45
/*     */     //   5249: aload #5
/*     */     //   5251: putfield L$4 : Ljava/lang/Object;
/*     */     //   5254: aload #45
/*     */     //   5256: aload #7
/*     */     //   5258: putfield L$5 : Ljava/lang/Object;
/*     */     //   5261: aload #45
/*     */     //   5263: aload #9
/*     */     //   5265: putfield L$6 : Ljava/lang/Object;
/*     */     //   5268: aload #45
/*     */     //   5270: aload #11
/*     */     //   5272: putfield L$7 : Ljava/lang/Object;
/*     */     //   5275: aload #45
/*     */     //   5277: aload #12
/*     */     //   5279: putfield L$8 : Ljava/lang/Object;
/*     */     //   5282: aload #45
/*     */     //   5284: aload #23
/*     */     //   5286: putfield L$9 : Ljava/lang/Object;
/*     */     //   5289: aload #45
/*     */     //   5291: aconst_null
/*     */     //   5292: putfield L$10 : Ljava/lang/Object;
/*     */     //   5295: aload #45
/*     */     //   5297: aconst_null
/*     */     //   5298: putfield L$11 : Ljava/lang/Object;
/*     */     //   5301: aload #45
/*     */     //   5303: iload #13
/*     */     //   5305: putfield I$0 : I
/*     */     //   5308: aload #45
/*     */     //   5310: iload #14
/*     */     //   5312: putfield I$1 : I
/*     */     //   5315: aload #45
/*     */     //   5317: bipush #14
/*     */     //   5319: putfield label : I
/*     */     //   5322: invokevirtual logTrajectoryElement : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   5325: dup
/*     */     //   5326: aload #70
/*     */     //   5328: if_acmpne -> 5452
/*     */     //   5331: aload #70
/*     */     //   5333: areturn
/*     */     //   5334: aload #45
/*     */     //   5336: getfield I$1 : I
/*     */     //   5339: istore #14
/*     */     //   5341: aload #45
/*     */     //   5343: getfield I$0 : I
/*     */     //   5346: istore #13
/*     */     //   5348: aload #45
/*     */     //   5350: getfield L$9 : Ljava/lang/Object;
/*     */     //   5353: checkcast java/lang/Exception
/*     */     //   5356: astore #23
/*     */     //   5358: aload #45
/*     */     //   5360: getfield L$8 : Ljava/lang/Object;
/*     */     //   5363: checkcast java/util/List
/*     */     //   5366: astore #12
/*     */     //   5368: aload #45
/*     */     //   5370: getfield L$7 : Ljava/lang/Object;
/*     */     //   5373: checkcast java/util/List
/*     */     //   5376: astore #11
/*     */     //   5378: aload #45
/*     */     //   5380: getfield L$6 : Ljava/lang/Object;
/*     */     //   5383: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*     */     //   5386: astore #9
/*     */     //   5388: aload #45
/*     */     //   5390: getfield L$5 : Ljava/lang/Object;
/*     */     //   5393: checkcast java/util/List
/*     */     //   5396: astore #7
/*     */     //   5398: aload #45
/*     */     //   5400: getfield L$4 : Ljava/lang/Object;
/*     */     //   5403: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   5406: astore #5
/*     */     //   5408: aload #45
/*     */     //   5410: getfield L$3 : Ljava/lang/Object;
/*     */     //   5413: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   5416: astore #4
/*     */     //   5418: aload #45
/*     */     //   5420: getfield L$2 : Ljava/lang/Object;
/*     */     //   5423: checkcast java/util/List
/*     */     //   5426: astore_2
/*     */     //   5427: aload #45
/*     */     //   5429: getfield L$1 : Ljava/lang/Object;
/*     */     //   5432: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentState
/*     */     //   5435: astore_1
/*     */     //   5436: aload #45
/*     */     //   5438: getfield L$0 : Ljava/lang/Object;
/*     */     //   5441: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker
/*     */     //   5444: astore_0
/*     */     //   5445: aload #44
/*     */     //   5447: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   5450: aload #44
/*     */     //   5452: pop
/*     */     //   5453: aload #23
/*     */     //   5455: astore #8
/*     */     //   5457: iinc #13, 1
/*     */     //   5460: goto -> 505
/*     */     //   5463: aload_0
/*     */     //   5464: aload #5
/*     */     //   5466: aload #45
/*     */     //   5468: aload #45
/*     */     //   5470: aload #8
/*     */     //   5472: putfield L$0 : Ljava/lang/Object;
/*     */     //   5475: aload #45
/*     */     //   5477: aconst_null
/*     */     //   5478: putfield L$1 : Ljava/lang/Object;
/*     */     //   5481: aload #45
/*     */     //   5483: aconst_null
/*     */     //   5484: putfield L$2 : Ljava/lang/Object;
/*     */     //   5487: aload #45
/*     */     //   5489: aconst_null
/*     */     //   5490: putfield L$3 : Ljava/lang/Object;
/*     */     //   5493: aload #45
/*     */     //   5495: aconst_null
/*     */     //   5496: putfield L$4 : Ljava/lang/Object;
/*     */     //   5499: aload #45
/*     */     //   5501: aconst_null
/*     */     //   5502: putfield L$5 : Ljava/lang/Object;
/*     */     //   5505: aload #45
/*     */     //   5507: aconst_null
/*     */     //   5508: putfield L$6 : Ljava/lang/Object;
/*     */     //   5511: aload #45
/*     */     //   5513: aconst_null
/*     */     //   5514: putfield L$7 : Ljava/lang/Object;
/*     */     //   5517: aload #45
/*     */     //   5519: aconst_null
/*     */     //   5520: putfield L$8 : Ljava/lang/Object;
/*     */     //   5523: aload #45
/*     */     //   5525: aconst_null
/*     */     //   5526: putfield L$9 : Ljava/lang/Object;
/*     */     //   5529: aload #45
/*     */     //   5531: bipush #15
/*     */     //   5533: putfield label : I
/*     */     //   5536: invokevirtual getAgentParameters : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   5539: dup
/*     */     //   5540: aload #70
/*     */     //   5542: if_acmpne -> 5565
/*     */     //   5545: aload #70
/*     */     //   5547: areturn
/*     */     //   5548: aload #45
/*     */     //   5550: getfield L$0 : Ljava/lang/Object;
/*     */     //   5553: checkcast java/lang/Exception
/*     */     //   5556: astore #8
/*     */     //   5558: aload #44
/*     */     //   5560: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   5563: aload #44
/*     */     //   5565: astore #37
/*     */     //   5567: aload #37
/*     */     //   5569: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*     */     //   5572: invokevirtual getNumReflections : ()I
/*     */     //   5575: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */     //   5580: aload #8
/*     */     //   5582: checkcast java/lang/Throwable
/*     */     //   5585: astore #68
/*     */     //   5587: astore #69
/*     */     //   5589: new com/intellij/ml/llm/matterhorn/TooManyAttemptsWithoutSuccessException
/*     */     //   5592: dup
/*     */     //   5593: aload #69
/*     */     //   5595: aload #68
/*     */     //   5597: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   5600: athrow
/*     */     //   5601: new java/lang/IllegalStateException
/*     */     //   5604: dup
/*     */     //   5605: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   5607: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   5610: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #438	-> 63
/*     */     //   #445	-> 153
/*     */     //   #445	-> 163
/*     */     //   #446	-> 165
/*     */     //   #448	-> 174
/*     */     //   #438	-> 246
/*     */     //   #450	-> 337
/*     */     //   #837	-> 346
/*     */     //   #838	-> 355
/*     */     //   #839	-> 364
/*     */     //   #840	-> 392
/*     */     //   #451	-> 402
/*     */     //   #840	-> 437
/*     */     //   #841	-> 440
/*     */     //   #843	-> 451
/*     */     //   #846	-> 462
/*     */     //   #450	-> 473
/*     */     //   #454	-> 495
/*     */     //   #455	-> 512
/*     */     //   #456	-> 534
/*     */     //   #847	-> 549
/*     */     //   #848	-> 575
/*     */     //   #849	-> 603
/*     */     //   #456	-> 617
/*     */     //   #849	-> 628
/*     */     //   #850	-> 637
/*     */     //   #847	-> 642
/*     */     //   #457	-> 646
/*     */     //   #456	-> 656
/*     */     //   #458	-> 662
/*     */     //   #851	-> 674
/*     */     //   #852	-> 700
/*     */     //   #853	-> 728
/*     */     //   #458	-> 742
/*     */     //   #853	-> 753
/*     */     //   #854	-> 762
/*     */     //   #851	-> 767
/*     */     //   #456	-> 777
/*     */     //   #459	-> 783
/*     */     //   #456	-> 790
/*     */     //   #461	-> 796
/*     */     //   #462	-> 813
/*     */     //   #461	-> 818
/*     */     //   #463	-> 821
/*     */     //   #461	-> 826
/*     */     //   #464	-> 829
/*     */     //   #461	-> 834
/*     */     //   #465	-> 837
/*     */     //   #461	-> 842
/*     */     //   #460	-> 844
/*     */     //   #456	-> 850
/*     */     //   #466	-> 856
/*     */     //   #855	-> 868
/*     */     //   #856	-> 894
/*     */     //   #857	-> 922
/*     */     //   #466	-> 936
/*     */     //   #857	-> 947
/*     */     //   #858	-> 956
/*     */     //   #855	-> 961
/*     */     //   #456	-> 971
/*     */     //   #466	-> 977
/*     */     //   #456	-> 982
/*     */     //   #468	-> 987
/*     */     //   #469	-> 991
/*     */     //   #470	-> 999
/*     */     //   #471	-> 1001
/*     */     //   #472	-> 1006
/*     */     //   #473	-> 1011
/*     */     //   #468	-> 1012
/*     */     //   #485	-> 1032
/*     */     //   #486	-> 1041
/*     */     //   #438	-> 1143
/*     */     //   #487	-> 1269
/*     */     //   #438	-> 1377
/*     */     //   #488	-> 1513
/*     */     //   #489	-> 1514
/*     */     //   #490	-> 1539
/*     */     //   #488	-> 1553
/*     */     //   #492	-> 1555
/*     */     //   #493	-> 1564
/*     */     //   #494	-> 1573
/*     */     //   #495	-> 1574
/*     */     //   #438	-> 1711
/*     */     //   #496	-> 1882
/*     */     //   #497	-> 1889
/*     */     //   #438	-> 2017
/*     */     //   #497	-> 2169
/*     */     //   #828	-> 2213
/*     */     //   #497	-> 2216
/*     */     //   #497	-> 2239
/*     */     //   #497	-> 2248
/*     */     //   #498	-> 2251
/*     */     //   #501	-> 2277
/*     */     //   #438	-> 2410
/*     */     //   #502	-> 2567
/*     */     //   #438	-> 2718
/*     */     //   #502	-> 2900
/*     */     //   #438	-> 3052
/*     */     //   #504	-> 3219
/*     */     //   #505	-> 3221
/*     */     //   #506	-> 3223
/*     */     //   #438	-> 3367
/*     */     //   #507	-> 3558
/*     */     //   #508	-> 3560
/*     */     //   #509	-> 3567
/*     */     //   #510	-> 3574
/*     */     //   #859	-> 3609
/*     */     //   #860	-> 3635
/*     */     //   #861	-> 3663
/*     */     //   #510	-> 3677
/*     */     //   #861	-> 3688
/*     */     //   #862	-> 3697
/*     */     //   #859	-> 3702
/*     */     //   #510	-> 3720
/*     */     //   #511	-> 3722
/*     */     //   #505	-> 3736
/*     */     //   #504	-> 3788
/*     */     //   #438	-> 3925
/*     */     //   #515	-> 4087
/*     */     //   #516	-> 4095
/*     */     //   #517	-> 4099
/*     */     //   #518	-> 4101
/*     */     //   #516	-> 4103
/*     */     //   #515	-> 4109
/*     */     //   #521	-> 4112
/*     */     //   #522	-> 4129
/*     */     //   #523	-> 4131
/*     */     //   #524	-> 4144
/*     */     //   #523	-> 4157
/*     */     //   #525	-> 4166
/*     */     //   #526	-> 4178
/*     */     //   #527	-> 4196
/*     */     //   #528	-> 4223
/*     */     //   #529	-> 4258
/*     */     //   #530	-> 4260
/*     */     //   #531	-> 4262
/*     */     //   #438	-> 4405
/*     */     //   #532	-> 4585
/*     */     //   #533	-> 4587
/*     */     //   #534	-> 4590
/*     */     //   #535	-> 4592
/*     */     //   #536	-> 4593
/*     */     //   #537	-> 4594
/*     */     //   #530	-> 4597
/*     */     //   #529	-> 4637
/*     */     //   #438	-> 4766
/*     */     //   #540	-> 4907
/*     */     //   #541	-> 4910
/*     */     //   #542	-> 4912
/*     */     //   #438	-> 5028
/*     */     //   #543	-> 5178
/*     */     //   #544	-> 5180
/*     */     //   #541	-> 5183
/*     */     //   #540	-> 5222
/*     */     //   #438	-> 5331
/*     */     //   #547	-> 5452
/*     */     //   #454	-> 5457
/*     */     //   #550	-> 5463
/*     */     //   #551	-> 5463
/*     */     //   #438	-> 5545
/*     */     //   #551	-> 5565
/*     */     //   #552	-> 5580
/*     */     //   #550	-> 5585
/*     */     //   #438	-> 5601
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   153	96	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   325	112	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   437	36	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   473	39	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   512	110	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   622	21	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   643	104	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   747	21	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   768	378	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   1257	123	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   1501	213	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   1865	155	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   2161	78	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   2239	9	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   2248	165	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   2554	167	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   2892	163	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   3206	164	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   3541	141	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   3682	21	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   3703	225	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   4079	50	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   4129	67	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   4196	27	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   4223	185	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   4569	200	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   4900	131	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   5162	172	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   5445	94	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   153	96	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   316	121	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   437	36	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   473	39	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   512	110	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   622	21	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   643	104	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   747	21	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   768	378	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   1248	132	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   1492	222	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   1856	164	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   2152	87	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   2239	9	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   2248	165	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   2545	176	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   2883	172	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   3197	173	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   3532	150	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   3682	21	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   3703	225	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   4070	59	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   4129	67	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   4196	27	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   4223	185	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   4560	209	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   4891	140	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   5153	181	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   5436	27	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   153	96	2	tools	Ljava/util/List;
/*     */     //   307	130	2	tools	Ljava/util/List;
/*     */     //   437	36	2	tools	Ljava/util/List;
/*     */     //   473	39	2	tools	Ljava/util/List;
/*     */     //   512	110	2	tools	Ljava/util/List;
/*     */     //   622	21	2	tools	Ljava/util/List;
/*     */     //   643	104	2	tools	Ljava/util/List;
/*     */     //   747	21	2	tools	Ljava/util/List;
/*     */     //   768	378	2	tools	Ljava/util/List;
/*     */     //   1239	141	2	tools	Ljava/util/List;
/*     */     //   1483	231	2	tools	Ljava/util/List;
/*     */     //   1847	173	2	tools	Ljava/util/List;
/*     */     //   2143	96	2	tools	Ljava/util/List;
/*     */     //   2239	9	2	tools	Ljava/util/List;
/*     */     //   2248	165	2	tools	Ljava/util/List;
/*     */     //   2536	185	2	tools	Ljava/util/List;
/*     */     //   2874	181	2	tools	Ljava/util/List;
/*     */     //   3188	182	2	tools	Ljava/util/List;
/*     */     //   3523	159	2	tools	Ljava/util/List;
/*     */     //   3682	21	2	tools	Ljava/util/List;
/*     */     //   3703	225	2	tools	Ljava/util/List;
/*     */     //   4061	68	2	tools	Ljava/util/List;
/*     */     //   4129	67	2	tools	Ljava/util/List;
/*     */     //   4196	27	2	tools	Ljava/util/List;
/*     */     //   4223	185	2	tools	Ljava/util/List;
/*     */     //   4551	218	2	tools	Ljava/util/List;
/*     */     //   4882	149	2	tools	Ljava/util/List;
/*     */     //   5144	190	2	tools	Ljava/util/List;
/*     */     //   5427	36	2	tools	Ljava/util/List;
/*     */     //   153	96	3	observationsProcessed	Ljava/util/List;
/*     */     //   298	45	3	observationsProcessed	Ljava/util/List;
/*     */     //   153	96	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   289	148	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   437	36	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   473	39	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   512	110	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   622	21	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   643	104	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   747	21	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   768	378	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1230	150	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1474	240	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1838	182	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   2134	105	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   2239	9	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   2248	165	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   2527	194	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   2865	190	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   3179	191	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   3514	168	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   3682	21	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   3703	225	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   4052	77	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   4129	67	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   4196	27	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   4223	185	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   4542	227	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   4873	158	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   5135	199	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   5418	45	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   153	96	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   279	158	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   437	36	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   473	39	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   512	110	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   622	21	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   643	104	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   747	21	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   768	378	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   1220	160	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   1464	250	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   1828	192	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   2124	115	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   2239	9	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   2248	165	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   2517	204	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   2855	200	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   3169	201	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   3504	178	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   3682	21	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   3703	225	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   4042	87	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   4129	67	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   4196	27	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   4223	185	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   4532	237	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   4863	168	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   5125	209	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   5408	131	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   165	84	7	additionalMessages	Ljava/util/List;
/*     */     //   269	168	7	additionalMessages	Ljava/util/List;
/*     */     //   437	36	7	additionalMessages	Ljava/util/List;
/*     */     //   473	39	7	additionalMessages	Ljava/util/List;
/*     */     //   512	110	7	additionalMessages	Ljava/util/List;
/*     */     //   622	21	7	additionalMessages	Ljava/util/List;
/*     */     //   643	104	7	additionalMessages	Ljava/util/List;
/*     */     //   747	21	7	additionalMessages	Ljava/util/List;
/*     */     //   768	378	7	additionalMessages	Ljava/util/List;
/*     */     //   1210	170	7	additionalMessages	Ljava/util/List;
/*     */     //   1454	260	7	additionalMessages	Ljava/util/List;
/*     */     //   1818	202	7	additionalMessages	Ljava/util/List;
/*     */     //   2114	125	7	additionalMessages	Ljava/util/List;
/*     */     //   2239	9	7	additionalMessages	Ljava/util/List;
/*     */     //   2248	165	7	additionalMessages	Ljava/util/List;
/*     */     //   2507	214	7	additionalMessages	Ljava/util/List;
/*     */     //   2845	210	7	additionalMessages	Ljava/util/List;
/*     */     //   3159	211	7	additionalMessages	Ljava/util/List;
/*     */     //   3494	188	7	additionalMessages	Ljava/util/List;
/*     */     //   3682	21	7	additionalMessages	Ljava/util/List;
/*     */     //   3703	225	7	additionalMessages	Ljava/util/List;
/*     */     //   4032	97	7	additionalMessages	Ljava/util/List;
/*     */     //   4129	67	7	additionalMessages	Ljava/util/List;
/*     */     //   4196	27	7	additionalMessages	Ljava/util/List;
/*     */     //   4223	185	7	additionalMessages	Ljava/util/List;
/*     */     //   4522	247	7	additionalMessages	Ljava/util/List;
/*     */     //   4853	178	7	additionalMessages	Ljava/util/List;
/*     */     //   5115	219	7	additionalMessages	Ljava/util/List;
/*     */     //   5398	65	7	additionalMessages	Ljava/util/List;
/*     */     //   174	75	8	error	Ljava/lang/Exception;
/*     */     //   259	178	8	error	Ljava/lang/Exception;
/*     */     //   437	36	8	error	Ljava/lang/Exception;
/*     */     //   473	39	8	error	Ljava/lang/Exception;
/*     */     //   5457	91	8	error	Ljava/lang/Exception;
/*     */     //   5558	43	8	error	Ljava/lang/Exception;
/*     */     //   337	100	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   437	36	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   473	39	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   512	110	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   622	21	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   643	104	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   747	21	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   768	378	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   1200	180	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   1444	270	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   1808	212	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   2104	135	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   2239	9	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   2248	165	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   2497	224	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   2835	220	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   3149	221	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   3484	198	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   3682	21	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   3703	225	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   4022	107	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   4129	67	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   4196	27	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   4223	185	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   4512	257	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   4843	188	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   5105	229	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   5388	75	9	params	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   343	30	11	$this$partition$iv	Ljava/lang/Iterable;
/*     */     //   485	27	11	prevTasksMessages	Ljava/util/List;
/*     */     //   512	110	11	prevTasksMessages	Ljava/util/List;
/*     */     //   622	21	11	prevTasksMessages	Ljava/util/List;
/*     */     //   643	104	11	prevTasksMessages	Ljava/util/List;
/*     */     //   747	21	11	prevTasksMessages	Ljava/util/List;
/*     */     //   768	378	11	prevTasksMessages	Ljava/util/List;
/*     */     //   1190	190	11	prevTasksMessages	Ljava/util/List;
/*     */     //   1434	280	11	prevTasksMessages	Ljava/util/List;
/*     */     //   1798	222	11	prevTasksMessages	Ljava/util/List;
/*     */     //   2094	145	11	prevTasksMessages	Ljava/util/List;
/*     */     //   2239	9	11	prevTasksMessages	Ljava/util/List;
/*     */     //   2248	165	11	prevTasksMessages	Ljava/util/List;
/*     */     //   2487	234	11	prevTasksMessages	Ljava/util/List;
/*     */     //   2825	230	11	prevTasksMessages	Ljava/util/List;
/*     */     //   3139	231	11	prevTasksMessages	Ljava/util/List;
/*     */     //   3474	208	11	prevTasksMessages	Ljava/util/List;
/*     */     //   3682	21	11	prevTasksMessages	Ljava/util/List;
/*     */     //   3703	225	11	prevTasksMessages	Ljava/util/List;
/*     */     //   4012	117	11	prevTasksMessages	Ljava/util/List;
/*     */     //   4129	67	11	prevTasksMessages	Ljava/util/List;
/*     */     //   4196	27	11	prevTasksMessages	Ljava/util/List;
/*     */     //   4223	185	11	prevTasksMessages	Ljava/util/List;
/*     */     //   4502	267	11	prevTasksMessages	Ljava/util/List;
/*     */     //   4833	198	11	prevTasksMessages	Ljava/util/List;
/*     */     //   5095	239	11	prevTasksMessages	Ljava/util/List;
/*     */     //   5378	85	11	prevTasksMessages	Ljava/util/List;
/*     */     //   495	17	12	observationsWithoutPrevTasks	Ljava/util/List;
/*     */     //   512	110	12	observationsWithoutPrevTasks	Ljava/util/List;
/*     */     //   622	21	12	observationsWithoutPrevTasks	Ljava/util/List;
/*     */     //   643	104	12	observationsWithoutPrevTasks	Ljava/util/List;
/*     */     //   747	21	12	observationsWithoutPrevTasks	Ljava/util/List;
/*     */     //   768	378	12	observationsWithoutPrevTasks	Ljava/util/List;
/*     */     //   1180	200	12	observationsWithoutPrevTasks	Ljava/util/List;
/*     */     //   1424	290	12	observationsWithoutPrevTasks	Ljava/util/List;
/*     */     //   1788	232	12	observationsWithoutPrevTasks	Ljava/util/List;
/*     */     //   2084	155	12	observationsWithoutPrevTasks	Ljava/util/List;
/*     */     //   2239	9	12	observationsWithoutPrevTasks	Ljava/util/List;
/*     */     //   2248	165	12	observationsWithoutPrevTasks	Ljava/util/List;
/*     */     //   2477	244	12	observationsWithoutPrevTasks	Ljava/util/List;
/*     */     //   2815	240	12	observationsWithoutPrevTasks	Ljava/util/List;
/*     */     //   3129	241	12	observationsWithoutPrevTasks	Ljava/util/List;
/*     */     //   3464	218	12	observationsWithoutPrevTasks	Ljava/util/List;
/*     */     //   3682	21	12	observationsWithoutPrevTasks	Ljava/util/List;
/*     */     //   3703	225	12	observationsWithoutPrevTasks	Ljava/util/List;
/*     */     //   4002	127	12	observationsWithoutPrevTasks	Ljava/util/List;
/*     */     //   4129	67	12	observationsWithoutPrevTasks	Ljava/util/List;
/*     */     //   4196	27	12	observationsWithoutPrevTasks	Ljava/util/List;
/*     */     //   4223	185	12	observationsWithoutPrevTasks	Ljava/util/List;
/*     */     //   4492	277	12	observationsWithoutPrevTasks	Ljava/util/List;
/*     */     //   4823	208	12	observationsWithoutPrevTasks	Ljava/util/List;
/*     */     //   5085	249	12	observationsWithoutPrevTasks	Ljava/util/List;
/*     */     //   5368	95	12	observationsWithoutPrevTasks	Ljava/util/List;
/*     */     //   355	118	13	first$iv	Ljava/util/ArrayList;
/*     */     //   498	14	13	attempt	I
/*     */     //   512	110	13	attempt	I
/*     */     //   622	21	13	attempt	I
/*     */     //   643	104	13	attempt	I
/*     */     //   747	21	13	attempt	I
/*     */     //   768	378	13	attempt	I
/*     */     //   1160	220	13	attempt	I
/*     */     //   1394	320	13	attempt	I
/*     */     //   1728	292	13	attempt	I
/*     */     //   2034	205	13	attempt	I
/*     */     //   2239	9	13	attempt	I
/*     */     //   2248	165	13	attempt	I
/*     */     //   2427	294	13	attempt	I
/*     */     //   2735	320	13	attempt	I
/*     */     //   3069	301	13	attempt	I
/*     */     //   3384	298	13	attempt	I
/*     */     //   3682	21	13	attempt	I
/*     */     //   3703	225	13	attempt	I
/*     */     //   3942	187	13	attempt	I
/*     */     //   4129	67	13	attempt	I
/*     */     //   4196	27	13	attempt	I
/*     */     //   4223	185	13	attempt	I
/*     */     //   4422	347	13	attempt	I
/*     */     //   4783	248	13	attempt	I
/*     */     //   5045	289	13	attempt	I
/*     */     //   5348	115	13	attempt	I
/*     */     //   364	109	14	second$iv	Ljava/util/ArrayList;
/*     */     //   987	14	15	llmInputObservations	Ljava/util/List;
/*     */     //   392	67	16	element$iv	Ljava/lang/Object;
/*     */     //   546	26	16	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   671	26	16	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   865	26	16	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   1032	105	16	request	Lcom/intellij/ml/llm/matterhorn/requests/MultiChoiceRequest;
/*     */     //   399	37	17	message	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   1041	105	17	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1170	210	17	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1414	300	17	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1778	242	17	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   2074	165	17	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   2239	9	17	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   2248	165	17	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   2467	254	17	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   2805	250	17	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   3119	251	17	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   3454	228	17	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   3682	21	17	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   3703	225	17	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   3992	137	17	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   4129	67	17	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   4196	27	17	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   4223	185	17	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   4482	287	17	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   4813	97	17	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   572	12	18	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   697	12	18	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   891	12	18	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   1269	111	18	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*     */     //   1404	135	18	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*     */     //   1539	14	18	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*     */     //   572	67	19	destination$iv$iv	Ljava/util/Collection;
/*     */     //   697	67	19	destination$iv$iv	Ljava/util/Collection;
/*     */     //   891	67	19	destination$iv$iv	Ljava/util/Collection;
/*     */     //   1513	26	19	availableActions	Ljava/util/List;
/*     */     //   1539	14	19	availableActions	Ljava/util/List;
/*     */     //   1555	159	20	actionProvider	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider;
/*     */     //   1768	252	20	actionProvider	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider;
/*     */     //   2064	175	20	actionProvider	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider;
/*     */     //   2239	9	20	actionProvider	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider;
/*     */     //   2248	165	20	actionProvider	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider;
/*     */     //   2457	264	20	actionProvider	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider;
/*     */     //   2795	260	20	actionProvider	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider;
/*     */     //   3109	261	20	actionProvider	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider;
/*     */     //   3444	238	20	actionProvider	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider;
/*     */     //   3682	21	20	actionProvider	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider;
/*     */     //   3703	225	20	actionProvider	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider;
/*     */     //   3982	147	20	actionProvider	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider;
/*     */     //   4129	67	20	actionProvider	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionProvider;
/*     */     //   1564	150	21	actionString	Ljava/lang/String;
/*     */     //   1758	262	21	actionString	Ljava/lang/String;
/*     */     //   2054	185	21	actionString	Ljava/lang/String;
/*     */     //   2239	9	21	actionString	Ljava/lang/String;
/*     */     //   2248	165	21	actionString	Ljava/lang/String;
/*     */     //   2447	274	21	actionString	Ljava/lang/String;
/*     */     //   2785	270	21	actionString	Ljava/lang/String;
/*     */     //   3099	271	21	actionString	Ljava/lang/String;
/*     */     //   3434	248	21	actionString	Ljava/lang/String;
/*     */     //   3682	21	21	actionString	Ljava/lang/String;
/*     */     //   3703	225	21	actionString	Ljava/lang/String;
/*     */     //   3972	157	21	actionString	Ljava/lang/String;
/*     */     //   4129	67	21	actionString	Ljava/lang/String;
/*     */     //   4196	27	21	actionString	Ljava/lang/String;
/*     */     //   4223	185	21	actionString	Ljava/lang/String;
/*     */     //   4472	115	21	actionString	Ljava/lang/String;
/*     */     //   603	31	22	item$iv$iv	Ljava/lang/Object;
/*     */     //   728	31	22	item$iv$iv	Ljava/lang/Object;
/*     */     //   922	31	22	item$iv$iv	Ljava/lang/Object;
/*     */     //   1573	141	22	parsedAction	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   1748	272	22	parsedAction	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   2044	195	22	parsedAction	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   2239	9	22	parsedAction	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   2248	165	22	parsedAction	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   2437	284	22	parsedAction	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   2775	280	22	parsedAction	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   3089	281	22	parsedAction	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   3424	258	22	parsedAction	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   3682	21	22	parsedAction	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   3703	225	22	parsedAction	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   3962	167	22	parsedAction	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   4129	67	22	parsedAction	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   4196	27	22	parsedAction	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   4223	10	22	parsedAction	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   614	8	23	it	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   739	8	23	it	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   933	8	23	it	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   2567	154	23	actionRequest	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   2765	290	23	actionRequest	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   3079	291	23	actionRequest	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   3414	268	23	actionRequest	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   3682	21	23	actionRequest	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   3703	225	23	actionRequest	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   3952	177	23	actionRequest	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   4131	65	23	e	Ljava/lang/Exception;
/*     */     //   4196	27	23	e	Ljava/lang/Exception;
/*     */     //   4223	185	23	e	Ljava/lang/Exception;
/*     */     //   4462	307	23	e	Ljava/lang/Exception;
/*     */     //   4803	228	23	e	Ljava/lang/Exception;
/*     */     //   5075	259	23	e	Ljava/lang/Exception;
/*     */     //   5358	99	23	e	Ljava/lang/Exception;
/*     */     //   3219	151	24	critiqueResponse	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse;
/*     */     //   3404	278	24	critiqueResponse	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse;
/*     */     //   3682	21	24	critiqueResponse	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse;
/*     */     //   3703	31	24	critiqueResponse	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse;
/*     */     //   4178	18	24	errorMsg	Ljava/lang/String;
/*     */     //   4196	27	24	errorMsg	Ljava/lang/String;
/*     */     //   4223	185	24	errorMsg	Ljava/lang/String;
/*     */     //   4452	317	24	errorMsg	Ljava/lang/String;
/*     */     //   4793	238	24	errorMsg	Ljava/lang/String;
/*     */     //   5065	115	24	errorMsg	Ljava/lang/String;
/*     */     //   4258	150	25	parsedActionTitle	Ljava/lang/String;
/*     */     //   4442	150	25	parsedActionTitle	Ljava/lang/String;
/*     */     //   3606	26	26	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   2213	26	27	it	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;
/*     */     //   3632	12	28	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   3632	67	29	destination$iv$iv	Ljava/util/Collection;
/*     */     //   3663	31	32	item$iv$iv	Ljava/lang/Object;
/*     */     //   3674	8	33	it	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   402	35	18	$i$a$-partition-AbstractIssueSingleStepAgentWorker$produceActionRequestWithReflection$2	I
/*     */     //   346	127	12	$i$f$partition	I
/*     */     //   617	5	24	$i$a$-map-AbstractIssueSingleStepAgentWorker$produceActionRequestWithReflection$llmInputObservations$1	I
/*     */     //   575	64	20	$i$f$mapTo	I
/*     */     //   549	94	17	$i$f$map	I
/*     */     //   742	5	24	$i$a$-map-AbstractIssueSingleStepAgentWorker$produceActionRequestWithReflection$llmInputObservations$2	I
/*     */     //   700	64	20	$i$f$mapTo	I
/*     */     //   674	94	17	$i$f$map	I
/*     */     //   936	5	24	$i$a$-map-AbstractIssueSingleStepAgentWorker$produceActionRequestWithReflection$llmInputObservations$3	I
/*     */     //   894	64	20	$i$f$mapTo	I
/*     */     //   868	94	17	$i$f$map	I
/*     */     //   2216	23	28	$i$a$-find-AbstractIssueSingleStepAgentWorker$produceActionRequestWithReflection$3	I
/*     */     //   3677	5	34	$i$a$-map-AbstractIssueSingleStepAgentWorker$produceActionRequestWithReflection$4	I
/*     */     //   3635	64	30	$i$f$mapTo	I
/*     */     //   3609	94	27	$i$f$map	I
/*     */     //   0	5611	6	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	5548	45	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	5541	44	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   1573	1705	4129	java/lang/Exception
/*     */     //   1865	2011	4129	java/lang/Exception
/*     */     //   2161	2404	4129	java/lang/Exception
/*     */     //   2554	2712	4129	java/lang/Exception
/*     */     //   2892	3046	4129	java/lang/Exception
/*     */     //   3206	3361	4129	java/lang/Exception
/*     */     //   3541	3919	4129	java/lang/Exception
/*     */     //   4079	4129	4129	java/lang/Exception
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "AbstractIssueSingleStepAgentWorker.kt", l = {476}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueSingleStepAgentWorker$produceActionRequestWithReflection$request$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\b\022\004\022\0020\0020\0012\006\020\003\032\0020\0042\f\020\005\032\b\022\004\022\0020\0020\001H\n"}, d2 = {"<anonymous>", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "executionContext", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "optionsToRank"})
/*     */   static final class AbstractIssueSingleStepAgentWorker$produceActionRequestWithReflection$request$1
/*     */     extends SuspendLambda
/*     */     implements Function3<ExecutionContext, List<? extends MatterhornChatElement>, Continuation<? super List<? extends MatterhornChatElement>>, Object>
/*     */   {
/*     */     int label;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     AbstractIssueSingleStepAgentWorker$produceActionRequestWithReflection$request$1(int $attempt, AgentState $currentState, Continuation $completion) {
/*     */       super(3, $completion);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       ExecutionContext executionContext;
/*     */       List optionsToRank;
/* 474 */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); executionContext = (ExecutionContext)this.L$0; optionsToRank = (List)this.L$1;
/*     */           
/* 476 */           this.L$0 = null; this.label = 1; if (AbstractIssueSingleStepAgentWorker.this.runCritic(
/* 477 */               executionContext, 
/* 478 */               this.$attempt, 
/* 479 */               this.$currentState, 
/* 480 */               optionsToRank, (Continuation)this) == object) return object;  return CollectionsKt.listOf(AbstractIssueSingleStepAgentWorker.this.runCritic(executionContext, this.$attempt, this.$currentState, optionsToRank, (Continuation)this));
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return CollectionsKt.listOf(SYNTHETIC_LOCAL_VARIABLE_1); }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final Object invoke(ExecutionContext p1, List p2, Continuation<? super AbstractIssueSingleStepAgentWorker$produceActionRequestWithReflection$request$1> p3) {
/*     */       AbstractIssueSingleStepAgentWorker$produceActionRequestWithReflection$request$1 abstractIssueSingleStepAgentWorker$produceActionRequestWithReflection$request$1 = new AbstractIssueSingleStepAgentWorker$produceActionRequestWithReflection$request$1(this.$attempt, this.$currentState, p3);
/*     */       abstractIssueSingleStepAgentWorker$produceActionRequestWithReflection$request$1.L$0 = p1;
/*     */       abstractIssueSingleStepAgentWorker$produceActionRequestWithReflection$request$1.L$1 = p2;
/*     */       return abstractIssueSingleStepAgentWorker$produceActionRequestWithReflection$request$1.invokeSuspend(Unit.INSTANCE);
/*     */     }
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
/*     */   @Nullable
/*     */   public final Object processHistory(@NotNull AgentState state, @NotNull String currentArtifactName, @NotNull ExecutionContext context, @NotNull AgentParameters agentParameters, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker$processHistory$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #5
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker$processHistory$1
/*     */     //   13: astore #10
/*     */     //   15: aload #10
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #10
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker$processHistory$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #5
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #10
/*     */     //   53: aload #10
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #9
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #11
/*     */     //   65: aload #10
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 188, 0 -> 92, 1 -> 162
/*     */     //   92: aload #9
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_3
/*     */     //   98: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   101: aload_2
/*     */     //   102: aload #4
/*     */     //   104: invokevirtual getHistoryProcessor : ()Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/HistoryProcessors;
/*     */     //   107: invokevirtual getHistoryProcessorArtifactType : ()Lcom/intellij/ml/llm/matterhorn/ArtifactType;
/*     */     //   110: invokevirtual childOfType : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ArtifactType;)Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   113: astore #6
/*     */     //   115: iconst_0
/*     */     //   116: istore #8
/*     */     //   118: new com/intellij/ml/llm/matterhorn/ArtifactRequest
/*     */     //   121: dup
/*     */     //   122: aload #6
/*     */     //   124: aload_1
/*     */     //   125: getstatic com/intellij/ml/llm/matterhorn/ej/core/AgentState.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState$Companion;
/*     */     //   128: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   131: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;)V
/*     */     //   134: astore #7
/*     */     //   136: aload_3
/*     */     //   137: aload #7
/*     */     //   139: aconst_null
/*     */     //   140: aload #10
/*     */     //   142: iconst_2
/*     */     //   143: aconst_null
/*     */     //   144: aload #10
/*     */     //   146: iconst_1
/*     */     //   147: putfield label : I
/*     */     //   150: invokestatic getOrCreateArtifact$default : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   153: dup
/*     */     //   154: aload #11
/*     */     //   156: if_acmpne -> 169
/*     */     //   159: aload #11
/*     */     //   161: areturn
/*     */     //   162: aload #9
/*     */     //   164: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   167: aload #9
/*     */     //   169: checkcast com/intellij/ml/llm/matterhorn/Artifact
/*     */     //   172: invokevirtual getContent : ()Ljava/lang/Object;
/*     */     //   175: checkcast com/intellij/ml/llm/matterhorn/ej/core/history_processors/HistoryProcessorResponse
/*     */     //   178: astore #8
/*     */     //   180: aload #8
/*     */     //   182: invokeinterface getUpdatedObservations : ()Ljava/util/List;
/*     */     //   187: areturn
/*     */     //   188: new java/lang/IllegalStateException
/*     */     //   191: dup
/*     */     //   192: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   194: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   197: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #556	-> 63
/*     */     //   #562	-> 97
/*     */     //   #563	-> 101
/*     */     //   #564	-> 102
/*     */     //   #562	-> 110
/*     */     //   #566	-> 115
/*     */     //   #863	-> 118
/*     */     //   #566	-> 134
/*     */     //   #567	-> 136
/*     */     //   #556	-> 159
/*     */     //   #567	-> 169
/*     */     //   #568	-> 180
/*     */     //   #556	-> 188
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	37	1	state	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   97	5	2	currentArtifactName	Ljava/lang/String;
/*     */     //   97	37	3	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   134	19	3	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   97	13	4	agentParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   115	19	6	currentStepId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   136	17	7	historyProcessorArtifactRequest	Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   180	8	8	historyProcessorArtifact	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/HistoryProcessorResponse;
/*     */     //   118	16	8	$i$f$artifactRequest	I
/*     */     //   0	198	5	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	135	10	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	128	9	$result	Ljava/lang/Object;
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
/*     */   private final Object runCritic(ExecutionContext context, int attempt, AgentState currentState, List optionsToRank, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker$runCritic$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #5
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker$runCritic$1
/*     */     //   13: astore #24
/*     */     //   15: aload #24
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #24
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker$runCritic$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #5
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #24
/*     */     //   53: aload #24
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #23
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #25
/*     */     //   65: aload #24
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 532, 0 -> 96, 1 -> 180, 2 -> 295
/*     */     //   96: aload #23
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: aload_0
/*     */     //   102: aload_1
/*     */     //   103: iload_2
/*     */     //   104: aload_3
/*     */     //   105: aload #4
/*     */     //   107: astore #21
/*     */     //   109: astore #20
/*     */     //   111: istore #19
/*     */     //   113: astore #18
/*     */     //   115: astore #17
/*     */     //   117: aload_0
/*     */     //   118: aload_1
/*     */     //   119: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   122: invokevirtual getPropertyProvider : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   125: aload #24
/*     */     //   127: aload #24
/*     */     //   129: aload #17
/*     */     //   131: putfield L$0 : Ljava/lang/Object;
/*     */     //   134: aload #24
/*     */     //   136: aload #18
/*     */     //   138: putfield L$1 : Ljava/lang/Object;
/*     */     //   141: aload #24
/*     */     //   143: aload #20
/*     */     //   145: putfield L$2 : Ljava/lang/Object;
/*     */     //   148: aload #24
/*     */     //   150: aload #21
/*     */     //   152: putfield L$3 : Ljava/lang/Object;
/*     */     //   155: aload #24
/*     */     //   157: iload #19
/*     */     //   159: putfield I$0 : I
/*     */     //   162: aload #24
/*     */     //   164: iconst_1
/*     */     //   165: putfield label : I
/*     */     //   168: invokevirtual getAgentParameters : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   171: dup
/*     */     //   172: aload #25
/*     */     //   174: if_acmpne -> 234
/*     */     //   177: aload #25
/*     */     //   179: areturn
/*     */     //   180: aload #24
/*     */     //   182: getfield I$0 : I
/*     */     //   185: istore #19
/*     */     //   187: aload #24
/*     */     //   189: getfield L$3 : Ljava/lang/Object;
/*     */     //   192: checkcast java/util/List
/*     */     //   195: astore #21
/*     */     //   197: aload #24
/*     */     //   199: getfield L$2 : Ljava/lang/Object;
/*     */     //   202: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentState
/*     */     //   205: astore #20
/*     */     //   207: aload #24
/*     */     //   209: getfield L$1 : Ljava/lang/Object;
/*     */     //   212: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   215: astore #18
/*     */     //   217: aload #24
/*     */     //   219: getfield L$0 : Ljava/lang/Object;
/*     */     //   222: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker
/*     */     //   225: astore #17
/*     */     //   227: aload #23
/*     */     //   229: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   232: aload #23
/*     */     //   234: astore #22
/*     */     //   236: aload #17
/*     */     //   238: aload #18
/*     */     //   240: iload #19
/*     */     //   242: aload #20
/*     */     //   244: aload #21
/*     */     //   246: aload #22
/*     */     //   248: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*     */     //   251: aload #24
/*     */     //   253: aload #24
/*     */     //   255: aconst_null
/*     */     //   256: putfield L$0 : Ljava/lang/Object;
/*     */     //   259: aload #24
/*     */     //   261: aconst_null
/*     */     //   262: putfield L$1 : Ljava/lang/Object;
/*     */     //   265: aload #24
/*     */     //   267: aconst_null
/*     */     //   268: putfield L$2 : Ljava/lang/Object;
/*     */     //   271: aload #24
/*     */     //   273: aconst_null
/*     */     //   274: putfield L$3 : Ljava/lang/Object;
/*     */     //   277: aload #24
/*     */     //   279: iconst_2
/*     */     //   280: putfield label : I
/*     */     //   283: invokespecial createCritiqueResponse : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;ILcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   286: dup
/*     */     //   287: aload #25
/*     */     //   289: if_acmpne -> 302
/*     */     //   292: aload #25
/*     */     //   294: areturn
/*     */     //   295: aload #23
/*     */     //   297: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   300: aload #23
/*     */     //   302: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse
/*     */     //   305: astore #6
/*     */     //   307: aload #6
/*     */     //   309: invokevirtual getCritiqueRanks : ()Ljava/util/List;
/*     */     //   312: astore #7
/*     */     //   314: aload #6
/*     */     //   316: invokevirtual getCritiqueCandidates : ()Ljava/util/List;
/*     */     //   319: astore #8
/*     */     //   321: aload #8
/*     */     //   323: invokeinterface size : ()I
/*     */     //   328: aload #7
/*     */     //   330: invokeinterface size : ()I
/*     */     //   335: if_icmpne -> 342
/*     */     //   338: iconst_1
/*     */     //   339: goto -> 343
/*     */     //   342: iconst_0
/*     */     //   343: istore #9
/*     */     //   345: getstatic kotlin/_Assertions.ENABLED : Z
/*     */     //   348: ifeq -> 371
/*     */     //   351: iload #9
/*     */     //   353: ifne -> 371
/*     */     //   356: ldc_w 'Assertion failed'
/*     */     //   359: astore #10
/*     */     //   361: new java/lang/AssertionError
/*     */     //   364: dup
/*     */     //   365: aload #10
/*     */     //   367: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   370: athrow
/*     */     //   371: aload #8
/*     */     //   373: checkcast java/lang/Iterable
/*     */     //   376: aload #7
/*     */     //   378: checkcast java/lang/Iterable
/*     */     //   381: invokestatic zip : (Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   384: checkcast java/lang/Iterable
/*     */     //   387: astore #9
/*     */     //   389: iconst_0
/*     */     //   390: istore #10
/*     */     //   392: aload #9
/*     */     //   394: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   399: astore #11
/*     */     //   401: aload #11
/*     */     //   403: invokeinterface hasNext : ()Z
/*     */     //   408: ifne -> 419
/*     */     //   411: new java/util/NoSuchElementException
/*     */     //   414: dup
/*     */     //   415: invokespecial <init> : ()V
/*     */     //   418: athrow
/*     */     //   419: aload #11
/*     */     //   421: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   426: astore #12
/*     */     //   428: aload #11
/*     */     //   430: invokeinterface hasNext : ()Z
/*     */     //   435: ifne -> 443
/*     */     //   438: aload #12
/*     */     //   440: goto -> 525
/*     */     //   443: aload #12
/*     */     //   445: checkcast kotlin/Pair
/*     */     //   448: astore #13
/*     */     //   450: iconst_0
/*     */     //   451: istore #14
/*     */     //   453: aload #13
/*     */     //   455: invokevirtual getSecond : ()Ljava/lang/Object;
/*     */     //   458: checkcast java/lang/Number
/*     */     //   461: invokevirtual intValue : ()I
/*     */     //   464: istore #13
/*     */     //   466: aload #11
/*     */     //   468: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   473: astore #14
/*     */     //   475: aload #14
/*     */     //   477: checkcast kotlin/Pair
/*     */     //   480: astore #15
/*     */     //   482: iconst_0
/*     */     //   483: istore #16
/*     */     //   485: aload #15
/*     */     //   487: invokevirtual getSecond : ()Ljava/lang/Object;
/*     */     //   490: checkcast java/lang/Number
/*     */     //   493: invokevirtual intValue : ()I
/*     */     //   496: istore #15
/*     */     //   498: iload #13
/*     */     //   500: iload #15
/*     */     //   502: if_icmple -> 513
/*     */     //   505: aload #14
/*     */     //   507: astore #12
/*     */     //   509: iload #15
/*     */     //   511: istore #13
/*     */     //   513: aload #11
/*     */     //   515: invokeinterface hasNext : ()Z
/*     */     //   520: ifne -> 466
/*     */     //   523: aload #12
/*     */     //   525: checkcast kotlin/Pair
/*     */     //   528: invokevirtual getFirst : ()Ljava/lang/Object;
/*     */     //   531: areturn
/*     */     //   532: new java/lang/IllegalStateException
/*     */     //   535: dup
/*     */     //   536: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   538: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   541: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #571	-> 63
/*     */     //   #577	-> 101
/*     */     //   #571	-> 177
/*     */     //   #577	-> 234
/*     */     //   #571	-> 292
/*     */     //   #578	-> 307
/*     */     //   #579	-> 314
/*     */     //   #580	-> 321
/*     */     //   #581	-> 371
/*     */     //   #864	-> 392
/*     */     //   #865	-> 401
/*     */     //   #866	-> 419
/*     */     //   #867	-> 428
/*     */     //   #868	-> 443
/*     */     //   #581	-> 453
/*     */     //   #868	-> 464
/*     */     //   #870	-> 466
/*     */     //   #871	-> 475
/*     */     //   #581	-> 485
/*     */     //   #871	-> 496
/*     */     //   #872	-> 498
/*     */     //   #873	-> 505
/*     */     //   #874	-> 509
/*     */     //   #876	-> 513
/*     */     //   #877	-> 523
/*     */     //   #581	-> 528
/*     */     //   #571	-> 532
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	70	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
/*     */     //   101	70	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   101	70	2	attempt	I
/*     */     //   101	70	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   101	70	4	optionsToRank	Ljava/util/List;
/*     */     //   307	14	6	critiqueResponse	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse;
/*     */     //   314	57	7	ranks	Ljava/util/List;
/*     */     //   371	18	7	ranks	Ljava/util/List;
/*     */     //   321	50	8	candidates	Ljava/util/List;
/*     */     //   371	18	8	candidates	Ljava/util/List;
/*     */     //   389	12	9	$this$minBy$iv	Ljava/lang/Iterable;
/*     */     //   401	18	11	iterator$iv	Ljava/util/Iterator;
/*     */     //   419	24	11	iterator$iv	Ljava/util/Iterator;
/*     */     //   443	21	11	iterator$iv	Ljava/util/Iterator;
/*     */     //   464	32	11	iterator$iv	Ljava/util/Iterator;
/*     */     //   496	29	11	iterator$iv	Ljava/util/Iterator;
/*     */     //   428	15	12	minElem$iv	Ljava/lang/Object;
/*     */     //   443	21	12	minElem$iv	Ljava/lang/Object;
/*     */     //   464	32	12	minElem$iv	Ljava/lang/Object;
/*     */     //   496	9	12	minElem$iv	Ljava/lang/Object;
/*     */     //   509	16	12	minElem$iv	Ljava/lang/Object;
/*     */     //   450	14	13	it	Lkotlin/Pair;
/*     */     //   466	30	13	minValue$iv	I
/*     */     //   496	9	13	minValue$iv	I
/*     */     //   513	12	13	minValue$iv	I
/*     */     //   475	38	14	e$iv	Ljava/lang/Object;
/*     */     //   482	14	15	it	Lkotlin/Pair;
/*     */     //   498	15	15	v$iv	I
/*     */     //   453	11	14	$i$a$-minByOrThrow-AbstractIssueSingleStepAgentWorker$runCritic$2	I
/*     */     //   485	11	16	$i$a$-minByOrThrow-AbstractIssueSingleStepAgentWorker$runCritic$2	I
/*     */     //   392	133	10	$i$f$minByOrThrow	I
/*     */     //   0	542	5	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	479	24	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	472	23	$result	Ljava/lang/Object;
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
/*     */   private final Object createCritiqueResponse(ExecutionContext context, int attempt, AgentState currentState, List optionsToRank, AgentParameters agentParameters, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #6
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker$createCritiqueResponse$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #6
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker$createCritiqueResponse$1
/*     */     //   13: astore #13
/*     */     //   15: aload #13
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #13
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker$createCritiqueResponse$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #6
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #13
/*     */     //   53: aload #13
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #12
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #14
/*     */     //   65: aload #13
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 238, 0 -> 92, 1 -> 224
/*     */     //   92: aload #12
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload #5
/*     */     //   99: invokevirtual getCritique : ()Lcom/intellij/ml/llm/matterhorn/ej/core/critique/Critiques;
/*     */     //   102: dup
/*     */     //   103: ifnull -> 113
/*     */     //   106: invokevirtual getCritiqueArtifactType : ()Lcom/intellij/ml/llm/matterhorn/ArtifactType;
/*     */     //   109: dup
/*     */     //   110: ifnonnull -> 138
/*     */     //   113: pop
/*     */     //   114: new com/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse
/*     */     //   117: dup
/*     */     //   118: aload #4
/*     */     //   120: aload #4
/*     */     //   122: checkcast java/util/Collection
/*     */     //   125: invokestatic getIndices : (Ljava/util/Collection;)Lkotlin/ranges/IntRange;
/*     */     //   128: checkcast java/lang/Iterable
/*     */     //   131: invokestatic toList : (Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   134: invokespecial <init> : (Ljava/util/List;Ljava/util/List;)V
/*     */     //   137: areturn
/*     */     //   138: astore #7
/*     */     //   140: aload_1
/*     */     //   141: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   144: aload_1
/*     */     //   145: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   148: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   151: iload_2
/*     */     //   152: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
/*     */     //   157: aload #7
/*     */     //   159: invokevirtual childOfType : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ArtifactType;)Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   162: astore #8
/*     */     //   164: new com/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput
/*     */     //   167: dup
/*     */     //   168: aload_3
/*     */     //   169: aload #4
/*     */     //   171: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Ljava/util/List;)V
/*     */     //   174: astore #10
/*     */     //   176: iconst_0
/*     */     //   177: istore #11
/*     */     //   179: new com/intellij/ml/llm/matterhorn/ArtifactRequest
/*     */     //   182: dup
/*     */     //   183: aload #8
/*     */     //   185: aload #10
/*     */     //   187: getstatic com/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput$Companion;
/*     */     //   190: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   193: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;)V
/*     */     //   196: astore #9
/*     */     //   198: aload_1
/*     */     //   199: aload #9
/*     */     //   201: aconst_null
/*     */     //   202: aload #13
/*     */     //   204: iconst_2
/*     */     //   205: aconst_null
/*     */     //   206: aload #13
/*     */     //   208: iconst_1
/*     */     //   209: putfield label : I
/*     */     //   212: invokestatic getOrCreateArtifact$default : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   215: dup
/*     */     //   216: aload #14
/*     */     //   218: if_acmpne -> 231
/*     */     //   221: aload #14
/*     */     //   223: areturn
/*     */     //   224: aload #12
/*     */     //   226: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   229: aload #12
/*     */     //   231: checkcast com/intellij/ml/llm/matterhorn/Artifact
/*     */     //   234: invokevirtual getContent : ()Ljava/lang/Object;
/*     */     //   237: areturn
/*     */     //   238: new java/lang/IllegalStateException
/*     */     //   241: dup
/*     */     //   242: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   244: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   247: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #584	-> 63
/*     */     //   #591	-> 97
/*     */     //   #592	-> 118
/*     */     //   #593	-> 120
/*     */     //   #591	-> 134
/*     */     //   #595	-> 140
/*     */     //   #596	-> 164
/*     */     //   #878	-> 179
/*     */     //   #596	-> 196
/*     */     //   #597	-> 198
/*     */     //   #584	-> 221
/*     */     //   #597	-> 231
/*     */     //   #584	-> 238
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	16	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   138	58	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   196	19	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   97	16	2	attempt	I
/*     */     //   138	26	2	attempt	I
/*     */     //   97	16	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   138	38	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   97	37	4	optionsToRank	Ljava/util/List;
/*     */     //   138	38	4	optionsToRank	Ljava/util/List;
/*     */     //   97	5	5	agentParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   140	24	7	critiqueArtifactType	Lcom/intellij/ml/llm/matterhorn/ArtifactType;
/*     */     //   164	32	8	critiqueArtifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   198	17	9	critiqueRequest	Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   176	20	10	input$iv	Ljava/lang/Object;
/*     */     //   179	17	11	$i$f$artifactRequest	I
/*     */     //   0	248	6	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	185	13	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	178	12	$result	Ljava/lang/Object;
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
/*     */   private final Object getCritiqueResponse(ExecutionContext context, AgentParameters agentParameters, int attempt, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker$getCritiqueResponse$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker$getCritiqueResponse$1
/*     */     //   13: astore #9
/*     */     //   15: aload #9
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #9
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker$getCritiqueResponse$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #9
/*     */     //   53: aload #9
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #8
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #10
/*     */     //   65: aload #9
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 194, 0 -> 92, 1 -> 164
/*     */     //   92: aload #8
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_2
/*     */     //   98: invokevirtual getCritique : ()Lcom/intellij/ml/llm/matterhorn/ej/core/critique/Critiques;
/*     */     //   101: dup
/*     */     //   102: ifnull -> 112
/*     */     //   105: invokevirtual getCritiqueArtifactType : ()Lcom/intellij/ml/llm/matterhorn/ArtifactType;
/*     */     //   108: dup
/*     */     //   109: ifnonnull -> 115
/*     */     //   112: pop
/*     */     //   113: aconst_null
/*     */     //   114: areturn
/*     */     //   115: astore #5
/*     */     //   117: aload_1
/*     */     //   118: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   121: aload_1
/*     */     //   122: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   125: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   128: iload_3
/*     */     //   129: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
/*     */     //   134: aload #5
/*     */     //   136: invokevirtual childOfType : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ArtifactType;)Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   139: astore #6
/*     */     //   141: aload_1
/*     */     //   142: aload #6
/*     */     //   144: aload #9
/*     */     //   146: aload #9
/*     */     //   148: iconst_1
/*     */     //   149: putfield label : I
/*     */     //   152: invokevirtual getArtifact : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   155: dup
/*     */     //   156: aload #10
/*     */     //   158: if_acmpne -> 171
/*     */     //   161: aload #10
/*     */     //   163: areturn
/*     */     //   164: aload #8
/*     */     //   166: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   169: aload #8
/*     */     //   171: checkcast com/intellij/ml/llm/matterhorn/Artifact
/*     */     //   174: astore #7
/*     */     //   176: aload #7
/*     */     //   178: dup
/*     */     //   179: ifnull -> 191
/*     */     //   182: invokevirtual getContent : ()Ljava/lang/Object;
/*     */     //   185: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse
/*     */     //   188: goto -> 193
/*     */     //   191: pop
/*     */     //   192: aconst_null
/*     */     //   193: areturn
/*     */     //   194: new java/lang/IllegalStateException
/*     */     //   197: dup
/*     */     //   198: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   200: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   203: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #600	-> 63
/*     */     //   #605	-> 97
/*     */     //   #606	-> 117
/*     */     //   #607	-> 141
/*     */     //   #600	-> 161
/*     */     //   #608	-> 176
/*     */     //   #600	-> 194
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	15	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   115	40	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   97	4	2	agentParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   97	15	3	attempt	I
/*     */     //   115	26	3	attempt	I
/*     */     //   117	24	5	critiqueArtifactType	Lcom/intellij/ml/llm/matterhorn/ArtifactType;
/*     */     //   141	14	6	critiqueArtifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   176	15	7	artifact	Lcom/intellij/ml/llm/matterhorn/Artifact;
/*     */     //   0	204	4	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	141	9	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	134	8	$result	Ljava/lang/Object;
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
/*     */   private final String multiCommandWarning(int numCommands) {
/* 612 */     return (numCommands > 1) ? ("Your response contained " + numCommands + " **command** sections. Only the first **command** was executed, the others were ignored. If you still want to use the remaining commands, do it one by one (single **command** per your response). Your response must contain exactly one **command** section.\n\n") : 
/* 613 */       "";
/*     */   }
/*     */   public boolean areBashCommandsAllowed() {
/* 616 */     return true;
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
/*     */   private static final CharSequence getSystemMessage$lambda$17$lambda$15$lambda$14(Argument it) {
/* 682 */     Intrinsics.checkNotNullParameter(it, "it"); return it.short(); } private static final CharSequence getSystemMessage$lambda$17(AgentAction action) { Intrinsics.checkNotNullParameter(action, "action"); CharSequence charSequence = action.getCustomSignature();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 828 */     int $i$a$-ifEmpty-AbstractIssueSingleStepAgentWorker$getSystemMessage$commands$2$signature$1 = 0;
/*     */     String signature = ((charSequence.length() == 0)) ? (action.getName() + " " + action.getName()) : (String)charSequence;
/*     */     return "### " + action.getName() + "\n**Signature**:\n`" + signature + "`\n" + (action.getArguments().isEmpty() ? "" : ("#### Arguments\n" + CollectionsKt.joinToString$default(action.getArguments(), "\n", null, null, 0, null, AbstractIssueSingleStepAgentWorker::getSystemMessage$lambda$17$lambda$16, 30, null))) + "\n#### Description \n" + StringsKt.trim(action.getDocstring()).toString() + "\n"; }
/*     */ 
/*     */   
/*     */   private static final CharSequence getSystemMessage$lambda$17$lambda$16(Argument it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return "    - " + it.full();
/*     */   }
/*     */   
/*     */   private static final CharSequence getSystemMessage$lambda$19(MatterhornChatMessagePart it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return it.getRepresentation();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected String getRecommendedSteps(@NotNull String createInitPlan) {
/*     */     Intrinsics.checkNotNullParameter(createInitPlan, "createInitPlan");
/*     */     return "  1. Thoroughly review `<issue_description>`." + createInitPlan + "\n  2. Review the project’s codebase, examining not only its structure but also the specific implementation details, to identify all segments that may contribute to or help resolve the issue described in `<issue_description>`.\n  3. If `<issue_description>` describes an error, create a script to reproduce it and run the script to confirm the error.\n  4. Edit the source code in the repo to resolve `<issue_description>`, ensuring that edge cases are properly handled.\n  5. If a script to reproduce the issue has been created, execute it again on the updated repository to confirm that `<issue_description>` is resolved. \n  6. It is best practice to find and run tests related to the modified files to ensure no new issues have been introduced and to confirm that these tests still pass.\n  7. Once you have verified the solution, provide a summary of the changes made and the final status of the issue. Then use the `submit` command to provide the complete response back to the user.\n\n  If `<issue_description>` directly contradicts any of these steps, follow the instructions from `<issue_description>` first.";
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object getAgentParameters(@NotNull MatterhornPropertyProvider propertyProvider, @NotNull Continuation<? super AgentParameters> $completion) {
/*     */     return getAgentParameters$suspendImpl(this, propertyProvider, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected Object getTrajectoryElementAgent(@NotNull MatterhornPropertyProvider propertyProvider, @NotNull Continuation<? super TrajectoryElementAgent> $completion) {
/*     */     return getTrajectoryElementAgent$suspendImpl(this, propertyProvider, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object produceArtifact(@NotNull AgentState input, @NotNull ExecutionContext context, @NotNull Continuation<? super ArtifactResponse<AgentResponse>> $completion) {
/*     */     return produceArtifact$suspendImpl(this, input, context, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object getSystemMessage(@NotNull AgentParameters parameters, @NotNull ExecutionAgentContext context, @NotNull AgentIssue issue, @NotNull Continuation<? super String> $completion) {
/*     */     return getSystemMessage$suspendImpl(this, parameters, context, issue, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object getIssueDescriptionAndInstructions(@NotNull AgentState input, @NotNull ExecutionContext context, @NotNull Continuation<? super String> $completion) {
/*     */     return getIssueDescriptionAndInstructions$suspendImpl(this, input, context, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public abstract Object getAvailableActions(@NotNull ExecutionAgentContext paramExecutionAgentContext, @NotNull Continuation<? super List<? extends AgentAction>> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   public abstract Object getHiddenActions(@NotNull ExecutionAgentContext paramExecutionAgentContext, @NotNull Continuation<? super List<? extends AgentAction>> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   public abstract Object getDemonstration(@NotNull Continuation<? super String> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   public Object getGuidanceContext(@NotNull ExecutionAgentContext context, @NotNull Continuation<? super String> $completion) {
/*     */     return getGuidanceContext$suspendImpl(this, context, $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractIssueSingleStepAgentWorker.kt", l = {597}, i = {}, s = {}, n = {}, m = "createCritiqueResponse", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueSingleStepAgentWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AbstractIssueSingleStepAgentWorker$createCritiqueResponse$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     AbstractIssueSingleStepAgentWorker$createCritiqueResponse$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AbstractIssueSingleStepAgentWorker.this.createCritiqueResponse(null, 0, null, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractIssueSingleStepAgentWorker.kt", l = {186, 188}, i = {0}, s = {"L$0"}, n = {"propertyProvider"}, m = "getAgentParameters$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueSingleStepAgentWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AbstractIssueSingleStepAgentWorker$getAgentParameters$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     AbstractIssueSingleStepAgentWorker$getAgentParameters$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AbstractIssueSingleStepAgentWorker.getAgentParameters$suspendImpl(AbstractIssueSingleStepAgentWorker.this, null, (Continuation<? super AgentParameters>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractIssueSingleStepAgentWorker.kt", l = {607}, i = {}, s = {}, n = {}, m = "getCritiqueResponse", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueSingleStepAgentWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AbstractIssueSingleStepAgentWorker$getCritiqueResponse$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     AbstractIssueSingleStepAgentWorker$getCritiqueResponse$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AbstractIssueSingleStepAgentWorker.this.getCritiqueResponse(null, null, 0, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractIssueSingleStepAgentWorker.kt", l = {679}, i = {0, 0, 0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, n = {"$this", "issue", "recommendedSteps", "insideThought", "exampleAnswer", "windowsPrompt"}, m = "getSystemMessage$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueSingleStepAgentWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AbstractIssueSingleStepAgentWorker$getSystemMessage$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     int label;
/*     */     
/*     */     AbstractIssueSingleStepAgentWorker$getSystemMessage$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AbstractIssueSingleStepAgentWorker.getSystemMessage$suspendImpl(AbstractIssueSingleStepAgentWorker.this, null, null, null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractIssueSingleStepAgentWorker.kt", l = {425}, i = {}, s = {}, n = {}, m = "getTools", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueSingleStepAgentWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AbstractIssueSingleStepAgentWorker$getTools$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     AbstractIssueSingleStepAgentWorker$getTools$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AbstractIssueSingleStepAgentWorker.this.getTools(null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractIssueSingleStepAgentWorker.kt", l = {193}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"$this", "json"}, m = "getTrajectoryElementAgent$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueSingleStepAgentWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AbstractIssueSingleStepAgentWorker$getTrajectoryElementAgent$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     AbstractIssueSingleStepAgentWorker$getTrajectoryElementAgent$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AbstractIssueSingleStepAgentWorker.getTrajectoryElementAgent$suspendImpl(AbstractIssueSingleStepAgentWorker.this, null, (Continuation<? super TrajectoryElementAgent>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractIssueSingleStepAgentWorker.kt", l = {213, 211, 221, 219, 226, 226}, i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0"}, n = {"this", "context", "demonstration", "issueDescription", "systemLogMessage", "propertyProvider", "this", "context", "demonstration", "issueDescription", "propertyProvider", "this", "context", "demonstration", "issueDescription", "propertyProvider", "this", "context", "issueDescription", "propertyProvider", "issueDescription"}, m = "logHeadTrajectory", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueSingleStepAgentWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AbstractIssueSingleStepAgentWorker$logHeadTrajectory$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     Object L$6;
/*     */     int label;
/*     */     
/*     */     AbstractIssueSingleStepAgentWorker$logHeadTrajectory$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AbstractIssueSingleStepAgentWorker.this.logHeadTrajectory(null, null, null, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractIssueSingleStepAgentWorker.kt", l = {567}, i = {}, s = {}, n = {}, m = "processHistory", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueSingleStepAgentWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AbstractIssueSingleStepAgentWorker$processHistory$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     AbstractIssueSingleStepAgentWorker$processHistory$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AbstractIssueSingleStepAgentWorker.this.processHistory(null, null, null, null, (Continuation<? super List<AgentObservation>>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractIssueSingleStepAgentWorker.kt", l = {448, 486, 487, 495, 497, 501, 502, 502, 506, 504, 531, 529, 542, 540, 551}, i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "I$0", "L$0"}, n = {"this", "currentState", "tools", "observationsProcessed", "executionAgentContext", "propertyProvider", "additionalMessages", "error", "this", "currentState", "tools", "executionAgentContext", "propertyProvider", "additionalMessages", "params", "prevTasksMessages", "observationsWithoutPrevTasks", "context", "attempt", "this", "currentState", "tools", "executionAgentContext", "propertyProvider", "additionalMessages", "params", "prevTasksMessages", "observationsWithoutPrevTasks", "context", "chat", "attempt", "this", "currentState", "tools", "executionAgentContext", "propertyProvider", "additionalMessages", "params", "prevTasksMessages", "observationsWithoutPrevTasks", "context", "actionProvider", "actionString", "parsedAction", "attempt", "this", "currentState", "tools", "executionAgentContext", "propertyProvider", "additionalMessages", "params", "prevTasksMessages", "observationsWithoutPrevTasks", "context", "actionProvider", "actionString", "parsedAction", "attempt", "this", "currentState", "tools", "executionAgentContext", "propertyProvider", "additionalMessages", "params", "prevTasksMessages", "observationsWithoutPrevTasks", "context", "actionProvider", "actionString", "parsedAction", "attempt", "this", "currentState", "tools", "executionAgentContext", "propertyProvider", "additionalMessages", "params", "prevTasksMessages", "observationsWithoutPrevTasks", "context", "actionProvider", "actionString", "parsedAction", "actionRequest", "attempt", "this", "currentState", "tools", "executionAgentContext", "propertyProvider", "additionalMessages", "params", "prevTasksMessages", "observationsWithoutPrevTasks", "context", "actionProvider", "actionString", "parsedAction", "actionRequest", "attempt", "this", "currentState", "tools", "executionAgentContext", "propertyProvider", "additionalMessages", "params", "prevTasksMessages", "observationsWithoutPrevTasks", "context", "actionProvider", "actionString", "parsedAction", "actionRequest", "critiqueResponse", "attempt", "this", "currentState", "tools", "executionAgentContext", "propertyProvider", "additionalMessages", "params", "prevTasksMessages", "observationsWithoutPrevTasks", "context", "actionProvider", "actionString", "parsedAction", "actionRequest", "attempt", "this", "currentState", "tools", "executionAgentContext", "propertyProvider", "additionalMessages", "params", "prevTasksMessages", "observationsWithoutPrevTasks", "context", "actionString", "e", "errorMsg", "parsedActionTitle", "attempt", "this", "currentState", "tools", "executionAgentContext", "propertyProvider", "additionalMessages", "params", "prevTasksMessages", "observationsWithoutPrevTasks", "context", "e", "errorMsg", "attempt", "this", "currentState", "tools", "executionAgentContext", "propertyProvider", "additionalMessages", "params", "prevTasksMessages", "observationsWithoutPrevTasks", "e", "errorMsg", "attempt", "this", "currentState", "tools", "executionAgentContext", "propertyProvider", "additionalMessages", "params", "prevTasksMessages", "observationsWithoutPrevTasks", "e", "attempt", "error"}, m = "produceActionRequestWithReflection", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueSingleStepAgentWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AbstractIssueSingleStepAgentWorker$produceActionRequestWithReflection$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     Object L$6;
/*     */     Object L$7;
/*     */     Object L$8;
/*     */     Object L$9;
/*     */     Object L$10;
/*     */     Object L$11;
/*     */     Object L$12;
/*     */     Object L$13;
/*     */     Object L$14;
/*     */     Object L$15;
/*     */     int I$0;
/*     */     int I$1;
/*     */     int label;
/*     */     
/*     */     AbstractIssueSingleStepAgentWorker$produceActionRequestWithReflection$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AbstractIssueSingleStepAgentWorker.this.produceActionRequestWithReflection(null, null, null, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractIssueSingleStepAgentWorker.kt", l = {233, 235, 236, 238, 238, 239, 246, 253, 256, 259, 276, 276, 295, 295, 296, 309, 319, 328, 336, 336, 353, 363, 363}, i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 20, 20, 20, 20, 20, 20, 21, 21, 21, 21, 21, 21, 22, 22, 22, 22, 22, 22}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$16", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$12", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, n = {"$this", "input", "context", "executionAgentContext", "propertyProvider", "$this", "input", "context", "executionAgentContext", "propertyProvider", "parameters", "$this", "input", "context", "executionAgentContext", "propertyProvider", "parameters", "tools", "$this", "input", "context", "executionAgentContext", "propertyProvider", "parameters", "tools", "systemMessage", "recommendedSteps", "$this", "input", "context", "executionAgentContext", "propertyProvider", "parameters", "tools", "systemMessage", "recommendedSteps", "$this", "input", "context", "executionAgentContext", "propertyProvider", "parameters", "tools", "systemMessage", "recommendedSteps", "demonstration", "$this", "input", "context", "executionAgentContext", "propertyProvider", "parameters", "tools", "systemMessage", "recommendedSteps", "demonstration", "issueDescription", "issueDescriptionImages", "$this", "input", "context", "executionAgentContext", "propertyProvider", "parameters", "tools", "systemMessage", "recommendedSteps", "demonstration", "issueDescription", "issueDescriptionImages", "relevantSymbolsResponse", "$this", "input", "context", "executionAgentContext", "propertyProvider", "parameters", "tools", "systemMessage", "recommendedSteps", "demonstration", "issueDescription", "issueDescriptionImages", "relevantSymbolsResponse", "projectStrResponse", "$this", "input", "context", "executionAgentContext", "propertyProvider", "parameters", "tools", "systemMessage", "recommendedSteps", "demonstration", "issueDescription", "issueDescriptionImages", "relevantSymbolsResponse", "projectStrResponse", "guidelines", "$this", "input", "context", "executionAgentContext", "propertyProvider", "parameters", "tools", "systemMessage", "recommendedSteps", "demonstration", "issueDescription", "issueDescriptionImages", "relevantSymbolsResponse", "projectStrResponse", "guidelines", "content", "$this", "input", "context", "executionAgentContext", "propertyProvider", "parameters", "tools", "systemMessage", "recommendedSteps", "demonstration", "issueDescription", "issueDescriptionImages", "relevantSymbolsResponse", "projectStrResponse", "guidelines", "$this", "context", "executionAgentContext", "propertyProvider", "parameters", "tools", "currentState", "$this", "context", "executionAgentContext", "propertyProvider", "parameters", "tools", "currentState", "$this", "context", "executionAgentContext", "propertyProvider", "parameters", "currentState", "observationsProcessed", "$this", "context", "executionAgentContext", "propertyProvider", "parameters", "currentState", "actionRequest", "llmResponse", "allObservations", "$this", "context", "executionAgentContext", "propertyProvider", "parameters", "currentState", "actionRequest", "llmResponse", "allObservations", "arguments", "actions", "editArtifactTypes", "$this", "context", "executionAgentContext", "propertyProvider", "parameters", "currentState", "actionRequest", "llmResponse", "allObservations", "arguments", "actions", "$this", "parameters", "actionRequest", "llmResponse", "actionResult", "$this", "parameters", "actionRequest", "llmResponse", "actionResult", "$this", "context", "propertyProvider", "parameters", "actionRequest", "llmResponse", "$this", "context", "parameters", "actionRequest", "llmResponse", "actionResult", "$this", "context", "parameters", "actionRequest", "llmResponse", "actionResult"}, m = "produceArtifact$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueSingleStepAgentWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AbstractIssueSingleStepAgentWorker$produceArtifact$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     Object L$6;
/*     */     Object L$7;
/*     */     Object L$8;
/*     */     Object L$9;
/*     */     Object L$10;
/*     */     Object L$11;
/*     */     Object L$12;
/*     */     Object L$13;
/*     */     Object L$14;
/*     */     Object L$15;
/*     */     Object L$16;
/*     */     Object L$17;
/*     */     int label;
/*     */     
/*     */     AbstractIssueSingleStepAgentWorker$produceArtifact$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AbstractIssueSingleStepAgentWorker.produceArtifact$suspendImpl(AbstractIssueSingleStepAgentWorker.this, null, null, (Continuation<? super ArtifactResponse<AgentResponse>>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractIssueSingleStepAgentWorker.kt", l = {577, 577}, i = {}, s = {}, n = {}, m = "runCritic", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueSingleStepAgentWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AbstractIssueSingleStepAgentWorker$runCritic$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     int I$0;
/*     */     int label;
/*     */     
/*     */     AbstractIssueSingleStepAgentWorker$runCritic$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AbstractIssueSingleStepAgentWorker.this.runCritic(null, 0, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AbstractIssueSingleStepAgentWorker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */