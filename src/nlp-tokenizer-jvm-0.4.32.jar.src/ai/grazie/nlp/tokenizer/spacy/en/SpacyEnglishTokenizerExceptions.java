/*     */ package ai.grazie.nlp.tokenizer.spacy.en;
/*     */ import ai.grazie.nlp.tokenizer.spacy.SpacyTokenInfo;
/*     */ import java.util.HashMap;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\020\016\n\002\020 \n\002\030\002\n\002\030\002\n\002\b\007\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J0\020\016\032*\022\004\022\0020\005\022\n\022\b\022\004\022\0020\0070\0060\004j\024\022\004\022\0020\005\022\n\022\b\022\004\022\0020\0070\006`\bH\002RC\020\003\032*\022\004\022\0020\005\022\n\022\b\022\004\022\0020\0070\0060\004j\024\022\004\022\0020\005\022\n\022\b\022\004\022\0020\0070\006`\b8FX\002¢\006\f\n\004\b\013\020\f\032\004\b\t\020\nR\024\020\r\032\b\022\004\022\0020\0050\006X\004¢\006\002\n\000¨\006\017"}, d2 = {"Lai/grazie/nlp/tokenizer/spacy/en/SpacyEnglishTokenizerExceptions;", "", "()V", "exceptions", "Ljava/util/HashMap;", "", "", "Lai/grazie/nlp/tokenizer/spacy/SpacyTokenInfo;", "Lkotlin/collections/HashMap;", "getExceptions", "()Ljava/util/HashMap;", "exceptions$delegate", "Lkotlin/Lazy;", "exclude", "generateExceptions", "nlp-tokenizer"})
/*     */ @SourceDebugExtension({"SMAP\nSpacyEnglishTokenizerExceptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacyEnglishTokenizerExceptions.kt\nai/grazie/nlp/tokenizer/spacy/en/SpacyEnglishTokenizerExceptions\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,515:1\n1#2:516\n*E\n"})
/*     */ public final class SpacyEnglishTokenizerExceptions {
/*     */   @NotNull
/*   9 */   public static final SpacyEnglishTokenizerExceptions INSTANCE = new SpacyEnglishTokenizerExceptions(); @NotNull
/*  10 */   private static final List<String> exclude; static { String[] arrayOfString = new String[16]; arrayOfString[0] = "Ill"; arrayOfString[1] = "ill"; arrayOfString[2] = "Its"; arrayOfString[3] = "its"; arrayOfString[4] = "Hell"; arrayOfString[5] = 
/*  11 */       "hell"; arrayOfString[6] = "Shell"; arrayOfString[7] = "shell"; arrayOfString[8] = "Shed"; arrayOfString[9] = "shed"; arrayOfString[10] = "were"; arrayOfString[11] = "Were"; arrayOfString[12] = "Well"; arrayOfString[13] = "well"; arrayOfString[14] = "Whore"; arrayOfString[15] = "whore";
/*     */     exclude = CollectionsKt.listOf((Object[])arrayOfString); }
/*     */   
/*     */   @NotNull
/*  15 */   private static final Lazy exceptions$delegate = LazyKt.lazy(SpacyEnglishTokenizerExceptions$exceptions$2.INSTANCE); @NotNull public final HashMap<String, List<SpacyTokenInfo>> getExceptions() { Lazy lazy = exceptions$delegate; return (HashMap<String, List<SpacyTokenInfo>>)lazy.getValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\030\n\000\n\002\030\002\n\002\020\016\n\002\020 \n\002\030\002\n\002\030\002\n\000\020\000\032*\022\004\022\0020\002\022\n\022\b\022\004\022\0020\0040\0030\001j\024\022\004\022\0020\002\022\n\022\b\022\004\022\0020\0040\003`\005H\n¢\006\002\b\006"}, d2 = {"<anonymous>", "Ljava/util/HashMap;", "", "", "Lai/grazie/nlp/tokenizer/spacy/SpacyTokenInfo;", "Lkotlin/collections/HashMap;", "invoke"})
/*  16 */   static final class SpacyEnglishTokenizerExceptions$exceptions$2 extends Lambda implements Function0<HashMap<String, List<? extends SpacyTokenInfo>>> { public static final SpacyEnglishTokenizerExceptions$exceptions$2 INSTANCE = new SpacyEnglishTokenizerExceptions$exceptions$2(); public final HashMap<String, List<SpacyTokenInfo>> invoke() { return SpacyEnglishTokenizerExceptions.INSTANCE.generateExceptions(); }
/*     */      SpacyEnglishTokenizerExceptions$exceptions$2() {
/*     */       super(0);
/*     */     } } private final HashMap<String, List<SpacyTokenInfo>> generateExceptions() {
/*  20 */     HashMap<Object, Object> exceptions = new HashMap<>();
/*     */     
/*  22 */     for (String pron : CollectionsKt.listOf("i"))
/*  23 */     { String[] arrayOfString3 = new String[2]; arrayOfString3[0] = pron; String str1 = pron; char c = str1.charAt(0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 516 */       StringBuilder stringBuilder = new StringBuilder(); boolean bool = true; String[] arrayOfString4 = arrayOfString3; int $i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$1 = 0; String str3 = Character.isLowerCase(c) ? CharsKt.titlecase(c) : String.valueOf(c), str2 = str1; $i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$1 = 1; Intrinsics.checkNotNullExpressionValue(str2.substring($i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$1), "substring(...)"); arrayOfString4[bool] = ((((CharSequence)str1).length() > 0)) ? stringBuilder.append(str3).append(str2.substring($i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$1)).toString() : str1; for (String orth : CollectionsKt.listOf((Object[])arrayOfString3)) { HashMap<Object, Object> hashMap = exceptions; str2 = orth + "'m"; SpacyTokenInfo[] arrayOfSpacyTokenInfo10 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo10[0] = new SpacyTokenInfo(orth, null, null, pron, 6, null); arrayOfSpacyTokenInfo10[1] = new SpacyTokenInfo("'m", "be", null, "am", 4, null); List list4 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo10); hashMap.put(str2, list4); hashMap = exceptions; str2 = orth + "m"; SpacyTokenInfo[] arrayOfSpacyTokenInfo9 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo9[0] = new SpacyTokenInfo(orth, null, null, pron, 6, null); arrayOfSpacyTokenInfo9[1] = new SpacyTokenInfo("m", "be", null, null, 12, null); List list3 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo9); hashMap.put(str2, list3); hashMap = exceptions; str2 = orth + "'ma"; SpacyTokenInfo[] arrayOfSpacyTokenInfo8 = new SpacyTokenInfo[3]; arrayOfSpacyTokenInfo8[0] = new SpacyTokenInfo(orth, null, null, pron, 6, null); arrayOfSpacyTokenInfo8[1] = new SpacyTokenInfo("'m", "be", null, "am", 4, null); arrayOfSpacyTokenInfo8[2] = new SpacyTokenInfo("a", "going to", null, "gonna", 4, null); List list2 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo8); hashMap.put(str2, list2); hashMap = exceptions; str2 = orth + "ma"; SpacyTokenInfo[] arrayOfSpacyTokenInfo7 = new SpacyTokenInfo[3]; arrayOfSpacyTokenInfo7[0] = new SpacyTokenInfo(orth, null, null, pron, 6, null); arrayOfSpacyTokenInfo7[1] = new SpacyTokenInfo("m", "be", null, "am", 4, null); arrayOfSpacyTokenInfo7[2] = new SpacyTokenInfo("a", "going to", null, "gonna", 4, null); List list1 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo7); hashMap.put(str2, list1); }  }  String[] arrayOfString1 = new String[7]; arrayOfString1[0] = "i"; arrayOfString1[1] = "you"; arrayOfString1[2] = "he"; arrayOfString1[3] = "she"; arrayOfString1[4] = "it"; arrayOfString1[5] = "we"; arrayOfString1[6] = "they"; for (String pron : CollectionsKt.listOf((Object[])arrayOfString1)) { String[] arrayOfString3 = new String[2]; arrayOfString3[0] = pron; String str1 = pron; char c = str1.charAt(0); StringBuilder stringBuilder = new StringBuilder(); boolean bool = true; String[] arrayOfString4 = arrayOfString3; int $i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$2 = 0; String str3 = Character.isLowerCase(c) ? CharsKt.titlecase(c) : String.valueOf(c), str2 = str1; $i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$2 = 1; Intrinsics.checkNotNullExpressionValue(str2.substring($i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$2), "substring(...)"); arrayOfString4[bool] = ((((CharSequence)str1).length() > 0)) ? stringBuilder.append(str3).append(str2.substring($i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$2)).toString() : str1; for (String orth : CollectionsKt.listOf((Object[])arrayOfString3)) { HashMap<Object, Object> hashMap = exceptions; str2 = orth + "'ll"; SpacyTokenInfo[] arrayOfSpacyTokenInfo14 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo14[0] = new SpacyTokenInfo(orth, null, null, pron, 6, null); arrayOfSpacyTokenInfo14[1] = new SpacyTokenInfo("'ll", "will", null, "will", 4, null); List list8 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo14); hashMap.put(str2, list8); hashMap = exceptions; str2 = orth + "ll"; SpacyTokenInfo[] arrayOfSpacyTokenInfo13 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo13[0] = new SpacyTokenInfo(orth, null, null, pron, 6, null); arrayOfSpacyTokenInfo13[1] = new SpacyTokenInfo("ll", "will", null, "will", 4, null); List list7 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo13); hashMap.put(str2, list7); hashMap = exceptions; str2 = orth + "'ll've"; SpacyTokenInfo[] arrayOfSpacyTokenInfo12 = new SpacyTokenInfo[3]; arrayOfSpacyTokenInfo12[0] = new SpacyTokenInfo(orth, null, null, pron, 6, null); arrayOfSpacyTokenInfo12[1] = new SpacyTokenInfo("'ll", "will", null, "will", 4, null); arrayOfSpacyTokenInfo12[2] = new SpacyTokenInfo("'ve", "have", null, "have", 4, null); List list6 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo12); hashMap.put(str2, list6); hashMap = exceptions; str2 = orth + "llve"; SpacyTokenInfo[] arrayOfSpacyTokenInfo11 = new SpacyTokenInfo[3]; arrayOfSpacyTokenInfo11[0] = new SpacyTokenInfo(orth, null, null, pron, 6, null); arrayOfSpacyTokenInfo11[1] = new SpacyTokenInfo("ll", "will", null, "will", 4, null); arrayOfSpacyTokenInfo11[2] = new SpacyTokenInfo("ve", "have", null, "have", 4, null); List list5 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo11); hashMap.put(str2, list5); hashMap = exceptions; str2 = orth + "'d"; SpacyTokenInfo[] arrayOfSpacyTokenInfo10 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo10[0] = new SpacyTokenInfo(orth, null, null, pron, 6, null); arrayOfSpacyTokenInfo10[1] = new SpacyTokenInfo("'d", null, null, "'d", 6, null); List list4 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo10); hashMap.put(str2, list4); hashMap = exceptions; str2 = orth + "d"; SpacyTokenInfo[] arrayOfSpacyTokenInfo9 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo9[0] = new SpacyTokenInfo(orth, null, null, pron, 6, null); arrayOfSpacyTokenInfo9[1] = new SpacyTokenInfo("d", null, null, "'d", 6, null); List list3 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo9); hashMap.put(str2, list3); hashMap = exceptions; str2 = orth + "'d've"; SpacyTokenInfo[] arrayOfSpacyTokenInfo8 = new SpacyTokenInfo[3]; arrayOfSpacyTokenInfo8[0] = new SpacyTokenInfo(orth, null, null, pron, 6, null); arrayOfSpacyTokenInfo8[1] = new SpacyTokenInfo("'d", "would", null, "would", 4, null); arrayOfSpacyTokenInfo8[2] = new SpacyTokenInfo("'ve", "have", null, "have", 4, null); List list2 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo8); hashMap.put(str2, list2); hashMap = exceptions; str2 = orth + "dve"; SpacyTokenInfo[] arrayOfSpacyTokenInfo7 = new SpacyTokenInfo[3]; arrayOfSpacyTokenInfo7[0] = new SpacyTokenInfo(orth, null, null, pron, 6, null); arrayOfSpacyTokenInfo7[1] = new SpacyTokenInfo("d", "would", null, "would", 4, null); arrayOfSpacyTokenInfo7[2] = new SpacyTokenInfo("ve", "have", null, "have", 4, null); List list1 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo7); hashMap.put(str2, list1); }  }  arrayOfString1 = new String[4]; arrayOfString1[0] = "i"; arrayOfString1[1] = "you"; arrayOfString1[2] = "we"; arrayOfString1[3] = "they"; for (String pron : CollectionsKt.listOf((Object[])arrayOfString1)) { String[] arrayOfString3 = new String[2]; arrayOfString3[0] = pron; String str1 = pron; char c = str1.charAt(0); StringBuilder stringBuilder = new StringBuilder(); boolean bool = true; String[] arrayOfString4 = arrayOfString3; int $i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$3 = 0; String str3 = Character.isLowerCase(c) ? CharsKt.titlecase(c) : String.valueOf(c), str2 = str1; $i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$3 = 1; Intrinsics.checkNotNullExpressionValue(str2.substring($i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$3), "substring(...)"); arrayOfString4[bool] = ((((CharSequence)str1).length() > 0)) ? stringBuilder.append(str3).append(str2.substring($i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$3)).toString() : str1; for (String orth : CollectionsKt.listOf((Object[])arrayOfString3)) { HashMap<Object, Object> hashMap = exceptions; str2 = orth + "'ve"; SpacyTokenInfo[] arrayOfSpacyTokenInfo8 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo8[0] = new SpacyTokenInfo(orth, null, null, pron, 6, null); arrayOfSpacyTokenInfo8[1] = new SpacyTokenInfo("'ve", "have", null, "have", 4, null); List list2 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo8); hashMap.put(str2, list2); hashMap = exceptions; str2 = orth + "ve"; SpacyTokenInfo[] arrayOfSpacyTokenInfo7 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo7[0] = new SpacyTokenInfo(orth, null, null, pron, 6, null); arrayOfSpacyTokenInfo7[1] = new SpacyTokenInfo("ve", "have", null, "have", 4, null); List list1 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo7); hashMap.put(str2, list1); }  }  arrayOfString1 = new String[3]; arrayOfString1[0] = "you"; arrayOfString1[1] = "we"; arrayOfString1[2] = "they"; for (String pron : CollectionsKt.listOf((Object[])arrayOfString1)) { String[] arrayOfString3 = new String[2]; arrayOfString3[0] = pron; String str1 = pron; char c = str1.charAt(0); StringBuilder stringBuilder = new StringBuilder(); boolean bool = true; String[] arrayOfString4 = arrayOfString3; int $i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$4 = 0; String str3 = Character.isLowerCase(c) ? CharsKt.titlecase(c) : String.valueOf(c), str2 = str1; $i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$4 = 1; Intrinsics.checkNotNullExpressionValue(str2.substring($i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$4), "substring(...)"); arrayOfString4[bool] = ((((CharSequence)str1).length() > 0)) ? stringBuilder.append(str3).append(str2.substring($i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$4)).toString() : str1; for (String orth : CollectionsKt.listOf((Object[])arrayOfString3)) { HashMap<Object, Object> hashMap = exceptions; str2 = orth + "'re"; SpacyTokenInfo[] arrayOfSpacyTokenInfo8 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo8[0] = new SpacyTokenInfo(orth, null, null, pron, 6, null); arrayOfSpacyTokenInfo8[1] = new SpacyTokenInfo("'re", "be", null, "are", 4, null); List list2 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo8); hashMap.put(str2, list2); hashMap = exceptions; str2 = orth + "re"; SpacyTokenInfo[] arrayOfSpacyTokenInfo7 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo7[0] = new SpacyTokenInfo(orth, null, null, pron, 6, null); arrayOfSpacyTokenInfo7[1] = new SpacyTokenInfo("re", "be", null, "are", 4, null); List list1 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo7); hashMap.put(str2, list1); }  }  arrayOfString1 = new String[3]; arrayOfString1[0] = "he"; arrayOfString1[1] = "she"; arrayOfString1[2] = "it"; for (String pron : CollectionsKt.listOf((Object[])arrayOfString1)) { String[] arrayOfString3 = new String[2]; arrayOfString3[0] = pron; String str1 = pron; char c = str1.charAt(0); StringBuilder stringBuilder = new StringBuilder(); boolean bool = true; String[] arrayOfString4 = arrayOfString3; int $i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$5 = 0; String str3 = Character.isLowerCase(c) ? CharsKt.titlecase(c) : String.valueOf(c), str2 = str1; $i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$5 = 1; Intrinsics.checkNotNullExpressionValue(str2.substring($i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$5), "substring(...)"); arrayOfString4[bool] = ((((CharSequence)str1).length() > 0)) ? stringBuilder.append(str3).append(str2.substring($i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$5)).toString() : str1; for (String orth : CollectionsKt.listOf((Object[])arrayOfString3)) { HashMap<Object, Object> hashMap = exceptions; str2 = orth + "'s"; SpacyTokenInfo[] arrayOfSpacyTokenInfo8 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo8[0] = new SpacyTokenInfo(orth, null, null, pron, 6, null); arrayOfSpacyTokenInfo8[1] = new SpacyTokenInfo("'s", null, null, "'s", 6, null); List list2 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo8); hashMap.put(str2, list2); hashMap = exceptions; str2 = orth + "s"; SpacyTokenInfo[] arrayOfSpacyTokenInfo7 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo7[0] = new SpacyTokenInfo(orth, null, null, pron, 6, null); arrayOfSpacyTokenInfo7[1] = new SpacyTokenInfo("s", null, null, null, 14, null); List list1 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo7); hashMap.put(str2, list1); }  }  arrayOfString1 = new String[11]; arrayOfString1[0] = "who"; arrayOfString1[1] = "what"; arrayOfString1[2] = "when"; arrayOfString1[3] = "where"; arrayOfString1[4] = "why"; arrayOfString1[5] = "how"; arrayOfString1[6] = "there"; arrayOfString1[7] = "that"; arrayOfString1[8] = "this"; arrayOfString1[9] = "these"; arrayOfString1[10] = "those"; for (String word : CollectionsKt.listOf((Object[])arrayOfString1)) { String[] arrayOfString3 = new String[2]; arrayOfString3[0] = word; String str1 = word; char c = str1.charAt(0); StringBuilder stringBuilder = new StringBuilder(); boolean bool = true; String[] arrayOfString4 = arrayOfString3; int $i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$6 = 0; String str3 = Character.isLowerCase(c) ? CharsKt.titlecase(c) : String.valueOf(c), str2 = str1; $i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$6 = 1; Intrinsics.checkNotNullExpressionValue(str2.substring($i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$6), "substring(...)"); arrayOfString4[bool] = ((((CharSequence)str1).length() > 0)) ? stringBuilder.append(str3).append(str2.substring($i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$6)).toString() : str1; for (String orth : CollectionsKt.listOf((Object[])arrayOfString3)) { HashMap<Object, Object> hashMap = exceptions; str2 = orth + "'s"; SpacyTokenInfo[] arrayOfSpacyTokenInfo20 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo20[0] = new SpacyTokenInfo(orth, word, null, word, 4, null); arrayOfSpacyTokenInfo20[1] = new SpacyTokenInfo("'s", null, null, "'s", 6, null); List list14 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo20); hashMap.put(str2, list14); hashMap = exceptions; str2 = orth + "s"; SpacyTokenInfo[] arrayOfSpacyTokenInfo19 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo19[0] = new SpacyTokenInfo(orth, word, null, word, 4, null); arrayOfSpacyTokenInfo19[1] = new SpacyTokenInfo("s", null, null, null, 14, null); List list13 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo19); hashMap.put(str2, list13); hashMap = exceptions; str2 = orth + "'ll"; SpacyTokenInfo[] arrayOfSpacyTokenInfo18 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo18[0] = new SpacyTokenInfo(orth, word, null, word, 4, null); arrayOfSpacyTokenInfo18[1] = new SpacyTokenInfo("'ll", "will", null, "will", 4, null); List list12 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo18); hashMap.put(str2, list12); hashMap = exceptions; str2 = orth + "ll"; SpacyTokenInfo[] arrayOfSpacyTokenInfo17 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo17[0] = new SpacyTokenInfo(orth, word, null, word, 4, null); arrayOfSpacyTokenInfo17[1] = new SpacyTokenInfo("ll", "will", null, "will", 4, null); List list11 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo17); hashMap.put(str2, list11); hashMap = exceptions; str2 = orth + "'ll've"; SpacyTokenInfo[] arrayOfSpacyTokenInfo16 = new SpacyTokenInfo[3]; arrayOfSpacyTokenInfo16[0] = new SpacyTokenInfo(orth, word, null, word, 4, null); arrayOfSpacyTokenInfo16[1] = new SpacyTokenInfo("'ll", "will", null, "will", 4, null); arrayOfSpacyTokenInfo16[2] = new SpacyTokenInfo("'ve", "have", null, "have", 4, null); List list10 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo16); hashMap.put(str2, list10); hashMap = exceptions; str2 = orth + "llve"; SpacyTokenInfo[] arrayOfSpacyTokenInfo15 = new SpacyTokenInfo[3]; arrayOfSpacyTokenInfo15[0] = new SpacyTokenInfo(orth, word, null, word, 4, null); arrayOfSpacyTokenInfo15[1] = new SpacyTokenInfo("ll", "will", null, "will", 4, null); arrayOfSpacyTokenInfo15[2] = new SpacyTokenInfo("ve", "have", null, "have", 4, null); List list9 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo15); hashMap.put(str2, list9); hashMap = exceptions; str2 = orth + "'re"; SpacyTokenInfo[] arrayOfSpacyTokenInfo14 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo14[0] = new SpacyTokenInfo(orth, word, null, word, 4, null); arrayOfSpacyTokenInfo14[1] = new SpacyTokenInfo("'re", "be", null, "are", 4, null); List list8 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo14); hashMap.put(str2, list8); hashMap = exceptions; str2 = orth + "re"; SpacyTokenInfo[] arrayOfSpacyTokenInfo13 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo13[0] = new SpacyTokenInfo(orth, word, null, word, 4, null); arrayOfSpacyTokenInfo13[1] = new SpacyTokenInfo("re", "be", null, "are", 4, null); List list7 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo13); hashMap.put(str2, list7); hashMap = exceptions; str2 = orth + "'ve"; SpacyTokenInfo[] arrayOfSpacyTokenInfo12 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo12[0] = new SpacyTokenInfo(orth, word, null, word, 4, null); arrayOfSpacyTokenInfo12[1] = new SpacyTokenInfo("'ve", "have", null, null, 12, null); List list6 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo12); hashMap.put(str2, list6); hashMap = exceptions; str2 = orth + "ve"; SpacyTokenInfo[] arrayOfSpacyTokenInfo11 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo11[0] = new SpacyTokenInfo(orth, word, null, null, 12, null); arrayOfSpacyTokenInfo11[1] = new SpacyTokenInfo("ve", "have", null, "have", 4, null); List list5 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo11); hashMap.put(str2, list5); hashMap = exceptions; str2 = orth + "'d"; SpacyTokenInfo[] arrayOfSpacyTokenInfo10 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo10[0] = new SpacyTokenInfo(orth, word, null, word, 4, null); arrayOfSpacyTokenInfo10[1] = new SpacyTokenInfo("'d", null, null, "'d", 6, null); List list4 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo10); hashMap.put(str2, list4); hashMap = exceptions; str2 = orth + "d"; SpacyTokenInfo[] arrayOfSpacyTokenInfo9 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo9[0] = new SpacyTokenInfo(orth, word, null, word, 4, null); arrayOfSpacyTokenInfo9[1] = new SpacyTokenInfo("d", null, null, "'d", 6, null); List list3 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo9); hashMap.put(str2, list3); hashMap = exceptions; str2 = orth + "'d've"; SpacyTokenInfo[] arrayOfSpacyTokenInfo8 = new SpacyTokenInfo[3]; arrayOfSpacyTokenInfo8[0] = new SpacyTokenInfo(orth, word, null, word, 4, null); arrayOfSpacyTokenInfo8[1] = new SpacyTokenInfo("'d", "would", null, "would", 4, null); arrayOfSpacyTokenInfo8[2] = new SpacyTokenInfo("'ve", "have", null, "have", 4, null); List list2 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo8); hashMap.put(str2, list2); hashMap = exceptions; str2 = orth + "dve"; SpacyTokenInfo[] arrayOfSpacyTokenInfo7 = new SpacyTokenInfo[3]; arrayOfSpacyTokenInfo7[0] = new SpacyTokenInfo(orth, word, null, word, 4, null); arrayOfSpacyTokenInfo7[1] = new SpacyTokenInfo("d", "would", null, "would", 4, null); arrayOfSpacyTokenInfo7[2] = new SpacyTokenInfo("ve", "have", null, "have", 4, null); List list1 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo7); hashMap.put(str2, list1); }  }  SpacyTokenInfo[] arrayOfSpacyTokenInfo1 = new SpacyTokenInfo[10]; arrayOfSpacyTokenInfo1[0] = new SpacyTokenInfo("ca", "can", null, "can", 4, null); arrayOfSpacyTokenInfo1[1] = new SpacyTokenInfo("do", "do", null, "do", 4, null); arrayOfSpacyTokenInfo1[2] = new SpacyTokenInfo("does", "do", null, "does", 4, null); arrayOfSpacyTokenInfo1[3] = new SpacyTokenInfo("did", "do", null, "do", 4, null); arrayOfSpacyTokenInfo1[4] = new SpacyTokenInfo("had", "have", null, "have", 4, null); arrayOfSpacyTokenInfo1[5] = new SpacyTokenInfo("may", null, null, "may", 6, null); arrayOfSpacyTokenInfo1[6] = new SpacyTokenInfo("need", null, null, "need", 6, null); arrayOfSpacyTokenInfo1[7] = new SpacyTokenInfo("ought", null, null, "ought", 6, null); arrayOfSpacyTokenInfo1[8] = new SpacyTokenInfo("sha", "shall", null, "shall", 4, null); arrayOfSpacyTokenInfo1[9] = new SpacyTokenInfo("wo", "will", null, "will", 4, null); List verbDatas = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo1); SpacyTokenInfo[] arrayOfSpacyTokenInfo2 = new SpacyTokenInfo[5]; arrayOfSpacyTokenInfo2[0] = new SpacyTokenInfo("could", null, null, "could", 6, null); arrayOfSpacyTokenInfo2[1] = new SpacyTokenInfo("might", null, null, "might", 6, null); arrayOfSpacyTokenInfo2[2] = new SpacyTokenInfo("must", null, null, "must", 6, null); arrayOfSpacyTokenInfo2[3] = new SpacyTokenInfo("should", null, null, "should", 6, null); arrayOfSpacyTokenInfo2[4] = new SpacyTokenInfo("would", null, null, "would", 6, null); List verbs2 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo2); for (SpacyTokenInfo verbData : CollectionsKt.plus(verbDatas, verbs2)) { SpacyTokenInfo verbDataC = SpacyTokenInfo.copy$default(verbData, null, null, null, null, 15, null); String str1 = verbDataC.getOrth(); char c = str1.charAt(0); StringBuilder stringBuilder = new StringBuilder(); SpacyTokenInfo spacyTokenInfo1 = verbDataC; int $i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$7 = 0; String str3 = Character.isLowerCase(c) ? CharsKt.titlecase(c) : String.valueOf(c), str2 = str1; $i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$7 = 1; Intrinsics.checkNotNullExpressionValue(str2.substring($i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$7), "substring(...)"); spacyTokenInfo1.setOrth(((((CharSequence)str1).length() > 0)) ? stringBuilder.append(str3).append(str2.substring($i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$7)).toString() : str1); SpacyTokenInfo[] arrayOfSpacyTokenInfo = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo[0] = verbData; arrayOfSpacyTokenInfo[1] = verbDataC; for (SpacyTokenInfo data : CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo)) { HashMap<Object, Object> hashMap = exceptions; String str = data.getOrth() + "n't"; SpacyTokenInfo[] arrayOfSpacyTokenInfo10 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo10[0] = data; arrayOfSpacyTokenInfo10[1] = new SpacyTokenInfo("n't", "not", null, "not", 4, null); List list4 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo10); hashMap.put(str, list4); hashMap = exceptions; str = data.getOrth() + "nt"; SpacyTokenInfo[] arrayOfSpacyTokenInfo9 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo9[0] = data; arrayOfSpacyTokenInfo9[1] = new SpacyTokenInfo("nt", "not", null, "not", 4, null); List list3 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo9); hashMap.put(str, list3); hashMap = exceptions; str = data.getOrth() + "n't've"; SpacyTokenInfo[] arrayOfSpacyTokenInfo8 = new SpacyTokenInfo[3]; arrayOfSpacyTokenInfo8[0] = data; arrayOfSpacyTokenInfo8[1] = new SpacyTokenInfo("n't", "not", null, "not", 4, null); arrayOfSpacyTokenInfo8[2] = new SpacyTokenInfo("'ve", "have", null, "have", 4, null); List list2 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo8); hashMap.put(str, list2); hashMap = exceptions; str = data.getOrth() + "ntve"; SpacyTokenInfo[] arrayOfSpacyTokenInfo7 = new SpacyTokenInfo[3]; arrayOfSpacyTokenInfo7[0] = data; arrayOfSpacyTokenInfo7[1] = new SpacyTokenInfo("nt", "not", null, "not", 4, null); arrayOfSpacyTokenInfo7[2] = new SpacyTokenInfo("ve", "have", null, "have", 4, null); List list1 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo7); hashMap.put(str, list1); }  }  for (SpacyTokenInfo verbData : verbs2) { SpacyTokenInfo verbDataC = SpacyTokenInfo.copy$default(verbData, null, null, null, null, 15, null); String str1 = verbDataC.getOrth(); char c = str1.charAt(0); StringBuilder stringBuilder = new StringBuilder(); SpacyTokenInfo spacyTokenInfo1 = verbDataC; int $i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$8 = 0; String str3 = Character.isLowerCase(c) ? CharsKt.titlecase(c) : String.valueOf(c), str2 = str1; $i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$8 = 1; Intrinsics.checkNotNullExpressionValue(str2.substring($i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$8), "substring(...)"); spacyTokenInfo1.setOrth(((((CharSequence)str1).length() > 0)) ? stringBuilder.append(str3).append(str2.substring($i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$8)).toString() : str1); SpacyTokenInfo[] arrayOfSpacyTokenInfo = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo[0] = verbData; arrayOfSpacyTokenInfo[1] = verbDataC; for (SpacyTokenInfo data : CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo)) { HashMap<Object, Object> hashMap = exceptions; String str = data.getOrth() + "'ve"; SpacyTokenInfo[] arrayOfSpacyTokenInfo8 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo8[0] = data; arrayOfSpacyTokenInfo8[1] = new SpacyTokenInfo("'ve", "have", null, null, 12, null); List list2 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo8); hashMap.put(str, list2); hashMap = exceptions; str = data.getOrth() + "ve"; SpacyTokenInfo[] arrayOfSpacyTokenInfo7 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo7[0] = data; arrayOfSpacyTokenInfo7[1] = new SpacyTokenInfo("ve", "have", null, null, 12, null); List list1 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo7); hashMap.put(str, list1); }  }  SpacyTokenInfo[] arrayOfSpacyTokenInfo3 = new SpacyTokenInfo[9]; arrayOfSpacyTokenInfo3[0] = new SpacyTokenInfo("ai", "be", null, null, 12, null); arrayOfSpacyTokenInfo3[1] = new SpacyTokenInfo("are", "be", null, "are", 4, null); arrayOfSpacyTokenInfo3[2] = new SpacyTokenInfo("is", "be", null, "are", 4, null); arrayOfSpacyTokenInfo3[3] = new SpacyTokenInfo("was", "be", null, "is", 4, null); arrayOfSpacyTokenInfo3[4] = new SpacyTokenInfo("was", "be", null, "was", 4, null); arrayOfSpacyTokenInfo3[5] = new SpacyTokenInfo("were", "be", null, "were", 4, null); arrayOfSpacyTokenInfo3[6] = new SpacyTokenInfo("have", null, null, "have", 6, null); arrayOfSpacyTokenInfo3[7] = new SpacyTokenInfo("has", "have", null, "has", 4, null); arrayOfSpacyTokenInfo3[8] = new SpacyTokenInfo("dare", null, null, "dare", 6, null); List beVariations = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo3); for (SpacyTokenInfo verbData : beVariations) { SpacyTokenInfo verbDataC = SpacyTokenInfo.copy$default(verbData, null, null, null, null, 15, null); String str1 = verbDataC.getOrth(); char c = str1.charAt(0); StringBuilder stringBuilder = new StringBuilder(); SpacyTokenInfo spacyTokenInfo1 = verbDataC; int $i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$9 = 0; String str3 = Character.isLowerCase(c) ? CharsKt.titlecase(c) : String.valueOf(c), str2 = str1; $i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$9 = 1; Intrinsics.checkNotNullExpressionValue(str2.substring($i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$9), "substring(...)"); spacyTokenInfo1.setOrth(((((CharSequence)str1).length() > 0)) ? stringBuilder.append(str3).append(str2.substring($i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$9)).toString() : str1); SpacyTokenInfo[] arrayOfSpacyTokenInfo = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo[0] = verbData; arrayOfSpacyTokenInfo[1] = verbDataC; for (SpacyTokenInfo data : CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo)) { HashMap<Object, Object> hashMap = exceptions; String str = data.getOrth() + "n't"; SpacyTokenInfo[] arrayOfSpacyTokenInfo8 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo8[0] = data; arrayOfSpacyTokenInfo8[1] = new SpacyTokenInfo("n't", "not", null, "not", 4, null); List list2 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo8); hashMap.put(str, list2); hashMap = exceptions; str = data.getOrth() + "nt"; SpacyTokenInfo[] arrayOfSpacyTokenInfo7 = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo7[0] = data; arrayOfSpacyTokenInfo7[1] = new SpacyTokenInfo("nt", "not", null, "not", 4, null); List list1 = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo7); hashMap.put(str, list1); }  }  SpacyTokenInfo[] arrayOfSpacyTokenInfo4 = new SpacyTokenInfo[6]; arrayOfSpacyTokenInfo4[0] = new SpacyTokenInfo("doin", "do", null, "doing", 4, null); arrayOfSpacyTokenInfo4[1] = new SpacyTokenInfo("goin", "go", null, "going", 4, null); arrayOfSpacyTokenInfo4[2] = new SpacyTokenInfo("nothin", "nothing", null, "nothing", 4, null); arrayOfSpacyTokenInfo4[3] = new SpacyTokenInfo("nuthin", "nothing", null, "nothing", 4, null); arrayOfSpacyTokenInfo4[4] = new SpacyTokenInfo("ol", "old", null, "old", 4, null); arrayOfSpacyTokenInfo4[5] = new SpacyTokenInfo("somethin", "something", null, "something", 4, null); List trailingApostrpopheData = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo4); for (SpacyTokenInfo excData : trailingApostrpopheData) { SpacyTokenInfo excDataC = SpacyTokenInfo.copy$default(excData, null, null, null, null, 15, null); String str1 = excDataC.getOrth(); char c = str1.charAt(0); StringBuilder stringBuilder = new StringBuilder(); SpacyTokenInfo spacyTokenInfo1 = excDataC; int $i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$10 = 0;
/*     */       String str3 = Character.isLowerCase(c) ? CharsKt.titlecase(c) : String.valueOf(c), str2 = str1;
/*     */       $i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$10 = 1;
/*     */       Intrinsics.checkNotNullExpressionValue(str2.substring($i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$10), "substring(...)");
/*     */       spacyTokenInfo1.setOrth(((((CharSequence)str1).length() > 0)) ? stringBuilder.append(str3).append(str2.substring($i$a$-replaceFirstCharWithCharSequence-SpacyEnglishTokenizerExceptions$generateExceptions$10)).toString() : str1);
/*     */       for (SpacyTokenInfo data : CollectionsKt.listOf(excData)) {
/*     */         SpacyTokenInfo dataApos = data;
/*     */         dataApos.setOrth(dataApos.getOrth() + "'");
/*     */         exceptions.put(data.getOrth(), CollectionsKt.listOf(data));
/*     */         exceptions.put(dataApos.getOrth(), CollectionsKt.listOf(dataApos));
/*     */       }  }
/*     */     
/*     */     SpacyTokenInfo[] arrayOfSpacyTokenInfo5 = new SpacyTokenInfo[3];
/*     */     arrayOfSpacyTokenInfo5[0] = new SpacyTokenInfo("em", null, null, "them", 6, null);
/*     */     arrayOfSpacyTokenInfo5[1] = new SpacyTokenInfo("ll", "will", null, "will", 4, null);
/*     */     arrayOfSpacyTokenInfo5[2] = new SpacyTokenInfo("nuff", "enough", null, "enough", 4, null);
/*     */     List otherData = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo5);
/*     */     for (SpacyTokenInfo excData : otherData) {
/*     */       SpacyTokenInfo excDataApos = SpacyTokenInfo.copy$default(excData, null, null, null, null, 15, null);
/*     */       excDataApos.setOrth("'" + excDataApos.getOrth());
/*     */       SpacyTokenInfo[] arrayOfSpacyTokenInfo = new SpacyTokenInfo[2];
/*     */       arrayOfSpacyTokenInfo[0] = excData;
/*     */       arrayOfSpacyTokenInfo[1] = excDataApos;
/*     */       for (SpacyTokenInfo data : CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo))
/*     */         exceptions.put(data.getOrth(), CollectionsKt.listOf(data)); 
/*     */     } 
/*     */     for (int h = 1; h < 13; h++) {
/*     */       String[] arrayOfString = new String[2];
/*     */       arrayOfString[0] = "a.m.";
/*     */       arrayOfString[1] = "am";
/*     */       for (String period : CollectionsKt.listOf((Object[])arrayOfString)) {
/*     */         HashMap<Object, Object> hashMap = exceptions;
/*     */         String str1 = "" + h + h;
/*     */         SpacyTokenInfo[] arrayOfSpacyTokenInfo = new SpacyTokenInfo[2];
/*     */         arrayOfSpacyTokenInfo[0] = new SpacyTokenInfo(String.valueOf(h), null, null, null, 14, null);
/*     */         arrayOfSpacyTokenInfo[1] = new SpacyTokenInfo(period, "a.m.", null, "a.m.", 4, null);
/*     */         List list = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo);
/*     */         hashMap.put(str1, list);
/*     */       } 
/*     */       arrayOfString = new String[2];
/*     */       arrayOfString[0] = "p.m.";
/*     */       arrayOfString[1] = "pm";
/*     */       for (String period : CollectionsKt.listOf((Object[])arrayOfString)) {
/*     */         HashMap<Object, Object> hashMap = exceptions;
/*     */         String str1 = "" + h + h;
/*     */         SpacyTokenInfo[] arrayOfSpacyTokenInfo = new SpacyTokenInfo[2];
/*     */         arrayOfSpacyTokenInfo[0] = new SpacyTokenInfo(String.valueOf(h), null, null, null, 14, null);
/*     */         arrayOfSpacyTokenInfo[1] = new SpacyTokenInfo(period, "a.m.", null, "a.m.", 4, null);
/*     */         List list = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo);
/*     */         hashMap.put(str1, list);
/*     */       } 
/*     */     } 
/*     */     Pair[] arrayOfPair = new Pair[18];
/*     */     SpacyTokenInfo[] arrayOfSpacyTokenInfo6 = new SpacyTokenInfo[2];
/*     */     arrayOfSpacyTokenInfo6[0] = new SpacyTokenInfo("y'", null, null, "you", 6, null);
/*     */     arrayOfSpacyTokenInfo6[1] = new SpacyTokenInfo("all", null, null, null, 14, null);
/*     */     arrayOfPair[0] = TuplesKt.to("y'all", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo6));
/*     */     arrayOfSpacyTokenInfo6 = new SpacyTokenInfo[2];
/*     */     arrayOfSpacyTokenInfo6[0] = new SpacyTokenInfo("y", null, null, "you", 6, null);
/*     */     arrayOfSpacyTokenInfo6[1] = new SpacyTokenInfo("all", null, null, null, 14, null);
/*     */     arrayOfPair[1] = TuplesKt.to("yall", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo6));
/*     */     arrayOfSpacyTokenInfo6 = new SpacyTokenInfo[3];
/*     */     arrayOfSpacyTokenInfo6[0] = new SpacyTokenInfo("how", "how", null, null, 12, null);
/*     */     arrayOfSpacyTokenInfo6[1] = new SpacyTokenInfo("'d", "do", null, null, 12, null);
/*     */     arrayOfSpacyTokenInfo6[2] = new SpacyTokenInfo("'y", null, null, "you", 6, null);
/*     */     arrayOfPair[2] = TuplesKt.to("how'd'y", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo6));
/*     */     arrayOfSpacyTokenInfo6 = new SpacyTokenInfo[3];
/*     */     arrayOfSpacyTokenInfo6[0] = new SpacyTokenInfo("How", "how", null, "how", 4, null);
/*     */     arrayOfSpacyTokenInfo6[1] = new SpacyTokenInfo("'d", "do", null, null, 12, null);
/*     */     arrayOfSpacyTokenInfo6[2] = new SpacyTokenInfo("'y", null, null, "you", 6, null);
/*     */     arrayOfPair[3] = TuplesKt.to("How'd'y", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo6));
/*     */     arrayOfSpacyTokenInfo6 = new SpacyTokenInfo[2];
/*     */     arrayOfSpacyTokenInfo6[0] = new SpacyTokenInfo("not", "not", null, null, 12, null);
/*     */     arrayOfSpacyTokenInfo6[1] = new SpacyTokenInfo("'ve", "have", null, "have", 4, null);
/*     */     arrayOfPair[4] = TuplesKt.to("not've", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo6));
/*     */     arrayOfSpacyTokenInfo6 = new SpacyTokenInfo[2];
/*     */     arrayOfSpacyTokenInfo6[0] = new SpacyTokenInfo("not", "not", null, null, 12, null);
/*     */     arrayOfSpacyTokenInfo6[1] = new SpacyTokenInfo("ve", "have", null, "have", 4, null);
/*     */     arrayOfPair[5] = TuplesKt.to("notve", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo6));
/*     */     arrayOfSpacyTokenInfo6 = new SpacyTokenInfo[2];
/*     */     arrayOfSpacyTokenInfo6[0] = new SpacyTokenInfo("Not", "not", null, "not", 4, null);
/*     */     arrayOfSpacyTokenInfo6[1] = new SpacyTokenInfo("'ve", "have", null, "have", 4, null);
/*     */     arrayOfPair[6] = TuplesKt.to("Not've", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo6));
/*     */     arrayOfSpacyTokenInfo6 = new SpacyTokenInfo[2];
/*     */     arrayOfSpacyTokenInfo6[0] = new SpacyTokenInfo("Not", "not", null, "not", 4, null);
/*     */     arrayOfSpacyTokenInfo6[1] = new SpacyTokenInfo("ve", "have", null, "have", 4, null);
/*     */     arrayOfPair[7] = TuplesKt.to("Notve", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo6));
/*     */     arrayOfSpacyTokenInfo6 = new SpacyTokenInfo[2];
/*     */     arrayOfSpacyTokenInfo6[0] = new SpacyTokenInfo("can", "can", null, null, 12, null);
/*     */     arrayOfSpacyTokenInfo6[1] = new SpacyTokenInfo("not", "not", null, null, 12, null);
/*     */     arrayOfPair[8] = TuplesKt.to("cannot", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo6));
/*     */     arrayOfSpacyTokenInfo6 = new SpacyTokenInfo[2];
/*     */     arrayOfSpacyTokenInfo6[0] = new SpacyTokenInfo("Can", "can", null, "can", 4, null);
/*     */     arrayOfSpacyTokenInfo6[1] = new SpacyTokenInfo("not", "not", null, null, 12, null);
/*     */     arrayOfPair[9] = TuplesKt.to("Cannot", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo6));
/*     */     arrayOfSpacyTokenInfo6 = new SpacyTokenInfo[2];
/*     */     arrayOfSpacyTokenInfo6[0] = new SpacyTokenInfo("gon", "go", null, "going", 4, null);
/*     */     arrayOfSpacyTokenInfo6[1] = new SpacyTokenInfo("na", "to", null, "to", 4, null);
/*     */     arrayOfPair[10] = TuplesKt.to("gonna", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo6));
/*     */     arrayOfSpacyTokenInfo6 = new SpacyTokenInfo[2];
/*     */     arrayOfSpacyTokenInfo6[0] = new SpacyTokenInfo("Gon", "go", null, "going", 4, null);
/*     */     arrayOfSpacyTokenInfo6[1] = new SpacyTokenInfo("na", "to", null, "to", 4, null);
/*     */     arrayOfPair[11] = TuplesKt.to("Gonna", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo6));
/*     */     arrayOfSpacyTokenInfo6 = new SpacyTokenInfo[2];
/*     */     arrayOfSpacyTokenInfo6[0] = new SpacyTokenInfo("got", null, null, null, 14, null);
/*     */     arrayOfSpacyTokenInfo6[1] = new SpacyTokenInfo("ta", "to", null, "to", 4, null);
/*     */     arrayOfPair[12] = TuplesKt.to("gotta", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo6));
/*     */     arrayOfSpacyTokenInfo6 = new SpacyTokenInfo[2];
/*     */     arrayOfSpacyTokenInfo6[0] = new SpacyTokenInfo("Got", null, null, "got", 6, null);
/*     */     arrayOfSpacyTokenInfo6[1] = new SpacyTokenInfo("ta", "to", null, "to", 4, null);
/*     */     arrayOfPair[13] = TuplesKt.to("Gotta", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo6));
/*     */     arrayOfSpacyTokenInfo6 = new SpacyTokenInfo[2];
/*     */     arrayOfSpacyTokenInfo6[0] = new SpacyTokenInfo("let", null, null, null, 14, null);
/*     */     arrayOfSpacyTokenInfo6[1] = new SpacyTokenInfo("'s", null, null, "us", 6, null);
/*     */     arrayOfPair[14] = TuplesKt.to("let's", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo6));
/*     */     arrayOfSpacyTokenInfo6 = new SpacyTokenInfo[2];
/*     */     arrayOfSpacyTokenInfo6[0] = new SpacyTokenInfo("Let", "let", null, "let", 4, null);
/*     */     arrayOfSpacyTokenInfo6[1] = new SpacyTokenInfo("'s", null, null, "us", 6, null);
/*     */     arrayOfPair[15] = TuplesKt.to("Let's", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo6));
/*     */     arrayOfSpacyTokenInfo6 = new SpacyTokenInfo[2];
/*     */     arrayOfSpacyTokenInfo6[0] = new SpacyTokenInfo("c'm", "come", null, "come", 4, null);
/*     */     arrayOfSpacyTokenInfo6[1] = new SpacyTokenInfo("on", null, null, null, 14, null);
/*     */     arrayOfPair[16] = TuplesKt.to("c'mon", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo6));
/*     */     arrayOfSpacyTokenInfo6 = new SpacyTokenInfo[2];
/*     */     arrayOfSpacyTokenInfo6[0] = new SpacyTokenInfo("C'm", "come", null, "come", 4, null);
/*     */     arrayOfSpacyTokenInfo6[1] = new SpacyTokenInfo("on", null, null, null, 14, null);
/*     */     arrayOfPair[17] = TuplesKt.to("C'mon", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo6));
/*     */     HashMap<?, ?> otherExc = MapsKt.hashMapOf(arrayOfPair);
/*     */     exceptions.putAll(otherExc);
/*     */     arrayOfSpacyTokenInfo6 = new SpacyTokenInfo[90];
/*     */     arrayOfSpacyTokenInfo6[0] = new SpacyTokenInfo("'S", "'s", null, "'s", 4, null);
/*     */     arrayOfSpacyTokenInfo6[1] = new SpacyTokenInfo("'s", "'s", null, "'s", 4, null);
/*     */     arrayOfSpacyTokenInfo6[2] = new SpacyTokenInfo("\\u2018S", "'S", null, "'S", 4, null);
/*     */     arrayOfSpacyTokenInfo6[3] = new SpacyTokenInfo("\\u2018s", "'s", null, "'s", 4, null);
/*     */     arrayOfSpacyTokenInfo6[4] = new SpacyTokenInfo("and/or", "and/or", null, "and/or", 4, null);
/*     */     arrayOfSpacyTokenInfo6[5] = new SpacyTokenInfo("w/o", "without", null, "without", 4, null);
/*     */     arrayOfSpacyTokenInfo6[6] = new SpacyTokenInfo("'re", "be", null, "are", 4, null);
/*     */     arrayOfSpacyTokenInfo6[7] = new SpacyTokenInfo("'Cause", "because", null, "because", 4, null);
/*     */     arrayOfSpacyTokenInfo6[8] = new SpacyTokenInfo("'cause", "because", null, "because", 4, null);
/*     */     arrayOfSpacyTokenInfo6[9] = new SpacyTokenInfo("'cos", "because", null, "because", 4, null);
/*     */     arrayOfSpacyTokenInfo6[10] = new SpacyTokenInfo("'Cos", "because", null, "because", 4, null);
/*     */     arrayOfSpacyTokenInfo6[11] = new SpacyTokenInfo("'coz", "because", null, "because", 4, null);
/*     */     arrayOfSpacyTokenInfo6[12] = new SpacyTokenInfo("'Coz", "because", null, "because", 4, null);
/*     */     arrayOfSpacyTokenInfo6[13] = new SpacyTokenInfo("'cuz", "because", null, "because", 4, null);
/*     */     arrayOfSpacyTokenInfo6[14] = new SpacyTokenInfo("'Cuz", "because", null, "because", 4, null);
/*     */     arrayOfSpacyTokenInfo6[15] = new SpacyTokenInfo("'bout", "about", null, "about", 4, null);
/*     */     arrayOfSpacyTokenInfo6[16] = new SpacyTokenInfo("ma'am", "madam", null, "madam", 4, null);
/*     */     arrayOfSpacyTokenInfo6[17] = new SpacyTokenInfo("Ma'am", "madam", null, "madam", 4, null);
/*     */     arrayOfSpacyTokenInfo6[18] = new SpacyTokenInfo("o'clock", "o'clock", null, "o'clock", 4, null);
/*     */     arrayOfSpacyTokenInfo6[19] = new SpacyTokenInfo("O'clock", "o'clock", null, "o'clock", 4, null);
/*     */     arrayOfSpacyTokenInfo6[20] = new SpacyTokenInfo("lovin'", "love", null, "loving", 4, null);
/*     */     arrayOfSpacyTokenInfo6[21] = new SpacyTokenInfo("Lovin'", "love", null, "loving", 4, null);
/*     */     arrayOfSpacyTokenInfo6[22] = new SpacyTokenInfo("lovin", "love", null, "loving", 4, null);
/*     */     arrayOfSpacyTokenInfo6[23] = new SpacyTokenInfo("Lovin", "love", null, "loving", 4, null);
/*     */     arrayOfSpacyTokenInfo6[24] = new SpacyTokenInfo("havin'", "have", null, "having", 4, null);
/*     */     arrayOfSpacyTokenInfo6[25] = new SpacyTokenInfo("Havin'", "have", null, "having", 4, null);
/*     */     arrayOfSpacyTokenInfo6[26] = new SpacyTokenInfo("havin", "have", null, "having", 4, null);
/*     */     arrayOfSpacyTokenInfo6[27] = new SpacyTokenInfo("Havin", "have", null, "having", 4, null);
/*     */     arrayOfSpacyTokenInfo6[28] = new SpacyTokenInfo("doin'", "do", null, "doing", 4, null);
/*     */     arrayOfSpacyTokenInfo6[29] = new SpacyTokenInfo("Doin'", "do", null, "doing", 4, null);
/*     */     arrayOfSpacyTokenInfo6[30] = new SpacyTokenInfo("doin", "do", null, "doing", 4, null);
/*     */     arrayOfSpacyTokenInfo6[31] = new SpacyTokenInfo("Doin", "do", null, "doing", 4, null);
/*     */     arrayOfSpacyTokenInfo6[32] = new SpacyTokenInfo("goin'", "go", null, "going", 4, null);
/*     */     arrayOfSpacyTokenInfo6[33] = new SpacyTokenInfo("Goin'", "go", null, "going", 4, null);
/*     */     arrayOfSpacyTokenInfo6[34] = new SpacyTokenInfo("goin", "go", null, "going", 4, null);
/*     */     arrayOfSpacyTokenInfo6[35] = new SpacyTokenInfo("Goin", "go", null, "going", 4, null);
/*     */     arrayOfSpacyTokenInfo6[36] = new SpacyTokenInfo("Mt.", "Mount", null, "Mount", 4, null);
/*     */     arrayOfSpacyTokenInfo6[37] = new SpacyTokenInfo("Ak.", "Alaska", null, "Alaska", 4, null);
/*     */     arrayOfSpacyTokenInfo6[38] = new SpacyTokenInfo("Ala.", "Alabama", null, "Alabama", 4, null);
/*     */     arrayOfSpacyTokenInfo6[39] = new SpacyTokenInfo("Apr.", "April", null, "April", 4, null);
/*     */     arrayOfSpacyTokenInfo6[40] = new SpacyTokenInfo("Ariz.", "Arizona", null, "Arizona", 4, null);
/*     */     arrayOfSpacyTokenInfo6[41] = new SpacyTokenInfo("Ark.", "Arkansas", null, "Arkansas", 4, null);
/*     */     arrayOfSpacyTokenInfo6[42] = new SpacyTokenInfo("Aug.", "August", null, "August", 4, null);
/*     */     arrayOfSpacyTokenInfo6[43] = new SpacyTokenInfo("Calif.", "California", null, "California", 4, null);
/*     */     arrayOfSpacyTokenInfo6[44] = new SpacyTokenInfo("Colo.", "Colorado", null, "Colorado", 4, null);
/*     */     arrayOfSpacyTokenInfo6[45] = new SpacyTokenInfo("Conn.", "Connecticut", null, "Connecticut", 4, null);
/*     */     arrayOfSpacyTokenInfo6[46] = new SpacyTokenInfo("Dec.", "December", null, "December", 4, null);
/*     */     arrayOfSpacyTokenInfo6[47] = new SpacyTokenInfo("Del.", "Delaware", null, "Delaware", 4, null);
/*     */     arrayOfSpacyTokenInfo6[48] = new SpacyTokenInfo("Feb.", "February", null, "February", 4, null);
/*     */     arrayOfSpacyTokenInfo6[49] = new SpacyTokenInfo("Fla.", "Florida", null, "Florida", 4, null);
/*     */     arrayOfSpacyTokenInfo6[50] = new SpacyTokenInfo("Ga.", "Georgia", null, "Georgia", 4, null);
/*     */     arrayOfSpacyTokenInfo6[51] = new SpacyTokenInfo("Ia.", "Iowa", null, "Iowa", 4, null);
/*     */     arrayOfSpacyTokenInfo6[52] = new SpacyTokenInfo("Id.", "Idaho", null, "Idaho", 4, null);
/*     */     arrayOfSpacyTokenInfo6[53] = new SpacyTokenInfo("Ill.", "Illinois", null, "Illinois", 4, null);
/*     */     arrayOfSpacyTokenInfo6[54] = new SpacyTokenInfo("Ind.", "Indiana", null, "Indiana", 4, null);
/*     */     arrayOfSpacyTokenInfo6[55] = new SpacyTokenInfo("Jan.", "January", null, "January", 4, null);
/*     */     arrayOfSpacyTokenInfo6[56] = new SpacyTokenInfo("Jul.", "July", null, "July", 4, null);
/*     */     arrayOfSpacyTokenInfo6[57] = new SpacyTokenInfo("Jun.", "June", null, "June", 4, null);
/*     */     arrayOfSpacyTokenInfo6[58] = new SpacyTokenInfo("Kan.", "Kansas", null, "Kansas", 4, null);
/*     */     arrayOfSpacyTokenInfo6[59] = new SpacyTokenInfo("Kans.", "Kansas", null, "Kansas", 4, null);
/*     */     arrayOfSpacyTokenInfo6[60] = new SpacyTokenInfo("Ky.", "Kentucky", null, "Kentucky", 4, null);
/*     */     arrayOfSpacyTokenInfo6[61] = new SpacyTokenInfo("La.", "Louisiana", null, "Louisiana", 4, null);
/*     */     arrayOfSpacyTokenInfo6[62] = new SpacyTokenInfo("Mar.", "March", null, "March", 4, null);
/*     */     arrayOfSpacyTokenInfo6[63] = new SpacyTokenInfo("Mass.", "Massachusetts", null, "Massachusetts", 4, null);
/*     */     arrayOfSpacyTokenInfo6[64] = new SpacyTokenInfo("May.", "May", null, "May", 4, null);
/*     */     arrayOfSpacyTokenInfo6[65] = new SpacyTokenInfo("Mich.", "Michigan", null, "Michigan", 4, null);
/*     */     arrayOfSpacyTokenInfo6[66] = new SpacyTokenInfo("Minn.", "Minnesota", null, "Minnesota", 4, null);
/*     */     arrayOfSpacyTokenInfo6[67] = new SpacyTokenInfo("Miss.", "Mississippi", null, "Mississippi", 4, null);
/*     */     arrayOfSpacyTokenInfo6[68] = new SpacyTokenInfo("N.C.", "North Carolina", null, "North Carolina", 4, null);
/*     */     arrayOfSpacyTokenInfo6[69] = new SpacyTokenInfo("N.D.", "North Dakota", null, "North Dakota", 4, null);
/*     */     arrayOfSpacyTokenInfo6[70] = new SpacyTokenInfo("N.H.", "New Hampshire", null, "New Hampshire", 4, null);
/*     */     arrayOfSpacyTokenInfo6[71] = new SpacyTokenInfo("N.J.", "New Jersey", null, "New Jersey", 4, null);
/*     */     arrayOfSpacyTokenInfo6[72] = new SpacyTokenInfo("N.M.", "New Mexico", null, "New Mexico", 4, null);
/*     */     arrayOfSpacyTokenInfo6[73] = new SpacyTokenInfo("N.Y.", "New York", null, "New York", 4, null);
/*     */     arrayOfSpacyTokenInfo6[74] = new SpacyTokenInfo("Neb.", "Nebraska", null, "Nebraska", 4, null);
/*     */     arrayOfSpacyTokenInfo6[75] = new SpacyTokenInfo("Nebr.", "Nebraska", null, "Nebraska", 4, null);
/*     */     arrayOfSpacyTokenInfo6[76] = new SpacyTokenInfo("Nev.", "Nevada", null, "Nevada", 4, null);
/*     */     arrayOfSpacyTokenInfo6[77] = new SpacyTokenInfo("Nov.", "November", null, "November", 4, null);
/*     */     arrayOfSpacyTokenInfo6[78] = new SpacyTokenInfo("Oct.", "October", null, "October", 4, null);
/*     */     arrayOfSpacyTokenInfo6[79] = new SpacyTokenInfo("Okla.", "Oklahoma", null, "Oklahoma", 4, null);
/*     */     arrayOfSpacyTokenInfo6[80] = new SpacyTokenInfo("Ore.", "Oregon", null, "Oregon", 4, null);
/*     */     arrayOfSpacyTokenInfo6[81] = new SpacyTokenInfo("Pa.", "Pennsylvania", null, "Pennsylvania", 4, null);
/*     */     arrayOfSpacyTokenInfo6[82] = new SpacyTokenInfo("S.C.", "South Carolina", null, "South Carolina", 4, null);
/*     */     arrayOfSpacyTokenInfo6[83] = new SpacyTokenInfo("Sep.", "September", null, "September", 4, null);
/*     */     arrayOfSpacyTokenInfo6[84] = new SpacyTokenInfo("Sept.", "September", null, "September", 4, null);
/*     */     arrayOfSpacyTokenInfo6[85] = new SpacyTokenInfo("Tenn.", "Tennessee", null, "Tennessee", 4, null);
/*     */     arrayOfSpacyTokenInfo6[86] = new SpacyTokenInfo("U.K.", "United Kingdom", null, "United Kingdom", 4, null);
/*     */     arrayOfSpacyTokenInfo6[87] = new SpacyTokenInfo("Va.", "Virginia", null, "Virginia", 4, null);
/*     */     arrayOfSpacyTokenInfo6[88] = new SpacyTokenInfo("Wash.", "Washington", null, "Washington", 4, null);
/*     */     arrayOfSpacyTokenInfo6[89] = new SpacyTokenInfo("Wis.", "Wisconsin", null, "Wisconsin", 4, null);
/*     */     List abbreviations = CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo6);
/*     */     for (SpacyTokenInfo abb : abbreviations)
/*     */       exceptions.put(abb.getOrth(), CollectionsKt.listOf(abb)); 
/*     */     String[] arrayOfString2 = new String[36];
/*     */     arrayOfString2[0] = "'d";
/*     */     arrayOfString2[1] = "a.m.";
/*     */     arrayOfString2[2] = "Adm.";
/*     */     arrayOfString2[3] = "Bros.";
/*     */     arrayOfString2[4] = "co.";
/*     */     arrayOfString2[5] = "Co.";
/*     */     arrayOfString2[6] = "Corp.";
/*     */     arrayOfString2[7] = "D.C.";
/*     */     arrayOfString2[8] = "Dr.";
/*     */     arrayOfString2[9] = "e.g.";
/*     */     arrayOfString2[10] = "E.g.";
/*     */     arrayOfString2[11] = "E.G.";
/*     */     arrayOfString2[12] = "Gen.";
/*     */     arrayOfString2[13] = "Gov.";
/*     */     arrayOfString2[14] = "i.e.";
/*     */     arrayOfString2[15] = "I.e.";
/*     */     arrayOfString2[16] = "I.E.";
/*     */     arrayOfString2[17] = "Inc.";
/*     */     arrayOfString2[18] = "Jr.";
/*     */     arrayOfString2[19] = "Ltd.";
/*     */     arrayOfString2[20] = "Md.";
/*     */     arrayOfString2[21] = "Messrs.";
/*     */     arrayOfString2[22] = "Mo.";
/*     */     arrayOfString2[23] = "Mont.";
/*     */     arrayOfString2[24] = "Mr.";
/*     */     arrayOfString2[25] = "Mrs.";
/*     */     arrayOfString2[26] = "Ms.";
/*     */     arrayOfString2[27] = "p.m.";
/*     */     arrayOfString2[28] = "Ph.D.";
/*     */     arrayOfString2[29] = "Prof.";
/*     */     arrayOfString2[30] = "Rep.";
/*     */     arrayOfString2[31] = "Rev.";
/*     */     arrayOfString2[32] = "Sen.";
/*     */     arrayOfString2[33] = "St.";
/*     */     arrayOfString2[34] = "vs.";
/*     */     arrayOfString2[35] = "v.s.";
/*     */     List anotherOneExceptions = CollectionsKt.listOf((Object[])arrayOfString2);
/*     */     for (String exception : anotherOneExceptions)
/*     */       exceptions.put(exception, CollectionsKt.listOf(new SpacyTokenInfo(exception, null, null, null, 14, null))); 
/*     */     for (String excludeString : exclude) {
/*     */       if (exceptions.keySet().contains(excludeString))
/*     */         exceptions.remove(excludeString); 
/*     */     } 
/*     */     return (HashMap)exceptions;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\spacy\en\SpacyEnglishTokenizerExceptions.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */