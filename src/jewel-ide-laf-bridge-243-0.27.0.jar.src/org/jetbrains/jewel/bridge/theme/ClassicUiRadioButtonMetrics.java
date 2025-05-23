/*    */ package org.jetbrains.jewel.bridge.theme;
/*    */ 
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import androidx.compose.ui.unit.DpKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\n\n\002\030\002\n\002\b\006\bÂ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\026\020\004\032\0020\005X\004¢\006\n\n\002\020\b\032\004\b\006\020\007R\026\020\t\032\0020\005X\004¢\006\n\n\002\020\b\032\004\b\n\020\007R\026\020\013\032\0020\005X\004¢\006\n\n\002\020\b\032\004\b\f\020\007R\026\020\r\032\0020\005X\004¢\006\n\n\002\020\b\032\004\b\016\020\007R\026\020\017\032\0020\020X\004¢\006\n\n\002\020\023\032\004\b\021\020\022R\026\020\024\032\0020\020X\004¢\006\n\n\002\020\023\032\004\b\025\020\022¨\006\026"}, d2 = {"Lorg/jetbrains/jewel/bridge/theme/ClassicUiRadioButtonMetrics;", "Lorg/jetbrains/jewel/bridge/theme/BridgeRadioButtonMetrics;", "<init>", "()V", "outlineSize", "Landroidx/compose/ui/unit/DpSize;", "getOutlineSize-MYxV2XQ", "()J", "J", "outlineFocusedSize", "getOutlineFocusedSize-MYxV2XQ", "outlineSelectedSize", "getOutlineSelectedSize-MYxV2XQ", "outlineSelectedFocusedSize", "getOutlineSelectedFocusedSize-MYxV2XQ", "radioButtonSize", "Landroidx/compose/ui/unit/Dp;", "getRadioButtonSize-D9Ej5fM", "()F", "F", "iconContentGap", "getIconContentGap-D9Ej5fM", "ide-laf-bridge"})
/*    */ @SourceDebugExtension({"SMAP\nIntUiBridgeRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntUiBridgeRadioButton.kt\norg/jetbrains/jewel/bridge/theme/ClassicUiRadioButtonMetrics\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,88:1\n149#2:89\n149#2:90\n149#2:91\n149#2:92\n*S KotlinDebug\n*F\n+ 1 IntUiBridgeRadioButton.kt\norg/jetbrains/jewel/bridge/theme/ClassicUiRadioButtonMetrics\n*L\n70#1:89\n71#1:90\n75#1:91\n76#1:92\n*E\n"})
/*    */ final class ClassicUiRadioButtonMetrics
/*    */   implements BridgeRadioButtonMetrics
/*    */ {
/*    */   private static final long outlineSize;
/*    */   @NotNull
/* 70 */   public static final ClassicUiRadioButtonMetrics INSTANCE = new ClassicUiRadioButtonMetrics(); private static final long outlineFocusedSize; public long getOutlineSize-MYxV2XQ() { return outlineSize; } static { int $this$dp$iv = 17, $i$f$getDp = 0; $this$dp$iv = 17; $i$f$getDp = 0; outlineSize = DpKt.DpSize-YgX7TsA(
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
/* 89 */         Dp.constructor-impl($this$dp$iv), Dp.constructor-impl($this$dp$iv)); $this$dp$iv = 19; $i$f$getDp = 0; $this$dp$iv = 19; $i$f$getDp = 0;
/* 90 */     outlineFocusedSize = DpKt.DpSize-YgX7TsA(Dp.constructor-impl($this$dp$iv), Dp.constructor-impl($this$dp$iv)); } static { $this$dp$iv = 19; $i$f$getDp = 0;
/* 91 */     radioButtonSize = Dp.constructor-impl($this$dp$iv); $this$dp$iv = 4; $i$f$getDp = 0;
/* 92 */     iconContentGap = Dp.constructor-impl($this$dp$iv); }
/*    */ 
/*    */   
/*    */   public long getOutlineFocusedSize-MYxV2XQ() {
/*    */     return outlineFocusedSize;
/*    */   }
/*    */   
/*    */   private static final long outlineSelectedSize = INSTANCE.getOutlineSize-MYxV2XQ();
/*    */   
/*    */   public long getOutlineSelectedSize-MYxV2XQ() {
/*    */     return outlineSelectedSize;
/*    */   }
/*    */   
/*    */   private static final long outlineSelectedFocusedSize = INSTANCE.getOutlineFocusedSize-MYxV2XQ();
/*    */   private static final float radioButtonSize;
/*    */   private static final float iconContentGap;
/*    */   
/*    */   public long getOutlineSelectedFocusedSize-MYxV2XQ() {
/*    */     return outlineSelectedFocusedSize;
/*    */   }
/*    */   
/*    */   public float getRadioButtonSize-D9Ej5fM() {
/*    */     return radioButtonSize;
/*    */   }
/*    */   
/*    */   public float getIconContentGap-D9Ej5fM() {
/*    */     return iconContentGap;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\ClassicUiRadioButtonMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */