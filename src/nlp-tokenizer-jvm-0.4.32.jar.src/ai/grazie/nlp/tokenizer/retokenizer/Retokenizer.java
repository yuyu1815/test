/*     */ package ai.grazie.nlp.tokenizer.retokenizer;
/*     */ 
/*     */ import ai.grazie.nlp.tokenizer.Tokenizer;
/*     */ import ai.grazie.utils.IteratorWithCurrent;
/*     */ import ai.grazie.utils.PrependableIterator;
/*     */ import java.util.List;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.sequences.Sequence;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\b\005\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\020\r\n\002\b\004\b&\030\0002\0020\001B\r\022\006\020\002\032\0020\001¢\006\002\020\003J2\020\006\032\b\022\004\022\0020\b0\0072\006\020\t\032\0020\n2\f\020\013\032\b\022\004\022\0020\b0\0072\f\020\f\032\b\022\004\022\0020\b0\007H\004J2\020\r\032\b\022\004\022\0020\b0\0162\006\020\t\032\0020\0172\f\020\013\032\b\022\004\022\0020\b0\0162\f\020\f\032\b\022\004\022\0020\b0\016H\004J$\020\020\032\b\022\004\022\0020\b0\0072\006\020\t\032\0020\n2\f\020\021\032\b\022\004\022\0020\b0\007H&J\026\020\022\032\b\022\004\022\0020\b0\0072\006\020\t\032\0020\nH\026R\024\020\002\032\0020\001X\004¢\006\b\n\000\032\004\b\004\020\005¨\006\023"}, d2 = {"Lai/grazie/nlp/tokenizer/retokenizer/Retokenizer;", "Lai/grazie/nlp/tokenizer/NonDestructiveTokenizer;", "tokenizer", "(Lai/grazie/nlp/tokenizer/NonDestructiveTokenizer;)V", "getTokenizer", "()Lai/grazie/nlp/tokenizer/NonDestructiveTokenizer;", "merge", "", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "text", "", "initialTokens", "retokenizedTokens", "mergeSequences", "Lkotlin/sequences/Sequence;", "", "retokenize", "tokens", "tokenize", "nlp-tokenizer"})
/*     */ @SourceDebugExtension({"SMAP\nRetokenizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Retokenizer.kt\nai/grazie/nlp/tokenizer/retokenizer/Retokenizer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n1053#2:124\n*S KotlinDebug\n*F\n+ 1 Retokenizer.kt\nai/grazie/nlp/tokenizer/retokenizer/Retokenizer\n*L\n28#1:124\n*E\n"})
/*     */ public abstract class Retokenizer implements NonDestructiveTokenizer {
/*  16 */   public Retokenizer(@NotNull NonDestructiveTokenizer tokenizer) { this.tokenizer = tokenizer; } @NotNull private final NonDestructiveTokenizer tokenizer; @NotNull protected NonDestructiveTokenizer getTokenizer() { return this.tokenizer; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public abstract List<Tokenizer.Token> retokenize(@NotNull String paramString, @NotNull List<Tokenizer.Token> paramList);
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public List<Tokenizer.Token> tokenize(@NotNull String text) {
/*  27 */     Intrinsics.checkNotNullParameter(text, "text"); List<Tokenizer.Token> tokenized = getTokenizer().tokenize(text);
/*  28 */     Iterable<Tokenizer.Token> $this$sortedBy$iv = retokenize(text, tokenized); int $i$f$sortedBy = 0; List<Tokenizer.Token> retokenized = 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 124 */       CollectionsKt.sortedWith($this$sortedBy$iv, new Retokenizer$tokenize$$inlined$sortedBy$1());
/*     */     return merge(text, tokenized, retokenized);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected final Sequence<Tokenizer.Token> mergeSequences(@NotNull CharSequence text, @NotNull Sequence<Tokenizer.Token> initialTokens, @NotNull Sequence retokenizedTokens) {
/*     */     Intrinsics.checkNotNullParameter(text, "text");
/*     */     Intrinsics.checkNotNullParameter(initialTokens, "initialTokens");
/*     */     Intrinsics.checkNotNullParameter(retokenizedTokens, "retokenizedTokens");
/*     */     IteratorWithCurrent<Tokenizer.Token> retokenizedIterator = new IteratorWithCurrent(retokenizedTokens.iterator());
/*     */     if (retokenizedIterator.done())
/*     */       return initialTokens; 
/*     */     retokenizedIterator.advance();
/*     */     PrependableIterator<Tokenizer.Token> initialIterator = new PrependableIterator(initialTokens.iterator());
/*     */     return SequencesKt.sequence(new Retokenizer$mergeSequences$1(initialIterator, retokenizedIterator, text, null));
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "Retokenizer.kt", l = {52, 65, 81, 101, 110}, i = {0, 1, 2, 2, 3, 4}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$0"}, n = {"$this$sequence", "$this$sequence", "$this$sequence", "center", "$this$sequence", "$this$sequence"}, m = "invokeSuspend", c = "ai.grazie.nlp.tokenizer.retokenizer.Retokenizer$mergeSequences$1")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;"})
/*     */   @SourceDebugExtension({"SMAP\nRetokenizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Retokenizer.kt\nai/grazie/nlp/tokenizer/retokenizer/Retokenizer$mergeSequences$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n827#2:124\n855#2,2:125\n1557#2:127\n1628#2,3:128\n827#2:131\n855#2,2:132\n1557#2:134\n1628#2,3:135\n*S KotlinDebug\n*F\n+ 1 Retokenizer.kt\nai/grazie/nlp/tokenizer/retokenizer/Retokenizer$mergeSequences$1\n*L\n100#1:124\n100#1:125,2\n100#1:127\n100#1:128,3\n109#1:131\n109#1:132,2\n109#1:134\n109#1:135,3\n*E\n"})
/*     */   static final class Retokenizer$mergeSequences$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Tokenizer.Token>, Continuation<? super Unit>, Object> {
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     Retokenizer$mergeSequences$1(PrependableIterator<Tokenizer.Token> $initialIterator, IteratorWithCurrent<Tokenizer.Token> $retokenizedIterator, CharSequence $text, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #20
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 1425, 0 -> 48, 1 -> 124, 2 -> 243, 3 -> 482, 4 -> 935, 5 -> 1379
/*     */       //   48: aload_1
/*     */       //   49: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   52: aload_0
/*     */       //   53: getfield L$0 : Ljava/lang/Object;
/*     */       //   56: checkcast kotlin/sequences/SequenceScope
/*     */       //   59: astore_2
/*     */       //   60: aload_0
/*     */       //   61: getfield $initialIterator : Lai/grazie/utils/PrependableIterator;
/*     */       //   64: invokevirtual hasNext : ()Z
/*     */       //   67: ifeq -> 1421
/*     */       //   70: aload_0
/*     */       //   71: getfield $initialIterator : Lai/grazie/utils/PrependableIterator;
/*     */       //   74: invokevirtual next : ()Ljava/lang/Object;
/*     */       //   77: checkcast ai/grazie/nlp/tokenizer/Tokenizer$Token
/*     */       //   80: astore_3
/*     */       //   81: aload_0
/*     */       //   82: getfield $retokenizedIterator : Lai/grazie/utils/IteratorWithCurrent;
/*     */       //   85: invokevirtual done : ()Z
/*     */       //   88: ifeq -> 141
/*     */       //   91: aload_2
/*     */       //   92: aload_3
/*     */       //   93: aload_0
/*     */       //   94: checkcast kotlin/coroutines/Continuation
/*     */       //   97: aload_0
/*     */       //   98: aload_2
/*     */       //   99: putfield L$0 : Ljava/lang/Object;
/*     */       //   102: aload_0
/*     */       //   103: aconst_null
/*     */       //   104: putfield L$1 : Ljava/lang/Object;
/*     */       //   107: aload_0
/*     */       //   108: iconst_1
/*     */       //   109: putfield label : I
/*     */       //   112: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   115: dup
/*     */       //   116: aload #20
/*     */       //   118: if_acmpne -> 137
/*     */       //   121: aload #20
/*     */       //   123: areturn
/*     */       //   124: aload_0
/*     */       //   125: getfield L$0 : Ljava/lang/Object;
/*     */       //   128: checkcast kotlin/sequences/SequenceScope
/*     */       //   131: astore_2
/*     */       //   132: aload_1
/*     */       //   133: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   136: aload_1
/*     */       //   137: pop
/*     */       //   138: goto -> 60
/*     */       //   141: aload_0
/*     */       //   142: getfield $retokenizedIterator : Lai/grazie/utils/IteratorWithCurrent;
/*     */       //   145: invokevirtual current : ()Ljava/lang/Object;
/*     */       //   148: checkcast ai/grazie/nlp/tokenizer/Tokenizer$Token
/*     */       //   151: astore #4
/*     */       //   153: aload_3
/*     */       //   154: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   157: aload #4
/*     */       //   159: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   162: invokestatic intersects : (Lkotlin/ranges/IntRange;Lkotlin/ranges/IntRange;)Z
/*     */       //   165: ifne -> 260
/*     */       //   168: aload_3
/*     */       //   169: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   172: invokevirtual getStart : ()Ljava/lang/Integer;
/*     */       //   175: invokevirtual intValue : ()I
/*     */       //   178: aload #4
/*     */       //   180: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   183: invokevirtual getEndInclusive : ()Ljava/lang/Integer;
/*     */       //   186: invokevirtual intValue : ()I
/*     */       //   189: if_icmple -> 210
/*     */       //   192: aload_0
/*     */       //   193: getfield $retokenizedIterator : Lai/grazie/utils/IteratorWithCurrent;
/*     */       //   196: invokevirtual advance : ()V
/*     */       //   199: aload_0
/*     */       //   200: getfield $initialIterator : Lai/grazie/utils/PrependableIterator;
/*     */       //   203: aload_3
/*     */       //   204: invokevirtual prepend : (Ljava/lang/Object;)V
/*     */       //   207: goto -> 60
/*     */       //   210: aload_2
/*     */       //   211: aload_3
/*     */       //   212: aload_0
/*     */       //   213: checkcast kotlin/coroutines/Continuation
/*     */       //   216: aload_0
/*     */       //   217: aload_2
/*     */       //   218: putfield L$0 : Ljava/lang/Object;
/*     */       //   221: aload_0
/*     */       //   222: aconst_null
/*     */       //   223: putfield L$1 : Ljava/lang/Object;
/*     */       //   226: aload_0
/*     */       //   227: iconst_2
/*     */       //   228: putfield label : I
/*     */       //   231: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   234: dup
/*     */       //   235: aload #20
/*     */       //   237: if_acmpne -> 256
/*     */       //   240: aload #20
/*     */       //   242: areturn
/*     */       //   243: aload_0
/*     */       //   244: getfield L$0 : Ljava/lang/Object;
/*     */       //   247: checkcast kotlin/sequences/SequenceScope
/*     */       //   250: astore_2
/*     */       //   251: aload_1
/*     */       //   252: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   255: aload_1
/*     */       //   256: pop
/*     */       //   257: goto -> 60
/*     */       //   260: aload_3
/*     */       //   261: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   264: invokevirtual getStart : ()Ljava/lang/Integer;
/*     */       //   267: invokevirtual intValue : ()I
/*     */       //   270: aload #4
/*     */       //   272: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   275: invokevirtual getStart : ()Ljava/lang/Integer;
/*     */       //   278: invokevirtual intValue : ()I
/*     */       //   281: if_icmple -> 548
/*     */       //   284: aload_3
/*     */       //   285: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   288: invokevirtual getEndInclusive : ()Ljava/lang/Integer;
/*     */       //   291: invokevirtual intValue : ()I
/*     */       //   294: aload #4
/*     */       //   296: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   299: invokevirtual getEndInclusive : ()Ljava/lang/Integer;
/*     */       //   302: invokevirtual intValue : ()I
/*     */       //   305: if_icmpge -> 311
/*     */       //   308: goto -> 60
/*     */       //   311: aload_3
/*     */       //   312: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   315: invokevirtual getEndInclusive : ()Ljava/lang/Integer;
/*     */       //   318: invokevirtual intValue : ()I
/*     */       //   321: aload #4
/*     */       //   323: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   326: invokevirtual getEndInclusive : ()Ljava/lang/Integer;
/*     */       //   329: invokevirtual intValue : ()I
/*     */       //   332: if_icmpne -> 345
/*     */       //   335: aload_0
/*     */       //   336: getfield $retokenizedIterator : Lai/grazie/utils/IteratorWithCurrent;
/*     */       //   339: invokevirtual advance : ()V
/*     */       //   342: goto -> 60
/*     */       //   345: aload_3
/*     */       //   346: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   349: invokevirtual getEndInclusive : ()Ljava/lang/Integer;
/*     */       //   352: invokevirtual intValue : ()I
/*     */       //   355: aload #4
/*     */       //   357: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   360: invokevirtual getEndInclusive : ()Ljava/lang/Integer;
/*     */       //   363: invokevirtual intValue : ()I
/*     */       //   366: if_icmple -> 548
/*     */       //   369: new kotlin/ranges/IntRange
/*     */       //   372: dup
/*     */       //   373: aload #4
/*     */       //   375: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   378: invokevirtual getEndInclusive : ()Ljava/lang/Integer;
/*     */       //   381: invokevirtual intValue : ()I
/*     */       //   384: aload_3
/*     */       //   385: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   388: invokestatic getStartExclusive : (Lkotlin/ranges/IntRange;)I
/*     */       //   391: invokespecial <init> : (II)V
/*     */       //   394: astore #5
/*     */       //   396: new kotlin/ranges/IntRange
/*     */       //   399: dup
/*     */       //   400: aload #4
/*     */       //   402: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   405: invokestatic getCheckedEndExclusive : (Lkotlin/ranges/IntRange;)I
/*     */       //   408: aload_3
/*     */       //   409: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   412: invokevirtual getEndInclusive : ()Ljava/lang/Integer;
/*     */       //   415: invokevirtual intValue : ()I
/*     */       //   418: invokespecial <init> : (II)V
/*     */       //   421: astore #6
/*     */       //   423: aload #5
/*     */       //   425: invokevirtual isEmpty : ()Z
/*     */       //   428: ifne -> 505
/*     */       //   431: aload_2
/*     */       //   432: new ai/grazie/nlp/tokenizer/Tokenizer$Token
/*     */       //   435: dup
/*     */       //   436: aload_0
/*     */       //   437: getfield $text : Ljava/lang/CharSequence;
/*     */       //   440: aload #5
/*     */       //   442: invokestatic substring : (Ljava/lang/CharSequence;Lkotlin/ranges/IntRange;)Ljava/lang/String;
/*     */       //   445: aload #5
/*     */       //   447: invokespecial <init> : (Ljava/lang/String;Lkotlin/ranges/IntRange;)V
/*     */       //   450: aload_0
/*     */       //   451: checkcast kotlin/coroutines/Continuation
/*     */       //   454: aload_0
/*     */       //   455: aload_2
/*     */       //   456: putfield L$0 : Ljava/lang/Object;
/*     */       //   459: aload_0
/*     */       //   460: aload #6
/*     */       //   462: putfield L$1 : Ljava/lang/Object;
/*     */       //   465: aload_0
/*     */       //   466: iconst_3
/*     */       //   467: putfield label : I
/*     */       //   470: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   473: dup
/*     */       //   474: aload #20
/*     */       //   476: if_acmpne -> 504
/*     */       //   479: aload #20
/*     */       //   481: areturn
/*     */       //   482: aload_0
/*     */       //   483: getfield L$1 : Ljava/lang/Object;
/*     */       //   486: checkcast kotlin/ranges/IntRange
/*     */       //   489: astore #6
/*     */       //   491: aload_0
/*     */       //   492: getfield L$0 : Ljava/lang/Object;
/*     */       //   495: checkcast kotlin/sequences/SequenceScope
/*     */       //   498: astore_2
/*     */       //   499: aload_1
/*     */       //   500: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   503: aload_1
/*     */       //   504: pop
/*     */       //   505: aload #6
/*     */       //   507: invokevirtual isEmpty : ()Z
/*     */       //   510: ifne -> 538
/*     */       //   513: aload_0
/*     */       //   514: getfield $initialIterator : Lai/grazie/utils/PrependableIterator;
/*     */       //   517: new ai/grazie/nlp/tokenizer/Tokenizer$Token
/*     */       //   520: dup
/*     */       //   521: aload_0
/*     */       //   522: getfield $text : Ljava/lang/CharSequence;
/*     */       //   525: aload #6
/*     */       //   527: invokestatic substring : (Ljava/lang/CharSequence;Lkotlin/ranges/IntRange;)Ljava/lang/String;
/*     */       //   530: aload #6
/*     */       //   532: invokespecial <init> : (Ljava/lang/String;Lkotlin/ranges/IntRange;)V
/*     */       //   535: invokevirtual prepend : (Ljava/lang/Object;)V
/*     */       //   538: aload_0
/*     */       //   539: getfield $retokenizedIterator : Lai/grazie/utils/IteratorWithCurrent;
/*     */       //   542: invokevirtual advance : ()V
/*     */       //   545: goto -> 60
/*     */       //   548: aload #4
/*     */       //   550: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   553: aload_3
/*     */       //   554: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   557: iconst_0
/*     */       //   558: iconst_2
/*     */       //   559: aconst_null
/*     */       //   560: invokestatic inside$default : (Lkotlin/ranges/IntRange;Lkotlin/ranges/IntRange;ZILjava/lang/Object;)Z
/*     */       //   563: ifeq -> 952
/*     */       //   566: new kotlin/ranges/IntRange
/*     */       //   569: dup
/*     */       //   570: aload_3
/*     */       //   571: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   574: invokevirtual getStart : ()Ljava/lang/Integer;
/*     */       //   577: invokevirtual intValue : ()I
/*     */       //   580: aload #4
/*     */       //   582: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   585: invokevirtual getStart : ()Ljava/lang/Integer;
/*     */       //   588: invokevirtual intValue : ()I
/*     */       //   591: iconst_1
/*     */       //   592: isub
/*     */       //   593: invokespecial <init> : (II)V
/*     */       //   596: astore #5
/*     */       //   598: aload #4
/*     */       //   600: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   603: astore #6
/*     */       //   605: new kotlin/ranges/IntRange
/*     */       //   608: dup
/*     */       //   609: aload #4
/*     */       //   611: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   614: invokestatic getCheckedEndExclusive : (Lkotlin/ranges/IntRange;)I
/*     */       //   617: aload_3
/*     */       //   618: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   621: invokevirtual getEndInclusive : ()Ljava/lang/Integer;
/*     */       //   624: invokevirtual intValue : ()I
/*     */       //   627: invokespecial <init> : (II)V
/*     */       //   630: astore #7
/*     */       //   632: aload #7
/*     */       //   634: invokevirtual isEmpty : ()Z
/*     */       //   637: ifne -> 665
/*     */       //   640: aload_0
/*     */       //   641: getfield $initialIterator : Lai/grazie/utils/PrependableIterator;
/*     */       //   644: new ai/grazie/nlp/tokenizer/Tokenizer$Token
/*     */       //   647: dup
/*     */       //   648: aload_0
/*     */       //   649: getfield $text : Ljava/lang/CharSequence;
/*     */       //   652: aload #7
/*     */       //   654: invokestatic substring : (Ljava/lang/CharSequence;Lkotlin/ranges/IntRange;)Ljava/lang/String;
/*     */       //   657: aload #7
/*     */       //   659: invokespecial <init> : (Ljava/lang/String;Lkotlin/ranges/IntRange;)V
/*     */       //   662: invokevirtual prepend : (Ljava/lang/Object;)V
/*     */       //   665: iconst_2
/*     */       //   666: anewarray kotlin/ranges/IntRange
/*     */       //   669: astore #9
/*     */       //   671: aload #9
/*     */       //   673: iconst_0
/*     */       //   674: aload #5
/*     */       //   676: aastore
/*     */       //   677: aload #9
/*     */       //   679: iconst_1
/*     */       //   680: aload #6
/*     */       //   682: aastore
/*     */       //   683: aload #9
/*     */       //   685: invokestatic listOf : ([Ljava/lang/Object;)Ljava/util/List;
/*     */       //   688: checkcast java/lang/Iterable
/*     */       //   691: astore #9
/*     */       //   693: iconst_0
/*     */       //   694: istore #10
/*     */       //   696: aload #9
/*     */       //   698: astore #11
/*     */       //   700: new java/util/ArrayList
/*     */       //   703: dup
/*     */       //   704: invokespecial <init> : ()V
/*     */       //   707: checkcast java/util/Collection
/*     */       //   710: astore #12
/*     */       //   712: iconst_0
/*     */       //   713: istore #13
/*     */       //   715: aload #11
/*     */       //   717: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   722: astore #14
/*     */       //   724: aload #14
/*     */       //   726: invokeinterface hasNext : ()Z
/*     */       //   731: ifeq -> 774
/*     */       //   734: aload #14
/*     */       //   736: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   741: astore #15
/*     */       //   743: aload #15
/*     */       //   745: checkcast kotlin/ranges/IntRange
/*     */       //   748: astore #16
/*     */       //   750: iconst_0
/*     */       //   751: istore #17
/*     */       //   753: aload #16
/*     */       //   755: invokevirtual isEmpty : ()Z
/*     */       //   758: ifne -> 724
/*     */       //   761: aload #12
/*     */       //   763: aload #15
/*     */       //   765: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   770: pop
/*     */       //   771: goto -> 724
/*     */       //   774: aload #12
/*     */       //   776: checkcast java/util/List
/*     */       //   779: nop
/*     */       //   780: checkcast java/lang/Iterable
/*     */       //   783: astore #9
/*     */       //   785: aload_0
/*     */       //   786: getfield $text : Ljava/lang/CharSequence;
/*     */       //   789: astore #10
/*     */       //   791: iconst_0
/*     */       //   792: istore #11
/*     */       //   794: aload #9
/*     */       //   796: astore #12
/*     */       //   798: new java/util/ArrayList
/*     */       //   801: dup
/*     */       //   802: aload #9
/*     */       //   804: bipush #10
/*     */       //   806: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */       //   809: invokespecial <init> : (I)V
/*     */       //   812: checkcast java/util/Collection
/*     */       //   815: astore #13
/*     */       //   817: iconst_0
/*     */       //   818: istore #14
/*     */       //   820: aload #12
/*     */       //   822: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   827: astore #15
/*     */       //   829: aload #15
/*     */       //   831: invokeinterface hasNext : ()Z
/*     */       //   836: ifeq -> 890
/*     */       //   839: aload #15
/*     */       //   841: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   846: astore #16
/*     */       //   848: aload #13
/*     */       //   850: aload #16
/*     */       //   852: checkcast kotlin/ranges/IntRange
/*     */       //   855: astore #17
/*     */       //   857: astore #19
/*     */       //   859: iconst_0
/*     */       //   860: istore #18
/*     */       //   862: new ai/grazie/nlp/tokenizer/Tokenizer$Token
/*     */       //   865: dup
/*     */       //   866: aload #10
/*     */       //   868: aload #17
/*     */       //   870: invokestatic substring : (Ljava/lang/CharSequence;Lkotlin/ranges/IntRange;)Ljava/lang/String;
/*     */       //   873: aload #17
/*     */       //   875: invokespecial <init> : (Ljava/lang/String;Lkotlin/ranges/IntRange;)V
/*     */       //   878: aload #19
/*     */       //   880: swap
/*     */       //   881: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   886: pop
/*     */       //   887: goto -> 829
/*     */       //   890: aload #13
/*     */       //   892: checkcast java/util/List
/*     */       //   895: nop
/*     */       //   896: astore #8
/*     */       //   898: aload_2
/*     */       //   899: aload #8
/*     */       //   901: checkcast java/lang/Iterable
/*     */       //   904: aload_0
/*     */       //   905: checkcast kotlin/coroutines/Continuation
/*     */       //   908: aload_0
/*     */       //   909: aload_2
/*     */       //   910: putfield L$0 : Ljava/lang/Object;
/*     */       //   913: aload_0
/*     */       //   914: aconst_null
/*     */       //   915: putfield L$1 : Ljava/lang/Object;
/*     */       //   918: aload_0
/*     */       //   919: iconst_4
/*     */       //   920: putfield label : I
/*     */       //   923: invokevirtual yieldAll : (Ljava/lang/Iterable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   926: dup
/*     */       //   927: aload #20
/*     */       //   929: if_acmpne -> 948
/*     */       //   932: aload #20
/*     */       //   934: areturn
/*     */       //   935: aload_0
/*     */       //   936: getfield L$0 : Ljava/lang/Object;
/*     */       //   939: checkcast kotlin/sequences/SequenceScope
/*     */       //   942: astore_2
/*     */       //   943: aload_1
/*     */       //   944: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   947: aload_1
/*     */       //   948: pop
/*     */       //   949: goto -> 60
/*     */       //   952: aload_3
/*     */       //   953: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   956: astore #5
/*     */       //   958: aload #5
/*     */       //   960: invokevirtual getFirst : ()I
/*     */       //   963: istore #6
/*     */       //   965: aload #5
/*     */       //   967: invokevirtual getLast : ()I
/*     */       //   970: istore #7
/*     */       //   972: aload #4
/*     */       //   974: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   977: invokevirtual getEndInclusive : ()Ljava/lang/Integer;
/*     */       //   980: invokevirtual intValue : ()I
/*     */       //   983: istore #8
/*     */       //   985: iload #6
/*     */       //   987: iload #8
/*     */       //   989: if_icmpgt -> 1007
/*     */       //   992: iload #8
/*     */       //   994: iload #7
/*     */       //   996: if_icmpgt -> 1003
/*     */       //   999: iconst_1
/*     */       //   1000: goto -> 1008
/*     */       //   1003: iconst_0
/*     */       //   1004: goto -> 1008
/*     */       //   1007: iconst_0
/*     */       //   1008: ifne -> 1396
/*     */       //   1011: aload_3
/*     */       //   1012: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   1015: astore #5
/*     */       //   1017: aload #5
/*     */       //   1019: invokevirtual getFirst : ()I
/*     */       //   1022: istore #6
/*     */       //   1024: aload #5
/*     */       //   1026: invokevirtual getLast : ()I
/*     */       //   1029: istore #7
/*     */       //   1031: aload #4
/*     */       //   1033: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   1036: invokevirtual getStart : ()Ljava/lang/Integer;
/*     */       //   1039: invokevirtual intValue : ()I
/*     */       //   1042: istore #8
/*     */       //   1044: iload #6
/*     */       //   1046: iload #8
/*     */       //   1048: if_icmpgt -> 1066
/*     */       //   1051: iload #8
/*     */       //   1053: iload #7
/*     */       //   1055: if_icmpgt -> 1062
/*     */       //   1058: iconst_1
/*     */       //   1059: goto -> 1067
/*     */       //   1062: iconst_0
/*     */       //   1063: goto -> 1067
/*     */       //   1066: iconst_0
/*     */       //   1067: ifeq -> 1396
/*     */       //   1070: new kotlin/ranges/IntRange
/*     */       //   1073: dup
/*     */       //   1074: aload_3
/*     */       //   1075: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   1078: invokevirtual getStart : ()Ljava/lang/Integer;
/*     */       //   1081: invokevirtual intValue : ()I
/*     */       //   1084: aload #4
/*     */       //   1086: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   1089: invokevirtual getStart : ()Ljava/lang/Integer;
/*     */       //   1092: invokevirtual intValue : ()I
/*     */       //   1095: iconst_1
/*     */       //   1096: isub
/*     */       //   1097: invokespecial <init> : (II)V
/*     */       //   1100: astore #5
/*     */       //   1102: aload #4
/*     */       //   1104: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   1107: astore #6
/*     */       //   1109: iconst_2
/*     */       //   1110: anewarray kotlin/ranges/IntRange
/*     */       //   1113: astore #8
/*     */       //   1115: aload #8
/*     */       //   1117: iconst_0
/*     */       //   1118: aload #5
/*     */       //   1120: aastore
/*     */       //   1121: aload #8
/*     */       //   1123: iconst_1
/*     */       //   1124: aload #6
/*     */       //   1126: aastore
/*     */       //   1127: aload #8
/*     */       //   1129: invokestatic listOf : ([Ljava/lang/Object;)Ljava/util/List;
/*     */       //   1132: checkcast java/lang/Iterable
/*     */       //   1135: astore #8
/*     */       //   1137: iconst_0
/*     */       //   1138: istore #9
/*     */       //   1140: aload #8
/*     */       //   1142: astore #10
/*     */       //   1144: new java/util/ArrayList
/*     */       //   1147: dup
/*     */       //   1148: invokespecial <init> : ()V
/*     */       //   1151: checkcast java/util/Collection
/*     */       //   1154: astore #11
/*     */       //   1156: iconst_0
/*     */       //   1157: istore #12
/*     */       //   1159: aload #10
/*     */       //   1161: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   1166: astore #13
/*     */       //   1168: aload #13
/*     */       //   1170: invokeinterface hasNext : ()Z
/*     */       //   1175: ifeq -> 1218
/*     */       //   1178: aload #13
/*     */       //   1180: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   1185: astore #14
/*     */       //   1187: aload #14
/*     */       //   1189: checkcast kotlin/ranges/IntRange
/*     */       //   1192: astore #15
/*     */       //   1194: iconst_0
/*     */       //   1195: istore #16
/*     */       //   1197: aload #15
/*     */       //   1199: invokevirtual isEmpty : ()Z
/*     */       //   1202: ifne -> 1168
/*     */       //   1205: aload #11
/*     */       //   1207: aload #14
/*     */       //   1209: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   1214: pop
/*     */       //   1215: goto -> 1168
/*     */       //   1218: aload #11
/*     */       //   1220: checkcast java/util/List
/*     */       //   1223: nop
/*     */       //   1224: checkcast java/lang/Iterable
/*     */       //   1227: astore #8
/*     */       //   1229: aload_0
/*     */       //   1230: getfield $text : Ljava/lang/CharSequence;
/*     */       //   1233: astore #9
/*     */       //   1235: iconst_0
/*     */       //   1236: istore #10
/*     */       //   1238: aload #8
/*     */       //   1240: astore #11
/*     */       //   1242: new java/util/ArrayList
/*     */       //   1245: dup
/*     */       //   1246: aload #8
/*     */       //   1248: bipush #10
/*     */       //   1250: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */       //   1253: invokespecial <init> : (I)V
/*     */       //   1256: checkcast java/util/Collection
/*     */       //   1259: astore #12
/*     */       //   1261: iconst_0
/*     */       //   1262: istore #13
/*     */       //   1264: aload #11
/*     */       //   1266: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   1271: astore #14
/*     */       //   1273: aload #14
/*     */       //   1275: invokeinterface hasNext : ()Z
/*     */       //   1280: ifeq -> 1334
/*     */       //   1283: aload #14
/*     */       //   1285: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   1290: astore #15
/*     */       //   1292: aload #12
/*     */       //   1294: aload #15
/*     */       //   1296: checkcast kotlin/ranges/IntRange
/*     */       //   1299: astore #16
/*     */       //   1301: astore #19
/*     */       //   1303: iconst_0
/*     */       //   1304: istore #17
/*     */       //   1306: new ai/grazie/nlp/tokenizer/Tokenizer$Token
/*     */       //   1309: dup
/*     */       //   1310: aload #9
/*     */       //   1312: aload #16
/*     */       //   1314: invokestatic substring : (Ljava/lang/CharSequence;Lkotlin/ranges/IntRange;)Ljava/lang/String;
/*     */       //   1317: aload #16
/*     */       //   1319: invokespecial <init> : (Ljava/lang/String;Lkotlin/ranges/IntRange;)V
/*     */       //   1322: aload #19
/*     */       //   1324: swap
/*     */       //   1325: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   1330: pop
/*     */       //   1331: goto -> 1273
/*     */       //   1334: aload #12
/*     */       //   1336: checkcast java/util/List
/*     */       //   1339: nop
/*     */       //   1340: astore #7
/*     */       //   1342: aload_2
/*     */       //   1343: aload #7
/*     */       //   1345: checkcast java/lang/Iterable
/*     */       //   1348: aload_0
/*     */       //   1349: checkcast kotlin/coroutines/Continuation
/*     */       //   1352: aload_0
/*     */       //   1353: aload_2
/*     */       //   1354: putfield L$0 : Ljava/lang/Object;
/*     */       //   1357: aload_0
/*     */       //   1358: aconst_null
/*     */       //   1359: putfield L$1 : Ljava/lang/Object;
/*     */       //   1362: aload_0
/*     */       //   1363: iconst_5
/*     */       //   1364: putfield label : I
/*     */       //   1367: invokevirtual yieldAll : (Ljava/lang/Iterable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   1370: dup
/*     */       //   1371: aload #20
/*     */       //   1373: if_acmpne -> 1392
/*     */       //   1376: aload #20
/*     */       //   1378: areturn
/*     */       //   1379: aload_0
/*     */       //   1380: getfield L$0 : Ljava/lang/Object;
/*     */       //   1383: checkcast kotlin/sequences/SequenceScope
/*     */       //   1386: astore_2
/*     */       //   1387: aload_1
/*     */       //   1388: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   1391: aload_1
/*     */       //   1392: pop
/*     */       //   1393: goto -> 60
/*     */       //   1396: new java/lang/IllegalStateException
/*     */       //   1399: dup
/*     */       //   1400: aload #4
/*     */       //   1402: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   1405: aload_3
/*     */       //   1406: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */       //   1409: <illegal opcode> makeConcatWithConstants : (Lkotlin/ranges/IntRange;Lkotlin/ranges/IntRange;)Ljava/lang/String;
/*     */       //   1414: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   1417: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   1420: athrow
/*     */       //   1421: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   1424: areturn
/*     */       //   1425: new java/lang/IllegalStateException
/*     */       //   1428: dup
/*     */       //   1429: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   1431: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   1434: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #47	-> 3
/*     */       //   #48	-> 60
/*     */       //   #49	-> 70
/*     */       //   #51	-> 81
/*     */       //   #52	-> 91
/*     */       //   #47	-> 121
/*     */       //   #53	-> 137
/*     */       //   #56	-> 141
/*     */       //   #59	-> 153
/*     */       //   #60	-> 168
/*     */       //   #61	-> 192
/*     */       //   #62	-> 199
/*     */       //   #63	-> 207
/*     */       //   #65	-> 210
/*     */       //   #47	-> 240
/*     */       //   #66	-> 256
/*     */       //   #71	-> 260
/*     */       //   #72	-> 284
/*     */       //   #73	-> 308
/*     */       //   #74	-> 311
/*     */       //   #75	-> 335
/*     */       //   #76	-> 342
/*     */       //   #77	-> 345
/*     */       //   #78	-> 369
/*     */       //   #79	-> 396
/*     */       //   #80	-> 423
/*     */       //   #81	-> 431
/*     */       //   #47	-> 479
/*     */       //   #83	-> 504
/*     */       //   #84	-> 513
/*     */       //   #86	-> 538
/*     */       //   #87	-> 545
/*     */       //   #92	-> 548
/*     */       //   #93	-> 566
/*     */       //   #94	-> 598
/*     */       //   #95	-> 605
/*     */       //   #96	-> 632
/*     */       //   #97	-> 640
/*     */       //   #100	-> 665
/*     */       //   #124	-> 696
/*     */       //   #125	-> 715
/*     */       //   #100	-> 753
/*     */       //   #125	-> 758
/*     */       //   #126	-> 774
/*     */       //   #124	-> 779
/*     */       //   #100	-> 785
/*     */       //   #127	-> 794
/*     */       //   #128	-> 820
/*     */       //   #129	-> 848
/*     */       //   #100	-> 862
/*     */       //   #129	-> 881
/*     */       //   #130	-> 890
/*     */       //   #127	-> 895
/*     */       //   #100	-> 896
/*     */       //   #101	-> 898
/*     */       //   #47	-> 932
/*     */       //   #102	-> 948
/*     */       //   #106	-> 952
/*     */       //   #107	-> 1070
/*     */       //   #108	-> 1102
/*     */       //   #109	-> 1109
/*     */       //   #131	-> 1140
/*     */       //   #132	-> 1159
/*     */       //   #109	-> 1197
/*     */       //   #132	-> 1202
/*     */       //   #133	-> 1218
/*     */       //   #131	-> 1223
/*     */       //   #109	-> 1229
/*     */       //   #134	-> 1238
/*     */       //   #135	-> 1264
/*     */       //   #136	-> 1292
/*     */       //   #109	-> 1306
/*     */       //   #136	-> 1325
/*     */       //   #137	-> 1334
/*     */       //   #134	-> 1339
/*     */       //   #109	-> 1340
/*     */       //   #110	-> 1342
/*     */       //   #47	-> 1376
/*     */       //   #111	-> 1392
/*     */       //   #114	-> 1400
/*     */       //   #116	-> 1421
/*     */       //   #47	-> 1425
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   60	64	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*     */       //   132	111	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*     */       //   251	231	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*     */       //   499	49	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*     */       //   548	210	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*     */       //   758	22	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*     */       //   780	155	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*     */       //   943	9	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*     */       //   952	250	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*     */       //   1202	22	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*     */       //   1224	155	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*     */       //   1387	9	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*     */       //   81	34	3	initial	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*     */       //   141	66	3	initial	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*     */       //   210	24	3	initial	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*     */       //   260	48	3	initial	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*     */       //   311	24	3	initial	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*     */       //   345	78	3	initial	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*     */       //   548	84	3	initial	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*     */       //   952	150	3	initial	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*     */       //   1396	25	3	initial	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*     */       //   153	39	4	current	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*     */       //   260	48	4	current	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*     */       //   311	24	4	current	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*     */       //   345	78	4	current	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*     */       //   548	84	4	current	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*     */       //   952	157	4	current	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*     */       //   1396	25	4	current	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*     */       //   396	77	5	left	Lkotlin/ranges/IntRange;
/*     */       //   598	87	5	left	Lkotlin/ranges/IntRange;
/*     */       //   1102	27	5	left	Lkotlin/ranges/IntRange;
/*     */       //   423	59	6	center	Lkotlin/ranges/IntRange;
/*     */       //   491	47	6	center	Lkotlin/ranges/IntRange;
/*     */       //   605	80	6	center	Lkotlin/ranges/IntRange;
/*     */       //   1109	20	6	right	Lkotlin/ranges/IntRange;
/*     */       //   632	33	7	right	Lkotlin/ranges/IntRange;
/*     */       //   1342	28	7	tokens	Ljava/util/List;
/*     */       //   898	28	8	tokens	Ljava/util/List;
/*     */       //   1137	19	8	$this$filterNot$iv	Ljava/lang/Iterable;
/*     */       //   1229	32	8	$this$map$iv	Ljava/lang/Iterable;
/*     */       //   693	19	9	$this$filterNot$iv	Ljava/lang/Iterable;
/*     */       //   785	32	9	$this$map$iv	Ljava/lang/Iterable;
/*     */       //   1156	12	10	$this$filterNotTo$iv$iv	Ljava/lang/Iterable;
/*     */       //   712	12	11	$this$filterNotTo$iv$iv	Ljava/lang/Iterable;
/*     */       //   1156	64	11	destination$iv$iv	Ljava/util/Collection;
/*     */       //   1261	12	11	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */       //   712	64	12	destination$iv$iv	Ljava/util/Collection;
/*     */       //   817	12	12	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */       //   1261	75	12	destination$iv$iv	Ljava/util/Collection;
/*     */       //   817	75	13	destination$iv$iv	Ljava/util/Collection;
/*     */       //   1187	28	14	element$iv$iv	Ljava/lang/Object;
/*     */       //   743	28	15	element$iv$iv	Ljava/lang/Object;
/*     */       //   1194	8	15	it	Lkotlin/ranges/IntRange;
/*     */       //   1292	39	15	item$iv$iv	Ljava/lang/Object;
/*     */       //   750	8	16	it	Lkotlin/ranges/IntRange;
/*     */       //   848	39	16	item$iv$iv	Ljava/lang/Object;
/*     */       //   1303	19	16	it	Lkotlin/ranges/IntRange;
/*     */       //   859	19	17	it	Lkotlin/ranges/IntRange;
/*     */       //   753	5	17	$i$a$-filterNot-Retokenizer$mergeSequences$1$tokens$1	I
/*     */       //   715	61	13	$i$f$filterNotTo	I
/*     */       //   696	84	10	$i$f$filterNot	I
/*     */       //   862	16	18	$i$a$-map-Retokenizer$mergeSequences$1$tokens$2	I
/*     */       //   820	72	14	$i$f$mapTo	I
/*     */       //   794	102	11	$i$f$map	I
/*     */       //   1197	5	16	$i$a$-filterNot-Retokenizer$mergeSequences$1$tokens$3	I
/*     */       //   1159	61	12	$i$f$filterNotTo	I
/*     */       //   1140	84	9	$i$f$filterNot	I
/*     */       //   1306	16	17	$i$a$-map-Retokenizer$mergeSequences$1$tokens$4	I
/*     */       //   1264	72	13	$i$f$mapTo	I
/*     */       //   1238	102	10	$i$f$map	I
/*     */       //   0	1435	0	this	Lai/grazie/nlp/tokenizer/retokenizer/Retokenizer$mergeSequences$1;
/*     */       //   52	1373	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super Retokenizer$mergeSequences$1> $completion) {
/*     */       Retokenizer$mergeSequences$1 retokenizer$mergeSequences$1 = new Retokenizer$mergeSequences$1(this.$initialIterator, this.$retokenizedIterator, this.$text, $completion);
/*     */       retokenizer$mergeSequences$1.L$0 = value;
/*     */       return (Continuation<Unit>)retokenizer$mergeSequences$1;
/*     */     }
/*     */     
/*     */     public final Object invoke(SequenceScope p1, Continuation<?> p2) {
/*     */       return ((Retokenizer$mergeSequences$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected final List<Tokenizer.Token> merge(@NotNull String text, @NotNull List initialTokens, @NotNull List retokenizedTokens) {
/*     */     Intrinsics.checkNotNullParameter(text, "text");
/*     */     Intrinsics.checkNotNullParameter(initialTokens, "initialTokens");
/*     */     Intrinsics.checkNotNullParameter(retokenizedTokens, "retokenizedTokens");
/*     */     return SequencesKt.toList(mergeSequences(text, CollectionsKt.asSequence(initialTokens), CollectionsKt.asSequence(retokenizedTokens)));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\retokenizer\Retokenizer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */