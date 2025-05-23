/*    */ package org.jetbrains.jewel.bridge.theme;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import androidx.compose.ui.unit.DpKt;
/*    */ import androidx.compose.ui.unit.DpSize;
/*    */ import com.intellij.ide.ui.laf.darcula.DarculaUIUtil;
/*    */ import com.intellij.util.ui.JBUI;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.bridge.BridgeUtilsKt;
/*    */ import org.jetbrains.jewel.ui.component.styling.ComboBoxColors;
/*    */ import org.jetbrains.jewel.ui.component.styling.ComboBoxIcons;
/*    */ import org.jetbrains.jewel.ui.component.styling.ComboBoxStyle;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\032\b\020\000\032\0020\001H\000¨\006\002"}, d2 = {"readDefaultComboBoxStyle", "Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;", "ide-laf-bridge"})
/*    */ @SourceDebugExtension({"SMAP\nIntUiBridgeComboBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntUiBridgeComboBox.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeComboBoxKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,63:1\n51#2:64\n149#3:65\n*S KotlinDebug\n*F\n+ 1 IntUiBridgeComboBox.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeComboBoxKt\n*L\n53#1:64\n56#1:65\n*E\n"})
/*    */ public final class IntUiBridgeComboBoxKt {
/*    */   @NotNull
/*    */   public static final ComboBoxStyle readDefaultComboBoxStyle() {
/* 20 */     long normalBackground = BridgeUtilsKt.retrieveColorOrUnspecified("ComboBox.background");
/* 21 */     long nonEditableBackground = BridgeUtilsKt.retrieveColorOrUnspecified("ComboBox.nonEditableBackground");
/* 22 */     long normalContent = BridgeUtilsKt.retrieveColorOrUnspecified("ComboBox.foreground");
/* 23 */     long normalBorder = BridgeUtilsKt.retrieveColorOrUnspecified("Component.borderColor");
/* 24 */     long focusedBorder = BridgeUtilsKt.retrieveColorOrUnspecified("Component.focusedBorderColor");
/*    */     
/* 26 */     ComboBoxColors colors = 
/* 27 */       new ComboBoxColors(
/* 28 */         normalBackground, 
/* 29 */         nonEditableBackground, 
/* 30 */         BridgeUtilsKt.retrieveColorOrUnspecified("ComboBox.disabledBackground"), 
/* 31 */         normalBackground, 
/* 32 */         normalBackground, 
/* 33 */         normalBackground, 
/* 34 */         normalContent, 
/* 35 */         BridgeUtilsKt.retrieveColorOrUnspecified("ComboBox.disabledForeground"), 
/* 36 */         normalContent, 
/* 37 */         normalContent, 
/* 38 */         normalContent, 
/* 39 */         normalBorder, 
/* 40 */         BridgeUtilsKt.retrieveColorOrUnspecified("Component.disabledBorderColor"), 
/* 41 */         focusedBorder, 
/* 42 */         focusedBorder, 
/* 43 */         normalBorder, null);
/*    */ 
/*    */     
/* 46 */     Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.ComboBox.minimumSize(), "minimumSize(...)"); long minimumSize = BridgeUtilsKt.toDpSize(JBUI.CurrentTheme.ComboBox.minimumSize());
/* 47 */     Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Component.ARROW_AREA_WIDTH, "ARROW_AREA_WIDTH"); float arrowWidth = BridgeUtilsKt.getDp(JBUI.CurrentTheme.Component.ARROW_AREA_WIDTH);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 53 */     float arg0$iv = DpSize.getWidth-D9Ej5fM(minimumSize); int $i$f$plus-5rwHm24 = 0;
/*    */ 
/*    */     
/* 56 */     int $this$dp$iv = 6, $i$f$getDp = 0;
/* 57 */     Intrinsics.checkNotNullExpressionValue(DarculaUIUtil.LW, "LW");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 64 */     return new ComboBoxStyle(colors, new ComboBoxMetrics(DpKt.DpSize-YgX7TsA(arrowWidth, DpSize.getHeight-D9Ej5fM(minimumSize)), DpKt.DpSize-YgX7TsA(Dp.constructor-impl(arg0$iv + arrowWidth), DpSize.getHeight-D9Ej5fM(minimumSize)), IntUiBridgeKt.getComponentArc(), BridgeUtilsKt.retrieveInsetsAsPaddingValues$default("ComboBox.padding", null, 2, null), PaddingKt.PaddingValues-0680j_4(
/* 65 */             Dp.constructor-impl($this$dp$iv)), BridgeUtilsKt.getDp(DarculaUIUtil.LW), Dp.Companion.getUnspecified-D9Ej5fM(), null), new ComboBoxIcons((IconKey)AllIconsKeys.General.INSTANCE.getChevronDown()));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\IntUiBridgeComboBoxKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */