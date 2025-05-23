/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*    */ import androidx.compose.foundation.layout.Arrangement;
/*    */ import androidx.compose.foundation.layout.BoxScope;
/*    */ import androidx.compose.foundation.layout.PaddingKt;
/*    */ import androidx.compose.foundation.layout.RowScope;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.ComposablesKt;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.CompositionLocalMap;
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import androidx.compose.runtime.Updater;
/*    */ import androidx.compose.ui.Alignment;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import androidx.compose.ui.layout.MeasurePolicy;
/*    */ import androidx.compose.ui.node.ComposeUiNode;
/*    */ import androidx.compose.ui.text.style.TextOverflow;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.jewel.ui.component.TextKt;
/*    */ import org.jetbrains.jewel.ui.icon.IconKey;
/*    */ import org.jetbrains.jewel.ui.icon.IntelliJIconKey;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ @SourceDebugExtension({"SMAP\nDisplayCopyableLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisplayCopyableLink.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/DisplayCopyableLinkKt$DisplayCopyableLink$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,54:1\n149#2:55\n149#2:93\n99#3:56\n95#3,7:57\n102#3:92\n106#3:97\n79#4,6:64\n86#4,4:79\n90#4,2:89\n94#4:96\n368#5,9:70\n377#5:91\n378#5,2:94\n4034#6,6:83\n*S KotlinDebug\n*F\n+ 1 DisplayCopyableLink.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/DisplayCopyableLinkKt$DisplayCopyableLink$2\n*L\n37#1:55\n45#1:93\n35#1:56\n35#1:57,7\n35#1:92\n35#1:97\n35#1:64,6\n35#1:79,4\n35#1:89,2\n35#1:96\n35#1:70,9\n35#1:91\n35#1:94,2\n35#1:83,6\n*E\n"})
/*    */ final class DisplayCopyableLinkKt$DisplayCopyableLink$2 implements Function3<BoxScope, Composer, Integer, Unit> {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(BoxScope $this$JunieHoverableChip, Composer $composer, int $changed) {
/* 35 */     Intrinsics.checkNotNullParameter($this$JunieHoverableChip, "$this$JunieHoverableChip"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(255288772, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.DisplayCopyableLink.<anonymous> (DisplayCopyableLink.kt:34)"); 
/* 36 */       Alignment.Vertical vertical = Alignment.Companion.getCenterVertically();
/* 37 */       int $this$dp$iv = 4, $i$f$getDp = 0; Arrangement.HorizontalOrVertical horizontalOrVertical = Arrangement.INSTANCE.spacedBy-0680j_4(
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
/* 55 */           Dp.constructor-impl($this$dp$iv)); String str = this.$link; MutableState<Boolean> mutableState = this.$copiedToClipboard$delegate; int $changed$iv = 432, $i$f$Row = 0;
/* 56 */       ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
/* 57 */       Modifier modifier$iv = (Modifier)Modifier.Companion;
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 62 */       MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy((Arrangement.Horizontal)horizontalOrVertical, vertical, $composer, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/* 63 */       int $i$f$Layout = 0;
/* 64 */       ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 65 */       int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 66 */       CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/* 67 */       Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
/*    */       
/* 69 */       Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 70 */       ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 71 */       if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 72 */         .startReusableNode();
/* 73 */       if ($composer.getInserting()) { $composer
/* 74 */           .createNode(function0); } else { $composer
/*    */           
/* 76 */           .useNode(); }
/*    */       
/* 78 */       Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 79 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 80 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*    */       
/* 82 */       Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 83 */       Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 84 */       if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 85 */         $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 86 */         $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*    */       } 
/*    */       
/* 89 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*    */       
/* 91 */       int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-RowKt$Row$1$iv = 0;
/* 92 */       ComposerKt.sourceInformationMarkerStart($composer$iv, -407840262, "C101@5126L9:Row.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; RowScope $this$invoke_u24lambda_u240 = (RowScope)RowScopeInstance.INSTANCE; int $i$a$-Row-DisplayCopyableLinkKt$DisplayCopyableLink$2$1 = 0; composer1.startReplaceGroup(-1668208809); long l1 = DisplayCopyableLinkKt.access$DisplayCopyableLink$lambda$1(mutableState) ? MatterhornThemeDataKt.getMatterhornTheme(composer1, 0).getOnboardingDotsColor-0d7_KjU() : Color.Companion.getUnspecified-0d7_KjU(); composer1.endReplaceGroup(); IconKt.Icon-FHprtrg((IconKey)AllIconsKeys.Actions.INSTANCE.getCopy(), "copy to clipboard", null, null, l1, new org.jetbrains.jewel.ui.painter.PainterHint[0], composer1, 0x30 | IntelliJIconKey.$stable, 12); int k = 4, m = 0;
/* 93 */       Modifier modifier1 = PaddingKt.padding-VpY3zN4$default((Modifier)Modifier.Companion, 0.0F, Dp.constructor-impl(k), 1, null); long l2 = MatterhornThemeDataKt.getMatterhornTheme(composer1, 0).getBlockTextColor-0d7_KjU(); int n = TextOverflow.Companion.getEllipsis-gIe3tQ8(); TextKt.Text-bAzTDeA(str, modifier1, l2, 0L, null, null, null, 0L, null, 0, 0L, n, false, 1, null, null, composer1, 48, 3120, 55288); ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 94 */       $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 95 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 96 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 97 */       if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*    */     else
/*    */     { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   DisplayCopyableLinkKt$DisplayCopyableLink$2(String $link, MutableState<Boolean> $copiedToClipboard$delegate) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\DisplayCopyableLinkKt$DisplayCopyableLink$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */