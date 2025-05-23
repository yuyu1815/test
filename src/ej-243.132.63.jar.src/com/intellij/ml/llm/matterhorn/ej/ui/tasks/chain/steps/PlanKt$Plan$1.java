/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*     */ import androidx.compose.foundation.layout.Arrangement;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.layout.ColumnScope;
/*     */ import androidx.compose.foundation.layout.SizeKt;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.PlanItem;
/*     */ import java.util.List;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nPlan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Plan.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PlanKt$Plan$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,69:1\n71#2:70\n67#2,7:71\n74#2:106\n78#2:151\n79#3,6:78\n86#3,4:93\n90#3,2:103\n79#3,6:115\n86#3,4:130\n90#3,2:140\n94#3:146\n94#3:150\n368#4,9:84\n377#4:105\n368#4,9:121\n377#4:142\n378#4,2:144\n378#4,2:148\n4034#5,6:97\n4034#5,6:134\n149#6:107\n86#7:108\n83#7,6:109\n89#7:143\n93#7:147\n*S KotlinDebug\n*F\n+ 1 Plan.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PlanKt$Plan$1\n*L\n29#1:70\n29#1:71,7\n29#1:106\n29#1:151\n29#1:78,6\n29#1:93,4\n29#1:103,2\n30#1:115,6\n30#1:130,4\n30#1:140,2\n30#1:146\n29#1:150\n29#1:84,9\n29#1:105\n30#1:121,9\n30#1:142\n30#1:144,2\n29#1:148,2\n29#1:97,6\n30#1:134,6\n33#1:107\n30#1:108\n30#1:109,6\n30#1:143\n30#1:147\n*E\n"})
/*     */ final class PlanKt$Plan$1 implements Function2<Composer, Integer, Unit> {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(Composer $composer, int $changed) {
/*  29 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-140171703, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.Plan.<anonymous> (Plan.kt:28)");  List<PlanItem> list = this.$plan; boolean bool1 = this.$isChainRunning; int $changed$iv = 0, $i$f$Box = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  70 */       ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/*  71 */       Modifier modifier$iv = (Modifier)Modifier.Companion;
/*  72 */       Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
/*  73 */       boolean propagateMinConstraints$iv = false;
/*     */ 
/*     */       
/*  76 */       MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/*  77 */       int $i$f$Layout = 0;
/*  78 */       ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/*  79 */       int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/*  80 */       CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/*  81 */       Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
/*     */       
/*  83 */       Function0 function01 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/*  84 */       ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/*  85 */       if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/*  86 */         .startReusableNode();
/*  87 */       if ($composer.getInserting()) { $composer
/*  88 */           .createNode(function01); } else { $composer
/*     */           
/*  90 */           .useNode(); }
/*     */       
/*  92 */       Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/*  93 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/*  94 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */       
/*  96 */       Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/*  97 */       Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/*  98 */       if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/*  99 */         $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 100 */         $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */       } 
/*     */       
/* 103 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */       
/* 105 */       int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/* 106 */       ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u241 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-PlanKt$Plan$1$1 = 0; int $this$dp$iv = 10, $i$f$getDp = 0;
/* 107 */       Modifier modifier1 = PaddingKt.padding-qDBjuR0$default(SizeKt.fillMaxWidth$default((Modifier)Modifier.Companion, 0.0F, 1, null), 0.0F, Dp.constructor-impl($this$dp$iv), 0.0F, 0.0F, 13, null); int k = 6; int $i$f$Column = 0;
/* 108 */       ComposerKt.sourceInformationMarkerStart(composer1, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
/* 109 */       Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
/* 110 */       Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
/*     */ 
/*     */       
/* 113 */       MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, composer1, 0xE & k >> 3 | 0x70 & k >> 3); int m = 0x70 & k << 3;
/* 114 */       int n = 0;
/* 115 */       ComposerKt.sourceInformationMarkerStart(composer1, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 116 */       int i1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
/* 117 */       CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
/* 118 */       Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
/*     */       
/* 120 */       Function0 function02 = ComposeUiNode.Companion.getConstructor(); int i2 = 0x6 | 0x380 & m << 6; int i3 = 0;
/* 121 */       ComposerKt.sourceInformationMarkerStart(composer1, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 122 */       if (!(composer1.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  composer1
/* 123 */         .startReusableNode();
/* 124 */       if (composer1.getInserting()) { composer1
/* 125 */           .createNode(function02); } else { composer1
/*     */           
/* 127 */           .useNode(); }
/*     */       
/* 129 */       Composer composer2 = Updater.constructor-impl(composer1); int i4 = 0;
/* 130 */       Updater.set-impl(composer2, measurePolicy1, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 131 */       Updater.set-impl(composer2, compositionLocalMap1, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */       
/* 133 */       Function2 function21 = ComposeUiNode.Companion.getSetCompositeKeyHash(); int i5 = 0;
/* 134 */       Composer composer3 = composer2; int i6 = 0;
/* 135 */       if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(i1))) {
/* 136 */         composer3.updateRememberedValue(Integer.valueOf(i1));
/* 137 */         composer2.apply(Integer.valueOf(i1), function21);
/*     */       } 
/*     */       
/* 140 */       Updater.set-impl(composer2, modifier2, ComposeUiNode.Companion.getSetModifier());
/*     */       
/* 142 */       int i7 = 0xE & i2 >> 6; Composer composer4 = composer1; int $i$a$-Layout-ColumnKt$Column$1$iv = 0;
/* 143 */       ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo"); int i8 = 0x6 | 0x70 & k >> 6; Composer composer5 = composer4; ColumnScope $this$invoke_u24lambda_u241_u24lambda_u240 = (ColumnScope)ColumnScopeInstance.INSTANCE; int $i$a$-Column-PlanKt$Plan$1$1$1 = 0; composer5.startReplaceGroup(202126005); for (PlanItem item : list) PlanKt.access$PlanRow(item, bool1, composer5, 0);  composer5.endReplaceGroup(); ComposerKt.sourceInformationMarkerEnd(composer4);
/* 144 */       composer1.endNode(); ComposerKt.sourceInformationMarkerEnd(composer1);
/* 145 */       ComposerKt.sourceInformationMarkerEnd(composer1);
/* 146 */       ComposerKt.sourceInformationMarkerEnd(composer1);
/*     */       ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 148 */       $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 149 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 150 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 151 */       if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*     */     else
/*     */     { $composer.skipToGroupEnd(); }
/*     */   
/*     */   }
/*     */   
/*     */   PlanKt$Plan$1(List<PlanItem> $plan, boolean $isChainRunning) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\PlanKt$Plan$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */