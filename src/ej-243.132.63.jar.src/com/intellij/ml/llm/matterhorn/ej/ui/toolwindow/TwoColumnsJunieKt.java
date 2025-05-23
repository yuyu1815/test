/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.toolwindow;
/*     */ 
/*     */ import androidx.compose.animation.core.AnimationSpecKt;
/*     */ import androidx.compose.animation.core.EasingKt;
/*     */ import androidx.compose.animation.core.FiniteAnimationSpec;
/*     */ import androidx.compose.animation.core.Transition;
/*     */ import androidx.compose.animation.core.TweenSpec;
/*     */ import androidx.compose.foundation.text.input.TextFieldStateKt;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.JuniePreconditionChecker;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.activation.GrazieQuotaWarning;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.followup.FollowupViewModel;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header.TaskHeaderState;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.NewTaskViewModelImpl;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.explorer.Tip;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.vm.ViewModel;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000@\n\000\n\002\020\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\013\n\002\b\013\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\032I\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\0032\b\020\005\032\004\030\0010\0062\006\020\007\032\0020\b2\f\020\t\032\b\022\004\022\0020\0010\n2\f\020\013\032\b\022\004\022\0020\r0\fH\007¢\006\002\020\016\032;\020\017\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\0032\b\020\005\032\004\030\0010\0062\006\020\007\032\0020\b2\f\020\t\032\b\022\004\022\0020\0010\nH\007¢\006\002\020\020\032\025\020\021\032\0020\0012\006\020\022\032\0020\bH\007¢\006\002\020\023\032\035\020\024\032\0020\0012\006\020\022\032\0020\b2\006\020\025\032\0020\rH\007¢\006\002\020\026¨\006\027²\006\020\020\030\032\b\022\004\022\0020\0310\003X\002²\006\f\020\032\032\004\030\0010\033X\002²\006\f\020\034\032\004\030\0010\035X\002"}, d2 = {"TwoColumnView", "", "junieProblems", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem;", "quotaWarning", "Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;", "currentPage", "Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;", "onJunieProblemRefresh", "Lkotlin/Function0;", "transition", "Landroidx/compose/animation/core/Transition;", "", "(Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/Transition;Landroidx/compose/runtime/Composer;I)V", "LeftColumnView", "(Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "RightColumnView", "model", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;Landroidx/compose/runtime/Composer;I)V", "TwoColumnFooter", "sendPromptEnabled", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;ZLandroidx/compose/runtime/Composer;I)V", "ej-ui", "tips", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/Tip;", "state", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState;", "followUpModel", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/followup/FollowupViewModel;"})
/*     */ @SourceDebugExtension({"SMAP\nTwoColumnsJunie.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TwoColumnsJunie.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/TwoColumnsJunieKt\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 11 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 12 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,186:1\n2001#2:187\n1885#2,3:188\n1888#2,4:192\n1970#2:196\n1885#2,7:197\n149#3:191\n149#3:317\n149#3:318\n149#3:363\n86#4:204\n82#4,7:205\n89#4:240\n86#4:277\n83#4,6:278\n89#4:312\n93#4:316\n86#4:319\n83#4,6:320\n89#4:354\n93#4:358\n93#4:407\n79#5,6:212\n86#5,4:227\n90#5,2:237\n79#5,6:248\n86#5,4:263\n90#5,2:273\n79#5,6:284\n86#5,4:299\n90#5,2:309\n94#5:315\n79#5,6:326\n86#5,4:341\n90#5,2:351\n94#5:357\n94#5:361\n79#5,6:371\n86#5,4:386\n90#5,2:396\n94#5:402\n94#5:406\n368#6,9:218\n377#6:239\n368#6,9:254\n377#6:275\n368#6,9:290\n377#6:311\n378#6,2:313\n368#6,9:332\n377#6:353\n378#6,2:355\n378#6,2:359\n368#6,9:377\n377#6:398\n378#6,2:400\n378#6,2:404\n4034#7,6:231\n4034#7,6:267\n4034#7,6:303\n4034#7,6:345\n4034#7,6:390\n99#8:241\n96#8,6:242\n102#8:276\n106#8:362\n71#9:364\n68#9,6:365\n74#9:399\n78#9:403\n481#10:408\n480#10,4:409\n484#10,2:416\n488#10:422\n1225#11,3:413\n1228#11,3:419\n1225#11,6:423\n1225#11,6:429\n480#12:418\n81#13:435\n81#13:436\n81#13:437\n*S KotlinDebug\n*F\n+ 1 TwoColumnsJunie.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/TwoColumnsJunieKt\n*L\n52#1:187\n52#1:188,3\n52#1:192,4\n57#1:196\n57#1:197,7\n55#1:191\n76#1:317\n85#1:318\n97#1:363\n62#1:204\n62#1:205,7\n62#1:240\n64#1:277\n64#1:278,6\n64#1:312\n64#1:316\n81#1:319\n81#1:320,6\n81#1:354\n81#1:358\n62#1:407\n62#1:212,6\n62#1:227,4\n62#1:237,2\n63#1:248,6\n63#1:263,4\n63#1:273,2\n64#1:284,6\n64#1:299,4\n64#1:309,2\n64#1:315\n81#1:326,6\n81#1:341,4\n81#1:351,2\n81#1:357\n63#1:361\n93#1:371,6\n93#1:386,4\n93#1:396,2\n93#1:402\n62#1:406\n62#1:218,9\n62#1:239\n63#1:254,9\n63#1:275\n64#1:290,9\n64#1:311\n64#1:313,2\n81#1:332,9\n81#1:353\n81#1:355,2\n63#1:359,2\n93#1:377,9\n93#1:398\n93#1:400,2\n62#1:404,2\n62#1:231,6\n63#1:267,6\n64#1:303,6\n81#1:345,6\n93#1:390,6\n63#1:241\n63#1:242,6\n63#1:276\n63#1:362\n93#1:364\n93#1:365,6\n93#1:399\n93#1:403\n113#1:408\n113#1:409,4\n113#1:416,2\n113#1:422\n113#1:413,3\n113#1:419,3\n117#1:423,6\n156#1:429,6\n113#1:418\n152#1:435\n170#1:436\n171#1:437\n*E\n"})
/*     */ public final class TwoColumnsJunieKt {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void TwoColumnView(@NotNull List junieProblems, @Nullable GrazieQuotaWarning quotaWarning, @NotNull ViewModel currentPage, @NotNull Function0 onJunieProblemRefresh, @NotNull Transition transition, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'junieProblems'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'currentPage'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_3
/*     */     //   13: ldc 'onJunieProblemRefresh'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload #4
/*     */     //   20: ldc 'transition'
/*     */     //   22: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   25: aload #5
/*     */     //   27: ldc 988272107
/*     */     //   29: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   34: astore #5
/*     */     //   36: iload #6
/*     */     //   38: istore #7
/*     */     //   40: iload #6
/*     */     //   42: bipush #6
/*     */     //   44: iand
/*     */     //   45: ifne -> 69
/*     */     //   48: iload #7
/*     */     //   50: aload #5
/*     */     //   52: aload_0
/*     */     //   53: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   58: ifeq -> 65
/*     */     //   61: iconst_4
/*     */     //   62: goto -> 66
/*     */     //   65: iconst_2
/*     */     //   66: ior
/*     */     //   67: istore #7
/*     */     //   69: iload #6
/*     */     //   71: bipush #48
/*     */     //   73: iand
/*     */     //   74: ifne -> 100
/*     */     //   77: iload #7
/*     */     //   79: aload #5
/*     */     //   81: aload_1
/*     */     //   82: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   87: ifeq -> 95
/*     */     //   90: bipush #32
/*     */     //   92: goto -> 97
/*     */     //   95: bipush #16
/*     */     //   97: ior
/*     */     //   98: istore #7
/*     */     //   100: iload #6
/*     */     //   102: sipush #384
/*     */     //   105: iand
/*     */     //   106: ifne -> 134
/*     */     //   109: iload #7
/*     */     //   111: aload #5
/*     */     //   113: aload_2
/*     */     //   114: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   119: ifeq -> 128
/*     */     //   122: sipush #256
/*     */     //   125: goto -> 131
/*     */     //   128: sipush #128
/*     */     //   131: ior
/*     */     //   132: istore #7
/*     */     //   134: iload #6
/*     */     //   136: sipush #3072
/*     */     //   139: iand
/*     */     //   140: ifne -> 168
/*     */     //   143: iload #7
/*     */     //   145: aload #5
/*     */     //   147: aload_3
/*     */     //   148: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   153: ifeq -> 162
/*     */     //   156: sipush #2048
/*     */     //   159: goto -> 165
/*     */     //   162: sipush #1024
/*     */     //   165: ior
/*     */     //   166: istore #7
/*     */     //   168: iload #6
/*     */     //   170: sipush #24576
/*     */     //   173: iand
/*     */     //   174: ifne -> 203
/*     */     //   177: iload #7
/*     */     //   179: aload #5
/*     */     //   181: aload #4
/*     */     //   183: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   188: ifeq -> 197
/*     */     //   191: sipush #16384
/*     */     //   194: goto -> 200
/*     */     //   197: sipush #8192
/*     */     //   200: ior
/*     */     //   201: istore #7
/*     */     //   203: iload #7
/*     */     //   205: sipush #9363
/*     */     //   208: iand
/*     */     //   209: sipush #9362
/*     */     //   212: if_icmpne -> 225
/*     */     //   215: aload #5
/*     */     //   217: invokeinterface getSkipping : ()Z
/*     */     //   222: ifne -> 3420
/*     */     //   225: invokestatic isTraceInProgress : ()Z
/*     */     //   228: ifeq -> 241
/*     */     //   231: ldc 988272107
/*     */     //   233: iload #7
/*     */     //   235: iconst_m1
/*     */     //   236: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.TwoColumnView (TwoColumnsJunie.kt:50)'
/*     */     //   238: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   241: aload #4
/*     */     //   243: astore #9
/*     */     //   245: getstatic com/intellij/ml/llm/matterhorn/ej/ui/toolwindow/TwoColumnsJunieKt$TwoColumnView$columnOffsetIN$1.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/TwoColumnsJunieKt$TwoColumnView$columnOffsetIN$1;
/*     */     //   248: checkcast kotlin/jvm/functions/Function3
/*     */     //   251: astore #10
/*     */     //   253: ldc 'columnOffset'
/*     */     //   255: astore #11
/*     */     //   257: sipush #384
/*     */     //   260: bipush #14
/*     */     //   262: iload #7
/*     */     //   264: bipush #12
/*     */     //   266: ishr
/*     */     //   267: iand
/*     */     //   268: ior
/*     */     //   269: istore #12
/*     */     //   271: nop
/*     */     //   272: iconst_0
/*     */     //   273: istore #13
/*     */     //   275: aload #5
/*     */     //   277: ldc 184732935
/*     */     //   279: ldc 'CC(animateDp)P(2)2000@82338L75:Transition.kt#pdpnli'
/*     */     //   281: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   284: aload #9
/*     */     //   286: astore #14
/*     */     //   288: getstatic androidx/compose/ui/unit/Dp.Companion : Landroidx/compose/ui/unit/Dp$Companion;
/*     */     //   291: invokestatic getVectorConverter : (Landroidx/compose/ui/unit/Dp$Companion;)Landroidx/compose/animation/core/TwoWayConverter;
/*     */     //   294: astore #15
/*     */     //   296: bipush #14
/*     */     //   298: iload #12
/*     */     //   300: iand
/*     */     //   301: sipush #896
/*     */     //   304: iload #12
/*     */     //   306: iconst_3
/*     */     //   307: ishl
/*     */     //   308: iand
/*     */     //   309: ior
/*     */     //   310: sipush #7168
/*     */     //   313: iload #12
/*     */     //   315: iconst_3
/*     */     //   316: ishl
/*     */     //   317: iand
/*     */     //   318: ior
/*     */     //   319: ldc 57344
/*     */     //   321: iload #12
/*     */     //   323: iconst_3
/*     */     //   324: ishl
/*     */     //   325: iand
/*     */     //   326: ior
/*     */     //   327: istore #16
/*     */     //   329: iconst_0
/*     */     //   330: istore #17
/*     */     //   332: aload #5
/*     */     //   334: ldc -142660079
/*     */     //   336: ldc 'CC(animateValue)P(3,2)1886@77187L32,1887@77242L31,1888@77298L23,1890@77334L89:Transition.kt#pdpnli'
/*     */     //   338: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   341: aload #14
/*     */     //   343: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*     */     //   346: aload #5
/*     */     //   348: bipush #112
/*     */     //   350: iload #16
/*     */     //   352: bipush #9
/*     */     //   354: ishr
/*     */     //   355: iand
/*     */     //   356: istore #18
/*     */     //   358: astore #19
/*     */     //   360: checkcast java/lang/Boolean
/*     */     //   363: invokevirtual booleanValue : ()Z
/*     */     //   366: istore #20
/*     */     //   368: iconst_0
/*     */     //   369: istore #21
/*     */     //   371: aload #19
/*     */     //   373: ldc 749711628
/*     */     //   375: invokeinterface startReplaceGroup : (I)V
/*     */     //   380: invokestatic isTraceInProgress : ()Z
/*     */     //   383: ifeq -> 396
/*     */     //   386: ldc 749711628
/*     */     //   388: iload #18
/*     */     //   390: iconst_m1
/*     */     //   391: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.TwoColumnView.<anonymous> (TwoColumnsJunie.kt:54)'
/*     */     //   393: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   396: iload #20
/*     */     //   398: ifeq -> 417
/*     */     //   401: bipush #50
/*     */     //   403: istore #22
/*     */     //   405: iconst_0
/*     */     //   406: istore #23
/*     */     //   408: iload #22
/*     */     //   410: i2f
/*     */     //   411: invokestatic constructor-impl : (F)F
/*     */     //   414: goto -> 429
/*     */     //   417: iconst_0
/*     */     //   418: istore #22
/*     */     //   420: iconst_0
/*     */     //   421: istore #23
/*     */     //   423: iload #22
/*     */     //   425: i2f
/*     */     //   426: invokestatic constructor-impl : (F)F
/*     */     //   429: fstore #24
/*     */     //   431: invokestatic isTraceInProgress : ()Z
/*     */     //   434: ifeq -> 440
/*     */     //   437: invokestatic traceEventEnd : ()V
/*     */     //   440: aload #19
/*     */     //   442: invokeinterface endReplaceGroup : ()V
/*     */     //   447: fload #24
/*     */     //   449: invokestatic box-impl : (F)Landroidx/compose/ui/unit/Dp;
/*     */     //   452: astore #20
/*     */     //   454: aload #14
/*     */     //   456: invokevirtual getTargetState : ()Ljava/lang/Object;
/*     */     //   459: aload #5
/*     */     //   461: bipush #112
/*     */     //   463: iload #16
/*     */     //   465: bipush #9
/*     */     //   467: ishr
/*     */     //   468: iand
/*     */     //   469: istore #21
/*     */     //   471: astore #18
/*     */     //   473: checkcast java/lang/Boolean
/*     */     //   476: invokevirtual booleanValue : ()Z
/*     */     //   479: istore #19
/*     */     //   481: iconst_0
/*     */     //   482: istore #22
/*     */     //   484: aload #18
/*     */     //   486: ldc 749711628
/*     */     //   488: invokeinterface startReplaceGroup : (I)V
/*     */     //   493: invokestatic isTraceInProgress : ()Z
/*     */     //   496: ifeq -> 509
/*     */     //   499: ldc 749711628
/*     */     //   501: iload #21
/*     */     //   503: iconst_m1
/*     */     //   504: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.TwoColumnView.<anonymous> (TwoColumnsJunie.kt:54)'
/*     */     //   506: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   509: iload #19
/*     */     //   511: ifeq -> 530
/*     */     //   514: bipush #50
/*     */     //   516: istore #23
/*     */     //   518: iconst_0
/*     */     //   519: istore #24
/*     */     //   521: iload #23
/*     */     //   523: i2f
/*     */     //   524: invokestatic constructor-impl : (F)F
/*     */     //   527: goto -> 542
/*     */     //   530: iconst_0
/*     */     //   531: istore #23
/*     */     //   533: iconst_0
/*     */     //   534: istore #24
/*     */     //   536: iload #23
/*     */     //   538: i2f
/*     */     //   539: invokestatic constructor-impl : (F)F
/*     */     //   542: fstore #25
/*     */     //   544: invokestatic isTraceInProgress : ()Z
/*     */     //   547: ifeq -> 553
/*     */     //   550: invokestatic traceEventEnd : ()V
/*     */     //   553: aload #18
/*     */     //   555: invokeinterface endReplaceGroup : ()V
/*     */     //   560: fload #25
/*     */     //   562: invokestatic box-impl : (F)Landroidx/compose/ui/unit/Dp;
/*     */     //   565: astore #19
/*     */     //   567: aload #10
/*     */     //   569: aload #14
/*     */     //   571: invokevirtual getSegment : ()Landroidx/compose/animation/core/Transition$Segment;
/*     */     //   574: aload #5
/*     */     //   576: bipush #112
/*     */     //   578: iload #16
/*     */     //   580: iconst_3
/*     */     //   581: ishr
/*     */     //   582: iand
/*     */     //   583: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   586: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   591: checkcast androidx/compose/animation/core/FiniteAnimationSpec
/*     */     //   594: astore #18
/*     */     //   596: aload #14
/*     */     //   598: aload #20
/*     */     //   600: aload #19
/*     */     //   602: aload #18
/*     */     //   604: aload #15
/*     */     //   606: aload #11
/*     */     //   608: aload #5
/*     */     //   610: bipush #14
/*     */     //   612: iload #16
/*     */     //   614: iand
/*     */     //   615: ldc 57344
/*     */     //   617: iload #16
/*     */     //   619: bipush #9
/*     */     //   621: ishl
/*     */     //   622: iand
/*     */     //   623: ior
/*     */     //   624: ldc 458752
/*     */     //   626: iload #16
/*     */     //   628: bipush #6
/*     */     //   630: ishl
/*     */     //   631: iand
/*     */     //   632: ior
/*     */     //   633: invokestatic createTransitionAnimation : (Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   636: astore #21
/*     */     //   638: aload #5
/*     */     //   640: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   643: aload #21
/*     */     //   645: nop
/*     */     //   646: astore #26
/*     */     //   648: aload #5
/*     */     //   650: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   653: aload #26
/*     */     //   655: astore #8
/*     */     //   657: aload #4
/*     */     //   659: astore #10
/*     */     //   661: getstatic com/intellij/ml/llm/matterhorn/ej/ui/toolwindow/TwoColumnsJunieKt$TwoColumnView$alpha$1.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/TwoColumnsJunieKt$TwoColumnView$alpha$1;
/*     */     //   664: checkcast kotlin/jvm/functions/Function3
/*     */     //   667: astore #11
/*     */     //   669: ldc 'alpha'
/*     */     //   671: astore #12
/*     */     //   673: sipush #384
/*     */     //   676: bipush #14
/*     */     //   678: iload #7
/*     */     //   680: bipush #12
/*     */     //   682: ishr
/*     */     //   683: iand
/*     */     //   684: ior
/*     */     //   685: istore #13
/*     */     //   687: nop
/*     */     //   688: iconst_0
/*     */     //   689: istore #14
/*     */     //   691: aload #5
/*     */     //   693: ldc -1338768149
/*     */     //   695: ldc 'CC(animateFloat)P(2)1969@80624L78:Transition.kt#pdpnli'
/*     */     //   697: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   700: aload #10
/*     */     //   702: astore #15
/*     */     //   704: getstatic kotlin/jvm/internal/FloatCompanionObject.INSTANCE : Lkotlin/jvm/internal/FloatCompanionObject;
/*     */     //   707: invokestatic getVectorConverter : (Lkotlin/jvm/internal/FloatCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;
/*     */     //   710: astore #16
/*     */     //   712: bipush #14
/*     */     //   714: iload #13
/*     */     //   716: iand
/*     */     //   717: sipush #896
/*     */     //   720: iload #13
/*     */     //   722: iconst_3
/*     */     //   723: ishl
/*     */     //   724: iand
/*     */     //   725: ior
/*     */     //   726: sipush #7168
/*     */     //   729: iload #13
/*     */     //   731: iconst_3
/*     */     //   732: ishl
/*     */     //   733: iand
/*     */     //   734: ior
/*     */     //   735: ldc 57344
/*     */     //   737: iload #13
/*     */     //   739: iconst_3
/*     */     //   740: ishl
/*     */     //   741: iand
/*     */     //   742: ior
/*     */     //   743: istore #17
/*     */     //   745: iconst_0
/*     */     //   746: istore #18
/*     */     //   748: aload #5
/*     */     //   750: ldc -142660079
/*     */     //   752: ldc 'CC(animateValue)P(3,2)1886@77187L32,1887@77242L31,1888@77298L23,1890@77334L89:Transition.kt#pdpnli'
/*     */     //   754: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   757: aload #15
/*     */     //   759: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*     */     //   762: aload #5
/*     */     //   764: bipush #112
/*     */     //   766: iload #17
/*     */     //   768: bipush #9
/*     */     //   770: ishr
/*     */     //   771: iand
/*     */     //   772: istore #19
/*     */     //   774: astore #20
/*     */     //   776: checkcast java/lang/Boolean
/*     */     //   779: invokevirtual booleanValue : ()Z
/*     */     //   782: istore #21
/*     */     //   784: iconst_0
/*     */     //   785: istore #22
/*     */     //   787: aload #20
/*     */     //   789: ldc -1707703258
/*     */     //   791: invokeinterface startReplaceGroup : (I)V
/*     */     //   796: invokestatic isTraceInProgress : ()Z
/*     */     //   799: ifeq -> 812
/*     */     //   802: ldc -1707703258
/*     */     //   804: iload #19
/*     */     //   806: iconst_m1
/*     */     //   807: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.TwoColumnView.<anonymous> (TwoColumnsJunie.kt:59)'
/*     */     //   809: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   812: iload #21
/*     */     //   814: ifeq -> 821
/*     */     //   817: fconst_0
/*     */     //   818: goto -> 822
/*     */     //   821: fconst_1
/*     */     //   822: fstore #23
/*     */     //   824: invokestatic isTraceInProgress : ()Z
/*     */     //   827: ifeq -> 833
/*     */     //   830: invokestatic traceEventEnd : ()V
/*     */     //   833: aload #20
/*     */     //   835: invokeinterface endReplaceGroup : ()V
/*     */     //   840: fload #23
/*     */     //   842: invokestatic valueOf : (F)Ljava/lang/Float;
/*     */     //   845: astore #21
/*     */     //   847: aload #15
/*     */     //   849: invokevirtual getTargetState : ()Ljava/lang/Object;
/*     */     //   852: aload #5
/*     */     //   854: bipush #112
/*     */     //   856: iload #17
/*     */     //   858: bipush #9
/*     */     //   860: ishr
/*     */     //   861: iand
/*     */     //   862: istore #22
/*     */     //   864: astore #19
/*     */     //   866: checkcast java/lang/Boolean
/*     */     //   869: invokevirtual booleanValue : ()Z
/*     */     //   872: istore #20
/*     */     //   874: iconst_0
/*     */     //   875: istore #23
/*     */     //   877: aload #19
/*     */     //   879: ldc -1707703258
/*     */     //   881: invokeinterface startReplaceGroup : (I)V
/*     */     //   886: invokestatic isTraceInProgress : ()Z
/*     */     //   889: ifeq -> 902
/*     */     //   892: ldc -1707703258
/*     */     //   894: iload #22
/*     */     //   896: iconst_m1
/*     */     //   897: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.TwoColumnView.<anonymous> (TwoColumnsJunie.kt:59)'
/*     */     //   899: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   902: iload #20
/*     */     //   904: ifeq -> 911
/*     */     //   907: fconst_0
/*     */     //   908: goto -> 912
/*     */     //   911: fconst_1
/*     */     //   912: fstore #24
/*     */     //   914: invokestatic isTraceInProgress : ()Z
/*     */     //   917: ifeq -> 923
/*     */     //   920: invokestatic traceEventEnd : ()V
/*     */     //   923: aload #19
/*     */     //   925: invokeinterface endReplaceGroup : ()V
/*     */     //   930: fload #24
/*     */     //   932: invokestatic valueOf : (F)Ljava/lang/Float;
/*     */     //   935: astore #20
/*     */     //   937: aload #11
/*     */     //   939: aload #15
/*     */     //   941: invokevirtual getSegment : ()Landroidx/compose/animation/core/Transition$Segment;
/*     */     //   944: aload #5
/*     */     //   946: bipush #112
/*     */     //   948: iload #17
/*     */     //   950: iconst_3
/*     */     //   951: ishr
/*     */     //   952: iand
/*     */     //   953: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   956: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   961: checkcast androidx/compose/animation/core/FiniteAnimationSpec
/*     */     //   964: astore #19
/*     */     //   966: aload #15
/*     */     //   968: aload #21
/*     */     //   970: aload #20
/*     */     //   972: aload #19
/*     */     //   974: aload #16
/*     */     //   976: aload #12
/*     */     //   978: aload #5
/*     */     //   980: bipush #14
/*     */     //   982: iload #17
/*     */     //   984: iand
/*     */     //   985: ldc 57344
/*     */     //   987: iload #17
/*     */     //   989: bipush #9
/*     */     //   991: ishl
/*     */     //   992: iand
/*     */     //   993: ior
/*     */     //   994: ldc 458752
/*     */     //   996: iload #17
/*     */     //   998: bipush #6
/*     */     //   1000: ishl
/*     */     //   1001: iand
/*     */     //   1002: ior
/*     */     //   1003: invokestatic createTransitionAnimation : (Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1006: astore #22
/*     */     //   1008: aload #5
/*     */     //   1010: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1013: aload #22
/*     */     //   1015: nop
/*     */     //   1016: astore #25
/*     */     //   1018: aload #5
/*     */     //   1020: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1023: aload #25
/*     */     //   1025: astore #9
/*     */     //   1027: iconst_0
/*     */     //   1028: istore #13
/*     */     //   1030: nop
/*     */     //   1031: iconst_0
/*     */     //   1032: istore #14
/*     */     //   1034: aload #5
/*     */     //   1036: ldc -483455358
/*     */     //   1038: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   1040: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1043: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1046: checkcast androidx/compose/ui/Modifier
/*     */     //   1049: astore #10
/*     */     //   1051: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   1054: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   1057: astore #11
/*     */     //   1059: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1062: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   1065: astore #12
/*     */     //   1067: aload #11
/*     */     //   1069: aload #12
/*     */     //   1071: aload #5
/*     */     //   1073: bipush #14
/*     */     //   1075: iload #13
/*     */     //   1077: iconst_3
/*     */     //   1078: ishr
/*     */     //   1079: iand
/*     */     //   1080: bipush #112
/*     */     //   1082: iload #13
/*     */     //   1084: iconst_3
/*     */     //   1085: ishr
/*     */     //   1086: iand
/*     */     //   1087: ior
/*     */     //   1088: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1091: astore #15
/*     */     //   1093: bipush #112
/*     */     //   1095: iload #13
/*     */     //   1097: iconst_3
/*     */     //   1098: ishl
/*     */     //   1099: iand
/*     */     //   1100: istore #16
/*     */     //   1102: nop
/*     */     //   1103: iconst_0
/*     */     //   1104: istore #17
/*     */     //   1106: aload #5
/*     */     //   1108: ldc -1323940314
/*     */     //   1110: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1112: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1115: aload #5
/*     */     //   1117: iconst_0
/*     */     //   1118: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1121: istore #18
/*     */     //   1123: aload #5
/*     */     //   1125: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1130: astore #19
/*     */     //   1132: aload #5
/*     */     //   1134: aload #10
/*     */     //   1136: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1139: astore #20
/*     */     //   1141: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1144: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1147: astore #21
/*     */     //   1149: bipush #6
/*     */     //   1151: sipush #896
/*     */     //   1154: iload #16
/*     */     //   1156: bipush #6
/*     */     //   1158: ishl
/*     */     //   1159: iand
/*     */     //   1160: ior
/*     */     //   1161: istore #22
/*     */     //   1163: nop
/*     */     //   1164: iconst_0
/*     */     //   1165: istore #23
/*     */     //   1167: aload #5
/*     */     //   1169: ldc -692256719
/*     */     //   1171: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1173: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1176: aload #5
/*     */     //   1178: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1183: instanceof androidx/compose/runtime/Applier
/*     */     //   1186: ifne -> 1192
/*     */     //   1189: invokestatic invalidApplier : ()V
/*     */     //   1192: aload #5
/*     */     //   1194: invokeinterface startReusableNode : ()V
/*     */     //   1199: aload #5
/*     */     //   1201: invokeinterface getInserting : ()Z
/*     */     //   1206: ifeq -> 1221
/*     */     //   1209: aload #5
/*     */     //   1211: aload #21
/*     */     //   1213: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1218: goto -> 1228
/*     */     //   1221: aload #5
/*     */     //   1223: invokeinterface useNode : ()V
/*     */     //   1228: aload #5
/*     */     //   1230: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1233: astore #24
/*     */     //   1235: iconst_0
/*     */     //   1236: istore #25
/*     */     //   1238: aload #24
/*     */     //   1240: aload #15
/*     */     //   1242: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1245: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1248: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1251: aload #24
/*     */     //   1253: aload #19
/*     */     //   1255: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1258: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1261: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1264: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1267: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1270: astore #26
/*     */     //   1272: iconst_0
/*     */     //   1273: istore #27
/*     */     //   1275: aload #24
/*     */     //   1277: astore #28
/*     */     //   1279: iconst_0
/*     */     //   1280: istore #29
/*     */     //   1282: aload #28
/*     */     //   1284: invokeinterface getInserting : ()Z
/*     */     //   1289: ifne -> 1310
/*     */     //   1292: aload #28
/*     */     //   1294: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1299: iload #18
/*     */     //   1301: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1304: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1307: ifne -> 1336
/*     */     //   1310: aload #28
/*     */     //   1312: iload #18
/*     */     //   1314: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1317: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1322: aload #24
/*     */     //   1324: iload #18
/*     */     //   1326: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1329: aload #26
/*     */     //   1331: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1336: nop
/*     */     //   1337: nop
/*     */     //   1338: nop
/*     */     //   1339: aload #24
/*     */     //   1341: aload #20
/*     */     //   1343: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1346: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1349: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1352: nop
/*     */     //   1353: nop
/*     */     //   1354: aload #5
/*     */     //   1356: bipush #14
/*     */     //   1358: iload #22
/*     */     //   1360: bipush #6
/*     */     //   1362: ishr
/*     */     //   1363: iand
/*     */     //   1364: istore #30
/*     */     //   1366: astore #31
/*     */     //   1368: iconst_0
/*     */     //   1369: istore #32
/*     */     //   1371: aload #31
/*     */     //   1373: ldc_w -384784025
/*     */     //   1376: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   1379: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1382: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   1385: aload #31
/*     */     //   1387: bipush #6
/*     */     //   1389: bipush #112
/*     */     //   1391: iload #13
/*     */     //   1393: bipush #6
/*     */     //   1395: ishr
/*     */     //   1396: iand
/*     */     //   1397: ior
/*     */     //   1398: istore #33
/*     */     //   1400: astore #34
/*     */     //   1402: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   1405: astore #35
/*     */     //   1407: iconst_0
/*     */     //   1408: istore #36
/*     */     //   1410: aload #35
/*     */     //   1412: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1415: checkcast androidx/compose/ui/Modifier
/*     */     //   1418: fconst_1
/*     */     //   1419: iconst_0
/*     */     //   1420: iconst_2
/*     */     //   1421: aconst_null
/*     */     //   1422: invokestatic weight$default : (Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1425: astore #37
/*     */     //   1427: iconst_0
/*     */     //   1428: istore #38
/*     */     //   1430: iconst_0
/*     */     //   1431: istore #39
/*     */     //   1433: aload #34
/*     */     //   1435: ldc_w 693286680
/*     */     //   1438: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   1441: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1444: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   1447: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   1450: astore #40
/*     */     //   1452: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1455: invokevirtual getTop : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   1458: astore #41
/*     */     //   1460: aload #40
/*     */     //   1462: aload #41
/*     */     //   1464: aload #34
/*     */     //   1466: bipush #14
/*     */     //   1468: iload #38
/*     */     //   1470: iconst_3
/*     */     //   1471: ishr
/*     */     //   1472: iand
/*     */     //   1473: bipush #112
/*     */     //   1475: iload #38
/*     */     //   1477: iconst_3
/*     */     //   1478: ishr
/*     */     //   1479: iand
/*     */     //   1480: ior
/*     */     //   1481: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1484: astore #42
/*     */     //   1486: bipush #112
/*     */     //   1488: iload #38
/*     */     //   1490: iconst_3
/*     */     //   1491: ishl
/*     */     //   1492: iand
/*     */     //   1493: istore #43
/*     */     //   1495: nop
/*     */     //   1496: iconst_0
/*     */     //   1497: istore #44
/*     */     //   1499: aload #34
/*     */     //   1501: ldc -1323940314
/*     */     //   1503: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1505: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1508: aload #34
/*     */     //   1510: iconst_0
/*     */     //   1511: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1514: istore #45
/*     */     //   1516: aload #34
/*     */     //   1518: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1523: astore #46
/*     */     //   1525: aload #34
/*     */     //   1527: aload #37
/*     */     //   1529: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1532: astore #47
/*     */     //   1534: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1537: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1540: astore #48
/*     */     //   1542: bipush #6
/*     */     //   1544: sipush #896
/*     */     //   1547: iload #43
/*     */     //   1549: bipush #6
/*     */     //   1551: ishl
/*     */     //   1552: iand
/*     */     //   1553: ior
/*     */     //   1554: istore #49
/*     */     //   1556: nop
/*     */     //   1557: iconst_0
/*     */     //   1558: istore #50
/*     */     //   1560: aload #34
/*     */     //   1562: ldc -692256719
/*     */     //   1564: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1566: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1569: aload #34
/*     */     //   1571: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1576: instanceof androidx/compose/runtime/Applier
/*     */     //   1579: ifne -> 1585
/*     */     //   1582: invokestatic invalidApplier : ()V
/*     */     //   1585: aload #34
/*     */     //   1587: invokeinterface startReusableNode : ()V
/*     */     //   1592: aload #34
/*     */     //   1594: invokeinterface getInserting : ()Z
/*     */     //   1599: ifeq -> 1614
/*     */     //   1602: aload #34
/*     */     //   1604: aload #48
/*     */     //   1606: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1611: goto -> 1621
/*     */     //   1614: aload #34
/*     */     //   1616: invokeinterface useNode : ()V
/*     */     //   1621: aload #34
/*     */     //   1623: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1626: astore #51
/*     */     //   1628: iconst_0
/*     */     //   1629: istore #52
/*     */     //   1631: aload #51
/*     */     //   1633: aload #42
/*     */     //   1635: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1638: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1641: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1644: aload #51
/*     */     //   1646: aload #46
/*     */     //   1648: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1651: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1654: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1657: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1660: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1663: astore #53
/*     */     //   1665: iconst_0
/*     */     //   1666: istore #54
/*     */     //   1668: aload #51
/*     */     //   1670: astore #55
/*     */     //   1672: iconst_0
/*     */     //   1673: istore #56
/*     */     //   1675: aload #55
/*     */     //   1677: invokeinterface getInserting : ()Z
/*     */     //   1682: ifne -> 1703
/*     */     //   1685: aload #55
/*     */     //   1687: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1692: iload #45
/*     */     //   1694: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1697: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1700: ifne -> 1729
/*     */     //   1703: aload #55
/*     */     //   1705: iload #45
/*     */     //   1707: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1710: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1715: aload #51
/*     */     //   1717: iload #45
/*     */     //   1719: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1722: aload #53
/*     */     //   1724: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1729: nop
/*     */     //   1730: nop
/*     */     //   1731: nop
/*     */     //   1732: aload #51
/*     */     //   1734: aload #47
/*     */     //   1736: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1739: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1742: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1745: nop
/*     */     //   1746: nop
/*     */     //   1747: aload #34
/*     */     //   1749: bipush #14
/*     */     //   1751: iload #49
/*     */     //   1753: bipush #6
/*     */     //   1755: ishr
/*     */     //   1756: iand
/*     */     //   1757: istore #57
/*     */     //   1759: astore #58
/*     */     //   1761: iconst_0
/*     */     //   1762: istore #59
/*     */     //   1764: aload #58
/*     */     //   1766: ldc_w -407840262
/*     */     //   1769: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   1772: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1775: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   1778: aload #58
/*     */     //   1780: bipush #6
/*     */     //   1782: bipush #112
/*     */     //   1784: iload #38
/*     */     //   1786: bipush #6
/*     */     //   1788: ishr
/*     */     //   1789: iand
/*     */     //   1790: ior
/*     */     //   1791: istore #60
/*     */     //   1793: astore #61
/*     */     //   1795: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   1798: astore #62
/*     */     //   1800: iconst_0
/*     */     //   1801: istore #63
/*     */     //   1803: aload #62
/*     */     //   1805: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1808: checkcast androidx/compose/ui/Modifier
/*     */     //   1811: aload #61
/*     */     //   1813: iconst_0
/*     */     //   1814: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   1817: invokevirtual getBackgroundColor-0d7_KjU : ()J
/*     */     //   1820: aconst_null
/*     */     //   1821: iconst_2
/*     */     //   1822: aconst_null
/*     */     //   1823: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1826: fconst_0
/*     */     //   1827: iconst_1
/*     */     //   1828: aconst_null
/*     */     //   1829: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1832: fconst_1
/*     */     //   1833: iconst_0
/*     */     //   1834: iconst_2
/*     */     //   1835: aconst_null
/*     */     //   1836: invokestatic weight$default : (Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1839: aload #8
/*     */     //   1841: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   1846: checkcast androidx/compose/ui/unit/Dp
/*     */     //   1849: invokevirtual unbox-impl : ()F
/*     */     //   1852: fconst_0
/*     */     //   1853: iconst_2
/*     */     //   1854: aconst_null
/*     */     //   1855: invokestatic offset-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1858: aload #9
/*     */     //   1860: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   1865: checkcast java/lang/Number
/*     */     //   1868: invokevirtual floatValue : ()F
/*     */     //   1871: invokestatic alpha : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   1874: astore #64
/*     */     //   1876: iconst_0
/*     */     //   1877: istore #65
/*     */     //   1879: nop
/*     */     //   1880: iconst_0
/*     */     //   1881: istore #66
/*     */     //   1883: aload #61
/*     */     //   1885: ldc -483455358
/*     */     //   1887: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   1889: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1892: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   1895: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   1898: astore #67
/*     */     //   1900: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1903: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   1906: astore #68
/*     */     //   1908: aload #67
/*     */     //   1910: aload #68
/*     */     //   1912: aload #61
/*     */     //   1914: bipush #14
/*     */     //   1916: iload #65
/*     */     //   1918: iconst_3
/*     */     //   1919: ishr
/*     */     //   1920: iand
/*     */     //   1921: bipush #112
/*     */     //   1923: iload #65
/*     */     //   1925: iconst_3
/*     */     //   1926: ishr
/*     */     //   1927: iand
/*     */     //   1928: ior
/*     */     //   1929: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1932: astore #69
/*     */     //   1934: bipush #112
/*     */     //   1936: iload #65
/*     */     //   1938: iconst_3
/*     */     //   1939: ishl
/*     */     //   1940: iand
/*     */     //   1941: istore #70
/*     */     //   1943: nop
/*     */     //   1944: iconst_0
/*     */     //   1945: istore #71
/*     */     //   1947: aload #61
/*     */     //   1949: ldc -1323940314
/*     */     //   1951: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1953: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1956: aload #61
/*     */     //   1958: iconst_0
/*     */     //   1959: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1962: istore #72
/*     */     //   1964: aload #61
/*     */     //   1966: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1971: astore #73
/*     */     //   1973: aload #61
/*     */     //   1975: aload #64
/*     */     //   1977: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1980: astore #74
/*     */     //   1982: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1985: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1988: astore #75
/*     */     //   1990: bipush #6
/*     */     //   1992: sipush #896
/*     */     //   1995: iload #70
/*     */     //   1997: bipush #6
/*     */     //   1999: ishl
/*     */     //   2000: iand
/*     */     //   2001: ior
/*     */     //   2002: istore #76
/*     */     //   2004: nop
/*     */     //   2005: iconst_0
/*     */     //   2006: istore #77
/*     */     //   2008: aload #61
/*     */     //   2010: ldc -692256719
/*     */     //   2012: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   2014: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2017: aload #61
/*     */     //   2019: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   2024: instanceof androidx/compose/runtime/Applier
/*     */     //   2027: ifne -> 2033
/*     */     //   2030: invokestatic invalidApplier : ()V
/*     */     //   2033: aload #61
/*     */     //   2035: invokeinterface startReusableNode : ()V
/*     */     //   2040: aload #61
/*     */     //   2042: invokeinterface getInserting : ()Z
/*     */     //   2047: ifeq -> 2062
/*     */     //   2050: aload #61
/*     */     //   2052: aload #75
/*     */     //   2054: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   2059: goto -> 2069
/*     */     //   2062: aload #61
/*     */     //   2064: invokeinterface useNode : ()V
/*     */     //   2069: aload #61
/*     */     //   2071: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   2074: astore #78
/*     */     //   2076: iconst_0
/*     */     //   2077: istore #79
/*     */     //   2079: aload #78
/*     */     //   2081: aload #69
/*     */     //   2083: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2086: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2089: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2092: aload #78
/*     */     //   2094: aload #73
/*     */     //   2096: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2099: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2102: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2105: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2108: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2111: astore #80
/*     */     //   2113: iconst_0
/*     */     //   2114: istore #81
/*     */     //   2116: aload #78
/*     */     //   2118: astore #82
/*     */     //   2120: iconst_0
/*     */     //   2121: istore #83
/*     */     //   2123: aload #82
/*     */     //   2125: invokeinterface getInserting : ()Z
/*     */     //   2130: ifne -> 2151
/*     */     //   2133: aload #82
/*     */     //   2135: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2140: iload #72
/*     */     //   2142: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2145: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   2148: ifne -> 2177
/*     */     //   2151: aload #82
/*     */     //   2153: iload #72
/*     */     //   2155: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2158: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2163: aload #78
/*     */     //   2165: iload #72
/*     */     //   2167: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2170: aload #80
/*     */     //   2172: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2177: nop
/*     */     //   2178: nop
/*     */     //   2179: nop
/*     */     //   2180: aload #78
/*     */     //   2182: aload #74
/*     */     //   2184: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2187: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2190: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2193: nop
/*     */     //   2194: nop
/*     */     //   2195: aload #61
/*     */     //   2197: bipush #14
/*     */     //   2199: iload #76
/*     */     //   2201: bipush #6
/*     */     //   2203: ishr
/*     */     //   2204: iand
/*     */     //   2205: istore #84
/*     */     //   2207: astore #85
/*     */     //   2209: iconst_0
/*     */     //   2210: istore #86
/*     */     //   2212: aload #85
/*     */     //   2214: ldc_w -384784025
/*     */     //   2217: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   2220: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2223: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   2226: aload #85
/*     */     //   2228: bipush #6
/*     */     //   2230: bipush #112
/*     */     //   2232: iload #65
/*     */     //   2234: bipush #6
/*     */     //   2236: ishr
/*     */     //   2237: iand
/*     */     //   2238: ior
/*     */     //   2239: istore #87
/*     */     //   2241: astore #88
/*     */     //   2243: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   2246: astore #89
/*     */     //   2248: iconst_0
/*     */     //   2249: istore #90
/*     */     //   2251: aload_0
/*     */     //   2252: aload_1
/*     */     //   2253: aload_2
/*     */     //   2254: aload_3
/*     */     //   2255: aload #88
/*     */     //   2257: bipush #14
/*     */     //   2259: iload #7
/*     */     //   2261: iand
/*     */     //   2262: bipush #112
/*     */     //   2264: iload #7
/*     */     //   2266: iand
/*     */     //   2267: ior
/*     */     //   2268: sipush #896
/*     */     //   2271: iload #7
/*     */     //   2273: iand
/*     */     //   2274: ior
/*     */     //   2275: sipush #7168
/*     */     //   2278: iload #7
/*     */     //   2280: iand
/*     */     //   2281: ior
/*     */     //   2282: invokestatic LeftColumnView : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
/*     */     //   2285: nop
/*     */     //   2286: aload #85
/*     */     //   2288: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2291: aload #61
/*     */     //   2293: invokeinterface endNode : ()V
/*     */     //   2298: aload #61
/*     */     //   2300: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2303: nop
/*     */     //   2304: aload #61
/*     */     //   2306: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2309: nop
/*     */     //   2310: aload #61
/*     */     //   2312: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2315: nop
/*     */     //   2316: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   2319: checkcast androidx/compose/ui/Modifier
/*     */     //   2322: iconst_1
/*     */     //   2323: istore #64
/*     */     //   2325: iconst_0
/*     */     //   2326: istore #67
/*     */     //   2328: iload #64
/*     */     //   2330: i2f
/*     */     //   2331: invokestatic constructor-impl : (F)F
/*     */     //   2334: invokestatic width-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   2337: fconst_0
/*     */     //   2338: iconst_1
/*     */     //   2339: aconst_null
/*     */     //   2340: invokestatic fillMaxHeight$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2343: aload #9
/*     */     //   2345: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   2350: checkcast java/lang/Number
/*     */     //   2353: invokevirtual floatValue : ()F
/*     */     //   2356: invokestatic alpha : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   2359: aload #61
/*     */     //   2361: iconst_0
/*     */     //   2362: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   2365: invokevirtual getSeparatorColor-0d7_KjU : ()J
/*     */     //   2368: aconst_null
/*     */     //   2369: iconst_2
/*     */     //   2370: aconst_null
/*     */     //   2371: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2374: aload #61
/*     */     //   2376: iconst_0
/*     */     //   2377: invokestatic Box : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   2380: aload #62
/*     */     //   2382: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   2385: checkcast androidx/compose/ui/Modifier
/*     */     //   2388: aload #61
/*     */     //   2390: iconst_0
/*     */     //   2391: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   2394: invokevirtual getBackgroundColor-0d7_KjU : ()J
/*     */     //   2397: aconst_null
/*     */     //   2398: iconst_2
/*     */     //   2399: aconst_null
/*     */     //   2400: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2403: fconst_0
/*     */     //   2404: iconst_1
/*     */     //   2405: aconst_null
/*     */     //   2406: invokestatic fillMaxSize$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2409: bipush #8
/*     */     //   2411: istore #64
/*     */     //   2413: iconst_0
/*     */     //   2414: istore #67
/*     */     //   2416: iload #64
/*     */     //   2418: i2f
/*     */     //   2419: invokestatic constructor-impl : (F)F
/*     */     //   2422: fconst_0
/*     */     //   2423: fconst_0
/*     */     //   2424: fconst_0
/*     */     //   2425: bipush #14
/*     */     //   2427: aconst_null
/*     */     //   2428: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2431: fconst_1
/*     */     //   2432: iconst_0
/*     */     //   2433: iconst_2
/*     */     //   2434: aconst_null
/*     */     //   2435: invokestatic weight$default : (Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2438: aload #8
/*     */     //   2440: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   2445: checkcast androidx/compose/ui/unit/Dp
/*     */     //   2448: invokevirtual unbox-impl : ()F
/*     */     //   2451: fconst_0
/*     */     //   2452: iconst_2
/*     */     //   2453: aconst_null
/*     */     //   2454: invokestatic offset-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2457: aload #9
/*     */     //   2459: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   2464: checkcast java/lang/Number
/*     */     //   2467: invokevirtual floatValue : ()F
/*     */     //   2470: invokestatic alpha : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   2473: astore #64
/*     */     //   2475: iconst_0
/*     */     //   2476: istore #65
/*     */     //   2478: nop
/*     */     //   2479: iconst_0
/*     */     //   2480: istore #66
/*     */     //   2482: aload #61
/*     */     //   2484: ldc -483455358
/*     */     //   2486: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   2488: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2491: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   2494: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   2497: astore #67
/*     */     //   2499: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   2502: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   2505: astore #68
/*     */     //   2507: aload #67
/*     */     //   2509: aload #68
/*     */     //   2511: aload #61
/*     */     //   2513: bipush #14
/*     */     //   2515: iload #65
/*     */     //   2517: iconst_3
/*     */     //   2518: ishr
/*     */     //   2519: iand
/*     */     //   2520: bipush #112
/*     */     //   2522: iload #65
/*     */     //   2524: iconst_3
/*     */     //   2525: ishr
/*     */     //   2526: iand
/*     */     //   2527: ior
/*     */     //   2528: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2531: astore #69
/*     */     //   2533: bipush #112
/*     */     //   2535: iload #65
/*     */     //   2537: iconst_3
/*     */     //   2538: ishl
/*     */     //   2539: iand
/*     */     //   2540: istore #70
/*     */     //   2542: nop
/*     */     //   2543: iconst_0
/*     */     //   2544: istore #71
/*     */     //   2546: aload #61
/*     */     //   2548: ldc -1323940314
/*     */     //   2550: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   2552: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2555: aload #61
/*     */     //   2557: iconst_0
/*     */     //   2558: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   2561: istore #72
/*     */     //   2563: aload #61
/*     */     //   2565: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   2570: astore #73
/*     */     //   2572: aload #61
/*     */     //   2574: aload #64
/*     */     //   2576: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   2579: astore #74
/*     */     //   2581: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2584: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   2587: astore #75
/*     */     //   2589: bipush #6
/*     */     //   2591: sipush #896
/*     */     //   2594: iload #70
/*     */     //   2596: bipush #6
/*     */     //   2598: ishl
/*     */     //   2599: iand
/*     */     //   2600: ior
/*     */     //   2601: istore #76
/*     */     //   2603: nop
/*     */     //   2604: iconst_0
/*     */     //   2605: istore #77
/*     */     //   2607: aload #61
/*     */     //   2609: ldc -692256719
/*     */     //   2611: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   2613: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2616: aload #61
/*     */     //   2618: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   2623: instanceof androidx/compose/runtime/Applier
/*     */     //   2626: ifne -> 2632
/*     */     //   2629: invokestatic invalidApplier : ()V
/*     */     //   2632: aload #61
/*     */     //   2634: invokeinterface startReusableNode : ()V
/*     */     //   2639: aload #61
/*     */     //   2641: invokeinterface getInserting : ()Z
/*     */     //   2646: ifeq -> 2661
/*     */     //   2649: aload #61
/*     */     //   2651: aload #75
/*     */     //   2653: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   2658: goto -> 2668
/*     */     //   2661: aload #61
/*     */     //   2663: invokeinterface useNode : ()V
/*     */     //   2668: aload #61
/*     */     //   2670: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   2673: astore #78
/*     */     //   2675: iconst_0
/*     */     //   2676: istore #79
/*     */     //   2678: aload #78
/*     */     //   2680: aload #69
/*     */     //   2682: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2685: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2688: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2691: aload #78
/*     */     //   2693: aload #73
/*     */     //   2695: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2698: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2701: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2704: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2707: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2710: astore #80
/*     */     //   2712: iconst_0
/*     */     //   2713: istore #81
/*     */     //   2715: aload #78
/*     */     //   2717: astore #82
/*     */     //   2719: iconst_0
/*     */     //   2720: istore #83
/*     */     //   2722: aload #82
/*     */     //   2724: invokeinterface getInserting : ()Z
/*     */     //   2729: ifne -> 2750
/*     */     //   2732: aload #82
/*     */     //   2734: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2739: iload #72
/*     */     //   2741: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2744: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   2747: ifne -> 2776
/*     */     //   2750: aload #82
/*     */     //   2752: iload #72
/*     */     //   2754: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2757: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2762: aload #78
/*     */     //   2764: iload #72
/*     */     //   2766: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2769: aload #80
/*     */     //   2771: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2776: nop
/*     */     //   2777: nop
/*     */     //   2778: nop
/*     */     //   2779: aload #78
/*     */     //   2781: aload #74
/*     */     //   2783: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2786: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2789: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2792: nop
/*     */     //   2793: nop
/*     */     //   2794: aload #61
/*     */     //   2796: bipush #14
/*     */     //   2798: iload #76
/*     */     //   2800: bipush #6
/*     */     //   2802: ishr
/*     */     //   2803: iand
/*     */     //   2804: istore #84
/*     */     //   2806: astore #85
/*     */     //   2808: iconst_0
/*     */     //   2809: istore #86
/*     */     //   2811: aload #85
/*     */     //   2813: ldc_w -384784025
/*     */     //   2816: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   2819: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2822: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   2825: aload #85
/*     */     //   2827: bipush #6
/*     */     //   2829: bipush #112
/*     */     //   2831: iload #65
/*     */     //   2833: bipush #6
/*     */     //   2835: ishr
/*     */     //   2836: iand
/*     */     //   2837: ior
/*     */     //   2838: istore #87
/*     */     //   2840: astore #88
/*     */     //   2842: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   2845: astore #89
/*     */     //   2847: iconst_0
/*     */     //   2848: istore #90
/*     */     //   2850: aload_2
/*     */     //   2851: aload #88
/*     */     //   2853: bipush #14
/*     */     //   2855: iload #7
/*     */     //   2857: bipush #6
/*     */     //   2859: ishr
/*     */     //   2860: iand
/*     */     //   2861: invokestatic RightColumnView : (Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;Landroidx/compose/runtime/Composer;I)V
/*     */     //   2864: nop
/*     */     //   2865: aload #85
/*     */     //   2867: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2870: aload #61
/*     */     //   2872: invokeinterface endNode : ()V
/*     */     //   2877: aload #61
/*     */     //   2879: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2882: nop
/*     */     //   2883: aload #61
/*     */     //   2885: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2888: nop
/*     */     //   2889: aload #61
/*     */     //   2891: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2894: nop
/*     */     //   2895: nop
/*     */     //   2896: aload #58
/*     */     //   2898: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2901: aload #34
/*     */     //   2903: invokeinterface endNode : ()V
/*     */     //   2908: aload #34
/*     */     //   2910: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2913: nop
/*     */     //   2914: aload #34
/*     */     //   2916: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2919: nop
/*     */     //   2920: aload #34
/*     */     //   2922: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2925: nop
/*     */     //   2926: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   2929: checkcast androidx/compose/ui/Modifier
/*     */     //   2932: aload #34
/*     */     //   2934: iconst_0
/*     */     //   2935: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   2938: invokevirtual getBackgroundColor-0d7_KjU : ()J
/*     */     //   2941: aconst_null
/*     */     //   2942: iconst_2
/*     */     //   2943: aconst_null
/*     */     //   2944: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2947: fconst_0
/*     */     //   2948: iconst_1
/*     */     //   2949: aconst_null
/*     */     //   2950: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2953: bipush #8
/*     */     //   2955: istore #37
/*     */     //   2957: iconst_0
/*     */     //   2958: istore #40
/*     */     //   2960: iload #37
/*     */     //   2962: i2f
/*     */     //   2963: invokestatic constructor-impl : (F)F
/*     */     //   2966: invokestatic padding-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   2969: astore #37
/*     */     //   2971: iconst_0
/*     */     //   2972: istore #38
/*     */     //   2974: nop
/*     */     //   2975: iconst_0
/*     */     //   2976: istore #39
/*     */     //   2978: aload #34
/*     */     //   2980: ldc_w 733328855
/*     */     //   2983: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   2986: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2989: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   2992: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   2995: astore #40
/*     */     //   2997: iconst_0
/*     */     //   2998: istore #41
/*     */     //   3000: aload #40
/*     */     //   3002: iload #41
/*     */     //   3004: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   3007: astore #42
/*     */     //   3009: bipush #112
/*     */     //   3011: iload #38
/*     */     //   3013: iconst_3
/*     */     //   3014: ishl
/*     */     //   3015: iand
/*     */     //   3016: istore #43
/*     */     //   3018: nop
/*     */     //   3019: iconst_0
/*     */     //   3020: istore #44
/*     */     //   3022: aload #34
/*     */     //   3024: ldc -1323940314
/*     */     //   3026: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   3028: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   3031: aload #34
/*     */     //   3033: iconst_0
/*     */     //   3034: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   3037: istore #45
/*     */     //   3039: aload #34
/*     */     //   3041: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   3046: astore #46
/*     */     //   3048: aload #34
/*     */     //   3050: aload #37
/*     */     //   3052: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   3055: astore #47
/*     */     //   3057: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3060: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   3063: astore #48
/*     */     //   3065: bipush #6
/*     */     //   3067: sipush #896
/*     */     //   3070: iload #43
/*     */     //   3072: bipush #6
/*     */     //   3074: ishl
/*     */     //   3075: iand
/*     */     //   3076: ior
/*     */     //   3077: istore #49
/*     */     //   3079: nop
/*     */     //   3080: iconst_0
/*     */     //   3081: istore #50
/*     */     //   3083: aload #34
/*     */     //   3085: ldc -692256719
/*     */     //   3087: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   3089: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   3092: aload #34
/*     */     //   3094: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   3099: instanceof androidx/compose/runtime/Applier
/*     */     //   3102: ifne -> 3108
/*     */     //   3105: invokestatic invalidApplier : ()V
/*     */     //   3108: aload #34
/*     */     //   3110: invokeinterface startReusableNode : ()V
/*     */     //   3115: aload #34
/*     */     //   3117: invokeinterface getInserting : ()Z
/*     */     //   3122: ifeq -> 3137
/*     */     //   3125: aload #34
/*     */     //   3127: aload #48
/*     */     //   3129: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   3134: goto -> 3144
/*     */     //   3137: aload #34
/*     */     //   3139: invokeinterface useNode : ()V
/*     */     //   3144: aload #34
/*     */     //   3146: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   3149: astore #51
/*     */     //   3151: iconst_0
/*     */     //   3152: istore #52
/*     */     //   3154: aload #51
/*     */     //   3156: aload #42
/*     */     //   3158: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3161: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3164: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3167: aload #51
/*     */     //   3169: aload #46
/*     */     //   3171: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3174: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3177: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3180: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3183: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3186: astore #53
/*     */     //   3188: iconst_0
/*     */     //   3189: istore #54
/*     */     //   3191: aload #51
/*     */     //   3193: astore #55
/*     */     //   3195: iconst_0
/*     */     //   3196: istore #56
/*     */     //   3198: aload #55
/*     */     //   3200: invokeinterface getInserting : ()Z
/*     */     //   3205: ifne -> 3226
/*     */     //   3208: aload #55
/*     */     //   3210: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   3215: iload #45
/*     */     //   3217: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3220: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   3223: ifne -> 3252
/*     */     //   3226: aload #55
/*     */     //   3228: iload #45
/*     */     //   3230: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3233: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   3238: aload #51
/*     */     //   3240: iload #45
/*     */     //   3242: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3245: aload #53
/*     */     //   3247: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3252: nop
/*     */     //   3253: nop
/*     */     //   3254: nop
/*     */     //   3255: aload #51
/*     */     //   3257: aload #47
/*     */     //   3259: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3262: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3265: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3268: nop
/*     */     //   3269: nop
/*     */     //   3270: aload #34
/*     */     //   3272: bipush #14
/*     */     //   3274: iload #49
/*     */     //   3276: bipush #6
/*     */     //   3278: ishr
/*     */     //   3279: iand
/*     */     //   3280: istore #57
/*     */     //   3282: astore #58
/*     */     //   3284: iconst_0
/*     */     //   3285: istore #59
/*     */     //   3287: aload #58
/*     */     //   3289: ldc_w -2146769399
/*     */     //   3292: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   3295: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   3298: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   3301: aload #58
/*     */     //   3303: bipush #6
/*     */     //   3305: bipush #112
/*     */     //   3307: iload #38
/*     */     //   3309: bipush #6
/*     */     //   3311: ishr
/*     */     //   3312: iand
/*     */     //   3313: ior
/*     */     //   3314: istore #60
/*     */     //   3316: astore #61
/*     */     //   3318: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   3321: astore #62
/*     */     //   3323: iconst_0
/*     */     //   3324: istore #63
/*     */     //   3326: aload_2
/*     */     //   3327: aload_0
/*     */     //   3328: invokeinterface isEmpty : ()Z
/*     */     //   3333: aload #61
/*     */     //   3335: bipush #14
/*     */     //   3337: iload #7
/*     */     //   3339: bipush #6
/*     */     //   3341: ishr
/*     */     //   3342: iand
/*     */     //   3343: invokestatic TwoColumnFooter : (Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;ZLandroidx/compose/runtime/Composer;I)V
/*     */     //   3346: nop
/*     */     //   3347: aload #58
/*     */     //   3349: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3352: aload #34
/*     */     //   3354: invokeinterface endNode : ()V
/*     */     //   3359: aload #34
/*     */     //   3361: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3364: nop
/*     */     //   3365: aload #34
/*     */     //   3367: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3370: nop
/*     */     //   3371: aload #34
/*     */     //   3373: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3376: nop
/*     */     //   3377: nop
/*     */     //   3378: aload #31
/*     */     //   3380: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3383: aload #5
/*     */     //   3385: invokeinterface endNode : ()V
/*     */     //   3390: aload #5
/*     */     //   3392: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3395: nop
/*     */     //   3396: aload #5
/*     */     //   3398: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3401: nop
/*     */     //   3402: aload #5
/*     */     //   3404: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3407: nop
/*     */     //   3408: invokestatic isTraceInProgress : ()Z
/*     */     //   3411: ifeq -> 3427
/*     */     //   3414: invokestatic traceEventEnd : ()V
/*     */     //   3417: goto -> 3427
/*     */     //   3420: aload #5
/*     */     //   3422: invokeinterface skipToGroupEnd : ()V
/*     */     //   3427: aload #5
/*     */     //   3429: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   3434: dup
/*     */     //   3435: ifnull -> 3459
/*     */     //   3438: aload_0
/*     */     //   3439: aload_1
/*     */     //   3440: aload_2
/*     */     //   3441: aload_3
/*     */     //   3442: aload #4
/*     */     //   3444: iload #6
/*     */     //   3446: <illegal opcode> invoke : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/Transition;I)Lkotlin/jvm/functions/Function2;
/*     */     //   3451: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   3456: goto -> 3460
/*     */     //   3459: pop
/*     */     //   3460: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #51	-> 25
/*     */     //   #52	-> 241
/*     */     //   #54	-> 253
/*     */     //   #52	-> 271
/*     */     //   #187	-> 281
/*     */     //   #187	-> 284
/*     */     //   #188	-> 338
/*     */     //   #190	-> 341
/*     */     //   #55	-> 393
/*     */     //   #191	-> 408
/*     */     //   #55	-> 417
/*     */     //   #191	-> 423
/*     */     //   #55	-> 429
/*     */     //   #190	-> 452
/*     */     //   #192	-> 454
/*     */     //   #55	-> 506
/*     */     //   #191	-> 521
/*     */     //   #55	-> 530
/*     */     //   #191	-> 536
/*     */     //   #55	-> 542
/*     */     //   #192	-> 565
/*     */     //   #193	-> 567
/*     */     //   #195	-> 596
/*     */     //   #188	-> 640
/*     */     //   #195	-> 645
/*     */     //   #187	-> 646
/*     */     //   #52	-> 655
/*     */     //   #57	-> 657
/*     */     //   #59	-> 669
/*     */     //   #57	-> 687
/*     */     //   #196	-> 697
/*     */     //   #196	-> 700
/*     */     //   #197	-> 754
/*     */     //   #199	-> 757
/*     */     //   #60	-> 809
/*     */     //   #199	-> 845
/*     */     //   #200	-> 847
/*     */     //   #60	-> 899
/*     */     //   #200	-> 935
/*     */     //   #201	-> 937
/*     */     //   #203	-> 966
/*     */     //   #197	-> 1010
/*     */     //   #203	-> 1015
/*     */     //   #196	-> 1016
/*     */     //   #57	-> 1025
/*     */     //   #62	-> 1030
/*     */     //   #204	-> 1040
/*     */     //   #205	-> 1043
/*     */     //   #206	-> 1051
/*     */     //   #207	-> 1059
/*     */     //   #210	-> 1067
/*     */     //   #211	-> 1102
/*     */     //   #212	-> 1112
/*     */     //   #213	-> 1118
/*     */     //   #214	-> 1125
/*     */     //   #215	-> 1134
/*     */     //   #217	-> 1141
/*     */     //   #216	-> 1163
/*     */     //   #218	-> 1173
/*     */     //   #219	-> 1176
/*     */     //   #220	-> 1194
/*     */     //   #221	-> 1199
/*     */     //   #222	-> 1211
/*     */     //   #224	-> 1223
/*     */     //   #226	-> 1228
/*     */     //   #227	-> 1238
/*     */     //   #228	-> 1251
/*     */     //   #230	-> 1264
/*     */     //   #231	-> 1275
/*     */     //   #232	-> 1282
/*     */     //   #233	-> 1310
/*     */     //   #234	-> 1322
/*     */     //   #236	-> 1336
/*     */     //   #231	-> 1337
/*     */     //   #236	-> 1338
/*     */     //   #237	-> 1339
/*     */     //   #238	-> 1352
/*     */     //   #226	-> 1353
/*     */     //   #239	-> 1354
/*     */     //   #240	-> 1379
/*     */     //   #63	-> 1410
/*     */     //   #241	-> 1441
/*     */     //   #242	-> 1444
/*     */     //   #243	-> 1452
/*     */     //   #246	-> 1460
/*     */     //   #247	-> 1495
/*     */     //   #248	-> 1505
/*     */     //   #249	-> 1511
/*     */     //   #250	-> 1518
/*     */     //   #251	-> 1527
/*     */     //   #253	-> 1534
/*     */     //   #252	-> 1556
/*     */     //   #254	-> 1566
/*     */     //   #255	-> 1569
/*     */     //   #256	-> 1587
/*     */     //   #257	-> 1592
/*     */     //   #258	-> 1604
/*     */     //   #260	-> 1616
/*     */     //   #262	-> 1621
/*     */     //   #263	-> 1631
/*     */     //   #264	-> 1644
/*     */     //   #266	-> 1657
/*     */     //   #267	-> 1668
/*     */     //   #268	-> 1675
/*     */     //   #269	-> 1703
/*     */     //   #270	-> 1715
/*     */     //   #272	-> 1729
/*     */     //   #267	-> 1730
/*     */     //   #272	-> 1731
/*     */     //   #273	-> 1732
/*     */     //   #274	-> 1745
/*     */     //   #262	-> 1746
/*     */     //   #275	-> 1747
/*     */     //   #276	-> 1772
/*     */     //   #65	-> 1803
/*     */     //   #66	-> 1814
/*     */     //   #67	-> 1826
/*     */     //   #68	-> 1832
/*     */     //   #69	-> 1839
/*     */     //   #70	-> 1858
/*     */     //   #64	-> 1879
/*     */     //   #277	-> 1889
/*     */     //   #278	-> 1892
/*     */     //   #279	-> 1900
/*     */     //   #282	-> 1908
/*     */     //   #283	-> 1943
/*     */     //   #284	-> 1953
/*     */     //   #285	-> 1959
/*     */     //   #286	-> 1966
/*     */     //   #287	-> 1975
/*     */     //   #289	-> 1982
/*     */     //   #288	-> 2004
/*     */     //   #290	-> 2014
/*     */     //   #291	-> 2017
/*     */     //   #292	-> 2035
/*     */     //   #293	-> 2040
/*     */     //   #294	-> 2052
/*     */     //   #296	-> 2064
/*     */     //   #298	-> 2069
/*     */     //   #299	-> 2079
/*     */     //   #300	-> 2092
/*     */     //   #302	-> 2105
/*     */     //   #303	-> 2116
/*     */     //   #304	-> 2123
/*     */     //   #305	-> 2151
/*     */     //   #306	-> 2163
/*     */     //   #308	-> 2177
/*     */     //   #303	-> 2178
/*     */     //   #308	-> 2179
/*     */     //   #309	-> 2180
/*     */     //   #310	-> 2193
/*     */     //   #298	-> 2194
/*     */     //   #311	-> 2195
/*     */     //   #312	-> 2220
/*     */     //   #72	-> 2251
/*     */     //   #73	-> 2285
/*     */     //   #312	-> 2286
/*     */     //   #311	-> 2291
/*     */     //   #313	-> 2293
/*     */     //   #290	-> 2300
/*     */     //   #314	-> 2303
/*     */     //   #284	-> 2306
/*     */     //   #315	-> 2309
/*     */     //   #277	-> 2312
/*     */     //   #316	-> 2315
/*     */     //   #75	-> 2316
/*     */     //   #76	-> 2322
/*     */     //   #317	-> 2328
/*     */     //   #76	-> 2334
/*     */     //   #77	-> 2337
/*     */     //   #78	-> 2343
/*     */     //   #79	-> 2362
/*     */     //   #74	-> 2377
/*     */     //   #82	-> 2380
/*     */     //   #83	-> 2391
/*     */     //   #84	-> 2403
/*     */     //   #85	-> 2409
/*     */     //   #318	-> 2416
/*     */     //   #85	-> 2422
/*     */     //   #86	-> 2431
/*     */     //   #87	-> 2438
/*     */     //   #88	-> 2457
/*     */     //   #81	-> 2478
/*     */     //   #319	-> 2488
/*     */     //   #320	-> 2491
/*     */     //   #321	-> 2499
/*     */     //   #324	-> 2507
/*     */     //   #325	-> 2542
/*     */     //   #326	-> 2552
/*     */     //   #327	-> 2558
/*     */     //   #328	-> 2565
/*     */     //   #329	-> 2574
/*     */     //   #331	-> 2581
/*     */     //   #330	-> 2603
/*     */     //   #332	-> 2613
/*     */     //   #333	-> 2616
/*     */     //   #334	-> 2634
/*     */     //   #335	-> 2639
/*     */     //   #336	-> 2651
/*     */     //   #338	-> 2663
/*     */     //   #340	-> 2668
/*     */     //   #341	-> 2678
/*     */     //   #342	-> 2691
/*     */     //   #344	-> 2704
/*     */     //   #345	-> 2715
/*     */     //   #346	-> 2722
/*     */     //   #347	-> 2750
/*     */     //   #348	-> 2762
/*     */     //   #350	-> 2776
/*     */     //   #345	-> 2777
/*     */     //   #350	-> 2778
/*     */     //   #351	-> 2779
/*     */     //   #352	-> 2792
/*     */     //   #340	-> 2793
/*     */     //   #353	-> 2794
/*     */     //   #354	-> 2819
/*     */     //   #90	-> 2850
/*     */     //   #91	-> 2864
/*     */     //   #354	-> 2865
/*     */     //   #353	-> 2870
/*     */     //   #355	-> 2872
/*     */     //   #332	-> 2879
/*     */     //   #356	-> 2882
/*     */     //   #326	-> 2885
/*     */     //   #357	-> 2888
/*     */     //   #319	-> 2891
/*     */     //   #358	-> 2894
/*     */     //   #92	-> 2895
/*     */     //   #276	-> 2896
/*     */     //   #275	-> 2901
/*     */     //   #359	-> 2903
/*     */     //   #254	-> 2910
/*     */     //   #360	-> 2913
/*     */     //   #248	-> 2916
/*     */     //   #361	-> 2919
/*     */     //   #241	-> 2922
/*     */     //   #362	-> 2925
/*     */     //   #94	-> 2926
/*     */     //   #95	-> 2935
/*     */     //   #96	-> 2947
/*     */     //   #97	-> 2953
/*     */     //   #363	-> 2960
/*     */     //   #97	-> 2966
/*     */     //   #93	-> 2974
/*     */     //   #364	-> 2986
/*     */     //   #365	-> 2989
/*     */     //   #366	-> 2997
/*     */     //   #369	-> 3000
/*     */     //   #370	-> 3018
/*     */     //   #371	-> 3028
/*     */     //   #372	-> 3034
/*     */     //   #373	-> 3041
/*     */     //   #374	-> 3050
/*     */     //   #376	-> 3057
/*     */     //   #375	-> 3079
/*     */     //   #377	-> 3089
/*     */     //   #378	-> 3092
/*     */     //   #379	-> 3110
/*     */     //   #380	-> 3115
/*     */     //   #381	-> 3127
/*     */     //   #383	-> 3139
/*     */     //   #385	-> 3144
/*     */     //   #386	-> 3154
/*     */     //   #387	-> 3167
/*     */     //   #389	-> 3180
/*     */     //   #390	-> 3191
/*     */     //   #391	-> 3198
/*     */     //   #392	-> 3226
/*     */     //   #393	-> 3238
/*     */     //   #395	-> 3252
/*     */     //   #390	-> 3253
/*     */     //   #395	-> 3254
/*     */     //   #396	-> 3255
/*     */     //   #397	-> 3268
/*     */     //   #385	-> 3269
/*     */     //   #398	-> 3270
/*     */     //   #399	-> 3295
/*     */     //   #99	-> 3326
/*     */     //   #100	-> 3346
/*     */     //   #399	-> 3347
/*     */     //   #398	-> 3352
/*     */     //   #400	-> 3354
/*     */     //   #377	-> 3361
/*     */     //   #401	-> 3364
/*     */     //   #371	-> 3367
/*     */     //   #402	-> 3370
/*     */     //   #364	-> 3373
/*     */     //   #403	-> 3376
/*     */     //   #101	-> 3377
/*     */     //   #240	-> 3378
/*     */     //   #239	-> 3383
/*     */     //   #404	-> 3385
/*     */     //   #218	-> 3392
/*     */     //   #405	-> 3395
/*     */     //   #212	-> 3398
/*     */     //   #406	-> 3401
/*     */     //   #204	-> 3404
/*     */     //   #407	-> 3407
/*     */     //   #103	-> 3420
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   408	6	23	$i$f$getDp	I
/*     */     //   405	9	22	$this$dp$iv	I
/*     */     //   423	6	23	$i$f$getDp	I
/*     */     //   420	9	22	$this$dp$iv	I
/*     */     //   371	78	21	$i$a$-animateDp-TwoColumnsJunieKt$TwoColumnView$columnOffsetIN$2	I
/*     */     //   368	81	20	isSingle	Z
/*     */     //   368	81	19	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   368	81	18	$changed	I
/*     */     //   521	6	24	$i$f$getDp	I
/*     */     //   518	9	23	$this$dp$iv	I
/*     */     //   536	6	24	$i$f$getDp	I
/*     */     //   533	9	23	$this$dp$iv	I
/*     */     //   484	78	22	$i$a$-animateDp-TwoColumnsJunieKt$TwoColumnView$columnOffsetIN$2	I
/*     */     //   481	81	19	isSingle	Z
/*     */     //   481	81	18	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   481	81	21	$changed	I
/*     */     //   332	314	17	$i$f$animateValue	I
/*     */     //   454	192	20	initialValue$iv$iv	Ljava/lang/Object;
/*     */     //   567	79	19	targetValue$iv$iv	Ljava/lang/Object;
/*     */     //   596	50	18	animationSpec$iv$iv	Landroidx/compose/animation/core/FiniteAnimationSpec;
/*     */     //   329	317	14	$this$animateValue$iv$iv	Landroidx/compose/animation/core/Transition;
/*     */     //   329	317	15	typeConverter$iv$iv	Landroidx/compose/animation/core/TwoWayConverter;
/*     */     //   329	317	16	$changed$iv$iv	I
/*     */     //   275	380	13	$i$f$animateDp	I
/*     */     //   272	383	9	$this$animateDp$iv	Landroidx/compose/animation/core/Transition;
/*     */     //   272	383	10	transitionSpec$iv	Lkotlin/jvm/functions/Function3;
/*     */     //   272	383	11	label$iv	Ljava/lang/String;
/*     */     //   272	383	12	$changed$iv	I
/*     */     //   787	55	22	$i$a$-animateFloat-TwoColumnsJunieKt$TwoColumnView$alpha$2	I
/*     */     //   784	58	21	isSingle	Z
/*     */     //   784	58	20	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   784	58	19	$changed	I
/*     */     //   877	55	23	$i$a$-animateFloat-TwoColumnsJunieKt$TwoColumnView$alpha$2	I
/*     */     //   874	58	20	isSingle	Z
/*     */     //   874	58	19	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   874	58	22	$changed	I
/*     */     //   748	268	18	$i$f$animateValue	I
/*     */     //   847	169	21	initialValue$iv$iv	Ljava/lang/Object;
/*     */     //   937	79	20	targetValue$iv$iv	Ljava/lang/Object;
/*     */     //   966	50	19	animationSpec$iv$iv	Landroidx/compose/animation/core/FiniteAnimationSpec;
/*     */     //   745	271	15	$this$animateValue$iv$iv	Landroidx/compose/animation/core/Transition;
/*     */     //   745	271	16	typeConverter$iv$iv	Landroidx/compose/animation/core/TwoWayConverter;
/*     */     //   745	271	17	$changed$iv$iv	I
/*     */     //   691	334	14	$i$f$animateFloat	I
/*     */     //   688	337	10	$this$animateFloat$iv	Landroidx/compose/animation/core/Transition;
/*     */     //   688	337	11	transitionSpec$iv	Lkotlin/jvm/functions/Function3;
/*     */     //   688	337	12	label$iv	Ljava/lang/String;
/*     */     //   688	337	13	$changed$iv	I
/*     */     //   2251	35	90	$i$a$-Column-TwoColumnsJunieKt$TwoColumnView$1$1$1	I
/*     */     //   2248	38	89	$this$TwoColumnView_u24lambda_u246_u24lambda_u244_u24lambda_u242	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   2248	38	88	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   2248	38	87	$changed	I
/*     */     //   2212	79	86	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   2209	82	85	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2209	82	84	$changed$iv	I
/*     */     //   2123	55	83	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   2120	58	82	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2116	64	81	$i$f$set-impl	I
/*     */     //   2113	67	80	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   2079	115	79	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   2076	118	78	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2008	296	77	$i$f$ReusableComposeNode	I
/*     */     //   2005	299	75	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   2005	299	76	$changed$iv$iv$iv	I
/*     */     //   1947	363	71	$i$f$Layout	I
/*     */     //   1964	346	72	compositeKeyHash$iv$iv	I
/*     */     //   1973	337	73	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1982	328	74	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1944	366	70	$changed$iv$iv	I
/*     */     //   1883	433	66	$i$f$Column	I
/*     */     //   1934	382	69	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1880	436	64	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1900	416	67	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   1908	408	68	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   1880	436	65	$changed$iv	I
/*     */     //   2328	6	67	$i$f$getDp	I
/*     */     //   2325	9	64	$this$dp$iv	I
/*     */     //   2416	6	67	$i$f$getDp	I
/*     */     //   2413	9	64	$this$dp$iv	I
/*     */     //   2850	15	90	$i$a$-Column-TwoColumnsJunieKt$TwoColumnView$1$1$2	I
/*     */     //   2847	18	89	$this$TwoColumnView_u24lambda_u246_u24lambda_u244_u24lambda_u243	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   2847	18	88	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   2847	18	87	$changed	I
/*     */     //   2811	59	86	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   2808	62	85	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2808	62	84	$changed$iv	I
/*     */     //   2722	55	83	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   2719	58	82	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2715	64	81	$i$f$set-impl	I
/*     */     //   2712	67	80	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   2678	115	79	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   2675	118	78	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2607	276	77	$i$f$ReusableComposeNode	I
/*     */     //   2604	279	75	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   2604	279	76	$changed$iv$iv$iv	I
/*     */     //   2546	343	71	$i$f$Layout	I
/*     */     //   2563	326	72	compositeKeyHash$iv$iv	I
/*     */     //   2572	317	73	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   2581	308	74	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2543	346	70	$changed$iv$iv	I
/*     */     //   2482	413	66	$i$f$Column	I
/*     */     //   2533	362	69	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2479	416	64	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2499	396	67	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   2507	388	68	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   2479	416	65	$changed$iv	I
/*     */     //   1803	1093	63	$i$a$-Row-TwoColumnsJunieKt$TwoColumnView$1$1	I
/*     */     //   1800	1096	62	$this$TwoColumnView_u24lambda_u246_u24lambda_u244	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   1800	1096	61	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1800	1096	60	$changed	I
/*     */     //   1764	1137	59	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   1761	1140	58	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1761	1140	57	$changed$iv	I
/*     */     //   1675	55	56	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1672	58	55	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1668	64	54	$i$f$set-impl	I
/*     */     //   1665	67	53	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1631	115	52	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1628	118	51	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1560	1354	50	$i$f$ReusableComposeNode	I
/*     */     //   1557	1357	48	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1557	1357	49	$changed$iv$iv$iv	I
/*     */     //   1499	1421	44	$i$f$Layout	I
/*     */     //   1516	1404	45	compositeKeyHash$iv$iv	I
/*     */     //   1525	1395	46	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1534	1386	47	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1496	1424	43	$changed$iv$iv	I
/*     */     //   1433	1493	39	$i$f$Row	I
/*     */     //   1486	1440	42	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1430	1496	37	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1452	1474	40	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   1460	1466	41	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   1430	1496	38	$changed$iv	I
/*     */     //   2960	6	40	$i$f$getDp	I
/*     */     //   2957	9	37	$this$dp$iv	I
/*     */     //   3326	21	63	$i$a$-Box-TwoColumnsJunieKt$TwoColumnView$1$2	I
/*     */     //   3323	24	62	$this$TwoColumnView_u24lambda_u246_u24lambda_u245	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   3323	24	61	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   3323	24	60	$changed	I
/*     */     //   3287	65	59	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   3284	68	58	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3284	68	57	$changed$iv	I
/*     */     //   3198	55	56	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   3195	58	55	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3191	64	54	$i$f$set-impl	I
/*     */     //   3188	67	53	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   3154	115	52	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   3151	118	51	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3083	282	50	$i$f$ReusableComposeNode	I
/*     */     //   3080	285	48	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   3080	285	49	$changed$iv$iv$iv	I
/*     */     //   3022	349	44	$i$f$Layout	I
/*     */     //   3039	332	45	compositeKeyHash$iv$iv	I
/*     */     //   3048	323	46	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   3057	314	47	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   3019	352	43	$changed$iv$iv	I
/*     */     //   2978	399	39	$i$f$Box	I
/*     */     //   3009	368	42	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2975	402	37	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2997	380	40	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   3000	377	41	propagateMinConstraints$iv	Z
/*     */     //   2975	402	38	$changed$iv	I
/*     */     //   1410	1968	36	$i$a$-Column-TwoColumnsJunieKt$TwoColumnView$1	I
/*     */     //   1407	1971	35	$this$TwoColumnView_u24lambda_u246	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   1407	1971	34	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1407	1971	33	$changed	I
/*     */     //   1371	2012	32	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   1368	2015	31	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1368	2015	30	$changed$iv	I
/*     */     //   1282	55	29	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1279	58	28	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1275	64	27	$i$f$set-impl	I
/*     */     //   1272	67	26	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1238	115	25	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1235	118	24	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1167	2229	23	$i$f$ReusableComposeNode	I
/*     */     //   1164	2232	21	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1164	2232	22	$changed$iv$iv$iv	I
/*     */     //   1106	2296	17	$i$f$Layout	I
/*     */     //   1123	2279	18	compositeKeyHash$iv$iv	I
/*     */     //   1132	2270	19	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1141	2261	20	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1103	2299	16	$changed$iv$iv	I
/*     */     //   1034	2374	14	$i$f$Column	I
/*     */     //   1093	2315	15	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1051	2357	10	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1059	2349	11	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   1067	2341	12	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   1031	2377	13	$changed$iv	I
/*     */     //   657	2760	8	columnOffsetIN	Landroidx/compose/runtime/State;
/*     */     //   1027	2390	9	alpha	Landroidx/compose/runtime/State;
/*     */     //   40	3421	7	$dirty	I
/*     */     //   0	3461	0	junieProblems	Ljava/util/List;
/*     */     //   0	3461	1	quotaWarning	Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;
/*     */     //   0	3461	2	currentPage	Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;
/*     */     //   0	3461	3	onJunieProblemRefresh	Lkotlin/jvm/functions/Function0;
/*     */     //   0	3461	4	transition	Landroidx/compose/animation/core/Transition;
/*     */     //   0	3461	5	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	3461	6	$changed	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class TwoColumnsJunieKt$TwoColumnView$columnOffsetIN$1 implements Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Dp>> { public static final TwoColumnsJunieKt$TwoColumnView$columnOffsetIN$1 INSTANCE = new TwoColumnsJunieKt$TwoColumnView$columnOffsetIN$1();
/*     */     
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final FiniteAnimationSpec<Dp> invoke(Transition.Segment $this$animateDp, Composer $composer, int $changed) {
/*  53 */       Intrinsics.checkNotNullParameter($this$animateDp, "$this$animateDp"); $composer.startReplaceGroup(685331199); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(685331199, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.TwoColumnView.<anonymous> (TwoColumnsJunie.kt:52)");  TweenSpec tweenSpec = AnimationSpecKt.tween$default(500, 0, EasingKt.getFastOutSlowInEasing(), 2, null); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return (FiniteAnimationSpec<Dp>)tweenSpec;
/*     */     } } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class TwoColumnsJunieKt$TwoColumnView$alpha$1 implements Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>> { public static final TwoColumnsJunieKt$TwoColumnView$alpha$1 INSTANCE = new TwoColumnsJunieKt$TwoColumnView$alpha$1(); @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final FiniteAnimationSpec<Float> invoke(Transition.Segment $this$animateFloat, Composer $composer, int $changed) {
/*  58 */       Intrinsics.checkNotNullParameter($this$animateFloat, "$this$animateFloat"); $composer.startReplaceGroup(-1043737663); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1043737663, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.TwoColumnView.<anonymous> (TwoColumnsJunie.kt:57)");  TweenSpec tweenSpec = AnimationSpecKt.tween$default(750, 0, EasingKt.getLinearEasing(), 2, null); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return (FiniteAnimationSpec<Float>)tweenSpec;
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void LeftColumnView(@NotNull List junieProblems, @Nullable GrazieQuotaWarning quotaWarning, @NotNull ViewModel currentPage, @NotNull Function0 onJunieProblemRefresh, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'junieProblems'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'currentPage'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_3
/*     */     //   13: ldc 'onJunieProblemRefresh'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload #4
/*     */     //   20: ldc_w -277283385
/*     */     //   23: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   28: astore #4
/*     */     //   30: iload #5
/*     */     //   32: istore #6
/*     */     //   34: iload #5
/*     */     //   36: bipush #6
/*     */     //   38: iand
/*     */     //   39: ifne -> 63
/*     */     //   42: iload #6
/*     */     //   44: aload #4
/*     */     //   46: aload_0
/*     */     //   47: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   52: ifeq -> 59
/*     */     //   55: iconst_4
/*     */     //   56: goto -> 60
/*     */     //   59: iconst_2
/*     */     //   60: ior
/*     */     //   61: istore #6
/*     */     //   63: iload #5
/*     */     //   65: bipush #48
/*     */     //   67: iand
/*     */     //   68: ifne -> 94
/*     */     //   71: iload #6
/*     */     //   73: aload #4
/*     */     //   75: aload_1
/*     */     //   76: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   81: ifeq -> 89
/*     */     //   84: bipush #32
/*     */     //   86: goto -> 91
/*     */     //   89: bipush #16
/*     */     //   91: ior
/*     */     //   92: istore #6
/*     */     //   94: iload #5
/*     */     //   96: sipush #384
/*     */     //   99: iand
/*     */     //   100: ifne -> 128
/*     */     //   103: iload #6
/*     */     //   105: aload #4
/*     */     //   107: aload_2
/*     */     //   108: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   113: ifeq -> 122
/*     */     //   116: sipush #256
/*     */     //   119: goto -> 125
/*     */     //   122: sipush #128
/*     */     //   125: ior
/*     */     //   126: istore #6
/*     */     //   128: iload #5
/*     */     //   130: sipush #3072
/*     */     //   133: iand
/*     */     //   134: ifne -> 162
/*     */     //   137: iload #6
/*     */     //   139: aload #4
/*     */     //   141: aload_3
/*     */     //   142: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   147: ifeq -> 156
/*     */     //   150: sipush #2048
/*     */     //   153: goto -> 159
/*     */     //   156: sipush #1024
/*     */     //   159: ior
/*     */     //   160: istore #6
/*     */     //   162: iload #6
/*     */     //   164: sipush #1171
/*     */     //   167: iand
/*     */     //   168: sipush #1170
/*     */     //   171: if_icmpne -> 184
/*     */     //   174: aload #4
/*     */     //   176: invokeinterface getSkipping : ()Z
/*     */     //   181: ifne -> 766
/*     */     //   184: invokestatic isTraceInProgress : ()Z
/*     */     //   187: ifeq -> 202
/*     */     //   190: ldc_w -277283385
/*     */     //   193: iload #6
/*     */     //   195: iconst_m1
/*     */     //   196: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.LeftColumnView (TwoColumnsJunie.kt:111)'
/*     */     //   199: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   202: iconst_0
/*     */     //   203: istore #9
/*     */     //   205: nop
/*     */     //   206: iconst_0
/*     */     //   207: istore #10
/*     */     //   209: aload #4
/*     */     //   211: ldc_w 773894976
/*     */     //   214: ldc_w 'CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp'
/*     */     //   217: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   220: aload #4
/*     */     //   222: astore #11
/*     */     //   224: aload #4
/*     */     //   226: ldc_w -954370320
/*     */     //   229: ldc_w 'CC(remember):Effects.kt#9igjgp'
/*     */     //   232: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   235: aload #4
/*     */     //   237: astore #12
/*     */     //   239: iconst_0
/*     */     //   240: istore #13
/*     */     //   242: iconst_0
/*     */     //   243: istore #14
/*     */     //   245: aload #12
/*     */     //   247: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   252: astore #15
/*     */     //   254: iconst_0
/*     */     //   255: istore #16
/*     */     //   257: aload #15
/*     */     //   259: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   262: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   265: if_acmpne -> 312
/*     */     //   268: iconst_0
/*     */     //   269: istore #17
/*     */     //   271: iconst_0
/*     */     //   272: istore #18
/*     */     //   274: getstatic kotlin/coroutines/EmptyCoroutineContext.INSTANCE : Lkotlin/coroutines/EmptyCoroutineContext;
/*     */     //   277: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   280: aload #11
/*     */     //   282: invokestatic createCompositionCoroutineScope : (Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;
/*     */     //   285: astore #25
/*     */     //   287: new androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*     */     //   290: dup
/*     */     //   291: aload #25
/*     */     //   293: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;)V
/*     */     //   296: astore #18
/*     */     //   298: aload #12
/*     */     //   300: aload #18
/*     */     //   302: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   307: aload #18
/*     */     //   309: goto -> 314
/*     */     //   312: aload #15
/*     */     //   314: nop
/*     */     //   315: nop
/*     */     //   316: nop
/*     */     //   317: checkcast androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*     */     //   320: astore #19
/*     */     //   322: aload #4
/*     */     //   324: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   327: aload #19
/*     */     //   329: astore #20
/*     */     //   331: aload #20
/*     */     //   333: invokevirtual getCoroutineScope : ()Lkotlinx/coroutines/CoroutineScope;
/*     */     //   336: astore #19
/*     */     //   338: aload #4
/*     */     //   340: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   343: aload #19
/*     */     //   345: nop
/*     */     //   346: astore #7
/*     */     //   348: aload_0
/*     */     //   349: invokestatic firstOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   352: checkcast com/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem
/*     */     //   355: astore #8
/*     */     //   357: aload #4
/*     */     //   359: ldc_w -1264890946
/*     */     //   362: invokeinterface startReplaceGroup : (I)V
/*     */     //   367: aload #8
/*     */     //   369: dup
/*     */     //   370: ifnonnull -> 378
/*     */     //   373: pop
/*     */     //   374: aconst_null
/*     */     //   375: goto -> 570
/*     */     //   378: astore #11
/*     */     //   380: iconst_0
/*     */     //   381: istore #12
/*     */     //   383: aload #11
/*     */     //   385: invokevirtual getActionName : ()Ljava/lang/String;
/*     */     //   388: dup
/*     */     //   389: ifnonnull -> 396
/*     */     //   392: pop
/*     */     //   393: ldc_w 'Retry'
/*     */     //   396: aload #4
/*     */     //   398: ldc_w 100269340
/*     */     //   401: invokeinterface startReplaceGroup : (I)V
/*     */     //   406: aload #4
/*     */     //   408: astore #13
/*     */     //   410: aload #4
/*     */     //   412: aload #7
/*     */     //   414: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   419: aload #4
/*     */     //   421: aload #11
/*     */     //   423: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   428: ior
/*     */     //   429: iload #6
/*     */     //   431: sipush #7168
/*     */     //   434: iand
/*     */     //   435: sipush #2048
/*     */     //   438: if_icmpne -> 445
/*     */     //   441: iconst_1
/*     */     //   442: goto -> 446
/*     */     //   445: iconst_0
/*     */     //   446: ior
/*     */     //   447: istore #14
/*     */     //   449: nop
/*     */     //   450: iconst_0
/*     */     //   451: istore #15
/*     */     //   453: aload #13
/*     */     //   455: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   460: astore #16
/*     */     //   462: iconst_0
/*     */     //   463: istore #17
/*     */     //   465: iload #14
/*     */     //   467: ifne -> 481
/*     */     //   470: aload #16
/*     */     //   472: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   475: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   478: if_acmpne -> 515
/*     */     //   481: astore #18
/*     */     //   483: iconst_0
/*     */     //   484: istore #21
/*     */     //   486: aload #7
/*     */     //   488: aload #11
/*     */     //   490: aload_3
/*     */     //   491: <illegal opcode> invoke : (Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;
/*     */     //   496: aload #18
/*     */     //   498: swap
/*     */     //   499: astore #22
/*     */     //   501: aload #13
/*     */     //   503: aload #22
/*     */     //   505: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   510: aload #22
/*     */     //   512: goto -> 517
/*     */     //   515: aload #16
/*     */     //   517: nop
/*     */     //   518: nop
/*     */     //   519: nop
/*     */     //   520: checkcast kotlin/jvm/functions/Function0
/*     */     //   523: astore #23
/*     */     //   525: aload #4
/*     */     //   527: invokeinterface endReplaceGroup : ()V
/*     */     //   532: aload #23
/*     */     //   534: astore #26
/*     */     //   536: astore #27
/*     */     //   538: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action
/*     */     //   541: dup
/*     */     //   542: aload #27
/*     */     //   544: aload #26
/*     */     //   546: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*     */     //   549: astore #24
/*     */     //   551: aconst_null
/*     */     //   552: aload #11
/*     */     //   554: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   557: aload #24
/*     */     //   559: aload #4
/*     */     //   561: iconst_0
/*     */     //   562: iconst_1
/*     */     //   563: invokestatic JunieErrorBanner : (Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;Landroidx/compose/runtime/Composer;II)V
/*     */     //   566: nop
/*     */     //   567: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   570: astore #9
/*     */     //   572: aload #4
/*     */     //   574: invokeinterface endReplaceGroup : ()V
/*     */     //   579: aload #4
/*     */     //   581: ldc_w -1264879535
/*     */     //   584: invokeinterface startReplaceGroup : (I)V
/*     */     //   589: aload_1
/*     */     //   590: ifnull -> 606
/*     */     //   593: aload_1
/*     */     //   594: aload #4
/*     */     //   596: bipush #14
/*     */     //   598: iload #6
/*     */     //   600: iconst_3
/*     */     //   601: ishr
/*     */     //   602: iand
/*     */     //   603: invokestatic QuotaWarning : (Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;Landroidx/compose/runtime/Composer;I)V
/*     */     //   606: aload #4
/*     */     //   608: invokeinterface endReplaceGroup : ()V
/*     */     //   613: aload_2
/*     */     //   614: astore #8
/*     */     //   616: aload #8
/*     */     //   618: instanceof com/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl
/*     */     //   621: ifeq -> 655
/*     */     //   624: aload #4
/*     */     //   626: ldc_w -1264875636
/*     */     //   629: invokeinterface startReplaceGroup : (I)V
/*     */     //   634: aload #4
/*     */     //   636: invokeinterface endReplaceGroup : ()V
/*     */     //   641: new java/lang/IllegalStateException
/*     */     //   644: dup
/*     */     //   645: ldc_w 'Login Screen should not support 2 columns layout'
/*     */     //   648: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   651: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   654: athrow
/*     */     //   655: aload #8
/*     */     //   657: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl
/*     */     //   660: ifeq -> 699
/*     */     //   663: aload #4
/*     */     //   665: ldc_w -1264872509
/*     */     //   668: invokeinterface startReplaceGroup : (I)V
/*     */     //   673: aload_2
/*     */     //   674: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl
/*     */     //   677: aload_0
/*     */     //   678: invokeinterface isEmpty : ()Z
/*     */     //   683: aload #4
/*     */     //   685: iconst_0
/*     */     //   686: invokestatic NewTaskPageLeftColumn : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;ZLandroidx/compose/runtime/Composer;I)V
/*     */     //   689: aload #4
/*     */     //   691: invokeinterface endReplaceGroup : ()V
/*     */     //   696: goto -> 754
/*     */     //   699: aload #8
/*     */     //   701: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel
/*     */     //   704: ifeq -> 737
/*     */     //   707: aload #4
/*     */     //   709: ldc_w -1264867589
/*     */     //   712: invokeinterface startReplaceGroup : (I)V
/*     */     //   717: aload_2
/*     */     //   718: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel
/*     */     //   721: aload #4
/*     */     //   723: iconst_0
/*     */     //   724: invokestatic TaskChainLeftColumn : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;Landroidx/compose/runtime/Composer;I)V
/*     */     //   727: aload #4
/*     */     //   729: invokeinterface endReplaceGroup : ()V
/*     */     //   734: goto -> 754
/*     */     //   737: aload #4
/*     */     //   739: ldc_w -556146193
/*     */     //   742: invokeinterface startReplaceGroup : (I)V
/*     */     //   747: aload #4
/*     */     //   749: invokeinterface endReplaceGroup : ()V
/*     */     //   754: invokestatic isTraceInProgress : ()Z
/*     */     //   757: ifeq -> 773
/*     */     //   760: invokestatic traceEventEnd : ()V
/*     */     //   763: goto -> 773
/*     */     //   766: aload #4
/*     */     //   768: invokeinterface skipToGroupEnd : ()V
/*     */     //   773: aload #4
/*     */     //   775: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   780: dup
/*     */     //   781: ifnull -> 803
/*     */     //   784: aload_0
/*     */     //   785: aload_1
/*     */     //   786: aload_2
/*     */     //   787: aload_3
/*     */     //   788: iload #5
/*     */     //   790: <illegal opcode> invoke : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;Lkotlin/jvm/functions/Function0;I)Lkotlin/jvm/functions/Function2;
/*     */     //   795: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   800: goto -> 804
/*     */     //   803: pop
/*     */     //   804: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #112	-> 18
/*     */     //   #113	-> 205
/*     */     //   #408	-> 217
/*     */     //   #409	-> 220
/*     */     //   #411	-> 222
/*     */     //   #412	-> 232
/*     */     //   #413	-> 245
/*     */     //   #414	-> 257
/*     */     //   #415	-> 268
/*     */     //   #416	-> 271
/*     */     //   #417	-> 271
/*     */     //   #418	-> 274
/*     */     //   #417	-> 277
/*     */     //   #416	-> 285
/*     */     //   #415	-> 296
/*     */     //   #419	-> 298
/*     */     //   #420	-> 307
/*     */     //   #421	-> 312
/*     */     //   #414	-> 314
/*     */     //   #413	-> 315
/*     */     //   #413	-> 316
/*     */     //   #412	-> 317
/*     */     //   #422	-> 331
/*     */     //   #408	-> 340
/*     */     //   #422	-> 345
/*     */     //   #113	-> 346
/*     */     //   #114	-> 348
/*     */     //   #115	-> 383
/*     */     //   #116	-> 383
/*     */     //   #117	-> 449
/*     */     //   #423	-> 453
/*     */     //   #424	-> 465
/*     */     //   #425	-> 481
/*     */     //   #117	-> 486
/*     */     //   #425	-> 499
/*     */     //   #426	-> 501
/*     */     //   #427	-> 510
/*     */     //   #428	-> 515
/*     */     //   #424	-> 517
/*     */     //   #423	-> 518
/*     */     //   #423	-> 519
/*     */     //   #117	-> 520
/*     */     //   #115	-> 534
/*     */     //   #125	-> 552
/*     */     //   #126	-> 557
/*     */     //   #124	-> 563
/*     */     //   #128	-> 566
/*     */     //   #114	-> 567
/*     */     //   #114	-> 570
/*     */     //   #129	-> 589
/*     */     //   #130	-> 593
/*     */     //   #132	-> 613
/*     */     //   #133	-> 616
/*     */     //   #135	-> 655
/*     */     //   #136	-> 663
/*     */     //   #137	-> 673
/*     */     //   #138	-> 677
/*     */     //   #136	-> 686
/*     */     //   #141	-> 699
/*     */     //   #142	-> 707
/*     */     //   #144	-> 737
/*     */     //   #145	-> 766
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   274	3	18	$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1	I
/*     */     //   271	25	17	$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv	I
/*     */     //   298	11	18	value$iv$iv	Ljava/lang/Object;
/*     */     //   257	58	16	$i$a$-let-ComposerKt$cache$1$iv$iv	I
/*     */     //   254	61	15	it$iv$iv	Ljava/lang/Object;
/*     */     //   245	72	14	$i$f$cache	I
/*     */     //   242	75	12	$this$cache$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   242	75	13	invalid$iv$iv	Z
/*     */     //   209	137	10	$i$f$rememberCoroutineScope	I
/*     */     //   224	122	11	composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   331	15	20	wrapper$iv	Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
/*     */     //   206	140	9	$changed$iv	I
/*     */     //   486	10	21	$i$a$-cache-TwoColumnsJunieKt$LeftColumnView$1$action$1	I
/*     */     //   501	11	22	value$iv	Ljava/lang/Object;
/*     */     //   465	53	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   462	56	16	it$iv	Ljava/lang/Object;
/*     */     //   453	67	15	$i$f$cache	I
/*     */     //   450	70	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   450	70	14	invalid$iv	Z
/*     */     //   383	184	12	$i$a$-let-TwoColumnsJunieKt$LeftColumnView$1	I
/*     */     //   551	16	24	action	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*     */     //   380	187	11	it	Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem;
/*     */     //   348	415	7	scope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   34	771	6	$dirty	I
/*     */     //   0	805	0	junieProblems	Ljava/util/List;
/*     */     //   0	805	1	quotaWarning	Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;
/*     */     //   0	805	2	currentPage	Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;
/*     */     //   0	805	3	onJunieProblemRefresh	Lkotlin/jvm/functions/Function0;
/*     */     //   0	805	4	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	805	5	$changed	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Unit LeftColumnView$lambda$10$lambda$9$lambda$8(CoroutineScope $scope, JuniePreconditionChecker.JunieProblem $it, Function0<Unit> $onJunieProblemRefresh) {
/* 118 */     BuildersKt.launch$default($scope, null, null, new TwoColumnsJunieKt$LeftColumnView$1$action$1$1$1($it, $onJunieProblemRefresh, null), 3, null);
/*     */ 
/*     */ 
/*     */     
/* 122 */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TwoColumnsJunie.kt", l = {119}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.TwoColumnsJunieKt$LeftColumnView$1$action$1$1$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class TwoColumnsJunieKt$LeftColumnView$1$action$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     TwoColumnsJunieKt$LeftColumnView$1$action$1$1$1(JuniePreconditionChecker.JunieProblem $it, Function0<Unit> $onJunieProblemRefresh, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore_2
/*     */       //   4: aload_0
/*     */       //   5: getfield label : I
/*     */       //   8: tableswitch default -> 92, 0 -> 32, 1 -> 65
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield $it : Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem;
/*     */       //   40: invokevirtual getAction : ()Lkotlin/jvm/functions/Function1;
/*     */       //   43: dup
/*     */       //   44: ifnull -> 77
/*     */       //   47: aload_0
/*     */       //   48: aload_0
/*     */       //   49: iconst_1
/*     */       //   50: putfield label : I
/*     */       //   53: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   58: dup
/*     */       //   59: aload_2
/*     */       //   60: if_acmpne -> 70
/*     */       //   63: aload_2
/*     */       //   64: areturn
/*     */       //   65: aload_1
/*     */       //   66: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   69: aload_1
/*     */       //   70: checkcast java/lang/Boolean
/*     */       //   73: pop
/*     */       //   74: goto -> 78
/*     */       //   77: pop
/*     */       //   78: aload_0
/*     */       //   79: getfield $onJunieProblemRefresh : Lkotlin/jvm/functions/Function0;
/*     */       //   82: invokeinterface invoke : ()Ljava/lang/Object;
/*     */       //   87: pop
/*     */       //   88: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   91: areturn
/*     */       //   92: new java/lang/IllegalStateException
/*     */       //   95: dup
/*     */       //   96: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   98: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   101: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #118	-> 3
/*     */       //   #119	-> 36
/*     */       //   #118	-> 63
/*     */       //   #119	-> 70
/*     */       //   #120	-> 78
/*     */       //   #121	-> 88
/*     */       //   #118	-> 92
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	102	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/TwoColumnsJunieKt$LeftColumnView$1$action$1$1$1;
/*     */       //   36	56	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super TwoColumnsJunieKt$LeftColumnView$1$action$1$1$1> $completion) {
/*     */       return (Continuation<Unit>)new TwoColumnsJunieKt$LeftColumnView$1$action$1$1$1(this.$it, this.$onJunieProblemRefresh, $completion);
/*     */     }
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((TwoColumnsJunieKt$LeftColumnView$1$action$1$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     } }
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void RightColumnView(@NotNull ViewModel model, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'model'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: ldc_w -1766244352
/*     */     //   11: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   16: astore_1
/*     */     //   17: iload_2
/*     */     //   18: istore_3
/*     */     //   19: iload_2
/*     */     //   20: bipush #6
/*     */     //   22: iand
/*     */     //   23: ifne -> 44
/*     */     //   26: iload_3
/*     */     //   27: aload_1
/*     */     //   28: aload_0
/*     */     //   29: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   34: ifeq -> 41
/*     */     //   37: iconst_4
/*     */     //   38: goto -> 42
/*     */     //   41: iconst_2
/*     */     //   42: ior
/*     */     //   43: istore_3
/*     */     //   44: iload_3
/*     */     //   45: iconst_3
/*     */     //   46: iand
/*     */     //   47: iconst_2
/*     */     //   48: if_icmpne -> 60
/*     */     //   51: aload_1
/*     */     //   52: invokeinterface getSkipping : ()Z
/*     */     //   57: ifne -> 348
/*     */     //   60: invokestatic isTraceInProgress : ()Z
/*     */     //   63: ifeq -> 77
/*     */     //   66: ldc_w -1766244352
/*     */     //   69: iload_3
/*     */     //   70: iconst_m1
/*     */     //   71: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.RightColumnView (TwoColumnsJunie.kt:147)'
/*     */     //   74: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   77: aload_0
/*     */     //   78: astore #4
/*     */     //   80: aload #4
/*     */     //   82: instanceof com/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl
/*     */     //   85: ifeq -> 117
/*     */     //   88: aload_1
/*     */     //   89: ldc_w -1735815841
/*     */     //   92: invokeinterface startReplaceGroup : (I)V
/*     */     //   97: aload_1
/*     */     //   98: invokeinterface endReplaceGroup : ()V
/*     */     //   103: new java/lang/IllegalStateException
/*     */     //   106: dup
/*     */     //   107: ldc_w 'Login Screen should not support 2 columns layout'
/*     */     //   110: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   113: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   116: athrow
/*     */     //   117: aload #4
/*     */     //   119: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl
/*     */     //   122: ifeq -> 284
/*     */     //   125: aload_1
/*     */     //   126: ldc_w 2024376593
/*     */     //   129: invokeinterface startReplaceGroup : (I)V
/*     */     //   134: aload_0
/*     */     //   135: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl
/*     */     //   138: invokevirtual getTips : ()Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   141: checkcast kotlinx/coroutines/flow/StateFlow
/*     */     //   144: aconst_null
/*     */     //   145: aload_1
/*     */     //   146: iconst_0
/*     */     //   147: iconst_1
/*     */     //   148: invokestatic collectAsState : (Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*     */     //   151: astore #5
/*     */     //   153: aload_0
/*     */     //   154: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl
/*     */     //   157: aload #5
/*     */     //   159: invokestatic RightColumnView$lambda$12 : (Landroidx/compose/runtime/State;)Ljava/util/List;
/*     */     //   162: aload_1
/*     */     //   163: ldc_w -1735808552
/*     */     //   166: invokeinterface startReplaceGroup : (I)V
/*     */     //   171: aload_1
/*     */     //   172: astore #7
/*     */     //   174: aload_1
/*     */     //   175: aload_0
/*     */     //   176: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   181: istore #8
/*     */     //   183: nop
/*     */     //   184: iconst_0
/*     */     //   185: istore #9
/*     */     //   187: aload #7
/*     */     //   189: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   194: astore #10
/*     */     //   196: iconst_0
/*     */     //   197: istore #11
/*     */     //   199: iload #8
/*     */     //   201: ifne -> 215
/*     */     //   204: aload #10
/*     */     //   206: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   209: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   212: if_acmpne -> 252
/*     */     //   215: astore #15
/*     */     //   217: astore #14
/*     */     //   219: iconst_0
/*     */     //   220: istore #12
/*     */     //   222: aload_0
/*     */     //   223: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;)Lkotlin/jvm/functions/Function1;
/*     */     //   228: astore #16
/*     */     //   230: aload #14
/*     */     //   232: aload #15
/*     */     //   234: aload #16
/*     */     //   236: astore #13
/*     */     //   238: aload #7
/*     */     //   240: aload #13
/*     */     //   242: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   247: aload #13
/*     */     //   249: goto -> 254
/*     */     //   252: aload #10
/*     */     //   254: nop
/*     */     //   255: nop
/*     */     //   256: nop
/*     */     //   257: checkcast kotlin/jvm/functions/Function1
/*     */     //   260: astore #6
/*     */     //   262: aload_1
/*     */     //   263: invokeinterface endReplaceGroup : ()V
/*     */     //   268: aload #6
/*     */     //   270: aload_1
/*     */     //   271: iconst_0
/*     */     //   272: invokestatic NewTaskRightColumn : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
/*     */     //   275: aload_1
/*     */     //   276: invokeinterface endReplaceGroup : ()V
/*     */     //   281: goto -> 336
/*     */     //   284: aload #4
/*     */     //   286: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel
/*     */     //   289: ifeq -> 321
/*     */     //   292: aload_1
/*     */     //   293: ldc_w -1735805303
/*     */     //   296: invokeinterface startReplaceGroup : (I)V
/*     */     //   301: aconst_null
/*     */     //   302: aload_0
/*     */     //   303: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel
/*     */     //   306: aload_1
/*     */     //   307: iconst_0
/*     */     //   308: iconst_1
/*     */     //   309: invokestatic TaskChainRightColumn : (Landroidx/compose/ui/Modifier;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;Landroidx/compose/runtime/Composer;II)V
/*     */     //   312: aload_1
/*     */     //   313: invokeinterface endReplaceGroup : ()V
/*     */     //   318: goto -> 336
/*     */     //   321: aload_1
/*     */     //   322: ldc_w 2024648060
/*     */     //   325: invokeinterface startReplaceGroup : (I)V
/*     */     //   330: aload_1
/*     */     //   331: invokeinterface endReplaceGroup : ()V
/*     */     //   336: invokestatic isTraceInProgress : ()Z
/*     */     //   339: ifeq -> 354
/*     */     //   342: invokestatic traceEventEnd : ()V
/*     */     //   345: goto -> 354
/*     */     //   348: aload_1
/*     */     //   349: invokeinterface skipToGroupEnd : ()V
/*     */     //   354: aload_1
/*     */     //   355: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   360: dup
/*     */     //   361: ifnull -> 379
/*     */     //   364: aload_0
/*     */     //   365: iload_2
/*     */     //   366: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;I)Lkotlin/jvm/functions/Function2;
/*     */     //   371: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   376: goto -> 380
/*     */     //   379: pop
/*     */     //   380: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #148	-> 7
/*     */     //   #149	-> 77
/*     */     //   #150	-> 80
/*     */     //   #151	-> 117
/*     */     //   #152	-> 134
/*     */     //   #154	-> 153
/*     */     //   #155	-> 157
/*     */     //   #156	-> 183
/*     */     //   #429	-> 187
/*     */     //   #430	-> 199
/*     */     //   #431	-> 215
/*     */     //   #156	-> 222
/*     */     //   #431	-> 236
/*     */     //   #432	-> 238
/*     */     //   #433	-> 247
/*     */     //   #434	-> 252
/*     */     //   #430	-> 254
/*     */     //   #429	-> 255
/*     */     //   #429	-> 256
/*     */     //   #156	-> 257
/*     */     //   #153	-> 272
/*     */     //   #151	-> 275
/*     */     //   #160	-> 284
/*     */     //   #161	-> 321
/*     */     //   #162	-> 348
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   222	6	12	$i$a$-cache-TwoColumnsJunieKt$RightColumnView$1	I
/*     */     //   238	11	13	value$iv	Ljava/lang/Object;
/*     */     //   199	56	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   196	59	10	it$iv	Ljava/lang/Object;
/*     */     //   187	70	9	$i$f$cache	I
/*     */     //   184	73	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   184	73	8	invalid$iv	Z
/*     */     //   153	122	5	tips$delegate	Landroidx/compose/runtime/State;
/*     */     //   19	362	3	$dirty	I
/*     */     //   0	381	0	model	Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;
/*     */     //   0	381	1	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	381	2	$changed	I
/*     */   }
/*     */   private static final Unit RightColumnView$lambda$14$lambda$13(ViewModel $model, String it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     TextFieldStateKt.setTextAndPlaceCursorAtEnd(((NewTaskViewModelImpl)$model).getTextState(), it);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/* 152 */   private static final List<Tip> RightColumnView$lambda$12(State $tips$delegate) { State state = $tips$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 435 */       (List<Tip>)state.getValue(); }
/*     */   @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void TwoColumnFooter(@NotNull ViewModel model, boolean sendPromptEnabled, @Nullable Composer $composer, int $changed) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'model'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_2
/*     */     //   8: ldc_w 214134206
/*     */     //   11: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   16: astore_2
/*     */     //   17: iload_3
/*     */     //   18: istore #4
/*     */     //   20: iload_3
/*     */     //   21: bipush #6
/*     */     //   23: iand
/*     */     //   24: ifne -> 47
/*     */     //   27: iload #4
/*     */     //   29: aload_2
/*     */     //   30: aload_0
/*     */     //   31: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   36: ifeq -> 43
/*     */     //   39: iconst_4
/*     */     //   40: goto -> 44
/*     */     //   43: iconst_2
/*     */     //   44: ior
/*     */     //   45: istore #4
/*     */     //   47: iload_3
/*     */     //   48: bipush #48
/*     */     //   50: iand
/*     */     //   51: ifne -> 76
/*     */     //   54: iload #4
/*     */     //   56: aload_2
/*     */     //   57: iload_1
/*     */     //   58: invokeinterface changed : (Z)Z
/*     */     //   63: ifeq -> 71
/*     */     //   66: bipush #32
/*     */     //   68: goto -> 73
/*     */     //   71: bipush #16
/*     */     //   73: ior
/*     */     //   74: istore #4
/*     */     //   76: iload #4
/*     */     //   78: bipush #19
/*     */     //   80: iand
/*     */     //   81: bipush #18
/*     */     //   83: if_icmpne -> 95
/*     */     //   86: aload_2
/*     */     //   87: invokeinterface getSkipping : ()Z
/*     */     //   92: ifne -> 222
/*     */     //   95: invokestatic isTraceInProgress : ()Z
/*     */     //   98: ifeq -> 113
/*     */     //   101: ldc_w 214134206
/*     */     //   104: iload #4
/*     */     //   106: iconst_m1
/*     */     //   107: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.TwoColumnFooter (TwoColumnsJunie.kt:165)'
/*     */     //   110: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   113: aload_0
/*     */     //   114: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel
/*     */     //   117: ifeq -> 210
/*     */     //   120: aload_0
/*     */     //   121: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel
/*     */     //   124: invokevirtual getTaskHeader : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderViewModel;
/*     */     //   127: invokevirtual getUiState : ()Lkotlinx/coroutines/flow/StateFlow;
/*     */     //   130: aconst_null
/*     */     //   131: aload_2
/*     */     //   132: iconst_0
/*     */     //   133: iconst_1
/*     */     //   134: invokestatic collectAsState : (Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*     */     //   137: astore #5
/*     */     //   139: aload_0
/*     */     //   140: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel
/*     */     //   143: invokevirtual getFollowupModel : ()Lkotlinx/coroutines/flow/StateFlow;
/*     */     //   146: aconst_null
/*     */     //   147: aload_2
/*     */     //   148: iconst_0
/*     */     //   149: iconst_1
/*     */     //   150: invokestatic collectAsState : (Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*     */     //   153: astore #6
/*     */     //   155: aload #6
/*     */     //   157: invokestatic TwoColumnFooter$lambda$17 : (Landroidx/compose/runtime/State;)Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/followup/FollowupViewModel;
/*     */     //   160: astore #7
/*     */     //   162: aload #5
/*     */     //   164: invokestatic TwoColumnFooter$lambda$16 : (Landroidx/compose/runtime/State;)Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState;
/*     */     //   167: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$Terminal
/*     */     //   170: ifeq -> 210
/*     */     //   173: aload #7
/*     */     //   175: ifnull -> 210
/*     */     //   178: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   181: checkcast androidx/compose/ui/Modifier
/*     */     //   184: aload #7
/*     */     //   186: iload_1
/*     */     //   187: aload_0
/*     */     //   188: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel
/*     */     //   191: invokevirtual getPromptMode : ()Landroidx/compose/runtime/MutableState;
/*     */     //   194: aload_2
/*     */     //   195: bipush #6
/*     */     //   197: sipush #896
/*     */     //   200: iload #4
/*     */     //   202: iconst_3
/*     */     //   203: ishl
/*     */     //   204: iand
/*     */     //   205: ior
/*     */     //   206: iconst_0
/*     */     //   207: invokestatic FollowUp : (Landroidx/compose/ui/Modifier;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/followup/FollowupViewModel;ZLandroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;II)V
/*     */     //   210: invokestatic isTraceInProgress : ()Z
/*     */     //   213: ifeq -> 228
/*     */     //   216: invokestatic traceEventEnd : ()V
/*     */     //   219: goto -> 228
/*     */     //   222: aload_2
/*     */     //   223: invokeinterface skipToGroupEnd : ()V
/*     */     //   228: aload_2
/*     */     //   229: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   234: dup
/*     */     //   235: ifnull -> 254
/*     */     //   238: aload_0
/*     */     //   239: iload_1
/*     */     //   240: iload_3
/*     */     //   241: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;ZI)Lkotlin/jvm/functions/Function2;
/*     */     //   246: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   251: goto -> 255
/*     */     //   254: pop
/*     */     //   255: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #166	-> 7
/*     */     //   #167	-> 113
/*     */     //   #169	-> 114
/*     */     //   #170	-> 120
/*     */     //   #171	-> 139
/*     */     //   #172	-> 155
/*     */     //   #174	-> 162
/*     */     //   #176	-> 178
/*     */     //   #177	-> 184
/*     */     //   #178	-> 186
/*     */     //   #179	-> 187
/*     */     //   #175	-> 207
/*     */     //   #186	-> 222
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   139	71	5	state$delegate	Landroidx/compose/runtime/State;
/*     */     //   155	55	6	followUpModel$delegate	Landroidx/compose/runtime/State;
/*     */     //   162	48	7	followUp	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/followup/FollowupViewModel;
/*     */     //   20	236	4	$dirty	I
/*     */     //   0	256	0	model	Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;
/*     */     //   0	256	1	sendPromptEnabled	Z
/*     */     //   0	256	2	$composer	Landroidx/compose/runtime/Composer;
/* 436 */     //   0	256	3	$changed	I } private static final TaskHeaderState TwoColumnFooter$lambda$16(State $state$delegate) { State state = $state$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (TaskHeaderState)state.getValue(); } private static final FollowupViewModel TwoColumnFooter$lambda$17(State $followUpModel$delegate) { State state = $followUpModel$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 437 */     return (FollowupViewModel)state.getValue(); }
/*     */ 
/*     */   
/*     */   private static final Unit TwoColumnView$lambda$7(List<JuniePreconditionChecker.JunieProblem> $junieProblems, GrazieQuotaWarning $quotaWarning, ViewModel $currentPage, Function0<Unit> $onJunieProblemRefresh, Transition<Boolean> $transition, int $$changed, Composer $composer, int $force) {
/*     */     TwoColumnView($junieProblems, $quotaWarning, $currentPage, $onJunieProblemRefresh, $transition, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit LeftColumnView$lambda$11(List<JuniePreconditionChecker.JunieProblem> $junieProblems, GrazieQuotaWarning $quotaWarning, ViewModel $currentPage, Function0<Unit> $onJunieProblemRefresh, int $$changed, Composer $composer, int $force) {
/*     */     LeftColumnView($junieProblems, $quotaWarning, $currentPage, $onJunieProblemRefresh, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit RightColumnView$lambda$15(ViewModel $model, int $$changed, Composer $composer, int $force) {
/*     */     RightColumnView($model, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit TwoColumnFooter$lambda$18(ViewModel $model, boolean $sendPromptEnabled, int $$changed, Composer $composer, int $force) {
/*     */     TwoColumnFooter($model, $sendPromptEnabled, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\toolwindow\TwoColumnsJunieKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */