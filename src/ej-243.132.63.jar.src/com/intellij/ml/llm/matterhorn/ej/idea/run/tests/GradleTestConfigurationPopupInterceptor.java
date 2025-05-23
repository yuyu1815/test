/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.run.tests;
/*    */ import com.intellij.ui.components.JBList;
/*    */ import com.intellij.ui.popup.AbstractPopup;
/*    */ import javax.swing.ListModel;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\025\n\000\n\002\030\002\n\002\020\000\n\002\b\002\030\0002\0020\001:\001\021B\007¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\026J\032\020\b\032\0020\t2\006\020\006\032\0020\0072\b\020\n\032\004\030\0010\013H\026J\032\020\f\032\004\030\0010\r2\016\020\016\032\n\022\006\022\004\030\0010\0200\017H\002¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/run/tests/GradleTestConfigurationPopupInterceptor;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor;", "<init>", "()V", "shouldInterceptTestPopup", "", "component", "Lcom/intellij/ui/popup/AbstractPopup;", "doInterceptTestPopup", "", "owner", "Lcom/intellij/ui/awt/RelativePoint;", "determineIndicesToSelect", "", "model", "Ljavax/swing/ListModel;", "", "Provider", "ej-idea"})
/*    */ @SourceDebugExtension({"SMAP\nGradleTestConfigurationPopupInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GradleTestConfigurationPopupInterceptor.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/run/tests/GradleTestConfigurationPopupInterceptor\n+ 2 util.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/run/tests/UtilKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n8#2:36\n8#2:37\n1#3:38\n*S KotlinDebug\n*F\n+ 1 GradleTestConfigurationPopupInterceptor.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/run/tests/GradleTestConfigurationPopupInterceptor\n*L\n20#1:36\n25#1:37\n*E\n"})
/*    */ public final class GradleTestConfigurationPopupInterceptor extends TestConfigurationPopupInterceptor {
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\022\020\004\032\004\030\0010\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/run/tests/GradleTestConfigurationPopupInterceptor$Provider;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor$Provider;", "<init>", "()V", "getInterceptor", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor;", "context", "Lcom/intellij/execution/actions/ConfigurationContext;", "ej-idea"})
/*    */   public static final class Provider implements TestConfigurationPopupInterceptor.Provider {
/*    */     @Nullable
/*    */     public TestConfigurationPopupInterceptor getInterceptor(@NotNull ConfigurationContext context) {
/* 13 */       Intrinsics.checkNotNullParameter(context, "context"); context.getConfiguration().getType(); String str = (context.getConfiguration() != null && context.getConfiguration().getType() != null) ? context.getConfiguration().getType().getId() : null; if (str != null) switch (str.hashCode()) { case -926653774: if (str.equals("GradleRunConfiguration")); break; }
/*    */          
/* 15 */       return null;
/*    */     }
/*    */   }
/*    */   
/*    */   public boolean shouldInterceptTestPopup(@NotNull AbstractPopup component) {
/* 20 */     Intrinsics.checkNotNullParameter(component, "component"); AbstractPopup $this$findComponent$iv = component; int $i$f$findComponent = 0;
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
/* 36 */     if ((JBList)UIUtil.findComponentOfType($this$findComponent$iv.getContent(), JBList.class) != null) { JBList list = (JBList)UIUtil.findComponentOfType($this$findComponent$iv.getContent(), JBList.class); int $i$a$-let-GradleTestConfigurationPopupInterceptor$shouldInterceptTestPopup$1 = 0; Intrinsics.checkNotNullExpressionValue(list.getModel(), "getModel(...)"); }
/* 37 */      determineIndicesToSelect(list.getModel()); return (null != null); } public void doInterceptTestPopup(@NotNull AbstractPopup component, @Nullable RelativePoint owner) { Intrinsics.checkNotNullParameter(component, "component"); AbstractPopup $this$findComponent$iv = component; int $i$f$findComponent = 0; if ((JBList)UIUtil.findComponentOfType($this$findComponent$iv.getContent(), JBList.class) != null) { JBList list = (JBList)UIUtil.findComponentOfType($this$findComponent$iv.getContent(), JBList.class); int $i$a$-let-GradleTestConfigurationPopupInterceptor$doInterceptTestPopup$1 = 0; Intrinsics.checkNotNullExpressionValue(list.getModel(), "getModel(...)"); if (determineIndicesToSelect(list.getModel()) == null) {
/* 38 */         determineIndicesToSelect(list.getModel()); int arrayOfInt[] = determineIndicesToSelect(list.getModel()), $i$a$-checkNotNull-GradleTestConfigurationPopupInterceptor$doInterceptTestPopup$1$1 = 0;
/*    */         String str = "Failed to determine indices to select";
/*    */         throw new IllegalStateException(str.toString());
/*    */       } 
/*    */       determineIndicesToSelect(list.getModel()).setSelectedIndices(determineIndicesToSelect(list.getModel())); }
/*    */      }
/*    */ 
/*    */   
/*    */   private final int[] determineIndicesToSelect(ListModel model) {
/*    */     byte b;
/*    */     int i, arrayOfInt2[];
/*    */     for (b = 0, i = model.getSize(), arrayOfInt2 = new int[i]; b < i; ) {
/*    */       byte b1 = b;
/*    */       arrayOfInt2[b1] = b1;
/*    */       b++;
/*    */     } 
/*    */     int[] arrayOfInt1 = new int[1];
/*    */     arrayOfInt1[0] = 0;
/*    */     return (model.getSize() > 1 && model.getElementAt(0) instanceof String) ? arrayOfInt2 : ((model.getSize() > 1 && model.getElementAt(0) == null && model.getElementAt(1) instanceof com.intellij.psi.PsiClass) ? arrayOfInt1 : null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\run\tests\GradleTestConfigurationPopupInterceptor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */