/*     */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import com.intellij.openapi.actionSystem.ActionUpdateThread;
/*     */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*     */ import com.intellij.openapi.project.DumbAwareAction;
/*     */ import com.intellij.openapi.ui.ThreeComponentsSplitter;
/*     */ import com.intellij.openapi.wm.ToolWindow;
/*     */ import com.intellij.openapi.wm.ToolWindowAnchor;
/*     */ import com.intellij.ui.ComponentUtil;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.math.MathKt;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\020\b\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J&\020\b\032\034\022\004\022\0020\n\022\020\022\016\022\004\022\0020\n\022\004\022\0020\f0\013\030\0010\t*\0020\rH\002J\020\020\016\032\0020\f2\006\020\017\032\0020\020H\026J\020\020\021\032\0020\f2\006\020\017\032\0020\020H\026J\b\020\022\032\0020\023H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/ElectroJuniorToolWindowFactory$ToggleColumnModeAction;", "Lcom/intellij/openapi/project/DumbAwareAction;", "toolWindow", "Lcom/intellij/openapi/wm/ToolWindow;", "<init>", "(Lcom/intellij/openapi/wm/ToolWindow;)V", "getToolWindow", "()Lcom/intellij/openapi/wm/ToolWindow;", "getSizeAccessor", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "", "Lcom/intellij/openapi/ui/ThreeComponentsSplitter;", "update", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "actionPerformed", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class ToggleColumnModeAction
/*     */   extends DumbAwareAction
/*     */ {
/*     */   @NotNull
/*     */   private final ToolWindow toolWindow;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public ToggleColumnModeAction(@NotNull ToolWindow toolWindow) {
/*  94 */     super(
/*  95 */         "Toggle Column Mode", 
/*  96 */         "Switch between single column and two columns mode", 
/*  97 */         JunieIcons.INSTANCE.getSplitVertically());
/*     */     this.toolWindow = toolWindow;
/*     */   } @NotNull
/* 100 */   public final ToolWindow getToolWindow() { return this.toolWindow; } private final Pair<Integer, Function1<Integer, Unit>> getSizeAccessor(ThreeComponentsSplitter $this$getSizeAccessor) { ToolWindowAnchor toolWindowAnchor = this.toolWindow.getAnchor(); return 
/* 101 */       Intrinsics.areEqual(toolWindowAnchor, ToolWindowAnchor.RIGHT) ? new Pair(Integer.valueOf($this$getSizeAccessor.getLastSize()), $this$getSizeAccessor::getSizeAccessor$lambda$0) : (
/* 102 */       Intrinsics.areEqual(toolWindowAnchor, ToolWindowAnchor.LEFT) ? new Pair(Integer.valueOf($this$getSizeAccessor.getFirstSize()), $this$getSizeAccessor::getSizeAccessor$lambda$1) : 
/* 103 */       null); }
/*     */   
/*     */   private static final Unit getSizeAccessor$lambda$0(ThreeComponentsSplitter $this_getSizeAccessor, int newSize) {
/*     */     $this_getSizeAccessor.setLastSize(newSize);
/*     */     return Unit.INSTANCE;
/* 108 */   } public void update(@NotNull AnActionEvent e) { Intrinsics.checkNotNullParameter(e, "e"); ThreeComponentsSplitter splitter = (ThreeComponentsSplitter)ComponentUtil.getParentOfType(ThreeComponentsSplitter.class, this.toolWindow.getComponent());
/* 109 */     Pair<Integer, Function1<Integer, Unit>> accessor = (splitter != null) ? getSizeAccessor(splitter) : null;
/*     */     
/* 111 */     if (accessor == null) {
/* 112 */       e.getPresentation().setEnabledAndVisible(false);
/*     */       
/*     */       return;
/*     */     } 
/* 116 */     int compSize = ((Number)accessor.component1()).intValue();
/* 117 */     boolean isSingleColumn = (compSize < 625);
/* 118 */     e.getPresentation().setEnabledAndVisible(true);
/* 119 */     e.getPresentation().setText(isSingleColumn ? "Two Columns Mode" : "Single Column Mode");
/* 120 */     e.getPresentation().setDescription(isSingleColumn ? "Switch to two columns mode" : "Switch to single column mode");
/* 121 */     e.getPresentation().setIcon(JunieIcons.INSTANCE.getSplitVertically()); }
/*     */   private static final Unit getSizeAccessor$lambda$1(ThreeComponentsSplitter $this_getSizeAccessor, int newSize) { $this_getSizeAccessor.setFirstSize(newSize);
/*     */     return Unit.INSTANCE; } public void actionPerformed(@NotNull AnActionEvent e) { ThreeComponentsSplitter splitter;
/*     */     Pair<Integer, Function1<Integer, Unit>> accessor;
/* 125 */     Intrinsics.checkNotNullParameter(e, "e"); if ((ThreeComponentsSplitter)ComponentUtil.getParentOfType(ThreeComponentsSplitter.class, this.toolWindow.getComponent()) == null) { (ThreeComponentsSplitter)ComponentUtil.getParentOfType(ThreeComponentsSplitter.class, this.toolWindow.getComponent()); return; }
/* 126 */      if (getSizeAccessor(splitter) == null) { getSizeAccessor(splitter); return; }
/* 127 */      int compSize = ((Number)accessor.component1()).intValue(); Function1 setter = (Function1)accessor.component2();
/*     */     
/* 129 */     if (compSize < 625) { setter.invoke(Integer.valueOf(MathKt.roundToInt(750.0D))); }
/* 130 */     else { setter.invoke(Integer.valueOf(MathKt.roundToInt(416.6666666666667D))); }
/*     */      }
/*     */    @NotNull
/*     */   public ActionUpdateThread getActionUpdateThread() {
/* 134 */     return ActionUpdateThread.EDT;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\ElectroJuniorToolWindowFactory$ToggleColumnModeAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */