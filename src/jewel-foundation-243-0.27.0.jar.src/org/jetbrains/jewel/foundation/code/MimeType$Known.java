/*     */ package org.jetbrains.jewel.foundation.code;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\bA\n\002\020\016\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\027\020E\032\004\030\0010\0052\006\020F\032\0020G¢\006\004\bH\020IR\023\020\004\032\0020\005¢\006\n\n\002\020\b\032\004\b\006\020\007R\023\020\t\032\0020\005¢\006\n\n\002\020\b\032\004\b\n\020\007R\023\020\013\032\0020\005¢\006\n\n\002\020\b\032\004\b\f\020\007R\023\020\r\032\0020\005¢\006\n\n\002\020\b\032\004\b\016\020\007R\023\020\017\032\0020\005¢\006\n\n\002\020\b\032\004\b\020\020\007R\023\020\021\032\0020\005¢\006\n\n\002\020\b\032\004\b\022\020\007R\023\020\023\032\0020\005¢\006\n\n\002\020\b\032\004\b\024\020\007R\023\020\025\032\0020\005¢\006\n\n\002\020\b\032\004\b\026\020\007R\023\020\027\032\0020\005¢\006\n\n\002\020\b\032\004\b\030\020\007R\023\020\031\032\0020\005¢\006\n\n\002\020\b\032\004\b\032\020\007R\023\020\033\032\0020\005¢\006\n\n\002\020\b\032\004\b\034\020\007R\023\020\035\032\0020\005¢\006\n\n\002\020\b\032\004\b\036\020\007R\023\020\037\032\0020\005¢\006\n\n\002\020\b\032\004\b \020\007R\023\020!\032\0020\005¢\006\n\n\002\020\b\032\004\b\"\020\007R\023\020#\032\0020\005¢\006\n\n\002\020\b\032\004\b$\020\007R\023\020%\032\0020\005¢\006\n\n\002\020\b\032\004\b&\020\007R\023\020'\032\0020\005¢\006\n\n\002\020\b\032\004\b(\020\007R\023\020)\032\0020\005¢\006\n\n\002\020\b\032\004\b*\020\007R\023\020+\032\0020\005¢\006\n\n\002\020\b\032\004\b,\020\007R\023\020-\032\0020\005¢\006\n\n\002\020\b\032\004\b.\020\007R\023\020/\032\0020\005¢\006\n\n\002\020\b\032\004\b0\020\007R\023\0201\032\0020\005¢\006\n\n\002\020\b\032\004\b2\020\007R\023\0203\032\0020\005¢\006\n\n\002\020\b\032\004\b4\020\007R\023\0205\032\0020\005¢\006\n\n\002\020\b\032\004\b6\020\007R\023\0207\032\0020\005¢\006\n\n\002\020\b\032\004\b8\020\007R\023\0209\032\0020\005¢\006\n\n\002\020\b\032\004\b:\020\007R\023\020;\032\0020\005¢\006\n\n\002\020\b\032\004\b<\020\007R\023\020=\032\0020\005¢\006\n\n\002\020\b\032\004\b>\020\007R\023\020?\032\0020\005¢\006\n\n\002\020\b\032\004\b@\020\007R\023\020A\032\0020\005¢\006\n\n\002\020\b\032\004\bB\020\007R\023\020C\032\0020\005¢\006\n\n\002\020\b\032\004\bD\020\007¨\006J"}, d2 = {"Lorg/jetbrains/jewel/foundation/code/MimeType$Known;", "", "<init>", "()V", "KOTLIN", "Lorg/jetbrains/jewel/foundation/code/MimeType;", "getKOTLIN-9EQw4cI", "()Ljava/lang/String;", "Ljava/lang/String;", "JAVA", "getJAVA-9EQw4cI", "TEXT", "getTEXT-9EQw4cI", "UNKNOWN", "getUNKNOWN-9EQw4cI", "XML", "getXML-9EQw4cI", "PROPERTIES", "getPROPERTIES-9EQw4cI", "TOML", "getTOML-9EQw4cI", "JSON", "getJSON-9EQw4cI", "REGEX", "getREGEX-9EQw4cI", "GROOVY", "getGROOVY-9EQw4cI", "C", "getC-9EQw4cI", "CPP", "getCPP-9EQw4cI", "SVG", "getSVG-9EQw4cI", "AIDL", "getAIDL-9EQw4cI", "PROTO", "getPROTO-9EQw4cI", "SQL", "getSQL-9EQw4cI", "PROGUARD", "getPROGUARD-9EQw4cI", "PYTHON", "getPYTHON-9EQw4cI", "JAVASCRIPT", "getJAVASCRIPT-9EQw4cI", "TYPESCRIPT", "getTYPESCRIPT-9EQw4cI", "DART", "getDART-9EQw4cI", "RUST", "getRUST-9EQw4cI", "AGSL", "getAGSL-9EQw4cI", "SHELL", "getSHELL-9EQw4cI", "YAML", "getYAML-9EQw4cI", "GO", "getGO-9EQw4cI", "RESOURCE", "getRESOURCE-9EQw4cI", "MANIFEST", "getMANIFEST-9EQw4cI", "GRADLE", "getGRADLE-9EQw4cI", "GRADLE_KTS", "getGRADLE_KTS-9EQw4cI", "VERSION_CATALOG", "getVERSION_CATALOG-9EQw4cI", "fromMarkdownLanguageName", "name", "", "fromMarkdownLanguageName-YABSuFg", "(Ljava/lang/String;)Ljava/lang/String;", "foundation"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class Known
/*     */ {
/*     */   @NotNull
/* 246 */   public static final Known INSTANCE = new Known(); @NotNull private static final String KOTLIN = MimeType.constructor-impl("text/kotlin"); @NotNull public final String getKOTLIN-9EQw4cI() { return KOTLIN; }
/*     */   
/*     */   @NotNull
/* 249 */   private static final String JAVA = MimeType.constructor-impl("text/java"); @NotNull public final String getJAVA-9EQw4cI() { return JAVA; }
/*     */   
/*     */   @NotNull
/* 252 */   private static final String TEXT = MimeType.constructor-impl("text/plain"); @NotNull public final String getTEXT-9EQw4cI() { return TEXT; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 262 */   private static final String UNKNOWN = MimeType.constructor-impl("text/unknown"); @NotNull public final String getUNKNOWN-9EQw4cI() { return UNKNOWN; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 269 */   private static final String XML = MimeType.constructor-impl("text/xml"); @NotNull public final String getXML-9EQw4cI() { return XML; } @NotNull
/* 270 */   private static final String PROPERTIES = MimeType.constructor-impl("text/properties"); @NotNull public final String getPROPERTIES-9EQw4cI() { return PROPERTIES; } @NotNull
/* 271 */   private static final String TOML = MimeType.constructor-impl("text/toml"); @NotNull public final String getTOML-9EQw4cI() { return TOML; } @NotNull
/* 272 */   private static final String JSON = MimeType.constructor-impl("text/json"); @NotNull public final String getJSON-9EQw4cI() { return JSON; } @NotNull
/* 273 */   private static final String REGEX = MimeType.constructor-impl("text/x-regex-source"); @NotNull public final String getREGEX-9EQw4cI() { return REGEX; } @NotNull
/* 274 */   private static final String GROOVY = MimeType.constructor-impl("text/groovy"); @NotNull public final String getGROOVY-9EQw4cI() { return GROOVY; } @NotNull
/* 275 */   private static final String C = MimeType.constructor-impl("text/c"); @NotNull public final String getC-9EQw4cI() { return C; } @NotNull
/* 276 */   private static final String CPP = MimeType.constructor-impl("text/c++"); @NotNull public final String getCPP-9EQw4cI() { return CPP; } @NotNull
/* 277 */   private static final String SVG = MimeType.constructor-impl("image/svg+xml"); @NotNull public final String getSVG-9EQw4cI() { return SVG; } @NotNull
/* 278 */   private static final String AIDL = MimeType.constructor-impl("text/x-aidl-source"); @NotNull public final String getAIDL-9EQw4cI() { return AIDL; } @NotNull
/* 279 */   private static final String PROTO = MimeType.constructor-impl("text/x-protobuf"); @NotNull public final String getPROTO-9EQw4cI() { return PROTO; } @NotNull
/* 280 */   private static final String SQL = MimeType.constructor-impl("text/x-sql"); @NotNull public final String getSQL-9EQw4cI() { return SQL; } @NotNull
/* 281 */   private static final String PROGUARD = MimeType.constructor-impl("text/x-proguard"); @NotNull public final String getPROGUARD-9EQw4cI() { return PROGUARD; } @NotNull
/* 282 */   private static final String PYTHON = MimeType.constructor-impl("text/python"); @NotNull public final String getPYTHON-9EQw4cI() { return PYTHON; } @NotNull
/* 283 */   private static final String JAVASCRIPT = MimeType.constructor-impl("text/javascript"); @NotNull public final String getJAVASCRIPT-9EQw4cI() { return JAVASCRIPT; } @NotNull
/* 284 */   private static final String TYPESCRIPT = MimeType.constructor-impl("text/typescript"); @NotNull public final String getTYPESCRIPT-9EQw4cI() { return TYPESCRIPT; } @NotNull
/* 285 */   private static final String DART = MimeType.constructor-impl("application/dart"); @NotNull public final String getDART-9EQw4cI() { return DART; } @NotNull
/* 286 */   private static final String RUST = MimeType.constructor-impl("text/rust"); @NotNull public final String getRUST-9EQw4cI() { return RUST; } @NotNull
/* 287 */   private static final String AGSL = MimeType.constructor-impl("text/x-agsl"); @NotNull public final String getAGSL-9EQw4cI() { return AGSL; } @NotNull
/* 288 */   private static final String SHELL = MimeType.constructor-impl("application/x-sh"); @NotNull public final String getSHELL-9EQw4cI() { return SHELL; } @NotNull
/* 289 */   private static final String YAML = MimeType.constructor-impl("text/yaml"); @NotNull public final String getYAML-9EQw4cI() { return YAML; } @NotNull
/* 290 */   private static final String GO = MimeType.constructor-impl("text/go"); @NotNull public final String getGO-9EQw4cI() { return GO; }
/*     */   
/*     */   @NotNull
/* 293 */   private static final String RESOURCE = MimeType.constructor-impl(MimeType.toString-impl(XML) + "; role=resource"); @NotNull public final String getRESOURCE-9EQw4cI() { return RESOURCE; } @NotNull
/* 294 */   private static final String MANIFEST = MimeType.constructor-impl(MimeType.toString-impl(XML) + ";role=manifest rootTag=manifest"); @NotNull public final String getMANIFEST-9EQw4cI() { return MANIFEST; } @NotNull
/* 295 */   private static final String GRADLE = MimeType.constructor-impl(MimeType.toString-impl(GROOVY) + "; role=gradle"); @NotNull public final String getGRADLE-9EQw4cI() { return GRADLE; } @NotNull
/* 296 */   private static final String GRADLE_KTS = MimeType.constructor-impl(MimeType.toString-impl(KOTLIN) + "; role=gradle"); @NotNull public final String getGRADLE_KTS-9EQw4cI() { return GRADLE_KTS; } @NotNull
/* 297 */   private static final String VERSION_CATALOG = MimeType.constructor-impl(MimeType.toString-impl(TOML) + "; role=version-catalog"); @NotNull public final String getVERSION_CATALOG-9EQw4cI() { return VERSION_CATALOG; }
/*     */    public static final int $stable;
/*     */   @Nullable
/*     */   public final String fromMarkdownLanguageName-YABSuFg(@NotNull String name) {
/* 301 */     Intrinsics.checkNotNullParameter(name, "name"); String str = name; switch (str.hashCode()) { case -934799095: if (!str.equals("regexp")) break; case -989164661: if (!str.equals("protobuf")) break; case 96515: if (!str.equals("c++")) break; case 3532465: if (!str.equals("sksl")) break; case 101429325: if (!str.equals("json5")) break; case -1240339754: if (!str.equals("golang")) break; case 3593: if (!str.equals("py")) break; case 3401: if (!str.equals("js")) break; case 120911: if (!str.equals("zsh")) break; case 114126: if (!str.equals("sql")) break; case -104338729: if (!str.equals("python3")) break; case -104338730: if (!str.equals("python2")) break; case 3075967: if (!str.equals("dart")) break; case 3512292: if (!str.equals("rust")) break; case 3254818: if (!str.equals("java")) break; case 3669: if (!str.equals("sh")) break; case 118807: if (!str.equals("xml")) break; case 3271912: if (!str.equals("json")) break; case 119768: if (!str.equals("yml")) break; case -522285947: if (!str.equals("typescript")) break; case 2993840: if (!str.equals("aidl")) break; case 3701415: if (!str.equals("yaml")) break; case -973197092: if (!str.equals("python")) break; case 99: if (!str.equals("c")) break; case 114276: if (!str.equals("svg")) break; case -1125574399: if (!str.equals("kotlin")) break; case 3304: if (!str.equals("go")) break; case 3433: if (!str.equals("kt")) break; case 106538: if (!str.equals("kts")) break; case 3565914: if (!str.equals("toml")) break; case 188995949: if (!str.equals("javascript")) break; case 108392519: if (!str.equals("regex")) break; case -1237466098: if (!str.equals("groovy")) break; case 109403696: if (!str.equals("shell")) break; case 3016404: if (!str.equals("bash")) break; case -926053069: if (!str.equals("properties")) {
/*     */           break;
/*     */         } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 346 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\code\MimeType$Known.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */