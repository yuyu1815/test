/*    */ package org.jetbrains.jewel.bridge.theme;
/*    */ import androidx.compose.foundation.layout.PaddingValues;
/*    */ import androidx.compose.foundation.shape.CornerSize;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import com.intellij.ide.ui.laf.darcula.DarculaUIUtil;
/*    */ import com.intellij.util.ui.JBUI;
/*    */ import com.intellij.util.ui.NamedColorUtil;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.jewel.bridge.BridgeUtilsKt;
/*    */ import org.jetbrains.jewel.ui.component.styling.TextFieldColors;
/*    */ import org.jetbrains.jewel.ui.component.styling.TextFieldStyle;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\032\b\020\000\032\0020\001H\000¨\006\002"}, d2 = {"readTextFieldStyle", "Lorg/jetbrains/jewel/ui/component/styling/TextFieldStyle;", "ide-laf-bridge"})
/*    */ @SourceDebugExtension({"SMAP\nIntUiBridgeTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntUiBridgeTextField.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeTextFieldKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,62:1\n149#2:63\n149#2:65\n51#3:64\n*S KotlinDebug\n*F\n+ 1 IntUiBridgeTextField.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeTextFieldKt\n*L\n56#1:63\n57#1:65\n56#1:64\n*E\n"})
/*    */ public final class IntUiBridgeTextFieldKt {
/*    */   @NotNull
/*    */   public static final TextFieldStyle readTextFieldStyle() {
/* 19 */     long normalBackground = BridgeUtilsKt.retrieveColorOrUnspecified("TextField.background");
/* 20 */     long normalContent = BridgeUtilsKt.retrieveColorOrUnspecified("TextField.foreground");
/* 21 */     Intrinsics.checkNotNullExpressionValue(DarculaUIUtil.getOutlineColor(true, false), "getOutlineColor(...)"); long normalBorder = BridgeUtilsKt.toComposeColor(DarculaUIUtil.getOutlineColor(true, false));
/* 22 */     Intrinsics.checkNotNullExpressionValue(DarculaUIUtil.getOutlineColor(true, true), "getOutlineColor(...)"); long focusedBorder = BridgeUtilsKt.toComposeColor(DarculaUIUtil.getOutlineColor(true, true));
/* 23 */     long normalCaret = BridgeUtilsKt.retrieveColorOrUnspecified("TextField.caretForeground");
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
/* 38 */     Intrinsics.checkNotNullExpressionValue(DarculaUIUtil.getOutlineColor(false, false), "getOutlineColor(...)");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 47 */     Intrinsics.checkNotNullExpressionValue(NamedColorUtil.getInactiveTextColor(), "getInactiveTextColor(...)"); TextFieldColors colors = new TextFieldColors(normalBackground, Color.Companion.getUnspecified-0d7_KjU(), normalBackground, normalBackground, normalBackground, normalContent, BridgeUtilsKt.retrieveColorOrUnspecified("TextField.inactiveForeground"), normalContent, normalContent, normalContent, normalBorder, BridgeUtilsKt.toComposeColor(DarculaUIUtil.getOutlineColor(false, false)), focusedBorder, focusedBorder, normalBorder, normalCaret, normalCaret, normalCaret, normalCaret, normalCaret, BridgeUtilsKt.toComposeColor(NamedColorUtil.getInactiveTextColor()), null);
/*    */ 
/*    */     
/* 50 */     Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.TextField.minimumSize(), "minimumSize(...)"); long minimumSize = BridgeUtilsKt.toDpSize(JBUI.CurrentTheme.TextField.minimumSize());
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 55 */     CornerSize cornerSize = IntUiBridgeKt.getComponentArc();
/* 56 */     int $this$dp$iv = 8, $i$f$getDp = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 63 */     float f1 = Dp.constructor-impl($this$dp$iv); Intrinsics.checkNotNullExpressionValue(DarculaUIUtil.LW, "LW"); float other$iv = BridgeUtilsKt.getDp(DarculaUIUtil.LW); int $i$f$plus-5rwHm24 = 0;
/* 64 */     PaddingValues paddingValues = PaddingKt.PaddingValues-YgX7TsA$default(Dp.constructor-impl(f1 + other$iv), 0.0F, 2, null); int i = 144, j = 0;
/* 65 */     long l1 = DpKt.DpSize-YgX7TsA(Dp.constructor-impl(i), DpSize.getHeight-D9Ej5fM(minimumSize));
/*    */     Intrinsics.checkNotNullExpressionValue(DarculaUIUtil.LW, "LW");
/*    */     float f2 = BridgeUtilsKt.getDp(DarculaUIUtil.LW);
/*    */     return new TextFieldStyle(colors, new TextFieldMetrics(f2, paddingValues, cornerSize, l1, null));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\IntUiBridgeTextFieldKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */