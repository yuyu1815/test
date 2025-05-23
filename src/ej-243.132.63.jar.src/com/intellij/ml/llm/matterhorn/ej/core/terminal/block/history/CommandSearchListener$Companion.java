/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.history;
/*    */ 
/*    */ import com.intellij.util.messages.Topic;
/*    */ import com.intellij.util.messages.Topic.ProjectLevel;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\034\020\004\032\b\022\004\022\0020\0060\0058\006X\004¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandSearchListener$Companion;", "", "<init>", "()V", "TOPIC", "Lcom/intellij/util/messages/Topic;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandSearchListener;", "getTOPIC", "()Lcom/intellij/util/messages/Topic;", "ej-core"})
/*    */ public final class Companion
/*    */ {
/*    */   @NotNull
/*    */   public final Topic<CommandSearchListener> getTOPIC() {
/* 15 */     return TOPIC; } @ProjectLevel @NotNull
/* 16 */   private static final Topic<CommandSearchListener> TOPIC = new Topic(CommandSearchListener.class, Topic.BroadcastDirection.NONE);
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\history\CommandSearchListener$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */