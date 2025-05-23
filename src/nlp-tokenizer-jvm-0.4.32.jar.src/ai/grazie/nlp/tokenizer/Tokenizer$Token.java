/*    */ package ai.grazie.nlp.tokenizer;
/*    */ 
/*    */ import ai.grazie.text.Text;
/*    */ import ai.grazie.text.TextRange;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\r\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\003\b\b\030\0002\0020\001B\027\b\026\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006B\025\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n¢\006\002\020\013J\t\020\024\032\0020\bHÆ\003J\t\020\025\032\0020\nHÆ\003J\035\020\026\032\0020\0002\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\nHÆ\001J\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\001HÖ\003J\t\020\032\032\0020\033HÖ\001J\016\020\034\032\0020\0002\006\020\031\032\0020\000J\t\020\035\032\0020\003HÖ\001R\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\0058F¢\006\006\032\004\b\016\020\017R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\020\020\021R\021\020\002\032\0020\0038F¢\006\006\032\004\b\022\020\023¨\006\036"}, d2 = {"Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "", "token", "", "range", "Lkotlin/ranges/IntRange;", "(Ljava/lang/String;Lkotlin/ranges/IntRange;)V", "text", "Lai/grazie/text/Text;", "interval", "Lai/grazie/text/TextRange;", "(Lai/grazie/text/Text;Lai/grazie/text/TextRange;)V", "getInterval", "()Lai/grazie/text/TextRange;", "getRange", "()Lkotlin/ranges/IntRange;", "getText", "()Lai/grazie/text/Text;", "getToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "merge", "toString", "nlp-tokenizer"})
/*    */ public final class Token {
/*    */   @NotNull
/*    */   private final Text text;
/*    */   
/* 12 */   public Token(@NotNull Text text, @NotNull TextRange interval) { this.text = text; this.interval = interval; } @NotNull private final TextRange interval; @NotNull public final Text getText() { return this.text; } @NotNull public final TextRange getInterval() { return this.interval; }
/*    */   @NotNull
/* 14 */   public final String getToken() { return this.text.getValue(); } @NotNull
/*    */   public final IntRange getRange() {
/* 16 */     return new IntRange(this.interval.getStart(), this.interval.getEndInclusive());
/*    */   } public Token(@NotNull String token, @NotNull IntRange range) {
/* 18 */     this(new Text(token), TextRange.Companion.invoke(range));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Token merge(@NotNull Token other) {
/* 27 */     Intrinsics.checkNotNullParameter(other, "other"); if (!((getRange().getEndInclusive().intValue() == other.getRange().getStart().intValue() - 1) ? 1 : 0)) { int $i$a$-require-Tokenizer$Token$merge$1 = 0; String str = "Can't merge tokens which are not sequential. Ranges were [" + 
/*    */         
/* 29 */         getRange().getStart() + ", " + getRange().getEndInclusive() + "] and [" + other.getRange().getStart() + ", " + other.getRange().getEndInclusive() + "]."; throw new IllegalArgumentException(str.toString()); }
/*    */     
/* 31 */     return new Token(getToken() + getToken(), new IntRange(getRange().getStart().intValue(), other.getRange().getEndInclusive().intValue()));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Text component1() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TextRange component2() {
/*    */     return this.interval;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Token copy(@NotNull Text text, @NotNull TextRange interval) {
/*    */     Intrinsics.checkNotNullParameter(text, "text");
/*    */     Intrinsics.checkNotNullParameter(interval, "interval");
/*    */     return new Token(text, interval);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Token(text=" + this.text + ", interval=" + this.interval + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.text.hashCode();
/*    */     return result * 31 + this.interval.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Token))
/*    */       return false; 
/*    */     Token token = (Token)other;
/*    */     return !Intrinsics.areEqual(this.text, token.text) ? false : (!!Intrinsics.areEqual(this.interval, token.interval));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\Tokenizer$Token.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */