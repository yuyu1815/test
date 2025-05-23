package ai.grazie.nlp.patterns;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\020\016\n\002\030\002\n\000\n\002\020\r\n\002\b\002\032\032\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0042\006\020\005\032\0020\001¨\006\006"}, d2 = {"replace", "", "Lai/grazie/nlp/patterns/Pattern;", "text", "", "value", "nlp-patterns"})
@SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nai/grazie/nlp/patterns/ExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,16:1\n1062#2:17\n1734#2,3:18\n1#3:21\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nai/grazie/nlp/patterns/ExtensionsKt\n*L\n6#1:17\n7#1:18,3\n*E\n"})
public final class ExtensionsKt {
  @NotNull
  public static final String replace(@NotNull Pattern $this$replace, @NotNull CharSequence text, @NotNull String value) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ldc 'text'
    //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_2
    //   13: ldc 'value'
    //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   18: aload_0
    //   19: aload_1
    //   20: invokeinterface find : (Ljava/lang/CharSequence;)Ljava/util/List;
    //   25: checkcast java/lang/Iterable
    //   28: astore #4
    //   30: iconst_0
    //   31: istore #5
    //   33: aload #4
    //   35: new ai/grazie/nlp/patterns/ExtensionsKt$replace$$inlined$sortedByDescending$1
    //   38: dup
    //   39: invokespecial <init> : ()V
    //   42: checkcast java/util/Comparator
    //   45: invokestatic sortedWith : (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
    //   48: astore_3
    //   49: aload_3
    //   50: checkcast java/lang/Iterable
    //   53: invokestatic zipWithNext : (Ljava/lang/Iterable;)Ljava/util/List;
    //   56: checkcast java/lang/Iterable
    //   59: astore #4
    //   61: iconst_0
    //   62: istore #5
    //   64: aload #4
    //   66: instanceof java/util/Collection
    //   69: ifeq -> 89
    //   72: aload #4
    //   74: checkcast java/util/Collection
    //   77: invokeinterface isEmpty : ()Z
    //   82: ifeq -> 89
    //   85: iconst_1
    //   86: goto -> 170
    //   89: aload #4
    //   91: invokeinterface iterator : ()Ljava/util/Iterator;
    //   96: astore #6
    //   98: aload #6
    //   100: invokeinterface hasNext : ()Z
    //   105: ifeq -> 169
    //   108: aload #6
    //   110: invokeinterface next : ()Ljava/lang/Object;
    //   115: astore #7
    //   117: aload #7
    //   119: checkcast kotlin/Pair
    //   122: astore #8
    //   124: iconst_0
    //   125: istore #9
    //   127: aload #8
    //   129: invokevirtual component1 : ()Ljava/lang/Object;
    //   132: checkcast ai/grazie/text/TextRange
    //   135: astore #10
    //   137: aload #8
    //   139: invokevirtual component2 : ()Ljava/lang/Object;
    //   142: checkcast ai/grazie/text/TextRange
    //   145: astore #11
    //   147: aload #10
    //   149: aload #11
    //   151: invokevirtual intersects : (Lai/grazie/text/TextRange;)Z
    //   154: ifne -> 161
    //   157: iconst_1
    //   158: goto -> 162
    //   161: iconst_0
    //   162: ifne -> 98
    //   165: iconst_0
    //   166: goto -> 170
    //   169: iconst_1
    //   170: ifne -> 193
    //   173: iconst_0
    //   174: istore #5
    //   176: ldc 'Ranges should not be intersecting'
    //   178: astore #5
    //   180: new java/lang/IllegalArgumentException
    //   183: dup
    //   184: aload #5
    //   186: invokevirtual toString : ()Ljava/lang/String;
    //   189: invokespecial <init> : (Ljava/lang/String;)V
    //   192: athrow
    //   193: aload_1
    //   194: invokevirtual toString : ()Ljava/lang/String;
    //   197: astore #4
    //   199: aload_3
    //   200: invokeinterface iterator : ()Ljava/util/Iterator;
    //   205: astore #5
    //   207: aload #5
    //   209: invokeinterface hasNext : ()Z
    //   214: ifeq -> 242
    //   217: aload #5
    //   219: invokeinterface next : ()Ljava/lang/Object;
    //   224: checkcast ai/grazie/text/TextRange
    //   227: astore #6
    //   229: aload #4
    //   231: aload #6
    //   233: aload_2
    //   234: invokestatic replace : (Ljava/lang/String;Lai/grazie/text/TextRange;Ljava/lang/String;)Ljava/lang/String;
    //   237: astore #4
    //   239: goto -> 207
    //   242: aload #4
    //   244: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #6	-> 18
    //   #17	-> 33
    //   #17	-> 45
    //   #6	-> 48
    //   #7	-> 49
    //   #18	-> 64
    //   #19	-> 89
    //   #7	-> 127
    //   #19	-> 162
    //   #20	-> 169
    //   #7	-> 170
    //   #21	-> 173
    //   #7	-> 176
    //   #7	-> 178
    //   #9	-> 193
    //   #10	-> 199
    //   #11	-> 229
    //   #14	-> 242
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   33	15	5	$i$f$sortedByDescending	I
    //   30	18	4	$this$sortedByDescending$iv	Ljava/lang/Iterable;
    //   127	35	9	$i$a$-all-ExtensionsKt$replace$1	I
    //   137	25	10	fst	Lai/grazie/text/TextRange;
    //   147	15	11	snd	Lai/grazie/text/TextRange;
    //   117	52	7	element$iv	Ljava/lang/Object;
    //   64	106	5	$i$f$all	I
    //   61	109	4	$this$all$iv	Ljava/lang/Iterable;
    //   176	2	5	$i$a$-require-ExtensionsKt$replace$2	I
    //   229	10	6	range	Lai/grazie/text/TextRange;
    //   49	196	3	ranges	Ljava/util/List;
    //   199	46	4	result	Ljava/lang/String;
    //   0	245	0	$this$replace	Lai/grazie/nlp/patterns/Pattern;
    //   0	245	1	text	Ljava/lang/CharSequence;
    //   0	245	2	value	Ljava/lang/String;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\ExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */