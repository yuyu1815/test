/*    */ package org.jetbrains.jewel.ui.painter.hints;
/*    */ 
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.foundation.state.InteractiveComponentState;
/*    */ import org.jetbrains.jewel.ui.painter.PainterProviderScope;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\030\002\n\000\b\003\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\f\020\006\032\0020\007*\0020\bH\026R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\t"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/hints/StatefulImpl;", "Lorg/jetbrains/jewel/ui/painter/PainterSuffixHint;", "state", "Lorg/jetbrains/jewel/foundation/state/InteractiveComponentState;", "<init>", "(Lorg/jetbrains/jewel/foundation/state/InteractiveComponentState;)V", "suffix", "", "Lorg/jetbrains/jewel/ui/painter/PainterProviderScope;", "ui"})
/*    */ @Immutable
/*    */ final class StatefulImpl extends PainterSuffixHint {
/* 13 */   public StatefulImpl(@NotNull InteractiveComponentState state) { this.state = state; } @NotNull private final InteractiveComponentState state; @NotNull
/* 14 */   public String suffix(@NotNull PainterProviderScope $this$suffix) { Intrinsics.checkNotNullParameter($this$suffix, "<this>"); StringBuilder stringBuilder1 = new StringBuilder(), $this$suffix_u24lambda_u240 = stringBuilder1; int $i$a$-buildString-StatefulImpl$suffix$1 = 0;
/* 15 */     if (this.state.isEnabled()) {
/*    */       
/* 17 */       if (this.state instanceof FocusableComponentState && ((FocusableComponentState)this.state).isFocused()) { $this$suffix_u24lambda_u240.append("Focused"); }
/* 18 */       else if (this.state.isPressed()) { $this$suffix_u24lambda_u240.append("Pressed"); }
/* 19 */       else if (this.state.isHovered()) { $this$suffix_u24lambda_u240.append("Hovered"); }
/*    */     
/*    */     } else {
/* 22 */       $this$suffix_u24lambda_u240.append("Disabled");
/*    */     } 
/*    */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*    */     return stringBuilder1.toString(); }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof StatefulImpl))
/*    */       return false; 
/*    */     StatefulImpl statefulImpl = (StatefulImpl)other;
/*    */     return !!Intrinsics.areEqual(this.state, statefulImpl.state);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.state.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "StatefulImpl(state=" + this.state + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\hints\StatefulImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */