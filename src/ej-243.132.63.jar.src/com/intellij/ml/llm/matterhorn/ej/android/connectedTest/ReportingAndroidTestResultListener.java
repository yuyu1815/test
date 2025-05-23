/*     */ package com.intellij.ml.llm.matterhorn.ej.android.connectedTest;
/*     */ 
/*     */ import com.android.tools.idea.testartifacts.instrumented.testsuite.api.AndroidTestResultListener;
/*     */ import com.android.tools.idea.testartifacts.instrumented.testsuite.model.AndroidDevice;
/*     */ import com.android.tools.idea.testartifacts.instrumented.testsuite.model.AndroidTestCase;
/*     */ import com.android.tools.idea.testartifacts.instrumented.testsuite.model.AndroidTestCaseResult;
/*     */ import com.android.tools.idea.testartifacts.instrumented.testsuite.model.AndroidTestSuite;
/*     */ import com.intellij.ml.llm.matterhorn.ej.android.UtilsKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.StringUtilKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.idea.run.TestEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.idea.run.TestResult;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\000\030\0002\0020\001B\021\022\b\b\002\020\002\032\0020\003¢\006\004\b\004\020\005J\016\020\b\032\0020\t2\006\020\n\032\0020\013J\020\020\f\032\0020\t2\006\020\r\032\0020\016H\026J\020\020\017\032\0020\t2\006\020\r\032\0020\016H\026J \020\020\032\0020\t2\006\020\r\032\0020\0162\006\020\021\032\0020\0222\006\020\023\032\0020\024H\026J\030\020\025\032\0020\t2\006\020\r\032\0020\0162\006\020\021\032\0020\022H\026J \020\026\032\0020\t2\006\020\r\032\0020\0162\006\020\021\032\0020\0222\006\020\023\032\0020\024H\026J\030\020\027\032\0020\t2\006\020\r\032\0020\0162\006\020\021\032\0020\022H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/ReportingAndroidTestResultListener;", "Lcom/android/tools/idea/testartifacts/instrumented/testsuite/api/AndroidTestResultListener;", "eventProducer", "Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/AndroidTestResultEventProducer;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/AndroidTestResultEventProducer;)V", "consoleLog", "Ljava/lang/StringBuffer;", "appendToConsole", "", "text", "", "onTestSuiteScheduled", "device", "Lcom/android/tools/idea/testartifacts/instrumented/testsuite/model/AndroidDevice;", "onRerunScheduled", "onTestCaseStarted", "testSuite", "Lcom/android/tools/idea/testartifacts/instrumented/testsuite/model/AndroidTestSuite;", "testCase", "Lcom/android/tools/idea/testartifacts/instrumented/testsuite/model/AndroidTestCase;", "onTestSuiteStarted", "onTestCaseFinished", "onTestSuiteFinished", "ej-android"})
/*     */ public final class ReportingAndroidTestResultListener
/*     */   implements AndroidTestResultListener
/*     */ {
/*     */   @NotNull
/*     */   private final AndroidTestResultEventProducer eventProducer;
/*     */   @NotNull
/*     */   private final StringBuffer consoleLog;
/*     */   
/*     */   public ReportingAndroidTestResultListener(@NotNull AndroidTestResultEventProducer eventProducer) {
/*  62 */     this.eventProducer = eventProducer;
/*     */     
/*  64 */     this.consoleLog = new StringBuffer();
/*     */   }
/*     */   public final void appendToConsole(@NotNull String text) {
/*  67 */     Intrinsics.checkNotNullParameter(text, "text"); this.consoleLog.append(text);
/*     */   }
/*     */   
/*  70 */   public void onTestSuiteScheduled(@NotNull AndroidDevice device) { Intrinsics.checkNotNullParameter(device, "device"); } public void onRerunScheduled(@NotNull AndroidDevice device) {
/*  71 */     Intrinsics.checkNotNullParameter(device, "device");
/*     */   }
/*     */   public void onTestCaseStarted(@NotNull AndroidDevice device, @NotNull AndroidTestSuite testSuite, @NotNull AndroidTestCase testCase) {
/*  74 */     Intrinsics.checkNotNullParameter(device, "device"); Intrinsics.checkNotNullParameter(testSuite, "testSuite"); Intrinsics.checkNotNullParameter(testCase, "testCase");
/*     */   }
/*     */   public void onTestSuiteStarted(@NotNull AndroidDevice device, @NotNull AndroidTestSuite testSuite) {
/*  77 */     Intrinsics.checkNotNullParameter(device, "device"); Intrinsics.checkNotNullParameter(testSuite, "testSuite"); this.eventProducer.produce(AndroidTestResultListenerEvent.TestSuiteStarted.INSTANCE);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onTestCaseFinished(@NotNull AndroidDevice device, @NotNull AndroidTestSuite testSuite, @NotNull AndroidTestCase testCase) {
/*  85 */     Intrinsics.checkNotNullParameter(device, "device"); Intrinsics.checkNotNullParameter(testSuite, "testSuite"); Intrinsics.checkNotNullParameter(testCase, "testCase"); synchronized (this.consoleLog) { int $i$a$-synchronized-ReportingAndroidTestResultListener$onTestCaseFinished$stdout$1 = 0;
/*  86 */       Intrinsics.checkNotNullExpressionValue(this.consoleLog.toString(), "toString(...)"); String fullLog = this.consoleLog.toString();
/*  87 */       this.consoleLog.setLength(0);
/*  88 */       String str1 = StringUtilKt.nullIfEmpty(fullLog); }
/*     */      String stdout = str1;
/*  90 */     String stackTrace = StringUtilKt.nullIfEmpty(testCase.getErrorStackTrace());
/*  91 */     String log = UtilsKt.formatAndroidTestOutput(
/*  92 */         stdout, 
/*  93 */         StringUtilKt.nullIfEmpty(testCase.getLogcat()), 
/*  94 */         StringUtilKt.nullIfEmpty(testCase.getBenchmark()), 
/*  95 */         stackTrace);
/*     */     
/*  97 */     this.eventProducer.produce(
/*  98 */         new AndroidTestResultListenerEvent.TestCaseFinished(
/*  99 */           new TestEvent(
/* 100 */             testCase.getClassName() + "." + testCase.getClassName(), 
/* 101 */             log, 
/* 102 */             stackTrace, 
/* 103 */             testCase.getResult().toString(), 
/* 104 */             (testCase.getResult() == AndroidTestCaseResult.PASSED) ? TestResult.Success : TestResult.Failure)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onTestSuiteFinished(@NotNull AndroidDevice device, @NotNull AndroidTestSuite testSuite) {
/* 111 */     Intrinsics.checkNotNullParameter(device, "device"); Intrinsics.checkNotNullParameter(testSuite, "testSuite"); this.eventProducer.produce(AndroidTestResultListenerEvent.TestSuiteFinished.INSTANCE);
/*     */   }
/*     */   
/*     */   public ReportingAndroidTestResultListener() {
/*     */     this(null, 1, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\android\connectedTest\ReportingAndroidTestResultListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */