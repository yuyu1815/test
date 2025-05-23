/*    */ package ai.grazie.nlp.tokenizer.spacy.en;
/*    */ import java.util.List;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020 \n\002\020\016\n\002\b\013\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\027\020\003\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\006\020\007R\027\020\b\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\t\020\007R\027\020\n\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\013\020\007R\027\020\f\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\r\020\007R\027\020\016\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\017\020\007¨\006\020"}, d2 = {"Lai/grazie/nlp/tokenizer/spacy/en/SpacyEnglish;", "", "()V", "infixes", "", "", "getInfixes", "()Ljava/util/List;", "newInfixes", "getNewInfixes", "newSuffixes", "getNewSuffixes", "prefixes", "getPrefixes", "suffixes", "getSuffixes", "nlp-tokenizer"})
/*    */ public final class SpacyEnglish {
/*    */   @NotNull
/*  8 */   public static final SpacyEnglish INSTANCE = new SpacyEnglish(); @NotNull private static final List<String> prefixes = SpacyBaseLanguage.INSTANCE.getPrefixes(); @NotNull private static final List<String> suffixes; @NotNull public final List<String> getPrefixes() { return prefixes; } @NotNull
/*    */   private static final List<String> newSuffixes; @NotNull
/*    */   public final List<String> getSuffixes() {
/* 11 */     return suffixes;
/*    */   }
/* 13 */   static { String[] arrayOfString = new String[18]; arrayOfString[0] = "'ve"; arrayOfString[1] = "'re"; arrayOfString[2] = "n't"; arrayOfString[3] = "'ll"; arrayOfString[4] = "'d"; arrayOfString[5] = "'m"; arrayOfString[6] = "'s"; arrayOfString[7] = 
/* 14 */       "'VE"; arrayOfString[8] = "'RE"; arrayOfString[9] = "N'T"; arrayOfString[10] = "'LL"; arrayOfString[11] = "'D"; arrayOfString[12] = "'M"; arrayOfString[13] = "'S";
/* 15 */     arrayOfString[14] = "'s"; arrayOfString[15] = "'S"; arrayOfString[16] = "’s"; arrayOfString[17] = "’S";
/* 16 */     suffixes = CollectionsKt.plus(CollectionsKt.listOf((Object[])arrayOfString), SpacyBaseLanguage.INSTANCE.getSuffixes());
/*    */ 
/*    */ 
/*    */     
/* 20 */     arrayOfString = new String[4]; arrayOfString[0] = "'l"; arrayOfString[1] = "'L"; arrayOfString[2] = "'v"; arrayOfString[3] = "'V"; newSuffixes = CollectionsKt.listOf((Object[])arrayOfString); } @NotNull
/*    */   public final List<String> getNewSuffixes() { return newSuffixes; }
/*    */   @NotNull
/* 23 */   private static final List<String> infixes = SpacyBaseLanguage.INSTANCE.getInfixes(); @NotNull private static final List<String> newInfixes; @NotNull public final List<String> getInfixes() { return infixes; } @NotNull
/*    */   public final List<String> getNewInfixes() {
/* 25 */     return newInfixes;
/*    */   } static {
/* 27 */     arrayOfString = new String[2]; arrayOfString[0] = "(?<=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])(?:[" + SpacyTokenizerCharClasses.INSTANCE.getNonContractionConcatQuotes() + "])(?=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + ".-])"; arrayOfString[1] = "(?<=[" + 
/*    */       
/* 29 */       SpacyTokenizerCharClasses.INSTANCE.getNonContractionConcatQuotes() + "])(?:[-.])(?=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])";
/*    */     newInfixes = CollectionsKt.listOf((Object[])arrayOfString);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\spacy\en\SpacyEnglish.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */