/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.layout.PaddingValues;
/*     */ import androidx.compose.foundation.text.input.TextFieldState;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.MutableIntState;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function7;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyListState;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nListComboBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListComboBox.kt\norg/jetbrains/jewel/ui/component/ListComboBoxKt$ListComboBox$list$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,238:1\n1225#2,6:239\n*S KotlinDebug\n*F\n+ 1 ListComboBox.kt\norg/jetbrains/jewel/ui/component/ListComboBoxKt$ListComboBox$list$2\n*L\n147#1:239,6\n*E\n"})
/*     */ final class ListComboBoxKt$ListComboBox$list$2
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
/*     */     //   13: ifne -> 295
/*     */     //   16: invokestatic isTraceInProgress : ()Z
/*     */     //   19: ifeq -> 31
/*     */     //   22: ldc 1714593080
/*     */     //   24: iload_2
/*     */     //   25: iconst_m1
/*     */     //   26: ldc 'org.jetbrains.jewel.ui.component.ListComboBox.list.<anonymous> (ListComboBox.kt:142)'
/*     */     //   28: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   31: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   34: checkcast androidx/compose/ui/Modifier
/*     */     //   37: fconst_0
/*     */     //   38: iconst_1
/*     */     //   39: aconst_null
/*     */     //   40: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   43: fconst_0
/*     */     //   44: aload_0
/*     */     //   45: getfield $popupMaxHeight : F
/*     */     //   48: iconst_1
/*     */     //   49: aconst_null
/*     */     //   50: invokestatic heightIn-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   53: aload_0
/*     */     //   54: getfield $contentPadding : Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   57: invokestatic padding : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;
/*     */     //   60: getstatic org/jetbrains/jewel/foundation/lazy/SelectionMode.Single : Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;
/*     */     //   63: aload_0
/*     */     //   64: getfield $scrollState : Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */     //   67: aconst_null
/*     */     //   68: iconst_0
/*     */     //   69: aload_1
/*     */     //   70: ldc -974866245
/*     */     //   72: invokeinterface startReplaceGroup : (I)V
/*     */     //   77: aload_1
/*     */     //   78: astore #4
/*     */     //   80: aload_1
/*     */     //   81: aload_0
/*     */     //   82: getfield $inputTextFieldState : Landroidx/compose/foundation/text/input/TextFieldState;
/*     */     //   85: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   90: aload_1
/*     */     //   91: aload_0
/*     */     //   92: getfield $items : Ljava/util/List;
/*     */     //   95: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   100: ior
/*     */     //   101: aload_1
/*     */     //   102: aload_0
/*     */     //   103: getfield $onSelectedItemChange : Lkotlin/jvm/functions/Function1;
/*     */     //   106: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   111: ior
/*     */     //   112: istore #5
/*     */     //   114: aload_0
/*     */     //   115: getfield $selectedItem$delegate : Landroidx/compose/runtime/MutableIntState;
/*     */     //   118: astore #6
/*     */     //   120: aload_0
/*     */     //   121: getfield $inputTextFieldState : Landroidx/compose/foundation/text/input/TextFieldState;
/*     */     //   124: astore #7
/*     */     //   126: aload_0
/*     */     //   127: getfield $items : Ljava/util/List;
/*     */     //   130: astore #8
/*     */     //   132: aload_0
/*     */     //   133: getfield $onSelectedItemChange : Lkotlin/jvm/functions/Function1;
/*     */     //   136: astore #9
/*     */     //   138: iconst_0
/*     */     //   139: istore #10
/*     */     //   141: aload #4
/*     */     //   143: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   148: astore #11
/*     */     //   150: iconst_0
/*     */     //   151: istore #12
/*     */     //   153: iload #5
/*     */     //   155: ifne -> 169
/*     */     //   158: aload #11
/*     */     //   160: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   163: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   166: if_acmpne -> 225
/*     */     //   169: istore #19
/*     */     //   171: astore #18
/*     */     //   173: astore #17
/*     */     //   175: astore #16
/*     */     //   177: astore #15
/*     */     //   179: iconst_0
/*     */     //   180: istore #13
/*     */     //   182: aload #6
/*     */     //   184: aload #7
/*     */     //   186: aload #8
/*     */     //   188: aload #9
/*     */     //   190: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableIntState;Landroidx/compose/foundation/text/input/TextFieldState;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;
/*     */     //   195: astore #20
/*     */     //   197: aload #15
/*     */     //   199: aload #16
/*     */     //   201: aload #17
/*     */     //   203: aload #18
/*     */     //   205: iload #19
/*     */     //   207: aload #20
/*     */     //   209: astore #14
/*     */     //   211: aload #4
/*     */     //   213: aload #14
/*     */     //   215: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   220: aload #14
/*     */     //   222: goto -> 227
/*     */     //   225: aload #11
/*     */     //   227: nop
/*     */     //   228: nop
/*     */     //   229: nop
/*     */     //   230: checkcast kotlin/jvm/functions/Function1
/*     */     //   233: astore_3
/*     */     //   234: aload_1
/*     */     //   235: invokeinterface endReplaceGroup : ()V
/*     */     //   240: aload_3
/*     */     //   241: aconst_null
/*     */     //   242: aconst_null
/*     */     //   243: aconst_null
/*     */     //   244: aconst_null
/*     */     //   245: aconst_null
/*     */     //   246: aconst_null
/*     */     //   247: aload_0
/*     */     //   248: getfield $hoverItemIndex$delegate : Landroidx/compose/runtime/MutableState;
/*     */     //   251: aload_0
/*     */     //   252: getfield $items$1 : Ljava/util/List;
/*     */     //   255: aload_0
/*     */     //   256: getfield $onHoverItemChange : Lkotlin/jvm/functions/Function1;
/*     */     //   259: aload_0
/*     */     //   260: getfield $listItemContent : Lkotlin/jvm/functions/Function7;
/*     */     //   263: invokestatic access$ListComboBox_Fsagccs$contentItems : (Landroidx/compose/runtime/MutableState;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function7;)Lkotlin/jvm/functions/Function1;
/*     */     //   266: aload_1
/*     */     //   267: bipush #48
/*     */     //   269: getstatic org/jetbrains/jewel/foundation/lazy/SelectableLazyListState.$stable : I
/*     */     //   272: bipush #6
/*     */     //   274: ishl
/*     */     //   275: ior
/*     */     //   276: iconst_0
/*     */     //   277: sipush #4056
/*     */     //   280: invokestatic SelectableLazyColumn : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lorg/jetbrains/jewel/foundation/lazy/tree/KeyActions;Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V
/*     */     //   283: invokestatic isTraceInProgress : ()Z
/*     */     //   286: ifeq -> 301
/*     */     //   289: invokestatic traceEventEnd : ()V
/*     */     //   292: goto -> 301
/*     */     //   295: aload_1
/*     */     //   296: invokeinterface skipToGroupEnd : ()V
/*     */     //   301: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #143	-> 0
/*     */     //   #144	-> 31
/*     */     //   #145	-> 60
/*     */     //   #146	-> 63
/*     */     //   #147	-> 114
/*     */     //   #239	-> 141
/*     */     //   #240	-> 153
/*     */     //   #241	-> 169
/*     */     //   #147	-> 182
/*     */     //   #241	-> 209
/*     */     //   #242	-> 211
/*     */     //   #243	-> 220
/*     */     //   #244	-> 225
/*     */     //   #240	-> 227
/*     */     //   #239	-> 228
/*     */     //   #239	-> 229
/*     */     //   #147	-> 230
/*     */     //   #152	-> 247
/*     */     //   #143	-> 280
/*     */     //   #153	-> 295
/*     */     //   #154	-> 301
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   182	13	13	$i$a$-cache-ListComboBoxKt$ListComboBox$list$2$1	I
/*     */     //   211	11	14	value$iv	Ljava/lang/Object;
/*     */     //   153	75	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   150	78	11	it$iv	Ljava/lang/Object;
/*     */     //   141	89	10	$i$f$cache	I
/*     */     //   138	92	4	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   138	92	5	invalid$iv	Z
/*     */     //   0	302	0	this	Lorg/jetbrains/jewel/ui/component/ListComboBoxKt$ListComboBox$list$2;
/*     */     //   0	302	1	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	302	2	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit invoke$lambda$1$lambda$0(MutableIntState $selectedItem$delegate, TextFieldState $inputTextFieldState, List $items, Function1 $onSelectedItemChange, List selectedItemsIndexes) {
/* 148 */     Intrinsics.checkNotNullParameter(selectedItemsIndexes, "selectedItemsIndexes"); if (selectedItemsIndexes.isEmpty()) return Unit.INSTANCE; 
/* 149 */     if (((Number)CollectionsKt.first(selectedItemsIndexes)).intValue() == ListComboBoxKt.access$ListComboBox_Fsagccs$lambda$9($selectedItem$delegate)) return Unit.INSTANCE; 
/* 150 */     ListComboBoxKt.access$ListComboBox_Fsagccs$onSelectedIndexChange($inputTextFieldState, $items, $onSelectedItemChange, $selectedItem$delegate, ((Number)CollectionsKt.first(selectedItemsIndexes)).intValue());
/* 151 */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   ListComboBoxKt$ListComboBox$list$2(float $popupMaxHeight, PaddingValues $contentPadding, SelectableLazyListState $scrollState, TextFieldState $inputTextFieldState, List<String> $items, Function1<String, Unit> $onSelectedItemChange, List<String> $items$1, Function1<String, Unit> $onHoverItemChange, Function7<String, Boolean, Boolean, Boolean, Boolean, Composer, Integer, Unit> $listItemContent, MutableIntState $selectedItem$delegate, MutableState<Integer> $hoverItemIndex$delegate) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ListComboBoxKt$ListComboBox$list$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */