/*    */ package org.jetbrains.jewel.ui.component;
/*    */ 
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import org.jetbrains.jewel.ui.util.ColorExtensionsKt;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */ final class CircularProgressIndicatorKt$CircularProgressIndicator$1$1
/*    */   implements Function1<Color, List<? extends String>>
/*    */ {
/*    */   public static final CircularProgressIndicatorKt$CircularProgressIndicator$1$1 INSTANCE = new CircularProgressIndicatorKt$CircularProgressIndicator$1$1();
/*    */   
/*    */   public final List<String> invoke-8_81llA(long color) {
/* 42 */     return SpinnerProgressIconGenerator.Small.INSTANCE.generateSvgFrames(ColorExtensionsKt.toRgbaHexString-8_81llA(color));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\CircularProgressIndicatorKt$CircularProgressIndicator$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */