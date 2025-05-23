/*    */ package com.intellij.ml.llm.matterhorn.ej.webstorm;
/*    */ import com.intellij.openapi.diagnostic.Logger;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\036\020\n\032\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\017H@¢\006\002\020\020R\033\020\004\032\0020\0058BX\002¢\006\f\n\004\b\b\020\t\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/webstorm/CommandExecutorUtils;", "", "<init>", "()V", "LOG", "Lcom/intellij/openapi/diagnostic/Logger;", "getLOG", "()Lcom/intellij/openapi/diagnostic/Logger;", "LOG$delegate", "Lkotlin/Lazy;", "setupWebStormCommandExecutor", "", "executor", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;", "executionDir", "Ljava/nio/file/Path;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-webstorm"})
/*    */ @SourceDebugExtension({"SMAP\nCommandExecutorUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandExecutorUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/webstorm/CommandExecutorUtils\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n14#2:30\n1#3:31\n*S KotlinDebug\n*F\n+ 1 CommandExecutorUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/webstorm/CommandExecutorUtils\n*L\n11#1:30\n*E\n"})
/*    */ public final class CommandExecutorUtils {
/*    */   @NotNull
/* 10 */   public static final CommandExecutorUtils INSTANCE = new CommandExecutorUtils(); @NotNull private static final Lazy LOG$delegate = LazyKt.lazy(CommandExecutorUtils::LOG_delegate$lambda$1); private final Logger getLOG() { Lazy lazy = LOG$delegate; return (Logger)lazy.getValue(); } private static final Logger LOG_delegate$lambda$1() {
/* 11 */     int $i$f$logger = 0;
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
/* 30 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(CommandExecutorUtils.class), "getInstance(...)"); Logger logger1 = Logger.getInstance(CommandExecutorUtils.class); Logger it = logger1;
/* 31 */     int $i$a$-also-CommandExecutorUtils$LOG$2$1 = 0;
/*    */     it.setLevel(LogLevel.ALL);
/*    */     return logger1;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object setupWebStormCommandExecutor(@NotNull ExecutionSession executor, @NotNull Path executionDir, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/webstorm/CommandExecutorUtils$setupWebStormCommandExecutor$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/webstorm/CommandExecutorUtils$setupWebStormCommandExecutor$1
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
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/webstorm/CommandExecutorUtils$setupWebStormCommandExecutor$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/webstorm/CommandExecutorUtils;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #6
/*    */     //   50: aload #6
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #5
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #7
/*    */     //   62: aload #6
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 572, 0 -> 104, 1 -> 154, 2 -> 251, 3 -> 331, 4 -> 411, 5 -> 521
/*    */     //   104: aload #5
/*    */     //   106: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   109: aload_1
/*    */     //   110: ldc 'export NO_COLOR=1'
/*    */     //   112: aconst_null
/*    */     //   113: aload_2
/*    */     //   114: aload #6
/*    */     //   116: iconst_2
/*    */     //   117: aconst_null
/*    */     //   118: aload #6
/*    */     //   120: aload_0
/*    */     //   121: putfield L$0 : Ljava/lang/Object;
/*    */     //   124: aload #6
/*    */     //   126: aload_1
/*    */     //   127: putfield L$1 : Ljava/lang/Object;
/*    */     //   130: aload #6
/*    */     //   132: aload_2
/*    */     //   133: putfield L$2 : Ljava/lang/Object;
/*    */     //   136: aload #6
/*    */     //   138: iconst_1
/*    */     //   139: putfield label : I
/*    */     //   142: invokestatic execute$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;Ljava/lang/String;Ljava/lang/Long;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   145: dup
/*    */     //   146: aload #7
/*    */     //   148: if_acmpne -> 188
/*    */     //   151: aload #7
/*    */     //   153: areturn
/*    */     //   154: aload #6
/*    */     //   156: getfield L$2 : Ljava/lang/Object;
/*    */     //   159: checkcast java/nio/file/Path
/*    */     //   162: astore_2
/*    */     //   163: aload #6
/*    */     //   165: getfield L$1 : Ljava/lang/Object;
/*    */     //   168: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession
/*    */     //   171: astore_1
/*    */     //   172: aload #6
/*    */     //   174: getfield L$0 : Ljava/lang/Object;
/*    */     //   177: checkcast com/intellij/ml/llm/matterhorn/ej/webstorm/CommandExecutorUtils
/*    */     //   180: astore_0
/*    */     //   181: aload #5
/*    */     //   183: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   186: aload #5
/*    */     //   188: pop
/*    */     //   189: ldc 'TEAMCITY_VERSION'
/*    */     //   191: invokestatic getenv : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   194: ifnull -> 568
/*    */     //   197: aload_0
/*    */     //   198: invokespecial getLOG : ()Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   201: ldc 'TeamCity detected, setting up TeamCity environment'
/*    */     //   203: invokevirtual debug : (Ljava/lang/String;)V
/*    */     //   206: aload_1
/*    */     //   207: ldc 'source ~/.bashrc'
/*    */     //   209: aconst_null
/*    */     //   210: aload_2
/*    */     //   211: aload #6
/*    */     //   213: iconst_2
/*    */     //   214: aconst_null
/*    */     //   215: aload #6
/*    */     //   217: aload_0
/*    */     //   218: putfield L$0 : Ljava/lang/Object;
/*    */     //   221: aload #6
/*    */     //   223: aload_1
/*    */     //   224: putfield L$1 : Ljava/lang/Object;
/*    */     //   227: aload #6
/*    */     //   229: aload_2
/*    */     //   230: putfield L$2 : Ljava/lang/Object;
/*    */     //   233: aload #6
/*    */     //   235: iconst_2
/*    */     //   236: putfield label : I
/*    */     //   239: invokestatic execute$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;Ljava/lang/String;Ljava/lang/Long;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   242: dup
/*    */     //   243: aload #7
/*    */     //   245: if_acmpne -> 285
/*    */     //   248: aload #7
/*    */     //   250: areturn
/*    */     //   251: aload #6
/*    */     //   253: getfield L$2 : Ljava/lang/Object;
/*    */     //   256: checkcast java/nio/file/Path
/*    */     //   259: astore_2
/*    */     //   260: aload #6
/*    */     //   262: getfield L$1 : Ljava/lang/Object;
/*    */     //   265: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession
/*    */     //   268: astore_1
/*    */     //   269: aload #6
/*    */     //   271: getfield L$0 : Ljava/lang/Object;
/*    */     //   274: checkcast com/intellij/ml/llm/matterhorn/ej/webstorm/CommandExecutorUtils
/*    */     //   277: astore_0
/*    */     //   278: aload #5
/*    */     //   280: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   283: aload #5
/*    */     //   285: pop
/*    */     //   286: aload_1
/*    */     //   287: ldc 'export PATH="$(npm config get prefix)/bin:$PATH"'
/*    */     //   289: aconst_null
/*    */     //   290: aload_2
/*    */     //   291: aload #6
/*    */     //   293: iconst_2
/*    */     //   294: aconst_null
/*    */     //   295: aload #6
/*    */     //   297: aload_0
/*    */     //   298: putfield L$0 : Ljava/lang/Object;
/*    */     //   301: aload #6
/*    */     //   303: aload_1
/*    */     //   304: putfield L$1 : Ljava/lang/Object;
/*    */     //   307: aload #6
/*    */     //   309: aload_2
/*    */     //   310: putfield L$2 : Ljava/lang/Object;
/*    */     //   313: aload #6
/*    */     //   315: iconst_3
/*    */     //   316: putfield label : I
/*    */     //   319: invokestatic execute$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;Ljava/lang/String;Ljava/lang/Long;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   322: dup
/*    */     //   323: aload #7
/*    */     //   325: if_acmpne -> 365
/*    */     //   328: aload #7
/*    */     //   330: areturn
/*    */     //   331: aload #6
/*    */     //   333: getfield L$2 : Ljava/lang/Object;
/*    */     //   336: checkcast java/nio/file/Path
/*    */     //   339: astore_2
/*    */     //   340: aload #6
/*    */     //   342: getfield L$1 : Ljava/lang/Object;
/*    */     //   345: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession
/*    */     //   348: astore_1
/*    */     //   349: aload #6
/*    */     //   351: getfield L$0 : Ljava/lang/Object;
/*    */     //   354: checkcast com/intellij/ml/llm/matterhorn/ej/webstorm/CommandExecutorUtils
/*    */     //   357: astore_0
/*    */     //   358: aload #5
/*    */     //   360: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   363: aload #5
/*    */     //   365: pop
/*    */     //   366: aload_1
/*    */     //   367: ldc 'echo $PATH'
/*    */     //   369: aconst_null
/*    */     //   370: aload_2
/*    */     //   371: aload #6
/*    */     //   373: iconst_2
/*    */     //   374: aconst_null
/*    */     //   375: aload #6
/*    */     //   377: aload_0
/*    */     //   378: putfield L$0 : Ljava/lang/Object;
/*    */     //   381: aload #6
/*    */     //   383: aload_1
/*    */     //   384: putfield L$1 : Ljava/lang/Object;
/*    */     //   387: aload #6
/*    */     //   389: aload_2
/*    */     //   390: putfield L$2 : Ljava/lang/Object;
/*    */     //   393: aload #6
/*    */     //   395: iconst_4
/*    */     //   396: putfield label : I
/*    */     //   399: invokestatic execute$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;Ljava/lang/String;Ljava/lang/Long;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   402: dup
/*    */     //   403: aload #7
/*    */     //   405: if_acmpne -> 445
/*    */     //   408: aload #7
/*    */     //   410: areturn
/*    */     //   411: aload #6
/*    */     //   413: getfield L$2 : Ljava/lang/Object;
/*    */     //   416: checkcast java/nio/file/Path
/*    */     //   419: astore_2
/*    */     //   420: aload #6
/*    */     //   422: getfield L$1 : Ljava/lang/Object;
/*    */     //   425: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession
/*    */     //   428: astore_1
/*    */     //   429: aload #6
/*    */     //   431: getfield L$0 : Ljava/lang/Object;
/*    */     //   434: checkcast com/intellij/ml/llm/matterhorn/ej/webstorm/CommandExecutorUtils
/*    */     //   437: astore_0
/*    */     //   438: aload #5
/*    */     //   440: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   443: aload #5
/*    */     //   445: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*    */     //   448: aconst_null
/*    */     //   449: iconst_1
/*    */     //   450: aconst_null
/*    */     //   451: invokestatic unwrap$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/Result;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   454: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionResult
/*    */     //   457: astore #4
/*    */     //   459: aload_0
/*    */     //   460: invokespecial getLOG : ()Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   463: aload #4
/*    */     //   465: invokevirtual getOutput : ()Ljava/lang/String;
/*    */     //   468: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   473: invokevirtual debug : (Ljava/lang/String;)V
/*    */     //   476: aload_1
/*    */     //   477: ldc 'node -v'
/*    */     //   479: aconst_null
/*    */     //   480: aload_2
/*    */     //   481: aload #6
/*    */     //   483: iconst_2
/*    */     //   484: aconst_null
/*    */     //   485: aload #6
/*    */     //   487: aload_0
/*    */     //   488: putfield L$0 : Ljava/lang/Object;
/*    */     //   491: aload #6
/*    */     //   493: aconst_null
/*    */     //   494: putfield L$1 : Ljava/lang/Object;
/*    */     //   497: aload #6
/*    */     //   499: aconst_null
/*    */     //   500: putfield L$2 : Ljava/lang/Object;
/*    */     //   503: aload #6
/*    */     //   505: iconst_5
/*    */     //   506: putfield label : I
/*    */     //   509: invokestatic execute$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;Ljava/lang/String;Ljava/lang/Long;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   512: dup
/*    */     //   513: aload #7
/*    */     //   515: if_acmpne -> 537
/*    */     //   518: aload #7
/*    */     //   520: areturn
/*    */     //   521: aload #6
/*    */     //   523: getfield L$0 : Ljava/lang/Object;
/*    */     //   526: checkcast com/intellij/ml/llm/matterhorn/ej/webstorm/CommandExecutorUtils
/*    */     //   529: astore_0
/*    */     //   530: aload #5
/*    */     //   532: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   535: aload #5
/*    */     //   537: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*    */     //   540: aconst_null
/*    */     //   541: iconst_1
/*    */     //   542: aconst_null
/*    */     //   543: invokestatic unwrap$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/Result;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   546: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionResult
/*    */     //   549: astore #4
/*    */     //   551: aload_0
/*    */     //   552: invokespecial getLOG : ()Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   555: aload #4
/*    */     //   557: invokevirtual getOutput : ()Ljava/lang/String;
/*    */     //   560: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   565: invokevirtual debug : (Ljava/lang/String;)V
/*    */     //   568: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   571: areturn
/*    */     //   572: new java/lang/IllegalStateException
/*    */     //   575: dup
/*    */     //   576: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   578: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   581: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #14	-> 60
/*    */     //   #15	-> 109
/*    */     //   #14	-> 151
/*    */     //   #17	-> 188
/*    */     //   #18	-> 197
/*    */     //   #19	-> 206
/*    */     //   #14	-> 248
/*    */     //   #20	-> 285
/*    */     //   #14	-> 328
/*    */     //   #22	-> 365
/*    */     //   #14	-> 408
/*    */     //   #22	-> 445
/*    */     //   #23	-> 459
/*    */     //   #25	-> 476
/*    */     //   #14	-> 518
/*    */     //   #25	-> 537
/*    */     //   #26	-> 551
/*    */     //   #28	-> 568
/*    */     //   #14	-> 572
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   109	45	0	this	Lcom/intellij/ml/llm/matterhorn/ej/webstorm/CommandExecutorUtils;
/*    */     //   181	70	0	this	Lcom/intellij/ml/llm/matterhorn/ej/webstorm/CommandExecutorUtils;
/*    */     //   278	53	0	this	Lcom/intellij/ml/llm/matterhorn/ej/webstorm/CommandExecutorUtils;
/*    */     //   358	53	0	this	Lcom/intellij/ml/llm/matterhorn/ej/webstorm/CommandExecutorUtils;
/*    */     //   438	83	0	this	Lcom/intellij/ml/llm/matterhorn/ej/webstorm/CommandExecutorUtils;
/*    */     //   530	38	0	this	Lcom/intellij/ml/llm/matterhorn/ej/webstorm/CommandExecutorUtils;
/*    */     //   109	45	1	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*    */     //   172	79	1	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*    */     //   269	62	1	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*    */     //   349	62	1	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*    */     //   429	83	1	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*    */     //   109	45	2	executionDir	Ljava/nio/file/Path;
/*    */     //   163	88	2	executionDir	Ljava/nio/file/Path;
/*    */     //   260	71	2	executionDir	Ljava/nio/file/Path;
/*    */     //   340	71	2	executionDir	Ljava/nio/file/Path;
/*    */     //   420	92	2	executionDir	Ljava/nio/file/Path;
/*    */     //   459	17	4	executorResult	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionResult;
/*    */     //   551	17	4	executorResult	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionResult;
/*    */     //   0	582	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	522	6	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	515	5	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "CommandExecutorUtils.kt", l = {15, 19, 20, 22, 25}, i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0"}, n = {"this", "executor", "executionDir", "this", "executor", "executionDir", "this", "executor", "executionDir", "this", "executor", "executionDir", "this"}, m = "setupWebStormCommandExecutor", c = "com.intellij.ml.llm.matterhorn.ej.webstorm.CommandExecutorUtils")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class CommandExecutorUtils$setupWebStormCommandExecutor$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int label;
/*    */     
/*    */     CommandExecutorUtils$setupWebStormCommandExecutor$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return CommandExecutorUtils.this.setupWebStormCommandExecutor(null, null, (Continuation<? super Unit>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\webstorm\CommandExecutorUtils.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */