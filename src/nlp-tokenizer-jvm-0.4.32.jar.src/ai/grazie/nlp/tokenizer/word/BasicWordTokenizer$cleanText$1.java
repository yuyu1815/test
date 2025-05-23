package ai.grazie.nlp.tokenizer.word;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;

@DebugMetadata(f = "BasicWordTokenizer.kt", l = {42, 44}, i = {0, 1}, s = {"L$0", "L$0"}, n = {"$this$sequence", "$this$sequence"}, m = "invokeSuspend", c = "ai.grazie.nlp.tokenizer.word.BasicWordTokenizer$cleanText$1")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\020\f\020\000\032\0020\001*\b\022\004\022\0020\0030\002H@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""})
final class BasicWordTokenizer$cleanText$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Character>, Continuation<? super Unit>, Object> {
  Object L$1;
  
  int label;
  
  BasicWordTokenizer$cleanText$1(Sequence<Character> $text, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #6
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 250, 0 -> 36, 1 -> 158, 2 -> 221
    //   36: aload_1
    //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   40: aload_0
    //   41: getfield L$0 : Ljava/lang/Object;
    //   44: checkcast kotlin/sequences/SequenceScope
    //   47: astore_2
    //   48: aload_0
    //   49: getfield $text : Lkotlin/sequences/Sequence;
    //   52: invokeinterface iterator : ()Ljava/util/Iterator;
    //   57: astore_3
    //   58: aload_3
    //   59: invokeinterface hasNext : ()Z
    //   64: ifeq -> 246
    //   67: aload_3
    //   68: invokeinterface next : ()Ljava/lang/Object;
    //   73: checkcast java/lang/Character
    //   76: invokevirtual charValue : ()C
    //   79: istore #4
    //   81: iload #4
    //   83: istore #5
    //   85: iload #5
    //   87: ifeq -> 109
    //   90: iload #5
    //   92: ldc 65533
    //   94: if_icmpeq -> 109
    //   97: getstatic ai/grazie/nlp/utils/CharUtils.INSTANCE : Lai/grazie/nlp/utils/CharUtils;
    //   100: iload #4
    //   102: i2c
    //   103: invokevirtual isControl : (C)Z
    //   106: ifeq -> 112
    //   109: goto -> 58
    //   112: iload #4
    //   114: i2c
    //   115: invokestatic isWhitespace : (C)Z
    //   118: ifeq -> 183
    //   121: aload_2
    //   122: bipush #32
    //   124: invokestatic boxChar : (C)Ljava/lang/Character;
    //   127: aload_0
    //   128: checkcast kotlin/coroutines/Continuation
    //   131: aload_0
    //   132: aload_2
    //   133: putfield L$0 : Ljava/lang/Object;
    //   136: aload_0
    //   137: aload_3
    //   138: putfield L$1 : Ljava/lang/Object;
    //   141: aload_0
    //   142: iconst_1
    //   143: putfield label : I
    //   146: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   149: dup
    //   150: aload #6
    //   152: if_acmpne -> 179
    //   155: aload #6
    //   157: areturn
    //   158: aload_0
    //   159: getfield L$1 : Ljava/lang/Object;
    //   162: checkcast java/util/Iterator
    //   165: astore_3
    //   166: aload_0
    //   167: getfield L$0 : Ljava/lang/Object;
    //   170: checkcast kotlin/sequences/SequenceScope
    //   173: astore_2
    //   174: aload_1
    //   175: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   178: aload_1
    //   179: pop
    //   180: goto -> 58
    //   183: aload_2
    //   184: iload #4
    //   186: i2c
    //   187: invokestatic boxChar : (C)Ljava/lang/Character;
    //   190: aload_0
    //   191: checkcast kotlin/coroutines/Continuation
    //   194: aload_0
    //   195: aload_2
    //   196: putfield L$0 : Ljava/lang/Object;
    //   199: aload_0
    //   200: aload_3
    //   201: putfield L$1 : Ljava/lang/Object;
    //   204: aload_0
    //   205: iconst_2
    //   206: putfield label : I
    //   209: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   212: dup
    //   213: aload #6
    //   215: if_acmpne -> 242
    //   218: aload #6
    //   220: areturn
    //   221: aload_0
    //   222: getfield L$1 : Ljava/lang/Object;
    //   225: checkcast java/util/Iterator
    //   228: astore_3
    //   229: aload_0
    //   230: getfield L$0 : Ljava/lang/Object;
    //   233: checkcast kotlin/sequences/SequenceScope
    //   236: astore_2
    //   237: aload_1
    //   238: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   241: aload_1
    //   242: pop
    //   243: goto -> 58
    //   246: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   249: areturn
    //   250: new java/lang/IllegalStateException
    //   253: dup
    //   254: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   256: invokespecial <init> : (Ljava/lang/String;)V
    //   259: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #35	-> 3
    //   #36	-> 48
    //   #37	-> 81
    //   #37	-> 83
    //   #38	-> 85
    //   #39	-> 109
    //   #41	-> 112
    //   #42	-> 121
    //   #35	-> 155
    //   #42	-> 179
    //   #44	-> 183
    //   #35	-> 218
    //   #44	-> 242
    //   #47	-> 246
    //   #35	-> 250
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   48	35	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   83	75	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   174	47	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   237	13	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   81	2	4	char	C
    //   83	26	4	char	C
    //   112	9	4	char	C
    //   183	29	4	char	C
    //   85	24	5	cp	I
    //   0	260	0	this	Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer$cleanText$1;
    //   40	210	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super BasicWordTokenizer$cleanText$1> $completion) {
    BasicWordTokenizer$cleanText$1 basicWordTokenizer$cleanText$1 = new BasicWordTokenizer$cleanText$1(this.$text, $completion);
    basicWordTokenizer$cleanText$1.L$0 = value;
    return (Continuation<Unit>)basicWordTokenizer$cleanText$1;
  }
  
  public final Object invoke(SequenceScope p1, Continuation<?> p2) {
    return ((BasicWordTokenizer$cleanText$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\word\BasicWordTokenizer$cleanText$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */