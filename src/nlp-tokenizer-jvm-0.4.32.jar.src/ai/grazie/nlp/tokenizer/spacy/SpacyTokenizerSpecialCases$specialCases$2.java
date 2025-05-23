/*    */ package ai.grazie.nlp.tokenizer.spacy;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.MapsKt;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020%\n\002\020\016\n\002\020 \n\002\030\002\n\000\020\000\032\024\022\004\022\0020\002\022\n\022\b\022\004\022\0020\0040\0030\001H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "", "", "Lai/grazie/nlp/tokenizer/spacy/SpacyTokenInfo;", "invoke"})
/*    */ final class SpacyTokenizerSpecialCases$specialCases$2
/*    */   extends Lambda
/*    */   implements Function0<Map<String, List<? extends SpacyTokenInfo>>>
/*    */ {
/*    */   public final Map<String, List<SpacyTokenInfo>> invoke() {
/* 20 */     Map cases = MapsKt.toMutableMap(MapsKt.plus(SpacyTokenizerSpecialCases.this.getTokenizerExceptions(), SpacyTokenizerSpecialCases.this.getBaseExceptions()));
/* 21 */     return SpacyTokenizerSpecialCases.access$expandExceptions(SpacyTokenizerSpecialCases.this, cases, "'", "’");
/*    */   }
/*    */   
/*    */   SpacyTokenizerSpecialCases$specialCases$2() {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\spacy\SpacyTokenizerSpecialCases$specialCases$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */