/*    */ package ai.grazie.nlp.tokenizer.spacy.uk;
/*    */ import ai.grazie.nlp.tokenizer.spacy.SpacyTokenInfo;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\020$\n\002\020\016\n\002\020 \n\002\030\002\n\002\b\006\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\f\032\024\022\004\022\0020\005\022\n\022\b\022\004\022\0020\0070\0060\004H\002R-\020\003\032\024\022\004\022\0020\005\022\n\022\b\022\004\022\0020\0070\0060\0048FX\002¢\006\f\n\004\b\n\020\013\032\004\b\b\020\t¨\006\r"}, d2 = {"Lai/grazie/nlp/tokenizer/spacy/uk/SpacyUkrainianTokenizerExceptions;", "", "()V", "exceptions", "", "", "", "Lai/grazie/nlp/tokenizer/spacy/SpacyTokenInfo;", "getExceptions", "()Ljava/util/Map;", "exceptions$delegate", "Lkotlin/Lazy;", "generateException", "nlp-tokenizer"})
/*    */ public final class SpacyUkrainianTokenizerExceptions {
/*    */   @NotNull
/*  7 */   public static final SpacyUkrainianTokenizerExceptions INSTANCE = new SpacyUkrainianTokenizerExceptions(); @NotNull private static final Lazy exceptions$delegate = LazyKt.lazy(SpacyUkrainianTokenizerExceptions$exceptions$2.INSTANCE); @NotNull public final Map<String, List<SpacyTokenInfo>> getExceptions() { Lazy lazy = exceptions$delegate; return (Map<String, List<SpacyTokenInfo>>)lazy.getValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020$\n\002\020\016\n\002\020 \n\002\030\002\n\000\020\000\032\024\022\004\022\0020\002\022\n\022\b\022\004\022\0020\0040\0030\001H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "", "", "Lai/grazie/nlp/tokenizer/spacy/SpacyTokenInfo;", "invoke"})
/*  8 */   static final class SpacyUkrainianTokenizerExceptions$exceptions$2 extends Lambda implements Function0<Map<String, ? extends List<? extends SpacyTokenInfo>>> { public static final SpacyUkrainianTokenizerExceptions$exceptions$2 INSTANCE = new SpacyUkrainianTokenizerExceptions$exceptions$2(); public final Map<String, List<SpacyTokenInfo>> invoke() { return SpacyUkrainianTokenizerExceptions.INSTANCE.generateException(); }
/*    */      SpacyUkrainianTokenizerExceptions$exceptions$2() {
/*    */       super(0);
/*    */     } } private final Map<String, List<SpacyTokenInfo>> generateException() {
/* 12 */     HashMap<Object, Object> exceptions = new HashMap<>();
/*    */ 
/*    */     
/* 15 */     SpacyTokenInfo[] arrayOfSpacyTokenInfo = new SpacyTokenInfo[24]; arrayOfSpacyTokenInfo[0] = new SpacyTokenInfo("обл.", null, null, "область", 6, null); arrayOfSpacyTokenInfo[1] = 
/* 16 */       new SpacyTokenInfo("р-н.", null, null, "район", 6, null);
/* 17 */     arrayOfSpacyTokenInfo[2] = new SpacyTokenInfo("р-н", null, null, "район", 6, null);
/* 18 */     arrayOfSpacyTokenInfo[3] = new SpacyTokenInfo("м.", null, null, "місто", 6, null);
/* 19 */     arrayOfSpacyTokenInfo[4] = new SpacyTokenInfo("вул.", null, null, "вулиця", 6, null);
/* 20 */     arrayOfSpacyTokenInfo[5] = new SpacyTokenInfo("просп.", null, null, "проспект", 6, null);
/* 21 */     arrayOfSpacyTokenInfo[6] = new SpacyTokenInfo("пр-кт", null, null, "проспект", 6, null);
/* 22 */     arrayOfSpacyTokenInfo[7] = new SpacyTokenInfo("бул.", null, null, "бульвар", 6, null);
/* 23 */     arrayOfSpacyTokenInfo[8] = new SpacyTokenInfo("пров.", null, null, "провулок", 6, null);
/* 24 */     arrayOfSpacyTokenInfo[9] = new SpacyTokenInfo("пл.", null, null, "площа", 6, null);
/* 25 */     arrayOfSpacyTokenInfo[10] = new SpacyTokenInfo("майд.", null, null, "майдан", 6, null);
/* 26 */     arrayOfSpacyTokenInfo[11] = new SpacyTokenInfo("мкр.", null, null, "мікрорайон", 6, null);
/* 27 */     arrayOfSpacyTokenInfo[12] = new SpacyTokenInfo("ст.", null, null, "станція", 6, null);
/* 28 */     arrayOfSpacyTokenInfo[13] = new SpacyTokenInfo("ж/м", null, null, "житловий масив", 6, null);
/* 29 */     arrayOfSpacyTokenInfo[14] = new SpacyTokenInfo("наб.", null, null, "набережна", 6, null);
/* 30 */     arrayOfSpacyTokenInfo[15] = new SpacyTokenInfo("в/ч", null, null, "військова частина", 6, null);
/* 31 */     arrayOfSpacyTokenInfo[16] = new SpacyTokenInfo("в/м", null, null, "військове містечко", 6, null);
/* 32 */     arrayOfSpacyTokenInfo[17] = new SpacyTokenInfo("оз.", null, null, "озеро", 6, null);
/* 33 */     arrayOfSpacyTokenInfo[18] = new SpacyTokenInfo("ім.", null, null, "імені", 6, null);
/* 34 */     arrayOfSpacyTokenInfo[19] = new SpacyTokenInfo("г.", null, null, "гора", 6, null);
/* 35 */     arrayOfSpacyTokenInfo[20] = new SpacyTokenInfo("п.", null, null, "пан", 6, null);
/* 36 */     arrayOfSpacyTokenInfo[21] = new SpacyTokenInfo("проф.", null, null, "професор", 6, null);
/* 37 */     arrayOfSpacyTokenInfo[22] = new SpacyTokenInfo("акад.", null, null, "академік", 6, null);
/* 38 */     arrayOfSpacyTokenInfo[23] = new SpacyTokenInfo("доц.", null, null, "доцент", 6, null);
/*    */     for (SpacyTokenInfo abbr : CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo)) {
/* 40 */       exceptions.put(abbr.getOrth(), CollectionsKt.listOf(abbr));
/*    */     }
/*    */     
/* 43 */     return (Map)exceptions;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\spac\\uk\SpacyUkrainianTokenizerExceptions.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */