/*     */ package com.intellij.ml.llm.matterhorn.ej.core.edit_workers;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentState;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000^\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\030\0002\0020\001B\007¢\006\004\b\002\020\003J\026\020\b\032\0020\t2\006\020\n\032\0020\013H@¢\006\002\020\fJ\026\020\r\032\0020\0162\006\020\n\032\0020\013H@¢\006\002\020\fJ$\020\021\032\b\022\004\022\0020\0230\0222\006\020\024\032\0020\0252\006\020\026\032\0020\027H@¢\006\002\020\030J:\020\031\032\b\022\004\022\0020\0330\0322\006\020\026\032\0020\0342\006\020\035\032\0020\0202\006\020\036\032\0020\0252\f\020\037\032\b\022\004\022\0020\0330\032H@¢\006\002\020 J\026\020!\032\b\022\004\022\0020\"0\0322\006\020\026\032\0020\034H\026J\020\020#\032\0020\0052\006\020\026\032\0020\034H\026J\020\020$\032\0020\0052\006\020\026\032\0020\034H\026R\024\020\004\032\0020\005XD¢\006\b\n\000\032\004\b\006\020\007R\016\020\017\032\0020\020XD¢\006\002\n\000¨\006%"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker;", "Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/AbstractEditWorker;", "<init>", "()V", "critiqueArtifactNameSuffix", "", "getCritiqueArtifactNameSuffix", "()Ljava/lang/String;", "getAgentParameters", "Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "(Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrajectoryElementAgent", "Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;", "MAX_FILE_LINES", "", "produceArtifact", "Lcom/intellij/ml/llm/matterhorn/ArtifactResponse;", "Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentResponse;", "input", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runCritic", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "attempt", "currentState", "optionsToRank", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ILcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAvailableActions", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "getSystemMessage", "getDemonstration", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nRewriteFileWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RewriteFileWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,217:1\n774#2:218\n865#2,2:219\n774#2:221\n865#2,2:222\n774#2:224\n865#2,2:225\n*S KotlinDebug\n*F\n+ 1 RewriteFileWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker\n*L\n71#1:218\n71#1:219,2\n83#1:221\n83#1:222,2\n113#1:224\n113#1:225,2\n*E\n"})
/*     */ public final class RewriteFileWorker extends AbstractEditWorker {
/*     */   @NotNull
/*     */   private final String critiqueArtifactNameSuffix;
/*     */   
/*  17 */   public RewriteFileWorker() { super("rewrite_file_worker");
/*  18 */     this.critiqueArtifactNameSuffix = "_rewrite_file";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  34 */     this.MAX_FILE_LINES = 500; }
/*     */   private final int MAX_FILE_LINES;
/*     */   @NotNull
/*     */   public String getCritiqueArtifactNameSuffix() { return this.critiqueArtifactNameSuffix; }
/*     */   @Nullable
/*     */   public Object getAgentParameters(@NotNull MatterhornPropertyProvider propertyProvider, @NotNull Continuation $completion) { // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker$getAgentParameters$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker$getAgentParameters$1
/*     */     //   11: astore #5
/*     */     //   13: aload #5
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #5
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker$getAgentParameters$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #5
/*     */     //   50: aload #5
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #4
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #6
/*     */     //   62: aload #5
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 215, 0 -> 92, 1 -> 131, 2 -> 207
/*     */     //   92: aload #4
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: getstatic com/intellij/ml/llm/matterhorn/llm/ModelParameters.Companion : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters$Companion;
/*     */     //   100: aload_0
/*     */     //   101: invokevirtual getTitle : ()Ljava/lang/String;
/*     */     //   104: aload_1
/*     */     //   105: aload #5
/*     */     //   107: aload #5
/*     */     //   109: aload_1
/*     */     //   110: putfield L$0 : Ljava/lang/Object;
/*     */     //   113: aload #5
/*     */     //   115: iconst_1
/*     */     //   116: putfield label : I
/*     */     //   119: invokevirtual getDefaultModel : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   122: dup
/*     */     //   123: aload #6
/*     */     //   125: if_acmpne -> 147
/*     */     //   128: aload #6
/*     */     //   130: areturn
/*     */     //   131: aload #5
/*     */     //   133: getfield L$0 : Ljava/lang/Object;
/*     */     //   136: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   139: astore_1
/*     */     //   140: aload #4
/*     */     //   142: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   145: aload #4
/*     */     //   147: checkcast com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*     */     //   150: astore_3
/*     */     //   151: getstatic com/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters$Companion;
/*     */     //   154: new com/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters
/*     */     //   157: dup
/*     */     //   158: aload_3
/*     */     //   159: iconst_0
/*     */     //   160: aconst_null
/*     */     //   161: aconst_null
/*     */     //   162: iconst_0
/*     */     //   163: bipush #30
/*     */     //   165: aconst_null
/*     */     //   166: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;ILcom/intellij/ml/llm/matterhorn/ej/core/history_processors/HistoryProcessors;Lcom/intellij/ml/llm/matterhorn/ej/core/critique/Critiques;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   169: aconst_null
/*     */     //   170: iconst_0
/*     */     //   171: aconst_null
/*     */     //   172: aconst_null
/*     */     //   173: iconst_0
/*     */     //   174: bipush #23
/*     */     //   176: aconst_null
/*     */     //   177: invokestatic copy$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;ILcom/intellij/ml/llm/matterhorn/ej/core/history_processors/HistoryProcessors;Lcom/intellij/ml/llm/matterhorn/ej/core/critique/Critiques;IILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;
/*     */     //   180: aload_1
/*     */     //   181: aload #5
/*     */     //   183: aload #5
/*     */     //   185: aconst_null
/*     */     //   186: putfield L$0 : Ljava/lang/Object;
/*     */     //   189: aload #5
/*     */     //   191: iconst_2
/*     */     //   192: putfield label : I
/*     */     //   195: invokevirtual setupFromEnvironment : (Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   198: dup
/*     */     //   199: aload #6
/*     */     //   201: if_acmpne -> 214
/*     */     //   204: aload #6
/*     */     //   206: areturn
/*     */     //   207: aload #4
/*     */     //   209: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   212: aload #4
/*     */     //   214: areturn
/*     */     //   215: new java/lang/IllegalStateException
/*     */     //   218: dup
/*     */     //   219: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   221: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   224: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #20	-> 60
/*     */     //   #21	-> 97
/*     */     //   #20	-> 128
/*     */     //   #22	-> 151
/*     */     //   #20	-> 204
/*     */     //   #22	-> 214
/*     */     //   #20	-> 215
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	25	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker;
/*     */     //   97	34	1	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   140	58	1	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   151	47	3	defaultModel	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   0	225	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	165	5	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	158	4	$result	Ljava/lang/Object; } @Nullable
/*     */   public Object getTrajectoryElementAgent(@NotNull MatterhornPropertyProvider propertyProvider, @NotNull Continuation $completion) { // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker$getTrajectoryElementAgent$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker$getTrajectoryElementAgent$1
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
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker$getTrajectoryElementAgent$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker;Lkotlin/coroutines/Continuation;)V
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
/*     */     //   93: ldc 'rewrite_file'
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
/*     */     //   #25	-> 60
/*     */     //   #26	-> 93
/*     */     //   #27	-> 93
/*     */     //   #28	-> 95
/*     */     //   #29	-> 100
/*     */     //   #25	-> 132
/*     */     //   #29	-> 161
/*     */     //   #30	-> 180
/*     */     //   #26	-> 182
/*     */     //   #25	-> 222
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	33	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker;
/*     */     //   93	33	1	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   0	232	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	172	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	165	6	$result	Ljava/lang/Object; } @Nullable
/*     */   public Object produceArtifact(@NotNull AgentState input, @NotNull ExecutionContext context, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker$produceArtifact$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker$produceArtifact$1
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
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker$produceArtifact$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #9
/*     */     //   50: aload #9
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #8
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #14
/*     */     //   62: aload #9
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 503, 0 -> 96, 1 -> 182, 2 -> 346, 3 -> 495
/*     */     //   96: aload #8
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: aload_2
/*     */     //   102: invokestatic getExecutionAgentContext : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   105: astore #4
/*     */     //   107: aload #4
/*     */     //   109: invokeinterface getCurrentScreenPosition : ()Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;
/*     */     //   114: dup
/*     */     //   115: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   118: invokevirtual getFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   121: astore #5
/*     */     //   123: aload #5
/*     */     //   125: <illegal opcode> invoke : (Lcom/intellij/openapi/vfs/VirtualFile;)Lkotlin/jvm/functions/Function0;
/*     */     //   130: aload #9
/*     */     //   132: aload #9
/*     */     //   134: aload_0
/*     */     //   135: putfield L$0 : Ljava/lang/Object;
/*     */     //   138: aload #9
/*     */     //   140: aload_1
/*     */     //   141: putfield L$1 : Ljava/lang/Object;
/*     */     //   144: aload #9
/*     */     //   146: aload_2
/*     */     //   147: putfield L$2 : Ljava/lang/Object;
/*     */     //   150: aload #9
/*     */     //   152: aload #4
/*     */     //   154: putfield L$3 : Ljava/lang/Object;
/*     */     //   157: aload #9
/*     */     //   159: aload #5
/*     */     //   161: putfield L$4 : Ljava/lang/Object;
/*     */     //   164: aload #9
/*     */     //   166: iconst_1
/*     */     //   167: putfield label : I
/*     */     //   170: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   173: dup
/*     */     //   174: aload #14
/*     */     //   176: if_acmpne -> 236
/*     */     //   179: aload #14
/*     */     //   181: areturn
/*     */     //   182: aload #9
/*     */     //   184: getfield L$4 : Ljava/lang/Object;
/*     */     //   187: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   190: astore #5
/*     */     //   192: aload #9
/*     */     //   194: getfield L$3 : Ljava/lang/Object;
/*     */     //   197: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   200: astore #4
/*     */     //   202: aload #9
/*     */     //   204: getfield L$2 : Ljava/lang/Object;
/*     */     //   207: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   210: astore_2
/*     */     //   211: aload #9
/*     */     //   213: getfield L$1 : Ljava/lang/Object;
/*     */     //   216: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentState
/*     */     //   219: astore_1
/*     */     //   220: aload #9
/*     */     //   222: getfield L$0 : Ljava/lang/Object;
/*     */     //   225: checkcast com/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker
/*     */     //   228: astore_0
/*     */     //   229: aload #8
/*     */     //   231: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   234: aload #8
/*     */     //   236: checkcast com/intellij/openapi/editor/Document
/*     */     //   239: astore #6
/*     */     //   241: aload #6
/*     */     //   243: invokeinterface getLineCount : ()I
/*     */     //   248: aload_0
/*     */     //   249: getfield MAX_FILE_LINES : I
/*     */     //   252: if_icmple -> 274
/*     */     //   255: new com/intellij/ml/llm/matterhorn/ArtifactResponse
/*     */     //   258: dup
/*     */     //   259: new com/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentResponse
/*     */     //   262: dup
/*     */     //   263: aconst_null
/*     */     //   264: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;)V
/*     */     //   267: aconst_null
/*     */     //   268: iconst_2
/*     */     //   269: aconst_null
/*     */     //   270: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   273: areturn
/*     */     //   274: aload_2
/*     */     //   275: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   278: aload #5
/*     */     //   280: iconst_1
/*     */     //   281: aload_0
/*     */     //   282: getfield MAX_FILE_LINES : I
/*     */     //   285: aconst_null
/*     */     //   286: aload #4
/*     */     //   288: invokeinterface getSessionHistory : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */     //   293: aload #9
/*     */     //   295: bipush #16
/*     */     //   297: aconst_null
/*     */     //   298: aload #9
/*     */     //   300: aload_0
/*     */     //   301: putfield L$0 : Ljava/lang/Object;
/*     */     //   304: aload #9
/*     */     //   306: aload_1
/*     */     //   307: putfield L$1 : Ljava/lang/Object;
/*     */     //   310: aload #9
/*     */     //   312: aload_2
/*     */     //   313: putfield L$2 : Ljava/lang/Object;
/*     */     //   316: aload #9
/*     */     //   318: aconst_null
/*     */     //   319: putfield L$3 : Ljava/lang/Object;
/*     */     //   322: aload #9
/*     */     //   324: aconst_null
/*     */     //   325: putfield L$4 : Ljava/lang/Object;
/*     */     //   328: aload #9
/*     */     //   330: iconst_2
/*     */     //   331: putfield label : I
/*     */     //   334: invokestatic printScreen$default : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/vfs/VirtualFile;IILjava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   337: dup
/*     */     //   338: aload #14
/*     */     //   340: if_acmpne -> 380
/*     */     //   343: aload #14
/*     */     //   345: areturn
/*     */     //   346: aload #9
/*     */     //   348: getfield L$2 : Ljava/lang/Object;
/*     */     //   351: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   354: astore_2
/*     */     //   355: aload #9
/*     */     //   357: getfield L$1 : Ljava/lang/Object;
/*     */     //   360: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentState
/*     */     //   363: astore_1
/*     */     //   364: aload #9
/*     */     //   366: getfield L$0 : Ljava/lang/Object;
/*     */     //   369: checkcast com/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker
/*     */     //   372: astore_0
/*     */     //   373: aload #8
/*     */     //   375: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   378: aload #8
/*     */     //   380: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   385: aconst_null
/*     */     //   386: iconst_1
/*     */     //   387: aconst_null
/*     */     //   388: invokestatic trimMargin$default : (Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   391: invokestatic toUserMessage : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   394: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   397: aconst_null
/*     */     //   398: iconst_2
/*     */     //   399: aconst_null
/*     */     //   400: astore #10
/*     */     //   402: istore #11
/*     */     //   404: astore #12
/*     */     //   406: astore #13
/*     */     //   408: new com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   411: dup
/*     */     //   412: aload #13
/*     */     //   414: aload #12
/*     */     //   416: iload #11
/*     */     //   418: aload #10
/*     */     //   420: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   423: astore #7
/*     */     //   425: aload_0
/*     */     //   426: aload_1
/*     */     //   427: aconst_null
/*     */     //   428: aload_1
/*     */     //   429: invokevirtual getObservations : ()Ljava/util/List;
/*     */     //   432: checkcast java/util/Collection
/*     */     //   435: aload #7
/*     */     //   437: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;
/*     */     //   440: aconst_null
/*     */     //   441: aconst_null
/*     */     //   442: aconst_null
/*     */     //   443: aconst_null
/*     */     //   444: aconst_null
/*     */     //   445: aconst_null
/*     */     //   446: aconst_null
/*     */     //   447: aconst_null
/*     */     //   448: aconst_null
/*     */     //   449: sipush #2045
/*     */     //   452: aconst_null
/*     */     //   453: invokestatic copy$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   456: aload_2
/*     */     //   457: aload #9
/*     */     //   459: aload #9
/*     */     //   461: aconst_null
/*     */     //   462: putfield L$0 : Ljava/lang/Object;
/*     */     //   465: aload #9
/*     */     //   467: aconst_null
/*     */     //   468: putfield L$1 : Ljava/lang/Object;
/*     */     //   471: aload #9
/*     */     //   473: aconst_null
/*     */     //   474: putfield L$2 : Ljava/lang/Object;
/*     */     //   477: aload #9
/*     */     //   479: iconst_3
/*     */     //   480: putfield label : I
/*     */     //   483: invokespecial produceArtifact : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   486: dup
/*     */     //   487: aload #14
/*     */     //   489: if_acmpne -> 502
/*     */     //   492: aload #14
/*     */     //   494: areturn
/*     */     //   495: aload #8
/*     */     //   497: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   500: aload #8
/*     */     //   502: areturn
/*     */     //   503: new java/lang/IllegalStateException
/*     */     //   506: dup
/*     */     //   507: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   509: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   512: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #36	-> 60
/*     */     //   #40	-> 101
/*     */     //   #41	-> 107
/*     */     //   #43	-> 123
/*     */     //   #36	-> 179
/*     */     //   #47	-> 241
/*     */     //   #48	-> 255
/*     */     //   #51	-> 274
/*     */     //   #55	-> 274
/*     */     //   #54	-> 285
/*     */     //   #56	-> 286
/*     */     //   #54	-> 295
/*     */     //   #36	-> 343
/*     */     //   #59	-> 385
/*     */     //   #51	-> 397
/*     */     //   #62	-> 426
/*     */     //   #36	-> 492
/*     */     //   #62	-> 502
/*     */     //   #36	-> 503
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	81	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker;
/*     */     //   229	117	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker;
/*     */     //   373	53	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker;
/*     */     //   101	81	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   220	126	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   364	122	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   101	81	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   211	135	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   355	131	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   107	75	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   202	53	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   274	21	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   123	59	5	currentFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   192	63	5	currentFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   274	11	5	currentFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   241	14	6	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   425	61	7	documentContents	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   0	513	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	453	9	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	446	8	$result	Ljava/lang/Object;
/*     */   } private static final Document produceArtifact$lambda$0(VirtualFile $currentFile) {
/*  44 */     Intrinsics.checkNotNull(FileDocumentManager.getInstance().getDocument($currentFile)); return FileDocumentManager.getInstance().getDocument($currentFile);
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
/*     */   @Nullable
/*     */   public Object runCritic(@NotNull ExecutionAgentContext context, int attempt, @NotNull AgentState currentState, @NotNull List optionsToRank, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker$runCritic$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #5
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker$runCritic$1
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
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker$runCritic$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #5
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #26
/*     */     //   53: aload #26
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #25
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #27
/*     */     //   65: aload #26
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 848, 0 -> 96, 1 -> 725, 2 -> 840
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
/*     */     //   146: ifeq -> 234
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
/*     */     //   184: ldc_w 'rewrite_file\\n'
/*     */     //   187: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   190: astore #17
/*     */     //   192: iconst_0
/*     */     //   193: istore #18
/*     */     //   195: aload #17
/*     */     //   197: aload #16
/*     */     //   199: iload #18
/*     */     //   201: invokevirtual split : (Ljava/lang/CharSequence;I)Ljava/util/List;
/*     */     //   204: invokeinterface size : ()I
/*     */     //   209: iconst_2
/*     */     //   210: if_icmpne -> 217
/*     */     //   213: iconst_1
/*     */     //   214: goto -> 218
/*     */     //   217: iconst_0
/*     */     //   218: ifeq -> 139
/*     */     //   221: aload #10
/*     */     //   223: aload #13
/*     */     //   225: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   230: pop
/*     */     //   231: goto -> 139
/*     */     //   234: aload #10
/*     */     //   236: checkcast java/util/List
/*     */     //   239: nop
/*     */     //   240: astore #6
/*     */     //   242: aload #6
/*     */     //   244: invokeinterface isEmpty : ()Z
/*     */     //   249: ifeq -> 295
/*     */     //   252: iconst_2
/*     */     //   253: anewarray com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   256: astore #7
/*     */     //   258: aload #7
/*     */     //   260: iconst_0
/*     */     //   261: aload #4
/*     */     //   263: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   266: aastore
/*     */     //   267: aload #7
/*     */     //   269: iconst_1
/*     */     //   270: new com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   273: dup
/*     */     //   274: ldc_w 'ERROR: it's forbidden to use `rewrite_file` several times. Express all the required changes in one `rewrite_file` call'
/*     */     //   277: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.User : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   280: aconst_null
/*     */     //   281: aconst_null
/*     */     //   282: bipush #12
/*     */     //   284: aconst_null
/*     */     //   285: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   288: aastore
/*     */     //   289: aload #7
/*     */     //   291: invokestatic listOf : ([Ljava/lang/Object;)Ljava/util/List;
/*     */     //   294: areturn
/*     */     //   295: aload #6
/*     */     //   297: checkcast java/lang/Iterable
/*     */     //   300: astore #8
/*     */     //   302: iconst_0
/*     */     //   303: istore #9
/*     */     //   305: aload #8
/*     */     //   307: astore #10
/*     */     //   309: new java/util/ArrayList
/*     */     //   312: dup
/*     */     //   313: invokespecial <init> : ()V
/*     */     //   316: checkcast java/util/Collection
/*     */     //   319: astore #11
/*     */     //   321: iconst_0
/*     */     //   322: istore #12
/*     */     //   324: aload #10
/*     */     //   326: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   331: astore #13
/*     */     //   333: aload #13
/*     */     //   335: invokeinterface hasNext : ()Z
/*     */     //   340: ifeq -> 415
/*     */     //   343: aload #13
/*     */     //   345: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   350: astore #14
/*     */     //   352: aload #14
/*     */     //   354: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   357: astore #15
/*     */     //   359: iconst_0
/*     */     //   360: istore #16
/*     */     //   362: nop
/*     */     //   363: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest$Companion;
/*     */     //   366: aload #15
/*     */     //   368: invokeinterface getContent : ()Ljava/lang/String;
/*     */     //   373: invokevirtual parse : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest;
/*     */     //   376: pop
/*     */     //   377: iconst_1
/*     */     //   378: istore #17
/*     */     //   380: goto -> 388
/*     */     //   383: astore #18
/*     */     //   385: iconst_0
/*     */     //   386: istore #17
/*     */     //   388: iload #17
/*     */     //   390: ifeq -> 397
/*     */     //   393: iconst_1
/*     */     //   394: goto -> 398
/*     */     //   397: iconst_0
/*     */     //   398: nop
/*     */     //   399: ifeq -> 333
/*     */     //   402: aload #11
/*     */     //   404: aload #14
/*     */     //   406: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   411: pop
/*     */     //   412: goto -> 333
/*     */     //   415: aload #11
/*     */     //   417: checkcast java/util/List
/*     */     //   420: nop
/*     */     //   421: astore #7
/*     */     //   423: aload #7
/*     */     //   425: invokeinterface isEmpty : ()Z
/*     */     //   430: ifeq -> 476
/*     */     //   433: iconst_2
/*     */     //   434: anewarray com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   437: astore #8
/*     */     //   439: aload #8
/*     */     //   441: iconst_0
/*     */     //   442: aload #6
/*     */     //   444: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   447: aastore
/*     */     //   448: aload #8
/*     */     //   450: iconst_1
/*     */     //   451: new com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   454: dup
/*     */     //   455: ldc_w 'ERROR: Your responce is not formatted properly, try again, example:\\n<THOUGHT>\\nIn `hello.py` implement method `hello` that prints "hello"\\n</THOUGHT>\\n<COMMAND>\\nedit /mnt/myProject/hello.py\\nrewrite_file\\ndef hello():\\n    "print a greeting"\\n\\n    print("hello")\\n</COMMAND>\\nYOU MUST USE *SINGLE* `rewrite_file` COMMAND, issuing multiple `rewrite_file` commands will causes error'
/*     */     //   458: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.User : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   461: aconst_null
/*     */     //   462: aconst_null
/*     */     //   463: bipush #12
/*     */     //   465: aconst_null
/*     */     //   466: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   469: aastore
/*     */     //   470: aload #8
/*     */     //   472: invokestatic listOf : ([Ljava/lang/Object;)Ljava/util/List;
/*     */     //   475: areturn
/*     */     //   476: aload #7
/*     */     //   478: checkcast java/lang/Iterable
/*     */     //   481: astore #9
/*     */     //   483: iconst_0
/*     */     //   484: istore #10
/*     */     //   486: aload #9
/*     */     //   488: astore #11
/*     */     //   490: new java/util/ArrayList
/*     */     //   493: dup
/*     */     //   494: invokespecial <init> : ()V
/*     */     //   497: checkcast java/util/Collection
/*     */     //   500: astore #12
/*     */     //   502: iconst_0
/*     */     //   503: istore #13
/*     */     //   505: aload #11
/*     */     //   507: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   512: astore #14
/*     */     //   514: aload #14
/*     */     //   516: invokeinterface hasNext : ()Z
/*     */     //   521: ifeq -> 580
/*     */     //   524: aload #14
/*     */     //   526: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   531: astore #15
/*     */     //   533: aload #15
/*     */     //   535: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   538: astore #16
/*     */     //   540: iconst_0
/*     */     //   541: istore #17
/*     */     //   543: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest$Companion;
/*     */     //   546: aload #16
/*     */     //   548: invokeinterface getContent : ()Ljava/lang/String;
/*     */     //   553: invokevirtual parse : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest;
/*     */     //   556: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   559: ldc 'rewrite_file'
/*     */     //   561: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   564: ifeq -> 514
/*     */     //   567: aload #12
/*     */     //   569: aload #15
/*     */     //   571: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   576: pop
/*     */     //   577: goto -> 514
/*     */     //   580: aload #12
/*     */     //   582: checkcast java/util/List
/*     */     //   585: nop
/*     */     //   586: astore #8
/*     */     //   588: aload #8
/*     */     //   590: invokeinterface isEmpty : ()Z
/*     */     //   595: ifeq -> 641
/*     */     //   598: iconst_2
/*     */     //   599: anewarray com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   602: astore #9
/*     */     //   604: aload #9
/*     */     //   606: iconst_0
/*     */     //   607: aload #7
/*     */     //   609: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   612: aastore
/*     */     //   613: aload #9
/*     */     //   615: iconst_1
/*     */     //   616: new com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   619: dup
/*     */     //   620: ldc_w 'ERROR: you did not generate `rewrite_file` action. Please include the required edit in form of `rewrite_file` in your responce'
/*     */     //   623: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.User : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   626: aconst_null
/*     */     //   627: aconst_null
/*     */     //   628: bipush #12
/*     */     //   630: aconst_null
/*     */     //   631: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   634: aastore
/*     */     //   635: aload #9
/*     */     //   637: invokestatic listOf : ([Ljava/lang/Object;)Ljava/util/List;
/*     */     //   640: areturn
/*     */     //   641: aload_0
/*     */     //   642: aload #8
/*     */     //   644: aload_3
/*     */     //   645: aload_1
/*     */     //   646: iload_2
/*     */     //   647: istore #23
/*     */     //   649: astore #22
/*     */     //   651: astore #21
/*     */     //   653: astore #20
/*     */     //   655: astore #19
/*     */     //   657: aload_0
/*     */     //   658: aload_1
/*     */     //   659: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   664: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   667: invokevirtual getPropertyProvider : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   670: aload #26
/*     */     //   672: aload #26
/*     */     //   674: aload #19
/*     */     //   676: putfield L$0 : Ljava/lang/Object;
/*     */     //   679: aload #26
/*     */     //   681: aload #20
/*     */     //   683: putfield L$1 : Ljava/lang/Object;
/*     */     //   686: aload #26
/*     */     //   688: aload #21
/*     */     //   690: putfield L$2 : Ljava/lang/Object;
/*     */     //   693: aload #26
/*     */     //   695: aload #22
/*     */     //   697: putfield L$3 : Ljava/lang/Object;
/*     */     //   700: aload #26
/*     */     //   702: iload #23
/*     */     //   704: putfield I$0 : I
/*     */     //   707: aload #26
/*     */     //   709: iconst_1
/*     */     //   710: putfield label : I
/*     */     //   713: invokevirtual getAgentParameters : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   716: dup
/*     */     //   717: aload #27
/*     */     //   719: if_acmpne -> 779
/*     */     //   722: aload #27
/*     */     //   724: areturn
/*     */     //   725: aload #26
/*     */     //   727: getfield I$0 : I
/*     */     //   730: istore #23
/*     */     //   732: aload #26
/*     */     //   734: getfield L$3 : Ljava/lang/Object;
/*     */     //   737: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   740: astore #22
/*     */     //   742: aload #26
/*     */     //   744: getfield L$2 : Ljava/lang/Object;
/*     */     //   747: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentState
/*     */     //   750: astore #21
/*     */     //   752: aload #26
/*     */     //   754: getfield L$1 : Ljava/lang/Object;
/*     */     //   757: checkcast java/util/List
/*     */     //   760: astore #20
/*     */     //   762: aload #26
/*     */     //   764: getfield L$0 : Ljava/lang/Object;
/*     */     //   767: checkcast com/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker
/*     */     //   770: astore #19
/*     */     //   772: aload #25
/*     */     //   774: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   777: aload #25
/*     */     //   779: astore #24
/*     */     //   781: aload #19
/*     */     //   783: aload #20
/*     */     //   785: aload #21
/*     */     //   787: aload #22
/*     */     //   789: iload #23
/*     */     //   791: aload #24
/*     */     //   793: checkcast com/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters
/*     */     //   796: aload #26
/*     */     //   798: aload #26
/*     */     //   800: aconst_null
/*     */     //   801: putfield L$0 : Ljava/lang/Object;
/*     */     //   804: aload #26
/*     */     //   806: aconst_null
/*     */     //   807: putfield L$1 : Ljava/lang/Object;
/*     */     //   810: aload #26
/*     */     //   812: aconst_null
/*     */     //   813: putfield L$2 : Ljava/lang/Object;
/*     */     //   816: aload #26
/*     */     //   818: aconst_null
/*     */     //   819: putfield L$3 : Ljava/lang/Object;
/*     */     //   822: aload #26
/*     */     //   824: iconst_2
/*     */     //   825: putfield label : I
/*     */     //   828: invokevirtual checkAndSortActions : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ILcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/EditAgentParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   831: dup
/*     */     //   832: aload #27
/*     */     //   834: if_acmpne -> 847
/*     */     //   837: aload #27
/*     */     //   839: areturn
/*     */     //   840: aload #25
/*     */     //   842: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   845: aload #25
/*     */     //   847: areturn
/*     */     //   848: new java/lang/IllegalStateException
/*     */     //   851: dup
/*     */     //   852: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   854: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   857: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #65	-> 63
/*     */     //   #71	-> 101
/*     */     //   #218	-> 111
/*     */     //   #219	-> 130
/*     */     //   #72	-> 168
/*     */     //   #72	-> 192
/*     */     //   #72	-> 204
/*     */     //   #219	-> 218
/*     */     //   #220	-> 234
/*     */     //   #218	-> 239
/*     */     //   #71	-> 240
/*     */     //   #74	-> 242
/*     */     //   #76	-> 252
/*     */     //   #77	-> 270
/*     */     //   #78	-> 274
/*     */     //   #79	-> 277
/*     */     //   #77	-> 280
/*     */     //   #76	-> 289
/*     */     //   #75	-> 291
/*     */     //   #83	-> 295
/*     */     //   #221	-> 305
/*     */     //   #222	-> 324
/*     */     //   #84	-> 362
/*     */     //   #85	-> 363
/*     */     //   #86	-> 377
/*     */     //   #87	-> 383
/*     */     //   #88	-> 385
/*     */     //   #89	-> 398
/*     */     //   #222	-> 399
/*     */     //   #223	-> 415
/*     */     //   #221	-> 420
/*     */     //   #83	-> 421
/*     */     //   #91	-> 423
/*     */     //   #93	-> 433
/*     */     //   #94	-> 451
/*     */     //   #107	-> 455
/*     */     //   #108	-> 458
/*     */     //   #94	-> 461
/*     */     //   #93	-> 470
/*     */     //   #92	-> 472
/*     */     //   #113	-> 476
/*     */     //   #224	-> 486
/*     */     //   #225	-> 505
/*     */     //   #113	-> 543
/*     */     //   #225	-> 564
/*     */     //   #226	-> 580
/*     */     //   #224	-> 585
/*     */     //   #113	-> 586
/*     */     //   #112	-> 586
/*     */     //   #114	-> 588
/*     */     //   #116	-> 598
/*     */     //   #117	-> 616
/*     */     //   #118	-> 620
/*     */     //   #119	-> 623
/*     */     //   #117	-> 626
/*     */     //   #116	-> 635
/*     */     //   #115	-> 637
/*     */     //   #123	-> 641
/*     */     //   #124	-> 642
/*     */     //   #125	-> 644
/*     */     //   #126	-> 645
/*     */     //   #127	-> 646
/*     */     //   #128	-> 657
/*     */     //   #65	-> 722
/*     */     //   #123	-> 798
/*     */     //   #65	-> 837
/*     */     //   #123	-> 847
/*     */     //   #65	-> 848
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	117	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker;
/*     */     //   218	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker;
/*     */     //   240	12	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker;
/*     */     //   295	104	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker;
/*     */     //   399	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker;
/*     */     //   421	12	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker;
/*     */     //   476	88	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker;
/*     */     //   564	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker;
/*     */     //   586	12	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker;
/*     */     //   641	75	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/edit_workers/RewriteFileWorker;
/*     */     //   101	117	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   218	22	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   240	12	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   295	104	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   399	22	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   421	12	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   476	88	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   564	22	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   586	12	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   641	75	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   101	117	2	attempt	I
/*     */     //   218	22	2	attempt	I
/*     */     //   240	12	2	attempt	I
/*     */     //   295	104	2	attempt	I
/*     */     //   399	22	2	attempt	I
/*     */     //   421	12	2	attempt	I
/*     */     //   476	88	2	attempt	I
/*     */     //   564	22	2	attempt	I
/*     */     //   586	12	2	attempt	I
/*     */     //   641	16	2	attempt	I
/*     */     //   101	117	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   218	22	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   240	12	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   295	104	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   399	22	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   421	12	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   476	88	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   564	22	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   586	12	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   641	4	3	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   101	117	4	optionsToRank	Ljava/util/List;
/*     */     //   218	22	4	optionsToRank	Ljava/util/List;
/*     */     //   240	30	4	optionsToRank	Ljava/util/List;
/*     */     //   242	10	6	multipleCommandsFiltered	Ljava/util/List;
/*     */     //   295	104	6	multipleCommandsFiltered	Ljava/util/List;
/*     */     //   399	22	6	multipleCommandsFiltered	Ljava/util/List;
/*     */     //   421	30	6	multipleCommandsFiltered	Ljava/util/List;
/*     */     //   108	19	7	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   423	10	7	illFormedFiltered	Ljava/util/List;
/*     */     //   476	88	7	illFormedFiltered	Ljava/util/List;
/*     */     //   564	22	7	illFormedFiltered	Ljava/util/List;
/*     */     //   586	30	7	illFormedFiltered	Ljava/util/List;
/*     */     //   302	19	8	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   588	10	8	editActions	Ljava/util/List;
/*     */     //   641	3	8	editActions	Ljava/util/List;
/*     */     //   127	12	9	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   483	19	9	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   127	109	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   321	12	10	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   321	96	11	destination$iv$iv	Ljava/util/Collection;
/*     */     //   502	12	11	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   502	80	12	destination$iv$iv	Ljava/util/Collection;
/*     */     //   158	73	13	element$iv$iv	Ljava/lang/Object;
/*     */     //   165	25	14	it	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   352	60	14	element$iv$iv	Ljava/lang/Object;
/*     */     //   359	18	15	action	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   533	44	15	element$iv$iv	Ljava/lang/Object;
/*     */     //   540	24	16	it	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   168	50	15	$i$a$-filter-RewriteFileWorker$runCritic$multipleCommandsFiltered$1	I
/*     */     //   130	106	11	$i$f$filterTo	I
/*     */     //   111	129	8	$i$f$filter	I
/*     */     //   362	37	16	$i$a$-filter-RewriteFileWorker$runCritic$illFormedFiltered$1	I
/*     */     //   324	93	12	$i$f$filterTo	I
/*     */     //   305	116	9	$i$f$filter	I
/*     */     //   543	21	17	$i$a$-filter-RewriteFileWorker$runCritic$editActions$1	I
/*     */     //   505	77	13	$i$f$filterTo	I
/*     */     //   486	100	10	$i$f$filter	I
/*     */     //   0	858	5	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	795	26	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	788	25	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   362	380	383	java/lang/Exception
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
/*     */   @NotNull
/*     */   public List<AgentAction> getAvailableActions(@NotNull ExecutionAgentContext context) {
/* 133 */     Intrinsics.checkNotNullParameter(context, "context"); return CollectionsKt.listOf(new RewriteFileAction(SyntaxChecker.Companion.getSyntaxCheckers()));
/*     */   }
/*     */   @NotNull
/*     */   public String getSystemMessage(@NotNull ExecutionAgentContext context) {
/* 137 */     Intrinsics.checkNotNullParameter(context, "context"); String commandDescription = getCommandDescription(context);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 156 */     return "Act as an expert software developer.\nAlways use best practices when coding.\nRespect and use existing conventions, libraries, etc that are already present in the code base.\n\nYou will get the context of the big task being solved followed by a request to edit a particular file. Also you will get the original file contents.\nYou task is to rewrite the given file to fulfill the request.\nYour edit will apply to the requested file, don't include file name or file path to your edit since it's redundant.\nYou must provide the new version of code for the entire file.\nIt is forbidden to use any abbreviations, you must output each line with its full.\n\nAlways reply to the user in the same language they are using.\n\nOnce you get the request you MUST:\n1. Think step-by-step and explain the needed changes with a numbered list of short sentences.\n2. Call `rewrite_file` command followed by the new file contents\n\nHere is the description of the command:\n" + commandDescription + "\n\n\nRESPONSE FORMAT:\n\nYou need to format your output using two blocks inside xml tags: `<THOUGHT>` and `<COMMAND>`.\nYour output should always include _one_ `<THOUGHT>` and _one_ `<COMMAND>` blocks EXACTLY as in the following example:\n\n<THOUGHT>\nHere is the change that implements correct rounding\n</THOUGHT>\n<COMMAND>\nedit filename.py\nrewrite_file\nfrom astroid import extract_node\n\nnode = extract_node(\"\"\"def a(*args, b=None, c=None, **kwargs): ...\"\"\")\nprint(node.args.arguments)\nprint(\"vararg:\", node.args.vararg)\nprint(\"kwarg:\", node.args.kwarg)\nprint(\"kwonlyargs:\", node.args.kwonlyargs)\n</COMMAND>\n";
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
/* 182 */     Intrinsics.checkNotNullParameter(context, "context"); return "Here are examples of proper `rewrite_file` usage:\n\n<example1>\n<THOUGHT>\nIn `hello.py` implement method `hello` that prints \"hello\"\n</THOUGHT>\n<COMMAND>\nedit /mnt/myProject/hello.py\nrewrite_file\ndef hello():\n    \"print a greeting\"\n\n    print(\"hello\")\n</COMMAND>\n</example1>\n\n<example2>\n<THOUGHT>\nNow let's add the provided code to the `reproduce_bug.py` file.\n</THOUGHT>\n<COMMAND>\nedit reproduce_bug.py\nrewrite_file\nfrom astroid import extract_node\n\nnode = extract_node(\"\"\"def a(*args, b=None, c=None, **kwargs): ...\"\"\")\nprint(node.args.arguments)\nprint(\"vararg:\", node.args.vararg)\nprint(\"kwarg:\", node.args.kwarg)\nprint(\"kwonlyargs:\", node.args.kwonlyargs)\n</COMMAND>\n</example2>\n";
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "RewriteFileWorker.kt", l = {21, 22}, i = {0}, s = {"L$0"}, n = {"propertyProvider"}, m = "getAgentParameters", c = "com.intellij.ml.llm.matterhorn.ej.core.edit_workers.RewriteFileWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class RewriteFileWorker$getAgentParameters$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     RewriteFileWorker$getAgentParameters$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return RewriteFileWorker.this.getAgentParameters((MatterhornPropertyProvider)null, (Continuation<? super EditAgentParameters>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "RewriteFileWorker.kt", l = {29}, i = {}, s = {}, n = {}, m = "getTrajectoryElementAgent", c = "com.intellij.ml.llm.matterhorn.ej.core.edit_workers.RewriteFileWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class RewriteFileWorker$getTrajectoryElementAgent$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     RewriteFileWorker$getTrajectoryElementAgent$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return RewriteFileWorker.this.getTrajectoryElementAgent((MatterhornPropertyProvider)null, (Continuation<? super TrajectoryElementAgent>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "RewriteFileWorker.kt", l = {43, 54, 62}, i = {0, 0, 0, 0, 0, 1, 1, 1}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2"}, n = {"this", "input", "context", "executionAgentContext", "currentFile", "this", "input", "context"}, m = "produceArtifact", c = "com.intellij.ml.llm.matterhorn.ej.core.edit_workers.RewriteFileWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class RewriteFileWorker$produceArtifact$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     int label;
/*     */     
/*     */     RewriteFileWorker$produceArtifact$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return RewriteFileWorker.this.produceArtifact((AgentState)null, (ExecutionContext)null, (Continuation<? super ArtifactResponse<EditAgentResponse>>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "RewriteFileWorker.kt", l = {128, 123}, i = {}, s = {}, n = {}, m = "runCritic", c = "com.intellij.ml.llm.matterhorn.ej.core.edit_workers.RewriteFileWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class RewriteFileWorker$runCritic$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     int I$0;
/*     */     int label;
/*     */     
/*     */     RewriteFileWorker$runCritic$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return RewriteFileWorker.this.runCritic((ExecutionAgentContext)null, 0, (AgentState)null, (List<? extends MatterhornChatElement>)null, (Continuation<? super List<? extends MatterhornChatElement>>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\edit_workers\RewriteFileWorker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */