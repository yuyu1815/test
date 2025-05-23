/*     */ package ai.grazie.nlp.patterns;
/*     */ 
/*     */ import ai.grazie.nlp.utils.CharUtils;
/*     */ import ai.grazie.nlp.utils.Symbols;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.CharsKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\013\n\000\n\002\020\r\n\000\n\002\020\b\n\002\b\004\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\030\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\002J\030\020\t\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\007J\035\020\n\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\000¢\006\002\b\013¨\006\f"}, d2 = {"Lai/grazie/nlp/patterns/Pattern$Companion;", "", "()V", "isInnerApostrophe", "", "text", "", "offset", "", "isWordBoundaryBefore", "isWordBoundaryOrApostrophe", "isWordBoundaryOrApostrophe$nlp_patterns", "nlp-patterns"})
/*     */ public final class Companion
/*     */ {
/*     */   @JvmStatic
/*     */   public final boolean isWordBoundaryBefore(@NotNull CharSequence text, int offset) {
/* 101 */     Intrinsics.checkNotNullParameter(text, "text"); if (offset == 0 || offset == text.length()) {
/* 102 */       return true;
/*     */     }
/* 104 */     char c1 = text.charAt(offset - 1);
/* 105 */     char c2 = text.charAt(offset);
/* 106 */     if (isInnerApostrophe(text, offset) || isInnerApostrophe(text, offset - 1)) return false; 
/* 107 */     return (Character.isLetterOrDigit(c1) != Character.isLetterOrDigit(c2) || 
/* 108 */       CharsKt.isWhitespace(c1) != CharsKt.isWhitespace(c2) || (
/* 109 */       c1 != c2 && CharUtils.INSTANCE.isPunctuation(c1) && CharUtils.INSTANCE.isPunctuation(c2)));
/*     */   }
/*     */   
/*     */   private final boolean isInnerApostrophe(CharSequence text, int offset) {
/* 113 */     return (Symbols.INSTANCE.getApostrophes().contains(Character.valueOf(text.charAt(offset))) && 
/* 114 */       text.length() > offset + 1 && Character.isLetter(text.charAt(offset + 1)) && 
/* 115 */       offset > 0 && Character.isLetter(text.charAt(offset - 1)));
/*     */   } public final boolean isWordBoundaryOrApostrophe$nlp_patterns(@NotNull CharSequence text, int offset) {
/* 117 */     Intrinsics.checkNotNullParameter(text, "text"); return (isWordBoundaryBefore(text, offset) || isInnerApostrophe(text, offset));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\Pattern$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */