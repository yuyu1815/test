/*    */ package com.intellij.ml.llm.matterhorn.ej.core.eula;
/*    */ 
/*    */ import com.intellij.ide.gdpr.EndUserAgreement;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ 
/*    */ @DebugMetadata(f = "JunieAgreementConfirmation.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.eula.JunieAgreementConfirmation$showAcceptanceDialogForDocument$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class JunieAgreementConfirmation$showAcceptanceDialogForDocument$2
/*    */   extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */   int label;
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 21 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 22 */         JunieAgreementConfirmation.access$showAcceptanceDialogForDocument(JunieAgreementConfirmation.this, this.$document, this.$data);
/* 23 */         return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   JunieAgreementConfirmation$showAcceptanceDialogForDocument$2(EndUserAgreement.Document $document, JunieAgreementUiData $data, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super JunieAgreementConfirmation$showAcceptanceDialogForDocument$2> $completion) {
/*    */     return (Continuation<Unit>)new JunieAgreementConfirmation$showAcceptanceDialogForDocument$2(this.$document, this.$data, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((JunieAgreementConfirmation$showAcceptanceDialogForDocument$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\eula\JunieAgreementConfirmation$showAcceptanceDialogForDocument$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */