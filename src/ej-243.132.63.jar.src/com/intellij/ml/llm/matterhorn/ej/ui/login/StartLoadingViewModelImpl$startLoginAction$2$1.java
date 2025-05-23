/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.login;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.ErrorInfo;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.JuniorToolWindowViewModelKt;
/*     */ import java.util.concurrent.CancellationException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
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
/*     */ @DebugMetadata(f = "StartLoadingViewModelImpl.kt", l = {90, 91, 92}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.StartLoadingViewModelImpl$startLoginAction$2$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ @SourceDebugExtension({"SMAP\nStartLoadingViewModelImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartLoadingViewModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl$startLoginAction$2$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,150:1\n226#2,5:151\n*S KotlinDebug\n*F\n+ 1 StartLoadingViewModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl$startLoginAction$2$1\n*L\n95#1:151,5\n*E\n"})
/*     */ final class null
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   null(boolean $openBrowser, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*  88 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         
/*  90 */         try { this.label = 1; if (JuniorToolWindowViewModelKt.checkAgreements((Continuation)this) == object) return object;  if (JuniorToolWindowViewModelKt.checkAgreements((Continuation)this) != null) return Unit.INSTANCE; 
/*  91 */           this.label = 2; if (StartLoadingViewModelImpl.access$getAuthService$p(StartLoadingViewModelImpl.this).startAndAwaitAuthorizationProcess(this.$openBrowser, (Continuation)this) == object) return object;  StartLoadingViewModelImpl.access$getAuthService$p(StartLoadingViewModelImpl.this).startAndAwaitAuthorizationProcess(this.$openBrowser, (Continuation)this);
/*  92 */           this.label = 3; if (StartLoadingViewModelImpl.applyCheckAccess$default(StartLoadingViewModelImpl.this, false, (Continuation)this, 1, null) == object) return object;  StartLoadingViewModelImpl.applyCheckAccess$default(StartLoadingViewModelImpl.this, false, (Continuation)this, 1, null); }
/*  93 */         catch (CancellationException cancellationException) {  }
/*  94 */         catch (Exception e)
/*  95 */         { MutableStateFlow $this$update$iv = StartLoadingViewModelImpl.access$get_state$p(StartLoadingViewModelImpl.this); int $i$f$update = 0;
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
/*     */           while (true) {
/* 152 */             Object prevValue$iv = $this$update$iv.getValue();
/* 153 */             (LoginScreenState)prevValue$iv; int $i$a$-update-StartLoadingViewModelImpl$startLoginAction$2$1$2 = 0; Object nextValue$iv = new LoginScreenState.Idle(new ErrorInfo("Authorization error", null, null, 6, null));
/* 154 */             if ($this$update$iv.compareAndSet(prevValue$iv, nextValue$iv))
/*     */               StartLoadingViewModelImpl.access$getLogger(StartLoadingViewModelImpl.this).error(e); 
/*     */           }  }
/*     */         
/*     */         return Unit.INSTANCE;
/*     */       case 1:
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         if (SYNTHETIC_LOCAL_VARIABLE_1 != null)
/*     */           return Unit.INSTANCE; 
/*     */         this.label = 2;
/*     */         if (StartLoadingViewModelImpl.access$getAuthService$p(StartLoadingViewModelImpl.this).startAndAwaitAuthorizationProcess(this.$openBrowser, (Continuation)this) == object)
/*     */           return object; 
/*     */         StartLoadingViewModelImpl.access$getAuthService$p(StartLoadingViewModelImpl.this).startAndAwaitAuthorizationProcess(this.$openBrowser, (Continuation)this);
/*     */         this.label = 3;
/*     */         if (StartLoadingViewModelImpl.applyCheckAccess$default(StartLoadingViewModelImpl.this, false, (Continuation)this, 1, null) == object)
/*     */           return object; 
/*     */         StartLoadingViewModelImpl.applyCheckAccess$default(StartLoadingViewModelImpl.this, false, (Continuation)this, 1, null);
/*     */       case 2:
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         this.label = 3;
/*     */         if (StartLoadingViewModelImpl.applyCheckAccess$default(StartLoadingViewModelImpl.this, false, (Continuation)this, 1, null) == object)
/*     */           return object; 
/*     */         StartLoadingViewModelImpl.applyCheckAccess$default(StartLoadingViewModelImpl.this, false, (Continuation)this, 1, null);
/*     */       case 3:
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */     return (Continuation<Unit>)new Object(StartLoadingViewModelImpl.this, this.$openBrowser, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\StartLoadingViewModelImpl$startLoginAction$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */