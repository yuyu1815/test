/*    */ package ai.grazie.nlp.patterns;
/*    */ 
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000\n\002\020\013\n\000\b\026\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\026\020\007\032\b\022\004\022\0020\t0\b2\006\020\n\032\0020\013H\026J\020\020\f\032\0020\r2\006\020\n\032\0020\013H\026R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\016"}, d2 = {"Lai/grazie/nlp/patterns/RegexPattern;", "Lai/grazie/nlp/patterns/Pattern;", "regex", "Lkotlin/text/Regex;", "(Lkotlin/text/Regex;)V", "getRegex", "()Lkotlin/text/Regex;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "matches", "", "nlp-patterns"})
/*    */ public class RegexPattern implements Pattern {
/*    */   @NotNull
/*    */   private final Regex regex;
/*    */   
/* 10 */   public RegexPattern(@NotNull Regex regex) { this.regex = regex; } @NotNull protected final Regex getRegex() { return this.regex; }
/*    */   @NotNull
/* 12 */   public List<TextRange> find(@NotNull CharSequence text) { Intrinsics.checkNotNullParameter(text, "text"); return SequencesKt.toList(SequencesKt.map(Regex.findAll$default(this.regex, text, 0, 2, null), RegexPattern$find$1.INSTANCE)); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Lai/grazie/text/TextRange;", "it", "Lkotlin/text/MatchResult;", "invoke"}) static final class RegexPattern$find$1 extends Lambda implements Function1<MatchResult, TextRange> { public static final RegexPattern$find$1 INSTANCE = new RegexPattern$find$1(); public final TextRange invoke(MatchResult it) { Intrinsics.checkNotNullParameter(it, "it"); return TextRange.Companion.invoke(it.getRange()); }
/*    */      RegexPattern$find$1() {
/*    */       super(1);
/*    */     } }
/*    */   public boolean matches(@NotNull CharSequence text) {
/* 17 */     Intrinsics.checkNotNullParameter(text, "text"); this.regex.matchAt(text, 0); return Intrinsics.areEqual((this.regex.matchAt(text, 0) != null) ? this.regex.matchAt(text, 0).getRange() : null, StringsKt.getIndices(text));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\RegexPattern.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */