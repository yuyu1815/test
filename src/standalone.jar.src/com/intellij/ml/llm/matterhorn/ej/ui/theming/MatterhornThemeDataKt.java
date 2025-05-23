/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.theming;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocal;
/*     */ import androidx.compose.runtime.CompositionLocalKt;
/*     */ import androidx.compose.runtime.ProvidableCompositionLocal;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmName;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\002\030\002\n\002\b\006\"\027\020\000\032\b\022\004\022\0020\0020\001¢\006\b\n\000\032\004\b\003\020\004\"\021\020\005\032\0020\0028G¢\006\006\032\004\b\006\020\007¨\006\b"}, d2 = {"MatterhornThemeProvider", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;", "getMatterhornThemeProvider", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "MatterhornTheme", "getMatterhornTheme", "(Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;", "standalone"})
/*     */ @SourceDebugExtension({"SMAP\nMatterhornThemeData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornThemeData.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeDataKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,185:1\n77#2:186\n*S KotlinDebug\n*F\n+ 1 MatterhornThemeData.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeDataKt\n*L\n184#1:186\n*E\n"})
/*     */ public final class MatterhornThemeDataKt
/*     */ {
/*     */   @NotNull
/*     */   public static final ProvidableCompositionLocal<MatterhornThemeData> getMatterhornThemeProvider() {
/* 178 */     return MatterhornThemeProvider; } @NotNull
/* 179 */   private static final ProvidableCompositionLocal<MatterhornThemeData> MatterhornThemeProvider = CompositionLocalKt.staticCompositionLocalOf(MatterhornThemeDataKt::MatterhornThemeProvider$lambda$0);
/* 180 */   private static final MatterhornThemeData MatterhornThemeProvider$lambda$0() { throw new IllegalStateException("CompositionLocal MatterhornThemeProvider not provided".toString()); } @Composable
/*     */   @JvmName(name = "getMatterhornTheme")
/*     */   @NotNull
/*     */   public static final MatterhornThemeData getMatterhornTheme(@Nullable Composer $composer, int $changed) {
/* 184 */     $composer.startReplaceGroup(-956687240); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-956687240, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.theming.<get-MatterhornTheme> (MatterhornThemeData.kt:183)");  CompositionLocal compositionLocal = (CompositionLocal)MatterhornThemeProvider; int $changed$iv = 6, $i$f$getCurrent = 0;
/*     */     
/* 186 */     ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); MatterhornThemeData matterhornThemeData = (MatterhornThemeData)object;
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return matterhornThemeData;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\theming\MatterhornThemeDataKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */