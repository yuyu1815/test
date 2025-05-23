/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.login;
/*    */ 
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.JbaAuthData;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.repos.JunieJbaUserRepository;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.flow.FlowKt;
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
/*    */ @DebugMetadata(f = "GrazieActivationPage.kt", l = {44}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.GrazieActivationPageKt$GrazieActivationPage$1$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class GrazieActivationPageKt$GrazieActivationPage$1$1
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   GrazieActivationPageKt$GrazieActivationPage$1$1(MutableState<String> $username$delegate, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 43 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 44 */         this.label = 1; if (FlowKt.collectLatest(JunieJbaUserRepository.Companion.syncInstance().getAuthDataFlow(), new Function2<JbaAuthData, Continuation<? super Unit>, Object>(this.$username$delegate, null) { int label; public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { Function2<JbaAuthData, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$username$delegate, $completion); function2.L$0 = value; return (Continuation)function2; } public final Object invoke(JbaAuthData p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } public final Object invokeSuspend(Object $result) { JbaAuthData it; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (JbaAuthData)this.L$0;
/* 45 */                     it.getUser(); GrazieActivationPageKt.access$GrazieActivationPage$lambda$4(this.$username$delegate, (it != null && it.getUser() != null) ? it.getUser().getPresentableName() : null);
/* 46 */                     return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } }(Continuation)this) == object) return object;  FlowKt.collectLatest(JunieJbaUserRepository.Companion.syncInstance().getAuthDataFlow(), new Function2<JbaAuthData, Continuation<? super Unit>, Object>(this.$username$delegate, null) { int label; public final Object invokeSuspend(Object $result) { JbaAuthData it; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (JbaAuthData)this.L$0; it.getUser(); GrazieActivationPageKt.access$GrazieActivationPage$lambda$4(this.$username$delegate, (it != null && it.getUser() != null) ? it.getUser().getPresentableName() : null); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { Function2<JbaAuthData, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$username$delegate, $completion); function2.L$0 = value; return (Continuation)function2; }
/* 47 */               public final Object invoke(JbaAuthData p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super GrazieActivationPageKt$GrazieActivationPage$1$1> $completion) {
/*    */     return (Continuation<Unit>)new GrazieActivationPageKt$GrazieActivationPage$1$1(this.$username$delegate, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((GrazieActivationPageKt$GrazieActivationPage$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\GrazieActivationPageKt$GrazieActivationPage$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */