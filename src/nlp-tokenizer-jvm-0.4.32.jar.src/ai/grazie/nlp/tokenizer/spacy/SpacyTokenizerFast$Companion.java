/*     */ package ai.grazie.nlp.tokenizer.spacy;
/*     */ 
/*     */ import ai.grazie.nlp.langs.Language;
/*     */ import ai.grazie.nlp.tokenizer.spacy.de.SpacyGerman;
/*     */ import ai.grazie.nlp.tokenizer.spacy.de.SpacyGermanTokenizerExceptions;
/*     */ import ai.grazie.nlp.tokenizer.spacy.en.SpacyEnglish;
/*     */ import ai.grazie.nlp.tokenizer.spacy.en.SpacyEnglishTokenizerExceptions;
/*     */ import ai.grazie.nlp.tokenizer.spacy.ru.SpacyRussian;
/*     */ import ai.grazie.nlp.tokenizer.spacy.ru.SpacyRussianTokenizerExceptions;
/*     */ import ai.grazie.nlp.tokenizer.spacy.uk.SpacyUkrainian;
/*     */ import ai.grazie.nlp.tokenizer.spacy.uk.SpacyUkrainianTokenizerExceptions;
/*     */ import ai.grazie.nlp.utils.normalization.AggregatedNormalizer;
/*     */ import ai.grazie.nlp.utils.normalization.CapsNormalizer;
/*     */ import ai.grazie.nlp.utils.normalization.Normalizer;
/*     */ import ai.grazie.nlp.utils.normalization.UnicodePunctuationNormalizer;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020 \n\002\020\016\n\002\b\006\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J(\020\005\032\0020\0062\006\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\016\b\002\020\013\032\b\022\004\022\0020\r0\fJ*\020\016\032\0020\0062\b\b\002\020\t\032\0020\n2\016\b\002\020\013\032\b\022\004\022\0020\r0\f2\b\b\002\020\017\032\0020\nJ*\020\020\032\0020\0062\b\b\002\020\t\032\0020\n2\016\b\002\020\013\032\b\022\004\022\0020\r0\f2\b\b\002\020\017\032\0020\nJ \020\021\032\0020\0062\b\b\002\020\t\032\0020\n2\016\b\002\020\013\032\b\022\004\022\0020\r0\fJ \020\022\032\0020\0062\b\b\002\020\t\032\0020\n2\016\b\002\020\013\032\b\022\004\022\0020\r0\fR\016\020\003\032\0020\004X\004¢\006\002\n\000¨\006\023"}, d2 = {"Lai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast$Companion;", "", "()V", "logger", "Lai/grazie/utils/mpp/MPPLogger;", "load", "Lai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast;", "language", "Lai/grazie/nlp/langs/Language;", "replaceApostropheWithQuote", "", "additionalPrefixes", "", "", "loadEnglish", "useNewAffixes", "loadGerman", "loadRussian", "loadUkrainian", "nlp-tokenizer"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @NotNull
/*     */   public final SpacyTokenizerFast load(@NotNull Language language, boolean replaceApostropheWithQuote, @NotNull List additionalPrefixes) {
/*  58 */     Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(additionalPrefixes, "additionalPrefixes"); switch (WhenMappings.$EnumSwitchMapping$0[language.ordinal()]) { case 1: 
/*     */       case 2: 
/*     */       case 3: 
/*     */       case 4:
/*  62 */        }  throw new IllegalStateException(
/*  63 */         "Language is not supported".toString());
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final SpacyTokenizerFast loadEnglish(boolean replaceApostropheWithQuote, @NotNull List additionalPrefixes, boolean useNewAffixes) {
/*  69 */     Intrinsics.checkNotNullParameter(additionalPrefixes, "additionalPrefixes");
/*  70 */     Normalizer[] arrayOfNormalizer = new Normalizer[2]; arrayOfNormalizer[0] = (Normalizer)new UnicodePunctuationNormalizer(replaceApostropheWithQuote); arrayOfNormalizer[1] = 
/*  71 */       (Normalizer)new CapsNormalizer();
/*     */     AggregatedNormalizer preNormalizer = new AggregatedNormalizer(arrayOfNormalizer);
/*  73 */     List<String> prefixes = additionalPrefixes.isEmpty() ? SpacyEnglish.INSTANCE.getPrefixes() : CollectionsKt.plus(SpacyEnglish.INSTANCE.getPrefixes(), additionalPrefixes);
/*  74 */     return new SpacyTokenizerFast(
/*  75 */         SpacyBaseLanguage.INSTANCE.compilePrefix(prefixes), 
/*  76 */         SpacyBaseLanguage.INSTANCE.compileInfix(CollectionsKt.plus(SpacyEnglish.INSTANCE.getInfixes(), useNewAffixes ? SpacyEnglish.INSTANCE.getNewInfixes() : CollectionsKt.emptyList())), 
/*  77 */         SpacyBaseLanguage.INSTANCE.compileSuffix(CollectionsKt.plus(SpacyEnglish.INSTANCE.getSuffixes(), useNewAffixes ? SpacyEnglish.INSTANCE.getNewSuffixes() : CollectionsKt.emptyList())), 
/*  78 */         new SpacyTokenizerSpecialCases(
/*  79 */           SpacyBaseLanguage.BaseExceptions.INSTANCE.getExceptions(), 
/*  80 */           SpacyEnglishTokenizerExceptions.INSTANCE.getExceptions()), 
/*     */         
/*  82 */         preNormalizer);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final SpacyTokenizerFast loadGerman(boolean replaceApostropheWithQuote, @NotNull List additionalPrefixes, boolean useNewAffixes) {
/*  87 */     Intrinsics.checkNotNullParameter(additionalPrefixes, "additionalPrefixes");
/*  88 */     Normalizer[] arrayOfNormalizer = new Normalizer[2]; arrayOfNormalizer[0] = (Normalizer)new UnicodePunctuationNormalizer(replaceApostropheWithQuote); arrayOfNormalizer[1] = 
/*  89 */       (Normalizer)new CapsNormalizer();
/*     */     AggregatedNormalizer preNormalizer = new AggregatedNormalizer(arrayOfNormalizer);
/*  91 */     List<String> prefixes = additionalPrefixes.isEmpty() ? SpacyGerman.INSTANCE.getPrefixes() : CollectionsKt.plus(SpacyGerman.INSTANCE.getPrefixes(), additionalPrefixes);
/*  92 */     return new SpacyTokenizerFast(
/*  93 */         SpacyBaseLanguage.INSTANCE.compilePrefix(prefixes), 
/*  94 */         SpacyBaseLanguage.INSTANCE.compileInfix(useNewAffixes ? SpacyGerman.INSTANCE.getNewInfixes() : SpacyGerman.INSTANCE.getInfixes()), 
/*  95 */         SpacyBaseLanguage.INSTANCE.compileSuffix(SpacyGerman.INSTANCE.getSuffixes()), 
/*  96 */         new SpacyTokenizerSpecialCases(
/*  97 */           SpacyBaseLanguage.BaseExceptions.INSTANCE.getExceptions(), 
/*  98 */           SpacyGermanTokenizerExceptions.INSTANCE.getExceptions()), 
/*     */         
/* 100 */         preNormalizer);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final SpacyTokenizerFast loadRussian(boolean replaceApostropheWithQuote, @NotNull List additionalPrefixes) {
/* 105 */     Intrinsics.checkNotNullParameter(additionalPrefixes, "additionalPrefixes");
/* 106 */     Normalizer[] arrayOfNormalizer = new Normalizer[2]; arrayOfNormalizer[0] = (Normalizer)new UnicodePunctuationNormalizer(replaceApostropheWithQuote); arrayOfNormalizer[1] = 
/* 107 */       (Normalizer)new CapsNormalizer();
/*     */     AggregatedNormalizer preNormalizer = new AggregatedNormalizer(arrayOfNormalizer);
/* 109 */     List<String> prefixes = additionalPrefixes.isEmpty() ? SpacyRussian.INSTANCE.getPrefixes() : CollectionsKt.plus(SpacyRussian.INSTANCE.getPrefixes(), additionalPrefixes);
/* 110 */     return new SpacyTokenizerFast(
/* 111 */         SpacyBaseLanguage.INSTANCE.compilePrefix(prefixes), 
/* 112 */         SpacyBaseLanguage.INSTANCE.compileInfix(SpacyRussian.INSTANCE.getInfixes()), 
/* 113 */         SpacyBaseLanguage.INSTANCE.compileSuffix(SpacyRussian.INSTANCE.getSuffixes()), 
/* 114 */         new SpacyTokenizerSpecialCases(
/* 115 */           SpacyBaseLanguage.BaseExceptions.INSTANCE.getExceptions(), 
/* 116 */           SpacyRussianTokenizerExceptions.INSTANCE.getExceptions()), 
/*     */         
/* 118 */         preNormalizer);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final SpacyTokenizerFast loadUkrainian(boolean replaceApostropheWithQuote, @NotNull List additionalPrefixes) {
/* 123 */     Intrinsics.checkNotNullParameter(additionalPrefixes, "additionalPrefixes");
/* 124 */     Normalizer[] arrayOfNormalizer = new Normalizer[2]; arrayOfNormalizer[0] = (Normalizer)new UnicodePunctuationNormalizer(replaceApostropheWithQuote); arrayOfNormalizer[1] = 
/* 125 */       (Normalizer)new CapsNormalizer();
/*     */     AggregatedNormalizer preNormalizer = new AggregatedNormalizer(arrayOfNormalizer);
/* 127 */     List<String> prefixes = additionalPrefixes.isEmpty() ? SpacyUkrainian.INSTANCE.getPrefixes() : CollectionsKt.plus(SpacyUkrainian.INSTANCE.getPrefixes(), additionalPrefixes);
/* 128 */     return new SpacyTokenizerFast(
/* 129 */         SpacyBaseLanguage.INSTANCE.compilePrefix(prefixes), 
/* 130 */         SpacyBaseLanguage.INSTANCE.compileInfix(SpacyUkrainian.INSTANCE.getInfixes()), 
/* 131 */         SpacyBaseLanguage.INSTANCE.compileSuffix(SpacyUkrainian.INSTANCE.getSuffixes()), 
/* 132 */         new SpacyTokenizerSpecialCases(
/* 133 */           SpacyBaseLanguage.BaseExceptions.INSTANCE.getExceptions(), 
/* 134 */           SpacyUkrainianTokenizerExceptions.INSTANCE.getExceptions()), 
/*     */         
/* 136 */         preNormalizer);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\spacy\SpacyTokenizerFast$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */