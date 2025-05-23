/*    */ package org.jetbrains.jewel.bridge.theme;
/*    */ import androidx.compose.ui.unit.DpKt;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.jewel.bridge.BridgeUtilsKt;
/*    */ import org.jetbrains.jewel.ui.component.styling.RadioButtonColors;
/*    */ import org.jetbrains.jewel.ui.component.styling.RadioButtonIcons;
/*    */ import org.jetbrains.jewel.ui.component.styling.RadioButtonMetrics;
/*    */ import org.jetbrains.jewel.ui.component.styling.RadioButtonStyle;
/*    */ import org.jetbrains.jewel.ui.icon.PathIconKey;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\032\b\020\000\032\0020\001H\000¨\006\002"}, d2 = {"readRadioButtonStyle", "Lorg/jetbrains/jewel/ui/component/styling/RadioButtonStyle;", "ide-laf-bridge"})
/*    */ @SourceDebugExtension({"SMAP\nIntUiBridgeRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntUiBridgeRadioButton.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeRadioButtonKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n139#2:89\n125#2:90\n139#2:92\n125#2:93\n1#3:91\n*S KotlinDebug\n*F\n+ 1 IntUiBridgeRadioButton.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeRadioButtonKt\n*L\n38#1:89\n38#1:90\n53#1:92\n53#1:93\n*E\n"})
/*    */ public final class IntUiBridgeRadioButtonKt {
/*    */   @NotNull
/*    */   public static final RadioButtonStyle readRadioButtonStyle() {
/* 17 */     long normalContent = BridgeUtilsKt.retrieveColorOrUnspecified("RadioButton.foreground");
/* 18 */     long disabledContent = BridgeUtilsKt.retrieveColorOrUnspecified("RadioButton.disabledText");
/* 19 */     RadioButtonColors colors = 
/* 20 */       new RadioButtonColors(
/* 21 */         normalContent, 
/* 22 */         normalContent, 
/* 23 */         disabledContent, 
/* 24 */         normalContent, 
/* 25 */         normalContent, 
/* 26 */         disabledContent, null);
/*    */ 
/*    */     
/* 29 */     boolean newUiTheme = BridgeUtilsKt.isNewUiTheme();
/* 30 */     BridgeRadioButtonMetrics metrics = newUiTheme ? NewUiRadioButtonMetrics.INSTANCE : ClassicUiRadioButtonMetrics.INSTANCE;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 37 */     float $this$takeOrElse_u2dD5KLDUw$iv = BridgeUtilsKt.retrieveIntAsDpOrUnspecified("RadioButton.iconSize");
/* 38 */     int i = 0;
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
/*    */ 
/*    */     
/* 89 */     float f1 = $this$takeOrElse_u2dD5KLDUw$iv; int $i$f$isSpecified-0680j_4 = 0;
/* 90 */     if (!Float.isNaN(f1)) {  } else { int $i$a$-takeOrElse-D5KLDUw-IntUiBridgeRadioButtonKt$readRadioButtonStyle$radioButtonSize$1 = 0; }
/* 91 */      float it = metrics.getRadioButtonSize-D9Ej5fM(); int $i$a$-let-IntUiBridgeRadioButtonKt$readRadioButtonStyle$radioButtonSize$2 = 0; long radioButtonSize = DpKt.DpSize-YgX7TsA(it, it); $this$takeOrElse_u2dD5KLDUw$iv = BridgeUtilsKt.retrieveIntAsDpOrUnspecified("RadioButton.textIconGap"); int $i$f$takeOrElse-D5KLDUw = 0;
/* 92 */     float $this$isSpecified$iv$iv = $this$takeOrElse_u2dD5KLDUw$iv; $i$f$isSpecified-0680j_4 = 0;
/* 93 */     if (!Float.isNaN($this$isSpecified$iv$iv)) {
/*    */     
/*    */     } else {
/*    */       long l10 = metrics.getOutlineSelectedFocusedSize-MYxV2XQ(), l9 = metrics.getOutlineSelectedSize-MYxV2XQ(), l8 = metrics.getOutlineFocusedSize-MYxV2XQ(), l7 = metrics.getOutlineSize-MYxV2XQ(), l6 = radioButtonSize;
/*    */       RadioButtonColors radioButtonColors = colors;
/*    */       int $i$a$-takeOrElse-D5KLDUw-IntUiBridgeRadioButtonKt$readRadioButtonStyle$1 = 0;
/*    */       float f = metrics.getIconContentGap-D9Ej5fM();
/*    */     } 
/*    */     DefaultConstructorMarker defaultConstructorMarker = null;
/*    */     float f2 = f;
/*    */     long l1 = l10, l2 = l9, l3 = l8, l4 = l7, l5 = l6;
/*    */     RadioButtonIcons radioButtonIcons = new RadioButtonIcons((IconKey)new PathIconKey(IntUiBridgeKt.getIconsBasePath() + "radio.svg", RadioButtonIcons.class));
/*    */     RadioButtonMetrics radioButtonMetrics = new RadioButtonMetrics(l5, l4, l3, l2, l1, f2, defaultConstructorMarker);
/*    */     RadioButtonColors radioButtonColors1 = radioButtonColors;
/*    */     return new RadioButtonStyle(radioButtonColors1, radioButtonMetrics, radioButtonIcons);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\IntUiBridgeRadioButtonKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */