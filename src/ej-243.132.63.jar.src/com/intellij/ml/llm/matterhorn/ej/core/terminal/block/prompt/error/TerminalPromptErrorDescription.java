/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.error;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020\002\n\000\bg\030\0002\0020\001J\b\020\f\032\0020\rH\026R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\026\020\006\032\004\030\0010\0078VX\004¢\006\006\032\004\b\b\020\tR\026\020\n\032\004\030\0010\0038VX\004¢\006\006\032\004\b\013\020\005¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/error/TerminalPromptErrorDescription;", "", "errorText", "", "getErrorText", "()Ljava/lang/String;", "icon", "Ljavax/swing/Icon;", "getIcon", "()Ljavax/swing/Icon;", "linkText", "getLinkText", "onLinkClick", "", "ej-core"})
/*    */ @Internal
/*    */ public interface TerminalPromptErrorDescription { @NotNull
/*    */   String getErrorText(); @Nullable
/*    */   Icon getIcon();
/*    */   @Nullable
/*    */   String getLinkText();
/*    */   void onLinkClick();
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls { @Nullable
/*    */     public static Icon getIcon(@NotNull TerminalPromptErrorDescription $this) {
/* 12 */       return null;
/*    */     } @Nullable
/*    */     public static String getLinkText(@NotNull TerminalPromptErrorDescription $this) {
/* 15 */       return null;
/*    */     }
/*    */     
/*    */     public static void onLinkClick(@NotNull TerminalPromptErrorDescription $this) {} }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\error\TerminalPromptErrorDescription.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */