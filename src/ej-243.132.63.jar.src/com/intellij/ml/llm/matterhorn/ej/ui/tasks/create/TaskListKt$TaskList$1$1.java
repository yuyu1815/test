/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.create;
/*     */ 
/*     */ import androidx.compose.foundation.BackgroundKt;
/*     */ import androidx.compose.foundation.ContextMenuItem;
/*     */ import androidx.compose.foundation.ContextMenuProvider_desktopKt;
/*     */ import androidx.compose.foundation.layout.Arrangement;
/*     */ import androidx.compose.foundation.layout.ColumnKt;
/*     */ import androidx.compose.foundation.layout.ColumnScope;
/*     */ import androidx.compose.foundation.layout.ColumnScopeInstance;
/*     */ import androidx.compose.foundation.layout.PaddingKt;
/*     */ import androidx.compose.foundation.layout.SizeKt;
/*     */ import androidx.compose.foundation.shape.RoundedCornerShapeKt;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.graphics.Shape;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.RecentTaskChain;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeData;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function4;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyItemScope;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyListScope;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyListScopeKt;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyListState;
/*     */ import org.jetbrains.jewel.ui.component.TextKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nTaskList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskList.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/TaskListKt$TaskList$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,126:1\n1225#2,6:127\n*S KotlinDebug\n*F\n+ 1 TaskList.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/TaskListKt$TaskList$1$1\n*L\n64#1:127,6\n*E\n"})
/*     */ final class TaskListKt$TaskList$1$1
/*     */   implements Function2<Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: iload_2
/*     */     //   1: iconst_3
/*     */     //   2: iand
/*     */     //   3: iconst_2
/*     */     //   4: if_icmpne -> 16
/*     */     //   7: aload_1
/*     */     //   8: invokeinterface getSkipping : ()Z
/*     */     //   13: ifne -> 325
/*     */     //   16: invokestatic isTraceInProgress : ()Z
/*     */     //   19: ifeq -> 31
/*     */     //   22: ldc 1825471980
/*     */     //   24: iload_2
/*     */     //   25: iconst_m1
/*     */     //   26: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.TaskList.<anonymous>.<anonymous> (TaskList.kt:59)'
/*     */     //   28: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   31: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   34: checkcast androidx/compose/ui/Modifier
/*     */     //   37: aload_1
/*     */     //   38: iconst_0
/*     */     //   39: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   42: invokevirtual getBackgroundColor-0d7_KjU : ()J
/*     */     //   45: aconst_null
/*     */     //   46: iconst_2
/*     */     //   47: aconst_null
/*     */     //   48: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   51: aload_0
/*     */     //   52: getfield $insetHorizontalPadding : F
/*     */     //   55: fconst_0
/*     */     //   56: iconst_2
/*     */     //   57: aconst_null
/*     */     //   58: invokestatic padding-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   61: astore_3
/*     */     //   62: getstatic org/jetbrains/jewel/foundation/lazy/SelectionMode.Single : Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;
/*     */     //   65: astore #4
/*     */     //   67: aload_3
/*     */     //   68: aload #4
/*     */     //   70: aload_0
/*     */     //   71: getfield $selectableLazyListState : Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */     //   74: aconst_null
/*     */     //   75: iconst_0
/*     */     //   76: aconst_null
/*     */     //   77: aconst_null
/*     */     //   78: aconst_null
/*     */     //   79: aconst_null
/*     */     //   80: aconst_null
/*     */     //   81: aconst_null
/*     */     //   82: aconst_null
/*     */     //   83: aload_1
/*     */     //   84: ldc -1173285260
/*     */     //   86: invokeinterface startReplaceGroup : (I)V
/*     */     //   91: aload_1
/*     */     //   92: astore #6
/*     */     //   94: aload_1
/*     */     //   95: aload_0
/*     */     //   96: getfield $recentTasks : Ljava/util/List;
/*     */     //   99: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   104: aload_1
/*     */     //   105: aload_0
/*     */     //   106: getfield $contentBackground : J
/*     */     //   109: invokeinterface changed : (J)Z
/*     */     //   114: ior
/*     */     //   115: aload_1
/*     */     //   116: aload_0
/*     */     //   117: getfield $actionFactory : Lkotlin/jvm/functions/Function2;
/*     */     //   120: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   125: ior
/*     */     //   126: aload_1
/*     */     //   127: aload_0
/*     */     //   128: getfield $onTaskDoubleClicked : Lkotlin/jvm/functions/Function1;
/*     */     //   131: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   136: ior
/*     */     //   137: istore #7
/*     */     //   139: aload_0
/*     */     //   140: getfield $recentTasks : Ljava/util/List;
/*     */     //   143: astore #8
/*     */     //   145: aload_0
/*     */     //   146: getfield $contentBackground : J
/*     */     //   149: lstore #9
/*     */     //   151: aload_0
/*     */     //   152: getfield $actionFactory : Lkotlin/jvm/functions/Function2;
/*     */     //   155: astore #11
/*     */     //   157: aload_0
/*     */     //   158: getfield $onTaskDoubleClicked : Lkotlin/jvm/functions/Function1;
/*     */     //   161: astore #12
/*     */     //   163: iconst_0
/*     */     //   164: istore #13
/*     */     //   166: aload #6
/*     */     //   168: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   173: astore #14
/*     */     //   175: iconst_0
/*     */     //   176: istore #15
/*     */     //   178: iload #7
/*     */     //   180: ifne -> 194
/*     */     //   183: aload #14
/*     */     //   185: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   188: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   191: if_acmpne -> 278
/*     */     //   194: astore #29
/*     */     //   196: astore #28
/*     */     //   198: astore #27
/*     */     //   200: astore #26
/*     */     //   202: astore #25
/*     */     //   204: astore #24
/*     */     //   206: astore #23
/*     */     //   208: istore #22
/*     */     //   210: astore #21
/*     */     //   212: astore #20
/*     */     //   214: astore #19
/*     */     //   216: astore #18
/*     */     //   218: iconst_0
/*     */     //   219: istore #16
/*     */     //   221: aload #8
/*     */     //   223: lload #9
/*     */     //   225: aload #11
/*     */     //   227: aload #12
/*     */     //   229: <illegal opcode> invoke : (Ljava/util/List;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;
/*     */     //   234: astore #30
/*     */     //   236: aload #18
/*     */     //   238: aload #19
/*     */     //   240: aload #20
/*     */     //   242: aload #21
/*     */     //   244: iload #22
/*     */     //   246: aload #23
/*     */     //   248: aload #24
/*     */     //   250: aload #25
/*     */     //   252: aload #26
/*     */     //   254: aload #27
/*     */     //   256: aload #28
/*     */     //   258: aload #29
/*     */     //   260: aload #30
/*     */     //   262: astore #17
/*     */     //   264: aload #6
/*     */     //   266: aload #17
/*     */     //   268: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   273: aload #17
/*     */     //   275: goto -> 280
/*     */     //   278: aload #14
/*     */     //   280: nop
/*     */     //   281: nop
/*     */     //   282: nop
/*     */     //   283: checkcast kotlin/jvm/functions/Function1
/*     */     //   286: astore #5
/*     */     //   288: aload_1
/*     */     //   289: invokeinterface endReplaceGroup : ()V
/*     */     //   294: aload #5
/*     */     //   296: aload_1
/*     */     //   297: bipush #48
/*     */     //   299: getstatic org/jetbrains/jewel/foundation/lazy/SelectableLazyListState.$stable : I
/*     */     //   302: bipush #6
/*     */     //   304: ishl
/*     */     //   305: ior
/*     */     //   306: iconst_0
/*     */     //   307: sipush #4088
/*     */     //   310: invokestatic SelectableLazyColumn : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lorg/jetbrains/jewel/foundation/lazy/tree/KeyActions;Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V
/*     */     //   313: invokestatic isTraceInProgress : ()Z
/*     */     //   316: ifeq -> 331
/*     */     //   319: invokestatic traceEventEnd : ()V
/*     */     //   322: goto -> 331
/*     */     //   325: aload_1
/*     */     //   326: invokeinterface skipToGroupEnd : ()V
/*     */     //   331: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #60	-> 0
/*     */     //   #61	-> 31
/*     */     //   #63	-> 62
/*     */     //   #61	-> 67
/*     */     //   #63	-> 68
/*     */     //   #62	-> 70
/*     */     //   #64	-> 139
/*     */     //   #127	-> 166
/*     */     //   #128	-> 178
/*     */     //   #129	-> 194
/*     */     //   #64	-> 221
/*     */     //   #129	-> 262
/*     */     //   #130	-> 264
/*     */     //   #131	-> 273
/*     */     //   #132	-> 278
/*     */     //   #128	-> 280
/*     */     //   #127	-> 281
/*     */     //   #127	-> 282
/*     */     //   #64	-> 283
/*     */     //   #60	-> 310
/*     */     //   #120	-> 325
/*     */     //   #121	-> 331
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   221	13	16	$i$a$-cache-TaskListKt$TaskList$1$1$1	I
/*     */     //   264	11	17	value$iv	Ljava/lang/Object;
/*     */     //   178	103	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   175	106	14	it$iv	Ljava/lang/Object;
/*     */     //   166	117	13	$i$f$cache	I
/*     */     //   163	120	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   163	120	7	invalid$iv	Z
/*     */     //   0	332	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/TaskListKt$TaskList$1$1;
/*     */     //   0	332	1	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	332	2	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit invoke$lambda$1$lambda$0(List<SortedRecentTaskChain> $recentTasks, long $contentBackground, Function2<? super SortedRecentTaskChain, ? super Integer, ? extends List<? extends ContextMenuItem>> $actionFactory, Function1<? super TaskChainId, Unit> $onTaskDoubleClicked, SelectableLazyListScope $this$SelectableLazyColumn) {
/*  65 */     Intrinsics.checkNotNullParameter($this$SelectableLazyColumn, "$this$SelectableLazyColumn"); SelectableLazyListScopeKt.items$default($this$SelectableLazyColumn, $recentTasks, null, null, null, (Function4)ComposableLambdaKt.composableLambdaInstance(-200270676, true, new TaskListKt$TaskList$1$1$1$1$1($contentBackground, $actionFactory, $recentTasks, $onTaskDoubleClicked)), 14, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 120 */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   TaskListKt$TaskList$1$1(float $insetHorizontalPadding, SelectableLazyListState $selectableLazyListState, List<SortedRecentTaskChain> $recentTasks, long $contentBackground, Function2<SortedRecentTaskChain, Integer, List<ContextMenuItem>> $actionFactory, Function1<TaskChainId, Unit> $onTaskDoubleClicked) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\create\TaskListKt$TaskList$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */