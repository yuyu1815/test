/*    */ package org.jetbrains.jewel.foundation.state;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.foundation.theme.JewelTheme;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */ public final class DefaultImpls {
/*    */   @Composable
/*    */   public static <T> T chooseValue(@NotNull FocusableComponentState $this, Object normal, Object disabled, Object focused, Object pressed, Object hovered, Object active, @Nullable Composer $composer, int $changed) {
/* 11 */     $composer.startReplaceGroup(1553526969); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1553526969, $changed, -1, "org.jetbrains.jewel.foundation.state.FocusableComponentState.chooseValue (FocusableComponentState.kt:10)");
/*    */     
/* 13 */     $composer.startReplaceGroup(-345432783); boolean bool = ($this.isPressed() && !JewelTheme.Companion.isSwingCompatMode($composer, 6)) ? true : false; $composer.endReplaceGroup();
/* 14 */     $composer.startReplaceGroup(-345366908); bool = ($this.isHovered() && $this.isFocused() && !JewelTheme.Companion.isSwingCompatMode($composer, 6)) ? true : false; $composer.endReplaceGroup();
/* 15 */     $composer.startReplaceGroup(-345288509); bool = ($this.isHovered() && !$this.isFocused() && !JewelTheme.Companion.isSwingCompatMode($composer, 6)) ? true : false; $composer.endReplaceGroup(); Object object = !$this.isEnabled() ? disabled : (bool ? pressed : (bool ? hovered : (bool ? active : (
/* 16 */       $this.isFocused() ? focused : (
/* 17 */       $this.isActive() ? active : 
/* 18 */       normal)))));
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */     return (T)object;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\state\FocusableComponentState$DefaultImpls.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */