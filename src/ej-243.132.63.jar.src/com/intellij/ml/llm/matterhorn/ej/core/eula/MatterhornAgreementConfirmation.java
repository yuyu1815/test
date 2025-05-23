/*    */ package com.intellij.ml.llm.matterhorn.ej.core.eula;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\002\n\002\020\002\n\002\b\002\bf\030\000 \0072\0020\001:\001\007J\016\020\002\032\0020\003H§@¢\006\002\020\004J\b\020\005\032\0020\006H'¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/eula/MatterhornAgreementConfirmation;", "", "confirmAgreement", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearAgreement", "", "Companion", "ej-core"})
/*    */ public interface MatterhornAgreementConfirmation { @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   @RequiresBackgroundThread
/*    */   @Nullable
/*    */   Object confirmAgreement(@NotNull Continuation<? super Boolean> paramContinuation);
/*    */   
/*    */   @Internal
/*    */   void clearAgreement();
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020 \n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/eula/MatterhornAgreementConfirmation$Companion;", "", "<init>", "()V", "instances", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/eula/MatterhornAgreementConfirmation;", "ej-core"})
/*    */   public static final class Companion {
/*    */     @NotNull
/*    */     public final List<MatterhornAgreementConfirmation> instances() {
/* 16 */       return CollectionsKt.listOf(new JunieAgreementConfirmation());
/*    */     }
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\eula\MatterhornAgreementConfirmation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */