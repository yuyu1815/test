/*    */ package kotlinx.serialization.json.internal;
/*    */ 
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000:\n\000\n\002\020\f\n\000\n\002\020\b\n\000\n\002\020\021\n\002\020\016\n\002\b\006\n\002\020\022\n\002\b\003\n\002\020\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\032\020\020\000\032\0020\0012\006\020\002\032\0020\003H\002\032\030\020\020\032\0020\021*\0060\022j\002`\0232\006\020\024\032\0020\006H\000\032\023\020\025\032\004\030\0010\026*\0020\006H\000¢\006\002\020\027\"&\020\004\032\n\022\006\022\004\030\0010\0060\0058\006X\004¢\006\020\n\002\020\013\022\004\b\007\020\b\032\004\b\t\020\n\"\024\020\f\032\0020\rX\004¢\006\b\n\000\032\004\b\016\020\017¨\006\030"}, d2 = {"toHexChar", "", "i", "", "ESCAPE_STRINGS", "", "", "getESCAPE_STRINGS$annotations", "()V", "getESCAPE_STRINGS", "()[Ljava/lang/String;", "[Ljava/lang/String;", "ESCAPE_MARKERS", "", "getESCAPE_MARKERS", "()[B", "printQuoted", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "value", "toBooleanStrictOrNull", "", "(Ljava/lang/String;)Ljava/lang/Boolean;", "kotlinx-serialization-json"})
/*    */ public final class StringOpsKt {
/*    */   @NotNull
/*    */   private static final String[] ESCAPE_STRINGS;
/*    */   
/* 10 */   private static final char toHexChar(int i) { int d = i & 0xF;
/* 11 */     return (d < 10) ? (char)(d + 48) : 
/* 12 */       (char)(d - 10 + 97); } @NotNull
/*    */   private static final byte[] ESCAPE_MARKERS; @NotNull
/*    */   public static final String[] getESCAPE_STRINGS() {
/* 15 */     return ESCAPE_STRINGS; }
/* 16 */   static { String[] arrayOfString1 = new String[93], $this$ESCAPE_STRINGS_u24lambda_u240 = arrayOfString1; int $i$a$-apply-StringOpsKt$ESCAPE_STRINGS$1 = 0; int c;
/* 17 */     for (c = 0; c < 32; c++) {
/* 18 */       char c1 = toHexChar(c >> 12);
/* 19 */       char c2 = toHexChar(c >> 8);
/* 20 */       char c3 = toHexChar(c >> 4);
/* 21 */       char c4 = toHexChar(c);
/* 22 */       $this$ESCAPE_STRINGS_u24lambda_u240[c] = "\\u" + c1 + c2 + c3 + c4;
/*    */     } 
/* 24 */     $this$ESCAPE_STRINGS_u24lambda_u240[34] = "\\\"";
/* 25 */     $this$ESCAPE_STRINGS_u24lambda_u240[92] = "\\\\";
/* 26 */     $this$ESCAPE_STRINGS_u24lambda_u240[9] = "\\t";
/* 27 */     $this$ESCAPE_STRINGS_u24lambda_u240[8] = "\\b";
/* 28 */     $this$ESCAPE_STRINGS_u24lambda_u240[10] = "\\n";
/* 29 */     $this$ESCAPE_STRINGS_u24lambda_u240[13] = "\\r";
/* 30 */     $this$ESCAPE_STRINGS_u24lambda_u240[12] = "\\f";
/*    */     
/*    */     ESCAPE_STRINGS = arrayOfString1;
/* 33 */     byte[] arrayOfByte1 = new byte[93], $this$ESCAPE_MARKERS_u24lambda_u241 = arrayOfByte1; int $i$a$-apply-StringOpsKt$ESCAPE_MARKERS$1 = 0;
/* 34 */     for (c = 0; c < 32; c++) {
/* 35 */       $this$ESCAPE_MARKERS_u24lambda_u241[c] = 1;
/*    */     }
/* 37 */     $this$ESCAPE_MARKERS_u24lambda_u241[34] = 34;
/* 38 */     $this$ESCAPE_MARKERS_u24lambda_u241[92] = 92;
/* 39 */     $this$ESCAPE_MARKERS_u24lambda_u241[9] = 116;
/* 40 */     $this$ESCAPE_MARKERS_u24lambda_u241[8] = 98;
/* 41 */     $this$ESCAPE_MARKERS_u24lambda_u241[10] = 110;
/* 42 */     $this$ESCAPE_MARKERS_u24lambda_u241[13] = 114;
/* 43 */     $this$ESCAPE_MARKERS_u24lambda_u241[12] = 102;
/*    */     ESCAPE_MARKERS = arrayOfByte1; } @NotNull
/*    */   public static final byte[] getESCAPE_MARKERS() { return ESCAPE_MARKERS; }
/*    */   public static final void printQuoted(@NotNull StringBuilder $this$printQuoted, @NotNull String value) {
/* 47 */     Intrinsics.checkNotNullParameter($this$printQuoted, "<this>"); Intrinsics.checkNotNullParameter(value, "value"); $this$printQuoted.append('"');
/* 48 */     int lastPos = 0;
/* 49 */     for (int i = 0, j = ((CharSequence)value).length(); i < j; i++) {
/* 50 */       int c = value.charAt(i);
/* 51 */       if (c < ESCAPE_STRINGS.length && ESCAPE_STRINGS[c] != null) {
/* 52 */         $this$printQuoted.append(value, lastPos, i);
/* 53 */         $this$printQuoted.append(ESCAPE_STRINGS[c]);
/* 54 */         lastPos = i + 1;
/*    */       } 
/*    */     } 
/*    */     
/* 58 */     (lastPos != 0) ? $this$printQuoted.append(value, lastPos, value.length()) : 
/* 59 */       $this$printQuoted.append(value);
/* 60 */     $this$printQuoted.append('"');
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public static final Boolean toBooleanStrictOrNull(@NotNull String $this$toBooleanStrictOrNull) {
/* 67 */     Intrinsics.checkNotNullParameter($this$toBooleanStrictOrNull, "<this>"); return 
/* 68 */       StringsKt.equals($this$toBooleanStrictOrNull, "true", true) ? Boolean.valueOf(true) : (
/* 69 */       StringsKt.equals($this$toBooleanStrictOrNull, "false", true) ? Boolean.valueOf(false) : 
/* 70 */       null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\StringOpsKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */