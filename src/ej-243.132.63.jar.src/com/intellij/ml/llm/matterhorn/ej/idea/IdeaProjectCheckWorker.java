/*    */ package com.intellij.ml.llm.matterhorn.ej.idea;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.ProjectCheckInput;
/*    */ import com.intellij.openapi.diagnostic.Logger;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\005\030\000 \0232\0020\001:\001\023B\007¢\006\004\b\002\020\003J$\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\b2\006\020\t\032\0020\nH@¢\006\002\020\013J\026\020\f\032\0020\r2\006\020\016\032\0020\017H@¢\006\002\020\020J\036\020\021\032\0020\r2\006\020\007\032\0020\b2\006\020\016\032\0020\017H@¢\006\002\020\022¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectCheckWorker;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractProjectCheckWorker;", "<init>", "()V", "produceArtifact", "Lcom/intellij/ml/llm/matterhorn/ArtifactResponse;", "", "input", "Lcom/intellij/ml/llm/matterhorn/ej/core/ProjectCheckInput;", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ProjectCheckInput;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkBuildAction", "", "agentContext", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkTestRunAction", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ProjectCheckInput;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ej-idea"})
/*    */ @SourceDebugExtension({"SMAP\nIdeaProjectCheckWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdeaProjectCheckWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectCheckWorker\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,56:1\n14#2:57\n*S KotlinDebug\n*F\n+ 1 IdeaProjectCheckWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectCheckWorker\n*L\n15#1:57\n*E\n"})
/*    */ public final class IdeaProjectCheckWorker extends AbstractProjectCheckWorker {
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectCheckWorker$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "getLogger", "()Lcom/intellij/openapi/diagnostic/Logger;", "ej-idea"})
/*    */   public static final class Companion { @NotNull
/* 15 */     public final Logger getLogger() { return IdeaProjectCheckWorker.logger; } private Companion() {} } @NotNull public static final Companion Companion = new Companion(null); static { int $i$f$logger = 0;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 57 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(IdeaProjectCheckWorker.class), "getInstance(...)"); } @Nullable public Object produceArtifact(@NotNull ProjectCheckInput input, @NotNull ExecutionContext context, @NotNull Continuation $completion) { // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectCheckWorker$produceArtifact$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectCheckWorker$produceArtifact$1
/*    */     //   11: astore #6
/*    */     //   13: aload #6
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #6
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectCheckWorker$produceArtifact$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectCheckWorker;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #6
/*    */     //   50: aload #6
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #5
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #7
/*    */     //   62: aload #6
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 413, 0 -> 100, 1 -> 154, 2 -> 233, 3 -> 312, 4 -> 390
/*    */     //   100: aload #5
/*    */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   105: aload_0
/*    */     //   106: aload_2
/*    */     //   107: invokevirtual initEnvironment : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   110: astore #4
/*    */     //   112: aload_0
/*    */     //   113: aload #4
/*    */     //   115: aload #6
/*    */     //   117: aload #6
/*    */     //   119: aload_0
/*    */     //   120: putfield L$0 : Ljava/lang/Object;
/*    */     //   123: aload #6
/*    */     //   125: aload_1
/*    */     //   126: putfield L$1 : Ljava/lang/Object;
/*    */     //   129: aload #6
/*    */     //   131: aload #4
/*    */     //   133: putfield L$2 : Ljava/lang/Object;
/*    */     //   136: aload #6
/*    */     //   138: iconst_1
/*    */     //   139: putfield label : I
/*    */     //   142: invokespecial checkBuildAction : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   145: dup
/*    */     //   146: aload #7
/*    */     //   148: if_acmpne -> 189
/*    */     //   151: aload #7
/*    */     //   153: areturn
/*    */     //   154: aload #6
/*    */     //   156: getfield L$2 : Ljava/lang/Object;
/*    */     //   159: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*    */     //   162: astore #4
/*    */     //   164: aload #6
/*    */     //   166: getfield L$1 : Ljava/lang/Object;
/*    */     //   169: checkcast com/intellij/ml/llm/matterhorn/ej/core/ProjectCheckInput
/*    */     //   172: astore_1
/*    */     //   173: aload #6
/*    */     //   175: getfield L$0 : Ljava/lang/Object;
/*    */     //   178: checkcast com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectCheckWorker
/*    */     //   181: astore_0
/*    */     //   182: aload #5
/*    */     //   184: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   187: aload #5
/*    */     //   189: pop
/*    */     //   190: aload_0
/*    */     //   191: aload_1
/*    */     //   192: aload #4
/*    */     //   194: aload #6
/*    */     //   196: aload #6
/*    */     //   198: aload_0
/*    */     //   199: putfield L$0 : Ljava/lang/Object;
/*    */     //   202: aload #6
/*    */     //   204: aload_1
/*    */     //   205: putfield L$1 : Ljava/lang/Object;
/*    */     //   208: aload #6
/*    */     //   210: aload #4
/*    */     //   212: putfield L$2 : Ljava/lang/Object;
/*    */     //   215: aload #6
/*    */     //   217: iconst_2
/*    */     //   218: putfield label : I
/*    */     //   221: invokevirtual checkFileStructureAction : (Lcom/intellij/ml/llm/matterhorn/ej/core/ProjectCheckInput;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   224: dup
/*    */     //   225: aload #7
/*    */     //   227: if_acmpne -> 268
/*    */     //   230: aload #7
/*    */     //   232: areturn
/*    */     //   233: aload #6
/*    */     //   235: getfield L$2 : Ljava/lang/Object;
/*    */     //   238: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*    */     //   241: astore #4
/*    */     //   243: aload #6
/*    */     //   245: getfield L$1 : Ljava/lang/Object;
/*    */     //   248: checkcast com/intellij/ml/llm/matterhorn/ej/core/ProjectCheckInput
/*    */     //   251: astore_1
/*    */     //   252: aload #6
/*    */     //   254: getfield L$0 : Ljava/lang/Object;
/*    */     //   257: checkcast com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectCheckWorker
/*    */     //   260: astore_0
/*    */     //   261: aload #5
/*    */     //   263: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   266: aload #5
/*    */     //   268: pop
/*    */     //   269: aload_0
/*    */     //   270: aload_1
/*    */     //   271: aload #4
/*    */     //   273: aload #6
/*    */     //   275: aload #6
/*    */     //   277: aload_0
/*    */     //   278: putfield L$0 : Ljava/lang/Object;
/*    */     //   281: aload #6
/*    */     //   283: aload_1
/*    */     //   284: putfield L$1 : Ljava/lang/Object;
/*    */     //   287: aload #6
/*    */     //   289: aload #4
/*    */     //   291: putfield L$2 : Ljava/lang/Object;
/*    */     //   294: aload #6
/*    */     //   296: iconst_3
/*    */     //   297: putfield label : I
/*    */     //   300: invokevirtual checkFileChecker : (Lcom/intellij/ml/llm/matterhorn/ej/core/ProjectCheckInput;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   303: dup
/*    */     //   304: aload #7
/*    */     //   306: if_acmpne -> 347
/*    */     //   309: aload #7
/*    */     //   311: areturn
/*    */     //   312: aload #6
/*    */     //   314: getfield L$2 : Ljava/lang/Object;
/*    */     //   317: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*    */     //   320: astore #4
/*    */     //   322: aload #6
/*    */     //   324: getfield L$1 : Ljava/lang/Object;
/*    */     //   327: checkcast com/intellij/ml/llm/matterhorn/ej/core/ProjectCheckInput
/*    */     //   330: astore_1
/*    */     //   331: aload #6
/*    */     //   333: getfield L$0 : Ljava/lang/Object;
/*    */     //   336: checkcast com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectCheckWorker
/*    */     //   339: astore_0
/*    */     //   340: aload #5
/*    */     //   342: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   345: aload #5
/*    */     //   347: pop
/*    */     //   348: aload_0
/*    */     //   349: aload_1
/*    */     //   350: aload #4
/*    */     //   352: aload #6
/*    */     //   354: aload #6
/*    */     //   356: aconst_null
/*    */     //   357: putfield L$0 : Ljava/lang/Object;
/*    */     //   360: aload #6
/*    */     //   362: aconst_null
/*    */     //   363: putfield L$1 : Ljava/lang/Object;
/*    */     //   366: aload #6
/*    */     //   368: aconst_null
/*    */     //   369: putfield L$2 : Ljava/lang/Object;
/*    */     //   372: aload #6
/*    */     //   374: iconst_4
/*    */     //   375: putfield label : I
/*    */     //   378: invokespecial checkTestRunAction : (Lcom/intellij/ml/llm/matterhorn/ej/core/ProjectCheckInput;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   381: dup
/*    */     //   382: aload #7
/*    */     //   384: if_acmpne -> 397
/*    */     //   387: aload #7
/*    */     //   389: areturn
/*    */     //   390: aload #5
/*    */     //   392: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   395: aload #5
/*    */     //   397: pop
/*    */     //   398: new com/intellij/ml/llm/matterhorn/ArtifactResponse
/*    */     //   401: dup
/*    */     //   402: iconst_1
/*    */     //   403: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   406: aconst_null
/*    */     //   407: iconst_2
/*    */     //   408: aconst_null
/*    */     //   409: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   412: areturn
/*    */     //   413: new java/lang/IllegalStateException
/*    */     //   416: dup
/*    */     //   417: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   419: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   422: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #18	-> 60
/*    */     //   #19	-> 105
/*    */     //   #21	-> 112
/*    */     //   #18	-> 151
/*    */     //   #22	-> 189
/*    */     //   #18	-> 230
/*    */     //   #23	-> 268
/*    */     //   #18	-> 309
/*    */     //   #24	-> 347
/*    */     //   #18	-> 387
/*    */     //   #26	-> 397
/*    */     //   #18	-> 413
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   105	49	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectCheckWorker;
/*    */     //   182	51	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectCheckWorker;
/*    */     //   261	51	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectCheckWorker;
/*    */     //   340	41	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectCheckWorker;
/*    */     //   105	49	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/ProjectCheckInput;
/*    */     //   173	60	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/ProjectCheckInput;
/*    */     //   252	60	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/ProjectCheckInput;
/*    */     //   331	50	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/ProjectCheckInput;
/*    */     //   105	7	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   112	42	4	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   164	69	4	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   243	69	4	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   322	59	4	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   0	423	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	363	6	$continuation	Lkotlin/coroutines/Continuation;
/* 57 */     //   57	356	5	$result	Ljava/lang/Object; } @NotNull private static final Logger logger = Logger.getInstance(IdeaProjectCheckWorker.class);
/*    */   
/*    */   private final Object checkBuildAction(ExecutionAgentContext agentContext, Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectCheckWorker$checkBuildAction$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectCheckWorker$checkBuildAction$1
/*    */     //   11: astore #6
/*    */     //   13: aload #6
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #6
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectCheckWorker$checkBuildAction$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectCheckWorker;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #6
/*    */     //   50: aload #6
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #5
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #7
/*    */     //   62: aload #6
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 210, 0 -> 88, 1 -> 143
/*    */     //   88: aload #5
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: new com/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest
/*    */     //   96: dup
/*    */     //   97: ldc 'build'
/*    */     //   99: ldc ''
/*    */     //   101: ldc ''
/*    */     //   103: iconst_0
/*    */     //   104: bipush #8
/*    */     //   106: aconst_null
/*    */     //   107: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   110: astore_3
/*    */     //   111: new com/intellij/ml/llm/matterhorn/ej/idea/actions/RunBuildAgentAction
/*    */     //   114: dup
/*    */     //   115: invokespecial <init> : ()V
/*    */     //   118: aload_3
/*    */     //   119: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*    */     //   122: aload_1
/*    */     //   123: aload #6
/*    */     //   125: aload #6
/*    */     //   127: iconst_1
/*    */     //   128: putfield label : I
/*    */     //   131: invokevirtual execute : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   134: dup
/*    */     //   135: aload #7
/*    */     //   137: if_acmpne -> 150
/*    */     //   140: aload #7
/*    */     //   142: areturn
/*    */     //   143: aload #5
/*    */     //   145: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   148: aload #5
/*    */     //   150: checkcast java/lang/String
/*    */     //   153: astore #4
/*    */     //   155: ldc 'BUILD RESULT:'
/*    */     //   157: getstatic java/lang/System.out : Ljava/io/PrintStream;
/*    */     //   160: swap
/*    */     //   161: invokevirtual println : (Ljava/lang/Object;)V
/*    */     //   164: getstatic java/lang/System.out : Ljava/io/PrintStream;
/*    */     //   167: aload #4
/*    */     //   169: invokevirtual println : (Ljava/lang/Object;)V
/*    */     //   172: aload #4
/*    */     //   174: checkcast java/lang/CharSequence
/*    */     //   177: ldc 'Build completed successfully'
/*    */     //   179: checkcast java/lang/CharSequence
/*    */     //   182: iconst_0
/*    */     //   183: iconst_2
/*    */     //   184: aconst_null
/*    */     //   185: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*    */     //   188: ifne -> 206
/*    */     //   191: new java/lang/RuntimeException
/*    */     //   194: dup
/*    */     //   195: aload #4
/*    */     //   197: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   202: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   205: athrow
/*    */     //   206: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   209: areturn
/*    */     //   210: new java/lang/IllegalStateException
/*    */     //   213: dup
/*    */     //   214: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   216: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   219: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #29	-> 60
/*    */     //   #30	-> 93
/*    */     //   #31	-> 111
/*    */     //   #29	-> 140
/*    */     //   #33	-> 155
/*    */     //   #34	-> 164
/*    */     //   #36	-> 172
/*    */     //   #37	-> 191
/*    */     //   #38	-> 206
/*    */     //   #29	-> 210
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	41	1	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   111	23	3	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest;
/*    */     //   155	55	4	buildResult	Ljava/lang/String;
/*    */     //   0	220	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	160	6	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	153	5	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   private final Object checkTestRunAction(ProjectCheckInput input, ExecutionAgentContext agentContext, Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectCheckWorker$checkTestRunAction$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectCheckWorker$checkTestRunAction$1
/*    */     //   11: astore #7
/*    */     //   13: aload #7
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #7
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectCheckWorker$checkTestRunAction$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectCheckWorker;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #7
/*    */     //   50: aload #7
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #6
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #8
/*    */     //   62: aload #7
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 287, 0 -> 88, 1 -> 201
/*    */     //   88: aload #6
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_1
/*    */     //   94: invokevirtual getTestsToRun : ()Ljava/util/List;
/*    */     //   97: checkcast java/lang/Iterable
/*    */     //   100: ldc ';'
/*    */     //   102: checkcast java/lang/CharSequence
/*    */     //   105: aconst_null
/*    */     //   106: aconst_null
/*    */     //   107: iconst_0
/*    */     //   108: aconst_null
/*    */     //   109: aconst_null
/*    */     //   110: bipush #62
/*    */     //   112: aconst_null
/*    */     //   113: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*    */     //   116: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   121: getstatic java/lang/System.out : Ljava/io/PrintStream;
/*    */     //   124: swap
/*    */     //   125: invokevirtual println : (Ljava/lang/Object;)V
/*    */     //   128: new com/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest
/*    */     //   131: dup
/*    */     //   132: ldc 'run_test'
/*    */     //   134: aload_1
/*    */     //   135: invokevirtual getTestsToRun : ()Ljava/util/List;
/*    */     //   138: checkcast java/lang/Iterable
/*    */     //   141: ldc ';'
/*    */     //   143: checkcast java/lang/CharSequence
/*    */     //   146: aconst_null
/*    */     //   147: aconst_null
/*    */     //   148: iconst_0
/*    */     //   149: aconst_null
/*    */     //   150: aconst_null
/*    */     //   151: bipush #62
/*    */     //   153: aconst_null
/*    */     //   154: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*    */     //   157: ldc ''
/*    */     //   159: iconst_0
/*    */     //   160: bipush #8
/*    */     //   162: aconst_null
/*    */     //   163: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   166: astore #4
/*    */     //   168: new com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction
/*    */     //   171: dup
/*    */     //   172: invokespecial <init> : ()V
/*    */     //   175: aload #4
/*    */     //   177: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*    */     //   180: aload_2
/*    */     //   181: aload #7
/*    */     //   183: aload #7
/*    */     //   185: iconst_1
/*    */     //   186: putfield label : I
/*    */     //   189: invokevirtual execute : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   192: dup
/*    */     //   193: aload #8
/*    */     //   195: if_acmpne -> 208
/*    */     //   198: aload #8
/*    */     //   200: areturn
/*    */     //   201: aload #6
/*    */     //   203: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   206: aload #6
/*    */     //   208: checkcast java/lang/String
/*    */     //   211: astore #5
/*    */     //   213: ldc 'TEST RESULT:'
/*    */     //   215: getstatic java/lang/System.out : Ljava/io/PrintStream;
/*    */     //   218: swap
/*    */     //   219: invokevirtual println : (Ljava/lang/Object;)V
/*    */     //   222: getstatic java/lang/System.out : Ljava/io/PrintStream;
/*    */     //   225: aload #5
/*    */     //   227: invokevirtual println : (Ljava/lang/Object;)V
/*    */     //   230: aload #5
/*    */     //   232: checkcast java/lang/CharSequence
/*    */     //   235: ldc '### Passed Tests'
/*    */     //   237: checkcast java/lang/CharSequence
/*    */     //   240: iconst_0
/*    */     //   241: iconst_2
/*    */     //   242: aconst_null
/*    */     //   243: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*    */     //   246: ifeq -> 268
/*    */     //   249: aload #5
/*    */     //   251: checkcast java/lang/CharSequence
/*    */     //   254: ldc '### Failed Tests'
/*    */     //   256: checkcast java/lang/CharSequence
/*    */     //   259: iconst_0
/*    */     //   260: iconst_2
/*    */     //   261: aconst_null
/*    */     //   262: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*    */     //   265: ifeq -> 283
/*    */     //   268: new java/lang/RuntimeException
/*    */     //   271: dup
/*    */     //   272: aload #5
/*    */     //   274: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   279: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   282: athrow
/*    */     //   283: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   286: areturn
/*    */     //   287: new java/lang/IllegalStateException
/*    */     //   290: dup
/*    */     //   291: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   293: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   296: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #40	-> 60
/*    */     //   #44	-> 93
/*    */     //   #45	-> 128
/*    */     //   #46	-> 168
/*    */     //   #40	-> 198
/*    */     //   #48	-> 213
/*    */     //   #49	-> 222
/*    */     //   #51	-> 230
/*    */     //   #53	-> 268
/*    */     //   #54	-> 283
/*    */     //   #40	-> 287
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	35	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/ProjectCheckInput;
/*    */     //   128	40	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/ProjectCheckInput;
/*    */     //   93	35	2	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   128	64	2	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   168	24	4	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest;
/*    */     //   213	9	5	testRunResult	Ljava/lang/String;
/*    */     //   222	8	5	testRunResult	Ljava/lang/String;
/*    */     //   230	38	5	testRunResult	Ljava/lang/String;
/*    */     //   268	19	5	testRunResult	Ljava/lang/String;
/*    */     //   0	297	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	237	7	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	230	6	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "IdeaProjectCheckWorker.kt", l = {31}, i = {}, s = {}, n = {}, m = "checkBuildAction", c = "com.intellij.ml.llm.matterhorn.ej.idea.IdeaProjectCheckWorker")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class IdeaProjectCheckWorker$checkBuildAction$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     IdeaProjectCheckWorker$checkBuildAction$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return IdeaProjectCheckWorker.this.checkBuildAction(null, (Continuation)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "IdeaProjectCheckWorker.kt", l = {46}, i = {}, s = {}, n = {}, m = "checkTestRunAction", c = "com.intellij.ml.llm.matterhorn.ej.idea.IdeaProjectCheckWorker")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class IdeaProjectCheckWorker$checkTestRunAction$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     IdeaProjectCheckWorker$checkTestRunAction$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return IdeaProjectCheckWorker.this.checkTestRunAction(null, null, (Continuation)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "IdeaProjectCheckWorker.kt", l = {21, 22, 23, 24}, i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, n = {"this", "input", "agentContext", "this", "input", "agentContext", "this", "input", "agentContext"}, m = "produceArtifact", c = "com.intellij.ml.llm.matterhorn.ej.idea.IdeaProjectCheckWorker")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class IdeaProjectCheckWorker$produceArtifact$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int label;
/*    */     
/*    */     IdeaProjectCheckWorker$produceArtifact$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return IdeaProjectCheckWorker.this.produceArtifact((ProjectCheckInput)null, (ExecutionContext)null, (Continuation<? super ArtifactResponse<Boolean>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\IdeaProjectCheckWorker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */