/*   */ package com.intellij.ml.llm.matterhorn.ej.ui.toolwindow;
/*   */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.FileChange;
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ 
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\030\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH\026¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/OnShowDiff$DoNothing;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/OnShowDiff;", "<init>", "()V", "showDiff", "", "change", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;", "wantEditable", "", "ej-ui"})
/*   */ @StabilityInferred(parameters = 1)
/*   */ public final class DoNothing implements OnShowDiff {
/*   */   public void showDiff(@NotNull FileChange change, boolean wantEditable) {
/* 9 */     Intrinsics.checkNotNullParameter(change, "change");
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public static final DoNothing INSTANCE = new DoNothing();
/*   */   public static final int $stable;
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\toolwindow\OnShowDiff$DoNothing.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */