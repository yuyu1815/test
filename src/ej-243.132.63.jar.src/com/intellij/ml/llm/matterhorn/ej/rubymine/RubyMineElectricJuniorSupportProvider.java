/*    */ package com.intellij.ml.llm.matterhorn.ej.rubymine;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.SupportWithReason;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\022\020\004\032\004\030\0010\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/rubymine/RubyMineElectricJuniorSupportProvider;", "Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupportProvider;", "<init>", "()V", "getSupport", "Lcom/intellij/ml/llm/matterhorn/ej/core/SupportWithReason;", "project", "Lcom/intellij/openapi/project/Project;", "ej-rubymine"})
/*    */ public final class RubyMineElectricJuniorSupportProvider implements ElectricJuniorSupportProvider {
/*    */   @Nullable
/*    */   public SupportWithReason getSupport(@NotNull Project project) {
/* 10 */     Intrinsics.checkNotNullParameter(project, "project"); if (PlatformUtils.isRubyMine()) {
/* 11 */       return new SupportWithReason(new RubyMineElectricJuniorSupport(), "RubyMine IDE");
/*    */     }
/* 13 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\rubymine\RubyMineElectricJuniorSupportProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */