/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentAction;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.Argument;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\002\b\003\030\000 \0252\0020\001:\001\025B\007¢\006\004\b\002\020\003J\036\020\017\032\0020\0052\006\020\020\032\0020\0212\006\020\022\032\0020\023H@¢\006\002\020\024R\024\020\004\032\0020\005XD¢\006\b\n\000\032\004\b\006\020\007R\032\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\b\n\000\032\004\b\013\020\fR\024\020\r\032\0020\005XD¢\006\b\n\000\032\004\b\016\020\007¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/GotoLineAgentAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "arguments", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/Argument;", "getArguments", "()Ljava/util/List;", "docstring", "getDocstring", "execute", "request", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ej-core"})
/*    */ public final class GotoLineAgentAction implements AgentAction {
/*    */   @NotNull
/* 14 */   public String getCustomSignature() { return AgentAction.DefaultImpls.getCustomSignature(this); } @NotNull public static final Companion Companion = new Companion(null); @Nullable public Object getInputParams(@NotNull ActionRequest $this$getInputParams, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.getInputParams(this, $this$getInputParams, $completion); } @Nullable public Object reviewActionRequest(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.reviewActionRequest(this, request, context, $completion); }
/*    */    @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/GotoLineAgentAction$Companion;", "", "<init>", "()V", "LINE_NUMBER_ARGUMENT", "", "ej-core"})
/*    */   public static final class Companion {
/*    */     private Companion() {} } @NotNull
/* 18 */   private final String name = "goto"; @NotNull public String getName() { return this.name; } @NotNull
/* 19 */   private final List<Argument> arguments = CollectionsKt.listOf(
/* 20 */       new Argument(
/* 21 */         "line_number", 
/* 22 */         ArgumentType.INTEGER, 
/* 23 */         "the line number to move the view window to", false, false, 24, null)); @NotNull
/*    */   public List<Argument> getArguments() { return this.arguments; }
/*    */   @NotNull
/* 26 */   private final String docstring = "scrolls current file to show `<line_number>`. Use this command if you want to view particular fragment of the currently open file"; @NotNull public static final String LINE_NUMBER_ARGUMENT = "line_number"; @NotNull public String getDocstring() { return this.docstring; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object execute(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/GotoLineAgentAction$execute$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/GotoLineAgentAction$execute$1
/*    */     //   11: astore #10
/*    */     //   13: aload #10
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #10
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/actions/GotoLineAgentAction$execute$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/GotoLineAgentAction;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #10
/*    */     //   50: aload #10
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #9
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #11
/*    */     //   62: aload #10
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 495, 0 -> 96, 1 -> 138, 2 -> 252, 3 -> 487
/*    */     //   96: aload #9
/*    */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   101: ldc 'Navigating in file'
/*    */     //   103: getstatic com/intellij/ml/llm/matterhorn/ej/core/StepType.Info : Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*    */     //   106: aload_2
/*    */     //   107: invokestatic emitMetadata : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;)V
/*    */     //   110: aload_0
/*    */     //   111: aload_1
/*    */     //   112: aload #10
/*    */     //   114: aload #10
/*    */     //   116: aload_2
/*    */     //   117: putfield L$0 : Ljava/lang/Object;
/*    */     //   120: aload #10
/*    */     //   122: iconst_1
/*    */     //   123: putfield label : I
/*    */     //   126: invokevirtual getInputParams : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   129: dup
/*    */     //   130: aload #11
/*    */     //   132: if_acmpne -> 154
/*    */     //   135: aload #11
/*    */     //   137: areturn
/*    */     //   138: aload #10
/*    */     //   140: getfield L$0 : Ljava/lang/Object;
/*    */     //   143: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*    */     //   146: astore_2
/*    */     //   147: aload #9
/*    */     //   149: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   152: aload #9
/*    */     //   154: checkcast java/util/Map
/*    */     //   157: astore #4
/*    */     //   159: aload #4
/*    */     //   161: ldc 'line_number'
/*    */     //   163: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   168: checkcast com/intellij/ml/llm/matterhorn/llm/ParameterValue
/*    */     //   171: invokestatic tryGetIntValue : (Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;)Ljava/lang/Integer;
/*    */     //   174: astore #5
/*    */     //   176: aload #5
/*    */     //   178: ifnonnull -> 189
/*    */     //   181: aload #5
/*    */     //   183: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Integer;)Ljava/lang/String;
/*    */     //   188: areturn
/*    */     //   189: aload_2
/*    */     //   190: invokeinterface getCurrentScreenPosition : ()Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;
/*    */     //   195: astore #6
/*    */     //   197: aload #6
/*    */     //   199: ifnonnull -> 205
/*    */     //   202: ldc 'ERROR: No file open. Use open command first'
/*    */     //   204: areturn
/*    */     //   205: aload #6
/*    */     //   207: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;)Lkotlin/jvm/functions/Function0;
/*    */     //   212: aload #10
/*    */     //   214: aload #10
/*    */     //   216: aload_2
/*    */     //   217: putfield L$0 : Ljava/lang/Object;
/*    */     //   220: aload #10
/*    */     //   222: aload #5
/*    */     //   224: putfield L$1 : Ljava/lang/Object;
/*    */     //   227: aload #10
/*    */     //   229: aload #6
/*    */     //   231: putfield L$2 : Ljava/lang/Object;
/*    */     //   234: aload #10
/*    */     //   236: iconst_2
/*    */     //   237: putfield label : I
/*    */     //   240: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   243: dup
/*    */     //   244: aload #11
/*    */     //   246: if_acmpne -> 288
/*    */     //   249: aload #11
/*    */     //   251: areturn
/*    */     //   252: aload #10
/*    */     //   254: getfield L$2 : Ljava/lang/Object;
/*    */     //   257: checkcast com/intellij/ml/llm/matterhorn/ej/core/FileWithLine
/*    */     //   260: astore #6
/*    */     //   262: aload #10
/*    */     //   264: getfield L$1 : Ljava/lang/Object;
/*    */     //   267: checkcast java/lang/Integer
/*    */     //   270: astore #5
/*    */     //   272: aload #10
/*    */     //   274: getfield L$0 : Ljava/lang/Object;
/*    */     //   277: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*    */     //   280: astore_2
/*    */     //   281: aload #9
/*    */     //   283: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   286: aload #9
/*    */     //   288: checkcast com/intellij/openapi/editor/Document
/*    */     //   291: astore #7
/*    */     //   293: aload #7
/*    */     //   295: ifnonnull -> 301
/*    */     //   298: ldc 'ERROR: Unable to load document for file'
/*    */     //   300: areturn
/*    */     //   301: aload #5
/*    */     //   303: invokevirtual intValue : ()I
/*    */     //   306: iconst_1
/*    */     //   307: if_icmplt -> 356
/*    */     //   310: aload #5
/*    */     //   312: invokevirtual intValue : ()I
/*    */     //   315: aload #7
/*    */     //   317: invokeinterface getLineCount : ()I
/*    */     //   322: if_icmple -> 383
/*    */     //   325: aload #5
/*    */     //   327: iconst_1
/*    */     //   328: istore #8
/*    */     //   330: dup
/*    */     //   331: ifnonnull -> 338
/*    */     //   334: pop
/*    */     //   335: goto -> 346
/*    */     //   338: invokevirtual intValue : ()I
/*    */     //   341: iload #8
/*    */     //   343: if_icmpeq -> 383
/*    */     //   346: aload #7
/*    */     //   348: invokeinterface getTextLength : ()I
/*    */     //   353: ifeq -> 383
/*    */     //   356: aload #6
/*    */     //   358: invokevirtual getFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   361: invokevirtual toNioPath : ()Ljava/nio/file/Path;
/*    */     //   364: aload #7
/*    */     //   366: invokeinterface getLineCount : ()I
/*    */     //   371: <illegal opcode> makeConcatWithConstants : (Ljava/nio/file/Path;I)Ljava/lang/String;
/*    */     //   376: aconst_null
/*    */     //   377: iconst_1
/*    */     //   378: aconst_null
/*    */     //   379: invokestatic trimMargin$default : (Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
/*    */     //   382: areturn
/*    */     //   383: aload_2
/*    */     //   384: new com/intellij/ml/llm/matterhorn/ej/core/FileWithLine
/*    */     //   387: dup
/*    */     //   388: aload #6
/*    */     //   390: invokevirtual getFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   393: aload #5
/*    */     //   395: invokevirtual intValue : ()I
/*    */     //   398: invokespecial <init> : (Lcom/intellij/openapi/vfs/VirtualFile;I)V
/*    */     //   401: invokeinterface setCurrentScreenPosition : (Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;)V
/*    */     //   406: aload_2
/*    */     //   407: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   412: aload #6
/*    */     //   414: invokevirtual getFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   417: new com/intellij/ml/llm/matterhorn/ej/core/actions/PrintBlock
/*    */     //   420: dup
/*    */     //   421: aload #5
/*    */     //   423: invokevirtual intValue : ()I
/*    */     //   426: bipush #100
/*    */     //   428: bipush #10
/*    */     //   430: bipush #10
/*    */     //   432: iconst_0
/*    */     //   433: bipush #16
/*    */     //   435: aconst_null
/*    */     //   436: invokespecial <init> : (IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   439: aconst_null
/*    */     //   440: aload_2
/*    */     //   441: invokeinterface getSessionHistory : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*    */     //   446: aload #10
/*    */     //   448: bipush #8
/*    */     //   450: aconst_null
/*    */     //   451: aload #10
/*    */     //   453: aconst_null
/*    */     //   454: putfield L$0 : Ljava/lang/Object;
/*    */     //   457: aload #10
/*    */     //   459: aconst_null
/*    */     //   460: putfield L$1 : Ljava/lang/Object;
/*    */     //   463: aload #10
/*    */     //   465: aconst_null
/*    */     //   466: putfield L$2 : Ljava/lang/Object;
/*    */     //   469: aload #10
/*    */     //   471: iconst_3
/*    */     //   472: putfield label : I
/*    */     //   475: invokestatic printScreen$default : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/vfs/VirtualFile;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/PrintBlock;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   478: dup
/*    */     //   479: aload #11
/*    */     //   481: if_acmpne -> 494
/*    */     //   484: aload #11
/*    */     //   486: areturn
/*    */     //   487: aload #9
/*    */     //   489: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   492: aload #9
/*    */     //   494: areturn
/*    */     //   495: new java/lang/IllegalStateException
/*    */     //   498: dup
/*    */     //   499: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   501: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   504: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #28	-> 60
/*    */     //   #29	-> 101
/*    */     //   #30	-> 110
/*    */     //   #28	-> 135
/*    */     //   #31	-> 159
/*    */     //   #34	-> 176
/*    */     //   #35	-> 181
/*    */     //   #38	-> 189
/*    */     //   #39	-> 197
/*    */     //   #40	-> 202
/*    */     //   #43	-> 205
/*    */     //   #28	-> 249
/*    */     //   #47	-> 293
/*    */     //   #48	-> 298
/*    */     //   #51	-> 301
/*    */     //   #53	-> 356
/*    */     //   #52	-> 382
/*    */     //   #56	-> 383
/*    */     //   #59	-> 406
/*    */     //   #60	-> 412
/*    */     //   #61	-> 417
/*    */     //   #58	-> 439
/*    */     //   #62	-> 440
/*    */     //   #58	-> 448
/*    */     //   #28	-> 484
/*    */     //   #58	-> 494
/*    */     //   #28	-> 495
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   101	28	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/GotoLineAgentAction;
/*    */     //   101	28	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*    */     //   101	37	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   147	105	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   281	17	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   301	55	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   383	65	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   159	17	4	params	Ljava/util/Map;
/*    */     //   176	76	5	lineNumber	Ljava/lang/Integer;
/*    */     //   272	26	5	lineNumber	Ljava/lang/Integer;
/*    */     //   301	55	5	lineNumber	Ljava/lang/Integer;
/*    */     //   383	56	5	lineNumber	Ljava/lang/Integer;
/*    */     //   197	55	6	oldPosition	Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;
/*    */     //   262	36	6	oldPosition	Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;
/*    */     //   301	81	6	oldPosition	Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;
/*    */     //   383	34	6	oldPosition	Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;
/*    */     //   293	5	7	document	Lcom/intellij/openapi/editor/Document;
/*    */     //   301	81	7	document	Lcom/intellij/openapi/editor/Document;
/*    */     //   0	505	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	445	10	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	438	9	$result	Ljava/lang/Object;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static final Document execute$lambda$0(FileWithLine $oldPosition) {
/* 44 */     return FileDocumentManager.getInstance().getDocument($oldPosition.getFile());
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "GotoLineAgentAction.kt", l = {30, 43, 58}, i = {0, 1, 1, 1}, s = {"L$0", "L$0", "L$1", "L$2"}, n = {"context", "context", "lineNumber", "oldPosition"}, m = "execute", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.GotoLineAgentAction")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class GotoLineAgentAction$execute$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int label;
/*    */     
/*    */     GotoLineAgentAction$execute$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return GotoLineAgentAction.this.execute(null, null, (Continuation<? super String>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\GotoLineAgentAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */