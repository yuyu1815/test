/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptRenderingInfo;
/*    */ import com.intellij.openapi.Disposable;
/*    */ import com.intellij.openapi.actionSystem.DataKey;
/*    */ import com.intellij.openapi.editor.ex.EditorEx;
/*    */ import com.intellij.util.concurrency.annotations.RequiresEdt;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.ApiStatus.Internal;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000^\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\004\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\002\n\002\b\006\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bg\030\000 (2\0020\001:\001(J$\020\013\032\0020\b2\b\020\f\032\004\030\0010\r2\b\020\016\032\004\030\0010\0172\006\020\020\032\0020\021H'J\020\020\022\032\0020\0232\006\020\024\032\0020\bH'J\020\020\025\032\0020\0232\006\020\026\032\0020\bH'J\b\020\027\032\0020\023H'J\b\020\030\032\0020\023H'J\026\020\031\032\b\022\004\022\0020\0320\0072\006\020\026\032\0020\bH'J\036\020\033\032\0020\0232\006\020\026\032\0020\b2\f\020\034\032\b\022\004\022\0020\0320\007H'J\b\020\035\032\0020\036H'J\030\020\037\032\0020\0232\006\020\026\032\0020\b2\006\020 \032\0020!H'J\022\020\"\032\004\030\0010!2\006\020\026\032\0020\bH'J\034\020#\032\0020\0232\006\020$\032\0020%2\n\b\002\020&\032\004\030\0010'H&R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\030\020\006\032\b\022\004\022\0020\b0\007X¦\004¢\006\006\032\004\b\t\020\n¨\006)"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;", "", "editor", "Lcom/intellij/openapi/editor/ex/EditorEx;", "getEditor", "()Lcom/intellij/openapi/editor/ex/EditorEx;", "blocks", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;", "getBlocks", "()Ljava/util/List;", "createBlock", "command", "", "prompt", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderingInfo;", "terminalWidth", "", "finalizeBlock", "", "activeBlock", "removeBlock", "block", "clearBlocks", "trimOutput", "getHighlightings", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo;", "putHighlightings", "highlightings", "getHighlightingsSnapshot", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputHighlightingsSnapshot;", "setBlockInfo", "info", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlockInfo;", "getBlockInfo", "addListener", "listener", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModelListener;", "disposable", "Lcom/intellij/openapi/Disposable;", "Companion", "ej-core"})
/*    */ @Internal
/*    */ public interface TerminalOutputModel {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   @NotNull
/*    */   EditorEx getEditor();
/*    */   
/*    */   @NotNull
/*    */   List<CommandBlock> getBlocks();
/*    */   
/*    */   @RequiresEdt
/*    */   @NotNull
/*    */   CommandBlock createBlock(@Nullable String paramString, @Nullable TerminalPromptRenderingInfo paramTerminalPromptRenderingInfo, int paramInt);
/*    */   
/*    */   @RequiresEdt
/*    */   void finalizeBlock(@NotNull CommandBlock paramCommandBlock);
/*    */   
/*    */   @RequiresEdt
/*    */   void removeBlock(@NotNull CommandBlock paramCommandBlock);
/*    */   
/*    */   @RequiresEdt
/*    */   void clearBlocks();
/*    */   
/*    */   @RequiresEdt
/*    */   void trimOutput();
/*    */   
/*    */   @RequiresEdt
/*    */   @NotNull
/*    */   List<HighlightingInfo> getHighlightings(@NotNull CommandBlock paramCommandBlock);
/*    */   
/*    */   @RequiresEdt
/*    */   void putHighlightings(@NotNull CommandBlock paramCommandBlock, @NotNull List<HighlightingInfo> paramList);
/*    */   
/*    */   @RequiresEdt
/*    */   @NotNull
/*    */   TerminalOutputHighlightingsSnapshot getHighlightingsSnapshot();
/*    */   
/*    */   @RequiresEdt
/*    */   void setBlockInfo(@NotNull CommandBlock paramCommandBlock, @NotNull CommandBlockInfo paramCommandBlockInfo);
/*    */   
/*    */   @RequiresEdt
/*    */   @Nullable
/*    */   CommandBlockInfo getBlockInfo(@NotNull CommandBlock paramCommandBlock);
/*    */   
/*    */   void addListener(@NotNull TerminalOutputModelListener paramTerminalOutputModelListener, @Nullable Disposable paramDisposable);
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls {}
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel$Companion;", "", "<init>", "()V", "KEY", "Lcom/intellij/openapi/actionSystem/DataKey;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;", "getKEY", "()Lcom/intellij/openapi/actionSystem/DataKey;", "ej-core"})
/*    */   public static final class Companion {
/*    */     @NotNull
/* 68 */     private static final DataKey<TerminalOutputModel> KEY = DataKey.Companion.create("Junie.TerminalOutputModel"); @NotNull public final DataKey<TerminalOutputModel> getKEY() { return KEY; }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalOutputModel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */