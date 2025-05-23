/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks;
/*     */ 
/*     */ import androidx.compose.foundation.layout.Arrangement;
/*     */ import androidx.compose.foundation.layout.RowKt;
/*     */ import androidx.compose.foundation.layout.RowScope;
/*     */ import androidx.compose.foundation.layout.RowScopeInstance;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
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
/*     */ import androidx.compose.ui.text.font.FontWeight;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.jewel.ui.component.TextKt;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nTestStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/TestStepKt$TestStep$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,68:1\n149#2:69\n99#3:70\n95#3,7:71\n102#3:106\n106#3:110\n79#4,6:78\n86#4,4:93\n90#4,2:103\n94#4:109\n368#5,9:84\n377#5:105\n378#5,2:107\n4034#6,6:97\n*S KotlinDebug\n*F\n+ 1 TestStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/TestStepKt$TestStep$3\n*L\n41#1:69\n39#1:70\n39#1:71,7\n39#1:106\n39#1:110\n39#1:78,6\n39#1:93,4\n39#1:103,2\n39#1:109\n39#1:84,9\n39#1:105\n39#1:107,2\n39#1:97,6\n*E\n"})
/*     */ final class TestStepKt$TestStep$3
/*     */   implements Function3<RowScope, Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(RowScope $this$StepCard, Composer $composer, int $changed) {
/*  39 */     Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(834846091, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.TestStep.<anonymous> (TestStep.kt:38)"); 
/*  40 */       Alignment.Vertical vertical = Alignment.Companion.getCenterVertically();
/*  41 */       int $this$dp$iv = 4, $i$f$getDp = 0; Arrangement.HorizontalOrVertical horizontalOrVertical = Arrangement.INSTANCE.spacedBy-0680j_4(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  69 */           Dp.constructor-impl($this$dp$iv)); $i$f$getDp = this.$successfulTests; int i = this.$failedTests, $changed$iv = 432, $i$f$Row = 0;
/*  70 */       ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
/*  71 */       Modifier modifier$iv = (Modifier)Modifier.Companion;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  76 */       MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy((Arrangement.Horizontal)horizontalOrVertical, vertical, $composer, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/*  77 */       int $i$f$Layout = 0;
/*  78 */       ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/*  79 */       int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/*  80 */       CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/*  81 */       Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
/*     */       
/*  83 */       Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/*  84 */       ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/*  85 */       if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/*  86 */         .startReusableNode();
/*  87 */       if ($composer.getInserting()) { $composer
/*  88 */           .createNode(function0); } else { $composer
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
/* 105 */       int j = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-RowKt$Row$1$iv = 0;
/* 106 */       ComposerKt.sourceInformationMarkerStart($composer$iv, -407840262, "C101@5126L9:Row.kt#2w3rfo"); int k = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; RowScope $this$invoke_u24lambda_u240 = (RowScope)RowScopeInstance.INSTANCE; int $i$a$-Row-TestStepKt$TestStep$3$1 = 0; TextKt.Text-bAzTDeA("Tests", null, 0L, 0L, null, FontWeight.Companion.getBold(), MatterhornThemeDataKt.getMatterhornTheme(composer1, 0).getMessageFont(composer1, 0), 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 196614, 0, 65438); composer1.startReplaceGroup(-1883433589); if ($i$f$getDp > 0 || i > 0) { TextKt.Text-bAzTDeA("" + $i$f$getDp + "✓", null, MatterhornThemeDataKt.getMatterhornTheme(composer1, 0).getTestSuccessColor-0d7_KjU(), 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65530); TextKt.Text-bAzTDeA("" + i + "✗", null, MatterhornThemeDataKt.getMatterhornTheme(composer1, 0).getTestFailColor-0d7_KjU(), 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65530); }  composer1.endReplaceGroup(); ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 107 */       $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 108 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 109 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 110 */       if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*     */     else
/*     */     { $composer.skipToGroupEnd(); }
/*     */   
/*     */   }
/*     */   
/*     */   TestStepKt$TestStep$3(int $successfulTests, int $failedTests) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\TestStepKt$TestStep$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */