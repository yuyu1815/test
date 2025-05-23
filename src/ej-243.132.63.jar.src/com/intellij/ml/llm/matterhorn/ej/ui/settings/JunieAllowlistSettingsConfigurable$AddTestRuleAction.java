/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.settings;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ActionType;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.MatterhornBundle;
/*     */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*     */ import com.intellij.openapi.project.DumbAwareAction;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\000\b\004\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\b\032\0020\t2\006\020\n\032\0020\013H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieAllowlistSettingsConfigurable$AddTestRuleAction;", "Lcom/intellij/openapi/project/DumbAwareAction;", "model", "Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/ActionWhitelistTableModel;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieAllowlistSettingsConfigurable;Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/ActionWhitelistTableModel;)V", "getModel", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/ActionWhitelistTableModel;", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "ej-ui"})
/*     */ final class AddTestRuleAction
/*     */   extends DumbAwareAction
/*     */ {
/*     */   @NotNull
/*     */   private final ActionWhitelistTableModel model;
/*     */   
/*     */   public AddTestRuleAction(ActionWhitelistTableModel model) {
/* 183 */     super(MatterhornBundle.message("junie.configurable.whitelist.add.runtest", new Object[0]));
/*     */     this.model = model; } public void actionPerformed(@NotNull AnActionEvent e) {
/* 185 */     Intrinsics.checkNotNullParameter(e, "e"); JunieAllowlistSettingsConfigurable.access$addRule(JunieAllowlistSettingsConfigurable.this, ActionType.RunTests);
/* 186 */     this.model.fireTableDataChanged();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ActionWhitelistTableModel getModel() {
/*     */     return this.model;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\settings\JunieAllowlistSettingsConfigurable$AddTestRuleAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */