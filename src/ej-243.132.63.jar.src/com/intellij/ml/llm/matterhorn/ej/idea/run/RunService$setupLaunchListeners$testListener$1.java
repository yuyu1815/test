/*     */ package com.intellij.ml.llm.matterhorn.ej.idea.run;
/*     */ 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026J\020\020\004\032\0020\0032\006\020\005\032\0020\006H\026J\b\020\007\032\0020\003H\026¨\006\b"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/idea/run/RunService$setupLaunchListeners$testListener$1", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/TestListener;", "onBuildFinished", "", "onTestFinished", "testEvent", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/TestEvent;", "onTestingFinished", "ej-idea"})
/*     */ public final class RunService$setupLaunchListeners$testListener$1
/*     */   implements TestListener
/*     */ {
/*     */   RunService$setupLaunchListeners$testListener$1(RunService $receiver, ProducerScope<RunEvent> producerScope, CompletableDeferred<Unit> $testsPromise) {}
/*     */   
/*     */   public void onBuildFinished() {
/* 200 */     RunService.access$getLogger$cp().info("Build finished");
/* 201 */     this.$buildFinished.complete(Boolean.valueOf(true));
/*     */   }
/*     */   
/*     */   public void onTestFinished(TestEvent testEvent) {
/* 205 */     Intrinsics.checkNotNullParameter(testEvent, "testEvent"); RunService.access$getLogger$cp().info("Test finished: " + testEvent.getName() + " " + testEvent.getText() + " " + testEvent.getStackTrace() + " " + testEvent.getErrorMessage() + " " + testEvent.getTestResult() + " ");
/* 206 */     RunService.access$sendEvent(RunService.this, this.$this_setupLaunchListeners, testEvent);
/*     */   }
/*     */   
/*     */   public void onTestingFinished() {
/* 210 */     RunService.access$getLogger$cp().info("Testing is finished");
/* 211 */     this.$testsPromise.complete(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\run\RunService$setupLaunchListeners$testListener$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */