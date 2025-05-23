package ai.grazie.nlp.tokenizer.word;

import ai.grazie.nlp.tokenizer.Tokenizer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequenceScope;

@DebugMetadata(f = "HeuristicWordTokenizer.kt", l = {21, 35, 47, 52, 56, 63, 77}, i = {1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "C$0", "L$0", "L$1", "I$0", "C$0", "L$0", "L$1", "I$0", "C$0", "L$0", "L$1", "I$0", "C$0", "L$0", "L$1", "I$0", "C$0"}, n = {"$this$sequence", "prevType", "curType", "index", "prevChar", "curChar", "$this$sequence", "curType", "index", "curChar", "$this$sequence", "curType", "index", "curChar", "$this$sequence", "curType", "index", "curChar", "$this$sequence", "curType", "index", "curChar"}, m = "invokeSuspend", c = "ai.grazie.nlp.tokenizer.word.HeuristicWordTokenizer$tokenizeAsSequence$1")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;"})
@SourceDebugExtension({"SMAP\nHeuristicWordTokenizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeuristicWordTokenizer.kt\nai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer$tokenizeAsSequence$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,100:1\n1069#2,2:101\n*S KotlinDebug\n*F\n+ 1 HeuristicWordTokenizer.kt\nai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer$tokenizeAsSequence$1\n*L\n20#1:101,2\n*E\n"})
final class HeuristicWordTokenizer$tokenizeAsSequence$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Tokenizer.Token>, Continuation<? super Unit>, Object> {
  Object L$1;
  
  Object L$2;
  
  int I$0;
  
  int I$1;
  
  char C$0;
  
  int label;
  
  HeuristicWordTokenizer$tokenizeAsSequence$1(HeuristicWordTokenizer $receiver, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #10
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 1200, 0 -> 56, 1 -> 241, 2 -> 423, 3 -> 596, 4 -> 755, 5 -> 900, 6 -> 1051, 7 -> 1190
    //   56: aload_1
    //   57: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   60: aload_0
    //   61: getfield L$0 : Ljava/lang/Object;
    //   64: checkcast kotlin/sequences/SequenceScope
    //   67: astore_2
    //   68: aload_0
    //   69: getfield $text : Ljava/lang/CharSequence;
    //   72: invokeinterface length : ()I
    //   77: ifne -> 84
    //   80: iconst_1
    //   81: goto -> 85
    //   84: iconst_0
    //   85: ifeq -> 92
    //   88: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   91: areturn
    //   92: aload_0
    //   93: getfield $text : Ljava/lang/CharSequence;
    //   96: astore_3
    //   97: aload_0
    //   98: getfield this$0 : Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer;
    //   101: astore #4
    //   103: iconst_0
    //   104: istore #5
    //   106: iconst_0
    //   107: istore #6
    //   109: iload #6
    //   111: aload_3
    //   112: invokeinterface length : ()I
    //   117: if_icmpge -> 182
    //   120: aload_3
    //   121: iload #6
    //   123: invokeinterface charAt : (I)C
    //   128: istore #7
    //   130: iload #7
    //   132: i2c
    //   133: istore #8
    //   135: iconst_0
    //   136: istore #9
    //   138: iload #8
    //   140: i2c
    //   141: invokestatic isLowerCase : (C)Z
    //   144: ifne -> 155
    //   147: aload #4
    //   149: invokestatic access$getTokenizeByCamelCase$p : (Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer;)Z
    //   152: ifne -> 168
    //   155: iload #8
    //   157: i2c
    //   158: invokestatic isLetter : (C)Z
    //   161: ifeq -> 168
    //   164: iconst_1
    //   165: goto -> 169
    //   168: iconst_0
    //   169: ifne -> 176
    //   172: iconst_0
    //   173: goto -> 183
    //   176: iinc #6, 1
    //   179: goto -> 109
    //   182: iconst_1
    //   183: ifeq -> 251
    //   186: aload_2
    //   187: new ai/grazie/nlp/tokenizer/Tokenizer$Token
    //   190: dup
    //   191: aload_0
    //   192: getfield $text : Ljava/lang/CharSequence;
    //   195: invokevirtual toString : ()Ljava/lang/String;
    //   198: new kotlin/ranges/IntRange
    //   201: dup
    //   202: iconst_0
    //   203: aload_0
    //   204: getfield $text : Ljava/lang/CharSequence;
    //   207: invokeinterface length : ()I
    //   212: iconst_1
    //   213: isub
    //   214: invokespecial <init> : (II)V
    //   217: invokespecial <init> : (Ljava/lang/String;Lkotlin/ranges/IntRange;)V
    //   220: aload_0
    //   221: checkcast kotlin/coroutines/Continuation
    //   224: aload_0
    //   225: iconst_1
    //   226: putfield label : I
    //   229: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   232: dup
    //   233: aload #10
    //   235: if_acmpne -> 246
    //   238: aload #10
    //   240: areturn
    //   241: aload_1
    //   242: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   245: aload_1
    //   246: pop
    //   247: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   250: areturn
    //   251: iconst_0
    //   252: istore_3
    //   253: iconst_m1
    //   254: istore #4
    //   256: getstatic kotlin/text/CharCategory.MATH_SYMBOL : Lkotlin/text/CharCategory;
    //   259: astore #5
    //   261: bipush #95
    //   263: istore #6
    //   265: iload_3
    //   266: aload_0
    //   267: getfield $text : Ljava/lang/CharSequence;
    //   270: invokeinterface length : ()I
    //   275: if_icmpge -> 1113
    //   278: aload_0
    //   279: getfield $text : Ljava/lang/CharSequence;
    //   282: iload_3
    //   283: invokeinterface charAt : (I)C
    //   288: istore #7
    //   290: iload #7
    //   292: i2c
    //   293: invokestatic getCategory : (C)Lkotlin/text/CharCategory;
    //   296: astore #8
    //   298: aload_0
    //   299: getfield this$0 : Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer;
    //   302: aload #8
    //   304: iload #7
    //   306: i2c
    //   307: invokestatic access$isNonSplittingPart : (Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer;Lkotlin/text/CharCategory;C)Z
    //   310: ifeq -> 940
    //   313: aload_0
    //   314: getfield this$0 : Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer;
    //   317: aload #5
    //   319: iload #6
    //   321: i2c
    //   322: invokestatic access$isNonSplittingPart : (Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer;Lkotlin/text/CharCategory;C)Z
    //   325: ifne -> 475
    //   328: iload #4
    //   330: iflt -> 475
    //   333: aload_2
    //   334: new ai/grazie/nlp/tokenizer/Tokenizer$Token
    //   337: dup
    //   338: aload_0
    //   339: getfield $text : Ljava/lang/CharSequence;
    //   342: iload #4
    //   344: iload_3
    //   345: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   350: invokevirtual toString : ()Ljava/lang/String;
    //   353: new kotlin/ranges/IntRange
    //   356: dup
    //   357: iload #4
    //   359: iload_3
    //   360: iconst_1
    //   361: isub
    //   362: invokespecial <init> : (II)V
    //   365: invokespecial <init> : (Ljava/lang/String;Lkotlin/ranges/IntRange;)V
    //   368: aload_0
    //   369: checkcast kotlin/coroutines/Continuation
    //   372: aload_0
    //   373: aload_2
    //   374: putfield L$0 : Ljava/lang/Object;
    //   377: aload_0
    //   378: aload #5
    //   380: putfield L$1 : Ljava/lang/Object;
    //   383: aload_0
    //   384: aload #8
    //   386: putfield L$2 : Ljava/lang/Object;
    //   389: aload_0
    //   390: iload_3
    //   391: putfield I$0 : I
    //   394: aload_0
    //   395: iload #6
    //   397: putfield I$1 : I
    //   400: aload_0
    //   401: iload #7
    //   403: putfield C$0 : C
    //   406: aload_0
    //   407: iconst_2
    //   408: putfield label : I
    //   411: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   414: dup
    //   415: aload #10
    //   417: if_acmpne -> 471
    //   420: aload #10
    //   422: areturn
    //   423: aload_0
    //   424: getfield C$0 : C
    //   427: istore #7
    //   429: aload_0
    //   430: getfield I$1 : I
    //   433: istore #6
    //   435: aload_0
    //   436: getfield I$0 : I
    //   439: istore_3
    //   440: aload_0
    //   441: getfield L$2 : Ljava/lang/Object;
    //   444: checkcast kotlin/text/CharCategory
    //   447: astore #8
    //   449: aload_0
    //   450: getfield L$1 : Ljava/lang/Object;
    //   453: checkcast kotlin/text/CharCategory
    //   456: astore #5
    //   458: aload_0
    //   459: getfield L$0 : Ljava/lang/Object;
    //   462: checkcast kotlin/sequences/SequenceScope
    //   465: astore_2
    //   466: aload_1
    //   467: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   470: aload_1
    //   471: pop
    //   472: iconst_m1
    //   473: istore #4
    //   475: nop
    //   476: iload #4
    //   478: ifge -> 487
    //   481: iload_3
    //   482: istore #4
    //   484: goto -> 1099
    //   487: aload_0
    //   488: getfield this$0 : Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer;
    //   491: invokestatic access$getTokenizeByCamelCase$p : (Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer;)Z
    //   494: ifeq -> 636
    //   497: aload #8
    //   499: getstatic kotlin/text/CharCategory.UPPERCASE_LETTER : Lkotlin/text/CharCategory;
    //   502: if_acmpne -> 636
    //   505: aload #5
    //   507: getstatic kotlin/text/CharCategory.LOWERCASE_LETTER : Lkotlin/text/CharCategory;
    //   510: if_acmpne -> 636
    //   513: aload_2
    //   514: new ai/grazie/nlp/tokenizer/Tokenizer$Token
    //   517: dup
    //   518: aload_0
    //   519: getfield $text : Ljava/lang/CharSequence;
    //   522: iload #4
    //   524: iload_3
    //   525: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   530: invokevirtual toString : ()Ljava/lang/String;
    //   533: new kotlin/ranges/IntRange
    //   536: dup
    //   537: iload #4
    //   539: iload_3
    //   540: iconst_1
    //   541: isub
    //   542: invokespecial <init> : (II)V
    //   545: invokespecial <init> : (Ljava/lang/String;Lkotlin/ranges/IntRange;)V
    //   548: aload_0
    //   549: checkcast kotlin/coroutines/Continuation
    //   552: aload_0
    //   553: aload_2
    //   554: putfield L$0 : Ljava/lang/Object;
    //   557: aload_0
    //   558: aload #8
    //   560: putfield L$1 : Ljava/lang/Object;
    //   563: aload_0
    //   564: aconst_null
    //   565: putfield L$2 : Ljava/lang/Object;
    //   568: aload_0
    //   569: iload_3
    //   570: putfield I$0 : I
    //   573: aload_0
    //   574: iload #7
    //   576: putfield C$0 : C
    //   579: aload_0
    //   580: iconst_3
    //   581: putfield label : I
    //   584: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   587: dup
    //   588: aload #10
    //   590: if_acmpne -> 629
    //   593: aload #10
    //   595: areturn
    //   596: aload_0
    //   597: getfield C$0 : C
    //   600: istore #7
    //   602: aload_0
    //   603: getfield I$0 : I
    //   606: istore_3
    //   607: aload_0
    //   608: getfield L$1 : Ljava/lang/Object;
    //   611: checkcast kotlin/text/CharCategory
    //   614: astore #8
    //   616: aload_0
    //   617: getfield L$0 : Ljava/lang/Object;
    //   620: checkcast kotlin/sequences/SequenceScope
    //   623: astore_2
    //   624: aload_1
    //   625: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   628: aload_1
    //   629: pop
    //   630: iload_3
    //   631: istore #4
    //   633: goto -> 1099
    //   636: aload_0
    //   637: getfield this$0 : Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer;
    //   640: invokestatic access$getTokenizeByCamelCase$p : (Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer;)Z
    //   643: ifeq -> 797
    //   646: iload_3
    //   647: iload #4
    //   649: isub
    //   650: iconst_1
    //   651: if_icmple -> 797
    //   654: aload #8
    //   656: getstatic kotlin/text/CharCategory.LOWERCASE_LETTER : Lkotlin/text/CharCategory;
    //   659: if_acmpne -> 797
    //   662: aload #5
    //   664: getstatic kotlin/text/CharCategory.UPPERCASE_LETTER : Lkotlin/text/CharCategory;
    //   667: if_acmpne -> 797
    //   670: aload_2
    //   671: new ai/grazie/nlp/tokenizer/Tokenizer$Token
    //   674: dup
    //   675: aload_0
    //   676: getfield $text : Ljava/lang/CharSequence;
    //   679: iload #4
    //   681: iload_3
    //   682: iconst_1
    //   683: isub
    //   684: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   689: invokevirtual toString : ()Ljava/lang/String;
    //   692: new kotlin/ranges/IntRange
    //   695: dup
    //   696: iload #4
    //   698: iload_3
    //   699: iconst_2
    //   700: isub
    //   701: invokespecial <init> : (II)V
    //   704: invokespecial <init> : (Ljava/lang/String;Lkotlin/ranges/IntRange;)V
    //   707: aload_0
    //   708: checkcast kotlin/coroutines/Continuation
    //   711: aload_0
    //   712: aload_2
    //   713: putfield L$0 : Ljava/lang/Object;
    //   716: aload_0
    //   717: aload #8
    //   719: putfield L$1 : Ljava/lang/Object;
    //   722: aload_0
    //   723: aconst_null
    //   724: putfield L$2 : Ljava/lang/Object;
    //   727: aload_0
    //   728: iload_3
    //   729: putfield I$0 : I
    //   732: aload_0
    //   733: iload #7
    //   735: putfield C$0 : C
    //   738: aload_0
    //   739: iconst_4
    //   740: putfield label : I
    //   743: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   746: dup
    //   747: aload #10
    //   749: if_acmpne -> 788
    //   752: aload #10
    //   754: areturn
    //   755: aload_0
    //   756: getfield C$0 : C
    //   759: istore #7
    //   761: aload_0
    //   762: getfield I$0 : I
    //   765: istore_3
    //   766: aload_0
    //   767: getfield L$1 : Ljava/lang/Object;
    //   770: checkcast kotlin/text/CharCategory
    //   773: astore #8
    //   775: aload_0
    //   776: getfield L$0 : Ljava/lang/Object;
    //   779: checkcast kotlin/sequences/SequenceScope
    //   782: astore_2
    //   783: aload_1
    //   784: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   787: aload_1
    //   788: pop
    //   789: iload_3
    //   790: iconst_1
    //   791: isub
    //   792: istore #4
    //   794: goto -> 1099
    //   797: aload_0
    //   798: getfield this$0 : Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer;
    //   801: iload #6
    //   803: i2c
    //   804: aload #5
    //   806: iload #7
    //   808: i2c
    //   809: aload #8
    //   811: invokestatic access$areFromDifferentAlphabets : (Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer;CLkotlin/text/CharCategory;CLkotlin/text/CharCategory;)Z
    //   814: ifeq -> 1099
    //   817: aload_2
    //   818: new ai/grazie/nlp/tokenizer/Tokenizer$Token
    //   821: dup
    //   822: aload_0
    //   823: getfield $text : Ljava/lang/CharSequence;
    //   826: iload #4
    //   828: iload_3
    //   829: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   834: invokevirtual toString : ()Ljava/lang/String;
    //   837: new kotlin/ranges/IntRange
    //   840: dup
    //   841: iload #4
    //   843: iload_3
    //   844: iconst_1
    //   845: isub
    //   846: invokespecial <init> : (II)V
    //   849: invokespecial <init> : (Ljava/lang/String;Lkotlin/ranges/IntRange;)V
    //   852: aload_0
    //   853: checkcast kotlin/coroutines/Continuation
    //   856: aload_0
    //   857: aload_2
    //   858: putfield L$0 : Ljava/lang/Object;
    //   861: aload_0
    //   862: aload #8
    //   864: putfield L$1 : Ljava/lang/Object;
    //   867: aload_0
    //   868: aconst_null
    //   869: putfield L$2 : Ljava/lang/Object;
    //   872: aload_0
    //   873: iload_3
    //   874: putfield I$0 : I
    //   877: aload_0
    //   878: iload #7
    //   880: putfield C$0 : C
    //   883: aload_0
    //   884: iconst_5
    //   885: putfield label : I
    //   888: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   891: dup
    //   892: aload #10
    //   894: if_acmpne -> 933
    //   897: aload #10
    //   899: areturn
    //   900: aload_0
    //   901: getfield C$0 : C
    //   904: istore #7
    //   906: aload_0
    //   907: getfield I$0 : I
    //   910: istore_3
    //   911: aload_0
    //   912: getfield L$1 : Ljava/lang/Object;
    //   915: checkcast kotlin/text/CharCategory
    //   918: astore #8
    //   920: aload_0
    //   921: getfield L$0 : Ljava/lang/Object;
    //   924: checkcast kotlin/sequences/SequenceScope
    //   927: astore_2
    //   928: aload_1
    //   929: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   932: aload_1
    //   933: pop
    //   934: iload_3
    //   935: istore #4
    //   937: goto -> 1099
    //   940: iload #4
    //   942: iflt -> 1091
    //   945: aload_0
    //   946: getfield this$0 : Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer;
    //   949: aload #5
    //   951: iload #6
    //   953: i2c
    //   954: invokestatic access$isNonSplittingPart : (Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer;Lkotlin/text/CharCategory;C)Z
    //   957: ifne -> 967
    //   960: aload #5
    //   962: aload #8
    //   964: if_acmpeq -> 1091
    //   967: aload_2
    //   968: new ai/grazie/nlp/tokenizer/Tokenizer$Token
    //   971: dup
    //   972: aload_0
    //   973: getfield $text : Ljava/lang/CharSequence;
    //   976: iload #4
    //   978: iload_3
    //   979: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   984: invokevirtual toString : ()Ljava/lang/String;
    //   987: new kotlin/ranges/IntRange
    //   990: dup
    //   991: iload #4
    //   993: iload_3
    //   994: iconst_1
    //   995: isub
    //   996: invokespecial <init> : (II)V
    //   999: invokespecial <init> : (Ljava/lang/String;Lkotlin/ranges/IntRange;)V
    //   1002: aload_0
    //   1003: checkcast kotlin/coroutines/Continuation
    //   1006: aload_0
    //   1007: aload_2
    //   1008: putfield L$0 : Ljava/lang/Object;
    //   1011: aload_0
    //   1012: aload #8
    //   1014: putfield L$1 : Ljava/lang/Object;
    //   1017: aload_0
    //   1018: aconst_null
    //   1019: putfield L$2 : Ljava/lang/Object;
    //   1022: aload_0
    //   1023: iload_3
    //   1024: putfield I$0 : I
    //   1027: aload_0
    //   1028: iload #7
    //   1030: putfield C$0 : C
    //   1033: aload_0
    //   1034: bipush #6
    //   1036: putfield label : I
    //   1039: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   1042: dup
    //   1043: aload #10
    //   1045: if_acmpne -> 1084
    //   1048: aload #10
    //   1050: areturn
    //   1051: aload_0
    //   1052: getfield C$0 : C
    //   1055: istore #7
    //   1057: aload_0
    //   1058: getfield I$0 : I
    //   1061: istore_3
    //   1062: aload_0
    //   1063: getfield L$1 : Ljava/lang/Object;
    //   1066: checkcast kotlin/text/CharCategory
    //   1069: astore #8
    //   1071: aload_0
    //   1072: getfield L$0 : Ljava/lang/Object;
    //   1075: checkcast kotlin/sequences/SequenceScope
    //   1078: astore_2
    //   1079: aload_1
    //   1080: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   1083: aload_1
    //   1084: pop
    //   1085: iload_3
    //   1086: istore #4
    //   1088: goto -> 1099
    //   1091: iload #4
    //   1093: ifge -> 1099
    //   1096: iload_3
    //   1097: istore #4
    //   1099: aload #8
    //   1101: astore #5
    //   1103: iload #7
    //   1105: istore #6
    //   1107: iinc #3, 1
    //   1110: goto -> 265
    //   1113: iload #4
    //   1115: iflt -> 1196
    //   1118: aload_2
    //   1119: new ai/grazie/nlp/tokenizer/Tokenizer$Token
    //   1122: dup
    //   1123: aload_0
    //   1124: getfield $text : Ljava/lang/CharSequence;
    //   1127: iload #4
    //   1129: iload_3
    //   1130: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   1135: invokevirtual toString : ()Ljava/lang/String;
    //   1138: new kotlin/ranges/IntRange
    //   1141: dup
    //   1142: iload #4
    //   1144: iload_3
    //   1145: iconst_1
    //   1146: isub
    //   1147: invokespecial <init> : (II)V
    //   1150: invokespecial <init> : (Ljava/lang/String;Lkotlin/ranges/IntRange;)V
    //   1153: aload_0
    //   1154: checkcast kotlin/coroutines/Continuation
    //   1157: aload_0
    //   1158: aconst_null
    //   1159: putfield L$0 : Ljava/lang/Object;
    //   1162: aload_0
    //   1163: aconst_null
    //   1164: putfield L$1 : Ljava/lang/Object;
    //   1167: aload_0
    //   1168: aconst_null
    //   1169: putfield L$2 : Ljava/lang/Object;
    //   1172: aload_0
    //   1173: bipush #7
    //   1175: putfield label : I
    //   1178: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   1181: dup
    //   1182: aload #10
    //   1184: if_acmpne -> 1195
    //   1187: aload #10
    //   1189: areturn
    //   1190: aload_1
    //   1191: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   1194: aload_1
    //   1195: pop
    //   1196: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   1199: areturn
    //   1200: new java/lang/IllegalStateException
    //   1203: dup
    //   1204: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   1206: invokespecial <init> : (Ljava/lang/String;)V
    //   1209: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #17	-> 3
    //   #18	-> 68
    //   #18	-> 85
    //   #20	-> 92
    //   #101	-> 106
    //   #20	-> 138
    //   #20	-> 144
    //   #20	-> 161
    //   #101	-> 169
    //   #102	-> 182
    //   #20	-> 183
    //   #21	-> 186
    //   #17	-> 238
    //   #22	-> 246
    //   #25	-> 251
    //   #26	-> 253
    //   #27	-> 256
    //   #28	-> 261
    //   #29	-> 265
    //   #30	-> 278
    //   #31	-> 290
    //   #33	-> 298
    //   #34	-> 313
    //   #35	-> 333
    //   #35	-> 353
    //   #17	-> 420
    //   #36	-> 471
    //   #40	-> 475
    //   #41	-> 476
    //   #43	-> 481
    //   #45	-> 487
    //   #47	-> 513
    //   #47	-> 533
    //   #17	-> 593
    //   #48	-> 629
    //   #50	-> 636
    //   #52	-> 670
    //   #52	-> 692
    //   #17	-> 752
    //   #53	-> 788
    //   #55	-> 797
    //   #56	-> 817
    //   #56	-> 837
    //   #17	-> 897
    //   #57	-> 933
    //   #61	-> 940
    //   #63	-> 967
    //   #63	-> 987
    //   #17	-> 1048
    //   #64	-> 1084
    //   #65	-> 1091
    //   #66	-> 1096
    //   #71	-> 1099
    //   #72	-> 1103
    //   #73	-> 1107
    //   #76	-> 1113
    //   #77	-> 1118
    //   #77	-> 1138
    //   #17	-> 1187
    //   #79	-> 1195
    //   #17	-> 1200
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   68	17	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   85	7	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   92	77	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   169	7	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   176	7	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   183	49	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   251	172	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   466	130	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   624	131	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   783	117	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   928	123	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   1079	44	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   103	80	3	$this$all$iv	Ljava/lang/CharSequence;
    //   253	170	3	index	I
    //   440	156	3	index	I
    //   607	148	3	index	I
    //   766	134	3	index	I
    //   911	140	3	index	I
    //   1062	76	3	index	I
    //   1138	43	3	index	I
    //   256	97	4	start	I
    //   353	61	4	start	I
    //   475	6	4	start	I
    //   487	46	4	start	I
    //   533	54	4	start	I
    //   636	56	4	start	I
    //   692	54	4	start	I
    //   797	40	4	start	I
    //   837	54	4	start	I
    //   937	50	4	start	I
    //   987	55	4	start	I
    //   1091	5	4	start	I
    //   1099	39	4	start	I
    //   1138	43	4	start	I
    //   261	162	5	prevType	Lkotlin/text/CharCategory;
    //   458	23	5	prevType	Lkotlin/text/CharCategory;
    //   487	26	5	prevType	Lkotlin/text/CharCategory;
    //   636	34	5	prevType	Lkotlin/text/CharCategory;
    //   797	20	5	prevType	Lkotlin/text/CharCategory;
    //   940	27	5	prevType	Lkotlin/text/CharCategory;
    //   1103	10	5	prevType	Lkotlin/text/CharCategory;
    //   265	158	6	prevChar	C
    //   435	46	6	prevChar	C
    //   487	26	6	prevChar	C
    //   636	34	6	prevChar	C
    //   797	20	6	prevChar	C
    //   940	27	6	prevChar	C
    //   1107	6	6	prevChar	C
    //   130	5	7	element$iv	C
    //   290	133	7	curChar	C
    //   429	167	7	curChar	C
    //   602	153	7	curChar	C
    //   761	139	7	curChar	C
    //   906	145	7	curChar	C
    //   1057	53	7	curChar	C
    //   135	26	8	it	C
    //   298	125	8	curType	Lkotlin/text/CharCategory;
    //   449	147	8	curType	Lkotlin/text/CharCategory;
    //   616	139	8	curType	Lkotlin/text/CharCategory;
    //   775	125	8	curType	Lkotlin/text/CharCategory;
    //   920	131	8	curType	Lkotlin/text/CharCategory;
    //   1071	39	8	curType	Lkotlin/text/CharCategory;
    //   138	31	9	$i$a$-all-HeuristicWordTokenizer$tokenizeAsSequence$1$1	I
    //   106	77	5	$i$f$all	I
    //   0	1210	0	this	Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer$tokenizeAsSequence$1;
    //   60	1140	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super HeuristicWordTokenizer$tokenizeAsSequence$1> $completion) {
    HeuristicWordTokenizer$tokenizeAsSequence$1 heuristicWordTokenizer$tokenizeAsSequence$1 = new HeuristicWordTokenizer$tokenizeAsSequence$1(HeuristicWordTokenizer.this, $completion);
    heuristicWordTokenizer$tokenizeAsSequence$1.L$0 = value;
    return (Continuation<Unit>)heuristicWordTokenizer$tokenizeAsSequence$1;
  }
  
  public final Object invoke(SequenceScope p1, Continuation<?> p2) {
    return ((HeuristicWordTokenizer$tokenizeAsSequence$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\word\HeuristicWordTokenizer$tokenizeAsSequence$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */