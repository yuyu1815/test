/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.LogicalPosition;
/*     */ import com.intellij.openapi.editor.colors.EditorColors;
/*     */ import com.intellij.openapi.editor.ex.EditorEx;
/*     */ import com.intellij.openapi.editor.ex.FocusChangeListener;
/*     */ import com.intellij.openapi.editor.impl.EditorImpl;
/*     */ import com.intellij.openapi.editor.markup.RangeHighlighter;
/*     */ import com.intellij.openapi.util.Disposer;
/*     */ import com.intellij.ui.Gray;
/*     */ import com.intellij.ui.JBColor;
/*     */ import com.intellij.util.concurrency.EdtExecutorService;
/*     */ import com.intellij.util.concurrency.annotations.RequiresEdt;
/*     */ import java.awt.Color;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.geom.Point2D;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000~\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\b\000\030\000 12\0020\0012\0020\0022\0020\0032\0020\004:\00201B'\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n\022\006\020\013\032\0020\f¢\006\004\b\r\020\016J\b\020\033\032\0020\034H\026J\b\020\035\032\0020\034H\007J\020\020\036\032\0020\0342\006\020\037\032\0020 H\026J\020\020!\032\0020\0342\006\020\013\032\0020\"H\026J\020\020#\032\0020\0342\006\020\013\032\0020\"H\026J$\020$\032\0020\0342\f\020%\032\b\022\004\022\0020'0&2\f\020(\032\b\022\004\022\0020'0&H\026J\020\020)\032\0020\0342\006\020\037\032\0020 H\002J\020\020*\032\0020\0342\006\020+\032\0020,H\002J\b\020-\032\0020\034H\002J\b\020.\032\0020/H\002R\016\020\005\032\0020\006X\004¢\006\002\n\000R\016\020\007\032\0020\bX\004¢\006\002\n\000R\016\020\013\032\0020\fX\004¢\006\002\n\000R\020\020\017\032\004\030\0010\020X\016¢\006\002\n\000R\024\020\021\032\b\030\0010\022R\0020\000X\016¢\006\002\n\000R\016\020\023\032\0020\024X\016¢\006\002\n\000R\016\020\025\032\0020\024X\016¢\006\002\n\000R\016\020\026\032\0020\024X\016¢\006\002\n\000R\024\020\027\032\0020\0308BX\004¢\006\006\032\004\b\031\020\032¨\0062"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretPainter;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretModel$CaretListener;", "Lcom/intellij/openapi/editor/ex/FocusChangeListener;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel$TerminalSelectionListener;", "Lcom/intellij/openapi/Disposable;", "caretModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretModel;", "outputModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;", "selectionModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel;", "editor", "Lcom/intellij/openapi/editor/ex/EditorEx;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretModel;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel;Lcom/intellij/openapi/editor/ex/EditorEx;)V", "caretHighlighter", "Lcom/intellij/openapi/editor/markup/RangeHighlighter;", "caretUpdater", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretPainter$BlinkingCaretUpdater;", "isFocused", "", "isBlockActive", "isDisposed", "caretColor", "Ljava/awt/Color;", "getCaretColor", "()Ljava/awt/Color;", "dispose", "", "repaint", "caretStateChanged", "state", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretModel$CaretState;", "focusGained", "Lcom/intellij/openapi/editor/Editor;", "focusLost", "selectionChanged", "oldSelection", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;", "newSelection", "updateCaretHighlighter", "installCaretHighlighter", "newPosition", "Lcom/intellij/openapi/editor/LogicalPosition;", "removeHighlighter", "calculateCaretHeight", "", "BlinkingCaretUpdater", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nTerminalCaretPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalCaretPainter.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretPainter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n1#2:185\n*E\n"})
/*     */ public final class TerminalCaretPainter implements TerminalCaretModel.CaretListener, FocusChangeListener, TerminalSelectionModel.TerminalSelectionListener, Disposable {
/*  34 */   public TerminalCaretPainter(@NotNull TerminalCaretModel caretModel, @NotNull TerminalOutputModel outputModel, @NotNull TerminalSelectionModel selectionModel, @NotNull EditorEx editor) { this.caretModel = caretModel;
/*  35 */     this.outputModel = outputModel;
/*     */     
/*  37 */     this.editor = editor;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  42 */     this.isBlockActive = true;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  51 */     this.caretModel.addListener(this, this);
/*  52 */     selectionModel.addListener(this, this);
/*  53 */     this.editor.addFocusListener(this, this); }
/*     */   
/*     */   public void hoverChanged(@Nullable CommandBlock oldHovered, @Nullable CommandBlock newHovered) {
/*     */     TerminalSelectionModel.TerminalSelectionListener.DefaultImpls.hoverChanged(this, oldHovered, newHovered);
/*  57 */   } public void dispose() { this.isDisposed = true;
/*  58 */     ActionsKt.runInEdt$default(null, this::dispose$lambda$0, 1, null); }
/*  59 */   private final Color getCaretColor() { if (this.editor.getColorsScheme().getColor(EditorColors.CARET_COLOR) == null) this.editor.getColorsScheme().getColor(EditorColors.CARET_COLOR);  return (Color)new JBColor(CARET_DARK, CARET_LIGHT); } private static final Unit dispose$lambda$0(TerminalCaretPainter this$0) { this$0.updateCaretHighlighter(new TerminalCaretModel.CaretState(null, false, 2, null));
/*  60 */     return Unit.INSTANCE; }
/*     */ 
/*     */   
/*     */   @RequiresEdt
/*     */   public final void repaint() {
/*  65 */     updateCaretHighlighter(this.caretModel.getState());
/*     */   }
/*     */   
/*     */   public void caretStateChanged(@NotNull TerminalCaretModel.CaretState state) {
/*  69 */     Intrinsics.checkNotNullParameter(state, "state"); updateCaretHighlighter(state);
/*     */   }
/*     */   
/*     */   public void focusGained(@NotNull Editor editor) {
/*  73 */     Intrinsics.checkNotNullParameter(editor, "editor"); this.isFocused = true;
/*  74 */     repaint();
/*     */   }
/*     */   
/*     */   public void focusLost(@NotNull Editor editor) {
/*  78 */     Intrinsics.checkNotNullParameter(editor, "editor"); this.isFocused = false;
/*  79 */     updateCaretHighlighter(new TerminalCaretModel.CaretState(null, false, 2, null));
/*     */   }
/*     */   
/*     */   public void selectionChanged(@NotNull List oldSelection, @NotNull List newSelection) {
/*  83 */     Intrinsics.checkNotNullParameter(oldSelection, "oldSelection"); Intrinsics.checkNotNullParameter(newSelection, "newSelection"); this.isBlockActive = (newSelection.isEmpty() || Intrinsics.areEqual(CollectionsKt.singleOrNull(newSelection), TerminalOutputModelKt.getActiveBlock(this.outputModel)));
/*  84 */     if (this.isBlockActive) {
/*  85 */       repaint();
/*     */     } else {
/*  87 */       updateCaretHighlighter(new TerminalCaretModel.CaretState(null, false, 2, null));
/*     */     } 
/*     */   }
/*     */   private final void updateCaretHighlighter(TerminalCaretModel.CaretState state) {
/*  91 */     removeHighlighter();
/*  92 */     if (this.caretUpdater != null) { BlinkingCaretUpdater it = this.caretUpdater;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 185 */       int $i$a$-let-TerminalCaretPainter$updateCaretHighlighter$1 = 0;
/*     */       Disposer.dispose(it); }
/*     */     else
/*     */     {  }
/*     */     
/*     */     this.caretUpdater = null;
/*     */     if (state.getPosition() != null && this.isFocused && this.isBlockActive) {
/*     */       installCaretHighlighter(state.getPosition());
/*     */       if (state.isBlinking()) {
/*     */         this.caretUpdater = new BlinkingCaretUpdater(state.getPosition());
/*     */         Intrinsics.checkNotNull(this.caretUpdater);
/*     */         Disposer.register(this, this.caretUpdater);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private final void installCaretHighlighter(LogicalPosition newPosition) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield editor : Lcom/intellij/openapi/editor/ex/EditorEx;
/*     */     //   4: aload_1
/*     */     //   5: invokeinterface logicalPositionToOffset : (Lcom/intellij/openapi/editor/LogicalPosition;)I
/*     */     //   10: istore_2
/*     */     //   11: aload_0
/*     */     //   12: invokespecial getCaretColor : ()Ljava/awt/Color;
/*     */     //   15: invokestatic isDark : (Ljava/awt/Color;)Z
/*     */     //   18: ifeq -> 27
/*     */     //   21: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretPainter.CARET_LIGHT : Ljava/awt/Color;
/*     */     //   24: goto -> 30
/*     */     //   27: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretPainter.CARET_DARK : Ljava/awt/Color;
/*     */     //   30: astore_3
/*     */     //   31: new com/intellij/openapi/editor/markup/TextAttributes
/*     */     //   34: dup
/*     */     //   35: aload_3
/*     */     //   36: aconst_null
/*     */     //   37: aconst_null
/*     */     //   38: aconst_null
/*     */     //   39: iconst_0
/*     */     //   40: invokespecial <init> : (Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Lcom/intellij/openapi/editor/markup/EffectType;I)V
/*     */     //   43: astore #4
/*     */     //   45: iload_2
/*     */     //   46: iconst_1
/*     */     //   47: iadd
/*     */     //   48: aload_0
/*     */     //   49: getfield editor : Lcom/intellij/openapi/editor/ex/EditorEx;
/*     */     //   52: invokeinterface getDocument : ()Lcom/intellij/openapi/editor/ex/DocumentEx;
/*     */     //   57: invokeinterface getTextLength : ()I
/*     */     //   62: if_icmpge -> 71
/*     */     //   65: iload_2
/*     */     //   66: iconst_1
/*     */     //   67: iadd
/*     */     //   68: goto -> 72
/*     */     //   71: iload_2
/*     */     //   72: istore #5
/*     */     //   74: aload_0
/*     */     //   75: getfield editor : Lcom/intellij/openapi/editor/ex/EditorEx;
/*     */     //   78: invokeinterface getMarkupModel : ()Lcom/intellij/openapi/editor/ex/MarkupModelEx;
/*     */     //   83: iload_2
/*     */     //   84: iload #5
/*     */     //   86: sipush #6000
/*     */     //   89: aload #4
/*     */     //   91: getstatic com/intellij/openapi/editor/markup/HighlighterTargetArea.EXACT_RANGE : Lcom/intellij/openapi/editor/markup/HighlighterTargetArea;
/*     */     //   94: invokeinterface addRangeHighlighter : (IIILcom/intellij/openapi/editor/markup/TextAttributes;Lcom/intellij/openapi/editor/markup/HighlighterTargetArea;)Lcom/intellij/openapi/editor/markup/RangeHighlighter;
/*     */     //   99: dup
/*     */     //   100: ldc_w 'addRangeHighlighter(...)'
/*     */     //   103: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   106: astore #6
/*     */     //   108: aload #6
/*     */     //   110: aload #6
/*     */     //   112: aload_0
/*     */     //   113: <illegal opcode> paint : (Lcom/intellij/openapi/editor/markup/RangeHighlighter;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretPainter;)Lcom/intellij/openapi/editor/markup/CustomHighlighterRenderer;
/*     */     //   118: invokeinterface setCustomRenderer : (Lcom/intellij/openapi/editor/markup/CustomHighlighterRenderer;)V
/*     */     //   123: aload_0
/*     */     //   124: aload #6
/*     */     //   126: putfield caretHighlighter : Lcom/intellij/openapi/editor/markup/RangeHighlighter;
/*     */     //   129: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #104	-> 0
/*     */     //   #105	-> 11
/*     */     //   #106	-> 31
/*     */     //   #107	-> 45
/*     */     //   #108	-> 74
/*     */     //   #109	-> 89
/*     */     //   #108	-> 94
/*     */     //   #110	-> 108
/*     */     //   #127	-> 123
/*     */     //   #128	-> 129
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   11	119	2	newOffset	I
/*     */     //   31	99	3	caretForeground	Ljava/awt/Color;
/*     */     //   45	85	4	attributes	Lcom/intellij/openapi/editor/markup/TextAttributes;
/*     */     //   74	56	5	endOffset	I
/*     */     //   108	22	6	highlighter	Lcom/intellij/openapi/editor/markup/RangeHighlighter;
/*     */     //   0	130	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretPainter;
/*     */     //   0	130	1	newPosition	Lcom/intellij/openapi/editor/LogicalPosition;
/*     */   }
/*     */   
/*     */   private static final void installCaretHighlighter$lambda$2(RangeHighlighter $highlighter, TerminalCaretPainter this$0, Editor paramEditor, RangeHighlighter paramRangeHighlighter1, Graphics g) {
/*     */     Intrinsics.checkNotNullParameter(paramEditor, "<unused var>");
/*     */     Intrinsics.checkNotNullParameter(paramRangeHighlighter1, "<unused var>");
/*     */     Intrinsics.checkNotNullParameter(g, "g");
/*     */     int offset = $highlighter.getStartOffset();
/*     */     Intrinsics.checkNotNullExpressionValue(this$0.editor.offsetToPoint2D(offset), "offsetToPoint2D(...)");
/*     */     Point2D point = this$0.editor.offsetToPoint2D(offset);
/*     */     int caretHeight = this$0.calculateCaretHeight();
/*     */     int caretInset = (this$0.editor.getLineHeight() - caretHeight) / 2;
/*     */     Intrinsics.checkNotNull(this$0.editor, "null cannot be cast to non-null type com.intellij.openapi.editor.impl.EditorImpl");
/*     */     Rectangle2D.Double rect = new Rectangle2D.Double(point.getX(), point.getY() + caretInset, ((EditorImpl)this$0.editor).getCharHeight(), caretHeight);
/*     */     (Graphics2D)g;
/*     */     Color oldColor = ((Graphics2D)g).getColor();
/*     */     try {
/*     */       ((Graphics2D)g).setColor(this$0.getCaretColor());
/*     */       ((Graphics2D)g).fill(rect);
/*     */     } finally {
/*     */       ((Graphics2D)g).setColor(oldColor);
/*     */     } 
/*     */   }
/*     */   
/*     */   private final void removeHighlighter() {
/*     */     RangeHighlighter it = this.caretHighlighter;
/*     */     int $i$a$-let-TerminalCaretPainter$removeHighlighter$1 = 0;
/*     */     this.editor.getMarkupModel().removeHighlighter(it);
/*     */     this.caretHighlighter = null;
/*     */   }
/*     */   
/*     */   private final int calculateCaretHeight() {
/*     */     double rawCaretInset = this.editor.getLineHeight() * 0.2D;
/*     */     int caretInsets = ((int)Math.floor(rawCaretInset) % 2 == 0) ? (int)Math.floor(rawCaretInset) : (int)Math.ceil(rawCaretInset);
/*     */     return this.editor.getLineHeight() - caretInsets;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\002\n\002\b\002\b\004\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\b\020\n\032\0020\013H\002J\b\020\f\032\0020\013H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\022\020\006\032\006\022\002\b\0030\007X\004¢\006\002\n\000R\016\020\b\032\0020\tX\016¢\006\002\n\000¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretPainter$BlinkingCaretUpdater;", "Lcom/intellij/openapi/Disposable;", "position", "Lcom/intellij/openapi/editor/LogicalPosition;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretPainter;Lcom/intellij/openapi/editor/LogicalPosition;)V", "updateFuture", "Ljava/util/concurrent/ScheduledFuture;", "paintCaret", "", "update", "", "dispose", "ej-core"})
/*     */   private final class BlinkingCaretUpdater implements Disposable {
/*     */     @NotNull
/*     */     private final LogicalPosition position;
/*     */     @NotNull
/*     */     private final ScheduledFuture<?> updateFuture;
/*     */     private boolean paintCaret;
/*     */     
/*     */     public BlinkingCaretUpdater(LogicalPosition position) {
/*     */       this.position = position;
/*     */       long period = TerminalCaretPainter.this.editor.getSettings().getCaretBlinkPeriod();
/*     */       this.updateFuture = EdtExecutorService.getScheduledExecutorInstance().scheduleWithFixedDelay(this::update, period, period, TimeUnit.MILLISECONDS);
/*     */     }
/*     */     
/*     */     private final void update() {
/*     */       if (!TerminalCaretPainter.this.editor.isDisposed()) {
/*     */         TerminalCaretPainter.this.removeHighlighter();
/*     */         if (!TerminalCaretPainter.this.isDisposed && this.paintCaret)
/*     */           TerminalCaretPainter.this.installCaretHighlighter(this.position); 
/*     */         this.paintCaret = !this.paintCaret;
/*     */       } 
/*     */     }
/*     */     
/*     */     public void dispose() {
/*     */       this.updateFuture.cancel(false);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\005X\004¢\006\002\n\000¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretPainter$Companion;", "", "<init>", "()V", "CARET_LIGHT", "Ljava/awt/Color;", "CARET_DARK", "ej-core"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final TerminalCaretModel caretModel;
/*     */   @NotNull
/*     */   private final TerminalOutputModel outputModel;
/*     */   @NotNull
/*     */   private final EditorEx editor;
/*     */   @Nullable
/*     */   private RangeHighlighter caretHighlighter;
/*     */   @Nullable
/*     */   private BlinkingCaretUpdater caretUpdater;
/*     */   private boolean isFocused;
/*     */   private boolean isBlockActive;
/*     */   private volatile boolean isDisposed;
/*     */   @NotNull
/*     */   private static final Color CARET_LIGHT = (Color)Gray._255;
/*     */   
/*     */   static {
/*     */     Intrinsics.checkNotNullExpressionValue(Gray._255, "_255");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final Color CARET_DARK = (Color)Gray._0;
/*     */   
/*     */   static {
/*     */     Intrinsics.checkNotNullExpressionValue(Gray._0, "_0");
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalCaretPainter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */