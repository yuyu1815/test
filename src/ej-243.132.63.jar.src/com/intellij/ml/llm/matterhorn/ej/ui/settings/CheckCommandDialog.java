/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.settings;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.MatterhornBundle;
/*    */ import com.intellij.ui.dsl.builder.Panel;
/*    */ import com.intellij.ui.dsl.builder.Row;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\021\n\002\030\002\n\002\b\002\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003J\n\020\b\032\004\030\0010\tH\024J\b\020\n\032\0020\013H\024J\023\020\f\032\b\022\004\022\0020\0160\rH\024¢\006\002\020\017R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/CheckCommandDialog;", "Lcom/intellij/openapi/ui/DialogWrapper;", "<init>", "()V", "resultLabel", "Lcom/intellij/ui/components/JBLabel;", "commandCheckArea", "Lcom/intellij/ui/components/JBTextField;", "createCenterPanel", "Ljavax/swing/JComponent;", "doOKAction", "", "createActions", "", "Ljavax/swing/Action;", "()[Ljavax/swing/Action;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class CheckCommandDialog extends DialogWrapper {
/*    */   @NotNull
/*    */   private final JBLabel resultLabel;
/*    */   @NotNull
/*    */   private final JBTextField commandCheckArea;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   public CheckCommandDialog() {
/* 18 */     super(false);
/* 19 */     this.resultLabel = new JBLabel();
/* 20 */     this.commandCheckArea = new JBTextField(36);
/*    */     
/* 22 */     setTitle(MatterhornBundle.message("junie.configurable.whitelist.check.command", new Object[0]));
/* 23 */     setOKButtonText(MatterhornBundle.message("junie.configurable.whitelist.check.process", new Object[0]));
/* 24 */     init();
/*    */   }
/*    */   
/*    */   @Nullable
/* 28 */   protected JComponent createCenterPanel() { return (JComponent)BuilderKt.panel(this::createCenterPanel$lambda$4); }
/* 29 */   private static final Unit createCenterPanel$lambda$4(CheckCommandDialog this$0, Panel $this$panel) { Intrinsics.checkNotNullParameter($this$panel, "$this$panel"); Panel.row$default($this$panel, null, CheckCommandDialog::createCenterPanel$lambda$4$lambda$0, 1, null);
/*    */ 
/*    */     
/* 32 */     Panel.row$default($this$panel, null, this$0::createCenterPanel$lambda$4$lambda$2, 1, null);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 41 */     Panel.row$default($this$panel, null, this$0::createCenterPanel$lambda$4$lambda$3, 1, null);
/*    */ 
/*    */     
/* 44 */     return Unit.INSTANCE; }
/*    */   private static final Unit createCenterPanel$lambda$4$lambda$0(Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.label(MatterhornBundle.message("junie.configurable.whitelist.check.command.annotation", new Object[0])); return Unit.INSTANCE; }
/*    */   private static final Unit createCenterPanel$lambda$4$lambda$2(CheckCommandDialog this$0, Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); DialogValidation.WithParameter[] arrayOfWithParameter = new DialogValidation.WithParameter[1]; arrayOfWithParameter[0] = ValidationsKt.getCHECK_NON_EMPTY();
/*    */     TextFieldKt.trimmedTextValidation($this$row.cell((JComponent)this$0.commandCheckArea), arrayOfWithParameter).onChanged(this$0::createCenterPanel$lambda$4$lambda$2$lambda$1).getComponent();
/* 48 */     return Unit.INSTANCE; } protected void doOKAction() { String text = this.commandCheckArea.getText();
/* 49 */     Intrinsics.checkNotNull(text); boolean result = (AgentAction.Companion.isReadonlyBashCommand(text) || HumanInLoopImpl.Companion.checkActionWhitelist(text, ActionType.Terminal));
/*    */     
/* 51 */     if (result == true) {
/*    */       
/* 53 */       this.resultLabel.setIcon(AllIcons.General.InspectionsOK);
/* 54 */       this.resultLabel.setText(MatterhornBundle.message("junie.configurable.whitelist.check.without.confirmation", new Object[0]));
/*    */     } else {
/*    */       
/* 57 */       this.resultLabel.setIcon(AllIcons.General.BalloonError);
/* 58 */       this.resultLabel.setText(MatterhornBundle.message("junie.configurable.whitelist.check.with.confirmation", new Object[0]));
/*    */     }  }
/*    */   private static final Unit createCenterPanel$lambda$4$lambda$2$lambda$1(CheckCommandDialog this$0, JBTextField it) { Intrinsics.checkNotNullParameter(it, "it"); this$0.resultLabel.setIcon(null); this$0.resultLabel.setText("");
/*    */     return Unit.INSTANCE; }
/*    */   private static final Unit createCenterPanel$lambda$4$lambda$3(CheckCommandDialog this$0, Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*    */     $this$row.cell((JComponent)this$0.resultLabel).getComponent();
/* 64 */     return Unit.INSTANCE; } @NotNull protected Action[] createActions() { Action[] arrayOfAction = new Action[2]; arrayOfAction[0] = getOKAction(); arrayOfAction[1] = getCancelAction(); return arrayOfAction; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\settings\CheckCommandDialog.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */