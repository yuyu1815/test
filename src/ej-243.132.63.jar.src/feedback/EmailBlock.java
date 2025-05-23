/*    */ package feedback;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\002\b\003\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\b\007\030\0002\0020\001B\037\022\b\020\002\032\004\030\0010\003\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\004\b\007\020\bJ\020\020\016\032\0020\0062\006\020\017\032\0020\020H\026J\016\020\021\032\0020\0062\006\020\022\032\0020\nJ\006\020\023\032\0020\nR\020\020\002\032\004\030\0010\003X\004¢\006\002\n\000R\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000R\016\020\t\032\0020\nX\016¢\006\002\n\000R\016\020\013\032\0020\nX\016¢\006\002\n\000R\020\020\f\032\004\030\0010\rX\016¢\006\002\n\000¨\006\024"}, d2 = {"Lfeedback/EmailBlock;", "Lfeedback/FeedbackBlock;", "myProject", "Lcom/intellij/openapi/project/Project;", "showFeedbackSystemInfoDialog", "Lkotlin/Function0;", "", "<init>", "(Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;)V", "myCheckBoxLabel", "", "myProperty", "myCheckBoxEmail", "Lcom/intellij/ui/components/JBCheckBox;", "addToPanel", "panel", "Lcom/intellij/ui/dsl/builder/Panel;", "setEmailCheckBoxLabel", "newCheckBoxLabel", "getEmailAddressIfSpecified", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class EmailBlock implements FeedbackBlock {
/*    */   @Nullable
/*    */   private final Project myProject;
/*    */   @NotNull
/*    */   private final Function0<Unit> showFeedbackSystemInfoDialog;
/*    */   @NotNull
/*    */   private String myCheckBoxLabel;
/*    */   @NotNull
/*    */   private String myProperty;
/*    */   @Nullable
/*    */   private JBCheckBox myCheckBoxEmail;
/*    */   public static final int $stable = 8;
/*    */   
/* 18 */   public EmailBlock(@Nullable Project myProject, @NotNull Function0<Unit> showFeedbackSystemInfoDialog) { this.myProject = myProject;
/* 19 */     this.showFeedbackSystemInfoDialog = showFeedbackSystemInfoDialog;
/* 20 */     this.myCheckBoxLabel = "I allow JetBrains to contact me regarding my feedback by email";
/* 21 */     LicensingFacade.getInstance(); if (((LicensingFacade.getInstance() != null) ? LicensingFacade.getInstance().getLicenseeEmail() : null) == null) (LicensingFacade.getInstance() != null) ? LicensingFacade.getInstance().getLicenseeEmail() : null;  ((EmailBlock)((LicensingFacade.getInstance() != null) ? LicensingFacade.getInstance().getLicenseeEmail() : null)).myProperty = ""; } private static final Unit addToPanel$lambda$11$lambda$1(EmailBlock this$0, Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.checkBox(this$0.myCheckBoxLabel).applyToComponent(this$0::addToPanel$lambda$11$lambda$1$lambda$0); return Unit.INSTANCE; } private static final Unit addToPanel$lambda$11$lambda$1$lambda$0(EmailBlock this$0, JBCheckBox $this$applyToComponent) { Intrinsics.checkNotNullParameter($this$applyToComponent, "$this$applyToComponent"); this$0.myCheckBoxEmail = $this$applyToComponent; return Unit.INSTANCE; }
/*    */   private static final Unit addToPanel$lambda$11$lambda$8(EmailBlock this$0, Panel $this$indent) { Intrinsics.checkNotNullParameter($this$indent, "$this$indent"); Panel.row$default($this$indent, null, this$0::addToPanel$lambda$11$lambda$8$lambda$7, 1, null).bottomGap(BottomGap.MEDIUM); return Unit.INSTANCE; }
/*    */   private static final Unit addToPanel$lambda$11$lambda$8$lambda$7(EmailBlock this$0, Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); TextFieldKt.columns(TextFieldKt.bindText($this$row.textField(), (KMutableProperty0)new EmailBlock$addToPanel$1$2$1$1(this$0)), 25).applyToComponent(this$0::addToPanel$lambda$11$lambda$8$lambda$7$lambda$4).errorOnApply("Enter your email", this$0::addToPanel$lambda$11$lambda$8$lambda$7$lambda$5).errorOnApply("Invalid email address", this$0::addToPanel$lambda$11$lambda$8$lambda$7$lambda$6); return Unit.INSTANCE; }
/*    */   private static final Unit addToPanel$lambda$11$lambda$8$lambda$7$lambda$4(EmailBlock this$0, JBTextField $this$applyToComponent) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc '$this$applyToComponent'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: invokevirtual getEmptyText : ()Lcom/intellij/util/ui/StatusText;
/*    */     //   10: ldc 'Email'
/*    */     //   12: invokevirtual setText : (Ljava/lang/String;)Lcom/intellij/util/ui/StatusText;
/*    */     //   15: pop
/*    */     //   16: aload_1
/*    */     //   17: aload_0
/*    */     //   18: getfield myCheckBoxEmail : Lcom/intellij/ui/components/JBCheckBox;
/*    */     //   21: dup
/*    */     //   22: ifnull -> 31
/*    */     //   25: invokevirtual isSelected : ()Z
/*    */     //   28: goto -> 33
/*    */     //   31: pop
/*    */     //   32: iconst_0
/*    */     //   33: invokevirtual setEnabled : (Z)V
/*    */     //   36: aload_0
/*    */     //   37: getfield myCheckBoxEmail : Lcom/intellij/ui/components/JBCheckBox;
/*    */     //   40: dup
/*    */     //   41: ifnull -> 57
/*    */     //   44: aload_1
/*    */     //   45: aload_0
/*    */     //   46: <illegal opcode> actionPerformed : (Lcom/intellij/ui/components/JBTextField;Lfeedback/EmailBlock;)Ljava/awt/event/ActionListener;
/*    */     //   51: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
/*    */     //   54: goto -> 58
/*    */     //   57: pop
/*    */     //   58: aload_1
/*    */     //   59: ldc 'StatusVisibleFunction'
/*    */     //   61: <illegal opcode> test : ()Ljava/util/function/Predicate;
/*    */     //   66: invokevirtual putClientProperty : (Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   69: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   72: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #36	-> 6
/*    */     //   #37	-> 16
/*    */     //   #39	-> 36
/*    */     //   #42	-> 58
/*    */     //   #43	-> 59
/*    */     //   #44	-> 61
/*    */     //   #42	-> 66
/*    */     //   #45	-> 69
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	73	0	this$0	Lfeedback/EmailBlock;
/*    */     //   0	73	1	$this$applyToComponent	Lcom/intellij/ui/components/JBTextField; }
/* 25 */   public void addToPanel(@NotNull Panel panel) { Intrinsics.checkNotNullParameter(panel, "panel"); Panel panel1 = panel, $this$addToPanel_u24lambda_u2411 = panel1; int $i$a$-apply-EmailBlock$addToPanel$1 = 0;
/* 26 */     Panel.row$default($this$addToPanel_u24lambda_u2411, null, this::addToPanel$lambda$11$lambda$1, 1, null);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 33 */     $this$addToPanel_u24lambda_u2411.indent(this::addToPanel$lambda$11$lambda$8);
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
/* 53 */     Panel.row$default($this$addToPanel_u24lambda_u2411, null, this::addToPanel$lambda$11$lambda$10, 1, null)
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 60 */       .bottomGap(BottomGap.SMALL); } private static final void addToPanel$lambda$11$lambda$8$lambda$7$lambda$4$lambda$2(JBTextField $this_applyToComponent, EmailBlock this$0, ActionEvent paramActionEvent) { $this_applyToComponent.setEnabled((this$0.myCheckBoxEmail != null) ? this$0.myCheckBoxEmail.isSelected() : false); } private static final boolean addToPanel$lambda$11$lambda$8$lambda$7$lambda$4$lambda$3(JBTextField textField) { Intrinsics.checkNotNullExpressionValue(textField.getText(), "getText(...)"); return (((CharSequence)textField.getText()).length() == 0); } private static final Unit addToPanel$lambda$11$lambda$10(EmailBlock this$0, Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); EmailBlockKt.feedbackAgreement($this$row, this$0.myProject, "By submitting this form, I agree to share <a href='systemInfo'>system information</a>. I agree that my name and email \n  address may be used by JetBrains to contact me regarding my feedback. I agree that JetBrains \n  s.r.o. may process said data using <a href='https://www.jetbrains.com/legal/docs/privacy/third-parties.html'>third-party services</a> for this purpose in accordance with the \n  <a href='https://www.jetbrains.com/legal/docs/privacy/privacy.html'>JetBrains Privacy Policy</a> and <a href='https://plugins.jetbrains.com/legal/terms-of-use'>Marketplace Agreement</a>.", this$0::addToPanel$lambda$11$lambda$10$lambda$9); return Unit.INSTANCE; }
/*    */   private static final boolean addToPanel$lambda$11$lambda$8$lambda$7$lambda$5(EmailBlock this$0, JBTextField it) { Intrinsics.checkNotNullParameter(it, "it"); Intrinsics.checkNotNullExpressionValue(it.getText(), "getText(...)"); return (((this$0.myCheckBoxEmail != null) ? this$0.myCheckBoxEmail.isSelected() : false) && StringsKt.isBlank(it.getText())); }
/*    */   private static final boolean addToPanel$lambda$11$lambda$8$lambda$7$lambda$6(EmailBlock this$0, JBTextField it) { Intrinsics.checkNotNullParameter(it, "it"); Intrinsics.checkNotNullExpressionValue(it.getText(), "getText(...)"); if (((this$0.myCheckBoxEmail != null) ? this$0.myCheckBoxEmail.isSelected() : false) && (!StringsKt.isBlank(it.getText()))) {
/*    */       Intrinsics.checkNotNullExpressionValue(it.getText(), "getText(...)"); CharSequence charSequence = it.getText(); if (!EmailBlockKt.getEMAIL_REGEX().matches(charSequence));
/*    */     }  return false; }
/* 65 */   private static final Unit addToPanel$lambda$11$lambda$10$lambda$9(EmailBlock this$0) { this$0.showFeedbackSystemInfoDialog.invoke(); return Unit.INSTANCE; } public final void setEmailCheckBoxLabel(@NotNull String newCheckBoxLabel) { Intrinsics.checkNotNullParameter(newCheckBoxLabel, "newCheckBoxLabel"); this.myCheckBoxLabel = newCheckBoxLabel; }
/*    */   
/*    */   @NotNull
/*    */   public final String getEmailAddressIfSpecified() {
/* 69 */     if ((this.myCheckBoxEmail != null) ? ((this.myCheckBoxEmail.isSelected() == true)) : false) {
/* 70 */       return this.myProperty;
/*    */     }
/* 72 */     return "";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\feedback\EmailBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */