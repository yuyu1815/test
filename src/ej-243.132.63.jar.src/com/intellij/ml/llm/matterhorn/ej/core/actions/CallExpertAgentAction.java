/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentAction;
/*     */ import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.json.JsonBuilder;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\b\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\002\030\002\n\002\b\006\030\000 (2\0020\001:\001(B\007¢\006\004\b\002\020\003J\036\020\021\032\0020\0052\006\020\022\032\0020\0232\006\020\024\032\0020\025H@¢\006\002\020\026J\026\020\027\032\0020\0052\006\020\022\032\0020\023H@¢\006\002\020\030J\020\020\031\032\0020\0322\006\020\033\032\0020\005H\002J\030\020\034\032\0020\0352\006\020\036\032\0020\0052\006\020\037\032\0020 H\002J>\020!\032\0020\"2\006\020\024\032\0020#2\006\020\036\032\0020\0052\006\020\037\032\0020 2\006\020$\032\0020\0052\006\020%\032\0020\0052\006\020&\032\0020\005H@¢\006\002\020'R\024\020\004\032\0020\005XD¢\006\b\n\000\032\004\b\006\020\007R\032\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\b\n\000\032\004\b\013\020\fR\024\020\r\032\0020\005X\004¢\006\b\n\000\032\004\b\016\020\007R\024\020\017\032\0020\005XD¢\006\b\n\000\032\004\b\020\020\007¨\006)"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "arguments", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/Argument;", "getArguments", "()Ljava/util/List;", "docstring", "getDocstring", "customSignature", "getCustomSignature", "execute", "request", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseArguments", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAnswerFromUser", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/UserAnswerAsExpert;", "questionFromAgent", "getTrajectoryElementAgentForExpert", "Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;", "agentType", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "logExpertTrajectories", "", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "systemMessage", "prompt", "response", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nCallExpertAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallExpertAction.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,133:1\n205#2:134\n*S KotlinDebug\n*F\n+ 1 CallExpertAction.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction\n*L\n117#1:134\n*E\n"})
/*     */ public final class CallExpertAgentAction implements AgentAction {
/*     */   @Nullable
/*  19 */   public Object getInputParams(@NotNull ActionRequest $this$getInputParams, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.getInputParams(this, $this$getInputParams, $completion); } @NotNull public static final Companion Companion = new Companion(null); @Nullable public Object reviewActionRequest(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.reviewActionRequest(this, request, context, $completion); }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000R\016\020\007\032\0020\005XT¢\006\002\n\000¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction$Companion;", "", "<init>", "()V", "CALL_EXPERT_ACTION_NAME", "", "MESSAGE_ARGUMENT", "QUOTA_USED_MESSAGE", "ej-core"})
/*     */   public static final class Companion {
/*     */     private Companion() {} }
/*     */   @NotNull
/*  25 */   private final String name = "call_expert"; @NotNull public String getName() { return this.name; } @NotNull
/*  26 */   private final List<Argument> arguments = CollectionsKt.listOf(
/*  27 */       new Argument(
/*  28 */         "message", 
/*  29 */         ArgumentType.STRING, 
/*  30 */         "the message to send to the expert. You need to explain your problem, aiming to be concise yet informative.", false, false, 24, null)); @NotNull
/*     */   public List<Argument> getArguments() { return this.arguments; }
/*     */   @NotNull
/*  33 */   public String getDocstring() { return this.docstring; }
/*     */    @NotNull
/*  35 */   private final String docstring = "If the `<issue_description>` isn't clear, or your approach didn't solve the issue, or you're stuck, you can ask an expert for help.\nAn expert can also help if existing tests fail and you're unsure whether to fix the code or if the test contradicts the issue and needs to be corrected.\nIt's important to have a good level of self-criticism when assessing your ability to solve the issue, so it would be wise to ask for help."; @NotNull
/*  36 */   private final String customSignature = "call_expert\n<message>"; @NotNull public static final String CALL_EXPERT_ACTION_NAME = "call_expert"; @NotNull public static final String MESSAGE_ARGUMENT = "message"; @NotNull public static final String QUOTA_USED_MESSAGE = "\nYou have used your entire quota for `call_expert`. Don't call `call_expert` again."; @NotNull public String getCustomSignature() { return this.customSignature; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   public Object execute(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction$execute$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction$execute$1
/*     */     //   11: astore #19
/*     */     //   13: aload #19
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #19
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction$execute$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #19
/*     */     //   50: aload #19
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #18
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #20
/*     */     //   62: aload #19
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 652, 0 -> 96, 1 -> 135, 2 -> 497, 3 -> 626
/*     */     //   96: aload #18
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: aload_0
/*     */     //   102: aload_1
/*     */     //   103: aload #19
/*     */     //   105: aload #19
/*     */     //   107: aload_0
/*     */     //   108: putfield L$0 : Ljava/lang/Object;
/*     */     //   111: aload #19
/*     */     //   113: aload_2
/*     */     //   114: putfield L$1 : Ljava/lang/Object;
/*     */     //   117: aload #19
/*     */     //   119: iconst_1
/*     */     //   120: putfield label : I
/*     */     //   123: invokespecial parseArguments : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   126: dup
/*     */     //   127: aload #20
/*     */     //   129: if_acmpne -> 160
/*     */     //   132: aload #20
/*     */     //   134: areturn
/*     */     //   135: aload #19
/*     */     //   137: getfield L$1 : Ljava/lang/Object;
/*     */     //   140: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   143: astore_2
/*     */     //   144: aload #19
/*     */     //   146: getfield L$0 : Ljava/lang/Object;
/*     */     //   149: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction
/*     */     //   152: astore_0
/*     */     //   153: aload #18
/*     */     //   155: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   158: aload #18
/*     */     //   160: checkcast java/lang/String
/*     */     //   163: astore #4
/*     */     //   165: aload #4
/*     */     //   167: checkcast java/lang/CharSequence
/*     */     //   170: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   173: ifeq -> 179
/*     */     //   176: ldc 'ERROR: no agent question'
/*     */     //   178: areturn
/*     */     //   179: aload_2
/*     */     //   180: invokeinterface getAgentParameters : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */     //   185: dup
/*     */     //   186: ifnull -> 195
/*     */     //   189: invokevirtual getAllowCallExpert : ()D
/*     */     //   192: goto -> 197
/*     */     //   195: pop
/*     */     //   196: dconst_0
/*     */     //   197: dstore #5
/*     */     //   199: invokestatic currentTimeMillis : ()J
/*     */     //   202: invokestatic Random : (J)Lkotlin/random/Random;
/*     */     //   205: invokevirtual nextDouble : ()D
/*     */     //   208: dstore #7
/*     */     //   210: dload #5
/*     */     //   212: dload #7
/*     */     //   214: dcmpl
/*     */     //   215: ifle -> 245
/*     */     //   218: aload_0
/*     */     //   219: aload #4
/*     */     //   221: invokespecial getAnswerFromUser : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/actions/UserAnswerAsExpert;
/*     */     //   224: astore #9
/*     */     //   226: aload #9
/*     */     //   228: invokevirtual getSuccess : ()Z
/*     */     //   231: ifeq -> 245
/*     */     //   234: aload #9
/*     */     //   236: invokevirtual getAnswer : ()Ljava/lang/String;
/*     */     //   239: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   244: areturn
/*     */     //   245: aload_2
/*     */     //   246: invokeinterface getCurrentAgentState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   251: astore #9
/*     */     //   253: aload #9
/*     */     //   255: ifnonnull -> 261
/*     */     //   258: ldc 'ERROR: no agent state'
/*     */     //   260: areturn
/*     */     //   261: aload #9
/*     */     //   263: invokevirtual presentableHistory : ()Ljava/lang/String;
/*     */     //   266: astore #10
/*     */     //   268: aload #9
/*     */     //   270: invokevirtual getExplicitlySelectedContextFiles : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   273: ifnull -> 292
/*     */     //   276: aload #9
/*     */     //   278: invokevirtual getExplicitlySelectedContextFiles : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   281: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   284: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   289: goto -> 294
/*     */     //   292: ldc ''
/*     */     //   294: astore #11
/*     */     //   296: aload #9
/*     */     //   298: invokevirtual getGuidelines : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   301: dup
/*     */     //   302: ifnull -> 312
/*     */     //   305: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   308: dup
/*     */     //   309: ifnonnull -> 315
/*     */     //   312: pop
/*     */     //   313: ldc ''
/*     */     //   315: astore #12
/*     */     //   317: aload #12
/*     */     //   319: checkcast java/lang/CharSequence
/*     */     //   322: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   325: ifne -> 332
/*     */     //   328: iconst_1
/*     */     //   329: goto -> 333
/*     */     //   332: iconst_0
/*     */     //   333: ifeq -> 345
/*     */     //   336: aload #12
/*     */     //   338: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   343: astore #12
/*     */     //   345: aload #9
/*     */     //   347: invokevirtual getIssue : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;
/*     */     //   350: aload #9
/*     */     //   352: invokevirtual getRecommendedSteps : ()Ljava/lang/String;
/*     */     //   355: aload #12
/*     */     //   357: aload #11
/*     */     //   359: aload #10
/*     */     //   361: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   366: astore #13
/*     */     //   368: ldc 'You are a programming expert.'
/*     */     //   370: astore #14
/*     */     //   372: new com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*     */     //   375: dup
/*     */     //   376: getstatic com/intellij/ml/llm/matterhorn/llm/LLM.Companion : Lcom/intellij/ml/llm/matterhorn/llm/LLM$Companion;
/*     */     //   379: invokevirtual getGPT_4_O_2024_08_06 : ()Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   382: iconst_0
/*     */     //   383: aconst_null
/*     */     //   384: aconst_null
/*     */     //   385: aconst_null
/*     */     //   386: aconst_null
/*     */     //   387: aconst_null
/*     */     //   388: aconst_null
/*     */     //   389: aconst_null
/*     */     //   390: aconst_null
/*     */     //   391: aconst_null
/*     */     //   392: aconst_null
/*     */     //   393: aconst_null
/*     */     //   394: iconst_0
/*     */     //   395: aconst_null
/*     */     //   396: sipush #32766
/*     */     //   399: aconst_null
/*     */     //   400: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/LLM;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   403: astore #15
/*     */     //   405: new com/intellij/ml/llm/matterhorn/requests/SimpleRequest
/*     */     //   408: dup
/*     */     //   409: aload #14
/*     */     //   411: aload #13
/*     */     //   413: invokestatic toUserMessage : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   416: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   419: aload #15
/*     */     //   421: aconst_null
/*     */     //   422: bipush #8
/*     */     //   424: aconst_null
/*     */     //   425: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   428: astore #16
/*     */     //   430: aload_2
/*     */     //   431: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   436: aload #16
/*     */     //   438: checkcast com/intellij/ml/llm/matterhorn/requests/GrazieRequest
/*     */     //   441: iconst_0
/*     */     //   442: aload #19
/*     */     //   444: iconst_2
/*     */     //   445: aconst_null
/*     */     //   446: aload #19
/*     */     //   448: aload_0
/*     */     //   449: putfield L$0 : Ljava/lang/Object;
/*     */     //   452: aload #19
/*     */     //   454: aload_2
/*     */     //   455: putfield L$1 : Ljava/lang/Object;
/*     */     //   458: aload #19
/*     */     //   460: aload #13
/*     */     //   462: putfield L$2 : Ljava/lang/Object;
/*     */     //   465: aload #19
/*     */     //   467: aload #14
/*     */     //   469: putfield L$3 : Ljava/lang/Object;
/*     */     //   472: aload #19
/*     */     //   474: aload #15
/*     */     //   476: putfield L$4 : Ljava/lang/Object;
/*     */     //   479: aload #19
/*     */     //   481: iconst_2
/*     */     //   482: putfield label : I
/*     */     //   485: invokestatic sendToGrazie$default : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   488: dup
/*     */     //   489: aload #20
/*     */     //   491: if_acmpne -> 552
/*     */     //   494: aload #20
/*     */     //   496: areturn
/*     */     //   497: aload #19
/*     */     //   499: getfield L$4 : Ljava/lang/Object;
/*     */     //   502: checkcast com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*     */     //   505: astore #15
/*     */     //   507: aload #19
/*     */     //   509: getfield L$3 : Ljava/lang/Object;
/*     */     //   512: checkcast java/lang/String
/*     */     //   515: astore #14
/*     */     //   517: aload #19
/*     */     //   519: getfield L$2 : Ljava/lang/Object;
/*     */     //   522: checkcast java/lang/String
/*     */     //   525: astore #13
/*     */     //   527: aload #19
/*     */     //   529: getfield L$1 : Ljava/lang/Object;
/*     */     //   532: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   535: astore_2
/*     */     //   536: aload #19
/*     */     //   538: getfield L$0 : Ljava/lang/Object;
/*     */     //   541: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction
/*     */     //   544: astore_0
/*     */     //   545: aload #18
/*     */     //   547: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   550: aload #18
/*     */     //   552: checkcast java/lang/String
/*     */     //   555: astore #17
/*     */     //   557: aload_0
/*     */     //   558: aload_2
/*     */     //   559: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   564: ldc_w 'expert_call'
/*     */     //   567: aload #15
/*     */     //   569: aload #14
/*     */     //   571: aload #13
/*     */     //   573: aload #17
/*     */     //   575: aload #19
/*     */     //   577: aload #19
/*     */     //   579: aload #17
/*     */     //   581: putfield L$0 : Ljava/lang/Object;
/*     */     //   584: aload #19
/*     */     //   586: aconst_null
/*     */     //   587: putfield L$1 : Ljava/lang/Object;
/*     */     //   590: aload #19
/*     */     //   592: aconst_null
/*     */     //   593: putfield L$2 : Ljava/lang/Object;
/*     */     //   596: aload #19
/*     */     //   598: aconst_null
/*     */     //   599: putfield L$3 : Ljava/lang/Object;
/*     */     //   602: aload #19
/*     */     //   604: aconst_null
/*     */     //   605: putfield L$4 : Ljava/lang/Object;
/*     */     //   608: aload #19
/*     */     //   610: iconst_3
/*     */     //   611: putfield label : I
/*     */     //   614: invokespecial logExpertTrajectories : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   617: dup
/*     */     //   618: aload #20
/*     */     //   620: if_acmpne -> 643
/*     */     //   623: aload #20
/*     */     //   625: areturn
/*     */     //   626: aload #19
/*     */     //   628: getfield L$0 : Ljava/lang/Object;
/*     */     //   631: checkcast java/lang/String
/*     */     //   634: astore #17
/*     */     //   636: aload #18
/*     */     //   638: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   641: aload #18
/*     */     //   643: pop
/*     */     //   644: aload #17
/*     */     //   646: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   651: areturn
/*     */     //   652: new java/lang/IllegalStateException
/*     */     //   655: dup
/*     */     //   656: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   659: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   662: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #37	-> 60
/*     */     //   #40	-> 101
/*     */     //   #37	-> 132
/*     */     //   #41	-> 165
/*     */     //   #43	-> 179
/*     */     //   #44	-> 199
/*     */     //   #45	-> 210
/*     */     //   #46	-> 218
/*     */     //   #47	-> 226
/*     */     //   #48	-> 234
/*     */     //   #52	-> 245
/*     */     //   #53	-> 253
/*     */     //   #54	-> 261
/*     */     //   #56	-> 268
/*     */     //   #57	-> 296
/*     */     //   #58	-> 317
/*     */     //   #58	-> 333
/*     */     //   #71	-> 345
/*     */     //   #76	-> 350
/*     */     //   #78	-> 355
/*     */     //   #79	-> 357
/*     */     //   #83	-> 359
/*     */     //   #60	-> 366
/*     */     //   #86	-> 368
/*     */     //   #87	-> 372
/*     */     //   #88	-> 405
/*     */     //   #89	-> 409
/*     */     //   #90	-> 411
/*     */     //   #91	-> 419
/*     */     //   #88	-> 421
/*     */     //   #94	-> 430
/*     */     //   #37	-> 494
/*     */     //   #95	-> 557
/*     */     //   #37	-> 623
/*     */     //   #97	-> 643
/*     */     //   #37	-> 652
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	34	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction;
/*     */     //   153	26	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction;
/*     */     //   179	55	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction;
/*     */     //   245	16	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction;
/*     */     //   261	72	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction;
/*     */     //   333	164	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction;
/*     */     //   545	72	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction;
/*     */     //   101	25	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   101	34	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   144	35	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   179	55	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   245	16	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   261	72	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   333	164	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   536	81	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   165	14	4	agentQuestion	Ljava/lang/String;
/*     */     //   179	47	4	agentQuestion	Ljava/lang/String;
/*     */     //   199	19	5	allowCallExpert	D
/*     */     //   210	8	7	randomChoice	D
/*     */     //   226	19	9	userAnswer	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/UserAnswerAsExpert;
/*     */     //   253	8	9	agentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   261	72	9	agentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   333	22	9	agentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   268	65	10	taskSolutionHistory	Ljava/lang/String;
/*     */     //   333	33	10	taskSolutionHistory	Ljava/lang/String;
/*     */     //   296	37	11	explicitFilesToPrompt	Ljava/lang/String;
/*     */     //   333	26	11	explicitFilesToPrompt	Ljava/lang/String;
/*     */     //   317	16	12	guidelines	Ljava/lang/String;
/*     */     //   333	12	12	guidelines	Ljava/lang/String;
/*     */     //   345	12	12	guidelines	Ljava/lang/String;
/*     */     //   368	129	13	message	Ljava/lang/String;
/*     */     //   527	90	13	message	Ljava/lang/String;
/*     */     //   372	125	14	systemPromptExpert	Ljava/lang/String;
/*     */     //   517	100	14	systemPromptExpert	Ljava/lang/String;
/*     */     //   405	92	15	modelParametersExpert	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   507	110	15	modelParametersExpert	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   430	58	16	requestLLM	Lcom/intellij/ml/llm/matterhorn/requests/SimpleRequest;
/*     */     //   557	69	17	expertAnswer	Ljava/lang/String;
/*     */     //   636	16	17	expertAnswer	Ljava/lang/String;
/*     */     //   0	663	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	602	19	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	595	18	$result	Ljava/lang/Object;
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
/*     */   private final Object parseArguments(ActionRequest request, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction$parseArguments$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction$parseArguments$1
/*     */     //   11: astore #4
/*     */     //   13: aload #4
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #4
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction$parseArguments$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #4
/*     */     //   50: aload #4
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore_3
/*     */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   59: astore #5
/*     */     //   61: aload #4
/*     */     //   63: getfield label : I
/*     */     //   66: tableswitch default -> 169, 0 -> 88, 1 -> 140
/*     */     //   88: aload_3
/*     */     //   89: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   92: aload_1
/*     */     //   93: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest
/*     */     //   96: ifeq -> 118
/*     */     //   99: aload_1
/*     */     //   100: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest
/*     */     //   103: invokevirtual getArguments : ()Ljava/lang/String;
/*     */     //   106: checkcast java/lang/CharSequence
/*     */     //   109: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */     //   112: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   115: goto -> 168
/*     */     //   118: aload_0
/*     */     //   119: aload_1
/*     */     //   120: aload #4
/*     */     //   122: aload #4
/*     */     //   124: iconst_1
/*     */     //   125: putfield label : I
/*     */     //   128: invokevirtual getInputParams : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   131: dup
/*     */     //   132: aload #5
/*     */     //   134: if_acmpne -> 145
/*     */     //   137: aload #5
/*     */     //   139: areturn
/*     */     //   140: aload_3
/*     */     //   141: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   144: aload_3
/*     */     //   145: checkcast java/util/Map
/*     */     //   148: ldc 'message'
/*     */     //   150: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   155: checkcast com/intellij/ml/llm/matterhorn/llm/ParameterValue
/*     */     //   158: invokestatic tryGetNonEmptyStringValue : (Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;)Ljava/lang/String;
/*     */     //   161: dup
/*     */     //   162: ifnonnull -> 168
/*     */     //   165: pop
/*     */     //   166: ldc ''
/*     */     //   168: areturn
/*     */     //   169: new java/lang/IllegalStateException
/*     */     //   172: dup
/*     */     //   173: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   176: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   179: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #101	-> 59
/*     */     //   #102	-> 92
/*     */     //   #103	-> 93
/*     */     //   #104	-> 118
/*     */     //   #101	-> 137
/*     */     //   #104	-> 145
/*     */     //   #102	-> 168
/*     */     //   #101	-> 169
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   92	7	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction;
/*     */     //   118	13	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction;
/*     */     //   92	23	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   118	13	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   0	180	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	119	4	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   56	113	3	$result	Ljava/lang/Object;
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
/*     */   private final UserAnswerAsExpert getAnswerFromUser(String questionFromAgent) {
/* 111 */     return new UserAnswerAsExpert(false, "Re-read `issue_description` as you might have missed something, review your reproducing script and the source code modifications you've already made, and try to find a better approach. I believe you could solve the issue by yourself, so do not use `call_expert` again.");
/*     */   }
/*     */   
/*     */   private final TrajectoryElementAgent getTrajectoryElementAgentForExpert(String agentType, ModelParameters modelParameters) {
/* 115 */     Json json = JsonKt.Json$default(null, CallExpertAgentAction::getTrajectoryElementAgentForExpert$lambda$0, 1, null);
/* 116 */     String modelName = modelParameters.getModel().toString();
/* 117 */     Json this_$iv = json; int $i$f$encodeToString = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 134 */     this_$iv.getSerializersModule(); String agentParametersStr = this_$iv.encodeToString((SerializationStrategy)ModelParameters.Companion.serializer(), modelParameters);
/*     */     return new TrajectoryElementAgent(agentType, "0.1", modelName, agentParametersStr, null, 16, null);
/*     */   }
/*     */   
/*     */   private static final Unit getTrajectoryElementAgentForExpert$lambda$0(JsonBuilder $this$Json) {
/*     */     Intrinsics.checkNotNullParameter($this$Json, "$this$Json");
/*     */     $this$Json.setEncodeDefaults(true);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private final Object logExpertTrajectories(ExecutionContext context, String agentType, ModelParameters modelParameters, String systemMessage, String prompt, String response, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #7
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction$logExpertTrajectories$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #7
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction$logExpertTrajectories$1
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
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction$logExpertTrajectories$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #7
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #10
/*     */     //   53: aload #10
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #9
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #11
/*     */     //   65: aload #10
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 455, 0 -> 100, 1 -> 203, 2 -> 337, 3 -> 443
/*     */     //   100: aload #9
/*     */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   105: aload_0
/*     */     //   106: aload_2
/*     */     //   107: aload_3
/*     */     //   108: invokespecial getTrajectoryElementAgentForExpert : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;)Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;
/*     */     //   111: astore #8
/*     */     //   113: aload #4
/*     */     //   115: checkcast java/lang/CharSequence
/*     */     //   118: invokeinterface length : ()I
/*     */     //   123: ifle -> 130
/*     */     //   126: iconst_1
/*     */     //   127: goto -> 131
/*     */     //   130: iconst_0
/*     */     //   131: ifeq -> 250
/*     */     //   134: aload_1
/*     */     //   135: new com/intellij/ml/llm/matterhorn/UserTrajectoryElement
/*     */     //   138: dup
/*     */     //   139: aload #8
/*     */     //   141: aload #4
/*     */     //   143: ldc_w 'system'
/*     */     //   146: iconst_0
/*     */     //   147: bipush #8
/*     */     //   149: aconst_null
/*     */     //   150: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   153: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElement
/*     */     //   156: aload #10
/*     */     //   158: aload #10
/*     */     //   160: aload_1
/*     */     //   161: putfield L$0 : Ljava/lang/Object;
/*     */     //   164: aload #10
/*     */     //   166: aload #5
/*     */     //   168: putfield L$1 : Ljava/lang/Object;
/*     */     //   171: aload #10
/*     */     //   173: aload #6
/*     */     //   175: putfield L$2 : Ljava/lang/Object;
/*     */     //   178: aload #10
/*     */     //   180: aload #8
/*     */     //   182: putfield L$3 : Ljava/lang/Object;
/*     */     //   185: aload #10
/*     */     //   187: iconst_1
/*     */     //   188: putfield label : I
/*     */     //   191: invokevirtual logTrajectoryElement : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   194: dup
/*     */     //   195: aload #11
/*     */     //   197: if_acmpne -> 249
/*     */     //   200: aload #11
/*     */     //   202: areturn
/*     */     //   203: aload #10
/*     */     //   205: getfield L$3 : Ljava/lang/Object;
/*     */     //   208: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElementAgent
/*     */     //   211: astore #8
/*     */     //   213: aload #10
/*     */     //   215: getfield L$2 : Ljava/lang/Object;
/*     */     //   218: checkcast java/lang/String
/*     */     //   221: astore #6
/*     */     //   223: aload #10
/*     */     //   225: getfield L$1 : Ljava/lang/Object;
/*     */     //   228: checkcast java/lang/String
/*     */     //   231: astore #5
/*     */     //   233: aload #10
/*     */     //   235: getfield L$0 : Ljava/lang/Object;
/*     */     //   238: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   241: astore_1
/*     */     //   242: aload #9
/*     */     //   244: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   247: aload #9
/*     */     //   249: pop
/*     */     //   250: aload #5
/*     */     //   252: checkcast java/lang/CharSequence
/*     */     //   255: invokeinterface length : ()I
/*     */     //   260: ifle -> 267
/*     */     //   263: iconst_1
/*     */     //   264: goto -> 268
/*     */     //   267: iconst_0
/*     */     //   268: ifeq -> 374
/*     */     //   271: aload_1
/*     */     //   272: new com/intellij/ml/llm/matterhorn/UserTrajectoryElement
/*     */     //   275: dup
/*     */     //   276: aload #8
/*     */     //   278: aload #5
/*     */     //   280: aconst_null
/*     */     //   281: iconst_0
/*     */     //   282: bipush #12
/*     */     //   284: aconst_null
/*     */     //   285: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   288: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElement
/*     */     //   291: aload #10
/*     */     //   293: aload #10
/*     */     //   295: aload_1
/*     */     //   296: putfield L$0 : Ljava/lang/Object;
/*     */     //   299: aload #10
/*     */     //   301: aload #6
/*     */     //   303: putfield L$1 : Ljava/lang/Object;
/*     */     //   306: aload #10
/*     */     //   308: aload #8
/*     */     //   310: putfield L$2 : Ljava/lang/Object;
/*     */     //   313: aload #10
/*     */     //   315: aconst_null
/*     */     //   316: putfield L$3 : Ljava/lang/Object;
/*     */     //   319: aload #10
/*     */     //   321: iconst_2
/*     */     //   322: putfield label : I
/*     */     //   325: invokevirtual logTrajectoryElement : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   328: dup
/*     */     //   329: aload #11
/*     */     //   331: if_acmpne -> 373
/*     */     //   334: aload #11
/*     */     //   336: areturn
/*     */     //   337: aload #10
/*     */     //   339: getfield L$2 : Ljava/lang/Object;
/*     */     //   342: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElementAgent
/*     */     //   345: astore #8
/*     */     //   347: aload #10
/*     */     //   349: getfield L$1 : Ljava/lang/Object;
/*     */     //   352: checkcast java/lang/String
/*     */     //   355: astore #6
/*     */     //   357: aload #10
/*     */     //   359: getfield L$0 : Ljava/lang/Object;
/*     */     //   362: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   365: astore_1
/*     */     //   366: aload #9
/*     */     //   368: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   371: aload #9
/*     */     //   373: pop
/*     */     //   374: aload_1
/*     */     //   375: new com/intellij/ml/llm/matterhorn/AssistantTrajectoryElement
/*     */     //   378: dup
/*     */     //   379: aload #8
/*     */     //   381: aload #6
/*     */     //   383: ldc ''
/*     */     //   385: ldc ''
/*     */     //   387: aconst_null
/*     */     //   388: aconst_null
/*     */     //   389: aconst_null
/*     */     //   390: bipush #64
/*     */     //   392: aconst_null
/*     */     //   393: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   396: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElement
/*     */     //   399: aload #10
/*     */     //   401: aload #10
/*     */     //   403: aconst_null
/*     */     //   404: putfield L$0 : Ljava/lang/Object;
/*     */     //   407: aload #10
/*     */     //   409: aconst_null
/*     */     //   410: putfield L$1 : Ljava/lang/Object;
/*     */     //   413: aload #10
/*     */     //   415: aconst_null
/*     */     //   416: putfield L$2 : Ljava/lang/Object;
/*     */     //   419: aload #10
/*     */     //   421: aconst_null
/*     */     //   422: putfield L$3 : Ljava/lang/Object;
/*     */     //   425: aload #10
/*     */     //   427: iconst_3
/*     */     //   428: putfield label : I
/*     */     //   431: invokevirtual logTrajectoryElement : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   434: dup
/*     */     //   435: aload #11
/*     */     //   437: if_acmpne -> 450
/*     */     //   440: aload #11
/*     */     //   442: areturn
/*     */     //   443: aload #9
/*     */     //   445: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   448: aload #9
/*     */     //   450: pop
/*     */     //   451: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   454: areturn
/*     */     //   455: new java/lang/IllegalStateException
/*     */     //   458: dup
/*     */     //   459: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   462: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   465: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #121	-> 63
/*     */     //   #123	-> 105
/*     */     //   #124	-> 113
/*     */     //   #124	-> 131
/*     */     //   #125	-> 134
/*     */     //   #121	-> 200
/*     */     //   #127	-> 249
/*     */     //   #127	-> 268
/*     */     //   #128	-> 271
/*     */     //   #121	-> 334
/*     */     //   #130	-> 373
/*     */     //   #121	-> 440
/*     */     //   #131	-> 450
/*     */     //   #121	-> 455
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   105	8	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction;
/*     */     //   105	98	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   242	95	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   366	68	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   105	8	2	agentType	Ljava/lang/String;
/*     */     //   105	8	3	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   105	26	4	systemMessage	Ljava/lang/String;
/*     */     //   131	63	4	systemMessage	Ljava/lang/String;
/*     */     //   105	98	5	prompt	Ljava/lang/String;
/*     */     //   233	35	5	prompt	Ljava/lang/String;
/*     */     //   268	60	5	prompt	Ljava/lang/String;
/*     */     //   105	98	6	response	Ljava/lang/String;
/*     */     //   223	114	6	response	Ljava/lang/String;
/*     */     //   357	77	6	response	Ljava/lang/String;
/*     */     //   113	90	8	curTrajectoryElementAgent	Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;
/*     */     //   213	124	8	curTrajectoryElementAgent	Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;
/*     */     //   347	87	8	curTrajectoryElementAgent	Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;
/*     */     //   0	466	7	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	402	10	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	395	9	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "CallExpertAction.kt", l = {40, 94, 95}, i = {0, 0, 1, 1, 1, 1, 1, 2}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0"}, n = {"this", "context", "this", "context", "message", "systemPromptExpert", "modelParametersExpert", "expertAnswer"}, m = "execute", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.CallExpertAgentAction")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class CallExpertAgentAction$execute$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     int label;
/*     */     
/*     */     CallExpertAgentAction$execute$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return CallExpertAgentAction.this.execute(null, null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "CallExpertAction.kt", l = {125, 128, 130}, i = {0, 0, 0, 0, 1, 1, 1}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"}, n = {"context", "prompt", "response", "curTrajectoryElementAgent", "context", "response", "curTrajectoryElementAgent"}, m = "logExpertTrajectories", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.CallExpertAgentAction")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class CallExpertAgentAction$logExpertTrajectories$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     int label;
/*     */     
/*     */     CallExpertAgentAction$logExpertTrajectories$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return CallExpertAgentAction.this.logExpertTrajectories(null, null, null, null, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "CallExpertAction.kt", l = {104}, i = {}, s = {}, n = {}, m = "parseArguments", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.CallExpertAgentAction")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class CallExpertAgentAction$parseArguments$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     CallExpertAgentAction$parseArguments$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return CallExpertAgentAction.this.parseArguments(null, (Continuation)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\CallExpertAgentAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */