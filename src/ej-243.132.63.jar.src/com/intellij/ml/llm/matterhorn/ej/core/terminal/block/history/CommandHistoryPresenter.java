/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.history;
/*     */ import com.intellij.codeInsight.lookup.Lookup;
/*     */ import com.intellij.codeInsight.lookup.LookupEvent;
/*     */ import com.intellij.codeInsight.lookup.impl.LookupImpl;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptController;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptModel;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.Key;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\000\n\002\020 \n\002\b\003\b\000\030\000 \0252\0020\001:\001\025B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\024\020\020\032\0020\0212\f\020\022\032\b\022\004\022\0020\0170\023J\006\020\024\032\0020\021R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\024\020\n\032\0020\0138BX\004¢\006\006\032\004\b\f\020\rR\020\020\016\032\004\030\0010\017X\016¢\006\002\n\000¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPresenter;", "", "project", "Lcom/intellij/openapi/project/Project;", "editor", "Lcom/intellij/openapi/editor/Editor;", "promptController", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptController;", "<init>", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptController;)V", "promptModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModel;", "getPromptModel", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModel;", "initialCommand", "", "showCommandHistory", "", "history", "", "onCommandHistoryClosed", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nCommandHistoryPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandHistoryPresenter.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPresenter\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,100:1\n24#2:101\n*S KotlinDebug\n*F\n+ 1 CommandHistoryPresenter.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPresenter\n*L\n73#1:101\n*E\n"})
/*     */ public final class CommandHistoryPresenter {
/*     */   public CommandHistoryPresenter(@NotNull Project project, @NotNull Editor editor, @NotNull TerminalPromptController promptController) {
/*  20 */     this.project = project;
/*  21 */     this.editor = editor;
/*  22 */     this.promptController = promptController;
/*     */   }
/*     */   private final TerminalPromptModel getPromptModel() {
/*  25 */     return this.promptController.getModel();
/*     */   }
/*     */ 
/*     */   
/*     */   public final void showCommandHistory(@NotNull List history) {
/*  30 */     Intrinsics.checkNotNullParameter(history, "history"); String command = getPromptModel().getCommandText();
/*  31 */     this.initialCommand = command;
/*     */ 
/*     */     
/*  34 */     LookupImpl lookup = CommandHistoryUtil.INSTANCE.createLookup(this.project, this.editor, StringsKt.trim(command).toString(), CollectionsKt.asReversed(history));
/*  35 */     lookup.putUserData(IS_COMMAND_HISTORY_LOOKUP_KEY, Boolean.valueOf(true));
/*     */     
/*  37 */     lookup.addLookupListener(new CommandHistoryPresenter$showCommandHistory$1(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  69 */     if (lookup.showLookup()) {
/*  70 */       lookup.ensureSelectionVisible(false);
/*  71 */       ((CommandHistoryListener)this.project.getMessageBus().syncPublisher(CommandHistoryListener.Companion.getTOPIC())).commandHistoryShown(getPromptModel());
/*     */     } else {
/*  73 */       Object $this$thisLogger$iv = this; int $i$f$thisLogger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 101 */       Intrinsics.checkNotNullExpressionValue(Logger.getInstance(CommandHistoryPresenter.class), "getInstance(...)"); Logger.getInstance(CommandHistoryPresenter.class).error("Failed to show command history");
/*     */     } 
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\003*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0072\006\020\004\032\0020\005H\026J\020\020\b\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\t\032\0020\0032\006\020\004\032\0020\005H\026¨\006\n"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPresenter$showCommandHistory$1", "Lcom/intellij/codeInsight/lookup/LookupListener;", "currentItemChanged", "", "event", "Lcom/intellij/codeInsight/lookup/LookupEvent;", "beforeItemSelected", "", "itemSelected", "lookupCanceled", "ej-core"})
/*     */   public static final class CommandHistoryPresenter$showCommandHistory$1 implements LookupListener {
/*     */     CommandHistoryPresenter$showCommandHistory$1(CommandHistoryPresenter $receiver) {}
/*     */     
/*     */     public void currentItemChanged(LookupEvent event) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'event'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_1
/*     */       //   7: invokevirtual getItem : ()Lcom/intellij/codeInsight/lookup/LookupElement;
/*     */       //   10: dup
/*     */       //   11: ifnull -> 21
/*     */       //   14: invokevirtual getLookupString : ()Ljava/lang/String;
/*     */       //   17: dup
/*     */       //   18: ifnonnull -> 23
/*     */       //   21: pop
/*     */       //   22: return
/*     */       //   23: astore_2
/*     */       //   24: aconst_null
/*     */       //   25: aload_0
/*     */       //   26: getfield $lookup : Lcom/intellij/codeInsight/lookup/impl/LookupImpl;
/*     */       //   29: aload_0
/*     */       //   30: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPresenter;
/*     */       //   33: aload_2
/*     */       //   34: <illegal opcode> invoke : (Lcom/intellij/codeInsight/lookup/impl/LookupImpl;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPresenter;Ljava/lang/String;)Lkotlin/jvm/functions/Function0;
/*     */       //   39: iconst_1
/*     */       //   40: aconst_null
/*     */       //   41: invokestatic invokeLater$default : (Lcom/intellij/openapi/application/ModalityState;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
/*     */       //   44: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #39	-> 6
/*     */       //   #40	-> 24
/*     */       //   #50	-> 44
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   24	21	2	selectedCommand	Ljava/lang/String;
/*     */       //   0	45	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPresenter$showCommandHistory$1;
/*     */       //   0	45	1	event	Lcom/intellij/codeInsight/lookup/LookupEvent;
/*     */     }
/*     */     
/*     */     private static final Unit currentItemChanged$lambda$2(LookupImpl $lookup, CommandHistoryPresenter this$0, String $selectedCommand) {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: invokevirtual isLookupDisposed : ()Z
/*     */       //   4: ifne -> 19
/*     */       //   7: aload_0
/*     */       //   8: aload_1
/*     */       //   9: aload_2
/*     */       //   10: <illegal opcode> invoke : (Lcom/intellij/codeInsight/lookup/impl/LookupImpl;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPresenter;Ljava/lang/String;)Lkotlin/jvm/functions/Function0;
/*     */       //   15: invokestatic runWriteAction : (Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
/*     */       //   18: pop
/*     */       //   19: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   22: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #41	-> 0
/*     */       //   #42	-> 7
/*     */       //   #49	-> 19
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	23	0	$lookup	Lcom/intellij/codeInsight/lookup/impl/LookupImpl;
/*     */       //   0	23	1	this$0	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPresenter;
/*     */       //   0	23	2	$selectedCommand	Ljava/lang/String;
/*     */     }
/*     */     
/*     */     private static final Unit currentItemChanged$lambda$2$lambda$1(LookupImpl $lookup, CommandHistoryPresenter this$0, String $selectedCommand) {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: aload_1
/*     */       //   2: aload_2
/*     */       //   3: <illegal opcode> run : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPresenter;Ljava/lang/String;)Ljava/lang/Runnable;
/*     */       //   8: invokevirtual performGuardedChange : (Ljava/lang/Runnable;)Z
/*     */       //   11: pop
/*     */       //   12: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   15: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #43	-> 0
/*     */       //   #47	-> 12
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	16	0	$lookup	Lcom/intellij/codeInsight/lookup/impl/LookupImpl;
/*     */       //   0	16	1	this$0	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPresenter;
/*     */       //   0	16	2	$selectedCommand	Ljava/lang/String;
/*     */     }
/*     */     
/*     */     private static final void currentItemChanged$lambda$2$lambda$1$lambda$0(CommandHistoryPresenter this$0, String $selectedCommand) {
/*     */       CommandHistoryPresenter.this.getPromptModel().setCommandText($selectedCommand);
/*     */       CommandHistoryPresenter.this.editor.getCaretModel().moveToOffset(CommandHistoryPresenter.this.editor.getDocument().getTextLength());
/*     */     }
/*     */     
/*     */     public boolean beforeItemSelected(LookupEvent event) {
/*     */       Intrinsics.checkNotNullParameter(event, "event");
/*     */       return false;
/*     */     }
/*     */     
/*     */     public void itemSelected(LookupEvent event) {
/*     */       Intrinsics.checkNotNullParameter(event, "event");
/*     */       CommandHistoryPresenter.this.initialCommand = null;
/*     */       if (event.getCompletionChar() == '\n')
/*     */         CommandHistoryPresenter.this.promptController.handleEnterPressed(); 
/*     */     }
/*     */     
/*     */     public void lookupCanceled(LookupEvent event) {
/*     */       Intrinsics.checkNotNullParameter(event, "event");
/*     */       CommandHistoryPresenter.this.initialCommand = null;
/*     */     }
/*     */   }
/*     */   
/*     */   public final void onCommandHistoryClosed() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield initialCommand : Ljava/lang/String;
/*     */     //   4: astore_1
/*     */     //   5: aload_1
/*     */     //   6: ifnull -> 34
/*     */     //   9: aload_0
/*     */     //   10: aconst_null
/*     */     //   11: putfield initialCommand : Ljava/lang/String;
/*     */     //   14: aload_0
/*     */     //   15: getfield editor : Lcom/intellij/openapi/editor/Editor;
/*     */     //   18: invokestatic getDisposed : (Lcom/intellij/openapi/editor/Editor;)Lkotlin/jvm/functions/Function0;
/*     */     //   21: aconst_null
/*     */     //   22: aload_0
/*     */     //   23: aload_1
/*     */     //   24: <illegal opcode> run : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPresenter;Ljava/lang/String;)Ljava/lang/Runnable;
/*     */     //   29: iconst_2
/*     */     //   30: aconst_null
/*     */     //   31: invokestatic invokeLater$default : (Lkotlin/jvm/functions/Function0;Lcom/intellij/openapi/application/ModalityState;Ljava/lang/Runnable;ILjava/lang/Object;)V
/*     */     //   34: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #81	-> 0
/*     */     //   #82	-> 5
/*     */     //   #83	-> 9
/*     */     //   #84	-> 14
/*     */     //   #91	-> 34
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   5	30	1	commandToRestore	Ljava/lang/String;
/*     */     //   0	35	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPresenter;
/*     */   }
/*     */   
/*     */   private static final void onCommandHistoryClosed$lambda$0(CommandHistoryPresenter this$0, String $commandToRestore) {
/*     */     this$0.getPromptModel().setCommandText($commandToRestore);
/*     */     this$0.editor.getCaretModel().moveToOffset(this$0.editor.getDocument().getTextLength());
/*     */     ((CommandHistoryListener)this$0.project.getMessageBus().syncPublisher(CommandHistoryListener.Companion.getTOPIC())).commandHistoryAborted(this$0.getPromptModel());
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\020\013\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000R\025\020\007\032\0020\006*\0020\b8F¢\006\006\032\004\b\007\020\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPresenter$Companion;", "", "<init>", "()V", "IS_COMMAND_HISTORY_LOOKUP_KEY", "Lcom/intellij/openapi/util/Key;", "", "isTerminalCommandHistory", "Lcom/intellij/codeInsight/lookup/Lookup;", "(Lcom/intellij/codeInsight/lookup/Lookup;)Z", "ej-core"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     public final boolean isTerminalCommandHistory(@NotNull Lookup $this$isTerminalCommandHistory) {
/*     */       Intrinsics.checkNotNullParameter($this$isTerminalCommandHistory, "<this>");
/*     */       ($this$isTerminalCommandHistory instanceof com.intellij.openapi.util.UserDataHolder) ? $this$isTerminalCommandHistory : null;
/*     */       return ((($this$isTerminalCommandHistory instanceof com.intellij.openapi.util.UserDataHolder) ? $this$isTerminalCommandHistory : null) != null) ? Intrinsics.areEqual((($this$isTerminalCommandHistory instanceof com.intellij.openapi.util.UserDataHolder) ? $this$isTerminalCommandHistory : null).getUserData(CommandHistoryPresenter.IS_COMMAND_HISTORY_LOOKUP_KEY), Boolean.valueOf(true)) : false;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final Editor editor;
/*     */   @NotNull
/*     */   private final TerminalPromptController promptController;
/*     */   @Nullable
/*     */   private String initialCommand;
/*     */   @NotNull
/*     */   private static final Key<Boolean> IS_COMMAND_HISTORY_LOOKUP_KEY = Key.create("isCommandHistoryLookup");
/*     */   
/*     */   static {
/*     */     Intrinsics.checkNotNullExpressionValue(Key.create("isCommandHistoryLookup"), "create(...)");
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\history\CommandHistoryPresenter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */