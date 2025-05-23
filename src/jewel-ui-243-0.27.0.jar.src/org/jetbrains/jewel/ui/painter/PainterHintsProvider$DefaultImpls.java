/*    */ package org.jetbrains.jewel.ui.painter;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */ public final class DefaultImpls
/*    */ {
/*    */   @Composable
/*    */   @NotNull
/*    */   public static List<PainterHint> priorityHints(@NotNull PainterHintsProvider $this, @NotNull String path, @Nullable Composer $composer, int $changed) {
/* 23 */     Intrinsics.checkNotNullParameter(path, "path"); $composer.startReplaceGroup(-1421756477); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1421756477, $changed, -1, "org.jetbrains.jewel.ui.painter.PainterHintsProvider.priorityHints (PainterHintsProvider.kt:22)");  List<PainterHint> list = CollectionsKt.emptyList(); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return list;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\PainterHintsProvider$DefaultImpls.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */