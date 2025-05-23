/*    */ package ai.grazie.nlp.langs.alphabet;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\013\n\000\n\002\020\r\n\002\b\004\b\026\030\0002\0020\001B-\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\005\022\n\b\002\020\007\032\004\030\0010\005¢\006\002\020\bJ\020\020\t\032\0020\n2\006\020\013\032\0020\fH\026J\020\020\r\032\0020\n2\006\020\013\032\0020\fH\026J\020\020\016\032\0020\n2\006\020\013\032\0020\fH\026J\020\020\017\032\0020\n2\006\020\013\032\0020\fH\026R\016\020\004\032\0020\005X\004¢\006\002\n\000R\020\020\006\032\004\030\0010\005X\004¢\006\002\n\000R\020\020\007\032\004\030\0010\005X\004¢\006\002\n\000¨\006\020"}, d2 = {"Lai/grazie/nlp/langs/alphabet/RegexAlphabet;", "Lai/grazie/nlp/langs/alphabet/Alphabet;", "group", "Lai/grazie/nlp/langs/alphabet/Alphabet$Group;", "all", "Lkotlin/text/Regex;", "special", "unique", "(Lai/grazie/nlp/langs/alphabet/Alphabet$Group;Lkotlin/text/Regex;Lkotlin/text/Regex;Lkotlin/text/Regex;)V", "matchAny", "", "input", "", "matchAnySpecial", "matchAnyUnique", "matchEntire", "nlp-langs"})
/*    */ public class RegexAlphabet extends Alphabet { @NotNull
/*    */   private final Regex all;
/*    */   
/*  6 */   public RegexAlphabet(@NotNull Alphabet.Group group, @NotNull Regex all, @Nullable Regex special, @Nullable Regex unique) { super(group, null); this.all = all; this.special = special; this.unique = unique; } @Nullable private final Regex special; @Nullable
/*  7 */   private final Regex unique; public boolean matchAnyUnique(@NotNull CharSequence input) { Intrinsics.checkNotNullParameter(input, "input"); return (this.unique != null) ? ((this.unique.containsMatchIn(input) == true)) : false; }
/*    */    public boolean matchAnySpecial(@NotNull CharSequence input) {
/*  9 */     Intrinsics.checkNotNullParameter(input, "input"); return (this.special != null) ? ((this.special.containsMatchIn(input) == true)) : false;
/*    */   } public boolean matchAny(@NotNull CharSequence input) {
/* 11 */     Intrinsics.checkNotNullParameter(input, "input"); return this.all.containsMatchIn(input);
/*    */   } public boolean matchEntire(@NotNull CharSequence input) {
/* 13 */     Intrinsics.checkNotNullParameter(input, "input"); return this.all.matches(input);
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-langs-jvm-0.4.32.jar!\ai\grazie\nlp\langs\alphabet\RegexAlphabet.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */