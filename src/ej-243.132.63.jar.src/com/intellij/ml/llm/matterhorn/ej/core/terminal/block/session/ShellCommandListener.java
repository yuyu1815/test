/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptState;
/*     */ import java.util.EventListener;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\002\b\003\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\002\b`\030\0002\0020\001J\b\020\002\032\0020\003H\026J\b\020\004\032\0020\003H\026J\020\020\005\032\0020\0032\006\020\006\032\0020\007H\026J\020\020\b\032\0020\0032\006\020\t\032\0020\nH\026J\020\020\013\032\0020\0032\006\020\f\032\0020\rH\026J\020\020\016\032\0020\0032\006\020\017\032\0020\007H\026J\020\020\020\032\0020\0032\006\020\021\032\0020\007H\026J\020\020\022\032\0020\0032\006\020\023\032\0020\007H\026J\020\020\024\032\0020\0032\006\020\t\032\0020\025H\026J\b\020\026\032\0020\003H\026¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener;", "Ljava/util/EventListener;", "initialized", "", "promptShown", "commandStarted", "command", "", "commandFinished", "event", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/CommandFinishedEvent;", "promptStateUpdated", "newState", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptState;", "commandHistoryReceived", "history", "commandBufferReceived", "buffer", "shellInfoReceived", "rawShellInfo", "generatorFinished", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/GeneratorFinishedEvent;", "clearInvoked", "ej-core"})
/*     */ public interface ShellCommandListener
/*     */   extends EventListener
/*     */ {
/*     */   void initialized();
/*     */   
/*     */   void promptShown();
/*     */   
/*     */   void commandStarted(@NotNull String paramString);
/*     */   
/*     */   void commandFinished(@NotNull CommandFinishedEvent paramCommandFinishedEvent);
/*     */   
/*     */   void promptStateUpdated(@NotNull TerminalPromptState paramTerminalPromptState);
/*     */   
/*     */   void commandHistoryReceived(@NotNull String paramString);
/*     */   
/*     */   void commandBufferReceived(@NotNull String paramString);
/*     */   
/*     */   void shellInfoReceived(@NotNull String paramString);
/*     */   
/*     */   void generatorFinished(@NotNull GeneratorFinishedEvent paramGeneratorFinishedEvent);
/*     */   
/*     */   void clearInvoked();
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   public static final class DefaultImpls
/*     */   {
/*     */     public static void initialized(@NotNull ShellCommandListener $this) {}
/*     */     
/*     */     public static void promptShown(@NotNull ShellCommandListener $this) {}
/*     */     
/*     */     public static void commandStarted(@NotNull ShellCommandListener $this, @NotNull String command) {
/* 283 */       Intrinsics.checkNotNullParameter(command, "command");
/*     */     }
/*     */     public static void commandFinished(@NotNull ShellCommandListener $this, @NotNull CommandFinishedEvent event) {
/* 286 */       Intrinsics.checkNotNullParameter(event, "event");
/*     */     } public static void promptStateUpdated(@NotNull ShellCommandListener $this, @NotNull TerminalPromptState newState) {
/* 288 */       Intrinsics.checkNotNullParameter(newState, "newState");
/*     */     } public static void commandHistoryReceived(@NotNull ShellCommandListener $this, @NotNull String history) {
/* 290 */       Intrinsics.checkNotNullParameter(history, "history");
/*     */     } public static void commandBufferReceived(@NotNull ShellCommandListener $this, @NotNull String buffer) {
/* 292 */       Intrinsics.checkNotNullParameter(buffer, "buffer");
/*     */     } public static void shellInfoReceived(@NotNull ShellCommandListener $this, @NotNull String rawShellInfo) {
/* 294 */       Intrinsics.checkNotNullParameter(rawShellInfo, "rawShellInfo");
/*     */     } public static void generatorFinished(@NotNull ShellCommandListener $this, @NotNull GeneratorFinishedEvent event) {
/* 296 */       Intrinsics.checkNotNullParameter(event, "event");
/*     */     }
/*     */     
/*     */     public static void clearInvoked(@NotNull ShellCommandListener $this) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\ShellCommandListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */