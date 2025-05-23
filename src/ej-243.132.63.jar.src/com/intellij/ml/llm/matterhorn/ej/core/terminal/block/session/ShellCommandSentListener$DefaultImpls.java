/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ public final class DefaultImpls
/*    */ {
/*    */   public static void userCommandSent(@NotNull ShellCommandSentListener $this, @NotNull String userCommand) {
/* 16 */     Intrinsics.checkNotNullParameter(userCommand, "userCommand");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void generatorCommandSent(@NotNull ShellCommandSentListener $this, @NotNull String generatorCommand) {
/* 24 */     Intrinsics.checkNotNullParameter(generatorCommand, "generatorCommand");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\ShellCommandSentListener$DefaultImpls.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */