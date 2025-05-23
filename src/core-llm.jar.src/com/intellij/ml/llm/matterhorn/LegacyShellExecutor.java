/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\003\n\002\020\022\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\006\b\027\030\000 !2\0020\001:\001!B\031\b\004\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\b\020\022\032\0020\023H\002J\b\020\024\032\0020\rH\024J\026\020\025\032\0020\0232\006\020\026\032\0020\027H@¢\006\002\020\030J\026\020\031\032\0020\0322\006\020\033\032\0020\034H@¢\006\002\020\035J\016\020\036\032\0020\023H@¢\006\002\020\037J\016\020 \032\0020\032H@¢\006\002\020\037R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\n\020\013R\016\020\f\032\0020\rX.¢\006\002\n\000R\016\020\016\032\0020\017X.¢\006\002\n\000R\016\020\020\032\0020\021X.¢\006\002\n\000¨\006\""}, d2 = {"Lcom/intellij/ml/llm/matterhorn/LegacyShellExecutor;", "Lcom/intellij/ml/llm/matterhorn/ShellExecutor;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "cancellationPolicy", "Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CancellationPolicy;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CancellationPolicy;)V", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "getCancellationPolicy", "()Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CancellationPolicy;", "process", "Ljava/lang/Process;", "reader", "Ljava/io/BufferedReader;", "writer", "Ljava/io/BufferedWriter;", "initExecutor", "", "createProcess", "sendControlSequence", "bytes", "", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeCommand", "Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CommandResult;", "command", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCommandResult", "Companion", "core"})
/*     */ @Obsolete
/*     */ @SourceDebugExtension({"SMAP\nLegacyShellExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyShellExecutor.kt\ncom/intellij/ml/llm/matterhorn/LegacyShellExecutor\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n24#2:146\n739#3,9:147\n*S KotlinDebug\n*F\n+ 1 LegacyShellExecutor.kt\ncom/intellij/ml/llm/matterhorn/LegacyShellExecutor\n*L\n100#1:146\n142#1:147,9\n*E\n"})
/*     */ public class LegacyShellExecutor implements ShellExecutor {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final CoroutineScope scope;
/*     */   @NotNull
/*     */   private final ShellExecutor.CancellationPolicy cancellationPolicy;
/*     */   private Process process;
/*     */   private BufferedReader reader;
/*     */   
/*  16 */   protected LegacyShellExecutor(@NotNull CoroutineScope scope, @NotNull ShellExecutor.CancellationPolicy cancellationPolicy) { this.scope = scope;
/*  17 */     this.cancellationPolicy = cancellationPolicy; } private BufferedWriter writer; @NotNull private static final String COMMAND_COMPLETE_MARKER = "JB_MATTERHORN___END_SIGNAL___"; @NotNull private static final String COMMAND_EXIT_CODE_MARKER = "JB_MATTERHORN___EXIT_CODE___"; @NotNull private static final String COMMAND_EXIT_CODE_ENV_VAR = "JB_MATTERHORN___EXIT_STATUS_ENV_VAR___"; @NotNull private static final String COMMAND_START_MARKER = "JB_MATTERHORN___START_SIGNAL___"; @NotNull public final CoroutineScope getScope() { return this.scope; } @NotNull public ShellExecutor.CancellationPolicy getCancellationPolicy() { return this.cancellationPolicy; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\030\020\t\032\0020\n2\006\020\013\032\0020\f2\b\b\002\020\r\032\0020\016R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000R\016\020\007\032\0020\005XT¢\006\002\n\000R\016\020\b\032\0020\005XT¢\006\002\n\000¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/LegacyShellExecutor$Companion;", "", "<init>", "()V", "COMMAND_COMPLETE_MARKER", "", "COMMAND_EXIT_CODE_MARKER", "COMMAND_EXIT_CODE_ENV_VAR", "COMMAND_START_MARKER", "launchLegacyExecutor", "Lcom/intellij/ml/llm/matterhorn/ShellExecutor;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "policy", "Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CancellationPolicy;", "core"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final ShellExecutor launchLegacyExecutor(@NotNull CoroutineScope scope, @NotNull ShellExecutor.CancellationPolicy policy) {
/*  36 */       Intrinsics.checkNotNullParameter(scope, "scope"); Intrinsics.checkNotNullParameter(policy, "policy"); LegacyShellExecutor legacyShellExecutor1 = new LegacyShellExecutor(scope, policy), it = legacyShellExecutor1; int $i$a$-also-LegacyShellExecutor$Companion$launchLegacyExecutor$1 = 0;
/*  37 */       it.initExecutor();
/*     */       return legacyShellExecutor1;
/*     */     }
/*     */   }
/*     */   
/*     */   private final void initExecutor() {
/*  43 */     this.process = createProcess();
/*  44 */     if (this.process == null) Intrinsics.throwUninitializedPropertyAccessException("process");  super(null.getInputStream()); ((LegacyShellExecutor)new BufferedReader()).reader = new BufferedReader();
/*  45 */     if (this.process == null) Intrinsics.throwUninitializedPropertyAccessException("process");  super(null.getOutputStream()); ((LegacyShellExecutor)new BufferedWriter()).writer = new BufferedWriter();
/*     */   }
/*     */   
/*     */   @NotNull
/*  49 */   protected Process createProcess() { String bashPath = "bash";
/*  50 */     PtyCommandLine commandLine = new PtyCommandLine();
/*  51 */     commandLine.withConsoleMode(false);
/*  52 */     commandLine.withUnixOpenTtyToPreserveOutputAfterTermination(true);
/*  53 */     commandLine.withInitialColumns(240);
/*  54 */     commandLine.withInitialRows(80);
/*  55 */     commandLine.withEnvironment("TERM", "dumb");
/*  56 */     commandLine.withEnvironment("BASH_SILENCE_DEPRECATION_WARNING", "1");
/*  57 */     commandLine.withEnvironment("GIT_PAGER", "cat");
/*  58 */     String[] arrayOfString = new String[3]; arrayOfString[0] = bashPath; arrayOfString[1] = "--noprofile"; arrayOfString[2] = "--norc"; Intrinsics.checkNotNullExpressionValue(commandLine.startProcessWithPty(CollectionsKt.listOf((Object[])arrayOfString)), "startProcessWithPty(...)"); return commandLine.startProcessWithPty(CollectionsKt.listOf((Object[])arrayOfString)); } @DebugMetadata(f = "LegacyShellExecutor.kt", l = {66, 86}, i = {0}, s = {"L$0"}, n = {"$this"}, m = "executeCommand$suspendImpl", c = "com.intellij.ml.llm.matterhorn.LegacyShellExecutor") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class LegacyShellExecutor$executeCommand$1 extends ContinuationImpl {
/*     */     Object L$0; int label; LegacyShellExecutor$executeCommand$1(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return LegacyShellExecutor.executeCommand$suspendImpl(LegacyShellExecutor.this, null, (Continuation<? super ShellExecutor.CommandResult>)this); } }
/*     */   @DebugMetadata(f = "LegacyShellExecutor.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.LegacyShellExecutor$executeCommand$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class LegacyShellExecutor$executeCommand$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label;
/*     */     LegacyShellExecutor$executeCommand$2(String $command, Continuation $completion) { super(2, $completion); }
/*  66 */     public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  67 */           if (LegacyShellExecutor.this.writer == null) { LegacyShellExecutor.this.writer; Intrinsics.throwUninitializedPropertyAccessException("writer"); }  null.write("PS1=''\nPS2=''\nPS3=''\nPS4=''\n");
/*     */           
/*  69 */           if (LegacyShellExecutor.this.writer == null) { LegacyShellExecutor.this.writer; Intrinsics.throwUninitializedPropertyAccessException("writer"); }  null.write("stty -echo\n");
/*     */ 
/*     */           
/*  72 */           if (LegacyShellExecutor.this.writer == null) { LegacyShellExecutor.this.writer; Intrinsics.throwUninitializedPropertyAccessException("writer"); }  null.write("echo \"JB_MATTERHORN___START_SIGNAL___\"\n");
/*  73 */           if (StringsKt.contains$default(this.$command, '\n', false, 2, null)) {
/*     */             
/*  75 */             if (LegacyShellExecutor.this.writer == null) { LegacyShellExecutor.this.writer; Intrinsics.throwUninitializedPropertyAccessException("writer"); }  null.write("{ " + this.$command + " } 2>&1");
/*     */           } else {
/*  77 */             if (LegacyShellExecutor.this.writer == null) { LegacyShellExecutor.this.writer; Intrinsics.throwUninitializedPropertyAccessException("writer"); }  null.write("{ " + this.$command + "; JB_MATTERHORN___EXIT_STATUS_ENV_VAR___=$?; } 2>&1");
/*     */           } 
/*  79 */           if (LegacyShellExecutor.this.writer == null) { LegacyShellExecutor.this.writer; Intrinsics.throwUninitializedPropertyAccessException("writer"); }  null.write("\n");
/*  80 */           if (LegacyShellExecutor.this.writer == null) { LegacyShellExecutor.this.writer; Intrinsics.throwUninitializedPropertyAccessException("writer"); }  null.write("PS1=''\nPS2=''\nPS3=''\nPS4=''\n");
/*  81 */           if (LegacyShellExecutor.this.writer == null) { LegacyShellExecutor.this.writer; Intrinsics.throwUninitializedPropertyAccessException("writer"); }  null.write("echo \n");
/*  82 */           if (LegacyShellExecutor.this.writer == null) { LegacyShellExecutor.this.writer; Intrinsics.throwUninitializedPropertyAccessException("writer"); }  null.write("echo \"JB_MATTERHORN___EXIT_CODE___$JB_MATTERHORN___EXIT_STATUS_ENV_VAR___\"\n");
/*  83 */           if (LegacyShellExecutor.this.writer == null) { LegacyShellExecutor.this.writer; Intrinsics.throwUninitializedPropertyAccessException("writer"); }  null.write("echo \"JB_MATTERHORN___END_SIGNAL___\"\n");
/*  84 */           if (LegacyShellExecutor.this.writer == null) { LegacyShellExecutor.this.writer; Intrinsics.throwUninitializedPropertyAccessException("writer"); }  null.flush();
/*  85 */           return Unit.INSTANCE; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super LegacyShellExecutor$executeCommand$2> $completion) { return (Continuation<Unit>)new LegacyShellExecutor$executeCommand$2(this.$command, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((LegacyShellExecutor$executeCommand$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/*     */    private final Object getCommandResult(Continuation $completion) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/LegacyShellExecutor$getCommandResult$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/LegacyShellExecutor$getCommandResult$1
/*     */     //   11: astore #16
/*     */     //   13: aload #16
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #16
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/LegacyShellExecutor$getCommandResult$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/LegacyShellExecutor;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #16
/*     */     //   50: aload #16
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #15
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #17
/*     */     //   62: aload #16
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 485, 0 -> 88, 1 -> 259
/*     */     //   88: aload #15
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: iconst_0
/*     */     //   94: istore #4
/*     */     //   96: ldc com/intellij/ml/llm/matterhorn/LegacyShellExecutor
/*     */     //   98: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   101: dup
/*     */     //   102: ldc_w 'getInstance(...)'
/*     */     //   105: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   108: astore_2
/*     */     //   109: new java/util/ArrayList
/*     */     //   112: dup
/*     */     //   113: invokespecial <init> : ()V
/*     */     //   116: astore_3
/*     */     //   117: new kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   120: dup
/*     */     //   121: invokespecial <init> : ()V
/*     */     //   124: astore #4
/*     */     //   126: new kotlin/jvm/internal/Ref$BooleanRef
/*     */     //   129: dup
/*     */     //   130: invokespecial <init> : ()V
/*     */     //   133: astore #5
/*     */     //   135: aload_0
/*     */     //   136: getfield scope : Lkotlinx/coroutines/CoroutineScope;
/*     */     //   139: invokeinterface getCoroutineContext : ()Lkotlin/coroutines/CoroutineContext;
/*     */     //   144: aload_0
/*     */     //   145: getfield scope : Lkotlinx/coroutines/CoroutineScope;
/*     */     //   148: invokeinterface getCoroutineContext : ()Lkotlin/coroutines/CoroutineContext;
/*     */     //   153: getstatic kotlinx/coroutines/Job.Key : Lkotlinx/coroutines/Job$Key;
/*     */     //   156: checkcast kotlin/coroutines/CoroutineContext$Key
/*     */     //   159: invokeinterface get : (Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;
/*     */     //   164: checkcast kotlinx/coroutines/Job
/*     */     //   167: invokestatic SupervisorJob : (Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/CompletableJob;
/*     */     //   170: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   173: invokeinterface plus : (Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;
/*     */     //   178: invokestatic CoroutineScope : (Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;
/*     */     //   181: astore #6
/*     */     //   183: aload #6
/*     */     //   185: invokestatic getIO : ()Lkotlinx/coroutines/CoroutineDispatcher;
/*     */     //   188: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   191: aconst_null
/*     */     //   192: new com/intellij/ml/llm/matterhorn/LegacyShellExecutor$getCommandResult$job$1
/*     */     //   195: dup
/*     */     //   196: aload_0
/*     */     //   197: aload_2
/*     */     //   198: aload #4
/*     */     //   200: aload #5
/*     */     //   202: aload_3
/*     */     //   203: aconst_null
/*     */     //   204: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/LegacyShellExecutor;Lcom/intellij/openapi/diagnostic/Logger;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$BooleanRef;Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)V
/*     */     //   207: checkcast kotlin/jvm/functions/Function2
/*     */     //   210: iconst_2
/*     */     //   211: aconst_null
/*     */     //   212: invokestatic async$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
/*     */     //   215: astore #7
/*     */     //   217: getstatic com/intellij/ml/llm/matterhorn/ShellExecutor.Companion : Lcom/intellij/ml/llm/matterhorn/ShellExecutor$Companion;
/*     */     //   220: aload_0
/*     */     //   221: checkcast com/intellij/ml/llm/matterhorn/ShellExecutor
/*     */     //   224: aload #7
/*     */     //   226: aload #16
/*     */     //   228: aload #16
/*     */     //   230: aload_3
/*     */     //   231: putfield L$0 : Ljava/lang/Object;
/*     */     //   234: aload #16
/*     */     //   236: aload #4
/*     */     //   238: putfield L$1 : Ljava/lang/Object;
/*     */     //   241: aload #16
/*     */     //   243: iconst_1
/*     */     //   244: putfield label : I
/*     */     //   247: invokevirtual waitForCommandCompletion : (Lcom/intellij/ml/llm/matterhorn/ShellExecutor;Lkotlinx/coroutines/Deferred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   250: dup
/*     */     //   251: aload #17
/*     */     //   253: if_acmpne -> 285
/*     */     //   256: aload #17
/*     */     //   258: areturn
/*     */     //   259: aload #16
/*     */     //   261: getfield L$1 : Ljava/lang/Object;
/*     */     //   264: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   267: astore #4
/*     */     //   269: aload #16
/*     */     //   271: getfield L$0 : Ljava/lang/Object;
/*     */     //   274: checkcast java/util/ArrayList
/*     */     //   277: astore_3
/*     */     //   278: aload #15
/*     */     //   280: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   283: aload #15
/*     */     //   285: checkcast com/intellij/ml/llm/matterhorn/ShellExecutor$Companion$CompletionStatus
/*     */     //   288: astore #8
/*     */     //   290: aload_3
/*     */     //   291: aload #8
/*     */     //   293: invokevirtual getAgentMessage : ()Ljava/lang/String;
/*     */     //   296: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   299: pop
/*     */     //   300: aload_3
/*     */     //   301: checkcast java/util/List
/*     */     //   304: astore #10
/*     */     //   306: iconst_0
/*     */     //   307: istore #11
/*     */     //   309: aload #10
/*     */     //   311: invokeinterface isEmpty : ()Z
/*     */     //   316: ifne -> 412
/*     */     //   319: aload #10
/*     */     //   321: aload #10
/*     */     //   323: invokeinterface size : ()I
/*     */     //   328: invokeinterface listIterator : (I)Ljava/util/ListIterator;
/*     */     //   333: astore #12
/*     */     //   335: aload #12
/*     */     //   337: invokeinterface hasPrevious : ()Z
/*     */     //   342: ifeq -> 412
/*     */     //   345: aload #12
/*     */     //   347: invokeinterface previous : ()Ljava/lang/Object;
/*     */     //   352: checkcast java/lang/String
/*     */     //   355: astore #13
/*     */     //   357: iconst_0
/*     */     //   358: istore #14
/*     */     //   360: nop
/*     */     //   361: aload #13
/*     */     //   363: checkcast java/lang/CharSequence
/*     */     //   366: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */     //   369: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   372: checkcast java/lang/CharSequence
/*     */     //   375: invokeinterface length : ()I
/*     */     //   380: ifne -> 387
/*     */     //   383: iconst_1
/*     */     //   384: goto -> 388
/*     */     //   387: iconst_0
/*     */     //   388: nop
/*     */     //   389: ifne -> 335
/*     */     //   392: aload #10
/*     */     //   394: checkcast java/lang/Iterable
/*     */     //   397: aload #12
/*     */     //   399: invokeinterface nextIndex : ()I
/*     */     //   404: iconst_1
/*     */     //   405: iadd
/*     */     //   406: invokestatic take : (Ljava/lang/Iterable;I)Ljava/util/List;
/*     */     //   409: goto -> 415
/*     */     //   412: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   415: checkcast java/util/Collection
/*     */     //   418: invokestatic toMutableList : (Ljava/util/Collection;)Ljava/util/List;
/*     */     //   421: astore #9
/*     */     //   423: new com/intellij/ml/llm/matterhorn/ShellExecutor$CommandResult
/*     */     //   426: dup
/*     */     //   427: aload #9
/*     */     //   429: checkcast java/lang/Iterable
/*     */     //   432: invokestatic lineSeparator : ()Ljava/lang/String;
/*     */     //   435: astore #10
/*     */     //   437: aload #10
/*     */     //   439: ldc_w 'lineSeparator(...)'
/*     */     //   442: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   445: aload #10
/*     */     //   447: checkcast java/lang/CharSequence
/*     */     //   450: aconst_null
/*     */     //   451: aconst_null
/*     */     //   452: iconst_0
/*     */     //   453: aconst_null
/*     */     //   454: aconst_null
/*     */     //   455: bipush #62
/*     */     //   457: aconst_null
/*     */     //   458: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   461: aload #4
/*     */     //   463: getfield element : Ljava/lang/Object;
/*     */     //   466: checkcast java/lang/Integer
/*     */     //   469: dup
/*     */     //   470: ifnull -> 479
/*     */     //   473: invokevirtual intValue : ()I
/*     */     //   476: goto -> 481
/*     */     //   479: pop
/*     */     //   480: iconst_m1
/*     */     //   481: invokespecial <init> : (Ljava/lang/String;I)V
/*     */     //   484: areturn
/*     */     //   485: new java/lang/IllegalStateException
/*     */     //   488: dup
/*     */     //   489: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   491: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   494: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #99	-> 60
/*     */     //   #100	-> 93
/*     */     //   #146	-> 96
/*     */     //   #100	-> 108
/*     */     //   #102	-> 109
/*     */     //   #103	-> 117
/*     */     //   #104	-> 126
/*     */     //   #107	-> 135
/*     */     //   #106	-> 178
/*     */     //   #110	-> 183
/*     */     //   #139	-> 217
/*     */     //   #99	-> 256
/*     */     //   #140	-> 290
/*     */     //   #142	-> 300
/*     */     //   #147	-> 309
/*     */     //   #148	-> 319
/*     */     //   #149	-> 335
/*     */     //   #150	-> 345
/*     */     //   #142	-> 360
/*     */     //   #142	-> 361
/*     */     //   #142	-> 388
/*     */     //   #150	-> 389
/*     */     //   #151	-> 392
/*     */     //   #155	-> 412
/*     */     //   #142	-> 418
/*     */     //   #143	-> 423
/*     */     //   #99	-> 485
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	15	0	this	Lcom/intellij/ml/llm/matterhorn/LegacyShellExecutor;
/*     */     //   108	142	0	this	Lcom/intellij/ml/llm/matterhorn/LegacyShellExecutor;
/*     */     //   109	108	2	logger	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   117	142	3	output	Ljava/util/ArrayList;
/*     */     //   278	28	3	output	Ljava/util/ArrayList;
/*     */     //   126	133	4	exitCode	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   269	120	4	exitCode	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   389	23	4	exitCode	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   412	3	4	exitCode	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   415	54	4	exitCode	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   135	82	5	lineLimitExceeded	Lkotlin/jvm/internal/Ref$BooleanRef;
/*     */     //   183	34	6	supervisorScope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   217	33	7	job	Lkotlinx/coroutines/Deferred;
/*     */     //   290	10	8	status	Lcom/intellij/ml/llm/matterhorn/ShellExecutor$Companion$CompletionStatus;
/*     */     //   423	14	9	trimmedOutput	Ljava/util/List;
/*     */     //   306	83	10	$this$dropLastWhile$iv	Ljava/util/List;
/*     */     //   389	23	10	$this$dropLastWhile$iv	Ljava/util/List;
/*     */     //   335	77	12	iterator$iv	Ljava/util/ListIterator;
/*     */     //   357	15	13	it	Ljava/lang/String;
/*     */     //   96	12	4	$i$f$thisLogger	I
/*     */     //   360	29	14	$i$a$-dropLastWhile-LegacyShellExecutor$getCommandResult$trimmedOutput$1	I
/*     */     //   309	106	11	$i$f$dropLastWhile	I
/*     */     //   0	495	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	435	16	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	428	15	$result	Ljava/lang/Object; } @Nullable
/*     */   public Object sendControlSequence(@NotNull byte[] bytes, @NotNull Continuation<? super Unit> $completion) { return sendControlSequence$suspendImpl(this, bytes, $completion); }
/*     */   @Nullable
/*     */   public Object executeCommand(@NotNull String command, @NotNull Continuation<? super ShellExecutor.CommandResult> $completion) { return executeCommand$suspendImpl(this, command, $completion); }
/*     */   @Nullable
/*     */   public Object close(@NotNull Continuation<? super Unit> $completion) { return close$suspendImpl(this, $completion); }
/*     */   @DebugMetadata(f = "LegacyShellExecutor.kt", l = {139}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"output", "exitCode"}, m = "getCommandResult", c = "com.intellij.ml.llm.matterhorn.LegacyShellExecutor")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class LegacyShellExecutor$getCommandResult$1 extends ContinuationImpl { Object L$0; Object L$1; int label;
/*     */     LegacyShellExecutor$getCommandResult$1(Continuation $completion) { super($completion); }
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return LegacyShellExecutor.this.getCommandResult((Continuation)this);
/*     */     } }
/*     */   @DebugMetadata(f = "LegacyShellExecutor.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.LegacyShellExecutor$getCommandResult$job$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class LegacyShellExecutor$getCommandResult$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label;
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       CoroutineScope $this$async;
/*     */       String line;
/* 110 */       IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$async = (CoroutineScope)this.L$0;
/* 111 */           if (LegacyShellExecutor.this.reader == null) { LegacyShellExecutor.this.reader; Intrinsics.throwUninitializedPropertyAccessException("reader"); }  line = null.readLine();
/*     */ 
/*     */           
/* 114 */           while (line != null && !StringsKt.startsWith$default(line, "JB_MATTERHORN___START_SIGNAL___", false, 2, null) && CoroutineScopeKt.isActive($this$async)) {
/* 115 */             if (LegacyShellExecutor.this.reader == null) { LegacyShellExecutor.this.reader; Intrinsics.throwUninitializedPropertyAccessException("reader"); }  line = null.readLine();
/* 116 */             this.$logger.debug("SKIPPED LINE: " + line);
/*     */           } 
/*     */           
/* 119 */           if (LegacyShellExecutor.this.reader == null) { LegacyShellExecutor.this.reader; Intrinsics.throwUninitializedPropertyAccessException("reader"); }  line = null.readLine();
/*     */           
/* 121 */           while (line != null && !StringsKt.startsWith$default(line, "JB_MATTERHORN___END_SIGNAL___", false, 2, null) && CoroutineScopeKt.isActive($this$async)) {
/* 122 */             this.$logger.debug("LINE: " + line);
/* 123 */             if (StringsKt.startsWith$default(line, "JB_MATTERHORN___EXIT_CODE___", false, 2, null)) {
/* 124 */               this.$exitCode.element = StringsKt.toIntOrNull(StringsKt.substringAfter$default(line, "JB_MATTERHORN___EXIT_CODE___", null, 2, null));
/*     */             }
/* 126 */             else if (!this.$lineLimitExceeded.element) {
/* 127 */               this.$output.add(line);
/* 128 */               if (this.$output.size() >= LegacyShellExecutor.this.getCancellationPolicy().getOutputLinesLimit()) {
/* 129 */                 this.$lineLimitExceeded.element = true;
/*     */                 
/* 131 */                 throw new ShellExecutor.Companion.LineLimitExceededException();
/*     */               } 
/*     */             } 
/*     */             
/* 135 */             if (LegacyShellExecutor.this.reader == null) { LegacyShellExecutor.this.reader; Intrinsics.throwUninitializedPropertyAccessException("reader"); }  line = null.readLine();
/*     */           } 
/* 137 */           return Unit.INSTANCE; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     LegacyShellExecutor$getCommandResult$job$1(Logger $logger, Ref.ObjectRef<Integer> $exitCode, Ref.BooleanRef $lineLimitExceeded, ArrayList<String> $output, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super LegacyShellExecutor$getCommandResult$job$1> $completion) {
/*     */       LegacyShellExecutor$getCommandResult$job$1 legacyShellExecutor$getCommandResult$job$1 = new LegacyShellExecutor$getCommandResult$job$1(this.$logger, this.$exitCode, this.$lineLimitExceeded, this.$output, $completion);
/*     */       legacyShellExecutor$getCommandResult$job$1.L$0 = value;
/*     */       return (Continuation<Unit>)legacyShellExecutor$getCommandResult$job$1;
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((LegacyShellExecutor$getCommandResult$job$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\LegacyShellExecutor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */