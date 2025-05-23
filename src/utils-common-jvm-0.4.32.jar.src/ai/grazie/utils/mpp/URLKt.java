/*    */ package ai.grazie.utils.mpp;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\020\016\n\002\030\002\n\002\b\005\032\022\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\001\032\032\020\004\032\0020\001*\0020\0012\006\020\005\032\0020\0012\006\020\006\032\0020\001¨\006\007"}, d2 = {"encodeURL", "", "Lai/grazie/utils/mpp/URLEncoder;", "url", "parameter", "name", "value", "utils-common"})
/*    */ public final class URLKt {
/*    */   @NotNull
/*    */   public static final String parameter(@NotNull String $this$parameter, @NotNull String name, @NotNull String value) {
/*  8 */     Intrinsics.checkNotNullParameter($this$parameter, "<this>"); Intrinsics.checkNotNullParameter(name, "name"); Intrinsics.checkNotNullParameter(value, "value"); return $this$parameter + $this$parameter;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final String encodeURL(@NotNull URLEncoder $this$encodeURL, @NotNull String url) {
/* 16 */     Intrinsics.checkNotNullParameter($this$encodeURL, "<this>"); Intrinsics.checkNotNullParameter(url, "url"); String necessaryChars = ";/?:@&=+$,#";
/*    */     
/* 18 */     java.lang.StringBuilder stringBuilder1 = new java.lang.StringBuilder(), $this$encodeURL_u24lambda_u240 = stringBuilder1; int $i$a$-buildString-URLKt$encodeURL$1 = 0;
/* 19 */     int escapingStart = 0; byte b; int i;
/* 20 */     for (b = 0, i = url.length(); b < i; ) { int j = b; char char = url.charAt(b);
/* 21 */       if (StringsKt.contains$default(necessaryChars, char, false, 2, null)) {
/*    */ 
/*    */         
/* 24 */         Intrinsics.checkNotNullExpressionValue(url.substring(escapingStart, j), "substring(...)"); $this$encodeURL_u24lambda_u240.append($this$encodeURL.encode(url.substring(escapingStart, j)));
/* 25 */         $this$encodeURL_u24lambda_u240.append(char);
/* 26 */         escapingStart = j + 1;
/*    */       }  b++; }
/* 28 */      if (escapingStart < url.length()) {
/* 29 */       Intrinsics.checkNotNullExpressionValue(url.substring(escapingStart, url.length()), "substring(...)"); $this$encodeURL_u24lambda_u240.append($this$encodeURL.encode(url.substring(escapingStart, url.length())));
/*    */     } 
/*    */     return stringBuilder1.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\URLKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */