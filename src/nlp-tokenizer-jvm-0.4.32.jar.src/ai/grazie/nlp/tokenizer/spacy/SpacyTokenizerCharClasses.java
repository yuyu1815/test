/*     */ package ai.grazie.nlp.tokenizer.spacy;
/*     */ 
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.text.StringsKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\025\n\002\020 \n\002\bZ\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020p\032\0020\0042\006\020q\032\0020\004H\002J\020\020r\032\0020\0042\006\020q\032\0020\004H\002J\026\020s\032\b\022\004\022\0020\0040\0322\006\020q\032\0020\004H\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\016\020\013\032\0020\004XT¢\006\002\n\000R\021\020\f\032\0020\004¢\006\b\n\000\032\004\b\r\020\006R\021\020\016\032\0020\004¢\006\b\n\000\032\004\b\017\020\006R\021\020\020\032\0020\004¢\006\b\n\000\032\004\b\021\020\006R\016\020\022\032\0020\004XT¢\006\002\n\000R\016\020\023\032\0020\004XT¢\006\002\n\000R\016\020\024\032\0020\004XT¢\006\002\n\000R\016\020\025\032\0020\004XT¢\006\002\n\000R\016\020\026\032\0020\004XT¢\006\002\n\000R\016\020\027\032\0020\004XT¢\006\002\n\000R\016\020\030\032\0020\004XT¢\006\002\n\000R\027\020\031\032\b\022\004\022\0020\0040\032¢\006\b\n\000\032\004\b\033\020\034R\027\020\035\032\b\022\004\022\0020\0040\032¢\006\b\n\000\032\004\b\036\020\034R\027\020\037\032\b\022\004\022\0020\0040\032¢\006\b\n\000\032\004\b \020\034R\027\020!\032\b\022\004\022\0020\0040\032¢\006\b\n\000\032\004\b\"\020\034R\027\020#\032\b\022\004\022\0020\0040\032¢\006\b\n\000\032\004\b$\020\034R\027\020%\032\b\022\004\022\0020\0040\032¢\006\b\n\000\032\004\b&\020\034R\027\020'\032\b\022\004\022\0020\0040\032¢\006\b\n\000\032\004\b(\020\034R\021\020)\032\0020\004¢\006\b\n\000\032\004\b*\020\006R\021\020+\032\0020\004¢\006\b\n\000\032\004\b,\020\006R\021\020-\032\0020\004¢\006\b\n\000\032\004\b.\020\006R\016\020/\032\0020\004XT¢\006\002\n\000R\016\0200\032\0020\004XT¢\006\002\n\000R\016\0201\032\0020\004XT¢\006\002\n\000R\016\0202\032\0020\004XT¢\006\002\n\000R\016\0203\032\0020\004XT¢\006\002\n\000R\016\0204\032\0020\004XT¢\006\002\n\000R\016\0205\032\0020\004XT¢\006\002\n\000R\016\0206\032\0020\004XT¢\006\002\n\000R\016\0207\032\0020\004XT¢\006\002\n\000R\016\0208\032\0020\004XT¢\006\002\n\000R\016\0209\032\0020\004XT¢\006\002\n\000R\016\020:\032\0020\004XT¢\006\002\n\000R\016\020;\032\0020\004XT¢\006\002\n\000R\016\020<\032\0020\004XT¢\006\002\n\000R\016\020=\032\0020\004XT¢\006\002\n\000R\016\020>\032\0020\004XT¢\006\002\n\000R\016\020?\032\0020\004XT¢\006\002\n\000R\016\020@\032\0020\004XT¢\006\002\n\000R\016\020A\032\0020\004XT¢\006\002\n\000R\016\020B\032\0020\004XT¢\006\002\n\000R\016\020C\032\0020\004XT¢\006\002\n\000R\016\020D\032\0020\004XT¢\006\002\n\000R\016\020E\032\0020\004XT¢\006\002\n\000R\016\020F\032\0020\004XT¢\006\002\n\000R\016\020G\032\0020\004XT¢\006\002\n\000R\016\020H\032\0020\004XT¢\006\002\n\000R\016\020I\032\0020\004XT¢\006\002\n\000R\016\020J\032\0020\004XT¢\006\002\n\000R\016\020K\032\0020\004XT¢\006\002\n\000R\016\020L\032\0020\004XT¢\006\002\n\000R\016\020M\032\0020\004XT¢\006\002\n\000R\016\020N\032\0020\004XT¢\006\002\n\000R\016\020O\032\0020\004XT¢\006\002\n\000R\016\020P\032\0020\004XT¢\006\002\n\000R\016\020Q\032\0020\004XT¢\006\002\n\000R\016\020R\032\0020\004XT¢\006\002\n\000R\016\020S\032\0020\004XT¢\006\002\n\000R\016\020T\032\0020\004XT¢\006\002\n\000R\016\020U\032\0020\004XT¢\006\002\n\000R\016\020V\032\0020\004XT¢\006\002\n\000R\016\020W\032\0020\004XT¢\006\002\n\000R\016\020X\032\0020\004XT¢\006\002\n\000R\016\020Y\032\0020\004XT¢\006\002\n\000R\016\020Z\032\0020\004XT¢\006\002\n\000R\016\020[\032\0020\004XT¢\006\002\n\000R\016\020\\\032\0020\004XT¢\006\002\n\000R\016\020]\032\0020\004XT¢\006\002\n\000R\016\020^\032\0020\004XT¢\006\002\n\000R\016\020_\032\0020\004XT¢\006\002\n\000R\016\020`\032\0020\004XT¢\006\002\n\000R\016\020a\032\0020\004XT¢\006\002\n\000R\016\020b\032\0020\004XT¢\006\002\n\000R\016\020c\032\0020\004XT¢\006\002\n\000R\016\020d\032\0020\004XT¢\006\002\n\000R\016\020e\032\0020\004XT¢\006\002\n\000R\016\020f\032\0020\004XT¢\006\002\n\000R\016\020g\032\0020\004XT¢\006\002\n\000R\016\020h\032\0020\004XT¢\006\002\n\000R\016\020i\032\0020\004XT¢\006\002\n\000R\016\020j\032\0020\004XT¢\006\002\n\000R\016\020k\032\0020\004XT¢\006\002\n\000R\016\020l\032\0020\004XT¢\006\002\n\000R\016\020m\032\0020\004XT¢\006\002\n\000R\016\020n\032\0020\004XT¢\006\002\n\000R\016\020o\032\0020\004XT¢\006\002\n\000¨\006t"}, d2 = {"Lai/grazie/nlp/tokenizer/spacy/SpacyTokenizerCharClasses;", "", "()V", "Alpha", "", "getAlpha", "()Ljava/lang/String;", "AlphaLower", "getAlphaLower", "AlphaUpper", "getAlphaUpper", "ConcanIcons", "ConcatQuotes", "getConcatQuotes", "Currency", "getCurrency", "Hyphens", "getHyphens", "Icons", "Latin", "LatinBasic", "LatinLower", "LatinLowerBasic", "LatinUpper", "LatinUpperBasic", "ListCurrency", "", "getListCurrency", "()Ljava/util/List;", "ListEllipses", "getListEllipses", "ListHyphens", "getListHyphens", "ListIcons", "getListIcons", "ListPunct", "getListPunct", "ListQuotes", "getListQuotes", "ListUnits", "getListUnits", "NonContractionConcatQuotes", "getNonContractionConcatQuotes", "Punct", "getPunct", "Units", "getUnits", "bengali", "cjk", "currency", "ethiopic", "greek", "greekLower", "greekUpper", "hangul", "hangulJamo", "hangulSyllables", "hebrew", "hindi", "hyphens", "kannada", "latinDiacritics", "latinExtendedA", "latinExtendedB", "latinExtendedC", "latinExtendedD", "latinExtendedE", "latinLowerDiacritics", "latinLowerExtendedA", "latinLowerExtendedB", "latinLowerExtendedC", "latinLowerExtendedD", "latinLowerExtendedE", "latinLowerPhonetic", "latinLowerStandard", "latinLowerSupplement", "latinLowerstandardFullwidth", "latinPhonetic", "latinStandard", "latinStandardFullwidth", "latinSupplement", "latinUpperDiacritics", "latinUpperExtendedA", "latinUpperExtendedB", "latinUpperExtendedC", "latinUpperExtendedD", "latinUpperStandard", "latinUpperStandardFullwidth", "latinUpperSupplement", "lower", "macedonian", "macedonianLower", "macedonianUpper", "nhala", "otherSymbols", "persian", "punct", "quotes", "russian", "russianLower", "russianUpper", "tamil", "tatar", "tatarLower", "tatarUpper", "telugu", "ukrainian", "ukrainianLower", "ukrainianUpper", "uncased", "units", "upper", "groupChars", "string", "mergeChars", "splitChars", "nlp-tokenizer"})
/*     */ public final class SpacyTokenizerCharClasses
/*     */ {
/*     */   @NotNull
/*     */   private static final String ethiopic = "\\u1200-\\u137F";
/*     */   @NotNull
/*     */   private static final String bengali = "\\u0980-\\u09FF";
/*     */   @NotNull
/*     */   private static final String hebrew = "\\u0591-\\u05F4\\uFB1D-\\uFB4F";
/*     */   @NotNull
/*     */   private static final String hindi = "\\u0900-\\u097F";
/*     */   @NotNull
/*     */   private static final String kannada = "\\u0C80-\\u0CFF";
/*     */   @NotNull
/*     */   private static final String tamil = "\\u0B80-\\u0BFF";
/*     */   @NotNull
/*     */   private static final String telugu = "\\u0C00-\\u0C7F";
/*     */   @NotNull
/*     */   private static final String latinUpperStandard = "A-Z";
/*     */   @NotNull
/*     */   private static final String latinLowerStandard = "a-z";
/*     */   @NotNull
/*     */   private static final String latinStandard = "A-Za-z";
/*     */   @NotNull
/*     */   private static final String latinUpperStandardFullwidth = "\\uFF21-\\uFF3A";
/*     */   @NotNull
/*     */   private static final String latinLowerstandardFullwidth = "\\uFF41-\\uFF5A";
/*     */   @NotNull
/*     */   private static final String latinStandardFullwidth = "\\uFF21-\\uFF3A\\uFF41-\\uFF5A";
/*     */   @NotNull
/*     */   private static final String latinUpperSupplement = "\\u00C0-\\u00D6\\u00D8-\\u00DE";
/*     */   @NotNull
/*     */   private static final String latinLowerSupplement = "\\u00DF-\\u00F6\\u00F8-\\u00FF";
/*     */   @NotNull
/*     */   private static final String latinSupplement = "\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u00FF";
/*     */   @NotNull
/*     */   private static final String hangulSyllables = "\\uAC00-\\uD7AF";
/*     */   @NotNull
/*     */   private static final String hangulJamo = "\\u1100-\\u11FF";
/*     */   @NotNull
/*     */   private static final String hangul = "\\uAC00-\\uD7AF\\u1100-\\u11FF";
/*     */   @NotNull
/*     */   private static final String cjk = "\\u4E00-\\u62FF\\u6300-\\u77FF\\u7800-\\u8CFF\\u8D00-\\u9FFF\\u3400-\\u4DBF\\x{00020000}-\\x{000215FF}\\x{00021600}-\\x{000230FF}\\x{00023100}-\\x{000245FF}\\x{00024600}-\\x{000260FF}\\x{00026100}-\\x{000275FF}\\x{00027600}-\\x{000290FF}\\x{00029100}-\\x{0002A6DF}\\x{0002A700}-\\x{0002B73F}\\x{0002B740}-\\x{0002B81F}\\x{0002B820}-\\x{0002CEAF}\\x{0002CEB0}-\\x{0002EBEF}\\u2E80-\\u2EFF\\u2F00-\\u2FDF\\u2FF0-\\u2FFF\\u3000-\\u303F\\u31C0-\\u31EF\\u3200-\\u32FF\\u3300-\\u33FF\\uF900-\\uFAFF\\uFE30-\\uFE4F\\x{0001F200}-\\x{0001F2FF}\\x{0002F800}-\\x{0002FA1F}";
/*     */   @NotNull
/*     */   private static final String latinUpperExtendedA = "\\u0100\\u0102\\u0104\\u0106\\u0108\\u010A\\u010C\\u010E\\u0110\\u0112\\u0114\\u0116\\u0118\\u011A\\u011C\\u011E\\u0120\\u0122\\u0124\\u0126\\u0128\\u012A\\u012C\\u012E\\u0130\\u0132\\u0134\\u0136\\u0139\\u013B\\u013D\\u013F\\u0141\\u0143\\u0145\\u0147\\u014A\\u014C\\u014E\\u0150\\u0152\\u0154\\u0156\\u0158\\u015A\\u015C\\u015E\\u0160\\u0162\\u0164\\u0166\\u0168\\u016A\\u016C\\u016E\\u0170\\u0172\\u0174\\u0176\\u0178\\u0179\\u017B\\u017D";
/*     */   @NotNull
/*     */   private static final String latinLowerExtendedA = "\\u0101\\u0103\\u0105\\u0107\\u0109\\u010B\\u010D\\u010F\\u0111\\u0113\\u0115\\u0117\\u0119\\u011B\\u011D\\u011F\\u0121\\u0123\\u0125\\u0127\\u0129\\u012B\\u012D\\u012F\\u0131\\u0133\\u0135\\u0137\\u0138\\u013A\\u013C\\u013E\\u0140\\u0142\\u0144\\u0146\\u0148\\u0149\\u014B\\u014D\\u014F\\u0151\\u0153\\u0155\\u0157\\u0159\\u015B\\u015D\\u015F\\u0161\\u0163\\u0165\\u0167\\u0169\\u016B\\u016D\\u016F\\u0171\\u0173\\u0175\\u0177\\u017A\\u017C\\u017E\\u017F";
/*     */   @NotNull
/*     */   private static final String latinExtendedA = "\\u0100-\\u017F";
/*     */   @NotNull
/*     */   private static final String latinUpperExtendedB = "\\u0181\\u0182\\u0184\\u0186\\u0187\\u0189-\\u018B\\u018E-\\u0191\\u0193\\u0194\\u0196-\\u0198\\u019C\\u019D\\u019F\\u01A0\\u01A2\\u01A4\\u01A6\\u01A7\\u01A9\\u01AC\\u01AE\\u01AF\\u01B1-\\u01B3\\u01B5\\u01B7\\u01B8\\u01BC\\u01C4\\u01C7\\u01CA\\u01CD\\u01CF\\u01D1\\u01D3\\u01D5\\u01D7\\u01D9\\u01DB\\u01DE\\u01E0\\u01E2\\u01E4\\u01E6\\u01E8\\u01EA\\u01EC\\u01EE\\u01F1\\u01F4\\u01F6-\\u01F8\\u01FA\\u01FC\\u01FE\\u0200\\u0202\\u0204\\u0206\\u0208\\u020A\\u020C\\u020E\\u0210\\u0212\\u0214\\u0216\\u0218\\u021A\\u021C\\u021E\\u0220\\u0222\\u0224\\u0226\\u0228\\u022A\\u022C\\u022E\\u0230\\u0232\\u023A\\u023B\\u023D\\u023E\\u0241\\u0243-\\u0246\\u0248\\u024A\\u024C\\u024E";
/*     */   @NotNull
/*     */   private static final String latinLowerExtendedB = "\\u0180\\u0183\\u0185\\u0188\\u018C\\u018D\\u0192\\u0195\\u0199-\\u019B\\u019E\\u01A1\\u01A3\\u01A5\\u01A8\\u01AA\\u01AB\\u01AD\\u01B0\\u01B4\\u01B6\\u01B9\\u01BA\\u01BD-\\u01BF\\u01C6\\u01C9\\u01CC\\u01CE\\u01D0\\u01D2\\u01D4\\u01D6\\u01D8\\u01DA\\u01DC\\u01DD\\u01DF\\u01E1\\u01E3\\u01E5\\u01E7\\u01E9\\u01EB\\u01ED\\u01EF\\u01F0\\u01F3\\u01F5\\u01F9\\u01FB\\u01FD\\u01FF\\u0201\\u0203\\u0205\\u0207\\u0209\\u020B\\u020D\\u020F\\u0211\\u0213\\u0215\\u0217\\u0219\\u021B\\u021D\\u021F\\u0221\\u0223\\u0225\\u0227\\u0229\\u022B\\u022D\\u022F\\u0231\\u0233-\\u0239\\u023C\\u023F\\u0240\\u0242\\u0247\\u0249\\u024B\\u024D\\u024F";
/*     */   @NotNull
/*     */   private static final String latinExtendedB = "\\u0180-\\u01BF\\u01C4-\\u024F ";
/*     */   @NotNull
/*     */   private static final String latinUpperExtendedC = "\\u2C60\\u2C62-\\u2C64\\u2C67\\u2C69\\u2C6B\\u2C6D-\\u2C70\\u2C72\\u2C75\\u2C7E\\u2C7F ";
/*     */   @NotNull
/*     */   private static final String latinLowerExtendedC = "\\u2C61\\u2C65\\u2C66\\u2C68\\u2C6A\\u2C6C\\u2C71\\u2C73\\u2C74\\u2C76-\\u2C7B ";
/*     */   @NotNull
/*     */   private static final String latinExtendedC = "\\u2C60-\\u2C7B\\u2C7E\\u2C7F";
/*     */   @NotNull
/*     */   private static final String latinUpperExtendedD = "\\uA722\\uA724\\uA726\\uA728\\uA72A\\uA72C\\uA72E\\uA732\\uA734\\uA736\\uA738\\uA73A\\uA73C\\uA73E\\uA740\\uA742\\uA744\\uA746\\uA748\\uA74A\\uA74C\\uA74E\\uA750\\uA752\\uA754\\uA756\\uA758\\uA75A\\uA75C\\uA75E\\uA760\\uA762\\uA764\\uA766\\uA768\\uA76A\\uA76C\\uA76E\\uA779\\uA77B\\uA77D\\uA77E\\uA780\\uA782\\uA784\\uA786\\uA78B\\uA78D\\uA790\\uA792\\uA796\\uA798\\uA79A\\uA79C\\uA79E\\uA7A0\\uA7A2\\uA7A4\\uA7A6\\uA7A8\\uA7AA-\\uA7AE\\uA7B0-\\uA7B4\\uA7B6\\uA7B8 ";
/*     */   @NotNull
/*     */   private static final String latinLowerExtendedD = "\\uA723\\uA725\\uA727\\uA729\\uA72B\\uA72D\\uA72F-\\uA731\\uA733\\uA735\\uA737\\uA739\\uA73B\\uA73D\\uA73F\\uA741\\uA743\\uA745\\uA747\\uA749\\uA74B\\uA74D\\uA74F\\uA751\\uA753\\uA755\\uA757\\uA759\\uA75B\\uA75D\\uA75F\\uA761\\uA763\\uA765\\uA767\\uA769\\uA76B\\uA76D\\uA76F\\uA771-\\uA778\\uA77A\\uA77C\\uA77F\\uA781\\uA783\\uA785\\uA787\\uA78C\\uA78E\\uA791\\uA793-\\uA795\\uA797\\uA799\\uA79B\\uA79D\\uA79F\\uA7A1\\uA7A3\\uA7A5\\uA7A7\\uA7A9\\uA7AF\\uA7B5\\uA7B7\\uA7B9\\uA7FA";
/*     */   @NotNull
/*     */   private static final String latinExtendedD = "\\uA722-\\uA76F\\uA771-\\uA787\\uA78B-\\uA78E\\uA790-\\uA7B9\\uA7FA ";
/*     */   @NotNull
/*     */   private static final String latinLowerExtendedE = "\\uAB30-\\uAB5A\\uAB60-\\uAB64";
/*     */   @NotNull
/*     */   private static final String latinExtendedE = "\\uAB30-\\uAB5A\\uAB60-\\uAB64";
/*     */   @NotNull
/*     */   private static final String latinLowerPhonetic = "\\u0250-\\u02AF\\u1D00-\\u1D25\\u1D6B-\\u1D77\\u1D79-\\u1D9A";
/*     */   @NotNull
/*     */   private static final String latinPhonetic = "\\u0250-\\u02AF\\u1D00-\\u1D25\\u1D6B-\\u1D77\\u1D79-\\u1D9A";
/*     */   @NotNull
/*     */   private static final String latinUpperDiacritics = "\\u1E00\\u1E02\\u1E04\\u1E06\\u1E08\\u1E0A\\u1E0C\\u1E0E\\u1E10\\u1E12\\u1E14\\u1E16\\u1E18\\u1E1A\\u1E1C\\u1E1E\\u1E20\\u1E22\\u1E24\\u1E26\\u1E28\\u1E2A\\u1E2C\\u1E2E\\u1E30\\u1E32\\u1E34\\u1E36\\u1E38\\u1E3A\\u1E3C\\u1E3E\\u1E40\\u1E42\\u1E44\\u1E46\\u1E48\\u1E4A\\u1E4C\\u1E4E\\u1E50\\u1E52\\u1E54\\u1E56\\u1E58\\u1E5A\\u1E5C\\u1E5E\\u1E60\\u1E62\\u1E64\\u1E66\\u1E68\\u1E6A\\u1E6C\\u1E6E\\u1E70\\u1E72\\u1E74\\u1E76\\u1E78\\u1E7A\\u1E7C\\u1E7E\\u1E80\\u1E82\\u1E84\\u1E86\\u1E88\\u1E8A\\u1E8C\\u1E8E\\u1E90\\u1E92\\u1E94\\u1E9E\\u1EA0\\u1EA2\\u1EA4\\u1EA6\\u1EA8\\u1EAA\\u1EAC\\u1EAE\\u1EB0\\u1EB2\\u1EB4\\u1EB6\\u1EB8\\u1EBA\\u1EBC\\u1EBE\\u1EC0\\u1EC2\\u1EC4\\u1EC6\\u1EC8\\u1ECA\\u1ECC\\u1ECE\\u1ED0\\u1ED2\\u1ED4\\u1ED6\\u1ED8\\u1EDA\\u1EDC\\u1EDE\\u1EE0\\u1EE2\\u1EE4\\u1EE6\\u1EE8\\u1EEA\\u1EEC\\u1EEE\\u1EF0\\u1EF2\\u1EF4\\u1EF6\\u1EF8\\u1EFA\\u1EFC\\u1EFE";
/*     */   @NotNull
/*     */   private static final String latinLowerDiacritics = "\\u1E01\\u1E03\\u1E05\\u1E07\\u1E09\\u1E0B\\u1E0D\\u1E0F\\u1E11\\u1E13\\u1E15\\u1E17\\u1E19\\u1E1B\\u1E1D\\u1E1F\\u1E21\\u1E23\\u1E25\\u1E27\\u1E29\\u1E2B\\u1E2D\\u1E2F\\u1E31\\u1E33\\u1E35\\u1E37\\u1E39\\u1E3B\\u1E3D\\u1E3F\\u1E41\\u1E43\\u1E45\\u1E47\\u1E49\\u1E4B\\u1E4D\\u1E4F\\u1E51\\u1E53\\u1E55\\u1E57\\u1E59\\u1E5B\\u1E5D\\u1E5F\\u1E61\\u1E63\\u1E65\\u1E67\\u1E69\\u1E6B\\u1E6D\\u1E6F\\u1E71\\u1E73\\u1E75\\u1E77\\u1E79\\u1E7B\\u1E7D\\u1E7F\\u1E81\\u1E83\\u1E85\\u1E87\\u1E89\\u1E8B\\u1E8D\\u1E8F\\u1E91\\u1E93\\u1E95-\\u1E9D\\u1E9F\\u1EA1\\u1EA3\\u1EA5\\u1EA7\\u1EA9\\u1EAB\\u1EAD\\u1EAF\\u1EB1\\u1EB3\\u1EB5\\u1EB7\\u1EB9\\u1EBB\\u1EBD\\u1EBF\\u1EC1\\u1EC3\\u1EC5\\u1EC7\\u1EC9\\u1ECB\\u1ECD\\u1ECF\\u1ED1\\u1ED3\\u1ED5\\u1ED7\\u1ED9\\u1EDB\\u1EDD\\u1EDF\\u1EE1\\u1EE3\\u1EE5\\u1EE7\\u1EE9\\u1EEB\\u1EED\\u1EEF\\u1EF1\\u1EF3\\u1EF5\\u1EF7\\u1EF9\\u1EFB\\u1EFD\\u1EFF";
/*     */   @NotNull
/*     */   private static final String latinDiacritics = "\\u1E00-\\u1EFF";
/*     */   @NotNull
/*     */   public static final String LatinLowerBasic = "a-z\\uFF41-\\uFF5A\\u00DF-\\u00F6\\u00F8-\\u00FF\\u0101\\u0103\\u0105\\u0107\\u0109\\u010B\\u010D\\u010F\\u0111\\u0113\\u0115\\u0117\\u0119\\u011B\\u011D\\u011F\\u0121\\u0123\\u0125\\u0127\\u0129\\u012B\\u012D\\u012F\\u0131\\u0133\\u0135\\u0137\\u0138\\u013A\\u013C\\u013E\\u0140\\u0142\\u0144\\u0146\\u0148\\u0149\\u014B\\u014D\\u014F\\u0151\\u0153\\u0155\\u0157\\u0159\\u015B\\u015D\\u015F\\u0161\\u0163\\u0165\\u0167\\u0169\\u016B\\u016D\\u016F\\u0171\\u0173\\u0175\\u0177\\u017A\\u017C\\u017E\\u017F";
/*     */   @NotNull
/*     */   public static final String LatinLower = "a-z\\uFF41-\\uFF5A\\u00DF-\\u00F6\\u00F8-\\u00FF\\u0101\\u0103\\u0105\\u0107\\u0109\\u010B\\u010D\\u010F\\u0111\\u0113\\u0115\\u0117\\u0119\\u011B\\u011D\\u011F\\u0121\\u0123\\u0125\\u0127\\u0129\\u012B\\u012D\\u012F\\u0131\\u0133\\u0135\\u0137\\u0138\\u013A\\u013C\\u013E\\u0140\\u0142\\u0144\\u0146\\u0148\\u0149\\u014B\\u014D\\u014F\\u0151\\u0153\\u0155\\u0157\\u0159\\u015B\\u015D\\u015F\\u0161\\u0163\\u0165\\u0167\\u0169\\u016B\\u016D\\u016F\\u0171\\u0173\\u0175\\u0177\\u017A\\u017C\\u017E\\u017F\\u0180\\u0183\\u0185\\u0188\\u018C\\u018D\\u0192\\u0195\\u0199-\\u019B\\u019E\\u01A1\\u01A3\\u01A5\\u01A8\\u01AA\\u01AB\\u01AD\\u01B0\\u01B4\\u01B6\\u01B9\\u01BA\\u01BD-\\u01BF\\u01C6\\u01C9\\u01CC\\u01CE\\u01D0\\u01D2\\u01D4\\u01D6\\u01D8\\u01DA\\u01DC\\u01DD\\u01DF\\u01E1\\u01E3\\u01E5\\u01E7\\u01E9\\u01EB\\u01ED\\u01EF\\u01F0\\u01F3\\u01F5\\u01F9\\u01FB\\u01FD\\u01FF\\u0201\\u0203\\u0205\\u0207\\u0209\\u020B\\u020D\\u020F\\u0211\\u0213\\u0215\\u0217\\u0219\\u021B\\u021D\\u021F\\u0221\\u0223\\u0225\\u0227\\u0229\\u022B\\u022D\\u022F\\u0231\\u0233-\\u0239\\u023C\\u023F\\u0240\\u0242\\u0247\\u0249\\u024B\\u024D\\u024F\\u2C61\\u2C65\\u2C66\\u2C68\\u2C6A\\u2C6C\\u2C71\\u2C73\\u2C74\\u2C76-\\u2C7B \\uA723\\uA725\\uA727\\uA729\\uA72B\\uA72D\\uA72F-\\uA731\\uA733\\uA735\\uA737\\uA739\\uA73B\\uA73D\\uA73F\\uA741\\uA743\\uA745\\uA747\\uA749\\uA74B\\uA74D\\uA74F\\uA751\\uA753\\uA755\\uA757\\uA759\\uA75B\\uA75D\\uA75F\\uA761\\uA763\\uA765\\uA767\\uA769\\uA76B\\uA76D\\uA76F\\uA771-\\uA778\\uA77A\\uA77C\\uA77F\\uA781\\uA783\\uA785\\uA787\\uA78C\\uA78E\\uA791\\uA793-\\uA795\\uA797\\uA799\\uA79B\\uA79D\\uA79F\\uA7A1\\uA7A3\\uA7A5\\uA7A7\\uA7A9\\uA7AF\\uA7B5\\uA7B7\\uA7B9\\uA7FA\\uAB30-\\uAB5A\\uAB60-\\uAB64\\u0250-\\u02AF\\u1D00-\\u1D25\\u1D6B-\\u1D77\\u1D79-\\u1D9A\\u1E01\\u1E03\\u1E05\\u1E07\\u1E09\\u1E0B\\u1E0D\\u1E0F\\u1E11\\u1E13\\u1E15\\u1E17\\u1E19\\u1E1B\\u1E1D\\u1E1F\\u1E21\\u1E23\\u1E25\\u1E27\\u1E29\\u1E2B\\u1E2D\\u1E2F\\u1E31\\u1E33\\u1E35\\u1E37\\u1E39\\u1E3B\\u1E3D\\u1E3F\\u1E41\\u1E43\\u1E45\\u1E47\\u1E49\\u1E4B\\u1E4D\\u1E4F\\u1E51\\u1E53\\u1E55\\u1E57\\u1E59\\u1E5B\\u1E5D\\u1E5F\\u1E61\\u1E63\\u1E65\\u1E67\\u1E69\\u1E6B\\u1E6D\\u1E6F\\u1E71\\u1E73\\u1E75\\u1E77\\u1E79\\u1E7B\\u1E7D\\u1E7F\\u1E81\\u1E83\\u1E85\\u1E87\\u1E89\\u1E8B\\u1E8D\\u1E8F\\u1E91\\u1E93\\u1E95-\\u1E9D\\u1E9F\\u1EA1\\u1EA3\\u1EA5\\u1EA7\\u1EA9\\u1EAB\\u1EAD\\u1EAF\\u1EB1\\u1EB3\\u1EB5\\u1EB7\\u1EB9\\u1EBB\\u1EBD\\u1EBF\\u1EC1\\u1EC3\\u1EC5\\u1EC7\\u1EC9\\u1ECB\\u1ECD\\u1ECF\\u1ED1\\u1ED3\\u1ED5\\u1ED7\\u1ED9\\u1EDB\\u1EDD\\u1EDF\\u1EE1\\u1EE3\\u1EE5\\u1EE7\\u1EE9\\u1EEB\\u1EED\\u1EEF\\u1EF1\\u1EF3\\u1EF5\\u1EF7\\u1EF9\\u1EFB\\u1EFD\\u1EFF";
/*     */   @NotNull
/*     */   public static final String LatinUpperBasic = "A-Z\\uFF21-\\uFF3A\\u00C0-\\u00D6\\u00D8-\\u00DE\\u0100\\u0102\\u0104\\u0106\\u0108\\u010A\\u010C\\u010E\\u0110\\u0112\\u0114\\u0116\\u0118\\u011A\\u011C\\u011E\\u0120\\u0122\\u0124\\u0126\\u0128\\u012A\\u012C\\u012E\\u0130\\u0132\\u0134\\u0136\\u0139\\u013B\\u013D\\u013F\\u0141\\u0143\\u0145\\u0147\\u014A\\u014C\\u014E\\u0150\\u0152\\u0154\\u0156\\u0158\\u015A\\u015C\\u015E\\u0160\\u0162\\u0164\\u0166\\u0168\\u016A\\u016C\\u016E\\u0170\\u0172\\u0174\\u0176\\u0178\\u0179\\u017B\\u017D";
/*     */   @NotNull
/*     */   public static final String LatinUpper = "A-Z\\uFF21-\\uFF3A\\u00C0-\\u00D6\\u00D8-\\u00DE\\u0100\\u0102\\u0104\\u0106\\u0108\\u010A\\u010C\\u010E\\u0110\\u0112\\u0114\\u0116\\u0118\\u011A\\u011C\\u011E\\u0120\\u0122\\u0124\\u0126\\u0128\\u012A\\u012C\\u012E\\u0130\\u0132\\u0134\\u0136\\u0139\\u013B\\u013D\\u013F\\u0141\\u0143\\u0145\\u0147\\u014A\\u014C\\u014E\\u0150\\u0152\\u0154\\u0156\\u0158\\u015A\\u015C\\u015E\\u0160\\u0162\\u0164\\u0166\\u0168\\u016A\\u016C\\u016E\\u0170\\u0172\\u0174\\u0176\\u0178\\u0179\\u017B\\u017D\\u0181\\u0182\\u0184\\u0186\\u0187\\u0189-\\u018B\\u018E-\\u0191\\u0193\\u0194\\u0196-\\u0198\\u019C\\u019D\\u019F\\u01A0\\u01A2\\u01A4\\u01A6\\u01A7\\u01A9\\u01AC\\u01AE\\u01AF\\u01B1-\\u01B3\\u01B5\\u01B7\\u01B8\\u01BC\\u01C4\\u01C7\\u01CA\\u01CD\\u01CF\\u01D1\\u01D3\\u01D5\\u01D7\\u01D9\\u01DB\\u01DE\\u01E0\\u01E2\\u01E4\\u01E6\\u01E8\\u01EA\\u01EC\\u01EE\\u01F1\\u01F4\\u01F6-\\u01F8\\u01FA\\u01FC\\u01FE\\u0200\\u0202\\u0204\\u0206\\u0208\\u020A\\u020C\\u020E\\u0210\\u0212\\u0214\\u0216\\u0218\\u021A\\u021C\\u021E\\u0220\\u0222\\u0224\\u0226\\u0228\\u022A\\u022C\\u022E\\u0230\\u0232\\u023A\\u023B\\u023D\\u023E\\u0241\\u0243-\\u0246\\u0248\\u024A\\u024C\\u024E\\u2C60\\u2C62-\\u2C64\\u2C67\\u2C69\\u2C6B\\u2C6D-\\u2C70\\u2C72\\u2C75\\u2C7E\\u2C7F \\uA722\\uA724\\uA726\\uA728\\uA72A\\uA72C\\uA72E\\uA732\\uA734\\uA736\\uA738\\uA73A\\uA73C\\uA73E\\uA740\\uA742\\uA744\\uA746\\uA748\\uA74A\\uA74C\\uA74E\\uA750\\uA752\\uA754\\uA756\\uA758\\uA75A\\uA75C\\uA75E\\uA760\\uA762\\uA764\\uA766\\uA768\\uA76A\\uA76C\\uA76E\\uA779\\uA77B\\uA77D\\uA77E\\uA780\\uA782\\uA784\\uA786\\uA78B\\uA78D\\uA790\\uA792\\uA796\\uA798\\uA79A\\uA79C\\uA79E\\uA7A0\\uA7A2\\uA7A4\\uA7A6\\uA7A8\\uA7AA-\\uA7AE\\uA7B0-\\uA7B4\\uA7B6\\uA7B8 \\u1E00\\u1E02\\u1E04\\u1E06\\u1E08\\u1E0A\\u1E0C\\u1E0E\\u1E10\\u1E12\\u1E14\\u1E16\\u1E18\\u1E1A\\u1E1C\\u1E1E\\u1E20\\u1E22\\u1E24\\u1E26\\u1E28\\u1E2A\\u1E2C\\u1E2E\\u1E30\\u1E32\\u1E34\\u1E36\\u1E38\\u1E3A\\u1E3C\\u1E3E\\u1E40\\u1E42\\u1E44\\u1E46\\u1E48\\u1E4A\\u1E4C\\u1E4E\\u1E50\\u1E52\\u1E54\\u1E56\\u1E58\\u1E5A\\u1E5C\\u1E5E\\u1E60\\u1E62\\u1E64\\u1E66\\u1E68\\u1E6A\\u1E6C\\u1E6E\\u1E70\\u1E72\\u1E74\\u1E76\\u1E78\\u1E7A\\u1E7C\\u1E7E\\u1E80\\u1E82\\u1E84\\u1E86\\u1E88\\u1E8A\\u1E8C\\u1E8E\\u1E90\\u1E92\\u1E94\\u1E9E\\u1EA0\\u1EA2\\u1EA4\\u1EA6\\u1EA8\\u1EAA\\u1EAC\\u1EAE\\u1EB0\\u1EB2\\u1EB4\\u1EB6\\u1EB8\\u1EBA\\u1EBC\\u1EBE\\u1EC0\\u1EC2\\u1EC4\\u1EC6\\u1EC8\\u1ECA\\u1ECC\\u1ECE\\u1ED0\\u1ED2\\u1ED4\\u1ED6\\u1ED8\\u1EDA\\u1EDC\\u1EDE\\u1EE0\\u1EE2\\u1EE4\\u1EE6\\u1EE8\\u1EEA\\u1EEC\\u1EEE\\u1EF0\\u1EF2\\u1EF4\\u1EF6\\u1EF8\\u1EFA\\u1EFC\\u1EFE";
/*     */   @NotNull
/*     */   public static final String LatinBasic = "A-Za-z\\uFF21-\\uFF3A\\uFF41-\\uFF5A\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u00FF\\u0100-\\u017F";
/*     */   @NotNull
/*     */   public static final String Latin = "A-Za-z\\uFF21-\\uFF3A\\uFF41-\\uFF5A\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u00FF\\u0100-\\u017F\\u0180-\\u01BF\\u01C4-\\u024F \\u2C60-\\u2C7B\\u2C7E\\u2C7F\\uA722-\\uA76F\\uA771-\\uA787\\uA78B-\\uA78E\\uA790-\\uA7B9\\uA7FA \\uAB30-\\uAB5A\\uAB60-\\uAB64\\u0250-\\u02AF\\u1D00-\\u1D25\\u1D6B-\\u1D77\\u1D79-\\u1D9A\\u1E00-\\u1EFF";
/*     */   @NotNull
/*     */   private static final String persian = "\\u0620-\\u064A\\u066E-\\u06D5\\u06E5-\\u06FF\\u0750-\\u077F\\u08A0-\\u08BD\\uFB50-\\uFBB1\\uFBD3-\\uFD3D\\uFD50-\\uFDC7\\uFDF0-\\uFDFB\\uFE70-\\uFEFC\\x{0001EE00}-\\x{0001EEBB}";
/*     */   @NotNull
/*     */   private static final String russianLower = "ёа-я";
/*     */   @NotNull
/*     */   private static final String russianUpper = "ЁА-Я";
/*     */   @NotNull
/*     */   private static final String russian = "ёа-яЁА-Я";
/*     */   @NotNull
/*     */   private static final String nhala = "\\u0D80-\\u0DFF";
/*     */   @NotNull
/*     */   private static final String tatarLower = "әөүҗңһ";
/*     */   @NotNull
/*     */   private static final String tatarUpper = "ӘӨҮҖҢҺ";
/*     */   @NotNull
/*     */   private static final String tatar = "әөүҗңһӘӨҮҖҢҺ";
/*     */   @NotNull
/*     */   private static final String greekLower = "α-ωάέίόώήύ";
/*     */   @NotNull
/*     */   private static final String greekUpper = "Α-ΩΆΈΊΌΏΉΎ";
/*     */   @NotNull
/*     */   private static final String greek = "α-ωάέίόώήύΑ-ΩΆΈΊΌΏΉΎ";
/*     */   @NotNull
/*     */   private static final String ukrainianLower = "а-щюяіїєґ";
/*     */   @NotNull
/*     */   private static final String ukrainianUpper = "А-ЩЮЯІЇЄҐ";
/*     */   @NotNull
/*     */   private static final String ukrainian = "а-щюяіїєґА-ЩЮЯІЇЄҐ";
/*     */   @NotNull
/*     */   private static final String macedonianLower = "ѓѕјљњќѐѝ";
/*     */   @NotNull
/*     */   private static final String macedonianUpper = "ЃЅЈЉЊЌЀЍ";
/*     */   @NotNull
/*     */   private static final String macedonian = "ѓѕјљњќѐѝЃЅЈЉЊЌЀЍ";
/*     */   @NotNull
/*     */   private static final String upper = "A-Z\\uFF21-\\uFF3A\\u00C0-\\u00D6\\u00D8-\\u00DE\\u0100\\u0102\\u0104\\u0106\\u0108\\u010A\\u010C\\u010E\\u0110\\u0112\\u0114\\u0116\\u0118\\u011A\\u011C\\u011E\\u0120\\u0122\\u0124\\u0126\\u0128\\u012A\\u012C\\u012E\\u0130\\u0132\\u0134\\u0136\\u0139\\u013B\\u013D\\u013F\\u0141\\u0143\\u0145\\u0147\\u014A\\u014C\\u014E\\u0150\\u0152\\u0154\\u0156\\u0158\\u015A\\u015C\\u015E\\u0160\\u0162\\u0164\\u0166\\u0168\\u016A\\u016C\\u016E\\u0170\\u0172\\u0174\\u0176\\u0178\\u0179\\u017B\\u017D\\u0181\\u0182\\u0184\\u0186\\u0187\\u0189-\\u018B\\u018E-\\u0191\\u0193\\u0194\\u0196-\\u0198\\u019C\\u019D\\u019F\\u01A0\\u01A2\\u01A4\\u01A6\\u01A7\\u01A9\\u01AC\\u01AE\\u01AF\\u01B1-\\u01B3\\u01B5\\u01B7\\u01B8\\u01BC\\u01C4\\u01C7\\u01CA\\u01CD\\u01CF\\u01D1\\u01D3\\u01D5\\u01D7\\u01D9\\u01DB\\u01DE\\u01E0\\u01E2\\u01E4\\u01E6\\u01E8\\u01EA\\u01EC\\u01EE\\u01F1\\u01F4\\u01F6-\\u01F8\\u01FA\\u01FC\\u01FE\\u0200\\u0202\\u0204\\u0206\\u0208\\u020A\\u020C\\u020E\\u0210\\u0212\\u0214\\u0216\\u0218\\u021A\\u021C\\u021E\\u0220\\u0222\\u0224\\u0226\\u0228\\u022A\\u022C\\u022E\\u0230\\u0232\\u023A\\u023B\\u023D\\u023E\\u0241\\u0243-\\u0246\\u0248\\u024A\\u024C\\u024E\\u2C60\\u2C62-\\u2C64\\u2C67\\u2C69\\u2C6B\\u2C6D-\\u2C70\\u2C72\\u2C75\\u2C7E\\u2C7F \\uA722\\uA724\\uA726\\uA728\\uA72A\\uA72C\\uA72E\\uA732\\uA734\\uA736\\uA738\\uA73A\\uA73C\\uA73E\\uA740\\uA742\\uA744\\uA746\\uA748\\uA74A\\uA74C\\uA74E\\uA750\\uA752\\uA754\\uA756\\uA758\\uA75A\\uA75C\\uA75E\\uA760\\uA762\\uA764\\uA766\\uA768\\uA76A\\uA76C\\uA76E\\uA779\\uA77B\\uA77D\\uA77E\\uA780\\uA782\\uA784\\uA786\\uA78B\\uA78D\\uA790\\uA792\\uA796\\uA798\\uA79A\\uA79C\\uA79E\\uA7A0\\uA7A2\\uA7A4\\uA7A6\\uA7A8\\uA7AA-\\uA7AE\\uA7B0-\\uA7B4\\uA7B6\\uA7B8 \\u1E00\\u1E02\\u1E04\\u1E06\\u1E08\\u1E0A\\u1E0C\\u1E0E\\u1E10\\u1E12\\u1E14\\u1E16\\u1E18\\u1E1A\\u1E1C\\u1E1E\\u1E20\\u1E22\\u1E24\\u1E26\\u1E28\\u1E2A\\u1E2C\\u1E2E\\u1E30\\u1E32\\u1E34\\u1E36\\u1E38\\u1E3A\\u1E3C\\u1E3E\\u1E40\\u1E42\\u1E44\\u1E46\\u1E48\\u1E4A\\u1E4C\\u1E4E\\u1E50\\u1E52\\u1E54\\u1E56\\u1E58\\u1E5A\\u1E5C\\u1E5E\\u1E60\\u1E62\\u1E64\\u1E66\\u1E68\\u1E6A\\u1E6C\\u1E6E\\u1E70\\u1E72\\u1E74\\u1E76\\u1E78\\u1E7A\\u1E7C\\u1E7E\\u1E80\\u1E82\\u1E84\\u1E86\\u1E88\\u1E8A\\u1E8C\\u1E8E\\u1E90\\u1E92\\u1E94\\u1E9E\\u1EA0\\u1EA2\\u1EA4\\u1EA6\\u1EA8\\u1EAA\\u1EAC\\u1EAE\\u1EB0\\u1EB2\\u1EB4\\u1EB6\\u1EB8\\u1EBA\\u1EBC\\u1EBE\\u1EC0\\u1EC2\\u1EC4\\u1EC6\\u1EC8\\u1ECA\\u1ECC\\u1ECE\\u1ED0\\u1ED2\\u1ED4\\u1ED6\\u1ED8\\u1EDA\\u1EDC\\u1EDE\\u1EE0\\u1EE2\\u1EE4\\u1EE6\\u1EE8\\u1EEA\\u1EEC\\u1EEE\\u1EF0\\u1EF2\\u1EF4\\u1EF6\\u1EF8\\u1EFA\\u1EFC\\u1EFEЁА-ЯӘӨҮҖҢҺΑ-ΩΆΈΊΌΏΉΎА-ЩЮЯІЇЄҐЃЅЈЉЊЌЀЍ";
/*     */   @NotNull
/*     */   private static final String lower = "a-z\\uFF41-\\uFF5A\\u00DF-\\u00F6\\u00F8-\\u00FF\\u0101\\u0103\\u0105\\u0107\\u0109\\u010B\\u010D\\u010F\\u0111\\u0113\\u0115\\u0117\\u0119\\u011B\\u011D\\u011F\\u0121\\u0123\\u0125\\u0127\\u0129\\u012B\\u012D\\u012F\\u0131\\u0133\\u0135\\u0137\\u0138\\u013A\\u013C\\u013E\\u0140\\u0142\\u0144\\u0146\\u0148\\u0149\\u014B\\u014D\\u014F\\u0151\\u0153\\u0155\\u0157\\u0159\\u015B\\u015D\\u015F\\u0161\\u0163\\u0165\\u0167\\u0169\\u016B\\u016D\\u016F\\u0171\\u0173\\u0175\\u0177\\u017A\\u017C\\u017E\\u017F\\u0180\\u0183\\u0185\\u0188\\u018C\\u018D\\u0192\\u0195\\u0199-\\u019B\\u019E\\u01A1\\u01A3\\u01A5\\u01A8\\u01AA\\u01AB\\u01AD\\u01B0\\u01B4\\u01B6\\u01B9\\u01BA\\u01BD-\\u01BF\\u01C6\\u01C9\\u01CC\\u01CE\\u01D0\\u01D2\\u01D4\\u01D6\\u01D8\\u01DA\\u01DC\\u01DD\\u01DF\\u01E1\\u01E3\\u01E5\\u01E7\\u01E9\\u01EB\\u01ED\\u01EF\\u01F0\\u01F3\\u01F5\\u01F9\\u01FB\\u01FD\\u01FF\\u0201\\u0203\\u0205\\u0207\\u0209\\u020B\\u020D\\u020F\\u0211\\u0213\\u0215\\u0217\\u0219\\u021B\\u021D\\u021F\\u0221\\u0223\\u0225\\u0227\\u0229\\u022B\\u022D\\u022F\\u0231\\u0233-\\u0239\\u023C\\u023F\\u0240\\u0242\\u0247\\u0249\\u024B\\u024D\\u024F\\u2C61\\u2C65\\u2C66\\u2C68\\u2C6A\\u2C6C\\u2C71\\u2C73\\u2C74\\u2C76-\\u2C7B \\uA723\\uA725\\uA727\\uA729\\uA72B\\uA72D\\uA72F-\\uA731\\uA733\\uA735\\uA737\\uA739\\uA73B\\uA73D\\uA73F\\uA741\\uA743\\uA745\\uA747\\uA749\\uA74B\\uA74D\\uA74F\\uA751\\uA753\\uA755\\uA757\\uA759\\uA75B\\uA75D\\uA75F\\uA761\\uA763\\uA765\\uA767\\uA769\\uA76B\\uA76D\\uA76F\\uA771-\\uA778\\uA77A\\uA77C\\uA77F\\uA781\\uA783\\uA785\\uA787\\uA78C\\uA78E\\uA791\\uA793-\\uA795\\uA797\\uA799\\uA79B\\uA79D\\uA79F\\uA7A1\\uA7A3\\uA7A5\\uA7A7\\uA7A9\\uA7AF\\uA7B5\\uA7B7\\uA7B9\\uA7FA\\uAB30-\\uAB5A\\uAB60-\\uAB64\\u0250-\\u02AF\\u1D00-\\u1D25\\u1D6B-\\u1D77\\u1D79-\\u1D9A\\u1E01\\u1E03\\u1E05\\u1E07\\u1E09\\u1E0B\\u1E0D\\u1E0F\\u1E11\\u1E13\\u1E15\\u1E17\\u1E19\\u1E1B\\u1E1D\\u1E1F\\u1E21\\u1E23\\u1E25\\u1E27\\u1E29\\u1E2B\\u1E2D\\u1E2F\\u1E31\\u1E33\\u1E35\\u1E37\\u1E39\\u1E3B\\u1E3D\\u1E3F\\u1E41\\u1E43\\u1E45\\u1E47\\u1E49\\u1E4B\\u1E4D\\u1E4F\\u1E51\\u1E53\\u1E55\\u1E57\\u1E59\\u1E5B\\u1E5D\\u1E5F\\u1E61\\u1E63\\u1E65\\u1E67\\u1E69\\u1E6B\\u1E6D\\u1E6F\\u1E71\\u1E73\\u1E75\\u1E77\\u1E79\\u1E7B\\u1E7D\\u1E7F\\u1E81\\u1E83\\u1E85\\u1E87\\u1E89\\u1E8B\\u1E8D\\u1E8F\\u1E91\\u1E93\\u1E95-\\u1E9D\\u1E9F\\u1EA1\\u1EA3\\u1EA5\\u1EA7\\u1EA9\\u1EAB\\u1EAD\\u1EAF\\u1EB1\\u1EB3\\u1EB5\\u1EB7\\u1EB9\\u1EBB\\u1EBD\\u1EBF\\u1EC1\\u1EC3\\u1EC5\\u1EC7\\u1EC9\\u1ECB\\u1ECD\\u1ECF\\u1ED1\\u1ED3\\u1ED5\\u1ED7\\u1ED9\\u1EDB\\u1EDD\\u1EDF\\u1EE1\\u1EE3\\u1EE5\\u1EE7\\u1EE9\\u1EEB\\u1EED\\u1EEF\\u1EF1\\u1EF3\\u1EF5\\u1EF7\\u1EF9\\u1EFB\\u1EFD\\u1EFFёа-яәөүҗңһα-ωάέίόώήύа-щюяіїєґѓѕјљњќѐѝ";
/*     */   @NotNull
/* 205 */   public static final SpacyTokenizerCharClasses INSTANCE = new SpacyTokenizerCharClasses(); @NotNull private static final String uncased = "\\u1200-\\u137F\\u0980-\\u09FF\\u0591-\\u05F4\\uFB1D-\\uFB4F\\u0620-\\u064A\\u066E-\\u06D5\\u06E5-\\u06FF\\u0750-\\u077F\\u08A0-\\u08BD\\uFB50-\\uFBB1\\uFBD3-\\uFD3D\\uFD50-\\uFDC7\\uFDF0-\\uFDFB\\uFE70-\\uFEFC\\x{0001EE00}-\\x{0001EEBB}\\u0D80-\\u0DFF\\u0900-\\u097F\\u0C80-\\u0CFF\\u0B80-\\u0BFF\\u0C00-\\u0C7F\\uAC00-\\uD7AF\\u1100-\\u11FF\\u4E00-\\u62FF\\u6300-\\u77FF\\u7800-\\u8CFF\\u8D00-\\u9FFF\\u3400-\\u4DBF\\x{00020000}-\\x{000215FF}\\x{00021600}-\\x{000230FF}\\x{00023100}-\\x{000245FF}\\x{00024600}-\\x{000260FF}\\x{00026100}-\\x{000275FF}\\x{00027600}-\\x{000290FF}\\x{00029100}-\\x{0002A6DF}\\x{0002A700}-\\x{0002B73F}\\x{0002B740}-\\x{0002B81F}\\x{0002B820}-\\x{0002CEAF}\\x{0002CEB0}-\\x{0002EBEF}\\u2E80-\\u2EFF\\u2F00-\\u2FDF\\u2FF0-\\u2FFF\\u3000-\\u303F\\u31C0-\\u31EF\\u3200-\\u32FF\\u3300-\\u33FF\\uF900-\\uFAFF\\uFE30-\\uFE4F\\x{0001F200}-\\x{0001F2FF}\\x{0002F800}-\\x{0002FA1F}"; @NotNull private static final String Alpha = INSTANCE.groupChars("A-Za-z\\uFF21-\\uFF3A\\uFF41-\\uFF5A\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u00FF\\u0100-\\u017F\\u0180-\\u01BF\\u01C4-\\u024F \\u2C60-\\u2C7B\\u2C7E\\u2C7F\\uA722-\\uA76F\\uA771-\\uA787\\uA78B-\\uA78E\\uA790-\\uA7B9\\uA7FA \\uAB30-\\uAB5A\\uAB60-\\uAB64\\u0250-\\u02AF\\u1D00-\\u1D25\\u1D6B-\\u1D77\\u1D79-\\u1D9A\\u1E00-\\u1EFFёа-яЁА-ЯәөүҗңһӘӨҮҖҢҺα-ωάέίόώήύΑ-ΩΆΈΊΌΏΉΎа-щюяіїєґА-ЩЮЯІЇЄҐѓѕјљњќѐѝЃЅЈЉЊЌЀЍ\\u1200-\\u137F\\u0980-\\u09FF\\u0591-\\u05F4\\uFB1D-\\uFB4F\\u0620-\\u064A\\u066E-\\u06D5\\u06E5-\\u06FF\\u0750-\\u077F\\u08A0-\\u08BD\\uFB50-\\uFBB1\\uFBD3-\\uFD3D\\uFD50-\\uFDC7\\uFDF0-\\uFDFB\\uFE70-\\uFEFC\\x{0001EE00}-\\x{0001EEBB}\\u0D80-\\u0DFF\\u0900-\\u097F\\u0C80-\\u0CFF\\u0B80-\\u0BFF\\u0C00-\\u0C7F\\uAC00-\\uD7AF\\u1100-\\u11FF\\u4E00-\\u62FF\\u6300-\\u77FF\\u7800-\\u8CFF\\u8D00-\\u9FFF\\u3400-\\u4DBF\\x{00020000}-\\x{000215FF}\\x{00021600}-\\x{000230FF}\\x{00023100}-\\x{000245FF}\\x{00024600}-\\x{000260FF}\\x{00026100}-\\x{000275FF}\\x{00027600}-\\x{000290FF}\\x{00029100}-\\x{0002A6DF}\\x{0002A700}-\\x{0002B73F}\\x{0002B740}-\\x{0002B81F}\\x{0002B820}-\\x{0002CEAF}\\x{0002CEB0}-\\x{0002EBEF}\\u2E80-\\u2EFF\\u2F00-\\u2FDF\\u2FF0-\\u2FFF\\u3000-\\u303F\\u31C0-\\u31EF\\u3200-\\u32FF\\u3300-\\u33FF\\uF900-\\uFAFF\\uFE30-\\uFE4F\\x{0001F200}-\\x{0001F2FF}\\x{0002F800}-\\x{0002FA1F}"); @NotNull public final String getAlpha() { return Alpha; } @NotNull
/* 206 */   private static final String AlphaLower = INSTANCE.groupChars("a-z\\uFF41-\\uFF5A\\u00DF-\\u00F6\\u00F8-\\u00FF\\u0101\\u0103\\u0105\\u0107\\u0109\\u010B\\u010D\\u010F\\u0111\\u0113\\u0115\\u0117\\u0119\\u011B\\u011D\\u011F\\u0121\\u0123\\u0125\\u0127\\u0129\\u012B\\u012D\\u012F\\u0131\\u0133\\u0135\\u0137\\u0138\\u013A\\u013C\\u013E\\u0140\\u0142\\u0144\\u0146\\u0148\\u0149\\u014B\\u014D\\u014F\\u0151\\u0153\\u0155\\u0157\\u0159\\u015B\\u015D\\u015F\\u0161\\u0163\\u0165\\u0167\\u0169\\u016B\\u016D\\u016F\\u0171\\u0173\\u0175\\u0177\\u017A\\u017C\\u017E\\u017F\\u0180\\u0183\\u0185\\u0188\\u018C\\u018D\\u0192\\u0195\\u0199-\\u019B\\u019E\\u01A1\\u01A3\\u01A5\\u01A8\\u01AA\\u01AB\\u01AD\\u01B0\\u01B4\\u01B6\\u01B9\\u01BA\\u01BD-\\u01BF\\u01C6\\u01C9\\u01CC\\u01CE\\u01D0\\u01D2\\u01D4\\u01D6\\u01D8\\u01DA\\u01DC\\u01DD\\u01DF\\u01E1\\u01E3\\u01E5\\u01E7\\u01E9\\u01EB\\u01ED\\u01EF\\u01F0\\u01F3\\u01F5\\u01F9\\u01FB\\u01FD\\u01FF\\u0201\\u0203\\u0205\\u0207\\u0209\\u020B\\u020D\\u020F\\u0211\\u0213\\u0215\\u0217\\u0219\\u021B\\u021D\\u021F\\u0221\\u0223\\u0225\\u0227\\u0229\\u022B\\u022D\\u022F\\u0231\\u0233-\\u0239\\u023C\\u023F\\u0240\\u0242\\u0247\\u0249\\u024B\\u024D\\u024F\\u2C61\\u2C65\\u2C66\\u2C68\\u2C6A\\u2C6C\\u2C71\\u2C73\\u2C74\\u2C76-\\u2C7B \\uA723\\uA725\\uA727\\uA729\\uA72B\\uA72D\\uA72F-\\uA731\\uA733\\uA735\\uA737\\uA739\\uA73B\\uA73D\\uA73F\\uA741\\uA743\\uA745\\uA747\\uA749\\uA74B\\uA74D\\uA74F\\uA751\\uA753\\uA755\\uA757\\uA759\\uA75B\\uA75D\\uA75F\\uA761\\uA763\\uA765\\uA767\\uA769\\uA76B\\uA76D\\uA76F\\uA771-\\uA778\\uA77A\\uA77C\\uA77F\\uA781\\uA783\\uA785\\uA787\\uA78C\\uA78E\\uA791\\uA793-\\uA795\\uA797\\uA799\\uA79B\\uA79D\\uA79F\\uA7A1\\uA7A3\\uA7A5\\uA7A7\\uA7A9\\uA7AF\\uA7B5\\uA7B7\\uA7B9\\uA7FA\\uAB30-\\uAB5A\\uAB60-\\uAB64\\u0250-\\u02AF\\u1D00-\\u1D25\\u1D6B-\\u1D77\\u1D79-\\u1D9A\\u1E01\\u1E03\\u1E05\\u1E07\\u1E09\\u1E0B\\u1E0D\\u1E0F\\u1E11\\u1E13\\u1E15\\u1E17\\u1E19\\u1E1B\\u1E1D\\u1E1F\\u1E21\\u1E23\\u1E25\\u1E27\\u1E29\\u1E2B\\u1E2D\\u1E2F\\u1E31\\u1E33\\u1E35\\u1E37\\u1E39\\u1E3B\\u1E3D\\u1E3F\\u1E41\\u1E43\\u1E45\\u1E47\\u1E49\\u1E4B\\u1E4D\\u1E4F\\u1E51\\u1E53\\u1E55\\u1E57\\u1E59\\u1E5B\\u1E5D\\u1E5F\\u1E61\\u1E63\\u1E65\\u1E67\\u1E69\\u1E6B\\u1E6D\\u1E6F\\u1E71\\u1E73\\u1E75\\u1E77\\u1E79\\u1E7B\\u1E7D\\u1E7F\\u1E81\\u1E83\\u1E85\\u1E87\\u1E89\\u1E8B\\u1E8D\\u1E8F\\u1E91\\u1E93\\u1E95-\\u1E9D\\u1E9F\\u1EA1\\u1EA3\\u1EA5\\u1EA7\\u1EA9\\u1EAB\\u1EAD\\u1EAF\\u1EB1\\u1EB3\\u1EB5\\u1EB7\\u1EB9\\u1EBB\\u1EBD\\u1EBF\\u1EC1\\u1EC3\\u1EC5\\u1EC7\\u1EC9\\u1ECB\\u1ECD\\u1ECF\\u1ED1\\u1ED3\\u1ED5\\u1ED7\\u1ED9\\u1EDB\\u1EDD\\u1EDF\\u1EE1\\u1EE3\\u1EE5\\u1EE7\\u1EE9\\u1EEB\\u1EED\\u1EEF\\u1EF1\\u1EF3\\u1EF5\\u1EF7\\u1EF9\\u1EFB\\u1EFD\\u1EFFёа-яәөүҗңһα-ωάέίόώήύа-щюяіїєґѓѕјљњќѐѝ\\u1200-\\u137F\\u0980-\\u09FF\\u0591-\\u05F4\\uFB1D-\\uFB4F\\u0620-\\u064A\\u066E-\\u06D5\\u06E5-\\u06FF\\u0750-\\u077F\\u08A0-\\u08BD\\uFB50-\\uFBB1\\uFBD3-\\uFD3D\\uFD50-\\uFDC7\\uFDF0-\\uFDFB\\uFE70-\\uFEFC\\x{0001EE00}-\\x{0001EEBB}\\u0D80-\\u0DFF\\u0900-\\u097F\\u0C80-\\u0CFF\\u0B80-\\u0BFF\\u0C00-\\u0C7F\\uAC00-\\uD7AF\\u1100-\\u11FF\\u4E00-\\u62FF\\u6300-\\u77FF\\u7800-\\u8CFF\\u8D00-\\u9FFF\\u3400-\\u4DBF\\x{00020000}-\\x{000215FF}\\x{00021600}-\\x{000230FF}\\x{00023100}-\\x{000245FF}\\x{00024600}-\\x{000260FF}\\x{00026100}-\\x{000275FF}\\x{00027600}-\\x{000290FF}\\x{00029100}-\\x{0002A6DF}\\x{0002A700}-\\x{0002B73F}\\x{0002B740}-\\x{0002B81F}\\x{0002B820}-\\x{0002CEAF}\\x{0002CEB0}-\\x{0002EBEF}\\u2E80-\\u2EFF\\u2F00-\\u2FDF\\u2FF0-\\u2FFF\\u3000-\\u303F\\u31C0-\\u31EF\\u3200-\\u32FF\\u3300-\\u33FF\\uF900-\\uFAFF\\uFE30-\\uFE4F\\x{0001F200}-\\x{0001F2FF}\\x{0002F800}-\\x{0002FA1F}"); @NotNull public final String getAlphaLower() { return AlphaLower; } @NotNull
/* 207 */   private static final String AlphaUpper = INSTANCE.groupChars("A-Z\\uFF21-\\uFF3A\\u00C0-\\u00D6\\u00D8-\\u00DE\\u0100\\u0102\\u0104\\u0106\\u0108\\u010A\\u010C\\u010E\\u0110\\u0112\\u0114\\u0116\\u0118\\u011A\\u011C\\u011E\\u0120\\u0122\\u0124\\u0126\\u0128\\u012A\\u012C\\u012E\\u0130\\u0132\\u0134\\u0136\\u0139\\u013B\\u013D\\u013F\\u0141\\u0143\\u0145\\u0147\\u014A\\u014C\\u014E\\u0150\\u0152\\u0154\\u0156\\u0158\\u015A\\u015C\\u015E\\u0160\\u0162\\u0164\\u0166\\u0168\\u016A\\u016C\\u016E\\u0170\\u0172\\u0174\\u0176\\u0178\\u0179\\u017B\\u017D\\u0181\\u0182\\u0184\\u0186\\u0187\\u0189-\\u018B\\u018E-\\u0191\\u0193\\u0194\\u0196-\\u0198\\u019C\\u019D\\u019F\\u01A0\\u01A2\\u01A4\\u01A6\\u01A7\\u01A9\\u01AC\\u01AE\\u01AF\\u01B1-\\u01B3\\u01B5\\u01B7\\u01B8\\u01BC\\u01C4\\u01C7\\u01CA\\u01CD\\u01CF\\u01D1\\u01D3\\u01D5\\u01D7\\u01D9\\u01DB\\u01DE\\u01E0\\u01E2\\u01E4\\u01E6\\u01E8\\u01EA\\u01EC\\u01EE\\u01F1\\u01F4\\u01F6-\\u01F8\\u01FA\\u01FC\\u01FE\\u0200\\u0202\\u0204\\u0206\\u0208\\u020A\\u020C\\u020E\\u0210\\u0212\\u0214\\u0216\\u0218\\u021A\\u021C\\u021E\\u0220\\u0222\\u0224\\u0226\\u0228\\u022A\\u022C\\u022E\\u0230\\u0232\\u023A\\u023B\\u023D\\u023E\\u0241\\u0243-\\u0246\\u0248\\u024A\\u024C\\u024E\\u2C60\\u2C62-\\u2C64\\u2C67\\u2C69\\u2C6B\\u2C6D-\\u2C70\\u2C72\\u2C75\\u2C7E\\u2C7F \\uA722\\uA724\\uA726\\uA728\\uA72A\\uA72C\\uA72E\\uA732\\uA734\\uA736\\uA738\\uA73A\\uA73C\\uA73E\\uA740\\uA742\\uA744\\uA746\\uA748\\uA74A\\uA74C\\uA74E\\uA750\\uA752\\uA754\\uA756\\uA758\\uA75A\\uA75C\\uA75E\\uA760\\uA762\\uA764\\uA766\\uA768\\uA76A\\uA76C\\uA76E\\uA779\\uA77B\\uA77D\\uA77E\\uA780\\uA782\\uA784\\uA786\\uA78B\\uA78D\\uA790\\uA792\\uA796\\uA798\\uA79A\\uA79C\\uA79E\\uA7A0\\uA7A2\\uA7A4\\uA7A6\\uA7A8\\uA7AA-\\uA7AE\\uA7B0-\\uA7B4\\uA7B6\\uA7B8 \\u1E00\\u1E02\\u1E04\\u1E06\\u1E08\\u1E0A\\u1E0C\\u1E0E\\u1E10\\u1E12\\u1E14\\u1E16\\u1E18\\u1E1A\\u1E1C\\u1E1E\\u1E20\\u1E22\\u1E24\\u1E26\\u1E28\\u1E2A\\u1E2C\\u1E2E\\u1E30\\u1E32\\u1E34\\u1E36\\u1E38\\u1E3A\\u1E3C\\u1E3E\\u1E40\\u1E42\\u1E44\\u1E46\\u1E48\\u1E4A\\u1E4C\\u1E4E\\u1E50\\u1E52\\u1E54\\u1E56\\u1E58\\u1E5A\\u1E5C\\u1E5E\\u1E60\\u1E62\\u1E64\\u1E66\\u1E68\\u1E6A\\u1E6C\\u1E6E\\u1E70\\u1E72\\u1E74\\u1E76\\u1E78\\u1E7A\\u1E7C\\u1E7E\\u1E80\\u1E82\\u1E84\\u1E86\\u1E88\\u1E8A\\u1E8C\\u1E8E\\u1E90\\u1E92\\u1E94\\u1E9E\\u1EA0\\u1EA2\\u1EA4\\u1EA6\\u1EA8\\u1EAA\\u1EAC\\u1EAE\\u1EB0\\u1EB2\\u1EB4\\u1EB6\\u1EB8\\u1EBA\\u1EBC\\u1EBE\\u1EC0\\u1EC2\\u1EC4\\u1EC6\\u1EC8\\u1ECA\\u1ECC\\u1ECE\\u1ED0\\u1ED2\\u1ED4\\u1ED6\\u1ED8\\u1EDA\\u1EDC\\u1EDE\\u1EE0\\u1EE2\\u1EE4\\u1EE6\\u1EE8\\u1EEA\\u1EEC\\u1EEE\\u1EF0\\u1EF2\\u1EF4\\u1EF6\\u1EF8\\u1EFA\\u1EFC\\u1EFEЁА-ЯӘӨҮҖҢҺΑ-ΩΆΈΊΌΏΉΎА-ЩЮЯІЇЄҐЃЅЈЉЊЌЀЍ\\u1200-\\u137F\\u0980-\\u09FF\\u0591-\\u05F4\\uFB1D-\\uFB4F\\u0620-\\u064A\\u066E-\\u06D5\\u06E5-\\u06FF\\u0750-\\u077F\\u08A0-\\u08BD\\uFB50-\\uFBB1\\uFBD3-\\uFD3D\\uFD50-\\uFDC7\\uFDF0-\\uFDFB\\uFE70-\\uFEFC\\x{0001EE00}-\\x{0001EEBB}\\u0D80-\\u0DFF\\u0900-\\u097F\\u0C80-\\u0CFF\\u0B80-\\u0BFF\\u0C00-\\u0C7F\\uAC00-\\uD7AF\\u1100-\\u11FF\\u4E00-\\u62FF\\u6300-\\u77FF\\u7800-\\u8CFF\\u8D00-\\u9FFF\\u3400-\\u4DBF\\x{00020000}-\\x{000215FF}\\x{00021600}-\\x{000230FF}\\x{00023100}-\\x{000245FF}\\x{00024600}-\\x{000260FF}\\x{00026100}-\\x{000275FF}\\x{00027600}-\\x{000290FF}\\x{00029100}-\\x{0002A6DF}\\x{0002A700}-\\x{0002B73F}\\x{0002B740}-\\x{0002B81F}\\x{0002B820}-\\x{0002CEAF}\\x{0002CEB0}-\\x{0002EBEF}\\u2E80-\\u2EFF\\u2F00-\\u2FDF\\u2FF0-\\u2FFF\\u3000-\\u303F\\u31C0-\\u31EF\\u3200-\\u32FF\\u3300-\\u33FF\\uF900-\\uFAFF\\uFE30-\\uFE4F\\x{0001F200}-\\x{0001F2FF}\\x{0002F800}-\\x{0002FA1F}"); @NotNull public final String getAlphaUpper() { return AlphaUpper; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static final String units = "km km² km³ m m² m³ dm dm² dm³ cm cm² cm³ mm mm² mm³ ha µm nm yd in ft kg g mg µg t lb oz m/s km/h kmh mph hPa Pa mbar mb MB kb KB gb GB tb TB T G M K % км км² км³ м м² м³ дм дм² дм³ см см² см³ мм мм² мм³ нм кг г мг м/с км/ч кПа Па мбар Кб КБ кб Мб МБ мб Гб ГБ гб Тб ТБ тб كم كم² كم³ م م² م³ سم سم² سم³ مم مم² مم³ كم غرام جرام جم كغ ملغ كوب اكواب";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static final String currency = "\\$ £ € ¥ ฿ US\\$ C\\$ A\\$ ₽ ﷼ ₴";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static final String punct = "… …… , : ; ! \\? ¿ ؟ ¡ \\( \\) \\[ \\] \\{ \\} < > _ # \\* & 。 ？ ！ ， 、 ； ： ～ · । ، ۔ ؛ ٪";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static final String quotes = " ' \" ” “ ` ‘ ´ ’ ‚ , „ » « 「 」 『 』 （ ） 〔 〕 【 】 《 》 〈 〉";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static final String hyphens = "- – — -- --- —— ~";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static final String otherSymbols = "\\u00A6\\u00A9\\u00AE\\u00B0\\u0482\\u058D\\u058E\\u060E\\u060F\\u06DE\\u06E9\\u06FD\\u06FE\\u07F6\\u09FA\\u0B70\\u0BF3-\\u0BF8\\u0BFA\\u0C7F\\u0D4F\\u0D79\\u0F01-\\u0F03\\u0F13\\u0F15-\\u0F17\\u0F1A-\\u0F1F\\u0F34\\u0F36\\u0F38\\u0FBE-\\u0FC5\\u0FC7-\\u0FCC\\u0FCE\\u0FCF\\u0FD5-\\u0FD8\\u109E\\u109F\\u1390-\\u1399\\u1940\\u19DE-\\u19FF\\u1B61-\\u1B6A\\u1B74-\\u1B7C\\u2100\\u2101\\u2103-\\u2106\\u2108\\u2109\\u2114\\u2116\\u2117\\u211E-\\u2123\\u2125\\u2127\\u2129\\u212E\\u213A\\u213B\\u214A\\u214C\\u214D\\u214F\\u218A\\u218B\\u2195-\\u2199\\u219C-\\u219F\\u21A1\\u21A2\\u21A4\\u21A5\\u21A7-\\u21AD\\u21AF-\\u21CD\\u21D0\\u21D1\\u21D3\\u21D5-\\u21F3\\u2300-\\u2307\\u230C-\\u231F\\u2322-\\u2328\\u232B-\\u237B\\u237D-\\u239A\\u23B4-\\u23DB\\u23E2-\\u2426\\u2440-\\u244A\\u249C-\\u24E9\\u2500-\\u25B6\\u25B8-\\u25C0\\u25C2-\\u25F7\\u2600-\\u266E\\u2670-\\u2767\\u2794-\\u27BF\\u2800-\\u28FF\\u2B00-\\u2B2F\\u2B45\\u2B46\\u2B4D-\\u2B73\\u2B76-\\u2B95\\u2B98-\\u2BC8\\u2BCA-\\u2BFE\\u2CE5-\\u2CEA\\u2E80-\\u2E99\\u2E9B-\\u2EF3\\u2F00-\\u2FD5\\u2FF0-\\u2FFB\\u3004\\u3012\\u3013\\u3020\\u3036\\u3037\\u303E\\u303F\\u3190\\u3191\\u3196-\\u319F\\u31C0-\\u31E3\\u3200-\\u321E\\u322A-\\u3247\\u3250\\u3260-\\u327F\\u328A-\\u32B0\\u32C0-\\u32FE\\u3300-\\u33FF\\u4DC0-\\u4DFF\\uA490-\\uA4C6\\uA828-\\uA82B\\uA836\\uA837\\uA839\\uAA77-\\uAA79\\uFDFD\\uFFE4\\uFFE8\\uFFED\\uFFEE\\uFFFC\\uFFFD\\x{00010137}-\\x{0001013F}\\x{00010179}-\\x{00010189}\\x{0001018C}-\\x{0001018E}\\x{00010190}-\\x{0001019B}\\x{000101A0}\\x{000101D0}-\\x{000101FC}\\x{00010877}\\x{00010878}\\x{00010AC8}\\x{0001173F}\\x{00016B3C}-\\x{00016B3F}\\x{00016B45}\\x{0001BC9C}\\x{0001D000}-\\x{0001D0F5}\\x{0001D100}-\\x{0001D126}\\x{0001D129}-\\x{0001D164}\\x{0001D16A}-\\x{0001D16C}\\x{0001D183}\\x{0001D184}\\x{0001D18C}-\\x{0001D1A9}\\x{0001D1AE}-\\x{0001D1E8}\\x{0001D200}-\\x{0001D241}\\x{0001D245}\\x{0001D300}-\\x{0001D356}\\x{0001D800}-\\x{0001D9FF}\\x{0001DA37}-\\x{0001DA3A}\\x{0001DA6D}-\\x{0001DA74}\\x{0001DA76}-\\x{0001DA83}\\x{0001DA85}\\x{0001DA86}\\x{0001ECAC}\\x{0001F000}-\\x{0001F02B}\\x{0001F030}-\\x{0001F093}\\x{0001F0A0}-\\x{0001F0AE}\\x{0001F0B1}-\\x{0001F0BF}\\x{0001F0C1}-\\x{0001F0CF}\\x{0001F0D1}-\\x{0001F0F5}\\x{0001F110}-\\x{0001F16B}\\x{0001F170}-\\x{0001F1AC}\\x{0001F1E6}-\\x{0001F202}\\x{0001F210}-\\x{0001F23B}\\x{0001F240}-\\x{0001F248}\\x{0001F250}\\x{0001F251}\\x{0001F260}-\\x{0001F265}\\x{0001F300}-\\x{0001F3FA}\\x{0001F400}-\\x{0001F6D4}\\x{0001F6E0}-\\x{0001F6EC}\\x{0001F6F0}-\\x{0001F6F9}\\x{0001F700}-\\x{0001F773}\\x{0001F780}-\\x{0001F7D8}\\x{0001F800}-\\x{0001F80B}\\x{0001F810}-\\x{0001F847}\\x{0001F850}-\\x{0001F859}\\x{0001F860}-\\x{0001F887}\\x{0001F890}-\\x{0001F8AD}\\x{0001F900}-\\x{0001F90B}\\x{0001F910}-\\x{0001F93E}\\x{0001F940}-\\x{0001F970}\\x{0001F973}-\\x{0001F976}\\x{0001F97A}\\x{0001F97C}-\\x{0001F9A2}\\x{0001F9B0}-\\x{0001F9B9}\\x{0001F9C0}-\\x{0001F9C2}\\x{0001F9D0}-\\x{0001F9FF}\\x{0001FA60}-\\x{0001FA6D}";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 256 */   private static final String Units = INSTANCE.mergeChars("km km² km³ m m² m³ dm dm² dm³ cm cm² cm³ mm mm² mm³ ha µm nm yd in ft kg g mg µg t lb oz m/s km/h kmh mph hPa Pa mbar mb MB kb KB gb GB tb TB T G M K % км км² км³ м м² м³ дм дм² дм³ см см² см³ мм мм² мм³ нм кг г мг м/с км/ч кПа Па мбар Кб КБ кб Мб МБ мб Гб ГБ гб Тб ТБ тб كم كم² كم³ م م² م³ سم سم² سم³ مم مم² مم³ كم غرام جرام جم كغ ملغ كوب اكواب"); @NotNull public final String getUnits() { return Units; } @NotNull
/* 257 */   private static final String Currency = INSTANCE.mergeChars("\\$ £ € ¥ ฿ US\\$ C\\$ A\\$ ₽ ﷼ ₴"); @NotNull public final String getCurrency() { return Currency; } @NotNull
/* 258 */   private static final String Punct = INSTANCE.mergeChars("… …… , : ; ! \\? ¿ ؟ ¡ \\( \\) \\[ \\] \\{ \\} < > _ # \\* & 。 ？ ！ ， 、 ； ： ～ · । ، ۔ ؛ ٪"); @NotNull public final String getPunct() { return Punct; } @NotNull
/* 259 */   private static final String Hyphens = INSTANCE.mergeChars("- – — -- --- —— ~"); @NotNull public final String getHyphens() { return Hyphens; }
/*     */    @NotNull
/*     */   public static final String Icons = "\\u00A6\\u00A9\\u00AE\\u00B0\\u0482\\u058D\\u058E\\u060E\\u060F\\u06DE\\u06E9\\u06FD\\u06FE\\u07F6\\u09FA\\u0B70\\u0BF3-\\u0BF8\\u0BFA\\u0C7F\\u0D4F\\u0D79\\u0F01-\\u0F03\\u0F13\\u0F15-\\u0F17\\u0F1A-\\u0F1F\\u0F34\\u0F36\\u0F38\\u0FBE-\\u0FC5\\u0FC7-\\u0FCC\\u0FCE\\u0FCF\\u0FD5-\\u0FD8\\u109E\\u109F\\u1390-\\u1399\\u1940\\u19DE-\\u19FF\\u1B61-\\u1B6A\\u1B74-\\u1B7C\\u2100\\u2101\\u2103-\\u2106\\u2108\\u2109\\u2114\\u2116\\u2117\\u211E-\\u2123\\u2125\\u2127\\u2129\\u212E\\u213A\\u213B\\u214A\\u214C\\u214D\\u214F\\u218A\\u218B\\u2195-\\u2199\\u219C-\\u219F\\u21A1\\u21A2\\u21A4\\u21A5\\u21A7-\\u21AD\\u21AF-\\u21CD\\u21D0\\u21D1\\u21D3\\u21D5-\\u21F3\\u2300-\\u2307\\u230C-\\u231F\\u2322-\\u2328\\u232B-\\u237B\\u237D-\\u239A\\u23B4-\\u23DB\\u23E2-\\u2426\\u2440-\\u244A\\u249C-\\u24E9\\u2500-\\u25B6\\u25B8-\\u25C0\\u25C2-\\u25F7\\u2600-\\u266E\\u2670-\\u2767\\u2794-\\u27BF\\u2800-\\u28FF\\u2B00-\\u2B2F\\u2B45\\u2B46\\u2B4D-\\u2B73\\u2B76-\\u2B95\\u2B98-\\u2BC8\\u2BCA-\\u2BFE\\u2CE5-\\u2CEA\\u2E80-\\u2E99\\u2E9B-\\u2EF3\\u2F00-\\u2FD5\\u2FF0-\\u2FFB\\u3004\\u3012\\u3013\\u3020\\u3036\\u3037\\u303E\\u303F\\u3190\\u3191\\u3196-\\u319F\\u31C0-\\u31E3\\u3200-\\u321E\\u322A-\\u3247\\u3250\\u3260-\\u327F\\u328A-\\u32B0\\u32C0-\\u32FE\\u3300-\\u33FF\\u4DC0-\\u4DFF\\uA490-\\uA4C6\\uA828-\\uA82B\\uA836\\uA837\\uA839\\uAA77-\\uAA79\\uFDFD\\uFFE4\\uFFE8\\uFFED\\uFFEE\\uFFFC\\uFFFD\\x{00010137}-\\x{0001013F}\\x{00010179}-\\x{00010189}\\x{0001018C}-\\x{0001018E}\\x{00010190}-\\x{0001019B}\\x{000101A0}\\x{000101D0}-\\x{000101FC}\\x{00010877}\\x{00010878}\\x{00010AC8}\\x{0001173F}\\x{00016B3C}-\\x{00016B3F}\\x{00016B45}\\x{0001BC9C}\\x{0001D000}-\\x{0001D0F5}\\x{0001D100}-\\x{0001D126}\\x{0001D129}-\\x{0001D164}\\x{0001D16A}-\\x{0001D16C}\\x{0001D183}\\x{0001D184}\\x{0001D18C}-\\x{0001D1A9}\\x{0001D1AE}-\\x{0001D1E8}\\x{0001D200}-\\x{0001D241}\\x{0001D245}\\x{0001D300}-\\x{0001D356}\\x{0001D800}-\\x{0001D9FF}\\x{0001DA37}-\\x{0001DA3A}\\x{0001DA6D}-\\x{0001DA74}\\x{0001DA76}-\\x{0001DA83}\\x{0001DA85}\\x{0001DA86}\\x{0001ECAC}\\x{0001F000}-\\x{0001F02B}\\x{0001F030}-\\x{0001F093}\\x{0001F0A0}-\\x{0001F0AE}\\x{0001F0B1}-\\x{0001F0BF}\\x{0001F0C1}-\\x{0001F0CF}\\x{0001F0D1}-\\x{0001F0F5}\\x{0001F110}-\\x{0001F16B}\\x{0001F170}-\\x{0001F1AC}\\x{0001F1E6}-\\x{0001F202}\\x{0001F210}-\\x{0001F23B}\\x{0001F240}-\\x{0001F248}\\x{0001F250}\\x{0001F251}\\x{0001F260}-\\x{0001F265}\\x{0001F300}-\\x{0001F3FA}\\x{0001F400}-\\x{0001F6D4}\\x{0001F6E0}-\\x{0001F6EC}\\x{0001F6F0}-\\x{0001F6F9}\\x{0001F700}-\\x{0001F773}\\x{0001F780}-\\x{0001F7D8}\\x{0001F800}-\\x{0001F80B}\\x{0001F810}-\\x{0001F847}\\x{0001F850}-\\x{0001F859}\\x{0001F860}-\\x{0001F887}\\x{0001F890}-\\x{0001F8AD}\\x{0001F900}-\\x{0001F90B}\\x{0001F910}-\\x{0001F93E}\\x{0001F940}-\\x{0001F970}\\x{0001F973}-\\x{0001F976}\\x{0001F97A}\\x{0001F97C}-\\x{0001F9A2}\\x{0001F9B0}-\\x{0001F9B9}\\x{0001F9C0}-\\x{0001F9C2}\\x{0001F9D0}-\\x{0001F9FF}\\x{0001FA60}-\\x{0001FA6D}"; @NotNull
/* 262 */   private static final List<String> ListUnits = INSTANCE.splitChars("km km² km³ m m² m³ dm dm² dm³ cm cm² cm³ mm mm² mm³ ha µm nm yd in ft kg g mg µg t lb oz m/s km/h kmh mph hPa Pa mbar mb MB kb KB gb GB tb TB T G M K % км км² км³ м м² м³ дм дм² дм³ см см² см³ мм мм² мм³ нм кг г мг м/с км/ч кПа Па мбар Кб КБ кб Мб МБ мб Гб ГБ гб Тб ТБ тб كم كم² كم³ م م² م³ سم سم² سم³ مم مم² مم³ كم غرام جرام جم كغ ملغ كوب اكواب"); @NotNull public final List<String> getListUnits() { return ListUnits; } @NotNull
/* 263 */   private static final List<String> ListCurrency = INSTANCE.splitChars("\\$ £ € ¥ ฿ US\\$ C\\$ A\\$ ₽ ﷼ ₴"); @NotNull public final List<String> getListCurrency() { return ListCurrency; } @NotNull
/* 264 */   private static final List<String> ListQuotes = INSTANCE.splitChars(" ' \" ” “ ` ‘ ´ ’ ‚ , „ » « 「 」 『 』 （ ） 〔 〕 【 】 《 》 〈 〉"); @NotNull public final List<String> getListQuotes() { return ListQuotes; } @NotNull
/* 265 */   private static final List<String> ListPunct = INSTANCE.splitChars("… …… , : ; ! \\? ¿ ؟ ¡ \\( \\) \\[ \\] \\{ \\} < > _ # \\* & 。 ？ ！ ， 、 ； ： ～ · । ، ۔ ؛ ٪"); @NotNull public final List<String> getListPunct() { return ListPunct; } @NotNull
/* 266 */   private static final List<String> ListHyphens = INSTANCE.splitChars("- – — -- --- —— ~"); @NotNull private static final List<String> ListEllipses; @NotNull public final List<String> getListHyphens() { return ListHyphens; } @NotNull
/* 267 */   public final List<String> getListEllipses() { return ListEllipses; } static { String[] arrayOfString = new String[2]; arrayOfString[0] = "\\.\\.+"; arrayOfString[1] = "…"; ListEllipses = CollectionsKt.listOf((Object[])arrayOfString); } @NotNull
/* 268 */   private static final List<String> ListIcons = CollectionsKt.listOf("[\\u00A6\\u00A9\\u00AE\\u00B0\\u0482\\u058D\\u058E\\u060E\\u060F\\u06DE\\u06E9\\u06FD\\u06FE\\u07F6\\u09FA\\u0B70\\u0BF3-\\u0BF8\\u0BFA\\u0C7F\\u0D4F\\u0D79\\u0F01-\\u0F03\\u0F13\\u0F15-\\u0F17\\u0F1A-\\u0F1F\\u0F34\\u0F36\\u0F38\\u0FBE-\\u0FC5\\u0FC7-\\u0FCC\\u0FCE\\u0FCF\\u0FD5-\\u0FD8\\u109E\\u109F\\u1390-\\u1399\\u1940\\u19DE-\\u19FF\\u1B61-\\u1B6A\\u1B74-\\u1B7C\\u2100\\u2101\\u2103-\\u2106\\u2108\\u2109\\u2114\\u2116\\u2117\\u211E-\\u2123\\u2125\\u2127\\u2129\\u212E\\u213A\\u213B\\u214A\\u214C\\u214D\\u214F\\u218A\\u218B\\u2195-\\u2199\\u219C-\\u219F\\u21A1\\u21A2\\u21A4\\u21A5\\u21A7-\\u21AD\\u21AF-\\u21CD\\u21D0\\u21D1\\u21D3\\u21D5-\\u21F3\\u2300-\\u2307\\u230C-\\u231F\\u2322-\\u2328\\u232B-\\u237B\\u237D-\\u239A\\u23B4-\\u23DB\\u23E2-\\u2426\\u2440-\\u244A\\u249C-\\u24E9\\u2500-\\u25B6\\u25B8-\\u25C0\\u25C2-\\u25F7\\u2600-\\u266E\\u2670-\\u2767\\u2794-\\u27BF\\u2800-\\u28FF\\u2B00-\\u2B2F\\u2B45\\u2B46\\u2B4D-\\u2B73\\u2B76-\\u2B95\\u2B98-\\u2BC8\\u2BCA-\\u2BFE\\u2CE5-\\u2CEA\\u2E80-\\u2E99\\u2E9B-\\u2EF3\\u2F00-\\u2FD5\\u2FF0-\\u2FFB\\u3004\\u3012\\u3013\\u3020\\u3036\\u3037\\u303E\\u303F\\u3190\\u3191\\u3196-\\u319F\\u31C0-\\u31E3\\u3200-\\u321E\\u322A-\\u3247\\u3250\\u3260-\\u327F\\u328A-\\u32B0\\u32C0-\\u32FE\\u3300-\\u33FF\\u4DC0-\\u4DFF\\uA490-\\uA4C6\\uA828-\\uA82B\\uA836\\uA837\\uA839\\uAA77-\\uAA79\\uFDFD\\uFFE4\\uFFE8\\uFFED\\uFFEE\\uFFFC\\uFFFD\\x{00010137}-\\x{0001013F}\\x{00010179}-\\x{00010189}\\x{0001018C}-\\x{0001018E}\\x{00010190}-\\x{0001019B}\\x{000101A0}\\x{000101D0}-\\x{000101FC}\\x{00010877}\\x{00010878}\\x{00010AC8}\\x{0001173F}\\x{00016B3C}-\\x{00016B3F}\\x{00016B45}\\x{0001BC9C}\\x{0001D000}-\\x{0001D0F5}\\x{0001D100}-\\x{0001D126}\\x{0001D129}-\\x{0001D164}\\x{0001D16A}-\\x{0001D16C}\\x{0001D183}\\x{0001D184}\\x{0001D18C}-\\x{0001D1A9}\\x{0001D1AE}-\\x{0001D1E8}\\x{0001D200}-\\x{0001D241}\\x{0001D245}\\x{0001D300}-\\x{0001D356}\\x{0001D800}-\\x{0001D9FF}\\x{0001DA37}-\\x{0001DA3A}\\x{0001DA6D}-\\x{0001DA74}\\x{0001DA76}-\\x{0001DA83}\\x{0001DA85}\\x{0001DA86}\\x{0001ECAC}\\x{0001F000}-\\x{0001F02B}\\x{0001F030}-\\x{0001F093}\\x{0001F0A0}-\\x{0001F0AE}\\x{0001F0B1}-\\x{0001F0BF}\\x{0001F0C1}-\\x{0001F0CF}\\x{0001F0D1}-\\x{0001F0F5}\\x{0001F110}-\\x{0001F16B}\\x{0001F170}-\\x{0001F1AC}\\x{0001F1E6}-\\x{0001F202}\\x{0001F210}-\\x{0001F23B}\\x{0001F240}-\\x{0001F248}\\x{0001F250}\\x{0001F251}\\x{0001F260}-\\x{0001F265}\\x{0001F300}-\\x{0001F3FA}\\x{0001F400}-\\x{0001F6D4}\\x{0001F6E0}-\\x{0001F6EC}\\x{0001F6F0}-\\x{0001F6F9}\\x{0001F700}-\\x{0001F773}\\x{0001F780}-\\x{0001F7D8}\\x{0001F800}-\\x{0001F80B}\\x{0001F810}-\\x{0001F847}\\x{0001F850}-\\x{0001F859}\\x{0001F860}-\\x{0001F887}\\x{0001F890}-\\x{0001F8AD}\\x{0001F900}-\\x{0001F90B}\\x{0001F910}-\\x{0001F93E}\\x{0001F940}-\\x{0001F970}\\x{0001F973}-\\x{0001F976}\\x{0001F97A}\\x{0001F97C}-\\x{0001F9A2}\\x{0001F9B0}-\\x{0001F9B9}\\x{0001F9C0}-\\x{0001F9C2}\\x{0001F9D0}-\\x{0001F9FF}\\x{0001FA60}-\\x{0001FA6D}]"); @NotNull public final List<String> getListIcons() { return ListIcons; }
/*     */    @NotNull
/* 270 */   private static final String ConcatQuotes = INSTANCE.groupChars(" ' \" ” “ ` ‘ ´ ’ ‚ , „ » « 「 」 『 』 （ ） 〔 〕 【 】 《 》 〈 〉"); @NotNull public final String getConcatQuotes() { return ConcatQuotes; }
/*     */    @NotNull
/* 272 */   private static final String NonContractionConcatQuotes = INSTANCE.groupChars(StringsKt.replace$default(" ' \" ” “ ` ‘ ´ ’ ‚ , „ » « 「 」 『 』 （ ） 〔 〕 【 】 《 》 〈 〉", "'", "", false, 4, null)); @NotNull public static final String ConcanIcons = "\\u00A6\\u00A9\\u00AE\\u00B0\\u0482\\u058D\\u058E\\u060E\\u060F\\u06DE\\u06E9\\u06FD\\u06FE\\u07F6\\u09FA\\u0B70\\u0BF3-\\u0BF8\\u0BFA\\u0C7F\\u0D4F\\u0D79\\u0F01-\\u0F03\\u0F13\\u0F15-\\u0F17\\u0F1A-\\u0F1F\\u0F34\\u0F36\\u0F38\\u0FBE-\\u0FC5\\u0FC7-\\u0FCC\\u0FCE\\u0FCF\\u0FD5-\\u0FD8\\u109E\\u109F\\u1390-\\u1399\\u1940\\u19DE-\\u19FF\\u1B61-\\u1B6A\\u1B74-\\u1B7C\\u2100\\u2101\\u2103-\\u2106\\u2108\\u2109\\u2114\\u2116\\u2117\\u211E-\\u2123\\u2125\\u2127\\u2129\\u212E\\u213A\\u213B\\u214A\\u214C\\u214D\\u214F\\u218A\\u218B\\u2195-\\u2199\\u219C-\\u219F\\u21A1\\u21A2\\u21A4\\u21A5\\u21A7-\\u21AD\\u21AF-\\u21CD\\u21D0\\u21D1\\u21D3\\u21D5-\\u21F3\\u2300-\\u2307\\u230C-\\u231F\\u2322-\\u2328\\u232B-\\u237B\\u237D-\\u239A\\u23B4-\\u23DB\\u23E2-\\u2426\\u2440-\\u244A\\u249C-\\u24E9\\u2500-\\u25B6\\u25B8-\\u25C0\\u25C2-\\u25F7\\u2600-\\u266E\\u2670-\\u2767\\u2794-\\u27BF\\u2800-\\u28FF\\u2B00-\\u2B2F\\u2B45\\u2B46\\u2B4D-\\u2B73\\u2B76-\\u2B95\\u2B98-\\u2BC8\\u2BCA-\\u2BFE\\u2CE5-\\u2CEA\\u2E80-\\u2E99\\u2E9B-\\u2EF3\\u2F00-\\u2FD5\\u2FF0-\\u2FFB\\u3004\\u3012\\u3013\\u3020\\u3036\\u3037\\u303E\\u303F\\u3190\\u3191\\u3196-\\u319F\\u31C0-\\u31E3\\u3200-\\u321E\\u322A-\\u3247\\u3250\\u3260-\\u327F\\u328A-\\u32B0\\u32C0-\\u32FE\\u3300-\\u33FF\\u4DC0-\\u4DFF\\uA490-\\uA4C6\\uA828-\\uA82B\\uA836\\uA837\\uA839\\uAA77-\\uAA79\\uFDFD\\uFFE4\\uFFE8\\uFFED\\uFFEE\\uFFFC\\uFFFD\\x{00010137}-\\x{0001013F}\\x{00010179}-\\x{00010189}\\x{0001018C}-\\x{0001018E}\\x{00010190}-\\x{0001019B}\\x{000101A0}\\x{000101D0}-\\x{000101FC}\\x{00010877}\\x{00010878}\\x{00010AC8}\\x{0001173F}\\x{00016B3C}-\\x{00016B3F}\\x{00016B45}\\x{0001BC9C}\\x{0001D000}-\\x{0001D0F5}\\x{0001D100}-\\x{0001D126}\\x{0001D129}-\\x{0001D164}\\x{0001D16A}-\\x{0001D16C}\\x{0001D183}\\x{0001D184}\\x{0001D18C}-\\x{0001D1A9}\\x{0001D1AE}-\\x{0001D1E8}\\x{0001D200}-\\x{0001D241}\\x{0001D245}\\x{0001D300}-\\x{0001D356}\\x{0001D800}-\\x{0001D9FF}\\x{0001DA37}-\\x{0001DA3A}\\x{0001DA6D}-\\x{0001DA74}\\x{0001DA76}-\\x{0001DA83}\\x{0001DA85}\\x{0001DA86}\\x{0001ECAC}\\x{0001F000}-\\x{0001F02B}\\x{0001F030}-\\x{0001F093}\\x{0001F0A0}-\\x{0001F0AE}\\x{0001F0B1}-\\x{0001F0BF}\\x{0001F0C1}-\\x{0001F0CF}\\x{0001F0D1}-\\x{0001F0F5}\\x{0001F110}-\\x{0001F16B}\\x{0001F170}-\\x{0001F1AC}\\x{0001F1E6}-\\x{0001F202}\\x{0001F210}-\\x{0001F23B}\\x{0001F240}-\\x{0001F248}\\x{0001F250}\\x{0001F251}\\x{0001F260}-\\x{0001F265}\\x{0001F300}-\\x{0001F3FA}\\x{0001F400}-\\x{0001F6D4}\\x{0001F6E0}-\\x{0001F6EC}\\x{0001F6F0}-\\x{0001F6F9}\\x{0001F700}-\\x{0001F773}\\x{0001F780}-\\x{0001F7D8}\\x{0001F800}-\\x{0001F80B}\\x{0001F810}-\\x{0001F847}\\x{0001F850}-\\x{0001F859}\\x{0001F860}-\\x{0001F887}\\x{0001F890}-\\x{0001F8AD}\\x{0001F900}-\\x{0001F90B}\\x{0001F910}-\\x{0001F93E}\\x{0001F940}-\\x{0001F970}\\x{0001F973}-\\x{0001F976}\\x{0001F97A}\\x{0001F97C}-\\x{0001F9A2}\\x{0001F9B0}-\\x{0001F9B9}\\x{0001F9C0}-\\x{0001F9C2}\\x{0001F9D0}-\\x{0001F9FF}\\x{0001FA60}-\\x{0001FA6D}"; @NotNull public final String getNonContractionConcatQuotes() { return NonContractionConcatQuotes; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final List<String> splitChars(String string) {
/* 281 */     String[] arrayOfString = new String[1]; arrayOfString[0] = " "; return StringsKt.split$default(StringsKt.trim(string).toString(), arrayOfString, false, 0, 6, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final String mergeChars(String string) {
/* 288 */     return StringsKt.replace$default(StringsKt.trim(string).toString(), " ", "|", false, 4, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final String groupChars(String string) {
/* 295 */     return StringsKt.replace$default(StringsKt.trim(string).toString(), " ", "", false, 4, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\spacy\SpacyTokenizerCharClasses.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */