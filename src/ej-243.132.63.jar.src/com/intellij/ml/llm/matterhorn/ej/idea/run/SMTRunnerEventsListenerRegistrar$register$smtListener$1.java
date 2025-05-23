/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.run;
/*    */ 
/*    */ import com.intellij.execution.filters.HyperlinkInfo;
/*    */ import com.intellij.execution.testframework.Printable;
/*    */ import com.intellij.execution.testframework.Printer;
/*    */ import com.intellij.execution.testframework.sm.runner.SMTRunnerEventsAdapter;
/*    */ import com.intellij.execution.testframework.sm.runner.SMTestProxy;
/*    */ import com.intellij.execution.ui.ConsoleViewContentType;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\007\032\0020\bH\026¨\006\t"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/idea/run/SMTRunnerEventsListenerRegistrar$register$smtListener$1", "Lcom/intellij/execution/testframework/sm/runner/SMTRunnerEventsAdapter;", "onTestFinished", "", "test", "Lcom/intellij/execution/testframework/sm/runner/SMTestProxy;", "onTestingFinished", "testsRoot", "Lcom/intellij/execution/testframework/sm/runner/SMTestProxy$SMRootTestProxy;", "ej-idea"})
/*    */ public final class SMTRunnerEventsListenerRegistrar$register$smtListener$1
/*    */   extends SMTRunnerEventsAdapter
/*    */ {
/*    */   public void onTestFinished(SMTestProxy test) {
/* 18 */     Intrinsics.checkNotNullParameter(test, "test"); StringBuilder sb = new StringBuilder();
/* 19 */     test.printOn(new SMTRunnerEventsListenerRegistrar$register$smtListener$1$onTestFinished$1(sb));
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
/* 31 */     TestResult testResult = test.hasPassedTests() ? 
/* 32 */       TestResult.Success : 
/*    */       
/* 34 */       TestResult.Failure;
/*    */     
/* 36 */     Intrinsics.checkNotNullExpressionValue(test.getName(), "getName(...)"); Intrinsics.checkNotNullExpressionValue(sb.toString(), "toString(...)"); this.$listener.onTestFinished(new TestEvent(test.getName(), sb.toString(), test.getStacktrace(), test.getErrorMessage(), testResult));
/*    */   }
/*    */   SMTRunnerEventsListenerRegistrar$register$smtListener$1(TestListener $listener) {}
/*    */   public void onTestingFinished(SMTestProxy.SMRootTestProxy testsRoot) {
/* 40 */     Intrinsics.checkNotNullParameter(testsRoot, "testsRoot"); this.$listener.onTestingFinished();
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000/\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026J\020\020\b\032\0020\0032\006\020\t\032\0020\nH\026J\032\020\013\032\0020\0032\006\020\004\032\0020\0052\b\020\f\032\004\030\0010\rH\026J\b\020\016\032\0020\003H\026¨\006\017"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/idea/run/SMTRunnerEventsListenerRegistrar$register$smtListener$1$onTestFinished$1", "Lcom/intellij/execution/testframework/Printer;", "print", "", "text", "", "contentType", "Lcom/intellij/execution/ui/ConsoleViewContentType;", "onNewAvailable", "printable", "Lcom/intellij/execution/testframework/Printable;", "printHyperlink", "info", "Lcom/intellij/execution/filters/HyperlinkInfo;", "mark", "ej-idea"})
/*    */   public static final class SMTRunnerEventsListenerRegistrar$register$smtListener$1$onTestFinished$1 implements Printer {
/*    */     SMTRunnerEventsListenerRegistrar$register$smtListener$1$onTestFinished$1(StringBuilder $sb) {}
/*    */     
/*    */     public void print(String text, ConsoleViewContentType contentType) {
/*    */       Intrinsics.checkNotNullParameter(text, "text");
/*    */       Intrinsics.checkNotNullParameter(contentType, "contentType");
/*    */       this.$sb.append(text);
/*    */     }
/*    */     
/*    */     public void onNewAvailable(Printable printable) {
/*    */       Intrinsics.checkNotNullParameter(printable, "printable");
/*    */     }
/*    */     
/*    */     public void printHyperlink(String text, HyperlinkInfo info) {
/*    */       Intrinsics.checkNotNullParameter(text, "text");
/*    */       this.$sb.append(text);
/*    */     }
/*    */     
/*    */     public void mark() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\run\SMTRunnerEventsListenerRegistrar$register$smtListener$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */