/*    */ package com.intellij.ml.llm.matterhorn.ej.core.critique;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutor;
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactResponse;
/*    */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*    */ import com.intellij.ml.llm.matterhorn.TrajectoryElementAgent;
/*    */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
/*    */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessageKind;
/*    */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.json.JsonBuilder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\\\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001B\007¢\006\004\b\004\020\005J\026\020\n\032\0020\0132\006\020\f\032\0020\rH@¢\006\002\020\016J\026\020\017\032\0020\0202\006\020\f\032\0020\rH@¢\006\002\020\016J$\020\025\032\b\022\004\022\0020\0030\0262\006\020\027\032\0020\0022\006\020\030\032\0020\031H@¢\006\002\020\032J,\020\033\032\0020\0342\006\020\035\032\0020\0072\f\020\036\032\b\022\004\022\0020 0\0372\006\020\030\032\0020\031H@¢\006\002\020!R\024\020\006\032\0020\007XD¢\006\b\n\000\032\004\b\b\020\tR\024\020\021\032\0020\022XD¢\006\b\n\000\032\004\b\023\020\024¨\006\""}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique;", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput;", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse;", "<init>", "()V", "agentName", "", "getAgentName", "()Ljava/lang/String;", "getAgentParameters", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritiqueParameters;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "(Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrajectoryElementAgent", "Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;", "DUMMY_RANK", "", "getDUMMY_RANK", "()I", "produceArtifact", "Lcom/intellij/ml/llm/matterhorn/ArtifactResponse;", "input", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logCritiqueInputToTrajectory", "", "systemPrompt", "observations", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "(Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nNebiusCritique.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NebiusCritique.kt\ncom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n205#2:139\n1557#3:140\n1628#3,3:141\n1557#3:146\n1628#3,3:147\n1053#3:150\n1557#3:151\n1628#3,3:152\n1557#3:155\n1628#3,3:156\n1863#3,2:159\n14#4:144\n1#5:145\n*S KotlinDebug\n*F\n+ 1 NebiusCritique.kt\ncom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique\n*L\n56#1:139\n73#1:140\n73#1:141,3\n100#1:146\n100#1:147,3\n101#1:150\n102#1:151\n102#1:152,3\n103#1:155\n103#1:156,3\n115#1:159,2\n88#1:144\n*E\n"})
/*    */ public final class NebiusCritique
/*    */   implements ArtifactRequestExecutor<CritiqueInput, CritiqueResponse>
/*    */ {
/*    */   @NotNull
/* 43 */   private final String agentName = "nebius_critique"; @NotNull public final String getAgentName() { return this.agentName; }
/*    */   
/*    */   private final Object getAgentParameters(MatterhornPropertyProvider propertyProvider, Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique$getAgentParameters$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique$getAgentParameters$1
/*    */     //   11: astore #5
/*    */     //   13: aload #5
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #5
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique$getAgentParameters$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #5
/*    */     //   50: aload #5
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #4
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #7
/*    */     //   62: aload #5
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 253, 0 -> 92, 1 -> 141, 2 -> 245
/*    */     //   92: aload #4
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: getstatic com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritiqueParameters.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritiqueParameters$Companion;
/*    */     //   100: astore_3
/*    */     //   101: getstatic com/intellij/ml/llm/matterhorn/llm/ModelParameters.Companion : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters$Companion;
/*    */     //   104: aload_0
/*    */     //   105: getfield agentName : Ljava/lang/String;
/*    */     //   108: aload_1
/*    */     //   109: aload #5
/*    */     //   111: aload #5
/*    */     //   113: aload_1
/*    */     //   114: putfield L$0 : Ljava/lang/Object;
/*    */     //   117: aload #5
/*    */     //   119: aload_3
/*    */     //   120: putfield L$1 : Ljava/lang/Object;
/*    */     //   123: aload #5
/*    */     //   125: iconst_1
/*    */     //   126: putfield label : I
/*    */     //   129: invokevirtual getDefaultModel : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   132: dup
/*    */     //   133: aload #7
/*    */     //   135: if_acmpne -> 166
/*    */     //   138: aload #7
/*    */     //   140: areturn
/*    */     //   141: aload #5
/*    */     //   143: getfield L$1 : Ljava/lang/Object;
/*    */     //   146: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritiqueParameters$Companion
/*    */     //   149: astore_3
/*    */     //   150: aload #5
/*    */     //   152: getfield L$0 : Ljava/lang/Object;
/*    */     //   155: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*    */     //   158: astore_1
/*    */     //   159: aload #4
/*    */     //   161: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   164: aload #4
/*    */     //   166: aload_3
/*    */     //   167: swap
/*    */     //   168: checkcast com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*    */     //   171: getstatic com/intellij/ml/llm/matterhorn/llm/LLM.Companion : Lcom/intellij/ml/llm/matterhorn/llm/LLM$Companion;
/*    */     //   174: invokevirtual getNEBIUS_CRITIC_LATEST : ()Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*    */     //   177: iconst_0
/*    */     //   178: dconst_0
/*    */     //   179: invokestatic boxDouble : (D)Ljava/lang/Double;
/*    */     //   182: aconst_null
/*    */     //   183: aconst_null
/*    */     //   184: aconst_null
/*    */     //   185: aconst_null
/*    */     //   186: aconst_null
/*    */     //   187: aconst_null
/*    */     //   188: aconst_null
/*    */     //   189: aconst_null
/*    */     //   190: aconst_null
/*    */     //   191: aconst_null
/*    */     //   192: iconst_0
/*    */     //   193: aconst_null
/*    */     //   194: sipush #32762
/*    */     //   197: aconst_null
/*    */     //   198: invokestatic copy$default : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lcom/intellij/ml/llm/matterhorn/llm/LLM;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   201: astore #6
/*    */     //   203: new com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritiqueParameters
/*    */     //   206: dup
/*    */     //   207: aload #6
/*    */     //   209: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;)V
/*    */     //   212: aload_1
/*    */     //   213: aload #5
/*    */     //   215: aload #5
/*    */     //   217: aconst_null
/*    */     //   218: putfield L$0 : Ljava/lang/Object;
/*    */     //   221: aload #5
/*    */     //   223: aconst_null
/*    */     //   224: putfield L$1 : Ljava/lang/Object;
/*    */     //   227: aload #5
/*    */     //   229: iconst_2
/*    */     //   230: putfield label : I
/*    */     //   233: invokevirtual setupFromEnvironment : (Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritiqueParameters;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   236: dup
/*    */     //   237: aload #7
/*    */     //   239: if_acmpne -> 252
/*    */     //   242: aload #7
/*    */     //   244: areturn
/*    */     //   245: aload #4
/*    */     //   247: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   250: aload #4
/*    */     //   252: areturn
/*    */     //   253: new java/lang/IllegalStateException
/*    */     //   256: dup
/*    */     //   257: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   259: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   262: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #45	-> 60
/*    */     //   #46	-> 97
/*    */     //   #45	-> 138
/*    */     //   #47	-> 171
/*    */     //   #46	-> 177
/*    */     //   #48	-> 178
/*    */     //   #46	-> 182
/*    */     //   #49	-> 212
/*    */     //   #45	-> 242
/*    */     //   #46	-> 252
/*    */     //   #45	-> 253
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	35	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique;
/*    */     //   97	44	1	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   159	77	1	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   0	263	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	203	5	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	196	4	$result	Ljava/lang/Object;
/*    */   }
/*    */   private final Object getTrajectoryElementAgent(MatterhornPropertyProvider propertyProvider, Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique$getTrajectoryElementAgent$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique$getTrajectoryElementAgent$1
/*    */     //   11: astore #10
/*    */     //   13: aload #10
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #10
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique$getTrajectoryElementAgent$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #10
/*    */     //   50: aload #10
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #9
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #11
/*    */     //   62: aload #10
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 217, 0 -> 88, 1 -> 133
/*    */     //   88: aload #9
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aconst_null
/*    */     //   94: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */     //   99: iconst_1
/*    */     //   100: aconst_null
/*    */     //   101: invokestatic Json$default : (Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/serialization/json/Json;
/*    */     //   104: astore_3
/*    */     //   105: aload_0
/*    */     //   106: aload_1
/*    */     //   107: aload #10
/*    */     //   109: aload #10
/*    */     //   111: aload_3
/*    */     //   112: putfield L$0 : Ljava/lang/Object;
/*    */     //   115: aload #10
/*    */     //   117: iconst_1
/*    */     //   118: putfield label : I
/*    */     //   121: invokespecial getAgentParameters : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   124: dup
/*    */     //   125: aload #11
/*    */     //   127: if_acmpne -> 149
/*    */     //   130: aload #11
/*    */     //   132: areturn
/*    */     //   133: aload #10
/*    */     //   135: getfield L$0 : Ljava/lang/Object;
/*    */     //   138: checkcast kotlinx/serialization/json/Json
/*    */     //   141: astore_3
/*    */     //   142: aload #9
/*    */     //   144: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   147: aload #9
/*    */     //   149: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritiqueParameters
/*    */     //   152: astore #4
/*    */     //   154: aload #4
/*    */     //   156: invokevirtual getModelParameters : ()Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   159: invokevirtual getModel : ()Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*    */     //   162: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   165: astore #5
/*    */     //   167: aload_3
/*    */     //   168: astore #7
/*    */     //   170: iconst_0
/*    */     //   171: istore #8
/*    */     //   173: aload #7
/*    */     //   175: aload #7
/*    */     //   177: invokevirtual getSerializersModule : ()Lkotlinx/serialization/modules/SerializersModule;
/*    */     //   180: pop
/*    */     //   181: getstatic com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritiqueParameters.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritiqueParameters$Companion;
/*    */     //   184: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   187: checkcast kotlinx/serialization/SerializationStrategy
/*    */     //   190: aload #4
/*    */     //   192: invokevirtual encodeToString : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   195: astore #6
/*    */     //   197: new com/intellij/ml/llm/matterhorn/TrajectoryElementAgent
/*    */     //   200: dup
/*    */     //   201: ldc 'nebius_critique'
/*    */     //   203: ldc '0.1'
/*    */     //   205: aload #5
/*    */     //   207: aload #6
/*    */     //   209: aconst_null
/*    */     //   210: bipush #16
/*    */     //   212: aconst_null
/*    */     //   213: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   216: areturn
/*    */     //   217: new java/lang/IllegalStateException
/*    */     //   220: dup
/*    */     //   221: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   223: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   226: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #52	-> 60
/*    */     //   #53	-> 93
/*    */     //   #54	-> 105
/*    */     //   #52	-> 130
/*    */     //   #55	-> 154
/*    */     //   #56	-> 167
/*    */     //   #139	-> 173
/*    */     //   #56	-> 195
/*    */     //   #57	-> 197
/*    */     //   #52	-> 217
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	31	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique;
/*    */     //   93	31	1	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   105	28	3	json	Lkotlinx/serialization/json/Json;
/*    */     //   142	75	3	json	Lkotlinx/serialization/json/Json;
/*    */     //   154	63	4	agentParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritiqueParameters;
/*    */     //   167	50	5	modelName	Ljava/lang/String;
/*    */     //   197	20	6	agentParametersStr	Ljava/lang/String;
/*    */     //   170	25	7	this_$iv	Lkotlinx/serialization/json/Json;
/*    */     //   173	22	8	$i$f$encodeToString	I
/*    */     //   0	227	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	167	10	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	160	9	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   private static final Unit getTrajectoryElementAgent$lambda$0(JsonBuilder $this$Json) {
/* 53 */     Intrinsics.checkNotNullParameter($this$Json, "$this$Json"); $this$Json.setEncodeDefaults(true); return Unit.INSTANCE;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 60 */   private final int DUMMY_RANK = 9999999; public final int getDUMMY_RANK() { return this.DUMMY_RANK; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object produceArtifact(@NotNull CritiqueInput input, @NotNull ExecutionContext context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique$produceArtifact$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique$produceArtifact$1
/*    */     //   11: astore #30
/*    */     //   13: aload #30
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #30
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique$produceArtifact$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #30
/*    */     //   50: aload #30
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #29
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #43
/*    */     //   62: aload #30
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 1625, 0 -> 96, 1 -> 378, 2 -> 630, 3 -> 905
/*    */     //   96: aload #29
/*    */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   101: aload_2
/*    */     //   102: aload_0
/*    */     //   103: getfield agentName : Ljava/lang/String;
/*    */     //   106: invokevirtual setTitle : (Ljava/lang/String;)V
/*    */     //   109: new java/util/ArrayList
/*    */     //   112: dup
/*    */     //   113: invokespecial <init> : ()V
/*    */     //   116: checkcast java/util/List
/*    */     //   119: astore #4
/*    */     //   121: aload_1
/*    */     //   122: invokevirtual getCurrentState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*    */     //   125: invokevirtual getIssueDescription : ()Ljava/util/List;
/*    */     //   128: astore #5
/*    */     //   130: aload_1
/*    */     //   131: invokevirtual getCurrentState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*    */     //   134: invokevirtual getRelevantSymbolsResponse : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*    */     //   137: dup
/*    */     //   138: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   141: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   144: invokestatic toUserMessage : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*    */     //   147: astore #6
/*    */     //   149: aload_1
/*    */     //   150: invokevirtual getCurrentState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*    */     //   153: invokevirtual getSystemMessage : ()Ljava/lang/String;
/*    */     //   156: dup
/*    */     //   157: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   160: aload_1
/*    */     //   161: invokevirtual getCurrentState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*    */     //   164: invokevirtual getDemo : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*    */     //   167: dup
/*    */     //   168: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   171: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   174: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   179: astore #7
/*    */     //   181: aload #5
/*    */     //   183: checkcast java/util/Collection
/*    */     //   186: aload #6
/*    */     //   188: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;
/*    */     //   191: checkcast java/util/Collection
/*    */     //   194: aload_1
/*    */     //   195: invokevirtual getCurrentState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*    */     //   198: invokevirtual getObservations : ()Ljava/util/List;
/*    */     //   201: checkcast java/lang/Iterable
/*    */     //   204: astore #9
/*    */     //   206: astore #22
/*    */     //   208: iconst_0
/*    */     //   209: istore #10
/*    */     //   211: aload #9
/*    */     //   213: astore #11
/*    */     //   215: new java/util/ArrayList
/*    */     //   218: dup
/*    */     //   219: aload #9
/*    */     //   221: bipush #10
/*    */     //   223: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*    */     //   226: invokespecial <init> : (I)V
/*    */     //   229: checkcast java/util/Collection
/*    */     //   232: astore #12
/*    */     //   234: iconst_0
/*    */     //   235: istore #13
/*    */     //   237: aload #11
/*    */     //   239: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   244: astore #14
/*    */     //   246: aload #14
/*    */     //   248: invokeinterface hasNext : ()Z
/*    */     //   253: ifeq -> 296
/*    */     //   256: aload #14
/*    */     //   258: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   263: astore #15
/*    */     //   265: aload #12
/*    */     //   267: aload #15
/*    */     //   269: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*    */     //   272: astore #16
/*    */     //   274: astore #23
/*    */     //   276: iconst_0
/*    */     //   277: istore #17
/*    */     //   279: aload #16
/*    */     //   281: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   284: aload #23
/*    */     //   286: swap
/*    */     //   287: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   292: pop
/*    */     //   293: goto -> 246
/*    */     //   296: aload #12
/*    */     //   298: checkcast java/util/List
/*    */     //   301: nop
/*    */     //   302: aload #22
/*    */     //   304: swap
/*    */     //   305: checkcast java/lang/Iterable
/*    */     //   308: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*    */     //   311: astore #8
/*    */     //   313: aload_0
/*    */     //   314: aload #7
/*    */     //   316: aload #8
/*    */     //   318: aload_2
/*    */     //   319: aload #30
/*    */     //   321: aload #30
/*    */     //   323: aload_0
/*    */     //   324: putfield L$0 : Ljava/lang/Object;
/*    */     //   327: aload #30
/*    */     //   329: aload_1
/*    */     //   330: putfield L$1 : Ljava/lang/Object;
/*    */     //   333: aload #30
/*    */     //   335: aload_2
/*    */     //   336: putfield L$2 : Ljava/lang/Object;
/*    */     //   339: aload #30
/*    */     //   341: aload #4
/*    */     //   343: putfield L$3 : Ljava/lang/Object;
/*    */     //   346: aload #30
/*    */     //   348: aload #7
/*    */     //   350: putfield L$4 : Ljava/lang/Object;
/*    */     //   353: aload #30
/*    */     //   355: aload #8
/*    */     //   357: putfield L$5 : Ljava/lang/Object;
/*    */     //   360: aload #30
/*    */     //   362: iconst_1
/*    */     //   363: putfield label : I
/*    */     //   366: invokespecial logCritiqueInputToTrajectory : (Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   369: dup
/*    */     //   370: aload #43
/*    */     //   372: if_acmpne -> 442
/*    */     //   375: aload #43
/*    */     //   377: areturn
/*    */     //   378: aload #30
/*    */     //   380: getfield L$5 : Ljava/lang/Object;
/*    */     //   383: checkcast java/util/List
/*    */     //   386: astore #8
/*    */     //   388: aload #30
/*    */     //   390: getfield L$4 : Ljava/lang/Object;
/*    */     //   393: checkcast java/lang/String
/*    */     //   396: astore #7
/*    */     //   398: aload #30
/*    */     //   400: getfield L$3 : Ljava/lang/Object;
/*    */     //   403: checkcast java/util/List
/*    */     //   406: astore #4
/*    */     //   408: aload #30
/*    */     //   410: getfield L$2 : Ljava/lang/Object;
/*    */     //   413: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   416: astore_2
/*    */     //   417: aload #30
/*    */     //   419: getfield L$1 : Ljava/lang/Object;
/*    */     //   422: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput
/*    */     //   425: astore_1
/*    */     //   426: aload #30
/*    */     //   428: getfield L$0 : Ljava/lang/Object;
/*    */     //   431: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique
/*    */     //   434: astore_0
/*    */     //   435: aload #29
/*    */     //   437: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   440: aload #29
/*    */     //   442: pop
/*    */     //   443: aload_1
/*    */     //   444: invokevirtual getActionsToRank : ()Ljava/util/List;
/*    */     //   447: checkcast java/lang/Iterable
/*    */     //   450: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   455: astore #9
/*    */     //   457: iconst_0
/*    */     //   458: istore #10
/*    */     //   460: aload #9
/*    */     //   462: invokeinterface hasNext : ()Z
/*    */     //   467: ifeq -> 1224
/*    */     //   470: iload #10
/*    */     //   472: istore #11
/*    */     //   474: iload #10
/*    */     //   476: iconst_1
/*    */     //   477: iadd
/*    */     //   478: istore #10
/*    */     //   480: aload #9
/*    */     //   482: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   487: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   490: astore #12
/*    */     //   492: nop
/*    */     //   493: aload #7
/*    */     //   495: aload #8
/*    */     //   497: checkcast java/util/Collection
/*    */     //   500: aload #12
/*    */     //   502: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*    */     //   505: checkcast java/lang/Iterable
/*    */     //   508: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*    */     //   511: checkcast java/lang/Iterable
/*    */     //   514: invokestatic toList : (Ljava/lang/Iterable;)Ljava/util/List;
/*    */     //   517: astore #25
/*    */     //   519: astore #24
/*    */     //   521: aload_0
/*    */     //   522: aload_2
/*    */     //   523: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*    */     //   526: invokevirtual getPropertyProvider : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   529: aload #30
/*    */     //   531: aload #30
/*    */     //   533: aload_0
/*    */     //   534: putfield L$0 : Ljava/lang/Object;
/*    */     //   537: aload #30
/*    */     //   539: aload_1
/*    */     //   540: putfield L$1 : Ljava/lang/Object;
/*    */     //   543: aload #30
/*    */     //   545: aload_2
/*    */     //   546: putfield L$2 : Ljava/lang/Object;
/*    */     //   549: aload #30
/*    */     //   551: aload #4
/*    */     //   553: putfield L$3 : Ljava/lang/Object;
/*    */     //   556: aload #30
/*    */     //   558: aload #7
/*    */     //   560: putfield L$4 : Ljava/lang/Object;
/*    */     //   563: aload #30
/*    */     //   565: aload #8
/*    */     //   567: putfield L$5 : Ljava/lang/Object;
/*    */     //   570: aload #30
/*    */     //   572: aload #9
/*    */     //   574: putfield L$6 : Ljava/lang/Object;
/*    */     //   577: aload #30
/*    */     //   579: aload #12
/*    */     //   581: putfield L$7 : Ljava/lang/Object;
/*    */     //   584: aload #30
/*    */     //   586: aload #24
/*    */     //   588: putfield L$8 : Ljava/lang/Object;
/*    */     //   591: aload #30
/*    */     //   593: aload #25
/*    */     //   595: putfield L$9 : Ljava/lang/Object;
/*    */     //   598: aload #30
/*    */     //   600: iload #10
/*    */     //   602: putfield I$0 : I
/*    */     //   605: aload #30
/*    */     //   607: iload #11
/*    */     //   609: putfield I$1 : I
/*    */     //   612: aload #30
/*    */     //   614: iconst_2
/*    */     //   615: putfield label : I
/*    */     //   618: invokespecial getAgentParameters : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   621: dup
/*    */     //   622: aload #43
/*    */     //   624: if_acmpne -> 749
/*    */     //   627: aload #43
/*    */     //   629: areturn
/*    */     //   630: aload #30
/*    */     //   632: getfield I$1 : I
/*    */     //   635: istore #11
/*    */     //   637: aload #30
/*    */     //   639: getfield I$0 : I
/*    */     //   642: istore #10
/*    */     //   644: aload #30
/*    */     //   646: getfield L$9 : Ljava/lang/Object;
/*    */     //   649: checkcast java/util/List
/*    */     //   652: astore #25
/*    */     //   654: aload #30
/*    */     //   656: getfield L$8 : Ljava/lang/Object;
/*    */     //   659: checkcast java/lang/String
/*    */     //   662: astore #24
/*    */     //   664: aload #30
/*    */     //   666: getfield L$7 : Ljava/lang/Object;
/*    */     //   669: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   672: astore #12
/*    */     //   674: aload #30
/*    */     //   676: getfield L$6 : Ljava/lang/Object;
/*    */     //   679: checkcast java/util/Iterator
/*    */     //   682: astore #9
/*    */     //   684: aload #30
/*    */     //   686: getfield L$5 : Ljava/lang/Object;
/*    */     //   689: checkcast java/util/List
/*    */     //   692: astore #8
/*    */     //   694: aload #30
/*    */     //   696: getfield L$4 : Ljava/lang/Object;
/*    */     //   699: checkcast java/lang/String
/*    */     //   702: astore #7
/*    */     //   704: aload #30
/*    */     //   706: getfield L$3 : Ljava/lang/Object;
/*    */     //   709: checkcast java/util/List
/*    */     //   712: astore #4
/*    */     //   714: aload #30
/*    */     //   716: getfield L$2 : Ljava/lang/Object;
/*    */     //   719: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   722: astore_2
/*    */     //   723: aload #30
/*    */     //   725: getfield L$1 : Ljava/lang/Object;
/*    */     //   728: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput
/*    */     //   731: astore_1
/*    */     //   732: aload #30
/*    */     //   734: getfield L$0 : Ljava/lang/Object;
/*    */     //   737: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique
/*    */     //   740: astore_0
/*    */     //   741: nop
/*    */     //   742: aload #29
/*    */     //   744: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   747: aload #29
/*    */     //   749: astore #26
/*    */     //   751: aload #24
/*    */     //   753: aload #25
/*    */     //   755: aload #26
/*    */     //   757: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritiqueParameters
/*    */     //   760: invokevirtual getModelParameters : ()Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   763: aconst_null
/*    */     //   764: bipush #8
/*    */     //   766: aconst_null
/*    */     //   767: astore #31
/*    */     //   769: istore #32
/*    */     //   771: astore #33
/*    */     //   773: astore #34
/*    */     //   775: astore #35
/*    */     //   777: astore #36
/*    */     //   779: new com/intellij/ml/llm/matterhorn/requests/SimpleRequest
/*    */     //   782: dup
/*    */     //   783: aload #36
/*    */     //   785: aload #35
/*    */     //   787: aload #34
/*    */     //   789: aload #33
/*    */     //   791: iload #32
/*    */     //   793: aload #31
/*    */     //   795: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   798: astore #13
/*    */     //   800: aload_2
/*    */     //   801: aload #13
/*    */     //   803: checkcast com/intellij/ml/llm/matterhorn/requests/GrazieRequest
/*    */     //   806: aload #30
/*    */     //   808: aload #30
/*    */     //   810: aload_0
/*    */     //   811: putfield L$0 : Ljava/lang/Object;
/*    */     //   814: aload #30
/*    */     //   816: aload_1
/*    */     //   817: putfield L$1 : Ljava/lang/Object;
/*    */     //   820: aload #30
/*    */     //   822: aload_2
/*    */     //   823: putfield L$2 : Ljava/lang/Object;
/*    */     //   826: aload #30
/*    */     //   828: aload #4
/*    */     //   830: putfield L$3 : Ljava/lang/Object;
/*    */     //   833: aload #30
/*    */     //   835: aload #7
/*    */     //   837: putfield L$4 : Ljava/lang/Object;
/*    */     //   840: aload #30
/*    */     //   842: aload #8
/*    */     //   844: putfield L$5 : Ljava/lang/Object;
/*    */     //   847: aload #30
/*    */     //   849: aload #9
/*    */     //   851: putfield L$6 : Ljava/lang/Object;
/*    */     //   854: aload #30
/*    */     //   856: aload #12
/*    */     //   858: putfield L$7 : Ljava/lang/Object;
/*    */     //   861: aload #30
/*    */     //   863: aconst_null
/*    */     //   864: putfield L$8 : Ljava/lang/Object;
/*    */     //   867: aload #30
/*    */     //   869: aconst_null
/*    */     //   870: putfield L$9 : Ljava/lang/Object;
/*    */     //   873: aload #30
/*    */     //   875: iload #10
/*    */     //   877: putfield I$0 : I
/*    */     //   880: aload #30
/*    */     //   882: iload #11
/*    */     //   884: putfield I$1 : I
/*    */     //   887: aload #30
/*    */     //   889: iconst_3
/*    */     //   890: putfield label : I
/*    */     //   893: invokevirtual sendToGrazieRaw : (Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   896: dup
/*    */     //   897: aload #43
/*    */     //   899: if_acmpne -> 1004
/*    */     //   902: aload #43
/*    */     //   904: areturn
/*    */     //   905: aload #30
/*    */     //   907: getfield I$1 : I
/*    */     //   910: istore #11
/*    */     //   912: aload #30
/*    */     //   914: getfield I$0 : I
/*    */     //   917: istore #10
/*    */     //   919: aload #30
/*    */     //   921: getfield L$7 : Ljava/lang/Object;
/*    */     //   924: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   927: astore #12
/*    */     //   929: aload #30
/*    */     //   931: getfield L$6 : Ljava/lang/Object;
/*    */     //   934: checkcast java/util/Iterator
/*    */     //   937: astore #9
/*    */     //   939: aload #30
/*    */     //   941: getfield L$5 : Ljava/lang/Object;
/*    */     //   944: checkcast java/util/List
/*    */     //   947: astore #8
/*    */     //   949: aload #30
/*    */     //   951: getfield L$4 : Ljava/lang/Object;
/*    */     //   954: checkcast java/lang/String
/*    */     //   957: astore #7
/*    */     //   959: aload #30
/*    */     //   961: getfield L$3 : Ljava/lang/Object;
/*    */     //   964: checkcast java/util/List
/*    */     //   967: astore #4
/*    */     //   969: aload #30
/*    */     //   971: getfield L$2 : Ljava/lang/Object;
/*    */     //   974: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   977: astore_2
/*    */     //   978: aload #30
/*    */     //   980: getfield L$1 : Ljava/lang/Object;
/*    */     //   983: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput
/*    */     //   986: astore_1
/*    */     //   987: aload #30
/*    */     //   989: getfield L$0 : Ljava/lang/Object;
/*    */     //   992: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique
/*    */     //   995: astore_0
/*    */     //   996: nop
/*    */     //   997: aload #29
/*    */     //   999: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   1002: aload #29
/*    */     //   1004: dup
/*    */     //   1005: ldc_w 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessage'
/*    */     //   1008: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   1011: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*    */     //   1014: astore #14
/*    */     //   1016: aload #4
/*    */     //   1018: new kotlin/Pair
/*    */     //   1021: dup
/*    */     //   1022: aload #12
/*    */     //   1024: aload #14
/*    */     //   1026: invokevirtual getLogits : ()Ljava/util/List;
/*    */     //   1029: dup
/*    */     //   1030: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   1033: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*    */     //   1036: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   1039: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   1044: pop
/*    */     //   1045: goto -> 460
/*    */     //   1048: astore #14
/*    */     //   1050: iconst_0
/*    */     //   1051: istore #15
/*    */     //   1053: ldc com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique
/*    */     //   1055: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   1058: dup
/*    */     //   1059: ldc_w 'getInstance(...)'
/*    */     //   1062: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   1065: iload #11
/*    */     //   1067: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*    */     //   1072: aload #14
/*    */     //   1074: checkcast java/lang/Throwable
/*    */     //   1077: invokevirtual error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   1080: aload_1
/*    */     //   1081: invokevirtual getActionsToRank : ()Ljava/util/List;
/*    */     //   1084: iconst_0
/*    */     //   1085: invokestatic boxInt : (I)Ljava/lang/Integer;
/*    */     //   1088: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*    */     //   1091: checkcast java/util/Collection
/*    */     //   1094: aload_1
/*    */     //   1095: invokevirtual getActionsToRank : ()Ljava/util/List;
/*    */     //   1098: invokeinterface size : ()I
/*    */     //   1103: iconst_1
/*    */     //   1104: isub
/*    */     //   1105: istore #15
/*    */     //   1107: astore #27
/*    */     //   1109: astore #26
/*    */     //   1111: new java/util/ArrayList
/*    */     //   1114: dup
/*    */     //   1115: iload #15
/*    */     //   1117: invokespecial <init> : (I)V
/*    */     //   1120: astore #16
/*    */     //   1122: iconst_0
/*    */     //   1123: istore #17
/*    */     //   1125: iload #17
/*    */     //   1127: iload #15
/*    */     //   1129: if_icmpge -> 1163
/*    */     //   1132: iload #17
/*    */     //   1134: istore #18
/*    */     //   1136: aload #16
/*    */     //   1138: astore #28
/*    */     //   1140: iconst_0
/*    */     //   1141: istore #20
/*    */     //   1143: aload_0
/*    */     //   1144: getfield DUMMY_RANK : I
/*    */     //   1147: invokestatic boxInt : (I)Ljava/lang/Integer;
/*    */     //   1150: aload #28
/*    */     //   1152: swap
/*    */     //   1153: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   1156: pop
/*    */     //   1157: iinc #17, 1
/*    */     //   1160: goto -> 1125
/*    */     //   1163: aload #16
/*    */     //   1165: checkcast java/util/List
/*    */     //   1168: astore #28
/*    */     //   1170: aload #26
/*    */     //   1172: aload #27
/*    */     //   1174: aload #28
/*    */     //   1176: checkcast java/lang/Iterable
/*    */     //   1179: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*    */     //   1182: astore #37
/*    */     //   1184: astore #38
/*    */     //   1186: new com/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse
/*    */     //   1189: dup
/*    */     //   1190: aload #38
/*    */     //   1192: aload #37
/*    */     //   1194: invokespecial <init> : (Ljava/util/List;Ljava/util/List;)V
/*    */     //   1197: aconst_null
/*    */     //   1198: iconst_2
/*    */     //   1199: aconst_null
/*    */     //   1200: astore #39
/*    */     //   1202: istore #40
/*    */     //   1204: astore #41
/*    */     //   1206: astore #42
/*    */     //   1208: new com/intellij/ml/llm/matterhorn/ArtifactResponse
/*    */     //   1211: dup
/*    */     //   1212: aload #42
/*    */     //   1214: aload #41
/*    */     //   1216: iload #40
/*    */     //   1218: aload #39
/*    */     //   1220: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   1223: areturn
/*    */     //   1224: aload #4
/*    */     //   1226: checkcast java/lang/Iterable
/*    */     //   1229: astore #10
/*    */     //   1231: iconst_0
/*    */     //   1232: istore #11
/*    */     //   1234: aload #10
/*    */     //   1236: astore #12
/*    */     //   1238: new java/util/ArrayList
/*    */     //   1241: dup
/*    */     //   1242: aload #10
/*    */     //   1244: bipush #10
/*    */     //   1246: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*    */     //   1249: invokespecial <init> : (I)V
/*    */     //   1252: checkcast java/util/Collection
/*    */     //   1255: astore #13
/*    */     //   1257: iconst_0
/*    */     //   1258: istore #14
/*    */     //   1260: aload #12
/*    */     //   1262: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   1267: astore #15
/*    */     //   1269: aload #15
/*    */     //   1271: invokeinterface hasNext : ()Z
/*    */     //   1276: ifeq -> 1346
/*    */     //   1279: aload #15
/*    */     //   1281: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   1286: astore #16
/*    */     //   1288: aload #13
/*    */     //   1290: aload #16
/*    */     //   1292: checkcast kotlin/Pair
/*    */     //   1295: astore #17
/*    */     //   1297: astore #22
/*    */     //   1299: iconst_0
/*    */     //   1300: istore #18
/*    */     //   1302: new kotlin/Pair
/*    */     //   1305: dup
/*    */     //   1306: aload #17
/*    */     //   1308: invokevirtual getFirst : ()Ljava/lang/Object;
/*    */     //   1311: sipush #-1000
/*    */     //   1314: i2d
/*    */     //   1315: aload #17
/*    */     //   1317: invokevirtual getSecond : ()Ljava/lang/Object;
/*    */     //   1320: checkcast java/lang/Number
/*    */     //   1323: invokevirtual doubleValue : ()D
/*    */     //   1326: dmul
/*    */     //   1327: d2i
/*    */     //   1328: invokestatic boxInt : (I)Ljava/lang/Integer;
/*    */     //   1331: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   1334: aload #22
/*    */     //   1336: swap
/*    */     //   1337: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   1342: pop
/*    */     //   1343: goto -> 1269
/*    */     //   1346: aload #13
/*    */     //   1348: checkcast java/util/List
/*    */     //   1351: nop
/*    */     //   1352: astore #9
/*    */     //   1354: aload #9
/*    */     //   1356: checkcast java/lang/Iterable
/*    */     //   1359: astore #11
/*    */     //   1361: iconst_0
/*    */     //   1362: istore #12
/*    */     //   1364: aload #11
/*    */     //   1366: new com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique$produceArtifact$$inlined$sortedBy$1
/*    */     //   1369: dup
/*    */     //   1370: invokespecial <init> : ()V
/*    */     //   1373: checkcast java/util/Comparator
/*    */     //   1376: invokestatic sortedWith : (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
/*    */     //   1379: astore #10
/*    */     //   1381: aload #10
/*    */     //   1383: checkcast java/lang/Iterable
/*    */     //   1386: astore #12
/*    */     //   1388: iconst_0
/*    */     //   1389: istore #13
/*    */     //   1391: aload #12
/*    */     //   1393: astore #14
/*    */     //   1395: new java/util/ArrayList
/*    */     //   1398: dup
/*    */     //   1399: aload #12
/*    */     //   1401: bipush #10
/*    */     //   1403: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*    */     //   1406: invokespecial <init> : (I)V
/*    */     //   1409: checkcast java/util/Collection
/*    */     //   1412: astore #15
/*    */     //   1414: iconst_0
/*    */     //   1415: istore #16
/*    */     //   1417: aload #14
/*    */     //   1419: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   1424: astore #17
/*    */     //   1426: aload #17
/*    */     //   1428: invokeinterface hasNext : ()Z
/*    */     //   1433: ifeq -> 1479
/*    */     //   1436: aload #17
/*    */     //   1438: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   1443: astore #18
/*    */     //   1445: aload #15
/*    */     //   1447: aload #18
/*    */     //   1449: checkcast kotlin/Pair
/*    */     //   1452: astore #19
/*    */     //   1454: astore #22
/*    */     //   1456: iconst_0
/*    */     //   1457: istore #20
/*    */     //   1459: aload #19
/*    */     //   1461: invokevirtual getFirst : ()Ljava/lang/Object;
/*    */     //   1464: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   1467: aload #22
/*    */     //   1469: swap
/*    */     //   1470: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   1475: pop
/*    */     //   1476: goto -> 1426
/*    */     //   1479: aload #15
/*    */     //   1481: checkcast java/util/List
/*    */     //   1484: nop
/*    */     //   1485: astore #11
/*    */     //   1487: aload #10
/*    */     //   1489: checkcast java/lang/Iterable
/*    */     //   1492: astore #13
/*    */     //   1494: iconst_0
/*    */     //   1495: istore #14
/*    */     //   1497: aload #13
/*    */     //   1499: astore #15
/*    */     //   1501: new java/util/ArrayList
/*    */     //   1504: dup
/*    */     //   1505: aload #13
/*    */     //   1507: bipush #10
/*    */     //   1509: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*    */     //   1512: invokespecial <init> : (I)V
/*    */     //   1515: checkcast java/util/Collection
/*    */     //   1518: astore #16
/*    */     //   1520: iconst_0
/*    */     //   1521: istore #17
/*    */     //   1523: aload #15
/*    */     //   1525: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   1530: astore #18
/*    */     //   1532: aload #18
/*    */     //   1534: invokeinterface hasNext : ()Z
/*    */     //   1539: ifeq -> 1591
/*    */     //   1542: aload #18
/*    */     //   1544: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   1549: astore #19
/*    */     //   1551: aload #16
/*    */     //   1553: aload #19
/*    */     //   1555: checkcast kotlin/Pair
/*    */     //   1558: astore #20
/*    */     //   1560: astore #22
/*    */     //   1562: iconst_0
/*    */     //   1563: istore #21
/*    */     //   1565: aload #20
/*    */     //   1567: invokevirtual getSecond : ()Ljava/lang/Object;
/*    */     //   1570: checkcast java/lang/Number
/*    */     //   1573: invokevirtual intValue : ()I
/*    */     //   1576: invokestatic boxInt : (I)Ljava/lang/Integer;
/*    */     //   1579: aload #22
/*    */     //   1581: swap
/*    */     //   1582: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   1587: pop
/*    */     //   1588: goto -> 1532
/*    */     //   1591: aload #16
/*    */     //   1593: checkcast java/util/List
/*    */     //   1596: nop
/*    */     //   1597: astore #12
/*    */     //   1599: new com/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse
/*    */     //   1602: dup
/*    */     //   1603: aload #11
/*    */     //   1605: aload #12
/*    */     //   1607: invokespecial <init> : (Ljava/util/List;Ljava/util/List;)V
/*    */     //   1610: astore #13
/*    */     //   1612: new com/intellij/ml/llm/matterhorn/ArtifactResponse
/*    */     //   1615: dup
/*    */     //   1616: aload #13
/*    */     //   1618: aconst_null
/*    */     //   1619: iconst_2
/*    */     //   1620: aconst_null
/*    */     //   1621: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   1624: areturn
/*    */     //   1625: new java/lang/IllegalStateException
/*    */     //   1628: dup
/*    */     //   1629: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   1631: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   1634: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #62	-> 60
/*    */     //   #67	-> 101
/*    */     //   #68	-> 109
/*    */     //   #68	-> 119
/*    */     //   #69	-> 121
/*    */     //   #70	-> 130
/*    */     //   #72	-> 149
/*    */     //   #73	-> 181
/*    */     //   #140	-> 211
/*    */     //   #141	-> 237
/*    */     //   #142	-> 265
/*    */     //   #73	-> 279
/*    */     //   #142	-> 287
/*    */     //   #143	-> 296
/*    */     //   #140	-> 301
/*    */     //   #73	-> 308
/*    */     //   #75	-> 313
/*    */     //   #62	-> 375
/*    */     //   #76	-> 442
/*    */     //   #77	-> 492
/*    */     //   #78	-> 493
/*    */     //   #79	-> 493
/*    */     //   #80	-> 495
/*    */     //   #81	-> 521
/*    */     //   #62	-> 627
/*    */     //   #81	-> 749
/*    */     //   #78	-> 763
/*    */     //   #84	-> 800
/*    */     //   #62	-> 902
/*    */     //   #84	-> 1004
/*    */     //   #86	-> 1016
/*    */     //   #87	-> 1048
/*    */     //   #88	-> 1050
/*    */     //   #144	-> 1053
/*    */     //   #88	-> 1065
/*    */     //   #91	-> 1080
/*    */     //   #92	-> 1080
/*    */     //   #93	-> 1080
/*    */     //   #94	-> 1084
/*    */     //   #145	-> 1138
/*    */     //   #94	-> 1143
/*    */     //   #94	-> 1153
/*    */     //   #94	-> 1179
/*    */     //   #92	-> 1182
/*    */     //   #91	-> 1197
/*    */     //   #100	-> 1224
/*    */     //   #146	-> 1234
/*    */     //   #147	-> 1260
/*    */     //   #148	-> 1288
/*    */     //   #100	-> 1302
/*    */     //   #148	-> 1337
/*    */     //   #149	-> 1346
/*    */     //   #146	-> 1351
/*    */     //   #100	-> 1352
/*    */     //   #101	-> 1354
/*    */     //   #150	-> 1364
/*    */     //   #150	-> 1376
/*    */     //   #101	-> 1379
/*    */     //   #102	-> 1381
/*    */     //   #151	-> 1391
/*    */     //   #152	-> 1417
/*    */     //   #153	-> 1445
/*    */     //   #102	-> 1459
/*    */     //   #153	-> 1470
/*    */     //   #154	-> 1479
/*    */     //   #151	-> 1484
/*    */     //   #102	-> 1485
/*    */     //   #103	-> 1487
/*    */     //   #155	-> 1497
/*    */     //   #156	-> 1523
/*    */     //   #157	-> 1551
/*    */     //   #103	-> 1565
/*    */     //   #157	-> 1582
/*    */     //   #158	-> 1591
/*    */     //   #155	-> 1596
/*    */     //   #103	-> 1597
/*    */     //   #104	-> 1599
/*    */     //   #105	-> 1612
/*    */     //   #62	-> 1625
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   101	18	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique;
/*    */     //   119	259	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique;
/*    */     //   435	195	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique;
/*    */     //   741	164	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique;
/*    */     //   996	69	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique;
/*    */     //   1065	82	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique;
/*    */     //   1147	16	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique;
/*    */     //   101	18	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput;
/*    */     //   119	259	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput;
/*    */     //   426	204	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput;
/*    */     //   732	173	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput;
/*    */     //   987	78	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput;
/*    */     //   1065	46	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueInput;
/*    */     //   101	18	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   119	259	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   417	213	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   723	182	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   978	70	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   121	257	4	result	Ljava/util/List;
/*    */     //   408	222	4	result	Ljava/util/List;
/*    */     //   714	191	4	result	Ljava/util/List;
/*    */     //   969	79	4	result	Ljava/util/List;
/*    */     //   1224	7	4	result	Ljava/util/List;
/*    */     //   130	78	5	issueDescriptionForNebius	Ljava/util/List;
/*    */     //   149	59	6	repomapMessage	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*    */     //   181	197	7	critiqueSystemPrompt	Ljava/lang/String;
/*    */     //   398	232	7	critiqueSystemPrompt	Ljava/lang/String;
/*    */     //   704	201	7	critiqueSystemPrompt	Ljava/lang/String;
/*    */     //   959	89	7	critiqueSystemPrompt	Ljava/lang/String;
/*    */     //   313	65	8	observations	Ljava/util/List;
/*    */     //   388	242	8	observations	Ljava/util/List;
/*    */     //   694	211	8	observations	Ljava/util/List;
/*    */     //   949	99	8	observations	Ljava/util/List;
/*    */     //   208	26	9	$this$map$iv	Ljava/lang/Iterable;
/*    */     //   1354	7	9	adjustedScores	Ljava/util/List;
/*    */     //   1231	26	10	$this$map$iv	Ljava/lang/Iterable;
/*    */     //   1381	86	10	sortedResult	Ljava/util/List;
/*    */     //   1467	18	10	sortedResult	Ljava/util/List;
/*    */     //   1485	9	10	sortedResult	Ljava/util/List;
/*    */     //   234	12	11	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   474	156	11	idx	I
/*    */     //   637	268	11	idx	I
/*    */     //   912	133	11	idx	I
/*    */     //   1048	17	11	idx	I
/*    */     //   1065	15	11	idx	I
/*    */     //   1361	18	11	$this$sortedBy$iv	Ljava/lang/Iterable;
/*    */     //   1487	138	11	critiqueCandidates	Ljava/util/List;
/*    */     //   234	64	12	destination$iv$iv	Ljava/util/Collection;
/*    */     //   492	138	12	actionToRank	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   674	231	12	actionToRank	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   929	115	12	actionToRank	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   1257	12	12	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   1388	26	12	$this$map$iv	Ljava/lang/Iterable;
/*    */     //   1599	26	12	critiqueRanks	Ljava/util/List;
/*    */     //   800	96	13	request	Lcom/intellij/ml/llm/matterhorn/requests/SimpleRequest;
/*    */     //   1257	91	13	destination$iv$iv	Ljava/util/Collection;
/*    */     //   1494	26	13	$this$map$iv	Ljava/lang/Iterable;
/*    */     //   1612	13	13	critiqueResponse	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/CritiqueResponse;
/*    */     //   1016	28	14	answer	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*    */     //   1050	15	14	error	Ljava/lang/Exception;
/*    */     //   1065	15	14	error	Ljava/lang/Exception;
/*    */     //   1414	12	14	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   265	28	15	item$iv$iv	Ljava/lang/Object;
/*    */     //   1414	67	15	destination$iv$iv	Ljava/util/Collection;
/*    */     //   1520	12	15	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   276	8	16	it	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*    */     //   1288	55	16	item$iv$iv	Ljava/lang/Object;
/*    */     //   1520	73	16	destination$iv$iv	Ljava/util/Collection;
/*    */     //   1299	35	17	it	Lkotlin/Pair;
/*    */     //   1445	31	18	item$iv$iv	Ljava/lang/Object;
/*    */     //   1456	11	19	it	Lkotlin/Pair;
/*    */     //   1551	37	19	item$iv$iv	Ljava/lang/Object;
/*    */     //   1562	14	20	it	Lkotlin/Pair;
/*    */     //   279	5	17	$i$a$-map-NebiusCritique$produceArtifact$observations$1	I
/*    */     //   237	61	13	$i$f$mapTo	I
/*    */     //   211	91	10	$i$f$map	I
/*    */     //   1053	12	15	$i$f$logger	I
/*    */     //   1143	4	20	$i$a$-List-NebiusCritique$produceArtifact$2	I
/*    */     //   1302	32	18	$i$a$-map-NebiusCritique$produceArtifact$adjustedScores$1	I
/*    */     //   1260	88	14	$i$f$mapTo	I
/*    */     //   1234	118	11	$i$f$map	I
/*    */     //   1364	15	12	$i$f$sortedBy	I
/*    */     //   1459	8	20	$i$a$-map-NebiusCritique$produceArtifact$critiqueCandidates$1	I
/*    */     //   1417	64	16	$i$f$mapTo	I
/*    */     //   1391	94	13	$i$f$map	I
/*    */     //   1565	11	21	$i$a$-map-NebiusCritique$produceArtifact$critiqueRanks$1	I
/*    */     //   1523	70	17	$i$f$mapTo	I
/*    */     //   1497	100	14	$i$f$map	I
/*    */     //   0	1635	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	1575	30	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	1568	29	$result	Ljava/lang/Object;
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   492	621	1048	java/lang/Exception
/*    */     //   741	896	1048	java/lang/Exception
/*    */     //   996	1045	1048	java/lang/Exception
/*    */   }
/*    */   
/*    */   private final Object logCritiqueInputToTrajectory(String systemPrompt, List observations, ExecutionContext context, Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique$logCritiqueInputToTrajectory$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique$logCritiqueInputToTrajectory$1
/*    */     //   13: astore #15
/*    */     //   15: aload #15
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #15
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique$logCritiqueInputToTrajectory$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #15
/*    */     //   53: aload #15
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #14
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #35
/*    */     //   65: aload #15
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 1142, 0 -> 112, 1 -> 190, 2 -> 354, 3 -> 558, 4 -> 736, 5 -> 857, 6 -> 1059
/*    */     //   112: aload #14
/*    */     //   114: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   117: aload_3
/*    */     //   118: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*    */     //   121: invokevirtual getPropertyProvider : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   124: astore #5
/*    */     //   126: aload_3
/*    */     //   127: astore #13
/*    */     //   129: aload_0
/*    */     //   130: aload #5
/*    */     //   132: aload #15
/*    */     //   134: aload #15
/*    */     //   136: aload_0
/*    */     //   137: putfield L$0 : Ljava/lang/Object;
/*    */     //   140: aload #15
/*    */     //   142: aload_1
/*    */     //   143: putfield L$1 : Ljava/lang/Object;
/*    */     //   146: aload #15
/*    */     //   148: aload_2
/*    */     //   149: putfield L$2 : Ljava/lang/Object;
/*    */     //   152: aload #15
/*    */     //   154: aload_3
/*    */     //   155: putfield L$3 : Ljava/lang/Object;
/*    */     //   158: aload #15
/*    */     //   160: aload #5
/*    */     //   162: putfield L$4 : Ljava/lang/Object;
/*    */     //   165: aload #15
/*    */     //   167: aload #13
/*    */     //   169: putfield L$5 : Ljava/lang/Object;
/*    */     //   172: aload #15
/*    */     //   174: iconst_1
/*    */     //   175: putfield label : I
/*    */     //   178: invokespecial getTrajectoryElementAgent : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   181: dup
/*    */     //   182: aload #35
/*    */     //   184: if_acmpne -> 253
/*    */     //   187: aload #35
/*    */     //   189: areturn
/*    */     //   190: aload #15
/*    */     //   192: getfield L$5 : Ljava/lang/Object;
/*    */     //   195: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   198: astore #13
/*    */     //   200: aload #15
/*    */     //   202: getfield L$4 : Ljava/lang/Object;
/*    */     //   205: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*    */     //   208: astore #5
/*    */     //   210: aload #15
/*    */     //   212: getfield L$3 : Ljava/lang/Object;
/*    */     //   215: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   218: astore_3
/*    */     //   219: aload #15
/*    */     //   221: getfield L$2 : Ljava/lang/Object;
/*    */     //   224: checkcast java/util/List
/*    */     //   227: astore_2
/*    */     //   228: aload #15
/*    */     //   230: getfield L$1 : Ljava/lang/Object;
/*    */     //   233: checkcast java/lang/String
/*    */     //   236: astore_1
/*    */     //   237: aload #15
/*    */     //   239: getfield L$0 : Ljava/lang/Object;
/*    */     //   242: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique
/*    */     //   245: astore_0
/*    */     //   246: aload #14
/*    */     //   248: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   251: aload #14
/*    */     //   253: aload #13
/*    */     //   255: swap
/*    */     //   256: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElementAgent
/*    */     //   259: aload_1
/*    */     //   260: ldc_w 'system'
/*    */     //   263: bipush #8
/*    */     //   265: aconst_null
/*    */     //   266: astore #16
/*    */     //   268: istore #17
/*    */     //   270: astore #18
/*    */     //   272: astore #19
/*    */     //   274: astore #20
/*    */     //   276: new com/intellij/ml/llm/matterhorn/UserTrajectoryElement
/*    */     //   279: dup
/*    */     //   280: aload #20
/*    */     //   282: aload #19
/*    */     //   284: aload #18
/*    */     //   286: iconst_0
/*    */     //   287: iload #17
/*    */     //   289: aload #16
/*    */     //   291: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   294: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElement
/*    */     //   297: aload #15
/*    */     //   299: aload #15
/*    */     //   301: aload_0
/*    */     //   302: putfield L$0 : Ljava/lang/Object;
/*    */     //   305: aload #15
/*    */     //   307: aload_2
/*    */     //   308: putfield L$1 : Ljava/lang/Object;
/*    */     //   311: aload #15
/*    */     //   313: aload_3
/*    */     //   314: putfield L$2 : Ljava/lang/Object;
/*    */     //   317: aload #15
/*    */     //   319: aload #5
/*    */     //   321: putfield L$3 : Ljava/lang/Object;
/*    */     //   324: aload #15
/*    */     //   326: aconst_null
/*    */     //   327: putfield L$4 : Ljava/lang/Object;
/*    */     //   330: aload #15
/*    */     //   332: aconst_null
/*    */     //   333: putfield L$5 : Ljava/lang/Object;
/*    */     //   336: aload #15
/*    */     //   338: iconst_2
/*    */     //   339: putfield label : I
/*    */     //   342: invokevirtual logTrajectoryElement : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   345: dup
/*    */     //   346: aload #35
/*    */     //   348: if_acmpne -> 398
/*    */     //   351: aload #35
/*    */     //   353: areturn
/*    */     //   354: aload #15
/*    */     //   356: getfield L$3 : Ljava/lang/Object;
/*    */     //   359: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*    */     //   362: astore #5
/*    */     //   364: aload #15
/*    */     //   366: getfield L$2 : Ljava/lang/Object;
/*    */     //   369: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   372: astore_3
/*    */     //   373: aload #15
/*    */     //   375: getfield L$1 : Ljava/lang/Object;
/*    */     //   378: checkcast java/util/List
/*    */     //   381: astore_2
/*    */     //   382: aload #15
/*    */     //   384: getfield L$0 : Ljava/lang/Object;
/*    */     //   387: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique
/*    */     //   390: astore_0
/*    */     //   391: aload #14
/*    */     //   393: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   396: aload #14
/*    */     //   398: pop
/*    */     //   399: aload_2
/*    */     //   400: checkcast java/lang/Iterable
/*    */     //   403: astore #6
/*    */     //   405: iconst_0
/*    */     //   406: istore #7
/*    */     //   408: aload #6
/*    */     //   410: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   415: astore #8
/*    */     //   417: aload #8
/*    */     //   419: invokeinterface hasNext : ()Z
/*    */     //   424: ifeq -> 1137
/*    */     //   427: aload #8
/*    */     //   429: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   434: astore #9
/*    */     //   436: aload #9
/*    */     //   438: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   441: astore #10
/*    */     //   443: iconst_0
/*    */     //   444: istore #11
/*    */     //   446: aload #10
/*    */     //   448: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*    */     //   451: ifeq -> 1122
/*    */     //   454: aload #10
/*    */     //   456: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*    */     //   459: invokevirtual getKind : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*    */     //   462: getstatic com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique$WhenMappings.$EnumSwitchMapping$0 : [I
/*    */     //   465: swap
/*    */     //   466: invokevirtual ordinal : ()I
/*    */     //   469: iaload
/*    */     //   470: tableswitch default -> 1114, 1 -> 492, 2 -> 791
/*    */     //   492: aload_3
/*    */     //   493: astore #12
/*    */     //   495: aload_0
/*    */     //   496: aload #5
/*    */     //   498: aload #15
/*    */     //   500: aload #15
/*    */     //   502: aload_0
/*    */     //   503: putfield L$0 : Ljava/lang/Object;
/*    */     //   506: aload #15
/*    */     //   508: aload_3
/*    */     //   509: putfield L$1 : Ljava/lang/Object;
/*    */     //   512: aload #15
/*    */     //   514: aload #5
/*    */     //   516: putfield L$2 : Ljava/lang/Object;
/*    */     //   519: aload #15
/*    */     //   521: aload #8
/*    */     //   523: putfield L$3 : Ljava/lang/Object;
/*    */     //   526: aload #15
/*    */     //   528: aload #10
/*    */     //   530: putfield L$4 : Ljava/lang/Object;
/*    */     //   533: aload #15
/*    */     //   535: aload #12
/*    */     //   537: putfield L$5 : Ljava/lang/Object;
/*    */     //   540: aload #15
/*    */     //   542: iconst_3
/*    */     //   543: putfield label : I
/*    */     //   546: invokespecial getTrajectoryElementAgent : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   549: dup
/*    */     //   550: aload #35
/*    */     //   552: if_acmpne -> 629
/*    */     //   555: aload #35
/*    */     //   557: areturn
/*    */     //   558: iconst_0
/*    */     //   559: istore #7
/*    */     //   561: iconst_0
/*    */     //   562: istore #11
/*    */     //   564: aload #15
/*    */     //   566: getfield L$5 : Ljava/lang/Object;
/*    */     //   569: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   572: astore #12
/*    */     //   574: aload #15
/*    */     //   576: getfield L$4 : Ljava/lang/Object;
/*    */     //   579: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   582: astore #10
/*    */     //   584: aload #15
/*    */     //   586: getfield L$3 : Ljava/lang/Object;
/*    */     //   589: checkcast java/util/Iterator
/*    */     //   592: astore #8
/*    */     //   594: aload #15
/*    */     //   596: getfield L$2 : Ljava/lang/Object;
/*    */     //   599: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*    */     //   602: astore #5
/*    */     //   604: aload #15
/*    */     //   606: getfield L$1 : Ljava/lang/Object;
/*    */     //   609: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   612: astore_3
/*    */     //   613: aload #15
/*    */     //   615: getfield L$0 : Ljava/lang/Object;
/*    */     //   618: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique
/*    */     //   621: astore_0
/*    */     //   622: aload #14
/*    */     //   624: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   627: aload #14
/*    */     //   629: aload #12
/*    */     //   631: swap
/*    */     //   632: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElementAgent
/*    */     //   635: aload #10
/*    */     //   637: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*    */     //   640: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   643: aconst_null
/*    */     //   644: bipush #12
/*    */     //   646: aconst_null
/*    */     //   647: astore #21
/*    */     //   649: istore #22
/*    */     //   651: astore #23
/*    */     //   653: astore #24
/*    */     //   655: astore #25
/*    */     //   657: new com/intellij/ml/llm/matterhorn/UserTrajectoryElement
/*    */     //   660: dup
/*    */     //   661: aload #25
/*    */     //   663: aload #24
/*    */     //   665: aload #23
/*    */     //   667: iconst_0
/*    */     //   668: iload #22
/*    */     //   670: aload #21
/*    */     //   672: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   675: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElement
/*    */     //   678: aload #15
/*    */     //   680: aload #15
/*    */     //   682: aload_0
/*    */     //   683: putfield L$0 : Ljava/lang/Object;
/*    */     //   686: aload #15
/*    */     //   688: aload_3
/*    */     //   689: putfield L$1 : Ljava/lang/Object;
/*    */     //   692: aload #15
/*    */     //   694: aload #5
/*    */     //   696: putfield L$2 : Ljava/lang/Object;
/*    */     //   699: aload #15
/*    */     //   701: aload #8
/*    */     //   703: putfield L$3 : Ljava/lang/Object;
/*    */     //   706: aload #15
/*    */     //   708: aconst_null
/*    */     //   709: putfield L$4 : Ljava/lang/Object;
/*    */     //   712: aload #15
/*    */     //   714: aconst_null
/*    */     //   715: putfield L$5 : Ljava/lang/Object;
/*    */     //   718: aload #15
/*    */     //   720: iconst_4
/*    */     //   721: putfield label : I
/*    */     //   724: invokevirtual logTrajectoryElement : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   727: dup
/*    */     //   728: aload #35
/*    */     //   730: if_acmpne -> 787
/*    */     //   733: aload #35
/*    */     //   735: areturn
/*    */     //   736: iconst_0
/*    */     //   737: istore #7
/*    */     //   739: iconst_0
/*    */     //   740: istore #11
/*    */     //   742: aload #15
/*    */     //   744: getfield L$3 : Ljava/lang/Object;
/*    */     //   747: checkcast java/util/Iterator
/*    */     //   750: astore #8
/*    */     //   752: aload #15
/*    */     //   754: getfield L$2 : Ljava/lang/Object;
/*    */     //   757: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*    */     //   760: astore #5
/*    */     //   762: aload #15
/*    */     //   764: getfield L$1 : Ljava/lang/Object;
/*    */     //   767: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   770: astore_3
/*    */     //   771: aload #15
/*    */     //   773: getfield L$0 : Ljava/lang/Object;
/*    */     //   776: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique
/*    */     //   779: astore_0
/*    */     //   780: aload #14
/*    */     //   782: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   785: aload #14
/*    */     //   787: pop
/*    */     //   788: goto -> 1133
/*    */     //   791: aload_3
/*    */     //   792: astore #12
/*    */     //   794: aload_0
/*    */     //   795: aload #5
/*    */     //   797: aload #15
/*    */     //   799: aload #15
/*    */     //   801: aload_0
/*    */     //   802: putfield L$0 : Ljava/lang/Object;
/*    */     //   805: aload #15
/*    */     //   807: aload_3
/*    */     //   808: putfield L$1 : Ljava/lang/Object;
/*    */     //   811: aload #15
/*    */     //   813: aload #5
/*    */     //   815: putfield L$2 : Ljava/lang/Object;
/*    */     //   818: aload #15
/*    */     //   820: aload #8
/*    */     //   822: putfield L$3 : Ljava/lang/Object;
/*    */     //   825: aload #15
/*    */     //   827: aload #10
/*    */     //   829: putfield L$4 : Ljava/lang/Object;
/*    */     //   832: aload #15
/*    */     //   834: aload #12
/*    */     //   836: putfield L$5 : Ljava/lang/Object;
/*    */     //   839: aload #15
/*    */     //   841: iconst_5
/*    */     //   842: putfield label : I
/*    */     //   845: invokespecial getTrajectoryElementAgent : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   848: dup
/*    */     //   849: aload #35
/*    */     //   851: if_acmpne -> 928
/*    */     //   854: aload #35
/*    */     //   856: areturn
/*    */     //   857: iconst_0
/*    */     //   858: istore #7
/*    */     //   860: iconst_0
/*    */     //   861: istore #11
/*    */     //   863: aload #15
/*    */     //   865: getfield L$5 : Ljava/lang/Object;
/*    */     //   868: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   871: astore #12
/*    */     //   873: aload #15
/*    */     //   875: getfield L$4 : Ljava/lang/Object;
/*    */     //   878: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*    */     //   881: astore #10
/*    */     //   883: aload #15
/*    */     //   885: getfield L$3 : Ljava/lang/Object;
/*    */     //   888: checkcast java/util/Iterator
/*    */     //   891: astore #8
/*    */     //   893: aload #15
/*    */     //   895: getfield L$2 : Ljava/lang/Object;
/*    */     //   898: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*    */     //   901: astore #5
/*    */     //   903: aload #15
/*    */     //   905: getfield L$1 : Ljava/lang/Object;
/*    */     //   908: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   911: astore_3
/*    */     //   912: aload #15
/*    */     //   914: getfield L$0 : Ljava/lang/Object;
/*    */     //   917: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique
/*    */     //   920: astore_0
/*    */     //   921: aload #14
/*    */     //   923: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   926: aload #14
/*    */     //   928: aload #12
/*    */     //   930: swap
/*    */     //   931: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElementAgent
/*    */     //   934: aload #10
/*    */     //   936: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*    */     //   939: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   942: ldc_w ''
/*    */     //   945: ldc_w ''
/*    */     //   948: aconst_null
/*    */     //   949: aconst_null
/*    */     //   950: aconst_null
/*    */     //   951: bipush #64
/*    */     //   953: aconst_null
/*    */     //   954: astore #26
/*    */     //   956: istore #27
/*    */     //   958: astore #28
/*    */     //   960: astore #29
/*    */     //   962: astore #30
/*    */     //   964: astore #31
/*    */     //   966: astore #32
/*    */     //   968: astore #33
/*    */     //   970: astore #34
/*    */     //   972: new com/intellij/ml/llm/matterhorn/AssistantTrajectoryElement
/*    */     //   975: dup
/*    */     //   976: aload #34
/*    */     //   978: aload #33
/*    */     //   980: aload #32
/*    */     //   982: aload #31
/*    */     //   984: aload #30
/*    */     //   986: aload #29
/*    */     //   988: aload #28
/*    */     //   990: iload #27
/*    */     //   992: aload #26
/*    */     //   994: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   997: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElement
/*    */     //   1000: aload #15
/*    */     //   1002: aload #15
/*    */     //   1004: aload_0
/*    */     //   1005: putfield L$0 : Ljava/lang/Object;
/*    */     //   1008: aload #15
/*    */     //   1010: aload_3
/*    */     //   1011: putfield L$1 : Ljava/lang/Object;
/*    */     //   1014: aload #15
/*    */     //   1016: aload #5
/*    */     //   1018: putfield L$2 : Ljava/lang/Object;
/*    */     //   1021: aload #15
/*    */     //   1023: aload #8
/*    */     //   1025: putfield L$3 : Ljava/lang/Object;
/*    */     //   1028: aload #15
/*    */     //   1030: aconst_null
/*    */     //   1031: putfield L$4 : Ljava/lang/Object;
/*    */     //   1034: aload #15
/*    */     //   1036: aconst_null
/*    */     //   1037: putfield L$5 : Ljava/lang/Object;
/*    */     //   1040: aload #15
/*    */     //   1042: bipush #6
/*    */     //   1044: putfield label : I
/*    */     //   1047: invokevirtual logTrajectoryElement : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   1050: dup
/*    */     //   1051: aload #35
/*    */     //   1053: if_acmpne -> 1110
/*    */     //   1056: aload #35
/*    */     //   1058: areturn
/*    */     //   1059: iconst_0
/*    */     //   1060: istore #7
/*    */     //   1062: iconst_0
/*    */     //   1063: istore #11
/*    */     //   1065: aload #15
/*    */     //   1067: getfield L$3 : Ljava/lang/Object;
/*    */     //   1070: checkcast java/util/Iterator
/*    */     //   1073: astore #8
/*    */     //   1075: aload #15
/*    */     //   1077: getfield L$2 : Ljava/lang/Object;
/*    */     //   1080: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*    */     //   1083: astore #5
/*    */     //   1085: aload #15
/*    */     //   1087: getfield L$1 : Ljava/lang/Object;
/*    */     //   1090: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*    */     //   1093: astore_3
/*    */     //   1094: aload #15
/*    */     //   1096: getfield L$0 : Ljava/lang/Object;
/*    */     //   1099: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique
/*    */     //   1102: astore_0
/*    */     //   1103: aload #14
/*    */     //   1105: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   1108: aload #14
/*    */     //   1110: pop
/*    */     //   1111: goto -> 1133
/*    */     //   1114: new kotlin/NoWhenBranchMatchedException
/*    */     //   1117: dup
/*    */     //   1118: invokespecial <init> : ()V
/*    */     //   1121: athrow
/*    */     //   1122: new java/lang/InternalError
/*    */     //   1125: dup
/*    */     //   1126: ldc_w 'Non message chat element not supported'
/*    */     //   1129: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   1132: athrow
/*    */     //   1133: nop
/*    */     //   1134: goto -> 417
/*    */     //   1137: nop
/*    */     //   1138: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   1141: areturn
/*    */     //   1142: new java/lang/IllegalStateException
/*    */     //   1145: dup
/*    */     //   1146: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   1148: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   1151: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #108	-> 63
/*    */     //   #113	-> 117
/*    */     //   #114	-> 126
/*    */     //   #108	-> 187
/*    */     //   #114	-> 253
/*    */     //   #108	-> 351
/*    */     //   #115	-> 398
/*    */     //   #159	-> 408
/*    */     //   #116	-> 446
/*    */     //   #117	-> 454
/*    */     //   #118	-> 492
/*    */     //   #119	-> 493
/*    */     //   #108	-> 555
/*    */     //   #119	-> 629
/*    */     //   #118	-> 680
/*    */     //   #108	-> 733
/*    */     //   #118	-> 787
/*    */     //   #122	-> 791
/*    */     //   #123	-> 792
/*    */     //   #124	-> 794
/*    */     //   #108	-> 854
/*    */     //   #125	-> 934
/*    */     //   #126	-> 942
/*    */     //   #127	-> 945
/*    */     //   #128	-> 948
/*    */     //   #129	-> 949
/*    */     //   #123	-> 950
/*    */     //   #122	-> 1002
/*    */     //   #108	-> 1056
/*    */     //   #122	-> 1110
/*    */     //   #117	-> 1114
/*    */     //   #134	-> 1122
/*    */     //   #136	-> 1133
/*    */     //   #159	-> 1134
/*    */     //   #160	-> 1137
/*    */     //   #137	-> 1138
/*    */     //   #108	-> 1142
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   117	73	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique;
/*    */     //   246	108	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique;
/*    */     //   391	167	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique;
/*    */     //   622	114	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique;
/*    */     //   780	77	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique;
/*    */     //   921	138	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique;
/*    */     //   1103	11	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique;
/*    */     //   1122	20	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritique;
/*    */     //   117	73	1	systemPrompt	Ljava/lang/String;
/*    */     //   237	49	1	systemPrompt	Ljava/lang/String;
/*    */     //   117	73	2	observations	Ljava/util/List;
/*    */     //   228	126	2	observations	Ljava/util/List;
/*    */     //   382	23	2	observations	Ljava/util/List;
/*    */     //   117	73	3	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   219	135	3	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   373	185	3	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   613	123	3	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   771	86	3	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   912	147	3	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   1094	20	3	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   1122	20	3	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   126	64	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   210	144	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   364	194	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   604	132	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   762	95	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   903	156	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   1085	29	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   1122	20	5	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   405	12	6	$this$forEach$iv	Ljava/lang/Iterable;
/*    */     //   436	7	9	element$iv	Ljava/lang/Object;
/*    */     //   443	115	10	it	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   584	83	10	it	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   791	66	10	it	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   883	59	10	it	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   446	112	11	$i$a$-forEach-NebiusCritique$logCritiqueInputToTrajectory$2	I
/*    */     //   408	150	7	$i$f$forEach	I
/*    */     //   0	1152	4	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	1089	15	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	1082	14	$result	Ljava/lang/Object;
/*    */     //   564	172	11	$i$a$-forEach-NebiusCritique$logCritiqueInputToTrajectory$2	I
/*    */     //   561	175	7	$i$f$forEach	I
/*    */     //   742	115	11	$i$a$-forEach-NebiusCritique$logCritiqueInputToTrajectory$2	I
/*    */     //   739	118	7	$i$f$forEach	I
/*    */     //   863	196	11	$i$a$-forEach-NebiusCritique$logCritiqueInputToTrajectory$2	I
/*    */     //   860	199	7	$i$f$forEach	I
/*    */     //   1065	69	11	$i$a$-forEach-NebiusCritique$logCritiqueInputToTrajectory$2	I
/*    */     //   1062	76	7	$i$f$forEach	I
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "NebiusCritique.kt", l = {46, 49}, i = {0}, s = {"L$0"}, n = {"propertyProvider"}, m = "getAgentParameters", c = "com.intellij.ml.llm.matterhorn.ej.core.critique.NebiusCritique")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class NebiusCritique$getAgentParameters$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     NebiusCritique$getAgentParameters$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return NebiusCritique.this.getAgentParameters(null, (Continuation)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "NebiusCritique.kt", l = {54}, i = {0}, s = {"L$0"}, n = {"json"}, m = "getTrajectoryElementAgent", c = "com.intellij.ml.llm.matterhorn.ej.core.critique.NebiusCritique")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class NebiusCritique$getTrajectoryElementAgent$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     NebiusCritique$getTrajectoryElementAgent$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return NebiusCritique.this.getTrajectoryElementAgent(null, (Continuation)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "NebiusCritique.kt", l = {114, 114, 119, 118, 124, 122}, i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$4", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4", "L$0", "L$1", "L$2"}, n = {"this", "systemPrompt", "observations", "context", "propertyProvider", "this", "observations", "context", "propertyProvider", "this", "context", "propertyProvider", "it", "this", "context", "propertyProvider", "this", "context", "propertyProvider", "it", "this", "context", "propertyProvider"}, m = "logCritiqueInputToTrajectory", c = "com.intellij.ml.llm.matterhorn.ej.core.critique.NebiusCritique")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class NebiusCritique$logCritiqueInputToTrajectory$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     Object L$3;
/*    */     Object L$4;
/*    */     Object L$5;
/*    */     int label;
/*    */     
/*    */     NebiusCritique$logCritiqueInputToTrajectory$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return NebiusCritique.this.logCritiqueInputToTrajectory(null, null, null, (Continuation)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "NebiusCritique.kt", l = {75, 81, 84}, i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "I$1"}, n = {"this", "input", "context", "result", "critiqueSystemPrompt", "observations", "this", "input", "context", "result", "critiqueSystemPrompt", "observations", "actionToRank", "idx", "this", "input", "context", "result", "critiqueSystemPrompt", "observations", "actionToRank", "idx"}, m = "produceArtifact", c = "com.intellij.ml.llm.matterhorn.ej.core.critique.NebiusCritique")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class NebiusCritique$produceArtifact$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     Object L$3;
/*    */     Object L$4;
/*    */     Object L$5;
/*    */     Object L$6;
/*    */     Object L$7;
/*    */     Object L$8;
/*    */     Object L$9;
/*    */     int I$0;
/*    */     int I$1;
/*    */     int label;
/*    */     
/*    */     NebiusCritique$produceArtifact$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return NebiusCritique.this.produceArtifact((CritiqueInput)null, (ExecutionContext)null, (Continuation<? super ArtifactResponse<CritiqueResponse>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\critique\NebiusCritique.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */