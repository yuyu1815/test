package ai.grazie.nlp.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\b\b\032\n\020\000\032\0020\001*\0020\001\032\n\020\002\032\0020\001*\0020\001\032\n\020\003\032\0020\001*\0020\001\032\n\020\004\032\0020\001*\0020\001\032\n\020\005\032\0020\001*\0020\001\032\n\020\006\032\0020\001*\0020\001\032\n\020\007\032\0020\001*\0020\001\032\n\020\b\032\0020\001*\0020\001¨\006\t"}, d2 = {"dropLastNonWhitespaces", "", "dropLastWhitespaces", "dropNonWhitespaces", "dropWhitespaces", "takeLastNonWhitespaces", "takeLastWhitespaces", "takeNonWhitespaces", "takeWhitespaces", "nlp-common"})
@SourceDebugExtension({"SMAP\nWhiteSpaces.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhiteSpaces.kt\nai/grazie/nlp/utils/WhiteSpacesKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,14:1\n389#2,4:15\n389#2,4:19\n413#2,4:23\n413#2,4:27\n621#2,6:31\n621#2,6:37\n648#2,5:43\n648#2,5:48\n*S KotlinDebug\n*F\n+ 1 WhiteSpaces.kt\nai/grazie/nlp/utils/WhiteSpacesKt\n*L\n3#1:15,4\n4#1:19,4\n6#1:23,4\n7#1:27,4\n9#1:31,6\n10#1:37,6\n12#1:43,5\n13#1:48,5\n*E\n"})
public final class WhiteSpacesKt {
  @NotNull
  public static final String dropLastNonWhitespaces(@NotNull String $this$dropLastNonWhitespaces) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: astore_1
    //   8: iconst_0
    //   9: istore_2
    //   10: aload_1
    //   11: checkcast java/lang/CharSequence
    //   14: invokestatic getLastIndex : (Ljava/lang/CharSequence;)I
    //   17: istore_3
    //   18: iconst_m1
    //   19: iload_3
    //   20: if_icmpge -> 84
    //   23: aload_1
    //   24: iload_3
    //   25: invokevirtual charAt : (I)C
    //   28: istore #4
    //   30: iconst_0
    //   31: istore #5
    //   33: iload #4
    //   35: invokestatic isWhitespace : (C)Z
    //   38: ifne -> 45
    //   41: iconst_1
    //   42: goto -> 46
    //   45: iconst_0
    //   46: ifne -> 78
    //   49: aload_1
    //   50: astore #4
    //   52: iconst_0
    //   53: istore #5
    //   55: iload_3
    //   56: iconst_1
    //   57: iadd
    //   58: istore #6
    //   60: aload #4
    //   62: iload #5
    //   64: iload #6
    //   66: invokevirtual substring : (II)Ljava/lang/String;
    //   69: dup
    //   70: ldc 'substring(...)'
    //   72: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   75: goto -> 86
    //   78: iinc #3, -1
    //   81: goto -> 18
    //   84: ldc ''
    //   86: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #3	-> 6
    //   #15	-> 10
    //   #16	-> 23
    //   #3	-> 33
    //   #16	-> 46
    //   #17	-> 49
    //   #17	-> 75
    //   #15	-> 78
    //   #18	-> 84
    //   #3	-> 86
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   33	13	5	$i$a$-dropLastWhile-WhiteSpacesKt$dropLastNonWhitespaces$1	I
    //   30	16	4	it	C
    //   18	66	3	index$iv	I
    //   10	76	2	$i$f$dropLastWhile	I
    //   8	78	1	$this$dropLastWhile$iv	Ljava/lang/String;
    //   0	87	0	$this$dropLastNonWhitespaces	Ljava/lang/String;
  }
  
  @NotNull
  public static final String dropLastWhitespaces(@NotNull String $this$dropLastWhitespaces) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: astore_1
    //   8: iconst_0
    //   9: istore_2
    //   10: aload_1
    //   11: checkcast java/lang/CharSequence
    //   14: invokestatic getLastIndex : (Ljava/lang/CharSequence;)I
    //   17: istore_3
    //   18: iconst_m1
    //   19: iload_3
    //   20: if_icmpge -> 76
    //   23: aload_1
    //   24: iload_3
    //   25: invokevirtual charAt : (I)C
    //   28: istore #4
    //   30: iconst_0
    //   31: istore #5
    //   33: iload #4
    //   35: invokestatic isWhitespace : (C)Z
    //   38: ifne -> 70
    //   41: aload_1
    //   42: astore #4
    //   44: iconst_0
    //   45: istore #5
    //   47: iload_3
    //   48: iconst_1
    //   49: iadd
    //   50: istore #6
    //   52: aload #4
    //   54: iload #5
    //   56: iload #6
    //   58: invokevirtual substring : (II)Ljava/lang/String;
    //   61: dup
    //   62: ldc 'substring(...)'
    //   64: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   67: goto -> 78
    //   70: iinc #3, -1
    //   73: goto -> 18
    //   76: ldc ''
    //   78: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #4	-> 6
    //   #19	-> 10
    //   #20	-> 23
    //   #4	-> 33
    //   #20	-> 38
    //   #21	-> 41
    //   #21	-> 67
    //   #19	-> 70
    //   #22	-> 76
    //   #4	-> 78
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   33	5	5	$i$a$-dropLastWhile-WhiteSpacesKt$dropLastWhitespaces$1	I
    //   30	8	4	it	C
    //   18	58	3	index$iv	I
    //   10	68	2	$i$f$dropLastWhile	I
    //   8	70	1	$this$dropLastWhile$iv	Ljava/lang/String;
    //   0	79	0	$this$dropLastWhitespaces	Ljava/lang/String;
  }
  
  @NotNull
  public static final String dropWhitespaces(@NotNull String $this$dropWhitespaces) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: astore_1
    //   8: iconst_0
    //   9: istore_2
    //   10: iconst_0
    //   11: istore_3
    //   12: aload_1
    //   13: checkcast java/lang/CharSequence
    //   16: invokeinterface length : ()I
    //   21: istore #4
    //   23: iload_3
    //   24: iload #4
    //   26: if_icmpge -> 67
    //   29: aload_1
    //   30: iload_3
    //   31: invokevirtual charAt : (I)C
    //   34: istore #5
    //   36: iconst_0
    //   37: istore #6
    //   39: iload #5
    //   41: invokestatic isWhitespace : (C)Z
    //   44: ifne -> 61
    //   47: aload_1
    //   48: iload_3
    //   49: invokevirtual substring : (I)Ljava/lang/String;
    //   52: dup
    //   53: ldc 'substring(...)'
    //   55: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   58: goto -> 69
    //   61: iinc #3, 1
    //   64: goto -> 23
    //   67: ldc ''
    //   69: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #6	-> 6
    //   #23	-> 10
    //   #24	-> 29
    //   #6	-> 39
    //   #24	-> 44
    //   #25	-> 47
    //   #25	-> 58
    //   #23	-> 61
    //   #26	-> 67
    //   #6	-> 69
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   39	5	6	$i$a$-dropWhile-WhiteSpacesKt$dropWhitespaces$1	I
    //   36	8	5	it	C
    //   12	55	3	index$iv	I
    //   10	59	2	$i$f$dropWhile	I
    //   8	61	1	$this$dropWhile$iv	Ljava/lang/String;
    //   0	70	0	$this$dropWhitespaces	Ljava/lang/String;
  }
  
  @NotNull
  public static final String dropNonWhitespaces(@NotNull String $this$dropNonWhitespaces) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: astore_1
    //   8: iconst_0
    //   9: istore_2
    //   10: iconst_0
    //   11: istore_3
    //   12: aload_1
    //   13: checkcast java/lang/CharSequence
    //   16: invokeinterface length : ()I
    //   21: istore #4
    //   23: iload_3
    //   24: iload #4
    //   26: if_icmpge -> 75
    //   29: aload_1
    //   30: iload_3
    //   31: invokevirtual charAt : (I)C
    //   34: istore #5
    //   36: iconst_0
    //   37: istore #6
    //   39: iload #5
    //   41: invokestatic isWhitespace : (C)Z
    //   44: ifne -> 51
    //   47: iconst_1
    //   48: goto -> 52
    //   51: iconst_0
    //   52: ifne -> 69
    //   55: aload_1
    //   56: iload_3
    //   57: invokevirtual substring : (I)Ljava/lang/String;
    //   60: dup
    //   61: ldc 'substring(...)'
    //   63: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   66: goto -> 77
    //   69: iinc #3, 1
    //   72: goto -> 23
    //   75: ldc ''
    //   77: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #7	-> 6
    //   #27	-> 10
    //   #28	-> 29
    //   #7	-> 39
    //   #28	-> 52
    //   #29	-> 55
    //   #29	-> 66
    //   #27	-> 69
    //   #30	-> 75
    //   #7	-> 77
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   39	13	6	$i$a$-dropWhile-WhiteSpacesKt$dropNonWhitespaces$1	I
    //   36	16	5	it	C
    //   12	63	3	index$iv	I
    //   10	67	2	$i$f$dropWhile	I
    //   8	69	1	$this$dropWhile$iv	Ljava/lang/String;
    //   0	78	0	$this$dropNonWhitespaces	Ljava/lang/String;
  }
  
  @NotNull
  public static final String takeLastWhitespaces(@NotNull String $this$takeLastWhitespaces) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: astore_1
    //   8: iconst_0
    //   9: istore_2
    //   10: aload_1
    //   11: checkcast java/lang/CharSequence
    //   14: invokestatic getLastIndex : (Ljava/lang/CharSequence;)I
    //   17: istore_3
    //   18: iconst_m1
    //   19: iload_3
    //   20: if_icmpge -> 71
    //   23: aload_1
    //   24: iload_3
    //   25: invokevirtual charAt : (I)C
    //   28: istore #4
    //   30: iconst_0
    //   31: istore #5
    //   33: iload #4
    //   35: invokestatic isWhitespace : (C)Z
    //   38: ifne -> 65
    //   41: aload_1
    //   42: astore #4
    //   44: iload_3
    //   45: iconst_1
    //   46: iadd
    //   47: istore #5
    //   49: aload #4
    //   51: iload #5
    //   53: invokevirtual substring : (I)Ljava/lang/String;
    //   56: dup
    //   57: ldc 'substring(...)'
    //   59: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   62: goto -> 72
    //   65: iinc #3, -1
    //   68: goto -> 18
    //   71: aload_1
    //   72: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #9	-> 6
    //   #31	-> 10
    //   #32	-> 23
    //   #9	-> 33
    //   #32	-> 38
    //   #33	-> 41
    //   #33	-> 62
    //   #31	-> 65
    //   #36	-> 71
    //   #9	-> 72
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   33	5	5	$i$a$-takeLastWhile-WhiteSpacesKt$takeLastWhitespaces$1	I
    //   30	8	4	it	C
    //   18	53	3	index$iv	I
    //   10	62	2	$i$f$takeLastWhile	I
    //   8	64	1	$this$takeLastWhile$iv	Ljava/lang/String;
    //   0	73	0	$this$takeLastWhitespaces	Ljava/lang/String;
  }
  
  @NotNull
  public static final String takeLastNonWhitespaces(@NotNull String $this$takeLastNonWhitespaces) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: astore_1
    //   8: iconst_0
    //   9: istore_2
    //   10: aload_1
    //   11: checkcast java/lang/CharSequence
    //   14: invokestatic getLastIndex : (Ljava/lang/CharSequence;)I
    //   17: istore_3
    //   18: iconst_m1
    //   19: iload_3
    //   20: if_icmpge -> 79
    //   23: aload_1
    //   24: iload_3
    //   25: invokevirtual charAt : (I)C
    //   28: istore #4
    //   30: iconst_0
    //   31: istore #5
    //   33: iload #4
    //   35: invokestatic isWhitespace : (C)Z
    //   38: ifne -> 45
    //   41: iconst_1
    //   42: goto -> 46
    //   45: iconst_0
    //   46: ifne -> 73
    //   49: aload_1
    //   50: astore #4
    //   52: iload_3
    //   53: iconst_1
    //   54: iadd
    //   55: istore #5
    //   57: aload #4
    //   59: iload #5
    //   61: invokevirtual substring : (I)Ljava/lang/String;
    //   64: dup
    //   65: ldc 'substring(...)'
    //   67: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   70: goto -> 80
    //   73: iinc #3, -1
    //   76: goto -> 18
    //   79: aload_1
    //   80: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #10	-> 6
    //   #37	-> 10
    //   #38	-> 23
    //   #10	-> 33
    //   #38	-> 46
    //   #39	-> 49
    //   #39	-> 70
    //   #37	-> 73
    //   #42	-> 79
    //   #10	-> 80
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   33	13	5	$i$a$-takeLastWhile-WhiteSpacesKt$takeLastNonWhitespaces$1	I
    //   30	16	4	it	C
    //   18	61	3	index$iv	I
    //   10	70	2	$i$f$takeLastWhile	I
    //   8	72	1	$this$takeLastWhile$iv	Ljava/lang/String;
    //   0	81	0	$this$takeLastNonWhitespaces	Ljava/lang/String;
  }
  
  @NotNull
  public static final String takeWhitespaces(@NotNull String $this$takeWhitespaces) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: astore_1
    //   8: iconst_0
    //   9: istore_2
    //   10: iconst_0
    //   11: istore_3
    //   12: aload_1
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iload_3
    //   19: iload #4
    //   21: if_icmpge -> 71
    //   24: aload_1
    //   25: iload_3
    //   26: invokevirtual charAt : (I)C
    //   29: istore #5
    //   31: iconst_0
    //   32: istore #6
    //   34: iload #5
    //   36: invokestatic isWhitespace : (C)Z
    //   39: ifne -> 65
    //   42: aload_1
    //   43: astore #5
    //   45: iconst_0
    //   46: istore #6
    //   48: aload #5
    //   50: iload #6
    //   52: iload_3
    //   53: invokevirtual substring : (II)Ljava/lang/String;
    //   56: dup
    //   57: ldc 'substring(...)'
    //   59: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   62: goto -> 72
    //   65: iinc #3, 1
    //   68: goto -> 18
    //   71: aload_1
    //   72: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #12	-> 6
    //   #43	-> 10
    //   #44	-> 24
    //   #12	-> 34
    //   #44	-> 39
    //   #45	-> 42
    //   #45	-> 62
    //   #43	-> 65
    //   #47	-> 71
    //   #12	-> 72
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   34	5	6	$i$a$-takeWhile-WhiteSpacesKt$takeWhitespaces$1	I
    //   31	8	5	it	C
    //   12	59	3	index$iv	I
    //   10	62	2	$i$f$takeWhile	I
    //   8	64	1	$this$takeWhile$iv	Ljava/lang/String;
    //   0	73	0	$this$takeWhitespaces	Ljava/lang/String;
  }
  
  @NotNull
  public static final String takeNonWhitespaces(@NotNull String $this$takeNonWhitespaces) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: astore_1
    //   8: iconst_0
    //   9: istore_2
    //   10: iconst_0
    //   11: istore_3
    //   12: aload_1
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iload_3
    //   19: iload #4
    //   21: if_icmpge -> 79
    //   24: aload_1
    //   25: iload_3
    //   26: invokevirtual charAt : (I)C
    //   29: istore #5
    //   31: iconst_0
    //   32: istore #6
    //   34: iload #5
    //   36: invokestatic isWhitespace : (C)Z
    //   39: ifne -> 46
    //   42: iconst_1
    //   43: goto -> 47
    //   46: iconst_0
    //   47: ifne -> 73
    //   50: aload_1
    //   51: astore #5
    //   53: iconst_0
    //   54: istore #6
    //   56: aload #5
    //   58: iload #6
    //   60: iload_3
    //   61: invokevirtual substring : (II)Ljava/lang/String;
    //   64: dup
    //   65: ldc 'substring(...)'
    //   67: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   70: goto -> 80
    //   73: iinc #3, 1
    //   76: goto -> 18
    //   79: aload_1
    //   80: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #13	-> 6
    //   #48	-> 10
    //   #49	-> 24
    //   #13	-> 34
    //   #49	-> 47
    //   #50	-> 50
    //   #50	-> 70
    //   #48	-> 73
    //   #52	-> 79
    //   #13	-> 80
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   34	13	6	$i$a$-takeWhile-WhiteSpacesKt$takeNonWhitespaces$1	I
    //   31	16	5	it	C
    //   12	67	3	index$iv	I
    //   10	70	2	$i$f$takeWhile	I
    //   8	72	1	$this$takeWhile$iv	Ljava/lang/String;
    //   0	81	0	$this$takeNonWhitespaces	Ljava/lang/String;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-common-jvm-0.4.32.jar!\ai\grazie\nl\\utils\WhiteSpacesKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */