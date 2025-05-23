/*    */ package ai.grazie.nlp.utils.normalization;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\021\n\002\b\003\n\002\020\016\n\002\b\002\030\0002\0020\001B\031\022\022\020\002\032\n\022\006\b\001\022\0020\0010\003\"\0020\001¢\006\002\020\004J\020\020\006\032\0020\0072\006\020\b\032\0020\007H\026R\030\020\002\032\n\022\006\b\001\022\0020\0010\003X\004¢\006\004\n\002\020\005¨\006\t"}, d2 = {"Lai/grazie/nlp/utils/normalization/AggregatedNormalizer;", "Lai/grazie/nlp/utils/normalization/Normalizer;", "normalizers", "", "([Lai/grazie/nlp/utils/normalization/Normalizer;)V", "[Lai/grazie/nlp/utils/normalization/Normalizer;", "normalize", "", "text", "nlp-common"})
/*  3 */ public final class AggregatedNormalizer implements Normalizer { public AggregatedNormalizer(@NotNull Normalizer... normalizers) { this.normalizers = normalizers; } @NotNull
/*    */   private final Normalizer[] normalizers; @NotNull
/*    */   public String normalize(@NotNull String text) {
/*  6 */     Intrinsics.checkNotNullParameter(text, "text"); String normalizedText = text; Normalizer[] arrayOfNormalizer; byte b; int i;
/*  7 */     for (arrayOfNormalizer = this.normalizers, b = 0, i = arrayOfNormalizer.length; b < i; ) { Normalizer normalizer = arrayOfNormalizer[b];
/*  8 */       normalizedText = normalizer.normalize(normalizedText); b++; }
/*    */     
/* 10 */     return normalizedText;
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-common-jvm-0.4.32.jar!\ai\grazie\nl\\utils\normalization\AggregatedNormalizer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */