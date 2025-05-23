/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*    */ 
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\030\000 \0272\0020\001:\001\027B\007¢\006\004\b\002\020\003J\020\020\017\032\0020\0052\006\020\020\032\0020\021H\002J\036\020\022\032\0020\0052\006\020\020\032\0020\0212\006\020\023\032\0020\024H@¢\006\002\020\025J \020\026\032\004\030\0010\0052\006\020\020\032\0020\0212\006\020\023\032\0020\024H@¢\006\002\020\025R\024\020\004\032\0020\005XD¢\006\b\n\000\032\004\b\006\020\007R\032\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\b\n\000\032\004\b\013\020\fR\024\020\r\032\0020\005XD¢\006\b\n\000\032\004\b\016\020\007¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/AnswerAgentAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "arguments", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/Argument;", "getArguments", "()Ljava/util/List;", "docstring", "getDocstring", "getAnswer", "request", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "execute", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reviewActionRequest", "Companion", "ej-core"})
/*    */ public final class AnswerAgentAction implements AgentAction {
/*    */   @NotNull
/*  9 */   public String getCustomSignature() { return AgentAction.DefaultImpls.getCustomSignature(this); } @NotNull public static final Companion Companion = new Companion(null); @Nullable public Object getInputParams(@NotNull ActionRequest $this$getInputParams, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.getInputParams(this, $this$getInputParams, $completion); }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/AnswerAgentAction$Companion;", "", "<init>", "()V", "ANSWER_ACTION_NAME", "", "FULL_ANSWER_ARGUMENT", "ej-core"})
/*    */   public static final class Companion {
/*    */     private Companion() {} }
/*    */   @NotNull
/* 15 */   private final String name = "answer"; @NotNull public String getName() { return this.name; } @NotNull
/* 16 */   private final List<Argument> arguments = CollectionsKt.listOf(
/* 17 */       new Argument(
/* 18 */         "full_answer", 
/* 19 */         ArgumentType.STRING, 
/* 20 */         "Complete answer to the question. Must be formatted as valid Markdown.", false, false, 24, null)); @NotNull
/*    */   public List<Argument> getArguments() { return this.arguments; }
/*    */   @NotNull
/* 23 */   public String getDocstring() { return this.docstring; } @NotNull
/* 24 */   private final String docstring = "Provides a comprehensive answer to the issue question, displays it to the user and terminates the session."; @NotNull
/*    */   public static final String ANSWER_ACTION_NAME = "answer"; @NotNull
/*    */   public static final String FULL_ANSWER_ARGUMENT = "full_answer";
/*    */   private final String getAnswer(ActionRequest request) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest
/*    */     //   4: ifeq -> 17
/*    */     //   7: aload_1
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest
/*    */     //   11: invokevirtual getArguments : ()Ljava/lang/String;
/*    */     //   14: goto -> 27
/*    */     //   17: new java/lang/AssertionError
/*    */     //   20: dup
/*    */     //   21: ldc 'Invalid request type'
/*    */     //   23: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   26: athrow
/*    */     //   27: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #26	-> 0
/*    */     //   #27	-> 1
/*    */     //   #28	-> 17
/*    */     //   #29	-> 27
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	28	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/AnswerAgentAction;
/*    */     //   0	28	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*    */   }
/*    */   @Nullable
/*    */   public Object execute(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/* 32 */     String answer = getAnswer(request);
/* 33 */     if (StringUtilKt.nullIfEmpty(answer) == null) StringUtilKt.nullIfEmpty(answer);  return "ERROR: no answer was provided";
/*    */   }
/*    */   @Nullable
/*    */   public Object reviewActionRequest(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/* 37 */     String answer = getAnswer(request);
/*    */     
/* 39 */     return 
/* 40 */       StringsKt.isBlank(answer) ? "full_answer should not be empty" : 
/* 41 */       null;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\AnswerAgentAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */