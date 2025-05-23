/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\030\002\n\000\bv\030\000 \0162\0020\001:\001\016J$\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\0062\006\020\007\032\0020\bH¦@¢\006\002\020\tR\024\020\n\032\0020\0138VX\004¢\006\006\032\004\b\f\020\r\001\002\017\020¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorChecker;", "", "findErrors", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Error;", "project", "Lcom/intellij/openapi/project/Project;", "file", "Lcom/intellij/psi/PsiFile;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nameForLogging", "", "getNameForLogging", "()Ljava/lang/String;", "Companion", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SemanticChecker;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SyntaxChecker;", "ej-core"})
/*    */ public interface ErrorChecker { @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   @Nullable
/*    */   Object findErrors(@NotNull Project paramProject, @NotNull PsiFile paramPsiFile, @NotNull Continuation<? super List<? extends Error>> paramContinuation);
/*    */   
/*    */   @NotNull
/*    */   String getNameForLogging();
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\007\032\b\022\004\022\0020\0060\bR\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorChecker$Companion;", "", "<init>", "()V", "EP_NAME", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorChecker;", "getErrorCheckers", "", "ej-core"})
/*    */   public static final class Companion { @NotNull
/* 13 */     private static final ExtensionPointName<ErrorChecker> EP_NAME = new ExtensionPointName("com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks.ejErrorChecker"); @NotNull
/*    */     public final List<ErrorChecker> getErrorCheckers() {
/* 15 */       return EP_NAME.getExtensionList();
/*    */     } }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls {
/*    */     @NotNull
/*    */     public static String getNameForLogging(@NotNull ErrorChecker $this) {
/* 22 */       Intrinsics.checkNotNullExpressionValue($this.getClass().getSimpleName(), "getSimpleName(...)"); return $this.getClass().getSimpleName();
/*    */     }
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\checks\ErrorChecker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */