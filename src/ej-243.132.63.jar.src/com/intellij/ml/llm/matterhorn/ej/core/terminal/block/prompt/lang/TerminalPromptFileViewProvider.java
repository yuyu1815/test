/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.lang;
/*    */ import com.intellij.extapi.psi.ASTWrapperPsiElement;
/*    */ import com.intellij.lang.ASTNode;
/*    */ import com.intellij.lang.Language;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptModel;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import com.intellij.psi.FileViewProvider;
/*    */ import com.intellij.psi.PlainTextTokenTypes;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import com.intellij.psi.PsiManager;
/*    */ import com.intellij.psi.SingleRootFileViewProvider;
/*    */ import com.intellij.psi.impl.source.tree.CompositeElement;
/*    */ import com.intellij.psi.impl.source.tree.LazyParseablePsiElement;
/*    */ import com.intellij.psi.impl.source.tree.TreeElement;
/*    */ import com.intellij.psi.tree.IElementType;
/*    */ import com.intellij.psi.tree.IFileElementType;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.plugins.terminal.exp.completion.TerminalShellSupport;
/*    */ import org.jetbrains.plugins.terminal.util.ShellType;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\006\b\000\030\000 \0322\0020\001:\003\030\031\032B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\020\020\022\032\0020\0232\006\020\024\032\0020\025H\024J\020\020\026\032\0020\0012\006\020\027\032\0020\005H\026R\024\020\n\032\0020\0138BX\004¢\006\006\032\004\b\f\020\rR\024\020\016\032\0020\0178BX\004¢\006\006\032\004\b\020\020\021¨\006\033"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/lang/TerminalPromptFileViewProvider;", "Lcom/intellij/psi/SingleRootFileViewProvider;", "psiManager", "Lcom/intellij/psi/PsiManager;", "virtualFile", "Lcom/intellij/openapi/vfs/VirtualFile;", "eventSystemEnabled", "", "<init>", "(Lcom/intellij/psi/PsiManager;Lcom/intellij/openapi/vfs/VirtualFile;Z)V", "shellType", "Lorg/jetbrains/plugins/terminal/util/ShellType;", "getShellType", "()Lorg/jetbrains/plugins/terminal/util/ShellType;", "promptModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModel;", "getPromptModel", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModel;", "createFile", "Lcom/intellij/psi/PsiFile;", "lang", "Lcom/intellij/lang/Language;", "createCopy", "copy", "TerminalPromptFileElementType", "TerminalPromptContentElement", "Companion", "ej-core"})
/*    */ public final class TerminalPromptFileViewProvider extends SingleRootFileViewProvider {
/*    */   public TerminalPromptFileViewProvider(@NotNull PsiManager psiManager, @NotNull VirtualFile virtualFile, boolean eventSystemEnabled) {
/* 28 */     super(psiManager, virtualFile, eventSystemEnabled, TerminalPromptLanguage.INSTANCE);
/*    */   } private final ShellType getShellType() {
/* 30 */     Intrinsics.checkNotNull(getVirtualFile().getUserData(ShellType.Companion.getKEY())); return (ShellType)getVirtualFile().getUserData(ShellType.Companion.getKEY());
/*    */   } private final TerminalPromptModel getPromptModel() {
/* 32 */     Intrinsics.checkNotNull(getVirtualFile().getUserData(TerminalPromptModel.Companion.getKEY())); return (TerminalPromptModel)getVirtualFile().getUserData(TerminalPromptModel.Companion.getKEY());
/*    */   } @NotNull
/*    */   protected PsiFile createFile(@NotNull Language lang) {
/* 35 */     Intrinsics.checkNotNullParameter(lang, "lang"); return (PsiFile)new TerminalPromptPsiFile((IElementType)new TerminalPromptFileElementType(), (FileViewProvider)this);
/*    */   }
/*    */   @NotNull
/*    */   public SingleRootFileViewProvider createCopy(@NotNull VirtualFile copy) {
/* 39 */     Intrinsics.checkNotNullParameter(copy, "copy"); copy.putUserData(ShellType.Companion.getKEY(), getShellType());
/* 40 */     copy.putUserData(TerminalPromptModel.Companion.getKEY(), getPromptModel());
/* 41 */     Intrinsics.checkNotNullExpressionValue(getManager(), "getManager(...)"); return new TerminalPromptFileViewProvider((PsiManager)getManager(), copy, false);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\004\030\0002\0020\001B\007¢\006\004\b\002\020\003J\030\020\004\032\0020\0052\006\020\006\032\0020\0052\006\020\007\032\0020\bH\024¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/lang/TerminalPromptFileViewProvider$TerminalPromptFileElementType;", "Lcom/intellij/psi/tree/IFileElementType;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/lang/TerminalPromptFileViewProvider;)V", "doParseContents", "Lcom/intellij/lang/ASTNode;", "chameleon", "psi", "Lcom/intellij/psi/PsiElement;", "ej-core"})
/*    */   private final class TerminalPromptFileElementType
/*    */     extends IFileElementType
/*    */   {
/*    */     public TerminalPromptFileElementType() {
/* 54 */       super("TERMINAL_PROMPT_FILE", TerminalPromptLanguage.INSTANCE, false); } @NotNull
/*    */     protected ASTNode doParseContents(@NotNull ASTNode chameleon, @NotNull PsiElement psi) {
/* 56 */       Intrinsics.checkNotNullParameter(chameleon, "chameleon"); Intrinsics.checkNotNullParameter(psi, "psi"); int inputOffset = Math.min(TerminalPromptFileViewProvider.this.getPromptModel().getCommandStartOffset(), chameleon.getChars().length());
/* 57 */       if (TerminalShellSupport.Companion.findByShellType(TerminalPromptFileViewProvider.this.getShellType()) == null || TerminalShellSupport.Companion.findByShellType(TerminalPromptFileViewProvider.this.getShellType()).getPromptContentElementType() == null) TerminalShellSupport.Companion.findByShellType(TerminalPromptFileViewProvider.this.getShellType()).getPromptContentElementType();  IElementType inputElementType = 
/* 58 */         PlainTextTokenTypes.PLAIN_TEXT_FILE;
/* 59 */       LazyParseablePsiElement promptNode = new LazyParseablePsiElement(PlainTextTokenTypes.PLAIN_TEXT_FILE, chameleon.getChars().subSequence(0, inputOffset));
/* 60 */       LazyParseablePsiElement inputNode = new LazyParseablePsiElement(inputElementType, chameleon.getChars().subSequence(inputOffset, chameleon.getChars().length()));
/*    */       
/* 62 */       CompositeElement root = new CompositeElement(TerminalPromptFileViewProvider.CONTENT_ELEMENT_TYPE);
/* 63 */       root.setPsi((PsiElement)new TerminalPromptFileViewProvider.TerminalPromptContentElement((ASTNode)root));
/* 64 */       root.rawAddChildrenWithoutNotifications((TreeElement)promptNode);
/* 65 */       root.rawAddChildrenWithoutNotifications((TreeElement)inputNode);
/* 66 */       return (ASTNode)root;
/*    */     } }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\000\b\002\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\b\020\006\032\0020\007H\026¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/lang/TerminalPromptFileViewProvider$TerminalPromptContentElement;", "Lcom/intellij/extapi/psi/ASTWrapperPsiElement;", "node", "Lcom/intellij/lang/ASTNode;", "<init>", "(Lcom/intellij/lang/ASTNode;)V", "toString", "", "ej-core"})
/* 70 */   private static final class TerminalPromptContentElement extends ASTWrapperPsiElement { public TerminalPromptContentElement(@NotNull ASTNode node) { super(node); } @NotNull
/*    */     public String toString() {
/* 72 */       Intrinsics.checkNotNullExpressionValue(getClass().getSimpleName(), "getSimpleName(...)"); return getClass().getSimpleName();
/*    */     } }
/*    */ 
/*    */   
/*    */   @NotNull
/* 77 */   public static final Companion Companion = new Companion(null); @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/lang/TerminalPromptFileViewProvider$Companion;", "", "<init>", "()V", "CONTENT_ELEMENT_TYPE", "Lcom/intellij/psi/tree/IElementType;", "ej-core"}) public static final class Companion { private Companion() {} } @NotNull private static final IElementType CONTENT_ELEMENT_TYPE = new IElementType("TERMINAL_PROMPT_CONTENT", TerminalPromptLanguage.INSTANCE);
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\lang\TerminalPromptFileViewProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */