/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\b\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\004\030\000 \0372\0020\001:\002\036\037B\025\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\004\b\005\020\006J\036\020\023\032\0020\b2\006\020\024\032\0020\0252\006\020\026\032\0020\027H@¢\006\002\020\030J \020\031\032\004\030\0010\b2\006\020\024\032\0020\0252\006\020\026\032\0020\027H@¢\006\002\020\030J&\020\032\032\0020\b2\006\020\024\032\0020\0252\006\020\026\032\0020\0272\006\020\033\032\0020\034H@¢\006\002\020\035R\024\020\007\032\0020\bXD¢\006\b\n\000\032\004\b\t\020\nR\032\020\013\032\b\022\004\022\0020\f0\003X\004¢\006\b\n\000\032\004\b\r\020\016R\024\020\017\032\0020\bXD¢\006\b\n\000\032\004\b\020\020\nR\024\020\021\032\0020\bXD¢\006\b\n\000\032\004\b\022\020\n¨\006 "}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;", "errorCheckers", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorChecker;", "<init>", "(Ljava/util/List;)V", "name", "", "getName", "()Ljava/lang/String;", "arguments", "Lcom/intellij/ml/llm/matterhorn/ej/core/Argument;", "getArguments", "()Ljava/util/List;", "docstring", "getDocstring", "customSignature", "getCustomSignature", "execute", "request", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reviewActionRequest", "doExecute", "dryRun", "", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "RewriteFileParseResult", "Companion", "ej-core"})
/*    */ public final class RewriteFileAction extends AbstractEditAction {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String name;
/*    */   @NotNull
/*    */   private final List<Argument> arguments;
/*    */   @NotNull
/*    */   private final String docstring;
/*    */   @NotNull
/*    */   private final String customSignature;
/*    */   @NotNull
/*    */   public static final String REWRITE_FILE_ACTION_NAME = "rewrite_file";
/*    */   
/* 18 */   public RewriteFileAction(@NotNull List<? extends ErrorChecker> errorCheckers) { super(errorCheckers);
/* 19 */     this.name = "rewrite_file";
/* 20 */     this.arguments = CollectionsKt.listOf(
/* 21 */         new Argument(
/* 22 */           "new_text", 
/* 23 */           ArgumentType.STRING, 
/* 24 */           "the new content of the edited file", false, false, 24, null));
/*    */ 
/*    */     
/* 27 */     this.docstring = "rewrites open file with the <new_text>. All of the <new_text> will be entered, so make sure your indentation is formatted properly. Python files will be checked for syntax errors after the edit. If the system detects a syntax error, the command will not be executed. Simply try to run the command again, but make sure to read the error message and modify the `rewrite_file` command accordingly. Issuing the same command a second time will just lead to the same error message again.";
/* 28 */     this.customSignature = "rewrite_file\n<new_text>"; } @NotNull public String getName() { return this.name; } @NotNull public List<Argument> getArguments() { return this.arguments; } @NotNull public String getDocstring() { return this.docstring; } @NotNull public String getCustomSignature() { return this.customSignature; }
/*    */    @Nullable
/*    */   public Object execute(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation<? super String> $completion) {
/* 31 */     return doExecute(request, context, false, $completion);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object reviewActionRequest(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$reviewActionRequest$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$reviewActionRequest$1
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
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$reviewActionRequest$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #6
/*    */     //   50: aload #6
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #5
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #7
/*    */     //   62: aload #6
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 162, 0 -> 88, 1 -> 117
/*    */     //   88: aload #5
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_0
/*    */     //   94: aload_1
/*    */     //   95: aload_2
/*    */     //   96: iconst_1
/*    */     //   97: aload #6
/*    */     //   99: aload #6
/*    */     //   101: iconst_1
/*    */     //   102: putfield label : I
/*    */     //   105: invokespecial doExecute : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   108: dup
/*    */     //   109: aload #7
/*    */     //   111: if_acmpne -> 124
/*    */     //   114: aload #7
/*    */     //   116: areturn
/*    */     //   117: aload #5
/*    */     //   119: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   122: aload #5
/*    */     //   124: checkcast java/lang/String
/*    */     //   127: astore #4
/*    */     //   129: aload #4
/*    */     //   131: checkcast java/lang/CharSequence
/*    */     //   134: ldc 'File updated.'
/*    */     //   136: checkcast java/lang/CharSequence
/*    */     //   139: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*    */     //   142: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   145: checkcast java/lang/CharSequence
/*    */     //   148: iconst_0
/*    */     //   149: iconst_2
/*    */     //   150: aconst_null
/*    */     //   151: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*    */     //   154: ifeq -> 159
/*    */     //   157: aconst_null
/*    */     //   158: areturn
/*    */     //   159: aload #4
/*    */     //   161: areturn
/*    */     //   162: new java/lang/IllegalStateException
/*    */     //   165: dup
/*    */     //   166: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   168: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   171: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #34	-> 60
/*    */     //   #35	-> 93
/*    */     //   #34	-> 114
/*    */     //   #36	-> 129
/*    */     //   #36	-> 145
/*    */     //   #37	-> 157
/*    */     //   #39	-> 159
/*    */     //   #34	-> 162
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	15	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction;
/*    */     //   93	15	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*    */     //   93	15	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   129	33	4	dryRunResult	Ljava/lang/String;
/*    */     //   0	172	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	112	6	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	105	5	$result	Ljava/lang/Object;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private final Object doExecute(ActionRequest request, ExecutionAgentContext context, boolean dryRun, Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$doExecute$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$doExecute$1
/*    */     //   13: astore #11
/*    */     //   15: aload #11
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #11
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$doExecute$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #11
/*    */     //   53: aload #11
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #10
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #12
/*    */     //   65: aload #11
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 412, 0 -> 96, 1 -> 277, 2 -> 404
/*    */     //   96: aload #10
/*    */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   101: ldc 'Edit'
/*    */     //   103: getstatic com/intellij/ml/llm/matterhorn/ej/core/StepType.Edit : Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*    */     //   106: aload_2
/*    */     //   107: invokestatic emitMetadata : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;)V
/*    */     //   110: aload_1
/*    */     //   111: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest
/*    */     //   114: istore #5
/*    */     //   116: getstatic kotlin/_Assertions.ENABLED : Z
/*    */     //   119: ifeq -> 141
/*    */     //   122: iload #5
/*    */     //   124: ifne -> 141
/*    */     //   127: ldc 'Assertion failed'
/*    */     //   129: astore #6
/*    */     //   131: new java/lang/AssertionError
/*    */     //   134: dup
/*    */     //   135: aload #6
/*    */     //   137: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   140: athrow
/*    */     //   141: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$Companion;
/*    */     //   144: aload_1
/*    */     //   145: ldc 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.ej.core.actions.SimpleActionRequest'
/*    */     //   147: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   150: aload_1
/*    */     //   151: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest
/*    */     //   154: invokevirtual getArguments : ()Ljava/lang/String;
/*    */     //   157: invokevirtual parseArgument : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$RewriteFileParseResult;
/*    */     //   160: astore #5
/*    */     //   162: aload #5
/*    */     //   164: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$RewriteFileParseResult$Error
/*    */     //   167: ifeq -> 179
/*    */     //   170: aload #5
/*    */     //   172: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$RewriteFileParseResult$Error
/*    */     //   175: invokevirtual getMessage : ()Ljava/lang/String;
/*    */     //   178: areturn
/*    */     //   179: aload #5
/*    */     //   181: ldc 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.ej.core.actions.edit.RewriteFileAction.RewriteFileParseResult.Success'
/*    */     //   183: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   186: aload #5
/*    */     //   188: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$RewriteFileParseResult$Success
/*    */     //   191: pop
/*    */     //   192: aload #5
/*    */     //   194: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$RewriteFileParseResult$Success
/*    */     //   197: invokevirtual getReplacementText : ()Ljava/lang/String;
/*    */     //   200: astore #6
/*    */     //   202: aload_2
/*    */     //   203: invokeinterface getCurrentScreenPosition : ()Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;
/*    */     //   208: dup
/*    */     //   209: ifnonnull -> 216
/*    */     //   212: pop
/*    */     //   213: ldc 'ERROR: No file open. Use open command first'
/*    */     //   215: areturn
/*    */     //   216: astore #7
/*    */     //   218: aload #7
/*    */     //   220: invokevirtual getFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   223: astore #8
/*    */     //   225: aload #8
/*    */     //   227: <illegal opcode> invoke : (Lcom/intellij/openapi/vfs/VirtualFile;)Lkotlin/jvm/functions/Function0;
/*    */     //   232: aload #11
/*    */     //   234: aload #11
/*    */     //   236: aload_0
/*    */     //   237: putfield L$0 : Ljava/lang/Object;
/*    */     //   240: aload #11
/*    */     //   242: aload_2
/*    */     //   243: putfield L$1 : Ljava/lang/Object;
/*    */     //   246: aload #11
/*    */     //   248: aload #6
/*    */     //   250: putfield L$2 : Ljava/lang/Object;
/*    */     //   253: aload #11
/*    */     //   255: iload_3
/*    */     //   256: putfield Z$0 : Z
/*    */     //   259: aload #11
/*    */     //   261: iconst_1
/*    */     //   262: putfield label : I
/*    */     //   265: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   268: dup
/*    */     //   269: aload #12
/*    */     //   271: if_acmpne -> 318
/*    */     //   274: aload #12
/*    */     //   276: areturn
/*    */     //   277: aload #11
/*    */     //   279: getfield Z$0 : Z
/*    */     //   282: istore_3
/*    */     //   283: aload #11
/*    */     //   285: getfield L$2 : Ljava/lang/Object;
/*    */     //   288: checkcast java/lang/String
/*    */     //   291: astore #6
/*    */     //   293: aload #11
/*    */     //   295: getfield L$1 : Ljava/lang/Object;
/*    */     //   298: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*    */     //   301: astore_2
/*    */     //   302: aload #11
/*    */     //   304: getfield L$0 : Ljava/lang/Object;
/*    */     //   307: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction
/*    */     //   310: astore_0
/*    */     //   311: aload #10
/*    */     //   313: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   316: aload #10
/*    */     //   318: checkcast com/intellij/openapi/editor/Document
/*    */     //   321: dup
/*    */     //   322: ifnonnull -> 330
/*    */     //   325: pop
/*    */     //   326: ldc_w 'ERROR: Unable to load document for file'
/*    */     //   329: areturn
/*    */     //   330: astore #9
/*    */     //   332: aload_0
/*    */     //   333: aload_2
/*    */     //   334: aload #9
/*    */     //   336: iconst_1
/*    */     //   337: aload #9
/*    */     //   339: invokeinterface getLineCount : ()I
/*    */     //   344: iconst_1
/*    */     //   345: iadd
/*    */     //   346: aload #6
/*    */     //   348: aload_2
/*    */     //   349: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   354: iconst_5
/*    */     //   355: bipush #100
/*    */     //   357: iload_3
/*    */     //   358: ifeq -> 365
/*    */     //   361: iconst_1
/*    */     //   362: goto -> 366
/*    */     //   365: iconst_0
/*    */     //   366: aload #11
/*    */     //   368: aload #11
/*    */     //   370: aconst_null
/*    */     //   371: putfield L$0 : Ljava/lang/Object;
/*    */     //   374: aload #11
/*    */     //   376: aconst_null
/*    */     //   377: putfield L$1 : Ljava/lang/Object;
/*    */     //   380: aload #11
/*    */     //   382: aconst_null
/*    */     //   383: putfield L$2 : Ljava/lang/Object;
/*    */     //   386: aload #11
/*    */     //   388: iconst_2
/*    */     //   389: putfield label : I
/*    */     //   392: invokevirtual changeText : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/openapi/editor/Document;IILjava/lang/String;Lcom/intellij/openapi/project/Project;IIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   395: dup
/*    */     //   396: aload #12
/*    */     //   398: if_acmpne -> 411
/*    */     //   401: aload #12
/*    */     //   403: areturn
/*    */     //   404: aload #10
/*    */     //   406: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   409: aload #10
/*    */     //   411: areturn
/*    */     //   412: new java/lang/IllegalStateException
/*    */     //   415: dup
/*    */     //   416: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   418: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   421: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #42	-> 63
/*    */     //   #43	-> 101
/*    */     //   #44	-> 110
/*    */     //   #46	-> 141
/*    */     //   #47	-> 162
/*    */     //   #48	-> 170
/*    */     //   #50	-> 179
/*    */     //   #51	-> 192
/*    */     //   #53	-> 202
/*    */     //   #54	-> 218
/*    */     //   #55	-> 225
/*    */     //   #42	-> 274
/*    */     //   #55	-> 318
/*    */     //   #57	-> 326
/*    */     //   #55	-> 330
/*    */     //   #59	-> 332
/*    */     //   #60	-> 333
/*    */     //   #61	-> 334
/*    */     //   #62	-> 336
/*    */     //   #63	-> 337
/*    */     //   #64	-> 346
/*    */     //   #65	-> 348
/*    */     //   #66	-> 354
/*    */     //   #67	-> 355
/*    */     //   #68	-> 357
/*    */     //   #59	-> 368
/*    */     //   #42	-> 401
/*    */     //   #59	-> 411
/*    */     //   #42	-> 412
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   101	40	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction;
/*    */     //   141	136	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction;
/*    */     //   311	14	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction;
/*    */     //   330	3	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction;
/*    */     //   101	40	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*    */     //   141	21	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*    */     //   101	40	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   141	136	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   302	23	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   330	24	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   101	40	3	dryRun	Z
/*    */     //   141	136	3	dryRun	Z
/*    */     //   283	42	3	dryRun	Z
/*    */     //   330	35	3	dryRun	Z
/*    */     //   162	17	5	result	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$RewriteFileParseResult;
/*    */     //   179	23	5	result	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$RewriteFileParseResult;
/*    */     //   202	75	6	replacementText	Ljava/lang/String;
/*    */     //   293	32	6	replacementText	Ljava/lang/String;
/*    */     //   330	18	6	replacementText	Ljava/lang/String;
/*    */     //   218	7	7	screenPosition	Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;
/*    */     //   225	43	8	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   332	14	9	document	Lcom/intellij/openapi/editor/Document;
/*    */     //   0	422	4	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	359	11	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	352	10	$result	Ljava/lang/Object;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static final Document doExecute$lambda$0(VirtualFile $file) {
/* 56 */     return FileDocumentManager.getInstance().getDocument($file);
/*    */   }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\004\n\002\030\002\n\002\030\002\n\000\b6\030\0002\0020\001:\002\004\005B\t\b\004¢\006\004\b\002\020\003\001\002\006\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$RewriteFileParseResult;", "", "<init>", "()V", "Success", "Error", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$RewriteFileParseResult$Error;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$RewriteFileParseResult$Success;", "ej-core"})
/*    */   public static abstract class RewriteFileParseResult
/*    */   {
/*    */     private RewriteFileParseResult() {}
/*    */     
/*    */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$RewriteFileParseResult$Success;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$RewriteFileParseResult;", "replacementText", "", "<init>", "(Ljava/lang/String;)V", "getReplacementText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-core"})
/*    */     public static final class Success
/*    */       extends RewriteFileParseResult
/*    */     {
/*    */       @NotNull
/*    */       private final String replacementText;
/*    */       
/*    */       public Success(@NotNull String replacementText) {
/* 73 */         super(null); this.replacementText = replacementText; } @NotNull public final String getReplacementText() { return this.replacementText; } @NotNull public final String component1() { return this.replacementText; } @NotNull public final Success copy(@NotNull String replacementText) { Intrinsics.checkNotNullParameter(replacementText, "replacementText"); return new Success(replacementText); } @NotNull public String toString() { return "Success(replacementText=" + this.replacementText + ")"; } public int hashCode() { return this.replacementText.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Success)) return false;  Success success = (Success)other; return !!Intrinsics.areEqual(this.replacementText, success.replacementText); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$RewriteFileParseResult$Error;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$RewriteFileParseResult;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-core"}) public static final class Error extends RewriteFileParseResult { @NotNull private final String message;
/* 74 */       public Error(@NotNull String message) { super(null); this.message = message; } @NotNull public final String getMessage() { return this.message; } @NotNull public final String component1() { return this.message; } @NotNull public final Error copy(@NotNull String message) { Intrinsics.checkNotNullParameter(message, "message"); return new Error(message); } @NotNull public String toString() { return "Error(message=" + this.message + ")"; } public int hashCode() { return this.message.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Error)) return false;  Error error = (Error)other; return !!Intrinsics.areEqual(this.message, error.message); } } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$RewriteFileParseResult$Success;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$RewriteFileParseResult;", "replacementText", "", "<init>", "(Ljava/lang/String;)V", "getReplacementText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-core"}) public static final class Success extends RewriteFileParseResult { @NotNull private final String replacementText; public Success(@NotNull String replacementText) { super(null); this.replacementText = replacementText; } @NotNull public final String getReplacementText() { return this.replacementText; } @NotNull public final String component1() { return this.replacementText; } @NotNull public final Success copy(@NotNull String replacementText) { Intrinsics.checkNotNullParameter(replacementText, "replacementText"); return new Success(replacementText); } @NotNull public String toString() { return "Success(replacementText=" + this.replacementText + ")"; } public int hashCode() { return this.replacementText.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Success)) return false;  Success success = (Success)other; return !!Intrinsics.areEqual(this.replacementText, success.replacementText); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$RewriteFileParseResult$Error;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$RewriteFileParseResult;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-core"}) public static final class Error extends RewriteFileParseResult { public Error(@NotNull String message) { super(null); this.message = message; } @NotNull private final String message; @NotNull public final String getMessage() { return this.message; } @NotNull public final String component1() { return this.message; } @NotNull public final Error copy(@NotNull String message) { Intrinsics.checkNotNullParameter(message, "message"); return new Error(message); }
/*    */     @NotNull public String toString() { return "Error(message=" + this.message + ")"; }
/*    */     public int hashCode() { return this.message.hashCode(); }
/*    */     public boolean equals(@Nullable Object other) { if (this == other)
/*    */         return true;  if (!(other instanceof Error))
/*    */         return false;  Error error = (Error)other; return !!Intrinsics.areEqual(this.message, error.message); } }
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\006\032\0020\0072\006\020\b\032\0020\005R\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$Companion;", "", "<init>", "()V", "REWRITE_FILE_ACTION_NAME", "", "parseArgument", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$RewriteFileParseResult;", "input", "ej-core"}) @SourceDebugExtension({"SMAP\nRewriteFileAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RewriteFileAction.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n756#2,10:89\n*S KotlinDebug\n*F\n+ 1 RewriteFileAction.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction$Companion\n*L\n82#1:89,10\n*E\n"}) public static final class Companion { private Companion() {}
/* 81 */     @NotNull public final RewriteFileAction.RewriteFileParseResult parseArgument(@NotNull String input) { Intrinsics.checkNotNullParameter(input, "input"); List lines = StringsKt.lines(input);
/* 82 */       Iterable $this$dropWhile$iv = lines; int $i$f$dropWhile = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 89 */       boolean yielding$iv = false;
/* 90 */       ArrayList<Object> list$iv = new ArrayList();
/* 91 */       for (Object item$iv : $this$dropWhile$iv) {
/* 92 */         if (yielding$iv) {
/* 93 */           list$iv.add(item$iv); continue;
/* 94 */         }  String it = (String)item$iv; int $i$a$-dropWhile-RewriteFileAction$Companion$parseArgument$replacementTextLines$1 = 0; if (!((((CharSequence)StringsKt.trim(it).toString()).length() == 0) ? 1 : 0)) {
/* 95 */           list$iv.add(item$iv);
/* 96 */           yielding$iv = true;
/*    */         } 
/* 98 */       }  List<Object> replacementTextLines = list$iv;
/*    */       String replacementText = CollectionsKt.joinToString$default(replacementTextLines, "\n", null, null, 0, null, null, 62, null);
/*    */       return new RewriteFileAction.RewriteFileParseResult.Success(replacementText); }
/*    */      }
/*    */ 
/*    */   
/*    */   @DebugMetadata(f = "RewriteFileAction.kt", l = {55, 59}, i = {0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "Z$0"}, n = {"this", "context", "replacementText", "dryRun"}, m = "doExecute", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.RewriteFileAction")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class RewriteFileAction$doExecute$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     boolean Z$0;
/*    */     int label;
/*    */     
/*    */     RewriteFileAction$doExecute$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return RewriteFileAction.this.doExecute(null, null, false, (Continuation)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "RewriteFileAction.kt", l = {35}, i = {}, s = {}, n = {}, m = "reviewActionRequest", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.RewriteFileAction")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class RewriteFileAction$reviewActionRequest$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     RewriteFileAction$reviewActionRequest$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return RewriteFileAction.this.reviewActionRequest(null, null, (Continuation<? super String>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\RewriteFileAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */