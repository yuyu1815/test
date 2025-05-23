/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie.activity;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ @DebugMetadata(f = "ActivityLauncher.kt", l = {81}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.activity.ActivityLauncherImpl$launchActivity$deferred$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\002\n\002\030\002\020\000\032\002H\001\"\004\b\000\020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Ret", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ @SourceDebugExtension({"SMAP\nActivityLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityLauncher.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncherImpl$launchActivity$deferred$1\n+ 2 ActivityLauncher.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncherImpl\n*L\n1#1,80:1\n57#2:81\n*S KotlinDebug\n*F\n+ 1 ActivityLauncher.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncherImpl$launchActivity$deferred$1\n*L\n49#1:81\n*E\n"})
/*    */ final class ActivityLauncherImpl$launchActivity$deferred$1
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Ret>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   ActivityLauncherImpl$launchActivity$deferred$1(Function1<Continuation<? super Ret>, Object> $block, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     ActivityLauncherImpl<Ret, Err, Val> activityLauncherImpl;
/*    */     Function1<Continuation<? super Ret>, Object> function1;
/*    */     int $i$f$runLocked;
/* 48 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 49 */         activityLauncherImpl = ActivityLauncherImpl.this; function1 = this.$block; $i$f$runLocked = 0;
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
/* 81 */         this.label = 1; if (ActivityLauncherImpl.access$getSemaphore$p(activityLauncherImpl).withPermit(new ActivityLauncherImpl$launchActivity$deferred$1$invokeSuspend$$inlined$runLocked$1(activityLauncherImpl, null, function1), (Continuation)this) == object) return object;  return ActivityLauncherImpl.access$getSemaphore$p(activityLauncherImpl).withPermit(new ActivityLauncherImpl$launchActivity$deferred$1$invokeSuspend$$inlined$runLocked$1(activityLauncherImpl, null, function1), (Continuation)this);
/*    */       case 1:
/*    */         $i$f$runLocked = 0;
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         return SYNTHETIC_LOCAL_VARIABLE_1; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super ActivityLauncherImpl$launchActivity$deferred$1> $completion) {
/*    */     return (Continuation<Unit>)new ActivityLauncherImpl$launchActivity$deferred$1(this.$block, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((ActivityLauncherImpl$launchActivity$deferred$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\activity\ActivityLauncherImpl$launchActivity$deferred$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */