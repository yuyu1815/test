/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.TerminalFocusModel;
/*     */ import com.intellij.openapi.editor.event.EditorMouseEvent;
/*     */ import com.intellij.openapi.editor.event.SelectionEvent;
/*     */ import com.intellij.openapi.editor.ex.EditorEx;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\002\n\002\020\002\n\000\n\002\020\013\n\002\b\005\n\002\030\002\n\002\b\017\b\000\030\000 22\0020\0012\0020\0022\0020\003:\0012B\037\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\004\b\n\020\013J\030\020\033\032\0020\0342\006\020\035\032\0020\0362\006\020\037\032\0020\036H\007J\b\020 \032\0020\034H\007J\b\020!\032\0020\034H\007J\020\020\"\032\0020\0342\006\020#\032\0020$H\026J\020\020%\032\0020\0342\006\020#\032\0020$H\026J\020\020&\032\0020\0342\006\020#\032\0020$H\026J\020\020'\032\0020\0342\006\020#\032\0020$H\026J\020\020(\032\0020\0342\006\020)\032\0020$H\026J$\020*\032\0020\0342\f\020+\032\b\022\004\022\0020\0160\r2\f\020,\032\b\022\004\022\0020\0160\rH\026J\020\020-\032\0020\0342\006\020.\032\0020\016H\002J\022\020/\032\004\030\0010\0162\006\020#\032\0020$H\002J\020\0200\032\0020\0342\006\0201\032\0020\016H\002R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\027\020\f\032\b\022\004\022\0020\0160\r8F¢\006\006\032\004\b\017\020\020R\023\020\021\032\004\030\0010\0168F¢\006\006\032\004\b\022\020\023R\024\020\024\032\0020\0258BX\004¢\006\006\032\004\b\026\020\027R\022\020\030\032\004\030\0010\031X\016¢\006\004\n\002\020\032¨\0063"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionController;", "Lcom/intellij/openapi/editor/event/EditorMouseListener;", "Lcom/intellij/openapi/editor/event/EditorMouseMotionListener;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel$TerminalSelectionListener;", "focusModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel;", "selectionModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel;", "outputModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;)V", "selectedBlocks", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;", "getSelectedBlocks", "()Ljava/util/List;", "primarySelection", "getPrimarySelection", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;", "textSelectionModel", "Lcom/intellij/openapi/editor/SelectionModel;", "getTextSelectionModel", "()Lcom/intellij/openapi/editor/SelectionModel;", "rangeSelectionInitialIndex", "", "Ljava/lang/Integer;", "selectRelativeBlock", "", "isBelow", "", "dropCurrentSelection", "selectLastBlock", "clearSelection", "mouseClicked", "event", "Lcom/intellij/openapi/editor/event/EditorMouseEvent;", "mousePressed", "mouseEntered", "mouseExited", "mouseMoved", "e", "selectionChanged", "oldSelection", "newSelection", "selectBlockRange", "targetBlock", "getBlockUnderMouse", "makeBlockVisible", "block", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nTerminalSelectionController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalSelectionController.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,221:1\n1#2:222\n1557#3:223\n1628#3,3:224\n*S KotlinDebug\n*F\n+ 1 TerminalSelectionController.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionController\n*L\n167#1:223\n167#1:224,3\n*E\n"})
/*     */ public final class TerminalSelectionController implements EditorMouseListener, EditorMouseMotionListener, TerminalSelectionModel.TerminalSelectionListener {
/*  19 */   public TerminalSelectionController(@NotNull TerminalFocusModel focusModel, @NotNull TerminalSelectionModel selectionModel, @NotNull TerminalOutputModel outputModel) { this.focusModel = focusModel;
/*  20 */     this.selectionModel = selectionModel;
/*  21 */     this.outputModel = outputModel;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  35 */     this.outputModel.getEditor().addEditorMouseListener(this);
/*  36 */     this.outputModel.getEditor().addEditorMouseMotionListener(this);
/*  37 */     TerminalSelectionModel.addListener$default(this.selectionModel, this, null, 2, null);
/*  38 */     TerminalFocusModel.addListener$default(this.focusModel, new TerminalFocusModel.TerminalFocusListener() { public void activeStateChanged(boolean isActive) { TerminalFocusModel.TerminalFocusListener.DefaultImpls.activeStateChanged(this, isActive); }
/*     */            public void promptFocused() {
/*  40 */             TerminalSelectionController.this.clearSelection();
/*     */           } }
/*     */         null, 2, null);
/*  43 */     getTextSelectionModel().addSelectionListener(new SelectionListener()
/*     */         {
/*  45 */           public void selectionChanged(SelectionEvent e) { Intrinsics.checkNotNullParameter(e, "e"); if (!e.getNewRange().isEmpty())
/*  46 */               TerminalSelectionController.this.selectionModel.setSelectedBlocks(CollectionsKt.emptyList());  }
/*     */         }); }
/*     */   public void hoverChanged(@Nullable CommandBlock oldHovered, @Nullable CommandBlock newHovered) { TerminalSelectionModel.TerminalSelectionListener.DefaultImpls.hoverChanged(this, oldHovered, newHovered); }
/*     */   @NotNull public final List<CommandBlock> getSelectedBlocks() { return this.selectionModel.getSelectedBlocks(); }
/*     */   @Nullable public final CommandBlock getPrimarySelection() { return this.selectionModel.getPrimarySelection(); }
/*     */   private final SelectionModel getTextSelectionModel() { Intrinsics.checkNotNullExpressionValue(this.outputModel.getEditor().getSelectionModel(), "getSelectionModel(...)"); return this.outputModel.getEditor().getSelectionModel(); }
/*     */   @RequiresEdt public final void selectLastBlock() { CommandBlock block; if ((CommandBlock)CollectionsKt.lastOrNull(this.outputModel.getBlocks()) == null) {
/*     */       (CommandBlock)CollectionsKt.lastOrNull(this.outputModel.getBlocks()); return;
/*  54 */     }  this.selectionModel.setSelectedBlocks(CollectionsKt.listOf(block)); makeBlockVisible(block); } @RequiresEdt public final void clearSelection() { this.selectionModel.setSelectedBlocks(CollectionsKt.emptyList()); getTextSelectionModel().removeSelection(); this.focusModel.focusPrompt(); } @RequiresEdt public final void selectRelativeBlock(boolean isBelow, boolean dropCurrentSelection) { if (this.selectionModel.getPrimarySelection() == null) { this.selectionModel.getPrimarySelection(); return; }
/*  55 */      Integer integer = Integer.valueOf(this.outputModel.getBlocks().indexOf(primaryBlock)); int it = integer.intValue();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 222 */     int $i$a$-takeIf-TerminalSelectionController$selectRelativeBlock$curIndex$1 = 0; if ((((it >= 0)) ? integer : null) != null) {  } else { (((it >= 0)) ? integer : null).intValue(); return; }  CommandBlock primaryBlock = this.selectionModel.getPrimarySelection(); CommandBlock commandBlock1 = primaryBlock; int newIndex = isBelow ? (commandBlock1 + 1) : (commandBlock1 - 1); if ((0 <= newIndex) ? ((newIndex < this.outputModel.getBlocks().size())) : false) { CommandBlock newBlock = this.outputModel.getBlocks().get(newIndex); if (dropCurrentSelection) { this.selectionModel.setSelectedBlocks(CollectionsKt.listOf(newBlock)); } else { selectBlockRange(newBlock); }  makeBlockVisible(newBlock); } else if (isBelow) { EditorEx editor = this.outputModel.getEditor(); int visibleHeight = (editor.getScrollingModel().getVisibleArea()).height; editor.getScrollingModel().scrollVertically(editor.getContentComponent().getHeight() - visibleHeight); }  } public void mouseClicked(@NotNull EditorMouseEvent event) { Intrinsics.checkNotNullParameter(event, "event"); if (event.getMouseEvent().getClickCount() != 1) return;  CommandBlock block = getBlockUnderMouse(event); Intrinsics.checkNotNullExpressionValue(event.getMouseEvent(), "getMouseEvent(...)"); if (block != null && Companion.isSelectAdditionalBlock(event.getMouseEvent())) { this.selectionModel.setSelectedBlocks(getSelectedBlocks().contains(block) ? CollectionsKt.minus(getSelectedBlocks(), block) : CollectionsKt.plus(getSelectedBlocks(), block)); } else if (block != null) { this.selectionModel.setSelectedBlocks(CollectionsKt.listOf(block)); } else { clearSelection(); }  } public void mousePressed(@NotNull EditorMouseEvent event) { CommandBlock block; Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullExpressionValue(event.getMouseEvent(), "getMouseEvent(...)"); if (Companion.isSelectBlockRange(event.getMouseEvent())) event.consume();  if (getBlockUnderMouse(event) == null) { getBlockUnderMouse(event); return; }  if (SwingUtilities.isRightMouseButton(event.getMouseEvent())) { SelectionModel it = getTextSelectionModel(); int $i$a$-let-TerminalSelectionController$mousePressed$insideTextSelection$1 = 0; int i = it.getSelectionStart(), j = it.getSelectionEnd(), k = event.getOffset(); boolean insideTextSelection = (i <= k) ? ((k <= j)) : false; if (!this.selectionModel.getSelectedBlocks().contains(block) && !insideTextSelection) this.selectionModel.setSelectedBlocks(CollectionsKt.listOf(block));  } else { Intrinsics.checkNotNullExpressionValue(event.getMouseEvent(), "getMouseEvent(...)"); if (Companion.isSelectBlockRange(event.getMouseEvent())) selectBlockRange(block);  }  } public void mouseEntered(@NotNull EditorMouseEvent event) { Intrinsics.checkNotNullParameter(event, "event"); mouseMoved(event); } public void mouseExited(@NotNull EditorMouseEvent event) { Intrinsics.checkNotNullParameter(event, "event"); this.selectionModel.setHoveredBlock(null); } public void mouseMoved(@NotNull EditorMouseEvent e) { Intrinsics.checkNotNullParameter(e, "e"); CommandBlock block = getBlockUnderMouse(e); if (block != null && this.selectionModel.getSelectedBlocks().contains(block)) block = null;  this.selectionModel.setHoveredBlock(block); } public void selectionChanged(@NotNull List oldSelection, @NotNull List newSelection) { Intrinsics.checkNotNullParameter(oldSelection, "oldSelection"); Intrinsics.checkNotNullParameter(newSelection, "newSelection"); if (!newSelection.isEmpty()) { getTextSelectionModel().removeSelection(); this.focusModel.focusOutput(); } else if (!getTextSelectionModel().hasSelection()) { this.focusModel.focusPrompt(); }  this.rangeSelectionInitialIndex = null; }
/* 223 */   private final void selectBlockRange(CommandBlock targetBlock) { CommandBlock primaryBlock = getPrimarySelection(); if (primaryBlock == null) { this.selectionModel.setSelectedBlocks(CollectionsKt.listOf(targetBlock)); return; }  int curBlockIndex = this.outputModel.getBlocks().indexOf(primaryBlock); int initialBlockIndex = (this.rangeSelectionInitialIndex != null) ? this.rangeSelectionInitialIndex.intValue() : curBlockIndex; int newBlockIndex = this.outputModel.getBlocks().indexOf(targetBlock); if (curBlockIndex != -1 && newBlockIndex != -1) { IntProgression indexRange = (initialBlockIndex <= newBlockIndex) ? (IntProgression)new IntRange(initialBlockIndex, newBlockIndex) : RangesKt.downTo(initialBlockIndex, newBlockIndex); Iterable iterable1 = (Iterable)indexRange; TerminalSelectionModel terminalSelectionModel = this.selectionModel; int $i$f$map = 0; Iterable iterable2 = iterable1; Collection<CommandBlock> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable1, 10)); int $i$f$mapTo = 0;
/* 224 */       for (Iterator iterator = iterable2.iterator(); iterator.hasNext(); ) { int item$iv$iv = ((IntIterator)iterator).nextInt();
/* 225 */         int i = item$iv$iv; Collection<CommandBlock> collection = destination$iv$iv; int $i$a$-map-TerminalSelectionController$selectBlockRange$1 = 0; collection.add(this.outputModel.getBlocks().get(i)); }
/* 226 */        terminalSelectionModel.setSelectedBlocks((List<? extends CommandBlock>)destination$iv$iv);
/*     */       this.rangeSelectionInitialIndex = Integer.valueOf(initialBlockIndex); }
/*     */     else
/*     */     { this.selectionModel.setSelectedBlocks(CollectionsKt.listOf(targetBlock)); }
/*     */      }
/*     */ 
/*     */   
/*     */   private final CommandBlock getBlockUnderMouse(EditorMouseEvent event) {
/*     */     CommandBlock block = TerminalOutputModelKt.getByOffset(this.outputModel, event.getOffset());
/*     */     if (block != null) {
/*     */       Rectangle bounds = TerminalOutputModelKt.getBlockBounds(this.outputModel, block);
/*     */       if (bounds.contains(event.getMouseEvent().getPoint()))
/*     */         return block; 
/*     */     } 
/*     */     return null;
/*     */   }
/*     */   
/*     */   private final void makeBlockVisible(CommandBlock block) {
/*     */     EditorEx editor = this.outputModel.getEditor();
/*     */     Rectangle bounds = TerminalOutputModelKt.getBlockBounds(this.outputModel, block);
/*     */     Intrinsics.checkNotNullExpressionValue(editor.getScrollingModel().getVisibleArea(), "getVisibleArea(...)");
/*     */     Rectangle visibleArea = editor.getScrollingModel().getVisibleArea();
/*     */     int i = visibleArea.y, j = visibleArea.y + visibleArea.height, k = bounds.y;
/*     */     if (!((i <= k) ? ((k < j) ? 1 : 0) : 0)) {
/*     */       int blockMaxHeight = Math.min(bounds.height + 0, visibleArea.height);
/*     */       int scrollOffset = (bounds.y < visibleArea.y) ? (bounds.y - 0) : (bounds.y + blockMaxHeight - visibleArea.height);
/*     */       int offset = MathUtil.clamp(scrollOffset, 0, editor.getContentComponent().getHeight());
/*     */       editor.getScrollingModel().scrollVertically(offset);
/*     */     } 
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\bR\030\020\t\032\0020\n*\0020\0138BX\004¢\006\006\032\004\b\t\020\fR\030\020\r\032\0020\n*\0020\0138BX\004¢\006\006\032\004\b\r\020\fR\030\020\016\032\0020\n*\0020\0138BX\004¢\006\006\032\004\b\016\020\fR\030\020\017\032\0020\n*\0020\0138BX\004¢\006\006\032\004\b\017\020\f¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionController$Companion;", "", "<init>", "()V", "KEY", "Lcom/intellij/openapi/actionSystem/DataKey;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionController;", "getKEY", "()Lcom/intellij/openapi/actionSystem/DataKey;", "isSelectBlockRange", "", "Ljava/awt/event/MouseEvent;", "(Ljava/awt/event/MouseEvent;)Z", "isSelectAdditionalBlock", "isOnlyMetaDown", "isOnlyControlDown", "ej-core"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final DataKey<TerminalSelectionController> getKEY() {
/*     */       return TerminalSelectionController.KEY;
/*     */     }
/*     */     
/*     */     private final boolean isSelectBlockRange(MouseEvent $this$isSelectBlockRange) {
/*     */       return ($this$isSelectBlockRange.isShiftDown() && !$this$isSelectBlockRange.isControlDown() && !$this$isSelectBlockRange.isAltDown() && !$this$isSelectBlockRange.isMetaDown());
/*     */     }
/*     */     
/*     */     private final boolean isSelectAdditionalBlock(MouseEvent $this$isSelectAdditionalBlock) {
/*     */       return SystemInfo.isMac ? isOnlyMetaDown($this$isSelectAdditionalBlock) : isOnlyControlDown($this$isSelectAdditionalBlock);
/*     */     }
/*     */     
/*     */     private final boolean isOnlyMetaDown(MouseEvent $this$isOnlyMetaDown) {
/*     */       return ($this$isOnlyMetaDown.isMetaDown() && !$this$isOnlyMetaDown.isControlDown() && !$this$isOnlyMetaDown.isAltDown() && !$this$isOnlyMetaDown.isShiftDown());
/*     */     }
/*     */     
/*     */     private final boolean isOnlyControlDown(MouseEvent $this$isOnlyControlDown) {
/*     */       return ($this$isOnlyControlDown.isControlDown() && !$this$isOnlyControlDown.isAltDown() && !$this$isOnlyControlDown.isShiftDown() && !$this$isOnlyControlDown.isMetaDown());
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final TerminalFocusModel focusModel;
/*     */   @NotNull
/*     */   private final TerminalSelectionModel selectionModel;
/*     */   @NotNull
/*     */   private final TerminalOutputModel outputModel;
/*     */   @Nullable
/*     */   private Integer rangeSelectionInitialIndex;
/*     */   @NotNull
/*     */   private static final DataKey<TerminalSelectionController> KEY = DataKey.Companion.create("Junie.TerminalSelectionController");
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalSelectionController.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */