/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session;
/*    */ import java.util.EventListener;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\016\n\002\b\003\b`\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\007\032\0020\005H\026¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandSentListener;", "Ljava/util/EventListener;", "userCommandSent", "", "userCommand", "", "generatorCommandSent", "generatorCommand", "ej-core"})
/*    */ public interface ShellCommandSentListener extends EventListener {
/*    */   void userCommandSent(@NotNull String paramString);
/*    */   
/*    */   void generatorCommandSent(@NotNull String paramString);
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls {
/*    */     public static void userCommandSent(@NotNull ShellCommandSentListener $this, @NotNull String userCommand) {
/* 16 */       Intrinsics.checkNotNullParameter(userCommand, "userCommand");
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public static void generatorCommandSent(@NotNull ShellCommandSentListener $this, @NotNull String generatorCommand) {
/* 24 */       Intrinsics.checkNotNullParameter(generatorCommand, "generatorCommand");
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\ShellCommandSentListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */