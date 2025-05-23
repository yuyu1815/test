/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*    */ 
/*    */ import androidx.compose.foundation.layout.ColumnScope;
/*    */ import androidx.compose.foundation.layout.RowScope;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.components.ButtonKt;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.FileChangeView;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskStep;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\032\025\020\000\032\0020\0012\006\020\002\032\0020\003H\001¢\006\002\020\004¨\006\005"}, d2 = {"EditStep", "", "edit", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Edit;", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Edit;Landroidx/compose/runtime/Composer;I)V", "ej-ui"})
/*    */ public final class EditKt {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public static final void EditStep(@NotNull TaskStep.Edit edit, @Nullable Composer $composer, int $changed) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'edit'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: ldc -1043875243
/*    */     //   9: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   14: astore_1
/*    */     //   15: iload_2
/*    */     //   16: istore_3
/*    */     //   17: iload_2
/*    */     //   18: bipush #6
/*    */     //   20: iand
/*    */     //   21: ifne -> 42
/*    */     //   24: iload_3
/*    */     //   25: aload_1
/*    */     //   26: aload_0
/*    */     //   27: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   32: ifeq -> 39
/*    */     //   35: iconst_4
/*    */     //   36: goto -> 40
/*    */     //   39: iconst_2
/*    */     //   40: ior
/*    */     //   41: istore_3
/*    */     //   42: iload_3
/*    */     //   43: iconst_3
/*    */     //   44: iand
/*    */     //   45: iconst_2
/*    */     //   46: if_icmpne -> 58
/*    */     //   49: aload_1
/*    */     //   50: invokeinterface getSkipping : ()Z
/*    */     //   55: ifne -> 161
/*    */     //   58: invokestatic isTraceInProgress : ()Z
/*    */     //   61: ifeq -> 73
/*    */     //   64: ldc -1043875243
/*    */     //   66: iload_3
/*    */     //   67: iconst_m1
/*    */     //   68: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.EditStep (Edit.kt:20)'
/*    */     //   70: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   73: aconst_null
/*    */     //   74: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ComposableSingletons$EditKt.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ComposableSingletons$EditKt;
/*    */     //   77: invokevirtual getLambda-1$ej_ui : ()Lkotlin/jvm/functions/Function3;
/*    */     //   80: ldc 135702082
/*    */     //   82: iconst_1
/*    */     //   83: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/EditKt$EditStep$1
/*    */     //   86: dup
/*    */     //   87: aload_0
/*    */     //   88: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Edit;)V
/*    */     //   91: aload_1
/*    */     //   92: bipush #54
/*    */     //   94: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*    */     //   97: checkcast kotlin/jvm/functions/Function3
/*    */     //   100: aconst_null
/*    */     //   101: ldc 1816733336
/*    */     //   103: iconst_1
/*    */     //   104: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/EditKt$EditStep$2
/*    */     //   107: dup
/*    */     //   108: aload_0
/*    */     //   109: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Edit;)V
/*    */     //   112: aload_1
/*    */     //   113: bipush #54
/*    */     //   115: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*    */     //   118: checkcast kotlin/jvm/functions/Function3
/*    */     //   121: ldc -913840353
/*    */     //   123: iconst_1
/*    */     //   124: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/EditKt$EditStep$3
/*    */     //   127: dup
/*    */     //   128: aload_0
/*    */     //   129: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Edit;)V
/*    */     //   132: aload_1
/*    */     //   133: bipush #54
/*    */     //   135: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*    */     //   138: checkcast kotlin/jvm/functions/Function3
/*    */     //   141: aload_1
/*    */     //   142: ldc 221616
/*    */     //   144: bipush #9
/*    */     //   146: invokestatic StepCard : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*    */     //   149: invokestatic isTraceInProgress : ()Z
/*    */     //   152: ifeq -> 167
/*    */     //   155: invokestatic traceEventEnd : ()V
/*    */     //   158: goto -> 167
/*    */     //   161: aload_1
/*    */     //   162: invokeinterface skipToGroupEnd : ()V
/*    */     //   167: aload_1
/*    */     //   168: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   173: dup
/*    */     //   174: ifnull -> 192
/*    */     //   177: aload_0
/*    */     //   178: iload_2
/*    */     //   179: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Edit;I)Lkotlin/jvm/functions/Function2;
/*    */     //   184: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   189: goto -> 193
/*    */     //   192: pop
/*    */     //   193: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #21	-> 6
/*    */     //   #24	-> 80
/*    */     //   #45	-> 101
/*    */     //   #51	-> 121
/*    */     //   #22	-> 146
/*    */     //   #61	-> 161
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   17	177	3	$dirty	I
/*    */     //   0	194	0	edit	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Edit;
/*    */     //   0	194	1	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	194	2	$changed	I
/*    */   }
/*    */   
/*    */   private static final Unit EditStep$lambda$0(TaskStep.Edit $edit, int $$changed, Composer $composer, int $force) {
/*    */     EditStep($edit, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   @SourceDebugExtension({"SMAP\nEdit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Edit.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/EditKt$EditStep$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,61:1\n149#2:62\n86#3:63\n82#3,7:64\n89#3:99\n93#3:117\n79#4,6:71\n86#4,4:86\n90#4,2:96\n94#4:116\n368#5,9:77\n377#5:98\n378#5,2:114\n4034#6,6:90\n1863#7:100\n1864#7:113\n1225#8,6:101\n1225#8,6:107\n*S KotlinDebug\n*F\n+ 1 Edit.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/EditKt$EditStep$1\n*L\n31#1:62\n31#1:63\n31#1:64,7\n31#1:99\n31#1:117\n31#1:71,6\n31#1:86,4\n31#1:96,2\n31#1:116\n31#1:77,9\n31#1:98\n31#1:114,2\n31#1:90,6\n32#1:100\n32#1:113\n37#1:101,6\n36#1:107,6\n*E\n"})
/*    */   static final class EditKt$EditStep$1 implements Function3<RowScope, Composer, Integer, Unit> { private static final Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1(FileChangeView $change) {
/* 36 */       $change.onShowDiff(false); return Unit.INSTANCE;
/*    */     } @Composable
/*    */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */     public final void invoke(RowScope $this$StepCard, Composer $composer, int $changed) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ldc '$this$StepCard'
/*    */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   6: iload_3
/*    */       //   7: bipush #17
/*    */       //   9: iand
/*    */       //   10: bipush #16
/*    */       //   12: if_icmpne -> 24
/*    */       //   15: aload_2
/*    */       //   16: invokeinterface getSkipping : ()Z
/*    */       //   21: ifne -> 891
/*    */       //   24: invokestatic isTraceInProgress : ()Z
/*    */       //   27: ifeq -> 39
/*    */       //   30: ldc 135702082
/*    */       //   32: iload_3
/*    */       //   33: iconst_m1
/*    */       //   34: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.EditStep.<anonymous> (Edit.kt:24)'
/*    */       //   36: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */       //   39: aload_0
/*    */       //   40: getfield $edit : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Edit;
/*    */       //   43: invokevirtual getName : ()Ljava/lang/String;
/*    */       //   46: aconst_null
/*    */       //   47: lconst_0
/*    */       //   48: lconst_0
/*    */       //   49: aconst_null
/*    */       //   50: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
/*    */       //   53: invokevirtual getBold : ()Landroidx/compose/ui/text/font/FontWeight;
/*    */       //   56: aload_2
/*    */       //   57: iconst_0
/*    */       //   58: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*    */       //   61: aload_2
/*    */       //   62: getstatic com/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData.$stable : I
/*    */       //   65: invokevirtual getMessageFont : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/font/FontFamily;
/*    */       //   68: lconst_0
/*    */       //   69: aconst_null
/*    */       //   70: iconst_0
/*    */       //   71: lconst_0
/*    */       //   72: iconst_0
/*    */       //   73: iconst_0
/*    */       //   74: iconst_0
/*    */       //   75: aconst_null
/*    */       //   76: aconst_null
/*    */       //   77: aload_2
/*    */       //   78: ldc 196608
/*    */       //   80: iconst_0
/*    */       //   81: ldc 65438
/*    */       //   83: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*    */       //   86: aload_0
/*    */       //   87: getfield $edit : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Edit;
/*    */       //   90: invokevirtual getChanges : ()Ljava/util/List;
/*    */       //   93: checkcast java/util/Collection
/*    */       //   96: invokeinterface isEmpty : ()Z
/*    */       //   101: ifne -> 108
/*    */       //   104: iconst_1
/*    */       //   105: goto -> 109
/*    */       //   108: iconst_0
/*    */       //   109: ifeq -> 879
/*    */       //   112: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*    */       //   115: iconst_2
/*    */       //   116: istore #5
/*    */       //   118: iconst_0
/*    */       //   119: istore #6
/*    */       //   121: iload #5
/*    */       //   123: i2f
/*    */       //   124: invokestatic constructor-impl : (F)F
/*    */       //   127: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*    */       //   130: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
/*    */       //   133: astore #5
/*    */       //   135: aload_0
/*    */       //   136: getfield $edit : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Edit;
/*    */       //   139: astore #7
/*    */       //   141: bipush #48
/*    */       //   143: istore #8
/*    */       //   145: iconst_0
/*    */       //   146: istore #9
/*    */       //   148: aload_2
/*    */       //   149: ldc -483455358
/*    */       //   151: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*    */       //   153: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */       //   156: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */       //   159: checkcast androidx/compose/ui/Modifier
/*    */       //   162: astore #4
/*    */       //   164: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */       //   167: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*    */       //   170: astore #6
/*    */       //   172: aload #5
/*    */       //   174: aload #6
/*    */       //   176: aload_2
/*    */       //   177: bipush #14
/*    */       //   179: iload #8
/*    */       //   181: iconst_3
/*    */       //   182: ishr
/*    */       //   183: iand
/*    */       //   184: bipush #112
/*    */       //   186: iload #8
/*    */       //   188: iconst_3
/*    */       //   189: ishr
/*    */       //   190: iand
/*    */       //   191: ior
/*    */       //   192: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */       //   195: astore #10
/*    */       //   197: bipush #112
/*    */       //   199: iload #8
/*    */       //   201: iconst_3
/*    */       //   202: ishl
/*    */       //   203: iand
/*    */       //   204: istore #11
/*    */       //   206: nop
/*    */       //   207: iconst_0
/*    */       //   208: istore #12
/*    */       //   210: aload_2
/*    */       //   211: ldc -1323940314
/*    */       //   213: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */       //   215: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */       //   218: aload_2
/*    */       //   219: iconst_0
/*    */       //   220: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */       //   223: istore #13
/*    */       //   225: aload_2
/*    */       //   226: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */       //   231: astore #14
/*    */       //   233: aload_2
/*    */       //   234: aload #4
/*    */       //   236: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */       //   239: astore #15
/*    */       //   241: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */       //   244: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */       //   247: astore #16
/*    */       //   249: bipush #6
/*    */       //   251: sipush #896
/*    */       //   254: iload #11
/*    */       //   256: bipush #6
/*    */       //   258: ishl
/*    */       //   259: iand
/*    */       //   260: ior
/*    */       //   261: istore #17
/*    */       //   263: nop
/*    */       //   264: iconst_0
/*    */       //   265: istore #18
/*    */       //   267: aload_2
/*    */       //   268: ldc -692256719
/*    */       //   270: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */       //   272: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */       //   275: aload_2
/*    */       //   276: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */       //   281: instanceof androidx/compose/runtime/Applier
/*    */       //   284: ifne -> 290
/*    */       //   287: invokestatic invalidApplier : ()V
/*    */       //   290: aload_2
/*    */       //   291: invokeinterface startReusableNode : ()V
/*    */       //   296: aload_2
/*    */       //   297: invokeinterface getInserting : ()Z
/*    */       //   302: ifeq -> 316
/*    */       //   305: aload_2
/*    */       //   306: aload #16
/*    */       //   308: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */       //   313: goto -> 322
/*    */       //   316: aload_2
/*    */       //   317: invokeinterface useNode : ()V
/*    */       //   322: aload_2
/*    */       //   323: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */       //   326: astore #19
/*    */       //   328: iconst_0
/*    */       //   329: istore #20
/*    */       //   331: aload #19
/*    */       //   333: aload #10
/*    */       //   335: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */       //   338: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */       //   341: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */       //   344: aload #19
/*    */       //   346: aload #14
/*    */       //   348: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */       //   351: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */       //   354: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */       //   357: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */       //   360: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */       //   363: astore #21
/*    */       //   365: iconst_0
/*    */       //   366: istore #22
/*    */       //   368: aload #19
/*    */       //   370: astore #23
/*    */       //   372: iconst_0
/*    */       //   373: istore #24
/*    */       //   375: aload #23
/*    */       //   377: invokeinterface getInserting : ()Z
/*    */       //   382: ifne -> 403
/*    */       //   385: aload #23
/*    */       //   387: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */       //   392: iload #13
/*    */       //   394: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */       //   397: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */       //   400: ifne -> 429
/*    */       //   403: aload #23
/*    */       //   405: iload #13
/*    */       //   407: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */       //   410: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */       //   415: aload #19
/*    */       //   417: iload #13
/*    */       //   419: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */       //   422: aload #21
/*    */       //   424: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */       //   429: nop
/*    */       //   430: nop
/*    */       //   431: nop
/*    */       //   432: aload #19
/*    */       //   434: aload #15
/*    */       //   436: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */       //   439: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */       //   442: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */       //   445: nop
/*    */       //   446: nop
/*    */       //   447: aload_2
/*    */       //   448: bipush #14
/*    */       //   450: iload #17
/*    */       //   452: bipush #6
/*    */       //   454: ishr
/*    */       //   455: iand
/*    */       //   456: istore #25
/*    */       //   458: astore #26
/*    */       //   460: iconst_0
/*    */       //   461: istore #27
/*    */       //   463: aload #26
/*    */       //   465: ldc -384784025
/*    */       //   467: ldc 'C88@4444L9:Column.kt#2w3rfo'
/*    */       //   469: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */       //   472: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*    */       //   475: aload #26
/*    */       //   477: bipush #6
/*    */       //   479: bipush #112
/*    */       //   481: iload #8
/*    */       //   483: bipush #6
/*    */       //   485: ishr
/*    */       //   486: iand
/*    */       //   487: ior
/*    */       //   488: istore #28
/*    */       //   490: astore #29
/*    */       //   492: checkcast androidx/compose/foundation/layout/ColumnScope
/*    */       //   495: astore #30
/*    */       //   497: iconst_0
/*    */       //   498: istore #31
/*    */       //   500: aload #29
/*    */       //   502: ldc_w -548334411
/*    */       //   505: invokeinterface startReplaceGroup : (I)V
/*    */       //   510: aload #7
/*    */       //   512: invokevirtual getChanges : ()Ljava/util/List;
/*    */       //   515: checkcast java/lang/Iterable
/*    */       //   518: astore #32
/*    */       //   520: iconst_0
/*    */       //   521: istore #33
/*    */       //   523: aload #32
/*    */       //   525: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */       //   530: astore #34
/*    */       //   532: aload #34
/*    */       //   534: invokeinterface hasNext : ()Z
/*    */       //   539: ifeq -> 844
/*    */       //   542: aload #34
/*    */       //   544: invokeinterface next : ()Ljava/lang/Object;
/*    */       //   549: astore #35
/*    */       //   551: aload #35
/*    */       //   553: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView
/*    */       //   556: astore #36
/*    */       //   558: iconst_0
/*    */       //   559: istore #37
/*    */       //   561: aload #36
/*    */       //   563: lconst_0
/*    */       //   564: lconst_0
/*    */       //   565: iconst_0
/*    */       //   566: aconst_null
/*    */       //   567: aload #29
/*    */       //   569: ldc_w -1980588920
/*    */       //   572: invokeinterface startReplaceGroup : (I)V
/*    */       //   577: aload #29
/*    */       //   579: astore #38
/*    */       //   581: aload #29
/*    */       //   583: aload #36
/*    */       //   585: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */       //   590: istore #39
/*    */       //   592: nop
/*    */       //   593: iconst_0
/*    */       //   594: istore #40
/*    */       //   596: aload #38
/*    */       //   598: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */       //   603: astore #41
/*    */       //   605: iconst_0
/*    */       //   606: istore #42
/*    */       //   608: iload #39
/*    */       //   610: ifne -> 624
/*    */       //   613: aload #41
/*    */       //   615: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */       //   618: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */       //   621: if_acmpne -> 680
/*    */       //   624: astore #43
/*    */       //   626: istore #44
/*    */       //   628: lstore #45
/*    */       //   630: lstore #47
/*    */       //   632: astore #49
/*    */       //   634: iconst_0
/*    */       //   635: istore #50
/*    */       //   637: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/EditKt$EditStep$1$1$1$1$1
/*    */       //   640: dup
/*    */       //   641: aload #36
/*    */       //   643: aconst_null
/*    */       //   644: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;Lkotlin/coroutines/Continuation;)V
/*    */       //   647: checkcast kotlin/jvm/functions/Function1
/*    */       //   650: astore #51
/*    */       //   652: aload #49
/*    */       //   654: lload #47
/*    */       //   656: lload #45
/*    */       //   658: iload #44
/*    */       //   660: aload #43
/*    */       //   662: aload #51
/*    */       //   664: astore #52
/*    */       //   666: aload #38
/*    */       //   668: aload #52
/*    */       //   670: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */       //   675: aload #52
/*    */       //   677: goto -> 682
/*    */       //   680: aload #41
/*    */       //   682: nop
/*    */       //   683: nop
/*    */       //   684: nop
/*    */       //   685: checkcast kotlin/jvm/functions/Function1
/*    */       //   688: astore #53
/*    */       //   690: aload #29
/*    */       //   692: invokeinterface endReplaceGroup : ()V
/*    */       //   697: aload #53
/*    */       //   699: aload #29
/*    */       //   701: ldc_w -1980591193
/*    */       //   704: invokeinterface startReplaceGroup : (I)V
/*    */       //   709: aload #29
/*    */       //   711: astore #38
/*    */       //   713: aload #29
/*    */       //   715: aload #36
/*    */       //   717: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */       //   722: istore #39
/*    */       //   724: nop
/*    */       //   725: iconst_0
/*    */       //   726: istore #40
/*    */       //   728: aload #38
/*    */       //   730: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */       //   735: astore #41
/*    */       //   737: iconst_0
/*    */       //   738: istore #42
/*    */       //   740: iload #39
/*    */       //   742: ifne -> 756
/*    */       //   745: aload #41
/*    */       //   747: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */       //   750: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */       //   753: if_acmpne -> 810
/*    */       //   756: astore #51
/*    */       //   758: astore #43
/*    */       //   760: istore #44
/*    */       //   762: lstore #45
/*    */       //   764: lstore #47
/*    */       //   766: astore #49
/*    */       //   768: iconst_0
/*    */       //   769: istore #50
/*    */       //   771: aload #36
/*    */       //   773: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;)Lkotlin/jvm/functions/Function0;
/*    */       //   778: astore #54
/*    */       //   780: aload #49
/*    */       //   782: lload #47
/*    */       //   784: lload #45
/*    */       //   786: iload #44
/*    */       //   788: aload #43
/*    */       //   790: aload #51
/*    */       //   792: aload #54
/*    */       //   794: astore #52
/*    */       //   796: aload #38
/*    */       //   798: aload #52
/*    */       //   800: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */       //   805: aload #52
/*    */       //   807: goto -> 812
/*    */       //   810: aload #41
/*    */       //   812: nop
/*    */       //   813: nop
/*    */       //   814: nop
/*    */       //   815: checkcast kotlin/jvm/functions/Function0
/*    */       //   818: astore #53
/*    */       //   820: aload #29
/*    */       //   822: invokeinterface endReplaceGroup : ()V
/*    */       //   827: aload #53
/*    */       //   829: aload #29
/*    */       //   831: sipush #3072
/*    */       //   834: bipush #22
/*    */       //   836: invokestatic FileChangeChip-K2djEUw : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;JJZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*    */       //   839: nop
/*    */       //   840: nop
/*    */       //   841: goto -> 532
/*    */       //   844: nop
/*    */       //   845: aload #29
/*    */       //   847: invokeinterface endReplaceGroup : ()V
/*    */       //   852: nop
/*    */       //   853: aload #26
/*    */       //   855: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */       //   858: aload_2
/*    */       //   859: invokeinterface endNode : ()V
/*    */       //   864: aload_2
/*    */       //   865: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */       //   868: nop
/*    */       //   869: aload_2
/*    */       //   870: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */       //   873: nop
/*    */       //   874: aload_2
/*    */       //   875: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */       //   878: nop
/*    */       //   879: invokestatic isTraceInProgress : ()Z
/*    */       //   882: ifeq -> 897
/*    */       //   885: invokestatic traceEventEnd : ()V
/*    */       //   888: goto -> 897
/*    */       //   891: aload_2
/*    */       //   892: invokeinterface skipToGroupEnd : ()V
/*    */       //   897: return
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #25	-> 6
/*    */       //   #26	-> 39
/*    */       //   #27	-> 50
/*    */       //   #28	-> 58
/*    */       //   #25	-> 83
/*    */       //   #30	-> 86
/*    */       //   #30	-> 109
/*    */       //   #31	-> 112
/*    */       //   #62	-> 121
/*    */       //   #31	-> 127
/*    */       //   #63	-> 153
/*    */       //   #64	-> 156
/*    */       //   #66	-> 164
/*    */       //   #69	-> 172
/*    */       //   #70	-> 206
/*    */       //   #71	-> 215
/*    */       //   #72	-> 220
/*    */       //   #73	-> 226
/*    */       //   #74	-> 234
/*    */       //   #76	-> 241
/*    */       //   #75	-> 263
/*    */       //   #77	-> 272
/*    */       //   #78	-> 275
/*    */       //   #79	-> 291
/*    */       //   #80	-> 296
/*    */       //   #81	-> 306
/*    */       //   #83	-> 317
/*    */       //   #85	-> 322
/*    */       //   #86	-> 331
/*    */       //   #87	-> 344
/*    */       //   #89	-> 357
/*    */       //   #90	-> 368
/*    */       //   #91	-> 375
/*    */       //   #92	-> 403
/*    */       //   #93	-> 415
/*    */       //   #95	-> 429
/*    */       //   #90	-> 430
/*    */       //   #95	-> 431
/*    */       //   #96	-> 432
/*    */       //   #97	-> 445
/*    */       //   #85	-> 446
/*    */       //   #98	-> 447
/*    */       //   #99	-> 469
/*    */       //   #32	-> 510
/*    */       //   #100	-> 523
/*    */       //   #34	-> 561
/*    */       //   #35	-> 565
/*    */       //   #37	-> 592
/*    */       //   #101	-> 596
/*    */       //   #102	-> 608
/*    */       //   #103	-> 624
/*    */       //   #37	-> 637
/*    */       //   #103	-> 664
/*    */       //   #104	-> 666
/*    */       //   #105	-> 675
/*    */       //   #106	-> 680
/*    */       //   #102	-> 682
/*    */       //   #101	-> 683
/*    */       //   #101	-> 684
/*    */       //   #37	-> 685
/*    */       //   #36	-> 724
/*    */       //   #107	-> 728
/*    */       //   #108	-> 740
/*    */       //   #109	-> 756
/*    */       //   #36	-> 771
/*    */       //   #109	-> 794
/*    */       //   #110	-> 796
/*    */       //   #111	-> 805
/*    */       //   #112	-> 810
/*    */       //   #108	-> 812
/*    */       //   #107	-> 813
/*    */       //   #107	-> 814
/*    */       //   #36	-> 815
/*    */       //   #33	-> 836
/*    */       //   #41	-> 839
/*    */       //   #100	-> 840
/*    */       //   #113	-> 844
/*    */       //   #42	-> 852
/*    */       //   #99	-> 853
/*    */       //   #98	-> 858
/*    */       //   #114	-> 859
/*    */       //   #77	-> 865
/*    */       //   #115	-> 868
/*    */       //   #71	-> 870
/*    */       //   #116	-> 873
/*    */       //   #63	-> 875
/*    */       //   #117	-> 878
/*    */       //   #43	-> 891
/*    */       //   #44	-> 897
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   121	6	6	$i$f$getDp	I
/*    */       //   118	9	5	$this$dp$iv	I
/*    */       //   637	13	50	$i$a$-cache-EditKt$EditStep$1$1$1$1	I
/*    */       //   666	11	52	value$iv	Ljava/lang/Object;
/*    */       //   608	75	42	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */       //   605	78	41	it$iv	Ljava/lang/Object;
/*    */       //   596	89	40	$i$f$cache	I
/*    */       //   593	92	38	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */       //   593	92	39	invalid$iv	Z
/*    */       //   771	7	50	$i$a$-cache-EditKt$EditStep$1$1$1$2	I
/*    */       //   796	11	52	value$iv	Ljava/lang/Object;
/*    */       //   740	73	42	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */       //   737	76	41	it$iv	Ljava/lang/Object;
/*    */       //   728	87	40	$i$f$cache	I
/*    */       //   725	90	38	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */       //   725	90	39	invalid$iv	Z
/*    */       //   561	279	37	$i$a$-forEach-EditKt$EditStep$1$1$1	I
/*    */       //   558	282	36	change	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
/*    */       //   551	290	35	element$iv	Ljava/lang/Object;
/*    */       //   523	322	33	$i$f$forEach	I
/*    */       //   520	325	32	$this$forEach$iv	Ljava/lang/Iterable;
/*    */       //   500	353	31	$i$a$-Column-EditKt$EditStep$1$1	I
/*    */       //   497	356	30	$this$invoke_u24lambda_u244	Landroidx/compose/foundation/layout/ColumnScope;
/*    */       //   497	356	29	$composer	Landroidx/compose/runtime/Composer;
/*    */       //   497	356	28	$changed	I
/*    */       //   463	395	27	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*    */       //   460	398	26	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */       //   460	398	25	$changed$iv	I
/*    */       //   375	55	24	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */       //   372	58	23	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */       //   368	64	22	$i$f$set-impl	I
/*    */       //   365	67	21	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */       //   331	115	20	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */       //   328	118	19	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */       //   267	602	18	$i$f$ReusableComposeNode	I
/*    */       //   264	605	16	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */       //   264	605	17	$changed$iv$iv$iv	I
/*    */       //   210	664	12	$i$f$Layout	I
/*    */       //   225	649	13	compositeKeyHash$iv$iv	I
/*    */       //   233	641	14	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */       //   241	633	15	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */       //   207	667	11	$changed$iv$iv	I
/*    */       //   148	731	9	$i$f$Column	I
/*    */       //   197	682	10	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */       //   164	715	4	modifier$iv	Landroidx/compose/ui/Modifier;
/*    */       //   145	734	5	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*    */       //   172	707	6	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*    */       //   145	734	8	$changed$iv	I
/*    */       //   0	898	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/EditKt$EditStep$1;
/*    */       //   0	898	1	$this$StepCard	Landroidx/compose/foundation/layout/RowScope;
/*    */       //   0	898	2	$composer	Landroidx/compose/runtime/Composer;
/*    */       //   0	898	3	$changed	I
/*    */     } EditKt$EditStep$1(TaskStep.Edit $edit) {} } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   @SourceDebugExtension({"SMAP\nEdit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Edit.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/EditKt$EditStep$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,61:1\n149#2:62\n*S KotlinDebug\n*F\n+ 1 Edit.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/EditKt$EditStep$2\n*L\n48#1:62\n*E\n"})
/*    */   static final class EditKt$EditStep$2 implements Function3<ColumnScope, Composer, Integer, Unit> { @Composable
/*    */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */     public final void invoke(ColumnScope $this$StepCard, Composer $composer, int $changed) {
/* 46 */       Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1816733336, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.EditStep.<anonymous> (Edit.kt:45)");  TextContainerKt.TextContainer(this.$edit.getDescription(), $composer, 0);
/* 47 */         if (this.$edit.getEditApproval() != null) {
/* 48 */           int $this$dp$iv = 8, $i$f$getDp = 0; SpacerKt.Spacer(SizeKt.height-3ABfNKs((Modifier)Modifier.Companion, 
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
/* 62 */                 Dp.constructor-impl($this$dp$iv)), $composer, 6);
/*    */         } 
/*    */         if (ComposerKt.isTraceInProgress())
/*    */           ComposerKt.traceEventEnd();  }
/*    */       else
/*    */       { $composer.skipToGroupEnd(); }
/*    */     
/*    */     }
/*    */     
/*    */     EditKt$EditStep$2(TaskStep.Edit $edit) {} }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class EditKt$EditStep$3 implements Function3<RowScope, Composer, Integer, Unit> {
/*    */     @Composable
/*    */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */     public final void invoke(RowScope $this$StepCard, Composer $composer, int $changed) {
/*    */       Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard");
/*    */       if (($changed & 0x11) != 16 || !$composer.getSkipping()) {
/*    */         Function0 approveAction;
/*    */         if (ComposerKt.isTraceInProgress())
/*    */           ComposerKt.traceEventStart(-913840353, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.EditStep.<anonymous> (Edit.kt:51)"); 
/*    */         this.$edit.getEditApproval();
/*    */         Function0 function01 = (this.$edit.getEditApproval() != null) ? this.$edit.getEditApproval().getApproveEditAction() : null;
/*    */         $composer.startReplaceGroup(1659200527);
/*    */         int $i$a$-let-EditKt$EditStep$3$1 = 0;
/*    */         ButtonKt.ApproveEditButton(null, approveAction, $composer, 0, 1);
/*    */         Unit unit = (function01 == null) ? null : Unit.INSTANCE;
/*    */         $composer.endReplaceGroup();
/*    */         this.$edit.getEditApproval();
/*    */         if (((this.$edit.getEditApproval() != null) ? this.$edit.getEditApproval().getDeclineEditAction() : null) == null) {
/*    */           (this.$edit.getEditApproval() != null) ? this.$edit.getEditApproval().getDeclineEditAction() : null;
/*    */         } else {
/*    */           Object object;
/*    */           int $i$a$-let-EditKt$EditStep$3$2 = 0;
/*    */           ButtonKt.DeclineEditButton(null, (Function0)object, $composer, 0, 1);
/*    */         } 
/*    */         if (ComposerKt.isTraceInProgress())
/*    */           ComposerKt.traceEventEnd(); 
/*    */       } else {
/*    */         $composer.skipToGroupEnd();
/*    */       } 
/*    */     }
/*    */     
/*    */     EditKt$EditStep$3(TaskStep.Edit $edit) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\EditKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */