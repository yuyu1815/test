/*    */ package org.jetbrains.jewel.bridge;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.ui.text.TextStyle;
/*    */ import androidx.compose.ui.unit.TextUnitKt;
/*    */ import com.intellij.ui.NewUiValue;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.ui.component.Typography;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\013\n\000\032\021\020\000\032\0020\001*\0020\002H\007¢\006\002\020\003\032\021\020\004\032\0020\001*\0020\002H\007¢\006\002\020\003\032\021\020\005\032\0020\001*\0020\002H\007¢\006\002\020\003\032\b\020\006\032\0020\007H\002¨\006\b"}, d2 = {"regular", "Landroidx/compose/ui/text/TextStyle;", "Lorg/jetbrains/jewel/ui/component/Typography;", "(Lorg/jetbrains/jewel/ui/component/Typography;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "medium", "small", "mediumAndSmallFontsAsRegular", "", "ide-laf-bridge"})
/*    */ public final class TypographyKt {
/*    */   @Composable
/*    */   @NotNull
/*    */   public static final TextStyle regular(@NotNull Typography $this$regular, @Nullable Composer $composer, int $changed) {
/* 18 */     Intrinsics.checkNotNullParameter($this$regular, "<this>"); $composer.startReplaceGroup(-1472400424); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1472400424, $changed, -1, "org.jetbrains.jewel.bridge.regular (Typography.kt:17)");  TextStyle textStyle = $this$regular.labelTextStyle($composer, Typography.$stable | 0xE & $changed); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return textStyle;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Composable
/*    */   @NotNull
/*    */   public static final TextStyle medium(@NotNull Typography $this$medium, @Nullable Composer $composer, int $changed) {
/* 30 */     Intrinsics.checkNotNullParameter($this$medium, "<this>"); $composer.startReplaceGroup(1384255133); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1384255133, $changed, -1, "org.jetbrains.jewel.bridge.medium (Typography.kt:29)");  $composer.startReplaceGroup(-1978969515); TextStyle textStyle2 = 
/* 31 */       $this$medium.labelTextStyle($composer, Typography.$stable | 0xE & $changed); $composer.endReplaceGroup();
/* 32 */     $composer.startReplaceGroup(-1978930331); textStyle2 = 
/* 33 */       org.jetbrains.jewel.ui.component.TypographyKt.copyWithSize-Ce1Lr_4$default($this$medium.labelTextStyle($composer, Typography.$stable | 0xE & $changed), org.jetbrains.jewel.ui.component.TypographyKt.minus-NB67dxo($this$medium.labelTextSize-5XXgJZs($composer, Typography.$stable | 0xE & $changed), TextUnitKt.getSp(1)), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, null, null, null, 0, 0, null, 8388606, null);
/*    */     $composer.endReplaceGroup();
/*    */     TextStyle textStyle1 = mediumAndSmallFontsAsRegular() ? textStyle2 : textStyle2;
/*    */     if (ComposerKt.isTraceInProgress()) {
/*    */       ComposerKt.traceEventEnd();
/*    */     }
/*    */     $composer.endReplaceGroup();
/*    */     return textStyle1;
/*    */   }
/*    */ 
/*    */   
/*    */   @Composable
/*    */   @NotNull
/*    */   public static final TextStyle small(@NotNull Typography $this$small, @Nullable Composer $composer, int $changed) {
/* 47 */     Intrinsics.checkNotNullParameter($this$small, "<this>"); $composer.startReplaceGroup(-1647063411); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1647063411, $changed, -1, "org.jetbrains.jewel.bridge.small (Typography.kt:46)");  $composer.startReplaceGroup(-461318605); TextStyle textStyle2 = 
/* 48 */       $this$small.labelTextStyle($composer, Typography.$stable | 0xE & $changed); $composer.endReplaceGroup();
/* 49 */     $composer.startReplaceGroup(-461279421); textStyle2 = 
/* 50 */       org.jetbrains.jewel.ui.component.TypographyKt.copyWithSize-Ce1Lr_4$default($this$small.labelTextStyle($composer, Typography.$stable | 0xE & $changed), org.jetbrains.jewel.ui.component.TypographyKt.minus-NB67dxo($this$small.labelTextSize-5XXgJZs($composer, Typography.$stable | 0xE & $changed), TextUnitKt.getSp(2)), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, null, null, null, 0, 0, null, 8388606, null); $composer.endReplaceGroup(); TextStyle textStyle1 = mediumAndSmallFontsAsRegular() ? textStyle2 : textStyle2;
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/* 54 */     return textStyle1; } private static final boolean mediumAndSmallFontsAsRegular() { return (SystemInfo.isWindows && !NewUiValue.isEnabled()); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\TypographyKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */