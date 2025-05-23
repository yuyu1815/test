/*    */ package org.jetbrains.jewel.ui.component;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import androidx.compose.ui.text.TextStyle;
/*    */ import androidx.compose.ui.text.font.FontWeight;
/*    */ import androidx.compose.ui.unit.TextUnitKt;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.foundation.theme.JewelTheme;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\007\n\002\b\013\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\r\020\004\032\0020\005H\007¢\006\002\020\006J\017\020\007\032\0020\bH\007¢\006\004\b\t\020\nJ\r\020\020\032\0020\005H\007¢\006\002\020\006J\r\020\021\032\0020\005H\007¢\006\002\020\006J\r\020\022\032\0020\005H\007¢\006\002\020\006J\r\020\023\032\0020\005H\007¢\006\002\020\006J\r\020\024\032\0020\005H\007¢\006\002\020\006J\r\020\025\032\0020\005H\007¢\006\002\020\006J\r\020\026\032\0020\005H\007¢\006\002\020\006R\024\020\013\032\0020\fXT¢\006\b\n\000\022\004\b\r\020\003R\024\020\016\032\0020\fXT¢\006\b\n\000\022\004\b\017\020\003¨\006\027"}, d2 = {"Lorg/jetbrains/jewel/ui/component/Typography;", "", "<init>", "()V", "labelTextStyle", "Landroidx/compose/ui/text/TextStyle;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "labelTextSize", "Landroidx/compose/ui/unit/TextUnit;", "labelTextSize-5XXgJZs", "(Landroidx/compose/runtime/Composer;I)J", "DefaultLineHeightMultiplier", "", "getDefaultLineHeightMultiplier$annotations", "EditorLineHeightMultiplier", "getEditorLineHeightMultiplier$annotations", "h0TextStyle", "h1TextStyle", "h2TextStyle", "h3TextStyle", "h4TextStyle", "editorTextStyle", "consoleTextStyle", "ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class Typography
/*    */ {
/*    */   @NotNull
/*    */   public static final Typography INSTANCE = new Typography();
/*    */   public static final float DefaultLineHeightMultiplier = 1.3F;
/*    */   public static final float EditorLineHeightMultiplier = 1.2F;
/*    */   public static final int $stable;
/*    */   
/*    */   @Composable
/*    */   @NotNull
/*    */   public final TextStyle labelTextStyle(@Nullable Composer $composer, int $changed) {
/* 38 */     $composer.startReplaceGroup(-1939177484); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1939177484, $changed, -1, "org.jetbrains.jewel.ui.component.Typography.labelTextStyle (Typography.kt:37)");  TextStyle textStyle = JewelTheme.Companion.getDefaultTextStyle($composer, 6); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return textStyle;
/*    */   } @Composable
/*    */   public final long labelTextSize-5XXgJZs(@Nullable Composer $composer, int $changed) {
/* 41 */     $composer.startReplaceGroup(135686995); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(135686995, $changed, -1, "org.jetbrains.jewel.ui.component.Typography.labelTextSize (Typography.kt:40)");  long l = JewelTheme.Companion.getDefaultTextStyle($composer, 6).getFontSize-XSAIIZE(); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return l;
/*    */   }
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
/*    */   @Composable
/*    */   @NotNull
/*    */   public final TextStyle h0TextStyle(@Nullable Composer $composer, int $changed) {
/* 75 */     $composer.startReplaceGroup(1234812740); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1234812740, $changed, -1, "org.jetbrains.jewel.ui.component.Typography.h0TextStyle (Typography.kt:74)");  TextStyle textStyle = TypographyKt.copyWithSize-Ce1Lr_4$default(JewelTheme.Companion.getDefaultTextStyle($composer, 6), TypographyKt.plus-NB67dxo(labelTextSize-5XXgJZs($composer, 0xE & $changed), TextUnitKt.getSp(12)), 0L, FontWeight.Companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, null, null, null, 0, 0, null, 8388602, null); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return textStyle;
/*    */   }
/*    */   @Composable
/*    */   @NotNull
/*    */   public final TextStyle h1TextStyle(@Nullable Composer $composer, int $changed) {
/* 80 */     $composer.startReplaceGroup(425325283); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(425325283, $changed, -1, "org.jetbrains.jewel.ui.component.Typography.h1TextStyle (Typography.kt:79)");  TextStyle textStyle = TypographyKt.copyWithSize-Ce1Lr_4$default(JewelTheme.Companion.getDefaultTextStyle($composer, 6), TypographyKt.plus-NB67dxo(labelTextSize-5XXgJZs($composer, 0xE & $changed), TextUnitKt.getSp(9)), 0L, FontWeight.Companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, null, null, null, 0, 0, null, 8388602, null); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return textStyle;
/*    */   } @Composable
/*    */   @NotNull
/*    */   public final TextStyle h2TextStyle(@Nullable Composer $composer, int $changed) {
/* 84 */     $composer.startReplaceGroup(-384162174); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-384162174, $changed, -1, "org.jetbrains.jewel.ui.component.Typography.h2TextStyle (Typography.kt:83)");  TextStyle textStyle = TypographyKt.copyWithSize-Ce1Lr_4$default(JewelTheme.Companion.getDefaultTextStyle($composer, 6), TypographyKt.plus-NB67dxo(labelTextSize-5XXgJZs($composer, 0xE & $changed), TextUnitKt.getSp(5)), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, null, null, null, 0, 0, null, 8388606, null); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return textStyle;
/*    */   } @Composable
/*    */   @NotNull
/*    */   public final TextStyle h3TextStyle(@Nullable Composer $composer, int $changed) {
/* 88 */     $composer.startReplaceGroup(-1193649631); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1193649631, $changed, -1, "org.jetbrains.jewel.ui.component.Typography.h3TextStyle (Typography.kt:87)");  TextStyle textStyle = TypographyKt.copyWithSize-Ce1Lr_4$default(JewelTheme.Companion.getDefaultTextStyle($composer, 6), TypographyKt.plus-NB67dxo(labelTextSize-5XXgJZs($composer, 0xE & $changed), TextUnitKt.getSp(3)), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, null, null, null, 0, 0, null, 8388606, null); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return textStyle;
/*    */   }
/*    */   
/*    */   @Composable
/*    */   @NotNull
/* 93 */   public final TextStyle h4TextStyle(@Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(-2003137088); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-2003137088, $changed, -1, "org.jetbrains.jewel.ui.component.Typography.h4TextStyle (Typography.kt:92)");  TextStyle textStyle = TypographyKt.copyWithSize-Ce1Lr_4$default(JewelTheme.Companion.getDefaultTextStyle($composer, 6), TypographyKt.plus-NB67dxo(labelTextSize-5XXgJZs($composer, 0xE & $changed), TextUnitKt.getSp(1)), 0L, FontWeight.Companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, null, null, null, 0, 0, null, 8388602, null); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return textStyle; }
/*    */   @Composable
/*    */   @NotNull
/* 96 */   public final TextStyle editorTextStyle(@Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(286148543); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(286148543, $changed, -1, "org.jetbrains.jewel.ui.component.Typography.editorTextStyle (Typography.kt:95)");  TextStyle textStyle = JewelTheme.Companion.getEditorTextStyle($composer, 6); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return textStyle; } @Composable
/*    */   @NotNull
/*    */   public final TextStyle consoleTextStyle(@Nullable Composer $composer, int $changed) {
/* 99 */     $composer.startReplaceGroup(-894352143); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-894352143, $changed, -1, "org.jetbrains.jewel.ui.component.Typography.consoleTextStyle (Typography.kt:98)");  TextStyle textStyle = JewelTheme.Companion.getConsoleTextStyle($composer, 6); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return textStyle;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\Typography.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */