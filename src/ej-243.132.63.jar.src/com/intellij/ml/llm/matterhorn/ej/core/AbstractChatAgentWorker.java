/*    */ package com.intellij.ml.llm.matterhorn.ej.core;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\b&\030\000 \r2\0020\001:\001\rB\007¢\006\004\b\002\020\003J\036\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH@¢\006\002\020\nJ\b\020\013\032\0020\fH\024¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractChatAgentWorker;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker;", "<init>", "()V", "getResult", "Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker$ResultContent;", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "state", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStepResultType", "Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "Companion", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nAbstractChatAgentWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractChatAgentWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AbstractChatAgentWorker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,21:1\n543#2,6:22\n*S KotlinDebug\n*F\n+ 1 AbstractChatAgentWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AbstractChatAgentWorker\n*L\n17#1:22,6\n*E\n"})
/*    */ public abstract class AbstractChatAgentWorker
/*    */   extends AbstractIssueAgentWorker
/*    */ {
/*    */   @NotNull
/*    */   protected StepType getStepResultType() {
/* 20 */     return StepType.ChatResponse;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   public static final String EMPTY_RESULT_MESSAGE = "Junie hasn't finished the research yet. You can ask Junie to continue or proceed with the new task";
/*    */   
/*    */   @Nullable
/*    */   protected Object getResult(@NotNull ExecutionContext context, @NotNull AgentState state, @NotNull Continuation<? super AbstractIssueAgentWorker.ResultContent> $completion) {
/*    */     return getResult$suspendImpl(this, context, state, $completion);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractChatAgentWorker$Companion;", "", "<init>", "()V", "EMPTY_RESULT_MESSAGE", "", "ej-core"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "AbstractChatAgentWorker.kt", l = {15}, i = {0}, s = {"L$0"}, n = {"state"}, m = "getResult$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractChatAgentWorker")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class AbstractChatAgentWorker$getResult$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     AbstractChatAgentWorker$getResult$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return AbstractChatAgentWorker.getResult$suspendImpl(AbstractChatAgentWorker.this, null, null, (Continuation<? super AbstractIssueAgentWorker.ResultContent>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AbstractChatAgentWorker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */