package ai.grazie.nlp.patterns.standard;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\r\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "text", "", "invoke", "(Ljava/lang/CharSequence;)Ljava/lang/Boolean;"})
@SourceDebugExtension({"SMAP\nStrictPatterns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StrictPatterns.kt\nai/grazie/nlp/patterns/standard/StrictPatterns$IsNumber$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,25:1\n1069#2,2:26\n*S KotlinDebug\n*F\n+ 1 StrictPatterns.kt\nai/grazie/nlp/patterns/standard/StrictPatterns$IsNumber$1\n*L\n7#1:26,2\n*E\n"})
final class StrictPatterns$IsNumber$1 extends Lambda implements Function1<CharSequence, Boolean> {
  public static final StrictPatterns$IsNumber$1 INSTANCE = new StrictPatterns$IsNumber$1();
  
  StrictPatterns$IsNumber$1() {
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
    //   21: if_icmpge -> 60
    //   24: aload_2
    //   25: iload #4
    //   27: invokeinterface charAt : (I)C
    //   32: istore #5
    //   34: iload #5
    //   36: istore #6
    //   38: iconst_0
    //   39: istore #7
    //   41: iload #6
    //   43: invokestatic isDigit : (C)Z
    //   46: nop
    //   47: ifne -> 54
    //   50: iconst_0
    //   51: goto -> 61
    //   54: iinc #4, 1
    //   57: goto -> 13
    //   60: iconst_1
    //   61: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   64: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #7	-> 6
    //   #26	-> 10
    //   #7	-> 41
    //   #7	-> 46
    //   #26	-> 47
    //   #27	-> 60
    //   #7	-> 64
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   41	6	7	$i$a$-all-StrictPatterns$IsNumber$1$1	I
    //   38	9	6	it	C
    //   34	20	5	element$iv	C
    //   10	51	3	$i$f$all	I
    //   8	53	2	$this$all$iv	Ljava/lang/CharSequence;
    //   0	65	0	this	Lai/grazie/nlp/patterns/standard/StrictPatterns$IsNumber$1;
    //   0	65	1	text	Ljava/lang/CharSequence;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\standard\StrictPatterns$IsNumber$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */