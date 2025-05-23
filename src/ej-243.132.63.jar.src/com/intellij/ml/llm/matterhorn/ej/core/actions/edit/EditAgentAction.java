/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;
/*     */ 
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\b\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\004\030\000 \"2\0020\001:\002\"#B\025\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\004\b\005\020\006J\036\020\023\032\0020\b2\006\020\024\032\0020\0252\006\020\026\032\0020\027H@¢\006\002\020\030J \020\031\032\004\030\0010\b2\006\020\024\032\0020\0252\006\020\026\032\0020\027H@¢\006\002\020\030J&\020\032\032\0020\b2\006\020\024\032\0020\0332\006\020\026\032\0020\0272\006\020\034\032\0020\035H@¢\006\002\020\036J\016\020\037\032\0020 2\006\020!\032\0020\bR\024\020\007\032\0020\bXD¢\006\b\n\000\032\004\b\t\020\nR\032\020\013\032\b\022\004\022\0020\f0\003X\004¢\006\b\n\000\032\004\b\r\020\016R\024\020\017\032\0020\bXD¢\006\b\n\000\032\004\b\020\020\nR\024\020\021\032\0020\bXD¢\006\b\n\000\032\004\b\022\020\n¨\006$"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;", "errorCheckers", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorChecker;", "<init>", "(Ljava/util/List;)V", "name", "", "getName", "()Ljava/lang/String;", "arguments", "Lcom/intellij/ml/llm/matterhorn/ej/core/Argument;", "getArguments", "()Ljava/util/List;", "docstring", "getDocstring", "customSignature", "getCustomSignature", "execute", "request", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reviewActionRequest", "doExecute", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest;", "dryRun", "", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseArgument", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult;", "input", "Companion", "ReplaceLinesParseResult", "ej-core"})
/*     */ public final class EditAgentAction extends AbstractEditAction {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final String name;
/*     */   @NotNull
/*     */   private final List<Argument> arguments;
/*     */   @NotNull
/*     */   private final String docstring;
/*     */   @NotNull
/*     */   private final String customSignature;
/*     */   @NotNull
/*     */   public static final String REPLACE_LINES_ACTION_NAME = "replace_lines";
/*     */   
/*  20 */   public EditAgentAction(@NotNull List<? extends ErrorChecker> errorCheckers) { super(errorCheckers);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  26 */     this.name = "replace_lines";
/*     */     
/*  28 */     Argument[] arrayOfArgument = new Argument[3]; arrayOfArgument[0] = new Argument(
/*  29 */         "start_line", 
/*  30 */         ArgumentType.INTEGER, 
/*  31 */         "the line number to start the edit at", false, false, 24, null);
/*     */     
/*  33 */     arrayOfArgument[1] = new Argument(
/*  34 */         "end_line", 
/*  35 */         ArgumentType.INTEGER, 
/*  36 */         "the line number to end the edit at (inclusive)", false, false, 24, null);
/*     */     
/*  38 */     arrayOfArgument[2] = new Argument(
/*  39 */         "replacement_text", 
/*  40 */         ArgumentType.STRING, 
/*  41 */         "the text to replace the current selection with", false, false, 24, null);
/*     */     
/*     */     this.arguments = CollectionsKt.listOf((Object[])arrayOfArgument);
/*  44 */     this.docstring = "replaces lines <start_line> through <end_line> (inclusive) with the given text in the open file. All of the <replacement text> will be entered, so make sure your indentation is formatted properly. Source code files will be checked for syntax errors after the edit. If the system detects a syntax error, the edit will not be executed. Simply try to edit the file again, but make sure to read the error message and modify the edit command you issue accordingly. Issuing the same command a second time will just lead to the same error message again.";
/*  45 */     this.customSignature = "replace_lines <start_line>:<end_line>\n<replacement_text>"; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$Companion;", "", "<init>", "()V", "REPLACE_LINES_ACTION_NAME", "", "ej-core"}) public static final class Companion { private Companion() {} } @NotNull public String getName() { return this.name; } @NotNull public List<Argument> getArguments() { return this.arguments; } @NotNull public String getDocstring() { return this.docstring; } @NotNull public String getCustomSignature() { return this.customSignature; }
/*     */    @Nullable
/*     */   public Object execute(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation<? super String> $completion) {
/*  48 */     boolean bool = request instanceof SimpleActionRequest; if (_Assertions.ENABLED && !bool) { String str = "Assertion failed"; throw new AssertionError(str); }
/*  49 */      Intrinsics.checkNotNull(request, "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.ej.core.actions.SimpleActionRequest"); return doExecute((SimpleActionRequest)request, context, false, $completion);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Object reviewActionRequest(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$reviewActionRequest$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$reviewActionRequest$1
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
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$reviewActionRequest$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #7
/*     */     //   50: aload #7
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #6
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #8
/*     */     //   62: aload #7
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 202, 0 -> 88, 1 -> 157
/*     */     //   88: aload #6
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_1
/*     */     //   94: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest
/*     */     //   97: istore #4
/*     */     //   99: getstatic kotlin/_Assertions.ENABLED : Z
/*     */     //   102: ifeq -> 124
/*     */     //   105: iload #4
/*     */     //   107: ifne -> 124
/*     */     //   110: ldc 'Assertion failed'
/*     */     //   112: astore #5
/*     */     //   114: new java/lang/AssertionError
/*     */     //   117: dup
/*     */     //   118: aload #5
/*     */     //   120: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   123: athrow
/*     */     //   124: aload_0
/*     */     //   125: aload_1
/*     */     //   126: ldc 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.ej.core.actions.SimpleActionRequest'
/*     */     //   128: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   131: aload_1
/*     */     //   132: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest
/*     */     //   135: aload_2
/*     */     //   136: iconst_1
/*     */     //   137: aload #7
/*     */     //   139: aload #7
/*     */     //   141: iconst_1
/*     */     //   142: putfield label : I
/*     */     //   145: invokespecial doExecute : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   148: dup
/*     */     //   149: aload #8
/*     */     //   151: if_acmpne -> 164
/*     */     //   154: aload #8
/*     */     //   156: areturn
/*     */     //   157: aload #6
/*     */     //   159: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   162: aload #6
/*     */     //   164: checkcast java/lang/String
/*     */     //   167: astore #4
/*     */     //   169: aload #4
/*     */     //   171: checkcast java/lang/CharSequence
/*     */     //   174: ldc 'File updated.'
/*     */     //   176: checkcast java/lang/CharSequence
/*     */     //   179: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */     //   182: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   185: checkcast java/lang/CharSequence
/*     */     //   188: iconst_0
/*     */     //   189: iconst_2
/*     */     //   190: aconst_null
/*     */     //   191: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */     //   194: ifeq -> 199
/*     */     //   197: aconst_null
/*     */     //   198: areturn
/*     */     //   199: aload #4
/*     */     //   201: areturn
/*     */     //   202: new java/lang/IllegalStateException
/*     */     //   205: dup
/*     */     //   206: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   208: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   211: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #52	-> 60
/*     */     //   #53	-> 93
/*     */     //   #54	-> 124
/*     */     //   #52	-> 154
/*     */     //   #55	-> 169
/*     */     //   #55	-> 185
/*     */     //   #56	-> 197
/*     */     //   #58	-> 199
/*     */     //   #52	-> 202
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	31	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction;
/*     */     //   124	24	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction;
/*     */     //   93	31	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   124	24	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   93	31	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   124	24	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   169	33	4	dryRunResult	Ljava/lang/String;
/*     */     //   0	212	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	152	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	145	6	$result	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Object doExecute(SimpleActionRequest request, ExecutionAgentContext context, boolean dryRun, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$doExecute$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$doExecute$1
/*     */     //   13: astore #13
/*     */     //   15: aload #13
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #13
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$doExecute$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #13
/*     */     //   53: aload #13
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #12
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #14
/*     */     //   65: aload #13
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 412, 0 -> 96, 1 -> 269, 2 -> 404
/*     */     //   96: aload #12
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: ldc 'Edit'
/*     */     //   103: getstatic com/intellij/ml/llm/matterhorn/ej/core/StepType.Edit : Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*     */     //   106: aload_2
/*     */     //   107: invokestatic emitMetadata : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;)V
/*     */     //   110: aload_0
/*     */     //   111: aload_1
/*     */     //   112: invokevirtual getArguments : ()Ljava/lang/String;
/*     */     //   115: invokevirtual parseArgument : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult;
/*     */     //   118: astore #5
/*     */     //   120: aload #5
/*     */     //   122: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult$Error
/*     */     //   125: ifeq -> 137
/*     */     //   128: aload #5
/*     */     //   130: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult$Error
/*     */     //   133: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   136: areturn
/*     */     //   137: aload #5
/*     */     //   139: ldc 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditAgentAction.ReplaceLinesParseResult.Success'
/*     */     //   141: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   144: aload #5
/*     */     //   146: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult$Success
/*     */     //   149: pop
/*     */     //   150: aload #5
/*     */     //   152: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult$Success
/*     */     //   155: invokevirtual getStartLine : ()I
/*     */     //   158: istore #6
/*     */     //   160: aload #5
/*     */     //   162: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult$Success
/*     */     //   165: invokevirtual getEndLine : ()I
/*     */     //   168: istore #7
/*     */     //   170: aload #5
/*     */     //   172: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult$Success
/*     */     //   175: invokevirtual getReplacementText : ()Ljava/lang/String;
/*     */     //   178: astore #8
/*     */     //   180: aload_2
/*     */     //   181: invokeinterface getCurrentScreenPosition : ()Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;
/*     */     //   186: dup
/*     */     //   187: ifnonnull -> 194
/*     */     //   190: pop
/*     */     //   191: ldc 'ERROR: No file open. Use open command first'
/*     */     //   193: areturn
/*     */     //   194: astore #9
/*     */     //   196: aload #9
/*     */     //   198: invokevirtual getFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   201: astore #10
/*     */     //   203: aload #10
/*     */     //   205: <illegal opcode> invoke : (Lcom/intellij/openapi/vfs/VirtualFile;)Lkotlin/jvm/functions/Function0;
/*     */     //   210: aload #13
/*     */     //   212: aload #13
/*     */     //   214: aload_0
/*     */     //   215: putfield L$0 : Ljava/lang/Object;
/*     */     //   218: aload #13
/*     */     //   220: aload_2
/*     */     //   221: putfield L$1 : Ljava/lang/Object;
/*     */     //   224: aload #13
/*     */     //   226: aload #8
/*     */     //   228: putfield L$2 : Ljava/lang/Object;
/*     */     //   231: aload #13
/*     */     //   233: iload_3
/*     */     //   234: putfield Z$0 : Z
/*     */     //   237: aload #13
/*     */     //   239: iload #6
/*     */     //   241: putfield I$0 : I
/*     */     //   244: aload #13
/*     */     //   246: iload #7
/*     */     //   248: putfield I$1 : I
/*     */     //   251: aload #13
/*     */     //   253: iconst_1
/*     */     //   254: putfield label : I
/*     */     //   257: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   260: dup
/*     */     //   261: aload #14
/*     */     //   263: if_acmpne -> 324
/*     */     //   266: aload #14
/*     */     //   268: areturn
/*     */     //   269: aload #13
/*     */     //   271: getfield I$1 : I
/*     */     //   274: istore #7
/*     */     //   276: aload #13
/*     */     //   278: getfield I$0 : I
/*     */     //   281: istore #6
/*     */     //   283: aload #13
/*     */     //   285: getfield Z$0 : Z
/*     */     //   288: istore_3
/*     */     //   289: aload #13
/*     */     //   291: getfield L$2 : Ljava/lang/Object;
/*     */     //   294: checkcast java/lang/String
/*     */     //   297: astore #8
/*     */     //   299: aload #13
/*     */     //   301: getfield L$1 : Ljava/lang/Object;
/*     */     //   304: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   307: astore_2
/*     */     //   308: aload #13
/*     */     //   310: getfield L$0 : Ljava/lang/Object;
/*     */     //   313: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction
/*     */     //   316: astore_0
/*     */     //   317: aload #12
/*     */     //   319: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   322: aload #12
/*     */     //   324: checkcast com/intellij/openapi/editor/Document
/*     */     //   327: dup
/*     */     //   328: ifnonnull -> 336
/*     */     //   331: pop
/*     */     //   332: ldc_w 'ERROR: Unable to load document for file'
/*     */     //   335: areturn
/*     */     //   336: astore #11
/*     */     //   338: aload_0
/*     */     //   339: aload_2
/*     */     //   340: aload #11
/*     */     //   342: iload #6
/*     */     //   344: iload #7
/*     */     //   346: aload #8
/*     */     //   348: aload_2
/*     */     //   349: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   354: iconst_5
/*     */     //   355: bipush #100
/*     */     //   357: iload_3
/*     */     //   358: ifeq -> 365
/*     */     //   361: iconst_1
/*     */     //   362: goto -> 366
/*     */     //   365: iconst_0
/*     */     //   366: aload #13
/*     */     //   368: aload #13
/*     */     //   370: aconst_null
/*     */     //   371: putfield L$0 : Ljava/lang/Object;
/*     */     //   374: aload #13
/*     */     //   376: aconst_null
/*     */     //   377: putfield L$1 : Ljava/lang/Object;
/*     */     //   380: aload #13
/*     */     //   382: aconst_null
/*     */     //   383: putfield L$2 : Ljava/lang/Object;
/*     */     //   386: aload #13
/*     */     //   388: iconst_2
/*     */     //   389: putfield label : I
/*     */     //   392: invokevirtual changeText : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/openapi/editor/Document;IILjava/lang/String;Lcom/intellij/openapi/project/Project;IIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   395: dup
/*     */     //   396: aload #14
/*     */     //   398: if_acmpne -> 411
/*     */     //   401: aload #14
/*     */     //   403: areturn
/*     */     //   404: aload #12
/*     */     //   406: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   409: aload #12
/*     */     //   411: areturn
/*     */     //   412: new java/lang/IllegalStateException
/*     */     //   415: dup
/*     */     //   416: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   418: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   421: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #61	-> 63
/*     */     //   #62	-> 101
/*     */     //   #63	-> 110
/*     */     //   #64	-> 120
/*     */     //   #65	-> 128
/*     */     //   #67	-> 137
/*     */     //   #68	-> 150
/*     */     //   #69	-> 160
/*     */     //   #70	-> 170
/*     */     //   #72	-> 180
/*     */     //   #73	-> 196
/*     */     //   #74	-> 203
/*     */     //   #61	-> 266
/*     */     //   #74	-> 324
/*     */     //   #76	-> 332
/*     */     //   #74	-> 336
/*     */     //   #78	-> 338
/*     */     //   #79	-> 339
/*     */     //   #80	-> 340
/*     */     //   #81	-> 342
/*     */     //   #82	-> 344
/*     */     //   #83	-> 346
/*     */     //   #84	-> 348
/*     */     //   #85	-> 354
/*     */     //   #86	-> 355
/*     */     //   #87	-> 357
/*     */     //   #78	-> 368
/*     */     //   #61	-> 401
/*     */     //   #78	-> 411
/*     */     //   #61	-> 412
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	168	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction;
/*     */     //   317	14	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction;
/*     */     //   336	3	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction;
/*     */     //   101	19	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest;
/*     */     //   101	168	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   308	23	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   336	18	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   101	168	3	dryRun	Z
/*     */     //   289	42	3	dryRun	Z
/*     */     //   336	29	3	dryRun	Z
/*     */     //   120	17	5	result	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult;
/*     */     //   137	43	5	result	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult;
/*     */     //   160	109	6	startLine	I
/*     */     //   283	48	6	startLine	I
/*     */     //   336	8	6	startLine	I
/*     */     //   170	99	7	endLine	I
/*     */     //   276	55	7	endLine	I
/*     */     //   336	10	7	endLine	I
/*     */     //   180	89	8	replacementText	Ljava/lang/String;
/*     */     //   299	32	8	replacementText	Ljava/lang/String;
/*     */     //   336	12	8	replacementText	Ljava/lang/String;
/*     */     //   196	7	9	screenPosition	Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;
/*     */     //   203	57	10	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   338	4	11	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   0	422	4	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	359	13	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	352	12	$result	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Document doExecute$lambda$0(VirtualFile $file) {
/*  75 */     return FileDocumentManager.getInstance().getDocument($file);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\004\n\002\030\002\n\002\030\002\n\000\b6\030\0002\0020\001:\002\004\005B\t\b\004¢\006\004\b\002\020\003\001\002\006\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult;", "", "<init>", "()V", "Success", "Error", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult$Error;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult$Success;", "ej-core"})
/*     */   public static abstract class ReplaceLinesParseResult
/*     */   {
/*     */     private ReplaceLinesParseResult() {}
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\020\016\n\002\b\f\n\002\020\013\n\000\n\002\020\000\n\002\b\003\b\b\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006¢\006\004\b\007\020\bJ\t\020\016\032\0020\003HÆ\003J\t\020\017\032\0020\003HÆ\003J\t\020\020\032\0020\006HÆ\003J'\020\021\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\006HÆ\001J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\025HÖ\003J\t\020\026\032\0020\003HÖ\001J\t\020\027\032\0020\006HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\013\020\nR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\f\020\r¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult$Success;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult;", "startLine", "", "endLine", "replacementText", "", "<init>", "(IILjava/lang/String;)V", "getStartLine", "()I", "getEndLine", "getReplacementText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "ej-core"})
/*     */     public static final class Success
/*     */       extends ReplaceLinesParseResult
/*     */     {
/*     */       private final int startLine;
/*     */       private final int endLine;
/*     */       @NotNull
/*     */       private final String replacementText;
/*     */       
/*  92 */       public Success(int startLine, int endLine, @NotNull String replacementText) { super(null); this.startLine = startLine; this.endLine = endLine; this.replacementText = replacementText; } public final int getStartLine() { return this.startLine; } public final int getEndLine() { return this.endLine; } @NotNull public final String getReplacementText() { return this.replacementText; } public final int component1() { return this.startLine; } public final int component2() { return this.endLine; } @NotNull public final String component3() { return this.replacementText; } @NotNull public final Success copy(int startLine, int endLine, @NotNull String replacementText) { Intrinsics.checkNotNullParameter(replacementText, "replacementText"); return new Success(startLine, endLine, replacementText); } @NotNull public String toString() { return "Success(startLine=" + this.startLine + ", endLine=" + this.endLine + ", replacementText=" + this.replacementText + ")"; } public int hashCode() { result = Integer.hashCode(this.startLine); result = result * 31 + Integer.hashCode(this.endLine); return result * 31 + this.replacementText.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Success)) return false;  Success success = (Success)other; return (this.startLine != success.startLine) ? false : ((this.endLine != success.endLine) ? false : (!!Intrinsics.areEqual(this.replacementText, success.replacementText))); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult$Error;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-core"}) public static final class Error extends ReplaceLinesParseResult { @NotNull private final String message;
/*  93 */       public Error(@NotNull String message) { super(null); this.message = message; } @NotNull public final String getMessage() { return this.message; } @NotNull public final String component1() { return this.message; } @NotNull public final Error copy(@NotNull String message) { Intrinsics.checkNotNullParameter(message, "message"); return new Error(message); } @NotNull public String toString() { return "Error(message=" + this.message + ")"; } public int hashCode() { return this.message.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Error)) return false;  Error error = (Error)other; return !!Intrinsics.areEqual(this.message, error.message); } } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\020\016\n\002\b\f\n\002\020\013\n\000\n\002\020\000\n\002\b\003\b\b\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006¢\006\004\b\007\020\bJ\t\020\016\032\0020\003HÆ\003J\t\020\017\032\0020\003HÆ\003J\t\020\020\032\0020\006HÆ\003J'\020\021\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\006HÆ\001J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\025HÖ\003J\t\020\026\032\0020\003HÖ\001J\t\020\027\032\0020\006HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\013\020\nR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\f\020\r¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult$Success;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult;", "startLine", "", "endLine", "replacementText", "", "<init>", "(IILjava/lang/String;)V", "getStartLine", "()I", "getEndLine", "getReplacementText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "ej-core"}) public static final class Success extends ReplaceLinesParseResult { private final int startLine; private final int endLine; @NotNull private final String replacementText; public Success(int startLine, int endLine, @NotNull String replacementText) { super(null); this.startLine = startLine; this.endLine = endLine; this.replacementText = replacementText; } public final int getStartLine() { return this.startLine; } public final int getEndLine() { return this.endLine; } @NotNull public final String getReplacementText() { return this.replacementText; } public final int component1() { return this.startLine; } public final int component2() { return this.endLine; } @NotNull public final String component3() { return this.replacementText; } @NotNull public final Success copy(int startLine, int endLine, @NotNull String replacementText) { Intrinsics.checkNotNullParameter(replacementText, "replacementText"); return new Success(startLine, endLine, replacementText); } @NotNull public String toString() { return "Success(startLine=" + this.startLine + ", endLine=" + this.endLine + ", replacementText=" + this.replacementText + ")"; } public int hashCode() { result = Integer.hashCode(this.startLine); result = result * 31 + Integer.hashCode(this.endLine); return result * 31 + this.replacementText.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Success)) return false;  Success success = (Success)other; return (this.startLine != success.startLine) ? false : ((this.endLine != success.endLine) ? false : (!!Intrinsics.areEqual(this.replacementText, success.replacementText))); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult$Error;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-core"}) public static final class Error extends ReplaceLinesParseResult { public Error(@NotNull String message) { super(null); this.message = message; } @NotNull private final String message; @NotNull public final String getMessage() { return this.message; } @NotNull public final String component1() { return this.message; }
/*     */     @NotNull public final Error copy(@NotNull String message) { Intrinsics.checkNotNullParameter(message, "message"); return new Error(message); }
/*     */     @NotNull public String toString() { return "Error(message=" + this.message + ")"; }
/*     */     public int hashCode() { return this.message.hashCode(); }
/*     */     public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Error)) return false;  Error error = (Error)other; return !!Intrinsics.areEqual(this.message, error.message); } }
/*  98 */   @NotNull public final ReplaceLinesParseResult parseArgument(@NotNull String input) { Intrinsics.checkNotNullParameter(input, "input");
/*     */     
/* 100 */     String expectedFormat = StringsKt.trimMargin$default("|```\n          |" + getName() + " <start_of_edit>:<end_of_edit>\n          |<new text>\n          |```", null, 1, null);
/* 101 */     List<String> lines = StringsKt.lines(input);
/* 102 */     if (lines.size() < 2) {
/* 103 */       return new ReplaceLinesParseResult.Error("ERROR: Your response does not have enough lines. Expected format:\n" + 
/* 104 */           expectedFormat);
/*     */     }
/*     */ 
/*     */     
/* 108 */     String rangeLine = StringsKt.trim(lines.get(0)).toString();
/* 109 */     List<String> replacementTextLines = lines.subList(1, lines.size());
/*     */     
/* 111 */     String[] arrayOfString = new String[1]; arrayOfString[0] = ":"; List<String> rangeParts = StringsKt.split$default(rangeLine, arrayOfString, false, 0, 6, null);
/* 112 */     if (rangeParts.size() != 2) {
/* 113 */       return new ReplaceLinesParseResult.Error("ERROR: wrong command format. Expected format:\n" + 
/* 114 */           expectedFormat);
/*     */     }
/*     */ 
/*     */     
/* 118 */     Integer startLine = StringsKt.toIntOrNull(rangeParts.get(0));
/* 119 */     Integer endLine = StringsKt.toIntOrNull(rangeParts.get(1));
/*     */     
/* 121 */     if (startLine == null) {
/* 122 */       return new ReplaceLinesParseResult.Error("ERROR: start_line must be a number. Expected format:\n" + 
/* 123 */           expectedFormat);
/*     */     }
/*     */     
/* 126 */     if (endLine == null) {
/* 127 */       return new ReplaceLinesParseResult.Error("ERROR: end_line must be a number. Expected format:\n" + 
/* 128 */           expectedFormat);
/*     */     }
/*     */ 
/*     */     
/* 132 */     String replacementText = CollectionsKt.joinToString$default(replacementTextLines, "\n", null, null, 0, null, null, 62, null);
/*     */     
/* 134 */     return new ReplaceLinesParseResult.Success(
/* 135 */         startLine.intValue(), 
/* 136 */         endLine.intValue(), 
/* 137 */         replacementText); }
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "EditAgentAction.kt", l = {74, 78}, i = {0, 0, 0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "Z$0", "I$0", "I$1"}, n = {"this", "context", "replacementText", "dryRun", "startLine", "endLine"}, m = "doExecute", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditAgentAction")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class EditAgentAction$doExecute$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     boolean Z$0;
/*     */     int I$0;
/*     */     int I$1;
/*     */     int label;
/*     */     
/*     */     EditAgentAction$doExecute$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return EditAgentAction.this.doExecute(null, null, false, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "EditAgentAction.kt", l = {54}, i = {}, s = {}, n = {}, m = "reviewActionRequest", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditAgentAction")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class EditAgentAction$reviewActionRequest$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     EditAgentAction$reviewActionRequest$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return EditAgentAction.this.reviewActionRequest(null, null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\EditAgentAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */