/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.ShellCommandListener;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.util.Disposer;
/*     */ import com.jediterm.core.util.TermSize;
/*     */ import com.jediterm.terminal.TtyConnector;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import javax.swing.JComponent;
/*     */ import kotlin.Pair;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.plugins.terminal.ShellStartupOptions;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020 \n\002\020\016\n\002\b\005\n\002\030\002\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\006\b\001\030\0002\0020\001:\001HB\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\030\020.\032\0020/2\006\0200\032\002012\006\0202\032\0020\025H\027J\026\0203\032\b\022\004\022\0020\0250$2\006\0204\032\00205H\007J\020\0206\032\0020/2\006\0207\032\0020\036H\026J\020\0208\032\0020/2\006\0209\032\0020%H\026J\b\020:\032\0020%H\026J\b\020;\032\0020/H\026J\030\020<\032\0020/2\006\020=\032\0020>2\006\020?\032\0020\007H\026J\020\020@\032\0020/2\006\020\034\032\0020\036H\026J\030\020A\032\0020/2\006\020B\032\0020C2\006\020D\032\0020\007H\026J\b\020E\032\0020/H\026J\b\020F\032\0020>H\026J\b\020G\032\0020>H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\016\020\016\032\0020\017X\004¢\006\002\n\000R\024\020\020\032\0020\021X\004¢\006\b\n\000\032\004\b\022\020\023R\026\020\024\032\004\030\0010\0258VX\004¢\006\006\032\004\b\026\020\027R\024\020\030\032\0020\031X\004¢\006\b\n\000\032\004\b\032\020\033R\"\020\034\032\n\022\004\022\0020\036\030\0010\035X\016¢\006\016\n\000\032\004\b\037\020 \"\004\b!\020\"R\027\020#\032\b\022\004\022\0020%0$¢\006\b\n\000\032\004\b&\020'R\032\020(\032\0020)X\016¢\006\016\n\000\032\004\b*\020+\"\004\b,\020-¨\006I"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/TerminalWidget_VersionDependent;", "project", "Lcom/intellij/openapi/project/Project;", "settings", "Lorg/jetbrains/plugins/terminal/JBTerminalSystemSettingsProvider;", "parent", "Lcom/intellij/openapi/Disposable;", "<init>", "(Lcom/intellij/openapi/project/Project;Lorg/jetbrains/plugins/terminal/JBTerminalSystemSettingsProvider;Lcom/intellij/openapi/Disposable;)V", "getProject", "()Lcom/intellij/openapi/project/Project;", "getSettings", "()Lorg/jetbrains/plugins/terminal/JBTerminalSystemSettingsProvider;", "wrapper", "Lcom/intellij/ui/components/panels/Wrapper;", "terminalTitle", "Lcom/intellij/terminal/TerminalTitle;", "getTerminalTitle", "()Lcom/intellij/terminal/TerminalTitle;", "termSize", "Lcom/jediterm/core/util/TermSize;", "getTermSize", "()Lcom/jediterm/core/util/TermSize;", "ttyConnectorAccessor", "Lcom/intellij/terminal/ui/TtyConnectorAccessor;", "getTtyConnectorAccessor", "()Lcom/intellij/terminal/ui/TtyConnectorAccessor;", "shellCommand", "", "", "getShellCommand", "()Ljava/util/List;", "setShellCommand", "(Ljava/util/List;)V", "sessionInitializedPromise", "Ljava/util/concurrent/CompletableFuture;", "", "getSessionInitializedPromise", "()Ljava/util/concurrent/CompletableFuture;", "view", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalContentView;", "getView", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalContentView;", "setView", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalContentView;)V", "connectToTty", "", "ttyConnector", "Lcom/jediterm/terminal/TtyConnector;", "initialTermSize", "initialize", "options", "Lorg/jetbrains/plugins/terminal/ShellStartupOptions;", "writePlainMessage", "message", "setCursorVisible", "visible", "hasFocus", "requestFocus", "addNotification", "notificationComponent", "Ljavax/swing/JComponent;", "disposable", "sendCommandToExecute", "addTerminationCallback", "onTerminated", "Ljava/lang/Runnable;", "parentDisposable", "dispose", "getComponent", "getPreferredFocusableComponent", "TerminalPlaceholder", "ej-core"})
/*     */ @Internal
/*     */ public final class TerminalWidgetImpl extends TerminalWidget_VersionDependent {
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final JBTerminalSystemSettingsProvider settings;
/*     */   @NotNull
/*     */   private final Wrapper wrapper;
/*     */   @NotNull
/*     */   private final TerminalTitle terminalTitle;
/*     */   @NotNull
/*     */   private final TtyConnectorAccessor ttyConnectorAccessor;
/*     */   @Nullable
/*     */   private List<String> shellCommand;
/*     */   @NotNull
/*     */   private final CompletableFuture<Boolean> sessionInitializedPromise;
/*     */   @NotNull
/*     */   private volatile TerminalContentView view;
/*     */   
/*     */   @NotNull
/*  36 */   public final Project getProject() { return this.project; } @NotNull
/*  37 */   public final JBTerminalSystemSettingsProvider getSettings() { return this.settings; } public TerminalWidgetImpl(@NotNull Project project, @NotNull JBTerminalSystemSettingsProvider settings, @NotNull Disposable parent) { this.project = project; this.settings = settings;
/*     */ 
/*     */     
/*  40 */     this.wrapper = new Wrapper();
/*     */     
/*  42 */     this.terminalTitle = new TerminalTitle();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  47 */     this.ttyConnectorAccessor = new TtyConnectorAccessor();
/*     */ 
/*     */ 
/*     */     
/*  51 */     this.sessionInitializedPromise = new CompletableFuture<>();
/*     */ 
/*     */     
/*  54 */     this.view = new TerminalPlaceholder();
/*     */ 
/*     */     
/*  57 */     this.wrapper.setContent(this.view.getComponent());
/*  58 */     Disposer.register(parent, (Disposable)this);
/*  59 */     Disposer.register((Disposable)this, this.view); } @NotNull public TerminalTitle getTerminalTitle() { return this.terminalTitle; } @Nullable public TermSize getTermSize() { return this.view.getTerminalSize(); } @NotNull public TtyConnectorAccessor getTtyConnectorAccessor() { return this.ttyConnectorAccessor; } @Nullable public List<String> getShellCommand() { return this.shellCommand; }
/*     */   public void setShellCommand(@Nullable List<String> <set-?>) { this.shellCommand = <set-?>; }
/*     */   @NotNull public final CompletableFuture<Boolean> getSessionInitializedPromise() { return this.sessionInitializedPromise; }
/*     */   @NotNull public final TerminalContentView getView() { return this.view; }
/*     */   public final void setView(@NotNull TerminalContentView <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.view = <set-?>; }
/*  64 */   @RequiresEdt(generateAssertion = false) public void connectToTty(@NotNull TtyConnector ttyConnector, @NotNull TermSize initialTermSize) { Intrinsics.checkNotNullParameter(ttyConnector, "ttyConnector"); Intrinsics.checkNotNullParameter(initialTermSize, "initialTermSize"); this.view.connectToTty(ttyConnector, initialTermSize);
/*  65 */     getTtyConnectorAccessor().setTtyConnector(ttyConnector); }
/*     */ 
/*     */   
/*     */   @RequiresEdt(generateAssertion = false)
/*     */   @NotNull
/*  70 */   public final CompletableFuture<TermSize> initialize(@NotNull ShellStartupOptions options) { Intrinsics.checkNotNullParameter(options, "options"); options.getShellIntegration(); CommandBlockIntegration commandBlockIntegration = (options.getShellIntegration() != null) ? options.getShellIntegration().getCommandBlockIntegration() : null;
/*  71 */     boolean bool = (commandBlockIntegration != null) ? true : false; if (_Assertions.ENABLED && !bool) { int $i$a$-assert-TerminalWidgetImpl$initialize$1 = 0; String str = "Precondition: command block integration is required in Junie: " + 
/*  72 */         options;
/*     */       throw new AssertionError(str); }
/*     */     
/*  75 */     TerminalContentView oldView = this.view;
/*  76 */     Intrinsics.checkNotNull(options.getShellIntegration()); BlockTerminalSession session = new BlockTerminalSession((JBTerminalSystemSettingsProviderBase)this.settings, (TerminalColorPalette)new BlockTerminalColorPalette(), options.getShellIntegration());
/*  77 */     Disposer.register((Disposable)this, (Disposable)session);
/*  78 */     this.view = new BlockTerminalView(this.project, session, (JBTerminalSystemSettingsProviderBase)this.settings, getTerminalTitle());
/*     */     
/*  80 */     Intrinsics.checkNotNullExpressionValue(Disposer.newDisposable(), "newDisposable(...)"); Disposable listenersDisposable = Disposer.newDisposable();
/*  81 */     session.addCommandListener(new TerminalWidgetImpl$initialize$2(listenersDisposable), 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  86 */         listenersDisposable);
/*     */     
/*  88 */     if (oldView instanceof TerminalPlaceholder) {
/*  89 */       ((TerminalPlaceholder)oldView).moveTerminationCallbacksTo(this.view);
/*  90 */       ((TerminalPlaceholder)oldView).executePostponedShellCommands(this.view);
/*     */     } 
/*  92 */     Disposer.dispose(oldView);
/*  93 */     Disposer.register((Disposable)this, this.view);
/*     */     
/*  95 */     JComponent component = this.view.getComponent();
/*  96 */     this.wrapper.setContent(component);
/*  97 */     requestFocus();
/*     */     
/*  99 */     CompletableFuture<?> future = this.view.getTerminalSizeInitializedFuture();
/* 100 */     TerminalUiUtils.INSTANCE.cancelFutureByTimeout(future, 2000L, this.view);
/* 101 */     Intrinsics.checkNotNullExpressionValue(future.thenApply(new TerminalWidgetImpl$initialize$3()::initialize$lambda$1), "thenApply(...)"); return (CompletableFuture)future.thenApply(new TerminalWidgetImpl$initialize$3()::initialize$lambda$1); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl$initialize$2", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener;", "initialized", "", "ej-core"}) public static final class TerminalWidgetImpl$initialize$2 implements ShellCommandListener { TerminalWidgetImpl$initialize$2(Disposable $listenersDisposable) {} public void promptShown() { ShellCommandListener.DefaultImpls.promptShown(this); } public void commandStarted(String command) { ShellCommandListener.DefaultImpls.commandStarted(this, command); } public void commandFinished(CommandFinishedEvent event) { ShellCommandListener.DefaultImpls.commandFinished(this, event); } public void promptStateUpdated(TerminalPromptState newState) { ShellCommandListener.DefaultImpls.promptStateUpdated(this, newState); } public void commandHistoryReceived(String history) { ShellCommandListener.DefaultImpls.commandHistoryReceived(this, history); } public void commandBufferReceived(String buffer) { ShellCommandListener.DefaultImpls.commandBufferReceived(this, buffer); } public void shellInfoReceived(String rawShellInfo) { ShellCommandListener.DefaultImpls.shellInfoReceived(this, rawShellInfo); } public void generatorFinished(GeneratorFinishedEvent event) { ShellCommandListener.DefaultImpls.generatorFinished(this, event); } public void clearInvoked() { ShellCommandListener.DefaultImpls.clearInvoked(this); } public void initialized() { TerminalWidgetImpl.this.getSessionInitializedPromise().complete(Boolean.valueOf(true)); Disposer.dispose(this.$listenersDisposable); } } private static final TermSize initialize$lambda$1(Function1 $tmp0, Object p0) { return (TermSize)$tmp0.invoke(p0); } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/* 102 */   static final class TerminalWidgetImpl$initialize$3 implements Function1 { public final TermSize invoke(Object it) { return TerminalWidgetImpl.this.getView().getTerminalSize(); }
/*     */      }
/*     */ 
/*     */ 
/*     */   
/*     */   public void writePlainMessage(@NotNull String message) {
/* 108 */     Intrinsics.checkNotNullParameter(message, "message");
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCursorVisible(boolean visible) {}
/*     */   
/*     */   public boolean hasFocus() {
/* 115 */     return this.view.isFocused();
/*     */   }
/*     */   
/*     */   public void requestFocus() {
/* 119 */     IdeFocusManager.getInstance(this.project).requestFocus(getPreferredFocusableComponent(), true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addNotification(@NotNull JComponent notificationComponent, @NotNull Disposable disposable) {
/* 124 */     Intrinsics.checkNotNullParameter(notificationComponent, "notificationComponent"); Intrinsics.checkNotNullParameter(disposable, "disposable");
/*     */   }
/*     */   public void sendCommandToExecute(@NotNull String shellCommand) {
/* 127 */     Intrinsics.checkNotNullParameter(shellCommand, "shellCommand"); this.view.sendCommandToExecute(shellCommand);
/*     */   }
/*     */   
/*     */   public void addTerminationCallback(@NotNull Runnable onTerminated, @NotNull Disposable parentDisposable) {
/* 131 */     Intrinsics.checkNotNullParameter(onTerminated, "onTerminated"); Intrinsics.checkNotNullParameter(parentDisposable, "parentDisposable"); this.view.addTerminationCallback(onTerminated, parentDisposable);
/*     */   }
/*     */   public void dispose() {}
/*     */   
/*     */   @NotNull
/* 136 */   public JComponent getComponent() { return (JComponent)this.wrapper; } @NotNull
/*     */   public JComponent getPreferredFocusableComponent() {
/* 138 */     return this.view.getPreferredFocusableComponent();
/*     */   }
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020!\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\002\b\n\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\030\020\021\032\0020\0222\006\020\023\032\0020\0242\006\020\025\032\0020\026H\026J\n\020\027\032\004\030\0010\026H\026J\f\020\030\032\006\022\002\b\0030\031H\026J\b\020\032\032\0020\033H\026J\030\020\034\032\0020\0222\006\020\035\032\0020\0072\006\020\036\032\0020\bH\026J\020\020\037\032\0020\0222\006\020 \032\0020\nH\026J\016\020!\032\0020\0222\006\020\"\032\0020\001J\016\020#\032\0020\0222\006\020\"\032\0020\001J\b\020$\032\0020\022H\026R \020\004\032\024\022\020\022\016\022\004\022\0020\007\022\004\022\0020\b0\0060\005X\004¢\006\002\n\000R\024\020\t\032\b\022\004\022\0020\n0\005X\004¢\006\002\n\000R\024\020\013\032\0020\fX\004¢\006\b\n\000\032\004\b\r\020\016R\024\020\017\032\0020\fX\004¢\006\b\n\000\032\004\b\020\020\016¨\006%"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl$TerminalPlaceholder;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalContentView;", "<init>", "()V", "postponedTerminationCallbackInfos", "", "Lkotlin/Pair;", "Ljava/lang/Runnable;", "Lcom/intellij/openapi/Disposable;", "postponedShellCommands", "", "component", "Ljavax/swing/JComponent;", "getComponent", "()Ljavax/swing/JComponent;", "preferredFocusableComponent", "getPreferredFocusableComponent", "connectToTty", "", "ttyConnector", "Lcom/jediterm/terminal/TtyConnector;", "initialTermSize", "Lcom/jediterm/core/util/TermSize;", "getTerminalSize", "getTerminalSizeInitializedFuture", "Ljava/util/concurrent/CompletableFuture;", "isFocused", "", "addTerminationCallback", "onTerminated", "parentDisposable", "sendCommandToExecute", "shellCommand", "moveTerminationCallbacksTo", "destView", "executePostponedShellCommands", "dispose", "ej-core"})
/*     */   private static final class TerminalPlaceholder implements TerminalContentView { @NotNull
/* 142 */     private final List<Pair<Runnable, Disposable>> postponedTerminationCallbackInfos = new CopyOnWriteArrayList<>(); @NotNull
/* 143 */     private final List<String> postponedShellCommands = new CopyOnWriteArrayList<>();
/*     */     @NotNull
/* 145 */     private final JComponent component = new TerminalWidgetImpl$TerminalPlaceholder$component$1(); @NotNull public JComponent getComponent() { return this.component; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\013\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001¨\006\002"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl$TerminalPlaceholder$component$1", "Ljavax/swing/JPanel;", "ej-core"})
/*     */     public static final class TerminalWidgetImpl$TerminalPlaceholder$component$1 extends JPanel { TerminalWidgetImpl$TerminalPlaceholder$component$1() {
/* 147 */         setBackground((Color)TerminalUi.defaultBackground$default(TerminalUi.INSTANCE, null, 1, null));
/*     */       } }
/*     */     
/*     */     @NotNull
/* 151 */     private final JComponent preferredFocusableComponent = getComponent(); @NotNull public JComponent getPreferredFocusableComponent() { return this.preferredFocusableComponent; }
/*     */     
/*     */     public void connectToTty(@NotNull TtyConnector ttyConnector, @NotNull TermSize initialTermSize) {
/* 154 */       Intrinsics.checkNotNullParameter(ttyConnector, "ttyConnector"); Intrinsics.checkNotNullParameter(initialTermSize, "initialTermSize"); throw new IllegalStateException("Unexpected method call".toString());
/*     */     }
/*     */     @Nullable
/* 157 */     public TermSize getTerminalSize() { return null; } @NotNull
/*     */     public CompletableFuture<?> getTerminalSizeInitializedFuture() {
/* 159 */       Intrinsics.checkNotNullExpressionValue(CompletableFuture.completedFuture(Unit.INSTANCE), "completedFuture(...)"); return CompletableFuture.completedFuture(Unit.INSTANCE);
/*     */     } public boolean isFocused() {
/* 161 */       return false;
/*     */     }
/*     */     public void addTerminationCallback(@NotNull Runnable onTerminated, @NotNull Disposable parentDisposable) {
/* 164 */       Intrinsics.checkNotNullParameter(onTerminated, "onTerminated"); Intrinsics.checkNotNullParameter(parentDisposable, "parentDisposable"); this.postponedTerminationCallbackInfos.add(new Pair(onTerminated, parentDisposable));
/*     */     }
/*     */     
/*     */     public void sendCommandToExecute(@NotNull String shellCommand) {
/* 168 */       Intrinsics.checkNotNullParameter(shellCommand, "shellCommand"); this.postponedShellCommands.add(shellCommand);
/*     */     }
/*     */     
/*     */     public final void moveTerminationCallbacksTo(@NotNull TerminalContentView destView) {
/* 172 */       Intrinsics.checkNotNullParameter(destView, "destView"); for (Pair<Runnable, Disposable> info : this.postponedTerminationCallbackInfos) {
/* 173 */         destView.addTerminationCallback((Runnable)info.getFirst(), (Disposable)info.getSecond());
/*     */       }
/* 175 */       this.postponedTerminationCallbackInfos.clear();
/*     */     }
/*     */     
/*     */     public final void executePostponedShellCommands(@NotNull TerminalContentView destView) {
/* 179 */       Intrinsics.checkNotNullParameter(destView, "destView"); for (String shellCommand : this.postponedShellCommands) {
/* 180 */         destView.sendCommandToExecute(shellCommand);
/*     */       }
/* 182 */       this.postponedShellCommands.clear();
/*     */     }
/*     */     
/*     */     public void dispose() {
/* 186 */       this.postponedTerminationCallbackInfos.clear();
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\TerminalWidgetImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */