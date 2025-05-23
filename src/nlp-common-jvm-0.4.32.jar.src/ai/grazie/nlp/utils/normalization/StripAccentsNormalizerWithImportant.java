/*    */ package ai.grazie.nlp.utils.normalization;
/*    */ 
/*    */ import java.util.Set;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\000\n\002\020\"\n\002\020\016\n\002\b\004\030\0002\0020\001B\025\022\016\b\002\020\002\032\b\022\004\022\0020\0040\003¢\006\002\020\005J\020\020\006\032\0020\0042\006\020\007\032\0020\004H\026R\024\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\002\n\000¨\006\b"}, d2 = {"Lai/grazie/nlp/utils/normalization/StripAccentsNormalizerWithImportant;", "Lai/grazie/nlp/utils/normalization/Normalizer;", "importantMarks", "", "", "(Ljava/util/Set;)V", "normalize", "text", "nlp-common"})
/*    */ @SourceDebugExtension({"SMAP\nStripAccentsNormalizerWithImportant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripAccentsNormalizerWithImportant.kt\nai/grazie/nlp/utils/normalization/StripAccentsNormalizerWithImportant\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,15:1\n434#2:16\n507#2,5:17\n*S KotlinDebug\n*F\n+ 1 StripAccentsNormalizerWithImportant.kt\nai/grazie/nlp/utils/normalization/StripAccentsNormalizerWithImportant\n*L\n12#1:16\n12#1:17,5\n*E\n"})
/*    */ public final class StripAccentsNormalizerWithImportant implements Normalizer {
/*  9 */   public StripAccentsNormalizerWithImportant(@NotNull Set<String> importantMarks) { this.importantMarks = importantMarks; } @NotNull
/*    */   private final Set<String> importantMarks; @NotNull
/* 11 */   public String normalize(@NotNull String text) { Intrinsics.checkNotNullParameter(text, "text"); String mText = PolyfillJVMKt.normalizeToUnicode(text, true, false);
/* 12 */     String $this$filter$iv = mText; int $i$f$filter = 0;
/*    */ 
/*    */ 
/*    */     
/* 16 */     CharSequence charSequence = $this$filter$iv; Appendable destination$iv$iv = new StringBuilder(); int $i$f$filterTo = 0;
/* 17 */     for (int index$iv$iv = 0, i = charSequence.length(); index$iv$iv < i; index$iv$iv++) {
/* 18 */       char element$iv$iv = charSequence.charAt(index$iv$iv);
/* 19 */       char it = element$iv$iv; int $i$a$-filter-StripAccentsNormalizerWithImportant$normalize$1 = 0; if ((CharsKt.getCategory(it) != CharCategory.NON_SPACING_MARK || this.importantMarks.contains(String.valueOf(it)))) destination$iv$iv.append(element$iv$iv); 
/*    */     } 
/* 21 */     return PolyfillJVMKt.normalizeToUnicode$default(((StringBuilder)destination$iv$iv).toString(), false, false, 2, null); }
/*    */ 
/*    */   
/*    */   public StripAccentsNormalizerWithImportant() {
/*    */     this(null, 1, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-common-jvm-0.4.32.jar!\ai\grazie\nl\\utils\normalization\StripAccentsNormalizerWithImportant.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */