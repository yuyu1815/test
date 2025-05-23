/*     */ package com.intellij.ml.llm.matterhorn.ej.idea.run;
/*     */ 
/*     */ import com.intellij.execution.ExecutionListener;
/*     */ import com.intellij.execution.process.ProcessEvent;
/*     */ import com.intellij.execution.process.ProcessHandler;
/*     */ import com.intellij.execution.process.ProcessListener;
/*     */ import com.intellij.execution.process.ProcessOutputType;
/*     */ import com.intellij.execution.runners.ExecutionEnvironment;
/*     */ import com.intellij.openapi.util.Key;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.CompletableDeferred;
/*     */ import kotlinx.coroutines.channels.ProducerScope;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0003\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\n\002\020\003\n\000*\001\000\b\n\030\0002\0020\001J \020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH\026J(\020\n\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\013\032\0020\fH\026J\030\020\r\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026J\"\020\r\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\b\020\016\032\004\030\0010\017H\026¨\006\020"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/idea/run/RunService$setupLaunchListeners$executionListener$1", "Lcom/intellij/execution/ExecutionListener;", "processStarting", "", "executorId", "", "env", "Lcom/intellij/execution/runners/ExecutionEnvironment;", "handler", "Lcom/intellij/execution/process/ProcessHandler;", "processTerminated", "exitCode", "", "processNotStarted", "cause", "", "ej-idea"})
/*     */ public final class RunService$setupLaunchListeners$executionListener$1
/*     */   implements ExecutionListener
/*     */ {
/*     */   RunService$setupLaunchListeners$executionListener$1(ProducerScope<RunEvent> producerScope, CompletableDeferred<Unit> $testsPromise) {}
/*     */   
/*     */   public void processStarting(String executorId, ExecutionEnvironment env, ProcessHandler handler) {
/* 158 */     Intrinsics.checkNotNullParameter(executorId, "executorId"); Intrinsics.checkNotNullParameter(env, "env"); Intrinsics.checkNotNullParameter(handler, "handler"); handler.addProcessListener(new RunService$setupLaunchListeners$executionListener$1$processStarting$1(this.$this_setupLaunchListeners)); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\034\020\002\032\0020\0032\006\020\004\032\0020\0052\n\020\006\032\006\022\002\b\0030\007H\026¨\006\b"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/idea/run/RunService$setupLaunchListeners$executionListener$1$processStarting$1", "Lcom/intellij/execution/process/ProcessListener;", "onTextAvailable", "", "event", "Lcom/intellij/execution/process/ProcessEvent;", "outputType", "Lcom/intellij/openapi/util/Key;", "ej-idea"})
/*     */   public static final class RunService$setupLaunchListeners$executionListener$1$processStarting$1 implements ProcessListener { public void onTextAvailable(ProcessEvent event, Key outputType) {
/* 160 */       Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullParameter(outputType, "outputType"); if (ProcessOutputType.isStderr(outputType)) {
/* 161 */         Intrinsics.checkNotNullExpressionValue(event.getText(), "getText(...)"); RunService.access$sendEvent(RunService.this, this.$this_setupLaunchListeners, new OutputEvent(event.getText(), OutputType.Stderr));
/* 162 */       } else if (ProcessOutputType.isStdout(outputType)) {
/* 163 */         Intrinsics.checkNotNullExpressionValue(event.getText(), "getText(...)"); RunService.access$sendEvent(RunService.this, this.$this_setupLaunchListeners, new OutputEvent(event.getText(), OutputType.Stdout));
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     RunService$setupLaunchListeners$executionListener$1$processStarting$1(ProducerScope<RunEvent> producerScope) {} }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void processTerminated(String executorId, ExecutionEnvironment env, ProcessHandler handler, int exitCode) {
/* 176 */     Intrinsics.checkNotNullParameter(executorId, "executorId"); Intrinsics.checkNotNullParameter(env, "env"); Intrinsics.checkNotNullParameter(handler, "handler"); RunService.access$getLogger$cp().info("Process terminated: executorId: " + executorId + ", env: " + env + ", exitCode: " + exitCode);
/* 177 */     RunService.access$sendEvent(RunService.this, this.$this_setupLaunchListeners, new RunFinishedEvent(ResultStatus.Normally));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 183 */     this.$testsPromise.complete(Unit.INSTANCE);
/*     */   }
/*     */   
/*     */   public void processNotStarted(String executorId, ExecutionEnvironment env) {
/* 187 */     Intrinsics.checkNotNullParameter(executorId, "executorId"); Intrinsics.checkNotNullParameter(env, "env"); throw new IllegalStateException("Unexpected: processNotStarted: executorId: " + executorId + ", env: " + env);
/*     */   }
/*     */   
/*     */   public void processNotStarted(String executorId, ExecutionEnvironment env, Throwable cause) {
/* 191 */     Intrinsics.checkNotNullParameter(executorId, "executorId"); Intrinsics.checkNotNullParameter(env, "env"); RunService.access$getLogger$cp().warn("processNotStarted: executorId: " + executorId + ", env: " + env + ", cause: " + cause);
/* 192 */     RunService.access$sendEvent(RunService.this, this.$this_setupLaunchListeners, new RunFinishedEvent(ResultStatus.WithTimeout));
/* 193 */     this.$testsPromise.complete(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\run\RunService$setupLaunchListeners$executionListener$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */