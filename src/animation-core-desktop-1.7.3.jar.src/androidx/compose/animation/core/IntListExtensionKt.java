package androidx.compose.animation.core;

import androidx.collection.IntList;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\020\b\n\002\030\002\n\002\b\004\032(\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0012\b\b\002\020\004\032\0020\0012\b\b\002\020\005\032\0020\001H\001¨\006\006"}, d2 = {"binarySearch", "", "Landroidx/collection/IntList;", "element", "fromIndex", "toIndex", "animation-core"})
@SourceDebugExtension({"SMAP\nIntListExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntListExtension.kt\nandroidx/compose/animation/core/IntListExtensionKt\n+ 2 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n*L\n1#1,75:1\n33#2,7:76\n*S KotlinDebug\n*F\n+ 1 IntListExtension.kt\nandroidx/compose/animation/core/IntListExtensionKt\n*L\n50#1:76,7\n*E\n"})
public final class IntListExtensionKt {
  @JvmOverloads
  public static final int binarySearch(@NotNull IntList $this$binarySearch, int element) {
    Intrinsics.checkNotNullParameter($this$binarySearch, "<this>");
    return binarySearch$default($this$binarySearch, element, 0, 0, 6, null);
  }
  
  @JvmOverloads
  public static final int binarySearch(@NotNull IntList $this$binarySearch, int element, int fromIndex) {
    Intrinsics.checkNotNullParameter($this$binarySearch, "<this>");
    return binarySearch$default($this$binarySearch, element, fromIndex, 0, 4, null);
  }
  
  @JvmOverloads
  public static final int binarySearch(@NotNull IntList $this$binarySearch, int element, int fromIndex, int toIndex) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: iload_2
    //   7: iload_3
    //   8: if_icmpgt -> 15
    //   11: iconst_1
    //   12: goto -> 16
    //   15: iconst_0
    //   16: istore #4
    //   18: iconst_0
    //   19: istore #5
    //   21: nop
    //   22: iload #4
    //   24: ifne -> 66
    //   27: iconst_0
    //   28: istore #6
    //   30: new java/lang/StringBuilder
    //   33: dup
    //   34: invokespecial <init> : ()V
    //   37: ldc 'fromIndex('
    //   39: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: iload_2
    //   43: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   46: ldc ') > toIndex('
    //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: iload_3
    //   52: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   55: bipush #41
    //   57: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   60: invokevirtual toString : ()Ljava/lang/String;
    //   63: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
    //   66: nop
    //   67: iload_2
    //   68: ifge -> 98
    //   71: new java/lang/IndexOutOfBoundsException
    //   74: dup
    //   75: new java/lang/StringBuilder
    //   78: dup
    //   79: invokespecial <init> : ()V
    //   82: ldc 'Index out of range: '
    //   84: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: iload_2
    //   88: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   91: invokevirtual toString : ()Ljava/lang/String;
    //   94: invokespecial <init> : (Ljava/lang/String;)V
    //   97: athrow
    //   98: iload_3
    //   99: aload_0
    //   100: invokevirtual getSize : ()I
    //   103: if_icmple -> 133
    //   106: new java/lang/IndexOutOfBoundsException
    //   109: dup
    //   110: new java/lang/StringBuilder
    //   113: dup
    //   114: invokespecial <init> : ()V
    //   117: ldc 'Index out of range: '
    //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: iload_3
    //   123: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   126: invokevirtual toString : ()Ljava/lang/String;
    //   129: invokespecial <init> : (Ljava/lang/String;)V
    //   132: athrow
    //   133: iload_2
    //   134: istore #4
    //   136: iload_3
    //   137: iconst_1
    //   138: isub
    //   139: istore #5
    //   141: iload #4
    //   143: iload #5
    //   145: if_icmpgt -> 198
    //   148: iload #4
    //   150: iload #5
    //   152: iadd
    //   153: iconst_1
    //   154: iushr
    //   155: istore #6
    //   157: aload_0
    //   158: iload #6
    //   160: invokevirtual get : (I)I
    //   163: istore #7
    //   165: iload #7
    //   167: iload_1
    //   168: if_icmpge -> 180
    //   171: iload #6
    //   173: iconst_1
    //   174: iadd
    //   175: istore #4
    //   177: goto -> 141
    //   180: iload #7
    //   182: iload_1
    //   183: if_icmple -> 195
    //   186: iload #6
    //   188: iconst_1
    //   189: isub
    //   190: istore #5
    //   192: goto -> 141
    //   195: iload #6
    //   197: ireturn
    //   198: iload #4
    //   200: iconst_1
    //   201: iadd
    //   202: ineg
    //   203: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #50	-> 6
    //   #76	-> 21
    //   #79	-> 22
    //   #80	-> 27
    //   #50	-> 30
    //   #80	-> 63
    //   #82	-> 66
    //   #51	-> 67
    //   #52	-> 71
    //   #54	-> 98
    //   #55	-> 106
    //   #58	-> 133
    //   #59	-> 136
    //   #61	-> 141
    //   #62	-> 148
    //   #63	-> 157
    //   #64	-> 165
    //   #65	-> 171
    //   #66	-> 180
    //   #68	-> 186
    //   #67	-> 190
    //   #70	-> 195
    //   #73	-> 198
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   30	33	6	$i$a$-requirePrecondition-IntListExtensionKt$binarySearch$1	I
    //   21	46	5	$i$f$requirePrecondition	I
    //   18	49	4	value$iv	Z
    //   157	41	6	mid	I
    //   165	33	7	midVal	I
    //   136	68	4	low	I
    //   141	63	5	high	I
    //   0	204	0	$this$binarySearch	Landroidx/collection/IntList;
    //   0	204	1	element	I
    //   0	204	2	fromIndex	I
    //   0	204	3	toIndex	I
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\IntListExtensionKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */