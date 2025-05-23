/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.toolwindow;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.ErrorInfo;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.Boxing;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
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
/*     */ @DebugMetadata(f = "JuniorToolWindowViewModel.kt", l = {100}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.JuniorToolWindowViewModel$refreshJunieProblems$2$1$1$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\013\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""})
/*     */ final class JuniorToolWindowViewModel$refreshJunieProblems$2$1$1$1
/*     */   extends SuspendLambda
/*     */   implements Function1<Continuation<? super Boolean>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   JuniorToolWindowViewModel$refreshJunieProblems$2$1$1$1(Continuation $completion) {
/*     */     super(1, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/* 100 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (JuniorToolWindowViewModelKt.checkAgreements((Continuation<? super ErrorInfo>)this) == object) return object;  JuniorToolWindowViewModelKt.checkAgreements((Continuation<? super ErrorInfo>)this); return Boxing.boxBoolean(true);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Boxing.boxBoolean(true); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Continuation<? super JuniorToolWindowViewModel$refreshJunieProblems$2$1$1$1> $completion) {
/*     */     return (Continuation<Unit>)new JuniorToolWindowViewModel$refreshJunieProblems$2$1$1$1($completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(Continuation<?> p1) {
/*     */     return ((JuniorToolWindowViewModel$refreshJunieProblems$2$1$1$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\toolwindow\JuniorToolWindowViewModel$refreshJunieProblems$2$1$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */