/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.login.states;
/*    */ 
/*    */ import com.intellij.ide.BrowserUtil;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.repos.JunieAipLicenseRepository;
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
/*    */ @DebugMetadata(f = "MissingAIPLicense.kt", l = {60, 60}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.states.MissingAIPLicense$navigateToPurchase$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class MissingAIPLicense$navigateToPurchase$1
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   MissingAIPLicense$navigateToPurchase$1(Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     String purchaseUrl;
/* 59 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 60 */         this.label = 1; if (JunieAipLicenseRepository.Companion.instance((Continuation)this) == object) return object;  this.label = 2; if (((JunieAipLicenseRepository)JunieAipLicenseRepository.Companion.instance((Continuation)this)).getPurchaseAipUrl((Continuation)this) == object) return object;  purchaseUrl = (String)((JunieAipLicenseRepository)JunieAipLicenseRepository.Companion.instance((Continuation)this)).getPurchaseAipUrl((Continuation)this);
/* 61 */         BrowserUtil.open(purchaseUrl);
/* 62 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 2; if (((JunieAipLicenseRepository)SYNTHETIC_LOCAL_VARIABLE_1).getPurchaseAipUrl((Continuation)this) == object) return object;  purchaseUrl = (String)((JunieAipLicenseRepository)SYNTHETIC_LOCAL_VARIABLE_1).getPurchaseAipUrl((Continuation)this); BrowserUtil.open(purchaseUrl); return Unit.INSTANCE;case 2: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); purchaseUrl = (String)SYNTHETIC_LOCAL_VARIABLE_1; BrowserUtil.open(purchaseUrl); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super MissingAIPLicense$navigateToPurchase$1> $completion) {
/*    */     return (Continuation<Unit>)new MissingAIPLicense$navigateToPurchase$1($completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((MissingAIPLicense$navigateToPurchase$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\states\MissingAIPLicense$navigateToPurchase$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */