/*     */ package ai.grazie.nlp.tokenizer.sentence;
/*     */ 
/*     */ import ai.grazie.Direction;
/*     */ import ai.grazie.nlp.langs.Language;
/*     */ import ai.grazie.nlp.patterns.AggregatedPattern;
/*     */ import ai.grazie.nlp.patterns.Pattern;
/*     */ import ai.grazie.nlp.patterns.RegexPattern;
/*     */ import ai.grazie.nlp.patterns.ext.AbbreviationPatterns;
/*     */ import ai.grazie.nlp.patterns.standard.LikelyPatterns;
/*     */ import ai.grazie.nlp.patterns.standard.StrictPatterns;
/*     */ import ai.grazie.nlp.tokenizer.Tokenizer;
/*     */ import ai.grazie.nlp.tokenizer.rule.PatternSplitTokenizer;
/*     */ import ai.grazie.nlp.utils.normalization.UnicodePunctuationNormalizer;
/*     */ import ai.grazie.text.Text;
/*     */ import ai.grazie.text.TextRange;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.CharsKt;
/*     */ import kotlin.text.MatchResult;
/*     */ import kotlin.text.Regex;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000K\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000\n\002\030\002\n\002\030\002\n\002\b\002*\001\016\030\000 \0302\0020\001:\001\030B\023\b\027\022\n\b\002\020\002\032\004\030\0010\003¢\006\002\020\004B\031\022\n\b\002\020\002\032\004\030\0010\003\022\006\020\005\032\0020\006¢\006\002\020\007J\025\020\r\032\0020\0162\006\020\002\032\0020\003H\002¢\006\002\020\017J\024\020\020\032\b\022\004\022\0020\0220\0212\006\020\023\032\0020\024J\026\020\025\032\b\022\004\022\0020\0260\0212\006\020\023\032\0020\027H\026R\016\020\b\032\0020\tX\004¢\006\002\n\000R\020\020\n\032\004\030\0010\013X\004¢\006\002\n\000R\016\020\f\032\0020\013X\004¢\006\002\n\000¨\006\031"}, d2 = {"Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer;", "Lai/grazie/nlp/tokenizer/Tokenizer;", "splitByNewLinesNumber", "", "(Ljava/lang/Integer;)V", "language", "Lai/grazie/nlp/langs/Language;", "(Ljava/lang/Integer;Lai/grazie/nlp/langs/Language;)V", "ignore", "Lai/grazie/nlp/patterns/AggregatedPattern;", "newLineTokenizer", "Lai/grazie/nlp/tokenizer/rule/PatternSplitTokenizer;", "punctuationTokenizer", "newLinesPattern", "ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$newLinesPattern$1", "(I)Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$newLinesPattern$1;", "tokenRanges", "", "Lai/grazie/text/TextRange;", "text", "", "tokenize", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "Lai/grazie/text/Text;", "Companion", "nlp-tokenizer"})
/*     */ @SourceDebugExtension({"SMAP\nStandardSentenceTokenizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardSentenceTokenizer.kt\nai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,197:1\n1557#2:198\n1628#2,3:199\n1368#2:202\n1454#2,2:203\n1557#2:205\n1628#2,3:206\n1456#2,3:209\n*S KotlinDebug\n*F\n+ 1 StandardSentenceTokenizer.kt\nai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer\n*L\n185#1:198\n185#1:199,3\n191#1:202\n191#1:203,2\n192#1:205\n192#1:206,3\n191#1:209,3\n*E\n"})
/*     */ public final class StandardSentenceTokenizer
/*     */   implements Tokenizer
/*     */ {
/*     */   public StandardSentenceTokenizer(@Nullable Integer splitByNewLinesNumber, @NotNull Language language) {
/* 163 */     this.newLineTokenizer = (splitByNewLinesNumber == null) ? null : new PatternSplitTokenizer((Pattern)newLinesPattern(splitByNewLinesNumber.intValue()), Direction.Right, null);
/*     */ 
/*     */     
/* 166 */     Pattern[] arrayOfPattern = new Pattern[15]; arrayOfPattern[0] = (Pattern)Parenthetical; arrayOfPattern[1] = Ellipsis; arrayOfPattern[2] = (Pattern)QuotedStuff; arrayOfPattern[3] = 
/* 167 */       LikelyPatterns.NameInitials; arrayOfPattern[4] = LikelyPatterns.PunctuationOperator; arrayOfPattern[5] = LikelyPatterns.IsEmail;
/* 168 */     arrayOfPattern[6] = AbbreviationPatterns.forSentenceTokenization(language);
/* 169 */     arrayOfPattern[7] = (language == Language.UNKNOWN || language == Language.GERMAN) ? LikelyPatterns.IsGermanOrdinal : null;
/* 170 */     arrayOfPattern[8] = (language == Language.UNKNOWN || language == Language.GERMAN) ? LikelyPatterns.IsGermanOrdinalAfterNames : null;
/* 171 */     arrayOfPattern[9] = (language == Language.UNKNOWN || language == Language.GERMAN) ? LikelyPatterns.IsGermanDateWithDot : null;
/* 172 */     arrayOfPattern[10] = LikelyPatterns.IsIPv4; arrayOfPattern[11] = LikelyPatterns.IsURL; arrayOfPattern[12] = LikelyPatterns.IsFilePath; arrayOfPattern[13] = (Pattern)StrictPatterns.INSTANCE.getIsUUID(); arrayOfPattern[14] = LikelyPatterns.IsDotInBashCommand;
/*     */     
/*     */     this.ignore = new AggregatedPattern(CollectionsKt.listOfNotNull((Object[])arrayOfPattern));
/* 175 */     this.punctuationTokenizer = new PatternSplitTokenizer(endPunctuation, Direction.Right, (Pattern)this.ignore);
/*     */   } @Deprecated(message = "Specify the language")
/*     */   public StandardSentenceTokenizer(@Nullable Integer splitByNewLinesNumber) { this(splitByNewLinesNumber, Language.UNKNOWN); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\b\003\n\002\b\003\n\002\b\003\n\002\020\016\n\002\b\002\n\002\b\006\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\004\t\f\017\025\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\035\032\0020\0042\006\020\036\032\0020\037H\007J\b\020 \032\0020!H\002J\b\020\"\032\0020#H\002R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007R\020\020\b\032\0020\tX\004¢\006\004\n\002\020\nR\020\020\013\032\0020\fX\004¢\006\004\n\002\020\rR\020\020\016\032\0020\017X\004¢\006\004\n\002\020\020R\016\020\021\032\0020\022XT¢\006\002\n\000R\016\020\023\032\0020\022XT¢\006\002\n\000R\020\020\024\032\0020\025X\004¢\006\004\n\002\020\026R\016\020\027\032\0020\022X\004¢\006\002\n\000R\016\020\030\032\0020\022X\004¢\006\002\n\000R\016\020\031\032\0020\022X\004¢\006\002\n\000R\016\020\032\032\0020\033X\004¢\006\002\n\000R\016\020\034\032\0020\022XT¢\006\002\n\000¨\006$"}, d2 = {"Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion;", "", "()V", "Default", "Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer;", "getDefault$annotations", "getDefault", "()Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer;", "Ellipsis", "ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$Ellipsis$1$1", "Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$Ellipsis$1$1;", "Parenthetical", "ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$Parenthetical$1", "Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$Parenthetical$1;", "QuotedStuff", "ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$QuotedStuff$1", "Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$QuotedStuff$1;", "braceBullet", "", "braceBulletContents", "endPunctuation", "ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$endPunctuation$1", "Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$endPunctuation$1;", "normalSentenceEnd", "quotes", "romanBullet", "sentenceContinuation", "Lkotlin/text/Regex;", "spaceOrEnd", "defaultFor", "language", "Lai/grazie/nlp/langs/Language;", "pairedDashes", "Lai/grazie/nlp/patterns/Pattern;", "pairedParentheses", "Lai/grazie/nlp/patterns/RegexPattern;", "nlp-tokenizer"})
/*     */   public static final class Companion { private Companion() {} @JvmStatic
/*     */     @NotNull
/*     */     public final StandardSentenceTokenizer defaultFor(@NotNull Language language) { Intrinsics.checkNotNullParameter(language, "language");
/*     */       return new StandardSentenceTokenizer(Integer.valueOf(2), language); } private final RegexPattern pairedParentheses() { String noParentheses = "[^()]";
/*     */       String nestedParentheses = "\\(" + noParentheses + "{1,500}\\)" + noParentheses + "{0,500}";
/*     */       return new RegexPattern(new Regex("\\(" + noParentheses + "{1,500}(" + nestedParentheses + ")*\\)")); }
/*     */     private final Pattern pairedDashes() {
/*     */       Regex dashRegex = new Regex("\\s+[-–—]+\\s+([^-–—]{1,100})\\s+[-–—]+\\s+");
/*     */       Regex smileyRegex = new Regex("[:;]-?[()]+");
/*     */       return (Pattern)new StandardSentenceTokenizer$Companion$pairedDashes$1(dashRegex, smileyRegex);
/*     */     }
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$pairedDashes$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-tokenizer"})
/*     */     @SourceDebugExtension({"SMAP\nStandardSentenceTokenizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardSentenceTokenizer.kt\nai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$pairedDashes$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,197:1\n774#2:198\n865#2,2:199\n*S KotlinDebug\n*F\n+ 1 StandardSentenceTokenizer.kt\nai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$pairedDashes$1\n*L\n63#1:198\n63#1:199,2\n*E\n"})
/*     */     public static final class StandardSentenceTokenizer$Companion$pairedDashes$1 extends RegexPattern { StandardSentenceTokenizer$Companion$pairedDashes$1(Regex $dashRegex, Regex $smileyRegex) {
/*     */         super($dashRegex);
/*     */       }
/*     */       public List<TextRange> find(CharSequence text) { Intrinsics.checkNotNullParameter(text, "text");
/*     */         List list1 = super.find(text);
/*     */         Regex regex1 = this.$dashRegex, regex2 = this.$smileyRegex;
/*     */         int $i$f$filter = 0;
/* 198 */         List list2 = list1; Collection destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 199 */         for (Object element$iv$iv : list2) { TextRange it = (TextRange)element$iv$iv; int $i$a$-filter-StandardSentenceTokenizer$Companion$pairedDashes$1$find$1 = 0; CharSequence withDashes = text.subSequence(it.getStart(), it.getEndExclusive()); Intrinsics.checkNotNull(regex1.matchEntire(withDashes)); String withoutDashes = regex1.matchEntire(withDashes).getGroupValues().get(1); }
/* 200 */          return (List<TextRange>)destination$iv$iv; } } @NotNull public final StandardSentenceTokenizer getDefault() { return StandardSentenceTokenizer.Default; } } @JvmStatic @NotNull public static final StandardSentenceTokenizer defaultFor(@NotNull Language language) { return Companion.defaultFor(language); } @NotNull public static final Companion Companion = new Companion(null); @Nullable private final PatternSplitTokenizer newLineTokenizer; @NotNull public List<Tokenizer.Token> tokenize(@NotNull Text text) { Intrinsics.checkNotNullParameter(text, "text"); Iterable<TextRange> $this$map$iv = tokenRanges((CharSequence)text); int $i$f$map = 0; Iterable<TextRange> iterable1 = $this$map$iv; Collection<Tokenizer.Token> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0; for (TextRange item$iv$iv : iterable1) { TextRange textRange1 = item$iv$iv; Collection<Tokenizer.Token> collection = destination$iv$iv; int $i$a$-map-StandardSentenceTokenizer$tokenize$1 = 0; collection.add(new Tokenizer.Token(text.substring(textRange1), textRange1)); }
/* 201 */      return (List<Tokenizer.Token>)destination$iv$iv; }
/* 202 */   @NotNull private final AggregatedPattern ignore; @NotNull private final PatternSplitTokenizer punctuationTokenizer; @NotNull private static final String quotes = "'\"`‘’" + CollectionsKt.joinToString$default(UnicodePunctuationNormalizer.Companion.getDoubleQuotes(), "", null, null, 0, null, null, 62, null); @NotNull private static final StandardSentenceTokenizer$Companion$Parenthetical$1 Parenthetical; static { Pattern[] arrayOfPattern2 = new Pattern[2]; arrayOfPattern2[0] = (Pattern)Companion.pairedParentheses(); arrayOfPattern2[1] = Companion.pairedDashes(); Pattern[] arrayOfPattern1 = arrayOfPattern2; Parenthetical = new StandardSentenceTokenizer$Companion$Parenthetical$1(arrayOfPattern1); Companion $this$Ellipsis_u24lambda_u243 = Companion; int $i$a$-run-StandardSentenceTokenizer$Companion$Ellipsis$1 = 0; } @NotNull public final List<TextRange> tokenRanges(@NotNull CharSequence text) { Intrinsics.checkNotNullParameter(text, "text"); if (this.newLineTokenizer == null || this.newLineTokenizer.tokenRanges(text) == null) this.newLineTokenizer.tokenRanges(text);  List hard = CollectionsKt.listOf(new TextRange(0, text.length())); Iterable $this$flatMap$iv = hard; int $i$f$flatMap = 0; Iterable iterable1 = $this$flatMap$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$flatMapTo = 0;
/* 203 */     for (Object element$iv$iv : iterable1) {
/* 204 */       TextRange chunk = (TextRange)element$iv$iv; int $i$a$-flatMap-StandardSentenceTokenizer$tokenRanges$1 = 0; Iterable $this$map$iv = this.punctuationTokenizer.tokenRanges(text.subSequence(chunk.getStart(), chunk.getEndExclusive())); int $i$f$map = 0;
/* 205 */       Iterable iterable2 = $this$map$iv; Collection collection = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 206 */       Iterator iterator = iterable2.iterator();
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 211 */     return (List<TextRange>)destination$iv$iv; }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$Parenthetical$1", "Lai/grazie/nlp/patterns/AggregatedPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-tokenizer"})
/*     */   public static final class StandardSentenceTokenizer$Companion$Parenthetical$1 extends AggregatedPattern {
/*     */     StandardSentenceTokenizer$Companion$Parenthetical$1(Pattern[] $super_call_param$1) {
/*     */       super($super_call_param$1);
/*     */     }
/*     */     
/*     */     public List<TextRange> find(CharSequence text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       return super.find(text);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final StandardSentenceTokenizer$Companion$Ellipsis$1$1 Ellipsis = new StandardSentenceTokenizer$Companion$Ellipsis$1$1();
/*     */   @NotNull
/*     */   private static final StandardSentenceTokenizer$Companion$QuotedStuff$1 QuotedStuff;
/*     */   @NotNull
/*     */   private static final String normalSentenceEnd = "[?!.]+[)}\\]" + quotes + "]?";
/*     */   @NotNull
/*     */   private static final String romanBullet = "(^|\n)([IVXLMCD]{1,4}|[" + "IVXLMCD".toLowerCase(Locale.ROOT) + "]{1,4})\\)";
/*     */   @NotNull
/*     */   private static final String braceBulletContents = "[\\d\\p{L}]{1,3}(\\.[\\d\\p{L}]{1,3})*";
/*     */   @NotNull
/*     */   private static final String braceBullet = "(^|\n)(\\([\\d\\p{L}]{1,3}(\\.[\\d\\p{L}]{1,3})*\\)|\\[[\\d\\p{L}]{1,3}(\\.[\\d\\p{L}]{1,3})*\\])";
/*     */   @NotNull
/*     */   private static final String spaceOrEnd = "\n+|\\s+|$";
/*     */   @NotNull
/*     */   private static final Regex sentenceContinuation;
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000)\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000\n\002\020\013\n\000\n\002\020\b\n\002\b\006*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026J \020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\n2\006\020\005\032\0020\006H\002J \020\f\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\n2\006\020\005\032\0020\006H\002J \020\r\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\n2\006\020\005\032\0020\006H\002J\030\020\016\032\0020\b2\006\020\017\032\0020\n2\006\020\005\032\0020\006H\002¨\006\020"}, d2 = {"ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$Ellipsis$1$1", "Lai/grazie/nlp/patterns/Pattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "isActionNameEllipsis", "", "start", "", "end", "isEllipsisMatch", "isForOmittedSentenceParts", "isSpacedEllipsis", "i", "nlp-tokenizer"})
/*     */   public static final class StandardSentenceTokenizer$Companion$Ellipsis$1$1 implements Pattern {
/*     */     public List<TextRange> find(CharSequence text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       ArrayList<TextRange> result = new ArrayList();
/*     */       for (int i = 0, j = text.length(); i < j; i++) {
/*     */         if (text.charAt(i) == '.' && i < text.length() - 2 && text.charAt(i + 2) == '.') {
/*     */           if (isSpacedEllipsis(i, text)) {
/*     */             result.add(new TextRange(i, i + 5));
/*     */           } else if (text.charAt(i + 1) == '.') {
/*     */             int end = i + 3;
/*     */             for (; end < text.length() && text.charAt(end) == '.'; end++);
/*     */             if (isEllipsisMatch(i, end, text))
/*     */               result.add(new TextRange(i, end)); 
/*     */           } 
/*     */         } else if (text.charAt(i) == '…' && isEllipsisMatch(i, i + 1, text)) {
/*     */           result.add(new TextRange(i, i + 1));
/*     */         } 
/*     */       } 
/*     */       return result;
/*     */     }
/*     */     
/*     */     private final boolean isSpacedEllipsis(int i, CharSequence text) {
/*     */       return (i + 4 < text.length() && text.charAt(i + 4) == '.' && CharsKt.isWhitespace(text.charAt(i + 1)) && CharsKt.isWhitespace(text.charAt(i + 3)));
/*     */     }
/*     */     
/*     */     private final boolean isEllipsisMatch(int start, int end, CharSequence text) {
/*     */       return (isForOmittedSentenceParts(start, end, text) || isActionNameEllipsis(start, end, text));
/*     */     }
/*     */     
/*     */     private final boolean isActionNameEllipsis(int start, int end, CharSequence text) {
/*     */       return (start > 0 && Character.isLetter(text.charAt(start - 1)) && end + 1 < text.length() && CharsKt.isWhitespace(text.charAt(end)) && Character.isLowerCase(text.charAt(end + 1)));
/*     */     }
/*     */     
/*     */     private final boolean isForOmittedSentenceParts(int start, int end, CharSequence text) {
/*     */       return (((start == 0 || CharsKt.isWhitespace(text.charAt(start - 1)) || StringsKt.contains$default(StandardSentenceTokenizer.quotes, text.charAt(start - 1), false, 2, null)) && (end == text.length() || CharsKt.isWhitespace(text.charAt(end)) || StringsKt.contains$default(StandardSentenceTokenizer.quotes, text.charAt(end), false, 2, null))) || (start > 0 && end < text.length() && text.charAt(start - 1) == '[' && text.charAt(end) == ']'));
/*     */     }
/*     */   }
/*     */   
/*     */   static {
/*     */     Regex regex = new Regex("[" + quotes + "]([\\p{L}\\s\\d]{1,42}(\\.{3,}|…)[" + quotes + "]\\s+\\p{Ll}|\\p{L}+\\.[" + quotes + "]([,;:]|\\s+\\p{Ll})|[^\\s\\p{L}]*[" + quotes + "])");
/*     */     QuotedStuff = new StandardSentenceTokenizer$Companion$QuotedStuff$1(regex);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$QuotedStuff$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-tokenizer"})
/*     */   public static final class StandardSentenceTokenizer$Companion$QuotedStuff$1 extends RegexPattern {
/*     */     StandardSentenceTokenizer$Companion$QuotedStuff$1(Regex $super_call_param$1) {
/*     */       super($super_call_param$1);
/*     */     }
/*     */     
/*     */     public List<TextRange> find(CharSequence text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       return super.find(text);
/*     */     }
/*     */   }
/*     */   
/*     */   static {
/*     */     Intrinsics.checkNotNullExpressionValue("IVXLMCD".toLowerCase(Locale.ROOT), "toLowerCase(...)");
/*     */   }
/*     */   
/*     */   static {
/*     */     Companion $this$sentenceContinuation_u24lambda_u244 = Companion;
/*     */     int $i$a$-run-StandardSentenceTokenizer$Companion$sentenceContinuation$1 = 0;
/*     */     String dashes = "(\\s+[-–—]+)";
/*     */     String emotionalPunctuation = "([?!]\\.*|([:;]-?[()]+))";
/*     */     String directSpeechEnd = "(\\?[" + quotes + "]|!(\\.+[" + quotes + "]?|\\.*[" + quotes + "])|\\.{3,}[" + quotes + "?]*)";
/*     */     sentenceContinuation = new Regex("(" + directSpeechEnd + dashes + "?|" + emotionalPunctuation + dashes + ")\\s+([\\[({<])?\\p{Ll}");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final StandardSentenceTokenizer$Companion$endPunctuation$1 endPunctuation = new StandardSentenceTokenizer$Companion$endPunctuation$1();
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\031\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\006\032\b\022\004\022\0020\b0\0072\006\020\t\032\0020\nH\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\013"}, d2 = {"ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$endPunctuation$1", "Lai/grazie/nlp/patterns/Pattern;", "regex", "Lkotlin/text/Regex;", "startChars", "", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-tokenizer"})
/*     */   public static final class StandardSentenceTokenizer$Companion$endPunctuation$1 implements Pattern {
/*     */     private final char[] startChars;
/*     */     private final Regex regex;
/*     */     
/*     */     StandardSentenceTokenizer$Companion$endPunctuation$1() {
/*     */       Intrinsics.checkNotNullExpressionValue("?!.:;\n".toCharArray(), "toCharArray(...)");
/*     */       this.startChars = "?!.:;\n".toCharArray();
/*     */       this.regex = new Regex("(" + StandardSentenceTokenizer.normalSentenceEnd + "|" + StandardSentenceTokenizer.romanBullet + "|(^|\n)(\\([\\d\\p{L}]{1,3}(\\.[\\d\\p{L}]{1,3})*\\)|\\[[\\d\\p{L}]{1,3}(\\.[\\d\\p{L}]{1,3})*\\]))(\n+|\\s+|$)|([:;]-?[()]+)(\n+|\\s+|$|" + StandardSentenceTokenizer.normalSentenceEnd + ")+");
/*     */     }
/*     */     
/*     */     public List<TextRange> find(CharSequence text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       int offset = 0;
/*     */       ArrayList<TextRange> result = new ArrayList();
/*     */       while (offset >= 0) {
/*     */         MatchResult mr = this.regex.matchAt(text, offset);
/*     */         if (mr != null) {
/*     */           if (!StandardSentenceTokenizer.sentenceContinuation.matchesAt(text, offset))
/*     */             result.add(TextRange.Companion.invoke(mr.getRange())); 
/*     */           offset = mr.getRange().getLast() + 1;
/*     */         } 
/*     */         offset = StringsKt.indexOfAny$default(text, this.startChars, offset + 1, false, 4, null);
/*     */       } 
/*     */       return result;
/*     */     }
/*     */   }
/*     */   @NotNull
/*     */   private static final StandardSentenceTokenizer Default = new StandardSentenceTokenizer(Integer.valueOf(2), Language.UNKNOWN);
/*     */   
/*     */   private final StandardSentenceTokenizer$newLinesPattern$1 newLinesPattern(int splitByNewLinesNumber) {
/*     */     Regex regex = new Regex("\n{" + splitByNewLinesNumber + ",}");
/*     */     return new StandardSentenceTokenizer$newLinesPattern$1(regex);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$newLinesPattern$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-tokenizer"})
/*     */   public static final class StandardSentenceTokenizer$newLinesPattern$1 extends RegexPattern {
/*     */     StandardSentenceTokenizer$newLinesPattern$1(Regex $super_call_param$1) {
/*     */       super($super_call_param$1);
/*     */     }
/*     */     
/*     */     public List<TextRange> find(CharSequence text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       return super.find(text);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\sentence\StandardSentenceTokenizer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */