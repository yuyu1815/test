package ai.grazie.utils;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

@DebugMetadata(f = "Collections.kt", l = {70}, i = {0, 0, 0}, s = {"L$0", "I$0", "I$2"}, n = {"$this$sequence", "i", "j"}, m = "invokeSuspend", c = "ai.grazie.utils.CollectionsKt$decarteMult$1")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001\"\004\b\000\020\002*\024\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0020\0040\003H@"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;", "Lkotlin/Pair;"})
final class CollectionsKt$decarteMult$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Pair<? extends T, ? extends T>>, Continuation<? super Unit>, Object> {
  int I$0;
  
  int I$1;
  
  int I$2;
  
  int I$3;
  
  int label;
  
  CollectionsKt$decarteMult$1(List<T> $receiver, boolean $excludeDiagonal, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #7
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 227, 0 -> 32, 1 -> 174
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: aload_0
    //   37: getfield L$0 : Ljava/lang/Object;
    //   40: checkcast kotlin/sequences/SequenceScope
    //   43: astore_2
    //   44: iconst_0
    //   45: istore_3
    //   46: aload_0
    //   47: getfield $this_decarteMult : Ljava/util/List;
    //   50: invokeinterface size : ()I
    //   55: istore #4
    //   57: iload_3
    //   58: iload #4
    //   60: if_icmpge -> 223
    //   63: iconst_0
    //   64: istore #5
    //   66: aload_0
    //   67: getfield $this_decarteMult : Ljava/util/List;
    //   70: invokeinterface size : ()I
    //   75: istore #6
    //   77: iload #5
    //   79: iload #6
    //   81: if_icmpge -> 217
    //   84: aload_0
    //   85: getfield $excludeDiagonal : Z
    //   88: ifeq -> 100
    //   91: iload_3
    //   92: iload #5
    //   94: if_icmpne -> 100
    //   97: goto -> 211
    //   100: aload_2
    //   101: aload_0
    //   102: getfield $this_decarteMult : Ljava/util/List;
    //   105: iload_3
    //   106: invokeinterface get : (I)Ljava/lang/Object;
    //   111: aload_0
    //   112: getfield $this_decarteMult : Ljava/util/List;
    //   115: iload #5
    //   117: invokeinterface get : (I)Ljava/lang/Object;
    //   122: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
    //   125: aload_0
    //   126: checkcast kotlin/coroutines/Continuation
    //   129: aload_0
    //   130: aload_2
    //   131: putfield L$0 : Ljava/lang/Object;
    //   134: aload_0
    //   135: iload_3
    //   136: putfield I$0 : I
    //   139: aload_0
    //   140: iload #4
    //   142: putfield I$1 : I
    //   145: aload_0
    //   146: iload #5
    //   148: putfield I$2 : I
    //   151: aload_0
    //   152: iload #6
    //   154: putfield I$3 : I
    //   157: aload_0
    //   158: iconst_1
    //   159: putfield label : I
    //   162: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   165: dup
    //   166: aload #7
    //   168: if_acmpne -> 210
    //   171: aload #7
    //   173: areturn
    //   174: aload_0
    //   175: getfield I$3 : I
    //   178: istore #6
    //   180: aload_0
    //   181: getfield I$2 : I
    //   184: istore #5
    //   186: aload_0
    //   187: getfield I$1 : I
    //   190: istore #4
    //   192: aload_0
    //   193: getfield I$0 : I
    //   196: istore_3
    //   197: aload_0
    //   198: getfield L$0 : Ljava/lang/Object;
    //   201: checkcast kotlin/sequences/SequenceScope
    //   204: astore_2
    //   205: aload_1
    //   206: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   209: aload_1
    //   210: pop
    //   211: iinc #5, 1
    //   214: goto -> 77
    //   217: iinc #3, 1
    //   220: goto -> 57
    //   223: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   226: areturn
    //   227: new java/lang/IllegalStateException
    //   230: dup
    //   231: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   233: invokespecial <init> : (Ljava/lang/String;)V
    //   236: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #64	-> 3
    //   #65	-> 44
    //   #66	-> 63
    //   #67	-> 84
    //   #68	-> 97
    //   #70	-> 100
    //   #64	-> 171
    //   #66	-> 210
    //   #65	-> 217
    //   #73	-> 223
    //   #64	-> 227
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   44	19	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   63	21	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   84	16	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   100	74	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   205	22	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   46	17	3	i	I
    //   63	21	3	i	I
    //   84	16	3	i	I
    //   100	74	3	i	I
    //   197	26	3	i	I
    //   66	18	5	j	I
    //   84	16	5	j	I
    //   100	74	5	j	I
    //   186	31	5	j	I
    //   0	237	0	this	Lai/grazie/utils/CollectionsKt$decarteMult$1;
    //   36	191	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super CollectionsKt$decarteMult$1> $completion) {
    CollectionsKt$decarteMult$1 collectionsKt$decarteMult$1 = new CollectionsKt$decarteMult$1(this.$this_decarteMult, this.$excludeDiagonal, $completion);
    collectionsKt$decarteMult$1.L$0 = value;
    return (Continuation<Unit>)collectionsKt$decarteMult$1;
  }
  
  public final Object invoke(SequenceScope p1, Continuation<?> p2) {
    return ((CollectionsKt$decarteMult$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\CollectionsKt$decarteMult$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */