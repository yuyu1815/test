/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptRenderingInfo;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptState;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.BlockTerminalSession;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.CommandFinishedEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.GeneratorFinishedEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.ShellCommandListener;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.StyleRange;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.TerminalModel;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui.TerminalUiUtilsKt;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.actionSystem.DataKey;
/*     */ import com.intellij.openapi.application.ModalityState;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.editor.event.DocumentListener;
/*     */ import com.intellij.openapi.editor.ex.EditorEx;
/*     */ import com.intellij.openapi.editor.ex.ScrollingModelEx;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.Disposer;
/*     */ import com.intellij.terminal.JBTerminalSystemSettingsProviderBase;
/*     */ import com.intellij.util.concurrency.annotations.RequiresEdt;
/*     */ import java.awt.Rectangle;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.text.Regex;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000Â\001\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\004\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\n\n\002\020 \n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\007\b\000\030\000 [2\0020\001:\003YZ[B/\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013¢\006\004\b\f\020\rJ\f\020&\032\0020'*\0020\035H\002J\020\020&\032\0020'*\0060\037R\0020\000H\002J\034\020(\032\0020%2\b\020)\032\004\030\0010'2\b\020*\032\004\030\0010+H\007J\022\020,\032\0020%2\b\020)\032\004\030\0010'H\003J\b\020-\032\0020%H\003J\016\020.\032\0020%2\006\020/\032\00200J\b\0201\032\0020%H\002J\020\0202\032\0020%2\006\0203\032\00204H\002J\b\0205\032\0020%H\007J\b\0206\032\0020%H\007J\025\0207\032\0020%2\006\0208\032\00209H\001¢\006\002\b:J\020\020;\032\0020%2\006\020<\032\0020=H\003J\f\020>\032\0020'*\0020=H\002J\b\020?\032\0020'H\026J\020\020@\032\0020%2\006\020<\032\0020=H\003J\030\020A\032\002042\006\020B\032\0020\0352\006\020C\032\00200H\002J\030\020D\032\0020%2\006\0203\032\002042\006\020<\032\0020=H\002J&\020E\032\0020%2\006\0203\032\002042\006\020F\032\002002\f\020G\032\b\022\004\022\0020I0HH\002J!\020J\032\002HK\"\004\b\000\020K2\f\020L\032\b\022\004\022\002HK0$H\003¢\006\002\020MJ\f\020N\032\0020O*\0020PH\002J\032\020Q\032\0020%2\006\020R\032\0020S2\n\b\002\020T\032\004\030\0010UJ\026\020V\032\0020%2\f\020W\032\b\022\004\022\0020%0$H\007J\b\020X\032\00209H\007R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\021\020\016\032\0020\017¢\006\b\n\000\032\004\b\020\020\021R\021\020\022\032\0020\023¢\006\b\n\000\032\004\b\024\020\025R\016\020\026\032\0020\027X\004¢\006\002\n\000R\016\020\030\032\0020\031X\004¢\006\002\n\000R\016\020\032\032\0020\033X\004¢\006\002\n\000R\020\020\034\032\004\030\0010\035X\016¢\006\002\n\000R\024\020\036\032\b\030\0010\037R\0020\000X\016¢\006\002\n\000R\016\020 \032\0020!X\004¢\006\002\n\000R\032\020\"\032\016\022\n\022\b\022\004\022\0020%0$0#X\004¢\006\002\n\000¨\006\\"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$TerminalListener;", "project", "Lcom/intellij/openapi/project/Project;", "editor", "Lcom/intellij/openapi/editor/ex/EditorEx;", "session", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "settings", "Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;", "focusModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel;", "<init>", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/ex/EditorEx;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel;)V", "outputModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;", "getOutputModel", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;", "selectionModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel;", "getSelectionModel", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel;", "blocksDecorator", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalBlocksDecorator;", "textHighlighter", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalTextHighlighter;", "blockCreationAlarm", "Lcom/intellij/util/Alarm;", "runningCommandContext", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandContext;", "runningCommandInteractivity", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandInteractivity;", "hyperlinkHighlighter", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/hyperlinks/TerminalHyperlinkHighlighter;", "nextBlockCanBeStartedQueue", "Ljava/util/Queue;", "Lkotlin/Function0;", "", "toDebug", "", "startCommandBlock", "command", "prompt", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderingInfo;", "installRunningCommandInteractivity", "disposeRunningCommandInteractivity", "finishCommandBlock", "exitCode", "", "scheduleLastOutputUpdate", "trimLastEmptyLine", "block", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;", "insertEmptyLine", "scrollToBottom", "alternateBufferStateChanged", "enabled", "", "alternateBufferStateChanged$ej_core", "updateCommandOutput", "output", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/PartialCommandOutput;", "toDebugString", "toString", "doUpdateCommandOutput", "createNewBlock", "context", "terminalWidth", "updateBlock", "updateHighlightings", "replaceOffset", "styles", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StyleRange;", "doWithScrollingAware", "T", "action", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "toTextAttributesProvider", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;", "Lcom/jediterm/terminal/TextStyle;", "addDocumentListener", "listener", "Lcom/intellij/openapi/editor/event/DocumentListener;", "disposable", "Lcom/intellij/openapi/Disposable;", "doWhenNextBlockCanBeStarted", "callback", "isCommandRunning", "RunningCommandContext", "RunningCommandInteractivity", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nTerminalOutputController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalOutputController.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 3 TerminalModel.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 TerminalUiUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalUiUtilsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,486:1\n24#2:487\n61#2,5:488\n24#2:493\n24#2:494\n61#2,5:495\n24#2:500\n61#2,5:501\n24#2:513\n61#2,5:514\n24#2:522\n24#2:523\n61#2,5:524\n24#2:529\n61#2,5:530\n24#2:535\n24#2:553\n61#2,5:554\n156#3,7:506\n156#3,7:546\n774#4:519\n865#4,2:520\n1557#4:541\n1628#4,3:542\n311#5,5:536\n1#6:545\n*S KotlinDebug\n*F\n+ 1 TerminalOutputController.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController\n*L\n103#1:487\n103#1:488,5\n122#1:493\n138#1:494\n138#1:495,5\n172#1:500\n172#1:501,5\n190#1:513\n190#1:514,5\n273#1:522\n291#1:523\n291#1:524,5\n323#1:529\n323#1:530,5\n331#1:535\n159#1:553\n159#1:554,5\n178#1:506,7\n112#1:546,7\n239#1:519\n239#1:520,2\n400#1:541\n400#1:542,3\n351#1:536,5\n*E\n"})
/*     */ public final class TerminalOutputController implements TerminalModel.TerminalListener {
/*  40 */   public TerminalOutputController(@NotNull Project project, @NotNull EditorEx editor, @NotNull BlockTerminalSession session, @NotNull JBTerminalSystemSettingsProviderBase settings, @NotNull TerminalFocusModel focusModel) { this.project = project;
/*  41 */     this.editor = editor;
/*  42 */     this.session = session;
/*  43 */     this.settings = settings;
/*     */ 
/*     */     
/*  46 */     this.outputModel = new TerminalOutputModelImpl(this.editor);
/*  47 */     this.selectionModel = new TerminalSelectionModel(this.outputModel);
/*  48 */     this.blocksDecorator = new TerminalBlocksDecorator(this.session.getColorPalette(), this.outputModel, focusModel, this.selectionModel, this.editor);
/*  49 */     this.textHighlighter = new TerminalTextHighlighter(this.outputModel);
/*     */     
/*  51 */     this.blockCreationAlarm = new Alarm(Alarm.ThreadToUse.SWING_THREAD, (Disposable)this.session);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  61 */     this.hyperlinkHighlighter = new TerminalHyperlinkHighlighter(this.project, this.outputModel, (Disposable)this.session);
/*     */     
/*  63 */     this.nextBlockCanBeStartedQueue = new LinkedList<>();
/*     */ 
/*     */     
/*  66 */     this.editor.putUserData(TerminalDataContextUtils.INSTANCE.getIS_OUTPUT_EDITOR_KEY$ej_core(), Boolean.valueOf(true));
/*  67 */     this.editor.setHighlighter(this.textHighlighter);
/*  68 */     TerminalModel.addTerminalListener$default(this.session.getModel(), this, null, 2, null);
/*     */     
/*  70 */     BlockTerminalSession.addCommandListener$default(this.session, new ShellCommandListener() { public void generatorFinished(GeneratorFinishedEvent event) { ShellCommandListener.DefaultImpls.generatorFinished(this, event); } public void shellInfoReceived(String rawShellInfo) { ShellCommandListener.DefaultImpls.shellInfoReceived(this, rawShellInfo); } public void commandBufferReceived(String buffer) { ShellCommandListener.DefaultImpls.commandBufferReceived(this, buffer); } public void commandHistoryReceived(String history) { ShellCommandListener.DefaultImpls.commandHistoryReceived(this, history); } public void promptStateUpdated(TerminalPromptState newState) { ShellCommandListener.DefaultImpls.promptStateUpdated(this, newState); } public void commandFinished(CommandFinishedEvent event) { ShellCommandListener.DefaultImpls.commandFinished(this, event); } public void commandStarted(String command) { ShellCommandListener.DefaultImpls.commandStarted(this, command); } public void promptShown() { ShellCommandListener.DefaultImpls.promptShown(this); } public void initialized() { ShellCommandListener.DefaultImpls.initialized(this); }
/*     */           
/*  72 */           public void clearInvoked() { Intrinsics.checkNotNullExpressionValue(Disposer.newDisposable((Disposable)TerminalOutputController.this.session), "newDisposable(...)"); Disposable disposable = Disposer.newDisposable((Disposable)TerminalOutputController.this.session);
/*     */             
/*  74 */             TerminalOutputController.this.session.addCommandListener(new TerminalOutputController$1$clearInvoked$1(disposable), 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/*  81 */                 disposable); }
/*     */           @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$1$clearInvoked$1", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener;", "commandFinished", "", "event", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/CommandFinishedEvent;", "ej-core"}) public static final class TerminalOutputController$1$clearInvoked$1 implements ShellCommandListener {
/*     */             TerminalOutputController$1$clearInvoked$1(Disposable $disposable) {}
/*     */             public void initialized() { ShellCommandListener.DefaultImpls.initialized(this); }
/*     */             public void promptShown() { ShellCommandListener.DefaultImpls.promptShown(this); }
/*     */             public void commandStarted(String command) { ShellCommandListener.DefaultImpls.commandStarted(this, command); }
/*  87 */             public void promptStateUpdated(TerminalPromptState newState) { ShellCommandListener.DefaultImpls.promptStateUpdated(this, newState); } public void commandHistoryReceived(String history) { ShellCommandListener.DefaultImpls.commandHistoryReceived(this, history); } public void commandBufferReceived(String buffer) { ShellCommandListener.DefaultImpls.commandBufferReceived(this, buffer); } public void shellInfoReceived(String rawShellInfo) { ShellCommandListener.DefaultImpls.shellInfoReceived(this, rawShellInfo); } public void generatorFinished(GeneratorFinishedEvent event) { ShellCommandListener.DefaultImpls.generatorFinished(this, event); } public void clearInvoked() { ShellCommandListener.DefaultImpls.clearInvoked(this); } public void commandFinished(CommandFinishedEvent event) { Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullExpressionValue(ModalityState.any(), "any(...)"); TerminalUiUtilsKt.invokeLater(TerminalUiUtilsKt.getDisposed((Editor)TerminalOutputController.this.editor), ModalityState.any(), TerminalOutputController.this::commandFinished$lambda$0); Disposer.dispose(this.$disposable); } private static final void commandFinished$lambda$0(TerminalOutputController this$0) { TerminalOutputController.this.getOutputModel().clearBlocks(); } } }null, 2, null); } public void onSizeChanged(int width, int height) { TerminalModel.TerminalListener.DefaultImpls.onSizeChanged(this, width, height); } public void onWindowTitleChanged(@NotNull String title) { TerminalModel.TerminalListener.DefaultImpls.onWindowTitleChanged(this, title); } public void onCommandRunningChanged(boolean isRunning) { TerminalModel.TerminalListener.DefaultImpls.onCommandRunningChanged(this, isRunning); } private final String toDebug(RunningCommandContext $this$toDebug) { return "RCContext@" + Integer.toHexString(System.identityHashCode($this$toDebug)) + ":" + $this$toDebug.getCommand(); }
/*     */   public void onAlternateBufferChanged(boolean enabled) { TerminalModel.TerminalListener.DefaultImpls.onAlternateBufferChanged(this, enabled); }
/*     */   public void onBracketedPasteModeChanged(boolean bracketed) { TerminalModel.TerminalListener.DefaultImpls.onBracketedPasteModeChanged(this, bracketed); }
/*     */   @NotNull public final TerminalOutputModel getOutputModel() { return this.outputModel; }
/*  91 */   @NotNull public final TerminalSelectionModel getSelectionModel() { return this.selectionModel; } private final String toDebug(RunningCommandInteractivity $this$toDebug) { return "RCInteractivity@" + Integer.toHexString(System.identityHashCode($this$toDebug)); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequiresEdt
/*     */   public final void startCommandBlock(@Nullable String command, @Nullable TerminalPromptRenderingInfo prompt) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual scrollToBottom : ()V
/*     */     //   4: aload_0
/*     */     //   5: aload_1
/*     */     //   6: invokespecial installRunningCommandInteractivity : (Ljava/lang/String;)V
/*     */     //   9: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandContext
/*     */     //   12: dup
/*     */     //   13: aload_1
/*     */     //   14: aload_2
/*     */     //   15: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderingInfo;)V
/*     */     //   18: astore_3
/*     */     //   19: aload_0
/*     */     //   20: aload_3
/*     */     //   21: putfield runningCommandContext : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandContext;
/*     */     //   24: aload_0
/*     */     //   25: astore #4
/*     */     //   27: iconst_0
/*     */     //   28: istore #5
/*     */     //   30: ldc com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController
/*     */     //   32: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   35: dup
/*     */     //   36: ldc 'getInstance(...)'
/*     */     //   38: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   41: astore #4
/*     */     //   43: nop
/*     */     //   44: aconst_null
/*     */     //   45: astore #5
/*     */     //   47: iconst_0
/*     */     //   48: istore #6
/*     */     //   50: aload #4
/*     */     //   52: invokevirtual isDebugEnabled : ()Z
/*     */     //   55: ifeq -> 115
/*     */     //   58: aload #4
/*     */     //   60: astore #8
/*     */     //   62: iconst_0
/*     */     //   63: istore #7
/*     */     //   65: aload_1
/*     */     //   66: aload_0
/*     */     //   67: getfield runningCommandContext : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandContext;
/*     */     //   70: dup
/*     */     //   71: ifnull -> 82
/*     */     //   74: aload_0
/*     */     //   75: swap
/*     */     //   76: invokespecial toDebug : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandContext;)Ljava/lang/String;
/*     */     //   79: goto -> 84
/*     */     //   82: pop
/*     */     //   83: aconst_null
/*     */     //   84: aload_0
/*     */     //   85: getfield runningCommandInteractivity : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandInteractivity;
/*     */     //   88: dup
/*     */     //   89: ifnull -> 100
/*     */     //   92: aload_0
/*     */     //   93: swap
/*     */     //   94: invokespecial toDebug : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandInteractivity;)Ljava/lang/String;
/*     */     //   97: goto -> 102
/*     */     //   100: pop
/*     */     //   101: aconst_null
/*     */     //   102: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   107: aload #8
/*     */     //   109: swap
/*     */     //   110: aload #5
/*     */     //   112: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   115: nop
/*     */     //   116: aload_0
/*     */     //   117: aload_3
/*     */     //   118: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandContext;)Lkotlin/jvm/functions/Function0;
/*     */     //   123: astore #4
/*     */     //   125: aload_0
/*     */     //   126: getfield blockCreationAlarm : Lcom/intellij/util/Alarm;
/*     */     //   129: aload #4
/*     */     //   131: <illegal opcode> run : (Lkotlin/jvm/functions/Function0;)Ljava/lang/Runnable;
/*     */     //   136: sipush #200
/*     */     //   139: invokevirtual addRequest : (Ljava/lang/Runnable;I)V
/*     */     //   142: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #99	-> 0
/*     */     //   #100	-> 4
/*     */     //   #101	-> 9
/*     */     //   #102	-> 19
/*     */     //   #103	-> 24
/*     */     //   #487	-> 30
/*     */     //   #103	-> 43
/*     */     //   #488	-> 44
/*     */     //   #489	-> 50
/*     */     //   #490	-> 58
/*     */     //   #104	-> 65
/*     */     //   #105	-> 66
/*     */     //   #106	-> 84
/*     */     //   #490	-> 110
/*     */     //   #492	-> 115
/*     */     //   #110	-> 116
/*     */     //   #116	-> 125
/*     */     //   #117	-> 142
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   30	11	5	$i$f$thisLogger	I
/*     */     //   27	14	4	$this$thisLogger$iv	Ljava/lang/Object;
/*     */     //   65	42	7	$i$a$-debug$default-TerminalOutputController$startCommandBlock$1	I
/*     */     //   50	66	6	$i$f$debug	I
/*     */     //   44	72	4	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   47	69	5	e$iv	Ljava/lang/Exception;
/*     */     //   19	124	3	newRunningCommandContext	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandContext;
/*     */     //   125	18	4	createBlockRequest	Lkotlin/jvm/functions/Function0;
/*     */     //   0	143	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController;
/*     */     //   0	143	1	command	Ljava/lang/String;
/*     */     //   0	143	2	prompt	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderingInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Unit startCommandBlock$lambda$3(TerminalOutputController this$0, RunningCommandContext $newRunningCommandContext) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_0
/*     */     //   2: aload_1
/*     */     //   3: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandContext;)Lkotlin/jvm/functions/Function0;
/*     */     //   8: invokespecial doWithScrollingAware : (Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
/*     */     //   11: pop
/*     */     //   12: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   15: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #111	-> 0
/*     */     //   #115	-> 12
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	16	0	this$0	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController;
/*     */     //   0	16	1	$newRunningCommandContext	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandContext;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Unit startCommandBlock$lambda$3$lambda$2(TerminalOutputController this$0, RunningCommandContext $newRunningCommandContext) {
/*     */     int i;
/* 112 */     TerminalModel this_$iv = this$0.session.getModel(); int $i$f$withContentLock = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 546 */     this_$iv.lockContent();
/*     */     
/* 548 */     try { int $i$a$-withContentLock-TerminalOutputController$startCommandBlock$createBlockRequest$1$1$terminalWidth$1 = 0; i = this$0.session.getModel().getWidth(); }
/*     */     finally
/*     */     
/* 551 */     { this_$iv.unlockContent(); }  int terminalWidth = i;
/*     */     this$0.createNewBlock($newRunningCommandContext, terminalWidth);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final void startCommandBlock$lambda$4(Function0 $tmp0) {
/*     */     $tmp0.invoke();
/*     */   }
/*     */   
/*     */   @RequiresEdt(generateAssertion = false)
/*     */   private final void installRunningCommandInteractivity(String command) {
/*     */     if (this.runningCommandInteractivity != null) {
/*     */       Object $this$thisLogger$iv = this;
/*     */       int $i$f$thisLogger = 0;
/*     */       Intrinsics.checkNotNullExpressionValue(Logger.getInstance(TerminalOutputController.class), "getInstance(...)");
/*     */       Logger.getInstance(TerminalOutputController.class).error("Running command interactivity is already installed");
/*     */       disposeRunningCommandInteractivity();
/*     */     } 
/*     */     this.runningCommandInteractivity = new RunningCommandInteractivity(command);
/*     */   }
/*     */   
/*     */   @RequiresEdt(generateAssertion = false)
/*     */   private final void disposeRunningCommandInteractivity() {
/*     */     if (this.runningCommandInteractivity == null)
/*     */       throw new IllegalStateException("No running command interactivity".toString()); 
/*     */     Intrinsics.checkNotNull(this.runningCommandInteractivity);
/*     */     Disposer.dispose(this.runningCommandInteractivity.getDisposable());
/*     */     this.runningCommandInteractivity = null;
/*     */   }
/*     */   
/*     */   public final void finishCommandBlock(int exitCode) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokespecial scheduleLastOutputUpdate : ()V
/*     */     //   4: aload_0
/*     */     //   5: astore_2
/*     */     //   6: iconst_0
/*     */     //   7: istore_3
/*     */     //   8: ldc com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController
/*     */     //   10: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   13: dup
/*     */     //   14: ldc 'getInstance(...)'
/*     */     //   16: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   19: astore_2
/*     */     //   20: nop
/*     */     //   21: aconst_null
/*     */     //   22: astore_3
/*     */     //   23: iconst_0
/*     */     //   24: istore #4
/*     */     //   26: aload_2
/*     */     //   27: invokevirtual isDebugEnabled : ()Z
/*     */     //   30: ifeq -> 87
/*     */     //   33: aload_2
/*     */     //   34: astore #6
/*     */     //   36: iconst_0
/*     */     //   37: istore #5
/*     */     //   39: aload_0
/*     */     //   40: getfield runningCommandContext : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandContext;
/*     */     //   43: dup
/*     */     //   44: ifnull -> 55
/*     */     //   47: aload_0
/*     */     //   48: swap
/*     */     //   49: invokespecial toDebug : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandContext;)Ljava/lang/String;
/*     */     //   52: goto -> 57
/*     */     //   55: pop
/*     */     //   56: aconst_null
/*     */     //   57: aload_0
/*     */     //   58: getfield runningCommandInteractivity : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandInteractivity;
/*     */     //   61: dup
/*     */     //   62: ifnull -> 73
/*     */     //   65: aload_0
/*     */     //   66: swap
/*     */     //   67: invokespecial toDebug : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandInteractivity;)Ljava/lang/String;
/*     */     //   70: goto -> 75
/*     */     //   73: pop
/*     */     //   74: aconst_null
/*     */     //   75: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   80: aload #6
/*     */     //   82: swap
/*     */     //   83: aload_3
/*     */     //   84: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   87: nop
/*     */     //   88: aload_0
/*     */     //   89: getfield editor : Lcom/intellij/openapi/editor/ex/EditorEx;
/*     */     //   92: checkcast com/intellij/openapi/editor/Editor
/*     */     //   95: invokestatic getDisposed : (Lcom/intellij/openapi/editor/Editor;)Lkotlin/jvm/functions/Function0;
/*     */     //   98: invokestatic any : ()Lcom/intellij/openapi/application/ModalityState;
/*     */     //   101: dup
/*     */     //   102: ldc_w 'any(...)'
/*     */     //   105: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   108: aload_0
/*     */     //   109: iload_1
/*     */     //   110: <illegal opcode> run : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController;I)Ljava/lang/Runnable;
/*     */     //   115: invokestatic invokeLater : (Lkotlin/jvm/functions/Function0;Lcom/intellij/openapi/application/ModalityState;Ljava/lang/Runnable;)V
/*     */     //   118: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #136	-> 0
/*     */     //   #138	-> 4
/*     */     //   #494	-> 8
/*     */     //   #138	-> 20
/*     */     //   #495	-> 21
/*     */     //   #496	-> 26
/*     */     //   #497	-> 33
/*     */     //   #139	-> 39
/*     */     //   #497	-> 83
/*     */     //   #499	-> 87
/*     */     //   #142	-> 88
/*     */     //   #164	-> 118
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   8	11	3	$i$f$thisLogger	I
/*     */     //   6	13	2	$this$thisLogger$iv	Ljava/lang/Object;
/*     */     //   39	41	5	$i$a$-debug$default-TerminalOutputController$finishCommandBlock$1	I
/*     */     //   26	62	4	$i$f$debug	I
/*     */     //   21	67	2	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   23	65	3	e$iv	Ljava/lang/Exception;
/*     */     //   0	119	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController;
/*     */     //   0	119	1	exitCode	I
/*     */   }
/*     */   
/*     */   private static final void finishCommandBlock$lambda$8(TerminalOutputController this$0, int $exitCode) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield outputModel : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;
/*     */     //   4: invokestatic getActiveBlock : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;)Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;
/*     */     //   7: dup
/*     */     //   8: ifnonnull -> 26
/*     */     //   11: pop
/*     */     //   12: new java/lang/IllegalStateException
/*     */     //   15: dup
/*     */     //   16: ldc_w 'No active block'
/*     */     //   19: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   22: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   25: athrow
/*     */     //   26: astore_2
/*     */     //   27: aload_0
/*     */     //   28: aload_0
/*     */     //   29: aload_2
/*     */     //   30: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;)Lkotlin/jvm/functions/Function0;
/*     */     //   35: invokespecial doWithScrollingAware : (Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
/*     */     //   38: pop
/*     */     //   39: aload_0
/*     */     //   40: invokespecial disposeRunningCommandInteractivity : ()V
/*     */     //   43: aload_0
/*     */     //   44: getfield editor : Lcom/intellij/openapi/editor/ex/EditorEx;
/*     */     //   47: invokeinterface getDocument : ()Lcom/intellij/openapi/editor/ex/DocumentEx;
/*     */     //   52: aload_2
/*     */     //   53: invokestatic getTextRange : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;)Lcom/intellij/openapi/util/TextRange;
/*     */     //   56: invokeinterface getText : (Lcom/intellij/openapi/util/TextRange;)Ljava/lang/String;
/*     */     //   61: dup
/*     */     //   62: ldc_w 'getText(...)'
/*     */     //   65: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   68: checkcast java/lang/CharSequence
/*     */     //   71: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   74: ifeq -> 90
/*     */     //   77: aload_0
/*     */     //   78: getfield outputModel : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;
/*     */     //   81: aload_2
/*     */     //   82: invokeinterface removeBlock : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;)V
/*     */     //   87: goto -> 118
/*     */     //   90: aload_0
/*     */     //   91: getfield outputModel : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;
/*     */     //   94: aload_2
/*     */     //   95: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlockInfo
/*     */     //   98: dup
/*     */     //   99: iload_1
/*     */     //   100: invokespecial <init> : (I)V
/*     */     //   103: invokeinterface setBlockInfo : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlockInfo;)V
/*     */     //   108: aload_0
/*     */     //   109: getfield outputModel : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;
/*     */     //   112: aload_2
/*     */     //   113: invokeinterface finalizeBlock : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;)V
/*     */     //   118: aload_0
/*     */     //   119: aconst_null
/*     */     //   120: putfield runningCommandContext : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandContext;
/*     */     //   123: aload_0
/*     */     //   124: astore_3
/*     */     //   125: iconst_0
/*     */     //   126: istore #4
/*     */     //   128: ldc com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController
/*     */     //   130: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   133: dup
/*     */     //   134: ldc 'getInstance(...)'
/*     */     //   136: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   139: astore_3
/*     */     //   140: nop
/*     */     //   141: aconst_null
/*     */     //   142: astore #4
/*     */     //   144: iconst_0
/*     */     //   145: istore #5
/*     */     //   147: aload_3
/*     */     //   148: invokevirtual isDebugEnabled : ()Z
/*     */     //   151: ifeq -> 209
/*     */     //   154: aload_3
/*     */     //   155: astore #7
/*     */     //   157: iconst_0
/*     */     //   158: istore #6
/*     */     //   160: aload_0
/*     */     //   161: getfield runningCommandContext : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandContext;
/*     */     //   164: dup
/*     */     //   165: ifnull -> 176
/*     */     //   168: aload_0
/*     */     //   169: swap
/*     */     //   170: invokespecial toDebug : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandContext;)Ljava/lang/String;
/*     */     //   173: goto -> 178
/*     */     //   176: pop
/*     */     //   177: aconst_null
/*     */     //   178: aload_0
/*     */     //   179: getfield runningCommandInteractivity : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandInteractivity;
/*     */     //   182: dup
/*     */     //   183: ifnull -> 194
/*     */     //   186: aload_0
/*     */     //   187: swap
/*     */     //   188: invokespecial toDebug : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandInteractivity;)Ljava/lang/String;
/*     */     //   191: goto -> 196
/*     */     //   194: pop
/*     */     //   195: aconst_null
/*     */     //   196: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   201: aload #7
/*     */     //   203: swap
/*     */     //   204: aload #4
/*     */     //   206: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   209: nop
/*     */     //   210: aload_0
/*     */     //   211: getfield nextBlockCanBeStartedQueue : Ljava/util/Queue;
/*     */     //   214: invokeinterface poll : ()Ljava/lang/Object;
/*     */     //   219: checkcast kotlin/jvm/functions/Function0
/*     */     //   222: dup
/*     */     //   223: ifnull -> 235
/*     */     //   226: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   231: pop
/*     */     //   232: goto -> 236
/*     */     //   235: pop
/*     */     //   236: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #143	-> 0
/*     */     //   #144	-> 27
/*     */     //   #147	-> 39
/*     */     //   #149	-> 43
/*     */     //   #150	-> 77
/*     */     //   #153	-> 90
/*     */     //   #154	-> 108
/*     */     //   #157	-> 118
/*     */     //   #159	-> 123
/*     */     //   #553	-> 128
/*     */     //   #159	-> 140
/*     */     //   #554	-> 141
/*     */     //   #555	-> 147
/*     */     //   #556	-> 154
/*     */     //   #160	-> 160
/*     */     //   #556	-> 204
/*     */     //   #558	-> 209
/*     */     //   #162	-> 210
/*     */     //   #163	-> 236
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   128	11	4	$i$f$thisLogger	I
/*     */     //   125	14	3	$this$thisLogger$iv	Ljava/lang/Object;
/*     */     //   160	41	6	$i$a$-debug$default-TerminalOutputController$finishCommandBlock$2$2	I
/*     */     //   147	63	5	$i$f$debug	I
/*     */     //   141	69	3	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   144	66	4	e$iv	Ljava/lang/Exception;
/*     */     //   27	210	2	block	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;
/*     */     //   0	237	0	this$0	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController;
/*     */     //   0	237	1	$exitCode	I
/*     */   }
/*     */   
/*     */   private static final Unit finishCommandBlock$lambda$8$lambda$6(TerminalOutputController this$0, CommandBlock $block) {
/*     */     this$0.trimLastEmptyLine($block);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private final void scheduleLastOutputUpdate() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield runningCommandInteractivity : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandInteractivity;
/*     */     //   4: dup
/*     */     //   5: ifnull -> 14
/*     */     //   8: invokevirtual getContentUpdatesScheduler : ()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputContentUpdatesScheduler;
/*     */     //   11: goto -> 16
/*     */     //   14: pop
/*     */     //   15: aconst_null
/*     */     //   16: astore_1
/*     */     //   17: aload_1
/*     */     //   18: dup
/*     */     //   19: ifnull -> 36
/*     */     //   22: invokevirtual getFinished : ()Z
/*     */     //   25: ifne -> 32
/*     */     //   28: iconst_1
/*     */     //   29: goto -> 38
/*     */     //   32: iconst_0
/*     */     //   33: goto -> 38
/*     */     //   36: pop
/*     */     //   37: iconst_0
/*     */     //   38: ifeq -> 48
/*     */     //   41: aload_1
/*     */     //   42: invokevirtual finishUpdating : ()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/PartialCommandOutput;
/*     */     //   45: goto -> 210
/*     */     //   48: aload_0
/*     */     //   49: astore_3
/*     */     //   50: iconst_0
/*     */     //   51: istore #4
/*     */     //   53: ldc com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController
/*     */     //   55: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   58: dup
/*     */     //   59: ldc 'getInstance(...)'
/*     */     //   61: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   64: astore_3
/*     */     //   65: nop
/*     */     //   66: aconst_null
/*     */     //   67: astore #4
/*     */     //   69: iconst_0
/*     */     //   70: istore #5
/*     */     //   72: aload_3
/*     */     //   73: invokevirtual isDebugEnabled : ()Z
/*     */     //   76: ifeq -> 96
/*     */     //   79: aload_3
/*     */     //   80: astore #8
/*     */     //   82: iconst_0
/*     */     //   83: istore #6
/*     */     //   85: ldc_w 'scheduleLastOutputUpdate: fallback'
/*     */     //   88: aload #8
/*     */     //   90: swap
/*     */     //   91: aload #4
/*     */     //   93: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   96: nop
/*     */     //   97: aload_0
/*     */     //   98: getfield session : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;
/*     */     //   101: invokevirtual getModel : ()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel;
/*     */     //   104: astore #4
/*     */     //   106: iconst_0
/*     */     //   107: istore #5
/*     */     //   109: aload #4
/*     */     //   111: invokevirtual lockContent : ()V
/*     */     //   114: nop
/*     */     //   115: iconst_0
/*     */     //   116: istore #6
/*     */     //   118: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputScraperImpl.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputScraperImpl$Companion;
/*     */     //   121: aload_0
/*     */     //   122: getfield session : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;
/*     */     //   125: invokevirtual scrapeOutput : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;)Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StyledCommandOutput;
/*     */     //   128: aload_0
/*     */     //   129: getfield session : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;
/*     */     //   132: invokevirtual getModel : ()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel;
/*     */     //   135: invokevirtual getWidth : ()I
/*     */     //   138: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   141: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*     */     //   144: astore #7
/*     */     //   146: aload #4
/*     */     //   148: invokevirtual unlockContent : ()V
/*     */     //   151: goto -> 164
/*     */     //   154: astore #6
/*     */     //   156: aload #4
/*     */     //   158: invokevirtual unlockContent : ()V
/*     */     //   161: aload #6
/*     */     //   163: athrow
/*     */     //   164: aload #7
/*     */     //   166: nop
/*     */     //   167: astore_3
/*     */     //   168: aload_3
/*     */     //   169: invokevirtual component1 : ()Ljava/lang/Object;
/*     */     //   172: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StyledCommandOutput
/*     */     //   175: astore #4
/*     */     //   177: aload_3
/*     */     //   178: invokevirtual component2 : ()Ljava/lang/Object;
/*     */     //   181: checkcast java/lang/Number
/*     */     //   184: invokevirtual intValue : ()I
/*     */     //   187: istore #5
/*     */     //   189: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/PartialCommandOutput
/*     */     //   192: dup
/*     */     //   193: aload #4
/*     */     //   195: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   198: aload #4
/*     */     //   200: invokevirtual getStyleRanges : ()Ljava/util/List;
/*     */     //   203: iconst_0
/*     */     //   204: iload #5
/*     */     //   206: iconst_0
/*     */     //   207: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;IIZ)V
/*     */     //   210: astore_2
/*     */     //   211: aload_0
/*     */     //   212: astore_3
/*     */     //   213: iconst_0
/*     */     //   214: istore #4
/*     */     //   216: ldc com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController
/*     */     //   218: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   221: dup
/*     */     //   222: ldc 'getInstance(...)'
/*     */     //   224: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   227: astore_3
/*     */     //   228: nop
/*     */     //   229: aconst_null
/*     */     //   230: astore #4
/*     */     //   232: iconst_0
/*     */     //   233: istore #5
/*     */     //   235: aload_3
/*     */     //   236: invokevirtual isDebugEnabled : ()Z
/*     */     //   239: ifeq -> 276
/*     */     //   242: aload_3
/*     */     //   243: astore #8
/*     */     //   245: iconst_0
/*     */     //   246: istore #6
/*     */     //   248: aload_2
/*     */     //   249: dup
/*     */     //   250: ifnull -> 261
/*     */     //   253: aload_0
/*     */     //   254: swap
/*     */     //   255: invokespecial toDebugString : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/PartialCommandOutput;)Ljava/lang/String;
/*     */     //   258: goto -> 263
/*     */     //   261: pop
/*     */     //   262: aconst_null
/*     */     //   263: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   268: aload #8
/*     */     //   270: swap
/*     */     //   271: aload #4
/*     */     //   273: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   276: nop
/*     */     //   277: aload_2
/*     */     //   278: ifnull -> 311
/*     */     //   281: aload_0
/*     */     //   282: getfield editor : Lcom/intellij/openapi/editor/ex/EditorEx;
/*     */     //   285: checkcast com/intellij/openapi/editor/Editor
/*     */     //   288: invokestatic getDisposed : (Lcom/intellij/openapi/editor/Editor;)Lkotlin/jvm/functions/Function0;
/*     */     //   291: invokestatic any : ()Lcom/intellij/openapi/application/ModalityState;
/*     */     //   294: dup
/*     */     //   295: ldc_w 'any(...)'
/*     */     //   298: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   301: aload_0
/*     */     //   302: aload_2
/*     */     //   303: <illegal opcode> run : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/PartialCommandOutput;)Ljava/lang/Runnable;
/*     */     //   308: invokestatic invokeLater : (Lkotlin/jvm/functions/Function0;Lcom/intellij/openapi/application/ModalityState;Ljava/lang/Runnable;)V
/*     */     //   311: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #167	-> 0
/*     */     //   #168	-> 17
/*     */     //   #169	-> 41
/*     */     //   #172	-> 48
/*     */     //   #500	-> 53
/*     */     //   #172	-> 65
/*     */     //   #501	-> 66
/*     */     //   #502	-> 72
/*     */     //   #503	-> 79
/*     */     //   #173	-> 85
/*     */     //   #503	-> 91
/*     */     //   #505	-> 96
/*     */     //   #178	-> 97
/*     */     //   #506	-> 109
/*     */     //   #507	-> 114
/*     */     //   #508	-> 115
/*     */     //   #179	-> 118
/*     */     //   #508	-> 144
/*     */     //   #511	-> 146
/*     */     //   #512	-> 151
/*     */     //   #511	-> 154
/*     */     //   #507	-> 166
/*     */     //   #178	-> 167
/*     */     //   #181	-> 189
/*     */     //   #182	-> 193
/*     */     //   #183	-> 198
/*     */     //   #184	-> 203
/*     */     //   #185	-> 204
/*     */     //   #186	-> 206
/*     */     //   #181	-> 207
/*     */     //   #168	-> 210
/*     */     //   #190	-> 211
/*     */     //   #513	-> 216
/*     */     //   #190	-> 228
/*     */     //   #514	-> 229
/*     */     //   #515	-> 235
/*     */     //   #516	-> 242
/*     */     //   #191	-> 248
/*     */     //   #516	-> 271
/*     */     //   #518	-> 276
/*     */     //   #193	-> 277
/*     */     //   #194	-> 281
/*     */     //   #198	-> 311
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   53	11	4	$i$f$thisLogger	I
/*     */     //   50	14	3	$this$thisLogger$iv	Ljava/lang/Object;
/*     */     //   85	3	6	$i$a$-debug$default-TerminalOutputController$scheduleLastOutputUpdate$lastOutput$1	I
/*     */     //   72	25	5	$i$f$debug	I
/*     */     //   66	31	3	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   69	28	4	e$iv	Ljava/lang/Exception;
/*     */     //   118	26	6	$i$a$-withContentLock-TerminalOutputController$scheduleLastOutputUpdate$lastOutput$2	I
/*     */     //   109	58	5	$i$f$withContentLock	I
/*     */     //   106	61	4	this_$iv	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel;
/*     */     //   177	33	4	output	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StyledCommandOutput;
/*     */     //   189	21	5	terminalWidth	I
/*     */     //   216	11	4	$i$f$thisLogger	I
/*     */     //   213	14	3	$this$thisLogger$iv	Ljava/lang/Object;
/*     */     //   248	20	6	$i$a$-debug$default-TerminalOutputController$scheduleLastOutputUpdate$1	I
/*     */     //   235	42	5	$i$f$debug	I
/*     */     //   229	48	3	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   232	45	4	e$iv	Ljava/lang/Exception;
/*     */     //   17	295	1	contentUpdatesScheduler	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputContentUpdatesScheduler;
/*     */     //   211	101	2	lastOutput	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/PartialCommandOutput;
/*     */     //   0	312	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   114	146	154	finally
/*     */     //   154	156	154	finally
/*     */   }
/*     */   
/*     */   private static final void scheduleLastOutputUpdate$lambda$12(TerminalOutputController this$0, PartialCommandOutput $lastOutput) {
/*     */     this$0.updateCommandOutput($lastOutput);
/*     */   }
/*     */   
/*     */   private final void trimLastEmptyLine(CommandBlock block) {
/*     */     if (!CommandBlockImplKt.getWithOutput(block))
/*     */       return; 
/*     */     int outputStartOffset = block.getOutputStartOffset() - ((CommandBlockImplKt.getWithPrompt(block) || CommandBlockImplKt.getWithCommand(block)) ? 1 : 0);
/*     */     CharSequence outputText = this.editor.getDocument().getCharsSequence().subSequence(outputStartOffset, block.getEndOffset());
/*     */     int lastNewLineInd = StringsKt.lastIndexOf$default(outputText, '\n', 0, false, 6, null);
/*     */     CharSequence lastLine = outputText.subSequence(lastNewLineInd + 1, outputText.length());
/*     */     boolean outputEndsWithNewline = (lastLine.length() == 0);
/*     */     boolean outputEndsWithWhitespacesForZsh = (this.session.getShellIntegration().getShellType() == ShellType.ZSH && StringsKt.isBlank(lastLine));
/*     */     if (outputEndsWithNewline || outputEndsWithWhitespacesForZsh) {
/*     */       int trimStartOffset = outputStartOffset + Math.max(0, lastNewLineInd);
/*     */       List<HighlightingInfo> list1 = this.outputModel.getHighlightings(block);
/*     */       int $i$f$filter = 0;
/*     */       List<HighlightingInfo> list2 = list1;
/*     */       Collection<Object> destination$iv$iv = new ArrayList();
/*     */       int $i$f$filterTo = 0;
/*     */       for (HighlightingInfo element$iv$iv : list2) {
/*     */         HighlightingInfo it = element$iv$iv;
/*     */         int $i$a$-filter-TerminalOutputController$trimLastEmptyLine$highlightings$1 = 0;
/*     */         if ((it.getEndOffset() <= trimStartOffset))
/*     */           destination$iv$iv.add(element$iv$iv); 
/*     */       } 
/*     */       List<HighlightingInfo> highlightings = (List)destination$iv$iv;
/*     */       this.outputModel.putHighlightings(block, highlightings);
/*     */       this.editor.getDocument().deleteString(trimStartOffset, block.getEndOffset());
/*     */       this.hyperlinkHighlighter.highlightHyperlinks(block);
/*     */     } 
/*     */   }
/*     */   
/*     */   @RequiresEdt
/*     */   public final void insertEmptyLine() {
/*     */     this.editor.getDocument().insertString(this.editor.getDocument().getTextLength(), "\n");
/*     */     scrollToBottom();
/*     */   }
/*     */   
/*     */   @RequiresEdt
/*     */   public final void scrollToBottom() {
/*     */     Intrinsics.checkNotNullExpressionValue(this.editor.getScrollingModel(), "getScrollingModel(...)");
/*     */     ScrollingModelEx scrollingModel = this.editor.getScrollingModel();
/*     */     scrollingModel.disableAnimation();
/*     */     try {
/*     */       Intrinsics.checkNotNullExpressionValue(this.editor.getScrollingModel().getVisibleArea(), "getVisibleArea(...)");
/*     */       Rectangle visibleArea = this.editor.getScrollingModel().getVisibleArea();
/*     */       scrollingModel.scrollVertically(this.editor.getContentComponent().getHeight() - visibleArea.height);
/*     */     } finally {
/*     */       scrollingModel.enableAnimation();
/*     */     } 
/*     */   }
/*     */   
/*     */   @RequiresEdt(generateAssertion = false)
/*     */   public final void alternateBufferStateChanged$ej_core(boolean enabled) {
/*     */     if (this.runningCommandContext == null) {
/*     */       Object $this$thisLogger$iv = this;
/*     */       int $i$f$thisLogger = 0;
/*     */       Intrinsics.checkNotNullExpressionValue(Logger.getInstance(TerminalOutputController.class), "getInstance(...)");
/*     */       Logger.getInstance(TerminalOutputController.class).warn("Alternate screen buffer changed (" + enabled + "), but no running command");
/*     */     } 
/*     */     if (enabled) {
/*     */       if (this.runningCommandInteractivity != null)
/*     */         disposeRunningCommandInteractivity(); 
/*     */     } else {
/*     */       RunningCommandContext rcc = this.runningCommandContext;
/*     */       if (rcc != null && this.runningCommandInteractivity == null)
/*     */         installRunningCommandInteractivity(rcc.getCommand()); 
/*     */     } 
/*     */   }
/*     */   
/*     */   @RequiresEdt(generateAssertion = false)
/*     */   private final void updateCommandOutput(PartialCommandOutput output) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: astore_2
/*     */     //   2: iconst_0
/*     */     //   3: istore_3
/*     */     //   4: ldc com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController
/*     */     //   6: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   9: dup
/*     */     //   10: ldc 'getInstance(...)'
/*     */     //   12: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   15: astore_2
/*     */     //   16: nop
/*     */     //   17: aconst_null
/*     */     //   18: astore_3
/*     */     //   19: iconst_0
/*     */     //   20: istore #4
/*     */     //   22: aload_2
/*     */     //   23: invokevirtual isDebugEnabled : ()Z
/*     */     //   26: ifeq -> 61
/*     */     //   29: aload_2
/*     */     //   30: astore #6
/*     */     //   32: iconst_0
/*     */     //   33: istore #5
/*     */     //   35: aload_0
/*     */     //   36: aload_1
/*     */     //   37: invokespecial toDebugString : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/PartialCommandOutput;)Ljava/lang/String;
/*     */     //   40: aload_0
/*     */     //   41: getfield editor : Lcom/intellij/openapi/editor/ex/EditorEx;
/*     */     //   44: invokeinterface isDisposed : ()Z
/*     */     //   49: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Z)Ljava/lang/String;
/*     */     //   54: aload #6
/*     */     //   56: swap
/*     */     //   57: aload_3
/*     */     //   58: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   61: nop
/*     */     //   62: aload_0
/*     */     //   63: getfield editor : Lcom/intellij/openapi/editor/ex/EditorEx;
/*     */     //   66: invokeinterface isDisposed : ()Z
/*     */     //   71: ifeq -> 75
/*     */     //   74: return
/*     */     //   75: aload_0
/*     */     //   76: aload_0
/*     */     //   77: aload_1
/*     */     //   78: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/PartialCommandOutput;)Lkotlin/jvm/functions/Function0;
/*     */     //   83: invokespecial doWithScrollingAware : (Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
/*     */     //   86: pop
/*     */     //   87: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #291	-> 0
/*     */     //   #523	-> 4
/*     */     //   #291	-> 16
/*     */     //   #524	-> 17
/*     */     //   #525	-> 22
/*     */     //   #526	-> 29
/*     */     //   #292	-> 35
/*     */     //   #526	-> 57
/*     */     //   #528	-> 61
/*     */     //   #295	-> 62
/*     */     //   #296	-> 74
/*     */     //   #298	-> 75
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   4	11	3	$i$f$thisLogger	I
/*     */     //   2	13	2	$this$thisLogger$iv	Ljava/lang/Object;
/*     */     //   35	19	5	$i$a$-debug$default-TerminalOutputController$updateCommandOutput$1	I
/*     */     //   22	40	4	$i$f$debug	I
/*     */     //   17	45	2	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   19	43	3	e$iv	Ljava/lang/Exception;
/*     */     //   0	88	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController;
/*     */     //   0	88	1	output	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/PartialCommandOutput;
/*     */   }
/*     */   
/*     */   private static final Unit updateCommandOutput$lambda$15(TerminalOutputController this$0, PartialCommandOutput $output) {
/*     */     this$0.doUpdateCommandOutput($output);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private final String toDebugString(PartialCommandOutput $this$toDebugString) {
/*     */     int length = $this$toDebugString.getText().length();
/*     */     String str1 = $this$toDebugString.getText();
/*     */     Regex regex = new Regex("[\r\n]");
/*     */     String str2 = "\\n";
/*     */     str1 = regex.replace(str1, str2);
/*     */     regex = new Regex("\\s{3,}");
/*     */     str2 = " . ";
/*     */     String noSpaces = regex.replace(str1, str2);
/*     */     String safeText = "{" + length + "}:`" + StringUtil.firstLast(noSpaces, 30) + "`";
/*     */     String toDump = (($this$toDebugString.getText().length() == 0)) ? "<empty>" : (StringsKt.isBlank($this$toDebugString.getText()) ? "<blank>" : safeText);
/*     */     return "PartialCO[idx:" + $this$toDebugString.getLogicalLineIndex() + "-w:" + $this$toDebugString.getTerminalWidth() + "-d:" + $this$toDebugString.isChangesDiscarded() + "]:" + toDump;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return getClass().getSimpleName() + "@" + getClass().getSimpleName();
/*     */   }
/*     */   
/*     */   @RequiresEdt(generateAssertion = false)
/*     */   private final void doUpdateCommandOutput(PartialCommandOutput output) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: astore_2
/*     */     //   2: iconst_0
/*     */     //   3: istore_3
/*     */     //   4: ldc com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController
/*     */     //   6: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   9: dup
/*     */     //   10: ldc 'getInstance(...)'
/*     */     //   12: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   15: astore_2
/*     */     //   16: nop
/*     */     //   17: aconst_null
/*     */     //   18: astore_3
/*     */     //   19: iconst_0
/*     */     //   20: istore #4
/*     */     //   22: aload_2
/*     */     //   23: invokevirtual isDebugEnabled : ()Z
/*     */     //   26: ifeq -> 52
/*     */     //   29: aload_2
/*     */     //   30: astore #12
/*     */     //   32: iconst_0
/*     */     //   33: istore #5
/*     */     //   35: aload_0
/*     */     //   36: aload_1
/*     */     //   37: invokespecial toDebugString : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/PartialCommandOutput;)Ljava/lang/String;
/*     */     //   40: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   45: aload #12
/*     */     //   47: swap
/*     */     //   48: aload_3
/*     */     //   49: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   52: nop
/*     */     //   53: aload_0
/*     */     //   54: getfield outputModel : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;
/*     */     //   57: invokestatic getActiveBlock : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;)Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;
/*     */     //   60: dup
/*     */     //   61: ifnonnull -> 148
/*     */     //   64: pop
/*     */     //   65: aload_0
/*     */     //   66: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController
/*     */     //   69: astore #5
/*     */     //   71: iconst_0
/*     */     //   72: istore #6
/*     */     //   74: aload #5
/*     */     //   76: getfield blockCreationAlarm : Lcom/intellij/util/Alarm;
/*     */     //   79: invokevirtual cancelAllRequests : ()I
/*     */     //   82: pop
/*     */     //   83: aload #5
/*     */     //   85: getfield runningCommandContext : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandContext;
/*     */     //   88: dup
/*     */     //   89: ifnonnull -> 134
/*     */     //   92: pop
/*     */     //   93: aload #5
/*     */     //   95: astore #7
/*     */     //   97: iconst_0
/*     */     //   98: istore #8
/*     */     //   100: aload #7
/*     */     //   102: astore #9
/*     */     //   104: iconst_0
/*     */     //   105: istore #10
/*     */     //   107: ldc com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController
/*     */     //   109: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   112: dup
/*     */     //   113: ldc 'getInstance(...)'
/*     */     //   115: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   118: ldc_w 'No running command context'
/*     */     //   121: invokevirtual error : (Ljava/lang/String;)V
/*     */     //   124: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandContext
/*     */     //   127: dup
/*     */     //   128: aconst_null
/*     */     //   129: aconst_null
/*     */     //   130: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderingInfo;)V
/*     */     //   133: nop
/*     */     //   134: astore #11
/*     */     //   136: aload #5
/*     */     //   138: aload #11
/*     */     //   140: aload_1
/*     */     //   141: invokevirtual getTerminalWidth : ()I
/*     */     //   144: invokespecial createNewBlock : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandContext;I)Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;
/*     */     //   147: nop
/*     */     //   148: astore_2
/*     */     //   149: aload_0
/*     */     //   150: aload_2
/*     */     //   151: aload_1
/*     */     //   152: invokespecial updateBlock : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/PartialCommandOutput;)V
/*     */     //   155: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #323	-> 0
/*     */     //   #529	-> 4
/*     */     //   #323	-> 16
/*     */     //   #530	-> 17
/*     */     //   #531	-> 22
/*     */     //   #532	-> 29
/*     */     //   #324	-> 35
/*     */     //   #532	-> 48
/*     */     //   #534	-> 52
/*     */     //   #327	-> 53
/*     */     //   #329	-> 74
/*     */     //   #330	-> 83
/*     */     //   #331	-> 100
/*     */     //   #535	-> 107
/*     */     //   #331	-> 118
/*     */     //   #332	-> 124
/*     */     //   #330	-> 133
/*     */     //   #330	-> 134
/*     */     //   #334	-> 136
/*     */     //   #327	-> 147
/*     */     //   #327	-> 148
/*     */     //   #336	-> 149
/*     */     //   #337	-> 155
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   4	11	3	$i$f$thisLogger	I
/*     */     //   2	13	2	$this$thisLogger$iv	Ljava/lang/Object;
/*     */     //   35	10	5	$i$a$-debug$default-TerminalOutputController$doUpdateCommandOutput$1	I
/*     */     //   22	31	4	$i$f$debug	I
/*     */     //   17	36	2	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   19	34	3	e$iv	Ljava/lang/Exception;
/*     */     //   107	11	10	$i$f$thisLogger	I
/*     */     //   104	14	9	$this$thisLogger$iv	Ljava/lang/Object;
/*     */     //   100	33	8	$i$a$-run-TerminalOutputController$doUpdateCommandOutput$activeBlock$1$context$1	I
/*     */     //   97	36	7	$this$doUpdateCommandOutput_u24lambda_u2418_u24lambda_u2417	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController;
/*     */     //   74	73	6	$i$a$-run-TerminalOutputController$doUpdateCommandOutput$activeBlock$1	I
/*     */     //   136	11	11	context	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandContext;
/*     */     //   71	76	5	$this$doUpdateCommandOutput_u24lambda_u2418	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController;
/*     */     //   149	7	2	activeBlock	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;
/*     */     //   0	156	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController;
/*     */     //   0	156	1	output	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/PartialCommandOutput;
/*     */   }
/*     */   
/*     */   private final CommandBlock createNewBlock(RunningCommandContext context, int terminalWidth) {
/*     */     CommandBlock block = this.outputModel.createBlock(context.getCommand(), context.getPrompt(), terminalWidth);
/*     */     if (!CommandBlockImplKt.getTextRange(block).isEmpty())
/*     */       this.blocksDecorator.installDecoration(block); 
/*     */     return block;
/*     */   }
/*     */   
/*     */   private final void updateBlock(CommandBlock block, PartialCommandOutput output) {
/*     */     Intrinsics.checkNotNullExpressionValue(this.editor.getDocument(), "getDocument(...)");
/*     */     Document $this$executeInBulk$iv = (Document)this.editor.getDocument();
/*     */     int $i$f$executeInBulk = 0;
/*     */     Ref.ObjectRef result$iv = new Ref.ObjectRef();
/*     */     DocumentUtil.executeInBulk($this$executeInBulk$iv, new TerminalOutputController$updateBlock$$inlined$executeInBulk$1(result$iv, block, this, output));
/*     */     Intrinsics.checkNotNull(result$iv.element);
/*     */     this.outputModel.trimOutput();
/*     */     this.hyperlinkHighlighter.highlightHyperlinks(block);
/*     */     CharSequence outputText = CommandBlockImplKt.getWithOutput(block) ? this.editor.getDocument().getCharsSequence().subSequence(block.getOutputStartOffset(), block.getEndOffset()) : "";
/*     */     if ((!StringsKt.isBlank(outputText)) && !Intrinsics.areEqual(StringsKt.trim(outputText), "%"))
/*     */       this.blocksDecorator.installDecoration(block); 
/*     */     if (this.runningCommandInteractivity != null && this.runningCommandInteractivity.getCaretPainter() != null) {
/*     */       this.runningCommandInteractivity.getCaretPainter().repaint();
/*     */     } else {
/*     */       this.runningCommandInteractivity.getCaretPainter();
/*     */     } 
/*     */   }
/*     */   
/*     */   private final void updateHighlightings(CommandBlock block, int replaceOffset, List styles) {
/*     */     Iterable $this$map$iv = styles;
/*     */     int $i$f$map = 0;
/*     */     Iterable iterable1 = $this$map$iv;
/*     */     Collection<HighlightingInfo> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
/*     */     int $i$f$mapTo = 0;
/*     */     for (Object item$iv$iv : iterable1) {
/*     */       StyleRange styleRange = (StyleRange)item$iv$iv;
/*     */       Collection<HighlightingInfo> collection = destination$iv$iv;
/*     */       int $i$a$-map-TerminalOutputController$updateHighlightings$replaceHighlightings$1 = 0;
/*     */       collection.add(new HighlightingInfo(replaceOffset + styleRange.getStartOffset(), replaceOffset + styleRange.getEndOffset(), toTextAttributesProvider(styleRange.getStyle())));
/*     */     } 
/*     */     List replaceHighlightings = (List)destination$iv$iv;
/*     */     List<HighlightingInfo> newHighlightings = SequencesKt.toList(SequencesKt.plus(SequencesKt.filter(CollectionsKt.asSequence(this.outputModel.getHighlightings(block)), replaceOffset::updateHighlightings$lambda$21), replaceHighlightings));
/*     */     this.outputModel.putHighlightings(block, newHighlightings);
/*     */   }
/*     */   
/*     */   private static final boolean updateHighlightings$lambda$21(int $replaceOffset, HighlightingInfo it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return (it.getEndOffset() <= $replaceOffset);
/*     */   }
/*     */   
/*     */   @RequiresEdt(generateAssertion = false)
/*     */   private final <T> T doWithScrollingAware(Function0 action) {
/*     */     it = this.editor.getScrollingModel().getVisibleArea();
/*     */     int $i$a$-let-TerminalOutputController$doWithScrollingAware$wasAtBottom$1 = 0;
/*     */     boolean wasAtBottom = (it.y + it.height == this.editor.getContentComponent().getHeight());
/*     */     try {
/*     */       return (T)action.invoke();
/*     */     } finally {
/*     */       if (wasAtBottom)
/*     */         scrollToBottom(); 
/*     */     } 
/*     */   }
/*     */   
/*     */   private final TextAttributesProvider toTextAttributesProvider(TextStyle $this$toTextAttributesProvider) {
/*     */     return new TextStyleAdapter($this$toTextAttributesProvider, this.session.getColorPalette());
/*     */   }
/*     */   
/*     */   public final void addDocumentListener(@NotNull DocumentListener listener, @Nullable Disposable disposable) {
/*     */     Intrinsics.checkNotNullParameter(listener, "listener");
/*     */     if (disposable != null) {
/*     */       this.editor.getDocument().addDocumentListener(listener, disposable);
/*     */     } else {
/*     */       this.editor.getDocument().addDocumentListener(listener);
/*     */     } 
/*     */   }
/*     */   
/*     */   @RequiresEdt
/*     */   public final void doWhenNextBlockCanBeStarted(@NotNull Function0<Unit> callback) {
/*     */     Intrinsics.checkNotNullParameter(callback, "callback");
/*     */     if (!isCommandRunning()) {
/*     */       callback.invoke();
/*     */     } else {
/*     */       this.nextBlockCanBeStartedQueue.offer(callback);
/*     */     } 
/*     */   }
/*     */   
/*     */   @RequiresEdt(generateAssertion = true)
/*     */   public final boolean isCommandRunning() {
/*     */     return (this.runningCommandContext != null || TerminalOutputModelKt.getActiveBlock(this.outputModel) != null);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\033\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005¢\006\004\b\006\020\007J\013\020\f\032\004\030\0010\003HÆ\003J\013\020\r\032\004\030\0010\005HÆ\003J!\020\016\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\n\b\002\020\004\032\004\030\0010\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\023HÖ\001J\t\020\024\032\0020\003HÖ\001R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\b\020\tR\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\n\020\013¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandContext;", "", "command", "", "prompt", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderingInfo;", "<init>", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderingInfo;)V", "getCommand", "()Ljava/lang/String;", "getPrompt", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderingInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ej-core"})
/*     */   private static final class RunningCommandContext {
/*     */     @Nullable
/*     */     private final String command;
/*     */     @Nullable
/*     */     private final TerminalPromptRenderingInfo prompt;
/*     */     
/*     */     public RunningCommandContext(@Nullable String command, @Nullable TerminalPromptRenderingInfo prompt) {
/*     */       this.command = command;
/*     */       this.prompt = prompt;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final String getCommand() {
/*     */       return this.command;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final TerminalPromptRenderingInfo getPrompt() {
/*     */       return this.prompt;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final String component1() {
/*     */       return this.command;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final TerminalPromptRenderingInfo component2() {
/*     */       return this.prompt;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final RunningCommandContext copy(@Nullable String command, @Nullable TerminalPromptRenderingInfo prompt) {
/*     */       return new RunningCommandContext(command, prompt);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "RunningCommandContext(command=" + this.command + ", prompt=" + this.prompt + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = (this.command == null) ? 0 : this.command.hashCode();
/*     */       return result * 31 + ((this.prompt == null) ? 0 : this.prompt.hashCode());
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof RunningCommandContext))
/*     */         return false; 
/*     */       RunningCommandContext runningCommandContext = (RunningCommandContext)other;
/*     */       return !Intrinsics.areEqual(this.command, runningCommandContext.command) ? false : (!!Intrinsics.areEqual(this.prompt, runningCommandContext.prompt));
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\b\004\030\0002\0020\001B\021\022\b\020\002\032\004\030\0010\003¢\006\004\b\004\020\005J\b\020\026\032\0020\023H\002R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\b\020\tR\021\020\n\032\0020\013¢\006\b\n\000\032\004\b\f\020\rR\021\020\016\032\0020\017¢\006\b\n\000\032\004\b\020\020\021R\021\020\022\032\0020\023¢\006\b\n\000\032\004\b\024\020\025¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$RunningCommandInteractivity;", "", "command", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController;Ljava/lang/String;)V", "disposable", "Lcom/intellij/openapi/Disposable;", "getDisposable", "()Lcom/intellij/openapi/Disposable;", "caretModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretModel;", "getCaretModel", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretModel;", "caretPainter", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretPainter;", "getCaretPainter", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalCaretPainter;", "contentUpdatesScheduler", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputContentUpdatesScheduler;", "getContentUpdatesScheduler", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputContentUpdatesScheduler;", "setupContentUpdating", "ej-core"})
/*     */   private final class RunningCommandInteractivity {
/*     */     @NotNull
/*     */     private final Disposable disposable;
/*     */     @NotNull
/*     */     private final TerminalCaretModel caretModel;
/*     */     @NotNull
/*     */     private final TerminalCaretPainter caretPainter;
/*     */     @NotNull
/*     */     private final TerminalOutputContentUpdatesScheduler contentUpdatesScheduler;
/*     */     
/*     */     public RunningCommandInteractivity(String command) {
/*     */       Intrinsics.checkNotNullExpressionValue(Disposer.newDisposable((Disposable)TerminalOutputController.this.session, "command " + command), "newDisposable(...)");
/*     */       this.disposable = Disposer.newDisposable((Disposable)TerminalOutputController.this.session, "command " + command);
/*     */       this.caretModel = new TerminalCaretModel(TerminalOutputController.this.session, TerminalOutputController.this.getOutputModel(), TerminalOutputController.this.editor, this.disposable);
/*     */       this.caretPainter = new TerminalCaretPainter(this.caretModel, TerminalOutputController.this.getOutputModel(), TerminalOutputController.this.getSelectionModel(), TerminalOutputController.this.editor);
/*     */       Disposer.register((Disposable)TerminalOutputController.this.session, this.disposable);
/*     */       Disposer.register(this.disposable, this.caretPainter);
/*     */       BlockTerminalEventsHandler eventsHandler = new BlockTerminalEventsHandler(TerminalOutputController.this.session, TerminalOutputController.this.settings, TerminalOutputController.this);
/*     */       TerminalEventDispatcherKt.setupKeyEventDispatcher(TerminalOutputController.this.editor, (TerminalEventsHandler)eventsHandler, this.disposable);
/*     */       TerminalEventDispatcherKt.setupMouseListener(TerminalOutputController.this.editor, TerminalOutputController.this.settings, TerminalOutputController.this.session.getModel(), (TerminalEventsHandler)eventsHandler, this.disposable);
/*     */       (new TerminalOutputEditorInputMethodSupport(TerminalOutputController.this.editor, TerminalOutputController.this.session, this.caretModel)).install(this.disposable);
/*     */       this.contentUpdatesScheduler = setupContentUpdating();
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Disposable getDisposable() {
/*     */       return this.disposable;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final TerminalCaretModel getCaretModel() {
/*     */       return this.caretModel;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final TerminalCaretPainter getCaretPainter() {
/*     */       return this.caretPainter;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final TerminalOutputContentUpdatesScheduler getContentUpdatesScheduler() {
/*     */       return this.contentUpdatesScheduler;
/*     */     }
/*     */     
/*     */     private final TerminalOutputContentUpdatesScheduler setupContentUpdating() {
/*     */       CoroutineScope scope = BlockTerminalScopeProvider.childScope$default(BlockTerminalScopeProvider.Companion.getInstance(TerminalOutputController.this.project), "Command block content update", null, false, 6, null);
/*     */       Disposer.register(this.disposable, scope::setupContentUpdating$lambda$0);
/*     */       TerminalOutputContentUpdatesScheduler collector = new TerminalOutputContentUpdatesScheduler(TerminalOutputController.this.session.getModel().getTextBuffer$ej_core(), TerminalOutputController.this.session.getShellIntegration(), scope, TerminalOutputController.this::setupContentUpdating$lambda$1);
/*     */       collector.startUpdating();
/*     */       return collector;
/*     */     }
/*     */     
/*     */     private static final void setupContentUpdating$lambda$0(CoroutineScope $scope) {
/*     */       CoroutineScopeKt.cancel$default($scope, null, 1, null);
/*     */     }
/*     */     
/*     */     private static final Unit setupContentUpdating$lambda$1(TerminalOutputController this$0, PartialCommandOutput output) {
/*     */       Intrinsics.checkNotNullParameter(output, "output");
/*     */       TerminalOutputController.this.updateCommandOutput(output);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController$Companion;", "", "<init>", "()V", "KEY", "Lcom/intellij/openapi/actionSystem/DataKey;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController;", "getKEY", "()Lcom/intellij/openapi/actionSystem/DataKey;", "ej-core"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final DataKey<TerminalOutputController> getKEY() {
/*     */       return TerminalOutputController.KEY;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final EditorEx editor;
/*     */   @NotNull
/*     */   private final BlockTerminalSession session;
/*     */   @NotNull
/*     */   private final JBTerminalSystemSettingsProviderBase settings;
/*     */   @NotNull
/*     */   private final TerminalOutputModel outputModel;
/*     */   @NotNull
/*     */   private final TerminalSelectionModel selectionModel;
/*     */   @NotNull
/*     */   private final TerminalBlocksDecorator blocksDecorator;
/*     */   @NotNull
/*     */   private final TerminalTextHighlighter textHighlighter;
/*     */   @NotNull
/*     */   private final Alarm blockCreationAlarm;
/*     */   @Nullable
/*     */   private RunningCommandContext runningCommandContext;
/*     */   @Nullable
/*     */   private volatile RunningCommandInteractivity runningCommandInteractivity;
/*     */   @NotNull
/*     */   private final TerminalHyperlinkHighlighter hyperlinkHighlighter;
/*     */   @NotNull
/*     */   private final Queue<Function0<Unit>> nextBlockCanBeStartedQueue;
/*     */   @NotNull
/*     */   private static final DataKey<TerminalOutputController> KEY = DataKey.Companion.create("Junie.TerminalOutputController");
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalOutputController.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */