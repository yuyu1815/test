/*    */ package ai.grazie.nlp.tokenizer.spacy.uk;
/*    */ import java.util.List;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020 \n\002\020\016\n\002\b\007\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\027\020\003\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\006\020\007R\027\020\b\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\t\020\007R\027\020\n\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\013\020\007¨\006\f"}, d2 = {"Lai/grazie/nlp/tokenizer/spacy/uk/SpacyUkrainian;", "", "()V", "infixes", "", "", "getInfixes", "()Ljava/util/List;", "prefixes", "getPrefixes", "suffixes", "getSuffixes", "nlp-tokenizer"})
/*    */ public final class SpacyUkrainian {
/*    */   @NotNull
/*  8 */   public static final SpacyUkrainian INSTANCE = new SpacyUkrainian(); @NotNull private static final List<String> prefixes = SpacyBaseLanguage.INSTANCE.getPrefixes(); @NotNull public final List<String> getPrefixes() { return prefixes; }
/*    */    @NotNull
/* 10 */   private static final List<String> suffixes = SpacyBaseLanguage.INSTANCE.getSuffixes(); @NotNull public final List<String> getSuffixes() { return suffixes; }
/*    */    @NotNull
/* 12 */   private static final List<String> infixes = SpacyBaseLanguage.INSTANCE.getInfixes(); @NotNull public final List<String> getInfixes() { return infixes; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\spac\\uk\SpacyUkrainian.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */