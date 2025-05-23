/*    */ package ai.grazie.nlp.tokenizer;
/*    */ 
/*    */ import ai.grazie.nlp.langs.Language;
/*    */ import ai.grazie.nlp.tokenizer.sentence.StandardSentenceTokenizer;
/*    */ import ai.grazie.nlp.tokenizer.word.StandardWordTokenizer;
/*    */ import ai.grazie.nlp.tokenizer.word.WhitespaceWordTokenizer;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\006\n\002\020\b\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\t\032\0020\0042\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\rJ\016\020\016\032\0020\0042\006\020\f\032\0020\rR\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006¨\006\017"}, d2 = {"Lai/grazie/nlp/tokenizer/JSTokenizers;", "", "()V", "whitespace", "Lai/grazie/nlp/tokenizer/JsExportableTokenizer;", "getWhitespace", "()Lai/grazie/nlp/tokenizer/JsExportableTokenizer;", "words", "getWords", "sentence", "splitByNewLinesNumber", "", "language", "Lai/grazie/nlp/langs/Language;", "spacy", "nlp-tokenizer"})
/*    */ public final class JSTokenizers
/*    */ {
/*    */   @NotNull
/*    */   public final JsExportableTokenizer sentence(int splitByNewLinesNumber, @NotNull Language language) {
/* 49 */     Intrinsics.checkNotNullParameter(language, "language"); return new TokenizerJsExportableWrapper((Tokenizer)new StandardSentenceTokenizer(Integer.valueOf(splitByNewLinesNumber), language));
/*    */   }
/*    */   @NotNull
/*    */   public final JsExportableTokenizer spacy(@NotNull Language language) {
/* 53 */     Intrinsics.checkNotNullParameter(language, "language"); switch (WhenMappings.$EnumSwitchMapping$0[language.ordinal()]) { case 1: 
/*    */       case 2: 
/*    */       case 3:
/* 56 */        }  throw new IllegalStateException(("Unsupported language " + 
/* 57 */         language).toString());
/*    */   }
/*    */   
/*    */   @NotNull
/* 61 */   public static final JSTokenizers INSTANCE = new JSTokenizers(); @NotNull private static final JsExportableTokenizer words = new TokenizerJsExportableWrapper((Tokenizer)StandardWordTokenizer.INSTANCE); @NotNull public final JsExportableTokenizer getWords() { return words; }
/*    */    @NotNull
/* 63 */   private static final JsExportableTokenizer whitespace = new TokenizerJsExportableWrapper((Tokenizer)WhitespaceWordTokenizer.INSTANCE); @NotNull public final JsExportableTokenizer getWhitespace() { return whitespace; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\JSTokenizers.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */