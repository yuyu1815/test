package ai.grazie.nlp.tokenizer.word;

import ai.grazie.nlp.tokenizer.Tokenizer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;

@DebugMetadata(f = "BasicWordTokenizer.kt", l = {31}, i = {0}, s = {"L$0"}, n = {"$this$sequence"}, m = "invokeSuspend", c = "ai.grazie.nlp.tokenizer.word.BasicWordTokenizer$tokenizeAsSequence$1")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;"})
final class BasicWordTokenizer$tokenizeAsSequence$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Tokenizer.Token>, Continuation<? super Unit>, Object> {
  Object L$1;
  
  int label;
  
  BasicWordTokenizer$tokenizeAsSequence$1(Sequence<Character> $text, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #8
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 243, 0 -> 32, 1 -> 213
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: aload_0
    //   37: getfield L$0 : Ljava/lang/Object;
    //   40: checkcast kotlin/sequences/SequenceScope
    //   43: astore_2
    //   44: aload_0
    //   45: getfield this$0 : Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;
    //   48: aload_0
    //   49: getfield $text : Lkotlin/sequences/Sequence;
    //   52: invokestatic access$cleanText : (Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;
    //   55: astore_3
    //   56: getstatic ai/grazie/nlp/tokenizer/word/WhitespaceWordTokenizer.INSTANCE : Lai/grazie/nlp/tokenizer/word/WhitespaceWordTokenizer;
    //   59: aload_3
    //   60: invokevirtual tokenizeAsSequence : (Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;
    //   63: astore #4
    //   65: aload #4
    //   67: invokeinterface iterator : ()Ljava/util/Iterator;
    //   72: astore #5
    //   74: aload #5
    //   76: invokeinterface hasNext : ()Z
    //   81: ifeq -> 239
    //   84: aload #5
    //   86: invokeinterface next : ()Ljava/lang/Object;
    //   91: checkcast ai/grazie/nlp/tokenizer/Tokenizer$Token
    //   94: astore #6
    //   96: aload #6
    //   98: invokevirtual getToken : ()Ljava/lang/String;
    //   101: astore #7
    //   103: aload_0
    //   104: getfield this$0 : Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;
    //   107: invokestatic access$getToLowerCase$p : (Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;)Z
    //   110: ifeq -> 149
    //   113: aload #7
    //   115: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
    //   118: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   121: dup
    //   122: ldc 'toLowerCase(...)'
    //   124: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   127: astore #7
    //   129: aload_0
    //   130: getfield this$0 : Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;
    //   133: invokestatic access$getShouldNormalizeAccentLetters$p : (Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;)Z
    //   136: ifeq -> 166
    //   139: aload #7
    //   141: invokestatic normalizeAccents : (Ljava/lang/String;)Ljava/lang/String;
    //   144: astore #7
    //   146: goto -> 166
    //   149: aload_0
    //   150: getfield this$0 : Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;
    //   153: invokestatic access$getShouldNormalizeAccentLetters$p : (Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;)Z
    //   156: ifeq -> 166
    //   159: aload #7
    //   161: invokestatic normalizeAccents : (Ljava/lang/String;)Ljava/lang/String;
    //   164: astore #7
    //   166: aload_2
    //   167: aload #6
    //   169: aload_0
    //   170: getfield this$0 : Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;
    //   173: aload #7
    //   175: invokestatic access$splitOnPunctuation : (Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;Ljava/lang/String;)Lkotlin/sequences/Sequence;
    //   178: invokestatic splitToken : (Lai/grazie/nlp/tokenizer/Tokenizer$Token;Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;
    //   181: aload_0
    //   182: checkcast kotlin/coroutines/Continuation
    //   185: aload_0
    //   186: aload_2
    //   187: putfield L$0 : Ljava/lang/Object;
    //   190: aload_0
    //   191: aload #5
    //   193: putfield L$1 : Ljava/lang/Object;
    //   196: aload_0
    //   197: iconst_1
    //   198: putfield label : I
    //   201: invokevirtual yieldAll : (Lkotlin/sequences/Sequence;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   204: dup
    //   205: aload #8
    //   207: if_acmpne -> 235
    //   210: aload #8
    //   212: areturn
    //   213: aload_0
    //   214: getfield L$1 : Ljava/lang/Object;
    //   217: checkcast java/util/Iterator
    //   220: astore #5
    //   222: aload_0
    //   223: getfield L$0 : Ljava/lang/Object;
    //   226: checkcast kotlin/sequences/SequenceScope
    //   229: astore_2
    //   230: aload_1
    //   231: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   234: aload_1
    //   235: pop
    //   236: goto -> 74
    //   239: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   242: areturn
    //   243: new java/lang/IllegalStateException
    //   246: dup
    //   247: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   249: invokespecial <init> : (Ljava/lang/String;)V
    //   252: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #16	-> 3
    //   #17	-> 44
    //   #18	-> 56
    //   #20	-> 65
    //   #21	-> 96
    //   #22	-> 103
    //   #23	-> 113
    //   #23	-> 127
    //   #24	-> 129
    //   #25	-> 139
    //   #27	-> 149
    //   #28	-> 159
    //   #31	-> 166
    //   #16	-> 210
    //   #31	-> 235
    //   #33	-> 239
    //   #16	-> 243
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   44	83	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   127	86	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   230	13	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   56	9	3	mText	Lkotlin/sequences/Sequence;
    //   65	9	4	origTokens	Lkotlin/sequences/Sequence;
    //   96	31	6	token	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
    //   127	77	6	token	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
    //   103	24	7	mToken	Ljava/lang/String;
    //   129	17	7	mToken	Ljava/lang/String;
    //   146	20	7	mToken	Ljava/lang/String;
    //   166	38	7	mToken	Ljava/lang/String;
    //   0	253	0	this	Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer$tokenizeAsSequence$1;
    //   36	207	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super BasicWordTokenizer$tokenizeAsSequence$1> $completion) {
    BasicWordTokenizer$tokenizeAsSequence$1 basicWordTokenizer$tokenizeAsSequence$1 = new BasicWordTokenizer$tokenizeAsSequence$1(this.$text, $completion);
    basicWordTokenizer$tokenizeAsSequence$1.L$0 = value;
    return (Continuation<Unit>)basicWordTokenizer$tokenizeAsSequence$1;
  }
  
  public final Object invoke(SequenceScope p1, Continuation<?> p2) {
    return ((BasicWordTokenizer$tokenizeAsSequence$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\word\BasicWordTokenizer$tokenizeAsSequence$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */