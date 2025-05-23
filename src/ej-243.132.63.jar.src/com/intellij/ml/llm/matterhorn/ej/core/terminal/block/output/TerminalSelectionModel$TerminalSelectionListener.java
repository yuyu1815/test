/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\020 \n\002\030\002\n\002\b\005\bf\030\0002\0020\001J$\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0060\0052\f\020\007\032\b\022\004\022\0020\0060\005H\026J\034\020\b\032\0020\0032\b\020\t\032\004\030\0010\0062\b\020\n\032\004\030\0010\006H\026¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel$TerminalSelectionListener;", "", "selectionChanged", "", "oldSelection", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;", "newSelection", "hoverChanged", "oldHovered", "newHovered", "ej-core"})
/*    */ public interface TerminalSelectionListener
/*    */ {
/*    */   void selectionChanged(@NotNull List<? extends CommandBlock> paramList1, @NotNull List<? extends CommandBlock> paramList2);
/*    */   
/*    */   void hoverChanged(@Nullable CommandBlock paramCommandBlock1, @Nullable CommandBlock paramCommandBlock2);
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls
/*    */   {
/*    */     public static void selectionChanged(@NotNull TerminalSelectionModel.TerminalSelectionListener $this, @NotNull List oldSelection, @NotNull List newSelection) {
/* 49 */       Intrinsics.checkNotNullParameter(oldSelection, "oldSelection"); Intrinsics.checkNotNullParameter(newSelection, "newSelection");
/*    */     }
/*    */     
/*    */     public static void hoverChanged(@NotNull TerminalSelectionModel.TerminalSelectionListener $this, @Nullable CommandBlock oldHovered, @Nullable CommandBlock newHovered) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalSelectionModel$TerminalSelectionListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */