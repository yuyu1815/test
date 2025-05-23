package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\002\b\013\bÀ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J$\020\003\032\0020\0042\f\020\005\032\b\022\004\022\0020\0070\0062\006\020\b\032\0020\0042\006\020\t\032\0020\004J$\020\n\032\0020\0042\f\020\005\032\b\022\004\022\0020\0070\0062\006\020\013\032\0020\0042\006\020\t\032\0020\004J$\020\f\032\0020\0042\f\020\005\032\b\022\004\022\0020\0070\0062\006\020\b\032\0020\0042\006\020\t\032\0020\004J$\020\r\032\0020\0042\f\020\005\032\b\022\004\022\0020\0070\0062\006\020\013\032\0020\0042\006\020\t\032\0020\004J$\020\016\032\0020\0042\f\020\005\032\b\022\004\022\0020\0070\0062\006\020\b\032\0020\0042\006\020\t\032\0020\004J$\020\017\032\0020\0042\f\020\005\032\b\022\004\022\0020\0070\0062\006\020\013\032\0020\0042\006\020\t\032\0020\004J$\020\020\032\0020\0042\f\020\005\032\b\022\004\022\0020\0070\0062\006\020\b\032\0020\0042\006\020\t\032\0020\004J$\020\021\032\0020\0042\f\020\005\032\b\022\004\022\0020\0070\0062\006\020\013\032\0020\0042\006\020\t\032\0020\004¨\006\022"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;", "", "()V", "HorizontalMaxHeight", "", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "availableWidth", "mainAxisSpacing", "HorizontalMaxWidth", "availableHeight", "HorizontalMinHeight", "HorizontalMinWidth", "VerticalMaxHeight", "VerticalMaxWidth", "VerticalMinHeight", "VerticalMinWidth", "foundation-layout"})
@StabilityInferred(parameters = 1)
@SourceDebugExtension({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/IntrinsicMeasureBlocks\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,723:1\n428#2,5:724\n433#2,7:733\n441#2:741\n442#2,2:743\n453#2,5:745\n458#2,17:754\n477#2,6:772\n485#2,17:779\n453#2,5:796\n458#2,17:805\n477#2,6:823\n485#2,17:830\n428#2,5:847\n433#2,7:856\n441#2:864\n442#2,2:866\n428#2,5:868\n433#2,7:877\n441#2:885\n442#2,2:887\n453#2,5:889\n458#2,17:898\n477#2,6:916\n485#2,17:923\n453#2,5:940\n458#2,17:949\n477#2,6:967\n485#2,17:974\n428#2,5:991\n433#2,7:1000\n441#2:1008\n442#2,2:1010\n33#3,4:729\n38#3:742\n33#3,4:750\n38#3:771\n33#3,4:801\n38#3:822\n33#3,4:852\n38#3:865\n33#3,4:873\n38#3:886\n33#3,4:894\n38#3:915\n33#3,4:945\n38#3:966\n33#3,4:996\n38#3:1009\n26#4:740\n26#4:778\n26#4:829\n26#4:863\n26#4:884\n26#4:922\n26#4:973\n26#4:1007\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/IntrinsicMeasureBlocks\n*L\n325#1:724,5\n325#1:733,7\n325#1:741\n325#1:743,2\n337#1:745,5\n337#1:754,17\n337#1:772,6\n337#1:779,17\n350#1:796,5\n350#1:805,17\n350#1:823,6\n350#1:830,17\n363#1:847,5\n363#1:856,7\n363#1:864\n363#1:866,2\n375#1:868,5\n375#1:877,7\n375#1:885\n375#1:887,2\n387#1:889,5\n387#1:898,17\n387#1:916,6\n387#1:923,17\n400#1:940,5\n400#1:949,17\n400#1:967,6\n400#1:974,17\n413#1:991,5\n413#1:1000,7\n413#1:1008\n413#1:1010,2\n325#1:729,4\n325#1:742\n337#1:750,4\n337#1:771\n350#1:801,4\n350#1:822\n363#1:852,4\n363#1:865\n375#1:873,4\n375#1:886\n387#1:894,4\n387#1:915\n400#1:945,4\n400#1:966\n413#1:996,4\n413#1:1009\n325#1:740\n337#1:778\n350#1:829\n363#1:863\n375#1:884\n387#1:922\n400#1:973\n413#1:1007\n*E\n"})
public final class IntrinsicMeasureBlocks {
  @NotNull
  public static final IntrinsicMeasureBlocks INSTANCE = new IntrinsicMeasureBlocks();
  
  public static final int $stable;
  
  public final int HorizontalMinWidth(@NotNull List measurables, int availableHeight, int mainAxisSpacing) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'measurables'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: iconst_0
    //   7: istore #4
    //   9: aload_1
    //   10: invokeinterface isEmpty : ()Z
    //   15: ifeq -> 22
    //   18: iconst_0
    //   19: goto -> 218
    //   22: iconst_0
    //   23: istore #5
    //   25: iconst_0
    //   26: istore #6
    //   28: fconst_0
    //   29: fstore #7
    //   31: aload_1
    //   32: astore #8
    //   34: iconst_0
    //   35: istore #9
    //   37: nop
    //   38: iconst_0
    //   39: istore #10
    //   41: aload #8
    //   43: invokeinterface size : ()I
    //   48: istore #11
    //   50: iload #10
    //   52: iload #11
    //   54: if_icmpge -> 187
    //   57: aload #8
    //   59: iload #10
    //   61: invokeinterface get : (I)Ljava/lang/Object;
    //   66: astore #12
    //   68: aload #12
    //   70: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
    //   73: astore #13
    //   75: iconst_0
    //   76: istore #14
    //   78: aload #13
    //   80: invokestatic getRowColumnParentData : (Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;
    //   83: invokestatic getWeight : (Landroidx/compose/foundation/layout/RowColumnParentData;)F
    //   86: fstore #15
    //   88: aload #13
    //   90: iload_2
    //   91: istore #16
    //   93: astore #17
    //   95: iconst_0
    //   96: istore #18
    //   98: aload #17
    //   100: iload #16
    //   102: invokeinterface minIntrinsicWidth : (I)I
    //   107: istore #19
    //   109: fload #15
    //   111: fconst_0
    //   112: fcmpg
    //   113: ifne -> 120
    //   116: iconst_1
    //   117: goto -> 121
    //   120: iconst_0
    //   121: ifeq -> 134
    //   124: iload #6
    //   126: iload #19
    //   128: iadd
    //   129: istore #6
    //   131: goto -> 179
    //   134: fload #15
    //   136: fconst_0
    //   137: fcmpl
    //   138: ifle -> 179
    //   141: fload #7
    //   143: fload #15
    //   145: fadd
    //   146: fstore #7
    //   148: iload #5
    //   150: istore #20
    //   152: iload #19
    //   154: i2f
    //   155: fload #15
    //   157: fdiv
    //   158: fstore #21
    //   160: iconst_0
    //   161: istore #22
    //   163: fload #21
    //   165: invokestatic round : (F)I
    //   168: istore #21
    //   170: iload #20
    //   172: iload #21
    //   174: invokestatic max : (II)I
    //   177: istore #5
    //   179: nop
    //   180: nop
    //   181: iinc #10, 1
    //   184: goto -> 50
    //   187: nop
    //   188: iload #5
    //   190: i2f
    //   191: fload #7
    //   193: fmul
    //   194: fstore #8
    //   196: iconst_0
    //   197: istore #9
    //   199: fload #8
    //   201: invokestatic round : (F)I
    //   204: iload #6
    //   206: iadd
    //   207: aload_1
    //   208: invokeinterface size : ()I
    //   213: iconst_1
    //   214: isub
    //   215: iload_3
    //   216: imul
    //   217: iadd
    //   218: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #325	-> 6
    //   #724	-> 9
    //   #725	-> 22
    //   #726	-> 25
    //   #727	-> 28
    //   #728	-> 31
    //   #729	-> 37
    //   #730	-> 38
    //   #731	-> 57
    //   #732	-> 68
    //   #733	-> 78
    //   #734	-> 88
    //   #327	-> 98
    //   #734	-> 107
    //   #735	-> 109
    //   #736	-> 124
    //   #737	-> 134
    //   #738	-> 141
    //   #739	-> 148
    //   #740	-> 163
    //   #739	-> 170
    //   #739	-> 177
    //   #741	-> 179
    //   #732	-> 180
    //   #730	-> 181
    //   #742	-> 187
    //   #743	-> 188
    //   #740	-> 199
    //   #743	-> 204
    //   #744	-> 207
    //   #743	-> 217
    //   #325	-> 218
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   98	9	18	$i$a$-intrinsicMainAxisSize-IntrinsicMeasureBlocks$HorizontalMinWidth$1	I
    //   95	12	17	$this$HorizontalMinWidth_u24lambda_u240	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   95	12	16	h	I
    //   163	5	22	$i$f$fastRoundToInt	I
    //   160	8	21	$this$fastRoundToInt$iv$iv	F
    //   78	102	14	$i$a$-fastForEach-RowColumnImplKt$intrinsicMainAxisSize$1$iv	I
    //   88	92	15	weight$iv	F
    //   109	71	19	size$iv	I
    //   75	105	13	child$iv	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   68	113	12	item$iv$iv	Ljava/lang/Object;
    //   41	146	10	index$iv$iv	I
    //   37	151	9	$i$f$fastForEach	I
    //   34	154	8	$this$fastForEach$iv$iv	Ljava/util/List;
    //   199	5	9	$i$f$fastRoundToInt	I
    //   196	8	8	$this$fastRoundToInt$iv$iv	F
    //   9	209	4	$i$f$intrinsicMainAxisSize	I
    //   25	193	5	weightUnitSpace$iv	I
    //   28	190	6	fixedSpace$iv	I
    //   31	187	7	totalWeight$iv	F
    //   0	219	0	this	Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;
    //   0	219	1	measurables	Ljava/util/List;
    //   0	219	2	availableHeight	I
    //   0	219	3	mainAxisSpacing	I
  }
  
  public final int VerticalMinWidth(@NotNull List measurables, int availableHeight, int mainAxisSpacing) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'measurables'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: iconst_0
    //   7: istore #4
    //   9: aload_1
    //   10: invokeinterface isEmpty : ()Z
    //   15: ifeq -> 22
    //   18: iconst_0
    //   19: goto -> 423
    //   22: iconst_0
    //   23: istore #5
    //   25: aload_1
    //   26: invokeinterface size : ()I
    //   31: iconst_1
    //   32: isub
    //   33: iload_3
    //   34: imul
    //   35: iload_2
    //   36: invokestatic min : (II)I
    //   39: istore #5
    //   41: iconst_0
    //   42: istore #6
    //   44: fconst_0
    //   45: fstore #7
    //   47: aload_1
    //   48: astore #8
    //   50: iconst_0
    //   51: istore #9
    //   53: nop
    //   54: iconst_0
    //   55: istore #10
    //   57: aload #8
    //   59: invokeinterface size : ()I
    //   64: istore #11
    //   66: iload #10
    //   68: iload #11
    //   70: if_icmpge -> 231
    //   73: aload #8
    //   75: iload #10
    //   77: invokeinterface get : (I)Ljava/lang/Object;
    //   82: astore #12
    //   84: aload #12
    //   86: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
    //   89: astore #13
    //   91: iconst_0
    //   92: istore #14
    //   94: aload #13
    //   96: invokestatic getRowColumnParentData : (Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;
    //   99: invokestatic getWeight : (Landroidx/compose/foundation/layout/RowColumnParentData;)F
    //   102: fstore #15
    //   104: fload #15
    //   106: fconst_0
    //   107: fcmpg
    //   108: ifne -> 115
    //   111: iconst_1
    //   112: goto -> 116
    //   115: iconst_0
    //   116: ifeq -> 209
    //   119: iload_2
    //   120: ldc 2147483647
    //   122: if_icmpne -> 130
    //   125: ldc 2147483647
    //   127: goto -> 134
    //   130: iload_2
    //   131: iload #5
    //   133: isub
    //   134: istore #16
    //   136: nop
    //   137: aload #13
    //   139: ldc 2147483647
    //   141: istore #17
    //   143: astore #18
    //   145: iconst_0
    //   146: istore #19
    //   148: aload #18
    //   150: iload #17
    //   152: invokeinterface maxIntrinsicHeight : (I)I
    //   157: iload #16
    //   159: invokestatic min : (II)I
    //   162: istore #20
    //   164: iload #5
    //   166: iload #20
    //   168: iadd
    //   169: istore #5
    //   171: iload #6
    //   173: aload #13
    //   175: iload #20
    //   177: istore #17
    //   179: astore #18
    //   181: istore #23
    //   183: iconst_0
    //   184: istore #19
    //   186: aload #18
    //   188: iload #17
    //   190: invokeinterface minIntrinsicWidth : (I)I
    //   195: istore #24
    //   197: iload #23
    //   199: iload #24
    //   201: invokestatic max : (II)I
    //   204: istore #6
    //   206: goto -> 223
    //   209: fload #15
    //   211: fconst_0
    //   212: fcmpl
    //   213: ifle -> 223
    //   216: fload #7
    //   218: fload #15
    //   220: fadd
    //   221: fstore #7
    //   223: nop
    //   224: nop
    //   225: iinc #10, 1
    //   228: goto -> 66
    //   231: nop
    //   232: fload #7
    //   234: fconst_0
    //   235: fcmpg
    //   236: ifne -> 243
    //   239: iconst_1
    //   240: goto -> 244
    //   243: iconst_0
    //   244: ifeq -> 251
    //   247: iconst_0
    //   248: goto -> 284
    //   251: iload_2
    //   252: ldc 2147483647
    //   254: if_icmpne -> 262
    //   257: ldc 2147483647
    //   259: goto -> 284
    //   262: iload_2
    //   263: iload #5
    //   265: isub
    //   266: iconst_0
    //   267: invokestatic max : (II)I
    //   270: i2f
    //   271: fload #7
    //   273: fdiv
    //   274: fstore #9
    //   276: iconst_0
    //   277: istore #10
    //   279: fload #9
    //   281: invokestatic round : (F)I
    //   284: istore #8
    //   286: aload_1
    //   287: astore #9
    //   289: iconst_0
    //   290: istore #10
    //   292: nop
    //   293: iconst_0
    //   294: istore #11
    //   296: aload #9
    //   298: invokeinterface size : ()I
    //   303: istore #12
    //   305: iload #11
    //   307: iload #12
    //   309: if_icmpge -> 420
    //   312: aload #9
    //   314: iload #11
    //   316: invokeinterface get : (I)Ljava/lang/Object;
    //   321: astore #13
    //   323: aload #13
    //   325: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
    //   328: astore #14
    //   330: iconst_0
    //   331: istore #15
    //   333: aload #14
    //   335: invokestatic getRowColumnParentData : (Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;
    //   338: invokestatic getWeight : (Landroidx/compose/foundation/layout/RowColumnParentData;)F
    //   341: fstore #16
    //   343: fload #16
    //   345: fconst_0
    //   346: fcmpl
    //   347: ifle -> 412
    //   350: nop
    //   351: iload #6
    //   353: istore #20
    //   355: aload #14
    //   357: iload #8
    //   359: ldc 2147483647
    //   361: if_icmpeq -> 383
    //   364: iload #8
    //   366: i2f
    //   367: fload #16
    //   369: fmul
    //   370: fstore #21
    //   372: iconst_0
    //   373: istore #22
    //   375: fload #21
    //   377: invokestatic round : (F)I
    //   380: goto -> 385
    //   383: ldc 2147483647
    //   385: istore #17
    //   387: astore #18
    //   389: iconst_0
    //   390: istore #19
    //   392: aload #18
    //   394: iload #17
    //   396: invokeinterface minIntrinsicWidth : (I)I
    //   401: istore #21
    //   403: iload #20
    //   405: iload #21
    //   407: invokestatic max : (II)I
    //   410: istore #6
    //   412: nop
    //   413: nop
    //   414: iinc #11, 1
    //   417: goto -> 305
    //   420: nop
    //   421: iload #6
    //   423: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #337	-> 6
    //   #745	-> 9
    //   #746	-> 22
    //   #746	-> 39
    //   #747	-> 41
    //   #748	-> 44
    //   #749	-> 47
    //   #750	-> 53
    //   #751	-> 54
    //   #752	-> 73
    //   #753	-> 84
    //   #754	-> 94
    //   #755	-> 104
    //   #758	-> 119
    //   #759	-> 125
    //   #758	-> 134
    //   #760	-> 136
    //   #761	-> 137
    //   #339	-> 148
    //   #761	-> 157
    //   #760	-> 162
    //   #764	-> 164
    //   #766	-> 171
    //   #340	-> 186
    //   #766	-> 201
    //   #766	-> 204
    //   #767	-> 209
    //   #768	-> 216
    //   #770	-> 223
    //   #753	-> 224
    //   #751	-> 225
    //   #771	-> 231
    //   #772	-> 232
    //   #773	-> 247
    //   #774	-> 251
    //   #775	-> 257
    //   #777	-> 262
    //   #777	-> 271
    //   #778	-> 279
    //   #772	-> 284
    //   #779	-> 286
    //   #750	-> 292
    //   #751	-> 293
    //   #752	-> 312
    //   #753	-> 323
    //   #780	-> 333
    //   #782	-> 343
    //   #783	-> 350
    //   #784	-> 351
    //   #785	-> 355
    //   #786	-> 357
    //   #787	-> 364
    //   #778	-> 375
    //   #789	-> 383
    //   #785	-> 385
    //   #340	-> 392
    //   #785	-> 401
    //   #783	-> 403
    //   #783	-> 410
    //   #794	-> 412
    //   #753	-> 413
    //   #751	-> 414
    //   #771	-> 420
    //   #795	-> 421
    //   #337	-> 423
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   148	9	19	$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$VerticalMinWidth$1	I
    //   145	12	18	$this$VerticalMinWidth_u24lambda_u241	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   145	12	17	w	I
    //   186	9	19	$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$VerticalMinWidth$2	I
    //   183	12	18	$this$VerticalMinWidth_u24lambda_u242	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   183	12	17	h	I
    //   392	9	19	$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$VerticalMinWidth$2	I
    //   389	12	18	$this$VerticalMinWidth_u24lambda_u242	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   389	12	17	h	I
    //   136	70	16	remaining$iv	I
    //   164	42	20	mainAxisSpace$iv	I
    //   94	130	14	$i$a$-fastForEach-RowColumnImplKt$intrinsicCrossAxisSize$1$iv	I
    //   104	120	15	weight$iv	F
    //   91	133	13	child$iv	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   84	141	12	item$iv$iv	Ljava/lang/Object;
    //   57	174	10	index$iv$iv	I
    //   53	179	9	$i$f$fastForEach	I
    //   50	182	8	$this$fastForEach$iv$iv	Ljava/util/List;
    //   279	5	10	$i$f$fastRoundToInt	I
    //   276	8	9	$this$fastRoundToInt$iv$iv	F
    //   375	5	22	$i$f$fastRoundToInt	I
    //   372	8	21	$this$fastRoundToInt$iv$iv	F
    //   333	80	15	$i$a$-fastForEach-RowColumnImplKt$intrinsicCrossAxisSize$2$iv	I
    //   343	70	16	weight$iv	F
    //   330	83	14	child$iv	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   323	91	13	item$iv$iv	Ljava/lang/Object;
    //   296	124	11	index$iv$iv	I
    //   292	129	10	$i$f$fastForEach	I
    //   289	132	9	$this$fastForEach$iv$iv	Ljava/util/List;
    //   9	414	4	$i$f$intrinsicCrossAxisSize	I
    //   25	398	5	fixedSpace$iv	I
    //   44	379	6	crossAxisMax$iv	I
    //   47	376	7	totalWeight$iv	F
    //   286	137	8	weightUnitSpace$iv	I
    //   0	424	0	this	Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;
    //   0	424	1	measurables	Ljava/util/List;
    //   0	424	2	availableHeight	I
    //   0	424	3	mainAxisSpacing	I
  }
  
  public final int HorizontalMinHeight(@NotNull List measurables, int availableWidth, int mainAxisSpacing) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'measurables'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: iconst_0
    //   7: istore #4
    //   9: aload_1
    //   10: invokeinterface isEmpty : ()Z
    //   15: ifeq -> 22
    //   18: iconst_0
    //   19: goto -> 423
    //   22: iconst_0
    //   23: istore #5
    //   25: aload_1
    //   26: invokeinterface size : ()I
    //   31: iconst_1
    //   32: isub
    //   33: iload_3
    //   34: imul
    //   35: iload_2
    //   36: invokestatic min : (II)I
    //   39: istore #5
    //   41: iconst_0
    //   42: istore #6
    //   44: fconst_0
    //   45: fstore #7
    //   47: aload_1
    //   48: astore #8
    //   50: iconst_0
    //   51: istore #9
    //   53: nop
    //   54: iconst_0
    //   55: istore #10
    //   57: aload #8
    //   59: invokeinterface size : ()I
    //   64: istore #11
    //   66: iload #10
    //   68: iload #11
    //   70: if_icmpge -> 231
    //   73: aload #8
    //   75: iload #10
    //   77: invokeinterface get : (I)Ljava/lang/Object;
    //   82: astore #12
    //   84: aload #12
    //   86: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
    //   89: astore #13
    //   91: iconst_0
    //   92: istore #14
    //   94: aload #13
    //   96: invokestatic getRowColumnParentData : (Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;
    //   99: invokestatic getWeight : (Landroidx/compose/foundation/layout/RowColumnParentData;)F
    //   102: fstore #15
    //   104: fload #15
    //   106: fconst_0
    //   107: fcmpg
    //   108: ifne -> 115
    //   111: iconst_1
    //   112: goto -> 116
    //   115: iconst_0
    //   116: ifeq -> 209
    //   119: iload_2
    //   120: ldc 2147483647
    //   122: if_icmpne -> 130
    //   125: ldc 2147483647
    //   127: goto -> 134
    //   130: iload_2
    //   131: iload #5
    //   133: isub
    //   134: istore #16
    //   136: nop
    //   137: aload #13
    //   139: ldc 2147483647
    //   141: istore #17
    //   143: astore #18
    //   145: iconst_0
    //   146: istore #19
    //   148: aload #18
    //   150: iload #17
    //   152: invokeinterface maxIntrinsicWidth : (I)I
    //   157: iload #16
    //   159: invokestatic min : (II)I
    //   162: istore #20
    //   164: iload #5
    //   166: iload #20
    //   168: iadd
    //   169: istore #5
    //   171: iload #6
    //   173: aload #13
    //   175: iload #20
    //   177: istore #17
    //   179: astore #18
    //   181: istore #23
    //   183: iconst_0
    //   184: istore #19
    //   186: aload #18
    //   188: iload #17
    //   190: invokeinterface minIntrinsicHeight : (I)I
    //   195: istore #24
    //   197: iload #23
    //   199: iload #24
    //   201: invokestatic max : (II)I
    //   204: istore #6
    //   206: goto -> 223
    //   209: fload #15
    //   211: fconst_0
    //   212: fcmpl
    //   213: ifle -> 223
    //   216: fload #7
    //   218: fload #15
    //   220: fadd
    //   221: fstore #7
    //   223: nop
    //   224: nop
    //   225: iinc #10, 1
    //   228: goto -> 66
    //   231: nop
    //   232: fload #7
    //   234: fconst_0
    //   235: fcmpg
    //   236: ifne -> 243
    //   239: iconst_1
    //   240: goto -> 244
    //   243: iconst_0
    //   244: ifeq -> 251
    //   247: iconst_0
    //   248: goto -> 284
    //   251: iload_2
    //   252: ldc 2147483647
    //   254: if_icmpne -> 262
    //   257: ldc 2147483647
    //   259: goto -> 284
    //   262: iload_2
    //   263: iload #5
    //   265: isub
    //   266: iconst_0
    //   267: invokestatic max : (II)I
    //   270: i2f
    //   271: fload #7
    //   273: fdiv
    //   274: fstore #9
    //   276: iconst_0
    //   277: istore #10
    //   279: fload #9
    //   281: invokestatic round : (F)I
    //   284: istore #8
    //   286: aload_1
    //   287: astore #9
    //   289: iconst_0
    //   290: istore #10
    //   292: nop
    //   293: iconst_0
    //   294: istore #11
    //   296: aload #9
    //   298: invokeinterface size : ()I
    //   303: istore #12
    //   305: iload #11
    //   307: iload #12
    //   309: if_icmpge -> 420
    //   312: aload #9
    //   314: iload #11
    //   316: invokeinterface get : (I)Ljava/lang/Object;
    //   321: astore #13
    //   323: aload #13
    //   325: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
    //   328: astore #14
    //   330: iconst_0
    //   331: istore #15
    //   333: aload #14
    //   335: invokestatic getRowColumnParentData : (Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;
    //   338: invokestatic getWeight : (Landroidx/compose/foundation/layout/RowColumnParentData;)F
    //   341: fstore #16
    //   343: fload #16
    //   345: fconst_0
    //   346: fcmpl
    //   347: ifle -> 412
    //   350: nop
    //   351: iload #6
    //   353: istore #20
    //   355: aload #14
    //   357: iload #8
    //   359: ldc 2147483647
    //   361: if_icmpeq -> 383
    //   364: iload #8
    //   366: i2f
    //   367: fload #16
    //   369: fmul
    //   370: fstore #21
    //   372: iconst_0
    //   373: istore #22
    //   375: fload #21
    //   377: invokestatic round : (F)I
    //   380: goto -> 385
    //   383: ldc 2147483647
    //   385: istore #17
    //   387: astore #18
    //   389: iconst_0
    //   390: istore #19
    //   392: aload #18
    //   394: iload #17
    //   396: invokeinterface minIntrinsicHeight : (I)I
    //   401: istore #21
    //   403: iload #20
    //   405: iload #21
    //   407: invokestatic max : (II)I
    //   410: istore #6
    //   412: nop
    //   413: nop
    //   414: iinc #11, 1
    //   417: goto -> 305
    //   420: nop
    //   421: iload #6
    //   423: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #350	-> 6
    //   #796	-> 9
    //   #797	-> 22
    //   #797	-> 39
    //   #798	-> 41
    //   #799	-> 44
    //   #800	-> 47
    //   #801	-> 53
    //   #802	-> 54
    //   #803	-> 73
    //   #804	-> 84
    //   #805	-> 94
    //   #806	-> 104
    //   #809	-> 119
    //   #810	-> 125
    //   #809	-> 134
    //   #811	-> 136
    //   #812	-> 137
    //   #352	-> 148
    //   #812	-> 157
    //   #811	-> 162
    //   #815	-> 164
    //   #817	-> 171
    //   #353	-> 186
    //   #817	-> 201
    //   #817	-> 204
    //   #818	-> 209
    //   #819	-> 216
    //   #821	-> 223
    //   #804	-> 224
    //   #802	-> 225
    //   #822	-> 231
    //   #823	-> 232
    //   #824	-> 247
    //   #825	-> 251
    //   #826	-> 257
    //   #828	-> 262
    //   #828	-> 271
    //   #829	-> 279
    //   #823	-> 284
    //   #830	-> 286
    //   #801	-> 292
    //   #802	-> 293
    //   #803	-> 312
    //   #804	-> 323
    //   #831	-> 333
    //   #833	-> 343
    //   #834	-> 350
    //   #835	-> 351
    //   #836	-> 355
    //   #837	-> 357
    //   #838	-> 364
    //   #829	-> 375
    //   #840	-> 383
    //   #836	-> 385
    //   #353	-> 392
    //   #836	-> 401
    //   #834	-> 403
    //   #834	-> 410
    //   #845	-> 412
    //   #804	-> 413
    //   #802	-> 414
    //   #822	-> 420
    //   #846	-> 421
    //   #350	-> 423
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   148	9	19	$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$HorizontalMinHeight$1	I
    //   145	12	18	$this$HorizontalMinHeight_u24lambda_u243	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   145	12	17	h	I
    //   186	9	19	$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$HorizontalMinHeight$2	I
    //   183	12	18	$this$HorizontalMinHeight_u24lambda_u244	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   183	12	17	w	I
    //   392	9	19	$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$HorizontalMinHeight$2	I
    //   389	12	18	$this$HorizontalMinHeight_u24lambda_u244	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   389	12	17	w	I
    //   136	70	16	remaining$iv	I
    //   164	42	20	mainAxisSpace$iv	I
    //   94	130	14	$i$a$-fastForEach-RowColumnImplKt$intrinsicCrossAxisSize$1$iv	I
    //   104	120	15	weight$iv	F
    //   91	133	13	child$iv	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   84	141	12	item$iv$iv	Ljava/lang/Object;
    //   57	174	10	index$iv$iv	I
    //   53	179	9	$i$f$fastForEach	I
    //   50	182	8	$this$fastForEach$iv$iv	Ljava/util/List;
    //   279	5	10	$i$f$fastRoundToInt	I
    //   276	8	9	$this$fastRoundToInt$iv$iv	F
    //   375	5	22	$i$f$fastRoundToInt	I
    //   372	8	21	$this$fastRoundToInt$iv$iv	F
    //   333	80	15	$i$a$-fastForEach-RowColumnImplKt$intrinsicCrossAxisSize$2$iv	I
    //   343	70	16	weight$iv	F
    //   330	83	14	child$iv	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   323	91	13	item$iv$iv	Ljava/lang/Object;
    //   296	124	11	index$iv$iv	I
    //   292	129	10	$i$f$fastForEach	I
    //   289	132	9	$this$fastForEach$iv$iv	Ljava/util/List;
    //   9	414	4	$i$f$intrinsicCrossAxisSize	I
    //   25	398	5	fixedSpace$iv	I
    //   44	379	6	crossAxisMax$iv	I
    //   47	376	7	totalWeight$iv	F
    //   286	137	8	weightUnitSpace$iv	I
    //   0	424	0	this	Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;
    //   0	424	1	measurables	Ljava/util/List;
    //   0	424	2	availableWidth	I
    //   0	424	3	mainAxisSpacing	I
  }
  
  public final int VerticalMinHeight(@NotNull List measurables, int availableWidth, int mainAxisSpacing) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'measurables'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: iconst_0
    //   7: istore #4
    //   9: aload_1
    //   10: invokeinterface isEmpty : ()Z
    //   15: ifeq -> 22
    //   18: iconst_0
    //   19: goto -> 218
    //   22: iconst_0
    //   23: istore #5
    //   25: iconst_0
    //   26: istore #6
    //   28: fconst_0
    //   29: fstore #7
    //   31: aload_1
    //   32: astore #8
    //   34: iconst_0
    //   35: istore #9
    //   37: nop
    //   38: iconst_0
    //   39: istore #10
    //   41: aload #8
    //   43: invokeinterface size : ()I
    //   48: istore #11
    //   50: iload #10
    //   52: iload #11
    //   54: if_icmpge -> 187
    //   57: aload #8
    //   59: iload #10
    //   61: invokeinterface get : (I)Ljava/lang/Object;
    //   66: astore #12
    //   68: aload #12
    //   70: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
    //   73: astore #13
    //   75: iconst_0
    //   76: istore #14
    //   78: aload #13
    //   80: invokestatic getRowColumnParentData : (Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;
    //   83: invokestatic getWeight : (Landroidx/compose/foundation/layout/RowColumnParentData;)F
    //   86: fstore #15
    //   88: aload #13
    //   90: iload_2
    //   91: istore #16
    //   93: astore #17
    //   95: iconst_0
    //   96: istore #18
    //   98: aload #17
    //   100: iload #16
    //   102: invokeinterface minIntrinsicHeight : (I)I
    //   107: istore #19
    //   109: fload #15
    //   111: fconst_0
    //   112: fcmpg
    //   113: ifne -> 120
    //   116: iconst_1
    //   117: goto -> 121
    //   120: iconst_0
    //   121: ifeq -> 134
    //   124: iload #6
    //   126: iload #19
    //   128: iadd
    //   129: istore #6
    //   131: goto -> 179
    //   134: fload #15
    //   136: fconst_0
    //   137: fcmpl
    //   138: ifle -> 179
    //   141: fload #7
    //   143: fload #15
    //   145: fadd
    //   146: fstore #7
    //   148: iload #5
    //   150: istore #20
    //   152: iload #19
    //   154: i2f
    //   155: fload #15
    //   157: fdiv
    //   158: fstore #21
    //   160: iconst_0
    //   161: istore #22
    //   163: fload #21
    //   165: invokestatic round : (F)I
    //   168: istore #21
    //   170: iload #20
    //   172: iload #21
    //   174: invokestatic max : (II)I
    //   177: istore #5
    //   179: nop
    //   180: nop
    //   181: iinc #10, 1
    //   184: goto -> 50
    //   187: nop
    //   188: iload #5
    //   190: i2f
    //   191: fload #7
    //   193: fmul
    //   194: fstore #8
    //   196: iconst_0
    //   197: istore #9
    //   199: fload #8
    //   201: invokestatic round : (F)I
    //   204: iload #6
    //   206: iadd
    //   207: aload_1
    //   208: invokeinterface size : ()I
    //   213: iconst_1
    //   214: isub
    //   215: iload_3
    //   216: imul
    //   217: iadd
    //   218: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #363	-> 6
    //   #847	-> 9
    //   #848	-> 22
    //   #849	-> 25
    //   #850	-> 28
    //   #851	-> 31
    //   #852	-> 37
    //   #853	-> 38
    //   #854	-> 57
    //   #855	-> 68
    //   #856	-> 78
    //   #857	-> 88
    //   #365	-> 98
    //   #857	-> 107
    //   #858	-> 109
    //   #859	-> 124
    //   #860	-> 134
    //   #861	-> 141
    //   #862	-> 148
    //   #863	-> 163
    //   #862	-> 170
    //   #862	-> 177
    //   #864	-> 179
    //   #855	-> 180
    //   #853	-> 181
    //   #865	-> 187
    //   #866	-> 188
    //   #863	-> 199
    //   #866	-> 204
    //   #867	-> 207
    //   #866	-> 217
    //   #363	-> 218
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   98	9	18	$i$a$-intrinsicMainAxisSize-IntrinsicMeasureBlocks$VerticalMinHeight$1	I
    //   95	12	17	$this$VerticalMinHeight_u24lambda_u245	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   95	12	16	w	I
    //   163	5	22	$i$f$fastRoundToInt	I
    //   160	8	21	$this$fastRoundToInt$iv$iv	F
    //   78	102	14	$i$a$-fastForEach-RowColumnImplKt$intrinsicMainAxisSize$1$iv	I
    //   88	92	15	weight$iv	F
    //   109	71	19	size$iv	I
    //   75	105	13	child$iv	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   68	113	12	item$iv$iv	Ljava/lang/Object;
    //   41	146	10	index$iv$iv	I
    //   37	151	9	$i$f$fastForEach	I
    //   34	154	8	$this$fastForEach$iv$iv	Ljava/util/List;
    //   199	5	9	$i$f$fastRoundToInt	I
    //   196	8	8	$this$fastRoundToInt$iv$iv	F
    //   9	209	4	$i$f$intrinsicMainAxisSize	I
    //   25	193	5	weightUnitSpace$iv	I
    //   28	190	6	fixedSpace$iv	I
    //   31	187	7	totalWeight$iv	F
    //   0	219	0	this	Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;
    //   0	219	1	measurables	Ljava/util/List;
    //   0	219	2	availableWidth	I
    //   0	219	3	mainAxisSpacing	I
  }
  
  public final int HorizontalMaxWidth(@NotNull List measurables, int availableHeight, int mainAxisSpacing) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'measurables'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: iconst_0
    //   7: istore #4
    //   9: aload_1
    //   10: invokeinterface isEmpty : ()Z
    //   15: ifeq -> 22
    //   18: iconst_0
    //   19: goto -> 218
    //   22: iconst_0
    //   23: istore #5
    //   25: iconst_0
    //   26: istore #6
    //   28: fconst_0
    //   29: fstore #7
    //   31: aload_1
    //   32: astore #8
    //   34: iconst_0
    //   35: istore #9
    //   37: nop
    //   38: iconst_0
    //   39: istore #10
    //   41: aload #8
    //   43: invokeinterface size : ()I
    //   48: istore #11
    //   50: iload #10
    //   52: iload #11
    //   54: if_icmpge -> 187
    //   57: aload #8
    //   59: iload #10
    //   61: invokeinterface get : (I)Ljava/lang/Object;
    //   66: astore #12
    //   68: aload #12
    //   70: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
    //   73: astore #13
    //   75: iconst_0
    //   76: istore #14
    //   78: aload #13
    //   80: invokestatic getRowColumnParentData : (Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;
    //   83: invokestatic getWeight : (Landroidx/compose/foundation/layout/RowColumnParentData;)F
    //   86: fstore #15
    //   88: aload #13
    //   90: iload_2
    //   91: istore #16
    //   93: astore #17
    //   95: iconst_0
    //   96: istore #18
    //   98: aload #17
    //   100: iload #16
    //   102: invokeinterface maxIntrinsicWidth : (I)I
    //   107: istore #19
    //   109: fload #15
    //   111: fconst_0
    //   112: fcmpg
    //   113: ifne -> 120
    //   116: iconst_1
    //   117: goto -> 121
    //   120: iconst_0
    //   121: ifeq -> 134
    //   124: iload #6
    //   126: iload #19
    //   128: iadd
    //   129: istore #6
    //   131: goto -> 179
    //   134: fload #15
    //   136: fconst_0
    //   137: fcmpl
    //   138: ifle -> 179
    //   141: fload #7
    //   143: fload #15
    //   145: fadd
    //   146: fstore #7
    //   148: iload #5
    //   150: istore #20
    //   152: iload #19
    //   154: i2f
    //   155: fload #15
    //   157: fdiv
    //   158: fstore #21
    //   160: iconst_0
    //   161: istore #22
    //   163: fload #21
    //   165: invokestatic round : (F)I
    //   168: istore #21
    //   170: iload #20
    //   172: iload #21
    //   174: invokestatic max : (II)I
    //   177: istore #5
    //   179: nop
    //   180: nop
    //   181: iinc #10, 1
    //   184: goto -> 50
    //   187: nop
    //   188: iload #5
    //   190: i2f
    //   191: fload #7
    //   193: fmul
    //   194: fstore #8
    //   196: iconst_0
    //   197: istore #9
    //   199: fload #8
    //   201: invokestatic round : (F)I
    //   204: iload #6
    //   206: iadd
    //   207: aload_1
    //   208: invokeinterface size : ()I
    //   213: iconst_1
    //   214: isub
    //   215: iload_3
    //   216: imul
    //   217: iadd
    //   218: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #375	-> 6
    //   #868	-> 9
    //   #869	-> 22
    //   #870	-> 25
    //   #871	-> 28
    //   #872	-> 31
    //   #873	-> 37
    //   #874	-> 38
    //   #875	-> 57
    //   #876	-> 68
    //   #877	-> 78
    //   #878	-> 88
    //   #377	-> 98
    //   #878	-> 107
    //   #879	-> 109
    //   #880	-> 124
    //   #881	-> 134
    //   #882	-> 141
    //   #883	-> 148
    //   #884	-> 163
    //   #883	-> 170
    //   #883	-> 177
    //   #885	-> 179
    //   #876	-> 180
    //   #874	-> 181
    //   #886	-> 187
    //   #887	-> 188
    //   #884	-> 199
    //   #887	-> 204
    //   #888	-> 207
    //   #887	-> 217
    //   #375	-> 218
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   98	9	18	$i$a$-intrinsicMainAxisSize-IntrinsicMeasureBlocks$HorizontalMaxWidth$1	I
    //   95	12	17	$this$HorizontalMaxWidth_u24lambda_u246	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   95	12	16	h	I
    //   163	5	22	$i$f$fastRoundToInt	I
    //   160	8	21	$this$fastRoundToInt$iv$iv	F
    //   78	102	14	$i$a$-fastForEach-RowColumnImplKt$intrinsicMainAxisSize$1$iv	I
    //   88	92	15	weight$iv	F
    //   109	71	19	size$iv	I
    //   75	105	13	child$iv	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   68	113	12	item$iv$iv	Ljava/lang/Object;
    //   41	146	10	index$iv$iv	I
    //   37	151	9	$i$f$fastForEach	I
    //   34	154	8	$this$fastForEach$iv$iv	Ljava/util/List;
    //   199	5	9	$i$f$fastRoundToInt	I
    //   196	8	8	$this$fastRoundToInt$iv$iv	F
    //   9	209	4	$i$f$intrinsicMainAxisSize	I
    //   25	193	5	weightUnitSpace$iv	I
    //   28	190	6	fixedSpace$iv	I
    //   31	187	7	totalWeight$iv	F
    //   0	219	0	this	Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;
    //   0	219	1	measurables	Ljava/util/List;
    //   0	219	2	availableHeight	I
    //   0	219	3	mainAxisSpacing	I
  }
  
  public final int VerticalMaxWidth(@NotNull List measurables, int availableHeight, int mainAxisSpacing) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'measurables'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: iconst_0
    //   7: istore #4
    //   9: aload_1
    //   10: invokeinterface isEmpty : ()Z
    //   15: ifeq -> 22
    //   18: iconst_0
    //   19: goto -> 423
    //   22: iconst_0
    //   23: istore #5
    //   25: aload_1
    //   26: invokeinterface size : ()I
    //   31: iconst_1
    //   32: isub
    //   33: iload_3
    //   34: imul
    //   35: iload_2
    //   36: invokestatic min : (II)I
    //   39: istore #5
    //   41: iconst_0
    //   42: istore #6
    //   44: fconst_0
    //   45: fstore #7
    //   47: aload_1
    //   48: astore #8
    //   50: iconst_0
    //   51: istore #9
    //   53: nop
    //   54: iconst_0
    //   55: istore #10
    //   57: aload #8
    //   59: invokeinterface size : ()I
    //   64: istore #11
    //   66: iload #10
    //   68: iload #11
    //   70: if_icmpge -> 231
    //   73: aload #8
    //   75: iload #10
    //   77: invokeinterface get : (I)Ljava/lang/Object;
    //   82: astore #12
    //   84: aload #12
    //   86: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
    //   89: astore #13
    //   91: iconst_0
    //   92: istore #14
    //   94: aload #13
    //   96: invokestatic getRowColumnParentData : (Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;
    //   99: invokestatic getWeight : (Landroidx/compose/foundation/layout/RowColumnParentData;)F
    //   102: fstore #15
    //   104: fload #15
    //   106: fconst_0
    //   107: fcmpg
    //   108: ifne -> 115
    //   111: iconst_1
    //   112: goto -> 116
    //   115: iconst_0
    //   116: ifeq -> 209
    //   119: iload_2
    //   120: ldc 2147483647
    //   122: if_icmpne -> 130
    //   125: ldc 2147483647
    //   127: goto -> 134
    //   130: iload_2
    //   131: iload #5
    //   133: isub
    //   134: istore #16
    //   136: nop
    //   137: aload #13
    //   139: ldc 2147483647
    //   141: istore #17
    //   143: astore #18
    //   145: iconst_0
    //   146: istore #19
    //   148: aload #18
    //   150: iload #17
    //   152: invokeinterface maxIntrinsicHeight : (I)I
    //   157: iload #16
    //   159: invokestatic min : (II)I
    //   162: istore #20
    //   164: iload #5
    //   166: iload #20
    //   168: iadd
    //   169: istore #5
    //   171: iload #6
    //   173: aload #13
    //   175: iload #20
    //   177: istore #17
    //   179: astore #18
    //   181: istore #23
    //   183: iconst_0
    //   184: istore #19
    //   186: aload #18
    //   188: iload #17
    //   190: invokeinterface maxIntrinsicWidth : (I)I
    //   195: istore #24
    //   197: iload #23
    //   199: iload #24
    //   201: invokestatic max : (II)I
    //   204: istore #6
    //   206: goto -> 223
    //   209: fload #15
    //   211: fconst_0
    //   212: fcmpl
    //   213: ifle -> 223
    //   216: fload #7
    //   218: fload #15
    //   220: fadd
    //   221: fstore #7
    //   223: nop
    //   224: nop
    //   225: iinc #10, 1
    //   228: goto -> 66
    //   231: nop
    //   232: fload #7
    //   234: fconst_0
    //   235: fcmpg
    //   236: ifne -> 243
    //   239: iconst_1
    //   240: goto -> 244
    //   243: iconst_0
    //   244: ifeq -> 251
    //   247: iconst_0
    //   248: goto -> 284
    //   251: iload_2
    //   252: ldc 2147483647
    //   254: if_icmpne -> 262
    //   257: ldc 2147483647
    //   259: goto -> 284
    //   262: iload_2
    //   263: iload #5
    //   265: isub
    //   266: iconst_0
    //   267: invokestatic max : (II)I
    //   270: i2f
    //   271: fload #7
    //   273: fdiv
    //   274: fstore #9
    //   276: iconst_0
    //   277: istore #10
    //   279: fload #9
    //   281: invokestatic round : (F)I
    //   284: istore #8
    //   286: aload_1
    //   287: astore #9
    //   289: iconst_0
    //   290: istore #10
    //   292: nop
    //   293: iconst_0
    //   294: istore #11
    //   296: aload #9
    //   298: invokeinterface size : ()I
    //   303: istore #12
    //   305: iload #11
    //   307: iload #12
    //   309: if_icmpge -> 420
    //   312: aload #9
    //   314: iload #11
    //   316: invokeinterface get : (I)Ljava/lang/Object;
    //   321: astore #13
    //   323: aload #13
    //   325: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
    //   328: astore #14
    //   330: iconst_0
    //   331: istore #15
    //   333: aload #14
    //   335: invokestatic getRowColumnParentData : (Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;
    //   338: invokestatic getWeight : (Landroidx/compose/foundation/layout/RowColumnParentData;)F
    //   341: fstore #16
    //   343: fload #16
    //   345: fconst_0
    //   346: fcmpl
    //   347: ifle -> 412
    //   350: nop
    //   351: iload #6
    //   353: istore #20
    //   355: aload #14
    //   357: iload #8
    //   359: ldc 2147483647
    //   361: if_icmpeq -> 383
    //   364: iload #8
    //   366: i2f
    //   367: fload #16
    //   369: fmul
    //   370: fstore #21
    //   372: iconst_0
    //   373: istore #22
    //   375: fload #21
    //   377: invokestatic round : (F)I
    //   380: goto -> 385
    //   383: ldc 2147483647
    //   385: istore #17
    //   387: astore #18
    //   389: iconst_0
    //   390: istore #19
    //   392: aload #18
    //   394: iload #17
    //   396: invokeinterface maxIntrinsicWidth : (I)I
    //   401: istore #21
    //   403: iload #20
    //   405: iload #21
    //   407: invokestatic max : (II)I
    //   410: istore #6
    //   412: nop
    //   413: nop
    //   414: iinc #11, 1
    //   417: goto -> 305
    //   420: nop
    //   421: iload #6
    //   423: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #387	-> 6
    //   #889	-> 9
    //   #890	-> 22
    //   #890	-> 39
    //   #891	-> 41
    //   #892	-> 44
    //   #893	-> 47
    //   #894	-> 53
    //   #895	-> 54
    //   #896	-> 73
    //   #897	-> 84
    //   #898	-> 94
    //   #899	-> 104
    //   #902	-> 119
    //   #903	-> 125
    //   #902	-> 134
    //   #904	-> 136
    //   #905	-> 137
    //   #389	-> 148
    //   #905	-> 157
    //   #904	-> 162
    //   #908	-> 164
    //   #910	-> 171
    //   #390	-> 186
    //   #910	-> 201
    //   #910	-> 204
    //   #911	-> 209
    //   #912	-> 216
    //   #914	-> 223
    //   #897	-> 224
    //   #895	-> 225
    //   #915	-> 231
    //   #916	-> 232
    //   #917	-> 247
    //   #918	-> 251
    //   #919	-> 257
    //   #921	-> 262
    //   #921	-> 271
    //   #922	-> 279
    //   #916	-> 284
    //   #923	-> 286
    //   #894	-> 292
    //   #895	-> 293
    //   #896	-> 312
    //   #897	-> 323
    //   #924	-> 333
    //   #926	-> 343
    //   #927	-> 350
    //   #928	-> 351
    //   #929	-> 355
    //   #930	-> 357
    //   #931	-> 364
    //   #922	-> 375
    //   #933	-> 383
    //   #929	-> 385
    //   #390	-> 392
    //   #929	-> 401
    //   #927	-> 403
    //   #927	-> 410
    //   #938	-> 412
    //   #897	-> 413
    //   #895	-> 414
    //   #915	-> 420
    //   #939	-> 421
    //   #387	-> 423
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   148	9	19	$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$VerticalMaxWidth$1	I
    //   145	12	18	$this$VerticalMaxWidth_u24lambda_u247	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   145	12	17	w	I
    //   186	9	19	$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$VerticalMaxWidth$2	I
    //   183	12	18	$this$VerticalMaxWidth_u24lambda_u248	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   183	12	17	h	I
    //   392	9	19	$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$VerticalMaxWidth$2	I
    //   389	12	18	$this$VerticalMaxWidth_u24lambda_u248	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   389	12	17	h	I
    //   136	70	16	remaining$iv	I
    //   164	42	20	mainAxisSpace$iv	I
    //   94	130	14	$i$a$-fastForEach-RowColumnImplKt$intrinsicCrossAxisSize$1$iv	I
    //   104	120	15	weight$iv	F
    //   91	133	13	child$iv	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   84	141	12	item$iv$iv	Ljava/lang/Object;
    //   57	174	10	index$iv$iv	I
    //   53	179	9	$i$f$fastForEach	I
    //   50	182	8	$this$fastForEach$iv$iv	Ljava/util/List;
    //   279	5	10	$i$f$fastRoundToInt	I
    //   276	8	9	$this$fastRoundToInt$iv$iv	F
    //   375	5	22	$i$f$fastRoundToInt	I
    //   372	8	21	$this$fastRoundToInt$iv$iv	F
    //   333	80	15	$i$a$-fastForEach-RowColumnImplKt$intrinsicCrossAxisSize$2$iv	I
    //   343	70	16	weight$iv	F
    //   330	83	14	child$iv	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   323	91	13	item$iv$iv	Ljava/lang/Object;
    //   296	124	11	index$iv$iv	I
    //   292	129	10	$i$f$fastForEach	I
    //   289	132	9	$this$fastForEach$iv$iv	Ljava/util/List;
    //   9	414	4	$i$f$intrinsicCrossAxisSize	I
    //   25	398	5	fixedSpace$iv	I
    //   44	379	6	crossAxisMax$iv	I
    //   47	376	7	totalWeight$iv	F
    //   286	137	8	weightUnitSpace$iv	I
    //   0	424	0	this	Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;
    //   0	424	1	measurables	Ljava/util/List;
    //   0	424	2	availableHeight	I
    //   0	424	3	mainAxisSpacing	I
  }
  
  public final int HorizontalMaxHeight(@NotNull List measurables, int availableWidth, int mainAxisSpacing) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'measurables'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: iconst_0
    //   7: istore #4
    //   9: aload_1
    //   10: invokeinterface isEmpty : ()Z
    //   15: ifeq -> 22
    //   18: iconst_0
    //   19: goto -> 423
    //   22: iconst_0
    //   23: istore #5
    //   25: aload_1
    //   26: invokeinterface size : ()I
    //   31: iconst_1
    //   32: isub
    //   33: iload_3
    //   34: imul
    //   35: iload_2
    //   36: invokestatic min : (II)I
    //   39: istore #5
    //   41: iconst_0
    //   42: istore #6
    //   44: fconst_0
    //   45: fstore #7
    //   47: aload_1
    //   48: astore #8
    //   50: iconst_0
    //   51: istore #9
    //   53: nop
    //   54: iconst_0
    //   55: istore #10
    //   57: aload #8
    //   59: invokeinterface size : ()I
    //   64: istore #11
    //   66: iload #10
    //   68: iload #11
    //   70: if_icmpge -> 231
    //   73: aload #8
    //   75: iload #10
    //   77: invokeinterface get : (I)Ljava/lang/Object;
    //   82: astore #12
    //   84: aload #12
    //   86: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
    //   89: astore #13
    //   91: iconst_0
    //   92: istore #14
    //   94: aload #13
    //   96: invokestatic getRowColumnParentData : (Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;
    //   99: invokestatic getWeight : (Landroidx/compose/foundation/layout/RowColumnParentData;)F
    //   102: fstore #15
    //   104: fload #15
    //   106: fconst_0
    //   107: fcmpg
    //   108: ifne -> 115
    //   111: iconst_1
    //   112: goto -> 116
    //   115: iconst_0
    //   116: ifeq -> 209
    //   119: iload_2
    //   120: ldc 2147483647
    //   122: if_icmpne -> 130
    //   125: ldc 2147483647
    //   127: goto -> 134
    //   130: iload_2
    //   131: iload #5
    //   133: isub
    //   134: istore #16
    //   136: nop
    //   137: aload #13
    //   139: ldc 2147483647
    //   141: istore #17
    //   143: astore #18
    //   145: iconst_0
    //   146: istore #19
    //   148: aload #18
    //   150: iload #17
    //   152: invokeinterface maxIntrinsicWidth : (I)I
    //   157: iload #16
    //   159: invokestatic min : (II)I
    //   162: istore #20
    //   164: iload #5
    //   166: iload #20
    //   168: iadd
    //   169: istore #5
    //   171: iload #6
    //   173: aload #13
    //   175: iload #20
    //   177: istore #17
    //   179: astore #18
    //   181: istore #23
    //   183: iconst_0
    //   184: istore #19
    //   186: aload #18
    //   188: iload #17
    //   190: invokeinterface maxIntrinsicHeight : (I)I
    //   195: istore #24
    //   197: iload #23
    //   199: iload #24
    //   201: invokestatic max : (II)I
    //   204: istore #6
    //   206: goto -> 223
    //   209: fload #15
    //   211: fconst_0
    //   212: fcmpl
    //   213: ifle -> 223
    //   216: fload #7
    //   218: fload #15
    //   220: fadd
    //   221: fstore #7
    //   223: nop
    //   224: nop
    //   225: iinc #10, 1
    //   228: goto -> 66
    //   231: nop
    //   232: fload #7
    //   234: fconst_0
    //   235: fcmpg
    //   236: ifne -> 243
    //   239: iconst_1
    //   240: goto -> 244
    //   243: iconst_0
    //   244: ifeq -> 251
    //   247: iconst_0
    //   248: goto -> 284
    //   251: iload_2
    //   252: ldc 2147483647
    //   254: if_icmpne -> 262
    //   257: ldc 2147483647
    //   259: goto -> 284
    //   262: iload_2
    //   263: iload #5
    //   265: isub
    //   266: iconst_0
    //   267: invokestatic max : (II)I
    //   270: i2f
    //   271: fload #7
    //   273: fdiv
    //   274: fstore #9
    //   276: iconst_0
    //   277: istore #10
    //   279: fload #9
    //   281: invokestatic round : (F)I
    //   284: istore #8
    //   286: aload_1
    //   287: astore #9
    //   289: iconst_0
    //   290: istore #10
    //   292: nop
    //   293: iconst_0
    //   294: istore #11
    //   296: aload #9
    //   298: invokeinterface size : ()I
    //   303: istore #12
    //   305: iload #11
    //   307: iload #12
    //   309: if_icmpge -> 420
    //   312: aload #9
    //   314: iload #11
    //   316: invokeinterface get : (I)Ljava/lang/Object;
    //   321: astore #13
    //   323: aload #13
    //   325: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
    //   328: astore #14
    //   330: iconst_0
    //   331: istore #15
    //   333: aload #14
    //   335: invokestatic getRowColumnParentData : (Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;
    //   338: invokestatic getWeight : (Landroidx/compose/foundation/layout/RowColumnParentData;)F
    //   341: fstore #16
    //   343: fload #16
    //   345: fconst_0
    //   346: fcmpl
    //   347: ifle -> 412
    //   350: nop
    //   351: iload #6
    //   353: istore #20
    //   355: aload #14
    //   357: iload #8
    //   359: ldc 2147483647
    //   361: if_icmpeq -> 383
    //   364: iload #8
    //   366: i2f
    //   367: fload #16
    //   369: fmul
    //   370: fstore #21
    //   372: iconst_0
    //   373: istore #22
    //   375: fload #21
    //   377: invokestatic round : (F)I
    //   380: goto -> 385
    //   383: ldc 2147483647
    //   385: istore #17
    //   387: astore #18
    //   389: iconst_0
    //   390: istore #19
    //   392: aload #18
    //   394: iload #17
    //   396: invokeinterface maxIntrinsicHeight : (I)I
    //   401: istore #21
    //   403: iload #20
    //   405: iload #21
    //   407: invokestatic max : (II)I
    //   410: istore #6
    //   412: nop
    //   413: nop
    //   414: iinc #11, 1
    //   417: goto -> 305
    //   420: nop
    //   421: iload #6
    //   423: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #400	-> 6
    //   #940	-> 9
    //   #941	-> 22
    //   #941	-> 39
    //   #942	-> 41
    //   #943	-> 44
    //   #944	-> 47
    //   #945	-> 53
    //   #946	-> 54
    //   #947	-> 73
    //   #948	-> 84
    //   #949	-> 94
    //   #950	-> 104
    //   #953	-> 119
    //   #954	-> 125
    //   #953	-> 134
    //   #955	-> 136
    //   #956	-> 137
    //   #402	-> 148
    //   #956	-> 157
    //   #955	-> 162
    //   #959	-> 164
    //   #961	-> 171
    //   #403	-> 186
    //   #961	-> 201
    //   #961	-> 204
    //   #962	-> 209
    //   #963	-> 216
    //   #965	-> 223
    //   #948	-> 224
    //   #946	-> 225
    //   #966	-> 231
    //   #967	-> 232
    //   #968	-> 247
    //   #969	-> 251
    //   #970	-> 257
    //   #972	-> 262
    //   #972	-> 271
    //   #973	-> 279
    //   #967	-> 284
    //   #974	-> 286
    //   #945	-> 292
    //   #946	-> 293
    //   #947	-> 312
    //   #948	-> 323
    //   #975	-> 333
    //   #977	-> 343
    //   #978	-> 350
    //   #979	-> 351
    //   #980	-> 355
    //   #981	-> 357
    //   #982	-> 364
    //   #973	-> 375
    //   #984	-> 383
    //   #980	-> 385
    //   #403	-> 392
    //   #980	-> 401
    //   #978	-> 403
    //   #978	-> 410
    //   #989	-> 412
    //   #948	-> 413
    //   #946	-> 414
    //   #966	-> 420
    //   #990	-> 421
    //   #400	-> 423
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   148	9	19	$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$HorizontalMaxHeight$1	I
    //   145	12	18	$this$HorizontalMaxHeight_u24lambda_u249	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   145	12	17	h	I
    //   186	9	19	$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$HorizontalMaxHeight$2	I
    //   183	12	18	$this$HorizontalMaxHeight_u24lambda_u2410	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   183	12	17	w	I
    //   392	9	19	$i$a$-intrinsicCrossAxisSize-IntrinsicMeasureBlocks$HorizontalMaxHeight$2	I
    //   389	12	18	$this$HorizontalMaxHeight_u24lambda_u2410	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   389	12	17	w	I
    //   136	70	16	remaining$iv	I
    //   164	42	20	mainAxisSpace$iv	I
    //   94	130	14	$i$a$-fastForEach-RowColumnImplKt$intrinsicCrossAxisSize$1$iv	I
    //   104	120	15	weight$iv	F
    //   91	133	13	child$iv	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   84	141	12	item$iv$iv	Ljava/lang/Object;
    //   57	174	10	index$iv$iv	I
    //   53	179	9	$i$f$fastForEach	I
    //   50	182	8	$this$fastForEach$iv$iv	Ljava/util/List;
    //   279	5	10	$i$f$fastRoundToInt	I
    //   276	8	9	$this$fastRoundToInt$iv$iv	F
    //   375	5	22	$i$f$fastRoundToInt	I
    //   372	8	21	$this$fastRoundToInt$iv$iv	F
    //   333	80	15	$i$a$-fastForEach-RowColumnImplKt$intrinsicCrossAxisSize$2$iv	I
    //   343	70	16	weight$iv	F
    //   330	83	14	child$iv	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   323	91	13	item$iv$iv	Ljava/lang/Object;
    //   296	124	11	index$iv$iv	I
    //   292	129	10	$i$f$fastForEach	I
    //   289	132	9	$this$fastForEach$iv$iv	Ljava/util/List;
    //   9	414	4	$i$f$intrinsicCrossAxisSize	I
    //   25	398	5	fixedSpace$iv	I
    //   44	379	6	crossAxisMax$iv	I
    //   47	376	7	totalWeight$iv	F
    //   286	137	8	weightUnitSpace$iv	I
    //   0	424	0	this	Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;
    //   0	424	1	measurables	Ljava/util/List;
    //   0	424	2	availableWidth	I
    //   0	424	3	mainAxisSpacing	I
  }
  
  public final int VerticalMaxHeight(@NotNull List measurables, int availableWidth, int mainAxisSpacing) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'measurables'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: iconst_0
    //   7: istore #4
    //   9: aload_1
    //   10: invokeinterface isEmpty : ()Z
    //   15: ifeq -> 22
    //   18: iconst_0
    //   19: goto -> 218
    //   22: iconst_0
    //   23: istore #5
    //   25: iconst_0
    //   26: istore #6
    //   28: fconst_0
    //   29: fstore #7
    //   31: aload_1
    //   32: astore #8
    //   34: iconst_0
    //   35: istore #9
    //   37: nop
    //   38: iconst_0
    //   39: istore #10
    //   41: aload #8
    //   43: invokeinterface size : ()I
    //   48: istore #11
    //   50: iload #10
    //   52: iload #11
    //   54: if_icmpge -> 187
    //   57: aload #8
    //   59: iload #10
    //   61: invokeinterface get : (I)Ljava/lang/Object;
    //   66: astore #12
    //   68: aload #12
    //   70: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
    //   73: astore #13
    //   75: iconst_0
    //   76: istore #14
    //   78: aload #13
    //   80: invokestatic getRowColumnParentData : (Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;
    //   83: invokestatic getWeight : (Landroidx/compose/foundation/layout/RowColumnParentData;)F
    //   86: fstore #15
    //   88: aload #13
    //   90: iload_2
    //   91: istore #16
    //   93: astore #17
    //   95: iconst_0
    //   96: istore #18
    //   98: aload #17
    //   100: iload #16
    //   102: invokeinterface maxIntrinsicHeight : (I)I
    //   107: istore #19
    //   109: fload #15
    //   111: fconst_0
    //   112: fcmpg
    //   113: ifne -> 120
    //   116: iconst_1
    //   117: goto -> 121
    //   120: iconst_0
    //   121: ifeq -> 134
    //   124: iload #6
    //   126: iload #19
    //   128: iadd
    //   129: istore #6
    //   131: goto -> 179
    //   134: fload #15
    //   136: fconst_0
    //   137: fcmpl
    //   138: ifle -> 179
    //   141: fload #7
    //   143: fload #15
    //   145: fadd
    //   146: fstore #7
    //   148: iload #5
    //   150: istore #20
    //   152: iload #19
    //   154: i2f
    //   155: fload #15
    //   157: fdiv
    //   158: fstore #21
    //   160: iconst_0
    //   161: istore #22
    //   163: fload #21
    //   165: invokestatic round : (F)I
    //   168: istore #21
    //   170: iload #20
    //   172: iload #21
    //   174: invokestatic max : (II)I
    //   177: istore #5
    //   179: nop
    //   180: nop
    //   181: iinc #10, 1
    //   184: goto -> 50
    //   187: nop
    //   188: iload #5
    //   190: i2f
    //   191: fload #7
    //   193: fmul
    //   194: fstore #8
    //   196: iconst_0
    //   197: istore #9
    //   199: fload #8
    //   201: invokestatic round : (F)I
    //   204: iload #6
    //   206: iadd
    //   207: aload_1
    //   208: invokeinterface size : ()I
    //   213: iconst_1
    //   214: isub
    //   215: iload_3
    //   216: imul
    //   217: iadd
    //   218: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #413	-> 6
    //   #991	-> 9
    //   #992	-> 22
    //   #993	-> 25
    //   #994	-> 28
    //   #995	-> 31
    //   #996	-> 37
    //   #997	-> 38
    //   #998	-> 57
    //   #999	-> 68
    //   #1000	-> 78
    //   #1001	-> 88
    //   #415	-> 98
    //   #1001	-> 107
    //   #1002	-> 109
    //   #1003	-> 124
    //   #1004	-> 134
    //   #1005	-> 141
    //   #1006	-> 148
    //   #1007	-> 163
    //   #1006	-> 170
    //   #1006	-> 177
    //   #1008	-> 179
    //   #999	-> 180
    //   #997	-> 181
    //   #1009	-> 187
    //   #1010	-> 188
    //   #1007	-> 199
    //   #1010	-> 204
    //   #1011	-> 207
    //   #1010	-> 217
    //   #413	-> 218
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   98	9	18	$i$a$-intrinsicMainAxisSize-IntrinsicMeasureBlocks$VerticalMaxHeight$1	I
    //   95	12	17	$this$VerticalMaxHeight_u24lambda_u2411	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   95	12	16	w	I
    //   163	5	22	$i$f$fastRoundToInt	I
    //   160	8	21	$this$fastRoundToInt$iv$iv	F
    //   78	102	14	$i$a$-fastForEach-RowColumnImplKt$intrinsicMainAxisSize$1$iv	I
    //   88	92	15	weight$iv	F
    //   109	71	19	size$iv	I
    //   75	105	13	child$iv	Landroidx/compose/ui/layout/IntrinsicMeasurable;
    //   68	113	12	item$iv$iv	Ljava/lang/Object;
    //   41	146	10	index$iv$iv	I
    //   37	151	9	$i$f$fastForEach	I
    //   34	154	8	$this$fastForEach$iv$iv	Ljava/util/List;
    //   199	5	9	$i$f$fastRoundToInt	I
    //   196	8	8	$this$fastRoundToInt$iv$iv	F
    //   9	209	4	$i$f$intrinsicMainAxisSize	I
    //   25	193	5	weightUnitSpace$iv	I
    //   28	190	6	fixedSpace$iv	I
    //   31	187	7	totalWeight$iv	F
    //   0	219	0	this	Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;
    //   0	219	1	measurables	Ljava/util/List;
    //   0	219	2	availableWidth	I
    //   0	219	3	mainAxisSpacing	I
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\IntrinsicMeasureBlocks.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */