/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui;
/*     */ 
/*     */ import com.intellij.openapi.actionSystem.ActionGroup;
/*     */ import com.intellij.openapi.editor.event.EditorMouseEvent;
/*     */ import com.intellij.openapi.editor.ex.EditorEx;
/*     */ import com.intellij.openapi.editor.impl.ContextMenuPopupHandler;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalUiUtils$installPopupMenu$1", "Lcom/intellij/openapi/editor/impl/ContextMenuPopupHandler;", "getActionGroup", "Lcom/intellij/openapi/actionSystem/ActionGroup;", "event", "Lcom/intellij/openapi/editor/event/EditorMouseEvent;", "ej-core"})
/*     */ public final class TerminalUiUtils$installPopupMenu$1
/*     */   extends ContextMenuPopupHandler
/*     */ {
/*     */   TerminalUiUtils$installPopupMenu$1(EditorEx $editor) {}
/*     */   
/*     */   public ActionGroup getActionGroup(EditorMouseEvent event) {
/* 103 */     Intrinsics.checkNotNullParameter(event, "event"); return TerminalUiUtils.access$getPopupMenuGroup(TerminalUiUtils.INSTANCE, this.$editor, event);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\bloc\\ui\TerminalUiUtils$installPopupMenu$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */