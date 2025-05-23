/*   */ package ai.grazie.utils.mpp;
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\020\016\n\002\030\002\n\002\b\002\032\022\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\001¨\006\004"}, d2 = {"decodeToUTF", "", "Lai/grazie/utils/mpp/Base64;", "content", "utils-common"})
/*   */ public final class Base64Kt {
/*   */   @NotNull
/*   */   public static final String decodeToUTF(@NotNull Base64 $this$decodeToUTF, @NotNull String content) {
/* 8 */     Intrinsics.checkNotNullParameter($this$decodeToUTF, "<this>"); Intrinsics.checkNotNullParameter(content, "content"); return StringsKt.decodeToString($this$decodeToUTF.decode(content));
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\Base64Kt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */