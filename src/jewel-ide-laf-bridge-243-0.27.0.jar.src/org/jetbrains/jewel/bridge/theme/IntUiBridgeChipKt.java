/*    */ package org.jetbrains.jewel.bridge.theme;
/*    */ 
/*    */ import androidx.compose.foundation.layout.PaddingKt;
/*    */ import androidx.compose.foundation.shape.CornerSizeKt;
/*    */ import androidx.compose.ui.graphics.Brush;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.bridge.BridgeUtilsKt;
/*    */ import org.jetbrains.jewel.ui.component.styling.ChipColors;
/*    */ import org.jetbrains.jewel.ui.component.styling.ChipMetrics;
/*    */ import org.jetbrains.jewel.ui.component.styling.ChipStyle;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\032\b\020\000\032\0020\001H\000¨\006\002"}, d2 = {"readChipStyle", "Lorg/jetbrains/jewel/ui/component/styling/ChipStyle;", "ide-laf-bridge"})
/*    */ @SourceDebugExtension({"SMAP\nIntUiBridgeChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntUiBridgeChip.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeChipKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,72:1\n149#2:73\n149#2:74\n149#2:75\n149#2:76\n*S KotlinDebug\n*F\n+ 1 IntUiBridgeChip.kt\norg/jetbrains/jewel/bridge/theme/IntUiBridgeChipKt\n*L\n65#1:73\n66#1:74\n67#1:75\n68#1:76\n*E\n"})
/*    */ public final class IntUiBridgeChipKt
/*    */ {
/*    */   @NotNull
/*    */   public static final ChipStyle readChipStyle() {
/* 21 */     String[] arrayOfString = new String[2]; arrayOfString[0] = "Button.startBackground"; arrayOfString[1] = "Button.endBackground"; Brush normalBackground = BridgeUtilsKt.createVerticalBrush-8A-3gB4$default(BridgeUtilsKt.retrieveColorsOrUnspecified(arrayOfString), 0.0F, 0.0F, 0, 7, null);
/* 22 */     long normalContent = BridgeUtilsKt.retrieveColorOrUnspecified("Label.foreground");
/* 23 */     long normalBorder = BridgeUtilsKt.retrieveColorOrUnspecified("Button.startBorderColor");
/* 24 */     long disabledBorder = BridgeUtilsKt.retrieveColorOrUnspecified("Button.disabledBorderColor");
/* 25 */     long selectedBorder = BridgeUtilsKt.retrieveColorOrUnspecified("Component.focusColor");
/*    */     
/* 27 */     ChipColors colors = 
/* 28 */       new ChipColors(
/* 29 */         normalBackground, 
/* 30 */         normalBackground, 
/* 31 */         normalBackground, 
/* 32 */         normalBackground, 
/* 33 */         normalBackground, 
/* 34 */         normalBackground, 
/* 35 */         normalBackground, 
/* 36 */         normalBackground, 
/* 37 */         normalBackground, 
/* 38 */         normalBackground, 
/* 39 */         normalContent, 
/* 40 */         normalContent, 
/* 41 */         normalContent, 
/* 42 */         normalContent, 
/* 43 */         normalContent, 
/* 44 */         normalContent, 
/* 45 */         normalContent, 
/* 46 */         normalContent, 
/* 47 */         normalContent, 
/* 48 */         normalContent, 
/* 49 */         normalBorder, 
/* 50 */         disabledBorder, 
/* 51 */         normalBorder, 
/* 52 */         normalBorder, 
/* 53 */         normalBorder, 
/* 54 */         selectedBorder, 
/* 55 */         disabledBorder, 
/* 56 */         selectedBorder, 
/* 57 */         selectedBorder, 
/* 58 */         selectedBorder, null);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 65 */     int $this$dp$iv = 6, $i$f$getDp = 0;
/* 66 */     $this$dp$iv = 12; $i$f$getDp = 0; $this$dp$iv = 8; $i$f$getDp = 0;
/* 67 */     $this$dp$iv = 1; $i$f$getDp = 0;
/* 68 */     $this$dp$iv = 2; $i$f$getDp = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 73 */     return new ChipStyle(colors, new ChipMetrics(CornerSizeKt.CornerSize-0680j_4(Dp.constructor-impl($this$dp$iv)), PaddingKt.PaddingValues-YgX7TsA(
/* 74 */             Dp.constructor-impl($this$dp$iv), Dp.constructor-impl($this$dp$iv)), 
/* 75 */           Dp.constructor-impl($this$dp$iv), 
/* 76 */           Dp.constructor-impl($this$dp$iv), null));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\IntUiBridgeChipKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */