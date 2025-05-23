/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.login;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.JunieFeedbackDialog;
/*     */ import com.intellij.openapi.application.CoroutinesKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Dispatchers;
/*     */ import kotlinx.coroutines.flow.MutableStateFlow;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "StartLoadingViewModelImpl.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.StartLoadingViewModelImpl$userAskForHelp$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ @SourceDebugExtension({"SMAP\nStartLoadingViewModelImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartLoadingViewModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl$userAskForHelp$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,150:1\n226#2,5:151\n*S KotlinDebug\n*F\n+ 1 StartLoadingViewModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl$userAskForHelp$1\n*L\n139#1:151,5\n*E\n"})
/*     */ final class StartLoadingViewModelImpl$userAskForHelp$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   StartLoadingViewModelImpl$userAskForHelp$1(Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     MutableStateFlow mutableStateFlow;
/*     */     StartLoadingViewModelImpl startLoadingViewModelImpl;
/*     */     int $i$f$update;
/* 135 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 136 */         StartLoadingViewModelImpl.access$getCheckAccessJob$p(StartLoadingViewModelImpl.this); if (!((StartLoadingViewModelImpl.access$getCheckAccessJob$p(StartLoadingViewModelImpl.this) != null) ? ((StartLoadingViewModelImpl.access$getCheckAccessJob$p(StartLoadingViewModelImpl.this).isActive() == true) ? 1 : 0) : 0)) {
/* 137 */           StartLoadingViewModelImpl.this.startLoginAction(false);
/*     */         }
/* 139 */         mutableStateFlow = StartLoadingViewModelImpl.access$get_state$p(StartLoadingViewModelImpl.this); startLoadingViewModelImpl = StartLoadingViewModelImpl.this; $i$f$update = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         while (true) {
/* 152 */           Object prevValue$iv = mutableStateFlow.getValue();
/* 153 */           (LoginScreenState)prevValue$iv; int $i$a$-update-StartLoadingViewModelImpl$userAskForHelp$1$1 = 0; Object nextValue$iv = new LoginScreenState.NeedHelp(StartLoadingViewModelImpl.access$getAuthLinkFlow$p(startLoadingViewModelImpl), startLoadingViewModelImpl::invokeSuspend$lambda$1$lambda$0);
/* 154 */           if (mutableStateFlow.compareAndSet(prevValue$iv, nextValue$iv))
/*     */             return Unit.INSTANCE; 
/*     */         }  }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super StartLoadingViewModelImpl$userAskForHelp$1> $completion) {
/*     */     return (Continuation<Unit>)new StartLoadingViewModelImpl$userAskForHelp$1($completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((StartLoadingViewModelImpl$userAskForHelp$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */   
/*     */   private static final Unit invokeSuspend$lambda$1$lambda$0(StartLoadingViewModelImpl this$0) {
/*     */     BuildersKt.launch$default(StartLoadingViewModelImpl.this.getScope(), null, null, new StartLoadingViewModelImpl$userAskForHelp$1$1$1$1(null), 3, null);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\StartLoadingViewModelImpl$userAskForHelp$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */