/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.run.tests;
/*    */ 
/*    */ import com.intellij.ui.awt.RelativePoint;
/*    */ import com.intellij.ui.popup.AbstractPopup;
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\006\b&\030\000 \0202\b\022\004\022\0020\0020\001:\003\016\017\020B\007¢\006\004\b\003\020\004J\020\020\005\032\0020\0062\006\020\007\032\0020\002H&J\032\020\b\032\0020\t2\006\020\007\032\0020\0022\b\020\n\032\004\030\0010\013H&J\016\020\f\032\0020\0062\006\020\007\032\0020\002J\032\020\r\032\0020\t2\006\020\007\032\0020\0022\b\020\n\032\004\030\0010\013H\004¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor;", "Lcom/intellij/ui/UiInterceptors$PersistentUiInterceptor;", "Lcom/intellij/ui/popup/AbstractPopup;", "<init>", "()V", "shouldInterceptTestPopup", "", "component", "doInterceptTestPopup", "", "owner", "Lcom/intellij/ui/awt/RelativePoint;", "shouldIntercept", "doIntercept", "Marker", "Provider", "Companion", "ej-idea"})
/*    */ public abstract class TestConfigurationPopupInterceptor extends UiInterceptors.PersistentUiInterceptor<AbstractPopup> {
/* 11 */   public TestConfigurationPopupInterceptor() { super(AbstractPopup.class); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bf\030\0002\0020\001J\022\020\002\032\004\030\0010\0032\006\020\004\032\0020\005H&¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor$Provider;", "", "getInterceptor", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor;", "context", "Lcom/intellij/execution/actions/ConfigurationContext;", "ej-idea"}) public static interface Provider {
/* 12 */     @Nullable TestConfigurationPopupInterceptor getInterceptor(@NotNull ConfigurationContext param1ConfigurationContext); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\006\bÀ\002\030\0002\0020\0012\b\022\004\022\0020\0000\002B\t\b\002¢\006\004\b\003\020\004R\024\020\005\032\0020\000X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor$Marker;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext$Key;", "<init>", "()V", "key", "getKey", "()Lcom/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor$Marker;", "ej-idea"}) public static final class Marker implements CoroutineContext.Element, CoroutineContext.Key<Marker> { @NotNull public CoroutineContext plus(@NotNull CoroutineContext context) { return CoroutineContext.Element.DefaultImpls.plus(this, context); } @NotNull public static final Marker INSTANCE; @NotNull public CoroutineContext minusKey(@NotNull CoroutineContext.Key key) { return CoroutineContext.Element.DefaultImpls.minusKey(this, key); } @Nullable public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key key) { return (E)CoroutineContext.Element.DefaultImpls.get(this, key); } public <R> R fold(Object initial, @NotNull Function2 operation) { return (R)CoroutineContext.Element.DefaultImpls.fold(this, initial, operation); } @NotNull
/* 13 */     private static final Marker key = INSTANCE = new Marker(); @NotNull public Marker getKey() { return key; }
/*    */      }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final boolean shouldIntercept(@NotNull AbstractPopup component) {
/* 21 */     Intrinsics.checkNotNullParameter(component, "component"); return (ThreadContext.currentThreadContext().get(Marker.INSTANCE) != null && 
/* 22 */       !component.isDisposed() && 
/* 23 */       shouldInterceptTestPopup(component));
/*    */   }
/*    */   protected final void doIntercept(@NotNull AbstractPopup component, @Nullable RelativePoint owner) {
/* 26 */     Intrinsics.checkNotNullParameter(component, "component"); if (component.isDisposed())
/* 27 */       return;  doInterceptTestPopup(component, owner);
/* 28 */     component.closeOk(null);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\022\020\b\032\004\030\0010\t2\006\020\n\032\0020\013H\026R\027\020\004\032\b\022\004\022\0020\0010\005¢\006\b\n\000\032\004\b\006\020\007¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor$Companion;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor$Provider;", "<init>", "()V", "EP_NAME", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "getEP_NAME", "()Lcom/intellij/openapi/extensions/ExtensionPointName;", "getInterceptor", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor;", "context", "Lcom/intellij/execution/actions/ConfigurationContext;", "ej-idea"})
/*    */   @SourceDebugExtension({"SMAP\nTestConfigurationPopupInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestConfigurationPopupInterceptor.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n1#2:44\n*E\n"})
/*    */   public static final class Companion implements Provider { private Companion() {}
/*    */     
/*    */     @NotNull
/* 36 */     public final ExtensionPointName<TestConfigurationPopupInterceptor.Provider> getEP_NAME() { return TestConfigurationPopupInterceptor.EP_NAME; } @Nullable public TestConfigurationPopupInterceptor getInterceptor(@NotNull ConfigurationContext context) { // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ldc 'context'
/*    */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   6: aload_0
/*    */       //   7: invokevirtual getEP_NAME : ()Lcom/intellij/openapi/extensions/ExtensionPointName;
/*    */       //   10: invokevirtual getExtensionList : ()Ljava/util/List;
/*    */       //   13: checkcast java/lang/Iterable
/*    */       //   16: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */       //   21: astore_2
/*    */       //   22: aload_2
/*    */       //   23: invokeinterface hasNext : ()Z
/*    */       //   28: ifeq -> 60
/*    */       //   31: aload_2
/*    */       //   32: invokeinterface next : ()Ljava/lang/Object;
/*    */       //   37: checkcast com/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor$Provider
/*    */       //   40: astore_3
/*    */       //   41: iconst_0
/*    */       //   42: istore #4
/*    */       //   44: aload_3
/*    */       //   45: aload_1
/*    */       //   46: invokeinterface getInterceptor : (Lcom/intellij/execution/actions/ConfigurationContext;)Lcom/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor;
/*    */       //   51: astore_3
/*    */       //   52: aload_3
/*    */       //   53: ifnull -> 22
/*    */       //   56: aload_3
/*    */       //   57: goto -> 61
/*    */       //   60: aconst_null
/*    */       //   61: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #40	-> 6
/*    */       //   #44	-> 41
/*    */       //   #40	-> 44
/*    */       //   #40	-> 51
/*    */       //   #40	-> 61
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   44	7	4	$i$a$-firstNotNullOfOrNull-TestConfigurationPopupInterceptor$Companion$getInterceptor$1	I
/*    */       //   41	10	3	it	Lcom/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor$Provider;
/*    */       //   0	62	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor$Companion;
/*    */       //   0	62	1	context	Lcom/intellij/execution/actions/ConfigurationContext; } }
/* 37 */   @NotNull public static final Companion Companion = new Companion(null); @NotNull private static final ExtensionPointName<Provider> EP_NAME = ExtensionPointName.Companion.create("com.intellij.ml.llm.matterhorn.run.testConfigurationPopupInterceptorProvider");
/*    */   
/*    */   public abstract boolean shouldInterceptTestPopup(@NotNull AbstractPopup paramAbstractPopup);
/*    */   
/*    */   public abstract void doInterceptTestPopup(@NotNull AbstractPopup paramAbstractPopup, @Nullable RelativePoint paramRelativePoint);
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\run\tests\TestConfigurationPopupInterceptor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */