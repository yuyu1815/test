/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.lang;
/*    */ 
/*    */ import com.intellij.lang.ASTNode;
/*    */ import com.intellij.psi.PlainTextTokenTypes;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.impl.source.tree.CompositeElement;
/*    */ import com.intellij.psi.impl.source.tree.LazyParseablePsiElement;
/*    */ import com.intellij.psi.impl.source.tree.TreeElement;
/*    */ import com.intellij.psi.tree.IElementType;
/*    */ import com.intellij.psi.tree.IFileElementType;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.plugins.terminal.exp.completion.TerminalShellSupport;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\004\030\0002\0020\001B\007¢\006\004\b\002\020\003J\030\020\004\032\0020\0052\006\020\006\032\0020\0052\006\020\007\032\0020\bH\024¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/lang/TerminalPromptFileViewProvider$TerminalPromptFileElementType;", "Lcom/intellij/psi/tree/IFileElementType;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/lang/TerminalPromptFileViewProvider;)V", "doParseContents", "Lcom/intellij/lang/ASTNode;", "chameleon", "psi", "Lcom/intellij/psi/PsiElement;", "ej-core"})
/*    */ final class TerminalPromptFileElementType
/*    */   extends IFileElementType
/*    */ {
/*    */   public TerminalPromptFileElementType() {
/* 54 */     super("TERMINAL_PROMPT_FILE", TerminalPromptLanguage.INSTANCE, false); } @NotNull
/*    */   protected ASTNode doParseContents(@NotNull ASTNode chameleon, @NotNull PsiElement psi) {
/* 56 */     Intrinsics.checkNotNullParameter(chameleon, "chameleon"); Intrinsics.checkNotNullParameter(psi, "psi"); int inputOffset = Math.min(TerminalPromptFileViewProvider.access$getPromptModel(TerminalPromptFileViewProvider.this).getCommandStartOffset(), chameleon.getChars().length());
/* 57 */     if (TerminalShellSupport.Companion.findByShellType(TerminalPromptFileViewProvider.access$getShellType(TerminalPromptFileViewProvider.this)) == null || TerminalShellSupport.Companion.findByShellType(TerminalPromptFileViewProvider.access$getShellType(TerminalPromptFileViewProvider.this)).getPromptContentElementType() == null) TerminalShellSupport.Companion.findByShellType(TerminalPromptFileViewProvider.access$getShellType(TerminalPromptFileViewProvider.this)).getPromptContentElementType();  IElementType inputElementType = 
/* 58 */       PlainTextTokenTypes.PLAIN_TEXT_FILE;
/* 59 */     LazyParseablePsiElement promptNode = new LazyParseablePsiElement(PlainTextTokenTypes.PLAIN_TEXT_FILE, chameleon.getChars().subSequence(0, inputOffset));
/* 60 */     LazyParseablePsiElement inputNode = new LazyParseablePsiElement(inputElementType, chameleon.getChars().subSequence(inputOffset, chameleon.getChars().length()));
/*    */     
/* 62 */     CompositeElement root = new CompositeElement(TerminalPromptFileViewProvider.access$getCONTENT_ELEMENT_TYPE$cp());
/* 63 */     root.setPsi((PsiElement)new TerminalPromptFileViewProvider.TerminalPromptContentElement((ASTNode)root));
/* 64 */     root.rawAddChildrenWithoutNotifications((TreeElement)promptNode);
/* 65 */     root.rawAddChildrenWithoutNotifications((TreeElement)inputNode);
/* 66 */     return (ASTNode)root;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\lang\TerminalPromptFileViewProvider$TerminalPromptFileElementType.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */