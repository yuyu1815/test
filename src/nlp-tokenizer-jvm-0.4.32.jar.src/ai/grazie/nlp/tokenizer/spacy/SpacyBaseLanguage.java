/*     */ package ai.grazie.nlp.tokenizer.spacy;
/*     */ import java.util.List;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\020 \n\002\020\016\n\002\b\n\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001:\001\024B\007\b\002¢\006\002\020\002J\024\020\017\032\0020\0202\f\020\021\032\b\022\004\022\0020\0050\004J\024\020\022\032\0020\0202\f\020\021\032\b\022\004\022\0020\0050\004J\024\020\023\032\0020\0202\f\020\021\032\b\022\004\022\0020\0050\004R\027\020\003\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\006\020\007R\027\020\b\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\t\020\007R\024\020\n\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000R\024\020\013\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000R\024\020\f\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000R\027\020\r\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\016\020\007¨\006\025"}, d2 = {"Lai/grazie/nlp/tokenizer/spacy/SpacyBaseLanguage;", "", "()V", "infixes", "", "", "getInfixes", "()Ljava/util/List;", "prefixes", "getPrefixes", "spacyDefaultInfixes", "spacyDefaultPrefixes", "spacyDefaultSuffixes", "suffixes", "getSuffixes", "compileInfix", "Lkotlin/text/Regex;", "cases", "compilePrefix", "compileSuffix", "BaseExceptions", "nlp-tokenizer"})
/*     */ @SourceDebugExtension({"SMAP\nSpacyBaseLanguage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacyBaseLanguage.kt\nai/grazie/nlp/tokenizer/spacy/SpacyBaseLanguage\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,126:1\n1557#2:127\n1628#2,3:128\n774#2:131\n865#2,2:132\n774#2:134\n865#2,2:135\n1557#2:137\n1628#2,3:138\n774#2:141\n865#2,2:142\n1557#2:144\n1628#2,3:145\n774#2:148\n865#2,2:149\n*S KotlinDebug\n*F\n+ 1 SpacyBaseLanguage.kt\nai/grazie/nlp/tokenizer/spacy/SpacyBaseLanguage\n*L\n76#1:127\n76#1:128,3\n82#1:131\n82#1:132,2\n84#1:134\n84#1:135,2\n90#1:137\n90#1:138,3\n95#1:141\n95#1:142,2\n100#1:144\n100#1:145,3\n105#1:148\n105#1:149,2\n*E\n"})
/*     */ public final class SpacyBaseLanguage {
/*     */   @NotNull
/*   8 */   public static final SpacyBaseLanguage INSTANCE = new SpacyBaseLanguage();
/*   9 */   @NotNull private static final List<String> spacyDefaultPrefixes; @NotNull private static final List<String> prefixes; @NotNull private static final List<String> spacyDefaultSuffixes; @NotNull private static final List<String> suffixes; @NotNull private static final List<String> spacyDefaultInfixes; @NotNull private static final List<String> infixes; @NotNull public final List<String> getPrefixes() { return prefixes; } @NotNull public final List<String> getSuffixes() { return suffixes; } static { String[] arrayOfString = new String[6]; arrayOfString[0] = "§"; arrayOfString[1] = "%"; arrayOfString[2] = "="; arrayOfString[3] = "—"; arrayOfString[4] = "–"; arrayOfString[5] = "\\+(?![0-9])"; spacyDefaultPrefixes = CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.listOf((Object[])arrayOfString), 
/*  10 */                 SpacyTokenizerCharClasses.INSTANCE.getListPunct()), 
/*  11 */               SpacyTokenizerCharClasses.INSTANCE.getListEllipses()), 
/*  12 */             SpacyTokenizerCharClasses.INSTANCE.getListQuotes()), 
/*  13 */           SpacyTokenizerCharClasses.INSTANCE.getListCurrency()), 
/*  14 */         SpacyTokenizerCharClasses.INSTANCE.getListIcons());
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  19 */     arrayOfString = new String[5]; arrayOfString[0] = "\\*+"; arrayOfString[1] = "#+"; arrayOfString[2] = 
/*     */       
/*  21 */       "[`]{2,3}"; arrayOfString[3] = "[']{2,3}";
/*     */     
/*  23 */     arrayOfString[4] = "[-]+";
/*  24 */     prefixes = CollectionsKt.plus(CollectionsKt.listOf((Object[])arrayOfString), spacyDefaultPrefixes);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  30 */     arrayOfString = new String[2]; arrayOfString[0] = "—"; arrayOfString[1] = "–";
/*     */     
/*  32 */     arrayOfString = new String[6]; arrayOfString[0] = "(?<=[0-9])\\+"; arrayOfString[1] = 
/*  33 */       "(?<=°[FfCcKk])\\.";
/*  34 */     arrayOfString[2] = "(?<=[0-9])(?:" + SpacyTokenizerCharClasses.INSTANCE.getCurrency() + ")";
/*  35 */     arrayOfString[3] = "(?<=[0-9])(?:" + SpacyTokenizerCharClasses.INSTANCE.getUnits() + ")";
/*  36 */     arrayOfString[4] = "(?<=[0-9" + SpacyTokenizerCharClasses.INSTANCE.getAlphaLower() + "%²\\-\\+" + SpacyTokenizerCharClasses.INSTANCE.getPunct() + "(?:" + SpacyTokenizerCharClasses.INSTANCE.getConcatQuotes() + ")])\\.";
/*  37 */     arrayOfString[5] = "(?<=[" + SpacyTokenizerCharClasses.INSTANCE.getAlphaUpper() + "][" + SpacyTokenizerCharClasses.INSTANCE.getAlphaUpper() + "])\\.";
/*     */ 
/*     */     
/*     */     spacyDefaultSuffixes = CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.plus(SpacyTokenizerCharClasses.INSTANCE.getListPunct(), SpacyTokenizerCharClasses.INSTANCE.getListEllipses()), SpacyTokenizerCharClasses.INSTANCE.getListQuotes()), SpacyTokenizerCharClasses.INSTANCE.getListIcons()), CollectionsKt.listOf((Object[])arrayOfString)), CollectionsKt.listOf((Object[])arrayOfString));
/*     */     
/*  42 */     arrayOfString = new String[8]; arrayOfString[0] = "\\.+"; arrayOfString[1] = "!+"; arrayOfString[2] = "\\?+"; arrayOfString[3] = 
/*     */       
/*  44 */       "\\*+";
/*     */     
/*  46 */     arrayOfString[4] = "\\[\\d+\\]";
/*     */     
/*  48 */     arrayOfString[5] = "[`]{2,3}"; arrayOfString[6] = "[']{2,3}";
/*     */     
/*  50 */     arrayOfString[7] = "[-]+";
/*  51 */     suffixes = CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.listOf((Object[])arrayOfString), SpacyTokenizerCharClasses.INSTANCE.getListCurrency()), 
/*  52 */         spacyDefaultSuffixes);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  57 */     arrayOfString = new String[5]; arrayOfString[0] = "(?<=[0-9])[+\\-\\*^](?=[0-9-])"; arrayOfString[1] = "(?<=[" + 
/*  58 */       SpacyTokenizerCharClasses.INSTANCE.getAlphaLower() + SpacyTokenizerCharClasses.INSTANCE.getConcatQuotes() + "])\\.(?=[" + SpacyTokenizerCharClasses.INSTANCE.getAlphaUpper() + SpacyTokenizerCharClasses.INSTANCE.getConcatQuotes() + "])";
/*  59 */     arrayOfString[2] = "(?<=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "]),(?=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])";
/*  60 */     arrayOfString[3] = "(?<=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])(?:" + SpacyTokenizerCharClasses.INSTANCE.getHyphens() + ")(?=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])";
/*  61 */     arrayOfString[4] = "(?<=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "0-9])[:<>=/](?=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])";
/*     */ 
/*     */     
/*     */     spacyDefaultInfixes = CollectionsKt.plus(CollectionsKt.plus(SpacyTokenizerCharClasses.INSTANCE.getListEllipses(), SpacyTokenizerCharClasses.INSTANCE.getListIcons()), CollectionsKt.listOf((Object[])arrayOfString));
/*     */ 
/*     */     
/*  67 */     arrayOfString = new String[3]; arrayOfString[0] = "(?<=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])(?:\\(|\\))(?=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])"; arrayOfString[1] = "(?<=[" + 
/*     */       
/*  69 */       SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "0-9])(?:" + SpacyTokenizerCharClasses.INSTANCE.getHyphens() + ")(?=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])";
/*     */     
/*  71 */     arrayOfString[2] = "(?<=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])(?:[" + SpacyTokenizerCharClasses.INSTANCE.getNonContractionConcatQuotes() + "])(?=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])";
/*  72 */     infixes = CollectionsKt.plus(CollectionsKt.listOf((Object[])arrayOfString), spacyDefaultInfixes); }
/*     */   @NotNull public final List<String> getInfixes() { return infixes; }
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\020\016\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}) static final class SpacyBaseLanguage$compilePrefix$2 extends Lambda implements Function1<String, CharSequence> {
/*  75 */     public static final SpacyBaseLanguage$compilePrefix$2 INSTANCE = new SpacyBaseLanguage$compilePrefix$2(); SpacyBaseLanguage$compilePrefix$2() { super(1); } public final CharSequence invoke(String it) { Intrinsics.checkNotNullParameter(it, "it"); return "^" + Regex.Companion.escape(it); } } @NotNull public final Regex compilePrefix(@NotNull List cases) { Intrinsics.checkNotNullParameter(cases, "cases");
/*  76 */     Iterable $this$map$iv = cases; int $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 127 */     Iterable iterable1 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 128 */     for (Object item$iv$iv : iterable1) {
/* 129 */       String str = (String)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-SpacyBaseLanguage$compilePrefix$actualCases$1 = 0; collection.add(StringsKt.replace$default(str, "\\x", "\\u", false, 4, null));
/* 130 */     }  List actualCases = (Platform.Companion.getCurrent() == Platform.JS) ? (List)destination$iv$iv : cases; if (cases.contains("("))
/* 131 */     { Iterable $this$filter$iv = actualCases; int $i$f$filter = 0; Iterable $this$mapTo$iv$iv = $this$filter$iv; Collection<Object> collection = new ArrayList(); int $i$f$filterTo = 0;
/* 132 */       for (Object element$iv$iv : $this$mapTo$iv$iv) { String it = (String)element$iv$iv; int $i$a$-filter-SpacyBaseLanguage$compilePrefix$1 = 0; if (!Intrinsics.areEqual(StringsKt.trim(it).toString(), "")) collection.add(element$iv$iv);  }
/* 133 */        String str = CollectionsKt.joinToString$default(collection, "|", null, null, 0, null, SpacyBaseLanguage$compilePrefix$2.INSTANCE, 30, null); }
/* 134 */     else { Iterable $this$filter$iv = actualCases; int $i$f$filter = 0; Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection<Object> collection = new ArrayList(); int $i$f$filterTo = 0;
/* 135 */       for (Object element$iv$iv : $this$filterTo$iv$iv) { String it = (String)element$iv$iv; int $i$a$-filter-SpacyBaseLanguage$compilePrefix$3 = 0; if (!Intrinsics.areEqual(StringsKt.trim(it).toString(), "")) collection.add(element$iv$iv);  }
/* 136 */        String str = CollectionsKt.joinToString$default(collection, "|", null, null, 0, null, SpacyBaseLanguage$compilePrefix$4.INSTANCE, 30, null); }  return new Regex(str); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\020\016\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}) static final class SpacyBaseLanguage$compilePrefix$4 extends Lambda implements Function1<String, CharSequence> {
/* 137 */     public static final SpacyBaseLanguage$compilePrefix$4 INSTANCE = new SpacyBaseLanguage$compilePrefix$4(); SpacyBaseLanguage$compilePrefix$4() { super(1); } public final CharSequence invoke(String it) { Intrinsics.checkNotNullParameter(it, "it"); return "^" + it; } } @NotNull public final Regex compileSuffix(@NotNull List cases) { Intrinsics.checkNotNullParameter(cases, "cases"); Iterable $this$map$iv = cases; int $i$f$map = 0; Iterable iterable1 = $this$map$iv; Collection<String> collection = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 138 */     for (Object item$iv$iv : iterable1) {
/* 139 */       String str1 = (String)item$iv$iv; Collection<String> collection1 = collection; int $i$a$-map-SpacyBaseLanguage$compileSuffix$actualCases$1 = 0; collection1.add(StringsKt.replace$default(str1, "\\x", "\\u", false, 4, null));
/* 140 */     }  List actualCases = (Platform.Companion.getCurrent() == Platform.JS) ? (List)collection : cases; Iterable $this$filter$iv = actualCases; int $i$f$filter = 0;
/* 141 */     Iterable $this$mapTo$iv$iv = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 142 */     for (Object element$iv$iv : $this$mapTo$iv$iv) { String it = (String)element$iv$iv; int $i$a$-filter-SpacyBaseLanguage$compileSuffix$1 = 0; if (!Intrinsics.areEqual(StringsKt.trim(it).toString(), "")) destination$iv$iv.add(element$iv$iv);  }
/* 143 */      String str = CollectionsKt.joinToString$default(destination$iv$iv, "|", null, null, 0, null, SpacyBaseLanguage$compileSuffix$2.INSTANCE, 30, null); return new Regex(str); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\020\016\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}) static final class SpacyBaseLanguage$compileSuffix$2 extends Lambda implements Function1<String, CharSequence> {
/* 144 */     public static final SpacyBaseLanguage$compileSuffix$2 INSTANCE = new SpacyBaseLanguage$compileSuffix$2(); SpacyBaseLanguage$compileSuffix$2() { super(1); } public final CharSequence invoke(String it) { Intrinsics.checkNotNullParameter(it, "it"); return it + "$"; } } @NotNull public final Regex compileInfix(@NotNull List cases) { Intrinsics.checkNotNullParameter(cases, "cases"); Iterable $this$map$iv = cases; int $i$f$map = 0; Iterable iterable1 = $this$map$iv; Collection<String> collection = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 145 */     for (Object item$iv$iv : iterable1) {
/* 146 */       String str1 = (String)item$iv$iv; Collection<String> collection1 = collection; int $i$a$-map-SpacyBaseLanguage$compileInfix$actualCases$1 = 0; collection1.add(StringsKt.replace$default(str1, "\\x", "\\u", false, 4, null));
/* 147 */     }  List actualCases = (Platform.Companion.getCurrent() == Platform.JS) ? (List)collection : cases; Iterable $this$filter$iv = actualCases; int $i$f$filter = 0;
/* 148 */     Iterable $this$mapTo$iv$iv = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 149 */     for (Object element$iv$iv : $this$mapTo$iv$iv) { String it = (String)element$iv$iv; int $i$a$-filter-SpacyBaseLanguage$compileInfix$1 = 0; if (!Intrinsics.areEqual(StringsKt.trim(it).toString(), "")) destination$iv$iv.add(element$iv$iv);  }
/* 150 */      String str = CollectionsKt.joinToString$default(destination$iv$iv, "|", null, null, 0, null, SpacyBaseLanguage$compileInfix$2.INSTANCE, 30, null);
/*     */     return new Regex(str); }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\020\016\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "", "invoke"})
/*     */   static final class SpacyBaseLanguage$compileInfix$2 extends Lambda implements Function1<String, CharSequence> {
/*     */     public static final SpacyBaseLanguage$compileInfix$2 INSTANCE = new SpacyBaseLanguage$compileInfix$2();
/*     */     
/*     */     SpacyBaseLanguage$compileInfix$2() {
/*     */       super(1);
/*     */     }
/*     */     
/*     */     public final CharSequence invoke(String it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       return it;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020 \n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\004\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000R\024\020\006\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000R9\020\007\032*\022\004\022\0020\005\022\n\022\b\022\004\022\0020\t0\0040\bj\024\022\004\022\0020\005\022\n\022\b\022\004\022\0020\t0\004`\n¢\006\b\n\000\032\004\b\013\020\fR\024\020\r\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000¨\006\016"}, d2 = {"Lai/grazie/nlp/tokenizer/spacy/SpacyBaseLanguage$BaseExceptions;", "", "()V", "emoticons", "", "", "ends", "exceptions", "Ljava/util/HashMap;", "Lai/grazie/nlp/tokenizer/spacy/SpacyTokenInfo;", "Lkotlin/collections/HashMap;", "getExceptions", "()Ljava/util/HashMap;", "spaces", "nlp-tokenizer"})
/*     */   @SourceDebugExtension({"SMAP\nSpacyBaseLanguage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacyBaseLanguage.kt\nai/grazie/nlp/tokenizer/spacy/SpacyBaseLanguage$BaseExceptions\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,126:1\n1279#2,2:127\n1293#2,4:129\n*S KotlinDebug\n*F\n+ 1 SpacyBaseLanguage.kt\nai/grazie/nlp/tokenizer/spacy/SpacyBaseLanguage$BaseExceptions\n*L\n123#1:127,2\n123#1:129,4\n*E\n"})
/*     */   public static final class BaseExceptions {
/*     */     @NotNull
/*     */     public static final BaseExceptions INSTANCE = new BaseExceptions();
/*     */     @NotNull
/*     */     private static final List<String> spaces;
/*     */     @NotNull
/*     */     private static final List<String> ends;
/*     */     @NotNull
/*     */     private static final List<String> emoticons;
/*     */     @NotNull
/*     */     private static final HashMap<String, List<SpacyTokenInfo>> exceptions;
/*     */     
/*     */     static {
/*     */       String[] arrayOfString = new String[7];
/*     */       arrayOfString[0] = " ";
/*     */       arrayOfString[1] = "\t";
/*     */       arrayOfString[2] = "\\t";
/*     */       arrayOfString[3] = "\n";
/*     */       arrayOfString[4] = "\\n";
/*     */       arrayOfString[5] = "—";
/*     */       arrayOfString[6] = " ";
/*     */       spaces = CollectionsKt.listOf((Object[])arrayOfString);
/*     */       arrayOfString = new String[34];
/*     */       arrayOfString[0] = "'";
/*     */       arrayOfString[1] = "\\\\\")";
/*     */       arrayOfString[2] = "<space>";
/*     */       arrayOfString[3] = "''";
/*     */       arrayOfString[4] = "C++";
/*     */       arrayOfString[5] = "a.";
/*     */       arrayOfString[6] = "b.";
/*     */       arrayOfString[7] = "c.";
/*     */       arrayOfString[8] = "d.";
/*     */       arrayOfString[9] = "e.";
/*     */       arrayOfString[10] = "f.";
/*     */       arrayOfString[11] = "g.";
/*     */       arrayOfString[12] = "h.";
/*     */       arrayOfString[13] = "i.";
/*     */       arrayOfString[14] = "j.";
/*     */       arrayOfString[15] = "k.";
/*     */       arrayOfString[16] = "l.";
/*     */       arrayOfString[17] = "m.";
/*     */       arrayOfString[18] = "n.";
/*     */       arrayOfString[19] = "o.";
/*     */       arrayOfString[20] = "p.";
/*     */       arrayOfString[21] = "q.";
/*     */       arrayOfString[22] = "r.";
/*     */       arrayOfString[23] = "s.";
/*     */       arrayOfString[24] = "t.";
/*     */       arrayOfString[25] = "u.";
/*     */       arrayOfString[26] = "v.";
/*     */       arrayOfString[27] = "w.";
/*     */       arrayOfString[28] = "x.";
/*     */       arrayOfString[29] = "y.";
/*     */       arrayOfString[30] = "z.";
/*     */       arrayOfString[31] = "ä.";
/*     */       arrayOfString[32] = "ö.";
/*     */       arrayOfString[33] = "ü.";
/*     */       ends = CollectionsKt.listOf((Object[])arrayOfString);
/*     */       arrayOfString = new String[1];
/*     */       arrayOfString[0] = " ";
/*     */       emoticons = StringsKt.split$default(":) :-) :)) :-)) :))) :-))) (: (-: =) (= \") :] :-] [: [-: [= =] :o) (o: :} :-} \n        8) 8-) (-8 ;) ;-) (; (-; :( :-( :(( :-(( :((( :-((( ): )-: =( >:( :') :'-) :'( :'-( :/ :-/ =/ =| :| :-| ]= \n        =[ :1 :P :-P :p :-p :O :-O :o :-o :0 :-0 :() >:o :* :-* :3 :-3 =3 :> :-> :X :-X :x :-x :D :-D ;D ;-D =D xD \n        XD xDD XDD 8D 8-D ^_^ ^__^ ^___^ >.< >.> <.< ._. ;_; -_- -__- v.v V.V v_v V_V o_o o_O O_o O_O 0_o o_0 0_0 o.O \n        O.o O.O o.o 0.0 o.0 0.o @_@ <3 <33 <333 </3 (^_^) (-_-) (._.) (>_<) (*_*) (¬_¬) ಠ_ಠ ಠ︵ಠ (ಠ_ಠ) ¯\\(ツ)/¯ (╯°□°）╯︵┻━┻ ><(((*>", arrayOfString, false, 0, 6, null);
/*     */       Iterable $this$associateWith$iv = CollectionsKt.plus(CollectionsKt.plus(spaces, ends), emoticons);
/*     */       int $i$f$associateWith = 0;
/*     */       LinkedHashMap<Object, Object> result$iv = new LinkedHashMap<>(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associateWith$iv, 10)), 16));
/*     */       Iterable $this$associateWithTo$iv$iv = $this$associateWith$iv;
/*     */       int $i$f$associateWithTo = 0;
/*     */       for (Object element$iv$iv : $this$associateWithTo$iv$iv) {
/*     */         String str = (String)element$iv$iv;
/*     */         Object object1 = element$iv$iv;
/*     */         LinkedHashMap<Object, Object> linkedHashMap = result$iv;
/*     */         int $i$a$-associateWith-SpacyBaseLanguage$BaseExceptions$exceptions$1 = 0;
/*     */         List list = CollectionsKt.listOf(new SpacyTokenInfo(str, null, null, null, 14, null));
/*     */         linkedHashMap.put(object1, list);
/*     */       } 
/*     */       exceptions = (HashMap)result$iv;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final HashMap<String, List<SpacyTokenInfo>> getExceptions() {
/*     */       return exceptions;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\spacy\SpacyBaseLanguage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */