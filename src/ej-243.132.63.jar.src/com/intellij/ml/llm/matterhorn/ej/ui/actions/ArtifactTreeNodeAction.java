/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.actions;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.ArtifactNode;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b'\030\0002\0020\001B\007¢\006\004\b\002\020\003J\030\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH&J\030\020\n\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH&J\016\020\n\032\0020\0052\006\020\b\032\0020\tJ\016\020\004\032\0020\0052\006\020\b\032\0020\t¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/actions/ArtifactTreeNodeAction;", "Lcom/intellij/openapi/actionSystem/AnAction;", "<init>", "()V", "actionPerformed", "", "node", "Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "update", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public abstract class ArtifactTreeNodeAction extends AnAction {
/*    */   public static final int $stable;
/*    */   
/*    */   public final void update(@NotNull AnActionEvent e) {
/*    */     ArtifactNode node;
/* 13 */     Intrinsics.checkNotNullParameter(e, "e"); if ((ArtifactNode)e.getDataContext().getData(MatterhornToolWindowPanel.Companion.getSELECTED_NODE_KEY()) == null) { (ArtifactNode)e.getDataContext().getData(MatterhornToolWindowPanel.Companion.getSELECTED_NODE_KEY()); return; }
/* 14 */      update(node, e);
/*    */   } public abstract void actionPerformed(@NotNull ArtifactNode paramArtifactNode, @NotNull AnActionEvent paramAnActionEvent); public abstract void update(@NotNull ArtifactNode paramArtifactNode, @NotNull AnActionEvent paramAnActionEvent);
/*    */   public final void actionPerformed(@NotNull AnActionEvent e) {
/*    */     ArtifactNode node;
/* 18 */     Intrinsics.checkNotNullParameter(e, "e"); if ((ArtifactNode)e.getDataContext().getData(MatterhornToolWindowPanel.Companion.getSELECTED_NODE_KEY()) == null) { (ArtifactNode)e.getDataContext().getData(MatterhornToolWindowPanel.Companion.getSELECTED_NODE_KEY()); return; }
/* 19 */      actionPerformed(node, e);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\actions\ArtifactTreeNodeAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */