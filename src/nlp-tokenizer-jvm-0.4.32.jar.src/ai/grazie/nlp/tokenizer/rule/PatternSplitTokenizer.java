/*    */ package ai.grazie.nlp.tokenizer.rule;
/*    */ 
/*    */ import ai.grazie.text.TextRange;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\r\n\000\n\002\030\002\n\000\n\002\020 \n\000\n\002\030\002\n\002\030\002\n\000\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\020\006\032\004\030\0010\003¢\006\002\020\007J\030\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0020\021H\002J\024\020\022\032\b\022\004\022\0020\0210\0232\006\020\016\032\0020\017J\026\020\024\032\b\022\004\022\0020\0250\0232\006\020\016\032\0020\026H\026R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\b\020\tR\020\020\006\032\004\030\0010\003X\004¢\006\002\n\000R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013¨\006\027"}, d2 = {"Lai/grazie/nlp/tokenizer/rule/PatternSplitTokenizer;", "Lai/grazie/nlp/tokenizer/NonDestructiveTokenizer;", "pattern", "Lai/grazie/nlp/patterns/Pattern;", "direction", "Lai/grazie/Direction;", "ignore", "(Lai/grazie/nlp/patterns/Pattern;Lai/grazie/Direction;Lai/grazie/nlp/patterns/Pattern;)V", "getDirection", "()Lai/grazie/Direction;", "getPattern", "()Lai/grazie/nlp/patterns/Pattern;", "isEdgeMatch", "", "text", "", "range", "Lai/grazie/text/TextRange;", "tokenRanges", "", "tokenize", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "Lai/grazie/text/Text;", "nlp-tokenizer"})
/*    */ @SourceDebugExtension({"SMAP\nPatternSplitTokenizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PatternSplitTokenizer.kt\nai/grazie/nlp/tokenizer/rule/PatternSplitTokenizer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n1557#2:46\n1628#2,3:47\n827#2:50\n855#2:51\n1755#2,3:52\n856#2:55\n1053#2:56\n774#2:57\n865#2,2:58\n*S KotlinDebug\n*F\n+ 1 PatternSplitTokenizer.kt\nai/grazie/nlp/tokenizer/rule/PatternSplitTokenizer\n*L\n17#1:46\n17#1:47,3\n27#1:50\n27#1:51\n27#1:52,3\n27#1:55\n27#1:56\n39#1:57\n39#1:58,2\n*E\n"})
/*    */ public final class PatternSplitTokenizer implements NonDestructiveTokenizer {
/*    */   @NotNull
/*    */   private final Pattern pattern;
/*    */   @NotNull
/*    */   private final Direction direction;
/*    */   @Nullable
/*    */   private final Pattern ignore;
/*    */   
/* 15 */   public PatternSplitTokenizer(@NotNull Pattern pattern, @NotNull Direction direction, @Nullable Pattern ignore) { this.pattern = pattern; this.direction = direction; this.ignore = ignore; } @NotNull public final Pattern getPattern() { return this.pattern; } @NotNull public final Direction getDirection() { return this.direction; }
/*    */   @NotNull
/* 17 */   public List<Tokenizer.Token> tokenize(@NotNull Text text) { Intrinsics.checkNotNullParameter(text, "text"); Iterable<TextRange> $this$map$iv = tokenRanges((CharSequence)text); int $i$f$map = 0;
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
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 46 */     Iterable<TextRange> iterable1 = $this$map$iv; Collection<Tokenizer.Token> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 47 */     for (TextRange item$iv$iv : iterable1) {
/* 48 */       TextRange textRange1 = item$iv$iv; Collection<Tokenizer.Token> collection = destination$iv$iv; int $i$a$-map-PatternSplitTokenizer$tokenize$1 = 0; collection.add(new Tokenizer.Token(text.substring(textRange1), textRange1));
/* 49 */     }  return (List<Tokenizer.Token>)destination$iv$iv; } @NotNull public final List<TextRange> tokenRanges(@NotNull CharSequence text) { List list1; Intrinsics.checkNotNullParameter(text, "text"); List<TextRange> rawMatches = this.pattern.find(text); if (rawMatches.isEmpty() || (rawMatches.size() == 1 && isEdgeMatch(text, rawMatches.get(0)))) return ((text.length() == 0)) ? CollectionsKt.emptyList() : CollectionsKt.listOf(new TextRange(0, text.length()));  if (this.ignore == null || this.ignore.find(text) == null)
/* 50 */       this.ignore.find(text);  List ignore = CollectionsKt.emptyList(); Iterable<TextRange> $this$filterNot$iv = rawMatches; int $i$f$filterNot = 0; Iterable<TextRange> iterable1 = $this$filterNot$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$filterNotTo = 0;
/* 51 */     for (TextRange element$iv$iv : iterable1) { TextRange match = element$iv$iv; int $i$a$-filterNot-PatternSplitTokenizer$tokenRanges$matches$1 = 0;
/*    */       Iterable $this$any$iv = ignore;
/*    */       int $i$f$any = 0; }
/*    */     
/* 55 */     $this$filterNot$iv = destination$iv$iv; int $i$f$sortedBy = 0;
/* 56 */     List matches = CollectionsKt.sortedWith($this$filterNot$iv, new PatternSplitTokenizer$tokenRanges$$inlined$sortedBy$1()); ArrayList<TextRange> ranges = new ArrayList(); int start = 0; for (TextRange match : matches) { switch (WhenMappings.$EnumSwitchMapping$0[this.direction.ordinal()]) { case 1: case 2: 
/* 57 */         default: throw new NoWhenBranchMatchedException(); }  List list = this.ignore.find(text); ranges.add(new TextRange(start, list)); list1 = list; }  ranges.add(new TextRange(list1, text.length())); Iterable<TextRange> $this$filter$iv = ranges; int $i$f$filter = 0; Iterable<TextRange> iterable2 = $this$filter$iv; Collection<Object> collection = new ArrayList(); int $i$f$filterTo = 0;
/* 58 */     for (TextRange element$iv$iv : iterable2) { TextRange it = element$iv$iv; int $i$a$-filter-PatternSplitTokenizer$tokenRanges$1 = 0; if (it.isNotEmpty()) collection.add(element$iv$iv);  }
/* 59 */      return (List)collection; }
/*    */ 
/*    */   
/*    */   private final boolean isEdgeMatch(CharSequence text, TextRange range) {
/*    */     return ((this.direction == Direction.Right && range.getEndExclusive() == text.length()) || (this.direction == Direction.Left && range.getStart() == 0));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\rule\PatternSplitTokenizer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */