/*    */ package ai.grazie.nlp.langs.alphabet;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\020\n\000\n\002\030\002\n\002\020\f\n\002\020\013\n\002\b\005\n\002\020\r\n\002\b\013\b\001\030\000 \0252\b\022\004\022\0020\0000\001:\001\025B\033\b\002\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\002\020\006J\016\020\t\032\0020\0052\006\020\n\032\0020\013J\016\020\f\032\0020\0052\006\020\n\032\0020\013R\035\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\b\n\000\032\004\b\007\020\bj\002\b\rj\002\b\016j\002\b\017j\002\b\020j\002\b\021j\002\b\022j\002\b\023j\002\b\024¨\006\026"}, d2 = {"Lai/grazie/nlp/langs/alphabet/Alphabet$Group;", "", "acceptableChar", "Lkotlin/Function1;", "", "", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V", "getAcceptableChar", "()Lkotlin/jvm/functions/Function1;", "matchAny", "input", "", "matchEntire", "LATIN", "GREEK", "KHMER", "TAMIL", "ARABIC", "ASIAN", "CYRILLIC", "NONE", "Companion", "nlp-langs"})
/*    */ @SourceDebugExtension({"SMAP\nAlphabet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alphabet.kt\nai/grazie/nlp/langs/alphabet/Alphabet$Group\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,106:1\n1088#2,2:107\n1069#2,2:109\n*S KotlinDebug\n*F\n+ 1 Alphabet.kt\nai/grazie/nlp/langs/alphabet/Alphabet$Group\n*L\n29#1:107,2\n30#1:109,2\n*E\n"})
/*    */ public enum Group {
/*    */   @NotNull
/*    */   public static final Companion Companion;
/*    */   @NotNull
/*    */   private final Function1<Character, Boolean> acceptableChar;
/*    */   @NotNull
/*    */   private static final List<Group> all;
/* 20 */   LATIN(null.INSTANCE),
/* 21 */   GREEK(null.INSTANCE),
/* 22 */   KHMER(null.INSTANCE),
/* 23 */   TAMIL(null.INSTANCE),
/* 24 */   ARABIC(null.INSTANCE),
/* 25 */   ASIAN(null.INSTANCE),
/* 26 */   CYRILLIC(null.INSTANCE),
/* 27 */   NONE(null.INSTANCE); @NotNull private static final List<Group> withSpaces; Group(Function1<Character, Boolean> acceptableChar) { this.acceptableChar = acceptableChar; } @NotNull public final Function1<Character, Boolean> getAcceptableChar() { return this.acceptableChar; } public final boolean matchAny(@NotNull CharSequence input) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'input'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: astore_2
/*    */     //   8: iconst_0
/*    */     //   9: istore_3
/*    */     //   10: iconst_0
/*    */     //   11: istore #4
/*    */     //   13: iload #4
/*    */     //   15: aload_2
/*    */     //   16: invokeinterface length : ()I
/*    */     //   21: if_icmpge -> 74
/*    */     //   24: aload_2
/*    */     //   25: iload #4
/*    */     //   27: invokeinterface charAt : (I)C
/*    */     //   32: istore #5
/*    */     //   34: iload #5
/*    */     //   36: istore #6
/*    */     //   38: iconst_0
/*    */     //   39: istore #7
/*    */     //   41: aload_0
/*    */     //   42: getfield acceptableChar : Lkotlin/jvm/functions/Function1;
/*    */     //   45: iload #6
/*    */     //   47: invokestatic valueOf : (C)Ljava/lang/Character;
/*    */     //   50: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   55: checkcast java/lang/Boolean
/*    */     //   58: invokevirtual booleanValue : ()Z
/*    */     //   61: ifeq -> 68
/*    */     //   64: iconst_1
/*    */     //   65: goto -> 75
/*    */     //   68: iinc #4, 1
/*    */     //   71: goto -> 13
/*    */     //   74: iconst_0
/*    */     //   75: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #29	-> 6
/*    */     //   #107	-> 10
/*    */     //   #29	-> 41
/*    */     //   #107	-> 61
/*    */     //   #108	-> 74
/*    */     //   #29	-> 75
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   41	20	7	$i$a$-any-Alphabet$Group$matchAny$1	I
/*    */     //   38	23	6	it	C
/*    */     //   34	34	5	element$iv	C
/*    */     //   10	65	3	$i$f$any	I
/*    */     //   8	67	2	$this$any$iv	Ljava/lang/CharSequence;
/*    */     //   0	76	0	this	Lai/grazie/nlp/langs/alphabet/Alphabet$Group;
/* 27 */     //   0	76	1	input	Ljava/lang/CharSequence; } static { Companion = new Companion(null);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 33 */     Group[] arrayOfGroup = new Group[7]; arrayOfGroup[0] = LATIN; arrayOfGroup[1] = GREEK; arrayOfGroup[2] = KHMER; arrayOfGroup[3] = TAMIL; arrayOfGroup[4] = ARABIC; arrayOfGroup[5] = ASIAN; arrayOfGroup[6] = CYRILLIC; all = CollectionsKt.listOf((Object[])arrayOfGroup);
/* 34 */     arrayOfGroup = new Group[3]; arrayOfGroup[0] = LATIN; arrayOfGroup[1] = GREEK; arrayOfGroup[2] = CYRILLIC; withSpaces = CollectionsKt.listOf((Object[])arrayOfGroup); } public final boolean matchEntire(@NotNull CharSequence input) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'input'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: astore_2
/*    */     //   8: iconst_0
/*    */     //   9: istore_3
/*    */     //   10: iconst_0
/*    */     //   11: istore #4
/*    */     //   13: iload #4
/*    */     //   15: aload_2
/*    */     //   16: invokeinterface length : ()I
/*    */     //   21: if_icmpge -> 74
/*    */     //   24: aload_2
/*    */     //   25: iload #4
/*    */     //   27: invokeinterface charAt : (I)C
/*    */     //   32: istore #5
/*    */     //   34: iload #5
/*    */     //   36: istore #6
/*    */     //   38: iconst_0
/*    */     //   39: istore #7
/*    */     //   41: aload_0
/*    */     //   42: getfield acceptableChar : Lkotlin/jvm/functions/Function1;
/*    */     //   45: iload #6
/*    */     //   47: invokestatic valueOf : (C)Ljava/lang/Character;
/*    */     //   50: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   55: checkcast java/lang/Boolean
/*    */     //   58: invokevirtual booleanValue : ()Z
/*    */     //   61: ifne -> 68
/*    */     //   64: iconst_0
/*    */     //   65: goto -> 75
/*    */     //   68: iinc #4, 1
/*    */     //   71: goto -> 13
/*    */     //   74: iconst_1
/*    */     //   75: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #30	-> 6
/*    */     //   #109	-> 10
/*    */     //   #30	-> 41
/*    */     //   #109	-> 61
/*    */     //   #110	-> 74
/*    */     //   #30	-> 75
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   41	20	7	$i$a$-all-Alphabet$Group$matchEntire$1	I
/*    */     //   38	23	6	it	C
/*    */     //   34	34	5	element$iv	C
/*    */     //   10	65	3	$i$f$all	I
/*    */     //   8	67	2	$this$all$iv	Ljava/lang/CharSequence;
/*    */     //   0	76	0	this	Lai/grazie/nlp/langs/alphabet/Alphabet$Group;
/* 34 */     //   0	76	1	input	Ljava/lang/CharSequence; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\027\020\003\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\006\020\007R\027\020\b\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\t\020\007¨\006\n"}, d2 = {"Lai/grazie/nlp/langs/alphabet/Alphabet$Group$Companion;", "", "()V", "all", "", "Lai/grazie/nlp/langs/alphabet/Alphabet$Group;", "getAll", "()Ljava/util/List;", "withSpaces", "getWithSpaces", "nlp-langs"}) public static final class Companion { @NotNull public final List<Alphabet.Group> getWithSpaces() { return Alphabet.Group.withSpaces; }
/*    */ 
/*    */     
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final List<Alphabet.Group> getAll() {
/*    */       return Alphabet.Group.all;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-langs-jvm-0.4.32.jar!\ai\grazie\nlp\langs\alphabet\Alphabet$Group.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */