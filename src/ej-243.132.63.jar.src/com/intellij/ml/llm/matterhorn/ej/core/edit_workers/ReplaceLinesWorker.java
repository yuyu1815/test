/*     */ package com.intellij.ml.llm.matterhorn.ej.core.edit_workers;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentState;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\030\0002\0020\001B\007¢\006\004\b\002\020\003J\026\020\b\032\0020\t2\006\020\n\032\0020\013H@¢\006\002\020\fJ:\020\r\032\b\022\004\022\0020\0170\0162\006\020\020\032\0020\0212\006\020\022\032\0020\0232\006\020\024\032\0020\0252\f\020\026\032\b\022\004\022\0020\0170\016H@¢\006\002\020\027J\026\020\030\032\b\022\004\022\0020\0310\0162\006\020\020\032\0020\021H\026J\020\020\032\032\0020\0052\006\020\020\032\0020\021H\026J\020\020\033\032\0020\0052\006\020\020\032\0020\021H\026R\024\020\004\032\0020\005XD¢\006\b\n\000\032\004\b\006\020\007¨\006\034"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/ReplaceLinesWorker;", "Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/AbstractEditWorker;", "<init>", "()V", "critiqueArtifactNameSuffix", "", "getCritiqueArtifactNameSuffix", "()Ljava/lang/String;", "getTrajectoryElementAgent", "Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "(Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runCritic", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "attempt", "", "currentState", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "optionsToRank", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ILcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAvailableActions", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "getSystemMessage", "getDemonstration", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nReplaceLinesWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplaceLinesWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/edit_workers/ReplaceLinesWorker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,189:1\n774#2:190\n865#2,2:191\n774#2:193\n865#2,2:194\n774#2:196\n865#2,2:197\n*S KotlinDebug\n*F\n+ 1 ReplaceLinesWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/edit_workers/ReplaceLinesWorker\n*L\n37#1:190\n37#1:191,2\n49#1:193\n49#1:194,2\n77#1:196\n77#1:197,2\n*E\n"})
/*     */ public final class ReplaceLinesWorker extends AbstractEditWorker {
/*  19 */   public ReplaceLinesWorker() { super("replace_lines_worker");
/*  20 */     this.critiqueArtifactNameSuffix = "_replace_lines"; } @NotNull private final String critiqueArtifactNameSuffix; @NotNull public String getCritiqueArtifactNameSuffix() { return this.critiqueArtifactNameSuffix; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   public Object getTrajectoryElementAgent(@NotNull MatterhornPropertyProvider propertyProvider, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/edit_workers/ReplaceLinesWorker$getTrajectoryElementAgent$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/edit_workers/ReplaceLinesWorker$getTrajectoryElementAgent$1
/*     */     //   11: astore #7
/*     */     //   13: aload #7
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #7
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/edit_workers/ReplaceLinesWorker$getTrajectoryElementAgent$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/ReplaceLinesWorker;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #7
/*     */     //   50: aload #7
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #6
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #15
/*     */     //   62: aload #7
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 222, 0 -> 88, 1 -> 135
/*     */     //   88: aload #6
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: ldc 'replace_lines'
/*     */     //   95: ldc '0.1'
/*     */     //   97: astore #4
/*     */     //   99: astore_3
/*     */     //   100: aload_0
/*     */     //   101: aload_1
/*     */     //   102: aload #7
/*     */     //   104: aload #7
/*     */     //   106: aload_3
/*     */     //   107: putfield L$0 : Ljava/lang/Object;
/*     */     //   110: aload #7
/*     */     //   112: aload #4
/*     */     //   114: putfield L$1 : Ljava/lang/Object;
/*     */     //   117: aload #7
/*     */     //   119: iconst_1
/*     */     //   120: putfield label : I
/*     */     //   123: invokevirtual getAgentParameters : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   126: dup
/*     */     //   127: aload #15
/*     */     //   129: if_acmpne -> 161
/*     */     //   132: aload #15
/*     */     //   134: areturn
/*     */     //   135: aload #7
/*     */     //   137: getfield L$1 : Ljava/lang/Object;
/*     */     //   140: checkcast java/lang/String
/*     */     //   143: astore #4
/*     */     //   145: aload #7
/*     */     //   147: getfield L$0 : Ljava/lang/Object;
/*     */     //   150: checkcast java/lang/String
/*     */     //   153: astore_3
/*     */     //   154: aload #6
/*     */     //   156: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   159: aload #6
/*     */     //   161: astore #5
/*     */     //   163: aload_3
/*     */     //   164: aload #4
/*     */     //   166: aload #5
/*     */     //   168: checkcast com/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters
/*     */     //   171: invokevirtual getModelParameters : ()Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   174: invokevirtual getModel : ()Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   177: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   180: ldc ''
/*     */     //   182: aconst_null
/*     */     //   183: bipush #16
/*     */     //   185: aconst_null
/*     */     //   186: astore #8
/*     */     //   188: istore #9
/*     */     //   190: astore #10
/*     */     //   192: astore #11
/*     */     //   194: astore #12
/*     */     //   196: astore #13
/*     */     //   198: astore #14
/*     */     //   200: new com/intellij/ml/llm/matterhorn/TrajectoryElementAgent
/*     */     //   203: dup
/*     */     //   204: aload #14
/*     */     //   206: aload #13
/*     */     //   208: aload #12
/*     */     //   210: aload #11
/*     */     //   212: aload #10
/*     */     //   214: iload #9
/*     */     //   216: aload #8
/*     */     //   218: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   221: areturn
/*     */     //   222: new java/lang/IllegalStateException
/*     */     //   225: dup
/*     */     //   226: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   228: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   231: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #22	-> 60
/*     */     //   #23	-> 93
/*     */     //   #24	-> 93
/*     */     //   #25	-> 95
/*     */     //   #26	-> 100
/*     */     //   #22	-> 132
/*     */     //   #26	-> 161
/*     */     //   #27	-> 180
/*     */     //   #23	-> 182
/*     */     //   #22	-> 222
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	33	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/ReplaceLinesWorker;
/*     */     //   93	33	1	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   0	232	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	172	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	165	6	$result	Ljava/lang/Object;
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
/*     */   @Nullable
/*     */   public Object runCritic(@NotNull ExecutionAgentContext context, int attempt, @NotNull AgentState currentState, @NotNull List optionsToRank, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/edit_workers/ReplaceLinesWorker$runCritic$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #5
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/edit_workers/ReplaceLinesWorker$runCritic$1
/*     */     //   13: astore #26
/*     */     //   15: aload #26
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #26
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/edit_workers/ReplaceLinesWorker$runCritic$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #5
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/ReplaceLinesWorker;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #26
/*     */     //   53: aload #26
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #25
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #27
/*     */     //   65: aload #26
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 861, 0 -> 96, 1 -> 738, 2 -> 853
/*     */     //   96: aload #25
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: aload #4
/*     */     //   103: checkcast java/lang/Iterable
/*     */     //   106: astore #7
/*     */     //   108: iconst_0
/*     */     //   109: istore #8
/*     */     //   111: aload #7
/*     */     //   113: astore #9
/*     */     //   115: new java/util/ArrayList
/*     */     //   118: dup
/*     */     //   119: invokespecial <init> : ()V
/*     */     //   122: checkcast java/util/Collection
/*     */     //   125: astore #10
/*     */     //   127: iconst_0
/*     */     //   128: istore #11
/*     */     //   130: aload #9
/*     */     //   132: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   137: astore #12
/*     */     //   139: aload #12
/*     */     //   141: invokeinterface hasNext : ()Z
/*     */     //   146: ifeq -> 233
/*     */     //   149: aload #12
/*     */     //   151: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   156: astore #13
/*     */     //   158: aload #13
/*     */     //   160: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   163: astore #14
/*     */     //   165: iconst_0
/*     */     //   166: istore #15
/*     */     //   168: aload #14
/*     */     //   170: invokeinterface getContent : ()Ljava/lang/String;
/*     */     //   175: checkcast java/lang/CharSequence
/*     */     //   178: astore #16
/*     */     //   180: new kotlin/text/Regex
/*     */     //   183: dup
/*     */     //   184: ldc 'replace_lines \d+:\d+'
/*     */     //   186: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   189: astore #17
/*     */     //   191: iconst_0
/*     */     //   192: istore #18
/*     */     //   194: aload #17
/*     */     //   196: aload #16
/*     */     //   198: iload #18
/*     */     //   200: invokevirtual split : (Ljava/lang/CharSequence;I)Ljava/util/List;
/*     */     //   203: invokeinterface size : ()I
/*     */     //   208: iconst_2
/*     */     //   209: if_icmpne -> 216
/*     */     //   212: iconst_1
/*     */     //   213: goto -> 217
/*     */     //   216: iconst_0
/*     */     //   217: ifeq -> 139
/*     */     //   220: aload #10
/*     */     //   222: aload #13
/*     */     //   224: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   229: pop
/*     */     //   230: goto -> 139
/*     */     //   233: aload #10
/*     */     //   235: checkcast java/util/List
/*     */     //   238: nop
/*     */     //   239: astore #6
/*     */     //   241: aload #6
/*     */     //   243: invokeinterface isEmpty : ()Z
/*     */     //   248: ifeq -> 293
/*     */     //   251: iconst_2
/*     */     //   252: anewarray com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   255: astore #7
/*     */     //   257: aload #7
/*     */     //   259: iconst_0
/*     */     //   260: aload #4
/*     */     //   262: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   265: aastore
/*     */     //   266: aload #7
/*     */     //   268: iconst_1
/*     */     //   269: new com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   272: dup
/*     */     //   273: ldc 'ERROR: it's forbidden to use `replace_lines` several times. Express all the required changes in one `replace_lines` call'
/*     */     //   275: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.User : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   278: aconst_null
/*     */     //   279: aconst_null
/*     */     //   280: bipush #12
/*     */     //   282: aconst_null
/*     */     //   283: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   286: aastore
/*     */     //   287: aload #7
/*     */     //   289: invokestatic listOf : ([Ljava/lang/Object;)Ljava/util/List;
/*     */     //   292: areturn
/*     */     //   293: aload #6
/*     */     //   295: checkcast java/lang/Iterable
/*     */     //   298: astore #8
/*     */     //   300: iconst_0
/*     */     //   301: istore #9
/*     */     //   303: aload #8
/*     */     //   305: astore #10
/*     */     //   307: new java/util/ArrayList
/*     */     //   310: dup
/*     */     //   311: invokespecial <init> : ()V
/*     */     //   314: checkcast java/util/Collection
/*     */     //   317: astore #11
/*     */     //   319: iconst_0
/*     */     //   320: istore #12
/*     */     //   322: aload #10
/*     */     //   324: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   329: astore #13
/*     */     //   331: aload #13
/*     */     //   333: invokeinterface hasNext : ()Z
/*     */     //   338: ifeq -> 430
/*     */     //   341: aload #13
/*     */     //   343: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   348: astore #14
/*     */     //   350: aload #14
/*     */     //   352: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   355: astore #15
/*     */     //   357: iconst_0
/*     */     //   358: istore #16
/*     */     //   360: nop
/*     */     //   361: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest$Companion;
/*     */     //   364: aload #15
/*     */     //   366: invokeinterface getContent : ()Ljava/lang/String;
/*     */     //   371: invokevirtual parse : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest;
/*     */     //   374: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   377: checkcast java/lang/CharSequence
/*     */     //   380: invokeinterface length : ()I
/*     */     //   385: ifle -> 392
/*     */     //   388: iconst_1
/*     */     //   389: goto -> 393
/*     */     //   392: iconst_0
/*     */     //   393: istore #17
/*     */     //   395: goto -> 403
/*     */     //   398: astore #18
/*     */     //   400: iconst_0
/*     */     //   401: istore #17
/*     */     //   403: iload #17
/*     */     //   405: ifeq -> 412
/*     */     //   408: iconst_1
/*     */     //   409: goto -> 413
/*     */     //   412: iconst_0
/*     */     //   413: nop
/*     */     //   414: ifeq -> 331
/*     */     //   417: aload #11
/*     */     //   419: aload #14
/*     */     //   421: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   426: pop
/*     */     //   427: goto -> 331
/*     */     //   430: aload #11
/*     */     //   432: checkcast java/util/List
/*     */     //   435: nop
/*     */     //   436: astore #7
/*     */     //   438: aload #7
/*     */     //   440: invokeinterface isEmpty : ()Z
/*     */     //   445: ifeq -> 490
/*     */     //   448: iconst_2
/*     */     //   449: anewarray com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   452: astore #8
/*     */     //   454: aload #8
/*     */     //   456: iconst_0
/*     */     //   457: aload #6
/*     */     //   459: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   462: aastore
/*     */     //   463: aload #8
/*     */     //   465: iconst_1
/*     */     //   466: new com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   469: dup
/*     */     //   470: ldc 'ERROR: Your responce is not formatted properly, try again, example:\\n<THOUGHT>\\nIn `hello.py` implement method `hello` that prints "hello"\\n</THOUGHT>\\n<COMMAND>\\nedit /mnt/myProject/hello.py\\nreplace_lines 1:1\\ndef hello():\\n    "print a greeting"\\n\\n    print("hello")\\n</COMMAND>\\nYOU MUST USE *SINGLE* `replace_lines` COMMAND, issuing multiple `replace_lines` commands will causes error'
/*     */     //   472: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.User : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   475: aconst_null
/*     */     //   476: aconst_null
/*     */     //   477: bipush #12
/*     */     //   479: aconst_null
/*     */     //   480: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   483: aastore
/*     */     //   484: aload #8
/*     */     //   486: invokestatic listOf : ([Ljava/lang/Object;)Ljava/util/List;
/*     */     //   489: areturn
/*     */     //   490: aload #7
/*     */     //   492: checkcast java/lang/Iterable
/*     */     //   495: astore #9
/*     */     //   497: iconst_0
/*     */     //   498: istore #10
/*     */     //   500: aload #9
/*     */     //   502: astore #11
/*     */     //   504: new java/util/ArrayList
/*     */     //   507: dup
/*     */     //   508: invokespecial <init> : ()V
/*     */     //   511: checkcast java/util/Collection
/*     */     //   514: astore #12
/*     */     //   516: iconst_0
/*     */     //   517: istore #13
/*     */     //   519: aload #11
/*     */     //   521: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   526: astore #14
/*     */     //   528: aload #14
/*     */     //   530: invokeinterface hasNext : ()Z
/*     */     //   535: ifeq -> 594
/*     */     //   538: aload #14
/*     */     //   540: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   545: astore #15
/*     */     //   547: aload #15
/*     */     //   549: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   552: astore #16
/*     */     //   554: iconst_0
/*     */     //   555: istore #17
/*     */     //   557: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest$Companion;
/*     */     //   560: aload #16
/*     */     //   562: invokeinterface getContent : ()Ljava/lang/String;
/*     */     //   567: invokevirtual parse : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest;
/*     */     //   570: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   573: ldc 'replace_lines'
/*     */     //   575: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   578: ifeq -> 528
/*     */     //   581: aload #12
/*     */     //   583: aload #15
/*     */     //   585: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   590: pop
/*     */     //   591: goto -> 528
/*     */     //   594: aload #12
/*     */     //   596: checkcast java/util/List
/*     */     //   599: nop
/*     */     //   600: astore #8
/*     */     //   602: aload #8
/*     */     //   604: invokeinterface isEmpty : ()Z
/*     */     //   609: ifeq -> 654
/*     */     //   612: iconst_2
/*     */     //   613: anewarray com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   616: astore #9
/*     */     //   618: aload #9
/*     */     //   620: iconst_0
/*     */     //   621: aload #7
/*     */     //   623: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   626: aastore
/*     */     //   627: aload #9
/*     */     //   629: iconst_1
/*     */     //   630: new com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   633: dup
/*     */     //   634: ldc 'ERROR: you did not generate `replace_lines` action. Please include the required edit in form of `replace_action` in your responce'
/*     */     //   636: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.User : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   639: aconst_null
/*     */     //   640: aconst_null
/*     */     //   641: bipush #12
/*     */     //   643: aconst_null
/*     */     //   644: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   647: aastore
/*     */     //   648: aload #9
/*     */     //   650: invokestatic listOf : ([Ljava/lang/Object;)Ljava/util/List;
/*     */     //   653: areturn
/*     */     //   654: aload_0
/*     */     //   655: aload #8
/*     */     //   657: aload_3
/*     */     //   658: aload_1
/*     */     //   659: iload_2
/*     */     //   660: istore #23
/*     */     //   662: astore #22
/*     */     //   664: astore #21
/*     */     //   666: astore #20
/*     */     //   668: astore #19
/*     */     //   670: aload_0
/*     */     //   671: aload_1
/*     */     //   672: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   677: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   680: invokevirtual getPropertyProvider : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   683: aload #26
/*     */     //   685: aload #26
/*     */     //   687: aload #19
/*     */     //   689: putfield L$0 : Ljava/lang/Object;
/*     */     //   692: aload #26
/*     */     //   694: aload #20
/*     */     //   696: putfield L$1 : Ljava/lang/Object;
/*     */     //   699: aload #26
/*     */     //   701: aload #21
/*     */     //   703: putfield L$2 : Ljava/lang/Object;
/*     */     //   706: aload #26
/*     */     //   708: aload #22
/*     */     //   710: putfield L$3 : Ljava/lang/Object;
/*     */     //   713: aload #26
/*     */     //   715: iload #23
/*     */     //   717: putfield I$0 : I
/*     */     //   720: aload #26
/*     */     //   722: iconst_1
/*     */     //   723: putfield label : I
/*     */     //   726: invokevirtual getAgentParameters : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   729: dup
/*     */     //   730: aload #27
/*     */     //   732: if_acmpne -> 792
/*     */     //   735: aload #27
/*     */     //   737: areturn
/*     */     //   738: aload #26
/*     */     //   740: getfield I$0 : I
/*     */     //   743: istore #23
/*     */     //   745: aload #26
/*     */     //   747: getfield L$3 : Ljava/lang/Object;
/*     */     //   750: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   753: astore #22
/*     */     //   755: aload #26
/*     */     //   757: getfield L$2 : Ljava/lang/Object;
/*     */     //   760: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentState
/*     */     //   763: astore #21
/*     */     //   765: aload #26
/*     */     //   767: getfield L$1 : Ljava/lang/Object;
/*     */     //   770: checkcast java/util/List
/*     */     //   773: astore #20
/*     */     //   775: aload #26
/*     */     //   777: getfield L$0 : Ljava/lang/Object;
/*     */     //   780: checkcast com/intellij/ml/llm/matterhorn/ej/core/edit_workers/ReplaceLinesWorker
/*     */     //   783: astore #19
/*     */     //   785: aload #25
/*     */     //   787: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   790: aload #25
/*     */     //   792: astore #24
/*     */     //   794: aload #19
/*     */     //   796: aload #20
/*     */     //   798: aload #21
/*     */     //   800: aload #22
/*     */     //   802: iload #23
/*     */     //   804: aload #24
/*     */     //   806: checkcast com/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters
/*     */     //   809: aload #26
/*     */     //   811: aload #26
/*     */     //   813: aconst_null
/*     */     //   814: putfield L$0 : Ljava/lang/Object;
/*     */     //   817: aload #26
/*     */     //   819: aconst_null
/*     */     //   820: putfield L$1 : Ljava/lang/Object;
/*     */     //   823: aload #26
/*     */     //   825: aconst_null
/*     */     //   826: putfield L$2 : Ljava/lang/Object;
/*     */     //   829: aload #26
/*     */     //   831: aconst_null
/*     */     //   832: putfield L$3 : Ljava/lang/Object;
/*     */     //   835: aload #26
/*     */     //   837: iconst_2
/*     */     //   838: putfield label : I
/*     */     //   841: invokevirtual checkAndSortActions : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ILcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   844: dup
/*     */     //   845: aload #27
/*     */     //   847: if_acmpne -> 860
/*     */     //   850: aload #27
/*     */     //   852: areturn
/*     */     //   853: aload #25
/*     */     //   855: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   858: aload #25
/*     */     //   860: areturn
/*     */     //   861: new java/lang/IllegalStateException
/*     */     //   864: dup
/*     */     //   865: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   867: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   870: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #31	-> 63
/*     */     //   #37	-> 101
/*     */     //   #190	-> 111
/*     */     //   #191	-> 130
/*     */     //   #38	-> 168
/*     */     //   #38	-> 191
/*     */     //   #38	-> 203
/*     */     //   #191	-> 217
/*     */     //   #192	-> 233
/*     */     //   #190	-> 238
/*     */     //   #37	-> 239
/*     */     //   #40	-> 241
/*     */     //   #42	-> 251
/*     */     //   #43	-> 269
/*     */     //   #44	-> 273
/*     */     //   #45	-> 275
/*     */     //   #43	-> 278
/*     */     //   #42	-> 287
/*     */     //   #41	-> 289
/*     */     //   #49	-> 293
/*     */     //   #193	-> 303
/*     */     //   #194	-> 322
/*     */     //   #50	-> 360
/*     */     //   #51	-> 361
/*     */     //   #52	-> 398
/*     */     //   #53	-> 400
/*     */     //   #54	-> 413
/*     */     //   #194	-> 414
/*     */     //   #195	-> 430
/*     */     //   #193	-> 435
/*     */     //   #49	-> 436
/*     */     //   #56	-> 438
/*     */     //   #58	-> 448
/*     */     //   #59	-> 466
/*     */     //   #72	-> 470
/*     */     //   #73	-> 472
/*     */     //   #59	-> 475
/*     */     //   #58	-> 484
/*     */     //   #57	-> 486
/*     */     //   #77	-> 490
/*     */     //   #196	-> 500
/*     */     //   #197	-> 519
/*     */     //   #78	-> 557
/*     */     //   #197	-> 578
/*     */     //   #198	-> 594
/*     */     //   #196	-> 599
/*     */     //   #77	-> 600
/*     */     //   #80	-> 602
/*     */     //   #82	-> 612
/*     */     //   #83	-> 630
/*     */     //   #84	-> 634
/*     */     //   #85	-> 636
/*     */     //   #83	-> 639
/*     */     //   #82	-> 648
/*     */     //   #81	-> 650
/*     */     //   #89	-> 654
/*     */     //   #31	-> 735
/*     */     //   #89	-> 792
/*     */     //   #31	-> 850
/*     */     //   #89	-> 860
/*     */     //   #31	-> 861
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	116	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/ReplaceLinesWorker;
/*     */     //   217	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/ReplaceLinesWorker;
/*     */     //   239	12	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/ReplaceLinesWorker;
/*     */     //   293	121	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/ReplaceLinesWorker;
/*     */     //   414	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/ReplaceLinesWorker;
/*     */     //   436	12	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/ReplaceLinesWorker;
/*     */     //   490	88	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/ReplaceLinesWorker;
/*     */     //   578	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/ReplaceLinesWorker;
/*     */     //   600	12	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/ReplaceLinesWorker;
/*     */     //   654	75	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/ReplaceLinesWorker;
/*     */     //   101	116	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   217	22	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   239	12	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   293	121	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   414	22	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   436	12	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   490	88	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   578	22	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   600	12	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   654	75	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   101	116	2	attempt	I
/*     */     //   217	22	2	attempt	I
/*     */     //   239	12	2	attempt	I
/*     */     //   293	121	2	attempt	I
/*     */     //   414	22	2	attempt	I
/*     */     //   436	12	2	attempt	I
/*     */     //   490	88	2	attempt	I
/*     */     //   578	22	2	attempt	I
/*     */     //   600	12	2	attempt	I
/*     */     //   654	75	2	attempt	I
/*     */     //   101	116	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   217	22	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   239	12	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   293	121	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   414	22	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   436	12	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   490	88	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   578	22	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   600	12	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   654	75	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   101	116	4	optionsToRank	Ljava/util/List;
/*     */     //   217	22	4	optionsToRank	Ljava/util/List;
/*     */     //   239	30	4	optionsToRank	Ljava/util/List;
/*     */     //   241	10	6	multipleCommandsFiltered	Ljava/util/List;
/*     */     //   293	121	6	multipleCommandsFiltered	Ljava/util/List;
/*     */     //   414	22	6	multipleCommandsFiltered	Ljava/util/List;
/*     */     //   436	30	6	multipleCommandsFiltered	Ljava/util/List;
/*     */     //   108	19	7	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   438	10	7	illFormedFiltered	Ljava/util/List;
/*     */     //   490	88	7	illFormedFiltered	Ljava/util/List;
/*     */     //   578	22	7	illFormedFiltered	Ljava/util/List;
/*     */     //   600	30	7	illFormedFiltered	Ljava/util/List;
/*     */     //   300	19	8	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   602	10	8	editActions	Ljava/util/List;
/*     */     //   654	75	8	editActions	Ljava/util/List;
/*     */     //   127	12	9	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   497	19	9	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   127	108	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   319	12	10	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   319	113	11	destination$iv$iv	Ljava/util/Collection;
/*     */     //   516	12	11	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   516	80	12	destination$iv$iv	Ljava/util/Collection;
/*     */     //   158	72	13	element$iv$iv	Ljava/lang/Object;
/*     */     //   165	24	14	it	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   350	77	14	element$iv$iv	Ljava/lang/Object;
/*     */     //   357	35	15	action	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   547	44	15	element$iv$iv	Ljava/lang/Object;
/*     */     //   554	24	16	it	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   168	49	15	$i$a$-filter-ReplaceLinesWorker$runCritic$multipleCommandsFiltered$1	I
/*     */     //   130	105	11	$i$f$filterTo	I
/*     */     //   111	128	8	$i$f$filter	I
/*     */     //   360	54	16	$i$a$-filter-ReplaceLinesWorker$runCritic$illFormedFiltered$1	I
/*     */     //   322	110	12	$i$f$filterTo	I
/*     */     //   303	133	9	$i$f$filter	I
/*     */     //   557	21	17	$i$a$-filter-ReplaceLinesWorker$runCritic$editActions$1	I
/*     */     //   519	77	13	$i$f$filterTo	I
/*     */     //   500	100	10	$i$f$filter	I
/*     */     //   0	871	5	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	808	26	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	801	25	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   360	395	398	java/lang/Exception
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
/*     */   @NotNull
/*     */   public List<AgentAction> getAvailableActions(@NotNull ExecutionAgentContext context) {
/*  93 */     Intrinsics.checkNotNullParameter(context, "context"); return CollectionsKt.listOf(new EditAgentAction(SyntaxChecker.Companion.getSyntaxCheckers()));
/*     */   }
/*     */   @NotNull
/*     */   public String getSystemMessage(@NotNull ExecutionAgentContext context) {
/*  97 */     Intrinsics.checkNotNullParameter(context, "context"); String commandDescription = getCommandDescription(context);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 114 */     return "Act as an expert software developer.\nAlways use best practices when coding.\nRespect and use existing conventions, libraries, etc that are already present in the code base.\n\nYou will get the context of the big task being solved followed by a request to edit a particular file.\nYou task is to generate edit to the given file to fulfill the request.\nYour edit will apply to the requested file, don't include file name or file path to your edit since it's redundant.\n\nAlways reply to the user in the same language they are using.\n\nOnce you get the request you MUST:\n1. Think step-by-step and explain the needed changes with a numbered list of short sentences.\n2. Describe changes in code using `replace_lines` command\n\nHere is the description of available commands:\n" + commandDescription + "\n\nPlease note that THE REPLACE_LINES COMMAND REQUIRES PROPER INDENTATION. \nIf you'd like to add the line '        print(x)' you must fully write that out, with all those spaces before the code! Indentation is important and code that is not indented correctly will fail and require fixing before it can be run.\n\nYou should only include a *SINGLE* command in the command section and then wait for a response from the shell before continuing with more discussion and commands. Everything you include in the discussion section will be saved for future reference.\nExpress all changes with a single `replace_lines` command.\nIf you want to use several `replace_lines` commands - PLEASE DO NOT DO THAT. Express all required changes using one `replace_lines` command.\n\nRESPONSE FORMAT:\n\nYou need to format your output using two blocks inside xml tags: `<THOUGHT>` and `<COMMAND>`.\nYour output should always include _one_ `<THOUGHT>` and _one_ `<COMMAND>` blocks EXACTLY as in the following example:\n\n<THOUGHT>\nHere is the change that implements correct rounding\n</THOUGHT>\n<COMMAND>\nedit filename.py\nreplace_lines 1475:1475\n        return int(round(value.total_seconds() / base_unit.total_seconds()))  # round to nearest int\n</COMMAND>\n";
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
/*     */   @NotNull
/*     */   public String getDemonstration(@NotNull ExecutionAgentContext context) {
/* 140 */     Intrinsics.checkNotNullParameter(context, "context"); return "Here are examples of proper `replace_lines` usage:\n\n<example1>\n<THOUGHT>\nIn `hello.py` implement method `hello` that prints \"hello\"\n</THOUGHT>\n<COMMAND>\nedit /mnt/myProject/hello.py\nreplace_lines 1:1\ndef hello():\n    \"print a greeting\"\n\n    print(\"hello\")\n</COMMAND>\n</example1>\n\n<example2>\n<THOUGHT>\nWe are now looking at the relevant section of the `fields.py` file where the `TimeDelta` serialization occurs. The issue suggests that there is a rounding problem near line 1474. The current implementation uses integer division, which truncates the decimal part and can lead to incorrect rounding on line 1475.To fix this issue, we should ensure that the division results in a float, and then round the result to the nearest integer before converting it to an int. This should preserve the milliseconds precision as expected. Let's make the necessary edit to the code.\n</THOUGHT>\n<COMMAND>\nedit src/marshmallow/fields.py\nreplace_lines 1475:1475\n        return int(round(value.total_seconds() / base_unit.total_seconds()))  # round to nearest int\n</COMMAND>\n</example2>\n\n<example3>\n<THOUGHT>\nt seems the `astroid.exceptions.StatementMissing` exception is now occurring because of the `RuntimeError` in `raw_building.py`.\nFix this problem.\n</THOUGHT>\n<COMMAND>\nedit astroid/raw_building.py\nreplace_lines 422:431\n            try:\n                if hasattr(member, \"__all__\"):\n                    module = build_module(name)\n                    _attach_local_node(node, module, name)\n                    # recursion\n                    self.object_build(module, member)\n            except RuntimeError:\n                # Skip the member if accessing __all__ raises RuntimeError\n                continue\n</COMMAND>\n</example3>\n";
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ReplaceLinesWorker.kt", l = {26}, i = {}, s = {}, n = {}, m = "getTrajectoryElementAgent", c = "com.intellij.ml.llm.matterhorn.ej.core.edit_workers.ReplaceLinesWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ReplaceLinesWorker$getTrajectoryElementAgent$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     ReplaceLinesWorker$getTrajectoryElementAgent$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ReplaceLinesWorker.this.getTrajectoryElementAgent((MatterhornPropertyProvider)null, (Continuation<? super TrajectoryElementAgent>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ReplaceLinesWorker.kt", l = {89, 89}, i = {}, s = {}, n = {}, m = "runCritic", c = "com.intellij.ml.llm.matterhorn.ej.core.edit_workers.ReplaceLinesWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ReplaceLinesWorker$runCritic$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     int I$0;
/*     */     int label;
/*     */     
/*     */     ReplaceLinesWorker$runCritic$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ReplaceLinesWorker.this.runCritic((ExecutionAgentContext)null, 0, (AgentState)null, (List<? extends MatterhornChatElement>)null, (Continuation<? super List<? extends MatterhornChatElement>>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\edit_workers\ReplaceLinesWorker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */