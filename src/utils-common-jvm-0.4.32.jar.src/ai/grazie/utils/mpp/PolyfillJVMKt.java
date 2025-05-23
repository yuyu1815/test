/*    */ package ai.grazie.utils.mpp;
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\020\016\n\000\n\002\020\013\n\002\b\002\032\036\020\000\032\0020\001*\0020\0012\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003¨\006\005"}, d2 = {"normalizeToUnicode", "", "decompose", "", "uglify", "utils-common"})
/*    */ public final class PolyfillJVMKt {
/*    */   @NotNull
/*    */   public static final String normalizeToUnicode(@NotNull String $this$normalizeToUnicode, boolean decompose, boolean uglify) {
/*  6 */     Intrinsics.checkNotNullParameter($this$normalizeToUnicode, "<this>"); if (decompose) { Intrinsics.checkNotNullExpressionValue(
/*  7 */           uglify ? 
/*  8 */           Normalizer.normalize($this$normalizeToUnicode, Normalizer.Form.NFKD) : 
/*    */           
/* 10 */           Normalizer.normalize($this$normalizeToUnicode, Normalizer.Form.NFD), "{\n        if (uglify) {\n…Form.NFD)\n        }\n    }"); }
/*    */     else
/* 12 */     { Intrinsics.checkNotNullExpressionValue(
/* 13 */           uglify ? 
/* 14 */           Normalizer.normalize($this$normalizeToUnicode, Normalizer.Form.NFKC) : 
/*    */           
/* 16 */           Normalizer.normalize($this$normalizeToUnicode, Normalizer.Form.NFC), "{\n        if (uglify) {\n…Form.NFC)\n        }\n    }"); }  return uglify ? Normalizer.normalize($this$normalizeToUnicode, Normalizer.Form.NFKC) : Normalizer.normalize($this$normalizeToUnicode, Normalizer.Form.NFC);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\PolyfillJVMKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */