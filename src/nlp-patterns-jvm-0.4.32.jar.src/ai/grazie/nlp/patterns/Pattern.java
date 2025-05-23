/*     */ package ai.grazie.nlp.patterns;@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\013\n\000\n\002\020\r\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\007\bf\030\000 \0252\0020\001:\004\023\024\025\026J\020\020\002\032\0020\0002\006\020\003\032\0020\004H\026J\b\020\005\032\0020\000H\026J\020\020\006\032\0020\0002\006\020\003\032\0020\004H\026J\b\020\007\032\0020\000H\026J\020\020\b\032\0020\t2\006\020\n\032\0020\013H\026J\020\020\f\032\0020\0002\006\020\r\032\0020\000H\026J\026\020\016\032\b\022\004\022\0020\0200\0172\006\020\n\032\0020\013H&J\020\020\021\032\0020\t2\006\020\n\032\0020\013H\026J\b\020\022\032\0020\000H\026ø\001\000\002\006\n\004\b!0\001¨\006\027À\006\001"}, d2 = {"Lai/grazie/nlp/patterns/Pattern;", "Lai/grazie/nlp/patterns/MatchPattern;", "after", "pattern", "Lkotlin/text/Regex;", "afterWordBoundary", "before", "beforeWordBoundary", "contains", "", "text", "", "exclude", "other", "find", "", "Lai/grazie/text/TextRange;", "matches", "withWordBoundariesAround", "After", "Before", "Companion", "Exclusion", "nlp-patterns"})
/*     */ @SourceDebugExtension({"SMAP\nPattern.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pattern.kt\nai/grazie/nlp/patterns/Pattern\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n1755#2,3:122\n*S KotlinDebug\n*F\n+ 1 Pattern.kt\nai/grazie/nlp/patterns/Pattern\n*L\n15#1:122,3\n*E\n"})
/*     */ public interface Pattern extends MatchPattern {
/*     */   @NotNull
/*     */   public static final Companion Companion = Companion.$$INSTANCE;
/*     */   
/*     */   @NotNull
/*     */   List<TextRange> find(@NotNull CharSequence paramCharSequence);
/*     */   
/*     */   default boolean contains(@NotNull CharSequence text) {
/*  11 */     Intrinsics.checkNotNullParameter(text, "text"); return !find(text).isEmpty();
/*     */   }
/*     */   
/*     */   default boolean matches(@NotNull CharSequence text) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'text'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: aload_1
/*     */     //   8: invokeinterface find : (Ljava/lang/CharSequence;)Ljava/util/List;
/*     */     //   13: astore_2
/*     */     //   14: aload_2
/*     */     //   15: checkcast java/util/Collection
/*     */     //   18: invokeinterface isEmpty : ()Z
/*     */     //   23: ifne -> 30
/*     */     //   26: iconst_1
/*     */     //   27: goto -> 31
/*     */     //   30: iconst_0
/*     */     //   31: ifeq -> 126
/*     */     //   34: aload_2
/*     */     //   35: checkcast java/lang/Iterable
/*     */     //   38: astore_3
/*     */     //   39: iconst_0
/*     */     //   40: istore #4
/*     */     //   42: aload_3
/*     */     //   43: instanceof java/util/Collection
/*     */     //   46: ifeq -> 65
/*     */     //   49: aload_3
/*     */     //   50: checkcast java/util/Collection
/*     */     //   53: invokeinterface isEmpty : ()Z
/*     */     //   58: ifeq -> 65
/*     */     //   61: iconst_0
/*     */     //   62: goto -> 119
/*     */     //   65: aload_3
/*     */     //   66: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   71: astore #5
/*     */     //   73: aload #5
/*     */     //   75: invokeinterface hasNext : ()Z
/*     */     //   80: ifeq -> 118
/*     */     //   83: aload #5
/*     */     //   85: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   90: astore #6
/*     */     //   92: aload #6
/*     */     //   94: checkcast ai/grazie/text/TextRange
/*     */     //   97: astore #7
/*     */     //   99: iconst_0
/*     */     //   100: istore #8
/*     */     //   102: aload #7
/*     */     //   104: aload_1
/*     */     //   105: invokestatic getRange : (Ljava/lang/CharSequence;)Lai/grazie/text/TextRange;
/*     */     //   108: invokevirtual covers : (Lai/grazie/text/TextRange;)Z
/*     */     //   111: ifeq -> 73
/*     */     //   114: iconst_1
/*     */     //   115: goto -> 119
/*     */     //   118: iconst_0
/*     */     //   119: ifeq -> 126
/*     */     //   122: iconst_1
/*     */     //   123: goto -> 127
/*     */     //   126: iconst_0
/*     */     //   127: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #14	-> 6
/*     */     //   #15	-> 14
/*     */     //   #15	-> 31
/*     */     //   #122	-> 42
/*     */     //   #123	-> 65
/*     */     //   #15	-> 102
/*     */     //   #123	-> 111
/*     */     //   #124	-> 118
/*     */     //   #15	-> 119
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   102	9	8	$i$a$-any-Pattern$matches$1	I
/*     */     //   99	12	7	it	Lai/grazie/text/TextRange;
/*     */     //   92	26	6	element$iv	Ljava/lang/Object;
/*     */     //   42	77	4	$i$f$any	I
/*     */     //   39	80	3	$this$any$iv	Ljava/lang/Iterable;
/*     */     //   14	114	2	ranges	Ljava/util/List;
/*     */     //   0	128	0	this	Lai/grazie/nlp/patterns/Pattern;
/*     */     //   0	128	1	text	Ljava/lang/CharSequence;
/*     */   }
/*     */   
/*     */   @NotNull
/*  19 */   default Pattern exclude(@NotNull Pattern other) { Intrinsics.checkNotNullParameter(other, "other"); return new Exclusion(this, other); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000\n\002\020\013\n\000\030\0002\0020\001B\025\022\006\020\002\032\0020\001\022\006\020\003\032\0020\001¢\006\002\020\004J\026\020\005\032\b\022\004\022\0020\0070\0062\006\020\b\032\0020\tH\026J\020\020\n\032\0020\0132\006\020\b\032\0020\tH\026R\016\020\003\032\0020\001X\004¢\006\002\n\000R\016\020\002\032\0020\001X\004¢\006\002\n\000¨\006\f"}, d2 = {"Lai/grazie/nlp/patterns/Pattern$Exclusion;", "Lai/grazie/nlp/patterns/Pattern;", "main", "exclude", "(Lai/grazie/nlp/patterns/Pattern;Lai/grazie/nlp/patterns/Pattern;)V", "find", "", "Lai/grazie/text/TextRange;", "text", "", "matches", "", "nlp-patterns"}) @SourceDebugExtension({"SMAP\nPattern.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pattern.kt\nai/grazie/nlp/patterns/Pattern$Exclusion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n774#2:122\n865#2,2:123\n*S KotlinDebug\n*F\n+ 1 Pattern.kt\nai/grazie/nlp/patterns/Pattern$Exclusion\n*L\n23#1:122\n23#1:123,2\n*E\n"}) public static final class Exclusion implements Pattern { @NotNull private final Pattern main; @NotNull
/*  20 */     private final Pattern exclude; public Exclusion(@NotNull Pattern main, @NotNull Pattern exclude) { this.main = main; this.exclude = exclude; }
/*     */     public boolean matches(@NotNull CharSequence text) { Intrinsics.checkNotNullParameter(text, "text");
/*  22 */       return (this.main.matches(text) && !this.exclude.matches(text)); } @NotNull public List<TextRange> find(@NotNull CharSequence text) { Intrinsics.checkNotNullParameter(text, "text"); List<TextRange> matches = this.main.find(text);
/*  23 */       Iterable<TextRange> $this$filter$iv = matches; int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 122 */       Iterable<TextRange> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 123 */       for (TextRange element$iv$iv : iterable1) { TextRange it = element$iv$iv; int $i$a$-filter-Pattern$Exclusion$find$1 = 0; if (!this.exclude.matches(text.subSequence(it.getStart(), it.getEndExclusive()))) destination$iv$iv.add(element$iv$iv);  }
/* 124 */        return (List)destination$iv$iv; } } @NotNull default Pattern before(@NotNull Regex pattern) { Intrinsics.checkNotNullParameter(pattern, "pattern"); return new Pattern$before$1(this, pattern); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\r\n\000\n\002\020\b\n\000*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"ai/grazie/nlp/patterns/Pattern$before$1", "Lai/grazie/nlp/patterns/Pattern$Before;", "suffixMatches", "", "text", "", "at", "", "nlp-patterns"}) public static final class Pattern$before$1 extends Before { Pattern$before$1(Pattern $receiver, Regex $pattern) { super($receiver); } public boolean suffixMatches(CharSequence text, int at) { Intrinsics.checkNotNullParameter(text, "text"); return this.$pattern.matchesAt(text, at); } } @NotNull default Pattern beforeWordBoundary() { return new Pattern$beforeWordBoundary$1(this); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\r\n\000\n\002\020\b\n\000*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"ai/grazie/nlp/patterns/Pattern$beforeWordBoundary$1", "Lai/grazie/nlp/patterns/Pattern$Before;", "suffixMatches", "", "text", "", "at", "", "nlp-patterns"}) public static final class Pattern$beforeWordBoundary$1 extends Before { Pattern$beforeWordBoundary$1(Pattern $receiver) { super($receiver); } public boolean suffixMatches(CharSequence text, int at) { Intrinsics.checkNotNullParameter(text, "text"); return Pattern.Companion.isWordBoundaryBefore(text, at); } } @NotNull default Pattern after(@NotNull Regex pattern) { Intrinsics.checkNotNullParameter(pattern, "pattern"); return new After(this, pattern); } @NotNull default Pattern afterWordBoundary() { return new Pattern$afterWordBoundary$1(); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000\n\002\020\013\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026J\020\020\007\032\0020\b2\006\020\005\032\0020\006H\026¨\006\t"}, d2 = {"ai/grazie/nlp/patterns/Pattern$afterWordBoundary$1", "Lai/grazie/nlp/patterns/Pattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "matches", "", "nlp-patterns"}) @SourceDebugExtension({"SMAP\nPattern.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pattern.kt\nai/grazie/nlp/patterns/Pattern$afterWordBoundary$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n774#2:122\n865#2,2:123\n*S KotlinDebug\n*F\n+ 1 Pattern.kt\nai/grazie/nlp/patterns/Pattern$afterWordBoundary$1\n*L\n58#1:122\n58#1:123,2\n*E\n"}) public static final class Pattern$afterWordBoundary$1 implements Pattern { public List<TextRange> find(CharSequence text) { Intrinsics.checkNotNullParameter(text, "text"); Iterable<TextRange> $this$filter$iv = Pattern.this.find(text); int $i$f$filter = 0; Iterable<TextRange> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0; for (TextRange element$iv$iv : iterable1) { TextRange it = element$iv$iv; int $i$a$-filter-Pattern$afterWordBoundary$1$find$1 = 0; if (Pattern.Companion.isWordBoundaryBefore(text, it.getStart())) destination$iv$iv.add(element$iv$iv);  }  return (List)destination$iv$iv; } public boolean matches(CharSequence text) { Intrinsics.checkNotNullParameter(text, "text"); return Pattern.this.matches(text); } } @NotNull default Pattern withWordBoundariesAround() { return beforeWordBoundary().afterWordBoundary(); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\b\005\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000\n\002\020\013\n\002\b\002\n\002\020\b\n\000\b\"\030\0002\0020\001B\r\022\006\020\002\032\0020\001¢\006\002\020\003J\026\020\006\032\b\022\004\022\0020\b0\0072\006\020\t\032\0020\nH\026J\020\020\013\032\0020\f2\006\020\t\032\0020\nH\026J\030\020\r\032\0020\f2\006\020\t\032\0020\n2\006\020\016\032\0020\017H&R\021\020\002\032\0020\001¢\006\b\n\000\032\004\b\004\020\005¨\006\020"}, d2 = {"Lai/grazie/nlp/patterns/Pattern$Before;", "Lai/grazie/nlp/patterns/Pattern;", "pattern", "(Lai/grazie/nlp/patterns/Pattern;)V", "getPattern", "()Lai/grazie/nlp/patterns/Pattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "matches", "", "suffixMatches", "at", "", "nlp-patterns"}) @SourceDebugExtension({"SMAP\nPattern.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pattern.kt\nai/grazie/nlp/patterns/Pattern$Before\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n774#2:122\n865#2,2:123\n*S KotlinDebug\n*F\n+ 1 Pattern.kt\nai/grazie/nlp/patterns/Pattern$Before\n*L\n74#1:122\n74#1:123,2\n*E\n"}) private static abstract class Before implements Pattern { @NotNull private final Pattern pattern; public Before(@NotNull Pattern pattern) { this.pattern = pattern; } @NotNull public final Pattern getPattern() { return this.pattern; } @NotNull public List<TextRange> find(@NotNull CharSequence text) { Intrinsics.checkNotNullParameter(text, "text"); List<TextRange> ranges = this.pattern.find(text); if (ranges.isEmpty()) return CollectionsKt.emptyList();  Iterable<TextRange> $this$filter$iv = ranges; int $i$f$filter = 0; Iterable<TextRange> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0; for (TextRange element$iv$iv : iterable1) { TextRange range = element$iv$iv; int $i$a$-filter-Pattern$Before$find$1 = 0; if (suffixMatches(text, range.getEndExclusive())) destination$iv$iv.add(element$iv$iv);  }  return (List)destination$iv$iv; } public boolean matches(@NotNull CharSequence text) { Intrinsics.checkNotNullParameter(text, "text"); return (this.pattern.matches(text) && suffixMatches(text, text.length())); } public abstract boolean suffixMatches(@NotNull CharSequence param1CharSequence, int param1Int); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\006\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000\n\002\020\013\n\000\b\002\030\0002\0020\001B\025\022\006\020\002\032\0020\001\022\006\020\003\032\0020\004¢\006\002\020\005J\026\020\n\032\b\022\004\022\0020\f0\0132\006\020\r\032\0020\016H\026J\020\020\017\032\0020\0202\006\020\r\032\0020\016H\026R\021\020\002\032\0020\001¢\006\b\n\000\032\004\b\006\020\007R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\b\020\t¨\006\021"}, d2 = {"Lai/grazie/nlp/patterns/Pattern$After;", "Lai/grazie/nlp/patterns/Pattern;", "pattern", "prev", "Lkotlin/text/Regex;", "(Lai/grazie/nlp/patterns/Pattern;Lkotlin/text/Regex;)V", "getPattern", "()Lai/grazie/nlp/patterns/Pattern;", "getPrev", "()Lkotlin/text/Regex;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "matches", "", "nlp-patterns"}) @SourceDebugExtension({"SMAP\nPattern.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pattern.kt\nai/grazie/nlp/patterns/Pattern$After\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n774#2:122\n865#2,2:123\n*S KotlinDebug\n*F\n+ 1 Pattern.kt\nai/grazie/nlp/patterns/Pattern$After\n*L\n90#1:122\n90#1:123,2\n*E\n"}) private static final class After implements Pattern { @NotNull private final Pattern pattern; @NotNull private final Regex prev; public After(@NotNull Pattern pattern, @NotNull Regex prev) { this.pattern = pattern; this.prev = prev; } @NotNull public final Pattern getPattern() { return this.pattern; } @NotNull public final Regex getPrev() { return this.prev; } @NotNull public List<TextRange> find(@NotNull CharSequence text) { Intrinsics.checkNotNullParameter(text, "text"); List<TextRange> ranges = this.pattern.find(text); if (ranges.isEmpty()) return CollectionsKt.emptyList();  Set prefixMatchEnds = SequencesKt.toSet(SequencesKt.map(Regex.findAll$default(this.prev, text, 0, 2, null), Pattern$After$find$prefixMatchEnds$1.INSTANCE)); Iterable<TextRange> $this$filter$iv = ranges; int $i$f$filter = 0; Iterable<TextRange> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0; for (TextRange element$iv$iv : iterable1) { TextRange range = element$iv$iv; int $i$a$-filter-Pattern$After$find$1 = 0; if (prefixMatchEnds.contains(Integer.valueOf(range.getStart()))) destination$iv$iv.add(element$iv$iv);  }  return (List)destination$iv$iv; }
/*     */ 
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke", "(Lkotlin/text/MatchResult;)Ljava/lang/Integer;"})
/*     */     static final class Pattern$After$find$prefixMatchEnds$1 extends Lambda implements Function1<MatchResult, Integer> {
/*     */       public static final Pattern$After$find$prefixMatchEnds$1 INSTANCE = new Pattern$After$find$prefixMatchEnds$1();
/*     */       
/*     */       Pattern$After$find$prefixMatchEnds$1() {
/*     */         super(1);
/*     */       }
/*     */       
/*     */       public final Integer invoke(MatchResult it) {
/*     */         Intrinsics.checkNotNullParameter(it, "it");
/*     */         return Integer.valueOf(it.getRange().getLast() + 1);
/*     */       }
/*     */     }
/*     */     
/*     */     public boolean matches(@NotNull CharSequence text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       if (this.pattern.matches(text)) {
/*     */         this.prev.matchAt(text, 0).getRange();
/*     */         if ((this.prev.matchAt(text, 0) != null && this.prev.matchAt(text, 0).getRange() != null) ? ((RangesKt.getLength(this.prev.matchAt(text, 0).getRange()) == 0)) : false);
/*     */       } 
/*     */       return false;
/*     */     } }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\013\n\000\n\002\020\r\n\000\n\002\020\b\n\002\b\004\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\030\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\002J\030\020\t\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\007J\035\020\n\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\000¢\006\002\b\013¨\006\f"}, d2 = {"Lai/grazie/nlp/patterns/Pattern$Companion;", "", "()V", "isInnerApostrophe", "", "text", "", "offset", "", "isWordBoundaryBefore", "isWordBoundaryOrApostrophe", "isWordBoundaryOrApostrophe$nlp_patterns", "nlp-patterns"})
/*     */   public static final class Companion {
/*     */     @JvmStatic
/*     */     public final boolean isWordBoundaryBefore(@NotNull CharSequence text, int offset) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       if (offset == 0 || offset == text.length())
/*     */         return true; 
/*     */       char c1 = text.charAt(offset - 1);
/*     */       char c2 = text.charAt(offset);
/*     */       if (isInnerApostrophe(text, offset) || isInnerApostrophe(text, offset - 1))
/*     */         return false; 
/*     */       return (Character.isLetterOrDigit(c1) != Character.isLetterOrDigit(c2) || CharsKt.isWhitespace(c1) != CharsKt.isWhitespace(c2) || (c1 != c2 && CharUtils.INSTANCE.isPunctuation(c1) && CharUtils.INSTANCE.isPunctuation(c2)));
/*     */     }
/*     */     
/*     */     private final boolean isInnerApostrophe(CharSequence text, int offset) {
/*     */       return (Symbols.INSTANCE.getApostrophes().contains(Character.valueOf(text.charAt(offset))) && text.length() > offset + 1 && Character.isLetter(text.charAt(offset + 1)) && offset > 0 && Character.isLetter(text.charAt(offset - 1)));
/*     */     }
/*     */     
/*     */     public final boolean isWordBoundaryOrApostrophe$nlp_patterns(@NotNull CharSequence text, int offset) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       return (isWordBoundaryBefore(text, offset) || isInnerApostrophe(text, offset));
/*     */     }
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   static boolean isWordBoundaryBefore(@NotNull CharSequence text, int offset) {
/*     */     return Companion.isWordBoundaryBefore(text, offset);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\Pattern.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */