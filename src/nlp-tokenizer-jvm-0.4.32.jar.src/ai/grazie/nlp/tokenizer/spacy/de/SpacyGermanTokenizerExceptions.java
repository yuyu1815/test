/*     */ package ai.grazie.nlp.tokenizer.spacy.de;
/*     */ import ai.grazie.nlp.tokenizer.spacy.SpacyTokenInfo;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\020$\n\002\020\016\n\002\020 \n\002\030\002\n\002\b\006\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\f\032\024\022\004\022\0020\005\022\n\022\b\022\004\022\0020\0070\0060\004H\002R-\020\003\032\024\022\004\022\0020\005\022\n\022\b\022\004\022\0020\0070\0060\0048FX\002¢\006\f\n\004\b\n\020\013\032\004\b\b\020\t¨\006\r"}, d2 = {"Lai/grazie/nlp/tokenizer/spacy/de/SpacyGermanTokenizerExceptions;", "", "()V", "exceptions", "", "", "", "Lai/grazie/nlp/tokenizer/spacy/SpacyTokenInfo;", "getExceptions", "()Ljava/util/Map;", "exceptions$delegate", "Lkotlin/Lazy;", "generateException", "nlp-tokenizer"})
/*     */ public final class SpacyGermanTokenizerExceptions {
/*     */   @NotNull
/*   7 */   public static final SpacyGermanTokenizerExceptions INSTANCE = new SpacyGermanTokenizerExceptions(); @NotNull private static final Lazy exceptions$delegate = LazyKt.lazy(SpacyGermanTokenizerExceptions$exceptions$2.INSTANCE); @NotNull public final Map<String, List<SpacyTokenInfo>> getExceptions() { Lazy lazy = exceptions$delegate; return (Map<String, List<SpacyTokenInfo>>)lazy.getValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020$\n\002\020\016\n\002\020 \n\002\030\002\n\000\020\000\032\024\022\004\022\0020\002\022\n\022\b\022\004\022\0020\0040\0030\001H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "", "", "Lai/grazie/nlp/tokenizer/spacy/SpacyTokenInfo;", "invoke"})
/*   8 */   static final class SpacyGermanTokenizerExceptions$exceptions$2 extends Lambda implements Function0<Map<String, ? extends List<? extends SpacyTokenInfo>>> { public static final SpacyGermanTokenizerExceptions$exceptions$2 INSTANCE = new SpacyGermanTokenizerExceptions$exceptions$2(); public final Map<String, List<SpacyTokenInfo>> invoke() { return SpacyGermanTokenizerExceptions.INSTANCE.generateException(); }
/*     */      SpacyGermanTokenizerExceptions$exceptions$2() {
/*     */       super(0);
/*     */     } } private final Map<String, List<SpacyTokenInfo>> generateException() {
/*  12 */     HashMap<Object, Object> exceptions = new HashMap<>();
/*     */ 
/*     */     
/*  15 */     Pair[] arrayOfPair = new Pair[11]; SpacyTokenInfo[] arrayOfSpacyTokenInfo = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo[0] = new SpacyTokenInfo("auf", null, null, null, 14, null); arrayOfSpacyTokenInfo[1] = new SpacyTokenInfo("'m", null, null, "dem", 6, null); arrayOfPair[0] = TuplesKt.to("auf'm", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo));
/*  16 */     arrayOfSpacyTokenInfo = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo[0] = new SpacyTokenInfo("du", null, null, null, 14, null); arrayOfSpacyTokenInfo[1] = new SpacyTokenInfo("'s", null, null, "es", 6, null); arrayOfPair[1] = TuplesKt.to("du's", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo));
/*  17 */     arrayOfSpacyTokenInfo = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo[0] = new SpacyTokenInfo("er", null, null, null, 14, null); arrayOfSpacyTokenInfo[1] = new SpacyTokenInfo("'s", null, null, "es", 6, null); arrayOfPair[2] = TuplesKt.to("er's", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo));
/*  18 */     arrayOfSpacyTokenInfo = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo[0] = new SpacyTokenInfo("hinter", null, null, null, 14, null); arrayOfSpacyTokenInfo[1] = new SpacyTokenInfo("'m", null, null, "dem", 6, null); arrayOfPair[3] = TuplesKt.to("hinter'm", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo));
/*  19 */     arrayOfSpacyTokenInfo = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo[0] = new SpacyTokenInfo("ich", null, null, null, 14, null); arrayOfSpacyTokenInfo[1] = new SpacyTokenInfo("'s", null, null, "es", 6, null); arrayOfPair[4] = TuplesKt.to("ich's", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo));
/*  20 */     arrayOfSpacyTokenInfo = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo[0] = new SpacyTokenInfo("ihr", null, null, null, 14, null); arrayOfSpacyTokenInfo[1] = new SpacyTokenInfo("'s", null, null, "es", 6, null); arrayOfPair[5] = TuplesKt.to("ihr's", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo));
/*  21 */     arrayOfSpacyTokenInfo = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo[0] = new SpacyTokenInfo("sie", null, null, null, 14, null); arrayOfSpacyTokenInfo[1] = new SpacyTokenInfo("'s", null, null, "es", 6, null); arrayOfPair[6] = TuplesKt.to("sie's", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo));
/*  22 */     arrayOfSpacyTokenInfo = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo[0] = new SpacyTokenInfo("unter", null, null, null, 14, null); arrayOfSpacyTokenInfo[1] = new SpacyTokenInfo("'m", null, null, "dem", 6, null); arrayOfPair[7] = TuplesKt.to("unter'm", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo));
/*  23 */     arrayOfSpacyTokenInfo = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo[0] = new SpacyTokenInfo("vor", null, null, null, 14, null); arrayOfSpacyTokenInfo[1] = new SpacyTokenInfo("'m", null, null, "dem", 6, null); arrayOfPair[8] = TuplesKt.to("vor'm", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo));
/*  24 */     arrayOfSpacyTokenInfo = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo[0] = new SpacyTokenInfo("wir", null, null, null, 14, null); arrayOfSpacyTokenInfo[1] = new SpacyTokenInfo("'s", null, null, "es", 6, null); arrayOfPair[9] = TuplesKt.to("wir's", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo));
/*  25 */     arrayOfSpacyTokenInfo = new SpacyTokenInfo[2]; arrayOfSpacyTokenInfo[0] = new SpacyTokenInfo("über", null, null, null, 14, null); arrayOfSpacyTokenInfo[1] = new SpacyTokenInfo("'m", null, null, "dem", 6, null); arrayOfPair[10] = TuplesKt.to("über'm", CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo));
/*     */ 
/*     */     
/*     */     MapsKt.putAll(exceptions, CollectionsKt.listOf((Object[])arrayOfPair));
/*     */     
/*  30 */     arrayOfSpacyTokenInfo = new SpacyTokenInfo[111]; arrayOfSpacyTokenInfo[0] = new SpacyTokenInfo("'S", null, null, "'s", 6, null); arrayOfSpacyTokenInfo[1] = 
/*  31 */       new SpacyTokenInfo("'s", null, null, "'s", 6, null);
/*  32 */     arrayOfSpacyTokenInfo[2] = new SpacyTokenInfo("S'", null, null, "'s", 6, null);
/*  33 */     arrayOfSpacyTokenInfo[3] = new SpacyTokenInfo("s'", null, null, "'s", 6, null);
/*  34 */     arrayOfSpacyTokenInfo[4] = new SpacyTokenInfo("'n", null, null, "ein", 6, null);
/*  35 */     arrayOfSpacyTokenInfo[5] = new SpacyTokenInfo("'ne", null, null, "eine", 6, null);
/*  36 */     arrayOfSpacyTokenInfo[6] = new SpacyTokenInfo("'nen", null, null, "einen", 6, null);
/*  37 */     arrayOfSpacyTokenInfo[7] = new SpacyTokenInfo("'nem", null, null, "einem", 6, null);
/*  38 */     arrayOfSpacyTokenInfo[8] = new SpacyTokenInfo("Abb.", null, null, "Abbildung", 6, null);
/*  39 */     arrayOfSpacyTokenInfo[9] = new SpacyTokenInfo("Abk.", null, null, "Abkürzung", 6, null);
/*  40 */     arrayOfSpacyTokenInfo[10] = new SpacyTokenInfo("Abt.", null, null, "Abteilung", 6, null);
/*  41 */     arrayOfSpacyTokenInfo[11] = new SpacyTokenInfo("Apr.", null, null, "April", 6, null);
/*  42 */     arrayOfSpacyTokenInfo[12] = new SpacyTokenInfo("Aug.", null, null, "August", 6, null);
/*  43 */     arrayOfSpacyTokenInfo[13] = new SpacyTokenInfo("Bd.", null, null, "Band", 6, null);
/*  44 */     arrayOfSpacyTokenInfo[14] = new SpacyTokenInfo("Betr.", null, null, "Betreff", 6, null);
/*  45 */     arrayOfSpacyTokenInfo[15] = new SpacyTokenInfo("Bf.", null, null, "Bahnhof", 6, null);
/*  46 */     arrayOfSpacyTokenInfo[16] = new SpacyTokenInfo("Bhf.", null, null, "Bahnhof", 6, null);
/*  47 */     arrayOfSpacyTokenInfo[17] = new SpacyTokenInfo("Bsp.", null, null, "Beispiel", 6, null);
/*  48 */     arrayOfSpacyTokenInfo[18] = new SpacyTokenInfo("Dez.", null, null, "Dezember", 6, null);
/*  49 */     arrayOfSpacyTokenInfo[19] = new SpacyTokenInfo("Di.", null, null, "Dienstag", 6, null);
/*  50 */     arrayOfSpacyTokenInfo[20] = new SpacyTokenInfo("Do.", null, null, "Donnerstag", 6, null);
/*  51 */     arrayOfSpacyTokenInfo[21] = new SpacyTokenInfo("Fa.", null, null, "Firma", 6, null);
/*  52 */     arrayOfSpacyTokenInfo[22] = new SpacyTokenInfo("Fam.", null, null, "Familie", 6, null);
/*  53 */     arrayOfSpacyTokenInfo[23] = new SpacyTokenInfo("Feb.", null, null, "Februar", 6, null);
/*  54 */     arrayOfSpacyTokenInfo[24] = new SpacyTokenInfo("Fr.", null, null, "Frau", 6, null);
/*  55 */     arrayOfSpacyTokenInfo[25] = new SpacyTokenInfo("Frl.", null, null, "Fräulein", 6, null);
/*  56 */     arrayOfSpacyTokenInfo[26] = new SpacyTokenInfo("Hbf.", null, null, "Hauptbahnhof", 6, null);
/*  57 */     arrayOfSpacyTokenInfo[27] = new SpacyTokenInfo("Hr.", null, null, "Herr", 6, null);
/*  58 */     arrayOfSpacyTokenInfo[28] = new SpacyTokenInfo("Hrn.", null, null, "Herrn", 6, null);
/*  59 */     arrayOfSpacyTokenInfo[29] = new SpacyTokenInfo("Jan.", null, null, "Januar", 6, null);
/*  60 */     arrayOfSpacyTokenInfo[30] = new SpacyTokenInfo("Jh.", null, null, "Jahrhundert", 6, null);
/*  61 */     arrayOfSpacyTokenInfo[31] = new SpacyTokenInfo("Jhd.", null, null, "Jahrhundert", 6, null);
/*  62 */     arrayOfSpacyTokenInfo[32] = new SpacyTokenInfo("Jul.", null, null, "Juli", 6, null);
/*  63 */     arrayOfSpacyTokenInfo[33] = new SpacyTokenInfo("Jun.", null, null, "Juni", 6, null);
/*  64 */     arrayOfSpacyTokenInfo[34] = new SpacyTokenInfo("Mi.", null, null, "Mittwoch", 6, null);
/*  65 */     arrayOfSpacyTokenInfo[35] = new SpacyTokenInfo("Mio.", null, null, "Million", 6, null);
/*  66 */     arrayOfSpacyTokenInfo[36] = new SpacyTokenInfo("Mo.", null, null, "Montag", 6, null);
/*  67 */     arrayOfSpacyTokenInfo[37] = new SpacyTokenInfo("Mrd.", null, null, "Milliarde", 6, null);
/*  68 */     arrayOfSpacyTokenInfo[38] = new SpacyTokenInfo("Mrz.", null, null, "März", 6, null);
/*  69 */     arrayOfSpacyTokenInfo[39] = new SpacyTokenInfo("MwSt.", null, null, "Mehrwertsteuer", 6, null);
/*  70 */     arrayOfSpacyTokenInfo[40] = new SpacyTokenInfo("Mär.", null, null, "März", 6, null);
/*  71 */     arrayOfSpacyTokenInfo[41] = new SpacyTokenInfo("Nov.", null, null, "November", 6, null);
/*  72 */     arrayOfSpacyTokenInfo[42] = new SpacyTokenInfo("Nr.", null, null, "Nummer", 6, null);
/*  73 */     arrayOfSpacyTokenInfo[43] = new SpacyTokenInfo("Okt.", null, null, "Oktober", 6, null);
/*  74 */     arrayOfSpacyTokenInfo[44] = new SpacyTokenInfo("Orig.", null, null, "Original", 6, null);
/*  75 */     arrayOfSpacyTokenInfo[45] = new SpacyTokenInfo("Pkt.", null, null, "Punkt", 6, null);
/*  76 */     arrayOfSpacyTokenInfo[46] = new SpacyTokenInfo("Prof.", null, null, "Professor", 6, null);
/*  77 */     arrayOfSpacyTokenInfo[47] = new SpacyTokenInfo("Red.", null, null, "Redaktion", 6, null);
/*  78 */     arrayOfSpacyTokenInfo[48] = new SpacyTokenInfo("Sa.", null, null, "Samstag", 6, null);
/*  79 */     arrayOfSpacyTokenInfo[49] = new SpacyTokenInfo("Sep.", null, null, "September", 6, null);
/*  80 */     arrayOfSpacyTokenInfo[50] = new SpacyTokenInfo("Sept.", null, null, "September", 6, null);
/*  81 */     arrayOfSpacyTokenInfo[51] = new SpacyTokenInfo("So.", null, null, "Sonntag", 6, null);
/*  82 */     arrayOfSpacyTokenInfo[52] = new SpacyTokenInfo("Std.", null, null, "Stunde", 6, null);
/*  83 */     arrayOfSpacyTokenInfo[53] = new SpacyTokenInfo("Str.", null, null, "Straße", 6, null);
/*  84 */     arrayOfSpacyTokenInfo[54] = new SpacyTokenInfo("Tel.", null, null, "Telefon", 6, null);
/*  85 */     arrayOfSpacyTokenInfo[55] = new SpacyTokenInfo("Tsd.", null, null, "Tausend", 6, null);
/*  86 */     arrayOfSpacyTokenInfo[56] = new SpacyTokenInfo("Univ.", null, null, "Universität", 6, null);
/*  87 */     arrayOfSpacyTokenInfo[57] = new SpacyTokenInfo("abzgl.", null, null, "abzüglich", 6, null);
/*  88 */     arrayOfSpacyTokenInfo[58] = new SpacyTokenInfo("allg.", null, null, "allgemein", 6, null);
/*  89 */     arrayOfSpacyTokenInfo[59] = new SpacyTokenInfo("bspw.", null, null, "beispielsweise", 6, null);
/*  90 */     arrayOfSpacyTokenInfo[60] = new SpacyTokenInfo("bzgl.", null, null, "bezüglich", 6, null);
/*  91 */     arrayOfSpacyTokenInfo[61] = new SpacyTokenInfo("bzw.", null, null, "beziehungsweise", 6, null);
/*  92 */     arrayOfSpacyTokenInfo[62] = new SpacyTokenInfo("d.h.", null, null, null, 14, null);
/*  93 */     arrayOfSpacyTokenInfo[63] = new SpacyTokenInfo("dgl.", null, null, "dergleichen", 6, null);
/*  94 */     arrayOfSpacyTokenInfo[64] = new SpacyTokenInfo("ebd.", null, null, "ebenda", 6, null);
/*  95 */     arrayOfSpacyTokenInfo[65] = new SpacyTokenInfo("eigtl.", null, null, "eigentlich", 6, null);
/*  96 */     arrayOfSpacyTokenInfo[66] = new SpacyTokenInfo("engl.", null, null, "englisch", 6, null);
/*  97 */     arrayOfSpacyTokenInfo[67] = new SpacyTokenInfo("evtl.", null, null, "eventuell", 6, null);
/*  98 */     arrayOfSpacyTokenInfo[68] = new SpacyTokenInfo("frz.", null, null, "französisch", 6, null);
/*  99 */     arrayOfSpacyTokenInfo[69] = new SpacyTokenInfo("gegr.", null, null, "gegründet", 6, null);
/* 100 */     arrayOfSpacyTokenInfo[70] = new SpacyTokenInfo("ggf.", null, null, "gegebenenfalls", 6, null);
/* 101 */     arrayOfSpacyTokenInfo[71] = new SpacyTokenInfo("ggfs.", null, null, "gegebenenfalls", 6, null);
/* 102 */     arrayOfSpacyTokenInfo[72] = new SpacyTokenInfo("ggü.", null, null, "gegenüber", 6, null);
/* 103 */     arrayOfSpacyTokenInfo[73] = new SpacyTokenInfo("i.O.", null, null, null, 14, null);
/* 104 */     arrayOfSpacyTokenInfo[74] = new SpacyTokenInfo("i.d.R.", null, null, null, 14, null);
/* 105 */     arrayOfSpacyTokenInfo[75] = new SpacyTokenInfo("incl.", null, null, "inklusive", 6, null);
/* 106 */     arrayOfSpacyTokenInfo[76] = new SpacyTokenInfo("inkl.", null, null, "inklusive", 6, null);
/* 107 */     arrayOfSpacyTokenInfo[77] = new SpacyTokenInfo("insb.", null, null, "insbesondere", 6, null);
/* 108 */     arrayOfSpacyTokenInfo[78] = new SpacyTokenInfo("kath.", null, null, "katholisch", 6, null);
/* 109 */     arrayOfSpacyTokenInfo[79] = new SpacyTokenInfo("lt.", null, null, "laut", 6, null);
/* 110 */     arrayOfSpacyTokenInfo[80] = new SpacyTokenInfo("max.", null, null, "maximal", 6, null);
/* 111 */     arrayOfSpacyTokenInfo[81] = new SpacyTokenInfo("min.", null, null, "minimal", 6, null);
/* 112 */     arrayOfSpacyTokenInfo[82] = new SpacyTokenInfo("mind.", null, null, "mindestens", 6, null);
/* 113 */     arrayOfSpacyTokenInfo[83] = new SpacyTokenInfo("mtl.", null, null, "monatlich", 6, null);
/* 114 */     arrayOfSpacyTokenInfo[84] = new SpacyTokenInfo("n.Chr.", null, null, null, 14, null);
/* 115 */     arrayOfSpacyTokenInfo[85] = new SpacyTokenInfo("orig.", null, null, "original", 6, null);
/* 116 */     arrayOfSpacyTokenInfo[86] = new SpacyTokenInfo("röm.", null, null, "römisch", 6, null);
/* 117 */     arrayOfSpacyTokenInfo[87] = new SpacyTokenInfo("s.o.", null, null, null, 14, null);
/* 118 */     arrayOfSpacyTokenInfo[88] = new SpacyTokenInfo("sog.", null, null, null, 14, null);
/* 119 */     arrayOfSpacyTokenInfo[89] = new SpacyTokenInfo("stellv.", null, null, null, 14, null);
/* 120 */     arrayOfSpacyTokenInfo[90] = new SpacyTokenInfo("tägl.", null, null, "täglich", 6, null);
/* 121 */     arrayOfSpacyTokenInfo[91] = new SpacyTokenInfo("u.U.", null, null, null, 14, null);
/* 122 */     arrayOfSpacyTokenInfo[92] = new SpacyTokenInfo("u.s.w.", null, null, null, 14, null);
/* 123 */     arrayOfSpacyTokenInfo[93] = new SpacyTokenInfo("u.v.m.", null, null, null, 14, null);
/* 124 */     arrayOfSpacyTokenInfo[94] = new SpacyTokenInfo("usf.", null, null, null, 14, null);
/* 125 */     arrayOfSpacyTokenInfo[95] = new SpacyTokenInfo("usw.", null, null, null, 14, null);
/* 126 */     arrayOfSpacyTokenInfo[96] = new SpacyTokenInfo("uvm.", null, null, null, 14, null);
/* 127 */     arrayOfSpacyTokenInfo[97] = new SpacyTokenInfo("v.Chr.", null, null, null, 14, null);
/* 128 */     arrayOfSpacyTokenInfo[98] = new SpacyTokenInfo("v.a.", null, null, null, 14, null);
/* 129 */     arrayOfSpacyTokenInfo[99] = new SpacyTokenInfo("v.l.n.r.", null, null, null, 14, null);
/* 130 */     arrayOfSpacyTokenInfo[100] = new SpacyTokenInfo("vgl.", null, null, "vergleiche", 6, null);
/* 131 */     arrayOfSpacyTokenInfo[101] = new SpacyTokenInfo("vllt.", null, null, "vielleicht", 6, null);
/* 132 */     arrayOfSpacyTokenInfo[102] = new SpacyTokenInfo("vlt.", null, null, "vielleicht", 6, null);
/* 133 */     arrayOfSpacyTokenInfo[103] = new SpacyTokenInfo("z.B.", null, null, null, 14, null);
/* 134 */     arrayOfSpacyTokenInfo[104] = new SpacyTokenInfo("z.Bsp.", null, null, null, 14, null);
/* 135 */     arrayOfSpacyTokenInfo[105] = new SpacyTokenInfo("z.T.", null, null, null, 14, null);
/* 136 */     arrayOfSpacyTokenInfo[106] = new SpacyTokenInfo("z.Z.", null, null, null, 14, null);
/* 137 */     arrayOfSpacyTokenInfo[107] = new SpacyTokenInfo("z.Zt.", null, null, null, 14, null);
/* 138 */     arrayOfSpacyTokenInfo[108] = new SpacyTokenInfo("z.b.", null, null, null, 14, null);
/* 139 */     arrayOfSpacyTokenInfo[109] = new SpacyTokenInfo("zzgl.", null, null, null, 14, null);
/* 140 */     arrayOfSpacyTokenInfo[110] = new SpacyTokenInfo("österr.", null, null, "österreichisch", 6, null);
/*     */     for (SpacyTokenInfo excData : CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo)) {
/* 142 */       exceptions.put(excData.getOrth(), CollectionsKt.listOf(excData));
/*     */     }
/*     */ 
/*     */     
/* 146 */     String[] arrayOfString = new String[93]; arrayOfString[0] = "``"; arrayOfString[1] = 
/* 147 */       "''";
/* 148 */     arrayOfString[2] = "A.C.";
/* 149 */     arrayOfString[3] = "a.D.";
/* 150 */     arrayOfString[4] = "A.D.";
/* 151 */     arrayOfString[5] = "A.G.";
/* 152 */     arrayOfString[6] = "a.M.";
/* 153 */     arrayOfString[7] = "a.Z.";
/* 154 */     arrayOfString[8] = "Abs.";
/* 155 */     arrayOfString[9] = "adv.";
/* 156 */     arrayOfString[10] = "al.";
/* 157 */     arrayOfString[11] = "B.A.";
/* 158 */     arrayOfString[12] = "B.Sc.";
/* 159 */     arrayOfString[13] = "betr.";
/* 160 */     arrayOfString[14] = "biol.";
/* 161 */     arrayOfString[15] = "Biol.";
/* 162 */     arrayOfString[16] = "ca.";
/* 163 */     arrayOfString[17] = "CDU/CSU";
/* 164 */     arrayOfString[18] = "Chr.";
/* 165 */     arrayOfString[19] = "Cie.";
/* 166 */     arrayOfString[20] = "c/o";
/* 167 */     arrayOfString[21] = "co.";
/* 168 */     arrayOfString[22] = "Co.";
/* 169 */     arrayOfString[23] = "d'";
/* 170 */     arrayOfString[24] = "D.C.";
/* 171 */     arrayOfString[25] = "Dipl.-Ing.";
/* 172 */     arrayOfString[26] = "Dipl.";
/* 173 */     arrayOfString[27] = "Dr.";
/* 174 */     arrayOfString[28] = "e.g.";
/* 175 */     arrayOfString[29] = "e.V.";
/* 176 */     arrayOfString[30] = "ehem.";
/* 177 */     arrayOfString[31] = "entspr.";
/* 178 */     arrayOfString[32] = "erm.";
/* 179 */     arrayOfString[33] = "etc.";
/* 180 */     arrayOfString[34] = "ev.";
/* 181 */     arrayOfString[35] = "G.m.b.H.";
/* 182 */     arrayOfString[36] = "geb.";
/* 183 */     arrayOfString[37] = "Gebr.";
/* 184 */     arrayOfString[38] = "gem.";
/* 185 */     arrayOfString[39] = "h.c.";
/* 186 */     arrayOfString[40] = "Hg.";
/* 187 */     arrayOfString[41] = "hrsg.";
/* 188 */     arrayOfString[42] = "Hrsg.";
/* 189 */     arrayOfString[43] = "i.A.";
/* 190 */     arrayOfString[44] = "i.e.";
/* 191 */     arrayOfString[45] = "i.G.";
/* 192 */     arrayOfString[46] = "i.Tr.";
/* 193 */     arrayOfString[47] = "i.V.";
/* 194 */     arrayOfString[48] = "I.";
/* 195 */     arrayOfString[49] = "II.";
/* 196 */     arrayOfString[50] = "III.";
/* 197 */     arrayOfString[51] = "IV.";
/* 198 */     arrayOfString[52] = "Inc.";
/* 199 */     arrayOfString[53] = "Ing.";
/* 200 */     arrayOfString[54] = "jr.";
/* 201 */     arrayOfString[55] = "Jr.";
/* 202 */     arrayOfString[56] = "jun.";
/* 203 */     arrayOfString[57] = "jur.";
/* 204 */     arrayOfString[58] = "K.O.";
/* 205 */     arrayOfString[59] = "L'";
/* 206 */     arrayOfString[60] = "L.A.";
/* 207 */     arrayOfString[61] = "lat.";
/* 208 */     arrayOfString[62] = "M.A.";
/* 209 */     arrayOfString[63] = "m.E.";
/* 210 */     arrayOfString[64] = "m.M.";
/* 211 */     arrayOfString[65] = "M.Sc.";
/* 212 */     arrayOfString[66] = "Mr.";
/* 213 */     arrayOfString[67] = "N.Y.";
/* 214 */     arrayOfString[68] = "N.Y.C.";
/* 215 */     arrayOfString[69] = "nat.";
/* 216 */     arrayOfString[70] = "o.a.";
/* 217 */     arrayOfString[71] = "o.ä.";
/* 218 */     arrayOfString[72] = "o.g.";
/* 219 */     arrayOfString[73] = "o.k.";
/* 220 */     arrayOfString[74] = "O.K.";
/* 221 */     arrayOfString[75] = "p.a.";
/* 222 */     arrayOfString[76] = "p.s.";
/* 223 */     arrayOfString[77] = "P.S.";
/* 224 */     arrayOfString[78] = "pers.";
/* 225 */     arrayOfString[79] = "phil.";
/* 226 */     arrayOfString[80] = "q.e.d.";
/* 227 */     arrayOfString[81] = "R.I.P.";
/* 228 */     arrayOfString[82] = "rer.";
/* 229 */     arrayOfString[83] = "sen.";
/* 230 */     arrayOfString[84] = "St.";
/* 231 */     arrayOfString[85] = "std.";
/* 232 */     arrayOfString[86] = "u.a.";
/* 233 */     arrayOfString[87] = "U.S.";
/* 234 */     arrayOfString[88] = "U.S.A.";
/* 235 */     arrayOfString[89] = "U.S.S.";
/* 236 */     arrayOfString[90] = "Vol.";
/* 237 */     arrayOfString[91] = "vs.";
/* 238 */     arrayOfString[92] = "wiss.";
/*     */     for (String orth : CollectionsKt.listOf((Object[])arrayOfString)) {
/* 240 */       exceptions.put(orth, CollectionsKt.listOf(new SpacyTokenInfo(orth, null, null, null, 14, null)));
/*     */     }
/*     */     
/* 243 */     return (Map)exceptions;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\spacy\de\SpacyGermanTokenizerExceptions.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */