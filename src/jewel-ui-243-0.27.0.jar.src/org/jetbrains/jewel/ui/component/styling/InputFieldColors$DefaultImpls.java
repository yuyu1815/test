/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.SnapshotStateKt;
/*    */ import androidx.compose.runtime.State;
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.ui.component.InputFieldState;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */ public final class DefaultImpls
/*    */ {
/*    */   @Composable
/*    */   @NotNull
/*    */   public static State<Color> backgroundFor-xB6EZ8U(@NotNull InputFieldColors $this, long state, @Nullable Composer $composer, int $changed) {
/* 31 */     $composer.startReplaceGroup(924829957); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(924829957, $changed, -1, "org.jetbrains.jewel.ui.component.styling.InputFieldColors.backgroundFor (InputFieldStyling.kt:30)");  State<Color> state1 = SnapshotStateKt.rememberUpdatedState(
/* 32 */         InputFieldState.chooseValue-impl(state, 
/* 33 */           Color.box-impl($this.getBackground-0d7_KjU()), 
/* 34 */           Color.box-impl($this.getBackgroundDisabled-0d7_KjU()), 
/* 35 */           Color.box-impl($this.getBackgroundFocused-0d7_KjU()), 
/* 36 */           Color.box-impl($this.getBackgroundPressed-0d7_KjU()), 
/* 37 */           Color.box-impl($this.getBackgroundHovered-0d7_KjU()), 
/* 38 */           Color.box-impl($this.getBackground-0d7_KjU()), $composer, 0x380000 & $changed << 18), $composer, 0);
/*    */     if (ComposerKt.isTraceInProgress()) {
/*    */       ComposerKt.traceEventEnd();
/*    */     }
/*    */     $composer.endReplaceGroup();
/*    */     return state1;
/*    */   }
/*    */ 
/*    */   
/*    */   @Composable
/*    */   @NotNull
/*    */   public static State<Color> contentFor-xB6EZ8U(@NotNull InputFieldColors $this, long state, @Nullable Composer $composer, int $changed) {
/* 50 */     $composer.startReplaceGroup(1113892918); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1113892918, $changed, -1, "org.jetbrains.jewel.ui.component.styling.InputFieldColors.contentFor (InputFieldStyling.kt:49)");  State<Color> state1 = SnapshotStateKt.rememberUpdatedState(
/* 51 */         InputFieldState.chooseValue-impl(state, 
/* 52 */           Color.box-impl($this.getContent-0d7_KjU()), 
/* 53 */           Color.box-impl($this.getContentDisabled-0d7_KjU()), 
/* 54 */           Color.box-impl($this.getContentFocused-0d7_KjU()), 
/* 55 */           Color.box-impl($this.getContentPressed-0d7_KjU()), 
/* 56 */           Color.box-impl($this.getContentHovered-0d7_KjU()), 
/* 57 */           Color.box-impl($this.getContent-0d7_KjU()), $composer, 0x380000 & $changed << 18), $composer, 0);
/*    */     if (ComposerKt.isTraceInProgress()) {
/*    */       ComposerKt.traceEventEnd();
/*    */     }
/*    */     $composer.endReplaceGroup();
/*    */     return state1;
/*    */   }
/*    */ 
/*    */   
/*    */   @Composable
/*    */   @NotNull
/*    */   public static State<Color> borderFor-xB6EZ8U(@NotNull InputFieldColors $this, long state, @Nullable Composer $composer, int $changed) {
/* 69 */     $composer.startReplaceGroup(-880247481); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-880247481, $changed, -1, "org.jetbrains.jewel.ui.component.styling.InputFieldColors.borderFor (InputFieldStyling.kt:68)");  State<Color> state1 = SnapshotStateKt.rememberUpdatedState(
/* 70 */         InputFieldState.chooseValue-impl(state, 
/* 71 */           Color.box-impl($this.getBorder-0d7_KjU()), 
/* 72 */           Color.box-impl($this.getBorderDisabled-0d7_KjU()), 
/* 73 */           Color.box-impl($this.getBorderFocused-0d7_KjU()), 
/* 74 */           Color.box-impl($this.getBorderPressed-0d7_KjU()), 
/* 75 */           Color.box-impl($this.getBorderHovered-0d7_KjU()), 
/* 76 */           Color.box-impl($this.getBorder-0d7_KjU()), $composer, 0x380000 & $changed << 18), $composer, 0);
/*    */     if (ComposerKt.isTraceInProgress()) {
/*    */       ComposerKt.traceEventEnd();
/*    */     }
/*    */     $composer.endReplaceGroup();
/*    */     return state1;
/*    */   }
/*    */ 
/*    */   
/*    */   @Composable
/*    */   @NotNull
/*    */   public static State<Color> caretFor-xB6EZ8U(@NotNull InputFieldColors $this, long state, @Nullable Composer $composer, int $changed) {
/* 88 */     $composer.startReplaceGroup(873221484); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(873221484, $changed, -1, "org.jetbrains.jewel.ui.component.styling.InputFieldColors.caretFor (InputFieldStyling.kt:87)");  State<Color> state1 = SnapshotStateKt.rememberUpdatedState(
/* 89 */         InputFieldState.chooseValue-impl(state, 
/* 90 */           Color.box-impl($this.getCaret-0d7_KjU()), 
/* 91 */           Color.box-impl($this.getCaretDisabled-0d7_KjU()), 
/* 92 */           Color.box-impl($this.getCaretFocused-0d7_KjU()), 
/* 93 */           Color.box-impl($this.getCaretPressed-0d7_KjU()), 
/* 94 */           Color.box-impl($this.getCaretHovered-0d7_KjU()), 
/* 95 */           Color.box-impl($this.getCaret-0d7_KjU()), $composer, 0x380000 & $changed << 18), $composer, 0);
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */     return state1;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\InputFieldColors$DefaultImpls.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */