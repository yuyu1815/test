/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bf\030\000*\004\b\000\020\0012\016\022\004\022\0020\003\022\004\022\002H\0010\002J$\020\004\032\b\022\004\022\0028\0000\0052\006\020\006\032\0020\0032\006\020\007\032\0020\bH@¢\006\002\020\tJ\034\020\004\032\b\022\004\022\0028\0000\0052\006\020\007\032\0020\bH¦@¢\006\002\020\n¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactProducer;", "O", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;", "", "produceArtifact", "Lcom/intellij/ml/llm/matterhorn/ArtifactResponse;", "input", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Lkotlin/Unit;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core"})
/*     */ public interface ArtifactProducer<O>
/*     */   extends ArtifactRequestExecutor<Unit, O>
/*     */ {
/*     */   @Nullable
/*     */   Object produceArtifact(@NotNull Unit paramUnit, @NotNull ExecutionContext paramExecutionContext, @NotNull Continuation<? super ArtifactResponse<O>> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   Object produceArtifact(@NotNull ExecutionContext paramExecutionContext, @NotNull Continuation<? super ArtifactResponse<O>> paramContinuation);
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   public static final class DefaultImpls
/*     */   {
/*     */     @Nullable
/*     */     public static <O> Object produceArtifact(@NotNull ArtifactProducer $this, @NotNull Unit input, @NotNull ExecutionContext context, @NotNull Continuation $completion) {
/* 126 */       return $this.produceArtifact(context, $completion);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ArtifactProducer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */