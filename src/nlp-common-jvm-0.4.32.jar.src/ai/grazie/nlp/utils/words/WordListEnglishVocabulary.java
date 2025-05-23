/*    */ package ai.grazie.nlp.utils.words;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\002\b\002\n\002\020\013\n\002\b\003\030\000 \t2\0020\001:\001\tB\025\b\000\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\002\020\005J\020\020\006\032\0020\0072\006\020\b\032\0020\004H\026R\024\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\002\n\000¨\006\n"}, d2 = {"Lai/grazie/nlp/utils/words/WordListEnglishVocabulary;", "Lai/grazie/nlp/utils/words/EnglishVocabulary;", "commonWordsSorted", "", "", "(Ljava/util/List;)V", "isEnglishWord", "", "word", "Companion", "nlp-common"})
/*    */ public final class WordListEnglishVocabulary implements EnglishVocabulary {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*  7 */   public WordListEnglishVocabulary(@NotNull List<String> commonWordsSorted) { this.commonWordsSorted = commonWordsSorted; } @NotNull
/*    */   private final List<String> commonWordsSorted; @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lai/grazie/nlp/utils/words/WordListEnglishVocabulary$Companion;", "", "()V", "load", "Lai/grazie/nlp/utils/words/WordListEnglishVocabulary;", "content", "", "nlp-common"})
/*    */   @SourceDebugExtension({"SMAP\nWordListEnglishVocabulary.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordListEnglishVocabulary.kt\nai/grazie/nlp/utils/words/WordListEnglishVocabulary$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,20:1\n774#2:21\n865#2,2:22\n*S KotlinDebug\n*F\n+ 1 WordListEnglishVocabulary.kt\nai/grazie/nlp/utils/words/WordListEnglishVocabulary$Companion\n*L\n11#1:21\n11#1:22,2\n*E\n"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/* 11 */     public final WordListEnglishVocabulary load(@NotNull String content) { Intrinsics.checkNotNullParameter(content, "content"); Iterable $this$filter$iv = StringsKt.lines(content); int $i$f$filter = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 21 */       Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 22 */       for (Object element$iv$iv : iterable1) { String it = (String)element$iv$iv; int $i$a$-filter-WordListEnglishVocabulary$Companion$load$words$1 = 0; if (!StringsKt.isBlank(it)) destination$iv$iv.add(element$iv$iv);  }
/* 23 */        List<String> words = CollectionsKt.sorted(destination$iv$iv);
/*    */       return new WordListEnglishVocabulary(words); }
/*    */      }
/*    */ 
/*    */   
/*    */   public boolean isEnglishWord(@NotNull String word) {
/*    */     Intrinsics.checkNotNullParameter(word, "word");
/*    */     Intrinsics.checkNotNullExpressionValue(word.toLowerCase(Locale.ROOT), "toLowerCase(...)");
/*    */     return (CollectionsKt.binarySearch$default(this.commonWordsSorted, word.toLowerCase(Locale.ROOT), 0, 0, 6, null) >= 0);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-common-jvm-0.4.32.jar!\ai\grazie\nl\\utils\words\WordListEnglishVocabulary.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */