/*    */ package ai.grazie.nlp.patterns;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\002\n\002\020\f\n\002\b\013\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006¢\006\002\020\007J\t\020\r\032\0020\003HÆ\003J\t\020\016\032\0020\003HÆ\003J\t\020\017\032\0020\006HÆ\003J'\020\020\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\006HÆ\001J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\001HÖ\003J\t\020\024\032\0020\003HÖ\001J\t\020\025\032\0020\026HÖ\001R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\n\020\013R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\t¨\006\027"}, d2 = {"Lai/grazie/nlp/patterns/AhoCorasickPattern$WideChar;", "", "start", "", "endExclusive", "main", "", "(IIC)V", "getEndExclusive", "()I", "getMain", "()C", "getStart", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "nlp-patterns"})
/*    */ public final class WideChar
/*    */ {
/*    */   private final int start;
/*    */   private final int endExclusive;
/*    */   private final char main;
/*    */   
/*    */   public WideChar(int start, int endExclusive, char main) {
/* 82 */     this.start = start; this.endExclusive = endExclusive; this.main = main; } public final int getStart() { return this.start; } public final int getEndExclusive() { return this.endExclusive; } public final char getMain() { return this.main; }
/*    */ 
/*    */   
/*    */   public final int component1() {
/*    */     return this.start;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.endExclusive;
/*    */   }
/*    */   
/*    */   public final char component3() {
/*    */     return this.main;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final WideChar copy(int start, int endExclusive, char main) {
/*    */     return new WideChar(start, endExclusive, main);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "WideChar(start=" + this.start + ", endExclusive=" + this.endExclusive + ", main=" + this.main + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Integer.hashCode(this.start);
/*    */     result = result * 31 + Integer.hashCode(this.endExclusive);
/*    */     return result * 31 + Character.hashCode(this.main);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof WideChar))
/*    */       return false; 
/*    */     WideChar wideChar = (WideChar)other;
/*    */     return (this.start != wideChar.start) ? false : ((this.endExclusive != wideChar.endExclusive) ? false : (!(this.main != wideChar.main)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\AhoCorasickPattern$WideChar.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */