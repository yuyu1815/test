/*    */ package org.jetbrains.compose.resources;
/*    */ import java.util.Locale;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\032\b\020\000\032\0020\001H\000¨\006\002"}, d2 = {"getSystemEnvironment", "Lorg/jetbrains/compose/resources/ResourceEnvironment;", "library"})
/*    */ public final class ResourceEnvironment_desktopKt {
/*    */   @NotNull
/*    */   public static final ResourceEnvironment getSystemEnvironment() {
/*  9 */     Locale locale = Locale.getDefault();
/*    */     
/* 11 */     boolean isDarkTheme = (SystemTheme_awtKt.getCurrentSystemTheme() == SystemTheme.DARK);
/* 12 */     int dpi = Toolkit.getDefaultToolkit().getScreenResolution();
/*    */     
/* 14 */     Intrinsics.checkNotNullExpressionValue(locale.getLanguage(), "getLanguage(...)");
/* 15 */     Intrinsics.checkNotNullExpressionValue(locale.getCountry(), "getCountry(...)"); return new ResourceEnvironment(new LanguageQualifier(locale.getLanguage()), new RegionQualifier(locale.getCountry()), 
/* 16 */         ThemeQualifier.Companion.selectByValue(isDarkTheme), 
/* 17 */         DensityQualifier.Companion.selectByValue(dpi));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\ResourceEnvironment_desktopKt.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */