/*    */ package com.intellij.ml.llm.matterhorn.core.llm.settings;
/*    */ 
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
/*    */ @DebugMetadata(f = "MatterhornSettingsService.kt", l = {71}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.settings.MatterhornSettingsService$withOverriddenSettings$2$ret$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\002\n\002\030\002\020\000\032\002H\001\"\004\b\000\020\001*\0020\002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class MatterhornSettingsService$withOverriddenSettings$2$ret$1
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super T>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   MatterhornSettingsService$withOverriddenSettings$2$ret$1(Function2<CoroutineScope, Continuation<? super T>, Object> $body, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     CoroutineScope $this$coroutineScope;
/* 70 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$coroutineScope = (CoroutineScope)this.L$0;
/* 71 */         this.label = 1; if (this.$body.invoke($this$coroutineScope, this) == object) return object;  return this.$body.invoke($this$coroutineScope, this);
/*    */       case 1:
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         return SYNTHETIC_LOCAL_VARIABLE_1; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super MatterhornSettingsService$withOverriddenSettings$2$ret$1> $completion) {
/*    */     MatterhornSettingsService$withOverriddenSettings$2$ret$1 matterhornSettingsService$withOverriddenSettings$2$ret$1 = new MatterhornSettingsService$withOverriddenSettings$2$ret$1(this.$body, $completion);
/*    */     matterhornSettingsService$withOverriddenSettings$2$ret$1.L$0 = value;
/*    */     return (Continuation<Unit>)matterhornSettingsService$withOverriddenSettings$2$ret$1;
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((MatterhornSettingsService$withOverriddenSettings$2$ret$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\settings\MatterhornSettingsService$withOverriddenSettings$2$ret$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */