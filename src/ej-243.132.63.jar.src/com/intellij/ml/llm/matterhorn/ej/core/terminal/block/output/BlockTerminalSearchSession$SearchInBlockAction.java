/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.find.SearchSession;
/*     */ import com.intellij.find.editorHeaderActions.EditorHeaderToggleAction;
/*     */ import com.intellij.find.editorHeaderActions.Embeddable;
/*     */ import com.intellij.openapi.actionSystem.ex.TooltipDescriptionProvider;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.plugins.terminal.TerminalBundle;
/*     */ import org.jetbrains.plugins.terminal.TerminalIcons;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\002\b\002\030\0002\0020\0012\0020\0022\0020\003B\007¢\006\004\b\004\020\005J\020\020\006\032\0020\0072\006\020\b\032\0020\tH\024J\030\020\n\032\0020\0132\006\020\b\032\0020\t2\006\020\f\032\0020\007H\024¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockTerminalSearchSession$SearchInBlockAction;", "Lcom/intellij/find/editorHeaderActions/Embeddable;", "Lcom/intellij/openapi/actionSystem/ex/TooltipDescriptionProvider;", "Lcom/intellij/find/editorHeaderActions/EditorHeaderToggleAction;", "<init>", "()V", "isSelected", "", "session", "Lcom/intellij/find/SearchSession;", "setSelected", "", "selected", "ej-core"})
/*     */ final class SearchInBlockAction
/*     */   extends EditorHeaderToggleAction
/*     */   implements Embeddable, TooltipDescriptionProvider
/*     */ {
/*     */   public SearchInBlockAction() {
/* 295 */     super(TerminalBundle.message("search.in.block", new Object[0]), 
/* 296 */         TerminalIcons.SearchInBlock, 
/* 297 */         TerminalIcons.SearchInBlock, 
/* 298 */         TerminalIcons.SearchInBlock);
/*     */   } protected boolean isSelected(@NotNull SearchSession session) {
/* 300 */     Intrinsics.checkNotNullParameter(session, "session"); Intrinsics.checkNotNullExpressionValue(session.getFindModel(), "getFindModel(...)"); return BlockTerminalSearchSession.Companion.isSearchInBlock(session.getFindModel());
/*     */   }
/*     */   
/*     */   protected void setSelected(@NotNull SearchSession session, boolean selected) {
/* 304 */     Intrinsics.checkNotNullParameter(session, "session"); Intrinsics.checkNotNullExpressionValue(session.getFindModel(), "getFindModel(...)"); BlockTerminalSearchSession.Companion.setSearchInBlock(session.getFindModel(), selected);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\BlockTerminalSearchSession$SearchInBlockAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */