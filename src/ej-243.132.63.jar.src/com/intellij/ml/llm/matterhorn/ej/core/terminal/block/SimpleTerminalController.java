/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.HighlightingInfo;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.TerminalCaretPainter;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.TerminalOutputModel;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.TerminalSelectionModel;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.TextAttributesProvider;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.TextWithHighlightings;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.BlockTerminalSession;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.TerminalModel;
/*     */ import com.intellij.openapi.actionSystem.DataKey;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.editor.ex.EditorEx;
/*     */ import com.intellij.terminal.JBTerminalSystemSettingsProviderBase;
/*     */ import com.jediterm.terminal.TextStyle;
/*     */ import com.jediterm.terminal.model.CharBuffer;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000j\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\b\000\030\000 +2\0020\001:\001+B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\b\020\037\032\0020 H\007J\b\020!\032\0020 H\002J\b\020\"\032\0020 H\002J\b\020#\032\0020$H\002J\020\020%\032\0020 2\006\020&\032\0020$H\002J\f\020'\032\0020(*\0020)H\002J\b\020*\032\0020 H\026R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\021\020\n\032\0020\0138F¢\006\006\032\004\b\f\020\rR\024\020\016\032\0020\0178BX\004¢\006\006\032\004\b\020\020\021R\016\020\022\032\0020\023X\004¢\006\002\n\000R\016\020\024\032\0020\025X\004¢\006\002\n\000R\016\020\026\032\0020\027X\004¢\006\002\n\000R\016\020\030\032\0020\031X\004¢\006\002\n\000R\032\020\032\032\0020\033X\016¢\006\016\n\000\032\004\b\032\020\034\"\004\b\035\020\036¨\006,"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalController;", "Lcom/intellij/openapi/Disposable;", "settings", "Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;", "session", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "editor", "Lcom/intellij/openapi/editor/ex/EditorEx;", "<init>", "(Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;Lcom/intellij/openapi/editor/ex/EditorEx;)V", "document", "Lcom/intellij/openapi/editor/Document;", "getDocument", "()Lcom/intellij/openapi/editor/Document;", "terminalModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel;", "getTerminalModel", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel;", "outputModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;", "selectionModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel;", "caretModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretModel;", "caretPainter", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretPainter;", "isFocused", "", "()Z", "setFocused", "(Z)V", "clearTextSelection", "", "setupContentListener", "updateEditorContent", "computeTerminalContent", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithHighlightings;", "updateEditor", "content", "toTextAttributesProvider", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;", "Lcom/jediterm/terminal/TextStyle;", "dispose", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nSimpleTerminalController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleTerminalController.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalController\n+ 2 TerminalModel.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel\n*L\n1#1,147:1\n156#2,7:148\n*S KotlinDebug\n*F\n+ 1 SimpleTerminalController.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalController\n*L\n55#1:148,7\n*E\n"})
/*     */ public final class SimpleTerminalController implements Disposable {
/*     */   public SimpleTerminalController(@NotNull JBTerminalSystemSettingsProviderBase settings, @NotNull BlockTerminalSession session, @NotNull EditorEx editor) {
/*  27 */     this.session = session;
/*  28 */     this.editor = editor;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  35 */     this.outputModel = (TerminalOutputModel)new TerminalOutputModelImpl(this.editor);
/*  36 */     this.selectionModel = new TerminalSelectionModel(this.outputModel);
/*  37 */     this.caretModel = new TerminalCaretModel(this.session, this.outputModel, this.editor, this);
/*  38 */     this.caretPainter = new TerminalCaretPainter(this.caretModel, this.outputModel, this.selectionModel, this.editor);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  43 */     this.editor.putUserData(TerminalDataContextUtils.INSTANCE.getIS_ALTERNATE_BUFFER_EDITOR_KEY$ej_core(), Boolean.valueOf(true));
/*  44 */     Disposer.register(this, (Disposable)this.caretPainter);
/*     */ 
/*     */     
/*  47 */     this.outputModel.createBlock(null, null, this.session.getModel().getWidth());
/*  48 */     getTerminalModel().setCommandRunning(true);
/*     */     
/*  50 */     setupContentListener();
/*  51 */     SimpleTerminalEventsHandler eventsHandler = new SimpleTerminalEventsHandler(this.session, settings, this.outputModel);
/*  52 */     TerminalEventDispatcherKt.setupKeyEventDispatcher(this.editor, eventsHandler, this);
/*  53 */     TerminalEventDispatcherKt.setupMouseListener(this.editor, settings, getTerminalModel(), eventsHandler, this);
/*  54 */     (new TerminalOutputEditorInputMethodSupport(this.editor, this.session, this.caretModel)).install(this);
/*  55 */     TerminalModel this_$iv = getTerminalModel(); int $i$f$withContentLock = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 148 */     this_$iv.lockContent();
/*     */     
/* 150 */     try { int $i$a$-withContentLock-SimpleTerminalController$1 = 0; updateEditorContent(); Unit unit = Unit.INSTANCE;
/*     */ 
/*     */       
/* 153 */       this_$iv.unlockContent(); } finally { this_$iv.unlockContent(); }
/*     */   
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Document getDocument() {
/*     */     Intrinsics.checkNotNullExpressionValue(this.editor.getDocument(), "getDocument(...)");
/*     */     return (Document)this.editor.getDocument();
/*     */   }
/*     */   
/*     */   private final TerminalModel getTerminalModel() {
/*     */     return this.session.getModel();
/*     */   }
/*     */   
/*     */   public final boolean isFocused() {
/*     */     return this.isFocused;
/*     */   }
/*     */   
/*     */   public final void setFocused(boolean <set-?>) {
/*     */     this.isFocused = <set-?>;
/*     */   }
/*     */   
/*     */   @RequiresEdt
/*     */   public final void clearTextSelection() {
/*     */     this.editor.getSelectionModel().removeSelection();
/*     */   }
/*     */   
/*     */   private final void setupContentListener() {
/*     */     getTerminalModel().addContentListener(new SimpleTerminalController$setupContentListener$1(), this);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalController$setupContentListener$1", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$ContentListener;", "onContentChanged", "", "ej-core"})
/*     */   public static final class SimpleTerminalController$setupContentListener$1 implements TerminalModel.ContentListener {
/*     */     public void onContentChanged() {
/*     */       SimpleTerminalController.this.updateEditorContent();
/*     */     }
/*     */   }
/*     */   
/*     */   private final void updateEditorContent() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokespecial computeTerminalContent : ()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithHighlightings;
/*     */     //   4: astore_1
/*     */     //   5: aload_0
/*     */     //   6: getfield editor : Lcom/intellij/openapi/editor/ex/EditorEx;
/*     */     //   9: checkcast com/intellij/openapi/editor/Editor
/*     */     //   12: invokestatic getDisposed : (Lcom/intellij/openapi/editor/Editor;)Lkotlin/jvm/functions/Function0;
/*     */     //   15: invokestatic any : ()Lcom/intellij/openapi/application/ModalityState;
/*     */     //   18: dup
/*     */     //   19: ldc 'any(...)'
/*     */     //   21: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   24: aload_0
/*     */     //   25: aload_1
/*     */     //   26: <illegal opcode> run : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalController;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithHighlightings;)Ljava/lang/Runnable;
/*     */     //   31: invokestatic invokeLater : (Lkotlin/jvm/functions/Function0;Lcom/intellij/openapi/application/ModalityState;Ljava/lang/Runnable;)V
/*     */     //   34: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #74	-> 0
/*     */     //   #75	-> 5
/*     */     //   #78	-> 34
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   5	30	1	content	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithHighlightings;
/*     */     //   0	35	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalController;
/*     */   }
/*     */   
/*     */   private static final void updateEditorContent$lambda$1(SimpleTerminalController this$0, TextWithHighlightings $content) {
/*     */     this$0.updateEditor($content);
/*     */   }
/*     */   
/*     */   private final TextWithHighlightings computeTerminalContent() {
/*     */     StringBuilder builder = new StringBuilder();
/*     */     List<HighlightingInfo> highlightings = new ArrayList();
/*     */     SimpleTerminalController$computeTerminalContent$consumer$1 consumer = new SimpleTerminalController$computeTerminalContent$consumer$1(highlightings, this);
/*     */     if (getTerminalModel().getUseAlternateBuffer()) {
/*     */       getTerminalModel().processScreenLines(0, getTerminalModel().getScreenLinesCount(), consumer);
/*     */     } else {
/*     */       getTerminalModel().processHistoryAndScreenLines(-getTerminalModel().getHistoryLinesCount(), getTerminalModel().getHistoryLinesCount() + getTerminalModel().getCursorY(), consumer);
/*     */     } 
/*     */     while (true) {
/*     */       byte b = 10;
/*     */       if (StringsKt.lastOrNull(builder) == null) {
/*     */         StringsKt.lastOrNull(builder);
/*     */         break;
/*     */       } 
/*     */       if (StringsKt.lastOrNull(builder).charValue() == b) {
/*     */         builder.deleteCharAt(StringsKt.getLastIndex(builder));
/*     */         highlightings.removeLast();
/*     */         continue;
/*     */       } 
/*     */       break;
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(builder.toString(), "toString(...)");
/*     */     return new TextWithHighlightings(builder.toString(), highlightings);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005*\001\000\b\n\030\0002\0020\001J0\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0052\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\005H\026J8\020\f\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0052\006\020\r\032\0020\0052\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\005H\026J(\020\016\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0052\006\020\r\032\0020\0052\006\020\013\032\0020\005H\026¨\006\017"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalController$computeTerminalContent$consumer$1", "Lcom/jediterm/terminal/StyledTextConsumer;", "consume", "", "x", "", "y", "style", "Lcom/jediterm/terminal/TextStyle;", "characters", "Lcom/jediterm/terminal/model/CharBuffer;", "startRow", "consumeNul", "nulIndex", "consumeQueue", "ej-core"})
/*     */   public static final class SimpleTerminalController$computeTerminalContent$consumer$1 implements StyledTextConsumer {
/*     */     SimpleTerminalController$computeTerminalContent$consumer$1(List<HighlightingInfo> $highlightings, SimpleTerminalController $receiver) {}
/*     */     
/*     */     public void consume(int x, int y, TextStyle style, CharBuffer characters, int startRow) {
/*     */       Intrinsics.checkNotNullParameter(style, "style");
/*     */       Intrinsics.checkNotNullParameter(characters, "characters");
/*     */       int startOffset = this.$builder.length();
/*     */       this.$builder.append(characters.toString());
/*     */       this.$highlightings.add(new HighlightingInfo(startOffset, this.$builder.length(), SimpleTerminalController.this.toTextAttributesProvider(style)));
/*     */     }
/*     */     
/*     */     public void consumeNul(int x, int y, int nulIndex, TextStyle style, CharBuffer characters, int startRow) {
/*     */       // Byte code:
/*     */       //   0: aload #4
/*     */       //   2: ldc 'style'
/*     */       //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   7: aload #5
/*     */       //   9: ldc 'characters'
/*     */       //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   14: aload_0
/*     */       //   15: getfield $builder : Ljava/lang/StringBuilder;
/*     */       //   18: invokevirtual length : ()I
/*     */       //   21: istore #7
/*     */       //   23: aload #5
/*     */       //   25: invokevirtual getBuf : ()[C
/*     */       //   28: arraylength
/*     */       //   29: istore #8
/*     */       //   31: aload_0
/*     */       //   32: getfield $builder : Ljava/lang/StringBuilder;
/*     */       //   35: astore #9
/*     */       //   37: iconst_0
/*     */       //   38: istore #10
/*     */       //   40: iload #10
/*     */       //   42: iload #8
/*     */       //   44: if_icmpge -> 69
/*     */       //   47: iload #10
/*     */       //   49: istore #11
/*     */       //   51: iconst_0
/*     */       //   52: istore #12
/*     */       //   54: aload #9
/*     */       //   56: bipush #32
/*     */       //   58: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */       //   61: pop
/*     */       //   62: nop
/*     */       //   63: iinc #10, 1
/*     */       //   66: goto -> 40
/*     */       //   69: aload_0
/*     */       //   70: getfield $highlightings : Ljava/util/List;
/*     */       //   73: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo
/*     */       //   76: dup
/*     */       //   77: iload #7
/*     */       //   79: aload_0
/*     */       //   80: getfield $builder : Ljava/lang/StringBuilder;
/*     */       //   83: invokevirtual length : ()I
/*     */       //   86: aload_0
/*     */       //   87: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalController;
/*     */       //   90: getstatic com/jediterm/terminal/TextStyle.EMPTY : Lcom/jediterm/terminal/TextStyle;
/*     */       //   93: dup
/*     */       //   94: ldc 'EMPTY'
/*     */       //   96: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   99: invokestatic access$toTextAttributesProvider : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalController;Lcom/jediterm/terminal/TextStyle;)Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;
/*     */       //   102: invokespecial <init> : (IILcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;)V
/*     */       //   105: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   110: pop
/*     */       //   111: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #100	-> 14
/*     */       //   #101	-> 23
/*     */       //   #102	-> 54
/*     */       //   #103	-> 62
/*     */       //   #101	-> 63
/*     */       //   #104	-> 69
/*     */       //   #105	-> 111
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   54	9	12	$i$a$-repeat-SimpleTerminalController$computeTerminalContent$consumer$1$consumeNul$1	I
/*     */       //   51	12	11	it	I
/*     */       //   23	89	7	startOffset	I
/*     */       //   0	112	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalController$computeTerminalContent$consumer$1;
/*     */       //   0	112	1	x	I
/*     */       //   0	112	2	y	I
/*     */       //   0	112	3	nulIndex	I
/*     */       //   0	112	4	style	Lcom/jediterm/terminal/TextStyle;
/*     */       //   0	112	5	characters	Lcom/jediterm/terminal/model/CharBuffer;
/*     */       //   0	112	6	startRow	I
/*     */     }
/*     */     
/*     */     public void consumeQueue(int x, int y, int nulIndex, int startRow) {
/*     */       this.$builder.append("\n");
/*     */       Intrinsics.checkNotNullExpressionValue(TextStyle.EMPTY, "EMPTY");
/*     */       this.$highlightings.add(new HighlightingInfo(this.$builder.length() - 1, this.$builder.length(), SimpleTerminalController.this.toTextAttributesProvider(TextStyle.EMPTY)));
/*     */     }
/*     */   }
/*     */   
/*     */   private final void updateEditor(TextWithHighlightings content) {
/*     */     getDocument().setText(content.getText());
/*     */     Intrinsics.checkNotNullExpressionValue(this.editor.getDocument(), "getDocument(...)");
/*     */     this.editor.setHighlighter((EditorHighlighter)new TerminalTextHighlighter(new TerminalOutputHighlightingsSnapshot((Document)this.editor.getDocument(), content.getHighlightings())));
/*     */     int line = getTerminalModel().getHistoryLinesCount() + getTerminalModel().getCursorY() - 1;
/*     */     this.editor.getCaretModel().moveToLogicalPosition(new LogicalPosition(line, getTerminalModel().getCursorX()));
/*     */     this.editor.getScrollingModel().scrollToCaret(ScrollType.CENTER_DOWN);
/*     */     this.caretPainter.repaint();
/*     */   }
/*     */   
/*     */   private final TextAttributesProvider toTextAttributesProvider(TextStyle $this$toTextAttributesProvider) {
/*     */     return (TextAttributesProvider)new TextStyleAdapter($this$toTextAttributesProvider, this.session.getColorPalette());
/*     */   }
/*     */   
/*     */   public void dispose() {}
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalController$Companion;", "", "<init>", "()V", "KEY", "Lcom/intellij/openapi/actionSystem/DataKey;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/SimpleTerminalController;", "getKEY", "()Lcom/intellij/openapi/actionSystem/DataKey;", "ej-core"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final DataKey<SimpleTerminalController> getKEY() {
/*     */       return SimpleTerminalController.KEY;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final BlockTerminalSession session;
/*     */   @NotNull
/*     */   private final EditorEx editor;
/*     */   @NotNull
/*     */   private final TerminalOutputModel outputModel;
/*     */   @NotNull
/*     */   private final TerminalSelectionModel selectionModel;
/*     */   @NotNull
/*     */   private final TerminalCaretModel caretModel;
/*     */   @NotNull
/*     */   private final TerminalCaretPainter caretPainter;
/*     */   private boolean isFocused;
/*     */   @NotNull
/*     */   private static final DataKey<SimpleTerminalController> KEY = DataKey.Companion.create("Junie.SimpleTerminalController");
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\SimpleTerminalController.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */