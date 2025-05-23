/*    */ package com.intellij.ml.llm.matterhorn.ej.android.connectedTest;
/*    */ 
/*    */ import com.android.tools.idea.testartifacts.instrumented.testsuite.api.AndroidTestResultListener;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\b\000\030\0002\0020\001B\025\022\f\020\002\032\b\022\004\022\0020\0010\003¢\006\004\b\004\020\005J\020\020\b\032\0020\t2\006\020\n\032\0020\013H\026J\030\020\f\032\0020\t2\006\020\n\032\0020\0132\006\020\r\032\0020\016H\026J \020\017\032\0020\t2\006\020\n\032\0020\0132\006\020\r\032\0020\0162\006\020\020\032\0020\021H\026J \020\022\032\0020\t2\006\020\n\032\0020\0132\006\020\r\032\0020\0162\006\020\020\032\0020\021H\026J\030\020\023\032\0020\t2\006\020\n\032\0020\0132\006\020\r\032\0020\016H\026J\020\020\024\032\0020\t2\006\020\n\032\0020\013H\026R\027\020\002\032\b\022\004\022\0020\0010\003¢\006\b\n\000\032\004\b\006\020\007¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/CompositeAndroidTestResultListener;", "Lcom/android/tools/idea/testartifacts/instrumented/testsuite/api/AndroidTestResultListener;", "listeners", "", "<init>", "(Ljava/util/List;)V", "getListeners", "()Ljava/util/List;", "onTestSuiteScheduled", "", "device", "Lcom/android/tools/idea/testartifacts/instrumented/testsuite/model/AndroidDevice;", "onTestSuiteStarted", "testSuite", "Lcom/android/tools/idea/testartifacts/instrumented/testsuite/model/AndroidTestSuite;", "onTestCaseStarted", "testCase", "Lcom/android/tools/idea/testartifacts/instrumented/testsuite/model/AndroidTestCase;", "onTestCaseFinished", "onTestSuiteFinished", "onRerunScheduled", "ej-android"})
/*    */ @SourceDebugExtension({"SMAP\nCompositeAndroidTestResultListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositeAndroidTestResultListener.kt\ncom/intellij/ml/llm/matterhorn/ej/android/connectedTest/CompositeAndroidTestResultListener\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1863#2,2:37\n1863#2,2:39\n1863#2,2:41\n1863#2,2:43\n1863#2,2:45\n1863#2,2:47\n*S KotlinDebug\n*F\n+ 1 CompositeAndroidTestResultListener.kt\ncom/intellij/ml/llm/matterhorn/ej/android/connectedTest/CompositeAndroidTestResultListener\n*L\n10#1:37,2\n15#1:39,2\n21#1:41,2\n27#1:43,2\n32#1:45,2\n35#1:47,2\n*E\n"})
/*    */ public final class CompositeAndroidTestResultListener implements AndroidTestResultListener {
/*  8 */   public CompositeAndroidTestResultListener(@NotNull List<AndroidTestResultListener> listeners) { this.listeners = listeners; } @NotNull private final List<AndroidTestResultListener> listeners; @NotNull public final List<AndroidTestResultListener> getListeners() { return this.listeners; }
/*    */   
/* 10 */   public void onTestSuiteScheduled(@NotNull AndroidDevice device) { Intrinsics.checkNotNullParameter(device, "device"); Iterable<AndroidTestResultListener> $this$forEach$iv = this.listeners; int $i$f$forEach = 0;
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
/* 37 */     Iterator<AndroidTestResultListener> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); AndroidTestResultListener it = (AndroidTestResultListener)element$iv; int $i$a$-forEach-CompositeAndroidTestResultListener$onTestSuiteScheduled$1 = 0; it.onTestSuiteScheduled(device); }
/*    */      } public void onTestSuiteStarted(@NotNull AndroidDevice device, @NotNull AndroidTestSuite testSuite) { Intrinsics.checkNotNullParameter(device, "device"); Intrinsics.checkNotNullParameter(testSuite, "testSuite"); Iterable<AndroidTestResultListener> $this$forEach$iv = this.listeners; int $i$f$forEach = 0;
/* 39 */     Iterator<AndroidTestResultListener> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); AndroidTestResultListener it = (AndroidTestResultListener)element$iv; int $i$a$-forEach-CompositeAndroidTestResultListener$onTestSuiteStarted$1 = 0; it.onTestSuiteStarted(device, testSuite); }
/*    */      } public void onTestCaseStarted(@NotNull AndroidDevice device, @NotNull AndroidTestSuite testSuite, @NotNull AndroidTestCase testCase) { Intrinsics.checkNotNullParameter(device, "device"); Intrinsics.checkNotNullParameter(testSuite, "testSuite"); Intrinsics.checkNotNullParameter(testCase, "testCase"); Iterable<AndroidTestResultListener> $this$forEach$iv = this.listeners; int $i$f$forEach = 0;
/* 41 */     Iterator<AndroidTestResultListener> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); AndroidTestResultListener it = (AndroidTestResultListener)element$iv; int $i$a$-forEach-CompositeAndroidTestResultListener$onTestCaseStarted$1 = 0; it.onTestCaseStarted(device, testSuite, testCase); }
/*    */      } public void onTestCaseFinished(@NotNull AndroidDevice device, @NotNull AndroidTestSuite testSuite, @NotNull AndroidTestCase testCase) { Intrinsics.checkNotNullParameter(device, "device"); Intrinsics.checkNotNullParameter(testSuite, "testSuite"); Intrinsics.checkNotNullParameter(testCase, "testCase"); Iterable<AndroidTestResultListener> $this$forEach$iv = this.listeners; int $i$f$forEach = 0;
/* 43 */     Iterator<AndroidTestResultListener> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); AndroidTestResultListener it = (AndroidTestResultListener)element$iv; int $i$a$-forEach-CompositeAndroidTestResultListener$onTestCaseFinished$1 = 0; it.onTestCaseFinished(device, testSuite, testCase); }
/*    */      } public void onTestSuiteFinished(@NotNull AndroidDevice device, @NotNull AndroidTestSuite testSuite) { Intrinsics.checkNotNullParameter(device, "device"); Intrinsics.checkNotNullParameter(testSuite, "testSuite"); Iterable<AndroidTestResultListener> $this$forEach$iv = this.listeners; int $i$f$forEach = 0;
/* 45 */     Iterator<AndroidTestResultListener> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); AndroidTestResultListener it = (AndroidTestResultListener)element$iv; int $i$a$-forEach-CompositeAndroidTestResultListener$onTestSuiteFinished$1 = 0; it.onTestSuiteFinished(device, testSuite); }
/*    */      } public void onRerunScheduled(@NotNull AndroidDevice device) { Intrinsics.checkNotNullParameter(device, "device"); Iterable<AndroidTestResultListener> $this$forEach$iv = this.listeners; int $i$f$forEach = 0;
/* 47 */     Iterator<AndroidTestResultListener> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); AndroidTestResultListener it = (AndroidTestResultListener)element$iv; int $i$a$-forEach-CompositeAndroidTestResultListener$onRerunScheduled$1 = 0;
/*    */       it.onRerunScheduled(device); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\android\connectedTest\CompositeAndroidTestResultListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */