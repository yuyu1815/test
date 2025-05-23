/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*     */ 
/*     */ import androidx.compose.foundation.layout.Arrangement;
/*     */ import androidx.compose.foundation.layout.BoxKt;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.layout.BoxScopeInstance;
/*     */ import androidx.compose.foundation.layout.RowKt;
/*     */ import androidx.compose.foundation.layout.RowScope;
/*     */ import androidx.compose.foundation.layout.RowScopeInstance;
/*     */ import androidx.compose.foundation.layout.SizeKt;
/*     */ import androidx.compose.foundation.lazy.LazyItemScope;
/*     */ import androidx.compose.foundation.lazy.LazyListScope;
/*     */ import androidx.compose.foundation.lazy.LazyListState;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.AttachedFile;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import org.jetbrains.jewel.ui.component.TextKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nJunieFilePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieFilePicker.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$7\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,234:1\n1225#2,6:235\n1863#3,2:241\n*S KotlinDebug\n*F\n+ 1 JunieFilePicker.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$7\n*L\n166#1:235,6\n167#1:241,2\n*E\n"})
/*     */ final class JunieFilePickerKt$JunieFilePickerDialog$2$7
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
/*     */     //   13: ifne -> 276
/*     */     //   16: invokestatic isTraceInProgress : ()Z
/*     */     //   19: ifeq -> 31
/*     */     //   22: ldc 324612721
/*     */     //   24: iload_2
/*     */     //   25: iconst_m1
/*     */     //   26: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.JunieFilePickerDialog.<anonymous>.<anonymous> (JunieFilePicker.kt:163)'
/*     */     //   28: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   31: aconst_null
/*     */     //   32: aload_0
/*     */     //   33: getfield $lazyListState : Landroidx/compose/foundation/lazy/LazyListState;
/*     */     //   36: aconst_null
/*     */     //   37: iconst_0
/*     */     //   38: aconst_null
/*     */     //   39: aconst_null
/*     */     //   40: aconst_null
/*     */     //   41: iconst_0
/*     */     //   42: aload_1
/*     */     //   43: ldc 909817141
/*     */     //   45: invokeinterface startReplaceGroup : (I)V
/*     */     //   50: aload_1
/*     */     //   51: astore #4
/*     */     //   53: aload_1
/*     */     //   54: aload_0
/*     */     //   55: getfield $recentFiles : Ljava/util/List;
/*     */     //   58: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   63: aload_1
/*     */     //   64: aload_0
/*     */     //   65: getfield $dialogWidthDp : F
/*     */     //   68: invokeinterface changed : (F)Z
/*     */     //   73: ior
/*     */     //   74: aload_1
/*     */     //   75: aload_0
/*     */     //   76: getfield $hoveredItemBackground : J
/*     */     //   79: invokeinterface changed : (J)Z
/*     */     //   84: ior
/*     */     //   85: aload_1
/*     */     //   86: aload_0
/*     */     //   87: getfield $onFileChosen : Lkotlin/jvm/functions/Function1;
/*     */     //   90: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   95: ior
/*     */     //   96: aload_1
/*     */     //   97: aload_0
/*     */     //   98: getfield $onCloseRequest : Lkotlin/jvm/functions/Function0;
/*     */     //   101: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   106: ior
/*     */     //   107: istore #5
/*     */     //   109: aload_0
/*     */     //   110: getfield $recentFiles : Ljava/util/List;
/*     */     //   113: astore #6
/*     */     //   115: aload_0
/*     */     //   116: getfield $dialogWidthDp : F
/*     */     //   119: fstore #7
/*     */     //   121: aload_0
/*     */     //   122: getfield $hoveredItemBackground : J
/*     */     //   125: lstore #8
/*     */     //   127: aload_0
/*     */     //   128: getfield $onFileChosen : Lkotlin/jvm/functions/Function1;
/*     */     //   131: astore #10
/*     */     //   133: aload_0
/*     */     //   134: getfield $onCloseRequest : Lkotlin/jvm/functions/Function0;
/*     */     //   137: astore #11
/*     */     //   139: iconst_0
/*     */     //   140: istore #12
/*     */     //   142: aload #4
/*     */     //   144: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   149: astore #13
/*     */     //   151: iconst_0
/*     */     //   152: istore #14
/*     */     //   154: iload #5
/*     */     //   156: ifne -> 170
/*     */     //   159: aload #13
/*     */     //   161: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   164: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   167: if_acmpne -> 240
/*     */     //   170: istore #24
/*     */     //   172: astore #23
/*     */     //   174: astore #22
/*     */     //   176: astore #21
/*     */     //   178: istore #20
/*     */     //   180: astore #19
/*     */     //   182: astore #18
/*     */     //   184: astore #17
/*     */     //   186: iconst_0
/*     */     //   187: istore #15
/*     */     //   189: aload #6
/*     */     //   191: fload #7
/*     */     //   193: lload #8
/*     */     //   195: aload #10
/*     */     //   197: aload #11
/*     */     //   199: <illegal opcode> invoke : (Ljava/util/List;FJLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function1;
/*     */     //   204: astore #25
/*     */     //   206: aload #17
/*     */     //   208: aload #18
/*     */     //   210: aload #19
/*     */     //   212: iload #20
/*     */     //   214: aload #21
/*     */     //   216: aload #22
/*     */     //   218: aload #23
/*     */     //   220: iload #24
/*     */     //   222: aload #25
/*     */     //   224: astore #16
/*     */     //   226: aload #4
/*     */     //   228: aload #16
/*     */     //   230: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   235: aload #16
/*     */     //   237: goto -> 242
/*     */     //   240: aload #13
/*     */     //   242: nop
/*     */     //   243: nop
/*     */     //   244: nop
/*     */     //   245: checkcast kotlin/jvm/functions/Function1
/*     */     //   248: astore_3
/*     */     //   249: aload_1
/*     */     //   250: invokeinterface endReplaceGroup : ()V
/*     */     //   255: aload_3
/*     */     //   256: aload_1
/*     */     //   257: iconst_0
/*     */     //   258: sipush #253
/*     */     //   261: invokestatic LazyColumn : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
/*     */     //   264: invokestatic isTraceInProgress : ()Z
/*     */     //   267: ifeq -> 282
/*     */     //   270: invokestatic traceEventEnd : ()V
/*     */     //   273: goto -> 282
/*     */     //   276: aload_1
/*     */     //   277: invokeinterface skipToGroupEnd : ()V
/*     */     //   282: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #164	-> 0
/*     */     //   #165	-> 32
/*     */     //   #166	-> 109
/*     */     //   #235	-> 142
/*     */     //   #236	-> 154
/*     */     //   #237	-> 170
/*     */     //   #166	-> 189
/*     */     //   #237	-> 224
/*     */     //   #238	-> 226
/*     */     //   #239	-> 235
/*     */     //   #240	-> 240
/*     */     //   #236	-> 242
/*     */     //   #235	-> 243
/*     */     //   #235	-> 244
/*     */     //   #166	-> 245
/*     */     //   #164	-> 261
/*     */     //   #204	-> 276
/*     */     //   #205	-> 282
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   189	15	15	$i$a$-cache-JunieFilePickerKt$JunieFilePickerDialog$2$7$1	I
/*     */     //   226	11	16	value$iv	Ljava/lang/Object;
/*     */     //   154	89	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   151	92	13	it$iv	Ljava/lang/Object;
/*     */     //   142	103	12	$i$f$cache	I
/*     */     //   139	106	4	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   139	106	5	invalid$iv	Z
/*     */     //   0	283	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/JunieFilePickerKt$JunieFilePickerDialog$2$7;
/*     */     //   0	283	1	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	283	2	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit invoke$lambda$2$lambda$1(List $recentFiles, float $dialogWidthDp, long $hoveredItemBackground, Function1<? super AttachedFile, Unit> $onFileChosen, Function0<Unit> $onCloseRequest, LazyListScope $this$LazyColumn) {
/* 167 */     Intrinsics.checkNotNullParameter($this$LazyColumn, "$this$LazyColumn"); Iterable $this$forEach$iv = $recentFiles; int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 241 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); FileListEntry fileListEntry = (FileListEntry)element$iv; int $i$a$-forEach-JunieFilePickerKt$JunieFilePickerDialog$2$7$1$1$1 = 0;
/*     */       LazyListScope.item$default($this$LazyColumn, null, null, (Function3)ComposableLambdaKt.composableLambdaInstance(-1476751354, true, new JunieFilePickerKt$JunieFilePickerDialog$2$7$1$1$1$1($dialogWidthDp, $hoveredItemBackground, $onFileChosen, fileListEntry, $onCloseRequest)), 3, null); }
/*     */     
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   JunieFilePickerKt$JunieFilePickerDialog$2$7(LazyListState $lazyListState, List<FileListEntry> $recentFiles, float $dialogWidthDp, long $hoveredItemBackground, Function1<AttachedFile, Unit> $onFileChosen, Function0<Unit> $onCloseRequest) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\JunieFilePickerKt$JunieFilePickerDialog$2$7.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */