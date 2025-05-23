/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.run;
/*    */ import com.intellij.execution.testframework.Printable;
/*    */ import com.intellij.execution.testframework.sm.runner.SMTestProxy;
/*    */ import com.intellij.execution.ui.ConsoleViewContentType;
/*    */ import com.intellij.openapi.Disposable;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.util.messages.MessageBusConnection;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/run/SMTRunnerEventsListenerRegistrar;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/TestListenerRegistrar;", "<init>", "()V", "register", "", "project", "Lcom/intellij/openapi/project/Project;", "disposable", "Lcom/intellij/openapi/Disposable;", "listener", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/TestListener;", "ej-idea"})
/*    */ public final class SMTRunnerEventsListenerRegistrar implements TestListenerRegistrar {
/*    */   public void register(@NotNull Project project, @NotNull Disposable disposable, @NotNull TestListener listener) {
/* 15 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(disposable, "disposable"); Intrinsics.checkNotNullParameter(listener, "listener"); MessageBusConnection connection = project.getMessageBus().connect(disposable);
/* 16 */     SMTRunnerEventsListenerRegistrar$register$smtListener$1 smtListener = new SMTRunnerEventsListenerRegistrar$register$smtListener$1(listener);
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
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 43 */     Intrinsics.checkNotNullExpressionValue(SMTRunnerEventsListener.TEST_STATUS, "TEST_STATUS"); connection.subscribe(SMTRunnerEventsListener.TEST_STATUS, smtListener);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\007\032\0020\bH\026¨\006\t"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/idea/run/SMTRunnerEventsListenerRegistrar$register$smtListener$1", "Lcom/intellij/execution/testframework/sm/runner/SMTRunnerEventsAdapter;", "onTestFinished", "", "test", "Lcom/intellij/execution/testframework/sm/runner/SMTestProxy;", "onTestingFinished", "testsRoot", "Lcom/intellij/execution/testframework/sm/runner/SMTestProxy$SMRootTestProxy;", "ej-idea"})
/*    */   public static final class SMTRunnerEventsListenerRegistrar$register$smtListener$1 extends SMTRunnerEventsAdapter {
/*    */     SMTRunnerEventsListenerRegistrar$register$smtListener$1(TestListener $listener) {}
/*    */     
/*    */     public void onTestFinished(SMTestProxy test) {
/*    */       Intrinsics.checkNotNullParameter(test, "test");
/*    */       StringBuilder sb = new StringBuilder();
/*    */       test.printOn(new SMTRunnerEventsListenerRegistrar$register$smtListener$1$onTestFinished$1(sb));
/*    */       TestResult testResult = test.hasPassedTests() ? TestResult.Success : TestResult.Failure;
/*    */       Intrinsics.checkNotNullExpressionValue(test.getName(), "getName(...)");
/*    */       Intrinsics.checkNotNullExpressionValue(sb.toString(), "toString(...)");
/*    */       this.$listener.onTestFinished(new TestEvent(test.getName(), sb.toString(), test.getStacktrace(), test.getErrorMessage(), testResult));
/*    */     }
/*    */     
/*    */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000/\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026J\020\020\b\032\0020\0032\006\020\t\032\0020\nH\026J\032\020\013\032\0020\0032\006\020\004\032\0020\0052\b\020\f\032\004\030\0010\rH\026J\b\020\016\032\0020\003H\026¨\006\017"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/idea/run/SMTRunnerEventsListenerRegistrar$register$smtListener$1$onTestFinished$1", "Lcom/intellij/execution/testframework/Printer;", "print", "", "text", "", "contentType", "Lcom/intellij/execution/ui/ConsoleViewContentType;", "onNewAvailable", "printable", "Lcom/intellij/execution/testframework/Printable;", "printHyperlink", "info", "Lcom/intellij/execution/filters/HyperlinkInfo;", "mark", "ej-idea"})
/*    */     public static final class SMTRunnerEventsListenerRegistrar$register$smtListener$1$onTestFinished$1 implements Printer {
/*    */       SMTRunnerEventsListenerRegistrar$register$smtListener$1$onTestFinished$1(StringBuilder $sb) {}
/*    */       
/*    */       public void print(String text, ConsoleViewContentType contentType) {
/*    */         Intrinsics.checkNotNullParameter(text, "text");
/*    */         Intrinsics.checkNotNullParameter(contentType, "contentType");
/*    */         this.$sb.append(text);
/*    */       }
/*    */       
/*    */       public void onNewAvailable(Printable printable) {
/*    */         Intrinsics.checkNotNullParameter(printable, "printable");
/*    */       }
/*    */       
/*    */       public void printHyperlink(String text, HyperlinkInfo info) {
/*    */         Intrinsics.checkNotNullParameter(text, "text");
/*    */         this.$sb.append(text);
/*    */       }
/*    */       
/*    */       public void mark() {}
/*    */     }
/*    */     
/*    */     public void onTestingFinished(SMTestProxy.SMRootTestProxy testsRoot) {
/*    */       Intrinsics.checkNotNullParameter(testsRoot, "testsRoot");
/*    */       this.$listener.onTestingFinished();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\run\SMTRunnerEventsListenerRegistrar.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */