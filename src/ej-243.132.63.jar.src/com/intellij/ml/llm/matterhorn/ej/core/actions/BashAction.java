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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\026\030\000 \0252\0020\001:\001\025B\007¢\006\004\b\002\020\003J\036\020\017\032\0020\0052\006\020\020\032\0020\0212\006\020\022\032\0020\023H@¢\006\002\020\024R\024\020\004\032\0020\005XD¢\006\b\n\000\032\004\b\006\020\007R\032\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\b\n\000\032\004\b\013\020\fR\024\020\r\032\0020\005XD¢\006\b\n\000\032\004\b\016\020\007¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/BashAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "arguments", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/Argument;", "getArguments", "()Ljava/util/List;", "docstring", "getDocstring", "execute", "request", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ej-core"})
/*    */ public class BashAction implements AgentAction {
/*    */   @NotNull
/* 14 */   public String getCustomSignature() { return AgentAction.DefaultImpls.getCustomSignature(this); } @NotNull public static final Companion Companion = new Companion(null); @Nullable public Object getInputParams(@NotNull ActionRequest $this$getInputParams, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.getInputParams(this, $this$getInputParams, $completion); } @Nullable public Object reviewActionRequest(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.reviewActionRequest(this, request, context, $completion); }
/*    */    @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/BashAction$Companion;", "", "<init>", "()V", "COMMAND_ARGUMENT", "", "ej-core"})
/*    */   public static final class Companion {
/*    */     private Companion() {} } @NotNull
/* 18 */   private final String name = "bash"; @NotNull public String getName() { return this.name; } @NotNull
/* 19 */   private final List<Argument> arguments = CollectionsKt.listOf(
/* 20 */       new Argument(
/* 21 */         "command", 
/* 22 */         ArgumentType.STRING, 
/* 23 */         "bash command to execute", false, false, 24, null)); @NotNull
/*    */   public List<Argument> getArguments() { return this.arguments; }
/*    */   @NotNull
/* 26 */   private final String docstring = "executes given bash command in local terminal"; @NotNull public static final String COMMAND_ARGUMENT = "command"; @NotNull public String getDocstring() { return this.docstring; }
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
/*    */   private static final Unit execute$lambda$0(ExecutionAgentContext $context) {
/* 41 */     $context.getProjectDir().refresh(false, true);
/* 42 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object execute(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation<? super String> $completion) {
/*    */     return execute$suspendImpl(this, request, context, $completion);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "BashAction.kt", l = {29, 32, 34, 40, 53}, i = {0, 1, 1, 2, 2, 3, 3, 3}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2"}, n = {"context", "context", "command", "context", "command", "context", "commandExecutionResult", "localHistoryAction"}, m = "execute$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.BashAction")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class BashAction$execute$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int label;
/*    */     
/*    */     BashAction$execute$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return BashAction.execute$suspendImpl(BashAction.this, null, null, (Continuation<? super String>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\BashAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */