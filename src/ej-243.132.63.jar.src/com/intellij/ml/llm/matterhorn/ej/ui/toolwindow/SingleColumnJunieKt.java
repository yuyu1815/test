/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.toolwindow;
/*    */ 
/*    */ import androidx.compose.animation.core.AnimationSpecKt;
/*    */ import androidx.compose.animation.core.EasingKt;
/*    */ import androidx.compose.animation.core.FiniteAnimationSpec;
/*    */ import androidx.compose.animation.core.Transition;
/*    */ import androidx.compose.animation.core.TweenSpec;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.JuniePreconditionChecker;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.activation.GrazieQuotaWarning;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.vm.ViewModel;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\0002\n\000\n\002\020\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\013\n\002\b\003\032_\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\0032\b\020\005\032\004\030\0010\0062\006\020\007\032\0020\b2\f\020\t\032\b\022\004\022\0020\0010\n2\f\020\013\032\b\022\004\022\0020\0010\n2\f\020\f\032\b\022\004\022\0020\0160\r2\006\020\017\032\0020\016H\007¢\006\002\020\020¨\006\021"}, d2 = {"SingleColumnView", "", "junieProblems", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem;", "quotaWarning", "Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;", "currentPage", "Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;", "onLoginSuccess", "Lkotlin/Function0;", "onJunieProblemRefresh", "transition", "Landroidx/compose/animation/core/Transition;", "", "disableFadeOut", "(Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/Transition;ZLandroidx/compose/runtime/Composer;I)V", "ej-ui"})
/*    */ @SourceDebugExtension({"SMAP\nSingleColumnJunie.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleColumnJunie.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/SingleColumnJunieKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,107:1\n481#2:108\n480#2,4:109\n484#2,2:116\n488#2:122\n1225#3,3:113\n1228#3,3:119\n1225#3,6:176\n480#4:118\n2001#5:123\n1885#5,3:124\n1888#5,4:128\n1970#5:132\n1885#5,7:133\n149#6:127\n86#7:140\n83#7,6:141\n89#7:175\n93#7:185\n79#8,6:147\n86#8,4:162\n90#8,2:172\n94#8:184\n368#9,9:153\n377#9:174\n378#9,2:182\n4034#10,6:166\n*S KotlinDebug\n*F\n+ 1 SingleColumnJunie.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/SingleColumnJunieKt\n*L\n41#1:108\n41#1:109,4\n41#1:116,2\n41#1:122\n41#1:113,3\n41#1:119,3\n65#1:176,6\n41#1:118\n42#1:123\n42#1:124,3\n42#1:128,4\n47#1:132\n47#1:133,7\n45#1:127\n59#1:140\n59#1:141,6\n59#1:175\n59#1:185\n59#1:147,6\n59#1:162,4\n59#1:172,2\n59#1:184\n59#1:153,9\n59#1:174\n59#1:182,2\n59#1:166,6\n*E\n"})
/*    */ public final class SingleColumnJunieKt {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public static final void SingleColumnView(@NotNull List junieProblems, @Nullable GrazieQuotaWarning quotaWarning, @NotNull ViewModel currentPage, @NotNull Function0 onLoginSuccess, @NotNull Function0 onJunieProblemRefresh, @NotNull Transition transition, boolean disableFadeOut, @Nullable Composer $composer, int $changed) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'junieProblems'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 'currentPage'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_3
/*    */     //   13: ldc 'onLoginSuccess'
/*    */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   18: aload #4
/*    */     //   20: ldc 'onJunieProblemRefresh'
/*    */     //   22: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   25: aload #5
/*    */     //   27: ldc 'transition'
/*    */     //   29: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   32: aload #7
/*    */     //   34: ldc -825508672
/*    */     //   36: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   41: astore #7
/*    */     //   43: iload #8
/*    */     //   45: istore #9
/*    */     //   47: iload #8
/*    */     //   49: bipush #6
/*    */     //   51: iand
/*    */     //   52: ifne -> 76
/*    */     //   55: iload #9
/*    */     //   57: aload #7
/*    */     //   59: aload_0
/*    */     //   60: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   65: ifeq -> 72
/*    */     //   68: iconst_4
/*    */     //   69: goto -> 73
/*    */     //   72: iconst_2
/*    */     //   73: ior
/*    */     //   74: istore #9
/*    */     //   76: iload #8
/*    */     //   78: bipush #48
/*    */     //   80: iand
/*    */     //   81: ifne -> 107
/*    */     //   84: iload #9
/*    */     //   86: aload #7
/*    */     //   88: aload_1
/*    */     //   89: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   94: ifeq -> 102
/*    */     //   97: bipush #32
/*    */     //   99: goto -> 104
/*    */     //   102: bipush #16
/*    */     //   104: ior
/*    */     //   105: istore #9
/*    */     //   107: iload #8
/*    */     //   109: sipush #384
/*    */     //   112: iand
/*    */     //   113: ifne -> 141
/*    */     //   116: iload #9
/*    */     //   118: aload #7
/*    */     //   120: aload_2
/*    */     //   121: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   126: ifeq -> 135
/*    */     //   129: sipush #256
/*    */     //   132: goto -> 138
/*    */     //   135: sipush #128
/*    */     //   138: ior
/*    */     //   139: istore #9
/*    */     //   141: iload #8
/*    */     //   143: sipush #3072
/*    */     //   146: iand
/*    */     //   147: ifne -> 175
/*    */     //   150: iload #9
/*    */     //   152: aload #7
/*    */     //   154: aload_3
/*    */     //   155: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   160: ifeq -> 169
/*    */     //   163: sipush #2048
/*    */     //   166: goto -> 172
/*    */     //   169: sipush #1024
/*    */     //   172: ior
/*    */     //   173: istore #9
/*    */     //   175: iload #8
/*    */     //   177: sipush #24576
/*    */     //   180: iand
/*    */     //   181: ifne -> 210
/*    */     //   184: iload #9
/*    */     //   186: aload #7
/*    */     //   188: aload #4
/*    */     //   190: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   195: ifeq -> 204
/*    */     //   198: sipush #16384
/*    */     //   201: goto -> 207
/*    */     //   204: sipush #8192
/*    */     //   207: ior
/*    */     //   208: istore #9
/*    */     //   210: iload #8
/*    */     //   212: ldc 196608
/*    */     //   214: iand
/*    */     //   215: ifne -> 242
/*    */     //   218: iload #9
/*    */     //   220: aload #7
/*    */     //   222: aload #5
/*    */     //   224: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   229: ifeq -> 237
/*    */     //   232: ldc 131072
/*    */     //   234: goto -> 239
/*    */     //   237: ldc 65536
/*    */     //   239: ior
/*    */     //   240: istore #9
/*    */     //   242: iload #8
/*    */     //   244: ldc 1572864
/*    */     //   246: iand
/*    */     //   247: ifne -> 274
/*    */     //   250: iload #9
/*    */     //   252: aload #7
/*    */     //   254: iload #6
/*    */     //   256: invokeinterface changed : (Z)Z
/*    */     //   261: ifeq -> 269
/*    */     //   264: ldc 1048576
/*    */     //   266: goto -> 271
/*    */     //   269: ldc 524288
/*    */     //   271: ior
/*    */     //   272: istore #9
/*    */     //   274: iload #9
/*    */     //   276: ldc 599187
/*    */     //   278: iand
/*    */     //   279: ldc 599186
/*    */     //   281: if_icmpne -> 294
/*    */     //   284: aload #7
/*    */     //   286: invokeinterface getSkipping : ()Z
/*    */     //   291: ifne -> 2193
/*    */     //   294: invokestatic isTraceInProgress : ()Z
/*    */     //   297: ifeq -> 310
/*    */     //   300: ldc -825508672
/*    */     //   302: iload #9
/*    */     //   304: iconst_m1
/*    */     //   305: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.SingleColumnView (SingleColumnJunie.kt:39)'
/*    */     //   307: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   310: iconst_0
/*    */     //   311: istore #12
/*    */     //   313: nop
/*    */     //   314: iconst_0
/*    */     //   315: istore #13
/*    */     //   317: aload #7
/*    */     //   319: ldc 773894976
/*    */     //   321: ldc 'CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp'
/*    */     //   323: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   326: aload #7
/*    */     //   328: astore #14
/*    */     //   330: aload #7
/*    */     //   332: ldc -954370320
/*    */     //   334: ldc 'CC(remember):Effects.kt#9igjgp'
/*    */     //   336: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   339: aload #7
/*    */     //   341: astore #15
/*    */     //   343: iconst_0
/*    */     //   344: istore #16
/*    */     //   346: iconst_0
/*    */     //   347: istore #17
/*    */     //   349: aload #15
/*    */     //   351: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   356: astore #18
/*    */     //   358: iconst_0
/*    */     //   359: istore #19
/*    */     //   361: aload #18
/*    */     //   363: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   366: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   369: if_acmpne -> 416
/*    */     //   372: iconst_0
/*    */     //   373: istore #20
/*    */     //   375: iconst_0
/*    */     //   376: istore #21
/*    */     //   378: getstatic kotlin/coroutines/EmptyCoroutineContext.INSTANCE : Lkotlin/coroutines/EmptyCoroutineContext;
/*    */     //   381: checkcast kotlin/coroutines/CoroutineContext
/*    */     //   384: aload #14
/*    */     //   386: invokestatic createCompositionCoroutineScope : (Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;
/*    */     //   389: astore #53
/*    */     //   391: new androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*    */     //   394: dup
/*    */     //   395: aload #53
/*    */     //   397: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;)V
/*    */     //   400: astore #21
/*    */     //   402: aload #15
/*    */     //   404: aload #21
/*    */     //   406: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   411: aload #21
/*    */     //   413: goto -> 418
/*    */     //   416: aload #18
/*    */     //   418: nop
/*    */     //   419: nop
/*    */     //   420: nop
/*    */     //   421: checkcast androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*    */     //   424: astore #22
/*    */     //   426: aload #7
/*    */     //   428: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   431: aload #22
/*    */     //   433: astore #23
/*    */     //   435: aload #23
/*    */     //   437: invokevirtual getCoroutineScope : ()Lkotlinx/coroutines/CoroutineScope;
/*    */     //   440: astore #22
/*    */     //   442: aload #7
/*    */     //   444: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   447: aload #22
/*    */     //   449: nop
/*    */     //   450: astore #10
/*    */     //   452: aload #5
/*    */     //   454: astore #12
/*    */     //   456: getstatic com/intellij/ml/llm/matterhorn/ej/ui/toolwindow/SingleColumnJunieKt$SingleColumnView$columnOffsetIN$1.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/SingleColumnJunieKt$SingleColumnView$columnOffsetIN$1;
/*    */     //   459: checkcast kotlin/jvm/functions/Function3
/*    */     //   462: astore #13
/*    */     //   464: ldc 'columnOffset'
/*    */     //   466: astore #14
/*    */     //   468: sipush #384
/*    */     //   471: bipush #14
/*    */     //   473: iload #9
/*    */     //   475: bipush #15
/*    */     //   477: ishr
/*    */     //   478: iand
/*    */     //   479: ior
/*    */     //   480: istore #15
/*    */     //   482: nop
/*    */     //   483: iconst_0
/*    */     //   484: istore #16
/*    */     //   486: aload #7
/*    */     //   488: ldc 184732935
/*    */     //   490: ldc 'CC(animateDp)P(2)2000@82338L75:Transition.kt#pdpnli'
/*    */     //   492: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   495: aload #12
/*    */     //   497: astore #17
/*    */     //   499: getstatic androidx/compose/ui/unit/Dp.Companion : Landroidx/compose/ui/unit/Dp$Companion;
/*    */     //   502: invokestatic getVectorConverter : (Landroidx/compose/ui/unit/Dp$Companion;)Landroidx/compose/animation/core/TwoWayConverter;
/*    */     //   505: astore #18
/*    */     //   507: bipush #14
/*    */     //   509: iload #15
/*    */     //   511: iand
/*    */     //   512: sipush #896
/*    */     //   515: iload #15
/*    */     //   517: iconst_3
/*    */     //   518: ishl
/*    */     //   519: iand
/*    */     //   520: ior
/*    */     //   521: sipush #7168
/*    */     //   524: iload #15
/*    */     //   526: iconst_3
/*    */     //   527: ishl
/*    */     //   528: iand
/*    */     //   529: ior
/*    */     //   530: ldc 57344
/*    */     //   532: iload #15
/*    */     //   534: iconst_3
/*    */     //   535: ishl
/*    */     //   536: iand
/*    */     //   537: ior
/*    */     //   538: istore #19
/*    */     //   540: iconst_0
/*    */     //   541: istore #20
/*    */     //   543: aload #7
/*    */     //   545: ldc -142660079
/*    */     //   547: ldc 'CC(animateValue)P(3,2)1886@77187L32,1887@77242L31,1888@77298L23,1890@77334L89:Transition.kt#pdpnli'
/*    */     //   549: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   552: aload #17
/*    */     //   554: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*    */     //   557: aload #7
/*    */     //   559: bipush #112
/*    */     //   561: iload #19
/*    */     //   563: bipush #9
/*    */     //   565: ishr
/*    */     //   566: iand
/*    */     //   567: istore #21
/*    */     //   569: astore #22
/*    */     //   571: checkcast java/lang/Boolean
/*    */     //   574: invokevirtual booleanValue : ()Z
/*    */     //   577: istore #23
/*    */     //   579: iconst_0
/*    */     //   580: istore #24
/*    */     //   582: aload #22
/*    */     //   584: ldc -1634669441
/*    */     //   586: invokeinterface startReplaceGroup : (I)V
/*    */     //   591: invokestatic isTraceInProgress : ()Z
/*    */     //   594: ifeq -> 607
/*    */     //   597: ldc -1634669441
/*    */     //   599: iload #21
/*    */     //   601: iconst_m1
/*    */     //   602: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.SingleColumnView.<anonymous> (SingleColumnJunie.kt:44)'
/*    */     //   604: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   607: iload #23
/*    */     //   609: ifeq -> 627
/*    */     //   612: iconst_0
/*    */     //   613: istore #25
/*    */     //   615: iconst_0
/*    */     //   616: istore #26
/*    */     //   618: iload #25
/*    */     //   620: i2f
/*    */     //   621: invokestatic constructor-impl : (F)F
/*    */     //   624: goto -> 640
/*    */     //   627: bipush #-50
/*    */     //   629: istore #25
/*    */     //   631: iconst_0
/*    */     //   632: istore #26
/*    */     //   634: iload #25
/*    */     //   636: i2f
/*    */     //   637: invokestatic constructor-impl : (F)F
/*    */     //   640: fstore #27
/*    */     //   642: invokestatic isTraceInProgress : ()Z
/*    */     //   645: ifeq -> 651
/*    */     //   648: invokestatic traceEventEnd : ()V
/*    */     //   651: aload #22
/*    */     //   653: invokeinterface endReplaceGroup : ()V
/*    */     //   658: fload #27
/*    */     //   660: invokestatic box-impl : (F)Landroidx/compose/ui/unit/Dp;
/*    */     //   663: astore #23
/*    */     //   665: aload #17
/*    */     //   667: invokevirtual getTargetState : ()Ljava/lang/Object;
/*    */     //   670: aload #7
/*    */     //   672: bipush #112
/*    */     //   674: iload #19
/*    */     //   676: bipush #9
/*    */     //   678: ishr
/*    */     //   679: iand
/*    */     //   680: istore #24
/*    */     //   682: astore #21
/*    */     //   684: checkcast java/lang/Boolean
/*    */     //   687: invokevirtual booleanValue : ()Z
/*    */     //   690: istore #22
/*    */     //   692: iconst_0
/*    */     //   693: istore #25
/*    */     //   695: aload #21
/*    */     //   697: ldc -1634669441
/*    */     //   699: invokeinterface startReplaceGroup : (I)V
/*    */     //   704: invokestatic isTraceInProgress : ()Z
/*    */     //   707: ifeq -> 720
/*    */     //   710: ldc -1634669441
/*    */     //   712: iload #24
/*    */     //   714: iconst_m1
/*    */     //   715: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.SingleColumnView.<anonymous> (SingleColumnJunie.kt:44)'
/*    */     //   717: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   720: iload #22
/*    */     //   722: ifeq -> 740
/*    */     //   725: iconst_0
/*    */     //   726: istore #26
/*    */     //   728: iconst_0
/*    */     //   729: istore #27
/*    */     //   731: iload #26
/*    */     //   733: i2f
/*    */     //   734: invokestatic constructor-impl : (F)F
/*    */     //   737: goto -> 753
/*    */     //   740: bipush #-50
/*    */     //   742: istore #26
/*    */     //   744: iconst_0
/*    */     //   745: istore #27
/*    */     //   747: iload #26
/*    */     //   749: i2f
/*    */     //   750: invokestatic constructor-impl : (F)F
/*    */     //   753: fstore #28
/*    */     //   755: invokestatic isTraceInProgress : ()Z
/*    */     //   758: ifeq -> 764
/*    */     //   761: invokestatic traceEventEnd : ()V
/*    */     //   764: aload #21
/*    */     //   766: invokeinterface endReplaceGroup : ()V
/*    */     //   771: fload #28
/*    */     //   773: invokestatic box-impl : (F)Landroidx/compose/ui/unit/Dp;
/*    */     //   776: astore #22
/*    */     //   778: aload #13
/*    */     //   780: aload #17
/*    */     //   782: invokevirtual getSegment : ()Landroidx/compose/animation/core/Transition$Segment;
/*    */     //   785: aload #7
/*    */     //   787: bipush #112
/*    */     //   789: iload #19
/*    */     //   791: iconst_3
/*    */     //   792: ishr
/*    */     //   793: iand
/*    */     //   794: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   797: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   802: checkcast androidx/compose/animation/core/FiniteAnimationSpec
/*    */     //   805: astore #21
/*    */     //   807: aload #17
/*    */     //   809: aload #23
/*    */     //   811: aload #22
/*    */     //   813: aload #21
/*    */     //   815: aload #18
/*    */     //   817: aload #14
/*    */     //   819: aload #7
/*    */     //   821: bipush #14
/*    */     //   823: iload #19
/*    */     //   825: iand
/*    */     //   826: ldc 57344
/*    */     //   828: iload #19
/*    */     //   830: bipush #9
/*    */     //   832: ishl
/*    */     //   833: iand
/*    */     //   834: ior
/*    */     //   835: ldc 458752
/*    */     //   837: iload #19
/*    */     //   839: bipush #6
/*    */     //   841: ishl
/*    */     //   842: iand
/*    */     //   843: ior
/*    */     //   844: invokestatic createTransitionAnimation : (Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*    */     //   847: astore #24
/*    */     //   849: aload #7
/*    */     //   851: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   854: aload #24
/*    */     //   856: nop
/*    */     //   857: astore #29
/*    */     //   859: aload #7
/*    */     //   861: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   864: aload #29
/*    */     //   866: astore #11
/*    */     //   868: aload #5
/*    */     //   870: astore #13
/*    */     //   872: getstatic com/intellij/ml/llm/matterhorn/ej/ui/toolwindow/SingleColumnJunieKt$SingleColumnView$alpha$1.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/SingleColumnJunieKt$SingleColumnView$alpha$1;
/*    */     //   875: checkcast kotlin/jvm/functions/Function3
/*    */     //   878: astore #14
/*    */     //   880: ldc 'alpha'
/*    */     //   882: astore #15
/*    */     //   884: sipush #384
/*    */     //   887: bipush #14
/*    */     //   889: iload #9
/*    */     //   891: bipush #15
/*    */     //   893: ishr
/*    */     //   894: iand
/*    */     //   895: ior
/*    */     //   896: istore #16
/*    */     //   898: nop
/*    */     //   899: iconst_0
/*    */     //   900: istore #17
/*    */     //   902: aload #7
/*    */     //   904: ldc -1338768149
/*    */     //   906: ldc 'CC(animateFloat)P(2)1969@80624L78:Transition.kt#pdpnli'
/*    */     //   908: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   911: aload #13
/*    */     //   913: astore #18
/*    */     //   915: getstatic kotlin/jvm/internal/FloatCompanionObject.INSTANCE : Lkotlin/jvm/internal/FloatCompanionObject;
/*    */     //   918: invokestatic getVectorConverter : (Lkotlin/jvm/internal/FloatCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;
/*    */     //   921: astore #19
/*    */     //   923: bipush #14
/*    */     //   925: iload #16
/*    */     //   927: iand
/*    */     //   928: sipush #896
/*    */     //   931: iload #16
/*    */     //   933: iconst_3
/*    */     //   934: ishl
/*    */     //   935: iand
/*    */     //   936: ior
/*    */     //   937: sipush #7168
/*    */     //   940: iload #16
/*    */     //   942: iconst_3
/*    */     //   943: ishl
/*    */     //   944: iand
/*    */     //   945: ior
/*    */     //   946: ldc 57344
/*    */     //   948: iload #16
/*    */     //   950: iconst_3
/*    */     //   951: ishl
/*    */     //   952: iand
/*    */     //   953: ior
/*    */     //   954: istore #20
/*    */     //   956: iconst_0
/*    */     //   957: istore #21
/*    */     //   959: aload #7
/*    */     //   961: ldc -142660079
/*    */     //   963: ldc 'CC(animateValue)P(3,2)1886@77187L32,1887@77242L31,1888@77298L23,1890@77334L89:Transition.kt#pdpnli'
/*    */     //   965: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   968: aload #18
/*    */     //   970: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*    */     //   973: aload #7
/*    */     //   975: bipush #112
/*    */     //   977: iload #20
/*    */     //   979: bipush #9
/*    */     //   981: ishr
/*    */     //   982: iand
/*    */     //   983: istore #22
/*    */     //   985: astore #23
/*    */     //   987: checkcast java/lang/Boolean
/*    */     //   990: invokevirtual booleanValue : ()Z
/*    */     //   993: istore #24
/*    */     //   995: iconst_0
/*    */     //   996: istore #25
/*    */     //   998: aload #23
/*    */     //   1000: ldc 993344549
/*    */     //   1002: invokeinterface startReplaceGroup : (I)V
/*    */     //   1007: invokestatic isTraceInProgress : ()Z
/*    */     //   1010: ifeq -> 1023
/*    */     //   1013: ldc 993344549
/*    */     //   1015: iload #22
/*    */     //   1017: iconst_m1
/*    */     //   1018: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.SingleColumnView.<anonymous> (SingleColumnJunie.kt:49)'
/*    */     //   1020: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   1023: iload #24
/*    */     //   1025: ifeq -> 1032
/*    */     //   1028: fconst_1
/*    */     //   1029: goto -> 1033
/*    */     //   1032: fconst_0
/*    */     //   1033: fstore #26
/*    */     //   1035: invokestatic isTraceInProgress : ()Z
/*    */     //   1038: ifeq -> 1044
/*    */     //   1041: invokestatic traceEventEnd : ()V
/*    */     //   1044: aload #23
/*    */     //   1046: invokeinterface endReplaceGroup : ()V
/*    */     //   1051: fload #26
/*    */     //   1053: invokestatic valueOf : (F)Ljava/lang/Float;
/*    */     //   1056: astore #24
/*    */     //   1058: aload #18
/*    */     //   1060: invokevirtual getTargetState : ()Ljava/lang/Object;
/*    */     //   1063: aload #7
/*    */     //   1065: bipush #112
/*    */     //   1067: iload #20
/*    */     //   1069: bipush #9
/*    */     //   1071: ishr
/*    */     //   1072: iand
/*    */     //   1073: istore #25
/*    */     //   1075: astore #22
/*    */     //   1077: checkcast java/lang/Boolean
/*    */     //   1080: invokevirtual booleanValue : ()Z
/*    */     //   1083: istore #23
/*    */     //   1085: iconst_0
/*    */     //   1086: istore #26
/*    */     //   1088: aload #22
/*    */     //   1090: ldc 993344549
/*    */     //   1092: invokeinterface startReplaceGroup : (I)V
/*    */     //   1097: invokestatic isTraceInProgress : ()Z
/*    */     //   1100: ifeq -> 1113
/*    */     //   1103: ldc 993344549
/*    */     //   1105: iload #25
/*    */     //   1107: iconst_m1
/*    */     //   1108: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.SingleColumnView.<anonymous> (SingleColumnJunie.kt:49)'
/*    */     //   1110: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   1113: iload #23
/*    */     //   1115: ifeq -> 1122
/*    */     //   1118: fconst_1
/*    */     //   1119: goto -> 1123
/*    */     //   1122: fconst_0
/*    */     //   1123: fstore #27
/*    */     //   1125: invokestatic isTraceInProgress : ()Z
/*    */     //   1128: ifeq -> 1134
/*    */     //   1131: invokestatic traceEventEnd : ()V
/*    */     //   1134: aload #22
/*    */     //   1136: invokeinterface endReplaceGroup : ()V
/*    */     //   1141: fload #27
/*    */     //   1143: invokestatic valueOf : (F)Ljava/lang/Float;
/*    */     //   1146: astore #23
/*    */     //   1148: aload #14
/*    */     //   1150: aload #18
/*    */     //   1152: invokevirtual getSegment : ()Landroidx/compose/animation/core/Transition$Segment;
/*    */     //   1155: aload #7
/*    */     //   1157: bipush #112
/*    */     //   1159: iload #20
/*    */     //   1161: iconst_3
/*    */     //   1162: ishr
/*    */     //   1163: iand
/*    */     //   1164: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1167: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   1172: checkcast androidx/compose/animation/core/FiniteAnimationSpec
/*    */     //   1175: astore #22
/*    */     //   1177: aload #18
/*    */     //   1179: aload #24
/*    */     //   1181: aload #23
/*    */     //   1183: aload #22
/*    */     //   1185: aload #19
/*    */     //   1187: aload #15
/*    */     //   1189: aload #7
/*    */     //   1191: bipush #14
/*    */     //   1193: iload #20
/*    */     //   1195: iand
/*    */     //   1196: ldc 57344
/*    */     //   1198: iload #20
/*    */     //   1200: bipush #9
/*    */     //   1202: ishl
/*    */     //   1203: iand
/*    */     //   1204: ior
/*    */     //   1205: ldc 458752
/*    */     //   1207: iload #20
/*    */     //   1209: bipush #6
/*    */     //   1211: ishl
/*    */     //   1212: iand
/*    */     //   1213: ior
/*    */     //   1214: invokestatic createTransitionAnimation : (Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*    */     //   1217: astore #25
/*    */     //   1219: aload #7
/*    */     //   1221: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1224: aload #25
/*    */     //   1226: nop
/*    */     //   1227: astore #28
/*    */     //   1229: aload #7
/*    */     //   1231: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1234: aload #28
/*    */     //   1236: astore #12
/*    */     //   1238: iload #6
/*    */     //   1240: ifeq -> 1252
/*    */     //   1243: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   1246: checkcast androidx/compose/ui/Modifier
/*    */     //   1249: goto -> 1293
/*    */     //   1252: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   1255: checkcast androidx/compose/ui/Modifier
/*    */     //   1258: aload #11
/*    */     //   1260: invokeinterface getValue : ()Ljava/lang/Object;
/*    */     //   1265: checkcast androidx/compose/ui/unit/Dp
/*    */     //   1268: invokevirtual unbox-impl : ()F
/*    */     //   1271: fconst_0
/*    */     //   1272: iconst_2
/*    */     //   1273: aconst_null
/*    */     //   1274: invokestatic offset-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   1277: aload #12
/*    */     //   1279: invokeinterface getValue : ()Ljava/lang/Object;
/*    */     //   1284: checkcast java/lang/Number
/*    */     //   1287: invokevirtual floatValue : ()F
/*    */     //   1290: invokestatic alpha : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*    */     //   1293: astore #13
/*    */     //   1295: iconst_0
/*    */     //   1296: istore #16
/*    */     //   1298: nop
/*    */     //   1299: iconst_0
/*    */     //   1300: istore #17
/*    */     //   1302: aload #7
/*    */     //   1304: ldc_w -483455358
/*    */     //   1307: ldc_w 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*    */     //   1310: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   1313: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*    */     //   1316: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*    */     //   1319: astore #14
/*    */     //   1321: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   1324: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*    */     //   1327: astore #15
/*    */     //   1329: aload #14
/*    */     //   1331: aload #15
/*    */     //   1333: aload #7
/*    */     //   1335: bipush #14
/*    */     //   1337: iload #16
/*    */     //   1339: iconst_3
/*    */     //   1340: ishr
/*    */     //   1341: iand
/*    */     //   1342: bipush #112
/*    */     //   1344: iload #16
/*    */     //   1346: iconst_3
/*    */     //   1347: ishr
/*    */     //   1348: iand
/*    */     //   1349: ior
/*    */     //   1350: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   1353: astore #18
/*    */     //   1355: bipush #112
/*    */     //   1357: iload #16
/*    */     //   1359: iconst_3
/*    */     //   1360: ishl
/*    */     //   1361: iand
/*    */     //   1362: istore #19
/*    */     //   1364: nop
/*    */     //   1365: iconst_0
/*    */     //   1366: istore #20
/*    */     //   1368: aload #7
/*    */     //   1370: ldc_w -1323940314
/*    */     //   1373: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */     //   1376: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   1379: aload #7
/*    */     //   1381: iconst_0
/*    */     //   1382: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */     //   1385: istore #21
/*    */     //   1387: aload #7
/*    */     //   1389: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   1394: astore #22
/*    */     //   1396: aload #7
/*    */     //   1398: aload #13
/*    */     //   1400: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   1403: astore #23
/*    */     //   1405: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1408: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */     //   1411: astore #24
/*    */     //   1413: bipush #6
/*    */     //   1415: sipush #896
/*    */     //   1418: iload #19
/*    */     //   1420: bipush #6
/*    */     //   1422: ishl
/*    */     //   1423: iand
/*    */     //   1424: ior
/*    */     //   1425: istore #25
/*    */     //   1427: nop
/*    */     //   1428: iconst_0
/*    */     //   1429: istore #26
/*    */     //   1431: aload #7
/*    */     //   1433: ldc_w -692256719
/*    */     //   1436: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */     //   1439: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   1442: aload #7
/*    */     //   1444: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */     //   1449: instanceof androidx/compose/runtime/Applier
/*    */     //   1452: ifne -> 1458
/*    */     //   1455: invokestatic invalidApplier : ()V
/*    */     //   1458: aload #7
/*    */     //   1460: invokeinterface startReusableNode : ()V
/*    */     //   1465: aload #7
/*    */     //   1467: invokeinterface getInserting : ()Z
/*    */     //   1472: ifeq -> 1487
/*    */     //   1475: aload #7
/*    */     //   1477: aload #24
/*    */     //   1479: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   1484: goto -> 1494
/*    */     //   1487: aload #7
/*    */     //   1489: invokeinterface useNode : ()V
/*    */     //   1494: aload #7
/*    */     //   1496: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */     //   1499: astore #27
/*    */     //   1501: iconst_0
/*    */     //   1502: istore #28
/*    */     //   1504: aload #27
/*    */     //   1506: aload #18
/*    */     //   1508: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1511: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1514: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1517: aload #27
/*    */     //   1519: aload #22
/*    */     //   1521: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1524: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1527: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1530: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1533: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1536: astore #29
/*    */     //   1538: iconst_0
/*    */     //   1539: istore #30
/*    */     //   1541: aload #27
/*    */     //   1543: astore #31
/*    */     //   1545: iconst_0
/*    */     //   1546: istore #32
/*    */     //   1548: aload #31
/*    */     //   1550: invokeinterface getInserting : ()Z
/*    */     //   1555: ifne -> 1576
/*    */     //   1558: aload #31
/*    */     //   1560: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   1565: iload #21
/*    */     //   1567: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1570: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   1573: ifne -> 1602
/*    */     //   1576: aload #31
/*    */     //   1578: iload #21
/*    */     //   1580: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1583: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   1588: aload #27
/*    */     //   1590: iload #21
/*    */     //   1592: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1595: aload #29
/*    */     //   1597: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1602: nop
/*    */     //   1603: nop
/*    */     //   1604: nop
/*    */     //   1605: aload #27
/*    */     //   1607: aload #23
/*    */     //   1609: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1612: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1615: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1618: nop
/*    */     //   1619: nop
/*    */     //   1620: aload #7
/*    */     //   1622: bipush #14
/*    */     //   1624: iload #25
/*    */     //   1626: bipush #6
/*    */     //   1628: ishr
/*    */     //   1629: iand
/*    */     //   1630: istore #33
/*    */     //   1632: astore #34
/*    */     //   1634: iconst_0
/*    */     //   1635: istore #35
/*    */     //   1637: aload #34
/*    */     //   1639: ldc_w -384784025
/*    */     //   1642: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*    */     //   1645: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   1648: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*    */     //   1651: aload #34
/*    */     //   1653: bipush #6
/*    */     //   1655: bipush #112
/*    */     //   1657: iload #16
/*    */     //   1659: bipush #6
/*    */     //   1661: ishr
/*    */     //   1662: iand
/*    */     //   1663: ior
/*    */     //   1664: istore #36
/*    */     //   1666: astore #37
/*    */     //   1668: checkcast androidx/compose/foundation/layout/ColumnScope
/*    */     //   1671: astore #38
/*    */     //   1673: iconst_0
/*    */     //   1674: istore #39
/*    */     //   1676: aload_0
/*    */     //   1677: invokestatic firstOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*    */     //   1680: checkcast com/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem
/*    */     //   1683: astore #40
/*    */     //   1685: aload #37
/*    */     //   1687: ldc_w 125954823
/*    */     //   1690: invokeinterface startReplaceGroup : (I)V
/*    */     //   1695: aload #40
/*    */     //   1697: dup
/*    */     //   1698: ifnonnull -> 1706
/*    */     //   1701: pop
/*    */     //   1702: aconst_null
/*    */     //   1703: goto -> 1902
/*    */     //   1706: astore #41
/*    */     //   1708: iconst_0
/*    */     //   1709: istore #42
/*    */     //   1711: aload #41
/*    */     //   1713: invokevirtual getActionName : ()Ljava/lang/String;
/*    */     //   1716: dup
/*    */     //   1717: ifnonnull -> 1724
/*    */     //   1720: pop
/*    */     //   1721: ldc_w 'Retry'
/*    */     //   1724: aload #37
/*    */     //   1726: ldc_w -183053530
/*    */     //   1729: invokeinterface startReplaceGroup : (I)V
/*    */     //   1734: aload #37
/*    */     //   1736: astore #43
/*    */     //   1738: aload #7
/*    */     //   1740: aload #10
/*    */     //   1742: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   1747: aload #7
/*    */     //   1749: aload #41
/*    */     //   1751: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   1756: ior
/*    */     //   1757: iload #9
/*    */     //   1759: ldc 57344
/*    */     //   1761: iand
/*    */     //   1762: sipush #16384
/*    */     //   1765: if_icmpne -> 1772
/*    */     //   1768: iconst_1
/*    */     //   1769: goto -> 1773
/*    */     //   1772: iconst_0
/*    */     //   1773: ior
/*    */     //   1774: istore #44
/*    */     //   1776: nop
/*    */     //   1777: iconst_0
/*    */     //   1778: istore #45
/*    */     //   1780: aload #43
/*    */     //   1782: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   1787: astore #46
/*    */     //   1789: iconst_0
/*    */     //   1790: istore #47
/*    */     //   1792: iload #44
/*    */     //   1794: ifne -> 1808
/*    */     //   1797: aload #46
/*    */     //   1799: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   1802: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   1805: if_acmpne -> 1843
/*    */     //   1808: astore #48
/*    */     //   1810: iconst_0
/*    */     //   1811: istore #49
/*    */     //   1813: aload #10
/*    */     //   1815: aload #41
/*    */     //   1817: aload #4
/*    */     //   1819: <illegal opcode> invoke : (Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;
/*    */     //   1824: aload #48
/*    */     //   1826: swap
/*    */     //   1827: astore #50
/*    */     //   1829: aload #43
/*    */     //   1831: aload #50
/*    */     //   1833: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   1838: aload #50
/*    */     //   1840: goto -> 1845
/*    */     //   1843: aload #46
/*    */     //   1845: nop
/*    */     //   1846: nop
/*    */     //   1847: nop
/*    */     //   1848: checkcast kotlin/jvm/functions/Function0
/*    */     //   1851: astore #51
/*    */     //   1853: aload #37
/*    */     //   1855: invokeinterface endReplaceGroup : ()V
/*    */     //   1860: aload #51
/*    */     //   1862: astore #54
/*    */     //   1864: astore #55
/*    */     //   1866: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action
/*    */     //   1869: dup
/*    */     //   1870: aload #55
/*    */     //   1872: aload #54
/*    */     //   1874: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*    */     //   1877: astore #52
/*    */     //   1879: aconst_null
/*    */     //   1880: aload #41
/*    */     //   1882: invokevirtual getText : ()Ljava/lang/String;
/*    */     //   1885: aload #52
/*    */     //   1887: aload #37
/*    */     //   1889: iconst_0
/*    */     //   1890: iconst_1
/*    */     //   1891: invokestatic JunieErrorBanner : (Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;Landroidx/compose/runtime/Composer;II)V
/*    */     //   1894: nop
/*    */     //   1895: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   1898: pop
/*    */     //   1899: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   1902: pop
/*    */     //   1903: aload #37
/*    */     //   1905: invokeinterface endReplaceGroup : ()V
/*    */     //   1910: aload #37
/*    */     //   1912: ldc_w 125964684
/*    */     //   1915: invokeinterface startReplaceGroup : (I)V
/*    */     //   1920: aload_1
/*    */     //   1921: ifnull -> 1951
/*    */     //   1924: aload_2
/*    */     //   1925: instanceof com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationPageVm
/*    */     //   1928: ifne -> 1951
/*    */     //   1931: aload_2
/*    */     //   1932: instanceof com/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl
/*    */     //   1935: ifne -> 1951
/*    */     //   1938: aload_1
/*    */     //   1939: aload #37
/*    */     //   1941: bipush #14
/*    */     //   1943: iload #9
/*    */     //   1945: iconst_3
/*    */     //   1946: ishr
/*    */     //   1947: iand
/*    */     //   1948: invokestatic QuotaWarning : (Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;Landroidx/compose/runtime/Composer;I)V
/*    */     //   1951: aload #37
/*    */     //   1953: invokeinterface endReplaceGroup : ()V
/*    */     //   1958: aload_2
/*    */     //   1959: astore #40
/*    */     //   1961: aload #40
/*    */     //   1963: instanceof com/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl
/*    */     //   1966: ifeq -> 2007
/*    */     //   1969: aload #37
/*    */     //   1971: ldc_w -389847105
/*    */     //   1974: invokeinterface startReplaceGroup : (I)V
/*    */     //   1979: aload_2
/*    */     //   1980: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModel
/*    */     //   1983: aload_3
/*    */     //   1984: aload #37
/*    */     //   1986: bipush #112
/*    */     //   1988: iload #9
/*    */     //   1990: bipush #6
/*    */     //   1992: ishr
/*    */     //   1993: iand
/*    */     //   1994: invokestatic StartLoadingPage : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
/*    */     //   1997: aload #37
/*    */     //   1999: invokeinterface endReplaceGroup : ()V
/*    */     //   2004: goto -> 2150
/*    */     //   2007: aload #40
/*    */     //   2009: instanceof com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationPageVm
/*    */     //   2012: ifeq -> 2045
/*    */     //   2015: aload #37
/*    */     //   2017: ldc_w -389669568
/*    */     //   2020: invokeinterface startReplaceGroup : (I)V
/*    */     //   2025: aload_2
/*    */     //   2026: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationPageVm
/*    */     //   2029: aload #37
/*    */     //   2031: iconst_0
/*    */     //   2032: invokestatic GrazieActivationPage : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationPageVm;Landroidx/compose/runtime/Composer;I)V
/*    */     //   2035: aload #37
/*    */     //   2037: invokeinterface endReplaceGroup : ()V
/*    */     //   2042: goto -> 2150
/*    */     //   2045: aload #40
/*    */     //   2047: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl
/*    */     //   2050: ifeq -> 2089
/*    */     //   2053: aload #37
/*    */     //   2055: ldc_w 125981291
/*    */     //   2058: invokeinterface startReplaceGroup : (I)V
/*    */     //   2063: aload_2
/*    */     //   2064: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl
/*    */     //   2067: aload_0
/*    */     //   2068: invokeinterface isEmpty : ()Z
/*    */     //   2073: aload #37
/*    */     //   2075: iconst_0
/*    */     //   2076: invokestatic NewTaskPageSingleColumn : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;ZLandroidx/compose/runtime/Composer;I)V
/*    */     //   2079: aload #37
/*    */     //   2081: invokeinterface endReplaceGroup : ()V
/*    */     //   2086: goto -> 2150
/*    */     //   2089: aload #40
/*    */     //   2091: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel
/*    */     //   2094: ifeq -> 2133
/*    */     //   2097: aload #37
/*    */     //   2099: ldc_w 125986669
/*    */     //   2102: invokeinterface startReplaceGroup : (I)V
/*    */     //   2107: aload_2
/*    */     //   2108: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel
/*    */     //   2111: aload_0
/*    */     //   2112: invokeinterface isEmpty : ()Z
/*    */     //   2117: aload #37
/*    */     //   2119: iconst_0
/*    */     //   2120: invokestatic TaskChainPageSingleColumn : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;ZLandroidx/compose/runtime/Composer;I)V
/*    */     //   2123: aload #37
/*    */     //   2125: invokeinterface endReplaceGroup : ()V
/*    */     //   2130: goto -> 2150
/*    */     //   2133: aload #37
/*    */     //   2135: ldc_w -389257361
/*    */     //   2138: invokeinterface startReplaceGroup : (I)V
/*    */     //   2143: aload #37
/*    */     //   2145: invokeinterface endReplaceGroup : ()V
/*    */     //   2150: nop
/*    */     //   2151: aload #34
/*    */     //   2153: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   2156: aload #7
/*    */     //   2158: invokeinterface endNode : ()V
/*    */     //   2163: aload #7
/*    */     //   2165: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   2168: nop
/*    */     //   2169: aload #7
/*    */     //   2171: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   2174: nop
/*    */     //   2175: aload #7
/*    */     //   2177: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   2180: nop
/*    */     //   2181: invokestatic isTraceInProgress : ()Z
/*    */     //   2184: ifeq -> 2200
/*    */     //   2187: invokestatic traceEventEnd : ()V
/*    */     //   2190: goto -> 2200
/*    */     //   2193: aload #7
/*    */     //   2195: invokeinterface skipToGroupEnd : ()V
/*    */     //   2200: aload #7
/*    */     //   2202: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   2207: dup
/*    */     //   2208: ifnull -> 2236
/*    */     //   2211: aload_0
/*    */     //   2212: aload_1
/*    */     //   2213: aload_2
/*    */     //   2214: aload_3
/*    */     //   2215: aload #4
/*    */     //   2217: aload #5
/*    */     //   2219: iload #6
/*    */     //   2221: iload #8
/*    */     //   2223: <illegal opcode> invoke : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/Transition;ZI)Lkotlin/jvm/functions/Function2;
/*    */     //   2228: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   2233: goto -> 2237
/*    */     //   2236: pop
/*    */     //   2237: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #40	-> 32
/*    */     //   #41	-> 313
/*    */     //   #108	-> 323
/*    */     //   #109	-> 326
/*    */     //   #111	-> 328
/*    */     //   #112	-> 336
/*    */     //   #113	-> 349
/*    */     //   #114	-> 361
/*    */     //   #115	-> 372
/*    */     //   #116	-> 375
/*    */     //   #117	-> 375
/*    */     //   #118	-> 378
/*    */     //   #117	-> 381
/*    */     //   #116	-> 389
/*    */     //   #115	-> 400
/*    */     //   #119	-> 402
/*    */     //   #120	-> 411
/*    */     //   #121	-> 416
/*    */     //   #114	-> 418
/*    */     //   #113	-> 419
/*    */     //   #113	-> 420
/*    */     //   #112	-> 421
/*    */     //   #122	-> 435
/*    */     //   #108	-> 444
/*    */     //   #122	-> 449
/*    */     //   #41	-> 450
/*    */     //   #42	-> 452
/*    */     //   #44	-> 464
/*    */     //   #42	-> 482
/*    */     //   #123	-> 492
/*    */     //   #123	-> 495
/*    */     //   #124	-> 549
/*    */     //   #126	-> 552
/*    */     //   #45	-> 604
/*    */     //   #127	-> 618
/*    */     //   #45	-> 627
/*    */     //   #127	-> 634
/*    */     //   #45	-> 640
/*    */     //   #126	-> 663
/*    */     //   #128	-> 665
/*    */     //   #45	-> 717
/*    */     //   #127	-> 731
/*    */     //   #45	-> 740
/*    */     //   #127	-> 747
/*    */     //   #45	-> 753
/*    */     //   #128	-> 776
/*    */     //   #129	-> 778
/*    */     //   #131	-> 807
/*    */     //   #124	-> 851
/*    */     //   #131	-> 856
/*    */     //   #123	-> 857
/*    */     //   #42	-> 866
/*    */     //   #47	-> 868
/*    */     //   #49	-> 880
/*    */     //   #47	-> 898
/*    */     //   #132	-> 908
/*    */     //   #132	-> 911
/*    */     //   #133	-> 965
/*    */     //   #135	-> 968
/*    */     //   #50	-> 1020
/*    */     //   #135	-> 1056
/*    */     //   #136	-> 1058
/*    */     //   #50	-> 1110
/*    */     //   #136	-> 1146
/*    */     //   #137	-> 1148
/*    */     //   #139	-> 1177
/*    */     //   #133	-> 1221
/*    */     //   #139	-> 1226
/*    */     //   #132	-> 1227
/*    */     //   #47	-> 1236
/*    */     //   #53	-> 1238
/*    */     //   #54	-> 1243
/*    */     //   #56	-> 1252
/*    */     //   #57	-> 1277
/*    */     //   #53	-> 1293
/*    */     //   #52	-> 1293
/*    */     //   #59	-> 1298
/*    */     //   #140	-> 1310
/*    */     //   #141	-> 1313
/*    */     //   #142	-> 1321
/*    */     //   #145	-> 1329
/*    */     //   #146	-> 1364
/*    */     //   #147	-> 1376
/*    */     //   #148	-> 1382
/*    */     //   #149	-> 1389
/*    */     //   #150	-> 1398
/*    */     //   #152	-> 1405
/*    */     //   #151	-> 1427
/*    */     //   #153	-> 1439
/*    */     //   #154	-> 1442
/*    */     //   #155	-> 1460
/*    */     //   #156	-> 1465
/*    */     //   #157	-> 1477
/*    */     //   #159	-> 1489
/*    */     //   #161	-> 1494
/*    */     //   #162	-> 1504
/*    */     //   #163	-> 1517
/*    */     //   #165	-> 1530
/*    */     //   #166	-> 1541
/*    */     //   #167	-> 1548
/*    */     //   #168	-> 1576
/*    */     //   #169	-> 1588
/*    */     //   #171	-> 1602
/*    */     //   #166	-> 1603
/*    */     //   #171	-> 1604
/*    */     //   #172	-> 1605
/*    */     //   #173	-> 1618
/*    */     //   #161	-> 1619
/*    */     //   #174	-> 1620
/*    */     //   #175	-> 1645
/*    */     //   #62	-> 1676
/*    */     //   #63	-> 1711
/*    */     //   #64	-> 1711
/*    */     //   #65	-> 1776
/*    */     //   #176	-> 1780
/*    */     //   #177	-> 1792
/*    */     //   #178	-> 1808
/*    */     //   #65	-> 1813
/*    */     //   #178	-> 1827
/*    */     //   #179	-> 1829
/*    */     //   #180	-> 1838
/*    */     //   #181	-> 1843
/*    */     //   #177	-> 1845
/*    */     //   #176	-> 1846
/*    */     //   #176	-> 1847
/*    */     //   #65	-> 1848
/*    */     //   #63	-> 1862
/*    */     //   #73	-> 1880
/*    */     //   #74	-> 1885
/*    */     //   #72	-> 1891
/*    */     //   #76	-> 1894
/*    */     //   #62	-> 1898
/*    */     //   #62	-> 1902
/*    */     //   #77	-> 1920
/*    */     //   #78	-> 1938
/*    */     //   #80	-> 1958
/*    */     //   #81	-> 1961
/*    */     //   #83	-> 1979
/*    */     //   #84	-> 1983
/*    */     //   #82	-> 1994
/*    */     //   #81	-> 1997
/*    */     //   #88	-> 2007
/*    */     //   #90	-> 2025
/*    */     //   #89	-> 2032
/*    */     //   #88	-> 2035
/*    */     //   #94	-> 2045
/*    */     //   #95	-> 2053
/*    */     //   #96	-> 2063
/*    */     //   #97	-> 2067
/*    */     //   #95	-> 2076
/*    */     //   #100	-> 2089
/*    */     //   #101	-> 2097
/*    */     //   #102	-> 2107
/*    */     //   #103	-> 2111
/*    */     //   #101	-> 2120
/*    */     //   #105	-> 2133
/*    */     //   #106	-> 2150
/*    */     //   #175	-> 2151
/*    */     //   #174	-> 2156
/*    */     //   #182	-> 2158
/*    */     //   #153	-> 2165
/*    */     //   #183	-> 2168
/*    */     //   #147	-> 2171
/*    */     //   #184	-> 2174
/*    */     //   #140	-> 2177
/*    */     //   #185	-> 2180
/*    */     //   #107	-> 2193
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   378	3	21	$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1	I
/*    */     //   375	25	20	$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv	I
/*    */     //   402	11	21	value$iv$iv	Ljava/lang/Object;
/*    */     //   361	58	19	$i$a$-let-ComposerKt$cache$1$iv$iv	I
/*    */     //   358	61	18	it$iv$iv	Ljava/lang/Object;
/*    */     //   349	72	17	$i$f$cache	I
/*    */     //   346	75	15	$this$cache$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   346	75	16	invalid$iv$iv	Z
/*    */     //   317	133	13	$i$f$rememberCoroutineScope	I
/*    */     //   330	120	14	composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   435	15	23	wrapper$iv	Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
/*    */     //   314	136	12	$changed$iv	I
/*    */     //   618	6	26	$i$f$getDp	I
/*    */     //   615	9	25	$this$dp$iv	I
/*    */     //   634	6	26	$i$f$getDp	I
/*    */     //   631	9	25	$this$dp$iv	I
/*    */     //   582	78	24	$i$a$-animateDp-SingleColumnJunieKt$SingleColumnView$columnOffsetIN$2	I
/*    */     //   579	81	23	isSingle	Z
/*    */     //   579	81	22	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   579	81	21	$changed	I
/*    */     //   731	6	27	$i$f$getDp	I
/*    */     //   728	9	26	$this$dp$iv	I
/*    */     //   747	6	27	$i$f$getDp	I
/*    */     //   744	9	26	$this$dp$iv	I
/*    */     //   695	78	25	$i$a$-animateDp-SingleColumnJunieKt$SingleColumnView$columnOffsetIN$2	I
/*    */     //   692	81	22	isSingle	Z
/*    */     //   692	81	21	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   692	81	24	$changed	I
/*    */     //   543	314	20	$i$f$animateValue	I
/*    */     //   665	192	23	initialValue$iv$iv	Ljava/lang/Object;
/*    */     //   778	79	22	targetValue$iv$iv	Ljava/lang/Object;
/*    */     //   807	50	21	animationSpec$iv$iv	Landroidx/compose/animation/core/FiniteAnimationSpec;
/*    */     //   540	317	17	$this$animateValue$iv$iv	Landroidx/compose/animation/core/Transition;
/*    */     //   540	317	18	typeConverter$iv$iv	Landroidx/compose/animation/core/TwoWayConverter;
/*    */     //   540	317	19	$changed$iv$iv	I
/*    */     //   486	380	16	$i$f$animateDp	I
/*    */     //   483	383	12	$this$animateDp$iv	Landroidx/compose/animation/core/Transition;
/*    */     //   483	383	13	transitionSpec$iv	Lkotlin/jvm/functions/Function3;
/*    */     //   483	383	14	label$iv	Ljava/lang/String;
/*    */     //   483	383	15	$changed$iv	I
/*    */     //   998	55	25	$i$a$-animateFloat-SingleColumnJunieKt$SingleColumnView$alpha$2	I
/*    */     //   995	58	24	isSingle	Z
/*    */     //   995	58	23	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   995	58	22	$changed	I
/*    */     //   1088	55	26	$i$a$-animateFloat-SingleColumnJunieKt$SingleColumnView$alpha$2	I
/*    */     //   1085	58	23	isSingle	Z
/*    */     //   1085	58	22	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   1085	58	25	$changed	I
/*    */     //   959	268	21	$i$f$animateValue	I
/*    */     //   1058	169	24	initialValue$iv$iv	Ljava/lang/Object;
/*    */     //   1148	79	23	targetValue$iv$iv	Ljava/lang/Object;
/*    */     //   1177	50	22	animationSpec$iv$iv	Landroidx/compose/animation/core/FiniteAnimationSpec;
/*    */     //   956	271	18	$this$animateValue$iv$iv	Landroidx/compose/animation/core/Transition;
/*    */     //   956	271	19	typeConverter$iv$iv	Landroidx/compose/animation/core/TwoWayConverter;
/*    */     //   956	271	20	$changed$iv$iv	I
/*    */     //   902	334	17	$i$f$animateFloat	I
/*    */     //   899	337	13	$this$animateFloat$iv	Landroidx/compose/animation/core/Transition;
/*    */     //   899	337	14	transitionSpec$iv	Lkotlin/jvm/functions/Function3;
/*    */     //   899	337	15	label$iv	Ljava/lang/String;
/*    */     //   899	337	16	$changed$iv	I
/*    */     //   1813	11	49	$i$a$-cache-SingleColumnJunieKt$SingleColumnView$1$1$action$1	I
/*    */     //   1829	11	50	value$iv	Ljava/lang/Object;
/*    */     //   1792	54	47	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   1789	57	46	it$iv	Ljava/lang/Object;
/*    */     //   1780	68	45	$i$f$cache	I
/*    */     //   1777	71	43	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1777	71	44	invalid$iv	Z
/*    */     //   1711	184	42	$i$a$-let-SingleColumnJunieKt$SingleColumnView$1$1	I
/*    */     //   1879	16	52	action	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*    */     //   1708	187	41	it	Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem;
/*    */     //   1676	475	39	$i$a$-Column-SingleColumnJunieKt$SingleColumnView$1	I
/*    */     //   1673	478	38	$this$SingleColumnView_u24lambda_u245	Landroidx/compose/foundation/layout/ColumnScope;
/*    */     //   1673	478	37	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   1673	478	36	$changed	I
/*    */     //   1637	519	35	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*    */     //   1634	522	34	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1634	522	33	$changed$iv	I
/*    */     //   1548	55	32	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */     //   1545	58	31	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1541	64	30	$i$f$set-impl	I
/*    */     //   1538	67	29	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */     //   1504	115	28	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */     //   1501	118	27	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1431	738	26	$i$f$ReusableComposeNode	I
/*    */     //   1428	741	24	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */     //   1428	741	25	$changed$iv$iv$iv	I
/*    */     //   1368	807	20	$i$f$Layout	I
/*    */     //   1387	788	21	compositeKeyHash$iv$iv	I
/*    */     //   1396	779	22	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   1405	770	23	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */     //   1365	810	19	$changed$iv$iv	I
/*    */     //   1302	879	17	$i$f$Column	I
/*    */     //   1355	826	18	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   1321	860	14	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*    */     //   1329	852	15	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*    */     //   1299	882	16	$changed$iv	I
/*    */     //   452	1738	10	scope	Lkotlinx/coroutines/CoroutineScope;
/*    */     //   868	1322	11	columnOffsetIN	Landroidx/compose/runtime/State;
/*    */     //   1238	952	12	alpha	Landroidx/compose/runtime/State;
/*    */     //   1295	895	13	modifier	Landroidx/compose/ui/Modifier;
/*    */     //   47	2191	9	$dirty	I
/*    */     //   0	2238	0	junieProblems	Ljava/util/List;
/*    */     //   0	2238	1	quotaWarning	Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;
/*    */     //   0	2238	2	currentPage	Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;
/*    */     //   0	2238	3	onLoginSuccess	Lkotlin/jvm/functions/Function0;
/*    */     //   0	2238	4	onJunieProblemRefresh	Lkotlin/jvm/functions/Function0;
/*    */     //   0	2238	5	transition	Landroidx/compose/animation/core/Transition;
/*    */     //   0	2238	6	disableFadeOut	Z
/*    */     //   0	2238	7	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	2238	8	$changed	I
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class SingleColumnJunieKt$SingleColumnView$columnOffsetIN$1 implements Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Dp>> { @Composable
/*    */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */     public final FiniteAnimationSpec<Dp> invoke(Transition.Segment $this$animateDp, Composer $composer, int $changed) {
/* 43 */       Intrinsics.checkNotNullParameter($this$animateDp, "$this$animateDp"); $composer.startReplaceGroup(882690348); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(882690348, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.SingleColumnView.<anonymous> (SingleColumnJunie.kt:42)");  TweenSpec tweenSpec = AnimationSpecKt.tween$default(500, 0, EasingKt.getFastOutSlowInEasing(), 2, null); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return (FiniteAnimationSpec<Dp>)tweenSpec;
/*    */     } public static final SingleColumnJunieKt$SingleColumnView$columnOffsetIN$1 INSTANCE = new SingleColumnJunieKt$SingleColumnView$columnOffsetIN$1(); } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class SingleColumnJunieKt$SingleColumnView$alpha$1 implements Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>> { public static final SingleColumnJunieKt$SingleColumnView$alpha$1 INSTANCE = new SingleColumnJunieKt$SingleColumnView$alpha$1(); @Composable
/*    */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */     public final FiniteAnimationSpec<Float> invoke(Transition.Segment $this$animateFloat, Composer $composer, int $changed) {
/* 48 */       Intrinsics.checkNotNullParameter($this$animateFloat, "$this$animateFloat"); $composer.startReplaceGroup(1313508906); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1313508906, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.SingleColumnView.<anonymous> (SingleColumnJunie.kt:47)");  TweenSpec tweenSpec = AnimationSpecKt.tween$default(750, 0, EasingKt.getLinearEasing(), 2, null); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return (FiniteAnimationSpec<Float>)tweenSpec;
/*    */     } }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static final Unit SingleColumnView$lambda$5$lambda$4$lambda$3$lambda$2(CoroutineScope $scope, JuniePreconditionChecker.JunieProblem $it, Function0<Unit> $onJunieProblemRefresh) {
/* 66 */     BuildersKt.launch$default($scope, null, null, new SingleColumnJunieKt$SingleColumnView$1$1$action$1$1$1($it, $onJunieProblemRefresh, null), 3, null);
/*    */ 
/*    */ 
/*    */     
/* 70 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit SingleColumnView$lambda$6(List<JuniePreconditionChecker.JunieProblem> $junieProblems, GrazieQuotaWarning $quotaWarning, ViewModel $currentPage, Function0<Unit> $onLoginSuccess, Function0<Unit> $onJunieProblemRefresh, Transition<Boolean> $transition, boolean $disableFadeOut, int $$changed, Composer $composer, int $force) {
/*    */     SingleColumnView($junieProblems, $quotaWarning, $currentPage, $onLoginSuccess, $onJunieProblemRefresh, $transition, $disableFadeOut, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "SingleColumnJunie.kt", l = {67}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.SingleColumnJunieKt$SingleColumnView$1$1$action$1$1$1")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class SingleColumnJunieKt$SingleColumnView$1$1$action$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */     int label;
/*    */     
/*    */     SingleColumnJunieKt$SingleColumnView$1$1$action$1$1$1(JuniePreconditionChecker.JunieProblem $it, Function0<Unit> $onJunieProblemRefresh, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore_2
/*    */       //   4: aload_0
/*    */       //   5: getfield label : I
/*    */       //   8: tableswitch default -> 92, 0 -> 32, 1 -> 65
/*    */       //   32: aload_1
/*    */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   36: aload_0
/*    */       //   37: getfield $it : Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem;
/*    */       //   40: invokevirtual getAction : ()Lkotlin/jvm/functions/Function1;
/*    */       //   43: dup
/*    */       //   44: ifnull -> 77
/*    */       //   47: aload_0
/*    */       //   48: aload_0
/*    */       //   49: iconst_1
/*    */       //   50: putfield label : I
/*    */       //   53: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */       //   58: dup
/*    */       //   59: aload_2
/*    */       //   60: if_acmpne -> 70
/*    */       //   63: aload_2
/*    */       //   64: areturn
/*    */       //   65: aload_1
/*    */       //   66: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   69: aload_1
/*    */       //   70: checkcast java/lang/Boolean
/*    */       //   73: pop
/*    */       //   74: goto -> 78
/*    */       //   77: pop
/*    */       //   78: aload_0
/*    */       //   79: getfield $onJunieProblemRefresh : Lkotlin/jvm/functions/Function0;
/*    */       //   82: invokeinterface invoke : ()Ljava/lang/Object;
/*    */       //   87: pop
/*    */       //   88: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */       //   91: areturn
/*    */       //   92: new java/lang/IllegalStateException
/*    */       //   95: dup
/*    */       //   96: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   98: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   101: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #66	-> 3
/*    */       //   #67	-> 36
/*    */       //   #66	-> 63
/*    */       //   #67	-> 70
/*    */       //   #68	-> 78
/*    */       //   #69	-> 88
/*    */       //   #66	-> 92
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	102	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/SingleColumnJunieKt$SingleColumnView$1$1$action$1$1$1;
/*    */       //   36	56	1	$result	Ljava/lang/Object;
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super SingleColumnJunieKt$SingleColumnView$1$1$action$1$1$1> $completion) {
/*    */       return (Continuation<Unit>)new SingleColumnJunieKt$SingleColumnView$1$1$action$1$1$1(this.$it, this.$onJunieProblemRefresh, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((SingleColumnJunieKt$SingleColumnView$1$1$action$1$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\toolwindow\SingleColumnJunieKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */