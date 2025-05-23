/*     */ package kotlinx.serialization.json.internal;
/*     */ 
/*     */ import kotlin.Metadata;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\"\n\000\n\002\020\016\n\002\b\006\n\002\020\f\n\002\b\n\n\002\020\005\n\002\b\f\n\002\020\b\n\002\b\b\032\020\020#\032\0020\0012\006\020$\032\0020\023H\000\032\020\020%\032\0020\0232\006\020&\032\0020\bH\000\032\020\020'\032\0020\b2\006\020&\032\0020 H\000\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\016\020\003\032\0020\001XT¢\006\002\n\000\"\016\020\004\032\0020\001XT¢\006\002\n\000\"\016\020\005\032\0020\001XT¢\006\002\n\000\"\016\020\006\032\0020\001XT¢\006\002\n\000\"\016\020\007\032\0020\bXT¢\006\002\n\000\"\016\020\t\032\0020\bXT¢\006\002\n\000\"\016\020\n\032\0020\bXT¢\006\002\n\000\"\016\020\013\032\0020\bXT¢\006\002\n\000\"\016\020\f\032\0020\bXT¢\006\002\n\000\"\016\020\r\032\0020\bXT¢\006\002\n\000\"\016\020\016\032\0020\bXT¢\006\002\n\000\"\016\020\017\032\0020\bXT¢\006\002\n\000\"\016\020\020\032\0020\bXT¢\006\002\n\000\"\016\020\021\032\0020\bXT¢\006\002\n\000\"\016\020\022\032\0020\023XT¢\006\002\n\000\"\016\020\024\032\0020\023XT¢\006\002\n\000\"\016\020\025\032\0020\023XT¢\006\002\n\000\"\016\020\026\032\0020\023XT¢\006\002\n\000\"\016\020\027\032\0020\023XT¢\006\002\n\000\"\016\020\030\032\0020\023XT¢\006\002\n\000\"\016\020\031\032\0020\023XT¢\006\002\n\000\"\016\020\032\032\0020\023XT¢\006\002\n\000\"\016\020\033\032\0020\023XT¢\006\002\n\000\"\016\020\034\032\0020\023XT¢\006\002\n\000\"\016\020\035\032\0020\023XT¢\006\002\n\000\"\016\020\036\032\0020\023XT¢\006\002\n\000\"\016\020\037\032\0020 XT¢\006\002\n\000\"\016\020!\032\0020 XT¢\006\002\n\000\"\016\020\"\032\0020 XT¢\006\002\n\000¨\006("}, d2 = {"lenientHint", "", "coerceInputValuesHint", "specialFlowingValuesHint", "ignoreUnknownKeysHint", "allowStructuredMapKeysHint", "NULL", "COMMA", "", "COLON", "BEGIN_OBJ", "END_OBJ", "BEGIN_LIST", "END_LIST", "STRING", "STRING_ESC", "INVALID", "UNICODE_ESC", "TC_OTHER", "", "TC_STRING", "TC_STRING_ESC", "TC_WHITESPACE", "TC_COMMA", "TC_COLON", "TC_BEGIN_OBJ", "TC_END_OBJ", "TC_BEGIN_LIST", "TC_END_LIST", "TC_EOF", "TC_INVALID", "CTC_MAX", "", "ESC2C_MAX", "asciiCaseMask", "tokenDescription", "token", "charToTokenClass", "c", "escapeToChar", "kotlinx-serialization-json"})
/*     */ public final class AbstractJsonLexerKt
/*     */ {
/*     */   @NotNull
/*     */   public static final String lenientHint = "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.";
/*     */   @NotNull
/*     */   public static final String coerceInputValuesHint = "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.";
/*     */   @NotNull
/*     */   public static final String specialFlowingValuesHint = "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'";
/*     */   @NotNull
/*     */   public static final String ignoreUnknownKeysHint = "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.";
/*     */   @NotNull
/*     */   public static final String allowStructuredMapKeysHint = "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.";
/*     */   @NotNull
/*     */   public static final String NULL = "null";
/*     */   public static final char COMMA = ',';
/*     */   public static final char COLON = ':';
/*     */   public static final char BEGIN_OBJ = '{';
/*     */   public static final char END_OBJ = '}';
/*     */   public static final char BEGIN_LIST = '[';
/*     */   public static final char END_LIST = ']';
/*     */   public static final char STRING = '"';
/*     */   public static final char STRING_ESC = '\\';
/*     */   public static final char INVALID = '\000';
/*     */   public static final char UNICODE_ESC = 'u';
/*     */   public static final byte TC_OTHER = 0;
/*     */   public static final byte TC_STRING = 1;
/*     */   public static final byte TC_STRING_ESC = 2;
/*     */   public static final byte TC_WHITESPACE = 3;
/*     */   public static final byte TC_COMMA = 4;
/*     */   public static final byte TC_COLON = 5;
/*     */   public static final byte TC_BEGIN_OBJ = 6;
/*     */   public static final byte TC_END_OBJ = 7;
/*     */   public static final byte TC_BEGIN_LIST = 8;
/*     */   public static final byte TC_END_LIST = 9;
/*     */   public static final byte TC_EOF = 10;
/*     */   public static final byte TC_INVALID = 127;
/*     */   private static final int CTC_MAX = 126;
/*     */   private static final int ESC2C_MAX = 117;
/*     */   public static final int asciiCaseMask = 32;
/*     */   
/*     */   @NotNull
/*     */   public static final String tokenDescription(byte token) {
/*  59 */     byte b = token;
/*  60 */     return (b == 1) ? "quotation mark '\"'" : (
/*  61 */       (b == 2) ? "string escape sequence '\\'" : (
/*  62 */       (b == 4) ? "comma ','" : (
/*  63 */       (b == 5) ? "colon ':'" : (
/*  64 */       (b == 6) ? "start of the object '{'" : (
/*  65 */       (b == 7) ? "end of the object '}'" : (
/*  66 */       (b == 8) ? "start of the array '['" : (
/*  67 */       (b == 9) ? "end of the array ']'" : (
/*  68 */       (b == 10) ? "end of the input" : (
/*  69 */       (b == Byte.MAX_VALUE) ? "invalid token" : 
/*  70 */       "valid token")))))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final byte charToTokenClass(char c) {
/* 133 */     return (c < '~') ? CharMappings.CHAR_TO_TOKEN[c] : 0;
/*     */   } public static final char escapeToChar(int c) {
/* 135 */     return (c < 117) ? CharMappings.ESCAPE_2_CHAR[c] : Character.MIN_VALUE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\AbstractJsonLexerKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */