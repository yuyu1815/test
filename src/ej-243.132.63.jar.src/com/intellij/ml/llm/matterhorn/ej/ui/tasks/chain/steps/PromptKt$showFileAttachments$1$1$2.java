/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*    */ 
/*    */ import androidx.compose.foundation.layout.BoxKt;
/*    */ import androidx.compose.foundation.layout.BoxScope;
/*    */ import androidx.compose.foundation.layout.BoxScopeInstance;
/*    */ import androidx.compose.foundation.layout.PaddingKt;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.ComposablesKt;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.CompositionLocalMap;
/*    */ import androidx.compose.runtime.Updater;
/*    */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*    */ import androidx.compose.ui.Alignment;
/*    */ import androidx.compose.ui.ComposedModifierKt;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.layout.MeasurePolicy;
/*    */ import androidx.compose.ui.node.ComposeUiNode;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.components.JunieHoverableChipKt;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.AttachedFile;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.jewel.ui.component.TextKt;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ @SourceDebugExtension({"SMAP\nPrompt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Prompt.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PromptKt$showFileAttachments$1$1$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,55:1\n1225#2,6:56\n*S KotlinDebug\n*F\n+ 1 Prompt.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PromptKt$showFileAttachments$1$1$2\n*L\n47#1:56,6\n*E\n"})
/*    */ final class PromptKt$showFileAttachments$1$1$2
/*    */   implements Function2<Composer, Integer, Unit>
/*    */ {
/*    */   private static final Unit invoke$lambda$1$lambda$0() {
/* 47 */     return Unit.INSTANCE; } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(456371902, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.showFileAttachments.<anonymous>.<anonymous>.<anonymous> (Prompt.kt:46)");  $composer.startReplaceGroup(-1401836179); Composer composer = $composer; boolean invalid$iv = false; int $i$f$cache = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 56 */       Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*    */       
/* 58 */       int $i$a$-cache-PromptKt$showFileAttachments$1$1$2$1 = 0; Object value$iv = PromptKt$showFileAttachments$1$1$2::invoke$lambda$1$lambda$0;
/* 59 */       composer.updateRememberedValue(value$iv);
/* 60 */       Function0 function0 = (it$iv == Composer.Companion.getEmpty()) ? (Function0)value$iv : 
/* 61 */         (Function0)it$iv; $composer.endReplaceGroup(); JunieHoverableChipKt.JunieHoverableChip-eopBjH0(function0, 0L, 0L, (Function3)ComposableLambdaKt.rememberComposableLambda(-381277688, true, new Function3<BoxScope, Composer, Integer, Unit>(this.$file, this.$index) { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(BoxScope $this$JunieHoverableChip, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$JunieHoverableChip, "$this$JunieHoverableChip"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress())
/* 62 */                     ComposerKt.traceEventStart(-381277688, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.showFileAttachments.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Prompt.kt:47)");  int $this$dp$iv = 4, $i$f$getDp = 0; Modifier modifier1 = PaddingKt.padding-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl($this$dp$iv)); AttachedFile attachedFile = this.$file; int i = this.$index, $changed$iv = 6, $i$f$Box = 0; ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo"); Alignment contentAlignment$iv = Alignment.Companion.getTopStart(); boolean propagateMinConstraints$iv = false; MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/* 63 */                   int $i$f$Layout = 0;
/* 64 */                   ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 65 */                   int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 66 */                   CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/* 67 */                   Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*    */                   
/* 69 */                   Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 70 */                   ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 71 */                   if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 72 */                     .startReusableNode();
/* 73 */                   if ($composer.getInserting()) { $composer
/* 74 */                       .createNode(function0); } else { $composer
/*    */                       
/* 76 */                       .useNode(); }
/*    */                   
/* 78 */                   Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 79 */                   Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 80 */                   Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*    */                   
/* 82 */                   Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 83 */                   Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 84 */                   if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 85 */                     $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 86 */                     $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*    */                   } 
/*    */                   
/* 89 */                   Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*    */                   
/* 91 */                   int j = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/* 92 */                   ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int k = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-PromptKt$showFileAttachments$1$1$2$2$1 = 0; if (attachedFile.getShortName() == null) attachedFile.getShortName();  TextKt.Text-bAzTDeA("File " + i, null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534); ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 93 */                   $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 94 */                   ComposerKt.sourceInformationMarkerEnd($composer);
/* 95 */                   ComposerKt.sourceInformationMarkerEnd($composer);
/* 96 */                   if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*    */                 else
/*    */                 { $composer.skipToGroupEnd(); }
/*    */                  }
/*    */                }
/*    */             $composer, 54), $composer, 3078, 6);
/*    */       if (ComposerKt.isTraceInProgress())
/*    */         ComposerKt.traceEventEnd();  }
/*    */     else
/*    */     { $composer.skipToGroupEnd(); }
/*    */      }
/*    */ 
/*    */   
/*    */   PromptKt$showFileAttachments$1$1$2(AttachedFile $file, int $index) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\PromptKt$showFileAttachments$1$1$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */