/*    */ package org.jetbrains.jewel.bridge.theme;
/*    */ 
/*    */ import androidx.compose.foundation.shape.CornerSizeKt;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import com.intellij.util.ui.JBUI;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.bridge.BridgeUtilsKt;
/*    */ import org.jetbrains.jewel.ui.component.styling.SimpleListItemColors;
/*    */ import org.jetbrains.jewel.ui.component.styling.SimpleListItemMetrics;
/*    */ import org.jetbrains.jewel.ui.component.styling.SimpleListItemStyle;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\032\b\020\000\032\0020\001H\000¨\006\002"}, d2 = {"readSimpleListItemStyle", "Lorg/jetbrains/jewel/ui/component/styling/SimpleListItemStyle;", "ide-laf-bridge"})
/*    */ @SourceDebugExtension({"SMAP\nIntUiBridgeSimpleListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntUiBridgeSimpleListItem.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeSimpleListItemKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,33:1\n72#2:34\n*S KotlinDebug\n*F\n+ 1 IntUiBridgeSimpleListItem.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeSimpleListItemKt\n*L\n30#1:34\n*E\n"})
/*    */ public final class IntUiBridgeSimpleListItemKt
/*    */ {
/*    */   @NotNull
/*    */   public static final SimpleListItemStyle readSimpleListItemStyle() {
/* 29 */     Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.PopupMenu.Selection.outerInsets(), "outerInsets(...)");
/* 30 */     Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.PopupMenu.Selection.ARC, "ARC"); float f = BridgeUtilsKt.getDp(JBUI.CurrentTheme.PopupMenu.Selection.ARC); int other$iv = 2, $i$f$div-u2uoSUM = 0; return new SimpleListItemStyle(new SimpleListItemColors(BridgeUtilsKt.retrieveColorOrUnspecified("ComboBox.background"), BridgeUtilsKt.retrieveColorOrUnspecified("ComboBox.selectionBackground"), BridgeUtilsKt.retrieveColorOrUnspecified("ComboBox.selectionBackground"), BridgeUtilsKt.retrieveColorOrUnspecified("ComboBox.selectionBackground"), BridgeUtilsKt.retrieveColorOrUnspecified("ComboBox.foreground"), BridgeUtilsKt.retrieveColorOrUnspecified("ComboBox.foreground"), BridgeUtilsKt.retrieveColorOrUnspecified("ComboBox.foreground"), BridgeUtilsKt.retrieveColorOrUnspecified("ComboBox.foreground"), null), new SimpleListItemMetrics(BridgeUtilsKt.retrieveInsetsAsPaddingValues$default("ComboBox.padding", null, 2, null), BridgeUtilsKt.toPaddingValues(JBUI.CurrentTheme.PopupMenu.Selection.outerInsets()), CornerSizeKt.CornerSize-0680j_4(
/*    */ 
/*    */ 
/*    */             
/* 34 */             Dp.constructor-impl(f / other$iv))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\IntUiBridgeSimpleListItemKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */