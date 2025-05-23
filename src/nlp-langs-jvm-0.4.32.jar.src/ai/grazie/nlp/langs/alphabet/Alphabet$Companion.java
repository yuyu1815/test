/*     */ package ai.grazie.nlp.langs.alphabet;
/*     */ 
/*     */ import java.util.LinkedHashSet;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\bA\n\002\030\002\n\002\030\002\n\002\b\022\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\036\020X\032\022\022\004\022\0020\0040Fj\b\022\004\022\0020\004`G2\006\020Y\032\0020ZR\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\f\020\006R\021\020\r\032\0020\004¢\006\b\n\000\032\004\b\016\020\006R\021\020\017\032\0020\004¢\006\b\n\000\032\004\b\020\020\006R\021\020\021\032\0020\004¢\006\b\n\000\032\004\b\022\020\006R\021\020\023\032\0020\004¢\006\b\n\000\032\004\b\024\020\006R\021\020\025\032\0020\004¢\006\b\n\000\032\004\b\026\020\006R\021\020\027\032\0020\004¢\006\b\n\000\032\004\b\030\020\006R\021\020\031\032\0020\004¢\006\b\n\000\032\004\b\032\020\006R\021\020\033\032\0020\004¢\006\b\n\000\032\004\b\034\020\006R\021\020\035\032\0020\004¢\006\b\n\000\032\004\b\036\020\006R\021\020\037\032\0020\004¢\006\b\n\000\032\004\b \020\006R\021\020!\032\0020\004¢\006\b\n\000\032\004\b\"\020\006R\021\020#\032\0020\004¢\006\b\n\000\032\004\b$\020\006R\021\020%\032\0020\004¢\006\b\n\000\032\004\b&\020\006R\021\020'\032\0020\004¢\006\b\n\000\032\004\b(\020\006R\021\020)\032\0020\004¢\006\b\n\000\032\004\b*\020\006R\021\020+\032\0020\004¢\006\b\n\000\032\004\b,\020\006R\021\020-\032\0020\004¢\006\b\n\000\032\004\b.\020\006R\021\020/\032\0020\004¢\006\b\n\000\032\004\b0\020\006R\021\0201\032\0020\004¢\006\b\n\000\032\004\b2\020\006R\021\0203\032\0020\004¢\006\b\n\000\032\004\b4\020\006R\021\0205\032\0020\004¢\006\b\n\000\032\004\b6\020\006R\021\0207\032\0020\004¢\006\b\n\000\032\004\b8\020\006R\021\0209\032\0020\004¢\006\b\n\000\032\004\b:\020\006R\021\020;\032\0020\004¢\006\b\n\000\032\004\b<\020\006R\021\020=\032\0020\004¢\006\b\n\000\032\004\b>\020\006R\021\020?\032\0020\004¢\006\b\n\000\032\004\b@\020\006R\021\020A\032\0020\004¢\006\b\n\000\032\004\bB\020\006R\021\020C\032\0020\004¢\006\b\n\000\032\004\bD\020\006R!\020E\032\022\022\004\022\0020\0040Fj\b\022\004\022\0020\004`G¢\006\b\n\000\032\004\bH\020IR!\020J\032\022\022\004\022\0020\0040Fj\b\022\004\022\0020\004`G¢\006\b\n\000\032\004\bK\020IR!\020L\032\022\022\004\022\0020\0040Fj\b\022\004\022\0020\004`G¢\006\b\n\000\032\004\bM\020IR!\020N\032\022\022\004\022\0020\0040Fj\b\022\004\022\0020\004`G¢\006\b\n\000\032\004\bO\020IR!\020P\032\022\022\004\022\0020\0040Fj\b\022\004\022\0020\004`G¢\006\b\n\000\032\004\bQ\020IR!\020R\032\022\022\004\022\0020\0040Fj\b\022\004\022\0020\004`G¢\006\b\n\000\032\004\bS\020IR!\020T\032\022\022\004\022\0020\0040Fj\b\022\004\022\0020\004`G¢\006\b\n\000\032\004\bU\020IR!\020V\032\022\022\004\022\0020\0040Fj\b\022\004\022\0020\004`G¢\006\b\n\000\032\004\bW\020I¨\006["}, d2 = {"Lai/grazie/nlp/langs/alphabet/Alphabet$Companion;", "", "()V", "ARABIC", "Lai/grazie/nlp/langs/alphabet/Alphabet;", "getARABIC", "()Lai/grazie/nlp/langs/alphabet/Alphabet;", "ASTURIAN", "getASTURIAN", "BELARUSIAN", "getBELARUSIAN", "BRETON", "getBRETON", "CATALAN", "getCATALAN", "CHINESE", "getCHINESE", "DANISH", "getDANISH", "DUTCH", "getDUTCH", "ENGLISH", "getENGLISH", "ESPERANTO", "getESPERANTO", "FRENCH", "getFRENCH", "GALICIAN", "getGALICIAN", "GERMAN", "getGERMAN", "GREEK", "getGREEK", "IRISH", "getIRISH", "ITALIAN", "getITALIAN", "JAPANESE", "getJAPANESE", "KHMER", "getKHMER", "KOREAN", "getKOREAN", "NONE", "getNONE", "PERSIAN", "getPERSIAN", "POLISH", "getPOLISH", "PORTUGUESE", "getPORTUGUESE", "ROMANIAN", "getROMANIAN", "RUSSIAN", "getRUSSIAN", "SLOVAK", "getSLOVAK", "SLOVENE", "getSLOVENE", "SPANISH", "getSPANISH", "SWEDISH", "getSWEDISH", "TAGALOG", "getTAGALOG", "TAMIL", "getTAMIL", "UKRANIAN", "getUKRANIAN", "all", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "getAll", "()Ljava/util/LinkedHashSet;", "arabic", "getArabic", "asian", "getAsian", "cyrillic", "getCyrillic", "greek", "getGreek", "khmer", "getKhmer", "latin", "getLatin", "tamil", "getTamil", "byGroup", "group", "Lai/grazie/nlp/langs/alphabet/Alphabet$Group;", "nlp-langs"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @NotNull
/*     */   public final Alphabet getENGLISH() {
/*  39 */     return Alphabet.access$getENGLISH$cp(); } @NotNull
/*  40 */   public final Alphabet getFRENCH() { return Alphabet.access$getFRENCH$cp(); } @NotNull
/*  41 */   public final Alphabet getGERMAN() { return Alphabet.access$getGERMAN$cp(); } @NotNull
/*  42 */   public final Alphabet getDUTCH() { return Alphabet.access$getDUTCH$cp(); } @NotNull
/*  43 */   public final Alphabet getITALIAN() { return Alphabet.access$getITALIAN$cp(); } @NotNull
/*  44 */   public final Alphabet getPOLISH() { return Alphabet.access$getPOLISH$cp(); } @NotNull
/*  45 */   public final Alphabet getPORTUGUESE() { return Alphabet.access$getPORTUGUESE$cp(); } @NotNull
/*  46 */   public final Alphabet getROMANIAN() { return Alphabet.access$getROMANIAN$cp(); } @NotNull
/*  47 */   public final Alphabet getSLOVAK() { return Alphabet.access$getSLOVAK$cp(); } @NotNull
/*  48 */   public final Alphabet getSPANISH() { return Alphabet.access$getSPANISH$cp(); } @NotNull
/*  49 */   public final Alphabet getASTURIAN() { return Alphabet.access$getASTURIAN$cp(); } @NotNull
/*  50 */   public final Alphabet getBRETON() { return Alphabet.access$getBRETON$cp(); } @NotNull
/*  51 */   public final Alphabet getCATALAN() { return Alphabet.access$getCATALAN$cp(); } @NotNull
/*  52 */   public final Alphabet getDANISH() { return Alphabet.access$getDANISH$cp(); } @NotNull
/*  53 */   public final Alphabet getESPERANTO() { return Alphabet.access$getESPERANTO$cp(); } @NotNull
/*  54 */   public final Alphabet getGALICIAN() { return Alphabet.access$getGALICIAN$cp(); } @NotNull
/*  55 */   public final Alphabet getIRISH() { return Alphabet.access$getIRISH$cp(); } @NotNull
/*  56 */   public final Alphabet getSLOVENE() { return Alphabet.access$getSLOVENE$cp(); } @NotNull
/*  57 */   public final Alphabet getSWEDISH() { return Alphabet.access$getSWEDISH$cp(); } @NotNull
/*  58 */   public final Alphabet getTAGALOG() { return Alphabet.access$getTAGALOG$cp(); }
/*     */   @NotNull
/*  60 */   public final Alphabet getGREEK() { return Alphabet.access$getGREEK$cp(); }
/*     */   @NotNull
/*  62 */   public final Alphabet getKHMER() { return Alphabet.access$getKHMER$cp(); }
/*     */   @NotNull
/*  64 */   public final Alphabet getTAMIL() { return Alphabet.access$getTAMIL$cp(); }
/*     */   @NotNull
/*  66 */   public final Alphabet getARABIC() { return Alphabet.access$getARABIC$cp(); } @NotNull
/*  67 */   public final Alphabet getPERSIAN() { return Alphabet.access$getPERSIAN$cp(); }
/*     */   @NotNull
/*  69 */   public final Alphabet getCHINESE() { return Alphabet.access$getCHINESE$cp(); } @NotNull
/*  70 */   public final Alphabet getJAPANESE() { return Alphabet.access$getJAPANESE$cp(); } @NotNull
/*  71 */   public final Alphabet getKOREAN() { return Alphabet.access$getKOREAN$cp(); }
/*     */   @NotNull
/*  73 */   public final Alphabet getRUSSIAN() { return Alphabet.access$getRUSSIAN$cp(); } @NotNull
/*  74 */   public final Alphabet getUKRANIAN() { return Alphabet.access$getUKRANIAN$cp(); } @NotNull
/*  75 */   public final Alphabet getBELARUSIAN() { return Alphabet.access$getBELARUSIAN$cp(); }
/*     */   @NotNull
/*  77 */   public final Alphabet getNONE() { return Alphabet.access$getNONE$cp(); } @NotNull
/*     */   public final LinkedHashSet<Alphabet> getAll() {
/*  79 */     return Alphabet.access$getAll$cp();
/*     */   }
/*     */   @NotNull
/*     */   public final LinkedHashSet<Alphabet> getLatin() {
/*  83 */     return Alphabet.access$getLatin$cp();
/*     */   }
/*     */   
/*     */   @NotNull
/*  87 */   public final LinkedHashSet<Alphabet> getGreek() { return Alphabet.access$getGreek$cp(); } @NotNull
/*  88 */   public final LinkedHashSet<Alphabet> getKhmer() { return Alphabet.access$getKhmer$cp(); } @NotNull
/*  89 */   public final LinkedHashSet<Alphabet> getTamil() { return Alphabet.access$getTamil$cp(); } @NotNull
/*  90 */   public final LinkedHashSet<Alphabet> getArabic() { return Alphabet.access$getArabic$cp(); } @NotNull
/*  91 */   public final LinkedHashSet<Alphabet> getCyrillic() { return Alphabet.access$getCyrillic$cp(); } @NotNull
/*  92 */   public final LinkedHashSet<Alphabet> getAsian() { return Alphabet.access$getAsian$cp(); } @NotNull
/*     */   public final LinkedHashSet<Alphabet> byGroup(@NotNull Alphabet.Group group) { Alphabet[] arrayOfAlphabet;
/*  94 */     Intrinsics.checkNotNullParameter(group, "group"); switch (WhenMappings.$EnumSwitchMapping$0[group.ordinal()]) { case 1: 
/*     */       case 2: 
/*     */       case 3: 
/*     */       case 4: 
/*     */       case 5: 
/*     */       case 6: 
/*     */       case 7: 
/*     */       case 8:
/* 102 */         arrayOfAlphabet = new Alphabet[1]; arrayOfAlphabet[0] = getNONE(); }  throw new NoWhenBranchMatchedException(); }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-langs-jvm-0.4.32.jar!\ai\grazie\nlp\langs\alphabet\Alphabet$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */