/*    */ package ai.grazie.utils.mpp.number;
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\032\022\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004\032\n\020\005\032\0020\004*\0020\001¨\006\006"}, d2 = {"of", "Lai/grazie/utils/mpp/number/FixedPrecisionFloat;", "Lai/grazie/utils/mpp/number/FixedPrecisionFloat$Companion;", "decimal", "Ljava/math/BigDecimal;", "toBigDecimal", "utils-common"})
/*    */ public final class FixedPrecisionFloatKt {
/*    */   @NotNull
/*    */   public static final FixedPrecisionFloat of(@NotNull FixedPrecisionFloat.Companion $this$of, @NotNull BigDecimal decimal) {
/*  6 */     Intrinsics.checkNotNullParameter($this$of, "<this>"); Intrinsics.checkNotNullParameter(decimal, "decimal"); long integer = decimal.longValue();
/*  7 */     long fraction = decimal.remainder(BigDecimal.ONE).multiply(BigDecimal.valueOf(1000000000000L)).longValue();
/*  8 */     return new FixedPrecisionFloat(integer, fraction);
/*    */   }
/*    */   @NotNull
/*    */   public static final BigDecimal toBigDecimal(@NotNull FixedPrecisionFloat $this$toBigDecimal) {
/* 12 */     Intrinsics.checkNotNullParameter($this$toBigDecimal, "<this>"); BigDecimal integer = BigDecimal.valueOf($this$toBigDecimal.getInteger$utils_common());
/* 13 */     BigDecimal fraction = BigDecimal.valueOf($this$toBigDecimal.getFraction$utils_common()).divide(BigDecimal.valueOf(1000000000000L));
/* 14 */     Intrinsics.checkNotNullExpressionValue(integer, "integer"); Intrinsics.checkNotNullExpressionValue(fraction, "fraction"); Intrinsics.checkNotNullExpressionValue(integer.add(fraction), "add(...)"); return integer.add(fraction);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\number\FixedPrecisionFloatKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */