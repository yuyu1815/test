/*    */ package androidx.compose.ui.text.platform;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import androidx.compose.ui.text.PlatformStringDelegate;
/*    */ import java.util.Locale;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.text.CharsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\004\b\000\030\0002\0020\001B\005¢\006\002\020\002J\034\020\003\032\0020\0042\006\020\005\032\0020\0042\n\020\006\032\0060\007j\002`\bH\026J\034\020\t\032\0020\0042\006\020\005\032\0020\0042\n\020\006\032\0060\007j\002`\bH\026J\034\020\n\032\0020\0042\006\020\005\032\0020\0042\n\020\006\032\0060\007j\002`\bH\026J\034\020\013\032\0020\0042\006\020\005\032\0020\0042\n\020\006\032\0060\007j\002`\bH\026¨\006\f"}, d2 = {"Landroidx/compose/ui/text/platform/DesktopStringDelegate;", "Landroidx/compose/ui/text/PlatformStringDelegate;", "()V", "capitalize", "", "string", "locale", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "decapitalize", "toLowerCase", "toUpperCase", "ui-text"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ @SourceDebugExtension({"SMAP\nDesktopStringDelegate.desktop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DesktopStringDelegate.desktop.kt\nandroidx/compose/ui/text/platform/DesktopStringDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/*    */ public final class DesktopStringDelegate
/*    */   implements PlatformStringDelegate
/*    */ {
/*    */   public static final int $stable;
/*    */   
/*    */   @NotNull
/*    */   public String toUpperCase(@NotNull String string, @NotNull Locale locale) {
/* 27 */     Intrinsics.checkNotNullParameter(string, "string"); Intrinsics.checkNotNullParameter(locale, "locale"); Intrinsics.checkNotNullExpressionValue(string.toUpperCase(locale), "toUpperCase(...)"); return string.toUpperCase(locale);
/*    */   } @NotNull
/*    */   public String toLowerCase(@NotNull String string, @NotNull Locale locale) {
/* 30 */     Intrinsics.checkNotNullParameter(string, "string"); Intrinsics.checkNotNullParameter(locale, "locale"); Intrinsics.checkNotNullExpressionValue(string.toLowerCase(locale), "toLowerCase(...)"); return string.toLowerCase(locale);
/*    */   } @NotNull
/*    */   public String capitalize(@NotNull String string, @NotNull Locale locale) {
/* 33 */     Intrinsics.checkNotNullParameter(string, "string"); Intrinsics.checkNotNullParameter(locale, "locale"); String str1 = string; char c = str1.charAt(0); StringBuilder stringBuilder = new StringBuilder(); int $i$a$-replaceFirstCharWithCharSequence-DesktopStringDelegate$capitalize$1 = 0; String str2 = str1; $i$a$-replaceFirstCharWithCharSequence-DesktopStringDelegate$capitalize$1 = 1; Intrinsics.checkNotNullExpressionValue(str2.substring($i$a$-replaceFirstCharWithCharSequence-DesktopStringDelegate$capitalize$1), "substring(...)"); return ((str1.length() > 0)) ? 
/* 34 */       stringBuilder.append(Character.isLowerCase(c) ? 
/* 35 */         CharsKt.titlecase(c, locale) : 
/*    */         
/* 37 */         String.valueOf(c)).append(str2.substring($i$a$-replaceFirstCharWithCharSequence-DesktopStringDelegate$capitalize$1)).toString() : str1;
/*    */   }
/*    */   @NotNull
/*    */   public String decapitalize(@NotNull String string, @NotNull Locale locale) {
/* 41 */     Intrinsics.checkNotNullParameter(string, "string"); Intrinsics.checkNotNullParameter(locale, "locale"); String str1 = string; char c = str1.charAt(0);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 46 */     StringBuilder stringBuilder = new StringBuilder(); int $i$a$-replaceFirstCharWithCharSequence-DesktopStringDelegate$decapitalize$1 = 0;
/*    */     String str2 = str1;
/*    */     $i$a$-replaceFirstCharWithCharSequence-DesktopStringDelegate$decapitalize$1 = 1;
/*    */     Intrinsics.checkNotNullExpressionValue(str2.substring($i$a$-replaceFirstCharWithCharSequence-DesktopStringDelegate$decapitalize$1), "substring(...)");
/*    */     return ((str1.length() > 0)) ? stringBuilder.append(CharsKt.lowercase(c, locale)).append(str2.substring($i$a$-replaceFirstCharWithCharSequence-DesktopStringDelegate$decapitalize$1)).toString() : str1;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\platform\DesktopStringDelegate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */