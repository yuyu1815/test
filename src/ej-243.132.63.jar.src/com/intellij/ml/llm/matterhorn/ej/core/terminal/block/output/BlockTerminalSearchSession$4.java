/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import com.intellij.openapi.editor.event.EditorFactoryEvent;
/*    */ import com.intellij.openapi.editor.event.EditorFactoryListener;
/*    */ import com.intellij.openapi.util.Disposer;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockTerminalSearchSession$4", "Lcom/intellij/openapi/editor/event/EditorFactoryListener;", "editorReleased", "", "event", "Lcom/intellij/openapi/editor/event/EditorFactoryEvent;", "ej-core"})
/*    */ public final class null
/*    */   implements EditorFactoryListener
/*    */ {
/*    */   public void editorReleased(EditorFactoryEvent event) {
/* 86 */     Intrinsics.checkNotNullParameter(event, "event"); if (event.getEditor() == BlockTerminalSearchSession.access$getEditor$p(BlockTerminalSearchSession.this)) {
/* 87 */       Disposer.dispose(BlockTerminalSearchSession.access$getDisposable$p(BlockTerminalSearchSession.this));
/* 88 */       BlockTerminalSearchSession.access$getLivePreviewController$p(BlockTerminalSearchSession.this).dispose();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\BlockTerminalSearchSession$4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */