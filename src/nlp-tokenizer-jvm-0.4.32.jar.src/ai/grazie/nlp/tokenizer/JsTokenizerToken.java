/*    */ package ai.grazie.nlp.tokenizer;
/*    */ 
/*    */ import ai.grazie.text.Text;
/*    */ import ai.grazie.text.TextRange;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\016\n\002\b\006\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\003\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\t\020\017\032\0020\003HÆ\003J\t\020\020\032\0020\005HÆ\003J\035\020\021\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\001HÖ\003J\t\020\025\032\0020\026HÖ\001J\016\020\027\032\0020\0002\006\020\024\032\0020\000J\t\020\030\032\0020\fHÖ\001R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\r\020\016¨\006\031"}, d2 = {"Lai/grazie/nlp/tokenizer/JsTokenizerToken;", "", "text", "Lai/grazie/text/Text;", "interval", "Lai/grazie/text/TextRange;", "(Lai/grazie/text/Text;Lai/grazie/text/TextRange;)V", "getInterval", "()Lai/grazie/text/TextRange;", "getText", "()Lai/grazie/text/Text;", "token", "", "getToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "merge", "toString", "nlp-tokenizer"})
/*    */ public final class JsTokenizerToken
/*    */ {
/*    */   @NotNull
/*    */   private final Text text;
/*    */   @NotNull
/*    */   private final TextRange interval;
/*    */   @NotNull
/*    */   private final String token;
/*    */   
/*    */   public JsTokenizerToken(@NotNull Text text, @NotNull TextRange interval) {
/* 26 */     this.text = text; this.interval = interval;
/* 27 */     this.token = this.text.getValue(); } @NotNull public final String getToken() { return this.token; }
/*    */    @NotNull
/*    */   public final Text getText() {
/*    */     return this.text;
/*    */   } @NotNull
/*    */   public final TextRange getInterval() {
/*    */     return this.interval;
/*    */   } @NotNull
/*    */   public final JsTokenizerToken merge(@NotNull JsTokenizerToken other) {
/* 36 */     Intrinsics.checkNotNullParameter(other, "other"); if (!((this.interval.getEndInclusive() == other.interval.getStart() - 1) ? 1 : 0)) { int $i$a$-require-JsTokenizerToken$merge$1 = 0; String str = "Can't merge tokens which are not sequential. Ranges were [" + 
/*    */         
/* 38 */         this.interval.getStart() + ", " + this.interval.getEndInclusive() + "] and [" + other.interval.getStart() + ", " + other.interval.getEndInclusive() + "]."; throw new IllegalArgumentException(str.toString()); }
/*    */     
/* 40 */     return new JsTokenizerToken(new Text(this.token + this.token), new TextRange(this.interval.getStart(), other.interval.getEndExclusive()));
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
/*    */   public final JsTokenizerToken copy(@NotNull Text text, @NotNull TextRange interval) {
/*    */     Intrinsics.checkNotNullParameter(text, "text");
/*    */     Intrinsics.checkNotNullParameter(interval, "interval");
/*    */     return new JsTokenizerToken(text, interval);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "JsTokenizerToken(text=" + this.text + ", interval=" + this.interval + ")";
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
/*    */     if (!(other instanceof JsTokenizerToken))
/*    */       return false; 
/*    */     JsTokenizerToken jsTokenizerToken = (JsTokenizerToken)other;
/*    */     return !Intrinsics.areEqual(this.text, jsTokenizerToken.text) ? false : (!!Intrinsics.areEqual(this.interval, jsTokenizerToken.interval));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\JsTokenizerToken.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */