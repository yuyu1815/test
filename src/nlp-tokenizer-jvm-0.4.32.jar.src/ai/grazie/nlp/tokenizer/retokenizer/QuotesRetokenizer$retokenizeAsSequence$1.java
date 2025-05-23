package ai.grazie.nlp.tokenizer.retokenizer;

import kotlin.Metadata;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020\013\n\000\n\002\030\002\n\002\020\f\n\002\b\002\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\003H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "it", "Lkotlin/collections/IndexedValue;", "", "invoke", "(Lkotlin/collections/IndexedValue;)Ljava/lang/Boolean;"})
final class QuotesRetokenizer$retokenizeAsSequence$1 extends Lambda implements Function1<IndexedValue<? extends Character>, Boolean> {
  public final Boolean invoke(IndexedValue it) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'it'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: invokestatic access$getQuotesSet$cp : ()Ljava/util/Set;
    //   9: aload_1
    //   10: invokevirtual getValue : ()Ljava/lang/Object;
    //   13: invokeinterface contains : (Ljava/lang/Object;)Z
    //   18: istore_2
    //   19: invokestatic access$getApostropheSet$cp : ()Ljava/util/Set;
    //   22: aload_1
    //   23: invokevirtual getValue : ()Ljava/lang/Object;
    //   26: invokeinterface contains : (Ljava/lang/Object;)Z
    //   31: ifeq -> 105
    //   34: aload_1
    //   35: invokevirtual getIndex : ()I
    //   38: aload_0
    //   39: getfield $text : Ljava/lang/CharSequence;
    //   42: invokeinterface length : ()I
    //   47: iconst_1
    //   48: isub
    //   49: if_icmpeq -> 101
    //   52: aload_1
    //   53: invokevirtual getIndex : ()I
    //   56: ifeq -> 101
    //   59: aload_0
    //   60: getfield $text : Ljava/lang/CharSequence;
    //   63: aload_1
    //   64: invokevirtual getIndex : ()I
    //   67: iconst_1
    //   68: iadd
    //   69: invokeinterface charAt : (I)C
    //   74: invokestatic isLetter : (C)Z
    //   77: ifeq -> 101
    //   80: aload_0
    //   81: getfield $text : Ljava/lang/CharSequence;
    //   84: aload_1
    //   85: invokevirtual getIndex : ()I
    //   88: iconst_1
    //   89: isub
    //   90: invokeinterface charAt : (I)C
    //   95: invokestatic isLetter : (C)Z
    //   98: ifne -> 105
    //   101: iconst_1
    //   102: goto -> 106
    //   105: iconst_0
    //   106: istore_3
    //   107: iload_2
    //   108: ifne -> 115
    //   111: iload_3
    //   112: ifeq -> 119
    //   115: iconst_1
    //   116: goto -> 120
    //   119: iconst_0
    //   120: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   123: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #25	-> 6
    //   #26	-> 19
    //   #28	-> 34
    //   #28	-> 77
    //   #28	-> 98
    //   #26	-> 106
    //   #30	-> 107
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   19	105	2	isQuote	Z
    //   107	17	3	isApostrophe	Z
    //   0	124	0	this	Lai/grazie/nlp/tokenizer/retokenizer/QuotesRetokenizer$retokenizeAsSequence$1;
    //   0	124	1	it	Lkotlin/collections/IndexedValue;
  }
  
  QuotesRetokenizer$retokenizeAsSequence$1(CharSequence $text) {
    super(1);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\retokenizer\QuotesRetokenizer$retokenizeAsSequence$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */