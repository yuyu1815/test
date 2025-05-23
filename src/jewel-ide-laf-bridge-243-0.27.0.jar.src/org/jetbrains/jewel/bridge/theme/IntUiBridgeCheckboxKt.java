/*     */ package org.jetbrains.jewel.bridge.theme;
/*     */ import androidx.compose.foundation.shape.CornerSize;
/*     */ import androidx.compose.foundation.shape.CornerSizeKt;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.jewel.bridge.BridgeUtilsKt;
/*     */ import org.jetbrains.jewel.ui.component.styling.CheckboxColors;
/*     */ import org.jetbrains.jewel.ui.component.styling.CheckboxIcons;
/*     */ import org.jetbrains.jewel.ui.component.styling.CheckboxMetrics;
/*     */ import org.jetbrains.jewel.ui.component.styling.CheckboxStyle;
/*     */ import org.jetbrains.jewel.ui.icon.PathIconKey;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\032\b\020\000\032\0020\001H\000¨\006\002"}, d2 = {"readCheckboxStyle", "Lorg/jetbrains/jewel/ui/component/styling/CheckboxStyle;", "ide-laf-bridge"})
/*     */ @SourceDebugExtension({"SMAP\nIntUiBridgeCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntUiBridgeCheckbox.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeCheckboxKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,104:1\n125#2:105\n*S KotlinDebug\n*F\n+ 1 IntUiBridgeCheckbox.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeCheckboxKt\n*L\n36#1:105\n*E\n"})
/*     */ public final class IntUiBridgeCheckboxKt {
/*     */   @NotNull
/*     */   public static final CheckboxStyle readCheckboxStyle() {
/*  18 */     long textColor = BridgeUtilsKt.retrieveColorOrUnspecified("CheckBox.foreground");
/*  19 */     CheckboxColors colors = 
/*  20 */       new CheckboxColors(
/*  21 */         textColor, 
/*  22 */         BridgeUtilsKt.retrieveColorOrUnspecified("CheckBox.disabledText"), 
/*  23 */         textColor, null);
/*     */ 
/*     */     
/*  26 */     boolean newUiTheme = BridgeUtilsKt.isNewUiTheme();
/*  27 */     BridgeCheckboxMetrics metrics = newUiTheme ? NewUiCheckboxMetrics.INSTANCE : ClassicUiCheckboxMetrics.INSTANCE;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  34 */     float it = BridgeUtilsKt.retrieveIntAsDpOrUnspecified("CheckBox.iconSize"); int $i$a$-let-IntUiBridgeCheckboxKt$readCheckboxStyle$checkboxSize$1 = 0;
/*     */     
/*  36 */     float $this$isSpecified$iv = it; int $i$f$isSpecified-0680j_4 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 105 */     long checkboxSize = (!Float.isNaN($this$isSpecified$iv)) ? DpKt.DpSize-YgX7TsA(it, it) : metrics.getCheckboxSize-MYxV2XQ();
/*     */     CornerSize cornerSize1 = CornerSizeKt.CornerSize-0680j_4(metrics.getOutlineCornerSize-D9Ej5fM());
/*     */     CornerSize cornerSize2 = CornerSizeKt.CornerSize-0680j_4(metrics.getOutlineFocusedCornerSize-D9Ej5fM());
/*     */     CornerSize cornerSize3 = CornerSizeKt.CornerSize-0680j_4(metrics.getOutlineSelectedCornerSize-D9Ej5fM());
/*     */     CornerSize cornerSize4 = CornerSizeKt.CornerSize-0680j_4(metrics.getOutlineSelectedFocusedCornerSize-D9Ej5fM());
/*     */     long l1 = metrics.getOutlineSize-MYxV2XQ();
/*     */     long l2 = metrics.getOutlineSelectedSize-MYxV2XQ();
/*     */     long l3 = metrics.getOutlineFocusedSize-MYxV2XQ();
/*     */     long l4 = metrics.getOutlineSelectedFocusedSize-MYxV2XQ();
/*     */     float f1 = metrics.getIconContentGap-D9Ej5fM();
/*     */     return new CheckboxStyle(colors, new CheckboxMetrics(checkboxSize, cornerSize1, cornerSize2, cornerSize3, cornerSize4, l1, l3, l2, l4, f1, null), new CheckboxIcons((IconKey)new PathIconKey(IntUiBridgeKt.getIconsBasePath() + "checkBox.svg", CheckboxIcons.class)));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\IntUiBridgeCheckboxKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */