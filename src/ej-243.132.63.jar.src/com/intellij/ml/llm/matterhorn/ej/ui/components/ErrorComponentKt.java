package com.intellij.ml.llm.matterhorn.ej.ui.components;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.ErrorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000,\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\032\037\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\006\020\004\032\0020\005H\007¢\006\002\020\006\032E\020\007\032\0020\0012\b\b\002\020\002\032\0020\0032\006\020\b\032\0020\t2\b\020\n\032\004\030\0010\t2\016\020\013\032\n\022\004\022\0020\001\030\0010\f2\b\b\002\020\r\032\0020\016H\003¢\006\004\b\017\020\020¨\006\021"}, d2 = {"ErrorComponent", "", "modifier", "Landroidx/compose/ui/Modifier;", "errorInfo", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo;", "(Landroidx/compose/ui/Modifier;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo;Landroidx/compose/runtime/Composer;II)V", "ErrorBox", "description", "", "actionName", "action", "Lkotlin/Function0;", "textColor", "Landroidx/compose/ui/graphics/Color;", "ErrorBox-yrwZFoE", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;II)V", "ej-ui"})
@SourceDebugExtension({"SMAP\nErrorComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorComponent.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/ErrorComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,64:1\n149#2:65\n149#2:66\n149#2:134\n149#2:139\n99#3,3:67\n102#3:98\n99#3:99\n97#3,5:100\n102#3:133\n106#3:138\n106#3:182\n79#4,6:70\n86#4,4:85\n90#4,2:95\n79#4,6:105\n86#4,4:120\n90#4,2:130\n94#4:137\n79#4,6:146\n86#4,4:161\n90#4,2:171\n94#4:177\n94#4:181\n368#5,9:76\n377#5:97\n368#5,9:111\n377#5:132\n378#5,2:135\n368#5,9:152\n377#5:173\n378#5,2:175\n378#5,2:179\n4034#6,6:89\n4034#6,6:124\n4034#6,6:165\n71#7:140\n69#7,5:141\n74#7:174\n78#7:178\n*S KotlinDebug\n*F\n+ 1 ErrorComponent.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/ErrorComponentKt\n*L\n27#1:65\n47#1:66\n53#1:134\n58#1:139\n43#1:67,3\n43#1:98\n52#1:99\n52#1:100,5\n52#1:133\n52#1:138\n43#1:182\n43#1:70,6\n43#1:85,4\n43#1:95,2\n52#1:105,6\n52#1:120,4\n52#1:130,2\n52#1:137\n58#1:146,6\n58#1:161,4\n58#1:171,2\n58#1:177\n43#1:181\n43#1:76,9\n43#1:97\n52#1:111,9\n52#1:132\n52#1:135,2\n58#1:152,9\n58#1:173\n58#1:175,2\n43#1:179,2\n43#1:89,6\n52#1:124,6\n58#1:165,6\n58#1:140\n58#1:141,5\n58#1:174\n58#1:178\n*E\n"})
public final class ErrorComponentKt {
  @Composable
  @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
  public static final void ErrorComponent(@Nullable Modifier modifier, @NotNull ErrorInfo errorInfo, @Nullable Composer $composer, int $changed, int paramInt1) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'errorInfo'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_2
    //   7: ldc 793432190
    //   9: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
    //   14: astore_2
    //   15: iload_3
    //   16: istore #5
    //   18: iload #4
    //   20: iconst_1
    //   21: iand
    //   22: ifeq -> 35
    //   25: iload #5
    //   27: bipush #6
    //   29: ior
    //   30: istore #5
    //   32: goto -> 62
    //   35: iload_3
    //   36: bipush #6
    //   38: iand
    //   39: ifne -> 62
    //   42: iload #5
    //   44: aload_2
    //   45: aload_0
    //   46: invokeinterface changed : (Ljava/lang/Object;)Z
    //   51: ifeq -> 58
    //   54: iconst_4
    //   55: goto -> 59
    //   58: iconst_2
    //   59: ior
    //   60: istore #5
    //   62: iload #4
    //   64: iconst_2
    //   65: iand
    //   66: ifeq -> 79
    //   69: iload #5
    //   71: bipush #48
    //   73: ior
    //   74: istore #5
    //   76: goto -> 108
    //   79: iload_3
    //   80: bipush #48
    //   82: iand
    //   83: ifne -> 108
    //   86: iload #5
    //   88: aload_2
    //   89: aload_1
    //   90: invokeinterface changed : (Ljava/lang/Object;)Z
    //   95: ifeq -> 103
    //   98: bipush #32
    //   100: goto -> 105
    //   103: bipush #16
    //   105: ior
    //   106: istore #5
    //   108: iload #5
    //   110: bipush #19
    //   112: iand
    //   113: bipush #18
    //   115: if_icmpne -> 127
    //   118: aload_2
    //   119: invokeinterface getSkipping : ()Z
    //   124: ifne -> 250
    //   127: iload #4
    //   129: iconst_1
    //   130: iand
    //   131: ifeq -> 141
    //   134: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   137: checkcast androidx/compose/ui/Modifier
    //   140: astore_0
    //   141: invokestatic isTraceInProgress : ()Z
    //   144: ifeq -> 157
    //   147: ldc 793432190
    //   149: iload #5
    //   151: iconst_m1
    //   152: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.ErrorComponent (ErrorComponent.kt:22)'
    //   154: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   157: aload_1
    //   158: invokevirtual component1 : ()Ljava/lang/String;
    //   161: astore #6
    //   163: aload_1
    //   164: invokevirtual component2 : ()Ljava/lang/String;
    //   167: astore #7
    //   169: aload_1
    //   170: invokevirtual component3 : ()Lkotlin/jvm/functions/Function0;
    //   173: astore #8
    //   175: aload_0
    //   176: iconst_1
    //   177: istore #9
    //   179: iconst_0
    //   180: istore #10
    //   182: iload #9
    //   184: i2f
    //   185: invokestatic constructor-impl : (F)F
    //   188: aload_2
    //   189: iconst_0
    //   190: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
    //   193: invokevirtual getErrorInfoBorder-0d7_KjU : ()J
    //   196: bipush #6
    //   198: istore #9
    //   200: iconst_0
    //   201: istore #10
    //   203: iload #9
    //   205: i2f
    //   206: invokestatic constructor-impl : (F)F
    //   209: invokestatic RoundedCornerShape-0680j_4 : (F)Landroidx/compose/foundation/shape/RoundedCornerShape;
    //   212: checkcast androidx/compose/ui/graphics/Shape
    //   215: invokestatic border-xT4_qwU : (Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
    //   218: aload #6
    //   220: aload #7
    //   222: aload #8
    //   224: aload_2
    //   225: iconst_0
    //   226: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
    //   229: invokevirtual getErrorInfoTextColor-0d7_KjU : ()J
    //   232: aload_2
    //   233: iconst_0
    //   234: iconst_0
    //   235: invokestatic ErrorBox-yrwZFoE : (Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;II)V
    //   238: invokestatic isTraceInProgress : ()Z
    //   241: ifeq -> 256
    //   244: invokestatic traceEventEnd : ()V
    //   247: goto -> 256
    //   250: aload_2
    //   251: invokeinterface skipToGroupEnd : ()V
    //   256: aload_2
    //   257: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   262: dup
    //   263: ifnull -> 284
    //   266: aload_0
    //   267: aload_1
    //   268: iload_3
    //   269: iload #4
    //   271: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo;II)Lkotlin/jvm/functions/Function2;
    //   276: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   281: goto -> 285
    //   284: pop
    //   285: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #23	-> 6
    //   #24	-> 157
    //   #26	-> 175
    //   #27	-> 176
    //   #65	-> 182
    //   #27	-> 190
    //   #65	-> 203
    //   #27	-> 209
    //   #28	-> 218
    //   #29	-> 220
    //   #30	-> 222
    //   #31	-> 226
    //   #25	-> 235
    //   #33	-> 250
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   182	6	10	$i$f$getDp	I
    //   179	9	9	$this$dp$iv	I
    //   203	6	10	$i$f$getDp	I
    //   200	9	9	$this$dp$iv	I
    //   163	84	6	description	Ljava/lang/String;
    //   169	78	7	actionName	Ljava/lang/String;
    //   175	72	8	action	Lkotlin/jvm/functions/Function0;
    //   18	268	5	$dirty	I
    //   0	286	0	modifier	Landroidx/compose/ui/Modifier;
    //   0	286	1	errorInfo	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo;
    //   0	286	2	$composer	Landroidx/compose/runtime/Composer;
    //   0	286	3	$changed	I
  }
  
  @Composable
  @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
  private static final void ErrorBox-yrwZFoE(Modifier modifier, String description, String actionName, Function0 action, long textColor, Composer $composer, int $changed, int paramInt1) {
    // Byte code:
    //   0: aload #6
    //   2: ldc 1909621481
    //   4: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
    //   9: astore #6
    //   11: iload #7
    //   13: istore #9
    //   15: iload #8
    //   17: iconst_1
    //   18: iand
    //   19: ifeq -> 32
    //   22: iload #9
    //   24: bipush #6
    //   26: ior
    //   27: istore #9
    //   29: goto -> 61
    //   32: iload #7
    //   34: bipush #6
    //   36: iand
    //   37: ifne -> 61
    //   40: iload #9
    //   42: aload #6
    //   44: aload_0
    //   45: invokeinterface changed : (Ljava/lang/Object;)Z
    //   50: ifeq -> 57
    //   53: iconst_4
    //   54: goto -> 58
    //   57: iconst_2
    //   58: ior
    //   59: istore #9
    //   61: iload #8
    //   63: iconst_2
    //   64: iand
    //   65: ifeq -> 78
    //   68: iload #9
    //   70: bipush #48
    //   72: ior
    //   73: istore #9
    //   75: goto -> 109
    //   78: iload #7
    //   80: bipush #48
    //   82: iand
    //   83: ifne -> 109
    //   86: iload #9
    //   88: aload #6
    //   90: aload_1
    //   91: invokeinterface changed : (Ljava/lang/Object;)Z
    //   96: ifeq -> 104
    //   99: bipush #32
    //   101: goto -> 106
    //   104: bipush #16
    //   106: ior
    //   107: istore #9
    //   109: iload #8
    //   111: iconst_4
    //   112: iand
    //   113: ifeq -> 127
    //   116: iload #9
    //   118: sipush #384
    //   121: ior
    //   122: istore #9
    //   124: goto -> 161
    //   127: iload #7
    //   129: sipush #384
    //   132: iand
    //   133: ifne -> 161
    //   136: iload #9
    //   138: aload #6
    //   140: aload_2
    //   141: invokeinterface changed : (Ljava/lang/Object;)Z
    //   146: ifeq -> 155
    //   149: sipush #256
    //   152: goto -> 158
    //   155: sipush #128
    //   158: ior
    //   159: istore #9
    //   161: iload #8
    //   163: bipush #8
    //   165: iand
    //   166: ifeq -> 180
    //   169: iload #9
    //   171: sipush #3072
    //   174: ior
    //   175: istore #9
    //   177: goto -> 214
    //   180: iload #7
    //   182: sipush #3072
    //   185: iand
    //   186: ifne -> 214
    //   189: iload #9
    //   191: aload #6
    //   193: aload_3
    //   194: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   199: ifeq -> 208
    //   202: sipush #2048
    //   205: goto -> 211
    //   208: sipush #1024
    //   211: ior
    //   212: istore #9
    //   214: iload #8
    //   216: bipush #16
    //   218: iand
    //   219: ifeq -> 233
    //   222: iload #9
    //   224: sipush #24576
    //   227: ior
    //   228: istore #9
    //   230: goto -> 268
    //   233: iload #7
    //   235: sipush #24576
    //   238: iand
    //   239: ifne -> 268
    //   242: iload #9
    //   244: aload #6
    //   246: lload #4
    //   248: invokeinterface changed : (J)Z
    //   253: ifeq -> 262
    //   256: sipush #16384
    //   259: goto -> 265
    //   262: sipush #8192
    //   265: ior
    //   266: istore #9
    //   268: iload #9
    //   270: sipush #9363
    //   273: iand
    //   274: sipush #9362
    //   277: if_icmpne -> 290
    //   280: aload #6
    //   282: invokeinterface getSkipping : ()Z
    //   287: ifne -> 1856
    //   290: iload #8
    //   292: iconst_1
    //   293: iand
    //   294: ifeq -> 304
    //   297: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   300: checkcast androidx/compose/ui/Modifier
    //   303: astore_0
    //   304: iload #8
    //   306: bipush #16
    //   308: iand
    //   309: ifeq -> 320
    //   312: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
    //   315: invokevirtual getUnspecified-0d7_KjU : ()J
    //   318: lstore #4
    //   320: invokestatic isTraceInProgress : ()Z
    //   323: ifeq -> 336
    //   326: ldc 1909621481
    //   328: iload #9
    //   330: iconst_m1
    //   331: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.ErrorBox (ErrorComponent.kt:41)'
    //   333: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   336: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   339: checkcast androidx/compose/ui/Modifier
    //   342: fconst_0
    //   343: iconst_1
    //   344: aconst_null
    //   345: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   348: aload_0
    //   349: invokeinterface then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   354: astore #10
    //   356: bipush #10
    //   358: istore #12
    //   360: iconst_0
    //   361: istore #13
    //   363: iload #12
    //   365: i2f
    //   366: invokestatic constructor-impl : (F)F
    //   369: fstore #11
    //   371: bipush #10
    //   373: istore #13
    //   375: iconst_0
    //   376: istore #14
    //   378: iload #13
    //   380: i2f
    //   381: invokestatic constructor-impl : (F)F
    //   384: fstore #12
    //   386: bipush #12
    //   388: istore #14
    //   390: iconst_0
    //   391: istore #15
    //   393: iload #14
    //   395: i2f
    //   396: invokestatic constructor-impl : (F)F
    //   399: fstore #13
    //   401: bipush #12
    //   403: istore #15
    //   405: iconst_0
    //   406: istore #16
    //   408: iload #15
    //   410: i2f
    //   411: invokestatic constructor-impl : (F)F
    //   414: fstore #14
    //   416: aload #10
    //   418: fload #13
    //   420: fload #11
    //   422: fload #14
    //   424: fload #12
    //   426: invokestatic padding-qDBjuR0 : (Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;
    //   429: astore #10
    //   431: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
    //   434: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    //   437: astore #11
    //   439: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   442: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
    //   445: astore #12
    //   447: sipush #432
    //   450: istore #13
    //   452: nop
    //   453: iconst_0
    //   454: istore #14
    //   456: aload #6
    //   458: ldc 693286680
    //   460: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
    //   462: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   465: aload #11
    //   467: aload #12
    //   469: aload #6
    //   471: bipush #14
    //   473: iload #13
    //   475: iconst_3
    //   476: ishr
    //   477: iand
    //   478: bipush #112
    //   480: iload #13
    //   482: iconst_3
    //   483: ishr
    //   484: iand
    //   485: ior
    //   486: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    //   489: astore #15
    //   491: bipush #112
    //   493: iload #13
    //   495: iconst_3
    //   496: ishl
    //   497: iand
    //   498: istore #16
    //   500: nop
    //   501: iconst_0
    //   502: istore #17
    //   504: aload #6
    //   506: ldc -1323940314
    //   508: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   510: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   513: aload #6
    //   515: iconst_0
    //   516: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   519: istore #18
    //   521: aload #6
    //   523: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   528: astore #19
    //   530: aload #6
    //   532: aload #10
    //   534: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   537: astore #20
    //   539: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   542: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   545: astore #21
    //   547: bipush #6
    //   549: sipush #896
    //   552: iload #16
    //   554: bipush #6
    //   556: ishl
    //   557: iand
    //   558: ior
    //   559: istore #22
    //   561: nop
    //   562: iconst_0
    //   563: istore #23
    //   565: aload #6
    //   567: ldc_w -692256719
    //   570: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   573: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   576: aload #6
    //   578: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   583: instanceof androidx/compose/runtime/Applier
    //   586: ifne -> 592
    //   589: invokestatic invalidApplier : ()V
    //   592: aload #6
    //   594: invokeinterface startReusableNode : ()V
    //   599: aload #6
    //   601: invokeinterface getInserting : ()Z
    //   606: ifeq -> 621
    //   609: aload #6
    //   611: aload #21
    //   613: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   618: goto -> 628
    //   621: aload #6
    //   623: invokeinterface useNode : ()V
    //   628: aload #6
    //   630: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   633: astore #24
    //   635: iconst_0
    //   636: istore #25
    //   638: aload #24
    //   640: aload #15
    //   642: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   645: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   648: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   651: aload #24
    //   653: aload #19
    //   655: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   658: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   661: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   664: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   667: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   670: astore #26
    //   672: iconst_0
    //   673: istore #27
    //   675: aload #24
    //   677: astore #28
    //   679: iconst_0
    //   680: istore #29
    //   682: aload #28
    //   684: invokeinterface getInserting : ()Z
    //   689: ifne -> 710
    //   692: aload #28
    //   694: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   699: iload #18
    //   701: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   704: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   707: ifne -> 736
    //   710: aload #28
    //   712: iload #18
    //   714: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   717: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   722: aload #24
    //   724: iload #18
    //   726: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   729: aload #26
    //   731: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   736: nop
    //   737: nop
    //   738: nop
    //   739: aload #24
    //   741: aload #20
    //   743: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   746: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   749: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   752: nop
    //   753: nop
    //   754: aload #6
    //   756: bipush #14
    //   758: iload #22
    //   760: bipush #6
    //   762: ishr
    //   763: iand
    //   764: istore #30
    //   766: astore #31
    //   768: iconst_0
    //   769: istore #32
    //   771: aload #31
    //   773: ldc_w -407840262
    //   776: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
    //   779: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   782: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
    //   785: aload #31
    //   787: bipush #6
    //   789: bipush #112
    //   791: iload #13
    //   793: bipush #6
    //   795: ishr
    //   796: iand
    //   797: ior
    //   798: istore #33
    //   800: astore #34
    //   802: checkcast androidx/compose/foundation/layout/RowScope
    //   805: astore #35
    //   807: iconst_0
    //   808: istore #36
    //   810: aload #35
    //   812: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   815: checkcast androidx/compose/ui/Modifier
    //   818: fconst_1
    //   819: iconst_0
    //   820: iconst_2
    //   821: aconst_null
    //   822: invokestatic weight$default : (Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   825: astore #37
    //   827: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
    //   830: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    //   833: astore #38
    //   835: bipush #48
    //   837: istore #39
    //   839: iconst_0
    //   840: istore #40
    //   842: aload #34
    //   844: ldc 693286680
    //   846: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
    //   848: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   851: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   854: invokevirtual getTop : ()Landroidx/compose/ui/Alignment$Vertical;
    //   857: astore #41
    //   859: aload #38
    //   861: aload #41
    //   863: aload #34
    //   865: bipush #14
    //   867: iload #39
    //   869: iconst_3
    //   870: ishr
    //   871: iand
    //   872: bipush #112
    //   874: iload #39
    //   876: iconst_3
    //   877: ishr
    //   878: iand
    //   879: ior
    //   880: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    //   883: astore #42
    //   885: bipush #112
    //   887: iload #39
    //   889: iconst_3
    //   890: ishl
    //   891: iand
    //   892: istore #43
    //   894: nop
    //   895: iconst_0
    //   896: istore #44
    //   898: aload #34
    //   900: ldc -1323940314
    //   902: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   904: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   907: aload #34
    //   909: iconst_0
    //   910: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   913: istore #45
    //   915: aload #34
    //   917: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   922: astore #46
    //   924: aload #34
    //   926: aload #37
    //   928: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   931: astore #47
    //   933: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   936: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   939: astore #48
    //   941: bipush #6
    //   943: sipush #896
    //   946: iload #43
    //   948: bipush #6
    //   950: ishl
    //   951: iand
    //   952: ior
    //   953: istore #49
    //   955: nop
    //   956: iconst_0
    //   957: istore #50
    //   959: aload #34
    //   961: ldc_w -692256719
    //   964: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   967: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   970: aload #34
    //   972: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   977: instanceof androidx/compose/runtime/Applier
    //   980: ifne -> 986
    //   983: invokestatic invalidApplier : ()V
    //   986: aload #34
    //   988: invokeinterface startReusableNode : ()V
    //   993: aload #34
    //   995: invokeinterface getInserting : ()Z
    //   1000: ifeq -> 1015
    //   1003: aload #34
    //   1005: aload #48
    //   1007: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   1012: goto -> 1022
    //   1015: aload #34
    //   1017: invokeinterface useNode : ()V
    //   1022: aload #34
    //   1024: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   1027: astore #51
    //   1029: iconst_0
    //   1030: istore #52
    //   1032: aload #51
    //   1034: aload #42
    //   1036: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1039: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   1042: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1045: aload #51
    //   1047: aload #46
    //   1049: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1052: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   1055: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1058: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1061: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   1064: astore #53
    //   1066: iconst_0
    //   1067: istore #54
    //   1069: aload #51
    //   1071: astore #55
    //   1073: iconst_0
    //   1074: istore #56
    //   1076: aload #55
    //   1078: invokeinterface getInserting : ()Z
    //   1083: ifne -> 1104
    //   1086: aload #55
    //   1088: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   1093: iload #45
    //   1095: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1098: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1101: ifne -> 1130
    //   1104: aload #55
    //   1106: iload #45
    //   1108: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1111: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   1116: aload #51
    //   1118: iload #45
    //   1120: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1123: aload #53
    //   1125: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1130: nop
    //   1131: nop
    //   1132: nop
    //   1133: aload #51
    //   1135: aload #47
    //   1137: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1140: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   1143: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1146: nop
    //   1147: nop
    //   1148: aload #34
    //   1150: bipush #14
    //   1152: iload #49
    //   1154: bipush #6
    //   1156: ishr
    //   1157: iand
    //   1158: istore #57
    //   1160: astore #58
    //   1162: iconst_0
    //   1163: istore #59
    //   1165: aload #58
    //   1167: ldc_w -407840262
    //   1170: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
    //   1173: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1176: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
    //   1179: aload #58
    //   1181: bipush #6
    //   1183: bipush #112
    //   1185: iload #39
    //   1187: bipush #6
    //   1189: ishr
    //   1190: iand
    //   1191: ior
    //   1192: istore #60
    //   1194: astore #61
    //   1196: checkcast androidx/compose/foundation/layout/RowScope
    //   1199: astore #62
    //   1201: iconst_0
    //   1202: istore #63
    //   1204: getstatic org/jetbrains/jewel/ui/icons/AllIconsKeys$General.INSTANCE : Lorg/jetbrains/jewel/ui/icons/AllIconsKeys$General;
    //   1207: invokevirtual getError : ()Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;
    //   1210: checkcast org/jetbrains/jewel/ui/icon/IconKey
    //   1213: ldc_w 'Error'
    //   1216: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   1219: checkcast androidx/compose/ui/Modifier
    //   1222: fconst_0
    //   1223: fconst_0
    //   1224: bipush #8
    //   1226: istore #64
    //   1228: iconst_0
    //   1229: istore #65
    //   1231: iload #64
    //   1233: i2f
    //   1234: invokestatic constructor-impl : (F)F
    //   1237: fconst_0
    //   1238: bipush #11
    //   1240: aconst_null
    //   1241: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   1244: aconst_null
    //   1245: lconst_0
    //   1246: iconst_0
    //   1247: anewarray org/jetbrains/jewel/ui/painter/PainterHint
    //   1250: aload #61
    //   1252: sipush #432
    //   1255: getstatic org/jetbrains/jewel/ui/icon/IntelliJIconKey.$stable : I
    //   1258: ior
    //   1259: bipush #24
    //   1261: invokestatic Icon-FHprtrg : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V
    //   1264: aload_1
    //   1265: aconst_null
    //   1266: lload #4
    //   1268: lconst_0
    //   1269: aconst_null
    //   1270: aconst_null
    //   1271: aconst_null
    //   1272: lconst_0
    //   1273: aconst_null
    //   1274: iconst_0
    //   1275: lconst_0
    //   1276: iconst_0
    //   1277: iconst_0
    //   1278: iconst_0
    //   1279: aconst_null
    //   1280: aconst_null
    //   1281: aload #61
    //   1283: bipush #14
    //   1285: iload #9
    //   1287: iconst_3
    //   1288: ishr
    //   1289: iand
    //   1290: sipush #896
    //   1293: iload #9
    //   1295: bipush #6
    //   1297: ishr
    //   1298: iand
    //   1299: ior
    //   1300: iconst_0
    //   1301: ldc_w 65530
    //   1304: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
    //   1307: nop
    //   1308: aload #58
    //   1310: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1313: aload #34
    //   1315: invokeinterface endNode : ()V
    //   1320: aload #34
    //   1322: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1325: nop
    //   1326: aload #34
    //   1328: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1331: nop
    //   1332: aload #34
    //   1334: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1337: nop
    //   1338: aload #34
    //   1340: ldc_w -1315479670
    //   1343: invokeinterface startReplaceGroup : (I)V
    //   1348: aload_2
    //   1349: ifnull -> 1806
    //   1352: aload_3
    //   1353: ifnull -> 1806
    //   1356: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   1359: checkcast androidx/compose/ui/Modifier
    //   1362: iconst_2
    //   1363: istore #37
    //   1365: iconst_0
    //   1366: istore #38
    //   1368: iload #37
    //   1370: i2f
    //   1371: invokestatic constructor-impl : (F)F
    //   1374: fconst_0
    //   1375: fconst_0
    //   1376: fconst_0
    //   1377: bipush #14
    //   1379: aconst_null
    //   1380: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   1383: astore #37
    //   1385: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   1388: invokevirtual getCenterEnd : ()Landroidx/compose/ui/Alignment;
    //   1391: astore #38
    //   1393: bipush #54
    //   1395: istore #39
    //   1397: iconst_0
    //   1398: istore #40
    //   1400: aload #34
    //   1402: ldc_w 733328855
    //   1405: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
    //   1408: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1411: iconst_0
    //   1412: istore #41
    //   1414: aload #38
    //   1416: iload #41
    //   1418: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
    //   1421: astore #42
    //   1423: bipush #112
    //   1425: iload #39
    //   1427: iconst_3
    //   1428: ishl
    //   1429: iand
    //   1430: istore #43
    //   1432: nop
    //   1433: iconst_0
    //   1434: istore #44
    //   1436: aload #34
    //   1438: ldc -1323940314
    //   1440: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   1442: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1445: aload #34
    //   1447: iconst_0
    //   1448: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   1451: istore #45
    //   1453: aload #34
    //   1455: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   1460: astore #46
    //   1462: aload #34
    //   1464: aload #37
    //   1466: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   1469: astore #47
    //   1471: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1474: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   1477: astore #48
    //   1479: bipush #6
    //   1481: sipush #896
    //   1484: iload #43
    //   1486: bipush #6
    //   1488: ishl
    //   1489: iand
    //   1490: ior
    //   1491: istore #49
    //   1493: nop
    //   1494: iconst_0
    //   1495: istore #50
    //   1497: aload #34
    //   1499: ldc_w -692256719
    //   1502: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   1505: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1508: aload #34
    //   1510: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   1515: instanceof androidx/compose/runtime/Applier
    //   1518: ifne -> 1524
    //   1521: invokestatic invalidApplier : ()V
    //   1524: aload #34
    //   1526: invokeinterface startReusableNode : ()V
    //   1531: aload #34
    //   1533: invokeinterface getInserting : ()Z
    //   1538: ifeq -> 1553
    //   1541: aload #34
    //   1543: aload #48
    //   1545: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   1550: goto -> 1560
    //   1553: aload #34
    //   1555: invokeinterface useNode : ()V
    //   1560: aload #34
    //   1562: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   1565: astore #51
    //   1567: iconst_0
    //   1568: istore #52
    //   1570: aload #51
    //   1572: aload #42
    //   1574: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1577: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   1580: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1583: aload #51
    //   1585: aload #46
    //   1587: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1590: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   1593: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1596: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1599: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   1602: astore #53
    //   1604: iconst_0
    //   1605: istore #54
    //   1607: aload #51
    //   1609: astore #55
    //   1611: iconst_0
    //   1612: istore #56
    //   1614: aload #55
    //   1616: invokeinterface getInserting : ()Z
    //   1621: ifne -> 1642
    //   1624: aload #55
    //   1626: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   1631: iload #45
    //   1633: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1636: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1639: ifne -> 1668
    //   1642: aload #55
    //   1644: iload #45
    //   1646: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1649: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   1654: aload #51
    //   1656: iload #45
    //   1658: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1661: aload #53
    //   1663: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1668: nop
    //   1669: nop
    //   1670: nop
    //   1671: aload #51
    //   1673: aload #47
    //   1675: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1678: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   1681: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1684: nop
    //   1685: nop
    //   1686: aload #34
    //   1688: bipush #14
    //   1690: iload #49
    //   1692: bipush #6
    //   1694: ishr
    //   1695: iand
    //   1696: istore #57
    //   1698: astore #58
    //   1700: iconst_0
    //   1701: istore #59
    //   1703: aload #58
    //   1705: ldc_w -2146769399
    //   1708: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
    //   1711: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1714: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
    //   1717: aload #58
    //   1719: bipush #6
    //   1721: bipush #112
    //   1723: iload #39
    //   1725: bipush #6
    //   1727: ishr
    //   1728: iand
    //   1729: ior
    //   1730: istore #60
    //   1732: astore #61
    //   1734: checkcast androidx/compose/foundation/layout/BoxScope
    //   1737: astore #62
    //   1739: iconst_0
    //   1740: istore #63
    //   1742: aload_2
    //   1743: aload_3
    //   1744: aconst_null
    //   1745: iconst_0
    //   1746: aconst_null
    //   1747: iconst_0
    //   1748: aconst_null
    //   1749: aconst_null
    //   1750: aload #61
    //   1752: bipush #14
    //   1754: iload #9
    //   1756: bipush #6
    //   1758: ishr
    //   1759: iand
    //   1760: bipush #112
    //   1762: iload #9
    //   1764: bipush #6
    //   1766: ishr
    //   1767: iand
    //   1768: ior
    //   1769: sipush #252
    //   1772: invokestatic Link-kye4rC8 : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/runtime/Composer;II)V
    //   1775: nop
    //   1776: aload #58
    //   1778: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1781: aload #34
    //   1783: invokeinterface endNode : ()V
    //   1788: aload #34
    //   1790: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1793: nop
    //   1794: aload #34
    //   1796: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1799: nop
    //   1800: aload #34
    //   1802: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1805: nop
    //   1806: aload #34
    //   1808: invokeinterface endReplaceGroup : ()V
    //   1813: nop
    //   1814: aload #31
    //   1816: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1819: aload #6
    //   1821: invokeinterface endNode : ()V
    //   1826: aload #6
    //   1828: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1831: nop
    //   1832: aload #6
    //   1834: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1837: nop
    //   1838: aload #6
    //   1840: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1843: nop
    //   1844: invokestatic isTraceInProgress : ()Z
    //   1847: ifeq -> 1863
    //   1850: invokestatic traceEventEnd : ()V
    //   1853: goto -> 1863
    //   1856: aload #6
    //   1858: invokeinterface skipToGroupEnd : ()V
    //   1863: aload #6
    //   1865: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   1870: dup
    //   1871: ifnull -> 1897
    //   1874: aload_0
    //   1875: aload_1
    //   1876: aload_2
    //   1877: aload_3
    //   1878: lload #4
    //   1880: iload #7
    //   1882: iload #8
    //   1884: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;JII)Lkotlin/jvm/functions/Function2;
    //   1889: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   1894: goto -> 1898
    //   1897: pop
    //   1898: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #42	-> 0
    //   #38	-> 297
    //   #41	-> 312
    //   #42	-> 333
    //   #44	-> 336
    //   #45	-> 342
    //   #46	-> 348
    //   #47	-> 356
    //   #66	-> 363
    //   #47	-> 369
    //   #66	-> 378
    //   #47	-> 384
    //   #66	-> 393
    //   #47	-> 399
    //   #66	-> 408
    //   #47	-> 414
    //   #46	-> 416
    //   #47	-> 418
    //   #48	-> 431
    //   #49	-> 439
    //   #43	-> 452
    //   #67	-> 462
    //   #68	-> 465
    //   #69	-> 500
    //   #70	-> 510
    //   #71	-> 516
    //   #72	-> 523
    //   #73	-> 532
    //   #75	-> 539
    //   #74	-> 561
    //   #76	-> 573
    //   #77	-> 576
    //   #78	-> 594
    //   #79	-> 599
    //   #80	-> 611
    //   #82	-> 623
    //   #84	-> 628
    //   #85	-> 638
    //   #86	-> 651
    //   #88	-> 664
    //   #89	-> 675
    //   #90	-> 682
    //   #91	-> 710
    //   #92	-> 722
    //   #94	-> 736
    //   #89	-> 737
    //   #94	-> 738
    //   #95	-> 739
    //   #96	-> 752
    //   #84	-> 753
    //   #97	-> 754
    //   #98	-> 779
    //   #52	-> 810
    //   #99	-> 848
    //   #100	-> 851
    //   #103	-> 859
    //   #104	-> 894
    //   #105	-> 904
    //   #106	-> 910
    //   #107	-> 917
    //   #108	-> 926
    //   #110	-> 933
    //   #109	-> 955
    //   #111	-> 967
    //   #112	-> 970
    //   #113	-> 988
    //   #114	-> 993
    //   #115	-> 1005
    //   #117	-> 1017
    //   #119	-> 1022
    //   #120	-> 1032
    //   #121	-> 1045
    //   #123	-> 1058
    //   #124	-> 1069
    //   #125	-> 1076
    //   #126	-> 1104
    //   #127	-> 1116
    //   #129	-> 1130
    //   #124	-> 1131
    //   #129	-> 1132
    //   #130	-> 1133
    //   #131	-> 1146
    //   #119	-> 1147
    //   #132	-> 1148
    //   #133	-> 1173
    //   #53	-> 1204
    //   #134	-> 1231
    //   #53	-> 1237
    //   #54	-> 1264
    //   #55	-> 1307
    //   #133	-> 1308
    //   #132	-> 1313
    //   #135	-> 1315
    //   #111	-> 1322
    //   #136	-> 1325
    //   #105	-> 1328
    //   #137	-> 1331
    //   #99	-> 1334
    //   #138	-> 1337
    //   #57	-> 1348
    //   #58	-> 1356
    //   #139	-> 1368
    //   #58	-> 1374
    //   #140	-> 1408
    //   #141	-> 1411
    //   #144	-> 1414
    //   #145	-> 1432
    //   #146	-> 1442
    //   #147	-> 1448
    //   #148	-> 1455
    //   #149	-> 1464
    //   #151	-> 1471
    //   #150	-> 1493
    //   #152	-> 1505
    //   #153	-> 1508
    //   #154	-> 1526
    //   #155	-> 1531
    //   #156	-> 1543
    //   #158	-> 1555
    //   #160	-> 1560
    //   #161	-> 1570
    //   #162	-> 1583
    //   #164	-> 1596
    //   #165	-> 1607
    //   #166	-> 1614
    //   #167	-> 1642
    //   #168	-> 1654
    //   #170	-> 1668
    //   #165	-> 1669
    //   #170	-> 1670
    //   #171	-> 1671
    //   #172	-> 1684
    //   #160	-> 1685
    //   #173	-> 1686
    //   #174	-> 1711
    //   #59	-> 1742
    //   #60	-> 1775
    //   #174	-> 1776
    //   #173	-> 1781
    //   #175	-> 1783
    //   #152	-> 1790
    //   #176	-> 1793
    //   #146	-> 1796
    //   #177	-> 1799
    //   #140	-> 1802
    //   #178	-> 1805
    //   #62	-> 1813
    //   #98	-> 1814
    //   #97	-> 1819
    //   #179	-> 1821
    //   #76	-> 1828
    //   #180	-> 1831
    //   #70	-> 1834
    //   #181	-> 1837
    //   #67	-> 1840
    //   #182	-> 1843
    //   #63	-> 1856
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   363	6	13	$i$f$getDp	I
    //   360	9	12	$this$dp$iv	I
    //   378	6	14	$i$f$getDp	I
    //   375	9	13	$this$dp$iv	I
    //   393	6	15	$i$f$getDp	I
    //   390	9	14	$this$dp$iv	I
    //   408	6	16	$i$f$getDp	I
    //   405	9	15	$this$dp$iv	I
    //   1231	6	65	$i$f$getDp	I
    //   1228	9	64	$this$dp$iv	I
    //   1204	104	63	$i$a$-Row-ErrorComponentKt$ErrorBox$1$1	I
    //   1201	107	62	$this$ErrorBox_yrwZFoE_u24lambda_u243_u24lambda_u241	Landroidx/compose/foundation/layout/RowScope;
    //   1201	107	61	$composer	Landroidx/compose/runtime/Composer;
    //   1201	107	60	$changed	I
    //   1165	148	59	$i$a$-Layout-RowKt$Row$1$iv	I
    //   1162	151	58	$composer$iv	Landroidx/compose/runtime/Composer;
    //   1162	151	57	$changed$iv	I
    //   1076	55	56	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   1073	58	55	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   1069	64	54	$i$f$set-impl	I
    //   1066	67	53	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   1032	115	52	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   1029	118	51	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   959	367	50	$i$f$ReusableComposeNode	I
    //   956	370	48	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   956	370	49	$changed$iv$iv$iv	I
    //   898	434	44	$i$f$Layout	I
    //   915	417	45	compositeKeyHash$iv$iv	I
    //   924	408	46	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   933	399	47	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   895	437	43	$changed$iv$iv	I
    //   842	496	40	$i$f$Row	I
    //   885	453	42	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   839	499	37	modifier$iv	Landroidx/compose/ui/Modifier;
    //   839	499	38	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    //   859	479	41	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
    //   839	499	39	$changed$iv	I
    //   1368	6	38	$i$f$getDp	I
    //   1365	9	37	$this$dp$iv	I
    //   1742	34	63	$i$a$-Box-ErrorComponentKt$ErrorBox$1$2	I
    //   1739	37	62	$this$ErrorBox_yrwZFoE_u24lambda_u243_u24lambda_u242	Landroidx/compose/foundation/layout/BoxScope;
    //   1739	37	61	$composer	Landroidx/compose/runtime/Composer;
    //   1739	37	60	$changed	I
    //   1703	78	59	$i$a$-Layout-BoxKt$Box$1$iv	I
    //   1700	81	58	$composer$iv	Landroidx/compose/runtime/Composer;
    //   1700	81	57	$changed$iv	I
    //   1614	55	56	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   1611	58	55	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   1607	64	54	$i$f$set-impl	I
    //   1604	67	53	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   1570	115	52	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   1567	118	51	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   1497	297	50	$i$f$ReusableComposeNode	I
    //   1494	300	48	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   1494	300	49	$changed$iv$iv$iv	I
    //   1436	364	44	$i$f$Layout	I
    //   1453	347	45	compositeKeyHash$iv$iv	I
    //   1462	338	46	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   1471	329	47	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   1433	367	43	$changed$iv$iv	I
    //   1400	406	40	$i$f$Box	I
    //   1423	383	42	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   1397	409	37	modifier$iv	Landroidx/compose/ui/Modifier;
    //   1397	409	38	contentAlignment$iv	Landroidx/compose/ui/Alignment;
    //   1414	392	41	propagateMinConstraints$iv	Z
    //   1397	409	39	$changed$iv	I
    //   810	1004	36	$i$a$-Row-ErrorComponentKt$ErrorBox$1	I
    //   807	1007	35	$this$ErrorBox_yrwZFoE_u24lambda_u243	Landroidx/compose/foundation/layout/RowScope;
    //   807	1007	34	$composer	Landroidx/compose/runtime/Composer;
    //   807	1007	33	$changed	I
    //   771	1048	32	$i$a$-Layout-RowKt$Row$1$iv	I
    //   768	1051	31	$composer$iv	Landroidx/compose/runtime/Composer;
    //   768	1051	30	$changed$iv	I
    //   682	55	29	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   679	58	28	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   675	64	27	$i$f$set-impl	I
    //   672	67	26	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   638	115	25	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   635	118	24	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   565	1267	23	$i$f$ReusableComposeNode	I
    //   562	1270	21	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   562	1270	22	$changed$iv$iv$iv	I
    //   504	1334	17	$i$f$Layout	I
    //   521	1317	18	compositeKeyHash$iv$iv	I
    //   530	1308	19	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   539	1299	20	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   501	1337	16	$changed$iv$iv	I
    //   456	1388	14	$i$f$Row	I
    //   491	1353	15	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   453	1391	10	modifier$iv	Landroidx/compose/ui/Modifier;
    //   453	1391	11	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    //   453	1391	12	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
    //   453	1391	13	$changed$iv	I
    //   15	1884	9	$dirty	I
    //   0	1899	0	modifier	Landroidx/compose/ui/Modifier;
    //   0	1899	1	description	Ljava/lang/String;
    //   0	1899	2	actionName	Ljava/lang/String;
    //   0	1899	3	action	Lkotlin/jvm/functions/Function0;
    //   0	1899	4	textColor	J
    //   0	1899	6	$composer	Landroidx/compose/runtime/Composer;
    //   0	1899	7	$changed	I
  }
  
  private static final Unit ErrorComponent$lambda$0(Modifier $modifier, ErrorInfo $errorInfo, int $$changed, int $$default, Composer $composer, int $force) {
    ErrorComponent($modifier, $errorInfo, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
    return Unit.INSTANCE;
  }
  
  private static final Unit ErrorBox_yrwZFoE$lambda$4(Modifier $modifier, String $description, String $actionName, Function0<Unit> $action, long $textColor, int $$changed, int $$default, Composer $composer, int $force) {
    ErrorBox-yrwZFoE($modifier, $description, $actionName, $action, $textColor, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
    return Unit.INSTANCE;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\ErrorComponentKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */