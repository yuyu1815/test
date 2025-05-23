package ai.grazie.nlp.patterns.standard;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\r\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "text", "", "invoke", "(Ljava/lang/CharSequence;)Ljava/lang/Boolean;"})
@SourceDebugExtension({"SMAP\nStrictPatterns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StrictPatterns.kt\nai/grazie/nlp/patterns/standard/StrictPatterns$HasNoLetters$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,25:1\n1069#2,2:26\n*S KotlinDebug\n*F\n+ 1 StrictPatterns.kt\nai/grazie/nlp/patterns/standard/StrictPatterns$HasNoLetters$1\n*L\n11#1:26,2\n*E\n"})
final class StrictPatterns$HasNoLetters$1 extends Lambda implements Function1<CharSequence, Boolean> {
  public static final StrictPatterns$HasNoLetters$1 INSTANCE = new StrictPatterns$HasNoLetters$1();
  
  StrictPatterns$HasNoLetters$1() {
    super(1);
  }
  
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
    //   21: if_icmpge -> 67
    //   24: aload_2
    //   25: iload #4
    //   27: invokeinterface charAt : (I)C
    //   32: istore #5
    //   34: iload #5
    //   36: istore #6
    //   38: iconst_0
    //   39: istore #7
    //   41: iload #6
    //   43: invokestatic isLetter : (C)Z
    //   46: ifne -> 53
    //   49: iconst_1
    //   50: goto -> 54
    //   53: iconst_0
    //   54: ifne -> 61
    //   57: iconst_0
    //   58: goto -> 68
    //   61: iinc #4, 1
    //   64: goto -> 13
    //   67: iconst_1
    //   68: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   71: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #11	-> 6
    //   #26	-> 10
    //   #11	-> 41
    //   #11	-> 46
    //   #26	-> 54
    //   #27	-> 67
    //   #11	-> 71
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   41	13	7	$i$a$-all-StrictPatterns$HasNoLetters$1$1	I
    //   38	16	6	it	C
    //   34	27	5	element$iv	C
    //   10	58	3	$i$f$all	I
    //   8	60	2	$this$all$iv	Ljava/lang/CharSequence;
    //   0	72	0	this	Lai/grazie/nlp/patterns/standard/StrictPatterns$HasNoLetters$1;
    //   0	72	1	text	Ljava/lang/CharSequence;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\standard\StrictPatterns$HasNoLetters$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */