/*    */ package org.jetbrains.jewel.ui.icon;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.CompositionLocal;
/*    */ import androidx.compose.runtime.ProvidableCompositionLocal;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\"\027\020\000\032\b\022\004\022\0020\0020\001¢\006\b\n\000\032\004\b\003\020\004\"\025\020\005\032\0020\002*\0020\0068G¢\006\006\032\004\b\007\020\b¨\006\t"}, d2 = {"LocalNewUiChecker", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lorg/jetbrains/jewel/ui/icon/NewUiChecker;", "getLocalNewUiChecker", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "newUiChecker", "Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;", "getNewUiChecker", "(Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/icon/NewUiChecker;", "ui"})
/*    */ @SourceDebugExtension({"SMAP\nNewUiChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewUiChecker.kt\norg/jetbrains/jewel/ui/icon/NewUiCheckerKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,18:1\n77#2:19\n*S KotlinDebug\n*F\n+ 1 NewUiChecker.kt\norg/jetbrains/jewel/ui/icon/NewUiCheckerKt\n*L\n17#1:19\n*E\n"})
/*    */ public final class NewUiCheckerKt {
/*    */   @NotNull
/* 12 */   private static final ProvidableCompositionLocal<NewUiChecker> LocalNewUiChecker = CompositionLocalKt.staticCompositionLocalOf(NewUiCheckerKt::LocalNewUiChecker$lambda$0); @NotNull public static final ProvidableCompositionLocal<NewUiChecker> getLocalNewUiChecker() { return LocalNewUiChecker; }
/* 13 */   private static final NewUiChecker LocalNewUiChecker$lambda$0() { throw new IllegalStateException("No NewUiChecker provided".toString()); } @Composable
/*    */   @JvmName(name = "getNewUiChecker")
/*    */   @NotNull
/*    */   public static final NewUiChecker getNewUiChecker(@NotNull JewelTheme.Companion $this$newUiChecker, @Nullable Composer $composer, int $changed) {
/* 17 */     Intrinsics.checkNotNullParameter($this$newUiChecker, "<this>"); $composer.startReplaceGroup(-1305332605); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1305332605, $changed, -1, "org.jetbrains.jewel.ui.icon.<get-newUiChecker> (NewUiChecker.kt:16)");  CompositionLocal compositionLocal = (CompositionLocal)LocalNewUiChecker; int $changed$iv = 6, $i$f$getCurrent = 0;
/*    */     
/* 19 */     ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); NewUiChecker newUiChecker = (NewUiChecker)object;
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/*    */     return newUiChecker;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\icon\NewUiCheckerKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */