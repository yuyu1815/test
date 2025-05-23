/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentAction;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.Argument;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.FileWithLine;
/*    */ import com.intellij.openapi.fileEditor.FileDocumentManager;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\036\020\017\032\0020\0052\006\020\020\032\0020\0212\006\020\022\032\0020\023H@¢\006\002\020\024R\024\020\004\032\0020\005XD¢\006\b\n\000\032\004\b\006\020\007R\032\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\b\n\000\032\004\b\013\020\fR\024\020\r\032\0020\005XD¢\006\b\n\000\032\004\b\016\020\007¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ScrollDownAgentAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "arguments", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/Argument;", "getArguments", "()Ljava/util/List;", "docstring", "getDocstring", "execute", "request", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
/*    */ public final class ScrollDownAgentAction
/*    */   implements AgentAction
/*    */ {
/*    */   @NotNull
/*    */   public String getCustomSignature() {
/* 38 */     return AgentAction.DefaultImpls.getCustomSignature(this); } @Nullable public Object getInputParams(@NotNull ActionRequest $this$getInputParams, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.getInputParams(this, $this$getInputParams, $completion); } @Nullable public Object reviewActionRequest(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.reviewActionRequest(this, request, context, $completion); } @NotNull
/* 39 */   private final String name = "scroll_down"; @NotNull public String getName() { return this.name; } @NotNull
/* 40 */   private final List<Argument> arguments = CollectionsKt.emptyList(); @NotNull public List<Argument> getArguments() { return this.arguments; } @NotNull
/* 41 */   private final String docstring = "moves the view window down to show next 100 lines of currently open file"; @NotNull public String getDocstring() { return this.docstring; }
/*    */    @Nullable
/*    */   public Object execute(@NotNull ActionRequest paramActionRequest, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/ScrollDownAgentAction$execute$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ScrollDownAgentAction$execute$1
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
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/actions/ScrollDownAgentAction$execute$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ScrollDownAgentAction;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #8
/*    */     //   50: aload #8
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #7
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #9
/*    */     //   62: aload #8
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 322, 0 -> 92, 1 -> 162, 2 -> 314
/*    */     //   92: aload #7
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: ldc 'Scroll down'
/*    */     //   99: getstatic com/intellij/ml/llm/matterhorn/ej/core/StepType.Info : Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*    */     //   102: aload_2
/*    */     //   103: invokestatic emitMetadata : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;)V
/*    */     //   106: aload_2
/*    */     //   107: invokeinterface getCurrentScreenPosition : ()Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;
/*    */     //   112: dup
/*    */     //   113: ifnonnull -> 120
/*    */     //   116: pop
/*    */     //   117: ldc 'ERROR: No file open. Use open command first'
/*    */     //   119: areturn
/*    */     //   120: astore #4
/*    */     //   122: aload #4
/*    */     //   124: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;)Lkotlin/jvm/functions/Function0;
/*    */     //   129: aload #8
/*    */     //   131: aload #8
/*    */     //   133: aload_2
/*    */     //   134: putfield L$0 : Ljava/lang/Object;
/*    */     //   137: aload #8
/*    */     //   139: aload #4
/*    */     //   141: putfield L$1 : Ljava/lang/Object;
/*    */     //   144: aload #8
/*    */     //   146: iconst_1
/*    */     //   147: putfield label : I
/*    */     //   150: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   153: dup
/*    */     //   154: aload #9
/*    */     //   156: if_acmpne -> 188
/*    */     //   159: aload #9
/*    */     //   161: areturn
/*    */     //   162: aload #8
/*    */     //   164: getfield L$1 : Ljava/lang/Object;
/*    */     //   167: checkcast com/intellij/ml/llm/matterhorn/ej/core/FileWithLine
/*    */     //   170: astore #4
/*    */     //   172: aload #8
/*    */     //   174: getfield L$0 : Ljava/lang/Object;
/*    */     //   177: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*    */     //   180: astore_2
/*    */     //   181: aload #7
/*    */     //   183: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   186: aload #7
/*    */     //   188: checkcast java/lang/Integer
/*    */     //   191: dup
/*    */     //   192: ifnull -> 201
/*    */     //   195: invokevirtual intValue : ()I
/*    */     //   198: goto -> 205
/*    */     //   201: pop
/*    */     //   202: ldc 'ERROR: no document found for the file'
/*    */     //   204: areturn
/*    */     //   205: istore #5
/*    */     //   207: aload #4
/*    */     //   209: invokevirtual getLine : ()I
/*    */     //   212: bipush #100
/*    */     //   214: iadd
/*    */     //   215: iload #5
/*    */     //   217: invokestatic min : (II)I
/*    */     //   220: istore #6
/*    */     //   222: aload_2
/*    */     //   223: new com/intellij/ml/llm/matterhorn/ej/core/FileWithLine
/*    */     //   226: dup
/*    */     //   227: aload #4
/*    */     //   229: invokevirtual getFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   232: iload #6
/*    */     //   234: invokespecial <init> : (Lcom/intellij/openapi/vfs/VirtualFile;I)V
/*    */     //   237: invokeinterface setCurrentScreenPosition : (Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;)V
/*    */     //   242: aload_2
/*    */     //   243: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   248: aload #4
/*    */     //   250: invokevirtual getFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   253: new com/intellij/ml/llm/matterhorn/ej/core/actions/PrintBlock
/*    */     //   256: dup
/*    */     //   257: iload #6
/*    */     //   259: bipush #100
/*    */     //   261: bipush #10
/*    */     //   263: bipush #10
/*    */     //   265: iconst_0
/*    */     //   266: bipush #16
/*    */     //   268: aconst_null
/*    */     //   269: invokespecial <init> : (IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   272: aconst_null
/*    */     //   273: aload_2
/*    */     //   274: invokeinterface getSessionHistory : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*    */     //   279: aload #8
/*    */     //   281: bipush #8
/*    */     //   283: aconst_null
/*    */     //   284: aload #8
/*    */     //   286: aconst_null
/*    */     //   287: putfield L$0 : Ljava/lang/Object;
/*    */     //   290: aload #8
/*    */     //   292: aconst_null
/*    */     //   293: putfield L$1 : Ljava/lang/Object;
/*    */     //   296: aload #8
/*    */     //   298: iconst_2
/*    */     //   299: putfield label : I
/*    */     //   302: invokestatic printScreen$default : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/vfs/VirtualFile;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/PrintBlock;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   305: dup
/*    */     //   306: aload #9
/*    */     //   308: if_acmpne -> 321
/*    */     //   311: aload #9
/*    */     //   313: areturn
/*    */     //   314: aload #7
/*    */     //   316: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   319: aload #7
/*    */     //   321: areturn
/*    */     //   322: new java/lang/IllegalStateException
/*    */     //   325: dup
/*    */     //   326: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   328: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   331: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #42	-> 60
/*    */     //   #43	-> 97
/*    */     //   #44	-> 106
/*    */     //   #45	-> 117
/*    */     //   #44	-> 120
/*    */     //   #46	-> 122
/*    */     //   #42	-> 159
/*    */     //   #46	-> 188
/*    */     //   #47	-> 207
/*    */     //   #47	-> 220
/*    */     //   #48	-> 222
/*    */     //   #50	-> 242
/*    */     //   #51	-> 248
/*    */     //   #52	-> 253
/*    */     //   #49	-> 272
/*    */     //   #53	-> 273
/*    */     //   #49	-> 281
/*    */     //   #42	-> 311
/*    */     //   #49	-> 321
/*    */     //   #42	-> 322
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	65	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   181	20	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   205	15	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   220	61	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   122	40	4	oldPosition	Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;
/*    */     //   172	29	4	oldPosition	Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;
/*    */     //   205	15	4	oldPosition	Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;
/*    */     //   220	33	4	oldPosition	Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;
/*    */     //   207	13	5	lineCount	I
/*    */     //   222	50	6	newLine	I
/*    */     //   0	332	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	272	8	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	265	7	$result	Ljava/lang/Object;
/*    */   } private static final Integer execute$lambda$0(FileWithLine $oldPosition) {
/* 46 */     FileDocumentManager.getInstance().getDocument($oldPosition.getFile()); return (FileDocumentManager.getInstance().getDocument($oldPosition.getFile()) != null) ? Integer.valueOf(FileDocumentManager.getInstance().getDocument($oldPosition.getFile()).getLineCount()) : null;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "ScrollAction.kt", l = {46, 49}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"context", "oldPosition"}, m = "execute", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.ScrollDownAgentAction")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class ScrollDownAgentAction$execute$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     ScrollDownAgentAction$execute$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return ScrollDownAgentAction.this.execute(null, null, (Continuation<? super String>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\ScrollDownAgentAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */