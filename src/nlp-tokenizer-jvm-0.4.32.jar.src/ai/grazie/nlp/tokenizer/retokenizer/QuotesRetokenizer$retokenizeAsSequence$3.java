/*    */ package ai.grazie.nlp.tokenizer.retokenizer;
/*    */ 
/*    */ import ai.grazie.nlp.tokenizer.Tokenizer;
/*    */ import ai.grazie.text.Text;
/*    */ import ai.grazie.text.TextRange;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.ranges.IntRange;
/*    */ import kotlin.text.StringsKt;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "it", "Lkotlin/ranges/IntRange;", "invoke"})
/*    */ final class QuotesRetokenizer$retokenizeAsSequence$3
/*    */   extends Lambda
/*    */   implements Function1<IntRange, Tokenizer.Token>
/*    */ {
/*    */   QuotesRetokenizer$retokenizeAsSequence$3(CharSequence $text) {
/*    */     super(1);
/*    */   }
/*    */   
/*    */   public final Tokenizer.Token invoke(IntRange it) {
/* 33 */     Intrinsics.checkNotNullParameter(it, "it"); return new Tokenizer.Token(new Text(StringsKt.substring(this.$text, it)), TextRange.Companion.invoke(it));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\retokenizer\QuotesRetokenizer$retokenizeAsSequence$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */