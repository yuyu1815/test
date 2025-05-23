/*    */ package org.jetbrains.jewel.bridge.theme;
/*    */ import androidx.compose.ui.graphics.Shape;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.ui.component.styling.SliderColors;
/*    */ import org.jetbrains.jewel.ui.component.styling.SliderStyle;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\013\n\000\032\020\020\000\032\0020\0012\006\020\002\032\0020\003H\000¨\006\004"}, d2 = {"readSliderStyle", "Lorg/jetbrains/jewel/ui/component/styling/SliderStyle;", "dark", "", "ide-laf-bridge"})
/*    */ public final class IntUiBridgeSliderKt {
/*    */   @NotNull
/*    */   public static final SliderStyle readSliderStyle(boolean dark) {
/* 12 */     SliderColors colors = dark ? BridgeSliderStylingKt.dark-7HESe_I$default(SliderColors.Companion, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 32767, null) : BridgeSliderStylingKt.light-7HESe_I$default(SliderColors.Companion, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 32767, null);
/* 13 */     return new SliderStyle(colors, BridgeSliderStylingKt.defaults-IDSuZpE$default(SliderMetrics.Companion, 0.0F, 0L, 0.0F, 0.0F, 0.0F, 0.0F, 63, null), (Shape)RoundedCornerShapeKt.getCircleShape());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\IntUiBridgeSliderKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */