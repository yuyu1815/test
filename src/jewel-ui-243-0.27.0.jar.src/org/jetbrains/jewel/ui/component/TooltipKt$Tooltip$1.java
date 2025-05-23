/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.layout.BoxKt;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.layout.BoxScopeInstance;
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
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.jewel.ui.component.styling.TooltipStyle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\norg/jetbrains/jewel/ui/component/TooltipKt$Tooltip$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,146:1\n71#2:147\n67#2,7:148\n74#2:183\n78#2:187\n79#3,6:155\n86#3,4:170\n90#3,2:180\n94#3:186\n368#4,9:161\n377#4:182\n378#4,2:184\n4034#5,6:174\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\norg/jetbrains/jewel/ui/component/TooltipKt$Tooltip$1\n*L\n54#1:147\n54#1:148,7\n54#1:183\n54#1:187\n54#1:155,6\n54#1:170,4\n54#1:180,2\n54#1:186\n54#1:161,9\n54#1:182\n54#1:184,2\n54#1:174,6\n*E\n"})
/*     */ final class TooltipKt$Tooltip$1
/*     */   implements Function2<Composer, Integer, Unit>
/*     */ {
/*     */   TooltipKt$Tooltip$1(boolean $enabled, TooltipStyle $style, Function2<Composer, Integer, Unit> $tooltip) {}
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(Composer $composer, int $changed) {
/*  54 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-758886690, $changed, -1, "org.jetbrains.jewel.ui.component.Tooltip.<anonymous> (Tooltip.kt:53)");  if (this.$enabled) { $composer.startReplaceGroup(-1609173921); TooltipKt.access$TooltipImpl(this.$style, this.$tooltip, $composer, 0); $composer.endReplaceGroup(); } else { $composer.startReplaceGroup(-1609172886); int $changed$iv = 0, $i$f$Box = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 147 */         ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/* 148 */         Modifier modifier$iv = (Modifier)Modifier.Companion;
/* 149 */         Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
/* 150 */         boolean propagateMinConstraints$iv = false;
/*     */ 
/*     */         
/* 153 */         MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/* 154 */         int $i$f$Layout = 0;
/* 155 */         ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 156 */         int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 157 */         CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/* 158 */         Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
/*     */         
/* 160 */         Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 161 */         ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 162 */         if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 163 */           .startReusableNode();
/* 164 */         if ($composer.getInserting()) { $composer
/* 165 */             .createNode(function0); } else { $composer
/*     */             
/* 167 */             .useNode(); }
/*     */         
/* 169 */         Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 170 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 171 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */         
/* 173 */         Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 174 */         Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 175 */         if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 176 */           $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 177 */           $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */         } 
/*     */         
/* 180 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */         
/* 182 */         int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/* 183 */         ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-TooltipKt$Tooltip$1$1 = 0; ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 184 */         $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 185 */         ComposerKt.sourceInformationMarkerEnd($composer);
/* 186 */         ComposerKt.sourceInformationMarkerEnd($composer);
/*     */         $composer.endReplaceGroup(); }
/*     */       
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventEnd();  }
/*     */     else
/*     */     { $composer.skipToGroupEnd(); }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\TooltipKt$Tooltip$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */