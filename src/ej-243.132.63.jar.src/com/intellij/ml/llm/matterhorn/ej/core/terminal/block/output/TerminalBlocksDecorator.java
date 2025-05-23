/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.TerminalFocusModel;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.editor.Inlay;
/*     */ import com.intellij.openapi.util.Disposer;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Rectangle;
/*     */ import java.util.List;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000^\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020%\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\004\n\002\020 \n\002\b\002\n\002\030\002\n\002\b\006\n\002\020\b\n\002\b\005\b\000\030\0002\0020\001:\003&'(B/\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013¢\006\004\b\f\020\rJ\020\020\024\032\0020\0252\006\020\026\032\0020\020H\007J\020\020\027\032\0020\0252\006\020\026\032\0020\020H\002J\026\020\030\032\0020\0252\f\020\031\032\b\022\004\022\0020\0200\032H\002J\020\020\033\032\0020\0252\006\020\026\032\0020\020H\002J\020\020\034\032\0020\0352\006\020\026\032\0020\020H\002J\b\020\036\032\0020\035H\002J\b\020\037\032\0020\035H\002J\030\020 \032\0020\0252\006\020\026\032\0020\0202\006\020!\032\0020\035H\002J\030\020\"\032\0020\0252\006\020\026\032\0020\0202\006\020#\032\0020$H\002J\020\020%\032\0020\0252\006\020\026\032\0020\020H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\016\020\n\032\0020\013X\004¢\006\002\n\000R\032\020\016\032\016\022\004\022\0020\020\022\004\022\0020\0210\017X\004¢\006\002\n\000R\016\020\022\032\0020\023X\004¢\006\002\n\000¨\006)"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalBlocksDecorator;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModelListener;", "colorPalette", "Lcom/intellij/terminal/TerminalColorPalette;", "outputModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;", "focusModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel;", "selectionModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel;", "editor", "Lcom/intellij/openapi/editor/ex/EditorEx;", "<init>", "(Lcom/intellij/terminal/TerminalColorPalette;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel;Lcom/intellij/openapi/editor/ex/EditorEx;)V", "decorations", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockDecoration;", "hoveredGradientCache", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/GradientTextureCache;", "installDecoration", "", "block", "updateDecorationState", "updateSelectionDecorationState", "selectedBlocks", "", "updateHoveredState", "calculateDecorationState", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockDecorationState;", "calculateSelectionDecorationState", "calculateErrorSelectionDecorationState", "setDecorationState", "state", "addExitCodeInlay", "exitCode", "", "updateCommandToOutputInlay", "ExitCodeRenderer", "EmptyWidthInlayRenderer", "TerminalRightAreaRenderer", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nTerminalBlocksDecorator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalBlocksDecorator.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalBlocksDecorator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,312:1\n1#2:313\n*E\n"})
/*     */ public final class TerminalBlocksDecorator implements TerminalOutputModelListener {
/*     */   @NotNull
/*     */   private final TerminalColorPalette colorPalette;
/*     */   @NotNull
/*     */   private final TerminalOutputModel outputModel;
/*     */   @NotNull
/*     */   private final TerminalFocusModel focusModel;
/*     */   @NotNull
/*     */   private final TerminalSelectionModel selectionModel;
/*     */   @NotNull
/*     */   private final EditorEx editor;
/*     */   @NotNull
/*     */   private final Map<CommandBlock, BlockDecoration> decorations;
/*     */   @NotNull
/*     */   private final GradientTextureCache hoveredGradientCache;
/*     */   
/*  31 */   public TerminalBlocksDecorator(@NotNull TerminalColorPalette colorPalette, @NotNull TerminalOutputModel outputModel, @NotNull TerminalFocusModel focusModel, @NotNull TerminalSelectionModel selectionModel, @NotNull EditorEx editor) { this.colorPalette = colorPalette;
/*  32 */     this.outputModel = outputModel;
/*  33 */     this.focusModel = focusModel;
/*  34 */     this.selectionModel = selectionModel;
/*  35 */     this.editor = editor;
/*     */     
/*  37 */     this.decorations = new HashMap<>();
/*     */ 
/*     */     
/*  40 */     Intrinsics.checkNotNullExpressionValue(this.editor.getColorsScheme(), "getColorsScheme(...)"); this.hoveredGradientCache = new GradientTextureCache(this.editor.getColorsScheme(), 
/*  41 */         BlockTerminalColors.HOVERED_BLOCK_BACKGROUND_START, 
/*  42 */         BlockTerminalColors.HOVERED_BLOCK_BACKGROUND_END);
/*     */ 
/*     */ 
/*     */     
/*  46 */     TerminalOutputModel.DefaultImpls.addListener$default(this.outputModel, this, null, 2, null);
/*  47 */     EditorUtil.disposeWithEditor((Editor)this.editor, (Disposable)this.hoveredGradientCache);
/*  48 */     RangeHighlighter rangeHighlighter1 = this.editor.getMarkupModel().addRangeHighlighter(0, 0, 
/*     */         
/*  50 */         6000, null, 
/*  51 */         HighlighterTargetArea.LINES_IN_RANGE); RangeHighlighter $this$_init__u24lambda_u240 = rangeHighlighter1; int $i$a$-apply-TerminalBlocksDecorator$1 = 0;
/*  52 */     $this$_init__u24lambda_u240.setGreedyToLeft(true);
/*  53 */     $this$_init__u24lambda_u240.setGreedyToRight(true);
/*  54 */     $this$_init__u24lambda_u240.setCustomRenderer(new TerminalRightAreaRenderer());
/*     */ 
/*     */     
/*  57 */     TerminalOutputModel.DefaultImpls.addListener$default(this.outputModel, new TerminalOutputModelListener() { public void blockCreated(CommandBlock block) { TerminalOutputModelListener.DefaultImpls.blockCreated(this, block); }
/*     */           
/*  59 */           public void blockFinalized(CommandBlock block) { Intrinsics.checkNotNullParameter(block, "block"); BlockDecoration it = (BlockDecoration)TerminalBlocksDecorator.this.decorations.get(block); int $i$a$-let-TerminalBlocksDecorator$2$blockFinalized$1 = 0;
/*  60 */             it.getBackgroundHighlighter().setGreedyToRight(false);
/*  61 */             it.getCornersHighlighter().setGreedyToRight(false);
/*  62 */             Intrinsics.checkNotNull(it.getBottomInlay(), "null cannot be cast to non-null type com.intellij.openapi.editor.impl.RangeMarkerImpl"); ((RangeMarkerImpl)it.getBottomInlay()).setStickingToRight(false); (BlockDecoration)TerminalBlocksDecorator.this.decorations.get(block); }
/*     */           public void blockInfoUpdated(CommandBlock block, CommandBlockInfo newInfo) { Intrinsics.checkNotNullParameter(block, "block"); Intrinsics.checkNotNullParameter(newInfo, "newInfo"); TerminalBlocksDecorator.this.updateDecorationState(block); if (newInfo.getExitCode() != 0) TerminalBlocksDecorator.this.addExitCodeInlay(block, newInfo.getExitCode());  TerminalBlocksDecorator.this.updateCommandToOutputInlay(block); } }null, 2, null); TerminalSelectionModel.addListener$default(this.selectionModel, new TerminalSelectionModel.TerminalSelectionListener()
/*     */         {
/*     */           public void selectionChanged(List oldSelection, List newSelection) { Intrinsics.checkNotNullParameter(oldSelection, "oldSelection"); Intrinsics.checkNotNullParameter(newSelection, "newSelection"); for (CommandBlock block : oldSelection) TerminalBlocksDecorator.this.updateDecorationState(block);  TerminalBlocksDecorator.this.updateSelectionDecorationState(newSelection); } public void hoverChanged(CommandBlock oldHovered, CommandBlock newHovered) { if (oldHovered != null && TerminalBlocksDecorator.this.decorations.containsKey(oldHovered))
/*     */               TerminalBlocksDecorator.this.updateDecorationState(oldHovered);  if (newHovered != null)
/*  67 */               TerminalBlocksDecorator.this.updateHoveredState(newHovered);  } public void blockRemoved(CommandBlock block) { CommandBlock firstBlock; Intrinsics.checkNotNullParameter(block, "block"); BlockDecoration blockDecoration1 = (BlockDecoration)TerminalBlocksDecorator.this.decorations.get(block); TerminalBlocksDecorator terminalBlocksDecorator = TerminalBlocksDecorator.this; BlockDecoration it = blockDecoration1; int $i$a$-let-TerminalBlocksDecorator$2$blockRemoved$1 = 0;
/*  68 */             Disposer.dispose((Disposable)it.getTopInlay());
/*  69 */             Disposer.dispose((Disposable)it.getBottomInlay());
/*  70 */             if (it.getCommandToOutputInlay() != null) { Inlay<?> inlay = it.getCommandToOutputInlay();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 313 */               int $i$a$-let-TerminalBlocksDecorator$2$blockRemoved$1$1 = 0; Disposer.dispose((Disposable)inlay); } else { it.getCommandToOutputInlay(); }  if (it.getExitCodeInlay() != null) { Inlay<?> inlay = it.getExitCodeInlay(); int $i$a$-let-TerminalBlocksDecorator$2$blockRemoved$1$2 = 0; Disposer.dispose((Disposable)inlay); } else { it.getExitCodeInlay(); }  terminalBlocksDecorator.editor.getMarkupModel().removeHighlighter(it.getBackgroundHighlighter()); terminalBlocksDecorator.editor.getMarkupModel().removeHighlighter(it.getCornersHighlighter()); (BlockDecoration)TerminalBlocksDecorator.this.decorations.get(block); TerminalBlocksDecorator.this.decorations.remove(block); if ((CommandBlock)CollectionsKt.firstOrNull(TerminalBlocksDecorator.this.outputModel.getBlocks()) == null) { (CommandBlock)CollectionsKt.firstOrNull(TerminalBlocksDecorator.this.outputModel.getBlocks()); return; }  if ((BlockDecoration)TerminalBlocksDecorator.this.decorations.get(firstBlock) != null && ((BlockDecoration)TerminalBlocksDecorator.this.decorations.get(firstBlock)).getTopInlay() != null) { ((BlockDecoration)TerminalBlocksDecorator.this.decorations.get(firstBlock)).getTopInlay().update(); } else { ((BlockDecoration)TerminalBlocksDecorator.this.decorations.get(firstBlock)).getTopInlay(); }  } }null, 2, null); TerminalFocusModel.addListener$default(this.focusModel, new TerminalFocusModel.TerminalFocusListener() { public void promptFocused() { TerminalFocusModel.TerminalFocusListener.DefaultImpls.promptFocused(this); } public void activeStateChanged(boolean isActive) { EdtScheduler.Companion.getInstance().schedule(150, TerminalBlocksDecorator.this::activeStateChanged$lambda$0); } private static final void activeStateChanged$lambda$0(TerminalBlocksDecorator this$0) { if (!TerminalBlocksDecorator.this.editor.isDisposed()) TerminalBlocksDecorator.this.updateSelectionDecorationState(TerminalBlocksDecorator.this.selectionModel.getSelectedBlocks());  } }null, 2, null); } private final void updateCommandToOutputInlay(CommandBlock block) { if (!CommandBlockImplKt.getWithOutput(block)) { BlockDecoration decoration; if ((BlockDecoration)this.decorations.get(block) == null) { (BlockDecoration)this.decorations.get(block); return; }  if (decoration.getCommandToOutputInlay() != null) { Inlay<?> it = decoration.getCommandToOutputInlay(); int $i$a$-let-TerminalBlocksDecorator$updateCommandToOutputInlay$1 = 0;
/*     */         Disposer.dispose((Disposable)it); }
/*     */       else
/*     */       { decoration.getCommandToOutputInlay(); }
/*     */       
/*     */       this.decorations.put(block, BlockDecoration.copy$default(decoration, null, null, null, null, null, null, 47, null)); }
/*     */      }
/*     */ 
/*     */   
/*     */   public void blockCreated(@NotNull CommandBlock block) {
/*     */     TerminalOutputModelListener.DefaultImpls.blockCreated(this, block);
/*     */   }
/*     */   
/*     */   public void blockRemoved(@NotNull CommandBlock block) {
/*     */     TerminalOutputModelListener.DefaultImpls.blockRemoved(this, block);
/*     */   }
/*     */   
/*     */   public void blockFinalized(@NotNull CommandBlock block) {
/*     */     TerminalOutputModelListener.DefaultImpls.blockFinalized(this, block);
/*     */   }
/*     */   
/*     */   public void blockInfoUpdated(@NotNull CommandBlock block, @NotNull CommandBlockInfo newInfo) {
/*     */     TerminalOutputModelListener.DefaultImpls.blockInfoUpdated(this, block, newInfo);
/*     */   }
/*     */   
/*     */   @RequiresEdt
/*     */   public final void installDecoration(@NotNull CommandBlock block) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'block'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield decorations : Ljava/util/Map;
/*     */     //   10: aload_1
/*     */     //   11: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   16: ifnull -> 20
/*     */     //   19: return
/*     */     //   20: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalBlocksDecorator$EmptyWidthInlayRenderer
/*     */     //   23: dup
/*     */     //   24: aload_0
/*     */     //   25: aload_1
/*     */     //   26: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalBlocksDecorator;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;)Lkotlin/jvm/functions/Function0;
/*     */     //   31: invokespecial <init> : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   34: astore_2
/*     */     //   35: aload_0
/*     */     //   36: getfield editor : Lcom/intellij/openapi/editor/ex/EditorEx;
/*     */     //   39: invokeinterface getInlayModel : ()Lcom/intellij/openapi/editor/InlayModel;
/*     */     //   44: aload_1
/*     */     //   45: invokeinterface getStartOffset : ()I
/*     */     //   50: iconst_0
/*     */     //   51: iconst_1
/*     */     //   52: iconst_1
/*     */     //   53: aload_2
/*     */     //   54: checkcast com/intellij/openapi/editor/EditorCustomElementRenderer
/*     */     //   57: invokeinterface addBlockElement : (IZZILcom/intellij/openapi/editor/EditorCustomElementRenderer;)Lcom/intellij/openapi/editor/Inlay;
/*     */     //   62: dup
/*     */     //   63: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   66: astore_3
/*     */     //   67: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalBlocksDecorator$EmptyWidthInlayRenderer
/*     */     //   70: dup
/*     */     //   71: bipush #6
/*     */     //   73: invokespecial <init> : (I)V
/*     */     //   76: astore #4
/*     */     //   78: aload_0
/*     */     //   79: getfield editor : Lcom/intellij/openapi/editor/ex/EditorEx;
/*     */     //   82: invokeinterface getInlayModel : ()Lcom/intellij/openapi/editor/InlayModel;
/*     */     //   87: aload_1
/*     */     //   88: invokeinterface getEndOffset : ()I
/*     */     //   93: iconst_1
/*     */     //   94: iconst_0
/*     */     //   95: iconst_0
/*     */     //   96: aload #4
/*     */     //   98: checkcast com/intellij/openapi/editor/EditorCustomElementRenderer
/*     */     //   101: invokeinterface addBlockElement : (IZZILcom/intellij/openapi/editor/EditorCustomElementRenderer;)Lcom/intellij/openapi/editor/Inlay;
/*     */     //   106: dup
/*     */     //   107: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   110: astore #5
/*     */     //   112: aload_1
/*     */     //   113: invokestatic getWithCommand : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;)Z
/*     */     //   116: ifeq -> 164
/*     */     //   119: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalBlocksDecorator$EmptyWidthInlayRenderer
/*     */     //   122: dup
/*     */     //   123: iconst_2
/*     */     //   124: invokespecial <init> : (I)V
/*     */     //   127: astore #7
/*     */     //   129: aload_0
/*     */     //   130: getfield editor : Lcom/intellij/openapi/editor/ex/EditorEx;
/*     */     //   133: invokeinterface getInlayModel : ()Lcom/intellij/openapi/editor/InlayModel;
/*     */     //   138: aload_1
/*     */     //   139: invokeinterface getOutputStartOffset : ()I
/*     */     //   144: iconst_0
/*     */     //   145: iconst_0
/*     */     //   146: iconst_0
/*     */     //   147: aload #7
/*     */     //   149: checkcast com/intellij/openapi/editor/EditorCustomElementRenderer
/*     */     //   152: invokeinterface addBlockElement : (IZZILcom/intellij/openapi/editor/EditorCustomElementRenderer;)Lcom/intellij/openapi/editor/Inlay;
/*     */     //   157: dup
/*     */     //   158: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   161: goto -> 165
/*     */     //   164: aconst_null
/*     */     //   165: astore #6
/*     */     //   167: aload_0
/*     */     //   168: getfield editor : Lcom/intellij/openapi/editor/ex/EditorEx;
/*     */     //   171: invokeinterface getMarkupModel : ()Lcom/intellij/openapi/editor/ex/MarkupModelEx;
/*     */     //   176: aload_1
/*     */     //   177: invokeinterface getStartOffset : ()I
/*     */     //   182: aload_1
/*     */     //   183: invokeinterface getEndOffset : ()I
/*     */     //   188: sipush #6000
/*     */     //   191: aconst_null
/*     */     //   192: getstatic com/intellij/openapi/editor/markup/HighlighterTargetArea.LINES_IN_RANGE : Lcom/intellij/openapi/editor/markup/HighlighterTargetArea;
/*     */     //   195: invokeinterface addRangeHighlighter : (IIILcom/intellij/openapi/editor/markup/TextAttributes;Lcom/intellij/openapi/editor/markup/HighlighterTargetArea;)Lcom/intellij/openapi/editor/markup/RangeHighlighter;
/*     */     //   200: dup
/*     */     //   201: ldc 'addRangeHighlighter(...)'
/*     */     //   203: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   206: astore #7
/*     */     //   208: aload #7
/*     */     //   210: iconst_1
/*     */     //   211: invokeinterface setGreedyToRight : (Z)V
/*     */     //   216: aload_0
/*     */     //   217: getfield editor : Lcom/intellij/openapi/editor/ex/EditorEx;
/*     */     //   220: invokeinterface getMarkupModel : ()Lcom/intellij/openapi/editor/ex/MarkupModelEx;
/*     */     //   225: aload_1
/*     */     //   226: invokeinterface getStartOffset : ()I
/*     */     //   231: aload_1
/*     */     //   232: invokeinterface getEndOffset : ()I
/*     */     //   237: sipush #900
/*     */     //   240: aconst_null
/*     */     //   241: getstatic com/intellij/openapi/editor/markup/HighlighterTargetArea.LINES_IN_RANGE : Lcom/intellij/openapi/editor/markup/HighlighterTargetArea;
/*     */     //   244: invokeinterface addRangeHighlighter : (IIILcom/intellij/openapi/editor/markup/TextAttributes;Lcom/intellij/openapi/editor/markup/HighlighterTargetArea;)Lcom/intellij/openapi/editor/markup/RangeHighlighter;
/*     */     //   249: dup
/*     */     //   250: ldc 'addRangeHighlighter(...)'
/*     */     //   252: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   255: astore #8
/*     */     //   257: aload #8
/*     */     //   259: iconst_1
/*     */     //   260: invokeinterface setGreedyToRight : (Z)V
/*     */     //   265: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockDecoration
/*     */     //   268: dup
/*     */     //   269: aload #7
/*     */     //   271: aload #8
/*     */     //   273: aload_3
/*     */     //   274: aload #5
/*     */     //   276: aload #6
/*     */     //   278: aconst_null
/*     */     //   279: bipush #32
/*     */     //   281: aconst_null
/*     */     //   282: invokespecial <init> : (Lcom/intellij/openapi/editor/markup/RangeHighlighter;Lcom/intellij/openapi/editor/markup/RangeHighlighter;Lcom/intellij/openapi/editor/Inlay;Lcom/intellij/openapi/editor/Inlay;Lcom/intellij/openapi/editor/Inlay;Lcom/intellij/openapi/editor/Inlay;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   285: astore #9
/*     */     //   287: aload_0
/*     */     //   288: getfield decorations : Ljava/util/Map;
/*     */     //   291: aload_1
/*     */     //   292: aload #9
/*     */     //   294: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   299: pop
/*     */     //   300: aload_0
/*     */     //   301: aload_1
/*     */     //   302: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/DefaultBlockDecorationState
/*     */     //   305: dup
/*     */     //   306: invokespecial <init> : ()V
/*     */     //   309: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockDecorationState
/*     */     //   312: invokespecial setDecorationState : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockDecorationState;)V
/*     */     //   315: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #130	-> 6
/*     */     //   #131	-> 19
/*     */     //   #135	-> 20
/*     */     //   #139	-> 35
/*     */     //   #140	-> 67
/*     */     //   #141	-> 78
/*     */     //   #142	-> 112
/*     */     //   #143	-> 119
/*     */     //   #144	-> 129
/*     */     //   #146	-> 164
/*     */     //   #142	-> 165
/*     */     //   #148	-> 167
/*     */     //   #150	-> 188
/*     */     //   #151	-> 192
/*     */     //   #148	-> 195
/*     */     //   #152	-> 208
/*     */     //   #153	-> 216
/*     */     //   #155	-> 237
/*     */     //   #156	-> 241
/*     */     //   #153	-> 244
/*     */     //   #157	-> 257
/*     */     //   #159	-> 265
/*     */     //   #160	-> 287
/*     */     //   #161	-> 300
/*     */     //   #162	-> 315
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   129	32	7	renderer	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalBlocksDecorator$EmptyWidthInlayRenderer;
/*     */     //   35	281	2	topRenderer	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalBlocksDecorator$EmptyWidthInlayRenderer;
/*     */     //   67	249	3	topInlay	Lcom/intellij/openapi/editor/Inlay;
/*     */     //   78	238	4	bottomRenderer	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalBlocksDecorator$EmptyWidthInlayRenderer;
/*     */     //   112	204	5	bottomInlay	Lcom/intellij/openapi/editor/Inlay;
/*     */     //   167	149	6	commandToOutputInlay	Lcom/intellij/openapi/editor/Inlay;
/*     */     //   208	108	7	bgHighlighter	Lcom/intellij/openapi/editor/markup/RangeHighlighter;
/*     */     //   257	59	8	cornersHighlighter	Lcom/intellij/openapi/editor/markup/RangeHighlighter;
/*     */     //   287	29	9	decoration	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockDecoration;
/*     */     //   0	316	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalBlocksDecorator;
/*     */     //   0	316	1	block	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;
/*     */   }
/*     */   
/*     */   private static final int installDecoration$lambda$1(TerminalBlocksDecorator this$0, CommandBlock $block) {
/*     */     int additionalInset = (this$0.outputModel.getBlocks().get(0) == $block) ? 0 : 1;
/*     */     return 6 + additionalInset;
/*     */   }
/*     */   
/*     */   private final void updateDecorationState(CommandBlock block) {
/*     */     BlockDecorationState state = calculateDecorationState(block);
/*     */     setDecorationState(block, state);
/*     */   }
/*     */   
/*     */   private final void updateSelectionDecorationState(List selectedBlocks) {
/*     */     BlockDecorationState state = calculateSelectionDecorationState();
/*     */     BlockDecorationState errorState = calculateErrorSelectionDecorationState();
/*     */     for (CommandBlock block : selectedBlocks) {
/*     */       if (TerminalOutputModelKt.isErrorBlock(this.outputModel, block)) {
/*     */         setDecorationState(block, errorState);
/*     */         continue;
/*     */       } 
/*     */       setDecorationState(block, state);
/*     */     } 
/*     */   }
/*     */   
/*     */   private final void updateHoveredState(CommandBlock block) {
/*     */     HoveredBlockDecorationState state = TerminalOutputModelKt.isErrorBlock(this.outputModel, block) ? new HoveredErrorBlockDecorationState(this.hoveredGradientCache) : new HoveredBlockDecorationState(this.hoveredGradientCache);
/*     */     setDecorationState(block, state);
/*     */   }
/*     */   
/*     */   private final BlockDecorationState calculateDecorationState(CommandBlock block) {
/*     */     return this.selectionModel.getSelectedBlocks().contains(block) ? (TerminalOutputModelKt.isErrorBlock(this.outputModel, block) ? calculateErrorSelectionDecorationState() : calculateSelectionDecorationState()) : (TerminalOutputModelKt.isErrorBlock(this.outputModel, block) ? new ErrorBlockDecorationState() : new DefaultBlockDecorationState());
/*     */   }
/*     */   
/*     */   private final BlockDecorationState calculateSelectionDecorationState() {
/*     */     return this.focusModel.isActive() ? new SelectedBlockDecorationState() : new InactiveSelectedBlockDecorationState();
/*     */   }
/*     */   
/*     */   private final BlockDecorationState calculateErrorSelectionDecorationState() {
/*     */     return this.focusModel.isActive() ? new SelectedErrorBlockDecorationState() : new InactiveSelectedErrorBlockDecorationState();
/*     */   }
/*     */   
/*     */   private final void setDecorationState(CommandBlock block, BlockDecorationState state) {
/*     */     BlockDecoration decoration;
/*     */     if ((BlockDecoration)this.decorations.get(block) == null) {
/*     */       (BlockDecoration)this.decorations.get(block);
/*     */       throw new IllegalStateException("No decoration for block, installDecoration should be called first".toString());
/*     */     } 
/*     */     BlockDecoration $this$setDecorationState_u24lambda_u242 = decoration;
/*     */     int $i$a$-with-TerminalBlocksDecorator$setDecorationState$1 = 0;
/*     */     $this$setDecorationState_u24lambda_u242.getBackgroundHighlighter().setCustomRenderer(state.getBackgroundRenderer());
/*     */     $this$setDecorationState_u24lambda_u242.getCornersHighlighter().setCustomRenderer(state.getCornersRenderer());
/*     */     $this$setDecorationState_u24lambda_u242.getCornersHighlighter().setLineMarkerRenderer(state.getLeftAreaRenderer());
/*     */     Rectangle bounds = TerminalOutputModelKt.getBlockBounds(this.outputModel, block);
/*     */     this.editor.getComponent().repaint(bounds);
/*     */   }
/*     */   
/*     */   private final void addExitCodeInlay(CommandBlock block, int exitCode) {
/*     */     BlockDecoration decoration;
/*     */     if ((BlockDecoration)this.decorations.get(block) == null) {
/*     */       (BlockDecoration)this.decorations.get(block);
/*     */       throw new IllegalStateException("No decoration for block, installDecoration should be called first".toString());
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(JBFont.label().deriveFont(this.editor.getColorsScheme().getEditorFontSize2D()), "deriveFont(...)");
/*     */     ExitCodeRenderer renderer = new ExitCodeRenderer(exitCode, (Font)JBFont.label().deriveFont(this.editor.getColorsScheme().getEditorFontSize2D()), this.colorPalette);
/*     */     Inlay inlay = this.editor.getInlayModel().addAfterLineEndElement(block.getEndOffset(), false, renderer);
/*     */     this.decorations.put(block, BlockDecoration.copy$default(decoration, null, null, null, null, null, inlay, 31, null));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\002\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\024\020\017\032\0020\0032\n\020\020\032\006\022\002\b\0030\021H\026J,\020\022\032\0020\0232\n\020\020\032\006\022\002\b\0030\0212\006\020\024\032\0020\0252\006\020\026\032\0020\0272\006\020\030\032\0020\031H\026R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\n\032\0020\013X\004¢\006\002\n\000R\023\020\f\032\0070\r¢\006\002\b\016X\004¢\006\002\n\000¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalBlocksDecorator$ExitCodeRenderer;", "Lcom/intellij/openapi/editor/EditorCustomElementRenderer;", "exitCode", "", "font", "Ljava/awt/Font;", "colorPalette", "Lcom/intellij/terminal/TerminalColorPalette;", "<init>", "(ILjava/awt/Font;Lcom/intellij/terminal/TerminalColorPalette;)V", "text", "", "icon", "Ljavax/swing/Icon;", "Lorg/jetbrains/annotations/NotNull;", "calcWidthInPixels", "inlay", "Lcom/intellij/openapi/editor/Inlay;", "paint", "", "g", "Ljava/awt/Graphics;", "targetRegion", "Ljava/awt/Rectangle;", "textAttributes", "Lcom/intellij/openapi/editor/markup/TextAttributes;", "ej-core"})
/*     */   private static final class ExitCodeRenderer implements EditorCustomElementRenderer {
/*     */     @NotNull
/*     */     private final Font font;
/*     */     @NotNull
/*     */     private final TerminalColorPalette colorPalette;
/*     */     @NotNull
/*     */     private final String text;
/*     */     @NotNull
/*     */     private final Icon icon;
/*     */     
/*     */     public ExitCodeRenderer(int exitCode, @NotNull Font font, @NotNull TerminalColorPalette colorPalette) {
/*     */       this.font = font;
/*     */       this.colorPalette = colorPalette;
/*     */       this.text = "Exit code " + exitCode;
/*     */       Intrinsics.checkNotNullExpressionValue(AllIcons.General.Error, "Error");
/*     */       this.icon = AllIcons.General.Error;
/*     */     }
/*     */     
/*     */     public int calcWidthInPixels(@NotNull Inlay inlay) {
/*     */       Intrinsics.checkNotNullParameter(inlay, "inlay");
/*     */       FontMetrics fontMetrics = inlay.getEditor().getContentComponent().getFontMetrics(this.font);
/*     */       return fontMetrics.stringWidth(this.text) + JBUI.scale(4) + this.icon.getIconWidth();
/*     */     }
/*     */     
/*     */     public void paint(@NotNull Inlay inlay, @NotNull Graphics g, @NotNull Rectangle targetRegion, @NotNull TextAttributes textAttributes) {
/*     */       Intrinsics.checkNotNullParameter(inlay, "inlay");
/*     */       Intrinsics.checkNotNullParameter(g, "g");
/*     */       Intrinsics.checkNotNullParameter(targetRegion, "targetRegion");
/*     */       Intrinsics.checkNotNullParameter(textAttributes, "textAttributes");
/*     */       Graphics g2 = g.create();
/*     */       try {
/*     */         Intrinsics.checkNotNullExpressionValue(inlay.getEditor().getScrollingModel().getVisibleArea(), "getVisibleArea(...)");
/*     */         Rectangle visibleArea = inlay.getEditor().getScrollingModel().getVisibleArea();
/*     */         int textX = visibleArea.x + visibleArea.width - targetRegion.width - JBUI.scale(18);
/*     */         FontMetrics fontMetrics = g2.getFontMetrics(this.font);
/*     */         int baseLine = SimpleColoredComponent.getTextBaseLine(fontMetrics, targetRegion.height);
/*     */         g2.setFont(this.font);
/*     */         g2.setColor(TerminalUiUtils.INSTANCE.getAwtForegroundByIndex(this.colorPalette, 1));
/*     */         g2.drawString(this.text, textX, targetRegion.y + baseLine);
/*     */         int heightDiff = fontMetrics.getHeight() - this.icon.getIconHeight();
/*     */         int iconY = targetRegion.y + heightDiff / 2 + heightDiff % 2;
/*     */         int iconX = textX + targetRegion.width - this.icon.getIconWidth();
/*     */         this.icon.paintIcon(inlay.getEditor().getContentComponent(), g2, iconX, iconY);
/*     */       } finally {
/*     */         g2.dispose();
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\020\b\n\002\b\006\n\002\030\002\n\002\b\002\b\002\030\0002\0020\001B\025\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\004\b\005\020\006B\021\b\026\022\006\020\007\032\0020\004¢\006\004\b\005\020\bJ\024\020\t\032\0020\0042\n\020\n\032\006\022\002\b\0030\013H\026J\024\020\f\032\0020\0042\n\020\n\032\006\022\002\b\0030\013H\026R\024\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\002\n\000¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalBlocksDecorator$EmptyWidthInlayRenderer;", "Lcom/intellij/openapi/editor/EditorCustomElementRenderer;", "heightSupplier", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "height", "(I)V", "calcWidthInPixels", "inlay", "Lcom/intellij/openapi/editor/Inlay;", "calcHeightInPixels", "ej-core"})
/*     */   private static final class EmptyWidthInlayRenderer implements EditorCustomElementRenderer {
/*     */     @NotNull
/*     */     private final Function0<Integer> heightSupplier;
/*     */     
/*     */     public EmptyWidthInlayRenderer(@NotNull Function0<Integer> heightSupplier) {
/*     */       this.heightSupplier = heightSupplier;
/*     */     }
/*     */     
/*     */     public EmptyWidthInlayRenderer(int height) {
/*     */       this(height::_init_$lambda$0);
/*     */     }
/*     */     
/*     */     private static final int _init_$lambda$0(int $height) {
/*     */       return $height;
/*     */     }
/*     */     
/*     */     public int calcWidthInPixels(@NotNull Inlay inlay) {
/*     */       Intrinsics.checkNotNullParameter(inlay, "inlay");
/*     */       return 0;
/*     */     }
/*     */     
/*     */     public int calcHeightInPixels(@NotNull Inlay inlay) {
/*     */       Intrinsics.checkNotNullParameter(inlay, "inlay");
/*     */       return JBUI.scale(((Number)this.heightSupplier.invoke()).intValue());
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalBlocksDecorator$TerminalRightAreaRenderer;", "Lcom/intellij/openapi/editor/markup/CustomHighlighterRenderer;", "<init>", "()V", "paint", "", "editor", "Lcom/intellij/openapi/editor/Editor;", "highlighter", "Lcom/intellij/openapi/editor/markup/RangeHighlighter;", "g", "Ljava/awt/Graphics;", "ej-core"})
/*     */   private static final class TerminalRightAreaRenderer implements CustomHighlighterRenderer {
/*     */     public void paint(@NotNull Editor editor, @NotNull RangeHighlighter highlighter, @NotNull Graphics g) {
/*     */       Intrinsics.checkNotNullParameter(editor, "editor");
/*     */       Intrinsics.checkNotNullParameter(highlighter, "highlighter");
/*     */       Intrinsics.checkNotNullParameter(g, "g");
/*     */       Intrinsics.checkNotNullExpressionValue(editor.getScrollingModel().getVisibleArea(), "getVisibleArea(...)");
/*     */       Rectangle visibleArea = editor.getScrollingModel().getVisibleArea();
/*     */       int width = JBUI.scale(10);
/*     */       Color oldColor = g.getColor();
/*     */       try {
/*     */         g.setColor((Color)TerminalUi.INSTANCE.defaultBackground(editor));
/*     */         g.fillRect(visibleArea.width - width, visibleArea.y, width, visibleArea.height);
/*     */       } finally {
/*     */         g.setColor(oldColor);
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalBlocksDecorator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */