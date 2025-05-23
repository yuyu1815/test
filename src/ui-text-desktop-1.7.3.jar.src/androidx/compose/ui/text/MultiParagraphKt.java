/*      */ package androidx.compose.ui.text;
/*      */ 
/*      */ import java.util.List;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000.\n\000\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\002\b\005\n\002\020\007\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\032\036\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\001H\000\032\036\020\006\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\0032\006\020\007\032\0020\001H\000\032\036\020\b\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\0032\006\020\t\032\0020\nH\000\032<\020\013\032\0020\f2\f\020\002\032\b\022\004\022\0020\0040\0032\006\020\r\032\0020\0162\022\020\017\032\016\022\004\022\0020\004\022\004\022\0020\f0\020H\000ø\001\000¢\006\004\b\021\020\022\032-\020\023\032\0020\001\"\004\b\000\020\024*\b\022\004\022\002H\0240\0032\022\020\025\032\016\022\004\022\002H\024\022\004\022\0020\0010\020H\b\002\007\n\005\b¡\0360\001¨\006\026"}, d2 = {"findParagraphByIndex", "", "paragraphInfoList", "", "Landroidx/compose/ui/text/ParagraphInfo;", "index", "findParagraphByLineIndex", "lineIndex", "findParagraphByY", "y", "", "findParagraphsByRange", "", "range", "Landroidx/compose/ui/text/TextRange;", "action", "Lkotlin/Function1;", "findParagraphsByRange-Sb-Bc2M", "(Ljava/util/List;JLkotlin/jvm/functions/Function1;)V", "fastBinarySearch", "T", "comparison", "ui-text"})
/*      */ @SourceDebugExtension({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n*L\n1#1,1145:1\n1001#1,16:1146\n1001#1,16:1162\n1001#1,16:1178\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n*L\n936#1:1146,16\n957#1:1162,16\n991#1:1178,16\n*E\n"})
/*      */ public final class MultiParagraphKt
/*      */ {
/*      */   public static final int findParagraphByIndex(@NotNull List paragraphInfoList, int index) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: ldc 'paragraphInfoList'
/*      */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   6: aload_0
/*      */     //   7: astore_2
/*      */     //   8: iconst_0
/*      */     //   9: istore_3
/*      */     //   10: iconst_0
/*      */     //   11: istore #4
/*      */     //   13: aload_2
/*      */     //   14: invokeinterface size : ()I
/*      */     //   19: iconst_1
/*      */     //   20: isub
/*      */     //   21: istore #5
/*      */     //   23: iload #4
/*      */     //   25: iload #5
/*      */     //   27: if_icmpgt -> 123
/*      */     //   30: iload #4
/*      */     //   32: iload #5
/*      */     //   34: iadd
/*      */     //   35: iconst_1
/*      */     //   36: iushr
/*      */     //   37: istore #6
/*      */     //   39: aload_2
/*      */     //   40: iload #6
/*      */     //   42: invokeinterface get : (I)Ljava/lang/Object;
/*      */     //   47: astore #7
/*      */     //   49: aload #7
/*      */     //   51: checkcast androidx/compose/ui/text/ParagraphInfo
/*      */     //   54: astore #8
/*      */     //   56: iconst_0
/*      */     //   57: istore #9
/*      */     //   59: nop
/*      */     //   60: aload #8
/*      */     //   62: invokevirtual getStartIndex : ()I
/*      */     //   65: iload_1
/*      */     //   66: if_icmple -> 73
/*      */     //   69: iconst_1
/*      */     //   70: goto -> 87
/*      */     //   73: aload #8
/*      */     //   75: invokevirtual getEndIndex : ()I
/*      */     //   78: iload_1
/*      */     //   79: if_icmpgt -> 86
/*      */     //   82: iconst_m1
/*      */     //   83: goto -> 87
/*      */     //   86: iconst_0
/*      */     //   87: nop
/*      */     //   88: istore #8
/*      */     //   90: iload #8
/*      */     //   92: ifge -> 104
/*      */     //   95: iload #6
/*      */     //   97: iconst_1
/*      */     //   98: iadd
/*      */     //   99: istore #4
/*      */     //   101: goto -> 23
/*      */     //   104: iload #8
/*      */     //   106: ifle -> 118
/*      */     //   109: iload #6
/*      */     //   111: iconst_1
/*      */     //   112: isub
/*      */     //   113: istore #5
/*      */     //   115: goto -> 23
/*      */     //   118: iload #6
/*      */     //   120: goto -> 128
/*      */     //   123: iload #4
/*      */     //   125: iconst_1
/*      */     //   126: iadd
/*      */     //   127: ineg
/*      */     //   128: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #936	-> 6
/*      */     //   #1146	-> 10
/*      */     //   #1147	-> 13
/*      */     //   #1149	-> 23
/*      */     //   #1150	-> 30
/*      */     //   #1151	-> 39
/*      */     //   #1152	-> 49
/*      */     //   #937	-> 59
/*      */     //   #938	-> 60
/*      */     //   #939	-> 73
/*      */     //   #940	-> 86
/*      */     //   #937	-> 87
/*      */     //   #1152	-> 88
/*      */     //   #1154	-> 90
/*      */     //   #1155	-> 95
/*      */     //   #1156	-> 104
/*      */     //   #1157	-> 109
/*      */     //   #1159	-> 118
/*      */     //   #1161	-> 123
/*      */     //   #936	-> 128
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   59	29	9	$i$a$-fastBinarySearch-MultiParagraphKt$findParagraphByIndex$1	I
/*      */     //   56	32	8	paragraphInfo	Landroidx/compose/ui/text/ParagraphInfo;
/*      */     //   39	84	6	mid$iv	I
/*      */     //   49	74	7	midVal$iv	Ljava/lang/Object;
/*      */     //   90	33	8	cmp$iv	I
/*      */     //   10	118	3	$i$f$fastBinarySearch	I
/*      */     //   13	115	4	low$iv	I
/*      */     //   23	105	5	high$iv	I
/*      */     //   8	120	2	$this$fastBinarySearch$iv	Ljava/util/List;
/*      */     //   0	129	0	paragraphInfoList	Ljava/util/List;
/*      */     //   0	129	1	index	I
/*      */   }
/*      */   
/*      */   public static final int findParagraphByY(@NotNull List paragraphInfoList, float y) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: ldc 'paragraphInfoList'
/*      */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   6: fload_1
/*      */     //   7: fconst_0
/*      */     //   8: fcmpg
/*      */     //   9: ifgt -> 14
/*      */     //   12: iconst_0
/*      */     //   13: ireturn
/*      */     //   14: fload_1
/*      */     //   15: aload_0
/*      */     //   16: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
/*      */     //   19: checkcast androidx/compose/ui/text/ParagraphInfo
/*      */     //   22: invokevirtual getBottom : ()F
/*      */     //   25: fcmpl
/*      */     //   26: iflt -> 34
/*      */     //   29: aload_0
/*      */     //   30: invokestatic getLastIndex : (Ljava/util/List;)I
/*      */     //   33: ireturn
/*      */     //   34: aload_0
/*      */     //   35: astore_2
/*      */     //   36: iconst_0
/*      */     //   37: istore_3
/*      */     //   38: iconst_0
/*      */     //   39: istore #4
/*      */     //   41: aload_2
/*      */     //   42: invokeinterface size : ()I
/*      */     //   47: iconst_1
/*      */     //   48: isub
/*      */     //   49: istore #5
/*      */     //   51: iload #4
/*      */     //   53: iload #5
/*      */     //   55: if_icmpgt -> 153
/*      */     //   58: iload #4
/*      */     //   60: iload #5
/*      */     //   62: iadd
/*      */     //   63: iconst_1
/*      */     //   64: iushr
/*      */     //   65: istore #6
/*      */     //   67: aload_2
/*      */     //   68: iload #6
/*      */     //   70: invokeinterface get : (I)Ljava/lang/Object;
/*      */     //   75: astore #7
/*      */     //   77: aload #7
/*      */     //   79: checkcast androidx/compose/ui/text/ParagraphInfo
/*      */     //   82: astore #8
/*      */     //   84: iconst_0
/*      */     //   85: istore #9
/*      */     //   87: nop
/*      */     //   88: aload #8
/*      */     //   90: invokevirtual getTop : ()F
/*      */     //   93: fload_1
/*      */     //   94: fcmpl
/*      */     //   95: ifle -> 102
/*      */     //   98: iconst_1
/*      */     //   99: goto -> 117
/*      */     //   102: aload #8
/*      */     //   104: invokevirtual getBottom : ()F
/*      */     //   107: fload_1
/*      */     //   108: fcmpg
/*      */     //   109: ifgt -> 116
/*      */     //   112: iconst_m1
/*      */     //   113: goto -> 117
/*      */     //   116: iconst_0
/*      */     //   117: nop
/*      */     //   118: istore #8
/*      */     //   120: iload #8
/*      */     //   122: ifge -> 134
/*      */     //   125: iload #6
/*      */     //   127: iconst_1
/*      */     //   128: iadd
/*      */     //   129: istore #4
/*      */     //   131: goto -> 51
/*      */     //   134: iload #8
/*      */     //   136: ifle -> 148
/*      */     //   139: iload #6
/*      */     //   141: iconst_1
/*      */     //   142: isub
/*      */     //   143: istore #5
/*      */     //   145: goto -> 51
/*      */     //   148: iload #6
/*      */     //   150: goto -> 158
/*      */     //   153: iload #4
/*      */     //   155: iconst_1
/*      */     //   156: iadd
/*      */     //   157: ineg
/*      */     //   158: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #955	-> 6
/*      */     //   #956	-> 14
/*      */     //   #957	-> 34
/*      */     //   #1162	-> 38
/*      */     //   #1163	-> 41
/*      */     //   #1165	-> 51
/*      */     //   #1166	-> 58
/*      */     //   #1167	-> 67
/*      */     //   #1168	-> 77
/*      */     //   #958	-> 87
/*      */     //   #959	-> 88
/*      */     //   #960	-> 102
/*      */     //   #961	-> 116
/*      */     //   #958	-> 117
/*      */     //   #1168	-> 118
/*      */     //   #1170	-> 120
/*      */     //   #1171	-> 125
/*      */     //   #1172	-> 134
/*      */     //   #1173	-> 139
/*      */     //   #1175	-> 148
/*      */     //   #1177	-> 153
/*      */     //   #957	-> 158
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   87	31	9	$i$a$-fastBinarySearch-MultiParagraphKt$findParagraphByY$1	I
/*      */     //   84	34	8	paragraphInfo	Landroidx/compose/ui/text/ParagraphInfo;
/*      */     //   67	86	6	mid$iv	I
/*      */     //   77	76	7	midVal$iv	Ljava/lang/Object;
/*      */     //   120	33	8	cmp$iv	I
/*      */     //   38	120	3	$i$f$fastBinarySearch	I
/*      */     //   41	117	4	low$iv	I
/*      */     //   51	107	5	high$iv	I
/*      */     //   36	122	2	$this$fastBinarySearch$iv	Ljava/util/List;
/*      */     //   0	159	0	paragraphInfoList	Ljava/util/List;
/*      */     //   0	159	1	y	F
/*      */   }
/*      */   
/*      */   public static final void findParagraphsByRange-Sb-Bc2M(@NotNull List<ParagraphInfo> paragraphInfoList, long range, @NotNull Function1 action) {
/*  971 */     Intrinsics.checkNotNullParameter(paragraphInfoList, "paragraphInfoList"); Intrinsics.checkNotNullParameter(action, "action"); int paragraphIndex = findParagraphByIndex(paragraphInfoList, TextRange.getMin-impl(range));
/*  972 */     for (int i = paragraphIndex, j = paragraphInfoList.size(); i < j; ) {
/*  973 */       ParagraphInfo paragraph = paragraphInfoList.get(i);
/*  974 */       if (paragraph.getStartIndex() < TextRange.getMax-impl(range)) {
/*  975 */         if (paragraph.getStartIndex() != paragraph.getEndIndex()) {
/*  976 */           action.invoke(paragraph);
/*      */         }
/*      */         i++;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int findParagraphByLineIndex(@NotNull List paragraphInfoList, int lineIndex) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: ldc 'paragraphInfoList'
/*      */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   6: aload_0
/*      */     //   7: astore_2
/*      */     //   8: iconst_0
/*      */     //   9: istore_3
/*      */     //   10: iconst_0
/*      */     //   11: istore #4
/*      */     //   13: aload_2
/*      */     //   14: invokeinterface size : ()I
/*      */     //   19: iconst_1
/*      */     //   20: isub
/*      */     //   21: istore #5
/*      */     //   23: iload #4
/*      */     //   25: iload #5
/*      */     //   27: if_icmpgt -> 123
/*      */     //   30: iload #4
/*      */     //   32: iload #5
/*      */     //   34: iadd
/*      */     //   35: iconst_1
/*      */     //   36: iushr
/*      */     //   37: istore #6
/*      */     //   39: aload_2
/*      */     //   40: iload #6
/*      */     //   42: invokeinterface get : (I)Ljava/lang/Object;
/*      */     //   47: astore #7
/*      */     //   49: aload #7
/*      */     //   51: checkcast androidx/compose/ui/text/ParagraphInfo
/*      */     //   54: astore #8
/*      */     //   56: iconst_0
/*      */     //   57: istore #9
/*      */     //   59: nop
/*      */     //   60: aload #8
/*      */     //   62: invokevirtual getStartLineIndex : ()I
/*      */     //   65: iload_1
/*      */     //   66: if_icmple -> 73
/*      */     //   69: iconst_1
/*      */     //   70: goto -> 87
/*      */     //   73: aload #8
/*      */     //   75: invokevirtual getEndLineIndex : ()I
/*      */     //   78: iload_1
/*      */     //   79: if_icmpgt -> 86
/*      */     //   82: iconst_m1
/*      */     //   83: goto -> 87
/*      */     //   86: iconst_0
/*      */     //   87: nop
/*      */     //   88: istore #8
/*      */     //   90: iload #8
/*      */     //   92: ifge -> 104
/*      */     //   95: iload #6
/*      */     //   97: iconst_1
/*      */     //   98: iadd
/*      */     //   99: istore #4
/*      */     //   101: goto -> 23
/*      */     //   104: iload #8
/*      */     //   106: ifle -> 118
/*      */     //   109: iload #6
/*      */     //   111: iconst_1
/*      */     //   112: isub
/*      */     //   113: istore #5
/*      */     //   115: goto -> 23
/*      */     //   118: iload #6
/*      */     //   120: goto -> 128
/*      */     //   123: iload #4
/*      */     //   125: iconst_1
/*      */     //   126: iadd
/*      */     //   127: ineg
/*      */     //   128: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #991	-> 6
/*      */     //   #1178	-> 10
/*      */     //   #1179	-> 13
/*      */     //   #1181	-> 23
/*      */     //   #1182	-> 30
/*      */     //   #1183	-> 39
/*      */     //   #1184	-> 49
/*      */     //   #992	-> 59
/*      */     //   #993	-> 60
/*      */     //   #994	-> 73
/*      */     //   #995	-> 86
/*      */     //   #992	-> 87
/*      */     //   #1184	-> 88
/*      */     //   #1186	-> 90
/*      */     //   #1187	-> 95
/*      */     //   #1188	-> 104
/*      */     //   #1189	-> 109
/*      */     //   #1191	-> 118
/*      */     //   #1193	-> 123
/*      */     //   #991	-> 128
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   59	29	9	$i$a$-fastBinarySearch-MultiParagraphKt$findParagraphByLineIndex$1	I
/*      */     //   56	32	8	paragraphInfo	Landroidx/compose/ui/text/ParagraphInfo;
/*      */     //   39	84	6	mid$iv	I
/*      */     //   49	74	7	midVal$iv	Ljava/lang/Object;
/*      */     //   90	33	8	cmp$iv	I
/*      */     //   10	118	3	$i$f$fastBinarySearch	I
/*      */     //   13	115	4	low$iv	I
/*      */     //   23	105	5	high$iv	I
/*      */     //   8	120	2	$this$fastBinarySearch$iv	Ljava/util/List;
/*      */     //   0	129	0	paragraphInfoList	Ljava/util/List;
/*      */     //   0	129	1	lineIndex	I
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static final <T> int fastBinarySearch(List $this$fastBinarySearch, Function1 comparison) {
/* 1001 */     int $i$f$fastBinarySearch = 0, low = 0;
/* 1002 */     int high = $this$fastBinarySearch.size() - 1;
/*      */     
/* 1004 */     while (low <= high) {
/* 1005 */       int mid = low + high >>> 1;
/* 1006 */       Object midVal = $this$fastBinarySearch.get(mid);
/* 1007 */       int cmp = ((Number)comparison.invoke(midVal)).intValue();
/*      */       
/* 1009 */       if (cmp < 0) {
/* 1010 */         low = mid + 1; continue;
/* 1011 */       }  if (cmp > 0) {
/* 1012 */         high = mid - 1; continue;
/*      */       } 
/* 1014 */       return mid;
/*      */     } 
/* 1016 */     return -(low + 1);
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\MultiParagraphKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */