/*    */ package ai.grazie.nlp.patterns;
/*    */ import ai.grazie.text.TextRange;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.text.MatchResult;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Lai/grazie/text/TextRange;", "it", "Lkotlin/text/MatchResult;", "invoke"})
/*    */ final class RegexPattern$find$1 extends Lambda implements Function1<MatchResult, TextRange> {
/*    */   public final TextRange invoke(MatchResult it) {
/* 12 */     Intrinsics.checkNotNullParameter(it, "it"); return TextRange.Companion.invoke(it.getRange());
/*    */   }
/*    */   
/*    */   public static final RegexPattern$find$1 INSTANCE = new RegexPattern$find$1();
/*    */   
/*    */   RegexPattern$find$1() {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\RegexPattern$find$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */