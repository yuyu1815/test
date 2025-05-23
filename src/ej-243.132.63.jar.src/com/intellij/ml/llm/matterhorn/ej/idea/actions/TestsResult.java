/*     */ package com.intellij.ml.llm.matterhorn.ej.idea.actions;
/*     */ 
/*     */ import java.util.List;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\030\0002\0020\001B1\022\f\020\002\032\b\022\004\022\0020\0040\003\022\f\020\005\032\b\022\004\022\0020\0060\003\022\f\020\007\032\b\022\004\022\0020\b0\003¢\006\004\b\t\020\nR\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\013\020\fR\027\020\005\032\b\022\004\022\0020\0060\003¢\006\b\n\000\032\004\b\r\020\fR\027\020\007\032\b\022\004\022\0020\b0\003¢\006\b\n\000\032\004\b\016\020\f¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/TestsResult;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunResult;", "passed", "", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/PassedTest;", "failed", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/FailedTest;", "buildErrorMessages", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/BuildMessage;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getPassed", "()Ljava/util/List;", "getFailed", "getBuildErrorMessages", "ej-idea"})
/*     */ public final class TestsResult
/*     */   extends RunResult
/*     */ {
/*     */   @NotNull
/*     */   private final List<PassedTest> passed;
/*     */   @NotNull
/*     */   private final List<FailedTest> failed;
/*     */   @NotNull
/*     */   private final List<BuildMessage> buildErrorMessages;
/*     */   
/*     */   @NotNull
/*     */   public final List<PassedTest> getPassed() {
/* 249 */     return this.passed; } @NotNull
/* 250 */   public final List<FailedTest> getFailed() { return this.failed; } @NotNull
/* 251 */   public final List<BuildMessage> getBuildErrorMessages() { return this.buildErrorMessages; }
/*     */    public TestsResult(@NotNull List<PassedTest> passed, @NotNull List<FailedTest> failed, @NotNull List<BuildMessage> buildErrorMessages) {
/* 253 */     super(null);
/*     */     this.passed = passed;
/*     */     this.failed = failed;
/*     */     this.buildErrorMessages = buildErrorMessages;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\TestsResult.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */