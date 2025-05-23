/*    */ package org.jetbrains.jewel.ui.painter;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.foundation.theme.JewelTheme;
/*    */ import org.jetbrains.jewel.ui.painter.hints.DarkAndStrokeKt;
/*    */ import org.jetbrains.jewel.ui.painter.hints.HiDpiKt;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\002\b\002\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\033\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\bH\027¢\006\002\020\t¨\006\n"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/CommonPainterHintsProvider;", "Lorg/jetbrains/jewel/ui/painter/PainterHintsProvider;", "<init>", "()V", "hints", "", "Lorg/jetbrains/jewel/ui/painter/PainterHint;", "path", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class CommonPainterHintsProvider
/*    */   implements PainterHintsProvider
/*    */ {
/*    */   @NotNull
/*    */   public static final CommonPainterHintsProvider INSTANCE = new CommonPainterHintsProvider();
/*    */   public static final int $stable;
/*    */   
/*    */   @Composable
/*    */   @NotNull
/*    */   public List<PainterHint> priorityHints(@NotNull String path, @Nullable Composer $composer, int $changed) {
/* 33 */     return PainterHintsProvider.DefaultImpls.priorityHints(this, path, $composer, $changed); } @Composable @NotNull
/* 34 */   public List<PainterHint> hints(@NotNull String path, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(path, "path"); $composer.startReplaceGroup(-1285542262); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1285542262, $changed, -1, "org.jetbrains.jewel.ui.painter.CommonPainterHintsProvider.hints (PainterHintsProvider.kt:33)");  PainterHint[] arrayOfPainterHint = new PainterHint[2]; arrayOfPainterHint[0] = HiDpiKt.HiDpi(); arrayOfPainterHint[1] = DarkAndStrokeKt.Dark(JewelTheme.Companion.isDark($composer, 6)); List<PainterHint> list = CollectionsKt.listOf((Object[])arrayOfPainterHint); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return list; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\CommonPainterHintsProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */