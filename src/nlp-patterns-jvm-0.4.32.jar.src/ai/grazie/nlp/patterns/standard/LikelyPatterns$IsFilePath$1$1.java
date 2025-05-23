/*     */ package ai.grazie.nlp.patterns.standard;
/*     */ 
/*     */ import ai.grazie.nlp.patterns.Pattern;
/*     */ import ai.grazie.nlp.patterns.RegexPattern;
/*     */ import ai.grazie.text.TextRange;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000/\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000\n\002\020\013\n\000\n\002\020\f\n\002\b\002\n\002\020\b\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026J\020\020\007\032\0020\b2\006\020\t\032\0020\nH\002J\030\020\013\032\0020\b2\006\020\005\032\0020\0062\006\020\f\032\0020\rH\002¨\006\016"}, d2 = {"ai/grazie/nlp/patterns/standard/LikelyPatterns$IsFilePath$1$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "isNamePatternPart", "", "c", "", "isPathStartAllowed", "start", "", "nlp-patterns"})
/*     */ public final class LikelyPatterns$IsFilePath$1$1
/*     */   extends RegexPattern
/*     */ {
/*     */   LikelyPatterns$IsFilePath$1$1(Regex $super_call_param$1) {
/* 180 */     super($super_call_param$1); } private final boolean isNamePatternPart(char c) {
/* 181 */     if (!StringsKt.contains$default("~_-‹›<>{}*", c, false, 2, null)) if (!(('0' <= c) ? ((c < ':') ? 1 : 0) : 0)) if (!(('a' <= c) ? ((c < '{') ? 1 : 0) : 0)) { if (('A' <= c) ? ((c < '[')) : false); return false; }
/*     */           
/*     */   } public List<TextRange> find(CharSequence text) {
/* 184 */     Intrinsics.checkNotNullParameter(text, "text"); ArrayList<TextRange> result = new ArrayList();
/* 185 */     int i = 0;
/* 186 */     int minStart = 0;
/* 187 */     while (i < text.length()) {
/* 188 */       char c = text.charAt(i);
/* 189 */       boolean retreat = (c == '/' || c == '\\' || c == '<' || c == '.');
/* 190 */       if (retreat || c == '%' || c == '$') {
/* 191 */         int start = i;
/* 192 */         if (retreat) {
/* 193 */           for (; start > minStart && isNamePatternPart(text.charAt(start - 1)); start--);
/*     */         }
/* 195 */         while (start <= i) {
/* 196 */           if (isPathStartAllowed(text, start)) {
/* 197 */             MatchResult match = getRegex().matchAt(text, start);
/* 198 */             if (match != null) {
/* 199 */               minStart = match.getRange().getLast() + 1;
/* 200 */               result.add(TextRange.Companion.invoke(match.getRange()));
/* 201 */               i = Math.max(match.getRange().getLast(), i);
/*     */               break;
/*     */             } 
/*     */           } 
/* 205 */           start++;
/*     */         } 
/*     */       } 
/* 208 */       i++;
/*     */     } 
/* 210 */     return result;
/*     */   }
/*     */   
/*     */   private final boolean isPathStartAllowed(CharSequence text, int start) {
/* 214 */     return (Pattern.Companion.isWordBoundaryBefore(text, start) && (
/* 215 */       start <= 0 || !Character.isLetterOrDigit(text.charAt(start - 1))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\standard\LikelyPatterns$IsFilePath$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */