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
/*     */ import androidx.compose.runtime.internal.ComposableLambdaKt;
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
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.jewel.ui.component.TextKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ public final class ComposableSingletons$BuildStepKt
/*     */ {
/*     */   @NotNull
/*  39 */   public static final ComposableSingletons$BuildStepKt INSTANCE = new ComposableSingletons$BuildStepKt(); @NotNull public final Function3<RowScope, Composer, Integer, Unit> getLambda-1$standalone() { return lambda-1; } @NotNull private static Function3<RowScope, Composer, Integer, Unit> lambda-1 = (Function3<RowScope, Composer, Integer, Unit>)ComposableLambdaKt.composableLambdaInstance(-1224048346, false, ComposableSingletons$BuildStepKt$lambda-1$1.INSTANCE); @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nBuildStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuildStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/ComposableSingletons$BuildStepKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,67:1\n149#2:68\n99#3:69\n95#3,7:70\n102#3:105\n106#3:109\n79#4,6:77\n86#4,4:92\n90#4,2:102\n94#4:108\n368#5,9:83\n377#5:104\n378#5,2:106\n4034#6,6:96\n*S KotlinDebug\n*F\n+ 1 BuildStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/ComposableSingletons$BuildStepKt$lambda-1$1\n*L\n42#1:68\n40#1:69\n40#1:70,7\n40#1:105\n40#1:109\n40#1:77,6\n40#1:92,4\n40#1:102,2\n40#1:108\n40#1:83,9\n40#1:104\n40#1:106,2\n40#1:96,6\n*E\n"}) static final class ComposableSingletons$BuildStepKt$lambda-1$1 implements Function3<RowScope, Composer, Integer, Unit> { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*  40 */     public final void invoke(RowScope $this$StepCard, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1224048346, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.ComposableSingletons$BuildStepKt.lambda-1.<anonymous> (BuildStep.kt:39)"); 
/*  41 */         Alignment.Vertical vertical = Alignment.Companion.getCenterVertically();
/*  42 */         int $this$dp$iv = 4, $i$f$getDp = 0; Arrangement.HorizontalOrVertical horizontalOrVertical = Arrangement.INSTANCE.spacedBy-0680j_4(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  68 */             Dp.constructor-impl($this$dp$iv)); int $changed$iv = 432; int $i$f$Row = 0;
/*  69 */         ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
/*  70 */         Modifier modifier$iv = (Modifier)Modifier.Companion;
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  75 */         MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy((Arrangement.Horizontal)horizontalOrVertical, vertical, $composer, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/*  76 */         int $i$f$Layout = 0;
/*  77 */         ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/*  78 */         int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/*  79 */         CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/*  80 */         Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
/*     */         
/*  82 */         Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/*  83 */         ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/*  84 */         if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/*  85 */           .startReusableNode();
/*  86 */         if ($composer.getInserting()) { $composer
/*  87 */             .createNode(function0); } else { $composer
/*     */             
/*  89 */             .useNode(); }
/*     */         
/*  91 */         Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/*  92 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/*  93 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */         
/*  95 */         Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/*  96 */         Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/*  97 */         if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/*  98 */           $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/*  99 */           $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */         } 
/*     */         
/* 102 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */         
/* 104 */         int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-RowKt$Row$1$iv = 0;
/* 105 */         ComposerKt.sourceInformationMarkerStart($composer$iv, -407840262, "C101@5126L9:Row.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; RowScope $this$invoke_u24lambda_u240 = (RowScope)RowScopeInstance.INSTANCE; int $i$a$-Row-ComposableSingletons$BuildStepKt$lambda-1$1$1 = 0; TextKt.Text-bAzTDeA("Build", null, 0L, 0L, null, FontWeight.Companion.getBold(), MatterhornThemeDataKt.getMatterhornTheme(composer1, 0).getMessageFont(composer1, 0), 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 196614, 0, 65438); ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 106 */         $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 107 */         ComposerKt.sourceInformationMarkerEnd($composer);
/* 108 */         ComposerKt.sourceInformationMarkerEnd($composer);
/* 109 */         if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*     */       else
/*     */       { $composer.skipToGroupEnd(); }
/*     */        }
/*     */ 
/*     */     
/*     */     public static final ComposableSingletons$BuildStepKt$lambda-1$1 INSTANCE = new ComposableSingletons$BuildStepKt$lambda-1$1(); }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\ComposableSingletons$BuildStepKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */