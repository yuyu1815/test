/*    */ package ai.grazie.nlp.utils.words;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lai/grazie/nlp/utils/words/WordListEnglishVocabulary$Companion;", "", "()V", "load", "Lai/grazie/nlp/utils/words/WordListEnglishVocabulary;", "content", "", "nlp-common"})
/*    */ @SourceDebugExtension({"SMAP\nWordListEnglishVocabulary.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordListEnglishVocabulary.kt\nai/grazie/nlp/utils/words/WordListEnglishVocabulary$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,20:1\n774#2:21\n865#2,2:22\n*S KotlinDebug\n*F\n+ 1 WordListEnglishVocabulary.kt\nai/grazie/nlp/utils/words/WordListEnglishVocabulary$Companion\n*L\n11#1:21\n11#1:22,2\n*E\n"})
/*    */ public final class Companion {
/*    */   @NotNull
/*    */   public final WordListEnglishVocabulary load(@NotNull String content) {
/* 11 */     Intrinsics.checkNotNullParameter(content, "content"); Iterable $this$filter$iv = StringsKt.lines(content); int $i$f$filter = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 21 */     Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 22 */     for (Object element$iv$iv : iterable1) { String it = (String)element$iv$iv; int $i$a$-filter-WordListEnglishVocabulary$Companion$load$words$1 = 0; if (!StringsKt.isBlank(it)) destination$iv$iv.add(element$iv$iv);  }
/* 23 */      List<String> words = CollectionsKt.sorted(destination$iv$iv);
/*    */     return new WordListEnglishVocabulary(words);
/*    */   }
/*    */   
/*    */   private Companion() {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-common-jvm-0.4.32.jar!\ai\grazie\nl\\utils\words\WordListEnglishVocabulary$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */