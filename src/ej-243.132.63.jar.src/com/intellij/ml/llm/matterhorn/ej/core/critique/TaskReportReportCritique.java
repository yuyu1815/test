/*     */ package com.intellij.ml.llm.matterhorn.ej.core.critique;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutor;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactResponse;
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.TrajectoryElementAgent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.Result;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ResultKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskResult;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatKt;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessage;
/*     */ import com.intellij.ml.llm.matterhorn.requests.ReviewerResponse;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.IndexedValue;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000`\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\b\n\002\020\002\n\002\b\004\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001B\007¢\006\004\b\004\020\005J\026\020\f\032\0020\r2\006\020\016\032\0020\017H@¢\006\002\020\020J$\020\021\032\b\022\004\022\0020\0030\0222\006\020\023\032\0020\0022\006\020\024\032\0020\025H@¢\006\002\020\026J\026\020\027\032\0020\0302\006\020\016\032\0020\017H@¢\006\002\020\020J\034\020\031\032\b\022\004\022\0020\0330\0322\f\020\034\032\b\022\004\022\0020\0350\032H\002J*\020\036\032\016\022\004\022\0020 \022\004\022\0020!0\0372\006\020\"\032\0020\0072\f\020#\032\b\022\004\022\0020\0350\032H\002R\024\020\006\032\0020\007XD¢\006\b\n\000\032\004\b\b\020\tR\016\020\n\032\0020\007XD¢\006\002\n\000R\016\020\013\032\0020\007XD¢\006\002\n\000R\016\020$\032\0020\007X\004¢\006\002\n\000¨\006%"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique;", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueInput;", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueResponse;", "<init>", "()V", "agentName", "", "getAgentName", "()Ljava/lang/String;", "commandDirective", "bestCommandDirective", "getTrajectoryElementAgent", "Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "(Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produceArtifact", "Lcom/intellij/ml/llm/matterhorn/ArtifactResponse;", "input", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueInput;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAgentParameters", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters;", "buildChoiceMessage", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;", "reportsToRank", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;", "parseBestAction", "Lcom/intellij/ml/llm/matterhorn/ej/core/Result;", "", "", "response", "actionsToRank", "systemPrompt", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nAgentReportCritique.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgentReportCritique.kt\ncom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,183:1\n205#2:184\n1863#3,2:185\n1557#3:187\n1628#3,3:188\n1557#3:191\n1628#3,3:192\n1557#3:195\n1628#3,3:196\n774#3:199\n865#3,2:200\n*S KotlinDebug\n*F\n+ 1 AgentReportCritique.kt\ncom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique\n*L\n70#1:184\n93#1:185,2\n109#1:187\n109#1:188,3\n120#1:191\n120#1:192,3\n137#1:195\n137#1:196,3\n137#1:199\n137#1:200,2\n*E\n"})
/*     */ public final class TaskReportReportCritique
/*     */   implements ArtifactRequestExecutor<TaskReportCritiqueInput, TaskReportCritiqueResponse>
/*     */ {
/*     */   @NotNull
/*  61 */   private final String agentName = "task_report_critique"; @NotNull public final String getAgentName() { return this.agentName; }
/*     */    @NotNull
/*  63 */   private final String commandDirective = "PR"; @NotNull
/*  64 */   private final String bestCommandDirective = "BEST PR:";
/*     */   
/*     */   private final Object getTrajectoryElementAgent(MatterhornPropertyProvider propertyProvider, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique$getTrajectoryElementAgent$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique$getTrajectoryElementAgent$1
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
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique$getTrajectoryElementAgent$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #10
/*     */     //   50: aload #10
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #9
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #11
/*     */     //   62: aload #10
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 234, 0 -> 88, 1 -> 139
/*     */     //   88: aload #9
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aconst_null
/*     */     //   94: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   99: iconst_1
/*     */     //   100: aconst_null
/*     */     //   101: invokestatic Json$default : (Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/serialization/json/Json;
/*     */     //   104: astore_3
/*     */     //   105: aload_0
/*     */     //   106: aload_1
/*     */     //   107: aload #10
/*     */     //   109: aload #10
/*     */     //   111: aload_0
/*     */     //   112: putfield L$0 : Ljava/lang/Object;
/*     */     //   115: aload #10
/*     */     //   117: aload_3
/*     */     //   118: putfield L$1 : Ljava/lang/Object;
/*     */     //   121: aload #10
/*     */     //   123: iconst_1
/*     */     //   124: putfield label : I
/*     */     //   127: invokespecial getAgentParameters : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   130: dup
/*     */     //   131: aload #11
/*     */     //   133: if_acmpne -> 164
/*     */     //   136: aload #11
/*     */     //   138: areturn
/*     */     //   139: aload #10
/*     */     //   141: getfield L$1 : Ljava/lang/Object;
/*     */     //   144: checkcast kotlinx/serialization/json/Json
/*     */     //   147: astore_3
/*     */     //   148: aload #10
/*     */     //   150: getfield L$0 : Ljava/lang/Object;
/*     */     //   153: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique
/*     */     //   156: astore_0
/*     */     //   157: aload #9
/*     */     //   159: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   162: aload #9
/*     */     //   164: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters
/*     */     //   167: astore #4
/*     */     //   169: aload #4
/*     */     //   171: invokevirtual getModelParameters : ()Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   174: invokevirtual getModel : ()Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   177: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   180: astore #5
/*     */     //   182: aload_3
/*     */     //   183: astore #7
/*     */     //   185: iconst_0
/*     */     //   186: istore #8
/*     */     //   188: aload #7
/*     */     //   190: aload #7
/*     */     //   192: invokevirtual getSerializersModule : ()Lkotlinx/serialization/modules/SerializersModule;
/*     */     //   195: pop
/*     */     //   196: getstatic com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters$Companion;
/*     */     //   199: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   202: checkcast kotlinx/serialization/SerializationStrategy
/*     */     //   205: aload #4
/*     */     //   207: invokevirtual encodeToString : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   210: astore #6
/*     */     //   212: new com/intellij/ml/llm/matterhorn/TrajectoryElementAgent
/*     */     //   215: dup
/*     */     //   216: aload_0
/*     */     //   217: getfield agentName : Ljava/lang/String;
/*     */     //   220: ldc '0.1'
/*     */     //   222: aload #5
/*     */     //   224: aload #6
/*     */     //   226: aconst_null
/*     */     //   227: bipush #16
/*     */     //   229: aconst_null
/*     */     //   230: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   233: areturn
/*     */     //   234: new java/lang/IllegalStateException
/*     */     //   237: dup
/*     */     //   238: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   240: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   243: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #66	-> 60
/*     */     //   #67	-> 93
/*     */     //   #68	-> 105
/*     */     //   #66	-> 136
/*     */     //   #69	-> 169
/*     */     //   #70	-> 182
/*     */     //   #184	-> 188
/*     */     //   #70	-> 210
/*     */     //   #71	-> 212
/*     */     //   #66	-> 234
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	46	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique;
/*     */     //   157	77	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique;
/*     */     //   93	37	1	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   105	34	3	json	Lkotlinx/serialization/json/Json;
/*     */     //   148	86	3	json	Lkotlinx/serialization/json/Json;
/*     */     //   169	65	4	agentParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters;
/*     */     //   182	52	5	modelName	Ljava/lang/String;
/*     */     //   212	22	6	agentParametersStr	Ljava/lang/String;
/*     */     //   185	25	7	this_$iv	Lkotlinx/serialization/json/Json;
/*     */     //   188	22	8	$i$f$encodeToString	I
/*     */     //   0	244	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	184	10	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	177	9	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private static final Unit getTrajectoryElementAgent$lambda$0(JsonBuilder $this$Json) {
/*     */     Intrinsics.checkNotNullParameter($this$Json, "$this$Json");
/*     */     $this$Json.setEncodeDefaults(true);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object produceArtifact(@NotNull TaskReportCritiqueInput input, @NotNull ExecutionContext context, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique$produceArtifact$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique$produceArtifact$1
/*     */     //   11: astore #29
/*     */     //   13: aload #29
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #29
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique$produceArtifact$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #29
/*     */     //   50: aload #29
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #28
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #54
/*     */     //   62: aload #29
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 2199, 0 -> 124, 1 -> 235, 2 -> 395, 3 -> 602, 4 -> 758, 5 -> 966, 6 -> 1185, 7 -> 1433, 8 -> 1681, 9 -> 1837, 10 -> 2144
/*     */     //   124: aload #28
/*     */     //   126: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   129: aload_1
/*     */     //   130: invokevirtual getReportsToRank : ()Ljava/util/List;
/*     */     //   133: invokeinterface size : ()I
/*     */     //   138: iconst_1
/*     */     //   139: if_icmpgt -> 170
/*     */     //   142: new com/intellij/ml/llm/matterhorn/ArtifactResponse
/*     */     //   145: dup
/*     */     //   146: new com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueResponse
/*     */     //   149: dup
/*     */     //   150: aload_1
/*     */     //   151: invokevirtual getReportsToRank : ()Ljava/util/List;
/*     */     //   154: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   157: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult
/*     */     //   160: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;)V
/*     */     //   163: aconst_null
/*     */     //   164: iconst_2
/*     */     //   165: aconst_null
/*     */     //   166: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   169: areturn
/*     */     //   170: aload_2
/*     */     //   171: aload_0
/*     */     //   172: getfield agentName : Ljava/lang/String;
/*     */     //   175: invokevirtual setTitle : (Ljava/lang/String;)V
/*     */     //   178: aload_2
/*     */     //   179: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   182: invokevirtual getPropertyProvider : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   185: astore #4
/*     */     //   187: aload_0
/*     */     //   188: aload #4
/*     */     //   190: aload #29
/*     */     //   192: aload #29
/*     */     //   194: aload_0
/*     */     //   195: putfield L$0 : Ljava/lang/Object;
/*     */     //   198: aload #29
/*     */     //   200: aload_1
/*     */     //   201: putfield L$1 : Ljava/lang/Object;
/*     */     //   204: aload #29
/*     */     //   206: aload_2
/*     */     //   207: putfield L$2 : Ljava/lang/Object;
/*     */     //   210: aload #29
/*     */     //   212: aload #4
/*     */     //   214: putfield L$3 : Ljava/lang/Object;
/*     */     //   217: aload #29
/*     */     //   219: iconst_1
/*     */     //   220: putfield label : I
/*     */     //   223: invokespecial getAgentParameters : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   226: dup
/*     */     //   227: aload #54
/*     */     //   229: if_acmpne -> 279
/*     */     //   232: aload #54
/*     */     //   234: areturn
/*     */     //   235: aload #29
/*     */     //   237: getfield L$3 : Ljava/lang/Object;
/*     */     //   240: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   243: astore #4
/*     */     //   245: aload #29
/*     */     //   247: getfield L$2 : Ljava/lang/Object;
/*     */     //   250: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   253: astore_2
/*     */     //   254: aload #29
/*     */     //   256: getfield L$1 : Ljava/lang/Object;
/*     */     //   259: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueInput
/*     */     //   262: astore_1
/*     */     //   263: aload #29
/*     */     //   265: getfield L$0 : Ljava/lang/Object;
/*     */     //   268: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique
/*     */     //   271: astore_0
/*     */     //   272: aload #28
/*     */     //   274: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   277: aload #28
/*     */     //   279: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters
/*     */     //   282: astore #5
/*     */     //   284: aload_1
/*     */     //   285: invokevirtual getIssue : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;
/*     */     //   288: invokevirtual getDescription : ()Ljava/lang/String;
/*     */     //   291: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   296: invokestatic toUserMessage : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   299: astore #6
/*     */     //   301: aload_1
/*     */     //   302: invokevirtual getReportsToRank : ()Ljava/util/List;
/*     */     //   305: astore #7
/*     */     //   307: aload_0
/*     */     //   308: aload #7
/*     */     //   310: invokespecial buildChoiceMessage : (Ljava/util/List;)Ljava/util/List;
/*     */     //   313: astore #8
/*     */     //   315: aload_2
/*     */     //   316: astore #22
/*     */     //   318: aload_0
/*     */     //   319: aload #4
/*     */     //   321: aload #29
/*     */     //   323: aload #29
/*     */     //   325: aload_0
/*     */     //   326: putfield L$0 : Ljava/lang/Object;
/*     */     //   329: aload #29
/*     */     //   331: aload_2
/*     */     //   332: putfield L$1 : Ljava/lang/Object;
/*     */     //   335: aload #29
/*     */     //   337: aload #4
/*     */     //   339: putfield L$2 : Ljava/lang/Object;
/*     */     //   342: aload #29
/*     */     //   344: aload #5
/*     */     //   346: putfield L$3 : Ljava/lang/Object;
/*     */     //   349: aload #29
/*     */     //   351: aload #6
/*     */     //   353: putfield L$4 : Ljava/lang/Object;
/*     */     //   356: aload #29
/*     */     //   358: aload #7
/*     */     //   360: putfield L$5 : Ljava/lang/Object;
/*     */     //   363: aload #29
/*     */     //   365: aload #8
/*     */     //   367: putfield L$6 : Ljava/lang/Object;
/*     */     //   370: aload #29
/*     */     //   372: aload #22
/*     */     //   374: putfield L$7 : Ljava/lang/Object;
/*     */     //   377: aload #29
/*     */     //   379: iconst_2
/*     */     //   380: putfield label : I
/*     */     //   383: invokespecial getTrajectoryElementAgent : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   386: dup
/*     */     //   387: aload #54
/*     */     //   389: if_acmpne -> 480
/*     */     //   392: aload #54
/*     */     //   394: areturn
/*     */     //   395: aload #29
/*     */     //   397: getfield L$7 : Ljava/lang/Object;
/*     */     //   400: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   403: astore #22
/*     */     //   405: aload #29
/*     */     //   407: getfield L$6 : Ljava/lang/Object;
/*     */     //   410: checkcast java/util/List
/*     */     //   413: astore #8
/*     */     //   415: aload #29
/*     */     //   417: getfield L$5 : Ljava/lang/Object;
/*     */     //   420: checkcast java/util/List
/*     */     //   423: astore #7
/*     */     //   425: aload #29
/*     */     //   427: getfield L$4 : Ljava/lang/Object;
/*     */     //   430: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   433: astore #6
/*     */     //   435: aload #29
/*     */     //   437: getfield L$3 : Ljava/lang/Object;
/*     */     //   440: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters
/*     */     //   443: astore #5
/*     */     //   445: aload #29
/*     */     //   447: getfield L$2 : Ljava/lang/Object;
/*     */     //   450: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   453: astore #4
/*     */     //   455: aload #29
/*     */     //   457: getfield L$1 : Ljava/lang/Object;
/*     */     //   460: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   463: astore_2
/*     */     //   464: aload #29
/*     */     //   466: getfield L$0 : Ljava/lang/Object;
/*     */     //   469: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique
/*     */     //   472: astore_0
/*     */     //   473: aload #28
/*     */     //   475: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   478: aload #28
/*     */     //   480: aload #22
/*     */     //   482: swap
/*     */     //   483: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElementAgent
/*     */     //   486: aload_0
/*     */     //   487: getfield systemPrompt : Ljava/lang/String;
/*     */     //   490: ldc_w 'system'
/*     */     //   493: iconst_0
/*     */     //   494: bipush #8
/*     */     //   496: aconst_null
/*     */     //   497: astore #30
/*     */     //   499: istore #31
/*     */     //   501: pop
/*     */     //   502: astore #32
/*     */     //   504: astore #33
/*     */     //   506: astore #34
/*     */     //   508: new com/intellij/ml/llm/matterhorn/UserTrajectoryElement
/*     */     //   511: dup
/*     */     //   512: aload #34
/*     */     //   514: aload #33
/*     */     //   516: aload #32
/*     */     //   518: iconst_0
/*     */     //   519: iload #31
/*     */     //   521: aload #30
/*     */     //   523: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   526: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElement
/*     */     //   529: aload #29
/*     */     //   531: aload #29
/*     */     //   533: aload_0
/*     */     //   534: putfield L$0 : Ljava/lang/Object;
/*     */     //   537: aload #29
/*     */     //   539: aload_2
/*     */     //   540: putfield L$1 : Ljava/lang/Object;
/*     */     //   543: aload #29
/*     */     //   545: aload #4
/*     */     //   547: putfield L$2 : Ljava/lang/Object;
/*     */     //   550: aload #29
/*     */     //   552: aload #5
/*     */     //   554: putfield L$3 : Ljava/lang/Object;
/*     */     //   557: aload #29
/*     */     //   559: aload #6
/*     */     //   561: putfield L$4 : Ljava/lang/Object;
/*     */     //   564: aload #29
/*     */     //   566: aload #7
/*     */     //   568: putfield L$5 : Ljava/lang/Object;
/*     */     //   571: aload #29
/*     */     //   573: aload #8
/*     */     //   575: putfield L$6 : Ljava/lang/Object;
/*     */     //   578: aload #29
/*     */     //   580: aconst_null
/*     */     //   581: putfield L$7 : Ljava/lang/Object;
/*     */     //   584: aload #29
/*     */     //   586: iconst_3
/*     */     //   587: putfield label : I
/*     */     //   590: invokevirtual logTrajectoryElement : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   593: dup
/*     */     //   594: aload #54
/*     */     //   596: if_acmpne -> 677
/*     */     //   599: aload #54
/*     */     //   601: areturn
/*     */     //   602: aload #29
/*     */     //   604: getfield L$6 : Ljava/lang/Object;
/*     */     //   607: checkcast java/util/List
/*     */     //   610: astore #8
/*     */     //   612: aload #29
/*     */     //   614: getfield L$5 : Ljava/lang/Object;
/*     */     //   617: checkcast java/util/List
/*     */     //   620: astore #7
/*     */     //   622: aload #29
/*     */     //   624: getfield L$4 : Ljava/lang/Object;
/*     */     //   627: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   630: astore #6
/*     */     //   632: aload #29
/*     */     //   634: getfield L$3 : Ljava/lang/Object;
/*     */     //   637: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters
/*     */     //   640: astore #5
/*     */     //   642: aload #29
/*     */     //   644: getfield L$2 : Ljava/lang/Object;
/*     */     //   647: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   650: astore #4
/*     */     //   652: aload #29
/*     */     //   654: getfield L$1 : Ljava/lang/Object;
/*     */     //   657: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   660: astore_2
/*     */     //   661: aload #29
/*     */     //   663: getfield L$0 : Ljava/lang/Object;
/*     */     //   666: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique
/*     */     //   669: astore_0
/*     */     //   670: aload #28
/*     */     //   672: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   675: aload #28
/*     */     //   677: pop
/*     */     //   678: aload_2
/*     */     //   679: astore #22
/*     */     //   681: aload_0
/*     */     //   682: aload #4
/*     */     //   684: aload #29
/*     */     //   686: aload #29
/*     */     //   688: aload_0
/*     */     //   689: putfield L$0 : Ljava/lang/Object;
/*     */     //   692: aload #29
/*     */     //   694: aload_2
/*     */     //   695: putfield L$1 : Ljava/lang/Object;
/*     */     //   698: aload #29
/*     */     //   700: aload #4
/*     */     //   702: putfield L$2 : Ljava/lang/Object;
/*     */     //   705: aload #29
/*     */     //   707: aload #5
/*     */     //   709: putfield L$3 : Ljava/lang/Object;
/*     */     //   712: aload #29
/*     */     //   714: aload #6
/*     */     //   716: putfield L$4 : Ljava/lang/Object;
/*     */     //   719: aload #29
/*     */     //   721: aload #7
/*     */     //   723: putfield L$5 : Ljava/lang/Object;
/*     */     //   726: aload #29
/*     */     //   728: aload #8
/*     */     //   730: putfield L$6 : Ljava/lang/Object;
/*     */     //   733: aload #29
/*     */     //   735: aload #22
/*     */     //   737: putfield L$7 : Ljava/lang/Object;
/*     */     //   740: aload #29
/*     */     //   742: iconst_4
/*     */     //   743: putfield label : I
/*     */     //   746: invokespecial getTrajectoryElementAgent : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   749: dup
/*     */     //   750: aload #54
/*     */     //   752: if_acmpne -> 843
/*     */     //   755: aload #54
/*     */     //   757: areturn
/*     */     //   758: aload #29
/*     */     //   760: getfield L$7 : Ljava/lang/Object;
/*     */     //   763: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   766: astore #22
/*     */     //   768: aload #29
/*     */     //   770: getfield L$6 : Ljava/lang/Object;
/*     */     //   773: checkcast java/util/List
/*     */     //   776: astore #8
/*     */     //   778: aload #29
/*     */     //   780: getfield L$5 : Ljava/lang/Object;
/*     */     //   783: checkcast java/util/List
/*     */     //   786: astore #7
/*     */     //   788: aload #29
/*     */     //   790: getfield L$4 : Ljava/lang/Object;
/*     */     //   793: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   796: astore #6
/*     */     //   798: aload #29
/*     */     //   800: getfield L$3 : Ljava/lang/Object;
/*     */     //   803: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters
/*     */     //   806: astore #5
/*     */     //   808: aload #29
/*     */     //   810: getfield L$2 : Ljava/lang/Object;
/*     */     //   813: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   816: astore #4
/*     */     //   818: aload #29
/*     */     //   820: getfield L$1 : Ljava/lang/Object;
/*     */     //   823: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   826: astore_2
/*     */     //   827: aload #29
/*     */     //   829: getfield L$0 : Ljava/lang/Object;
/*     */     //   832: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique
/*     */     //   835: astore_0
/*     */     //   836: aload #28
/*     */     //   838: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   841: aload #28
/*     */     //   843: aload #22
/*     */     //   845: swap
/*     */     //   846: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElementAgent
/*     */     //   849: aload #6
/*     */     //   851: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   854: ldc_w 'issue'
/*     */     //   857: iconst_0
/*     */     //   858: bipush #8
/*     */     //   860: aconst_null
/*     */     //   861: astore #35
/*     */     //   863: istore #36
/*     */     //   865: pop
/*     */     //   866: astore #37
/*     */     //   868: astore #38
/*     */     //   870: astore #39
/*     */     //   872: new com/intellij/ml/llm/matterhorn/UserTrajectoryElement
/*     */     //   875: dup
/*     */     //   876: aload #39
/*     */     //   878: aload #38
/*     */     //   880: aload #37
/*     */     //   882: iconst_0
/*     */     //   883: iload #36
/*     */     //   885: aload #35
/*     */     //   887: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   890: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElement
/*     */     //   893: aload #29
/*     */     //   895: aload #29
/*     */     //   897: aload_0
/*     */     //   898: putfield L$0 : Ljava/lang/Object;
/*     */     //   901: aload #29
/*     */     //   903: aload_2
/*     */     //   904: putfield L$1 : Ljava/lang/Object;
/*     */     //   907: aload #29
/*     */     //   909: aload #4
/*     */     //   911: putfield L$2 : Ljava/lang/Object;
/*     */     //   914: aload #29
/*     */     //   916: aload #5
/*     */     //   918: putfield L$3 : Ljava/lang/Object;
/*     */     //   921: aload #29
/*     */     //   923: aload #6
/*     */     //   925: putfield L$4 : Ljava/lang/Object;
/*     */     //   928: aload #29
/*     */     //   930: aload #7
/*     */     //   932: putfield L$5 : Ljava/lang/Object;
/*     */     //   935: aload #29
/*     */     //   937: aload #8
/*     */     //   939: putfield L$6 : Ljava/lang/Object;
/*     */     //   942: aload #29
/*     */     //   944: aconst_null
/*     */     //   945: putfield L$7 : Ljava/lang/Object;
/*     */     //   948: aload #29
/*     */     //   950: iconst_5
/*     */     //   951: putfield label : I
/*     */     //   954: invokevirtual logTrajectoryElement : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   957: dup
/*     */     //   958: aload #54
/*     */     //   960: if_acmpne -> 1041
/*     */     //   963: aload #54
/*     */     //   965: areturn
/*     */     //   966: aload #29
/*     */     //   968: getfield L$6 : Ljava/lang/Object;
/*     */     //   971: checkcast java/util/List
/*     */     //   974: astore #8
/*     */     //   976: aload #29
/*     */     //   978: getfield L$5 : Ljava/lang/Object;
/*     */     //   981: checkcast java/util/List
/*     */     //   984: astore #7
/*     */     //   986: aload #29
/*     */     //   988: getfield L$4 : Ljava/lang/Object;
/*     */     //   991: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   994: astore #6
/*     */     //   996: aload #29
/*     */     //   998: getfield L$3 : Ljava/lang/Object;
/*     */     //   1001: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters
/*     */     //   1004: astore #5
/*     */     //   1006: aload #29
/*     */     //   1008: getfield L$2 : Ljava/lang/Object;
/*     */     //   1011: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   1014: astore #4
/*     */     //   1016: aload #29
/*     */     //   1018: getfield L$1 : Ljava/lang/Object;
/*     */     //   1021: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   1024: astore_2
/*     */     //   1025: aload #29
/*     */     //   1027: getfield L$0 : Ljava/lang/Object;
/*     */     //   1030: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique
/*     */     //   1033: astore_0
/*     */     //   1034: aload #28
/*     */     //   1036: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1039: aload #28
/*     */     //   1041: pop
/*     */     //   1042: aload #8
/*     */     //   1044: checkcast java/lang/Iterable
/*     */     //   1047: astore #9
/*     */     //   1049: iconst_0
/*     */     //   1050: istore #10
/*     */     //   1052: aload #9
/*     */     //   1054: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   1059: astore #11
/*     */     //   1061: aload #11
/*     */     //   1063: invokeinterface hasNext : ()Z
/*     */     //   1068: ifeq -> 1528
/*     */     //   1071: aload #11
/*     */     //   1073: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   1078: astore #12
/*     */     //   1080: aload #12
/*     */     //   1082: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   1085: astore #13
/*     */     //   1087: iconst_0
/*     */     //   1088: istore #14
/*     */     //   1090: aload_2
/*     */     //   1091: astore #17
/*     */     //   1093: aload_0
/*     */     //   1094: aload #4
/*     */     //   1096: aload #29
/*     */     //   1098: aload #29
/*     */     //   1100: aload_0
/*     */     //   1101: putfield L$0 : Ljava/lang/Object;
/*     */     //   1104: aload #29
/*     */     //   1106: aload_2
/*     */     //   1107: putfield L$1 : Ljava/lang/Object;
/*     */     //   1110: aload #29
/*     */     //   1112: aload #4
/*     */     //   1114: putfield L$2 : Ljava/lang/Object;
/*     */     //   1117: aload #29
/*     */     //   1119: aload #5
/*     */     //   1121: putfield L$3 : Ljava/lang/Object;
/*     */     //   1124: aload #29
/*     */     //   1126: aload #6
/*     */     //   1128: putfield L$4 : Ljava/lang/Object;
/*     */     //   1131: aload #29
/*     */     //   1133: aload #7
/*     */     //   1135: putfield L$5 : Ljava/lang/Object;
/*     */     //   1138: aload #29
/*     */     //   1140: aload #8
/*     */     //   1142: putfield L$6 : Ljava/lang/Object;
/*     */     //   1145: aload #29
/*     */     //   1147: aload #11
/*     */     //   1149: putfield L$7 : Ljava/lang/Object;
/*     */     //   1152: aload #29
/*     */     //   1154: aload #13
/*     */     //   1156: putfield L$8 : Ljava/lang/Object;
/*     */     //   1159: aload #29
/*     */     //   1161: aload #17
/*     */     //   1163: putfield L$9 : Ljava/lang/Object;
/*     */     //   1166: aload #29
/*     */     //   1168: bipush #6
/*     */     //   1170: putfield label : I
/*     */     //   1173: invokespecial getTrajectoryElementAgent : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1176: dup
/*     */     //   1177: aload #54
/*     */     //   1179: if_acmpne -> 1296
/*     */     //   1182: aload #54
/*     */     //   1184: areturn
/*     */     //   1185: iconst_0
/*     */     //   1186: istore #10
/*     */     //   1188: iconst_0
/*     */     //   1189: istore #14
/*     */     //   1191: aload #29
/*     */     //   1193: getfield L$9 : Ljava/lang/Object;
/*     */     //   1196: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   1199: astore #17
/*     */     //   1201: aload #29
/*     */     //   1203: getfield L$8 : Ljava/lang/Object;
/*     */     //   1206: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   1209: astore #13
/*     */     //   1211: aload #29
/*     */     //   1213: getfield L$7 : Ljava/lang/Object;
/*     */     //   1216: checkcast java/util/Iterator
/*     */     //   1219: astore #11
/*     */     //   1221: aload #29
/*     */     //   1223: getfield L$6 : Ljava/lang/Object;
/*     */     //   1226: checkcast java/util/List
/*     */     //   1229: astore #8
/*     */     //   1231: aload #29
/*     */     //   1233: getfield L$5 : Ljava/lang/Object;
/*     */     //   1236: checkcast java/util/List
/*     */     //   1239: astore #7
/*     */     //   1241: aload #29
/*     */     //   1243: getfield L$4 : Ljava/lang/Object;
/*     */     //   1246: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   1249: astore #6
/*     */     //   1251: aload #29
/*     */     //   1253: getfield L$3 : Ljava/lang/Object;
/*     */     //   1256: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters
/*     */     //   1259: astore #5
/*     */     //   1261: aload #29
/*     */     //   1263: getfield L$2 : Ljava/lang/Object;
/*     */     //   1266: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   1269: astore #4
/*     */     //   1271: aload #29
/*     */     //   1273: getfield L$1 : Ljava/lang/Object;
/*     */     //   1276: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   1279: astore_2
/*     */     //   1280: aload #29
/*     */     //   1282: getfield L$0 : Ljava/lang/Object;
/*     */     //   1285: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique
/*     */     //   1288: astore_0
/*     */     //   1289: aload #28
/*     */     //   1291: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1294: aload #28
/*     */     //   1296: aload #17
/*     */     //   1298: swap
/*     */     //   1299: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElementAgent
/*     */     //   1302: aload #13
/*     */     //   1304: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   1307: ldc_w 'report'
/*     */     //   1310: iconst_0
/*     */     //   1311: bipush #8
/*     */     //   1313: aconst_null
/*     */     //   1314: astore #40
/*     */     //   1316: istore #41
/*     */     //   1318: pop
/*     */     //   1319: astore #42
/*     */     //   1321: astore #43
/*     */     //   1323: astore #44
/*     */     //   1325: new com/intellij/ml/llm/matterhorn/UserTrajectoryElement
/*     */     //   1328: dup
/*     */     //   1329: aload #44
/*     */     //   1331: aload #43
/*     */     //   1333: aload #42
/*     */     //   1335: iconst_0
/*     */     //   1336: iload #41
/*     */     //   1338: aload #40
/*     */     //   1340: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   1343: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElement
/*     */     //   1346: aload #29
/*     */     //   1348: aload #29
/*     */     //   1350: aload_0
/*     */     //   1351: putfield L$0 : Ljava/lang/Object;
/*     */     //   1354: aload #29
/*     */     //   1356: aload_2
/*     */     //   1357: putfield L$1 : Ljava/lang/Object;
/*     */     //   1360: aload #29
/*     */     //   1362: aload #4
/*     */     //   1364: putfield L$2 : Ljava/lang/Object;
/*     */     //   1367: aload #29
/*     */     //   1369: aload #5
/*     */     //   1371: putfield L$3 : Ljava/lang/Object;
/*     */     //   1374: aload #29
/*     */     //   1376: aload #6
/*     */     //   1378: putfield L$4 : Ljava/lang/Object;
/*     */     //   1381: aload #29
/*     */     //   1383: aload #7
/*     */     //   1385: putfield L$5 : Ljava/lang/Object;
/*     */     //   1388: aload #29
/*     */     //   1390: aload #8
/*     */     //   1392: putfield L$6 : Ljava/lang/Object;
/*     */     //   1395: aload #29
/*     */     //   1397: aload #11
/*     */     //   1399: putfield L$7 : Ljava/lang/Object;
/*     */     //   1402: aload #29
/*     */     //   1404: aconst_null
/*     */     //   1405: putfield L$8 : Ljava/lang/Object;
/*     */     //   1408: aload #29
/*     */     //   1410: aconst_null
/*     */     //   1411: putfield L$9 : Ljava/lang/Object;
/*     */     //   1414: aload #29
/*     */     //   1416: bipush #7
/*     */     //   1418: putfield label : I
/*     */     //   1421: invokevirtual logTrajectoryElement : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1424: dup
/*     */     //   1425: aload #54
/*     */     //   1427: if_acmpne -> 1524
/*     */     //   1430: aload #54
/*     */     //   1432: areturn
/*     */     //   1433: iconst_0
/*     */     //   1434: istore #10
/*     */     //   1436: iconst_0
/*     */     //   1437: istore #14
/*     */     //   1439: aload #29
/*     */     //   1441: getfield L$7 : Ljava/lang/Object;
/*     */     //   1444: checkcast java/util/Iterator
/*     */     //   1447: astore #11
/*     */     //   1449: aload #29
/*     */     //   1451: getfield L$6 : Ljava/lang/Object;
/*     */     //   1454: checkcast java/util/List
/*     */     //   1457: astore #8
/*     */     //   1459: aload #29
/*     */     //   1461: getfield L$5 : Ljava/lang/Object;
/*     */     //   1464: checkcast java/util/List
/*     */     //   1467: astore #7
/*     */     //   1469: aload #29
/*     */     //   1471: getfield L$4 : Ljava/lang/Object;
/*     */     //   1474: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   1477: astore #6
/*     */     //   1479: aload #29
/*     */     //   1481: getfield L$3 : Ljava/lang/Object;
/*     */     //   1484: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters
/*     */     //   1487: astore #5
/*     */     //   1489: aload #29
/*     */     //   1491: getfield L$2 : Ljava/lang/Object;
/*     */     //   1494: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   1497: astore #4
/*     */     //   1499: aload #29
/*     */     //   1501: getfield L$1 : Ljava/lang/Object;
/*     */     //   1504: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   1507: astore_2
/*     */     //   1508: aload #29
/*     */     //   1510: getfield L$0 : Ljava/lang/Object;
/*     */     //   1513: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique
/*     */     //   1516: astore_0
/*     */     //   1517: aload #28
/*     */     //   1519: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1522: aload #28
/*     */     //   1524: pop
/*     */     //   1525: goto -> 1061
/*     */     //   1528: nop
/*     */     //   1529: new com/intellij/ml/llm/matterhorn/requests/SimpleRequest
/*     */     //   1532: dup
/*     */     //   1533: aload_0
/*     */     //   1534: getfield systemPrompt : Ljava/lang/String;
/*     */     //   1537: aload #6
/*     */     //   1539: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   1542: checkcast java/util/Collection
/*     */     //   1545: aload #8
/*     */     //   1547: checkcast java/lang/Iterable
/*     */     //   1550: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   1553: aload #5
/*     */     //   1555: invokevirtual getModelParameters : ()Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   1558: aconst_null
/*     */     //   1559: bipush #8
/*     */     //   1561: aconst_null
/*     */     //   1562: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   1565: astore #9
/*     */     //   1567: new com/intellij/ml/llm/matterhorn/requests/UserReviewedRequest
/*     */     //   1570: dup
/*     */     //   1571: aload #9
/*     */     //   1573: checkcast com/intellij/ml/llm/matterhorn/requests/GrazieRequest
/*     */     //   1576: aload #5
/*     */     //   1578: invokevirtual getModelParameters : ()Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   1581: new com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique$produceArtifact$request$1
/*     */     //   1584: dup
/*     */     //   1585: aload_0
/*     */     //   1586: aload #7
/*     */     //   1588: aconst_null
/*     */     //   1589: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique;Ljava/util/List;Lkotlin/coroutines/Continuation;)V
/*     */     //   1592: checkcast kotlin/jvm/functions/Function3
/*     */     //   1595: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/jvm/functions/Function3;)V
/*     */     //   1598: astore #10
/*     */     //   1600: aload_2
/*     */     //   1601: aload #10
/*     */     //   1603: checkcast com/intellij/ml/llm/matterhorn/requests/GrazieRequest
/*     */     //   1606: iconst_0
/*     */     //   1607: aload #29
/*     */     //   1609: iconst_2
/*     */     //   1610: aconst_null
/*     */     //   1611: aload #29
/*     */     //   1613: aload_0
/*     */     //   1614: putfield L$0 : Ljava/lang/Object;
/*     */     //   1617: aload #29
/*     */     //   1619: aload_2
/*     */     //   1620: putfield L$1 : Ljava/lang/Object;
/*     */     //   1623: aload #29
/*     */     //   1625: aload #4
/*     */     //   1627: putfield L$2 : Ljava/lang/Object;
/*     */     //   1630: aload #29
/*     */     //   1632: aload #7
/*     */     //   1634: putfield L$3 : Ljava/lang/Object;
/*     */     //   1637: aload #29
/*     */     //   1639: aload #8
/*     */     //   1641: putfield L$4 : Ljava/lang/Object;
/*     */     //   1644: aload #29
/*     */     //   1646: aconst_null
/*     */     //   1647: putfield L$5 : Ljava/lang/Object;
/*     */     //   1650: aload #29
/*     */     //   1652: aconst_null
/*     */     //   1653: putfield L$6 : Ljava/lang/Object;
/*     */     //   1656: aload #29
/*     */     //   1658: aconst_null
/*     */     //   1659: putfield L$7 : Ljava/lang/Object;
/*     */     //   1662: aload #29
/*     */     //   1664: bipush #8
/*     */     //   1666: putfield label : I
/*     */     //   1669: invokestatic sendToGrazie$default : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   1672: dup
/*     */     //   1673: aload #54
/*     */     //   1675: if_acmpne -> 1736
/*     */     //   1678: aload #54
/*     */     //   1680: areturn
/*     */     //   1681: aload #29
/*     */     //   1683: getfield L$4 : Ljava/lang/Object;
/*     */     //   1686: checkcast java/util/List
/*     */     //   1689: astore #8
/*     */     //   1691: aload #29
/*     */     //   1693: getfield L$3 : Ljava/lang/Object;
/*     */     //   1696: checkcast java/util/List
/*     */     //   1699: astore #7
/*     */     //   1701: aload #29
/*     */     //   1703: getfield L$2 : Ljava/lang/Object;
/*     */     //   1706: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   1709: astore #4
/*     */     //   1711: aload #29
/*     */     //   1713: getfield L$1 : Ljava/lang/Object;
/*     */     //   1716: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   1719: astore_2
/*     */     //   1720: aload #29
/*     */     //   1722: getfield L$0 : Ljava/lang/Object;
/*     */     //   1725: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique
/*     */     //   1728: astore_0
/*     */     //   1729: aload #28
/*     */     //   1731: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1734: aload #28
/*     */     //   1736: checkcast java/lang/String
/*     */     //   1739: astore #11
/*     */     //   1741: aload_0
/*     */     //   1742: aload #11
/*     */     //   1744: aload #7
/*     */     //   1746: invokespecial parseBestAction : (Ljava/lang/String;Ljava/util/List;)Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*     */     //   1749: invokestatic getOrNull : (Lcom/intellij/ml/llm/matterhorn/ej/core/Result;)Ljava/lang/Object;
/*     */     //   1752: checkcast java/lang/Integer
/*     */     //   1755: dup
/*     */     //   1756: ifnull -> 1765
/*     */     //   1759: invokevirtual intValue : ()I
/*     */     //   1762: goto -> 1767
/*     */     //   1765: pop
/*     */     //   1766: iconst_0
/*     */     //   1767: istore #12
/*     */     //   1769: aload_2
/*     */     //   1770: astore #22
/*     */     //   1772: aload_0
/*     */     //   1773: aload #4
/*     */     //   1775: aload #29
/*     */     //   1777: aload #29
/*     */     //   1779: aload #7
/*     */     //   1781: putfield L$0 : Ljava/lang/Object;
/*     */     //   1784: aload #29
/*     */     //   1786: aload #8
/*     */     //   1788: putfield L$1 : Ljava/lang/Object;
/*     */     //   1791: aload #29
/*     */     //   1793: aload #11
/*     */     //   1795: putfield L$2 : Ljava/lang/Object;
/*     */     //   1798: aload #29
/*     */     //   1800: aload #22
/*     */     //   1802: putfield L$3 : Ljava/lang/Object;
/*     */     //   1805: aload #29
/*     */     //   1807: aconst_null
/*     */     //   1808: putfield L$4 : Ljava/lang/Object;
/*     */     //   1811: aload #29
/*     */     //   1813: iload #12
/*     */     //   1815: putfield I$0 : I
/*     */     //   1818: aload #29
/*     */     //   1820: bipush #9
/*     */     //   1822: putfield label : I
/*     */     //   1825: invokespecial getTrajectoryElementAgent : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1828: dup
/*     */     //   1829: aload #54
/*     */     //   1831: if_acmpne -> 1891
/*     */     //   1834: aload #54
/*     */     //   1836: areturn
/*     */     //   1837: aload #29
/*     */     //   1839: getfield I$0 : I
/*     */     //   1842: istore #12
/*     */     //   1844: aload #29
/*     */     //   1846: getfield L$3 : Ljava/lang/Object;
/*     */     //   1849: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   1852: astore #22
/*     */     //   1854: aload #29
/*     */     //   1856: getfield L$2 : Ljava/lang/Object;
/*     */     //   1859: checkcast java/lang/String
/*     */     //   1862: astore #11
/*     */     //   1864: aload #29
/*     */     //   1866: getfield L$1 : Ljava/lang/Object;
/*     */     //   1869: checkcast java/util/List
/*     */     //   1872: astore #8
/*     */     //   1874: aload #29
/*     */     //   1876: getfield L$0 : Ljava/lang/Object;
/*     */     //   1879: checkcast java/util/List
/*     */     //   1882: astore #7
/*     */     //   1884: aload #28
/*     */     //   1886: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1889: aload #28
/*     */     //   1891: aload #22
/*     */     //   1893: swap
/*     */     //   1894: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElementAgent
/*     */     //   1897: aload #11
/*     */     //   1899: ldc_w ''
/*     */     //   1902: iload #12
/*     */     //   1904: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */     //   1909: aload #8
/*     */     //   1911: checkcast java/lang/Iterable
/*     */     //   1914: astore #13
/*     */     //   1916: astore #26
/*     */     //   1918: astore #25
/*     */     //   1920: astore #24
/*     */     //   1922: astore #23
/*     */     //   1924: astore #22
/*     */     //   1926: iconst_0
/*     */     //   1927: istore #14
/*     */     //   1929: aload #13
/*     */     //   1931: astore #15
/*     */     //   1933: new java/util/ArrayList
/*     */     //   1936: dup
/*     */     //   1937: aload #13
/*     */     //   1939: bipush #10
/*     */     //   1941: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   1944: invokespecial <init> : (I)V
/*     */     //   1947: checkcast java/util/Collection
/*     */     //   1950: astore #16
/*     */     //   1952: iconst_0
/*     */     //   1953: istore #17
/*     */     //   1955: aload #15
/*     */     //   1957: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   1962: astore #18
/*     */     //   1964: aload #18
/*     */     //   1966: invokeinterface hasNext : ()Z
/*     */     //   1971: ifeq -> 2014
/*     */     //   1974: aload #18
/*     */     //   1976: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   1981: astore #19
/*     */     //   1983: aload #16
/*     */     //   1985: aload #19
/*     */     //   1987: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   1990: astore #20
/*     */     //   1992: astore #27
/*     */     //   1994: iconst_0
/*     */     //   1995: istore #21
/*     */     //   1997: aload #20
/*     */     //   1999: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   2002: aload #27
/*     */     //   2004: swap
/*     */     //   2005: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   2010: pop
/*     */     //   2011: goto -> 1964
/*     */     //   2014: aload #16
/*     */     //   2016: checkcast java/util/List
/*     */     //   2019: nop
/*     */     //   2020: astore #27
/*     */     //   2022: aload #22
/*     */     //   2024: aload #23
/*     */     //   2026: aload #24
/*     */     //   2028: aload #25
/*     */     //   2030: aload #26
/*     */     //   2032: aload #27
/*     */     //   2034: checkcast java/lang/Iterable
/*     */     //   2037: invokestatic toList : (Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   2040: aconst_null
/*     */     //   2041: aconst_null
/*     */     //   2042: bipush #64
/*     */     //   2044: aconst_null
/*     */     //   2045: astore #45
/*     */     //   2047: istore #46
/*     */     //   2049: astore #47
/*     */     //   2051: astore #48
/*     */     //   2053: astore #49
/*     */     //   2055: astore #50
/*     */     //   2057: astore #51
/*     */     //   2059: astore #52
/*     */     //   2061: astore #53
/*     */     //   2063: new com/intellij/ml/llm/matterhorn/AssistantTrajectoryElement
/*     */     //   2066: dup
/*     */     //   2067: aload #53
/*     */     //   2069: aload #52
/*     */     //   2071: aload #51
/*     */     //   2073: aload #50
/*     */     //   2075: aload #49
/*     */     //   2077: aload #48
/*     */     //   2079: aload #47
/*     */     //   2081: iload #46
/*     */     //   2083: aload #45
/*     */     //   2085: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   2088: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElement
/*     */     //   2091: aload #29
/*     */     //   2093: aload #29
/*     */     //   2095: aload #7
/*     */     //   2097: putfield L$0 : Ljava/lang/Object;
/*     */     //   2100: aload #29
/*     */     //   2102: aconst_null
/*     */     //   2103: putfield L$1 : Ljava/lang/Object;
/*     */     //   2106: aload #29
/*     */     //   2108: aconst_null
/*     */     //   2109: putfield L$2 : Ljava/lang/Object;
/*     */     //   2112: aload #29
/*     */     //   2114: aconst_null
/*     */     //   2115: putfield L$3 : Ljava/lang/Object;
/*     */     //   2118: aload #29
/*     */     //   2120: iload #12
/*     */     //   2122: putfield I$0 : I
/*     */     //   2125: aload #29
/*     */     //   2127: bipush #10
/*     */     //   2129: putfield label : I
/*     */     //   2132: invokevirtual logTrajectoryElement : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   2135: dup
/*     */     //   2136: aload #54
/*     */     //   2138: if_acmpne -> 2168
/*     */     //   2141: aload #54
/*     */     //   2143: areturn
/*     */     //   2144: aload #29
/*     */     //   2146: getfield I$0 : I
/*     */     //   2149: istore #12
/*     */     //   2151: aload #29
/*     */     //   2153: getfield L$0 : Ljava/lang/Object;
/*     */     //   2156: checkcast java/util/List
/*     */     //   2159: astore #7
/*     */     //   2161: aload #28
/*     */     //   2163: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   2166: aload #28
/*     */     //   2168: pop
/*     */     //   2169: new com/intellij/ml/llm/matterhorn/ArtifactResponse
/*     */     //   2172: dup
/*     */     //   2173: new com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueResponse
/*     */     //   2176: dup
/*     */     //   2177: aload #7
/*     */     //   2179: iload #12
/*     */     //   2181: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   2186: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult
/*     */     //   2189: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;)V
/*     */     //   2192: aconst_null
/*     */     //   2193: iconst_2
/*     */     //   2194: aconst_null
/*     */     //   2195: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   2198: areturn
/*     */     //   2199: new java/lang/IllegalStateException
/*     */     //   2202: dup
/*     */     //   2203: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   2205: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   2208: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #74	-> 60
/*     */     //   #79	-> 129
/*     */     //   #80	-> 142
/*     */     //   #83	-> 170
/*     */     //   #84	-> 178
/*     */     //   #85	-> 187
/*     */     //   #74	-> 232
/*     */     //   #87	-> 284
/*     */     //   #88	-> 301
/*     */     //   #89	-> 307
/*     */     //   #91	-> 315
/*     */     //   #74	-> 392
/*     */     //   #91	-> 480
/*     */     //   #74	-> 599
/*     */     //   #92	-> 677
/*     */     //   #74	-> 755
/*     */     //   #92	-> 843
/*     */     //   #74	-> 963
/*     */     //   #93	-> 1041
/*     */     //   #185	-> 1052
/*     */     //   #94	-> 1090
/*     */     //   #74	-> 1182
/*     */     //   #94	-> 1296
/*     */     //   #74	-> 1430
/*     */     //   #95	-> 1524
/*     */     //   #185	-> 1525
/*     */     //   #186	-> 1528
/*     */     //   #97	-> 1529
/*     */     //   #98	-> 1567
/*     */     //   #106	-> 1600
/*     */     //   #74	-> 1678
/*     */     //   #107	-> 1741
/*     */     //   #109	-> 1769
/*     */     //   #74	-> 1834
/*     */     //   #187	-> 1929
/*     */     //   #188	-> 1955
/*     */     //   #189	-> 1983
/*     */     //   #109	-> 1997
/*     */     //   #189	-> 2005
/*     */     //   #190	-> 2014
/*     */     //   #187	-> 2019
/*     */     //   #109	-> 2037
/*     */     //   #74	-> 2141
/*     */     //   #110	-> 2168
/*     */     //   #74	-> 2199
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   129	106	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique;
/*     */     //   272	123	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique;
/*     */     //   473	129	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique;
/*     */     //   670	88	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique;
/*     */     //   836	130	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique;
/*     */     //   1034	151	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique;
/*     */     //   1289	144	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique;
/*     */     //   1517	164	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique;
/*     */     //   1729	99	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique;
/*     */     //   129	106	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueInput;
/*     */     //   263	44	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueInput;
/*     */     //   129	106	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   254	141	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   464	138	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   661	97	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   827	139	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1025	160	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1280	153	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1508	173	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1720	108	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   187	48	4	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   245	150	4	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   455	147	4	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   652	106	4	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   818	148	4	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   1016	169	4	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   1271	162	4	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   1499	182	4	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   1711	117	4	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   284	111	5	editCritiqueParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters;
/*     */     //   445	157	5	editCritiqueParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters;
/*     */     //   642	116	5	editCritiqueParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters;
/*     */     //   808	158	5	editCritiqueParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters;
/*     */     //   1006	179	5	editCritiqueParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters;
/*     */     //   1261	172	5	editCritiqueParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters;
/*     */     //   1489	36	5	editCritiqueParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters;
/*     */     //   1525	4	5	editCritiqueParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters;
/*     */     //   1529	71	5	editCritiqueParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters;
/*     */     //   301	94	6	issue	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   435	167	6	issue	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   632	126	6	issue	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   798	168	6	issue	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   996	189	6	issue	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   1251	182	6	issue	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   1479	46	6	issue	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   1525	4	6	issue	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   1529	38	6	issue	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   307	88	7	actionsToRank	Ljava/util/List;
/*     */     //   425	177	7	actionsToRank	Ljava/util/List;
/*     */     //   622	136	7	actionsToRank	Ljava/util/List;
/*     */     //   788	178	7	actionsToRank	Ljava/util/List;
/*     */     //   986	199	7	actionsToRank	Ljava/util/List;
/*     */     //   1241	192	7	actionsToRank	Ljava/util/List;
/*     */     //   1469	212	7	actionsToRank	Ljava/util/List;
/*     */     //   1701	136	7	actionsToRank	Ljava/util/List;
/*     */     //   1884	260	7	actionsToRank	Ljava/util/List;
/*     */     //   2161	38	7	actionsToRank	Ljava/util/List;
/*     */     //   315	80	8	choiceMessage	Ljava/util/List;
/*     */     //   415	187	8	choiceMessage	Ljava/util/List;
/*     */     //   612	146	8	choiceMessage	Ljava/util/List;
/*     */     //   778	188	8	choiceMessage	Ljava/util/List;
/*     */     //   976	209	8	choiceMessage	Ljava/util/List;
/*     */     //   1231	202	8	choiceMessage	Ljava/util/List;
/*     */     //   1459	222	8	choiceMessage	Ljava/util/List;
/*     */     //   1691	146	8	choiceMessage	Ljava/util/List;
/*     */     //   1874	52	8	choiceMessage	Ljava/util/List;
/*     */     //   1049	12	9	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   1567	33	9	simpleRequest	Lcom/intellij/ml/llm/matterhorn/requests/SimpleRequest;
/*     */     //   1600	72	10	request	Lcom/intellij/ml/llm/matterhorn/requests/UserReviewedRequest;
/*     */     //   1741	96	11	response	Ljava/lang/String;
/*     */     //   1864	62	11	response	Ljava/lang/String;
/*     */     //   1080	7	12	element$iv	Ljava/lang/Object;
/*     */     //   1769	68	12	bestActionIdx	I
/*     */     //   1844	300	12	bestActionIdx	I
/*     */     //   2151	48	12	bestActionIdx	I
/*     */     //   1087	98	13	it	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   1211	124	13	it	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   1926	26	13	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   1952	12	15	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   1952	64	16	destination$iv$iv	Ljava/util/Collection;
/*     */     //   1983	28	19	item$iv$iv	Ljava/lang/Object;
/*     */     //   1994	8	20	it	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   1090	95	14	$i$a$-forEach-TaskReportReportCritique$produceArtifact$2	I
/*     */     //   1052	133	10	$i$f$forEach	I
/*     */     //   1997	5	21	$i$a$-map-TaskReportReportCritique$produceArtifact$3	I
/*     */     //   1955	61	17	$i$f$mapTo	I
/*     */     //   1929	91	14	$i$f$map	I
/*     */     //   0	2209	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	2149	29	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	2142	28	$result	Ljava/lang/Object;
/*     */     //   1191	242	14	$i$a$-forEach-TaskReportReportCritique$produceArtifact$2	I
/*     */     //   1188	245	10	$i$f$forEach	I
/*     */     //   1439	86	14	$i$a$-forEach-TaskReportReportCritique$produceArtifact$2	I
/*     */     //   1436	93	10	$i$f$forEach	I
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AgentReportCritique.kt", l = {114, 115}, i = {0}, s = {"L$0"}, n = {"propertyProvider"}, m = "getAgentParameters", c = "com.intellij.ml.llm.matterhorn.ej.core.critique.TaskReportReportCritique")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class TaskReportReportCritique$getAgentParameters$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     TaskReportReportCritique$getAgentParameters$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return TaskReportReportCritique.this.getAgentParameters(null, (Continuation)this);
/*     */     } }
/*     */   
/*     */   @DebugMetadata(f = "AgentReportCritique.kt", l = {68}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "json"}, m = "getTrajectoryElementAgent", c = "com.intellij.ml.llm.matterhorn.ej.core.critique.TaskReportReportCritique")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class TaskReportReportCritique$getTrajectoryElementAgent$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     TaskReportReportCritique$getTrajectoryElementAgent$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return TaskReportReportCritique.this.getTrajectoryElementAgent(null, (Continuation)this);
/*     */     } }
/*     */   
/*     */   @DebugMetadata(f = "AgentReportCritique.kt", l = {85, 91, 91, 92, 92, 94, 94, 106, 109, 109}, i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "I$0", "L$0", "I$0"}, n = {"this", "input", "context", "propertyProvider", "this", "context", "propertyProvider", "editCritiqueParameters", "issue", "actionsToRank", "choiceMessage", "this", "context", "propertyProvider", "editCritiqueParameters", "issue", "actionsToRank", "choiceMessage", "this", "context", "propertyProvider", "editCritiqueParameters", "issue", "actionsToRank", "choiceMessage", "this", "context", "propertyProvider", "editCritiqueParameters", "issue", "actionsToRank", "choiceMessage", "this", "context", "propertyProvider", "editCritiqueParameters", "issue", "actionsToRank", "choiceMessage", "it", "this", "context", "propertyProvider", "editCritiqueParameters", "issue", "actionsToRank", "choiceMessage", "this", "context", "propertyProvider", "actionsToRank", "choiceMessage", "actionsToRank", "choiceMessage", "response", "bestActionIdx", "actionsToRank", "bestActionIdx"}, m = "produceArtifact", c = "com.intellij.ml.llm.matterhorn.ej.core.critique.TaskReportReportCritique")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class TaskReportReportCritique$produceArtifact$1 extends ContinuationImpl {
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
/*     */     int I$0;
/*     */     int label;
/*     */     
/*     */     TaskReportReportCritique$produceArtifact$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return TaskReportReportCritique.this.produceArtifact((TaskReportCritiqueInput)null, (ExecutionContext)null, (Continuation<? super ArtifactResponse<TaskReportCritiqueResponse>>)this);
/*     */     } }
/*     */   
/*     */   @DebugMetadata(f = "AgentReportCritique.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.critique.TaskReportReportCritique$produceArtifact$request$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse;", "answer", "", "attempt", ""})
/*     */   static final class TaskReportReportCritique$produceArtifact$request$1 extends SuspendLambda implements Function3<String, Integer, Continuation<? super ReviewerResponse>, Object> {
/*     */     int label;
/*     */     
/*     */     TaskReportReportCritique$produceArtifact$request$1(List<TaskResult> $actionsToRank, Continuation $completion) {
/*     */       super(3, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       String answer;
/*     */       Result parseRes;
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           answer = (String)this.L$0;
/*     */           parseRes = TaskReportReportCritique.this.parseBestAction(answer, this.$actionsToRank);
/*     */           if (parseRes instanceof Result.Err)
/*     */             return ReviewerResponse.Companion.error$default(ReviewerResponse.Companion, ((Result.Err)parseRes).getMessage(), null, 2, null); 
/*     */           return ReviewerResponse.Companion.ok();
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Object invoke(String p1, int p2, Continuation<? super TaskReportReportCritique$produceArtifact$request$1> p3) {
/*     */       TaskReportReportCritique$produceArtifact$request$1 taskReportReportCritique$produceArtifact$request$1 = new TaskReportReportCritique$produceArtifact$request$1(this.$actionsToRank, p3);
/*     */       taskReportReportCritique$produceArtifact$request$1.L$0 = p1;
/*     */       return taskReportReportCritique$produceArtifact$request$1.invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   @NotNull
/* 175 */   private final String systemPrompt = "\nSETTING: You are a critic evaluating an autonomous programmer who interacts directly with the command line through a specialized interface. The programmer's objective is to resolve a specific issue within a given repository.\n\nYou will receive the initial issue description and the few PRs from the autonomous programmers with final patch and *the history of interactions with the environment*, which may be partial or complete. Your task is to critically assess the proposed PRs and select the best PR based on the effectiveness in resolving the issue.\nRemember that you should always select exactly on best command (even if all commands are bad).\n\nInstructions:\n\nEvaluation Criteria:\n- Superior Performance: The PR demonstrates a highly logical and efficient approach towards resolving the issue.\n- Inferior Performance: The PR fails to contribute to resolving the issue or introduces new problems.\n\nWrite you review on every provided PR and select the most effective PR from provided options.\n\nRESPONSE FORMAT:\n" + this.commandDirective + " <Provide id of the PR>: <Provide a detailed reason for your evaluation of this PR, noting any potential for improvement and potential bugs>\n" + 
/* 176 */     this.commandDirective + " <Provide id of the PR>: <Provide a detailed reason for your evaluation of this PR, noting any potential for improvement and potential bugs>\n...\n```\n" + 
/*     */ 
/*     */     
/* 179 */     this.bestCommandDirective + " \n" + 
/* 180 */     this.commandDirective + " <Provide id of the PR>\n```\n";
/*     */ 
/*     */   
/*     */   private final Object getAgentParameters(MatterhornPropertyProvider propertyProvider, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique$getAgentParameters$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique$getAgentParameters$1
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
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique$getAgentParameters$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #6
/*     */     //   50: aload #6
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #5
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #7
/*     */     //   62: aload #6
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 229, 0 -> 92, 1 -> 131, 2 -> 214
/*     */     //   92: aload #5
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: getstatic com/intellij/ml/llm/matterhorn/llm/ModelParameters.Companion : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters$Companion;
/*     */     //   100: aload_0
/*     */     //   101: getfield agentName : Ljava/lang/String;
/*     */     //   104: aload_1
/*     */     //   105: aload #6
/*     */     //   107: aload #6
/*     */     //   109: aload_1
/*     */     //   110: putfield L$0 : Ljava/lang/Object;
/*     */     //   113: aload #6
/*     */     //   115: iconst_1
/*     */     //   116: putfield label : I
/*     */     //   119: invokevirtual getDefaultModel : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   122: dup
/*     */     //   123: aload #7
/*     */     //   125: if_acmpne -> 147
/*     */     //   128: aload #7
/*     */     //   130: areturn
/*     */     //   131: aload #6
/*     */     //   133: getfield L$0 : Ljava/lang/Object;
/*     */     //   136: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   139: astore_1
/*     */     //   140: aload #5
/*     */     //   142: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   145: aload #5
/*     */     //   147: checkcast com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*     */     //   150: aconst_null
/*     */     //   151: iconst_0
/*     */     //   152: dconst_0
/*     */     //   153: invokestatic boxDouble : (D)Ljava/lang/Double;
/*     */     //   156: aconst_null
/*     */     //   157: aconst_null
/*     */     //   158: aconst_null
/*     */     //   159: aconst_null
/*     */     //   160: aconst_null
/*     */     //   161: aconst_null
/*     */     //   162: aconst_null
/*     */     //   163: aconst_null
/*     */     //   164: aconst_null
/*     */     //   165: aconst_null
/*     */     //   166: iconst_0
/*     */     //   167: aconst_null
/*     */     //   168: sipush #32763
/*     */     //   171: aconst_null
/*     */     //   172: invokestatic copy$default : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lcom/intellij/ml/llm/matterhorn/llm/LLM;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   175: astore_3
/*     */     //   176: getstatic com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters$Companion;
/*     */     //   179: new com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters
/*     */     //   182: dup
/*     */     //   183: aload_3
/*     */     //   184: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;)V
/*     */     //   187: aload_1
/*     */     //   188: aload #6
/*     */     //   190: aload #6
/*     */     //   192: aconst_null
/*     */     //   193: putfield L$0 : Ljava/lang/Object;
/*     */     //   196: aload #6
/*     */     //   198: iconst_2
/*     */     //   199: putfield label : I
/*     */     //   202: invokevirtual setupFromEnvironment : (Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   205: dup
/*     */     //   206: aload #7
/*     */     //   208: if_acmpne -> 221
/*     */     //   211: aload #7
/*     */     //   213: areturn
/*     */     //   214: aload #5
/*     */     //   216: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   219: aload #5
/*     */     //   221: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters
/*     */     //   224: astore #4
/*     */     //   226: aload #4
/*     */     //   228: areturn
/*     */     //   229: new java/lang/IllegalStateException
/*     */     //   232: dup
/*     */     //   233: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   235: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   238: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #113	-> 60
/*     */     //   #114	-> 97
/*     */     //   #113	-> 128
/*     */     //   #114	-> 147
/*     */     //   #115	-> 176
/*     */     //   #113	-> 211
/*     */     //   #116	-> 226
/*     */     //   #113	-> 229
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	25	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportReportCritique;
/*     */     //   97	34	1	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   140	65	1	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   176	29	3	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   226	3	4	editCritiqueParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters;
/*     */     //   0	239	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	179	6	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	172	5	$result	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */   
/*     */   private final List<MatterhornChatMessage> buildChoiceMessage(List reportsToRank) {
/*     */     Iterable $this$map$iv = reportsToRank;
/*     */     int $i$f$map = 0;
/* 191 */     Iterable iterable1 = $this$map$iv; Collection<TaskResult> collection = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 192 */     for (Object item$iv$iv : iterable1) {
/* 193 */       TaskResult taskResult = (TaskResult)item$iv$iv; Collection<TaskResult> collection1 = collection; int $i$a$-map-TaskReportReportCritique$buildChoiceMessage$optionsToRankString$1 = 0; collection1.add(taskResult);
/* 194 */     }  $this$map$iv = CollectionsKt.withIndex(collection); $i$f$map = 0; Iterable $this$mapTo$iv$iv = $this$map$iv; Collection<MatterhornChatMessage> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); $i$f$mapTo = 0; for (Object item$iv$iv : $this$mapTo$iv$iv) { IndexedValue indexedValue = (IndexedValue)item$iv$iv; Collection<MatterhornChatMessage> collection1 = destination$iv$iv; int $i$a$-map-TaskReportReportCritique$buildChoiceMessage$optionsToRankString$2 = 0; collection1.add(MatterhornChatKt.toUserMessage(this.commandDirective + " " + this.commandDirective + ":\n<PR_SUMMARY>\n" + indexedValue.getIndex() + 1 + "\n</PR_SUMMARY>\n<PR_PATCH>\n" + ((TaskResult)indexedValue.getValue()).getOutput() + "\n</PR_PATCH>\n<INTERACTION_HISTORY>\n" + ((TaskResult)indexedValue.getValue()).getPatch() + "\n</INTERACTION_HISTORY>\n")); }  List<MatterhornChatMessage> optionsToRankString = (List)destination$iv$iv; return optionsToRankString; } private final Result<Integer, Unit> parseBestAction(String response, List actionsToRank) { Iterable $this$map$iv = StringsKt.lines(response); int $i$f$map = 0;
/* 195 */     Iterable iterable1 = $this$map$iv; Collection<String> collection = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 196 */     for (Object item$iv$iv : iterable1) {
/* 197 */       String str = (String)item$iv$iv; Collection<String> collection1 = collection; int $i$a$-map-TaskReportReportCritique$parseBestAction$responseLines$1 = 0; collection1.add(StringsKt.trim(str).toString());
/* 198 */     }  $this$map$iv = collection; int $i$f$filter = 0;
/* 199 */     Iterable $this$mapTo$iv$iv = $this$map$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 200 */     for (Object element$iv$iv : $this$mapTo$iv$iv) { String it = (String)element$iv$iv; int $i$a$-filter-TaskReportReportCritique$parseBestAction$responseLines$2 = 0; if (!StringsKt.isBlank(it)) destination$iv$iv.add(element$iv$iv);  }
/* 201 */      List<CharSequence> responseLines = (List)destination$iv$iv;
/*     */     int bestActionSection = responseLines.indexOf(this.bestCommandDirective);
/*     */     if (bestActionSection == -1 || bestActionSection == responseLines.size() - 1)
/*     */       return (Result<Integer, Unit>)ResultKt.errorResult(StringsKt.trimMargin$default("ERROR: your response must contain\n          |```\n          |" + this.bestCommandDirective + "\n          |" + this.commandDirective + " <provide best PR id>\n          |```", null, 1, null)); 
/*     */     String[] arrayOfString = new String[1];
/*     */     arrayOfString[0] = " ";
/*     */     Integer bestActionOneBasedId = StringsKt.toIntOrNull(StringsKt.trim((CharSequence)CollectionsKt.last(StringsKt.split$default(responseLines.get(bestActionSection + 1), arrayOfString, false, 0, 6, null))).toString());
/*     */     if (bestActionOneBasedId == null)
/*     */       return (Result<Integer, Unit>)ResultKt.errorResult("ERROR: failed to parse best PR id, got: `" + responseLines.get(bestActionSection + 1) + "`, expected `" + this.commandDirective + " <ID of the selected PR>`"); 
/*     */     int i = actionsToRank.size(), j = bestActionOneBasedId.intValue() - 1;
/*     */     if (!((0 <= j) ? ((j < i) ? 1 : 0) : 0))
/*     */       return (Result<Integer, Unit>)ResultKt.errorResult("ERROR: you returned best PR id=" + bestActionOneBasedId + ", but there are only " + actionsToRank.size() + " PR to rank"); 
/*     */     return (Result<Integer, Unit>)ResultKt.successResult(Integer.valueOf(bestActionOneBasedId.intValue() - 1)); }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\critique\TaskReportReportCritique.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */