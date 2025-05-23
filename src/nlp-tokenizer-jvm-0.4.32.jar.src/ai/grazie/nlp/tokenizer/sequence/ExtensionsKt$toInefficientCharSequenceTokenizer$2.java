/*    */ package ai.grazie.nlp.tokenizer.sequence;
/*    */ 
/*    */ import ai.grazie.nlp.tokenizer.NonDestructiveTokenizer;
/*    */ import ai.grazie.nlp.tokenizer.Tokenizer;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.sequences.Sequence;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/tokenizer/sequence/ExtensionsKt$toInefficientCharSequenceTokenizer$2", "Lai/grazie/nlp/tokenizer/sequence/NonDestructiveCharSequenceTokenizer;", "tokenizeAsSequence", "Lkotlin/sequences/Sequence;", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "text", "", "nlp-tokenizer"})
/*    */ public final class ExtensionsKt$toInefficientCharSequenceTokenizer$2
/*    */   implements NonDestructiveCharSequenceTokenizer
/*    */ {
/*    */   ExtensionsKt$toInefficientCharSequenceTokenizer$2(NonDestructiveTokenizer $self) {}
/*    */   
/*    */   public Sequence<Tokenizer.Token> tokenizeAsSequence(CharSequence text) {
/* 56 */     Intrinsics.checkNotNullParameter(text, "text"); return CollectionsKt.asSequence(this.$self.tokenize(text.toString()));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\sequence\ExtensionsKt$toInefficientCharSequenceTokenizer$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */