/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\002\b\003\030\000 \0252\0020\001:\001\025B\007¢\006\004\b\002\020\003J\036\020\017\032\0020\0052\006\020\020\032\0020\0212\006\020\022\032\0020\023H@¢\006\002\020\024R\024\020\004\032\0020\005XD¢\006\b\n\000\032\004\b\006\020\007R\032\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\b\n\000\032\004\b\013\020\fR\024\020\r\032\0020\005XD¢\006\b\n\000\032\004\b\016\020\007¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SubmitAgentAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "arguments", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/Argument;", "getArguments", "()Ljava/util/List;", "docstring", "getDocstring", "execute", "request", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ej-core"})
/*    */ public final class SubmitAgentAction implements AgentAction {
/*    */   @NotNull
/*  7 */   public String getCustomSignature() { return AgentAction.DefaultImpls.getCustomSignature(this); } @NotNull public static final Companion Companion = new Companion(null); @Nullable public Object getInputParams(@NotNull ActionRequest $this$getInputParams, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.getInputParams(this, $this$getInputParams, $completion); } @Nullable public Object reviewActionRequest(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.reviewActionRequest(this, request, context, $completion); }
/*    */    @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SubmitAgentAction$Companion;", "", "<init>", "()V", "SUBMIT_ACTION_NAME", "", "ej-core"})
/*    */   public static final class Companion {
/*    */     private Companion() {} } @NotNull
/* 11 */   private final String name = "submit"; @NotNull public String getName() { return this.name; } @NotNull
/* 12 */   private final List<Argument> arguments = CollectionsKt.emptyList(); @NotNull public List<Argument> getArguments() { return this.arguments; } @NotNull
/* 13 */   private final String docstring = "submits your current code and terminates the session"; @NotNull public static final String SUBMIT_ACTION_NAME = "submit"; @NotNull public String getDocstring() { return this.docstring; } @Nullable
/*    */   public Object execute(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/* 15 */     return "Your patch saved";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\SubmitAgentAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */