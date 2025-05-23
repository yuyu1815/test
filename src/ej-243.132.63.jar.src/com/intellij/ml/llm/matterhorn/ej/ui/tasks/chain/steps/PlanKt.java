/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.PlanItem;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.Status;
/*     */ import java.util.List;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000 \n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\013\n\002\b\005\032-\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\bH\007¢\006\002\020\t\032\035\020\n\032\0020\0012\006\020\013\032\0020\0062\006\020\007\032\0020\bH\003¢\006\002\020\f¨\006\r"}, d2 = {"Plan", "", "modifier", "Landroidx/compose/ui/Modifier;", "plan", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/PlanItem;", "isChainRunning", "", "(Landroidx/compose/ui/Modifier;Ljava/util/List;ZLandroidx/compose/runtime/Composer;II)V", "PlanRow", "item", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/PlanItem;ZLandroidx/compose/runtime/Composer;I)V", "ej-ui"})
/*     */ @SourceDebugExtension({"SMAP\nPlan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Plan.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PlanKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,69:1\n149#2:70\n149#2:71\n99#3,3:72\n102#3:103\n106#3:107\n79#4,6:75\n86#4,4:90\n90#4,2:100\n94#4:106\n368#5,9:81\n377#5:102\n378#5,2:104\n4034#6,6:94\n*S KotlinDebug\n*F\n+ 1 Plan.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PlanKt\n*L\n50#1:70\n52#1:71\n47#1:72,3\n47#1:103\n47#1:107\n47#1:75,6\n47#1:90,4\n47#1:100,2\n47#1:106\n47#1:81,9\n47#1:102\n47#1:104,2\n47#1:94,6\n*E\n"})
/*     */ public final class PlanKt {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void Plan(@Nullable Modifier modifier, @NotNull List<PlanItem> plan, boolean isChainRunning, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'plan'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_3
/*     */     //   7: ldc -1754670874
/*     */     //   9: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   14: astore_3
/*     */     //   15: iload #4
/*     */     //   17: istore #6
/*     */     //   19: iload #5
/*     */     //   21: iconst_1
/*     */     //   22: iand
/*     */     //   23: ifeq -> 36
/*     */     //   26: iload #6
/*     */     //   28: bipush #6
/*     */     //   30: ior
/*     */     //   31: istore #6
/*     */     //   33: goto -> 64
/*     */     //   36: iload #4
/*     */     //   38: bipush #6
/*     */     //   40: iand
/*     */     //   41: ifne -> 64
/*     */     //   44: iload #6
/*     */     //   46: aload_3
/*     */     //   47: aload_0
/*     */     //   48: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   53: ifeq -> 60
/*     */     //   56: iconst_4
/*     */     //   57: goto -> 61
/*     */     //   60: iconst_2
/*     */     //   61: ior
/*     */     //   62: istore #6
/*     */     //   64: iload #5
/*     */     //   66: iconst_2
/*     */     //   67: iand
/*     */     //   68: ifeq -> 81
/*     */     //   71: iload #6
/*     */     //   73: bipush #48
/*     */     //   75: ior
/*     */     //   76: istore #6
/*     */     //   78: goto -> 111
/*     */     //   81: iload #4
/*     */     //   83: bipush #48
/*     */     //   85: iand
/*     */     //   86: ifne -> 111
/*     */     //   89: iload #6
/*     */     //   91: aload_3
/*     */     //   92: aload_1
/*     */     //   93: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   98: ifeq -> 106
/*     */     //   101: bipush #32
/*     */     //   103: goto -> 108
/*     */     //   106: bipush #16
/*     */     //   108: ior
/*     */     //   109: istore #6
/*     */     //   111: iload #5
/*     */     //   113: iconst_4
/*     */     //   114: iand
/*     */     //   115: ifeq -> 129
/*     */     //   118: iload #6
/*     */     //   120: sipush #384
/*     */     //   123: ior
/*     */     //   124: istore #6
/*     */     //   126: goto -> 162
/*     */     //   129: iload #4
/*     */     //   131: sipush #384
/*     */     //   134: iand
/*     */     //   135: ifne -> 162
/*     */     //   138: iload #6
/*     */     //   140: aload_3
/*     */     //   141: iload_2
/*     */     //   142: invokeinterface changed : (Z)Z
/*     */     //   147: ifeq -> 156
/*     */     //   150: sipush #256
/*     */     //   153: goto -> 159
/*     */     //   156: sipush #128
/*     */     //   159: ior
/*     */     //   160: istore #6
/*     */     //   162: iload #6
/*     */     //   164: sipush #147
/*     */     //   167: iand
/*     */     //   168: sipush #146
/*     */     //   171: if_icmpne -> 183
/*     */     //   174: aload_3
/*     */     //   175: invokeinterface getSkipping : ()Z
/*     */     //   180: ifne -> 260
/*     */     //   183: iload #5
/*     */     //   185: iconst_1
/*     */     //   186: iand
/*     */     //   187: ifeq -> 197
/*     */     //   190: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   193: checkcast androidx/compose/ui/Modifier
/*     */     //   196: astore_0
/*     */     //   197: invokestatic isTraceInProgress : ()Z
/*     */     //   200: ifeq -> 213
/*     */     //   203: ldc -1754670874
/*     */     //   205: iload #6
/*     */     //   207: iconst_m1
/*     */     //   208: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.Plan (Plan.kt:25)'
/*     */     //   210: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   213: aload_0
/*     */     //   214: ldc -140171703
/*     */     //   216: iconst_1
/*     */     //   217: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PlanKt$Plan$1
/*     */     //   220: dup
/*     */     //   221: aload_1
/*     */     //   222: iload_2
/*     */     //   223: invokespecial <init> : (Ljava/util/List;Z)V
/*     */     //   226: aload_3
/*     */     //   227: bipush #54
/*     */     //   229: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   232: checkcast kotlin/jvm/functions/Function2
/*     */     //   235: aload_3
/*     */     //   236: bipush #48
/*     */     //   238: bipush #14
/*     */     //   240: iload #6
/*     */     //   242: iand
/*     */     //   243: ior
/*     */     //   244: iconst_0
/*     */     //   245: invokestatic SelectionContainer : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   248: invokestatic isTraceInProgress : ()Z
/*     */     //   251: ifeq -> 266
/*     */     //   254: invokestatic traceEventEnd : ()V
/*     */     //   257: goto -> 266
/*     */     //   260: aload_3
/*     */     //   261: invokeinterface skipToGroupEnd : ()V
/*     */     //   266: aload_3
/*     */     //   267: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   272: dup
/*     */     //   273: ifnull -> 296
/*     */     //   276: aload_0
/*     */     //   277: aload_1
/*     */     //   278: iload_2
/*     */     //   279: iload #4
/*     */     //   281: iload #5
/*     */     //   283: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Ljava/util/List;ZII)Lkotlin/jvm/functions/Function2;
/*     */     //   288: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   293: goto -> 297
/*     */     //   296: pop
/*     */     //   297: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #26	-> 6
/*     */     //   #28	-> 213
/*     */     //   #41	-> 260
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   19	279	6	$dirty	I
/*     */     //   0	298	0	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	298	1	plan	Ljava/util/List;
/*     */     //   0	298	2	isChainRunning	Z
/*     */     //   0	298	3	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	298	4	$changed	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nPlan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Plan.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PlanKt$Plan$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,69:1\n71#2:70\n67#2,7:71\n74#2:106\n78#2:151\n79#3,6:78\n86#3,4:93\n90#3,2:103\n79#3,6:115\n86#3,4:130\n90#3,2:140\n94#3:146\n94#3:150\n368#4,9:84\n377#4:105\n368#4,9:121\n377#4:142\n378#4,2:144\n378#4,2:148\n4034#5,6:97\n4034#5,6:134\n149#6:107\n86#7:108\n83#7,6:109\n89#7:143\n93#7:147\n*S KotlinDebug\n*F\n+ 1 Plan.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PlanKt$Plan$1\n*L\n29#1:70\n29#1:71,7\n29#1:106\n29#1:151\n29#1:78,6\n29#1:93,4\n29#1:103,2\n30#1:115,6\n30#1:130,4\n30#1:140,2\n30#1:146\n29#1:150\n29#1:84,9\n29#1:105\n30#1:121,9\n30#1:142\n30#1:144,2\n29#1:148,2\n29#1:97,6\n30#1:134,6\n33#1:107\n30#1:108\n30#1:109,6\n30#1:143\n30#1:147\n*E\n"})
/*     */   static final class PlanKt$Plan$1 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*  29 */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-140171703, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.Plan.<anonymous> (Plan.kt:28)");  List<PlanItem> list = this.$plan; boolean bool1 = this.$isChainRunning; int $changed$iv = 0, $i$f$Box = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  70 */         ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/*  71 */         Modifier modifier$iv = (Modifier)Modifier.Companion;
/*  72 */         Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
/*  73 */         boolean propagateMinConstraints$iv = false;
/*     */ 
/*     */         
/*  76 */         MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/*  77 */         int $i$f$Layout = 0;
/*  78 */         ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/*  79 */         int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/*  80 */         CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/*  81 */         Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
/*     */         
/*  83 */         Function0 function01 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/*  84 */         ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/*  85 */         if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/*  86 */           .startReusableNode();
/*  87 */         if ($composer.getInserting()) { $composer
/*  88 */             .createNode(function01); } else { $composer
/*     */             
/*  90 */             .useNode(); }
/*     */         
/*  92 */         Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/*  93 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/*  94 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */         
/*  96 */         Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/*  97 */         Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/*  98 */         if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/*  99 */           $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 100 */           $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */         } 
/*     */         
/* 103 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */         
/* 105 */         int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/* 106 */         ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u241 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-PlanKt$Plan$1$1 = 0; int $this$dp$iv = 10, $i$f$getDp = 0;
/* 107 */         Modifier modifier1 = PaddingKt.padding-qDBjuR0$default(SizeKt.fillMaxWidth$default((Modifier)Modifier.Companion, 0.0F, 1, null), 0.0F, Dp.constructor-impl($this$dp$iv), 0.0F, 0.0F, 13, null); int k = 6; int $i$f$Column = 0;
/* 108 */         ComposerKt.sourceInformationMarkerStart(composer1, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
/* 109 */         Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
/* 110 */         Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
/*     */ 
/*     */         
/* 113 */         MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, composer1, 0xE & k >> 3 | 0x70 & k >> 3); int m = 0x70 & k << 3;
/* 114 */         int n = 0;
/* 115 */         ComposerKt.sourceInformationMarkerStart(composer1, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 116 */         int i1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
/* 117 */         CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
/* 118 */         Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
/*     */         
/* 120 */         Function0 function02 = ComposeUiNode.Companion.getConstructor(); int i2 = 0x6 | 0x380 & m << 6; int i3 = 0;
/* 121 */         ComposerKt.sourceInformationMarkerStart(composer1, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 122 */         if (!(composer1.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  composer1
/* 123 */           .startReusableNode();
/* 124 */         if (composer1.getInserting()) { composer1
/* 125 */             .createNode(function02); } else { composer1
/*     */             
/* 127 */             .useNode(); }
/*     */         
/* 129 */         Composer composer2 = Updater.constructor-impl(composer1); int i4 = 0;
/* 130 */         Updater.set-impl(composer2, measurePolicy1, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 131 */         Updater.set-impl(composer2, compositionLocalMap1, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */         
/* 133 */         Function2 function21 = ComposeUiNode.Companion.getSetCompositeKeyHash(); int i5 = 0;
/* 134 */         Composer composer3 = composer2; int i6 = 0;
/* 135 */         if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(i1))) {
/* 136 */           composer3.updateRememberedValue(Integer.valueOf(i1));
/* 137 */           composer2.apply(Integer.valueOf(i1), function21);
/*     */         } 
/*     */         
/* 140 */         Updater.set-impl(composer2, modifier2, ComposeUiNode.Companion.getSetModifier());
/*     */         
/* 142 */         int i7 = 0xE & i2 >> 6; Composer composer4 = composer1; int $i$a$-Layout-ColumnKt$Column$1$iv = 0;
/* 143 */         ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo"); int i8 = 0x6 | 0x70 & k >> 6; Composer composer5 = composer4; ColumnScope $this$invoke_u24lambda_u241_u24lambda_u240 = (ColumnScope)ColumnScopeInstance.INSTANCE; int $i$a$-Column-PlanKt$Plan$1$1$1 = 0; composer5.startReplaceGroup(202126005); for (PlanItem item : list) PlanKt.PlanRow(item, bool1, composer5, 0);  composer5.endReplaceGroup(); ComposerKt.sourceInformationMarkerEnd(composer4);
/* 144 */         composer1.endNode(); ComposerKt.sourceInformationMarkerEnd(composer1);
/* 145 */         ComposerKt.sourceInformationMarkerEnd(composer1);
/* 146 */         ComposerKt.sourceInformationMarkerEnd(composer1);
/*     */         ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 148 */         $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 149 */         ComposerKt.sourceInformationMarkerEnd($composer);
/* 150 */         ComposerKt.sourceInformationMarkerEnd($composer);
/* 151 */         if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*     */       else
/*     */       { $composer.skipToGroupEnd(); }
/*     */     
/*     */     }
/*     */     
/*     */     PlanKt$Plan$1(List<PlanItem> $plan, boolean $isChainRunning) {}
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   private static final void PlanRow(PlanItem item, boolean isChainRunning, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc -909900281
/*     */     //   3: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   8: astore_2
/*     */     //   9: iload_3
/*     */     //   10: istore #4
/*     */     //   12: iload_3
/*     */     //   13: bipush #6
/*     */     //   15: iand
/*     */     //   16: ifne -> 39
/*     */     //   19: iload #4
/*     */     //   21: aload_2
/*     */     //   22: aload_0
/*     */     //   23: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   28: ifeq -> 35
/*     */     //   31: iconst_4
/*     */     //   32: goto -> 36
/*     */     //   35: iconst_2
/*     */     //   36: ior
/*     */     //   37: istore #4
/*     */     //   39: iload_3
/*     */     //   40: bipush #48
/*     */     //   42: iand
/*     */     //   43: ifne -> 68
/*     */     //   46: iload #4
/*     */     //   48: aload_2
/*     */     //   49: iload_1
/*     */     //   50: invokeinterface changed : (Z)Z
/*     */     //   55: ifeq -> 63
/*     */     //   58: bipush #32
/*     */     //   60: goto -> 65
/*     */     //   63: bipush #16
/*     */     //   65: ior
/*     */     //   66: istore #4
/*     */     //   68: iload #4
/*     */     //   70: bipush #19
/*     */     //   72: iand
/*     */     //   73: bipush #18
/*     */     //   75: if_icmpne -> 87
/*     */     //   78: aload_2
/*     */     //   79: invokeinterface getSkipping : ()Z
/*     */     //   84: ifne -> 888
/*     */     //   87: invokestatic isTraceInProgress : ()Z
/*     */     //   90: ifeq -> 103
/*     */     //   93: ldc -909900281
/*     */     //   95: iload #4
/*     */     //   97: iconst_m1
/*     */     //   98: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.PlanRow (Plan.kt:44)'
/*     */     //   100: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   103: aload_2
/*     */     //   104: iconst_0
/*     */     //   105: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   108: invokevirtual getBlockTextColor-0d7_KjU : ()J
/*     */     //   111: lstore #5
/*     */     //   113: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   116: checkcast androidx/compose/ui/Modifier
/*     */     //   119: fconst_0
/*     */     //   120: iconst_1
/*     */     //   121: aconst_null
/*     */     //   122: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   125: fconst_0
/*     */     //   126: iconst_2
/*     */     //   127: istore #8
/*     */     //   129: iconst_0
/*     */     //   130: istore #9
/*     */     //   132: iload #8
/*     */     //   134: i2f
/*     */     //   135: invokestatic constructor-impl : (F)F
/*     */     //   138: iconst_1
/*     */     //   139: aconst_null
/*     */     //   140: invokestatic padding-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   143: astore #7
/*     */     //   145: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   148: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   151: astore #8
/*     */     //   153: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   156: bipush #8
/*     */     //   158: istore #10
/*     */     //   160: iconst_0
/*     */     //   161: istore #11
/*     */     //   163: iload #10
/*     */     //   165: i2f
/*     */     //   166: invokestatic constructor-impl : (F)F
/*     */     //   169: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   172: astore #9
/*     */     //   174: sipush #438
/*     */     //   177: istore #10
/*     */     //   179: nop
/*     */     //   180: iconst_0
/*     */     //   181: istore #11
/*     */     //   183: aload_2
/*     */     //   184: ldc 693286680
/*     */     //   186: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   188: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   191: aload #9
/*     */     //   193: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*     */     //   196: aload #8
/*     */     //   198: aload_2
/*     */     //   199: bipush #14
/*     */     //   201: iload #10
/*     */     //   203: iconst_3
/*     */     //   204: ishr
/*     */     //   205: iand
/*     */     //   206: bipush #112
/*     */     //   208: iload #10
/*     */     //   210: iconst_3
/*     */     //   211: ishr
/*     */     //   212: iand
/*     */     //   213: ior
/*     */     //   214: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   217: astore #12
/*     */     //   219: bipush #112
/*     */     //   221: iload #10
/*     */     //   223: iconst_3
/*     */     //   224: ishl
/*     */     //   225: iand
/*     */     //   226: istore #13
/*     */     //   228: nop
/*     */     //   229: iconst_0
/*     */     //   230: istore #14
/*     */     //   232: aload_2
/*     */     //   233: ldc -1323940314
/*     */     //   235: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   237: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   240: aload_2
/*     */     //   241: iconst_0
/*     */     //   242: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   245: istore #15
/*     */     //   247: aload_2
/*     */     //   248: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   253: astore #16
/*     */     //   255: aload_2
/*     */     //   256: aload #7
/*     */     //   258: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   261: astore #17
/*     */     //   263: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   266: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   269: astore #18
/*     */     //   271: bipush #6
/*     */     //   273: sipush #896
/*     */     //   276: iload #13
/*     */     //   278: bipush #6
/*     */     //   280: ishl
/*     */     //   281: iand
/*     */     //   282: ior
/*     */     //   283: istore #19
/*     */     //   285: nop
/*     */     //   286: iconst_0
/*     */     //   287: istore #20
/*     */     //   289: aload_2
/*     */     //   290: ldc -692256719
/*     */     //   292: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   294: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   297: aload_2
/*     */     //   298: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   303: instanceof androidx/compose/runtime/Applier
/*     */     //   306: ifne -> 312
/*     */     //   309: invokestatic invalidApplier : ()V
/*     */     //   312: aload_2
/*     */     //   313: invokeinterface startReusableNode : ()V
/*     */     //   318: aload_2
/*     */     //   319: invokeinterface getInserting : ()Z
/*     */     //   324: ifeq -> 338
/*     */     //   327: aload_2
/*     */     //   328: aload #18
/*     */     //   330: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   335: goto -> 344
/*     */     //   338: aload_2
/*     */     //   339: invokeinterface useNode : ()V
/*     */     //   344: aload_2
/*     */     //   345: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   348: astore #21
/*     */     //   350: iconst_0
/*     */     //   351: istore #22
/*     */     //   353: aload #21
/*     */     //   355: aload #12
/*     */     //   357: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   360: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   363: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   366: aload #21
/*     */     //   368: aload #16
/*     */     //   370: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   373: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   376: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   379: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   382: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   385: astore #23
/*     */     //   387: iconst_0
/*     */     //   388: istore #24
/*     */     //   390: aload #21
/*     */     //   392: astore #25
/*     */     //   394: iconst_0
/*     */     //   395: istore #26
/*     */     //   397: aload #25
/*     */     //   399: invokeinterface getInserting : ()Z
/*     */     //   404: ifne -> 425
/*     */     //   407: aload #25
/*     */     //   409: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   414: iload #15
/*     */     //   416: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   419: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   422: ifne -> 451
/*     */     //   425: aload #25
/*     */     //   427: iload #15
/*     */     //   429: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   432: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   437: aload #21
/*     */     //   439: iload #15
/*     */     //   441: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   444: aload #23
/*     */     //   446: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   451: nop
/*     */     //   452: nop
/*     */     //   453: nop
/*     */     //   454: aload #21
/*     */     //   456: aload #17
/*     */     //   458: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   461: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   464: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   467: nop
/*     */     //   468: nop
/*     */     //   469: aload_2
/*     */     //   470: bipush #14
/*     */     //   472: iload #19
/*     */     //   474: bipush #6
/*     */     //   476: ishr
/*     */     //   477: iand
/*     */     //   478: istore #27
/*     */     //   480: astore #28
/*     */     //   482: iconst_0
/*     */     //   483: istore #29
/*     */     //   485: aload #28
/*     */     //   487: ldc_w -407840262
/*     */     //   490: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   493: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   496: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   499: aload #28
/*     */     //   501: bipush #6
/*     */     //   503: bipush #112
/*     */     //   505: iload #10
/*     */     //   507: bipush #6
/*     */     //   509: ishr
/*     */     //   510: iand
/*     */     //   511: ior
/*     */     //   512: istore #30
/*     */     //   514: astore #31
/*     */     //   516: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   519: astore #32
/*     */     //   521: iconst_0
/*     */     //   522: istore #33
/*     */     //   524: aload_0
/*     */     //   525: invokevirtual getStatus : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/Status;
/*     */     //   528: astore #34
/*     */     //   530: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PlanKt$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   533: aload #34
/*     */     //   535: invokevirtual ordinal : ()I
/*     */     //   538: iaload
/*     */     //   539: tableswitch default -> 762, 1 -> 568, 2 -> 620, 3 -> 672, 4 -> 707
/*     */     //   568: aload #31
/*     */     //   570: ldc_w -1295531870
/*     */     //   573: invokeinterface startReplaceGroup : (I)V
/*     */     //   578: getstatic org/jetbrains/jewel/ui/icons/AllIconsKeys$Actions.INSTANCE : Lorg/jetbrains/jewel/ui/icons/AllIconsKeys$Actions;
/*     */     //   581: invokevirtual getChecked : ()Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;
/*     */     //   584: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*     */     //   587: aload #34
/*     */     //   589: invokevirtual name : ()Ljava/lang/String;
/*     */     //   592: aconst_null
/*     */     //   593: aconst_null
/*     */     //   594: lload #5
/*     */     //   596: iconst_0
/*     */     //   597: anewarray org/jetbrains/jewel/ui/painter/PainterHint
/*     */     //   600: aload #31
/*     */     //   602: getstatic org/jetbrains/jewel/ui/icon/IntelliJIconKey.$stable : I
/*     */     //   605: bipush #12
/*     */     //   607: invokestatic Icon-FHprtrg : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V
/*     */     //   610: aload #31
/*     */     //   612: invokeinterface endReplaceGroup : ()V
/*     */     //   617: goto -> 787
/*     */     //   620: aload #31
/*     */     //   622: ldc_w -1295529248
/*     */     //   625: invokeinterface startReplaceGroup : (I)V
/*     */     //   630: getstatic org/jetbrains/jewel/ui/icons/AllIconsKeys$General.INSTANCE : Lorg/jetbrains/jewel/ui/icons/AllIconsKeys$General;
/*     */     //   633: invokevirtual getError : ()Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;
/*     */     //   636: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*     */     //   639: aload #34
/*     */     //   641: invokevirtual name : ()Ljava/lang/String;
/*     */     //   644: aconst_null
/*     */     //   645: aconst_null
/*     */     //   646: lload #5
/*     */     //   648: iconst_0
/*     */     //   649: anewarray org/jetbrains/jewel/ui/painter/PainterHint
/*     */     //   652: aload #31
/*     */     //   654: getstatic org/jetbrains/jewel/ui/icon/IntelliJIconKey.$stable : I
/*     */     //   657: bipush #12
/*     */     //   659: invokestatic Icon-FHprtrg : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V
/*     */     //   662: aload #31
/*     */     //   664: invokeinterface endReplaceGroup : ()V
/*     */     //   669: goto -> 787
/*     */     //   672: aload #31
/*     */     //   674: ldc_w -1506615865
/*     */     //   677: invokeinterface startReplaceGroup : (I)V
/*     */     //   682: iload_1
/*     */     //   683: ifeq -> 697
/*     */     //   686: aconst_null
/*     */     //   687: lconst_0
/*     */     //   688: aconst_null
/*     */     //   689: aload #31
/*     */     //   691: iconst_0
/*     */     //   692: bipush #7
/*     */     //   694: invokestatic JunieCircularProgressIndicator-3IgeMak : (Landroidx/compose/ui/Modifier;JLjava/lang/String;Landroidx/compose/runtime/Composer;II)V
/*     */     //   697: aload #31
/*     */     //   699: invokeinterface endReplaceGroup : ()V
/*     */     //   704: goto -> 787
/*     */     //   707: aload #31
/*     */     //   709: ldc_w -1295524032
/*     */     //   712: invokeinterface startReplaceGroup : (I)V
/*     */     //   717: aload #31
/*     */     //   719: iconst_0
/*     */     //   720: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   723: invokevirtual getBulletIcon : ()Lorg/jetbrains/jewel/ui/icon/PathIconKey;
/*     */     //   726: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*     */     //   729: aload #34
/*     */     //   731: invokevirtual name : ()Ljava/lang/String;
/*     */     //   734: aconst_null
/*     */     //   735: aconst_null
/*     */     //   736: lload #5
/*     */     //   738: iconst_0
/*     */     //   739: anewarray org/jetbrains/jewel/ui/painter/PainterHint
/*     */     //   742: aload #31
/*     */     //   744: getstatic org/jetbrains/jewel/ui/icon/PathIconKey.$stable : I
/*     */     //   747: bipush #12
/*     */     //   749: invokestatic Icon-FHprtrg : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V
/*     */     //   752: aload #31
/*     */     //   754: invokeinterface endReplaceGroup : ()V
/*     */     //   759: goto -> 787
/*     */     //   762: aload #31
/*     */     //   764: ldc_w -1295533295
/*     */     //   767: invokeinterface startReplaceGroup : (I)V
/*     */     //   772: aload #31
/*     */     //   774: invokeinterface endReplaceGroup : ()V
/*     */     //   779: new kotlin/NoWhenBranchMatchedException
/*     */     //   782: dup
/*     */     //   783: invokespecial <init> : ()V
/*     */     //   786: athrow
/*     */     //   787: nop
/*     */     //   788: aload_0
/*     */     //   789: invokevirtual getDescription : ()Ljava/lang/String;
/*     */     //   792: checkcast java/lang/CharSequence
/*     */     //   795: invokestatic trimStart : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */     //   798: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   801: checkcast java/lang/CharSequence
/*     */     //   804: invokestatic trimEnd : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */     //   807: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   810: aconst_null
/*     */     //   811: lload #5
/*     */     //   813: lconst_0
/*     */     //   814: aconst_null
/*     */     //   815: aconst_null
/*     */     //   816: aload #31
/*     */     //   818: iconst_0
/*     */     //   819: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   822: aload #31
/*     */     //   824: getstatic com/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData.$stable : I
/*     */     //   827: invokevirtual getMessageFont : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/font/FontFamily;
/*     */     //   830: lconst_0
/*     */     //   831: aconst_null
/*     */     //   832: iconst_0
/*     */     //   833: lconst_0
/*     */     //   834: iconst_0
/*     */     //   835: iconst_0
/*     */     //   836: iconst_0
/*     */     //   837: aconst_null
/*     */     //   838: aconst_null
/*     */     //   839: aload #31
/*     */     //   841: iconst_0
/*     */     //   842: iconst_0
/*     */     //   843: ldc_w 65466
/*     */     //   846: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   849: nop
/*     */     //   850: aload #28
/*     */     //   852: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   855: aload_2
/*     */     //   856: invokeinterface endNode : ()V
/*     */     //   861: aload_2
/*     */     //   862: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   865: nop
/*     */     //   866: aload_2
/*     */     //   867: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   870: nop
/*     */     //   871: aload_2
/*     */     //   872: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   875: nop
/*     */     //   876: invokestatic isTraceInProgress : ()Z
/*     */     //   879: ifeq -> 894
/*     */     //   882: invokestatic traceEventEnd : ()V
/*     */     //   885: goto -> 894
/*     */     //   888: aload_2
/*     */     //   889: invokeinterface skipToGroupEnd : ()V
/*     */     //   894: aload_2
/*     */     //   895: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   900: dup
/*     */     //   901: ifnull -> 920
/*     */     //   904: aload_0
/*     */     //   905: iload_1
/*     */     //   906: iload_3
/*     */     //   907: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/PlanItem;ZI)Lkotlin/jvm/functions/Function2;
/*     */     //   912: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   917: goto -> 921
/*     */     //   920: pop
/*     */     //   921: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #45	-> 0
/*     */     //   #46	-> 105
/*     */     //   #48	-> 113
/*     */     //   #49	-> 119
/*     */     //   #50	-> 125
/*     */     //   #70	-> 132
/*     */     //   #50	-> 138
/*     */     //   #51	-> 145
/*     */     //   #52	-> 153
/*     */     //   #71	-> 163
/*     */     //   #52	-> 169
/*     */     //   #47	-> 179
/*     */     //   #72	-> 188
/*     */     //   #73	-> 191
/*     */     //   #74	-> 228
/*     */     //   #75	-> 237
/*     */     //   #76	-> 242
/*     */     //   #77	-> 248
/*     */     //   #78	-> 256
/*     */     //   #80	-> 263
/*     */     //   #79	-> 285
/*     */     //   #81	-> 294
/*     */     //   #82	-> 297
/*     */     //   #83	-> 313
/*     */     //   #84	-> 318
/*     */     //   #85	-> 328
/*     */     //   #87	-> 339
/*     */     //   #89	-> 344
/*     */     //   #90	-> 353
/*     */     //   #91	-> 366
/*     */     //   #93	-> 379
/*     */     //   #94	-> 390
/*     */     //   #95	-> 397
/*     */     //   #96	-> 425
/*     */     //   #97	-> 437
/*     */     //   #99	-> 451
/*     */     //   #94	-> 452
/*     */     //   #99	-> 453
/*     */     //   #100	-> 454
/*     */     //   #101	-> 467
/*     */     //   #89	-> 468
/*     */     //   #102	-> 469
/*     */     //   #103	-> 493
/*     */     //   #55	-> 524
/*     */     //   #56	-> 568
/*     */     //   #57	-> 620
/*     */     //   #58	-> 672
/*     */     //   #59	-> 707
/*     */     //   #55	-> 762
/*     */     //   #62	-> 787
/*     */     //   #62	-> 788
/*     */     //   #63	-> 811
/*     */     //   #64	-> 819
/*     */     //   #61	-> 846
/*     */     //   #66	-> 849
/*     */     //   #103	-> 850
/*     */     //   #102	-> 855
/*     */     //   #104	-> 856
/*     */     //   #81	-> 862
/*     */     //   #105	-> 865
/*     */     //   #75	-> 867
/*     */     //   #106	-> 870
/*     */     //   #72	-> 872
/*     */     //   #107	-> 875
/*     */     //   #67	-> 888
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   132	6	9	$i$f$getDp	I
/*     */     //   129	9	8	$this$dp$iv	I
/*     */     //   163	6	11	$i$f$getDp	I
/*     */     //   160	9	10	$this$dp$iv	I
/*     */     //   530	257	34	state	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/Status;
/*     */     //   524	326	33	$i$a$-Row-PlanKt$PlanRow$1	I
/*     */     //   521	329	32	$this$PlanRow_u24lambda_u241	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   521	329	31	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   521	329	30	$changed	I
/*     */     //   485	370	29	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   482	373	28	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   482	373	27	$changed$iv	I
/*     */     //   397	55	26	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   394	58	25	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   390	64	24	$i$f$set-impl	I
/*     */     //   387	67	23	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   353	115	22	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   350	118	21	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   289	577	20	$i$f$ReusableComposeNode	I
/*     */     //   286	580	18	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   286	580	19	$changed$iv$iv$iv	I
/*     */     //   232	639	14	$i$f$Layout	I
/*     */     //   247	624	15	compositeKeyHash$iv$iv	I
/*     */     //   255	616	16	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   263	608	17	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   229	642	13	$changed$iv$iv	I
/*     */     //   183	693	11	$i$f$Row	I
/*     */     //   219	657	12	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   180	696	10	$changed$iv	I
/*     */     //   113	772	5	tint	J
/*     */     //   12	910	4	$dirty	I
/*     */     //   0	922	0	item	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/PlanItem;
/*     */     //   0	922	1	isChainRunning	Z
/*     */     //   0	922	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	922	3	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit Plan$lambda$0(Modifier $modifier, List<PlanItem> $plan, boolean $isChainRunning, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     Plan($modifier, $plan, $isChainRunning, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit PlanRow$lambda$2(PlanItem $item, boolean $isChainRunning, int $$changed, Composer $composer, int $force) {
/*     */     PlanRow($item, $isChainRunning, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\PlanKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */