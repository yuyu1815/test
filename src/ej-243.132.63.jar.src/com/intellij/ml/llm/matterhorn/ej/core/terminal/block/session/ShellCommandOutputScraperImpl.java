/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session;
/*     */ 
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.jediterm.terminal.model.TerminalTextBuffer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020!\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\002\b\000\030\000 \0352\0020\001:\001\035B+\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\020\006\032\004\030\0010\007\022\b\b\002\020\b\032\0020\t¢\006\004\b\n\020\013B\021\b\026\022\006\020\f\032\0020\r¢\006\004\b\n\020\016J \020\024\032\0020\0252\006\020\026\032\0020\0212\006\020\004\032\0020\0052\006\020\027\032\0020\030H\026J\b\020\031\032\0020\025H\002J\b\020\032\032\0020\025H\002J\b\020\033\032\0020\034H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\020\020\006\032\004\030\0010\007X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\024\020\017\032\b\022\004\022\0020\0210\020X\004¢\006\002\n\000R\016\020\022\032\0020\023X\004¢\006\002\n\000¨\006\036"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputScraperImpl;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputScraper;", "textBuffer", "Lcom/jediterm/terminal/model/TerminalTextBuffer;", "parentDisposable", "Lcom/intellij/openapi/Disposable;", "commandEndMarker", "", "debounceTimeout", "", "<init>", "(Lcom/jediterm/terminal/model/TerminalTextBuffer;Lcom/intellij/openapi/Disposable;Ljava/lang/String;I)V", "session", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;)V", "listeners", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputListener;", "debouncer", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/util/Debouncer;", "addListener", "", "listener", "useExtendedDelayOnce", "", "onContentChanged", "doOnContentChanged", "scrapeOutput", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StyledCommandOutput;", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nShellCommandOutputScraperImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShellCommandOutputScraperImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputScraperImpl\n+ 2 TerminalModel.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$Companion\n*L\n1#1,130:1\n231#2,7:131\n*S KotlinDebug\n*F\n+ 1 ShellCommandOutputScraperImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputScraperImpl\n*L\n62#1:131,7\n*E\n"})
/*     */ public final class ShellCommandOutputScraperImpl implements ShellCommandOutputScraper {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final TerminalTextBuffer textBuffer;
/*     */   @Nullable
/*     */   private final String commandEndMarker;
/*     */   
/*  17 */   public ShellCommandOutputScraperImpl(@NotNull TerminalTextBuffer textBuffer, @NotNull Disposable parentDisposable, @Nullable String commandEndMarker, int debounceTimeout) { this.textBuffer = textBuffer;
/*     */     
/*  19 */     this.commandEndMarker = commandEndMarker;
/*  20 */     this.debounceTimeout = debounceTimeout;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  29 */     this.listeners = new CopyOnWriteArrayList<>();
/*     */     
/*  31 */     this.debouncer = new Debouncer(this.debounceTimeout, parentDisposable);
/*     */ 
/*     */     
/*  34 */     ShellCommandOutputScraperImplKt.addModelListener(this.textBuffer, parentDisposable, this::_init_$lambda$0); }
/*  35 */   private final int debounceTimeout; @NotNull private final List<ShellCommandOutputListener> listeners; @NotNull private final Debouncer debouncer; public ShellCommandOutputScraperImpl(@NotNull BlockTerminalSession session) { this(session.getModel().getTextBuffer$ej_core(), session, session.getCommandBlockIntegration().getCommandEndMarker(), 0, 8, null); } private static final void _init_$lambda$0(ShellCommandOutputScraperImpl this$0) { this$0.onContentChanged(); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addListener(@NotNull ShellCommandOutputListener listener, @NotNull Disposable parentDisposable, boolean useExtendedDelayOnce) {
/*  43 */     Intrinsics.checkNotNullParameter(listener, "listener"); Intrinsics.checkNotNullParameter(parentDisposable, "parentDisposable"); TerminalUtil.addItem(this.listeners, listener, parentDisposable);
/*  44 */     this.debouncer.setExtendedDelayOnce();
/*     */   }
/*     */   
/*     */   private final void onContentChanged() {
/*  48 */     if (!this.listeners.isEmpty()) {
/*  49 */       this.debouncer.execute(new ShellCommandOutputScraperImpl$onContentChanged$1(this));
/*     */     }
/*     */   }
/*     */   
/*     */   private final void doOnContentChanged() {
/*  54 */     if (!this.listeners.isEmpty()) {
/*  55 */       StyledCommandOutput output = scrapeOutput();
/*  56 */       for (ShellCommandOutputListener listener : this.listeners)
/*  57 */         listener.commandOutputChanged(output); 
/*     */     } 
/*     */   } @NotNull
/*     */   public StyledCommandOutput scrapeOutput() {
/*     */     StyledCommandOutput styledCommandOutput;
/*  62 */     TerminalModel.Companion companion = TerminalModel.Companion; TerminalTextBuffer $this$withLock$iv = this.textBuffer; int $i$f$withLock = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 131 */     $this$withLock$iv.lock();
/*     */     
/* 133 */     try { TerminalTextBuffer it = $this$withLock$iv; int $i$a$-withLock-ShellCommandOutputScraperImpl$scrapeOutput$1 = 0; styledCommandOutput = Companion.scrapeOutput$default(Companion, this.textBuffer, this.commandEndMarker, 0, 4, null); }
/*     */     finally
/*     */     
/* 136 */     { $this$withLock$iv.unlock(); }  return styledCommandOutput;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007J$\020\004\032\0020\0052\006\020\b\032\0020\t2\n\b\002\020\n\032\004\030\0010\0132\b\b\002\020\f\032\0020\r¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputScraperImpl$Companion;", "", "<init>", "()V", "scrapeOutput", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StyledCommandOutput;", "session", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "textBuffer", "Lcom/jediterm/terminal/model/TerminalTextBuffer;", "commandEndMarker", "", "startLine", "", "ej-core"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final StyledCommandOutput scrapeOutput(@NotNull BlockTerminalSession session) {
/*     */       Intrinsics.checkNotNullParameter(session, "session");
/*     */       return scrapeOutput$default(this, session.getModel().getTextBuffer$ej_core(), session.getCommandBlockIntegration().getCommandEndMarker(), 0, 4, null);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final StyledCommandOutput scrapeOutput(@NotNull TerminalTextBuffer textBuffer, @Nullable String commandEndMarker, int startLine) {
/*     */       Intrinsics.checkNotNullParameter(textBuffer, "textBuffer");
/*     */       Ref.BooleanRef commandEndMarkerFound = new Ref.BooleanRef();
/*     */       StringCollector stringCollector = (StringCollector)new CommandEndMarkerListeningStringCollector((StringCollector)new DropTrailingNewLinesStringCollector((StringCollector)new SimpleStringCollector()), commandEndMarker, commandEndMarkerFound::scrapeOutput$lambda$0);
/*     */       List<StyleRange> styles = new ArrayList();
/*     */       TerminalLinesCollector styleCollectingOutputBuilder = (TerminalLinesCollector)new StylesCollectingTerminalLinesCollector(stringCollector, new ShellCommandOutputScraperImpl$Companion$scrapeOutput$styleCollectingOutputBuilder$1(styles));
/*     */       TerminalLinesCollector terminalLinesCollector = styleCollectingOutputBuilder;
/*     */       ShellCommandOutputScraperImplKt.collectLines(textBuffer, terminalLinesCollector, startLine);
/*     */       return new StyledCommandOutput(stringCollector.buildText(), commandEndMarkerFound.element, styles);
/*     */     }
/*     */     
/*     */     private static final Unit scrapeOutput$lambda$0(Ref.BooleanRef $commandEndMarkerFound) {
/*     */       $commandEndMarkerFound.element = true;
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\ShellCommandOutputScraperImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */