package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\0008\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\005\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\b\003\n\002\020\025\n\002\b\003\032\001\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0042\006\020\005\032\0020\0042\006\020\006\032\0020\0042\006\020\007\032\0020\0042\006\020\b\032\0020\0042\006\020\t\032\0020\n2\f\020\013\032\b\022\004\022\0020\r0\f2\016\020\016\032\n\022\006\022\004\030\0010\0200\0172\006\020\021\032\0020\0042\006\020\022\032\0020\0042\n\b\002\020\023\032\004\030\0010\0242\b\b\002\020\025\032\0020\004H\000¢\006\002\020\026¨\006\027"}, d2 = {"measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "mainAxisMin", "", "crossAxisMin", "mainAxisMax", "crossAxisMax", "arrangementSpacingInt", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "startIndex", "endIndex", "crossAxisOffset", "", "currentLineIndex", "(Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;IIIIILandroidx/compose/ui/layout/MeasureScope;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;II[II)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout"})
@SourceDebugExtension({"SMAP\nRowColumnMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnMeasurePolicy.kt\nandroidx/compose/foundation/layout/RowColumnMeasurePolicyKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,323:1\n26#2:324\n26#2:325\n26#2:326\n26#2:328\n1#3:327\n*S KotlinDebug\n*F\n+ 1 RowColumnMeasurePolicy.kt\nandroidx/compose/foundation/layout/RowColumnMeasurePolicyKt\n*L\n116#1:324\n168#1:325\n200#1:326\n211#1:328\n*E\n"})
public final class RowColumnMeasurePolicyKt {
  @NotNull
  public static final MeasureResult measure(@NotNull RowColumnMeasurePolicy $this$measure, int mainAxisMin, int crossAxisMin, int mainAxisMax, int crossAxisMax, int arrangementSpacingInt, @NotNull MeasureScope measureScope, @NotNull List measurables, @NotNull Placeable[] placeables, int startIndex, int endIndex, @Nullable int[] crossAxisOffset, int currentLineIndex) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload #6
    //   8: ldc 'measureScope'
    //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   13: aload #7
    //   15: ldc 'measurables'
    //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   20: aload #8
    //   22: ldc 'placeables'
    //   24: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   27: iload #5
    //   29: i2l
    //   30: lstore #13
    //   32: fconst_0
    //   33: fstore #15
    //   35: iconst_0
    //   36: istore #16
    //   38: iconst_0
    //   39: istore #17
    //   41: iconst_0
    //   42: istore #18
    //   44: iconst_0
    //   45: istore #19
    //   47: iload #10
    //   49: iload #9
    //   51: isub
    //   52: istore #20
    //   54: iload #20
    //   56: newarray int
    //   58: astore #21
    //   60: iconst_0
    //   61: istore #22
    //   63: iconst_0
    //   64: istore #23
    //   66: iconst_0
    //   67: istore #24
    //   69: iload #9
    //   71: istore #25
    //   73: iload #25
    //   75: iload #10
    //   77: if_icmpge -> 368
    //   80: aload #7
    //   82: iload #25
    //   84: invokeinterface get : (I)Ljava/lang/Object;
    //   89: checkcast androidx/compose/ui/layout/Measurable
    //   92: astore #26
    //   94: aload #26
    //   96: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
    //   99: invokestatic getRowColumnParentData : (Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;
    //   102: astore #27
    //   104: aload #27
    //   106: invokestatic getWeight : (Landroidx/compose/foundation/layout/RowColumnParentData;)F
    //   109: fstore #28
    //   111: iload #19
    //   113: ifne -> 124
    //   116: aload #27
    //   118: invokestatic isRelative : (Landroidx/compose/foundation/layout/RowColumnParentData;)Z
    //   121: ifeq -> 128
    //   124: iconst_1
    //   125: goto -> 129
    //   128: iconst_0
    //   129: istore #19
    //   131: fload #28
    //   133: fconst_0
    //   134: fcmpl
    //   135: ifle -> 151
    //   138: fload #15
    //   140: fload #28
    //   142: fadd
    //   143: fstore #15
    //   145: iinc #18, 1
    //   148: goto -> 362
    //   151: iload #4
    //   153: ldc 2147483647
    //   155: if_icmpne -> 162
    //   158: aconst_null
    //   159: goto -> 208
    //   162: aload #27
    //   164: dup
    //   165: ifnull -> 206
    //   168: invokevirtual getFlowLayoutData : ()Landroidx/compose/foundation/layout/FlowLayoutData;
    //   171: dup
    //   172: ifnull -> 206
    //   175: astore #32
    //   177: iconst_0
    //   178: istore #33
    //   180: aload #32
    //   182: invokevirtual getFillCrossAxisFraction : ()F
    //   185: iload #4
    //   187: i2f
    //   188: fmul
    //   189: fstore #34
    //   191: iconst_0
    //   192: istore #35
    //   194: fload #34
    //   196: invokestatic round : (F)I
    //   199: nop
    //   200: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   203: goto -> 208
    //   206: pop
    //   207: aconst_null
    //   208: astore #29
    //   210: iload_3
    //   211: iload #16
    //   213: isub
    //   214: istore #30
    //   216: aload #8
    //   218: iload #25
    //   220: aaload
    //   221: dup
    //   222: ifnonnull -> 288
    //   225: pop
    //   226: aload #26
    //   228: aload_0
    //   229: iconst_0
    //   230: aload #29
    //   232: dup
    //   233: ifnull -> 242
    //   236: invokevirtual intValue : ()I
    //   239: goto -> 244
    //   242: pop
    //   243: iconst_0
    //   244: iload_3
    //   245: ldc 2147483647
    //   247: if_icmpne -> 255
    //   250: ldc 2147483647
    //   252: goto -> 261
    //   255: iload #30
    //   257: iconst_0
    //   258: invokestatic coerceAtLeast : (II)I
    //   261: aload #29
    //   263: dup
    //   264: ifnull -> 273
    //   267: invokevirtual intValue : ()I
    //   270: goto -> 276
    //   273: pop
    //   274: iload #4
    //   276: iconst_0
    //   277: bipush #16
    //   279: aconst_null
    //   280: invokestatic createConstraints-xF2OJ5Q$default : (Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;IIIIZILjava/lang/Object;)J
    //   283: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
    //   288: astore #31
    //   290: aload_0
    //   291: aload #31
    //   293: invokeinterface mainAxisSize : (Landroidx/compose/ui/layout/Placeable;)I
    //   298: istore #32
    //   300: aload_0
    //   301: aload #31
    //   303: invokeinterface crossAxisSize : (Landroidx/compose/ui/layout/Placeable;)I
    //   308: istore #33
    //   310: aload #21
    //   312: iload #25
    //   314: iload #9
    //   316: isub
    //   317: iload #32
    //   319: iastore
    //   320: iload #5
    //   322: iload #30
    //   324: iload #32
    //   326: isub
    //   327: iconst_0
    //   328: invokestatic coerceAtLeast : (II)I
    //   331: invokestatic min : (II)I
    //   334: istore #24
    //   336: iload #16
    //   338: iload #32
    //   340: iload #24
    //   342: iadd
    //   343: iadd
    //   344: istore #16
    //   346: iload #17
    //   348: iload #33
    //   350: invokestatic max : (II)I
    //   353: istore #17
    //   355: aload #8
    //   357: iload #25
    //   359: aload #31
    //   361: aastore
    //   362: iinc #25, 1
    //   365: goto -> 73
    //   368: iconst_0
    //   369: istore #25
    //   371: iload #18
    //   373: ifne -> 386
    //   376: iload #16
    //   378: iload #24
    //   380: isub
    //   381: istore #16
    //   383: goto -> 1195
    //   386: iload_3
    //   387: ldc 2147483647
    //   389: if_icmpeq -> 396
    //   392: iload_3
    //   393: goto -> 397
    //   396: iload_1
    //   397: istore #26
    //   399: lload #13
    //   401: iload #18
    //   403: iconst_1
    //   404: isub
    //   405: i2l
    //   406: lmul
    //   407: lstore #27
    //   409: iload #26
    //   411: iload #16
    //   413: isub
    //   414: i2l
    //   415: lload #27
    //   417: lsub
    //   418: lconst_0
    //   419: invokestatic coerceAtLeast : (JJ)J
    //   422: lstore #29
    //   424: lload #29
    //   426: l2f
    //   427: fload #15
    //   429: fdiv
    //   430: fstore #31
    //   432: lload #29
    //   434: lstore #32
    //   436: iload #9
    //   438: istore #34
    //   440: iload #34
    //   442: iload #10
    //   444: if_icmpge -> 662
    //   447: aload #7
    //   449: iload #34
    //   451: invokeinterface get : (I)Ljava/lang/Object;
    //   456: checkcast androidx/compose/ui/layout/Measurable
    //   459: astore #35
    //   461: aload #35
    //   463: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
    //   466: invokestatic getRowColumnParentData : (Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;
    //   469: invokestatic getWeight : (Landroidx/compose/foundation/layout/RowColumnParentData;)F
    //   472: fstore #36
    //   474: fload #31
    //   476: fload #36
    //   478: fmul
    //   479: fstore #37
    //   481: nop
    //   482: lload #32
    //   484: fload #37
    //   486: fstore #38
    //   488: iconst_0
    //   489: istore #39
    //   491: fload #38
    //   493: invokestatic round : (F)I
    //   496: i2l
    //   497: lsub
    //   498: lstore #32
    //   500: goto -> 656
    //   503: astore #38
    //   505: new java/lang/IllegalArgumentException
    //   508: dup
    //   509: new java/lang/StringBuilder
    //   512: dup
    //   513: invokespecial <init> : ()V
    //   516: astore #39
    //   518: aload #39
    //   520: ldc 'This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax '
    //   522: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   525: iload_3
    //   526: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   529: ldc 'mainAxisMin '
    //   531: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   534: iload_1
    //   535: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   538: ldc 'targetSpace '
    //   540: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   543: iload #26
    //   545: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   548: ldc 'arrangementSpacingPx '
    //   550: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   553: lload #13
    //   555: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   558: ldc 'weightChildrenCount '
    //   560: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   563: iload #18
    //   565: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   568: ldc 'fixedSpace '
    //   570: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   573: iload #16
    //   575: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   578: ldc 'arrangementSpacingTotal '
    //   580: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   583: lload #27
    //   585: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   588: ldc 'remainingToTarget '
    //   590: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   593: lload #29
    //   595: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   598: ldc 'totalWeight '
    //   600: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   603: fload #15
    //   605: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   608: ldc 'weightUnitSpace '
    //   610: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   613: fload #31
    //   615: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   618: ldc 'itemWeight '
    //   620: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   623: fload #36
    //   625: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   628: ldc 'weightedSize '
    //   630: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   633: pop
    //   634: aload #39
    //   636: fload #37
    //   638: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   641: pop
    //   642: aload #39
    //   644: invokevirtual toString : ()Ljava/lang/String;
    //   647: aload #38
    //   649: checkcast java/lang/Throwable
    //   652: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   655: athrow
    //   656: iinc #34, 1
    //   659: goto -> 440
    //   662: iload #9
    //   664: istore #34
    //   666: iload #34
    //   668: iload #10
    //   670: if_icmpge -> 1178
    //   673: aload #8
    //   675: iload #34
    //   677: aaload
    //   678: ifnonnull -> 1172
    //   681: aload #7
    //   683: iload #34
    //   685: invokeinterface get : (I)Ljava/lang/Object;
    //   690: checkcast androidx/compose/ui/layout/Measurable
    //   693: astore #35
    //   695: aload #35
    //   697: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
    //   700: invokestatic getRowColumnParentData : (Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;
    //   703: astore #36
    //   705: aload #36
    //   707: invokestatic getWeight : (Landroidx/compose/foundation/layout/RowColumnParentData;)F
    //   710: fstore #37
    //   712: iload #4
    //   714: ldc 2147483647
    //   716: if_icmpne -> 723
    //   719: aconst_null
    //   720: goto -> 769
    //   723: aload #36
    //   725: dup
    //   726: ifnull -> 767
    //   729: invokevirtual getFlowLayoutData : ()Landroidx/compose/foundation/layout/FlowLayoutData;
    //   732: dup
    //   733: ifnull -> 767
    //   736: astore #41
    //   738: iconst_0
    //   739: istore #42
    //   741: aload #41
    //   743: invokevirtual getFillCrossAxisFraction : ()F
    //   746: iload #4
    //   748: i2f
    //   749: fmul
    //   750: fstore #43
    //   752: iconst_0
    //   753: istore #44
    //   755: fload #43
    //   757: invokestatic round : (F)I
    //   760: nop
    //   761: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   764: goto -> 769
    //   767: pop
    //   768: aconst_null
    //   769: astore #38
    //   771: fload #37
    //   773: fconst_0
    //   774: fcmpl
    //   775: ifle -> 782
    //   778: iconst_1
    //   779: goto -> 783
    //   782: iconst_0
    //   783: ifne -> 806
    //   786: iconst_0
    //   787: istore #40
    //   789: ldc 'All weights <= 0 should have placeables'
    //   791: astore #40
    //   793: new java/lang/IllegalStateException
    //   796: dup
    //   797: aload #40
    //   799: invokevirtual toString : ()Ljava/lang/String;
    //   802: invokespecial <init> : (Ljava/lang/String;)V
    //   805: athrow
    //   806: lload #32
    //   808: invokestatic getSign : (J)I
    //   811: istore #39
    //   813: lload #32
    //   815: iload #39
    //   817: i2l
    //   818: lsub
    //   819: lstore #32
    //   821: fload #31
    //   823: fload #37
    //   825: fmul
    //   826: fstore #40
    //   828: iconst_0
    //   829: istore #42
    //   831: fload #40
    //   833: fstore #43
    //   835: iconst_0
    //   836: istore #44
    //   838: fload #43
    //   840: invokestatic round : (F)I
    //   843: iload #39
    //   845: iadd
    //   846: istore #43
    //   848: iload #42
    //   850: iload #43
    //   852: invokestatic max : (II)I
    //   855: istore #41
    //   857: lconst_0
    //   858: lstore #42
    //   860: nop
    //   861: aload_0
    //   862: aload #36
    //   864: invokestatic getFill : (Landroidx/compose/foundation/layout/RowColumnParentData;)Z
    //   867: ifeq -> 882
    //   870: iload #41
    //   872: ldc 2147483647
    //   874: if_icmpeq -> 882
    //   877: iload #41
    //   879: goto -> 883
    //   882: iconst_0
    //   883: aload #38
    //   885: dup
    //   886: ifnull -> 895
    //   889: invokevirtual intValue : ()I
    //   892: goto -> 897
    //   895: pop
    //   896: iconst_0
    //   897: iload #41
    //   899: aload #38
    //   901: dup
    //   902: ifnull -> 911
    //   905: invokevirtual intValue : ()I
    //   908: goto -> 914
    //   911: pop
    //   912: iload #4
    //   914: iconst_1
    //   915: invokeinterface createConstraints-xF2OJ5Q : (IIIIZ)J
    //   920: lstore #42
    //   922: goto -> 1108
    //   925: astore #44
    //   927: new java/lang/IllegalArgumentException
    //   930: dup
    //   931: new java/lang/StringBuilder
    //   934: dup
    //   935: invokespecial <init> : ()V
    //   938: astore #45
    //   940: aload #45
    //   942: ldc 'This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax '
    //   944: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   947: iload_3
    //   948: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   951: ldc 'mainAxisMin '
    //   953: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   956: iload_1
    //   957: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   960: ldc 'targetSpace '
    //   962: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   965: iload #26
    //   967: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   970: ldc 'arrangementSpacingPx '
    //   972: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   975: lload #13
    //   977: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   980: ldc 'weightChildrenCount '
    //   982: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   985: iload #18
    //   987: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   990: ldc 'fixedSpace '
    //   992: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   995: iload #16
    //   997: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1000: ldc 'arrangementSpacingTotal '
    //   1002: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1005: lload #27
    //   1007: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   1010: ldc 'remainingToTarget '
    //   1012: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1015: lload #29
    //   1017: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   1020: ldc 'totalWeight '
    //   1022: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1025: fload #15
    //   1027: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   1030: ldc 'weightUnitSpace '
    //   1032: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1035: fload #31
    //   1037: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   1040: ldc 'weight '
    //   1042: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1045: fload #37
    //   1047: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   1050: ldc 'weightedSize '
    //   1052: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1055: pop
    //   1056: aload #45
    //   1058: fload #40
    //   1060: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   1063: ldc 'crossAxisDesiredSize '
    //   1065: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1068: aload #38
    //   1070: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1073: ldc 'remainderUnit '
    //   1075: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1078: iload #39
    //   1080: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1083: ldc 'childMainAxisSize '
    //   1085: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1088: iload #41
    //   1090: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1093: pop
    //   1094: aload #45
    //   1096: invokevirtual toString : ()Ljava/lang/String;
    //   1099: aload #44
    //   1101: checkcast java/lang/Throwable
    //   1104: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1107: athrow
    //   1108: aload #35
    //   1110: lload #42
    //   1112: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
    //   1117: astore #44
    //   1119: aload_0
    //   1120: aload #44
    //   1122: invokeinterface mainAxisSize : (Landroidx/compose/ui/layout/Placeable;)I
    //   1127: istore #45
    //   1129: aload_0
    //   1130: aload #44
    //   1132: invokeinterface crossAxisSize : (Landroidx/compose/ui/layout/Placeable;)I
    //   1137: istore #46
    //   1139: aload #21
    //   1141: iload #34
    //   1143: iload #9
    //   1145: isub
    //   1146: iload #45
    //   1148: iastore
    //   1149: iload #25
    //   1151: iload #45
    //   1153: iadd
    //   1154: istore #25
    //   1156: iload #17
    //   1158: iload #46
    //   1160: invokestatic max : (II)I
    //   1163: istore #17
    //   1165: aload #8
    //   1167: iload #34
    //   1169: aload #44
    //   1171: aastore
    //   1172: iinc #34, 1
    //   1175: goto -> 666
    //   1178: iload #25
    //   1180: i2l
    //   1181: lload #27
    //   1183: ladd
    //   1184: l2i
    //   1185: iconst_0
    //   1186: iload_3
    //   1187: iload #16
    //   1189: isub
    //   1190: invokestatic coerceIn : (III)I
    //   1193: istore #25
    //   1195: iload #19
    //   1197: ifeq -> 1344
    //   1200: iload #9
    //   1202: istore #26
    //   1204: iload #26
    //   1206: iload #10
    //   1208: if_icmpge -> 1344
    //   1211: aload #8
    //   1213: iload #26
    //   1215: aaload
    //   1216: astore #27
    //   1218: aload #27
    //   1220: dup
    //   1221: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   1224: invokestatic getRowColumnParentData : (Landroidx/compose/ui/layout/Placeable;)Landroidx/compose/foundation/layout/RowColumnParentData;
    //   1227: astore #28
    //   1229: aload #28
    //   1231: invokestatic getCrossAxisAlignment : (Landroidx/compose/foundation/layout/RowColumnParentData;)Landroidx/compose/foundation/layout/CrossAxisAlignment;
    //   1234: astore #30
    //   1236: aload #30
    //   1238: ifnull -> 1251
    //   1241: aload #30
    //   1243: aload #27
    //   1245: invokevirtual calculateAlignmentLinePosition$foundation_layout : (Landroidx/compose/ui/layout/Placeable;)Ljava/lang/Integer;
    //   1248: goto -> 1252
    //   1251: aconst_null
    //   1252: astore #29
    //   1254: aload #29
    //   1256: dup
    //   1257: ifnull -> 1336
    //   1260: checkcast java/lang/Number
    //   1263: invokevirtual intValue : ()I
    //   1266: istore #31
    //   1268: iconst_0
    //   1269: istore #32
    //   1271: aload_0
    //   1272: aload #27
    //   1274: invokeinterface crossAxisSize : (Landroidx/compose/ui/layout/Placeable;)I
    //   1279: istore #33
    //   1281: nop
    //   1282: nop
    //   1283: iload #22
    //   1285: iload #31
    //   1287: ldc -2147483648
    //   1289: if_icmpeq -> 1300
    //   1292: aload #29
    //   1294: invokevirtual intValue : ()I
    //   1297: goto -> 1301
    //   1300: iconst_0
    //   1301: invokestatic max : (II)I
    //   1304: istore #22
    //   1306: nop
    //   1307: nop
    //   1308: iload #23
    //   1310: iload #33
    //   1312: iload #31
    //   1314: ldc -2147483648
    //   1316: if_icmpeq -> 1324
    //   1319: iload #31
    //   1321: goto -> 1326
    //   1324: iload #33
    //   1326: isub
    //   1327: invokestatic max : (II)I
    //   1330: istore #23
    //   1332: nop
    //   1333: goto -> 1338
    //   1336: pop
    //   1337: nop
    //   1338: iinc #26, 1
    //   1341: goto -> 1204
    //   1344: nop
    //   1345: iload #16
    //   1347: iload #25
    //   1349: iadd
    //   1350: iconst_0
    //   1351: invokestatic coerceAtLeast : (II)I
    //   1354: iload_1
    //   1355: invokestatic max : (II)I
    //   1358: istore #26
    //   1360: iload #17
    //   1362: iload_2
    //   1363: iload #22
    //   1365: iload #23
    //   1367: iadd
    //   1368: invokestatic max : (II)I
    //   1371: invokestatic max : (II)I
    //   1374: istore #27
    //   1376: iconst_0
    //   1377: istore #29
    //   1379: iload #20
    //   1381: newarray int
    //   1383: astore #30
    //   1385: iload #29
    //   1387: iload #20
    //   1389: if_icmpge -> 1408
    //   1392: iload #29
    //   1394: istore #31
    //   1396: aload #30
    //   1398: iload #31
    //   1400: iconst_0
    //   1401: iastore
    //   1402: iinc #29, 1
    //   1405: goto -> 1385
    //   1408: aload #30
    //   1410: astore #28
    //   1412: aload_0
    //   1413: iload #26
    //   1415: aload #21
    //   1417: aload #28
    //   1419: aload #6
    //   1421: invokeinterface populateMainAxisPositions : (I[I[ILandroidx/compose/ui/layout/MeasureScope;)V
    //   1426: aload_0
    //   1427: aload #8
    //   1429: aload #6
    //   1431: iload #22
    //   1433: aload #28
    //   1435: iload #26
    //   1437: iload #27
    //   1439: aload #11
    //   1441: iload #12
    //   1443: iload #9
    //   1445: iload #10
    //   1447: invokeinterface placeHelper : ([Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/MeasureScope;I[III[IIII)Landroidx/compose/ui/layout/MeasureResult;
    //   1452: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #88	-> 27
    //   #90	-> 32
    //   #91	-> 35
    //   #92	-> 38
    //   #93	-> 41
    //   #95	-> 44
    //   #96	-> 47
    //   #97	-> 54
    //   #99	-> 60
    //   #100	-> 63
    //   #102	-> 66
    //   #104	-> 69
    //   #105	-> 80
    //   #106	-> 94
    //   #107	-> 104
    //   #108	-> 111
    //   #110	-> 131
    //   #111	-> 138
    //   #112	-> 148
    //   #114	-> 151
    //   #115	-> 162
    //   #116	-> 180
    //   #324	-> 194
    //   #116	-> 199
    //   #115	-> 203
    //   #115	-> 206
    //   #114	-> 208
    //   #118	-> 210
    //   #119	-> 216
    //   #121	-> 228
    //   #122	-> 229
    //   #123	-> 230
    //   #124	-> 244
    //   #125	-> 250
    //   #127	-> 255
    //   #129	-> 261
    //   #121	-> 276
    //   #119	-> 283
    //   #132	-> 290
    //   #133	-> 300
    //   #134	-> 310
    //   #135	-> 320
    //   #135	-> 320
    //   #137	-> 322
    //   #135	-> 334
    //   #139	-> 336
    //   #140	-> 346
    //   #140	-> 353
    //   #141	-> 355
    //   #104	-> 362
    //   #145	-> 368
    //   #146	-> 371
    //   #148	-> 376
    //   #152	-> 386
    //   #153	-> 392
    //   #155	-> 396
    //   #152	-> 397
    //   #151	-> 397
    //   #157	-> 399
    //   #159	-> 409
    //   #158	-> 422
    //   #161	-> 424
    //   #162	-> 432
    //   #163	-> 436
    //   #164	-> 447
    //   #165	-> 461
    //   #166	-> 474
    //   #167	-> 481
    //   #168	-> 482
    //   #325	-> 491
    //   #168	-> 497
    //   #169	-> 503
    //   #170	-> 505
    //   #171	-> 509
    //   #176	-> 525
    //   #171	-> 526
    //   #177	-> 529
    //   #171	-> 531
    //   #177	-> 534
    //   #171	-> 535
    //   #178	-> 538
    //   #171	-> 540
    //   #178	-> 543
    //   #171	-> 545
    //   #179	-> 548
    //   #171	-> 550
    //   #179	-> 553
    //   #171	-> 555
    //   #180	-> 558
    //   #171	-> 560
    //   #180	-> 563
    //   #171	-> 565
    //   #181	-> 568
    //   #171	-> 570
    //   #181	-> 573
    //   #171	-> 575
    //   #182	-> 578
    //   #171	-> 580
    //   #182	-> 583
    //   #171	-> 585
    //   #183	-> 588
    //   #171	-> 590
    //   #183	-> 593
    //   #171	-> 595
    //   #184	-> 598
    //   #171	-> 600
    //   #184	-> 603
    //   #171	-> 605
    //   #185	-> 608
    //   #171	-> 610
    //   #185	-> 613
    //   #171	-> 615
    //   #186	-> 618
    //   #171	-> 620
    //   #186	-> 623
    //   #171	-> 625
    //   #187	-> 628
    //   #171	-> 630
    //   #187	-> 636
    //   #171	-> 638
    //   #188	-> 647
    //   #170	-> 652
    //   #163	-> 656
    //   #193	-> 662
    //   #194	-> 673
    //   #195	-> 681
    //   #196	-> 695
    //   #197	-> 705
    //   #198	-> 712
    //   #199	-> 723
    //   #200	-> 741
    //   #326	-> 755
    //   #200	-> 760
    //   #199	-> 764
    //   #199	-> 767
    //   #198	-> 769
    //   #202	-> 771
    //   #327	-> 786
    //   #202	-> 789
    //   #202	-> 791
    //   #206	-> 806
    //   #207	-> 813
    //   #208	-> 821
    //   #210	-> 828
    //   #211	-> 831
    //   #328	-> 838
    //   #211	-> 843
    //   #209	-> 848
    //   #209	-> 855
    //   #214	-> 857
    //   #215	-> 860
    //   #216	-> 861
    //   #217	-> 862
    //   #218	-> 870
    //   #220	-> 877
    //   #222	-> 882
    //   #224	-> 883
    //   #225	-> 897
    //   #226	-> 899
    //   #227	-> 914
    //   #216	-> 915
    //   #229	-> 925
    //   #230	-> 927
    //   #231	-> 931
    //   #236	-> 947
    //   #231	-> 948
    //   #237	-> 951
    //   #231	-> 953
    //   #237	-> 956
    //   #231	-> 957
    //   #238	-> 960
    //   #231	-> 962
    //   #238	-> 965
    //   #231	-> 967
    //   #239	-> 970
    //   #231	-> 972
    //   #239	-> 975
    //   #231	-> 977
    //   #240	-> 980
    //   #231	-> 982
    //   #240	-> 985
    //   #231	-> 987
    //   #241	-> 990
    //   #231	-> 992
    //   #241	-> 995
    //   #231	-> 997
    //   #242	-> 1000
    //   #231	-> 1002
    //   #242	-> 1005
    //   #231	-> 1007
    //   #243	-> 1010
    //   #231	-> 1012
    //   #243	-> 1015
    //   #231	-> 1017
    //   #244	-> 1020
    //   #231	-> 1022
    //   #244	-> 1025
    //   #231	-> 1027
    //   #245	-> 1030
    //   #231	-> 1032
    //   #245	-> 1035
    //   #231	-> 1037
    //   #246	-> 1040
    //   #231	-> 1042
    //   #246	-> 1045
    //   #231	-> 1047
    //   #247	-> 1050
    //   #231	-> 1052
    //   #247	-> 1058
    //   #231	-> 1060
    //   #248	-> 1063
    //   #231	-> 1065
    //   #248	-> 1068
    //   #231	-> 1070
    //   #249	-> 1073
    //   #231	-> 1075
    //   #249	-> 1078
    //   #231	-> 1080
    //   #250	-> 1083
    //   #231	-> 1085
    //   #250	-> 1088
    //   #231	-> 1090
    //   #251	-> 1099
    //   #230	-> 1104
    //   #254	-> 1108
    //   #255	-> 1119
    //   #256	-> 1129
    //   #257	-> 1139
    //   #258	-> 1149
    //   #259	-> 1156
    //   #259	-> 1163
    //   #260	-> 1165
    //   #193	-> 1172
    //   #265	-> 1178
    //   #263	-> 1178
    //   #264	-> 1184
    //   #265	-> 1185
    //   #263	-> 1193
    //   #269	-> 1195
    //   #270	-> 1200
    //   #271	-> 1211
    //   #272	-> 1218
    //   #274	-> 1229
    //   #273	-> 1229
    //   #274	-> 1236
    //   #273	-> 1241
    //   #274	-> 1243
    //   #273	-> 1252
    //   #275	-> 1254
    //   #276	-> 1271
    //   #277	-> 1281
    //   #277	-> 1282
    //   #278	-> 1283
    //   #279	-> 1285
    //   #277	-> 1304
    //   #281	-> 1306
    //   #281	-> 1307
    //   #282	-> 1308
    //   #283	-> 1310
    //   #284	-> 1319
    //   #286	-> 1324
    //   #283	-> 1326
    //   #281	-> 1330
    //   #289	-> 1332
    //   #275	-> 1333
    //   #275	-> 1336
    //   #270	-> 1338
    //   #294	-> 1344
    //   #295	-> 1345
    //   #294	-> 1358
    //   #298	-> 1360
    //   #300	-> 1363
    //   #298	-> 1374
    //   #302	-> 1376
    //   #303	-> 1412
    //   #304	-> 1413
    //   #305	-> 1415
    //   #306	-> 1417
    //   #307	-> 1419
    //   #303	-> 1421
    //   #310	-> 1426
    //   #311	-> 1427
    //   #312	-> 1429
    //   #313	-> 1431
    //   #314	-> 1433
    //   #315	-> 1435
    //   #316	-> 1437
    //   #317	-> 1439
    //   #318	-> 1441
    //   #319	-> 1443
    //   #320	-> 1445
    //   #310	-> 1447
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   194	5	35	$i$f$fastRoundToInt	I
    //   191	8	34	$this$fastRoundToInt$iv	F
    //   180	20	33	$i$a$-let-RowColumnMeasurePolicyKt$measure$crossAxisDesiredSize$1	I
    //   177	23	32	it	Landroidx/compose/foundation/layout/FlowLayoutData;
    //   210	152	29	crossAxisDesiredSize	Ljava/lang/Integer;
    //   216	146	30	remaining	I
    //   290	72	31	placeable	Landroidx/compose/ui/layout/Placeable;
    //   300	62	32	placeableMainAxisSize	I
    //   310	52	33	placeableCrossAxisSize	I
    //   94	268	26	child	Landroidx/compose/ui/layout/Measurable;
    //   104	258	27	parentData	Landroidx/compose/foundation/layout/RowColumnParentData;
    //   111	251	28	weight	F
    //   73	295	25	i	I
    //   491	5	39	$i$f$fastRoundToInt	I
    //   488	8	38	$this$fastRoundToInt$iv	F
    //   505	151	38	e	Ljava/lang/IllegalArgumentException;
    //   461	195	35	measurable	Landroidx/compose/ui/layout/Measurable;
    //   474	182	36	itemWeight	F
    //   481	175	37	weightedSize	F
    //   440	222	34	i	I
    //   755	5	44	$i$f$fastRoundToInt	I
    //   752	8	43	$this$fastRoundToInt$iv	F
    //   741	20	42	$i$a$-let-RowColumnMeasurePolicyKt$measure$crossAxisDesiredSize$2	I
    //   738	23	41	it	Landroidx/compose/foundation/layout/FlowLayoutData;
    //   789	2	40	$i$a$-check-RowColumnMeasurePolicyKt$measure$1	I
    //   838	5	44	$i$f$fastRoundToInt	I
    //   835	8	43	$this$fastRoundToInt$iv	F
    //   927	181	44	e	Ljava/lang/IllegalArgumentException;
    //   695	477	35	child	Landroidx/compose/ui/layout/Measurable;
    //   705	467	36	parentData	Landroidx/compose/foundation/layout/RowColumnParentData;
    //   712	460	37	weight	F
    //   771	401	38	crossAxisDesiredSize	Ljava/lang/Integer;
    //   813	359	39	remainderUnit	I
    //   828	344	40	weightedSize	F
    //   857	315	41	childMainAxisSize	I
    //   860	312	42	childConstraints	J
    //   1119	53	44	placeable	Landroidx/compose/ui/layout/Placeable;
    //   1129	43	45	placeableMainAxisSize	I
    //   1139	33	46	placeableCrossAxisSize	I
    //   666	512	34	i	I
    //   399	796	26	targetSpace	I
    //   409	786	27	arrangementSpacingTotal	J
    //   424	771	29	remainingToTarget	J
    //   432	763	31	weightUnitSpace	F
    //   436	759	32	remainder	J
    //   1271	62	32	$i$a$-let-RowColumnMeasurePolicyKt$measure$2	I
    //   1281	52	33	placeableCrossAxisSize	I
    //   1268	65	31	it	I
    //   1218	120	27	placeable	Landroidx/compose/ui/layout/Placeable;
    //   1229	109	28	parentData	Landroidx/compose/foundation/layout/RowColumnParentData;
    //   1254	84	29	alignmentLinePosition	Ljava/lang/Integer;
    //   1204	140	26	i	I
    //   32	1421	13	arrangementSpacingPx	J
    //   35	1418	15	totalWeight	F
    //   38	1415	16	fixedSpace	I
    //   41	1412	17	crossAxisSpace	I
    //   44	1409	18	weightChildrenCount	I
    //   47	1406	19	anyAlignBy	Z
    //   54	1399	20	subSize	I
    //   60	1393	21	childrenMainAxisSize	[I
    //   63	1390	22	beforeCrossAxisAlignmentLine	I
    //   66	1387	23	afterCrossAxisAlignmentLine	I
    //   69	1384	24	spaceAfterLastNoWeight	I
    //   371	1082	25	weightedSpace	I
    //   1360	93	26	mainAxisLayoutSize	I
    //   1376	77	27	crossAxisLayoutSize	I
    //   1412	41	28	mainAxisPositions	[I
    //   0	1453	0	$this$measure	Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;
    //   0	1453	1	mainAxisMin	I
    //   0	1453	2	crossAxisMin	I
    //   0	1453	3	mainAxisMax	I
    //   0	1453	4	crossAxisMax	I
    //   0	1453	5	arrangementSpacingInt	I
    //   0	1453	6	measureScope	Landroidx/compose/ui/layout/MeasureScope;
    //   0	1453	7	measurables	Ljava/util/List;
    //   0	1453	8	placeables	[Landroidx/compose/ui/layout/Placeable;
    //   0	1453	9	startIndex	I
    //   0	1453	10	endIndex	I
    //   0	1453	11	crossAxisOffset	[I
    //   0	1453	12	currentLineIndex	I
    // Exception table:
    //   from	to	target	type
    //   481	500	503	java/lang/IllegalArgumentException
    //   860	922	925	java/lang/IllegalArgumentException
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\RowColumnMeasurePolicyKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */