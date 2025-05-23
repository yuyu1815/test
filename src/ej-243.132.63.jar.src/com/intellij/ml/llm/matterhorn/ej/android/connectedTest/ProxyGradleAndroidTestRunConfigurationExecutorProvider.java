/*     */ package com.intellij.ml.llm.matterhorn.ej.android.connectedTest;
/*     */ 
/*     */ import com.android.tools.idea.execution.common.AndroidConfigurationExecutor;
/*     */ import com.android.tools.idea.testartifacts.instrumented.GradleAndroidTestRunConfigurationExecutorProvider;
/*     */ import com.intellij.execution.runners.ExecutionEnvironment;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\021\022\b\b\002\020\002\032\0020\003¢\006\004\b\004\020\005J\022\020\006\032\004\030\0010\0072\006\020\b\032\0020\tH\026R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/android/connectedTest/ProxyGradleAndroidTestRunConfigurationExecutorProvider;", "Lcom/android/tools/idea/execution/common/AndroidConfigurationExecutor$Provider;", "delegate", "Lcom/android/tools/idea/testartifacts/instrumented/GradleAndroidTestRunConfigurationExecutorProvider;", "<init>", "(Lcom/android/tools/idea/testartifacts/instrumented/GradleAndroidTestRunConfigurationExecutorProvider;)V", "createAndroidConfigurationExecutor", "Lcom/android/tools/idea/execution/common/AndroidConfigurationExecutor;", "env", "Lcom/intellij/execution/runners/ExecutionEnvironment;", "ej-android"})
/*     */ public final class ProxyGradleAndroidTestRunConfigurationExecutorProvider
/*     */   implements AndroidConfigurationExecutor.Provider
/*     */ {
/*     */   @NotNull
/*     */   private final GradleAndroidTestRunConfigurationExecutorProvider delegate;
/*     */   
/*     */   public ProxyGradleAndroidTestRunConfigurationExecutorProvider(@NotNull GradleAndroidTestRunConfigurationExecutorProvider delegate) {
/* 116 */     this.delegate = delegate;
/*     */   } @Nullable
/*     */   public AndroidConfigurationExecutor createAndroidConfigurationExecutor(@NotNull ExecutionEnvironment env) {
/* 119 */     Intrinsics.checkNotNullParameter(env, "env"); AndroidConfigurationExecutor original = this.delegate.createAndroidConfigurationExecutor(env);
/* 120 */     return (original instanceof com.android.tools.idea.testartifacts.instrumented.GradleAndroidTestRunConfigurationExecutor) ? 
/* 121 */       (AndroidConfigurationExecutor)new ProxyGradleAndroidTestRunConfigurationExecutor(env, null, 2, null) : 
/*     */       
/* 123 */       original;
/*     */   }
/*     */   
/*     */   public ProxyGradleAndroidTestRunConfigurationExecutorProvider() {
/*     */     this(null, 1, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\android\connectedTest\ProxyGradleAndroidTestRunConfigurationExecutorProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */