/*   */ package ai.grazie.nlp.langs;
/*   */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\002\030\002\n\002\b\003\"\025\020\000\032\0020\001*\0020\0028F¢\006\006\032\004\b\003\020\004¨\006\005"}, d2 = {"locale", "Ljava/util/Locale;", "Lai/grazie/nlp/langs/Language;", "getLocale", "(Lai/grazie/nlp/langs/Language;)Ljava/util/Locale;", "nlp-langs"})
/*   */ public final class ExtensionsKt {
/*   */   @NotNull
/*   */   public static final Locale getLocale(@NotNull Language $this$locale) {
/* 6 */     Intrinsics.checkNotNullParameter($this$locale, "<this>"); Intrinsics.checkNotNullExpressionValue($this$locale.getIso().name().toLowerCase(Locale.ROOT), "toLowerCase(...)"); return new Locale($this$locale.getIso().name().toLowerCase(Locale.ROOT));
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-langs-jvm-0.4.32.jar!\ai\grazie\nlp\langs\ExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */