/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.activation;
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\002\n\002\b\002\n\002\030\002\n\000\b\007\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\b\020\016\032\0020\017H\024J\020\020\020\032\0020\0172\006\020\021\032\0020\022H\024R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\f\020\r¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieLLMProxy;", "Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;", "llmCache", "Lcom/intellij/ml/llm/matterhorn/core/llm/AICache;", "authService", "Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieAuthService;", "project", "Lcom/intellij/openapi/project/Project;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/core/llm/AICache;Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieAuthService;Lcom/intellij/openapi/project/Project;)V", "getAuthService", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieAuthService;", "getProject", "()Lcom/intellij/openapi/project/Project;", "updateQuota", "", "reportQuota", "updated", "Lai/grazie/quota/Quota;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class JunieGrazieLLMProxy extends GrazieLLMProxy { @NotNull
/*    */   private final JunieGrazieAuthService authService;
/*    */   
/*    */   @NotNull
/*  8 */   public final JunieGrazieAuthService getAuthService() { return this.authService; } @NotNull private final Project project; public static final int $stable = 8; @NotNull public final Project getProject() { return this.project; }
/*  9 */   public JunieGrazieLLMProxy(@NotNull AICache llmCache, @NotNull JunieGrazieAuthService authService, @NotNull Project project) { super(llmCache, authService, null, null, null, null, 60, null);
/*    */     this.authService = authService;
/*    */     this.project = project; } protected void updateQuota() {
/* 12 */     ((JunieGrazieQuota)this.project.getService(JunieGrazieQuota.class)).updateQuotaAndRefill(this);
/*    */   }
/*    */   
/*    */   protected void reportQuota(@NotNull Quota updated) {
/* 16 */     Intrinsics.checkNotNullParameter(updated, "updated"); ((JunieGrazieQuota)this.project.getService(JunieGrazieQuota.class)).reportQuota(updated, this);
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\activation\JunieGrazieLLMProxy.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */