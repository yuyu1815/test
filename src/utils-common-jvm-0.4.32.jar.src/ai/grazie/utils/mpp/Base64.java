/*   */ package ai.grazie.utils.mpp;@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\022\n\000\n\002\020\016\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\016\020\007\032\0020\0062\006\020\b\032\0020\004¨\006\t"}, d2 = {"Lai/grazie/utils/mpp/Base64;", "", "()V", "decode", "", "content", "", "encode", "array", "utils-common"})
/*   */ public final class Base64 {
/*   */   @NotNull
/*   */   public final String encode(@NotNull byte[] array) {
/* 5 */     Intrinsics.checkNotNullParameter(array, "array"); Intrinsics.checkNotNullExpressionValue(java.util.Base64.getEncoder().encodeToString(array), "getEncoder().encodeToString(array)"); return java.util.Base64.getEncoder().encodeToString(array);
/*   */   } @NotNull
/*   */   public static final Base64 INSTANCE = new Base64(); @NotNull
/*   */   public final byte[] decode(@NotNull String content) {
/* 9 */     Intrinsics.checkNotNullParameter(content, "content"); Intrinsics.checkNotNullExpressionValue(java.util.Base64.getDecoder().decode(content), "getDecoder().decode(content)"); return java.util.Base64.getDecoder().decode(content);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\Base64.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */