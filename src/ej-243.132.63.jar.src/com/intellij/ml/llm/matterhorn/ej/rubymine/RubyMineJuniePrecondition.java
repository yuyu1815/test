/*   */ package com.intellij.ml.llm.matterhorn.ej.rubymine;
/*   */ import com.intellij.ml.llm.matterhorn.ej.core.JuniePreconditionChecker;
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ 
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\026\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\bH\026¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/rubymine/RubyMineJuniePrecondition;", "Lcom/intellij/ml/llm/matterhorn/ej/core/DefaultJuniePreconditionChecker;", "<init>", "()V", "canRunJunie", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem;", "project", "Lcom/intellij/openapi/project/Project;", "ej-rubymine"})
/*   */ public final class RubyMineJuniePrecondition extends DefaultJuniePreconditionChecker {
/*   */   @NotNull
/*   */   public List<JuniePreconditionChecker.JunieProblem> canRunJunie(@NotNull Project project) {
/* 9 */     Intrinsics.checkNotNullParameter(project, "project"); return CollectionsKt.listOf(new JuniePreconditionChecker.JunieProblem("Junie is not available on 2024.3", null, null, 6, null));
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\rubymine\RubyMineJuniePrecondition.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */