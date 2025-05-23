/*     */ package ai.grazie.nlp.patterns.standard;
/*     */ 
/*     */ import ai.grazie.nlp.patterns.Pattern;
/*     */ import ai.grazie.text.TextRange;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.ranges.IntRange;
/*     */ import kotlin.text.CharsKt;
/*     */ import kotlin.text.MatchResult;
/*     */ import kotlin.text.Regex;
/*     */ import kotlin.text.StringsKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0005\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\r\n\000\n\002\020 \n\000\n\002\020\013\n\000\n\002\020\f\n\002\b\002*\001\000\b\n\030\0002\0020\001J\032\020\005\032\004\030\0010\0062\006\020\007\032\0020\0062\006\020\b\032\0020\tH\002J\026\020\n\032\b\022\004\022\0020\0060\0132\006\020\b\032\0020\tH\026J\020\020\f\032\0020\r2\006\020\016\032\0020\017H\002J\020\020\020\032\0020\r2\006\020\b\032\0020\tH\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\003X\004¢\006\002\n\000¨\006\021"}, d2 = {"ai/grazie/nlp/patterns/standard/LikelyPatterns$IsURL$1", "Lai/grazie/nlp/patterns/Pattern;", "mainUrlPartsRegex", "Lkotlin/text/Regex;", "optionalPrefixRegex", "addPrefixes", "Lai/grazie/text/TextRange;", "range", "text", "", "find", "", "isMainUrlPart", "", "c", "", "matches", "nlp-patterns"})
/*     */ public final class LikelyPatterns$IsURL$1
/*     */   implements Pattern
/*     */ {
/* 231 */   private final Regex optionalPrefixRegex = new Regex(
/* 232 */       "(?:[-\\w+.]{2,}://)?(?:\\S+(?::\\S+)?@)?");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 238 */   private final Regex mainUrlPartsRegex = new Regex(
/* 239 */       "(?:(?:[1-9]\\d?|1\\d\\d|2[01]\\d|22[0-3])(?:\\.(?:1?\\d{1,2}|2[0-4]\\d|25[0-5])){2}\\.(?:[1-9]\\d?|1\\d\\d|2[0-4]\\d|25[0-4])|(?:(?:[\\p{L}\\d][\\p{L}\\d_-]{0,62})?[\\p{L}\\d]\\.)+(?:\\p{L}\\p{Ll}{1,20}|\\p{Lu}{2,4}))(?::\\d{2,5})?(?:[/?#]\\S*)?");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final boolean isMainUrlPart(char c) {
/* 263 */     return (c == '_' || c == '-' || Character.isLetterOrDigit(c));
/*     */   }
/*     */   public List<TextRange> find(CharSequence text) {
/* 266 */     Intrinsics.checkNotNullParameter(text, "text"); ArrayList<TextRange> result = new ArrayList();
/* 267 */     int i = 1;
/* 268 */     while (i < text.length() - 1) {
/* 269 */       if (text.charAt(i) == '.' && isMainUrlPart(text.charAt(i - 1)) && isMainUrlPart(text.charAt(i + 1))) {
/* 270 */         IntRange mainMatch; int mainStart = i - 1;
/* 271 */         for (; mainStart > 0 && isMainUrlPart(text.charAt(mainStart - 1)); mainStart--);
/* 272 */         for (; i < text.length() && !CharsKt.isWhitespace(text.charAt(i)); i++);
/* 273 */         if (this.mainUrlPartsRegex.matchAt(text, mainStart) == null || this.mainUrlPartsRegex.matchAt(text, mainStart).getRange() == null) { this.mainUrlPartsRegex.matchAt(text, mainStart).getRange(); continue; }
/* 274 */          if (mainMatch.getLast() + 1 >= text.length() || !isMainUrlPart(text.charAt(mainMatch.getLast() + 1))) {
/* 275 */           TextRange range; if (addPrefixes(TextRange.Companion.invoke(mainMatch), text) == null) { addPrefixes(TextRange.Companion.invoke(mainMatch), text); continue; }
/* 276 */            result.add(range);
/*     */         }  continue;
/* 278 */       }  i++;
/*     */     } 
/*     */     
/* 281 */     return result;
/*     */   }
/*     */   
/*     */   private final TextRange addPrefixes(TextRange range, CharSequence text) {
/* 285 */     if (range.getStart() > 2) {
/* 286 */       int start = range.getStart() - 1;
/* 287 */       if (text.charAt(start) == '@' || text.charAt(start) == '/') {
/* 288 */         for (; start > 0 && !CharsKt.isWhitespace(text.charAt(start - 1)); start--);
/* 289 */         while (start < range.getStart() - 1) {
/* 290 */           if (Pattern.Companion.isWordBoundaryBefore(text, start) && this.optionalPrefixRegex.matches(text.subSequence(start, range.getStart()))) {
/* 291 */             return new TextRange(start, range.getEndExclusive());
/*     */           }
/* 293 */           start++;
/*     */         } 
/* 295 */         return null;
/*     */       } 
/*     */     } 
/* 298 */     return range;
/*     */   }
/*     */   
/*     */   public boolean matches(CharSequence text) {
/* 302 */     Intrinsics.checkNotNullParameter(text, "text"); int dot = StringsKt.indexOf$default(text, '.', 1, false, 4, null);
/* 303 */     if (dot < 0 || dot >= text.length() - 2 || !isMainUrlPart(text.charAt(dot - 1)) || !isMainUrlPart(text.charAt(dot + 1))) {
/* 304 */       return false;
/*     */     }
/*     */     
/* 307 */     MatchResult prefix = this.optionalPrefixRegex.matchAt(text, 0);
/* 308 */     return text.matchesAt((CharSequence)prefix, (prefix == null) ? 0 : (prefix.getRange().getLast() + 1));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\standard\LikelyPatterns$IsURL$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */