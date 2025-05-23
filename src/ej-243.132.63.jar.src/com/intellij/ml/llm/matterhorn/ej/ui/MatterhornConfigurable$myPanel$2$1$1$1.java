/*    */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.run.ExecutionMode;
/*    */ import com.intellij.ui.SimpleListCellRenderer;
/*    */ import javax.swing.JList;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000+\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\000\n\002\020\013\n\002\b\002*\001\000\b\n\030\0002\n\022\006\022\004\030\0010\0020\001J<\020\003\032\0020\0042\020\020\005\032\f\022\b\b\001\022\004\030\0010\0020\0062\b\020\007\032\004\030\0010\0022\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\013H\026¨\006\r"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/MatterhornConfigurable$myPanel$2$1$1$1", "Lcom/intellij/ui/SimpleListCellRenderer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionMode;", "customize", "", "list", "Ljavax/swing/JList;", "value", "index", "", "selected", "", "hasFocus", "ej-ui"})
/*    */ public final class MatterhornConfigurable$myPanel$2$1$1$1
/*    */   extends SimpleListCellRenderer<ExecutionMode>
/*    */ {
/*    */   public void customize(JList list, ExecutionMode value, int index, boolean selected, boolean hasFocus) {
/* 22 */     Intrinsics.checkNotNullParameter(list, "list"); if (value == null || value.getMessageBundleKey() == null) value.getMessageBundleKey();  value.getMessageBundleKey().setText(MatterhornBundle.message("settings.execution.mode.default", new Object[0]));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\MatterhornConfigurable$myPanel$2$1$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */