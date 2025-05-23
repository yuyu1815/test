package ai.grazie.nlp.tokenizer.word;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

@DebugMetadata(f = "BasicWordTokenizer.kt", l = {54, 57, 63}, i = {0, 0, 0, 1, 1}, s = {"L$0", "L$1", "C$0", "L$0", "L$1"}, n = {"$this$sequence", "builder", "char", "$this$sequence", "builder"}, m = "invokeSuspend", c = "ai.grazie.nlp.tokenizer.word.BasicWordTokenizer$splitOnPunctuation$1")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\020\016\020\000\032\0020\001*\b\022\004\022\0020\0030\002H@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""})
final class BasicWordTokenizer$splitOnPunctuation$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super String>, Continuation<? super Unit>, Object> {
  Object L$1;
  
  Object L$2;
  
  int I$0;
  
  int I$1;
  
  char C$0;
  
  int label;
  
  BasicWordTokenizer$splitOnPunctuation$1(String $text, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #8
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 442, 0 -> 40, 1 -> 190, 2 -> 300, 3 -> 432
    //   40: aload_1
    //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   44: aload_0
    //   45: getfield L$0 : Ljava/lang/Object;
    //   48: checkcast kotlin/sequences/SequenceScope
    //   51: astore_2
    //   52: new java/lang/StringBuilder
    //   55: dup
    //   56: invokespecial <init> : ()V
    //   59: astore_3
    //   60: aload_0
    //   61: getfield $text : Ljava/lang/String;
    //   64: astore #4
    //   66: iconst_0
    //   67: istore #5
    //   69: aload #4
    //   71: invokevirtual length : ()I
    //   74: istore #6
    //   76: iload #5
    //   78: iload #6
    //   80: if_icmpge -> 360
    //   83: aload #4
    //   85: iload #5
    //   87: invokevirtual charAt : (I)C
    //   90: istore #7
    //   92: getstatic ai/grazie/nlp/utils/CharUtils.INSTANCE : Lai/grazie/nlp/utils/CharUtils;
    //   95: iload #7
    //   97: i2c
    //   98: invokevirtual isPunctuation : (C)Z
    //   101: ifeq -> 346
    //   104: aload_3
    //   105: checkcast java/lang/CharSequence
    //   108: invokeinterface length : ()I
    //   113: ifle -> 120
    //   116: iconst_1
    //   117: goto -> 121
    //   120: iconst_0
    //   121: ifeq -> 244
    //   124: aload_2
    //   125: aload_3
    //   126: invokevirtual toString : ()Ljava/lang/String;
    //   129: dup
    //   130: ldc 'builder.toString()'
    //   132: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   135: aload_0
    //   136: checkcast kotlin/coroutines/Continuation
    //   139: aload_0
    //   140: aload_2
    //   141: putfield L$0 : Ljava/lang/Object;
    //   144: aload_0
    //   145: aload_3
    //   146: putfield L$1 : Ljava/lang/Object;
    //   149: aload_0
    //   150: aload #4
    //   152: putfield L$2 : Ljava/lang/Object;
    //   155: aload_0
    //   156: iload #5
    //   158: putfield I$0 : I
    //   161: aload_0
    //   162: iload #6
    //   164: putfield I$1 : I
    //   167: aload_0
    //   168: iload #7
    //   170: putfield C$0 : C
    //   173: aload_0
    //   174: iconst_1
    //   175: putfield label : I
    //   178: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   181: dup
    //   182: aload #8
    //   184: if_acmpne -> 238
    //   187: aload #8
    //   189: areturn
    //   190: aload_0
    //   191: getfield C$0 : C
    //   194: istore #7
    //   196: aload_0
    //   197: getfield I$1 : I
    //   200: istore #6
    //   202: aload_0
    //   203: getfield I$0 : I
    //   206: istore #5
    //   208: aload_0
    //   209: getfield L$2 : Ljava/lang/Object;
    //   212: checkcast java/lang/String
    //   215: astore #4
    //   217: aload_0
    //   218: getfield L$1 : Ljava/lang/Object;
    //   221: checkcast java/lang/StringBuilder
    //   224: astore_3
    //   225: aload_0
    //   226: getfield L$0 : Ljava/lang/Object;
    //   229: checkcast kotlin/sequences/SequenceScope
    //   232: astore_2
    //   233: aload_1
    //   234: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   237: aload_1
    //   238: pop
    //   239: aload_3
    //   240: invokestatic clear : (Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    //   243: pop
    //   244: aload_2
    //   245: iload #7
    //   247: i2c
    //   248: invokestatic valueOf : (C)Ljava/lang/String;
    //   251: aload_0
    //   252: checkcast kotlin/coroutines/Continuation
    //   255: aload_0
    //   256: aload_2
    //   257: putfield L$0 : Ljava/lang/Object;
    //   260: aload_0
    //   261: aload_3
    //   262: putfield L$1 : Ljava/lang/Object;
    //   265: aload_0
    //   266: aload #4
    //   268: putfield L$2 : Ljava/lang/Object;
    //   271: aload_0
    //   272: iload #5
    //   274: putfield I$0 : I
    //   277: aload_0
    //   278: iload #6
    //   280: putfield I$1 : I
    //   283: aload_0
    //   284: iconst_2
    //   285: putfield label : I
    //   288: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   291: dup
    //   292: aload #8
    //   294: if_acmpne -> 342
    //   297: aload #8
    //   299: areturn
    //   300: aload_0
    //   301: getfield I$1 : I
    //   304: istore #6
    //   306: aload_0
    //   307: getfield I$0 : I
    //   310: istore #5
    //   312: aload_0
    //   313: getfield L$2 : Ljava/lang/Object;
    //   316: checkcast java/lang/String
    //   319: astore #4
    //   321: aload_0
    //   322: getfield L$1 : Ljava/lang/Object;
    //   325: checkcast java/lang/StringBuilder
    //   328: astore_3
    //   329: aload_0
    //   330: getfield L$0 : Ljava/lang/Object;
    //   333: checkcast kotlin/sequences/SequenceScope
    //   336: astore_2
    //   337: aload_1
    //   338: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   341: aload_1
    //   342: pop
    //   343: goto -> 354
    //   346: aload_3
    //   347: iload #7
    //   349: i2c
    //   350: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   353: pop
    //   354: iinc #5, 1
    //   357: goto -> 76
    //   360: aload_3
    //   361: checkcast java/lang/CharSequence
    //   364: invokeinterface length : ()I
    //   369: ifle -> 376
    //   372: iconst_1
    //   373: goto -> 377
    //   376: iconst_0
    //   377: ifeq -> 438
    //   380: aload_2
    //   381: aload_3
    //   382: invokevirtual toString : ()Ljava/lang/String;
    //   385: astore #4
    //   387: aload #4
    //   389: ldc 'builder.toString()'
    //   391: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   394: aload #4
    //   396: aload_0
    //   397: checkcast kotlin/coroutines/Continuation
    //   400: aload_0
    //   401: aconst_null
    //   402: putfield L$0 : Ljava/lang/Object;
    //   405: aload_0
    //   406: aconst_null
    //   407: putfield L$1 : Ljava/lang/Object;
    //   410: aload_0
    //   411: aconst_null
    //   412: putfield L$2 : Ljava/lang/Object;
    //   415: aload_0
    //   416: iconst_3
    //   417: putfield label : I
    //   420: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   423: dup
    //   424: aload #8
    //   426: if_acmpne -> 437
    //   429: aload #8
    //   431: areturn
    //   432: aload_1
    //   433: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   436: aload_1
    //   437: pop
    //   438: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   441: areturn
    //   442: new java/lang/IllegalStateException
    //   445: dup
    //   446: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   448: invokespecial <init> : (Ljava/lang/String;)V
    //   451: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #49	-> 3
    //   #50	-> 52
    //   #51	-> 60
    //   #52	-> 92
    //   #53	-> 104
    //   #53	-> 121
    //   #54	-> 124
    //   #49	-> 187
    //   #55	-> 238
    //   #57	-> 244
    //   #49	-> 297
    //   #57	-> 342
    //   #59	-> 346
    //   #51	-> 354
    //   #62	-> 360
    //   #62	-> 377
    //   #63	-> 380
    //   #49	-> 429
    //   #65	-> 437
    //   #49	-> 442
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   52	31	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   83	107	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   233	67	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   337	40	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   377	10	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   60	23	3	builder	Ljava/lang/StringBuilder;
    //   83	107	3	builder	Ljava/lang/StringBuilder;
    //   225	75	3	builder	Ljava/lang/StringBuilder;
    //   329	48	3	builder	Ljava/lang/StringBuilder;
    //   377	10	3	builder	Ljava/lang/StringBuilder;
    //   92	98	7	char	C
    //   196	95	7	char	C
    //   346	8	7	char	C
    //   0	452	0	this	Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer$splitOnPunctuation$1;
    //   44	398	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super BasicWordTokenizer$splitOnPunctuation$1> $completion) {
    BasicWordTokenizer$splitOnPunctuation$1 basicWordTokenizer$splitOnPunctuation$1 = new BasicWordTokenizer$splitOnPunctuation$1(this.$text, $completion);
    basicWordTokenizer$splitOnPunctuation$1.L$0 = value;
    return (Continuation<Unit>)basicWordTokenizer$splitOnPunctuation$1;
  }
  
  public final Object invoke(SequenceScope p1, Continuation<?> p2) {
    return ((BasicWordTokenizer$splitOnPunctuation$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\word\BasicWordTokenizer$splitOnPunctuation$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */