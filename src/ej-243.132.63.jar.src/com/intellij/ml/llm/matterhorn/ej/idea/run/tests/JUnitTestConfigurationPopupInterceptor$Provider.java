/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.run.tests;
/*    */ 
/*    */ import com.intellij.execution.actions.ConfigurationContext;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\022\020\004\032\004\030\0010\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/run/tests/JUnitTestConfigurationPopupInterceptor$Provider;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor$Provider;", "<init>", "()V", "getInterceptor", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor;", "context", "Lcom/intellij/execution/actions/ConfigurationContext;", "ej-idea"})
/*    */ public final class Provider implements TestConfigurationPopupInterceptor.Provider {
/*    */   @Nullable
/*    */   public TestConfigurationPopupInterceptor getInterceptor(@NotNull ConfigurationContext context) {
/* 13 */     Intrinsics.checkNotNullParameter(context, "context"); context.getConfiguration().getType(); String str = (context.getConfiguration() != null && context.getConfiguration().getType() != null) ? context.getConfiguration().getType().getId() : null; if (str != null) switch (str.hashCode()) { case 70981870: if (str.equals("JUnit")); break; }
/*    */        
/* 15 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\run\tests\JUnitTestConfigurationPopupInterceptor$Provider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */