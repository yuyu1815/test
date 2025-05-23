/*     */ package ai.grazie.nlp.patterns.ext;
/*     */ 
/*     */ import ai.grazie.nlp.patterns.RegexPattern;
/*     */ import ai.grazie.text.TextRange;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.Regex;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000#\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000\n\002\020\013\n\002\b\002*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026J\030\020\007\032\0020\b2\006\020\005\032\0020\0062\006\020\t\032\0020\004H\002¨\006\n"}, d2 = {"ai/grazie/nlp/patterns/ext/AbbreviationPatterns$UpperCaseSequence$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "isTheOnlyWord", "", "range", "nlp-patterns"})
/*     */ @SourceDebugExtension({"SMAP\nAbbreviationPatterns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbbreviationPatterns.kt\nai/grazie/nlp/patterns/ext/AbbreviationPatterns$UpperCaseSequence$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,528:1\n774#2:529\n865#2,2:530\n1088#3,2:532\n1771#3,2:534\n*S KotlinDebug\n*F\n+ 1 AbbreviationPatterns.kt\nai/grazie/nlp/patterns/ext/AbbreviationPatterns$UpperCaseSequence$1\n*L\n342#1:529\n342#1:530,2\n347#1:532,2\n351#1:534,2\n*E\n"})
/*     */ public final class AbbreviationPatterns$UpperCaseSequence$1
/*     */   extends RegexPattern
/*     */ {
/*     */   AbbreviationPatterns$UpperCaseSequence$1(Regex $super_call_param$1) {
/* 340 */     super($super_call_param$1);
/*     */   }
/*     */   
/*     */   public List<TextRange> find(CharSequence text) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'text'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: aload_1
/*     */     //   8: invokespecial find : (Ljava/lang/CharSequence;)Ljava/util/List;
/*     */     //   11: checkcast java/lang/Iterable
/*     */     //   14: astore_3
/*     */     //   15: iconst_0
/*     */     //   16: istore #4
/*     */     //   18: aload_3
/*     */     //   19: astore #5
/*     */     //   21: new java/util/ArrayList
/*     */     //   24: dup
/*     */     //   25: invokespecial <init> : ()V
/*     */     //   28: checkcast java/util/Collection
/*     */     //   31: astore #6
/*     */     //   33: iconst_0
/*     */     //   34: istore #7
/*     */     //   36: aload #5
/*     */     //   38: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   43: astore #8
/*     */     //   45: aload #8
/*     */     //   47: invokeinterface hasNext : ()Z
/*     */     //   52: ifeq -> 102
/*     */     //   55: aload #8
/*     */     //   57: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   62: astore #9
/*     */     //   64: aload #9
/*     */     //   66: checkcast ai/grazie/text/TextRange
/*     */     //   69: astore #10
/*     */     //   71: iconst_0
/*     */     //   72: istore #11
/*     */     //   74: getstatic ai/grazie/nlp/patterns/Pattern.Companion : Lai/grazie/nlp/patterns/Pattern$Companion;
/*     */     //   77: aload_1
/*     */     //   78: aload #10
/*     */     //   80: invokevirtual getEndExclusive : ()I
/*     */     //   83: invokevirtual isWordBoundaryOrApostrophe$nlp_patterns : (Ljava/lang/CharSequence;I)Z
/*     */     //   86: ifeq -> 45
/*     */     //   89: aload #6
/*     */     //   91: aload #9
/*     */     //   93: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   98: pop
/*     */     //   99: goto -> 45
/*     */     //   102: aload #6
/*     */     //   104: checkcast java/util/List
/*     */     //   107: nop
/*     */     //   108: astore_2
/*     */     //   109: aload_2
/*     */     //   110: invokeinterface size : ()I
/*     */     //   115: iconst_1
/*     */     //   116: if_icmpne -> 139
/*     */     //   119: aload_0
/*     */     //   120: aload_1
/*     */     //   121: aload_2
/*     */     //   122: iconst_0
/*     */     //   123: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   128: checkcast ai/grazie/text/TextRange
/*     */     //   131: invokespecial isTheOnlyWord : (Ljava/lang/CharSequence;Lai/grazie/text/TextRange;)Z
/*     */     //   134: ifeq -> 139
/*     */     //   137: aload_2
/*     */     //   138: areturn
/*     */     //   139: aload_1
/*     */     //   140: astore_3
/*     */     //   141: iconst_0
/*     */     //   142: istore #4
/*     */     //   144: iconst_0
/*     */     //   145: istore #5
/*     */     //   147: iload #5
/*     */     //   149: aload_3
/*     */     //   150: invokeinterface length : ()I
/*     */     //   155: if_icmpge -> 194
/*     */     //   158: aload_3
/*     */     //   159: iload #5
/*     */     //   161: invokeinterface charAt : (I)C
/*     */     //   166: istore #6
/*     */     //   168: iload #6
/*     */     //   170: istore #7
/*     */     //   172: iconst_0
/*     */     //   173: istore #8
/*     */     //   175: iload #7
/*     */     //   177: invokestatic isLowerCase : (C)Z
/*     */     //   180: nop
/*     */     //   181: ifeq -> 188
/*     */     //   184: iconst_1
/*     */     //   185: goto -> 195
/*     */     //   188: iinc #5, 1
/*     */     //   191: goto -> 147
/*     */     //   194: iconst_0
/*     */     //   195: ifeq -> 202
/*     */     //   198: aload_2
/*     */     //   199: goto -> 205
/*     */     //   202: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   205: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #342	-> 6
/*     */     //   #529	-> 18
/*     */     //   #530	-> 36
/*     */     //   #342	-> 74
/*     */     //   #530	-> 86
/*     */     //   #531	-> 102
/*     */     //   #529	-> 107
/*     */     //   #342	-> 108
/*     */     //   #343	-> 109
/*     */     //   #344	-> 137
/*     */     //   #347	-> 139
/*     */     //   #532	-> 144
/*     */     //   #347	-> 175
/*     */     //   #347	-> 180
/*     */     //   #532	-> 181
/*     */     //   #533	-> 194
/*     */     //   #347	-> 195
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   74	12	11	$i$a$-filter-AbbreviationPatterns$UpperCaseSequence$1$find$uppercase$1	I
/*     */     //   71	15	10	it	Lai/grazie/text/TextRange;
/*     */     //   64	35	9	element$iv$iv	Ljava/lang/Object;
/*     */     //   36	68	7	$i$f$filterTo	I
/*     */     //   33	71	5	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   33	71	6	destination$iv$iv	Ljava/util/Collection;
/*     */     //   18	90	4	$i$f$filter	I
/*     */     //   15	93	3	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   175	6	8	$i$a$-any-AbbreviationPatterns$UpperCaseSequence$1$find$1	I
/*     */     //   172	9	7	it	C
/*     */     //   168	20	6	element$iv	C
/*     */     //   144	51	4	$i$f$any	I
/*     */     //   141	54	3	$this$any$iv	Ljava/lang/CharSequence;
/*     */     //   109	97	2	uppercase	Ljava/util/List;
/*     */     //   0	206	0	this	Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$UpperCaseSequence$1;
/*     */     //   0	206	1	text	Ljava/lang/CharSequence;
/*     */   }
/*     */   
/*     */   private final boolean isTheOnlyWord(CharSequence text, TextRange range) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: iconst_0
/*     */     //   2: aload_2
/*     */     //   3: invokevirtual getStart : ()I
/*     */     //   6: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
/*     */     //   11: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   14: aload_1
/*     */     //   15: astore_3
/*     */     //   16: aload_2
/*     */     //   17: invokevirtual getEndExclusive : ()I
/*     */     //   20: istore #4
/*     */     //   22: aload_3
/*     */     //   23: invokeinterface length : ()I
/*     */     //   28: istore #5
/*     */     //   30: aload_3
/*     */     //   31: iload #4
/*     */     //   33: iload #5
/*     */     //   35: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
/*     */     //   40: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   43: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   48: checkcast java/lang/CharSequence
/*     */     //   51: astore_3
/*     */     //   52: nop
/*     */     //   53: iconst_0
/*     */     //   54: istore #4
/*     */     //   56: iconst_0
/*     */     //   57: istore #5
/*     */     //   59: iload #5
/*     */     //   61: aload_3
/*     */     //   62: invokeinterface length : ()I
/*     */     //   67: if_icmpge -> 106
/*     */     //   70: aload_3
/*     */     //   71: iload #5
/*     */     //   73: invokeinterface charAt : (I)C
/*     */     //   78: istore #6
/*     */     //   80: iload #6
/*     */     //   82: istore #7
/*     */     //   84: iconst_0
/*     */     //   85: istore #8
/*     */     //   87: iload #7
/*     */     //   89: invokestatic isLetterOrDigit : (C)Z
/*     */     //   92: nop
/*     */     //   93: ifeq -> 100
/*     */     //   96: iconst_0
/*     */     //   97: goto -> 107
/*     */     //   100: iinc #5, 1
/*     */     //   103: goto -> 59
/*     */     //   106: iconst_1
/*     */     //   107: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #351	-> 0
/*     */     //   #351	-> 14
/*     */     //   #351	-> 52
/*     */     //   #534	-> 56
/*     */     //   #351	-> 87
/*     */     //   #351	-> 92
/*     */     //   #534	-> 93
/*     */     //   #535	-> 106
/*     */     //   #351	-> 107
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   87	6	8	$i$a$-none-AbbreviationPatterns$UpperCaseSequence$1$isTheOnlyWord$1	I
/*     */     //   84	9	7	it	C
/*     */     //   80	20	6	element$iv	C
/*     */     //   56	51	4	$i$f$none	I
/*     */     //   53	54	3	$this$none$iv	Ljava/lang/CharSequence;
/*     */     //   0	108	0	this	Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$UpperCaseSequence$1;
/*     */     //   0	108	1	text	Ljava/lang/CharSequence;
/*     */     //   0	108	2	range	Lai/grazie/text/TextRange;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\ext\AbbreviationPatterns$UpperCaseSequence$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */