/*    */ package feedback;
/*    */ 
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.ui.ex.MultiLineLabel;
/*    */ import com.intellij.ui.components.JBScrollPane;
/*    */ import com.intellij.ui.dsl.builder.Panel;
/*    */ import com.intellij.ui.dsl.builder.Row;
/*    */ import javax.swing.Action;
/*    */ import javax.swing.JComponent;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\"\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\0323\020\000\032\0020\0012\b\020\002\032\004\030\0010\0032\006\020\004\032\0020\0052\031\b\002\020\006\032\023\022\004\022\0020\b\022\004\022\0020\0010\007¢\006\002\b\t¨\006\n"}, d2 = {"showFeedbackSystemInfoDialog", "", "project", "Lcom/intellij/openapi/project/Project;", "systemInfoData", "Lfeedback/CommonFeedbackSystemData;", "addSpecificRows", "Lkotlin/Function1;", "Lcom/intellij/ui/dsl/builder/Panel;", "Lkotlin/ExtensionFunctionType;", "ej-ui"})
/*    */ public final class ShowFeedbackKt {
/* 17 */   private static final Unit showFeedbackSystemInfoDialog$lambda$0(Panel <this>) { Intrinsics.checkNotNullParameter(<this>, "<this>"); return Unit.INSTANCE; }
/*    */   public static final void showFeedbackSystemInfoDialog(@Nullable Project project, @NotNull CommonFeedbackSystemData systemInfoData, @NotNull Function1 addSpecificRows) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'systemInfoData'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 'addSpecificRows'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_2
/*    */     //   13: aload_1
/*    */     //   14: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Lfeedback/CommonFeedbackSystemData;)Lkotlin/jvm/functions/Function1;
/*    */     //   19: invokestatic panel : (Lkotlin/jvm/functions/Function1;)Lcom/intellij/openapi/ui/DialogPanel;
/*    */     //   22: astore #4
/*    */     //   24: aload #4
/*    */     //   26: astore #5
/*    */     //   28: iconst_0
/*    */     //   29: istore #6
/*    */     //   31: aload #5
/*    */     //   33: new com/intellij/util/ui/JBEmptyBorder
/*    */     //   36: dup
/*    */     //   37: bipush #10
/*    */     //   39: bipush #10
/*    */     //   41: bipush #10
/*    */     //   43: bipush #10
/*    */     //   45: invokespecial <init> : (IIII)V
/*    */     //   48: checkcast javax/swing/border/Border
/*    */     //   51: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
/*    */     //   54: nop
/*    */     //   55: aload #4
/*    */     //   57: astore_3
/*    */     //   58: new feedback/ShowFeedbackKt$showFeedbackSystemInfoDialog$dialog$1
/*    */     //   61: dup
/*    */     //   62: aload_0
/*    */     //   63: aload_3
/*    */     //   64: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/ui/DialogPanel;)V
/*    */     //   67: astore #4
/*    */     //   69: aload #4
/*    */     //   71: invokevirtual show : ()V
/*    */     //   74: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #23	-> 12
/*    */     //   #58	-> 24
/*    */     //   #59	-> 31
/*    */     //   #60	-> 54
/*    */     //   #58	-> 55
/*    */     //   #58	-> 57
/*    */     //   #23	-> 57
/*    */     //   #62	-> 58
/*    */     //   #76	-> 69
/*    */     //   #77	-> 74
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   31	24	6	$i$a$-also-ShowFeedbackKt$showFeedbackSystemInfoDialog$infoPanel$2	I
/*    */     //   28	27	5	it	Lcom/intellij/openapi/ui/DialogPanel;
/*    */     //   58	17	3	infoPanel	Lcom/intellij/openapi/ui/DialogPanel;
/*    */     //   69	6	4	dialog	Lfeedback/ShowFeedbackKt$showFeedbackSystemInfoDialog$dialog$1;
/*    */     //   0	75	0	project	Lcom/intellij/openapi/project/Project;
/*    */     //   0	75	1	systemInfoData	Lfeedback/CommonFeedbackSystemData;
/*    */     //   0	75	2	addSpecificRows	Lkotlin/jvm/functions/Function1; }
/*    */   private static final Unit showFeedbackSystemInfoDialog$lambda$12$lambda$1(CommonFeedbackSystemData $systemInfoData, Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.label($systemInfoData.getOsVersion()); return Unit.INSTANCE; }
/*    */   private static final Unit showFeedbackSystemInfoDialog$lambda$12$lambda$2(CommonFeedbackSystemData $systemInfoData, Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.label($systemInfoData.getMemorySizeForDialog()); return Unit.INSTANCE; }
/*    */   private static final Unit showFeedbackSystemInfoDialog$lambda$12$lambda$3(CommonFeedbackSystemData $systemInfoData, Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.label(String.valueOf($systemInfoData.getCoresNumber())); return Unit.INSTANCE; }
/*    */   private static final Unit showFeedbackSystemInfoDialog$lambda$12$lambda$4(CommonFeedbackSystemData $systemInfoData, Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.cell((JComponent)new MultiLineLabel($systemInfoData.getAppVersionWithBuild())); return Unit.INSTANCE; }
/*    */   private static final Unit showFeedbackSystemInfoDialog$lambda$12$lambda$5(CommonFeedbackSystemData $systemInfoData, Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.label($systemInfoData.getIsLicenseEvaluationForDialog()); return Unit.INSTANCE; }
/* 24 */   private static final Unit showFeedbackSystemInfoDialog$lambda$12$lambda$6(CommonFeedbackSystemData $systemInfoData, Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.cell((JComponent)new MultiLineLabel($systemInfoData.getLicenseRestrictionsForDialog())); return Unit.INSTANCE; } private static final Unit showFeedbackSystemInfoDialog$lambda$12(Function1 $addSpecificRows, CommonFeedbackSystemData $systemInfoData, Panel $this$panel) { Intrinsics.checkNotNullParameter($this$panel, "$this$panel"); $addSpecificRows.invoke($this$panel);
/* 25 */     $this$panel.row("OS version:", $systemInfoData::showFeedbackSystemInfoDialog$lambda$12$lambda$1);
/*    */ 
/*    */     
/* 28 */     $this$panel.row("Memory:", $systemInfoData::showFeedbackSystemInfoDialog$lambda$12$lambda$2);
/*    */ 
/*    */     
/* 31 */     $this$panel.row("Cores:", $systemInfoData::showFeedbackSystemInfoDialog$lambda$12$lambda$3);
/*    */ 
/*    */     
/* 34 */     $this$panel.row("App version:", $systemInfoData::showFeedbackSystemInfoDialog$lambda$12$lambda$4);
/*    */ 
/*    */     
/* 37 */     $this$panel.row("Evaluation license:", $systemInfoData::showFeedbackSystemInfoDialog$lambda$12$lambda$5);
/*    */ 
/*    */     
/* 40 */     $this$panel.row("License restrictions:", $systemInfoData::showFeedbackSystemInfoDialog$lambda$12$lambda$6);
/*    */ 
/*    */     
/* 43 */     $this$panel.row("Runtime version:", $systemInfoData::showFeedbackSystemInfoDialog$lambda$12$lambda$7);
/*    */ 
/*    */     
/* 46 */     $this$panel.row("Internal mode enabled:", $systemInfoData::showFeedbackSystemInfoDialog$lambda$12$lambda$8);
/*    */ 
/*    */     
/* 49 */     $this$panel.row("Registry:", $systemInfoData::showFeedbackSystemInfoDialog$lambda$12$lambda$9);
/*    */ 
/*    */     
/* 52 */     $this$panel.row("Disabled bundled plugins:", $systemInfoData::showFeedbackSystemInfoDialog$lambda$12$lambda$10);
/*    */ 
/*    */     
/* 55 */     $this$panel.row("Non-bundled plugins:", $systemInfoData::showFeedbackSystemInfoDialog$lambda$12$lambda$11)
/*    */       
/* 57 */       .bottomGap(BottomGap.MEDIUM);
/* 58 */     return Unit.INSTANCE; }
/*    */   private static final Unit showFeedbackSystemInfoDialog$lambda$12$lambda$7(CommonFeedbackSystemData $systemInfoData, Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.label($systemInfoData.getRuntimeVersion()); return Unit.INSTANCE; }
/*    */   private static final Unit showFeedbackSystemInfoDialog$lambda$12$lambda$8(CommonFeedbackSystemData $systemInfoData, Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.label($systemInfoData.getIsInternalModeForDialog()); return Unit.INSTANCE; } private static final Unit showFeedbackSystemInfoDialog$lambda$12$lambda$9(CommonFeedbackSystemData $systemInfoData, Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.cell((JComponent)new MultiLineLabel($systemInfoData.getRegistryKeysForDialog())); return Unit.INSTANCE; } private static final Unit showFeedbackSystemInfoDialog$lambda$12$lambda$10(CommonFeedbackSystemData $systemInfoData, Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.cell((JComponent)new MultiLineLabel($systemInfoData.getDisabledBundledPluginsForDialog())); return Unit.INSTANCE; } private static final Unit showFeedbackSystemInfoDialog$lambda$12$lambda$11(CommonFeedbackSystemData $systemInfoData, Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.cell((JComponent)new MultiLineLabel($systemInfoData.getNonBundledPluginsForDialog())); return Unit.INSTANCE; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\024J\023\020\004\032\b\022\004\022\0020\0060\005H\024¢\006\002\020\007¨\006\b"}, d2 = {"feedback/ShowFeedbackKt$showFeedbackSystemInfoDialog$dialog$1", "Lcom/intellij/openapi/ui/DialogWrapper;", "createCenterPanel", "Ljavax/swing/JComponent;", "createActions", "", "Ljavax/swing/Action;", "()[Ljavax/swing/Action;", "ej-ui"}) public static final class ShowFeedbackKt$showFeedbackSystemInfoDialog$dialog$1 extends DialogWrapper
/*    */   {
/* 62 */     ShowFeedbackKt$showFeedbackSystemInfoDialog$dialog$1(Project $project, DialogPanel $infoPanel) { super($project);
/*    */       
/* 64 */       init();
/* 65 */       setTitle("System Info"); }
/*    */     
/*    */     protected JComponent createCenterPanel() {
/* 68 */       JBScrollPane jBScrollPane1 = new JBScrollPane((Component)this.$infoPanel, 20, 
/* 69 */           31); JBScrollPane $this$createCenterPanel_u24lambda_u240 = jBScrollPane1; int $i$a$-apply-ShowFeedbackKt$showFeedbackSystemInfoDialog$dialog$1$createCenterPanel$1 = 0;
/* 70 */       $this$createCenterPanel_u24lambda_u240.setBorder((Border)new JBEmptyBorder(0));
/*    */       return (JComponent)jBScrollPane1;
/*    */     } protected Action[] createActions() {
/* 73 */       Action[] arrayOfAction = new Action[1]; arrayOfAction[0] = getOKAction(); return arrayOfAction;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\feedback\ShowFeedbackKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */