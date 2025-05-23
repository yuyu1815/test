/*    */ package com.intellij.ml.llm.matterhorn.ej.pycharm;
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactType;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentResponse;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\016\020\004\032\b\022\004\022\0020\0060\005H\026J&\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\016H@¢\006\002\020\017¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/pycharm/PythonIssueAgentWorker;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker;", "<init>", "()V", "getSingleStepArtifactType", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentResponse;", "setupCommandExecutor", "", "executor", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;", "executionDir", "Ljava/nio/file/Path;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;Ljava/nio/file/Path;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-pycharm"})
/*    */ public final class PythonIssueAgentWorker extends AbstractIssueAgentWorker {
/*    */   @NotNull
/*    */   public ArtifactType<AgentResponse> getSingleStepArtifactType() {
/* 14 */     return PyCharmAgentArtifactTypes.INSTANCE.getAgentSingleStepIssuePlan();
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   protected Object setupCommandExecutor(@NotNull ExecutionSession executor, @NotNull Path executionDir, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/pycharm/PythonIssueAgentWorker$setupCommandExecutor$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/pycharm/PythonIssueAgentWorker$setupCommandExecutor$1
/*    */     //   13: astore #6
/*    */     //   15: aload #6
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #6
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new com/intellij/ml/llm/matterhorn/ej/pycharm/PythonIssueAgentWorker$setupCommandExecutor$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/pycharm/PythonIssueAgentWorker;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #6
/*    */     //   53: aload #6
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #5
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #7
/*    */     //   65: aload #6
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 234, 0 -> 96, 1 -> 143, 2 -> 222
/*    */     //   96: aload #5
/*    */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   101: aload_0
/*    */     //   102: aload_1
/*    */     //   103: aload_2
/*    */     //   104: aload_3
/*    */     //   105: aload #6
/*    */     //   107: aload #6
/*    */     //   109: aload_1
/*    */     //   110: putfield L$0 : Ljava/lang/Object;
/*    */     //   113: aload #6
/*    */     //   115: aload_2
/*    */     //   116: putfield L$1 : Ljava/lang/Object;
/*    */     //   119: aload #6
/*    */     //   121: aload_3
/*    */     //   122: putfield L$2 : Ljava/lang/Object;
/*    */     //   125: aload #6
/*    */     //   127: iconst_1
/*    */     //   128: putfield label : I
/*    */     //   131: invokespecial setupCommandExecutor : (Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;Ljava/nio/file/Path;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   134: dup
/*    */     //   135: aload #7
/*    */     //   137: if_acmpne -> 177
/*    */     //   140: aload #7
/*    */     //   142: areturn
/*    */     //   143: aload #6
/*    */     //   145: getfield L$2 : Ljava/lang/Object;
/*    */     //   148: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*    */     //   151: astore_3
/*    */     //   152: aload #6
/*    */     //   154: getfield L$1 : Ljava/lang/Object;
/*    */     //   157: checkcast java/nio/file/Path
/*    */     //   160: astore_2
/*    */     //   161: aload #6
/*    */     //   163: getfield L$0 : Ljava/lang/Object;
/*    */     //   166: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession
/*    */     //   169: astore_1
/*    */     //   170: aload #5
/*    */     //   172: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   175: aload #5
/*    */     //   177: pop
/*    */     //   178: getstatic com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;
/*    */     //   181: aload_1
/*    */     //   182: aload_2
/*    */     //   183: aload_3
/*    */     //   184: aload #6
/*    */     //   186: aload #6
/*    */     //   188: aconst_null
/*    */     //   189: putfield L$0 : Ljava/lang/Object;
/*    */     //   192: aload #6
/*    */     //   194: aconst_null
/*    */     //   195: putfield L$1 : Ljava/lang/Object;
/*    */     //   198: aload #6
/*    */     //   200: aconst_null
/*    */     //   201: putfield L$2 : Ljava/lang/Object;
/*    */     //   204: aload #6
/*    */     //   206: iconst_2
/*    */     //   207: putfield label : I
/*    */     //   210: invokevirtual setupPythonCommandExecutor : (Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;Ljava/nio/file/Path;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   213: dup
/*    */     //   214: aload #7
/*    */     //   216: if_acmpne -> 229
/*    */     //   219: aload #7
/*    */     //   221: areturn
/*    */     //   222: aload #5
/*    */     //   224: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   227: aload #5
/*    */     //   229: pop
/*    */     //   230: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   233: areturn
/*    */     //   234: new java/lang/IllegalStateException
/*    */     //   237: dup
/*    */     //   238: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   240: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   243: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #17	-> 63
/*    */     //   #22	-> 102
/*    */     //   #17	-> 140
/*    */     //   #23	-> 177
/*    */     //   #17	-> 219
/*    */     //   #24	-> 229
/*    */     //   #17	-> 234
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   101	1	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/PythonIssueAgentWorker;
/*    */     //   101	42	1	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*    */     //   170	43	1	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*    */     //   101	42	2	executionDir	Ljava/nio/file/Path;
/*    */     //   161	52	2	executionDir	Ljava/nio/file/Path;
/*    */     //   101	42	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   152	61	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   0	244	4	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	181	6	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	174	5	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "PythonIssueAgentWorker.kt", l = {22, 23}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"executor", "executionDir", "context"}, m = "setupCommandExecutor", c = "com.intellij.ml.llm.matterhorn.ej.pycharm.PythonIssueAgentWorker")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class PythonIssueAgentWorker$setupCommandExecutor$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int label;
/*    */     
/*    */     PythonIssueAgentWorker$setupCommandExecutor$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return PythonIssueAgentWorker.this.setupCommandExecutor(null, null, null, (Continuation<? super Unit>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\pycharm\PythonIssueAgentWorker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */