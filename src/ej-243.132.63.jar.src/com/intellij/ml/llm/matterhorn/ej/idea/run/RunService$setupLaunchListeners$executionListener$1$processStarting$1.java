/*     */ package com.intellij.ml.llm.matterhorn.ej.idea.run;
/*     */ 
/*     */ import com.intellij.execution.process.ProcessEvent;
/*     */ import com.intellij.execution.process.ProcessListener;
/*     */ import com.intellij.execution.process.ProcessOutputType;
/*     */ import com.intellij.openapi.util.Key;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\034\020\002\032\0020\0032\006\020\004\032\0020\0052\n\020\006\032\006\022\002\b\0030\007H\026¨\006\b"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/idea/run/RunService$setupLaunchListeners$executionListener$1$processStarting$1", "Lcom/intellij/execution/process/ProcessListener;", "onTextAvailable", "", "event", "Lcom/intellij/execution/process/ProcessEvent;", "outputType", "Lcom/intellij/openapi/util/Key;", "ej-idea"})
/*     */ public final class RunService$setupLaunchListeners$executionListener$1$processStarting$1
/*     */   implements ProcessListener
/*     */ {
/*     */   RunService$setupLaunchListeners$executionListener$1$processStarting$1(ProducerScope<RunEvent> producerScope) {}
/*     */   
/*     */   public void onTextAvailable(ProcessEvent event, Key outputType) {
/* 160 */     Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullParameter(outputType, "outputType"); if (ProcessOutputType.isStderr(outputType)) {
/* 161 */       Intrinsics.checkNotNullExpressionValue(event.getText(), "getText(...)"); RunService.access$sendEvent(RunService.this, this.$this_setupLaunchListeners, new OutputEvent(event.getText(), OutputType.Stderr));
/* 162 */     } else if (ProcessOutputType.isStdout(outputType)) {
/* 163 */       Intrinsics.checkNotNullExpressionValue(event.getText(), "getText(...)"); RunService.access$sendEvent(RunService.this, this.$this_setupLaunchListeners, new OutputEvent(event.getText(), OutputType.Stdout));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\run\RunService$setupLaunchListeners$executionListener$1$processStarting$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */