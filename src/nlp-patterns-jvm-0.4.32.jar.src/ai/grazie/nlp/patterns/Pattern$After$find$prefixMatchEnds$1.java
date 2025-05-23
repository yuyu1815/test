/*    */ package ai.grazie.nlp.patterns;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.text.MatchResult;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke", "(Lkotlin/text/MatchResult;)Ljava/lang/Integer;"})
/*    */ final class Pattern$After$find$prefixMatchEnds$1
/*    */   extends Lambda
/*    */   implements Function1<MatchResult, Integer>
/*    */ {
/*    */   public static final Pattern$After$find$prefixMatchEnds$1 INSTANCE = new Pattern$After$find$prefixMatchEnds$1();
/*    */   
/*    */   Pattern$After$find$prefixMatchEnds$1() {
/*    */     super(1);
/*    */   }
/*    */   
/*    */   public final Integer invoke(MatchResult it) {
/* 89 */     Intrinsics.checkNotNullParameter(it, "it"); return Integer.valueOf(it.getRange().getLast() + 1);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\Pattern$After$find$prefixMatchEnds$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */