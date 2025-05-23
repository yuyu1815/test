/*   */ package ai.grazie.nlp.utils.normalization;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\002\030\0002\0020\001B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\004H\026¨\006\006"}, d2 = {"Lai/grazie/nlp/utils/normalization/StripAccentsNormalizer;", "Lai/grazie/nlp/utils/normalization/Normalizer;", "()V", "normalize", "", "text", "nlp-common"})
/*   */ public final class StripAccentsNormalizer implements Normalizer {
/*   */   @NotNull
/*   */   public String normalize(@NotNull String text) {
/* 7 */     Intrinsics.checkNotNullParameter(text, "text"); return TextKt.normalizeAccents(text);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-common-jvm-0.4.32.jar!\ai\grazie\nl\\utils\normalization\StripAccentsNormalizer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */