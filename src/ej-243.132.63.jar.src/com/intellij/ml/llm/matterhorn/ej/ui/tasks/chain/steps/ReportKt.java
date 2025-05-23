/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*     */ 
/*     */ import androidx.compose.foundation.layout.ColumnScope;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.FileChangeView;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskStep;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\0006\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\"\032\035\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\001¢\006\002\020\006\032I\020\007\032\0020\0012\f\020\b\032\b\022\004\022\0020\n0\t2\006\020\013\032\0020\0052\006\020\004\032\0020\0052\034\020\f\032\030\b\001\022\n\022\b\022\004\022\0020\0010\016\022\006\022\004\030\0010\0170\rH\001¢\006\002\020\020¨\006\021²\006\020\020\022\032\b\022\004\022\0020\n0\023X\002"}, d2 = {"ReportStep", "", "report", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Report;", "isProjectOnVCS", "", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Report;ZLandroidx/compose/runtime/Composer;I)V", "FileReport", "changes", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;", "wantEditableDiff", "onChangeAllVcsStatus", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Ljava/util/List;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ej-ui", "commitedFiles", ""})
/*     */ @SourceDebugExtension({"SMAP\nReport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Report.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 10 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,185:1\n3193#2,10:186\n1863#2:290\n1864#2:309\n1863#2:454\n1864#2:473\n1225#3,6:196\n1225#3,6:202\n1225#3,6:208\n1225#3,6:291\n1225#3,6:297\n1225#3,6:303\n1225#3,3:323\n1228#3,3:329\n1225#3,6:406\n1225#3,6:455\n1225#3,6:461\n1225#3,6:467\n149#4:214\n149#4:252\n149#4:333\n149#4:416\n86#5:215\n82#5,7:216\n89#5:251\n86#5:253\n82#5,7:254\n89#5:289\n93#5:313\n93#5:317\n86#5:334\n82#5,7:335\n89#5:370\n86#5:417\n82#5,7:418\n89#5:453\n93#5:477\n93#5:481\n79#6,6:223\n86#6,4:238\n90#6,2:248\n79#6,6:261\n86#6,4:276\n90#6,2:286\n94#6:312\n94#6:316\n79#6,6:342\n86#6,4:357\n90#6,2:367\n79#6,6:377\n86#6,4:392\n90#6,2:402\n94#6:414\n79#6,6:425\n86#6,4:440\n90#6,2:450\n94#6:476\n94#6:480\n368#7,9:229\n377#7:250\n368#7,9:267\n377#7:288\n378#7,2:310\n378#7,2:314\n368#7,9:348\n377#7:369\n368#7,9:383\n377#7:404\n378#7,2:412\n368#7,9:431\n377#7:452\n378#7,2:474\n378#7,2:478\n4034#8,6:242\n4034#8,6:280\n4034#8,6:361\n4034#8,6:396\n4034#8,6:444\n481#9:318\n480#9,4:319\n484#9,2:326\n488#9:332\n480#10:328\n99#11:371\n97#11,5:372\n102#11:405\n106#11:415\n81#12:482\n107#12,2:483\n*S KotlinDebug\n*F\n+ 1 Report.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt\n*L\n104#1:186,10\n130#1:290\n130#1:309\n165#1:454\n165#1:473\n108#1:196,6\n110#1:202,6\n114#1:208,6\n136#1:291,6\n137#1:297,6\n138#1:303,6\n145#1:323,3\n145#1:329,3\n155#1:406,6\n172#1:455,6\n173#1:461,6\n177#1:467,6\n124#1:214\n129#1:252\n146#1:333\n164#1:416\n124#1:215\n124#1:216,7\n124#1:251\n129#1:253\n129#1:254,7\n129#1:289\n129#1:313\n124#1:317\n146#1:334\n146#1:335,7\n146#1:370\n164#1:417\n164#1:418,7\n164#1:453\n164#1:477\n146#1:481\n124#1:223,6\n124#1:238,4\n124#1:248,2\n129#1:261,6\n129#1:276,4\n129#1:286,2\n129#1:312\n124#1:316\n146#1:342,6\n146#1:357,4\n146#1:367,2\n147#1:377,6\n147#1:392,4\n147#1:402,2\n147#1:414\n164#1:425,6\n164#1:440,4\n164#1:450,2\n164#1:476\n146#1:480\n124#1:229,9\n124#1:250\n129#1:267,9\n129#1:288\n129#1:310,2\n124#1:314,2\n146#1:348,9\n146#1:369\n147#1:383,9\n147#1:404\n147#1:412,2\n164#1:431,9\n164#1:452\n164#1:474,2\n146#1:478,2\n124#1:242,6\n129#1:280,6\n146#1:361,6\n147#1:396,6\n164#1:444,6\n145#1:318\n145#1:319,4\n145#1:326,2\n145#1:332\n145#1:328\n147#1:371\n147#1:372,5\n147#1:405\n147#1:415\n108#1:482\n108#1:483,2\n*E\n"})
/*     */ public final class ReportKt
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void ReportStep(@NotNull TaskStep.Report report, boolean isProjectOnVCS, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'report'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc -165116721
/*     */     //   9: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   14: astore_2
/*     */     //   15: iload_3
/*     */     //   16: istore #4
/*     */     //   18: iload_3
/*     */     //   19: bipush #6
/*     */     //   21: iand
/*     */     //   22: ifne -> 45
/*     */     //   25: iload #4
/*     */     //   27: aload_2
/*     */     //   28: aload_0
/*     */     //   29: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   34: ifeq -> 41
/*     */     //   37: iconst_4
/*     */     //   38: goto -> 42
/*     */     //   41: iconst_2
/*     */     //   42: ior
/*     */     //   43: istore #4
/*     */     //   45: iload_3
/*     */     //   46: bipush #48
/*     */     //   48: iand
/*     */     //   49: ifne -> 74
/*     */     //   52: iload #4
/*     */     //   54: aload_2
/*     */     //   55: iload_1
/*     */     //   56: invokeinterface changed : (Z)Z
/*     */     //   61: ifeq -> 69
/*     */     //   64: bipush #32
/*     */     //   66: goto -> 71
/*     */     //   69: bipush #16
/*     */     //   71: ior
/*     */     //   72: istore #4
/*     */     //   74: iload #4
/*     */     //   76: bipush #19
/*     */     //   78: iand
/*     */     //   79: bipush #18
/*     */     //   81: if_icmpne -> 93
/*     */     //   84: aload_2
/*     */     //   85: invokeinterface getSkipping : ()Z
/*     */     //   90: ifne -> 167
/*     */     //   93: invokestatic isTraceInProgress : ()Z
/*     */     //   96: ifeq -> 109
/*     */     //   99: ldc -165116721
/*     */     //   101: iload #4
/*     */     //   103: iconst_m1
/*     */     //   104: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.ReportStep (Report.kt:40)'
/*     */     //   106: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   109: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   112: checkcast androidx/compose/ui/Modifier
/*     */     //   115: fconst_0
/*     */     //   116: iconst_1
/*     */     //   117: aconst_null
/*     */     //   118: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   121: aconst_null
/*     */     //   122: aconst_null
/*     */     //   123: lconst_0
/*     */     //   124: aconst_null
/*     */     //   125: aconst_null
/*     */     //   126: ldc 421919381
/*     */     //   128: iconst_1
/*     */     //   129: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$ReportStep$1
/*     */     //   132: dup
/*     */     //   133: aload_0
/*     */     //   134: iload_1
/*     */     //   135: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Report;Z)V
/*     */     //   138: aload_2
/*     */     //   139: bipush #54
/*     */     //   141: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   144: checkcast kotlin/jvm/functions/Function3
/*     */     //   147: aload_2
/*     */     //   148: ldc 1572870
/*     */     //   150: bipush #62
/*     */     //   152: invokestatic JunieStepCard-hYmLsZ8 : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/PaddingValues;JLandroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   155: invokestatic isTraceInProgress : ()Z
/*     */     //   158: ifeq -> 173
/*     */     //   161: invokestatic traceEventEnd : ()V
/*     */     //   164: goto -> 173
/*     */     //   167: aload_2
/*     */     //   168: invokeinterface skipToGroupEnd : ()V
/*     */     //   173: aload_2
/*     */     //   174: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   179: dup
/*     */     //   180: ifnull -> 199
/*     */     //   183: aload_0
/*     */     //   184: iload_1
/*     */     //   185: iload_3
/*     */     //   186: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Report;ZI)Lkotlin/jvm/functions/Function2;
/*     */     //   191: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   196: goto -> 200
/*     */     //   199: pop
/*     */     //   200: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #41	-> 6
/*     */     //   #43	-> 109
/*     */     //   #44	-> 126
/*     */     //   #42	-> 152
/*     */     //   #95	-> 167
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   18	183	4	$dirty	I
/*     */     //   0	201	0	report	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Report;
/*     */     //   0	201	1	isProjectOnVCS	Z
/*     */     //   0	201	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	201	3	$changed	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nReport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Report.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$ReportStep$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,185:1\n149#2:186\n149#2:228\n149#2:229\n149#2:275\n149#2:276\n99#3:187\n95#3,7:188\n102#3:223\n106#3:227\n99#3,3:277\n102#3:308\n106#3:353\n79#4,6:195\n86#4,4:210\n90#4,2:220\n94#4:226\n79#4,6:236\n86#4,4:251\n90#4,2:261\n94#4:273\n79#4,6:280\n86#4,4:295\n90#4,2:305\n79#4,6:317\n86#4,4:332\n90#4,2:342\n94#4:348\n94#4:352\n368#5,9:201\n377#5:222\n378#5,2:224\n368#5,9:242\n377#5:263\n378#5,2:271\n368#5,9:286\n377#5:307\n368#5,9:323\n377#5:344\n378#5,2:346\n378#5,2:350\n4034#6,6:214\n4034#6,6:255\n4034#6,6:299\n4034#6,6:336\n86#7:230\n84#7,5:231\n89#7:264\n93#7:274\n1225#8,6:265\n71#9:309\n67#9,7:310\n74#9:345\n78#9:349\n*S KotlinDebug\n*F\n+ 1 Report.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$ReportStep$1\n*L\n48#1:186\n59#1:228\n60#1:229\n78#1:275\n80#1:276\n46#1:187\n46#1:188,7\n46#1:223\n46#1:227\n77#1:277,3\n77#1:308\n77#1:353\n46#1:195,6\n46#1:210,4\n46#1:220,2\n46#1:226\n58#1:236,6\n58#1:251,4\n58#1:261,2\n58#1:273\n77#1:280,6\n77#1:295,4\n77#1:305,2\n86#1:317,6\n86#1:332,4\n86#1:342,2\n86#1:348\n77#1:352\n46#1:201,9\n46#1:222\n46#1:224,2\n58#1:242,9\n58#1:263\n58#1:271,2\n77#1:286,9\n77#1:307\n86#1:323,9\n86#1:344\n86#1:346,2\n77#1:350,2\n46#1:214,6\n58#1:255,6\n77#1:299,6\n86#1:336,6\n58#1:230\n58#1:231,5\n58#1:264\n58#1:274\n65#1:265,6\n86#1:309\n86#1:310,7\n86#1:345\n86#1:349\n*E\n"})
/*     */   static final class ReportKt$ReportStep$1
/*     */     implements Function3<ColumnScope, Composer, Integer, Unit>
/*     */   {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(ColumnScope $this$JunieStepCard, Composer $composer, int $changed) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc '$this$JunieStepCard'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: iload_3
/*     */       //   7: bipush #17
/*     */       //   9: iand
/*     */       //   10: bipush #16
/*     */       //   12: if_icmpne -> 24
/*     */       //   15: aload_2
/*     */       //   16: invokeinterface getSkipping : ()Z
/*     */       //   21: ifne -> 2171
/*     */       //   24: invokestatic isTraceInProgress : ()Z
/*     */       //   27: ifeq -> 39
/*     */       //   30: ldc 421919381
/*     */       //   32: iload_3
/*     */       //   33: iconst_m1
/*     */       //   34: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.ReportStep.<anonymous> (Report.kt:45)'
/*     */       //   36: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   39: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */       //   42: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */       //   45: astore #4
/*     */       //   47: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */       //   50: bipush #8
/*     */       //   52: istore #6
/*     */       //   54: iconst_0
/*     */       //   55: istore #7
/*     */       //   57: iload #6
/*     */       //   59: i2f
/*     */       //   60: invokestatic constructor-impl : (F)F
/*     */       //   63: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */       //   66: astore #5
/*     */       //   68: aload_0
/*     */       //   69: getfield $report : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Report;
/*     */       //   72: astore #7
/*     */       //   74: sipush #432
/*     */       //   77: istore #8
/*     */       //   79: iconst_0
/*     */       //   80: istore #9
/*     */       //   82: aload_2
/*     */       //   83: ldc 693286680
/*     */       //   85: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */       //   87: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   90: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   93: checkcast androidx/compose/ui/Modifier
/*     */       //   96: astore #6
/*     */       //   98: aload #5
/*     */       //   100: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*     */       //   103: aload #4
/*     */       //   105: aload_2
/*     */       //   106: bipush #14
/*     */       //   108: iload #8
/*     */       //   110: iconst_3
/*     */       //   111: ishr
/*     */       //   112: iand
/*     */       //   113: bipush #112
/*     */       //   115: iload #8
/*     */       //   117: iconst_3
/*     */       //   118: ishr
/*     */       //   119: iand
/*     */       //   120: ior
/*     */       //   121: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   124: astore #10
/*     */       //   126: bipush #112
/*     */       //   128: iload #8
/*     */       //   130: iconst_3
/*     */       //   131: ishl
/*     */       //   132: iand
/*     */       //   133: istore #11
/*     */       //   135: nop
/*     */       //   136: iconst_0
/*     */       //   137: istore #12
/*     */       //   139: aload_2
/*     */       //   140: ldc -1323940314
/*     */       //   142: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */       //   144: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   147: aload_2
/*     */       //   148: iconst_0
/*     */       //   149: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */       //   152: istore #13
/*     */       //   154: aload_2
/*     */       //   155: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   160: astore #14
/*     */       //   162: aload_2
/*     */       //   163: aload #6
/*     */       //   165: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */       //   168: astore #15
/*     */       //   170: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   173: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */       //   176: astore #16
/*     */       //   178: bipush #6
/*     */       //   180: sipush #896
/*     */       //   183: iload #11
/*     */       //   185: bipush #6
/*     */       //   187: ishl
/*     */       //   188: iand
/*     */       //   189: ior
/*     */       //   190: istore #17
/*     */       //   192: nop
/*     */       //   193: iconst_0
/*     */       //   194: istore #18
/*     */       //   196: aload_2
/*     */       //   197: ldc -692256719
/*     */       //   199: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */       //   201: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   204: aload_2
/*     */       //   205: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */       //   210: instanceof androidx/compose/runtime/Applier
/*     */       //   213: ifne -> 219
/*     */       //   216: invokestatic invalidApplier : ()V
/*     */       //   219: aload_2
/*     */       //   220: invokeinterface startReusableNode : ()V
/*     */       //   225: aload_2
/*     */       //   226: invokeinterface getInserting : ()Z
/*     */       //   231: ifeq -> 245
/*     */       //   234: aload_2
/*     */       //   235: aload #16
/*     */       //   237: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */       //   242: goto -> 251
/*     */       //   245: aload_2
/*     */       //   246: invokeinterface useNode : ()V
/*     */       //   251: aload_2
/*     */       //   252: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */       //   255: astore #19
/*     */       //   257: iconst_0
/*     */       //   258: istore #20
/*     */       //   260: aload #19
/*     */       //   262: aload #10
/*     */       //   264: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   267: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */       //   270: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   273: aload #19
/*     */       //   275: aload #14
/*     */       //   277: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   280: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */       //   283: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   286: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   289: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */       //   292: astore #21
/*     */       //   294: iconst_0
/*     */       //   295: istore #22
/*     */       //   297: aload #19
/*     */       //   299: astore #23
/*     */       //   301: iconst_0
/*     */       //   302: istore #24
/*     */       //   304: aload #23
/*     */       //   306: invokeinterface getInserting : ()Z
/*     */       //   311: ifne -> 332
/*     */       //   314: aload #23
/*     */       //   316: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   321: iload #13
/*     */       //   323: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   326: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   329: ifne -> 358
/*     */       //   332: aload #23
/*     */       //   334: iload #13
/*     */       //   336: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   339: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   344: aload #19
/*     */       //   346: iload #13
/*     */       //   348: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   351: aload #21
/*     */       //   353: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   358: nop
/*     */       //   359: nop
/*     */       //   360: nop
/*     */       //   361: aload #19
/*     */       //   363: aload #15
/*     */       //   365: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   368: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */       //   371: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   374: nop
/*     */       //   375: nop
/*     */       //   376: aload_2
/*     */       //   377: bipush #14
/*     */       //   379: iload #17
/*     */       //   381: bipush #6
/*     */       //   383: ishr
/*     */       //   384: iand
/*     */       //   385: istore #25
/*     */       //   387: astore #26
/*     */       //   389: iconst_0
/*     */       //   390: istore #27
/*     */       //   392: aload #26
/*     */       //   394: ldc -407840262
/*     */       //   396: ldc 'C101@5126L9:Row.kt#2w3rfo'
/*     */       //   398: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   401: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */       //   404: aload #26
/*     */       //   406: bipush #6
/*     */       //   408: bipush #112
/*     */       //   410: iload #8
/*     */       //   412: bipush #6
/*     */       //   414: ishr
/*     */       //   415: iand
/*     */       //   416: ior
/*     */       //   417: istore #28
/*     */       //   419: astore #29
/*     */       //   421: checkcast androidx/compose/foundation/layout/RowScope
/*     */       //   424: astore #30
/*     */       //   426: iconst_0
/*     */       //   427: istore #31
/*     */       //   429: aload #29
/*     */       //   431: iconst_0
/*     */       //   432: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */       //   435: invokevirtual getDoneStateIcon : ()Lorg/jetbrains/jewel/ui/icon/PathIconKey;
/*     */       //   438: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*     */       //   441: ldc 'Report Done'
/*     */       //   443: aconst_null
/*     */       //   444: aconst_null
/*     */       //   445: lconst_0
/*     */       //   446: iconst_0
/*     */       //   447: anewarray org/jetbrains/jewel/ui/painter/PainterHint
/*     */       //   450: aload #29
/*     */       //   452: bipush #48
/*     */       //   454: getstatic org/jetbrains/jewel/ui/icon/PathIconKey.$stable : I
/*     */       //   457: ior
/*     */       //   458: bipush #28
/*     */       //   460: invokestatic Icon-FHprtrg : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V
/*     */       //   463: aload #7
/*     */       //   465: invokevirtual getName : ()Ljava/lang/String;
/*     */       //   468: aconst_null
/*     */       //   469: lconst_0
/*     */       //   470: bipush #16
/*     */       //   472: invokestatic getSp : (I)J
/*     */       //   475: aconst_null
/*     */       //   476: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
/*     */       //   479: invokevirtual getBold : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */       //   482: aconst_null
/*     */       //   483: lconst_0
/*     */       //   484: aconst_null
/*     */       //   485: iconst_0
/*     */       //   486: lconst_0
/*     */       //   487: iconst_0
/*     */       //   488: iconst_0
/*     */       //   489: iconst_0
/*     */       //   490: aconst_null
/*     */       //   491: aconst_null
/*     */       //   492: aload #29
/*     */       //   494: ldc_w 199680
/*     */       //   497: iconst_0
/*     */       //   498: ldc_w 65494
/*     */       //   501: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */       //   504: nop
/*     */       //   505: aload #26
/*     */       //   507: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   510: aload_2
/*     */       //   511: invokeinterface endNode : ()V
/*     */       //   516: aload_2
/*     */       //   517: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   520: nop
/*     */       //   521: aload_2
/*     */       //   522: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   525: nop
/*     */       //   526: aload_2
/*     */       //   527: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   530: nop
/*     */       //   531: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   534: checkcast androidx/compose/ui/Modifier
/*     */       //   537: fconst_0
/*     */       //   538: fconst_0
/*     */       //   539: fconst_0
/*     */       //   540: iconst_4
/*     */       //   541: istore #4
/*     */       //   543: iconst_0
/*     */       //   544: istore #5
/*     */       //   546: iload #4
/*     */       //   548: i2f
/*     */       //   549: invokestatic constructor-impl : (F)F
/*     */       //   552: bipush #7
/*     */       //   554: aconst_null
/*     */       //   555: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */       //   558: astore #4
/*     */       //   560: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */       //   563: bipush #8
/*     */       //   565: istore #5
/*     */       //   567: iconst_0
/*     */       //   568: istore #6
/*     */       //   570: iload #5
/*     */       //   572: i2f
/*     */       //   573: invokestatic constructor-impl : (F)F
/*     */       //   576: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */       //   579: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
/*     */       //   582: astore #5
/*     */       //   584: aload_0
/*     */       //   585: getfield $report : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Report;
/*     */       //   588: astore #7
/*     */       //   590: aload_0
/*     */       //   591: getfield $isProjectOnVCS : Z
/*     */       //   594: istore #8
/*     */       //   596: bipush #54
/*     */       //   598: istore #9
/*     */       //   600: iconst_0
/*     */       //   601: istore #10
/*     */       //   603: aload_2
/*     */       //   604: ldc_w -483455358
/*     */       //   607: ldc_w 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */       //   610: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   613: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */       //   616: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */       //   619: astore #6
/*     */       //   621: aload #5
/*     */       //   623: aload #6
/*     */       //   625: aload_2
/*     */       //   626: bipush #14
/*     */       //   628: iload #9
/*     */       //   630: iconst_3
/*     */       //   631: ishr
/*     */       //   632: iand
/*     */       //   633: bipush #112
/*     */       //   635: iload #9
/*     */       //   637: iconst_3
/*     */       //   638: ishr
/*     */       //   639: iand
/*     */       //   640: ior
/*     */       //   641: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   644: astore #11
/*     */       //   646: bipush #112
/*     */       //   648: iload #9
/*     */       //   650: iconst_3
/*     */       //   651: ishl
/*     */       //   652: iand
/*     */       //   653: istore #12
/*     */       //   655: nop
/*     */       //   656: iconst_0
/*     */       //   657: istore #13
/*     */       //   659: aload_2
/*     */       //   660: ldc -1323940314
/*     */       //   662: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */       //   664: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   667: aload_2
/*     */       //   668: iconst_0
/*     */       //   669: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */       //   672: istore #14
/*     */       //   674: aload_2
/*     */       //   675: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   680: astore #15
/*     */       //   682: aload_2
/*     */       //   683: aload #4
/*     */       //   685: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */       //   688: astore #16
/*     */       //   690: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   693: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */       //   696: astore #17
/*     */       //   698: bipush #6
/*     */       //   700: sipush #896
/*     */       //   703: iload #12
/*     */       //   705: bipush #6
/*     */       //   707: ishl
/*     */       //   708: iand
/*     */       //   709: ior
/*     */       //   710: istore #18
/*     */       //   712: nop
/*     */       //   713: iconst_0
/*     */       //   714: istore #19
/*     */       //   716: aload_2
/*     */       //   717: ldc -692256719
/*     */       //   719: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */       //   721: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   724: aload_2
/*     */       //   725: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */       //   730: instanceof androidx/compose/runtime/Applier
/*     */       //   733: ifne -> 739
/*     */       //   736: invokestatic invalidApplier : ()V
/*     */       //   739: aload_2
/*     */       //   740: invokeinterface startReusableNode : ()V
/*     */       //   745: aload_2
/*     */       //   746: invokeinterface getInserting : ()Z
/*     */       //   751: ifeq -> 765
/*     */       //   754: aload_2
/*     */       //   755: aload #17
/*     */       //   757: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */       //   762: goto -> 771
/*     */       //   765: aload_2
/*     */       //   766: invokeinterface useNode : ()V
/*     */       //   771: aload_2
/*     */       //   772: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */       //   775: astore #20
/*     */       //   777: iconst_0
/*     */       //   778: istore #21
/*     */       //   780: aload #20
/*     */       //   782: aload #11
/*     */       //   784: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   787: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */       //   790: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   793: aload #20
/*     */       //   795: aload #15
/*     */       //   797: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   800: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */       //   803: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   806: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   809: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */       //   812: astore #22
/*     */       //   814: iconst_0
/*     */       //   815: istore #23
/*     */       //   817: aload #20
/*     */       //   819: astore #24
/*     */       //   821: iconst_0
/*     */       //   822: istore #25
/*     */       //   824: aload #24
/*     */       //   826: invokeinterface getInserting : ()Z
/*     */       //   831: ifne -> 852
/*     */       //   834: aload #24
/*     */       //   836: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   841: iload #14
/*     */       //   843: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   846: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   849: ifne -> 878
/*     */       //   852: aload #24
/*     */       //   854: iload #14
/*     */       //   856: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   859: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   864: aload #20
/*     */       //   866: iload #14
/*     */       //   868: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   871: aload #22
/*     */       //   873: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   878: nop
/*     */       //   879: nop
/*     */       //   880: nop
/*     */       //   881: aload #20
/*     */       //   883: aload #16
/*     */       //   885: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   888: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */       //   891: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   894: nop
/*     */       //   895: nop
/*     */       //   896: aload_2
/*     */       //   897: bipush #14
/*     */       //   899: iload #18
/*     */       //   901: bipush #6
/*     */       //   903: ishr
/*     */       //   904: iand
/*     */       //   905: istore #26
/*     */       //   907: astore #27
/*     */       //   909: iconst_0
/*     */       //   910: istore #28
/*     */       //   912: aload #27
/*     */       //   914: ldc_w -384784025
/*     */       //   917: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */       //   920: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   923: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */       //   926: aload #27
/*     */       //   928: bipush #6
/*     */       //   930: bipush #112
/*     */       //   932: iload #9
/*     */       //   934: bipush #6
/*     */       //   936: ishr
/*     */       //   937: iand
/*     */       //   938: ior
/*     */       //   939: istore #29
/*     */       //   941: astore #30
/*     */       //   943: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */       //   946: astore #31
/*     */       //   948: iconst_0
/*     */       //   949: istore #32
/*     */       //   951: aload #30
/*     */       //   953: ldc_w -341145164
/*     */       //   956: invokeinterface startReplaceGroup : (I)V
/*     */       //   961: aload #7
/*     */       //   963: invokevirtual getChanges : ()Ljava/util/List;
/*     */       //   966: checkcast java/util/Collection
/*     */       //   969: invokeinterface isEmpty : ()Z
/*     */       //   974: ifne -> 981
/*     */       //   977: iconst_1
/*     */       //   978: goto -> 982
/*     */       //   981: iconst_0
/*     */       //   982: ifeq -> 1124
/*     */       //   985: aload #7
/*     */       //   987: invokevirtual getChanges : ()Ljava/util/List;
/*     */       //   990: iconst_1
/*     */       //   991: iload #8
/*     */       //   993: aload #30
/*     */       //   995: ldc_w -341141416
/*     */       //   998: invokeinterface startReplaceGroup : (I)V
/*     */       //   1003: aload #30
/*     */       //   1005: astore #33
/*     */       //   1007: aload #30
/*     */       //   1009: aload #7
/*     */       //   1011: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   1016: istore #34
/*     */       //   1018: nop
/*     */       //   1019: iconst_0
/*     */       //   1020: istore #35
/*     */       //   1022: aload #33
/*     */       //   1024: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   1029: astore #36
/*     */       //   1031: iconst_0
/*     */       //   1032: istore #37
/*     */       //   1034: iload #34
/*     */       //   1036: ifne -> 1050
/*     */       //   1039: aload #36
/*     */       //   1041: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   1044: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   1047: if_acmpne -> 1098
/*     */       //   1050: istore #38
/*     */       //   1052: istore #39
/*     */       //   1054: astore #40
/*     */       //   1056: iconst_0
/*     */       //   1057: istore #41
/*     */       //   1059: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$ReportStep$1$2$1$1
/*     */       //   1062: dup
/*     */       //   1063: aload #7
/*     */       //   1065: aconst_null
/*     */       //   1066: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Report;Lkotlin/coroutines/Continuation;)V
/*     */       //   1069: checkcast kotlin/jvm/functions/Function1
/*     */       //   1072: astore #42
/*     */       //   1074: aload #40
/*     */       //   1076: iload #39
/*     */       //   1078: iload #38
/*     */       //   1080: aload #42
/*     */       //   1082: astore #43
/*     */       //   1084: aload #33
/*     */       //   1086: aload #43
/*     */       //   1088: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   1093: aload #43
/*     */       //   1095: goto -> 1100
/*     */       //   1098: aload #36
/*     */       //   1100: nop
/*     */       //   1101: nop
/*     */       //   1102: nop
/*     */       //   1103: checkcast kotlin/jvm/functions/Function1
/*     */       //   1106: astore #44
/*     */       //   1108: aload #30
/*     */       //   1110: invokeinterface endReplaceGroup : ()V
/*     */       //   1115: aload #44
/*     */       //   1117: aload #30
/*     */       //   1119: bipush #48
/*     */       //   1121: invokestatic FileReport : (Ljava/util/List;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
/*     */       //   1124: aload #30
/*     */       //   1126: invokeinterface endReplaceGroup : ()V
/*     */       //   1131: aload #7
/*     */       //   1133: invokevirtual getDescription : ()Ljava/lang/String;
/*     */       //   1136: aload #30
/*     */       //   1138: iconst_0
/*     */       //   1139: invokestatic TextContainer : (Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
/*     */       //   1142: nop
/*     */       //   1143: aload #27
/*     */       //   1145: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   1148: aload_2
/*     */       //   1149: invokeinterface endNode : ()V
/*     */       //   1154: aload_2
/*     */       //   1155: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   1158: nop
/*     */       //   1159: aload_2
/*     */       //   1160: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   1163: nop
/*     */       //   1164: aload_2
/*     */       //   1165: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   1168: nop
/*     */       //   1169: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   1172: checkcast androidx/compose/ui/Modifier
/*     */       //   1175: fconst_0
/*     */       //   1176: fconst_0
/*     */       //   1177: fconst_0
/*     */       //   1178: iconst_4
/*     */       //   1179: istore #5
/*     */       //   1181: iconst_0
/*     */       //   1182: istore #6
/*     */       //   1184: iload #5
/*     */       //   1186: i2f
/*     */       //   1187: invokestatic constructor-impl : (F)F
/*     */       //   1190: bipush #7
/*     */       //   1192: aconst_null
/*     */       //   1193: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */       //   1196: astore #4
/*     */       //   1198: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */       //   1201: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */       //   1204: astore #5
/*     */       //   1206: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */       //   1209: bipush #16
/*     */       //   1211: istore #7
/*     */       //   1213: iconst_0
/*     */       //   1214: istore #8
/*     */       //   1216: iload #7
/*     */       //   1218: i2f
/*     */       //   1219: invokestatic constructor-impl : (F)F
/*     */       //   1222: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */       //   1225: astore #6
/*     */       //   1227: aload_0
/*     */       //   1228: getfield $report : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Report;
/*     */       //   1231: astore #7
/*     */       //   1233: sipush #438
/*     */       //   1236: istore #8
/*     */       //   1238: iconst_0
/*     */       //   1239: istore #9
/*     */       //   1241: aload_2
/*     */       //   1242: ldc 693286680
/*     */       //   1244: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */       //   1246: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   1249: aload #6
/*     */       //   1251: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*     */       //   1254: aload #5
/*     */       //   1256: aload_2
/*     */       //   1257: bipush #14
/*     */       //   1259: iload #8
/*     */       //   1261: iconst_3
/*     */       //   1262: ishr
/*     */       //   1263: iand
/*     */       //   1264: bipush #112
/*     */       //   1266: iload #8
/*     */       //   1268: iconst_3
/*     */       //   1269: ishr
/*     */       //   1270: iand
/*     */       //   1271: ior
/*     */       //   1272: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   1275: astore #10
/*     */       //   1277: bipush #112
/*     */       //   1279: iload #8
/*     */       //   1281: iconst_3
/*     */       //   1282: ishl
/*     */       //   1283: iand
/*     */       //   1284: istore #11
/*     */       //   1286: nop
/*     */       //   1287: iconst_0
/*     */       //   1288: istore #12
/*     */       //   1290: aload_2
/*     */       //   1291: ldc -1323940314
/*     */       //   1293: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */       //   1295: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   1298: aload_2
/*     */       //   1299: iconst_0
/*     */       //   1300: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */       //   1303: istore #13
/*     */       //   1305: aload_2
/*     */       //   1306: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   1311: astore #14
/*     */       //   1313: aload_2
/*     */       //   1314: aload #4
/*     */       //   1316: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */       //   1319: astore #15
/*     */       //   1321: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   1324: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */       //   1327: astore #16
/*     */       //   1329: bipush #6
/*     */       //   1331: sipush #896
/*     */       //   1334: iload #11
/*     */       //   1336: bipush #6
/*     */       //   1338: ishl
/*     */       //   1339: iand
/*     */       //   1340: ior
/*     */       //   1341: istore #17
/*     */       //   1343: nop
/*     */       //   1344: iconst_0
/*     */       //   1345: istore #18
/*     */       //   1347: aload_2
/*     */       //   1348: ldc -692256719
/*     */       //   1350: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */       //   1352: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   1355: aload_2
/*     */       //   1356: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */       //   1361: instanceof androidx/compose/runtime/Applier
/*     */       //   1364: ifne -> 1370
/*     */       //   1367: invokestatic invalidApplier : ()V
/*     */       //   1370: aload_2
/*     */       //   1371: invokeinterface startReusableNode : ()V
/*     */       //   1376: aload_2
/*     */       //   1377: invokeinterface getInserting : ()Z
/*     */       //   1382: ifeq -> 1396
/*     */       //   1385: aload_2
/*     */       //   1386: aload #16
/*     */       //   1388: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */       //   1393: goto -> 1402
/*     */       //   1396: aload_2
/*     */       //   1397: invokeinterface useNode : ()V
/*     */       //   1402: aload_2
/*     */       //   1403: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */       //   1406: astore #19
/*     */       //   1408: iconst_0
/*     */       //   1409: istore #20
/*     */       //   1411: aload #19
/*     */       //   1413: aload #10
/*     */       //   1415: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   1418: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */       //   1421: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   1424: aload #19
/*     */       //   1426: aload #14
/*     */       //   1428: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   1431: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */       //   1434: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   1437: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   1440: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */       //   1443: astore #21
/*     */       //   1445: iconst_0
/*     */       //   1446: istore #22
/*     */       //   1448: aload #19
/*     */       //   1450: astore #23
/*     */       //   1452: iconst_0
/*     */       //   1453: istore #24
/*     */       //   1455: aload #23
/*     */       //   1457: invokeinterface getInserting : ()Z
/*     */       //   1462: ifne -> 1483
/*     */       //   1465: aload #23
/*     */       //   1467: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   1472: iload #13
/*     */       //   1474: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   1477: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   1480: ifne -> 1509
/*     */       //   1483: aload #23
/*     */       //   1485: iload #13
/*     */       //   1487: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   1490: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   1495: aload #19
/*     */       //   1497: iload #13
/*     */       //   1499: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   1502: aload #21
/*     */       //   1504: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   1509: nop
/*     */       //   1510: nop
/*     */       //   1511: nop
/*     */       //   1512: aload #19
/*     */       //   1514: aload #15
/*     */       //   1516: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   1519: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */       //   1522: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   1525: nop
/*     */       //   1526: nop
/*     */       //   1527: aload_2
/*     */       //   1528: bipush #14
/*     */       //   1530: iload #17
/*     */       //   1532: bipush #6
/*     */       //   1534: ishr
/*     */       //   1535: iand
/*     */       //   1536: istore #25
/*     */       //   1538: astore #26
/*     */       //   1540: iconst_0
/*     */       //   1541: istore #27
/*     */       //   1543: aload #26
/*     */       //   1545: ldc -407840262
/*     */       //   1547: ldc 'C101@5126L9:Row.kt#2w3rfo'
/*     */       //   1549: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   1552: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */       //   1555: aload #26
/*     */       //   1557: bipush #6
/*     */       //   1559: bipush #112
/*     */       //   1561: iload #8
/*     */       //   1563: bipush #6
/*     */       //   1565: ishr
/*     */       //   1566: iand
/*     */       //   1567: ior
/*     */       //   1568: istore #28
/*     */       //   1570: astore #29
/*     */       //   1572: checkcast androidx/compose/foundation/layout/RowScope
/*     */       //   1575: astore #30
/*     */       //   1577: iconst_0
/*     */       //   1578: istore #31
/*     */       //   1580: aload #7
/*     */       //   1582: invokevirtual getStartNewTaskAction : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*     */       //   1585: astore #32
/*     */       //   1587: aload #29
/*     */       //   1589: ldc_w -341125382
/*     */       //   1592: invokeinterface startReplaceGroup : (I)V
/*     */       //   1597: aload #32
/*     */       //   1599: dup
/*     */       //   1600: ifnonnull -> 1608
/*     */       //   1603: pop
/*     */       //   1604: aconst_null
/*     */       //   1605: goto -> 1656
/*     */       //   1608: astore #33
/*     */       //   1610: iconst_0
/*     */       //   1611: istore #34
/*     */       //   1613: aload #33
/*     */       //   1615: invokevirtual getName : ()Ljava/lang/String;
/*     */       //   1618: astore #35
/*     */       //   1620: aload #33
/*     */       //   1622: invokevirtual getAction : ()Lkotlin/jvm/functions/Function0;
/*     */       //   1625: astore #36
/*     */       //   1627: aload #35
/*     */       //   1629: aconst_null
/*     */       //   1630: iconst_0
/*     */       //   1631: aload #36
/*     */       //   1633: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ComposableSingletons$ReportKt.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ComposableSingletons$ReportKt;
/*     */       //   1636: invokevirtual getLambda-1$ej_ui : ()Lkotlin/jvm/functions/Function3;
/*     */       //   1639: aload #29
/*     */       //   1641: sipush #24960
/*     */       //   1644: iconst_2
/*     */       //   1645: invokestatic Button : (Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */       //   1648: nop
/*     */       //   1649: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   1652: pop
/*     */       //   1653: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   1656: pop
/*     */       //   1657: aload #29
/*     */       //   1659: invokeinterface endReplaceGroup : ()V
/*     */       //   1664: aload #7
/*     */       //   1666: invokevirtual getRollbackAction : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*     */       //   1669: astore #32
/*     */       //   1671: aload #29
/*     */       //   1673: ldc_w -341120708
/*     */       //   1676: invokeinterface startReplaceGroup : (I)V
/*     */       //   1681: aload #32
/*     */       //   1683: dup
/*     */       //   1684: ifnonnull -> 1692
/*     */       //   1687: pop
/*     */       //   1688: aconst_null
/*     */       //   1689: goto -> 2124
/*     */       //   1692: astore #33
/*     */       //   1694: iconst_0
/*     */       //   1695: istore #34
/*     */       //   1697: iconst_0
/*     */       //   1698: istore #35
/*     */       //   1700: nop
/*     */       //   1701: iconst_0
/*     */       //   1702: istore #36
/*     */       //   1704: aload #29
/*     */       //   1706: ldc_w 733328855
/*     */       //   1709: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */       //   1712: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   1715: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   1718: checkcast androidx/compose/ui/Modifier
/*     */       //   1721: astore #38
/*     */       //   1723: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */       //   1726: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */       //   1729: astore #39
/*     */       //   1731: iconst_0
/*     */       //   1732: istore #40
/*     */       //   1734: aload #39
/*     */       //   1736: iload #40
/*     */       //   1738: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   1741: astore #41
/*     */       //   1743: bipush #112
/*     */       //   1745: iload #35
/*     */       //   1747: iconst_3
/*     */       //   1748: ishl
/*     */       //   1749: iand
/*     */       //   1750: istore #42
/*     */       //   1752: nop
/*     */       //   1753: iconst_0
/*     */       //   1754: istore #43
/*     */       //   1756: aload #29
/*     */       //   1758: ldc -1323940314
/*     */       //   1760: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */       //   1762: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   1765: aload #29
/*     */       //   1767: iconst_0
/*     */       //   1768: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */       //   1771: istore #44
/*     */       //   1773: aload #29
/*     */       //   1775: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   1780: astore #45
/*     */       //   1782: aload #29
/*     */       //   1784: aload #38
/*     */       //   1786: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */       //   1789: astore #46
/*     */       //   1791: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   1794: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */       //   1797: astore #47
/*     */       //   1799: bipush #6
/*     */       //   1801: sipush #896
/*     */       //   1804: iload #42
/*     */       //   1806: bipush #6
/*     */       //   1808: ishl
/*     */       //   1809: iand
/*     */       //   1810: ior
/*     */       //   1811: istore #48
/*     */       //   1813: nop
/*     */       //   1814: iconst_0
/*     */       //   1815: istore #49
/*     */       //   1817: aload #29
/*     */       //   1819: ldc -692256719
/*     */       //   1821: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */       //   1823: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   1826: aload #29
/*     */       //   1828: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */       //   1833: instanceof androidx/compose/runtime/Applier
/*     */       //   1836: ifne -> 1842
/*     */       //   1839: invokestatic invalidApplier : ()V
/*     */       //   1842: aload #29
/*     */       //   1844: invokeinterface startReusableNode : ()V
/*     */       //   1849: aload #29
/*     */       //   1851: invokeinterface getInserting : ()Z
/*     */       //   1856: ifeq -> 1871
/*     */       //   1859: aload #29
/*     */       //   1861: aload #47
/*     */       //   1863: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */       //   1868: goto -> 1878
/*     */       //   1871: aload #29
/*     */       //   1873: invokeinterface useNode : ()V
/*     */       //   1878: aload #29
/*     */       //   1880: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */       //   1883: astore #50
/*     */       //   1885: iconst_0
/*     */       //   1886: istore #51
/*     */       //   1888: aload #50
/*     */       //   1890: aload #41
/*     */       //   1892: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   1895: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */       //   1898: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   1901: aload #50
/*     */       //   1903: aload #45
/*     */       //   1905: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   1908: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */       //   1911: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   1914: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   1917: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */       //   1920: astore #52
/*     */       //   1922: iconst_0
/*     */       //   1923: istore #53
/*     */       //   1925: aload #50
/*     */       //   1927: astore #54
/*     */       //   1929: iconst_0
/*     */       //   1930: istore #55
/*     */       //   1932: aload #54
/*     */       //   1934: invokeinterface getInserting : ()Z
/*     */       //   1939: ifne -> 1960
/*     */       //   1942: aload #54
/*     */       //   1944: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   1949: iload #44
/*     */       //   1951: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   1954: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   1957: ifne -> 1986
/*     */       //   1960: aload #54
/*     */       //   1962: iload #44
/*     */       //   1964: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   1967: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   1972: aload #50
/*     */       //   1974: iload #44
/*     */       //   1976: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   1979: aload #52
/*     */       //   1981: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   1986: nop
/*     */       //   1987: nop
/*     */       //   1988: nop
/*     */       //   1989: aload #50
/*     */       //   1991: aload #46
/*     */       //   1993: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   1996: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */       //   1999: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   2002: nop
/*     */       //   2003: nop
/*     */       //   2004: aload #29
/*     */       //   2006: bipush #14
/*     */       //   2008: iload #48
/*     */       //   2010: bipush #6
/*     */       //   2012: ishr
/*     */       //   2013: iand
/*     */       //   2014: istore #56
/*     */       //   2016: astore #57
/*     */       //   2018: iconst_0
/*     */       //   2019: istore #58
/*     */       //   2021: aload #57
/*     */       //   2023: ldc_w -2146769399
/*     */       //   2026: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */       //   2029: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   2032: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */       //   2035: aload #57
/*     */       //   2037: bipush #6
/*     */       //   2039: bipush #112
/*     */       //   2041: iload #35
/*     */       //   2043: bipush #6
/*     */       //   2045: ishr
/*     */       //   2046: iand
/*     */       //   2047: ior
/*     */       //   2048: istore #59
/*     */       //   2050: astore #60
/*     */       //   2052: checkcast androidx/compose/foundation/layout/BoxScope
/*     */       //   2055: astore #61
/*     */       //   2057: iconst_0
/*     */       //   2058: istore #62
/*     */       //   2060: aload #33
/*     */       //   2062: invokevirtual getName : ()Ljava/lang/String;
/*     */       //   2065: aload #33
/*     */       //   2067: invokevirtual getAction : ()Lkotlin/jvm/functions/Function0;
/*     */       //   2070: aconst_null
/*     */       //   2071: iconst_0
/*     */       //   2072: aconst_null
/*     */       //   2073: iconst_0
/*     */       //   2074: aconst_null
/*     */       //   2075: aconst_null
/*     */       //   2076: aload #60
/*     */       //   2078: iconst_0
/*     */       //   2079: sipush #252
/*     */       //   2082: invokestatic Link-kye4rC8 : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/runtime/Composer;II)V
/*     */       //   2085: nop
/*     */       //   2086: aload #57
/*     */       //   2088: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   2091: aload #29
/*     */       //   2093: invokeinterface endNode : ()V
/*     */       //   2098: aload #29
/*     */       //   2100: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   2103: nop
/*     */       //   2104: aload #29
/*     */       //   2106: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   2109: nop
/*     */       //   2110: aload #29
/*     */       //   2112: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   2115: nop
/*     */       //   2116: nop
/*     */       //   2117: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   2120: pop
/*     */       //   2121: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   2124: pop
/*     */       //   2125: aload #29
/*     */       //   2127: invokeinterface endReplaceGroup : ()V
/*     */       //   2132: nop
/*     */       //   2133: aload #26
/*     */       //   2135: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   2138: aload_2
/*     */       //   2139: invokeinterface endNode : ()V
/*     */       //   2144: aload_2
/*     */       //   2145: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   2148: nop
/*     */       //   2149: aload_2
/*     */       //   2150: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   2153: nop
/*     */       //   2154: aload_2
/*     */       //   2155: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   2158: nop
/*     */       //   2159: invokestatic isTraceInProgress : ()Z
/*     */       //   2162: ifeq -> 2177
/*     */       //   2165: invokestatic traceEventEnd : ()V
/*     */       //   2168: goto -> 2177
/*     */       //   2171: aload_2
/*     */       //   2172: invokeinterface skipToGroupEnd : ()V
/*     */       //   2177: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #46	-> 6
/*     */       //   #47	-> 39
/*     */       //   #48	-> 47
/*     */       //   #186	-> 57
/*     */       //   #48	-> 63
/*     */       //   #46	-> 68
/*     */       //   #187	-> 87
/*     */       //   #188	-> 90
/*     */       //   #193	-> 98
/*     */       //   #194	-> 135
/*     */       //   #195	-> 144
/*     */       //   #196	-> 149
/*     */       //   #197	-> 155
/*     */       //   #198	-> 163
/*     */       //   #200	-> 170
/*     */       //   #199	-> 192
/*     */       //   #201	-> 201
/*     */       //   #202	-> 204
/*     */       //   #203	-> 220
/*     */       //   #204	-> 225
/*     */       //   #205	-> 235
/*     */       //   #207	-> 246
/*     */       //   #209	-> 251
/*     */       //   #210	-> 260
/*     */       //   #211	-> 273
/*     */       //   #213	-> 286
/*     */       //   #214	-> 297
/*     */       //   #215	-> 304
/*     */       //   #216	-> 332
/*     */       //   #217	-> 344
/*     */       //   #219	-> 358
/*     */       //   #214	-> 359
/*     */       //   #219	-> 360
/*     */       //   #220	-> 361
/*     */       //   #221	-> 374
/*     */       //   #209	-> 375
/*     */       //   #222	-> 376
/*     */       //   #223	-> 398
/*     */       //   #50	-> 432
/*     */       //   #52	-> 463
/*     */       //   #53	-> 470
/*     */       //   #54	-> 476
/*     */       //   #51	-> 501
/*     */       //   #56	-> 504
/*     */       //   #223	-> 505
/*     */       //   #222	-> 510
/*     */       //   #224	-> 511
/*     */       //   #201	-> 517
/*     */       //   #225	-> 520
/*     */       //   #195	-> 522
/*     */       //   #226	-> 525
/*     */       //   #187	-> 527
/*     */       //   #227	-> 530
/*     */       //   #59	-> 531
/*     */       //   #228	-> 546
/*     */       //   #59	-> 552
/*     */       //   #60	-> 560
/*     */       //   #229	-> 570
/*     */       //   #60	-> 576
/*     */       //   #58	-> 584
/*     */       //   #230	-> 610
/*     */       //   #231	-> 613
/*     */       //   #234	-> 621
/*     */       //   #235	-> 655
/*     */       //   #236	-> 664
/*     */       //   #237	-> 669
/*     */       //   #238	-> 675
/*     */       //   #239	-> 683
/*     */       //   #241	-> 690
/*     */       //   #240	-> 712
/*     */       //   #242	-> 721
/*     */       //   #243	-> 724
/*     */       //   #244	-> 740
/*     */       //   #245	-> 745
/*     */       //   #246	-> 755
/*     */       //   #248	-> 766
/*     */       //   #250	-> 771
/*     */       //   #251	-> 780
/*     */       //   #252	-> 793
/*     */       //   #254	-> 806
/*     */       //   #255	-> 817
/*     */       //   #256	-> 824
/*     */       //   #257	-> 852
/*     */       //   #258	-> 864
/*     */       //   #260	-> 878
/*     */       //   #255	-> 879
/*     */       //   #260	-> 880
/*     */       //   #261	-> 881
/*     */       //   #262	-> 894
/*     */       //   #250	-> 895
/*     */       //   #263	-> 896
/*     */       //   #264	-> 920
/*     */       //   #62	-> 961
/*     */       //   #62	-> 982
/*     */       //   #64	-> 985
/*     */       //   #71	-> 990
/*     */       //   #70	-> 991
/*     */       //   #65	-> 1018
/*     */       //   #265	-> 1022
/*     */       //   #266	-> 1034
/*     */       //   #267	-> 1050
/*     */       //   #65	-> 1059
/*     */       //   #267	-> 1082
/*     */       //   #268	-> 1084
/*     */       //   #269	-> 1093
/*     */       //   #270	-> 1098
/*     */       //   #266	-> 1100
/*     */       //   #265	-> 1101
/*     */       //   #265	-> 1102
/*     */       //   #65	-> 1103
/*     */       //   #63	-> 1121
/*     */       //   #74	-> 1131
/*     */       //   #75	-> 1142
/*     */       //   #264	-> 1143
/*     */       //   #263	-> 1148
/*     */       //   #271	-> 1149
/*     */       //   #242	-> 1155
/*     */       //   #272	-> 1158
/*     */       //   #236	-> 1160
/*     */       //   #273	-> 1163
/*     */       //   #230	-> 1165
/*     */       //   #274	-> 1168
/*     */       //   #78	-> 1169
/*     */       //   #275	-> 1184
/*     */       //   #78	-> 1190
/*     */       //   #79	-> 1198
/*     */       //   #80	-> 1206
/*     */       //   #276	-> 1216
/*     */       //   #80	-> 1222
/*     */       //   #77	-> 1227
/*     */       //   #277	-> 1246
/*     */       //   #278	-> 1249
/*     */       //   #279	-> 1286
/*     */       //   #280	-> 1295
/*     */       //   #281	-> 1300
/*     */       //   #282	-> 1306
/*     */       //   #283	-> 1314
/*     */       //   #285	-> 1321
/*     */       //   #284	-> 1343
/*     */       //   #286	-> 1352
/*     */       //   #287	-> 1355
/*     */       //   #288	-> 1371
/*     */       //   #289	-> 1376
/*     */       //   #290	-> 1386
/*     */       //   #292	-> 1397
/*     */       //   #294	-> 1402
/*     */       //   #295	-> 1411
/*     */       //   #296	-> 1424
/*     */       //   #298	-> 1437
/*     */       //   #299	-> 1448
/*     */       //   #300	-> 1455
/*     */       //   #301	-> 1483
/*     */       //   #302	-> 1495
/*     */       //   #304	-> 1509
/*     */       //   #299	-> 1510
/*     */       //   #304	-> 1511
/*     */       //   #305	-> 1512
/*     */       //   #306	-> 1525
/*     */       //   #294	-> 1526
/*     */       //   #307	-> 1527
/*     */       //   #308	-> 1549
/*     */       //   #82	-> 1580
/*     */       //   #83	-> 1613
/*     */       //   #84	-> 1648
/*     */       //   #82	-> 1652
/*     */       //   #82	-> 1656
/*     */       //   #85	-> 1664
/*     */       //   #86	-> 1700
/*     */       //   #309	-> 1712
/*     */       //   #310	-> 1715
/*     */       //   #311	-> 1723
/*     */       //   #312	-> 1731
/*     */       //   #315	-> 1734
/*     */       //   #316	-> 1752
/*     */       //   #317	-> 1762
/*     */       //   #318	-> 1768
/*     */       //   #319	-> 1775
/*     */       //   #320	-> 1784
/*     */       //   #322	-> 1791
/*     */       //   #321	-> 1813
/*     */       //   #323	-> 1823
/*     */       //   #324	-> 1826
/*     */       //   #325	-> 1844
/*     */       //   #326	-> 1849
/*     */       //   #327	-> 1861
/*     */       //   #329	-> 1873
/*     */       //   #331	-> 1878
/*     */       //   #332	-> 1888
/*     */       //   #333	-> 1901
/*     */       //   #335	-> 1914
/*     */       //   #336	-> 1925
/*     */       //   #337	-> 1932
/*     */       //   #338	-> 1960
/*     */       //   #339	-> 1972
/*     */       //   #341	-> 1986
/*     */       //   #336	-> 1987
/*     */       //   #341	-> 1988
/*     */       //   #342	-> 1989
/*     */       //   #343	-> 2002
/*     */       //   #331	-> 2003
/*     */       //   #344	-> 2004
/*     */       //   #345	-> 2029
/*     */       //   #88	-> 2060
/*     */       //   #89	-> 2065
/*     */       //   #87	-> 2082
/*     */       //   #91	-> 2085
/*     */       //   #345	-> 2086
/*     */       //   #344	-> 2091
/*     */       //   #346	-> 2093
/*     */       //   #323	-> 2100
/*     */       //   #347	-> 2103
/*     */       //   #317	-> 2106
/*     */       //   #348	-> 2109
/*     */       //   #309	-> 2112
/*     */       //   #349	-> 2115
/*     */       //   #92	-> 2116
/*     */       //   #85	-> 2120
/*     */       //   #85	-> 2124
/*     */       //   #93	-> 2132
/*     */       //   #308	-> 2133
/*     */       //   #307	-> 2138
/*     */       //   #350	-> 2139
/*     */       //   #286	-> 2145
/*     */       //   #351	-> 2148
/*     */       //   #280	-> 2150
/*     */       //   #352	-> 2153
/*     */       //   #277	-> 2155
/*     */       //   #353	-> 2158
/*     */       //   #93	-> 2171
/*     */       //   #94	-> 2177
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   57	6	7	$i$f$getDp	I
/*     */       //   54	9	6	$this$dp$iv	I
/*     */       //   429	76	31	$i$a$-Row-ReportKt$ReportStep$1$1	I
/*     */       //   426	79	30	$this$invoke_u24lambda_u240	Landroidx/compose/foundation/layout/RowScope;
/*     */       //   426	79	29	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   426	79	28	$changed	I
/*     */       //   392	118	27	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */       //   389	121	26	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */       //   389	121	25	$changed$iv	I
/*     */       //   304	55	24	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */       //   301	58	23	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   297	64	22	$i$f$set-impl	I
/*     */       //   294	67	21	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */       //   260	115	20	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */       //   257	118	19	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   196	325	18	$i$f$ReusableComposeNode	I
/*     */       //   193	328	16	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */       //   193	328	17	$changed$iv$iv$iv	I
/*     */       //   139	387	12	$i$f$Layout	I
/*     */       //   154	372	13	compositeKeyHash$iv$iv	I
/*     */       //   162	364	14	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   170	356	15	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */       //   136	390	11	$changed$iv$iv	I
/*     */       //   82	449	9	$i$f$Row	I
/*     */       //   126	405	10	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   98	433	6	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */       //   79	452	8	$changed$iv	I
/*     */       //   546	6	5	$i$f$getDp	I
/*     */       //   543	9	4	$this$dp$iv	I
/*     */       //   570	6	6	$i$f$getDp	I
/*     */       //   567	9	5	$this$dp$iv	I
/*     */       //   1059	13	41	$i$a$-cache-ReportKt$ReportStep$1$2$1	I
/*     */       //   1084	11	43	value$iv	Ljava/lang/Object;
/*     */       //   1034	67	37	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   1031	70	36	it$iv	Ljava/lang/Object;
/*     */       //   1022	81	35	$i$f$cache	I
/*     */       //   1019	84	33	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   1019	84	34	invalid$iv	Z
/*     */       //   951	192	32	$i$a$-Column-ReportKt$ReportStep$1$2	I
/*     */       //   948	195	31	$this$invoke_u24lambda_u242	Landroidx/compose/foundation/layout/ColumnScope;
/*     */       //   948	195	30	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   948	195	29	$changed	I
/*     */       //   912	236	28	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */       //   909	239	27	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */       //   909	239	26	$changed$iv	I
/*     */       //   824	55	25	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */       //   821	58	24	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   817	64	23	$i$f$set-impl	I
/*     */       //   814	67	22	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */       //   780	115	21	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */       //   777	118	20	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   716	443	19	$i$f$ReusableComposeNode	I
/*     */       //   713	446	17	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */       //   713	446	18	$changed$iv$iv$iv	I
/*     */       //   659	505	13	$i$f$Layout	I
/*     */       //   674	490	14	compositeKeyHash$iv$iv	I
/*     */       //   682	482	15	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   690	474	16	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */       //   656	508	12	$changed$iv$iv	I
/*     */       //   603	566	10	$i$f$Column	I
/*     */       //   646	523	11	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   600	569	4	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */       //   600	569	5	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */       //   621	548	6	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */       //   600	569	9	$changed$iv	I
/*     */       //   1184	6	6	$i$f$getDp	I
/*     */       //   1181	9	5	$this$dp$iv	I
/*     */       //   1216	6	8	$i$f$getDp	I
/*     */       //   1213	9	7	$this$dp$iv	I
/*     */       //   1613	36	34	$i$a$-let-ReportKt$ReportStep$1$3$1	I
/*     */       //   1610	39	33	startAgain	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*     */       //   2060	26	62	$i$a$-Box-ReportKt$ReportStep$1$3$2$1	I
/*     */       //   2057	29	61	$this$invoke_u24lambda_u246_u24lambda_u245_u24lambda_u244	Landroidx/compose/foundation/layout/BoxScope;
/*     */       //   2057	29	60	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   2057	29	59	$changed	I
/*     */       //   2021	70	58	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */       //   2018	73	57	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */       //   2018	73	56	$changed$iv	I
/*     */       //   1932	55	55	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */       //   1929	58	54	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   1925	64	53	$i$f$set-impl	I
/*     */       //   1922	67	52	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */       //   1888	115	51	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */       //   1885	118	50	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   1817	287	49	$i$f$ReusableComposeNode	I
/*     */       //   1814	290	47	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */       //   1814	290	48	$changed$iv$iv$iv	I
/*     */       //   1756	354	43	$i$f$Layout	I
/*     */       //   1773	337	44	compositeKeyHash$iv$iv	I
/*     */       //   1782	328	45	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   1791	319	46	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */       //   1753	357	42	$changed$iv$iv	I
/*     */       //   1704	412	36	$i$f$Box	I
/*     */       //   1743	373	41	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   1723	393	38	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */       //   1731	385	39	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */       //   1734	382	40	propagateMinConstraints$iv	Z
/*     */       //   1701	415	35	$changed$iv	I
/*     */       //   1697	420	34	$i$a$-let-ReportKt$ReportStep$1$3$2	I
/*     */       //   1694	423	33	rollback	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*     */       //   1580	553	31	$i$a$-Row-ReportKt$ReportStep$1$3	I
/*     */       //   1577	556	30	$this$invoke_u24lambda_u246	Landroidx/compose/foundation/layout/RowScope;
/*     */       //   1577	556	29	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   1577	556	28	$changed	I
/*     */       //   1543	595	27	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */       //   1540	598	26	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */       //   1540	598	25	$changed$iv	I
/*     */       //   1455	55	24	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */       //   1452	58	23	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   1448	64	22	$i$f$set-impl	I
/*     */       //   1445	67	21	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */       //   1411	115	20	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */       //   1408	118	19	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   1347	802	18	$i$f$ReusableComposeNode	I
/*     */       //   1344	805	16	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */       //   1344	805	17	$changed$iv$iv$iv	I
/*     */       //   1290	864	12	$i$f$Layout	I
/*     */       //   1305	849	13	compositeKeyHash$iv$iv	I
/*     */       //   1313	841	14	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   1321	833	15	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */       //   1287	867	11	$changed$iv$iv	I
/*     */       //   1241	918	9	$i$f$Row	I
/*     */       //   1277	882	10	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   1238	921	8	$changed$iv	I
/*     */       //   0	2178	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$ReportStep$1;
/*     */       //   0	2178	1	$this$JunieStepCard	Landroidx/compose/foundation/layout/ColumnScope;
/*     */       //   0	2178	2	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	2178	3	$changed	I
/*     */     }
/*     */     
/*     */     ReportKt$ReportStep$1(TaskStep.Report $report, boolean $isProjectOnVCS) {}
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void FileReport(@NotNull List changes, boolean wantEditableDiff, boolean isProjectOnVCS, @NotNull Function1 onChangeAllVcsStatus, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'changes'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_3
/*     */     //   7: ldc 'onChangeAllVcsStatus'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload #4
/*     */     //   14: ldc -2007810959
/*     */     //   16: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   21: astore #4
/*     */     //   23: iload #5
/*     */     //   25: istore #6
/*     */     //   27: iload #5
/*     */     //   29: bipush #6
/*     */     //   31: iand
/*     */     //   32: ifne -> 56
/*     */     //   35: iload #6
/*     */     //   37: aload #4
/*     */     //   39: aload_0
/*     */     //   40: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   45: ifeq -> 52
/*     */     //   48: iconst_4
/*     */     //   49: goto -> 53
/*     */     //   52: iconst_2
/*     */     //   53: ior
/*     */     //   54: istore #6
/*     */     //   56: iload #5
/*     */     //   58: bipush #48
/*     */     //   60: iand
/*     */     //   61: ifne -> 87
/*     */     //   64: iload #6
/*     */     //   66: aload #4
/*     */     //   68: iload_1
/*     */     //   69: invokeinterface changed : (Z)Z
/*     */     //   74: ifeq -> 82
/*     */     //   77: bipush #32
/*     */     //   79: goto -> 84
/*     */     //   82: bipush #16
/*     */     //   84: ior
/*     */     //   85: istore #6
/*     */     //   87: iload #5
/*     */     //   89: sipush #384
/*     */     //   92: iand
/*     */     //   93: ifne -> 121
/*     */     //   96: iload #6
/*     */     //   98: aload #4
/*     */     //   100: iload_2
/*     */     //   101: invokeinterface changed : (Z)Z
/*     */     //   106: ifeq -> 115
/*     */     //   109: sipush #256
/*     */     //   112: goto -> 118
/*     */     //   115: sipush #128
/*     */     //   118: ior
/*     */     //   119: istore #6
/*     */     //   121: iload #5
/*     */     //   123: sipush #3072
/*     */     //   126: iand
/*     */     //   127: ifne -> 155
/*     */     //   130: iload #6
/*     */     //   132: aload #4
/*     */     //   134: aload_3
/*     */     //   135: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   140: ifeq -> 149
/*     */     //   143: sipush #2048
/*     */     //   146: goto -> 152
/*     */     //   149: sipush #1024
/*     */     //   152: ior
/*     */     //   153: istore #6
/*     */     //   155: iload #6
/*     */     //   157: sipush #1171
/*     */     //   160: iand
/*     */     //   161: sipush #1170
/*     */     //   164: if_icmpne -> 177
/*     */     //   167: aload #4
/*     */     //   169: invokeinterface getSkipping : ()Z
/*     */     //   174: ifne -> 4324
/*     */     //   177: invokestatic isTraceInProgress : ()Z
/*     */     //   180: ifeq -> 193
/*     */     //   183: ldc -2007810959
/*     */     //   185: iload #6
/*     */     //   187: iconst_m1
/*     */     //   188: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.FileReport (Report.kt:102)'
/*     */     //   190: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   193: aload_0
/*     */     //   194: checkcast java/lang/Iterable
/*     */     //   197: astore #8
/*     */     //   199: iconst_0
/*     */     //   200: istore #9
/*     */     //   202: new java/util/ArrayList
/*     */     //   205: dup
/*     */     //   206: invokespecial <init> : ()V
/*     */     //   209: astore #10
/*     */     //   211: new java/util/ArrayList
/*     */     //   214: dup
/*     */     //   215: invokespecial <init> : ()V
/*     */     //   218: astore #11
/*     */     //   220: aload #8
/*     */     //   222: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   227: astore #12
/*     */     //   229: aload #12
/*     */     //   231: invokeinterface hasNext : ()Z
/*     */     //   236: ifeq -> 288
/*     */     //   239: aload #12
/*     */     //   241: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   246: astore #13
/*     */     //   248: aload #13
/*     */     //   250: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView
/*     */     //   253: astore #14
/*     */     //   255: iconst_0
/*     */     //   256: istore #15
/*     */     //   258: aload #14
/*     */     //   260: invokevirtual isNew : ()Z
/*     */     //   263: ifeq -> 277
/*     */     //   266: aload #10
/*     */     //   268: aload #13
/*     */     //   270: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   273: pop
/*     */     //   274: goto -> 229
/*     */     //   277: aload #11
/*     */     //   279: aload #13
/*     */     //   281: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   284: pop
/*     */     //   285: goto -> 229
/*     */     //   288: new kotlin/Pair
/*     */     //   291: dup
/*     */     //   292: aload #10
/*     */     //   294: aload #11
/*     */     //   296: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   299: astore #7
/*     */     //   301: aload #7
/*     */     //   303: invokevirtual component1 : ()Ljava/lang/Object;
/*     */     //   306: checkcast java/util/List
/*     */     //   309: astore #8
/*     */     //   311: aload #7
/*     */     //   313: invokevirtual component2 : ()Ljava/lang/Object;
/*     */     //   316: checkcast java/util/List
/*     */     //   319: astore #9
/*     */     //   321: aload #4
/*     */     //   323: ldc 2070673165
/*     */     //   325: invokeinterface startReplaceGroup : (I)V
/*     */     //   330: aload #4
/*     */     //   332: astore #12
/*     */     //   334: iconst_0
/*     */     //   335: istore #13
/*     */     //   337: nop
/*     */     //   338: iconst_0
/*     */     //   339: istore #14
/*     */     //   341: aload #12
/*     */     //   343: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   348: astore #15
/*     */     //   350: iconst_0
/*     */     //   351: istore #16
/*     */     //   353: aload #15
/*     */     //   355: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   358: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   361: if_acmpne -> 392
/*     */     //   364: iconst_0
/*     */     //   365: istore #17
/*     */     //   367: invokestatic emptySet : ()Ljava/util/Set;
/*     */     //   370: aconst_null
/*     */     //   371: iconst_2
/*     */     //   372: aconst_null
/*     */     //   373: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   376: astore #17
/*     */     //   378: aload #12
/*     */     //   380: aload #17
/*     */     //   382: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   387: aload #17
/*     */     //   389: goto -> 394
/*     */     //   392: aload #15
/*     */     //   394: nop
/*     */     //   395: nop
/*     */     //   396: nop
/*     */     //   397: checkcast androidx/compose/runtime/MutableState
/*     */     //   400: astore #11
/*     */     //   402: aload #4
/*     */     //   404: invokeinterface endReplaceGroup : ()V
/*     */     //   409: aload #11
/*     */     //   411: astore #10
/*     */     //   413: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   416: aload #4
/*     */     //   418: ldc 2070675676
/*     */     //   420: invokeinterface startReplaceGroup : (I)V
/*     */     //   425: aload #4
/*     */     //   427: astore #12
/*     */     //   429: aload #4
/*     */     //   431: aload #8
/*     */     //   433: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   438: istore #13
/*     */     //   440: iconst_0
/*     */     //   441: istore #14
/*     */     //   443: aload #12
/*     */     //   445: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   450: astore #15
/*     */     //   452: iconst_0
/*     */     //   453: istore #16
/*     */     //   455: iload #13
/*     */     //   457: ifne -> 471
/*     */     //   460: aload #15
/*     */     //   462: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   465: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   468: if_acmpne -> 513
/*     */     //   471: astore #88
/*     */     //   473: iconst_0
/*     */     //   474: istore #17
/*     */     //   476: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$2$1
/*     */     //   479: dup
/*     */     //   480: aload #8
/*     */     //   482: aload #10
/*     */     //   484: aconst_null
/*     */     //   485: invokespecial <init> : (Ljava/util/List;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*     */     //   488: checkcast kotlin/jvm/functions/Function2
/*     */     //   491: astore #89
/*     */     //   493: aload #88
/*     */     //   495: aload #89
/*     */     //   497: astore #18
/*     */     //   499: aload #12
/*     */     //   501: aload #18
/*     */     //   503: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   508: aload #18
/*     */     //   510: goto -> 515
/*     */     //   513: aload #15
/*     */     //   515: nop
/*     */     //   516: nop
/*     */     //   517: nop
/*     */     //   518: checkcast kotlin/jvm/functions/Function2
/*     */     //   521: astore #11
/*     */     //   523: aload #4
/*     */     //   525: invokeinterface endReplaceGroup : ()V
/*     */     //   530: aload #11
/*     */     //   532: aload #4
/*     */     //   534: bipush #6
/*     */     //   536: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   539: aload #8
/*     */     //   541: aload #4
/*     */     //   543: ldc 2070679856
/*     */     //   545: invokeinterface startReplaceGroup : (I)V
/*     */     //   550: aload #4
/*     */     //   552: astore #12
/*     */     //   554: aload #4
/*     */     //   556: aload #8
/*     */     //   558: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   563: istore #13
/*     */     //   565: iconst_0
/*     */     //   566: istore #14
/*     */     //   568: aload #12
/*     */     //   570: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   575: astore #15
/*     */     //   577: iconst_0
/*     */     //   578: istore #16
/*     */     //   580: iload #13
/*     */     //   582: ifne -> 596
/*     */     //   585: aload #15
/*     */     //   587: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   590: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   593: if_acmpne -> 638
/*     */     //   596: astore #88
/*     */     //   598: iconst_0
/*     */     //   599: istore #17
/*     */     //   601: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$3$1
/*     */     //   604: dup
/*     */     //   605: aload #8
/*     */     //   607: aload #10
/*     */     //   609: aconst_null
/*     */     //   610: invokespecial <init> : (Ljava/util/List;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*     */     //   613: checkcast kotlin/jvm/functions/Function2
/*     */     //   616: astore #89
/*     */     //   618: aload #88
/*     */     //   620: aload #89
/*     */     //   622: astore #18
/*     */     //   624: aload #12
/*     */     //   626: aload #18
/*     */     //   628: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   633: aload #18
/*     */     //   635: goto -> 640
/*     */     //   638: aload #15
/*     */     //   640: nop
/*     */     //   641: nop
/*     */     //   642: nop
/*     */     //   643: checkcast kotlin/jvm/functions/Function2
/*     */     //   646: astore #11
/*     */     //   648: aload #4
/*     */     //   650: invokeinterface endReplaceGroup : ()V
/*     */     //   655: aload #11
/*     */     //   657: aload #4
/*     */     //   659: iconst_0
/*     */     //   660: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   663: aload #4
/*     */     //   665: ldc 2070686410
/*     */     //   667: invokeinterface startReplaceGroup : (I)V
/*     */     //   672: aload #9
/*     */     //   674: checkcast java/util/Collection
/*     */     //   677: invokeinterface isEmpty : ()Z
/*     */     //   682: ifne -> 689
/*     */     //   685: iconst_1
/*     */     //   686: goto -> 690
/*     */     //   689: iconst_0
/*     */     //   690: ifeq -> 2107
/*     */     //   693: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   696: bipush #8
/*     */     //   698: istore #12
/*     */     //   700: iconst_0
/*     */     //   701: istore #13
/*     */     //   703: iload #12
/*     */     //   705: i2f
/*     */     //   706: invokestatic constructor-impl : (F)F
/*     */     //   709: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   712: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
/*     */     //   715: astore #12
/*     */     //   717: bipush #48
/*     */     //   719: istore #14
/*     */     //   721: iconst_0
/*     */     //   722: istore #15
/*     */     //   724: aload #4
/*     */     //   726: ldc_w -483455358
/*     */     //   729: ldc_w 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   732: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   735: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   738: checkcast androidx/compose/ui/Modifier
/*     */     //   741: astore #11
/*     */     //   743: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   746: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   749: astore #13
/*     */     //   751: aload #12
/*     */     //   753: aload #13
/*     */     //   755: aload #4
/*     */     //   757: bipush #14
/*     */     //   759: iload #14
/*     */     //   761: iconst_3
/*     */     //   762: ishr
/*     */     //   763: iand
/*     */     //   764: bipush #112
/*     */     //   766: iload #14
/*     */     //   768: iconst_3
/*     */     //   769: ishr
/*     */     //   770: iand
/*     */     //   771: ior
/*     */     //   772: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   775: astore #16
/*     */     //   777: bipush #112
/*     */     //   779: iload #14
/*     */     //   781: iconst_3
/*     */     //   782: ishl
/*     */     //   783: iand
/*     */     //   784: istore #17
/*     */     //   786: nop
/*     */     //   787: iconst_0
/*     */     //   788: istore #18
/*     */     //   790: aload #4
/*     */     //   792: ldc_w -1323940314
/*     */     //   795: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   798: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   801: aload #4
/*     */     //   803: iconst_0
/*     */     //   804: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   807: istore #19
/*     */     //   809: aload #4
/*     */     //   811: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   816: astore #20
/*     */     //   818: aload #4
/*     */     //   820: aload #11
/*     */     //   822: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   825: astore #21
/*     */     //   827: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   830: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   833: astore #22
/*     */     //   835: bipush #6
/*     */     //   837: sipush #896
/*     */     //   840: iload #17
/*     */     //   842: bipush #6
/*     */     //   844: ishl
/*     */     //   845: iand
/*     */     //   846: ior
/*     */     //   847: istore #23
/*     */     //   849: nop
/*     */     //   850: iconst_0
/*     */     //   851: istore #24
/*     */     //   853: aload #4
/*     */     //   855: ldc_w -692256719
/*     */     //   858: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   861: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   864: aload #4
/*     */     //   866: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   871: instanceof androidx/compose/runtime/Applier
/*     */     //   874: ifne -> 880
/*     */     //   877: invokestatic invalidApplier : ()V
/*     */     //   880: aload #4
/*     */     //   882: invokeinterface startReusableNode : ()V
/*     */     //   887: aload #4
/*     */     //   889: invokeinterface getInserting : ()Z
/*     */     //   894: ifeq -> 909
/*     */     //   897: aload #4
/*     */     //   899: aload #22
/*     */     //   901: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   906: goto -> 916
/*     */     //   909: aload #4
/*     */     //   911: invokeinterface useNode : ()V
/*     */     //   916: aload #4
/*     */     //   918: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   921: astore #25
/*     */     //   923: iconst_0
/*     */     //   924: istore #26
/*     */     //   926: aload #25
/*     */     //   928: aload #16
/*     */     //   930: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   933: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   936: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   939: aload #25
/*     */     //   941: aload #20
/*     */     //   943: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   946: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   949: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   952: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   955: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   958: astore #27
/*     */     //   960: iconst_0
/*     */     //   961: istore #28
/*     */     //   963: aload #25
/*     */     //   965: astore #29
/*     */     //   967: iconst_0
/*     */     //   968: istore #30
/*     */     //   970: aload #29
/*     */     //   972: invokeinterface getInserting : ()Z
/*     */     //   977: ifne -> 998
/*     */     //   980: aload #29
/*     */     //   982: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   987: iload #19
/*     */     //   989: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   992: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   995: ifne -> 1024
/*     */     //   998: aload #29
/*     */     //   1000: iload #19
/*     */     //   1002: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1005: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1010: aload #25
/*     */     //   1012: iload #19
/*     */     //   1014: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1017: aload #27
/*     */     //   1019: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1024: nop
/*     */     //   1025: nop
/*     */     //   1026: nop
/*     */     //   1027: aload #25
/*     */     //   1029: aload #21
/*     */     //   1031: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1034: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1037: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1040: nop
/*     */     //   1041: nop
/*     */     //   1042: aload #4
/*     */     //   1044: bipush #14
/*     */     //   1046: iload #23
/*     */     //   1048: bipush #6
/*     */     //   1050: ishr
/*     */     //   1051: iand
/*     */     //   1052: istore #31
/*     */     //   1054: astore #32
/*     */     //   1056: iconst_0
/*     */     //   1057: istore #33
/*     */     //   1059: aload #32
/*     */     //   1061: ldc_w -384784025
/*     */     //   1064: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   1067: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1070: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   1073: aload #32
/*     */     //   1075: bipush #6
/*     */     //   1077: bipush #112
/*     */     //   1079: iload #14
/*     */     //   1081: bipush #6
/*     */     //   1083: ishr
/*     */     //   1084: iand
/*     */     //   1085: ior
/*     */     //   1086: istore #34
/*     */     //   1088: astore #35
/*     */     //   1090: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   1093: astore #36
/*     */     //   1095: iconst_0
/*     */     //   1096: istore #37
/*     */     //   1098: ldc_w 'Changed Files'
/*     */     //   1101: aconst_null
/*     */     //   1102: lconst_0
/*     */     //   1103: lconst_0
/*     */     //   1104: aconst_null
/*     */     //   1105: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
/*     */     //   1108: invokevirtual getBold : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   1111: aconst_null
/*     */     //   1112: lconst_0
/*     */     //   1113: aconst_null
/*     */     //   1114: iconst_0
/*     */     //   1115: lconst_0
/*     */     //   1116: iconst_0
/*     */     //   1117: iconst_0
/*     */     //   1118: iconst_0
/*     */     //   1119: aconst_null
/*     */     //   1120: aconst_null
/*     */     //   1121: aload #35
/*     */     //   1123: ldc_w 196614
/*     */     //   1126: iconst_0
/*     */     //   1127: ldc_w 65502
/*     */     //   1130: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1133: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   1136: iconst_4
/*     */     //   1137: istore #38
/*     */     //   1139: iconst_0
/*     */     //   1140: istore #39
/*     */     //   1142: iload #38
/*     */     //   1144: i2f
/*     */     //   1145: invokestatic constructor-impl : (F)F
/*     */     //   1148: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   1151: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
/*     */     //   1154: astore #38
/*     */     //   1156: bipush #48
/*     */     //   1158: istore #40
/*     */     //   1160: iconst_0
/*     */     //   1161: istore #41
/*     */     //   1163: aload #35
/*     */     //   1165: ldc_w -483455358
/*     */     //   1168: ldc_w 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   1171: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1174: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1177: checkcast androidx/compose/ui/Modifier
/*     */     //   1180: astore #42
/*     */     //   1182: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1185: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   1188: astore #39
/*     */     //   1190: aload #38
/*     */     //   1192: aload #39
/*     */     //   1194: aload #35
/*     */     //   1196: bipush #14
/*     */     //   1198: iload #40
/*     */     //   1200: iconst_3
/*     */     //   1201: ishr
/*     */     //   1202: iand
/*     */     //   1203: bipush #112
/*     */     //   1205: iload #40
/*     */     //   1207: iconst_3
/*     */     //   1208: ishr
/*     */     //   1209: iand
/*     */     //   1210: ior
/*     */     //   1211: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1214: astore #43
/*     */     //   1216: bipush #112
/*     */     //   1218: iload #40
/*     */     //   1220: iconst_3
/*     */     //   1221: ishl
/*     */     //   1222: iand
/*     */     //   1223: istore #44
/*     */     //   1225: nop
/*     */     //   1226: iconst_0
/*     */     //   1227: istore #45
/*     */     //   1229: aload #35
/*     */     //   1231: ldc_w -1323940314
/*     */     //   1234: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1237: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1240: aload #35
/*     */     //   1242: iconst_0
/*     */     //   1243: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1246: istore #46
/*     */     //   1248: aload #35
/*     */     //   1250: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1255: astore #47
/*     */     //   1257: aload #35
/*     */     //   1259: aload #42
/*     */     //   1261: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1264: astore #48
/*     */     //   1266: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1269: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1272: astore #49
/*     */     //   1274: bipush #6
/*     */     //   1276: sipush #896
/*     */     //   1279: iload #44
/*     */     //   1281: bipush #6
/*     */     //   1283: ishl
/*     */     //   1284: iand
/*     */     //   1285: ior
/*     */     //   1286: istore #50
/*     */     //   1288: nop
/*     */     //   1289: iconst_0
/*     */     //   1290: istore #51
/*     */     //   1292: aload #35
/*     */     //   1294: ldc_w -692256719
/*     */     //   1297: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1300: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1303: aload #35
/*     */     //   1305: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1310: instanceof androidx/compose/runtime/Applier
/*     */     //   1313: ifne -> 1319
/*     */     //   1316: invokestatic invalidApplier : ()V
/*     */     //   1319: aload #35
/*     */     //   1321: invokeinterface startReusableNode : ()V
/*     */     //   1326: aload #35
/*     */     //   1328: invokeinterface getInserting : ()Z
/*     */     //   1333: ifeq -> 1348
/*     */     //   1336: aload #35
/*     */     //   1338: aload #49
/*     */     //   1340: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1345: goto -> 1355
/*     */     //   1348: aload #35
/*     */     //   1350: invokeinterface useNode : ()V
/*     */     //   1355: aload #35
/*     */     //   1357: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1360: astore #52
/*     */     //   1362: iconst_0
/*     */     //   1363: istore #53
/*     */     //   1365: aload #52
/*     */     //   1367: aload #43
/*     */     //   1369: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1372: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1375: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1378: aload #52
/*     */     //   1380: aload #47
/*     */     //   1382: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1385: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1388: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1391: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1394: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1397: astore #54
/*     */     //   1399: iconst_0
/*     */     //   1400: istore #55
/*     */     //   1402: aload #52
/*     */     //   1404: astore #56
/*     */     //   1406: iconst_0
/*     */     //   1407: istore #57
/*     */     //   1409: aload #56
/*     */     //   1411: invokeinterface getInserting : ()Z
/*     */     //   1416: ifne -> 1437
/*     */     //   1419: aload #56
/*     */     //   1421: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1426: iload #46
/*     */     //   1428: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1431: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1434: ifne -> 1463
/*     */     //   1437: aload #56
/*     */     //   1439: iload #46
/*     */     //   1441: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1444: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1449: aload #52
/*     */     //   1451: iload #46
/*     */     //   1453: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1456: aload #54
/*     */     //   1458: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1463: nop
/*     */     //   1464: nop
/*     */     //   1465: nop
/*     */     //   1466: aload #52
/*     */     //   1468: aload #48
/*     */     //   1470: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1473: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1476: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1479: nop
/*     */     //   1480: nop
/*     */     //   1481: aload #35
/*     */     //   1483: bipush #14
/*     */     //   1485: iload #50
/*     */     //   1487: bipush #6
/*     */     //   1489: ishr
/*     */     //   1490: iand
/*     */     //   1491: istore #58
/*     */     //   1493: astore #59
/*     */     //   1495: iconst_0
/*     */     //   1496: istore #60
/*     */     //   1498: aload #59
/*     */     //   1500: ldc_w -384784025
/*     */     //   1503: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   1506: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1509: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   1512: aload #59
/*     */     //   1514: bipush #6
/*     */     //   1516: bipush #112
/*     */     //   1518: iload #40
/*     */     //   1520: bipush #6
/*     */     //   1522: ishr
/*     */     //   1523: iand
/*     */     //   1524: ior
/*     */     //   1525: istore #61
/*     */     //   1527: astore #62
/*     */     //   1529: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   1532: astore #63
/*     */     //   1534: iconst_0
/*     */     //   1535: istore #64
/*     */     //   1537: aload #62
/*     */     //   1539: ldc_w 1516325694
/*     */     //   1542: invokeinterface startReplaceGroup : (I)V
/*     */     //   1547: aload #9
/*     */     //   1549: checkcast java/lang/Iterable
/*     */     //   1552: astore #65
/*     */     //   1554: iconst_0
/*     */     //   1555: istore #66
/*     */     //   1557: aload #65
/*     */     //   1559: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   1564: astore #67
/*     */     //   1566: aload #67
/*     */     //   1568: invokeinterface hasNext : ()Z
/*     */     //   1573: ifeq -> 2037
/*     */     //   1576: aload #67
/*     */     //   1578: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   1583: astore #68
/*     */     //   1585: aload #68
/*     */     //   1587: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView
/*     */     //   1590: astore #69
/*     */     //   1592: iconst_0
/*     */     //   1593: istore #70
/*     */     //   1595: aload #69
/*     */     //   1597: aload #62
/*     */     //   1599: iconst_0
/*     */     //   1600: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   1603: invokevirtual getReportFileChipBackground-0d7_KjU : ()J
/*     */     //   1606: aload #62
/*     */     //   1608: iconst_0
/*     */     //   1609: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   1612: invokevirtual getReportFileChipBackgroundHovered-0d7_KjU : ()J
/*     */     //   1615: iconst_1
/*     */     //   1616: aload #62
/*     */     //   1618: ldc_w 803275940
/*     */     //   1621: invokeinterface startReplaceGroup : (I)V
/*     */     //   1626: aload #62
/*     */     //   1628: astore #71
/*     */     //   1630: aload #62
/*     */     //   1632: aload #69
/*     */     //   1634: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1639: istore #72
/*     */     //   1641: nop
/*     */     //   1642: iconst_0
/*     */     //   1643: istore #73
/*     */     //   1645: aload #71
/*     */     //   1647: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1652: astore #74
/*     */     //   1654: iconst_0
/*     */     //   1655: istore #75
/*     */     //   1657: iload #72
/*     */     //   1659: ifne -> 1673
/*     */     //   1662: aload #74
/*     */     //   1664: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1667: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1670: if_acmpne -> 1725
/*     */     //   1673: istore #76
/*     */     //   1675: lstore #77
/*     */     //   1677: lstore #79
/*     */     //   1679: astore #81
/*     */     //   1681: iconst_0
/*     */     //   1682: istore #82
/*     */     //   1684: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$4$1$1$1$1
/*     */     //   1687: dup
/*     */     //   1688: aload #69
/*     */     //   1690: aconst_null
/*     */     //   1691: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;Lkotlin/coroutines/Continuation;)V
/*     */     //   1694: checkcast kotlin/jvm/functions/Function1
/*     */     //   1697: astore #83
/*     */     //   1699: aload #81
/*     */     //   1701: lload #79
/*     */     //   1703: lload #77
/*     */     //   1705: iload #76
/*     */     //   1707: aload #83
/*     */     //   1709: astore #84
/*     */     //   1711: aload #71
/*     */     //   1713: aload #84
/*     */     //   1715: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1720: aload #84
/*     */     //   1722: goto -> 1727
/*     */     //   1725: aload #74
/*     */     //   1727: nop
/*     */     //   1728: nop
/*     */     //   1729: nop
/*     */     //   1730: checkcast kotlin/jvm/functions/Function1
/*     */     //   1733: astore #85
/*     */     //   1735: aload #62
/*     */     //   1737: invokeinterface endReplaceGroup : ()V
/*     */     //   1742: aload #85
/*     */     //   1744: aload #62
/*     */     //   1746: ldc_w 803278210
/*     */     //   1749: invokeinterface startReplaceGroup : (I)V
/*     */     //   1754: aload #62
/*     */     //   1756: astore #71
/*     */     //   1758: aload #62
/*     */     //   1760: aload #69
/*     */     //   1762: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1767: istore #72
/*     */     //   1769: nop
/*     */     //   1770: iconst_0
/*     */     //   1771: istore #73
/*     */     //   1773: aload #71
/*     */     //   1775: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1780: astore #74
/*     */     //   1782: iconst_0
/*     */     //   1783: istore #75
/*     */     //   1785: iload #72
/*     */     //   1787: ifne -> 1801
/*     */     //   1790: aload #74
/*     */     //   1792: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1795: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1798: if_acmpne -> 1857
/*     */     //   1801: astore #83
/*     */     //   1803: istore #76
/*     */     //   1805: lstore #77
/*     */     //   1807: lstore #79
/*     */     //   1809: astore #81
/*     */     //   1811: iconst_0
/*     */     //   1812: istore #82
/*     */     //   1814: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$4$1$1$2$1
/*     */     //   1817: dup
/*     */     //   1818: aload #69
/*     */     //   1820: aconst_null
/*     */     //   1821: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;Lkotlin/coroutines/Continuation;)V
/*     */     //   1824: checkcast kotlin/jvm/functions/Function1
/*     */     //   1827: astore #86
/*     */     //   1829: aload #81
/*     */     //   1831: lload #79
/*     */     //   1833: lload #77
/*     */     //   1835: iload #76
/*     */     //   1837: aload #83
/*     */     //   1839: aload #86
/*     */     //   1841: astore #84
/*     */     //   1843: aload #71
/*     */     //   1845: aload #84
/*     */     //   1847: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1852: aload #84
/*     */     //   1854: goto -> 1859
/*     */     //   1857: aload #74
/*     */     //   1859: nop
/*     */     //   1860: nop
/*     */     //   1861: nop
/*     */     //   1862: checkcast kotlin/jvm/functions/Function1
/*     */     //   1865: astore #85
/*     */     //   1867: aload #62
/*     */     //   1869: invokeinterface endReplaceGroup : ()V
/*     */     //   1874: aload #85
/*     */     //   1876: aload #62
/*     */     //   1878: ldc_w 803280475
/*     */     //   1881: invokeinterface startReplaceGroup : (I)V
/*     */     //   1886: aload #62
/*     */     //   1888: astore #71
/*     */     //   1890: aload #4
/*     */     //   1892: aload #69
/*     */     //   1894: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1899: iload #6
/*     */     //   1901: bipush #112
/*     */     //   1903: iand
/*     */     //   1904: bipush #32
/*     */     //   1906: if_icmpne -> 1913
/*     */     //   1909: iconst_1
/*     */     //   1910: goto -> 1914
/*     */     //   1913: iconst_0
/*     */     //   1914: ior
/*     */     //   1915: istore #72
/*     */     //   1917: nop
/*     */     //   1918: iconst_0
/*     */     //   1919: istore #73
/*     */     //   1921: aload #71
/*     */     //   1923: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1928: astore #74
/*     */     //   1930: iconst_0
/*     */     //   1931: istore #75
/*     */     //   1933: iload #72
/*     */     //   1935: ifne -> 1949
/*     */     //   1938: aload #74
/*     */     //   1940: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1943: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1946: if_acmpne -> 2004
/*     */     //   1949: astore #86
/*     */     //   1951: astore #83
/*     */     //   1953: istore #76
/*     */     //   1955: lstore #77
/*     */     //   1957: lstore #79
/*     */     //   1959: astore #81
/*     */     //   1961: iconst_0
/*     */     //   1962: istore #82
/*     */     //   1964: aload #69
/*     */     //   1966: iload_1
/*     */     //   1967: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;Z)Lkotlin/jvm/functions/Function0;
/*     */     //   1972: astore #87
/*     */     //   1974: aload #81
/*     */     //   1976: lload #79
/*     */     //   1978: lload #77
/*     */     //   1980: iload #76
/*     */     //   1982: aload #83
/*     */     //   1984: aload #86
/*     */     //   1986: aload #87
/*     */     //   1988: astore #84
/*     */     //   1990: aload #71
/*     */     //   1992: aload #84
/*     */     //   1994: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1999: aload #84
/*     */     //   2001: goto -> 2006
/*     */     //   2004: aload #74
/*     */     //   2006: nop
/*     */     //   2007: nop
/*     */     //   2008: nop
/*     */     //   2009: checkcast kotlin/jvm/functions/Function0
/*     */     //   2012: astore #85
/*     */     //   2014: aload #62
/*     */     //   2016: invokeinterface endReplaceGroup : ()V
/*     */     //   2021: aload #85
/*     */     //   2023: aload #62
/*     */     //   2025: sipush #3072
/*     */     //   2028: iconst_0
/*     */     //   2029: invokestatic FileChangeChip-K2djEUw : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;JJZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*     */     //   2032: nop
/*     */     //   2033: nop
/*     */     //   2034: goto -> 1566
/*     */     //   2037: nop
/*     */     //   2038: aload #62
/*     */     //   2040: invokeinterface endReplaceGroup : ()V
/*     */     //   2045: nop
/*     */     //   2046: aload #59
/*     */     //   2048: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2051: aload #35
/*     */     //   2053: invokeinterface endNode : ()V
/*     */     //   2058: aload #35
/*     */     //   2060: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2063: nop
/*     */     //   2064: aload #35
/*     */     //   2066: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2069: nop
/*     */     //   2070: aload #35
/*     */     //   2072: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2075: nop
/*     */     //   2076: nop
/*     */     //   2077: aload #32
/*     */     //   2079: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2082: aload #4
/*     */     //   2084: invokeinterface endNode : ()V
/*     */     //   2089: aload #4
/*     */     //   2091: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2094: nop
/*     */     //   2095: aload #4
/*     */     //   2097: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2100: nop
/*     */     //   2101: aload #4
/*     */     //   2103: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2106: nop
/*     */     //   2107: aload #4
/*     */     //   2109: invokeinterface endReplaceGroup : ()V
/*     */     //   2114: aload #8
/*     */     //   2116: checkcast java/util/Collection
/*     */     //   2119: invokeinterface isEmpty : ()Z
/*     */     //   2124: ifne -> 2131
/*     */     //   2127: iconst_1
/*     */     //   2128: goto -> 2132
/*     */     //   2131: iconst_0
/*     */     //   2132: ifeq -> 4312
/*     */     //   2135: iconst_0
/*     */     //   2136: istore #13
/*     */     //   2138: nop
/*     */     //   2139: iconst_0
/*     */     //   2140: istore #14
/*     */     //   2142: aload #4
/*     */     //   2144: ldc_w 773894976
/*     */     //   2147: ldc_w 'CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp'
/*     */     //   2150: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2153: aload #4
/*     */     //   2155: astore #15
/*     */     //   2157: aload #4
/*     */     //   2159: ldc_w -954370320
/*     */     //   2162: ldc_w 'CC(remember):Effects.kt#9igjgp'
/*     */     //   2165: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2168: aload #4
/*     */     //   2170: astore #16
/*     */     //   2172: iconst_0
/*     */     //   2173: istore #17
/*     */     //   2175: iconst_0
/*     */     //   2176: istore #18
/*     */     //   2178: aload #16
/*     */     //   2180: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2185: astore #19
/*     */     //   2187: iconst_0
/*     */     //   2188: istore #20
/*     */     //   2190: aload #19
/*     */     //   2192: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2195: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2198: if_acmpne -> 2249
/*     */     //   2201: iconst_0
/*     */     //   2202: istore #21
/*     */     //   2204: iconst_0
/*     */     //   2205: istore #22
/*     */     //   2207: getstatic kotlin/coroutines/EmptyCoroutineContext.INSTANCE : Lkotlin/coroutines/EmptyCoroutineContext;
/*     */     //   2210: astore #90
/*     */     //   2212: aload #90
/*     */     //   2214: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   2217: aload #15
/*     */     //   2219: invokestatic createCompositionCoroutineScope : (Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;
/*     */     //   2222: astore #91
/*     */     //   2224: new androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*     */     //   2227: dup
/*     */     //   2228: aload #91
/*     */     //   2230: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;)V
/*     */     //   2233: astore #22
/*     */     //   2235: aload #16
/*     */     //   2237: aload #22
/*     */     //   2239: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2244: aload #22
/*     */     //   2246: goto -> 2251
/*     */     //   2249: aload #19
/*     */     //   2251: nop
/*     */     //   2252: nop
/*     */     //   2253: nop
/*     */     //   2254: checkcast androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*     */     //   2257: astore #23
/*     */     //   2259: aload #4
/*     */     //   2261: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2264: aload #23
/*     */     //   2266: astore #24
/*     */     //   2268: aload #24
/*     */     //   2270: invokevirtual getCoroutineScope : ()Lkotlinx/coroutines/CoroutineScope;
/*     */     //   2273: astore #23
/*     */     //   2275: aload #4
/*     */     //   2277: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2280: aload #23
/*     */     //   2282: nop
/*     */     //   2283: astore #11
/*     */     //   2285: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   2288: bipush #8
/*     */     //   2290: istore #13
/*     */     //   2292: iconst_0
/*     */     //   2293: istore #14
/*     */     //   2295: iload #13
/*     */     //   2297: i2f
/*     */     //   2298: invokestatic constructor-impl : (F)F
/*     */     //   2301: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   2304: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
/*     */     //   2307: astore #13
/*     */     //   2309: bipush #48
/*     */     //   2311: istore #15
/*     */     //   2313: iconst_0
/*     */     //   2314: istore #16
/*     */     //   2316: aload #4
/*     */     //   2318: ldc_w -483455358
/*     */     //   2321: ldc_w 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   2324: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2327: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   2330: checkcast androidx/compose/ui/Modifier
/*     */     //   2333: astore #12
/*     */     //   2335: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   2338: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   2341: astore #14
/*     */     //   2343: aload #13
/*     */     //   2345: aload #14
/*     */     //   2347: aload #4
/*     */     //   2349: bipush #14
/*     */     //   2351: iload #15
/*     */     //   2353: iconst_3
/*     */     //   2354: ishr
/*     */     //   2355: iand
/*     */     //   2356: bipush #112
/*     */     //   2358: iload #15
/*     */     //   2360: iconst_3
/*     */     //   2361: ishr
/*     */     //   2362: iand
/*     */     //   2363: ior
/*     */     //   2364: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2367: astore #17
/*     */     //   2369: bipush #112
/*     */     //   2371: iload #15
/*     */     //   2373: iconst_3
/*     */     //   2374: ishl
/*     */     //   2375: iand
/*     */     //   2376: istore #18
/*     */     //   2378: nop
/*     */     //   2379: iconst_0
/*     */     //   2380: istore #19
/*     */     //   2382: aload #4
/*     */     //   2384: ldc_w -1323940314
/*     */     //   2387: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   2390: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2393: aload #4
/*     */     //   2395: iconst_0
/*     */     //   2396: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   2399: istore #20
/*     */     //   2401: aload #4
/*     */     //   2403: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   2408: astore #21
/*     */     //   2410: aload #4
/*     */     //   2412: aload #12
/*     */     //   2414: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   2417: astore #22
/*     */     //   2419: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2422: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   2425: astore #23
/*     */     //   2427: bipush #6
/*     */     //   2429: sipush #896
/*     */     //   2432: iload #18
/*     */     //   2434: bipush #6
/*     */     //   2436: ishl
/*     */     //   2437: iand
/*     */     //   2438: ior
/*     */     //   2439: istore #24
/*     */     //   2441: nop
/*     */     //   2442: iconst_0
/*     */     //   2443: istore #25
/*     */     //   2445: aload #4
/*     */     //   2447: ldc_w -692256719
/*     */     //   2450: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   2453: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2456: aload #4
/*     */     //   2458: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   2463: instanceof androidx/compose/runtime/Applier
/*     */     //   2466: ifne -> 2472
/*     */     //   2469: invokestatic invalidApplier : ()V
/*     */     //   2472: aload #4
/*     */     //   2474: invokeinterface startReusableNode : ()V
/*     */     //   2479: aload #4
/*     */     //   2481: invokeinterface getInserting : ()Z
/*     */     //   2486: ifeq -> 2501
/*     */     //   2489: aload #4
/*     */     //   2491: aload #23
/*     */     //   2493: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   2498: goto -> 2508
/*     */     //   2501: aload #4
/*     */     //   2503: invokeinterface useNode : ()V
/*     */     //   2508: aload #4
/*     */     //   2510: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   2513: astore #26
/*     */     //   2515: iconst_0
/*     */     //   2516: istore #27
/*     */     //   2518: aload #26
/*     */     //   2520: aload #17
/*     */     //   2522: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2525: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2528: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2531: aload #26
/*     */     //   2533: aload #21
/*     */     //   2535: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2538: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2541: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2544: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2547: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2550: astore #28
/*     */     //   2552: iconst_0
/*     */     //   2553: istore #29
/*     */     //   2555: aload #26
/*     */     //   2557: astore #30
/*     */     //   2559: iconst_0
/*     */     //   2560: istore #31
/*     */     //   2562: aload #30
/*     */     //   2564: invokeinterface getInserting : ()Z
/*     */     //   2569: ifne -> 2590
/*     */     //   2572: aload #30
/*     */     //   2574: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2579: iload #20
/*     */     //   2581: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2584: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   2587: ifne -> 2616
/*     */     //   2590: aload #30
/*     */     //   2592: iload #20
/*     */     //   2594: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2597: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2602: aload #26
/*     */     //   2604: iload #20
/*     */     //   2606: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2609: aload #28
/*     */     //   2611: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2616: nop
/*     */     //   2617: nop
/*     */     //   2618: nop
/*     */     //   2619: aload #26
/*     */     //   2621: aload #22
/*     */     //   2623: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2626: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2629: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2632: nop
/*     */     //   2633: nop
/*     */     //   2634: aload #4
/*     */     //   2636: bipush #14
/*     */     //   2638: iload #24
/*     */     //   2640: bipush #6
/*     */     //   2642: ishr
/*     */     //   2643: iand
/*     */     //   2644: istore #32
/*     */     //   2646: astore #33
/*     */     //   2648: iconst_0
/*     */     //   2649: istore #34
/*     */     //   2651: aload #33
/*     */     //   2653: ldc_w -384784025
/*     */     //   2656: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   2659: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2662: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   2665: aload #33
/*     */     //   2667: bipush #6
/*     */     //   2669: bipush #112
/*     */     //   2671: iload #15
/*     */     //   2673: bipush #6
/*     */     //   2675: ishr
/*     */     //   2676: iand
/*     */     //   2677: ior
/*     */     //   2678: istore #35
/*     */     //   2680: astore #36
/*     */     //   2682: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   2685: astore #37
/*     */     //   2687: iconst_0
/*     */     //   2688: istore #38
/*     */     //   2690: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   2693: invokevirtual getSpaceBetween : ()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   2696: astore #39
/*     */     //   2698: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   2701: checkcast androidx/compose/ui/Modifier
/*     */     //   2704: fconst_0
/*     */     //   2705: iconst_1
/*     */     //   2706: aconst_null
/*     */     //   2707: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2710: astore #40
/*     */     //   2712: bipush #54
/*     */     //   2714: istore #41
/*     */     //   2716: iconst_0
/*     */     //   2717: istore #42
/*     */     //   2719: aload #36
/*     */     //   2721: ldc_w 693286680
/*     */     //   2724: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   2727: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2730: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   2733: invokevirtual getTop : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   2736: astore #43
/*     */     //   2738: aload #39
/*     */     //   2740: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*     */     //   2743: aload #43
/*     */     //   2745: aload #36
/*     */     //   2747: bipush #14
/*     */     //   2749: iload #41
/*     */     //   2751: iconst_3
/*     */     //   2752: ishr
/*     */     //   2753: iand
/*     */     //   2754: bipush #112
/*     */     //   2756: iload #41
/*     */     //   2758: iconst_3
/*     */     //   2759: ishr
/*     */     //   2760: iand
/*     */     //   2761: ior
/*     */     //   2762: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2765: astore #44
/*     */     //   2767: bipush #112
/*     */     //   2769: iload #41
/*     */     //   2771: iconst_3
/*     */     //   2772: ishl
/*     */     //   2773: iand
/*     */     //   2774: istore #45
/*     */     //   2776: nop
/*     */     //   2777: iconst_0
/*     */     //   2778: istore #46
/*     */     //   2780: aload #36
/*     */     //   2782: ldc_w -1323940314
/*     */     //   2785: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   2788: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2791: aload #36
/*     */     //   2793: iconst_0
/*     */     //   2794: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   2797: istore #47
/*     */     //   2799: aload #36
/*     */     //   2801: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   2806: astore #48
/*     */     //   2808: aload #36
/*     */     //   2810: aload #40
/*     */     //   2812: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   2815: astore #49
/*     */     //   2817: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2820: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   2823: astore #50
/*     */     //   2825: bipush #6
/*     */     //   2827: sipush #896
/*     */     //   2830: iload #45
/*     */     //   2832: bipush #6
/*     */     //   2834: ishl
/*     */     //   2835: iand
/*     */     //   2836: ior
/*     */     //   2837: istore #51
/*     */     //   2839: nop
/*     */     //   2840: iconst_0
/*     */     //   2841: istore #52
/*     */     //   2843: aload #36
/*     */     //   2845: ldc_w -692256719
/*     */     //   2848: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   2851: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2854: aload #36
/*     */     //   2856: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   2861: instanceof androidx/compose/runtime/Applier
/*     */     //   2864: ifne -> 2870
/*     */     //   2867: invokestatic invalidApplier : ()V
/*     */     //   2870: aload #36
/*     */     //   2872: invokeinterface startReusableNode : ()V
/*     */     //   2877: aload #36
/*     */     //   2879: invokeinterface getInserting : ()Z
/*     */     //   2884: ifeq -> 2899
/*     */     //   2887: aload #36
/*     */     //   2889: aload #50
/*     */     //   2891: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   2896: goto -> 2906
/*     */     //   2899: aload #36
/*     */     //   2901: invokeinterface useNode : ()V
/*     */     //   2906: aload #36
/*     */     //   2908: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   2911: astore #53
/*     */     //   2913: iconst_0
/*     */     //   2914: istore #54
/*     */     //   2916: aload #53
/*     */     //   2918: aload #44
/*     */     //   2920: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2923: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2926: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2929: aload #53
/*     */     //   2931: aload #48
/*     */     //   2933: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2936: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2939: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2942: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2945: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2948: astore #55
/*     */     //   2950: iconst_0
/*     */     //   2951: istore #56
/*     */     //   2953: aload #53
/*     */     //   2955: astore #57
/*     */     //   2957: iconst_0
/*     */     //   2958: istore #58
/*     */     //   2960: aload #57
/*     */     //   2962: invokeinterface getInserting : ()Z
/*     */     //   2967: ifne -> 2988
/*     */     //   2970: aload #57
/*     */     //   2972: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2977: iload #47
/*     */     //   2979: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2982: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   2985: ifne -> 3014
/*     */     //   2988: aload #57
/*     */     //   2990: iload #47
/*     */     //   2992: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2995: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   3000: aload #53
/*     */     //   3002: iload #47
/*     */     //   3004: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3007: aload #55
/*     */     //   3009: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3014: nop
/*     */     //   3015: nop
/*     */     //   3016: nop
/*     */     //   3017: aload #53
/*     */     //   3019: aload #49
/*     */     //   3021: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3024: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3027: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3030: nop
/*     */     //   3031: nop
/*     */     //   3032: aload #36
/*     */     //   3034: bipush #14
/*     */     //   3036: iload #51
/*     */     //   3038: bipush #6
/*     */     //   3040: ishr
/*     */     //   3041: iand
/*     */     //   3042: istore #59
/*     */     //   3044: astore #60
/*     */     //   3046: iconst_0
/*     */     //   3047: istore #61
/*     */     //   3049: aload #60
/*     */     //   3051: ldc_w -407840262
/*     */     //   3054: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   3057: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   3060: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   3063: aload #60
/*     */     //   3065: bipush #6
/*     */     //   3067: bipush #112
/*     */     //   3069: iload #41
/*     */     //   3071: bipush #6
/*     */     //   3073: ishr
/*     */     //   3074: iand
/*     */     //   3075: ior
/*     */     //   3076: istore #62
/*     */     //   3078: astore #63
/*     */     //   3080: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   3083: astore #64
/*     */     //   3085: iconst_0
/*     */     //   3086: istore #65
/*     */     //   3088: ldc_w 'New Files'
/*     */     //   3091: aconst_null
/*     */     //   3092: lconst_0
/*     */     //   3093: lconst_0
/*     */     //   3094: aconst_null
/*     */     //   3095: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
/*     */     //   3098: invokevirtual getBold : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   3101: aconst_null
/*     */     //   3102: lconst_0
/*     */     //   3103: aconst_null
/*     */     //   3104: iconst_0
/*     */     //   3105: lconst_0
/*     */     //   3106: iconst_0
/*     */     //   3107: iconst_0
/*     */     //   3108: iconst_0
/*     */     //   3109: aconst_null
/*     */     //   3110: aconst_null
/*     */     //   3111: aload #63
/*     */     //   3113: ldc_w 196614
/*     */     //   3116: iconst_0
/*     */     //   3117: ldc_w 65502
/*     */     //   3120: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   3123: aload #63
/*     */     //   3125: ldc_w 1516351714
/*     */     //   3128: invokeinterface startReplaceGroup : (I)V
/*     */     //   3133: iload_2
/*     */     //   3134: ifeq -> 3307
/*     */     //   3137: aload #10
/*     */     //   3139: invokestatic FileReport$lambda$3 : (Landroidx/compose/runtime/MutableState;)Ljava/util/Set;
/*     */     //   3142: invokeinterface size : ()I
/*     */     //   3147: aload #8
/*     */     //   3149: invokeinterface size : ()I
/*     */     //   3154: if_icmpeq -> 3307
/*     */     //   3157: ldc_w 'Add all to Git'
/*     */     //   3160: aload #63
/*     */     //   3162: ldc_w 1516355908
/*     */     //   3165: invokeinterface startReplaceGroup : (I)V
/*     */     //   3170: aload #63
/*     */     //   3172: astore #66
/*     */     //   3174: aload #4
/*     */     //   3176: aload #11
/*     */     //   3178: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   3183: aload #4
/*     */     //   3185: aload_3
/*     */     //   3186: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   3191: ior
/*     */     //   3192: aload #4
/*     */     //   3194: aload #8
/*     */     //   3196: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   3201: ior
/*     */     //   3202: istore #67
/*     */     //   3204: nop
/*     */     //   3205: iconst_0
/*     */     //   3206: istore #68
/*     */     //   3208: aload #66
/*     */     //   3210: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   3215: astore #69
/*     */     //   3217: iconst_0
/*     */     //   3218: istore #70
/*     */     //   3220: iload #67
/*     */     //   3222: ifne -> 3236
/*     */     //   3225: aload #69
/*     */     //   3227: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   3230: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   3233: if_acmpne -> 3272
/*     */     //   3236: astore #71
/*     */     //   3238: iconst_0
/*     */     //   3239: istore #72
/*     */     //   3241: aload #11
/*     */     //   3243: aload_3
/*     */     //   3244: aload #8
/*     */     //   3246: aload #10
/*     */     //   3248: <illegal opcode> invoke : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Ljava/util/List;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function0;
/*     */     //   3253: aload #71
/*     */     //   3255: swap
/*     */     //   3256: astore #73
/*     */     //   3258: aload #66
/*     */     //   3260: aload #73
/*     */     //   3262: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   3267: aload #73
/*     */     //   3269: goto -> 3274
/*     */     //   3272: aload #69
/*     */     //   3274: nop
/*     */     //   3275: nop
/*     */     //   3276: nop
/*     */     //   3277: checkcast kotlin/jvm/functions/Function0
/*     */     //   3280: astore #74
/*     */     //   3282: aload #63
/*     */     //   3284: invokeinterface endReplaceGroup : ()V
/*     */     //   3289: aload #74
/*     */     //   3291: aconst_null
/*     */     //   3292: iconst_0
/*     */     //   3293: aconst_null
/*     */     //   3294: iconst_0
/*     */     //   3295: aconst_null
/*     */     //   3296: aconst_null
/*     */     //   3297: aload #63
/*     */     //   3299: bipush #6
/*     */     //   3301: sipush #252
/*     */     //   3304: invokestatic Link-kye4rC8 : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/runtime/Composer;II)V
/*     */     //   3307: aload #63
/*     */     //   3309: invokeinterface endReplaceGroup : ()V
/*     */     //   3314: nop
/*     */     //   3315: aload #60
/*     */     //   3317: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3320: aload #36
/*     */     //   3322: invokeinterface endNode : ()V
/*     */     //   3327: aload #36
/*     */     //   3329: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3332: nop
/*     */     //   3333: aload #36
/*     */     //   3335: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3338: nop
/*     */     //   3339: aload #36
/*     */     //   3341: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3344: nop
/*     */     //   3345: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   3348: iconst_4
/*     */     //   3349: istore #40
/*     */     //   3351: iconst_0
/*     */     //   3352: istore #43
/*     */     //   3354: iload #40
/*     */     //   3356: i2f
/*     */     //   3357: invokestatic constructor-impl : (F)F
/*     */     //   3360: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   3363: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
/*     */     //   3366: astore #40
/*     */     //   3368: bipush #48
/*     */     //   3370: istore #41
/*     */     //   3372: iconst_0
/*     */     //   3373: istore #42
/*     */     //   3375: aload #36
/*     */     //   3377: ldc_w -483455358
/*     */     //   3380: ldc_w 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   3383: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   3386: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   3389: checkcast androidx/compose/ui/Modifier
/*     */     //   3392: astore #39
/*     */     //   3394: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   3397: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   3400: astore #43
/*     */     //   3402: aload #40
/*     */     //   3404: aload #43
/*     */     //   3406: aload #36
/*     */     //   3408: bipush #14
/*     */     //   3410: iload #41
/*     */     //   3412: iconst_3
/*     */     //   3413: ishr
/*     */     //   3414: iand
/*     */     //   3415: bipush #112
/*     */     //   3417: iload #41
/*     */     //   3419: iconst_3
/*     */     //   3420: ishr
/*     */     //   3421: iand
/*     */     //   3422: ior
/*     */     //   3423: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   3426: astore #44
/*     */     //   3428: bipush #112
/*     */     //   3430: iload #41
/*     */     //   3432: iconst_3
/*     */     //   3433: ishl
/*     */     //   3434: iand
/*     */     //   3435: istore #45
/*     */     //   3437: nop
/*     */     //   3438: iconst_0
/*     */     //   3439: istore #46
/*     */     //   3441: aload #36
/*     */     //   3443: ldc_w -1323940314
/*     */     //   3446: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   3449: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   3452: aload #36
/*     */     //   3454: iconst_0
/*     */     //   3455: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   3458: istore #47
/*     */     //   3460: aload #36
/*     */     //   3462: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   3467: astore #48
/*     */     //   3469: aload #36
/*     */     //   3471: aload #39
/*     */     //   3473: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   3476: astore #49
/*     */     //   3478: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3481: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   3484: astore #50
/*     */     //   3486: bipush #6
/*     */     //   3488: sipush #896
/*     */     //   3491: iload #45
/*     */     //   3493: bipush #6
/*     */     //   3495: ishl
/*     */     //   3496: iand
/*     */     //   3497: ior
/*     */     //   3498: istore #51
/*     */     //   3500: nop
/*     */     //   3501: iconst_0
/*     */     //   3502: istore #52
/*     */     //   3504: aload #36
/*     */     //   3506: ldc_w -692256719
/*     */     //   3509: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   3512: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   3515: aload #36
/*     */     //   3517: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   3522: instanceof androidx/compose/runtime/Applier
/*     */     //   3525: ifne -> 3531
/*     */     //   3528: invokestatic invalidApplier : ()V
/*     */     //   3531: aload #36
/*     */     //   3533: invokeinterface startReusableNode : ()V
/*     */     //   3538: aload #36
/*     */     //   3540: invokeinterface getInserting : ()Z
/*     */     //   3545: ifeq -> 3560
/*     */     //   3548: aload #36
/*     */     //   3550: aload #50
/*     */     //   3552: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   3557: goto -> 3567
/*     */     //   3560: aload #36
/*     */     //   3562: invokeinterface useNode : ()V
/*     */     //   3567: aload #36
/*     */     //   3569: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   3572: astore #53
/*     */     //   3574: iconst_0
/*     */     //   3575: istore #54
/*     */     //   3577: aload #53
/*     */     //   3579: aload #44
/*     */     //   3581: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3584: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3587: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3590: aload #53
/*     */     //   3592: aload #48
/*     */     //   3594: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3597: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3600: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3603: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3606: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3609: astore #55
/*     */     //   3611: iconst_0
/*     */     //   3612: istore #56
/*     */     //   3614: aload #53
/*     */     //   3616: astore #57
/*     */     //   3618: iconst_0
/*     */     //   3619: istore #58
/*     */     //   3621: aload #57
/*     */     //   3623: invokeinterface getInserting : ()Z
/*     */     //   3628: ifne -> 3649
/*     */     //   3631: aload #57
/*     */     //   3633: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   3638: iload #47
/*     */     //   3640: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3643: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   3646: ifne -> 3675
/*     */     //   3649: aload #57
/*     */     //   3651: iload #47
/*     */     //   3653: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3656: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   3661: aload #53
/*     */     //   3663: iload #47
/*     */     //   3665: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3668: aload #55
/*     */     //   3670: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3675: nop
/*     */     //   3676: nop
/*     */     //   3677: nop
/*     */     //   3678: aload #53
/*     */     //   3680: aload #49
/*     */     //   3682: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3685: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3688: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3691: nop
/*     */     //   3692: nop
/*     */     //   3693: aload #36
/*     */     //   3695: bipush #14
/*     */     //   3697: iload #51
/*     */     //   3699: bipush #6
/*     */     //   3701: ishr
/*     */     //   3702: iand
/*     */     //   3703: istore #59
/*     */     //   3705: astore #60
/*     */     //   3707: iconst_0
/*     */     //   3708: istore #61
/*     */     //   3710: aload #60
/*     */     //   3712: ldc_w -384784025
/*     */     //   3715: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   3718: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   3721: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   3724: aload #60
/*     */     //   3726: bipush #6
/*     */     //   3728: bipush #112
/*     */     //   3730: iload #41
/*     */     //   3732: bipush #6
/*     */     //   3734: ishr
/*     */     //   3735: iand
/*     */     //   3736: ior
/*     */     //   3737: istore #62
/*     */     //   3739: astore #63
/*     */     //   3741: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   3744: astore #64
/*     */     //   3746: iconst_0
/*     */     //   3747: istore #65
/*     */     //   3749: aload #63
/*     */     //   3751: ldc_w 1516366074
/*     */     //   3754: invokeinterface startReplaceGroup : (I)V
/*     */     //   3759: aload #8
/*     */     //   3761: checkcast java/lang/Iterable
/*     */     //   3764: astore #66
/*     */     //   3766: iconst_0
/*     */     //   3767: istore #67
/*     */     //   3769: aload #66
/*     */     //   3771: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   3776: astore #68
/*     */     //   3778: aload #68
/*     */     //   3780: invokeinterface hasNext : ()Z
/*     */     //   3785: ifeq -> 4242
/*     */     //   3788: aload #68
/*     */     //   3790: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   3795: astore #69
/*     */     //   3797: aload #69
/*     */     //   3799: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView
/*     */     //   3802: astore #70
/*     */     //   3804: iconst_0
/*     */     //   3805: istore #71
/*     */     //   3807: aload #10
/*     */     //   3809: invokestatic FileReport$lambda$3 : (Landroidx/compose/runtime/MutableState;)Ljava/util/Set;
/*     */     //   3812: aload #70
/*     */     //   3814: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   3819: istore #72
/*     */     //   3821: aload #70
/*     */     //   3823: iload #72
/*     */     //   3825: aload #63
/*     */     //   3827: ldc_w 803314882
/*     */     //   3830: invokeinterface startReplaceGroup : (I)V
/*     */     //   3835: aload #63
/*     */     //   3837: astore #73
/*     */     //   3839: aload #63
/*     */     //   3841: aload #70
/*     */     //   3843: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   3848: istore #74
/*     */     //   3850: nop
/*     */     //   3851: iconst_0
/*     */     //   3852: istore #75
/*     */     //   3854: aload #73
/*     */     //   3856: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   3861: astore #76
/*     */     //   3863: iconst_0
/*     */     //   3864: istore #77
/*     */     //   3866: iload #74
/*     */     //   3868: ifne -> 3882
/*     */     //   3871: aload #76
/*     */     //   3873: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   3876: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   3879: if_acmpne -> 3926
/*     */     //   3882: istore #78
/*     */     //   3884: astore #79
/*     */     //   3886: iconst_0
/*     */     //   3887: istore #80
/*     */     //   3889: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$5$2$1$1$1
/*     */     //   3892: dup
/*     */     //   3893: aload #70
/*     */     //   3895: aconst_null
/*     */     //   3896: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;Lkotlin/coroutines/Continuation;)V
/*     */     //   3899: checkcast kotlin/jvm/functions/Function1
/*     */     //   3902: astore #81
/*     */     //   3904: aload #79
/*     */     //   3906: iload #78
/*     */     //   3908: aload #81
/*     */     //   3910: astore #82
/*     */     //   3912: aload #73
/*     */     //   3914: aload #82
/*     */     //   3916: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   3921: aload #82
/*     */     //   3923: goto -> 3928
/*     */     //   3926: aload #76
/*     */     //   3928: nop
/*     */     //   3929: nop
/*     */     //   3930: nop
/*     */     //   3931: checkcast kotlin/jvm/functions/Function1
/*     */     //   3934: astore #83
/*     */     //   3936: aload #63
/*     */     //   3938: invokeinterface endReplaceGroup : ()V
/*     */     //   3943: aload #83
/*     */     //   3945: aload #63
/*     */     //   3947: ldc_w 803317412
/*     */     //   3950: invokeinterface startReplaceGroup : (I)V
/*     */     //   3955: aload #63
/*     */     //   3957: astore #73
/*     */     //   3959: aload #63
/*     */     //   3961: aload #70
/*     */     //   3963: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   3968: aload #63
/*     */     //   3970: aload #8
/*     */     //   3972: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   3977: ior
/*     */     //   3978: istore #74
/*     */     //   3980: nop
/*     */     //   3981: iconst_0
/*     */     //   3982: istore #75
/*     */     //   3984: aload #73
/*     */     //   3986: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   3991: astore #76
/*     */     //   3993: iconst_0
/*     */     //   3994: istore #77
/*     */     //   3996: iload #74
/*     */     //   3998: ifne -> 4012
/*     */     //   4001: aload #76
/*     */     //   4003: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   4006: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   4009: if_acmpne -> 4064
/*     */     //   4012: astore #81
/*     */     //   4014: istore #78
/*     */     //   4016: astore #79
/*     */     //   4018: iconst_0
/*     */     //   4019: istore #80
/*     */     //   4021: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$5$2$1$2$1
/*     */     //   4024: dup
/*     */     //   4025: aload #70
/*     */     //   4027: aload #8
/*     */     //   4029: aload #10
/*     */     //   4031: aconst_null
/*     */     //   4032: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;Ljava/util/List;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*     */     //   4035: checkcast kotlin/jvm/functions/Function1
/*     */     //   4038: astore #84
/*     */     //   4040: aload #79
/*     */     //   4042: iload #78
/*     */     //   4044: aload #81
/*     */     //   4046: aload #84
/*     */     //   4048: astore #82
/*     */     //   4050: aload #73
/*     */     //   4052: aload #82
/*     */     //   4054: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   4059: aload #82
/*     */     //   4061: goto -> 4066
/*     */     //   4064: aload #76
/*     */     //   4066: nop
/*     */     //   4067: nop
/*     */     //   4068: nop
/*     */     //   4069: checkcast kotlin/jvm/functions/Function1
/*     */     //   4072: astore #83
/*     */     //   4074: aload #63
/*     */     //   4076: invokeinterface endReplaceGroup : ()V
/*     */     //   4081: aload #83
/*     */     //   4083: aload #63
/*     */     //   4085: ldc_w 803323707
/*     */     //   4088: invokeinterface startReplaceGroup : (I)V
/*     */     //   4093: aload #63
/*     */     //   4095: astore #73
/*     */     //   4097: aload #4
/*     */     //   4099: aload #70
/*     */     //   4101: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   4106: iload #6
/*     */     //   4108: bipush #112
/*     */     //   4110: iand
/*     */     //   4111: bipush #32
/*     */     //   4113: if_icmpne -> 4120
/*     */     //   4116: iconst_1
/*     */     //   4117: goto -> 4121
/*     */     //   4120: iconst_0
/*     */     //   4121: ior
/*     */     //   4122: istore #74
/*     */     //   4124: nop
/*     */     //   4125: iconst_0
/*     */     //   4126: istore #75
/*     */     //   4128: aload #73
/*     */     //   4130: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   4135: astore #76
/*     */     //   4137: iconst_0
/*     */     //   4138: istore #77
/*     */     //   4140: iload #74
/*     */     //   4142: ifne -> 4156
/*     */     //   4145: aload #76
/*     */     //   4147: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   4150: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   4153: if_acmpne -> 4203
/*     */     //   4156: astore #84
/*     */     //   4158: astore #81
/*     */     //   4160: istore #78
/*     */     //   4162: astore #79
/*     */     //   4164: iconst_0
/*     */     //   4165: istore #80
/*     */     //   4167: aload #70
/*     */     //   4169: iload_1
/*     */     //   4170: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;Z)Lkotlin/jvm/functions/Function0;
/*     */     //   4175: astore #85
/*     */     //   4177: aload #79
/*     */     //   4179: iload #78
/*     */     //   4181: aload #81
/*     */     //   4183: aload #84
/*     */     //   4185: aload #85
/*     */     //   4187: astore #82
/*     */     //   4189: aload #73
/*     */     //   4191: aload #82
/*     */     //   4193: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   4198: aload #82
/*     */     //   4200: goto -> 4205
/*     */     //   4203: aload #76
/*     */     //   4205: nop
/*     */     //   4206: nop
/*     */     //   4207: nop
/*     */     //   4208: checkcast kotlin/jvm/functions/Function0
/*     */     //   4211: astore #83
/*     */     //   4213: aload #63
/*     */     //   4215: invokeinterface endReplaceGroup : ()V
/*     */     //   4220: aload #83
/*     */     //   4222: iload_2
/*     */     //   4223: aload #63
/*     */     //   4225: ldc_w 458752
/*     */     //   4228: iload #6
/*     */     //   4230: bipush #9
/*     */     //   4232: ishl
/*     */     //   4233: iand
/*     */     //   4234: invokestatic NewFileReport : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V
/*     */     //   4237: nop
/*     */     //   4238: nop
/*     */     //   4239: goto -> 3778
/*     */     //   4242: nop
/*     */     //   4243: aload #63
/*     */     //   4245: invokeinterface endReplaceGroup : ()V
/*     */     //   4250: nop
/*     */     //   4251: aload #60
/*     */     //   4253: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4256: aload #36
/*     */     //   4258: invokeinterface endNode : ()V
/*     */     //   4263: aload #36
/*     */     //   4265: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4268: nop
/*     */     //   4269: aload #36
/*     */     //   4271: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4274: nop
/*     */     //   4275: aload #36
/*     */     //   4277: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4280: nop
/*     */     //   4281: nop
/*     */     //   4282: aload #33
/*     */     //   4284: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4287: aload #4
/*     */     //   4289: invokeinterface endNode : ()V
/*     */     //   4294: aload #4
/*     */     //   4296: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4299: nop
/*     */     //   4300: aload #4
/*     */     //   4302: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4305: nop
/*     */     //   4306: aload #4
/*     */     //   4308: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4311: nop
/*     */     //   4312: invokestatic isTraceInProgress : ()Z
/*     */     //   4315: ifeq -> 4331
/*     */     //   4318: invokestatic traceEventEnd : ()V
/*     */     //   4321: goto -> 4331
/*     */     //   4324: aload #4
/*     */     //   4326: invokeinterface skipToGroupEnd : ()V
/*     */     //   4331: aload #4
/*     */     //   4333: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   4338: astore #7
/*     */     //   4340: aload #7
/*     */     //   4342: dup
/*     */     //   4343: ifnull -> 4365
/*     */     //   4346: aload_0
/*     */     //   4347: iload_1
/*     */     //   4348: iload_2
/*     */     //   4349: aload_3
/*     */     //   4350: iload #5
/*     */     //   4352: <illegal opcode> invoke : (Ljava/util/List;ZZLkotlin/jvm/functions/Function1;I)Lkotlin/jvm/functions/Function2;
/*     */     //   4357: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   4362: goto -> 4366
/*     */     //   4365: pop
/*     */     //   4366: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #103	-> 12
/*     */     //   #104	-> 193
/*     */     //   #186	-> 202
/*     */     //   #187	-> 211
/*     */     //   #188	-> 220
/*     */     //   #189	-> 248
/*     */     //   #105	-> 258
/*     */     //   #189	-> 263
/*     */     //   #190	-> 266
/*     */     //   #192	-> 277
/*     */     //   #195	-> 288
/*     */     //   #104	-> 299
/*     */     //   #108	-> 337
/*     */     //   #196	-> 341
/*     */     //   #197	-> 353
/*     */     //   #198	-> 364
/*     */     //   #108	-> 367
/*     */     //   #108	-> 370
/*     */     //   #198	-> 376
/*     */     //   #199	-> 378
/*     */     //   #200	-> 387
/*     */     //   #201	-> 392
/*     */     //   #197	-> 394
/*     */     //   #196	-> 395
/*     */     //   #196	-> 396
/*     */     //   #108	-> 397
/*     */     //   #110	-> 413
/*     */     //   #202	-> 443
/*     */     //   #203	-> 455
/*     */     //   #204	-> 471
/*     */     //   #110	-> 476
/*     */     //   #204	-> 497
/*     */     //   #205	-> 499
/*     */     //   #206	-> 508
/*     */     //   #207	-> 513
/*     */     //   #203	-> 515
/*     */     //   #202	-> 516
/*     */     //   #202	-> 517
/*     */     //   #110	-> 518
/*     */     //   #114	-> 539
/*     */     //   #208	-> 568
/*     */     //   #209	-> 580
/*     */     //   #210	-> 596
/*     */     //   #114	-> 601
/*     */     //   #210	-> 622
/*     */     //   #211	-> 624
/*     */     //   #212	-> 633
/*     */     //   #213	-> 638
/*     */     //   #209	-> 640
/*     */     //   #208	-> 641
/*     */     //   #208	-> 642
/*     */     //   #114	-> 643
/*     */     //   #123	-> 672
/*     */     //   #123	-> 690
/*     */     //   #124	-> 693
/*     */     //   #214	-> 703
/*     */     //   #124	-> 709
/*     */     //   #215	-> 732
/*     */     //   #216	-> 735
/*     */     //   #218	-> 743
/*     */     //   #221	-> 751
/*     */     //   #222	-> 786
/*     */     //   #223	-> 798
/*     */     //   #224	-> 804
/*     */     //   #225	-> 811
/*     */     //   #226	-> 820
/*     */     //   #228	-> 827
/*     */     //   #227	-> 849
/*     */     //   #229	-> 861
/*     */     //   #230	-> 864
/*     */     //   #231	-> 882
/*     */     //   #232	-> 887
/*     */     //   #233	-> 899
/*     */     //   #235	-> 911
/*     */     //   #237	-> 916
/*     */     //   #238	-> 926
/*     */     //   #239	-> 939
/*     */     //   #241	-> 952
/*     */     //   #242	-> 963
/*     */     //   #243	-> 970
/*     */     //   #244	-> 998
/*     */     //   #245	-> 1010
/*     */     //   #247	-> 1024
/*     */     //   #242	-> 1025
/*     */     //   #247	-> 1026
/*     */     //   #248	-> 1027
/*     */     //   #249	-> 1040
/*     */     //   #237	-> 1041
/*     */     //   #250	-> 1042
/*     */     //   #251	-> 1067
/*     */     //   #126	-> 1098
/*     */     //   #127	-> 1105
/*     */     //   #125	-> 1130
/*     */     //   #129	-> 1133
/*     */     //   #252	-> 1142
/*     */     //   #129	-> 1148
/*     */     //   #253	-> 1171
/*     */     //   #254	-> 1174
/*     */     //   #256	-> 1182
/*     */     //   #259	-> 1190
/*     */     //   #260	-> 1225
/*     */     //   #261	-> 1237
/*     */     //   #262	-> 1243
/*     */     //   #263	-> 1250
/*     */     //   #264	-> 1259
/*     */     //   #266	-> 1266
/*     */     //   #265	-> 1288
/*     */     //   #267	-> 1300
/*     */     //   #268	-> 1303
/*     */     //   #269	-> 1321
/*     */     //   #270	-> 1326
/*     */     //   #271	-> 1338
/*     */     //   #273	-> 1350
/*     */     //   #275	-> 1355
/*     */     //   #276	-> 1365
/*     */     //   #277	-> 1378
/*     */     //   #279	-> 1391
/*     */     //   #280	-> 1402
/*     */     //   #281	-> 1409
/*     */     //   #282	-> 1437
/*     */     //   #283	-> 1449
/*     */     //   #285	-> 1463
/*     */     //   #280	-> 1464
/*     */     //   #285	-> 1465
/*     */     //   #286	-> 1466
/*     */     //   #287	-> 1479
/*     */     //   #275	-> 1480
/*     */     //   #288	-> 1481
/*     */     //   #289	-> 1506
/*     */     //   #130	-> 1547
/*     */     //   #290	-> 1557
/*     */     //   #132	-> 1595
/*     */     //   #133	-> 1600
/*     */     //   #134	-> 1609
/*     */     //   #135	-> 1615
/*     */     //   #136	-> 1641
/*     */     //   #291	-> 1645
/*     */     //   #292	-> 1657
/*     */     //   #293	-> 1673
/*     */     //   #136	-> 1684
/*     */     //   #293	-> 1709
/*     */     //   #294	-> 1711
/*     */     //   #295	-> 1720
/*     */     //   #296	-> 1725
/*     */     //   #292	-> 1727
/*     */     //   #291	-> 1728
/*     */     //   #291	-> 1729
/*     */     //   #136	-> 1730
/*     */     //   #137	-> 1769
/*     */     //   #297	-> 1773
/*     */     //   #298	-> 1785
/*     */     //   #299	-> 1801
/*     */     //   #137	-> 1814
/*     */     //   #299	-> 1841
/*     */     //   #300	-> 1843
/*     */     //   #301	-> 1852
/*     */     //   #302	-> 1857
/*     */     //   #298	-> 1859
/*     */     //   #297	-> 1860
/*     */     //   #297	-> 1861
/*     */     //   #137	-> 1862
/*     */     //   #138	-> 1917
/*     */     //   #303	-> 1921
/*     */     //   #304	-> 1933
/*     */     //   #305	-> 1949
/*     */     //   #138	-> 1964
/*     */     //   #305	-> 1988
/*     */     //   #306	-> 1990
/*     */     //   #307	-> 1999
/*     */     //   #308	-> 2004
/*     */     //   #304	-> 2006
/*     */     //   #303	-> 2007
/*     */     //   #303	-> 2008
/*     */     //   #138	-> 2009
/*     */     //   #131	-> 2029
/*     */     //   #140	-> 2032
/*     */     //   #290	-> 2033
/*     */     //   #309	-> 2037
/*     */     //   #141	-> 2045
/*     */     //   #289	-> 2046
/*     */     //   #288	-> 2051
/*     */     //   #310	-> 2053
/*     */     //   #267	-> 2060
/*     */     //   #311	-> 2063
/*     */     //   #261	-> 2066
/*     */     //   #312	-> 2069
/*     */     //   #253	-> 2072
/*     */     //   #313	-> 2075
/*     */     //   #142	-> 2076
/*     */     //   #251	-> 2077
/*     */     //   #250	-> 2082
/*     */     //   #314	-> 2084
/*     */     //   #229	-> 2091
/*     */     //   #315	-> 2094
/*     */     //   #223	-> 2097
/*     */     //   #316	-> 2100
/*     */     //   #215	-> 2103
/*     */     //   #317	-> 2106
/*     */     //   #144	-> 2114
/*     */     //   #144	-> 2132
/*     */     //   #145	-> 2138
/*     */     //   #318	-> 2150
/*     */     //   #319	-> 2153
/*     */     //   #321	-> 2155
/*     */     //   #322	-> 2165
/*     */     //   #323	-> 2178
/*     */     //   #324	-> 2190
/*     */     //   #325	-> 2201
/*     */     //   #326	-> 2204
/*     */     //   #327	-> 2204
/*     */     //   #328	-> 2207
/*     */     //   #327	-> 2214
/*     */     //   #326	-> 2222
/*     */     //   #325	-> 2233
/*     */     //   #329	-> 2235
/*     */     //   #330	-> 2244
/*     */     //   #331	-> 2249
/*     */     //   #324	-> 2251
/*     */     //   #323	-> 2252
/*     */     //   #323	-> 2253
/*     */     //   #322	-> 2254
/*     */     //   #332	-> 2268
/*     */     //   #318	-> 2277
/*     */     //   #332	-> 2282
/*     */     //   #145	-> 2283
/*     */     //   #146	-> 2285
/*     */     //   #333	-> 2295
/*     */     //   #146	-> 2301
/*     */     //   #334	-> 2324
/*     */     //   #335	-> 2327
/*     */     //   #337	-> 2335
/*     */     //   #340	-> 2343
/*     */     //   #341	-> 2378
/*     */     //   #342	-> 2390
/*     */     //   #343	-> 2396
/*     */     //   #344	-> 2403
/*     */     //   #345	-> 2412
/*     */     //   #347	-> 2419
/*     */     //   #346	-> 2441
/*     */     //   #348	-> 2453
/*     */     //   #349	-> 2456
/*     */     //   #350	-> 2474
/*     */     //   #351	-> 2479
/*     */     //   #352	-> 2491
/*     */     //   #354	-> 2503
/*     */     //   #356	-> 2508
/*     */     //   #357	-> 2518
/*     */     //   #358	-> 2531
/*     */     //   #360	-> 2544
/*     */     //   #361	-> 2555
/*     */     //   #362	-> 2562
/*     */     //   #363	-> 2590
/*     */     //   #364	-> 2602
/*     */     //   #366	-> 2616
/*     */     //   #361	-> 2617
/*     */     //   #366	-> 2618
/*     */     //   #367	-> 2619
/*     */     //   #368	-> 2632
/*     */     //   #356	-> 2633
/*     */     //   #369	-> 2634
/*     */     //   #370	-> 2659
/*     */     //   #147	-> 2690
/*     */     //   #371	-> 2727
/*     */     //   #372	-> 2730
/*     */     //   #375	-> 2738
/*     */     //   #376	-> 2776
/*     */     //   #377	-> 2788
/*     */     //   #378	-> 2794
/*     */     //   #379	-> 2801
/*     */     //   #380	-> 2810
/*     */     //   #382	-> 2817
/*     */     //   #381	-> 2839
/*     */     //   #383	-> 2851
/*     */     //   #384	-> 2854
/*     */     //   #385	-> 2872
/*     */     //   #386	-> 2877
/*     */     //   #387	-> 2889
/*     */     //   #389	-> 2901
/*     */     //   #391	-> 2906
/*     */     //   #392	-> 2916
/*     */     //   #393	-> 2929
/*     */     //   #395	-> 2942
/*     */     //   #396	-> 2953
/*     */     //   #397	-> 2960
/*     */     //   #398	-> 2988
/*     */     //   #399	-> 3000
/*     */     //   #401	-> 3014
/*     */     //   #396	-> 3015
/*     */     //   #401	-> 3016
/*     */     //   #402	-> 3017
/*     */     //   #403	-> 3030
/*     */     //   #391	-> 3031
/*     */     //   #404	-> 3032
/*     */     //   #405	-> 3057
/*     */     //   #149	-> 3088
/*     */     //   #150	-> 3095
/*     */     //   #148	-> 3120
/*     */     //   #152	-> 3133
/*     */     //   #154	-> 3157
/*     */     //   #155	-> 3204
/*     */     //   #406	-> 3208
/*     */     //   #407	-> 3220
/*     */     //   #408	-> 3236
/*     */     //   #155	-> 3241
/*     */     //   #408	-> 3256
/*     */     //   #409	-> 3258
/*     */     //   #410	-> 3267
/*     */     //   #411	-> 3272
/*     */     //   #407	-> 3274
/*     */     //   #406	-> 3275
/*     */     //   #406	-> 3276
/*     */     //   #155	-> 3277
/*     */     //   #153	-> 3304
/*     */     //   #163	-> 3314
/*     */     //   #405	-> 3315
/*     */     //   #404	-> 3320
/*     */     //   #412	-> 3322
/*     */     //   #383	-> 3329
/*     */     //   #413	-> 3332
/*     */     //   #377	-> 3335
/*     */     //   #414	-> 3338
/*     */     //   #371	-> 3341
/*     */     //   #415	-> 3344
/*     */     //   #164	-> 3345
/*     */     //   #416	-> 3354
/*     */     //   #164	-> 3360
/*     */     //   #417	-> 3383
/*     */     //   #418	-> 3386
/*     */     //   #420	-> 3394
/*     */     //   #423	-> 3402
/*     */     //   #424	-> 3437
/*     */     //   #425	-> 3449
/*     */     //   #426	-> 3455
/*     */     //   #427	-> 3462
/*     */     //   #428	-> 3471
/*     */     //   #430	-> 3478
/*     */     //   #429	-> 3500
/*     */     //   #431	-> 3512
/*     */     //   #432	-> 3515
/*     */     //   #433	-> 3533
/*     */     //   #434	-> 3538
/*     */     //   #435	-> 3550
/*     */     //   #437	-> 3562
/*     */     //   #439	-> 3567
/*     */     //   #440	-> 3577
/*     */     //   #441	-> 3590
/*     */     //   #443	-> 3603
/*     */     //   #444	-> 3614
/*     */     //   #445	-> 3621
/*     */     //   #446	-> 3649
/*     */     //   #447	-> 3661
/*     */     //   #449	-> 3675
/*     */     //   #444	-> 3676
/*     */     //   #449	-> 3677
/*     */     //   #450	-> 3678
/*     */     //   #451	-> 3691
/*     */     //   #439	-> 3692
/*     */     //   #452	-> 3693
/*     */     //   #453	-> 3718
/*     */     //   #165	-> 3759
/*     */     //   #454	-> 3769
/*     */     //   #166	-> 3807
/*     */     //   #169	-> 3821
/*     */     //   #170	-> 3823
/*     */     //   #172	-> 3850
/*     */     //   #455	-> 3854
/*     */     //   #456	-> 3866
/*     */     //   #457	-> 3882
/*     */     //   #172	-> 3889
/*     */     //   #457	-> 3910
/*     */     //   #458	-> 3912
/*     */     //   #459	-> 3921
/*     */     //   #460	-> 3926
/*     */     //   #456	-> 3928
/*     */     //   #455	-> 3929
/*     */     //   #455	-> 3930
/*     */     //   #172	-> 3931
/*     */     //   #173	-> 3980
/*     */     //   #461	-> 3984
/*     */     //   #462	-> 3996
/*     */     //   #463	-> 4012
/*     */     //   #173	-> 4021
/*     */     //   #463	-> 4048
/*     */     //   #464	-> 4050
/*     */     //   #465	-> 4059
/*     */     //   #466	-> 4064
/*     */     //   #462	-> 4066
/*     */     //   #461	-> 4067
/*     */     //   #461	-> 4068
/*     */     //   #173	-> 4069
/*     */     //   #177	-> 4124
/*     */     //   #467	-> 4128
/*     */     //   #468	-> 4140
/*     */     //   #469	-> 4156
/*     */     //   #177	-> 4167
/*     */     //   #469	-> 4187
/*     */     //   #470	-> 4189
/*     */     //   #471	-> 4198
/*     */     //   #472	-> 4203
/*     */     //   #468	-> 4205
/*     */     //   #467	-> 4206
/*     */     //   #467	-> 4207
/*     */     //   #177	-> 4208
/*     */     //   #171	-> 4222
/*     */     //   #168	-> 4234
/*     */     //   #179	-> 4237
/*     */     //   #454	-> 4238
/*     */     //   #473	-> 4242
/*     */     //   #180	-> 4250
/*     */     //   #453	-> 4251
/*     */     //   #452	-> 4256
/*     */     //   #474	-> 4258
/*     */     //   #431	-> 4265
/*     */     //   #475	-> 4268
/*     */     //   #425	-> 4271
/*     */     //   #476	-> 4274
/*     */     //   #417	-> 4277
/*     */     //   #477	-> 4280
/*     */     //   #181	-> 4281
/*     */     //   #370	-> 4282
/*     */     //   #369	-> 4287
/*     */     //   #478	-> 4289
/*     */     //   #348	-> 4296
/*     */     //   #479	-> 4299
/*     */     //   #342	-> 4302
/*     */     //   #480	-> 4305
/*     */     //   #334	-> 4308
/*     */     //   #481	-> 4311
/*     */     //   #183	-> 4324
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   258	5	15	$i$a$-partition-ReportKt$FileReport$1	I
/*     */     //   255	8	14	it	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*     */     //   248	37	13	element$iv	Ljava/lang/Object;
/*     */     //   202	97	9	$i$f$partition	I
/*     */     //   211	88	10	first$iv	Ljava/util/ArrayList;
/*     */     //   220	79	11	second$iv	Ljava/util/ArrayList;
/*     */     //   199	100	8	$this$partition$iv	Ljava/lang/Iterable;
/*     */     //   367	9	17	$i$a$-cache-ReportKt$FileReport$commitedFiles$2	I
/*     */     //   378	11	17	value$iv	Ljava/lang/Object;
/*     */     //   353	42	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   350	45	15	it$iv	Ljava/lang/Object;
/*     */     //   341	56	14	$i$f$cache	I
/*     */     //   338	59	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   338	59	13	invalid$iv	Z
/*     */     //   476	15	17	$i$a$-cache-ReportKt$FileReport$2	I
/*     */     //   499	11	18	value$iv	Ljava/lang/Object;
/*     */     //   455	61	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   452	64	15	it$iv	Ljava/lang/Object;
/*     */     //   443	75	14	$i$f$cache	I
/*     */     //   440	78	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   440	78	13	invalid$iv	Z
/*     */     //   601	15	17	$i$a$-cache-ReportKt$FileReport$3	I
/*     */     //   624	11	18	value$iv	Ljava/lang/Object;
/*     */     //   580	61	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   577	64	15	it$iv	Ljava/lang/Object;
/*     */     //   568	75	14	$i$f$cache	I
/*     */     //   565	78	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   565	78	13	invalid$iv	Z
/*     */     //   703	6	13	$i$f$getDp	I
/*     */     //   700	9	12	$this$dp$iv	I
/*     */     //   1142	6	39	$i$f$getDp	I
/*     */     //   1139	9	38	$this$dp$iv	I
/*     */     //   1684	13	82	$i$a$-cache-ReportKt$FileReport$4$1$1$1	I
/*     */     //   1711	11	84	value$iv	Ljava/lang/Object;
/*     */     //   1657	71	75	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1654	74	74	it$iv	Ljava/lang/Object;
/*     */     //   1645	85	73	$i$f$cache	I
/*     */     //   1642	88	71	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1642	88	72	invalid$iv	Z
/*     */     //   1814	13	82	$i$a$-cache-ReportKt$FileReport$4$1$1$2	I
/*     */     //   1843	11	84	value$iv	Ljava/lang/Object;
/*     */     //   1785	75	75	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1782	78	74	it$iv	Ljava/lang/Object;
/*     */     //   1773	89	73	$i$f$cache	I
/*     */     //   1770	92	71	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1770	92	72	invalid$iv	Z
/*     */     //   1964	8	82	$i$a$-cache-ReportKt$FileReport$4$1$1$3	I
/*     */     //   1990	11	84	value$iv	Ljava/lang/Object;
/*     */     //   1933	74	75	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1930	77	74	it$iv	Ljava/lang/Object;
/*     */     //   1921	88	73	$i$f$cache	I
/*     */     //   1918	91	71	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1918	91	72	invalid$iv	Z
/*     */     //   1595	438	70	$i$a$-forEach-ReportKt$FileReport$4$1$1	I
/*     */     //   1592	441	69	file	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*     */     //   1585	449	68	element$iv	Ljava/lang/Object;
/*     */     //   1557	481	66	$i$f$forEach	I
/*     */     //   1554	484	65	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   1537	509	64	$i$a$-Column-ReportKt$FileReport$4$1	I
/*     */     //   1534	512	63	$this$FileReport_u24lambda_u2413_u24lambda_u2412	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   1534	512	62	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1534	512	61	$changed	I
/*     */     //   1498	553	60	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   1495	556	59	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1495	556	58	$changed$iv	I
/*     */     //   1409	55	57	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1406	58	56	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1402	64	55	$i$f$set-impl	I
/*     */     //   1399	67	54	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1365	115	53	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1362	118	52	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1292	772	51	$i$f$ReusableComposeNode	I
/*     */     //   1289	775	49	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1289	775	50	$changed$iv$iv$iv	I
/*     */     //   1229	841	45	$i$f$Layout	I
/*     */     //   1248	822	46	compositeKeyHash$iv$iv	I
/*     */     //   1257	813	47	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1266	804	48	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1226	844	44	$changed$iv$iv	I
/*     */     //   1163	913	41	$i$f$Column	I
/*     */     //   1216	860	43	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1182	894	42	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1160	916	38	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   1190	886	39	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   1160	916	40	$changed$iv	I
/*     */     //   1098	979	37	$i$a$-Column-ReportKt$FileReport$4	I
/*     */     //   1095	982	36	$this$FileReport_u24lambda_u2413	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   1095	982	35	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1095	982	34	$changed	I
/*     */     //   1059	1023	33	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   1056	1026	32	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1056	1026	31	$changed$iv	I
/*     */     //   970	55	30	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   967	58	29	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   963	64	28	$i$f$set-impl	I
/*     */     //   960	67	27	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   926	115	26	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   923	118	25	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   853	1242	24	$i$f$ReusableComposeNode	I
/*     */     //   850	1245	22	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   850	1245	23	$changed$iv$iv$iv	I
/*     */     //   790	1311	18	$i$f$Layout	I
/*     */     //   809	1292	19	compositeKeyHash$iv$iv	I
/*     */     //   818	1283	20	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   827	1274	21	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   787	1314	17	$changed$iv$iv	I
/*     */     //   724	1383	15	$i$f$Column	I
/*     */     //   777	1330	16	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   743	1364	11	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   721	1386	12	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   751	1356	13	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   721	1386	14	$changed$iv	I
/*     */     //   2207	3	22	$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1	I
/*     */     //   2204	29	21	$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv	I
/*     */     //   2235	11	22	value$iv$iv	Ljava/lang/Object;
/*     */     //   2190	62	20	$i$a$-let-ComposerKt$cache$1$iv$iv	I
/*     */     //   2187	65	19	it$iv$iv	Ljava/lang/Object;
/*     */     //   2178	76	18	$i$f$cache	I
/*     */     //   2175	79	16	$this$cache$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2175	79	17	invalid$iv$iv	Z
/*     */     //   2142	141	14	$i$f$rememberCoroutineScope	I
/*     */     //   2157	126	15	composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2268	15	24	wrapper$iv	Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
/*     */     //   2139	144	13	$changed$iv	I
/*     */     //   2295	6	14	$i$f$getDp	I
/*     */     //   2292	9	13	$this$dp$iv	I
/*     */     //   3241	12	72	$i$a$-cache-ReportKt$FileReport$5$1$1	I
/*     */     //   3258	11	73	value$iv	Ljava/lang/Object;
/*     */     //   3220	55	70	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   3217	58	69	it$iv	Ljava/lang/Object;
/*     */     //   3208	69	68	$i$f$cache	I
/*     */     //   3205	72	66	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3205	72	67	invalid$iv	Z
/*     */     //   3088	227	65	$i$a$-Row-ReportKt$FileReport$5$1	I
/*     */     //   3085	230	64	$this$FileReport_u24lambda_u2423_u24lambda_u2416	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   3085	230	63	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   3085	230	62	$changed	I
/*     */     //   3049	271	61	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   3046	274	60	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3046	274	59	$changed$iv	I
/*     */     //   2960	55	58	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   2957	58	57	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2953	64	56	$i$f$set-impl	I
/*     */     //   2950	67	55	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   2916	115	54	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   2913	118	53	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2843	490	52	$i$f$ReusableComposeNode	I
/*     */     //   2840	493	50	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   2840	493	51	$changed$iv$iv$iv	I
/*     */     //   2780	559	46	$i$f$Layout	I
/*     */     //   2799	540	47	compositeKeyHash$iv$iv	I
/*     */     //   2808	531	48	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   2817	522	49	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2777	562	45	$changed$iv$iv	I
/*     */     //   2719	626	42	$i$f$Row	I
/*     */     //   2767	578	44	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2738	607	43	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   2716	629	41	$changed$iv	I
/*     */     //   3354	6	43	$i$f$getDp	I
/*     */     //   3351	9	40	$this$dp$iv	I
/*     */     //   3889	13	80	$i$a$-cache-ReportKt$FileReport$5$2$1$1	I
/*     */     //   3912	11	82	value$iv	Ljava/lang/Object;
/*     */     //   3866	63	77	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   3863	66	76	it$iv	Ljava/lang/Object;
/*     */     //   3854	77	75	$i$f$cache	I
/*     */     //   3851	80	73	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3851	80	74	invalid$iv	Z
/*     */     //   4021	17	80	$i$a$-cache-ReportKt$FileReport$5$2$1$2	I
/*     */     //   4050	11	82	value$iv	Ljava/lang/Object;
/*     */     //   3996	71	77	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   3993	74	76	it$iv	Ljava/lang/Object;
/*     */     //   3984	85	75	$i$f$cache	I
/*     */     //   3981	88	73	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3981	88	74	invalid$iv	Z
/*     */     //   4167	8	80	$i$a$-cache-ReportKt$FileReport$5$2$1$3	I
/*     */     //   4189	11	82	value$iv	Ljava/lang/Object;
/*     */     //   4140	66	77	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   4137	69	76	it$iv	Ljava/lang/Object;
/*     */     //   4128	80	75	$i$f$cache	I
/*     */     //   4125	83	73	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   4125	83	74	invalid$iv	Z
/*     */     //   3807	431	71	$i$a$-forEach-ReportKt$FileReport$5$2$1	I
/*     */     //   3821	417	72	isFileCommitted	Z
/*     */     //   3804	434	70	file	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*     */     //   3797	442	69	element$iv	Ljava/lang/Object;
/*     */     //   3769	474	67	$i$f$forEach	I
/*     */     //   3766	477	66	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   3749	502	65	$i$a$-Column-ReportKt$FileReport$5$2	I
/*     */     //   3746	505	64	$this$FileReport_u24lambda_u2423_u24lambda_u2422	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   3746	505	63	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   3746	505	62	$changed	I
/*     */     //   3710	546	61	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   3707	549	60	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3707	549	59	$changed$iv	I
/*     */     //   3621	55	58	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   3618	58	57	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3614	64	56	$i$f$set-impl	I
/*     */     //   3611	67	55	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   3577	115	54	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   3574	118	53	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3504	765	52	$i$f$ReusableComposeNode	I
/*     */     //   3501	768	50	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   3501	768	51	$changed$iv$iv$iv	I
/*     */     //   3441	834	46	$i$f$Layout	I
/*     */     //   3460	815	47	compositeKeyHash$iv$iv	I
/*     */     //   3469	806	48	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   3478	797	49	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   3438	837	45	$changed$iv$iv	I
/*     */     //   3375	906	42	$i$f$Column	I
/*     */     //   3428	853	44	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   3394	887	39	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   3372	909	40	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   3402	879	43	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   3372	909	41	$changed$iv	I
/*     */     //   2690	1592	38	$i$a$-Column-ReportKt$FileReport$5	I
/*     */     //   2687	1595	37	$this$FileReport_u24lambda_u2423	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   2687	1595	36	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   2687	1595	35	$changed	I
/*     */     //   2651	1636	34	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   2648	1639	33	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2648	1639	32	$changed$iv	I
/*     */     //   2562	55	31	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   2559	58	30	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2555	64	29	$i$f$set-impl	I
/*     */     //   2552	67	28	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   2518	115	27	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   2515	118	26	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2445	1855	25	$i$f$ReusableComposeNode	I
/*     */     //   2442	1858	23	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   2442	1858	24	$changed$iv$iv$iv	I
/*     */     //   2382	1924	19	$i$f$Layout	I
/*     */     //   2401	1905	20	compositeKeyHash$iv$iv	I
/*     */     //   2410	1896	21	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   2419	1887	22	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2379	1927	18	$changed$iv$iv	I
/*     */     //   2316	1996	16	$i$f$Column	I
/*     */     //   2369	1943	17	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2335	1977	12	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2313	1999	13	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   2343	1969	14	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   2313	1999	15	$changed$iv	I
/*     */     //   2285	2027	11	scope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   311	4010	8	newFiles	Ljava/util/List;
/*     */     //   321	4000	9	changedFiles	Ljava/util/List;
/*     */     //   413	3908	10	commitedFiles$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   27	4340	6	$dirty	I
/*     */     //   0	4367	0	changes	Ljava/util/List;
/*     */     //   0	4367	1	wantEditableDiff	Z
/*     */     //   0	4367	2	isProjectOnVCS	Z
/*     */     //   0	4367	3	onChangeAllVcsStatus	Lkotlin/jvm/functions/Function1;
/*     */     //   0	4367	4	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	4367	5	$changed	I
/*     */   }
/*     */   
/*     */   private static final Set<FileChangeView> FileReport$lambda$3(MutableState $commitedFiles$delegate) {
/* 108 */     State state = (State)$commitedFiles$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 482 */       (Set<FileChangeView>)state.getValue(); } private static final void FileReport$lambda$4(MutableState $commitedFiles$delegate, Set <set-?>) { MutableState mutableState = $commitedFiles$delegate; Object object = null; KProperty property$iv = null; int $i$f$setValue = 0;
/* 483 */     mutableState.setValue(<set-?>); }
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "Report.kt", l = {111}, i = {0, 0}, s = {"L$0", "L$2"}, n = {"destination$iv$iv", "element$iv$iv"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.ReportKt$FileReport$2$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   @SourceDebugExtension({"SMAP\nReport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Report.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n774#2:186\n865#2,2:187\n*S KotlinDebug\n*F\n+ 1 Report.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$2$1\n*L\n111#1:186\n111#1:187,2\n*E\n"})
/*     */   static final class ReportKt$FileReport$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     int label;
/*     */     
/*     */     ReportKt$FileReport$2$1(List<FileChangeView> $newFiles, MutableState<Set<FileChangeView>> $commitedFiles$delegate, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       List<FileChangeView> list1;
/*     */       int $i$f$filter;
/*     */       List<FileChangeView> list2;
/*     */       Collection<Object> collection1, destination$iv$iv;
/*     */       int $i$f$filterTo;
/*     */       Iterator<FileChangeView> iterator;
/*     */       Object element$iv$iv;
/*     */       int $i$a$-filter-ReportKt$FileReport$2$1$1;
/*     */       MutableState<Set<FileChangeView>> mutableState;
/*     */       Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           list1 = this.$newFiles;
/*     */           mutableState = this.$commitedFiles$delegate;
/*     */           $i$f$filter = 0;
/*     */           list2 = list1;
/*     */           collection1 = new ArrayList();
/*     */           $i$f$filterTo = 0;
/*     */           iterator = list2.iterator();
/*     */           if (iterator.hasNext()) {
/*     */             Object object = iterator.next();
/*     */             FileChangeView it = (FileChangeView)object;
/*     */             int i = 0;
/*     */             if (it.getFileManipulationActions() != null) {
/*     */               this.L$0 = collection1;
/*     */               this.L$1 = iterator;
/*     */               this.L$2 = object;
/*     */               this.L$3 = mutableState;
/*     */               this.label = 1;
/*     */               if (it.getFileManipulationActions().isOnVCS((Continuation)this) == object1)
/*     */                 return object1; 
/*     */             } else {
/*     */               it.getFileManipulationActions().isOnVCS((Continuation)this);
/*     */               if (false)
/*     */                 collection1.add(object); 
/*     */             } 
/*     */           } 
/*     */           ReportKt.FileReport$lambda$4(mutableState, CollectionsKt.toSet(collection1));
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           $i$f$filter = 0;
/*     */           $i$f$filterTo = 0;
/*     */           $i$a$-filter-ReportKt$FileReport$2$1$1 = 0;
/*     */           mutableState = (MutableState<Set<FileChangeView>>)this.L$3;
/*     */           element$iv$iv = this.L$2;
/*     */           iterator = (Iterator<FileChangeView>)this.L$1;
/*     */           destination$iv$iv = (Collection)this.L$0;
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           if ((((Boolean)SYNTHETIC_LOCAL_VARIABLE_1).booleanValue() == true))
/*     */             destination$iv$iv.add(element$iv$iv); 
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super ReportKt$FileReport$2$1> $completion) {
/*     */       return (Continuation<Unit>)new ReportKt$FileReport$2$1(this.$newFiles, this.$commitedFiles$delegate, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((ReportKt$FileReport$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "Report.kt", l = {116, 118}, i = {0, 1, 1, 1}, s = {"L$0", "L$0", "L$2", "L$4"}, n = {"$this$LaunchedEffect", "$this$LaunchedEffect", "destination$iv$iv", "element$iv$iv"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.ReportKt$FileReport$3$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   @SourceDebugExtension({"SMAP\nReport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Report.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$3$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n774#2:186\n865#2,2:187\n*S KotlinDebug\n*F\n+ 1 Report.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$3$1\n*L\n118#1:186\n118#1:187,2\n*E\n"})
/*     */   static final class ReportKt$FileReport$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     int label;
/*     */     
/*     */     ReportKt$FileReport$3$1(List<FileChangeView> $newFiles, MutableState<Set<FileChangeView>> $commitedFiles$delegate, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #18
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 423, 0 -> 36, 1 -> 112, 2 -> 275
/*     */       //   36: aload_1
/*     */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   40: aload_0
/*     */       //   41: getfield L$0 : Ljava/lang/Object;
/*     */       //   44: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   47: astore_2
/*     */       //   48: aload_2
/*     */       //   49: invokestatic isActive : (Lkotlinx/coroutines/CoroutineScope;)Z
/*     */       //   52: ifeq -> 419
/*     */       //   55: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
/*     */       //   58: pop
/*     */       //   59: iconst_5
/*     */       //   60: getstatic kotlin/time/DurationUnit.SECONDS : Lkotlin/time/DurationUnit;
/*     */       //   63: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
/*     */       //   66: aload_0
/*     */       //   67: checkcast kotlin/coroutines/Continuation
/*     */       //   70: aload_0
/*     */       //   71: aload_2
/*     */       //   72: putfield L$0 : Ljava/lang/Object;
/*     */       //   75: aload_0
/*     */       //   76: aconst_null
/*     */       //   77: putfield L$1 : Ljava/lang/Object;
/*     */       //   80: aload_0
/*     */       //   81: aconst_null
/*     */       //   82: putfield L$2 : Ljava/lang/Object;
/*     */       //   85: aload_0
/*     */       //   86: aconst_null
/*     */       //   87: putfield L$3 : Ljava/lang/Object;
/*     */       //   90: aload_0
/*     */       //   91: aconst_null
/*     */       //   92: putfield L$4 : Ljava/lang/Object;
/*     */       //   95: aload_0
/*     */       //   96: iconst_1
/*     */       //   97: putfield label : I
/*     */       //   100: invokestatic delay-VtjQ1oo : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   103: dup
/*     */       //   104: aload #18
/*     */       //   106: if_acmpne -> 125
/*     */       //   109: aload #18
/*     */       //   111: areturn
/*     */       //   112: aload_0
/*     */       //   113: getfield L$0 : Ljava/lang/Object;
/*     */       //   116: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   119: astore_2
/*     */       //   120: aload_1
/*     */       //   121: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   124: aload_1
/*     */       //   125: pop
/*     */       //   126: aload_2
/*     */       //   127: astore_3
/*     */       //   128: aload_0
/*     */       //   129: getfield $newFiles : Ljava/util/List;
/*     */       //   132: astore #4
/*     */       //   134: aload_0
/*     */       //   135: getfield $commitedFiles$delegate : Landroidx/compose/runtime/MutableState;
/*     */       //   138: astore #5
/*     */       //   140: nop
/*     */       //   141: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*     */       //   144: pop
/*     */       //   145: iconst_0
/*     */       //   146: istore #7
/*     */       //   148: aload #5
/*     */       //   150: aload #4
/*     */       //   152: checkcast java/lang/Iterable
/*     */       //   155: astore #8
/*     */       //   157: astore #9
/*     */       //   159: iconst_0
/*     */       //   160: istore #10
/*     */       //   162: aload #8
/*     */       //   164: astore #11
/*     */       //   166: new java/util/ArrayList
/*     */       //   169: dup
/*     */       //   170: invokespecial <init> : ()V
/*     */       //   173: checkcast java/util/Collection
/*     */       //   176: astore #12
/*     */       //   178: iconst_0
/*     */       //   179: istore #13
/*     */       //   181: aload #11
/*     */       //   183: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   188: astore #14
/*     */       //   190: aload #14
/*     */       //   192: invokeinterface hasNext : ()Z
/*     */       //   197: ifeq -> 370
/*     */       //   200: aload #14
/*     */       //   202: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   207: astore #15
/*     */       //   209: aload #15
/*     */       //   211: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView
/*     */       //   214: astore #16
/*     */       //   216: iconst_0
/*     */       //   217: istore #17
/*     */       //   219: aload #16
/*     */       //   221: invokevirtual getFileManipulationActions : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileManipulationActions;
/*     */       //   224: dup
/*     */       //   225: ifnull -> 352
/*     */       //   228: aload_0
/*     */       //   229: aload_0
/*     */       //   230: aload_2
/*     */       //   231: putfield L$0 : Ljava/lang/Object;
/*     */       //   234: aload_0
/*     */       //   235: aload #9
/*     */       //   237: putfield L$1 : Ljava/lang/Object;
/*     */       //   240: aload_0
/*     */       //   241: aload #12
/*     */       //   243: putfield L$2 : Ljava/lang/Object;
/*     */       //   246: aload_0
/*     */       //   247: aload #14
/*     */       //   249: putfield L$3 : Ljava/lang/Object;
/*     */       //   252: aload_0
/*     */       //   253: aload #15
/*     */       //   255: putfield L$4 : Ljava/lang/Object;
/*     */       //   258: aload_0
/*     */       //   259: iconst_2
/*     */       //   260: putfield label : I
/*     */       //   263: invokevirtual isOnVCS : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   266: dup
/*     */       //   267: aload #18
/*     */       //   269: if_acmpne -> 334
/*     */       //   272: aload #18
/*     */       //   274: areturn
/*     */       //   275: iconst_0
/*     */       //   276: istore #7
/*     */       //   278: iconst_0
/*     */       //   279: istore #10
/*     */       //   281: iconst_0
/*     */       //   282: istore #13
/*     */       //   284: iconst_0
/*     */       //   285: istore #17
/*     */       //   287: aload_0
/*     */       //   288: getfield L$4 : Ljava/lang/Object;
/*     */       //   291: astore #15
/*     */       //   293: aload_0
/*     */       //   294: getfield L$3 : Ljava/lang/Object;
/*     */       //   297: checkcast java/util/Iterator
/*     */       //   300: astore #14
/*     */       //   302: aload_0
/*     */       //   303: getfield L$2 : Ljava/lang/Object;
/*     */       //   306: checkcast java/util/Collection
/*     */       //   309: astore #12
/*     */       //   311: aload_0
/*     */       //   312: getfield L$1 : Ljava/lang/Object;
/*     */       //   315: checkcast androidx/compose/runtime/MutableState
/*     */       //   318: astore #9
/*     */       //   320: aload_0
/*     */       //   321: getfield L$0 : Ljava/lang/Object;
/*     */       //   324: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   327: astore_2
/*     */       //   328: nop
/*     */       //   329: aload_1
/*     */       //   330: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   333: aload_1
/*     */       //   334: checkcast java/lang/Boolean
/*     */       //   337: invokevirtual booleanValue : ()Z
/*     */       //   340: iconst_1
/*     */       //   341: if_icmpne -> 348
/*     */       //   344: iconst_1
/*     */       //   345: goto -> 354
/*     */       //   348: iconst_0
/*     */       //   349: goto -> 354
/*     */       //   352: pop
/*     */       //   353: iconst_0
/*     */       //   354: ifeq -> 190
/*     */       //   357: aload #12
/*     */       //   359: aload #15
/*     */       //   361: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   366: pop
/*     */       //   367: goto -> 190
/*     */       //   370: aload #12
/*     */       //   372: checkcast java/util/List
/*     */       //   375: nop
/*     */       //   376: aload #9
/*     */       //   378: swap
/*     */       //   379: checkcast java/lang/Iterable
/*     */       //   382: invokestatic toSet : (Ljava/lang/Iterable;)Ljava/util/Set;
/*     */       //   385: invokestatic access$FileReport$lambda$4 : (Landroidx/compose/runtime/MutableState;Ljava/util/Set;)V
/*     */       //   388: nop
/*     */       //   389: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   392: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   395: astore #6
/*     */       //   397: goto -> 48
/*     */       //   400: astore #7
/*     */       //   402: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*     */       //   405: pop
/*     */       //   406: aload #7
/*     */       //   408: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
/*     */       //   411: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   414: astore #6
/*     */       //   416: goto -> 48
/*     */       //   419: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   422: areturn
/*     */       //   423: new java/lang/IllegalStateException
/*     */       //   426: dup
/*     */       //   427: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   429: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   432: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #114	-> 3
/*     */       //   #115	-> 48
/*     */       //   #116	-> 55
/*     */       //   #116	-> 70
/*     */       //   #114	-> 109
/*     */       //   #117	-> 125
/*     */       //   #118	-> 148
/*     */       //   #186	-> 162
/*     */       //   #187	-> 181
/*     */       //   #118	-> 219
/*     */       //   #114	-> 272
/*     */       //   #118	-> 334
/*     */       //   #187	-> 354
/*     */       //   #188	-> 370
/*     */       //   #186	-> 375
/*     */       //   #118	-> 382
/*     */       //   #119	-> 388
/*     */       //   #117	-> 392
/*     */       //   #121	-> 419
/*     */       //   #114	-> 423
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   48	64	2	$this$LaunchedEffect	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   120	155	2	$this$LaunchedEffect	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   328	61	2	$this$LaunchedEffect	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   389	34	2	$this$LaunchedEffect	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   159	19	8	$this$filter$iv	Ljava/lang/Iterable;
/*     */       //   178	12	11	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */       //   178	97	12	destination$iv$iv	Ljava/util/Collection;
/*     */       //   311	61	12	destination$iv$iv	Ljava/util/Collection;
/*     */       //   209	66	15	element$iv$iv	Ljava/lang/Object;
/*     */       //   293	74	15	element$iv$iv	Ljava/lang/Object;
/*     */       //   216	8	16	it	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*     */       //   219	56	17	$i$a$-filter-ReportKt$FileReport$3$1$1$1	I
/*     */       //   181	94	13	$i$f$filterTo	I
/*     */       //   162	113	10	$i$f$filter	I
/*     */       //   148	127	7	$i$a$-runCatching-ReportKt$FileReport$3$1$1	I
/*     */       //   0	433	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$3$1;
/*     */       //   40	383	1	$result	Ljava/lang/Object;
/*     */       //   287	67	17	$i$a$-filter-ReportKt$FileReport$3$1$1$1	I
/*     */       //   284	88	13	$i$f$filterTo	I
/*     */       //   281	95	10	$i$f$filter	I
/*     */       //   278	111	7	$i$a$-runCatching-ReportKt$FileReport$3$1$1	I
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   140	266	400	java/lang/Throwable
/*     */       //   328	397	400	java/lang/Throwable
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super ReportKt$FileReport$3$1> $completion) {
/*     */       ReportKt$FileReport$3$1 reportKt$FileReport$3$1 = new ReportKt$FileReport$3$1(this.$newFiles, this.$commitedFiles$delegate, $completion);
/*     */       reportKt$FileReport$3$1.L$0 = value;
/*     */       return (Continuation<Unit>)reportKt$FileReport$3$1;
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((ReportKt$FileReport$3$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "Report.kt", l = {136}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.ReportKt$FileReport$4$1$1$1$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\002\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""})
/*     */   static final class ReportKt$FileReport$4$1$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     ReportKt$FileReport$4$1$1$1$1(FileChangeView $file, Continuation $completion) {
/*     */       super(1, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore_2
/*     */       //   4: aload_0
/*     */       //   5: getfield label : I
/*     */       //   8: tableswitch default -> 80, 0 -> 32, 1 -> 66
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield $file : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*     */       //   40: invokevirtual getFileManipulationActions : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileManipulationActions;
/*     */       //   43: dup
/*     */       //   44: ifnull -> 75
/*     */       //   47: aload_0
/*     */       //   48: checkcast kotlin/coroutines/Continuation
/*     */       //   51: aload_0
/*     */       //   52: iconst_1
/*     */       //   53: putfield label : I
/*     */       //   56: invokevirtual onRollback : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   59: dup
/*     */       //   60: aload_2
/*     */       //   61: if_acmpne -> 71
/*     */       //   64: aload_2
/*     */       //   65: areturn
/*     */       //   66: aload_1
/*     */       //   67: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   70: aload_1
/*     */       //   71: pop
/*     */       //   72: goto -> 76
/*     */       //   75: pop
/*     */       //   76: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   79: areturn
/*     */       //   80: new java/lang/IllegalStateException
/*     */       //   83: dup
/*     */       //   84: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   86: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   89: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #136	-> 3
/*     */       //   #136	-> 36
/*     */       //   #136	-> 64
/*     */       //   #136	-> 71
/*     */       //   #136	-> 80
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	90	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$4$1$1$1$1;
/*     */       //   36	44	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Continuation<? super ReportKt$FileReport$4$1$1$1$1> $completion) {
/*     */       return (Continuation<Unit>)new ReportKt$FileReport$4$1$1$1$1(this.$file, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(Continuation<?> p1) {
/*     */       return ((ReportKt$FileReport$4$1$1$1$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "Report.kt", l = {137}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.ReportKt$FileReport$4$1$1$2$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\002\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""})
/*     */   static final class ReportKt$FileReport$4$1$1$2$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     ReportKt$FileReport$4$1$1$2$1(FileChangeView $file, Continuation $completion) {
/*     */       super(1, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore_2
/*     */       //   4: aload_0
/*     */       //   5: getfield label : I
/*     */       //   8: tableswitch default -> 80, 0 -> 32, 1 -> 66
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield $file : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*     */       //   40: invokevirtual getFileManipulationActions : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileManipulationActions;
/*     */       //   43: dup
/*     */       //   44: ifnull -> 75
/*     */       //   47: aload_0
/*     */       //   48: checkcast kotlin/coroutines/Continuation
/*     */       //   51: aload_0
/*     */       //   52: iconst_1
/*     */       //   53: putfield label : I
/*     */       //   56: invokevirtual onLocate : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   59: dup
/*     */       //   60: aload_2
/*     */       //   61: if_acmpne -> 71
/*     */       //   64: aload_2
/*     */       //   65: areturn
/*     */       //   66: aload_1
/*     */       //   67: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   70: aload_1
/*     */       //   71: pop
/*     */       //   72: goto -> 76
/*     */       //   75: pop
/*     */       //   76: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   79: areturn
/*     */       //   80: new java/lang/IllegalStateException
/*     */       //   83: dup
/*     */       //   84: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   86: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   89: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #137	-> 3
/*     */       //   #137	-> 36
/*     */       //   #137	-> 64
/*     */       //   #137	-> 71
/*     */       //   #137	-> 80
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	90	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$4$1$1$2$1;
/*     */       //   36	44	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Continuation<? super ReportKt$FileReport$4$1$1$2$1> $completion) {
/*     */       return (Continuation<Unit>)new ReportKt$FileReport$4$1$1$2$1(this.$file, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(Continuation<?> p1) {
/*     */       return ((ReportKt$FileReport$4$1$1$2$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Unit FileReport$lambda$13$lambda$12$lambda$11$lambda$10$lambda$9(FileChangeView $file, boolean $wantEditableDiff) {
/*     */     $file.onShowDiff($wantEditableDiff);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit FileReport$lambda$23$lambda$16$lambda$15$lambda$14(CoroutineScope $scope, Function1<? super Continuation<? super Unit>, ? extends Object> $onChangeAllVcsStatus, List<FileChangeView> $newFiles, MutableState<Set<FileChangeView>> $commitedFiles$delegate) {
/*     */     BuildersKt.launch$default($scope, null, null, new ReportKt$FileReport$5$1$1$1$1($onChangeAllVcsStatus, $newFiles, $commitedFiles$delegate, null), 3, null);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "Report.kt", l = {157, 158}, i = {1, 1}, s = {"L$0", "L$2"}, n = {"destination$iv$iv", "element$iv$iv"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.ReportKt$FileReport$5$1$1$1$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   @SourceDebugExtension({"SMAP\nReport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Report.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$5$1$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n774#2:186\n865#2,2:187\n*S KotlinDebug\n*F\n+ 1 Report.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$5$1$1$1$1\n*L\n158#1:186\n158#1:187,2\n*E\n"})
/*     */   static final class ReportKt$FileReport$5$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     int label;
/*     */     
/*     */     ReportKt$FileReport$5$1$1$1$1(Function1<Continuation<? super Unit>, Object> $onChangeAllVcsStatus, List<FileChangeView> $newFiles, MutableState<Set<FileChangeView>> $commitedFiles$delegate, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #12
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 297, 0 -> 36, 1 -> 64, 2 -> 193
/*     */       //   36: aload_1
/*     */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   40: aload_0
/*     */       //   41: getfield $onChangeAllVcsStatus : Lkotlin/jvm/functions/Function1;
/*     */       //   44: aload_0
/*     */       //   45: aload_0
/*     */       //   46: iconst_1
/*     */       //   47: putfield label : I
/*     */       //   50: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   55: dup
/*     */       //   56: aload #12
/*     */       //   58: if_acmpne -> 69
/*     */       //   61: aload #12
/*     */       //   63: areturn
/*     */       //   64: aload_1
/*     */       //   65: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   68: aload_1
/*     */       //   69: pop
/*     */       //   70: aload_0
/*     */       //   71: getfield $commitedFiles$delegate : Landroidx/compose/runtime/MutableState;
/*     */       //   74: aload_0
/*     */       //   75: getfield $newFiles : Ljava/util/List;
/*     */       //   78: checkcast java/lang/Iterable
/*     */       //   81: astore_2
/*     */       //   82: astore #11
/*     */       //   84: iconst_0
/*     */       //   85: istore_3
/*     */       //   86: aload_2
/*     */       //   87: astore #4
/*     */       //   89: new java/util/ArrayList
/*     */       //   92: dup
/*     */       //   93: invokespecial <init> : ()V
/*     */       //   96: checkcast java/util/Collection
/*     */       //   99: astore #5
/*     */       //   101: iconst_0
/*     */       //   102: istore #6
/*     */       //   104: aload #4
/*     */       //   106: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   111: astore #7
/*     */       //   113: aload #7
/*     */       //   115: invokeinterface hasNext : ()Z
/*     */       //   120: ifeq -> 275
/*     */       //   123: aload #7
/*     */       //   125: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   130: astore #8
/*     */       //   132: aload #8
/*     */       //   134: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView
/*     */       //   137: astore #9
/*     */       //   139: iconst_0
/*     */       //   140: istore #10
/*     */       //   142: aload #9
/*     */       //   144: invokevirtual getFileManipulationActions : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileManipulationActions;
/*     */       //   147: dup
/*     */       //   148: ifnull -> 257
/*     */       //   151: aload_0
/*     */       //   152: aload_0
/*     */       //   153: aload #5
/*     */       //   155: putfield L$0 : Ljava/lang/Object;
/*     */       //   158: aload_0
/*     */       //   159: aload #7
/*     */       //   161: putfield L$1 : Ljava/lang/Object;
/*     */       //   164: aload_0
/*     */       //   165: aload #8
/*     */       //   167: putfield L$2 : Ljava/lang/Object;
/*     */       //   170: aload_0
/*     */       //   171: aload #11
/*     */       //   173: putfield L$3 : Ljava/lang/Object;
/*     */       //   176: aload_0
/*     */       //   177: iconst_2
/*     */       //   178: putfield label : I
/*     */       //   181: invokevirtual isOnVCS : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   184: dup
/*     */       //   185: aload #12
/*     */       //   187: if_acmpne -> 239
/*     */       //   190: aload #12
/*     */       //   192: areturn
/*     */       //   193: iconst_0
/*     */       //   194: istore_3
/*     */       //   195: iconst_0
/*     */       //   196: istore #6
/*     */       //   198: iconst_0
/*     */       //   199: istore #10
/*     */       //   201: aload_0
/*     */       //   202: getfield L$3 : Ljava/lang/Object;
/*     */       //   205: checkcast androidx/compose/runtime/MutableState
/*     */       //   208: astore #11
/*     */       //   210: aload_0
/*     */       //   211: getfield L$2 : Ljava/lang/Object;
/*     */       //   214: astore #8
/*     */       //   216: aload_0
/*     */       //   217: getfield L$1 : Ljava/lang/Object;
/*     */       //   220: checkcast java/util/Iterator
/*     */       //   223: astore #7
/*     */       //   225: aload_0
/*     */       //   226: getfield L$0 : Ljava/lang/Object;
/*     */       //   229: checkcast java/util/Collection
/*     */       //   232: astore #5
/*     */       //   234: aload_1
/*     */       //   235: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   238: aload_1
/*     */       //   239: checkcast java/lang/Boolean
/*     */       //   242: invokevirtual booleanValue : ()Z
/*     */       //   245: iconst_1
/*     */       //   246: if_icmpne -> 253
/*     */       //   249: iconst_1
/*     */       //   250: goto -> 259
/*     */       //   253: iconst_0
/*     */       //   254: goto -> 259
/*     */       //   257: pop
/*     */       //   258: iconst_0
/*     */       //   259: ifeq -> 113
/*     */       //   262: aload #5
/*     */       //   264: aload #8
/*     */       //   266: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   271: pop
/*     */       //   272: goto -> 113
/*     */       //   275: aload #5
/*     */       //   277: checkcast java/util/List
/*     */       //   280: nop
/*     */       //   281: aload #11
/*     */       //   283: swap
/*     */       //   284: checkcast java/lang/Iterable
/*     */       //   287: invokestatic toSet : (Ljava/lang/Iterable;)Ljava/util/Set;
/*     */       //   290: invokestatic access$FileReport$lambda$4 : (Landroidx/compose/runtime/MutableState;Ljava/util/Set;)V
/*     */       //   293: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   296: areturn
/*     */       //   297: new java/lang/IllegalStateException
/*     */       //   300: dup
/*     */       //   301: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   303: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   306: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #156	-> 3
/*     */       //   #157	-> 40
/*     */       //   #156	-> 61
/*     */       //   #158	-> 69
/*     */       //   #186	-> 86
/*     */       //   #187	-> 104
/*     */       //   #158	-> 142
/*     */       //   #156	-> 190
/*     */       //   #158	-> 239
/*     */       //   #187	-> 259
/*     */       //   #188	-> 275
/*     */       //   #186	-> 280
/*     */       //   #158	-> 287
/*     */       //   #159	-> 293
/*     */       //   #156	-> 297
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   84	17	2	$this$filter$iv	Ljava/lang/Iterable;
/*     */       //   101	12	4	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */       //   101	92	5	destination$iv$iv	Ljava/util/Collection;
/*     */       //   234	43	5	destination$iv$iv	Ljava/util/Collection;
/*     */       //   132	61	8	element$iv$iv	Ljava/lang/Object;
/*     */       //   216	56	8	element$iv$iv	Ljava/lang/Object;
/*     */       //   139	8	9	it	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*     */       //   142	51	10	$i$a$-filter-ReportKt$FileReport$5$1$1$1$1$1	I
/*     */       //   104	89	6	$i$f$filterTo	I
/*     */       //   86	107	3	$i$f$filter	I
/*     */       //   0	307	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$5$1$1$1$1;
/*     */       //   40	257	1	$result	Ljava/lang/Object;
/*     */       //   201	58	10	$i$a$-filter-ReportKt$FileReport$5$1$1$1$1$1	I
/*     */       //   198	79	6	$i$f$filterTo	I
/*     */       //   195	86	3	$i$f$filter	I
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super ReportKt$FileReport$5$1$1$1$1> $completion) {
/*     */       return (Continuation<Unit>)new ReportKt$FileReport$5$1$1$1$1(this.$onChangeAllVcsStatus, this.$newFiles, this.$commitedFiles$delegate, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((ReportKt$FileReport$5$1$1$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "Report.kt", l = {172}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.ReportKt$FileReport$5$2$1$1$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\002\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""})
/*     */   static final class ReportKt$FileReport$5$2$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     ReportKt$FileReport$5$2$1$1$1(FileChangeView $file, Continuation $completion) {
/*     */       super(1, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore_2
/*     */       //   4: aload_0
/*     */       //   5: getfield label : I
/*     */       //   8: tableswitch default -> 80, 0 -> 32, 1 -> 66
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield $file : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*     */       //   40: invokevirtual getFileManipulationActions : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileManipulationActions;
/*     */       //   43: dup
/*     */       //   44: ifnull -> 75
/*     */       //   47: aload_0
/*     */       //   48: checkcast kotlin/coroutines/Continuation
/*     */       //   51: aload_0
/*     */       //   52: iconst_1
/*     */       //   53: putfield label : I
/*     */       //   56: invokevirtual onLocate : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   59: dup
/*     */       //   60: aload_2
/*     */       //   61: if_acmpne -> 71
/*     */       //   64: aload_2
/*     */       //   65: areturn
/*     */       //   66: aload_1
/*     */       //   67: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   70: aload_1
/*     */       //   71: pop
/*     */       //   72: goto -> 76
/*     */       //   75: pop
/*     */       //   76: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   79: areturn
/*     */       //   80: new java/lang/IllegalStateException
/*     */       //   83: dup
/*     */       //   84: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   86: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   89: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #172	-> 3
/*     */       //   #172	-> 36
/*     */       //   #172	-> 64
/*     */       //   #172	-> 71
/*     */       //   #172	-> 80
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	90	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$5$2$1$1$1;
/*     */       //   36	44	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Continuation<? super ReportKt$FileReport$5$2$1$1$1> $completion) {
/*     */       return (Continuation<Unit>)new ReportKt$FileReport$5$2$1$1$1(this.$file, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(Continuation<?> p1) {
/*     */       return ((ReportKt$FileReport$5$2$1$1$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "Report.kt", l = {174, 175}, i = {1, 1}, s = {"L$0", "L$2"}, n = {"destination$iv$iv", "element$iv$iv"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.ReportKt$FileReport$5$2$1$2$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\002\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""})
/*     */   @SourceDebugExtension({"SMAP\nReport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Report.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$5$2$1$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n774#2:186\n865#2,2:187\n*S KotlinDebug\n*F\n+ 1 Report.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$5$2$1$2$1\n*L\n175#1:186\n175#1:187,2\n*E\n"})
/*     */   static final class ReportKt$FileReport$5$2$1$2$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     int label;
/*     */     
/*     */     ReportKt$FileReport$5$2$1$2$1(FileChangeView $file, List<FileChangeView> $newFiles, MutableState<Set<FileChangeView>> $commitedFiles$delegate, Continuation $completion) {
/*     */       super(1, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #12
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 309, 0 -> 36, 1 -> 72, 2 -> 205
/*     */       //   36: aload_1
/*     */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   40: aload_0
/*     */       //   41: getfield $file : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*     */       //   44: invokevirtual getFileManipulationActions : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileManipulationActions;
/*     */       //   47: dup
/*     */       //   48: ifnull -> 81
/*     */       //   51: aload_0
/*     */       //   52: checkcast kotlin/coroutines/Continuation
/*     */       //   55: aload_0
/*     */       //   56: iconst_1
/*     */       //   57: putfield label : I
/*     */       //   60: invokevirtual onSetVCS : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   63: dup
/*     */       //   64: aload #12
/*     */       //   66: if_acmpne -> 77
/*     */       //   69: aload #12
/*     */       //   71: areturn
/*     */       //   72: aload_1
/*     */       //   73: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   76: aload_1
/*     */       //   77: pop
/*     */       //   78: goto -> 82
/*     */       //   81: pop
/*     */       //   82: aload_0
/*     */       //   83: getfield $commitedFiles$delegate : Landroidx/compose/runtime/MutableState;
/*     */       //   86: aload_0
/*     */       //   87: getfield $newFiles : Ljava/util/List;
/*     */       //   90: checkcast java/lang/Iterable
/*     */       //   93: astore_2
/*     */       //   94: astore #11
/*     */       //   96: iconst_0
/*     */       //   97: istore_3
/*     */       //   98: aload_2
/*     */       //   99: astore #4
/*     */       //   101: new java/util/ArrayList
/*     */       //   104: dup
/*     */       //   105: invokespecial <init> : ()V
/*     */       //   108: checkcast java/util/Collection
/*     */       //   111: astore #5
/*     */       //   113: iconst_0
/*     */       //   114: istore #6
/*     */       //   116: aload #4
/*     */       //   118: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   123: astore #7
/*     */       //   125: aload #7
/*     */       //   127: invokeinterface hasNext : ()Z
/*     */       //   132: ifeq -> 287
/*     */       //   135: aload #7
/*     */       //   137: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   142: astore #8
/*     */       //   144: aload #8
/*     */       //   146: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView
/*     */       //   149: astore #9
/*     */       //   151: iconst_0
/*     */       //   152: istore #10
/*     */       //   154: aload #9
/*     */       //   156: invokevirtual getFileManipulationActions : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileManipulationActions;
/*     */       //   159: dup
/*     */       //   160: ifnull -> 269
/*     */       //   163: aload_0
/*     */       //   164: aload_0
/*     */       //   165: aload #5
/*     */       //   167: putfield L$0 : Ljava/lang/Object;
/*     */       //   170: aload_0
/*     */       //   171: aload #7
/*     */       //   173: putfield L$1 : Ljava/lang/Object;
/*     */       //   176: aload_0
/*     */       //   177: aload #8
/*     */       //   179: putfield L$2 : Ljava/lang/Object;
/*     */       //   182: aload_0
/*     */       //   183: aload #11
/*     */       //   185: putfield L$3 : Ljava/lang/Object;
/*     */       //   188: aload_0
/*     */       //   189: iconst_2
/*     */       //   190: putfield label : I
/*     */       //   193: invokevirtual isOnVCS : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   196: dup
/*     */       //   197: aload #12
/*     */       //   199: if_acmpne -> 251
/*     */       //   202: aload #12
/*     */       //   204: areturn
/*     */       //   205: iconst_0
/*     */       //   206: istore_3
/*     */       //   207: iconst_0
/*     */       //   208: istore #6
/*     */       //   210: iconst_0
/*     */       //   211: istore #10
/*     */       //   213: aload_0
/*     */       //   214: getfield L$3 : Ljava/lang/Object;
/*     */       //   217: checkcast androidx/compose/runtime/MutableState
/*     */       //   220: astore #11
/*     */       //   222: aload_0
/*     */       //   223: getfield L$2 : Ljava/lang/Object;
/*     */       //   226: astore #8
/*     */       //   228: aload_0
/*     */       //   229: getfield L$1 : Ljava/lang/Object;
/*     */       //   232: checkcast java/util/Iterator
/*     */       //   235: astore #7
/*     */       //   237: aload_0
/*     */       //   238: getfield L$0 : Ljava/lang/Object;
/*     */       //   241: checkcast java/util/Collection
/*     */       //   244: astore #5
/*     */       //   246: aload_1
/*     */       //   247: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   250: aload_1
/*     */       //   251: checkcast java/lang/Boolean
/*     */       //   254: invokevirtual booleanValue : ()Z
/*     */       //   257: iconst_1
/*     */       //   258: if_icmpne -> 265
/*     */       //   261: iconst_1
/*     */       //   262: goto -> 271
/*     */       //   265: iconst_0
/*     */       //   266: goto -> 271
/*     */       //   269: pop
/*     */       //   270: iconst_0
/*     */       //   271: ifeq -> 125
/*     */       //   274: aload #5
/*     */       //   276: aload #8
/*     */       //   278: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   283: pop
/*     */       //   284: goto -> 125
/*     */       //   287: aload #5
/*     */       //   289: checkcast java/util/List
/*     */       //   292: nop
/*     */       //   293: aload #11
/*     */       //   295: swap
/*     */       //   296: checkcast java/lang/Iterable
/*     */       //   299: invokestatic toSet : (Ljava/lang/Iterable;)Ljava/util/Set;
/*     */       //   302: invokestatic access$FileReport$lambda$4 : (Landroidx/compose/runtime/MutableState;Ljava/util/Set;)V
/*     */       //   305: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   308: areturn
/*     */       //   309: new java/lang/IllegalStateException
/*     */       //   312: dup
/*     */       //   313: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   315: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   318: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #173	-> 3
/*     */       //   #174	-> 40
/*     */       //   #173	-> 69
/*     */       //   #174	-> 77
/*     */       //   #175	-> 82
/*     */       //   #186	-> 98
/*     */       //   #187	-> 116
/*     */       //   #175	-> 154
/*     */       //   #173	-> 202
/*     */       //   #175	-> 251
/*     */       //   #187	-> 271
/*     */       //   #188	-> 287
/*     */       //   #186	-> 292
/*     */       //   #175	-> 299
/*     */       //   #176	-> 305
/*     */       //   #173	-> 309
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   96	17	2	$this$filter$iv	Ljava/lang/Iterable;
/*     */       //   113	12	4	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */       //   113	92	5	destination$iv$iv	Ljava/util/Collection;
/*     */       //   246	43	5	destination$iv$iv	Ljava/util/Collection;
/*     */       //   144	61	8	element$iv$iv	Ljava/lang/Object;
/*     */       //   228	56	8	element$iv$iv	Ljava/lang/Object;
/*     */       //   151	8	9	it	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*     */       //   154	51	10	$i$a$-filter-ReportKt$FileReport$5$2$1$2$1$1	I
/*     */       //   116	89	6	$i$f$filterTo	I
/*     */       //   98	107	3	$i$f$filter	I
/*     */       //   0	319	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$5$2$1$2$1;
/*     */       //   40	269	1	$result	Ljava/lang/Object;
/*     */       //   213	58	10	$i$a$-filter-ReportKt$FileReport$5$2$1$2$1$1	I
/*     */       //   210	79	6	$i$f$filterTo	I
/*     */       //   207	86	3	$i$f$filter	I
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Continuation<? super ReportKt$FileReport$5$2$1$2$1> $completion) {
/*     */       return (Continuation<Unit>)new ReportKt$FileReport$5$2$1$2$1(this.$file, this.$newFiles, this.$commitedFiles$delegate, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(Continuation<?> p1) {
/*     */       return ((ReportKt$FileReport$5$2$1$2$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Unit FileReport$lambda$23$lambda$22$lambda$21$lambda$20$lambda$19(FileChangeView $file, boolean $wantEditableDiff) {
/*     */     $file.onShowDiff($wantEditableDiff);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit ReportStep$lambda$0(TaskStep.Report $report, boolean $isProjectOnVCS, int $$changed, Composer $composer, int $force) {
/*     */     ReportStep($report, $isProjectOnVCS, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit FileReport$lambda$24(List<FileChangeView> $changes, boolean $wantEditableDiff, boolean $isProjectOnVCS, Function1<? super Continuation<? super Unit>, ? extends Object> $onChangeAllVcsStatus, int $$changed, Composer $composer, int $force) {
/*     */     FileReport($changes, $wantEditableDiff, $isProjectOnVCS, $onChangeAllVcsStatus, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\ReportKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */