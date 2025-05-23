package ai.grazie.utils;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequenceScope;

@DebugMetadata(f = "Collections.kt", l = {25, 37}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$3"}, n = {"$this$sequence", "window", "value"}, m = "invokeSuspend", c = "ai.grazie.utils.CollectionsKt$windowedPartial$1")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020\002\n\000\n\002\020\000\n\002\030\002\n\002\020 \020\000\032\0020\001\"\b\b\000\020\002*\0020\003*\020\022\f\022\n\022\006\022\004\030\001H\0020\0050\004H@"}, d2 = {"<anonymous>", "", "T", "", "Lkotlin/sequences/SequenceScope;", ""})
@SourceDebugExtension({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nai/grazie/utils/CollectionsKt$windowedPartial$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n1557#2:107\n1628#2,3:108\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nai/grazie/utils/CollectionsKt$windowedPartial$1\n*L\n19#1:107\n19#1:108,3\n*E\n"})
final class CollectionsKt$windowedPartial$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super List<? extends T>>, Continuation<? super Unit>, Object> {
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  int label;
  
  CollectionsKt$windowedPartial$1(Collection<T> $receiver, int $size, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #14
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 536, 0 -> 36, 1 -> 396, 2 -> 526
    //   36: aload_1
    //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   40: aload_0
    //   41: getfield L$0 : Ljava/lang/Object;
    //   44: checkcast kotlin/sequences/SequenceScope
    //   47: astore_2
    //   48: aload_0
    //   49: getfield $this_windowedPartial : Ljava/util/Collection;
    //   52: invokeinterface isEmpty : ()Z
    //   57: ifeq -> 64
    //   60: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   63: areturn
    //   64: iconst_0
    //   65: aload_0
    //   66: getfield $size : I
    //   69: iconst_1
    //   70: isub
    //   71: invokestatic until : (II)Lkotlin/ranges/IntRange;
    //   74: checkcast java/lang/Iterable
    //   77: astore #4
    //   79: iconst_0
    //   80: istore #5
    //   82: aload #4
    //   84: astore #6
    //   86: new java/util/ArrayList
    //   89: dup
    //   90: aload #4
    //   92: bipush #10
    //   94: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   97: invokespecial <init> : (I)V
    //   100: checkcast java/util/Collection
    //   103: astore #7
    //   105: iconst_0
    //   106: istore #8
    //   108: aload #6
    //   110: invokeinterface iterator : ()Ljava/util/Iterator;
    //   115: astore #9
    //   117: aload #9
    //   119: invokeinterface hasNext : ()Z
    //   124: ifeq -> 157
    //   127: aload #9
    //   129: checkcast kotlin/collections/IntIterator
    //   132: invokevirtual nextInt : ()I
    //   135: istore #10
    //   137: aload #7
    //   139: astore #12
    //   141: iconst_0
    //   142: istore #11
    //   144: aconst_null
    //   145: aload #12
    //   147: swap
    //   148: invokeinterface add : (Ljava/lang/Object;)Z
    //   153: pop
    //   154: goto -> 117
    //   157: aload #7
    //   159: checkcast java/util/List
    //   162: nop
    //   163: checkcast java/util/Collection
    //   166: aload_0
    //   167: getfield $this_windowedPartial : Ljava/util/Collection;
    //   170: checkcast java/lang/Iterable
    //   173: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
    //   176: checkcast java/util/Collection
    //   179: iconst_0
    //   180: aload_0
    //   181: getfield $size : I
    //   184: iconst_1
    //   185: isub
    //   186: invokestatic until : (II)Lkotlin/ranges/IntRange;
    //   189: checkcast java/lang/Iterable
    //   192: astore #4
    //   194: astore #12
    //   196: iconst_0
    //   197: istore #5
    //   199: aload #4
    //   201: astore #6
    //   203: new java/util/ArrayList
    //   206: dup
    //   207: aload #4
    //   209: bipush #10
    //   211: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   214: invokespecial <init> : (I)V
    //   217: checkcast java/util/Collection
    //   220: astore #7
    //   222: iconst_0
    //   223: istore #8
    //   225: aload #6
    //   227: invokeinterface iterator : ()Ljava/util/Iterator;
    //   232: astore #9
    //   234: aload #9
    //   236: invokeinterface hasNext : ()Z
    //   241: ifeq -> 274
    //   244: aload #9
    //   246: checkcast kotlin/collections/IntIterator
    //   249: invokevirtual nextInt : ()I
    //   252: istore #10
    //   254: aload #7
    //   256: astore #13
    //   258: iconst_0
    //   259: istore #11
    //   261: aconst_null
    //   262: aload #13
    //   264: swap
    //   265: invokeinterface add : (Ljava/lang/Object;)Z
    //   270: pop
    //   271: goto -> 234
    //   274: aload #7
    //   276: checkcast java/util/List
    //   279: nop
    //   280: aload #12
    //   282: swap
    //   283: checkcast java/lang/Iterable
    //   286: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
    //   289: astore_3
    //   290: new kotlin/collections/ArrayDeque
    //   293: dup
    //   294: invokespecial <init> : ()V
    //   297: astore #4
    //   299: aload_3
    //   300: invokeinterface iterator : ()Ljava/util/Iterator;
    //   305: astore #5
    //   307: aload #5
    //   309: invokeinterface hasNext : ()Z
    //   314: ifeq -> 472
    //   317: aload #5
    //   319: invokeinterface next : ()Ljava/lang/Object;
    //   324: astore #6
    //   326: nop
    //   327: aload #4
    //   329: invokevirtual size : ()I
    //   332: aload_0
    //   333: getfield $size : I
    //   336: if_icmpne -> 450
    //   339: aload_2
    //   340: new java/util/ArrayList
    //   343: dup
    //   344: aload #4
    //   346: checkcast java/util/Collection
    //   349: invokespecial <init> : (Ljava/util/Collection;)V
    //   352: aload_0
    //   353: checkcast kotlin/coroutines/Continuation
    //   356: aload_0
    //   357: aload_2
    //   358: putfield L$0 : Ljava/lang/Object;
    //   361: aload_0
    //   362: aload #4
    //   364: putfield L$1 : Ljava/lang/Object;
    //   367: aload_0
    //   368: aload #5
    //   370: putfield L$2 : Ljava/lang/Object;
    //   373: aload_0
    //   374: aload #6
    //   376: putfield L$3 : Ljava/lang/Object;
    //   379: aload_0
    //   380: iconst_1
    //   381: putfield label : I
    //   384: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   387: dup
    //   388: aload #14
    //   390: if_acmpne -> 433
    //   393: aload #14
    //   395: areturn
    //   396: aload_0
    //   397: getfield L$3 : Ljava/lang/Object;
    //   400: astore #6
    //   402: aload_0
    //   403: getfield L$2 : Ljava/lang/Object;
    //   406: checkcast java/util/Iterator
    //   409: astore #5
    //   411: aload_0
    //   412: getfield L$1 : Ljava/lang/Object;
    //   415: checkcast kotlin/collections/ArrayDeque
    //   418: astore #4
    //   420: aload_0
    //   421: getfield L$0 : Ljava/lang/Object;
    //   424: checkcast kotlin/sequences/SequenceScope
    //   427: astore_2
    //   428: aload_1
    //   429: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   432: aload_1
    //   433: pop
    //   434: aload #4
    //   436: invokevirtual removeFirst : ()Ljava/lang/Object;
    //   439: pop
    //   440: aload #4
    //   442: aload #6
    //   444: invokevirtual addLast : (Ljava/lang/Object;)V
    //   447: goto -> 307
    //   450: aload #4
    //   452: invokevirtual size : ()I
    //   455: aload_0
    //   456: getfield $size : I
    //   459: if_icmpge -> 307
    //   462: aload #4
    //   464: aload #6
    //   466: invokevirtual addLast : (Ljava/lang/Object;)V
    //   469: goto -> 307
    //   472: aload_2
    //   473: new java/util/ArrayList
    //   476: dup
    //   477: aload #4
    //   479: checkcast java/util/Collection
    //   482: invokespecial <init> : (Ljava/util/Collection;)V
    //   485: aload_0
    //   486: checkcast kotlin/coroutines/Continuation
    //   489: aload_0
    //   490: aconst_null
    //   491: putfield L$0 : Ljava/lang/Object;
    //   494: aload_0
    //   495: aconst_null
    //   496: putfield L$1 : Ljava/lang/Object;
    //   499: aload_0
    //   500: aconst_null
    //   501: putfield L$2 : Ljava/lang/Object;
    //   504: aload_0
    //   505: aconst_null
    //   506: putfield L$3 : Ljava/lang/Object;
    //   509: aload_0
    //   510: iconst_2
    //   511: putfield label : I
    //   514: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   517: dup
    //   518: aload #14
    //   520: if_acmpne -> 531
    //   523: aload #14
    //   525: areturn
    //   526: aload_1
    //   527: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   530: aload_1
    //   531: pop
    //   532: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   535: areturn
    //   536: new java/lang/IllegalStateException
    //   539: dup
    //   540: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   542: invokespecial <init> : (Ljava/lang/String;)V
    //   545: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #16	-> 3
    //   #17	-> 48
    //   #19	-> 64
    //   #107	-> 82
    //   #108	-> 108
    //   #109	-> 137
    //   #19	-> 144
    //   #109	-> 148
    //   #110	-> 157
    //   #107	-> 162
    //   #19	-> 166
    //   #107	-> 199
    //   #108	-> 225
    //   #109	-> 254
    //   #19	-> 261
    //   #109	-> 265
    //   #110	-> 274
    //   #107	-> 279
    //   #19	-> 286
    //   #21	-> 290
    //   #22	-> 299
    //   #23	-> 326
    //   #24	-> 327
    //   #25	-> 339
    //   #16	-> 393
    //   #27	-> 433
    //   #28	-> 440
    //   #31	-> 450
    //   #32	-> 462
    //   #37	-> 472
    //   #16	-> 523
    //   #38	-> 531
    //   #16	-> 536
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   48	16	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   64	81	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   145	18	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   163	99	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   262	18	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   280	116	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   428	89	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   290	17	3	toIterate	Ljava/util/List;
    //   79	26	4	$this$map$iv	Ljava/lang/Iterable;
    //   196	26	4	$this$map$iv	Ljava/lang/Iterable;
    //   299	97	4	window	Lkotlin/collections/ArrayDeque;
    //   420	97	4	window	Lkotlin/collections/ArrayDeque;
    //   105	12	6	$this$mapTo$iv$iv	Ljava/lang/Iterable;
    //   222	12	6	$this$mapTo$iv$iv	Ljava/lang/Iterable;
    //   326	70	6	value	Ljava/lang/Object;
    //   402	48	6	value	Ljava/lang/Object;
    //   450	19	6	value	Ljava/lang/Object;
    //   105	54	7	destination$iv$iv	Ljava/util/Collection;
    //   222	54	7	destination$iv$iv	Ljava/util/Collection;
    //   137	17	10	item$iv$iv	I
    //   254	17	10	item$iv$iv	I
    //   144	1	11	$i$a$-map-CollectionsKt$windowedPartial$1$toIterate$1	I
    //   108	51	8	$i$f$mapTo	I
    //   82	81	5	$i$f$map	I
    //   261	1	11	$i$a$-map-CollectionsKt$windowedPartial$1$toIterate$2	I
    //   225	51	8	$i$f$mapTo	I
    //   199	81	5	$i$f$map	I
    //   0	546	0	this	Lai/grazie/utils/CollectionsKt$windowedPartial$1;
    //   40	496	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super CollectionsKt$windowedPartial$1> $completion) {
    CollectionsKt$windowedPartial$1 collectionsKt$windowedPartial$1 = new CollectionsKt$windowedPartial$1(this.$this_windowedPartial, this.$size, $completion);
    collectionsKt$windowedPartial$1.L$0 = value;
    return (Continuation<Unit>)collectionsKt$windowedPartial$1;
  }
  
  public final Object invoke(SequenceScope p1, Continuation<?> p2) {
    return ((CollectionsKt$windowedPartial$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\CollectionsKt$windowedPartial$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */