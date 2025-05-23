/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*    */ 
/*    */ import com.intellij.openapi.actionSystem.ActionPromoter;
/*    */ import com.intellij.openapi.actionSystem.AnAction;
/*    */ import com.intellij.openapi.actionSystem.DataContext;
/*    */ import com.intellij.openapi.project.DumbAwareAction;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.ApiStatus.Experimental;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\000\b'\030\0002\0020\0012\0020\002B\007¢\006\004\b\003\020\004J$\020\005\032\b\022\004\022\0020\0070\0062\f\020\b\032\b\022\004\022\0020\0070\0062\006\020\t\032\0020\nH\026¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalPromotedDumbAwareAction;", "Lcom/intellij/openapi/project/DumbAwareAction;", "Lcom/intellij/openapi/actionSystem/ActionPromoter;", "<init>", "()V", "promote", "", "Lcom/intellij/openapi/actionSystem/AnAction;", "actions", "context", "Lcom/intellij/openapi/actionSystem/DataContext;", "ej-core"})
/*    */ @Experimental
/*    */ public abstract class TerminalPromotedDumbAwareAction extends DumbAwareAction implements ActionPromoter {
/*    */   @NotNull
/*    */   public List<AnAction> promote(@NotNull List actions, @NotNull DataContext context) {
/* 19 */     Intrinsics.checkNotNullParameter(actions, "actions"); Intrinsics.checkNotNullParameter(context, "context"); return CollectionsKt.listOf(this);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\TerminalPromotedDumbAwareAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */