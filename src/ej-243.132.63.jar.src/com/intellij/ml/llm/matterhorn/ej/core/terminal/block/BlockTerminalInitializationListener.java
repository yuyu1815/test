/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bg\030\000 \b2\0020\001:\001\bJ\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H&¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalInitializationListener;", "", "modelsInitialized", "", "promptModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModel;", "outputModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;", "Companion", "ej-core"})
/*    */ @Internal
/*    */ public interface BlockTerminalInitializationListener {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   void modelsInitialized(@NotNull TerminalPromptModel paramTerminalPromptModel, @NotNull TerminalOutputModel paramTerminalOutputModel);
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\034\020\004\032\b\022\004\022\0020\0060\0058\006X\004¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalInitializationListener$Companion;", "", "<init>", "()V", "TOPIC", "Lcom/intellij/util/messages/Topic;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalInitializationListener;", "getTOPIC", "()Lcom/intellij/util/messages/Topic;", "ej-core"})
/*    */   public static final class Companion {
/*    */     @NotNull
/* 14 */     public final Topic<BlockTerminalInitializationListener> getTOPIC() { return TOPIC; } @ProjectLevel @NotNull
/* 15 */     private static final Topic<BlockTerminalInitializationListener> TOPIC = new Topic(BlockTerminalInitializationListener.class, Topic.BroadcastDirection.NONE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\BlockTerminalInitializationListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */