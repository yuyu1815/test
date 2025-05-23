/*    */ package com.intellij.ml.llm.matterhorn.ej.android.connectedTest;
/*    */ import com.intellij.ml.llm.matterhorn.ej.idea.run.TestListener;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\021\022\b\b\002\020\002\032\0020\003¢\006\004\b\004\020\005J \020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH\026R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/AndroidTestResultsListenerRegistrar;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/TestListenerRegistrar;", "consumer", "Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/AndroidTestResultEventConsumer;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/AndroidTestResultEventConsumer;)V", "register", "", "project", "Lcom/intellij/openapi/project/Project;", "disposable", "Lcom/intellij/openapi/Disposable;", "listener", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/TestListener;", "ej-android"})
/*    */ public final class AndroidTestResultsListenerRegistrar implements TestListenerRegistrar {
/*    */   public AndroidTestResultsListenerRegistrar(@NotNull AndroidTestResultEventConsumer consumer) {
/*  9 */     this.consumer = consumer;
/*    */   } @NotNull
/*    */   private final AndroidTestResultEventConsumer consumer; public void register(@NotNull Project project, @NotNull Disposable disposable, @NotNull TestListener listener) {
/* 12 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(disposable, "disposable"); Intrinsics.checkNotNullParameter(listener, "listener"); this.consumer.consume(listener::register$lambda$0); } private static final Unit register$lambda$0(TestListener $listener, AndroidTestResultListenerEvent it) {
/* 13 */     Intrinsics.checkNotNullParameter(it, "it"); AndroidTestResultListenerEvent androidTestResultListenerEvent = it;
/* 14 */     if (androidTestResultListenerEvent instanceof AndroidTestResultListenerEvent.TestSuiteStarted) { $listener.onBuildFinished(); }
/* 15 */     else if (androidTestResultListenerEvent instanceof AndroidTestResultListenerEvent.TestCaseFinished) { $listener.onTestFinished(((AndroidTestResultListenerEvent.TestCaseFinished)it).getTest()); }
/* 16 */     else if (androidTestResultListenerEvent instanceof AndroidTestResultListenerEvent.TestSuiteFinished) { $listener.onTestingFinished(); }
/*    */     else { throw new NoWhenBranchMatchedException(); }
/* 18 */      return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   public AndroidTestResultsListenerRegistrar() {
/*    */     this(null, 1, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\android\connectedTest\AndroidTestResultsListenerRegistrar.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */