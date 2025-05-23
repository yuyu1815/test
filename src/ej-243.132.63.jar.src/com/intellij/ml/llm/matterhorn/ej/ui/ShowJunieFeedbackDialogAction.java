/*    */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.openapi.actionSystem.AnAction;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/ShowJunieFeedbackDialogAction;", "Lcom/intellij/openapi/actionSystem/AnAction;", "<init>", "()V", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class ShowJunieFeedbackDialogAction extends AnAction {
/*    */   public static final int $stable;
/*    */   
/*    */   public ShowJunieFeedbackDialogAction() {
/* 15 */     super("Feedback");
/*    */   } public void actionPerformed(@NotNull AnActionEvent e) {
/* 17 */     Intrinsics.checkNotNullParameter(e, "e"); JunieFeedbackDialog dialog = new JunieFeedbackDialog(e.getProject());
/* 18 */     dialog.show();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\ShowJunieFeedbackDialogAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */