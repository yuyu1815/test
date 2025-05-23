/*    */ package ai.grazie.nlp.tokenizer.word;
/*    */ import ai.grazie.nlp.tokenizer.NonDestructiveTokenizer;
/*    */ import ai.grazie.nlp.tokenizer.Tokenizer;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\026\020\005\032\b\022\004\022\0020\0070\0062\006\020\b\032\0020\tH\026J\020\020\n\032\b\022\004\022\0020\t0\006*\0020\tJ\020\020\013\032\b\022\004\022\0020\0070\006*\0020\tR\016\020\003\032\0020\004X\004¢\006\002\n\000¨\006\f"}, d2 = {"Lai/grazie/nlp/tokenizer/word/StandardWordTokenizer;", "Lai/grazie/nlp/tokenizer/Tokenizer;", "()V", "tokenizer", "Lai/grazie/nlp/tokenizer/NonDestructiveTokenizer;", "tokenize", "", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "text", "", "words", "wordsWithRanges", "nlp-tokenizer"})
/*    */ @SourceDebugExtension({"SMAP\nStandardWordTokenizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardWordTokenizer.kt\nai/grazie/nlp/tokenizer/word/StandardWordTokenizer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n1557#2:33\n1628#2,3:34\n774#2:37\n865#2,2:38\n*S KotlinDebug\n*F\n+ 1 StandardWordTokenizer.kt\nai/grazie/nlp/tokenizer/word/StandardWordTokenizer\n*L\n29#1:33\n29#1:34,3\n29#1:37\n29#1:38,2\n*E\n"})
/*    */ public final class StandardWordTokenizer implements Tokenizer {
/*    */   @NotNull
/* 16 */   public static final StandardWordTokenizer INSTANCE = new StandardWordTokenizer(); @NotNull private static final NonDestructiveTokenizer tokenizer = PatternRetokenizers.INSTANCE.default(
/* 17 */       (NonDestructiveTokenizer)new QuotesRetokenizer(
/* 18 */         new HeuristicWordTokenizer(
/* 19 */           false, 
/* 20 */           false)));
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public List<Tokenizer.Token> tokenize(@NotNull String text) {
/* 26 */     Intrinsics.checkNotNullParameter(text, "text"); return tokenizer.tokenize(text);
/*    */   } @NotNull
/*    */   public final List<String> words(@NotNull String $this$words) {
/* 29 */     Intrinsics.checkNotNullParameter($this$words, "<this>"); Iterable $this$map$iv = WhitespaceWordTokenizer.INSTANCE.tokenize($this$words); int $i$f$map = 0;
/*    */ 
/*    */ 
/*    */     
/* 33 */     Iterable iterable1 = $this$map$iv; Collection<String> collection = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 34 */     for (Object item$iv$iv : iterable1) {
/* 35 */       Tokenizer.Token token = (Tokenizer.Token)item$iv$iv; Collection<String> collection1 = collection; int $i$a$-map-StandardWordTokenizer$words$1 = 0; collection1.add(StringsKt.trim(token.getToken()).toString());
/* 36 */     }  $this$map$iv = collection; int $i$f$filter = 0;
/* 37 */     Iterable $this$mapTo$iv$iv = $this$map$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 38 */     for (Object element$iv$iv : $this$mapTo$iv$iv) { String it = (String)element$iv$iv; int $i$a$-filter-StandardWordTokenizer$words$2 = 0; if (!StringsKt.isBlank(it)) destination$iv$iv.add(element$iv$iv);  }
/* 39 */      return (List)destination$iv$iv;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<Tokenizer.Token> wordsWithRanges(@NotNull String $this$wordsWithRanges) {
/*    */     Intrinsics.checkNotNullParameter($this$wordsWithRanges, "<this>");
/*    */     return WhitespaceWordTokenizer.INSTANCE.tokenize($this$wordsWithRanges);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\word\StandardWordTokenizer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */