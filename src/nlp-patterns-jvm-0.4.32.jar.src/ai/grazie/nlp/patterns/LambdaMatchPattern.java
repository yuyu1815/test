/*   */ package ai.grazie.nlp.patterns;
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\020\r\n\002\020\013\n\002\b\004\030\0002\0020\001B\031\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\002\020\006J\020\020\007\032\0020\0052\006\020\b\032\0020\004H\026R\032\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003X\004¢\006\002\n\000¨\006\t"}, d2 = {"Lai/grazie/nlp/patterns/LambdaMatchPattern;", "Lai/grazie/nlp/patterns/MatchPattern;", "filter", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "matches", "text", "nlp-patterns"})
/* 3 */ public final class LambdaMatchPattern implements MatchPattern { public LambdaMatchPattern(@NotNull Function1<CharSequence, Boolean> filter) { this.filter = filter; } @NotNull
/*   */   private final Function1<CharSequence, Boolean> filter; public boolean matches(@NotNull CharSequence text) {
/* 5 */     Intrinsics.checkNotNullParameter(text, "text"); return ((Boolean)this.filter.invoke(text)).booleanValue();
/*   */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\LambdaMatchPattern.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */