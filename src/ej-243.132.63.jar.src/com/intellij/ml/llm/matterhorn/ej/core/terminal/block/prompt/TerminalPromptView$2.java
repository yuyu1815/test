/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.error.TerminalPromptErrorDescription;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.error.TerminalPromptErrorStateListener;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.error.TerminalPromptErrorUtil;
/*     */ import javax.swing.JComponent;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\022\020\002\032\0020\0032\b\020\004\032\004\030\0010\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptView$2", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/error/TerminalPromptErrorStateListener;", "errorStateChanged", "", "description", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/error/TerminalPromptErrorDescription;", "ej-core"})
/*     */ public final class null
/*     */   implements TerminalPromptErrorStateListener
/*     */ {
/*     */   public void errorStateChanged(TerminalPromptErrorDescription description) {
/* 132 */     Intrinsics.checkNotNullExpressionValue(TerminalPromptView.access$getEditor$p(TerminalPromptView.this).getColorsScheme(), "getColorsScheme(...)"); JComponent errorComponent = (description != null) ? TerminalPromptErrorUtil.INSTANCE.createErrorComponent(description, TerminalPromptView.access$getEditor$p(TerminalPromptView.this).getColorsScheme()) : 
/*     */       
/* 134 */       null;
/* 135 */     TerminalPromptView.access$getPromptPanel$p(TerminalPromptView.this).setBottomComponent(errorComponent);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\TerminalPromptView$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */