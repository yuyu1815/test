/*    */ package org.jetbrains.jewel.ui.component.styling;@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\013\n\002\030\002\n\000\n\002\030\002\n\002\b'\bg\030\0002\0020\001J\035\020\016\032\b\022\004\022\0020\0030\0172\006\020\020\032\0020\021H\027¢\006\004\b\022\020\023J\035\020\036\032\b\022\004\022\0020\0030\0172\006\020\020\032\0020\021H\027¢\006\004\b\037\020\023J\035\020*\032\b\022\004\022\0020\0030\0172\006\020\020\032\0020\021H\027¢\006\004\b+\020\023J\035\0206\032\b\022\004\022\0020\0030\0172\006\020\020\032\0020\021H\027¢\006\004\b7\020\023R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\003X¦\004¢\006\006\032\004\b\007\020\005R\022\020\b\032\0020\003X¦\004¢\006\006\032\004\b\t\020\005R\022\020\n\032\0020\003X¦\004¢\006\006\032\004\b\013\020\005R\022\020\f\032\0020\003X¦\004¢\006\006\032\004\b\r\020\005R\022\020\024\032\0020\003X¦\004¢\006\006\032\004\b\025\020\005R\022\020\026\032\0020\003X¦\004¢\006\006\032\004\b\027\020\005R\022\020\030\032\0020\003X¦\004¢\006\006\032\004\b\031\020\005R\022\020\032\032\0020\003X¦\004¢\006\006\032\004\b\033\020\005R\022\020\034\032\0020\003X¦\004¢\006\006\032\004\b\035\020\005R\022\020 \032\0020\003X¦\004¢\006\006\032\004\b!\020\005R\022\020\"\032\0020\003X¦\004¢\006\006\032\004\b#\020\005R\022\020$\032\0020\003X¦\004¢\006\006\032\004\b%\020\005R\022\020&\032\0020\003X¦\004¢\006\006\032\004\b'\020\005R\022\020(\032\0020\003X¦\004¢\006\006\032\004\b)\020\005R\022\020,\032\0020\003X¦\004¢\006\006\032\004\b-\020\005R\022\020.\032\0020\003X¦\004¢\006\006\032\004\b/\020\005R\022\0200\032\0020\003X¦\004¢\006\006\032\004\b1\020\005R\022\0202\032\0020\003X¦\004¢\006\006\032\004\b3\020\005R\022\0204\032\0020\003X¦\004¢\006\006\032\004\b5\020\005¨\0068"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/InputFieldColors;", "", "background", "Landroidx/compose/ui/graphics/Color;", "getBackground-0d7_KjU", "()J", "backgroundDisabled", "getBackgroundDisabled-0d7_KjU", "backgroundFocused", "getBackgroundFocused-0d7_KjU", "backgroundPressed", "getBackgroundPressed-0d7_KjU", "backgroundHovered", "getBackgroundHovered-0d7_KjU", "backgroundFor", "Landroidx/compose/runtime/State;", "state", "Lorg/jetbrains/jewel/ui/component/InputFieldState;", "backgroundFor-xB6EZ8U", "(JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "content", "getContent-0d7_KjU", "contentDisabled", "getContentDisabled-0d7_KjU", "contentFocused", "getContentFocused-0d7_KjU", "contentPressed", "getContentPressed-0d7_KjU", "contentHovered", "getContentHovered-0d7_KjU", "contentFor", "contentFor-xB6EZ8U", "border", "getBorder-0d7_KjU", "borderDisabled", "getBorderDisabled-0d7_KjU", "borderFocused", "getBorderFocused-0d7_KjU", "borderPressed", "getBorderPressed-0d7_KjU", "borderHovered", "getBorderHovered-0d7_KjU", "borderFor", "borderFor-xB6EZ8U", "caret", "getCaret-0d7_KjU", "caretDisabled", "getCaretDisabled-0d7_KjU", "caretFocused", "getCaretFocused-0d7_KjU", "caretPressed", "getCaretPressed-0d7_KjU", "caretHovered", "getCaretHovered-0d7_KjU", "caretFor", "caretFor-xB6EZ8U", "ui"})
/*    */ @Immutable
/*    */ public interface InputFieldColors { long getBackground-0d7_KjU(); long getBackgroundDisabled-0d7_KjU(); long getBackgroundFocused-0d7_KjU(); long getBackgroundPressed-0d7_KjU(); long getBackgroundHovered-0d7_KjU(); @Composable
/*    */   @NotNull
/*    */   State<Color> backgroundFor-xB6EZ8U(long paramLong, @Nullable Composer paramComposer, int paramInt); long getContent-0d7_KjU(); long getContentDisabled-0d7_KjU(); long getContentFocused-0d7_KjU();
/*    */   long getContentPressed-0d7_KjU();
/*    */   long getContentHovered-0d7_KjU();
/*    */   @Composable
/*    */   @NotNull
/*    */   State<Color> contentFor-xB6EZ8U(long paramLong, @Nullable Composer paramComposer, int paramInt);
/*    */   long getBorder-0d7_KjU();
/*    */   long getBorderDisabled-0d7_KjU();
/*    */   long getBorderFocused-0d7_KjU();
/*    */   long getBorderPressed-0d7_KjU();
/*    */   long getBorderHovered-0d7_KjU();
/*    */   @Composable
/*    */   @NotNull
/*    */   State<Color> borderFor-xB6EZ8U(long paramLong, @Nullable Composer paramComposer, int paramInt);
/*    */   long getCaret-0d7_KjU();
/*    */   long getCaretDisabled-0d7_KjU();
/*    */   long getCaretFocused-0d7_KjU();
/*    */   long getCaretPressed-0d7_KjU();
/*    */   long getCaretHovered-0d7_KjU();
/*    */   @Composable
/*    */   @NotNull
/*    */   State<Color> caretFor-xB6EZ8U(long paramLong, @Nullable Composer paramComposer, int paramInt);
/*    */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls { @Composable
/*    */     @NotNull
/*    */     public static State<Color> backgroundFor-xB6EZ8U(@NotNull InputFieldColors $this, long state, @Nullable Composer $composer, int $changed) {
/* 31 */       $composer.startReplaceGroup(924829957); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(924829957, $changed, -1, "org.jetbrains.jewel.ui.component.styling.InputFieldColors.backgroundFor (InputFieldStyling.kt:30)");  State<Color> state1 = SnapshotStateKt.rememberUpdatedState(
/* 32 */           InputFieldState.chooseValue-impl(state, 
/* 33 */             Color.box-impl($this.getBackground-0d7_KjU()), 
/* 34 */             Color.box-impl($this.getBackgroundDisabled-0d7_KjU()), 
/* 35 */             Color.box-impl($this.getBackgroundFocused-0d7_KjU()), 
/* 36 */             Color.box-impl($this.getBackgroundPressed-0d7_KjU()), 
/* 37 */             Color.box-impl($this.getBackgroundHovered-0d7_KjU()), 
/* 38 */             Color.box-impl($this.getBackground-0d7_KjU()), $composer, 0x380000 & $changed << 18), $composer, 0);
/*    */       if (ComposerKt.isTraceInProgress()) {
/*    */         ComposerKt.traceEventEnd();
/*    */       }
/*    */       $composer.endReplaceGroup();
/*    */       return state1;
/*    */     }
/*    */ 
/*    */     
/*    */     @Composable
/*    */     @NotNull
/*    */     public static State<Color> contentFor-xB6EZ8U(@NotNull InputFieldColors $this, long state, @Nullable Composer $composer, int $changed) {
/* 50 */       $composer.startReplaceGroup(1113892918); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1113892918, $changed, -1, "org.jetbrains.jewel.ui.component.styling.InputFieldColors.contentFor (InputFieldStyling.kt:49)");  State<Color> state1 = SnapshotStateKt.rememberUpdatedState(
/* 51 */           InputFieldState.chooseValue-impl(state, 
/* 52 */             Color.box-impl($this.getContent-0d7_KjU()), 
/* 53 */             Color.box-impl($this.getContentDisabled-0d7_KjU()), 
/* 54 */             Color.box-impl($this.getContentFocused-0d7_KjU()), 
/* 55 */             Color.box-impl($this.getContentPressed-0d7_KjU()), 
/* 56 */             Color.box-impl($this.getContentHovered-0d7_KjU()), 
/* 57 */             Color.box-impl($this.getContent-0d7_KjU()), $composer, 0x380000 & $changed << 18), $composer, 0);
/*    */       if (ComposerKt.isTraceInProgress()) {
/*    */         ComposerKt.traceEventEnd();
/*    */       }
/*    */       $composer.endReplaceGroup();
/*    */       return state1;
/*    */     }
/*    */ 
/*    */     
/*    */     @Composable
/*    */     @NotNull
/*    */     public static State<Color> borderFor-xB6EZ8U(@NotNull InputFieldColors $this, long state, @Nullable Composer $composer, int $changed) {
/* 69 */       $composer.startReplaceGroup(-880247481); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-880247481, $changed, -1, "org.jetbrains.jewel.ui.component.styling.InputFieldColors.borderFor (InputFieldStyling.kt:68)");  State<Color> state1 = SnapshotStateKt.rememberUpdatedState(
/* 70 */           InputFieldState.chooseValue-impl(state, 
/* 71 */             Color.box-impl($this.getBorder-0d7_KjU()), 
/* 72 */             Color.box-impl($this.getBorderDisabled-0d7_KjU()), 
/* 73 */             Color.box-impl($this.getBorderFocused-0d7_KjU()), 
/* 74 */             Color.box-impl($this.getBorderPressed-0d7_KjU()), 
/* 75 */             Color.box-impl($this.getBorderHovered-0d7_KjU()), 
/* 76 */             Color.box-impl($this.getBorder-0d7_KjU()), $composer, 0x380000 & $changed << 18), $composer, 0);
/*    */       if (ComposerKt.isTraceInProgress()) {
/*    */         ComposerKt.traceEventEnd();
/*    */       }
/*    */       $composer.endReplaceGroup();
/*    */       return state1;
/*    */     }
/*    */ 
/*    */     
/*    */     @Composable
/*    */     @NotNull
/*    */     public static State<Color> caretFor-xB6EZ8U(@NotNull InputFieldColors $this, long state, @Nullable Composer $composer, int $changed) {
/* 88 */       $composer.startReplaceGroup(873221484); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(873221484, $changed, -1, "org.jetbrains.jewel.ui.component.styling.InputFieldColors.caretFor (InputFieldStyling.kt:87)");  State<Color> state1 = SnapshotStateKt.rememberUpdatedState(
/* 89 */           InputFieldState.chooseValue-impl(state, 
/* 90 */             Color.box-impl($this.getCaret-0d7_KjU()), 
/* 91 */             Color.box-impl($this.getCaretDisabled-0d7_KjU()), 
/* 92 */             Color.box-impl($this.getCaretFocused-0d7_KjU()), 
/* 93 */             Color.box-impl($this.getCaretPressed-0d7_KjU()), 
/* 94 */             Color.box-impl($this.getCaretHovered-0d7_KjU()), 
/* 95 */             Color.box-impl($this.getCaret-0d7_KjU()), $composer, 0x380000 & $changed << 18), $composer, 0);
/*    */       if (ComposerKt.isTraceInProgress())
/*    */         ComposerKt.traceEventEnd(); 
/*    */       $composer.endReplaceGroup();
/*    */       return state1;
/*    */     } }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\InputFieldColors.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */