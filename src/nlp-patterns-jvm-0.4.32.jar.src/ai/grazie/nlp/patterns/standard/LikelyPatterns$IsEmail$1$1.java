/*    */ package ai.grazie.nlp.patterns.standard;
/*    */ 
/*    */ import ai.grazie.nlp.patterns.RegexPattern;
/*    */ import ai.grazie.text.TextRange;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.text.Regex;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/patterns/standard/LikelyPatterns$IsEmail$1$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-patterns"})
/*    */ @SourceDebugExtension({"SMAP\nLikelyPatterns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LikelyPatterns.kt\nai/grazie/nlp/patterns/standard/LikelyPatterns$IsEmail$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,508:1\n1#2:509\n*E\n"})
/*    */ public final class LikelyPatterns$IsEmail$1$1
/*    */   extends RegexPattern
/*    */ {
/*    */   LikelyPatterns$IsEmail$1$1(String $specialPrefixChars, Regex $super_call_param$1) {
/* 46 */     super($super_call_param$1);
/*    */   }
/*    */   
/*    */   public List<TextRange> find(CharSequence text) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'text'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: new java/util/ArrayList
/*    */     //   9: dup
/*    */     //   10: invokespecial <init> : ()V
/*    */     //   13: astore_2
/*    */     //   14: iconst_1
/*    */     //   15: istore_3
/*    */     //   16: aload_1
/*    */     //   17: invokeinterface length : ()I
/*    */     //   22: iconst_3
/*    */     //   23: isub
/*    */     //   24: istore #4
/*    */     //   26: iload_3
/*    */     //   27: iload #4
/*    */     //   29: if_icmpge -> 174
/*    */     //   32: aload_1
/*    */     //   33: iload_3
/*    */     //   34: invokeinterface charAt : (I)C
/*    */     //   39: bipush #64
/*    */     //   41: if_icmpne -> 168
/*    */     //   44: iconst_0
/*    */     //   45: istore #5
/*    */     //   47: iload_3
/*    */     //   48: istore #5
/*    */     //   50: iload #5
/*    */     //   52: iconst_1
/*    */     //   53: isub
/*    */     //   54: ifle -> 112
/*    */     //   57: aload_1
/*    */     //   58: iload #5
/*    */     //   60: iconst_1
/*    */     //   61: isub
/*    */     //   62: invokeinterface charAt : (I)C
/*    */     //   67: invokestatic isLetterOrDigit : (C)Z
/*    */     //   70: ifne -> 99
/*    */     //   73: aload_0
/*    */     //   74: getfield $specialPrefixChars : Ljava/lang/String;
/*    */     //   77: checkcast java/lang/CharSequence
/*    */     //   80: aload_1
/*    */     //   81: iload #5
/*    */     //   83: iconst_1
/*    */     //   84: isub
/*    */     //   85: invokeinterface charAt : (I)C
/*    */     //   90: iconst_0
/*    */     //   91: iconst_2
/*    */     //   92: aconst_null
/*    */     //   93: invokestatic contains$default : (Ljava/lang/CharSequence;CZILjava/lang/Object;)Z
/*    */     //   96: ifeq -> 112
/*    */     //   99: iload #5
/*    */     //   101: istore #6
/*    */     //   103: iload #6
/*    */     //   105: iconst_m1
/*    */     //   106: iadd
/*    */     //   107: istore #5
/*    */     //   109: goto -> 50
/*    */     //   112: iload #5
/*    */     //   114: iload_3
/*    */     //   115: if_icmpge -> 168
/*    */     //   118: aload_0
/*    */     //   119: invokevirtual getRegex : ()Lkotlin/text/Regex;
/*    */     //   122: aload_1
/*    */     //   123: iload #5
/*    */     //   125: invokevirtual matchAt : (Ljava/lang/CharSequence;I)Lkotlin/text/MatchResult;
/*    */     //   128: dup
/*    */     //   129: ifnull -> 166
/*    */     //   132: astore #7
/*    */     //   134: iconst_0
/*    */     //   135: istore #8
/*    */     //   137: aload_2
/*    */     //   138: new ai/grazie/text/TextRange
/*    */     //   141: dup
/*    */     //   142: iload #5
/*    */     //   144: aload #7
/*    */     //   146: invokeinterface getRange : ()Lkotlin/ranges/IntRange;
/*    */     //   151: invokevirtual getLast : ()I
/*    */     //   154: iconst_1
/*    */     //   155: iadd
/*    */     //   156: invokespecial <init> : (II)V
/*    */     //   159: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   162: pop
/*    */     //   163: goto -> 168
/*    */     //   166: pop
/*    */     //   167: nop
/*    */     //   168: iinc #3, 1
/*    */     //   171: goto -> 26
/*    */     //   174: aload_2
/*    */     //   175: checkcast java/util/List
/*    */     //   178: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #48	-> 6
/*    */     //   #49	-> 14
/*    */     //   #50	-> 32
/*    */     //   #51	-> 44
/*    */     //   #52	-> 50
/*    */     //   #52	-> 70
/*    */     //   #53	-> 112
/*    */     //   #54	-> 118
/*    */     //   #509	-> 134
/*    */     //   #54	-> 137
/*    */     //   #54	-> 163
/*    */     //   #54	-> 166
/*    */     //   #49	-> 168
/*    */     //   #58	-> 174
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   137	25	8	$i$a$-let-LikelyPatterns$IsEmail$1$1$find$1	I
/*    */     //   134	28	7	it	Lkotlin/text/MatchResult;
/*    */     //   47	121	5	start	I
/*    */     //   16	158	3	i	I
/*    */     //   14	165	2	result	Ljava/util/ArrayList;
/*    */     //   0	179	0	this	Lai/grazie/nlp/patterns/standard/LikelyPatterns$IsEmail$1$1;
/*    */     //   0	179	1	text	Ljava/lang/CharSequence;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\standard\LikelyPatterns$IsEmail$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */