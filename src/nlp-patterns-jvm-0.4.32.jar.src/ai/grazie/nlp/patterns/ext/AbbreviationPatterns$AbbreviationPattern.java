/*     */ package ai.grazie.nlp.patterns.ext;
/*     */ 
/*     */ import ai.grazie.nlp.patterns.AhoCorasickPattern;
/*     */ import ai.grazie.nlp.patterns.Pattern;
/*     */ import ai.grazie.text.TextRange;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.sequences.SequencesKt;
/*     */ import kotlin.text.Regex;
/*     */ import kotlin.text.StringsKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000Q\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\036\n\002\020\016\n\002\b\002\n\002\020#\n\002\b\002\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\r\n\000\n\002\030\002\n\000\n\002\020 \n\000\n\002\b\006\n\002\020\f\n\000*\001\034\b\002\030\0002\0020\001B\033\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\007J\030\020\023\032\0020\0242\006\020\025\032\0020\0262\006\020\027\032\0020\030H\002J\026\020\031\032\b\022\004\022\0020\0300\0322\006\020\025\032\0020\026H\026J\025\020\033\032\0020\0342\006\020\025\032\0020\026H\002¢\006\002\020\035J\030\020\036\032\0020\0242\006\020\025\032\0020\0262\006\020\027\032\0020\030H\002J\030\020\037\032\0020\0242\006\020\025\032\0020\0262\006\020\027\032\0020\030H\002J\020\020 \032\0020\0242\006\020!\032\0020\"H\002R\024\020\b\032\b\022\004\022\0020\0060\tX\004¢\006\002\n\000R\016\020\n\032\0020\001X\004¢\006\002\n\000R\016\020\013\032\0020\fX\004¢\006\002\n\000R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016R\016\020\017\032\0020\fX\004¢\006\002\n\000R\024\020\020\032\b\022\004\022\0020\0060\tX\004¢\006\002\n\000R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\021\020\022¨\006#"}, d2 = {"Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern;", "Lai/grazie/nlp/patterns/Pattern;", "params", "Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$MatchingParameters;", "words", "", "", "(Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$MatchingParameters;Ljava/util/Collection;)V", "baseAndCapitalized", "", "delegate", "numberContinuation", "Lkotlin/text/Regex;", "getParams", "()Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$MatchingParameters;", "possiblySpacedDot", "upperCase", "getWords", "()Ljava/util/Collection;", "acceptMatch", "", "text", "", "range", "Lai/grazie/text/TextRange;", "find", "", "getLowerCaseSequence", "ai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern$getLowerCaseSequence$1", "(Ljava/lang/CharSequence;)Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern$getLowerCaseSequence$1;", "isBoundaryOk", "isInUpperCaseVicinity", "isSpace", "c", "", "nlp-patterns"})
/*     */ @SourceDebugExtension({"SMAP\nAbbreviationPatterns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbbreviationPatterns.kt\nai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,528:1\n1#2:529\n1368#3:530\n1454#3,2:531\n1456#3,3:535\n774#3:538\n865#3:539\n866#3:542\n1557#3:543\n1628#3,3:544\n827#3:547\n855#3,2:548\n1557#3:550\n1628#3,3:551\n1053#3:554\n1088#4,2:533\n1088#4,2:540\n1771#4,2:555\n*S KotlinDebug\n*F\n+ 1 AbbreviationPatterns.kt\nai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern\n*L\n451#1:530\n451#1:531,2\n451#1:535,3\n457#1:538\n457#1:539\n457#1:542\n457#1:543\n457#1:544,3\n457#1:547\n457#1:548,2\n460#1:550\n460#1:551,3\n462#1:554\n452#1:533,2\n457#1:540,2\n516#1:555,2\n*E\n"})
/*     */ final class AbbreviationPattern
/*     */   implements Pattern
/*     */ {
/*     */   @NotNull
/*     */   private final AbbreviationPatterns.MatchingParameters params;
/*     */   @NotNull
/*     */   private final Collection<String> words;
/*     */   @NotNull
/*     */   private final Regex possiblySpacedDot;
/*     */   @NotNull
/*     */   private final Set<String> baseAndCapitalized;
/*     */   @NotNull
/*     */   private final Set<String> upperCase;
/*     */   @NotNull
/*     */   private final Pattern delegate;
/*     */   @NotNull
/*     */   private final Regex numberContinuation;
/*     */   
/*     */   public AbbreviationPattern(@NotNull AbbreviationPatterns.MatchingParameters params, @NotNull Collection words) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'params'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'words'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_0
/*     */     //   13: invokespecial <init> : ()V
/*     */     //   16: aload_0
/*     */     //   17: aload_1
/*     */     //   18: putfield params : Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$MatchingParameters;
/*     */     //   21: aload_0
/*     */     //   22: aload_2
/*     */     //   23: putfield words : Ljava/util/Collection;
/*     */     //   26: aload_0
/*     */     //   27: new kotlin/text/Regex
/*     */     //   30: dup
/*     */     //   31: ldc '[  ]?\.[  ]?'
/*     */     //   33: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   36: putfield possiblySpacedDot : Lkotlin/text/Regex;
/*     */     //   39: nop
/*     */     //   40: new kotlin/text/Regex
/*     */     //   43: dup
/*     */     //   44: ldc '\.\s'
/*     */     //   46: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   49: astore_3
/*     */     //   50: aload_0
/*     */     //   51: getfield words : Ljava/util/Collection;
/*     */     //   54: checkcast java/lang/Iterable
/*     */     //   57: astore #6
/*     */     //   59: aload #6
/*     */     //   61: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   66: astore #7
/*     */     //   68: aload #7
/*     */     //   70: invokeinterface hasNext : ()Z
/*     */     //   75: ifeq -> 125
/*     */     //   78: aload #7
/*     */     //   80: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   85: astore #8
/*     */     //   87: aload #8
/*     */     //   89: checkcast java/lang/String
/*     */     //   92: astore #9
/*     */     //   94: iconst_0
/*     */     //   95: istore #10
/*     */     //   97: aload_3
/*     */     //   98: aload #9
/*     */     //   100: checkcast java/lang/CharSequence
/*     */     //   103: iconst_0
/*     */     //   104: iconst_2
/*     */     //   105: aconst_null
/*     */     //   106: invokestatic find$default : (Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;
/*     */     //   109: ifnull -> 116
/*     */     //   112: iconst_1
/*     */     //   113: goto -> 117
/*     */     //   116: iconst_0
/*     */     //   117: ifeq -> 68
/*     */     //   120: aload #8
/*     */     //   122: goto -> 126
/*     */     //   125: aconst_null
/*     */     //   126: checkcast java/lang/String
/*     */     //   129: astore #4
/*     */     //   131: aload #4
/*     */     //   133: ifnull -> 158
/*     */     //   136: aload #4
/*     */     //   138: astore #6
/*     */     //   140: iconst_0
/*     */     //   141: istore #7
/*     */     //   143: new java/lang/IllegalArgumentException
/*     */     //   146: dup
/*     */     //   147: aload #6
/*     */     //   149: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   154: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   157: athrow
/*     */     //   158: nop
/*     */     //   159: aload_0
/*     */     //   160: aload_0
/*     */     //   161: getfield words : Ljava/util/Collection;
/*     */     //   164: checkcast java/lang/Iterable
/*     */     //   167: astore_3
/*     */     //   168: astore #19
/*     */     //   170: iconst_0
/*     */     //   171: istore #4
/*     */     //   173: aload_3
/*     */     //   174: astore #5
/*     */     //   176: new java/util/ArrayList
/*     */     //   179: dup
/*     */     //   180: invokespecial <init> : ()V
/*     */     //   183: checkcast java/util/Collection
/*     */     //   186: astore #6
/*     */     //   188: iconst_0
/*     */     //   189: istore #7
/*     */     //   191: aload #5
/*     */     //   193: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   198: astore #8
/*     */     //   200: aload #8
/*     */     //   202: invokeinterface hasNext : ()Z
/*     */     //   207: ifeq -> 428
/*     */     //   210: aload #8
/*     */     //   212: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   217: astore #9
/*     */     //   219: aload #9
/*     */     //   221: checkcast java/lang/String
/*     */     //   224: astore #10
/*     */     //   226: iconst_0
/*     */     //   227: istore #11
/*     */     //   229: aload #10
/*     */     //   231: invokevirtual length : ()I
/*     */     //   234: iconst_1
/*     */     //   235: if_icmple -> 331
/*     */     //   238: aload #10
/*     */     //   240: iconst_0
/*     */     //   241: invokevirtual charAt : (I)C
/*     */     //   244: invokestatic isLowerCase : (C)Z
/*     */     //   247: ifeq -> 331
/*     */     //   250: aload #10
/*     */     //   252: iconst_1
/*     */     //   253: invokevirtual substring : (I)Ljava/lang/String;
/*     */     //   256: dup
/*     */     //   257: ldc 'substring(...)'
/*     */     //   259: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   262: checkcast java/lang/CharSequence
/*     */     //   265: astore #12
/*     */     //   267: nop
/*     */     //   268: iconst_0
/*     */     //   269: istore #13
/*     */     //   271: iconst_0
/*     */     //   272: istore #14
/*     */     //   274: iload #14
/*     */     //   276: aload #12
/*     */     //   278: invokeinterface length : ()I
/*     */     //   283: if_icmpge -> 323
/*     */     //   286: aload #12
/*     */     //   288: iload #14
/*     */     //   290: invokeinterface charAt : (I)C
/*     */     //   295: istore #15
/*     */     //   297: iload #15
/*     */     //   299: istore #16
/*     */     //   301: iconst_0
/*     */     //   302: istore #17
/*     */     //   304: iload #16
/*     */     //   306: invokestatic isLowerCase : (C)Z
/*     */     //   309: nop
/*     */     //   310: ifeq -> 317
/*     */     //   313: iconst_1
/*     */     //   314: goto -> 324
/*     */     //   317: iinc #14, 1
/*     */     //   320: goto -> 274
/*     */     //   323: iconst_0
/*     */     //   324: ifeq -> 331
/*     */     //   327: iconst_1
/*     */     //   328: goto -> 332
/*     */     //   331: iconst_0
/*     */     //   332: istore #18
/*     */     //   334: iload #18
/*     */     //   336: ifeq -> 407
/*     */     //   339: iconst_2
/*     */     //   340: anewarray java/lang/String
/*     */     //   343: astore #12
/*     */     //   345: aload #12
/*     */     //   347: iconst_0
/*     */     //   348: aload #10
/*     */     //   350: aastore
/*     */     //   351: aload #12
/*     */     //   353: iconst_1
/*     */     //   354: aload #10
/*     */     //   356: iconst_0
/*     */     //   357: invokevirtual charAt : (I)C
/*     */     //   360: invokestatic valueOf : (C)Ljava/lang/String;
/*     */     //   363: dup
/*     */     //   364: ldc 'null cannot be cast to non-null type java.lang.String'
/*     */     //   366: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   369: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*     */     //   372: invokevirtual toUpperCase : (Ljava/util/Locale;)Ljava/lang/String;
/*     */     //   375: dup
/*     */     //   376: ldc 'toUpperCase(...)'
/*     */     //   378: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   381: aload #10
/*     */     //   383: iconst_1
/*     */     //   384: invokevirtual substring : (I)Ljava/lang/String;
/*     */     //   387: dup
/*     */     //   388: ldc 'substring(...)'
/*     */     //   390: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   393: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   398: aastore
/*     */     //   399: aload #12
/*     */     //   401: invokestatic listOf : ([Ljava/lang/Object;)Ljava/util/List;
/*     */     //   404: goto -> 412
/*     */     //   407: aload #10
/*     */     //   409: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   412: checkcast java/lang/Iterable
/*     */     //   415: astore #10
/*     */     //   417: aload #6
/*     */     //   419: aload #10
/*     */     //   421: invokestatic addAll : (Ljava/util/Collection;Ljava/lang/Iterable;)Z
/*     */     //   424: pop
/*     */     //   425: goto -> 200
/*     */     //   428: aload #6
/*     */     //   430: checkcast java/util/List
/*     */     //   433: nop
/*     */     //   434: aload #19
/*     */     //   436: swap
/*     */     //   437: checkcast java/util/Collection
/*     */     //   440: invokestatic toSmallMemoryFootprintSet : (Ljava/util/Collection;)Ljava/util/Set;
/*     */     //   443: putfield baseAndCapitalized : Ljava/util/Set;
/*     */     //   446: aload_0
/*     */     //   447: aload_0
/*     */     //   448: getfield words : Ljava/util/Collection;
/*     */     //   451: checkcast java/lang/Iterable
/*     */     //   454: astore_3
/*     */     //   455: astore #19
/*     */     //   457: iconst_0
/*     */     //   458: istore #4
/*     */     //   460: aload_3
/*     */     //   461: astore #5
/*     */     //   463: new java/util/ArrayList
/*     */     //   466: dup
/*     */     //   467: invokespecial <init> : ()V
/*     */     //   470: checkcast java/util/Collection
/*     */     //   473: astore #6
/*     */     //   475: iconst_0
/*     */     //   476: istore #7
/*     */     //   478: aload #5
/*     */     //   480: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   485: astore #8
/*     */     //   487: aload #8
/*     */     //   489: invokeinterface hasNext : ()Z
/*     */     //   494: ifeq -> 596
/*     */     //   497: aload #8
/*     */     //   499: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   504: astore #9
/*     */     //   506: aload #9
/*     */     //   508: checkcast java/lang/String
/*     */     //   511: astore #10
/*     */     //   513: iconst_0
/*     */     //   514: istore #11
/*     */     //   516: aload #10
/*     */     //   518: checkcast java/lang/CharSequence
/*     */     //   521: astore #12
/*     */     //   523: iconst_0
/*     */     //   524: istore #13
/*     */     //   526: iconst_0
/*     */     //   527: istore #14
/*     */     //   529: iload #14
/*     */     //   531: aload #12
/*     */     //   533: invokeinterface length : ()I
/*     */     //   538: if_icmpge -> 578
/*     */     //   541: aload #12
/*     */     //   543: iload #14
/*     */     //   545: invokeinterface charAt : (I)C
/*     */     //   550: istore #15
/*     */     //   552: iload #15
/*     */     //   554: istore #16
/*     */     //   556: iconst_0
/*     */     //   557: istore #17
/*     */     //   559: iload #16
/*     */     //   561: invokestatic isLowerCase : (C)Z
/*     */     //   564: nop
/*     */     //   565: ifeq -> 572
/*     */     //   568: iconst_1
/*     */     //   569: goto -> 579
/*     */     //   572: iinc #14, 1
/*     */     //   575: goto -> 529
/*     */     //   578: iconst_0
/*     */     //   579: nop
/*     */     //   580: ifeq -> 487
/*     */     //   583: aload #6
/*     */     //   585: aload #9
/*     */     //   587: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   592: pop
/*     */     //   593: goto -> 487
/*     */     //   596: aload #6
/*     */     //   598: checkcast java/util/List
/*     */     //   601: nop
/*     */     //   602: aload #19
/*     */     //   604: swap
/*     */     //   605: checkcast java/lang/Iterable
/*     */     //   608: astore_3
/*     */     //   609: astore #19
/*     */     //   611: iconst_0
/*     */     //   612: istore #4
/*     */     //   614: aload_3
/*     */     //   615: astore #5
/*     */     //   617: new java/util/ArrayList
/*     */     //   620: dup
/*     */     //   621: aload_3
/*     */     //   622: bipush #10
/*     */     //   624: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   627: invokespecial <init> : (I)V
/*     */     //   630: checkcast java/util/Collection
/*     */     //   633: astore #6
/*     */     //   635: iconst_0
/*     */     //   636: istore #7
/*     */     //   638: aload #5
/*     */     //   640: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   645: astore #8
/*     */     //   647: aload #8
/*     */     //   649: invokeinterface hasNext : ()Z
/*     */     //   654: ifeq -> 707
/*     */     //   657: aload #8
/*     */     //   659: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   664: astore #9
/*     */     //   666: aload #6
/*     */     //   668: aload #9
/*     */     //   670: checkcast java/lang/String
/*     */     //   673: astore #10
/*     */     //   675: astore #20
/*     */     //   677: iconst_0
/*     */     //   678: istore #11
/*     */     //   680: aload #10
/*     */     //   682: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*     */     //   685: invokevirtual toUpperCase : (Ljava/util/Locale;)Ljava/lang/String;
/*     */     //   688: dup
/*     */     //   689: ldc 'toUpperCase(...)'
/*     */     //   691: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   694: nop
/*     */     //   695: aload #20
/*     */     //   697: swap
/*     */     //   698: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   703: pop
/*     */     //   704: goto -> 647
/*     */     //   707: aload #6
/*     */     //   709: checkcast java/util/List
/*     */     //   712: nop
/*     */     //   713: aload #19
/*     */     //   715: swap
/*     */     //   716: checkcast java/lang/Iterable
/*     */     //   719: astore_3
/*     */     //   720: aload_0
/*     */     //   721: getfield baseAndCapitalized : Ljava/util/Set;
/*     */     //   724: astore #4
/*     */     //   726: astore #19
/*     */     //   728: iconst_0
/*     */     //   729: istore #5
/*     */     //   731: aload_3
/*     */     //   732: astore #6
/*     */     //   734: new java/util/ArrayList
/*     */     //   737: dup
/*     */     //   738: invokespecial <init> : ()V
/*     */     //   741: checkcast java/util/Collection
/*     */     //   744: astore #7
/*     */     //   746: iconst_0
/*     */     //   747: istore #8
/*     */     //   749: aload #6
/*     */     //   751: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   756: astore #9
/*     */     //   758: aload #9
/*     */     //   760: invokeinterface hasNext : ()Z
/*     */     //   765: ifeq -> 812
/*     */     //   768: aload #9
/*     */     //   770: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   775: astore #10
/*     */     //   777: aload #10
/*     */     //   779: checkcast java/lang/String
/*     */     //   782: astore #11
/*     */     //   784: iconst_0
/*     */     //   785: istore #12
/*     */     //   787: aload #4
/*     */     //   789: aload #11
/*     */     //   791: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   796: ifne -> 758
/*     */     //   799: aload #7
/*     */     //   801: aload #10
/*     */     //   803: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   808: pop
/*     */     //   809: goto -> 758
/*     */     //   812: aload #7
/*     */     //   814: checkcast java/util/List
/*     */     //   817: nop
/*     */     //   818: aload #19
/*     */     //   820: swap
/*     */     //   821: checkcast java/util/Collection
/*     */     //   824: invokestatic toSmallMemoryFootprintSet : (Ljava/util/Collection;)Ljava/util/Set;
/*     */     //   827: putfield upperCase : Ljava/util/Set;
/*     */     //   830: aload_0
/*     */     //   831: aload_0
/*     */     //   832: checkcast ai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern
/*     */     //   835: astore #4
/*     */     //   837: astore #19
/*     */     //   839: iconst_0
/*     */     //   840: istore #5
/*     */     //   842: aload #4
/*     */     //   844: getfield words : Ljava/util/Collection;
/*     */     //   847: checkcast java/lang/Iterable
/*     */     //   850: astore #6
/*     */     //   852: iconst_0
/*     */     //   853: istore #7
/*     */     //   855: aload #6
/*     */     //   857: astore #8
/*     */     //   859: new java/util/ArrayList
/*     */     //   862: dup
/*     */     //   863: aload #6
/*     */     //   865: bipush #10
/*     */     //   867: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   870: invokespecial <init> : (I)V
/*     */     //   873: checkcast java/util/Collection
/*     */     //   876: astore #9
/*     */     //   878: iconst_0
/*     */     //   879: istore #10
/*     */     //   881: aload #8
/*     */     //   883: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   888: astore #11
/*     */     //   890: aload #11
/*     */     //   892: invokeinterface hasNext : ()Z
/*     */     //   897: ifeq -> 950
/*     */     //   900: aload #11
/*     */     //   902: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   907: astore #12
/*     */     //   909: aload #9
/*     */     //   911: aload #12
/*     */     //   913: checkcast java/lang/String
/*     */     //   916: astore #13
/*     */     //   918: astore #14
/*     */     //   920: iconst_0
/*     */     //   921: istore #15
/*     */     //   923: aload #13
/*     */     //   925: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*     */     //   928: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*     */     //   931: dup
/*     */     //   932: ldc 'toLowerCase(...)'
/*     */     //   934: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   937: nop
/*     */     //   938: aload #14
/*     */     //   940: swap
/*     */     //   941: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   946: pop
/*     */     //   947: goto -> 890
/*     */     //   950: aload #9
/*     */     //   952: checkcast java/util/List
/*     */     //   955: nop
/*     */     //   956: astore #16
/*     */     //   958: new ai/grazie/nlp/patterns/RegexPattern
/*     */     //   961: dup
/*     */     //   962: new kotlin/text/Regex
/*     */     //   965: dup
/*     */     //   966: aload #16
/*     */     //   968: checkcast java/lang/Iterable
/*     */     //   971: astore #6
/*     */     //   973: iconst_0
/*     */     //   974: istore #7
/*     */     //   976: aload #6
/*     */     //   978: new ai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern$delegate$lambda$9$$inlined$sortedBy$1
/*     */     //   981: dup
/*     */     //   982: invokespecial <init> : ()V
/*     */     //   985: checkcast java/util/Comparator
/*     */     //   988: invokestatic sortedWith : (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
/*     */     //   991: checkcast java/lang/Iterable
/*     */     //   994: ldc '|'
/*     */     //   996: checkcast java/lang/CharSequence
/*     */     //   999: aconst_null
/*     */     //   1000: aconst_null
/*     */     //   1001: iconst_0
/*     */     //   1002: aconst_null
/*     */     //   1003: new ai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern$delegate$1$2
/*     */     //   1006: dup
/*     */     //   1007: aload #4
/*     */     //   1009: invokespecial <init> : (Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern;)V
/*     */     //   1012: checkcast kotlin/jvm/functions/Function1
/*     */     //   1015: bipush #30
/*     */     //   1017: aconst_null
/*     */     //   1018: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   1021: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1024: invokespecial <init> : (Lkotlin/text/Regex;)V
/*     */     //   1027: new ai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern$delegate$1$3
/*     */     //   1030: dup
/*     */     //   1031: aload #16
/*     */     //   1033: aload #4
/*     */     //   1035: invokespecial <init> : (Ljava/util/List;Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern;)V
/*     */     //   1038: invokestatic forPlatform : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1041: checkcast ai/grazie/nlp/patterns/Pattern
/*     */     //   1044: nop
/*     */     //   1045: aload #19
/*     */     //   1047: swap
/*     */     //   1048: nop
/*     */     //   1049: putfield delegate : Lai/grazie/nlp/patterns/Pattern;
/*     */     //   1052: aload_0
/*     */     //   1053: new kotlin/text/Regex
/*     */     //   1056: dup
/*     */     //   1057: ldc '\s{3,}|\s*($|[A-Z]*\d)'
/*     */     //   1059: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1062: putfield numberContinuation : Lkotlin/text/Regex;
/*     */     //   1065: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #440	-> 12
/*     */     //   #441	-> 26
/*     */     //   #443	-> 39
/*     */     //   #444	-> 40
/*     */     //   #445	-> 50
/*     */     //   #529	-> 94
/*     */     //   #445	-> 97
/*     */     //   #445	-> 117
/*     */     //   #445	-> 126
/*     */     //   #446	-> 143
/*     */     //   #448	-> 158
/*     */     //   #455	-> 159
/*     */     //   #450	-> 160
/*     */     //   #451	-> 168
/*     */     //   #530	-> 173
/*     */     //   #531	-> 191
/*     */     //   #532	-> 219
/*     */     //   #452	-> 229
/*     */     //   #452	-> 247
/*     */     //   #452	-> 267
/*     */     //   #533	-> 271
/*     */     //   #452	-> 304
/*     */     //   #452	-> 309
/*     */     //   #533	-> 310
/*     */     //   #534	-> 323
/*     */     //   #452	-> 324
/*     */     //   #453	-> 334
/*     */     //   #453	-> 381
/*     */     //   #453	-> 399
/*     */     //   #532	-> 412
/*     */     //   #535	-> 417
/*     */     //   #537	-> 428
/*     */     //   #530	-> 433
/*     */     //   #455	-> 440
/*     */     //   #457	-> 446
/*     */     //   #538	-> 460
/*     */     //   #539	-> 478
/*     */     //   #457	-> 516
/*     */     //   #540	-> 526
/*     */     //   #457	-> 559
/*     */     //   #457	-> 564
/*     */     //   #540	-> 565
/*     */     //   #541	-> 578
/*     */     //   #457	-> 579
/*     */     //   #539	-> 580
/*     */     //   #542	-> 596
/*     */     //   #538	-> 601
/*     */     //   #457	-> 609
/*     */     //   #543	-> 614
/*     */     //   #544	-> 638
/*     */     //   #545	-> 666
/*     */     //   #457	-> 680
/*     */     //   #457	-> 694
/*     */     //   #545	-> 698
/*     */     //   #546	-> 707
/*     */     //   #543	-> 712
/*     */     //   #457	-> 720
/*     */     //   #547	-> 731
/*     */     //   #548	-> 749
/*     */     //   #457	-> 787
/*     */     //   #548	-> 796
/*     */     //   #549	-> 812
/*     */     //   #547	-> 817
/*     */     //   #457	-> 824
/*     */     //   #459	-> 830
/*     */     //   #460	-> 842
/*     */     //   #550	-> 855
/*     */     //   #551	-> 881
/*     */     //   #552	-> 909
/*     */     //   #460	-> 923
/*     */     //   #460	-> 937
/*     */     //   #552	-> 941
/*     */     //   #553	-> 950
/*     */     //   #550	-> 955
/*     */     //   #460	-> 956
/*     */     //   #462	-> 958
/*     */     //   #554	-> 976
/*     */     //   #554	-> 988
/*     */     //   #462	-> 994
/*     */     //   #463	-> 1027
/*     */     //   #461	-> 1038
/*     */     //   #486	-> 1044
/*     */     //   #459	-> 1048
/*     */     //   #459	-> 1049
/*     */     //   #501	-> 1052
/*     */     //   #440	-> 1065
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	20	10	$i$a$-find-AbbreviationPatterns$AbbreviationPattern$1	I
/*     */     //   94	23	9	it	Ljava/lang/String;
/*     */     //   143	15	7	$i$a$-let-AbbreviationPatterns$AbbreviationPattern$2	I
/*     */     //   140	18	6	it	Ljava/lang/String;
/*     */     //   50	108	3	spaceAfterDot	Lkotlin/text/Regex;
/*     */     //   304	6	17	$i$a$-any-AbbreviationPatterns$AbbreviationPattern$baseAndCapitalized$1$capitalize$1	I
/*     */     //   301	9	16	it	C
/*     */     //   297	20	15	element$iv	C
/*     */     //   271	53	13	$i$f$any	I
/*     */     //   268	56	12	$this$any$iv	Ljava/lang/CharSequence;
/*     */     //   229	183	11	$i$a$-flatMap-AbbreviationPatterns$AbbreviationPattern$baseAndCapitalized$1	I
/*     */     //   334	78	18	capitalize	Z
/*     */     //   226	186	10	word	Ljava/lang/String;
/*     */     //   417	7	10	list$iv$iv	Ljava/lang/Iterable;
/*     */     //   219	206	9	element$iv$iv	Ljava/lang/Object;
/*     */     //   191	239	7	$i$f$flatMapTo	I
/*     */     //   188	242	5	$this$flatMapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   188	242	6	destination$iv$iv	Ljava/util/Collection;
/*     */     //   173	261	4	$i$f$flatMap	I
/*     */     //   170	264	3	$this$flatMap$iv	Ljava/lang/Iterable;
/*     */     //   559	6	17	$i$a$-any-AbbreviationPatterns$AbbreviationPattern$upperCase$1$1	I
/*     */     //   556	9	16	p0	C
/*     */     //   552	20	15	element$iv	C
/*     */     //   526	53	13	$i$f$any	I
/*     */     //   523	56	12	$this$any$iv	Ljava/lang/CharSequence;
/*     */     //   516	64	11	$i$a$-filter-AbbreviationPatterns$AbbreviationPattern$upperCase$1	I
/*     */     //   513	67	10	it	Ljava/lang/String;
/*     */     //   506	87	9	element$iv$iv	Ljava/lang/Object;
/*     */     //   478	120	7	$i$f$filterTo	I
/*     */     //   475	123	5	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   475	123	6	destination$iv$iv	Ljava/util/Collection;
/*     */     //   460	142	4	$i$f$filter	I
/*     */     //   457	145	3	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   680	15	11	$i$a$-map-AbbreviationPatterns$AbbreviationPattern$upperCase$2	I
/*     */     //   677	18	10	it	Ljava/lang/String;
/*     */     //   666	38	9	item$iv$iv	Ljava/lang/Object;
/*     */     //   638	71	7	$i$f$mapTo	I
/*     */     //   635	74	5	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   635	74	6	destination$iv$iv	Ljava/util/Collection;
/*     */     //   614	99	4	$i$f$map	I
/*     */     //   611	102	3	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   787	9	12	$i$a$-filterNot-AbbreviationPatterns$AbbreviationPattern$upperCase$3	I
/*     */     //   784	12	11	p0	Ljava/lang/String;
/*     */     //   777	32	10	element$iv$iv	Ljava/lang/Object;
/*     */     //   749	65	8	$i$f$filterNotTo	I
/*     */     //   746	68	6	$this$filterNotTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   746	68	7	destination$iv$iv	Ljava/util/Collection;
/*     */     //   731	87	5	$i$f$filterNot	I
/*     */     //   728	90	3	$this$filterNot$iv	Ljava/lang/Iterable;
/*     */     //   923	15	15	$i$a$-map-AbbreviationPatterns$AbbreviationPattern$delegate$1$lowWords$1	I
/*     */     //   920	18	13	it	Ljava/lang/String;
/*     */     //   909	38	12	item$iv$iv	Ljava/lang/Object;
/*     */     //   881	71	10	$i$f$mapTo	I
/*     */     //   878	74	8	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   878	74	9	destination$iv$iv	Ljava/util/Collection;
/*     */     //   855	101	7	$i$f$map	I
/*     */     //   852	104	6	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   976	15	7	$i$f$sortedBy	I
/*     */     //   973	18	6	$this$sortedBy$iv	Ljava/lang/Iterable;
/*     */     //   842	203	5	$i$a$-run-AbbreviationPatterns$AbbreviationPattern$delegate$1	I
/*     */     //   958	87	16	lowWords	Ljava/util/List;
/*     */     //   839	206	4	$this$delegate_u24lambda_u249	Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern;
/*     */     //   0	1066	0	this	Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern;
/*     */     //   0	1066	1	params	Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$MatchingParameters;
/*     */     //   0	1066	2	words	Ljava/util/Collection;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final AbbreviationPatterns.MatchingParameters getParams() {
/* 440 */     return this.params; } @NotNull public final Collection<String> getWords() { return this.words; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\020\016\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "", "invoke"})
/*     */   static final class AbbreviationPatterns$AbbreviationPattern$delegate$1$2
/*     */     extends Lambda
/*     */     implements Function1<String, CharSequence>
/*     */   {
/*     */     AbbreviationPatterns$AbbreviationPattern$delegate$1$2(AbbreviationPatterns.AbbreviationPattern $receiver) {
/*     */       super(1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final CharSequence invoke(String it)
/*     */     {
/* 462 */       Intrinsics.checkNotNullParameter(it, "it"); return StringsKt.replace$default(it, ".", this.$this_run.possiblySpacedDot.getPattern(), false, 4, null); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\r\n\002\b\003*\001\000\b\n\030\0002\0020\001J\032\020\002\032\004\030\0010\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\002J\032\020\b\032\004\030\0010\0032\006\020\006\032\0020\0072\006\020\t\032\0020\005H\024¨\006\n"}, d2 = {"ai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern$delegate$1$3", "Lai/grazie/nlp/patterns/AhoCorasickPattern;", "dotWithSpaces", "Lai/grazie/nlp/patterns/AhoCorasickPattern$WideChar;", "i", "", "text", "", "findWideChar", "offset", "nlp-patterns"})
/* 463 */   public static final class AbbreviationPatterns$AbbreviationPattern$delegate$1$3 extends AhoCorasickPattern { AbbreviationPatterns$AbbreviationPattern$delegate$1$3(List $lowWords, AbbreviationPatterns.AbbreviationPattern $receiver) { super($lowWords); }
/*     */      protected AhoCorasickPattern.WideChar findWideChar(CharSequence text, int offset) {
/* 465 */       Intrinsics.checkNotNullParameter(text, "text"); char c = text.charAt(offset);
/* 466 */       if (c == '.') return dotWithSpaces(offset, text); 
/* 467 */       if (this.$this_run.isSpace(c)) {
/* 468 */         if (offset > 0 && text.charAt(offset - 1) == '.') {
/* 469 */           AhoCorasickPattern.WideChar before = dotWithSpaces(offset - 1, text);
/* 470 */           if (before != null) return before; 
/*     */         } 
/* 472 */         if (offset < text.length() - 1 && text.charAt(offset + 1) == '.') {
/* 473 */           AhoCorasickPattern.WideChar after = dotWithSpaces(offset + 1, text);
/* 474 */           if (after != null) return after; 
/*     */         } 
/*     */       } 
/* 477 */       return null;
/*     */     }
/*     */     
/*     */     private final AhoCorasickPattern.WideChar dotWithSpaces(int i, CharSequence text) {
/* 481 */       int start = (i > 0 && this.$this_run.isSpace(text.charAt(i - 1))) ? (i - 1) : i;
/* 482 */       int end = (i < text.length() - 1 && this.$this_run.isSpace(text.charAt(i + 1))) ? (i + 1) : i;
/* 483 */       return (start == end) ? null : new AhoCorasickPattern.WideChar(start, end + 1, '.');
/*     */     } }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public List<TextRange> find(@NotNull CharSequence text) {
/* 490 */     Intrinsics.checkNotNullParameter(text, "text"); List base = this.delegate.find(getLowerCaseSequence(text));
/* 491 */     return 
/*     */ 
/*     */       
/* 494 */       SequencesKt.toList(SequencesKt.filter(SequencesKt.map(CollectionsKt.asSequence(base), new AbbreviationPatterns$AbbreviationPattern$find$1(text)), new AbbreviationPatterns$AbbreviationPattern$find$2(text))); }
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "Lai/grazie/text/TextRange;", "it", "invoke"}) static final class AbbreviationPatterns$AbbreviationPattern$find$1 extends Lambda implements Function1<TextRange, TextRange> {
/*     */     AbbreviationPatterns$AbbreviationPattern$find$1(CharSequence $text) { super(1); }
/*     */     public final TextRange invoke(TextRange it) { Intrinsics.checkNotNullParameter(it, "it");
/* 498 */       return AbbreviationPatterns.AbbreviationPattern.this.isSpace(this.$text.charAt(it.getEndInclusive())) ? new TextRange(it.getStart(), it.getEndInclusive()) : it; } } private final boolean isBoundaryOk(CharSequence text, TextRange range) { return (Pattern.Companion.isWordBoundaryBefore(text, range.getStart()) && (
/* 499 */       this.params.getAllowBeforeApostrophe() ? Pattern.Companion.isWordBoundaryOrApostrophe$nlp_patterns(text, range.getEndExclusive()) : Pattern.Companion.isWordBoundaryBefore(text, range.getEndExclusive()))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "Lai/grazie/text/TextRange;", "invoke", "(Lai/grazie/text/TextRange;)Ljava/lang/Boolean;"})
/*     */   static final class AbbreviationPatterns$AbbreviationPattern$find$2 extends Lambda implements Function1<TextRange, Boolean> {
/*     */     AbbreviationPatterns$AbbreviationPattern$find$2(CharSequence $text) { super(1); }
/*     */     public final Boolean invoke(TextRange it) { Intrinsics.checkNotNullParameter(it, "it");
/*     */       return Boolean.valueOf((AbbreviationPatterns.AbbreviationPattern.this.isBoundaryOk(this.$text, it) && AbbreviationPatterns.AbbreviationPattern.this.acceptMatch(this.$text, it))); } }
/* 504 */   private final boolean acceptMatch(CharSequence text, TextRange range) { CharSequence fragment = text.subSequence(range.getStart(), range.getEndExclusive());
/* 505 */     if (this.params.getVaryCaseDot()) {
/* 506 */       CharSequence charSequence = fragment; Regex regex = this.possiblySpacedDot; String str1 = ".", normalized = regex.replace(charSequence, str1);
/* 507 */       Intrinsics.checkNotNullExpressionValue(normalized.toLowerCase(Locale.ROOT), "toLowerCase(...)"); if (AbbreviationPatterns.access$getNumberAbbrs$p().contains(normalized.toLowerCase(Locale.ROOT))) {
/* 508 */         return (this.numberContinuation.matchAt(text, range.getEndExclusive()) != null);
/*     */       }
/* 510 */       return (this.baseAndCapitalized.contains(normalized) || (this.upperCase.contains(normalized) && isInUpperCaseVicinity(text, range)));
/*     */     } 
/* 512 */     return CollectionsKt.contains(this.words, fragment); }
/*     */   
/*     */   private final boolean isInUpperCaseVicinity(CharSequence text, TextRange range) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: aload_2
/*     */     //   2: invokevirtual getStart : ()I
/*     */     //   5: bipush #10
/*     */     //   7: isub
/*     */     //   8: iconst_0
/*     */     //   9: invokestatic coerceAtLeast : (II)I
/*     */     //   12: aload_2
/*     */     //   13: invokevirtual getEndExclusive : ()I
/*     */     //   16: bipush #10
/*     */     //   18: iadd
/*     */     //   19: aload_1
/*     */     //   20: invokeinterface length : ()I
/*     */     //   25: invokestatic coerceAtMost : (II)I
/*     */     //   28: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
/*     */     //   33: astore_3
/*     */     //   34: iconst_0
/*     */     //   35: istore #4
/*     */     //   37: iconst_0
/*     */     //   38: istore #5
/*     */     //   40: iload #5
/*     */     //   42: aload_3
/*     */     //   43: invokeinterface length : ()I
/*     */     //   48: if_icmpge -> 87
/*     */     //   51: aload_3
/*     */     //   52: iload #5
/*     */     //   54: invokeinterface charAt : (I)C
/*     */     //   59: istore #6
/*     */     //   61: iload #6
/*     */     //   63: istore #7
/*     */     //   65: iconst_0
/*     */     //   66: istore #8
/*     */     //   68: iload #7
/*     */     //   70: invokestatic isLowerCase : (C)Z
/*     */     //   73: nop
/*     */     //   74: ifeq -> 81
/*     */     //   77: iconst_0
/*     */     //   78: goto -> 88
/*     */     //   81: iinc #5, 1
/*     */     //   84: goto -> 40
/*     */     //   87: iconst_1
/*     */     //   88: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #516	-> 0
/*     */     //   #555	-> 37
/*     */     //   #516	-> 68
/*     */     //   #516	-> 73
/*     */     //   #555	-> 74
/*     */     //   #556	-> 87
/*     */     //   #516	-> 88
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   68	6	8	$i$a$-none-AbbreviationPatterns$AbbreviationPattern$isInUpperCaseVicinity$1	I
/*     */     //   65	9	7	it	C
/*     */     //   61	20	6	element$iv	C
/*     */     //   37	51	4	$i$f$none	I
/*     */     //   34	54	3	$this$none$iv	Ljava/lang/CharSequence;
/*     */     //   0	89	0	this	Lai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern;
/*     */     //   0	89	1	text	Ljava/lang/CharSequence;
/*     */     //   0	89	2	range	Lai/grazie/text/TextRange;
/*     */   }
/*     */   
/* 518 */   private final AbbreviationPatterns$AbbreviationPattern$getLowerCaseSequence$1 getLowerCaseSequence(CharSequence text) { return new AbbreviationPatterns$AbbreviationPattern$getLowerCaseSequence$1(text); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\r\n\000\n\002\020\b\n\002\b\003\n\002\020\f\n\002\b\005\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\021\020\006\032\0020\0072\006\020\b\032\0020\003H\002J\030\020\t\032\0020\0012\006\020\n\032\0020\0032\006\020\013\032\0020\003H\026J\b\020\f\032\0020\rH\026R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\004\020\005¨\006\016"}, d2 = {"ai/grazie/nlp/patterns/ext/AbbreviationPatterns$AbbreviationPattern$getLowerCaseSequence$1", "", "length", "", "getLength", "()I", "get", "", "index", "subSequence", "startIndex", "endIndex", "toString", "", "nlp-patterns"})
/* 519 */   public static final class AbbreviationPatterns$AbbreviationPattern$getLowerCaseSequence$1 implements CharSequence { private final int length; AbbreviationPatterns$AbbreviationPattern$getLowerCaseSequence$1(CharSequence $text) { this.length = $text.length(); } public int getLength() { return this.length; }
/* 520 */     public char get(int index) { return Character.toLowerCase(this.$text.charAt(index)); }
/* 521 */     public CharSequence subSequence(int startIndex, int endIndex) { throw new IllegalStateException("Not yet implemented".toString()); } public String toString() {
/* 522 */       Intrinsics.checkNotNullExpressionValue(this.$text.toString().toLowerCase(Locale.ROOT), "toLowerCase(...)"); return this.$text.toString().toLowerCase(Locale.ROOT);
/*     */     } }
/*     */   private final boolean isSpace(char c) {
/* 525 */     return (c == ' ' || c == ' ');
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\ext\AbbreviationPatterns$AbbreviationPattern.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */