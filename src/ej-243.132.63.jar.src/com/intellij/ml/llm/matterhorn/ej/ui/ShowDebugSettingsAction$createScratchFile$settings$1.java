/*    */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.core.llm.settings.MatterhornSettings;
/*    */ import com.intellij.ml.llm.matterhorn.core.llm.settings.MatterhornSettingsService;
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
/*    */ @DebugMetadata(f = "ShowDebugSettingsAction.kt", l = {23}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.ShowDebugSettingsAction$createScratchFile$settings$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettings;", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class ShowDebugSettingsAction$createScratchFile$settings$1
/*    */   extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MatterhornSettings>, Object> {
/*    */   int label;
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 22 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 23 */         this.label = 1; if (this.$service.getSettings((Continuation)this) == object) return object;  return this.$service.getSettings((Continuation)this);
/*    */       case 1:
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         return SYNTHETIC_LOCAL_VARIABLE_1; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   ShowDebugSettingsAction$createScratchFile$settings$1(MatterhornSettingsService $service, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super ShowDebugSettingsAction$createScratchFile$settings$1> $completion) {
/*    */     return (Continuation<Unit>)new ShowDebugSettingsAction$createScratchFile$settings$1(this.$service, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((ShowDebugSettingsAction$createScratchFile$settings$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\ShowDebugSettingsAction$createScratchFile$settings$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */