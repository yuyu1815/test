/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt;
/*     */ 
/*     */ import androidx.compose.foundation.layout.Arrangement;
/*     */ import androidx.compose.foundation.layout.RowKt;
/*     */ import androidx.compose.foundation.layout.RowScope;
/*     */ import androidx.compose.foundation.layout.RowScopeInstance;
/*     */ import androidx.compose.foundation.layout.SizeKt;
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
/*     */ import androidx.compose.ui.text.style.TextOverflow;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.components.JunieTooltipKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeData;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.jewel.ui.component.IconKt;
/*     */ import org.jetbrains.jewel.ui.component.TextKt;
/*     */ import org.jetbrains.jewel.ui.icon.IconKey;
/*     */ import org.jetbrains.jewel.ui.icon.PathIconKey;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ public final class ComposableSingletons$PromptAreaKt
/*     */ {
/*     */   @NotNull
/* 294 */   private static Function3<RowScope, Composer, Integer, Unit> lambda-3 = (Function3<RowScope, Composer, Integer, Unit>)ComposableLambdaKt.composableLambdaInstance(375878879, false, ComposableSingletons$PromptAreaKt$lambda-3$1.INSTANCE); @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class ComposableSingletons$PromptAreaKt$lambda-3$1 implements Function3<RowScope, Composer, Integer, Unit> { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/* 295 */     public final void invoke(RowScope $this$CheckboxRow, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$CheckboxRow, "$this$CheckboxRow"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(375878879, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.ComposableSingletons$PromptAreaKt.lambda-3.<anonymous> (PromptArea.kt:294)");  JunieTooltipKt.BraveModeTooltip(ComposableSingletons$PromptAreaKt.INSTANCE.getLambda-1$ej_ui(), ComposableSingletons$PromptAreaKt.INSTANCE.getLambda-2$ej_ui(), $composer, 54); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */          }
/*     */       
/*     */       else
/*     */       
/*     */       { 
/*     */ 
/*     */ 
/*     */         
/* 314 */         $composer.skipToGroupEnd(); }
/*     */        }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final ComposableSingletons$PromptAreaKt$lambda-3$1 INSTANCE = new ComposableSingletons$PromptAreaKt$lambda-3$1(); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final ComposableSingletons$PromptAreaKt INSTANCE = new ComposableSingletons$PromptAreaKt();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static Function2<Composer, Integer, Unit> lambda-1 = (Function2<Composer, Integer, Unit>)ComposableLambdaKt.composableLambdaInstance(105870834, false, ComposableSingletons$PromptAreaKt$lambda-1$1.INSTANCE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ComposableSingletons$PromptAreaKt$lambda-1$1
/*     */     implements Function2<Composer, Integer, Unit>
/*     */   {
/*     */     public static final ComposableSingletons$PromptAreaKt$lambda-1$1 INSTANCE = new ComposableSingletons$PromptAreaKt$lambda-1$1();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*     */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress()) {
/*     */           ComposerKt.traceEventStart(105870834, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.ComposableSingletons$PromptAreaKt.lambda-1.<anonymous> (PromptArea.kt:295)");
/*     */         }
/*     */         TextKt.Text-bAzTDeA("Allow Junie to execute terminal commands without confirmation. Use with caution and at your own risk.", null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, $composer, 6, 0, 65534);
/*     */         if (ComposerKt.isTraceInProgress()) {
/*     */           ComposerKt.traceEventEnd();
/*     */         }
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static Function2<Composer, Integer, Unit> lambda-2 = (Function2<Composer, Integer, Unit>)ComposableLambdaKt.composableLambdaInstance(512898321, false, ComposableSingletons$PromptAreaKt$lambda-2$1.INSTANCE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final Function2<Composer, Integer, Unit> getLambda-1$ej_ui() {
/*     */     return lambda-1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final Function2<Composer, Integer, Unit> getLambda-2$ej_ui() {
/*     */     return lambda-2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final Function3<RowScope, Composer, Integer, Unit> getLambda-3$ej_ui() {
/*     */     return lambda-3;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nPromptArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromptArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/ComposableSingletons$PromptAreaKt$lambda-2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,472:1\n149#2:473\n149#2:511\n99#3:474\n95#3,7:475\n102#3:510\n106#3:515\n79#4,6:482\n86#4,4:497\n90#4,2:507\n94#4:514\n368#5,9:488\n377#5:509\n378#5,2:512\n4034#6,6:501\n*S KotlinDebug\n*F\n+ 1 PromptArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/ComposableSingletons$PromptAreaKt$lambda-2$1\n*L\n299#1:473\n311#1:511\n298#1:474\n298#1:475,7\n298#1:510\n298#1:515\n298#1:482,6\n298#1:497,4\n298#1:507,2\n298#1:514\n298#1:488,9\n298#1:509\n298#1:512,2\n298#1:501,6\n*E\n"})
/*     */   static final class ComposableSingletons$PromptAreaKt$lambda-2$1
/*     */     implements Function2<Composer, Integer, Unit>
/*     */   {
/*     */     public static final ComposableSingletons$PromptAreaKt$lambda-2$1 INSTANCE = new ComposableSingletons$PromptAreaKt$lambda-2$1();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*     */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress()) {
/*     */           ComposerKt.traceEventStart(512898321, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.ComposableSingletons$PromptAreaKt.lambda-2.<anonymous> (PromptArea.kt:297)");
/*     */         }
/*     */         int $this$dp$iv = 4, $i$f$getDp = 0;
/* 473 */         Arrangement.Horizontal horizontal = (Arrangement.Horizontal)Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl($this$dp$iv)); Alignment.Vertical vertical = Alignment.Companion.getCenterVertically(); int $changed$iv = 432; int $i$f$Row = 0;
/* 474 */         ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
/* 475 */         Modifier modifier$iv = (Modifier)Modifier.Companion;
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 480 */         MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontal, vertical, $composer, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/* 481 */         int $i$f$Layout = 0;
/* 482 */         ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 483 */         int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 484 */         CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/* 485 */         Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
/*     */         
/* 487 */         Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 488 */         ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 489 */         if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 490 */           .startReusableNode();
/* 491 */         if ($composer.getInserting()) { $composer
/* 492 */             .createNode(function0); } else { $composer
/*     */             
/* 494 */             .useNode(); }
/*     */         
/* 496 */         Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 497 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 498 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */         
/* 500 */         Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 501 */         Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 502 */         if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 503 */           $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 504 */           $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */         } 
/*     */         
/* 507 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */         
/* 509 */         int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-RowKt$Row$1$iv = 0;
/* 510 */         ComposerKt.sourceInformationMarkerStart($composer$iv, -407840262, "C101@5126L9:Row.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; RowScope $this$invoke_u24lambda_u240 = (RowScope)RowScopeInstance.INSTANCE; int $i$a$-Row-ComposableSingletons$PromptAreaKt$lambda-2$1$1 = 0; long l = MatterhornThemeDataKt.getMatterhornTheme(composer1, 0).getInactiveTextColor(composer1, MatterhornThemeData.$stable); int k = TextOverflow.Companion.getEllipsis-gIe3tQ8(); TextKt.Text-bAzTDeA("Brave Mode", null, l, 0L, null, null, null, 0L, null, 0, 0L, k, false, 1, null, null, composer1, 6, 3120, 55290); int m = 16, n = 0;
/* 511 */         IconKt.Icon-FHprtrg((IconKey)MatterhornThemeDataKt.getMatterhornTheme(composer1, 0).getBraveModeInfoIcon(), "Brave Mode Toggle", SizeKt.requiredSize-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl(m)), null, 0L, new org.jetbrains.jewel.ui.painter.PainterHint[0], composer1, 0x1B0 | PathIconKey.$stable, 24); ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 512 */         $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 513 */         ComposerKt.sourceInformationMarkerEnd($composer);
/* 514 */         ComposerKt.sourceInformationMarkerEnd($composer);
/* 515 */         if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd(); 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\prompt\ComposableSingletons$PromptAreaKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */