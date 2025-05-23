/*    */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*    */ 
/*    */ import com.intellij.openapi.application.ApplicationActivationListener;
/*    */ import com.intellij.openapi.wm.IdeFrame;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.channels.ProducerScope;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H\026¨\006\007"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$_isIdeFocused$1$1", "Lcom/intellij/openapi/application/ApplicationActivationListener;", "applicationActivated", "", "ideFrame", "Lcom/intellij/openapi/wm/IdeFrame;", "applicationDeactivated", "ej-ui"})
/*    */ public final class JunieEventNotificationService$_isIdeFocused$1$1
/*    */   implements ApplicationActivationListener
/*    */ {
/*    */   JunieEventNotificationService$_isIdeFocused$1$1(ProducerScope<JunieEventNotificationService.FocusState> $this_connectionFlow) {}
/*    */   
/*    */   public void applicationActivated(IdeFrame ideFrame) {
/* 42 */     Intrinsics.checkNotNullParameter(ideFrame, "ideFrame"); this.$this_connectionFlow.trySend-JP2dKIU(new JunieEventNotificationService.FocusState(true, ideFrame));
/*    */   }
/*    */   
/*    */   public void applicationDeactivated(IdeFrame ideFrame) {
/* 46 */     Intrinsics.checkNotNullParameter(ideFrame, "ideFrame"); this.$this_connectionFlow.trySend-JP2dKIU(new JunieEventNotificationService.FocusState(false, ideFrame));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\JunieEventNotificationService$_isIdeFocused$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */