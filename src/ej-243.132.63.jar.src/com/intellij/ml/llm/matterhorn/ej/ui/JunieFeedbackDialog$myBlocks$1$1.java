/*    */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*    */ 
/*    */ import com.intellij.ui.dsl.builder.Panel;
/*    */ import com.intellij.ui.dsl.builder.Row;
/*    */ import feedback.FeedbackBlock;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/JunieFeedbackDialog$myBlocks$1$1", "Lfeedback/FeedbackBlock;", "addToPanel", "", "panel", "Lcom/intellij/ui/dsl/builder/Panel;", "ej-ui"})
/*    */ public final class JunieFeedbackDialog$myBlocks$1$1
/*    */   implements FeedbackBlock
/*    */ {
/*    */   public void addToPanel(Panel panel) {
/* 62 */     Intrinsics.checkNotNullParameter(panel, "panel"); Panel.row$default(panel, null, JunieFeedbackDialog$myBlocks$1$1::addToPanel$lambda$0, 1, null); } private static final Unit addToPanel$lambda$0(Row $this$row) {
/* 63 */     Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.browserLink("FAQ", "https://www.jetbrains.com/help/junie/");
/* 64 */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\JunieFeedbackDialog$myBlocks$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */