/*    */ package org.jetbrains.jewel.ui.painter.hints;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.foundation.state.InteractiveComponentState;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032\016\020\000\032\0020\0012\006\020\002\032\0020\003¨\006\004"}, d2 = {"Stateful", "Lorg/jetbrains/jewel/ui/painter/PainterHint;", "state", "Lorg/jetbrains/jewel/foundation/state/InteractiveComponentState;", "ui"})
/*    */ public final class StatefulKt
/*    */ {
/*    */   @NotNull
/*    */   public static final PainterHint Stateful(@NotNull InteractiveComponentState state) {
/* 47 */     Intrinsics.checkNotNullParameter(state, "state"); return (PainterHint)new StatefulImpl(state);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\hints\StatefulKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */