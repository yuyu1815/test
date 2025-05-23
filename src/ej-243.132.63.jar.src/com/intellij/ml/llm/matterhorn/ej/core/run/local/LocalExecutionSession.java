/*    */ package com.intellij.ml.llm.matterhorn.ej.core.run.local;
/*    */ import com.intellij.ml.llm.matterhorn.ShellExecutor;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.run.ExecutionSession;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\t\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\030\0002\0020\001B\021\022\b\020\002\032\004\030\0010\003¢\006\004\b\004\020\005J4\020\006\032\016\022\004\022\0020\b\022\004\022\0020\t0\0072\006\020\n\032\0020\0132\b\020\f\032\004\030\0010\r2\006\020\016\032\0020\017H@¢\006\002\020\020J\016\020\021\032\0020\022H@¢\006\002\020\023R\020\020\002\032\004\030\0010\003X\004¢\006\002\n\000¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/run/local/LocalExecutionSession;", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;", "shellExecutor", "Lcom/intellij/ml/llm/matterhorn/ShellExecutor;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ShellExecutor;)V", "execute", "Lcom/intellij/ml/llm/matterhorn/ej/core/Result;", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionResult;", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionError;", "command", "", "timeoutMillis", "", "workDir", "Ljava/nio/file/Path;", "(Ljava/lang/String;Ljava/lang/Long;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
/*    */ public final class LocalExecutionSession implements ExecutionSession {
/*    */   public LocalExecutionSession(@Nullable ShellExecutor shellExecutor) {
/* 14 */     this.shellExecutor = shellExecutor;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   private final ShellExecutor shellExecutor;
/*    */   
/*    */   @Nullable
/*    */   public Object execute(@NotNull String command, @Nullable Long paramLong, @NotNull Path workDir, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/run/local/LocalExecutionSession$execute$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/local/LocalExecutionSession$execute$1
/*    */     //   13: astore #9
/*    */     //   15: aload #9
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #9
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/run/local/LocalExecutionSession$execute$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/run/local/LocalExecutionSession;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #9
/*    */     //   53: aload #9
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #8
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #10
/*    */     //   65: aload #9
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 394, 0 -> 100, 1 -> 193, 2 -> 258, 3 -> 329
/*    */     //   100: aload #8
/*    */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   105: aload_0
/*    */     //   106: getfield shellExecutor : Lcom/intellij/ml/llm/matterhorn/ShellExecutor;
/*    */     //   109: ifnonnull -> 145
/*    */     //   112: new com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*    */     //   115: dup
/*    */     //   116: new com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionResult
/*    */     //   119: dup
/*    */     //   120: ldc ''
/*    */     //   122: ldc ''
/*    */     //   124: iconst_0
/*    */     //   125: anewarray java/lang/String
/*    */     //   128: invokestatic get : (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
/*    */     //   131: dup
/*    */     //   132: ldc 'get(...)'
/*    */     //   134: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   137: iconst_0
/*    */     //   138: invokespecial <init> : (Ljava/lang/String;Ljava/nio/file/Path;I)V
/*    */     //   141: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   144: areturn
/*    */     //   145: getstatic com/intellij/ml/llm/matterhorn/ShellExecutor.Companion : Lcom/intellij/ml/llm/matterhorn/ShellExecutor$Companion;
/*    */     //   148: aload_0
/*    */     //   149: getfield shellExecutor : Lcom/intellij/ml/llm/matterhorn/ShellExecutor;
/*    */     //   152: aload_3
/*    */     //   153: invokestatic safePathForBash : (Ljava/nio/file/Path;)Ljava/lang/String;
/*    */     //   156: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   161: aload #9
/*    */     //   163: aload #9
/*    */     //   165: aload_0
/*    */     //   166: putfield L$0 : Ljava/lang/Object;
/*    */     //   169: aload #9
/*    */     //   171: aload_1
/*    */     //   172: putfield L$1 : Ljava/lang/Object;
/*    */     //   175: aload #9
/*    */     //   177: iconst_1
/*    */     //   178: putfield label : I
/*    */     //   181: invokevirtual executeAndControlExitCode : (Lcom/intellij/ml/llm/matterhorn/ShellExecutor;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   184: dup
/*    */     //   185: aload #10
/*    */     //   187: if_acmpne -> 218
/*    */     //   190: aload #10
/*    */     //   192: areturn
/*    */     //   193: aload #9
/*    */     //   195: getfield L$1 : Ljava/lang/Object;
/*    */     //   198: checkcast java/lang/String
/*    */     //   201: astore_1
/*    */     //   202: aload #9
/*    */     //   204: getfield L$0 : Ljava/lang/Object;
/*    */     //   207: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/local/LocalExecutionSession
/*    */     //   210: astore_0
/*    */     //   211: aload #8
/*    */     //   213: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   216: aload #8
/*    */     //   218: pop
/*    */     //   219: aload_0
/*    */     //   220: getfield shellExecutor : Lcom/intellij/ml/llm/matterhorn/ShellExecutor;
/*    */     //   223: aload_1
/*    */     //   224: aload #9
/*    */     //   226: aload #9
/*    */     //   228: aload_0
/*    */     //   229: putfield L$0 : Ljava/lang/Object;
/*    */     //   232: aload #9
/*    */     //   234: aconst_null
/*    */     //   235: putfield L$1 : Ljava/lang/Object;
/*    */     //   238: aload #9
/*    */     //   240: iconst_2
/*    */     //   241: putfield label : I
/*    */     //   244: invokeinterface executeCommand : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   249: dup
/*    */     //   250: aload #10
/*    */     //   252: if_acmpne -> 274
/*    */     //   255: aload #10
/*    */     //   257: areturn
/*    */     //   258: aload #9
/*    */     //   260: getfield L$0 : Ljava/lang/Object;
/*    */     //   263: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/local/LocalExecutionSession
/*    */     //   266: astore_0
/*    */     //   267: aload #8
/*    */     //   269: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   272: aload #8
/*    */     //   274: checkcast com/intellij/ml/llm/matterhorn/ShellExecutor$CommandResult
/*    */     //   277: astore #5
/*    */     //   279: getstatic com/intellij/openapi/util/SystemInfo.isWindows : Z
/*    */     //   282: ifeq -> 290
/*    */     //   285: ldc '($pwd).path'
/*    */     //   287: goto -> 292
/*    */     //   290: ldc 'pwd'
/*    */     //   292: astore #6
/*    */     //   294: aload_0
/*    */     //   295: getfield shellExecutor : Lcom/intellij/ml/llm/matterhorn/ShellExecutor;
/*    */     //   298: aload #6
/*    */     //   300: aload #9
/*    */     //   302: aload #9
/*    */     //   304: aload #5
/*    */     //   306: putfield L$0 : Ljava/lang/Object;
/*    */     //   309: aload #9
/*    */     //   311: iconst_3
/*    */     //   312: putfield label : I
/*    */     //   315: invokeinterface executeCommand : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   320: dup
/*    */     //   321: aload #10
/*    */     //   323: if_acmpne -> 346
/*    */     //   326: aload #10
/*    */     //   328: areturn
/*    */     //   329: aload #9
/*    */     //   331: getfield L$0 : Ljava/lang/Object;
/*    */     //   334: checkcast com/intellij/ml/llm/matterhorn/ShellExecutor$CommandResult
/*    */     //   337: astore #5
/*    */     //   339: aload #8
/*    */     //   341: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   344: aload #8
/*    */     //   346: checkcast com/intellij/ml/llm/matterhorn/ShellExecutor$CommandResult
/*    */     //   349: invokevirtual getOutput : ()Ljava/lang/String;
/*    */     //   352: astore #7
/*    */     //   354: new com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*    */     //   357: dup
/*    */     //   358: new com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionResult
/*    */     //   361: dup
/*    */     //   362: aload #5
/*    */     //   364: invokevirtual getOutput : ()Ljava/lang/String;
/*    */     //   367: aload #7
/*    */     //   369: iconst_0
/*    */     //   370: anewarray java/lang/String
/*    */     //   373: invokestatic get : (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
/*    */     //   376: dup
/*    */     //   377: ldc 'get(...)'
/*    */     //   379: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   382: aload #5
/*    */     //   384: invokevirtual getExitStatus : ()I
/*    */     //   387: invokespecial <init> : (Ljava/lang/String;Ljava/nio/file/Path;I)V
/*    */     //   390: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   393: areturn
/*    */     //   394: new java/lang/IllegalStateException
/*    */     //   397: dup
/*    */     //   398: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   400: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   403: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 63
/*    */     //   #16	-> 105
/*    */     //   #17	-> 112
/*    */     //   #19	-> 145
/*    */     //   #15	-> 190
/*    */     //   #20	-> 218
/*    */     //   #15	-> 255
/*    */     //   #22	-> 279
/*    */     //   #23	-> 294
/*    */     //   #15	-> 326
/*    */     //   #23	-> 346
/*    */     //   #24	-> 354
/*    */     //   #15	-> 394
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   105	88	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/run/local/LocalExecutionSession;
/*    */     //   211	47	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/run/local/LocalExecutionSession;
/*    */     //   267	53	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/run/local/LocalExecutionSession;
/*    */     //   105	88	1	command	Ljava/lang/String;
/*    */     //   202	47	1	command	Ljava/lang/String;
/*    */     //   105	7	3	workDir	Ljava/nio/file/Path;
/*    */     //   145	39	3	workDir	Ljava/nio/file/Path;
/*    */     //   279	50	5	result	Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CommandResult;
/*    */     //   339	55	5	result	Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CommandResult;
/*    */     //   294	26	6	pwdCommand	Ljava/lang/String;
/*    */     //   354	40	7	path	Ljava/lang/String;
/*    */     //   0	404	4	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	341	9	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	334	8	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object close(@NotNull Continuation $completion) {
/* 28 */     if (this.shellExecutor != null) { if (this.shellExecutor.close($completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return this.shellExecutor.close($completion);  this.shellExecutor.close($completion); return Unit.INSTANCE; }
/* 29 */      return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "LocalExecutionSession.kt", l = {19, 20, 23}, i = {0, 0, 1, 2}, s = {"L$0", "L$1", "L$0", "L$0"}, n = {"this", "command", "this", "result"}, m = "execute", c = "com.intellij.ml.llm.matterhorn.ej.core.run.local.LocalExecutionSession")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class LocalExecutionSession$execute$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     LocalExecutionSession$execute$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return LocalExecutionSession.this.execute(null, null, null, (Continuation<? super Result<ExecutionResult, ? extends ExecutionError>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\run\local\LocalExecutionSession.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */