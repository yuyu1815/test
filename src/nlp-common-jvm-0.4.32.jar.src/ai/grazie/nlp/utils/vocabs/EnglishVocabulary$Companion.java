/*    */ package ai.grazie.nlp.utils.vocabs;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\"\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\024\020\007\032\b\022\004\022\0020\0060\b2\006\020\005\032\0020\006¨\006\t"}, d2 = {"Lai/grazie/nlp/utils/vocabs/EnglishVocabulary$Companion;", "", "()V", "load", "Lai/grazie/nlp/utils/vocabs/EnglishVocabulary;", "content", "", "writeContent", "", "nlp-common"})
/*    */ @SourceDebugExtension({"SMAP\nEnglishVocabulary.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnglishVocabulary.kt\nai/grazie/nlp/utils/vocabs/EnglishVocabulary$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,26:1\n774#2:27\n865#2,2:28\n*S KotlinDebug\n*F\n+ 1 EnglishVocabulary.kt\nai/grazie/nlp/utils/vocabs/EnglishVocabulary$Companion\n*L\n14#1:27\n14#1:28,2\n*E\n"})
/*    */ public final class Companion {
/*    */   @NotNull
/*    */   public final EnglishVocabulary load(@NotNull String content) {
/*  8 */     Intrinsics.checkNotNullParameter(content, "content"); Set<String> words = writeContent(content);
/*  9 */     return new EnglishVocabulary(words);
/*    */   } private Companion() {}
/*    */   @NotNull
/*    */   public final Set<String> writeContent(@NotNull String content) {
/* 13 */     Intrinsics.checkNotNullParameter(content, "content"); Set<String> words = new LinkedHashSet();
/* 14 */     Iterable $this$filter$iv = StringsKt.lines(content); int $i$f$filter = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 27 */     Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 28 */     for (Object element$iv$iv : iterable1) { String it = (String)element$iv$iv; int $i$a$-filter-EnglishVocabulary$Companion$writeContent$1 = 0; if (!StringsKt.isBlank(it)) destination$iv$iv.add(element$iv$iv);  }
/* 29 */      for (String line : destination$iv$iv)
/*    */       words.add(line); 
/*    */     return words;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-common-jvm-0.4.32.jar!\ai\grazie\nl\\utils\vocabs\EnglishVocabulary$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */