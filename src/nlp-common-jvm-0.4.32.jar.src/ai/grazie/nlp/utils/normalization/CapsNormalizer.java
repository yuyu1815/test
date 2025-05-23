/*    */ package ai.grazie.nlp.utils.normalization;
/*    */ 
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.MatchResult;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\030\0002\0020\001B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\004H\002J\020\020\006\032\0020\0042\006\020\005\032\0020\004H\026¨\006\007"}, d2 = {"Lai/grazie/nlp/utils/normalization/CapsNormalizer;", "Lai/grazie/nlp/utils/normalization/Normalizer;", "()V", "lowercaseIfAllLettersUpper", "", "text", "normalize", "nlp-common"})
/*    */ @SourceDebugExtension({"SMAP\nCapsNormalizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CapsNormalizer.kt\nai/grazie/nlp/utils/normalization/CapsNormalizer\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,21:1\n1771#2,2:22\n*S KotlinDebug\n*F\n+ 1 CapsNormalizer.kt\nai/grazie/nlp/utils/normalization/CapsNormalizer\n*L\n15#1:22,2\n*E\n"})
/*    */ public final class CapsNormalizer implements Normalizer {
/*    */   @NotNull
/* 10 */   public String normalize(@NotNull String text) { Intrinsics.checkNotNullParameter(text, "text"); return (new Regex("[^\\s]+")).replace(text, new CapsNormalizer$normalize$1()); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke"}) static final class CapsNormalizer$normalize$1 extends Lambda implements Function1<MatchResult, CharSequence> { public final CharSequence invoke(MatchResult it) { Intrinsics.checkNotNullParameter(it, "it"); return CapsNormalizer.this.lowercaseIfAllLettersUpper(it.getValue()); }
/*    */ 
/*    */     
/*    */     CapsNormalizer$normalize$1() {
/*    */       super(1);
/*    */     } }
/*    */ 
/*    */   
/*    */   private final String lowercaseIfAllLettersUpper(String text) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: checkcast java/lang/CharSequence
/*    */     //   4: bipush #39
/*    */     //   6: iconst_0
/*    */     //   7: iconst_2
/*    */     //   8: aconst_null
/*    */     //   9: invokestatic contains$default : (Ljava/lang/CharSequence;CZILjava/lang/Object;)Z
/*    */     //   12: istore_2
/*    */     //   13: iload_2
/*    */     //   14: ifeq -> 98
/*    */     //   17: aload_1
/*    */     //   18: checkcast java/lang/CharSequence
/*    */     //   21: astore_3
/*    */     //   22: iconst_0
/*    */     //   23: istore #4
/*    */     //   25: iconst_0
/*    */     //   26: istore #5
/*    */     //   28: iload #5
/*    */     //   30: aload_3
/*    */     //   31: invokeinterface length : ()I
/*    */     //   36: if_icmpge -> 80
/*    */     //   39: aload_3
/*    */     //   40: iload #5
/*    */     //   42: invokeinterface charAt : (I)C
/*    */     //   47: istore #6
/*    */     //   49: iload #6
/*    */     //   51: istore #7
/*    */     //   53: iconst_0
/*    */     //   54: istore #8
/*    */     //   56: iload #7
/*    */     //   58: invokestatic isLetter : (C)Z
/*    */     //   61: iload #7
/*    */     //   63: invokestatic isLowerCase : (C)Z
/*    */     //   66: iand
/*    */     //   67: ifeq -> 74
/*    */     //   70: iconst_0
/*    */     //   71: goto -> 81
/*    */     //   74: iinc #5, 1
/*    */     //   77: goto -> 28
/*    */     //   80: iconst_1
/*    */     //   81: ifeq -> 98
/*    */     //   84: aload_1
/*    */     //   85: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*    */     //   88: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   91: dup
/*    */     //   92: ldc 'toLowerCase(...)'
/*    */     //   94: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   97: areturn
/*    */     //   98: aload_1
/*    */     //   99: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #14	-> 0
/*    */     //   #15	-> 13
/*    */     //   #22	-> 25
/*    */     //   #15	-> 56
/*    */     //   #15	-> 61
/*    */     //   #15	-> 66
/*    */     //   #22	-> 67
/*    */     //   #23	-> 80
/*    */     //   #15	-> 81
/*    */     //   #16	-> 84
/*    */     //   #16	-> 97
/*    */     //   #18	-> 98
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   56	11	8	$i$a$-none-CapsNormalizer$lowercaseIfAllLettersUpper$1	I
/*    */     //   53	14	7	it	C
/*    */     //   49	25	6	element$iv	C
/*    */     //   25	56	4	$i$f$none	I
/*    */     //   22	59	3	$this$none$iv	Ljava/lang/CharSequence;
/*    */     //   13	87	2	isPossibleContraction	Z
/*    */     //   0	100	0	this	Lai/grazie/nlp/utils/normalization/CapsNormalizer;
/*    */     //   0	100	1	text	Ljava/lang/String;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-common-jvm-0.4.32.jar!\ai\grazie\nl\\utils\normalization\CapsNormalizer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */