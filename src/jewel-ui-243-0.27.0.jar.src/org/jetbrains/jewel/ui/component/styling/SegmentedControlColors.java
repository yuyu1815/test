/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.ui.graphics.Brush;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\r\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0262\0020\001:\001\026B/\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003\022\006\020\007\032\0020\003¢\006\004\b\b\020\tJ\035\020\020\032\b\022\004\022\0020\0030\0212\006\020\022\032\0020\023H\007¢\006\004\b\024\020\025R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\f\020\013R\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\r\020\013R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\016\020\013R\021\020\007\032\0020\003¢\006\b\n\000\032\004\b\017\020\013¨\006\027"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlColors;", "", "border", "Landroidx/compose/ui/graphics/Brush;", "borderDisabled", "borderPressed", "borderHovered", "borderFocused", "<init>", "(Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;)V", "getBorder", "()Landroidx/compose/ui/graphics/Brush;", "getBorderDisabled", "getBorderPressed", "getBorderHovered", "getBorderFocused", "borderFor", "Landroidx/compose/runtime/State;", "state", "Lorg/jetbrains/jewel/ui/component/SegmentedControlState;", "borderFor-ASBgGNQ", "(JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class SegmentedControlColors {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final Brush border;
/*    */   @NotNull
/*    */   private final Brush borderDisabled;
/*    */   @NotNull
/*    */   private final Brush borderPressed;
/*    */   @NotNull
/*    */   private final Brush borderHovered;
/*    */   @NotNull
/*    */   private final Brush borderFocused;
/*    */   public static final int $stable;
/*    */   
/* 27 */   public SegmentedControlColors(@NotNull Brush border, @NotNull Brush borderDisabled, @NotNull Brush borderPressed, @NotNull Brush borderHovered, @NotNull Brush borderFocused) { this.border = border;
/* 28 */     this.borderDisabled = borderDisabled;
/* 29 */     this.borderPressed = borderPressed;
/* 30 */     this.borderHovered = borderHovered;
/* 31 */     this.borderFocused = borderFocused; } @NotNull public final Brush getBorder() { return this.border; } @NotNull public final Brush getBorderDisabled() { return this.borderDisabled; } @NotNull public final Brush getBorderFocused() { return this.borderFocused; }
/*    */   @NotNull public final Brush getBorderPressed() { return this.borderPressed; }
/*    */   @NotNull
/*    */   public final Brush getBorderHovered() { return this.borderHovered; } @Composable
/*    */   @NotNull
/* 36 */   public final State<Brush> borderFor-ASBgGNQ(long state, @Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(-2138392788); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-2138392788, $changed, -1, "org.jetbrains.jewel.ui.component.styling.SegmentedControlColors.borderFor (SegmentedControlStyling.kt:35)");  $composer.startReplaceGroup(-1203331000);
/* 37 */     Brush brush = (
/* 38 */       SegmentedControlState.isFocused-impl(state) && SegmentedControlState.isEnabled-impl(state)) ? this.borderFocused : 
/*    */       
/* 40 */       (Brush)SegmentedControlStylingKt.access$chooseValueIgnoreCompat-yXITNSw(state, 
/* 41 */         this.border, 
/* 42 */         this.borderDisabled, 
/* 43 */         this.borderPressed, 
/* 44 */         this.borderHovered, 
/* 45 */         this.border, $composer, 0xE & $changed);
/*    */     $composer.endReplaceGroup();
/*    */     State<Brush> state1 = SnapshotStateKt.rememberUpdatedState(brush, $composer, 0);
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */     return state1; }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SegmentedControlColors))
/*    */       return false; 
/*    */     SegmentedControlColors segmentedControlColors = (SegmentedControlColors)other;
/*    */     return !Intrinsics.areEqual(this.border, segmentedControlColors.border) ? false : (!Intrinsics.areEqual(this.borderDisabled, segmentedControlColors.borderDisabled) ? false : (!Intrinsics.areEqual(this.borderPressed, segmentedControlColors.borderPressed) ? false : (!Intrinsics.areEqual(this.borderHovered, segmentedControlColors.borderHovered) ? false : (!!Intrinsics.areEqual(this.borderFocused, segmentedControlColors.borderFocused)))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.border.hashCode();
/*    */     result = result * 31 + this.borderDisabled.hashCode();
/*    */     result = result * 31 + this.borderPressed.hashCode();
/*    */     result = result * 31 + this.borderHovered.hashCode();
/*    */     return result * 31 + this.borderFocused.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SegmentedControlColors(border=" + this.border + ", borderDisabled=" + this.borderDisabled + ", borderPressed=" + this.borderPressed + ", borderHovered=" + this.borderHovered + ", borderFocused=" + this.borderFocused + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlColors$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\SegmentedControlColors.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */