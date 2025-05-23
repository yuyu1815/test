/*    */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*    */ 
/*    */ import com.intellij.openapi.wm.ToolWindow;
/*    */ import com.intellij.ui.IconManager;
/*    */ import java.awt.Paint;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.NoWhenBranchMatchedException;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @DebugMetadata(f = "JunieEventNotificationService.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.JunieEventNotificationService$manageIconInToolbar$2$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\0012\b\020\002\032\004\030\0010\003H\n"}, d2 = {"<anonymous>", "", "notification", "Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$EventType;"})
/*    */ final class JunieEventNotificationService$manageIconInToolbar$2$1
/*    */   extends SuspendLambda
/*    */   implements Function2<JunieEventNotificationService.EventType, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   JunieEventNotificationService$manageIconInToolbar$2$1(ToolWindow $toolWindow, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     JunieEventNotificationService.EventType notification;
/* 80 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); notification = (JunieEventNotificationService.EventType)this.L$0;
/* 81 */         if (((notification == null) ? -1 : WhenMappings.$EnumSwitchMapping$0[notification.ordinal()]) == 
/* 82 */           -1) { this.$toolWindow.setIcon(JunieIcons.INSTANCE.getToolWindowLogo()); }
/*    */         else
/*    */         
/* 85 */         { switch ((notification == null) ? -1 : WhenMappings.$EnumSwitchMapping$0[notification.ordinal()]) { case true: case true: default: throw new NoWhenBranchMatchedException(); }  JunieEventNotificationService.EventType eventType = notification;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 93 */           Intrinsics.checkNotNull(eventType); this.$toolWindow.setIcon(IconManager.Companion.getInstance().withIconBadge(JunieIcons.INSTANCE.getToolWindowLogo(), (Paint)eventType)); }
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 98 */         return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super JunieEventNotificationService$manageIconInToolbar$2$1> $completion) {
/*    */     JunieEventNotificationService$manageIconInToolbar$2$1 junieEventNotificationService$manageIconInToolbar$2$1 = new JunieEventNotificationService$manageIconInToolbar$2$1(this.$toolWindow, $completion);
/*    */     junieEventNotificationService$manageIconInToolbar$2$1.L$0 = value;
/*    */     return (Continuation<Unit>)junieEventNotificationService$manageIconInToolbar$2$1;
/*    */   }
/*    */   
/*    */   public final Object invoke(JunieEventNotificationService.EventType p1, Continuation<?> p2) {
/*    */     return ((JunieEventNotificationService$manageIconInToolbar$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\JunieEventNotificationService$manageIconInToolbar$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */