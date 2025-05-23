/*     */ package ai.grazie.nlp.tokenizer.spacy.ru;
/*     */ import ai.grazie.nlp.tokenizer.spacy.SpacyTokenInfo;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\020$\n\002\020\016\n\002\020 \n\002\030\002\n\002\b\006\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\f\032\024\022\004\022\0020\005\022\n\022\b\022\004\022\0020\0070\0060\004H\002R-\020\003\032\024\022\004\022\0020\005\022\n\022\b\022\004\022\0020\0070\0060\0048FX\002¢\006\f\n\004\b\n\020\013\032\004\b\b\020\t¨\006\r"}, d2 = {"Lai/grazie/nlp/tokenizer/spacy/ru/SpacyRussianTokenizerExceptions;", "", "()V", "exceptions", "", "", "", "Lai/grazie/nlp/tokenizer/spacy/SpacyTokenInfo;", "getExceptions", "()Ljava/util/Map;", "exceptions$delegate", "Lkotlin/Lazy;", "generateException", "nlp-tokenizer"})
/*     */ public final class SpacyRussianTokenizerExceptions {
/*     */   @NotNull
/*   8 */   public static final SpacyRussianTokenizerExceptions INSTANCE = new SpacyRussianTokenizerExceptions(); @NotNull private static final Lazy exceptions$delegate = LazyKt.lazy(SpacyRussianTokenizerExceptions$exceptions$2.INSTANCE); @NotNull public final Map<String, List<SpacyTokenInfo>> getExceptions() { Lazy lazy = exceptions$delegate; return (Map<String, List<SpacyTokenInfo>>)lazy.getValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020$\n\002\020\016\n\002\020 \n\002\030\002\n\000\020\000\032\024\022\004\022\0020\002\022\n\022\b\022\004\022\0020\0040\0030\001H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "", "", "Lai/grazie/nlp/tokenizer/spacy/SpacyTokenInfo;", "invoke"})
/*   9 */   static final class SpacyRussianTokenizerExceptions$exceptions$2 extends Lambda implements Function0<Map<String, ? extends List<? extends SpacyTokenInfo>>> { public static final SpacyRussianTokenizerExceptions$exceptions$2 INSTANCE = new SpacyRussianTokenizerExceptions$exceptions$2(); public final Map<String, List<SpacyTokenInfo>> invoke() { return SpacyRussianTokenizerExceptions.INSTANCE.generateException(); }
/*     */      SpacyRussianTokenizerExceptions$exceptions$2() {
/*     */       super(0);
/*     */     } } private final Map<String, List<SpacyTokenInfo>> generateException() {
/*  13 */     HashMap<Object, Object> exceptions = new HashMap<>();
/*     */ 
/*     */ 
/*     */     
/*  17 */     SpacyTokenInfo[] arrayOfSpacyTokenInfo = new SpacyTokenInfo[28]; arrayOfSpacyTokenInfo[0] = new SpacyTokenInfo("пн", null, null, "понедельник", 6, null); arrayOfSpacyTokenInfo[1] = 
/*  18 */       new SpacyTokenInfo("вт", null, null, "вторник", 6, null);
/*  19 */     arrayOfSpacyTokenInfo[2] = new SpacyTokenInfo("ср", null, null, "среда", 6, null);
/*  20 */     arrayOfSpacyTokenInfo[3] = new SpacyTokenInfo("чт", null, null, "четверг", 6, null);
/*  21 */     arrayOfSpacyTokenInfo[4] = new SpacyTokenInfo("чтв", null, null, "четверг", 6, null);
/*  22 */     arrayOfSpacyTokenInfo[5] = new SpacyTokenInfo("пт", null, null, "пятница", 6, null);
/*  23 */     arrayOfSpacyTokenInfo[6] = new SpacyTokenInfo("сб", null, null, "суббота", 6, null);
/*  24 */     arrayOfSpacyTokenInfo[7] = new SpacyTokenInfo("сбт", null, null, "суббота", 6, null);
/*  25 */     arrayOfSpacyTokenInfo[8] = new SpacyTokenInfo("вс", null, null, "воскресенье", 6, null);
/*  26 */     arrayOfSpacyTokenInfo[9] = new SpacyTokenInfo("вскр", null, null, "воскресенье", 6, null);
/*  27 */     arrayOfSpacyTokenInfo[10] = new SpacyTokenInfo("воскр", null, null, "воскресенье", 6, null);
/*     */     
/*  29 */     arrayOfSpacyTokenInfo[11] = new SpacyTokenInfo("янв", null, null, "январь", 6, null);
/*  30 */     arrayOfSpacyTokenInfo[12] = new SpacyTokenInfo("фев", null, null, "февраль", 6, null);
/*  31 */     arrayOfSpacyTokenInfo[13] = new SpacyTokenInfo("февр", null, null, "февраль", 6, null);
/*  32 */     arrayOfSpacyTokenInfo[14] = new SpacyTokenInfo("мар", null, null, "март", 6, null);
/*     */     
/*  34 */     arrayOfSpacyTokenInfo[15] = new SpacyTokenInfo("мрт", null, null, "март", 6, null);
/*  35 */     arrayOfSpacyTokenInfo[16] = new SpacyTokenInfo("апр", null, null, "апрель", 6, null);
/*     */     
/*  37 */     arrayOfSpacyTokenInfo[17] = new SpacyTokenInfo("июн", null, null, "июнь", 6, null);
/*     */     
/*  39 */     arrayOfSpacyTokenInfo[18] = new SpacyTokenInfo("июл", null, null, "июль", 6, null);
/*     */     
/*  41 */     arrayOfSpacyTokenInfo[19] = new SpacyTokenInfo("авг", null, null, "август", 6, null);
/*  42 */     arrayOfSpacyTokenInfo[20] = new SpacyTokenInfo("сен", null, null, "сентябрь", 6, null);
/*  43 */     arrayOfSpacyTokenInfo[21] = new SpacyTokenInfo("сент", null, null, "сентябрь", 6, null);
/*  44 */     arrayOfSpacyTokenInfo[22] = new SpacyTokenInfo("окт", null, null, "октябрь", 6, null);
/*  45 */     arrayOfSpacyTokenInfo[23] = new SpacyTokenInfo("октб", null, null, "октябрь", 6, null);
/*  46 */     arrayOfSpacyTokenInfo[24] = new SpacyTokenInfo("ноя", null, null, "ноябрь", 6, null);
/*  47 */     arrayOfSpacyTokenInfo[25] = new SpacyTokenInfo("нояб", null, null, "ноябрь", 6, null);
/*  48 */     arrayOfSpacyTokenInfo[26] = new SpacyTokenInfo("нбр", null, null, "ноябрь", 6, null);
/*  49 */     arrayOfSpacyTokenInfo[27] = new SpacyTokenInfo("дек", null, null, "декабрь", 6, null);
/*     */     for (SpacyTokenInfo abbreviationExc : CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo)) {
/*  51 */       String abbrev = abbreviationExc.getOrth();
/*  52 */       String[] arrayOfString = new String[3]; arrayOfString[0] = abbrev; arrayOfString[1] = TextKt.capitalize(abbrev); Intrinsics.checkNotNullExpressionValue(abbrev.toUpperCase(Locale.ROOT), "toUpperCase(...)"); arrayOfString[2] = abbrev.toUpperCase(Locale.ROOT); for (String orth : CollectionsKt.listOf((Object[])arrayOfString)) {
/*  53 */         exceptions.put(orth, CollectionsKt.listOf(new SpacyTokenInfo(orth, null, null, abbreviationExc.getNorm(), 6, null)));
/*  54 */         exceptions.put(orth + ".", CollectionsKt.listOf(new SpacyTokenInfo(orth + ".", null, null, abbreviationExc.getNorm(), 6, null)));
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  60 */     arrayOfSpacyTokenInfo = new SpacyTokenInfo[11]; arrayOfSpacyTokenInfo[0] = new SpacyTokenInfo("2к15", null, null, "2015", 6, null); arrayOfSpacyTokenInfo[1] = 
/*  61 */       new SpacyTokenInfo("2к16", null, null, "2016", 6, null);
/*  62 */     arrayOfSpacyTokenInfo[2] = new SpacyTokenInfo("2к17", null, null, "2017", 6, null);
/*  63 */     arrayOfSpacyTokenInfo[3] = new SpacyTokenInfo("2к18", null, null, "2018", 6, null);
/*  64 */     arrayOfSpacyTokenInfo[4] = new SpacyTokenInfo("2к19", null, null, "2019", 6, null);
/*  65 */     arrayOfSpacyTokenInfo[5] = new SpacyTokenInfo("2к20", null, null, "2020", 6, null);
/*  66 */     arrayOfSpacyTokenInfo[6] = new SpacyTokenInfo("2к21", null, null, "2021", 6, null);
/*  67 */     arrayOfSpacyTokenInfo[7] = new SpacyTokenInfo("2к22", null, null, "2022", 6, null);
/*  68 */     arrayOfSpacyTokenInfo[8] = new SpacyTokenInfo("2к23", null, null, "2023", 6, null);
/*  69 */     arrayOfSpacyTokenInfo[9] = new SpacyTokenInfo("2к24", null, null, "2024", 6, null);
/*  70 */     arrayOfSpacyTokenInfo[10] = new SpacyTokenInfo("2к25", null, null, "2025", 6, null);
/*     */     for (SpacyTokenInfo abbr : CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo)) {
/*  72 */       exceptions.put(abbr.getOrth(), CollectionsKt.listOf(abbr));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  77 */     arrayOfSpacyTokenInfo = new SpacyTokenInfo[129]; arrayOfSpacyTokenInfo[0] = new SpacyTokenInfo("ак.", null, null, "академик", 6, null); arrayOfSpacyTokenInfo[1] = 
/*  78 */       new SpacyTokenInfo("акад.", null, null, "академик", 6, null);
/*  79 */     arrayOfSpacyTokenInfo[2] = new SpacyTokenInfo("д-р архитектуры", null, null, "доктор архитектуры", 6, null);
/*  80 */     arrayOfSpacyTokenInfo[3] = new SpacyTokenInfo("д-р биол. наук", null, null, "доктор биологических наук", 6, null);
/*  81 */     arrayOfSpacyTokenInfo[4] = new SpacyTokenInfo("д-р ветеринар. наук", null, null, "доктор ветеринарных наук", 6, null);
/*  82 */     arrayOfSpacyTokenInfo[5] = new SpacyTokenInfo("д-р воен. наук", null, null, "доктор военных наук", 6, null);
/*  83 */     arrayOfSpacyTokenInfo[6] = new SpacyTokenInfo("д-р геогр. наук", null, null, "доктор географических наук", 6, null);
/*  84 */     arrayOfSpacyTokenInfo[7] = new SpacyTokenInfo("д-р геол.-минерал. наук", null, null, "доктор геолого-минералогических наук", 6, null);
/*  85 */     arrayOfSpacyTokenInfo[8] = new SpacyTokenInfo("д-р искусствоведения", null, null, "доктор искусствоведения", 6, null);
/*  86 */     arrayOfSpacyTokenInfo[9] = new SpacyTokenInfo("д-р ист. наук", null, null, "доктор исторических наук", 6, null);
/*  87 */     arrayOfSpacyTokenInfo[10] = new SpacyTokenInfo("д-р культурологии", null, null, "доктор культурологии", 6, null);
/*  88 */     arrayOfSpacyTokenInfo[11] = new SpacyTokenInfo("д-р мед. наук", null, null, "доктор медицинских наук", 6, null);
/*  89 */     arrayOfSpacyTokenInfo[12] = new SpacyTokenInfo("д-р пед. наук", null, null, "доктор педагогических наук", 6, null);
/*  90 */     arrayOfSpacyTokenInfo[13] = new SpacyTokenInfo("д-р полит. наук", null, null, "доктор политических наук", 6, null);
/*  91 */     arrayOfSpacyTokenInfo[14] = new SpacyTokenInfo("д-р психол. наук", null, null, "доктор психологических наук", 6, null);
/*  92 */     arrayOfSpacyTokenInfo[15] = new SpacyTokenInfo("д-р с.-х. наук", null, null, "доктор сельскохозяйственных наук", 6, null);
/*  93 */     arrayOfSpacyTokenInfo[16] = new SpacyTokenInfo("д-р социол. наук", null, null, "доктор социологических наук", 6, null);
/*  94 */     arrayOfSpacyTokenInfo[17] = new SpacyTokenInfo("д-р техн. наук", null, null, "доктор технических наук", 6, null);
/*  95 */     arrayOfSpacyTokenInfo[18] = new SpacyTokenInfo("д-р фармацевт. наук", null, null, "доктор фармацевтических наук", 6, null);
/*  96 */     arrayOfSpacyTokenInfo[19] = new SpacyTokenInfo("д-р физ.-мат. наук", null, null, "доктор физико-математических наук", 6, null);
/*  97 */     arrayOfSpacyTokenInfo[20] = new SpacyTokenInfo("д-р филол. наук", null, null, "доктор филологических наук", 6, null);
/*  98 */     arrayOfSpacyTokenInfo[21] = new SpacyTokenInfo("д-р филос. наук", null, null, "доктор философских наук", 6, null);
/*  99 */     arrayOfSpacyTokenInfo[22] = new SpacyTokenInfo("д-р хим. наук", null, null, "доктор химических наук", 6, null);
/* 100 */     arrayOfSpacyTokenInfo[23] = new SpacyTokenInfo("д-р экон. наук", null, null, "доктор экономических наук", 6, null);
/* 101 */     arrayOfSpacyTokenInfo[24] = new SpacyTokenInfo("д-р юрид. наук", null, null, "доктор юридических наук", 6, null);
/* 102 */     arrayOfSpacyTokenInfo[25] = new SpacyTokenInfo("д-р", null, null, "доктор", 6, null);
/* 103 */     arrayOfSpacyTokenInfo[26] = new SpacyTokenInfo("д.б.н.", null, null, "доктор биологических наук", 6, null);
/* 104 */     arrayOfSpacyTokenInfo[27] = new SpacyTokenInfo("д.г.-м.н.", null, null, "доктор геолого-минералогических наук", 6, null);
/* 105 */     arrayOfSpacyTokenInfo[28] = new SpacyTokenInfo("д.г.н.", null, null, "доктор географических наук", 6, null);
/* 106 */     arrayOfSpacyTokenInfo[29] = new SpacyTokenInfo("д.и.н.", null, null, "доктор исторических наук", 6, null);
/* 107 */     arrayOfSpacyTokenInfo[30] = new SpacyTokenInfo("д.иск.", null, null, "доктор искусствоведения", 6, null);
/* 108 */     arrayOfSpacyTokenInfo[31] = new SpacyTokenInfo("д.м.н.", null, null, "доктор медицинских наук", 6, null);
/* 109 */     arrayOfSpacyTokenInfo[32] = new SpacyTokenInfo("д.п.н.", null, null, "доктор психологических наук", 6, null);
/* 110 */     arrayOfSpacyTokenInfo[33] = new SpacyTokenInfo("д.пед.н.", null, null, "доктор педагогических наук", 6, null);
/* 111 */     arrayOfSpacyTokenInfo[34] = new SpacyTokenInfo("д.полит.н.", null, null, "доктор политических наук", 6, null);
/* 112 */     arrayOfSpacyTokenInfo[35] = new SpacyTokenInfo("д.с.-х.н.", null, null, "доктор сельскохозяйственных наук", 6, null);
/* 113 */     arrayOfSpacyTokenInfo[36] = new SpacyTokenInfo("д.социол.н.", null, null, "доктор социологических наук", 6, null);
/* 114 */     arrayOfSpacyTokenInfo[37] = new SpacyTokenInfo("д.т.н.", null, null, "доктор технических наук", 6, null);
/* 115 */     arrayOfSpacyTokenInfo[38] = new SpacyTokenInfo("д.т.н", null, null, "доктор технических наук", 6, null);
/* 116 */     arrayOfSpacyTokenInfo[39] = new SpacyTokenInfo("д.ф.-м.н.", null, null, "доктор физико-математических наук", 6, null);
/* 117 */     arrayOfSpacyTokenInfo[40] = new SpacyTokenInfo("д.ф.н.", null, null, "доктор филологических наук", 6, null);
/* 118 */     arrayOfSpacyTokenInfo[41] = new SpacyTokenInfo("д.филос.н.", null, null, "доктор философских наук", 6, null);
/* 119 */     arrayOfSpacyTokenInfo[42] = new SpacyTokenInfo("д.фил.н.", null, null, "доктор филологических наук", 6, null);
/* 120 */     arrayOfSpacyTokenInfo[43] = new SpacyTokenInfo("д.х.н.", null, null, "доктор химических наук", 6, null);
/* 121 */     arrayOfSpacyTokenInfo[44] = new SpacyTokenInfo("д.э.н.", null, null, "доктор экономических наук", 6, null);
/* 122 */     arrayOfSpacyTokenInfo[45] = new SpacyTokenInfo("д.э.н", null, null, "доктор экономических наук", 6, null);
/* 123 */     arrayOfSpacyTokenInfo[46] = new SpacyTokenInfo("д.ю.н.", null, null, "доктор юридических наук", 6, null);
/* 124 */     arrayOfSpacyTokenInfo[47] = new SpacyTokenInfo("доц.", null, null, "доцент", 6, null);
/* 125 */     arrayOfSpacyTokenInfo[48] = new SpacyTokenInfo("и.о.", null, null, "исполняющий обязанности", 6, null);
/* 126 */     arrayOfSpacyTokenInfo[49] = new SpacyTokenInfo("к.б.н.", null, null, "кандидат биологических наук", 6, null);
/* 127 */     arrayOfSpacyTokenInfo[50] = new SpacyTokenInfo("к.воен.н.", null, null, "кандидат военных наук", 6, null);
/* 128 */     arrayOfSpacyTokenInfo[51] = new SpacyTokenInfo("к.г.-м.н.", null, null, "кандидат геолого-минералогических наук", 6, null);
/* 129 */     arrayOfSpacyTokenInfo[52] = new SpacyTokenInfo("к.г.н.", null, null, "кандидат географических наук", 6, null);
/* 130 */     arrayOfSpacyTokenInfo[53] = new SpacyTokenInfo("к.геогр.н", null, null, "кандидат географических наук", 6, null);
/* 131 */     arrayOfSpacyTokenInfo[54] = new SpacyTokenInfo("к.геогр.наук", null, null, "кандидат географических наук", 6, null);
/* 132 */     arrayOfSpacyTokenInfo[55] = new SpacyTokenInfo("к.и.н.", null, null, "кандидат исторических наук", 6, null);
/* 133 */     arrayOfSpacyTokenInfo[56] = new SpacyTokenInfo("к.иск.", null, null, "кандидат искусствоведения", 6, null);
/* 134 */     arrayOfSpacyTokenInfo[57] = new SpacyTokenInfo("к.м.н.", null, null, "кандидат медицинских наук", 6, null);
/* 135 */     arrayOfSpacyTokenInfo[58] = new SpacyTokenInfo("к.п.н.", null, null, "кандидат психологических наук", 6, null);
/* 136 */     arrayOfSpacyTokenInfo[59] = new SpacyTokenInfo("к.псх.н.", null, null, "кандидат психологических наук", 6, null);
/* 137 */     arrayOfSpacyTokenInfo[60] = new SpacyTokenInfo("к.пед.н.", null, null, "кандидат педагогических наук", 6, null);
/* 138 */     arrayOfSpacyTokenInfo[61] = new SpacyTokenInfo("канд.пед.наук", null, null, "кандидат педагогических наук", 6, null);
/* 139 */     arrayOfSpacyTokenInfo[62] = new SpacyTokenInfo("к.полит.н.", null, null, "кандидат политических наук", 6, null);
/* 140 */     arrayOfSpacyTokenInfo[63] = new SpacyTokenInfo("к.с.-х.н.", null, null, "кандидат сельскохозяйственных наук", 6, null);
/* 141 */     arrayOfSpacyTokenInfo[64] = new SpacyTokenInfo("к.социол.н.", null, null, "кандидат социологических наук", 6, null);
/* 142 */     arrayOfSpacyTokenInfo[65] = new SpacyTokenInfo("к.с.н.", null, null, "кандидат социологических наук", 6, null);
/* 143 */     arrayOfSpacyTokenInfo[66] = new SpacyTokenInfo("к.т.н.", null, null, "кандидат технических наук", 6, null);
/* 144 */     arrayOfSpacyTokenInfo[67] = new SpacyTokenInfo("к.ф.-м.н.", null, null, "кандидат физико-математических наук", 6, null);
/* 145 */     arrayOfSpacyTokenInfo[68] = new SpacyTokenInfo("к.ф.н.", null, null, "кандидат филологических наук", 6, null);
/* 146 */     arrayOfSpacyTokenInfo[69] = new SpacyTokenInfo("к.фил.н.", null, null, "кандидат филологических наук", 6, null);
/* 147 */     arrayOfSpacyTokenInfo[70] = new SpacyTokenInfo("к.филол.н", null, null, "кандидат филологических наук", 6, null);
/* 148 */     arrayOfSpacyTokenInfo[71] = new SpacyTokenInfo("к.фарм.наук", null, null, "кандидат фармакологических наук", 6, null);
/* 149 */     arrayOfSpacyTokenInfo[72] = new SpacyTokenInfo("к.фарм.н.", null, null, "кандидат фармакологических наук", 6, null);
/* 150 */     arrayOfSpacyTokenInfo[73] = new SpacyTokenInfo("к.фарм.н", null, null, "кандидат фармакологических наук", 6, null);
/* 151 */     arrayOfSpacyTokenInfo[74] = new SpacyTokenInfo("к.филос.наук", null, null, "кандидат философских наук", 6, null);
/* 152 */     arrayOfSpacyTokenInfo[75] = new SpacyTokenInfo("к.филос.н.", null, null, "кандидат философских наук", 6, null);
/* 153 */     arrayOfSpacyTokenInfo[76] = new SpacyTokenInfo("к.филос.н", null, null, "кандидат философских наук", 6, null);
/* 154 */     arrayOfSpacyTokenInfo[77] = new SpacyTokenInfo("к.х.н.", null, null, "кандидат химических наук", 6, null);
/* 155 */     arrayOfSpacyTokenInfo[78] = new SpacyTokenInfo("к.х.н", null, null, "кандидат химических наук", 6, null);
/* 156 */     arrayOfSpacyTokenInfo[79] = new SpacyTokenInfo("к.э.н.", null, null, "кандидат экономических наук", 6, null);
/* 157 */     arrayOfSpacyTokenInfo[80] = new SpacyTokenInfo("к.э.н", null, null, "кандидат экономических наук", 6, null);
/* 158 */     arrayOfSpacyTokenInfo[81] = new SpacyTokenInfo("к.ю.н.", null, null, "кандидат юридических наук", 6, null);
/* 159 */     arrayOfSpacyTokenInfo[82] = new SpacyTokenInfo("к.ю.н", null, null, "кандидат юридических наук", 6, null);
/* 160 */     arrayOfSpacyTokenInfo[83] = new SpacyTokenInfo("канд. архитектуры", null, null, "кандидат архитектуры", 6, null);
/* 161 */     arrayOfSpacyTokenInfo[84] = new SpacyTokenInfo("канд. биол. наук", null, null, "кандидат биологических наук", 6, null);
/* 162 */     arrayOfSpacyTokenInfo[85] = new SpacyTokenInfo("канд. ветеринар. наук", null, null, "кандидат ветеринарных наук", 6, null);
/* 163 */     arrayOfSpacyTokenInfo[86] = new SpacyTokenInfo("канд. воен. наук", null, null, "кандидат военных наук", 6, null);
/* 164 */     arrayOfSpacyTokenInfo[87] = new SpacyTokenInfo("канд. геогр. наук", null, null, "кандидат географических наук", 6, null);
/* 165 */     arrayOfSpacyTokenInfo[88] = new SpacyTokenInfo("канд. геол.-минерал. наук", null, null, "кандидат геолого-минералогических наук", 6, null);
/* 166 */     arrayOfSpacyTokenInfo[89] = new SpacyTokenInfo("канд. искусствоведения", null, null, "кандидат искусствоведения", 6, null);
/* 167 */     arrayOfSpacyTokenInfo[90] = new SpacyTokenInfo("канд. ист. наук", null, null, "кандидат исторических наук", 6, null);
/* 168 */     arrayOfSpacyTokenInfo[91] = new SpacyTokenInfo("к.ист.н.", null, null, "кандидат исторических наук", 6, null);
/* 169 */     arrayOfSpacyTokenInfo[92] = new SpacyTokenInfo("канд. культурологии", null, null, "кандидат культурологии", 6, null);
/* 170 */     arrayOfSpacyTokenInfo[93] = new SpacyTokenInfo("канд. мед. наук", null, null, "кандидат медицинских наук", 6, null);
/* 171 */     arrayOfSpacyTokenInfo[94] = new SpacyTokenInfo("канд. пед. наук", null, null, "кандидат педагогических наук", 6, null);
/* 172 */     arrayOfSpacyTokenInfo[95] = new SpacyTokenInfo("канд. полит. наук", null, null, "кандидат политических наук", 6, null);
/* 173 */     arrayOfSpacyTokenInfo[96] = new SpacyTokenInfo("канд. психол. наук", null, null, "кандидат психологических наук", 6, null);
/* 174 */     arrayOfSpacyTokenInfo[97] = new SpacyTokenInfo("канд. с.-х. наук", null, null, "кандидат сельскохозяйственных наук", 6, null);
/* 175 */     arrayOfSpacyTokenInfo[98] = new SpacyTokenInfo("канд. социол. наук", null, null, "кандидат социологических наук", 6, null);
/* 176 */     arrayOfSpacyTokenInfo[99] = new SpacyTokenInfo("к.соц.наук", null, null, "кандидат социологических наук", 6, null);
/* 177 */     arrayOfSpacyTokenInfo[100] = new SpacyTokenInfo("к.соц.н.", null, null, "кандидат социологических наук", 6, null);
/* 178 */     arrayOfSpacyTokenInfo[101] = new SpacyTokenInfo("к.соц.н", null, null, "кандидат социологических наук", 6, null);
/* 179 */     arrayOfSpacyTokenInfo[102] = new SpacyTokenInfo("канд. техн. наук", null, null, "кандидат технических наук", 6, null);
/* 180 */     arrayOfSpacyTokenInfo[103] = new SpacyTokenInfo("канд. фармацевт. наук", null, null, "кандидат фармацевтических наук", 6, null);
/* 181 */     arrayOfSpacyTokenInfo[104] = new SpacyTokenInfo("канд. физ.-мат. наук", null, null, "кандидат физико-математических наук", 6, null);
/* 182 */     arrayOfSpacyTokenInfo[105] = new SpacyTokenInfo("канд. филол. наук", null, null, "кандидат филологических наук", 6, null);
/* 183 */     arrayOfSpacyTokenInfo[106] = new SpacyTokenInfo("канд. филос. наук", null, null, "кандидат философских наук", 6, null);
/* 184 */     arrayOfSpacyTokenInfo[107] = new SpacyTokenInfo("канд. хим. наук", null, null, "кандидат химических наук", 6, null);
/* 185 */     arrayOfSpacyTokenInfo[108] = new SpacyTokenInfo("канд. экон. наук", null, null, "кандидат экономических наук", 6, null);
/* 186 */     arrayOfSpacyTokenInfo[109] = new SpacyTokenInfo("канд. юрид. наук", null, null, "кандидат юридических наук", 6, null);
/* 187 */     arrayOfSpacyTokenInfo[110] = new SpacyTokenInfo("в.н.с.", null, null, "ведущий научный сотрудник", 6, null);
/* 188 */     arrayOfSpacyTokenInfo[111] = new SpacyTokenInfo("мл. науч. сотр.", null, null, "младший научный сотрудник", 6, null);
/* 189 */     arrayOfSpacyTokenInfo[112] = new SpacyTokenInfo("м.н.с.", null, null, "младший научный сотрудник", 6, null);
/* 190 */     arrayOfSpacyTokenInfo[113] = new SpacyTokenInfo("проф.", null, null, "профессор", 6, null);
/* 191 */     arrayOfSpacyTokenInfo[114] = new SpacyTokenInfo("профессор.кафедры", null, null, "профессор кафедры", 6, null);
/* 192 */     arrayOfSpacyTokenInfo[115] = new SpacyTokenInfo("ст. науч. сотр.", null, null, "старший научный сотрудник", 6, null);
/* 193 */     arrayOfSpacyTokenInfo[116] = new SpacyTokenInfo("чл.-к.", null, null, "член корреспондент", 6, null);
/* 194 */     arrayOfSpacyTokenInfo[117] = new SpacyTokenInfo("чл.-корр.", null, null, "член-корреспондент", 6, null);
/* 195 */     arrayOfSpacyTokenInfo[118] = new SpacyTokenInfo("чл.-кор.", null, null, "член-корреспондент", 6, null);
/* 196 */     arrayOfSpacyTokenInfo[119] = new SpacyTokenInfo("дир.", null, null, "директор", 6, null);
/* 197 */     arrayOfSpacyTokenInfo[120] = new SpacyTokenInfo("зам. дир.", null, null, "заместитель директора", 6, null);
/* 198 */     arrayOfSpacyTokenInfo[121] = new SpacyTokenInfo("зав. каф.", null, null, "заведующий кафедрой", 6, null);
/* 199 */     arrayOfSpacyTokenInfo[122] = new SpacyTokenInfo("зав.кафедрой", null, null, "заведующий кафедрой", 6, null);
/* 200 */     arrayOfSpacyTokenInfo[123] = new SpacyTokenInfo("зав. кафедрой", null, null, "заведующий кафедрой", 6, null);
/* 201 */     arrayOfSpacyTokenInfo[124] = new SpacyTokenInfo("асп.", null, null, "аспирант", 6, null);
/* 202 */     arrayOfSpacyTokenInfo[125] = new SpacyTokenInfo("гл. науч. сотр.", null, null, "главный научный сотрудник", 6, null);
/* 203 */     arrayOfSpacyTokenInfo[126] = new SpacyTokenInfo("вед. науч. сотр.", null, null, "ведущий научный сотрудник", 6, null);
/* 204 */     arrayOfSpacyTokenInfo[127] = new SpacyTokenInfo("науч. сотр.", null, null, "научный сотрудник", 6, null);
/* 205 */     arrayOfSpacyTokenInfo[128] = new SpacyTokenInfo("к.м.с.", null, null, "кандидат в мастера спорта", 6, null);
/*     */     for (SpacyTokenInfo abbr : CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo)) {
/* 207 */       exceptions.put(abbr.getOrth(), CollectionsKt.listOf(abbr));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 212 */     arrayOfSpacyTokenInfo = new SpacyTokenInfo[10]; arrayOfSpacyTokenInfo[0] = new SpacyTokenInfo("и т.д.", null, null, "и так далее", 6, null); arrayOfSpacyTokenInfo[1] = 
/* 213 */       new SpacyTokenInfo("и т.п.", null, null, "и тому подобное", 6, null);
/* 214 */     arrayOfSpacyTokenInfo[2] = new SpacyTokenInfo("т.д.", null, null, "так далее", 6, null);
/* 215 */     arrayOfSpacyTokenInfo[3] = new SpacyTokenInfo("т.п.", null, null, "тому подобное", 6, null);
/* 216 */     arrayOfSpacyTokenInfo[4] = new SpacyTokenInfo("т.е.", null, null, "то есть", 6, null);
/* 217 */     arrayOfSpacyTokenInfo[5] = new SpacyTokenInfo("т.к.", null, null, "так как", 6, null);
/* 218 */     arrayOfSpacyTokenInfo[6] = new SpacyTokenInfo("в т.ч.", null, null, "в том числе", 6, null);
/* 219 */     arrayOfSpacyTokenInfo[7] = new SpacyTokenInfo("и пр.", null, null, "и прочие", 6, null);
/* 220 */     arrayOfSpacyTokenInfo[8] = new SpacyTokenInfo("и др.", null, null, "и другие", 6, null);
/* 221 */     arrayOfSpacyTokenInfo[9] = new SpacyTokenInfo("т.н.", null, null, "так называемый", 6, null);
/*     */     for (SpacyTokenInfo abbr : CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo)) {
/* 223 */       exceptions.put(abbr.getOrth(), CollectionsKt.listOf(abbr));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 228 */     arrayOfSpacyTokenInfo = new SpacyTokenInfo[4]; arrayOfSpacyTokenInfo[0] = new SpacyTokenInfo("г-н", null, null, "господин", 6, null); arrayOfSpacyTokenInfo[1] = 
/* 229 */       new SpacyTokenInfo("г-да", null, null, "господа", 6, null);
/* 230 */     arrayOfSpacyTokenInfo[2] = new SpacyTokenInfo("г-жа", null, null, "госпожа", 6, null);
/* 231 */     arrayOfSpacyTokenInfo[3] = new SpacyTokenInfo("тов.", null, null, "товарищ", 6, null);
/*     */     for (SpacyTokenInfo abbr : CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo)) {
/* 233 */       exceptions.put(abbr.getOrth(), CollectionsKt.listOf(abbr));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 238 */     arrayOfSpacyTokenInfo = new SpacyTokenInfo[8]; arrayOfSpacyTokenInfo[0] = new SpacyTokenInfo("до н.э.", null, null, "до нашей эры", 6, null); arrayOfSpacyTokenInfo[1] = 
/* 239 */       new SpacyTokenInfo("по н.в.", null, null, "по настоящее время", 6, null);
/* 240 */     arrayOfSpacyTokenInfo[2] = new SpacyTokenInfo("в н.в.", null, null, "в настоящее время", 6, null);
/* 241 */     arrayOfSpacyTokenInfo[3] = new SpacyTokenInfo("наст.", null, null, "настоящий", 6, null);
/* 242 */     arrayOfSpacyTokenInfo[4] = new SpacyTokenInfo("наст. время", null, null, "настоящее время", 6, null);
/* 243 */     arrayOfSpacyTokenInfo[5] = new SpacyTokenInfo("г.г.", null, null, "годы", 6, null);
/* 244 */     arrayOfSpacyTokenInfo[6] = new SpacyTokenInfo("гг.", null, null, "годы", 6, null);
/* 245 */     arrayOfSpacyTokenInfo[7] = new SpacyTokenInfo("т.г.", null, null, "текущий год", 6, null);
/*     */     for (SpacyTokenInfo abbr : CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo)) {
/* 247 */       exceptions.put(abbr.getOrth(), CollectionsKt.listOf(abbr));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 252 */     arrayOfSpacyTokenInfo = new SpacyTokenInfo[128]; arrayOfSpacyTokenInfo[0] = new SpacyTokenInfo("респ.", null, null, "республика", 6, null); arrayOfSpacyTokenInfo[1] = 
/* 253 */       new SpacyTokenInfo("обл.", null, null, "область", 6, null);
/* 254 */     arrayOfSpacyTokenInfo[2] = new SpacyTokenInfo("г.ф.з.", null, null, "город федерального значения", 6, null);
/* 255 */     arrayOfSpacyTokenInfo[3] = new SpacyTokenInfo("а.обл.", null, null, "автономная область", 6, null);
/* 256 */     arrayOfSpacyTokenInfo[4] = new SpacyTokenInfo("а.окр.", null, null, "автономный округ", 6, null);
/* 257 */     arrayOfSpacyTokenInfo[5] = new SpacyTokenInfo("м.р-н", null, null, "муниципальный район", 6, null);
/* 258 */     arrayOfSpacyTokenInfo[6] = new SpacyTokenInfo("г.о.", null, null, "городской округ", 6, null);
/* 259 */     arrayOfSpacyTokenInfo[7] = new SpacyTokenInfo("г.п.", null, null, "городское поселение", 6, null);
/* 260 */     arrayOfSpacyTokenInfo[8] = new SpacyTokenInfo("с.п.", null, null, "сельское поселение", 6, null);
/* 261 */     arrayOfSpacyTokenInfo[9] = new SpacyTokenInfo("вн.р-н", null, null, "внутригородской район", 6, null);
/* 262 */     arrayOfSpacyTokenInfo[10] = new SpacyTokenInfo("вн.тер.г.", null, null, "внутригородская территория города", 6, null);
/* 263 */     arrayOfSpacyTokenInfo[11] = new SpacyTokenInfo("пос.", null, null, "поселение", 6, null);
/* 264 */     arrayOfSpacyTokenInfo[12] = new SpacyTokenInfo("р-н", null, null, "район", 6, null);
/* 265 */     arrayOfSpacyTokenInfo[13] = new SpacyTokenInfo("с/с", null, null, "сельсовет", 6, null);
/* 266 */     arrayOfSpacyTokenInfo[14] = new SpacyTokenInfo("г.", null, null, "город", 6, null);
/* 267 */     arrayOfSpacyTokenInfo[15] = new SpacyTokenInfo("п.г.т.", null, null, "поселок городского типа", 6, null);
/* 268 */     arrayOfSpacyTokenInfo[16] = new SpacyTokenInfo("пгт.", null, null, "поселок городского типа", 6, null);
/* 269 */     arrayOfSpacyTokenInfo[17] = new SpacyTokenInfo("р.п.", null, null, "рабочий поселок", 6, null);
/* 270 */     arrayOfSpacyTokenInfo[18] = new SpacyTokenInfo("рп.", null, null, "рабочий поселок", 6, null);
/* 271 */     arrayOfSpacyTokenInfo[19] = new SpacyTokenInfo("кп.", null, null, "курортный поселок", 6, null);
/* 272 */     arrayOfSpacyTokenInfo[20] = new SpacyTokenInfo("гп.", null, null, "городской поселок", 6, null);
/* 273 */     arrayOfSpacyTokenInfo[21] = new SpacyTokenInfo("п.", null, null, "поселок", 6, null);
/* 274 */     arrayOfSpacyTokenInfo[22] = new SpacyTokenInfo("в-ки", null, null, "выселки", 6, null);
/* 275 */     arrayOfSpacyTokenInfo[23] = new SpacyTokenInfo("г-к", null, null, "городок", 6, null);
/* 276 */     arrayOfSpacyTokenInfo[24] = new SpacyTokenInfo("з-ка", null, null, "заимка", 6, null);
/* 277 */     arrayOfSpacyTokenInfo[25] = new SpacyTokenInfo("п-к", null, null, "починок", 6, null);
/* 278 */     arrayOfSpacyTokenInfo[26] = new SpacyTokenInfo("киш.", null, null, "кишлак", 6, null);
/* 279 */     arrayOfSpacyTokenInfo[27] = new SpacyTokenInfo("п. ст. ", null, null, "поселок станция", 6, null);
/* 280 */     arrayOfSpacyTokenInfo[28] = new SpacyTokenInfo("п. ж/д ст. ", null, null, "поселок при железнодорожной станции", 6, null);
/* 281 */     arrayOfSpacyTokenInfo[29] = new SpacyTokenInfo("ж/д бл-ст", null, null, "железнодорожный блокпост", 6, null);
/* 282 */     arrayOfSpacyTokenInfo[30] = new SpacyTokenInfo("ж/д б-ка", null, null, "железнодорожная будка", 6, null);
/* 283 */     arrayOfSpacyTokenInfo[31] = new SpacyTokenInfo("ж/д в-ка", null, null, "железнодорожная ветка", 6, null);
/* 284 */     arrayOfSpacyTokenInfo[32] = new SpacyTokenInfo("ж/д к-ма", null, null, "железнодорожная казарма", 6, null);
/* 285 */     arrayOfSpacyTokenInfo[33] = new SpacyTokenInfo("ж/д к-т", null, null, "железнодорожный комбинат", 6, null);
/* 286 */     arrayOfSpacyTokenInfo[34] = new SpacyTokenInfo("ж/д пл-ма", null, null, "железнодорожная платформа", 6, null);
/* 287 */     arrayOfSpacyTokenInfo[35] = new SpacyTokenInfo("ж/д пл-ка", null, null, "железнодорожная площадка", 6, null);
/* 288 */     arrayOfSpacyTokenInfo[36] = new SpacyTokenInfo("ж/д п.п.", null, null, "железнодорожный путевой пост", 6, null);
/* 289 */     arrayOfSpacyTokenInfo[37] = new SpacyTokenInfo("ж/д о.п.", null, null, "железнодорожный остановочный пункт", 6, null);
/* 290 */     arrayOfSpacyTokenInfo[38] = new SpacyTokenInfo("ж/д рзд.", null, null, "железнодорожный разъезд", 6, null);
/* 291 */     arrayOfSpacyTokenInfo[39] = new SpacyTokenInfo("ж/д ст. ", null, null, "железнодорожная станция", 6, null);
/* 292 */     arrayOfSpacyTokenInfo[40] = new SpacyTokenInfo("м-ко", null, null, "местечко", 6, null);
/* 293 */     arrayOfSpacyTokenInfo[41] = new SpacyTokenInfo("д.", null, null, "деревня", 6, null);
/* 294 */     arrayOfSpacyTokenInfo[42] = new SpacyTokenInfo("с.", null, null, "село", 6, null);
/* 295 */     arrayOfSpacyTokenInfo[43] = new SpacyTokenInfo("сл.", null, null, "слобода", 6, null);
/* 296 */     arrayOfSpacyTokenInfo[44] = new SpacyTokenInfo("ст. ", null, null, "станция", 6, null);
/* 297 */     arrayOfSpacyTokenInfo[45] = new SpacyTokenInfo("ст-ца", null, null, "станица", 6, null);
/* 298 */     arrayOfSpacyTokenInfo[46] = new SpacyTokenInfo("у.", null, null, "улус", 6, null);
/* 299 */     arrayOfSpacyTokenInfo[47] = new SpacyTokenInfo("х.", null, null, "хутор", 6, null);
/* 300 */     arrayOfSpacyTokenInfo[48] = new SpacyTokenInfo("рзд.", null, null, "разъезд", 6, null);
/* 301 */     arrayOfSpacyTokenInfo[49] = new SpacyTokenInfo("зим.", null, null, "зимовье", 6, null);
/* 302 */     arrayOfSpacyTokenInfo[50] = new SpacyTokenInfo("б-г", null, null, "берег", 6, null);
/* 303 */     arrayOfSpacyTokenInfo[51] = new SpacyTokenInfo("ж/р", null, null, "жилой район", 6, null);
/* 304 */     arrayOfSpacyTokenInfo[52] = new SpacyTokenInfo("кв-л", null, null, "квартал", 6, null);
/* 305 */     arrayOfSpacyTokenInfo[53] = new SpacyTokenInfo("мкр.", null, null, "микрорайон", 6, null);
/* 306 */     arrayOfSpacyTokenInfo[54] = new SpacyTokenInfo("ост-в", null, null, "остров", 6, null);
/* 307 */     arrayOfSpacyTokenInfo[55] = new SpacyTokenInfo("платф.", null, null, "платформа", 6, null);
/* 308 */     arrayOfSpacyTokenInfo[56] = new SpacyTokenInfo("п/р", null, null, "промышленный район", 6, null);
/* 309 */     arrayOfSpacyTokenInfo[57] = new SpacyTokenInfo("р-н", null, null, "район", 6, null);
/* 310 */     arrayOfSpacyTokenInfo[58] = new SpacyTokenInfo("тер.", null, null, "территория", 6, null);
/* 311 */     arrayOfSpacyTokenInfo[59] = new SpacyTokenInfo(
/* 312 */         "тер. СНО", null, null, 
/* 313 */         "территория садоводческих некоммерческих объединений граждан", 6, null);
/*     */     
/* 315 */     arrayOfSpacyTokenInfo[60] = new SpacyTokenInfo(
/* 316 */         "тер. ОНО", null, null, 
/* 317 */         "территория огороднических некоммерческих объединений граждан", 6, null);
/*     */     
/* 319 */     arrayOfSpacyTokenInfo[61] = new SpacyTokenInfo("тер. ДНО", null, null, "территория дачных некоммерческих объединений граждан", 6, null);
/* 320 */     arrayOfSpacyTokenInfo[62] = new SpacyTokenInfo("тер. СНТ", null, null, "территория садоводческих некоммерческих товариществ", 6, null);
/* 321 */     arrayOfSpacyTokenInfo[63] = new SpacyTokenInfo("тер. ОНТ", null, null, "территория огороднических некоммерческих товариществ", 6, null);
/* 322 */     arrayOfSpacyTokenInfo[64] = new SpacyTokenInfo("тер. ДНТ", null, null, "территория дачных некоммерческих товариществ", 6, null);
/* 323 */     arrayOfSpacyTokenInfo[65] = new SpacyTokenInfo("тер. СПК", null, null, "территория садоводческих потребительских кооперативов", 6, null);
/* 324 */     arrayOfSpacyTokenInfo[66] = new SpacyTokenInfo("тер. ОПК", null, null, "территория огороднических потребительских кооперативов", 6, null);
/* 325 */     arrayOfSpacyTokenInfo[67] = new SpacyTokenInfo("тер. ДПК", null, null, "территория дачных потребительских кооперативов", 6, null);
/* 326 */     arrayOfSpacyTokenInfo[68] = new SpacyTokenInfo("тер. СНП", null, null, "территория садоводческих некоммерческих партнерств", 6, null);
/* 327 */     arrayOfSpacyTokenInfo[69] = new SpacyTokenInfo("тер. ОНП", null, null, "территория огороднических некоммерческих партнерств", 6, null);
/* 328 */     arrayOfSpacyTokenInfo[70] = new SpacyTokenInfo("тер. ДНП", null, null, "территория дачных некоммерческих партнерств", 6, null);
/* 329 */     arrayOfSpacyTokenInfo[71] = new SpacyTokenInfo("тер. ТСН", null, null, "территория товарищества собственников недвижимости", 6, null);
/* 330 */     arrayOfSpacyTokenInfo[72] = new SpacyTokenInfo("тер. ГСК", null, null, "территория гаражно-строительного кооператива", 6, null);
/* 331 */     arrayOfSpacyTokenInfo[73] = new SpacyTokenInfo("ус.", null, null, "усадьба", 6, null);
/* 332 */     arrayOfSpacyTokenInfo[74] = new SpacyTokenInfo("тер.ф.х.", null, null, "территория фермерского хозяйства", 6, null);
/* 333 */     arrayOfSpacyTokenInfo[75] = new SpacyTokenInfo("ю.", null, null, "юрты", 6, null);
/* 334 */     arrayOfSpacyTokenInfo[76] = new SpacyTokenInfo("ал.", null, null, "аллея", 6, null);
/* 335 */     arrayOfSpacyTokenInfo[77] = new SpacyTokenInfo("б-р", null, null, "бульвар", 6, null);
/* 336 */     arrayOfSpacyTokenInfo[78] = new SpacyTokenInfo("взв.", null, null, "взвоз", 6, null);
/* 337 */     arrayOfSpacyTokenInfo[79] = new SpacyTokenInfo("взд.", null, null, "въезд", 6, null);
/* 338 */     arrayOfSpacyTokenInfo[80] = new SpacyTokenInfo("дор.", null, null, "дорога", 6, null);
/* 339 */     arrayOfSpacyTokenInfo[81] = new SpacyTokenInfo("ззд.", null, null, "заезд", 6, null);
/* 340 */     arrayOfSpacyTokenInfo[82] = new SpacyTokenInfo("км", null, null, "километр", 6, null);
/* 341 */     arrayOfSpacyTokenInfo[83] = new SpacyTokenInfo("к-цо", null, null, "кольцо", 6, null);
/* 342 */     arrayOfSpacyTokenInfo[84] = new SpacyTokenInfo("лн.", null, null, "линия", 6, null);
/* 343 */     arrayOfSpacyTokenInfo[85] = new SpacyTokenInfo("мгстр.", null, null, "магистраль", 6, null);
/* 344 */     arrayOfSpacyTokenInfo[86] = new SpacyTokenInfo("наб.", null, null, "набережная", 6, null);
/* 345 */     arrayOfSpacyTokenInfo[87] = new SpacyTokenInfo("пер-д", null, null, "переезд", 6, null);
/* 346 */     arrayOfSpacyTokenInfo[88] = new SpacyTokenInfo("пер.", null, null, "переулок", 6, null);
/* 347 */     arrayOfSpacyTokenInfo[89] = new SpacyTokenInfo("пл-ка", null, null, "площадка", 6, null);
/* 348 */     arrayOfSpacyTokenInfo[90] = new SpacyTokenInfo("пл.", null, null, "площадь", 6, null);
/* 349 */     arrayOfSpacyTokenInfo[91] = new SpacyTokenInfo("пр-д", null, null, "проезд", 6, null);
/* 350 */     arrayOfSpacyTokenInfo[92] = new SpacyTokenInfo("пр-к", null, null, "просек", 6, null);
/* 351 */     arrayOfSpacyTokenInfo[93] = new SpacyTokenInfo("пр-ка", null, null, "просека", 6, null);
/* 352 */     arrayOfSpacyTokenInfo[94] = new SpacyTokenInfo("пр-лок", null, null, "проселок", 6, null);
/* 353 */     arrayOfSpacyTokenInfo[95] = new SpacyTokenInfo("пр-кт", null, null, "проспект", 6, null);
/* 354 */     arrayOfSpacyTokenInfo[96] = new SpacyTokenInfo("проул.", null, null, "проулок", 6, null);
/* 355 */     arrayOfSpacyTokenInfo[97] = new SpacyTokenInfo("рзд.", null, null, "разъезд", 6, null);
/* 356 */     arrayOfSpacyTokenInfo[98] = new SpacyTokenInfo("ряд", null, null, "ряд(ы)", 6, null);
/* 357 */     arrayOfSpacyTokenInfo[99] = new SpacyTokenInfo("с-р", null, null, "сквер", 6, null);
/* 358 */     arrayOfSpacyTokenInfo[100] = new SpacyTokenInfo("с-к", null, null, "спуск", 6, null);
/* 359 */     arrayOfSpacyTokenInfo[101] = new SpacyTokenInfo("сзд.", null, null, "съезд", 6, null);
/* 360 */     arrayOfSpacyTokenInfo[102] = new SpacyTokenInfo("туп.", null, null, "тупик", 6, null);
/* 361 */     arrayOfSpacyTokenInfo[103] = new SpacyTokenInfo("ул.", null, null, "улица", 6, null);
/* 362 */     arrayOfSpacyTokenInfo[104] = new SpacyTokenInfo("ш.", null, null, "шоссе", 6, null);
/* 363 */     arrayOfSpacyTokenInfo[105] = new SpacyTokenInfo("влд.", null, null, "владение", 6, null);
/* 364 */     arrayOfSpacyTokenInfo[106] = new SpacyTokenInfo("г-ж", null, null, "гараж", 6, null);
/* 365 */     arrayOfSpacyTokenInfo[107] = new SpacyTokenInfo("д.", null, null, "дом", 6, null);
/* 366 */     arrayOfSpacyTokenInfo[108] = new SpacyTokenInfo("двлд.", null, null, "домовладение", 6, null);
/* 367 */     arrayOfSpacyTokenInfo[109] = new SpacyTokenInfo("зд.", null, null, "здание", 6, null);
/* 368 */     arrayOfSpacyTokenInfo[110] = new SpacyTokenInfo("з/у", null, null, "земельный участок", 6, null);
/* 369 */     arrayOfSpacyTokenInfo[111] = new SpacyTokenInfo("кв.", null, null, "квартира", 6, null);
/* 370 */     arrayOfSpacyTokenInfo[112] = new SpacyTokenInfo("ком.", null, null, "комната", 6, null);
/* 371 */     arrayOfSpacyTokenInfo[113] = new SpacyTokenInfo("подв.", null, null, "подвал", 6, null);
/* 372 */     arrayOfSpacyTokenInfo[114] = new SpacyTokenInfo("кот.", null, null, "котельная", 6, null);
/* 373 */     arrayOfSpacyTokenInfo[115] = new SpacyTokenInfo("п-б", null, null, "погреб", 6, null);
/* 374 */     arrayOfSpacyTokenInfo[116] = new SpacyTokenInfo("к.", null, null, "корпус", 6, null);
/* 375 */     arrayOfSpacyTokenInfo[117] = new SpacyTokenInfo("ОНС", null, null, "объект незавершенного строительства", 6, null);
/* 376 */     arrayOfSpacyTokenInfo[118] = new SpacyTokenInfo("оф.", null, null, "офис", 6, null);
/* 377 */     arrayOfSpacyTokenInfo[119] = new SpacyTokenInfo("пав.", null, null, "павильон", 6, null);
/* 378 */     arrayOfSpacyTokenInfo[120] = new SpacyTokenInfo("помещ.", null, null, "помещение", 6, null);
/* 379 */     arrayOfSpacyTokenInfo[121] = new SpacyTokenInfo("раб.уч.", null, null, "рабочий участок", 6, null);
/* 380 */     arrayOfSpacyTokenInfo[122] = new SpacyTokenInfo("скл.", null, null, "склад", 6, null);
/* 381 */     arrayOfSpacyTokenInfo[123] = new SpacyTokenInfo("coop.", null, null, "сооружение", 6, null);
/* 382 */     arrayOfSpacyTokenInfo[124] = new SpacyTokenInfo("стр.", null, null, "строение", 6, null);
/* 383 */     arrayOfSpacyTokenInfo[125] = new SpacyTokenInfo("торг.зал", null, null, "торговый зал", 6, null);
/* 384 */     arrayOfSpacyTokenInfo[126] = new SpacyTokenInfo("а/п", null, null, "аэропорт", 6, null);
/* 385 */     arrayOfSpacyTokenInfo[127] = new SpacyTokenInfo("им.", null, null, "имени", 6, null);
/*     */     for (SpacyTokenInfo abbr : CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo)) {
/* 387 */       exceptions.put(abbr.getOrth(), CollectionsKt.listOf(abbr));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 392 */     arrayOfSpacyTokenInfo = new SpacyTokenInfo[13]; arrayOfSpacyTokenInfo[0] = new SpacyTokenInfo("тыс.руб.", null, null, "тысяч рублей", 6, null); arrayOfSpacyTokenInfo[1] = 
/* 393 */       new SpacyTokenInfo("тыс.", null, null, "тысяч", 6, null);
/* 394 */     arrayOfSpacyTokenInfo[2] = new SpacyTokenInfo("руб.", null, null, "рубль", 6, null);
/* 395 */     arrayOfSpacyTokenInfo[3] = new SpacyTokenInfo("долл.", null, null, "доллар", 6, null);
/* 396 */     arrayOfSpacyTokenInfo[4] = new SpacyTokenInfo("прим.", null, null, "примечание", 6, null);
/* 397 */     arrayOfSpacyTokenInfo[5] = new SpacyTokenInfo("прим.ред.", null, null, "примечание редакции", 6, null);
/* 398 */     arrayOfSpacyTokenInfo[6] = new SpacyTokenInfo("см. также", null, null, "смотри также", 6, null);
/* 399 */     arrayOfSpacyTokenInfo[7] = new SpacyTokenInfo("кв.м.", null, null, "квадрантный метр", 6, null);
/* 400 */     arrayOfSpacyTokenInfo[8] = new SpacyTokenInfo("м2", null, null, "квадрантный метр", 6, null);
/* 401 */     arrayOfSpacyTokenInfo[9] = new SpacyTokenInfo("б/у", null, null, "бывший в употреблении", 6, null);
/* 402 */     arrayOfSpacyTokenInfo[10] = new SpacyTokenInfo("сокр.", null, null, "сокращение", 6, null);
/* 403 */     arrayOfSpacyTokenInfo[11] = new SpacyTokenInfo("чел.", null, null, "человек", 6, null);
/* 404 */     arrayOfSpacyTokenInfo[12] = new SpacyTokenInfo("б.п.", null, null, "базисный пункт", 6, null);
/*     */     for (SpacyTokenInfo abbr : CollectionsKt.listOf((Object[])arrayOfSpacyTokenInfo)) {
/* 406 */       exceptions.put(abbr.getOrth(), CollectionsKt.listOf(abbr));
/*     */     }
/* 408 */     return (Map)exceptions;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\spacy\ru\SpacyRussianTokenizerExceptions.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */