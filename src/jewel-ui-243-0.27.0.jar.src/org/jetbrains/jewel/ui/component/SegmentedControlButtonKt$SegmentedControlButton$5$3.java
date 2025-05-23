/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.layout.Arrangement;
/*     */ import androidx.compose.foundation.layout.PaddingKt;
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
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import androidx.compose.ui.unit.DpSize;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.jewel.ui.component.styling.SegmentedControlButtonStyle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @SourceDebugExtension({"SMAP\nSegmentedControlButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedControlButton.kt\norg/jetbrains/jewel/ui/component/SegmentedControlButtonKt$SegmentedControlButton$5$3\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,171:1\n99#2,3:172\n102#2:203\n106#2:207\n79#3,6:175\n86#3,4:190\n90#3,2:200\n94#3:206\n368#4,9:181\n377#4:202\n378#4,2:204\n4034#5,6:194\n*S KotlinDebug\n*F\n+ 1 SegmentedControlButton.kt\norg/jetbrains/jewel/ui/component/SegmentedControlButtonKt$SegmentedControlButton$5$3\n*L\n109#1:172,3\n109#1:203\n109#1:207\n109#1:175,6\n109#1:190,4\n109#1:200,2\n109#1:206\n109#1:181,9\n109#1:202\n109#1:204,2\n109#1:194,6\n*E\n"})
/*     */ final class SegmentedControlButtonKt$SegmentedControlButton$5$3
/*     */   implements Function2<Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(Composer $composer, int $changed) {
/* 109 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(433473535, $changed, -1, "org.jetbrains.jewel.ui.component.SegmentedControlButton.<anonymous>.<anonymous> (SegmentedControlButton.kt:108)");
/*     */       
/* 111 */       Modifier modifier1 = PaddingKt.padding(SizeKt.defaultMinSize-VpY3zN4((Modifier)Modifier.Companion, DpSize.getWidth-D9Ej5fM(this.$style.getMetrics().getMinSize-MYxV2XQ()), DpSize.getHeight-D9Ej5fM(this.$style.getMetrics().getMinSize-MYxV2XQ())), this.$style.getMetrics().getSegmentedButtonPadding());
/* 112 */       Arrangement.Horizontal horizontal = (Arrangement.Horizontal)Arrangement.INSTANCE.getCenter();
/* 113 */       Alignment.Vertical vertical = Alignment.Companion.getCenterVertically();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       SegmentedControlButtonData segmentedControlButtonData = this.$segmentedControlButtonData;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       MutableState<SegmentedControlButtonState> mutableState = this.$buttonState$delegate;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       int $changed$iv = 432, $i$f$Row = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 172 */       ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
/* 173 */       MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontal, vertical, $composer, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/* 174 */       int $i$f$Layout = 0;
/* 175 */       ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 176 */       int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 177 */       CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/* 178 */       Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*     */       
/* 180 */       Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 181 */       ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 182 */       if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 183 */         .startReusableNode();
/* 184 */       if ($composer.getInserting()) { $composer
/* 185 */           .createNode(function0); } else { $composer
/*     */           
/* 187 */           .useNode(); }
/*     */       
/* 189 */       Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 190 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 191 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */       
/* 193 */       Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 194 */       Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 195 */       if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 196 */         $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 197 */         $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */       } 
/*     */       
/* 200 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */       
/* 202 */       int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-RowKt$Row$1$iv = 0;
/* 203 */       ComposerKt.sourceInformationMarkerStart($composer$iv, -407840262, "C101@5126L9:Row.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; RowScope $this$invoke_u24lambda_u240 = (RowScope)RowScopeInstance.INSTANCE; int $i$a$-Row-SegmentedControlButtonKt$SegmentedControlButton$5$3$1 = 0; segmentedControlButtonData.getContent().invoke(new SegmentedControlButtonScopeContainer(), SegmentedControlButtonState.box-impl(SegmentedControlButtonKt.access$SegmentedControlButton$lambda$2(mutableState)), composer1, Integer.valueOf(0)); ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 204 */       $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 205 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 206 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 207 */       if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*     */     else
/*     */     { $composer.skipToGroupEnd(); }
/*     */   
/*     */   }
/*     */   
/*     */   SegmentedControlButtonKt$SegmentedControlButton$5$3(SegmentedControlButtonStyle $style, SegmentedControlButtonData $segmentedControlButtonData, MutableState<SegmentedControlButtonState> $buttonState$delegate) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\SegmentedControlButtonKt$SegmentedControlButton$5$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */