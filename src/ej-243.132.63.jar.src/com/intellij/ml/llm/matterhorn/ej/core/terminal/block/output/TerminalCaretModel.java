/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000n\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020!\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\004\n\002\020\013\n\002\b\004\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\004\b\000\030\0002\0020\0012\0020\002:\002,-B'\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n¢\006\004\b\013\020\fJ\032\020\034\032\0020\0352\006\020\036\032\0020\0232\n\b\002\020\037\032\004\030\0010\nJ\020\020 \032\0020\0352\006\020!\032\0020\"H\026J\b\020#\032\0020\035H\002J\b\020$\032\0020\035H\003J\b\020%\032\0020\031H\002J\b\020&\032\004\030\0010'J\032\020(\032\004\030\0010'2\006\020)\032\0020*2\006\020+\032\0020*H\002R\016\020\003\032\0020\004X\004¢\006\002\n\000R\016\020\005\032\0020\006X\004¢\006\002\n\000R\016\020\007\032\0020\bX\004¢\006\002\n\000R\024\020\r\032\0020\0168BX\004¢\006\006\032\004\b\017\020\020R\024\020\021\032\b\022\004\022\0020\0230\022X\004¢\006\002\n\000R\016\020\024\032\0020\025X\004¢\006\002\n\000R\016\020\026\032\0020\027X\004¢\006\002\n\000R\021\020\030\032\0020\0318F¢\006\006\032\004\b\032\020\033¨\006."}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretModel;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$CursorListener;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$TerminalListener;", "session", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "outputModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;", "editor", "Lcom/intellij/openapi/editor/ex/EditorEx;", "parentDisposable", "Lcom/intellij/openapi/Disposable;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;Lcom/intellij/openapi/editor/ex/EditorEx;Lcom/intellij/openapi/Disposable;)V", "terminalModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel;", "getTerminalModel", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel;", "listeners", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretModel$CaretListener;", "updateScheduled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "updateAlarm", "Lcom/intellij/util/Alarm;", "state", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretModel$CaretState;", "getState", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretModel$CaretState;", "addListener", "", "listener", "disposable", "onCommandRunningChanged", "isRunning", "", "scheduleUpdate", "doUpdate", "calculateState", "getCaretPosition", "Lcom/intellij/openapi/editor/LogicalPosition;", "calculateCaretPosition", "cursorX", "", "cursorY", "CaretState", "CaretListener", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nTerminalCaretModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalCaretModel.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretModel\n+ 2 TerminalModel.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel\n*L\n1#1,129:1\n156#2,7:130\n156#2,7:137\n*S KotlinDebug\n*F\n+ 1 TerminalCaretModel.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretModel\n*L\n87#1:130,7\n98#1:137,7\n*E\n"})
/*     */ public final class TerminalCaretModel implements TerminalModel.CursorListener, TerminalModel.TerminalListener {
/*     */   @NotNull
/*     */   private final BlockTerminalSession session;
/*     */   @NotNull
/*     */   private final TerminalOutputModel outputModel;
/*     */   @NotNull
/*     */   private final EditorEx editor;
/*     */   @NotNull
/*     */   private final List<CaretListener> listeners;
/*     */   @NotNull
/*     */   private final AtomicBoolean updateScheduled;
/*     */   @NotNull
/*     */   private final Alarm updateAlarm;
/*     */   
/*  19 */   public TerminalCaretModel(@NotNull BlockTerminalSession session, @NotNull TerminalOutputModel outputModel, @NotNull EditorEx editor, @NotNull Disposable parentDisposable) { this.session = session;
/*  20 */     this.outputModel = outputModel;
/*  21 */     this.editor = editor;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  27 */     this.listeners = new CopyOnWriteArrayList<>();
/*     */     
/*  29 */     this.updateScheduled = new AtomicBoolean(false);
/*  30 */     this.updateAlarm = new Alarm(Alarm.ThreadToUse.SWING_THREAD, parentDisposable);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  36 */     getTerminalModel().addTerminalListener(this, parentDisposable);
/*  37 */     getTerminalModel().addCursorListener(new TerminalModel.CursorListener() { public void onMouseModeChanged(MouseMode mode) { TerminalModel.CursorListener.DefaultImpls.onMouseModeChanged(this, mode); } public void onMouseFormatChanged(MouseFormat format) { TerminalModel.CursorListener.DefaultImpls.onMouseFormatChanged(this, format); }
/*     */            public void onPositionChanged(int cursorX, int cursorY) {
/*  39 */             TerminalCaretModel.this.scheduleUpdate();
/*     */           }
/*     */           
/*     */           public void onVisibilityChanged(boolean visible) {
/*  43 */             TerminalCaretModel.this.scheduleUpdate();
/*     */           }
/*     */           
/*     */           public void onShapeChanged(CursorShape shape) {
/*  47 */             TerminalCaretModel.this.scheduleUpdate();
/*     */           } }
/*  49 */         parentDisposable);
/*  50 */     MessageBusConnection connection = ApplicationManager.getApplication().getMessageBus().connect(parentDisposable);
/*  51 */     Intrinsics.checkNotNullExpressionValue(EditorOptionsListener.APPEARANCE_CONFIGURABLE_TOPIC, "APPEARANCE_CONFIGURABLE_TOPIC"); connection.subscribe(EditorOptionsListener.APPEARANCE_CONFIGURABLE_TOPIC, this::_init_$lambda$0); }
/*  52 */   public void onPositionChanged(int cursorX, int cursorY) { TerminalModel.CursorListener.DefaultImpls.onPositionChanged(this, cursorX, cursorY); } public void onShapeChanged(@Nullable CursorShape shape) { TerminalModel.CursorListener.DefaultImpls.onShapeChanged(this, shape); } public void onVisibilityChanged(boolean visible) { TerminalModel.CursorListener.DefaultImpls.onVisibilityChanged(this, visible); } public void onMouseModeChanged(@NotNull MouseMode mode) { TerminalModel.CursorListener.DefaultImpls.onMouseModeChanged(this, mode); } public void onMouseFormatChanged(@NotNull MouseFormat format) { TerminalModel.CursorListener.DefaultImpls.onMouseFormatChanged(this, format); } private static final void _init_$lambda$0(TerminalCaretModel this$0) { this$0.scheduleUpdate(); }
/*     */   public void onSizeChanged(int width, int height) { TerminalModel.TerminalListener.DefaultImpls.onSizeChanged(this, width, height); }
/*     */   public void onWindowTitleChanged(@NotNull String title) { TerminalModel.TerminalListener.DefaultImpls.onWindowTitleChanged(this, title); }
/*     */   public void onAlternateBufferChanged(boolean enabled) { TerminalModel.TerminalListener.DefaultImpls.onAlternateBufferChanged(this, enabled); }
/*     */   public void onBracketedPasteModeChanged(boolean bracketed) { TerminalModel.TerminalListener.DefaultImpls.onBracketedPasteModeChanged(this, bracketed); }
/*     */   private final TerminalModel getTerminalModel() { return this.session.getModel(); }
/*     */   @NotNull public final CaretState getState() { return calculateState(); }
/*     */   public final void addListener(@NotNull CaretListener listener, @Nullable Disposable disposable) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'listener'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield listeners : Ljava/util/List;
/*     */     //   10: aload_1
/*     */     //   11: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   16: pop
/*     */     //   17: aload_2
/*     */     //   18: dup
/*     */     //   19: ifnull -> 41
/*     */     //   22: astore_3
/*     */     //   23: iconst_0
/*     */     //   24: istore #4
/*     */     //   26: aload_3
/*     */     //   27: aload_0
/*     */     //   28: aload_1
/*     */     //   29: <illegal opcode> dispose : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretModel;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretModel$CaretListener;)Lcom/intellij/openapi/Disposable;
/*     */     //   34: invokestatic register : (Lcom/intellij/openapi/Disposable;Lcom/intellij/openapi/Disposable;)V
/*     */     //   37: nop
/*     */     //   38: goto -> 43
/*     */     //   41: pop
/*     */     //   42: nop
/*     */     //   43: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #57	-> 6
/*     */     //   #58	-> 17
/*     */     //   #59	-> 26
/*     */     //   #60	-> 37
/*     */     //   #58	-> 38
/*     */     //   #58	-> 41
/*     */     //   #61	-> 43
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   26	12	4	$i$a$-let-TerminalCaretModel$addListener$1	I
/*     */     //   23	15	3	it	Lcom/intellij/openapi/Disposable;
/*     */     //   0	44	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretModel;
/*     */     //   0	44	1	listener	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretModel$CaretListener;
/*  59 */     //   0	44	2	disposable	Lcom/intellij/openapi/Disposable; } private static final void addListener$lambda$2$lambda$1(TerminalCaretModel this$0, CaretListener $listener) { this$0.listeners.remove($listener); }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onCommandRunningChanged(boolean isRunning) {
/*  64 */     scheduleUpdate();
/*     */   }
/*     */   
/*     */   private final void scheduleUpdate() {
/*  68 */     if (this.updateScheduled.compareAndSet(false, true)) {
/*  69 */       this.updateAlarm.addRequest(this::doUpdate, 50);
/*     */     }
/*     */   }
/*     */   
/*     */   @RequiresEdt
/*     */   private final void doUpdate() {
/*     */     try {
/*  76 */       CaretState state = calculateState();
/*  77 */       for (CaretListener listener : this.listeners) {
/*  78 */         listener.caretStateChanged(state);
/*     */       }
/*     */     } finally {
/*     */       
/*  82 */       this.updateScheduled.set(false);
/*     */     } 
/*     */   }
/*     */   
/*     */   private final CaretState calculateState() { CaretState caretState;
/*  87 */     TerminalModel this_$iv = this.session.getModel(); int $i$f$withContentLock = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 130 */     this_$iv.lockContent();
/*     */     
/* 132 */     try { int $i$a$-withContentLock-TerminalCaretModel$calculateState$1 = 0; LogicalPosition position = getTerminalModel().isCursorVisible() ? calculateCaretPosition(getTerminalModel().getCursorX(), getTerminalModel().getCursorY()) : null; if (getTerminalModel().getCursorShape() == null) { getTerminalModel().getCursorShape(); Intrinsics.checkNotNullExpressionValue(this.session.getSettings().getCursorShape(), "getCursorShape(...)"); }  CursorShape cursorShape = this.session.getSettings().getCursorShape(); caretState = new CaretState(position, cursorShape.isBlinking()); }
/*     */     finally
/*     */     
/* 135 */     { this_$iv.unlockContent(); }  return caretState; } @Nullable public final LogicalPosition getCaretPosition() { LogicalPosition logicalPosition; TerminalModel this_$iv = this.session.getModel();
/*     */     int $i$f$withContentLock = 0;
/* 137 */     this_$iv.lockContent();
/*     */     
/* 139 */     try { int $i$a$-withContentLock-TerminalCaretModel$getCaretPosition$1 = 0; logicalPosition = calculateCaretPosition(getTerminalModel().getCursorX(), getTerminalModel().getCursorY()); }
/*     */     finally
/*     */     
/* 142 */     { this_$iv.unlockContent(); }  return logicalPosition; }
/*     */ 
/*     */   
/*     */   private final LogicalPosition calculateCaretPosition(int cursorX, int cursorY) {
/*     */     CommandBlock activeBlock;
/*     */     if (TerminalOutputModelKt.getActiveBlock(this.outputModel) == null) {
/*     */       TerminalOutputModelKt.getActiveBlock(this.outputModel);
/*     */       return null;
/*     */     } 
/*     */     int outputStartOffset = activeBlock.getOutputStartOffset();
/*     */     if (outputStartOffset > this.editor.getDocument().getTextLength())
/*     */       return null; 
/*     */     int blockStartLine = this.editor.getDocument().getLineNumber(outputStartOffset);
/*     */     int historyLines = getTerminalModel().getUseAlternateBuffer() ? 0 : getTerminalModel().getHistoryLinesCount();
/*     */     int blockLine = historyLines + cursorY - 1;
/*     */     return new LogicalPosition(blockStartLine + blockLine, cursorX);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\013\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\033\022\b\020\002\032\004\030\0010\003\022\b\b\002\020\004\032\0020\005¢\006\004\b\006\020\007J\013\020\013\032\004\030\0010\003HÆ\003J\t\020\f\032\0020\005HÆ\003J\037\020\r\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0052\b\020\017\032\004\030\0010\001HÖ\003J\t\020\020\032\0020\021HÖ\001J\t\020\022\032\0020\023HÖ\001R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\004\020\n¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretModel$CaretState;", "", "position", "Lcom/intellij/openapi/editor/LogicalPosition;", "isBlinking", "", "<init>", "(Lcom/intellij/openapi/editor/LogicalPosition;Z)V", "getPosition", "()Lcom/intellij/openapi/editor/LogicalPosition;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "ej-core"})
/*     */   public static final class CaretState {
/*     */     @Nullable
/*     */     private final LogicalPosition position;
/*     */     private final boolean isBlinking;
/*     */     
/*     */     public CaretState(@Nullable LogicalPosition position, boolean isBlinking) {
/*     */       this.position = position;
/*     */       this.isBlinking = isBlinking;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final LogicalPosition getPosition() {
/*     */       return this.position;
/*     */     }
/*     */     
/*     */     public final boolean isBlinking() {
/*     */       return this.isBlinking;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final LogicalPosition component1() {
/*     */       return this.position;
/*     */     }
/*     */     
/*     */     public final boolean component2() {
/*     */       return this.isBlinking;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final CaretState copy(@Nullable LogicalPosition position, boolean isBlinking) {
/*     */       return new CaretState(position, isBlinking);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "CaretState(position=" + this.position + ", isBlinking=" + this.isBlinking + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = (this.position == null) ? 0 : this.position.hashCode();
/*     */       return result * 31 + Boolean.hashCode(this.isBlinking);
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof CaretState))
/*     */         return false; 
/*     */       CaretState caretState = (CaretState)other;
/*     */       return !Intrinsics.areEqual(this.position, caretState.position) ? false : (!(this.isBlinking != caretState.isBlinking));
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\000\bf\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\027¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretModel$CaretListener;", "", "caretStateChanged", "", "state", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretModel$CaretState;", "ej-core"})
/*     */   public static interface CaretListener {
/*     */     @RequiresEdt
/*     */     void caretStateChanged(@NotNull TerminalCaretModel.CaretState param1CaretState);
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */     public static final class DefaultImpls {
/*     */       @RequiresEdt
/*     */       public static void caretStateChanged(@NotNull TerminalCaretModel.CaretListener $this, @NotNull TerminalCaretModel.CaretState state) {
/*     */         Intrinsics.checkNotNullParameter(state, "state");
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalCaretModel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */