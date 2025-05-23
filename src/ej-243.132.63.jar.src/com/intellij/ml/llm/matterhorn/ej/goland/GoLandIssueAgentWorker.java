/*    */ package com.intellij.ml.llm.matterhorn.ej.goland;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentResponse;
/*    */ import com.intellij.openapi.diagnostic.Logger;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\030\000 \0202\0020\001:\001\020B\007¢\006\004\b\002\020\003J\016\020\004\032\b\022\004\022\0020\0060\005H\026J&\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\016H@¢\006\002\020\017¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/goland/GoLandIssueAgentWorker;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker;", "<init>", "()V", "getSingleStepArtifactType", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentResponse;", "setupCommandExecutor", "", "executor", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;", "executionDir", "Ljava/nio/file/Path;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;Ljava/nio/file/Path;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ej-goland"})
/*    */ @SourceDebugExtension({"SMAP\nGoLandIssueAgentWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoLandIssueAgentWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/goland/GoLandIssueAgentWorker\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n61#2,5:40\n14#2:45\n1#3:46\n*S KotlinDebug\n*F\n+ 1 GoLandIssueAgentWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/goland/GoLandIssueAgentWorker\n*L\n35#1:40,5\n18#1:45\n*E\n"})
/*    */ public final class GoLandIssueAgentWorker extends AbstractIssueAgentWorker {
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\033\020\004\032\0020\0058BX\002¢\006\f\n\004\b\b\020\t\032\004\b\006\020\007¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/goland/GoLandIssueAgentWorker$Companion;", "", "<init>", "()V", "LOG", "Lcom/intellij/openapi/diagnostic/Logger;", "getLOG", "()Lcom/intellij/openapi/diagnostic/Logger;", "LOG$delegate", "Lkotlin/Lazy;", "ej-goland"})
/* 17 */   public static final class Companion { private final Logger getLOG() { Lazy lazy = GoLandIssueAgentWorker.LOG$delegate; return (Logger)lazy.getValue(); } private Companion() {} } @NotNull public static final Companion Companion = new Companion(null); @NotNull private static final Lazy<Logger> LOG$delegate = LazyKt.lazy(GoLandIssueAgentWorker::LOG_delegate$lambda$2); private static final Logger LOG_delegate$lambda$2() {
/* 18 */     int $i$f$logger = 0;
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
/* 45 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(GoLandIssueAgentWorker.class), "getInstance(...)"); Logger logger1 = Logger.getInstance(GoLandIssueAgentWorker.class); Logger it = logger1;
/* 46 */     int $i$a$-also-GoLandIssueAgentWorker$Companion$LOG$2$1 = 0;
/*    */     it.setLevel(LogLevel.ALL);
/*    */     return logger1;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public ArtifactType<AgentResponse> getSingleStepArtifactType() {
/*    */     return GoLandAgentArtifactTypes.INSTANCE.getAgentSingleStepIssuePlan();
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   protected Object setupCommandExecutor(@NotNull ExecutionSession executor, @NotNull Path executionDir, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/goland/GoLandIssueAgentWorker$setupCommandExecutor$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/goland/GoLandIssueAgentWorker$setupCommandExecutor$1
/*    */     //   13: astore #12
/*    */     //   15: aload #12
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #12
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new com/intellij/ml/llm/matterhorn/ej/goland/GoLandIssueAgentWorker$setupCommandExecutor$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/goland/GoLandIssueAgentWorker;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #12
/*    */     //   53: aload #12
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #11
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #13
/*    */     //   65: aload #12
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 308, 0 -> 96, 1 -> 143, 2 -> 292
/*    */     //   96: aload #11
/*    */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   101: aload_0
/*    */     //   102: aload_1
/*    */     //   103: aload_2
/*    */     //   104: aload_3
/*    */     //   105: aload #12
/*    */     //   107: aload #12
/*    */     //   109: aload_1
/*    */     //   110: putfield L$0 : Ljava/lang/Object;
/*    */     //   113: aload #12
/*    */     //   115: aload_2
/*    */     //   116: putfield L$1 : Ljava/lang/Object;
/*    */     //   119: aload #12
/*    */     //   121: aload_3
/*    */     //   122: putfield L$2 : Ljava/lang/Object;
/*    */     //   125: aload #12
/*    */     //   127: iconst_1
/*    */     //   128: putfield label : I
/*    */     //   131: invokespecial setupCommandExecutor : (Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;Ljava/nio/file/Path;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   134: dup
/*    */     //   135: aload #13
/*    */     //   137: if_acmpne -> 177
/*    */     //   140: aload #13
/*    */     //   142: areturn
/*    */     //   143: aload #12
/*    */     //   145: getfield L$2 : Ljava/lang/Object;
/*    */     //   148: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*    */     //   151: astore_3
/*    */     //   152: aload #12
/*    */     //   154: getfield L$1 : Ljava/lang/Object;
/*    */     //   157: checkcast java/nio/file/Path
/*    */     //   160: astore_2
/*    */     //   161: aload #12
/*    */     //   163: getfield L$0 : Ljava/lang/Object;
/*    */     //   166: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession
/*    */     //   169: astore_1
/*    */     //   170: aload #11
/*    */     //   172: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   175: aload #11
/*    */     //   177: pop
/*    */     //   178: aload_1
/*    */     //   179: instanceof com/intellij/ml/llm/matterhorn/ej/core/run/local/LocalExecutionSession
/*    */     //   182: ifeq -> 304
/*    */     //   185: aload_3
/*    */     //   186: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   191: aconst_null
/*    */     //   192: invokestatic getGoSpecificPathVariable : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/module/Module;)Ljava/lang/String;
/*    */     //   195: astore #5
/*    */     //   197: getstatic com/intellij/ml/llm/matterhorn/ej/goland/GoLandIssueAgentWorker.Companion : Lcom/intellij/ml/llm/matterhorn/ej/goland/GoLandIssueAgentWorker$Companion;
/*    */     //   200: invokestatic access$getLOG : (Lcom/intellij/ml/llm/matterhorn/ej/goland/GoLandIssueAgentWorker$Companion;)Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   203: astore #6
/*    */     //   205: aconst_null
/*    */     //   206: astore #7
/*    */     //   208: iconst_0
/*    */     //   209: istore #8
/*    */     //   211: aload #6
/*    */     //   213: invokevirtual isDebugEnabled : ()Z
/*    */     //   216: ifeq -> 241
/*    */     //   219: aload #6
/*    */     //   221: astore #10
/*    */     //   223: iconst_0
/*    */     //   224: istore #9
/*    */     //   226: aload #5
/*    */     //   228: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   233: aload #10
/*    */     //   235: swap
/*    */     //   236: aload #7
/*    */     //   238: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   241: nop
/*    */     //   242: aload_1
/*    */     //   243: aload #5
/*    */     //   245: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   250: aconst_null
/*    */     //   251: aload_2
/*    */     //   252: aload #12
/*    */     //   254: iconst_2
/*    */     //   255: aconst_null
/*    */     //   256: aload #12
/*    */     //   258: aconst_null
/*    */     //   259: putfield L$0 : Ljava/lang/Object;
/*    */     //   262: aload #12
/*    */     //   264: aconst_null
/*    */     //   265: putfield L$1 : Ljava/lang/Object;
/*    */     //   268: aload #12
/*    */     //   270: aconst_null
/*    */     //   271: putfield L$2 : Ljava/lang/Object;
/*    */     //   274: aload #12
/*    */     //   276: iconst_2
/*    */     //   277: putfield label : I
/*    */     //   280: invokestatic execute$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;Ljava/lang/String;Ljava/lang/Long;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   283: dup
/*    */     //   284: aload #13
/*    */     //   286: if_acmpne -> 299
/*    */     //   289: aload #13
/*    */     //   291: areturn
/*    */     //   292: aload #11
/*    */     //   294: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   297: aload #11
/*    */     //   299: pop
/*    */     //   300: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   303: areturn
/*    */     //   304: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   307: areturn
/*    */     //   308: new java/lang/IllegalStateException
/*    */     //   311: dup
/*    */     //   312: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   314: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   317: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #26	-> 63
/*    */     //   #31	-> 102
/*    */     //   #26	-> 140
/*    */     //   #33	-> 177
/*    */     //   #34	-> 185
/*    */     //   #35	-> 197
/*    */     //   #40	-> 205
/*    */     //   #41	-> 211
/*    */     //   #42	-> 219
/*    */     //   #35	-> 226
/*    */     //   #42	-> 236
/*    */     //   #44	-> 241
/*    */     //   #36	-> 242
/*    */     //   #26	-> 289
/*    */     //   #38	-> 299
/*    */     //   #26	-> 308
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   101	1	0	this	Lcom/intellij/ml/llm/matterhorn/ej/goland/GoLandIssueAgentWorker;
/*    */     //   101	42	1	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*    */     //   170	63	1	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*    */     //   233	9	1	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*    */     //   242	41	1	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*    */     //   101	42	2	executionDir	Ljava/nio/file/Path;
/*    */     //   161	72	2	executionDir	Ljava/nio/file/Path;
/*    */     //   233	9	2	executionDir	Ljava/nio/file/Path;
/*    */     //   242	41	2	executionDir	Ljava/nio/file/Path;
/*    */     //   101	42	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   152	45	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   197	36	5	goPathBinList	Ljava/lang/String;
/*    */     //   233	9	5	goPathBinList	Ljava/lang/String;
/*    */     //   242	41	5	goPathBinList	Ljava/lang/String;
/*    */     //   205	18	6	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   208	25	7	e$iv	Ljava/lang/Exception;
/*    */     //   233	8	7	e$iv	Ljava/lang/Exception;
/*    */     //   226	7	9	$i$a$-debug$default-GoLandIssueAgentWorker$setupCommandExecutor$2	I
/*    */     //   211	31	8	$i$f$debug	I
/*    */     //   0	318	4	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	255	12	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	248	11	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "GoLandIssueAgentWorker.kt", l = {31, 36}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"executor", "executionDir", "context"}, m = "setupCommandExecutor", c = "com.intellij.ml.llm.matterhorn.ej.goland.GoLandIssueAgentWorker")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class GoLandIssueAgentWorker$setupCommandExecutor$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int label;
/*    */     
/*    */     GoLandIssueAgentWorker$setupCommandExecutor$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return GoLandIssueAgentWorker.this.setupCommandExecutor(null, null, null, (Continuation<? super Unit>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\goland\GoLandIssueAgentWorker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */