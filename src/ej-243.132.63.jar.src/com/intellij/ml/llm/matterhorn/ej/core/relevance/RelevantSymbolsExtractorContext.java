/*     */ package com.intellij.ml.llm.matterhorn.ej.core.relevance;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentIssue;
/*     */ import kotlin.Metadata;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\t\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorContext;", "", "issue", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;", "parameters", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)V", "getIssue", "()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;", "getParameters", "()Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;", "getContext", "()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "ej-core"})
/*     */ public final class RelevantSymbolsExtractorContext
/*     */ {
/*     */   @NotNull
/*     */   private final AgentIssue issue;
/*     */   @NotNull
/*     */   private final RelevantSymbolsExtractorParameters parameters;
/*     */   @NotNull
/*     */   private final ExecutionContext context;
/*     */   
/*     */   public RelevantSymbolsExtractorContext(@NotNull AgentIssue issue, @NotNull RelevantSymbolsExtractorParameters parameters, @NotNull ExecutionContext context) {
/* 182 */     this.issue = issue;
/* 183 */     this.parameters = parameters;
/* 184 */     this.context = context; } @NotNull public final ExecutionContext getContext() { return this.context; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final AgentIssue getIssue() {
/*     */     return this.issue;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final RelevantSymbolsExtractorParameters getParameters() {
/*     */     return this.parameters;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\RelevantSymbolsExtractorContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */