/*    */ package com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors;
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\004\bf\030\000 \0212\0020\001:\003\017\020\021J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H&J\026\020\007\032\b\022\004\022\0020\0060\0032\006\020\005\032\0020\006H&J\022\020\b\032\004\030\0010\t2\006\020\005\032\0020\006H&J\030\020\n\032\0020\0132\006\020\f\032\0020\0042\006\020\r\032\0020\016H&¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider;", "", "extractElements", "", "Lcom/intellij/psi/PsiElement;", "file", "Lcom/intellij/psi/PsiFile;", "getImports", "getImportStatements", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ImportStatementInfo;", "getDeclarationString", "", "element", "params", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;", "ImportStatementInfo", "ShowMethodsParametersType", "Companion", "ej-core"})
/*    */ public interface ElementProvider { @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE; @NotNull
/*    */   List<PsiElement> extractElements(@NotNull PsiFile paramPsiFile); @NotNull
/*    */   List<PsiFile> getImports(@NotNull PsiFile paramPsiFile); @Nullable
/*    */   ImportStatementInfo getImportStatements(@NotNull PsiFile paramPsiFile);
/*    */   @NotNull
/*    */   String getDeclarationString(@NotNull PsiElement paramPsiElement, @NotNull ShowMethodsParametersType paramShowMethodsParametersType);
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\002\020\b\n\002\b\n\n\002\020\013\n\002\b\004\b\b\030\0002\0020\001B#\022\006\020\002\032\0020\003\022\022\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0060\005¢\006\004\b\007\020\bJ\t\020\r\032\0020\003HÆ\003J\025\020\016\032\016\022\004\022\0020\006\022\004\022\0020\0060\005HÆ\003J)\020\017\032\0020\0002\b\b\002\020\002\032\0020\0032\024\b\002\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0060\005HÆ\001J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\001HÖ\003J\t\020\023\032\0020\006HÖ\001J\t\020\024\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\035\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ImportStatementInfo;", "", "text", "", "range", "Lkotlin/Pair;", "", "<init>", "(Ljava/lang/String;Lkotlin/Pair;)V", "getText", "()Ljava/lang/String;", "getRange", "()Lkotlin/Pair;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "ej-core"})
/*    */   public static final class ImportStatementInfo { @NotNull
/*    */     private final String text;
/* 13 */     public ImportStatementInfo(@NotNull String text, @NotNull Pair<Integer, Integer> range) { this.text = text;
/* 14 */       this.range = range; } @NotNull private final Pair<Integer, Integer> range; @NotNull public final String getText() { return this.text; } @NotNull public final Pair<Integer, Integer> getRange() { return this.range; }
/*    */     
/*    */     @NotNull
/*    */     public final String component1() {
/*    */       return this.text;
/*    */     }
/*    */     @NotNull
/*    */     public final Pair<Integer, Integer> component2() {
/*    */       return this.range;
/*    */     }
/*    */     @NotNull
/*    */     public final ImportStatementInfo copy(@NotNull String text, @NotNull Pair<Integer, Integer> range) {
/*    */       Intrinsics.checkNotNullParameter(text, "text");
/*    */       Intrinsics.checkNotNullParameter(range, "range");
/*    */       return new ImportStatementInfo(text, range);
/*    */     }
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "ImportStatementInfo(text=" + this.text + ", range=" + this.range + ")";
/*    */     }
/*    */     public int hashCode() {
/*    */       result = this.text.hashCode();
/*    */       return result * 31 + this.range.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof ImportStatementInfo))
/*    */         return false; 
/*    */       ImportStatementInfo importStatementInfo = (ImportStatementInfo)other;
/*    */       return !Intrinsics.areEqual(this.text, importStatementInfo.text) ? false : (!!Intrinsics.areEqual(this.range, importStatementInfo.range));
/*    */     } }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\006\b\002\030\0002\b\022\004\022\0020\0000\001B\t\b\002¢\006\004\b\002\020\003j\002\b\004j\002\b\005j\002\b\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;", "", "<init>", "(Ljava/lang/String;I)V", "FULL", "NAME_ONLY", "NONE", "ej-core"})
/* 49 */   public enum ShowMethodsParametersType { FULL,
/* 50 */     NAME_ONLY,
/* 51 */     NONE; @NotNull
/* 52 */     public static EnumEntries<ShowMethodsParametersType> getEntries() { return $ENTRIES; }
/*    */      }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\030\020\007\032\b\022\004\022\0020\t0\b2\b\020\n\032\004\030\0010\013H\007J\030\020\f\032\b\022\004\022\0020\0130\b2\b\020\n\032\004\030\0010\013H\007J\022\020\r\032\004\030\0010\0162\006\020\n\032\0020\013H\007J&\020\017\032\004\030\0010\0202\006\020\n\032\0020\0132\006\020\021\032\0020\0222\n\b\002\020\023\032\004\030\0010\024H\007J \020\025\032\0020\0202\006\020\n\032\0020\0132\006\020\026\032\0020\t2\006\020\027\032\0020\030H\007R\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$Companion;", "", "<init>", "()V", "EXTENSION", "Lcom/intellij/openapi/fileTypes/FileTypeExtension;", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider;", "extractElements", "", "Lcom/intellij/psi/PsiElement;", "file", "Lcom/intellij/psi/PsiFile;", "getImports", "getImportStatements", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ImportStatementInfo;", "getImportStatementsText", "", "filePath", "Ljava/nio/file/Path;", "agentSessionHistory", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;", "getDeclarationString", "element", "params", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;", "ej-core"})
/*    */   public static final class Companion
/*    */   {
/*    */     @NotNull
/* 64 */     private static final FileTypeExtension<ElementProvider> EXTENSION = new FileTypeExtension("com.intellij.ml.llm.matterhorn.relevance.extractors.ejElementProvider");
/*    */     @RequiresReadLock
/*    */     @NotNull
/*    */     public final List<PsiElement> extractElements(@Nullable PsiFile file) {
/* 68 */       ThreadingAssertions.assertReadAccess();
/* 69 */       if (file == null) return CollectionsKt.emptyList(); 
/* 70 */       if ((ElementProvider)EXTENSION.forFileType(file.getFileType()) == null || ((ElementProvider)EXTENSION.forFileType(file.getFileType())).extractElements(file) == null) ((ElementProvider)EXTENSION.forFileType(file.getFileType())).extractElements(file);  return CollectionsKt.emptyList();
/*    */     }
/*    */     @RequiresReadLock
/*    */     @NotNull
/*    */     public final List<PsiFile> getImports(@Nullable PsiFile file) {
/* 75 */       ThreadingAssertions.assertReadAccess();
/* 76 */       if (file == null) return CollectionsKt.emptyList(); 
/* 77 */       if ((ElementProvider)EXTENSION.forFileType(file.getFileType()) == null || ((ElementProvider)EXTENSION.forFileType(file.getFileType())).getImports(file) == null) ((ElementProvider)EXTENSION.forFileType(file.getFileType())).getImports(file);  return CollectionsKt.emptyList();
/*    */     }
/*    */     @RequiresReadLock
/*    */     @Nullable
/*    */     public final ElementProvider.ImportStatementInfo getImportStatements(@NotNull PsiFile file) {
/* 82 */       Intrinsics.checkNotNullParameter(file, "file"); ThreadingAssertions.assertReadAccess();
/* 83 */       (ElementProvider)EXTENSION.forFileType(file.getFileType()); return ((ElementProvider)EXTENSION.forFileType(file.getFileType()) != null) ? ((ElementProvider)EXTENSION.forFileType(file.getFileType())).getImportStatements(file) : null;
/*    */     }
/*    */     @RequiresReadLock
/*    */     @Nullable
/*    */     public final String getImportStatementsText(@NotNull PsiFile file, @NotNull Path filePath, @Nullable AgentSessionHistory agentSessionHistory) {
/* 88 */       Intrinsics.checkNotNullParameter(file, "file"); Intrinsics.checkNotNullParameter(filePath, "filePath"); ElementProvider.ImportStatementInfo importInfo = getImportStatements(file);
/* 89 */       if (importInfo != null && agentSessionHistory != null) {
/* 90 */         agentSessionHistory.addShownCodeRange(filePath, ((Number)importInfo.getRange().getFirst()).intValue(), ((Number)importInfo.getRange().getSecond()).intValue());
/*    */       }
/* 92 */       return (importInfo != null) ? importInfo.getText() : null;
/*    */     }
/*    */     @RequiresReadLock
/*    */     @NotNull
/*    */     public final String getDeclarationString(@NotNull PsiFile file, @NotNull PsiElement element, @NotNull ElementProvider.ShowMethodsParametersType params) {
/* 97 */       Intrinsics.checkNotNullParameter(file, "file"); Intrinsics.checkNotNullParameter(element, "element"); Intrinsics.checkNotNullParameter(params, "params"); ThreadingAssertions.assertReadAccess();
/* 98 */       if ((ElementProvider)EXTENSION.forFileType(file.getFileType()) == null || ((ElementProvider)EXTENSION.forFileType(file.getFileType())).getDeclarationString(element, params) == null) ((ElementProvider)EXTENSION.forFileType(file.getFileType())).getDeclarationString(element, params);  return "";
/*    */     }
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\extractors\ElementProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */