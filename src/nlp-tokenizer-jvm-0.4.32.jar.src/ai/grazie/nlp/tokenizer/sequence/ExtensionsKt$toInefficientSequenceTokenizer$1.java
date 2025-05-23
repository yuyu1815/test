/*    */ package ai.grazie.nlp.tokenizer.sequence;
/*    */ 
/*    */ import ai.grazie.nlp.tokenizer.Tokenizer;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.sequences.Sequence;
/*    */ import kotlin.sequences.SequencesKt;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\f\n\000*\001\000\b\n\030\0002\0020\001J\034\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\003H\026¨\006\007"}, d2 = {"ai/grazie/nlp/tokenizer/sequence/ExtensionsKt$toInefficientSequenceTokenizer$1", "Lai/grazie/nlp/tokenizer/sequence/SequenceTokenizer;", "tokenizeAsSequence", "Lkotlin/sequences/Sequence;", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "text", "", "nlp-tokenizer"})
/*    */ public final class ExtensionsKt$toInefficientSequenceTokenizer$1 implements SequenceTokenizer {
/*    */   public Sequence<Tokenizer.Token> tokenizeAsSequence(Sequence text) {
/* 14 */     Intrinsics.checkNotNullParameter(text, "text"); String string = SequencesKt.joinToString$default(text, "", null, null, 0, null, ExtensionsKt$toInefficientSequenceTokenizer$1$tokenizeAsSequence$string$1.INSTANCE, 30, null);
/* 15 */     return this.$self.tokenizeAsSequence(string);
/*    */   }
/*    */   
/*    */   ExtensionsKt$toInefficientSequenceTokenizer$1(CharSequenceTokenizer $self) {}
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\020\f\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "", "invoke"})
/*    */   static final class ExtensionsKt$toInefficientSequenceTokenizer$1$tokenizeAsSequence$string$1 extends Lambda implements Function1<Character, CharSequence> {
/*    */     public static final ExtensionsKt$toInefficientSequenceTokenizer$1$tokenizeAsSequence$string$1 INSTANCE = new ExtensionsKt$toInefficientSequenceTokenizer$1$tokenizeAsSequence$string$1();
/*    */     
/*    */     ExtensionsKt$toInefficientSequenceTokenizer$1$tokenizeAsSequence$string$1() {
/*    */       super(1);
/*    */     }
/*    */     
/*    */     public final CharSequence invoke(char it) {
/*    */       return String.valueOf(it);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\sequence\ExtensionsKt$toInefficientSequenceTokenizer$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */