/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.lang;
/*    */ 
/*    */ import com.intellij.lang.Language;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import com.intellij.psi.FileViewProvider;
/*    */ import com.intellij.psi.FileViewProviderFactory;
/*    */ import com.intellij.psi.PsiManager;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\b\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J*\020\004\032\0020\0052\006\020\006\032\0020\0072\b\020\b\032\004\030\0010\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH\026¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/lang/TerminalPromptFileViewProviderFactory;", "Lcom/intellij/psi/FileViewProviderFactory;", "<init>", "()V", "createFileViewProvider", "Lcom/intellij/psi/FileViewProvider;", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "language", "Lcom/intellij/lang/Language;", "manager", "Lcom/intellij/psi/PsiManager;", "eventSystemEnabled", "", "ej-core"})
/*    */ public final class TerminalPromptFileViewProviderFactory
/*    */   implements FileViewProviderFactory
/*    */ {
/*    */   @NotNull
/*    */   public FileViewProvider createFileViewProvider(@NotNull VirtualFile file, @Nullable Language language, @NotNull PsiManager manager, boolean eventSystemEnabled) {
/* 20 */     Intrinsics.checkNotNullParameter(file, "file"); Intrinsics.checkNotNullParameter(manager, "manager"); return (FileViewProvider)new TerminalPromptFileViewProvider(manager, file, eventSystemEnabled);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\lang\TerminalPromptFileViewProviderFactory.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */