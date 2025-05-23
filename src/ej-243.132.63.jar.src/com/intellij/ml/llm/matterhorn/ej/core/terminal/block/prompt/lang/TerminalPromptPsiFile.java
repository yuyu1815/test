/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.lang;
/*    */ import com.intellij.openapi.fileTypes.FileType;
/*    */ import com.intellij.psi.FileViewProvider;
/*    */ import com.intellij.psi.PsiElementVisitor;
/*    */ import com.intellij.psi.tree.IElementType;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\020\020\b\032\0020\t2\006\020\n\032\0020\013H\026J\b\020\f\032\0020\rH\026¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/lang/TerminalPromptPsiFile;", "Lcom/intellij/psi/impl/source/PsiFileImpl;", "elementType", "Lcom/intellij/psi/tree/IElementType;", "viewProvider", "Lcom/intellij/psi/FileViewProvider;", "<init>", "(Lcom/intellij/psi/tree/IElementType;Lcom/intellij/psi/FileViewProvider;)V", "accept", "", "visitor", "Lcom/intellij/psi/PsiElementVisitor;", "getFileType", "Lcom/intellij/openapi/fileTypes/FileType;", "ej-core"})
/*    */ public final class TerminalPromptPsiFile extends PsiFileImpl {
/*    */   public TerminalPromptPsiFile(@NotNull IElementType elementType, @NotNull FileViewProvider viewProvider) {
/* 13 */     super(elementType, elementType, viewProvider);
/*    */   } public void accept(@NotNull PsiElementVisitor visitor) {
/* 15 */     Intrinsics.checkNotNullParameter(visitor, "visitor"); visitor.visitFile((PsiFile)this);
/*    */   } @NotNull
/*    */   public FileType getFileType() {
/* 18 */     return (FileType)TerminalPromptFileType.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\lang\TerminalPromptPsiFile.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */