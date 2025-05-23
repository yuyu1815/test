/*     */ package org.jetbrains.jewel.bridge.theme;
/*     */ 
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import androidx.compose.ui.unit.DpKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\n\n\002\030\002\n\002\b\016\bÂ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\026\020\004\032\0020\005X\004¢\006\n\n\002\020\b\032\004\b\006\020\007R\026\020\t\032\0020\005X\004¢\006\n\n\002\020\b\032\004\b\n\020\007R\026\020\013\032\0020\005X\004¢\006\n\n\002\020\b\032\004\b\f\020\007R\026\020\r\032\0020\005X\004¢\006\n\n\002\020\b\032\004\b\016\020\007R\026\020\017\032\0020\020X\004¢\006\n\n\002\020\023\032\004\b\021\020\022R\026\020\024\032\0020\020X\004¢\006\n\n\002\020\023\032\004\b\025\020\022R\026\020\026\032\0020\020X\004¢\006\n\n\002\020\023\032\004\b\027\020\022R\026\020\030\032\0020\020X\004¢\006\n\n\002\020\023\032\004\b\031\020\022R\026\020\032\032\0020\005X\004¢\006\n\n\002\020\b\032\004\b\033\020\007R\026\020\034\032\0020\020X\004¢\006\n\n\002\020\023\032\004\b\035\020\022¨\006\036"}, d2 = {"Lorg/jetbrains/jewel/bridge/theme/NewUiCheckboxMetrics;", "Lorg/jetbrains/jewel/bridge/theme/BridgeCheckboxMetrics;", "<init>", "()V", "outlineSize", "Landroidx/compose/ui/unit/DpSize;", "getOutlineSize-MYxV2XQ", "()J", "J", "outlineFocusedSize", "getOutlineFocusedSize-MYxV2XQ", "outlineSelectedSize", "getOutlineSelectedSize-MYxV2XQ", "outlineSelectedFocusedSize", "getOutlineSelectedFocusedSize-MYxV2XQ", "outlineCornerSize", "Landroidx/compose/ui/unit/Dp;", "getOutlineCornerSize-D9Ej5fM", "()F", "F", "outlineFocusedCornerSize", "getOutlineFocusedCornerSize-D9Ej5fM", "outlineSelectedCornerSize", "getOutlineSelectedCornerSize-D9Ej5fM", "outlineSelectedFocusedCornerSize", "getOutlineSelectedFocusedCornerSize-D9Ej5fM", "checkboxSize", "getCheckboxSize-MYxV2XQ", "iconContentGap", "getIconContentGap-D9Ej5fM", "ide-laf-bridge"})
/*     */ @SourceDebugExtension({"SMAP\nIntUiBridgeCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntUiBridgeCheckbox.kt\norg/jetbrains/jewel/bridge/theme/NewUiCheckboxMetrics\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,104:1\n149#2:105\n149#2:106\n149#2:107\n159#2:108\n149#2:109\n149#2:110\n*S KotlinDebug\n*F\n+ 1 IntUiBridgeCheckbox.kt\norg/jetbrains/jewel/bridge/theme/NewUiCheckboxMetrics\n*L\n91#1:105\n93#1:106\n96#1:107\n98#1:108\n101#1:109\n102#1:110\n*E\n"})
/*     */ final class NewUiCheckboxMetrics
/*     */   implements BridgeCheckboxMetrics
/*     */ {
/*     */   @NotNull
/*  91 */   public static final NewUiCheckboxMetrics INSTANCE = new NewUiCheckboxMetrics(); private static final long outlineSize; public long getOutlineSize-MYxV2XQ() { return outlineSize; } private static final long outlineFocusedSize = INSTANCE.getOutlineSize-MYxV2XQ(); private static final long outlineSelectedSize; static { int i = 16, $i$f$getDp = 0; i = 16; $i$f$getDp = 0; outlineSize = DpKt.DpSize-YgX7TsA(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 105 */         Dp.constructor-impl(i), Dp.constructor-impl(i)); }
/* 106 */   public long getOutlineFocusedSize-MYxV2XQ() { return outlineFocusedSize; } public long getOutlineSelectedSize-MYxV2XQ() { return outlineSelectedSize; } static { i = 20; $i$f$getDp = 0; i = 20; $i$f$getDp = 0; outlineSelectedSize = DpKt.DpSize-YgX7TsA(Dp.constructor-impl(i), Dp.constructor-impl(i)); } private static final long outlineSelectedFocusedSize = INSTANCE.getOutlineSelectedSize-MYxV2XQ(); private static final float outlineCornerSize; public long getOutlineSelectedFocusedSize-MYxV2XQ() { return outlineSelectedFocusedSize; } public float getOutlineCornerSize-D9Ej5fM() { return outlineCornerSize; }
/* 107 */   static { i = 3; $i$f$getDp = 0; outlineCornerSize = Dp.constructor-impl(i); } private static final float outlineFocusedCornerSize = INSTANCE.getOutlineCornerSize-D9Ej5fM(); private static final float outlineSelectedCornerSize; public float getOutlineFocusedCornerSize-D9Ej5fM() { return outlineFocusedCornerSize; } public float getOutlineSelectedCornerSize-D9Ej5fM() { return outlineSelectedCornerSize; }
/* 108 */   static { double d = 4.5D; int j = 0; outlineSelectedCornerSize = Dp.constructor-impl((float)d); } private static final float outlineSelectedFocusedCornerSize = INSTANCE.getOutlineSelectedCornerSize-D9Ej5fM(); private static final long checkboxSize; static { int $this$dp$iv = 24; $i$f$getDp = 0; $this$dp$iv = 24; $i$f$getDp = 0;
/* 109 */     checkboxSize = DpKt.DpSize-YgX7TsA(Dp.constructor-impl($this$dp$iv), Dp.constructor-impl($this$dp$iv)); $this$dp$iv = 5; $i$f$getDp = 0;
/* 110 */     iconContentGap = Dp.constructor-impl($this$dp$iv); }
/*     */ 
/*     */   
/*     */   private static final float iconContentGap;
/*     */   
/*     */   public float getOutlineSelectedFocusedCornerSize-D9Ej5fM() {
/*     */     return outlineSelectedFocusedCornerSize;
/*     */   }
/*     */   
/*     */   public long getCheckboxSize-MYxV2XQ() {
/*     */     return checkboxSize;
/*     */   }
/*     */   
/*     */   public float getIconContentGap-D9Ej5fM() {
/*     */     return iconContentGap;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\NewUiCheckboxMetrics.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */