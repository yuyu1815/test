/*   */ package ai.grazie.utils.mpp;@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\004J\016\020\006\032\0020\0042\006\020\005\032\0020\004¨\006\007"}, d2 = {"Lai/grazie/utils/mpp/URLEncoder;", "", "()V", "decode", "", "text", "encode", "utils-common"})
/*   */ public final class URLEncoder {
/*   */   @NotNull
/*   */   public final String encode(@NotNull String text) {
/* 5 */     Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullExpressionValue(java.net.URLEncoder.encode(text, Charsets.UTF_8), "encode(text, Charsets.UTF_8)"); return StringsKt.replace$default(java.net.URLEncoder.encode(text, Charsets.UTF_8), "+", "%20", false, 4, null);
/*   */   } @NotNull
/*   */   public static final URLEncoder INSTANCE = new URLEncoder(); @NotNull
/*   */   public final String decode(@NotNull String text) {
/* 9 */     Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullExpressionValue(URLDecoder.decode(text, Charsets.UTF_8), "decode(text, Charsets.UTF_8)"); return URLDecoder.decode(text, Charsets.UTF_8);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\URLEncoder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */