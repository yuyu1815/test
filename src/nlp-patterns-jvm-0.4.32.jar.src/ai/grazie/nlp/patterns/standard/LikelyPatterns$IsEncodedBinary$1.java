package ai.grazie.nlp.patterns.standard;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\r\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "text", "", "invoke", "(Ljava/lang/CharSequence;)Ljava/lang/Boolean;"})
@SourceDebugExtension({"SMAP\nLikelyPatterns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LikelyPatterns.kt\nai/grazie/nlp/patterns/standard/LikelyPatterns$IsEncodedBinary$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,508:1\n1069#2,2:509\n1088#2,2:511\n*S KotlinDebug\n*F\n+ 1 LikelyPatterns.kt\nai/grazie/nlp/patterns/standard/LikelyPatterns$IsEncodedBinary$1\n*L\n141#1:509,2\n141#1:511,2\n*E\n"})
final class LikelyPatterns$IsEncodedBinary$1 extends Lambda implements Function1<CharSequence, Boolean> {
  public static final LikelyPatterns$IsEncodedBinary$1 INSTANCE = new LikelyPatterns$IsEncodedBinary$1();
  
  public final Boolean invoke(CharSequence text) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'text'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: astore_2
    //   8: iconst_0
    //   9: istore_3
    //   10: iconst_0
    //   11: istore #4
    //   13: iload #4
    //   15: aload_2
    //   16: invokeinterface length : ()I
    //   21: if_icmpge -> 75
    //   24: aload_2
    //   25: iload #4
    //   27: invokeinterface charAt : (I)C
    //   32: istore #5
    //   34: iload #5
    //   36: istore #6
    //   38: iconst_0
    //   39: istore #7
    //   41: iload #6
    //   43: invokestatic isUpperCase : (C)Z
    //   46: ifne -> 57
    //   49: iload #6
    //   51: invokestatic isDigit : (C)Z
    //   54: ifeq -> 61
    //   57: iconst_1
    //   58: goto -> 62
    //   61: iconst_0
    //   62: ifne -> 69
    //   65: iconst_0
    //   66: goto -> 76
    //   69: iinc #4, 1
    //   72: goto -> 13
    //   75: iconst_1
    //   76: ifeq -> 199
    //   79: aload_1
    //   80: astore_2
    //   81: iconst_0
    //   82: istore_3
    //   83: iconst_0
    //   84: istore #4
    //   86: iload #4
    //   88: aload_2
    //   89: invokeinterface length : ()I
    //   94: if_icmpge -> 133
    //   97: aload_2
    //   98: iload #4
    //   100: invokeinterface charAt : (I)C
    //   105: istore #5
    //   107: iload #5
    //   109: istore #6
    //   111: iconst_0
    //   112: istore #7
    //   114: iload #6
    //   116: invokestatic isLetterOrDigit : (C)Z
    //   119: nop
    //   120: ifne -> 127
    //   123: iconst_0
    //   124: goto -> 134
    //   127: iinc #4, 1
    //   130: goto -> 86
    //   133: iconst_1
    //   134: ifeq -> 199
    //   137: aload_1
    //   138: astore_2
    //   139: iconst_0
    //   140: istore_3
    //   141: iconst_0
    //   142: istore #4
    //   144: iload #4
    //   146: aload_2
    //   147: invokeinterface length : ()I
    //   152: if_icmpge -> 191
    //   155: aload_2
    //   156: iload #4
    //   158: invokeinterface charAt : (I)C
    //   163: istore #5
    //   165: iload #5
    //   167: istore #6
    //   169: iconst_0
    //   170: istore #7
    //   172: iload #6
    //   174: invokestatic isDigit : (C)Z
    //   177: nop
    //   178: ifeq -> 185
    //   181: iconst_1
    //   182: goto -> 192
    //   185: iinc #4, 1
    //   188: goto -> 144
    //   191: iconst_0
    //   192: ifeq -> 199
    //   195: iconst_1
    //   196: goto -> 200
    //   199: iconst_0
    //   200: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   203: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #141	-> 6
    //   #509	-> 10
    //   #141	-> 41
    //   #141	-> 46
    //   #141	-> 54
    //   #509	-> 62
    //   #510	-> 75
    //   #141	-> 76
    //   #509	-> 83
    //   #141	-> 114
    //   #141	-> 119
    //   #509	-> 120
    //   #510	-> 133
    //   #141	-> 134
    //   #511	-> 141
    //   #141	-> 172
    //   #141	-> 177
    //   #511	-> 178
    //   #512	-> 191
    //   #141	-> 192
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   41	21	7	$i$a$-all-LikelyPatterns$IsEncodedBinary$1$1	I
    //   38	24	6	it	C
    //   34	35	5	element$iv	C
    //   10	66	3	$i$f$all	I
    //   8	68	2	$this$all$iv	Ljava/lang/CharSequence;
    //   114	6	7	$i$a$-all-LikelyPatterns$IsEncodedBinary$1$2	I
    //   111	9	6	it	C
    //   107	20	5	element$iv	C
    //   83	51	3	$i$f$all	I
    //   81	53	2	$this$all$iv	Ljava/lang/CharSequence;
    //   172	6	7	$i$a$-any-LikelyPatterns$IsEncodedBinary$1$3	I
    //   169	9	6	it	C
    //   165	20	5	element$iv	C
    //   141	51	3	$i$f$any	I
    //   139	53	2	$this$any$iv	Ljava/lang/CharSequence;
    //   0	204	0	this	Lai/grazie/nlp/patterns/standard/LikelyPatterns$IsEncodedBinary$1;
    //   0	204	1	text	Ljava/lang/CharSequence;
  }
  
  LikelyPatterns$IsEncodedBinary$1() {
    super(1);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\standard\LikelyPatterns$IsEncodedBinary$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */