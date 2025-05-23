/*    */ package com.intellij.ml.llm.matterhorn.ej.core.history_processors;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutor;
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactResponse;
/*    */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentArtifactTypes;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentState;
/*    */ import kotlin.Metadata;
/*    */ import kotlin._Assertions;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001B\007¢\006\004\b\004\020\005J$\020\006\032\b\022\004\022\0020\0030\0072\006\020\b\032\0020\0022\006\020\t\032\0020\nH@¢\006\002\020\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/VoidHistoryProcessor;", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/VoidHistoryProcessorResponse;", "<init>", "()V", "produceArtifact", "Lcom/intellij/ml/llm/matterhorn/ArtifactResponse;", "input", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
/*    */ public final class VoidHistoryProcessor
/*    */   implements ArtifactRequestExecutor<AgentState, VoidHistoryProcessorResponse>
/*    */ {
/*    */   @Nullable
/*    */   public Object produceArtifact(@NotNull AgentState input, @NotNull ExecutionContext context, @NotNull Continuation $completion) {
/* 22 */     boolean bool = Intrinsics.areEqual(context.getRequest().getArtifact().getType(), AgentArtifactTypes.INSTANCE.getVoidHistoryProcessorArtifactType()); if (_Assertions.ENABLED && !bool) { String str = "Assertion failed"; throw new AssertionError(str); }
/* 23 */      return new ArtifactResponse(new VoidHistoryProcessorResponse(
/* 24 */           input.getObservations()), null, 2, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\history_processors\VoidHistoryProcessor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */