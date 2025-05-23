package ai.grazie.nlp.tokenizer.utils;

import ai.grazie.nlp.tokenizer.Tokenizer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;

@DebugMetadata(f = "Utils.kt", l = {44}, i = {0, 0, 0}, s = {"L$0", "L$2", "I$0"}, n = {"$this$sequence", "splitToken", "start"}, m = "invokeSuspend", c = "ai.grazie.nlp.tokenizer.utils.UtilsKt$splitToken$1")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;"})
final class UtilsKt$splitToken$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Tokenizer.Token>, Continuation<? super Unit>, Object> {
  Object L$1;
  
  Object L$2;
  
  int I$0;
  
  int label;
  
  UtilsKt$splitToken$1(Tokenizer.Token $receiver, Sequence<String> $parts, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #6
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 210, 0 -> 32, 1 -> 158
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: aload_0
    //   37: getfield L$0 : Ljava/lang/Object;
    //   40: checkcast kotlin/sequences/SequenceScope
    //   43: astore_2
    //   44: aload_0
    //   45: getfield $this_splitToken : Lai/grazie/nlp/tokenizer/Tokenizer$Token;
    //   48: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
    //   51: invokevirtual getFirst : ()I
    //   54: istore_3
    //   55: aload_0
    //   56: getfield $parts : Lkotlin/sequences/Sequence;
    //   59: invokeinterface iterator : ()Ljava/util/Iterator;
    //   64: astore #4
    //   66: aload #4
    //   68: invokeinterface hasNext : ()Z
    //   73: ifeq -> 206
    //   76: aload #4
    //   78: invokeinterface next : ()Ljava/lang/Object;
    //   83: checkcast java/lang/String
    //   86: astore #5
    //   88: aload_2
    //   89: new ai/grazie/nlp/tokenizer/Tokenizer$Token
    //   92: dup
    //   93: aload #5
    //   95: new kotlin/ranges/IntRange
    //   98: dup
    //   99: iload_3
    //   100: iload_3
    //   101: aload #5
    //   103: invokevirtual length : ()I
    //   106: iadd
    //   107: iconst_1
    //   108: isub
    //   109: invokespecial <init> : (II)V
    //   112: invokespecial <init> : (Ljava/lang/String;Lkotlin/ranges/IntRange;)V
    //   115: aload_0
    //   116: checkcast kotlin/coroutines/Continuation
    //   119: aload_0
    //   120: aload_2
    //   121: putfield L$0 : Ljava/lang/Object;
    //   124: aload_0
    //   125: aload #4
    //   127: putfield L$1 : Ljava/lang/Object;
    //   130: aload_0
    //   131: aload #5
    //   133: putfield L$2 : Ljava/lang/Object;
    //   136: aload_0
    //   137: iload_3
    //   138: putfield I$0 : I
    //   141: aload_0
    //   142: iconst_1
    //   143: putfield label : I
    //   146: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   149: dup
    //   150: aload #6
    //   152: if_acmpne -> 194
    //   155: aload #6
    //   157: areturn
    //   158: aload_0
    //   159: getfield I$0 : I
    //   162: istore_3
    //   163: aload_0
    //   164: getfield L$2 : Ljava/lang/Object;
    //   167: checkcast java/lang/String
    //   170: astore #5
    //   172: aload_0
    //   173: getfield L$1 : Ljava/lang/Object;
    //   176: checkcast java/util/Iterator
    //   179: astore #4
    //   181: aload_0
    //   182: getfield L$0 : Ljava/lang/Object;
    //   185: checkcast kotlin/sequences/SequenceScope
    //   188: astore_2
    //   189: aload_1
    //   190: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   193: aload_1
    //   194: pop
    //   195: iload_3
    //   196: aload #5
    //   198: invokevirtual length : ()I
    //   201: iadd
    //   202: istore_3
    //   203: goto -> 66
    //   206: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   209: areturn
    //   210: new java/lang/IllegalStateException
    //   213: dup
    //   214: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   216: invokespecial <init> : (Ljava/lang/String;)V
    //   219: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #41	-> 3
    //   #42	-> 44
    //   #43	-> 55
    //   #44	-> 88
    //   #41	-> 155
    //   #45	-> 194
    //   #47	-> 206
    //   #41	-> 210
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   44	114	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   189	21	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   55	103	3	start	I
    //   163	47	3	start	I
    //   88	70	5	splitToken	Ljava/lang/String;
    //   172	31	5	splitToken	Ljava/lang/String;
    //   0	220	0	this	Lai/grazie/nlp/tokenizer/utils/UtilsKt$splitToken$1;
    //   36	174	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super UtilsKt$splitToken$1> $completion) {
    UtilsKt$splitToken$1 utilsKt$splitToken$1 = new UtilsKt$splitToken$1(this.$this_splitToken, this.$parts, $completion);
    utilsKt$splitToken$1.L$0 = value;
    return (Continuation<Unit>)utilsKt$splitToken$1;
  }
  
  public final Object invoke(SequenceScope p1, Continuation<?> p2) {
    return ((UtilsKt$splitToken$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenize\\utils\UtilsKt$splitToken$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */