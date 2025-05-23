/*    */ package org.jetbrains.jewel.bridge.theme;
/*    */ import androidx.compose.foundation.shape.CornerSize;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import com.intellij.ide.ui.laf.darcula.DarculaUIUtil;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.bridge.BridgeUtilsKt;
/*    */ import org.jetbrains.jewel.ui.component.styling.TextAreaColors;
/*    */ import org.jetbrains.jewel.ui.component.styling.TextFieldMetrics;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032\020\020\000\032\0020\0012\006\020\002\032\0020\003H\000¨\006\004"}, d2 = {"readTextAreaStyle", "Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;", "metrics", "Lorg/jetbrains/jewel/ui/component/styling/TextFieldMetrics;", "ide-laf-bridge"})
/*    */ @SourceDebugExtension({"SMAP\nIntUiBridgeTextArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntUiBridgeTextArea.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeTextAreaKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,58:1\n149#2:59\n*S KotlinDebug\n*F\n+ 1 IntUiBridgeTextArea.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeTextAreaKt\n*L\n52#1:59\n*E\n"})
/*    */ public final class IntUiBridgeTextAreaKt {
/*    */   @NotNull
/*    */   public static final TextAreaStyle readTextAreaStyle(@NotNull TextFieldMetrics metrics) {
/* 16 */     Intrinsics.checkNotNullParameter(metrics, "metrics"); long normalBackground = BridgeUtilsKt.retrieveColorOrUnspecified("TextArea.background");
/* 17 */     long normalContent = BridgeUtilsKt.retrieveColorOrUnspecified("TextArea.foreground");
/* 18 */     Intrinsics.checkNotNullExpressionValue(DarculaUIUtil.getOutlineColor(true, false), "getOutlineColor(...)"); long normalBorder = BridgeUtilsKt.toComposeColor(DarculaUIUtil.getOutlineColor(true, false));
/* 19 */     Intrinsics.checkNotNullExpressionValue(DarculaUIUtil.getOutlineColor(true, true), "getOutlineColor(...)"); long focusedBorder = BridgeUtilsKt.toComposeColor(DarculaUIUtil.getOutlineColor(true, true));
/* 20 */     long normalCaret = BridgeUtilsKt.retrieveColorOrUnspecified("TextArea.caretForeground");
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
/* 35 */     Intrinsics.checkNotNullExpressionValue(DarculaUIUtil.getOutlineColor(false, false), "getOutlineColor(...)");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 44 */     Intrinsics.checkNotNullExpressionValue(NamedColorUtil.getInactiveTextColor(), "getInactiveTextColor(...)"); TextAreaColors colors = new TextAreaColors(normalBackground, Color.Companion.getUnspecified-0d7_KjU(), normalBackground, normalBackground, normalBackground, normalContent, BridgeUtilsKt.retrieveColorOrUnspecified("TextArea.inactiveForeground"), normalContent, normalContent, normalContent, normalBorder, BridgeUtilsKt.toComposeColor(DarculaUIUtil.getOutlineColor(false, false)), focusedBorder, focusedBorder, normalBorder, normalCaret, normalCaret, normalCaret, normalCaret, normalCaret, BridgeUtilsKt.toComposeColor(NamedColorUtil.getInactiveTextColor()), null);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 51 */     CornerSize cornerSize = metrics.getCornerSize();
/* 52 */     int $this$dp$iv = 5, $i$f$getDp = 0; $this$dp$iv = 4; $i$f$getDp = 0; PaddingValues paddingValues = PaddingKt.PaddingValues-YgX7TsA(
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 59 */         Dp.constructor-impl($this$dp$iv), Dp.constructor-impl($this$dp$iv));
/*    */     long l1 = metrics.getMinSize-MYxV2XQ();
/*    */     float f = metrics.getBorderWidth-D9Ej5fM();
/*    */     return new TextAreaStyle(colors, new TextAreaMetrics(f, paddingValues, cornerSize, l1, null));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\IntUiBridgeTextAreaKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */