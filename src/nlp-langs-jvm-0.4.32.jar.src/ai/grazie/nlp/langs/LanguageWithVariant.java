/*   */ package ai.grazie.nlp.langs;
/*   */ 
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\t\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\031\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005¢\006\002\020\006J\t\020\013\032\0020\003HÆ\003J\013\020\f\032\004\030\0010\005HÆ\003J\037\020\r\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\022HÖ\001J\t\020\023\032\0020\005HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\t\020\n¨\006\024"}, d2 = {"Lai/grazie/nlp/langs/LanguageWithVariant;", "", "base", "Lai/grazie/nlp/langs/Language;", "variant", "", "(Lai/grazie/nlp/langs/Language;Ljava/lang/String;)V", "getBase", "()Lai/grazie/nlp/langs/Language;", "getVariant", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "nlp-langs"})
/*   */ public final class LanguageWithVariant {
/*   */   @NotNull
/*   */   private final Language base;
/*   */   
/* 9 */   public LanguageWithVariant(@NotNull Language base, @Nullable String variant) { this.base = base; this.variant = variant; } @Nullable private final String variant; @NotNull public final Language getBase() { return this.base; } @Nullable public final String getVariant() { return this.variant; }
/*   */ 
/*   */   
/*   */   @NotNull
/*   */   public final Language component1() {
/*   */     return this.base;
/*   */   }
/*   */   
/*   */   @Nullable
/*   */   public final String component2() {
/*   */     return this.variant;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final LanguageWithVariant copy(@NotNull Language base, @Nullable String variant) {
/*   */     Intrinsics.checkNotNullParameter(base, "base");
/*   */     return new LanguageWithVariant(base, variant);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "LanguageWithVariant(base=" + this.base + ", variant=" + this.variant + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     result = this.base.hashCode();
/*   */     return result * 31 + ((this.variant == null) ? 0 : this.variant.hashCode());
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof LanguageWithVariant))
/*   */       return false; 
/*   */     LanguageWithVariant languageWithVariant = (LanguageWithVariant)other;
/*   */     return (this.base != languageWithVariant.base) ? false : (!!Intrinsics.areEqual(this.variant, languageWithVariant.variant));
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-langs-jvm-0.4.32.jar!\ai\grazie\nlp\langs\LanguageWithVariant.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */