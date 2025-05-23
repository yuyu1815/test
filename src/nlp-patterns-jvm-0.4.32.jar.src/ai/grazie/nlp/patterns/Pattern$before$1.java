/*    */ package ai.grazie.nlp.patterns;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.Regex;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\r\n\000\n\002\020\b\n\000*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"ai/grazie/nlp/patterns/Pattern$before$1", "Lai/grazie/nlp/patterns/Pattern$Before;", "suffixMatches", "", "text", "", "at", "", "nlp-patterns"})
/*    */ public final class Pattern$before$1
/*    */   extends Pattern.Before
/*    */ {
/*    */   Pattern$before$1(Pattern $receiver, Regex $pattern) {
/* 33 */     super($receiver); } public boolean suffixMatches(CharSequence text, int at) {
/* 34 */     Intrinsics.checkNotNullParameter(text, "text"); return this.$pattern.matchesAt(text, at);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\Pattern$before$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */