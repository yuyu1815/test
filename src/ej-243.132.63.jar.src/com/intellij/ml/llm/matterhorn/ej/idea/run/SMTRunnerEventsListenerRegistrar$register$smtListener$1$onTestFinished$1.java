/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.run;
/*    */ 
/*    */ import com.intellij.execution.filters.HyperlinkInfo;
/*    */ import com.intellij.execution.testframework.Printable;
/*    */ import com.intellij.execution.testframework.Printer;
/*    */ import com.intellij.execution.ui.ConsoleViewContentType;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000/\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026J\020\020\b\032\0020\0032\006\020\t\032\0020\nH\026J\032\020\013\032\0020\0032\006\020\004\032\0020\0052\b\020\f\032\004\030\0010\rH\026J\b\020\016\032\0020\003H\026¨\006\017"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/idea/run/SMTRunnerEventsListenerRegistrar$register$smtListener$1$onTestFinished$1", "Lcom/intellij/execution/testframework/Printer;", "print", "", "text", "", "contentType", "Lcom/intellij/execution/ui/ConsoleViewContentType;", "onNewAvailable", "printable", "Lcom/intellij/execution/testframework/Printable;", "printHyperlink", "info", "Lcom/intellij/execution/filters/HyperlinkInfo;", "mark", "ej-idea"})
/*    */ public final class SMTRunnerEventsListenerRegistrar$register$smtListener$1$onTestFinished$1
/*    */   implements Printer
/*    */ {
/*    */   SMTRunnerEventsListenerRegistrar$register$smtListener$1$onTestFinished$1(StringBuilder $sb) {}
/*    */   
/*    */   public void print(String text, ConsoleViewContentType contentType) {
/* 21 */     Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(contentType, "contentType"); this.$sb.append(text);
/*    */   }
/*    */   public void onNewAvailable(Printable printable) {
/* 24 */     Intrinsics.checkNotNullParameter(printable, "printable");
/*    */   } public void printHyperlink(String text, HyperlinkInfo info) {
/* 26 */     Intrinsics.checkNotNullParameter(text, "text"); this.$sb.append(text);
/*    */   }
/*    */   
/*    */   public void mark() {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\run\SMTRunnerEventsListenerRegistrar$register$smtListener$1$onTestFinished$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */