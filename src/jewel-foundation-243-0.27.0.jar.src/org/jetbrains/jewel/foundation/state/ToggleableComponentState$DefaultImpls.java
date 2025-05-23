/*    */ package org.jetbrains.jewel.foundation.state;
/*    */ 
/*    */ import androidx.compose.ui.state.ToggleableState;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */ public final class DefaultImpls
/*    */ {
/*    */   public static boolean isSelected(@NotNull ToggleableComponentState $this) {
/* 11 */     return ($this.getToggleableState() == ToggleableState.On);
/*    */   }
/*    */   public static boolean isSelectedOrIndeterminate(@NotNull ToggleableComponentState $this) {
/* 14 */     return ($this.getToggleableState() != ToggleableState.Off);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\state\ToggleableComponentState$DefaultImpls.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */