/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.login;
/*    */ 
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.JbaAuthData;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
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
/*    */ @DebugMetadata(f = "GrazieActivationPage.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.GrazieActivationPageKt$GrazieActivationPage$1$1$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\0012\b\020\002\032\004\030\0010\003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaAuthData;"})
/*    */ final class null
/*    */   extends SuspendLambda
/*    */   implements Function2<JbaAuthData, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   null(MutableState<String> $username$delegate, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     JbaAuthData it;
/* 44 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (JbaAuthData)this.L$0;
/* 45 */         it.getUser(); GrazieActivationPageKt.access$GrazieActivationPage$lambda$4(this.$username$delegate, (it != null && it.getUser() != null) ? it.getUser().getPresentableName() : null);
/* 46 */         return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*    */     Object object = new Object(this.$username$delegate, $completion);
/*    */     object.L$0 = value;
/*    */     return (Continuation<Unit>)object;
/*    */   }
/*    */   
/*    */   public final Object invoke(JbaAuthData p1, Continuation<?> p2) {
/*    */     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\GrazieActivationPageKt$GrazieActivationPage$1$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */