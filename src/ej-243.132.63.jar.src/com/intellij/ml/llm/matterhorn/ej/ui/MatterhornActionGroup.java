/*    */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.openapi.actionSystem.ActionUpdateThread;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import com.intellij.openapi.actionSystem.CommonDataKeys;
/*    */ import com.intellij.openapi.actionSystem.DefaultActionGroup;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\026J\b\020\b\032\0020\tH\026¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornActionGroup;", "Lcom/intellij/openapi/actionSystem/DefaultActionGroup;", "<init>", "()V", "update", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class MatterhornActionGroup
/*    */   extends DefaultActionGroup
/*    */ {
/*    */   public static final int $stable;
/*    */   
/*    */   public void update(@NotNull AnActionEvent e) {
/* 43 */     Intrinsics.checkNotNullParameter(e, "e"); PsiFile currentFile = (PsiFile)e.getData(CommonDataKeys.PSI_FILE);
/* 44 */     e.getPresentation().setEnabledAndVisible((currentFile instanceof org.intellij.plugins.markdown.lang.psi.impl.MarkdownFile || currentFile instanceof com.intellij.json.psi.JsonFile));
/*    */   } @NotNull
/*    */   public ActionUpdateThread getActionUpdateThread() {
/* 47 */     return ActionUpdateThread.BGT;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\MatterhornActionGroup.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */