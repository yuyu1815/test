/*    */ package ai.grazie.nlp.tokenizer.retokenizer;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\002\b\002\b\026\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J$\020\t\032\b\022\004\022\0020\0130\n2\006\020\f\032\0020\r2\f\020\016\032\b\022\004\022\0020\0130\nH\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\b¨\006\017"}, d2 = {"Lai/grazie/nlp/tokenizer/retokenizer/PatternRetokenizer;", "Lai/grazie/nlp/tokenizer/retokenizer/Retokenizer;", "pattern", "Lai/grazie/nlp/patterns/Pattern;", "tokenizer", "Lai/grazie/nlp/tokenizer/NonDestructiveTokenizer;", "(Lai/grazie/nlp/patterns/Pattern;Lai/grazie/nlp/tokenizer/NonDestructiveTokenizer;)V", "getPattern", "()Lai/grazie/nlp/patterns/Pattern;", "retokenize", "", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "text", "", "tokens", "nlp-tokenizer"})
/*    */ @SourceDebugExtension({"SMAP\nPatternRetokenizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PatternRetokenizer.kt\nai/grazie/nlp/tokenizer/retokenizer/PatternRetokenizer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,15:1\n1#2:16\n1557#3:17\n1628#3,3:18\n1053#3:21\n*S KotlinDebug\n*F\n+ 1 PatternRetokenizer.kt\nai/grazie/nlp/tokenizer/retokenizer/PatternRetokenizer\n*L\n12#1:17\n12#1:18,3\n12#1:21\n*E\n"})
/*    */ public class PatternRetokenizer extends Retokenizer {
/*  8 */   public PatternRetokenizer(@NotNull Pattern pattern, @NotNull NonDestructiveTokenizer tokenizer) { super(tokenizer); this.pattern = pattern; } @NotNull private final Pattern pattern; @NotNull public final Pattern getPattern() { return this.pattern; } @NotNull
/*    */   public List<Tokenizer.Token> retokenize(@NotNull String text, @NotNull List tokens) { Object object;
/* 10 */     Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(tokens, "tokens"); List list1 = CollectionsKt.toList(this.pattern.find(text)), it = list1;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 16 */     int $i$a$-takeIf-PatternRetokenizer$retokenize$matches$1 = 0; if (((!it.isEmpty()) ? list1 : null) == null) { (!it.isEmpty()) ? list1 : null; return CollectionsKt.emptyList(); }
/* 17 */      Iterable $this$map$iv = (Iterable)object; int $i$f$map = 0; Iterable iterable1 = $this$map$iv; Collection<Tokenizer.Token> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 18 */     for (Object item$iv$iv : iterable1) {
/* 19 */       TextRange textRange = (TextRange)item$iv$iv; Collection<Tokenizer.Token> collection = destination$iv$iv; int $i$a$-map-PatternRetokenizer$retokenize$1 = 0; collection.add(new Tokenizer.Token(new Text(textRange.substring(text)), textRange));
/* 20 */     }  $this$map$iv = destination$iv$iv; int $i$f$sortedBy = 0;
/* 21 */     return CollectionsKt.sortedWith($this$map$iv, new PatternRetokenizer$retokenize$$inlined$sortedBy$1()); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\retokenizer\PatternRetokenizer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */