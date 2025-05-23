/*    */ package com.intellij.ml.llm.matterhorn.ej.webstorm;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactType;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueAgentWorker;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentResponse;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.run.ExecutionSession;
/*    */ import java.nio.file.Path;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J&\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H@¢\006\002\020\fJ\016\020\r\032\b\022\004\022\0020\0170\016H\026¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/webstorm/WebStormIssueAgentWorker;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker;", "<init>", "()V", "setupCommandExecutor", "", "executor", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;", "executionDir", "Ljava/nio/file/Path;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;Ljava/nio/file/Path;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSingleStepArtifactType", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentResponse;", "ej-webstorm"})
/*    */ public final class WebStormIssueAgentWorker
/*    */   extends AbstractIssueAgentWorker {
/*    */   @NotNull
/*    */   public ArtifactType<AgentResponse> getSingleStepArtifactType() {
/* 22 */     return WebStormAgentArtifactTypes.INSTANCE.getAgentSingleStepPlan();
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   protected Object setupCommandExecutor(@NotNull ExecutionSession executor, @NotNull Path executionDir, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/webstorm/WebStormIssueAgentWorker$setupCommandExecutor$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/webstorm/WebStormIssueAgentWorker$setupCommandExecutor$1
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
/*    */     //   41: new com/intellij/ml/llm/matterhorn/ej/webstorm/WebStormIssueAgentWorker$setupCommandExecutor$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/webstorm/WebStormIssueAgentWorker;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #6
/*    */     //   53: aload #6
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #5
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #7
/*    */     //   65: aload #6
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 212, 0 -> 96, 1 -> 137, 2 -> 200
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
/*    */     //   121: iconst_1
/*    */     //   122: putfield label : I
/*    */     //   125: invokespecial setupCommandExecutor : (Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;Ljava/nio/file/Path;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   128: dup
/*    */     //   129: aload #7
/*    */     //   131: if_acmpne -> 162
/*    */     //   134: aload #7
/*    */     //   136: areturn
/*    */     //   137: aload #6
/*    */     //   139: getfield L$1 : Ljava/lang/Object;
/*    */     //   142: checkcast java/nio/file/Path
/*    */     //   145: astore_2
/*    */     //   146: aload #6
/*    */     //   148: getfield L$0 : Ljava/lang/Object;
/*    */     //   151: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession
/*    */     //   154: astore_1
/*    */     //   155: aload #5
/*    */     //   157: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   160: aload #5
/*    */     //   162: pop
/*    */     //   163: getstatic com/intellij/ml/llm/matterhorn/ej/webstorm/CommandExecutorUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/webstorm/CommandExecutorUtils;
/*    */     //   166: aload_1
/*    */     //   167: aload_2
/*    */     //   168: aload #6
/*    */     //   170: aload #6
/*    */     //   172: aconst_null
/*    */     //   173: putfield L$0 : Ljava/lang/Object;
/*    */     //   176: aload #6
/*    */     //   178: aconst_null
/*    */     //   179: putfield L$1 : Ljava/lang/Object;
/*    */     //   182: aload #6
/*    */     //   184: iconst_2
/*    */     //   185: putfield label : I
/*    */     //   188: invokevirtual setupWebStormCommandExecutor : (Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   191: dup
/*    */     //   192: aload #7
/*    */     //   194: if_acmpne -> 207
/*    */     //   197: aload #7
/*    */     //   199: areturn
/*    */     //   200: aload #5
/*    */     //   202: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   205: aload #5
/*    */     //   207: pop
/*    */     //   208: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   211: areturn
/*    */     //   212: new java/lang/IllegalStateException
/*    */     //   215: dup
/*    */     //   216: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   218: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   221: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #12	-> 63
/*    */     //   #17	-> 102
/*    */     //   #12	-> 134
/*    */     //   #18	-> 162
/*    */     //   #12	-> 197
/*    */     //   #19	-> 207
/*    */     //   #12	-> 212
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   101	1	0	this	Lcom/intellij/ml/llm/matterhorn/ej/webstorm/WebStormIssueAgentWorker;
/*    */     //   101	36	1	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*    */     //   155	36	1	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*    */     //   101	36	2	executionDir	Ljava/nio/file/Path;
/*    */     //   146	45	2	executionDir	Ljava/nio/file/Path;
/*    */     //   101	27	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   0	222	4	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	159	6	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	152	5	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "WebStormIssueAgentWorker.kt", l = {17, 18}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"executor", "executionDir"}, m = "setupCommandExecutor", c = "com.intellij.ml.llm.matterhorn.ej.webstorm.WebStormIssueAgentWorker")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class WebStormIssueAgentWorker$setupCommandExecutor$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     WebStormIssueAgentWorker$setupCommandExecutor$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return WebStormIssueAgentWorker.this.setupCommandExecutor(null, null, null, (Continuation<? super Unit>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\webstorm\WebStormIssueAgentWorker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */