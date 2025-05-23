/*     */ package androidx.compose.ui.text.platform;
/*     */ 
/*     */ import androidx.compose.ui.text.font.Font;
/*     */ import androidx.compose.ui.text.font.FontFamily;
/*     */ import androidx.compose.ui.text.font.FontStyle;
/*     */ import androidx.compose.ui.text.font.FontWeight;
/*     */ import androidx.compose.ui.text.font.GenericFontFamily;
/*     */ import androidx.compose.ui.text.font.Typeface;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.LazyKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.Pair;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000H\n\000\n\002\020$\n\002\020\016\n\002\020 \n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\022\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\002\032:\020\f\032\0020\r2\006\020\016\032\0020\0022\f\020\017\032\b\022\004\022\0020\0210\0202\b\b\002\020\022\032\0020\0232\b\b\002\020\024\032\0020\025ø\001\000¢\006\004\b\026\020\027\0324\020\f\032\0020\r2\006\020\016\032\0020\0022\006\020\030\032\0020\0212\b\b\002\020\022\032\0020\0232\b\b\002\020\024\032\0020\025ø\001\000¢\006\004\b\026\020\031\032\032\020\032\032\0020\0332\006\020\034\032\0020\0352\n\b\002\020\036\032\004\030\0010\002\"-\020\000\032\024\022\004\022\0020\002\022\n\022\b\022\004\022\0020\0020\0030\0018BX\002¢\006\f\n\004\b\006\020\007\032\004\b\004\020\005\"\036\020\b\032\b\022\004\022\0020\0020\003*\0020\t8@X\004¢\006\006\032\004\b\n\020\013\002\007\n\005\b¡\0360\001¨\006\037"}, d2 = {"GenericFontFamiliesMapping", "", "", "", "getGenericFontFamiliesMapping", "()Ljava/util/Map;", "GenericFontFamiliesMapping$delegate", "Lkotlin/Lazy;", "aliases", "Landroidx/compose/ui/text/font/GenericFontFamily;", "getAliases", "(Landroidx/compose/ui/text/font/GenericFontFamily;)Ljava/util/List;", "Font", "Landroidx/compose/ui/text/font/Font;", "identity", "getData", "Lkotlin/Function0;", "", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "Font-wCLgNak", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "data", "(Ljava/lang/String;[BLandroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "Typeface", "Landroidx/compose/ui/text/font/Typeface;", "typeface", "Lorg/jetbrains/skia/Typeface;", "alias", "ui-text"})
/*     */ public final class PlatformFont_skikoKt
/*     */ {
/*     */   @NotNull
/*     */   public static final Font Font-wCLgNak(@NotNull String identity, @NotNull Function0 getData, @NotNull FontWeight weight, int style) {
/* 126 */     Intrinsics.checkNotNullParameter(identity, "identity"); Intrinsics.checkNotNullParameter(getData, "getData"); Intrinsics.checkNotNullParameter(weight, "weight"); return new LoadedFont(identity, getData, weight, style, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\022\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */   static final class PlatformFont_skikoKt$Font$1
/*     */     extends Lambda
/*     */     implements Function0<byte[]>
/*     */   {
/*     */     @NotNull
/*     */     public final byte[] invoke() {
/*     */       return this.$data;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     PlatformFont_skikoKt$Font$1(byte[] $data) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Font Font-wCLgNak(@NotNull String identity, @NotNull byte[] data, @NotNull FontWeight weight, int style) {
/* 154 */     Intrinsics.checkNotNullParameter(identity, "identity"); Intrinsics.checkNotNullParameter(data, "data"); Intrinsics.checkNotNullParameter(weight, "weight"); return Font-wCLgNak(identity, new PlatformFont_skikoKt$Font$1(data), 
/*     */         
/* 156 */         weight, 
/* 157 */         style);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Typeface Typeface(@NotNull Typeface typeface, @Nullable String alias) {
/* 166 */     Intrinsics.checkNotNullParameter(typeface, "typeface"); return new SkiaBackedTypeface(alias, typeface);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   public static final List<String> getAliases(@NotNull GenericFontFamily $this$aliases)
/*     */   {
/* 276 */     Intrinsics.checkNotNullParameter($this$aliases, "<this>"); if ((List<String>)getGenericFontFamiliesMapping().get($this$aliases.getName()) == null) { (List<String>)getGenericFontFamiliesMapping().get($this$aliases.getName()); throw new IllegalStateException((
/* 277 */           "Unknown generic font family " + $this$aliases.getName()).toString()); }
/*     */     
/* 279 */     return getGenericFontFamiliesMapping().get($this$aliases.getName()); } @NotNull private static final Lazy GenericFontFamiliesMapping$delegate = LazyKt.lazy(PlatformFont_skikoKt$GenericFontFamiliesMapping$2.INSTANCE); private static final Map<String, List<String>> getGenericFontFamiliesMapping() { Lazy lazy = GenericFontFamiliesMapping$delegate; return (Map<String, List<String>>)lazy.getValue(); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020$\n\002\020\016\n\002\020 \n\000\020\000\032\024\022\004\022\0020\002\022\n\022\b\022\004\022\0020\0020\0030\001H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "", "", "invoke"}) static final class PlatformFont_skikoKt$GenericFontFamiliesMapping$2 extends Lambda implements Function0<Map<String, ? extends List<? extends String>>> { @NotNull public final Map<String, List<String>> invoke() { Pair[] arrayOfPair; String[] arrayOfString;
/* 280 */       switch (WhenMappings.$EnumSwitchMapping$0[DesktopFont_desktopKt.currentPlatform().ordinal()]) {
/*     */         
/*     */         case 1:
/* 283 */           arrayOfPair = new Pair[4]; arrayOfString = new String[3]; arrayOfString[0] = "Noto Sans"; arrayOfString[1] = "DejaVu Sans"; arrayOfString[2] = "Arial"; arrayOfPair[0] = TuplesKt.to(FontFamily.Companion.getSansSerif().getName(), CollectionsKt.listOf((Object[])arrayOfString));
/* 284 */           arrayOfString = new String[3]; arrayOfString[0] = "Noto Serif"; arrayOfString[1] = "DejaVu Serif"; arrayOfString[2] = "Times New Roman"; arrayOfPair[1] = TuplesKt.to(FontFamily.Companion.getSerif().getName(), CollectionsKt.listOf((Object[])arrayOfString));
/* 285 */           arrayOfString = new String[3]; arrayOfString[0] = "Noto Sans Mono"; arrayOfString[1] = "DejaVu Sans Mono"; arrayOfString[2] = "Consolas"; arrayOfPair[2] = TuplesKt.to(FontFamily.Companion.getMonospace().getName(), CollectionsKt.listOf((Object[])arrayOfString));
/*     */           
/* 287 */           arrayOfPair[3] = TuplesKt.to(FontFamily.Companion.getCursive().getName(), CollectionsKt.listOf("Comic Sans MS"));
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         case 2:
/* 293 */           arrayOfPair = new Pair[4]; arrayOfString = new String[2]; arrayOfString[0] = "Segoe UI"; arrayOfString[1] = "Arial"; arrayOfPair[0] = TuplesKt.to(FontFamily.Companion.getSansSerif().getName(), CollectionsKt.listOf((Object[])arrayOfString)); arrayOfPair[1] = 
/* 294 */             TuplesKt.to(FontFamily.Companion.getSerif().getName(), CollectionsKt.listOf("Times New Roman"));
/* 295 */           arrayOfPair[2] = TuplesKt.to(FontFamily.Companion.getMonospace().getName(), CollectionsKt.listOf("Consolas"));
/* 296 */           arrayOfPair[3] = TuplesKt.to(FontFamily.Companion.getCursive().getName(), CollectionsKt.listOf("Comic Sans MS"));
/*     */         case 3:
/*     */         case 4:
/*     */         case 5:
/*     */         case 6:
/* 301 */           arrayOfPair = new Pair[4]; arrayOfString = new String[3]; arrayOfString[0] = ".AppleSystemUIFont"; arrayOfString[1] = "Helvetica Neue"; arrayOfString[2] = "Helvetica"; arrayOfPair[0] = TuplesKt.to(FontFamily.Companion.getSansSerif().getName(), CollectionsKt.listOf((Object[])arrayOfString));
/* 302 */           arrayOfString = new String[3]; arrayOfString[0] = ".AppleSystemUIFontSerif"; arrayOfString[1] = "Times"; arrayOfString[2] = "Times New Roman"; arrayOfPair[1] = TuplesKt.to(FontFamily.Companion.getSerif().getName(), CollectionsKt.listOf((Object[])arrayOfString));
/* 303 */           arrayOfString = new String[3]; arrayOfString[0] = ".AppleSystemUIFontMonospaced"; arrayOfString[1] = "Menlo"; arrayOfString[2] = "Courier"; arrayOfPair[2] = TuplesKt.to(FontFamily.Companion.getMonospace().getName(), CollectionsKt.listOf((Object[])arrayOfString));
/*     */           
/* 305 */           arrayOfString = new String[2]; arrayOfString[0] = "Apple Chancery"; arrayOfString[1] = "Snell Roundhand"; arrayOfPair[3] = TuplesKt.to(FontFamily.Companion.getCursive().getName(), CollectionsKt.listOf((Object[])arrayOfString));
/*     */ 
/*     */         
/*     */         case 7:
/* 309 */           arrayOfPair = new Pair[4]; arrayOfString = new String[2]; arrayOfString[0] = "Roboto"; arrayOfString[1] = "Noto Sans"; arrayOfPair[0] = TuplesKt.to(FontFamily.Companion.getSansSerif().getName(), CollectionsKt.listOf((Object[])arrayOfString));
/* 310 */           arrayOfString = new String[2]; arrayOfString[0] = "Roboto Serif"; arrayOfString[1] = "Noto Serif"; arrayOfPair[1] = TuplesKt.to(FontFamily.Companion.getSerif().getName(), CollectionsKt.listOf((Object[])arrayOfString));
/* 311 */           arrayOfString = new String[2]; arrayOfString[0] = "Roboto Mono"; arrayOfString[1] = "Noto Sans Mono"; arrayOfPair[2] = TuplesKt.to(FontFamily.Companion.getMonospace().getName(), CollectionsKt.listOf((Object[])arrayOfString));
/* 312 */           arrayOfPair[3] = TuplesKt.to(FontFamily.Companion.getCursive().getName(), CollectionsKt.listOf("Comic Sans MS"));
/*     */ 
/*     */         
/*     */         case 8:
/* 316 */           arrayOfPair = new Pair[4]; arrayOfPair[0] = TuplesKt.to(FontFamily.Companion.getSansSerif().getName(), CollectionsKt.listOf("Arial")); arrayOfPair[1] = 
/* 317 */             TuplesKt.to(FontFamily.Companion.getSerif().getName(), CollectionsKt.listOf("Times New Roman"));
/* 318 */           arrayOfPair[2] = TuplesKt.to(FontFamily.Companion.getMonospace().getName(), CollectionsKt.listOf("Consolas"));
/* 319 */           arrayOfPair[3] = TuplesKt.to(FontFamily.Companion.getCursive().getName(), CollectionsKt.listOf("Comic Sans MS"));
/*     */       } 
/*     */       throw new NoWhenBranchMatchedException(); }
/*     */ 
/*     */     
/*     */     public static final PlatformFont_skikoKt$GenericFontFamiliesMapping$2 INSTANCE = new PlatformFont_skikoKt$GenericFontFamiliesMapping$2();
/*     */     
/*     */     PlatformFont_skikoKt$GenericFontFamiliesMapping$2() {
/*     */       super(0);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\platform\PlatformFont_skikoKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */