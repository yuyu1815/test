/*     */ package ai.grazie.nlp.langs.alphabet;
/*     */ 
/*     */ import java.util.LinkedHashSet;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.SetsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.text.Regex;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\004\n\002\020\013\n\000\n\002\020\r\n\002\b\005\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b6\030\000 \0162\0020\001:\002\016\017B\017\b\004\022\006\020\002\032\0020\003¢\006\002\020\004J\020\020\007\032\0020\b2\006\020\t\032\0020\nH&J\020\020\013\032\0020\b2\006\020\t\032\0020\nH&J\020\020\f\032\0020\b2\006\020\t\032\0020\nH&J\020\020\r\032\0020\b2\006\020\t\032\0020\nH&R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006\001\003\020\021\022¨\006\023"}, d2 = {"Lai/grazie/nlp/langs/alphabet/Alphabet;", "", "group", "Lai/grazie/nlp/langs/alphabet/Alphabet$Group;", "(Lai/grazie/nlp/langs/alphabet/Alphabet$Group;)V", "getGroup", "()Lai/grazie/nlp/langs/alphabet/Alphabet$Group;", "matchAny", "", "input", "", "matchAnySpecial", "matchAnyUnique", "matchEntire", "Companion", "Group", "Lai/grazie/nlp/langs/alphabet/NoneAlphabet;", "Lai/grazie/nlp/langs/alphabet/RegexAlphabet;", "Lai/grazie/nlp/langs/alphabet/SetBasedAlphabet;", "nlp-langs"})
/*     */ public abstract class Alphabet {
/*  12 */   private Alphabet(Group group) { this.group = group; } @NotNull public final Group getGroup() { return this.group; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\020\n\000\n\002\030\002\n\002\020\f\n\002\020\013\n\002\b\005\n\002\020\r\n\002\b\013\b\001\030\000 \0252\b\022\004\022\0020\0000\001:\001\025B\033\b\002\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\002\020\006J\016\020\t\032\0020\0052\006\020\n\032\0020\013J\016\020\f\032\0020\0052\006\020\n\032\0020\013R\035\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\b\n\000\032\004\b\007\020\bj\002\b\rj\002\b\016j\002\b\017j\002\b\020j\002\b\021j\002\b\022j\002\b\023j\002\b\024¨\006\026"}, d2 = {"Lai/grazie/nlp/langs/alphabet/Alphabet$Group;", "", "acceptableChar", "Lkotlin/Function1;", "", "", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V", "getAcceptableChar", "()Lkotlin/jvm/functions/Function1;", "matchAny", "input", "", "matchEntire", "LATIN", "GREEK", "KHMER", "TAMIL", "ARABIC", "ASIAN", "CYRILLIC", "NONE", "Companion", "nlp-langs"})
/*     */   @SourceDebugExtension({"SMAP\nAlphabet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alphabet.kt\nai/grazie/nlp/langs/alphabet/Alphabet$Group\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,106:1\n1088#2,2:107\n1069#2,2:109\n*S KotlinDebug\n*F\n+ 1 Alphabet.kt\nai/grazie/nlp/langs/alphabet/Alphabet$Group\n*L\n29#1:107,2\n30#1:109,2\n*E\n"})
/*     */   public enum Group
/*     */   {
/*  20 */     LATIN((String)null.INSTANCE),
/*  21 */     GREEK((String)null.INSTANCE),
/*  22 */     KHMER((String)null.INSTANCE),
/*  23 */     TAMIL((String)null.INSTANCE),
/*  24 */     ARABIC((String)null.INSTANCE),
/*  25 */     ASIAN((String)null.INSTANCE),
/*  26 */     CYRILLIC((String)null.INSTANCE),
/*  27 */     NONE((String)null.INSTANCE); @NotNull public static final Companion Companion = new Companion(null); @NotNull
/*     */     private final Function1<Character, Boolean> acceptableChar; @NotNull
/*     */     private static final List<Group> all; @NotNull
/*     */     private static final List<Group> withSpaces; Group(Function1<Character, Boolean> acceptableChar) { this.acceptableChar = acceptableChar; }
/*     */     @NotNull
/*     */     public final Function1<Character, Boolean> getAcceptableChar() { return this.acceptableChar; }
/*  33 */     static { Group[] arrayOfGroup = new Group[7]; arrayOfGroup[0] = LATIN; arrayOfGroup[1] = GREEK; arrayOfGroup[2] = KHMER; arrayOfGroup[3] = TAMIL; arrayOfGroup[4] = ARABIC; arrayOfGroup[5] = ASIAN; arrayOfGroup[6] = CYRILLIC; all = CollectionsKt.listOf((Object[])arrayOfGroup);
/*  34 */       arrayOfGroup = new Group[3]; arrayOfGroup[0] = LATIN; arrayOfGroup[1] = GREEK; arrayOfGroup[2] = CYRILLIC; withSpaces = CollectionsKt.listOf((Object[])arrayOfGroup); } public final boolean matchAny(@NotNull CharSequence input) { // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'input'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_1
/*     */       //   7: astore_2
/*     */       //   8: iconst_0
/*     */       //   9: istore_3
/*     */       //   10: iconst_0
/*     */       //   11: istore #4
/*     */       //   13: iload #4
/*     */       //   15: aload_2
/*     */       //   16: invokeinterface length : ()I
/*     */       //   21: if_icmpge -> 74
/*     */       //   24: aload_2
/*     */       //   25: iload #4
/*     */       //   27: invokeinterface charAt : (I)C
/*     */       //   32: istore #5
/*     */       //   34: iload #5
/*     */       //   36: istore #6
/*     */       //   38: iconst_0
/*     */       //   39: istore #7
/*     */       //   41: aload_0
/*     */       //   42: getfield acceptableChar : Lkotlin/jvm/functions/Function1;
/*     */       //   45: iload #6
/*     */       //   47: invokestatic valueOf : (C)Ljava/lang/Character;
/*     */       //   50: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   55: checkcast java/lang/Boolean
/*     */       //   58: invokevirtual booleanValue : ()Z
/*     */       //   61: ifeq -> 68
/*     */       //   64: iconst_1
/*     */       //   65: goto -> 75
/*     */       //   68: iinc #4, 1
/*     */       //   71: goto -> 13
/*     */       //   74: iconst_0
/*     */       //   75: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #29	-> 6
/*     */       //   #107	-> 10
/*     */       //   #29	-> 41
/*     */       //   #107	-> 61
/*     */       //   #108	-> 74
/*     */       //   #29	-> 75
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   41	20	7	$i$a$-any-Alphabet$Group$matchAny$1	I
/*     */       //   38	23	6	it	C
/*     */       //   34	34	5	element$iv	C
/*     */       //   10	65	3	$i$f$any	I
/*     */       //   8	67	2	$this$any$iv	Ljava/lang/CharSequence;
/*     */       //   0	76	0	this	Lai/grazie/nlp/langs/alphabet/Alphabet$Group;
/*     */       //   0	76	1	input	Ljava/lang/CharSequence; } public final boolean matchEntire(@NotNull CharSequence input) { // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'input'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_1
/*     */       //   7: astore_2
/*     */       //   8: iconst_0
/*     */       //   9: istore_3
/*     */       //   10: iconst_0
/*     */       //   11: istore #4
/*     */       //   13: iload #4
/*     */       //   15: aload_2
/*     */       //   16: invokeinterface length : ()I
/*     */       //   21: if_icmpge -> 74
/*     */       //   24: aload_2
/*     */       //   25: iload #4
/*     */       //   27: invokeinterface charAt : (I)C
/*     */       //   32: istore #5
/*     */       //   34: iload #5
/*     */       //   36: istore #6
/*     */       //   38: iconst_0
/*     */       //   39: istore #7
/*     */       //   41: aload_0
/*     */       //   42: getfield acceptableChar : Lkotlin/jvm/functions/Function1;
/*     */       //   45: iload #6
/*     */       //   47: invokestatic valueOf : (C)Ljava/lang/Character;
/*     */       //   50: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   55: checkcast java/lang/Boolean
/*     */       //   58: invokevirtual booleanValue : ()Z
/*     */       //   61: ifne -> 68
/*     */       //   64: iconst_0
/*     */       //   65: goto -> 75
/*     */       //   68: iinc #4, 1
/*     */       //   71: goto -> 13
/*     */       //   74: iconst_1
/*     */       //   75: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #30	-> 6
/*     */       //   #109	-> 10
/*     */       //   #30	-> 41
/*     */       //   #109	-> 61
/*     */       //   #110	-> 74
/*     */       //   #30	-> 75
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   41	20	7	$i$a$-all-Alphabet$Group$matchEntire$1	I
/*     */       //   38	23	6	it	C
/*     */       //   34	34	5	element$iv	C
/*     */       //   10	65	3	$i$f$all	I
/*     */       //   8	67	2	$this$all$iv	Ljava/lang/CharSequence;
/*     */       //   0	76	0	this	Lai/grazie/nlp/langs/alphabet/Alphabet$Group;
/*  34 */       //   0	76	1	input	Ljava/lang/CharSequence; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\027\020\003\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\006\020\007R\027\020\b\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\t\020\007¨\006\n"}, d2 = {"Lai/grazie/nlp/langs/alphabet/Alphabet$Group$Companion;", "", "()V", "all", "", "Lai/grazie/nlp/langs/alphabet/Alphabet$Group;", "getAll", "()Ljava/util/List;", "withSpaces", "getWithSpaces", "nlp-langs"}) public static final class Companion { @NotNull public final List<Alphabet.Group> getWithSpaces() { return Alphabet.Group.withSpaces; } private Companion() {} @NotNull
/*     */       public final List<Alphabet.Group> getAll() { return Alphabet.Group.all; } }
/*     */   } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\bA\n\002\030\002\n\002\030\002\n\002\b\022\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\036\020X\032\022\022\004\022\0020\0040Fj\b\022\004\022\0020\004`G2\006\020Y\032\0020ZR\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\f\020\006R\021\020\r\032\0020\004¢\006\b\n\000\032\004\b\016\020\006R\021\020\017\032\0020\004¢\006\b\n\000\032\004\b\020\020\006R\021\020\021\032\0020\004¢\006\b\n\000\032\004\b\022\020\006R\021\020\023\032\0020\004¢\006\b\n\000\032\004\b\024\020\006R\021\020\025\032\0020\004¢\006\b\n\000\032\004\b\026\020\006R\021\020\027\032\0020\004¢\006\b\n\000\032\004\b\030\020\006R\021\020\031\032\0020\004¢\006\b\n\000\032\004\b\032\020\006R\021\020\033\032\0020\004¢\006\b\n\000\032\004\b\034\020\006R\021\020\035\032\0020\004¢\006\b\n\000\032\004\b\036\020\006R\021\020\037\032\0020\004¢\006\b\n\000\032\004\b \020\006R\021\020!\032\0020\004¢\006\b\n\000\032\004\b\"\020\006R\021\020#\032\0020\004¢\006\b\n\000\032\004\b$\020\006R\021\020%\032\0020\004¢\006\b\n\000\032\004\b&\020\006R\021\020'\032\0020\004¢\006\b\n\000\032\004\b(\020\006R\021\020)\032\0020\004¢\006\b\n\000\032\004\b*\020\006R\021\020+\032\0020\004¢\006\b\n\000\032\004\b,\020\006R\021\020-\032\0020\004¢\006\b\n\000\032\004\b.\020\006R\021\020/\032\0020\004¢\006\b\n\000\032\004\b0\020\006R\021\0201\032\0020\004¢\006\b\n\000\032\004\b2\020\006R\021\0203\032\0020\004¢\006\b\n\000\032\004\b4\020\006R\021\0205\032\0020\004¢\006\b\n\000\032\004\b6\020\006R\021\0207\032\0020\004¢\006\b\n\000\032\004\b8\020\006R\021\0209\032\0020\004¢\006\b\n\000\032\004\b:\020\006R\021\020;\032\0020\004¢\006\b\n\000\032\004\b<\020\006R\021\020=\032\0020\004¢\006\b\n\000\032\004\b>\020\006R\021\020?\032\0020\004¢\006\b\n\000\032\004\b@\020\006R\021\020A\032\0020\004¢\006\b\n\000\032\004\bB\020\006R\021\020C\032\0020\004¢\006\b\n\000\032\004\bD\020\006R!\020E\032\022\022\004\022\0020\0040Fj\b\022\004\022\0020\004`G¢\006\b\n\000\032\004\bH\020IR!\020J\032\022\022\004\022\0020\0040Fj\b\022\004\022\0020\004`G¢\006\b\n\000\032\004\bK\020IR!\020L\032\022\022\004\022\0020\0040Fj\b\022\004\022\0020\004`G¢\006\b\n\000\032\004\bM\020IR!\020N\032\022\022\004\022\0020\0040Fj\b\022\004\022\0020\004`G¢\006\b\n\000\032\004\bO\020IR!\020P\032\022\022\004\022\0020\0040Fj\b\022\004\022\0020\004`G¢\006\b\n\000\032\004\bQ\020IR!\020R\032\022\022\004\022\0020\0040Fj\b\022\004\022\0020\004`G¢\006\b\n\000\032\004\bS\020IR!\020T\032\022\022\004\022\0020\0040Fj\b\022\004\022\0020\004`G¢\006\b\n\000\032\004\bU\020IR!\020V\032\022\022\004\022\0020\0040Fj\b\022\004\022\0020\004`G¢\006\b\n\000\032\004\bW\020I¨\006["}, d2 = {"Lai/grazie/nlp/langs/alphabet/Alphabet$Companion;", "", "()V", "ARABIC", "Lai/grazie/nlp/langs/alphabet/Alphabet;", "getARABIC", "()Lai/grazie/nlp/langs/alphabet/Alphabet;", "ASTURIAN", "getASTURIAN", "BELARUSIAN", "getBELARUSIAN", "BRETON", "getBRETON", "CATALAN", "getCATALAN", "CHINESE", "getCHINESE", "DANISH", "getDANISH", "DUTCH", "getDUTCH", "ENGLISH", "getENGLISH", "ESPERANTO", "getESPERANTO", "FRENCH", "getFRENCH", "GALICIAN", "getGALICIAN", "GERMAN", "getGERMAN", "GREEK", "getGREEK", "IRISH", "getIRISH", "ITALIAN", "getITALIAN", "JAPANESE", "getJAPANESE", "KHMER", "getKHMER", "KOREAN", "getKOREAN", "NONE", "getNONE", "PERSIAN", "getPERSIAN", "POLISH", "getPOLISH", "PORTUGUESE", "getPORTUGUESE", "ROMANIAN", "getROMANIAN", "RUSSIAN", "getRUSSIAN", "SLOVAK", "getSLOVAK", "SLOVENE", "getSLOVENE", "SPANISH", "getSPANISH", "SWEDISH", "getSWEDISH", "TAGALOG", "getTAGALOG", "TAMIL", "getTAMIL", "UKRANIAN", "getUKRANIAN", "all", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "getAll", "()Ljava/util/LinkedHashSet;", "arabic", "getArabic", "asian", "getAsian", "cyrillic", "getCyrillic", "greek", "getGreek", "khmer", "getKhmer", "latin", "getLatin", "tamil", "getTamil", "byGroup", "group", "Lai/grazie/nlp/langs/alphabet/Alphabet$Group;", "nlp-langs"})
/*     */   public static final class Companion { private Companion() {} @NotNull
/*     */     public final Alphabet getENGLISH() {
/*  39 */       return Alphabet.ENGLISH; } @NotNull
/*  40 */     public final Alphabet getFRENCH() { return Alphabet.FRENCH; } @NotNull
/*  41 */     public final Alphabet getGERMAN() { return Alphabet.GERMAN; } @NotNull
/*  42 */     public final Alphabet getDUTCH() { return Alphabet.DUTCH; } @NotNull
/*  43 */     public final Alphabet getITALIAN() { return Alphabet.ITALIAN; } @NotNull
/*  44 */     public final Alphabet getPOLISH() { return Alphabet.POLISH; } @NotNull
/*  45 */     public final Alphabet getPORTUGUESE() { return Alphabet.PORTUGUESE; } @NotNull
/*  46 */     public final Alphabet getROMANIAN() { return Alphabet.ROMANIAN; } @NotNull
/*  47 */     public final Alphabet getSLOVAK() { return Alphabet.SLOVAK; } @NotNull
/*  48 */     public final Alphabet getSPANISH() { return Alphabet.SPANISH; } @NotNull
/*  49 */     public final Alphabet getASTURIAN() { return Alphabet.ASTURIAN; } @NotNull
/*  50 */     public final Alphabet getBRETON() { return Alphabet.BRETON; } @NotNull
/*  51 */     public final Alphabet getCATALAN() { return Alphabet.CATALAN; } @NotNull
/*  52 */     public final Alphabet getDANISH() { return Alphabet.DANISH; } @NotNull
/*  53 */     public final Alphabet getESPERANTO() { return Alphabet.ESPERANTO; } @NotNull
/*  54 */     public final Alphabet getGALICIAN() { return Alphabet.GALICIAN; } @NotNull
/*  55 */     public final Alphabet getIRISH() { return Alphabet.IRISH; } @NotNull
/*  56 */     public final Alphabet getSLOVENE() { return Alphabet.SLOVENE; } @NotNull
/*  57 */     public final Alphabet getSWEDISH() { return Alphabet.SWEDISH; } @NotNull
/*  58 */     public final Alphabet getTAGALOG() { return Alphabet.TAGALOG; }
/*     */     @NotNull
/*  60 */     public final Alphabet getGREEK() { return Alphabet.GREEK; }
/*     */     @NotNull
/*  62 */     public final Alphabet getKHMER() { return Alphabet.KHMER; }
/*     */     @NotNull
/*  64 */     public final Alphabet getTAMIL() { return Alphabet.TAMIL; }
/*     */     @NotNull
/*  66 */     public final Alphabet getARABIC() { return Alphabet.ARABIC; } @NotNull
/*  67 */     public final Alphabet getPERSIAN() { return Alphabet.PERSIAN; }
/*     */     @NotNull
/*  69 */     public final Alphabet getCHINESE() { return Alphabet.CHINESE; } @NotNull
/*  70 */     public final Alphabet getJAPANESE() { return Alphabet.JAPANESE; } @NotNull
/*  71 */     public final Alphabet getKOREAN() { return Alphabet.KOREAN; }
/*     */     @NotNull
/*  73 */     public final Alphabet getRUSSIAN() { return Alphabet.RUSSIAN; } @NotNull
/*  74 */     public final Alphabet getUKRANIAN() { return Alphabet.UKRANIAN; } @NotNull
/*  75 */     public final Alphabet getBELARUSIAN() { return Alphabet.BELARUSIAN; }
/*     */     @NotNull
/*  77 */     public final Alphabet getNONE() { return Alphabet.NONE; } @NotNull
/*     */     public final LinkedHashSet<Alphabet> getAll() {
/*  79 */       return Alphabet.all;
/*     */     }
/*     */     @NotNull
/*     */     public final LinkedHashSet<Alphabet> getLatin() {
/*  83 */       return Alphabet.latin;
/*     */     }
/*     */     
/*     */     @NotNull
/*  87 */     public final LinkedHashSet<Alphabet> getGreek() { return Alphabet.greek; } @NotNull
/*  88 */     public final LinkedHashSet<Alphabet> getKhmer() { return Alphabet.khmer; } @NotNull
/*  89 */     public final LinkedHashSet<Alphabet> getTamil() { return Alphabet.tamil; } @NotNull
/*  90 */     public final LinkedHashSet<Alphabet> getArabic() { return Alphabet.arabic; } @NotNull
/*  91 */     public final LinkedHashSet<Alphabet> getCyrillic() { return Alphabet.cyrillic; } @NotNull
/*  92 */     public final LinkedHashSet<Alphabet> getAsian() { return Alphabet.asian; } @NotNull
/*     */     public final LinkedHashSet<Alphabet> byGroup(@NotNull Alphabet.Group group) { Alphabet[] arrayOfAlphabet;
/*  94 */       Intrinsics.checkNotNullParameter(group, "group"); switch (WhenMappings.$EnumSwitchMapping$0[group.ordinal()]) { case 1: 
/*     */         case 2: 
/*     */         case 3: 
/*     */         case 4: 
/*     */         case 5: 
/*     */         case 6: 
/*     */         case 7: 
/*     */         case 8:
/* 102 */           arrayOfAlphabet = new Alphabet[1]; arrayOfAlphabet[0] = getNONE(); }  throw new NoWhenBranchMatchedException(); }
/*     */      }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final Group group;
/*     */   @NotNull
/*     */   private static final Alphabet ENGLISH = new SetBasedAlphabet(Group.LATIN, "abcdefghijklmnopqrstuvwxyz", "", "");
/*     */   @NotNull
/*     */   private static final Alphabet FRENCH = new SetBasedAlphabet(Group.LATIN, "abcdefghijklmnopqrstuvwxyzàâçéèêëîïôœùûüÿ", "àâçéèêëîïôœùûüÿ", "Œ");
/*     */   @NotNull
/*     */   private static final Alphabet GERMAN = new SetBasedAlphabet(Group.LATIN, "abcdefghijklmnopqrstuvwxyzäöüß", "äöüß", "ß");
/*     */   @NotNull
/*     */   private static final Alphabet DUTCH = new SetBasedAlphabet(Group.LATIN, "abcdefghijklmnopqrstuvwxyzàéëïĳ", "àéëïĳ", "ĳ");
/*     */   @NotNull
/*     */   private static final Alphabet ITALIAN = new SetBasedAlphabet(Group.LATIN, "abcdefghijklmnopqrstuvwxyzàéèìòù", "àéèìòù", "ì");
/*     */   @NotNull
/*     */   private static final Alphabet POLISH = new SetBasedAlphabet(Group.LATIN, "abcdefghijklmnopqrstuvwxyząłńóżćęśź", "ąłńóżćęśź", "ąłńżćęśź");
/*     */   @NotNull
/*     */   private static final Alphabet PORTUGUESE = new SetBasedAlphabet(Group.LATIN, "abcdefghijklmnopqrstuvwxyzãõçáéíóúâêôà", "ãõçáéíóúâêôà", "ãõ");
/*     */   @NotNull
/*     */   private static final Alphabet ROMANIAN = new SetBasedAlphabet(Group.LATIN, "abcdefghijklmnopqrstuvwxyzăîâşţ", "ăîâşţ", "ăşţ");
/*     */   @NotNull
/*     */   private static final Alphabet SLOVAK = new SetBasedAlphabet(Group.LATIN, "abcdefghijklmnopqrstuvwxyzžščáäďéíľĺňóôŕťúý", "žščáäďéíľĺňóôŕťúý", "ďľĺňŕťý");
/*     */   @NotNull
/*     */   private static final Alphabet SPANISH = new SetBasedAlphabet(Group.LATIN, "abcdefghijklmnopqrstuvwxyzáéíñóúü¡¿", "áéíñóúü¡¿", "¡¿");
/*     */   @NotNull
/*     */   private static final Alphabet ASTURIAN = new SetBasedAlphabet(Group.LATIN, "abcdefghilmnñoprstuvxyz", "ñ", "");
/*     */   @NotNull
/*     */   private static final Alphabet BRETON = new SetBasedAlphabet(Group.LATIN, "abcdefghijklmnoprstuvwyzâêîôûùüñ", "âêîôûùüñ", "");
/*     */   @NotNull
/*     */   private static final Alphabet CATALAN = new SetBasedAlphabet(Group.LATIN, "abcdefghijklmnopqrstuvwxyzàéèíïóòúüç", "àéèíïóòúüç", "");
/*     */   @NotNull
/*     */   private static final Alphabet DANISH = new SetBasedAlphabet(Group.LATIN, "abcdefghijklmnopqrstuvwxyzæøå", "æøå", "æø");
/*     */   @NotNull
/*     */   private static final Alphabet ESPERANTO = new SetBasedAlphabet(Group.LATIN, "abcĉdefgĝhĥijĵklmnoprsŝtuŭvz", "ĉĝĥĵŝŭ", "ĉĝĥĵŝŭ");
/*     */   @NotNull
/*     */   private static final Alphabet GALICIAN = new SetBasedAlphabet(Group.LATIN, "abcdefghilmnñopqrstuvxz", "ñ", "");
/*     */   @NotNull
/*     */   private static final Alphabet IRISH = new SetBasedAlphabet(Group.LATIN, "abcdefghilmnoprstuáéíóú", "áéíóú", "");
/*     */   @NotNull
/*     */   private static final Alphabet SLOVENE = new SetBasedAlphabet(Group.LATIN, "abcčdefghijklmnoprsštuvzž", "čšž", "");
/*     */   @NotNull
/*     */   private static final Alphabet SWEDISH = new SetBasedAlphabet(Group.LATIN, "abcdefghijklmnopqrstuvwxyzåäö", "åäö", "");
/*     */   @NotNull
/*     */   private static final Alphabet TAGALOG = new SetBasedAlphabet(Group.LATIN, "abcdefghijklmnñopqrstuvwxyz", "ñ", "");
/*     */   @NotNull
/*     */   private static final Alphabet GREEK = new RegexAlphabet(Group.GREEK, new Regex("[\\u0370-\\u03FF]+"), null, null, 12, null);
/*     */   @NotNull
/*     */   private static final Alphabet KHMER = new RegexAlphabet(Group.KHMER, new Regex("[\\u1780-\\u17FF]+"), null, null, 12, null);
/*     */   @NotNull
/*     */   private static final Alphabet TAMIL = new RegexAlphabet(Group.TAMIL, new Regex("[\\u0B80-\\u0BFF]+"), null, null, 12, null);
/*     */   @NotNull
/*     */   private static final Alphabet ARABIC = new RegexAlphabet(Group.ARABIC, new Regex("[\\u0600-\\u06FF]+"), null, null);
/*     */   @NotNull
/*     */   private static final Alphabet PERSIAN = new RegexAlphabet(Group.ARABIC, new Regex("[\\u0600-\\u06FF\\u200C]+"), new Regex("\\u200C"), new Regex("\\u200C"));
/*     */   @NotNull
/*     */   private static final Alphabet CHINESE = new RegexAlphabet(Group.ASIAN, new Regex("[\\u4E00-\\u9FFF\\u3400-\\u4DBF]+"), null, null, 12, null);
/*     */   @NotNull
/*     */   private static final Alphabet JAPANESE = new RegexAlphabet(Group.ASIAN, new Regex("[\\u3040-\\u309F\\u30A0-\\u30FF\\u31F0-\\u31FF\\u4E00-\\u9FFF\\u3400-\\u4DBF]+"), null, null, 12, null);
/*     */   @NotNull
/*     */   private static final Alphabet KOREAN = new RegexAlphabet(Group.ASIAN, new Regex("[\\uAC00-\\uD7A3\\u1100-\\u11FF\\u3130-\\u318F]+"), null, null, 12, null);
/*     */   @NotNull
/*     */   private static final Alphabet RUSSIAN = new SetBasedAlphabet(Group.CYRILLIC, "абвгдеёжзийклмнопрстуфхцчшщъыьэюя", "ёйъыэ", "ъ");
/*     */   @NotNull
/*     */   private static final Alphabet UKRANIAN = new SetBasedAlphabet(Group.CYRILLIC, "абвгґдеєжзиіїйклмнопрстуфхцчшщьюяʼ'", "єіїґ", "їґ");
/*     */   @NotNull
/*     */   private static final Alphabet BELARUSIAN = new SetBasedAlphabet(Group.CYRILLIC, "абвгдеёжзійклмнопрстуўфхцчшыьэюя", "ёйєыіў", "ў");
/*     */   @NotNull
/*     */   private static final Alphabet NONE = new NoneAlphabet();
/*     */   @NotNull
/*     */   private static final LinkedHashSet<Alphabet> all;
/*     */   @NotNull
/*     */   private static final LinkedHashSet<Alphabet> latin;
/*     */   @NotNull
/*     */   private static final LinkedHashSet<Alphabet> greek;
/*     */   @NotNull
/*     */   private static final LinkedHashSet<Alphabet> khmer;
/*     */   @NotNull
/*     */   private static final LinkedHashSet<Alphabet> tamil;
/*     */   @NotNull
/*     */   private static final LinkedHashSet<Alphabet> arabic;
/*     */   @NotNull
/*     */   private static final LinkedHashSet<Alphabet> cyrillic;
/*     */   @NotNull
/*     */   private static final LinkedHashSet<Alphabet> asian;
/*     */   
/*     */   static {
/*     */     Alphabet[] arrayOfAlphabet = new Alphabet[30];
/*     */     arrayOfAlphabet[0] = ENGLISH;
/*     */     arrayOfAlphabet[1] = FRENCH;
/*     */     arrayOfAlphabet[2] = GERMAN;
/*     */     arrayOfAlphabet[3] = DUTCH;
/*     */     arrayOfAlphabet[4] = ITALIAN;
/*     */     arrayOfAlphabet[5] = POLISH;
/*     */     arrayOfAlphabet[6] = PORTUGUESE;
/*     */     arrayOfAlphabet[7] = ROMANIAN;
/*     */     arrayOfAlphabet[8] = SLOVAK;
/*     */     arrayOfAlphabet[9] = SLOVENE;
/*     */     arrayOfAlphabet[10] = SWEDISH;
/*     */     arrayOfAlphabet[11] = SPANISH;
/*     */     arrayOfAlphabet[12] = TAGALOG;
/*     */     arrayOfAlphabet[13] = ASTURIAN;
/*     */     arrayOfAlphabet[14] = BRETON;
/*     */     arrayOfAlphabet[15] = CATALAN;
/*     */     arrayOfAlphabet[16] = DANISH;
/*     */     arrayOfAlphabet[17] = ESPERANTO;
/*     */     arrayOfAlphabet[18] = GALICIAN;
/*     */     arrayOfAlphabet[19] = IRISH;
/*     */     arrayOfAlphabet[20] = GREEK;
/*     */     arrayOfAlphabet[21] = KHMER;
/*     */     arrayOfAlphabet[22] = TAMIL;
/*     */     arrayOfAlphabet[23] = ARABIC;
/*     */     arrayOfAlphabet[24] = PERSIAN;
/*     */     arrayOfAlphabet[25] = CHINESE;
/*     */     arrayOfAlphabet[26] = JAPANESE;
/*     */     arrayOfAlphabet[27] = RUSSIAN;
/*     */     arrayOfAlphabet[28] = UKRANIAN;
/*     */     arrayOfAlphabet[29] = BELARUSIAN;
/*     */     all = SetsKt.linkedSetOf((Object[])arrayOfAlphabet);
/*     */     arrayOfAlphabet = new Alphabet[20];
/*     */     arrayOfAlphabet[0] = ENGLISH;
/*     */     arrayOfAlphabet[1] = FRENCH;
/*     */     arrayOfAlphabet[2] = GERMAN;
/*     */     arrayOfAlphabet[3] = DUTCH;
/*     */     arrayOfAlphabet[4] = ITALIAN;
/*     */     arrayOfAlphabet[5] = POLISH;
/*     */     arrayOfAlphabet[6] = PORTUGUESE;
/*     */     arrayOfAlphabet[7] = ROMANIAN;
/*     */     arrayOfAlphabet[8] = SLOVAK;
/*     */     arrayOfAlphabet[9] = SLOVENE;
/*     */     arrayOfAlphabet[10] = SWEDISH;
/*     */     arrayOfAlphabet[11] = SPANISH;
/*     */     arrayOfAlphabet[12] = TAGALOG;
/*     */     arrayOfAlphabet[13] = ASTURIAN;
/*     */     arrayOfAlphabet[14] = BRETON;
/*     */     arrayOfAlphabet[15] = CATALAN;
/*     */     arrayOfAlphabet[16] = DANISH;
/*     */     arrayOfAlphabet[17] = ESPERANTO;
/*     */     arrayOfAlphabet[18] = GALICIAN;
/*     */     arrayOfAlphabet[19] = IRISH;
/*     */     latin = SetsKt.linkedSetOf((Object[])arrayOfAlphabet);
/*     */     arrayOfAlphabet = new Alphabet[1];
/*     */     arrayOfAlphabet[0] = GREEK;
/*     */     greek = SetsKt.linkedSetOf((Object[])arrayOfAlphabet);
/*     */     arrayOfAlphabet = new Alphabet[1];
/*     */     arrayOfAlphabet[0] = KHMER;
/*     */     khmer = SetsKt.linkedSetOf((Object[])arrayOfAlphabet);
/*     */     arrayOfAlphabet = new Alphabet[1];
/*     */     arrayOfAlphabet[0] = TAMIL;
/*     */     tamil = SetsKt.linkedSetOf((Object[])arrayOfAlphabet);
/*     */     arrayOfAlphabet = new Alphabet[2];
/*     */     arrayOfAlphabet[0] = ARABIC;
/*     */     arrayOfAlphabet[1] = PERSIAN;
/*     */     arabic = SetsKt.linkedSetOf((Object[])arrayOfAlphabet);
/*     */     arrayOfAlphabet = new Alphabet[3];
/*     */     arrayOfAlphabet[0] = RUSSIAN;
/*     */     arrayOfAlphabet[1] = UKRANIAN;
/*     */     arrayOfAlphabet[2] = BELARUSIAN;
/*     */     cyrillic = SetsKt.linkedSetOf((Object[])arrayOfAlphabet);
/*     */     arrayOfAlphabet = new Alphabet[2];
/*     */     arrayOfAlphabet[0] = CHINESE;
/*     */     arrayOfAlphabet[1] = JAPANESE;
/*     */     asian = SetsKt.linkedSetOf((Object[])arrayOfAlphabet);
/*     */   }
/*     */   
/*     */   public abstract boolean matchEntire(@NotNull CharSequence paramCharSequence);
/*     */   
/*     */   public abstract boolean matchAny(@NotNull CharSequence paramCharSequence);
/*     */   
/*     */   public abstract boolean matchAnySpecial(@NotNull CharSequence paramCharSequence);
/*     */   
/*     */   public abstract boolean matchAnyUnique(@NotNull CharSequence paramCharSequence);
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-langs-jvm-0.4.32.jar!\ai\grazie\nlp\langs\alphabet\Alphabet.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */