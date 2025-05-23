/*   */ package org.jetbrains.jewel.foundation.theme;
/*   */ import kotlin.text.Regex;
/*   */ import kotlin.text.RegexOption;
/*   */ 
/*   */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\003\"\024\020\000\032\0020\0018BX\004¢\006\006\032\004\b\002\020\003¨\006\004"}, d2 = {"colorKeyRegex", "Lkotlin/text/Regex;", "getColorKeyRegex", "()Lkotlin/text/Regex;", "foundation"})
/*   */ public final class ThemeColorPaletteKt {
/*   */   private static final Regex getColorKeyRegex() {
/* 8 */     return new Regex("([a-z]+)(\\d+)", RegexOption.IGNORE_CASE);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\theme\ThemeColorPaletteKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */