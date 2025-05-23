/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.run.tests;
/*    */ 
/*    */ import com.intellij.execution.actions.ConfigurationContext;
/*    */ import com.intellij.openapi.extensions.ExtensionPointName;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\022\020\b\032\004\030\0010\t2\006\020\n\032\0020\013H\026R\027\020\004\032\b\022\004\022\0020\0010\005¢\006\b\n\000\032\004\b\006\020\007¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor$Companion;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor$Provider;", "<init>", "()V", "EP_NAME", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "getEP_NAME", "()Lcom/intellij/openapi/extensions/ExtensionPointName;", "getInterceptor", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor;", "context", "Lcom/intellij/execution/actions/ConfigurationContext;", "ej-idea"})
/*    */ @SourceDebugExtension({"SMAP\nTestConfigurationPopupInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestConfigurationPopupInterceptor.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n1#2:44\n*E\n"})
/*    */ public final class Companion
/*    */   implements TestConfigurationPopupInterceptor.Provider
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final ExtensionPointName<TestConfigurationPopupInterceptor.Provider> getEP_NAME() {
/* 36 */     return TestConfigurationPopupInterceptor.access$getEP_NAME$cp();
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public TestConfigurationPopupInterceptor getInterceptor(@NotNull ConfigurationContext context) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'context'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: invokevirtual getEP_NAME : ()Lcom/intellij/openapi/extensions/ExtensionPointName;
/*    */     //   10: invokevirtual getExtensionList : ()Ljava/util/List;
/*    */     //   13: checkcast java/lang/Iterable
/*    */     //   16: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   21: astore_2
/*    */     //   22: aload_2
/*    */     //   23: invokeinterface hasNext : ()Z
/*    */     //   28: ifeq -> 60
/*    */     //   31: aload_2
/*    */     //   32: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   37: checkcast com/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor$Provider
/*    */     //   40: astore_3
/*    */     //   41: iconst_0
/*    */     //   42: istore #4
/*    */     //   44: aload_3
/*    */     //   45: aload_1
/*    */     //   46: invokeinterface getInterceptor : (Lcom/intellij/execution/actions/ConfigurationContext;)Lcom/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor;
/*    */     //   51: astore_3
/*    */     //   52: aload_3
/*    */     //   53: ifnull -> 22
/*    */     //   56: aload_3
/*    */     //   57: goto -> 61
/*    */     //   60: aconst_null
/*    */     //   61: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #40	-> 6
/*    */     //   #44	-> 41
/*    */     //   #40	-> 44
/*    */     //   #40	-> 51
/*    */     //   #40	-> 61
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   44	7	4	$i$a$-firstNotNullOfOrNull-TestConfigurationPopupInterceptor$Companion$getInterceptor$1	I
/*    */     //   41	10	3	it	Lcom/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor$Provider;
/*    */     //   0	62	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor$Companion;
/*    */     //   0	62	1	context	Lcom/intellij/execution/actions/ConfigurationContext;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\run\tests\TestConfigurationPopupInterceptor$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */