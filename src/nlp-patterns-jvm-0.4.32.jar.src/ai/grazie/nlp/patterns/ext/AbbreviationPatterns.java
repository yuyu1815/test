/*     */ package ai.grazie.nlp.patterns.ext;
/*     */ import ai.grazie.nlp.langs.Language;
/*     */ import ai.grazie.nlp.patterns.Pattern;
/*     */ import ai.grazie.text.TextRange;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\b\n\002\020\"\n\002\020\016\n\002\b\002\n\002\020 \n\002\b\023\n\002\020$\n\002\030\002\n\002\b\013\n\002\020\013\n\002\b\002\n\002\020\021\n\002\b\007\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001:\002@AB\007\b\002¢\006\002\020\002J1\0200\032\0020\0042\006\0201\032\002022\006\0203\032\002022\022\0204\032\n\022\006\b\001\022\0020\00405\"\0020\004H\002¢\006\002\0206J$\0207\032\016\022\004\022\0020&\022\004\022\0020\0040%2\006\0201\032\002022\006\0203\032\00202H\002J\020\0208\032\0020\0042\006\0209\032\0020&H\007J\020\020:\032\0020\0042\006\0209\032\0020&H\007J\020\020;\032\0020\0042\006\0209\032\0020&H\007J\034\020<\032\b\022\004\022\0020=0\0212\f\020>\032\b\022\004\022\0020=0\021H\002J\020\020?\032\0020\0042\006\0209\032\0020&H\007R\020\020\003\032\0020\0048\006X\004¢\006\002\n\000R\020\020\005\032\0020\0048\006X\004¢\006\002\n\000R\020\020\006\032\0020\0048\006X\004¢\006\002\n\000R\020\020\007\032\0020\0048\006X\004¢\006\002\n\000R\020\020\b\032\0020\0048\006X\004¢\006\002\n\000R\020\020\t\032\0020\0048\006X\004¢\006\002\n\000R\016\020\n\032\0020\004X\004¢\006\002\n\000R\016\020\013\032\0020\004X\004¢\006\002\n\000R\024\020\f\032\b\022\004\022\0020\0160\rX\004¢\006\002\n\000R\024\020\017\032\b\022\004\022\0020\0160\rX\004¢\006\002\n\000R\026\020\020\032\b\022\004\022\0020\0160\0218\006X\004¢\006\002\n\000R\027\020\022\032\b\022\004\022\0020\0160\021¢\006\b\n\000\032\004\b\023\020\024R\027\020\025\032\b\022\004\022\0020\0160\021¢\006\b\n\000\032\004\b\026\020\024R\033\020\027\032\0020\0048BX\002¢\006\f\n\004\b\032\020\033\032\004\b\030\020\031R\033\020\034\032\0020\0048BX\002¢\006\f\n\004\b\036\020\033\032\004\b\035\020\031R\033\020\037\032\0020\0048BX\002¢\006\f\n\004\b!\020\033\032\004\b \020\031R\016\020\"\032\0020\004X\004¢\006\002\n\000R\024\020#\032\b\022\004\022\0020\0160\rX\004¢\006\002\n\000R'\020$\032\016\022\004\022\0020&\022\004\022\0020\0040%8BX\002¢\006\f\n\004\b)\020\033\032\004\b'\020(R'\020*\032\016\022\004\022\0020&\022\004\022\0020\0040%8BX\002¢\006\f\n\004\b,\020\033\032\004\b+\020(R'\020-\032\016\022\004\022\0020&\022\004\022\0020\0040%8BX\002¢\006\f\n\004\b/\020\033\032\004\b.\020(¨\006B"}, d2 = {"Lai/grazie/nlp/patterns/ext/AbbreviationPatterns;", "", "()V", "All", "Lai/grazie/nlp/patterns/Pattern;", "English", "German", "International", "Russian", "Ukrainian", "UpperCaseSequence", "cyrillicSIUnits", "enHonorifics", "", "", "enNameSuffixes", "germanMistakenlyDotted", "", "germanMonthsFull", "getGermanMonthsFull", "()Ljava/util/List;", "germanMonthsShort", "getGermanMonthsShort", "internationalOnlyPatternForSentenceTokenizer", "getInternationalOnlyPatternForSentenceTokenizer", "()Lai/grazie/nlp/patterns/Pattern;", "internationalOnlyPatternForSentenceTokenizer$delegate", "Lkotlin/Lazy;", "internationalOnlyPatternForSpeller", "getInternationalOnlyPatternForSpeller", "internationalOnlyPatternForSpeller$delegate", "internationalOnlyPatternWithPunctCaseSensitive", "getInternationalOnlyPatternWithPunctCaseSensitive", "internationalOnlyPatternWithPunctCaseSensitive$delegate", "latinGreekSIUnits", "numberAbbrs", "relevantPatternsForSentenceTokenizer", "", "Lai/grazie/nlp/langs/Language;", "getRelevantPatternsForSentenceTokenizer", "()Ljava/util/Map;", "relevantPatternsForSentenceTokenizer$delegate", "relevantPatternsForSpeller", "getRelevantPatternsForSpeller", "relevantPatternsForSpeller$delegate", "relevantPatternsWithPunctCaseSensitive", "getRelevantPatternsWithPunctCaseSensitive", "relevantPatternsWithPunctCaseSensitive$delegate", "createRelevantPattern", "caseSensitive", "", "onlyWithPunct", "components", "", "(ZZ[Lai/grazie/nlp/patterns/Pattern;)Lai/grazie/nlp/patterns/Pattern;", "createRelevantPatterns", "forSentenceTokenization", "language", "forSentenceTokenizer", "forSpeller", "removeSubranges", "Lai/grazie/text/TextRange;", "ranges", "withPunctCaseSensitive", "AbbreviationPattern", "MatchingParameters", "nlp-patterns"})
/*     */ @SourceDebugExtension({"SMAP\nAbbreviationPatterns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbbreviationPatterns.kt\nai/grazie/nlp/patterns/ext/AbbreviationPatterns\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,528:1\n1368#2:529\n1454#2,5:530\n808#2,11:535\n1485#2:546\n1510#2,3:547\n1513#2,3:557\n1246#2,2:562\n1368#2:564\n1454#2,2:565\n774#2:567\n865#2,2:568\n1456#2,3:570\n1249#2:573\n1557#2:584\n1628#2,3:585\n1557#2:591\n1628#2,3:592\n1557#2:595\n1628#2,3:596\n1557#2:599\n1628#2,3:600\n1368#2:603\n1454#2,2:604\n1557#2:606\n1628#2,3:607\n1456#2,3:610\n1557#2:613\n1628#2,3:614\n1557#2:617\n1628#2,3:618\n1557#2:621\n1628#2,3:622\n1557#2:625\n1628#2,3:626\n1557#2:629\n1628#2,3:630\n774#2:633\n865#2,2:634\n381#3,7:550\n462#3:560\n412#3:561\n136#4,9:574\n216#4:583\n217#4:589\n145#4:590\n1#5:588\n1#5:636\n*S KotlinDebug\n*F\n+ 1 AbbreviationPatterns.kt\nai/grazie/nlp/patterns/ext/AbbreviationPatterns\n*L\n372#1:529\n372#1:530,5\n373#1:535,11\n374#1:546\n374#1:547,3\n374#1:557,3\n375#1:562,2\n375#1:564\n375#1:565,2\n375#1:567\n375#1:568,2\n375#1:570,3\n375#1:573\n376#1:584\n376#1:585,3\n29#1:591\n29#1:592,3\n109#1:595\n109#1:596,3\n195#1:599\n195#1:600,3\n253#1:603\n253#1:604,2\n253#1:606\n253#1:607,3\n253#1:610,3\n253#1:613\n253#1:614,3\n253#1:617\n253#1:618,3\n260#1:621\n260#1:622,3\n281#1:625\n281#1:626,3\n315#1:629\n315#1:630,3\n318#1:633\n318#1:634,2\n374#1:550,7\n375#1:560\n375#1:561\n376#1:574,9\n376#1:583\n376#1:589\n376#1:590\n376#1:588\n*E\n"})
/*     */ public final class AbbreviationPatterns {
/*     */   @NotNull
/*  16 */   public static final AbbreviationPatterns INSTANCE = new AbbreviationPatterns(); @NotNull private static final Set<String> enHonorifics; @NotNull private static final Set<String> enNameSuffixes; @NotNull private static final Set<String> numberAbbrs; @JvmField @NotNull public static final Pattern International; @NotNull private static final Pattern latinGreekSIUnits; static { String[] arrayOfString2 = new String[4]; arrayOfString2[0] = "Mr"; arrayOfString2[1] = "Ms"; arrayOfString2[2] = "Mrs"; arrayOfString2[3] = "Mx"; enHonorifics = SetsKt.setOf((Object[])arrayOfString2);
/*  17 */     arrayOfString2 = new String[6]; arrayOfString2[0] = "Jr"; arrayOfString2[1] = "Sr"; arrayOfString2[2] = "Rev"; arrayOfString2[3] = "Revd"; arrayOfString2[4] = "Jnr"; arrayOfString2[5] = "Snr"; enNameSuffixes = SetsKt.setOf((Object[])arrayOfString2);
/*  18 */     arrayOfString2 = new String[2]; arrayOfString2[0] = "no."; arrayOfString2[1] = "nr."; numberAbbrs = SetsKt.setOf((Object[])arrayOfString2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  24 */     arrayOfString2 = new String[17]; arrayOfString2[0] = "s.r.o."; arrayOfString2[1] = "Ltd."; arrayOfString2[2] = "Co."; arrayOfString2[3] = "Corp."; arrayOfString2[4] = "Inc."; arrayOfString2[5] = "Bros."; arrayOfString2[6] = "p.a."; arrayOfString2[7] = "E.coli"; arrayOfString2[8] = "St."; arrayOfString2[9] = "vs."; arrayOfString2[10] = "etc."; arrayOfString2[11] = "max."; arrayOfString2[12] = "min."; arrayOfString2[13] = 
/*  25 */       "fixup!";
/*  26 */     arrayOfString2[14] = "e.t.c."; arrayOfString2[15] = "et al."; arrayOfString2[16] = "et.al.";
/*     */ 
/*     */     
/*  29 */     Set set1 = SetsKt.plus(enHonorifics, enNameSuffixes), set4 = SetsKt.plus(SetsKt.setOf((Object[])arrayOfString2), numberAbbrs); MatchingParameters matchingParameters3 = new MatchingParameters(true, false, 2, null); int j = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 591 */     Set set2 = set1; Collection<String> collection1 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set1, 10)); int k = 0;
/* 592 */     for (Object item$iv$iv : set2) {
/* 593 */       String str1 = (String)item$iv$iv; Collection<String> collection9 = collection1; int $i$a$-map-AbbreviationPatterns$International$1 = 0; String str2 = str1 + "."; collection9.add(str2);
/* 594 */     }  List list15 = (List)collection1; Set<String> set5 = SetsKt.plus(set4, list15); MatchingParameters matchingParameters4 = matchingParameters3; International = new AbbreviationPattern(matchingParameters4, set5); Regex regex2 = new Regex("([QRYZEPTGMkhdcmμµnpf]|da)?(mol|cd|rad|sr|Hz|Pa|Wb|lm|lx|Bq|Sv|kat|[mgslAKNCVFSΩTHJWLℓM])"); latinGreekSIUnits = (new AbbreviationPatterns$latinGreekSIUnits$1(regex2)).beforeWordBoundary(); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/ext/AbbreviationPatterns$latinGreekSIUnits$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"}) @SourceDebugExtension({"SMAP\nAbbreviationPatterns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbbreviationPatterns.kt\nai/grazie/nlp/patterns/ext/AbbreviationPatterns$latinGreekSIUnits$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,528:1\n774#2:529\n865#2,2:530\n*S KotlinDebug\n*F\n+ 1 AbbreviationPatterns.kt\nai/grazie/nlp/patterns/ext/AbbreviationPatterns$latinGreekSIUnits$1\n*L\n35#1:529\n35#1:530,2\n*E\n"}) public static final class AbbreviationPatterns$latinGreekSIUnits$1 extends RegexPattern {
/* 595 */     AbbreviationPatterns$latinGreekSIUnits$1(Regex $super_call_param$1) { super($super_call_param$1); } public List<TextRange> find(CharSequence text) { Intrinsics.checkNotNullParameter(text, "text"); Iterable $this$filter$iv = super.find(text); int $i$f$filter = 0; Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0; for (Object element$iv$iv : iterable1) { TextRange it = (TextRange)element$iv$iv; int $i$a$-filter-AbbreviationPatterns$latinGreekSIUnits$1$find$1 = 0; if ((Pattern.Companion.isWordBoundaryBefore(text, it.getStart()) || (it.getStart() > 0 && Character.isDigit(text.charAt(it.getStart() - 1))))) destination$iv$iv.add(element$iv$iv);  }  return (List)destination$iv$iv; } } @NotNull private static final Pattern cyrillicSIUnits = (new RegexPattern(new Regex("(да|мк|[змнпфагкдсМГТПЭЗИ])?(кг|кд|моль|рад|ср|Гц|Дж|Вт|Па|лм|лк|Кл|Ом|Вб|Тл|Гн|См|Бк|Гр|Зв|кат|[мсАКНВФ])"))).withWordBoundariesAround(); @JvmField @NotNull public static final Pattern English; @JvmField @NotNull public static final Pattern Russian; @JvmField @NotNull public static final Pattern Ukrainian; @NotNull private static final List<String> germanMonthsShort; @NotNull private static final List<String> germanMonthsFull; @JvmField @NotNull public static final List<String> germanMistakenlyDotted; @JvmField @NotNull public static final Pattern German; @NotNull private static final Pattern UpperCaseSequence; @JvmField @NotNull public static final Pattern All; static { AbbreviationPatterns abbreviationPatterns2 = INSTANCE, $this$English_u24lambda_u242 = abbreviationPatterns2; int $i$a$-run-AbbreviationPatterns$English$1 = 0; String[] arrayOfString6 = new String[391]; arrayOfString6[0] = "BAcc"; arrayOfString6[1] = "B.Acy"; arrayOfString6[2] = "B.Acc."; arrayOfString6[3] = "B.Accty."; arrayOfString6[4] = "BASc"; arrayOfString6[5] = "B.AS."; arrayOfString6[6] = "BAS"; arrayOfString6[7] = "BSAS"; arrayOfString6[8] = "B.ASc."; arrayOfString6[9] = "BAppSc"; arrayOfString6[10] = "BArch"; arrayOfString6[11] = "B.Arch."; arrayOfString6[12] = "BA"; arrayOfString6[13] = "B.A."; arrayOfString6[14] = "AB"; arrayOfString6[15] = "A.B."; arrayOfString6[16] = "BBA"; arrayOfString6[17] = "B.B.A."; arrayOfString6[18] = "BOptom"; arrayOfString6[19] = "BDS"; arrayOfString6[20] = "BChD"; arrayOfString6[21] = "BDentS"; arrayOfString6[22] = "BDes"; arrayOfString6[23] = "B.Des."; arrayOfString6[24] = "B.Design"; arrayOfString6[25] = "BD"; arrayOfString6[26] = "BDIV"; arrayOfString6[27] = "BScEcon"; arrayOfString6[28] = "BEc"; arrayOfString6[29] = "BA"; arrayOfString6[30] = "BScEcon"; arrayOfString6[31] = "BSc"; arrayOfString6[32] = "BSSc"; arrayOfString6[33] = "BEconSc"; arrayOfString6[34] = "BEd"; arrayOfString6[35] = "B.Ed"; arrayOfString6[36] = "BEng"; arrayOfString6[37] = "B.Eng."; arrayOfString6[38] = "BFin"; arrayOfString6[39] = "BFA"; arrayOfString6[40] = "BFA"; arrayOfString6[41] = "B.F.A."; arrayOfString6[42] = "BHSc"; arrayOfString6[43] = "LLB"; arrayOfString6[44] = "LL.B."; arrayOfString6[45] = "B.L"; arrayOfString6[46] = "BMedSci"; arrayOfString6[47] = "BMedSc"; arrayOfString6[48] = "BMSc"; arrayOfString6[49] = "BSci"; arrayOfString6[50] = "BM"; arrayOfString6[51] = "BMBS"; arrayOfString6[52] = "MBBS"; arrayOfString6[53] = "MBChB"; arrayOfString6[54] = "MBBCh"; arrayOfString6[55] = "MBBChir"; arrayOfString6[56] = "BMBCh"; arrayOfString6[57] = "MB,BChir"; arrayOfString6[58] = "BMid"; arrayOfString6[59] = "BMidWif"; arrayOfString6[60] = "BMus"; arrayOfString6[61] = "B.Mus."; arrayOfString6[62] = "Mus.B."; arrayOfString6[63] = "Mus.Bac."; arrayOfString6[64] = "BNurs"; arrayOfString6[65] = "BN"; arrayOfString6[66] = "BOst"; arrayOfString6[67] = "BOstMed"; arrayOfString6[68] = "BSc"; arrayOfString6[69] = "BSc"; arrayOfString6[70] = "B.S."; arrayOfString6[71] = "BS"; arrayOfString6[72] = "B.Sc."; arrayOfString6[73] = "Bc"; arrayOfString6[74] = "S.B."; arrayOfString6[75] = "SB"; arrayOfString6[76] = "Sc.B."; arrayOfString6[77] = "BSocSc"; arrayOfString6[78] = "B.Soc.Sc."; arrayOfString6[79] = "B.Soc.Sci."; arrayOfString6[80] = "BSW"; arrayOfString6[81] = "BTechEd"; arrayOfString6[82] = "B.Tech."; arrayOfString6[83] = "BTh"; arrayOfString6[84] = "B.Th."; arrayOfString6[85] = "Th.B."; arrayOfString6[86] = "BTheol"; arrayOfString6[87] = "BVetMed"; arrayOfString6[88] = "BVMBVS"; arrayOfString6[89] = "BVMS"; arrayOfString6[90] = "BVM&S"; arrayOfString6[91] = "BVSc"; arrayOfString6[92] = "BVSC"; arrayOfString6[93] = "BVMedSci"; arrayOfString6[94] = "BTEC"; arrayOfString6[95] = "CertHE"; arrayOfString6[96] = "Cert.HE"; arrayOfString6[97] = "Cert ED"; arrayOfString6[98] = "CertED"; arrayOfString6[99] = "CPE"; arrayOfString6[100] = "DASE"; arrayOfString6[101] = "DipHE"; arrayOfString6[102] = "DArts"; arrayOfString6[103] = "DBMS"; arrayOfString6[104] = "DBEnv"; arrayOfString6[105] = "DBA"; arrayOfString6[106] = "D.B.A."; arrayOfString6[107] = "DChiro"; arrayOfString6[108] = "DCL"; arrayOfString6[109] = "DClinDent"; arrayOfString6[110] = "DClinDent"; arrayOfString6[111] = "DClinP"; arrayOfString6[112] = "DClinPsych"; arrayOfString6[113] = "DClinPsy"; arrayOfString6[114] = "ClinPsyD"; arrayOfString6[115] = "DClinRes"; arrayOfString6[116] = "DCaM"; arrayOfString6[117] = "DCommEd"; arrayOfString6[118] = "DCounsPych"; arrayOfString6[119] = "DCounsPsych"; arrayOfString6[120] = "DCrimJ"; arrayOfString6[121] = "DMD"; arrayOfString6[122] = "DDS"; arrayOfString6[123] = "DDSc"; arrayOfString6[124] = "DD"; arrayOfString6[125] = "DDes"; arrayOfString6[126] = "DEd"; arrayOfString6[127] = "EdD"; arrayOfString6[128] = "DrPS"; arrayOfString6[129] = "EdChPsychD"; arrayOfString6[130] = "DEdChPsy"; arrayOfString6[131] = "DEdPsy"; arrayOfString6[132] = "EngD"; arrayOfString6[133] = "EntD"; arrayOfString6[134] = "ForenClinPsyD"; arrayOfString6[135] = "DForensPsy"; arrayOfString6[136] = "ForenPsyD"; arrayOfString6[137] = "DHealth"; arrayOfString6[138] = "DHealthPsy"; arrayOfString6[139] = "HScD"; arrayOfString6[140] = "DHSc"; arrayOfString6[141] = "JD"; arrayOfString6[142] = "LLD"; arrayOfString6[143] = "DLitt"; arrayOfString6[144] = "LittD"; arrayOfString6[145] = "DM"; arrayOfString6[146] = "MB"; arrayOfString6[147] = "DMin"; arrayOfString6[148] = "DMus"; arrayOfString6[149] = "MusD"; arrayOfString6[150] = "DNursSc"; arrayOfString6[151] = "PhD"; arrayOfString6[152] = "DPhil"; arrayOfString6[153] = "DPT"; arrayOfString6[154] = "DProf"; arrayOfString6[155] = "DPS"; arrayOfString6[156] = "DPsych"; arrayOfString6[157] = "Psy.D."; arrayOfString6[158] = "DrPH"; arrayOfString6[159] = "Dr.P.H."; arrayOfString6[160] = "DSc"; arrayOfString6[161] = "ScD"; arrayOfString6[162] = "DSyRM"; arrayOfString6[163] = "SocScD"; arrayOfString6[164] = "DSocSci"; arrayOfString6[165] = "DSW"; arrayOfString6[166] = "DUniv"; arrayOfString6[167] = "ThD"; arrayOfString6[168] = "DThM"; arrayOfString6[169] = "DVM"; arrayOfString6[170] = "DVS"; arrayOfString6[171] = "DVetMed"; arrayOfString6[172] = "ELT Management"; arrayOfString6[173] = "EM"; arrayOfString6[174] = "EMBA"; arrayOfString6[175] = "FD"; arrayOfString6[176] = "FDs"; arrayOfString6[177] = "FDEd"; arrayOfString6[178] = "FdEd"; arrayOfString6[179] = "FdA"; arrayOfString6[180] = "FDA"; arrayOfString6[181] = "FDArts"; arrayOfString6[182] = "FDEng"; arrayOfString6[183] = "FdSc"; arrayOfString6[184] = "GDL"; arrayOfString6[185] = "HNC"; arrayOfString6[186] = "HND"; arrayOfString6[187] = "HNDip"; arrayOfString6[188] = "IPML"; arrayOfString6[189] = "LPC"; arrayOfString6[190] = "MJur"; arrayOfString6[191] = "M.Jur."; arrayOfString6[192] = "Mag.Jur."; arrayOfString6[193] = "Mag.iur."; arrayOfString6[194] = "MART"; arrayOfString6[195] = "Mart"; arrayOfString6[196] = "MChem"; arrayOfString6[197] = "MEB"; arrayOfString6[198] = "MHM"; arrayOfString6[199] = "MAcc"; arrayOfString6[200] = "MAc"; arrayOfString6[201] = "MAcy"; arrayOfString6[202] = "MMet"; arrayOfString6[203] = "MAnth"; arrayOfString6[204] = "MArch"; arrayOfString6[205] = "M.Arch."; arrayOfString6[206] = "MA"; arrayOfString6[207] = "M.A."; arrayOfString6[208] = "MBiochem"; arrayOfString6[209] = "MBioch"; arrayOfString6[210] = "MBiolSci"; arrayOfString6[211] = "MBiol"; arrayOfString6[212] = "MBio"; arrayOfString6[213] = "MBioMed"; arrayOfString6[214] = "MBioms"; arrayOfString6[215] = "MBIOMS"; arrayOfString6[216] = "MBus"; arrayOfString6[217] = "MBA"; arrayOfString6[218] = "M.B.A."; arrayOfString6[219] = "MChemPhys"; arrayOfString6[220] = "MChiro"; arrayOfString6[221] = "MClass"; arrayOfString6[222] = "MClinDent"; arrayOfString6[223] = "MClinEd"; arrayOfString6[224] = "MOptom"; arrayOfString6[225] = "MClin Res"; arrayOfString6[226] = "MClinRes"; arrayOfString6[227] = "MMathComp"; arrayOfString6[228] = "MMathCompSci"; arrayOfString6[229] = "MCompPhil"; arrayOfString6[230] = "MComp"; arrayOfString6[231] = "MCompSci"; arrayOfString6[232] = "MInf"; arrayOfString6[233] = "MCouns"; arrayOfString6[234] = "MC"; arrayOfString6[235] = "M.C."; arrayOfString6[236] = "M.Couns."; arrayOfString6[237] = "MA"; arrayOfString6[238] = "MDPH"; arrayOfString6[239] = "MDSc"; arrayOfString6[240] = "MDS"; arrayOfString6[241] = "MChd"; arrayOfString6[242] = "MChD"; arrayOfString6[243] = "MDes"; arrayOfString6[244] = "M.Des."; arrayOfString6[245] = "M.Design"; arrayOfString6[246] = "MESci"; arrayOfString6[247] = "MEarthSci"; arrayOfString6[248] = "MEarthPhys"; arrayOfString6[249] = "MEcol"; arrayOfString6[250] = "MEcon"; arrayOfString6[251] = "MEd"; arrayOfString6[252] = "M.Ed."; arrayOfString6[253] = "Ed.M."; arrayOfString6[254] = "M.A.Ed."; arrayOfString6[255] = "M.A.E."; arrayOfString6[256] = "M.S.Ed."; arrayOfString6[257] = "M.Ed.L."; arrayOfString6[258] = "M.S.E."; arrayOfString6[259] = "MA"; arrayOfString6[260] = "MEng"; arrayOfString6[261] = "MEng."; arrayOfString6[262] = "M.Eng."; arrayOfString6[263] = "MEnt"; arrayOfString6[264] = "M.Ent."; arrayOfString6[265] = "MEnvSci"; arrayOfString6[266] = "MEnv"; arrayOfString6[267] = "MFin"; arrayOfString6[268] = "M.Fin"; arrayOfString6[269] = "MiF"; arrayOfString6[270] = "MFA"; arrayOfString6[271] = "M.F.A."; arrayOfString6[272] = "MGeog"; arrayOfString6[273] = "MGeol"; arrayOfString6[274] = "MGeoPhys"; arrayOfString6[275] = "MGeophys"; arrayOfString6[276] = "MGeoSci"; arrayOfString6[277] = "MGeoscience"; arrayOfString6[278] = "MHS"; arrayOfString6[279] = "MHist"; arrayOfString6[280] = "MInnov"; arrayOfString6[281] = "MIA"; arrayOfString6[282] = "MLE"; arrayOfString6[283] = "MLaw"; arrayOfString6[284] = "LLM"; arrayOfString6[285] = "LL.M"; arrayOfString6[286] = "MLegSc"; arrayOfString6[287] = "MLitt"; arrayOfString6[288] = "MLA"; arrayOfString6[289] = "MLibArts"; arrayOfString6[290] = "MLang"; arrayOfString6[291] = "MMarBiol"; arrayOfString6[292] = "MMBiol"; arrayOfString6[293] = "MMSci"; arrayOfString6[294] = "MMkt"; arrayOfString6[295] = "MASt"; arrayOfString6[296] = "MMath"; arrayOfString6[297] = "MMathPhil"; arrayOfString6[298] = "MMathPhys"; arrayOfString6[299] = "MMath&Phys"; arrayOfString6[300] = "MMedEd"; arrayOfString6[301] = "MMedSci"; arrayOfString6[302] = "MMSPH"; arrayOfString6[303] = "MMet"; arrayOfString6[304] = "MMid"; arrayOfString6[305] = "MPrac"; arrayOfString6[306] = "MMus"; arrayOfString6[307] = "M.M."; arrayOfString6[308] = "M.Mus."; arrayOfString6[309] = "MMT"; arrayOfString6[310] = "MNatSci"; arrayOfString6[311] = "MNeuroSci"; arrayOfString6[312] = "MN"; arrayOfString6[313] = "MNurs"; arrayOfString6[314] = "MNursSci"; arrayOfString6[315] = "MNutr"; arrayOfString6[316] = "MOcean"; arrayOfString6[317] = "MOSci"; arrayOfString6[318] = "MCh Orth"; arrayOfString6[319] = "MOst"; arrayOfString6[320] = "M.Ost"; arrayOfString6[321] = "MPerf"; arrayOfString6[322] = "MPharmacol"; arrayOfString6[323] = "MPharm"; arrayOfString6[324] = "MPharmSci"; arrayOfString6[325] = "MPhil"; arrayOfString6[326] = "M.Phil."; arrayOfString6[327] = "Ph.M."; arrayOfString6[328] = "M Phil"; arrayOfString6[329] = "MPhys"; arrayOfString6[330] = "MPhyPhil"; arrayOfString6[331] = "MPlan"; arrayOfString6[332] = "MPC"; arrayOfString6[333] = "MPAc"; arrayOfString6[334] = "MPAcy"; arrayOfString6[335] = "MPAcc"; arrayOfString6[336] = "MProf"; arrayOfString6[337] = "MPsych"; arrayOfString6[338] = "PsyM"; arrayOfString6[339] = "MPA"; arrayOfString6[340] = "M.P.Adm."; arrayOfString6[341] = "M.P.A."; arrayOfString6[342] = "MPH"; arrayOfString6[343] = "M.P.H."; arrayOfString6[344] = "MPP"; arrayOfString6[345] = "MRes"; arrayOfString6[346] = "MARes"; arrayOfString6[347] = "MA"; arrayOfString6[348] = "MSc"; arrayOfString6[349] = "MScRes"; arrayOfString6[350] = "MSci"; arrayOfString6[351] = "M.S."; arrayOfString6[352] = "MS"; arrayOfString6[353] = "M.Sc."; arrayOfString6[354] = "M.Sci."; arrayOfString6[355] = "S.M."; arrayOfString6[356] = "Sc.M."; arrayOfString6[357] = "Sci.M."; arrayOfString6[358] = "MScD"; arrayOfString6[359] = "MSD"; arrayOfString6[360] = "MSPH"; arrayOfString6[361] = "MSSc"; arrayOfString6[362] = "M.Soc.Sci"; arrayOfString6[363] = "MSW"; arrayOfString6[364] = "MSt"; arrayOfString6[365] = "MCh"; arrayOfString6[366] = "Ch.M."; arrayOfString6[367] = "M.Ch."; arrayOfString6[368] = "M.Chir."; arrayOfString6[369] = "MTeach"; arrayOfString6[370] = "MTL"; arrayOfString6[371] = "MTech"; arrayOfString6[372] = "M.Tech."; arrayOfString6[373] = "MTh"; arrayOfString6[374] = "MTheol"; arrayOfString6[375] = "Th.M."; arrayOfString6[376] = "M.Th."; arrayOfString6[377] = "MVM"; arrayOfString6[378] = "Vet.M.B"; arrayOfString6[379] = "MVetPhys"; arrayOfString6[380] = "MVPH"; arrayOfString6[381] = "MVetSci"; arrayOfString6[382] = "M.Vet.Sci"; arrayOfString6[383] = "MVS"; arrayOfString6[384] = "MZOOL"; arrayOfString6[385] = "MClinSci"; arrayOfString6[386] = "OSPAP"; arrayOfString6[387] = "QCF"; arrayOfString6[388] = "TQFE"; arrayOfString6[389] = "Ph.D."; arrayOfString6[390] = "M.D."; List degrees = CollectionsKt.listOf((Object[])arrayOfString6); String[] arrayOfString9 = new String[4]; arrayOfString9[0] = "mln"; arrayOfString9[1] = "bln"; arrayOfString9[2] = "trln"; arrayOfString9[3] = "bn"; List optionallyDotted = CollectionsKt.listOf((Object[])arrayOfString9); String[] arrayOfString12 = new String[60]; arrayOfString12[0] = "Jan"; arrayOfString12[1] = "Feb"; arrayOfString12[2] = "Mar"; arrayOfString12[3] = "Apr"; arrayOfString12[4] = "Jun"; arrayOfString12[5] = "Jul"; arrayOfString12[6] = "Aug"; arrayOfString12[7] = "Sep"; arrayOfString12[8] = "Sept"; arrayOfString12[9] = "Oct"; arrayOfString12[10] = "Nov"; arrayOfString12[11] = "Dec"; arrayOfString12[12] = "Prof"; arrayOfString12[13] = "Dr"; arrayOfString12[14] = "Med"; arrayOfString12[15] = "Phil"; arrayOfString12[16] = "Sen"; arrayOfString12[17] = "Gov"; arrayOfString12[18] = "Rep"; arrayOfString12[19] = "Dem"; arrayOfString12[20] = "Brig"; arrayOfString12[21] = "Gen"; arrayOfString12[22] = "Lt"; arrayOfString12[23] = "Col"; arrayOfString12[24] = "Maj"; arrayOfString12[25] = "Capt"; arrayOfString12[26] = "Cdt"; arrayOfString12[27] = "Sgt"; arrayOfString12[28] = "Cpl"; arrayOfString12[29] = "Spc"; arrayOfString12[30] = "Pfc"; arrayOfString12[31] = "Pvt"; arrayOfString12[32] = "Ext"; arrayOfString12[33] = "E.g"; arrayOfString12[34] = "e.g"; arrayOfString12[35] = "I.e"; arrayOfString12[36] = "i.e"; arrayOfString12[37] = "p.p"; arrayOfString12[38] = "p.p.m"; arrayOfString12[39] = "etc"; arrayOfString12[40] = "v"; arrayOfString12[41] = "et al"; arrayOfString12[42] = "ca"; arrayOfString12[43] = "a.m"; arrayOfString12[44] = "p.m"; arrayOfString12[45] = "apt"; arrayOfString12[46] = "spp"; arrayOfString12[47] = "resp"; arrayOfString12[48] = "temp"; arrayOfString12[49] = "viz"; arrayOfString12[50] = "incl"; arrayOfString12[51] = "inc"; arrayOfString12[52] = "p"; arrayOfString12[53] = "pp"; arrayOfString12[54] = "U.K"; arrayOfString12[55] = "E.U"; arrayOfString12[56] = "U.S.A"; arrayOfString12[57] = "U.S"; arrayOfString12[58] = "N.Y"; arrayOfString12[59] = "W.H.O"; List list4 = CollectionsKt.plus(CollectionsKt.listOf((Object[])arrayOfString12), optionallyDotted); String[] arrayOfString15 = new String[15]; arrayOfString15[0] = "IPv4"; arrayOfString15[1] = "IPv6"; arrayOfString15[2] = "KiB"; arrayOfString15[3] = "MiB"; arrayOfString15[4] = "GiB"; arrayOfString15[5] = "TiB"; arrayOfString15[6] = "PiB"; arrayOfString15[7] = "EiB"; arrayOfString15[8] = "ZiB"; arrayOfString15[9] = "YiB"; arrayOfString15[10] = "ci"; arrayOfString15[11] = "Ωm"; arrayOfString15[12] = "σb"; arrayOfString15[13] = "σc"; arrayOfString15[14] = "σt"; List list6 = CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.listOf((Object[])arrayOfString15), optionallyDotted), enHonorifics), enNameSuffixes); List withExclamation = CollectionsKt.listOf("Yahoo!"); Pattern[] arrayOfPattern6 = new Pattern[2]; List list10 = list4; MatchingParameters matchingParameters1 = new MatchingParameters(true, true); boolean bool1 = false; Pattern[] arrayOfPattern10 = arrayOfPattern6; int i5 = 0; List list12 = list10; Collection<String> collection8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list10, 10)); int i7 = 0;
/* 596 */     for (Object item$iv$iv : list12) {
/* 597 */       String str = (String)item$iv$iv; Collection<String> collection9 = collection8; int $i$a$-map-AbbreviationPatterns$English$1$2 = 0; collection9.add(str + ".");
/* 598 */     }  List list13 = (List)collection8; List<String> list16 = CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.plus(list13, degrees), list6), withExclamation); MatchingParameters matchingParameters5 = matchingParameters1; arrayOfPattern10[bool1] = new AbbreviationPattern(matchingParameters5, list16); arrayOfPattern6[1] = latinGreekSIUnits; Pattern[] arrayOfPattern11 = arrayOfPattern6; English = (Pattern)new AbbreviationPatterns$English$1$1(arrayOfPattern11); AbbreviationPatterns $this$Russian_u24lambda_u244 = abbreviationPatterns2 = INSTANCE; int $i$a$-run-AbbreviationPatterns$Russian$1 = 0; String[] arrayOfString5 = new String[18]; arrayOfString5[0] = "нрзб"; arrayOfString5[1] = "пн"; arrayOfString5[2] = "пон"; arrayOfString5[3] = "вт"; arrayOfString5[4] = "ср"; arrayOfString5[5] = "чт"; arrayOfString5[6] = "чет"; arrayOfString5[7] = "четв"; arrayOfString5[8] = "пт"; arrayOfString5[9] = "птн"; arrayOfString5[10] = "пятн"; arrayOfString5[11] = "сб"; arrayOfString5[12] = "суб"; arrayOfString5[13] = "вс"; arrayOfString5[14] = "вос"; arrayOfString5[15] = "млн"; arrayOfString5[16] = "млрд"; arrayOfString5[17] = "трлн"; List list3 = CollectionsKt.listOf((Object[])arrayOfString5); String[] arrayOfString8 = new String[53]; arrayOfString8[0] = "Быт"; arrayOfString8[1] = "Исх"; arrayOfString8[2] = "Лев"; arrayOfString8[3] = "Числ"; arrayOfString8[4] = "Втор"; arrayOfString8[5] = "Ис"; arrayOfString8[6] = "Нав"; arrayOfString8[7] = "Суд"; arrayOfString8[8] = "Цар"; arrayOfString8[9] = "Пар"; arrayOfString8[10] = "Эзр"; arrayOfString8[11] = "Неем"; arrayOfString8[12] = "Эсф"; arrayOfString8[13] = "Иов"; arrayOfString8[14] = "Пс"; arrayOfString8[15] = "Притч"; arrayOfString8[16] = "Эккл"; arrayOfString8[17] = "Песн"; arrayOfString8[18] = "Ис"; arrayOfString8[19] = "Иер"; arrayOfString8[20] = "Плач"; arrayOfString8[21] = "Иез"; arrayOfString8[22] = "Дан"; arrayOfString8[23] = "Ос"; arrayOfString8[24] = "Иоил"; arrayOfString8[25] = "Амос"; arrayOfString8[26] = "Авд"; arrayOfString8[27] = "Ион"; arrayOfString8[28] = "Мих"; arrayOfString8[29] = "Наум"; arrayOfString8[30] = "Авв"; arrayOfString8[31] = "Соф"; arrayOfString8[32] = "Агг"; arrayOfString8[33] = "Зах"; arrayOfString8[34] = "Мал"; arrayOfString8[35] = "Мф"; arrayOfString8[36] = "Мк"; arrayOfString8[37] = "Лк"; arrayOfString8[38] = "Ин"; arrayOfString8[39] = "Деян"; arrayOfString8[40] = "Иак"; arrayOfString8[41] = "Ин"; arrayOfString8[42] = "Кор"; arrayOfString8[43] = "Гал"; arrayOfString8[44] = "Эф"; arrayOfString8[45] = "Флп"; arrayOfString8[46] = "Кол"; arrayOfString8[47] = "Фес"; arrayOfString8[48] = "Тим"; arrayOfString8[49] = "Тит"; arrayOfString8[50] = "Флм"; arrayOfString8[51] = "Евр"; arrayOfString8[52] = "Откр"; List biblical = CollectionsKt.listOf((Object[])arrayOfString8); String[] arrayOfString11 = new String[455]; arrayOfString11[0] = "т.д"; arrayOfString11[1] = "т.е"; arrayOfString11[2] = "т.к"; arrayOfString11[3] = "т.н"; arrayOfString11[4] = "т.п"; arrayOfString11[5] = "др"; arrayOfString11[6] = "пр"; arrayOfString11[7] = "см"; arrayOfString11[8] = "ср"; arrayOfString11[9] = "н.э"; arrayOfString11[10] = "в"; arrayOfString11[11] = "вв"; arrayOfString11[12] = "гг"; arrayOfString11[13] = "мин"; arrayOfString11[14] = "сек"; arrayOfString11[15] = "нед"; arrayOfString11[16] = "мес"; arrayOfString11[17] = "ч"; arrayOfString11[18] = "г"; arrayOfString11[19] = "к"; arrayOfString11[20] = "обл"; arrayOfString11[21] = "пос"; arrayOfString11[22] = "дер"; arrayOfString11[23] = "гор"; arrayOfString11[24] = "д"; arrayOfString11[25] = "ул"; arrayOfString11[26] = "просп"; arrayOfString11[27] = "пер"; arrayOfString11[28] = "кв"; arrayOfString11[29] = "с.х"; arrayOfString11[30] = "с.-х"; arrayOfString11[31] = "букв"; arrayOfString11[32] = "род"; arrayOfString11[33] = "р"; arrayOfString11[34] = "ум"; arrayOfString11[35] = "обр"; arrayOfString11[36] = "сокр"; arrayOfString11[37] = "чел"; arrayOfString11[38] = "экз"; arrayOfString11[39] = "им"; arrayOfString11[40] = "эл"; arrayOfString11[41] = "рег"; arrayOfString11[42] = "пикс"; arrayOfString11[43] = "симв"; arrayOfString11[44] = "соц"; arrayOfString11[45] = "гос"; arrayOfString11[46] = "проф"; arrayOfString11[47] = "наст"; arrayOfString11[48] = "прош"; arrayOfString11[49] = "буд"; arrayOfString11[50] = "тел"; arrayOfString11[51] = "т"; arrayOfString11[52] = "с"; arrayOfString11[53] = "ю"; arrayOfString11[54] = "в"; arrayOfString11[55] = "з"; arrayOfString11[56] = "св"; arrayOfString11[57] = "о"; arrayOfString11[58] = "и"; arrayOfString11[59] = "ил"; arrayOfString11[60] = "илл"; arrayOfString11[61] = "тыс"; arrayOfString11[62] = "б.п"; arrayOfString11[63] = "п"; arrayOfString11[64] = "ст"; arrayOfString11[65] = "мм.рт.ст"; arrayOfString11[66] = "а.е.м"; arrayOfString11[67] = "а.е"; arrayOfString11[68] = "долл"; arrayOfString11[69] = "руб"; arrayOfString11[70] = "грн"; arrayOfString11[71] = "коп"; arrayOfString11[72] = "с.ш"; arrayOfString11[73] = "ю.ш"; arrayOfString11[74] = "в.д"; arrayOfString11[75] = "з.д"; arrayOfString11[76] = "к.ф.н"; arrayOfString11[77] = "к.ф.-м.н"; arrayOfString11[78] = "к.т.н"; arrayOfString11[79] = "к.х.н"; arrayOfString11[80] = "д.ф.н"; arrayOfString11[81] = "д.ф.-м.н"; arrayOfString11[82] = "д.т.н"; arrayOfString11[83] = "д.х.н"; arrayOfString11[84] = "прим"; arrayOfString11[85] = "ред"; arrayOfString11[86] = "авт"; arrayOfString11[87] = "прим.ред"; arrayOfString11[88] = "прим.авт"; arrayOfString11[89] = "прим.пер"; arrayOfString11[90] = "англ"; arrayOfString11[91] = "нем"; arrayOfString11[92] = "фр"; arrayOfString11[93] = "рус"; arrayOfString11[94] = "укр"; arrayOfString11[95] = "ит"; arrayOfString11[96] = "дат"; arrayOfString11[97] = "франц"; arrayOfString11[98] = "абаз"; arrayOfString11[99] = "абх"; arrayOfString11[100] = "авар"; arrayOfString11[101] = "авест"; arrayOfString11[102] = "австр"; arrayOfString11[103] = "агул"; arrayOfString11[104] = "адыг"; arrayOfString11[105] = "азерб"; arrayOfString11[106] = "айн"; arrayOfString11[107] = "аккад"; arrayOfString11[108] = "алб"; arrayOfString11[109] = "алем"; arrayOfString11[110] = "алеут"; arrayOfString11[111] = "алжир"; arrayOfString11[112] = "алт"; arrayOfString11[113] = "амер"; arrayOfString11[114] = "амх"; arrayOfString11[115] = "англо-норм"; arrayOfString11[116] = "араб"; arrayOfString11[117] = "арагон"; arrayOfString11[118] = "арам"; arrayOfString11[119] = "арм"; arrayOfString11[120] = "арум"; arrayOfString11[121] = "ассам"; arrayOfString11[122] = "аст"; arrayOfString11[123] = "астур"; arrayOfString11[124] = "афар"; arrayOfString11[125] = "африк"; arrayOfString11[126] = "ачех"; arrayOfString11[127] = "бав"; arrayOfString11[128] = "балийск"; arrayOfString11[129] = "бам"; arrayOfString11[130] = "бан"; arrayOfString11[131] = "бандж"; arrayOfString11[132] = "баск"; arrayOfString11[133] = "баш"; arrayOfString11[134] = "бел"; arrayOfString11[135] = "белудж"; arrayOfString11[136] = "бенг"; arrayOfString11[137] = "бербер"; arrayOfString11[138] = "бик"; arrayOfString11[139] = "бирм"; arrayOfString11[140] = "бисл"; arrayOfString11[141] = "биш.-ман"; arrayOfString11[142] = "болг"; arrayOfString11[143] = "босн"; arrayOfString11[144] = "бр"; arrayOfString11[145] = "брет"; arrayOfString11[146] = "брит"; arrayOfString11[147] = "буг"; arrayOfString11[148] = "бук"; arrayOfString11[149] = "бур"; arrayOfString11[150] = "бходжп"; arrayOfString11[151] = "валл"; arrayOfString11[152] = "валлон"; arrayOfString11[153] = "вар"; arrayOfString11[154] = "венг"; arrayOfString11[155] = "венет"; arrayOfString11[156] = "вепсск"; arrayOfString11[157] = "верхнелуж"; arrayOfString11[158] = "водск"; arrayOfString11[159] = "вост"; arrayOfString11[160] = "вост.-фриз"; arrayOfString11[161] = "вост.-чам"; arrayOfString11[162] = "вырус"; arrayOfString11[163] = "вьет"; arrayOfString11[164] = "гав"; arrayOfString11[165] = "гаг"; arrayOfString11[166] = "гаит"; arrayOfString11[167] = "галис"; arrayOfString11[168] = "гаск"; arrayOfString11[169] = "гвиан"; arrayOfString11[170] = "гер"; arrayOfString11[171] = "гил"; arrayOfString11[172] = "гор.-евр"; arrayOfString11[173] = "гор.-мар"; arrayOfString11[174] = "готск"; arrayOfString11[175] = "гренл"; arrayOfString11[176] = "греч"; arrayOfString11[177] = "грон"; arrayOfString11[178] = "груз"; arrayOfString11[179] = "гуар"; arrayOfString11[180] = "гудж"; arrayOfString11[181] = "гэльск"; arrayOfString11[182] = "дарг"; arrayOfString11[183] = "дореф"; arrayOfString11[184] = "др"; arrayOfString11[185] = "др.-англ"; arrayOfString11[186] = "др.-верхненем"; arrayOfString11[187] = "др.-греч"; arrayOfString11[188] = "др.-евр"; arrayOfString11[189] = "др.-ирл"; arrayOfString11[190] = "др.-перс"; arrayOfString11[191] = "др.-пров"; arrayOfString11[192] = "др.-рус"; arrayOfString11[193] = "др.-сканд"; arrayOfString11[194] = "дунг"; arrayOfString11[195] = "егип"; arrayOfString11[196] = "жем"; arrayOfString11[197] = "з.-арм"; arrayOfString11[198] = "з.-чам"; arrayOfString11[199] = "зап"; arrayOfString11[200] = "зап.-кат"; arrayOfString11[201] = "зап.-флам"; arrayOfString11[202] = "зап.-фриз"; arrayOfString11[203] = "зел"; arrayOfString11[204] = "ивр"; arrayOfString11[205] = "ижор"; arrayOfString11[206] = "илок"; arrayOfString11[207] = "инари-саам"; arrayOfString11[208] = "ингуш"; arrayOfString11[209] = "индон"; arrayOfString11[210] = "интерл"; arrayOfString11[211] = "инуитск"; arrayOfString11[212] = "ирл"; arrayOfString11[213] = "иск"; arrayOfString11[214] = "исл"; arrayOfString11[215] = "исп"; arrayOfString11[216] = "итал"; arrayOfString11[217] = "ительм"; arrayOfString11[218] = "кабард.-черк"; arrayOfString11[219] = "кабильск"; arrayOfString11[220] = "каз"; arrayOfString11[221] = "калм"; arrayOfString11[222] = "кант"; arrayOfString11[223] = "канур"; arrayOfString11[224] = "кап"; arrayOfString11[225] = "караимск"; arrayOfString11[226] = "каракалп"; arrayOfString11[227] = "карач.-балк"; arrayOfString11[228] = "карел"; arrayOfString11[229] = "кат"; arrayOfString11[230] = "кашм"; arrayOfString11[231] = "кашуб"; arrayOfString11[232] = "кв"; arrayOfString11[233] = "кван"; arrayOfString11[234] = "квен"; arrayOfString11[235] = "керек"; arrayOfString11[236] = "кет"; arrayOfString11[237] = "кильд"; arrayOfString11[238] = "кирг"; arrayOfString11[239] = "кириб"; arrayOfString11[240] = "кит"; arrayOfString11[241] = "классич"; arrayOfString11[242] = "колтта-саам"; arrayOfString11[243] = "ком"; arrayOfString11[244] = "коми-пермяцк"; arrayOfString11[245] = "копт"; arrayOfString11[246] = "кор"; arrayOfString11[247] = "корнск"; arrayOfString11[248] = "корс"; arrayOfString11[249] = "корякск"; arrayOfString11[250] = "крымскотат"; arrayOfString11[251] = "кукск"; arrayOfString11[252] = "кум"; arrayOfString11[253] = "курд"; arrayOfString11[254] = "кхмер"; arrayOfString11[255] = "ладинск"; arrayOfString11[256] = "лакск"; arrayOfString11[257] = "лаос"; arrayOfString11[258] = "лат"; arrayOfString11[259] = "латг"; arrayOfString11[260] = "латыш"; arrayOfString11[261] = "лезг"; arrayOfString11[262] = "лив"; arrayOfString11[263] = "лив.-карел"; arrayOfString11[264] = "лиг"; arrayOfString11[265] = "лимб"; arrayOfString11[266] = "лит"; arrayOfString11[267] = "ложб"; arrayOfString11[268] = "ломб"; arrayOfString11[269] = "луг"; arrayOfString11[270] = "луг.-мар"; arrayOfString11[271] = "луле-саам"; arrayOfString11[272] = "люксемб"; arrayOfString11[273] = "мадур"; arrayOfString11[274] = "маз"; arrayOfString11[275] = "макас"; arrayOfString11[276] = "макед"; arrayOfString11[277] = "малаг"; arrayOfString11[278] = "малайск"; arrayOfString11[279] = "мальд"; arrayOfString11[280] = "мальт"; arrayOfString11[281] = "манип"; arrayOfString11[282] = "манс"; arrayOfString11[283] = "мап"; arrayOfString11[284] = "мар"; arrayOfString11[285] = "марок"; arrayOfString11[286] = "марш"; arrayOfString11[287] = "мег"; arrayOfString11[288] = "мин"; arrayOfString11[289] = "мирандск"; arrayOfString11[290] = "мн"; arrayOfString11[291] = "мокш"; arrayOfString11[292] = "молд"; arrayOfString11[293] = "мон"; arrayOfString11[294] = "монг"; arrayOfString11[295] = "мэнск"; arrayOfString11[296] = "наук"; arrayOfString11[297] = "наур"; arrayOfString11[298] = "нган"; arrayOfString11[299] = "ндеб"; arrayOfString11[300] = "ндеб"; arrayOfString11[301] = "неап"; arrayOfString11[302] = "нев"; arrayOfString11[303] = "нен"; arrayOfString11[304] = "непальск"; arrayOfString11[305] = "ниас"; arrayOfString11[306] = "нивх"; arrayOfString11[307] = "нид"; arrayOfString11[308] = "нидерл"; arrayOfString11[309] = "ниж.-луж"; arrayOfString11[310] = "ниж.-нем"; arrayOfString11[311] = "ниж.-сакс"; arrayOfString11[312] = "новоарам"; arrayOfString11[313] = "ног"; arrayOfString11[314] = "норв"; arrayOfString11[315] = "норм"; arrayOfString11[316] = "одж"; arrayOfString11[317] = "окив"; arrayOfString11[318] = "окс"; arrayOfString11[319] = "окц"; arrayOfString11[320] = "ороч"; arrayOfString11[321] = "осет"; arrayOfString11[322] = "осман"; arrayOfString11[323] = "пандж"; arrayOfString11[324] = "папьям"; arrayOfString11[325] = "пенсильв"; arrayOfString11[326] = "перс"; arrayOfString11[327] = "пехл"; arrayOfString11[328] = "пик"; arrayOfString11[329] = "пол"; arrayOfString11[330] = "польск"; arrayOfString11[331] = "порт"; arrayOfString11[332] = "пьем"; arrayOfString11[333] = "радж"; arrayOfString11[334] = "рап"; arrayOfString11[335] = "рип"; arrayOfString11[336] = "ромш"; arrayOfString11[337] = "рум"; arrayOfString11[338] = "русин"; arrayOfString11[339] = "рут"; arrayOfString11[340] = "самоан"; arrayOfString11[341] = "санскр"; arrayOfString11[342] = "сард"; arrayOfString11[343] = "себ"; arrayOfString11[344] = "сев"; arrayOfString11[345] = "сев.-алт"; arrayOfString11[346] = "сев.-зап"; arrayOfString11[347] = "сев.-кит"; arrayOfString11[348] = "сев.-лур"; arrayOfString11[349] = "сев.-миньск"; arrayOfString11[350] = "сев.-саам"; arrayOfString11[351] = "сев.-фриз"; arrayOfString11[352] = "северноюк"; arrayOfString11[353] = "сейш"; arrayOfString11[354] = "селькупск"; arrayOfString11[355] = "серб"; arrayOfString11[356] = "сербохорв"; arrayOfString11[357] = "сеф"; arrayOfString11[358] = "сиб.-тат"; arrayOfString11[359] = "силез"; arrayOfString11[360] = "сингальск"; arrayOfString11[361] = "синд"; arrayOfString11[362] = "сиреник"; arrayOfString11[363] = "сиц"; arrayOfString11[364] = "скотс"; arrayOfString11[365] = "словац"; arrayOfString11[366] = "словен"; arrayOfString11[367] = "совр"; arrayOfString11[368] = "согд"; arrayOfString11[369] = "ср.-англ"; arrayOfString11[370] = "ср.-верхненем"; arrayOfString11[371] = "ср.-греч"; arrayOfString11[372] = "ср.-франц"; arrayOfString11[373] = "ст.-слав"; arrayOfString11[374] = "старофр"; arrayOfString11[375] = "сунд"; arrayOfString11[376] = "таб"; arrayOfString11[377] = "тагальск"; arrayOfString11[378] = "тадж"; arrayOfString11[379] = "таит"; arrayOfString11[380] = "тайв"; arrayOfString11[381] = "тайск"; arrayOfString11[382] = "тал"; arrayOfString11[383] = "там"; arrayOfString11[384] = "тар"; arrayOfString11[385] = "тарашк"; arrayOfString11[386] = "тат"; arrayOfString11[387] = "тиб"; arrayOfString11[388] = "тлингит"; arrayOfString11[389] = "ток"; arrayOfString11[390] = "тонг"; arrayOfString11[391] = "трад"; arrayOfString11[392] = "тув"; arrayOfString11[393] = "тур"; arrayOfString11[394] = "туркм"; arrayOfString11[395] = "удин"; arrayOfString11[396] = "удм"; arrayOfString11[397] = "удэг"; arrayOfString11[398] = "узб"; arrayOfString11[399] = "уйг"; arrayOfString11[400] = "упр"; arrayOfString11[401] = "упрощ"; arrayOfString11[402] = "фар"; arrayOfString11[403] = "фидж"; arrayOfString11[404] = "филипп"; arrayOfString11[405] = "фин"; arrayOfString11[406] = "финик"; arrayOfString11[407] = "фриул"; arrayOfString11[408] = "хак"; arrayOfString11[409] = "хант"; arrayOfString11[410] = "хорв"; arrayOfString11[411] = "цахур"; arrayOfString11[412] = "центр"; arrayOfString11[413] = "церк.-слав"; arrayOfString11[414] = "цыг"; arrayOfString11[415] = "чагат"; arrayOfString11[416] = "чамор"; arrayOfString11[417] = "чапл"; arrayOfString11[418] = "черног"; arrayOfString11[419] = "черногор"; arrayOfString11[420] = "чеч"; arrayOfString11[421] = "чеш"; arrayOfString11[422] = "чжуанск"; arrayOfString11[423] = "чув"; arrayOfString11[424] = "чуваш"; arrayOfString11[425] = "чук"; arrayOfString11[426] = "чулым"; arrayOfString11[427] = "шайен"; arrayOfString11[428] = "шан"; arrayOfString11[429] = "швед"; arrayOfString11[430] = "швц.-нем"; arrayOfString11[431] = "шорск"; arrayOfString11[432] = "шугн"; arrayOfString11[433] = "шум"; arrayOfString11[434] = "эвенк"; arrayOfString11[435] = "эвенск"; arrayOfString11[436] = "эламск"; arrayOfString11[437] = "эмил.-ром"; arrayOfString11[438] = "эрз"; arrayOfString11[439] = "эским"; arrayOfString11[440] = "эсп"; arrayOfString11[441] = "эст"; arrayOfString11[442] = "ю.-саам"; arrayOfString11[443] = "юж"; arrayOfString11[444] = "юж.-азерб"; arrayOfString11[445] = "южноюк"; arrayOfString11[446] = "юкатек"; arrayOfString11[447] = "яв"; arrayOfString11[448] = "якут"; arrayOfString11[449] = "яп"; arrayOfString11[450] = "спец"; arrayOfString11[451] = "макс"; arrayOfString11[452] = "неразб"; arrayOfString11[453] = "сут"; arrayOfString11[454] = "вкл"; Set dotted = SetsKt.plus(SetsKt.plus(SetsKt.setOf((Object[])arrayOfString11), list3), biblical); String[] arrayOfString14 = new String[12]; arrayOfString14[0] = "га"; arrayOfString14[1] = "кБ"; arrayOfString14[2] = "дБА"; arrayOfString14[3] = "дБ"; arrayOfString14[4] = "Мб"; arrayOfString14[5] = "Кб"; arrayOfString14[6] = "Гб"; arrayOfString14[7] = "т"; arrayOfString14[8] = "л"; arrayOfString14[9] = "Нп"; arrayOfString14[10] = "эВ"; arrayOfString14[11] = "squash!"; List nonDotted = CollectionsKt.plus(CollectionsKt.listOf((Object[])arrayOfString14), list3); arrayOfPattern6 = new Pattern[3]; Iterable iterable2 = dotted; matchingParameters1 = new MatchingParameters(true, false, 2, null); bool1 = false; arrayOfPattern10 = arrayOfPattern6; i5 = 0;
/* 599 */     Iterable iterable4 = iterable2; Collection<String> collection7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10)); i7 = 0;
/* 600 */     for (Object item$iv$iv : iterable4) {
/* 601 */       String it = (String)item$iv$iv; Collection<String> collection9 = collection7; int $i$a$-map-AbbreviationPatterns$Russian$1$2 = 0; collection9.add(it + ".");
/* 602 */     }  list13 = (List)collection7; List<String> list17 = CollectionsKt.plus(list13, nonDotted); MatchingParameters matchingParameters6 = matchingParameters1; arrayOfPattern10[bool1] = new AbbreviationPattern(matchingParameters6, list17); arrayOfPattern6[1] = cyrillicSIUnits; arrayOfPattern6[2] = (new RegexPattern(new Regex("[а-яё]{1,3}-[а-яё]{1,4}", RegexOption.IGNORE_CASE))).withWordBoundariesAround(); Pattern[] arrayOfPattern5 = arrayOfPattern6; Russian = (Pattern)new AbbreviationPatterns$Russian$1$1(arrayOfPattern5); AbbreviationPatterns $this$Ukrainian_u24lambda_u2410 = abbreviationPatterns2 = INSTANCE; int $i$a$-run-AbbreviationPatterns$Ukrainian$1 = 0; String[] arrayOfString4 = new String[7]; arrayOfString4[0] = "пн"; arrayOfString4[1] = "вт"; arrayOfString4[2] = "ср"; arrayOfString4[3] = "чт"; arrayOfString4[4] = "пт"; arrayOfString4[5] = "сб"; arrayOfString4[6] = "нд"; list3 = CollectionsKt.listOf((Object[])arrayOfString4); String[] arrayOfString7 = new String[4]; arrayOfString7[0] = "півн"; arrayOfString7[1] = "пн"; arrayOfString7[2] = "півд"; arrayOfString7[3] = "пд"; List northSouth = CollectionsKt.listOf((Object[])arrayOfString7); String[] arrayOfString10 = new String[3]; arrayOfString10[0] = "сх"; arrayOfString10[1] = "зх"; arrayOfString10[2] = "зах"; List eastWest = CollectionsKt.listOf((Object[])arrayOfString10); String[] arrayOfString13 = new String[79]; arrayOfString13[0] = "Бут"; arrayOfString13[1] = "Вих"; arrayOfString13[2] = "Лев"; arrayOfString13[3] = "Чис"; arrayOfString13[4] = "Числ"; arrayOfString13[5] = "Втор"; arrayOfString13[6] = "Повт"; arrayOfString13[7] = "Єг"; arrayOfString13[8] = "Нв"; arrayOfString13[9] = "Нав"; arrayOfString13[10] = "ИсНав"; arrayOfString13[11] = "Иош"; arrayOfString13[12] = "Суд"; arrayOfString13[13] = "Сд"; arrayOfString13[14] = "Рут"; arrayOfString13[15] = "Руф"; arrayOfString13[16] = "Сам"; arrayOfString13[17] = "Цар"; arrayOfString13[18] = "Хр"; arrayOfString13[19] = "Пар"; arrayOfString13[20] = "Хрон"; arrayOfString13[21] = "Лет"; arrayOfString13[22] = "Езд"; arrayOfString13[23] = "Ез"; arrayOfString13[24] = "Неем"; arrayOfString13[25] = "Нм"; arrayOfString13[26] = "Ест"; arrayOfString13[27] = "Ес"; arrayOfString13[28] = "Есф"; arrayOfString13[29] = "Эсф"; arrayOfString13[30] = "Йов"; arrayOfString13[31] = "Пс"; arrayOfString13[32] = "Пр"; arrayOfString13[33] = "Екл"; arrayOfString13[34] = "Пісн"; arrayOfString13[35] = "Іс"; arrayOfString13[36] = "Єр"; arrayOfString13[37] = "Плач"; arrayOfString13[38] = "Єз"; arrayOfString13[39] = "Дан"; arrayOfString13[40] = "Ос"; arrayOfString13[41] = "Йоіл"; arrayOfString13[42] = "Ам"; arrayOfString13[43] = "Овд"; arrayOfString13[44] = "Йон"; arrayOfString13[45] = "Мих"; arrayOfString13[46] = "Нау"; arrayOfString13[47] = "Ав"; arrayOfString13[48] = "Соф"; arrayOfString13[49] = "Ог"; arrayOfString13[50] = "Зах"; arrayOfString13[51] = "Мал"; arrayOfString13[52] = "Мт"; arrayOfString13[53] = "Мр"; arrayOfString13[54] = "Лк"; arrayOfString13[55] = "Ів"; arrayOfString13[56] = "Як"; arrayOfString13[57] = "Петр"; arrayOfString13[58] = "Ів"; arrayOfString13[59] = "Юд"; arrayOfString13[60] = "Рим"; arrayOfString13[61] = "Кор"; arrayOfString13[62] = "Гал"; arrayOfString13[63] = "Еф"; arrayOfString13[64] = "Фил"; arrayOfString13[65] = "Кол"; arrayOfString13[66] = "Сол"; arrayOfString13[67] = "Тим"; arrayOfString13[68] = "Тит"; arrayOfString13[69] = "Филим"; arrayOfString13[70] = "Євр"; arrayOfString13[71] = "Об"; arrayOfString13[72] = "Єрем"; arrayOfString13[73] = "Римл"; arrayOfString13[74] = "Матв"; arrayOfString13[75] = "Об'явл"; arrayOfString13[76] = "Псал"; arrayOfString13[77] = "Єзек"; arrayOfString13[78] = "Прип"; List<String> list5 = CollectionsKt.listOf((Object[])arrayOfString13); String[] arrayOfString16 = new String[237]; arrayOfString16[0] = "вул"; arrayOfString16[1] = "буд"; arrayOfString16[2] = "бульв"; arrayOfString16[3] = "просп"; arrayOfString16[4] = "кв"; arrayOfString16[5] = "м"; arrayOfString16[6] = "о"; arrayOfString16[7] = "обл"; arrayOfString16[8] = "оз"; arrayOfString16[9] = "пл"; arrayOfString16[10] = "пров"; arrayOfString16[11] = "с"; arrayOfString16[12] = "смт"; arrayOfString16[13] = "ст"; arrayOfString16[14] = "ім"; arrayOfString16[15] = "ін"; arrayOfString16[16] = "т.д"; arrayOfString16[17] = "т.ін"; arrayOfString16[18] = "і под"; arrayOfString16[19] = "напр"; arrayOfString16[20] = "та ін"; arrayOfString16[21] = "т.зв"; arrayOfString16[22] = "у т.ч"; arrayOfString16[23] = "тис"; arrayOfString16[24] = "млн"; arrayOfString16[25] = "шт"; arrayOfString16[26] = "в.п"; arrayOfString16[27] = "в.о"; arrayOfString16[28] = "хв"; arrayOfString16[29] = "н.е"; arrayOfString16[30] = "р"; arrayOfString16[31] = "рр"; arrayOfString16[32] = "р.н"; arrayOfString16[33] = "Р.Х"; arrayOfString16[34] = "год"; arrayOfString16[35] = "к.с"; arrayOfString16[36] = "д"; arrayOfString16[37] = "доц"; arrayOfString16[38] = "проф"; arrayOfString16[39] = "чл.-кор"; arrayOfString16[40] = "дияк"; arrayOfString16[41] = "єп"; arrayOfString16[42] = "ігум"; arrayOfString16[43] = "митр"; arrayOfString16[44] = "патр"; arrayOfString16[45] = "пресвіт"; arrayOfString16[46] = "прор"; arrayOfString16[47] = "св"; arrayOfString16[48] = "церк"; arrayOfString16[49] = "газ"; arrayOfString16[50] = "журн"; arrayOfString16[51] = "зб"; arrayOfString16[52] = "ч"; arrayOfString16[53] = "ч.л"; arrayOfString16[54] = "ст"; arrayOfString16[55] = "ст.л"; arrayOfString16[56] = "пров"; arrayOfString16[57] = "дол"; arrayOfString16[58] = "грн"; arrayOfString16[59] = "коп"; arrayOfString16[60] = "млрд"; arrayOfString16[61] = "трлн"; arrayOfString16[62] = "тел"; arrayOfString16[63] = "руб"; arrayOfString16[64] = "авт"; arrayOfString16[65] = "акад"; arrayOfString16[66] = "арк"; arrayOfString16[67] = "бібл"; arrayOfString16[68] = "вид"; arrayOfString16[69] = "вип"; arrayOfString16[70] = "гр"; arrayOfString16[71] = "див"; arrayOfString16[72] = "енцикл"; arrayOfString16[73] = "знач"; arrayOfString16[74] = "іл"; arrayOfString16[75] = "кн"; arrayOfString16[76] = "мист"; arrayOfString16[77] = "нар"; arrayOfString16[78] = "наук"; arrayOfString16[79] = "нац"; arrayOfString16[80] = "п"; arrayOfString16[81] = "перев"; arrayOfString16[82] = "поч"; arrayOfString16[83] = "пор"; arrayOfString16[84] = "пп"; arrayOfString16[85] = "ред"; arrayOfString16[86] = "спец"; arrayOfString16[87] = "співавт"; arrayOfString16[88] = "т"; arrayOfString16[89] = "укр"; arrayOfString16[90] = "худ"; arrayOfString16[91] = "чв"; arrayOfString16[92] = "с.-д"; arrayOfString16[93] = "ст.-сл"; arrayOfString16[94] = "с.-г"; arrayOfString16[95] = "абстр"; arrayOfString16[96] = "безос"; arrayOfString16[97] = "вар"; arrayOfString16[98] = "вульг"; arrayOfString16[99] = "галиц"; arrayOfString16[100] = "грам"; arrayOfString16[101] = "діал"; arrayOfString16[102] = "док"; arrayOfString16[103] = "жін"; arrayOfString16[104] = "евф"; arrayOfString16[105] = "етн"; arrayOfString16[106] = "жарт"; arrayOfString16[107] = "зах"; arrayOfString16[108] = "займ"; arrayOfString16[109] = "збірн"; arrayOfString16[110] = "зменш"; arrayOfString16[111] = "зневажл"; arrayOfString16[112] = "інфін"; arrayOfString16[113] = "ірон"; arrayOfString16[114] = "канц"; arrayOfString16[115] = "книжн"; arrayOfString16[116] = "лайл"; arrayOfString16[117] = "мн"; arrayOfString16[118] = "морф"; arrayOfString16[119] = "рус"; arrayOfString16[120] = "муз"; arrayOfString16[121] = "наз"; arrayOfString16[122] = "недок"; arrayOfString16[123] = "незм"; arrayOfString16[124] = "неознач"; arrayOfString16[125] = "несхв"; arrayOfString16[126] = "обр"; arrayOfString16[127] = "одн"; arrayOfString16[128] = "означ"; arrayOfString16[129] = "перен"; arrayOfString16[130] = "перех"; arrayOfString16[131] = "підсил"; arrayOfString16[132] = "поет"; arrayOfString16[133] = "пол"; arrayOfString16[134] = "політ"; arrayOfString16[135] = "полон"; arrayOfString16[136] = "помилк"; arrayOfString16[137] = "прикм"; arrayOfString16[138] = "присудк"; arrayOfString16[139] = "сл"; arrayOfString16[140] = "прот"; arrayOfString16[141] = "прост"; arrayOfString16[142] = "рел"; arrayOfString16[143] = "рідк"; arrayOfString16[144] = "розм"; arrayOfString16[145] = "семант"; arrayOfString16[146] = "сер"; arrayOfString16[147] = "словотв"; arrayOfString16[148] = "уроч"; arrayOfString16[149] = "церк.-слов"; arrayOfString16[150] = "частк"; arrayOfString16[151] = "чол"; arrayOfString16[152] = "шах"; arrayOfString16[153] = "зн"; arrayOfString16[154] = "стар"; arrayOfString16[155] = "правоп"; arrayOfString16[156] = "скрипн"; arrayOfString16[157] = "желех"; arrayOfString16[158] = "авіац"; arrayOfString16[159] = "анат"; arrayOfString16[160] = "археол"; arrayOfString16[161] = "архіт"; arrayOfString16[162] = "астрон"; arrayOfString16[163] = "біол"; arrayOfString16[164] = "бірж"; arrayOfString16[165] = "ботан"; arrayOfString16[166] = "військ"; arrayOfString16[167] = "геогр"; arrayOfString16[168] = "гірн"; arrayOfString16[169] = "ек"; arrayOfString16[170] = "екон"; arrayOfString16[171] = "ел"; arrayOfString16[172] = "електр"; arrayOfString16[173] = "ент"; arrayOfString16[174] = "зоол"; arrayOfString16[175] = "істор"; arrayOfString16[176] = "іхт"; arrayOfString16[177] = "кол"; arrayOfString16[178] = "мет"; arrayOfString16[179] = "комп"; arrayOfString16[180] = "лінгв"; arrayOfString16[181] = "літ"; arrayOfString16[182] = "матем"; arrayOfString16[183] = "мед"; arrayOfString16[184] = "мет.-зн"; arrayOfString16[185] = "металург"; arrayOfString16[186] = "метеор"; arrayOfString16[187] = "міфол"; arrayOfString16[188] = "грецьк"; arrayOfString16[189] = "морськ"; arrayOfString16[190] = "орн"; arrayOfString16[191] = "спорт"; arrayOfString16[192] = "театр"; arrayOfString16[193] = "техн"; arrayOfString16[194] = "фіз"; arrayOfString16[195] = "фізіол"; arrayOfString16[196] = "філ"; arrayOfString16[197] = "філос"; arrayOfString16[198] = "хім"; arrayOfString16[199] = "ювел"; arrayOfString16[200] = "юр"; arrayOfString16[201] = "русин"; arrayOfString16[202] = "бойк"; arrayOfString16[203] = "волин"; arrayOfString16[204] = "гуцул"; arrayOfString16[205] = "зх.-поліс"; arrayOfString16[206] = "лемк"; arrayOfString16[207] = "наддністр"; arrayOfString16[208] = "надсян"; arrayOfString16[209] = "поділ"; arrayOfString16[210] = "покут.-буковин"; arrayOfString16[211] = "сер.-наддніпр"; arrayOfString16[212] = "сер.-поліс"; arrayOfString16[213] = "слобож"; arrayOfString16[214] = "степ"; arrayOfString16[215] = "сх.-поліс"; arrayOfString16[216] = "білг"; arrayOfString16[217] = "карпат"; arrayOfString16[218] = "донец"; arrayOfString16[219] = "луг"; arrayOfString16[220] = "харк"; arrayOfString16[221] = "англ"; arrayOfString16[222] = "нім"; arrayOfString16[223] = "фр"; arrayOfString16[224] = "іт"; arrayOfString16[225] = "дат"; arrayOfString16[226] = "вірм"; arrayOfString16[227] = "бел"; arrayOfString16[228] = "серб"; arrayOfString16[229] = "ісп"; arrayOfString16[230] = "кит"; arrayOfString16[231] = "канд"; arrayOfString16[232] = "асист"; arrayOfString16[233] = "макс"; arrayOfString16[234] = "мін"; arrayOfString16[235] = "каб"; arrayOfString16[236] = "грец"; List list9 = northSouth; iterable2 = CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.listOf((Object[])arrayOfString16), list3), list5), northSouth), eastWest); int $i$f$flatMap = 0;
/* 603 */     List list11 = list9; Collection<String> collection4 = new ArrayList(); int $i$f$flatMapTo = 0;
/* 604 */     for (Object element$iv$iv : list11) {
/* 605 */       String ns = (String)element$iv$iv; int $i$a$-flatMap-AbbreviationPatterns$Ukrainian$1$dotted$1 = 0; Iterable iterable5 = eastWest; int i8 = 0;
/* 606 */       Iterable iterable6 = iterable5; Collection collection9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable5, 10)); int i9 = 0;
/* 607 */       Iterator iterator = iterable6.iterator();
/*     */     } 
/*     */     
/*     */     Iterable $this$flatMap$iv = northSouth;
/*     */     
/* 612 */     iterable2 = CollectionsKt.plus((Collection)iterable2, collection4); int i2 = 0;
/* 613 */     Iterable $this$flatMapTo$iv$iv = $this$flatMap$iv; collection4 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$flatMap$iv, 10)); int i4 = 0;
/* 614 */     for (Object item$iv$iv : $this$flatMapTo$iv$iv) {
/* 615 */       String str = (String)item$iv$iv; Collection<String> collection9 = collection4; int $i$a$-map-AbbreviationPatterns$Ukrainian$1$dotted$2 = 0; collection9.add(str + ".ш");
/* 616 */     }  Iterable $this$map$iv = eastWest; iterable2 = CollectionsKt.plus((Collection)iterable2, collection4); i2 = 0;
/* 617 */     Iterable iterable3 = $this$map$iv; Collection<String> collection3 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); i4 = 0;
/* 618 */     for (Object item$iv$iv : iterable3) {
/* 619 */       String it = (String)item$iv$iv; Collection<String> collection9 = collection3; int $i$a$-map-AbbreviationPatterns$Ukrainian$1$dotted$3 = 0; collection9.add(it + ".д");
/* 620 */     }  List<String> list7 = CollectionsKt.plus((Collection)iterable2, collection3); String[] arrayOfString17 = new String[8]; arrayOfString17[0] = "м/хв"; arrayOfString17[1] = "км/год"; arrayOfString17[2] = "дБА"; arrayOfString17[3] = "дБ"; arrayOfString17[4] = "Тбіт"; arrayOfString17[5] = "Пбіт"; arrayOfString17[6] = "Мб"; arrayOfString17[7] = "squash!"; List list8 = CollectionsKt.plus(CollectionsKt.listOf((Object[])arrayOfString17), list3); Pattern[] arrayOfPattern9 = new Pattern[2]; collection3 = list7; MatchingParameters matchingParameters2 = new MatchingParameters(true, false, 2, null); boolean bool2 = false; Pattern[] arrayOfPattern7 = arrayOfPattern9; int i3 = 0;
/* 621 */     Collection<String> collection5 = collection3, collection6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection3, 10)); int i6 = 0;
/* 622 */     for (String item$iv$iv : collection5) {
/* 623 */       String str1 = item$iv$iv; Collection<String> collection9 = collection6; int $i$a$-map-AbbreviationPatterns$Ukrainian$1$2 = 0; collection9.add(str1 + ".");
/* 624 */     }  List list14 = (List)collection6; List<String> list18 = CollectionsKt.plus(list14, list8); MatchingParameters matchingParameters7 = matchingParameters2; arrayOfPattern7[bool2] = new AbbreviationPattern(matchingParameters7, list18); arrayOfPattern9[1] = cyrillicSIUnits; Pattern[] arrayOfPattern8 = arrayOfPattern9; Ukrainian = (Pattern)new AbbreviationPatterns$Ukrainian$1$1(arrayOfPattern8); String[] arrayOfString1 = new String[16]; arrayOfString1[0] = "Jan"; arrayOfString1[1] = "Jän"; arrayOfString1[2] = "Febr"; arrayOfString1[3] = "Feb"; arrayOfString1[4] = "März"; arrayOfString1[5] = "Mär"; arrayOfString1[6] = "Mrz"; arrayOfString1[7] = "Apr"; arrayOfString1[8] = "Jun"; arrayOfString1[9] = "Jul"; arrayOfString1[10] = "Aug"; arrayOfString1[11] = "Sept"; arrayOfString1[12] = "Sep"; arrayOfString1[13] = "Okt"; arrayOfString1[14] = "Nov"; arrayOfString1[15] = "Dez"; germanMonthsShort = CollectionsKt.listOf((Object[])arrayOfString1); arrayOfString1 = new String[16]; arrayOfString1[0] = "Januar"; arrayOfString1[1] = "Jänner"; arrayOfString1[2] = "Jaenner"; arrayOfString1[3] = "Februar"; arrayOfString1[4] = "Feber"; arrayOfString1[5] = "März"; arrayOfString1[6] = "Maerz"; arrayOfString1[7] = "April"; arrayOfString1[8] = "Mai"; arrayOfString1[9] = "Juni"; arrayOfString1[10] = "Juli"; arrayOfString1[11] = "August"; arrayOfString1[12] = "September"; arrayOfString1[13] = "Oktober"; arrayOfString1[14] = "November"; arrayOfString1[15] = "Dezember"; germanMonthsFull = CollectionsKt.listOf((Object[])arrayOfString1); arrayOfString1 = new String[19]; arrayOfString1[0] = "ml"; arrayOfString1[1] = "mm"; arrayOfString1[2] = "cm"; arrayOfString1[3] = "m"; arrayOfString1[4] = "km"; arrayOfString1[5] = "ha"; arrayOfString1[6] = "t"; arrayOfString1[7] = "kg"; arrayOfString1[8] = "g"; arrayOfString1[9] = "mg"; arrayOfString1[10] = "h"; arrayOfString1[11] = "km/h"; arrayOfString1[12] = "m/s"; arrayOfString1[13] = "ct"; arrayOfString1[14] = "qm"; arrayOfString1[15] = "kW"; arrayOfString1[16] = "kV"; arrayOfString1[17] = "El"; arrayOfString1[18] = "TL"; List list1 = CollectionsKt.listOf((Object[])arrayOfString1); int $i$f$map = 0;
/* 625 */     Iterable $this$mapTo$iv$iv = list1; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0;
/* 626 */     for (Object item$iv$iv : $this$mapTo$iv$iv) {
/* 627 */       String str1 = (String)item$iv$iv; Collection<String> collection9 = destination$iv$iv; int $i$a$-map-AbbreviationPatterns$germanMistakenlyDotted$1 = 0; String str2 = str1 + "."; collection9.add(str2);
/* 628 */     }  germanMistakenlyDotted = (List<String>)destination$iv$iv; AbbreviationPatterns abbreviationPatterns1 = INSTANCE, $this$German_u24lambda_u2415 = abbreviationPatterns1; int $i$a$-run-AbbreviationPatterns$German$1 = 0; String[] arrayOfString3 = new String[361]; arrayOfString3[0] = "Abs."; arrayOfString3[1] = "am."; arrayOfString3[2] = "amtl."; arrayOfString3[3] = "Anh."; arrayOfString3[4] = "Ank."; arrayOfString3[5] = "Anl."; arrayOfString3[6] = "Anm."; arrayOfString3[7] = "anschl."; arrayOfString3[8] = "a.a.O."; arrayOfString3[9] = "a.d."; arrayOfString3[10] = "a.o."; arrayOfString3[11] = "App."; arrayOfString3[12] = "a.Rh."; arrayOfString3[13] = "Art."; arrayOfString3[14] = "Aufl."; arrayOfString3[15] = "Ausg."; arrayOfString3[16] = "AW"; arrayOfString3[17] = "b."; arrayOfString3[18] = "b.a.W."; arrayOfString3[19] = "B.Eng."; arrayOfString3[20] = "Bd."; arrayOfString3[21] = "Bde."; arrayOfString3[22] = "beil."; arrayOfString3[23] = "bes."; arrayOfString3[24] = "Betriebsw."; arrayOfString3[25] = "bspw."; arrayOfString3[26] = "Best.-Nr."; arrayOfString3[27] = "Betr."; arrayOfString3[28] = "Bev."; arrayOfString3[29] = "Bez."; arrayOfString3[30] = "Bezirk"; arrayOfString3[31] = "Bhf."; arrayOfString3[32] = "brit."; arrayOfString3[33] = "b.w."; arrayOfString3[34] = "bzgl."; arrayOfString3[35] = "bzw."; arrayOfString3[36] = "c.t."; arrayOfString3[37] = "ca."; arrayOfString3[38] = "Chem."; arrayOfString3[39] = "Chr."; arrayOfString3[40] = "cm"; arrayOfString3[41] = "Comp."; arrayOfString3[42] = "d.Ä."; arrayOfString3[43] = "dazw."; arrayOfString3[44] = "desgl."; arrayOfString3[45] = "dF"; arrayOfString3[46] = "dtF"; arrayOfString3[47] = "dgl."; arrayOfString3[48] = "d.h."; arrayOfString3[49] = "d.i."; arrayOfString3[50] = "Di"; arrayOfString3[51] = "Dipl."; arrayOfString3[52] = "Dipl.-Ing."; arrayOfString3[53] = "Dipl.-Kfm."; arrayOfString3[54] = "Dir."; arrayOfString3[55] = "d.J."; arrayOfString3[56] = "d.M."; arrayOfString3[57] = "d.O."; arrayOfString3[58] = "d.o."; arrayOfString3[59] = "Do"; arrayOfString3[60] = "Dr."; arrayOfString3[61] = "Dr.med."; arrayOfString3[62] = "Dr.med.dent."; arrayOfString3[63] = "Dr.med.vet."; arrayOfString3[64] = "Dr.phil."; arrayOfString3[65] = "Dr.rer.pol."; arrayOfString3[66] = "Dr.sc.nat."; arrayOfString3[67] = "D.St.V."; arrayOfString3[68] = "dt."; arrayOfString3[69] = "Dtzd."; arrayOfString3[70] = "e.h."; arrayOfString3[71] = "ehem."; arrayOfString3[72] = "eig."; arrayOfString3[73] = "eigtl."; arrayOfString3[74] = "eidg."; arrayOfString3[75] = "einschl."; arrayOfString3[76] = "engl."; arrayOfString3[77] = "EL"; arrayOfString3[78] = "E-Literatur"; arrayOfString3[79] = "E-Musik"; arrayOfString3[80] = "entspr."; arrayOfString3[81] = "erb."; arrayOfString3[82] = "Erw."; arrayOfString3[83] = "erw."; arrayOfString3[84] = "ev."; arrayOfString3[85] = "e.V."; arrayOfString3[86] = "evtl."; arrayOfString3[87] = "e.Wz."; arrayOfString3[88] = "exkl."; arrayOfString3[89] = "f."; arrayOfString3[90] = "ff."; arrayOfString3[91] = "Fa."; arrayOfString3[92] = "Fam."; arrayOfString3[93] = "FdH"; arrayOfString3[94] = "F.f."; arrayOfString3[95] = "Forts.f."; arrayOfString3[96] = "Ffm."; arrayOfString3[97] = "FKK"; arrayOfString3[98] = "Fr"; arrayOfString3[99] = "Fr."; arrayOfString3[100] = "fr."; arrayOfString3[101] = "Frl."; arrayOfString3[102] = "Frfr."; arrayOfString3[103] = "frz."; arrayOfString3[104] = "geb."; arrayOfString3[105] = "Gebr."; arrayOfString3[106] = "gedr."; arrayOfString3[107] = "gegr."; arrayOfString3[108] = "gek."; arrayOfString3[109] = "gem."; arrayOfString3[110] = "Ges."; arrayOfString3[111] = "gesch."; arrayOfString3[112] = "geschl."; arrayOfString3[113] = "geschr."; arrayOfString3[114] = "ges.gesch."; arrayOfString3[115] = "gest."; arrayOfString3[116] = "gez."; arrayOfString3[117] = "ggf."; arrayOfString3[118] = "ggfs."; arrayOfString3[119] = "GmbH"; arrayOfString3[120] = "gGmbH"; arrayOfString3[121] = "ggü."; arrayOfString3[122] = "ha"; arrayOfString3[123] = "Hbf."; arrayOfString3[124] = "Hg."; arrayOfString3[125] = "hl."; arrayOfString3[126] = "hpts."; arrayOfString3[127] = "Hptst."; arrayOfString3[128] = "Hr."; arrayOfString3[129] = "Hrn."; arrayOfString3[130] = "Hrsg."; arrayOfString3[131] = "i.A."; arrayOfString3[132] = "i.b."; arrayOfString3[133] = "i.B."; arrayOfString3[134] = "i.Br."; arrayOfString3[135] = "IC"; arrayOfString3[136] = "ICE"; arrayOfString3[137] = "i.D."; arrayOfString3[138] = "i.d.R."; arrayOfString3[139] = "i.H."; arrayOfString3[140] = "i.J."; arrayOfString3[141] = "Inf."; arrayOfString3[142] = "Inform."; arrayOfString3[143] = "Ing."; arrayOfString3[144] = "Inh."; arrayOfString3[145] = "inkl."; arrayOfString3[146] = "i.R."; arrayOfString3[147] = "i.V."; arrayOfString3[148] = "inzw."; arrayOfString3[149] = "jew."; arrayOfString3[150] = "Jh."; arrayOfString3[151] = "JH"; arrayOfString3[152] = "jhrl."; arrayOfString3[153] = "JWD"; arrayOfString3[154] = "k.A."; arrayOfString3[155] = "Kap."; arrayOfString3[156] = "kath."; arrayOfString3[157] = "Kfm."; arrayOfString3[158] = "kfm."; arrayOfString3[159] = "Kfz"; arrayOfString3[160] = "kg"; arrayOfString3[161] = "kgl."; arrayOfString3[162] = "Kl."; arrayOfString3[163] = "km"; arrayOfString3[164] = "kompl."; arrayOfString3[165] = "kW"; arrayOfString3[166] = "k.u.k."; arrayOfString3[167] = "k.k."; arrayOfString3[168] = "k.& k."; arrayOfString3[169] = "k.und k."; arrayOfString3[170] = "l."; arrayOfString3[171] = "Landsch."; arrayOfString3[172] = "led."; arrayOfString3[173] = "LG"; arrayOfString3[174] = "LKW"; arrayOfString3[175] = "Lkw"; arrayOfString3[176] = "L.m.a.A"; arrayOfString3[177] = "m"; arrayOfString3[178] = "Math."; arrayOfString3[179] = "Med."; arrayOfString3[180] = "mm"; arrayOfString3[181] = "MA"; arrayOfString3[182] = "M.A."; arrayOfString3[183] = "m.a.W."; arrayOfString3[184] = "m.E."; arrayOfString3[185] = "MfG"; arrayOfString3[186] = "Mi"; arrayOfString3[187] = "Mil."; arrayOfString3[188] = "Mio."; arrayOfString3[189] = "m.M."; arrayOfString3[190] = "m.M.n."; arrayOfString3[191] = "Mo"; arrayOfString3[192] = "möbl."; arrayOfString3[193] = "Mrd."; arrayOfString3[194] = "Msp."; arrayOfString3[195] = "mtl."; arrayOfString3[196] = "mdl."; arrayOfString3[197] = "m.ü.M."; arrayOfString3[198] = "m.W."; arrayOfString3[199] = "MwSt."; arrayOfString3[200] = "Mw.-St."; arrayOfString3[201] = "n."; arrayOfString3[202] = "näml."; arrayOfString3[203] = "n.Chr."; arrayOfString3[204] = "n.J."; arrayOfString3[205] = "NNO"; arrayOfString3[206] = "NNW"; arrayOfString3[207] = "NO"; arrayOfString3[208] = "nördl."; arrayOfString3[209] = "norw."; arrayOfString3[210] = "Nr."; arrayOfString3[211] = "NS"; arrayOfString3[212] = "n.u.Z."; arrayOfString3[213] = "n.V."; arrayOfString3[214] = "NW"; arrayOfString3[215] = "o."; arrayOfString3[216] = "ö"; arrayOfString3[217] = "o.A."; arrayOfString3[218] = "o.a."; arrayOfString3[219] = "o.ä."; arrayOfString3[220] = "o.B."; arrayOfString3[221] = "o.d."; arrayOfString3[222] = "od."; arrayOfString3[223] = "o.g."; arrayOfString3[224] = "oec."; arrayOfString3[225] = "OmU"; arrayOfString3[226] = "OSO"; arrayOfString3[227] = "O-Ton"; arrayOfString3[228] = "österr."; arrayOfString3[229] = "p.Adr."; arrayOfString3[230] = "Pfd."; arrayOfString3[231] = "Pkt."; arrayOfString3[232] = "Pkw"; arrayOfString3[233] = "PKW"; arrayOfString3[234] = "Pl."; arrayOfString3[235] = "PLZ"; arrayOfString3[236] = "psych."; arrayOfString3[237] = "Publ."; arrayOfString3[238] = "publ."; arrayOfString3[239] = "rer.publ."; arrayOfString3[240] = "Prof."; arrayOfString3[241] = "PS"; arrayOfString3[242] = "p.a"; arrayOfString3[243] = "päd."; arrayOfString3[244] = "qkm"; arrayOfString3[245] = "qm"; arrayOfString3[246] = "r."; arrayOfString3[247] = "RA"; arrayOfString3[248] = "Reg.-Bez."; arrayOfString3[249] = "Red."; arrayOfString3[250] = "Reg."; arrayOfString3[251] = "resp."; arrayOfString3[252] = "Rel."; arrayOfString3[253] = "R-Gespräch"; arrayOfString3[254] = "r.k."; arrayOfString3[255] = "r.-k."; arrayOfString3[256] = "röm.-kath."; arrayOfString3[257] = "röm."; arrayOfString3[258] = "S."; arrayOfString3[259] = "s."; arrayOfString3[260] = "s.a."; arrayOfString3[261] = "Sa."; arrayOfString3[262] = "schles."; arrayOfString3[263] = "schwäb."; arrayOfString3[264] = "Sch.-W."; arrayOfString3[265] = "Schw"; arrayOfString3[266] = "Schw."; arrayOfString3[267] = "schw."; arrayOfString3[268] = "schweiz."; arrayOfString3[269] = "sek."; arrayOfString3[270] = "Sicherheits."; arrayOfString3[271] = "SO"; arrayOfString3[272] = "So"; arrayOfString3[273] = "s.o."; arrayOfString3[274] = "sog."; arrayOfString3[275] = "Soz."; arrayOfString3[276] = "Soz.päd."; arrayOfString3[277] = "s.r.o."; arrayOfString3[278] = "Std."; arrayOfString3[279] = "Str."; arrayOfString3[280] = "StR."; arrayOfString3[281] = "s.u."; arrayOfString3[282] = "südd."; arrayOfString3[283] = "SW"; arrayOfString3[284] = "s/w"; arrayOfString3[285] = "SZ"; arrayOfString3[286] = "tägl."; arrayOfString3[287] = "Tech."; arrayOfString3[288] = "Tel."; arrayOfString3[289] = "TL"; arrayOfString3[290] = "tlg."; arrayOfString3[291] = "u."; arrayOfString3[292] = "u.a."; arrayOfString3[293] = "u.Ä."; arrayOfString3[294] = "u.ä."; arrayOfString3[295] = "u.a.m."; arrayOfString3[296] = "u.A.w.g."; arrayOfString3[297] = "übl."; arrayOfString3[298] = "üblw."; arrayOfString3[299] = "usw."; arrayOfString3[300] = "u.dgl."; arrayOfString3[301] = "u.v.a."; arrayOfString3[302] = "u.v.a.m."; arrayOfString3[303] = "u.U."; arrayOfString3[304] = "u.zw."; arrayOfString3[305] = "usf."; arrayOfString3[306] = "uvm."; arrayOfString3[307] = "u.V.a."; arrayOfString3[308] = "u.v.m."; arrayOfString3[309] = "V."; arrayOfString3[310] = "v."; arrayOfString3[311] = "v.a."; arrayOfString3[312] = "v.l."; arrayOfString3[313] = "v.r."; arrayOfString3[314] = "v.Chr."; arrayOfString3[315] = "Verf."; arrayOfString3[316] = "verh."; arrayOfString3[317] = "Verk.wirtsch."; arrayOfString3[318] = "Vers."; arrayOfString3[319] = "Verw."; arrayOfString3[320] = "Vet."; arrayOfString3[321] = "VG"; arrayOfString3[322] = "vgl."; arrayOfString3[323] = "Vgl."; arrayOfString3[324] = "v.H."; arrayOfString3[325] = "vorm."; arrayOfString3[326] = "v.R.w."; arrayOfString3[327] = "v.T."; arrayOfString3[328] = "v.u.Z."; arrayOfString3[329] = "Wi."; arrayOfString3[330] = "Wirtsch."; arrayOfString3[331] = "Wiss."; arrayOfString3[332] = "wstl."; arrayOfString3[333] = "w.o."; arrayOfString3[334] = "WSW"; arrayOfString3[335] = "Wwe"; arrayOfString3[336] = "Wwer"; arrayOfString3[337] = "Wz"; arrayOfString3[338] = "Z."; arrayOfString3[339] = "z."; arrayOfString3[340] = "z.B."; arrayOfString3[341] = "z.Hd."; arrayOfString3[342] = "Zi."; arrayOfString3[343] = "z.T."; arrayOfString3[344] = "Ztr."; arrayOfString3[345] = "zur."; arrayOfString3[346] = "zus."; arrayOfString3[347] = "zzgl."; arrayOfString3[348] = "z.Z."; arrayOfString3[349] = "z.Zt."; arrayOfString3[350] = "squash!"; arrayOfString3[351] = "ökol."; arrayOfString3[352] = "Dipl.Wirt.Math."; arrayOfString3[353] = "Dipl.Wirt.Inf."; arrayOfString3[354] = "Dipl.Wirt.Übers."; arrayOfString3[355] = "Dipl.Wirt.Ing."; arrayOfString3[356] = "Dipl.Mus.Päd."; arrayOfString3[357] = "Dipl.Kunst.Päd."; arrayOfString3[358] = "Dipl.Reh.Päd."; arrayOfString3[359] = "Dipl.Komm.Psych."; arrayOfString3[360] = "Dipl.Komm.Wirt"; List<String> list2 = germanMonthsShort; Set set3 = SetsKt.setOf((Object[])arrayOfString3); int m = 0;
/* 629 */     list5 = list2; Collection<String> collection2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10)); int i1 = 0;
/* 630 */     for (String item$iv$iv : list5) {
/* 631 */       String str1 = item$iv$iv; Iterable<String> iterable = collection2; int $i$a$-map-AbbreviationPatterns$German$1$abbreviationStrings$1 = 0; iterable.add(str1 + ".");
/* 632 */     }  Set<String> abbreviationStrings = SetsKt.plus(set3, collection2); Iterable<String> $this$filter$iv = germanMistakenlyDotted; int $i$f$filter = 0;
/* 633 */     Iterable<String> iterable1 = $this$filter$iv; Collection<Object> collection = new ArrayList(); int $i$f$filterTo = 0;
/* 634 */     for (String element$iv$iv : iterable1) { String it = element$iv$iv; int $i$a$-filter-AbbreviationPatterns$German$1$alreadyDotted$1 = 0; if (abbreviationStrings.contains(it)) collection.add(element$iv$iv);  }
/* 635 */      List alreadyDotted = (List)collection; if (!alreadyDotted.isEmpty()) {
/* 636 */       int $i$a$-require-AbbreviationPatterns$German$1$1 = 0;
/*     */       Iterable iterable = alreadyDotted;
/*     */       throw new IllegalArgumentException(iterable.toString());
/*     */     } 
/*     */     List sorted = CollectionsKt.sorted(abbreviationStrings);
/*     */     for (int i = 0, n = sorted.size(); i < n; i++) {
/*     */       if (i > 0 && Intrinsics.areEqual(sorted.get(i - 1), sorted.get(i)))
/*     */         System.out.println("Duplicate: " + sorted.get(i)); 
/*     */     } 
/*     */     if (!((CollectionsKt.toSet(sorted).size() == sorted.size()) ? 1 : 0)) {
/*     */       String str = "Failed requirement.";
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */     Pattern[] arrayOfPattern4 = new Pattern[3];
/*     */     arrayOfPattern4[0] = new AbbreviationPattern(new MatchingParameters(true, false, 2, null), abbreviationStrings);
/*     */     arrayOfPattern4[1] = new AbbreviationPattern(new MatchingParameters(false, false, 2, null), germanMistakenlyDotted);
/*     */     arrayOfPattern4[2] = latinGreekSIUnits;
/*     */     Pattern[] arrayOfPattern3 = arrayOfPattern4;
/*     */     German = (Pattern)new AbbreviationPatterns$German$1$2($this$German_u24lambda_u2415, arrayOfPattern3);
/*     */     Regex regex1 = new Regex("\\p{Lu}{2,5}(\\d+(\\.\\d+)*)?");
/*     */     UpperCaseSequence = (new AbbreviationPatterns$UpperCaseSequence$1(regex1)).afterWordBoundary();
/*     */     Pattern[] arrayOfPattern2 = new Pattern[6];
/*     */     arrayOfPattern2[0] = International;
/*     */     arrayOfPattern2[1] = English;
/*     */     arrayOfPattern2[2] = German;
/*     */     arrayOfPattern2[3] = Russian;
/*     */     arrayOfPattern2[4] = Ukrainian;
/*     */     arrayOfPattern2[5] = UpperCaseSequence;
/*     */     Pattern[] arrayOfPattern1 = arrayOfPattern2;
/*     */     All = (Pattern)new AbbreviationPatterns$All$1(arrayOfPattern1); }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/ext/AbbreviationPatterns$English$1$1", "Lai/grazie/nlp/patterns/AggregatedPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"})
/*     */   public static final class AbbreviationPatterns$English$1$1 extends AggregatedPattern {
/*     */     AbbreviationPatterns$English$1$1(Pattern[] $super_call_param$1) {
/*     */       super($super_call_param$1);
/*     */     }
/*     */     
/*     */     public List<TextRange> find(CharSequence text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       return super.find(text);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/ext/AbbreviationPatterns$Russian$1$1", "Lai/grazie/nlp/patterns/AggregatedPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"})
/*     */   public static final class AbbreviationPatterns$Russian$1$1 extends AggregatedPattern {
/*     */     AbbreviationPatterns$Russian$1$1(Pattern[] $super_call_param$1) {
/*     */       super($super_call_param$1);
/*     */     }
/*     */     
/*     */     public List<TextRange> find(CharSequence text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       return super.find(text);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/ext/AbbreviationPatterns$Ukrainian$1$1", "Lai/grazie/nlp/patterns/AggregatedPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"})
/*     */   public static final class AbbreviationPatterns$Ukrainian$1$1 extends AggregatedPattern {
/*     */     AbbreviationPatterns$Ukrainian$1$1(Pattern[] $super_call_param$1) {
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
/*     */   public final List<String> getGermanMonthsShort() {
/*     */     return germanMonthsShort;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<String> getGermanMonthsFull() {
/*     */     return germanMonthsFull;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/ext/AbbreviationPatterns$German$1$2", "Lai/grazie/nlp/patterns/AggregatedPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"})
/*     */   public static final class AbbreviationPatterns$German$1$2 extends AggregatedPattern {
/*     */     AbbreviationPatterns$German$1$2(AbbreviationPatterns $receiver, Pattern[] $super_call_param$1) {
/*     */       super($super_call_param$1);
/*     */     }
/*     */     
/*     */     public List<TextRange> find(CharSequence text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       return this.$this_run.removeSubranges(super.find(text));
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000#\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000\n\002\020\013\n\002\b\002*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026J\030\020\007\032\0020\b2\006\020\005\032\0020\0062\006\020\t\032\0020\004H\002¨\006\n"}, d2 = {"ai/grazie/nlp/patterns/ext/AbbreviationPatterns$UpperCaseSequence$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "isTheOnlyWord", "", "range", "nlp-patterns"})
/*     */   @SourceDebugExtension({"SMAP\nAbbreviationPatterns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbbreviationPatterns.kt\nai/grazie/nlp/patterns/ext/AbbreviationPatterns$UpperCaseSequence$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,528:1\n774#2:529\n865#2,2:530\n1088#3,2:532\n1771#3,2:534\n*S KotlinDebug\n*F\n+ 1 AbbreviationPatterns.kt\nai/grazie/nlp/patterns/ext/AbbreviationPatterns$UpperCaseSequence$1\n*L\n342#1:529\n342#1:530,2\n347#1:532,2\n351#1:534,2\n*E\n"})
/*     */   public static final class AbbreviationPatterns$UpperCaseSequence$1 extends RegexPattern {
/*     */     AbbreviationPatterns$UpperCaseSequence$1(Regex $super_call_param$1) {
/*     */       super($super_call_param$1);
/*     */     }
/*     */     
/*     */     public List<TextRange> find(CharSequence text) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'text'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_0
/*     */       //   7: aload_1
/*     */       //   8: invokespecial find : (Ljava/lang/CharSequence;)Ljava/util/List;
/*     */       //   11: checkcast java/lang/Iterable
/*     */       //   14: astore_3
/*     */       //   15: iconst_0
/*     */       //   16: istore #4
/*     */       //   18: aload_3
/*     */       //   19: astore #5
/*     */       //   21: new java/util/ArrayList
/*     */       //   24: dup
/*     */       //   25: invokespecial <init> : ()V
/*     */       //   28: checkcast java/util/Collection
/*     */       //   31: astore #6
/*     */       //   33: iconst_0
/*     */       //   34: istore #7
/*     */       //   36: aload #5
/*     */       //   38: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   43: astore #8
/*     */       //   45: aload #8
/*     */       //   47: invokeinterface hasNext : ()Z
/*     */       //   52: ifeq -> 102
/*     */       //   55: aload #8
/*     */       //   57: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   62: astore #9
/*     */       //   64: aload #9
/*     */       //   66: checkcast ai/grazie/text/TextRange
/*     */       //   69: astore #10
/*     */       //   71: iconst_0
/*     */       //   72: istore #11
/*     */       //   74: getstatic ai/grazie/nlp/patterns/Pattern.Companion : Lai/grazie/nlp/patterns/Pattern$Companion;
/*     */       //   77: aload_1
/*     */       //   78: aload #10
/*     */       //   80: invokevirtual getEndExclusive : ()I
/*     */       //   83: invokevirtual isWordBoundaryOrApostrophe$nlp_patterns : (Ljava/lang/CharSequence;I)Z
/*     */       //   86: ifeq -> 45
/*     */       //   89: aload #6
/*     */       //   91: aload #9
/*     */       //   93: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   98: pop
/*     */       //   99: goto -> 45
/*     */       //   102: aload #6
/*     */       //   104: checkcast java/util/List
/*     */       //   107: nop
/*     */       //   108: astore_2
/*     */       //   109: aload_2
/*     */       //   110: invokeinterface size : ()I
/*     */       //   115: iconst_1
/*     */       //   116: if_icmpne -> 139
/*     */       //   119: aload_0
/*     */       //   120: aload_1
/*     */       //   121: aload_2
/*     */       //   122: iconst_0
/*     */       //   123: invokeinterface get : (I)Ljava/lang/Object;
/*     */       //   128: checkcast ai/grazie/text/TextRange
/*     */       //   131: invokespecial isTheOnlyWord : (Ljava/lang/CharSequence;Lai/grazie/text/TextRange;)Z
/*     */       //   134: ifeq -> 139
/*     */       //   137: aload_2
/*     */       //   138: areturn
/*     */       //   139: aload_1
/*     */       //   140: astore_3
/*     */       //   141: iconst_0
/*     */       //   142: istore #4
/*     */       //   144: iconst_0
/*     */       //   145: istore #5
/*     */       //   147: iload #5
/*     */       //   149: aload_3
/*     */       //   150: invokeinterface length : ()I
/*     */       //   155: if_icmpge -> 194
/*     */       //   158: aload_3
/*     */       //   159: iload #5
/*     */       //   161: invokeinterface charAt : (I)C
/*     */       //   166: istore #6
/*     */       //   168: iload #6
/*     */       //   170: istore #7
/*     */       //   172: iconst_0
/*     */       //   173: istore #8
/*     */       //   175: iload #7
/*     */       //   177: invokestatic isLowerCase : (C)Z
/*     */       //   180: nop
/*     */       //   181: ifeq -> 188
/*     */       //   184: iconst_1
/*     */       //   185: goto -> 195
/*     */       //   188: iinc #5, 1
/*     */       //   191: goto -> 147
/*     */       //   194: iconst_0
/*     */       //   195: ifeq -> 202
/*     */       //   198: aload_2
/*     */       //   199: goto -> 205
/*     */       //   202: invokestatic emptyList : ()Ljava/util/List;
/*     */       //   205: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #342	-> 6
/*     */       //   #529	-> 18
/*     */       //   #530	-> 36
/*     */       //   #342	-> 74
/*     */       //   #530	-> 86
/*     */       //   #531	-> 102
/*     */       //   #529	-> 107
/*     */       //   #342	-> 108
/*     */       //   #343	-> 109
/*     */       //   #344	-> 137
/*     */       //   #347	-> 139
/*     */       //   #532	-> 144
/*     */       //   #347	-> 175
/*     */       //   #347	-> 180
/*     */       //   #532	-> 181
/*     */       //   #533	-> 194
/*     */       //   #347	-> 195
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   74	12	11	$i$a$-filter-AbbreviationPatterns$UpperCaseSequence$1$find$uppercase$1	I
/*     */       //   71	15	10	it	Lai/grazie/text/TextRange;
/*     */       //   64	35	9	element$iv$iv	Ljava/lang/Object;
/*     */       //   36	68	7	$i$f$filterTo	I
/*     */       //   33	71	5	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */       //   33	71	6	destination$iv$iv	Ljava/util/Collection;
/*     */       //   18	90	4	$i$f$filter	I
/*     */       //   15	93	3	$this$filter$iv	Ljava/lang/Iterable;
/*     */       //   175	6	8	$i$a$-any-AbbreviationPatterns$UpperCaseSequence$1$find$1	I
/*     */       //   172	9	7	it	C
/*     */       //   168	20	6	element$iv	C
/*     */       //   144	51	4	$i$f$any	I
/*     */       //   141	54	3	$this$any$iv	Ljava/lang/CharSequence;
/*     */       //   109	97	2	uppercase	Ljava/util/List;
/*     */       //   0	206	0	this	Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$UpperCaseSequence$1;
/*     */       //   0	206	1	text	Ljava/lang/CharSequence;
/*     */     }
/*     */     
/*     */     private final boolean isTheOnlyWord(CharSequence text, TextRange range) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: iconst_0
/*     */       //   2: aload_2
/*     */       //   3: invokevirtual getStart : ()I
/*     */       //   6: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
/*     */       //   11: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   14: aload_1
/*     */       //   15: astore_3
/*     */       //   16: aload_2
/*     */       //   17: invokevirtual getEndExclusive : ()I
/*     */       //   20: istore #4
/*     */       //   22: aload_3
/*     */       //   23: invokeinterface length : ()I
/*     */       //   28: istore #5
/*     */       //   30: aload_3
/*     */       //   31: iload #4
/*     */       //   33: iload #5
/*     */       //   35: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
/*     */       //   40: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   43: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */       //   48: checkcast java/lang/CharSequence
/*     */       //   51: astore_3
/*     */       //   52: nop
/*     */       //   53: iconst_0
/*     */       //   54: istore #4
/*     */       //   56: iconst_0
/*     */       //   57: istore #5
/*     */       //   59: iload #5
/*     */       //   61: aload_3
/*     */       //   62: invokeinterface length : ()I
/*     */       //   67: if_icmpge -> 106
/*     */       //   70: aload_3
/*     */       //   71: iload #5
/*     */       //   73: invokeinterface charAt : (I)C
/*     */       //   78: istore #6
/*     */       //   80: iload #6
/*     */       //   82: istore #7
/*     */       //   84: iconst_0
/*     */       //   85: istore #8
/*     */       //   87: iload #7
/*     */       //   89: invokestatic isLetterOrDigit : (C)Z
/*     */       //   92: nop
/*     */       //   93: ifeq -> 100
/*     */       //   96: iconst_0
/*     */       //   97: goto -> 107
/*     */       //   100: iinc #5, 1
/*     */       //   103: goto -> 59
/*     */       //   106: iconst_1
/*     */       //   107: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #351	-> 0
/*     */       //   #351	-> 14
/*     */       //   #351	-> 52
/*     */       //   #534	-> 56
/*     */       //   #351	-> 87
/*     */       //   #351	-> 92
/*     */       //   #534	-> 93
/*     */       //   #535	-> 106
/*     */       //   #351	-> 107
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   87	6	8	$i$a$-none-AbbreviationPatterns$UpperCaseSequence$1$isTheOnlyWord$1	I
/*     */       //   84	9	7	it	C
/*     */       //   80	20	6	element$iv	C
/*     */       //   56	51	4	$i$f$none	I
/*     */       //   53	54	3	$this$none$iv	Ljava/lang/CharSequence;
/*     */       //   0	108	0	this	Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$UpperCaseSequence$1;
/*     */       //   0	108	1	text	Ljava/lang/CharSequence;
/*     */       //   0	108	2	range	Lai/grazie/text/TextRange;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/ext/AbbreviationPatterns$All$1", "Lai/grazie/nlp/patterns/AggregatedPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"})
/*     */   public static final class AbbreviationPatterns$All$1 extends AggregatedPattern {
/*     */     AbbreviationPatterns$All$1(Pattern[] $super_call_param$1) {
/*     */       super($super_call_param$1);
/*     */     }
/*     */     
/*     */     public List<TextRange> find(CharSequence text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       return AbbreviationPatterns.INSTANCE.removeSubranges(super.find(text));
/*     */     }
/*     */   }
/*     */   
/*     */   private final Map<Language, Pattern> createRelevantPatterns(boolean caseSensitive, boolean onlyWithPunct) {
/*     */     Pair[] arrayOfPair = new Pair[5];
/*     */     Pattern[] arrayOfPattern = new Pattern[2];
/*     */     arrayOfPattern[0] = International;
/*     */     arrayOfPattern[1] = English;
/*     */     arrayOfPair[0] = TuplesKt.to(Language.ENGLISH, createRelevantPattern(caseSensitive, onlyWithPunct, arrayOfPattern));
/*     */     arrayOfPattern = new Pattern[2];
/*     */     arrayOfPattern[0] = International;
/*     */     arrayOfPattern[1] = German;
/*     */     arrayOfPair[1] = TuplesKt.to(Language.GERMAN, createRelevantPattern(caseSensitive, onlyWithPunct, arrayOfPattern));
/*     */     arrayOfPattern = new Pattern[2];
/*     */     arrayOfPattern[0] = International;
/*     */     arrayOfPattern[1] = Russian;
/*     */     arrayOfPair[2] = TuplesKt.to(Language.RUSSIAN, createRelevantPattern(caseSensitive, onlyWithPunct, arrayOfPattern));
/*     */     arrayOfPattern = new Pattern[2];
/*     */     arrayOfPattern[0] = International;
/*     */     arrayOfPattern[1] = Ukrainian;
/*     */     arrayOfPair[3] = TuplesKt.to(Language.UKRAINIAN, createRelevantPattern(caseSensitive, onlyWithPunct, arrayOfPattern));
/*     */     arrayOfPattern = new Pattern[5];
/*     */     arrayOfPattern[0] = International;
/*     */     arrayOfPattern[1] = English;
/*     */     arrayOfPattern[2] = German;
/*     */     arrayOfPattern[3] = Russian;
/*     */     arrayOfPattern[4] = Ukrainian;
/*     */     arrayOfPair[4] = TuplesKt.to(Language.UNKNOWN, createRelevantPattern(caseSensitive, onlyWithPunct, arrayOfPattern));
/*     */     return MapsKt.mapOf(arrayOfPair);
/*     */   }
/*     */   
/*     */   private final Pattern createRelevantPattern(boolean caseSensitive, boolean onlyWithPunct, Pattern... components) {
/*     */     List list1 = CollectionsKt.plus(CollectionsKt.listOf(International), (Object[])components);
/*     */     int $i$f$flatMap = 0;
/*     */     List list2 = list1;
/*     */     Collection<Object> collection = new ArrayList();
/*     */     int $i$f$flatMapTo = 0;
/*     */     for (Object element$iv$iv : list2) {
/*     */       Pattern it = (Pattern)element$iv$iv;
/*     */       int $i$a$-flatMap-AbbreviationPatterns$createRelevantPattern$onlyRelevant$1 = 0;
/*     */     } 
/*     */     Iterable $this$flatMap$iv = collection;
/*     */     int $i$f$filterIsInstance = 0;
/*     */     Iterable $this$flatMapTo$iv$iv = $this$flatMap$iv;
/*     */     collection = new ArrayList();
/*     */     int $i$f$filterIsInstanceTo = 0;
/*     */     for (Object element$iv$iv : $this$flatMapTo$iv$iv) {
/*     */       if (element$iv$iv instanceof AbbreviationPattern)
/*     */         collection.add(element$iv$iv); 
/*     */     } 
/*     */     Iterable $this$filterIsInstance$iv = collection;
/*     */     int $i$f$groupBy = 0;
/*     */     Iterable $this$filterIsInstanceTo$iv$iv = $this$filterIsInstance$iv;
/*     */     Map<Object, Object> map4 = new LinkedHashMap<>();
/*     */     int $i$f$groupByTo = 0;
/*     */     for (Object element$iv$iv : $this$filterIsInstanceTo$iv$iv) {
/*     */       AbbreviationPattern it = (AbbreviationPattern)element$iv$iv;
/*     */       int $i$a$-groupBy-AbbreviationPatterns$createRelevantPattern$onlyRelevant$2 = 0;
/*     */       Object key$iv$iv = it.getParams();
/*     */       Map<Object, Object> $this$getOrPut$iv$iv$iv = map4;
/*     */       int $i$f$getOrPut = 0;
/*     */       Object value$iv$iv$iv = $this$getOrPut$iv$iv$iv.get(key$iv$iv);
/*     */     } 
/*     */     Map<Object, Object> map1 = map4;
/*     */     int $i$f$mapValues = 0;
/*     */     Map<Object, Object> map2 = map1, map3 = new LinkedHashMap<>(MapsKt.mapCapacity(map1.size()));
/*     */     int $i$f$mapValuesTo = 0;
/*     */     Iterable<Map.Entry<Object, Object>> $this$associateByTo$iv$iv$iv = map2.entrySet();
/*     */     int $i$f$associateByTo = 0;
/*     */     for (Object<Object, Object> element$iv$iv$iv : $this$associateByTo$iv$iv$iv) {
/*     */       Map.Entry entry1 = (Map.Entry)element$iv$iv$iv;
/*     */       Map<Object, Object> map5 = map3;
/*     */       int $i$a$-associateByTo-MapsKt__MapsKt$mapValuesTo$1$iv$iv = 0;
/*     */       Map.Entry entry2 = (Map.Entry)element$iv$iv$iv;
/*     */       Object object = entry1.getKey();
/*     */       Map<Object, Object> map6 = map5;
/*     */       int $i$a$-mapValues-AbbreviationPatterns$createRelevantPattern$onlyRelevant$3 = 0;
/*     */     } 
/*     */     Map<Object, Object> $this$mapValues$iv = map3;
/*     */     int $i$f$mapNotNull = 0;
/*     */     Map<Object, Object> $this$mapValuesTo$iv$iv = $this$mapValues$iv;
/*     */     Collection destination$iv$iv = new ArrayList();
/*     */     int $i$f$mapNotNullTo = 0;
/*     */     Map<Object, Object> $this$forEach$iv$iv$iv = $this$mapValuesTo$iv$iv;
/*     */     int $i$f$forEach = 0;
/*     */     Iterator<Map.Entry> iterator = $this$forEach$iv$iv$iv.entrySet().iterator();
/*     */     if (iterator.hasNext()) {
/*     */       Map.Entry element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv;
/*     */       int $i$a$-forEach-MapsKt___MapsKt$mapNotNullTo$1$iv$iv = 0;
/*     */       Map.Entry entry1 = element$iv$iv;
/*     */       int $i$a$-mapNotNull-AbbreviationPatterns$createRelevantPattern$onlyRelevant$4 = 0;
/*     */     } 
/*     */     List<AbbreviationPattern> onlyRelevant = (List)destination$iv$iv;
/*     */     return (Pattern)new AbbreviationPatterns$createRelevantPattern$1(onlyRelevant);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/ext/AbbreviationPatterns$createRelevantPattern$1", "Lai/grazie/nlp/patterns/AggregatedPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"})
/*     */   public static final class AbbreviationPatterns$createRelevantPattern$1 extends AggregatedPattern {
/*     */     AbbreviationPatterns$createRelevantPattern$1(List $onlyRelevant) {
/*     */       super($onlyRelevant);
/*     */     }
/*     */     
/*     */     public List<TextRange> find(CharSequence text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       return AbbreviationPatterns.INSTANCE.removeSubranges(super.find(text));
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final Lazy relevantPatternsForSentenceTokenizer$delegate = LazyKt.lazy(AbbreviationPatterns$relevantPatternsForSentenceTokenizer$2.INSTANCE);
/*     */   
/*     */   private final Map<Language, Pattern> getRelevantPatternsForSentenceTokenizer() {
/*     */     Lazy lazy = relevantPatternsForSentenceTokenizer$delegate;
/*     */     return (Map<Language, Pattern>)lazy.getValue();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020$\n\002\030\002\n\002\030\002\n\000\020\000\032\016\022\004\022\0020\002\022\004\022\0020\0030\001H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "Lai/grazie/nlp/langs/Language;", "Lai/grazie/nlp/patterns/Pattern;", "invoke"})
/*     */   static final class AbbreviationPatterns$relevantPatternsForSentenceTokenizer$2 extends Lambda implements Function0<Map<Language, ? extends Pattern>> {
/*     */     public static final AbbreviationPatterns$relevantPatternsForSentenceTokenizer$2 INSTANCE = new AbbreviationPatterns$relevantPatternsForSentenceTokenizer$2();
/*     */     
/*     */     public final Map<Language, Pattern> invoke() {
/*     */       return AbbreviationPatterns.INSTANCE.createRelevantPatterns(false, true);
/*     */     }
/*     */     
/*     */     AbbreviationPatterns$relevantPatternsForSentenceTokenizer$2() {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   @NotNull
/*     */   private static final Lazy internationalOnlyPatternForSentenceTokenizer$delegate = LazyKt.lazy(AbbreviationPatterns$internationalOnlyPatternForSentenceTokenizer$2.INSTANCE);
/*     */   
/*     */   private final Pattern getInternationalOnlyPatternForSentenceTokenizer() {
/*     */     Lazy lazy = internationalOnlyPatternForSentenceTokenizer$delegate;
/*     */     return (Pattern)lazy.getValue();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/nlp/patterns/Pattern;", "invoke"})
/*     */   static final class AbbreviationPatterns$internationalOnlyPatternForSentenceTokenizer$2 extends Lambda implements Function0<Pattern> {
/*     */     public static final AbbreviationPatterns$internationalOnlyPatternForSentenceTokenizer$2 INSTANCE = new AbbreviationPatterns$internationalOnlyPatternForSentenceTokenizer$2();
/*     */     
/*     */     public final Pattern invoke() {
/*     */       Pattern[] arrayOfPattern = new Pattern[1];
/*     */       arrayOfPattern[0] = AbbreviationPatterns.International;
/*     */       return AbbreviationPatterns.INSTANCE.createRelevantPattern(false, true, arrayOfPattern);
/*     */     }
/*     */     
/*     */     AbbreviationPatterns$internationalOnlyPatternForSentenceTokenizer$2() {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   @NotNull
/*     */   private static final Lazy relevantPatternsForSpeller$delegate = LazyKt.lazy(AbbreviationPatterns$relevantPatternsForSpeller$2.INSTANCE);
/*     */   
/*     */   private final Map<Language, Pattern> getRelevantPatternsForSpeller() {
/*     */     Lazy lazy = relevantPatternsForSpeller$delegate;
/*     */     return (Map<Language, Pattern>)lazy.getValue();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020$\n\002\030\002\n\002\030\002\n\000\020\000\032\016\022\004\022\0020\002\022\004\022\0020\0030\001H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "Lai/grazie/nlp/langs/Language;", "Lai/grazie/nlp/patterns/Pattern;", "invoke"})
/*     */   static final class AbbreviationPatterns$relevantPatternsForSpeller$2 extends Lambda implements Function0<Map<Language, ? extends Pattern>> {
/*     */     public static final AbbreviationPatterns$relevantPatternsForSpeller$2 INSTANCE = new AbbreviationPatterns$relevantPatternsForSpeller$2();
/*     */     
/*     */     public final Map<Language, Pattern> invoke() {
/*     */       return AbbreviationPatterns.INSTANCE.createRelevantPatterns(true, false);
/*     */     }
/*     */     
/*     */     AbbreviationPatterns$relevantPatternsForSpeller$2() {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   @NotNull
/*     */   private static final Lazy internationalOnlyPatternForSpeller$delegate = LazyKt.lazy(AbbreviationPatterns$internationalOnlyPatternForSpeller$2.INSTANCE);
/*     */   
/*     */   private final Pattern getInternationalOnlyPatternForSpeller() {
/*     */     Lazy lazy = internationalOnlyPatternForSpeller$delegate;
/*     */     return (Pattern)lazy.getValue();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/nlp/patterns/Pattern;", "invoke"})
/*     */   static final class AbbreviationPatterns$internationalOnlyPatternForSpeller$2 extends Lambda implements Function0<Pattern> {
/*     */     public static final AbbreviationPatterns$internationalOnlyPatternForSpeller$2 INSTANCE = new AbbreviationPatterns$internationalOnlyPatternForSpeller$2();
/*     */     
/*     */     public final Pattern invoke() {
/*     */       Pattern[] arrayOfPattern = new Pattern[1];
/*     */       arrayOfPattern[0] = AbbreviationPatterns.International;
/*     */       return AbbreviationPatterns.INSTANCE.createRelevantPattern(true, false, arrayOfPattern);
/*     */     }
/*     */     
/*     */     AbbreviationPatterns$internationalOnlyPatternForSpeller$2() {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   @NotNull
/*     */   private static final Lazy relevantPatternsWithPunctCaseSensitive$delegate = LazyKt.lazy(AbbreviationPatterns$relevantPatternsWithPunctCaseSensitive$2.INSTANCE);
/*     */   
/*     */   private final Map<Language, Pattern> getRelevantPatternsWithPunctCaseSensitive() {
/*     */     Lazy lazy = relevantPatternsWithPunctCaseSensitive$delegate;
/*     */     return (Map<Language, Pattern>)lazy.getValue();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020$\n\002\030\002\n\002\030\002\n\000\020\000\032\016\022\004\022\0020\002\022\004\022\0020\0030\001H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "Lai/grazie/nlp/langs/Language;", "Lai/grazie/nlp/patterns/Pattern;", "invoke"})
/*     */   static final class AbbreviationPatterns$relevantPatternsWithPunctCaseSensitive$2 extends Lambda implements Function0<Map<Language, ? extends Pattern>> {
/*     */     public static final AbbreviationPatterns$relevantPatternsWithPunctCaseSensitive$2 INSTANCE = new AbbreviationPatterns$relevantPatternsWithPunctCaseSensitive$2();
/*     */     
/*     */     public final Map<Language, Pattern> invoke() {
/*     */       return AbbreviationPatterns.INSTANCE.createRelevantPatterns(true, true);
/*     */     }
/*     */     
/*     */     AbbreviationPatterns$relevantPatternsWithPunctCaseSensitive$2() {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   @NotNull
/*     */   private static final Lazy internationalOnlyPatternWithPunctCaseSensitive$delegate = LazyKt.lazy(AbbreviationPatterns$internationalOnlyPatternWithPunctCaseSensitive$2.INSTANCE);
/*     */   
/*     */   private final Pattern getInternationalOnlyPatternWithPunctCaseSensitive() {
/*     */     Lazy lazy = internationalOnlyPatternWithPunctCaseSensitive$delegate;
/*     */     return (Pattern)lazy.getValue();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/nlp/patterns/Pattern;", "invoke"})
/*     */   static final class AbbreviationPatterns$internationalOnlyPatternWithPunctCaseSensitive$2 extends Lambda implements Function0<Pattern> {
/*     */     public static final AbbreviationPatterns$internationalOnlyPatternWithPunctCaseSensitive$2 INSTANCE = new AbbreviationPatterns$internationalOnlyPatternWithPunctCaseSensitive$2();
/*     */     
/*     */     public final Pattern invoke() {
/*     */       Pattern[] arrayOfPattern = new Pattern[1];
/*     */       arrayOfPattern[0] = AbbreviationPatterns.International;
/*     */       return AbbreviationPatterns.INSTANCE.createRelevantPattern(true, true, arrayOfPattern);
/*     */     }
/*     */     
/*     */     AbbreviationPatterns$internationalOnlyPatternWithPunctCaseSensitive$2() {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   @Deprecated(message = "Use forSentenceTokenization instead", replaceWith = @ReplaceWith(expression = "forSentenceTokenization", imports = {}))
/*     */   @NotNull
/*     */   public static final Pattern forSentenceTokenizer(@NotNull Language language) {
/*     */     Intrinsics.checkNotNullParameter(language, "language");
/*     */     return INSTANCE.getRelevantPatternsWithPunctCaseSensitive().getOrDefault(language, INSTANCE.getInternationalOnlyPatternWithPunctCaseSensitive());
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   @NotNull
/*     */   public static final Pattern forSentenceTokenization(@NotNull Language language) {
/*     */     Intrinsics.checkNotNullParameter(language, "language");
/*     */     return INSTANCE.getRelevantPatternsForSentenceTokenizer().getOrDefault(language, INSTANCE.getInternationalOnlyPatternForSentenceTokenizer());
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   @NotNull
/*     */   public static final Pattern forSpeller(@NotNull Language language) {
/*     */     Intrinsics.checkNotNullParameter(language, "language");
/*     */     return INSTANCE.getRelevantPatternsForSpeller().getOrDefault(language, INSTANCE.getInternationalOnlyPatternForSpeller());
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   @NotNull
/*     */   public static final Pattern withPunctCaseSensitive(@NotNull Language language) {
/*     */     Intrinsics.checkNotNullParameter(language, "language");
/*     */     return INSTANCE.getRelevantPatternsWithPunctCaseSensitive().getOrDefault(language, INSTANCE.getInternationalOnlyPatternWithPunctCaseSensitive());
/*     */   }
/*     */   
/*     */   private final List<TextRange> removeSubranges(List ranges) {
/*     */     List<TextRange> result = new ArrayList();
/*     */     AbbreviationPatterns$removeSubranges$$inlined$compareBy$1 abbreviationPatterns$removeSubranges$$inlined$compareBy$1 = new AbbreviationPatterns$removeSubranges$$inlined$compareBy$1();
/*     */     for (TextRange range : CollectionsKt.sortedWith(ranges, new AbbreviationPatterns$removeSubranges$$inlined$thenBy$1(abbreviationPatterns$removeSubranges$$inlined$compareBy$1))) {
/*     */       if (result.isEmpty() || !((TextRange)CollectionsKt.last(result)).contains(range))
/*     */         result.add(range); 
/*     */     } 
/*     */     return result;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\013\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003¢\006\002\020\005J\t\020\t\032\0020\003HÆ\003J\t\020\n\032\0020\003HÆ\003J\035\020\013\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003HÆ\001J\023\020\f\032\0020\0032\b\020\r\032\004\030\0010\001HÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\021HÖ\001R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\007¨\006\022"}, d2 = {"Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$MatchingParameters;", "", "varyCaseDot", "", "allowBeforeApostrophe", "(ZZ)V", "getAllowBeforeApostrophe", "()Z", "getVaryCaseDot", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "nlp-patterns"})
/*     */   private static final class MatchingParameters {
/*     */     private final boolean varyCaseDot;
/*     */     private final boolean allowBeforeApostrophe;
/*     */     
/*     */     public MatchingParameters(boolean varyCaseDot, boolean allowBeforeApostrophe) {
/*     */       this.varyCaseDot = varyCaseDot;
/*     */       this.allowBeforeApostrophe = allowBeforeApostrophe;
/*     */     }
/*     */     
/*     */     public final boolean getVaryCaseDot() {
/*     */       return this.varyCaseDot;
/*     */     }
/*     */     
/*     */     public final boolean getAllowBeforeApostrophe() {
/*     */       return this.allowBeforeApostrophe;
/*     */     }
/*     */     
/*     */     public final boolean component1() {
/*     */       return this.varyCaseDot;
/*     */     }
/*     */     
/*     */     public final boolean component2() {
/*     */       return this.allowBeforeApostrophe;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final MatchingParameters copy(boolean varyCaseDot, boolean allowBeforeApostrophe) {
/*     */       return new MatchingParameters(varyCaseDot, allowBeforeApostrophe);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "MatchingParameters(varyCaseDot=" + this.varyCaseDot + ", allowBeforeApostrophe=" + this.allowBeforeApostrophe + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = Boolean.hashCode(this.varyCaseDot);
/*     */       return result * 31 + Boolean.hashCode(this.allowBeforeApostrophe);
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof MatchingParameters))
/*     */         return false; 
/*     */       MatchingParameters matchingParameters = (MatchingParameters)other;
/*     */       return (this.varyCaseDot != matchingParameters.varyCaseDot) ? false : (!(this.allowBeforeApostrophe != matchingParameters.allowBeforeApostrophe));
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000Q\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\036\n\002\020\016\n\002\b\002\n\002\020#\n\002\b\002\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\r\n\000\n\002\030\002\n\000\n\002\020 \n\000\n\002\b\006\n\002\020\f\n\000*\001\034\b\002\030\0002\0020\001B\033\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\007J\030\020\023\032\0020\0242\006\020\025\032\0020\0262\006\020\027\032\0020\030H\002J\026\020\031\032\b\022\004\022\0020\0300\0322\006\020\025\032\0020\026H\026J\025\020\033\032\0020\0342\006\020\025\032\0020\026H\002¢\006\002\020\035J\030\020\036\032\0020\0242\006\020\025\032\0020\0262\006\020\027\032\0020\030H\002J\030\020\037\032\0020\0242\006\020\025\032\0020\0262\006\020\027\032\0020\030H\002J\020\020 \032\0020\0242\006\020!\032\0020\"H\002R\024\020\b\032\b\022\004\022\0020\0060\tX\004¢\006\002\n\000R\016\020\n\032\0020\001X\004¢\006\002\n\000R\016\020\013\032\0020\fX\004¢\006\002\n\000R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016R\016\020\017\032\0020\fX\004¢\006\002\n\000R\024\020\020\032\b\022\004\022\0020\0060\tX\004¢\006\002\n\000R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\021\020\022¨\006#"}, d2 = {"Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern;", "Lai/grazie/nlp/patterns/Pattern;", "params", "Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$MatchingParameters;", "words", "", "", "(Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$MatchingParameters;Ljava/util/Collection;)V", "baseAndCapitalized", "", "delegate", "numberContinuation", "Lkotlin/text/Regex;", "getParams", "()Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$MatchingParameters;", "possiblySpacedDot", "upperCase", "getWords", "()Ljava/util/Collection;", "acceptMatch", "", "text", "", "range", "Lai/grazie/text/TextRange;", "find", "", "getLowerCaseSequence", "ai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern$getLowerCaseSequence$1", "(Ljava/lang/CharSequence;)Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern$getLowerCaseSequence$1;", "isBoundaryOk", "isInUpperCaseVicinity", "isSpace", "c", "", "nlp-patterns"})
/*     */   @SourceDebugExtension({"SMAP\nAbbreviationPatterns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbbreviationPatterns.kt\nai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,528:1\n1#2:529\n1368#3:530\n1454#3,2:531\n1456#3,3:535\n774#3:538\n865#3:539\n866#3:542\n1557#3:543\n1628#3,3:544\n827#3:547\n855#3,2:548\n1557#3:550\n1628#3,3:551\n1053#3:554\n1088#4,2:533\n1088#4,2:540\n1771#4,2:555\n*S KotlinDebug\n*F\n+ 1 AbbreviationPatterns.kt\nai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern\n*L\n451#1:530\n451#1:531,2\n451#1:535,3\n457#1:538\n457#1:539\n457#1:542\n457#1:543\n457#1:544,3\n457#1:547\n457#1:548,2\n460#1:550\n460#1:551,3\n462#1:554\n452#1:533,2\n457#1:540,2\n516#1:555,2\n*E\n"})
/*     */   private static final class AbbreviationPattern implements Pattern {
/*     */     @NotNull
/*     */     private final AbbreviationPatterns.MatchingParameters params;
/*     */     @NotNull
/*     */     private final Collection<String> words;
/*     */     @NotNull
/*     */     private final Regex possiblySpacedDot;
/*     */     @NotNull
/*     */     private final Set<String> baseAndCapitalized;
/*     */     @NotNull
/*     */     private final Set<String> upperCase;
/*     */     @NotNull
/*     */     private final Pattern delegate;
/*     */     @NotNull
/*     */     private final Regex numberContinuation;
/*     */     
/*     */     public AbbreviationPattern(@NotNull AbbreviationPatterns.MatchingParameters params, @NotNull Collection words) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'params'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_2
/*     */       //   7: ldc 'words'
/*     */       //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   12: aload_0
/*     */       //   13: invokespecial <init> : ()V
/*     */       //   16: aload_0
/*     */       //   17: aload_1
/*     */       //   18: putfield params : Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$MatchingParameters;
/*     */       //   21: aload_0
/*     */       //   22: aload_2
/*     */       //   23: putfield words : Ljava/util/Collection;
/*     */       //   26: aload_0
/*     */       //   27: new kotlin/text/Regex
/*     */       //   30: dup
/*     */       //   31: ldc '[  ]?\.[  ]?'
/*     */       //   33: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   36: putfield possiblySpacedDot : Lkotlin/text/Regex;
/*     */       //   39: nop
/*     */       //   40: new kotlin/text/Regex
/*     */       //   43: dup
/*     */       //   44: ldc '\.\s'
/*     */       //   46: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   49: astore_3
/*     */       //   50: aload_0
/*     */       //   51: getfield words : Ljava/util/Collection;
/*     */       //   54: checkcast java/lang/Iterable
/*     */       //   57: astore #6
/*     */       //   59: aload #6
/*     */       //   61: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   66: astore #7
/*     */       //   68: aload #7
/*     */       //   70: invokeinterface hasNext : ()Z
/*     */       //   75: ifeq -> 125
/*     */       //   78: aload #7
/*     */       //   80: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   85: astore #8
/*     */       //   87: aload #8
/*     */       //   89: checkcast java/lang/String
/*     */       //   92: astore #9
/*     */       //   94: iconst_0
/*     */       //   95: istore #10
/*     */       //   97: aload_3
/*     */       //   98: aload #9
/*     */       //   100: checkcast java/lang/CharSequence
/*     */       //   103: iconst_0
/*     */       //   104: iconst_2
/*     */       //   105: aconst_null
/*     */       //   106: invokestatic find$default : (Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;
/*     */       //   109: ifnull -> 116
/*     */       //   112: iconst_1
/*     */       //   113: goto -> 117
/*     */       //   116: iconst_0
/*     */       //   117: ifeq -> 68
/*     */       //   120: aload #8
/*     */       //   122: goto -> 126
/*     */       //   125: aconst_null
/*     */       //   126: checkcast java/lang/String
/*     */       //   129: astore #4
/*     */       //   131: aload #4
/*     */       //   133: ifnull -> 158
/*     */       //   136: aload #4
/*     */       //   138: astore #6
/*     */       //   140: iconst_0
/*     */       //   141: istore #7
/*     */       //   143: new java/lang/IllegalArgumentException
/*     */       //   146: dup
/*     */       //   147: aload #6
/*     */       //   149: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   154: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   157: athrow
/*     */       //   158: nop
/*     */       //   159: aload_0
/*     */       //   160: aload_0
/*     */       //   161: getfield words : Ljava/util/Collection;
/*     */       //   164: checkcast java/lang/Iterable
/*     */       //   167: astore_3
/*     */       //   168: astore #19
/*     */       //   170: iconst_0
/*     */       //   171: istore #4
/*     */       //   173: aload_3
/*     */       //   174: astore #5
/*     */       //   176: new java/util/ArrayList
/*     */       //   179: dup
/*     */       //   180: invokespecial <init> : ()V
/*     */       //   183: checkcast java/util/Collection
/*     */       //   186: astore #6
/*     */       //   188: iconst_0
/*     */       //   189: istore #7
/*     */       //   191: aload #5
/*     */       //   193: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   198: astore #8
/*     */       //   200: aload #8
/*     */       //   202: invokeinterface hasNext : ()Z
/*     */       //   207: ifeq -> 428
/*     */       //   210: aload #8
/*     */       //   212: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   217: astore #9
/*     */       //   219: aload #9
/*     */       //   221: checkcast java/lang/String
/*     */       //   224: astore #10
/*     */       //   226: iconst_0
/*     */       //   227: istore #11
/*     */       //   229: aload #10
/*     */       //   231: invokevirtual length : ()I
/*     */       //   234: iconst_1
/*     */       //   235: if_icmple -> 331
/*     */       //   238: aload #10
/*     */       //   240: iconst_0
/*     */       //   241: invokevirtual charAt : (I)C
/*     */       //   244: invokestatic isLowerCase : (C)Z
/*     */       //   247: ifeq -> 331
/*     */       //   250: aload #10
/*     */       //   252: iconst_1
/*     */       //   253: invokevirtual substring : (I)Ljava/lang/String;
/*     */       //   256: dup
/*     */       //   257: ldc 'substring(...)'
/*     */       //   259: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   262: checkcast java/lang/CharSequence
/*     */       //   265: astore #12
/*     */       //   267: nop
/*     */       //   268: iconst_0
/*     */       //   269: istore #13
/*     */       //   271: iconst_0
/*     */       //   272: istore #14
/*     */       //   274: iload #14
/*     */       //   276: aload #12
/*     */       //   278: invokeinterface length : ()I
/*     */       //   283: if_icmpge -> 323
/*     */       //   286: aload #12
/*     */       //   288: iload #14
/*     */       //   290: invokeinterface charAt : (I)C
/*     */       //   295: istore #15
/*     */       //   297: iload #15
/*     */       //   299: istore #16
/*     */       //   301: iconst_0
/*     */       //   302: istore #17
/*     */       //   304: iload #16
/*     */       //   306: invokestatic isLowerCase : (C)Z
/*     */       //   309: nop
/*     */       //   310: ifeq -> 317
/*     */       //   313: iconst_1
/*     */       //   314: goto -> 324
/*     */       //   317: iinc #14, 1
/*     */       //   320: goto -> 274
/*     */       //   323: iconst_0
/*     */       //   324: ifeq -> 331
/*     */       //   327: iconst_1
/*     */       //   328: goto -> 332
/*     */       //   331: iconst_0
/*     */       //   332: istore #18
/*     */       //   334: iload #18
/*     */       //   336: ifeq -> 407
/*     */       //   339: iconst_2
/*     */       //   340: anewarray java/lang/String
/*     */       //   343: astore #12
/*     */       //   345: aload #12
/*     */       //   347: iconst_0
/*     */       //   348: aload #10
/*     */       //   350: aastore
/*     */       //   351: aload #12
/*     */       //   353: iconst_1
/*     */       //   354: aload #10
/*     */       //   356: iconst_0
/*     */       //   357: invokevirtual charAt : (I)C
/*     */       //   360: invokestatic valueOf : (C)Ljava/lang/String;
/*     */       //   363: dup
/*     */       //   364: ldc 'null cannot be cast to non-null type java.lang.String'
/*     */       //   366: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   369: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*     */       //   372: invokevirtual toUpperCase : (Ljava/util/Locale;)Ljava/lang/String;
/*     */       //   375: dup
/*     */       //   376: ldc 'toUpperCase(...)'
/*     */       //   378: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   381: aload #10
/*     */       //   383: iconst_1
/*     */       //   384: invokevirtual substring : (I)Ljava/lang/String;
/*     */       //   387: dup
/*     */       //   388: ldc 'substring(...)'
/*     */       //   390: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   393: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */       //   398: aastore
/*     */       //   399: aload #12
/*     */       //   401: invokestatic listOf : ([Ljava/lang/Object;)Ljava/util/List;
/*     */       //   404: goto -> 412
/*     */       //   407: aload #10
/*     */       //   409: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */       //   412: checkcast java/lang/Iterable
/*     */       //   415: astore #10
/*     */       //   417: aload #6
/*     */       //   419: aload #10
/*     */       //   421: invokestatic addAll : (Ljava/util/Collection;Ljava/lang/Iterable;)Z
/*     */       //   424: pop
/*     */       //   425: goto -> 200
/*     */       //   428: aload #6
/*     */       //   430: checkcast java/util/List
/*     */       //   433: nop
/*     */       //   434: aload #19
/*     */       //   436: swap
/*     */       //   437: checkcast java/util/Collection
/*     */       //   440: invokestatic toSmallMemoryFootprintSet : (Ljava/util/Collection;)Ljava/util/Set;
/*     */       //   443: putfield baseAndCapitalized : Ljava/util/Set;
/*     */       //   446: aload_0
/*     */       //   447: aload_0
/*     */       //   448: getfield words : Ljava/util/Collection;
/*     */       //   451: checkcast java/lang/Iterable
/*     */       //   454: astore_3
/*     */       //   455: astore #19
/*     */       //   457: iconst_0
/*     */       //   458: istore #4
/*     */       //   460: aload_3
/*     */       //   461: astore #5
/*     */       //   463: new java/util/ArrayList
/*     */       //   466: dup
/*     */       //   467: invokespecial <init> : ()V
/*     */       //   470: checkcast java/util/Collection
/*     */       //   473: astore #6
/*     */       //   475: iconst_0
/*     */       //   476: istore #7
/*     */       //   478: aload #5
/*     */       //   480: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   485: astore #8
/*     */       //   487: aload #8
/*     */       //   489: invokeinterface hasNext : ()Z
/*     */       //   494: ifeq -> 596
/*     */       //   497: aload #8
/*     */       //   499: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   504: astore #9
/*     */       //   506: aload #9
/*     */       //   508: checkcast java/lang/String
/*     */       //   511: astore #10
/*     */       //   513: iconst_0
/*     */       //   514: istore #11
/*     */       //   516: aload #10
/*     */       //   518: checkcast java/lang/CharSequence
/*     */       //   521: astore #12
/*     */       //   523: iconst_0
/*     */       //   524: istore #13
/*     */       //   526: iconst_0
/*     */       //   527: istore #14
/*     */       //   529: iload #14
/*     */       //   531: aload #12
/*     */       //   533: invokeinterface length : ()I
/*     */       //   538: if_icmpge -> 578
/*     */       //   541: aload #12
/*     */       //   543: iload #14
/*     */       //   545: invokeinterface charAt : (I)C
/*     */       //   550: istore #15
/*     */       //   552: iload #15
/*     */       //   554: istore #16
/*     */       //   556: iconst_0
/*     */       //   557: istore #17
/*     */       //   559: iload #16
/*     */       //   561: invokestatic isLowerCase : (C)Z
/*     */       //   564: nop
/*     */       //   565: ifeq -> 572
/*     */       //   568: iconst_1
/*     */       //   569: goto -> 579
/*     */       //   572: iinc #14, 1
/*     */       //   575: goto -> 529
/*     */       //   578: iconst_0
/*     */       //   579: nop
/*     */       //   580: ifeq -> 487
/*     */       //   583: aload #6
/*     */       //   585: aload #9
/*     */       //   587: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   592: pop
/*     */       //   593: goto -> 487
/*     */       //   596: aload #6
/*     */       //   598: checkcast java/util/List
/*     */       //   601: nop
/*     */       //   602: aload #19
/*     */       //   604: swap
/*     */       //   605: checkcast java/lang/Iterable
/*     */       //   608: astore_3
/*     */       //   609: astore #19
/*     */       //   611: iconst_0
/*     */       //   612: istore #4
/*     */       //   614: aload_3
/*     */       //   615: astore #5
/*     */       //   617: new java/util/ArrayList
/*     */       //   620: dup
/*     */       //   621: aload_3
/*     */       //   622: bipush #10
/*     */       //   624: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */       //   627: invokespecial <init> : (I)V
/*     */       //   630: checkcast java/util/Collection
/*     */       //   633: astore #6
/*     */       //   635: iconst_0
/*     */       //   636: istore #7
/*     */       //   638: aload #5
/*     */       //   640: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   645: astore #8
/*     */       //   647: aload #8
/*     */       //   649: invokeinterface hasNext : ()Z
/*     */       //   654: ifeq -> 707
/*     */       //   657: aload #8
/*     */       //   659: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   664: astore #9
/*     */       //   666: aload #6
/*     */       //   668: aload #9
/*     */       //   670: checkcast java/lang/String
/*     */       //   673: astore #10
/*     */       //   675: astore #20
/*     */       //   677: iconst_0
/*     */       //   678: istore #11
/*     */       //   680: aload #10
/*     */       //   682: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*     */       //   685: invokevirtual toUpperCase : (Ljava/util/Locale;)Ljava/lang/String;
/*     */       //   688: dup
/*     */       //   689: ldc 'toUpperCase(...)'
/*     */       //   691: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   694: nop
/*     */       //   695: aload #20
/*     */       //   697: swap
/*     */       //   698: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   703: pop
/*     */       //   704: goto -> 647
/*     */       //   707: aload #6
/*     */       //   709: checkcast java/util/List
/*     */       //   712: nop
/*     */       //   713: aload #19
/*     */       //   715: swap
/*     */       //   716: checkcast java/lang/Iterable
/*     */       //   719: astore_3
/*     */       //   720: aload_0
/*     */       //   721: getfield baseAndCapitalized : Ljava/util/Set;
/*     */       //   724: astore #4
/*     */       //   726: astore #19
/*     */       //   728: iconst_0
/*     */       //   729: istore #5
/*     */       //   731: aload_3
/*     */       //   732: astore #6
/*     */       //   734: new java/util/ArrayList
/*     */       //   737: dup
/*     */       //   738: invokespecial <init> : ()V
/*     */       //   741: checkcast java/util/Collection
/*     */       //   744: astore #7
/*     */       //   746: iconst_0
/*     */       //   747: istore #8
/*     */       //   749: aload #6
/*     */       //   751: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   756: astore #9
/*     */       //   758: aload #9
/*     */       //   760: invokeinterface hasNext : ()Z
/*     */       //   765: ifeq -> 812
/*     */       //   768: aload #9
/*     */       //   770: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   775: astore #10
/*     */       //   777: aload #10
/*     */       //   779: checkcast java/lang/String
/*     */       //   782: astore #11
/*     */       //   784: iconst_0
/*     */       //   785: istore #12
/*     */       //   787: aload #4
/*     */       //   789: aload #11
/*     */       //   791: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */       //   796: ifne -> 758
/*     */       //   799: aload #7
/*     */       //   801: aload #10
/*     */       //   803: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   808: pop
/*     */       //   809: goto -> 758
/*     */       //   812: aload #7
/*     */       //   814: checkcast java/util/List
/*     */       //   817: nop
/*     */       //   818: aload #19
/*     */       //   820: swap
/*     */       //   821: checkcast java/util/Collection
/*     */       //   824: invokestatic toSmallMemoryFootprintSet : (Ljava/util/Collection;)Ljava/util/Set;
/*     */       //   827: putfield upperCase : Ljava/util/Set;
/*     */       //   830: aload_0
/*     */       //   831: aload_0
/*     */       //   832: checkcast ai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern
/*     */       //   835: astore #4
/*     */       //   837: astore #19
/*     */       //   839: iconst_0
/*     */       //   840: istore #5
/*     */       //   842: aload #4
/*     */       //   844: getfield words : Ljava/util/Collection;
/*     */       //   847: checkcast java/lang/Iterable
/*     */       //   850: astore #6
/*     */       //   852: iconst_0
/*     */       //   853: istore #7
/*     */       //   855: aload #6
/*     */       //   857: astore #8
/*     */       //   859: new java/util/ArrayList
/*     */       //   862: dup
/*     */       //   863: aload #6
/*     */       //   865: bipush #10
/*     */       //   867: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */       //   870: invokespecial <init> : (I)V
/*     */       //   873: checkcast java/util/Collection
/*     */       //   876: astore #9
/*     */       //   878: iconst_0
/*     */       //   879: istore #10
/*     */       //   881: aload #8
/*     */       //   883: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   888: astore #11
/*     */       //   890: aload #11
/*     */       //   892: invokeinterface hasNext : ()Z
/*     */       //   897: ifeq -> 950
/*     */       //   900: aload #11
/*     */       //   902: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   907: astore #12
/*     */       //   909: aload #9
/*     */       //   911: aload #12
/*     */       //   913: checkcast java/lang/String
/*     */       //   916: astore #13
/*     */       //   918: astore #14
/*     */       //   920: iconst_0
/*     */       //   921: istore #15
/*     */       //   923: aload #13
/*     */       //   925: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*     */       //   928: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*     */       //   931: dup
/*     */       //   932: ldc 'toLowerCase(...)'
/*     */       //   934: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   937: nop
/*     */       //   938: aload #14
/*     */       //   940: swap
/*     */       //   941: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   946: pop
/*     */       //   947: goto -> 890
/*     */       //   950: aload #9
/*     */       //   952: checkcast java/util/List
/*     */       //   955: nop
/*     */       //   956: astore #16
/*     */       //   958: new ai/grazie/nlp/patterns/RegexPattern
/*     */       //   961: dup
/*     */       //   962: new kotlin/text/Regex
/*     */       //   965: dup
/*     */       //   966: aload #16
/*     */       //   968: checkcast java/lang/Iterable
/*     */       //   971: astore #6
/*     */       //   973: iconst_0
/*     */       //   974: istore #7
/*     */       //   976: aload #6
/*     */       //   978: new ai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern$delegate$lambda$9$$inlined$sortedBy$1
/*     */       //   981: dup
/*     */       //   982: invokespecial <init> : ()V
/*     */       //   985: checkcast java/util/Comparator
/*     */       //   988: invokestatic sortedWith : (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
/*     */       //   991: checkcast java/lang/Iterable
/*     */       //   994: ldc '|'
/*     */       //   996: checkcast java/lang/CharSequence
/*     */       //   999: aconst_null
/*     */       //   1000: aconst_null
/*     */       //   1001: iconst_0
/*     */       //   1002: aconst_null
/*     */       //   1003: new ai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern$delegate$1$2
/*     */       //   1006: dup
/*     */       //   1007: aload #4
/*     */       //   1009: invokespecial <init> : (Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern;)V
/*     */       //   1012: checkcast kotlin/jvm/functions/Function1
/*     */       //   1015: bipush #30
/*     */       //   1017: aconst_null
/*     */       //   1018: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */       //   1021: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   1024: invokespecial <init> : (Lkotlin/text/Regex;)V
/*     */       //   1027: new ai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern$delegate$1$3
/*     */       //   1030: dup
/*     */       //   1031: aload #16
/*     */       //   1033: aload #4
/*     */       //   1035: invokespecial <init> : (Ljava/util/List;Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern;)V
/*     */       //   1038: invokestatic forPlatform : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   1041: checkcast ai/grazie/nlp/patterns/Pattern
/*     */       //   1044: nop
/*     */       //   1045: aload #19
/*     */       //   1047: swap
/*     */       //   1048: nop
/*     */       //   1049: putfield delegate : Lai/grazie/nlp/patterns/Pattern;
/*     */       //   1052: aload_0
/*     */       //   1053: new kotlin/text/Regex
/*     */       //   1056: dup
/*     */       //   1057: ldc '\s{3,}|\s*($|[A-Z]*\d)'
/*     */       //   1059: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   1062: putfield numberContinuation : Lkotlin/text/Regex;
/*     */       //   1065: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #440	-> 12
/*     */       //   #441	-> 26
/*     */       //   #443	-> 39
/*     */       //   #444	-> 40
/*     */       //   #445	-> 50
/*     */       //   #529	-> 94
/*     */       //   #445	-> 97
/*     */       //   #445	-> 117
/*     */       //   #445	-> 126
/*     */       //   #446	-> 143
/*     */       //   #448	-> 158
/*     */       //   #455	-> 159
/*     */       //   #450	-> 160
/*     */       //   #451	-> 168
/*     */       //   #530	-> 173
/*     */       //   #531	-> 191
/*     */       //   #532	-> 219
/*     */       //   #452	-> 229
/*     */       //   #452	-> 247
/*     */       //   #452	-> 267
/*     */       //   #533	-> 271
/*     */       //   #452	-> 304
/*     */       //   #452	-> 309
/*     */       //   #533	-> 310
/*     */       //   #534	-> 323
/*     */       //   #452	-> 324
/*     */       //   #453	-> 334
/*     */       //   #453	-> 381
/*     */       //   #453	-> 399
/*     */       //   #532	-> 412
/*     */       //   #535	-> 417
/*     */       //   #537	-> 428
/*     */       //   #530	-> 433
/*     */       //   #455	-> 440
/*     */       //   #457	-> 446
/*     */       //   #538	-> 460
/*     */       //   #539	-> 478
/*     */       //   #457	-> 516
/*     */       //   #540	-> 526
/*     */       //   #457	-> 559
/*     */       //   #457	-> 564
/*     */       //   #540	-> 565
/*     */       //   #541	-> 578
/*     */       //   #457	-> 579
/*     */       //   #539	-> 580
/*     */       //   #542	-> 596
/*     */       //   #538	-> 601
/*     */       //   #457	-> 609
/*     */       //   #543	-> 614
/*     */       //   #544	-> 638
/*     */       //   #545	-> 666
/*     */       //   #457	-> 680
/*     */       //   #457	-> 694
/*     */       //   #545	-> 698
/*     */       //   #546	-> 707
/*     */       //   #543	-> 712
/*     */       //   #457	-> 720
/*     */       //   #547	-> 731
/*     */       //   #548	-> 749
/*     */       //   #457	-> 787
/*     */       //   #548	-> 796
/*     */       //   #549	-> 812
/*     */       //   #547	-> 817
/*     */       //   #457	-> 824
/*     */       //   #459	-> 830
/*     */       //   #460	-> 842
/*     */       //   #550	-> 855
/*     */       //   #551	-> 881
/*     */       //   #552	-> 909
/*     */       //   #460	-> 923
/*     */       //   #460	-> 937
/*     */       //   #552	-> 941
/*     */       //   #553	-> 950
/*     */       //   #550	-> 955
/*     */       //   #460	-> 956
/*     */       //   #462	-> 958
/*     */       //   #554	-> 976
/*     */       //   #554	-> 988
/*     */       //   #462	-> 994
/*     */       //   #463	-> 1027
/*     */       //   #461	-> 1038
/*     */       //   #486	-> 1044
/*     */       //   #459	-> 1048
/*     */       //   #459	-> 1049
/*     */       //   #501	-> 1052
/*     */       //   #440	-> 1065
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   97	20	10	$i$a$-find-AbbreviationPatterns$AbbreviationPattern$1	I
/*     */       //   94	23	9	it	Ljava/lang/String;
/*     */       //   143	15	7	$i$a$-let-AbbreviationPatterns$AbbreviationPattern$2	I
/*     */       //   140	18	6	it	Ljava/lang/String;
/*     */       //   50	108	3	spaceAfterDot	Lkotlin/text/Regex;
/*     */       //   304	6	17	$i$a$-any-AbbreviationPatterns$AbbreviationPattern$baseAndCapitalized$1$capitalize$1	I
/*     */       //   301	9	16	it	C
/*     */       //   297	20	15	element$iv	C
/*     */       //   271	53	13	$i$f$any	I
/*     */       //   268	56	12	$this$any$iv	Ljava/lang/CharSequence;
/*     */       //   229	183	11	$i$a$-flatMap-AbbreviationPatterns$AbbreviationPattern$baseAndCapitalized$1	I
/*     */       //   334	78	18	capitalize	Z
/*     */       //   226	186	10	word	Ljava/lang/String;
/*     */       //   417	7	10	list$iv$iv	Ljava/lang/Iterable;
/*     */       //   219	206	9	element$iv$iv	Ljava/lang/Object;
/*     */       //   191	239	7	$i$f$flatMapTo	I
/*     */       //   188	242	5	$this$flatMapTo$iv$iv	Ljava/lang/Iterable;
/*     */       //   188	242	6	destination$iv$iv	Ljava/util/Collection;
/*     */       //   173	261	4	$i$f$flatMap	I
/*     */       //   170	264	3	$this$flatMap$iv	Ljava/lang/Iterable;
/*     */       //   559	6	17	$i$a$-any-AbbreviationPatterns$AbbreviationPattern$upperCase$1$1	I
/*     */       //   556	9	16	p0	C
/*     */       //   552	20	15	element$iv	C
/*     */       //   526	53	13	$i$f$any	I
/*     */       //   523	56	12	$this$any$iv	Ljava/lang/CharSequence;
/*     */       //   516	64	11	$i$a$-filter-AbbreviationPatterns$AbbreviationPattern$upperCase$1	I
/*     */       //   513	67	10	it	Ljava/lang/String;
/*     */       //   506	87	9	element$iv$iv	Ljava/lang/Object;
/*     */       //   478	120	7	$i$f$filterTo	I
/*     */       //   475	123	5	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */       //   475	123	6	destination$iv$iv	Ljava/util/Collection;
/*     */       //   460	142	4	$i$f$filter	I
/*     */       //   457	145	3	$this$filter$iv	Ljava/lang/Iterable;
/*     */       //   680	15	11	$i$a$-map-AbbreviationPatterns$AbbreviationPattern$upperCase$2	I
/*     */       //   677	18	10	it	Ljava/lang/String;
/*     */       //   666	38	9	item$iv$iv	Ljava/lang/Object;
/*     */       //   638	71	7	$i$f$mapTo	I
/*     */       //   635	74	5	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */       //   635	74	6	destination$iv$iv	Ljava/util/Collection;
/*     */       //   614	99	4	$i$f$map	I
/*     */       //   611	102	3	$this$map$iv	Ljava/lang/Iterable;
/*     */       //   787	9	12	$i$a$-filterNot-AbbreviationPatterns$AbbreviationPattern$upperCase$3	I
/*     */       //   784	12	11	p0	Ljava/lang/String;
/*     */       //   777	32	10	element$iv$iv	Ljava/lang/Object;
/*     */       //   749	65	8	$i$f$filterNotTo	I
/*     */       //   746	68	6	$this$filterNotTo$iv$iv	Ljava/lang/Iterable;
/*     */       //   746	68	7	destination$iv$iv	Ljava/util/Collection;
/*     */       //   731	87	5	$i$f$filterNot	I
/*     */       //   728	90	3	$this$filterNot$iv	Ljava/lang/Iterable;
/*     */       //   923	15	15	$i$a$-map-AbbreviationPatterns$AbbreviationPattern$delegate$1$lowWords$1	I
/*     */       //   920	18	13	it	Ljava/lang/String;
/*     */       //   909	38	12	item$iv$iv	Ljava/lang/Object;
/*     */       //   881	71	10	$i$f$mapTo	I
/*     */       //   878	74	8	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */       //   878	74	9	destination$iv$iv	Ljava/util/Collection;
/*     */       //   855	101	7	$i$f$map	I
/*     */       //   852	104	6	$this$map$iv	Ljava/lang/Iterable;
/*     */       //   976	15	7	$i$f$sortedBy	I
/*     */       //   973	18	6	$this$sortedBy$iv	Ljava/lang/Iterable;
/*     */       //   842	203	5	$i$a$-run-AbbreviationPatterns$AbbreviationPattern$delegate$1	I
/*     */       //   958	87	16	lowWords	Ljava/util/List;
/*     */       //   839	206	4	$this$delegate_u24lambda_u249	Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern;
/*     */       //   0	1066	0	this	Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern;
/*     */       //   0	1066	1	params	Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$MatchingParameters;
/*     */       //   0	1066	2	words	Ljava/util/Collection;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final AbbreviationPatterns.MatchingParameters getParams() {
/*     */       return this.params;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Collection<String> getWords() {
/*     */       return this.words;
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\020\016\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "", "invoke"})
/*     */     static final class AbbreviationPatterns$AbbreviationPattern$delegate$1$2 extends Lambda implements Function1<String, CharSequence> {
/*     */       AbbreviationPatterns$AbbreviationPattern$delegate$1$2(AbbreviationPatterns.AbbreviationPattern $receiver) {
/*     */         super(1);
/*     */       }
/*     */       
/*     */       public final CharSequence invoke(String it) {
/*     */         Intrinsics.checkNotNullParameter(it, "it");
/*     */         return StringsKt.replace$default(it, ".", this.$this_run.possiblySpacedDot.getPattern(), false, 4, null);
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\r\n\002\b\003*\001\000\b\n\030\0002\0020\001J\032\020\002\032\004\030\0010\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\002J\032\020\b\032\004\030\0010\0032\006\020\006\032\0020\0072\006\020\t\032\0020\005H\024¨\006\n"}, d2 = {"ai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern$delegate$1$3", "Lai/grazie/nlp/patterns/AhoCorasickPattern;", "dotWithSpaces", "Lai/grazie/nlp/patterns/AhoCorasickPattern$WideChar;", "i", "", "text", "", "findWideChar", "offset", "nlp-patterns"})
/*     */     public static final class AbbreviationPatterns$AbbreviationPattern$delegate$1$3 extends AhoCorasickPattern {
/*     */       AbbreviationPatterns$AbbreviationPattern$delegate$1$3(List $lowWords, AbbreviationPatterns.AbbreviationPattern $receiver) {
/*     */         super($lowWords);
/*     */       }
/*     */       
/*     */       protected AhoCorasickPattern.WideChar findWideChar(CharSequence text, int offset) {
/*     */         Intrinsics.checkNotNullParameter(text, "text");
/*     */         char c = text.charAt(offset);
/*     */         if (c == '.')
/*     */           return dotWithSpaces(offset, text); 
/*     */         if (this.$this_run.isSpace(c)) {
/*     */           if (offset > 0 && text.charAt(offset - 1) == '.') {
/*     */             AhoCorasickPattern.WideChar before = dotWithSpaces(offset - 1, text);
/*     */             if (before != null)
/*     */               return before; 
/*     */           } 
/*     */           if (offset < text.length() - 1 && text.charAt(offset + 1) == '.') {
/*     */             AhoCorasickPattern.WideChar after = dotWithSpaces(offset + 1, text);
/*     */             if (after != null)
/*     */               return after; 
/*     */           } 
/*     */         } 
/*     */         return null;
/*     */       }
/*     */       
/*     */       private final AhoCorasickPattern.WideChar dotWithSpaces(int i, CharSequence text) {
/*     */         int start = (i > 0 && this.$this_run.isSpace(text.charAt(i - 1))) ? (i - 1) : i;
/*     */         int end = (i < text.length() - 1 && this.$this_run.isSpace(text.charAt(i + 1))) ? (i + 1) : i;
/*     */         return (start == end) ? null : new AhoCorasickPattern.WideChar(start, end + 1, '.');
/*     */       }
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public List<TextRange> find(@NotNull CharSequence text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       List base = this.delegate.find(getLowerCaseSequence(text));
/*     */       return SequencesKt.toList(SequencesKt.filter(SequencesKt.map(CollectionsKt.asSequence(base), new AbbreviationPatterns$AbbreviationPattern$find$1(text)), new AbbreviationPatterns$AbbreviationPattern$find$2(text)));
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "Lai/grazie/text/TextRange;", "it", "invoke"})
/*     */     static final class AbbreviationPatterns$AbbreviationPattern$find$1 extends Lambda implements Function1<TextRange, TextRange> {
/*     */       AbbreviationPatterns$AbbreviationPattern$find$1(CharSequence $text) {
/*     */         super(1);
/*     */       }
/*     */       
/*     */       public final TextRange invoke(TextRange it) {
/*     */         Intrinsics.checkNotNullParameter(it, "it");
/*     */         return AbbreviationPatterns.AbbreviationPattern.this.isSpace(this.$text.charAt(it.getEndInclusive())) ? new TextRange(it.getStart(), it.getEndInclusive()) : it;
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "Lai/grazie/text/TextRange;", "invoke", "(Lai/grazie/text/TextRange;)Ljava/lang/Boolean;"})
/*     */     static final class AbbreviationPatterns$AbbreviationPattern$find$2 extends Lambda implements Function1<TextRange, Boolean> {
/*     */       AbbreviationPatterns$AbbreviationPattern$find$2(CharSequence $text) {
/*     */         super(1);
/*     */       }
/*     */       
/*     */       public final Boolean invoke(TextRange it) {
/*     */         Intrinsics.checkNotNullParameter(it, "it");
/*     */         return Boolean.valueOf((AbbreviationPatterns.AbbreviationPattern.this.isBoundaryOk(this.$text, it) && AbbreviationPatterns.AbbreviationPattern.this.acceptMatch(this.$text, it)));
/*     */       }
/*     */     }
/*     */     
/*     */     private final boolean isBoundaryOk(CharSequence text, TextRange range) {
/*     */       return (Pattern.Companion.isWordBoundaryBefore(text, range.getStart()) && (this.params.getAllowBeforeApostrophe() ? Pattern.Companion.isWordBoundaryOrApostrophe$nlp_patterns(text, range.getEndExclusive()) : Pattern.Companion.isWordBoundaryBefore(text, range.getEndExclusive())));
/*     */     }
/*     */     
/*     */     private final boolean acceptMatch(CharSequence text, TextRange range) {
/*     */       CharSequence fragment = text.subSequence(range.getStart(), range.getEndExclusive());
/*     */       if (this.params.getVaryCaseDot()) {
/*     */         CharSequence charSequence = fragment;
/*     */         Regex regex = this.possiblySpacedDot;
/*     */         String str1 = ".", normalized = regex.replace(charSequence, str1);
/*     */         Intrinsics.checkNotNullExpressionValue(normalized.toLowerCase(Locale.ROOT), "toLowerCase(...)");
/*     */         if (AbbreviationPatterns.numberAbbrs.contains(normalized.toLowerCase(Locale.ROOT)))
/*     */           return (this.numberContinuation.matchAt(text, range.getEndExclusive()) != null); 
/*     */         return (this.baseAndCapitalized.contains(normalized) || (this.upperCase.contains(normalized) && isInUpperCaseVicinity(text, range)));
/*     */       } 
/*     */       return CollectionsKt.contains(this.words, fragment);
/*     */     }
/*     */     
/*     */     private final boolean isInUpperCaseVicinity(CharSequence text, TextRange range) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: aload_2
/*     */       //   2: invokevirtual getStart : ()I
/*     */       //   5: bipush #10
/*     */       //   7: isub
/*     */       //   8: iconst_0
/*     */       //   9: invokestatic coerceAtLeast : (II)I
/*     */       //   12: aload_2
/*     */       //   13: invokevirtual getEndExclusive : ()I
/*     */       //   16: bipush #10
/*     */       //   18: iadd
/*     */       //   19: aload_1
/*     */       //   20: invokeinterface length : ()I
/*     */       //   25: invokestatic coerceAtMost : (II)I
/*     */       //   28: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
/*     */       //   33: astore_3
/*     */       //   34: iconst_0
/*     */       //   35: istore #4
/*     */       //   37: iconst_0
/*     */       //   38: istore #5
/*     */       //   40: iload #5
/*     */       //   42: aload_3
/*     */       //   43: invokeinterface length : ()I
/*     */       //   48: if_icmpge -> 87
/*     */       //   51: aload_3
/*     */       //   52: iload #5
/*     */       //   54: invokeinterface charAt : (I)C
/*     */       //   59: istore #6
/*     */       //   61: iload #6
/*     */       //   63: istore #7
/*     */       //   65: iconst_0
/*     */       //   66: istore #8
/*     */       //   68: iload #7
/*     */       //   70: invokestatic isLowerCase : (C)Z
/*     */       //   73: nop
/*     */       //   74: ifeq -> 81
/*     */       //   77: iconst_0
/*     */       //   78: goto -> 88
/*     */       //   81: iinc #5, 1
/*     */       //   84: goto -> 40
/*     */       //   87: iconst_1
/*     */       //   88: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #516	-> 0
/*     */       //   #555	-> 37
/*     */       //   #516	-> 68
/*     */       //   #516	-> 73
/*     */       //   #555	-> 74
/*     */       //   #556	-> 87
/*     */       //   #516	-> 88
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   68	6	8	$i$a$-none-AbbreviationPatterns$AbbreviationPattern$isInUpperCaseVicinity$1	I
/*     */       //   65	9	7	it	C
/*     */       //   61	20	6	element$iv	C
/*     */       //   37	51	4	$i$f$none	I
/*     */       //   34	54	3	$this$none$iv	Ljava/lang/CharSequence;
/*     */       //   0	89	0	this	Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern;
/*     */       //   0	89	1	text	Ljava/lang/CharSequence;
/*     */       //   0	89	2	range	Lai/grazie/text/TextRange;
/*     */     }
/*     */     
/*     */     private final AbbreviationPatterns$AbbreviationPattern$getLowerCaseSequence$1 getLowerCaseSequence(CharSequence text) {
/*     */       return new AbbreviationPatterns$AbbreviationPattern$getLowerCaseSequence$1(text);
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\r\n\000\n\002\020\b\n\002\b\003\n\002\020\f\n\002\b\005\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\021\020\006\032\0020\0072\006\020\b\032\0020\003H\002J\030\020\t\032\0020\0012\006\020\n\032\0020\0032\006\020\013\032\0020\003H\026J\b\020\f\032\0020\rH\026R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\004\020\005¨\006\016"}, d2 = {"ai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern$getLowerCaseSequence$1", "", "length", "", "getLength", "()I", "get", "", "index", "subSequence", "startIndex", "endIndex", "toString", "", "nlp-patterns"})
/*     */     public static final class AbbreviationPatterns$AbbreviationPattern$getLowerCaseSequence$1 implements CharSequence {
/*     */       private final int length;
/*     */       
/*     */       AbbreviationPatterns$AbbreviationPattern$getLowerCaseSequence$1(CharSequence $text) {
/*     */         this.length = $text.length();
/*     */       }
/*     */       
/*     */       public int getLength() {
/*     */         return this.length;
/*     */       }
/*     */       
/*     */       public char get(int index) {
/*     */         return Character.toLowerCase(this.$text.charAt(index));
/*     */       }
/*     */       
/*     */       public CharSequence subSequence(int startIndex, int endIndex) {
/*     */         throw new IllegalStateException("Not yet implemented".toString());
/*     */       }
/*     */       
/*     */       public String toString() {
/*     */         Intrinsics.checkNotNullExpressionValue(this.$text.toString().toLowerCase(Locale.ROOT), "toLowerCase(...)");
/*     */         return this.$text.toString().toLowerCase(Locale.ROOT);
/*     */       }
/*     */     }
/*     */     
/*     */     private final boolean isSpace(char c) {
/*     */       return (c == ' ' || c == ' ');
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\ext\AbbreviationPatterns.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */