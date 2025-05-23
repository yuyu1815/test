/*    */ package ai.grazie.nlp.tokenizer.retokenizer;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.IndexedValue;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.ranges.IntRange;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\f\n\000\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "Lkotlin/ranges/IntRange;", "it", "Lkotlin/collections/IndexedValue;", "", "invoke"})
/*    */ final class QuotesRetokenizer$retokenizeAsSequence$2
/*    */   extends Lambda
/*    */   implements Function1<IndexedValue<? extends Character>, IntRange>
/*    */ {
/*    */   public static final QuotesRetokenizer$retokenizeAsSequence$2 INSTANCE = new QuotesRetokenizer$retokenizeAsSequence$2();
/*    */   
/*    */   QuotesRetokenizer$retokenizeAsSequence$2() {
/*    */     super(1);
/*    */   }
/*    */   
/*    */   public final IntRange invoke(IndexedValue it) {
/* 32 */     Intrinsics.checkNotNullParameter(it, "it"); return new IntRange(it.getIndex(), it.getIndex());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\retokenizer\QuotesRetokenizer$retokenizeAsSequence$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */