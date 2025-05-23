/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.foundation.shape.CornerSize;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\022\n\002\030\002\n\000\n\002\030\002\n\002\b\006\b\007\030\000 (2\0020\001:\001(BW\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\005\022\006\020\b\032\0020\005\022\006\020\t\032\0020\003\022\006\020\n\032\0020\003\022\006\020\013\032\0020\003\022\006\020\f\032\0020\003\022\006\020\r\032\0020\016¢\006\004\b\017\020\020J\035\020 \032\b\022\004\022\0020\0050!2\006\020\"\032\0020#H\007¢\006\004\b$\020%J\035\020&\032\b\022\004\022\0020\0030!2\006\020\"\032\0020#H\007¢\006\004\b'\020%R\023\020\002\032\0020\003¢\006\n\n\002\020\023\032\004\b\021\020\022R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\024\020\025R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\026\020\025R\021\020\007\032\0020\005¢\006\b\n\000\032\004\b\027\020\025R\021\020\b\032\0020\005¢\006\b\n\000\032\004\b\030\020\025R\023\020\t\032\0020\003¢\006\n\n\002\020\023\032\004\b\031\020\022R\023\020\n\032\0020\003¢\006\n\n\002\020\023\032\004\b\032\020\022R\023\020\013\032\0020\003¢\006\n\n\002\020\023\032\004\b\033\020\022R\023\020\f\032\0020\003¢\006\n\n\002\020\023\032\004\b\034\020\022R\023\020\r\032\0020\016¢\006\n\n\002\020\037\032\004\b\035\020\036¨\006)"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;", "", "checkboxSize", "Landroidx/compose/ui/unit/DpSize;", "outlineCornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "outlineFocusedCornerSize", "outlineSelectedCornerSize", "outlineSelectedFocusedCornerSize", "outlineSize", "outlineFocusedSize", "outlineSelectedSize", "outlineSelectedFocusedSize", "iconContentGap", "Landroidx/compose/ui/unit/Dp;", "<init>", "(JLandroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;JJJJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCheckboxSize-MYxV2XQ", "()J", "J", "getOutlineCornerSize", "()Landroidx/compose/foundation/shape/CornerSize;", "getOutlineFocusedCornerSize", "getOutlineSelectedCornerSize", "getOutlineSelectedFocusedCornerSize", "getOutlineSize-MYxV2XQ", "getOutlineFocusedSize-MYxV2XQ", "getOutlineSelectedSize-MYxV2XQ", "getOutlineSelectedFocusedSize-MYxV2XQ", "getIconContentGap-D9Ej5fM", "()F", "F", "outlineCornerSizeFor", "Landroidx/compose/runtime/State;", "state", "Lorg/jetbrains/jewel/ui/component/CheckboxState;", "outlineCornerSizeFor-f7CD9uA", "(JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "outlineSizeFor", "outlineSizeFor-f7CD9uA", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class CheckboxMetrics {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final long checkboxSize;
/*    */   @NotNull
/*    */   private final CornerSize outlineCornerSize;
/*    */   @NotNull
/*    */   private final CornerSize outlineFocusedCornerSize;
/*    */   @NotNull
/*    */   private final CornerSize outlineSelectedCornerSize;
/*    */   @NotNull
/*    */   private final CornerSize outlineSelectedFocusedCornerSize;
/*    */   private final long outlineSize;
/*    */   private final long outlineFocusedSize;
/*    */   private final long outlineSelectedSize;
/*    */   private final long outlineSelectedFocusedSize;
/*    */   private final float iconContentGap;
/*    */   public static final int $stable;
/*    */   
/*    */   public final long getCheckboxSize-MYxV2XQ() {
/*    */     return this.checkboxSize;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CornerSize getOutlineCornerSize() {
/*    */     return this.outlineCornerSize;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CornerSize getOutlineFocusedCornerSize() {
/*    */     return this.outlineFocusedCornerSize;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CornerSize getOutlineSelectedCornerSize() {
/*    */     return this.outlineSelectedCornerSize;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CornerSize getOutlineSelectedFocusedCornerSize() {
/*    */     return this.outlineSelectedFocusedCornerSize;
/*    */   }
/*    */   
/* 51 */   private CheckboxMetrics(long checkboxSize, CornerSize outlineCornerSize, CornerSize outlineFocusedCornerSize, CornerSize outlineSelectedCornerSize, CornerSize outlineSelectedFocusedCornerSize, long outlineSize, long outlineFocusedSize, long outlineSelectedSize, long outlineSelectedFocusedSize, float iconContentGap) { this.checkboxSize = checkboxSize;
/* 52 */     this.outlineCornerSize = outlineCornerSize;
/* 53 */     this.outlineFocusedCornerSize = outlineFocusedCornerSize;
/* 54 */     this.outlineSelectedCornerSize = outlineSelectedCornerSize;
/* 55 */     this.outlineSelectedFocusedCornerSize = outlineSelectedFocusedCornerSize;
/* 56 */     this.outlineSize = outlineSize;
/* 57 */     this.outlineFocusedSize = outlineFocusedSize;
/* 58 */     this.outlineSelectedSize = outlineSelectedSize;
/* 59 */     this.outlineSelectedFocusedSize = outlineSelectedFocusedSize;
/* 60 */     this.iconContentGap = iconContentGap; } public final long getOutlineSize-MYxV2XQ() { return this.outlineSize; } public final long getOutlineFocusedSize-MYxV2XQ() { return this.outlineFocusedSize; } public final float getIconContentGap-D9Ej5fM() { return this.iconContentGap; }
/*    */   public final long getOutlineSelectedSize-MYxV2XQ() { return this.outlineSelectedSize; }
/*    */   public final long getOutlineSelectedFocusedSize-MYxV2XQ() { return this.outlineSelectedFocusedSize; } @Composable
/*    */   @NotNull
/* 64 */   public final State<CornerSize> outlineCornerSizeFor-f7CD9uA(long state, @Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(955064133); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(955064133, $changed, -1, "org.jetbrains.jewel.ui.component.styling.CheckboxMetrics.outlineCornerSizeFor (CheckboxStyling.kt:63)");  State<CornerSize> state1 = SnapshotStateKt.rememberUpdatedState(
/* 65 */         (
/* 66 */         CheckboxState.isFocused-impl(state) && CheckboxState.isSelectedOrIndeterminate-impl(state)) ? this.outlineSelectedFocusedCornerSize : (
/* 67 */         (!CheckboxState.isFocused-impl(state) && CheckboxState.isSelectedOrIndeterminate-impl(state)) ? this.outlineSelectedCornerSize : (
/* 68 */         (CheckboxState.isFocused-impl(state) && !CheckboxState.isSelectedOrIndeterminate-impl(state)) ? this.outlineFocusedCornerSize : 
/* 69 */         this.outlineCornerSize)), $composer, 0);
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */     return state1; } @Composable
/*    */   @NotNull
/* 75 */   public final State<DpSize> outlineSizeFor-f7CD9uA(long state, @Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(-495617648); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-495617648, $changed, -1, "org.jetbrains.jewel.ui.component.styling.CheckboxMetrics.outlineSizeFor (CheckboxStyling.kt:74)");  State<DpSize> state1 = SnapshotStateKt.rememberUpdatedState(
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 80 */         DpSize.box-impl((CheckboxState.isFocused-impl(state) && CheckboxState.isSelectedOrIndeterminate-impl(state)) ? this.outlineSelectedFocusedSize : ((!CheckboxState.isFocused-impl(state) && CheckboxState.isSelectedOrIndeterminate-impl(state)) ? this.outlineSelectedSize : ((CheckboxState.isFocused-impl(state) && !CheckboxState.isSelectedOrIndeterminate-impl(state)) ? this.outlineFocusedSize : this.outlineSize))), $composer, 0);
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */     return state1; }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof CheckboxMetrics))
/*    */       return false; 
/*    */     CheckboxMetrics checkboxMetrics = (CheckboxMetrics)other;
/*    */     return !DpSize.equals-impl0(this.checkboxSize, checkboxMetrics.checkboxSize) ? false : (!Intrinsics.areEqual(this.outlineCornerSize, checkboxMetrics.outlineCornerSize) ? false : (!Intrinsics.areEqual(this.outlineFocusedCornerSize, checkboxMetrics.outlineFocusedCornerSize) ? false : (!Intrinsics.areEqual(this.outlineSelectedCornerSize, checkboxMetrics.outlineSelectedCornerSize) ? false : (!Intrinsics.areEqual(this.outlineSelectedFocusedCornerSize, checkboxMetrics.outlineSelectedFocusedCornerSize) ? false : (!DpSize.equals-impl0(this.outlineSize, checkboxMetrics.outlineSize) ? false : (!DpSize.equals-impl0(this.outlineFocusedSize, checkboxMetrics.outlineFocusedSize) ? false : (!DpSize.equals-impl0(this.outlineSelectedSize, checkboxMetrics.outlineSelectedSize) ? false : (!DpSize.equals-impl0(this.outlineSelectedFocusedSize, checkboxMetrics.outlineSelectedFocusedSize) ? false : (!!Dp.equals-impl0(this.iconContentGap, checkboxMetrics.iconContentGap))))))))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = DpSize.hashCode-impl(this.checkboxSize);
/*    */     result = result * 31 + this.outlineCornerSize.hashCode();
/*    */     result = result * 31 + this.outlineFocusedCornerSize.hashCode();
/*    */     result = result * 31 + this.outlineSelectedCornerSize.hashCode();
/*    */     result = result * 31 + this.outlineSelectedFocusedCornerSize.hashCode();
/*    */     result = result * 31 + DpSize.hashCode-impl(this.outlineSize);
/*    */     result = result * 31 + DpSize.hashCode-impl(this.outlineFocusedSize);
/*    */     result = result * 31 + DpSize.hashCode-impl(this.outlineSelectedSize);
/*    */     result = result * 31 + DpSize.hashCode-impl(this.outlineSelectedFocusedSize);
/*    */     return result * 31 + Dp.hashCode-impl(this.iconContentGap);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "CheckboxMetrics(checkboxSize=" + DpSize.toString-impl(this.checkboxSize) + ", outlineCornerSize=" + this.outlineCornerSize + ", outlineFocusedCornerSize=" + this.outlineFocusedCornerSize + ", outlineSelectedCornerSize=" + this.outlineSelectedCornerSize + ", outlineSelectedFocusedCornerSize=" + this.outlineSelectedFocusedCornerSize + ", outlineSize=" + DpSize.toString-impl(this.outlineSize) + ", outlineFocusedSize=" + DpSize.toString-impl(this.outlineFocusedSize) + ", outlineSelectedSize=" + DpSize.toString-impl(this.outlineSelectedSize) + ", outlineSelectedFocusedSize=" + DpSize.toString-impl(this.outlineSelectedFocusedSize) + ", iconContentGap=" + Dp.toString-impl(this.iconContentGap) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\CheckboxMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */