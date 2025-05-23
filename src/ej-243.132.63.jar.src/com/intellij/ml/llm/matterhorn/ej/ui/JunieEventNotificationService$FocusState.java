/*    */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*    */ 
/*    */ import com.intellij.openapi.wm.IdeFrame;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\007\b\002\030\000 \0132\0020\001:\001\013B\033\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005¢\006\004\b\006\020\007R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\002\020\bR\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\t\020\n¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$FocusState;", "", "isIdeFocused", "", "ideFrame", "Lcom/intellij/openapi/wm/IdeFrame;", "<init>", "(ZLcom/intellij/openapi/wm/IdeFrame;)V", "()Z", "getIdeFrame", "()Lcom/intellij/openapi/wm/IdeFrame;", "Companion", "ej-ui"})
/*    */ final class FocusState
/*    */ {
/*    */   public final boolean isIdeFocused() {
/*    */     return this.isIdeFocused;
/*    */   }
/*    */   
/*    */   public FocusState(boolean isIdeFocused, @Nullable IdeFrame ideFrame) {
/* 62 */     this.isIdeFocused = isIdeFocused;
/* 63 */     this.ideFrame = ideFrame; } @Nullable public final IdeFrame getIdeFrame() { return this.ideFrame; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$FocusState$Companion;", "", "<init>", "()V", "Default", "Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$FocusState;", "getDefault", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$FocusState;", "ej-ui"})
/*    */   public static final class Companion {
/*    */     @NotNull
/* 66 */     public final JunieEventNotificationService.FocusState getDefault() { return JunieEventNotificationService.FocusState.Default; } private Companion() {} } @NotNull public static final Companion Companion = new Companion(null); private final boolean isIdeFocused; @Nullable private final IdeFrame ideFrame; @NotNull private static final FocusState Default = new FocusState(false, null);
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\JunieEventNotificationService$FocusState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */