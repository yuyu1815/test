/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.HighlightingInfo;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.EditorFactory;
/*     */ import com.intellij.openapi.editor.Inlay;
/*     */ import com.intellij.openapi.editor.colors.EditorColorsScheme;
/*     */ import com.intellij.openapi.editor.ex.EditorEx;
/*     */ import com.intellij.openapi.editor.impl.DocumentImpl;
/*     */ import com.intellij.openapi.editor.impl.EditorImpl;
/*     */ import com.intellij.openapi.editor.markup.TextAttributes;
/*     */ import com.intellij.openapi.util.Disposer;
/*     */ import com.intellij.terminal.JBTerminalSystemSettingsProviderBase;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Rectangle;
/*     */ import java.util.List;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\002\b\004\b\000\030\0002\0020\001:\001\027B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J&\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0020\0212\f\020\022\032\b\022\004\022\0020\0240\023H\007J\036\020\025\032\0020\r2\006\020\020\032\0020\0212\f\020\022\032\b\022\004\022\0020\0240\023H\002J\b\020\026\032\0020\rH\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\024\020\n\032\b\022\002\b\003\030\0010\013X\016¢\006\002\n\000¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/RightPromptManager;", "Lcom/intellij/openapi/Disposable;", "promptEditor", "Lcom/intellij/openapi/editor/Editor;", "settings", "Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;", "<init>", "(Lcom/intellij/openapi/editor/Editor;Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;)V", "inlayEditor", "Lcom/intellij/openapi/editor/impl/EditorImpl;", "inlay", "Lcom/intellij/openapi/editor/Inlay;", "update", "", "commandStartOffset", "", "text", "", "highlightings", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo;", "updateInlayEditor", "dispose", "RightPromptRenderer", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nRightPromptManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RightPromptManager.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/RightPromptManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1#2:107\n*E\n"})
/*     */ public final class RightPromptManager implements Disposable {
/*     */   @NotNull
/*     */   private final Editor promptEditor;
/*     */   
/*     */   public RightPromptManager(@NotNull Editor promptEditor, @NotNull JBTerminalSystemSettingsProviderBase settings) {
/*  27 */     this.promptEditor = promptEditor;
/*     */ 
/*     */     
/*  30 */     Intrinsics.checkNotNull(EditorFactory.getInstance().createEditor((Document)new DocumentImpl("")), "null cannot be cast to non-null type com.intellij.openapi.editor.impl.EditorImpl"); this.inlayEditor = (EditorImpl)EditorFactory.getInstance().createEditor((Document)new DocumentImpl(""));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  35 */     this.inlayEditor.setViewer(true);
/*  36 */     this.inlayEditor.getSettings().setCaretRowShown(false);
/*  37 */     EditorColorsScheme editorColorsScheme1 = this.inlayEditor.getColorsScheme(), $this$_init__u24lambda_u240 = editorColorsScheme1; int $i$a$-apply-RightPromptManager$1 = 0;
/*  38 */     $this$_init__u24lambda_u240.setEditorFontName(settings.getTerminalFont().getFontName());
/*  39 */     $this$_init__u24lambda_u240.setEditorFontSize(settings.getTerminalFont().getSize());
/*  40 */     $this$_init__u24lambda_u240.setLineSpacing(1.0F);
/*     */   } @NotNull
/*     */   private final EditorImpl inlayEditor; @Nullable
/*     */   private Inlay<?> inlay;
/*     */   @RequiresEdt
/*     */   public final void update(int commandStartOffset, @NotNull String text, @NotNull List<HighlightingInfo> highlightings) {
/*  46 */     Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(highlightings, "highlightings"); updateInlayEditor(text, highlightings);
/*  47 */     if (this.inlay != null) { Inlay<?> it = this.inlay;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 107 */       int $i$a$-let-RightPromptManager$update$1 = 0; Disposer.dispose((Disposable)it); } else {  }  this.inlay = this.promptEditor.getInlayModel().addAfterLineEndElement(commandStartOffset, false, new RightPromptRenderer((Editor)this.inlayEditor)); } public void dispose() { EditorFactory.getInstance().releaseEditor((Editor)this.inlayEditor); if (this.inlay != null) { Inlay<?> it = this.inlay; int $i$a$-let-RightPromptManager$dispose$1 = 0;
/*     */       Disposer.dispose((Disposable)it); }
/*     */     else
/*     */     {  }
/*     */      }
/*     */ 
/*     */   
/*     */   private final void updateInlayEditor(String text, List highlightings) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: <illegal opcode> run : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/RightPromptManager;Ljava/lang/String;)Ljava/lang/Runnable;
/*     */     //   7: invokestatic writeInRunUndoTransparentAction : (Ljava/lang/Runnable;)V
/*     */     //   10: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModelImpl.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModelImpl$Companion;
/*     */     //   13: aload_0
/*     */     //   14: getfield inlayEditor : Lcom/intellij/openapi/editor/impl/EditorImpl;
/*     */     //   17: invokevirtual getMarkupModel : ()Lcom/intellij/openapi/editor/ex/MarkupModelEx;
/*     */     //   20: dup
/*     */     //   21: ldc 'getMarkupModel(...)'
/*     */     //   23: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   26: checkcast com/intellij/openapi/editor/markup/MarkupModel
/*     */     //   29: aload_2
/*     */     //   30: invokevirtual replaceHighlighters$ej_core : (Lcom/intellij/openapi/editor/markup/MarkupModel;Ljava/util/List;)V
/*     */     //   33: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #52	-> 0
/*     */     //   #55	-> 10
/*     */     //   #56	-> 33
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	34	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/RightPromptManager;
/*     */     //   0	34	1	text	Ljava/lang/String;
/*     */     //   0	34	2	highlightings	Ljava/util/List;
/*     */   }
/*     */   
/*     */   private static final void updateInlayEditor$lambda$2(RightPromptManager this$0, String $text) {
/*     */     this$0.inlayEditor.getDocument().setText($text);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\b\002\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\024\020\006\032\0020\0072\n\020\b\032\006\022\002\b\0030\tH\026J,\020\n\032\0020\0132\n\020\b\032\006\022\002\b\0030\t2\006\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0020\021H\026J0\020\022\032\0020\0132\006\020\f\032\0020\r2\006\020\023\032\0020\0072\006\020\024\032\0020\0072\006\020\025\032\0020\0072\006\020\026\032\0020\007H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/RightPromptManager$RightPromptRenderer;", "Lcom/intellij/openapi/editor/EditorCustomElementRenderer;", "inlayEditor", "Lcom/intellij/openapi/editor/Editor;", "<init>", "(Lcom/intellij/openapi/editor/Editor;)V", "calcWidthInPixels", "", "inlay", "Lcom/intellij/openapi/editor/Inlay;", "paint", "", "g", "Ljava/awt/Graphics;", "targetRegion", "Ljava/awt/Rectangle;", "textAttributes", "Lcom/intellij/openapi/editor/markup/TextAttributes;", "doPaint", "x", "y", "width", "height", "ej-core"})
/*     */   private static final class RightPromptRenderer implements EditorCustomElementRenderer {
/*     */     @NotNull
/*     */     private final Editor inlayEditor;
/*     */     
/*     */     public RightPromptRenderer(@NotNull Editor inlayEditor) {
/*     */       this.inlayEditor = inlayEditor;
/*     */     }
/*     */     
/*     */     public int calcWidthInPixels(@NotNull Inlay inlay) {
/*     */       Intrinsics.checkNotNullParameter(inlay, "inlay");
/*     */       return 1;
/*     */     }
/*     */     
/*     */     public void paint(@NotNull Inlay inlay, @NotNull Graphics g, @NotNull Rectangle targetRegion, @NotNull TextAttributes textAttributes) {
/*     */       Intrinsics.checkNotNullParameter(inlay, "inlay");
/*     */       Intrinsics.checkNotNullParameter(g, "g");
/*     */       Intrinsics.checkNotNullParameter(targetRegion, "targetRegion");
/*     */       Intrinsics.checkNotNullParameter(textAttributes, "textAttributes");
/*     */       Intrinsics.checkNotNull(inlay.getEditor(), "null cannot be cast to non-null type com.intellij.openapi.editor.ex.EditorEx");
/*     */       EditorEx promptEditor = (EditorEx)inlay.getEditor();
/*     */       double columnWidth = TerminalUiUtilsKt.getCharSize((Editor)promptEditor).getWidth();
/*     */       Intrinsics.checkNotNullExpressionValue(promptEditor.getScrollingModel().getVisibleArea(), "getVisibleArea(...)");
/*     */       Rectangle visibleArea = promptEditor.getScrollingModel().getVisibleArea();
/*     */       int scrollBarWidth = promptEditor.getScrollPane().getVerticalScrollBar().getWidth();
/*     */       int terminalColumns = (int)((visibleArea.width - scrollBarWidth) / columnWidth);
/*     */       int textColumns = this.inlayEditor.getDocument().getTextLength();
/*     */       double textWidth = textColumns * columnWidth;
/*     */       double textX = terminalColumns * columnWidth - textWidth;
/*     */       int promptLine = (promptEditor.offsetToLogicalPosition(inlay.getOffset())).line;
/*     */       int lineStartOffset = promptEditor.getDocument().getLineStartOffset(promptLine);
/*     */       int lineEndOffset = promptEditor.getDocument().getLineEndOffset(promptLine);
/*     */       if (lineEndOffset - lineStartOffset < terminalColumns - textColumns) {
/*     */         Graphics g2 = g.create();
/*     */         try {
/*     */           Intrinsics.checkNotNull(g2);
/*     */           doPaint(g2, (int)textX, targetRegion.y, (int)Math.ceil(textWidth), promptEditor.getLineHeight());
/*     */         } finally {
/*     */           g2.dispose();
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*     */     private final void doPaint(Graphics g, int x, int y, int width, int height) {
/*     */       g.translate(x, y);
/*     */       g.clipRect(0, 0, width, height);
/*     */       this.inlayEditor.getContentComponent().paint(g);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\RightPromptManager.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */