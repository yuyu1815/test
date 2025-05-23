/*    */ package org.jetbrains.jewel.foundation.state;@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\013\bf\030\0002\0020\001JC\020\005\032\002H\006\"\004\b\000\020\0062\006\020\007\032\002H\0062\006\020\b\032\002H\0062\006\020\t\032\002H\0062\006\020\n\032\002H\0062\006\020\013\032\002H\0062\006\020\f\032\002H\006H\027¢\006\002\020\rR\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\002\020\004¨\006\016"}, d2 = {"Lorg/jetbrains/jewel/foundation/state/FocusableComponentState;", "Lorg/jetbrains/jewel/foundation/state/InteractiveComponentState;", "isFocused", "", "()Z", "chooseValue", "T", "normal", "disabled", "focused", "pressed", "hovered", "active", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "foundation"})
/*    */ public interface FocusableComponentState extends InteractiveComponentState { boolean isFocused();
/*    */   
/*    */   @Composable
/*    */   <T> T chooseValue(T paramT1, T paramT2, T paramT3, T paramT4, T paramT5, T paramT6, @Nullable Composer paramComposer, int paramInt);
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls {
/*    */     @Composable
/*    */     public static <T> T chooseValue(@NotNull FocusableComponentState $this, Object normal, Object disabled, Object focused, Object pressed, Object hovered, Object active, @Nullable Composer $composer, int $changed) {
/* 11 */       $composer.startReplaceGroup(1553526969); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1553526969, $changed, -1, "org.jetbrains.jewel.foundation.state.FocusableComponentState.chooseValue (FocusableComponentState.kt:10)");
/*    */       
/* 13 */       $composer.startReplaceGroup(-345432783); boolean bool = ($this.isPressed() && !JewelTheme.Companion.isSwingCompatMode($composer, 6)) ? true : false; $composer.endReplaceGroup();
/* 14 */       $composer.startReplaceGroup(-345366908); bool = ($this.isHovered() && $this.isFocused() && !JewelTheme.Companion.isSwingCompatMode($composer, 6)) ? true : false; $composer.endReplaceGroup();
/* 15 */       $composer.startReplaceGroup(-345288509); bool = ($this.isHovered() && !$this.isFocused() && !JewelTheme.Companion.isSwingCompatMode($composer, 6)) ? true : false; $composer.endReplaceGroup(); Object object = !$this.isEnabled() ? disabled : (bool ? pressed : (bool ? hovered : (bool ? active : (
/* 16 */         $this.isFocused() ? focused : (
/* 17 */         $this.isActive() ? active : 
/* 18 */         normal)))));
/*    */       if (ComposerKt.isTraceInProgress())
/*    */         ComposerKt.traceEventEnd(); 
/*    */       $composer.endReplaceGroup();
/*    */       return (T)object;
/*    */     }
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\state\FocusableComponentState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */