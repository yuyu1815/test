/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.history;
/*    */ import com.intellij.codeInsight.lookup.LookupArranger;
/*    */ import com.intellij.codeInsight.lookup.LookupElementBuilder;
/*    */ import com.intellij.codeInsight.lookup.LookupManager;
/*    */ import com.intellij.codeInsight.lookup.impl.LookupImpl;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import java.util.List;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020 \n\000\bÀ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J,\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\f\020\f\032\b\022\004\022\0020\0130\r¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryUtil;", "", "<init>", "()V", "createLookup", "Lcom/intellij/codeInsight/lookup/impl/LookupImpl;", "project", "Lcom/intellij/openapi/project/Project;", "editor", "Lcom/intellij/openapi/editor/Editor;", "prefix", "", "history", "", "ej-core"})
/*    */ public final class CommandHistoryUtil {
/*    */   @NotNull
/*    */   public final LookupImpl createLookup(@NotNull Project project, @NotNull Editor editor, @NotNull String prefix, @NotNull List history) {
/* 16 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(history, "history"); LookupArranger.DefaultArranger arranger = new LookupArranger.DefaultArranger();
/* 17 */     Intrinsics.checkNotNull(LookupManager.getInstance(project).createLookup(editor, new LookupElement[0], prefix, (LookupArranger)arranger), "null cannot be cast to non-null type com.intellij.codeInsight.lookup.impl.LookupImpl"); LookupImpl lookup = (LookupImpl)LookupManager.getInstance(project).createLookup(editor, new LookupElement[0], prefix, (LookupArranger)arranger);
/* 18 */     CommandHistoryPrefixMatcher prefixMatcher = new CommandHistoryPrefixMatcher(prefix);
/* 19 */     for (String historyItem : history) {
/* 20 */       Intrinsics.checkNotNullExpressionValue(LookupElementBuilder.create(historyItem), "create(...)"); LookupElementBuilder element = LookupElementBuilder.create(historyItem);
/* 21 */       lookup.addItem((LookupElement)element, prefixMatcher);
/*    */     } 
/* 23 */     return lookup;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final CommandHistoryUtil INSTANCE = new CommandHistoryUtil();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\history\CommandHistoryUtil.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */