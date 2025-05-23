/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*    */ 
/*    */ import com.intellij.openapi.editor.Document;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\030\000 \0352\0020\001:\001\035B\007¢\006\004\b\002\020\003J\036\020\017\032\0020\0052\006\020\020\032\0020\0212\006\020\022\032\0020\023H@¢\006\002\020\024J,\020\025\032\0020\0052\006\020\026\032\0020\0272\f\020\030\032\b\022\004\022\0020\0310\t2\006\020\032\032\0020\033H@¢\006\002\020\034R\024\020\004\032\0020\005XD¢\006\b\n\000\032\004\b\006\020\007R\032\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\b\n\000\032\004\b\013\020\fR\024\020\r\032\0020\005XD¢\006\b\n\000\032\004\b\016\020\007¨\006\036"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/UndoEditAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "arguments", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/Argument;", "getArguments", "()Ljava/util/List;", "docstring", "getDocstring", "execute", "request", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "formatMessage", "document", "Lcom/intellij/openapi/editor/Document;", "hunks", "Lcom/intellij/openapi/diff/impl/patch/PatchHunk;", "agentSessionHistory", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;", "(Lcom/intellij/openapi/editor/Document;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nUndoEditAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UndoEditAction.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/UndoEditAction\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n1557#2:73\n1628#2,3:74\n*S KotlinDebug\n*F\n+ 1 UndoEditAction.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/UndoEditAction\n*L\n60#1:73\n60#1:74,3\n*E\n"})
/*    */ public final class UndoEditAction implements AgentAction {
/*    */   @NotNull
/* 12 */   public String getCustomSignature() { return AgentAction.DefaultImpls.getCustomSignature(this); } @NotNull public static final Companion Companion = new Companion(null); @Nullable public Object getInputParams(@NotNull ActionRequest $this$getInputParams, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.getInputParams(this, $this$getInputParams, $completion); } @Nullable public Object reviewActionRequest(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.reviewActionRequest(this, request, context, $completion); }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000R\016\020\007\032\0020\005XT¢\006\002\n\000¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/UndoEditAction$Companion;", "", "<init>", "()V", "UNDO_PERFORMED_MESSAGE", "", "UNDO_NOTHING_MESSAGE", "UNDO_ACTION_NAME", "ej-core"})
/*    */   public static final class Companion {
/*    */     private Companion() {} }
/*    */   
/*    */   @NotNull
/* 19 */   private final String name = "undo_edit"; @NotNull public String getName() { return this.name; } @NotNull
/* 20 */   private final List<Argument> arguments = CollectionsKt.emptyList(); @NotNull public List<Argument> getArguments() { return this.arguments; } @NotNull
/* 21 */   private final String docstring = "reverts the last edit made to the project"; @NotNull public static final String UNDO_PERFORMED_MESSAGE = "Undo action performed."; @NotNull public static final String UNDO_NOTHING_MESSAGE = "ERROR: No changes for undo.\n"; @NotNull public static final String UNDO_ACTION_NAME = "undo_edit"; @NotNull public String getDocstring() { return this.docstring; }
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
/*    */   @Nullable
/*    */   public Object execute(@NotNull ActionRequest paramActionRequest, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/UndoEditAction$execute$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/UndoEditAction$execute$1
/*    */     //   11: astore #11
/*    */     //   13: aload #11
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #11
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/actions/UndoEditAction$execute$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/UndoEditAction;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #11
/*    */     //   50: aload #11
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #10
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #12
/*    */     //   62: aload #11
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 446, 0 -> 92, 1 -> 146, 2 -> 352
/*    */     //   92: aload #10
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: ldc 'Undo'
/*    */     //   99: getstatic com/intellij/ml/llm/matterhorn/ej/core/StepType.Edit : Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*    */     //   102: aload_2
/*    */     //   103: invokestatic emitMetadata : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;)V
/*    */     //   106: aload_2
/*    */     //   107: invokeinterface getEditService : ()Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditService;
/*    */     //   112: aload #11
/*    */     //   114: aload #11
/*    */     //   116: aload_0
/*    */     //   117: putfield L$0 : Ljava/lang/Object;
/*    */     //   120: aload #11
/*    */     //   122: aload_2
/*    */     //   123: putfield L$1 : Ljava/lang/Object;
/*    */     //   126: aload #11
/*    */     //   128: iconst_1
/*    */     //   129: putfield label : I
/*    */     //   132: invokeinterface undoLastEdit : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   137: dup
/*    */     //   138: aload #12
/*    */     //   140: if_acmpne -> 171
/*    */     //   143: aload #12
/*    */     //   145: areturn
/*    */     //   146: aload #11
/*    */     //   148: getfield L$1 : Ljava/lang/Object;
/*    */     //   151: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*    */     //   154: astore_2
/*    */     //   155: aload #11
/*    */     //   157: getfield L$0 : Ljava/lang/Object;
/*    */     //   160: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/UndoEditAction
/*    */     //   163: astore_0
/*    */     //   164: aload #10
/*    */     //   166: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   169: aload #10
/*    */     //   171: checkcast java/util/List
/*    */     //   174: astore #4
/*    */     //   176: aload #4
/*    */     //   178: invokeinterface isEmpty : ()Z
/*    */     //   183: ifeq -> 189
/*    */     //   186: ldc 'ERROR: No changes for undo.\\n'
/*    */     //   188: areturn
/*    */     //   189: new java/util/StringJoiner
/*    */     //   192: dup
/*    */     //   193: ldc '\\n'
/*    */     //   195: checkcast java/lang/CharSequence
/*    */     //   198: ldc ''
/*    */     //   200: checkcast java/lang/CharSequence
/*    */     //   203: ldc '\\n-------------------------------------------------\\nUndo action performed.'
/*    */     //   205: checkcast java/lang/CharSequence
/*    */     //   208: invokespecial <init> : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
/*    */     //   211: astore #5
/*    */     //   213: aload #4
/*    */     //   215: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   220: astore #6
/*    */     //   222: aload #6
/*    */     //   224: invokeinterface hasNext : ()Z
/*    */     //   229: ifeq -> 434
/*    */     //   232: aload #6
/*    */     //   234: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   239: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/UndoResult
/*    */     //   242: astore #7
/*    */     //   244: aload #5
/*    */     //   246: aload #7
/*    */     //   248: astore #8
/*    */     //   250: aload #8
/*    */     //   252: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/UndoResult$Failure.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/UndoResult$Failure;
/*    */     //   255: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   258: ifeq -> 266
/*    */     //   261: ldc ''
/*    */     //   263: goto -> 424
/*    */     //   266: aload #8
/*    */     //   268: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/UndoResult$Success
/*    */     //   271: ifeq -> 416
/*    */     //   274: astore #9
/*    */     //   276: aload_0
/*    */     //   277: aload #7
/*    */     //   279: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/UndoResult$Success
/*    */     //   282: invokevirtual getDocument : ()Lcom/intellij/openapi/editor/Document;
/*    */     //   285: aload #7
/*    */     //   287: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/UndoResult$Success
/*    */     //   290: invokevirtual getReversePatch : ()Ljava/util/List;
/*    */     //   293: aload_2
/*    */     //   294: invokeinterface getSessionHistory : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*    */     //   299: aload #11
/*    */     //   301: aload #11
/*    */     //   303: aload_0
/*    */     //   304: putfield L$0 : Ljava/lang/Object;
/*    */     //   307: aload #11
/*    */     //   309: aload_2
/*    */     //   310: putfield L$1 : Ljava/lang/Object;
/*    */     //   313: aload #11
/*    */     //   315: aload #5
/*    */     //   317: putfield L$2 : Ljava/lang/Object;
/*    */     //   320: aload #11
/*    */     //   322: aload #6
/*    */     //   324: putfield L$3 : Ljava/lang/Object;
/*    */     //   327: aload #11
/*    */     //   329: aload #9
/*    */     //   331: putfield L$4 : Ljava/lang/Object;
/*    */     //   334: aload #11
/*    */     //   336: iconst_2
/*    */     //   337: putfield label : I
/*    */     //   340: invokespecial formatMessage : (Lcom/intellij/openapi/editor/Document;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   343: dup
/*    */     //   344: aload #12
/*    */     //   346: if_acmpne -> 407
/*    */     //   349: aload #12
/*    */     //   351: areturn
/*    */     //   352: aload #11
/*    */     //   354: getfield L$4 : Ljava/lang/Object;
/*    */     //   357: checkcast java/util/StringJoiner
/*    */     //   360: astore #9
/*    */     //   362: aload #11
/*    */     //   364: getfield L$3 : Ljava/lang/Object;
/*    */     //   367: checkcast java/util/Iterator
/*    */     //   370: astore #6
/*    */     //   372: aload #11
/*    */     //   374: getfield L$2 : Ljava/lang/Object;
/*    */     //   377: checkcast java/util/StringJoiner
/*    */     //   380: astore #5
/*    */     //   382: aload #11
/*    */     //   384: getfield L$1 : Ljava/lang/Object;
/*    */     //   387: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*    */     //   390: astore_2
/*    */     //   391: aload #11
/*    */     //   393: getfield L$0 : Ljava/lang/Object;
/*    */     //   396: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/UndoEditAction
/*    */     //   399: astore_0
/*    */     //   400: aload #10
/*    */     //   402: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   405: aload #10
/*    */     //   407: aload #9
/*    */     //   409: swap
/*    */     //   410: checkcast java/lang/String
/*    */     //   413: goto -> 424
/*    */     //   416: new kotlin/NoWhenBranchMatchedException
/*    */     //   419: dup
/*    */     //   420: invokespecial <init> : ()V
/*    */     //   423: athrow
/*    */     //   424: checkcast java/lang/CharSequence
/*    */     //   427: invokevirtual add : (Ljava/lang/CharSequence;)Ljava/util/StringJoiner;
/*    */     //   430: pop
/*    */     //   431: goto -> 222
/*    */     //   434: aload #5
/*    */     //   436: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   439: dup
/*    */     //   440: ldc 'toString(...)'
/*    */     //   442: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   445: areturn
/*    */     //   446: new java/lang/IllegalStateException
/*    */     //   449: dup
/*    */     //   450: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   452: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   455: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #23	-> 60
/*    */     //   #24	-> 97
/*    */     //   #26	-> 106
/*    */     //   #23	-> 143
/*    */     //   #27	-> 176
/*    */     //   #28	-> 186
/*    */     //   #30	-> 189
/*    */     //   #31	-> 213
/*    */     //   #32	-> 244
/*    */     //   #33	-> 246
/*    */     //   #34	-> 250
/*    */     //   #35	-> 261
/*    */     //   #38	-> 266
/*    */     //   #39	-> 276
/*    */     //   #40	-> 277
/*    */     //   #41	-> 285
/*    */     //   #42	-> 293
/*    */     //   #39	-> 301
/*    */     //   #23	-> 349
/*    */     //   #39	-> 407
/*    */     //   #33	-> 416
/*    */     //   #32	-> 427
/*    */     //   #48	-> 434
/*    */     //   #23	-> 446
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	49	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/UndoEditAction;
/*    */     //   164	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/UndoEditAction;
/*    */     //   189	163	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/UndoEditAction;
/*    */     //   400	16	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/UndoEditAction;
/*    */     //   424	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/UndoEditAction;
/*    */     //   97	49	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   155	31	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   189	163	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   391	25	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   424	22	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   176	10	4	undoResults	Ljava/util/List;
/*    */     //   189	33	4	undoResults	Ljava/util/List;
/*    */     //   213	139	5	joiner	Ljava/util/StringJoiner;
/*    */     //   382	34	5	joiner	Ljava/util/StringJoiner;
/*    */     //   424	22	5	joiner	Ljava/util/StringJoiner;
/*    */     //   244	17	7	result	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/UndoResult;
/*    */     //   266	27	7	result	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/UndoResult;
/*    */     //   0	456	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	396	11	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	389	10	$result	Ljava/lang/Object;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private final Object formatMessage(Document document, List hunks, AgentSessionHistory agentSessionHistory, Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/UndoEditAction$formatMessage$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/UndoEditAction$formatMessage$1
/*    */     //   13: astore #19
/*    */     //   15: aload #19
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #19
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/actions/UndoEditAction$formatMessage$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/UndoEditAction;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #19
/*    */     //   53: aload #19
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #18
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #20
/*    */     //   65: aload #19
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 352, 0 -> 92, 1 -> 141
/*    */     //   92: aload #18
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_1
/*    */     //   98: <illegal opcode> invoke : (Lcom/intellij/openapi/editor/Document;)Lkotlin/jvm/functions/Function0;
/*    */     //   103: aload #19
/*    */     //   105: aload #19
/*    */     //   107: aload_1
/*    */     //   108: putfield L$0 : Ljava/lang/Object;
/*    */     //   111: aload #19
/*    */     //   113: aload_2
/*    */     //   114: putfield L$1 : Ljava/lang/Object;
/*    */     //   117: aload #19
/*    */     //   119: aload_3
/*    */     //   120: putfield L$2 : Ljava/lang/Object;
/*    */     //   123: aload #19
/*    */     //   125: iconst_1
/*    */     //   126: putfield label : I
/*    */     //   129: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   132: dup
/*    */     //   133: aload #20
/*    */     //   135: if_acmpne -> 175
/*    */     //   138: aload #20
/*    */     //   140: areturn
/*    */     //   141: aload #19
/*    */     //   143: getfield L$2 : Ljava/lang/Object;
/*    */     //   146: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory
/*    */     //   149: astore_3
/*    */     //   150: aload #19
/*    */     //   152: getfield L$1 : Ljava/lang/Object;
/*    */     //   155: checkcast java/util/List
/*    */     //   158: astore_2
/*    */     //   159: aload #19
/*    */     //   161: getfield L$0 : Ljava/lang/Object;
/*    */     //   164: checkcast com/intellij/openapi/editor/Document
/*    */     //   167: astore_1
/*    */     //   168: aload #18
/*    */     //   170: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   173: aload #18
/*    */     //   175: checkcast com/intellij/openapi/vfs/VirtualFile
/*    */     //   178: dup
/*    */     //   179: ifnonnull -> 186
/*    */     //   182: pop
/*    */     //   183: ldc ''
/*    */     //   185: areturn
/*    */     //   186: astore #5
/*    */     //   188: aload #5
/*    */     //   190: invokevirtual toNioPath : ()Ljava/nio/file/Path;
/*    */     //   193: astore #6
/*    */     //   195: aload #6
/*    */     //   197: ldc_w 'toNioPath(...)'
/*    */     //   200: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   203: aload #6
/*    */     //   205: aload_1
/*    */     //   206: aload_2
/*    */     //   207: checkcast java/lang/Iterable
/*    */     //   210: astore #6
/*    */     //   212: astore #16
/*    */     //   214: astore #15
/*    */     //   216: iconst_0
/*    */     //   217: istore #7
/*    */     //   219: aload #6
/*    */     //   221: astore #8
/*    */     //   223: new java/util/ArrayList
/*    */     //   226: dup
/*    */     //   227: aload #6
/*    */     //   229: bipush #10
/*    */     //   231: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*    */     //   234: invokespecial <init> : (I)V
/*    */     //   237: checkcast java/util/Collection
/*    */     //   240: astore #9
/*    */     //   242: iconst_0
/*    */     //   243: istore #10
/*    */     //   245: aload #8
/*    */     //   247: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   252: astore #11
/*    */     //   254: aload #11
/*    */     //   256: invokeinterface hasNext : ()Z
/*    */     //   261: ifeq -> 328
/*    */     //   264: aload #11
/*    */     //   266: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   271: astore #12
/*    */     //   273: aload #9
/*    */     //   275: aload #12
/*    */     //   277: checkcast com/intellij/openapi/diff/impl/patch/PatchHunk
/*    */     //   280: astore #13
/*    */     //   282: astore #17
/*    */     //   284: iconst_0
/*    */     //   285: istore #14
/*    */     //   287: new com/intellij/ml/llm/matterhorn/ej/core/actions/PrintBlock
/*    */     //   290: dup
/*    */     //   291: aload #13
/*    */     //   293: invokevirtual getStartLineAfter : ()I
/*    */     //   296: aload #13
/*    */     //   298: invokevirtual getEndLineAfter : ()I
/*    */     //   301: aload #13
/*    */     //   303: invokevirtual getStartLineAfter : ()I
/*    */     //   306: isub
/*    */     //   307: iconst_1
/*    */     //   308: iadd
/*    */     //   309: iconst_1
/*    */     //   310: iconst_2
/*    */     //   311: iconst_5
/*    */     //   312: invokespecial <init> : (IIIII)V
/*    */     //   315: nop
/*    */     //   316: aload #17
/*    */     //   318: swap
/*    */     //   319: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   324: pop
/*    */     //   325: goto -> 254
/*    */     //   328: aload #9
/*    */     //   330: checkcast java/util/List
/*    */     //   333: nop
/*    */     //   334: astore #17
/*    */     //   336: aload #15
/*    */     //   338: aload #16
/*    */     //   340: aload #17
/*    */     //   342: aconst_null
/*    */     //   343: iconst_0
/*    */     //   344: aload_3
/*    */     //   345: bipush #24
/*    */     //   347: aconst_null
/*    */     //   348: invokestatic printScreen$default : (Ljava/nio/file/Path;Lcom/intellij/openapi/editor/Document;Ljava/util/List;Ljava/lang/String;ILcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;ILjava/lang/Object;)Ljava/lang/String;
/*    */     //   351: areturn
/*    */     //   352: new java/lang/IllegalStateException
/*    */     //   355: dup
/*    */     //   356: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   358: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   361: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #51	-> 63
/*    */     //   #56	-> 97
/*    */     //   #51	-> 138
/*    */     //   #56	-> 175
/*    */     //   #58	-> 188
/*    */     //   #59	-> 205
/*    */     //   #60	-> 206
/*    */     //   #73	-> 219
/*    */     //   #74	-> 245
/*    */     //   #75	-> 273
/*    */     //   #61	-> 287
/*    */     //   #62	-> 291
/*    */     //   #63	-> 296
/*    */     //   #64	-> 309
/*    */     //   #65	-> 310
/*    */     //   #66	-> 311
/*    */     //   #61	-> 312
/*    */     //   #67	-> 315
/*    */     //   #75	-> 319
/*    */     //   #76	-> 328
/*    */     //   #73	-> 333
/*    */     //   #57	-> 342
/*    */     //   #69	-> 344
/*    */     //   #57	-> 345
/*    */     //   #51	-> 352
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	44	1	document	Lcom/intellij/openapi/editor/Document;
/*    */     //   168	14	1	document	Lcom/intellij/openapi/editor/Document;
/*    */     //   186	20	1	document	Lcom/intellij/openapi/editor/Document;
/*    */     //   97	44	2	hunks	Ljava/util/List;
/*    */     //   159	23	2	hunks	Ljava/util/List;
/*    */     //   186	30	2	hunks	Ljava/util/List;
/*    */     //   97	44	3	agentSessionHistory	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*    */     //   150	32	3	agentSessionHistory	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*    */     //   186	166	3	agentSessionHistory	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*    */     //   188	7	5	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   216	26	6	$this$map$iv	Ljava/lang/Iterable;
/*    */     //   242	12	8	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   242	88	9	destination$iv$iv	Ljava/util/Collection;
/*    */     //   273	52	12	item$iv$iv	Ljava/lang/Object;
/*    */     //   284	32	13	it	Lcom/intellij/openapi/diff/impl/patch/PatchHunk;
/*    */     //   287	29	14	$i$a$-map-UndoEditAction$formatMessage$2	I
/*    */     //   245	85	10	$i$f$mapTo	I
/*    */     //   219	115	7	$i$f$map	I
/*    */     //   0	362	4	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	299	19	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	292	18	$result	Ljava/lang/Object;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static final VirtualFile formatMessage$lambda$0(Document $document) {
/* 56 */     return FileDocumentManager.getInstance().getFile($document);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "UndoEditAction.kt", l = {26, 39}, i = {0, 0, 1, 1, 1}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"}, n = {"this", "context", "this", "context", "joiner"}, m = "execute", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.UndoEditAction")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class UndoEditAction$execute$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     Object L$3;
/*    */     Object L$4;
/*    */     int label;
/*    */     
/*    */     UndoEditAction$execute$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return UndoEditAction.this.execute(null, null, (Continuation<? super String>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "UndoEditAction.kt", l = {56}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"document", "hunks", "agentSessionHistory"}, m = "formatMessage", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.UndoEditAction")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class UndoEditAction$formatMessage$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int label;
/*    */     
/*    */     UndoEditAction$formatMessage$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return UndoEditAction.this.formatMessage(null, null, null, (Continuation)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\UndoEditAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */