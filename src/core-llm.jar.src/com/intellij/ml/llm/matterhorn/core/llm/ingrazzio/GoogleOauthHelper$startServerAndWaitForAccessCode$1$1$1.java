/*    */ package com.intellij.ml.llm.matterhorn.core.llm.ingrazzio;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Pair;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.TuplesKt;
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
/*    */ @DebugMetadata(f = "GoogleOauthHelper.kt", l = {85, 86}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.ingrazzio.GoogleOauthHelper$startServerAndWaitForAccessCode$1$1$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\002\030\002\n\002\020\016\n\002\030\002\020\000\032\016\022\004\022\0020\002\022\004\022\0020\0030\001*\0020\004H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class GoogleOauthHelper$startServerAndWaitForAccessCode$1$1$1
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Pair<? extends AccessToken, ? extends String>>, Object>
/*    */ {
/*    */   Object L$0;
/*    */   int label;
/*    */   
/*    */   GoogleOauthHelper$startServerAndWaitForAccessCode$1$1$1(String $code, Function2<AccessToken, Continuation<? super String>, Object> $redirector, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     AccessToken token, accessToken1;
/* 84 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 85 */         this.label = 1; if (GoogleOauthHelper.access$fetchAccessToken(GoogleOauthHelper.this, this.$code, (Continuation)this) == object) return object;  token = (AccessToken)GoogleOauthHelper.access$fetchAccessToken(GoogleOauthHelper.this, this.$code, (Continuation)this);
/* 86 */         this.L$0 = accessToken1 = token; this.label = 2; if (this.$redirector.invoke(token, this) == object) return object;  return TuplesKt.to(accessToken1, this.$redirector.invoke(token, this));case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); token = (AccessToken)SYNTHETIC_LOCAL_VARIABLE_1; this.L$0 = accessToken1 = token; this.label = 2; if (this.$redirector.invoke(token, this) == object) return object;  return TuplesKt.to(accessToken1, this.$redirector.invoke(token, this));case 2: accessToken1 = (AccessToken)this.L$0; ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return TuplesKt.to(accessToken1, SYNTHETIC_LOCAL_VARIABLE_1); }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super GoogleOauthHelper$startServerAndWaitForAccessCode$1$1$1> $completion) {
/*    */     return (Continuation<Unit>)new GoogleOauthHelper$startServerAndWaitForAccessCode$1$1$1(this.$code, this.$redirector, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((GoogleOauthHelper$startServerAndWaitForAccessCode$1$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\ingrazzio\GoogleOauthHelper$startServerAndWaitForAccessCode$1$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */