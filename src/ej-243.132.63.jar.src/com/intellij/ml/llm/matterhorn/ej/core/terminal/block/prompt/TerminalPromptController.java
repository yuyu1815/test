/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000`\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020!\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020 \n\002\020\016\n\002\b\003\n\002\020\013\n\002\b\b\n\002\020\002\n\002\b\004\n\002\030\002\n\002\b\006\b\000\030\000 .2\0020\001:\002-.B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\004\b\n\020\013J\016\020#\032\0020$2\006\020%\032\0020\020J\b\020&\032\0020$H\007J\024\020'\032\0020$2\n\b\002\020(\032\004\030\0010)H\007J\b\020*\032\0020$H\007J\b\020+\032\0020$H\007J\b\020,\032\0020$H\007R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\016\020\f\032\0020\rX\004¢\006\002\n\000R\024\020\016\032\b\022\004\022\0020\0200\017X\004¢\006\002\n\000R\021\020\021\032\0020\022¢\006\b\n\000\032\004\b\023\020\024R\027\020\025\032\b\022\004\022\0020\0270\0268F¢\006\006\032\004\b\030\020\031R+\020\034\032\0020\0332\006\020\032\032\0020\0338F@FX\002¢\006\022\n\004\b!\020\"\032\004\b\035\020\036\"\004\b\037\020 ¨\006/"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptController;", "", "project", "Lcom/intellij/openapi/project/Project;", "editor", "Lcom/intellij/openapi/editor/ex/EditorEx;", "session", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "commandExecutor", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalCommandExecutor;", "<init>", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/ex/EditorEx;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalCommandExecutor;)V", "commandHistoryManager", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryManager;", "listeners", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptController$PromptStateListener;", "model", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModel;", "getModel", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModel;", "commandHistory", "", "", "getCommandHistory", "()Ljava/util/List;", "<set-?>", "", "promptIsVisible", "getPromptIsVisible", "()Z", "setPromptIsVisible", "(Z)V", "promptIsVisible$delegate", "Lkotlin/properties/ReadWriteProperty;", "addListener", "", "listener", "handleEnterPressed", "performPaste", "dataContext", "Lcom/intellij/openapi/actionSystem/DataContext;", "showCommandHistory", "onCommandHistoryClosed", "showCommandSearch", "PromptStateListener", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nTerminalPromptController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalPromptController.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptController\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n33#2,3:107\n1863#3,2:110\n1863#3,2:112\n1863#3,2:114\n*S KotlinDebug\n*F\n+ 1 TerminalPromptController.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptController\n*L\n35#1:107,3\n82#1:110,2\n87#1:112,2\n92#1:114,2\n*E\n"})
/*     */ public final class TerminalPromptController {
/*     */   @NotNull
/*     */   public static final Companion Companion;
/*     */   @NotNull
/*     */   private final EditorEx editor;
/*     */   @NotNull
/*     */   private final TerminalCommandExecutor commandExecutor;
/*     */   @NotNull
/*     */   private final CommandHistoryManager commandHistoryManager;
/*     */   @NotNull
/*     */   private final List<PromptStateListener> listeners;
/*     */   @NotNull
/*     */   private final TerminalPromptModel model;
/*     */   @NotNull
/*     */   private final ReadWriteProperty promptIsVisible$delegate;
/*     */   @NotNull
/*     */   private static final DataKey<TerminalPromptController> KEY;
/*     */   
/*  22 */   public TerminalPromptController(@NotNull Project project, @NotNull EditorEx editor, @NotNull BlockTerminalSession session, @NotNull TerminalCommandExecutor commandExecutor) { this.editor = editor;
/*     */     
/*  24 */     this.commandExecutor = commandExecutor;
/*     */ 
/*     */     
/*  27 */     this.listeners = new CopyOnWriteArrayList<>();
/*     */     
/*  29 */     this.model = new TerminalPromptModelImpl(this.editor, session);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  35 */     Delegates delegates = Delegates.INSTANCE; Object initialValue$iv = Boolean.valueOf(true); int $i$f$observable = 0; this.promptIsVisible$delegate = 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 107 */       (ReadWriteProperty)new TerminalPromptController$special$$inlined$observable$1(initialValue$iv, this); this.editor.putUserData(TerminalDataContextUtils.INSTANCE.getIS_PROMPT_EDITOR_KEY$ej_core(), Boolean.valueOf(true)); this.editor.putUserData(TerminalPromptModel.Companion.getKEY(), this.model); this.editor.putUserData(BlockTerminalSession.Companion.getKEY(), session); this.editor.getVirtualFile().putUserData(TerminalPromptModel.Companion.getKEY(), this.model); this.editor.getVirtualFile().putUserData(ShellType.Companion.getKEY(), session.getShellIntegration().getShellType()); this.commandHistoryManager = new CommandHistoryManager(session, this.model); Disposer.register((Disposable)session, this.model); session.addCommandListener(new ShellEditorBufferReportShellCommandListener(session, this.model, this.editor), (Disposable)session); }
/*     */   @NotNull public final TerminalPromptModel getModel() { return this.model; }
/*     */   @NotNull public final List<String> getCommandHistory() { return this.commandHistoryManager.getHistory(); }
/* 110 */   public final boolean getPromptIsVisible() { return ((Boolean)this.promptIsVisible$delegate.getValue(this, $$delegatedProperties[0])).booleanValue(); } public final void setPromptIsVisible(boolean <set-?>) { this.promptIsVisible$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(<set-?>)); } @RequiresEdt public final void showCommandHistory() { Iterable<PromptStateListener> $this$forEach$iv = this.listeners; int $i$f$forEach = 0; Iterator<PromptStateListener> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); PromptStateListener it = (PromptStateListener)element$iv; int $i$a$-forEach-TerminalPromptController$showCommandHistory$1 = 0; it.commandHistoryStateChanged(true); }  }
/*     */   static { KProperty[] arrayOfKProperty = new KProperty[1]; arrayOfKProperty[0] = (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl(TerminalPromptController.class, "promptIsVisible", "getPromptIsVisible()Z", 0)); $$delegatedProperties = (KProperty<Object>[])arrayOfKProperty; Companion = new Companion(null); KEY = DataKey.Companion.create("Junie.TerminalPromptController"); }
/* 112 */   public final void addListener(@NotNull PromptStateListener listener) { Intrinsics.checkNotNullParameter(listener, "listener"); this.listeners.add(listener); } @RequiresEdt public final void handleEnterPressed() { this.commandExecutor.startCommandExecution(this.model.getCommandText()); } @RequiresEdt public final void performPaste(@Nullable DataContext dataContext) { if (dataContext == null) Intrinsics.checkNotNullExpressionValue(this.editor.getDataContext(), "getDataContext(...)");  DataContext context = this.editor.getDataContext(); this.editor.getPasteProvider().performPaste(context); } @RequiresEdt public final void onCommandHistoryClosed() { Iterable<PromptStateListener> $this$forEach$iv = this.listeners; int $i$f$forEach = 0; Iterator<PromptStateListener> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); PromptStateListener it = (PromptStateListener)element$iv; int $i$a$-forEach-TerminalPromptController$onCommandHistoryClosed$1 = 0; it.commandHistoryStateChanged(false); }
/*     */      } @RequiresEdt public final void showCommandSearch() { Iterable<PromptStateListener> $this$forEach$iv = this.listeners; int $i$f$forEach = 0;
/* 114 */     Iterator<PromptStateListener> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); PromptStateListener it = (PromptStateListener)element$iv; int $i$a$-forEach-TerminalPromptController$showCommandSearch$1 = 0;
/*     */       it.commandSearchRequested(); }
/*     */      }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\020\013\n\002\b\004\bf\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\b\020\006\032\0020\003H\026J\020\020\007\032\0020\0032\006\020\b\032\0020\005H\027¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptController$PromptStateListener;", "", "commandHistoryStateChanged", "", "showing", "", "commandSearchRequested", "promptVisibilityChanged", "visible", "ej-core"})
/*     */   public static interface PromptStateListener {
/*     */     void commandHistoryStateChanged(boolean param1Boolean);
/*     */     
/*     */     void commandSearchRequested();
/*     */     
/*     */     @RequiresEdt
/*     */     void promptVisibilityChanged(boolean param1Boolean);
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */     public static final class DefaultImpls {
/*     */       public static void commandHistoryStateChanged(@NotNull TerminalPromptController.PromptStateListener $this, boolean showing) {}
/*     */       
/*     */       public static void commandSearchRequested(@NotNull TerminalPromptController.PromptStateListener $this) {}
/*     */       
/*     */       @RequiresEdt
/*     */       public static void promptVisibilityChanged(@NotNull TerminalPromptController.PromptStateListener $this, boolean visible) {}
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptController$Companion;", "", "<init>", "()V", "KEY", "Lcom/intellij/openapi/actionSystem/DataKey;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptController;", "getKEY", "()Lcom/intellij/openapi/actionSystem/DataKey;", "ej-core"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final DataKey<TerminalPromptController> getKEY() {
/*     */       return TerminalPromptController.KEY;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\TerminalPromptController.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */