/*    */ package com.intellij.ml.llm.matterhorn.ej.core;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactType;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.run.ExecutionSession;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.run.docker.ProjectDockerFileExtractor;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskResult;
/*    */ import java.nio.file.Path;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000Z\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\020\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\bf\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H&J\b\020\006\032\0020\007H&J\b\020\b\032\0020\tH&J\026\020\n\032\b\022\004\022\0020\f0\0132\006\020\004\032\0020\005H&J\b\020\r\032\0020\016H&J<\020\023\032\026\022\004\022\0020\025\022\f\022\n\030\0010\026j\004\030\001`\0270\0242\006\020\030\032\0020\0312\b\020\032\032\004\030\0010\0332\006\020\034\032\0020\033H@¢\006\002\020\035R\024\020\017\032\0020\0208VX\004¢\006\006\032\004\b\021\020\022¨\006\036"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupport;", "", "getIssueWorker", "Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker;", "type", "Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;", "getSingleStepWorker", "Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;", "getActionName", "", "getResolveIssueArtifactType", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;", "getProjectDockerFileExtractor", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/ProjectDockerFileExtractor;", "preconditionChecker", "Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker;", "getPreconditionChecker", "()Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker;", "customizeSession", "Lcom/intellij/ml/llm/matterhorn/ej/core/Result;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "session", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;", "envSetupSciptPath", "Ljava/nio/file/Path;", "projectDir", "(Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
/*    */ public interface ElectricJuniorSupport
/*    */ {
/*    */   @NotNull
/*    */   AbstractIssueAgentWorker getIssueWorker(@NotNull IssueType paramIssueType);
/*    */   
/*    */   @NotNull
/*    */   AbstractIssueSingleStepAgentWorker getSingleStepWorker();
/*    */   
/*    */   @NotNull
/*    */   String getActionName();
/*    */   
/*    */   @NotNull
/*    */   ArtifactType<TaskResult> getResolveIssueArtifactType(@NotNull IssueType paramIssueType);
/*    */   
/*    */   @NotNull
/*    */   ProjectDockerFileExtractor getProjectDockerFileExtractor();
/*    */   
/*    */   @NotNull
/*    */   JuniePreconditionChecker getPreconditionChecker();
/*    */   
/*    */   @Nullable
/*    */   Object customizeSession(@NotNull ExecutionSession paramExecutionSession, @Nullable Path paramPath1, @NotNull Path paramPath2, @NotNull Continuation<? super Result<Unit, ? extends Exception>> paramContinuation);
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls
/*    */   {
/*    */     @NotNull
/*    */     public static JuniePreconditionChecker getPreconditionChecker(@NotNull ElectricJuniorSupport $this) {
/* 64 */       return new DefaultJuniePreconditionChecker();
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public static Object customizeSession(@NotNull ElectricJuniorSupport param1ElectricJuniorSupport, @NotNull ExecutionSession session, @Nullable Path envSetupSciptPath, @NotNull Path projectDir, @NotNull Continuation $completion) {
/*    */       // Byte code:
/*    */       //   0: aload #4
/*    */       //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupport$customizeSession$1
/*    */       //   5: ifeq -> 41
/*    */       //   8: aload #4
/*    */       //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupport$customizeSession$1
/*    */       //   13: astore #8
/*    */       //   15: aload #8
/*    */       //   17: getfield label : I
/*    */       //   20: ldc -2147483648
/*    */       //   22: iand
/*    */       //   23: ifeq -> 41
/*    */       //   26: aload #8
/*    */       //   28: dup
/*    */       //   29: getfield label : I
/*    */       //   32: ldc -2147483648
/*    */       //   34: isub
/*    */       //   35: putfield label : I
/*    */       //   38: goto -> 52
/*    */       //   41: new com/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupport$customizeSession$1
/*    */       //   44: dup
/*    */       //   45: aload #4
/*    */       //   47: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*    */       //   50: astore #8
/*    */       //   52: aload #8
/*    */       //   54: getfield result : Ljava/lang/Object;
/*    */       //   57: astore #7
/*    */       //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   62: astore #9
/*    */       //   64: aload #8
/*    */       //   66: getfield label : I
/*    */       //   69: tableswitch default -> 250, 0 -> 92, 1 -> 145
/*    */       //   92: aload #7
/*    */       //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   97: aload_2
/*    */       //   98: ifnonnull -> 112
/*    */       //   101: new com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*    */       //   104: dup
/*    */       //   105: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */       //   108: invokespecial <init> : (Ljava/lang/Object;)V
/*    */       //   111: areturn
/*    */       //   112: nop
/*    */       //   113: aload_1
/*    */       //   114: aload_2
/*    */       //   115: aload_2
/*    */       //   116: <illegal opcode> makeConcatWithConstants : (Ljava/nio/file/Path;Ljava/nio/file/Path;)Ljava/lang/String;
/*    */       //   121: aconst_null
/*    */       //   122: aload_3
/*    */       //   123: aload #8
/*    */       //   125: iconst_2
/*    */       //   126: aconst_null
/*    */       //   127: aload #8
/*    */       //   129: iconst_1
/*    */       //   130: putfield label : I
/*    */       //   133: invokestatic execute$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;Ljava/lang/String;Ljava/lang/Long;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */       //   136: dup
/*    */       //   137: aload #9
/*    */       //   139: if_acmpne -> 153
/*    */       //   142: aload #9
/*    */       //   144: areturn
/*    */       //   145: nop
/*    */       //   146: aload #7
/*    */       //   148: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   151: aload #7
/*    */       //   153: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*    */       //   156: aconst_null
/*    */       //   157: iconst_1
/*    */       //   158: aconst_null
/*    */       //   159: invokestatic unwrap$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/Result;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Object;
/*    */       //   162: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionResult
/*    */       //   165: astore #5
/*    */       //   167: aload #5
/*    */       //   169: invokevirtual getExitCode : ()I
/*    */       //   172: ifne -> 191
/*    */       //   175: new com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*    */       //   178: dup
/*    */       //   179: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */       //   182: invokespecial <init> : (Ljava/lang/Object;)V
/*    */       //   185: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*    */       //   188: goto -> 217
/*    */       //   191: new com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*    */       //   194: dup
/*    */       //   195: aconst_null
/*    */       //   196: aload #5
/*    */       //   198: invokevirtual getExitCode : ()I
/*    */       //   201: aload #5
/*    */       //   203: invokevirtual getOutput : ()Ljava/lang/String;
/*    */       //   206: <illegal opcode> makeConcatWithConstants : (ILjava/lang/String;)Ljava/lang/String;
/*    */       //   211: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   214: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*    */       //   217: astore #5
/*    */       //   219: goto -> 247
/*    */       //   222: astore #6
/*    */       //   224: new com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*    */       //   227: dup
/*    */       //   228: new java/lang/RuntimeException
/*    */       //   231: dup
/*    */       //   232: aload #6
/*    */       //   234: invokespecial <init> : (Ljava/lang/Throwable;)V
/*    */       //   237: ldc 'Error during session customization'
/*    */       //   239: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   242: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*    */       //   245: astore #5
/*    */       //   247: aload #5
/*    */       //   249: areturn
/*    */       //   250: new java/lang/IllegalStateException
/*    */       //   253: dup
/*    */       //   254: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   256: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   259: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #69	-> 62
/*    */       //   #74	-> 97
/*    */       //   #75	-> 101
/*    */       //   #77	-> 112
/*    */       //   #81	-> 113
/*    */       //   #69	-> 142
/*    */       //   #81	-> 153
/*    */       //   #80	-> 165
/*    */       //   #82	-> 167
/*    */       //   #83	-> 175
/*    */       //   #85	-> 191
/*    */       //   #87	-> 222
/*    */       //   #88	-> 224
/*    */       //   #77	-> 249
/*    */       //   #69	-> 250
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   97	4	1	session	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*    */       //   112	24	1	session	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*    */       //   97	4	2	envSetupSciptPath	Ljava/nio/file/Path;
/*    */       //   112	24	2	envSetupSciptPath	Ljava/nio/file/Path;
/*    */       //   97	4	3	projectDir	Ljava/nio/file/Path;
/*    */       //   112	24	3	projectDir	Ljava/nio/file/Path;
/*    */       //   167	8	5	output	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionResult;
/*    */       //   191	26	5	output	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionResult;
/*    */       //   224	23	6	e	Ljava/lang/Throwable;
/*    */       //   0	260	4	$completion	Lkotlin/coroutines/Continuation;
/*    */       //   52	198	8	$continuation	Lkotlin/coroutines/Continuation;
/*    */       //   59	191	7	$result	Ljava/lang/Object;
/*    */       // Exception table:
/*    */       //   from	to	target	type
/*    */       //   112	136	222	java/lang/Throwable
/*    */       //   145	219	222	java/lang/Throwable
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\ElectricJuniorSupport.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */