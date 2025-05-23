/*     */ package ai.grazie.nlp.tokenizer.sentence;
/*     */ 
/*     */ import ai.grazie.nlp.patterns.Pattern;
/*     */ import ai.grazie.text.TextRange;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.CharsKt;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000)\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000\n\002\020\013\n\000\n\002\020\b\n\002\b\006*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026J \020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\n2\006\020\005\032\0020\006H\002J \020\f\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\n2\006\020\005\032\0020\006H\002J \020\r\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\n2\006\020\005\032\0020\006H\002J\030\020\016\032\0020\b2\006\020\017\032\0020\n2\006\020\005\032\0020\006H\002¨\006\020"}, d2 = {"ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$Ellipsis$1$1", "Lai/grazie/nlp/patterns/Pattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "isActionNameEllipsis", "", "start", "", "end", "isEllipsisMatch", "isForOmittedSentenceParts", "isSpacedEllipsis", "i", "nlp-tokenizer"})
/*     */ public final class StandardSentenceTokenizer$Companion$Ellipsis$1$1
/*     */   implements Pattern
/*     */ {
/*     */   public List<TextRange> find(CharSequence text) {
/*  75 */     Intrinsics.checkNotNullParameter(text, "text"); ArrayList<TextRange> result = new ArrayList();
/*  76 */     for (int i = 0, j = text.length(); i < j; i++) {
/*  77 */       if (text.charAt(i) == '.' && i < text.length() - 2 && text.charAt(i + 2) == '.') {
/*  78 */         if (isSpacedEllipsis(i, text)) {
/*  79 */           result.add(new TextRange(i, i + 5));
/*  80 */         } else if (text.charAt(i + 1) == '.') {
/*  81 */           int end = i + 3;
/*  82 */           for (; end < text.length() && text.charAt(end) == '.'; end++);
/*  83 */           if (isEllipsisMatch(i, end, text)) {
/*  84 */             result.add(new TextRange(i, end));
/*     */           }
/*     */         } 
/*  87 */       } else if (text.charAt(i) == '…' && isEllipsisMatch(i, i + 1, text)) {
/*  88 */         result.add(new TextRange(i, i + 1));
/*     */       } 
/*     */     } 
/*  91 */     return result;
/*     */   }
/*     */ 
/*     */   
/*     */   private final boolean isSpacedEllipsis(int i, CharSequence text) {
/*  96 */     return (i + 4 < text.length() && text.charAt(i + 4) == '.' && CharsKt.isWhitespace(text.charAt(i + 1)) && CharsKt.isWhitespace(text.charAt(i + 3)));
/*     */   }
/*     */   private final boolean isEllipsisMatch(int start, int end, CharSequence text) {
/*  99 */     return (isForOmittedSentenceParts(start, end, text) || isActionNameEllipsis(start, end, text));
/*     */   }
/*     */   
/*     */   private final boolean isActionNameEllipsis(int start, int end, CharSequence text) {
/* 103 */     return (start > 0 && Character.isLetter(text.charAt(start - 1)) && end + 1 < text.length() && CharsKt.isWhitespace(text.charAt(end)) && Character.isLowerCase(text.charAt(end + 1)));
/*     */   }
/*     */   
/*     */   private final boolean isForOmittedSentenceParts(int start, int end, CharSequence text) {
/* 107 */     return (((start == 0 || CharsKt.isWhitespace(text.charAt(start - 1)) || StringsKt.contains$default(StandardSentenceTokenizer.access$getQuotes$cp(), text.charAt(start - 1), false, 2, null)) && (end == text.length() || CharsKt.isWhitespace(text.charAt(end)) || StringsKt.contains$default(StandardSentenceTokenizer.access$getQuotes$cp(), text.charAt(end), false, 2, null))) || (
/* 108 */       start > 0 && end < text.length() && text.charAt(start - 1) == '[' && text.charAt(end) == ']'));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\sentence\StandardSentenceTokenizer$Companion$Ellipsis$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */