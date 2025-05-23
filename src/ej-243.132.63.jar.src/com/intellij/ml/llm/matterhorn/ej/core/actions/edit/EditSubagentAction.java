/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentAction;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.Argument;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.actions.ActionRequest;
/*    */ import com.intellij.ml.llm.matterhorn.llm.ArgumentType;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\003\030\000 \0342\0020\001:\001\034B\007¢\006\004\b\002\020\003J\036\020\017\032\0020\0052\006\020\020\032\0020\0212\006\020\022\032\0020\023H@¢\006\002\020\024J \020\025\032\004\030\0010\0052\006\020\020\032\0020\0212\006\020\022\032\0020\023H@¢\006\002\020\024J.\020\026\032\022\022\004\022\0020\030\022\004\022\0020\0310\027j\002`\0322\006\020\b\032\0020\0052\006\020\022\032\0020\023H@¢\006\002\020\033R\024\020\004\032\0020\005XD¢\006\b\n\000\032\004\b\006\020\007R\032\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\b\n\000\032\004\b\013\020\fR\024\020\r\032\0020\005X\004¢\006\b\n\000\032\004\b\016\020\007¨\006\035"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSubagentAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "arguments", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/Argument;", "getArguments", "()Ljava/util/List;", "docstring", "getDocstring", "execute", "request", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reviewActionRequest", "parseArguments", "Lcom/intellij/ml/llm/matterhorn/ej/core/Result;", "Lcom/intellij/openapi/vfs/VirtualFile;", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSubagentArgumentsParseResult;", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ej-core"})
/*    */ public final class EditSubagentAction implements AgentAction {
/*    */   @NotNull
/* 23 */   public String getCustomSignature() { return AgentAction.DefaultImpls.getCustomSignature(this); } @NotNull public static final Companion Companion = new Companion(null); @Nullable public Object getInputParams(@NotNull ActionRequest $this$getInputParams, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.getInputParams(this, $this$getInputParams, $completion); }
/*    */    @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSubagentAction$Companion;", "", "<init>", "()V", "EDIT_ACTION_NAME", "", "ej-core"})
/*    */   public static final class Companion {
/*    */     private Companion() {} }
/*    */   @NotNull
/* 28 */   private final String name = "edit"; @NotNull public String getName() { return this.name; } @NotNull
/* 29 */   private final List<Argument> arguments = CollectionsKt.listOf(
/* 30 */       new Argument(
/* 31 */         "file_name", 
/* 32 */         ArgumentType.STRING, 
/* 33 */         "path to the file that should be edited", false, false, 24, null)); @NotNull
/*    */   public List<Argument> getArguments() { return this.arguments; }
/*    */   @NotNull
/* 36 */   public String getDocstring() { return this.docstring; }
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/* 64 */   private final String docstring = StringsKt.trimMargin$default("|\n      |Edits <file_name> according to the task provided at the discussion.\n      |Here are the examples of intended usage:\n      |<example1>\n      |<THOUGHT>\n      |We are now looking at the relevant section of the `fields.py` file where the `TimeDelta` serialization occurs. The issue suggests that there is a rounding problem near line 1474. The current implementation uses integer division, which truncates the decimal part and can lead to incorrect rounding on line 1475.To fix this issue, we should ensure that the division results in a float, and then round the result to the nearest integer before converting it to an int. This should preserve the milliseconds precision as expected. Let's make the necessary edit to the code.\n      |</THOUGHT>\n      |<COMMAND>\n      |edit src/marshmallow/fields.py\n      |</COMMAND>\n      |</example1>\n      |\n      |<example2>\n      |<THOUGHT>\n      |Add following code snippet to the `hello.py` script:\n      |```python\n      |def hello():\n      |    print(\"Hello world!\")\n      |\n      |if __name__ == \"__main__\":\n      |    hello()\n      |```\n      |</THOUGHT>\n      |<COMMAND>\n      |edit hello.py\n      |</COMMAND>\n      |</example2>\n      |Note that edit action could be reverted by `" + (new UndoEditAction()).getName() + "` if necessary\n    ", null, 1, null); @NotNull
/*    */   public static final String EDIT_ACTION_NAME = "edit";
/*    */   @Nullable
/*    */   public Object execute(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/* 68 */     throw new NotImplementedError(null, 1, null);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object reviewActionRequest(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSubagentAction$reviewActionRequest$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSubagentAction$reviewActionRequest$1
/*    */     //   11: astore #7
/*    */     //   13: aload #7
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #7
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSubagentAction$reviewActionRequest$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSubagentAction;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #7
/*    */     //   50: aload #7
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #6
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #8
/*    */     //   62: aload #7
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 190, 0 -> 88, 1 -> 159
/*    */     //   88: aload #6
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_1
/*    */     //   94: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest
/*    */     //   97: istore #4
/*    */     //   99: getstatic kotlin/_Assertions.ENABLED : Z
/*    */     //   102: ifeq -> 124
/*    */     //   105: iload #4
/*    */     //   107: ifne -> 124
/*    */     //   110: ldc 'Assertion failed'
/*    */     //   112: astore #5
/*    */     //   114: new java/lang/AssertionError
/*    */     //   117: dup
/*    */     //   118: aload #5
/*    */     //   120: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   123: athrow
/*    */     //   124: aload_0
/*    */     //   125: aload_1
/*    */     //   126: ldc 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.ej.core.actions.SimpleActionRequest'
/*    */     //   128: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   131: aload_1
/*    */     //   132: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest
/*    */     //   135: invokevirtual getArguments : ()Ljava/lang/String;
/*    */     //   138: aload_2
/*    */     //   139: aload #7
/*    */     //   141: aload #7
/*    */     //   143: iconst_1
/*    */     //   144: putfield label : I
/*    */     //   147: invokevirtual parseArguments : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   150: dup
/*    */     //   151: aload #8
/*    */     //   153: if_acmpne -> 166
/*    */     //   156: aload #8
/*    */     //   158: areturn
/*    */     //   159: aload #6
/*    */     //   161: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   164: aload #6
/*    */     //   166: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*    */     //   169: astore #4
/*    */     //   171: aload #4
/*    */     //   173: instanceof com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*    */     //   176: ifeq -> 188
/*    */     //   179: aload #4
/*    */     //   181: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*    */     //   184: invokevirtual getMessage : ()Ljava/lang/String;
/*    */     //   187: areturn
/*    */     //   188: aconst_null
/*    */     //   189: areturn
/*    */     //   190: new java/lang/IllegalStateException
/*    */     //   193: dup
/*    */     //   194: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   196: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   199: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #71	-> 60
/*    */     //   #72	-> 93
/*    */     //   #73	-> 124
/*    */     //   #71	-> 156
/*    */     //   #74	-> 171
/*    */     //   #75	-> 179
/*    */     //   #77	-> 188
/*    */     //   #71	-> 190
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	31	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSubagentAction;
/*    */     //   124	26	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSubagentAction;
/*    */     //   93	31	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*    */     //   124	26	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*    */     //   93	31	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   124	26	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   171	19	4	parsedArguments	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*    */     //   0	200	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	140	7	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	133	6	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object parseArguments(@NotNull String arguments, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSubagentAction$parseArguments$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSubagentAction$parseArguments$1
/*    */     //   11: astore #8
/*    */     //   13: aload #8
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #8
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSubagentAction$parseArguments$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSubagentAction;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #8
/*    */     //   50: aload #8
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #7
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #9
/*    */     //   62: aload #8
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 215, 0 -> 88, 1 -> 144
/*    */     //   88: aload #7
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_1
/*    */     //   94: invokestatic parseArgs : (Ljava/lang/String;)Ljava/util/List;
/*    */     //   97: astore #4
/*    */     //   99: aload #4
/*    */     //   101: invokestatic firstOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*    */     //   104: checkcast java/lang/String
/*    */     //   107: dup
/*    */     //   108: ifnonnull -> 118
/*    */     //   111: pop
/*    */     //   112: ldc 'File path is required.'
/*    */     //   114: invokestatic errorResult : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/Result$Err;
/*    */     //   117: areturn
/*    */     //   118: astore #5
/*    */     //   120: aload #5
/*    */     //   122: aload_2
/*    */     //   123: iconst_1
/*    */     //   124: aload #8
/*    */     //   126: aload #8
/*    */     //   128: iconst_1
/*    */     //   129: putfield label : I
/*    */     //   132: invokestatic smartLocateFile : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   135: dup
/*    */     //   136: aload #9
/*    */     //   138: if_acmpne -> 151
/*    */     //   141: aload #9
/*    */     //   143: areturn
/*    */     //   144: aload #7
/*    */     //   146: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   149: aload #7
/*    */     //   151: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*    */     //   154: astore #6
/*    */     //   156: aload #6
/*    */     //   158: instanceof com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*    */     //   161: ifeq -> 181
/*    */     //   164: aload #6
/*    */     //   166: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*    */     //   169: invokevirtual getMessage : ()Ljava/lang/String;
/*    */     //   172: invokestatic errorResult : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/Result$Err;
/*    */     //   175: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*    */     //   178: goto -> 214
/*    */     //   181: aload #6
/*    */     //   183: instanceof com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*    */     //   186: ifeq -> 206
/*    */     //   189: aload #6
/*    */     //   191: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*    */     //   194: invokevirtual getValue : ()Ljava/lang/Object;
/*    */     //   197: invokestatic successResult : (Ljava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/ej/core/Result$Ok;
/*    */     //   200: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*    */     //   203: goto -> 214
/*    */     //   206: new kotlin/NoWhenBranchMatchedException
/*    */     //   209: dup
/*    */     //   210: invokespecial <init> : ()V
/*    */     //   213: athrow
/*    */     //   214: areturn
/*    */     //   215: new java/lang/IllegalStateException
/*    */     //   218: dup
/*    */     //   219: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   221: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   224: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #80	-> 60
/*    */     //   #81	-> 93
/*    */     //   #82	-> 99
/*    */     //   #84	-> 120
/*    */     //   #80	-> 141
/*    */     //   #85	-> 156
/*    */     //   #86	-> 181
/*    */     //   #84	-> 206
/*    */     //   #80	-> 215
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	6	1	arguments	Ljava/lang/String;
/*    */     //   93	18	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   118	17	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   99	8	4	args	Ljava/util/List;
/*    */     //   120	15	5	fileName	Ljava/lang/String;
/*    */     //   156	25	6	result	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*    */     //   181	25	6	result	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*    */     //   0	225	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	165	8	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	158	7	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "EditSubagentAction.kt", l = {84}, i = {}, s = {}, n = {}, m = "parseArguments", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditSubagentAction")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class EditSubagentAction$parseArguments$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     EditSubagentAction$parseArguments$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return EditSubagentAction.this.parseArguments(null, null, (Continuation<? super Result<? extends VirtualFile, Unit>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "EditSubagentAction.kt", l = {73}, i = {}, s = {}, n = {}, m = "reviewActionRequest", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditSubagentAction")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class EditSubagentAction$reviewActionRequest$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     EditSubagentAction$reviewActionRequest$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return EditSubagentAction.this.reviewActionRequest(null, null, (Continuation<? super String>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\EditSubagentAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */