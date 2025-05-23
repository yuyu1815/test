/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.HighlightingInfo;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.error.TerminalPromptErrorStateListener;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.BlockTerminalSession;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.CommandFinishedEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.GeneratorFinishedEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.ShellCommandListener;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.editor.event.CaretEvent;
/*     */ import com.intellij.openapi.editor.ex.DocumentEx;
/*     */ import com.intellij.openapi.editor.ex.EditorEx;
/*     */ import com.intellij.openapi.editor.markup.MarkupModel;
/*     */ import com.intellij.util.EventDispatcher;
/*     */ import com.jediterm.core.util.TermSize;
/*     */ import java.util.Iterator;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000j\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\020\b\n\002\b\002\n\002\020\016\n\002\b\006\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\002\b\007\n\002\030\002\n\002\b\007\b\000\030\000 82\0020\0012\0020\002:\00278B\027\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006¢\006\004\b\007\020\bJ\b\020)\032\0020*H\027J\020\020+\032\0020*2\006\020,\032\0020\024H\002J\020\020-\032\0020*2\006\020\031\032\0020\030H\003J\b\020.\032\0020\022H\002J\b\020/\032\0020\020H\002J\022\0200\032\0020*2\b\0201\032\004\030\00102H\026J\030\0203\032\0020*2\006\0204\032\0020(2\006\0205\032\0020\002H\026J\b\0206\032\0020*H\026R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\t\020\nR\016\020\005\032\0020\006X\004¢\006\002\n\000R\024\020\013\032\0020\f8BX\004¢\006\006\032\004\b\r\020\016R\016\020\017\032\0020\020X\016¢\006\002\n\000R\020\020\021\032\004\030\0010\022X\016¢\006\002\n\000R\036\020\025\032\0020\0242\006\020\023\032\0020\024@RX\016¢\006\b\n\000\032\004\b\026\020\027R\036\020\031\032\0020\0302\006\020\023\032\0020\030@RX\016¢\006\b\n\000\032\004\b\032\020\033R\024\020\034\032\0020\0358VX\004¢\006\006\032\004\b\036\020\037R$\020!\032\0020 2\006\020\023\032\0020 8V@VX\016¢\006\f\032\004\b\"\020#\"\004\b$\020%R\024\020&\032\b\022\004\022\0020(0'X\004¢\006\002\n\000¨\0069"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModelImpl;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModel;", "Lcom/intellij/openapi/Disposable;", "editor", "Lcom/intellij/openapi/editor/ex/EditorEx;", "session", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "<init>", "(Lcom/intellij/openapi/editor/ex/EditorEx;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;)V", "getEditor", "()Lcom/intellij/openapi/editor/ex/EditorEx;", "document", "Lcom/intellij/openapi/editor/ex/DocumentEx;", "getDocument", "()Lcom/intellij/openapi/editor/ex/DocumentEx;", "renderer", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderer;", "rightPromptManager", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/RightPromptManager;", "value", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptState;", "promptState", "getPromptState", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptState;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderingInfo;", "renderingInfo", "getRenderingInfo", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderingInfo;", "commandStartOffset", "", "getCommandStartOffset", "()I", "", "commandText", "getCommandText", "()Ljava/lang/String;", "setCommandText", "(Ljava/lang/String;)V", "errorStateDispatcher", "Lcom/intellij/util/EventDispatcher;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/error/TerminalPromptErrorStateListener;", "resetChangesHistory", "", "updatePrompt", "state", "doUpdatePrompt", "getOrCreateRightPromptManager", "createPromptRenderer", "setErrorDescription", "errorDescription", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/error/TerminalPromptErrorDescription;", "addErrorStateListener", "listener", "parentDisposable", "dispose", "PreventMoveToPromptListener", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nTerminalPromptModelImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalPromptModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModelImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TerminalModel.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel\n*L\n1#1,186:1\n1#2:187\n156#3,7:188\n*S KotlinDebug\n*F\n+ 1 TerminalPromptModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModelImpl\n*L\n131#1:188,7\n*E\n"})
/*     */ public final class TerminalPromptModelImpl implements TerminalPromptModel, Disposable {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final EditorEx editor;
/*     */   @NotNull
/*     */   private final BlockTerminalSession session;
/*     */   @NotNull
/*     */   private TerminalPromptRenderer renderer;
/*     */   
/*  34 */   public TerminalPromptModelImpl(@NotNull EditorEx editor, @NotNull BlockTerminalSession session) { this.editor = editor;
/*  35 */     this.session = session;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  40 */     this.renderer = createPromptRenderer();
/*     */ 
/*     */ 
/*     */     
/*  44 */     this.promptState = new TerminalPromptState("", null, null, null, null, null, null, null, null, 510, null);
/*     */ 
/*     */     
/*  47 */     this.renderingInfo = new TerminalPromptRenderingInfo("", CollectionsKt.emptyList(), null, null, 12, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  61 */     Intrinsics.checkNotNullExpressionValue(EventDispatcher.create(TerminalPromptErrorStateListener.class), "create(...)"); this.errorStateDispatcher = EventDispatcher.create(TerminalPromptErrorStateListener.class);
/*     */ 
/*     */     
/*  64 */     getEditor().getCaretModel().addCaretListener(new PreventMoveToPromptListener(), this);
/*  65 */     EditorActionManager.getInstance().setReadonlyFragmentModificationHandler((Document)getDocument(), TerminalPromptModelImpl::_init_$lambda$1);
/*     */     
/*  67 */     BlockTerminalSession.addCommandListener$default(this.session, new ShellCommandListener() { public void clearInvoked() { ShellCommandListener.DefaultImpls.clearInvoked(this); } public void generatorFinished(GeneratorFinishedEvent event) { ShellCommandListener.DefaultImpls.generatorFinished(this, event); } public void shellInfoReceived(String rawShellInfo) { ShellCommandListener.DefaultImpls.shellInfoReceived(this, rawShellInfo); } public void commandBufferReceived(String buffer) { ShellCommandListener.DefaultImpls.commandBufferReceived(this, buffer); } public void commandHistoryReceived(String history) { ShellCommandListener.DefaultImpls.commandHistoryReceived(this, history); } public void commandFinished(CommandFinishedEvent event) { ShellCommandListener.DefaultImpls.commandFinished(this, event); } public void commandStarted(String command) { ShellCommandListener.DefaultImpls.commandStarted(this, command); } public void promptShown() { ShellCommandListener.DefaultImpls.promptShown(this); } public void initialized() { ShellCommandListener.DefaultImpls.initialized(this); }
/*     */            public void promptStateUpdated(TerminalPromptState newState) {
/*  69 */             Intrinsics.checkNotNullParameter(newState, "newState"); TerminalPromptModelImpl.this.updatePrompt(newState);
/*     */           } }
/*     */         null, 2, null);
/*     */     
/*  73 */     Intrinsics.checkNotNull(getEditor().getProject()); Intrinsics.checkNotNullExpressionValue(EditorColorsManager.TOPIC, "TOPIC"); getEditor().getProject().getMessageBus().connect(this).subscribe(EditorColorsManager.TOPIC, this::_init_$lambda$2);
/*     */ 
/*     */     
/*  76 */     BlockTerminalOptions.Companion.getInstance().addListener(this, this::_init_$lambda$3); }
/*  77 */   @Nullable private RightPromptManager rightPromptManager; @NotNull private TerminalPromptState promptState; @NotNull private TerminalPromptRenderingInfo renderingInfo; @NotNull private final EventDispatcher<TerminalPromptErrorStateListener> errorStateDispatcher; @NotNull public EditorEx getEditor() { return this.editor; } private final DocumentEx getDocument() { Intrinsics.checkNotNullExpressionValue(getEditor().getDocument(), "getDocument(...)"); return getEditor().getDocument(); } @NotNull public TerminalPromptState getPromptState() { return this.promptState; } @NotNull public TerminalPromptRenderingInfo getRenderingInfo() { return this.renderingInfo; } public int getCommandStartOffset() { return getRenderingInfo().getText().length(); } private static final Unit _init_$lambda$3(TerminalPromptModelImpl this$0) { this$0.renderer = this$0.createPromptRenderer();
/*  78 */     this$0.updatePrompt(this$0.getPromptState());
/*  79 */     return Unit.INSTANCE; } @NotNull public String getCommandText() { Intrinsics.checkNotNullExpressionValue(getDocument().getText(new TextRange(getCommandStartOffset(), getDocument().getTextLength())), "getText(...)");
/*     */     return getDocument().getText(new TextRange(getCommandStartOffset(), getDocument().getTextLength())); } public void setCommandText(@NotNull String value) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'value'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_0
/*     */     //   8: aload_1
/*     */     //   9: <illegal opcode> run : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModelImpl;Ljava/lang/String;)Ljava/lang/Runnable;
/*     */     //   14: invokestatic writeInRunUndoTransparentAction : (Ljava/lang/Runnable;)V
/*     */     //   17: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #56	-> 7
/*     */     //   #59	-> 17
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	18	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModelImpl;
/*     */     //   0	18	1	value	Ljava/lang/String; }
/*     */   private static final void _set_commandText_$lambda$0(TerminalPromptModelImpl this$0, String $value) { this$0.getDocument().replaceString(this$0.getCommandStartOffset(), this$0.getDocument().getTextLength(), $value); }
/*     */   private static final void _init_$lambda$1(ReadOnlyFragmentModificationException it) {}
/*     */   private static final void _init_$lambda$2(TerminalPromptModelImpl this$0, EditorColorsScheme it) { this$0.doUpdatePrompt(this$0.getRenderingInfo()); }
/*  84 */   @RequiresEdt public void resetChangesHistory() { WriteIntentReadAction.run(this::resetChangesHistory$lambda$4); } private static final void resetChangesHistory$lambda$4(TerminalPromptModelImpl this$0) {
/*  85 */     Intrinsics.checkNotNull(this$0.getEditor().getProject()); Intrinsics.checkNotNull(UndoManager.getInstance(this$0.getEditor().getProject()), "null cannot be cast to non-null type com.intellij.openapi.command.impl.UndoManagerImpl"); UndoManagerImpl undoManager = (UndoManagerImpl)UndoManager.getInstance(this$0.getEditor().getProject());
/*  86 */     undoManager.invalidateActionsFor(DocumentReferenceManager.getInstance().create((Document)this$0.getDocument()));
/*     */   }
/*     */   private final void updatePrompt(TerminalPromptState state) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield renderer : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderer;
/*     */     //   4: aload_1
/*     */     //   5: invokeinterface calculateRenderingInfo : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptState;)Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderingInfo;
/*     */     //   10: astore_2
/*     */     //   11: aconst_null
/*     */     //   12: aload_0
/*     */     //   13: aload_2
/*     */     //   14: aload_1
/*     */     //   15: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModelImpl;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderingInfo;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptState;)Lkotlin/jvm/functions/Function0;
/*     */     //   20: iconst_1
/*     */     //   21: aconst_null
/*     */     //   22: invokestatic runInEdt$default : (Lcom/intellij/openapi/application/ModalityState;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
/*     */     //   25: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #91	-> 0
/*     */     //   #92	-> 11
/*     */     //   #97	-> 25
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   11	15	2	updatedInfo	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderingInfo;
/*     */     //   0	26	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModelImpl;
/*     */     //   0	26	1	state	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptState;
/*     */   }
/*     */   
/*     */   private static final Unit updatePrompt$lambda$5(TerminalPromptModelImpl this$0, TerminalPromptRenderingInfo $updatedInfo, TerminalPromptState $state) {
/*  93 */     this$0.doUpdatePrompt($updatedInfo);
/*  94 */     this$0.promptState = $state;
/*  95 */     this$0.renderingInfo = $updatedInfo;
/*  96 */     return Unit.INSTANCE;
/*     */   } @RequiresEdt
/*     */   private final void doUpdatePrompt(TerminalPromptRenderingInfo renderingInfo) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: <illegal opcode> run : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModelImpl;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderingInfo;)Ljava/lang/Runnable;
/*     */     //   7: invokestatic writeInRunUndoTransparentAction : (Ljava/lang/Runnable;)V
/*     */     //   10: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModelImpl.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModelImpl$Companion;
/*     */     //   13: aload_0
/*     */     //   14: invokevirtual getEditor : ()Lcom/intellij/openapi/editor/ex/EditorEx;
/*     */     //   17: invokeinterface getMarkupModel : ()Lcom/intellij/openapi/editor/ex/MarkupModelEx;
/*     */     //   22: dup
/*     */     //   23: ldc_w 'getMarkupModel(...)'
/*     */     //   26: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   29: checkcast com/intellij/openapi/editor/markup/MarkupModel
/*     */     //   32: aload_1
/*     */     //   33: invokevirtual getHighlightings : ()Ljava/util/List;
/*     */     //   36: invokevirtual replaceHighlighters$ej_core : (Lcom/intellij/openapi/editor/markup/MarkupModel;Ljava/util/List;)V
/*     */     //   39: aload_1
/*     */     //   40: invokevirtual getRightText : ()Ljava/lang/String;
/*     */     //   43: astore_2
/*     */     //   44: aload_2
/*     */     //   45: checkcast java/lang/CharSequence
/*     */     //   48: invokeinterface length : ()I
/*     */     //   53: ifle -> 60
/*     */     //   56: iconst_1
/*     */     //   57: goto -> 61
/*     */     //   60: iconst_0
/*     */     //   61: ifeq -> 88
/*     */     //   64: aload_0
/*     */     //   65: invokespecial getOrCreateRightPromptManager : ()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/RightPromptManager;
/*     */     //   68: astore_3
/*     */     //   69: aload_3
/*     */     //   70: aload_1
/*     */     //   71: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   74: invokevirtual length : ()I
/*     */     //   77: aload_2
/*     */     //   78: aload_1
/*     */     //   79: invokevirtual getRightHighlightings : ()Ljava/util/List;
/*     */     //   82: invokevirtual update : (ILjava/lang/String;Ljava/util/List;)V
/*     */     //   85: goto -> 119
/*     */     //   88: aload_0
/*     */     //   89: getfield rightPromptManager : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/RightPromptManager;
/*     */     //   92: dup
/*     */     //   93: ifnull -> 112
/*     */     //   96: astore #4
/*     */     //   98: iconst_0
/*     */     //   99: istore #5
/*     */     //   101: aload #4
/*     */     //   103: checkcast com/intellij/openapi/Disposable
/*     */     //   106: invokestatic dispose : (Lcom/intellij/openapi/Disposable;)V
/*     */     //   109: goto -> 114
/*     */     //   112: pop
/*     */     //   113: nop
/*     */     //   114: aload_0
/*     */     //   115: aconst_null
/*     */     //   116: putfield rightPromptManager : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/RightPromptManager;
/*     */     //   119: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #101	-> 0
/*     */     //   #106	-> 10
/*     */     //   #107	-> 39
/*     */     //   #108	-> 44
/*     */     //   #108	-> 61
/*     */     //   #109	-> 64
/*     */     //   #110	-> 69
/*     */     //   #113	-> 88
/*     */     //   #187	-> 98
/*     */     //   #113	-> 101
/*     */     //   #113	-> 109
/*     */     //   #113	-> 112
/*     */     //   #114	-> 114
/*     */     //   #116	-> 119
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   69	16	3	manager	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/RightPromptManager;
/*     */     //   101	8	5	$i$a$-let-TerminalPromptModelImpl$doUpdatePrompt$2	I
/*     */     //   98	11	4	it	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/RightPromptManager;
/*     */     //   44	76	2	rightPrompt	Ljava/lang/String;
/*     */     //   0	120	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModelImpl;
/*     */     //   0	120	1	renderingInfo	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderingInfo;
/*     */   }
/*     */   private static final void doUpdatePrompt$lambda$6(TerminalPromptModelImpl this$0, TerminalPromptRenderingInfo $renderingInfo) {
/* 102 */     Companion.clearGuardedBlocks(this$0.getDocument());
/* 103 */     this$0.getDocument().replaceString(0, this$0.getCommandStartOffset(), $renderingInfo.getText());
/* 104 */     this$0.getDocument().createGuardedBlock(0, $renderingInfo.getText().length());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final RightPromptManager getOrCreateRightPromptManager() {
/* 119 */     if (this.rightPromptManager != null) { RightPromptManager it = this.rightPromptManager;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 187 */       int $i$a$-let-TerminalPromptModelImpl$getOrCreateRightPromptManager$1 = 0; return it; }  RightPromptManager manager = new RightPromptManager((Editor)getEditor(), this.session.getSettings()); Disposer.register(this, manager); this.rightPromptManager = manager; return manager;
/* 188 */   } private final TerminalPromptRenderer createPromptRenderer() { Function0 sizeProvider; switch (WhenMappings.$EnumSwitchMapping$0[BlockTerminalOptions.Companion.getInstance().getPromptStyle().ordinal()]) { case 1: case 2: case 3: sizeProvider = this::createPromptRenderer$lambda$10; }  throw new NoWhenBranchMatchedException(); } private static final TermSize createPromptRenderer$lambda$10(TerminalPromptModelImpl this$0) { TermSize termSize; TerminalModel this_$iv = this$0.session.getModel(); int $i$f$withContentLock = 0; this_$iv.lockContent();
/*     */     
/* 190 */     try { int $i$a$-withContentLock-TerminalPromptModelImpl$createPromptRenderer$sizeProvider$1$1 = 0; termSize = new TermSize(this$0.session.getModel().getWidth(), this$0.session.getModel().getHeight()); }
/*     */     finally
/*     */     
/* 193 */     { this_$iv.unlockContent(); }  return termSize; }
/*     */ 
/*     */   
/*     */   public void setErrorDescription(@Nullable TerminalPromptErrorDescription errorDescription) {
/*     */     ((TerminalPromptErrorStateListener)this.errorStateDispatcher.getMulticaster()).errorStateChanged(errorDescription);
/*     */   }
/*     */   
/*     */   public void addErrorStateListener(@NotNull TerminalPromptErrorStateListener listener, @NotNull Disposable parentDisposable) {
/*     */     Intrinsics.checkNotNullParameter(listener, "listener");
/*     */     Intrinsics.checkNotNullParameter(parentDisposable, "parentDisposable");
/*     */     this.errorStateDispatcher.addListener((EventListener)listener, parentDisposable);
/*     */   }
/*     */   
/*     */   public void dispose() {}
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\002\n\000\n\002\030\002\n\000\b\004\030\0002\0020\001B\007¢\006\004\b\002\020\003J\020\020\006\032\0020\0072\006\020\b\032\0020\tH\026R\016\020\004\032\0020\005X\016¢\006\002\n\000¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModelImpl$PreventMoveToPromptListener;", "Lcom/intellij/openapi/editor/event/CaretListener;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModelImpl;)V", "preventRecursion", "", "caretPositionChanged", "", "event", "Lcom/intellij/openapi/editor/event/CaretEvent;", "ej-core"})
/*     */   private final class PreventMoveToPromptListener implements CaretListener {
/*     */     private boolean preventRecursion;
/*     */     
/*     */     public void caretPositionChanged(@NotNull CaretEvent event) {
/*     */       Intrinsics.checkNotNullParameter(event, "event");
/*     */       if (this.preventRecursion)
/*     */         return; 
/*     */       int newOffset = TerminalPromptModelImpl.this.getEditor().logicalPositionToOffset(event.getNewPosition());
/*     */       if (newOffset < TerminalPromptModelImpl.this.getCommandStartOffset()) {
/*     */         this.preventRecursion = true;
/*     */         try {
/*     */           TerminalPromptModelImpl.this.getEditor().getCaretModel().moveToOffset(TerminalPromptModelImpl.this.getCommandStartOffset());
/*     */         } finally {
/*     */           this.preventRecursion = false;
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\005\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\037\020\004\032\0020\005*\0020\0062\f\020\007\032\b\022\004\022\0020\t0\bH\000¢\006\002\b\nJ\031\020\013\032\0020\005*\0020\0062\006\020\f\032\0020\tH\000¢\006\002\b\rJ\f\020\016\032\0020\005*\0020\017H\002¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModelImpl$Companion;", "", "<init>", "()V", "replaceHighlighters", "", "Lcom/intellij/openapi/editor/markup/MarkupModel;", "highlightings", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo;", "replaceHighlighters$ej_core", "applyHighlighting", "highlighting", "applyHighlighting$ej_core", "clearGuardedBlocks", "Lcom/intellij/openapi/editor/ex/DocumentEx;", "ej-core"})
/*     */   @SourceDebugExtension({"SMAP\nTerminalPromptModelImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalPromptModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModelImpl$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,186:1\n1863#2,2:187\n1863#2,2:189\n*S KotlinDebug\n*F\n+ 1 TerminalPromptModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModelImpl$Companion\n*L\n172#1:187,2\n183#1:189,2\n*E\n"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     public final void replaceHighlighters$ej_core(@NotNull MarkupModel $this$replaceHighlighters, @NotNull List highlightings) {
/*     */       Intrinsics.checkNotNullParameter($this$replaceHighlighters, "<this>");
/*     */       Intrinsics.checkNotNullParameter(highlightings, "highlightings");
/*     */       $this$replaceHighlighters.removeAllHighlighters();
/*     */       Iterable $this$forEach$iv = highlightings;
/*     */       int $i$f$forEach = 0;
/*     */       Iterator iterator = $this$forEach$iv.iterator();
/*     */       if (iterator.hasNext()) {
/*     */         Object element$iv = iterator.next();
/*     */         HighlightingInfo it = (HighlightingInfo)element$iv;
/*     */         int $i$a$-forEach-TerminalPromptModelImpl$Companion$replaceHighlighters$1 = 0;
/*     */         TerminalPromptModelImpl.Companion.applyHighlighting$ej_core($this$replaceHighlighters, it);
/*     */       } 
/*     */     }
/*     */     
/*     */     public final void applyHighlighting$ej_core(@NotNull MarkupModel $this$applyHighlighting, @NotNull HighlightingInfo highlighting) {
/*     */       Intrinsics.checkNotNullParameter($this$applyHighlighting, "<this>");
/*     */       Intrinsics.checkNotNullParameter(highlighting, "highlighting");
/*     */       $this$applyHighlighting.addRangeHighlighter(highlighting.getStartOffset(), highlighting.getEndOffset(), 1000, highlighting.getTextAttributesProvider().getTextAttributes(), HighlighterTargetArea.EXACT_RANGE);
/*     */     }
/*     */     
/*     */     private final void clearGuardedBlocks(DocumentEx $this$clearGuardedBlocks) {
/*     */       Intrinsics.checkNotNullExpressionValue($this$clearGuardedBlocks.getGuardedBlocks(), "getGuardedBlocks(...)");
/*     */       Iterable $this$forEach$iv = $this$clearGuardedBlocks.getGuardedBlocks();
/*     */       int $i$f$forEach = 0;
/*     */       Iterator iterator = $this$forEach$iv.iterator();
/*     */       if (iterator.hasNext()) {
/*     */         Object element$iv = iterator.next();
/*     */         RangeMarker it = (RangeMarker)element$iv;
/*     */         int $i$a$-forEach-TerminalPromptModelImpl$Companion$clearGuardedBlocks$1 = 0;
/*     */         $this$clearGuardedBlocks.removeGuardedBlock(it);
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\TerminalPromptModelImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */