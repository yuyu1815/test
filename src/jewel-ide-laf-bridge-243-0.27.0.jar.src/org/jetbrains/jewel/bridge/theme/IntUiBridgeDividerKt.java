/*   */ package org.jetbrains.jewel.bridge.theme;
/*   */ import org.jetbrains.jewel.ui.component.styling.DividerMetrics;
/*   */ import org.jetbrains.jewel.ui.component.styling.DividerStyle;
/*   */ 
/*   */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\032\b\020\000\032\0020\001H\000¨\006\002"}, d2 = {"readDividerStyle", "Lorg/jetbrains/jewel/ui/component/styling/DividerStyle;", "ide-laf-bridge"})
/*   */ public final class IntUiBridgeDividerKt {
/*   */   @NotNull
/*   */   public static final DividerStyle readDividerStyle() {
/* 9 */     return new DividerStyle(BridgeUtilsKt.toComposeColorOrUnspecified(JBColor.border()), DividerMetrics.Companion.defaults-YgX7TsA$default(DividerMetrics.Companion, 0.0F, 0.0F, 3, null), null);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\IntUiBridgeDividerKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */