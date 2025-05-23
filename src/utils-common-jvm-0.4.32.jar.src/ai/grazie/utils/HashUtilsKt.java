/*    */ package ai.grazie.utils;@Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\032\n\020\000\032\0020\001*\0020\001¨\006\002"}, d2 = {"secureHash", "", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nHashUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HashUtils.kt\nai/grazie/utils/HashUtilsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,8:1\n12827#2,3:9\n*S KotlinDebug\n*F\n+ 1 HashUtils.kt\nai/grazie/utils/HashUtilsKt\n*L\n7#1:9,3\n*E\n"})
/*    */ public final class HashUtilsKt {
/*    */   @NotNull
/*    */   public static final String secureHash(@NotNull String $this$secureHash) {
/*  6 */     Intrinsics.checkNotNullParameter($this$secureHash, "<this>"); String str = $this$secureHash; Intrinsics.checkNotNullExpressionValue(str.getBytes(Charsets.UTF_8), "getBytes(...)"); byte[] digest = MessageDigest.getInstance("SHA-256").digest(str.getBytes(Charsets.UTF_8));
/*  7 */     Intrinsics.checkNotNullExpressionValue(digest, "digest"); byte[] arrayOfByte1 = digest; Object initial$iv = ""; int $i$f$fold = 0;
/*    */     
/*  9 */     Object accumulator$iv = initial$iv; byte b; int i;
/* 10 */     for (b = 0, i = arrayOfByte1.length; b < i; ) { byte element$iv = arrayOfByte1[b]; byte b1 = element$iv; Object object = accumulator$iv; int $i$a$-fold-HashUtilsKt$secureHash$1 = 0; String str1 = "%02x"; Object[] arrayOfObject = new Object[1]; arrayOfObject[0] = Byte.valueOf(b1); arrayOfObject = arrayOfObject; Intrinsics.checkNotNullExpressionValue(String.format(str1, Arrays.copyOf(arrayOfObject, arrayOfObject.length)), "format(...)"); accumulator$iv = "" + object + object; b++; }
/* 11 */      return (String)accumulator$iv;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\HashUtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */