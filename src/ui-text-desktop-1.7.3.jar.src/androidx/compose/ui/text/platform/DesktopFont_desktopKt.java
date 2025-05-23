/*     */ package androidx.compose.ui.text.platform;
/*     */ 
/*     */ import androidx.compose.ui.text.font.Font;
/*     */ import androidx.compose.ui.text.font.FontStyle;
/*     */ import androidx.compose.ui.text.font.FontWeight;
/*     */ import java.io.File;
/*     */ import java.io.InputStream;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.io.CloseableKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.FunctionReferenceImpl;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.skia.Data;
/*     */ import org.jetbrains.skia.FontMgr;
/*     */ import org.jetbrains.skia.FontSlant;
/*     */ import org.jetbrains.skia.FontStyle;
/*     */ import org.jetbrains.skia.Typeface;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\0008\n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\032,\020\005\032\0020\0022\006\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\013ø\001\000¢\006\004\b\f\020\r\032,\020\005\032\0020\0022\006\020\016\032\0020\0172\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\013ø\001\000¢\006\004\b\f\020\020\032\b\020\021\032\0020\022H\000\032\020\020\023\032\0020\0242\006\020\025\032\0020\002H\000\032\020\020\026\032\0020\0242\006\020\027\032\0020\017H\002\"\030\020\000\032\0020\001*\0020\0028BX\004¢\006\006\032\004\b\003\020\004\002\007\n\005\b¡\0360\001¨\006\030"}, d2 = {"skFontStyle", "Lorg/jetbrains/skia/FontStyle;", "Landroidx/compose/ui/text/font/Font;", "getSkFontStyle", "(Landroidx/compose/ui/text/font/Font;)Lorg/jetbrains/skia/FontStyle;", "Font", "file", "Ljava/io/File;", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "Font-RetOiIg", "(Ljava/io/File;Landroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "resource", "", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "currentPlatform", "Landroidx/compose/ui/text/platform/Platform;", "loadTypeface", "Lorg/jetbrains/skia/Typeface;", "font", "typefaceResource", "resourceName", "ui-text"})
/*     */ @SourceDebugExtension({"SMAP\nDesktopFont.desktop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DesktopFont.desktop.kt\nandroidx/compose/ui/text/platform/DesktopFont_desktopKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,203:1\n1#2:204\n*E\n"})
/*     */ public final class DesktopFont_desktopKt
/*     */ {
/*     */   @NotNull
/*     */   public static final Font Font-RetOiIg(@NotNull String resource, @NotNull FontWeight weight, int style) {
/*  97 */     Intrinsics.checkNotNullParameter(resource, "resource"); Intrinsics.checkNotNullParameter(weight, "weight"); return new ResourceFont(resource, weight, style, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   public static final Font Font-RetOiIg(@NotNull File file, @NotNull FontWeight weight, int style) {
/* 161 */     Intrinsics.checkNotNullParameter(file, "file"); Intrinsics.checkNotNullParameter(weight, "weight"); return new FileFont(file, weight, style, null);
/*     */   }
/*     */   @NotNull
/* 164 */   public static final Typeface loadTypeface(@NotNull Font font) { Intrinsics.checkNotNullParameter(font, "font"); if (!(font instanceof PlatformFont)) {
/* 165 */       throw new IllegalArgumentException("Unsupported font type: " + font);
/*     */     }
/* 167 */     PlatformFont platformFont = (PlatformFont)font;
/*     */ 
/*     */     
/* 170 */     Intrinsics.checkNotNullExpressionValue(((FileFont)font).getFile().toString(), "toString(...)");
/*     */     
/* 172 */     if (platformFont instanceof SystemFont) {  } else { throw new NoWhenBranchMatchedException(); }
/* 173 */      if (((platformFont instanceof ResourceFont) ? typefaceResource(((ResourceFont)font).getName()) : ((platformFont instanceof FileFont) ? FontMgr.makeFromFile$default(FontMgr.Companion.getDefault(), ((FileFont)font).getFile().toString(), 0, 2, null) : ((platformFont instanceof LoadedFont) ? FontMgr.makeFromData$default(FontMgr.Companion.getDefault(), Data.Companion.makeFromBytes$default(Data.Companion, (byte[])((LoadedFont)font).getGetData$ui_text().invoke(), 0, 0, 6, null), 0, 2, null) : (Typeface)"JD-Core does not support Kotlin"))) == null) { (platformFont instanceof ResourceFont) ? typefaceResource(((ResourceFont)font).getName()) : ((platformFont instanceof FileFont) ? FontMgr.makeFromFile$default(FontMgr.Companion.getDefault(), ((FileFont)font).getFile().toString(), 0, 2, null) : ((platformFont instanceof LoadedFont) ? FontMgr.makeFromData$default(FontMgr.Companion.getDefault(), Data.Companion.makeFromBytes$default(Data.Companion, (byte[])((LoadedFont)font).getGetData$ui_text().invoke(), 0, 0, 6, null), 0, 2, null) : (Typeface)"JD-Core does not support Kotlin")); if (FontMgr.Companion.getDefault().legacyMakeTypeface(((PlatformFont)font).getIdentity(), getSkFontStyle(font)) == null) { FontMgr.Companion.getDefault().legacyMakeTypeface(((PlatformFont)font).getIdentity(), getSkFontStyle(font)); throw new IllegalStateException(
/* 174 */             "loadTypeface legacyMakeTypeface failed".toString()); }
/*     */        }
/*     */     
/*     */     return (platformFont instanceof ResourceFont) ? typefaceResource(((ResourceFont)font).getName()) : ((platformFont instanceof FileFont) ? FontMgr.makeFromFile$default(FontMgr.Companion.getDefault(), ((FileFont)font).getFile().toString(), 0, 2, null) : ((platformFont instanceof LoadedFont) ? FontMgr.makeFromData$default(FontMgr.Companion.getDefault(), Data.Companion.makeFromBytes$default(Data.Companion, (byte[])((LoadedFont)font).getGetData$ui_text().invoke(), 0, 0, 6, null), 0, 2, null) : (Typeface)"JD-Core does not support Kotlin")); } private static final Typeface typefaceResource(String resourceName) {
/* 178 */     Intrinsics.checkNotNull(Thread.currentThread().getContextClassLoader()); ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
/* 179 */     if (contextClassLoader.getResourceAsStream(resourceName) == null) contextClassLoader.getResourceAsStream(resourceName);  InputStream inputStream1 = 
/* 180 */       DesktopFont_desktopKt$typefaceResource$resource$1.INSTANCE.getClass().getResourceAsStream(resourceName); if (inputStream1 == null)
/* 181 */       throw new IllegalStateException(("Can't load font from " + resourceName).toString()); 
/*     */     InputStream resource = inputStream1;
/* 183 */     InputStream inputStream2 = resource; Throwable throwable = null; try { InputStream it = inputStream2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 204 */       int $i$a$-use-DesktopFont_desktopKt$typefaceResource$bytes$1 = 0;
/*     */       byte[] arrayOfByte = it.readAllBytes(); }
/*     */     catch (Throwable throwable1)
/*     */     { throwable = throwable1 = null;
/*     */       throw throwable1; }
/*     */     finally
/*     */     { CloseableKt.closeFinally(inputStream2, throwable); }
/*     */     
/*     */     byte[] bytes = arrayOfByte;
/*     */     Intrinsics.checkNotNull(bytes);
/*     */     Intrinsics.checkNotNull(FontMgr.makeFromData$default(FontMgr.Companion.getDefault(), Data.Companion.makeFromBytes$default(Data.Companion, bytes, 0, 0, 6, null), 0, 2, null));
/*     */     return FontMgr.makeFromData$default(FontMgr.Companion.getDefault(), Data.Companion.makeFromBytes$default(Data.Companion, bytes, 0, 0, 6, null), 0, 2, null);
/*     */   }
/*     */   
/*     */   private static final FontStyle getSkFontStyle(Font $this$skFontStyle) {
/*     */     return new FontStyle($this$skFontStyle.getWeight().getWeight(), 5, FontStyle.equals-impl0($this$skFontStyle.getStyle-_-LCdwA(), FontStyle.Companion.getItalic-_-LCdwA()) ? FontSlant.ITALIC : FontSlant.UPRIGHT);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Platform currentPlatform() {
/*     */     String name = System.getProperty("os.name");
/*     */     Intrinsics.checkNotNull(name);
/*     */     return StringsKt.startsWith$default(name, "Linux", false, 2, null) ? Platform.Linux : (StringsKt.startsWith$default(name, "Win", false, 2, null) ? Platform.Windows : (Intrinsics.areEqual(name, "Mac OS X") ? Platform.MacOS : Platform.Unknown));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\platform\DesktopFont_desktopKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */