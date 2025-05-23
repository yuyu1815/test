/*    */ package ai.grazie.nlp.utils.normalization;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\002\030\0002\0020\001B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\004H\026¨\006\006"}, d2 = {"Lai/grazie/nlp/utils/normalization/ApostropheNormalizer;", "Lai/grazie/nlp/utils/normalization/Normalizer;", "()V", "normalize", "", "text", "nlp-common"})
/*    */ @SourceDebugExtension({"SMAP\nApostropheNormalizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApostropheNormalizer.kt\nai/grazie/nlp/utils/normalization/ApostropheNormalizer\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,10:1\n975#2:11\n1046#2,3:12\n*S KotlinDebug\n*F\n+ 1 ApostropheNormalizer.kt\nai/grazie/nlp/utils/normalization/ApostropheNormalizer\n*L\n7#1:11\n7#1:12,3\n*E\n"})
/*    */ public final class ApostropheNormalizer implements Normalizer {
/*    */   @NotNull
/*    */   public String normalize(@NotNull String text) {
/*  7 */     Intrinsics.checkNotNullParameter(text, "text"); CharSequence $this$map$iv = text; int $i$f$map = 0;
/*    */ 
/*    */ 
/*    */     
/* 11 */     CharSequence charSequence1 = $this$map$iv; Collection destination$iv$iv = new ArrayList($this$map$iv.length()); int $i$f$mapTo = 0;
/* 12 */     for (byte b = 0; b < charSequence1.length(); ) { char item$iv$iv = charSequence1.charAt(b);
/* 13 */       char c = item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-ApostropheNormalizer$normalize$1 = 0; }
/* 14 */      return CollectionsKt.joinToString$default(destination$iv$iv, "", null, null, 0, null, null, 62, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-common-jvm-0.4.32.jar!\ai\grazie\nl\\utils\normalization\ApostropheNormalizer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */