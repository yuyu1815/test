/*    */ package ai.grazie.nlp.tokenizer.word;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
/*    */ import kotlin.sequences.Sequence;
/*    */ import kotlin.sequences.SequenceScope;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\002\020\f\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\000\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005J\034\020\006\032\b\022\004\022\0020\b0\0072\f\020\t\032\b\022\004\022\0020\b0\007H\002J\026\020\n\032\b\022\004\022\0020\0130\0072\006\020\t\032\0020\013H\002J\034\020\f\032\b\022\004\022\0020\r0\0072\f\020\t\032\b\022\004\022\0020\b0\007H\026R\016\020\004\032\0020\003X\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\016"}, d2 = {"Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;", "Lai/grazie/nlp/tokenizer/sequence/SequenceTokenizer;", "toLowerCase", "", "shouldNormalizeAccentLetters", "(ZZ)V", "cleanText", "Lkotlin/sequences/Sequence;", "", "text", "splitOnPunctuation", "", "tokenizeAsSequence", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "nlp-tokenizer"})
/*    */ public final class BasicWordTokenizer implements SequenceTokenizer {
/*    */   private final boolean toLowerCase;
/*    */   private final boolean shouldNormalizeAccentLetters;
/*    */   
/* 15 */   public BasicWordTokenizer(boolean toLowerCase, boolean shouldNormalizeAccentLetters) { this.toLowerCase = toLowerCase; this.shouldNormalizeAccentLetters = shouldNormalizeAccentLetters; } @NotNull
/* 16 */   public Sequence<Tokenizer.Token> tokenizeAsSequence(@NotNull Sequence<Character> text) { Intrinsics.checkNotNullParameter(text, "text"); return SequencesKt.sequence(new BasicWordTokenizer$tokenizeAsSequence$1(text, null)); }
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
/*    */   private final Sequence<Character> cleanText(Sequence<Character> text) {
/* 35 */     return SequencesKt.sequence(new BasicWordTokenizer$cleanText$1(text, null));
/*    */   } @DebugMetadata(f = "BasicWordTokenizer.kt", l = {31}, i = {0}, s = {"L$0"}, n = {"$this$sequence"}, m = "invokeSuspend", c = "ai.grazie.nlp.tokenizer.word.BasicWordTokenizer$tokenizeAsSequence$1")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;"})
/*    */   static final class BasicWordTokenizer$tokenizeAsSequence$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Tokenizer.Token>, Continuation<? super Unit>, Object> { Object L$1; int label; BasicWordTokenizer$tokenizeAsSequence$1(Sequence<Character> $text, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     } public final Object invokeSuspend(Object $result) {
/*    */       // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore #8
/*    */       //   5: aload_0
/*    */       //   6: getfield label : I
/*    */       //   9: tableswitch default -> 243, 0 -> 32, 1 -> 213
/*    */       //   32: aload_1
/*    */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   36: aload_0
/*    */       //   37: getfield L$0 : Ljava/lang/Object;
/*    */       //   40: checkcast kotlin/sequences/SequenceScope
/*    */       //   43: astore_2
/*    */       //   44: aload_0
/*    */       //   45: getfield this$0 : Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;
/*    */       //   48: aload_0
/*    */       //   49: getfield $text : Lkotlin/sequences/Sequence;
/*    */       //   52: invokestatic access$cleanText : (Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;
/*    */       //   55: astore_3
/*    */       //   56: getstatic ai/grazie/nlp/tokenizer/word/WhitespaceWordTokenizer.INSTANCE : Lai/grazie/nlp/tokenizer/word/WhitespaceWordTokenizer;
/*    */       //   59: aload_3
/*    */       //   60: invokevirtual tokenizeAsSequence : (Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;
/*    */       //   63: astore #4
/*    */       //   65: aload #4
/*    */       //   67: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */       //   72: astore #5
/*    */       //   74: aload #5
/*    */       //   76: invokeinterface hasNext : ()Z
/*    */       //   81: ifeq -> 239
/*    */       //   84: aload #5
/*    */       //   86: invokeinterface next : ()Ljava/lang/Object;
/*    */       //   91: checkcast ai/grazie/nlp/tokenizer/Tokenizer$Token
/*    */       //   94: astore #6
/*    */       //   96: aload #6
/*    */       //   98: invokevirtual getToken : ()Ljava/lang/String;
/*    */       //   101: astore #7
/*    */       //   103: aload_0
/*    */       //   104: getfield this$0 : Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;
/*    */       //   107: invokestatic access$getToLowerCase$p : (Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;)Z
/*    */       //   110: ifeq -> 149
/*    */       //   113: aload #7
/*    */       //   115: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*    */       //   118: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */       //   121: dup
/*    */       //   122: ldc 'toLowerCase(...)'
/*    */       //   124: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   127: astore #7
/*    */       //   129: aload_0
/*    */       //   130: getfield this$0 : Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;
/*    */       //   133: invokestatic access$getShouldNormalizeAccentLetters$p : (Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;)Z
/*    */       //   136: ifeq -> 166
/*    */       //   139: aload #7
/*    */       //   141: invokestatic normalizeAccents : (Ljava/lang/String;)Ljava/lang/String;
/*    */       //   144: astore #7
/*    */       //   146: goto -> 166
/*    */       //   149: aload_0
/*    */       //   150: getfield this$0 : Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;
/*    */       //   153: invokestatic access$getShouldNormalizeAccentLetters$p : (Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;)Z
/*    */       //   156: ifeq -> 166
/*    */       //   159: aload #7
/*    */       //   161: invokestatic normalizeAccents : (Ljava/lang/String;)Ljava/lang/String;
/*    */       //   164: astore #7
/*    */       //   166: aload_2
/*    */       //   167: aload #6
/*    */       //   169: aload_0
/*    */       //   170: getfield this$0 : Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;
/*    */       //   173: aload #7
/*    */       //   175: invokestatic access$splitOnPunctuation : (Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;Ljava/lang/String;)Lkotlin/sequences/Sequence;
/*    */       //   178: invokestatic splitToken : (Lai/grazie/nlp/tokenizer/Tokenizer$Token;Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;
/*    */       //   181: aload_0
/*    */       //   182: checkcast kotlin/coroutines/Continuation
/*    */       //   185: aload_0
/*    */       //   186: aload_2
/*    */       //   187: putfield L$0 : Ljava/lang/Object;
/*    */       //   190: aload_0
/*    */       //   191: aload #5
/*    */       //   193: putfield L$1 : Ljava/lang/Object;
/*    */       //   196: aload_0
/*    */       //   197: iconst_1
/*    */       //   198: putfield label : I
/*    */       //   201: invokevirtual yieldAll : (Lkotlin/sequences/Sequence;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   204: dup
/*    */       //   205: aload #8
/*    */       //   207: if_acmpne -> 235
/*    */       //   210: aload #8
/*    */       //   212: areturn
/*    */       //   213: aload_0
/*    */       //   214: getfield L$1 : Ljava/lang/Object;
/*    */       //   217: checkcast java/util/Iterator
/*    */       //   220: astore #5
/*    */       //   222: aload_0
/*    */       //   223: getfield L$0 : Ljava/lang/Object;
/*    */       //   226: checkcast kotlin/sequences/SequenceScope
/*    */       //   229: astore_2
/*    */       //   230: aload_1
/*    */       //   231: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   234: aload_1
/*    */       //   235: pop
/*    */       //   236: goto -> 74
/*    */       //   239: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */       //   242: areturn
/*    */       //   243: new java/lang/IllegalStateException
/*    */       //   246: dup
/*    */       //   247: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   249: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   252: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #16	-> 3
/*    */       //   #17	-> 44
/*    */       //   #18	-> 56
/*    */       //   #20	-> 65
/*    */       //   #21	-> 96
/*    */       //   #22	-> 103
/*    */       //   #23	-> 113
/*    */       //   #23	-> 127
/*    */       //   #24	-> 129
/*    */       //   #25	-> 139
/*    */       //   #27	-> 149
/*    */       //   #28	-> 159
/*    */       //   #31	-> 166
/*    */       //   #16	-> 210
/*    */       //   #31	-> 235
/*    */       //   #33	-> 239
/*    */       //   #16	-> 243
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   44	83	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*    */       //   127	86	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*    */       //   230	13	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*    */       //   56	9	3	mText	Lkotlin/sequences/Sequence;
/*    */       //   65	9	4	origTokens	Lkotlin/sequences/Sequence;
/*    */       //   96	31	6	token	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*    */       //   127	77	6	token	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*    */       //   103	24	7	mToken	Ljava/lang/String;
/*    */       //   129	17	7	mToken	Ljava/lang/String;
/*    */       //   146	20	7	mToken	Ljava/lang/String;
/*    */       //   166	38	7	mToken	Ljava/lang/String;
/*    */       //   0	253	0	this	Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer$tokenizeAsSequence$1;
/*    */       //   36	207	1	$result	Ljava/lang/Object;
/*    */     } public final Continuation<Unit> create(Object value, Continuation<? super BasicWordTokenizer$tokenizeAsSequence$1> $completion) {
/*    */       BasicWordTokenizer$tokenizeAsSequence$1 basicWordTokenizer$tokenizeAsSequence$1 = new BasicWordTokenizer$tokenizeAsSequence$1(this.$text, $completion);
/*    */       basicWordTokenizer$tokenizeAsSequence$1.L$0 = value;
/*    */       return (Continuation<Unit>)basicWordTokenizer$tokenizeAsSequence$1;
/*    */     } public final Object invoke(SequenceScope p1, Continuation<?> p2) {
/*    */       return ((BasicWordTokenizer$tokenizeAsSequence$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     } } private final Sequence<String> splitOnPunctuation(String text) {
/* 49 */     return SequencesKt.sequence(new BasicWordTokenizer$splitOnPunctuation$1(text, null));
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "BasicWordTokenizer.kt", l = {42, 44}, i = {0, 1}, s = {"L$0", "L$0"}, n = {"$this$sequence", "$this$sequence"}, m = "invokeSuspend", c = "ai.grazie.nlp.tokenizer.word.BasicWordTokenizer$cleanText$1")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\020\f\020\000\032\0020\001*\b\022\004\022\0020\0030\002H@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""})
/*    */   static final class BasicWordTokenizer$cleanText$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Character>, Continuation<? super Unit>, Object> {
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     BasicWordTokenizer$cleanText$1(Sequence<Character> $text, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore #6
/*    */       //   5: aload_0
/*    */       //   6: getfield label : I
/*    */       //   9: tableswitch default -> 250, 0 -> 36, 1 -> 158, 2 -> 221
/*    */       //   36: aload_1
/*    */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   40: aload_0
/*    */       //   41: getfield L$0 : Ljava/lang/Object;
/*    */       //   44: checkcast kotlin/sequences/SequenceScope
/*    */       //   47: astore_2
/*    */       //   48: aload_0
/*    */       //   49: getfield $text : Lkotlin/sequences/Sequence;
/*    */       //   52: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */       //   57: astore_3
/*    */       //   58: aload_3
/*    */       //   59: invokeinterface hasNext : ()Z
/*    */       //   64: ifeq -> 246
/*    */       //   67: aload_3
/*    */       //   68: invokeinterface next : ()Ljava/lang/Object;
/*    */       //   73: checkcast java/lang/Character
/*    */       //   76: invokevirtual charValue : ()C
/*    */       //   79: istore #4
/*    */       //   81: iload #4
/*    */       //   83: istore #5
/*    */       //   85: iload #5
/*    */       //   87: ifeq -> 109
/*    */       //   90: iload #5
/*    */       //   92: ldc 65533
/*    */       //   94: if_icmpeq -> 109
/*    */       //   97: getstatic ai/grazie/nlp/utils/CharUtils.INSTANCE : Lai/grazie/nlp/utils/CharUtils;
/*    */       //   100: iload #4
/*    */       //   102: i2c
/*    */       //   103: invokevirtual isControl : (C)Z
/*    */       //   106: ifeq -> 112
/*    */       //   109: goto -> 58
/*    */       //   112: iload #4
/*    */       //   114: i2c
/*    */       //   115: invokestatic isWhitespace : (C)Z
/*    */       //   118: ifeq -> 183
/*    */       //   121: aload_2
/*    */       //   122: bipush #32
/*    */       //   124: invokestatic boxChar : (C)Ljava/lang/Character;
/*    */       //   127: aload_0
/*    */       //   128: checkcast kotlin/coroutines/Continuation
/*    */       //   131: aload_0
/*    */       //   132: aload_2
/*    */       //   133: putfield L$0 : Ljava/lang/Object;
/*    */       //   136: aload_0
/*    */       //   137: aload_3
/*    */       //   138: putfield L$1 : Ljava/lang/Object;
/*    */       //   141: aload_0
/*    */       //   142: iconst_1
/*    */       //   143: putfield label : I
/*    */       //   146: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   149: dup
/*    */       //   150: aload #6
/*    */       //   152: if_acmpne -> 179
/*    */       //   155: aload #6
/*    */       //   157: areturn
/*    */       //   158: aload_0
/*    */       //   159: getfield L$1 : Ljava/lang/Object;
/*    */       //   162: checkcast java/util/Iterator
/*    */       //   165: astore_3
/*    */       //   166: aload_0
/*    */       //   167: getfield L$0 : Ljava/lang/Object;
/*    */       //   170: checkcast kotlin/sequences/SequenceScope
/*    */       //   173: astore_2
/*    */       //   174: aload_1
/*    */       //   175: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   178: aload_1
/*    */       //   179: pop
/*    */       //   180: goto -> 58
/*    */       //   183: aload_2
/*    */       //   184: iload #4
/*    */       //   186: i2c
/*    */       //   187: invokestatic boxChar : (C)Ljava/lang/Character;
/*    */       //   190: aload_0
/*    */       //   191: checkcast kotlin/coroutines/Continuation
/*    */       //   194: aload_0
/*    */       //   195: aload_2
/*    */       //   196: putfield L$0 : Ljava/lang/Object;
/*    */       //   199: aload_0
/*    */       //   200: aload_3
/*    */       //   201: putfield L$1 : Ljava/lang/Object;
/*    */       //   204: aload_0
/*    */       //   205: iconst_2
/*    */       //   206: putfield label : I
/*    */       //   209: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   212: dup
/*    */       //   213: aload #6
/*    */       //   215: if_acmpne -> 242
/*    */       //   218: aload #6
/*    */       //   220: areturn
/*    */       //   221: aload_0
/*    */       //   222: getfield L$1 : Ljava/lang/Object;
/*    */       //   225: checkcast java/util/Iterator
/*    */       //   228: astore_3
/*    */       //   229: aload_0
/*    */       //   230: getfield L$0 : Ljava/lang/Object;
/*    */       //   233: checkcast kotlin/sequences/SequenceScope
/*    */       //   236: astore_2
/*    */       //   237: aload_1
/*    */       //   238: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   241: aload_1
/*    */       //   242: pop
/*    */       //   243: goto -> 58
/*    */       //   246: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */       //   249: areturn
/*    */       //   250: new java/lang/IllegalStateException
/*    */       //   253: dup
/*    */       //   254: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   256: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   259: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #35	-> 3
/*    */       //   #36	-> 48
/*    */       //   #37	-> 81
/*    */       //   #37	-> 83
/*    */       //   #38	-> 85
/*    */       //   #39	-> 109
/*    */       //   #41	-> 112
/*    */       //   #42	-> 121
/*    */       //   #35	-> 155
/*    */       //   #42	-> 179
/*    */       //   #44	-> 183
/*    */       //   #35	-> 218
/*    */       //   #44	-> 242
/*    */       //   #47	-> 246
/*    */       //   #35	-> 250
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   48	35	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*    */       //   83	75	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*    */       //   174	47	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*    */       //   237	13	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*    */       //   81	2	4	char	C
/*    */       //   83	26	4	char	C
/*    */       //   112	9	4	char	C
/*    */       //   183	29	4	char	C
/*    */       //   85	24	5	cp	I
/*    */       //   0	260	0	this	Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer$cleanText$1;
/*    */       //   40	210	1	$result	Ljava/lang/Object;
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super BasicWordTokenizer$cleanText$1> $completion) {
/*    */       BasicWordTokenizer$cleanText$1 basicWordTokenizer$cleanText$1 = new BasicWordTokenizer$cleanText$1(this.$text, $completion);
/*    */       basicWordTokenizer$cleanText$1.L$0 = value;
/*    */       return (Continuation<Unit>)basicWordTokenizer$cleanText$1;
/*    */     }
/*    */     
/*    */     public final Object invoke(SequenceScope p1, Continuation<?> p2) {
/*    */       return ((BasicWordTokenizer$cleanText$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "BasicWordTokenizer.kt", l = {54, 57, 63}, i = {0, 0, 0, 1, 1}, s = {"L$0", "L$1", "C$0", "L$0", "L$1"}, n = {"$this$sequence", "builder", "char", "$this$sequence", "builder"}, m = "invokeSuspend", c = "ai.grazie.nlp.tokenizer.word.BasicWordTokenizer$splitOnPunctuation$1")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\020\016\020\000\032\0020\001*\b\022\004\022\0020\0030\002H@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""})
/*    */   static final class BasicWordTokenizer$splitOnPunctuation$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super String>, Continuation<? super Unit>, Object> {
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int I$0;
/*    */     int I$1;
/*    */     char C$0;
/*    */     int label;
/*    */     
/*    */     BasicWordTokenizer$splitOnPunctuation$1(String $text, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore #8
/*    */       //   5: aload_0
/*    */       //   6: getfield label : I
/*    */       //   9: tableswitch default -> 442, 0 -> 40, 1 -> 190, 2 -> 300, 3 -> 432
/*    */       //   40: aload_1
/*    */       //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   44: aload_0
/*    */       //   45: getfield L$0 : Ljava/lang/Object;
/*    */       //   48: checkcast kotlin/sequences/SequenceScope
/*    */       //   51: astore_2
/*    */       //   52: new java/lang/StringBuilder
/*    */       //   55: dup
/*    */       //   56: invokespecial <init> : ()V
/*    */       //   59: astore_3
/*    */       //   60: aload_0
/*    */       //   61: getfield $text : Ljava/lang/String;
/*    */       //   64: astore #4
/*    */       //   66: iconst_0
/*    */       //   67: istore #5
/*    */       //   69: aload #4
/*    */       //   71: invokevirtual length : ()I
/*    */       //   74: istore #6
/*    */       //   76: iload #5
/*    */       //   78: iload #6
/*    */       //   80: if_icmpge -> 360
/*    */       //   83: aload #4
/*    */       //   85: iload #5
/*    */       //   87: invokevirtual charAt : (I)C
/*    */       //   90: istore #7
/*    */       //   92: getstatic ai/grazie/nlp/utils/CharUtils.INSTANCE : Lai/grazie/nlp/utils/CharUtils;
/*    */       //   95: iload #7
/*    */       //   97: i2c
/*    */       //   98: invokevirtual isPunctuation : (C)Z
/*    */       //   101: ifeq -> 346
/*    */       //   104: aload_3
/*    */       //   105: checkcast java/lang/CharSequence
/*    */       //   108: invokeinterface length : ()I
/*    */       //   113: ifle -> 120
/*    */       //   116: iconst_1
/*    */       //   117: goto -> 121
/*    */       //   120: iconst_0
/*    */       //   121: ifeq -> 244
/*    */       //   124: aload_2
/*    */       //   125: aload_3
/*    */       //   126: invokevirtual toString : ()Ljava/lang/String;
/*    */       //   129: dup
/*    */       //   130: ldc 'builder.toString()'
/*    */       //   132: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   135: aload_0
/*    */       //   136: checkcast kotlin/coroutines/Continuation
/*    */       //   139: aload_0
/*    */       //   140: aload_2
/*    */       //   141: putfield L$0 : Ljava/lang/Object;
/*    */       //   144: aload_0
/*    */       //   145: aload_3
/*    */       //   146: putfield L$1 : Ljava/lang/Object;
/*    */       //   149: aload_0
/*    */       //   150: aload #4
/*    */       //   152: putfield L$2 : Ljava/lang/Object;
/*    */       //   155: aload_0
/*    */       //   156: iload #5
/*    */       //   158: putfield I$0 : I
/*    */       //   161: aload_0
/*    */       //   162: iload #6
/*    */       //   164: putfield I$1 : I
/*    */       //   167: aload_0
/*    */       //   168: iload #7
/*    */       //   170: putfield C$0 : C
/*    */       //   173: aload_0
/*    */       //   174: iconst_1
/*    */       //   175: putfield label : I
/*    */       //   178: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   181: dup
/*    */       //   182: aload #8
/*    */       //   184: if_acmpne -> 238
/*    */       //   187: aload #8
/*    */       //   189: areturn
/*    */       //   190: aload_0
/*    */       //   191: getfield C$0 : C
/*    */       //   194: istore #7
/*    */       //   196: aload_0
/*    */       //   197: getfield I$1 : I
/*    */       //   200: istore #6
/*    */       //   202: aload_0
/*    */       //   203: getfield I$0 : I
/*    */       //   206: istore #5
/*    */       //   208: aload_0
/*    */       //   209: getfield L$2 : Ljava/lang/Object;
/*    */       //   212: checkcast java/lang/String
/*    */       //   215: astore #4
/*    */       //   217: aload_0
/*    */       //   218: getfield L$1 : Ljava/lang/Object;
/*    */       //   221: checkcast java/lang/StringBuilder
/*    */       //   224: astore_3
/*    */       //   225: aload_0
/*    */       //   226: getfield L$0 : Ljava/lang/Object;
/*    */       //   229: checkcast kotlin/sequences/SequenceScope
/*    */       //   232: astore_2
/*    */       //   233: aload_1
/*    */       //   234: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   237: aload_1
/*    */       //   238: pop
/*    */       //   239: aload_3
/*    */       //   240: invokestatic clear : (Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
/*    */       //   243: pop
/*    */       //   244: aload_2
/*    */       //   245: iload #7
/*    */       //   247: i2c
/*    */       //   248: invokestatic valueOf : (C)Ljava/lang/String;
/*    */       //   251: aload_0
/*    */       //   252: checkcast kotlin/coroutines/Continuation
/*    */       //   255: aload_0
/*    */       //   256: aload_2
/*    */       //   257: putfield L$0 : Ljava/lang/Object;
/*    */       //   260: aload_0
/*    */       //   261: aload_3
/*    */       //   262: putfield L$1 : Ljava/lang/Object;
/*    */       //   265: aload_0
/*    */       //   266: aload #4
/*    */       //   268: putfield L$2 : Ljava/lang/Object;
/*    */       //   271: aload_0
/*    */       //   272: iload #5
/*    */       //   274: putfield I$0 : I
/*    */       //   277: aload_0
/*    */       //   278: iload #6
/*    */       //   280: putfield I$1 : I
/*    */       //   283: aload_0
/*    */       //   284: iconst_2
/*    */       //   285: putfield label : I
/*    */       //   288: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   291: dup
/*    */       //   292: aload #8
/*    */       //   294: if_acmpne -> 342
/*    */       //   297: aload #8
/*    */       //   299: areturn
/*    */       //   300: aload_0
/*    */       //   301: getfield I$1 : I
/*    */       //   304: istore #6
/*    */       //   306: aload_0
/*    */       //   307: getfield I$0 : I
/*    */       //   310: istore #5
/*    */       //   312: aload_0
/*    */       //   313: getfield L$2 : Ljava/lang/Object;
/*    */       //   316: checkcast java/lang/String
/*    */       //   319: astore #4
/*    */       //   321: aload_0
/*    */       //   322: getfield L$1 : Ljava/lang/Object;
/*    */       //   325: checkcast java/lang/StringBuilder
/*    */       //   328: astore_3
/*    */       //   329: aload_0
/*    */       //   330: getfield L$0 : Ljava/lang/Object;
/*    */       //   333: checkcast kotlin/sequences/SequenceScope
/*    */       //   336: astore_2
/*    */       //   337: aload_1
/*    */       //   338: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   341: aload_1
/*    */       //   342: pop
/*    */       //   343: goto -> 354
/*    */       //   346: aload_3
/*    */       //   347: iload #7
/*    */       //   349: i2c
/*    */       //   350: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */       //   353: pop
/*    */       //   354: iinc #5, 1
/*    */       //   357: goto -> 76
/*    */       //   360: aload_3
/*    */       //   361: checkcast java/lang/CharSequence
/*    */       //   364: invokeinterface length : ()I
/*    */       //   369: ifle -> 376
/*    */       //   372: iconst_1
/*    */       //   373: goto -> 377
/*    */       //   376: iconst_0
/*    */       //   377: ifeq -> 438
/*    */       //   380: aload_2
/*    */       //   381: aload_3
/*    */       //   382: invokevirtual toString : ()Ljava/lang/String;
/*    */       //   385: astore #4
/*    */       //   387: aload #4
/*    */       //   389: ldc 'builder.toString()'
/*    */       //   391: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   394: aload #4
/*    */       //   396: aload_0
/*    */       //   397: checkcast kotlin/coroutines/Continuation
/*    */       //   400: aload_0
/*    */       //   401: aconst_null
/*    */       //   402: putfield L$0 : Ljava/lang/Object;
/*    */       //   405: aload_0
/*    */       //   406: aconst_null
/*    */       //   407: putfield L$1 : Ljava/lang/Object;
/*    */       //   410: aload_0
/*    */       //   411: aconst_null
/*    */       //   412: putfield L$2 : Ljava/lang/Object;
/*    */       //   415: aload_0
/*    */       //   416: iconst_3
/*    */       //   417: putfield label : I
/*    */       //   420: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   423: dup
/*    */       //   424: aload #8
/*    */       //   426: if_acmpne -> 437
/*    */       //   429: aload #8
/*    */       //   431: areturn
/*    */       //   432: aload_1
/*    */       //   433: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   436: aload_1
/*    */       //   437: pop
/*    */       //   438: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */       //   441: areturn
/*    */       //   442: new java/lang/IllegalStateException
/*    */       //   445: dup
/*    */       //   446: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   448: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   451: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #49	-> 3
/*    */       //   #50	-> 52
/*    */       //   #51	-> 60
/*    */       //   #52	-> 92
/*    */       //   #53	-> 104
/*    */       //   #53	-> 121
/*    */       //   #54	-> 124
/*    */       //   #49	-> 187
/*    */       //   #55	-> 238
/*    */       //   #57	-> 244
/*    */       //   #49	-> 297
/*    */       //   #57	-> 342
/*    */       //   #59	-> 346
/*    */       //   #51	-> 354
/*    */       //   #62	-> 360
/*    */       //   #62	-> 377
/*    */       //   #63	-> 380
/*    */       //   #49	-> 429
/*    */       //   #65	-> 437
/*    */       //   #49	-> 442
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   52	31	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*    */       //   83	107	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*    */       //   233	67	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*    */       //   337	40	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*    */       //   377	10	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*    */       //   60	23	3	builder	Ljava/lang/StringBuilder;
/*    */       //   83	107	3	builder	Ljava/lang/StringBuilder;
/*    */       //   225	75	3	builder	Ljava/lang/StringBuilder;
/*    */       //   329	48	3	builder	Ljava/lang/StringBuilder;
/*    */       //   377	10	3	builder	Ljava/lang/StringBuilder;
/*    */       //   92	98	7	char	C
/*    */       //   196	95	7	char	C
/*    */       //   346	8	7	char	C
/*    */       //   0	452	0	this	Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer$splitOnPunctuation$1;
/*    */       //   44	398	1	$result	Ljava/lang/Object;
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super BasicWordTokenizer$splitOnPunctuation$1> $completion) {
/*    */       BasicWordTokenizer$splitOnPunctuation$1 basicWordTokenizer$splitOnPunctuation$1 = new BasicWordTokenizer$splitOnPunctuation$1(this.$text, $completion);
/*    */       basicWordTokenizer$splitOnPunctuation$1.L$0 = value;
/*    */       return (Continuation<Unit>)basicWordTokenizer$splitOnPunctuation$1;
/*    */     }
/*    */     
/*    */     public final Object invoke(SequenceScope p1, Continuation<?> p2) {
/*    */       return ((BasicWordTokenizer$splitOnPunctuation$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\word\BasicWordTokenizer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */