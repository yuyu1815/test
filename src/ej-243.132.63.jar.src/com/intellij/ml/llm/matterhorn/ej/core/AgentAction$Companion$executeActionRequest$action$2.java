/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.run.ExecutionSession;
/*     */ import java.nio.file.Path;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
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
/*     */ @DebugMetadata(f = "AgentActions.kt", l = {130, 136, 137, 147}, i = {1, 2}, s = {"L$0", "L$0"}, n = {"commandExecutionResult", "commandExecutionResult"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.AgentAction$Companion$executeActionRequest$action$2")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\016\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""})
/*     */ final class AgentAction$Companion$executeActionRequest$action$2
/*     */   extends SuspendLambda
/*     */   implements Function1<Continuation<? super String>, Object>
/*     */ {
/*     */   Object L$0;
/*     */   int label;
/*     */   
/*     */   AgentAction$Companion$executeActionRequest$action$2(ExecutionSession $executor, String $command, Path $workDir, ExecutionAgentContext $context, Integer $maxOutputLineLength, Integer $maxOutputLines, Continuation $completion) {
/*     */     super(1, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     // Byte code:
/*     */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   3: astore #5
/*     */     //   5: aload_0
/*     */     //   6: getfield label : I
/*     */     //   9: tableswitch default -> 312, 0 -> 44, 1 -> 84, 2 -> 153, 3 -> 202, 4 -> 306
/*     */     //   44: aload_1
/*     */     //   45: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   48: aload_0
/*     */     //   49: getfield $executor : Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*     */     //   52: aload_0
/*     */     //   53: getfield $command : Ljava/lang/String;
/*     */     //   56: aconst_null
/*     */     //   57: aload_0
/*     */     //   58: getfield $workDir : Ljava/nio/file/Path;
/*     */     //   61: aload_0
/*     */     //   62: checkcast kotlin/coroutines/Continuation
/*     */     //   65: iconst_2
/*     */     //   66: aconst_null
/*     */     //   67: aload_0
/*     */     //   68: iconst_1
/*     */     //   69: putfield label : I
/*     */     //   72: invokestatic execute$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;Ljava/lang/String;Ljava/lang/Long;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   75: dup
/*     */     //   76: aload #5
/*     */     //   78: if_acmpne -> 89
/*     */     //   81: aload #5
/*     */     //   83: areturn
/*     */     //   84: aload_1
/*     */     //   85: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   88: aload_1
/*     */     //   89: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*     */     //   92: aconst_null
/*     */     //   93: iconst_1
/*     */     //   94: aconst_null
/*     */     //   95: invokestatic unwrap$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/Result;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   98: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionResult
/*     */     //   101: astore_2
/*     */     //   102: getstatic com/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion.$$INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion;
/*     */     //   105: aload_0
/*     */     //   106: getfield $command : Ljava/lang/String;
/*     */     //   109: invokevirtual isReadonlyBashCommand : (Ljava/lang/String;)Z
/*     */     //   112: ifne -> 216
/*     */     //   115: ldc2_w 1000
/*     */     //   118: invokestatic ofMillis : (J)Ljava/time/Duration;
/*     */     //   121: dup
/*     */     //   122: ldc 'ofMillis(...)'
/*     */     //   124: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   127: aload_0
/*     */     //   128: checkcast kotlin/coroutines/Continuation
/*     */     //   131: aload_0
/*     */     //   132: aload_2
/*     */     //   133: putfield L$0 : Ljava/lang/Object;
/*     */     //   136: aload_0
/*     */     //   137: iconst_2
/*     */     //   138: putfield label : I
/*     */     //   141: invokestatic delay : (Ljava/time/Duration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   144: dup
/*     */     //   145: aload #5
/*     */     //   147: if_acmpne -> 166
/*     */     //   150: aload #5
/*     */     //   152: areturn
/*     */     //   153: aload_0
/*     */     //   154: getfield L$0 : Ljava/lang/Object;
/*     */     //   157: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionResult
/*     */     //   160: astore_2
/*     */     //   161: aload_1
/*     */     //   162: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   165: aload_1
/*     */     //   166: pop
/*     */     //   167: aload_0
/*     */     //   168: getfield $context : Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   171: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;)Lkotlin/jvm/functions/Function0;
/*     */     //   176: aload_0
/*     */     //   177: checkcast kotlin/coroutines/Continuation
/*     */     //   180: aload_0
/*     */     //   181: aload_2
/*     */     //   182: putfield L$0 : Ljava/lang/Object;
/*     */     //   185: aload_0
/*     */     //   186: iconst_3
/*     */     //   187: putfield label : I
/*     */     //   190: invokestatic edtWriteAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   193: dup
/*     */     //   194: aload #5
/*     */     //   196: if_acmpne -> 215
/*     */     //   199: aload #5
/*     */     //   201: areturn
/*     */     //   202: aload_0
/*     */     //   203: getfield L$0 : Ljava/lang/Object;
/*     */     //   206: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionResult
/*     */     //   209: astore_2
/*     */     //   210: aload_1
/*     */     //   211: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   214: aload_1
/*     */     //   215: pop
/*     */     //   216: aload_2
/*     */     //   217: invokevirtual getPathAfterExecution : ()Ljava/nio/file/Path;
/*     */     //   220: astore_3
/*     */     //   221: aload_3
/*     */     //   222: iconst_1
/*     */     //   223: invokestatic findFile : (Ljava/nio/file/Path;Z)Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   226: astore #4
/*     */     //   228: aload #4
/*     */     //   230: ifnull -> 256
/*     */     //   233: aload_0
/*     */     //   234: getfield $context : Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   237: invokeinterface getDisableDirChange : ()Z
/*     */     //   242: ifne -> 256
/*     */     //   245: aload_0
/*     */     //   246: getfield $context : Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   249: aload #4
/*     */     //   251: invokeinterface setCurrentDir : (Lcom/intellij/openapi/vfs/VirtualFile;)V
/*     */     //   256: getstatic com/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion.$$INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion;
/*     */     //   259: aload_2
/*     */     //   260: invokevirtual getOutput : ()Ljava/lang/String;
/*     */     //   263: aload_0
/*     */     //   264: getfield $maxOutputLineLength : Ljava/lang/Integer;
/*     */     //   267: aload_0
/*     */     //   268: getfield $maxOutputLines : Ljava/lang/Integer;
/*     */     //   271: aload_0
/*     */     //   272: getfield $context : Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   275: invokeinterface getProjectDir : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   280: aload_0
/*     */     //   281: checkcast kotlin/coroutines/Continuation
/*     */     //   284: aload_0
/*     */     //   285: aconst_null
/*     */     //   286: putfield L$0 : Ljava/lang/Object;
/*     */     //   289: aload_0
/*     */     //   290: iconst_4
/*     */     //   291: putfield label : I
/*     */     //   294: invokevirtual truncateLongOutput$ej_core : (Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/intellij/openapi/vfs/VirtualFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   297: dup
/*     */     //   298: aload #5
/*     */     //   300: if_acmpne -> 311
/*     */     //   303: aload #5
/*     */     //   305: areturn
/*     */     //   306: aload_1
/*     */     //   307: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   310: aload_1
/*     */     //   311: areturn
/*     */     //   312: new java/lang/IllegalStateException
/*     */     //   315: dup
/*     */     //   316: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   318: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   321: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #129	-> 3
/*     */     //   #130	-> 48
/*     */     //   #129	-> 81
/*     */     //   #131	-> 92
/*     */     //   #130	-> 101
/*     */     //   #135	-> 102
/*     */     //   #136	-> 115
/*     */     //   #129	-> 150
/*     */     //   #137	-> 166
/*     */     //   #129	-> 199
/*     */     //   #142	-> 215
/*     */     //   #143	-> 221
/*     */     //   #144	-> 228
/*     */     //   #145	-> 245
/*     */     //   #147	-> 256
/*     */     //   #129	-> 303
/*     */     //   #147	-> 311
/*     */     //   #129	-> 312
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   102	51	2	commandExecutionResult	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionResult;
/*     */     //   161	41	2	commandExecutionResult	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionResult;
/*     */     //   210	87	2	commandExecutionResult	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionResult;
/*     */     //   221	7	3	currentDirPath	Ljava/nio/file/Path;
/*     */     //   228	28	4	currentDirVFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   0	322	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion$executeActionRequest$action$2;
/*     */     //   48	264	1	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Continuation<? super AgentAction$Companion$executeActionRequest$action$2> $completion) {
/*     */     return (Continuation<Unit>)new AgentAction$Companion$executeActionRequest$action$2(this.$executor, this.$command, this.$workDir, this.$context, this.$maxOutputLineLength, this.$maxOutputLines, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(Continuation<?> p1) {
/*     */     return ((AgentAction$Companion$executeActionRequest$action$2)create(p1)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */   
/*     */   private static final Unit invokeSuspend$lambda$0(ExecutionAgentContext $context) {
/* 138 */     $context.getProjectDir().refresh(false, true);
/* 139 */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AgentAction$Companion$executeActionRequest$action$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */