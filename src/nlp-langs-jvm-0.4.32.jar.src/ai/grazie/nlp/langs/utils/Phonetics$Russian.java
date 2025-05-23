/*    */ package ai.grazie.nlp.langs.utils;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\"\n\002\020\f\n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\027\020\003\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\006\020\007R\027\020\b\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\t\020\007¨\006\n"}, d2 = {"Lai/grazie/nlp/langs/utils/Phonetics$Russian;", "", "()V", "consonants", "", "", "getConsonants", "()Ljava/util/Set;", "vowels", "getVowels", "nlp-langs"})
/*    */ public final class Russian {
/*    */   @NotNull
/*  7 */   public static final Russian INSTANCE = new Russian(); @NotNull private static final Set<Character> consonants; @NotNull public final Set<Character> getConsonants() { return consonants; } @NotNull
/*  8 */   private static final Set<Character> vowels; static { Character[] arrayOfCharacter = new Character[42]; arrayOfCharacter[0] = Character.valueOf('Б'); arrayOfCharacter[1] = Character.valueOf('В'); arrayOfCharacter[2] = Character.valueOf('Г'); arrayOfCharacter[3] = Character.valueOf('Д'); arrayOfCharacter[4] = Character.valueOf('Ж'); arrayOfCharacter[5] = Character.valueOf('З'); arrayOfCharacter[6] = Character.valueOf('Й'); arrayOfCharacter[7] = Character.valueOf('К'); arrayOfCharacter[8] = Character.valueOf('Л'); arrayOfCharacter[9] = Character.valueOf('М'); arrayOfCharacter[10] = Character.valueOf('Н'); arrayOfCharacter[11] = Character.valueOf('П'); arrayOfCharacter[12] = Character.valueOf('Р'); arrayOfCharacter[13] = Character.valueOf('С'); arrayOfCharacter[14] = Character.valueOf('Т'); arrayOfCharacter[15] = Character.valueOf('Ф'); arrayOfCharacter[16] = Character.valueOf('Х'); arrayOfCharacter[17] = Character.valueOf('Ц'); arrayOfCharacter[18] = Character.valueOf('Ч'); arrayOfCharacter[19] = Character.valueOf('Ш'); arrayOfCharacter[20] = Character.valueOf('Щ'); arrayOfCharacter[21] = 
/*  9 */       Character.valueOf('б'); arrayOfCharacter[22] = Character.valueOf('в'); arrayOfCharacter[23] = Character.valueOf('г'); arrayOfCharacter[24] = Character.valueOf('д'); arrayOfCharacter[25] = Character.valueOf('ж'); arrayOfCharacter[26] = Character.valueOf('з'); arrayOfCharacter[27] = Character.valueOf('й'); arrayOfCharacter[28] = Character.valueOf('к'); arrayOfCharacter[29] = Character.valueOf('л'); arrayOfCharacter[30] = Character.valueOf('м'); arrayOfCharacter[31] = Character.valueOf('н'); arrayOfCharacter[32] = Character.valueOf('п'); arrayOfCharacter[33] = Character.valueOf('р'); arrayOfCharacter[34] = Character.valueOf('с'); arrayOfCharacter[35] = Character.valueOf('т'); arrayOfCharacter[36] = Character.valueOf('ф'); arrayOfCharacter[37] = Character.valueOf('х'); arrayOfCharacter[38] = Character.valueOf('ц'); arrayOfCharacter[39] = Character.valueOf('ч'); arrayOfCharacter[40] = Character.valueOf('ш'); arrayOfCharacter[41] = Character.valueOf('щ');
/*    */     
/*    */     consonants = SetsKt.setOf((Object[])arrayOfCharacter);
/* 12 */     arrayOfCharacter = new Character[12]; arrayOfCharacter[0] = Character.valueOf('А'); arrayOfCharacter[1] = Character.valueOf('И'); arrayOfCharacter[2] = Character.valueOf('О'); arrayOfCharacter[3] = Character.valueOf('У'); arrayOfCharacter[4] = Character.valueOf('Ы'); arrayOfCharacter[5] = Character.valueOf('Э'); arrayOfCharacter[6] = 
/* 13 */       Character.valueOf('а'); arrayOfCharacter[7] = Character.valueOf('и'); arrayOfCharacter[8] = Character.valueOf('о'); arrayOfCharacter[9] = Character.valueOf('у'); arrayOfCharacter[10] = Character.valueOf('ы'); arrayOfCharacter[11] = Character.valueOf('э');
/*    */     vowels = SetsKt.setOf((Object[])arrayOfCharacter); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Set<Character> getVowels() {
/*    */     return vowels;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-langs-jvm-0.4.32.jar!\ai\grazie\nlp\lang\\utils\Phonetics$Russian.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */