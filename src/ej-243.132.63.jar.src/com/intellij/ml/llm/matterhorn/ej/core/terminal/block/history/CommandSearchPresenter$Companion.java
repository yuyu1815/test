/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.history;
/*    */ 
/*    */ import com.intellij.codeInsight.lookup.Lookup;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\020\013\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000R\025\020\007\032\0020\006*\0020\b8F¢\006\006\032\004\b\007\020\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandSearchPresenter$Companion;", "", "<init>", "()V", "IS_COMMAND_SEARCH_LOOKUP_KEY", "Lcom/intellij/openapi/util/Key;", "", "isTerminalCommandSearch", "Lcom/intellij/codeInsight/lookup/Lookup;", "(Lcom/intellij/codeInsight/lookup/Lookup;)Z", "ej-core"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   public final boolean isTerminalCommandSearch(@NotNull Lookup $this$isTerminalCommandSearch) {
/* 42 */     Intrinsics.checkNotNullParameter($this$isTerminalCommandSearch, "<this>"); ($this$isTerminalCommandSearch instanceof com.intellij.openapi.util.UserDataHolder) ? $this$isTerminalCommandSearch : null; return ((($this$isTerminalCommandSearch instanceof com.intellij.openapi.util.UserDataHolder) ? $this$isTerminalCommandSearch : null) != null) ? Intrinsics.areEqual((($this$isTerminalCommandSearch instanceof com.intellij.openapi.util.UserDataHolder) ? $this$isTerminalCommandSearch : null).getUserData(CommandSearchPresenter.access$getIS_COMMAND_SEARCH_LOOKUP_KEY$cp()), Boolean.valueOf(true)) : false;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\history\CommandSearchPresenter$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */