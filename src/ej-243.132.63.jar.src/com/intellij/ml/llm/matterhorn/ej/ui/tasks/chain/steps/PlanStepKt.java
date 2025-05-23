/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*    */ 
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.node.ComposeUiNode;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskStep;
/*    */ import kotlin.Unit;
/*    */ import kotlin.reflect.KFunction;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\003\032\035\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\001¢\006\002\020\006¨\006\007²\006\n\020\b\032\0020\005X\002"}, d2 = {"PlanStep", "", "plan", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Plan;", "isChainRunning", "", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Plan;ZLandroidx/compose/runtime/Composer;I)V", "ej-ui", "isMouseHovering"})
/*    */ @SourceDebugExtension({"SMAP\nPlanStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlanStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PlanStepKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,42:1\n1225#2,6:43\n1225#2,6:49\n81#3:55\n107#3,2:56\n*S KotlinDebug\n*F\n+ 1 PlanStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PlanStepKt\n*L\n21#1:43,6\n23#1:49,6\n21#1:55\n21#1:56,2\n*E\n"})
/*    */ public final class PlanStepKt {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public static final void PlanStep(@NotNull TaskStep.Plan plan, boolean isChainRunning, @Nullable Composer $composer, int $changed) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'plan'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc -608285906
/*    */     //   9: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   14: astore_2
/*    */     //   15: iload_3
/*    */     //   16: istore #4
/*    */     //   18: iload_3
/*    */     //   19: bipush #6
/*    */     //   21: iand
/*    */     //   22: ifne -> 45
/*    */     //   25: iload #4
/*    */     //   27: aload_2
/*    */     //   28: aload_0
/*    */     //   29: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   34: ifeq -> 41
/*    */     //   37: iconst_4
/*    */     //   38: goto -> 42
/*    */     //   41: iconst_2
/*    */     //   42: ior
/*    */     //   43: istore #4
/*    */     //   45: iload_3
/*    */     //   46: bipush #48
/*    */     //   48: iand
/*    */     //   49: ifne -> 74
/*    */     //   52: iload #4
/*    */     //   54: aload_2
/*    */     //   55: iload_1
/*    */     //   56: invokeinterface changed : (Z)Z
/*    */     //   61: ifeq -> 69
/*    */     //   64: bipush #32
/*    */     //   66: goto -> 71
/*    */     //   69: bipush #16
/*    */     //   71: ior
/*    */     //   72: istore #4
/*    */     //   74: iload #4
/*    */     //   76: bipush #19
/*    */     //   78: iand
/*    */     //   79: bipush #18
/*    */     //   81: if_icmpne -> 93
/*    */     //   84: aload_2
/*    */     //   85: invokeinterface getSkipping : ()Z
/*    */     //   90: ifne -> 382
/*    */     //   93: invokestatic isTraceInProgress : ()Z
/*    */     //   96: ifeq -> 109
/*    */     //   99: ldc -608285906
/*    */     //   101: iload #4
/*    */     //   103: iconst_m1
/*    */     //   104: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.PlanStep (PlanStep.kt:19)'
/*    */     //   106: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   109: aload_2
/*    */     //   110: ldc 248855584
/*    */     //   112: invokeinterface startReplaceGroup : (I)V
/*    */     //   117: aload_2
/*    */     //   118: astore #7
/*    */     //   120: iconst_0
/*    */     //   121: istore #8
/*    */     //   123: nop
/*    */     //   124: iconst_0
/*    */     //   125: istore #9
/*    */     //   127: aload #7
/*    */     //   129: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   134: astore #10
/*    */     //   136: iconst_0
/*    */     //   137: istore #11
/*    */     //   139: aload #10
/*    */     //   141: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   144: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   147: if_acmpne -> 179
/*    */     //   150: iconst_0
/*    */     //   151: istore #12
/*    */     //   153: iconst_0
/*    */     //   154: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*    */     //   157: aconst_null
/*    */     //   158: iconst_2
/*    */     //   159: aconst_null
/*    */     //   160: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*    */     //   163: astore #12
/*    */     //   165: aload #7
/*    */     //   167: aload #12
/*    */     //   169: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   174: aload #12
/*    */     //   176: goto -> 181
/*    */     //   179: aload #10
/*    */     //   181: nop
/*    */     //   182: nop
/*    */     //   183: nop
/*    */     //   184: checkcast androidx/compose/runtime/MutableState
/*    */     //   187: astore #6
/*    */     //   189: aload_2
/*    */     //   190: invokeinterface endReplaceGroup : ()V
/*    */     //   195: aload #6
/*    */     //   197: astore #5
/*    */     //   199: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   202: checkcast androidx/compose/ui/Modifier
/*    */     //   205: aload_2
/*    */     //   206: ldc 248858294
/*    */     //   208: invokeinterface startReplaceGroup : (I)V
/*    */     //   213: aload_2
/*    */     //   214: astore #8
/*    */     //   216: iconst_0
/*    */     //   217: istore #9
/*    */     //   219: iconst_0
/*    */     //   220: istore #10
/*    */     //   222: aload #8
/*    */     //   224: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   229: astore #11
/*    */     //   231: iconst_0
/*    */     //   232: istore #12
/*    */     //   234: aload #11
/*    */     //   236: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   239: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   242: if_acmpne -> 276
/*    */     //   245: astore #15
/*    */     //   247: iconst_0
/*    */     //   248: istore #13
/*    */     //   250: aload #5
/*    */     //   252: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*    */     //   257: aload #15
/*    */     //   259: swap
/*    */     //   260: astore #14
/*    */     //   262: aload #8
/*    */     //   264: aload #14
/*    */     //   266: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   271: aload #14
/*    */     //   273: goto -> 278
/*    */     //   276: aload #11
/*    */     //   278: nop
/*    */     //   279: nop
/*    */     //   280: nop
/*    */     //   281: checkcast kotlin/jvm/functions/Function1
/*    */     //   284: astore #7
/*    */     //   286: aload_2
/*    */     //   287: invokeinterface endReplaceGroup : ()V
/*    */     //   292: aload #7
/*    */     //   294: invokestatic onHover : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*    */     //   297: astore #6
/*    */     //   299: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*    */     //   302: invokevirtual getSpaceBetween : ()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*    */     //   305: astore #7
/*    */     //   307: aload #6
/*    */     //   309: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ComposableSingletons$PlanStepKt.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ComposableSingletons$PlanStepKt;
/*    */     //   312: invokevirtual getLambda-1$ej_ui : ()Lkotlin/jvm/functions/Function3;
/*    */     //   315: ldc 860994459
/*    */     //   317: iconst_1
/*    */     //   318: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PlanStepKt$PlanStep$2
/*    */     //   321: dup
/*    */     //   322: aload_0
/*    */     //   323: aload #5
/*    */     //   325: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Plan;Landroidx/compose/runtime/MutableState;)V
/*    */     //   328: aload_2
/*    */     //   329: bipush #54
/*    */     //   331: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*    */     //   334: checkcast kotlin/jvm/functions/Function3
/*    */     //   337: aload #7
/*    */     //   339: ldc 2143841009
/*    */     //   341: iconst_1
/*    */     //   342: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PlanStepKt$PlanStep$3
/*    */     //   345: dup
/*    */     //   346: aload_0
/*    */     //   347: iload_1
/*    */     //   348: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Plan;Z)V
/*    */     //   351: aload_2
/*    */     //   352: bipush #54
/*    */     //   354: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*    */     //   357: checkcast kotlin/jvm/functions/Function3
/*    */     //   360: aconst_null
/*    */     //   361: aload_2
/*    */     //   362: sipush #28080
/*    */     //   365: bipush #32
/*    */     //   367: invokestatic StepCard : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*    */     //   370: invokestatic isTraceInProgress : ()Z
/*    */     //   373: ifeq -> 388
/*    */     //   376: invokestatic traceEventEnd : ()V
/*    */     //   379: goto -> 388
/*    */     //   382: aload_2
/*    */     //   383: invokeinterface skipToGroupEnd : ()V
/*    */     //   388: aload_2
/*    */     //   389: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   394: dup
/*    */     //   395: ifnull -> 414
/*    */     //   398: aload_0
/*    */     //   399: iload_1
/*    */     //   400: iload_3
/*    */     //   401: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Plan;ZI)Lkotlin/jvm/functions/Function2;
/*    */     //   406: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   411: goto -> 415
/*    */     //   414: pop
/*    */     //   415: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 6
/*    */     //   #21	-> 123
/*    */     //   #43	-> 127
/*    */     //   #44	-> 139
/*    */     //   #45	-> 150
/*    */     //   #21	-> 153
/*    */     //   #45	-> 163
/*    */     //   #46	-> 165
/*    */     //   #47	-> 174
/*    */     //   #48	-> 179
/*    */     //   #44	-> 181
/*    */     //   #43	-> 182
/*    */     //   #43	-> 183
/*    */     //   #21	-> 184
/*    */     //   #23	-> 199
/*    */     //   #49	-> 222
/*    */     //   #50	-> 234
/*    */     //   #51	-> 245
/*    */     //   #23	-> 250
/*    */     //   #51	-> 260
/*    */     //   #52	-> 262
/*    */     //   #53	-> 271
/*    */     //   #54	-> 276
/*    */     //   #50	-> 278
/*    */     //   #49	-> 279
/*    */     //   #49	-> 280
/*    */     //   #23	-> 281
/*    */     //   #25	-> 299
/*    */     //   #23	-> 307
/*    */     //   #26	-> 315
/*    */     //   #25	-> 337
/*    */     //   #33	-> 339
/*    */     //   #22	-> 367
/*    */     //   #42	-> 382
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   153	10	12	$i$a$-cache-PlanStepKt$PlanStep$isMouseHovering$2	I
/*    */     //   165	11	12	value$iv	Ljava/lang/Object;
/*    */     //   139	43	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   136	46	10	it$iv	Ljava/lang/Object;
/*    */     //   127	57	9	$i$f$cache	I
/*    */     //   124	60	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   124	60	8	invalid$iv	Z
/*    */     //   250	7	13	$i$a$-cache-PlanStepKt$PlanStep$1	I
/*    */     //   262	11	14	value$iv	Ljava/lang/Object;
/*    */     //   234	45	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   231	48	11	it$iv	Ljava/lang/Object;
/*    */     //   222	59	10	$i$f$cache	I
/*    */     //   219	62	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   219	62	9	invalid$iv	Z
/*    */     //   199	180	5	isMouseHovering$delegate	Landroidx/compose/runtime/MutableState;
/*    */     //   18	398	4	$dirty	I
/*    */     //   0	416	0	plan	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Plan;
/*    */     //   0	416	1	isChainRunning	Z
/*    */     //   0	416	2	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	416	3	$changed	I
/*    */   }
/*    */   
/* 21 */   private static final boolean PlanStep$lambda$1(MutableState $isMouseHovering$delegate) { State state = (State)$isMouseHovering$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
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
/*    */ 
/*    */ 
/*    */       
/* 55 */       (Boolean)state.getValue()).booleanValue(); }
/* 56 */   private static final Unit PlanStep$lambda$4$lambda$3(MutableState<Boolean> $isMouseHovering$delegate, boolean it) { PlanStep$lambda$2($isMouseHovering$delegate, it); return Unit.INSTANCE; } private static final Unit PlanStep$lambda$5(TaskStep.Plan $plan, boolean $isChainRunning, int $$changed, Composer $composer, int $force) { PlanStep($plan, $isChainRunning, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1)); return Unit.INSTANCE; } private static final void PlanStep$lambda$2(MutableState $isMouseHovering$delegate, boolean <set-?>) { MutableState mutableState = $isMouseHovering$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0; mutableState.setValue(value$iv); } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nPlanStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlanStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PlanStepKt$PlanStep$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,42:1\n1225#2,6:43\n*S KotlinDebug\n*F\n+ 1 PlanStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PlanStepKt$PlanStep$2\n*L\n30#1:43,6\n*E\n"}) static final class PlanStepKt$PlanStep$2 implements Function3<RowScope, Composer, Integer, Unit> { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(RowScope $this$StepCard, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(860994459, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.PlanStep.<anonymous> (PlanStep.kt:26)");  TextKt.Text-bAzTDeA(this.$plan.getName(), null, 0L, 0L, null, null, MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getMessageFont($composer, MatterhornThemeData.$stable), 0L, null, 0, 0L, 0, false, 0, null, null, $composer, 0, 0, 65470); TaskStep.Plan plan = this.$plan; $composer.startReplaceGroup(-2141267656); Composer composer = $composer; boolean invalid$iv = $composer.changedInstance(plan); int $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0; boolean bool1 = PlanStepKt.PlanStep$lambda$1(this.$isMouseHovering$delegate); int $i$a$-cache-PlanStepKt$PlanStep$2$1 = 0; KFunction kFunction2 = (KFunction)new PlanStepKt$PlanStep$2$1$1(plan); Object value$iv = kFunction2; composer.updateRememberedValue(value$iv); KFunction kFunction1 = (invalid$iv || it$iv == Composer.Companion.getEmpty()) ? (KFunction)value$iv : (KFunction)it$iv; $composer.endReplaceGroup(); CopyTextToClipboardButtonKt.CopyTextToClipboardButton-SBKQj6I(bool1, (Function0)kFunction1, null, 0L, null, null, $composer, 0, 60); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } PlanStepKt$PlanStep$2(TaskStep.Plan $plan, MutableState<Boolean> $isMouseHovering$delegate) {} } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nPlanStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlanStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PlanStepKt$PlanStep$3\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,42:1\n71#2:43\n67#2,7:44\n74#2:79\n78#2:83\n79#3,6:51\n86#3,4:66\n90#3,2:76\n94#3:82\n368#4,9:57\n377#4:78\n378#4,2:80\n4034#5,6:70\n*S KotlinDebug\n*F\n+ 1 PlanStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PlanStepKt$PlanStep$3\n*L\n34#1:43\n34#1:44,7\n34#1:79\n34#1:83\n34#1:51,6\n34#1:66,4\n34#1:76,2\n34#1:82\n34#1:57,9\n34#1:78\n34#1:80,2\n34#1:70,6\n*E\n"}) static final class PlanStepKt$PlanStep$3 implements Function3<ColumnScope, Composer, Integer, Unit> { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(ColumnScope $this$StepCard, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(2143841009, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.PlanStep.<anonymous> (PlanStep.kt:33)");  TaskStep.Plan plan = this.$plan; boolean bool1 = this.$isChainRunning; int $changed$iv = 0, $i$f$Box = 0; ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo"); Modifier modifier$iv = (Modifier)Modifier.Companion; Alignment contentAlignment$iv = Alignment.Companion.getTopStart(); boolean propagateMinConstraints$iv = false; MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3; int $i$f$Layout = 0; ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"); int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0); CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap(); Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv); Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 57 */         ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 58 */         if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 59 */           .startReusableNode();
/* 60 */         if ($composer.getInserting()) { $composer
/* 61 */             .createNode(function0); } else { $composer
/*    */             
/* 63 */             .useNode(); }
/*    */         
/* 65 */         Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 66 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 67 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*    */         
/* 69 */         Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 70 */         Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 71 */         if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 72 */           $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 73 */           $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*    */         } 
/*    */         
/* 76 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*    */         
/* 78 */         int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/* 79 */         ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-PlanStepKt$PlanStep$3$1 = 0; PlanKt.Plan(null, plan.getPlan(), bool1, composer1, 0, 1); ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 80 */         $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 81 */         ComposerKt.sourceInformationMarkerEnd($composer);
/* 82 */         ComposerKt.sourceInformationMarkerEnd($composer);
/* 83 */         if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*    */       else
/*    */       { $composer.skipToGroupEnd(); }
/*    */        }
/*    */ 
/*    */     
/*    */     PlanStepKt$PlanStep$3(TaskStep.Plan $plan, boolean $isChainRunning) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\PlanStepKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */