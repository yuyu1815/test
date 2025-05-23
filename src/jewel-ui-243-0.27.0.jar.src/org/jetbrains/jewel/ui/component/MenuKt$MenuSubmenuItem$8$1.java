/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.layout.Arrangement;
/*     */ import androidx.compose.foundation.layout.BoxKt;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.layout.BoxScopeInstance;
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
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.jewel.foundation.state.InteractiveComponentState;
/*     */ import org.jetbrains.jewel.ui.component.styling.MenuItemColors;
/*     */ import org.jetbrains.jewel.ui.component.styling.MenuMetrics;
/*     */ import org.jetbrains.jewel.ui.component.styling.MenuStyle;
/*     */ import org.jetbrains.jewel.ui.icon.IconKey;
/*     */ import org.jetbrains.jewel.ui.painter.PainterHint;
/*     */ import org.jetbrains.jewel.ui.painter.hints.StatefulKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\norg/jetbrains/jewel/ui/component/MenuKt$MenuSubmenuItem$8$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,706:1\n149#2:707\n99#3,3:708\n102#3:739\n106#3:783\n79#4,6:711\n86#4,4:726\n90#4,2:736\n79#4,6:747\n86#4,4:762\n90#4,2:772\n94#4:778\n94#4:782\n368#5,9:717\n377#5:738\n368#5,9:753\n377#5:774\n378#5,2:776\n378#5,2:780\n4034#6,6:730\n4034#6,6:766\n71#7:740\n68#7,6:741\n74#7:775\n78#7:779\n*S KotlinDebug\n*F\n+ 1 Menu.kt\norg/jetbrains/jewel/ui/component/MenuKt$MenuSubmenuItem$8$1\n*L\n534#1:707\n531#1:708,3\n531#1:739\n531#1:783\n531#1:711,6\n531#1:726,4\n531#1:736,2\n544#1:747,6\n544#1:762,4\n544#1:772,2\n544#1:778\n531#1:782\n531#1:717,9\n531#1:738\n544#1:753,9\n544#1:774\n544#1:776,2\n531#1:780,2\n531#1:730,6\n544#1:766,6\n544#1:740\n544#1:741,6\n544#1:775\n544#1:779\n*E\n"})
/*     */ final class MenuKt$MenuSubmenuItem$8$1
/*     */   implements Function2<Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(Composer $composer, int $changed) {
/* 531 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-519464636, $changed, -1, "org.jetbrains.jewel.ui.component.MenuSubmenuItem.<anonymous>.<anonymous> (Menu.kt:530)"); 
/* 532 */       Modifier modifier1 = PaddingKt.padding(SizeKt.fillMaxWidth$default((Modifier)Modifier.Companion, 0.0F, 1, null), this.$menuMetrics.getItemMetrics().getContentPadding());
/* 533 */       Alignment.Vertical vertical = Alignment.Companion.getCenterVertically();
/* 534 */       int $this$dp$iv = 4, $i$f$getDp = 0; Arrangement.HorizontalOrVertical horizontalOrVertical = Arrangement.INSTANCE.spacedBy-0680j_4(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 707 */           Dp.constructor-impl($this$dp$iv)); boolean bool1 = this.$canShowIcon; IconKey iconKey1 = this.$iconKey; MenuStyle menuStyle = this.$style; MenuItemColors menuItemColors = this.$itemColors; Function2<Composer, Integer, Unit> function2 = this.$content; MutableState<MenuItemState> mutableState = this.$itemState$delegate; int $changed$iv = 432, $i$f$Row = 0;
/* 708 */       ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
/* 709 */       MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy((Arrangement.Horizontal)horizontalOrVertical, vertical, $composer, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/* 710 */       int $i$f$Layout = 0;
/* 711 */       ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 712 */       int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 713 */       CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/* 714 */       Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*     */       
/* 716 */       Function0 function01 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 717 */       ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 718 */       if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 719 */         .startReusableNode();
/* 720 */       if ($composer.getInserting()) { $composer
/* 721 */           .createNode(function01); } else { $composer
/*     */           
/* 723 */           .useNode(); }
/*     */       
/* 725 */       Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 726 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 727 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */       
/* 729 */       Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 730 */       Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 731 */       if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 732 */         $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 733 */         $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */       } 
/*     */       
/* 736 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */       
/* 738 */       int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-RowKt$Row$1$iv = 0;
/* 739 */       ComposerKt.sourceInformationMarkerStart($composer$iv, -407840262, "C101@5126L9:Row.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; RowScope $this$invoke_u24lambda_u241 = (RowScope)RowScopeInstance.INSTANCE; int $i$a$-Row-MenuKt$MenuSubmenuItem$8$1$1 = 0; composer1.startReplaceGroup(-1343092022); if (bool1)
/* 740 */         if (iconKey1 != null) { composer1.startReplaceGroup(1313874034); IconKt.Icon-FHprtrg(iconKey1, (String)null, (Modifier)null, (Class<?>)null, 0L, new PainterHint[0], composer1, 48, 28); composer1.endReplaceGroup(); } else { composer1.startReplaceGroup(1313973482); BoxKt.Box(SizeKt.size-3ABfNKs((Modifier)Modifier.Companion, menuStyle.getMetrics().getItemMetrics().getIconSize-D9Ej5fM()), composer1, 0); composer1.endReplaceGroup(); }   composer1.endReplaceGroup(); Modifier modifier2 = RowScope.weight$default($this$invoke_u24lambda_u241, (Modifier)Modifier.Companion, 1.0F, false, 2, null); int k = 0, $i$f$Box = 0; ComposerKt.sourceInformationMarkerStart(composer1, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/* 741 */       Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
/* 742 */       boolean propagateMinConstraints$iv = false;
/*     */ 
/*     */       
/* 745 */       MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int m = 0x70 & k << 3;
/* 746 */       int n = 0;
/* 747 */       ComposerKt.sourceInformationMarkerStart(composer1, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 748 */       int i1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
/* 749 */       CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
/* 750 */       Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier2);
/*     */       
/* 752 */       Function0 function02 = ComposeUiNode.Companion.getConstructor(); int i2 = 0x6 | 0x380 & m << 6; int i3 = 0;
/* 753 */       ComposerKt.sourceInformationMarkerStart(composer1, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 754 */       if (!(composer1.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  composer1
/* 755 */         .startReusableNode();
/* 756 */       if (composer1.getInserting()) { composer1
/* 757 */           .createNode(function02); } else { composer1
/*     */           
/* 759 */           .useNode(); }
/*     */       
/* 761 */       Composer composer2 = Updater.constructor-impl(composer1); int i4 = 0;
/* 762 */       Updater.set-impl(composer2, measurePolicy1, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 763 */       Updater.set-impl(composer2, compositionLocalMap1, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */       
/* 765 */       Function2 function21 = ComposeUiNode.Companion.getSetCompositeKeyHash(); int i5 = 0;
/* 766 */       Composer composer3 = composer2; int i6 = 0;
/* 767 */       if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(i1))) {
/* 768 */         composer3.updateRememberedValue(Integer.valueOf(i1));
/* 769 */         composer2.apply(Integer.valueOf(i1), function21);
/*     */       } 
/*     */       
/* 772 */       Updater.set-impl(composer2, modifier4, ComposeUiNode.Companion.getSetModifier());
/*     */       
/* 774 */       int i7 = 0xE & i2 >> 6; Composer composer4 = composer1; int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/* 775 */       ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int i8 = 0x6 | 0x70 & k >> 6; Composer composer5 = composer4; BoxScope $this$invoke_u24lambda_u241_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-MenuKt$MenuSubmenuItem$8$1$1$1 = 0; function2.invoke(composer5, Integer.valueOf(0)); ComposerKt.sourceInformationMarkerEnd(composer4);
/* 776 */       composer1.endNode(); ComposerKt.sourceInformationMarkerEnd(composer1);
/* 777 */       ComposerKt.sourceInformationMarkerEnd(composer1);
/* 778 */       ComposerKt.sourceInformationMarkerEnd(composer1); IconKey iconKey2 = menuStyle.getIcons().getSubmenuChevron(); long l = ((Color)menuItemColors.iconTintFor-VIR8D2g(MenuKt.access$MenuSubmenuItem$lambda$55(mutableState), composer1, 0).getValue()).unbox-impl(); Modifier modifier3 = SizeKt.size-3ABfNKs((Modifier)Modifier.Companion, menuStyle.getMetrics().getItemMetrics().getIconSize-D9Ej5fM()); PainterHint painterHint = StatefulKt.Stateful((InteractiveComponentState)MenuItemState.box-impl(MenuKt.access$MenuSubmenuItem$lambda$55(mutableState))); IconKt.Icon-FHprtrg(iconKey2, (String)null, modifier3, (Class<?>)null, l, painterHint, composer1, 48, 8);
/*     */       ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 780 */       $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 781 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 782 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 783 */       if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*     */     else
/*     */     { $composer.skipToGroupEnd(); }
/*     */   
/*     */   }
/*     */   
/*     */   MenuKt$MenuSubmenuItem$8$1(MenuMetrics $menuMetrics, boolean $canShowIcon, IconKey $iconKey, MenuStyle $style, MenuItemColors $itemColors, Function2<Composer, Integer, Unit> $content, MutableState<MenuItemState> $itemState$delegate) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\MenuKt$MenuSubmenuItem$8$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */