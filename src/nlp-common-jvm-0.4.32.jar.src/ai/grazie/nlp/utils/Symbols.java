/*   */ package ai.grazie.nlp.utils;@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\"\n\002\020\f\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\027\020\003\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lai/grazie/nlp/utils/Symbols;", "", "()V", "Apostrophes", "", "", "getApostrophes", "()Ljava/util/Set;", "nlp-common"})
/*   */ public final class Symbols {
/*   */   @NotNull
/* 4 */   public static final Symbols INSTANCE = new Symbols(); @NotNull private static final Set<Character> Apostrophes; @NotNull public final Set<Character> getApostrophes() { return Apostrophes; } static { Character[] arrayOfCharacter = new Character[3]; arrayOfCharacter[0] = Character.valueOf('\''); arrayOfCharacter[1] = Character.valueOf('`'); arrayOfCharacter[2] = Character.valueOf('’'); Apostrophes = SetsKt.setOf((Object[])arrayOfCharacter); }
/*   */ 
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-common-jvm-0.4.32.jar!\ai\grazie\nl\\utils\Symbols.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */