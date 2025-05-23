package ai.grazie.nlp.tokenizer.retokenizer;

import ai.grazie.nlp.tokenizer.Tokenizer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;

@DebugMetadata(f = "TrimmingRetokenizer.kt", l = {22, 26}, i = {0, 0, 0, 1}, s = {"L$0", "L$2", "L$3", "L$0"}, n = {"$this$sequence", "token", "start", "$this$sequence"}, m = "invokeSuspend", c = "ai.grazie.nlp.tokenizer.retokenizer.TrimmingRetokenizer$retokenizeAsSequence$1")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;"})
final class TrimmingRetokenizer$retokenizeAsSequence$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Tokenizer.Token>, Continuation<? super Unit>, Object> {
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  int label;
  
  TrimmingRetokenizer$retokenizeAsSequence$1(Sequence<Tokenizer.Token> $tokens, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #7
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 382, 0 -> 36, 1 -> 199, 2 -> 353
    //   36: aload_1
    //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   40: aload_0
    //   41: getfield L$0 : Ljava/lang/Object;
    //   44: checkcast kotlin/sequences/SequenceScope
    //   47: astore_2
    //   48: aload_0
    //   49: getfield $tokens : Lkotlin/sequences/Sequence;
    //   52: invokeinterface iterator : ()Ljava/util/Iterator;
    //   57: astore_3
    //   58: aload_3
    //   59: invokeinterface hasNext : ()Z
    //   64: ifeq -> 378
    //   67: aload_3
    //   68: invokeinterface next : ()Ljava/lang/Object;
    //   73: checkcast ai/grazie/nlp/tokenizer/Tokenizer$Token
    //   76: astore #4
    //   78: aload #4
    //   80: invokevirtual getToken : ()Ljava/lang/String;
    //   83: invokestatic takeWhitespaces : (Ljava/lang/String;)Ljava/lang/String;
    //   86: astore #5
    //   88: aload #5
    //   90: checkcast java/lang/CharSequence
    //   93: invokeinterface length : ()I
    //   98: ifle -> 105
    //   101: iconst_1
    //   102: goto -> 106
    //   105: iconst_0
    //   106: ifeq -> 239
    //   109: aload_2
    //   110: new ai/grazie/nlp/tokenizer/Tokenizer$Token
    //   113: dup
    //   114: aload #5
    //   116: new kotlin/ranges/IntRange
    //   119: dup
    //   120: aload #4
    //   122: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
    //   125: invokevirtual getStart : ()Ljava/lang/Integer;
    //   128: invokevirtual intValue : ()I
    //   131: aload #4
    //   133: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
    //   136: invokevirtual getStart : ()Ljava/lang/Integer;
    //   139: invokevirtual intValue : ()I
    //   142: aload #5
    //   144: invokevirtual length : ()I
    //   147: iadd
    //   148: iconst_1
    //   149: isub
    //   150: invokespecial <init> : (II)V
    //   153: invokespecial <init> : (Ljava/lang/String;Lkotlin/ranges/IntRange;)V
    //   156: aload_0
    //   157: checkcast kotlin/coroutines/Continuation
    //   160: aload_0
    //   161: aload_2
    //   162: putfield L$0 : Ljava/lang/Object;
    //   165: aload_0
    //   166: aload_3
    //   167: putfield L$1 : Ljava/lang/Object;
    //   170: aload_0
    //   171: aload #4
    //   173: putfield L$2 : Ljava/lang/Object;
    //   176: aload_0
    //   177: aload #5
    //   179: putfield L$3 : Ljava/lang/Object;
    //   182: aload_0
    //   183: iconst_1
    //   184: putfield label : I
    //   187: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   190: dup
    //   191: aload #7
    //   193: if_acmpne -> 238
    //   196: aload #7
    //   198: areturn
    //   199: aload_0
    //   200: getfield L$3 : Ljava/lang/Object;
    //   203: checkcast java/lang/String
    //   206: astore #5
    //   208: aload_0
    //   209: getfield L$2 : Ljava/lang/Object;
    //   212: checkcast ai/grazie/nlp/tokenizer/Tokenizer$Token
    //   215: astore #4
    //   217: aload_0
    //   218: getfield L$1 : Ljava/lang/Object;
    //   221: checkcast java/util/Iterator
    //   224: astore_3
    //   225: aload_0
    //   226: getfield L$0 : Ljava/lang/Object;
    //   229: checkcast kotlin/sequences/SequenceScope
    //   232: astore_2
    //   233: aload_1
    //   234: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   237: aload_1
    //   238: pop
    //   239: aload #4
    //   241: invokevirtual getToken : ()Ljava/lang/String;
    //   244: invokestatic takeLastWhitespaces : (Ljava/lang/String;)Ljava/lang/String;
    //   247: astore #6
    //   249: aload #6
    //   251: checkcast java/lang/CharSequence
    //   254: invokeinterface length : ()I
    //   259: ifle -> 266
    //   262: iconst_1
    //   263: goto -> 267
    //   266: iconst_0
    //   267: ifeq -> 58
    //   270: aload_2
    //   271: new ai/grazie/nlp/tokenizer/Tokenizer$Token
    //   274: dup
    //   275: aload #5
    //   277: new kotlin/ranges/IntRange
    //   280: dup
    //   281: aload #4
    //   283: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
    //   286: invokestatic getCheckedEndExclusive : (Lkotlin/ranges/IntRange;)I
    //   289: aload #6
    //   291: invokevirtual length : ()I
    //   294: isub
    //   295: aload #4
    //   297: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
    //   300: invokevirtual getEndInclusive : ()Ljava/lang/Integer;
    //   303: invokevirtual intValue : ()I
    //   306: invokespecial <init> : (II)V
    //   309: invokespecial <init> : (Ljava/lang/String;Lkotlin/ranges/IntRange;)V
    //   312: aload_0
    //   313: checkcast kotlin/coroutines/Continuation
    //   316: aload_0
    //   317: aload_2
    //   318: putfield L$0 : Ljava/lang/Object;
    //   321: aload_0
    //   322: aload_3
    //   323: putfield L$1 : Ljava/lang/Object;
    //   326: aload_0
    //   327: aconst_null
    //   328: putfield L$2 : Ljava/lang/Object;
    //   331: aload_0
    //   332: aconst_null
    //   333: putfield L$3 : Ljava/lang/Object;
    //   336: aload_0
    //   337: iconst_2
    //   338: putfield label : I
    //   341: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   344: dup
    //   345: aload #7
    //   347: if_acmpne -> 374
    //   350: aload #7
    //   352: areturn
    //   353: aload_0
    //   354: getfield L$1 : Ljava/lang/Object;
    //   357: checkcast java/util/Iterator
    //   360: astore_3
    //   361: aload_0
    //   362: getfield L$0 : Ljava/lang/Object;
    //   365: checkcast kotlin/sequences/SequenceScope
    //   368: astore_2
    //   369: aload_1
    //   370: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   373: aload_1
    //   374: pop
    //   375: goto -> 58
    //   378: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   381: areturn
    //   382: new java/lang/IllegalStateException
    //   385: dup
    //   386: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   388: invokespecial <init> : (Ljava/lang/String;)V
    //   391: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #18	-> 3
    //   #19	-> 48
    //   #20	-> 78
    //   #21	-> 88
    //   #21	-> 106
    //   #22	-> 109
    //   #18	-> 196
    //   #24	-> 238
    //   #25	-> 249
    //   #25	-> 267
    //   #26	-> 270
    //   #18	-> 350
    //   #26	-> 374
    //   #29	-> 378
    //   #18	-> 382
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   48	151	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   233	120	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   369	13	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   78	121	4	token	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
    //   217	50	4	token	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
    //   267	77	4	token	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
    //   88	111	5	start	Ljava/lang/String;
    //   208	59	5	start	Ljava/lang/String;
    //   267	77	5	start	Ljava/lang/String;
    //   249	18	6	end	Ljava/lang/String;
    //   267	77	6	end	Ljava/lang/String;
    //   0	392	0	this	Lai/grazie/nlp/tokenizer/retokenizer/TrimmingRetokenizer$retokenizeAsSequence$1;
    //   40	342	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super TrimmingRetokenizer$retokenizeAsSequence$1> $completion) {
    TrimmingRetokenizer$retokenizeAsSequence$1 trimmingRetokenizer$retokenizeAsSequence$1 = new TrimmingRetokenizer$retokenizeAsSequence$1(this.$tokens, $completion);
    trimmingRetokenizer$retokenizeAsSequence$1.L$0 = value;
    return (Continuation<Unit>)trimmingRetokenizer$retokenizeAsSequence$1;
  }
  
  public final Object invoke(SequenceScope p1, Continuation<?> p2) {
    return ((TrimmingRetokenizer$retokenizeAsSequence$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\retokenizer\TrimmingRetokenizer$retokenizeAsSequence$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */