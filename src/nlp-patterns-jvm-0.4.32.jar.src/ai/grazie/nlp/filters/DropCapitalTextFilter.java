package ai.grazie.nlp.filters;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\020\016\n\000\030\0002\0020\001B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"Lai/grazie/nlp/filters/DropCapitalTextFilter;", "Lai/grazie/nlp/filters/TextFilter;", "()V", "shouldRetain", "", "text", "", "nlp-patterns"})
@SourceDebugExtension({"SMAP\nDropCapitalTextFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DropCapitalTextFilter.kt\nai/grazie/nlp/filters/DropCapitalTextFilter\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,12:1\n1771#2,2:13\n*S KotlinDebug\n*F\n+ 1 DropCapitalTextFilter.kt\nai/grazie/nlp/filters/DropCapitalTextFilter\n*L\n9#1:13,2\n*E\n"})
public final class DropCapitalTextFilter implements TextFilter {
  public boolean shouldRetain(@NotNull String text) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'text'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: checkcast java/lang/CharSequence
    //   10: astore_2
    //   11: iconst_0
    //   12: istore_3
    //   13: iconst_0
    //   14: istore #4
    //   16: iload #4
    //   18: aload_2
    //   19: invokeinterface length : ()I
    //   24: if_icmpge -> 78
    //   27: aload_2
    //   28: iload #4
    //   30: invokeinterface charAt : (I)C
    //   35: istore #5
    //   37: iload #5
    //   39: istore #6
    //   41: iconst_0
    //   42: istore #7
    //   44: iload #6
    //   46: invokestatic isLetter : (C)Z
    //   49: ifeq -> 64
    //   52: iload #6
    //   54: invokestatic isUpperCase : (C)Z
    //   57: ifeq -> 64
    //   60: iconst_1
    //   61: goto -> 65
    //   64: iconst_0
    //   65: ifeq -> 72
    //   68: iconst_0
    //   69: goto -> 79
    //   72: iinc #4, 1
    //   75: goto -> 16
    //   78: iconst_1
    //   79: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #9	-> 6
    //   #13	-> 13
    //   #9	-> 44
    //   #9	-> 49
    //   #9	-> 57
    //   #13	-> 65
    //   #14	-> 78
    //   #9	-> 79
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   44	21	7	$i$a$-none-DropCapitalTextFilter$shouldRetain$1	I
    //   41	24	6	it	C
    //   37	35	5	element$iv	C
    //   13	66	3	$i$f$none	I
    //   11	68	2	$this$none$iv	Ljava/lang/CharSequence;
    //   0	80	0	this	Lai/grazie/nlp/filters/DropCapitalTextFilter;
    //   0	80	1	text	Ljava/lang/String;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\filters\DropCapitalTextFilter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */