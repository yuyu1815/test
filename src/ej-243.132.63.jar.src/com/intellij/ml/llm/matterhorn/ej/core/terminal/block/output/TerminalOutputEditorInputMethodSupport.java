/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.BlockTerminalSession;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.editor.Inlay;
/*     */ import com.intellij.openapi.editor.LogicalPosition;
/*     */ import com.intellij.openapi.editor.ex.EditorEx;
/*     */ import com.intellij.openapi.editor.impl.EditorImpl;
/*     */ import com.intellij.openapi.util.Disposer;
/*     */ import com.jediterm.terminal.TerminalStarter;
/*     */ import java.awt.Point;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.event.InputMethodEvent;
/*     */ import java.awt.font.TextHitInfo;
/*     */ import java.text.AttributedCharacterIterator;
/*     */ import java.text.AttributedString;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\b\000\030\0002\0020\001:\001\033B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\016\020\016\032\0020\0172\006\020\020\032\0020\021J\020\020\022\032\0020\0172\006\020\023\032\0020\024H\002J\032\020\025\032\0020\0262\006\020\027\032\0020\0302\b\b\002\020\031\032\0020\032H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\022\020\n\032\0060\013R\0020\000X\004¢\006\002\n\000R\024\020\f\032\b\022\002\b\003\030\0010\rX\016¢\006\002\n\000¨\006\034"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputEditorInputMethodSupport;", "", "editor", "Lcom/intellij/openapi/editor/ex/EditorEx;", "session", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "caretModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretModel;", "<init>", "(Lcom/intellij/openapi/editor/ex/EditorEx;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretModel;)V", "inputMethodRequests", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputEditorInputMethodSupport$MyInputMethodRequests;", "inlay", "Lcom/intellij/openapi/editor/Inlay;", "install", "", "parentDisposable", "Lcom/intellij/openapi/Disposable;", "handleInputMethodTextChanged", "event", "Ljava/awt/event/InputMethodEvent;", "collectString", "", "text", "Ljava/text/AttributedCharacterIterator;", "count", "", "MyInputMethodRequests", "ej-core"})
/*     */ public final class TerminalOutputEditorInputMethodSupport {
/*     */   @NotNull
/*     */   private final EditorEx editor;
/*     */   @NotNull
/*     */   private final BlockTerminalSession session;
/*     */   
/*     */   public TerminalOutputEditorInputMethodSupport(@NotNull EditorEx editor, @NotNull BlockTerminalSession session, @NotNull TerminalCaretModel caretModel) {
/*  29 */     this.editor = editor;
/*  30 */     this.session = session;
/*  31 */     this.caretModel = caretModel;
/*     */ 
/*     */     
/*  34 */     this.inputMethodRequests = new MyInputMethodRequests();
/*     */   } @NotNull
/*     */   private final TerminalCaretModel caretModel; @NotNull
/*     */   private final MyInputMethodRequests inputMethodRequests; @Nullable
/*     */   private Inlay<?> inlay; public final void install(@NotNull Disposable parentDisposable) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'parentDisposable'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield editor : Lcom/intellij/openapi/editor/ex/EditorEx;
/*     */     //   10: invokeinterface isViewer : ()Z
/*     */     //   15: ifne -> 33
/*     */     //   18: ldc 'Check failed.'
/*     */     //   20: astore_3
/*     */     //   21: new java/lang/IllegalStateException
/*     */     //   24: dup
/*     */     //   25: aload_3
/*     */     //   26: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   29: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   32: athrow
/*     */     //   33: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputEditorInputMethodSupport$install$mouseListener$1
/*     */     //   36: dup
/*     */     //   37: aload_0
/*     */     //   38: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputEditorInputMethodSupport;)V
/*     */     //   41: astore_2
/*     */     //   42: aload_0
/*     */     //   43: getfield editor : Lcom/intellij/openapi/editor/ex/EditorEx;
/*     */     //   46: invokeinterface getContentComponent : ()Ljavax/swing/JComponent;
/*     */     //   51: aload_2
/*     */     //   52: checkcast java/awt/event/MouseListener
/*     */     //   55: invokevirtual addMouseListener : (Ljava/awt/event/MouseListener;)V
/*     */     //   58: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputEditorInputMethodSupport$install$inputMethodListener$1
/*     */     //   61: dup
/*     */     //   62: aload_0
/*     */     //   63: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputEditorInputMethodSupport;)V
/*     */     //   66: astore_3
/*     */     //   67: aload_0
/*     */     //   68: getfield editor : Lcom/intellij/openapi/editor/ex/EditorEx;
/*     */     //   71: dup
/*     */     //   72: ldc 'null cannot be cast to non-null type com.intellij.openapi.editor.impl.EditorImpl'
/*     */     //   74: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   77: checkcast com/intellij/openapi/editor/impl/EditorImpl
/*     */     //   80: new com/intellij/openapi/editor/impl/EditorInputMethodSupport
/*     */     //   83: dup
/*     */     //   84: aload_0
/*     */     //   85: getfield inputMethodRequests : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputEditorInputMethodSupport$MyInputMethodRequests;
/*     */     //   88: checkcast java/awt/im/InputMethodRequests
/*     */     //   91: aload_3
/*     */     //   92: checkcast java/awt/event/InputMethodListener
/*     */     //   95: invokespecial <init> : (Ljava/awt/im/InputMethodRequests;Ljava/awt/event/InputMethodListener;)V
/*     */     //   98: invokevirtual setInputMethodSupport : (Lcom/intellij/openapi/editor/impl/EditorInputMethodSupport;)V
/*     */     //   101: aload_1
/*     */     //   102: aload_0
/*     */     //   103: aload_2
/*     */     //   104: <illegal opcode> dispose : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputEditorInputMethodSupport;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputEditorInputMethodSupport$install$mouseListener$1;)Lcom/intellij/openapi/Disposable;
/*     */     //   109: invokestatic register : (Lcom/intellij/openapi/Disposable;Lcom/intellij/openapi/Disposable;)V
/*     */     //   112: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #39	-> 6
/*     */     //   #41	-> 33
/*     */     //   #48	-> 42
/*     */     //   #50	-> 58
/*     */     //   #63	-> 67
/*     */     //   #65	-> 101
/*     */     //   #69	-> 112
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   42	71	2	mouseListener	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputEditorInputMethodSupport$install$mouseListener$1;
/*     */     //   67	46	3	inputMethodListener	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputEditorInputMethodSupport$install$inputMethodListener$1;
/*     */     //   0	113	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputEditorInputMethodSupport;
/*     */     //   0	113	1	parentDisposable	Lcom/intellij/openapi/Disposable;
/*     */   }
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\022\020\002\032\0020\0032\b\020\004\032\004\030\0010\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputEditorInputMethodSupport$install$mouseListener$1", "Ljava/awt/event/MouseAdapter;", "mousePressed", "", "e", "Ljava/awt/event/MouseEvent;", "ej-core"})
/*     */   public static final class TerminalOutputEditorInputMethodSupport$install$mouseListener$1 extends MouseAdapter { public void mousePressed(MouseEvent e) {
/*  43 */       if (TerminalOutputEditorInputMethodSupport.this.inlay != null && !TerminalOutputEditorInputMethodSupport.this.editor.isDisposed())
/*  44 */         if (TerminalOutputEditorInputMethodSupport.this.editor.getContentComponent().getInputContext() != null) { TerminalOutputEditorInputMethodSupport.this.editor.getContentComponent().getInputContext().endComposition(); } else { TerminalOutputEditorInputMethodSupport.this.editor.getContentComponent().getInputContext(); }
/*     */          
/*     */     } }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H\026¨\006\007"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputEditorInputMethodSupport$install$inputMethodListener$1", "Ljava/awt/event/InputMethodListener;", "inputMethodTextChanged", "", "event", "Ljava/awt/event/InputMethodEvent;", "caretPositionChanged", "ej-core"})
/*     */   public static final class TerminalOutputEditorInputMethodSupport$install$inputMethodListener$1 implements InputMethodListener {
/*     */     public void inputMethodTextChanged(InputMethodEvent event) {
/*  52 */       Intrinsics.checkNotNullParameter(event, "event"); if (!TerminalOutputEditorInputMethodSupport.this.editor.isDisposed()) {
/*  53 */         TerminalOutputEditorInputMethodSupport.this.handleInputMethodTextChanged(event);
/*     */       }
/*  55 */       event.consume();
/*     */     }
/*     */     
/*     */     public void caretPositionChanged(InputMethodEvent event) {
/*  59 */       Intrinsics.checkNotNullParameter(event, "event"); event.consume();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void install$lambda$0(TerminalOutputEditorInputMethodSupport this$0, TerminalOutputEditorInputMethodSupport$install$mouseListener$1 $mouseListener) {
/*  66 */     ((EditorImpl)this$0.editor).getContentComponent().removeMouseListener($mouseListener);
/*  67 */     ((EditorImpl)this$0.editor).setInputMethodSupport(null);
/*     */   }
/*     */ 
/*     */   
/*     */   private final void handleInputMethodTextChanged(InputMethodEvent event) {
/*  72 */     Inlay<?> it = this.inlay; int $i$a$-let-TerminalOutputEditorInputMethodSupport$handleInputMethodTextChanged$1 = 0;
/*  73 */     Disposer.dispose((Disposable)it);
/*     */     
/*  75 */     this.inlay = null;
/*     */     
/*  77 */     AttributedCharacterIterator text = event.getText();
/*  78 */     if (text != null) {
/*  79 */       text.first();
/*  80 */       String committedString = collectString(text, event.getCommittedCharacterCount());
/*  81 */       LogicalPosition cursorPosition = this.caretModel.getCaretPosition();
/*  82 */       if ((((CharSequence)committedString).length() > 0))
/*  83 */         if ((TerminalStarter)this.session.getTerminalStarterFuture$ej_core().getNow(null) != null) { ((TerminalStarter)this.session.getTerminalStarterFuture$ej_core().getNow(null)).sendString(committedString, true); } else { (TerminalStarter)this.session.getTerminalStarterFuture$ej_core().getNow(null); }
/*     */          
/*  85 */       if (cursorPosition == null)
/*  86 */         return;  String composedString = collectString$default(this, text, 0, 2, null);
/*  87 */       if ((((CharSequence)composedString).length() > 0)) {
/*  88 */         int cursorOffset = this.editor.logicalPositionToOffset(cursorPosition);
/*  89 */         this.inlay = this.editor.getInlayModel().addInlineElement(cursorOffset, true, -1000000, 
/*  90 */             (EditorCustomElementRenderer)new InputMethodInlayRenderer(composedString));
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private final String collectString(AttributedCharacterIterator text, int count) {
/*  96 */     int processedChars = 0;
/*  97 */     StringBuilder result = new StringBuilder();
/*  98 */     char c = text.current();
/*  99 */     while (c != Character.MAX_VALUE && processedChars < count) {
/*     */       
/* 101 */       if (c >= ' ' && c != '') {
/* 102 */         result.append(c);
/*     */       }
/* 104 */       c = text.next();
/* 105 */       processedChars++;
/*     */     } 
/* 107 */     Intrinsics.checkNotNullExpressionValue(result.toString(), "toString(...)"); return result.toString();
/*     */   }
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\006\b\004\030\0002\0020\001B\007¢\006\004\b\002\020\003J\022\020\004\032\0020\0052\b\020\006\032\004\030\0010\007H\026J\032\020\b\032\004\030\0010\0072\006\020\t\032\0020\n2\006\020\013\032\0020\nH\026J\b\020\f\032\0020\nH\026J/\020\r\032\0020\0162\006\020\017\032\0020\n2\006\020\020\032\0020\n2\020\020\021\032\f\022\006\b\001\022\0020\023\030\0010\022H\026¢\006\002\020\024J\b\020\025\032\0020\nH\026J!\020\026\032\004\030\0010\0162\020\020\021\032\f\022\006\b\001\022\0020\023\030\0010\022H\026¢\006\002\020\027J!\020\030\032\004\030\0010\0162\020\020\021\032\f\022\006\b\001\022\0020\023\030\0010\022H\026¢\006\002\020\027¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputEditorInputMethodSupport$MyInputMethodRequests;", "Ljava/awt/im/InputMethodRequests;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputEditorInputMethodSupport;)V", "getTextLocation", "Ljava/awt/Rectangle;", "offset", "Ljava/awt/font/TextHitInfo;", "getLocationOffset", "x", "", "y", "getInsertPositionOffset", "getCommittedText", "Ljava/text/AttributedCharacterIterator;", "beginIndex", "endIndex", "attributes", "", "Ljava/text/AttributedCharacterIterator$Attribute;", "(II[Ljava/text/AttributedCharacterIterator$Attribute;)Ljava/text/AttributedCharacterIterator;", "getCommittedTextLength", "cancelLatestCommittedText", "([Ljava/text/AttributedCharacterIterator$Attribute;)Ljava/text/AttributedCharacterIterator;", "getSelectedText", "ej-core"})
/*     */   private final class MyInputMethodRequests implements InputMethodRequests { @NotNull
/*     */     public Rectangle getTextLocation(@Nullable TextHitInfo offset) {
/*     */       LogicalPosition cursorPosition;
/* 113 */       if (TerminalOutputEditorInputMethodSupport.this.editor.isDisposed()) return new Rectangle(); 
/* 114 */       if (TerminalOutputEditorInputMethodSupport.this.caretModel.getCaretPosition() == null) { TerminalOutputEditorInputMethodSupport.this.caretModel.getCaretPosition(); return new Rectangle(); }
/* 115 */        Intrinsics.checkNotNullExpressionValue(TerminalOutputEditorInputMethodSupport.this.editor.logicalPositionToXY(cursorPosition), "logicalPositionToXY(...)"); Point caret = TerminalOutputEditorInputMethodSupport.this.editor.logicalPositionToXY(cursorPosition);
/* 116 */       Rectangle r = new Rectangle(caret, new Dimension(1, TerminalOutputEditorInputMethodSupport.this.editor.getLineHeight()));
/* 117 */       Intrinsics.checkNotNullExpressionValue(TerminalOutputEditorInputMethodSupport.this.editor.getContentComponent(), "getContentComponent(...)"); Point p = TerminalOutputEditorInputMethodSupportKt.access$getLocationOnScreen(TerminalOutputEditorInputMethodSupport.this.editor.getContentComponent());
/* 118 */       r.translate(p.x, p.y);
/* 119 */       return r;
/*     */     } @Nullable
/*     */     public TextHitInfo getLocationOffset(int x, int y) {
/* 122 */       return null;
/*     */     } public int getInsertPositionOffset() {
/*     */       LogicalPosition cursorLogicalPosition;
/* 125 */       if (TerminalOutputEditorInputMethodSupport.this.caretModel.getCaretPosition() == null) { TerminalOutputEditorInputMethodSupport.this.caretModel.getCaretPosition(); return 0; }
/* 126 */        return TerminalOutputEditorInputMethodSupport.this.editor.logicalPositionToOffset(cursorLogicalPosition);
/*     */     }
/*     */     @NotNull
/*     */     public AttributedCharacterIterator getCommittedText(int beginIndex, int endIndex, @Nullable AttributedCharacterIterator.Attribute[] attributes) {
/* 130 */       String committed = TerminalOutputEditorInputMethodSupportKt.access$getText((Editor)TerminalOutputEditorInputMethodSupport.this.editor, beginIndex, endIndex);
/* 131 */       Intrinsics.checkNotNullExpressionValue((new AttributedString(committed)).getIterator(), "getIterator(...)"); return (new AttributedString(committed)).getIterator();
/*     */     }
/*     */     public int getCommittedTextLength() {
/* 134 */       return TerminalOutputEditorInputMethodSupport.this.editor.getDocument().getTextLength();
/*     */     }
/*     */     @Nullable
/* 137 */     public AttributedCharacterIterator cancelLatestCommittedText(@Nullable AttributedCharacterIterator.Attribute[] attributes) { return null; } @Nullable
/*     */     public AttributedCharacterIterator getSelectedText(@Nullable AttributedCharacterIterator.Attribute[] attributes) {
/* 139 */       return null;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalOutputEditorInputMethodSupport.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */