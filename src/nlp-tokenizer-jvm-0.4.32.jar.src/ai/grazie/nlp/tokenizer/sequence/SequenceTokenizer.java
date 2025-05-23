/*    */ package ai.grazie.nlp.tokenizer.sequence;
/*    */ 
/*    */ import ai.grazie.nlp.tokenizer.Tokenizer;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.sequences.Sequence;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\r\n\002\020\f\n\000\bf\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026J\034\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0070\003H&ø\001\000\002\006\n\004\b!0\001¨\006\bÀ\006\001"}, d2 = {"Lai/grazie/nlp/tokenizer/sequence/SequenceTokenizer;", "Lai/grazie/nlp/tokenizer/sequence/CharSequenceTokenizer;", "tokenizeAsSequence", "Lkotlin/sequences/Sequence;", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "text", "", "", "nlp-tokenizer"})
/*    */ public interface SequenceTokenizer
/*    */   extends CharSequenceTokenizer
/*    */ {
/*    */   @NotNull
/*    */   Sequence<Tokenizer.Token> tokenizeAsSequence(@NotNull Sequence<Character> paramSequence);
/*    */   
/*    */   @NotNull
/*    */   default Sequence<Tokenizer.Token> tokenizeAsSequence(@NotNull CharSequence text) {
/* 34 */     Intrinsics.checkNotNullParameter(text, "text"); return tokenizeAsSequence(StringsKt.asSequence(text));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\sequence\SequenceTokenizer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */