/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.history;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\003\bg\030\000 \0072\0020\001:\001\007J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H\026¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandSearchListener;", "", "commandSearchShown", "", "promptModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModel;", "commandSearchAborted", "Companion", "ej-core"})
/*    */ @Internal
/*    */ public interface CommandSearchListener { @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   void commandSearchShown(@NotNull TerminalPromptModel paramTerminalPromptModel);
/*    */   void commandSearchAborted(@NotNull TerminalPromptModel paramTerminalPromptModel);
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls { public static void commandSearchShown(@NotNull CommandSearchListener $this, @NotNull TerminalPromptModel promptModel) {
/* 10 */       Intrinsics.checkNotNullParameter(promptModel, "promptModel");
/*    */     }
/* 12 */     public static void commandSearchAborted(@NotNull CommandSearchListener $this, @NotNull TerminalPromptModel promptModel) { Intrinsics.checkNotNullParameter(promptModel, "promptModel"); } }
/*    */    @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\034\020\004\032\b\022\004\022\0020\0060\0058\006X\004¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandSearchListener$Companion;", "", "<init>", "()V", "TOPIC", "Lcom/intellij/util/messages/Topic;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandSearchListener;", "getTOPIC", "()Lcom/intellij/util/messages/Topic;", "ej-core"})
/*    */   public static final class Companion { @NotNull
/* 15 */     public final Topic<CommandSearchListener> getTOPIC() { return TOPIC; } @ProjectLevel @NotNull
/* 16 */     private static final Topic<CommandSearchListener> TOPIC = new Topic(CommandSearchListener.class, Topic.BroadcastDirection.NONE); }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\history\CommandSearchListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */