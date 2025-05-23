/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*    */ 
/*    */ import com.intellij.util.xmlb.annotations.XMap;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020%\n\002\020\016\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\n\n\002\020\t\n\002\b\b\030\0002\0020\001B\007¢\006\004\b\002\020\003R\037\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\0058G¢\006\b\n\000\032\004\b\b\020\tR\032\020\n\032\0020\013X\016¢\006\016\n\000\032\004\b\f\020\r\"\004\b\016\020\017R\034\020\020\032\004\030\0010\006X\016¢\006\016\n\000\032\004\b\021\020\022\"\004\b\023\020\024R\032\020\025\032\0020\026X\016¢\006\016\n\000\032\004\b\027\020\030\"\004\b\031\020\032R\032\020\033\032\0020\026X\016¢\006\016\n\000\032\004\b\034\020\030\"\004\b\035\020\032¨\006\036"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalUsageLocalStorage$State;", "", "<init>", "()V", "shellToExecutedCommandsNumber", "", "", "", "getShellToExecutedCommandsNumber", "()Ljava/util/Map;", "feedbackNotificationShown", "", "getFeedbackNotificationShown", "()Z", "setFeedbackNotificationShown", "(Z)V", "blockTerminalUsedLastVersion", "getBlockTerminalUsedLastVersion", "()Ljava/lang/String;", "setBlockTerminalUsedLastVersion", "(Ljava/lang/String;)V", "blockTerminalUsedLastTimeMillis", "", "getBlockTerminalUsedLastTimeMillis", "()J", "setBlockTerminalUsedLastTimeMillis", "(J)V", "blockTerminalDisabledLastTimeMillis", "getBlockTerminalDisabledLastTimeMillis", "setBlockTerminalDisabledLastTimeMillis", "ej-core"})
/*    */ public final class State
/*    */ {
/*    */   @XMap
/*    */   @NotNull
/*    */   public final Map<String, Integer> getShellToExecutedCommandsNumber() {
/* 44 */     return this.shellToExecutedCommandsNumber; } private boolean feedbackNotificationShown; @Nullable private String blockTerminalUsedLastVersion; @NotNull
/* 45 */   private final Map<String, Integer> shellToExecutedCommandsNumber = new HashMap<>(); private long blockTerminalUsedLastTimeMillis; private long blockTerminalDisabledLastTimeMillis; public final boolean getFeedbackNotificationShown() {
/* 46 */     return this.feedbackNotificationShown; } public final void setFeedbackNotificationShown(boolean <set-?>) { this.feedbackNotificationShown = <set-?>; } @Nullable
/* 47 */   public final String getBlockTerminalUsedLastVersion() { return this.blockTerminalUsedLastVersion; } public final void setBlockTerminalUsedLastVersion(@Nullable String <set-?>) { this.blockTerminalUsedLastVersion = <set-?>; }
/* 48 */   public final long getBlockTerminalUsedLastTimeMillis() { return this.blockTerminalUsedLastTimeMillis; } public final void setBlockTerminalUsedLastTimeMillis(long <set-?>) { this.blockTerminalUsedLastTimeMillis = <set-?>; }
/* 49 */   public final long getBlockTerminalDisabledLastTimeMillis() { return this.blockTerminalDisabledLastTimeMillis; } public final void setBlockTerminalDisabledLastTimeMillis(long <set-?>) { this.blockTerminalDisabledLastTimeMillis = <set-?>; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\TerminalUsageLocalStorage$State.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */