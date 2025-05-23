/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain;
/*     */ 
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.layout.ColumnScope;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskRecapModel;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskStep;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.PromptMode;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function4;
/*     */ import kotlin.jvm.internal.FunctionReferenceImpl;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.component.IconButtonState;
/*     */ import org.jetbrains.jewel.ui.component.TextKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\0008\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020$\n\002\020\b\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\003\032Q\020\000\032\0020\001*\0020\0022\022\020\003\032\016\022\004\022\0020\005\022\004\022\0020\0060\0042\022\020\007\032\016\022\004\022\0020\005\022\004\022\0020\0010\b2\006\020\t\032\0020\0052\006\020\n\032\0020\0132\006\020\f\032\0020\rH\007¢\006\002\020\016\032\030\020\017\032\0020\0132\006\020\003\032\0020\0062\006\020\f\032\0020\rH\002\032+\020\020\032\0020\0012\006\020\021\032\0020\0052\006\020\022\032\0020\0132\f\020\023\032\b\022\004\022\0020\0010\024H\007¢\006\002\020\025¨\006\026²\006\n\020\027\032\0020\013X\002"}, d2 = {"TaskRecap", "", "Landroidx/compose/foundation/layout/ColumnScope;", "recap", "", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskRecapModel;", "onTaskSelectionChange", "Lkotlin/Function1;", "selectedTaskIndex", "isChainRunning", "", "promptMode", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;", "(Landroidx/compose/foundation/layout/ColumnScope;Ljava/util/Map;Lkotlin/jvm/functions/Function1;IZLcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;Landroidx/compose/runtime/Composer;I)V", "shouldShowPlanning", "PlanIndexButton", "taskIndex", "selected", "onTaskSelect", "Lkotlin/Function0;", "(IZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ej-ui", "isMouseHovering"})
/*     */ @SourceDebugExtension({"SMAP\nChainRecap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainRecap.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/ChainRecapKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,132:1\n1225#2,6:133\n1225#2,6:139\n1225#2,6:218\n1225#2,6:417\n149#3:145\n149#3:181\n149#3:229\n149#3:267\n149#3:342\n149#3:384\n149#3:427\n149#3:444\n99#4:146\n97#4,5:147\n102#4:180\n99#4,3:385\n102#4:416\n106#4:426\n106#4:443\n79#5,6:152\n86#5,4:167\n90#5,2:177\n79#5,6:188\n86#5,4:203\n90#5,2:213\n94#5:227\n79#5,6:238\n86#5,4:253\n90#5,2:263\n79#5,6:276\n86#5,4:291\n90#5,2:301\n79#5,6:313\n86#5,4:328\n90#5,2:338\n94#5:345\n79#5,6:355\n86#5,4:370\n90#5,2:380\n79#5,6:388\n86#5,4:403\n90#5,2:413\n94#5:425\n94#5:430\n94#5:434\n94#5:438\n94#5:442\n368#6,9:158\n377#6:179\n368#6,9:194\n377#6:215\n378#6,2:225\n368#6,9:244\n377#6:265\n368#6,9:282\n377#6:303\n368#6,9:319\n377#6:340\n378#6,2:343\n368#6,9:361\n377#6:382\n368#6,9:394\n377#6:415\n378#6,2:423\n378#6,2:428\n378#6,2:432\n378#6,2:436\n378#6,2:440\n4034#7,6:171\n4034#7,6:207\n4034#7,6:257\n4034#7,6:295\n4034#7,6:332\n4034#7,6:374\n4034#7,6:407\n86#8:182\n84#8,5:183\n89#8:216\n93#8:228\n86#8:230\n82#8,7:231\n89#8:266\n86#8:268\n82#8,7:269\n89#8:304\n86#8:305\n82#8,7:306\n89#8:341\n93#8:346\n86#8:347\n82#8,7:348\n89#8:383\n93#8:431\n93#8:435\n93#8:439\n1863#9:217\n1864#9:224\n81#10:445\n107#10,2:446\n*S KotlinDebug\n*F\n+ 1 ChainRecap.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/ChainRecapKt\n*L\n46#1:133,6\n49#1:139,6\n56#1:218,6\n91#1:417,6\n50#1:145\n52#1:181\n62#1:229\n70#1:267\n76#1:342\n84#1:384\n95#1:427\n122#1:444\n48#1:146\n48#1:147,5\n48#1:180\n80#1:385,3\n80#1:416\n80#1:426\n48#1:443\n48#1:152,6\n48#1:167,4\n48#1:177,2\n52#1:188,6\n52#1:203,4\n52#1:213,2\n52#1:227\n62#1:238,6\n62#1:253,4\n62#1:263,2\n69#1:276,6\n69#1:291,4\n69#1:301,2\n74#1:313,6\n74#1:328,4\n74#1:338,2\n74#1:345\n79#1:355,6\n79#1:370,4\n79#1:380,2\n80#1:388,6\n80#1:403,4\n80#1:413,2\n80#1:425\n79#1:430\n69#1:434\n62#1:438\n48#1:442\n48#1:158,9\n48#1:179\n52#1:194,9\n52#1:215\n52#1:225,2\n62#1:244,9\n62#1:265\n69#1:282,9\n69#1:303\n74#1:319,9\n74#1:340\n74#1:343,2\n79#1:361,9\n79#1:382\n80#1:394,9\n80#1:415\n80#1:423,2\n79#1:428,2\n69#1:432,2\n62#1:436,2\n48#1:440,2\n48#1:171,6\n52#1:207,6\n62#1:257,6\n69#1:295,6\n74#1:332,6\n79#1:374,6\n80#1:407,6\n52#1:182\n52#1:183,5\n52#1:216\n52#1:228\n62#1:230\n62#1:231,7\n62#1:266\n69#1:268\n69#1:269,7\n69#1:304\n74#1:305\n74#1:306,7\n74#1:341\n74#1:346\n79#1:347\n79#1:348,7\n79#1:383\n79#1:431\n69#1:435\n62#1:439\n55#1:217\n55#1:224\n46#1:445\n46#1:446,2\n*E\n"})
/*     */ public final class ChainRecapKt
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void TaskRecap(@NotNull ColumnScope $this$TaskRecap, @NotNull Map recap, @NotNull Function1 onTaskSelectionChange, int selectedTaskIndex, boolean isChainRunning, @NotNull PromptMode promptMode, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'recap'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: ldc 'onTaskSelectionChange'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload #5
/*     */     //   20: ldc 'promptMode'
/*     */     //   22: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   25: aload #6
/*     */     //   27: ldc -159009455
/*     */     //   29: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   34: astore #6
/*     */     //   36: iload #7
/*     */     //   38: istore #8
/*     */     //   40: iload #7
/*     */     //   42: bipush #48
/*     */     //   44: iand
/*     */     //   45: ifne -> 71
/*     */     //   48: iload #8
/*     */     //   50: aload #6
/*     */     //   52: aload_1
/*     */     //   53: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   58: ifeq -> 66
/*     */     //   61: bipush #32
/*     */     //   63: goto -> 68
/*     */     //   66: bipush #16
/*     */     //   68: ior
/*     */     //   69: istore #8
/*     */     //   71: iload #7
/*     */     //   73: sipush #384
/*     */     //   76: iand
/*     */     //   77: ifne -> 105
/*     */     //   80: iload #8
/*     */     //   82: aload #6
/*     */     //   84: aload_2
/*     */     //   85: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   90: ifeq -> 99
/*     */     //   93: sipush #256
/*     */     //   96: goto -> 102
/*     */     //   99: sipush #128
/*     */     //   102: ior
/*     */     //   103: istore #8
/*     */     //   105: iload #7
/*     */     //   107: sipush #3072
/*     */     //   110: iand
/*     */     //   111: ifne -> 139
/*     */     //   114: iload #8
/*     */     //   116: aload #6
/*     */     //   118: iload_3
/*     */     //   119: invokeinterface changed : (I)Z
/*     */     //   124: ifeq -> 133
/*     */     //   127: sipush #2048
/*     */     //   130: goto -> 136
/*     */     //   133: sipush #1024
/*     */     //   136: ior
/*     */     //   137: istore #8
/*     */     //   139: iload #7
/*     */     //   141: sipush #24576
/*     */     //   144: iand
/*     */     //   145: ifne -> 174
/*     */     //   148: iload #8
/*     */     //   150: aload #6
/*     */     //   152: iload #4
/*     */     //   154: invokeinterface changed : (Z)Z
/*     */     //   159: ifeq -> 168
/*     */     //   162: sipush #16384
/*     */     //   165: goto -> 171
/*     */     //   168: sipush #8192
/*     */     //   171: ior
/*     */     //   172: istore #8
/*     */     //   174: iload #7
/*     */     //   176: ldc 196608
/*     */     //   178: iand
/*     */     //   179: ifne -> 206
/*     */     //   182: iload #8
/*     */     //   184: aload #6
/*     */     //   186: aload #5
/*     */     //   188: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   193: ifeq -> 201
/*     */     //   196: ldc 131072
/*     */     //   198: goto -> 203
/*     */     //   201: ldc 65536
/*     */     //   203: ior
/*     */     //   204: istore #8
/*     */     //   206: iload #8
/*     */     //   208: ldc 74897
/*     */     //   210: iand
/*     */     //   211: ldc 74896
/*     */     //   213: if_icmpne -> 226
/*     */     //   216: aload #6
/*     */     //   218: invokeinterface getSkipping : ()Z
/*     */     //   223: ifne -> 4250
/*     */     //   226: invokestatic isTraceInProgress : ()Z
/*     */     //   229: ifeq -> 242
/*     */     //   232: ldc -159009455
/*     */     //   234: iload #8
/*     */     //   236: iconst_m1
/*     */     //   237: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskRecap (ChainRecap.kt:44)'
/*     */     //   239: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   242: aload #6
/*     */     //   244: ldc -1432211078
/*     */     //   246: invokeinterface startReplaceGroup : (I)V
/*     */     //   251: aload #6
/*     */     //   253: astore #11
/*     */     //   255: iconst_0
/*     */     //   256: istore #12
/*     */     //   258: nop
/*     */     //   259: iconst_0
/*     */     //   260: istore #13
/*     */     //   262: aload #11
/*     */     //   264: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   269: astore #14
/*     */     //   271: iconst_0
/*     */     //   272: istore #15
/*     */     //   274: aload #14
/*     */     //   276: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   279: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   282: if_acmpne -> 314
/*     */     //   285: iconst_0
/*     */     //   286: istore #16
/*     */     //   288: iconst_0
/*     */     //   289: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   292: aconst_null
/*     */     //   293: iconst_2
/*     */     //   294: aconst_null
/*     */     //   295: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   298: astore #16
/*     */     //   300: aload #11
/*     */     //   302: aload #16
/*     */     //   304: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   309: aload #16
/*     */     //   311: goto -> 316
/*     */     //   314: aload #14
/*     */     //   316: nop
/*     */     //   317: nop
/*     */     //   318: nop
/*     */     //   319: checkcast androidx/compose/runtime/MutableState
/*     */     //   322: astore #10
/*     */     //   324: aload #6
/*     */     //   326: invokeinterface endReplaceGroup : ()V
/*     */     //   331: aload #10
/*     */     //   333: astore #9
/*     */     //   335: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   338: checkcast androidx/compose/ui/Modifier
/*     */     //   341: aload #6
/*     */     //   343: ldc -1432206448
/*     */     //   345: invokeinterface startReplaceGroup : (I)V
/*     */     //   350: aload #6
/*     */     //   352: astore #11
/*     */     //   354: iconst_0
/*     */     //   355: istore #12
/*     */     //   357: iconst_0
/*     */     //   358: istore #13
/*     */     //   360: aload #11
/*     */     //   362: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   367: astore #14
/*     */     //   369: iconst_0
/*     */     //   370: istore #15
/*     */     //   372: aload #14
/*     */     //   374: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   377: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   380: if_acmpne -> 414
/*     */     //   383: astore #158
/*     */     //   385: iconst_0
/*     */     //   386: istore #16
/*     */     //   388: aload #9
/*     */     //   390: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   395: aload #158
/*     */     //   397: swap
/*     */     //   398: astore #17
/*     */     //   400: aload #11
/*     */     //   402: aload #17
/*     */     //   404: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   409: aload #17
/*     */     //   411: goto -> 416
/*     */     //   414: aload #14
/*     */     //   416: nop
/*     */     //   417: nop
/*     */     //   418: nop
/*     */     //   419: checkcast kotlin/jvm/functions/Function1
/*     */     //   422: astore #10
/*     */     //   424: aload #6
/*     */     //   426: invokeinterface endReplaceGroup : ()V
/*     */     //   431: aload #10
/*     */     //   433: invokestatic onHover : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   436: astore #10
/*     */     //   438: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   441: iconst_4
/*     */     //   442: istore #11
/*     */     //   444: iconst_0
/*     */     //   445: istore #12
/*     */     //   447: iload #11
/*     */     //   449: i2f
/*     */     //   450: invokestatic constructor-impl : (F)F
/*     */     //   453: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   456: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*     */     //   459: astore #11
/*     */     //   461: bipush #48
/*     */     //   463: istore #13
/*     */     //   465: nop
/*     */     //   466: iconst_0
/*     */     //   467: istore #14
/*     */     //   469: aload #6
/*     */     //   471: ldc 693286680
/*     */     //   473: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   475: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   478: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   481: invokevirtual getTop : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   484: astore #12
/*     */     //   486: aload #11
/*     */     //   488: aload #12
/*     */     //   490: aload #6
/*     */     //   492: bipush #14
/*     */     //   494: iload #13
/*     */     //   496: iconst_3
/*     */     //   497: ishr
/*     */     //   498: iand
/*     */     //   499: bipush #112
/*     */     //   501: iload #13
/*     */     //   503: iconst_3
/*     */     //   504: ishr
/*     */     //   505: iand
/*     */     //   506: ior
/*     */     //   507: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   510: astore #15
/*     */     //   512: bipush #112
/*     */     //   514: iload #13
/*     */     //   516: iconst_3
/*     */     //   517: ishl
/*     */     //   518: iand
/*     */     //   519: istore #16
/*     */     //   521: nop
/*     */     //   522: iconst_0
/*     */     //   523: istore #17
/*     */     //   525: aload #6
/*     */     //   527: ldc -1323940314
/*     */     //   529: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   531: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   534: aload #6
/*     */     //   536: iconst_0
/*     */     //   537: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   540: istore #18
/*     */     //   542: aload #6
/*     */     //   544: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   549: astore #19
/*     */     //   551: aload #6
/*     */     //   553: aload #10
/*     */     //   555: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   558: astore #20
/*     */     //   560: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   563: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   566: astore #21
/*     */     //   568: bipush #6
/*     */     //   570: sipush #896
/*     */     //   573: iload #16
/*     */     //   575: bipush #6
/*     */     //   577: ishl
/*     */     //   578: iand
/*     */     //   579: ior
/*     */     //   580: istore #22
/*     */     //   582: nop
/*     */     //   583: iconst_0
/*     */     //   584: istore #23
/*     */     //   586: aload #6
/*     */     //   588: ldc -692256719
/*     */     //   590: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   592: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   595: aload #6
/*     */     //   597: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   602: instanceof androidx/compose/runtime/Applier
/*     */     //   605: ifne -> 611
/*     */     //   608: invokestatic invalidApplier : ()V
/*     */     //   611: aload #6
/*     */     //   613: invokeinterface startReusableNode : ()V
/*     */     //   618: aload #6
/*     */     //   620: invokeinterface getInserting : ()Z
/*     */     //   625: ifeq -> 640
/*     */     //   628: aload #6
/*     */     //   630: aload #21
/*     */     //   632: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   637: goto -> 647
/*     */     //   640: aload #6
/*     */     //   642: invokeinterface useNode : ()V
/*     */     //   647: aload #6
/*     */     //   649: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   652: astore #24
/*     */     //   654: iconst_0
/*     */     //   655: istore #25
/*     */     //   657: aload #24
/*     */     //   659: aload #15
/*     */     //   661: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   664: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   667: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   670: aload #24
/*     */     //   672: aload #19
/*     */     //   674: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   677: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   680: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   683: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   686: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   689: astore #26
/*     */     //   691: iconst_0
/*     */     //   692: istore #27
/*     */     //   694: aload #24
/*     */     //   696: astore #28
/*     */     //   698: iconst_0
/*     */     //   699: istore #29
/*     */     //   701: aload #28
/*     */     //   703: invokeinterface getInserting : ()Z
/*     */     //   708: ifne -> 729
/*     */     //   711: aload #28
/*     */     //   713: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   718: iload #18
/*     */     //   720: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   723: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   726: ifne -> 755
/*     */     //   729: aload #28
/*     */     //   731: iload #18
/*     */     //   733: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   736: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   741: aload #24
/*     */     //   743: iload #18
/*     */     //   745: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   748: aload #26
/*     */     //   750: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   755: nop
/*     */     //   756: nop
/*     */     //   757: nop
/*     */     //   758: aload #24
/*     */     //   760: aload #20
/*     */     //   762: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   765: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   768: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   771: nop
/*     */     //   772: nop
/*     */     //   773: aload #6
/*     */     //   775: bipush #14
/*     */     //   777: iload #22
/*     */     //   779: bipush #6
/*     */     //   781: ishr
/*     */     //   782: iand
/*     */     //   783: istore #30
/*     */     //   785: astore #31
/*     */     //   787: iconst_0
/*     */     //   788: istore #32
/*     */     //   790: aload #31
/*     */     //   792: ldc_w -407840262
/*     */     //   795: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   798: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   801: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   804: aload #31
/*     */     //   806: bipush #6
/*     */     //   808: bipush #112
/*     */     //   810: iload #13
/*     */     //   812: bipush #6
/*     */     //   814: ishr
/*     */     //   815: iand
/*     */     //   816: ior
/*     */     //   817: istore #33
/*     */     //   819: astore #34
/*     */     //   821: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   824: astore #35
/*     */     //   826: iconst_0
/*     */     //   827: istore #36
/*     */     //   829: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   832: checkcast androidx/compose/ui/Modifier
/*     */     //   835: bipush #28
/*     */     //   837: istore #37
/*     */     //   839: iconst_0
/*     */     //   840: istore #38
/*     */     //   842: iload #37
/*     */     //   844: i2f
/*     */     //   845: invokestatic constructor-impl : (F)F
/*     */     //   848: invokestatic width-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   851: astore #37
/*     */     //   853: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   856: bipush #8
/*     */     //   858: istore #38
/*     */     //   860: iconst_0
/*     */     //   861: istore #39
/*     */     //   863: iload #38
/*     */     //   865: i2f
/*     */     //   866: invokestatic constructor-impl : (F)F
/*     */     //   869: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   872: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
/*     */     //   875: astore #38
/*     */     //   877: bipush #54
/*     */     //   879: istore #40
/*     */     //   881: iconst_0
/*     */     //   882: istore #41
/*     */     //   884: aload #34
/*     */     //   886: ldc_w -483455358
/*     */     //   889: ldc_w 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   892: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   895: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   898: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   901: astore #39
/*     */     //   903: aload #38
/*     */     //   905: aload #39
/*     */     //   907: aload #34
/*     */     //   909: bipush #14
/*     */     //   911: iload #40
/*     */     //   913: iconst_3
/*     */     //   914: ishr
/*     */     //   915: iand
/*     */     //   916: bipush #112
/*     */     //   918: iload #40
/*     */     //   920: iconst_3
/*     */     //   921: ishr
/*     */     //   922: iand
/*     */     //   923: ior
/*     */     //   924: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   927: astore #42
/*     */     //   929: bipush #112
/*     */     //   931: iload #40
/*     */     //   933: iconst_3
/*     */     //   934: ishl
/*     */     //   935: iand
/*     */     //   936: istore #43
/*     */     //   938: nop
/*     */     //   939: iconst_0
/*     */     //   940: istore #44
/*     */     //   942: aload #34
/*     */     //   944: ldc -1323940314
/*     */     //   946: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   948: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   951: aload #34
/*     */     //   953: iconst_0
/*     */     //   954: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   957: istore #45
/*     */     //   959: aload #34
/*     */     //   961: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   966: astore #46
/*     */     //   968: aload #34
/*     */     //   970: aload #37
/*     */     //   972: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   975: astore #47
/*     */     //   977: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   980: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   983: astore #48
/*     */     //   985: bipush #6
/*     */     //   987: sipush #896
/*     */     //   990: iload #43
/*     */     //   992: bipush #6
/*     */     //   994: ishl
/*     */     //   995: iand
/*     */     //   996: ior
/*     */     //   997: istore #49
/*     */     //   999: nop
/*     */     //   1000: iconst_0
/*     */     //   1001: istore #50
/*     */     //   1003: aload #34
/*     */     //   1005: ldc -692256719
/*     */     //   1007: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1009: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1012: aload #34
/*     */     //   1014: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1019: instanceof androidx/compose/runtime/Applier
/*     */     //   1022: ifne -> 1028
/*     */     //   1025: invokestatic invalidApplier : ()V
/*     */     //   1028: aload #34
/*     */     //   1030: invokeinterface startReusableNode : ()V
/*     */     //   1035: aload #34
/*     */     //   1037: invokeinterface getInserting : ()Z
/*     */     //   1042: ifeq -> 1057
/*     */     //   1045: aload #34
/*     */     //   1047: aload #48
/*     */     //   1049: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1054: goto -> 1064
/*     */     //   1057: aload #34
/*     */     //   1059: invokeinterface useNode : ()V
/*     */     //   1064: aload #34
/*     */     //   1066: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1069: astore #51
/*     */     //   1071: iconst_0
/*     */     //   1072: istore #52
/*     */     //   1074: aload #51
/*     */     //   1076: aload #42
/*     */     //   1078: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1081: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1084: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1087: aload #51
/*     */     //   1089: aload #46
/*     */     //   1091: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1094: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1097: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1100: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1103: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1106: astore #53
/*     */     //   1108: iconst_0
/*     */     //   1109: istore #54
/*     */     //   1111: aload #51
/*     */     //   1113: astore #55
/*     */     //   1115: iconst_0
/*     */     //   1116: istore #56
/*     */     //   1118: aload #55
/*     */     //   1120: invokeinterface getInserting : ()Z
/*     */     //   1125: ifne -> 1146
/*     */     //   1128: aload #55
/*     */     //   1130: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1135: iload #45
/*     */     //   1137: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1140: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1143: ifne -> 1172
/*     */     //   1146: aload #55
/*     */     //   1148: iload #45
/*     */     //   1150: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1153: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1158: aload #51
/*     */     //   1160: iload #45
/*     */     //   1162: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1165: aload #53
/*     */     //   1167: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1172: nop
/*     */     //   1173: nop
/*     */     //   1174: nop
/*     */     //   1175: aload #51
/*     */     //   1177: aload #47
/*     */     //   1179: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1182: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1185: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1188: nop
/*     */     //   1189: nop
/*     */     //   1190: aload #34
/*     */     //   1192: bipush #14
/*     */     //   1194: iload #49
/*     */     //   1196: bipush #6
/*     */     //   1198: ishr
/*     */     //   1199: iand
/*     */     //   1200: istore #57
/*     */     //   1202: astore #58
/*     */     //   1204: iconst_0
/*     */     //   1205: istore #59
/*     */     //   1207: aload #58
/*     */     //   1209: ldc_w -384784025
/*     */     //   1212: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   1215: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1218: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   1221: aload #58
/*     */     //   1223: bipush #6
/*     */     //   1225: bipush #112
/*     */     //   1227: iload #40
/*     */     //   1229: bipush #6
/*     */     //   1231: ishr
/*     */     //   1232: iand
/*     */     //   1233: ior
/*     */     //   1234: istore #60
/*     */     //   1236: astore #61
/*     */     //   1238: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   1241: astore #62
/*     */     //   1243: iconst_0
/*     */     //   1244: istore #63
/*     */     //   1246: aload #61
/*     */     //   1248: ldc_w -89124758
/*     */     //   1251: invokeinterface startReplaceGroup : (I)V
/*     */     //   1256: aload_1
/*     */     //   1257: invokeinterface keySet : ()Ljava/util/Set;
/*     */     //   1262: invokeinterface size : ()I
/*     */     //   1267: iconst_1
/*     */     //   1268: if_icmple -> 1483
/*     */     //   1271: aload_1
/*     */     //   1272: invokeinterface keySet : ()Ljava/util/Set;
/*     */     //   1277: checkcast java/lang/Iterable
/*     */     //   1280: astore #64
/*     */     //   1282: iconst_0
/*     */     //   1283: istore #65
/*     */     //   1285: aload #64
/*     */     //   1287: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   1292: astore #66
/*     */     //   1294: aload #66
/*     */     //   1296: invokeinterface hasNext : ()Z
/*     */     //   1301: ifeq -> 1482
/*     */     //   1304: aload #66
/*     */     //   1306: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   1311: astore #67
/*     */     //   1313: aload #67
/*     */     //   1315: checkcast java/lang/Number
/*     */     //   1318: invokevirtual intValue : ()I
/*     */     //   1321: istore #68
/*     */     //   1323: iconst_0
/*     */     //   1324: istore #69
/*     */     //   1326: iload #68
/*     */     //   1328: iload #68
/*     */     //   1330: iload_3
/*     */     //   1331: if_icmpne -> 1338
/*     */     //   1334: iconst_1
/*     */     //   1335: goto -> 1339
/*     */     //   1338: iconst_0
/*     */     //   1339: aload #61
/*     */     //   1341: ldc_w -952324408
/*     */     //   1344: invokeinterface startReplaceGroup : (I)V
/*     */     //   1349: aload #61
/*     */     //   1351: astore #70
/*     */     //   1353: iload #8
/*     */     //   1355: sipush #896
/*     */     //   1358: iand
/*     */     //   1359: sipush #256
/*     */     //   1362: if_icmpne -> 1369
/*     */     //   1365: iconst_1
/*     */     //   1366: goto -> 1370
/*     */     //   1369: iconst_0
/*     */     //   1370: aload #6
/*     */     //   1372: iload #68
/*     */     //   1374: invokeinterface changed : (I)Z
/*     */     //   1379: ior
/*     */     //   1380: istore #71
/*     */     //   1382: iconst_0
/*     */     //   1383: istore #72
/*     */     //   1385: aload #70
/*     */     //   1387: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1392: astore #73
/*     */     //   1394: iconst_0
/*     */     //   1395: istore #74
/*     */     //   1397: iload #71
/*     */     //   1399: ifne -> 1413
/*     */     //   1402: aload #73
/*     */     //   1404: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1407: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1410: if_acmpne -> 1452
/*     */     //   1413: istore #75
/*     */     //   1415: istore #76
/*     */     //   1417: iconst_0
/*     */     //   1418: istore #77
/*     */     //   1420: aload_2
/*     */     //   1421: iload #68
/*     */     //   1423: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;I)Lkotlin/jvm/functions/Function0;
/*     */     //   1428: astore #78
/*     */     //   1430: iload #76
/*     */     //   1432: iload #75
/*     */     //   1434: aload #78
/*     */     //   1436: astore #79
/*     */     //   1438: aload #70
/*     */     //   1440: aload #79
/*     */     //   1442: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1447: aload #79
/*     */     //   1449: goto -> 1454
/*     */     //   1452: aload #73
/*     */     //   1454: nop
/*     */     //   1455: nop
/*     */     //   1456: nop
/*     */     //   1457: checkcast kotlin/jvm/functions/Function0
/*     */     //   1460: astore #80
/*     */     //   1462: aload #61
/*     */     //   1464: invokeinterface endReplaceGroup : ()V
/*     */     //   1469: aload #80
/*     */     //   1471: aload #61
/*     */     //   1473: iconst_0
/*     */     //   1474: invokestatic PlanIndexButton : (IZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1477: nop
/*     */     //   1478: nop
/*     */     //   1479: goto -> 1294
/*     */     //   1482: nop
/*     */     //   1483: aload #61
/*     */     //   1485: invokeinterface endReplaceGroup : ()V
/*     */     //   1490: nop
/*     */     //   1491: aload #58
/*     */     //   1493: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1496: aload #34
/*     */     //   1498: invokeinterface endNode : ()V
/*     */     //   1503: aload #34
/*     */     //   1505: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1508: nop
/*     */     //   1509: aload #34
/*     */     //   1511: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1514: nop
/*     */     //   1515: aload #34
/*     */     //   1517: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1520: nop
/*     */     //   1521: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   1524: bipush #12
/*     */     //   1526: istore #38
/*     */     //   1528: iconst_0
/*     */     //   1529: istore #39
/*     */     //   1531: iload #38
/*     */     //   1533: i2f
/*     */     //   1534: invokestatic constructor-impl : (F)F
/*     */     //   1537: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   1540: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
/*     */     //   1543: astore #38
/*     */     //   1545: bipush #48
/*     */     //   1547: istore #40
/*     */     //   1549: iconst_0
/*     */     //   1550: istore #41
/*     */     //   1552: aload #34
/*     */     //   1554: ldc_w -483455358
/*     */     //   1557: ldc_w 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   1560: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1563: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1566: checkcast androidx/compose/ui/Modifier
/*     */     //   1569: astore #37
/*     */     //   1571: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1574: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   1577: astore #39
/*     */     //   1579: aload #38
/*     */     //   1581: aload #39
/*     */     //   1583: aload #34
/*     */     //   1585: bipush #14
/*     */     //   1587: iload #40
/*     */     //   1589: iconst_3
/*     */     //   1590: ishr
/*     */     //   1591: iand
/*     */     //   1592: bipush #112
/*     */     //   1594: iload #40
/*     */     //   1596: iconst_3
/*     */     //   1597: ishr
/*     */     //   1598: iand
/*     */     //   1599: ior
/*     */     //   1600: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1603: astore #42
/*     */     //   1605: bipush #112
/*     */     //   1607: iload #40
/*     */     //   1609: iconst_3
/*     */     //   1610: ishl
/*     */     //   1611: iand
/*     */     //   1612: istore #43
/*     */     //   1614: nop
/*     */     //   1615: iconst_0
/*     */     //   1616: istore #44
/*     */     //   1618: aload #34
/*     */     //   1620: ldc -1323940314
/*     */     //   1622: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1624: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1627: aload #34
/*     */     //   1629: iconst_0
/*     */     //   1630: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1633: istore #45
/*     */     //   1635: aload #34
/*     */     //   1637: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1642: astore #46
/*     */     //   1644: aload #34
/*     */     //   1646: aload #37
/*     */     //   1648: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1651: astore #47
/*     */     //   1653: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1656: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1659: astore #48
/*     */     //   1661: bipush #6
/*     */     //   1663: sipush #896
/*     */     //   1666: iload #43
/*     */     //   1668: bipush #6
/*     */     //   1670: ishl
/*     */     //   1671: iand
/*     */     //   1672: ior
/*     */     //   1673: istore #49
/*     */     //   1675: nop
/*     */     //   1676: iconst_0
/*     */     //   1677: istore #50
/*     */     //   1679: aload #34
/*     */     //   1681: ldc -692256719
/*     */     //   1683: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1685: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1688: aload #34
/*     */     //   1690: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1695: instanceof androidx/compose/runtime/Applier
/*     */     //   1698: ifne -> 1704
/*     */     //   1701: invokestatic invalidApplier : ()V
/*     */     //   1704: aload #34
/*     */     //   1706: invokeinterface startReusableNode : ()V
/*     */     //   1711: aload #34
/*     */     //   1713: invokeinterface getInserting : ()Z
/*     */     //   1718: ifeq -> 1733
/*     */     //   1721: aload #34
/*     */     //   1723: aload #48
/*     */     //   1725: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1730: goto -> 1740
/*     */     //   1733: aload #34
/*     */     //   1735: invokeinterface useNode : ()V
/*     */     //   1740: aload #34
/*     */     //   1742: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1745: astore #51
/*     */     //   1747: iconst_0
/*     */     //   1748: istore #52
/*     */     //   1750: aload #51
/*     */     //   1752: aload #42
/*     */     //   1754: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1757: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1760: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1763: aload #51
/*     */     //   1765: aload #46
/*     */     //   1767: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1770: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1773: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1776: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1779: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1782: astore #53
/*     */     //   1784: iconst_0
/*     */     //   1785: istore #54
/*     */     //   1787: aload #51
/*     */     //   1789: astore #55
/*     */     //   1791: iconst_0
/*     */     //   1792: istore #56
/*     */     //   1794: aload #55
/*     */     //   1796: invokeinterface getInserting : ()Z
/*     */     //   1801: ifne -> 1822
/*     */     //   1804: aload #55
/*     */     //   1806: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1811: iload #45
/*     */     //   1813: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1816: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1819: ifne -> 1848
/*     */     //   1822: aload #55
/*     */     //   1824: iload #45
/*     */     //   1826: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1829: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1834: aload #51
/*     */     //   1836: iload #45
/*     */     //   1838: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1841: aload #53
/*     */     //   1843: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1848: nop
/*     */     //   1849: nop
/*     */     //   1850: nop
/*     */     //   1851: aload #51
/*     */     //   1853: aload #47
/*     */     //   1855: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1858: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1861: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1864: nop
/*     */     //   1865: nop
/*     */     //   1866: aload #34
/*     */     //   1868: bipush #14
/*     */     //   1870: iload #49
/*     */     //   1872: bipush #6
/*     */     //   1874: ishr
/*     */     //   1875: iand
/*     */     //   1876: istore #57
/*     */     //   1878: astore #58
/*     */     //   1880: iconst_0
/*     */     //   1881: istore #59
/*     */     //   1883: aload #58
/*     */     //   1885: ldc_w -384784025
/*     */     //   1888: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   1891: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1894: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   1897: aload #58
/*     */     //   1899: bipush #6
/*     */     //   1901: bipush #112
/*     */     //   1903: iload #40
/*     */     //   1905: bipush #6
/*     */     //   1907: ishr
/*     */     //   1908: iand
/*     */     //   1909: ior
/*     */     //   1910: istore #60
/*     */     //   1912: astore #61
/*     */     //   1914: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   1917: astore #62
/*     */     //   1919: iconst_0
/*     */     //   1920: istore #63
/*     */     //   1922: aload_1
/*     */     //   1923: iload_3
/*     */     //   1924: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1927: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1932: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskRecapModel
/*     */     //   1935: astore #64
/*     */     //   1937: aload #64
/*     */     //   1939: dup
/*     */     //   1940: ifnull -> 1949
/*     */     //   1943: invokevirtual getPlan : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Plan;
/*     */     //   1946: goto -> 1951
/*     */     //   1949: pop
/*     */     //   1950: aconst_null
/*     */     //   1951: astore #65
/*     */     //   1953: aload #64
/*     */     //   1955: dup
/*     */     //   1956: ifnull -> 1965
/*     */     //   1959: invokevirtual getResult : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep;
/*     */     //   1962: goto -> 1967
/*     */     //   1965: pop
/*     */     //   1966: aconst_null
/*     */     //   1967: astore #66
/*     */     //   1969: aload #61
/*     */     //   1971: ldc_w -89111024
/*     */     //   1974: invokeinterface startReplaceGroup : (I)V
/*     */     //   1979: aload #64
/*     */     //   1981: ifnull -> 4169
/*     */     //   1984: aload #64
/*     */     //   1986: invokevirtual getPrompt : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Prompt;
/*     */     //   1989: invokevirtual getDescription : ()Ljava/lang/String;
/*     */     //   1992: aload #61
/*     */     //   1994: iconst_0
/*     */     //   1995: invokestatic TextContainer : (Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1998: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   2001: bipush #8
/*     */     //   2003: istore #67
/*     */     //   2005: iconst_0
/*     */     //   2006: istore #68
/*     */     //   2008: iload #67
/*     */     //   2010: i2f
/*     */     //   2011: invokestatic constructor-impl : (F)F
/*     */     //   2014: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   2017: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
/*     */     //   2020: astore #67
/*     */     //   2022: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   2025: invokevirtual getCenterHorizontally : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   2028: astore #68
/*     */     //   2030: sipush #432
/*     */     //   2033: istore #69
/*     */     //   2035: nop
/*     */     //   2036: iconst_0
/*     */     //   2037: istore #70
/*     */     //   2039: aload #61
/*     */     //   2041: ldc_w -483455358
/*     */     //   2044: ldc_w 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   2047: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2050: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   2053: checkcast androidx/compose/ui/Modifier
/*     */     //   2056: astore #71
/*     */     //   2058: aload #67
/*     */     //   2060: aload #68
/*     */     //   2062: aload #61
/*     */     //   2064: bipush #14
/*     */     //   2066: iload #69
/*     */     //   2068: iconst_3
/*     */     //   2069: ishr
/*     */     //   2070: iand
/*     */     //   2071: bipush #112
/*     */     //   2073: iload #69
/*     */     //   2075: iconst_3
/*     */     //   2076: ishr
/*     */     //   2077: iand
/*     */     //   2078: ior
/*     */     //   2079: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2082: astore #72
/*     */     //   2084: bipush #112
/*     */     //   2086: iload #69
/*     */     //   2088: iconst_3
/*     */     //   2089: ishl
/*     */     //   2090: iand
/*     */     //   2091: istore #73
/*     */     //   2093: nop
/*     */     //   2094: iconst_0
/*     */     //   2095: istore #74
/*     */     //   2097: aload #61
/*     */     //   2099: ldc -1323940314
/*     */     //   2101: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   2103: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2106: aload #61
/*     */     //   2108: iconst_0
/*     */     //   2109: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   2112: istore #75
/*     */     //   2114: aload #61
/*     */     //   2116: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   2121: astore #76
/*     */     //   2123: aload #61
/*     */     //   2125: aload #71
/*     */     //   2127: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   2130: astore #77
/*     */     //   2132: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2135: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   2138: astore #78
/*     */     //   2140: bipush #6
/*     */     //   2142: sipush #896
/*     */     //   2145: iload #73
/*     */     //   2147: bipush #6
/*     */     //   2149: ishl
/*     */     //   2150: iand
/*     */     //   2151: ior
/*     */     //   2152: istore #79
/*     */     //   2154: nop
/*     */     //   2155: iconst_0
/*     */     //   2156: istore #80
/*     */     //   2158: aload #61
/*     */     //   2160: ldc -692256719
/*     */     //   2162: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   2164: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2167: aload #61
/*     */     //   2169: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   2174: instanceof androidx/compose/runtime/Applier
/*     */     //   2177: ifne -> 2183
/*     */     //   2180: invokestatic invalidApplier : ()V
/*     */     //   2183: aload #61
/*     */     //   2185: invokeinterface startReusableNode : ()V
/*     */     //   2190: aload #61
/*     */     //   2192: invokeinterface getInserting : ()Z
/*     */     //   2197: ifeq -> 2212
/*     */     //   2200: aload #61
/*     */     //   2202: aload #78
/*     */     //   2204: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   2209: goto -> 2219
/*     */     //   2212: aload #61
/*     */     //   2214: invokeinterface useNode : ()V
/*     */     //   2219: aload #61
/*     */     //   2221: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   2224: astore #81
/*     */     //   2226: iconst_0
/*     */     //   2227: istore #82
/*     */     //   2229: aload #81
/*     */     //   2231: aload #72
/*     */     //   2233: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2236: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2239: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2242: aload #81
/*     */     //   2244: aload #76
/*     */     //   2246: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2249: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2252: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2255: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2258: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2261: astore #83
/*     */     //   2263: iconst_0
/*     */     //   2264: istore #84
/*     */     //   2266: aload #81
/*     */     //   2268: astore #85
/*     */     //   2270: iconst_0
/*     */     //   2271: istore #86
/*     */     //   2273: aload #85
/*     */     //   2275: invokeinterface getInserting : ()Z
/*     */     //   2280: ifne -> 2301
/*     */     //   2283: aload #85
/*     */     //   2285: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2290: iload #75
/*     */     //   2292: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2295: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   2298: ifne -> 2327
/*     */     //   2301: aload #85
/*     */     //   2303: iload #75
/*     */     //   2305: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2308: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2313: aload #81
/*     */     //   2315: iload #75
/*     */     //   2317: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2320: aload #83
/*     */     //   2322: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2327: nop
/*     */     //   2328: nop
/*     */     //   2329: nop
/*     */     //   2330: aload #81
/*     */     //   2332: aload #77
/*     */     //   2334: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2337: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2340: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2343: nop
/*     */     //   2344: nop
/*     */     //   2345: aload #61
/*     */     //   2347: bipush #14
/*     */     //   2349: iload #79
/*     */     //   2351: bipush #6
/*     */     //   2353: ishr
/*     */     //   2354: iand
/*     */     //   2355: istore #87
/*     */     //   2357: astore #88
/*     */     //   2359: iconst_0
/*     */     //   2360: istore #89
/*     */     //   2362: aload #88
/*     */     //   2364: ldc_w -384784025
/*     */     //   2367: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   2370: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2373: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   2376: aload #88
/*     */     //   2378: bipush #6
/*     */     //   2380: bipush #112
/*     */     //   2382: iload #69
/*     */     //   2384: bipush #6
/*     */     //   2386: ishr
/*     */     //   2387: iand
/*     */     //   2388: ior
/*     */     //   2389: istore #90
/*     */     //   2391: astore #91
/*     */     //   2393: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   2396: astore #92
/*     */     //   2398: iconst_0
/*     */     //   2399: istore #93
/*     */     //   2401: aload #64
/*     */     //   2403: aload #5
/*     */     //   2405: invokestatic shouldShowPlanning : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskRecapModel;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;)Z
/*     */     //   2408: ifeq -> 2930
/*     */     //   2411: aload #91
/*     */     //   2413: ldc_w 543274937
/*     */     //   2416: invokeinterface startReplaceGroup : (I)V
/*     */     //   2421: iconst_0
/*     */     //   2422: istore #94
/*     */     //   2424: nop
/*     */     //   2425: iconst_0
/*     */     //   2426: istore #95
/*     */     //   2428: aload #91
/*     */     //   2430: ldc_w -483455358
/*     */     //   2433: ldc_w 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   2436: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2439: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   2442: checkcast androidx/compose/ui/Modifier
/*     */     //   2445: astore #96
/*     */     //   2447: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   2450: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   2453: astore #97
/*     */     //   2455: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   2458: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   2461: astore #98
/*     */     //   2463: aload #97
/*     */     //   2465: aload #98
/*     */     //   2467: aload #91
/*     */     //   2469: bipush #14
/*     */     //   2471: iload #94
/*     */     //   2473: iconst_3
/*     */     //   2474: ishr
/*     */     //   2475: iand
/*     */     //   2476: bipush #112
/*     */     //   2478: iload #94
/*     */     //   2480: iconst_3
/*     */     //   2481: ishr
/*     */     //   2482: iand
/*     */     //   2483: ior
/*     */     //   2484: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2487: astore #99
/*     */     //   2489: bipush #112
/*     */     //   2491: iload #94
/*     */     //   2493: iconst_3
/*     */     //   2494: ishl
/*     */     //   2495: iand
/*     */     //   2496: istore #100
/*     */     //   2498: nop
/*     */     //   2499: iconst_0
/*     */     //   2500: istore #101
/*     */     //   2502: aload #91
/*     */     //   2504: ldc -1323940314
/*     */     //   2506: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   2508: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2511: aload #91
/*     */     //   2513: iconst_0
/*     */     //   2514: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   2517: istore #102
/*     */     //   2519: aload #91
/*     */     //   2521: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   2526: astore #103
/*     */     //   2528: aload #91
/*     */     //   2530: aload #96
/*     */     //   2532: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   2535: astore #104
/*     */     //   2537: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2540: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   2543: astore #105
/*     */     //   2545: bipush #6
/*     */     //   2547: sipush #896
/*     */     //   2550: iload #100
/*     */     //   2552: bipush #6
/*     */     //   2554: ishl
/*     */     //   2555: iand
/*     */     //   2556: ior
/*     */     //   2557: istore #106
/*     */     //   2559: nop
/*     */     //   2560: iconst_0
/*     */     //   2561: istore #107
/*     */     //   2563: aload #91
/*     */     //   2565: ldc -692256719
/*     */     //   2567: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   2569: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2572: aload #91
/*     */     //   2574: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   2579: instanceof androidx/compose/runtime/Applier
/*     */     //   2582: ifne -> 2588
/*     */     //   2585: invokestatic invalidApplier : ()V
/*     */     //   2588: aload #91
/*     */     //   2590: invokeinterface startReusableNode : ()V
/*     */     //   2595: aload #91
/*     */     //   2597: invokeinterface getInserting : ()Z
/*     */     //   2602: ifeq -> 2617
/*     */     //   2605: aload #91
/*     */     //   2607: aload #105
/*     */     //   2609: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   2614: goto -> 2624
/*     */     //   2617: aload #91
/*     */     //   2619: invokeinterface useNode : ()V
/*     */     //   2624: aload #91
/*     */     //   2626: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   2629: astore #108
/*     */     //   2631: iconst_0
/*     */     //   2632: istore #109
/*     */     //   2634: aload #108
/*     */     //   2636: aload #99
/*     */     //   2638: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2641: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2644: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2647: aload #108
/*     */     //   2649: aload #103
/*     */     //   2651: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2654: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2657: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2660: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2663: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2666: astore #110
/*     */     //   2668: iconst_0
/*     */     //   2669: istore #111
/*     */     //   2671: aload #108
/*     */     //   2673: astore #112
/*     */     //   2675: iconst_0
/*     */     //   2676: istore #113
/*     */     //   2678: aload #112
/*     */     //   2680: invokeinterface getInserting : ()Z
/*     */     //   2685: ifne -> 2706
/*     */     //   2688: aload #112
/*     */     //   2690: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2695: iload #102
/*     */     //   2697: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2700: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   2703: ifne -> 2732
/*     */     //   2706: aload #112
/*     */     //   2708: iload #102
/*     */     //   2710: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2713: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2718: aload #108
/*     */     //   2720: iload #102
/*     */     //   2722: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2725: aload #110
/*     */     //   2727: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2732: nop
/*     */     //   2733: nop
/*     */     //   2734: nop
/*     */     //   2735: aload #108
/*     */     //   2737: aload #104
/*     */     //   2739: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2742: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2745: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2748: nop
/*     */     //   2749: nop
/*     */     //   2750: aload #91
/*     */     //   2752: bipush #14
/*     */     //   2754: iload #106
/*     */     //   2756: bipush #6
/*     */     //   2758: ishr
/*     */     //   2759: iand
/*     */     //   2760: istore #114
/*     */     //   2762: astore #115
/*     */     //   2764: iconst_0
/*     */     //   2765: istore #116
/*     */     //   2767: aload #115
/*     */     //   2769: ldc_w -384784025
/*     */     //   2772: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   2775: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2778: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   2781: aload #115
/*     */     //   2783: bipush #6
/*     */     //   2785: bipush #112
/*     */     //   2787: iload #94
/*     */     //   2789: bipush #6
/*     */     //   2791: ishr
/*     */     //   2792: iand
/*     */     //   2793: ior
/*     */     //   2794: istore #117
/*     */     //   2796: astore #118
/*     */     //   2798: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   2801: astore #119
/*     */     //   2803: iconst_0
/*     */     //   2804: istore #120
/*     */     //   2806: ldc_w 'PLANNING'
/*     */     //   2809: aconst_null
/*     */     //   2810: lconst_0
/*     */     //   2811: lconst_0
/*     */     //   2812: aconst_null
/*     */     //   2813: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
/*     */     //   2816: invokevirtual getBold : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   2819: aconst_null
/*     */     //   2820: lconst_0
/*     */     //   2821: aconst_null
/*     */     //   2822: iconst_0
/*     */     //   2823: lconst_0
/*     */     //   2824: iconst_0
/*     */     //   2825: iconst_0
/*     */     //   2826: iconst_0
/*     */     //   2827: aconst_null
/*     */     //   2828: aconst_null
/*     */     //   2829: aload #118
/*     */     //   2831: ldc_w 196614
/*     */     //   2834: iconst_0
/*     */     //   2835: ldc_w 65502
/*     */     //   2838: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   2841: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   2844: checkcast androidx/compose/ui/Modifier
/*     */     //   2847: fconst_0
/*     */     //   2848: iconst_1
/*     */     //   2849: aconst_null
/*     */     //   2850: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2853: aload #118
/*     */     //   2855: iconst_0
/*     */     //   2856: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   2859: invokevirtual getSeparatorColor-0d7_KjU : ()J
/*     */     //   2862: aconst_null
/*     */     //   2863: iconst_2
/*     */     //   2864: aconst_null
/*     */     //   2865: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2868: iconst_1
/*     */     //   2869: istore #121
/*     */     //   2871: iconst_0
/*     */     //   2872: istore #122
/*     */     //   2874: iload #121
/*     */     //   2876: i2f
/*     */     //   2877: invokestatic constructor-impl : (F)F
/*     */     //   2880: invokestatic height-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   2883: aload #118
/*     */     //   2885: iconst_0
/*     */     //   2886: invokestatic Box : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   2889: nop
/*     */     //   2890: aload #115
/*     */     //   2892: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2895: aload #91
/*     */     //   2897: invokeinterface endNode : ()V
/*     */     //   2902: aload #91
/*     */     //   2904: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2907: nop
/*     */     //   2908: aload #91
/*     */     //   2910: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2913: nop
/*     */     //   2914: aload #91
/*     */     //   2916: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2919: nop
/*     */     //   2920: aload #91
/*     */     //   2922: invokeinterface endReplaceGroup : ()V
/*     */     //   2927: goto -> 4089
/*     */     //   2930: aload #65
/*     */     //   2932: dup
/*     */     //   2933: ifnull -> 2942
/*     */     //   2936: invokevirtual getPlan : ()Ljava/util/List;
/*     */     //   2939: goto -> 2944
/*     */     //   2942: pop
/*     */     //   2943: aconst_null
/*     */     //   2944: ifnull -> 4072
/*     */     //   2947: aload #91
/*     */     //   2949: ldc_w 543564756
/*     */     //   2952: invokeinterface startReplaceGroup : (I)V
/*     */     //   2957: iconst_0
/*     */     //   2958: istore #94
/*     */     //   2960: nop
/*     */     //   2961: iconst_0
/*     */     //   2962: istore #95
/*     */     //   2964: aload #91
/*     */     //   2966: ldc_w -483455358
/*     */     //   2969: ldc_w 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   2972: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2975: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   2978: checkcast androidx/compose/ui/Modifier
/*     */     //   2981: astore #96
/*     */     //   2983: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   2986: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   2989: astore #97
/*     */     //   2991: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   2994: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   2997: astore #98
/*     */     //   2999: aload #97
/*     */     //   3001: aload #98
/*     */     //   3003: aload #91
/*     */     //   3005: bipush #14
/*     */     //   3007: iload #94
/*     */     //   3009: iconst_3
/*     */     //   3010: ishr
/*     */     //   3011: iand
/*     */     //   3012: bipush #112
/*     */     //   3014: iload #94
/*     */     //   3016: iconst_3
/*     */     //   3017: ishr
/*     */     //   3018: iand
/*     */     //   3019: ior
/*     */     //   3020: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   3023: astore #99
/*     */     //   3025: bipush #112
/*     */     //   3027: iload #94
/*     */     //   3029: iconst_3
/*     */     //   3030: ishl
/*     */     //   3031: iand
/*     */     //   3032: istore #100
/*     */     //   3034: nop
/*     */     //   3035: iconst_0
/*     */     //   3036: istore #101
/*     */     //   3038: aload #91
/*     */     //   3040: ldc -1323940314
/*     */     //   3042: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   3044: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   3047: aload #91
/*     */     //   3049: iconst_0
/*     */     //   3050: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   3053: istore #102
/*     */     //   3055: aload #91
/*     */     //   3057: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   3062: astore #103
/*     */     //   3064: aload #91
/*     */     //   3066: aload #96
/*     */     //   3068: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   3071: astore #104
/*     */     //   3073: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3076: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   3079: astore #105
/*     */     //   3081: bipush #6
/*     */     //   3083: sipush #896
/*     */     //   3086: iload #100
/*     */     //   3088: bipush #6
/*     */     //   3090: ishl
/*     */     //   3091: iand
/*     */     //   3092: ior
/*     */     //   3093: istore #106
/*     */     //   3095: nop
/*     */     //   3096: iconst_0
/*     */     //   3097: istore #107
/*     */     //   3099: aload #91
/*     */     //   3101: ldc -692256719
/*     */     //   3103: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   3105: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   3108: aload #91
/*     */     //   3110: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   3115: instanceof androidx/compose/runtime/Applier
/*     */     //   3118: ifne -> 3124
/*     */     //   3121: invokestatic invalidApplier : ()V
/*     */     //   3124: aload #91
/*     */     //   3126: invokeinterface startReusableNode : ()V
/*     */     //   3131: aload #91
/*     */     //   3133: invokeinterface getInserting : ()Z
/*     */     //   3138: ifeq -> 3153
/*     */     //   3141: aload #91
/*     */     //   3143: aload #105
/*     */     //   3145: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   3150: goto -> 3160
/*     */     //   3153: aload #91
/*     */     //   3155: invokeinterface useNode : ()V
/*     */     //   3160: aload #91
/*     */     //   3162: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   3165: astore #108
/*     */     //   3167: iconst_0
/*     */     //   3168: istore #109
/*     */     //   3170: aload #108
/*     */     //   3172: aload #99
/*     */     //   3174: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3177: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3180: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3183: aload #108
/*     */     //   3185: aload #103
/*     */     //   3187: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3190: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3193: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3196: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3199: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3202: astore #110
/*     */     //   3204: iconst_0
/*     */     //   3205: istore #111
/*     */     //   3207: aload #108
/*     */     //   3209: astore #112
/*     */     //   3211: iconst_0
/*     */     //   3212: istore #113
/*     */     //   3214: aload #112
/*     */     //   3216: invokeinterface getInserting : ()Z
/*     */     //   3221: ifne -> 3242
/*     */     //   3224: aload #112
/*     */     //   3226: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   3231: iload #102
/*     */     //   3233: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3236: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   3239: ifne -> 3268
/*     */     //   3242: aload #112
/*     */     //   3244: iload #102
/*     */     //   3246: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3249: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   3254: aload #108
/*     */     //   3256: iload #102
/*     */     //   3258: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3261: aload #110
/*     */     //   3263: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3268: nop
/*     */     //   3269: nop
/*     */     //   3270: nop
/*     */     //   3271: aload #108
/*     */     //   3273: aload #104
/*     */     //   3275: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3278: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3281: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3284: nop
/*     */     //   3285: nop
/*     */     //   3286: aload #91
/*     */     //   3288: bipush #14
/*     */     //   3290: iload #106
/*     */     //   3292: bipush #6
/*     */     //   3294: ishr
/*     */     //   3295: iand
/*     */     //   3296: istore #114
/*     */     //   3298: astore #115
/*     */     //   3300: iconst_0
/*     */     //   3301: istore #116
/*     */     //   3303: aload #115
/*     */     //   3305: ldc_w -384784025
/*     */     //   3308: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   3311: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   3314: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   3317: aload #115
/*     */     //   3319: bipush #6
/*     */     //   3321: bipush #112
/*     */     //   3323: iload #94
/*     */     //   3325: bipush #6
/*     */     //   3327: ishr
/*     */     //   3328: iand
/*     */     //   3329: ior
/*     */     //   3330: istore #117
/*     */     //   3332: astore #118
/*     */     //   3334: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   3337: astore #119
/*     */     //   3339: iconst_0
/*     */     //   3340: istore #120
/*     */     //   3342: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   3345: checkcast androidx/compose/ui/Modifier
/*     */     //   3348: fconst_0
/*     */     //   3349: iconst_1
/*     */     //   3350: aconst_null
/*     */     //   3351: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   3354: bipush #24
/*     */     //   3356: istore #121
/*     */     //   3358: iconst_0
/*     */     //   3359: istore #122
/*     */     //   3361: iload #121
/*     */     //   3363: i2f
/*     */     //   3364: invokestatic constructor-impl : (F)F
/*     */     //   3367: invokestatic height-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   3370: astore #121
/*     */     //   3372: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   3375: invokevirtual getSpaceBetween : ()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   3378: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*     */     //   3381: astore #122
/*     */     //   3383: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   3386: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   3389: astore #123
/*     */     //   3391: sipush #438
/*     */     //   3394: istore #124
/*     */     //   3396: nop
/*     */     //   3397: iconst_0
/*     */     //   3398: istore #125
/*     */     //   3400: aload #118
/*     */     //   3402: ldc 693286680
/*     */     //   3404: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   3406: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   3409: aload #122
/*     */     //   3411: aload #123
/*     */     //   3413: aload #118
/*     */     //   3415: bipush #14
/*     */     //   3417: iload #124
/*     */     //   3419: iconst_3
/*     */     //   3420: ishr
/*     */     //   3421: iand
/*     */     //   3422: bipush #112
/*     */     //   3424: iload #124
/*     */     //   3426: iconst_3
/*     */     //   3427: ishr
/*     */     //   3428: iand
/*     */     //   3429: ior
/*     */     //   3430: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   3433: astore #126
/*     */     //   3435: bipush #112
/*     */     //   3437: iload #124
/*     */     //   3439: iconst_3
/*     */     //   3440: ishl
/*     */     //   3441: iand
/*     */     //   3442: istore #127
/*     */     //   3444: nop
/*     */     //   3445: iconst_0
/*     */     //   3446: istore #128
/*     */     //   3448: aload #118
/*     */     //   3450: ldc -1323940314
/*     */     //   3452: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   3454: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   3457: aload #118
/*     */     //   3459: iconst_0
/*     */     //   3460: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   3463: istore #129
/*     */     //   3465: aload #118
/*     */     //   3467: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   3472: astore #130
/*     */     //   3474: aload #118
/*     */     //   3476: aload #121
/*     */     //   3478: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   3481: astore #131
/*     */     //   3483: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3486: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   3489: astore #132
/*     */     //   3491: bipush #6
/*     */     //   3493: sipush #896
/*     */     //   3496: iload #127
/*     */     //   3498: bipush #6
/*     */     //   3500: ishl
/*     */     //   3501: iand
/*     */     //   3502: ior
/*     */     //   3503: istore #133
/*     */     //   3505: nop
/*     */     //   3506: iconst_0
/*     */     //   3507: istore #134
/*     */     //   3509: aload #118
/*     */     //   3511: ldc -692256719
/*     */     //   3513: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   3515: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   3518: aload #118
/*     */     //   3520: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   3525: instanceof androidx/compose/runtime/Applier
/*     */     //   3528: ifne -> 3534
/*     */     //   3531: invokestatic invalidApplier : ()V
/*     */     //   3534: aload #118
/*     */     //   3536: invokeinterface startReusableNode : ()V
/*     */     //   3541: aload #118
/*     */     //   3543: invokeinterface getInserting : ()Z
/*     */     //   3548: ifeq -> 3563
/*     */     //   3551: aload #118
/*     */     //   3553: aload #132
/*     */     //   3555: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   3560: goto -> 3570
/*     */     //   3563: aload #118
/*     */     //   3565: invokeinterface useNode : ()V
/*     */     //   3570: aload #118
/*     */     //   3572: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   3575: astore #135
/*     */     //   3577: iconst_0
/*     */     //   3578: istore #136
/*     */     //   3580: aload #135
/*     */     //   3582: aload #126
/*     */     //   3584: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3587: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3590: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3593: aload #135
/*     */     //   3595: aload #130
/*     */     //   3597: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3600: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3603: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3606: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3609: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3612: astore #137
/*     */     //   3614: iconst_0
/*     */     //   3615: istore #138
/*     */     //   3617: aload #135
/*     */     //   3619: astore #139
/*     */     //   3621: iconst_0
/*     */     //   3622: istore #140
/*     */     //   3624: aload #139
/*     */     //   3626: invokeinterface getInserting : ()Z
/*     */     //   3631: ifne -> 3652
/*     */     //   3634: aload #139
/*     */     //   3636: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   3641: iload #129
/*     */     //   3643: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3646: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   3649: ifne -> 3678
/*     */     //   3652: aload #139
/*     */     //   3654: iload #129
/*     */     //   3656: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3659: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   3664: aload #135
/*     */     //   3666: iload #129
/*     */     //   3668: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3671: aload #137
/*     */     //   3673: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3678: nop
/*     */     //   3679: nop
/*     */     //   3680: nop
/*     */     //   3681: aload #135
/*     */     //   3683: aload #131
/*     */     //   3685: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3688: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3691: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3694: nop
/*     */     //   3695: nop
/*     */     //   3696: aload #118
/*     */     //   3698: bipush #14
/*     */     //   3700: iload #133
/*     */     //   3702: bipush #6
/*     */     //   3704: ishr
/*     */     //   3705: iand
/*     */     //   3706: istore #141
/*     */     //   3708: astore #142
/*     */     //   3710: iconst_0
/*     */     //   3711: istore #143
/*     */     //   3713: aload #142
/*     */     //   3715: ldc_w -407840262
/*     */     //   3718: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   3721: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   3724: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   3727: aload #142
/*     */     //   3729: bipush #6
/*     */     //   3731: bipush #112
/*     */     //   3733: iload #124
/*     */     //   3735: bipush #6
/*     */     //   3737: ishr
/*     */     //   3738: iand
/*     */     //   3739: ior
/*     */     //   3740: istore #144
/*     */     //   3742: astore #145
/*     */     //   3744: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   3747: astore #146
/*     */     //   3749: iconst_0
/*     */     //   3750: istore #147
/*     */     //   3752: ldc_w 'PLAN'
/*     */     //   3755: aconst_null
/*     */     //   3756: lconst_0
/*     */     //   3757: lconst_0
/*     */     //   3758: aconst_null
/*     */     //   3759: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
/*     */     //   3762: invokevirtual getBold : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   3765: aconst_null
/*     */     //   3766: lconst_0
/*     */     //   3767: aconst_null
/*     */     //   3768: iconst_0
/*     */     //   3769: lconst_0
/*     */     //   3770: iconst_0
/*     */     //   3771: iconst_0
/*     */     //   3772: iconst_0
/*     */     //   3773: aconst_null
/*     */     //   3774: aconst_null
/*     */     //   3775: aload #145
/*     */     //   3777: ldc_w 196614
/*     */     //   3780: iconst_0
/*     */     //   3781: ldc_w 65502
/*     */     //   3784: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   3787: aload #9
/*     */     //   3789: invokestatic TaskRecap$lambda$1 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   3792: aload #145
/*     */     //   3794: ldc_w 703505262
/*     */     //   3797: invokeinterface startReplaceGroup : (I)V
/*     */     //   3802: aload #145
/*     */     //   3804: astore #148
/*     */     //   3806: aload #145
/*     */     //   3808: aload #65
/*     */     //   3810: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   3815: istore #149
/*     */     //   3817: nop
/*     */     //   3818: iconst_0
/*     */     //   3819: istore #150
/*     */     //   3821: aload #148
/*     */     //   3823: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   3828: astore #151
/*     */     //   3830: iconst_0
/*     */     //   3831: istore #152
/*     */     //   3833: iload #149
/*     */     //   3835: ifne -> 3849
/*     */     //   3838: aload #151
/*     */     //   3840: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   3843: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   3846: if_acmpne -> 3888
/*     */     //   3849: istore #153
/*     */     //   3851: iconst_0
/*     */     //   3852: istore #154
/*     */     //   3854: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/ChainRecapKt$TaskRecap$2$2$1$2$1$1$1
/*     */     //   3857: dup
/*     */     //   3858: aload #65
/*     */     //   3860: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   3863: checkcast kotlin/reflect/KFunction
/*     */     //   3866: astore #155
/*     */     //   3868: iload #153
/*     */     //   3870: aload #155
/*     */     //   3872: astore #156
/*     */     //   3874: aload #148
/*     */     //   3876: aload #156
/*     */     //   3878: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   3883: aload #156
/*     */     //   3885: goto -> 3890
/*     */     //   3888: aload #151
/*     */     //   3890: nop
/*     */     //   3891: nop
/*     */     //   3892: nop
/*     */     //   3893: checkcast kotlin/reflect/KFunction
/*     */     //   3896: astore #157
/*     */     //   3898: aload #145
/*     */     //   3900: invokeinterface endReplaceGroup : ()V
/*     */     //   3905: aload #157
/*     */     //   3907: checkcast kotlin/jvm/functions/Function0
/*     */     //   3910: aconst_null
/*     */     //   3911: lconst_0
/*     */     //   3912: aconst_null
/*     */     //   3913: aconst_null
/*     */     //   3914: fconst_0
/*     */     //   3915: iconst_3
/*     */     //   3916: aconst_null
/*     */     //   3917: invokestatic fadeOut$default : (Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;
/*     */     //   3920: aload #145
/*     */     //   3922: ldc 196608
/*     */     //   3924: bipush #28
/*     */     //   3926: invokestatic CopyTextToClipboardButton-SBKQj6I : (ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/runtime/Composer;II)V
/*     */     //   3929: nop
/*     */     //   3930: aload #142
/*     */     //   3932: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3935: aload #118
/*     */     //   3937: invokeinterface endNode : ()V
/*     */     //   3942: aload #118
/*     */     //   3944: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3947: nop
/*     */     //   3948: aload #118
/*     */     //   3950: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3953: nop
/*     */     //   3954: aload #118
/*     */     //   3956: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3959: nop
/*     */     //   3960: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   3963: checkcast androidx/compose/ui/Modifier
/*     */     //   3966: fconst_0
/*     */     //   3967: iconst_1
/*     */     //   3968: aconst_null
/*     */     //   3969: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   3972: aload #118
/*     */     //   3974: iconst_0
/*     */     //   3975: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   3978: invokevirtual getSeparatorColor-0d7_KjU : ()J
/*     */     //   3981: aconst_null
/*     */     //   3982: iconst_2
/*     */     //   3983: aconst_null
/*     */     //   3984: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   3987: iconst_1
/*     */     //   3988: istore #121
/*     */     //   3990: iconst_0
/*     */     //   3991: istore #122
/*     */     //   3993: iload #121
/*     */     //   3995: i2f
/*     */     //   3996: invokestatic constructor-impl : (F)F
/*     */     //   3999: invokestatic height-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   4002: aload #118
/*     */     //   4004: iconst_0
/*     */     //   4005: invokestatic Box : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   4008: nop
/*     */     //   4009: aload #115
/*     */     //   4011: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4014: aload #91
/*     */     //   4016: invokeinterface endNode : ()V
/*     */     //   4021: aload #91
/*     */     //   4023: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4026: nop
/*     */     //   4027: aload #91
/*     */     //   4029: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4032: nop
/*     */     //   4033: aload #91
/*     */     //   4035: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4038: nop
/*     */     //   4039: aconst_null
/*     */     //   4040: aload #65
/*     */     //   4042: invokevirtual getPlan : ()Ljava/util/List;
/*     */     //   4045: iload #4
/*     */     //   4047: aload #91
/*     */     //   4049: sipush #896
/*     */     //   4052: iload #8
/*     */     //   4054: bipush #6
/*     */     //   4056: ishr
/*     */     //   4057: iand
/*     */     //   4058: iconst_1
/*     */     //   4059: invokestatic Plan : (Landroidx/compose/ui/Modifier;Ljava/util/List;ZLandroidx/compose/runtime/Composer;II)V
/*     */     //   4062: aload #91
/*     */     //   4064: invokeinterface endReplaceGroup : ()V
/*     */     //   4069: goto -> 4089
/*     */     //   4072: aload #91
/*     */     //   4074: ldc_w 544357581
/*     */     //   4077: invokeinterface startReplaceGroup : (I)V
/*     */     //   4082: aload #91
/*     */     //   4084: invokeinterface endReplaceGroup : ()V
/*     */     //   4089: nop
/*     */     //   4090: aload #88
/*     */     //   4092: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4095: aload #61
/*     */     //   4097: invokeinterface endNode : ()V
/*     */     //   4102: aload #61
/*     */     //   4104: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4107: nop
/*     */     //   4108: aload #61
/*     */     //   4110: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4113: nop
/*     */     //   4114: aload #61
/*     */     //   4116: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4119: nop
/*     */     //   4120: aload #66
/*     */     //   4122: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Report
/*     */     //   4125: ifeq -> 4169
/*     */     //   4128: aload #66
/*     */     //   4130: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Report
/*     */     //   4133: invokevirtual getDescription : ()Ljava/lang/String;
/*     */     //   4136: checkcast java/lang/CharSequence
/*     */     //   4139: invokeinterface length : ()I
/*     */     //   4144: ifle -> 4151
/*     */     //   4147: iconst_1
/*     */     //   4148: goto -> 4152
/*     */     //   4151: iconst_0
/*     */     //   4152: ifeq -> 4169
/*     */     //   4155: aload #66
/*     */     //   4157: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Report
/*     */     //   4160: invokevirtual getDescription : ()Ljava/lang/String;
/*     */     //   4163: aload #61
/*     */     //   4165: iconst_0
/*     */     //   4166: invokestatic TextContainer : (Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
/*     */     //   4169: aload #61
/*     */     //   4171: invokeinterface endReplaceGroup : ()V
/*     */     //   4176: nop
/*     */     //   4177: aload #58
/*     */     //   4179: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4182: aload #34
/*     */     //   4184: invokeinterface endNode : ()V
/*     */     //   4189: aload #34
/*     */     //   4191: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4194: nop
/*     */     //   4195: aload #34
/*     */     //   4197: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4200: nop
/*     */     //   4201: aload #34
/*     */     //   4203: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4206: nop
/*     */     //   4207: nop
/*     */     //   4208: aload #31
/*     */     //   4210: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4213: aload #6
/*     */     //   4215: invokeinterface endNode : ()V
/*     */     //   4220: aload #6
/*     */     //   4222: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4225: nop
/*     */     //   4226: aload #6
/*     */     //   4228: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4231: nop
/*     */     //   4232: aload #6
/*     */     //   4234: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4237: nop
/*     */     //   4238: invokestatic isTraceInProgress : ()Z
/*     */     //   4241: ifeq -> 4257
/*     */     //   4244: invokestatic traceEventEnd : ()V
/*     */     //   4247: goto -> 4257
/*     */     //   4250: aload #6
/*     */     //   4252: invokeinterface skipToGroupEnd : ()V
/*     */     //   4257: aload #6
/*     */     //   4259: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   4264: dup
/*     */     //   4265: ifnull -> 4291
/*     */     //   4268: aload_0
/*     */     //   4269: aload_1
/*     */     //   4270: aload_2
/*     */     //   4271: iload_3
/*     */     //   4272: iload #4
/*     */     //   4274: aload #5
/*     */     //   4276: iload #7
/*     */     //   4278: <illegal opcode> invoke : (Landroidx/compose/foundation/layout/ColumnScope;Ljava/util/Map;Lkotlin/jvm/functions/Function1;IZLcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;I)Lkotlin/jvm/functions/Function2;
/*     */     //   4283: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   4288: goto -> 4292
/*     */     //   4291: pop
/*     */     //   4292: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #45	-> 25
/*     */     //   #46	-> 258
/*     */     //   #133	-> 262
/*     */     //   #134	-> 274
/*     */     //   #135	-> 285
/*     */     //   #46	-> 288
/*     */     //   #135	-> 298
/*     */     //   #136	-> 300
/*     */     //   #137	-> 309
/*     */     //   #138	-> 314
/*     */     //   #134	-> 316
/*     */     //   #133	-> 317
/*     */     //   #133	-> 318
/*     */     //   #46	-> 319
/*     */     //   #49	-> 335
/*     */     //   #139	-> 360
/*     */     //   #140	-> 372
/*     */     //   #141	-> 383
/*     */     //   #49	-> 388
/*     */     //   #141	-> 398
/*     */     //   #142	-> 400
/*     */     //   #143	-> 409
/*     */     //   #144	-> 414
/*     */     //   #140	-> 416
/*     */     //   #139	-> 417
/*     */     //   #139	-> 418
/*     */     //   #49	-> 419
/*     */     //   #50	-> 438
/*     */     //   #145	-> 447
/*     */     //   #50	-> 453
/*     */     //   #48	-> 465
/*     */     //   #146	-> 475
/*     */     //   #147	-> 478
/*     */     //   #150	-> 486
/*     */     //   #151	-> 521
/*     */     //   #152	-> 531
/*     */     //   #153	-> 537
/*     */     //   #154	-> 544
/*     */     //   #155	-> 553
/*     */     //   #157	-> 560
/*     */     //   #156	-> 582
/*     */     //   #158	-> 592
/*     */     //   #159	-> 595
/*     */     //   #160	-> 613
/*     */     //   #161	-> 618
/*     */     //   #162	-> 630
/*     */     //   #164	-> 642
/*     */     //   #166	-> 647
/*     */     //   #167	-> 657
/*     */     //   #168	-> 670
/*     */     //   #170	-> 683
/*     */     //   #171	-> 694
/*     */     //   #172	-> 701
/*     */     //   #173	-> 729
/*     */     //   #174	-> 741
/*     */     //   #176	-> 755
/*     */     //   #171	-> 756
/*     */     //   #176	-> 757
/*     */     //   #177	-> 758
/*     */     //   #178	-> 771
/*     */     //   #166	-> 772
/*     */     //   #179	-> 773
/*     */     //   #180	-> 798
/*     */     //   #52	-> 829
/*     */     //   #181	-> 842
/*     */     //   #52	-> 848
/*     */     //   #181	-> 863
/*     */     //   #52	-> 869
/*     */     //   #182	-> 892
/*     */     //   #183	-> 895
/*     */     //   #186	-> 903
/*     */     //   #187	-> 938
/*     */     //   #188	-> 948
/*     */     //   #189	-> 954
/*     */     //   #190	-> 961
/*     */     //   #191	-> 970
/*     */     //   #193	-> 977
/*     */     //   #192	-> 999
/*     */     //   #194	-> 1009
/*     */     //   #195	-> 1012
/*     */     //   #196	-> 1030
/*     */     //   #197	-> 1035
/*     */     //   #198	-> 1047
/*     */     //   #200	-> 1059
/*     */     //   #202	-> 1064
/*     */     //   #203	-> 1074
/*     */     //   #204	-> 1087
/*     */     //   #206	-> 1100
/*     */     //   #207	-> 1111
/*     */     //   #208	-> 1118
/*     */     //   #209	-> 1146
/*     */     //   #210	-> 1158
/*     */     //   #212	-> 1172
/*     */     //   #207	-> 1173
/*     */     //   #212	-> 1174
/*     */     //   #213	-> 1175
/*     */     //   #214	-> 1188
/*     */     //   #202	-> 1189
/*     */     //   #215	-> 1190
/*     */     //   #216	-> 1215
/*     */     //   #54	-> 1256
/*     */     //   #55	-> 1271
/*     */     //   #217	-> 1285
/*     */     //   #56	-> 1326
/*     */     //   #218	-> 1385
/*     */     //   #219	-> 1397
/*     */     //   #220	-> 1413
/*     */     //   #56	-> 1420
/*     */     //   #220	-> 1436
/*     */     //   #221	-> 1438
/*     */     //   #222	-> 1447
/*     */     //   #223	-> 1452
/*     */     //   #219	-> 1454
/*     */     //   #218	-> 1455
/*     */     //   #218	-> 1456
/*     */     //   #56	-> 1457
/*     */     //   #59	-> 1477
/*     */     //   #217	-> 1478
/*     */     //   #224	-> 1482
/*     */     //   #61	-> 1490
/*     */     //   #216	-> 1491
/*     */     //   #215	-> 1496
/*     */     //   #225	-> 1498
/*     */     //   #194	-> 1505
/*     */     //   #226	-> 1508
/*     */     //   #188	-> 1511
/*     */     //   #227	-> 1514
/*     */     //   #182	-> 1517
/*     */     //   #228	-> 1520
/*     */     //   #62	-> 1521
/*     */     //   #229	-> 1531
/*     */     //   #62	-> 1537
/*     */     //   #230	-> 1560
/*     */     //   #231	-> 1563
/*     */     //   #233	-> 1571
/*     */     //   #236	-> 1579
/*     */     //   #237	-> 1614
/*     */     //   #238	-> 1624
/*     */     //   #239	-> 1630
/*     */     //   #240	-> 1637
/*     */     //   #241	-> 1646
/*     */     //   #243	-> 1653
/*     */     //   #242	-> 1675
/*     */     //   #244	-> 1685
/*     */     //   #245	-> 1688
/*     */     //   #246	-> 1706
/*     */     //   #247	-> 1711
/*     */     //   #248	-> 1723
/*     */     //   #250	-> 1735
/*     */     //   #252	-> 1740
/*     */     //   #253	-> 1750
/*     */     //   #254	-> 1763
/*     */     //   #256	-> 1776
/*     */     //   #257	-> 1787
/*     */     //   #258	-> 1794
/*     */     //   #259	-> 1822
/*     */     //   #260	-> 1834
/*     */     //   #262	-> 1848
/*     */     //   #257	-> 1849
/*     */     //   #262	-> 1850
/*     */     //   #263	-> 1851
/*     */     //   #264	-> 1864
/*     */     //   #252	-> 1865
/*     */     //   #265	-> 1866
/*     */     //   #266	-> 1891
/*     */     //   #64	-> 1922
/*     */     //   #65	-> 1937
/*     */     //   #66	-> 1953
/*     */     //   #67	-> 1979
/*     */     //   #68	-> 1984
/*     */     //   #70	-> 1998
/*     */     //   #267	-> 2008
/*     */     //   #70	-> 2014
/*     */     //   #71	-> 2022
/*     */     //   #69	-> 2035
/*     */     //   #268	-> 2047
/*     */     //   #269	-> 2050
/*     */     //   #274	-> 2058
/*     */     //   #275	-> 2093
/*     */     //   #276	-> 2103
/*     */     //   #277	-> 2109
/*     */     //   #278	-> 2116
/*     */     //   #279	-> 2125
/*     */     //   #281	-> 2132
/*     */     //   #280	-> 2154
/*     */     //   #282	-> 2164
/*     */     //   #283	-> 2167
/*     */     //   #284	-> 2185
/*     */     //   #285	-> 2190
/*     */     //   #286	-> 2202
/*     */     //   #288	-> 2214
/*     */     //   #290	-> 2219
/*     */     //   #291	-> 2229
/*     */     //   #292	-> 2242
/*     */     //   #294	-> 2255
/*     */     //   #295	-> 2266
/*     */     //   #296	-> 2273
/*     */     //   #297	-> 2301
/*     */     //   #298	-> 2313
/*     */     //   #300	-> 2327
/*     */     //   #295	-> 2328
/*     */     //   #300	-> 2329
/*     */     //   #301	-> 2330
/*     */     //   #302	-> 2343
/*     */     //   #290	-> 2344
/*     */     //   #303	-> 2345
/*     */     //   #304	-> 2370
/*     */     //   #73	-> 2401
/*     */     //   #74	-> 2424
/*     */     //   #305	-> 2436
/*     */     //   #306	-> 2439
/*     */     //   #307	-> 2447
/*     */     //   #308	-> 2455
/*     */     //   #311	-> 2463
/*     */     //   #312	-> 2498
/*     */     //   #313	-> 2508
/*     */     //   #314	-> 2514
/*     */     //   #315	-> 2521
/*     */     //   #316	-> 2530
/*     */     //   #318	-> 2537
/*     */     //   #317	-> 2559
/*     */     //   #319	-> 2569
/*     */     //   #320	-> 2572
/*     */     //   #321	-> 2590
/*     */     //   #322	-> 2595
/*     */     //   #323	-> 2607
/*     */     //   #325	-> 2619
/*     */     //   #327	-> 2624
/*     */     //   #328	-> 2634
/*     */     //   #329	-> 2647
/*     */     //   #331	-> 2660
/*     */     //   #332	-> 2671
/*     */     //   #333	-> 2678
/*     */     //   #334	-> 2706
/*     */     //   #335	-> 2718
/*     */     //   #337	-> 2732
/*     */     //   #332	-> 2733
/*     */     //   #337	-> 2734
/*     */     //   #338	-> 2735
/*     */     //   #339	-> 2748
/*     */     //   #327	-> 2749
/*     */     //   #340	-> 2750
/*     */     //   #341	-> 2775
/*     */     //   #75	-> 2806
/*     */     //   #76	-> 2841
/*     */     //   #342	-> 2874
/*     */     //   #76	-> 2880
/*     */     //   #77	-> 2889
/*     */     //   #341	-> 2890
/*     */     //   #340	-> 2895
/*     */     //   #343	-> 2897
/*     */     //   #319	-> 2904
/*     */     //   #344	-> 2907
/*     */     //   #313	-> 2910
/*     */     //   #345	-> 2913
/*     */     //   #305	-> 2916
/*     */     //   #346	-> 2919
/*     */     //   #73	-> 2920
/*     */     //   #78	-> 2930
/*     */     //   #79	-> 2960
/*     */     //   #347	-> 2972
/*     */     //   #348	-> 2975
/*     */     //   #349	-> 2983
/*     */     //   #350	-> 2991
/*     */     //   #353	-> 2999
/*     */     //   #354	-> 3034
/*     */     //   #355	-> 3044
/*     */     //   #356	-> 3050
/*     */     //   #357	-> 3057
/*     */     //   #358	-> 3066
/*     */     //   #360	-> 3073
/*     */     //   #359	-> 3095
/*     */     //   #361	-> 3105
/*     */     //   #362	-> 3108
/*     */     //   #363	-> 3126
/*     */     //   #364	-> 3131
/*     */     //   #365	-> 3143
/*     */     //   #367	-> 3155
/*     */     //   #369	-> 3160
/*     */     //   #370	-> 3170
/*     */     //   #371	-> 3183
/*     */     //   #373	-> 3196
/*     */     //   #374	-> 3207
/*     */     //   #375	-> 3214
/*     */     //   #376	-> 3242
/*     */     //   #377	-> 3254
/*     */     //   #379	-> 3268
/*     */     //   #374	-> 3269
/*     */     //   #379	-> 3270
/*     */     //   #380	-> 3271
/*     */     //   #381	-> 3284
/*     */     //   #369	-> 3285
/*     */     //   #382	-> 3286
/*     */     //   #383	-> 3311
/*     */     //   #82	-> 3342
/*     */     //   #83	-> 3348
/*     */     //   #84	-> 3354
/*     */     //   #384	-> 3361
/*     */     //   #84	-> 3367
/*     */     //   #85	-> 3372
/*     */     //   #86	-> 3383
/*     */     //   #80	-> 3396
/*     */     //   #385	-> 3406
/*     */     //   #386	-> 3409
/*     */     //   #387	-> 3444
/*     */     //   #388	-> 3454
/*     */     //   #389	-> 3460
/*     */     //   #390	-> 3467
/*     */     //   #391	-> 3476
/*     */     //   #393	-> 3483
/*     */     //   #392	-> 3505
/*     */     //   #394	-> 3515
/*     */     //   #395	-> 3518
/*     */     //   #396	-> 3536
/*     */     //   #397	-> 3541
/*     */     //   #398	-> 3553
/*     */     //   #400	-> 3565
/*     */     //   #402	-> 3570
/*     */     //   #403	-> 3580
/*     */     //   #404	-> 3593
/*     */     //   #406	-> 3606
/*     */     //   #407	-> 3617
/*     */     //   #408	-> 3624
/*     */     //   #409	-> 3652
/*     */     //   #410	-> 3664
/*     */     //   #412	-> 3678
/*     */     //   #407	-> 3679
/*     */     //   #412	-> 3680
/*     */     //   #413	-> 3681
/*     */     //   #414	-> 3694
/*     */     //   #402	-> 3695
/*     */     //   #415	-> 3696
/*     */     //   #416	-> 3721
/*     */     //   #88	-> 3752
/*     */     //   #90	-> 3787
/*     */     //   #91	-> 3817
/*     */     //   #417	-> 3821
/*     */     //   #418	-> 3833
/*     */     //   #419	-> 3849
/*     */     //   #91	-> 3854
/*     */     //   #419	-> 3872
/*     */     //   #420	-> 3874
/*     */     //   #421	-> 3883
/*     */     //   #422	-> 3888
/*     */     //   #418	-> 3890
/*     */     //   #417	-> 3891
/*     */     //   #417	-> 3892
/*     */     //   #91	-> 3893
/*     */     //   #92	-> 3913
/*     */     //   #89	-> 3926
/*     */     //   #94	-> 3929
/*     */     //   #416	-> 3930
/*     */     //   #415	-> 3935
/*     */     //   #423	-> 3937
/*     */     //   #394	-> 3944
/*     */     //   #424	-> 3947
/*     */     //   #388	-> 3950
/*     */     //   #425	-> 3953
/*     */     //   #385	-> 3956
/*     */     //   #426	-> 3959
/*     */     //   #95	-> 3960
/*     */     //   #427	-> 3993
/*     */     //   #95	-> 3999
/*     */     //   #96	-> 4008
/*     */     //   #383	-> 4009
/*     */     //   #382	-> 4014
/*     */     //   #428	-> 4016
/*     */     //   #361	-> 4023
/*     */     //   #429	-> 4026
/*     */     //   #355	-> 4029
/*     */     //   #430	-> 4032
/*     */     //   #347	-> 4035
/*     */     //   #431	-> 4038
/*     */     //   #98	-> 4040
/*     */     //   #97	-> 4059
/*     */     //   #78	-> 4062
/*     */     //   #100	-> 4072
/*     */     //   #101	-> 4089
/*     */     //   #304	-> 4090
/*     */     //   #303	-> 4095
/*     */     //   #432	-> 4097
/*     */     //   #282	-> 4104
/*     */     //   #433	-> 4107
/*     */     //   #276	-> 4110
/*     */     //   #434	-> 4113
/*     */     //   #268	-> 4116
/*     */     //   #435	-> 4119
/*     */     //   #102	-> 4120
/*     */     //   #102	-> 4152
/*     */     //   #103	-> 4155
/*     */     //   #106	-> 4176
/*     */     //   #266	-> 4177
/*     */     //   #265	-> 4182
/*     */     //   #436	-> 4184
/*     */     //   #244	-> 4191
/*     */     //   #437	-> 4194
/*     */     //   #238	-> 4197
/*     */     //   #438	-> 4200
/*     */     //   #230	-> 4203
/*     */     //   #439	-> 4206
/*     */     //   #107	-> 4207
/*     */     //   #180	-> 4208
/*     */     //   #179	-> 4213
/*     */     //   #440	-> 4215
/*     */     //   #158	-> 4222
/*     */     //   #441	-> 4225
/*     */     //   #152	-> 4228
/*     */     //   #442	-> 4231
/*     */     //   #146	-> 4234
/*     */     //   #443	-> 4237
/*     */     //   #108	-> 4250
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   288	10	16	$i$a$-cache-ChainRecapKt$TaskRecap$isMouseHovering$2	I
/*     */     //   300	11	16	value$iv	Ljava/lang/Object;
/*     */     //   274	43	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   271	46	14	it$iv	Ljava/lang/Object;
/*     */     //   262	57	13	$i$f$cache	I
/*     */     //   259	60	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   259	60	12	invalid$iv	Z
/*     */     //   388	7	16	$i$a$-cache-ChainRecapKt$TaskRecap$1	I
/*     */     //   400	11	17	value$iv	Ljava/lang/Object;
/*     */     //   372	45	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   369	48	14	it$iv	Ljava/lang/Object;
/*     */     //   360	59	13	$i$f$cache	I
/*     */     //   357	62	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   357	62	12	invalid$iv	Z
/*     */     //   447	6	12	$i$f$getDp	I
/*     */     //   444	9	11	$this$dp$iv	I
/*     */     //   842	6	38	$i$f$getDp	I
/*     */     //   839	9	37	$this$dp$iv	I
/*     */     //   863	6	39	$i$f$getDp	I
/*     */     //   860	9	38	$this$dp$iv	I
/*     */     //   1420	8	77	$i$a$-cache-ChainRecapKt$TaskRecap$2$1$1$1	I
/*     */     //   1438	11	79	value$iv	Ljava/lang/Object;
/*     */     //   1397	58	74	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1394	61	73	it$iv	Ljava/lang/Object;
/*     */     //   1385	72	72	$i$f$cache	I
/*     */     //   1382	75	70	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1382	75	71	invalid$iv	Z
/*     */     //   1326	152	69	$i$a$-forEach-ChainRecapKt$TaskRecap$2$1$1	I
/*     */     //   1323	155	68	it	I
/*     */     //   1313	166	67	element$iv	Ljava/lang/Object;
/*     */     //   1285	198	65	$i$f$forEach	I
/*     */     //   1282	201	64	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   1246	245	63	$i$a$-Column-ChainRecapKt$TaskRecap$2$1	I
/*     */     //   1243	248	62	$this$TaskRecap_u24lambda_u2415_u24lambda_u248	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   1243	248	61	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1243	248	60	$changed	I
/*     */     //   1207	289	59	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   1204	292	58	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1204	292	57	$changed$iv	I
/*     */     //   1118	55	56	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1115	58	55	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1111	64	54	$i$f$set-impl	I
/*     */     //   1108	67	53	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1074	115	52	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1071	118	51	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1003	506	50	$i$f$ReusableComposeNode	I
/*     */     //   1000	509	48	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1000	509	49	$changed$iv$iv$iv	I
/*     */     //   942	573	44	$i$f$Layout	I
/*     */     //   959	556	45	compositeKeyHash$iv$iv	I
/*     */     //   968	547	46	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   977	538	47	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   939	576	43	$changed$iv$iv	I
/*     */     //   884	637	41	$i$f$Column	I
/*     */     //   929	592	42	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   881	640	37	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   881	640	38	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   903	618	39	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   881	640	40	$changed$iv	I
/*     */     //   1531	6	39	$i$f$getDp	I
/*     */     //   1528	9	38	$this$dp$iv	I
/*     */     //   2008	6	68	$i$f$getDp	I
/*     */     //   2005	9	67	$this$dp$iv	I
/*     */     //   2874	6	122	$i$f$getDp	I
/*     */     //   2871	9	121	$this$dp$iv	I
/*     */     //   2806	84	120	$i$a$-Column-ChainRecapKt$TaskRecap$2$2$1$1	I
/*     */     //   2803	87	119	$this$TaskRecap_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413_u24lambda_u249	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   2803	87	118	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   2803	87	117	$changed	I
/*     */     //   2767	128	116	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   2764	131	115	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2764	131	114	$changed$iv	I
/*     */     //   2678	55	113	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   2675	58	112	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2671	64	111	$i$f$set-impl	I
/*     */     //   2668	67	110	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   2634	115	109	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   2631	118	108	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2563	345	107	$i$f$ReusableComposeNode	I
/*     */     //   2560	348	105	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   2560	348	106	$changed$iv$iv$iv	I
/*     */     //   2502	412	101	$i$f$Layout	I
/*     */     //   2519	395	102	compositeKeyHash$iv$iv	I
/*     */     //   2528	386	103	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   2537	377	104	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2499	415	100	$changed$iv$iv	I
/*     */     //   2428	492	95	$i$f$Column	I
/*     */     //   2489	431	99	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2447	473	96	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2455	465	97	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   2463	457	98	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   2425	495	94	$changed$iv	I
/*     */     //   3361	6	122	$i$f$getDp	I
/*     */     //   3358	9	121	$this$dp$iv	I
/*     */     //   3854	12	154	$i$a$-cache-ChainRecapKt$TaskRecap$2$2$1$2$1$1	I
/*     */     //   3874	11	156	value$iv	Ljava/lang/Object;
/*     */     //   3833	58	152	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   3830	61	151	it$iv	Ljava/lang/Object;
/*     */     //   3821	72	150	$i$f$cache	I
/*     */     //   3818	75	148	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3818	75	149	invalid$iv	Z
/*     */     //   3752	178	147	$i$a$-Row-ChainRecapKt$TaskRecap$2$2$1$2$1	I
/*     */     //   3749	181	146	$this$TaskRecap_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413_u24lambda_u2412_u24lambda_u2411	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   3749	181	145	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   3749	181	144	$changed	I
/*     */     //   3713	222	143	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   3710	225	142	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3710	225	141	$changed$iv	I
/*     */     //   3624	55	140	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   3621	58	139	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3617	64	138	$i$f$set-impl	I
/*     */     //   3614	67	137	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   3580	115	136	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   3577	118	135	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3509	439	134	$i$f$ReusableComposeNode	I
/*     */     //   3506	442	132	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   3506	442	133	$changed$iv$iv$iv	I
/*     */     //   3448	506	128	$i$f$Layout	I
/*     */     //   3465	489	129	compositeKeyHash$iv$iv	I
/*     */     //   3474	480	130	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   3483	471	131	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   3445	509	127	$changed$iv$iv	I
/*     */     //   3400	560	125	$i$f$Row	I
/*     */     //   3435	525	126	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   3397	563	121	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   3397	563	122	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   3397	563	123	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   3397	563	124	$changed$iv	I
/*     */     //   3993	6	122	$i$f$getDp	I
/*     */     //   3990	9	121	$this$dp$iv	I
/*     */     //   3342	667	120	$i$a$-Column-ChainRecapKt$TaskRecap$2$2$1$2	I
/*     */     //   3339	670	119	$this$TaskRecap_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413_u24lambda_u2412	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   3339	670	118	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   3339	670	117	$changed	I
/*     */     //   3303	711	116	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   3300	714	115	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3300	714	114	$changed$iv	I
/*     */     //   3214	55	113	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   3211	58	112	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3207	64	111	$i$f$set-impl	I
/*     */     //   3204	67	110	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   3170	115	109	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   3167	118	108	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3099	928	107	$i$f$ReusableComposeNode	I
/*     */     //   3096	931	105	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   3096	931	106	$changed$iv$iv$iv	I
/*     */     //   3038	995	101	$i$f$Layout	I
/*     */     //   3055	978	102	compositeKeyHash$iv$iv	I
/*     */     //   3064	969	103	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   3073	960	104	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   3035	998	100	$changed$iv$iv	I
/*     */     //   2964	1075	95	$i$f$Column	I
/*     */     //   3025	1014	99	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2983	1056	96	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2991	1048	97	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   2999	1040	98	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   2961	1078	94	$changed$iv	I
/*     */     //   2401	1689	93	$i$a$-Column-ChainRecapKt$TaskRecap$2$2$1	I
/*     */     //   2398	1692	92	$this$TaskRecap_u24lambda_u2415_u24lambda_u2414_u24lambda_u2413	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   2398	1692	91	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   2398	1692	90	$changed	I
/*     */     //   2362	1733	89	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   2359	1736	88	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2359	1736	87	$changed$iv	I
/*     */     //   2273	55	86	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   2270	58	85	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2266	64	84	$i$f$set-impl	I
/*     */     //   2263	67	83	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   2229	115	82	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   2226	118	81	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2158	1950	80	$i$f$ReusableComposeNode	I
/*     */     //   2155	1953	78	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   2155	1953	79	$changed$iv$iv$iv	I
/*     */     //   2097	2017	74	$i$f$Layout	I
/*     */     //   2114	2000	75	compositeKeyHash$iv$iv	I
/*     */     //   2123	1991	76	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   2132	1982	77	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2094	2020	73	$changed$iv$iv	I
/*     */     //   2039	2081	70	$i$f$Column	I
/*     */     //   2084	2036	72	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2058	2062	71	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2036	2084	67	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   2036	2084	68	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   2036	2084	69	$changed$iv	I
/*     */     //   1922	2255	63	$i$a$-Column-ChainRecapKt$TaskRecap$2$2	I
/*     */     //   1937	2240	64	selectedRecap	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskRecapModel;
/*     */     //   1953	2224	65	plan	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Plan;
/*     */     //   1969	2208	66	recap	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep;
/*     */     //   1919	2258	62	$this$TaskRecap_u24lambda_u2415_u24lambda_u2414	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   1919	2258	61	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1919	2258	60	$changed	I
/*     */     //   1883	2299	59	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   1880	2302	58	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1880	2302	57	$changed$iv	I
/*     */     //   1794	55	56	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1791	58	55	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1787	64	54	$i$f$set-impl	I
/*     */     //   1784	67	53	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1750	115	52	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1747	118	51	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1679	2516	50	$i$f$ReusableComposeNode	I
/*     */     //   1676	2519	48	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1676	2519	49	$changed$iv$iv$iv	I
/*     */     //   1618	2583	44	$i$f$Layout	I
/*     */     //   1635	2566	45	compositeKeyHash$iv$iv	I
/*     */     //   1644	2557	46	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1653	2548	47	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1615	2586	43	$changed$iv$iv	I
/*     */     //   1552	2655	41	$i$f$Column	I
/*     */     //   1605	2602	42	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1571	2636	37	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1549	2658	38	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   1579	2628	39	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   1549	2658	40	$changed$iv	I
/*     */     //   829	3379	36	$i$a$-Row-ChainRecapKt$TaskRecap$2	I
/*     */     //   826	3382	35	$this$TaskRecap_u24lambda_u2415	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   826	3382	34	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   826	3382	33	$changed	I
/*     */     //   790	3423	32	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   787	3426	31	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   787	3426	30	$changed$iv	I
/*     */     //   701	55	29	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   698	58	28	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   694	64	27	$i$f$set-impl	I
/*     */     //   691	67	26	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   657	115	25	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   654	118	24	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   586	3640	23	$i$f$ReusableComposeNode	I
/*     */     //   583	3643	21	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   583	3643	22	$changed$iv$iv$iv	I
/*     */     //   525	3707	17	$i$f$Layout	I
/*     */     //   542	3690	18	compositeKeyHash$iv$iv	I
/*     */     //   551	3681	19	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   560	3672	20	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   522	3710	16	$changed$iv$iv	I
/*     */     //   469	3769	14	$i$f$Row	I
/*     */     //   512	3726	15	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   466	3772	10	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   466	3772	11	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   486	3752	12	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   466	3772	13	$changed$iv	I
/*     */     //   335	3912	9	isMouseHovering$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   40	4253	8	$dirty	I
/*     */     //   0	4293	0	$this$TaskRecap	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   0	4293	1	recap	Ljava/util/Map;
/*     */     //   0	4293	2	onTaskSelectionChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	4293	3	selectedTaskIndex	I
/*     */     //   0	4293	4	isChainRunning	Z
/*     */     //   0	4293	5	promptMode	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;
/*     */     //   0	4293	6	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	4293	7	$changed	I
/*     */   }
/*     */   
/*     */   private static final boolean TaskRecap$lambda$1(MutableState $isMouseHovering$delegate) {
/*  46 */     State state = (State)$isMouseHovering$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 445 */       (Boolean)state.getValue()).booleanValue(); } private static final void TaskRecap$lambda$2(MutableState $isMouseHovering$delegate, boolean <set-?>) { MutableState mutableState = $isMouseHovering$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 446 */     mutableState.setValue(value$iv); }
/*     */ 
/*     */   
/*     */   private static final Unit TaskRecap$lambda$4$lambda$3(MutableState<Boolean> $isMouseHovering$delegate, boolean it) {
/*     */     TaskRecap$lambda$2($isMouseHovering$delegate, it);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit TaskRecap$lambda$15$lambda$8$lambda$7$lambda$6$lambda$5(Function1 $onTaskSelectionChange, int $it) {
/*     */     $onTaskSelectionChange.invoke(Integer.valueOf($it));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final boolean shouldShowPlanning(TaskRecapModel recap, PromptMode promptMode) {
/*     */     if (recap.getResult() == null) {
/*     */       recap.getPlan();
/*     */       if (((recap.getPlan() != null) ? recap.getPlan().getPlan() : null) == null && promptMode == PromptMode.Agent);
/*     */     } 
/*     */     return false;
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void PlanIndexButton(int taskIndex, boolean selected, @NotNull Function0 onTaskSelect, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc_w 'onTaskSelect'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_3
/*     */     //   8: ldc_w 1093934732
/*     */     //   11: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   16: astore_3
/*     */     //   17: iload #4
/*     */     //   19: istore #5
/*     */     //   21: iload #4
/*     */     //   23: bipush #6
/*     */     //   25: iand
/*     */     //   26: ifne -> 49
/*     */     //   29: iload #5
/*     */     //   31: aload_3
/*     */     //   32: iload_0
/*     */     //   33: invokeinterface changed : (I)Z
/*     */     //   38: ifeq -> 45
/*     */     //   41: iconst_4
/*     */     //   42: goto -> 46
/*     */     //   45: iconst_2
/*     */     //   46: ior
/*     */     //   47: istore #5
/*     */     //   49: iload #4
/*     */     //   51: bipush #48
/*     */     //   53: iand
/*     */     //   54: ifne -> 79
/*     */     //   57: iload #5
/*     */     //   59: aload_3
/*     */     //   60: iload_1
/*     */     //   61: invokeinterface changed : (Z)Z
/*     */     //   66: ifeq -> 74
/*     */     //   69: bipush #32
/*     */     //   71: goto -> 76
/*     */     //   74: bipush #16
/*     */     //   76: ior
/*     */     //   77: istore #5
/*     */     //   79: iload #4
/*     */     //   81: sipush #384
/*     */     //   84: iand
/*     */     //   85: ifne -> 112
/*     */     //   88: iload #5
/*     */     //   90: aload_3
/*     */     //   91: aload_2
/*     */     //   92: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   97: ifeq -> 106
/*     */     //   100: sipush #256
/*     */     //   103: goto -> 109
/*     */     //   106: sipush #128
/*     */     //   109: ior
/*     */     //   110: istore #5
/*     */     //   112: iload #5
/*     */     //   114: sipush #147
/*     */     //   117: iand
/*     */     //   118: sipush #146
/*     */     //   121: if_icmpne -> 133
/*     */     //   124: aload_3
/*     */     //   125: invokeinterface getSkipping : ()Z
/*     */     //   130: ifne -> 244
/*     */     //   133: invokestatic isTraceInProgress : ()Z
/*     */     //   136: ifeq -> 151
/*     */     //   139: ldc_w 1093934732
/*     */     //   142: iload #5
/*     */     //   144: iconst_m1
/*     */     //   145: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.PlanIndexButton (ChainRecap.kt:117)'
/*     */     //   148: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   151: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   154: checkcast androidx/compose/ui/Modifier
/*     */     //   157: iconst_2
/*     */     //   158: istore #7
/*     */     //   160: iconst_0
/*     */     //   161: istore #8
/*     */     //   163: iload #7
/*     */     //   165: i2f
/*     */     //   166: invokestatic constructor-impl : (F)F
/*     */     //   169: invokestatic padding-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   172: bipush #100
/*     */     //   174: invokestatic RoundedCornerShape : (I)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   177: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   180: invokestatic clip : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*     */     //   183: astore #6
/*     */     //   185: aload_2
/*     */     //   186: aload #6
/*     */     //   188: iconst_0
/*     */     //   189: iconst_0
/*     */     //   190: aconst_null
/*     */     //   191: aconst_null
/*     */     //   192: ldc_w -2120813355
/*     */     //   195: iconst_1
/*     */     //   196: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/ChainRecapKt$PlanIndexButton$1
/*     */     //   199: dup
/*     */     //   200: iload_1
/*     */     //   201: iload_0
/*     */     //   202: invokespecial <init> : (ZI)V
/*     */     //   205: aload_3
/*     */     //   206: bipush #54
/*     */     //   208: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   211: checkcast kotlin/jvm/functions/Function4
/*     */     //   214: aload_3
/*     */     //   215: ldc_w 1572864
/*     */     //   218: bipush #14
/*     */     //   220: iload #5
/*     */     //   222: bipush #6
/*     */     //   224: ishr
/*     */     //   225: iand
/*     */     //   226: ior
/*     */     //   227: bipush #60
/*     */     //   229: invokestatic IconButton : (Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V
/*     */     //   232: invokestatic isTraceInProgress : ()Z
/*     */     //   235: ifeq -> 250
/*     */     //   238: invokestatic traceEventEnd : ()V
/*     */     //   241: goto -> 250
/*     */     //   244: aload_3
/*     */     //   245: invokeinterface skipToGroupEnd : ()V
/*     */     //   250: aload_3
/*     */     //   251: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   256: dup
/*     */     //   257: ifnull -> 278
/*     */     //   260: iload_0
/*     */     //   261: iload_1
/*     */     //   262: aload_2
/*     */     //   263: iload #4
/*     */     //   265: <illegal opcode> invoke : (IZLkotlin/jvm/functions/Function0;I)Lkotlin/jvm/functions/Function2;
/*     */     //   270: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   275: goto -> 279
/*     */     //   278: pop
/*     */     //   279: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #118	-> 7
/*     */     //   #121	-> 151
/*     */     //   #122	-> 157
/*     */     //   #444	-> 163
/*     */     //   #122	-> 169
/*     */     //   #123	-> 172
/*     */     //   #124	-> 185
/*     */     //   #123	-> 186
/*     */     //   #125	-> 192
/*     */     //   #119	-> 229
/*     */     //   #129	-> 244
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   163	6	8	$i$f$getDp	I
/*     */     //   160	9	7	$this$dp$iv	I
/*     */     //   21	259	5	$dirty	I
/*     */     //   0	280	0	taskIndex	I
/*     */     //   0	280	1	selected	Z
/*     */     //   0	280	2	onTaskSelect	Lkotlin/jvm/functions/Function0;
/*     */     //   0	280	3	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	280	4	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit TaskRecap$lambda$16(ColumnScope $this_TaskRecap, Map<Integer, TaskRecapModel> $recap, Function1<? super Integer, Unit> $onTaskSelectionChange, int $selectedTaskIndex, boolean $isChainRunning, PromptMode $promptMode, int $$changed, Composer $composer, int $force) {
/*     */     TaskRecap($this_TaskRecap, $recap, $onTaskSelectionChange, $selectedTaskIndex, $isChainRunning, $promptMode, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit PlanIndexButton$lambda$17(int $taskIndex, boolean $selected, Function0<Unit> $onTaskSelect, int $$changed, Composer $composer, int $force) {
/*     */     PlanIndexButton($taskIndex, $selected, $onTaskSelect, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ChainRecapKt$PlanIndexButton$1 implements Function4<BoxScope, IconButtonState, Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke-KMTpdl8(BoxScope $this$IconButton, long it, Composer $composer, int $changed) {
/*     */       Intrinsics.checkNotNullParameter($this$IconButton, "$this$IconButton");
/*     */       if (($changed & 0x81) != 128 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(-2120813355, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.PlanIndexButton.<anonymous> (ChainRecap.kt:125)"); 
/*     */         $composer.startReplaceGroup(177166624);
/*     */         long l1 = this.$selected ? MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getOnboardingDotsColor-0d7_KjU() : Color.Companion.getUnspecified-0d7_KjU();
/*     */         $composer.endReplaceGroup();
/*     */         long color = l1;
/*     */         TextKt.Text-bAzTDeA(String.valueOf(this.$taskIndex + 1), null, color, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, $composer, 0, 0, 65530);
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd(); 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */     
/*     */     ChainRecapKt$PlanIndexButton$1(boolean $selected, int $taskIndex) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\ChainRecapKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */