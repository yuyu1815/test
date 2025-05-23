/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*    */ 
/*    */ import com.intellij.openapi.actionSystem.ActionPromoter;
/*    */ import com.intellij.openapi.actionSystem.AnAction;
/*    */ import com.intellij.openapi.actionSystem.DataContext;
/*    */ import com.intellij.openapi.editor.actionSystem.EditorAction;
/*    */ import com.intellij.openapi.editor.actionSystem.EditorActionHandler;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\000\b \030\0002\0020\0012\0020\002B\017\022\006\020\003\032\0020\004¢\006\004\b\005\020\006J$\020\007\032\b\022\004\022\0020\t0\b2\f\020\n\032\b\022\004\022\0020\t0\b2\006\020\013\032\0020\fH\026¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalPromotedEditorAction;", "Lcom/intellij/openapi/editor/actionSystem/EditorAction;", "Lcom/intellij/openapi/actionSystem/ActionPromoter;", "handler", "Lcom/intellij/openapi/editor/actionSystem/EditorActionHandler;", "<init>", "(Lcom/intellij/openapi/editor/actionSystem/EditorActionHandler;)V", "promote", "", "Lcom/intellij/openapi/actionSystem/AnAction;", "actions", "context", "Lcom/intellij/openapi/actionSystem/DataContext;", "ej-core"})
/*    */ public abstract class TerminalPromotedEditorAction
/*    */   extends EditorAction
/*    */   implements ActionPromoter
/*    */ {
/*    */   public TerminalPromotedEditorAction(@NotNull EditorActionHandler handler) {
/* 23 */     super(handler);
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public List<AnAction> promote(@NotNull List actions, @NotNull DataContext context) {
/* 29 */     Intrinsics.checkNotNullParameter(actions, "actions"); Intrinsics.checkNotNullParameter(context, "context"); return CollectionsKt.listOf(this);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\TerminalPromotedEditorAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */