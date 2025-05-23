/*    */ package com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentSessionHistory;
/*    */ import com.intellij.openapi.fileTypes.FileTypeExtension;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import com.intellij.util.concurrency.ThreadingAssertions;
/*    */ import com.intellij.util.concurrency.annotations.RequiresReadLock;
/*    */ import java.nio.file.Path;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\030\020\007\032\b\022\004\022\0020\t0\b2\b\020\n\032\004\030\0010\013H\007J\030\020\f\032\b\022\004\022\0020\0130\b2\b\020\n\032\004\030\0010\013H\007J\022\020\r\032\004\030\0010\0162\006\020\n\032\0020\013H\007J&\020\017\032\004\030\0010\0202\006\020\n\032\0020\0132\006\020\021\032\0020\0222\n\b\002\020\023\032\004\030\0010\024H\007J \020\025\032\0020\0202\006\020\n\032\0020\0132\006\020\026\032\0020\t2\006\020\027\032\0020\030H\007R\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$Companion;", "", "<init>", "()V", "EXTENSION", "Lcom/intellij/openapi/fileTypes/FileTypeExtension;", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider;", "extractElements", "", "Lcom/intellij/psi/PsiElement;", "file", "Lcom/intellij/psi/PsiFile;", "getImports", "getImportStatements", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ImportStatementInfo;", "getImportStatementsText", "", "filePath", "Ljava/nio/file/Path;", "agentSessionHistory", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;", "getDeclarationString", "element", "params", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;", "ej-core"})
/*    */ public final class Companion
/*    */ {
/*    */   @NotNull
/* 64 */   private static final FileTypeExtension<ElementProvider> EXTENSION = new FileTypeExtension("com.intellij.ml.llm.matterhorn.relevance.extractors.ejElementProvider");
/*    */   @RequiresReadLock
/*    */   @NotNull
/*    */   public final List<PsiElement> extractElements(@Nullable PsiFile file) {
/* 68 */     ThreadingAssertions.assertReadAccess();
/* 69 */     if (file == null) return CollectionsKt.emptyList(); 
/* 70 */     if ((ElementProvider)EXTENSION.forFileType(file.getFileType()) == null || ((ElementProvider)EXTENSION.forFileType(file.getFileType())).extractElements(file) == null) ((ElementProvider)EXTENSION.forFileType(file.getFileType())).extractElements(file);  return CollectionsKt.emptyList();
/*    */   }
/*    */   @RequiresReadLock
/*    */   @NotNull
/*    */   public final List<PsiFile> getImports(@Nullable PsiFile file) {
/* 75 */     ThreadingAssertions.assertReadAccess();
/* 76 */     if (file == null) return CollectionsKt.emptyList(); 
/* 77 */     if ((ElementProvider)EXTENSION.forFileType(file.getFileType()) == null || ((ElementProvider)EXTENSION.forFileType(file.getFileType())).getImports(file) == null) ((ElementProvider)EXTENSION.forFileType(file.getFileType())).getImports(file);  return CollectionsKt.emptyList();
/*    */   }
/*    */   @RequiresReadLock
/*    */   @Nullable
/*    */   public final ElementProvider.ImportStatementInfo getImportStatements(@NotNull PsiFile file) {
/* 82 */     Intrinsics.checkNotNullParameter(file, "file"); ThreadingAssertions.assertReadAccess();
/* 83 */     (ElementProvider)EXTENSION.forFileType(file.getFileType()); return ((ElementProvider)EXTENSION.forFileType(file.getFileType()) != null) ? ((ElementProvider)EXTENSION.forFileType(file.getFileType())).getImportStatements(file) : null;
/*    */   }
/*    */   @RequiresReadLock
/*    */   @Nullable
/*    */   public final String getImportStatementsText(@NotNull PsiFile file, @NotNull Path filePath, @Nullable AgentSessionHistory agentSessionHistory) {
/* 88 */     Intrinsics.checkNotNullParameter(file, "file"); Intrinsics.checkNotNullParameter(filePath, "filePath"); ElementProvider.ImportStatementInfo importInfo = getImportStatements(file);
/* 89 */     if (importInfo != null && agentSessionHistory != null) {
/* 90 */       agentSessionHistory.addShownCodeRange(filePath, ((Number)importInfo.getRange().getFirst()).intValue(), ((Number)importInfo.getRange().getSecond()).intValue());
/*    */     }
/* 92 */     return (importInfo != null) ? importInfo.getText() : null;
/*    */   }
/*    */   @RequiresReadLock
/*    */   @NotNull
/*    */   public final String getDeclarationString(@NotNull PsiFile file, @NotNull PsiElement element, @NotNull ElementProvider.ShowMethodsParametersType params) {
/* 97 */     Intrinsics.checkNotNullParameter(file, "file"); Intrinsics.checkNotNullParameter(element, "element"); Intrinsics.checkNotNullParameter(params, "params"); ThreadingAssertions.assertReadAccess();
/* 98 */     if ((ElementProvider)EXTENSION.forFileType(file.getFileType()) == null || ((ElementProvider)EXTENSION.forFileType(file.getFileType())).getDeclarationString(element, params) == null) ((ElementProvider)EXTENSION.forFileType(file.getFileType())).getDeclarationString(element, params);  return "";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\extractors\ElementProvider$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */