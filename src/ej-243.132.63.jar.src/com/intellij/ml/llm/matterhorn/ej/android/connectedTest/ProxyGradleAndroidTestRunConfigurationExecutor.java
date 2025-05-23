/*    */ package com.intellij.ml.llm.matterhorn.ej.android.connectedTest;
/*    */ 
/*    */ import com.android.ddmlib.IDevice;
/*    */ import com.android.tools.idea.gradle.model.IdeAndroidArtifact;
/*    */ import com.android.tools.idea.run.DeviceFutures;
/*    */ import com.android.tools.idea.testartifacts.instrumented.GradleConnectedAndroidTestInvoker;
/*    */ import com.android.tools.idea.testartifacts.instrumented.testsuite.adapter.GradleTestResultAdapter;
/*    */ import com.android.tools.idea.testartifacts.instrumented.testsuite.api.AndroidTestResultListener;
/*    */ import com.android.tools.idea.testartifacts.instrumented.testsuite.view.AndroidTestSuiteView;
/*    */ import com.intellij.execution.runners.ExecutionEnvironment;
/*    */ import com.intellij.execution.ui.ConsoleViewContentType;
/*    */ import com.intellij.execution.ui.ExecutionConsole;
/*    */ import com.intellij.execution.ui.RunContentDescriptor;
/*    */ import com.intellij.openapi.Disposable;
/*    */ import com.intellij.openapi.externalSystem.model.project.ModuleData;
/*    */ import com.intellij.openapi.progress.ProgressIndicator;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.plugins.gradle.util.GradleUtil;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\031\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005¢\006\004\b\006\020\007J\020\020\b\032\0020\t2\006\020\n\032\0020\013H\026J\b\020\f\032\0020\rH\024R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/ProxyGradleAndroidTestRunConfigurationExecutor;", "Lcom/android/tools/idea/testartifacts/instrumented/GradleAndroidTestRunConfigurationExecutor;", "env", "Lcom/intellij/execution/runners/ExecutionEnvironment;", "reportingListener", "Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/ReportingAndroidTestResultListener;", "<init>", "(Lcom/intellij/execution/runners/ExecutionEnvironment;Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/ReportingAndroidTestResultListener;)V", "run", "Lcom/intellij/execution/ui/RunContentDescriptor;", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "gradleConnectedAndroidTestInvoker", "Lcom/android/tools/idea/testartifacts/instrumented/GradleConnectedAndroidTestInvoker;", "ej-android"})
/*    */ public final class ProxyGradleAndroidTestRunConfigurationExecutor extends GradleAndroidTestRunConfigurationExecutor {
/*    */   @NotNull
/*    */   private final ReportingAndroidTestResultListener reportingListener;
/*    */   
/* 29 */   public ProxyGradleAndroidTestRunConfigurationExecutor(@NotNull ExecutionEnvironment env, @NotNull ReportingAndroidTestResultListener reportingListener) { super(env, (DeviceFutures)env.getCopyableUserData(DeviceFutures.KEY)); this.reportingListener = reportingListener; }
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/android/connectedTest/ProxyGradleAndroidTestRunConfigurationExecutor$run$1", "Lcom/intellij/execution/ui/ObservableConsoleView$ChangeListener;", "textAdded", "", "text", "", "type", "Lcom/intellij/execution/ui/ConsoleViewContentType;", "ej-android"}) public static final class ProxyGradleAndroidTestRunConfigurationExecutor$run$1 implements ObservableConsoleView.ChangeListener {
/*    */     public void textAdded(String text, ConsoleViewContentType type) { Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(type, "type");
/* 32 */       ProxyGradleAndroidTestRunConfigurationExecutor.this.reportingListener.appendToConsole(text); } } @NotNull public RunContentDescriptor run(@NotNull ProgressIndicator indicator) { Intrinsics.checkNotNullParameter(indicator, "indicator"); RunContentDescriptor result = super.run(indicator);
/* 33 */     ExecutionConsole console = result.getExecutionConsole();
/* 34 */     if (console instanceof AndroidTestSuiteView) {
/* 35 */       ((AndroidTestSuiteView)console).getMyDetailsView().getRawTestLogConsoleView().addChangeListener(new ProxyGradleAndroidTestRunConfigurationExecutor$run$1(), 
/*    */ 
/*    */ 
/*    */           
/* 39 */           (Disposable)console);
/*    */     }
/* 41 */     return result; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   protected GradleConnectedAndroidTestInvoker gradleConnectedAndroidTestInvoker() {
/* 48 */     GradleUtil.findGradleModuleData(getModule()); if (((GradleUtil.findGradleModuleData(getModule()) != null) ? (ModuleData)GradleUtil.findGradleModuleData(getModule()).getData() : null) == null) { (GradleUtil.findGradleModuleData(getModule()) != null) ? (ModuleData)GradleUtil.findGradleModuleData(getModule()).getData() : null; String str = "Required value was null."; throw new IllegalArgumentException(str.toString()); }  super((ExecutionEnvironment)((GradleUtil.findGradleModuleData(getModule()) != null) ? (ModuleData)GradleUtil.findGradleModuleData(getModule()).getData() : null), (GradleUtil.findGradleModuleData(getModule()) != null) ? (ModuleData)GradleUtil.findGradleModuleData(getModule()).getData() : null, false, null, null, 
/* 49 */         this::gradleConnectedAndroidTestInvoker$lambda$0, null, 92, null);
/* 50 */     return new GradleConnectedAndroidTestInvoker(); } private static final GradleTestResultAdapter gradleConnectedAndroidTestInvoker$lambda$0(ProxyGradleAndroidTestRunConfigurationExecutor this$0, IDevice iDevice, String testSuiteDisplayName, IdeAndroidArtifact artifact, AndroidTestResultListener listener) { Intrinsics.checkNotNullParameter(iDevice, "iDevice"); Intrinsics.checkNotNullParameter(testSuiteDisplayName, "testSuiteDisplayName"); Intrinsics.checkNotNullParameter(listener, "listener");
/*    */ 
/*    */ 
/*    */     
/* 54 */     AndroidTestResultListener[] arrayOfAndroidTestResultListener = new AndroidTestResultListener[2]; arrayOfAndroidTestResultListener[0] = listener; arrayOfAndroidTestResultListener[1] = this$0.reportingListener; return new GradleTestResultAdapter(iDevice, testSuiteDisplayName, artifact, new CompositeAndroidTestResultListener(CollectionsKt.listOf((Object[])arrayOfAndroidTestResultListener)), null, 16, null); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\android\connectedTest\ProxyGradleAndroidTestRunConfigurationExecutor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */