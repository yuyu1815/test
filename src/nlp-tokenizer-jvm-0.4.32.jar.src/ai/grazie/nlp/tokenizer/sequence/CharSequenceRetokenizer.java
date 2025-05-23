/*    */ package ai.grazie.nlp.tokenizer.sequence;
/*    */ 
/*    */ import ai.grazie.nlp.tokenizer.Tokenizer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\005\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\020\r\n\002\b\003\b&\030\0002\0020\0012\0020\002B\r\022\006\020\003\032\0020\002¢\006\002\020\004J$\020\007\032\b\022\004\022\0020\t0\b2\006\020\n\032\0020\0132\f\020\f\032\b\022\004\022\0020\t0\bH\026J$\020\r\032\b\022\004\022\0020\t0\0162\006\020\n\032\0020\0172\f\020\f\032\b\022\004\022\0020\t0\016H&J\026\020\020\032\b\022\004\022\0020\t0\b2\006\020\n\032\0020\013H\026J\026\020\021\032\b\022\004\022\0020\t0\0162\006\020\n\032\0020\017H\026R\024\020\003\032\0020\002X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\022"}, d2 = {"Lai/grazie/nlp/tokenizer/sequence/CharSequenceRetokenizer;", "Lai/grazie/nlp/tokenizer/retokenizer/Retokenizer;", "Lai/grazie/nlp/tokenizer/sequence/NonDestructiveCharSequenceTokenizer;", "tokenizer", "(Lai/grazie/nlp/tokenizer/sequence/NonDestructiveCharSequenceTokenizer;)V", "getTokenizer", "()Lai/grazie/nlp/tokenizer/sequence/NonDestructiveCharSequenceTokenizer;", "retokenize", "", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "text", "", "tokens", "retokenizeAsSequence", "Lkotlin/sequences/Sequence;", "", "tokenize", "tokenizeAsSequence", "nlp-tokenizer"})
/*    */ public abstract class CharSequenceRetokenizer extends Retokenizer implements NonDestructiveCharSequenceTokenizer {
/*    */   @NotNull
/*  9 */   protected NonDestructiveCharSequenceTokenizer getTokenizer() { return this.tokenizer; } @NotNull
/* 10 */   private final NonDestructiveCharSequenceTokenizer tokenizer; public CharSequenceRetokenizer(@NotNull NonDestructiveCharSequenceTokenizer tokenizer) { super(tokenizer);
/*    */     this.tokenizer = tokenizer; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public List<Tokenizer.Token> retokenize(@NotNull String text, @NotNull List tokens) {
/* 18 */     Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(tokens, "tokens"); return SequencesKt.toList(retokenizeAsSequence(text, CollectionsKt.asSequence(tokens)));
/*    */   }
/*    */   @NotNull
/*    */   public Sequence<Tokenizer.Token> tokenizeAsSequence(@NotNull CharSequence text) {
/* 22 */     Intrinsics.checkNotNullParameter(text, "text"); Sequence<Tokenizer.Token> tokenized = getTokenizer().tokenizeAsSequence(text);
/* 23 */     Sequence<Tokenizer.Token> retokenized = retokenizeAsSequence(text, tokenized);
/*    */     
/* 25 */     return mergeSequences(text, tokenized, retokenized);
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public List<Tokenizer.Token> tokenize(@NotNull String text) {
/* 31 */     Intrinsics.checkNotNullParameter(text, "text"); return super.tokenize(text);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public abstract Sequence<Tokenizer.Token> retokenizeAsSequence(@NotNull CharSequence paramCharSequence, @NotNull Sequence<Tokenizer.Token> paramSequence);
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\sequence\CharSequenceRetokenizer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */