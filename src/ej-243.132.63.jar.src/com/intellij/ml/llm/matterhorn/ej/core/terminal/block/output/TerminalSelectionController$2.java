/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import com.intellij.openapi.editor.event.SelectionEvent;
/*    */ import com.intellij.openapi.editor.event.SelectionListener;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionController$2", "Lcom/intellij/openapi/editor/event/SelectionListener;", "selectionChanged", "", "e", "Lcom/intellij/openapi/editor/event/SelectionEvent;", "ej-core"})
/*    */ public final class null
/*    */   implements SelectionListener
/*    */ {
/*    */   public void selectionChanged(SelectionEvent e) {
/* 45 */     Intrinsics.checkNotNullParameter(e, "e"); if (!e.getNewRange().isEmpty())
/* 46 */       TerminalSelectionController.access$getSelectionModel$p(TerminalSelectionController.this).setSelectedBlocks(CollectionsKt.emptyList()); 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalSelectionController$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */