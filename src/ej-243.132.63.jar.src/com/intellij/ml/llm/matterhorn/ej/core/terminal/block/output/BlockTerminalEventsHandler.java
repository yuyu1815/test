/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.SimpleTerminalEventsHandler;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.BlockTerminalSession;
/*    */ import com.intellij.terminal.JBTerminalSystemSettingsProviderBase;
/*    */ import java.awt.event.KeyEvent;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\020\020\n\032\0020\0132\006\020\f\032\0020\rH\026J\020\020\016\032\0020\0132\006\020\f\032\0020\rH\026R\016\020\006\032\0020\007X\004¢\006\002\n\000¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockTerminalEventsHandler;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalEventsHandler;", "session", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "settings", "Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;", "outputController", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController;)V", "keyTyped", "", "e", "Ljava/awt/event/KeyEvent;", "keyPressed", "ej-core"})
/*    */ public final class BlockTerminalEventsHandler
/*    */   extends SimpleTerminalEventsHandler
/*    */ {
/*    */   public BlockTerminalEventsHandler(@NotNull BlockTerminalSession session, @NotNull JBTerminalSystemSettingsProviderBase settings, @NotNull TerminalOutputController outputController) {
/* 17 */     super(session, settings, outputController.getOutputModel());
/*    */     this.outputController = outputController;
/*    */   } @NotNull
/*    */   private final TerminalOutputController outputController; public void keyTyped(@NotNull KeyEvent e) {
/* 21 */     Intrinsics.checkNotNullParameter(e, "e"); TerminalSelectionModel selectionModel = this.outputController.getSelectionModel();
/* 22 */     if (selectionModel.getPrimarySelection() != null) {
/* 23 */       selectionModel.setSelectedBlocks(CollectionsKt.emptyList());
/*    */     }
/* 25 */     this.outputController.scrollToBottom(); super
/* 26 */       .keyTyped(e);
/*    */   }
/*    */   
/*    */   public void keyPressed(@NotNull KeyEvent e) {
/* 30 */     Intrinsics.checkNotNullParameter(e, "e"); CommandBlock selectedBlock = this.outputController.getSelectionModel().getPrimarySelection();
/*    */ 
/*    */     
/* 33 */     if (selectedBlock == null || Intrinsics.areEqual(selectedBlock, TerminalOutputModelKt.getActiveBlock(getOutputModel()))) super
/* 34 */         .keyPressed(e); 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\BlockTerminalEventsHandler.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */