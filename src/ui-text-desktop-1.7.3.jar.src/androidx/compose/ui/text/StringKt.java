/*     */ package androidx.compose.ui.text;
/*     */ 
/*     */ import androidx.compose.ui.text.intl.Locale;
/*     */ import androidx.compose.ui.text.intl.LocaleList;
/*     */ import androidx.compose.ui.text.platform.DesktopStringDelegate_desktopKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\034\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\032\022\020\002\032\0020\003*\0020\0032\006\020\004\032\0020\005\032\022\020\002\032\0020\003*\0020\0032\006\020\006\032\0020\007\032\022\020\b\032\0020\003*\0020\0032\006\020\004\032\0020\005\032\022\020\b\032\0020\003*\0020\0032\006\020\006\032\0020\007\032\022\020\t\032\0020\003*\0020\0032\006\020\004\032\0020\005\032\022\020\t\032\0020\003*\0020\0032\006\020\006\032\0020\007\032\022\020\n\032\0020\003*\0020\0032\006\020\004\032\0020\005\032\022\020\n\032\0020\003*\0020\0032\006\020\006\032\0020\007\"\016\020\000\032\0020\001X\004¢\006\002\n\000¨\006\013"}, d2 = {"stringDelegate", "Landroidx/compose/ui/text/PlatformStringDelegate;", "capitalize", "", "locale", "Landroidx/compose/ui/text/intl/Locale;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "decapitalize", "toLowerCase", "toUpperCase", "ui-text"})
/*     */ public final class StringKt
/*     */ {
/*     */   @NotNull
/*     */   public static final String toUpperCase(@NotNull String $this$toUpperCase, @NotNull Locale locale) {
/*  72 */     Intrinsics.checkNotNullParameter($this$toUpperCase, "<this>"); Intrinsics.checkNotNullParameter(locale, "locale"); return stringDelegate.toUpperCase($this$toUpperCase, locale.getPlatformLocale());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final String toLowerCase(@NotNull String $this$toLowerCase, @NotNull Locale locale) {
/*  81 */     Intrinsics.checkNotNullParameter($this$toLowerCase, "<this>"); Intrinsics.checkNotNullParameter(locale, "locale"); return stringDelegate.toLowerCase($this$toLowerCase, locale.getPlatformLocale());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final String capitalize(@NotNull String $this$capitalize, @NotNull Locale locale) {
/*  89 */     Intrinsics.checkNotNullParameter($this$capitalize, "<this>"); Intrinsics.checkNotNullParameter(locale, "locale"); return stringDelegate.capitalize($this$capitalize, locale.getPlatformLocale());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final String decapitalize(@NotNull String $this$decapitalize, @NotNull Locale locale) {
/*  97 */     Intrinsics.checkNotNullParameter($this$decapitalize, "<this>"); Intrinsics.checkNotNullParameter(locale, "locale"); return stringDelegate.decapitalize($this$decapitalize, locale.getPlatformLocale());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final String toUpperCase(@NotNull String $this$toUpperCase, @NotNull LocaleList localeList) {
/* 107 */     Intrinsics.checkNotNullParameter($this$toUpperCase, "<this>"); Intrinsics.checkNotNullParameter(localeList, "localeList"); return localeList.isEmpty() ? toUpperCase($this$toUpperCase, Locale.Companion.getCurrent()) : toUpperCase($this$toUpperCase, localeList.get(0));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final String toLowerCase(@NotNull String $this$toLowerCase, @NotNull LocaleList localeList) {
/* 117 */     Intrinsics.checkNotNullParameter($this$toLowerCase, "<this>"); Intrinsics.checkNotNullParameter(localeList, "localeList"); return localeList.isEmpty() ? toLowerCase($this$toLowerCase, Locale.Companion.getCurrent()) : toLowerCase($this$toLowerCase, localeList.get(0));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final String capitalize(@NotNull String $this$capitalize, @NotNull LocaleList localeList) {
/* 127 */     Intrinsics.checkNotNullParameter($this$capitalize, "<this>"); Intrinsics.checkNotNullParameter(localeList, "localeList"); return localeList.isEmpty() ? capitalize($this$capitalize, Locale.Companion.getCurrent()) : capitalize($this$capitalize, localeList.get(0));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final String decapitalize(@NotNull String $this$decapitalize, @NotNull LocaleList localeList) {
/* 136 */     Intrinsics.checkNotNullParameter($this$decapitalize, "<this>"); Intrinsics.checkNotNullParameter(localeList, "localeList"); return localeList.isEmpty() ? decapitalize($this$decapitalize, Locale.Companion.getCurrent()) : decapitalize($this$decapitalize, localeList.get(0));
/*     */   } @NotNull
/* 138 */   private static final PlatformStringDelegate stringDelegate = DesktopStringDelegate_desktopKt.ActualStringDelegate();
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\StringKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */