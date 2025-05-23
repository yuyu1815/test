/*     */ package ai.grazie.nlp.tokenizer.sentence;
/*     */ 
/*     */ import ai.grazie.nlp.patterns.Pattern;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\031\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\006\032\b\022\004\022\0020\b0\0072\006\020\t\032\0020\nH\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\013"}, d2 = {"ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$endPunctuation$1", "Lai/grazie/nlp/patterns/Pattern;", "regex", "Lkotlin/text/Regex;", "startChars", "", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-tokenizer"})
/*     */ public final class StandardSentenceTokenizer$Companion$endPunctuation$1
/*     */   implements Pattern
/*     */ {
/*     */   private final char[] startChars;
/*     */   private final Regex regex;
/*     */   
/*     */   StandardSentenceTokenizer$Companion$endPunctuation$1() {
/* 137 */     Intrinsics.checkNotNullExpressionValue("?!.:;\n".toCharArray(), "toCharArray(...)"); this.startChars = "?!.:;\n".toCharArray();
/* 138 */     this.regex = new Regex("(" + StandardSentenceTokenizer.access$getNormalSentenceEnd$cp() + "|" + StandardSentenceTokenizer.access$getRomanBullet$cp() + "|(^|\n)(\\([\\d\\p{L}]{1,3}(\\.[\\d\\p{L}]{1,3})*\\)|\\[[\\d\\p{L}]{1,3}(\\.[\\d\\p{L}]{1,3})*\\]))(\n+|\\s+|$)|([:;]-?[()]+)(\n+|\\s+|$|" + 
/* 139 */         StandardSentenceTokenizer.access$getNormalSentenceEnd$cp() + ")+");
/*     */   }
/*     */   public List<TextRange> find(CharSequence text) {
/* 142 */     Intrinsics.checkNotNullParameter(text, "text"); int offset = 0;
/* 143 */     ArrayList<TextRange> result = new ArrayList();
/* 144 */     while (offset >= 0) {
/* 145 */       MatchResult mr = this.regex.matchAt(text, offset);
/* 146 */       if (mr != null) {
/* 147 */         if (!StandardSentenceTokenizer.access$getSentenceContinuation$cp().matchesAt(text, offset)) {
/* 148 */           result.add(TextRange.Companion.invoke(mr.getRange()));
/*     */         }
/* 150 */         offset = mr.getRange().getLast() + 1;
/*     */       } 
/* 152 */       offset = StringsKt.indexOfAny$default(text, this.startChars, offset + 1, false, 4, null);
/*     */     } 
/* 154 */     return result;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\sentence\StandardSentenceTokenizer$Companion$endPunctuation$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */