/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.actions;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentAction;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.actions.ActionRequest;
/*    */ import com.intellij.psi.PsiClass;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\002\b\003\030\000 \0252\0020\001:\001\025B\007¢\006\004\b\002\020\003J\036\020\017\032\0020\0052\006\020\020\032\0020\0212\006\020\022\032\0020\023H@¢\006\002\020\024R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007R\032\020\b\032\b\022\004\022\0020\n0\t8VX\004¢\006\006\032\004\b\013\020\fR\024\020\r\032\0020\0058VX\004¢\006\006\032\004\b\016\020\007¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/FindRelatedTestAgentAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "arguments", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/Argument;", "getArguments", "()Ljava/util/List;", "docstring", "getDocstring", "execute", "request", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ej-idea"})
/*    */ public final class FindRelatedTestAgentAction implements AgentAction {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @Nullable
/* 16 */   public Object getInputParams(@NotNull ActionRequest $this$getInputParams, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.getInputParams(this, $this$getInputParams, $completion); } @NotNull public static final String CLASS_FQN_ARGUMENT = "class_fqn"; @Nullable public Object reviewActionRequest(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.reviewActionRequest(this, request, context, $completion); } @NotNull public String getCustomSignature() { return AgentAction.DefaultImpls.getCustomSignature(this); }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/FindRelatedTestAgentAction$Companion;", "", "<init>", "()V", "CLASS_FQN_ARGUMENT", "", "ej-idea"})
/*    */   public static final class Companion {
/*    */     private Companion() {} }
/*    */   @NotNull
/* 22 */   public String getName() { return "find_related_test"; } @NotNull
/*    */   public List<Argument> getArguments() {
/* 24 */     return CollectionsKt.listOf(
/* 25 */         new Argument(
/* 26 */           "class_fqn", 
/* 27 */           ArgumentType.STRING, 
/* 28 */           "Fully qualified name of the class, to find related tests for", false, false, 24, null));
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public String getDocstring() {
/* 34 */     return "Searches related JVM test classes to the current one using IDE heuristics.";
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object execute(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/actions/FindRelatedTestAgentAction$execute$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/FindRelatedTestAgentAction$execute$1
/*    */     //   11: astore #15
/*    */     //   13: aload #15
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #15
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/idea/actions/FindRelatedTestAgentAction$execute$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/FindRelatedTestAgentAction;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #15
/*    */     //   50: aload #15
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #14
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #16
/*    */     //   62: aload #15
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 429, 0 -> 96, 1 -> 129, 2 -> 243, 3 -> 329
/*    */     //   96: aload #14
/*    */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   101: aload_0
/*    */     //   102: aload_1
/*    */     //   103: aload #15
/*    */     //   105: aload #15
/*    */     //   107: aload_2
/*    */     //   108: putfield L$0 : Ljava/lang/Object;
/*    */     //   111: aload #15
/*    */     //   113: iconst_1
/*    */     //   114: putfield label : I
/*    */     //   117: invokevirtual getInputParams : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   120: dup
/*    */     //   121: aload #16
/*    */     //   123: if_acmpne -> 145
/*    */     //   126: aload #16
/*    */     //   128: areturn
/*    */     //   129: aload #15
/*    */     //   131: getfield L$0 : Ljava/lang/Object;
/*    */     //   134: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*    */     //   137: astore_2
/*    */     //   138: aload #14
/*    */     //   140: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   143: aload #14
/*    */     //   145: checkcast java/util/Map
/*    */     //   148: astore #4
/*    */     //   150: aload #4
/*    */     //   152: ldc 'class_fqn'
/*    */     //   154: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   159: checkcast com/intellij/ml/llm/matterhorn/llm/ParameterValue
/*    */     //   162: invokestatic tryGetNonEmptyStringValue : (Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;)Ljava/lang/String;
/*    */     //   165: dup
/*    */     //   166: ifnonnull -> 173
/*    */     //   169: pop
/*    */     //   170: ldc 'ERROR: class fqn is missing'
/*    */     //   172: areturn
/*    */     //   173: astore #5
/*    */     //   175: aload_2
/*    */     //   176: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   181: astore #6
/*    */     //   183: aload #6
/*    */     //   185: invokestatic projectScope : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/psi/search/GlobalSearchScope;
/*    */     //   188: dup
/*    */     //   189: ldc 'projectScope(...)'
/*    */     //   191: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   194: astore #7
/*    */     //   196: aload #6
/*    */     //   198: aload #6
/*    */     //   200: aload #5
/*    */     //   202: aload #7
/*    */     //   204: <illegal opcode> invoke : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Lcom/intellij/psi/search/GlobalSearchScope;)Lkotlin/jvm/functions/Function0;
/*    */     //   209: aload #15
/*    */     //   211: aload #15
/*    */     //   213: aload #5
/*    */     //   215: putfield L$0 : Ljava/lang/Object;
/*    */     //   218: aload #15
/*    */     //   220: aload #6
/*    */     //   222: putfield L$1 : Ljava/lang/Object;
/*    */     //   225: aload #15
/*    */     //   227: iconst_2
/*    */     //   228: putfield label : I
/*    */     //   231: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   234: dup
/*    */     //   235: aload #16
/*    */     //   237: if_acmpne -> 270
/*    */     //   240: aload #16
/*    */     //   242: areturn
/*    */     //   243: aload #15
/*    */     //   245: getfield L$1 : Ljava/lang/Object;
/*    */     //   248: checkcast com/intellij/openapi/project/Project
/*    */     //   251: astore #6
/*    */     //   253: aload #15
/*    */     //   255: getfield L$0 : Ljava/lang/Object;
/*    */     //   258: checkcast java/lang/String
/*    */     //   261: astore #5
/*    */     //   263: aload #14
/*    */     //   265: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   268: aload #14
/*    */     //   270: checkcast com/intellij/psi/PsiClass
/*    */     //   273: dup
/*    */     //   274: ifnonnull -> 286
/*    */     //   277: pop
/*    */     //   278: aload #5
/*    */     //   280: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   285: areturn
/*    */     //   286: astore #8
/*    */     //   288: aload #6
/*    */     //   290: aload #8
/*    */     //   292: <illegal opcode> invoke : (Lcom/intellij/psi/PsiClass;)Lkotlin/jvm/functions/Function0;
/*    */     //   297: aload #15
/*    */     //   299: aload #15
/*    */     //   301: aconst_null
/*    */     //   302: putfield L$0 : Ljava/lang/Object;
/*    */     //   305: aload #15
/*    */     //   307: aconst_null
/*    */     //   308: putfield L$1 : Ljava/lang/Object;
/*    */     //   311: aload #15
/*    */     //   313: iconst_3
/*    */     //   314: putfield label : I
/*    */     //   317: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   320: dup
/*    */     //   321: aload #16
/*    */     //   323: if_acmpne -> 336
/*    */     //   326: aload #16
/*    */     //   328: areturn
/*    */     //   329: aload #14
/*    */     //   331: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   334: aload #14
/*    */     //   336: checkcast com/intellij/openapi/vfs/VirtualFile
/*    */     //   339: astore #9
/*    */     //   341: aload #9
/*    */     //   343: dup
/*    */     //   344: ifnull -> 353
/*    */     //   347: invokestatic toNioPathOrNull : (Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/nio/file/Path;
/*    */     //   350: goto -> 355
/*    */     //   353: pop
/*    */     //   354: aconst_null
/*    */     //   355: astore #10
/*    */     //   357: aload #9
/*    */     //   359: ifnull -> 367
/*    */     //   362: aload #10
/*    */     //   364: ifnonnull -> 370
/*    */     //   367: ldc 'Failed to find related files using heuristics, try doing it manually'
/*    */     //   369: areturn
/*    */     //   370: new java/lang/StringBuilder
/*    */     //   373: dup
/*    */     //   374: invokespecial <init> : ()V
/*    */     //   377: astore #11
/*    */     //   379: aload #11
/*    */     //   381: astore #12
/*    */     //   383: iconst_0
/*    */     //   384: istore #13
/*    */     //   386: aload #12
/*    */     //   388: aload #10
/*    */     //   390: <illegal opcode> makeConcatWithConstants : (Ljava/nio/file/Path;)Ljava/lang/String;
/*    */     //   395: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   398: dup
/*    */     //   399: ldc 'append(...)'
/*    */     //   401: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   404: bipush #10
/*    */     //   406: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   409: dup
/*    */     //   410: ldc 'append(...)'
/*    */     //   412: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   415: pop
/*    */     //   416: nop
/*    */     //   417: aload #11
/*    */     //   419: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   422: dup
/*    */     //   423: ldc 'toString(...)'
/*    */     //   425: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   428: areturn
/*    */     //   429: new java/lang/IllegalStateException
/*    */     //   432: dup
/*    */     //   433: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   435: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   438: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #36	-> 60
/*    */     //   #40	-> 101
/*    */     //   #36	-> 126
/*    */     //   #41	-> 150
/*    */     //   #43	-> 175
/*    */     //   #44	-> 183
/*    */     //   #45	-> 196
/*    */     //   #36	-> 240
/*    */     //   #45	-> 270
/*    */     //   #47	-> 278
/*    */     //   #45	-> 286
/*    */     //   #49	-> 288
/*    */     //   #36	-> 326
/*    */     //   #53	-> 341
/*    */     //   #54	-> 357
/*    */     //   #55	-> 367
/*    */     //   #58	-> 370
/*    */     //   #59	-> 386
/*    */     //   #60	-> 416
/*    */     //   #58	-> 417
/*    */     //   #58	-> 428
/*    */     //   #36	-> 429
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   101	19	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/FindRelatedTestAgentAction;
/*    */     //   101	19	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*    */     //   101	28	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   138	31	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   173	10	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   150	15	4	params	Ljava/util/Map;
/*    */     //   175	68	5	fqn	Ljava/lang/String;
/*    */     //   263	14	5	fqn	Ljava/lang/String;
/*    */     //   277	9	5	fqn	Ljava/lang/String;
/*    */     //   183	60	6	project	Lcom/intellij/openapi/project/Project;
/*    */     //   253	24	6	project	Lcom/intellij/openapi/project/Project;
/*    */     //   286	34	6	project	Lcom/intellij/openapi/project/Project;
/*    */     //   196	38	7	scope	Lcom/intellij/psi/search/GlobalSearchScope;
/*    */     //   288	32	8	psiClass	Lcom/intellij/psi/PsiClass;
/*    */     //   341	26	9	virtualFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   357	10	10	path	Ljava/nio/file/Path;
/*    */     //   370	59	10	path	Ljava/nio/file/Path;
/*    */     //   383	34	12	$this$execute_u24lambda_u242	Ljava/lang/StringBuilder;
/*    */     //   386	31	13	$i$a$-buildString-FindRelatedTestAgentAction$execute$2	I
/*    */     //   0	439	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	379	15	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	372	14	$result	Ljava/lang/Object;
/*    */   }
/*    */ 
/*    */   
/*    */   private static final PsiClass execute$lambda$0(Project $project, String $fqn, GlobalSearchScope $scope) {
/* 46 */     return JavaPsiFacade.getInstance($project).findClass($fqn, $scope);
/*    */   }
/*    */   
/*    */   private static final VirtualFile execute$lambda$1(PsiClass $psiClass) {
/* 50 */     TestFinderHelper.findSourceElement((PsiElement)$psiClass).getContainingFile(); return (TestFinderHelper.findSourceElement((PsiElement)$psiClass) != null && TestFinderHelper.findSourceElement((PsiElement)$psiClass).getContainingFile() != null) ? TestFinderHelper.findSourceElement((PsiElement)$psiClass).getContainingFile().getVirtualFile() : null;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "FindRelatedTestAgentAction.kt", l = {40, 45, 49}, i = {0, 1, 1}, s = {"L$0", "L$0", "L$1"}, n = {"context", "fqn", "project"}, m = "execute", c = "com.intellij.ml.llm.matterhorn.ej.idea.actions.FindRelatedTestAgentAction")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class FindRelatedTestAgentAction$execute$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     FindRelatedTestAgentAction$execute$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return FindRelatedTestAgentAction.this.execute(null, null, (Continuation<? super String>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\FindRelatedTestAgentAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */