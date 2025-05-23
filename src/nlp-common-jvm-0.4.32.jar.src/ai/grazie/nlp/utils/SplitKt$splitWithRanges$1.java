package ai.grazie.nlp.utils;

import ai.grazie.text.TextRange;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;

@DebugMetadata(f = "Split.kt", l = {19, 34}, i = {0, 0, 0, 0}, s = {"L$0", "L$1", "I$0", "I$1"}, n = {"$this$sequence", "tokenBuilder", "cur", "totalSeps"}, m = "invokeSuspend", c = "ai.grazie.nlp.utils.SplitKt$splitWithRanges$1")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\026\n\000\n\002\020\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\016\020\000\032\0020\001*\024\022\020\022\016\022\004\022\0020\004\022\004\022\0020\0050\0030\002H@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lkotlin/Pair;", "Lai/grazie/text/TextRange;", ""})
final class SplitKt$splitWithRanges$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Pair<? extends TextRange, ? extends String>>, Continuation<? super Unit>, Object> {
  Object L$1;
  
  Object L$2;
  
  int I$0;
  
  int I$1;
  
  int label;
  
  SplitKt$splitWithRanges$1(Sequence<Character> $receiver, Function1<Character, Boolean> $shouldSplit, boolean $addSeparatorsToRange, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #10
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 401, 0 -> 36, 1 -> 224, 2 -> 391
    //   36: aload_1
    //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   40: aload_0
    //   41: getfield L$0 : Ljava/lang/Object;
    //   44: checkcast kotlin/sequences/SequenceScope
    //   47: astore_2
    //   48: iconst_0
    //   49: istore_3
    //   50: iconst_0
    //   51: istore #4
    //   53: new java/lang/StringBuilder
    //   56: dup
    //   57: invokespecial <init> : ()V
    //   60: astore #5
    //   62: iconst_0
    //   63: istore #6
    //   65: aload_0
    //   66: getfield $this_splitWithRanges : Lkotlin/sequences/Sequence;
    //   69: invokeinterface iterator : ()Ljava/util/Iterator;
    //   74: astore #7
    //   76: aload #7
    //   78: invokeinterface hasNext : ()Z
    //   83: ifeq -> 300
    //   86: aload #7
    //   88: invokeinterface next : ()Ljava/lang/Object;
    //   93: checkcast java/lang/Character
    //   96: invokevirtual charValue : ()C
    //   99: istore #8
    //   101: aload_0
    //   102: getfield $shouldSplit : Lkotlin/jvm/functions/Function1;
    //   105: iload #8
    //   107: i2c
    //   108: invokestatic boxChar : (C)Ljava/lang/Character;
    //   111: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   116: checkcast java/lang/Boolean
    //   119: invokevirtual booleanValue : ()Z
    //   122: ifeq -> 285
    //   125: new ai/grazie/text/TextRange
    //   128: dup
    //   129: iload_3
    //   130: iload #4
    //   132: invokespecial <init> : (II)V
    //   135: astore #9
    //   137: aload #9
    //   139: invokevirtual isEmpty : ()Z
    //   142: ifne -> 274
    //   145: aload_2
    //   146: aload_0
    //   147: getfield $addSeparatorsToRange : Z
    //   150: ifne -> 164
    //   153: aload #9
    //   155: iload #6
    //   157: ineg
    //   158: invokestatic withOffset : (Lai/grazie/text/TextRange;I)Lai/grazie/text/TextRange;
    //   161: goto -> 166
    //   164: aload #9
    //   166: aload #5
    //   168: invokevirtual toString : ()Ljava/lang/String;
    //   171: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
    //   174: aload_0
    //   175: checkcast kotlin/coroutines/Continuation
    //   178: aload_0
    //   179: aload_2
    //   180: putfield L$0 : Ljava/lang/Object;
    //   183: aload_0
    //   184: aload #5
    //   186: putfield L$1 : Ljava/lang/Object;
    //   189: aload_0
    //   190: aload #7
    //   192: putfield L$2 : Ljava/lang/Object;
    //   195: aload_0
    //   196: iload #4
    //   198: putfield I$0 : I
    //   201: aload_0
    //   202: iload #6
    //   204: putfield I$1 : I
    //   207: aload_0
    //   208: iconst_1
    //   209: putfield label : I
    //   212: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   215: dup
    //   216: aload #10
    //   218: if_acmpne -> 267
    //   221: aload #10
    //   223: areturn
    //   224: aload_0
    //   225: getfield I$1 : I
    //   228: istore #6
    //   230: aload_0
    //   231: getfield I$0 : I
    //   234: istore #4
    //   236: aload_0
    //   237: getfield L$2 : Ljava/lang/Object;
    //   240: checkcast java/util/Iterator
    //   243: astore #7
    //   245: aload_0
    //   246: getfield L$1 : Ljava/lang/Object;
    //   249: checkcast java/lang/StringBuilder
    //   252: astore #5
    //   254: aload_0
    //   255: getfield L$0 : Ljava/lang/Object;
    //   258: checkcast kotlin/sequences/SequenceScope
    //   261: astore_2
    //   262: aload_1
    //   263: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   266: aload_1
    //   267: pop
    //   268: aload #5
    //   270: invokestatic clear : (Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    //   273: pop
    //   274: iload #4
    //   276: iconst_1
    //   277: iadd
    //   278: istore_3
    //   279: iinc #6, 1
    //   282: goto -> 294
    //   285: aload #5
    //   287: iload #8
    //   289: i2c
    //   290: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   293: pop
    //   294: iinc #4, 1
    //   297: goto -> 76
    //   300: iload_3
    //   301: iload #4
    //   303: if_icmpge -> 397
    //   306: new ai/grazie/text/TextRange
    //   309: dup
    //   310: iload_3
    //   311: iload #4
    //   313: invokespecial <init> : (II)V
    //   316: astore #7
    //   318: aload #7
    //   320: invokevirtual isEmpty : ()Z
    //   323: ifne -> 397
    //   326: aload_2
    //   327: aload_0
    //   328: getfield $addSeparatorsToRange : Z
    //   331: ifne -> 345
    //   334: aload #7
    //   336: iload #6
    //   338: ineg
    //   339: invokestatic withOffset : (Lai/grazie/text/TextRange;I)Lai/grazie/text/TextRange;
    //   342: goto -> 347
    //   345: aload #7
    //   347: aload #5
    //   349: invokevirtual toString : ()Ljava/lang/String;
    //   352: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
    //   355: aload_0
    //   356: checkcast kotlin/coroutines/Continuation
    //   359: aload_0
    //   360: aconst_null
    //   361: putfield L$0 : Ljava/lang/Object;
    //   364: aload_0
    //   365: aconst_null
    //   366: putfield L$1 : Ljava/lang/Object;
    //   369: aload_0
    //   370: aconst_null
    //   371: putfield L$2 : Ljava/lang/Object;
    //   374: aload_0
    //   375: iconst_2
    //   376: putfield label : I
    //   379: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   382: dup
    //   383: aload #10
    //   385: if_acmpne -> 396
    //   388: aload #10
    //   390: areturn
    //   391: aload_1
    //   392: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   395: aload_1
    //   396: pop
    //   397: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   400: areturn
    //   401: new java/lang/IllegalStateException
    //   404: dup
    //   405: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   407: invokespecial <init> : (Ljava/lang/String;)V
    //   410: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #8	-> 3
    //   #9	-> 48
    //   #10	-> 50
    //   #11	-> 53
    //   #13	-> 62
    //   #14	-> 65
    //   #15	-> 101
    //   #16	-> 125
    //   #18	-> 137
    //   #19	-> 145
    //   #8	-> 221
    //   #20	-> 267
    //   #22	-> 274
    //   #23	-> 279
    //   #25	-> 285
    //   #27	-> 294
    //   #30	-> 300
    //   #31	-> 306
    //   #33	-> 318
    //   #34	-> 326
    //   #8	-> 388
    //   #37	-> 396
    //   #8	-> 401
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   48	176	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   262	83	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   50	87	3	start	I
    //   279	39	3	start	I
    //   53	171	4	cur	I
    //   236	82	4	cur	I
    //   62	162	5	tokenBuilder	Ljava/lang/StringBuilder;
    //   254	128	5	tokenBuilder	Ljava/lang/StringBuilder;
    //   65	159	6	totalSeps	I
    //   230	115	6	totalSeps	I
    //   318	27	7	range	Lai/grazie/text/TextRange;
    //   345	2	7	range	Lai/grazie/text/TextRange;
    //   101	24	8	char	C
    //   285	9	8	char	C
    //   137	27	9	range	Lai/grazie/text/TextRange;
    //   164	2	9	range	Lai/grazie/text/TextRange;
    //   0	411	0	this	Lai/grazie/nlp/utils/SplitKt$splitWithRanges$1;
    //   40	361	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super SplitKt$splitWithRanges$1> $completion) {
    SplitKt$splitWithRanges$1 splitKt$splitWithRanges$1 = new SplitKt$splitWithRanges$1(this.$this_splitWithRanges, this.$shouldSplit, this.$addSeparatorsToRange, $completion);
    splitKt$splitWithRanges$1.L$0 = value;
    return (Continuation<Unit>)splitKt$splitWithRanges$1;
  }
  
  public final Object invoke(SequenceScope p1, Continuation<?> p2) {
    return ((SplitKt$splitWithRanges$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-common-jvm-0.4.32.jar!\ai\grazie\nl\\utils\SplitKt$splitWithRanges$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */