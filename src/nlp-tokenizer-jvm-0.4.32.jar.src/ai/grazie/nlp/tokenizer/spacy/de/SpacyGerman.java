/*    */ package ai.grazie.nlp.tokenizer.spacy.de;
/*    */ import ai.grazie.nlp.tokenizer.spacy.SpacyTokenizerCharClasses;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020 \n\002\020\016\n\002\b\n\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\027\020\003\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\006\020\007R\027\020\b\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\t\020\007R\027\020\n\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\013\020\007R\016\020\f\032\0020\005X\004¢\006\002\n\000R\027\020\r\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\016\020\007¨\006\017"}, d2 = {"Lai/grazie/nlp/tokenizer/spacy/de/SpacyGerman;", "", "()V", "infixes", "", "", "getInfixes", "()Ljava/util/List;", "newInfixes", "getNewInfixes", "prefixes", "getPrefixes", "quotes", "suffixes", "getSuffixes", "nlp-tokenizer"})
/*    */ public final class SpacyGerman {
/*    */   @NotNull
/*  9 */   public static final SpacyGerman INSTANCE = new SpacyGerman(); @NotNull private static final String quotes = StringsKt.replace$default(SpacyTokenizerCharClasses.INSTANCE.getConcatQuotes(), "'", "", false, 4, null);
/*    */   @NotNull
/* 11 */   private static final List<String> prefixes = SpacyBaseLanguage.INSTANCE.getPrefixes(); @NotNull public final List<String> getPrefixes() { return prefixes; } @NotNull
/*    */   private static final List<String> infixes; @NotNull
/* 13 */   private static final List<String> suffixes = CollectionsKt.plus(CollectionsKt.listOf("/"), SpacyBaseLanguage.INSTANCE.getSuffixes()); @NotNull private static final List<String> newInfixes; @NotNull public final List<String> getSuffixes() { return suffixes; } @NotNull
/*    */   public final List<String> getInfixes() {
/* 15 */     return infixes;
/*    */   }
/*    */   static {
/* 18 */     String[] arrayOfString = new String[2]; arrayOfString[0] = "(?<=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])(?:\\(|\\))(?=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])"; arrayOfString[1] = "(?<=[" + 
/*    */       
/* 20 */       SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "0-9])(?:" + SpacyTokenizerCharClasses.INSTANCE.getHyphens() + ")(?=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])";
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 25 */     arrayOfString = new String[8]; arrayOfString[0] = "(?<=[" + SpacyTokenizerCharClasses.INSTANCE.getAlphaLower() + "])\\.(?=[" + SpacyTokenizerCharClasses.INSTANCE.getAlphaUpper() + "])"; arrayOfString[1] = "(?<=[" + 
/* 26 */       SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])[,!?](?=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])";
/* 27 */     arrayOfString[2] = "(?<=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])[:<>=](?=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])";
/* 28 */     arrayOfString[3] = "(?<=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "]),(?=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])";
/* 29 */     arrayOfString[4] = "(?<=[0-9" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])\\/(?=[0-9" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])";
/* 30 */     arrayOfString[5] = "(?<=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])([" + quotes + "\\)\\]\\(\\[])(?=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])";
/* 31 */     arrayOfString[6] = "(?<=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])--(?=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])";
/* 32 */     arrayOfString[7] = "(?<=[0-9])-(?=[0-9])";
/*    */ 
/*    */     
/*    */     infixes = CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.listOf((Object[])arrayOfString), SpacyTokenizerCharClasses.INSTANCE.getListEllipses()), SpacyTokenizerCharClasses.INSTANCE.getListIcons()), CollectionsKt.listOf((Object[])arrayOfString));
/*    */     
/* 37 */     arrayOfString = new String[4]; arrayOfString[0] = "(?<=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])(?:\\(|\\))(?=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])"; arrayOfString[1] = "(?<=[" + 
/*    */       
/* 39 */       SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "0-9])(?:" + SpacyTokenizerCharClasses.INSTANCE.getHyphens() + ")(?=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "0-9])";
/*    */     
/* 41 */     arrayOfString[2] = "(?<=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])(?:[" + SpacyTokenizerCharClasses.INSTANCE.getNonContractionConcatQuotes() + "])(?=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + ".-])";
/*    */     
/* 43 */     arrayOfString[3] = "(?<=[" + SpacyTokenizerCharClasses.INSTANCE.getNonContractionConcatQuotes() + "])(?:[-.])(?=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])";
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 48 */     arrayOfString = new String[10]; arrayOfString[0] = "(?<=[" + SpacyTokenizerCharClasses.INSTANCE.getAlphaLower() + "])\\.(?=[" + SpacyTokenizerCharClasses.INSTANCE.getAlphaUpper() + "])"; arrayOfString[1] = "(?<=[" + 
/* 49 */       SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])[,!?](?=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])";
/* 50 */     arrayOfString[2] = "(?<=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])[<>=](?=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "/])";
/* 51 */     arrayOfString[3] = "(?<=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "]),(?=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])";
/*    */     
/* 53 */     arrayOfString[4] = "(?<=[0-9" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])\\/(?=(?:(?!innen)[0-9" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "]))";
/* 54 */     arrayOfString[5] = "(?<=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])[:](?=(?:(?!innen)[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "]))";
/* 55 */     arrayOfString[6] = "(?<=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])([" + quotes + "\\)\\]\\(\\[])(?=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])";
/* 56 */     arrayOfString[7] = "(?<=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])--(?=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])";
/*    */     
/* 58 */     arrayOfString[8] = "(?<=[" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])'s(?![" + SpacyTokenizerCharClasses.INSTANCE.getAlpha() + "])";
/* 59 */     arrayOfString[9] = "(?<=[0-9])-(?=[0-9])";
/*    */     newInfixes = CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.listOf((Object[])arrayOfString), SpacyTokenizerCharClasses.INSTANCE.getListEllipses()), SpacyTokenizerCharClasses.INSTANCE.getListIcons()), CollectionsKt.listOf((Object[])arrayOfString));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<String> getNewInfixes() {
/*    */     return newInfixes;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\spacy\de\SpacyGerman.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */