/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions.tools;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.Argument;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.ActionRequest;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks.ErrorChecker;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000Z\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\005\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020$\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\003\b\026\030\000 &2\0020\001:\001&B\025\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\004\b\005\020\006J\036\020\022\032\0020\n2\006\020\023\032\0020\0242\006\020\025\032\0020\026H@¢\006\002\020\027J8\020\030\032\0020\n2\f\020\031\032\b\022\004\022\0020\0320\0032\022\020\033\032\016\022\004\022\0020\n\022\004\022\0020\0350\0342\006\020\025\032\0020\026H@¢\006\002\020\036J0\020\037\032\024\022\n\022\b\022\004\022\0020\0320\003\022\004\022\0020!0 2\006\020\023\032\0020\0242\006\020\025\032\0020\026H@¢\006\002\020\027J \020\"\032\004\030\0010\n2\006\020\023\032\0020\0242\006\020\025\032\0020\026H@¢\006\002\020\027J5\020#\032\023\022\004\022\0020\n\022\t\022\0070\035¢\006\002\b$0\0342\f\020\031\032\b\022\004\022\0020\0320\0032\006\020\025\032\0020\026H@¢\006\002\020%R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0160\003X\004¢\006\b\n\000\032\004\b\017\020\bR\024\020\020\032\0020\nX\004¢\006\b\n\000\032\004\b\021\020\f¨\006'"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/tools/SearchReplaceToolAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "errorCheckers", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorChecker;", "<init>", "(Ljava/util/List;)V", "getErrorCheckers", "()Ljava/util/List;", "name", "", "getName", "()Ljava/lang/String;", "arguments", "Lcom/intellij/ml/llm/matterhorn/ej/core/Argument;", "getArguments", "docstring", "getDocstring", "execute", "request", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doExecute", "edits", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/Edit;", "fileNameToDocument", "", "Lcom/intellij/openapi/editor/Document;", "(Ljava/util/List;Ljava/util/Map;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEdits", "Lcom/intellij/ml/llm/matterhorn/ej/core/Result;", "", "reviewActionRequest", "getFilesMap", "Lorg/jetbrains/annotations/Nullable;", "(Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nSearchReplaceToolAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchReplaceToolAction.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/tools/SearchReplaceToolAction\n+ 2 Result.kt\ncom/intellij/ml/llm/matterhorn/ej/core/ResultKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n72#2,5:131\n1557#3:136\n1628#3,3:137\n1187#3,2:140\n1261#3,4:142\n*S KotlinDebug\n*F\n+ 1 SearchReplaceToolAction.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/tools/SearchReplaceToolAction\n*L\n61#1:131,5\n121#1:136\n121#1:137,3\n121#1:140,2\n121#1:142,4\n*E\n"})
/*     */ public class SearchReplaceToolAction implements AgentAction {
/*     */   public SearchReplaceToolAction(@NotNull List<ErrorChecker> errorCheckers) {
/*  18 */     this.errorCheckers = errorCheckers;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  27 */     this.name = "search_replace";
/*     */     
/*  29 */     Argument[] arrayOfArgument = new Argument[3]; arrayOfArgument[0] = new Argument(
/*  30 */         "file_path", 
/*  31 */         ArgumentType.STRING, 
/*  32 */         "The full path of the file that will be modified.", false, false, 24, null);
/*     */     
/*  34 */     arrayOfArgument[1] = new Argument(
/*  35 */         "search", 
/*  36 */         ArgumentType.STRING, 
/*  37 */         "A continuous, yet concise block of lines to search for in the existing source code (*SEARCH* pattern). If this parameter is empty, the lines from `replace` parameter will be added to the end of the file.", false, false, 24, null);
/*     */     
/*  39 */     arrayOfArgument[2] = new Argument(
/*  40 */         "replace", 
/*  41 */         ArgumentType.STRING, 
/*  42 */         "The lines to replace the existing code found using `search` parameter. If this parameter is empty, the lines specified in `search` parameter will be removed.", false, false, 24, null);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     this.arguments = CollectionsKt.listOf((Object[])arrayOfArgument);
/*     */ 
/*     */ 
/*     */     
/*  51 */     this.docstring = "The `search_replace` tool performs a *SEARCH/REPLACE* edit operation on a specified file. \nEach `search` parameter must match the existing source code exactly once, line for line, character for character, including all comments, docstrings, etc.\nInclude enough lines to ensure that the code referred to by the `search` parameter can be uniquely identified.\nDo not use line numbers in `search` and `replace` parameters.";
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   
/*     */   @NotNull
/*     */   private final List<ErrorChecker> errorCheckers;
/*     */   
/*     */   @NotNull
/*     */   private final String name;
/*     */   
/*     */   @NotNull
/*     */   private final List<Argument> arguments;
/*     */   
/*     */   @NotNull
/*     */   private final String docstring;
/*     */   
/*     */   @NotNull
/*     */   public static final String SEARCH_REPLACE_TOOL_ACTION_NAME = "search_replace";
/*     */   
/*     */   @NotNull
/*     */   public static final String FILE_PATH_ARGUMENT = "file_path";
/*     */   @NotNull
/*     */   public static final String SEARCH_ARGUMENT = "search";
/*     */   @NotNull
/*     */   public static final String REPLACE_ARGUMENT = "replace";
/*     */   
/*     */   @NotNull
/*     */   public final List<ErrorChecker> getErrorCheckers() {
/*     */     return this.errorCheckers;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String getCustomSignature() {
/*     */     return AgentAction.DefaultImpls.getCustomSignature(this);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object getInputParams(@NotNull ActionRequest $this$getInputParams, @NotNull Continuation $completion) {
/*     */     return AgentAction.DefaultImpls.getInputParams(this, $this$getInputParams, $completion);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\004\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000R\016\020\007\032\0020\005XT¢\006\002\n\000R\016\020\b\032\0020\005XT¢\006\002\n\000¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/tools/SearchReplaceToolAction$Companion;", "", "<init>", "()V", "SEARCH_REPLACE_TOOL_ACTION_NAME", "", "FILE_PATH_ARGUMENT", "SEARCH_ARGUMENT", "REPLACE_ARGUMENT", "ej-core"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String getName() {
/*     */     return this.name;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public List<Argument> getArguments() {
/*     */     return this.arguments;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String getDocstring() {
/*     */     return this.docstring;
/*     */   }
/*     */   
/*     */   private final Object getEdits(ActionRequest request, ExecutionAgentContext paramExecutionAgentContext, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/tools/SearchReplaceToolAction$getEdits$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/tools/SearchReplaceToolAction$getEdits$1
/*     */     //   11: astore #9
/*     */     //   13: aload #9
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #9
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/actions/tools/SearchReplaceToolAction$getEdits$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/tools/SearchReplaceToolAction;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #9
/*     */     //   50: aload #9
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #8
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #10
/*     */     //   62: aload #9
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 283, 0 -> 88, 1 -> 115
/*     */     //   88: aload #8
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: aload_1
/*     */     //   95: aload #9
/*     */     //   97: aload #9
/*     */     //   99: iconst_1
/*     */     //   100: putfield label : I
/*     */     //   103: invokevirtual getInputParams : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   106: dup
/*     */     //   107: aload #10
/*     */     //   109: if_acmpne -> 122
/*     */     //   112: aload #10
/*     */     //   114: areturn
/*     */     //   115: aload #8
/*     */     //   117: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   120: aload #8
/*     */     //   122: checkcast java/util/Map
/*     */     //   125: astore #4
/*     */     //   127: aload #4
/*     */     //   129: ldc 'file_path'
/*     */     //   131: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   136: checkcast com/intellij/ml/llm/matterhorn/llm/ParameterValue
/*     */     //   139: invokestatic tryGetNonEmptyStringValue : (Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;)Ljava/lang/String;
/*     */     //   142: dup
/*     */     //   143: ifnonnull -> 154
/*     */     //   146: pop
/*     */     //   147: ldc_w 'file_path parameter is missing'
/*     */     //   150: invokestatic errorResult : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/Result$Err;
/*     */     //   153: areturn
/*     */     //   154: astore #5
/*     */     //   156: aload #4
/*     */     //   158: ldc 'search'
/*     */     //   160: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   165: checkcast com/intellij/ml/llm/matterhorn/llm/ParameterValue
/*     */     //   168: invokestatic tryGetStringValue : (Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;)Ljava/lang/String;
/*     */     //   171: dup
/*     */     //   172: ifnonnull -> 183
/*     */     //   175: pop
/*     */     //   176: ldc_w 'search parameter is missing'
/*     */     //   179: invokestatic errorResult : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/Result$Err;
/*     */     //   182: areturn
/*     */     //   183: astore #6
/*     */     //   185: aload #4
/*     */     //   187: ldc 'replace'
/*     */     //   189: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   194: checkcast com/intellij/ml/llm/matterhorn/llm/ParameterValue
/*     */     //   197: invokestatic tryGetStringValue : (Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;)Ljava/lang/String;
/*     */     //   200: dup
/*     */     //   201: ifnonnull -> 212
/*     */     //   204: pop
/*     */     //   205: ldc_w 'replace parameter is missing'
/*     */     //   208: invokestatic errorResult : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/Result$Err;
/*     */     //   211: areturn
/*     */     //   212: astore #7
/*     */     //   214: aload #6
/*     */     //   216: checkcast java/lang/CharSequence
/*     */     //   219: invokeinterface length : ()I
/*     */     //   224: ifne -> 231
/*     */     //   227: iconst_1
/*     */     //   228: goto -> 232
/*     */     //   231: iconst_0
/*     */     //   232: ifeq -> 263
/*     */     //   235: aload #7
/*     */     //   237: checkcast java/lang/CharSequence
/*     */     //   240: invokeinterface length : ()I
/*     */     //   245: ifne -> 252
/*     */     //   248: iconst_1
/*     */     //   249: goto -> 253
/*     */     //   252: iconst_0
/*     */     //   253: ifeq -> 263
/*     */     //   256: ldc_w 'search and replace parameters are both empty'
/*     */     //   259: invokestatic errorResult : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/Result$Err;
/*     */     //   262: areturn
/*     */     //   263: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/Edit
/*     */     //   266: dup
/*     */     //   267: aload #5
/*     */     //   269: aload #6
/*     */     //   271: aload #7
/*     */     //   273: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   276: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   279: invokestatic successResult : (Ljava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/ej/core/Result$Ok;
/*     */     //   282: areturn
/*     */     //   283: new java/lang/IllegalStateException
/*     */     //   286: dup
/*     */     //   287: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   289: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   292: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #84	-> 60
/*     */     //   #85	-> 93
/*     */     //   #84	-> 112
/*     */     //   #87	-> 127
/*     */     //   #88	-> 156
/*     */     //   #89	-> 185
/*     */     //   #90	-> 214
/*     */     //   #90	-> 232
/*     */     //   #90	-> 253
/*     */     //   #91	-> 256
/*     */     //   #94	-> 263
/*     */     //   #84	-> 283
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	13	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/tools/SearchReplaceToolAction;
/*     */     //   93	13	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   127	19	4	params	Ljava/util/Map;
/*     */     //   154	21	4	params	Ljava/util/Map;
/*     */     //   183	17	4	params	Ljava/util/Map;
/*     */     //   156	19	5	filePath	Ljava/lang/String;
/*     */     //   183	21	5	filePath	Ljava/lang/String;
/*     */     //   212	20	5	filePath	Ljava/lang/String;
/*     */     //   232	21	5	filePath	Ljava/lang/String;
/*     */     //   253	3	5	filePath	Ljava/lang/String;
/*     */     //   263	20	5	filePath	Ljava/lang/String;
/*     */     //   185	19	6	searchString	Ljava/lang/String;
/*     */     //   212	20	6	searchString	Ljava/lang/String;
/*     */     //   232	21	6	searchString	Ljava/lang/String;
/*     */     //   253	3	6	searchString	Ljava/lang/String;
/*     */     //   263	20	6	searchString	Ljava/lang/String;
/*     */     //   214	18	7	replaceString	Ljava/lang/String;
/*     */     //   232	21	7	replaceString	Ljava/lang/String;
/*     */     //   253	3	7	replaceString	Ljava/lang/String;
/*     */     //   263	20	7	replaceString	Ljava/lang/String;
/*     */     //   0	293	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	233	9	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	226	8	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object getFilesMap(@NotNull List edits, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/tools/SearchReplaceToolAction$getFilesMap$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/tools/SearchReplaceToolAction$getFilesMap$1
/*     */     //   11: astore #19
/*     */     //   13: aload #19
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #19
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/actions/tools/SearchReplaceToolAction$getFilesMap$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/tools/SearchReplaceToolAction;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #19
/*     */     //   50: aload #19
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #18
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #20
/*     */     //   62: aload #19
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 667, 0 -> 92, 1 -> 351, 2 -> 543
/*     */     //   92: aload #18
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_1
/*     */     //   98: checkcast java/lang/Iterable
/*     */     //   101: astore #4
/*     */     //   103: iconst_0
/*     */     //   104: istore #5
/*     */     //   106: aload #4
/*     */     //   108: astore #6
/*     */     //   110: new java/util/ArrayList
/*     */     //   113: dup
/*     */     //   114: aload #4
/*     */     //   116: bipush #10
/*     */     //   118: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   121: invokespecial <init> : (I)V
/*     */     //   124: checkcast java/util/Collection
/*     */     //   127: astore #7
/*     */     //   129: iconst_0
/*     */     //   130: istore #8
/*     */     //   132: aload #6
/*     */     //   134: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   139: astore #9
/*     */     //   141: aload #9
/*     */     //   143: invokeinterface hasNext : ()Z
/*     */     //   148: ifeq -> 191
/*     */     //   151: aload #9
/*     */     //   153: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   158: astore #10
/*     */     //   160: aload #7
/*     */     //   162: aload #10
/*     */     //   164: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/Edit
/*     */     //   167: astore #11
/*     */     //   169: astore #17
/*     */     //   171: iconst_0
/*     */     //   172: istore #12
/*     */     //   174: aload #11
/*     */     //   176: invokevirtual getFileName : ()Ljava/lang/String;
/*     */     //   179: aload #17
/*     */     //   181: swap
/*     */     //   182: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   187: pop
/*     */     //   188: goto -> 141
/*     */     //   191: aload #7
/*     */     //   193: checkcast java/util/List
/*     */     //   196: nop
/*     */     //   197: checkcast java/lang/Iterable
/*     */     //   200: invokestatic distinct : (Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   203: checkcast java/lang/Iterable
/*     */     //   206: astore #4
/*     */     //   208: iconst_0
/*     */     //   209: istore #5
/*     */     //   211: aload #4
/*     */     //   213: bipush #10
/*     */     //   215: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   218: invokestatic mapCapacity : (I)I
/*     */     //   221: bipush #16
/*     */     //   223: invokestatic coerceAtLeast : (II)I
/*     */     //   226: istore #6
/*     */     //   228: aload #4
/*     */     //   230: astore #7
/*     */     //   232: new java/util/LinkedHashMap
/*     */     //   235: dup
/*     */     //   236: iload #6
/*     */     //   238: invokespecial <init> : (I)V
/*     */     //   241: checkcast java/util/Map
/*     */     //   244: astore #8
/*     */     //   246: iconst_0
/*     */     //   247: istore #9
/*     */     //   249: aload #7
/*     */     //   251: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   256: astore #10
/*     */     //   258: aload #10
/*     */     //   260: invokeinterface hasNext : ()Z
/*     */     //   265: ifeq -> 663
/*     */     //   268: aload #10
/*     */     //   270: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   275: astore #11
/*     */     //   277: aload #8
/*     */     //   279: astore #12
/*     */     //   281: aload #11
/*     */     //   283: checkcast java/lang/String
/*     */     //   286: astore #13
/*     */     //   288: iconst_0
/*     */     //   289: istore #14
/*     */     //   291: aload #13
/*     */     //   293: aload_2
/*     */     //   294: iconst_0
/*     */     //   295: aload #19
/*     */     //   297: iconst_4
/*     */     //   298: aconst_null
/*     */     //   299: aload #19
/*     */     //   301: aload_2
/*     */     //   302: putfield L$0 : Ljava/lang/Object;
/*     */     //   305: aload #19
/*     */     //   307: aload #8
/*     */     //   309: putfield L$1 : Ljava/lang/Object;
/*     */     //   312: aload #19
/*     */     //   314: aload #10
/*     */     //   316: putfield L$2 : Ljava/lang/Object;
/*     */     //   319: aload #19
/*     */     //   321: aload #12
/*     */     //   323: putfield L$3 : Ljava/lang/Object;
/*     */     //   326: aload #19
/*     */     //   328: aload #13
/*     */     //   330: putfield L$4 : Ljava/lang/Object;
/*     */     //   333: aload #19
/*     */     //   335: iconst_1
/*     */     //   336: putfield label : I
/*     */     //   339: invokestatic smartLocateFile$default : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   342: dup
/*     */     //   343: aload #20
/*     */     //   345: if_acmpne -> 416
/*     */     //   348: aload #20
/*     */     //   350: areturn
/*     */     //   351: iconst_0
/*     */     //   352: istore #5
/*     */     //   354: iconst_0
/*     */     //   355: istore #9
/*     */     //   357: iconst_0
/*     */     //   358: istore #14
/*     */     //   360: aload #19
/*     */     //   362: getfield L$4 : Ljava/lang/Object;
/*     */     //   365: checkcast java/lang/String
/*     */     //   368: astore #13
/*     */     //   370: aload #19
/*     */     //   372: getfield L$3 : Ljava/lang/Object;
/*     */     //   375: checkcast java/util/Map
/*     */     //   378: astore #12
/*     */     //   380: aload #19
/*     */     //   382: getfield L$2 : Ljava/lang/Object;
/*     */     //   385: checkcast java/util/Iterator
/*     */     //   388: astore #10
/*     */     //   390: aload #19
/*     */     //   392: getfield L$1 : Ljava/lang/Object;
/*     */     //   395: checkcast java/util/Map
/*     */     //   398: astore #8
/*     */     //   400: aload #19
/*     */     //   402: getfield L$0 : Ljava/lang/Object;
/*     */     //   405: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   408: astore_2
/*     */     //   409: aload #18
/*     */     //   411: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   414: aload #18
/*     */     //   416: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*     */     //   419: astore #15
/*     */     //   421: aload #15
/*     */     //   423: instanceof com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*     */     //   426: ifeq -> 450
/*     */     //   429: new java/lang/IllegalStateException
/*     */     //   432: dup
/*     */     //   433: aload #15
/*     */     //   435: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*     */     //   438: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   441: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   446: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   449: athrow
/*     */     //   450: aload #15
/*     */     //   452: instanceof com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*     */     //   455: ifeq -> 472
/*     */     //   458: aload #15
/*     */     //   460: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*     */     //   463: invokevirtual getValue : ()Ljava/lang/Object;
/*     */     //   466: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   469: goto -> 480
/*     */     //   472: new kotlin/NoWhenBranchMatchedException
/*     */     //   475: dup
/*     */     //   476: invokespecial <init> : ()V
/*     */     //   479: athrow
/*     */     //   480: astore #16
/*     */     //   482: aload #16
/*     */     //   484: <illegal opcode> invoke : (Lcom/intellij/openapi/vfs/VirtualFile;)Lkotlin/jvm/functions/Function0;
/*     */     //   489: aload #19
/*     */     //   491: aload #19
/*     */     //   493: aload_2
/*     */     //   494: putfield L$0 : Ljava/lang/Object;
/*     */     //   497: aload #19
/*     */     //   499: aload #8
/*     */     //   501: putfield L$1 : Ljava/lang/Object;
/*     */     //   504: aload #19
/*     */     //   506: aload #10
/*     */     //   508: putfield L$2 : Ljava/lang/Object;
/*     */     //   511: aload #19
/*     */     //   513: aload #12
/*     */     //   515: putfield L$3 : Ljava/lang/Object;
/*     */     //   518: aload #19
/*     */     //   520: aload #13
/*     */     //   522: putfield L$4 : Ljava/lang/Object;
/*     */     //   525: aload #19
/*     */     //   527: iconst_2
/*     */     //   528: putfield label : I
/*     */     //   531: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   534: dup
/*     */     //   535: aload #20
/*     */     //   537: if_acmpne -> 608
/*     */     //   540: aload #20
/*     */     //   542: areturn
/*     */     //   543: iconst_0
/*     */     //   544: istore #5
/*     */     //   546: iconst_0
/*     */     //   547: istore #9
/*     */     //   549: iconst_0
/*     */     //   550: istore #14
/*     */     //   552: aload #19
/*     */     //   554: getfield L$4 : Ljava/lang/Object;
/*     */     //   557: checkcast java/lang/String
/*     */     //   560: astore #13
/*     */     //   562: aload #19
/*     */     //   564: getfield L$3 : Ljava/lang/Object;
/*     */     //   567: checkcast java/util/Map
/*     */     //   570: astore #12
/*     */     //   572: aload #19
/*     */     //   574: getfield L$2 : Ljava/lang/Object;
/*     */     //   577: checkcast java/util/Iterator
/*     */     //   580: astore #10
/*     */     //   582: aload #19
/*     */     //   584: getfield L$1 : Ljava/lang/Object;
/*     */     //   587: checkcast java/util/Map
/*     */     //   590: astore #8
/*     */     //   592: aload #19
/*     */     //   594: getfield L$0 : Ljava/lang/Object;
/*     */     //   597: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   600: astore_2
/*     */     //   601: aload #18
/*     */     //   603: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   606: aload #18
/*     */     //   608: checkcast com/intellij/openapi/editor/Document
/*     */     //   611: dup
/*     */     //   612: ifnonnull -> 631
/*     */     //   615: pop
/*     */     //   616: new java/lang/IllegalStateException
/*     */     //   619: dup
/*     */     //   620: aload #13
/*     */     //   622: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   627: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   630: athrow
/*     */     //   631: astore #15
/*     */     //   633: aload #13
/*     */     //   635: aload #15
/*     */     //   637: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*     */     //   640: astore #13
/*     */     //   642: aload #12
/*     */     //   644: aload #13
/*     */     //   646: invokevirtual getFirst : ()Ljava/lang/Object;
/*     */     //   649: aload #13
/*     */     //   651: invokevirtual getSecond : ()Ljava/lang/Object;
/*     */     //   654: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   659: pop
/*     */     //   660: goto -> 258
/*     */     //   663: aload #8
/*     */     //   665: nop
/*     */     //   666: areturn
/*     */     //   667: new java/lang/IllegalStateException
/*     */     //   670: dup
/*     */     //   671: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   673: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   676: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #120	-> 60
/*     */     //   #121	-> 97
/*     */     //   #136	-> 106
/*     */     //   #137	-> 132
/*     */     //   #138	-> 160
/*     */     //   #121	-> 174
/*     */     //   #138	-> 182
/*     */     //   #139	-> 191
/*     */     //   #136	-> 196
/*     */     //   #121	-> 200
/*     */     //   #140	-> 211
/*     */     //   #141	-> 228
/*     */     //   #142	-> 249
/*     */     //   #143	-> 277
/*     */     //   #122	-> 291
/*     */     //   #120	-> 348
/*     */     //   #123	-> 421
/*     */     //   #124	-> 450
/*     */     //   #122	-> 472
/*     */     //   #126	-> 482
/*     */     //   #120	-> 540
/*     */     //   #126	-> 608
/*     */     //   #127	-> 616
/*     */     //   #126	-> 631
/*     */     //   #128	-> 633
/*     */     //   #143	-> 640
/*     */     //   #145	-> 663
/*     */     //   #141	-> 665
/*     */     //   #129	-> 666
/*     */     //   #120	-> 667
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	6	1	edits	Ljava/util/List;
/*     */     //   97	82	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   179	18	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   197	154	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   409	134	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   601	66	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   103	26	4	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   208	38	4	$this$associate$iv	Ljava/lang/Iterable;
/*     */     //   129	12	6	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   228	18	6	capacity$iv	I
/*     */     //   129	64	7	destination$iv$iv	Ljava/util/Collection;
/*     */     //   246	12	7	$this$associateTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   246	105	8	destination$iv$iv	Ljava/util/Map;
/*     */     //   400	143	8	destination$iv$iv	Ljava/util/Map;
/*     */     //   592	73	8	destination$iv$iv	Ljava/util/Map;
/*     */     //   160	28	10	item$iv$iv	Ljava/lang/Object;
/*     */     //   171	8	11	it	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/Edit;
/*     */     //   277	11	11	element$iv$iv	Ljava/lang/Object;
/*     */     //   288	63	13	it	Ljava/lang/String;
/*     */     //   370	173	13	it	Ljava/lang/String;
/*     */     //   562	78	13	it	Ljava/lang/String;
/*     */     //   421	59	15	res	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*     */     //   633	7	15	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   482	52	16	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   174	5	12	$i$a$-map-SearchReplaceToolAction$getFilesMap$2	I
/*     */     //   132	61	8	$i$f$mapTo	I
/*     */     //   106	91	5	$i$f$map	I
/*     */     //   291	60	14	$i$a$-associate-SearchReplaceToolAction$getFilesMap$3	I
/*     */     //   249	102	9	$i$f$associateTo	I
/*     */     //   211	140	5	$i$f$associate	I
/*     */     //   0	677	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	617	19	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	610	18	$result	Ljava/lang/Object;
/*     */     //   360	183	14	$i$a$-associate-SearchReplaceToolAction$getFilesMap$3	I
/*     */     //   357	186	9	$i$f$associateTo	I
/*     */     //   354	189	5	$i$f$associate	I
/*     */     //   552	88	14	$i$a$-associate-SearchReplaceToolAction$getFilesMap$3	I
/*     */     //   549	116	9	$i$f$associateTo	I
/*     */     //   546	120	5	$i$f$associate	I
/*     */   }
/*     */   
/*     */   private static final Document getFilesMap$lambda$3$lambda$2(VirtualFile $file) {
/* 126 */     return FileDocumentManager.getInstance().getDocument($file);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object execute(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation<? super String> $completion) {
/*     */     return execute$suspendImpl(this, request, context, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object doExecute(@NotNull List<Edit> edits, @NotNull Map<String, ? extends Document> fileNameToDocument, @NotNull ExecutionAgentContext context, @NotNull Continuation<? super String> $completion) {
/*     */     return doExecute$suspendImpl(this, edits, fileNameToDocument, context, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object reviewActionRequest(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation<? super String> $completion) {
/*     */     return reviewActionRequest$suspendImpl(this, request, context, $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "SearchReplaceToolAction.kt", l = {55, 61, 70}, i = {0, 0, 1, 1, 1}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"}, n = {"$this", "context", "$this", "context", "edits"}, m = "execute$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.tools.SearchReplaceToolAction")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class SearchReplaceToolAction$execute$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int label;
/*     */     
/*     */     SearchReplaceToolAction$execute$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return SearchReplaceToolAction.execute$suspendImpl(SearchReplaceToolAction.this, null, null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "SearchReplaceToolAction.kt", l = {85}, i = {}, s = {}, n = {}, m = "getEdits", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.tools.SearchReplaceToolAction")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class SearchReplaceToolAction$getEdits$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     SearchReplaceToolAction$getEdits$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return SearchReplaceToolAction.this.getEdits(null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "SearchReplaceToolAction.kt", l = {122, 126}, i = {0, 0, 0, 1, 1, 1}, s = {"L$0", "L$1", "L$4", "L$0", "L$1", "L$4"}, n = {"context", "destination$iv$iv", "it", "context", "destination$iv$iv", "it"}, m = "getFilesMap", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.tools.SearchReplaceToolAction")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class SearchReplaceToolAction$getFilesMap$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     int label;
/*     */     
/*     */     SearchReplaceToolAction$getFilesMap$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return SearchReplaceToolAction.this.getFilesMap(null, null, (Continuation<? super Map<String, ? extends Document>>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "SearchReplaceToolAction.kt", l = {99, 103, 107}, i = {0, 0, 1, 1, 1}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"}, n = {"$this", "context", "$this", "context", "edits"}, m = "reviewActionRequest$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.tools.SearchReplaceToolAction")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class SearchReplaceToolAction$reviewActionRequest$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int label;
/*     */     
/*     */     SearchReplaceToolAction$reviewActionRequest$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return SearchReplaceToolAction.reviewActionRequest$suspendImpl(SearchReplaceToolAction.this, null, null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\tools\SearchReplaceToolAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */