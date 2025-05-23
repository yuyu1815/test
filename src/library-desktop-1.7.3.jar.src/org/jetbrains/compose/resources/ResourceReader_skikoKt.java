/*   */ package org.jetbrains.compose.resources;@Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\002\030\002\n\002\b\003\"\036\020\000\032\0020\001*\b\022\004\022\0020\0010\0028AX\004¢\006\006\032\004\b\003\020\004¨\006\005"}, d2 = {"currentOrPreview", "Lorg/jetbrains/compose/resources/ResourceReader;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getCurrentOrPreview", "(Landroidx/compose/runtime/ProvidableCompositionLocal;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/compose/resources/ResourceReader;", "library"})
/*   */ @SourceDebugExtension({"SMAP\nResourceReader.skiko.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceReader.skiko.kt\norg/jetbrains/compose/resources/ResourceReader_skikoKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,7:1\n77#2:8\n*S KotlinDebug\n*F\n+ 1 ResourceReader.skiko.kt\norg/jetbrains/compose/resources/ResourceReader_skikoKt\n*L\n7#1:8\n*E\n"})
/*   */ public final class ResourceReader_skikoKt { @Composable
/*   */   @JvmName(name = "getCurrentOrPreview")
/*   */   @NotNull
/*   */   public static final ResourceReader getCurrentOrPreview(@NotNull ProvidableCompositionLocal $this$currentOrPreview, @Nullable Composer $composer, int $changed) {
/* 7 */     Intrinsics.checkNotNullParameter($this$currentOrPreview, "<this>"); $composer.startReplaceGroup(-193451530); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-193451530, $changed, -1, "org.jetbrains.compose.resources.<get-currentOrPreview> (ResourceReader.skiko.kt:6)");  CompositionLocal compositionLocal = (CompositionLocal)$this$currentOrPreview; int $changed$iv = 0xE & $changed, $i$f$getCurrent = 0;
/* 8 */     ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); ResourceReader resourceReader = (ResourceReader)object;
/*   */     if (ComposerKt.isTraceInProgress())
/*   */       ComposerKt.traceEventEnd(); 
/*   */     $composer.endReplaceGroup();
/*   */     return resourceReader;
/*   */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\ResourceReader_skikoKt.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */