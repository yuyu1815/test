/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import androidx.compose.runtime.SnapshotStateKt;
/*    */ import androidx.compose.runtime.State;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import androidx.compose.ui.unit.DpSize;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.foundation.GenerateDataFunctions;
/*    */ import org.jetbrains.jewel.ui.component.RadioButtonState;
/*    */ 
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\r\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0342\0020\001:\001\034B7\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003\022\006\020\007\032\0020\003\022\006\020\b\032\0020\t¢\006\004\b\n\020\013J\035\020\026\032\b\022\004\022\0020\0030\0272\006\020\030\032\0020\031H\007¢\006\004\b\032\020\033R\023\020\002\032\0020\003¢\006\n\n\002\020\016\032\004\b\f\020\rR\023\020\004\032\0020\003¢\006\n\n\002\020\016\032\004\b\017\020\rR\023\020\005\032\0020\003¢\006\n\n\002\020\016\032\004\b\020\020\rR\023\020\006\032\0020\003¢\006\n\n\002\020\016\032\004\b\021\020\rR\023\020\007\032\0020\003¢\006\n\n\002\020\016\032\004\b\022\020\rR\023\020\b\032\0020\t¢\006\n\n\002\020\025\032\004\b\023\020\024¨\006\035"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/RadioButtonMetrics;", "", "radioButtonSize", "Landroidx/compose/ui/unit/DpSize;", "outlineSize", "outlineFocusedSize", "outlineSelectedSize", "outlineSelectedFocusedSize", "iconContentGap", "Landroidx/compose/ui/unit/Dp;", "<init>", "(JJJJJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getRadioButtonSize-MYxV2XQ", "()J", "J", "getOutlineSize-MYxV2XQ", "getOutlineFocusedSize-MYxV2XQ", "getOutlineSelectedSize-MYxV2XQ", "getOutlineSelectedFocusedSize-MYxV2XQ", "getIconContentGap-D9Ej5fM", "()F", "F", "outlineSizeFor", "Landroidx/compose/runtime/State;", "state", "Lorg/jetbrains/jewel/ui/component/RadioButtonState;", "outlineSizeFor-ehnS_G0", "(JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class RadioButtonMetrics
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final long radioButtonSize;
/*    */   private final long outlineSize;
/*    */   private final long outlineFocusedSize;
/*    */   private final long outlineSelectedSize;
/*    */   private final long outlineSelectedFocusedSize;
/*    */   private final float iconContentGap;
/*    */   public static final int $stable;
/*    */   
/*    */   public final long getRadioButtonSize-MYxV2XQ() {
/*    */     return this.radioButtonSize;
/*    */   }
/*    */   
/*    */   public final long getOutlineSize-MYxV2XQ() {
/*    */     return this.outlineSize;
/*    */   }
/*    */   
/*    */   public final long getOutlineFocusedSize-MYxV2XQ() {
/*    */     return this.outlineFocusedSize;
/*    */   }
/*    */   
/*    */   public final long getOutlineSelectedSize-MYxV2XQ() {
/*    */     return this.outlineSelectedSize;
/*    */   }
/*    */   
/*    */   public final long getOutlineSelectedFocusedSize-MYxV2XQ() {
/*    */     return this.outlineSelectedFocusedSize;
/*    */   }
/*    */   
/*    */   private RadioButtonMetrics(long radioButtonSize, long outlineSize, long outlineFocusedSize, long outlineSelectedSize, long outlineSelectedFocusedSize, float iconContentGap) {
/* 55 */     this.radioButtonSize = radioButtonSize;
/* 56 */     this.outlineSize = outlineSize;
/* 57 */     this.outlineFocusedSize = outlineFocusedSize;
/* 58 */     this.outlineSelectedSize = outlineSelectedSize;
/* 59 */     this.outlineSelectedFocusedSize = outlineSelectedFocusedSize;
/* 60 */     this.iconContentGap = iconContentGap; } public final float getIconContentGap-D9Ej5fM() { return this.iconContentGap; }
/*    */    @Composable
/*    */   @NotNull
/*    */   public final State<DpSize> outlineSizeFor-ehnS_G0(long state, @Nullable Composer $composer, int $changed) {
/* 64 */     $composer.startReplaceGroup(1801182830); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1801182830, $changed, -1, "org.jetbrains.jewel.ui.component.styling.RadioButtonMetrics.outlineSizeFor (RadioButtonStyling.kt:63)");  State<DpSize> state1 = SnapshotStateKt.rememberUpdatedState(
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 69 */         DpSize.box-impl((RadioButtonState.isFocused-impl(state) && RadioButtonState.isSelected-impl(state)) ? this.outlineSelectedFocusedSize : ((!RadioButtonState.isFocused-impl(state) && RadioButtonState.isSelected-impl(state)) ? this.outlineSelectedSize : ((RadioButtonState.isFocused-impl(state) && !RadioButtonState.isSelected-impl(state)) ? this.outlineFocusedSize : this.outlineSize))), $composer, 0);
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */     return state1;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof RadioButtonMetrics))
/*    */       return false; 
/*    */     RadioButtonMetrics radioButtonMetrics = (RadioButtonMetrics)other;
/*    */     return !DpSize.equals-impl0(this.radioButtonSize, radioButtonMetrics.radioButtonSize) ? false : (!DpSize.equals-impl0(this.outlineSize, radioButtonMetrics.outlineSize) ? false : (!DpSize.equals-impl0(this.outlineFocusedSize, radioButtonMetrics.outlineFocusedSize) ? false : (!DpSize.equals-impl0(this.outlineSelectedSize, radioButtonMetrics.outlineSelectedSize) ? false : (!DpSize.equals-impl0(this.outlineSelectedFocusedSize, radioButtonMetrics.outlineSelectedFocusedSize) ? false : (!!Dp.equals-impl0(this.iconContentGap, radioButtonMetrics.iconContentGap))))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = DpSize.hashCode-impl(this.radioButtonSize);
/*    */     result = result * 31 + DpSize.hashCode-impl(this.outlineSize);
/*    */     result = result * 31 + DpSize.hashCode-impl(this.outlineFocusedSize);
/*    */     result = result * 31 + DpSize.hashCode-impl(this.outlineSelectedSize);
/*    */     result = result * 31 + DpSize.hashCode-impl(this.outlineSelectedFocusedSize);
/*    */     return result * 31 + Dp.hashCode-impl(this.iconContentGap);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "RadioButtonMetrics(radioButtonSize=" + DpSize.toString-impl(this.radioButtonSize) + ", outlineSize=" + DpSize.toString-impl(this.outlineSize) + ", outlineFocusedSize=" + DpSize.toString-impl(this.outlineFocusedSize) + ", outlineSelectedSize=" + DpSize.toString-impl(this.outlineSelectedSize) + ", outlineSelectedFocusedSize=" + DpSize.toString-impl(this.outlineSelectedFocusedSize) + ", iconContentGap=" + Dp.toString-impl(this.iconContentGap) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/RadioButtonMetrics$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\RadioButtonMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */