/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import java.util.List;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.LazyKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.enums.EnumEntries;
/*     */ import kotlin.enums.EnumEntriesKt;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlin.time.DurationKt;
/*     */ import kotlin.time.DurationUnit;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Deferred;
/*     */ import org.jetbrains.annotations.ApiStatus.Obsolete;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020\016\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020 \n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\004\b\003\030\0002\0020\001:\002\034\035B\t\b\002¢\006\004\b\002\020\003J\032\020\n\032\0020\013*\0020\f2\006\020\r\032\0020\013H@¢\006\002\020\016J \020\017\032\0020\020*\0020\f2\f\020\021\032\b\022\004\022\0020\0130\022H@¢\006\002\020\023J\036\020\024\032\0020\025*\0020\f2\n\020\026\032\006\022\002\b\0030\027H@¢\006\002\020\030J\036\020\031\032\0020\032*\0020\f2\n\020\026\032\006\022\002\b\0030\027H@¢\006\002\020\030J\026\020\033\032\0020\0132\f\020\021\032\b\022\004\022\0020\0130\022H\002R\033\020\004\032\0020\0058FX\002¢\006\f\n\004\b\b\020\t\032\004\b\006\020\007¨\006\036"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ShellExecutor$Companion;", "", "<init>", "()V", "defaultCancellationPolicy", "Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CancellationPolicy;", "getDefaultCancellationPolicy", "()Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CancellationPolicy;", "defaultCancellationPolicy$delegate", "Lkotlin/Lazy;", "executeAndControlExitCode", "", "Lcom/intellij/ml/llm/matterhorn/ShellExecutor;", "command", "(Lcom/intellij/ml/llm/matterhorn/ShellExecutor;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeCommand", "Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CommandResult;", "commands", "", "(Lcom/intellij/ml/llm/matterhorn/ShellExecutor;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "waitForCommandCompletion", "Lcom/intellij/ml/llm/matterhorn/ShellExecutor$Companion$CompletionStatus;", "job", "Lkotlinx/coroutines/Deferred;", "(Lcom/intellij/ml/llm/matterhorn/ShellExecutor;Lkotlinx/coroutines/Deferred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelCommand", "", "joinCommands", "LineLimitExceededException", "CompletionStatus", "core"})
/*     */ @SourceDebugExtension({"SMAP\nShellExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShellExecutor.kt\ncom/intellij/ml/llm/matterhorn/ShellExecutor$Companion\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,172:1\n24#2:173\n*S KotlinDebug\n*F\n+ 1 ShellExecutor.kt\ncom/intellij/ml/llm/matterhorn/ShellExecutor$Companion\n*L\n105#1:173\n*E\n"})
/*     */ public final class Companion
/*     */ {
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\b\001\030\0002\0060\001j\002`\002B\007¢\006\004\b\003\020\004¨\006\005"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ShellExecutor$Companion$LineLimitExceededException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "core"})
/*     */   @Obsolete
/*     */   public static final class LineLimitExceededException
/*     */     extends Exception {}
/*     */   
/*     */   @NotNull
/*  47 */   private static final Lazy<ShellExecutor.CancellationPolicy> defaultCancellationPolicy$delegate = LazyKt.lazy(Companion::defaultCancellationPolicy_delegate$lambda$0); @NotNull public final ShellExecutor.CancellationPolicy getDefaultCancellationPolicy() { Lazy<ShellExecutor.CancellationPolicy> lazy = defaultCancellationPolicy$delegate; return (ShellExecutor.CancellationPolicy)lazy.getValue(); } private static final ShellExecutor.CancellationPolicy defaultCancellationPolicy_delegate$lambda$0() {
/*  48 */     return new ShellExecutor.CancellationPolicy(
/*  49 */         10000, 
/*  50 */         DurationKt.toDuration(600, DurationUnit.SECONDS), 
/*  51 */         DurationKt.toDuration(20, DurationUnit.SECONDS), 
/*  52 */         DurationKt.toDuration(20, DurationUnit.SECONDS), null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Object executeAndControlExitCode(@NotNull ShellExecutor $this$executeAndControlExitCode, @NotNull String command, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ShellExecutor$Companion$executeAndControlExitCode$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ShellExecutor$Companion$executeAndControlExitCode$1
/*     */     //   11: astore #6
/*     */     //   13: aload #6
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #6
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ShellExecutor$Companion$executeAndControlExitCode$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ShellExecutor$Companion;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #6
/*     */     //   50: aload #6
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #5
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #7
/*     */     //   62: aload #6
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 210, 0 -> 88, 1 -> 123
/*     */     //   88: aload #5
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_1
/*     */     //   94: aload_2
/*     */     //   95: aload #6
/*     */     //   97: aload #6
/*     */     //   99: aload_2
/*     */     //   100: putfield L$0 : Ljava/lang/Object;
/*     */     //   103: aload #6
/*     */     //   105: iconst_1
/*     */     //   106: putfield label : I
/*     */     //   109: invokeinterface executeCommand : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   114: dup
/*     */     //   115: aload #7
/*     */     //   117: if_acmpne -> 139
/*     */     //   120: aload #7
/*     */     //   122: areturn
/*     */     //   123: aload #6
/*     */     //   125: getfield L$0 : Ljava/lang/Object;
/*     */     //   128: checkcast java/lang/String
/*     */     //   131: astore_2
/*     */     //   132: aload #5
/*     */     //   134: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   137: aload #5
/*     */     //   139: checkcast com/intellij/ml/llm/matterhorn/ShellExecutor$CommandResult
/*     */     //   142: astore #4
/*     */     //   144: aload #4
/*     */     //   146: invokevirtual getExitStatus : ()I
/*     */     //   149: ifle -> 176
/*     */     //   152: new java/lang/Exception
/*     */     //   155: dup
/*     */     //   156: aload_2
/*     */     //   157: aload #4
/*     */     //   159: invokevirtual getExitStatus : ()I
/*     */     //   162: aload #4
/*     */     //   164: invokevirtual getOutput : ()Ljava/lang/String;
/*     */     //   167: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
/*     */     //   172: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   175: athrow
/*     */     //   176: aload #4
/*     */     //   178: invokevirtual getExitStatus : ()I
/*     */     //   181: iconst_m1
/*     */     //   182: if_icmpne -> 204
/*     */     //   185: new java/lang/Exception
/*     */     //   188: dup
/*     */     //   189: aload_2
/*     */     //   190: aload #4
/*     */     //   192: invokevirtual getOutput : ()Ljava/lang/String;
/*     */     //   195: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   200: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   203: athrow
/*     */     //   204: aload #4
/*     */     //   206: invokevirtual getOutput : ()Ljava/lang/String;
/*     */     //   209: areturn
/*     */     //   210: new java/lang/IllegalStateException
/*     */     //   213: dup
/*     */     //   214: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   216: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   219: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #56	-> 60
/*     */     //   #57	-> 93
/*     */     //   #56	-> 120
/*     */     //   #58	-> 144
/*     */     //   #59	-> 152
/*     */     //   #60	-> 176
/*     */     //   #61	-> 185
/*     */     //   #63	-> 204
/*     */     //   #56	-> 210
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	21	1	$this$executeAndControlExitCode	Lcom/intellij/ml/llm/matterhorn/ShellExecutor;
/*     */     //   93	30	2	command	Ljava/lang/String;
/*     */     //   132	78	2	command	Ljava/lang/String;
/*     */     //   144	66	4	res	Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CommandResult;
/*     */     //   0	220	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	160	6	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	153	5	$result	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Object executeCommand(@NotNull ShellExecutor $this$executeCommand, @NotNull List<String> commands, @NotNull Continuation<? super ShellExecutor.CommandResult> $completion) {
/*  67 */     String commandString = joinCommands(commands);
/*  68 */     return $this$executeCommand.executeCommand(commandString, $completion);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\t\b\002\030\0002\b\022\004\022\0020\0000\001B\021\b\002\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ShellExecutor$Companion$CompletionStatus;", "", "agentMessage", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAgentMessage", "()Ljava/lang/String;", "COMPLETED", "SUSPENDED", "TIMED_OUT", "LINE_LIMIT_EXCEEDED", "core"})
/*  72 */   public enum CompletionStatus { COMPLETED(""),
/*  73 */     SUSPENDED("EXECUTION TIMED OUT AND SUSPENDED"),
/*  74 */     TIMED_OUT("EXECUTION TIMED OUT"),
/*  75 */     LINE_LIMIT_EXCEEDED("LINE LIMIT EXCEEDED"); @NotNull private final String agentMessage; CompletionStatus(String agentMessage) { this.agentMessage = agentMessage; } @NotNull public final String getAgentMessage() { return this.agentMessage; }
/*  76 */     @NotNull public static EnumEntries<CompletionStatus> getEntries() { return $ENTRIES; } } @Nullable
/*     */   public final Object waitForCommandCompletion(@NotNull ShellExecutor $this$waitForCommandCompletion, @NotNull Deferred job, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ShellExecutor$Companion$waitForCommandCompletion$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ShellExecutor$Companion$waitForCommandCompletion$1
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
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ShellExecutor$Companion$waitForCommandCompletion$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ShellExecutor$Companion;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #7
/*     */     //   50: aload #7
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #6
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #8
/*     */     //   62: aload #7
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 332, 0 -> 96, 1 -> 161, 2 -> 243, 3 -> 316
/*     */     //   96: aload #6
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: nop
/*     */     //   102: aload_1
/*     */     //   103: invokeinterface getCancellationPolicy : ()Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CancellationPolicy;
/*     */     //   108: invokevirtual getCommandExecutionTimeout-UwyO8pc : ()J
/*     */     //   111: new com/intellij/ml/llm/matterhorn/ShellExecutor$Companion$waitForCommandCompletion$2
/*     */     //   114: dup
/*     */     //   115: aload_2
/*     */     //   116: aconst_null
/*     */     //   117: invokespecial <init> : (Lkotlinx/coroutines/Deferred;Lkotlin/coroutines/Continuation;)V
/*     */     //   120: checkcast kotlin/jvm/functions/Function2
/*     */     //   123: aload #7
/*     */     //   125: aload #7
/*     */     //   127: aload_0
/*     */     //   128: putfield L$0 : Ljava/lang/Object;
/*     */     //   131: aload #7
/*     */     //   133: aload_1
/*     */     //   134: putfield L$1 : Ljava/lang/Object;
/*     */     //   137: aload #7
/*     */     //   139: aload_2
/*     */     //   140: putfield L$2 : Ljava/lang/Object;
/*     */     //   143: aload #7
/*     */     //   145: iconst_1
/*     */     //   146: putfield label : I
/*     */     //   149: invokestatic withTimeout-KLykuaI : (JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   152: dup
/*     */     //   153: aload #8
/*     */     //   155: if_acmpne -> 196
/*     */     //   158: aload #8
/*     */     //   160: areturn
/*     */     //   161: aload #7
/*     */     //   163: getfield L$2 : Ljava/lang/Object;
/*     */     //   166: checkcast kotlinx/coroutines/Deferred
/*     */     //   169: astore_2
/*     */     //   170: aload #7
/*     */     //   172: getfield L$1 : Ljava/lang/Object;
/*     */     //   175: checkcast com/intellij/ml/llm/matterhorn/ShellExecutor
/*     */     //   178: astore_1
/*     */     //   179: aload #7
/*     */     //   181: getfield L$0 : Ljava/lang/Object;
/*     */     //   184: checkcast com/intellij/ml/llm/matterhorn/ShellExecutor$Companion
/*     */     //   187: astore_0
/*     */     //   188: nop
/*     */     //   189: aload #6
/*     */     //   191: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   194: aload #6
/*     */     //   196: pop
/*     */     //   197: goto -> 328
/*     */     //   200: astore #4
/*     */     //   202: aload_0
/*     */     //   203: aload_1
/*     */     //   204: aload_2
/*     */     //   205: aload #7
/*     */     //   207: aload #7
/*     */     //   209: aconst_null
/*     */     //   210: putfield L$0 : Ljava/lang/Object;
/*     */     //   213: aload #7
/*     */     //   215: aconst_null
/*     */     //   216: putfield L$1 : Ljava/lang/Object;
/*     */     //   219: aload #7
/*     */     //   221: aconst_null
/*     */     //   222: putfield L$2 : Ljava/lang/Object;
/*     */     //   225: aload #7
/*     */     //   227: iconst_2
/*     */     //   228: putfield label : I
/*     */     //   231: invokespecial cancelCommand : (Lcom/intellij/ml/llm/matterhorn/ShellExecutor;Lkotlinx/coroutines/Deferred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   234: dup
/*     */     //   235: aload #8
/*     */     //   237: if_acmpne -> 250
/*     */     //   240: aload #8
/*     */     //   242: areturn
/*     */     //   243: aload #6
/*     */     //   245: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   248: aload #6
/*     */     //   250: checkcast java/lang/Boolean
/*     */     //   253: invokevirtual booleanValue : ()Z
/*     */     //   256: istore #5
/*     */     //   258: iload #5
/*     */     //   260: ifeq -> 269
/*     */     //   263: getstatic com/intellij/ml/llm/matterhorn/ShellExecutor$Companion$CompletionStatus.SUSPENDED : Lcom/intellij/ml/llm/matterhorn/ShellExecutor$Companion$CompletionStatus;
/*     */     //   266: goto -> 272
/*     */     //   269: getstatic com/intellij/ml/llm/matterhorn/ShellExecutor$Companion$CompletionStatus.TIMED_OUT : Lcom/intellij/ml/llm/matterhorn/ShellExecutor$Companion$CompletionStatus;
/*     */     //   272: areturn
/*     */     //   273: astore #4
/*     */     //   275: aload_0
/*     */     //   276: aload_1
/*     */     //   277: aload_2
/*     */     //   278: aload #7
/*     */     //   280: aload #7
/*     */     //   282: aconst_null
/*     */     //   283: putfield L$0 : Ljava/lang/Object;
/*     */     //   286: aload #7
/*     */     //   288: aconst_null
/*     */     //   289: putfield L$1 : Ljava/lang/Object;
/*     */     //   292: aload #7
/*     */     //   294: aconst_null
/*     */     //   295: putfield L$2 : Ljava/lang/Object;
/*     */     //   298: aload #7
/*     */     //   300: iconst_3
/*     */     //   301: putfield label : I
/*     */     //   304: invokespecial cancelCommand : (Lcom/intellij/ml/llm/matterhorn/ShellExecutor;Lkotlinx/coroutines/Deferred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   307: dup
/*     */     //   308: aload #8
/*     */     //   310: if_acmpne -> 323
/*     */     //   313: aload #8
/*     */     //   315: areturn
/*     */     //   316: aload #6
/*     */     //   318: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   321: aload #6
/*     */     //   323: pop
/*     */     //   324: getstatic com/intellij/ml/llm/matterhorn/ShellExecutor$Companion$CompletionStatus.LINE_LIMIT_EXCEEDED : Lcom/intellij/ml/llm/matterhorn/ShellExecutor$Companion$CompletionStatus;
/*     */     //   327: areturn
/*     */     //   328: getstatic com/intellij/ml/llm/matterhorn/ShellExecutor$Companion$CompletionStatus.COMPLETED : Lcom/intellij/ml/llm/matterhorn/ShellExecutor$Companion$CompletionStatus;
/*     */     //   331: areturn
/*     */     //   332: new java/lang/IllegalStateException
/*     */     //   335: dup
/*     */     //   336: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   338: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   341: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #82	-> 60
/*     */     //   #83	-> 101
/*     */     //   #84	-> 102
/*     */     //   #82	-> 158
/*     */     //   #84	-> 196
/*     */     //   #87	-> 200
/*     */     //   #88	-> 202
/*     */     //   #82	-> 240
/*     */     //   #88	-> 250
/*     */     //   #89	-> 258
/*     */     //   #90	-> 273
/*     */     //   #91	-> 275
/*     */     //   #82	-> 313
/*     */     //   #92	-> 323
/*     */     //   #95	-> 328
/*     */     //   #82	-> 332
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	60	0	this	Lcom/intellij/ml/llm/matterhorn/ShellExecutor$Companion;
/*     */     //   188	9	0	this	Lcom/intellij/ml/llm/matterhorn/ShellExecutor$Companion;
/*     */     //   200	34	0	this	Lcom/intellij/ml/llm/matterhorn/ShellExecutor$Companion;
/*     */     //   273	34	0	this	Lcom/intellij/ml/llm/matterhorn/ShellExecutor$Companion;
/*     */     //   101	60	1	$this$waitForCommandCompletion	Lcom/intellij/ml/llm/matterhorn/ShellExecutor;
/*     */     //   179	18	1	$this$waitForCommandCompletion	Lcom/intellij/ml/llm/matterhorn/ShellExecutor;
/*     */     //   200	34	1	$this$waitForCommandCompletion	Lcom/intellij/ml/llm/matterhorn/ShellExecutor;
/*     */     //   273	34	1	$this$waitForCommandCompletion	Lcom/intellij/ml/llm/matterhorn/ShellExecutor;
/*     */     //   101	60	2	job	Lkotlinx/coroutines/Deferred;
/*     */     //   170	27	2	job	Lkotlinx/coroutines/Deferred;
/*     */     //   200	34	2	job	Lkotlinx/coroutines/Deferred;
/*     */     //   273	34	2	job	Lkotlinx/coroutines/Deferred;
/*     */     //   258	11	5	suspended	Z
/*     */     //   0	342	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	282	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	275	6	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   101	152	200	kotlinx/coroutines/TimeoutCancellationException
/*     */     //   101	152	273	com/intellij/ml/llm/matterhorn/ShellExecutor$Companion$LineLimitExceededException
/*     */     //   188	197	200	kotlinx/coroutines/TimeoutCancellationException
/*     */     //   188	197	273	com/intellij/ml/llm/matterhorn/ShellExecutor$Companion$LineLimitExceededException
/*     */   } @DebugMetadata(f = "ShellExecutor.kt", l = {85}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ShellExecutor$Companion$waitForCommandCompletion$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\000\n\002\030\002\020\000\032\004\030\0010\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class ShellExecutor$Companion$waitForCommandCompletion$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> { int label; ShellExecutor$Companion$waitForCommandCompletion$2(Deferred<?> $job, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     } public final Object invokeSuspend(Object $result) {
/*  84 */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  85 */           this.label = 1; if (this.$job.await((Continuation)this) == object) return object;  return this.$job.await((Continuation)this);
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     } public final Continuation<Unit> create(Object value, Continuation<? super ShellExecutor$Companion$waitForCommandCompletion$2> $completion) {
/*     */       return (Continuation<Unit>)new ShellExecutor$Companion$waitForCommandCompletion$2(this.$job, $completion);
/*     */     }
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((ShellExecutor$Companion$waitForCommandCompletion$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     } }
/*     */   private final Object cancelCommand(ShellExecutor $this$cancelCommand, Deferred job, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ShellExecutor$Companion$cancelCommand$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ShellExecutor$Companion$cancelCommand$1
/*     */     //   11: astore #6
/*     */     //   13: aload #6
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #6
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ShellExecutor$Companion$cancelCommand$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ShellExecutor$Companion;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #6
/*     */     //   50: aload #6
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #5
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #7
/*     */     //   62: aload #6
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 439, 0 -> 100, 1 -> 174, 2 -> 241, 3 -> 331, 4 -> 398
/*     */     //   100: aload #5
/*     */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   105: iconst_0
/*     */     //   106: istore #4
/*     */     //   108: ldc com/intellij/ml/llm/matterhorn/ShellExecutor
/*     */     //   110: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   113: dup
/*     */     //   114: ldc 'getInstance(...)'
/*     */     //   116: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   119: ldc 'Command cancelled, waiting for it to stop or be suspended'
/*     */     //   121: invokevirtual debug : (Ljava/lang/String;)V
/*     */     //   124: invokestatic getIO : ()Lkotlinx/coroutines/CoroutineDispatcher;
/*     */     //   127: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   130: new com/intellij/ml/llm/matterhorn/ShellExecutor$Companion$cancelCommand$2
/*     */     //   133: dup
/*     */     //   134: aload_1
/*     */     //   135: aconst_null
/*     */     //   136: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ShellExecutor;Lkotlin/coroutines/Continuation;)V
/*     */     //   139: checkcast kotlin/jvm/functions/Function2
/*     */     //   142: aload #6
/*     */     //   144: aload #6
/*     */     //   146: aload_1
/*     */     //   147: putfield L$0 : Ljava/lang/Object;
/*     */     //   150: aload #6
/*     */     //   152: aload_2
/*     */     //   153: putfield L$1 : Ljava/lang/Object;
/*     */     //   156: aload #6
/*     */     //   158: iconst_1
/*     */     //   159: putfield label : I
/*     */     //   162: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   165: dup
/*     */     //   166: aload #7
/*     */     //   168: if_acmpne -> 199
/*     */     //   171: aload #7
/*     */     //   173: areturn
/*     */     //   174: aload #6
/*     */     //   176: getfield L$1 : Ljava/lang/Object;
/*     */     //   179: checkcast kotlinx/coroutines/Deferred
/*     */     //   182: astore_2
/*     */     //   183: aload #6
/*     */     //   185: getfield L$0 : Ljava/lang/Object;
/*     */     //   188: checkcast com/intellij/ml/llm/matterhorn/ShellExecutor
/*     */     //   191: astore_1
/*     */     //   192: aload #5
/*     */     //   194: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   197: aload #5
/*     */     //   199: pop
/*     */     //   200: aload_1
/*     */     //   201: invokeinterface getCancellationPolicy : ()Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CancellationPolicy;
/*     */     //   206: invokevirtual getCommandCancellationTimeout-UwyO8pc : ()J
/*     */     //   209: aload #6
/*     */     //   211: aload #6
/*     */     //   213: aload_1
/*     */     //   214: putfield L$0 : Ljava/lang/Object;
/*     */     //   217: aload #6
/*     */     //   219: aload_2
/*     */     //   220: putfield L$1 : Ljava/lang/Object;
/*     */     //   223: aload #6
/*     */     //   225: iconst_2
/*     */     //   226: putfield label : I
/*     */     //   229: invokestatic delay-VtjQ1oo : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   232: dup
/*     */     //   233: aload #7
/*     */     //   235: if_acmpne -> 266
/*     */     //   238: aload #7
/*     */     //   240: areturn
/*     */     //   241: aload #6
/*     */     //   243: getfield L$1 : Ljava/lang/Object;
/*     */     //   246: checkcast kotlinx/coroutines/Deferred
/*     */     //   249: astore_2
/*     */     //   250: aload #6
/*     */     //   252: getfield L$0 : Ljava/lang/Object;
/*     */     //   255: checkcast com/intellij/ml/llm/matterhorn/ShellExecutor
/*     */     //   258: astore_1
/*     */     //   259: aload #5
/*     */     //   261: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   264: aload #5
/*     */     //   266: pop
/*     */     //   267: aload_2
/*     */     //   268: invokeinterface isCompleted : ()Z
/*     */     //   273: ifeq -> 281
/*     */     //   276: iconst_0
/*     */     //   277: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   280: areturn
/*     */     //   281: invokestatic getIO : ()Lkotlinx/coroutines/CoroutineDispatcher;
/*     */     //   284: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   287: new com/intellij/ml/llm/matterhorn/ShellExecutor$Companion$cancelCommand$3
/*     */     //   290: dup
/*     */     //   291: aload_1
/*     */     //   292: aconst_null
/*     */     //   293: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ShellExecutor;Lkotlin/coroutines/Continuation;)V
/*     */     //   296: checkcast kotlin/jvm/functions/Function2
/*     */     //   299: aload #6
/*     */     //   301: aload #6
/*     */     //   303: aload_1
/*     */     //   304: putfield L$0 : Ljava/lang/Object;
/*     */     //   307: aload #6
/*     */     //   309: aload_2
/*     */     //   310: putfield L$1 : Ljava/lang/Object;
/*     */     //   313: aload #6
/*     */     //   315: iconst_3
/*     */     //   316: putfield label : I
/*     */     //   319: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   322: dup
/*     */     //   323: aload #7
/*     */     //   325: if_acmpne -> 356
/*     */     //   328: aload #7
/*     */     //   330: areturn
/*     */     //   331: aload #6
/*     */     //   333: getfield L$1 : Ljava/lang/Object;
/*     */     //   336: checkcast kotlinx/coroutines/Deferred
/*     */     //   339: astore_2
/*     */     //   340: aload #6
/*     */     //   342: getfield L$0 : Ljava/lang/Object;
/*     */     //   345: checkcast com/intellij/ml/llm/matterhorn/ShellExecutor
/*     */     //   348: astore_1
/*     */     //   349: aload #5
/*     */     //   351: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   354: aload #5
/*     */     //   356: pop
/*     */     //   357: aload_1
/*     */     //   358: invokeinterface getCancellationPolicy : ()Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CancellationPolicy;
/*     */     //   363: invokevirtual getCommandSuspendingTimeout-UwyO8pc : ()J
/*     */     //   366: aload #6
/*     */     //   368: aload #6
/*     */     //   370: aload_2
/*     */     //   371: putfield L$0 : Ljava/lang/Object;
/*     */     //   374: aload #6
/*     */     //   376: aconst_null
/*     */     //   377: putfield L$1 : Ljava/lang/Object;
/*     */     //   380: aload #6
/*     */     //   382: iconst_4
/*     */     //   383: putfield label : I
/*     */     //   386: invokestatic delay-VtjQ1oo : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   389: dup
/*     */     //   390: aload #7
/*     */     //   392: if_acmpne -> 414
/*     */     //   395: aload #7
/*     */     //   397: areturn
/*     */     //   398: aload #6
/*     */     //   400: getfield L$0 : Ljava/lang/Object;
/*     */     //   403: checkcast kotlinx/coroutines/Deferred
/*     */     //   406: astore_2
/*     */     //   407: aload #5
/*     */     //   409: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   412: aload #5
/*     */     //   414: pop
/*     */     //   415: aload_2
/*     */     //   416: invokeinterface isCompleted : ()Z
/*     */     //   421: ifne -> 434
/*     */     //   424: aload_2
/*     */     //   425: checkcast kotlinx/coroutines/Job
/*     */     //   428: aconst_null
/*     */     //   429: iconst_1
/*     */     //   430: aconst_null
/*     */     //   431: invokestatic cancel$default : (Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
/*     */     //   434: iconst_1
/*     */     //   435: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   438: areturn
/*     */     //   439: new java/lang/IllegalStateException
/*     */     //   442: dup
/*     */     //   443: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   445: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   448: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #104	-> 60
/*     */     //   #105	-> 105
/*     */     //   #173	-> 108
/*     */     //   #105	-> 119
/*     */     //   #107	-> 124
/*     */     //   #104	-> 171
/*     */     //   #110	-> 199
/*     */     //   #104	-> 238
/*     */     //   #111	-> 266
/*     */     //   #112	-> 276
/*     */     //   #115	-> 281
/*     */     //   #104	-> 328
/*     */     //   #118	-> 356
/*     */     //   #104	-> 395
/*     */     //   #119	-> 414
/*     */     //   #120	-> 424
/*     */     //   #122	-> 434
/*     */     //   #104	-> 439
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   105	69	1	$this$cancelCommand	Lcom/intellij/ml/llm/matterhorn/ShellExecutor;
/*     */     //   192	49	1	$this$cancelCommand	Lcom/intellij/ml/llm/matterhorn/ShellExecutor;
/*     */     //   259	72	1	$this$cancelCommand	Lcom/intellij/ml/llm/matterhorn/ShellExecutor;
/*     */     //   349	40	1	$this$cancelCommand	Lcom/intellij/ml/llm/matterhorn/ShellExecutor;
/*     */     //   105	69	2	job	Lkotlinx/coroutines/Deferred;
/*     */     //   183	58	2	job	Lkotlinx/coroutines/Deferred;
/*     */     //   250	81	2	job	Lkotlinx/coroutines/Deferred;
/*     */     //   340	58	2	job	Lkotlinx/coroutines/Deferred;
/*     */     //   407	27	2	job	Lkotlinx/coroutines/Deferred;
/*     */     //   108	11	4	$i$f$thisLogger	I
/*     */     //   0	449	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	389	6	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	382	5	$result	Ljava/lang/Object;
/*     */   }
/*     */   @DebugMetadata(f = "ShellExecutor.kt", l = {108}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ShellExecutor$Companion$cancelCommand$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class ShellExecutor$Companion$cancelCommand$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label;
/*     */     ShellExecutor$Companion$cancelCommand$2(ShellExecutor $receiver, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     public final Object invokeSuspend(Object $result) { byte[] arrayOfByte;
/* 107 */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 108 */           arrayOfByte = new byte[1]; arrayOfByte[0] = 3; this.label = 1; if (this.$this_cancelCommand.sendControlSequence(arrayOfByte, (Continuation<? super Unit>)this) == object) return object;  this.$this_cancelCommand.sendControlSequence(arrayOfByte, (Continuation<? super Unit>)this);
/* 109 */           return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super ShellExecutor$Companion$cancelCommand$2> $completion) { return (Continuation<Unit>)new ShellExecutor$Companion$cancelCommand$2(this.$this_cancelCommand, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((ShellExecutor$Companion$cancelCommand$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/*     */    @DebugMetadata(f = "ShellExecutor.kt", l = {116}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ShellExecutor$Companion$cancelCommand$3") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class ShellExecutor$Companion$cancelCommand$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     public final Object invokeSuspend(Object $result) { byte[] arrayOfByte;
/* 115 */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 116 */           arrayOfByte = new byte[1]; arrayOfByte[0] = 26; this.label = 1; if (this.$this_cancelCommand.sendControlSequence(arrayOfByte, (Continuation<? super Unit>)this) == object) return object;  this.$this_cancelCommand.sendControlSequence(arrayOfByte, (Continuation<? super Unit>)this);
/* 117 */           return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } int label; ShellExecutor$Companion$cancelCommand$3(ShellExecutor $receiver, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     } public final Continuation<Unit> create(Object value, Continuation<? super ShellExecutor$Companion$cancelCommand$3> $completion) {
/*     */       return (Continuation<Unit>)new ShellExecutor$Companion$cancelCommand$3(this.$this_cancelCommand, $completion);
/*     */     } public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((ShellExecutor$Companion$cancelCommand$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     } } private final String joinCommands(List commands) {
/* 126 */     return CollectionsKt.joinToString$default(commands, " ", null, null, 0, null, Companion::joinCommands$lambda$1, 30, null); } private static final CharSequence joinCommands$lambda$1(String commandPart) {
/* 127 */     Intrinsics.checkNotNullParameter(commandPart, "commandPart"); return (StringsKt.contains$default(commandPart, " ", false, 2, null) || StringsKt.contains$default(commandPart, "&", false, 2, null)) ? ("\"" + commandPart + "\"") : commandPart;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ShellExecutor.kt", l = {107, 110, 115, 118}, i = {0, 0, 1, 1, 2, 2, 3}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0"}, n = {"$this$cancelCommand", "job", "$this$cancelCommand", "job", "$this$cancelCommand", "job", "job"}, m = "cancelCommand", c = "com.intellij.ml.llm.matterhorn.ShellExecutor$Companion")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ShellExecutor$Companion$cancelCommand$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     ShellExecutor$Companion$cancelCommand$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ShellExecutor.Companion.this.cancelCommand(null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ShellExecutor.kt", l = {57}, i = {0}, s = {"L$0"}, n = {"command"}, m = "executeAndControlExitCode", c = "com.intellij.ml.llm.matterhorn.ShellExecutor$Companion")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ShellExecutor$Companion$executeAndControlExitCode$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     ShellExecutor$Companion$executeAndControlExitCode$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ShellExecutor.Companion.this.executeAndControlExitCode(null, null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ShellExecutor.kt", l = {84, 88, 91}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"this", "$this$waitForCommandCompletion", "job"}, m = "waitForCommandCompletion", c = "com.intellij.ml.llm.matterhorn.ShellExecutor$Companion")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ShellExecutor$Companion$waitForCommandCompletion$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int label;
/*     */     
/*     */     ShellExecutor$Companion$waitForCommandCompletion$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ShellExecutor.Companion.this.waitForCommandCompletion(null, null, (Continuation<? super ShellExecutor.Companion.CompletionStatus>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ShellExecutor$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */