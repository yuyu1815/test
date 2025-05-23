/*    */ package ai.grazie.nlp.tokenizer.word;
/*    */ import java.util.Collection;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\f\n\000\n\002\020 \n\002\020\016\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\034\020\005\032\b\022\004\022\0020\0070\0062\f\020\b\032\b\022\004\022\0020\t0\006H\026J\022\020\n\032\b\022\004\022\0020\f0\013*\0020\fH\007J\022\020\r\032\b\022\004\022\0020\0070\013*\0020\fH\007R\016\020\003\032\0020\004X\004¢\006\002\n\000¨\006\016"}, d2 = {"Lai/grazie/nlp/tokenizer/word/WhitespaceWordTokenizer;", "Lai/grazie/nlp/tokenizer/sequence/SequenceTokenizer;", "()V", "spaces", "Lkotlin/text/Regex;", "tokenizeAsSequence", "Lkotlin/sequences/Sequence;", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "text", "", "words", "", "", "wordsWithRanges", "nlp-tokenizer"})
/*    */ @SourceDebugExtension({"SMAP\nWhitespaceWordTokenizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhitespaceWordTokenizer.kt\nai/grazie/nlp/tokenizer/word/WhitespaceWordTokenizer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n1557#2:28\n1628#2,3:29\n774#2:32\n865#2,2:33\n*S KotlinDebug\n*F\n+ 1 WhitespaceWordTokenizer.kt\nai/grazie/nlp/tokenizer/word/WhitespaceWordTokenizer\n*L\n19#1:28\n19#1:29,3\n19#1:32\n19#1:33,2\n*E\n"})
/*    */ public final class WhitespaceWordTokenizer implements SequenceTokenizer {
/*    */   @NotNull
/*  9 */   public static final WhitespaceWordTokenizer INSTANCE = new WhitespaceWordTokenizer(); @NotNull private static final Regex spaces = new Regex("\\s");
/*    */   
/*    */   @NotNull
/* 12 */   public Sequence<Tokenizer.Token> tokenizeAsSequence(@NotNull Sequence text) { Intrinsics.checkNotNullParameter(text, "text"); Regex[] arrayOfRegex = new Regex[1]; arrayOfRegex[0] = spaces; return SequencesKt.map(SplitKt.splitWithRanges$default(text, arrayOfRegex, false, 2, null), WhitespaceWordTokenizer$tokenizeAsSequence$1.INSTANCE); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\026\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\016\n\000\020\000\032\0020\0012\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003H\n¢\006\002\b\006"}, d2 = {"<anonymous>", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "it", "Lkotlin/Pair;", "Lai/grazie/text/TextRange;", "", "invoke"}) static final class WhitespaceWordTokenizer$tokenizeAsSequence$1 extends Lambda implements Function1<Pair<? extends TextRange, ? extends String>, Tokenizer.Token> { public static final WhitespaceWordTokenizer$tokenizeAsSequence$1 INSTANCE = new WhitespaceWordTokenizer$tokenizeAsSequence$1(); WhitespaceWordTokenizer$tokenizeAsSequence$1() { super(1); } public final Tokenizer.Token invoke(Pair it) { Intrinsics.checkNotNullParameter(it, "it"); return new Tokenizer.Token(new Text((String)it.getSecond()), (TextRange)it.getFirst()); }
/*    */      }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "Use StandardWordTokenizer.words() instead", replaceWith = @ReplaceWith(expression = "words()", imports = {"ai.grazie.nlp.tokenizer.word.StandardWordTokenizer.words"}))
/*    */   @NotNull
/*    */   public final List<String> words(@NotNull String $this$words) {
/* 19 */     Intrinsics.checkNotNullParameter($this$words, "<this>"); Iterable $this$map$iv = tokenize($this$words); int $i$f$map = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 28 */     Iterable iterable1 = $this$map$iv; Collection<String> collection = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 29 */     for (Object item$iv$iv : iterable1) {
/* 30 */       Tokenizer.Token token = (Tokenizer.Token)item$iv$iv; Collection<String> collection1 = collection; int $i$a$-map-WhitespaceWordTokenizer$words$1 = 0; collection1.add(StringsKt.trim(token.getToken()).toString());
/* 31 */     }  $this$map$iv = collection; int $i$f$filter = 0;
/* 32 */     Iterable $this$mapTo$iv$iv = $this$map$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 33 */     for (Object element$iv$iv : $this$mapTo$iv$iv) { String it = (String)element$iv$iv; int $i$a$-filter-WhitespaceWordTokenizer$words$2 = 0; if (!StringsKt.isBlank(it)) destination$iv$iv.add(element$iv$iv);  }
/* 34 */      return (List)destination$iv$iv;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "Use StandardWordTokenizer.wordsWithRanges() instead", replaceWith = @ReplaceWith(expression = "wordsWithRanges()", imports = {"ai.grazie.nlp.tokenizer.word.StandardWordTokenizer.wordsWithRanges"}))
/*    */   @NotNull
/*    */   public final List<Tokenizer.Token> wordsWithRanges(@NotNull String $this$wordsWithRanges) {
/*    */     Intrinsics.checkNotNullParameter($this$wordsWithRanges, "<this>");
/*    */     return tokenize($this$wordsWithRanges);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\word\WhitespaceWordTokenizer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */