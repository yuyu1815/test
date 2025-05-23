/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.history;
/*    */ import com.intellij.codeInsight.lookup.Lookup;
/*    */ import com.intellij.codeInsight.lookup.impl.LookupImpl;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.TerminalPromptModel;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.util.Key;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\020 \n\002\020\016\n\002\b\002\b\000\030\000 \0172\0020\001:\001\017B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\024\020\n\032\0020\0132\f\020\f\032\b\022\004\022\0020\0160\rR\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandSearchPresenter;", "", "project", "Lcom/intellij/openapi/project/Project;", "editor", "Lcom/intellij/openapi/editor/Editor;", "promptModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModel;", "<init>", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModel;)V", "showCommandSearch", "", "history", "", "", "Companion", "ej-core"})
/*    */ public final class CommandSearchPresenter {
/*    */   public CommandSearchPresenter(@NotNull Project project, @NotNull Editor editor, @NotNull TerminalPromptModel promptModel) {
/* 14 */     this.project = project;
/* 15 */     this.editor = editor;
/* 16 */     this.promptModel = promptModel;
/*    */   }
/*    */   
/* 19 */   public final void showCommandSearch(@NotNull List history) { Intrinsics.checkNotNullParameter(history, "history"); String command = this.promptModel.getCommandText();
/*    */ 
/*    */     
/* 22 */     LookupImpl lookup = CommandHistoryUtil.INSTANCE.createLookup(this.project, this.editor, command, CollectionsKt.asReversed(history));
/* 23 */     lookup.putUserData(IS_COMMAND_SEARCH_LOOKUP_KEY, Boolean.valueOf(true));
/*    */     
/* 25 */     lookup.addLookupListener(new CommandSearchPresenter$showCommandSearch$1());
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 31 */     if (lookup.showLookup()) {
/* 32 */       lookup.ensureSelectionVisible(false);
/*    */       
/* 34 */       ((CommandSearchListener)this.project.getMessageBus().syncPublisher(CommandSearchListener.Companion.getTOPIC())).commandSearchShown(this.promptModel);
/*    */     }  } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandSearchPresenter$showCommandSearch$1", "Lcom/intellij/codeInsight/lookup/LookupListener;", "lookupCanceled", "", "event", "Lcom/intellij/codeInsight/lookup/LookupEvent;", "ej-core"})
/*    */   public static final class CommandSearchPresenter$showCommandSearch$1 implements LookupListener {
/*    */     public void lookupCanceled(LookupEvent event) {
/*    */       Intrinsics.checkNotNullParameter(event, "event");
/*    */       ((CommandSearchListener)CommandSearchPresenter.this.project.getMessageBus().syncPublisher(CommandSearchListener.Companion.getTOPIC())).commandSearchAborted(CommandSearchPresenter.this.promptModel);
/*    */     } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\020\013\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000R\025\020\007\032\0020\006*\0020\b8F¢\006\006\032\004\b\007\020\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandSearchPresenter$Companion;", "", "<init>", "()V", "IS_COMMAND_SEARCH_LOOKUP_KEY", "Lcom/intellij/openapi/util/Key;", "", "isTerminalCommandSearch", "Lcom/intellij/codeInsight/lookup/Lookup;", "(Lcom/intellij/codeInsight/lookup/Lookup;)Z", "ej-core"})
/*    */   public static final class Companion { public final boolean isTerminalCommandSearch(@NotNull Lookup $this$isTerminalCommandSearch) {
/* 42 */       Intrinsics.checkNotNullParameter($this$isTerminalCommandSearch, "<this>"); ($this$isTerminalCommandSearch instanceof com.intellij.openapi.util.UserDataHolder) ? $this$isTerminalCommandSearch : null; return ((($this$isTerminalCommandSearch instanceof com.intellij.openapi.util.UserDataHolder) ? $this$isTerminalCommandSearch : null) != null) ? Intrinsics.areEqual((($this$isTerminalCommandSearch instanceof com.intellij.openapi.util.UserDataHolder) ? $this$isTerminalCommandSearch : null).getUserData(CommandSearchPresenter.IS_COMMAND_SEARCH_LOOKUP_KEY), Boolean.valueOf(true)) : false;
/*    */     }
/*    */     
/*    */     private Companion() {} }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final Project project;
/*    */   @NotNull
/*    */   private final Editor editor;
/*    */   @NotNull
/*    */   private final TerminalPromptModel promptModel;
/*    */   @NotNull
/*    */   private static final Key<Boolean> IS_COMMAND_SEARCH_LOOKUP_KEY = Key.create("isCommandSearchLookup");
/*    */   
/*    */   static {
/*    */     Intrinsics.checkNotNullExpressionValue(Key.create("isCommandSearchLookup"), "create(...)");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\history\CommandSearchPresenter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */