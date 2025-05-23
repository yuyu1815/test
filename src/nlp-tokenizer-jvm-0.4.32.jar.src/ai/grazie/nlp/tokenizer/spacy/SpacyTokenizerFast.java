/*     */ package ai.grazie.nlp.tokenizer.spacy;
/*     */ 
/*     */ import ai.grazie.nlp.langs.Language;
/*     */ import ai.grazie.nlp.tokenizer.Tokenizer;
/*     */ import ai.grazie.nlp.tokenizer.spacy.de.SpacyGerman;
/*     */ import ai.grazie.nlp.tokenizer.spacy.de.SpacyGermanTokenizerExceptions;
/*     */ import ai.grazie.nlp.tokenizer.spacy.en.SpacyEnglish;
/*     */ import ai.grazie.nlp.tokenizer.spacy.en.SpacyEnglishTokenizerExceptions;
/*     */ import ai.grazie.nlp.tokenizer.spacy.ru.SpacyRussian;
/*     */ import ai.grazie.nlp.tokenizer.spacy.ru.SpacyRussianTokenizerExceptions;
/*     */ import ai.grazie.nlp.tokenizer.spacy.uk.SpacyUkrainian;
/*     */ import ai.grazie.nlp.tokenizer.spacy.uk.SpacyUkrainianTokenizerExceptions;
/*     */ import ai.grazie.nlp.utils.RangesKt;
/*     */ import ai.grazie.nlp.utils.normalization.AggregatedNormalizer;
/*     */ import ai.grazie.nlp.utils.normalization.CapsNormalizer;
/*     */ import ai.grazie.nlp.utils.normalization.Normalizer;
/*     */ import ai.grazie.nlp.utils.normalization.UnicodePunctuationNormalizer;
/*     */ import ai.grazie.utils.mpp.LoggerFactory;
/*     */ import ai.grazie.utils.mpp.MPPLogger;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.SetsKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.ranges.IntProgression;
/*     */ import kotlin.ranges.IntRange;
/*     */ import kotlin.ranges.RangesKt;
/*     */ import kotlin.sequences.Sequence;
/*     */ import kotlin.text.CharsKt;
/*     */ import kotlin.text.MatchResult;
/*     */ import kotlin.text.Regex;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000^\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\"\n\002\020\f\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\n\002\020\013\n\002\b\n\030\000 '2\0020\001:\002'(B-\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\002\020\nJ\036\020\020\032\b\022\004\022\0020\0220\0212\006\020\023\032\0020\0242\006\020\025\032\0020\026H\002J\026\020\027\032\b\022\004\022\0020\0310\0302\006\020\032\032\0020\026H\002J\020\020\033\032\0020\0342\006\020\032\032\0020\026H\002J\020\020\035\032\0020\0342\006\020\032\032\0020\026H\002J\020\020\036\032\0020\0372\006\020 \032\0020\026H\002J\026\020!\032\b\022\004\022\0020\0260\0212\006\020\"\032\0020\026H\002J\026\020#\032\b\022\004\022\0020\0220\0212\006\020$\032\0020\026H\026J\026\020%\032\b\022\004\022\0020\0220\0212\006\020$\032\0020\026H\002J\026\020&\032\b\022\004\022\0020\0220\0212\006\020\025\032\0020\026H\002R\016\020\004\032\0020\003X\004¢\006\002\n\000R\024\020\013\032\b\022\004\022\0020\r0\fX\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\016\020\017R\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\005\032\0020\003X\004¢\006\002\n\000¨\006)"}, d2 = {"Lai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast;", "Lai/grazie/nlp/tokenizer/Tokenizer;", "prefix", "Lkotlin/text/Regex;", "infix", "suffix", "specialCases", "Lai/grazie/nlp/tokenizer/spacy/SpacyTokenizerSpecialCases;", "preNormalizer", "Lai/grazie/nlp/utils/normalization/AggregatedNormalizer;", "(Lkotlin/text/Regex;Lkotlin/text/Regex;Lkotlin/text/Regex;Lai/grazie/nlp/tokenizer/spacy/SpacyTokenizerSpecialCases;Lai/grazie/nlp/utils/normalization/AggregatedNormalizer;)V", "oneCharSuffixes", "", "", "getPrefix", "()Lkotlin/text/Regex;", "finalizeSplit", "", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "splits", "Lai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast$TokenSplits;", "word", "", "findInfix", "Lkotlin/sequences/Sequence;", "Lkotlin/text/MatchResult;", "tok", "findPrefix", "", "findSuffix", "isSpecialOrFinal", "", "token", "splitInfixes", "remainingWord", "tokenize", "text", "tokenizeSpacyNormalized", "tokenizeToken", "Companion", "TokenSplits", "nlp-tokenizer"})
/*     */ @SourceDebugExtension({"SMAP\nSpacyTokenizerFast.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacyTokenizerFast.kt\nai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,354:1\n1088#2,2:355\n1069#2,2:357\n1069#2,2:359\n1069#2,2:376\n774#3:361\n865#3,2:362\n1557#3:364\n1628#3,3:365\n1557#3:368\n1628#3,3:369\n1557#3:372\n1628#3,3:373\n1863#3,2:378\n*S KotlinDebug\n*F\n+ 1 SpacyTokenizerFast.kt\nai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast\n*L\n170#1:355,2\n182#1:357,2\n183#1:359,2\n286#1:376,2\n200#1:361\n200#1:362,2\n201#1:364\n201#1:365,3\n214#1:368\n214#1:369,3\n226#1:372\n226#1:373,3\n292#1:378,2\n*E\n"})
/*     */ public final class SpacyTokenizerFast implements Tokenizer {
/*  44 */   public SpacyTokenizerFast(@NotNull Regex prefix, @NotNull Regex infix, @NotNull Regex suffix, @NotNull SpacyTokenizerSpecialCases specialCases, @NotNull AggregatedNormalizer preNormalizer) { this.prefix = prefix;
/*  45 */     this.infix = infix;
/*  46 */     this.suffix = suffix;
/*  47 */     this.specialCases = specialCases;
/*  48 */     this.preNormalizer = preNormalizer;
/*     */ 
/*     */ 
/*     */     
/*  52 */     Character[] arrayOfCharacter = new Character[6]; arrayOfCharacter[0] = Character.valueOf('.'); arrayOfCharacter[1] = Character.valueOf(':'); arrayOfCharacter[2] = Character.valueOf(';'); arrayOfCharacter[3] = Character.valueOf(','); arrayOfCharacter[4] = Character.valueOf('?'); arrayOfCharacter[5] = Character.valueOf('!'); this.oneCharSuffixes = SetsKt.setOf((Object[])arrayOfCharacter); } @NotNull
/*     */   public final Regex getPrefix() {
/*     */     return this.prefix;
/*     */   } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020 \n\002\020\016\n\002\b\006\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J(\020\005\032\0020\0062\006\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\016\b\002\020\013\032\b\022\004\022\0020\r0\fJ*\020\016\032\0020\0062\b\b\002\020\t\032\0020\n2\016\b\002\020\013\032\b\022\004\022\0020\r0\f2\b\b\002\020\017\032\0020\nJ*\020\020\032\0020\0062\b\b\002\020\t\032\0020\n2\016\b\002\020\013\032\b\022\004\022\0020\r0\f2\b\b\002\020\017\032\0020\nJ \020\021\032\0020\0062\b\b\002\020\t\032\0020\n2\016\b\002\020\013\032\b\022\004\022\0020\r0\fJ \020\022\032\0020\0062\b\b\002\020\t\032\0020\n2\016\b\002\020\013\032\b\022\004\022\0020\r0\fR\016\020\003\032\0020\004X\004¢\006\002\n\000¨\006\023"}, d2 = {"Lai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast$Companion;", "", "()V", "logger", "Lai/grazie/utils/mpp/MPPLogger;", "load", "Lai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast;", "language", "Lai/grazie/nlp/langs/Language;", "replaceApostropheWithQuote", "", "additionalPrefixes", "", "", "loadEnglish", "useNewAffixes", "loadGerman", "loadRussian", "loadUkrainian", "nlp-tokenizer"})
/*     */   public static final class Companion { private Companion() {} @NotNull
/*     */     public final SpacyTokenizerFast load(@NotNull Language language, boolean replaceApostropheWithQuote, @NotNull List additionalPrefixes) {
/*  58 */       Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(additionalPrefixes, "additionalPrefixes"); switch (WhenMappings.$EnumSwitchMapping$0[language.ordinal()]) { case 1: 
/*     */         case 2: 
/*     */         case 3: 
/*     */         case 4:
/*  62 */          }  throw new IllegalStateException(
/*  63 */           "Language is not supported".toString());
/*     */     }
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final SpacyTokenizerFast loadEnglish(boolean replaceApostropheWithQuote, @NotNull List additionalPrefixes, boolean useNewAffixes) {
/*  69 */       Intrinsics.checkNotNullParameter(additionalPrefixes, "additionalPrefixes");
/*  70 */       Normalizer[] arrayOfNormalizer = new Normalizer[2]; arrayOfNormalizer[0] = (Normalizer)new UnicodePunctuationNormalizer(replaceApostropheWithQuote); arrayOfNormalizer[1] = 
/*  71 */         (Normalizer)new CapsNormalizer();
/*     */       AggregatedNormalizer preNormalizer = new AggregatedNormalizer(arrayOfNormalizer);
/*  73 */       List<String> prefixes = additionalPrefixes.isEmpty() ? SpacyEnglish.INSTANCE.getPrefixes() : CollectionsKt.plus(SpacyEnglish.INSTANCE.getPrefixes(), additionalPrefixes);
/*  74 */       return new SpacyTokenizerFast(
/*  75 */           SpacyBaseLanguage.INSTANCE.compilePrefix(prefixes), 
/*  76 */           SpacyBaseLanguage.INSTANCE.compileInfix(CollectionsKt.plus(SpacyEnglish.INSTANCE.getInfixes(), useNewAffixes ? SpacyEnglish.INSTANCE.getNewInfixes() : CollectionsKt.emptyList())), 
/*  77 */           SpacyBaseLanguage.INSTANCE.compileSuffix(CollectionsKt.plus(SpacyEnglish.INSTANCE.getSuffixes(), useNewAffixes ? SpacyEnglish.INSTANCE.getNewSuffixes() : CollectionsKt.emptyList())), 
/*  78 */           new SpacyTokenizerSpecialCases(
/*  79 */             SpacyBaseLanguage.BaseExceptions.INSTANCE.getExceptions(), 
/*  80 */             SpacyEnglishTokenizerExceptions.INSTANCE.getExceptions()), 
/*     */           
/*  82 */           preNormalizer);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final SpacyTokenizerFast loadGerman(boolean replaceApostropheWithQuote, @NotNull List additionalPrefixes, boolean useNewAffixes) {
/*  87 */       Intrinsics.checkNotNullParameter(additionalPrefixes, "additionalPrefixes");
/*  88 */       Normalizer[] arrayOfNormalizer = new Normalizer[2]; arrayOfNormalizer[0] = (Normalizer)new UnicodePunctuationNormalizer(replaceApostropheWithQuote); arrayOfNormalizer[1] = 
/*  89 */         (Normalizer)new CapsNormalizer();
/*     */       AggregatedNormalizer preNormalizer = new AggregatedNormalizer(arrayOfNormalizer);
/*  91 */       List<String> prefixes = additionalPrefixes.isEmpty() ? SpacyGerman.INSTANCE.getPrefixes() : CollectionsKt.plus(SpacyGerman.INSTANCE.getPrefixes(), additionalPrefixes);
/*  92 */       return new SpacyTokenizerFast(
/*  93 */           SpacyBaseLanguage.INSTANCE.compilePrefix(prefixes), 
/*  94 */           SpacyBaseLanguage.INSTANCE.compileInfix(useNewAffixes ? SpacyGerman.INSTANCE.getNewInfixes() : SpacyGerman.INSTANCE.getInfixes()), 
/*  95 */           SpacyBaseLanguage.INSTANCE.compileSuffix(SpacyGerman.INSTANCE.getSuffixes()), 
/*  96 */           new SpacyTokenizerSpecialCases(
/*  97 */             SpacyBaseLanguage.BaseExceptions.INSTANCE.getExceptions(), 
/*  98 */             SpacyGermanTokenizerExceptions.INSTANCE.getExceptions()), 
/*     */           
/* 100 */           preNormalizer);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final SpacyTokenizerFast loadRussian(boolean replaceApostropheWithQuote, @NotNull List additionalPrefixes) {
/* 105 */       Intrinsics.checkNotNullParameter(additionalPrefixes, "additionalPrefixes");
/* 106 */       Normalizer[] arrayOfNormalizer = new Normalizer[2]; arrayOfNormalizer[0] = (Normalizer)new UnicodePunctuationNormalizer(replaceApostropheWithQuote); arrayOfNormalizer[1] = 
/* 107 */         (Normalizer)new CapsNormalizer();
/*     */       AggregatedNormalizer preNormalizer = new AggregatedNormalizer(arrayOfNormalizer);
/* 109 */       List<String> prefixes = additionalPrefixes.isEmpty() ? SpacyRussian.INSTANCE.getPrefixes() : CollectionsKt.plus(SpacyRussian.INSTANCE.getPrefixes(), additionalPrefixes);
/* 110 */       return new SpacyTokenizerFast(
/* 111 */           SpacyBaseLanguage.INSTANCE.compilePrefix(prefixes), 
/* 112 */           SpacyBaseLanguage.INSTANCE.compileInfix(SpacyRussian.INSTANCE.getInfixes()), 
/* 113 */           SpacyBaseLanguage.INSTANCE.compileSuffix(SpacyRussian.INSTANCE.getSuffixes()), 
/* 114 */           new SpacyTokenizerSpecialCases(
/* 115 */             SpacyBaseLanguage.BaseExceptions.INSTANCE.getExceptions(), 
/* 116 */             SpacyRussianTokenizerExceptions.INSTANCE.getExceptions()), 
/*     */           
/* 118 */           preNormalizer);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final SpacyTokenizerFast loadUkrainian(boolean replaceApostropheWithQuote, @NotNull List additionalPrefixes) {
/* 123 */       Intrinsics.checkNotNullParameter(additionalPrefixes, "additionalPrefixes");
/* 124 */       Normalizer[] arrayOfNormalizer = new Normalizer[2]; arrayOfNormalizer[0] = (Normalizer)new UnicodePunctuationNormalizer(replaceApostropheWithQuote); arrayOfNormalizer[1] = 
/* 125 */         (Normalizer)new CapsNormalizer();
/*     */       AggregatedNormalizer preNormalizer = new AggregatedNormalizer(arrayOfNormalizer);
/* 127 */       List<String> prefixes = additionalPrefixes.isEmpty() ? SpacyUkrainian.INSTANCE.getPrefixes() : CollectionsKt.plus(SpacyUkrainian.INSTANCE.getPrefixes(), additionalPrefixes);
/* 128 */       return new SpacyTokenizerFast(
/* 129 */           SpacyBaseLanguage.INSTANCE.compilePrefix(prefixes), 
/* 130 */           SpacyBaseLanguage.INSTANCE.compileInfix(SpacyUkrainian.INSTANCE.getInfixes()), 
/* 131 */           SpacyBaseLanguage.INSTANCE.compileSuffix(SpacyUkrainian.INSTANCE.getSuffixes()), 
/* 132 */           new SpacyTokenizerSpecialCases(
/* 133 */             SpacyBaseLanguage.BaseExceptions.INSTANCE.getExceptions(), 
/* 134 */             SpacyUkrainianTokenizerExceptions.INSTANCE.getExceptions()), 
/*     */           
/* 136 */           preNormalizer); } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final Regex prefix; @NotNull private final Regex infix; @NotNull private final Regex suffix; @NotNull private final SpacyTokenizerSpecialCases specialCases; @NotNull
/*     */   private final AggregatedNormalizer preNormalizer; @NotNull
/*     */   private final Set<Character> oneCharSuffixes; @NotNull
/*     */   private static final MPPLogger logger = LoggerFactory.INSTANCE.create("ai.grazie.nlp.tokenizer.spacy.SpacyTokenizer"); @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\020\016\n\002\030\002\n\002\b\007\n\002\020 \n\002\030\002\n\000\b\002\030\0002\0020\001B\005¢\006\002\020\002J\f\020\r\032\b\022\004\022\0020\0170\016R!\020\003\032\022\022\004\022\0020\0050\004j\b\022\004\022\0020\005`\006¢\006\b\n\000\032\004\b\007\020\bR!\020\t\032\022\022\004\022\0020\0050\004j\b\022\004\022\0020\005`\006¢\006\b\n\000\032\004\b\n\020\bR!\020\013\032\022\022\004\022\0020\0050\004j\b\022\004\022\0020\005`\006¢\006\b\n\000\032\004\b\f\020\b¨\006\020"}, d2 = {"Lai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast$TokenSplits;", "", "()V", "prefixes", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getPrefixes", "()Ljava/util/ArrayList;", "suffixes", "getSuffixes", "wordTokens", "getWordTokens", "toList", "", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "nlp-tokenizer"})
/*     */   @SourceDebugExtension({"SMAP\nSpacyTokenizerFast.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacyTokenizerFast.kt\nai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast$TokenSplits\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,354:1\n1557#2:355\n1628#2,3:356\n*S KotlinDebug\n*F\n+ 1 SpacyTokenizerFast.kt\nai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast$TokenSplits\n*L\n148#1:355\n148#1:356,3\n*E\n"})
/*     */   private static final class TokenSplits { @NotNull
/* 142 */     private final ArrayList<String> prefixes; public TokenSplits() { this.prefixes = new ArrayList<>();
/* 143 */       this.suffixes = new ArrayList<>();
/* 144 */       this.wordTokens = new ArrayList<>(); } @NotNull private final ArrayList<String> suffixes; @NotNull private final ArrayList<String> wordTokens; @NotNull public final ArrayList<String> getPrefixes() { return this.prefixes; } @NotNull public final ArrayList<String> getSuffixes() { return this.suffixes; } @NotNull public final ArrayList<String> getWordTokens() { return this.wordTokens; }
/*     */     
/*     */     @NotNull
/* 147 */     public final List<Tokenizer.Token> toList() { int cur = 0;
/* 148 */       Iterable $this$map$iv = CollectionsKt.plus(CollectionsKt.plus(this.prefixes, this.wordTokens), CollectionsKt.reversed(this.suffixes)); int $i$f$map = 0;
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
/* 355 */       Iterable iterable1 = $this$map$iv; Collection<Tokenizer.Token> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 356 */       for (Object item$iv$iv : iterable1) {
/* 357 */         String str = (String)item$iv$iv; Collection<Tokenizer.Token> collection = destination$iv$iv; int $i$a$-map-SpacyTokenizerFast$TokenSplits$toList$1 = 0; int start = cur; cur += str.length(); collection.add(new Tokenizer.Token(str, new IntRange(start, cur - 1)));
/* 358 */       }  return (List<Tokenizer.Token>)destination$iv$iv; } } @NotNull public List<Tokenizer.Token> tokenize(@NotNull String text) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'text'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield preNormalizer : Lai/grazie/nlp/utils/normalization/AggregatedNormalizer;
/*     */     //   10: aload_1
/*     */     //   11: invokevirtual normalize : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   14: astore_2
/*     */     //   15: aload_2
/*     */     //   16: invokevirtual length : ()I
/*     */     //   19: aload_1
/*     */     //   20: invokevirtual length : ()I
/*     */     //   23: if_icmpeq -> 43
/*     */     //   26: getstatic ai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast.logger : Lai/grazie/utils/mpp/MPPLogger;
/*     */     //   29: aconst_null
/*     */     //   30: getstatic ai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast$tokenize$1.INSTANCE : Lai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast$tokenize$1;
/*     */     //   33: checkcast kotlin/jvm/functions/Function0
/*     */     //   36: iconst_1
/*     */     //   37: aconst_null
/*     */     //   38: invokestatic error$default : (Lai/grazie/utils/mpp/MPPLogger;Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
/*     */     //   41: aload_1
/*     */     //   42: astore_2
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial tokenizeSpacyNormalized : (Ljava/lang/String;)Ljava/util/List;
/*     */     //   48: astore_3
/*     */     //   49: aload_3
/*     */     //   50: checkcast java/util/Collection
/*     */     //   53: invokeinterface isEmpty : ()Z
/*     */     //   58: ifne -> 65
/*     */     //   61: iconst_1
/*     */     //   62: goto -> 66
/*     */     //   65: iconst_0
/*     */     //   66: ifeq -> 617
/*     */     //   69: aload_3
/*     */     //   70: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   73: checkcast ai/grazie/nlp/tokenizer/Tokenizer$Token
/*     */     //   76: astore #4
/*     */     //   78: aload #4
/*     */     //   80: invokevirtual getToken : ()Ljava/lang/String;
/*     */     //   83: checkcast java/lang/CharSequence
/*     */     //   86: bipush #46
/*     */     //   88: iconst_0
/*     */     //   89: iconst_2
/*     */     //   90: aconst_null
/*     */     //   91: invokestatic endsWith$default : (Ljava/lang/CharSequence;CZILjava/lang/Object;)Z
/*     */     //   94: ifeq -> 246
/*     */     //   97: aload #4
/*     */     //   99: invokevirtual getToken : ()Ljava/lang/String;
/*     */     //   102: checkcast java/lang/CharSequence
/*     */     //   105: astore #5
/*     */     //   107: iconst_0
/*     */     //   108: istore #6
/*     */     //   110: iconst_0
/*     */     //   111: istore #7
/*     */     //   113: iload #7
/*     */     //   115: aload #5
/*     */     //   117: invokeinterface length : ()I
/*     */     //   122: if_icmpge -> 162
/*     */     //   125: aload #5
/*     */     //   127: iload #7
/*     */     //   129: invokeinterface charAt : (I)C
/*     */     //   134: istore #8
/*     */     //   136: iload #8
/*     */     //   138: istore #9
/*     */     //   140: iconst_0
/*     */     //   141: istore #10
/*     */     //   143: iload #9
/*     */     //   145: invokestatic isLetter : (C)Z
/*     */     //   148: nop
/*     */     //   149: ifeq -> 156
/*     */     //   152: iconst_1
/*     */     //   153: goto -> 163
/*     */     //   156: iinc #7, 1
/*     */     //   159: goto -> 113
/*     */     //   162: iconst_0
/*     */     //   163: ifeq -> 246
/*     */     //   166: iconst_2
/*     */     //   167: anewarray java/lang/String
/*     */     //   170: astore #6
/*     */     //   172: aload #6
/*     */     //   174: iconst_0
/*     */     //   175: aload #4
/*     */     //   177: invokevirtual getToken : ()Ljava/lang/String;
/*     */     //   180: iconst_0
/*     */     //   181: aload #4
/*     */     //   183: invokevirtual getToken : ()Ljava/lang/String;
/*     */     //   186: invokevirtual length : ()I
/*     */     //   189: iconst_1
/*     */     //   190: isub
/*     */     //   191: invokevirtual substring : (II)Ljava/lang/String;
/*     */     //   194: dup
/*     */     //   195: ldc 'substring(...)'
/*     */     //   197: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   200: aastore
/*     */     //   201: aload #6
/*     */     //   203: iconst_1
/*     */     //   204: ldc '.'
/*     */     //   206: aastore
/*     */     //   207: aload #6
/*     */     //   209: invokestatic listOf : ([Ljava/lang/Object;)Ljava/util/List;
/*     */     //   212: astore #5
/*     */     //   214: aload_3
/*     */     //   215: iconst_0
/*     */     //   216: aload_3
/*     */     //   217: invokeinterface size : ()I
/*     */     //   222: iconst_1
/*     */     //   223: isub
/*     */     //   224: invokeinterface subList : (II)Ljava/util/List;
/*     */     //   229: checkcast java/util/Collection
/*     */     //   232: aload #4
/*     */     //   234: aload #5
/*     */     //   236: invokestatic splitToken : (Lai/grazie/nlp/tokenizer/Tokenizer$Token;Ljava/util/List;)Ljava/util/List;
/*     */     //   239: checkcast java/lang/Iterable
/*     */     //   242: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   245: astore_3
/*     */     //   246: new java/util/ArrayList
/*     */     //   249: dup
/*     */     //   250: invokespecial <init> : ()V
/*     */     //   253: astore #5
/*     */     //   255: aload_3
/*     */     //   256: checkcast java/lang/Iterable
/*     */     //   259: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   264: astore #6
/*     */     //   266: iconst_0
/*     */     //   267: istore #7
/*     */     //   269: aload #6
/*     */     //   271: invokeinterface hasNext : ()Z
/*     */     //   276: ifeq -> 611
/*     */     //   279: iload #7
/*     */     //   281: istore #8
/*     */     //   283: iload #7
/*     */     //   285: iconst_1
/*     */     //   286: iadd
/*     */     //   287: istore #7
/*     */     //   289: aload #6
/*     */     //   291: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   296: checkcast ai/grazie/nlp/tokenizer/Tokenizer$Token
/*     */     //   299: astore #9
/*     */     //   301: iload #8
/*     */     //   303: ifne -> 317
/*     */     //   306: aload #5
/*     */     //   308: aload #9
/*     */     //   310: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   313: pop
/*     */     //   314: goto -> 269
/*     */     //   317: aload #5
/*     */     //   319: checkcast java/util/List
/*     */     //   322: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   325: checkcast ai/grazie/nlp/tokenizer/Tokenizer$Token
/*     */     //   328: invokevirtual getToken : ()Ljava/lang/String;
/*     */     //   331: checkcast java/lang/CharSequence
/*     */     //   334: astore #11
/*     */     //   336: iconst_0
/*     */     //   337: istore #12
/*     */     //   339: iconst_0
/*     */     //   340: istore #13
/*     */     //   342: iload #13
/*     */     //   344: aload #11
/*     */     //   346: invokeinterface length : ()I
/*     */     //   351: if_icmpge -> 404
/*     */     //   354: aload #11
/*     */     //   356: iload #13
/*     */     //   358: invokeinterface charAt : (I)C
/*     */     //   363: istore #14
/*     */     //   365: iload #14
/*     */     //   367: istore #15
/*     */     //   369: iconst_0
/*     */     //   370: istore #16
/*     */     //   372: iload #15
/*     */     //   374: bipush #63
/*     */     //   376: if_icmpeq -> 386
/*     */     //   379: iload #15
/*     */     //   381: bipush #33
/*     */     //   383: if_icmpne -> 390
/*     */     //   386: iconst_1
/*     */     //   387: goto -> 391
/*     */     //   390: iconst_0
/*     */     //   391: ifne -> 398
/*     */     //   394: iconst_0
/*     */     //   395: goto -> 405
/*     */     //   398: iinc #13, 1
/*     */     //   401: goto -> 342
/*     */     //   404: iconst_1
/*     */     //   405: istore #10
/*     */     //   407: aload #9
/*     */     //   409: invokevirtual getToken : ()Ljava/lang/String;
/*     */     //   412: checkcast java/lang/CharSequence
/*     */     //   415: astore #12
/*     */     //   417: iconst_0
/*     */     //   418: istore #13
/*     */     //   420: iconst_0
/*     */     //   421: istore #14
/*     */     //   423: iload #14
/*     */     //   425: aload #12
/*     */     //   427: invokeinterface length : ()I
/*     */     //   432: if_icmpge -> 485
/*     */     //   435: aload #12
/*     */     //   437: iload #14
/*     */     //   439: invokeinterface charAt : (I)C
/*     */     //   444: istore #15
/*     */     //   446: iload #15
/*     */     //   448: istore #16
/*     */     //   450: iconst_0
/*     */     //   451: istore #17
/*     */     //   453: iload #16
/*     */     //   455: bipush #63
/*     */     //   457: if_icmpeq -> 467
/*     */     //   460: iload #16
/*     */     //   462: bipush #33
/*     */     //   464: if_icmpne -> 471
/*     */     //   467: iconst_1
/*     */     //   468: goto -> 472
/*     */     //   471: iconst_0
/*     */     //   472: ifne -> 479
/*     */     //   475: iconst_0
/*     */     //   476: goto -> 486
/*     */     //   479: iinc #14, 1
/*     */     //   482: goto -> 423
/*     */     //   485: iconst_1
/*     */     //   486: istore #11
/*     */     //   488: iload #10
/*     */     //   490: ifeq -> 600
/*     */     //   493: iload #11
/*     */     //   495: ifeq -> 600
/*     */     //   498: aload #5
/*     */     //   500: checkcast java/util/List
/*     */     //   503: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   506: checkcast ai/grazie/nlp/tokenizer/Tokenizer$Token
/*     */     //   509: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */     //   512: invokestatic getCheckedEndExclusive : (Lkotlin/ranges/IntRange;)I
/*     */     //   515: aload #9
/*     */     //   517: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */     //   520: invokevirtual getFirst : ()I
/*     */     //   523: if_icmpne -> 600
/*     */     //   526: aload #5
/*     */     //   528: checkcast java/util/List
/*     */     //   531: invokestatic removeLast : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   534: checkcast ai/grazie/nlp/tokenizer/Tokenizer$Token
/*     */     //   537: astore #12
/*     */     //   539: aload #5
/*     */     //   541: new ai/grazie/nlp/tokenizer/Tokenizer$Token
/*     */     //   544: dup
/*     */     //   545: new ai/grazie/text/Text
/*     */     //   548: dup
/*     */     //   549: aload #12
/*     */     //   551: invokevirtual getToken : ()Ljava/lang/String;
/*     */     //   554: aload #9
/*     */     //   556: invokevirtual getToken : ()Ljava/lang/String;
/*     */     //   559: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   564: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   567: new ai/grazie/text/TextRange
/*     */     //   570: dup
/*     */     //   571: aload #12
/*     */     //   573: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */     //   576: invokevirtual getFirst : ()I
/*     */     //   579: aload #9
/*     */     //   581: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */     //   584: invokestatic getCheckedEndExclusive : (Lkotlin/ranges/IntRange;)I
/*     */     //   587: invokespecial <init> : (II)V
/*     */     //   590: invokespecial <init> : (Lai/grazie/text/Text;Lai/grazie/text/TextRange;)V
/*     */     //   593: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   596: pop
/*     */     //   597: goto -> 269
/*     */     //   600: aload #5
/*     */     //   602: aload #9
/*     */     //   604: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   607: pop
/*     */     //   608: goto -> 269
/*     */     //   611: aload #5
/*     */     //   613: checkcast java/util/List
/*     */     //   616: astore_3
/*     */     //   617: aload_3
/*     */     //   618: checkcast java/lang/Iterable
/*     */     //   621: astore #4
/*     */     //   623: nop
/*     */     //   624: iconst_0
/*     */     //   625: istore #5
/*     */     //   627: aload #4
/*     */     //   629: astore #6
/*     */     //   631: new java/util/ArrayList
/*     */     //   634: dup
/*     */     //   635: invokespecial <init> : ()V
/*     */     //   638: checkcast java/util/Collection
/*     */     //   641: astore #7
/*     */     //   643: iconst_0
/*     */     //   644: istore #8
/*     */     //   646: aload #6
/*     */     //   648: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   653: astore #9
/*     */     //   655: aload #9
/*     */     //   657: invokeinterface hasNext : ()Z
/*     */     //   662: ifeq -> 720
/*     */     //   665: aload #9
/*     */     //   667: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   672: astore #10
/*     */     //   674: aload #10
/*     */     //   676: checkcast ai/grazie/nlp/tokenizer/Tokenizer$Token
/*     */     //   679: astore #11
/*     */     //   681: iconst_0
/*     */     //   682: istore #12
/*     */     //   684: aload #11
/*     */     //   686: invokevirtual getToken : ()Ljava/lang/String;
/*     */     //   689: checkcast java/lang/CharSequence
/*     */     //   692: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   695: ifne -> 702
/*     */     //   698: iconst_1
/*     */     //   699: goto -> 703
/*     */     //   702: iconst_0
/*     */     //   703: nop
/*     */     //   704: ifeq -> 655
/*     */     //   707: aload #7
/*     */     //   709: aload #10
/*     */     //   711: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   716: pop
/*     */     //   717: goto -> 655
/*     */     //   720: aload #7
/*     */     //   722: checkcast java/util/List
/*     */     //   725: nop
/*     */     //   726: checkcast java/lang/Iterable
/*     */     //   729: astore #4
/*     */     //   731: nop
/*     */     //   732: iconst_0
/*     */     //   733: istore #5
/*     */     //   735: aload #4
/*     */     //   737: astore #6
/*     */     //   739: new java/util/ArrayList
/*     */     //   742: dup
/*     */     //   743: aload #4
/*     */     //   745: bipush #10
/*     */     //   747: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   750: invokespecial <init> : (I)V
/*     */     //   753: checkcast java/util/Collection
/*     */     //   756: astore #7
/*     */     //   758: iconst_0
/*     */     //   759: istore #8
/*     */     //   761: aload #6
/*     */     //   763: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   768: astore #9
/*     */     //   770: aload #9
/*     */     //   772: invokeinterface hasNext : ()Z
/*     */     //   777: ifeq -> 836
/*     */     //   780: aload #9
/*     */     //   782: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   787: astore #10
/*     */     //   789: aload #7
/*     */     //   791: aload #10
/*     */     //   793: checkcast ai/grazie/nlp/tokenizer/Tokenizer$Token
/*     */     //   796: astore #11
/*     */     //   798: astore #18
/*     */     //   800: iconst_0
/*     */     //   801: istore #12
/*     */     //   803: new ai/grazie/nlp/tokenizer/Tokenizer$Token
/*     */     //   806: dup
/*     */     //   807: aload_1
/*     */     //   808: aload #11
/*     */     //   810: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */     //   813: invokestatic substring : (Ljava/lang/String;Lkotlin/ranges/IntRange;)Ljava/lang/String;
/*     */     //   816: aload #11
/*     */     //   818: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */     //   821: invokespecial <init> : (Ljava/lang/String;Lkotlin/ranges/IntRange;)V
/*     */     //   824: aload #18
/*     */     //   826: swap
/*     */     //   827: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   832: pop
/*     */     //   833: goto -> 770
/*     */     //   836: aload #7
/*     */     //   838: checkcast java/util/List
/*     */     //   841: nop
/*     */     //   842: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #157	-> 6
/*     */     //   #158	-> 15
/*     */     //   #159	-> 26
/*     */     //   #162	-> 41
/*     */     //   #165	-> 43
/*     */     //   #166	-> 49
/*     */     //   #166	-> 66
/*     */     //   #167	-> 69
/*     */     //   #170	-> 78
/*     */     //   #355	-> 110
/*     */     //   #170	-> 143
/*     */     //   #170	-> 148
/*     */     //   #355	-> 149
/*     */     //   #356	-> 162
/*     */     //   #170	-> 163
/*     */     //   #171	-> 166
/*     */     //   #171	-> 201
/*     */     //   #172	-> 214
/*     */     //   #175	-> 246
/*     */     //   #176	-> 255
/*     */     //   #177	-> 301
/*     */     //   #178	-> 306
/*     */     //   #179	-> 314
/*     */     //   #182	-> 317
/*     */     //   #357	-> 339
/*     */     //   #182	-> 372
/*     */     //   #357	-> 391
/*     */     //   #358	-> 404
/*     */     //   #182	-> 405
/*     */     //   #183	-> 407
/*     */     //   #359	-> 420
/*     */     //   #183	-> 453
/*     */     //   #359	-> 472
/*     */     //   #360	-> 485
/*     */     //   #183	-> 486
/*     */     //   #184	-> 488
/*     */     //   #185	-> 526
/*     */     //   #186	-> 539
/*     */     //   #187	-> 541
/*     */     //   #188	-> 545
/*     */     //   #189	-> 567
/*     */     //   #187	-> 590
/*     */     //   #186	-> 593
/*     */     //   #193	-> 600
/*     */     //   #196	-> 611
/*     */     //   #199	-> 617
/*     */     //   #200	-> 623
/*     */     //   #361	-> 627
/*     */     //   #362	-> 646
/*     */     //   #200	-> 684
/*     */     //   #200	-> 703
/*     */     //   #362	-> 704
/*     */     //   #363	-> 720
/*     */     //   #361	-> 725
/*     */     //   #201	-> 731
/*     */     //   #364	-> 735
/*     */     //   #365	-> 761
/*     */     //   #366	-> 789
/*     */     //   #201	-> 803
/*     */     //   #366	-> 827
/*     */     //   #367	-> 836
/*     */     //   #364	-> 841
/*     */     //   #199	-> 842
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   143	6	10	$i$a$-any-SpacyTokenizerFast$tokenize$2	I
/*     */     //   140	9	9	it	C
/*     */     //   136	20	8	element$iv	C
/*     */     //   110	53	6	$i$f$any	I
/*     */     //   107	56	5	$this$any$iv	Ljava/lang/CharSequence;
/*     */     //   214	32	5	lastTokenParts	Ljava/util/List;
/*     */     //   372	19	16	$i$a$-all-SpacyTokenizerFast$tokenize$lastQE$1	I
/*     */     //   369	22	15	it	C
/*     */     //   365	33	14	element$iv	C
/*     */     //   339	66	12	$i$f$all	I
/*     */     //   336	69	11	$this$all$iv	Ljava/lang/CharSequence;
/*     */     //   453	19	17	$i$a$-all-SpacyTokenizerFast$tokenize$currentQE$1	I
/*     */     //   450	22	16	it	C
/*     */     //   446	33	15	element$iv	C
/*     */     //   420	66	13	$i$f$all	I
/*     */     //   417	69	12	$this$all$iv	Ljava/lang/CharSequence;
/*     */     //   539	58	12	lastMerged	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*     */     //   407	201	10	lastQE	Z
/*     */     //   488	120	11	currentQE	Z
/*     */     //   283	328	8	i	I
/*     */     //   301	310	9	token	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*     */     //   78	539	4	lastToken	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*     */     //   255	362	5	mergedTokens	Ljava/util/ArrayList;
/*     */     //   684	20	12	$i$a$-filter-SpacyTokenizerFast$tokenize$3	I
/*     */     //   681	23	11	it	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*     */     //   674	43	10	element$iv$iv	Ljava/lang/Object;
/*     */     //   646	76	8	$i$f$filterTo	I
/*     */     //   643	79	6	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   643	79	7	destination$iv$iv	Ljava/util/Collection;
/*     */     //   627	99	5	$i$f$filter	I
/*     */     //   624	102	4	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   803	21	12	$i$a$-map-SpacyTokenizerFast$tokenize$4	I
/*     */     //   800	24	11	it	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*     */     //   789	44	10	item$iv$iv	Ljava/lang/Object;
/*     */     //   761	77	8	$i$f$mapTo	I
/*     */     //   758	80	6	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   758	80	7	destination$iv$iv	Ljava/util/Collection;
/*     */     //   735	107	5	$i$f$map	I
/*     */     //   732	110	4	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   15	828	2	normalizedText	Ljava/lang/String;
/*     */     //   49	794	3	normalizedTokens	Ljava/util/List;
/*     */     //   0	843	0	this	Lai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast;
/*     */     //   0	843	1	text	Ljava/lang/String; }
/*     */   private final List<Tokenizer.Token> tokenizeSpacyNormalized(String text) { if ((text.length() == 0))
/*     */       return CollectionsKt.emptyList();  ArrayList<Tokenizer.Token> result = new ArrayList(); int start = 0; start = -1; byte b; int i; for (b = 0, i = text.length(); b < i; ) {
/*     */       int j = b; char uc = text.charAt(b); if (CharsKt.isWhitespace(uc))
/*     */       { if (start != -1)
/*     */         { Intrinsics.checkNotNullExpressionValue(text.substring(start, j), "substring(...)");
/*     */           String span = text.substring(start, j);
/*     */           ArrayList<Tokenizer.Token> arrayList = result;
/*     */           Iterable<Tokenizer.Token> $this$map$iv = tokenizeToken(span);
/*     */           int $i$f$map = 0;
/* 368 */           Iterable<Tokenizer.Token> iterable1 = $this$map$iv; Collection<Tokenizer.Token> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 369 */           for (Tokenizer.Token item$iv$iv : iterable1) {
/* 370 */             Tokenizer.Token token1 = item$iv$iv; Collection<Tokenizer.Token> collection = destination$iv$iv; int $i$a$-map-SpacyTokenizerFast$tokenizeSpacyNormalized$1 = 0; collection.add(new Tokenizer.Token(token1.getToken(), RangesKt.withOffset(token1.getRange(), start)));
/* 371 */           }  $this$map$iv = destination$iv$iv; CollectionsKt.addAll(arrayList, $this$map$iv); }  start = -1; } else if (start == -1) { start = j; }  b++;
/* 372 */     }  if (start != -1) { Intrinsics.checkNotNullExpressionValue(text.substring(start), "substring(...)"); String span = text.substring(start); ArrayList<Tokenizer.Token> arrayList = result; Iterable<Tokenizer.Token> $this$map$iv = tokenizeToken(span); int $i$f$map = 0; Iterable<Tokenizer.Token> iterable1 = $this$map$iv; Collection<Tokenizer.Token> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 373 */       for (Tokenizer.Token item$iv$iv : iterable1) {
/* 374 */         Tokenizer.Token token1 = item$iv$iv; Collection<Tokenizer.Token> collection = destination$iv$iv; int $i$a$-map-SpacyTokenizerFast$tokenizeSpacyNormalized$2 = 0; collection.add(new Tokenizer.Token(token1.getToken(), RangesKt.withOffset(token1.getRange(), start)));
/* 375 */       }  $this$map$iv = destination$iv$iv; CollectionsKt.addAll(arrayList, $this$map$iv); }  return result; } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"}) static final class SpacyTokenizerFast$tokenize$1 extends Lambda implements Function0<String> {
/*     */     public static final SpacyTokenizerFast$tokenize$1 INSTANCE = new SpacyTokenizerFast$tokenize$1(); public final String invoke() { return "Normalized length is not equal to original text length. This shouldn't happen as normalizers should preserve text length."; }
/*     */     SpacyTokenizerFast$tokenize$1() { super(0); } }
/* 378 */   private final List<Tokenizer.Token> finalizeSplit(TokenSplits splits, String word) { Iterator<SpacyTokenInfo> iterator; List<SpacyTokenInfo> special = this.specialCases.get(word); if (special != null) { Iterable<SpacyTokenInfo> $this$forEach$iv = special; int $i$f$forEach = 0; iterator = $this$forEach$iv.iterator(); } else { splits.getWordTokens().add(word); return splits.toList(); }  if (iterator.hasNext()) { Object element$iv = iterator.next(); SpacyTokenInfo it = (SpacyTokenInfo)element$iv; int $i$a$-forEach-SpacyTokenizerFast$finalizeSplit$1 = 0;
/*     */       splits.getWordTokens().add(it.getOrth()); }
/*     */      }
/*     */ 
/*     */   
/*     */   private final List<Tokenizer.Token> tokenizeToken(String word) {
/*     */     TokenSplits splits = new TokenSplits();
/*     */     String remainingWord = word;
/*     */     if (isSpecialOrFinal(remainingWord))
/*     */       return finalizeSplit(splits, remainingWord); 
/*     */     if (this.oneCharSuffixes.contains(Character.valueOf(StringsKt.last(remainingWord)))) {
/*     */       Intrinsics.checkNotNullExpressionValue(remainingWord.substring(0, remainingWord.length() - 1), "substring(...)");
/*     */       String minusSuffix = remainingWord.substring(0, remainingWord.length() - 1);
/*     */       if (isSpecialOrFinal(minusSuffix)) {
/*     */         Intrinsics.checkNotNullExpressionValue(remainingWord.substring(remainingWord.length() - 1), "substring(...)");
/*     */         splits.getSuffixes().add(remainingWord.substring(remainingWord.length() - 1));
/*     */         return finalizeSplit(splits, minusSuffix);
/*     */       } 
/*     */     } 
/*     */     while ((remainingWord.length() > 0)) {
/*     */       if (isSpecialOrFinal(remainingWord))
/*     */         return finalizeSplit(splits, remainingWord); 
/*     */       int prefixLength = findPrefix(remainingWord);
/*     */       if (prefixLength == 0)
/*     */         break; 
/*     */       Intrinsics.checkNotNullExpressionValue(remainingWord.substring(0, prefixLength), "substring(...)");
/*     */       splits.getPrefixes().add(remainingWord.substring(0, prefixLength));
/*     */       Intrinsics.checkNotNullExpressionValue(remainingWord.substring(prefixLength), "substring(...)");
/*     */       remainingWord = remainingWord.substring(prefixLength);
/*     */     } 
/*     */     while ((remainingWord.length() > 0)) {
/*     */       if (isSpecialOrFinal(remainingWord))
/*     */         return finalizeSplit(splits, remainingWord); 
/*     */       int suffixLength = findSuffix(remainingWord);
/*     */       if (suffixLength == 0)
/*     */         break; 
/*     */       Intrinsics.checkNotNullExpressionValue(remainingWord.substring(remainingWord.length() - suffixLength), "substring(...)");
/*     */       splits.getSuffixes().add(remainingWord.substring(remainingWord.length() - suffixLength));
/*     */       Intrinsics.checkNotNullExpressionValue(remainingWord.substring(0, remainingWord.length() - suffixLength), "substring(...)");
/*     */       remainingWord = remainingWord.substring(0, remainingWord.length() - suffixLength);
/*     */     } 
/*     */     if (isSpecialOrFinal(remainingWord) || this.specialCases.urlMatch(remainingWord))
/*     */       return finalizeSplit(splits, remainingWord); 
/*     */     splits.getWordTokens().addAll(splitInfixes(remainingWord));
/*     */     return splits.toList();
/*     */   }
/*     */   
/*     */   private final boolean isSpecialOrFinal(String token) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield specialCases : Lai/grazie/nlp/tokenizer/spacy/SpacyTokenizerSpecialCases;
/*     */     //   4: aload_1
/*     */     //   5: invokevirtual get : (Ljava/lang/String;)Ljava/util/List;
/*     */     //   8: ifnonnull -> 72
/*     */     //   11: aload_1
/*     */     //   12: checkcast java/lang/CharSequence
/*     */     //   15: astore_2
/*     */     //   16: iconst_0
/*     */     //   17: istore_3
/*     */     //   18: iconst_0
/*     */     //   19: istore #4
/*     */     //   21: iload #4
/*     */     //   23: aload_2
/*     */     //   24: invokeinterface length : ()I
/*     */     //   29: if_icmpge -> 68
/*     */     //   32: aload_2
/*     */     //   33: iload #4
/*     */     //   35: invokeinterface charAt : (I)C
/*     */     //   40: istore #5
/*     */     //   42: iload #5
/*     */     //   44: istore #6
/*     */     //   46: iconst_0
/*     */     //   47: istore #7
/*     */     //   49: iload #6
/*     */     //   51: invokestatic isLetter : (C)Z
/*     */     //   54: nop
/*     */     //   55: ifne -> 62
/*     */     //   58: iconst_0
/*     */     //   59: goto -> 69
/*     */     //   62: iinc #4, 1
/*     */     //   65: goto -> 21
/*     */     //   68: iconst_1
/*     */     //   69: ifeq -> 76
/*     */     //   72: iconst_1
/*     */     //   73: goto -> 77
/*     */     //   76: iconst_0
/*     */     //   77: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #286	-> 0
/*     */     //   #376	-> 18
/*     */     //   #286	-> 49
/*     */     //   #286	-> 54
/*     */     //   #376	-> 55
/*     */     //   #377	-> 68
/*     */     //   #286	-> 69
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   49	6	7	$i$a$-all-SpacyTokenizerFast$isSpecialOrFinal$1	I
/*     */     //   46	9	6	it	C
/*     */     //   42	20	5	element$iv	C
/*     */     //   18	51	3	$i$f$all	I
/*     */     //   16	53	2	$this$all$iv	Ljava/lang/CharSequence;
/*     */     //   0	78	0	this	Lai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast;
/*     */     //   0	78	1	token	Ljava/lang/String;
/*     */   }
/*     */   
/*     */   private final int findPrefix(String tok) {
/*     */     MatchResult match = Regex.find$default(this.prefix, tok, 0, 2, null);
/*     */     return (match == null) ? 0 : (RangesKt.last((IntProgression)match.getRange()) + 1 - RangesKt.first((IntProgression)match.getRange()));
/*     */   }
/*     */   
/*     */   private final int findSuffix(String tok) {
/*     */     MatchResult match = Regex.find$default(this.suffix, tok, 0, 2, null);
/*     */     return (match == null) ? 0 : (RangesKt.last((IntProgression)match.getRange()) + 1 - RangesKt.first((IntProgression)match.getRange()));
/*     */   }
/*     */   
/*     */   private final List<String> splitInfixes(String remainingWord) {
/*     */     List<String> tokens = new ArrayList();
/*     */     Sequence<MatchResult> matches = findInfix(remainingWord);
/*     */     int start = 0;
/*     */     for (MatchResult match : matches) {
/*     */       int startInfix = match.getRange().getFirst();
/*     */       int endInfix = match.getRange().getLast() + 1;
/*     */       if (startInfix == 0)
/*     */         continue; 
/*     */       if (startInfix != start) {
/*     */         Intrinsics.checkNotNullExpressionValue(remainingWord.substring(start, startInfix), "substring(...)");
/*     */         String spanInfix = remainingWord.substring(start, startInfix);
/*     */         tokens.add(spanInfix);
/*     */       } 
/*     */       if (startInfix != endInfix) {
/*     */         Intrinsics.checkNotNullExpressionValue(remainingWord.substring(startInfix, endInfix), "substring(...)");
/*     */         String infix = remainingWord.substring(startInfix, endInfix);
/*     */         tokens.add(infix);
/*     */       } 
/*     */       start = endInfix;
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(remainingWord.substring(start), "substring(...)");
/*     */     String span = remainingWord.substring(start);
/*     */     if ((span.length() > 0))
/*     */       tokens.add(span); 
/*     */     return tokens;
/*     */   }
/*     */   
/*     */   private final Sequence<MatchResult> findInfix(String tok) {
/*     */     return Regex.findAll$default(this.infix, tok, 0, 2, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\spacy\SpacyTokenizerFast.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */