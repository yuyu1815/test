/*    */ package ai.grazie.nlp.langs.alphabet;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\020\r\n\002\b\004\b\026\030\0002\0020\001B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\026J\020\020\007\032\0020\0042\006\020\005\032\0020\006H\026J\020\020\b\032\0020\0042\006\020\005\032\0020\006H\026J\020\020\t\032\0020\0042\006\020\005\032\0020\006H\026¨\006\n"}, d2 = {"Lai/grazie/nlp/langs/alphabet/NoneAlphabet;", "Lai/grazie/nlp/langs/alphabet/Alphabet;", "()V", "matchAny", "", "input", "", "matchAnySpecial", "matchAnyUnique", "matchEntire", "nlp-langs"})
/*    */ public class NoneAlphabet extends Alphabet {
/*  4 */   public NoneAlphabet() { super(Alphabet.Group.NONE, null); } public boolean matchAnySpecial(@NotNull CharSequence input) {
/*  5 */     Intrinsics.checkNotNullParameter(input, "input"); return false;
/*    */   } public boolean matchAnyUnique(@NotNull CharSequence input) {
/*  7 */     Intrinsics.checkNotNullParameter(input, "input"); return false;
/*    */   }
/*  9 */   public boolean matchEntire(@NotNull CharSequence input) { Intrinsics.checkNotNullParameter(input, "input"); return false; } public boolean matchAny(@NotNull CharSequence input) {
/* 10 */     Intrinsics.checkNotNullParameter(input, "input"); return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-langs-jvm-0.4.32.jar!\ai\grazie\nlp\langs\alphabet\NoneAlphabet.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */