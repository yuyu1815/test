/*     */ package ai.grazie.utils.mpp.geo;
/*     */ import kotlin.Metadata;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ @Serializable
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\023\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\003\b\002\b\001\030\000 \0022\b\022\004\022\0020\0000\001:\002\002B\027\b\002\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\b\020\007R\024\020\t\032\0020\0038VX\004¢\006\006\032\004\b\n\020\007j\002\b\013j\002\b\fj\002\b\rj\002\b\016j\002\b\017j\002\b\020j\002\b\021j\002\b\022j\002\b\023j\002\b\024j\002\b\025j\002\b\026j\002\b\027j\002\b\030j\002\b\031j\002\b\032j\002\b\033j\002\b\034j\002\b\035j\002\b\036j\002\b\037j\002\b j\002\b!j\002\b\"j\002\b#j\002\b$j\002\b%j\002\b&j\002\b'j\002\b(j\002\b)j\002\b*j\002\b+j\002\b,j\002\b-j\002\b.j\002\b/j\002\b0j\002\b1j\002\b2j\002\b3j\002\b4j\002\b5j\002\b6j\002\b7j\002\b8j\002\b9j\002\b:j\002\b;j\002\b<j\002\b=j\002\b>j\002\b?j\002\b@j\002\bAj\002\bBj\002\bCj\002\bDj\002\bEj\002\bFj\002\bGj\002\bHj\002\bIj\002\bJj\002\bKj\002\bLj\002\bMj\002\bNj\002\bOj\002\bPj\002\bQj\002\bRj\002\bSj\002\bTj\002\bUj\002\bVj\002\bWj\002\bXj\002\bYj\002\bZj\002\b[j\002\b\\j\002\b]j\002\b^j\002\b_j\002\b`j\002\baj\002\bbj\002\bcj\002\bdj\002\bej\002\bfj\002\bgj\002\bhj\002\bij\002\bjj\002\bkj\002\blj\002\bmj\002\bnj\002\boj\002\bpj\002\bqj\002\brj\002\bsj\002\btj\002\buj\002\bvj\002\bwj\002\bxj\002\byj\002\bzj\002\b{j\002\b|j\002\b}j\002\b~j\002\bj\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b\001j\003\b \001j\003\b¡\001j\003\b¢\001j\003\b£\001j\003\b¤\001j\003\b¥\001j\003\b¦\001j\003\b§\001j\003\b¨\001j\003\b©\001j\003\bª\001j\003\b«\001j\003\b¬\001j\003\b­\001j\003\b®\001j\003\b¯\001j\003\b°\001j\003\b±\001j\003\b²\001j\003\b³\001j\003\b´\001j\003\bµ\001j\003\b¶\001j\003\b·\001j\003\b¸\001j\003\b¹\001j\003\bº\001j\003\b»\001j\003\b¼\001j\003\b½\001j\003\b¾\001j\003\b¿\001j\003\bÀ\001j\003\bÁ\001j\003\bÂ\001j\003\bÃ\001j\003\bÄ\001j\003\bÅ\001j\003\bÆ\001j\003\bÇ\001j\003\bÈ\001j\003\bÉ\001j\003\bÊ\001j\003\bË\001j\003\bÌ\001j\003\bÍ\001j\003\bÎ\001j\003\bÏ\001j\003\bÐ\001j\003\bÑ\001j\003\bÒ\001j\003\bÓ\001j\003\bÔ\001j\003\bÕ\001j\003\bÖ\001j\003\b×\001j\003\bØ\001j\003\bÙ\001j\003\bÚ\001j\003\bÛ\001j\003\bÜ\001j\003\bÝ\001j\003\bÞ\001j\003\bß\001j\003\bà\001j\003\bá\001j\003\bâ\001j\003\bã\001j\003\bä\001j\003\bå\001j\003\bæ\001j\003\bç\001j\003\bè\001j\003\bé\001j\003\bê\001j\003\bë\001j\003\bì\001j\003\bí\001j\003\bî\001j\003\bï\001j\003\bð\001j\003\bñ\001j\003\bò\001j\003\bó\001j\003\bô\001j\003\bõ\001j\003\bö\001j\003\b÷\001j\003\bø\001j\003\bù\001j\003\bú\001j\003\bû\001j\003\bü\001j\003\bý\001j\003\bþ\001j\003\bÿ\001j\003\b\002j\003\b\002j\003\b\002j\003\b\002¨\006\002"}, d2 = {"Lai/grazie/utils/mpp/geo/CountryISO;", "", "alpha2", "", "alpha3", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAlpha2", "()Ljava/lang/String;", "getAlpha3", "display", "getDisplay", "AFGHANISTAN", "ALAND_ISLANDS", "ALBANIA", "ALGERIA", "AMERICAN_SAMOA", "ANDORRA", "ANGOLA", "ANGUILLA", "ANTARCTICA", "ANTIGUA_AND_BARBUDA", "ARGENTINA", "ARMENIA", "ARUBA", "AUSTRALIA", "AUSTRIA", "AZERBAIJAN", "BAHAMAS", "BAHRAIN", "BANGLADESH", "BARBADOS", "BELARUS", "BELGIUM", "BELIZE", "BENIN", "BERMUDA", "BHUTAN", "BOLIVIA_PLURINATIONAL_STATE_OF", "BONAIRE_SINT_EUSTATIUS_AND_SABA", "BOSNIA_AND_HERZEGOVINA", "BOTSWANA", "BOUVET_ISLAND", "BRAZIL", "BRITISH_INDIAN_OCEAN_TERRITORY", "BRUNEI_DARUSSALAM", "BULGARIA", "BURKINA_FASO", "BURUNDI", "CABO_VERDE", "CAMBODIA", "CAMEROON", "CANADA", "CAYMAN_ISLANDS", "CENTRAL_AFRICAN_REPUBLIC", "CHAD", "CHILE", "CHINA", "CHRISTMAS_ISLAND", "COCOS_KEELING_ISLANDS", "COLOMBIA", "COMOROS", "CONGO", "CONGO_DEMOCRATIC_REPUBLIC_OF_THE", "COOK_ISLANDS", "COSTA_RICA", "COTE_DIVOIRE", "CROATIA", "CUBA", "CURACAO", "CYPRUS", "CZECHIA", "DENMARK", "DJIBOUTI", "DOMINICA", "DOMINICAN_REPUBLIC", "ECUADOR", "EGYPT", "EL_SALVADOR", "EQUATORIAL_GUINEA", "ERITREA", "ESTONIA", "ESWATINI", "ETHIOPIA", "FALKLAND_ISLANDS_MALVINAS", "FAROE_ISLANDS", "FIJI", "FINLAND", "FRANCE", "FRENCH_GUIANA", "FRENCH_POLYNESIA", "FRENCH_SOUTHERN_TERRITORIES", "GABON", "GAMBIA", "GEORGIA", "GERMANY", "GHANA", "GIBRALTAR", "GREECE", "GREENLAND", "GRENADA", "GUADELOUPE", "GUAM", "GUATEMALA", "GUERNSEY", "GUINEA", "GUINEA_BISSAU", "GUYANA", "HAITI", "HEARD_ISLAND_AND_MCDONALD_ISLANDS", "HOLY_SEE", "HONDURAS", "HONG_KONG", "HUNGARY", "ICELAND", "INDIA", "INDONESIA", "IRAN_ISLAMIC_REPUBLIC_OF", "IRAQ", "IRELAND", "ISLE_OF_MAN", "ISRAEL", "ITALY", "JAMAICA", "JAPAN", "JERSEY", "JORDAN", "KAZAKHSTAN", "KENYA", "KIRIBATI", "KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF", "KOREA_REPUBLIC_OF", "KUWAIT", "KYRGYZSTAN", "LAO_PEOPLES_DEMOCRATIC_REPUBLIC", "LATVIA", "LEBANON", "LESOTHO", "LIBERIA", "LIBYA", "LIECHTENSTEIN", "LITHUANIA", "LUXEMBOURG", "MACAO", "MADAGASCAR", "MALAWI", "MALAYSIA", "MALDIVES", "MALI", "MALTA", "MARSHALL_ISLANDS", "MARTINIQUE", "MAURITANIA", "MAURITIUS", "MAYOTTE", "MEXICO", "MICRONESIA_FEDERATED_STATES_OF", "MOLDOVA_REPUBLIC_OF", "MONACO", "MONGOLIA", "MONTENEGRO", "MONTSERRAT", "MOROCCO", "MOZAMBIQUE", "MYANMAR", "NAMIBIA", "NAURU", "NEPAL", "NETHERLANDS_KINGDOM_OF_THE", "NEW_CALEDONIA", "NEW_ZEALAND", "NICARAGUA", "NIGER", "NIGERIA", "NIUE", "NORFOLK_ISLAND", "NORTH_MACEDONIA", "NORTHERN_MARIANA_ISLANDS", "NORWAY", "OMAN", "PAKISTAN", "PALAU", "PALESTINE_STATE_OF", "PANAMA", "PAPUA_NEW_GUINEA", "PARAGUAY", "PERU", "PHILIPPINES", "PITCAIRN", "POLAND", "PORTUGAL", "PUERTO_RICO", "QATAR", "REUNION", "ROMANIA", "RUSSIAN_FEDERATION", "RWANDA", "SAINT_BARTHELEMY", "SAINT_HELENA_ASCENSION_AND_TRISTAN_DA_CUNHA", "SAINT_KITTS_AND_NEVIS", "SAINT_LUCIA", "SAINT_MARTIN_FRENCH_PART", "SAINT_PIERRE_AND_MIQUELON", "SAINT_VINCENT_AND_THE_GRENADINES", "SAMOA", "SAN_MARINO", "SAO_TOME_AND_PRINCIPE", "SAUDI_ARABIA", "SENEGAL", "SERBIA", "SEYCHELLES", "SIERRA_LEONE", "SINGAPORE", "SINT_MAARTEN_DUTCH_PART", "SLOVAKIA", "SLOVENIA", "SOLOMON_ISLANDS", "SOMALIA", "SOUTH_AFRICA", "SOUTH_GEORGIA_AND_THE_SOUTH_SANDWICH_ISLANDS", "SOUTH_SUDAN", "SPAIN", "SRI_LANKA", "SUDAN", "SURINAME", "SVALBARD_AND_JAN_MAYEN", "SWEDEN", "SWITZERLAND", "SYRIAN_ARAB_REPUBLIC", "TAIWAN_PROVINCE_OF_CHINA", "TAJIKISTAN", "TANZANIA_UNITED_REPUBLIC_OF", "THAILAND", "TIMOR_LESTE", "TOGO", "TOKELAU", "TONGA", "TRINIDAD_AND_TOBAGO", "TUNISIA", "TURKIYE", "TURKMENISTAN", "TURKS_AND_CAICOS_ISLANDS", "TUVALU", "UGANDA", "UKRAINE", "UNITED_ARAB_EMIRATES", "UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND", "UNITED_STATES_OF_AMERICA", "UNITED_STATES_MINOR_OUTLYING_ISLANDS", "URUGUAY", "UZBEKISTAN", "VANUATU", "VENEZUELA_BOLIVARIAN_REPUBLIC_OF", "VIET_NAM", "VIRGIN_ISLANDS_BRITISH", "VIRGIN_ISLANDS_US", "WALLIS_AND_FUTUNA", "WESTERN_SAHARA", "YEMEN", "ZAMBIA", "ZIMBABWE", "Companion", "utils-common"})
/*     */ public enum CountryISO { @NotNull
/*     */   public static final Companion Companion; @NotNull
/*     */   private final String alpha2; @NotNull
/*     */   private final String alpha3; @NotNull
/*     */   private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate; CountryISO(String alpha2, String alpha3) { this.alpha2 = alpha2;
/*     */     this.alpha3 = alpha3; } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class null extends Lambda implements Function0<KSerializer<Object>> { public static final null INSTANCE = (null)new Function0<>(); null() { super(0); } public final KSerializer<Object> invoke() {
/*     */       return EnumsKt.createSimpleEnumSerializer("ai.grazie.utils.mpp.geo.CountryISO", (Enum[])CountryISO.values());
/*  14 */     } } AFGHANISTAN("AF", "AFG"),
/*  15 */   ALAND_ISLANDS("AX", "ALA"),
/*  16 */   ALBANIA("AL", "ALB"),
/*  17 */   ALGERIA("DZ", "DZA"),
/*  18 */   AMERICAN_SAMOA("AS", "ASM"),
/*  19 */   ANDORRA("AD", "AND"),
/*  20 */   ANGOLA("AO", "AGO"),
/*  21 */   ANGUILLA("AI", "AIA"),
/*  22 */   ANTARCTICA("AQ", "ATA"),
/*  23 */   ANTIGUA_AND_BARBUDA("AG", "ATG"),
/*  24 */   ARGENTINA("AR", "ARG"),
/*  25 */   ARMENIA("AM", "ARM"),
/*  26 */   ARUBA("AW", "ABW"),
/*  27 */   AUSTRALIA("AU", "AUS"),
/*  28 */   AUSTRIA("AT", "AUT"),
/*  29 */   AZERBAIJAN("AZ", "AZE"),
/*  30 */   BAHAMAS("BS", "BHS"),
/*  31 */   BAHRAIN("BH", "BHR"),
/*  32 */   BANGLADESH("BD", "BGD"),
/*  33 */   BARBADOS("BB", "BRB"),
/*  34 */   BELARUS("BY", "BLR"),
/*  35 */   BELGIUM("BE", "BEL"),
/*  36 */   BELIZE("BZ", "BLZ"),
/*  37 */   BENIN("BJ", "BEN"),
/*  38 */   BERMUDA("BM", "BMU"),
/*  39 */   BHUTAN("BT", "BTN"),
/*  40 */   BOLIVIA_PLURINATIONAL_STATE_OF { @NotNull private final String display; CountryISO(String $enum$name, int $enum$ordinal) { super($enum$name, $enum$ordinal, "BO", "BOL", null);
/*  41 */       this.display = "Plurinational State of Bolivia"; } @NotNull public String getDisplay() { return this.display; }
/*     */      },
/*  43 */   BONAIRE_SINT_EUSTATIUS_AND_SABA("BQ", "BES"),
/*  44 */   BOSNIA_AND_HERZEGOVINA("BA", "BIH"),
/*  45 */   BOTSWANA("BW", "BWA"),
/*  46 */   BOUVET_ISLAND("BV", "BVT"),
/*  47 */   BRAZIL("BR", "BRA"),
/*  48 */   BRITISH_INDIAN_OCEAN_TERRITORY("IO", "IOT"),
/*  49 */   BRUNEI_DARUSSALAM("BN", "BRN"),
/*  50 */   BULGARIA("BG", "BGR"),
/*  51 */   BURKINA_FASO("BF", "BFA"),
/*  52 */   BURUNDI("BI", "BDI"),
/*  53 */   CABO_VERDE("CV", "CPV"),
/*  54 */   CAMBODIA("KH", "KHM"),
/*  55 */   CAMEROON("CM", "CMR"),
/*  56 */   CANADA("CA", "CAN"),
/*  57 */   CAYMAN_ISLANDS("KY", "CYM"),
/*  58 */   CENTRAL_AFRICAN_REPUBLIC("CF", "CAF"),
/*  59 */   CHAD("TD", "TCD"),
/*  60 */   CHILE("CL", "CHL"),
/*  61 */   CHINA("CN", "CHN"),
/*  62 */   CHRISTMAS_ISLAND("CX", "CXR"),
/*  63 */   COCOS_KEELING_ISLANDS("CC", "CCK"),
/*  64 */   COLOMBIA("CO", "COL"),
/*  65 */   COMOROS("KM", "COM"),
/*  66 */   CONGO("CG", "COG"),
/*  67 */   CONGO_DEMOCRATIC_REPUBLIC_OF_THE { @NotNull private final String display; CountryISO(String $enum$name, int $enum$ordinal) { super($enum$name, $enum$ordinal, "CD", "COD", null);
/*  68 */       this.display = "Democratic Republic of the Congo"; } @NotNull public String getDisplay() { return this.display; }
/*     */      },
/*  70 */   COOK_ISLANDS("CK", "COK"),
/*  71 */   COSTA_RICA("CR", "CRI"),
/*  72 */   COTE_DIVOIRE("CI", "CIV"),
/*  73 */   CROATIA("HR", "HRV"),
/*  74 */   CUBA("CU", "CUB"),
/*  75 */   CURACAO("CW", "CUW"),
/*  76 */   CYPRUS("CY", "CYP"),
/*  77 */   CZECHIA("CZ", "CZE"),
/*  78 */   DENMARK("DK", "DNK"),
/*  79 */   DJIBOUTI("DJ", "DJI"),
/*  80 */   DOMINICA("DM", "DMA"),
/*  81 */   DOMINICAN_REPUBLIC("DO", "DOM"),
/*  82 */   ECUADOR("EC", "ECU"),
/*  83 */   EGYPT("EG", "EGY"),
/*  84 */   EL_SALVADOR("SV", "SLV"),
/*  85 */   EQUATORIAL_GUINEA("GQ", "GNQ"),
/*  86 */   ERITREA("ER", "ERI"),
/*  87 */   ESTONIA("EE", "EST"),
/*  88 */   ESWATINI("SZ", "SWZ"),
/*  89 */   ETHIOPIA("ET", "ETH"),
/*  90 */   FALKLAND_ISLANDS_MALVINAS("FK", "FLK"),
/*  91 */   FAROE_ISLANDS("FO", "FRO"),
/*  92 */   FIJI("FJ", "FJI"),
/*  93 */   FINLAND("FI", "FIN"),
/*  94 */   FRANCE("FR", "FRA"),
/*  95 */   FRENCH_GUIANA("GF", "GUF"),
/*  96 */   FRENCH_POLYNESIA("PF", "PYF"),
/*  97 */   FRENCH_SOUTHERN_TERRITORIES("TF", "ATF"),
/*  98 */   GABON("GA", "GAB"),
/*  99 */   GAMBIA("GM", "GMB"),
/* 100 */   GEORGIA("GE", "GEO"),
/* 101 */   GERMANY("DE", "DEU"),
/* 102 */   GHANA("GH", "GHA"),
/* 103 */   GIBRALTAR("GI", "GIB"),
/* 104 */   GREECE("GR", "GRC"),
/* 105 */   GREENLAND("GL", "GRL"),
/* 106 */   GRENADA("GD", "GRD"),
/* 107 */   GUADELOUPE("GP", "GLP"),
/* 108 */   GUAM("GU", "GUM"),
/* 109 */   GUATEMALA("GT", "GTM"),
/* 110 */   GUERNSEY("GG", "GGY"),
/* 111 */   GUINEA("GN", "GIN"),
/* 112 */   GUINEA_BISSAU("GW", "GNB"),
/* 113 */   GUYANA("GY", "GUY"),
/* 114 */   HAITI("HT", "HTI"),
/* 115 */   HEARD_ISLAND_AND_MCDONALD_ISLANDS("HM", "HMD"),
/* 116 */   HOLY_SEE("VA", "VAT"),
/* 117 */   HONDURAS("HN", "HND"),
/* 118 */   HONG_KONG("HK", "HKG"),
/* 119 */   HUNGARY("HU", "HUN"),
/* 120 */   ICELAND("IS", "ISL"),
/* 121 */   INDIA("IN", "IND"),
/* 122 */   INDONESIA("ID", "IDN"),
/* 123 */   IRAN_ISLAMIC_REPUBLIC_OF { @NotNull private final String display; CountryISO(String $enum$name, int $enum$ordinal) { super($enum$name, $enum$ordinal, "IR", "IRN", null);
/* 124 */       this.display = "Islamic Republic of Iran"; } @NotNull public String getDisplay() { return this.display; }
/*     */      },
/* 126 */   IRAQ("IQ", "IRQ"),
/* 127 */   IRELAND("IE", "IRL"),
/* 128 */   ISLE_OF_MAN("IM", "IMN"),
/* 129 */   ISRAEL("IL", "ISR"),
/* 130 */   ITALY("IT", "ITA"),
/* 131 */   JAMAICA("JM", "JAM"),
/* 132 */   JAPAN("JP", "JPN"),
/* 133 */   JERSEY("JE", "JEY"),
/* 134 */   JORDAN("JO", "JOR"),
/* 135 */   KAZAKHSTAN("KZ", "KAZ"),
/* 136 */   KENYA("KE", "KEN"),
/* 137 */   KIRIBATI("KI", "KIR"),
/* 138 */   KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF { @NotNull private final String display; CountryISO(String $enum$name, int $enum$ordinal) { super($enum$name, $enum$ordinal, "KP", "PRK", null);
/* 139 */       this.display = "Democratic People's Republic of Korea"; } @NotNull public String getDisplay() { return this.display; }
/*     */      },
/* 141 */   KOREA_REPUBLIC_OF { @NotNull private final String display; CountryISO(String $enum$name, int $enum$ordinal) { super($enum$name, $enum$ordinal, "KR", "KOR", null);
/* 142 */       this.display = "Republic of Korea"; } @NotNull public String getDisplay() { return this.display; }
/*     */      },
/* 144 */   KUWAIT("KW", "KWT"),
/* 145 */   KYRGYZSTAN("KG", "KGZ"),
/* 146 */   LAO_PEOPLES_DEMOCRATIC_REPUBLIC { @NotNull private final String display; CountryISO(String $enum$name, int $enum$ordinal) { super($enum$name, $enum$ordinal, "LA", "LAO", null);
/* 147 */       this.display = "Lao People's Democratic Republic"; } @NotNull public String getDisplay() { return this.display; }
/*     */      },
/* 149 */   LATVIA("LV", "LVA"),
/* 150 */   LEBANON("LB", "LBN"),
/* 151 */   LESOTHO("LS", "LSO"),
/* 152 */   LIBERIA("LR", "LBR"),
/* 153 */   LIBYA("LY", "LBY"),
/* 154 */   LIECHTENSTEIN("LI", "LIE"),
/* 155 */   LITHUANIA("LT", "LTU"),
/* 156 */   LUXEMBOURG("LU", "LUX"),
/* 157 */   MACAO("MO", "MAC"),
/* 158 */   MADAGASCAR("MG", "MDG"),
/* 159 */   MALAWI("MW", "MWI"),
/* 160 */   MALAYSIA("MY", "MYS"),
/* 161 */   MALDIVES("MV", "MDV"),
/* 162 */   MALI("ML", "MLI"),
/* 163 */   MALTA("MT", "MLT"),
/* 164 */   MARSHALL_ISLANDS("MH", "MHL"),
/* 165 */   MARTINIQUE("MQ", "MTQ"),
/* 166 */   MAURITANIA("MR", "MRT"),
/* 167 */   MAURITIUS("MU", "MUS"),
/* 168 */   MAYOTTE("YT", "MYT"),
/* 169 */   MEXICO("MX", "MEX"),
/* 170 */   MICRONESIA_FEDERATED_STATES_OF { @NotNull private final String display; CountryISO(String $enum$name, int $enum$ordinal) { super($enum$name, $enum$ordinal, "FM", "FSM", null);
/* 171 */       this.display = "Federated States of Micronesia"; } @NotNull public String getDisplay() { return this.display; }
/*     */      },
/* 173 */   MOLDOVA_REPUBLIC_OF("MD", "MDA"),
/* 174 */   MONACO("MC", "MCO"),
/* 175 */   MONGOLIA("MN", "MNG"),
/* 176 */   MONTENEGRO("ME", "MNE"),
/* 177 */   MONTSERRAT("MS", "MSR"),
/* 178 */   MOROCCO("MA", "MAR"),
/* 179 */   MOZAMBIQUE("MZ", "MOZ"),
/* 180 */   MYANMAR("MM", "MMR"),
/* 181 */   NAMIBIA("NA", "NAM"),
/* 182 */   NAURU("NR", "NRU"),
/* 183 */   NEPAL("NP", "NPL"),
/* 184 */   NETHERLANDS_KINGDOM_OF_THE { @NotNull private final String display; CountryISO(String $enum$name, int $enum$ordinal) { super($enum$name, $enum$ordinal, "NL", "NLD", null);
/* 185 */       this.display = "Kingdom of the Netherlands"; } @NotNull public String getDisplay() { return this.display; }
/*     */      },
/* 187 */   NEW_CALEDONIA("NC", "NCL"),
/* 188 */   NEW_ZEALAND("NZ", "NZL"),
/* 189 */   NICARAGUA("NI", "NIC"),
/* 190 */   NIGER("NE", "NER"),
/* 191 */   NIGERIA("NG", "NGA"),
/* 192 */   NIUE("NU", "NIU"),
/* 193 */   NORFOLK_ISLAND("NF", "NFK"),
/* 194 */   NORTH_MACEDONIA("MK", "MKD"),
/* 195 */   NORTHERN_MARIANA_ISLANDS("MP", "MNP"),
/* 196 */   NORWAY("NO", "NOR"),
/* 197 */   OMAN("OM", "OMN"),
/* 198 */   PAKISTAN("PK", "PAK"),
/* 199 */   PALAU("PW", "PLW"),
/* 200 */   PALESTINE_STATE_OF { @NotNull private final String display; CountryISO(String $enum$name, int $enum$ordinal) { super($enum$name, $enum$ordinal, "PS", "PSE", null);
/* 201 */       this.display = "State of Palestine"; } @NotNull public String getDisplay() { return this.display; }
/*     */      },
/* 203 */   PANAMA("PA", "PAN"),
/* 204 */   PAPUA_NEW_GUINEA("PG", "PNG"),
/* 205 */   PARAGUAY("PY", "PRY"),
/* 206 */   PERU("PE", "PER"),
/* 207 */   PHILIPPINES("PH", "PHL"),
/* 208 */   PITCAIRN("PN", "PCN"),
/* 209 */   POLAND("PL", "POL"),
/* 210 */   PORTUGAL("PT", "PRT"),
/* 211 */   PUERTO_RICO("PR", "PRI"),
/* 212 */   QATAR("QA", "QAT"),
/* 213 */   REUNION("RE", "REU"),
/* 214 */   ROMANIA("RO", "ROU"),
/* 215 */   RUSSIAN_FEDERATION("RU", "RUS"),
/* 216 */   RWANDA("RW", "RWA"),
/* 217 */   SAINT_BARTHELEMY("BL", "BLM"),
/* 218 */   SAINT_HELENA_ASCENSION_AND_TRISTAN_DA_CUNHA("SH", "SHN"),
/* 219 */   SAINT_KITTS_AND_NEVIS("KN", "KNA"),
/* 220 */   SAINT_LUCIA("LC", "LCA"),
/* 221 */   SAINT_MARTIN_FRENCH_PART("MF", "MAF"),
/* 222 */   SAINT_PIERRE_AND_MIQUELON("PM", "SPM"),
/* 223 */   SAINT_VINCENT_AND_THE_GRENADINES("VC", "VCT"),
/* 224 */   SAMOA("WS", "WSM"),
/* 225 */   SAN_MARINO("SM", "SMR"),
/* 226 */   SAO_TOME_AND_PRINCIPE("ST", "STP"),
/* 227 */   SAUDI_ARABIA("SA", "SAU"),
/* 228 */   SENEGAL("SN", "SEN"),
/* 229 */   SERBIA("RS", "SRB"),
/* 230 */   SEYCHELLES("SC", "SYC"),
/* 231 */   SIERRA_LEONE("SL", "SLE"),
/* 232 */   SINGAPORE("SG", "SGP"),
/* 233 */   SINT_MAARTEN_DUTCH_PART("SX", "SXM"),
/* 234 */   SLOVAKIA("SK", "SVK"),
/* 235 */   SLOVENIA("SI", "SVN"),
/* 236 */   SOLOMON_ISLANDS("SB", "SLB"),
/* 237 */   SOMALIA("SO", "SOM"),
/* 238 */   SOUTH_AFRICA("ZA", "ZAF"),
/* 239 */   SOUTH_GEORGIA_AND_THE_SOUTH_SANDWICH_ISLANDS("GS", "SGS"),
/* 240 */   SOUTH_SUDAN("SS", "SSD"),
/* 241 */   SPAIN("ES", "ESP"),
/* 242 */   SRI_LANKA("LK", "LKA"),
/* 243 */   SUDAN("SD", "SDN"),
/* 244 */   SURINAME("SR", "SUR"),
/* 245 */   SVALBARD_AND_JAN_MAYEN("SJ", "SJM"),
/* 246 */   SWEDEN("SE", "SWE"),
/* 247 */   SWITZERLAND("CH", "CHE"),
/* 248 */   SYRIAN_ARAB_REPUBLIC("SY", "SYR"),
/* 249 */   TAIWAN_PROVINCE_OF_CHINA { @NotNull private final String display; CountryISO(String $enum$name, int $enum$ordinal) { super($enum$name, $enum$ordinal, "TW", "TWN", null);
/* 250 */       this.display = "Taiwan, Province of China"; } @NotNull public String getDisplay() { return this.display; }
/*     */      },
/* 252 */   TAJIKISTAN("TJ", "TJK"),
/* 253 */   TANZANIA_UNITED_REPUBLIC_OF { @NotNull private final String display; CountryISO(String $enum$name, int $enum$ordinal) { super($enum$name, $enum$ordinal, "TZ", "TZA", null);
/* 254 */       this.display = "United Republic of Tanzania"; } @NotNull public String getDisplay() { return this.display; }
/*     */      },
/* 256 */   THAILAND("TH", "THA"),
/* 257 */   TIMOR_LESTE("TL", "TLS"),
/* 258 */   TOGO("TG", "TGO"),
/* 259 */   TOKELAU("TK", "TKL"),
/* 260 */   TONGA("TO", "TON"),
/* 261 */   TRINIDAD_AND_TOBAGO("TT", "TTO"),
/* 262 */   TUNISIA("TN", "TUN"),
/* 263 */   TURKIYE("TR", "TUR"),
/* 264 */   TURKMENISTAN("TM", "TKM"),
/* 265 */   TURKS_AND_CAICOS_ISLANDS("TC", "TCA"),
/* 266 */   TUVALU("TV", "TUV"),
/* 267 */   UGANDA("UG", "UGA"),
/* 268 */   UKRAINE("UA", "UKR"),
/* 269 */   UNITED_ARAB_EMIRATES("AE", "ARE"),
/* 270 */   UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND("GB", "GBR"),
/* 271 */   UNITED_STATES_OF_AMERICA("US", "USA"),
/* 272 */   UNITED_STATES_MINOR_OUTLYING_ISLANDS("UM", "UMI"),
/* 273 */   URUGUAY("UY", "URY"),
/* 274 */   UZBEKISTAN("UZ", "UZB"),
/* 275 */   VANUATU("VU", "VUT"),
/* 276 */   VENEZUELA_BOLIVARIAN_REPUBLIC_OF { @NotNull private final String display; CountryISO(String $enum$name, int $enum$ordinal) { super($enum$name, $enum$ordinal, "VE", "VEN", null);
/* 277 */       this.display = "Bolivarian Republic of Venezuela"; } @NotNull public String getDisplay() { return this.display; }
/*     */      },
/* 279 */   VIET_NAM("VN", "VNM"),
/* 280 */   VIRGIN_ISLANDS_BRITISH { @NotNull private final String display; CountryISO(String $enum$name, int $enum$ordinal) { super($enum$name, $enum$ordinal, "VG", "VGB", null);
/* 281 */       this.display = "British Virgin Islands"; } @NotNull public String getDisplay() { return this.display; }
/*     */      },
/* 283 */   VIRGIN_ISLANDS_US { @NotNull private final String display; CountryISO(String $enum$name, int $enum$ordinal) { super($enum$name, $enum$ordinal, "VI", "VIR", null);
/* 284 */       this.display = "United States Virgin Islands"; } @NotNull public String getDisplay() { return this.display; }
/*     */      },
/* 286 */   WALLIS_AND_FUTUNA("WF", "WLF"),
/* 287 */   WESTERN_SAHARA("EH", "ESH"),
/* 288 */   YEMEN("YE", "YEM"),
/* 289 */   ZAMBIA("ZM", "ZMB"),
/* 290 */   ZIMBABWE("ZW", "ZWE"); @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/utils/mpp/geo/CountryISO$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/mpp/geo/CountryISO;", "utils-common"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<CountryISO> serializer() { return get$cachedSerializer(); } } @NotNull public final String getAlpha2() { return this.alpha2; } @NotNull public final String getAlpha3() { return this.alpha3; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\bÆ\001\030\0002\0020\001R\024\020\002\032\0020\003XD¢\006\b\n\000\032\004\b\004\020\005¨\006\006"}, d2 = {"Lai/grazie/utils/mpp/geo/CountryISO$BOLIVIA_PLURINATIONAL_STATE_OF;", "Lai/grazie/utils/mpp/geo/CountryISO;", "display", "", "getDisplay", "()Ljava/lang/String;", "utils-common"}) static final class BOLIVIA_PLURINATIONAL_STATE_OF extends CountryISO { @NotNull private final String display; BOLIVIA_PLURINATIONAL_STATE_OF(String $enum$name, int $enum$ordinal) { super($enum$name, $enum$ordinal, "BO", "BOL", null); this.display = "Plurinational State of Bolivia"; } @NotNull public String getDisplay() { return this.display; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\bÆ\001\030\0002\0020\001R\024\020\002\032\0020\003XD¢\006\b\n\000\032\004\b\004\020\005¨\006\006"}, d2 = {"Lai/grazie/utils/mpp/geo/CountryISO$CONGO_DEMOCRATIC_REPUBLIC_OF_THE;", "Lai/grazie/utils/mpp/geo/CountryISO;", "display", "", "getDisplay", "()Ljava/lang/String;", "utils-common"}) static final class CONGO_DEMOCRATIC_REPUBLIC_OF_THE extends CountryISO { @NotNull private final String display; CONGO_DEMOCRATIC_REPUBLIC_OF_THE(String $enum$name, int $enum$ordinal) { super($enum$name, $enum$ordinal, "CD", "COD", null); this.display = "Democratic Republic of the Congo"; } @NotNull public String getDisplay() { return this.display; } } static { Companion = new Companion(null); $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\bÆ\001\030\0002\0020\001R\024\020\002\032\0020\003XD¢\006\b\n\000\032\004\b\004\020\005¨\006\006"}, d2 = {"Lai/grazie/utils/mpp/geo/CountryISO$IRAN_ISLAMIC_REPUBLIC_OF;", "Lai/grazie/utils/mpp/geo/CountryISO;", "display", "", "getDisplay", "()Ljava/lang/String;", "utils-common"}) static final class IRAN_ISLAMIC_REPUBLIC_OF extends CountryISO {
/*     */     @NotNull private final String display; IRAN_ISLAMIC_REPUBLIC_OF(String $enum$name, int $enum$ordinal) { super($enum$name, $enum$ordinal, "IR", "IRN", null); this.display = "Islamic Republic of Iran"; } @NotNull public String getDisplay() { return this.display; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\bÆ\001\030\0002\0020\001R\024\020\002\032\0020\003XD¢\006\b\n\000\032\004\b\004\020\005¨\006\006"}, d2 = {"Lai/grazie/utils/mpp/geo/CountryISO$KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF;", "Lai/grazie/utils/mpp/geo/CountryISO;", "display", "", "getDisplay", "()Ljava/lang/String;", "utils-common"}) static final class KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF extends CountryISO {
/*     */     @NotNull private final String display; KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF(String $enum$name, int $enum$ordinal) { super($enum$name, $enum$ordinal, "KP", "PRK", null); this.display = "Democratic People's Republic of Korea"; } @NotNull public String getDisplay() { return this.display; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\bÆ\001\030\0002\0020\001R\024\020\002\032\0020\003XD¢\006\b\n\000\032\004\b\004\020\005¨\006\006"}, d2 = {"Lai/grazie/utils/mpp/geo/CountryISO$KOREA_REPUBLIC_OF;", "Lai/grazie/utils/mpp/geo/CountryISO;", "display", "", "getDisplay", "()Ljava/lang/String;", "utils-common"}) static final class KOREA_REPUBLIC_OF extends CountryISO {
/* 293 */     @NotNull private final String display; KOREA_REPUBLIC_OF(String $enum$name, int $enum$ordinal) { super($enum$name, $enum$ordinal, "KR", "KOR", null); this.display = "Republic of Korea"; } @NotNull public String getDisplay() { return this.display; } } @NotNull public String getDisplay() { Intrinsics.checkNotNullExpressionValue(StringsKt.replace$default(name(), "_", " ", false, 4, null).toLowerCase(Locale.ROOT), "toLowerCase(...)"); return TextKt.capitalize(StringsKt.replace$default(name(), "_", " ", false, 4, null).toLowerCase(Locale.ROOT)); }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\bÆ\001\030\0002\0020\001R\024\020\002\032\0020\003XD¢\006\b\n\000\032\004\b\004\020\005¨\006\006"}, d2 = {"Lai/grazie/utils/mpp/geo/CountryISO$LAO_PEOPLES_DEMOCRATIC_REPUBLIC;", "Lai/grazie/utils/mpp/geo/CountryISO;", "display", "", "getDisplay", "()Ljava/lang/String;", "utils-common"})
/*     */   static final class LAO_PEOPLES_DEMOCRATIC_REPUBLIC extends CountryISO {
/*     */     @NotNull
/*     */     private final String display;
/*     */     
/*     */     LAO_PEOPLES_DEMOCRATIC_REPUBLIC(String $enum$name, int $enum$ordinal) {
/*     */       super($enum$name, $enum$ordinal, "LA", "LAO", null);
/*     */       this.display = "Lao People's Democratic Republic";
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String getDisplay() {
/*     */       return this.display;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\bÆ\001\030\0002\0020\001R\024\020\002\032\0020\003XD¢\006\b\n\000\032\004\b\004\020\005¨\006\006"}, d2 = {"Lai/grazie/utils/mpp/geo/CountryISO$MICRONESIA_FEDERATED_STATES_OF;", "Lai/grazie/utils/mpp/geo/CountryISO;", "display", "", "getDisplay", "()Ljava/lang/String;", "utils-common"})
/*     */   static final class MICRONESIA_FEDERATED_STATES_OF extends CountryISO {
/*     */     @NotNull
/*     */     private final String display;
/*     */     
/*     */     MICRONESIA_FEDERATED_STATES_OF(String $enum$name, int $enum$ordinal) {
/*     */       super($enum$name, $enum$ordinal, "FM", "FSM", null);
/*     */       this.display = "Federated States of Micronesia";
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String getDisplay() {
/*     */       return this.display;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\bÆ\001\030\0002\0020\001R\024\020\002\032\0020\003XD¢\006\b\n\000\032\004\b\004\020\005¨\006\006"}, d2 = {"Lai/grazie/utils/mpp/geo/CountryISO$NETHERLANDS_KINGDOM_OF_THE;", "Lai/grazie/utils/mpp/geo/CountryISO;", "display", "", "getDisplay", "()Ljava/lang/String;", "utils-common"})
/*     */   static final class NETHERLANDS_KINGDOM_OF_THE extends CountryISO {
/*     */     @NotNull
/*     */     private final String display;
/*     */     
/*     */     NETHERLANDS_KINGDOM_OF_THE(String $enum$name, int $enum$ordinal) {
/*     */       super($enum$name, $enum$ordinal, "NL", "NLD", null);
/*     */       this.display = "Kingdom of the Netherlands";
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String getDisplay() {
/*     */       return this.display;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\bÆ\001\030\0002\0020\001R\024\020\002\032\0020\003XD¢\006\b\n\000\032\004\b\004\020\005¨\006\006"}, d2 = {"Lai/grazie/utils/mpp/geo/CountryISO$PALESTINE_STATE_OF;", "Lai/grazie/utils/mpp/geo/CountryISO;", "display", "", "getDisplay", "()Ljava/lang/String;", "utils-common"})
/*     */   static final class PALESTINE_STATE_OF extends CountryISO {
/*     */     @NotNull
/*     */     private final String display;
/*     */     
/*     */     PALESTINE_STATE_OF(String $enum$name, int $enum$ordinal) {
/*     */       super($enum$name, $enum$ordinal, "PS", "PSE", null);
/*     */       this.display = "State of Palestine";
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String getDisplay() {
/*     */       return this.display;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\bÆ\001\030\0002\0020\001R\024\020\002\032\0020\003XD¢\006\b\n\000\032\004\b\004\020\005¨\006\006"}, d2 = {"Lai/grazie/utils/mpp/geo/CountryISO$TAIWAN_PROVINCE_OF_CHINA;", "Lai/grazie/utils/mpp/geo/CountryISO;", "display", "", "getDisplay", "()Ljava/lang/String;", "utils-common"})
/*     */   static final class TAIWAN_PROVINCE_OF_CHINA extends CountryISO {
/*     */     @NotNull
/*     */     private final String display;
/*     */     
/*     */     TAIWAN_PROVINCE_OF_CHINA(String $enum$name, int $enum$ordinal) {
/*     */       super($enum$name, $enum$ordinal, "TW", "TWN", null);
/*     */       this.display = "Taiwan, Province of China";
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String getDisplay() {
/*     */       return this.display;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\bÆ\001\030\0002\0020\001R\024\020\002\032\0020\003XD¢\006\b\n\000\032\004\b\004\020\005¨\006\006"}, d2 = {"Lai/grazie/utils/mpp/geo/CountryISO$TANZANIA_UNITED_REPUBLIC_OF;", "Lai/grazie/utils/mpp/geo/CountryISO;", "display", "", "getDisplay", "()Ljava/lang/String;", "utils-common"})
/*     */   static final class TANZANIA_UNITED_REPUBLIC_OF extends CountryISO {
/*     */     @NotNull
/*     */     private final String display;
/*     */     
/*     */     TANZANIA_UNITED_REPUBLIC_OF(String $enum$name, int $enum$ordinal) {
/*     */       super($enum$name, $enum$ordinal, "TZ", "TZA", null);
/*     */       this.display = "United Republic of Tanzania";
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String getDisplay() {
/*     */       return this.display;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\bÆ\001\030\0002\0020\001R\024\020\002\032\0020\003XD¢\006\b\n\000\032\004\b\004\020\005¨\006\006"}, d2 = {"Lai/grazie/utils/mpp/geo/CountryISO$VENEZUELA_BOLIVARIAN_REPUBLIC_OF;", "Lai/grazie/utils/mpp/geo/CountryISO;", "display", "", "getDisplay", "()Ljava/lang/String;", "utils-common"})
/*     */   static final class VENEZUELA_BOLIVARIAN_REPUBLIC_OF extends CountryISO {
/*     */     @NotNull
/*     */     private final String display;
/*     */     
/*     */     VENEZUELA_BOLIVARIAN_REPUBLIC_OF(String $enum$name, int $enum$ordinal) {
/*     */       super($enum$name, $enum$ordinal, "VE", "VEN", null);
/*     */       this.display = "Bolivarian Republic of Venezuela";
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String getDisplay() {
/*     */       return this.display;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\bÆ\001\030\0002\0020\001R\024\020\002\032\0020\003XD¢\006\b\n\000\032\004\b\004\020\005¨\006\006"}, d2 = {"Lai/grazie/utils/mpp/geo/CountryISO$VIRGIN_ISLANDS_BRITISH;", "Lai/grazie/utils/mpp/geo/CountryISO;", "display", "", "getDisplay", "()Ljava/lang/String;", "utils-common"})
/*     */   static final class VIRGIN_ISLANDS_BRITISH extends CountryISO {
/*     */     @NotNull
/*     */     private final String display;
/*     */     
/*     */     VIRGIN_ISLANDS_BRITISH(String $enum$name, int $enum$ordinal) {
/*     */       super($enum$name, $enum$ordinal, "VG", "VGB", null);
/*     */       this.display = "British Virgin Islands";
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String getDisplay() {
/*     */       return this.display;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\bÆ\001\030\0002\0020\001R\024\020\002\032\0020\003XD¢\006\b\n\000\032\004\b\004\020\005¨\006\006"}, d2 = {"Lai/grazie/utils/mpp/geo/CountryISO$VIRGIN_ISLANDS_US;", "Lai/grazie/utils/mpp/geo/CountryISO;", "display", "", "getDisplay", "()Ljava/lang/String;", "utils-common"})
/*     */   static final class VIRGIN_ISLANDS_US extends CountryISO {
/*     */     @NotNull
/*     */     private final String display;
/*     */     
/*     */     VIRGIN_ISLANDS_US(String $enum$name, int $enum$ordinal) {
/*     */       super($enum$name, $enum$ordinal, "VI", "VIR", null);
/*     */       this.display = "United States Virgin Islands";
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String getDisplay() {
/*     */       return this.display;
/*     */     }
/*     */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\geo\CountryISO.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */