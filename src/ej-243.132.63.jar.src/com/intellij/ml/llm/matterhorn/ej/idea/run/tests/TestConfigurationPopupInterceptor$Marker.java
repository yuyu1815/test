/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.run.tests;
/*    */ 
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\006\bÀ\002\030\0002\0020\0012\b\022\004\022\0020\0000\002B\t\b\002¢\006\004\b\003\020\004R\024\020\005\032\0020\000X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor$Marker;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext$Key;", "<init>", "()V", "key", "getKey", "()Lcom/intellij/ml/llm/matterhorn/ej/idea/run/tests/TestConfigurationPopupInterceptor$Marker;", "ej-idea"})
/*    */ public final class Marker implements CoroutineContext.Element, CoroutineContext.Key<TestConfigurationPopupInterceptor.Marker> {
/*    */   @NotNull
/*    */   public static final Marker INSTANCE;
/*    */   
/*    */   @NotNull
/* 12 */   public CoroutineContext plus(@NotNull CoroutineContext context) { return CoroutineContext.Element.DefaultImpls.plus(this, context); } @NotNull public CoroutineContext minusKey(@NotNull CoroutineContext.Key key) { return CoroutineContext.Element.DefaultImpls.minusKey(this, key); } @Nullable public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key key) { return (E)CoroutineContext.Element.DefaultImpls.get(this, key); } public <R> R fold(Object initial, @NotNull Function2 operation) { return (R)CoroutineContext.Element.DefaultImpls.fold(this, initial, operation); } @NotNull
/* 13 */   private static final Marker key = INSTANCE = new Marker(); @NotNull public Marker getKey() { return key; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\run\tests\TestConfigurationPopupInterceptor$Marker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */