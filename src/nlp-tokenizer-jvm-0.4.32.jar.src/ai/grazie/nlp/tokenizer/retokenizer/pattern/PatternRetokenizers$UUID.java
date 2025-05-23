/*    */ package ai.grazie.nlp.tokenizer.retokenizer.pattern;
/*    */ import ai.grazie.nlp.tokenizer.NonDestructiveTokenizer;
/*    */ import ai.grazie.nlp.tokenizer.retokenizer.PatternRetokenizer;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004¨\006\005"}, d2 = {"Lai/grazie/nlp/tokenizer/retokenizer/pattern/PatternRetokenizers$UUID;", "Lai/grazie/nlp/tokenizer/retokenizer/PatternRetokenizer;", "tokenizer", "Lai/grazie/nlp/tokenizer/NonDestructiveTokenizer;", "(Lai/grazie/nlp/tokenizer/NonDestructiveTokenizer;)V", "nlp-tokenizer"})
/*    */ public final class UUID extends PatternRetokenizer {
/*    */   public UUID(@NotNull NonDestructiveTokenizer tokenizer) {
/* 10 */     super((Pattern)StrictPatterns.INSTANCE.getIsUUID(), tokenizer);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\retokenizer\pattern\PatternRetokenizers$UUID.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */