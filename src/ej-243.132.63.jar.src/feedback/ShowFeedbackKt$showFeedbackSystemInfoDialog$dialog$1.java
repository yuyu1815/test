/*    */ package feedback;
/*    */ 
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.ui.DialogPanel;
/*    */ import com.intellij.openapi.ui.DialogWrapper;
/*    */ import com.intellij.ui.components.JBScrollPane;
/*    */ import com.intellij.util.ui.JBEmptyBorder;
/*    */ import java.awt.Component;
/*    */ import javax.swing.Action;
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.border.Border;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\024J\023\020\004\032\b\022\004\022\0020\0060\005H\024¢\006\002\020\007¨\006\b"}, d2 = {"feedback/ShowFeedbackKt$showFeedbackSystemInfoDialog$dialog$1", "Lcom/intellij/openapi/ui/DialogWrapper;", "createCenterPanel", "Ljavax/swing/JComponent;", "createActions", "", "Ljavax/swing/Action;", "()[Ljavax/swing/Action;", "ej-ui"})
/*    */ public final class ShowFeedbackKt$showFeedbackSystemInfoDialog$dialog$1
/*    */   extends DialogWrapper
/*    */ {
/*    */   ShowFeedbackKt$showFeedbackSystemInfoDialog$dialog$1(Project $project, DialogPanel $infoPanel) {
/* 62 */     super($project);
/*    */     
/* 64 */     init();
/* 65 */     setTitle("System Info");
/*    */   }
/*    */   protected JComponent createCenterPanel() {
/* 68 */     JBScrollPane jBScrollPane1 = new JBScrollPane((Component)this.$infoPanel, 20, 
/* 69 */         31); JBScrollPane $this$createCenterPanel_u24lambda_u240 = jBScrollPane1; int $i$a$-apply-ShowFeedbackKt$showFeedbackSystemInfoDialog$dialog$1$createCenterPanel$1 = 0;
/* 70 */     $this$createCenterPanel_u24lambda_u240.setBorder((Border)new JBEmptyBorder(0));
/*    */     return (JComponent)jBScrollPane1;
/*    */   } protected Action[] createActions() {
/* 73 */     Action[] arrayOfAction = new Action[1]; arrayOfAction[0] = getOKAction(); return arrayOfAction;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\feedback\ShowFeedbackKt$showFeedbackSystemInfoDialog$dialog$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */