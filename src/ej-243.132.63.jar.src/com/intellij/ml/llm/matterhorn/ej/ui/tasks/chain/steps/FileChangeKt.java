/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*     */ 
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.layout.RowScope;
/*     */ import androidx.compose.foundation.layout.SizeKt;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.text.TextLayoutResult;
/*     */ import androidx.compose.ui.text.font.FontFamily;
/*     */ import androidx.compose.ui.text.style.TextOverflow;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.FileChangeView;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.functions.Function4;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.component.IconButtonState;
/*     */ import org.jetbrains.jewel.ui.component.IconKt;
/*     */ import org.jetbrains.jewel.ui.icon.IconKey;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000R\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\021\n\002\020\016\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\005\032o\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\034\020\006\032\030\b\001\022\n\022\b\022\004\022\0020\0010\b\022\006\022\004\030\0010\t0\0072\034\020\n\032\030\b\001\022\n\022\b\022\004\022\0020\0010\b\022\006\022\004\030\0010\t0\0072\f\020\013\032\b\022\004\022\0020\0010\f2\006\020\r\032\0020\005H\001¢\006\002\020\016\032\001\020\017\032\0020\0012\006\020\002\032\0020\0032\b\b\002\020\020\032\0020\0212\b\b\002\020\022\032\0020\0212\b\b\002\020\023\032\0020\0052 \b\002\020\024\032\032\b\001\022\n\022\b\022\004\022\0020\0010\b\022\006\022\004\030\0010\t\030\0010\0072\034\020\006\032\030\b\001\022\n\022\b\022\004\022\0020\0010\b\022\006\022\004\030\0010\t0\0072\f\020\013\032\b\022\004\022\0020\0010\fH\001¢\006\004\b\025\020\026\032\001\020\027\032\0020\0012\006\020\002\032\0020\0032\006\020\030\032\0020\0212\006\020\031\032\0020\0052\b\b\002\020\023\032\0020\0052 \b\002\020\006\032\032\b\001\022\n\022\b\022\004\022\0020\0010\b\022\006\022\004\030\0010\t\030\0010\0072 \b\002\020\024\032\032\b\001\022\n\022\b\022\004\022\0020\0010\b\022\006\022\004\030\0010\t\030\0010\0072\020\b\002\020\013\032\n\022\004\022\0020\001\030\0010\fH\003¢\006\004\b\032\020\033\032\001\020\034\032\0020\0012\006\020\002\032\0020\0032\006\020\035\032\0020\0212\006\020\031\032\0020\0052\006\020\004\032\0020\0052\034\020\036\032\030\b\001\022\n\022\b\022\004\022\0020\0010\b\022\006\022\004\030\0010\t0\0072\034\020\n\032\030\b\001\022\n\022\b\022\004\022\0020\0010\b\022\006\022\004\030\0010\t0\0072\f\020\013\032\b\022\004\022\0020\0010\f2\006\020\r\032\0020\005H\003¢\006\004\b\037\020 \032+\020!\032\0020\0012\006\020\"\032\0020#2\006\020$\032\0020%2\f\020&\032\b\022\004\022\0020\0010\fH\001¢\006\002\020'\032g\020(\032\0020\0012\006\020\002\032\0020\0032\006\020\035\032\0020\0212\006\020\031\032\0020\0052\006\020)\032\0020\0212\f\020\013\032\b\022\004\022\0020\0010\f2\b\b\002\020\023\032\0020\0052\036\b\002\020*\032\030\022\004\022\0020+\022\004\022\0020\0010\007¢\006\002\b,¢\006\002\b-H\003¢\006\004\b.\020/¨\0060²\006\n\0201\032\0020\005X\002²\006\n\0201\032\0020\005X\002²\006\n\0202\032\0020\005X\002"}, d2 = {"NewFileReport", "", "change", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;", "isCommitted", "", "onLocate", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "onCommitAction", "onShowDiff", "Lkotlin/Function0;", "isProjectOnVCS", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "FileChangeChip", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "hoveredBackgroundColor", "showAction", "onRollBack", "FileChangeChip-K2djEUw", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;JJZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "FileChangeChipPrivate", "backGroundColor", "isHovered", "FileChangeChipPrivate-oC9nPe0", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;JZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "NewFileChip", "background", "onJumpToSource", "NewFileChip-oC9nPe0", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;JZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "IconButtonWithTextTooltip", "tooltipText", "", "iconKey", "Lorg/jetbrains/jewel/ui/icon/IconKey;", "onClick", "(Ljava/lang/String;Lorg/jetbrains/jewel/ui/icon/IconKey;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "FileChangeItem", "contentColor", "actions", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "FileChangeItem-gg3fqwA", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;JZJLkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ej-ui", "hovered", "overflow"})
/*     */ @SourceDebugExtension({"SMAP\nFileChange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileChange.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/FileChangeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,270:1\n1225#2,6:271\n1225#2,6:277\n1225#2,6:323\n1225#2,6:329\n1225#2,3:380\n1228#2,3:386\n1225#2,6:390\n1225#2,3:401\n1228#2,3:407\n1225#2,6:411\n1225#2,6:455\n1225#2,6:534\n71#3:283\n68#3,6:284\n74#3:318\n78#3:322\n71#3:335\n68#3,6:336\n74#3:370\n78#3:374\n79#4,6:290\n86#4,4:305\n90#4,2:315\n94#4:321\n79#4,6:342\n86#4,4:357\n90#4,2:367\n94#4:373\n79#4,6:424\n86#4,4:439\n90#4,2:449\n79#4,6:469\n86#4,4:484\n90#4,2:494\n79#4,6:505\n86#4,4:520\n90#4,2:530\n94#4:544\n79#4,6:554\n86#4,4:569\n90#4,2:579\n94#4:585\n94#4:589\n94#4:593\n368#5,9:296\n377#5:317\n378#5,2:319\n368#5,9:348\n377#5:369\n378#5,2:371\n368#5,9:430\n377#5:451\n368#5,9:475\n377#5:496\n368#5,9:511\n377#5:532\n378#5,2:542\n368#5,9:560\n377#5:581\n378#5,2:583\n378#5,2:587\n378#5,2:591\n4034#6,6:309\n4034#6,6:361\n4034#6,6:443\n4034#6,6:488\n4034#6,6:524\n4034#6,6:573\n481#7:375\n480#7,4:376\n484#7,2:383\n488#7:389\n481#7:396\n480#7,4:397\n484#7,2:404\n488#7:410\n480#8:385\n480#8:406\n99#9:417\n96#9,6:418\n102#9:452\n99#9:462\n96#9,6:463\n102#9:497\n99#9:498\n96#9,6:499\n102#9:533\n106#9:545\n99#9:546\n95#9,7:547\n102#9:582\n106#9:586\n106#9:590\n106#9:594\n149#10:453\n149#10:454\n149#10:461\n149#10:540\n149#10:541\n81#11:595\n107#11,2:596\n81#11:598\n107#11,2:599\n81#11:601\n107#11,2:602\n*S KotlinDebug\n*F\n+ 1 FileChange.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/FileChangeKt\n*L\n52#1:271,6\n54#1:277,6\n80#1:323,6\n82#1:329,6\n107#1:380,3\n107#1:386,3\n114#1:390,6\n153#1:401,3\n153#1:407,3\n215#1:411,6\n223#1:455,6\n242#1:534,6\n53#1:283\n53#1:284,6\n53#1:318\n53#1:322\n81#1:335\n81#1:336,6\n81#1:370\n81#1:374\n53#1:290,6\n53#1:305,4\n53#1:315,2\n53#1:321\n81#1:342,6\n81#1:357,4\n81#1:367,2\n81#1:373\n216#1:424,6\n216#1:439,4\n216#1:449,2\n217#1:469,6\n217#1:484,4\n217#1:494,2\n231#1:505,6\n231#1:520,4\n231#1:530,2\n231#1:544\n264#1:554,6\n264#1:569,4\n264#1:579,2\n264#1:585\n217#1:589\n216#1:593\n53#1:296,9\n53#1:317\n53#1:319,2\n81#1:348,9\n81#1:369\n81#1:371,2\n216#1:430,9\n216#1:451\n217#1:475,9\n217#1:496\n231#1:511,9\n231#1:532\n231#1:542,2\n264#1:560,9\n264#1:581\n264#1:583,2\n217#1:587,2\n216#1:591,2\n53#1:309,6\n81#1:361,6\n216#1:443,6\n217#1:488,6\n231#1:524,6\n264#1:573,6\n107#1:375\n107#1:376,4\n107#1:383,2\n107#1:389\n153#1:396\n153#1:397,4\n153#1:404,2\n153#1:410\n107#1:385\n153#1:406\n216#1:417\n216#1:418,6\n216#1:452\n217#1:462\n217#1:463,6\n217#1:497\n231#1:498\n231#1:499,6\n231#1:533\n231#1:545\n264#1:546\n264#1:547,7\n264#1:582\n264#1:586\n217#1:590\n216#1:594\n219#1:453\n220#1:454\n228#1:461\n250#1:540\n259#1:541\n52#1:595\n52#1:596,2\n80#1:598\n80#1:599,2\n215#1:601\n215#1:602,2\n*E\n"})
/*     */ public final class FileChangeKt {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void NewFileReport(@NotNull FileChangeView change, boolean isCommitted, @NotNull Function1 onLocate, @NotNull Function1 onCommitAction, @NotNull Function0 onShowDiff, boolean isProjectOnVCS, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'change'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'onLocate'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_3
/*     */     //   13: ldc 'onCommitAction'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload #4
/*     */     //   20: ldc 'onShowDiff'
/*     */     //   22: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   25: aload #6
/*     */     //   27: ldc -531281242
/*     */     //   29: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   34: astore #6
/*     */     //   36: iload #7
/*     */     //   38: istore #8
/*     */     //   40: iload #7
/*     */     //   42: bipush #6
/*     */     //   44: iand
/*     */     //   45: ifne -> 69
/*     */     //   48: iload #8
/*     */     //   50: aload #6
/*     */     //   52: aload_0
/*     */     //   53: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   58: ifeq -> 65
/*     */     //   61: iconst_4
/*     */     //   62: goto -> 66
/*     */     //   65: iconst_2
/*     */     //   66: ior
/*     */     //   67: istore #8
/*     */     //   69: iload #7
/*     */     //   71: bipush #48
/*     */     //   73: iand
/*     */     //   74: ifne -> 100
/*     */     //   77: iload #8
/*     */     //   79: aload #6
/*     */     //   81: iload_1
/*     */     //   82: invokeinterface changed : (Z)Z
/*     */     //   87: ifeq -> 95
/*     */     //   90: bipush #32
/*     */     //   92: goto -> 97
/*     */     //   95: bipush #16
/*     */     //   97: ior
/*     */     //   98: istore #8
/*     */     //   100: iload #7
/*     */     //   102: sipush #384
/*     */     //   105: iand
/*     */     //   106: ifne -> 134
/*     */     //   109: iload #8
/*     */     //   111: aload #6
/*     */     //   113: aload_2
/*     */     //   114: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   119: ifeq -> 128
/*     */     //   122: sipush #256
/*     */     //   125: goto -> 131
/*     */     //   128: sipush #128
/*     */     //   131: ior
/*     */     //   132: istore #8
/*     */     //   134: iload #7
/*     */     //   136: sipush #3072
/*     */     //   139: iand
/*     */     //   140: ifne -> 168
/*     */     //   143: iload #8
/*     */     //   145: aload #6
/*     */     //   147: aload_3
/*     */     //   148: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   153: ifeq -> 162
/*     */     //   156: sipush #2048
/*     */     //   159: goto -> 165
/*     */     //   162: sipush #1024
/*     */     //   165: ior
/*     */     //   166: istore #8
/*     */     //   168: iload #7
/*     */     //   170: sipush #24576
/*     */     //   173: iand
/*     */     //   174: ifne -> 203
/*     */     //   177: iload #8
/*     */     //   179: aload #6
/*     */     //   181: aload #4
/*     */     //   183: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   188: ifeq -> 197
/*     */     //   191: sipush #16384
/*     */     //   194: goto -> 200
/*     */     //   197: sipush #8192
/*     */     //   200: ior
/*     */     //   201: istore #8
/*     */     //   203: iload #7
/*     */     //   205: ldc 196608
/*     */     //   207: iand
/*     */     //   208: ifne -> 235
/*     */     //   211: iload #8
/*     */     //   213: aload #6
/*     */     //   215: iload #5
/*     */     //   217: invokeinterface changed : (Z)Z
/*     */     //   222: ifeq -> 230
/*     */     //   225: ldc 131072
/*     */     //   227: goto -> 232
/*     */     //   230: ldc 65536
/*     */     //   232: ior
/*     */     //   233: istore #8
/*     */     //   235: iload #8
/*     */     //   237: ldc 74899
/*     */     //   239: iand
/*     */     //   240: ldc 74898
/*     */     //   242: if_icmpne -> 255
/*     */     //   245: aload #6
/*     */     //   247: invokeinterface getSkipping : ()Z
/*     */     //   252: ifne -> 1005
/*     */     //   255: invokestatic isTraceInProgress : ()Z
/*     */     //   258: ifeq -> 271
/*     */     //   261: ldc -531281242
/*     */     //   263: iload #8
/*     */     //   265: iconst_m1
/*     */     //   266: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.NewFileReport (FileChange.kt:50)'
/*     */     //   268: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   271: aload #6
/*     */     //   273: ldc -953477015
/*     */     //   275: invokeinterface startReplaceGroup : (I)V
/*     */     //   280: aload #6
/*     */     //   282: astore #11
/*     */     //   284: iconst_0
/*     */     //   285: istore #12
/*     */     //   287: nop
/*     */     //   288: iconst_0
/*     */     //   289: istore #13
/*     */     //   291: aload #11
/*     */     //   293: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   298: astore #14
/*     */     //   300: iconst_0
/*     */     //   301: istore #15
/*     */     //   303: aload #14
/*     */     //   305: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   308: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   311: if_acmpne -> 343
/*     */     //   314: iconst_0
/*     */     //   315: istore #16
/*     */     //   317: iconst_0
/*     */     //   318: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   321: aconst_null
/*     */     //   322: iconst_2
/*     */     //   323: aconst_null
/*     */     //   324: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   327: astore #16
/*     */     //   329: aload #11
/*     */     //   331: aload #16
/*     */     //   333: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   338: aload #16
/*     */     //   340: goto -> 345
/*     */     //   343: aload #14
/*     */     //   345: nop
/*     */     //   346: nop
/*     */     //   347: nop
/*     */     //   348: checkcast androidx/compose/runtime/MutableState
/*     */     //   351: astore #10
/*     */     //   353: aload #6
/*     */     //   355: invokeinterface endReplaceGroup : ()V
/*     */     //   360: aload #10
/*     */     //   362: astore #9
/*     */     //   364: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   367: checkcast androidx/compose/ui/Modifier
/*     */     //   370: aload #6
/*     */     //   372: ldc -953474665
/*     */     //   374: invokeinterface startReplaceGroup : (I)V
/*     */     //   379: aload #6
/*     */     //   381: astore #11
/*     */     //   383: iconst_0
/*     */     //   384: istore #12
/*     */     //   386: iconst_0
/*     */     //   387: istore #13
/*     */     //   389: aload #11
/*     */     //   391: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   396: astore #14
/*     */     //   398: iconst_0
/*     */     //   399: istore #15
/*     */     //   401: aload #14
/*     */     //   403: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   406: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   409: if_acmpne -> 443
/*     */     //   412: astore #39
/*     */     //   414: iconst_0
/*     */     //   415: istore #16
/*     */     //   417: aload #9
/*     */     //   419: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   424: aload #39
/*     */     //   426: swap
/*     */     //   427: astore #17
/*     */     //   429: aload #11
/*     */     //   431: aload #17
/*     */     //   433: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   438: aload #17
/*     */     //   440: goto -> 445
/*     */     //   443: aload #14
/*     */     //   445: nop
/*     */     //   446: nop
/*     */     //   447: nop
/*     */     //   448: checkcast kotlin/jvm/functions/Function1
/*     */     //   451: astore #10
/*     */     //   453: aload #6
/*     */     //   455: invokeinterface endReplaceGroup : ()V
/*     */     //   460: aload #10
/*     */     //   462: invokestatic onHover : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   465: astore #10
/*     */     //   467: iconst_0
/*     */     //   468: istore #13
/*     */     //   470: nop
/*     */     //   471: iconst_0
/*     */     //   472: istore #14
/*     */     //   474: aload #6
/*     */     //   476: ldc 733328855
/*     */     //   478: ldc 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   480: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   483: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   486: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   489: astore #11
/*     */     //   491: iconst_0
/*     */     //   492: istore #12
/*     */     //   494: aload #11
/*     */     //   496: iload #12
/*     */     //   498: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   501: astore #15
/*     */     //   503: bipush #112
/*     */     //   505: iload #13
/*     */     //   507: iconst_3
/*     */     //   508: ishl
/*     */     //   509: iand
/*     */     //   510: istore #16
/*     */     //   512: nop
/*     */     //   513: iconst_0
/*     */     //   514: istore #17
/*     */     //   516: aload #6
/*     */     //   518: ldc -1323940314
/*     */     //   520: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   522: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   525: aload #6
/*     */     //   527: iconst_0
/*     */     //   528: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   531: istore #18
/*     */     //   533: aload #6
/*     */     //   535: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   540: astore #19
/*     */     //   542: aload #6
/*     */     //   544: aload #10
/*     */     //   546: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   549: astore #20
/*     */     //   551: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   554: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   557: astore #21
/*     */     //   559: bipush #6
/*     */     //   561: sipush #896
/*     */     //   564: iload #16
/*     */     //   566: bipush #6
/*     */     //   568: ishl
/*     */     //   569: iand
/*     */     //   570: ior
/*     */     //   571: istore #22
/*     */     //   573: nop
/*     */     //   574: iconst_0
/*     */     //   575: istore #23
/*     */     //   577: aload #6
/*     */     //   579: ldc -692256719
/*     */     //   581: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   583: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   586: aload #6
/*     */     //   588: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   593: instanceof androidx/compose/runtime/Applier
/*     */     //   596: ifne -> 602
/*     */     //   599: invokestatic invalidApplier : ()V
/*     */     //   602: aload #6
/*     */     //   604: invokeinterface startReusableNode : ()V
/*     */     //   609: aload #6
/*     */     //   611: invokeinterface getInserting : ()Z
/*     */     //   616: ifeq -> 631
/*     */     //   619: aload #6
/*     */     //   621: aload #21
/*     */     //   623: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   628: goto -> 638
/*     */     //   631: aload #6
/*     */     //   633: invokeinterface useNode : ()V
/*     */     //   638: aload #6
/*     */     //   640: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   643: astore #24
/*     */     //   645: iconst_0
/*     */     //   646: istore #25
/*     */     //   648: aload #24
/*     */     //   650: aload #15
/*     */     //   652: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   655: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   658: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   661: aload #24
/*     */     //   663: aload #19
/*     */     //   665: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   668: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   671: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   674: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   677: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   680: astore #26
/*     */     //   682: iconst_0
/*     */     //   683: istore #27
/*     */     //   685: aload #24
/*     */     //   687: astore #28
/*     */     //   689: iconst_0
/*     */     //   690: istore #29
/*     */     //   692: aload #28
/*     */     //   694: invokeinterface getInserting : ()Z
/*     */     //   699: ifne -> 720
/*     */     //   702: aload #28
/*     */     //   704: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   709: iload #18
/*     */     //   711: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   714: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   717: ifne -> 746
/*     */     //   720: aload #28
/*     */     //   722: iload #18
/*     */     //   724: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   727: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   732: aload #24
/*     */     //   734: iload #18
/*     */     //   736: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   739: aload #26
/*     */     //   741: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   746: nop
/*     */     //   747: nop
/*     */     //   748: nop
/*     */     //   749: aload #24
/*     */     //   751: aload #20
/*     */     //   753: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   756: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   759: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   762: nop
/*     */     //   763: nop
/*     */     //   764: aload #6
/*     */     //   766: bipush #14
/*     */     //   768: iload #22
/*     */     //   770: bipush #6
/*     */     //   772: ishr
/*     */     //   773: iand
/*     */     //   774: istore #30
/*     */     //   776: astore #31
/*     */     //   778: iconst_0
/*     */     //   779: istore #32
/*     */     //   781: aload #31
/*     */     //   783: ldc -2146769399
/*     */     //   785: ldc 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   787: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   790: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   793: aload #31
/*     */     //   795: bipush #6
/*     */     //   797: bipush #112
/*     */     //   799: iload #13
/*     */     //   801: bipush #6
/*     */     //   803: ishr
/*     */     //   804: iand
/*     */     //   805: ior
/*     */     //   806: istore #33
/*     */     //   808: astore #34
/*     */     //   810: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   813: astore #35
/*     */     //   815: iconst_0
/*     */     //   816: istore #36
/*     */     //   818: aload_0
/*     */     //   819: aload #9
/*     */     //   821: invokestatic NewFileReport$lambda$1 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   824: ifeq -> 860
/*     */     //   827: aload #34
/*     */     //   829: ldc_w -559862267
/*     */     //   832: invokeinterface startReplaceGroup : (I)V
/*     */     //   837: aload #34
/*     */     //   839: iconst_0
/*     */     //   840: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   843: invokevirtual getReportFileChipBackgroundHovered-0d7_KjU : ()J
/*     */     //   846: lstore #37
/*     */     //   848: aload #34
/*     */     //   850: invokeinterface endReplaceGroup : ()V
/*     */     //   855: lload #37
/*     */     //   857: goto -> 890
/*     */     //   860: aload #34
/*     */     //   862: ldc_w -559860578
/*     */     //   865: invokeinterface startReplaceGroup : (I)V
/*     */     //   870: aload #34
/*     */     //   872: iconst_0
/*     */     //   873: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   876: invokevirtual getReportFileChipBackground-0d7_KjU : ()J
/*     */     //   879: lstore #37
/*     */     //   881: aload #34
/*     */     //   883: invokeinterface endReplaceGroup : ()V
/*     */     //   888: lload #37
/*     */     //   890: aload #9
/*     */     //   892: invokestatic NewFileReport$lambda$1 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   895: iload_1
/*     */     //   896: aload_2
/*     */     //   897: aload_3
/*     */     //   898: aload #4
/*     */     //   900: iload #5
/*     */     //   902: aload #34
/*     */     //   904: bipush #14
/*     */     //   906: iload #8
/*     */     //   908: iand
/*     */     //   909: sipush #7168
/*     */     //   912: iload #8
/*     */     //   914: bipush #6
/*     */     //   916: ishl
/*     */     //   917: iand
/*     */     //   918: ior
/*     */     //   919: ldc_w 57344
/*     */     //   922: iload #8
/*     */     //   924: bipush #6
/*     */     //   926: ishl
/*     */     //   927: iand
/*     */     //   928: ior
/*     */     //   929: ldc_w 458752
/*     */     //   932: iload #8
/*     */     //   934: bipush #6
/*     */     //   936: ishl
/*     */     //   937: iand
/*     */     //   938: ior
/*     */     //   939: ldc_w 3670016
/*     */     //   942: iload #8
/*     */     //   944: bipush #6
/*     */     //   946: ishl
/*     */     //   947: iand
/*     */     //   948: ior
/*     */     //   949: ldc_w 29360128
/*     */     //   952: iload #8
/*     */     //   954: bipush #6
/*     */     //   956: ishl
/*     */     //   957: iand
/*     */     //   958: ior
/*     */     //   959: invokestatic NewFileChip-oC9nPe0 : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;JZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V
/*     */     //   962: nop
/*     */     //   963: aload #31
/*     */     //   965: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   968: aload #6
/*     */     //   970: invokeinterface endNode : ()V
/*     */     //   975: aload #6
/*     */     //   977: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   980: nop
/*     */     //   981: aload #6
/*     */     //   983: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   986: nop
/*     */     //   987: aload #6
/*     */     //   989: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   992: nop
/*     */     //   993: invokestatic isTraceInProgress : ()Z
/*     */     //   996: ifeq -> 1012
/*     */     //   999: invokestatic traceEventEnd : ()V
/*     */     //   1002: goto -> 1012
/*     */     //   1005: aload #6
/*     */     //   1007: invokeinterface skipToGroupEnd : ()V
/*     */     //   1012: aload #6
/*     */     //   1014: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1019: dup
/*     */     //   1020: ifnull -> 1046
/*     */     //   1023: aload_0
/*     */     //   1024: iload_1
/*     */     //   1025: aload_2
/*     */     //   1026: aload_3
/*     */     //   1027: aload #4
/*     */     //   1029: iload #5
/*     */     //   1031: iload #7
/*     */     //   1033: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZI)Lkotlin/jvm/functions/Function2;
/*     */     //   1038: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1043: goto -> 1047
/*     */     //   1046: pop
/*     */     //   1047: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #51	-> 25
/*     */     //   #52	-> 287
/*     */     //   #271	-> 291
/*     */     //   #272	-> 303
/*     */     //   #273	-> 314
/*     */     //   #52	-> 317
/*     */     //   #273	-> 327
/*     */     //   #274	-> 329
/*     */     //   #275	-> 338
/*     */     //   #276	-> 343
/*     */     //   #272	-> 345
/*     */     //   #271	-> 346
/*     */     //   #271	-> 347
/*     */     //   #52	-> 348
/*     */     //   #54	-> 364
/*     */     //   #277	-> 389
/*     */     //   #278	-> 401
/*     */     //   #279	-> 412
/*     */     //   #54	-> 417
/*     */     //   #279	-> 427
/*     */     //   #280	-> 429
/*     */     //   #281	-> 438
/*     */     //   #282	-> 443
/*     */     //   #278	-> 445
/*     */     //   #277	-> 446
/*     */     //   #277	-> 447
/*     */     //   #54	-> 448
/*     */     //   #53	-> 470
/*     */     //   #283	-> 480
/*     */     //   #284	-> 483
/*     */     //   #285	-> 491
/*     */     //   #288	-> 494
/*     */     //   #289	-> 512
/*     */     //   #290	-> 522
/*     */     //   #291	-> 528
/*     */     //   #292	-> 535
/*     */     //   #293	-> 544
/*     */     //   #295	-> 551
/*     */     //   #294	-> 573
/*     */     //   #296	-> 583
/*     */     //   #297	-> 586
/*     */     //   #298	-> 604
/*     */     //   #299	-> 609
/*     */     //   #300	-> 621
/*     */     //   #302	-> 633
/*     */     //   #304	-> 638
/*     */     //   #305	-> 648
/*     */     //   #306	-> 661
/*     */     //   #308	-> 674
/*     */     //   #309	-> 685
/*     */     //   #310	-> 692
/*     */     //   #311	-> 720
/*     */     //   #312	-> 732
/*     */     //   #314	-> 746
/*     */     //   #309	-> 747
/*     */     //   #314	-> 748
/*     */     //   #315	-> 749
/*     */     //   #316	-> 762
/*     */     //   #304	-> 763
/*     */     //   #317	-> 764
/*     */     //   #318	-> 787
/*     */     //   #57	-> 818
/*     */     //   #58	-> 819
/*     */     //   #59	-> 890
/*     */     //   #60	-> 895
/*     */     //   #61	-> 896
/*     */     //   #62	-> 897
/*     */     //   #63	-> 898
/*     */     //   #64	-> 900
/*     */     //   #56	-> 959
/*     */     //   #66	-> 962
/*     */     //   #318	-> 963
/*     */     //   #317	-> 968
/*     */     //   #319	-> 970
/*     */     //   #296	-> 977
/*     */     //   #320	-> 980
/*     */     //   #290	-> 983
/*     */     //   #321	-> 986
/*     */     //   #283	-> 989
/*     */     //   #322	-> 992
/*     */     //   #67	-> 1005
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   317	10	16	$i$a$-cache-FileChangeKt$NewFileReport$hovered$2	I
/*     */     //   329	11	16	value$iv	Ljava/lang/Object;
/*     */     //   303	43	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   300	46	14	it$iv	Ljava/lang/Object;
/*     */     //   291	57	13	$i$f$cache	I
/*     */     //   288	60	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   288	60	12	invalid$iv	Z
/*     */     //   417	7	16	$i$a$-cache-FileChangeKt$NewFileReport$1	I
/*     */     //   429	11	17	value$iv	Ljava/lang/Object;
/*     */     //   401	45	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   398	48	14	it$iv	Ljava/lang/Object;
/*     */     //   389	59	13	$i$f$cache	I
/*     */     //   386	62	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   386	62	12	invalid$iv	Z
/*     */     //   818	145	36	$i$a$-Box-FileChangeKt$NewFileReport$2	I
/*     */     //   815	148	35	$this$NewFileReport_u24lambda_u245	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   815	148	34	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   815	148	33	$changed	I
/*     */     //   781	187	32	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   778	190	31	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   778	190	30	$changed$iv	I
/*     */     //   692	55	29	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   689	58	28	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   685	64	27	$i$f$set-impl	I
/*     */     //   682	67	26	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   648	115	25	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   645	118	24	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   577	404	23	$i$f$ReusableComposeNode	I
/*     */     //   574	407	21	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   574	407	22	$changed$iv$iv$iv	I
/*     */     //   516	471	17	$i$f$Layout	I
/*     */     //   533	454	18	compositeKeyHash$iv$iv	I
/*     */     //   542	445	19	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   551	436	20	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   513	474	16	$changed$iv$iv	I
/*     */     //   474	519	14	$i$f$Box	I
/*     */     //   503	490	15	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   471	522	10	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   491	502	11	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   494	499	12	propagateMinConstraints$iv	Z
/*     */     //   471	522	13	$changed$iv	I
/*     */     //   364	638	9	hovered$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   40	1008	8	$dirty	I
/*     */     //   0	1048	0	change	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*     */     //   0	1048	1	isCommitted	Z
/*     */     //   0	1048	2	onLocate	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1048	3	onCommitAction	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1048	4	onShowDiff	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1048	5	isProjectOnVCS	Z
/*     */     //   0	1048	6	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1048	7	$changed	I
/*     */   }
/*     */   
/*  52 */   private static final boolean NewFileReport$lambda$1(MutableState $hovered$delegate) { State state = (State)$hovered$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 595 */       (Boolean)state.getValue()).booleanValue(); } private static final void NewFileReport$lambda$2(MutableState $hovered$delegate, boolean <set-?>) { MutableState mutableState = $hovered$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 596 */     mutableState.setValue(value$iv); } private static final Unit NewFileReport$lambda$4$lambda$3(MutableState<Boolean> $hovered$delegate, boolean it) { NewFileReport$lambda$2($hovered$delegate, it); return Unit.INSTANCE; }
/*     */   @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void FileChangeChip-K2djEUw(@NotNull FileChangeView change, long backgroundColor, long hoveredBackgroundColor, boolean showAction, @Nullable Function1 onRollBack, @NotNull Function1 onLocate, @NotNull Function0 onShowDiff, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'change'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #7
/*     */     //   8: ldc 'onLocate'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload #8
/*     */     //   15: ldc 'onShowDiff'
/*     */     //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   20: aload #9
/*     */     //   22: ldc_w -2083409256
/*     */     //   25: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   30: astore #9
/*     */     //   32: iload #10
/*     */     //   34: istore #12
/*     */     //   36: iload #11
/*     */     //   38: iconst_1
/*     */     //   39: iand
/*     */     //   40: ifeq -> 53
/*     */     //   43: iload #12
/*     */     //   45: bipush #6
/*     */     //   47: ior
/*     */     //   48: istore #12
/*     */     //   50: goto -> 82
/*     */     //   53: iload #10
/*     */     //   55: bipush #6
/*     */     //   57: iand
/*     */     //   58: ifne -> 82
/*     */     //   61: iload #12
/*     */     //   63: aload #9
/*     */     //   65: aload_0
/*     */     //   66: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   71: ifeq -> 78
/*     */     //   74: iconst_4
/*     */     //   75: goto -> 79
/*     */     //   78: iconst_2
/*     */     //   79: ior
/*     */     //   80: istore #12
/*     */     //   82: iload #10
/*     */     //   84: bipush #48
/*     */     //   86: iand
/*     */     //   87: ifne -> 120
/*     */     //   90: iload #12
/*     */     //   92: iload #11
/*     */     //   94: iconst_2
/*     */     //   95: iand
/*     */     //   96: ifne -> 115
/*     */     //   99: aload #9
/*     */     //   101: lload_1
/*     */     //   102: invokeinterface changed : (J)Z
/*     */     //   107: ifeq -> 115
/*     */     //   110: bipush #32
/*     */     //   112: goto -> 117
/*     */     //   115: bipush #16
/*     */     //   117: ior
/*     */     //   118: istore #12
/*     */     //   120: iload #10
/*     */     //   122: sipush #384
/*     */     //   125: iand
/*     */     //   126: ifne -> 161
/*     */     //   129: iload #12
/*     */     //   131: iload #11
/*     */     //   133: iconst_4
/*     */     //   134: iand
/*     */     //   135: ifne -> 155
/*     */     //   138: aload #9
/*     */     //   140: lload_3
/*     */     //   141: invokeinterface changed : (J)Z
/*     */     //   146: ifeq -> 155
/*     */     //   149: sipush #256
/*     */     //   152: goto -> 158
/*     */     //   155: sipush #128
/*     */     //   158: ior
/*     */     //   159: istore #12
/*     */     //   161: iload #11
/*     */     //   163: bipush #8
/*     */     //   165: iand
/*     */     //   166: ifeq -> 180
/*     */     //   169: iload #12
/*     */     //   171: sipush #3072
/*     */     //   174: ior
/*     */     //   175: istore #12
/*     */     //   177: goto -> 215
/*     */     //   180: iload #10
/*     */     //   182: sipush #3072
/*     */     //   185: iand
/*     */     //   186: ifne -> 215
/*     */     //   189: iload #12
/*     */     //   191: aload #9
/*     */     //   193: iload #5
/*     */     //   195: invokeinterface changed : (Z)Z
/*     */     //   200: ifeq -> 209
/*     */     //   203: sipush #2048
/*     */     //   206: goto -> 212
/*     */     //   209: sipush #1024
/*     */     //   212: ior
/*     */     //   213: istore #12
/*     */     //   215: iload #11
/*     */     //   217: bipush #16
/*     */     //   219: iand
/*     */     //   220: ifeq -> 234
/*     */     //   223: iload #12
/*     */     //   225: sipush #24576
/*     */     //   228: ior
/*     */     //   229: istore #12
/*     */     //   231: goto -> 269
/*     */     //   234: iload #10
/*     */     //   236: sipush #24576
/*     */     //   239: iand
/*     */     //   240: ifne -> 269
/*     */     //   243: iload #12
/*     */     //   245: aload #9
/*     */     //   247: aload #6
/*     */     //   249: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   254: ifeq -> 263
/*     */     //   257: sipush #16384
/*     */     //   260: goto -> 266
/*     */     //   263: sipush #8192
/*     */     //   266: ior
/*     */     //   267: istore #12
/*     */     //   269: iload #11
/*     */     //   271: bipush #32
/*     */     //   273: iand
/*     */     //   274: ifeq -> 287
/*     */     //   277: iload #12
/*     */     //   279: ldc 196608
/*     */     //   281: ior
/*     */     //   282: istore #12
/*     */     //   284: goto -> 319
/*     */     //   287: iload #10
/*     */     //   289: ldc 196608
/*     */     //   291: iand
/*     */     //   292: ifne -> 319
/*     */     //   295: iload #12
/*     */     //   297: aload #9
/*     */     //   299: aload #7
/*     */     //   301: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   306: ifeq -> 314
/*     */     //   309: ldc 131072
/*     */     //   311: goto -> 316
/*     */     //   314: ldc 65536
/*     */     //   316: ior
/*     */     //   317: istore #12
/*     */     //   319: iload #11
/*     */     //   321: bipush #64
/*     */     //   323: iand
/*     */     //   324: ifeq -> 338
/*     */     //   327: iload #12
/*     */     //   329: ldc_w 1572864
/*     */     //   332: ior
/*     */     //   333: istore #12
/*     */     //   335: goto -> 373
/*     */     //   338: iload #10
/*     */     //   340: ldc_w 1572864
/*     */     //   343: iand
/*     */     //   344: ifne -> 373
/*     */     //   347: iload #12
/*     */     //   349: aload #9
/*     */     //   351: aload #8
/*     */     //   353: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   358: ifeq -> 367
/*     */     //   361: ldc_w 1048576
/*     */     //   364: goto -> 370
/*     */     //   367: ldc_w 524288
/*     */     //   370: ior
/*     */     //   371: istore #12
/*     */     //   373: iload #12
/*     */     //   375: ldc_w 599187
/*     */     //   378: iand
/*     */     //   379: ldc_w 599186
/*     */     //   382: if_icmpne -> 395
/*     */     //   385: aload #9
/*     */     //   387: invokeinterface getSkipping : ()Z
/*     */     //   392: ifne -> 1224
/*     */     //   395: aload #9
/*     */     //   397: invokeinterface startDefaults : ()V
/*     */     //   402: iload #10
/*     */     //   404: iconst_1
/*     */     //   405: iand
/*     */     //   406: ifeq -> 419
/*     */     //   409: aload #9
/*     */     //   411: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   416: ifeq -> 493
/*     */     //   419: iload #11
/*     */     //   421: iconst_2
/*     */     //   422: iand
/*     */     //   423: ifeq -> 443
/*     */     //   426: aload #9
/*     */     //   428: iconst_0
/*     */     //   429: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   432: invokevirtual getChipBackground-0d7_KjU : ()J
/*     */     //   435: lstore_1
/*     */     //   436: iload #12
/*     */     //   438: bipush #-113
/*     */     //   440: iand
/*     */     //   441: istore #12
/*     */     //   443: iload #11
/*     */     //   445: iconst_4
/*     */     //   446: iand
/*     */     //   447: ifeq -> 468
/*     */     //   450: aload #9
/*     */     //   452: iconst_0
/*     */     //   453: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   456: invokevirtual getChipBackgroundHovered-0d7_KjU : ()J
/*     */     //   459: lstore_3
/*     */     //   460: iload #12
/*     */     //   462: sipush #-897
/*     */     //   465: iand
/*     */     //   466: istore #12
/*     */     //   468: iload #11
/*     */     //   470: bipush #8
/*     */     //   472: iand
/*     */     //   473: ifeq -> 479
/*     */     //   476: iconst_1
/*     */     //   477: istore #5
/*     */     //   479: iload #11
/*     */     //   481: bipush #16
/*     */     //   483: iand
/*     */     //   484: ifeq -> 529
/*     */     //   487: aconst_null
/*     */     //   488: astore #6
/*     */     //   490: goto -> 529
/*     */     //   493: aload #9
/*     */     //   495: invokeinterface skipToGroupEnd : ()V
/*     */     //   500: iload #11
/*     */     //   502: iconst_2
/*     */     //   503: iand
/*     */     //   504: ifeq -> 514
/*     */     //   507: iload #12
/*     */     //   509: bipush #-113
/*     */     //   511: iand
/*     */     //   512: istore #12
/*     */     //   514: iload #11
/*     */     //   516: iconst_4
/*     */     //   517: iand
/*     */     //   518: ifeq -> 529
/*     */     //   521: iload #12
/*     */     //   523: sipush #-897
/*     */     //   526: iand
/*     */     //   527: istore #12
/*     */     //   529: aload #9
/*     */     //   531: invokeinterface endDefaults : ()V
/*     */     //   536: invokestatic isTraceInProgress : ()Z
/*     */     //   539: ifeq -> 554
/*     */     //   542: ldc_w -2083409256
/*     */     //   545: iload #12
/*     */     //   547: iconst_m1
/*     */     //   548: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.FileChangeChip (FileChange.kt:78)'
/*     */     //   551: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   554: aload #9
/*     */     //   556: ldc_w -756408285
/*     */     //   559: invokeinterface startReplaceGroup : (I)V
/*     */     //   564: aload #9
/*     */     //   566: astore #15
/*     */     //   568: iconst_0
/*     */     //   569: istore #16
/*     */     //   571: nop
/*     */     //   572: iconst_0
/*     */     //   573: istore #17
/*     */     //   575: aload #15
/*     */     //   577: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   582: astore #18
/*     */     //   584: iconst_0
/*     */     //   585: istore #19
/*     */     //   587: aload #18
/*     */     //   589: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   592: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   595: if_acmpne -> 627
/*     */     //   598: iconst_0
/*     */     //   599: istore #20
/*     */     //   601: iconst_0
/*     */     //   602: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   605: aconst_null
/*     */     //   606: iconst_2
/*     */     //   607: aconst_null
/*     */     //   608: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   611: astore #20
/*     */     //   613: aload #15
/*     */     //   615: aload #20
/*     */     //   617: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   622: aload #20
/*     */     //   624: goto -> 629
/*     */     //   627: aload #18
/*     */     //   629: nop
/*     */     //   630: nop
/*     */     //   631: nop
/*     */     //   632: checkcast androidx/compose/runtime/MutableState
/*     */     //   635: astore #14
/*     */     //   637: aload #9
/*     */     //   639: invokeinterface endReplaceGroup : ()V
/*     */     //   644: aload #14
/*     */     //   646: astore #13
/*     */     //   648: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   651: checkcast androidx/compose/ui/Modifier
/*     */     //   654: aload #9
/*     */     //   656: ldc_w -756405935
/*     */     //   659: invokeinterface startReplaceGroup : (I)V
/*     */     //   664: aload #9
/*     */     //   666: astore #15
/*     */     //   668: iconst_0
/*     */     //   669: istore #16
/*     */     //   671: iconst_0
/*     */     //   672: istore #17
/*     */     //   674: aload #15
/*     */     //   676: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   681: astore #18
/*     */     //   683: iconst_0
/*     */     //   684: istore #19
/*     */     //   686: aload #18
/*     */     //   688: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   691: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   694: if_acmpne -> 728
/*     */     //   697: astore #44
/*     */     //   699: iconst_0
/*     */     //   700: istore #20
/*     */     //   702: aload #13
/*     */     //   704: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   709: aload #44
/*     */     //   711: swap
/*     */     //   712: astore #21
/*     */     //   714: aload #15
/*     */     //   716: aload #21
/*     */     //   718: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   723: aload #21
/*     */     //   725: goto -> 730
/*     */     //   728: aload #18
/*     */     //   730: nop
/*     */     //   731: nop
/*     */     //   732: nop
/*     */     //   733: checkcast kotlin/jvm/functions/Function1
/*     */     //   736: astore #14
/*     */     //   738: aload #9
/*     */     //   740: invokeinterface endReplaceGroup : ()V
/*     */     //   745: aload #14
/*     */     //   747: invokestatic onHover : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   750: astore #14
/*     */     //   752: iconst_0
/*     */     //   753: istore #17
/*     */     //   755: nop
/*     */     //   756: iconst_0
/*     */     //   757: istore #18
/*     */     //   759: aload #9
/*     */     //   761: ldc 733328855
/*     */     //   763: ldc 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   765: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   768: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   771: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   774: astore #15
/*     */     //   776: iconst_0
/*     */     //   777: istore #16
/*     */     //   779: aload #15
/*     */     //   781: iload #16
/*     */     //   783: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   786: astore #19
/*     */     //   788: bipush #112
/*     */     //   790: iload #17
/*     */     //   792: iconst_3
/*     */     //   793: ishl
/*     */     //   794: iand
/*     */     //   795: istore #20
/*     */     //   797: nop
/*     */     //   798: iconst_0
/*     */     //   799: istore #21
/*     */     //   801: aload #9
/*     */     //   803: ldc -1323940314
/*     */     //   805: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   807: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   810: aload #9
/*     */     //   812: iconst_0
/*     */     //   813: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   816: istore #22
/*     */     //   818: aload #9
/*     */     //   820: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   825: astore #23
/*     */     //   827: aload #9
/*     */     //   829: aload #14
/*     */     //   831: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   834: astore #24
/*     */     //   836: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   839: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   842: astore #25
/*     */     //   844: bipush #6
/*     */     //   846: sipush #896
/*     */     //   849: iload #20
/*     */     //   851: bipush #6
/*     */     //   853: ishl
/*     */     //   854: iand
/*     */     //   855: ior
/*     */     //   856: istore #26
/*     */     //   858: nop
/*     */     //   859: iconst_0
/*     */     //   860: istore #27
/*     */     //   862: aload #9
/*     */     //   864: ldc -692256719
/*     */     //   866: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   868: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   871: aload #9
/*     */     //   873: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   878: instanceof androidx/compose/runtime/Applier
/*     */     //   881: ifne -> 887
/*     */     //   884: invokestatic invalidApplier : ()V
/*     */     //   887: aload #9
/*     */     //   889: invokeinterface startReusableNode : ()V
/*     */     //   894: aload #9
/*     */     //   896: invokeinterface getInserting : ()Z
/*     */     //   901: ifeq -> 916
/*     */     //   904: aload #9
/*     */     //   906: aload #25
/*     */     //   908: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   913: goto -> 923
/*     */     //   916: aload #9
/*     */     //   918: invokeinterface useNode : ()V
/*     */     //   923: aload #9
/*     */     //   925: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   928: astore #28
/*     */     //   930: iconst_0
/*     */     //   931: istore #29
/*     */     //   933: aload #28
/*     */     //   935: aload #19
/*     */     //   937: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   940: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   943: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   946: aload #28
/*     */     //   948: aload #23
/*     */     //   950: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   953: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   956: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   959: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   962: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   965: astore #30
/*     */     //   967: iconst_0
/*     */     //   968: istore #31
/*     */     //   970: aload #28
/*     */     //   972: astore #32
/*     */     //   974: iconst_0
/*     */     //   975: istore #33
/*     */     //   977: aload #32
/*     */     //   979: invokeinterface getInserting : ()Z
/*     */     //   984: ifne -> 1005
/*     */     //   987: aload #32
/*     */     //   989: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   994: iload #22
/*     */     //   996: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   999: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1002: ifne -> 1031
/*     */     //   1005: aload #32
/*     */     //   1007: iload #22
/*     */     //   1009: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1012: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1017: aload #28
/*     */     //   1019: iload #22
/*     */     //   1021: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1024: aload #30
/*     */     //   1026: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1031: nop
/*     */     //   1032: nop
/*     */     //   1033: nop
/*     */     //   1034: aload #28
/*     */     //   1036: aload #24
/*     */     //   1038: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1041: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1044: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1047: nop
/*     */     //   1048: nop
/*     */     //   1049: aload #9
/*     */     //   1051: bipush #14
/*     */     //   1053: iload #26
/*     */     //   1055: bipush #6
/*     */     //   1057: ishr
/*     */     //   1058: iand
/*     */     //   1059: istore #34
/*     */     //   1061: astore #35
/*     */     //   1063: iconst_0
/*     */     //   1064: istore #36
/*     */     //   1066: aload #35
/*     */     //   1068: ldc -2146769399
/*     */     //   1070: ldc 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   1072: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1075: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   1078: aload #35
/*     */     //   1080: bipush #6
/*     */     //   1082: bipush #112
/*     */     //   1084: iload #17
/*     */     //   1086: bipush #6
/*     */     //   1088: ishr
/*     */     //   1089: iand
/*     */     //   1090: ior
/*     */     //   1091: istore #37
/*     */     //   1093: astore #38
/*     */     //   1095: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   1098: astore #39
/*     */     //   1100: iconst_0
/*     */     //   1101: istore #40
/*     */     //   1103: aload #13
/*     */     //   1105: invokestatic FileChangeChip_K2djEUw$lambda$8 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   1108: ifeq -> 1115
/*     */     //   1111: lload_3
/*     */     //   1112: goto -> 1116
/*     */     //   1115: lload_1
/*     */     //   1116: lstore #41
/*     */     //   1118: aload #13
/*     */     //   1120: invokestatic FileChangeChip_K2djEUw$lambda$8 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   1123: istore #43
/*     */     //   1125: aload_0
/*     */     //   1126: lload #41
/*     */     //   1128: iload #43
/*     */     //   1130: iload #5
/*     */     //   1132: aload #7
/*     */     //   1134: aload #6
/*     */     //   1136: aload #8
/*     */     //   1138: aload #38
/*     */     //   1140: bipush #14
/*     */     //   1142: iload #12
/*     */     //   1144: iand
/*     */     //   1145: sipush #7168
/*     */     //   1148: iload #12
/*     */     //   1150: iand
/*     */     //   1151: ior
/*     */     //   1152: ldc_w 57344
/*     */     //   1155: iload #12
/*     */     //   1157: iconst_3
/*     */     //   1158: ishr
/*     */     //   1159: iand
/*     */     //   1160: ior
/*     */     //   1161: ldc_w 458752
/*     */     //   1164: iload #12
/*     */     //   1166: iconst_3
/*     */     //   1167: ishl
/*     */     //   1168: iand
/*     */     //   1169: ior
/*     */     //   1170: ldc_w 3670016
/*     */     //   1173: iload #12
/*     */     //   1175: iand
/*     */     //   1176: ior
/*     */     //   1177: iconst_0
/*     */     //   1178: invokestatic FileChangeChipPrivate-oC9nPe0 : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;JZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1181: nop
/*     */     //   1182: aload #35
/*     */     //   1184: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1187: aload #9
/*     */     //   1189: invokeinterface endNode : ()V
/*     */     //   1194: aload #9
/*     */     //   1196: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1199: nop
/*     */     //   1200: aload #9
/*     */     //   1202: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1205: nop
/*     */     //   1206: aload #9
/*     */     //   1208: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1211: nop
/*     */     //   1212: invokestatic isTraceInProgress : ()Z
/*     */     //   1215: ifeq -> 1231
/*     */     //   1218: invokestatic traceEventEnd : ()V
/*     */     //   1221: goto -> 1231
/*     */     //   1224: aload #9
/*     */     //   1226: invokeinterface skipToGroupEnd : ()V
/*     */     //   1231: aload #9
/*     */     //   1233: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1238: dup
/*     */     //   1239: ifnull -> 1270
/*     */     //   1242: aload_0
/*     */     //   1243: lload_1
/*     */     //   1244: lload_3
/*     */     //   1245: iload #5
/*     */     //   1247: aload #6
/*     */     //   1249: aload #7
/*     */     //   1251: aload #8
/*     */     //   1253: iload #10
/*     */     //   1255: iload #11
/*     */     //   1257: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;JJZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;II)Lkotlin/jvm/functions/Function2;
/*     */     //   1262: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1267: goto -> 1271
/*     */     //   1270: pop
/*     */     //   1271: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #79	-> 20
/*     */     //   #73	-> 426
/*     */     //   #74	-> 450
/*     */     //   #75	-> 476
/*     */     //   #76	-> 487
/*     */     //   #79	-> 551
/*     */     //   #80	-> 571
/*     */     //   #323	-> 575
/*     */     //   #324	-> 587
/*     */     //   #325	-> 598
/*     */     //   #80	-> 601
/*     */     //   #325	-> 611
/*     */     //   #326	-> 613
/*     */     //   #327	-> 622
/*     */     //   #328	-> 627
/*     */     //   #324	-> 629
/*     */     //   #323	-> 630
/*     */     //   #323	-> 631
/*     */     //   #80	-> 632
/*     */     //   #82	-> 648
/*     */     //   #329	-> 674
/*     */     //   #330	-> 686
/*     */     //   #331	-> 697
/*     */     //   #82	-> 702
/*     */     //   #331	-> 712
/*     */     //   #332	-> 714
/*     */     //   #333	-> 723
/*     */     //   #334	-> 728
/*     */     //   #330	-> 730
/*     */     //   #329	-> 731
/*     */     //   #329	-> 732
/*     */     //   #82	-> 733
/*     */     //   #81	-> 755
/*     */     //   #335	-> 765
/*     */     //   #336	-> 768
/*     */     //   #337	-> 776
/*     */     //   #340	-> 779
/*     */     //   #341	-> 797
/*     */     //   #342	-> 807
/*     */     //   #343	-> 813
/*     */     //   #344	-> 820
/*     */     //   #345	-> 829
/*     */     //   #347	-> 836
/*     */     //   #346	-> 858
/*     */     //   #348	-> 868
/*     */     //   #349	-> 871
/*     */     //   #350	-> 889
/*     */     //   #351	-> 894
/*     */     //   #352	-> 906
/*     */     //   #354	-> 918
/*     */     //   #356	-> 923
/*     */     //   #357	-> 933
/*     */     //   #358	-> 946
/*     */     //   #360	-> 959
/*     */     //   #361	-> 970
/*     */     //   #362	-> 977
/*     */     //   #363	-> 1005
/*     */     //   #364	-> 1017
/*     */     //   #366	-> 1031
/*     */     //   #361	-> 1032
/*     */     //   #366	-> 1033
/*     */     //   #367	-> 1034
/*     */     //   #368	-> 1047
/*     */     //   #356	-> 1048
/*     */     //   #369	-> 1049
/*     */     //   #370	-> 1072
/*     */     //   #86	-> 1103
/*     */     //   #87	-> 1118
/*     */     //   #85	-> 1125
/*     */     //   #86	-> 1126
/*     */     //   #87	-> 1128
/*     */     //   #88	-> 1130
/*     */     //   #89	-> 1132
/*     */     //   #91	-> 1134
/*     */     //   #90	-> 1136
/*     */     //   #84	-> 1178
/*     */     //   #93	-> 1181
/*     */     //   #370	-> 1182
/*     */     //   #369	-> 1187
/*     */     //   #371	-> 1189
/*     */     //   #348	-> 1196
/*     */     //   #372	-> 1199
/*     */     //   #342	-> 1202
/*     */     //   #373	-> 1205
/*     */     //   #335	-> 1208
/*     */     //   #374	-> 1211
/*     */     //   #94	-> 1224
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   601	10	20	$i$a$-cache-FileChangeKt$FileChangeChip$hovered$2	I
/*     */     //   613	11	20	value$iv	Ljava/lang/Object;
/*     */     //   587	43	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   584	46	18	it$iv	Ljava/lang/Object;
/*     */     //   575	57	17	$i$f$cache	I
/*     */     //   572	60	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   572	60	16	invalid$iv	Z
/*     */     //   702	7	20	$i$a$-cache-FileChangeKt$FileChangeChip$1	I
/*     */     //   714	11	21	value$iv	Ljava/lang/Object;
/*     */     //   686	45	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   683	48	18	it$iv	Ljava/lang/Object;
/*     */     //   674	59	17	$i$f$cache	I
/*     */     //   671	62	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   671	62	16	invalid$iv	Z
/*     */     //   1103	79	40	$i$a$-Box-FileChangeKt$FileChangeChip$2	I
/*     */     //   1100	82	39	$this$FileChangeChip_K2djEUw_u24lambda_u2412	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   1100	82	38	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1100	82	37	$changed	I
/*     */     //   1066	121	36	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   1063	124	35	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1063	124	34	$changed$iv	I
/*     */     //   977	55	33	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   974	58	32	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   970	64	31	$i$f$set-impl	I
/*     */     //   967	67	30	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   933	115	29	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   930	118	28	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   862	338	27	$i$f$ReusableComposeNode	I
/*     */     //   859	341	25	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   859	341	26	$changed$iv$iv$iv	I
/*     */     //   801	405	21	$i$f$Layout	I
/*     */     //   818	388	22	compositeKeyHash$iv$iv	I
/*     */     //   827	379	23	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   836	370	24	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   798	408	20	$changed$iv$iv	I
/*     */     //   759	453	18	$i$f$Box	I
/*     */     //   788	424	19	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   756	456	14	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   776	436	15	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   779	433	16	propagateMinConstraints$iv	Z
/*     */     //   756	456	17	$changed$iv	I
/*     */     //   648	573	13	hovered$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   36	1236	12	$dirty	I
/*     */     //   0	1272	0	change	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*     */     //   0	1272	1	backgroundColor	J
/*     */     //   0	1272	3	hoveredBackgroundColor	J
/*     */     //   0	1272	5	showAction	Z
/*     */     //   0	1272	6	onRollBack	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1272	7	onLocate	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1272	8	onShowDiff	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1272	9	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1272	10	$changed	I }
/* 598 */   private static final boolean FileChangeChip_K2djEUw$lambda$8(MutableState $hovered$delegate) { State state = (State)$hovered$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Boolean)state.getValue()).booleanValue(); } private static final void FileChangeChip_K2djEUw$lambda$9(MutableState $hovered$delegate, boolean <set-?>) { MutableState mutableState = $hovered$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 599 */     mutableState.setValue(value$iv); }
/*     */   private static final Unit FileChangeChip_K2djEUw$lambda$11$lambda$10(MutableState<Boolean> $hovered$delegate, boolean it) { FileChangeChip_K2djEUw$lambda$9($hovered$delegate, it); return Unit.INSTANCE; } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") private static final void FileChangeChipPrivate-oC9nPe0(FileChangeView change, long backGroundColor, boolean isHovered, boolean showAction, Function1 onLocate, Function1 onRollBack, Function0 onShowDiff, Composer $composer, int $changed, int paramInt1) { // Byte code:
/*     */     //   0: aload #8
/*     */     //   2: ldc_w 902062858
/*     */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   10: astore #8
/*     */     //   12: iload #9
/*     */     //   14: istore #11
/*     */     //   16: iload #10
/*     */     //   18: iconst_1
/*     */     //   19: iand
/*     */     //   20: ifeq -> 33
/*     */     //   23: iload #11
/*     */     //   25: bipush #6
/*     */     //   27: ior
/*     */     //   28: istore #11
/*     */     //   30: goto -> 62
/*     */     //   33: iload #9
/*     */     //   35: bipush #6
/*     */     //   37: iand
/*     */     //   38: ifne -> 62
/*     */     //   41: iload #11
/*     */     //   43: aload #8
/*     */     //   45: aload_0
/*     */     //   46: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   51: ifeq -> 58
/*     */     //   54: iconst_4
/*     */     //   55: goto -> 59
/*     */     //   58: iconst_2
/*     */     //   59: ior
/*     */     //   60: istore #11
/*     */     //   62: iload #10
/*     */     //   64: iconst_2
/*     */     //   65: iand
/*     */     //   66: ifeq -> 79
/*     */     //   69: iload #11
/*     */     //   71: bipush #48
/*     */     //   73: ior
/*     */     //   74: istore #11
/*     */     //   76: goto -> 110
/*     */     //   79: iload #9
/*     */     //   81: bipush #48
/*     */     //   83: iand
/*     */     //   84: ifne -> 110
/*     */     //   87: iload #11
/*     */     //   89: aload #8
/*     */     //   91: lload_1
/*     */     //   92: invokeinterface changed : (J)Z
/*     */     //   97: ifeq -> 105
/*     */     //   100: bipush #32
/*     */     //   102: goto -> 107
/*     */     //   105: bipush #16
/*     */     //   107: ior
/*     */     //   108: istore #11
/*     */     //   110: iload #10
/*     */     //   112: iconst_4
/*     */     //   113: iand
/*     */     //   114: ifeq -> 128
/*     */     //   117: iload #11
/*     */     //   119: sipush #384
/*     */     //   122: ior
/*     */     //   123: istore #11
/*     */     //   125: goto -> 162
/*     */     //   128: iload #9
/*     */     //   130: sipush #384
/*     */     //   133: iand
/*     */     //   134: ifne -> 162
/*     */     //   137: iload #11
/*     */     //   139: aload #8
/*     */     //   141: iload_3
/*     */     //   142: invokeinterface changed : (Z)Z
/*     */     //   147: ifeq -> 156
/*     */     //   150: sipush #256
/*     */     //   153: goto -> 159
/*     */     //   156: sipush #128
/*     */     //   159: ior
/*     */     //   160: istore #11
/*     */     //   162: iload #10
/*     */     //   164: bipush #8
/*     */     //   166: iand
/*     */     //   167: ifeq -> 181
/*     */     //   170: iload #11
/*     */     //   172: sipush #3072
/*     */     //   175: ior
/*     */     //   176: istore #11
/*     */     //   178: goto -> 216
/*     */     //   181: iload #9
/*     */     //   183: sipush #3072
/*     */     //   186: iand
/*     */     //   187: ifne -> 216
/*     */     //   190: iload #11
/*     */     //   192: aload #8
/*     */     //   194: iload #4
/*     */     //   196: invokeinterface changed : (Z)Z
/*     */     //   201: ifeq -> 210
/*     */     //   204: sipush #2048
/*     */     //   207: goto -> 213
/*     */     //   210: sipush #1024
/*     */     //   213: ior
/*     */     //   214: istore #11
/*     */     //   216: iload #10
/*     */     //   218: bipush #16
/*     */     //   220: iand
/*     */     //   221: ifeq -> 235
/*     */     //   224: iload #11
/*     */     //   226: sipush #24576
/*     */     //   229: ior
/*     */     //   230: istore #11
/*     */     //   232: goto -> 270
/*     */     //   235: iload #9
/*     */     //   237: sipush #24576
/*     */     //   240: iand
/*     */     //   241: ifne -> 270
/*     */     //   244: iload #11
/*     */     //   246: aload #8
/*     */     //   248: aload #5
/*     */     //   250: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   255: ifeq -> 264
/*     */     //   258: sipush #16384
/*     */     //   261: goto -> 267
/*     */     //   264: sipush #8192
/*     */     //   267: ior
/*     */     //   268: istore #11
/*     */     //   270: iload #10
/*     */     //   272: bipush #32
/*     */     //   274: iand
/*     */     //   275: ifeq -> 288
/*     */     //   278: iload #11
/*     */     //   280: ldc 196608
/*     */     //   282: ior
/*     */     //   283: istore #11
/*     */     //   285: goto -> 320
/*     */     //   288: iload #9
/*     */     //   290: ldc 196608
/*     */     //   292: iand
/*     */     //   293: ifne -> 320
/*     */     //   296: iload #11
/*     */     //   298: aload #8
/*     */     //   300: aload #6
/*     */     //   302: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   307: ifeq -> 315
/*     */     //   310: ldc 131072
/*     */     //   312: goto -> 317
/*     */     //   315: ldc 65536
/*     */     //   317: ior
/*     */     //   318: istore #11
/*     */     //   320: iload #10
/*     */     //   322: bipush #64
/*     */     //   324: iand
/*     */     //   325: ifeq -> 339
/*     */     //   328: iload #11
/*     */     //   330: ldc_w 1572864
/*     */     //   333: ior
/*     */     //   334: istore #11
/*     */     //   336: goto -> 374
/*     */     //   339: iload #9
/*     */     //   341: ldc_w 1572864
/*     */     //   344: iand
/*     */     //   345: ifne -> 374
/*     */     //   348: iload #11
/*     */     //   350: aload #8
/*     */     //   352: aload #7
/*     */     //   354: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   359: ifeq -> 368
/*     */     //   362: ldc_w 1048576
/*     */     //   365: goto -> 371
/*     */     //   368: ldc_w 524288
/*     */     //   371: ior
/*     */     //   372: istore #11
/*     */     //   374: iload #11
/*     */     //   376: ldc_w 599187
/*     */     //   379: iand
/*     */     //   380: ldc_w 599186
/*     */     //   383: if_icmpne -> 396
/*     */     //   386: aload #8
/*     */     //   388: invokeinterface getSkipping : ()Z
/*     */     //   393: ifne -> 846
/*     */     //   396: iload #10
/*     */     //   398: bipush #8
/*     */     //   400: iand
/*     */     //   401: ifeq -> 407
/*     */     //   404: iconst_0
/*     */     //   405: istore #4
/*     */     //   407: iload #10
/*     */     //   409: bipush #16
/*     */     //   411: iand
/*     */     //   412: ifeq -> 418
/*     */     //   415: aconst_null
/*     */     //   416: astore #5
/*     */     //   418: iload #10
/*     */     //   420: bipush #32
/*     */     //   422: iand
/*     */     //   423: ifeq -> 429
/*     */     //   426: aconst_null
/*     */     //   427: astore #6
/*     */     //   429: iload #10
/*     */     //   431: bipush #64
/*     */     //   433: iand
/*     */     //   434: ifeq -> 440
/*     */     //   437: aconst_null
/*     */     //   438: astore #7
/*     */     //   440: invokestatic isTraceInProgress : ()Z
/*     */     //   443: ifeq -> 458
/*     */     //   446: ldc_w 902062858
/*     */     //   449: iload #11
/*     */     //   451: iconst_m1
/*     */     //   452: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.FileChangeChipPrivate (FileChange.kt:105)'
/*     */     //   455: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   458: iconst_0
/*     */     //   459: istore #14
/*     */     //   461: nop
/*     */     //   462: iconst_0
/*     */     //   463: istore #15
/*     */     //   465: aload #8
/*     */     //   467: ldc_w 773894976
/*     */     //   470: ldc_w 'CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp'
/*     */     //   473: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   476: aload #8
/*     */     //   478: astore #16
/*     */     //   480: aload #8
/*     */     //   482: ldc_w -954370320
/*     */     //   485: ldc_w 'CC(remember):Effects.kt#9igjgp'
/*     */     //   488: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   491: aload #8
/*     */     //   493: astore #17
/*     */     //   495: iconst_0
/*     */     //   496: istore #18
/*     */     //   498: iconst_0
/*     */     //   499: istore #19
/*     */     //   501: aload #17
/*     */     //   503: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   508: astore #20
/*     */     //   510: iconst_0
/*     */     //   511: istore #21
/*     */     //   513: aload #20
/*     */     //   515: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   518: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   521: if_acmpne -> 568
/*     */     //   524: iconst_0
/*     */     //   525: istore #22
/*     */     //   527: iconst_0
/*     */     //   528: istore #23
/*     */     //   530: getstatic kotlin/coroutines/EmptyCoroutineContext.INSTANCE : Lkotlin/coroutines/EmptyCoroutineContext;
/*     */     //   533: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   536: aload #16
/*     */     //   538: invokestatic createCompositionCoroutineScope : (Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;
/*     */     //   541: astore #33
/*     */     //   543: new androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*     */     //   546: dup
/*     */     //   547: aload #33
/*     */     //   549: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;)V
/*     */     //   552: astore #23
/*     */     //   554: aload #17
/*     */     //   556: aload #23
/*     */     //   558: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   563: aload #23
/*     */     //   565: goto -> 570
/*     */     //   568: aload #20
/*     */     //   570: nop
/*     */     //   571: nop
/*     */     //   572: nop
/*     */     //   573: checkcast androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*     */     //   576: astore #24
/*     */     //   578: aload #8
/*     */     //   580: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   583: aload #24
/*     */     //   585: astore #25
/*     */     //   587: aload #25
/*     */     //   589: invokevirtual getCoroutineScope : ()Lkotlinx/coroutines/CoroutineScope;
/*     */     //   592: astore #24
/*     */     //   594: aload #8
/*     */     //   596: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   599: aload #24
/*     */     //   601: nop
/*     */     //   602: astore #12
/*     */     //   604: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
/*     */     //   607: invokevirtual getUnspecified-0d7_KjU : ()J
/*     */     //   610: lstore #13
/*     */     //   612: iload #4
/*     */     //   614: ifeq -> 636
/*     */     //   617: aload #6
/*     */     //   619: ifnonnull -> 632
/*     */     //   622: aload #5
/*     */     //   624: ifnonnull -> 632
/*     */     //   627: aload #7
/*     */     //   629: ifnull -> 636
/*     */     //   632: iconst_1
/*     */     //   633: goto -> 637
/*     */     //   636: iconst_0
/*     */     //   637: istore #15
/*     */     //   639: aload_0
/*     */     //   640: lload_1
/*     */     //   641: iload_3
/*     */     //   642: lload #13
/*     */     //   644: aload #8
/*     */     //   646: ldc_w -462418838
/*     */     //   649: invokeinterface startReplaceGroup : (I)V
/*     */     //   654: aload #8
/*     */     //   656: astore #17
/*     */     //   658: iload #11
/*     */     //   660: ldc_w 3670016
/*     */     //   663: iand
/*     */     //   664: ldc_w 1048576
/*     */     //   667: if_icmpne -> 674
/*     */     //   670: iconst_1
/*     */     //   671: goto -> 675
/*     */     //   674: iconst_0
/*     */     //   675: istore #18
/*     */     //   677: nop
/*     */     //   678: iconst_0
/*     */     //   679: istore #19
/*     */     //   681: aload #17
/*     */     //   683: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   688: astore #20
/*     */     //   690: iconst_0
/*     */     //   691: istore #21
/*     */     //   693: iload #18
/*     */     //   695: ifne -> 709
/*     */     //   698: aload #20
/*     */     //   700: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   703: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   706: if_acmpne -> 755
/*     */     //   709: lstore #30
/*     */     //   711: istore #29
/*     */     //   713: lstore #27
/*     */     //   715: astore #26
/*     */     //   717: iconst_0
/*     */     //   718: istore #22
/*     */     //   720: aload #7
/*     */     //   722: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;
/*     */     //   727: astore #32
/*     */     //   729: aload #26
/*     */     //   731: lload #27
/*     */     //   733: iload #29
/*     */     //   735: lload #30
/*     */     //   737: aload #32
/*     */     //   739: astore #23
/*     */     //   741: aload #17
/*     */     //   743: aload #23
/*     */     //   745: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   750: aload #23
/*     */     //   752: goto -> 757
/*     */     //   755: aload #20
/*     */     //   757: nop
/*     */     //   758: nop
/*     */     //   759: nop
/*     */     //   760: checkcast kotlin/jvm/functions/Function0
/*     */     //   763: astore #16
/*     */     //   765: aload #8
/*     */     //   767: invokeinterface endReplaceGroup : ()V
/*     */     //   772: aload #16
/*     */     //   774: iload #15
/*     */     //   776: ldc_w -1922590140
/*     */     //   779: iconst_1
/*     */     //   780: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/FileChangeKt$FileChangeChipPrivate$2
/*     */     //   783: dup
/*     */     //   784: aload #6
/*     */     //   786: aload_0
/*     */     //   787: aload #12
/*     */     //   789: aload #5
/*     */     //   791: aload #7
/*     */     //   793: invokespecial <init> : (Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
/*     */     //   796: aload #8
/*     */     //   798: bipush #54
/*     */     //   800: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   803: checkcast kotlin/jvm/functions/Function3
/*     */     //   806: aload #8
/*     */     //   808: ldc_w 1575936
/*     */     //   811: bipush #14
/*     */     //   813: iload #11
/*     */     //   815: iand
/*     */     //   816: ior
/*     */     //   817: bipush #112
/*     */     //   819: iload #11
/*     */     //   821: iand
/*     */     //   822: ior
/*     */     //   823: sipush #896
/*     */     //   826: iload #11
/*     */     //   828: iand
/*     */     //   829: ior
/*     */     //   830: iconst_0
/*     */     //   831: invokestatic FileChangeItem-gg3fqwA : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;JZJLkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   834: invokestatic isTraceInProgress : ()Z
/*     */     //   837: ifeq -> 853
/*     */     //   840: invokestatic traceEventEnd : ()V
/*     */     //   843: goto -> 853
/*     */     //   846: aload #8
/*     */     //   848: invokeinterface skipToGroupEnd : ()V
/*     */     //   853: aload #8
/*     */     //   855: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   860: dup
/*     */     //   861: ifnull -> 892
/*     */     //   864: aload_0
/*     */     //   865: lload_1
/*     */     //   866: iload_3
/*     */     //   867: iload #4
/*     */     //   869: aload #5
/*     */     //   871: aload #6
/*     */     //   873: aload #7
/*     */     //   875: iload #9
/*     */     //   877: iload #10
/*     */     //   879: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;JZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;II)Lkotlin/jvm/functions/Function2;
/*     */     //   884: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   889: goto -> 893
/*     */     //   892: pop
/*     */     //   893: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #106	-> 0
/*     */     //   #102	-> 404
/*     */     //   #103	-> 415
/*     */     //   #104	-> 426
/*     */     //   #105	-> 437
/*     */     //   #106	-> 455
/*     */     //   #107	-> 461
/*     */     //   #375	-> 473
/*     */     //   #376	-> 476
/*     */     //   #378	-> 478
/*     */     //   #379	-> 488
/*     */     //   #380	-> 501
/*     */     //   #381	-> 513
/*     */     //   #382	-> 524
/*     */     //   #383	-> 527
/*     */     //   #384	-> 527
/*     */     //   #385	-> 530
/*     */     //   #384	-> 533
/*     */     //   #383	-> 541
/*     */     //   #382	-> 552
/*     */     //   #386	-> 554
/*     */     //   #387	-> 563
/*     */     //   #388	-> 568
/*     */     //   #381	-> 570
/*     */     //   #380	-> 571
/*     */     //   #380	-> 572
/*     */     //   #379	-> 573
/*     */     //   #389	-> 587
/*     */     //   #375	-> 596
/*     */     //   #389	-> 601
/*     */     //   #107	-> 602
/*     */     //   #112	-> 604
/*     */     //   #113	-> 612
/*     */     //   #109	-> 639
/*     */     //   #111	-> 640
/*     */     //   #110	-> 641
/*     */     //   #112	-> 642
/*     */     //   #114	-> 677
/*     */     //   #390	-> 681
/*     */     //   #391	-> 693
/*     */     //   #392	-> 709
/*     */     //   #114	-> 720
/*     */     //   #392	-> 739
/*     */     //   #393	-> 741
/*     */     //   #394	-> 750
/*     */     //   #395	-> 755
/*     */     //   #391	-> 757
/*     */     //   #390	-> 758
/*     */     //   #390	-> 759
/*     */     //   #114	-> 760
/*     */     //   #113	-> 774
/*     */     //   #115	-> 776
/*     */     //   #108	-> 831
/*     */     //   #139	-> 846
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   530	3	23	$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1	I
/*     */     //   527	25	22	$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv	I
/*     */     //   554	11	23	value$iv$iv	Ljava/lang/Object;
/*     */     //   513	58	21	$i$a$-let-ComposerKt$cache$1$iv$iv	I
/*     */     //   510	61	20	it$iv$iv	Ljava/lang/Object;
/*     */     //   501	72	19	$i$f$cache	I
/*     */     //   498	75	17	$this$cache$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   498	75	18	invalid$iv$iv	Z
/*     */     //   465	137	15	$i$f$rememberCoroutineScope	I
/*     */     //   480	122	16	composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   587	15	25	wrapper$iv	Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
/*     */     //   462	140	14	$changed$iv	I
/*     */     //   720	7	22	$i$a$-cache-FileChangeKt$FileChangeChipPrivate$1	I
/*     */     //   741	11	23	value$iv	Ljava/lang/Object;
/*     */     //   693	65	21	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   690	68	20	it$iv	Ljava/lang/Object;
/*     */     //   681	79	19	$i$f$cache	I
/*     */     //   678	82	17	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   678	82	18	invalid$iv	Z
/*     */     //   604	239	12	coroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   16	878	11	$dirty	I
/*     */     //   0	894	0	change	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*     */     //   0	894	1	backGroundColor	J
/*     */     //   0	894	3	isHovered	Z
/*     */     //   0	894	4	showAction	Z
/*     */     //   0	894	5	onLocate	Lkotlin/jvm/functions/Function1;
/*     */     //   0	894	6	onRollBack	Lkotlin/jvm/functions/Function1;
/*     */     //   0	894	7	onShowDiff	Lkotlin/jvm/functions/Function0;
/*     */     //   0	894	8	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	894	9	$changed	I } private static final Unit FileChangeChipPrivate_oC9nPe0$lambda$15$lambda$14(Function0 $onShowDiff) { if ($onShowDiff != null) $onShowDiff.invoke();  return Unit.INSTANCE; } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nFileChange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileChange.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/FileChangeKt$FileChangeChipPrivate$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,270:1\n1225#2,6:271\n1225#2,6:277\n*S KotlinDebug\n*F\n+ 1 FileChange.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/FileChangeKt$FileChangeChipPrivate$2\n*L\n119#1:271,6\n125#1:277,6\n*E\n"}) static final class FileChangeKt$FileChangeChipPrivate$2 implements Function3<RowScope, Composer, Integer, Unit> {
/*     */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(RowScope $this$FileChangeItem, Composer $composer, int $changed) { // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc '$this$FileChangeItem'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: iload_3
/*     */       //   7: bipush #17
/*     */       //   9: iand
/*     */       //   10: bipush #16
/*     */       //   12: if_icmpne -> 24
/*     */       //   15: aload_2
/*     */       //   16: invokeinterface getSkipping : ()Z
/*     */       //   21: ifne -> 474
/*     */       //   24: invokestatic isTraceInProgress : ()Z
/*     */       //   27: ifeq -> 39
/*     */       //   30: ldc -1922590140
/*     */       //   32: iload_3
/*     */       //   33: iconst_m1
/*     */       //   34: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.FileChangeChipPrivate.<anonymous> (FileChange.kt:115)'
/*     */       //   36: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   39: aload_0
/*     */       //   40: getfield $onRollBack : Lkotlin/jvm/functions/Function1;
/*     */       //   43: ifnull -> 462
/*     */       //   46: aload_0
/*     */       //   47: getfield $change : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*     */       //   50: invokevirtual getName : ()Ljava/lang/String;
/*     */       //   53: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   58: astore #4
/*     */       //   60: getstatic org/jetbrains/jewel/ui/icons/AllIconsKeys$Actions.INSTANCE : Lorg/jetbrains/jewel/ui/icons/AllIconsKeys$Actions;
/*     */       //   63: invokevirtual getRollback : ()Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;
/*     */       //   66: astore #5
/*     */       //   68: aload #4
/*     */       //   70: aload #5
/*     */       //   72: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*     */       //   75: aload_2
/*     */       //   76: ldc 481981803
/*     */       //   78: invokeinterface startReplaceGroup : (I)V
/*     */       //   83: aload_2
/*     */       //   84: astore #7
/*     */       //   86: aload_2
/*     */       //   87: aload_0
/*     */       //   88: getfield $coroutineScope : Lkotlinx/coroutines/CoroutineScope;
/*     */       //   91: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   96: aload_2
/*     */       //   97: aload_0
/*     */       //   98: getfield $onRollBack : Lkotlin/jvm/functions/Function1;
/*     */       //   101: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   106: ior
/*     */       //   107: istore #8
/*     */       //   109: aload_0
/*     */       //   110: getfield $coroutineScope : Lkotlinx/coroutines/CoroutineScope;
/*     */       //   113: astore #9
/*     */       //   115: aload_0
/*     */       //   116: getfield $onRollBack : Lkotlin/jvm/functions/Function1;
/*     */       //   119: astore #10
/*     */       //   121: iconst_0
/*     */       //   122: istore #11
/*     */       //   124: aload #7
/*     */       //   126: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   131: astore #12
/*     */       //   133: iconst_0
/*     */       //   134: istore #13
/*     */       //   136: iload #8
/*     */       //   138: ifne -> 152
/*     */       //   141: aload #12
/*     */       //   143: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   146: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   149: if_acmpne -> 192
/*     */       //   152: astore #17
/*     */       //   154: astore #16
/*     */       //   156: iconst_0
/*     */       //   157: istore #14
/*     */       //   159: aload #9
/*     */       //   161: aload #10
/*     */       //   163: <illegal opcode> invoke : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
/*     */       //   168: astore #18
/*     */       //   170: aload #16
/*     */       //   172: aload #17
/*     */       //   174: aload #18
/*     */       //   176: astore #15
/*     */       //   178: aload #7
/*     */       //   180: aload #15
/*     */       //   182: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   187: aload #15
/*     */       //   189: goto -> 194
/*     */       //   192: aload #12
/*     */       //   194: nop
/*     */       //   195: nop
/*     */       //   196: nop
/*     */       //   197: checkcast kotlin/jvm/functions/Function0
/*     */       //   200: astore #6
/*     */       //   202: aload_2
/*     */       //   203: invokeinterface endReplaceGroup : ()V
/*     */       //   208: aload #6
/*     */       //   210: aload_2
/*     */       //   211: getstatic org/jetbrains/jewel/ui/icon/IntelliJIconKey.$stable : I
/*     */       //   214: iconst_3
/*     */       //   215: ishl
/*     */       //   216: invokestatic IconButtonWithTextTooltip : (Ljava/lang/String;Lorg/jetbrains/jewel/ui/icon/IconKey;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
/*     */       //   219: aload_2
/*     */       //   220: ldc 481985600
/*     */       //   222: invokeinterface startReplaceGroup : (I)V
/*     */       //   227: aload_0
/*     */       //   228: getfield $onLocate : Lkotlin/jvm/functions/Function1;
/*     */       //   231: ifnull -> 407
/*     */       //   234: aload_0
/*     */       //   235: getfield $change : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*     */       //   238: invokevirtual getName : ()Ljava/lang/String;
/*     */       //   241: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   246: astore #4
/*     */       //   248: getstatic org/jetbrains/jewel/ui/icons/AllIconsKeys$General.INSTANCE : Lorg/jetbrains/jewel/ui/icons/AllIconsKeys$General;
/*     */       //   251: invokevirtual getLocate : ()Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;
/*     */       //   254: astore #5
/*     */       //   256: aload #4
/*     */       //   258: aload #5
/*     */       //   260: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*     */       //   263: aload_2
/*     */       //   264: ldc 481989929
/*     */       //   266: invokeinterface startReplaceGroup : (I)V
/*     */       //   271: aload_2
/*     */       //   272: astore #7
/*     */       //   274: aload_2
/*     */       //   275: aload_0
/*     */       //   276: getfield $coroutineScope : Lkotlinx/coroutines/CoroutineScope;
/*     */       //   279: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   284: aload_2
/*     */       //   285: aload_0
/*     */       //   286: getfield $onLocate : Lkotlin/jvm/functions/Function1;
/*     */       //   289: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   294: ior
/*     */       //   295: istore #8
/*     */       //   297: aload_0
/*     */       //   298: getfield $coroutineScope : Lkotlinx/coroutines/CoroutineScope;
/*     */       //   301: astore #9
/*     */       //   303: aload_0
/*     */       //   304: getfield $onLocate : Lkotlin/jvm/functions/Function1;
/*     */       //   307: astore #10
/*     */       //   309: iconst_0
/*     */       //   310: istore #11
/*     */       //   312: aload #7
/*     */       //   314: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   319: astore #12
/*     */       //   321: iconst_0
/*     */       //   322: istore #13
/*     */       //   324: iload #8
/*     */       //   326: ifne -> 340
/*     */       //   329: aload #12
/*     */       //   331: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   334: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   337: if_acmpne -> 380
/*     */       //   340: astore #17
/*     */       //   342: astore #16
/*     */       //   344: iconst_0
/*     */       //   345: istore #14
/*     */       //   347: aload #9
/*     */       //   349: aload #10
/*     */       //   351: <illegal opcode> invoke : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
/*     */       //   356: astore #18
/*     */       //   358: aload #16
/*     */       //   360: aload #17
/*     */       //   362: aload #18
/*     */       //   364: astore #15
/*     */       //   366: aload #7
/*     */       //   368: aload #15
/*     */       //   370: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   375: aload #15
/*     */       //   377: goto -> 382
/*     */       //   380: aload #12
/*     */       //   382: nop
/*     */       //   383: nop
/*     */       //   384: nop
/*     */       //   385: checkcast kotlin/jvm/functions/Function0
/*     */       //   388: astore #6
/*     */       //   390: aload_2
/*     */       //   391: invokeinterface endReplaceGroup : ()V
/*     */       //   396: aload #6
/*     */       //   398: aload_2
/*     */       //   399: getstatic org/jetbrains/jewel/ui/icon/IntelliJIconKey.$stable : I
/*     */       //   402: iconst_3
/*     */       //   403: ishl
/*     */       //   404: invokestatic IconButtonWithTextTooltip : (Ljava/lang/String;Lorg/jetbrains/jewel/ui/icon/IconKey;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
/*     */       //   407: aload_2
/*     */       //   408: invokeinterface endReplaceGroup : ()V
/*     */       //   413: aload_0
/*     */       //   414: getfield $onShowDiff : Lkotlin/jvm/functions/Function0;
/*     */       //   417: ifnull -> 462
/*     */       //   420: aload_0
/*     */       //   421: getfield $change : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*     */       //   424: invokevirtual getName : ()Ljava/lang/String;
/*     */       //   427: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   432: astore #4
/*     */       //   434: getstatic org/jetbrains/jewel/ui/icons/AllIconsKeys$Actions.INSTANCE : Lorg/jetbrains/jewel/ui/icons/AllIconsKeys$Actions;
/*     */       //   437: invokevirtual getDiff : ()Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;
/*     */       //   440: astore #5
/*     */       //   442: aload #4
/*     */       //   444: aload #5
/*     */       //   446: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*     */       //   449: aload_0
/*     */       //   450: getfield $onShowDiff : Lkotlin/jvm/functions/Function0;
/*     */       //   453: aload_2
/*     */       //   454: getstatic org/jetbrains/jewel/ui/icon/IntelliJIconKey.$stable : I
/*     */       //   457: iconst_3
/*     */       //   458: ishl
/*     */       //   459: invokestatic IconButtonWithTextTooltip : (Ljava/lang/String;Lorg/jetbrains/jewel/ui/icon/IconKey;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
/*     */       //   462: invokestatic isTraceInProgress : ()Z
/*     */       //   465: ifeq -> 480
/*     */       //   468: invokestatic traceEventEnd : ()V
/*     */       //   471: goto -> 480
/*     */       //   474: aload_2
/*     */       //   475: invokeinterface skipToGroupEnd : ()V
/*     */       //   480: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #116	-> 6
/*     */       //   #118	-> 46
/*     */       //   #120	-> 60
/*     */       //   #118	-> 68
/*     */       //   #120	-> 70
/*     */       //   #119	-> 109
/*     */       //   #271	-> 124
/*     */       //   #272	-> 136
/*     */       //   #273	-> 152
/*     */       //   #119	-> 159
/*     */       //   #273	-> 176
/*     */       //   #274	-> 178
/*     */       //   #275	-> 187
/*     */       //   #276	-> 192
/*     */       //   #272	-> 194
/*     */       //   #271	-> 195
/*     */       //   #271	-> 196
/*     */       //   #119	-> 197
/*     */       //   #117	-> 216
/*     */       //   #122	-> 227
/*     */       //   #124	-> 234
/*     */       //   #126	-> 248
/*     */       //   #124	-> 256
/*     */       //   #126	-> 258
/*     */       //   #125	-> 297
/*     */       //   #277	-> 312
/*     */       //   #278	-> 324
/*     */       //   #279	-> 340
/*     */       //   #125	-> 347
/*     */       //   #279	-> 364
/*     */       //   #280	-> 366
/*     */       //   #281	-> 375
/*     */       //   #282	-> 380
/*     */       //   #278	-> 382
/*     */       //   #277	-> 383
/*     */       //   #277	-> 384
/*     */       //   #125	-> 385
/*     */       //   #123	-> 404
/*     */       //   #129	-> 413
/*     */       //   #131	-> 420
/*     */       //   #133	-> 434
/*     */       //   #131	-> 442
/*     */       //   #133	-> 444
/*     */       //   #132	-> 449
/*     */       //   #130	-> 459
/*     */       //   #136	-> 474
/*     */       //   #137	-> 480
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   159	9	14	$i$a$-cache-FileChangeKt$FileChangeChipPrivate$2$1	I
/*     */       //   178	11	15	value$iv	Ljava/lang/Object;
/*     */       //   136	59	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   133	62	12	it$iv	Ljava/lang/Object;
/*     */       //   124	73	11	$i$f$cache	I
/*     */       //   121	76	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   121	76	8	invalid$iv	Z
/*     */       //   347	9	14	$i$a$-cache-FileChangeKt$FileChangeChipPrivate$2$2	I
/*     */       //   366	11	15	value$iv	Ljava/lang/Object;
/*     */       //   324	59	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   321	62	12	it$iv	Ljava/lang/Object;
/*     */       //   312	73	11	$i$f$cache	I
/*     */       //   309	76	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   309	76	8	invalid$iv	Z
/*     */       //   0	481	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/FileChangeKt$FileChangeChipPrivate$2;
/*     */       //   0	481	1	$this$FileChangeItem	Landroidx/compose/foundation/layout/RowScope;
/*     */       //   0	481	2	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	481	3	$changed	I } private static final Unit invoke$lambda$1$lambda$0(CoroutineScope $coroutineScope, Function1<? super Continuation<? super Unit>, ? extends Object> $onRollBack) { BuildersKt.launch$default($coroutineScope, null, null, new FileChangeKt$FileChangeChipPrivate$2$1$1$1($onRollBack, null), 3, null); return Unit.INSTANCE; } private static final Unit invoke$lambda$3$lambda$2(CoroutineScope $coroutineScope, Function1<? super Continuation<? super Unit>, ? extends Object> $onLocate) { BuildersKt.launch$default($coroutineScope, null, null, new FileChangeKt$FileChangeChipPrivate$2$2$1$1($onLocate, null), 3, null); return Unit.INSTANCE; } FileChangeKt$FileChangeChipPrivate$2(Function1<Continuation<? super Unit>, Object> $onRollBack, FileChangeView $change, CoroutineScope $coroutineScope, Function1<Continuation<? super Unit>, Object> $onLocate, Function0<Unit> $onShowDiff) {} } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") private static final void NewFileChip-oC9nPe0(FileChangeView change, long background, boolean isHovered, boolean isCommitted, Function1<? super Continuation<? super Unit>, ? extends Object> onJumpToSource, Function1<? super Continuation<? super Unit>, ? extends Object> onCommitAction, Function0<Unit> onShowDiff, boolean isProjectOnVCS, Composer $composer, int $changed) { // Byte code:
/*     */     //   0: aload #9
/*     */     //   2: ldc_w 811445035
/*     */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   10: astore #9
/*     */     //   12: iload #10
/*     */     //   14: istore #11
/*     */     //   16: iload #10
/*     */     //   18: bipush #6
/*     */     //   20: iand
/*     */     //   21: ifne -> 45
/*     */     //   24: iload #11
/*     */     //   26: aload #9
/*     */     //   28: aload_0
/*     */     //   29: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   34: ifeq -> 41
/*     */     //   37: iconst_4
/*     */     //   38: goto -> 42
/*     */     //   41: iconst_2
/*     */     //   42: ior
/*     */     //   43: istore #11
/*     */     //   45: iload #10
/*     */     //   47: bipush #48
/*     */     //   49: iand
/*     */     //   50: ifne -> 76
/*     */     //   53: iload #11
/*     */     //   55: aload #9
/*     */     //   57: lload_1
/*     */     //   58: invokeinterface changed : (J)Z
/*     */     //   63: ifeq -> 71
/*     */     //   66: bipush #32
/*     */     //   68: goto -> 73
/*     */     //   71: bipush #16
/*     */     //   73: ior
/*     */     //   74: istore #11
/*     */     //   76: iload #10
/*     */     //   78: sipush #384
/*     */     //   81: iand
/*     */     //   82: ifne -> 110
/*     */     //   85: iload #11
/*     */     //   87: aload #9
/*     */     //   89: iload_3
/*     */     //   90: invokeinterface changed : (Z)Z
/*     */     //   95: ifeq -> 104
/*     */     //   98: sipush #256
/*     */     //   101: goto -> 107
/*     */     //   104: sipush #128
/*     */     //   107: ior
/*     */     //   108: istore #11
/*     */     //   110: iload #10
/*     */     //   112: sipush #3072
/*     */     //   115: iand
/*     */     //   116: ifne -> 145
/*     */     //   119: iload #11
/*     */     //   121: aload #9
/*     */     //   123: iload #4
/*     */     //   125: invokeinterface changed : (Z)Z
/*     */     //   130: ifeq -> 139
/*     */     //   133: sipush #2048
/*     */     //   136: goto -> 142
/*     */     //   139: sipush #1024
/*     */     //   142: ior
/*     */     //   143: istore #11
/*     */     //   145: iload #10
/*     */     //   147: sipush #24576
/*     */     //   150: iand
/*     */     //   151: ifne -> 180
/*     */     //   154: iload #11
/*     */     //   156: aload #9
/*     */     //   158: aload #5
/*     */     //   160: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   165: ifeq -> 174
/*     */     //   168: sipush #16384
/*     */     //   171: goto -> 177
/*     */     //   174: sipush #8192
/*     */     //   177: ior
/*     */     //   178: istore #11
/*     */     //   180: iload #10
/*     */     //   182: ldc 196608
/*     */     //   184: iand
/*     */     //   185: ifne -> 212
/*     */     //   188: iload #11
/*     */     //   190: aload #9
/*     */     //   192: aload #6
/*     */     //   194: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   199: ifeq -> 207
/*     */     //   202: ldc 131072
/*     */     //   204: goto -> 209
/*     */     //   207: ldc 65536
/*     */     //   209: ior
/*     */     //   210: istore #11
/*     */     //   212: iload #10
/*     */     //   214: ldc_w 1572864
/*     */     //   217: iand
/*     */     //   218: ifne -> 247
/*     */     //   221: iload #11
/*     */     //   223: aload #9
/*     */     //   225: aload #7
/*     */     //   227: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   232: ifeq -> 241
/*     */     //   235: ldc_w 1048576
/*     */     //   238: goto -> 244
/*     */     //   241: ldc_w 524288
/*     */     //   244: ior
/*     */     //   245: istore #11
/*     */     //   247: iload #10
/*     */     //   249: ldc_w 12582912
/*     */     //   252: iand
/*     */     //   253: ifne -> 282
/*     */     //   256: iload #11
/*     */     //   258: aload #9
/*     */     //   260: iload #8
/*     */     //   262: invokeinterface changed : (Z)Z
/*     */     //   267: ifeq -> 276
/*     */     //   270: ldc_w 8388608
/*     */     //   273: goto -> 279
/*     */     //   276: ldc_w 4194304
/*     */     //   279: ior
/*     */     //   280: istore #11
/*     */     //   282: iload #11
/*     */     //   284: ldc_w 4793491
/*     */     //   287: iand
/*     */     //   288: ldc_w 4793490
/*     */     //   291: if_icmpne -> 304
/*     */     //   294: aload #9
/*     */     //   296: invokeinterface getSkipping : ()Z
/*     */     //   301: ifne -> 608
/*     */     //   304: invokestatic isTraceInProgress : ()Z
/*     */     //   307: ifeq -> 322
/*     */     //   310: ldc_w 811445035
/*     */     //   313: iload #11
/*     */     //   315: iconst_m1
/*     */     //   316: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.NewFileChip (FileChange.kt:151)'
/*     */     //   319: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   322: iconst_0
/*     */     //   323: istore #14
/*     */     //   325: nop
/*     */     //   326: iconst_0
/*     */     //   327: istore #15
/*     */     //   329: aload #9
/*     */     //   331: ldc_w 773894976
/*     */     //   334: ldc_w 'CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp'
/*     */     //   337: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   340: aload #9
/*     */     //   342: astore #16
/*     */     //   344: aload #9
/*     */     //   346: ldc_w -954370320
/*     */     //   349: ldc_w 'CC(remember):Effects.kt#9igjgp'
/*     */     //   352: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   355: aload #9
/*     */     //   357: astore #17
/*     */     //   359: iconst_0
/*     */     //   360: istore #18
/*     */     //   362: iconst_0
/*     */     //   363: istore #19
/*     */     //   365: aload #17
/*     */     //   367: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   372: astore #20
/*     */     //   374: iconst_0
/*     */     //   375: istore #21
/*     */     //   377: aload #20
/*     */     //   379: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   382: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   385: if_acmpne -> 432
/*     */     //   388: iconst_0
/*     */     //   389: istore #22
/*     */     //   391: iconst_0
/*     */     //   392: istore #23
/*     */     //   394: getstatic kotlin/coroutines/EmptyCoroutineContext.INSTANCE : Lkotlin/coroutines/EmptyCoroutineContext;
/*     */     //   397: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   400: aload #16
/*     */     //   402: invokestatic createCompositionCoroutineScope : (Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;
/*     */     //   405: astore #26
/*     */     //   407: new androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*     */     //   410: dup
/*     */     //   411: aload #26
/*     */     //   413: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;)V
/*     */     //   416: astore #23
/*     */     //   418: aload #17
/*     */     //   420: aload #23
/*     */     //   422: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   427: aload #23
/*     */     //   429: goto -> 434
/*     */     //   432: aload #20
/*     */     //   434: nop
/*     */     //   435: nop
/*     */     //   436: nop
/*     */     //   437: checkcast androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*     */     //   440: astore #24
/*     */     //   442: aload #9
/*     */     //   444: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   447: aload #24
/*     */     //   449: astore #25
/*     */     //   451: aload #25
/*     */     //   453: invokevirtual getCoroutineScope : ()Lkotlinx/coroutines/CoroutineScope;
/*     */     //   456: astore #24
/*     */     //   458: aload #9
/*     */     //   460: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   463: aload #24
/*     */     //   465: nop
/*     */     //   466: astore #12
/*     */     //   468: aload_0
/*     */     //   469: lload_1
/*     */     //   470: iload_3
/*     */     //   471: aload #9
/*     */     //   473: ldc_w -1343897814
/*     */     //   476: invokeinterface startReplaceGroup : (I)V
/*     */     //   481: iload #4
/*     */     //   483: ifeq -> 505
/*     */     //   486: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   489: aload #9
/*     */     //   491: bipush #6
/*     */     //   493: invokestatic getLinkStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;
/*     */     //   496: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/LinkColors;
/*     */     //   499: invokevirtual getContent-0d7_KjU : ()J
/*     */     //   502: goto -> 511
/*     */     //   505: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
/*     */     //   508: invokevirtual getUnspecified-0d7_KjU : ()J
/*     */     //   511: lstore #13
/*     */     //   513: aload #9
/*     */     //   515: invokeinterface endReplaceGroup : ()V
/*     */     //   520: lload #13
/*     */     //   522: aload #7
/*     */     //   524: iconst_0
/*     */     //   525: ldc_w -431899
/*     */     //   528: iconst_1
/*     */     //   529: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/FileChangeKt$NewFileChip$1
/*     */     //   532: dup
/*     */     //   533: aload_0
/*     */     //   534: aload #12
/*     */     //   536: aload #5
/*     */     //   538: iload #8
/*     */     //   540: iload #4
/*     */     //   542: aload #6
/*     */     //   544: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function1;)V
/*     */     //   547: aload #9
/*     */     //   549: bipush #54
/*     */     //   551: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   554: checkcast kotlin/jvm/functions/Function3
/*     */     //   557: aload #9
/*     */     //   559: ldc_w 1572864
/*     */     //   562: bipush #14
/*     */     //   564: iload #11
/*     */     //   566: iand
/*     */     //   567: ior
/*     */     //   568: bipush #112
/*     */     //   570: iload #11
/*     */     //   572: iand
/*     */     //   573: ior
/*     */     //   574: sipush #896
/*     */     //   577: iload #11
/*     */     //   579: iand
/*     */     //   580: ior
/*     */     //   581: ldc_w 57344
/*     */     //   584: iload #11
/*     */     //   586: bipush #6
/*     */     //   588: ishr
/*     */     //   589: iand
/*     */     //   590: ior
/*     */     //   591: bipush #32
/*     */     //   593: invokestatic FileChangeItem-gg3fqwA : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;JZJLkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   596: invokestatic isTraceInProgress : ()Z
/*     */     //   599: ifeq -> 615
/*     */     //   602: invokestatic traceEventEnd : ()V
/*     */     //   605: goto -> 615
/*     */     //   608: aload #9
/*     */     //   610: invokeinterface skipToGroupEnd : ()V
/*     */     //   615: aload #9
/*     */     //   617: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   622: dup
/*     */     //   623: ifnull -> 654
/*     */     //   626: aload_0
/*     */     //   627: lload_1
/*     */     //   628: iload_3
/*     */     //   629: iload #4
/*     */     //   631: aload #5
/*     */     //   633: aload #6
/*     */     //   635: aload #7
/*     */     //   637: iload #8
/*     */     //   639: iload #10
/*     */     //   641: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;JZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZI)Lkotlin/jvm/functions/Function2;
/*     */     //   646: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   651: goto -> 655
/*     */     //   654: pop
/*     */     //   655: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #152	-> 0
/*     */     //   #153	-> 325
/*     */     //   #396	-> 337
/*     */     //   #397	-> 340
/*     */     //   #399	-> 342
/*     */     //   #400	-> 352
/*     */     //   #401	-> 365
/*     */     //   #402	-> 377
/*     */     //   #403	-> 388
/*     */     //   #404	-> 391
/*     */     //   #405	-> 391
/*     */     //   #406	-> 394
/*     */     //   #405	-> 397
/*     */     //   #404	-> 405
/*     */     //   #403	-> 416
/*     */     //   #407	-> 418
/*     */     //   #408	-> 427
/*     */     //   #409	-> 432
/*     */     //   #402	-> 434
/*     */     //   #401	-> 435
/*     */     //   #401	-> 436
/*     */     //   #400	-> 437
/*     */     //   #410	-> 451
/*     */     //   #396	-> 460
/*     */     //   #410	-> 465
/*     */     //   #153	-> 466
/*     */     //   #155	-> 468
/*     */     //   #156	-> 469
/*     */     //   #157	-> 470
/*     */     //   #159	-> 481
/*     */     //   #160	-> 522
/*     */     //   #161	-> 525
/*     */     //   #154	-> 593
/*     */     //   #177	-> 608
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   394	3	23	$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1	I
/*     */     //   391	25	22	$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv	I
/*     */     //   418	11	23	value$iv$iv	Ljava/lang/Object;
/*     */     //   377	58	21	$i$a$-let-ComposerKt$cache$1$iv$iv	I
/*     */     //   374	61	20	it$iv$iv	Ljava/lang/Object;
/*     */     //   365	72	19	$i$f$cache	I
/*     */     //   362	75	17	$this$cache$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   362	75	18	invalid$iv$iv	Z
/*     */     //   329	137	15	$i$f$rememberCoroutineScope	I
/*     */     //   344	122	16	composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   451	15	25	wrapper$iv	Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
/*     */     //   326	140	14	$changed$iv	I
/*     */     //   468	137	12	coroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   16	640	11	$dirty	I
/*     */     //   0	656	0	change	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*     */     //   0	656	1	background	J
/*     */     //   0	656	3	isHovered	Z
/*     */     //   0	656	4	isCommitted	Z
/*     */     //   0	656	5	onJumpToSource	Lkotlin/jvm/functions/Function1;
/*     */     //   0	656	6	onCommitAction	Lkotlin/jvm/functions/Function1;
/*     */     //   0	656	7	onShowDiff	Lkotlin/jvm/functions/Function0;
/*     */     //   0	656	8	isProjectOnVCS	Z
/*     */     //   0	656	9	$composer	Landroidx/compose/runtime/Composer;
/* 601 */     //   0	656	10	$changed	I } private static final boolean FileChangeItem_gg3fqwA$lambda$20(MutableState $overflow$delegate) { State state = (State)$overflow$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Boolean)state.getValue()).booleanValue(); } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nFileChange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileChange.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/FileChangeKt$NewFileChip$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,270:1\n1225#2,6:271\n1225#2,6:277\n*S KotlinDebug\n*F\n+ 1 FileChange.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/FileChangeKt$NewFileChip$1\n*L\n164#1:271,6\n171#1:277,6\n*E\n"}) static final class FileChangeKt$NewFileChip$1 implements Function3<RowScope, Composer, Integer, Unit> {
/*     */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(RowScope $this$FileChangeItem, Composer $composer, int $changed) { // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc '$this$FileChangeItem'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: iload_3
/*     */       //   7: bipush #17
/*     */       //   9: iand
/*     */       //   10: bipush #16
/*     */       //   12: if_icmpne -> 24
/*     */       //   15: aload_2
/*     */       //   16: invokeinterface getSkipping : ()Z
/*     */       //   21: ifne -> 413
/*     */       //   24: invokestatic isTraceInProgress : ()Z
/*     */       //   27: ifeq -> 39
/*     */       //   30: ldc -431899
/*     */       //   32: iload_3
/*     */       //   33: iconst_m1
/*     */       //   34: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.NewFileChip.<anonymous> (FileChange.kt:161)'
/*     */       //   36: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   39: aload_0
/*     */       //   40: getfield $change : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*     */       //   43: invokevirtual getName : ()Ljava/lang/String;
/*     */       //   46: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   51: astore #4
/*     */       //   53: getstatic org/jetbrains/jewel/ui/icons/AllIconsKeys$General.INSTANCE : Lorg/jetbrains/jewel/ui/icons/AllIconsKeys$General;
/*     */       //   56: invokevirtual getLocate : ()Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;
/*     */       //   59: astore #5
/*     */       //   61: aload #4
/*     */       //   63: aload #5
/*     */       //   65: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*     */       //   68: aload_2
/*     */       //   69: ldc -2079599334
/*     */       //   71: invokeinterface startReplaceGroup : (I)V
/*     */       //   76: aload_2
/*     */       //   77: astore #7
/*     */       //   79: aload_2
/*     */       //   80: aload_0
/*     */       //   81: getfield $coroutineScope : Lkotlinx/coroutines/CoroutineScope;
/*     */       //   84: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   89: aload_2
/*     */       //   90: aload_0
/*     */       //   91: getfield $onJumpToSource : Lkotlin/jvm/functions/Function1;
/*     */       //   94: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   99: ior
/*     */       //   100: istore #8
/*     */       //   102: aload_0
/*     */       //   103: getfield $coroutineScope : Lkotlinx/coroutines/CoroutineScope;
/*     */       //   106: astore #9
/*     */       //   108: aload_0
/*     */       //   109: getfield $onJumpToSource : Lkotlin/jvm/functions/Function1;
/*     */       //   112: astore #10
/*     */       //   114: iconst_0
/*     */       //   115: istore #11
/*     */       //   117: aload #7
/*     */       //   119: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   124: astore #12
/*     */       //   126: iconst_0
/*     */       //   127: istore #13
/*     */       //   129: iload #8
/*     */       //   131: ifne -> 145
/*     */       //   134: aload #12
/*     */       //   136: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   139: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   142: if_acmpne -> 185
/*     */       //   145: astore #17
/*     */       //   147: astore #16
/*     */       //   149: iconst_0
/*     */       //   150: istore #14
/*     */       //   152: aload #9
/*     */       //   154: aload #10
/*     */       //   156: <illegal opcode> invoke : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
/*     */       //   161: astore #18
/*     */       //   163: aload #16
/*     */       //   165: aload #17
/*     */       //   167: aload #18
/*     */       //   169: astore #15
/*     */       //   171: aload #7
/*     */       //   173: aload #15
/*     */       //   175: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   180: aload #15
/*     */       //   182: goto -> 187
/*     */       //   185: aload #12
/*     */       //   187: nop
/*     */       //   188: nop
/*     */       //   189: nop
/*     */       //   190: checkcast kotlin/jvm/functions/Function0
/*     */       //   193: astore #6
/*     */       //   195: aload_2
/*     */       //   196: invokeinterface endReplaceGroup : ()V
/*     */       //   201: aload #6
/*     */       //   203: aload_2
/*     */       //   204: getstatic org/jetbrains/jewel/ui/icon/IntelliJIconKey.$stable : I
/*     */       //   207: iconst_3
/*     */       //   208: ishl
/*     */       //   209: invokestatic IconButtonWithTextTooltip : (Ljava/lang/String;Lorg/jetbrains/jewel/ui/icon/IconKey;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
/*     */       //   212: aload_0
/*     */       //   213: getfield $isProjectOnVCS : Z
/*     */       //   216: ifeq -> 401
/*     */       //   219: aload_0
/*     */       //   220: getfield $isCommitted : Z
/*     */       //   223: ifne -> 401
/*     */       //   226: aload_0
/*     */       //   227: getfield $change : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*     */       //   230: invokevirtual getName : ()Ljava/lang/String;
/*     */       //   233: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   238: astore #4
/*     */       //   240: aload_2
/*     */       //   241: iconst_0
/*     */       //   242: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */       //   245: invokevirtual getAddToVcs : ()Lorg/jetbrains/jewel/ui/icon/PathIconKey;
/*     */       //   248: astore #5
/*     */       //   250: aload #4
/*     */       //   252: aload #5
/*     */       //   254: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*     */       //   257: aload_2
/*     */       //   258: ldc -2079592788
/*     */       //   260: invokeinterface startReplaceGroup : (I)V
/*     */       //   265: aload_2
/*     */       //   266: astore #7
/*     */       //   268: aload_2
/*     */       //   269: aload_0
/*     */       //   270: getfield $coroutineScope : Lkotlinx/coroutines/CoroutineScope;
/*     */       //   273: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   278: aload_2
/*     */       //   279: aload_0
/*     */       //   280: getfield $onCommitAction : Lkotlin/jvm/functions/Function1;
/*     */       //   283: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   288: ior
/*     */       //   289: istore #8
/*     */       //   291: aload_0
/*     */       //   292: getfield $coroutineScope : Lkotlinx/coroutines/CoroutineScope;
/*     */       //   295: astore #9
/*     */       //   297: aload_0
/*     */       //   298: getfield $onCommitAction : Lkotlin/jvm/functions/Function1;
/*     */       //   301: astore #10
/*     */       //   303: iconst_0
/*     */       //   304: istore #11
/*     */       //   306: aload #7
/*     */       //   308: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   313: astore #12
/*     */       //   315: iconst_0
/*     */       //   316: istore #13
/*     */       //   318: iload #8
/*     */       //   320: ifne -> 334
/*     */       //   323: aload #12
/*     */       //   325: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   328: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   331: if_acmpne -> 374
/*     */       //   334: astore #17
/*     */       //   336: astore #16
/*     */       //   338: iconst_0
/*     */       //   339: istore #14
/*     */       //   341: aload #9
/*     */       //   343: aload #10
/*     */       //   345: <illegal opcode> invoke : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
/*     */       //   350: astore #18
/*     */       //   352: aload #16
/*     */       //   354: aload #17
/*     */       //   356: aload #18
/*     */       //   358: astore #15
/*     */       //   360: aload #7
/*     */       //   362: aload #15
/*     */       //   364: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   369: aload #15
/*     */       //   371: goto -> 376
/*     */       //   374: aload #12
/*     */       //   376: nop
/*     */       //   377: nop
/*     */       //   378: nop
/*     */       //   379: checkcast kotlin/jvm/functions/Function0
/*     */       //   382: astore #6
/*     */       //   384: aload_2
/*     */       //   385: invokeinterface endReplaceGroup : ()V
/*     */       //   390: aload #6
/*     */       //   392: aload_2
/*     */       //   393: getstatic org/jetbrains/jewel/ui/icon/PathIconKey.$stable : I
/*     */       //   396: iconst_3
/*     */       //   397: ishl
/*     */       //   398: invokestatic IconButtonWithTextTooltip : (Ljava/lang/String;Lorg/jetbrains/jewel/ui/icon/IconKey;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
/*     */       //   401: invokestatic isTraceInProgress : ()Z
/*     */       //   404: ifeq -> 419
/*     */       //   407: invokestatic traceEventEnd : ()V
/*     */       //   410: goto -> 419
/*     */       //   413: aload_2
/*     */       //   414: invokeinterface skipToGroupEnd : ()V
/*     */       //   419: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #162	-> 6
/*     */       //   #163	-> 39
/*     */       //   #167	-> 53
/*     */       //   #163	-> 61
/*     */       //   #167	-> 63
/*     */       //   #164	-> 102
/*     */       //   #271	-> 117
/*     */       //   #272	-> 129
/*     */       //   #273	-> 145
/*     */       //   #164	-> 152
/*     */       //   #273	-> 169
/*     */       //   #274	-> 171
/*     */       //   #275	-> 180
/*     */       //   #276	-> 185
/*     */       //   #272	-> 187
/*     */       //   #271	-> 188
/*     */       //   #271	-> 189
/*     */       //   #164	-> 190
/*     */       //   #162	-> 209
/*     */       //   #169	-> 212
/*     */       //   #172	-> 226
/*     */       //   #173	-> 242
/*     */       //   #172	-> 250
/*     */       //   #173	-> 252
/*     */       //   #171	-> 291
/*     */       //   #277	-> 306
/*     */       //   #278	-> 318
/*     */       //   #279	-> 334
/*     */       //   #171	-> 341
/*     */       //   #279	-> 358
/*     */       //   #280	-> 360
/*     */       //   #281	-> 369
/*     */       //   #282	-> 374
/*     */       //   #278	-> 376
/*     */       //   #277	-> 377
/*     */       //   #277	-> 378
/*     */       //   #171	-> 379
/*     */       //   #170	-> 398
/*     */       //   #175	-> 413
/*     */       //   #176	-> 419
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   152	9	14	$i$a$-cache-FileChangeKt$NewFileChip$1$1	I
/*     */       //   171	11	15	value$iv	Ljava/lang/Object;
/*     */       //   129	59	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   126	62	12	it$iv	Ljava/lang/Object;
/*     */       //   117	73	11	$i$f$cache	I
/*     */       //   114	76	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   114	76	8	invalid$iv	Z
/*     */       //   341	9	14	$i$a$-cache-FileChangeKt$NewFileChip$1$2	I
/*     */       //   360	11	15	value$iv	Ljava/lang/Object;
/*     */       //   318	59	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   315	62	12	it$iv	Ljava/lang/Object;
/*     */       //   306	73	11	$i$f$cache	I
/*     */       //   303	76	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   303	76	8	invalid$iv	Z
/*     */       //   0	420	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/FileChangeKt$NewFileChip$1;
/*     */       //   0	420	1	$this$FileChangeItem	Landroidx/compose/foundation/layout/RowScope;
/*     */       //   0	420	2	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	420	3	$changed	I } private static final Unit invoke$lambda$1$lambda$0(CoroutineScope $coroutineScope, Function1<? super Continuation<? super Unit>, ? extends Object> $onJumpToSource) { BuildersKt.launch$default($coroutineScope, null, null, new FileChangeKt$NewFileChip$1$1$1$1($onJumpToSource, null), 3, null); return Unit.INSTANCE; } private static final Unit invoke$lambda$3$lambda$2(CoroutineScope $coroutineScope, Function1<? super Continuation<? super Unit>, ? extends Object> $onCommitAction) { BuildersKt.launch$default($coroutineScope, null, null, new FileChangeKt$NewFileChip$1$2$1$1($onCommitAction, null), 3, null); return Unit.INSTANCE; } FileChangeKt$NewFileChip$1(FileChangeView $change, CoroutineScope $coroutineScope, Function1<Continuation<? super Unit>, Object> $onJumpToSource, boolean $isProjectOnVCS, boolean $isCommitted, Function1<Continuation<? super Unit>, Object> $onCommitAction) {} } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void IconButtonWithTextTooltip(@NotNull String tooltipText, @NotNull IconKey iconKey, @NotNull Function0<Unit> onClick, @Nullable Composer $composer, int $changed) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'tooltipText'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: ldc_w 'iconKey'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload_2
/*     */     //   15: ldc_w 'onClick'
/*     */     //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   21: aload_3
/*     */     //   22: ldc_w 392530777
/*     */     //   25: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   30: astore_3
/*     */     //   31: iload #4
/*     */     //   33: istore #5
/*     */     //   35: iload #4
/*     */     //   37: bipush #6
/*     */     //   39: iand
/*     */     //   40: ifne -> 63
/*     */     //   43: iload #5
/*     */     //   45: aload_3
/*     */     //   46: aload_0
/*     */     //   47: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   52: ifeq -> 59
/*     */     //   55: iconst_4
/*     */     //   56: goto -> 60
/*     */     //   59: iconst_2
/*     */     //   60: ior
/*     */     //   61: istore #5
/*     */     //   63: iload #4
/*     */     //   65: bipush #48
/*     */     //   67: iand
/*     */     //   68: ifne -> 93
/*     */     //   71: iload #5
/*     */     //   73: aload_3
/*     */     //   74: aload_1
/*     */     //   75: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   80: ifeq -> 88
/*     */     //   83: bipush #32
/*     */     //   85: goto -> 90
/*     */     //   88: bipush #16
/*     */     //   90: ior
/*     */     //   91: istore #5
/*     */     //   93: iload #4
/*     */     //   95: sipush #384
/*     */     //   98: iand
/*     */     //   99: ifne -> 126
/*     */     //   102: iload #5
/*     */     //   104: aload_3
/*     */     //   105: aload_2
/*     */     //   106: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   111: ifeq -> 120
/*     */     //   114: sipush #256
/*     */     //   117: goto -> 123
/*     */     //   120: sipush #128
/*     */     //   123: ior
/*     */     //   124: istore #5
/*     */     //   126: iload #5
/*     */     //   128: sipush #147
/*     */     //   131: iand
/*     */     //   132: sipush #146
/*     */     //   135: if_icmpne -> 147
/*     */     //   138: aload_3
/*     */     //   139: invokeinterface getSkipping : ()Z
/*     */     //   144: ifne -> 234
/*     */     //   147: invokestatic isTraceInProgress : ()Z
/*     */     //   150: ifeq -> 165
/*     */     //   153: ldc_w 392530777
/*     */     //   156: iload #5
/*     */     //   158: iconst_m1
/*     */     //   159: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.IconButtonWithTextTooltip (FileChange.kt:184)'
/*     */     //   162: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   165: ldc_w -1286239798
/*     */     //   168: iconst_1
/*     */     //   169: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/FileChangeKt$IconButtonWithTextTooltip$1
/*     */     //   172: dup
/*     */     //   173: aload_0
/*     */     //   174: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   177: aload_3
/*     */     //   178: bipush #54
/*     */     //   180: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   183: checkcast kotlin/jvm/functions/Function2
/*     */     //   186: aconst_null
/*     */     //   187: iconst_0
/*     */     //   188: aconst_null
/*     */     //   189: aconst_null
/*     */     //   190: ldc_w -424169393
/*     */     //   193: iconst_1
/*     */     //   194: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/FileChangeKt$IconButtonWithTextTooltip$2
/*     */     //   197: dup
/*     */     //   198: aload_2
/*     */     //   199: aload_1
/*     */     //   200: aload_0
/*     */     //   201: invokespecial <init> : (Lkotlin/jvm/functions/Function0;Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;)V
/*     */     //   204: aload_3
/*     */     //   205: bipush #54
/*     */     //   207: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   210: checkcast kotlin/jvm/functions/Function2
/*     */     //   213: aload_3
/*     */     //   214: ldc_w 196614
/*     */     //   217: bipush #30
/*     */     //   219: invokestatic JunieTooltip : (Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/foundation/TooltipPlacement;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   222: invokestatic isTraceInProgress : ()Z
/*     */     //   225: ifeq -> 240
/*     */     //   228: invokestatic traceEventEnd : ()V
/*     */     //   231: goto -> 240
/*     */     //   234: aload_3
/*     */     //   235: invokeinterface skipToGroupEnd : ()V
/*     */     //   240: aload_3
/*     */     //   241: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   246: dup
/*     */     //   247: ifnull -> 268
/*     */     //   250: aload_0
/*     */     //   251: aload_1
/*     */     //   252: aload_2
/*     */     //   253: iload #4
/*     */     //   255: <illegal opcode> invoke : (Ljava/lang/String;Lorg/jetbrains/jewel/ui/icon/IconKey;Lkotlin/jvm/functions/Function0;I)Lkotlin/jvm/functions/Function2;
/*     */     //   260: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   265: goto -> 269
/*     */     //   268: pop
/*     */     //   269: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #185	-> 21
/*     */     //   #187	-> 165
/*     */     //   #195	-> 190
/*     */     //   #186	-> 219
/*     */     //   #202	-> 234
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   35	235	5	$dirty	I
/*     */     //   0	270	0	tooltipText	Ljava/lang/String;
/*     */     //   0	270	1	iconKey	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   0	270	2	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	270	3	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	270	4	$changed	I } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nFileChange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileChange.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/FileChangeKt$IconButtonWithTextTooltip$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,270:1\n149#2:271\n*S KotlinDebug\n*F\n+ 1 FileChange.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/FileChangeKt$IconButtonWithTextTooltip$1\n*L\n189#1:271\n*E\n"}) static final class FileChangeKt$IconButtonWithTextTooltip$1 implements Function2<Composer, Integer, Unit> { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1286239798, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.IconButtonWithTextTooltip.<anonymous> (FileChange.kt:187)");  int $this$dp$iv = 200, $i$f$getDp = 0; Modifier modifier = SizeKt.widthIn-VpY3zN4$default((Modifier)Modifier.Companion, 0.0F, Dp.constructor-impl($this$dp$iv), 1, null); FontFamily fontFamily = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getMessageFont($composer, MatterhornThemeData.$stable); $i$f$getDp = TextOverflow.Companion.getEllipsis-gIe3tQ8(); TextKt.Text-bAzTDeA(this.$tooltipText, modifier, 0L, 0L, null, null, fontFamily, 0L, null, 0, 0L, $i$f$getDp, false, 0, null, null, $composer, 48, 48, 63420); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } FileChangeKt$IconButtonWithTextTooltip$1(String $tooltipText) {} } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class FileChangeKt$IconButtonWithTextTooltip$2 implements Function2<Composer, Integer, Unit> { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-424169393, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.IconButtonWithTextTooltip.<anonymous> (FileChange.kt:195)");  IconButtonKt.IconButton(this.$onClick, null, false, false, null, null, (Function4)ComposableLambdaKt.rememberComposableLambda(-974296282, true, new Function4<BoxScope, IconButtonState, Composer, Integer, Unit>(this.$iconKey, this.$tooltipText) { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke-KMTpdl8(BoxScope $this$IconButton, long it, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$IconButton, "$this$IconButton"); if (($changed & 0x81) != 128 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-974296282, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.IconButtonWithTextTooltip.<anonymous>.<anonymous> (FileChange.kt:198)");  IconKt.Icon-FHprtrg(this.$iconKey, this.$tooltipText, null, null, 0L, new org.jetbrains.jewel.ui.painter.PainterHint[0], $composer, 0, 28); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } }$composer, 54), $composer, 1572864, 62); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } FileChangeKt$IconButtonWithTextTooltip$2(Function0<Unit> $onClick, IconKey $iconKey, String $tooltipText) {} } @Composable @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]") private static final void FileChangeItem-gg3fqwA(FileChangeView change, long background, boolean isHovered, long contentColor, Function0 onShowDiff, boolean showAction, Function3<RowScope, Composer, Integer, Unit> actions, Composer $composer, int $changed, int paramInt1) { // Byte code:
/*     */     //   0: aload #9
/*     */     //   2: ldc_w -1586079421
/*     */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   10: astore #9
/*     */     //   12: iload #10
/*     */     //   14: istore #12
/*     */     //   16: iload #11
/*     */     //   18: iconst_1
/*     */     //   19: iand
/*     */     //   20: ifeq -> 33
/*     */     //   23: iload #12
/*     */     //   25: bipush #6
/*     */     //   27: ior
/*     */     //   28: istore #12
/*     */     //   30: goto -> 62
/*     */     //   33: iload #10
/*     */     //   35: bipush #6
/*     */     //   37: iand
/*     */     //   38: ifne -> 62
/*     */     //   41: iload #12
/*     */     //   43: aload #9
/*     */     //   45: aload_0
/*     */     //   46: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   51: ifeq -> 58
/*     */     //   54: iconst_4
/*     */     //   55: goto -> 59
/*     */     //   58: iconst_2
/*     */     //   59: ior
/*     */     //   60: istore #12
/*     */     //   62: iload #11
/*     */     //   64: iconst_2
/*     */     //   65: iand
/*     */     //   66: ifeq -> 79
/*     */     //   69: iload #12
/*     */     //   71: bipush #48
/*     */     //   73: ior
/*     */     //   74: istore #12
/*     */     //   76: goto -> 110
/*     */     //   79: iload #10
/*     */     //   81: bipush #48
/*     */     //   83: iand
/*     */     //   84: ifne -> 110
/*     */     //   87: iload #12
/*     */     //   89: aload #9
/*     */     //   91: lload_1
/*     */     //   92: invokeinterface changed : (J)Z
/*     */     //   97: ifeq -> 105
/*     */     //   100: bipush #32
/*     */     //   102: goto -> 107
/*     */     //   105: bipush #16
/*     */     //   107: ior
/*     */     //   108: istore #12
/*     */     //   110: iload #11
/*     */     //   112: iconst_4
/*     */     //   113: iand
/*     */     //   114: ifeq -> 128
/*     */     //   117: iload #12
/*     */     //   119: sipush #384
/*     */     //   122: ior
/*     */     //   123: istore #12
/*     */     //   125: goto -> 162
/*     */     //   128: iload #10
/*     */     //   130: sipush #384
/*     */     //   133: iand
/*     */     //   134: ifne -> 162
/*     */     //   137: iload #12
/*     */     //   139: aload #9
/*     */     //   141: iload_3
/*     */     //   142: invokeinterface changed : (Z)Z
/*     */     //   147: ifeq -> 156
/*     */     //   150: sipush #256
/*     */     //   153: goto -> 159
/*     */     //   156: sipush #128
/*     */     //   159: ior
/*     */     //   160: istore #12
/*     */     //   162: iload #11
/*     */     //   164: bipush #8
/*     */     //   166: iand
/*     */     //   167: ifeq -> 181
/*     */     //   170: iload #12
/*     */     //   172: sipush #3072
/*     */     //   175: ior
/*     */     //   176: istore #12
/*     */     //   178: goto -> 216
/*     */     //   181: iload #10
/*     */     //   183: sipush #3072
/*     */     //   186: iand
/*     */     //   187: ifne -> 216
/*     */     //   190: iload #12
/*     */     //   192: aload #9
/*     */     //   194: lload #4
/*     */     //   196: invokeinterface changed : (J)Z
/*     */     //   201: ifeq -> 210
/*     */     //   204: sipush #2048
/*     */     //   207: goto -> 213
/*     */     //   210: sipush #1024
/*     */     //   213: ior
/*     */     //   214: istore #12
/*     */     //   216: iload #11
/*     */     //   218: bipush #16
/*     */     //   220: iand
/*     */     //   221: ifeq -> 235
/*     */     //   224: iload #12
/*     */     //   226: sipush #24576
/*     */     //   229: ior
/*     */     //   230: istore #12
/*     */     //   232: goto -> 270
/*     */     //   235: iload #10
/*     */     //   237: sipush #24576
/*     */     //   240: iand
/*     */     //   241: ifne -> 270
/*     */     //   244: iload #12
/*     */     //   246: aload #9
/*     */     //   248: aload #6
/*     */     //   250: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   255: ifeq -> 264
/*     */     //   258: sipush #16384
/*     */     //   261: goto -> 267
/*     */     //   264: sipush #8192
/*     */     //   267: ior
/*     */     //   268: istore #12
/*     */     //   270: iload #11
/*     */     //   272: bipush #32
/*     */     //   274: iand
/*     */     //   275: ifeq -> 288
/*     */     //   278: iload #12
/*     */     //   280: ldc 196608
/*     */     //   282: ior
/*     */     //   283: istore #12
/*     */     //   285: goto -> 320
/*     */     //   288: iload #10
/*     */     //   290: ldc 196608
/*     */     //   292: iand
/*     */     //   293: ifne -> 320
/*     */     //   296: iload #12
/*     */     //   298: aload #9
/*     */     //   300: iload #7
/*     */     //   302: invokeinterface changed : (Z)Z
/*     */     //   307: ifeq -> 315
/*     */     //   310: ldc 131072
/*     */     //   312: goto -> 317
/*     */     //   315: ldc 65536
/*     */     //   317: ior
/*     */     //   318: istore #12
/*     */     //   320: iload #11
/*     */     //   322: bipush #64
/*     */     //   324: iand
/*     */     //   325: ifeq -> 339
/*     */     //   328: iload #12
/*     */     //   330: ldc_w 1572864
/*     */     //   333: ior
/*     */     //   334: istore #12
/*     */     //   336: goto -> 374
/*     */     //   339: iload #10
/*     */     //   341: ldc_w 1572864
/*     */     //   344: iand
/*     */     //   345: ifne -> 374
/*     */     //   348: iload #12
/*     */     //   350: aload #9
/*     */     //   352: aload #8
/*     */     //   354: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   359: ifeq -> 368
/*     */     //   362: ldc_w 1048576
/*     */     //   365: goto -> 371
/*     */     //   368: ldc_w 524288
/*     */     //   371: ior
/*     */     //   372: istore #12
/*     */     //   374: iload #12
/*     */     //   376: ldc_w 599187
/*     */     //   379: iand
/*     */     //   380: ldc_w 599186
/*     */     //   383: if_icmpne -> 396
/*     */     //   386: aload #9
/*     */     //   388: invokeinterface getSkipping : ()Z
/*     */     //   393: ifne -> 3009
/*     */     //   396: iload #11
/*     */     //   398: bipush #32
/*     */     //   400: iand
/*     */     //   401: ifeq -> 407
/*     */     //   404: iconst_1
/*     */     //   405: istore #7
/*     */     //   407: iload #11
/*     */     //   409: bipush #64
/*     */     //   411: iand
/*     */     //   412: ifeq -> 423
/*     */     //   415: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ComposableSingletons$FileChangeKt.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ComposableSingletons$FileChangeKt;
/*     */     //   418: invokevirtual getLambda-1$ej_ui : ()Lkotlin/jvm/functions/Function3;
/*     */     //   421: astore #8
/*     */     //   423: invokestatic isTraceInProgress : ()Z
/*     */     //   426: ifeq -> 441
/*     */     //   429: ldc_w -1586079421
/*     */     //   432: iload #12
/*     */     //   434: iconst_m1
/*     */     //   435: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.FileChangeItem (FileChange.kt:213)'
/*     */     //   438: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   441: aload #9
/*     */     //   443: ldc_w -573556598
/*     */     //   446: invokeinterface startReplaceGroup : (I)V
/*     */     //   451: aload #9
/*     */     //   453: astore #15
/*     */     //   455: iconst_0
/*     */     //   456: istore #16
/*     */     //   458: nop
/*     */     //   459: iconst_0
/*     */     //   460: istore #17
/*     */     //   462: aload #15
/*     */     //   464: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   469: astore #18
/*     */     //   471: iconst_0
/*     */     //   472: istore #19
/*     */     //   474: aload #18
/*     */     //   476: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   479: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   482: if_acmpne -> 514
/*     */     //   485: iconst_0
/*     */     //   486: istore #20
/*     */     //   488: iconst_0
/*     */     //   489: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   492: aconst_null
/*     */     //   493: iconst_2
/*     */     //   494: aconst_null
/*     */     //   495: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   498: astore #20
/*     */     //   500: aload #15
/*     */     //   502: aload #20
/*     */     //   504: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   509: aload #20
/*     */     //   511: goto -> 516
/*     */     //   514: aload #18
/*     */     //   516: nop
/*     */     //   517: nop
/*     */     //   518: nop
/*     */     //   519: checkcast androidx/compose/runtime/MutableState
/*     */     //   522: astore #14
/*     */     //   524: aload #9
/*     */     //   526: invokeinterface endReplaceGroup : ()V
/*     */     //   531: aload #14
/*     */     //   533: astore #13
/*     */     //   535: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   538: iload #7
/*     */     //   540: ifeq -> 558
/*     */     //   543: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   546: checkcast androidx/compose/ui/Modifier
/*     */     //   549: fconst_0
/*     */     //   550: iconst_1
/*     */     //   551: aconst_null
/*     */     //   552: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   555: goto -> 564
/*     */     //   558: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   561: checkcast androidx/compose/ui/Modifier
/*     */     //   564: invokevirtual then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   567: astore #14
/*     */     //   569: iconst_0
/*     */     //   570: istore #17
/*     */     //   572: iconst_0
/*     */     //   573: istore #18
/*     */     //   575: aload #9
/*     */     //   577: ldc_w 693286680
/*     */     //   580: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   583: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   586: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   589: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   592: astore #15
/*     */     //   594: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   597: invokevirtual getTop : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   600: astore #16
/*     */     //   602: aload #15
/*     */     //   604: aload #16
/*     */     //   606: aload #9
/*     */     //   608: bipush #14
/*     */     //   610: iload #17
/*     */     //   612: iconst_3
/*     */     //   613: ishr
/*     */     //   614: iand
/*     */     //   615: bipush #112
/*     */     //   617: iload #17
/*     */     //   619: iconst_3
/*     */     //   620: ishr
/*     */     //   621: iand
/*     */     //   622: ior
/*     */     //   623: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   626: astore #19
/*     */     //   628: bipush #112
/*     */     //   630: iload #17
/*     */     //   632: iconst_3
/*     */     //   633: ishl
/*     */     //   634: iand
/*     */     //   635: istore #20
/*     */     //   637: nop
/*     */     //   638: iconst_0
/*     */     //   639: istore #21
/*     */     //   641: aload #9
/*     */     //   643: ldc -1323940314
/*     */     //   645: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   647: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   650: aload #9
/*     */     //   652: iconst_0
/*     */     //   653: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   656: istore #22
/*     */     //   658: aload #9
/*     */     //   660: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   665: astore #23
/*     */     //   667: aload #9
/*     */     //   669: aload #14
/*     */     //   671: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   674: astore #24
/*     */     //   676: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   679: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   682: astore #25
/*     */     //   684: bipush #6
/*     */     //   686: sipush #896
/*     */     //   689: iload #20
/*     */     //   691: bipush #6
/*     */     //   693: ishl
/*     */     //   694: iand
/*     */     //   695: ior
/*     */     //   696: istore #26
/*     */     //   698: nop
/*     */     //   699: iconst_0
/*     */     //   700: istore #27
/*     */     //   702: aload #9
/*     */     //   704: ldc -692256719
/*     */     //   706: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   708: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   711: aload #9
/*     */     //   713: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   718: instanceof androidx/compose/runtime/Applier
/*     */     //   721: ifne -> 727
/*     */     //   724: invokestatic invalidApplier : ()V
/*     */     //   727: aload #9
/*     */     //   729: invokeinterface startReusableNode : ()V
/*     */     //   734: aload #9
/*     */     //   736: invokeinterface getInserting : ()Z
/*     */     //   741: ifeq -> 756
/*     */     //   744: aload #9
/*     */     //   746: aload #25
/*     */     //   748: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   753: goto -> 763
/*     */     //   756: aload #9
/*     */     //   758: invokeinterface useNode : ()V
/*     */     //   763: aload #9
/*     */     //   765: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   768: astore #28
/*     */     //   770: iconst_0
/*     */     //   771: istore #29
/*     */     //   773: aload #28
/*     */     //   775: aload #19
/*     */     //   777: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   780: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   783: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   786: aload #28
/*     */     //   788: aload #23
/*     */     //   790: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   793: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   796: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   799: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   802: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   805: astore #30
/*     */     //   807: iconst_0
/*     */     //   808: istore #31
/*     */     //   810: aload #28
/*     */     //   812: astore #32
/*     */     //   814: iconst_0
/*     */     //   815: istore #33
/*     */     //   817: aload #32
/*     */     //   819: invokeinterface getInserting : ()Z
/*     */     //   824: ifne -> 845
/*     */     //   827: aload #32
/*     */     //   829: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   834: iload #22
/*     */     //   836: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   839: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   842: ifne -> 871
/*     */     //   845: aload #32
/*     */     //   847: iload #22
/*     */     //   849: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   852: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   857: aload #28
/*     */     //   859: iload #22
/*     */     //   861: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   864: aload #30
/*     */     //   866: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   871: nop
/*     */     //   872: nop
/*     */     //   873: nop
/*     */     //   874: aload #28
/*     */     //   876: aload #24
/*     */     //   878: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   881: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   884: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   887: nop
/*     */     //   888: nop
/*     */     //   889: aload #9
/*     */     //   891: bipush #14
/*     */     //   893: iload #26
/*     */     //   895: bipush #6
/*     */     //   897: ishr
/*     */     //   898: iand
/*     */     //   899: istore #34
/*     */     //   901: astore #35
/*     */     //   903: iconst_0
/*     */     //   904: istore #36
/*     */     //   906: aload #35
/*     */     //   908: ldc_w -407840262
/*     */     //   911: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   914: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   917: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   920: aload #35
/*     */     //   922: bipush #6
/*     */     //   924: bipush #112
/*     */     //   926: iload #17
/*     */     //   928: bipush #6
/*     */     //   930: ishr
/*     */     //   931: iand
/*     */     //   932: ior
/*     */     //   933: istore #37
/*     */     //   935: astore #38
/*     */     //   937: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   940: astore #39
/*     */     //   942: iconst_0
/*     */     //   943: istore #40
/*     */     //   945: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   948: checkcast androidx/compose/ui/Modifier
/*     */     //   951: bipush #6
/*     */     //   953: istore #41
/*     */     //   955: iconst_0
/*     */     //   956: istore #42
/*     */     //   958: iload #41
/*     */     //   960: i2f
/*     */     //   961: invokestatic constructor-impl : (F)F
/*     */     //   964: invokestatic RoundedCornerShape-0680j_4 : (F)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   967: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   970: invokestatic clip : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*     */     //   973: bipush #20
/*     */     //   975: istore #41
/*     */     //   977: iconst_0
/*     */     //   978: istore #42
/*     */     //   980: iload #41
/*     */     //   982: i2f
/*     */     //   983: invokestatic constructor-impl : (F)F
/*     */     //   986: invokestatic height-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   989: lload_1
/*     */     //   990: aconst_null
/*     */     //   991: iconst_2
/*     */     //   992: aconst_null
/*     */     //   993: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   996: aload #38
/*     */     //   998: ldc_w 2104302542
/*     */     //   1001: invokeinterface startReplaceGroup : (I)V
/*     */     //   1006: aload #38
/*     */     //   1008: astore #42
/*     */     //   1010: iconst_0
/*     */     //   1011: istore #43
/*     */     //   1013: nop
/*     */     //   1014: iconst_0
/*     */     //   1015: istore #44
/*     */     //   1017: aload #42
/*     */     //   1019: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1024: astore #45
/*     */     //   1026: iconst_0
/*     */     //   1027: istore #46
/*     */     //   1029: aload #45
/*     */     //   1031: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1034: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1037: if_acmpne -> 1067
/*     */     //   1040: astore #47
/*     */     //   1042: iconst_0
/*     */     //   1043: istore #48
/*     */     //   1045: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   1048: aload #47
/*     */     //   1050: swap
/*     */     //   1051: astore #48
/*     */     //   1053: aload #42
/*     */     //   1055: aload #48
/*     */     //   1057: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1062: aload #48
/*     */     //   1064: goto -> 1069
/*     */     //   1067: aload #45
/*     */     //   1069: nop
/*     */     //   1070: nop
/*     */     //   1071: nop
/*     */     //   1072: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   1075: astore #41
/*     */     //   1077: aload #38
/*     */     //   1079: invokeinterface endReplaceGroup : ()V
/*     */     //   1084: aload #41
/*     */     //   1086: aconst_null
/*     */     //   1087: iconst_0
/*     */     //   1088: aconst_null
/*     */     //   1089: aconst_null
/*     */     //   1090: aload #6
/*     */     //   1092: bipush #28
/*     */     //   1094: aconst_null
/*     */     //   1095: invokestatic clickable-O2vRcR0$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1098: aconst_null
/*     */     //   1099: aconst_null
/*     */     //   1100: iconst_3
/*     */     //   1101: aconst_null
/*     */     //   1102: invokestatic animateContentSize$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1105: bipush #7
/*     */     //   1107: istore #41
/*     */     //   1109: iconst_0
/*     */     //   1110: istore #42
/*     */     //   1112: iload #41
/*     */     //   1114: i2f
/*     */     //   1115: invokestatic constructor-impl : (F)F
/*     */     //   1118: iconst_2
/*     */     //   1119: istore #41
/*     */     //   1121: iconst_0
/*     */     //   1122: istore #42
/*     */     //   1124: iload #41
/*     */     //   1126: i2f
/*     */     //   1127: invokestatic constructor-impl : (F)F
/*     */     //   1130: invokestatic padding-VpY3zN4 : (Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;
/*     */     //   1133: astore #41
/*     */     //   1135: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1138: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   1141: astore #43
/*     */     //   1143: sipush #384
/*     */     //   1146: istore #44
/*     */     //   1148: nop
/*     */     //   1149: iconst_0
/*     */     //   1150: istore #45
/*     */     //   1152: aload #38
/*     */     //   1154: ldc_w 693286680
/*     */     //   1157: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   1160: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1163: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   1166: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   1169: astore #42
/*     */     //   1171: aload #42
/*     */     //   1173: aload #43
/*     */     //   1175: aload #38
/*     */     //   1177: bipush #14
/*     */     //   1179: iload #44
/*     */     //   1181: iconst_3
/*     */     //   1182: ishr
/*     */     //   1183: iand
/*     */     //   1184: bipush #112
/*     */     //   1186: iload #44
/*     */     //   1188: iconst_3
/*     */     //   1189: ishr
/*     */     //   1190: iand
/*     */     //   1191: ior
/*     */     //   1192: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1195: astore #46
/*     */     //   1197: bipush #112
/*     */     //   1199: iload #44
/*     */     //   1201: iconst_3
/*     */     //   1202: ishl
/*     */     //   1203: iand
/*     */     //   1204: istore #48
/*     */     //   1206: nop
/*     */     //   1207: iconst_0
/*     */     //   1208: istore #49
/*     */     //   1210: aload #38
/*     */     //   1212: ldc -1323940314
/*     */     //   1214: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1216: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1219: aload #38
/*     */     //   1221: iconst_0
/*     */     //   1222: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1225: istore #50
/*     */     //   1227: aload #38
/*     */     //   1229: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1234: astore #51
/*     */     //   1236: aload #38
/*     */     //   1238: aload #41
/*     */     //   1240: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1243: astore #52
/*     */     //   1245: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1248: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1251: astore #53
/*     */     //   1253: bipush #6
/*     */     //   1255: sipush #896
/*     */     //   1258: iload #48
/*     */     //   1260: bipush #6
/*     */     //   1262: ishl
/*     */     //   1263: iand
/*     */     //   1264: ior
/*     */     //   1265: istore #54
/*     */     //   1267: nop
/*     */     //   1268: iconst_0
/*     */     //   1269: istore #55
/*     */     //   1271: aload #38
/*     */     //   1273: ldc -692256719
/*     */     //   1275: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1277: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1280: aload #38
/*     */     //   1282: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1287: instanceof androidx/compose/runtime/Applier
/*     */     //   1290: ifne -> 1296
/*     */     //   1293: invokestatic invalidApplier : ()V
/*     */     //   1296: aload #38
/*     */     //   1298: invokeinterface startReusableNode : ()V
/*     */     //   1303: aload #38
/*     */     //   1305: invokeinterface getInserting : ()Z
/*     */     //   1310: ifeq -> 1325
/*     */     //   1313: aload #38
/*     */     //   1315: aload #53
/*     */     //   1317: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1322: goto -> 1332
/*     */     //   1325: aload #38
/*     */     //   1327: invokeinterface useNode : ()V
/*     */     //   1332: aload #38
/*     */     //   1334: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1337: astore #56
/*     */     //   1339: iconst_0
/*     */     //   1340: istore #57
/*     */     //   1342: aload #56
/*     */     //   1344: aload #46
/*     */     //   1346: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1349: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1352: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1355: aload #56
/*     */     //   1357: aload #51
/*     */     //   1359: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1362: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1365: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1368: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1371: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1374: astore #58
/*     */     //   1376: iconst_0
/*     */     //   1377: istore #59
/*     */     //   1379: aload #56
/*     */     //   1381: astore #60
/*     */     //   1383: iconst_0
/*     */     //   1384: istore #61
/*     */     //   1386: aload #60
/*     */     //   1388: invokeinterface getInserting : ()Z
/*     */     //   1393: ifne -> 1414
/*     */     //   1396: aload #60
/*     */     //   1398: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1403: iload #50
/*     */     //   1405: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1408: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1411: ifne -> 1440
/*     */     //   1414: aload #60
/*     */     //   1416: iload #50
/*     */     //   1418: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1421: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1426: aload #56
/*     */     //   1428: iload #50
/*     */     //   1430: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1433: aload #58
/*     */     //   1435: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1440: nop
/*     */     //   1441: nop
/*     */     //   1442: nop
/*     */     //   1443: aload #56
/*     */     //   1445: aload #52
/*     */     //   1447: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1450: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1453: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1456: nop
/*     */     //   1457: nop
/*     */     //   1458: aload #38
/*     */     //   1460: bipush #14
/*     */     //   1462: iload #54
/*     */     //   1464: bipush #6
/*     */     //   1466: ishr
/*     */     //   1467: iand
/*     */     //   1468: istore #62
/*     */     //   1470: astore #63
/*     */     //   1472: iconst_0
/*     */     //   1473: istore #64
/*     */     //   1475: aload #63
/*     */     //   1477: ldc_w -407840262
/*     */     //   1480: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   1483: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1486: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   1489: aload #63
/*     */     //   1491: bipush #6
/*     */     //   1493: bipush #112
/*     */     //   1495: iload #44
/*     */     //   1497: bipush #6
/*     */     //   1499: ishr
/*     */     //   1500: iand
/*     */     //   1501: ior
/*     */     //   1502: istore #65
/*     */     //   1504: astore #66
/*     */     //   1506: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   1509: astore #67
/*     */     //   1511: iconst_0
/*     */     //   1512: istore #68
/*     */     //   1514: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1517: iload_3
/*     */     //   1518: ifeq -> 1544
/*     */     //   1521: iload #7
/*     */     //   1523: ifeq -> 1544
/*     */     //   1526: aload #67
/*     */     //   1528: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1531: checkcast androidx/compose/ui/Modifier
/*     */     //   1534: fconst_1
/*     */     //   1535: iconst_0
/*     */     //   1536: iconst_2
/*     */     //   1537: aconst_null
/*     */     //   1538: invokestatic weight$default : (Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1541: goto -> 1550
/*     */     //   1544: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1547: checkcast androidx/compose/ui/Modifier
/*     */     //   1550: invokevirtual then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1553: astore #69
/*     */     //   1555: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1558: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   1561: astore #70
/*     */     //   1563: sipush #384
/*     */     //   1566: istore #71
/*     */     //   1568: nop
/*     */     //   1569: iconst_0
/*     */     //   1570: istore #72
/*     */     //   1572: aload #66
/*     */     //   1574: ldc_w 693286680
/*     */     //   1577: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   1580: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1583: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   1586: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   1589: astore #73
/*     */     //   1591: aload #73
/*     */     //   1593: aload #70
/*     */     //   1595: aload #66
/*     */     //   1597: bipush #14
/*     */     //   1599: iload #71
/*     */     //   1601: iconst_3
/*     */     //   1602: ishr
/*     */     //   1603: iand
/*     */     //   1604: bipush #112
/*     */     //   1606: iload #71
/*     */     //   1608: iconst_3
/*     */     //   1609: ishr
/*     */     //   1610: iand
/*     */     //   1611: ior
/*     */     //   1612: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1615: astore #74
/*     */     //   1617: bipush #112
/*     */     //   1619: iload #71
/*     */     //   1621: iconst_3
/*     */     //   1622: ishl
/*     */     //   1623: iand
/*     */     //   1624: istore #75
/*     */     //   1626: nop
/*     */     //   1627: iconst_0
/*     */     //   1628: istore #76
/*     */     //   1630: aload #66
/*     */     //   1632: ldc -1323940314
/*     */     //   1634: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1636: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1639: aload #66
/*     */     //   1641: iconst_0
/*     */     //   1642: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1645: istore #77
/*     */     //   1647: aload #66
/*     */     //   1649: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1654: astore #78
/*     */     //   1656: aload #66
/*     */     //   1658: aload #69
/*     */     //   1660: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1663: astore #79
/*     */     //   1665: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1668: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1671: astore #80
/*     */     //   1673: bipush #6
/*     */     //   1675: sipush #896
/*     */     //   1678: iload #75
/*     */     //   1680: bipush #6
/*     */     //   1682: ishl
/*     */     //   1683: iand
/*     */     //   1684: ior
/*     */     //   1685: istore #81
/*     */     //   1687: nop
/*     */     //   1688: iconst_0
/*     */     //   1689: istore #82
/*     */     //   1691: aload #66
/*     */     //   1693: ldc -692256719
/*     */     //   1695: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1697: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1700: aload #66
/*     */     //   1702: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1707: instanceof androidx/compose/runtime/Applier
/*     */     //   1710: ifne -> 1716
/*     */     //   1713: invokestatic invalidApplier : ()V
/*     */     //   1716: aload #66
/*     */     //   1718: invokeinterface startReusableNode : ()V
/*     */     //   1723: aload #66
/*     */     //   1725: invokeinterface getInserting : ()Z
/*     */     //   1730: ifeq -> 1745
/*     */     //   1733: aload #66
/*     */     //   1735: aload #80
/*     */     //   1737: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1742: goto -> 1752
/*     */     //   1745: aload #66
/*     */     //   1747: invokeinterface useNode : ()V
/*     */     //   1752: aload #66
/*     */     //   1754: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1757: astore #83
/*     */     //   1759: iconst_0
/*     */     //   1760: istore #84
/*     */     //   1762: aload #83
/*     */     //   1764: aload #74
/*     */     //   1766: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1769: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1772: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1775: aload #83
/*     */     //   1777: aload #78
/*     */     //   1779: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1782: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1785: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1788: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1791: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1794: astore #85
/*     */     //   1796: iconst_0
/*     */     //   1797: istore #86
/*     */     //   1799: aload #83
/*     */     //   1801: astore #87
/*     */     //   1803: iconst_0
/*     */     //   1804: istore #88
/*     */     //   1806: aload #87
/*     */     //   1808: invokeinterface getInserting : ()Z
/*     */     //   1813: ifne -> 1834
/*     */     //   1816: aload #87
/*     */     //   1818: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1823: iload #77
/*     */     //   1825: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1828: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1831: ifne -> 1860
/*     */     //   1834: aload #87
/*     */     //   1836: iload #77
/*     */     //   1838: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1841: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1846: aload #83
/*     */     //   1848: iload #77
/*     */     //   1850: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1853: aload #85
/*     */     //   1855: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1860: nop
/*     */     //   1861: nop
/*     */     //   1862: nop
/*     */     //   1863: aload #83
/*     */     //   1865: aload #79
/*     */     //   1867: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1870: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1873: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1876: nop
/*     */     //   1877: nop
/*     */     //   1878: aload #66
/*     */     //   1880: bipush #14
/*     */     //   1882: iload #81
/*     */     //   1884: bipush #6
/*     */     //   1886: ishr
/*     */     //   1887: iand
/*     */     //   1888: istore #89
/*     */     //   1890: astore #90
/*     */     //   1892: iconst_0
/*     */     //   1893: istore #91
/*     */     //   1895: aload #90
/*     */     //   1897: ldc_w -407840262
/*     */     //   1900: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   1903: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1906: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   1909: aload #90
/*     */     //   1911: bipush #6
/*     */     //   1913: bipush #112
/*     */     //   1915: iload #71
/*     */     //   1917: bipush #6
/*     */     //   1919: ishr
/*     */     //   1920: iand
/*     */     //   1921: ior
/*     */     //   1922: istore #92
/*     */     //   1924: astore #93
/*     */     //   1926: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   1929: astore #94
/*     */     //   1931: iconst_0
/*     */     //   1932: istore #95
/*     */     //   1934: aload #94
/*     */     //   1936: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1939: checkcast androidx/compose/ui/Modifier
/*     */     //   1942: fconst_1
/*     */     //   1943: iconst_0
/*     */     //   1944: invokeinterface weight : (Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;
/*     */     //   1949: astore #96
/*     */     //   1951: aload_0
/*     */     //   1952: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   1955: astore #97
/*     */     //   1957: aload #93
/*     */     //   1959: iconst_0
/*     */     //   1960: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   1963: aload #93
/*     */     //   1965: getstatic com/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData.$stable : I
/*     */     //   1968: invokevirtual getMessageFont : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/font/FontFamily;
/*     */     //   1971: astore #98
/*     */     //   1973: getstatic androidx/compose/ui/text/style/TextOverflow.Companion : Landroidx/compose/ui/text/style/TextOverflow$Companion;
/*     */     //   1976: invokevirtual getEllipsis-gIe3tQ8 : ()I
/*     */     //   1979: istore #99
/*     */     //   1981: aload #97
/*     */     //   1983: aload #96
/*     */     //   1985: lload #4
/*     */     //   1987: lconst_0
/*     */     //   1988: aconst_null
/*     */     //   1989: aconst_null
/*     */     //   1990: aload #98
/*     */     //   1992: lconst_0
/*     */     //   1993: aconst_null
/*     */     //   1994: iconst_0
/*     */     //   1995: lconst_0
/*     */     //   1996: iload #99
/*     */     //   1998: iconst_0
/*     */     //   1999: iconst_1
/*     */     //   2000: aload #93
/*     */     //   2002: ldc_w 693143784
/*     */     //   2005: invokeinterface startReplaceGroup : (I)V
/*     */     //   2010: aload #93
/*     */     //   2012: astore #100
/*     */     //   2014: iconst_0
/*     */     //   2015: istore #101
/*     */     //   2017: nop
/*     */     //   2018: iconst_0
/*     */     //   2019: istore #102
/*     */     //   2021: aload #100
/*     */     //   2023: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2028: astore #103
/*     */     //   2030: iconst_0
/*     */     //   2031: istore #104
/*     */     //   2033: aload #103
/*     */     //   2035: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2038: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2041: if_acmpne -> 2130
/*     */     //   2044: istore #105
/*     */     //   2046: istore #106
/*     */     //   2048: istore #107
/*     */     //   2050: lstore #108
/*     */     //   2052: istore #110
/*     */     //   2054: astore #111
/*     */     //   2056: lstore #112
/*     */     //   2058: astore #114
/*     */     //   2060: astore #115
/*     */     //   2062: astore #116
/*     */     //   2064: lstore #117
/*     */     //   2066: lstore #119
/*     */     //   2068: astore #121
/*     */     //   2070: astore #122
/*     */     //   2072: iconst_0
/*     */     //   2073: istore #123
/*     */     //   2075: aload #13
/*     */     //   2077: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   2082: astore #124
/*     */     //   2084: aload #122
/*     */     //   2086: aload #121
/*     */     //   2088: lload #119
/*     */     //   2090: lload #117
/*     */     //   2092: aload #116
/*     */     //   2094: aload #115
/*     */     //   2096: aload #114
/*     */     //   2098: lload #112
/*     */     //   2100: aload #111
/*     */     //   2102: iload #110
/*     */     //   2104: lload #108
/*     */     //   2106: iload #107
/*     */     //   2108: iload #106
/*     */     //   2110: iload #105
/*     */     //   2112: aload #124
/*     */     //   2114: astore #125
/*     */     //   2116: aload #100
/*     */     //   2118: aload #125
/*     */     //   2120: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2125: aload #125
/*     */     //   2127: goto -> 2132
/*     */     //   2130: aload #103
/*     */     //   2132: nop
/*     */     //   2133: nop
/*     */     //   2134: nop
/*     */     //   2135: checkcast kotlin/jvm/functions/Function1
/*     */     //   2138: astore #126
/*     */     //   2140: aload #93
/*     */     //   2142: invokeinterface endReplaceGroup : ()V
/*     */     //   2147: aload #126
/*     */     //   2149: aconst_null
/*     */     //   2150: aload #93
/*     */     //   2152: sipush #896
/*     */     //   2155: iload #12
/*     */     //   2157: iconst_3
/*     */     //   2158: ishr
/*     */     //   2159: iand
/*     */     //   2160: sipush #27696
/*     */     //   2163: ldc_w 38840
/*     */     //   2166: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   2169: aload #93
/*     */     //   2171: ldc_w 693145794
/*     */     //   2174: invokeinterface startReplaceGroup : (I)V
/*     */     //   2179: aload_0
/*     */     //   2180: invokevirtual getLinesAdded : ()I
/*     */     //   2183: ifle -> 2294
/*     */     //   2186: aload_0
/*     */     //   2187: invokevirtual getLinesAdded : ()I
/*     */     //   2190: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */     //   2195: astore #96
/*     */     //   2197: aload #93
/*     */     //   2199: iconst_0
/*     */     //   2200: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   2203: aload #93
/*     */     //   2205: getstatic com/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData.$stable : I
/*     */     //   2208: invokevirtual getMessageFont : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/font/FontFamily;
/*     */     //   2211: astore #97
/*     */     //   2213: aload #93
/*     */     //   2215: iconst_0
/*     */     //   2216: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   2219: invokevirtual getAddedLinesColor-0d7_KjU : ()J
/*     */     //   2222: lstore #127
/*     */     //   2224: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
/*     */     //   2227: invokevirtual getSemiBold : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   2230: astore #126
/*     */     //   2232: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   2235: checkcast androidx/compose/ui/Modifier
/*     */     //   2238: iconst_4
/*     */     //   2239: istore #101
/*     */     //   2241: iconst_0
/*     */     //   2242: istore #102
/*     */     //   2244: iload #101
/*     */     //   2246: i2f
/*     */     //   2247: invokestatic constructor-impl : (F)F
/*     */     //   2250: fconst_0
/*     */     //   2251: fconst_0
/*     */     //   2252: fconst_0
/*     */     //   2253: bipush #14
/*     */     //   2255: aconst_null
/*     */     //   2256: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2259: astore #100
/*     */     //   2261: aload #96
/*     */     //   2263: aload #100
/*     */     //   2265: lload #127
/*     */     //   2267: lconst_0
/*     */     //   2268: aconst_null
/*     */     //   2269: aload #126
/*     */     //   2271: aload #97
/*     */     //   2273: lconst_0
/*     */     //   2274: aconst_null
/*     */     //   2275: iconst_0
/*     */     //   2276: lconst_0
/*     */     //   2277: iconst_0
/*     */     //   2278: iconst_0
/*     */     //   2279: iconst_0
/*     */     //   2280: aconst_null
/*     */     //   2281: aconst_null
/*     */     //   2282: aload #93
/*     */     //   2284: ldc_w 196656
/*     */     //   2287: iconst_0
/*     */     //   2288: ldc_w 65432
/*     */     //   2291: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   2294: aload #93
/*     */     //   2296: invokeinterface endReplaceGroup : ()V
/*     */     //   2301: aload #93
/*     */     //   2303: ldc_w 693156232
/*     */     //   2306: invokeinterface startReplaceGroup : (I)V
/*     */     //   2311: aload_0
/*     */     //   2312: invokevirtual getLinesRemoved : ()I
/*     */     //   2315: ifle -> 2426
/*     */     //   2318: aload_0
/*     */     //   2319: invokevirtual getLinesRemoved : ()I
/*     */     //   2322: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */     //   2327: astore #96
/*     */     //   2329: aload #93
/*     */     //   2331: iconst_0
/*     */     //   2332: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   2335: aload #93
/*     */     //   2337: getstatic com/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData.$stable : I
/*     */     //   2340: invokevirtual getMessageFont : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/font/FontFamily;
/*     */     //   2343: astore #97
/*     */     //   2345: aload #93
/*     */     //   2347: iconst_0
/*     */     //   2348: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   2351: invokevirtual getRemovedLinesColor-0d7_KjU : ()J
/*     */     //   2354: lstore #127
/*     */     //   2356: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
/*     */     //   2359: invokevirtual getSemiBold : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   2362: astore #126
/*     */     //   2364: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   2367: checkcast androidx/compose/ui/Modifier
/*     */     //   2370: iconst_4
/*     */     //   2371: istore #101
/*     */     //   2373: iconst_0
/*     */     //   2374: istore #102
/*     */     //   2376: iload #101
/*     */     //   2378: i2f
/*     */     //   2379: invokestatic constructor-impl : (F)F
/*     */     //   2382: fconst_0
/*     */     //   2383: fconst_0
/*     */     //   2384: fconst_0
/*     */     //   2385: bipush #14
/*     */     //   2387: aconst_null
/*     */     //   2388: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2391: astore #100
/*     */     //   2393: aload #96
/*     */     //   2395: aload #100
/*     */     //   2397: lload #127
/*     */     //   2399: lconst_0
/*     */     //   2400: aconst_null
/*     */     //   2401: aload #126
/*     */     //   2403: aload #97
/*     */     //   2405: lconst_0
/*     */     //   2406: aconst_null
/*     */     //   2407: iconst_0
/*     */     //   2408: lconst_0
/*     */     //   2409: iconst_0
/*     */     //   2410: iconst_0
/*     */     //   2411: iconst_0
/*     */     //   2412: aconst_null
/*     */     //   2413: aconst_null
/*     */     //   2414: aload #93
/*     */     //   2416: ldc_w 196656
/*     */     //   2419: iconst_0
/*     */     //   2420: ldc_w 65432
/*     */     //   2423: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   2426: aload #93
/*     */     //   2428: invokeinterface endReplaceGroup : ()V
/*     */     //   2433: nop
/*     */     //   2434: aload #90
/*     */     //   2436: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2439: aload #66
/*     */     //   2441: invokeinterface endNode : ()V
/*     */     //   2446: aload #66
/*     */     //   2448: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2451: nop
/*     */     //   2452: aload #66
/*     */     //   2454: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2457: nop
/*     */     //   2458: aload #66
/*     */     //   2460: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2463: nop
/*     */     //   2464: aload #66
/*     */     //   2466: ldc_w -886670888
/*     */     //   2469: invokeinterface startReplaceGroup : (I)V
/*     */     //   2474: iload_3
/*     */     //   2475: ifeq -> 2928
/*     */     //   2478: iload #7
/*     */     //   2480: ifeq -> 2928
/*     */     //   2483: iconst_0
/*     */     //   2484: istore #71
/*     */     //   2486: nop
/*     */     //   2487: iconst_0
/*     */     //   2488: istore #72
/*     */     //   2490: aload #66
/*     */     //   2492: ldc_w 693286680
/*     */     //   2495: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   2498: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2501: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   2504: checkcast androidx/compose/ui/Modifier
/*     */     //   2507: astore #69
/*     */     //   2509: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   2512: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   2515: astore #73
/*     */     //   2517: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   2520: invokevirtual getTop : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   2523: astore #70
/*     */     //   2525: aload #73
/*     */     //   2527: aload #70
/*     */     //   2529: aload #66
/*     */     //   2531: bipush #14
/*     */     //   2533: iload #71
/*     */     //   2535: iconst_3
/*     */     //   2536: ishr
/*     */     //   2537: iand
/*     */     //   2538: bipush #112
/*     */     //   2540: iload #71
/*     */     //   2542: iconst_3
/*     */     //   2543: ishr
/*     */     //   2544: iand
/*     */     //   2545: ior
/*     */     //   2546: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2549: astore #74
/*     */     //   2551: bipush #112
/*     */     //   2553: iload #71
/*     */     //   2555: iconst_3
/*     */     //   2556: ishl
/*     */     //   2557: iand
/*     */     //   2558: istore #75
/*     */     //   2560: nop
/*     */     //   2561: iconst_0
/*     */     //   2562: istore #76
/*     */     //   2564: aload #66
/*     */     //   2566: ldc -1323940314
/*     */     //   2568: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   2570: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2573: aload #66
/*     */     //   2575: iconst_0
/*     */     //   2576: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   2579: istore #77
/*     */     //   2581: aload #66
/*     */     //   2583: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   2588: astore #78
/*     */     //   2590: aload #66
/*     */     //   2592: aload #69
/*     */     //   2594: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   2597: astore #79
/*     */     //   2599: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2602: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   2605: astore #80
/*     */     //   2607: bipush #6
/*     */     //   2609: sipush #896
/*     */     //   2612: iload #75
/*     */     //   2614: bipush #6
/*     */     //   2616: ishl
/*     */     //   2617: iand
/*     */     //   2618: ior
/*     */     //   2619: istore #81
/*     */     //   2621: nop
/*     */     //   2622: iconst_0
/*     */     //   2623: istore #82
/*     */     //   2625: aload #66
/*     */     //   2627: ldc -692256719
/*     */     //   2629: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   2631: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2634: aload #66
/*     */     //   2636: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   2641: instanceof androidx/compose/runtime/Applier
/*     */     //   2644: ifne -> 2650
/*     */     //   2647: invokestatic invalidApplier : ()V
/*     */     //   2650: aload #66
/*     */     //   2652: invokeinterface startReusableNode : ()V
/*     */     //   2657: aload #66
/*     */     //   2659: invokeinterface getInserting : ()Z
/*     */     //   2664: ifeq -> 2679
/*     */     //   2667: aload #66
/*     */     //   2669: aload #80
/*     */     //   2671: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   2676: goto -> 2686
/*     */     //   2679: aload #66
/*     */     //   2681: invokeinterface useNode : ()V
/*     */     //   2686: aload #66
/*     */     //   2688: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   2691: astore #83
/*     */     //   2693: iconst_0
/*     */     //   2694: istore #84
/*     */     //   2696: aload #83
/*     */     //   2698: aload #74
/*     */     //   2700: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2703: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2706: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2709: aload #83
/*     */     //   2711: aload #78
/*     */     //   2713: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2716: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2719: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2722: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2725: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2728: astore #85
/*     */     //   2730: iconst_0
/*     */     //   2731: istore #86
/*     */     //   2733: aload #83
/*     */     //   2735: astore #87
/*     */     //   2737: iconst_0
/*     */     //   2738: istore #88
/*     */     //   2740: aload #87
/*     */     //   2742: invokeinterface getInserting : ()Z
/*     */     //   2747: ifne -> 2768
/*     */     //   2750: aload #87
/*     */     //   2752: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2757: iload #77
/*     */     //   2759: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2762: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   2765: ifne -> 2794
/*     */     //   2768: aload #87
/*     */     //   2770: iload #77
/*     */     //   2772: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2775: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2780: aload #83
/*     */     //   2782: iload #77
/*     */     //   2784: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2787: aload #85
/*     */     //   2789: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2794: nop
/*     */     //   2795: nop
/*     */     //   2796: nop
/*     */     //   2797: aload #83
/*     */     //   2799: aload #79
/*     */     //   2801: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2804: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2807: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2810: nop
/*     */     //   2811: nop
/*     */     //   2812: aload #66
/*     */     //   2814: bipush #14
/*     */     //   2816: iload #81
/*     */     //   2818: bipush #6
/*     */     //   2820: ishr
/*     */     //   2821: iand
/*     */     //   2822: istore #89
/*     */     //   2824: astore #90
/*     */     //   2826: iconst_0
/*     */     //   2827: istore #91
/*     */     //   2829: aload #90
/*     */     //   2831: ldc_w -407840262
/*     */     //   2834: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   2837: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2840: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   2843: aload #90
/*     */     //   2845: bipush #6
/*     */     //   2847: bipush #112
/*     */     //   2849: iload #71
/*     */     //   2851: bipush #6
/*     */     //   2853: ishr
/*     */     //   2854: iand
/*     */     //   2855: ior
/*     */     //   2856: istore #92
/*     */     //   2858: astore #93
/*     */     //   2860: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   2863: astore #94
/*     */     //   2865: iconst_0
/*     */     //   2866: istore #95
/*     */     //   2868: aload #8
/*     */     //   2870: aload #94
/*     */     //   2872: aload #93
/*     */     //   2874: bipush #14
/*     */     //   2876: iload #92
/*     */     //   2878: iand
/*     */     //   2879: bipush #112
/*     */     //   2881: iload #12
/*     */     //   2883: bipush #15
/*     */     //   2885: ishr
/*     */     //   2886: iand
/*     */     //   2887: ior
/*     */     //   2888: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2891: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   2896: pop
/*     */     //   2897: nop
/*     */     //   2898: aload #90
/*     */     //   2900: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2903: aload #66
/*     */     //   2905: invokeinterface endNode : ()V
/*     */     //   2910: aload #66
/*     */     //   2912: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2915: nop
/*     */     //   2916: aload #66
/*     */     //   2918: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2921: nop
/*     */     //   2922: aload #66
/*     */     //   2924: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2927: nop
/*     */     //   2928: aload #66
/*     */     //   2930: invokeinterface endReplaceGroup : ()V
/*     */     //   2935: nop
/*     */     //   2936: aload #63
/*     */     //   2938: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2941: aload #38
/*     */     //   2943: invokeinterface endNode : ()V
/*     */     //   2948: aload #38
/*     */     //   2950: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2953: nop
/*     */     //   2954: aload #38
/*     */     //   2956: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2959: nop
/*     */     //   2960: aload #38
/*     */     //   2962: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2965: nop
/*     */     //   2966: nop
/*     */     //   2967: aload #35
/*     */     //   2969: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2972: aload #9
/*     */     //   2974: invokeinterface endNode : ()V
/*     */     //   2979: aload #9
/*     */     //   2981: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2984: nop
/*     */     //   2985: aload #9
/*     */     //   2987: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2990: nop
/*     */     //   2991: aload #9
/*     */     //   2993: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2996: nop
/*     */     //   2997: invokestatic isTraceInProgress : ()Z
/*     */     //   3000: ifeq -> 3016
/*     */     //   3003: invokestatic traceEventEnd : ()V
/*     */     //   3006: goto -> 3016
/*     */     //   3009: aload #9
/*     */     //   3011: invokeinterface skipToGroupEnd : ()V
/*     */     //   3016: aload #9
/*     */     //   3018: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   3023: dup
/*     */     //   3024: ifnull -> 3055
/*     */     //   3027: aload_0
/*     */     //   3028: lload_1
/*     */     //   3029: iload_3
/*     */     //   3030: lload #4
/*     */     //   3032: aload #6
/*     */     //   3034: iload #7
/*     */     //   3036: aload #8
/*     */     //   3038: iload #10
/*     */     //   3040: iload #11
/*     */     //   3042: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;JZJLkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function3;II)Lkotlin/jvm/functions/Function2;
/*     */     //   3047: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   3052: goto -> 3056
/*     */     //   3055: pop
/*     */     //   3056: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #214	-> 0
/*     */     //   #212	-> 404
/*     */     //   #214	-> 438
/*     */     //   #215	-> 458
/*     */     //   #411	-> 462
/*     */     //   #412	-> 474
/*     */     //   #413	-> 485
/*     */     //   #215	-> 488
/*     */     //   #413	-> 498
/*     */     //   #414	-> 500
/*     */     //   #415	-> 509
/*     */     //   #416	-> 514
/*     */     //   #412	-> 516
/*     */     //   #411	-> 517
/*     */     //   #411	-> 518
/*     */     //   #215	-> 519
/*     */     //   #216	-> 535
/*     */     //   #417	-> 583
/*     */     //   #418	-> 586
/*     */     //   #419	-> 594
/*     */     //   #422	-> 602
/*     */     //   #423	-> 637
/*     */     //   #424	-> 647
/*     */     //   #425	-> 653
/*     */     //   #426	-> 660
/*     */     //   #427	-> 669
/*     */     //   #429	-> 676
/*     */     //   #428	-> 698
/*     */     //   #430	-> 708
/*     */     //   #431	-> 711
/*     */     //   #432	-> 729
/*     */     //   #433	-> 734
/*     */     //   #434	-> 746
/*     */     //   #436	-> 758
/*     */     //   #438	-> 763
/*     */     //   #439	-> 773
/*     */     //   #440	-> 786
/*     */     //   #442	-> 799
/*     */     //   #443	-> 810
/*     */     //   #444	-> 817
/*     */     //   #445	-> 845
/*     */     //   #446	-> 857
/*     */     //   #448	-> 871
/*     */     //   #443	-> 872
/*     */     //   #448	-> 873
/*     */     //   #449	-> 874
/*     */     //   #450	-> 887
/*     */     //   #438	-> 888
/*     */     //   #451	-> 889
/*     */     //   #452	-> 914
/*     */     //   #218	-> 945
/*     */     //   #219	-> 951
/*     */     //   #453	-> 958
/*     */     //   #219	-> 964
/*     */     //   #220	-> 973
/*     */     //   #454	-> 980
/*     */     //   #220	-> 986
/*     */     //   #221	-> 989
/*     */     //   #223	-> 1013
/*     */     //   #455	-> 1017
/*     */     //   #456	-> 1029
/*     */     //   #457	-> 1040
/*     */     //   #223	-> 1045
/*     */     //   #457	-> 1051
/*     */     //   #458	-> 1053
/*     */     //   #459	-> 1062
/*     */     //   #460	-> 1067
/*     */     //   #456	-> 1069
/*     */     //   #455	-> 1070
/*     */     //   #455	-> 1071
/*     */     //   #223	-> 1072
/*     */     //   #224	-> 1086
/*     */     //   #222	-> 1087
/*     */     //   #225	-> 1090
/*     */     //   #222	-> 1092
/*     */     //   #227	-> 1098
/*     */     //   #228	-> 1105
/*     */     //   #461	-> 1112
/*     */     //   #228	-> 1118
/*     */     //   #461	-> 1124
/*     */     //   #228	-> 1130
/*     */     //   #229	-> 1135
/*     */     //   #217	-> 1148
/*     */     //   #462	-> 1160
/*     */     //   #463	-> 1163
/*     */     //   #467	-> 1171
/*     */     //   #468	-> 1206
/*     */     //   #469	-> 1216
/*     */     //   #470	-> 1222
/*     */     //   #471	-> 1229
/*     */     //   #472	-> 1238
/*     */     //   #474	-> 1245
/*     */     //   #473	-> 1267
/*     */     //   #475	-> 1277
/*     */     //   #476	-> 1280
/*     */     //   #477	-> 1298
/*     */     //   #478	-> 1303
/*     */     //   #479	-> 1315
/*     */     //   #481	-> 1327
/*     */     //   #483	-> 1332
/*     */     //   #484	-> 1342
/*     */     //   #485	-> 1355
/*     */     //   #487	-> 1368
/*     */     //   #488	-> 1379
/*     */     //   #489	-> 1386
/*     */     //   #490	-> 1414
/*     */     //   #491	-> 1426
/*     */     //   #493	-> 1440
/*     */     //   #488	-> 1441
/*     */     //   #493	-> 1442
/*     */     //   #494	-> 1443
/*     */     //   #495	-> 1456
/*     */     //   #483	-> 1457
/*     */     //   #496	-> 1458
/*     */     //   #497	-> 1483
/*     */     //   #232	-> 1514
/*     */     //   #233	-> 1555
/*     */     //   #231	-> 1568
/*     */     //   #498	-> 1580
/*     */     //   #499	-> 1583
/*     */     //   #503	-> 1591
/*     */     //   #504	-> 1626
/*     */     //   #505	-> 1636
/*     */     //   #506	-> 1642
/*     */     //   #507	-> 1649
/*     */     //   #508	-> 1658
/*     */     //   #510	-> 1665
/*     */     //   #509	-> 1687
/*     */     //   #511	-> 1697
/*     */     //   #512	-> 1700
/*     */     //   #513	-> 1718
/*     */     //   #514	-> 1723
/*     */     //   #515	-> 1735
/*     */     //   #517	-> 1747
/*     */     //   #519	-> 1752
/*     */     //   #520	-> 1762
/*     */     //   #521	-> 1775
/*     */     //   #523	-> 1788
/*     */     //   #524	-> 1799
/*     */     //   #525	-> 1806
/*     */     //   #526	-> 1834
/*     */     //   #527	-> 1846
/*     */     //   #529	-> 1860
/*     */     //   #524	-> 1861
/*     */     //   #529	-> 1862
/*     */     //   #530	-> 1863
/*     */     //   #531	-> 1876
/*     */     //   #519	-> 1877
/*     */     //   #532	-> 1878
/*     */     //   #533	-> 1903
/*     */     //   #236	-> 1934
/*     */     //   #237	-> 1951
/*     */     //   #238	-> 1960
/*     */     //   #241	-> 1973
/*     */     //   #237	-> 1981
/*     */     //   #236	-> 1983
/*     */     //   #240	-> 1985
/*     */     //   #238	-> 1990
/*     */     //   #241	-> 1996
/*     */     //   #239	-> 1999
/*     */     //   #242	-> 2017
/*     */     //   #534	-> 2021
/*     */     //   #535	-> 2033
/*     */     //   #536	-> 2044
/*     */     //   #242	-> 2075
/*     */     //   #536	-> 2114
/*     */     //   #537	-> 2116
/*     */     //   #538	-> 2125
/*     */     //   #539	-> 2130
/*     */     //   #535	-> 2132
/*     */     //   #534	-> 2133
/*     */     //   #534	-> 2134
/*     */     //   #242	-> 2135
/*     */     //   #235	-> 2166
/*     */     //   #244	-> 2179
/*     */     //   #246	-> 2186
/*     */     //   #247	-> 2200
/*     */     //   #248	-> 2216
/*     */     //   #249	-> 2224
/*     */     //   #250	-> 2232
/*     */     //   #540	-> 2244
/*     */     //   #250	-> 2250
/*     */     //   #246	-> 2261
/*     */     //   #250	-> 2263
/*     */     //   #248	-> 2265
/*     */     //   #249	-> 2269
/*     */     //   #247	-> 2271
/*     */     //   #245	-> 2291
/*     */     //   #253	-> 2311
/*     */     //   #255	-> 2318
/*     */     //   #256	-> 2332
/*     */     //   #257	-> 2348
/*     */     //   #258	-> 2356
/*     */     //   #259	-> 2364
/*     */     //   #541	-> 2376
/*     */     //   #259	-> 2382
/*     */     //   #255	-> 2393
/*     */     //   #259	-> 2395
/*     */     //   #257	-> 2397
/*     */     //   #258	-> 2401
/*     */     //   #256	-> 2403
/*     */     //   #254	-> 2423
/*     */     //   #262	-> 2433
/*     */     //   #533	-> 2434
/*     */     //   #532	-> 2439
/*     */     //   #542	-> 2441
/*     */     //   #511	-> 2448
/*     */     //   #543	-> 2451
/*     */     //   #505	-> 2454
/*     */     //   #544	-> 2457
/*     */     //   #498	-> 2460
/*     */     //   #545	-> 2463
/*     */     //   #263	-> 2474
/*     */     //   #264	-> 2486
/*     */     //   #546	-> 2498
/*     */     //   #547	-> 2501
/*     */     //   #548	-> 2509
/*     */     //   #549	-> 2517
/*     */     //   #552	-> 2525
/*     */     //   #553	-> 2560
/*     */     //   #554	-> 2570
/*     */     //   #555	-> 2576
/*     */     //   #556	-> 2583
/*     */     //   #557	-> 2592
/*     */     //   #559	-> 2599
/*     */     //   #558	-> 2621
/*     */     //   #560	-> 2631
/*     */     //   #561	-> 2634
/*     */     //   #562	-> 2652
/*     */     //   #563	-> 2657
/*     */     //   #564	-> 2669
/*     */     //   #566	-> 2681
/*     */     //   #568	-> 2686
/*     */     //   #569	-> 2696
/*     */     //   #570	-> 2709
/*     */     //   #572	-> 2722
/*     */     //   #573	-> 2733
/*     */     //   #574	-> 2740
/*     */     //   #575	-> 2768
/*     */     //   #576	-> 2780
/*     */     //   #578	-> 2794
/*     */     //   #573	-> 2795
/*     */     //   #578	-> 2796
/*     */     //   #579	-> 2797
/*     */     //   #580	-> 2810
/*     */     //   #568	-> 2811
/*     */     //   #581	-> 2812
/*     */     //   #582	-> 2837
/*     */     //   #265	-> 2868
/*     */     //   #266	-> 2897
/*     */     //   #582	-> 2898
/*     */     //   #581	-> 2903
/*     */     //   #583	-> 2905
/*     */     //   #560	-> 2912
/*     */     //   #584	-> 2915
/*     */     //   #554	-> 2918
/*     */     //   #585	-> 2921
/*     */     //   #546	-> 2924
/*     */     //   #586	-> 2927
/*     */     //   #268	-> 2935
/*     */     //   #497	-> 2936
/*     */     //   #496	-> 2941
/*     */     //   #587	-> 2943
/*     */     //   #475	-> 2950
/*     */     //   #588	-> 2953
/*     */     //   #469	-> 2956
/*     */     //   #589	-> 2959
/*     */     //   #462	-> 2962
/*     */     //   #590	-> 2965
/*     */     //   #269	-> 2966
/*     */     //   #452	-> 2967
/*     */     //   #451	-> 2972
/*     */     //   #591	-> 2974
/*     */     //   #430	-> 2981
/*     */     //   #592	-> 2984
/*     */     //   #424	-> 2987
/*     */     //   #593	-> 2990
/*     */     //   #417	-> 2993
/*     */     //   #594	-> 2996
/*     */     //   #270	-> 3009
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   488	10	20	$i$a$-cache-FileChangeKt$FileChangeItem$overflow$2	I
/*     */     //   500	11	20	value$iv	Ljava/lang/Object;
/*     */     //   474	43	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   471	46	18	it$iv	Ljava/lang/Object;
/*     */     //   462	57	17	$i$f$cache	I
/*     */     //   459	60	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   459	60	16	invalid$iv	Z
/*     */     //   958	6	42	$i$f$getDp	I
/*     */     //   955	9	41	$this$dp$iv	I
/*     */     //   980	6	42	$i$f$getDp	I
/*     */     //   977	9	41	$this$dp$iv	I
/*     */     //   1045	3	48	$i$a$-cache-FileChangeKt$FileChangeItem$1$1	I
/*     */     //   1053	11	48	value$iv	Ljava/lang/Object;
/*     */     //   1029	41	46	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1026	44	45	it$iv	Ljava/lang/Object;
/*     */     //   1017	55	44	$i$f$cache	I
/*     */     //   1014	58	42	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1014	58	43	invalid$iv	Z
/*     */     //   1112	6	42	$i$f$getDp	I
/*     */     //   1109	9	41	$this$dp$iv	I
/*     */     //   1124	6	42	$i$f$getDp	I
/*     */     //   1121	9	41	$this$dp$iv	I
/*     */     //   2075	7	123	$i$a$-cache-FileChangeKt$FileChangeItem$1$2$1$1	I
/*     */     //   2116	11	125	value$iv	Ljava/lang/Object;
/*     */     //   2033	100	104	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   2030	103	103	it$iv	Ljava/lang/Object;
/*     */     //   2021	114	102	$i$f$cache	I
/*     */     //   2018	117	100	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2018	117	101	invalid$iv	Z
/*     */     //   2244	6	102	$i$f$getDp	I
/*     */     //   2241	9	101	$this$dp$iv	I
/*     */     //   2376	6	102	$i$f$getDp	I
/*     */     //   2373	9	101	$this$dp$iv	I
/*     */     //   1934	500	95	$i$a$-Row-FileChangeKt$FileChangeItem$1$2$1	I
/*     */     //   1931	503	94	$this$FileChangeItem_gg3fqwA_u24lambda_u2428_u24lambda_u2427_u24lambda_u2425	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   1931	503	93	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1931	503	92	$changed	I
/*     */     //   1895	544	91	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   1892	547	90	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1892	547	89	$changed$iv	I
/*     */     //   1806	55	88	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1803	58	87	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1799	64	86	$i$f$set-impl	I
/*     */     //   1796	67	85	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1762	115	84	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1759	118	83	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1691	761	82	$i$f$ReusableComposeNode	I
/*     */     //   1688	764	80	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1688	764	81	$changed$iv$iv$iv	I
/*     */     //   1630	828	76	$i$f$Layout	I
/*     */     //   1647	811	77	compositeKeyHash$iv$iv	I
/*     */     //   1656	802	78	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1665	793	79	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1627	831	75	$changed$iv$iv	I
/*     */     //   1572	892	72	$i$f$Row	I
/*     */     //   1617	847	74	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1569	895	69	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1591	873	73	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   1569	895	70	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   1569	895	71	$changed$iv	I
/*     */     //   2868	30	95	$i$a$-Row-FileChangeKt$FileChangeItem$1$2$2	I
/*     */     //   2865	33	94	$this$FileChangeItem_gg3fqwA_u24lambda_u2428_u24lambda_u2427_u24lambda_u2426	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   2865	33	93	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   2865	33	92	$changed	I
/*     */     //   2829	74	91	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   2826	77	90	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2826	77	89	$changed$iv	I
/*     */     //   2740	55	88	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   2737	58	87	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2733	64	86	$i$f$set-impl	I
/*     */     //   2730	67	85	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   2696	115	84	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   2693	118	83	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2625	291	82	$i$f$ReusableComposeNode	I
/*     */     //   2622	294	80	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   2622	294	81	$changed$iv$iv$iv	I
/*     */     //   2564	358	76	$i$f$Layout	I
/*     */     //   2581	341	77	compositeKeyHash$iv$iv	I
/*     */     //   2590	332	78	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   2599	323	79	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2561	361	75	$changed$iv$iv	I
/*     */     //   2490	438	72	$i$f$Row	I
/*     */     //   2551	377	74	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2509	419	69	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2517	411	73	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   2525	403	70	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   2487	441	71	$changed$iv	I
/*     */     //   1514	1422	68	$i$a$-Row-FileChangeKt$FileChangeItem$1$2	I
/*     */     //   1511	1425	67	$this$FileChangeItem_gg3fqwA_u24lambda_u2428_u24lambda_u2427	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   1511	1425	66	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1511	1425	65	$changed	I
/*     */     //   1475	1466	64	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   1472	1469	63	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1472	1469	62	$changed$iv	I
/*     */     //   1386	55	61	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1383	58	60	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1379	64	59	$i$f$set-impl	I
/*     */     //   1376	67	58	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1342	115	57	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1339	118	56	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1271	1683	55	$i$f$ReusableComposeNode	I
/*     */     //   1268	1686	53	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1268	1686	54	$changed$iv$iv$iv	I
/*     */     //   1210	1750	49	$i$f$Layout	I
/*     */     //   1227	1733	50	compositeKeyHash$iv$iv	I
/*     */     //   1236	1724	51	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1245	1715	52	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1207	1753	48	$changed$iv$iv	I
/*     */     //   1152	1814	45	$i$f$Row	I
/*     */     //   1197	1769	46	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1149	1817	41	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1171	1795	42	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   1149	1817	43	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   1149	1817	44	$changed$iv	I
/*     */     //   945	2022	40	$i$a$-Row-FileChangeKt$FileChangeItem$1	I
/*     */     //   942	2025	39	$this$FileChangeItem_gg3fqwA_u24lambda_u2428	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   942	2025	38	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   942	2025	37	$changed	I
/*     */     //   906	2066	36	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   903	2069	35	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   903	2069	34	$changed$iv	I
/*     */     //   817	55	33	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   814	58	32	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   810	64	31	$i$f$set-impl	I
/*     */     //   807	67	30	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   773	115	29	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   770	118	28	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   702	2283	27	$i$f$ReusableComposeNode	I
/*     */     //   699	2286	25	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   699	2286	26	$changed$iv$iv$iv	I
/*     */     //   641	2350	21	$i$f$Layout	I
/*     */     //   658	2333	22	compositeKeyHash$iv$iv	I
/*     */     //   667	2324	23	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   676	2315	24	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   638	2353	20	$changed$iv$iv	I
/*     */     //   575	2422	18	$i$f$Row	I
/*     */     //   628	2369	19	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   572	2425	14	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   594	2403	15	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   602	2395	16	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   572	2425	17	$changed$iv	I
/*     */     //   535	2471	13	overflow$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   16	3041	12	$dirty	I
/*     */     //   0	3057	0	change	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*     */     //   0	3057	1	background	J
/*     */     //   0	3057	3	isHovered	Z
/*     */     //   0	3057	4	contentColor	J
/*     */     //   0	3057	6	onShowDiff	Lkotlin/jvm/functions/Function0;
/*     */     //   0	3057	7	showAction	Z
/*     */     //   0	3057	8	actions	Lkotlin/jvm/functions/Function3;
/*     */     //   0	3057	9	$composer	Landroidx/compose/runtime/Composer;
/* 602 */     //   0	3057	10	$changed	I } private static final void FileChangeItem_gg3fqwA$lambda$21(MutableState $overflow$delegate, boolean <set-?>) { MutableState mutableState = $overflow$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0; mutableState.setValue(value$iv); }
/*     */ 
/*     */   
/*     */   private static final Unit FileChangeItem_gg3fqwA$lambda$28$lambda$27$lambda$25$lambda$24$lambda$23(MutableState<Boolean> $overflow$delegate, TextLayoutResult it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     FileChangeItem_gg3fqwA$lambda$21($overflow$delegate, it.getHasVisualOverflow());
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit NewFileReport$lambda$6(FileChangeView $change, boolean $isCommitted, Function1<? super Continuation<? super Unit>, ? extends Object> $onLocate, Function1<? super Continuation<? super Unit>, ? extends Object> $onCommitAction, Function0<Unit> $onShowDiff, boolean $isProjectOnVCS, int $$changed, Composer $composer, int $force) {
/*     */     NewFileReport($change, $isCommitted, $onLocate, $onCommitAction, $onShowDiff, $isProjectOnVCS, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit FileChangeChip_K2djEUw$lambda$13(FileChangeView $change, long $backgroundColor, long $hoveredBackgroundColor, boolean $showAction, Function1<? super Continuation<? super Unit>, ? extends Object> $onRollBack, Function1<? super Continuation<? super Unit>, ? extends Object> $onLocate, Function0<Unit> $onShowDiff, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     FileChangeChip-K2djEUw($change, $backgroundColor, $hoveredBackgroundColor, $showAction, $onRollBack, $onLocate, $onShowDiff, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit FileChangeChipPrivate_oC9nPe0$lambda$16(FileChangeView $change, long $backGroundColor, boolean $isHovered, boolean $showAction, Function1<? super Continuation<? super Unit>, ? extends Object> $onLocate, Function1<? super Continuation<? super Unit>, ? extends Object> $onRollBack, Function0<Unit> $onShowDiff, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     FileChangeChipPrivate-oC9nPe0($change, $backGroundColor, $isHovered, $showAction, $onLocate, $onRollBack, $onShowDiff, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit NewFileChip_oC9nPe0$lambda$17(FileChangeView $change, long $background, boolean $isHovered, boolean $isCommitted, Function1<? super Continuation<? super Unit>, ? extends Object> $onJumpToSource, Function1<? super Continuation<? super Unit>, ? extends Object> $onCommitAction, Function0<Unit> $onShowDiff, boolean $isProjectOnVCS, int $$changed, Composer $composer, int $force) {
/*     */     NewFileChip-oC9nPe0($change, $background, $isHovered, $isCommitted, $onJumpToSource, $onCommitAction, $onShowDiff, $isProjectOnVCS, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit IconButtonWithTextTooltip$lambda$18(String $tooltipText, IconKey $iconKey, Function0<Unit> $onClick, int $$changed, Composer $composer, int $force) {
/*     */     IconButtonWithTextTooltip($tooltipText, $iconKey, $onClick, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit FileChangeItem_gg3fqwA$lambda$29(FileChangeView $change, long $background, boolean $isHovered, long $contentColor, Function0<Unit> $onShowDiff, boolean $showAction, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> $actions, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     FileChangeItem-gg3fqwA($change, $background, $isHovered, $contentColor, $onShowDiff, $showAction, $actions, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\FileChangeKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */