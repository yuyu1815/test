/*    */ package ai.grazie.nlp.tokenizer.retokenizer;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.IndexedValue;
/*    */ import kotlin.ranges.IntRange;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\r\n\002\b\003\030\000 \r2\0020\001:\001\rB\017\b\026\022\006\020\002\032\0020\003¢\006\002\020\004B\r\022\006\020\002\032\0020\005¢\006\002\020\006J$\020\007\032\b\022\004\022\0020\t0\b2\006\020\n\032\0020\0132\f\020\f\032\b\022\004\022\0020\t0\bH\026¨\006\016"}, d2 = {"Lai/grazie/nlp/tokenizer/retokenizer/QuotesRetokenizer;", "Lai/grazie/nlp/tokenizer/sequence/CharSequenceRetokenizer;", "tokenizer", "Lai/grazie/nlp/tokenizer/NonDestructiveTokenizer;", "(Lai/grazie/nlp/tokenizer/NonDestructiveTokenizer;)V", "Lai/grazie/nlp/tokenizer/sequence/NonDestructiveCharSequenceTokenizer;", "(Lai/grazie/nlp/tokenizer/sequence/NonDestructiveCharSequenceTokenizer;)V", "retokenizeAsSequence", "Lkotlin/sequences/Sequence;", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "text", "", "tokens", "Companion", "nlp-tokenizer"})
/*    */ public final class QuotesRetokenizer extends CharSequenceRetokenizer {
/* 10 */   public QuotesRetokenizer(@NotNull NonDestructiveCharSequenceTokenizer tokenizer) { super(tokenizer); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\"\n\002\020\f\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000R\024\020\006\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000¨\006\007"}, d2 = {"Lai/grazie/nlp/tokenizer/retokenizer/QuotesRetokenizer$Companion;", "", "()V", "apostropheSet", "", "", "quotesSet", "nlp-tokenizer"}) public static final class Companion {
/*    */     private Companion() {} } @NotNull
/* 12 */   public static final Companion Companion = new Companion(null); @NotNull private static final Set<Character> apostropheSet = Symbols.INSTANCE.getApostrophes(); @NotNull
/* 13 */   private static final Set<Character> quotesSet = SetsKt.setOf(Character.valueOf('"'));
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020\013\n\000\n\002\030\002\n\002\020\f\n\002\b\002\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\003H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "it", "Lkotlin/collections/IndexedValue;", "", "invoke", "(Lkotlin/collections/IndexedValue;)Ljava/lang/Boolean;"})
/*    */   static final class QuotesRetokenizer$retokenizeAsSequence$1 extends Lambda implements Function1<IndexedValue<? extends Character>, Boolean> {
/*    */     public final Boolean invoke(IndexedValue it) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ldc 'it'
/*    */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   6: invokestatic access$getQuotesSet$cp : ()Ljava/util/Set;
/*    */       //   9: aload_1
/*    */       //   10: invokevirtual getValue : ()Ljava/lang/Object;
/*    */       //   13: invokeinterface contains : (Ljava/lang/Object;)Z
/*    */       //   18: istore_2
/*    */       //   19: invokestatic access$getApostropheSet$cp : ()Ljava/util/Set;
/*    */       //   22: aload_1
/*    */       //   23: invokevirtual getValue : ()Ljava/lang/Object;
/*    */       //   26: invokeinterface contains : (Ljava/lang/Object;)Z
/*    */       //   31: ifeq -> 105
/*    */       //   34: aload_1
/*    */       //   35: invokevirtual getIndex : ()I
/*    */       //   38: aload_0
/*    */       //   39: getfield $text : Ljava/lang/CharSequence;
/*    */       //   42: invokeinterface length : ()I
/*    */       //   47: iconst_1
/*    */       //   48: isub
/*    */       //   49: if_icmpeq -> 101
/*    */       //   52: aload_1
/*    */       //   53: invokevirtual getIndex : ()I
/*    */       //   56: ifeq -> 101
/*    */       //   59: aload_0
/*    */       //   60: getfield $text : Ljava/lang/CharSequence;
/*    */       //   63: aload_1
/*    */       //   64: invokevirtual getIndex : ()I
/*    */       //   67: iconst_1
/*    */       //   68: iadd
/*    */       //   69: invokeinterface charAt : (I)C
/*    */       //   74: invokestatic isLetter : (C)Z
/*    */       //   77: ifeq -> 101
/*    */       //   80: aload_0
/*    */       //   81: getfield $text : Ljava/lang/CharSequence;
/*    */       //   84: aload_1
/*    */       //   85: invokevirtual getIndex : ()I
/*    */       //   88: iconst_1
/*    */       //   89: isub
/*    */       //   90: invokeinterface charAt : (I)C
/*    */       //   95: invokestatic isLetter : (C)Z
/*    */       //   98: ifne -> 105
/*    */       //   101: iconst_1
/*    */       //   102: goto -> 106
/*    */       //   105: iconst_0
/*    */       //   106: istore_3
/*    */       //   107: iload_2
/*    */       //   108: ifne -> 115
/*    */       //   111: iload_3
/*    */       //   112: ifeq -> 119
/*    */       //   115: iconst_1
/*    */       //   116: goto -> 120
/*    */       //   119: iconst_0
/*    */       //   120: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*    */       //   123: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #25	-> 6
/*    */       //   #26	-> 19
/*    */       //   #28	-> 34
/*    */       //   #28	-> 77
/*    */       //   #28	-> 98
/*    */       //   #26	-> 106
/*    */       //   #30	-> 107
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   19	105	2	isQuote	Z
/*    */       //   107	17	3	isApostrophe	Z
/*    */       //   0	124	0	this	Lai/grazie/nlp/tokenizer/retokenizer/QuotesRetokenizer$retokenizeAsSequence$1;
/*    */       //   0	124	1	it	Lkotlin/collections/IndexedValue;
/*    */     } QuotesRetokenizer$retokenizeAsSequence$1(CharSequence $text) {
/*    */       super(1);
/* 20 */     } } public QuotesRetokenizer(@NotNull NonDestructiveTokenizer tokenizer) { this(ExtensionsKt.toInefficientCharSequenceTokenizer(tokenizer)); }
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\f\n\000\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "Lkotlin/ranges/IntRange;", "it", "Lkotlin/collections/IndexedValue;", "", "invoke"}) static final class QuotesRetokenizer$retokenizeAsSequence$2 extends Lambda implements Function1<IndexedValue<? extends Character>, IntRange> {
/*    */     public static final QuotesRetokenizer$retokenizeAsSequence$2 INSTANCE = new QuotesRetokenizer$retokenizeAsSequence$2();
/* 23 */     QuotesRetokenizer$retokenizeAsSequence$2() { super(1); } public final IntRange invoke(IndexedValue it) { Intrinsics.checkNotNullParameter(it, "it"); return new IntRange(it.getIndex(), it.getIndex()); } } @NotNull public Sequence<Tokenizer.Token> retokenizeAsSequence(@NotNull CharSequence text, @NotNull Sequence tokens) { Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(tokens, "tokens"); return 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 33 */       SequencesKt.map(SequencesKt.map(SequencesKt.filter(SequencesKt.withIndex(StringsKt.asSequence(text)), new QuotesRetokenizer$retokenizeAsSequence$1(text)), QuotesRetokenizer$retokenizeAsSequence$2.INSTANCE), new QuotesRetokenizer$retokenizeAsSequence$3(text)); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "it", "Lkotlin/ranges/IntRange;", "invoke"}) static final class QuotesRetokenizer$retokenizeAsSequence$3 extends Lambda implements Function1<IntRange, Tokenizer.Token> { public final Tokenizer.Token invoke(IntRange it) { Intrinsics.checkNotNullParameter(it, "it"); return new Tokenizer.Token(new Text(StringsKt.substring(this.$text, it)), TextRange.Companion.invoke(it)); }
/*    */ 
/*    */     
/*    */     QuotesRetokenizer$retokenizeAsSequence$3(CharSequence $text) {
/*    */       super(1);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\retokenizer\QuotesRetokenizer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */