/*    */ package org.jetbrains.jewel.ui.painter.hints;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.foundation.state.SelectableComponentState;
/*    */ import org.jetbrains.jewel.ui.painter.PainterHint;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\032\020\020\000\032\0020\0012\b\b\002\020\002\032\0020\003\032\016\020\000\032\0020\0012\006\020\004\032\0020\005¨\006\006"}, d2 = {"Selected", "Lorg/jetbrains/jewel/ui/painter/PainterHint;", "selected", "", "state", "Lorg/jetbrains/jewel/foundation/state/SelectableComponentState;", "ui"})
/*    */ public final class SelectedKt
/*    */ {
/*    */   @NotNull
/*    */   public static final PainterHint Selected(boolean selected) {
/* 27 */     return selected ? (PainterHint)SelectedImpl.INSTANCE : (PainterHint)PainterHint.None; } @NotNull
/*    */   public static final PainterHint Selected(@NotNull SelectableComponentState state) {
/* 29 */     Intrinsics.checkNotNullParameter(state, "state"); return Selected(state.isSelected());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\hints\SelectedKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */