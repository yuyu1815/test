package ai.grazie.nlp.utils;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;

@Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\f\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "char", "", "invoke", "(C)Ljava/lang/Boolean;"})
@SourceDebugExtension({"SMAP\nSplit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Split.kt\nai/grazie/nlp/utils/SplitKt$splitWithRanges$3\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,56:1\n12567#2,2:57\n*S KotlinDebug\n*F\n+ 1 Split.kt\nai/grazie/nlp/utils/SplitKt$splitWithRanges$3\n*L\n45#1:57,2\n*E\n"})
final class SplitKt$splitWithRanges$3 extends Lambda implements Function1<Character, Boolean> {
  SplitKt$splitWithRanges$3(Regex[] $delimiter) {
    super(1);
  }
  
  public final Boolean invoke(char char) {
    // Byte code:
    //   0: aload_0
    //   1: getfield $delimiter : [Lkotlin/text/Regex;
    //   4: astore_2
    //   5: iconst_0
    //   6: istore_3
    //   7: iconst_0
    //   8: istore #4
    //   10: aload_2
    //   11: arraylength
    //   12: istore #5
    //   14: iload #4
    //   16: iload #5
    //   18: if_icmpge -> 59
    //   21: aload_2
    //   22: iload #4
    //   24: aaload
    //   25: astore #6
    //   27: aload #6
    //   29: astore #7
    //   31: iconst_0
    //   32: istore #8
    //   34: aload #7
    //   36: iload_1
    //   37: invokestatic valueOf : (C)Ljava/lang/String;
    //   40: checkcast java/lang/CharSequence
    //   43: invokevirtual matches : (Ljava/lang/CharSequence;)Z
    //   46: ifeq -> 53
    //   49: iconst_1
    //   50: goto -> 60
    //   53: iinc #4, 1
    //   56: goto -> 14
    //   59: iconst_0
    //   60: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   63: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #45	-> 0
    //   #57	-> 7
    //   #45	-> 34
    //   #57	-> 46
    //   #58	-> 59
    //   #45	-> 63
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   34	12	8	$i$a$-any-SplitKt$splitWithRanges$3$1	I
    //   31	15	7	it	Lkotlin/text/Regex;
    //   27	26	6	element$iv	Ljava/lang/Object;
    //   7	53	3	$i$f$any	I
    //   5	55	2	$this$any$iv	[Ljava/lang/Object;
    //   0	64	0	this	Lai/grazie/nlp/utils/SplitKt$splitWithRanges$3;
    //   0	64	1	char	C
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-common-jvm-0.4.32.jar!\ai\grazie\nl\\utils\SplitKt$splitWithRanges$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */