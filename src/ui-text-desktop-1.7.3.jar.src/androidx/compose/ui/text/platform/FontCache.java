/*     */ package androidx.compose.ui.text.platform;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.text.Cache;
/*     */ import androidx.compose.ui.text.ExpireAfterAccessCache;
/*     */ import androidx.compose.ui.text.font.FontFamily;
/*     */ import androidx.compose.ui.text.font.FontListFontFamily;
/*     */ import androidx.compose.ui.text.font.FontStyle;
/*     */ import androidx.compose.ui.text.font.FontWeight;
/*     */ import androidx.compose.ui.text.font.GenericFontFamily;
/*     */ import androidx.compose.ui.text.font.LoadedFontFamily;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.skia.FontMgr;
/*     */ import org.jetbrains.skia.FontMgrWithFallback;
/*     */ import org.jetbrains.skia.FontStyle;
/*     */ import org.jetbrains.skia.Typeface;
/*     */ import org.jetbrains.skia.paragraph.FontCollection;
/*     */ import org.jetbrains.skia.paragraph.TypefaceFontProviderWithFallback;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\\\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020#\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\000\n\002\030\002\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\000\030\0002\0020\001B\005¢\006\002\020\002J\026\020\017\032\b\022\004\022\0020\0130\0202\006\020\021\032\0020\022H\002J\030\020\017\032\0020\0232\006\020\024\032\0020\0162\006\020\025\032\0020\013H\002J\025\020\026\032\0020\0272\006\020\030\032\0020\031H\000¢\006\002\b\032J.\020\033\032\0020\0272\006\020\021\032\0020\0222\b\b\002\020\034\032\0020\0352\b\b\002\020\036\032\0020\037H\000ø\001\000¢\006\004\b \020!R\016\020\003\032\0020\004X\004¢\006\002\n\000R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\b\022\004\022\0020\0130\nX\004¢\006\002\n\000R\032\020\f\032\016\022\004\022\0020\013\022\004\022\0020\0160\rX\004¢\006\002\n\000\002\007\n\005\b¡\0360\001¨\006\""}, d2 = {"Landroidx/compose/ui/text/platform/FontCache;", "", "()V", "fontProvider", "Lorg/jetbrains/skia/paragraph/TypefaceFontProviderWithFallback;", "fonts", "Lorg/jetbrains/skia/paragraph/FontCollection;", "getFonts$ui_text", "()Lorg/jetbrains/skia/paragraph/FontCollection;", "registered", "", "", "typefacesCache", "Landroidx/compose/ui/text/Cache;", "Lorg/jetbrains/skia/Typeface;", "ensureRegistered", "", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "", "typeface", "key", "load", "Landroidx/compose/ui/text/platform/FontLoadResult;", "font", "Landroidx/compose/ui/text/platform/PlatformFont;", "load$ui_text", "loadPlatformTypes", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "loadPlatformTypes-RetOiIg$ui_text", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/platform/FontLoadResult;", "ui-text"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nPlatformFont.skiko.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformFont.skiko.kt\nandroidx/compose/ui/text/platform/FontCache\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,323:1\n37#2,2:324\n800#3,11:326\n1549#3:337\n1620#3,3:338\n*S KotlinDebug\n*F\n+ 1 PlatformFont.skiko.kt\nandroidx/compose/ui/text/platform/FontCache\n*L\n227#1:324,2\n240#1:326,11\n242#1:337\n242#1:338,3\n*E\n"})
/*     */ public final class FontCache
/*     */ {
/*     */   @NotNull
/*     */   private final FontCollection fonts;
/*     */   @NotNull
/*     */   private final TypefaceFontProviderWithFallback fontProvider;
/*     */   @NotNull
/*     */   private final Set<String> registered;
/*     */   @NotNull
/*     */   private final Cache<String, Typeface> typefacesCache;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public FontCache() {
/* 200 */     this.fonts = new FontCollection();
/* 201 */     this.fontProvider = new TypefaceFontProviderWithFallback();
/* 202 */     this.registered = new HashSet<>();
/* 203 */     this.typefacesCache = (Cache<String, Typeface>)new ExpireAfterAccessCache(
/* 204 */         60000000000L, null, 2, null);
/*     */ 
/*     */ 
/*     */     
/* 208 */     this.fonts.setDefaultFontManager((FontMgr)new FontMgrWithFallback(this.fontProvider));
/* 209 */     this.fonts.setAssetFontManager((FontMgr)this.fontProvider);
/*     */   }
/*     */   @NotNull public final FontCollection getFonts$ui_text() { return this.fonts; }
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\016\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Lorg/jetbrains/skia/Typeface;", "it", "", "invoke"}) static final class FontCache$load$typeface$1 extends Lambda implements Function1<String, Typeface> {
/* 213 */     @NotNull public final Typeface invoke(@NotNull String it) { Intrinsics.checkNotNullParameter(it, "it"); return DesktopFont_desktopKt.loadTypeface(this.$font); } FontCache$load$typeface$1(PlatformFont $font) { super(1); } } @NotNull public final FontLoadResult load$ui_text(@NotNull PlatformFont font) { Intrinsics.checkNotNullParameter(font, "font"); Typeface typeface = (Typeface)this.typefacesCache.get(font.getCacheKey$ui_text(), new FontCache$load$typeface$1(font));
/*     */ 
/*     */     
/* 216 */     ensureRegistered(typeface, font.getCacheKey$ui_text());
/* 217 */     return new FontLoadResult(typeface, CollectionsKt.listOf(font.getCacheKey$ui_text())); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final FontLoadResult loadPlatformTypes-RetOiIg$ui_text(@NotNull FontFamily fontFamily, @NotNull FontWeight fontWeight, int fontStyle) {
/* 225 */     Intrinsics.checkNotNullParameter(fontFamily, "fontFamily"); Intrinsics.checkNotNullParameter(fontWeight, "fontWeight"); List<String> aliases = ensureRegistered(fontFamily);
/* 226 */     FontStyle style = SkiaParagraph_skikoKt.toSkFontStyle-nzbMABs(fontStyle).withWeight(fontWeight.getWeight());
/* 227 */     Collection<String> $this$toTypedArray$iv = aliases; int $i$f$toTypedArray = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 324 */     Collection<String> thisCollection$iv = $this$toTypedArray$iv;
/* 325 */     return new FontLoadResult((Typeface)ArraysKt.first((Object[])this.fonts.findTypefaces(thisCollection$iv.<String>toArray(new String[0]), style)), aliases); } private final List<String> ensureRegistered(FontFamily fontFamily) { FontFamily fontFamily1 = fontFamily; if (fontFamily1 instanceof FontListFontFamily) {
/* 326 */       Iterable $this$filterIsInstance$iv = ((FontListFontFamily)fontFamily).getFonts(); int $i$f$filterIsInstance = 0; Iterable iterable1 = $this$filterIsInstance$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterIsInstanceTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 335 */       for (Object element$iv$iv : iterable1) { if (element$iv$iv instanceof SystemFont) destination$iv$iv.add(element$iv$iv);  }
/* 336 */        List fonts = (List)destination$iv$iv; if (fonts.size() == ((FontListFontFamily)fontFamily).getFonts().size()) {
/* 337 */         Iterable $this$map$iv = fonts; int $i$f$map = 0; Iterable $this$filterIsInstanceTo$iv$iv = $this$map$iv; Collection<String> collection = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 338 */         for (Object item$iv$iv : $this$filterIsInstanceTo$iv$iv) {
/* 339 */           SystemFont systemFont = (SystemFont)item$iv$iv; Collection<String> collection1 = collection; int $i$a$-map-FontCache$ensureRegistered$1 = 0; collection1.add(systemFont.getIdentity());
/*     */         } 
/*     */       } else {
/*     */         throw new IllegalArgumentException("Don't load FontListFontFamily through ensureRegistered: " + fontFamily);
/*     */       } 
/*     */     } else {
/*     */       Intrinsics.checkNotNull(((LoadedFontFamily)fontFamily).getTypeface(), "null cannot be cast to non-null type androidx.compose.ui.text.platform.SkiaBackedTypeface");
/*     */       SkiaBackedTypeface typeface = (SkiaBackedTypeface)((LoadedFontFamily)fontFamily).getTypeface();
/*     */       ensureRegistered(typeface.getNativeTypeface(), typeface.getAlias());
/*     */       if (fontFamily1 instanceof androidx.compose.ui.text.font.DefaultFontFamily) {
/*     */       
/*     */       } else {
/*     */         throw new IllegalArgumentException("Unknown font family type: " + fontFamily);
/*     */       } 
/*     */     } 
/*     */     return (fontFamily1 instanceof LoadedFontFamily) ? CollectionsKt.listOf(typeface.getAlias()) : ((fontFamily1 instanceof GenericFontFamily) ? PlatformFont_skikoKt.getAliases((GenericFontFamily)fontFamily) : (List<String>)"JD-Core does not support Kotlin"); }
/*     */ 
/*     */   
/*     */   private final void ensureRegistered(Typeface typeface, String key) {
/*     */     if (!this.registered.contains(key)) {
/*     */       this.fontProvider.registerTypeface(typeface, key);
/*     */       this.registered.add(key);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\platform\FontCache.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */