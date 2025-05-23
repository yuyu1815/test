/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentAction;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.Argument;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.FileWithLine;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.StepMetadataKt;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.StepType;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\036\020\017\032\0020\0052\006\020\020\032\0020\0212\006\020\022\032\0020\023H@¢\006\002\020\024R\024\020\004\032\0020\005XD¢\006\b\n\000\032\004\b\006\020\007R\032\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\b\n\000\032\004\b\013\020\fR\024\020\r\032\0020\005XD¢\006\b\n\000\032\004\b\016\020\007¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ScrollUpAgentAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "arguments", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/Argument;", "getArguments", "()Ljava/util/List;", "docstring", "getDocstring", "execute", "request", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
/*    */ public final class ScrollUpAgentAction implements AgentAction {
/*    */   @NotNull
/* 19 */   public String getCustomSignature() { return AgentAction.DefaultImpls.getCustomSignature(this); } @Nullable public Object getInputParams(@NotNull ActionRequest $this$getInputParams, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.getInputParams(this, $this$getInputParams, $completion); } @Nullable public Object reviewActionRequest(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.reviewActionRequest(this, request, context, $completion); } @NotNull
/* 20 */   private final String name = "scroll_up"; @NotNull public String getName() { return this.name; } @NotNull
/* 21 */   private final List<Argument> arguments = CollectionsKt.emptyList(); @NotNull public List<Argument> getArguments() { return this.arguments; } @NotNull
/* 22 */   private final String docstring = "moves the view window up to show previous 100 lines of currently open file"; @NotNull public String getDocstring() { return this.docstring; } @Nullable
/*    */   public Object execute(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) { FileWithLine oldPosition;
/* 24 */     StepMetadataKt.emitMetadata("Scroll up", StepType.Info, context);
/* 25 */     if (context.getCurrentScreenPosition() == null) { context.getCurrentScreenPosition();
/* 26 */       return "ERROR: No file open. Use open command first"; }
/* 27 */      int newLine = Math.max(oldPosition.getLine() - 100, 1);
/* 28 */     context.setCurrentScreenPosition(new FileWithLine(oldPosition.getFile(), newLine));
/* 29 */     return AgentUtilsKt.printScreen$default(
/* 30 */         context.getProject(), 
/* 31 */         oldPosition.getFile(), 
/* 32 */         new PrintBlock(newLine, 100, 10, 10, 0, 16, null), (String)null, 
/* 33 */         context.getSessionHistory(), $completion, 8, (Object)null); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\ScrollUpAgentAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */