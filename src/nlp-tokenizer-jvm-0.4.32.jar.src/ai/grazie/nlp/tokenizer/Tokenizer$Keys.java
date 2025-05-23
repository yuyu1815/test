/*    */ package ai.grazie.nlp.tokenizer;
/*    */ 
/*    */ import ai.grazie.DataHolder;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\020 \n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\035\020\003\032\016\022\n\022\b\022\004\022\0020\0060\0050\004¢\006\b\n\000\032\004\b\007\020\bR\035\020\t\032\016\022\n\022\b\022\004\022\0020\0060\0050\004¢\006\b\n\000\032\004\b\n\020\b¨\006\013"}, d2 = {"Lai/grazie/nlp/tokenizer/Tokenizer$Keys;", "", "()V", "sentences", "Lai/grazie/DataHolder$Key;", "", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "getSentences", "()Lai/grazie/DataHolder$Key;", "words", "getWords", "nlp-tokenizer"})
/*    */ public final class Keys
/*    */ {
/*    */   @NotNull
/* 41 */   private static final DataHolder.Key<List<Tokenizer.Token>> sentences = new DataHolder.Key(); @NotNull public final DataHolder.Key<List<Tokenizer.Token>> getSentences() { return sentences; } @NotNull
/* 42 */   private static final DataHolder.Key<List<Tokenizer.Token>> words = new DataHolder.Key(); @NotNull public final DataHolder.Key<List<Tokenizer.Token>> getWords() { return words; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\Tokenizer$Keys.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */