/*    */ package org.jetbrains.jewel.ui.painter;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import java.util.List;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\002\b\003\bg\030\0002\0020\001J\033\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\027¢\006\002\020\007J\033\020\b\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H'¢\006\002\020\007¨\006\t"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/PainterHintsProvider;", "", "priorityHints", "", "Lorg/jetbrains/jewel/ui/painter/PainterHint;", "path", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "hints", "ui"})
/*    */ @Immutable
/*    */ public interface PainterHintsProvider {
/*    */   @Composable
/*    */   @NotNull
/*    */   List<PainterHint> priorityHints(@NotNull String paramString, @Nullable Composer paramComposer, int paramInt);
/*    */   
/*    */   @Composable
/*    */   @NotNull
/*    */   List<PainterHint> hints(@NotNull String paramString, @Nullable Composer paramComposer, int paramInt);
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls {
/*    */     @Composable
/*    */     @NotNull
/*    */     public static List<PainterHint> priorityHints(@NotNull PainterHintsProvider $this, @NotNull String path, @Nullable Composer $composer, int $changed) {
/* 23 */       Intrinsics.checkNotNullParameter(path, "path"); $composer.startReplaceGroup(-1421756477); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1421756477, $changed, -1, "org.jetbrains.jewel.ui.painter.PainterHintsProvider.priorityHints (PainterHintsProvider.kt:22)");  List<PainterHint> list = CollectionsKt.emptyList(); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return list;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\PainterHintsProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */