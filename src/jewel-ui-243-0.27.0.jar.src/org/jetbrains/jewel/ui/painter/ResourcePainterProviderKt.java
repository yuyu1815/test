/*     */ package org.jetbrains.jewel.ui.painter;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocal;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.painter.ColorPainter;
/*     */ import java.io.IOException;
/*     */ import java.io.StringWriter;
/*     */ import javax.xml.transform.Transformer;
/*     */ import javax.xml.transform.TransformerException;
/*     */ import javax.xml.transform.TransformerFactory;
/*     */ import javax.xml.transform.dom.DOMSource;
/*     */ import javax.xml.transform.stream.StreamResult;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.icon.IconKey;
/*     */ import org.jetbrains.jewel.ui.icon.NewUiChecker;
/*     */ import org.jetbrains.jewel.ui.icon.NewUiCheckerKt;
/*     */ import org.w3c.dom.Document;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000&\n\000\n\002\030\002\n\000\n\002\020\016\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\032\f\020\002\032\0020\003*\0020\004H\000\032#\020\005\032\0020\0062\006\020\007\032\0020\b2\f\b\002\020\t\032\006\022\002\b\0030\nH\007¢\006\002\020\013\032!\020\005\032\0020\0062\006\020\f\032\0020\0032\n\020\t\032\006\022\002\b\0030\nH\007¢\006\002\020\r\"\016\020\000\032\0020\001X\004¢\006\002\n\000¨\006\016"}, d2 = {"errorPainter", "Landroidx/compose/ui/graphics/painter/ColorPainter;", "writeToString", "", "Lorg/w3c/dom/Document;", "rememberResourcePainterProvider", "Lorg/jetbrains/jewel/ui/painter/PainterProvider;", "iconKey", "Lorg/jetbrains/jewel/ui/icon/IconKey;", "iconClass", "Ljava/lang/Class;", "(Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/Class;Landroidx/compose/runtime/Composer;II)Lorg/jetbrains/jewel/ui/painter/PainterProvider;", "path", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/painter/PainterProvider;", "ui"})
/*     */ @SourceDebugExtension({"SMAP\nResourcePainterProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourcePainterProvider.kt\norg/jetbrains/jewel/ui/painter/ResourcePainterProviderKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,274:1\n77#2:275\n1225#3,6:276\n1225#3,6:282\n*S KotlinDebug\n*F\n+ 1 ResourcePainterProvider.kt\norg/jetbrains/jewel/ui/painter/ResourcePainterProviderKt\n*L\n265#1:275\n266#1:276,6\n273#1:282,6\n*E\n"})
/*     */ public final class ResourcePainterProviderKt
/*     */ {
/*     */   @NotNull
/*  36 */   private static final ColorPainter errorPainter = new ColorPainter(Color.Companion.getMagenta-0d7_KjU(), null);
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
/*     */   @NotNull
/*     */   public static final String writeToString(@NotNull Document $this$writeToString) {
/* 243 */     Intrinsics.checkNotNullParameter($this$writeToString, "<this>"); TransformerFactory tf = TransformerFactory.newInstance();
/* 244 */     Transformer transformer = null;
/*     */ 
/*     */     
/* 247 */     try { transformer = tf.newTransformer();
/* 248 */       transformer.setOutputProperty("omit-xml-declaration", "yes");
/*     */       
/* 250 */       StringWriter writer = new StringWriter();
/* 251 */       transformer.transform(new DOMSource($this$writeToString), new StreamResult(writer));
/* 252 */       Intrinsics.checkNotNullExpressionValue(writer.getBuffer().toString(), "toString(...)"); return writer.getBuffer().toString(); }
/* 253 */     catch (TransformerException e) { throw new IllegalStateException(("Unable to render XML document to string: " + 
/* 254 */           e.getMessage()).toString()); }
/* 255 */     catch (IOException e) { throw new IllegalStateException(("Unable to render XML document to string: " + 
/* 256 */           e.getMessage()).toString()); }
/*     */   
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final PainterProvider rememberResourcePainterProvider(@NotNull IconKey iconKey, @Nullable Class<?> iconClass, @Nullable Composer $composer, int $changed, int paramInt1) {
/* 263 */     Intrinsics.checkNotNullParameter(iconKey, "iconKey"); $composer.startReplaceGroup(757533705); if ((paramInt1 & 0x2) != 0) iconClass = iconKey.getClass();  if (ComposerKt.isTraceInProgress())
/* 264 */       ComposerKt.traceEventStart(757533705, $changed, -1, "org.jetbrains.jewel.ui.painter.rememberResourcePainterProvider (ResourcePainterProvider.kt:263)"); 
/* 265 */     CompositionLocal compositionLocal = (CompositionLocal)NewUiCheckerKt.getLocalNewUiChecker(); int $changed$iv = 6, $i$f$getCurrent = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 275 */     ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object1 = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); boolean isNewUi = ((NewUiChecker)object1).isNewUi(); ClassLoader classLoader = iconClass.getClassLoader(); $composer.startReplaceGroup(223735672); object1 = $composer; int i = (((($changed & 0xE ^ 0x6) > 4 && $composer.changed(iconKey)) || ($changed & 0x6) == 4) ? 1 : 0) | $composer.changed(classLoader) | $composer.changed(isNewUi), $i$f$cache = 0;
/* 276 */     Object it$iv = object1.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 277 */     if (i != 0 || it$iv == Composer.Companion.getEmpty()) {
/* 278 */       int $i$a$-cache-ResourcePainterProviderKt$rememberResourcePainterProvider$1 = 0; ClassLoader[] arrayOfClassLoader = new ClassLoader[1]; arrayOfClassLoader[0] = iconClass.getClassLoader(); Object value$iv = new ResourcePainterProvider(iconKey.path(isNewUi), arrayOfClassLoader);
/* 279 */       object1.updateRememberedValue(value$iv);
/*     */     } 
/* 281 */     ResourcePainterProvider resourcePainterProvider2 = (ResourcePainterProvider)it$iv; $composer.endReplaceGroup(); ResourcePainterProvider resourcePainterProvider1 = resourcePainterProvider2; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return resourcePainterProvider1; } @Composable @NotNull public static final PainterProvider rememberResourcePainterProvider(@NotNull String path, @NotNull Class iconClass, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(path, "path"); Intrinsics.checkNotNullParameter(iconClass, "iconClass"); $composer.startReplaceGroup(-1319169100); if (ComposerKt.isTraceInProgress())
/* 282 */       ComposerKt.traceEventStart(-1319169100, $changed, -1, "org.jetbrains.jewel.ui.painter.rememberResourcePainterProvider (ResourcePainterProvider.kt:272)");  ClassLoader classLoader = iconClass.getClassLoader(); $composer.startReplaceGroup(223743695); Composer composer = $composer; int i = (((($changed & 0xE ^ 0x6) > 4 && $composer.changed(path)) || ($changed & 0x6) == 4) ? 1 : 0) | $composer.changed(classLoader), $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 283 */     if (i != 0 || it$iv == Composer.Companion.getEmpty()) {
/* 284 */       int $i$a$-cache-ResourcePainterProviderKt$rememberResourcePainterProvider$2 = 0; ClassLoader[] arrayOfClassLoader = new ClassLoader[1]; arrayOfClassLoader[0] = iconClass.getClassLoader(); Object value$iv = new ResourcePainterProvider(path, arrayOfClassLoader);
/* 285 */       composer.updateRememberedValue(value$iv);
/*     */     } 
/* 287 */     ResourcePainterProvider resourcePainterProvider2 = (ResourcePainterProvider)it$iv;
/*     */     $composer.endReplaceGroup();
/*     */     ResourcePainterProvider resourcePainterProvider1 = resourcePainterProvider2;
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return resourcePainterProvider1; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\ResourcePainterProviderKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */